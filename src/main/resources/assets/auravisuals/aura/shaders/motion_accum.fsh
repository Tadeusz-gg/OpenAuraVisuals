#version 150 core
// Accumulation blur: the previous output fades by u_factor and either wins where it is brighter (MAX,
// bright trails) or is mixed in gamma-2 light (MIX, even trails). The output feeds the next frame.
in vec2 v_uv;
uniform sampler2D u_current;
uniform sampler2D u_previous;
uniform float u_factor;
uniform int u_max;
out vec4 o_color;

void main() {
    vec3 current = texture(u_current, v_uv).rgb;
    vec3 previous = texture(u_previous, v_uv).rgb;
    vec3 c = u_max == 1
            ? max(current, previous * u_factor)
            : sqrt(mix(current * current, previous * previous, u_factor));
    o_color = vec4(c, 1.0);
}
