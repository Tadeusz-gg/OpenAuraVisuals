// Shared signed-distance helpers. Local space is y-down (matches the canvas).
const float PI = 3.14159265359;
const float TAU = 6.28318530718;

// Rounded box with per-corner radii r = (top-left, top-right, bottom-right, bottom-left).
float sdRoundBox(vec2 p, vec2 b, vec4 r) {
    float rad = p.x > 0.0 ? (p.y > 0.0 ? r.z : r.y) : (p.y > 0.0 ? r.w : r.x);
    vec2 q = abs(p) - b + rad;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - rad;
}

float sdSegment(vec2 p, vec2 a, vec2 b) {
    vec2 pa = p - a, ba = b - a;
    float h = clamp(dot(pa, ba) / max(dot(ba, ba), 1e-8), 0.0, 1.0);
    return length(pa - ba * h);
}

// Inigo Quilez' arc: symmetric around +y, sc = (sin, cos) of the half aperture, round caps.
float sdArcY(vec2 p, vec2 sc, float ra, float rb) {
    p.x = abs(p.x);
    return ((sc.y * p.x > sc.x * p.y) ? length(p - sc * ra) : abs(length(p) - ra)) - rb;
}

// Anti-aliased coverage of a distance (negative inside); `soft` widens the transition.
float coverage(float d, float soft) {
    float w = max(fwidth(d), 1e-4) + soft;
    return clamp(0.5 - d / w, 0.0, 1.0);
}

// Evan Wallace's closed-form gaussian shadow of a rounded rectangle (4-tap integration along y).
float gaussian(float x, float sigma) {
    return exp(-(x * x) / (2.0 * sigma * sigma)) / (sqrt(2.0 * PI) * sigma);
}

vec2 erf2(vec2 x) {
    vec2 s = sign(x), a = abs(x);
    x = 1.0 + (0.278393 + (0.230389 + 0.078108 * (a * a)) * a) * a;
    x *= x;
    return s - s / (x * x);
}

float roundedBoxShadowX(float x, float y, float sigma, float corner, vec2 halfSize) {
    float delta = min(halfSize.y - corner - abs(y), 0.0);
    float curved = halfSize.x - corner + sqrt(max(0.0, corner * corner - delta * delta));
    vec2 integral = 0.5 + 0.5 * erf2((x + vec2(-curved, curved)) * (sqrt(0.5) / sigma));
    return integral.y - integral.x;
}

float roundedBoxShadow(vec2 halfSize, vec2 point, float sigma, float corner) {
    float low = point.y - halfSize.y;
    float high = point.y + halfSize.y;
    float start = clamp(-3.0 * sigma, low, high);
    float end = clamp(3.0 * sigma, low, high);
    float step = (end - start) / 4.0;
    float y = start + step * 0.5;
    float value = 0.0;
    for (int i = 0; i < 4; i++) {
        value += roundedBoxShadowX(point.x, point.y - y, sigma, corner, halfSize) * gaussian(y, sigma) * step;
        y += step;
    }
    return value;
}

float dot2(vec2 v) {
    return dot(v, v);
}

// Inigo Quilez' five-point star, one point toward +y (y-up). rf = inner/outer radius ratio.
float sdStar5(vec2 p, float r, float rf) {
    const vec2 k1 = vec2(0.809016994375, -0.587785252292);
    const vec2 k2 = vec2(-k1.x, k1.y);
    p.x = abs(p.x);
    p -= 2.0 * max(dot(k1, p), 0.0) * k1;
    p -= 2.0 * max(dot(k2, p), 0.0) * k2;
    p.x = abs(p.x);
    p.y -= r;
    vec2 ba = rf * vec2(-k1.y, k1.x) - vec2(0.0, 1.0);
    float h = clamp(dot(p, ba) / dot(ba, ba), 0.0, r);
    return length(p - ba * h) * sign(p.y * ba.x - p.x * ba.y);
}

// Inigo Quilez' regular star with n points; m in [2, n] sets how deep the spikes cut (2 = thinnest).
float sdStarN(vec2 p, float r, float n, float m) {
    float an = PI / n;
    float en = PI / m;
    vec2 acs = vec2(cos(an), sin(an));
    vec2 ecs = vec2(cos(en), sin(en));
    float bn = mod(atan(p.x, p.y), 2.0 * an) - an;
    p = length(p) * vec2(cos(bn), abs(sin(bn)));
    p -= r * acs;
    p += ecs * clamp(-dot(p, ecs), 0.0, r * acs.y / ecs.y);
    return length(p) * sign(p.x);
}

