#version 150 core
// Depth-reprojected velocity motion blur. Mechanics of Natural Motion Blur 1.4.5 (ItsPasi, LGPL-3.0),
// reimplemented for Aura Render: every pixel is reprojected into the previous frame from its depth, the
// screen-space motion is split into the camera-turn part (the motion a point at the far plane has) and
// the rest (parallax of the level while the camera moves), and the frame is averaged along it.
in vec2 v_uv;
uniform sampler2D u_scene;     // copy of the image being blurred, sampled NEAREST
uniform sampler2D u_depth;     // Minecraft's depth texture (window-space depth)
uniform mat4 u_reproject;      // current NDC -> previous clip space (prevProj * prevView * move * inverse(proj * view))
uniform vec2 u_resolution;
uniform float u_strength;      // blur length as a multiple of one frame's motion
uniform int u_samples;         // samples per screen width of motion
uniform int u_weighted;        // 0 = box (uniform), 1 = Blackman-windowed sinc in gamma 2.2
uniform int u_mode;            // 0 = parallax only, 1 = camera turn only, 2 = everything (third person / riding)
uniform int u_reversed;        // 1: reversed-Z (greater depth is nearer, far plane at 0)
uniform int u_zeroToOne;       // 1: NDC depth spans [0, 1] (glClipControl ZERO_TO_ONE)
out vec4 o_color;

const float PI = 3.141592653589793;

float nearer(float a, float b) {
    return u_reversed == 1 ? max(a, b) : min(a, b);
}

vec2 previousUv(float depth) {
    float z = u_zeroToOne == 1 ? depth : depth * 2.0 - 1.0;
    vec4 clip = u_reproject * vec4(v_uv * 2.0 - 1.0, z, 1.0);
    return clip.xy / clip.w * 0.5 + 0.5;
}

// At most 40% of the screen per frame: teleports and huge flicks must not smear the whole image.
vec2 clampLength(vec2 v) {
    float lenSq = dot(v, v);
    return lenSq > 0.16 ? v * (0.4 * inversesqrt(lenSq)) : v;
}

// Interleaved gradient noise (Jimenez): per-sample jitter that turns banding into fine grain.
float noise(vec2 p) {
    return fract(52.9829189 * fract(0.06711056 * p.x + 0.00583715 * p.y));
}

float blackmanSinc(float u) {
    float z = 1.89 * u;
    float sinc = abs(z) < 0.0001 ? 1.0 : sin(PI * z) / (PI * z);
    float c = cos(PI * u);
    // 0.42 + 0.5·cos(πu) + 0.08·cos(2πu), with cos(2πu) = 2·cos²(πu) − 1.
    return sinc * (0.34 + 0.5 * c + 0.16 * c * c);
}

void main() {
    ivec2 size = textureSize(u_depth, 0);
    ivec2 hi = size - ivec2(1);
    ivec2 texel = clamp(ivec2(gl_FragCoord.xy), ivec2(0), hi);
    float depth = texelFetch(u_depth, texel, 0).r;

    // Anything closer than ~2.3x the near plane (a shader pack's hand) stays sharp.
    float nearness = u_reversed == 1 ? depth : 1.0 - depth;
    if (nearness > 0.44) {
        o_color = vec4(texture(u_scene, v_uv).rgb, 1.0);
        return;
    }

    // Nearest depth of the cross neighbourhood: silhouettes take the foreground's motion.
    float d = depth;
    d = nearer(d, texelFetch(u_depth, clamp(texel + ivec2( 1,  0), ivec2(0), hi), 0).r);
    d = nearer(d, texelFetch(u_depth, clamp(texel + ivec2(-1,  0), ivec2(0), hi), 0).r);
    d = nearer(d, texelFetch(u_depth, clamp(texel + ivec2( 0,  1), ivec2(0), hi), 0).r);
    d = nearer(d, texelFetch(u_depth, clamp(texel + ivec2( 0, -1), ivec2(0), hi), 0).r);

    vec2 full = v_uv - previousUv(d);
    vec2 velocity = full;
    if (u_mode != 2) {
        // The far plane only moves when the camera turns: project the motion onto that direction.
        vec2 turn = v_uv - previousUv(u_reversed == 1 ? 0.0 : 1.0);
        float turnSq = dot(turn, turn);
        vec2 turnPart = turnSq > 1e-12 ? turn * (clamp(dot(full, turn), 0.0, turnSq) / turnSq) : vec2(0.0);
        velocity = u_mode == 1 ? turnPart : full - turnPart;
    }
    velocity = clampLength(velocity);
    bool weighted = u_weighted == 1;

    // Every tap lands within half a texel of this pixel's centre: NEAREST sampling returns the pixel
    // itself for all of them, so the average is the pixel (exact shortcut, no visual change).
    vec2 reach = abs(velocity * u_resolution) * (u_strength * (weighted ? 3.64 * 0.96 : 1.0));
    if (max(reach.x, reach.y) < 0.999) {
        o_color = vec4(texture(u_scene, v_uv).rgb, 1.0);
        return;
    }

    float speed = length(velocity);
    int base = clamp(int(ceil(speed * float(u_samples))), 4, u_samples);
    int samples = weighted
            ? clamp(int(ceil(float(base) * 1.35)), 6, max(6, int(ceil(float(u_samples) * 1.35))))
            : base;

    vec2 stepUv = u_strength * velocity * (weighted ? 3.64 * 0.96 : 1.0) / float(samples);
    float center = -float(samples) * 0.5;
    vec2 seed = v_uv * u_resolution;
    vec3 sum = vec3(0.0);
    float total = 0.0;

    for (int i = 0; i < samples; i++) {
        float fi = float(i);
        float offset = fi + center + noise(seed + vec2(fi, fi * 1.4));
        vec3 c = texture(u_scene, v_uv + offset * stepUv).rgb;
        if (weighted) {
            float w = blackmanSinc(offset * 2.0 / float(samples));
            sum += pow(max(c, vec3(0.0)), vec3(2.2)) * w;
            total += w;
        } else {
            sum += c * c;
            total += 1.0;
        }
    }

    vec3 color;
    if (total <= 0.0001) {
        color = texture(u_scene, v_uv).rgb;
    } else if (weighted) {
        color = pow(clamp(sum / total, vec3(0.0), vec3(1.0)), vec3(1.0 / 2.2));
    } else {
        color = sqrt(sum / total);
    }
    o_color = vec4(color, 1.0);
}
