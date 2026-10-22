#version 150 core
#include "sdf.glsl"

in vec2 v_local;
in vec2 v_uv;
flat in vec4 v_rect;
flat in vec4 v_radii;
flat in vec4 v_color0;
flat in vec4 v_color1;
flat in vec4 v_paint;
flat in vec4 v_uvRect;
flat in vec4 v_clip;
flat in float v_clipRadius;
flat in float v_additive;
flat in int v_type;

uniform sampler2D u_texture;   // unit 0: glyph atlas / image
uniform sampler2D u_backdrop;  // unit 1: blurred capture of the target
uniform vec2 u_viewport;

out vec4 o_color;

// v_paint for fills: x = gradient kind (0 solid, 1 linear, 2 radial, 3 conic), y = angle/offset,
//                    z = stroke width, w = softness.
vec4 gradient(vec2 p, float conicT) {
    int kind = int(v_paint.x + 0.5);
    if (kind == 0) return v_color0;
    vec2 hs = max(v_rect.zw, vec2(1e-4));
    float t;
    if (kind == 1) {
        vec2 dir = vec2(cos(v_paint.y), sin(v_paint.y));
        float ext = abs(dir.x) * hs.x + abs(dir.y) * hs.y;
        t = dot(p, dir) / ext * 0.5 + 0.5;
    } else if (kind == 2) {
        t = length(p / hs);
    } else {
        t = conicT >= 0.0 ? conicT : fract(atan(p.y, p.x) / TAU + 0.5 + v_paint.y);
    }
    return mix(v_color0, v_color1, clamp(t, 0.0, 1.0));
}

vec4 premul(vec4 c, float a) {
    float alpha = c.a * a;
    return vec4(c.rgb * alpha, alpha);
}

vec4 shadeRoundRect(vec2 p) {
    float d = sdRoundBox(p, v_rect.zw, v_radii);
    float stroke = v_paint.z;
    if (stroke > 0.0) d = abs(d + stroke * 0.5) - stroke * 0.5;
    return premul(gradient(p, -1.0), coverage(d, v_paint.w));
}

vec4 shadeArc(vec2 p) {
    float radius = v_radii.x, thickness = v_radii.y, start = v_radii.z, sweep = v_radii.w;
    float d;
    if (sweep >= TAU - 1e-3) {
        d = abs(length(p) - radius) - thickness * 0.5;
    } else {
        float mid = start + sweep * 0.5;
        float theta = PI * 0.5 - mid;
        float c = cos(theta), s = sin(theta);
        vec2 q = vec2(c * p.x - s * p.y, s * p.x + c * p.y);
        float halfAp = sweep * 0.5;
        d = sdArcY(q, vec2(sin(halfAp), cos(halfAp)), radius, thickness * 0.5);
    }
    float along = mod(atan(p.y, p.x) - start, TAU) / max(sweep, 1e-4);
    return premul(gradient(p, clamp(along, 0.0, 1.0)), coverage(d, v_paint.w));
}

vec4 shadeSegment(vec2 p) {
    float d = sdSegment(p, v_uvRect.xy, v_uvRect.zw) - v_radii.x;
    return premul(gradient(p, -1.0), coverage(d, v_paint.w));
}

vec4 shadeShadow(vec2 p) {
    float value = roundedBoxShadow(v_rect.zw, p, max(v_paint.w, 1e-3), v_radii.x);
    return premul(v_color0, clamp(value, 0.0, 1.0));
}

// v_paint for glyphs: x = weight (edge shift), y = outline width, z = softness.
vec4 shadeGlyph() {
    float sdf = texture(u_texture, v_uv).r;
    float w = max(fwidth(sdf) * 0.7, 1e-3) + v_paint.z;
    float edge = 0.5 - v_paint.x;
    float fill = smoothstep(edge - w, edge + w, sdf);
    if (v_paint.y > 0.0) {
        float outer = smoothstep(edge - v_paint.y - w, edge - v_paint.y + w, sdf);
        float alpha = mix(v_color1.a * outer, v_color0.a, fill);
        vec3 rgb = mix(v_color1.rgb, v_color0.rgb, fill);
        return vec4(rgb * alpha, alpha);
    }
    return premul(v_color0, fill);
}

vec4 shadeImage(vec2 p) {
    vec4 t = texture(u_texture, v_uv) * v_color0;
    float mask = v_radii.x > 0.0 ? coverage(sdRoundBox(p, v_rect.zw, v_radii), 0.0) : 1.0;
    return vec4(t.rgb * t.a, t.a) * mask;
}

// Backdrop/glass: v_color0 = tint (alpha = strength), v_color1.a = overall opacity (fade in/out).
vec4 shadeBackdrop(vec2 p) {
    vec3 bg = texture(u_backdrop, gl_FragCoord.xy / u_viewport).rgb;
    vec3 rgb = mix(bg, v_color0.rgb, v_color0.a);
    return vec4(rgb, 1.0) * coverage(sdRoundBox(p, v_rect.zw, v_radii), 0.0) * v_color1.a;
}