// Inigo Quilez' heart: tip at the origin, lobes reaching y ≈ 1.1 (y-up), half width ≈ 0.6.
float sdHeart(vec2 p) {
    p.x = abs(p.x);
    if (p.y + p.x > 1.0) return sqrt(dot2(p - vec2(0.25, 0.75))) - sqrt(2.0) / 4.0;
    return sqrt(min(dot2(p - vec2(0.0, 1.0)), dot2(p - 0.5 * max(p.x + p.y, 0.0)))) * sign(p.x - p.y);
}

// Rhombus with half diagonals b (Inigo Quilez).
float sdRhombus(vec2 p, vec2 b) {
    p = abs(p);
    vec2 q = b - 2.0 * p;
    float h = clamp((q.x * b.x - q.y * b.y) / dot(b, b), -1.0, 1.0);
    float d = length(p - 0.5 * b * vec2(1.0 - h, 1.0 + h));
    return d * sign(p.x * b.y + p.y * b.x - b.x * b.y);
}

// Counter-clockwise rotation in a y-up frame.
vec2 rot(vec2 p, float a) {
    float c = cos(a), s = sin(a);
    return vec2(c * p.x - s * p.y, s * p.x + c * p.y);
}

// Folds p into one sector of an n-fold rotational symmetry, the sector centred on +y (y-up). With
// `mirror` the sector's halves fold onto each other too (x >= 0): dihedral symmetry.
vec2 foldSector(vec2 p, float n, bool mirror) {
    float sector = TAU / n;
    float a = mod(atan(p.x, p.y) + sector * 0.5, sector) - sector * 0.5;
    if (mirror) a = abs(a);
    return length(p) * vec2(sin(a), cos(a));
}

// Regular hexagon with inradius r, flat top and bottom (Inigo Quilez).
float sdHexagon(vec2 p, float r) {
    const vec3 k = vec3(-0.866025404, 0.5, 0.577350269);
    p = abs(p);
    p -= 2.0 * min(dot(k.xy, p), 0.0) * k.xy;
    p -= vec2(clamp(p.x, -k.z * r, k.z * r), r);
    return length(p) * sign(p.y);
}

// Equilateral triangle centred on its centroid, one corner toward +y, half side r (Inigo Quilez).
float sdTriangleEq(vec2 p, float r) {
    const float k = 1.732050808;
    p.x = abs(p.x) - r;
    p.y = p.y + r / k;
    if (p.x + k * p.y > 0.0) p = vec2(p.x - k * p.y, -k * p.x - p.y) / 2.0;
    p.x -= clamp(p.x, -2.0 * r, 0.0);
    return -length(p) * sign(p.y);
}

// Crescent: disc ra at the origin minus disc rb at (d, 0), opening toward +x (Inigo Quilez).
float sdMoon(vec2 p, float d, float ra, float rb) {
    p.y = abs(p.y);
    float a = (ra * ra - rb * rb + d * d) / (2.0 * d);
    float b = sqrt(max(ra * ra - a * a, 0.0));
    if (d * (p.x * b - p.y * a) > d * d * max(b - p.y, 0.0)) return length(p - vec2(a, b));
    return max(length(p) - ra, -(length(p - vec2(d, 0.0)) - rb));
}

// Crown silhouette of radius ~r (y-up): three points with jewels on a band split off by a groove.
float sdCrown(vec2 p, float r) {
    p /= r;
    vec2 v[7] = vec2[7](vec2(-0.74, -0.42), vec2(-0.74, 0.36), vec2(-0.37, 0.02), vec2(0.0, 0.5),
                        vec2(0.37, 0.02), vec2(0.74, 0.36), vec2(0.74, -0.42));
    float d = dot(p - v[0], p - v[0]);
    float s = 1.0;
    int j = 6;
    for (int i = 0; i < 7; i++) {
        vec2 e = v[j] - v[i];
        vec2 w = p - v[i];
        vec2 b = w - e * clamp(dot(w, e) / dot(e, e), 0.0, 1.0);
        d = min(d, dot(b, b));
        bvec3 c = bvec3(p.y >= v[i].y, p.y < v[j].y, e.x * w.y > e.y * w.x);
        if (all(c) || all(not(c))) s = -s;
        j = i;
    }
    float body = max(s * sqrt(d), -(abs(p.y + 0.22) - 0.035));
    float jewels = min(length(p - vec2(0.0, 0.6)), length(vec2(abs(p.x), p.y) - vec2(0.74, 0.46))) - 0.1;
    return min(body, jewels) * r;
}

