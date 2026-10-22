#version 150 core
// Dual Kawase downsample (Marius Bjørge, "Bandwidth-Efficient Rendering", SIGGRAPH 2015).
in vec2 v_uv;
uniform sampler2D u_source;
uniform vec2 u_halfPixel;
uniform float u_offset;
out vec4 o_color;

void main() {
    vec2 o = u_halfPixel * u_offset;
    vec4 sum = texture(u_source, v_uv) * 4.0;
    sum += texture(u_source, v_uv - o);
    sum += texture(u_source, v_uv + o);
    sum += texture(u_source, v_uv + vec2(o.x, -o.y));
    sum += texture(u_source, v_uv - vec2(o.x, -o.y));
    o_color = sum / 8.0;
}