// v_paint for glass: x = refraction (px), y = bezel width (local), z = dispersion, w = specular.
vec4 shadeGlass(vec2 p) {
    vec2 hs = v_rect.zw;
    float d = sdRoundBox(p, hs, v_radii);
    const float e = 0.75;
    vec2 n = vec2(sdRoundBox(p + vec2(e, 0.0), hs, v_radii) - sdRoundBox(p - vec2(e, 0.0), hs, v_radii),
                  sdRoundBox(p + vec2(0.0, e), hs, v_radii) - sdRoundBox(p - vec2(0.0, e), hs, v_radii));
    n = n / max(length(n), 1e-5);

    // Height profile of a rounded bezel: flat in the middle, steep near the rim.
    float bezel = max(v_paint.y, 1e-3);
    float x = clamp(-d / bezel, 0.0, 1.0);
    float slope = 1.0 - sqrt(1.0 - (1.0 - x) * (1.0 - x));
    vec2 outward = vec2(n.x, -n.y);                 // local y-down -> GL y-up
    vec2 shift = outward * v_paint.x * slope;
    float k = v_paint.z * 0.18;
    vec2 base = gl_FragCoord.xy;
    vec3 bg;
    bg.r = texture(u_backdrop, (base - shift * (1.0 + k)) / u_viewport).r;
    bg.g = texture(u_backdrop, (base - shift) / u_viewport).g;
    bg.b = texture(u_backdrop, (base - shift * (1.0 - k)) / u_viewport).b;

    vec3 col = mix(bg, v_color0.rgb, v_color0.a);
    // Glass body: slightly brighter toward the top (thicker light path at the bottom).
    float vertical = clamp((p.y + hs.y) / max(2.0 * hs.y, 1e-4), 0.0, 1.0);
    col += vec3(0.025) * (1.0 - vertical) * v_paint.w;

    // Specular rim, key light from the top-left plus a faint bounce on the opposite side.
    vec2 light = normalize(vec2(-0.55, -0.85));
    float rim = pow(1.0 - x, 2.5);
    float spec = rim * (0.25 + 0.75 * pow(max(dot(n, light), 0.0), 1.5));
    spec += rim * 0.3 * pow(max(dot(n, -light), 0.0), 2.0);
    float hairline = 1.0 - smoothstep(0.0, fwidth(d) * 1.5 + 0.35, abs(d + 0.5));
    col += v_color1.rgb * (spec * 0.55 + hairline * 0.18) * v_paint.w;

    return vec4(clamp(col, 0.0, 1.0), 1.0) * coverage(d, 0.0) * v_color1.a;
}

// ---- sprites: v_radii.x = core size, v_radii.y = halo width, v_paint.x = shape, v_paint.y = phase ----

// Crisp core plus a halo that fades out over `glow` units past the edge (cubic falloff).
vec4 spriteLight(float d, float glow) {
    float core = coverage(d, 0.0);
    float t = clamp(max(d, 0.0) / max(glow, 1e-4), 0.0, 1.0);
    float halo = 1.0 - t;
    halo = halo * halo * halo * 0.85;
    return premul(v_color0, core) + premul(v_color1, halo * (1.0 - core));
}

// Pure light: flat bright centre of radius r, gaussian falloff over `glow` (forced to 0 at the rim),
// so overlapping lights add up to a hot core with a coloured halo instead of a flat white blob.
vec4 spriteGlow(vec2 p, float r, float glow) {
    float x = clamp(max(length(p) - r, 0.0) / max(glow, 1e-4), 0.0, 1.0);
    float i = exp(-x * x * 4.0) * (1.0 - x * x);
    return premul(mix(v_color0, v_color1, x), i);
}

// Swirling ring around radius r: logarithmic spiral filaments in three layers (different arm counts,
// twist and speed), sharpened into thin strands inside a soft band with a faint halo.
float spiral(float ang, float lr, float arms, float twist, float t, float sharp) {
    float f = 0.5 + 0.5 * sin(ang * arms + lr * twist + t);
    return pow(f, sharp);
}

vec4 spritePortal(vec2 p, float r, float glow) {
    float rho = max(length(p), 1e-4);
    float ang = atan(p.y, p.x);
    float lr = log(rho / r);
    float x = (rho - r) / r;
    float t = v_paint.y;
    float strands = 0.55 * spiral(ang, lr, 3.0, 9.0, t * 1.4, 7.0)
                  + 0.35 * spiral(ang, lr, 5.0, -13.0, -t * 2.1 + 1.7, 9.0)
                  + 0.25 * spiral(ang, lr, 8.0, 19.0, t * 3.0 + 4.1, 12.0);
    float band = exp(-(x * x) / 0.032);
    float halo = exp(-abs(rho - r) / max(glow, 1e-4) * 2.6) * 0.12;
    float i = (band * (0.08 + 0.8 * strands) + halo) * 0.9;
    vec4 c = mix(v_color1, v_color0, clamp(strands * band * 1.6, 0.0, 1.0));
    return premul(c, clamp(i, 0.0, 1.0));
}