// Six arms with two side branches each around a small hexagon, radius ~r, stroke half width w.
float sdSnowflake(vec2 p, float r, float w) {
    vec2 q = foldSector(p, 6.0, true);
    float d = sdSegment(q, vec2(0.0), vec2(0.0, r * 0.94));
    d = min(d, sdSegment(q, vec2(0.0, r * 0.5), vec2(r * 0.277, r * 0.66)));
    d = min(d, sdSegment(q, vec2(0.0, r * 0.26), vec2(r * 0.156, r * 0.35)));
    d = min(d, sdSegment(q, vec2(0.0, r * 0.19), vec2(r * 0.082, r * 0.142)));
    return d - w;
}

// Dollar sign: an S of two bowls (the lower one the upper turned half way round) crossed by a bar.
float sdDollar(vec2 p, float r, float w) {
    float h = r * 0.36;
    const vec2 sc = vec2(0.866025404, -0.5);         // half aperture 120°: bowl from 30° round to 270°
    const float turn = -1.047197551;                  // the bowl's middle (150°) onto +y
    float upper = sdArcY(rot(p - vec2(0.0, h), turn), sc, h, w);
    float lower = sdArcY(rot(-p - vec2(0.0, h), turn), sc, h, w);
    float bar = sdSegment(p, vec2(0.0, -r * 0.9), vec2(0.0, r * 0.9)) - w;
    return min(min(upper, lower), bar);
}

// Five overlapping round petals around a small hole.
float sdFlower(vec2 p, float r) {
    vec2 q = foldSector(p, 5.0, true);
    float d = min(length(q - vec2(0.0, r * 0.5)) - r * 0.36, length(p) - r * 0.32);
    return max(d, -(length(p) - r * 0.13));
}

// Two-turn Archimedean spiral from the centre out to (r, 0); distance measured radially (thin strokes).
float sdSpiral(vec2 p, float r, float w) {
    const float TURNS = 2.0;
    float b = r / (TAU * TURNS);
    float rho = length(p);
    float phi = atan(p.y, p.x);
    if (phi < 0.0) phi += TAU;
    float k = clamp(floor((rho / b - phi) / TAU + 0.5), 0.0, TURNS - 1.0);
    float d = abs(rho - b * (phi + TAU * k));
    d = min(d, abs(rho - b * (phi + TAU * clamp(k - 1.0, 0.0, TURNS - 1.0))));
    d = min(d, abs(rho - b * (phi + TAU * clamp(k + 1.0, 0.0, TURNS - 1.0))));
    d = min(d, length(p - vec2(r, 0.0)));
    return d - w;
}

// Rounded L bracket: a top leg and a right leg joined by a quarter arc, corner toward +x +y.
float sdCorner(vec2 p, float r, float w) {
    float c = r * 0.4, e = r * 0.55;
    float d = min(sdSegment(p, vec2(-e, e), vec2(e - c, e)), sdSegment(p, vec2(e, e - c), vec2(e, -e)));
    vec2 a = p - vec2(e - c);
    if (a.x >= 0.0 && a.y >= 0.0) d = min(d, abs(length(a) - c));
    return d - w;
}

// Sci-fi reticle: four thick arcs on the rim, a thin inner ring, 24 tick dots between them.
float sdScifi(vec2 p, float r) {
    const vec2 sc = vec2(0.587785252, 0.809016994);  // half aperture 36°
    float arcs = sdArcY(foldSector(p, 4.0, true), sc, r * 0.86, r * 0.07);
    float inner = abs(length(p) - r * 0.64) - r * 0.022;
    float ticks = length(foldSector(p, 24.0, false) - vec2(0.0, r * 0.75)) - r * 0.03;
    return min(arcs, min(inner, ticks));
}

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}
