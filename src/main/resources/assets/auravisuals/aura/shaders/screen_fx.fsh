#version 150 core
// Fullscreen grading pass applied to the world image before the GUI is drawn.
in vec2 v_uv;
uniform sampler2D u_scene;
uniform vec2 u_resolution;
uniform vec4 u_vignette;        // rgb, intensity
uniform vec2 u_vignetteShape;   // inner radius, outer radius (aspect-corrected)
uniform float u_aberration;     // pixels at the screen edge
uniform float u_saturation;     // 1 = unchanged
uniform vec4 u_flash;           // rgb, amount
uniform float u_time;
uniform int u_displayGrade;
uniform vec3 u_displayControls; // additive brightness, saturation factor, contrast factor
// Color grade; the model and a CPU twin of grade() live in ColorGrade.java.
uniform int u_grade;            // 0 = off
uniform vec4 u_gradeTone;       // brightness gamma, contrast exponent, contrast pivot, max chroma gain
uniform vec3 u_gradeColor;      // saturation·cos(hue), saturation·sin(hue), gamut knee
uniform sampler2D u_gamut;      // SrgbGamut: max OKLab chroma, hue across (wraps), lightness down
out vec4 o_color;

const float PI = 3.14159265358979;

// OKLab (Björn Ottosson). GLSL matrices are column-major: every line below is one column.
const mat3 RGB_TO_LMS = mat3(
    0.4122214708, 0.2119034982, 0.0883024619,
    0.5363325363, 0.6806995451, 0.2817188376,
    0.0514459929, 0.1073969566, 0.6299787005);
const mat3 LMS_TO_LAB = mat3(
    0.2104542553, 1.9779984951, 0.0259040371,
    0.7936177850, -2.4285922050, 0.7827717662,
    -0.0040720468, 0.4505937099, -0.8086757660);
const mat3 LAB_TO_LMS = mat3(
    1.0, 1.0, 1.0,
    0.3963377774, -0.1055613458, -0.0894841775,
    0.2158037573, -0.0638541728, -1.2914855480);
const mat3 LMS_TO_RGB = mat3(
    4.0767416621, -1.2684380046, -0.0041960863,
    -3.3077115913, 2.6097574011, -0.7034186147,
    0.2309699292, -0.3413193965, 1.7076147010);

vec3 decodeSrgb(vec3 c) {
    return mix(c / 12.92, pow((c + 0.055) / 1.055, vec3(2.4)), step(0.04045, c));
}

vec3 encodeSrgb(vec3 c) {
    c = clamp(c, 0.0, 1.0);
    return mix(c * 12.92, 1.055 * pow(c, vec3(1.0 / 2.4)) - 0.055, step(0.0031308, c));
}

// Brightness (gamma), then contrast (S-curve around the pivot); 0 and 1 stay fixed.
float tone(float x) {
    x = pow(x, u_gradeTone.x);
    float p = u_gradeTone.z;
    return x < p ? p * pow(x / p, u_gradeTone.y) : 1.0 - (1.0 - p) * pow((1.0 - x) / (1.0 - p), u_gradeTone.y);
}

// Largest chroma sRGB holds at this lightness and hue: bilinear in the table, texel centres exact.
float maxChroma(float lightness, vec2 ab) {
    vec2 size = vec2(textureSize(u_gamut, 0));
    float hue = atan(ab.y, ab.x);
    return texture(u_gamut, vec2(hue / (2.0 * PI) + 0.5 + 0.5 / size.x, (lightness * (size.y - 1.0) + 0.5) / size.y)).r;
}

// Chroma factor that keeps the graded color inside sRGB: past the knee it rolls off toward the boundary
// at constant lightness and hue. A color that already sat closer to the boundary keeps that as its knee.
float gamutScale(float lightness, vec2 ab, float toned, vec2 graded) {
    float chroma = length(graded);
    if (chroma < 1e-6) return 1.0;
    float limit = maxChroma(toned, graded);
    if (limit <= 1e-6) return 0.0;
    float reach = chroma / limit;
    float knee = u_gradeColor.z;
    if (reach <= knee) return 1.0;
    float before = length(ab);
    if (before > 1e-6) knee = max(knee, before / max(maxChroma(lightness, ab), 1e-6));
    if (reach <= knee) return 1.0;
    if (knee >= 1.0) return knee / reach;
    float room = 1.0 - knee;
    return (1.0 - room * exp((knee - reach) / room)) / reach;
}

vec3 grade(vec3 c) {
    vec3 lab = LMS_TO_LAB * pow(RGB_TO_LMS * decodeSrgb(c), vec3(1.0 / 3.0));
    float lightness = clamp(lab.x, 0.0, 1.0);
    float toned = tone(lightness);
    // Chroma follows lightness (an exposure change of the pixel), then the hue turn and saturation.
    float gain = min(toned / max(lightness, 1e-5), u_gradeTone.w);
    vec2 graded = mat2(u_gradeColor.x, u_gradeColor.y, -u_gradeColor.y, u_gradeColor.x) * lab.yz * gain;
    graded *= gamutScale(lightness, lab.yz, toned, graded);
    vec3 lms = LAB_TO_LMS * vec3(toned, graded);
    return encodeSrgb(LMS_TO_RGB * (lms * lms * lms));
}

// Direct display RGB controls: no gamut compression or tone curve softening the user's settings.
vec3 displayGrade(vec3 c) {
    float grey = dot(c, vec3(0.2126, 0.7152, 0.0722));
    c = mix(vec3(grey), c, u_displayControls.y);
    return clamp((c - 0.5) * u_displayControls.z + 0.5 + u_displayControls.x, 0.0, 1.0);
}

void main() {
    vec2 uv = v_uv;
    vec2 centered = uv - 0.5;
    vec2 shift = centered * (u_aberration / u_resolution.x) * 2.0;
    vec3 c;
    c.r = texture(u_scene, uv + shift).r;
    c.g = texture(u_scene, uv).g;
    c.b = texture(u_scene, uv - shift).b;

    if (u_displayGrade != 0) c = displayGrade(c);
    if (u_grade != 0) c = grade(c);

    float luma = dot(c, vec3(0.2126, 0.7152, 0.0722));
    c = mix(vec3(luma), c, u_saturation);

    float aspect = u_resolution.x / max(u_resolution.y, 1.0);
    float dist = length(centered * vec2(aspect, 1.0));
    float vig = clamp(smoothstep(u_vignetteShape.x, u_vignetteShape.y, dist) * u_vignette.a, 0.0, 1.0);
    // Darken first, then tint: edges sink into the vignette color instead of washing out bright skies.
    c *= 1.0 - vig * 0.8;
    c = mix(c, u_vignette.rgb, vig * 0.45);

    c = mix(c, u_flash.rgb, clamp(u_flash.a, 0.0, 1.0));
    // Sub-LSB dither (interleaved gradient noise): the pass re-quantizes the world to 8 bits, and a
    // stretched or flattened gradient must not band. Exact 8-bit values stay exact.
    float noise = fract(52.9829189 * fract(dot(gl_FragCoord.xy, vec2(0.06711056, 0.00583715))));
    o_color = vec4(c + (noise - 0.5) * (0.998 / 255.0), 1.0);
}