// Point light: a hot pinpoint plus an inverse-square halo that reaches zero at the quad's rim.
vec4 spriteFirefly(vec2 p, float r, float glow) {
    float d = length(p);
    float core = exp(-(d * d) / max(r * r * 0.3, 1e-6));
    float x = d / max(r + glow, 1e-4);
    float halo = max((1.0 / (1.0 + 18.0 * x * x) - 0.0526316) / 0.9473684, 0.0);
    return premul(v_color0, core) + premul(v_color1, halo * 0.8 * (1.0 - core));
}

// Stroke half width of the outline glyphs: proportional, never thinner than ~1 px on screen.
float stroke(float k, float r, vec2 p) {
    return max(k * r, length(fwidth(p)) * 0.6);
}

vec4 shadeSprite(vec2 p) {
    int shape = int(v_paint.x + 0.5);
    float r = max(v_radii.x, 1e-4), glow = v_radii.y;
    vec2 q = vec2(p.x, -p.y);                       // SDFs below are y-up
    vec4 c;
    if (shape == SPRITE_GLOW) c = spriteGlow(p, v_radii.x, glow);
    else if (shape == SPRITE_DOT) c = spriteLight(length(p) - r, glow);
    else if (shape == SPRITE_STAR) c = spriteLight(sdStar5(q, r * 0.84, 0.5) - r * 0.16, glow);
    else if (shape == SPRITE_HEART) {
        float k = r / 0.62;
        c = spriteLight(sdHeart(q / k + vec2(0.0, 0.52)) * k, glow);
    }
    else if (shape == SPRITE_RING) c = spriteLight(abs(length(p) - r) - stroke(0.055, r, p), glow);
    else if (shape == SPRITE_SPARKLE) {
        vec4 star = spriteLight(sdStarN(q, r, 4.0, 2.25), glow);
        c = star + spriteGlow(p, 0.0, r * 0.45) * 0.6;
    }
    else if (shape == SPRITE_PORTAL) c = spritePortal(p, r, glow);
    else if (shape == SPRITE_DIAMOND) c = spriteLight(sdRhombus(p, vec2(r * 0.62, r)), glow);
    else if (shape == SPRITE_SNOWFLAKE) c = spriteLight(sdSnowflake(q, r, stroke(0.075, r, p)), glow);
    else if (shape == SPRITE_DOLLAR) c = spriteLight(sdDollar(q, r, stroke(0.1, r, p)), glow);
    else if (shape == SPRITE_CROWN) c = spriteLight(sdCrown(q, r), glow);
    else if (shape == SPRITE_FIREFLY) c = spriteFirefly(p, r, glow);
    else if (shape == SPRITE_CROSS) {
        float a = r * 0.72;
        c = spriteLight(min(sdSegment(q, vec2(-a, 0.0), vec2(a, 0.0)), sdSegment(q, vec2(0.0, -a), vec2(0.0, a))) - stroke(0.14, r, p), glow);
    }
    else if (shape == SPRITE_TRIANGLE) c = spriteLight(abs(sdTriangleEq(q, r * 0.74)) - stroke(0.09, r, p), glow);
    else if (shape == SPRITE_SQUARE) c = spriteLight(abs(sdRoundBox(q, vec2(r * 0.62), vec4(r * 0.14))) - stroke(0.09, r, p), glow);
    else if (shape == SPRITE_CHEVRON) {
        c = spriteLight(sdSegment(vec2(abs(q.x), q.y), vec2(0.0, r * 0.32), vec2(r * 0.6, -r * 0.28)) - stroke(0.14, r, p), glow);
    }
    else if (shape == SPRITE_ARROW) {
        float shaft = sdSegment(q, vec2(0.0, -r * 0.78), vec2(0.0, r * 0.7));
        float head = sdSegment(vec2(abs(q.x), q.y), vec2(0.0, r * 0.72), vec2(r * 0.42, r * 0.3));
        c = spriteLight(min(shaft, head) - stroke(0.12, r, p), glow);
    }
    else if (shape == SPRITE_ZIGZAG) {
        vec2 a = vec2(0.4, 0.22) * r;
        float d = min(sdSegment(q, vec2(-2.0 * a.x, -a.y), vec2(-a.x, a.y)), sdSegment(q, vec2(-a.x, a.y), vec2(0.0, -a.y)));
        d = min(d, min(sdSegment(q, vec2(0.0, -a.y), vec2(a.x, a.y)), sdSegment(q, vec2(a.x, a.y), vec2(2.0 * a.x, -a.y))));
        c = spriteLight(d - stroke(0.11, r, p), glow);
    }
    else if (shape == SPRITE_FLOWER) c = spriteLight(sdFlower(q, r), glow);
    else if (shape == SPRITE_INFINITY) {
        c = spriteLight(abs(length(vec2(abs(q.x), q.y) - vec2(r * 0.42, 0.0)) - r * 0.4) - stroke(0.1, r, p), glow);
    }
    else if (shape == SPRITE_LINE) c = spriteLight(sdSegment(q, vec2(-r * 0.7, 0.0), vec2(r * 0.7, 0.0)) - stroke(0.15, r, p), glow);
    else if (shape == SPRITE_SPIRAL) c = spriteLight(sdSpiral(q, r * 0.92, stroke(0.08, r, p)), glow);
    else if (shape == SPRITE_CORNER) c = spriteLight(sdCorner(q, r, stroke(0.11, r, p)), glow);
    else if (shape == SPRITE_BLADE) c = spriteLight(sdMoon(q, r * 0.25, r * 0.6, r * 0.55), glow);
    else if (shape == SPRITE_HEXAGON) c = spriteLight(abs(sdHexagon(q, r * 0.9)) - stroke(0.055, r, p), glow);
    else if (shape == SPRITE_SCIFI) c = spriteLight(sdScifi(q, r), glow);
    else c = spriteLight(abs(length(p) - r * 0.88) - stroke(0.13, r, p), glow);
    // Nothing may reach the square edge of the quad.
    float ext = v_rect.z;
    return c * (1.0 - smoothstep(ext * 0.82, ext, length(p)));
}

