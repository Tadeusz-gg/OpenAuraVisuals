#version 150 core
// Dual Kawase upsample.
in vec2 v_uv;
uniform sampler2D u_source;
uniform vec2 u_halfPixel;
uniform float u_offset;
out vec4 o_color;

void main() {
    vec2 o = u_halfPixel * u_offset;
    vec4 sum = texture(u_source, v_uv + vec2(-o.x * 2.0, 0.0));
    sum += texture(u_source, v_uv + vec2(-o.x, o.y)) * 2.0;
    sum += texture(u_source, v_uv + vec2(0.0, o.y * 2.0));
    sum += texture(u_source, v_uv + vec2(o.x, o.y)) * 2.0;
    sum += texture(u_source, v_uv + vec2(o.x * 2.0, 0.0));
    sum += texture(u_source, v_uv + vec2(o.x, -o.y)) * 2.0;
    sum += texture(u_source, v_uv + vec2(0.0, -o.y * 2.0));
    sum += texture(u_source, v_uv + vec2(-o.x, -o.y)) * 2.0;
    o_color = sum / 12.0;
}
