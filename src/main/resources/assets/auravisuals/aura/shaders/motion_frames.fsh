#version 150 core
// Frame blending: a weighted average of recent frames (layers of one array texture) in gamma-2 light.
// Weights are the exposure seconds each frame contributes (FrameBlendSchedule).
in vec2 v_uv;
uniform sampler2DArray u_history;
uniform float u_layers[12];
uniform float u_weights[12];
uniform int u_count;
uniform float u_invTotal;
out vec4 o_color;

void main() {
    vec3 sum = vec3(0.0);
    for (int i = 0; i < 12; i++) {
        if (i >= u_count) break;
        vec3 c = texture(u_history, vec3(v_uv, u_layers[i])).rgb;
        sum += c * c * u_weights[i];
    }
    o_color = vec4(sqrt(max(sum * u_invTotal, vec3(0.0))), 1.0);
}