// ---- free quads: v_uv = (u across, v along). Profile across u: v_paint.x = 0 flat, 1 ribbon (bright
// midline), 2 three alpha stops (v_paint.y at u = 0, v_paint.z at u = 0.5, v_paint.w at u = 1) ----
vec4 shadeQuad(vec2 uv) {
    vec4 c = mix(v_color0, v_color1, clamp(uv.y, 0.0, 1.0));
    float a = 1.0;
    if (v_paint.x > 1.5) {
        float u = clamp(uv.x, 0.0, 1.0);
        a = u < 0.5 ? mix(v_paint.y, v_paint.z, smoothstep(0.0, 1.0, u * 2.0))
                    : mix(v_paint.z, v_paint.w, smoothstep(0.0, 1.0, u * 2.0 - 1.0));
    } else if (v_paint.x > 0.5) {
        float x = 1.0 - abs(uv.x * 2.0 - 1.0);
        a = x * x * (3.0 - 2.0 * x);
    }
    return premul(c, a);
}

void main() {
    vec2 p = v_local;
    vec4 color;
    if (v_type == TYPE_RRECT) color = shadeRoundRect(p);
    else if (v_type == TYPE_SHADOW) color = shadeShadow(p);
    else if (v_type == TYPE_ARC) color = shadeArc(p);
    else if (v_type == TYPE_SEGMENT) color = shadeSegment(p);
    else if (v_type == TYPE_GLYPH) color = shadeGlyph();
    else if (v_type == TYPE_IMAGE) color = shadeImage(p);
    else if (v_type == TYPE_BACKDROP) color = shadeBackdrop(p);
    else if (v_type == TYPE_GLASS) color = shadeGlass(p);
    else if (v_type == TYPE_SPRITE) color = shadeSprite(p);
    else color = shadeQuad(v_uv);

    vec2 fp = vec2(gl_FragCoord.x, u_viewport.y - gl_FragCoord.y);
    vec2 clipCenter = (v_clip.xy + v_clip.zw) * 0.5;
    vec2 clipHalf = max((v_clip.zw - v_clip.xy) * 0.5, vec2(0.0));
    float clipDist = sdRoundBox(fp - clipCenter, clipHalf, vec4(v_clipRadius));
    color *= clamp(0.5 - clipDist, 0.0, 1.0);
    // Premultiplied blending (ONE, ONE_MINUS_SRC_ALPHA): zero alpha turns a shape into pure added light.
    color.a *= 1.0 - v_additive;

    if (max(max(color.r, color.g), max(color.b, color.a)) <= 0.0) discard;
    // Per-copy runtime watermark: a sub-LSB bias (|AURA_WM*| < 0.5/255, scaled by coverage) that is
    // invisible in play but, across the many fragments Aura draws, identifies the session a screenshot
    // came from. Keyed by copyId at compile time; AURA_WM* default to 0.0 (see GlBackend).
    color.rgb += color.a * vec3(AURA_WM0, AURA_WM1, AURA_WM2);
    o_color = color;
}
