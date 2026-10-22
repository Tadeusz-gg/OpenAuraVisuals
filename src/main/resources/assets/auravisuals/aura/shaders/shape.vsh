#version 150 core
// One instance = one shape. Attribute layout mirrors DrawList (see DrawList.java); locations 0..12 are
// bound in this order by GlBackend (GLSL 1.50 has no layout qualifiers, MC <=1.21.4 runs on GL 3.2).
in vec4 a_rect;    // center.xy, halfSize.xy (local units) | quad: corners A, B
in vec4 a_radii;   // corner radii | arc params | segment half thickness | quad: corners C, D
in vec4 a_xform;   // m00, m01, m10, m11
in vec4 a_trans;   // tx, ty, type, clipRadius
in vec4 a_color0;
in vec4 a_color1;
in vec4 a_paint;
in vec4 a_uv;      // texture rect | segment endpoints | quad: corner depths A, B, C, D
in vec4 a_clip;
in vec4 a_ext;     // depth at center, depth gradient per local unit, additive
in vec4 a_plane0;  // perspective plane, pixels -> clip: a_plane0 * px + a_plane1 * py + a_plane2
in vec4 a_plane1;  // (all zero = flat shape)
in vec4 a_plane2;

uniform vec2 u_viewport;

out vec2 v_local;
out vec2 v_uv;
flat out vec4 v_rect;
flat out vec4 v_radii;
flat out vec4 v_color0;
flat out vec4 v_color1;
flat out vec4 v_paint;
flat out vec4 v_uvRect;
flat out vec4 v_clip;
flat out float v_clipRadius;
flat out float v_additive;
flat out int v_type;

vec4 toClip(vec2 px, float z) {
    return vec4(px.x / u_viewport.x * 2.0 - 1.0, 1.0 - px.y / u_viewport.y * 2.0, z, 1.0);
}

// A real clip position (w != 1): the GPU clips at the near plane and interpolates v_local/v_uv with
// perspective, so a disc lying on the ground stays exact however close the eye gets.
vec4 onPlane(mat3x4 plane, vec2 px) {
    return plane * vec3(px, 1.0);
}

// Screen pixels per local unit at the shape centre on a perspective plane (AA padding only).
float planeScale(mat3x4 plane, mat2 m, vec2 center) {
    vec4 c = onPlane(plane, center);
    if (c.w < 1e-4) return 1e4;
    vec4 dx = plane * vec3(m[0], 0.0), dy = plane * vec3(m[1], 0.0);
    vec2 jx = (dx.xy * c.w - c.xy * dx.w) / (c.w * c.w) * 0.5 * u_viewport;
    vec2 jy = (dy.xy * c.w - c.xy * dy.w) / (c.w * c.w) * 0.5 * u_viewport;
    return max(sqrt(abs(jx.x * jy.y - jx.y * jy.x)), 1e-4);
}

void main() {
    int type = int(a_trans.z + 0.5);
    vec2 corner = vec2(float(gl_VertexID & 1), float((gl_VertexID >> 1) & 1));
    mat2 m = mat2(a_xform.x, a_xform.z, a_xform.y, a_xform.w);
    mat3x4 plane = mat3x4(a_plane0, a_plane1, a_plane2);
    bool planar = a_plane0.w != 0.0 || a_plane1.w != 0.0 || a_plane2.w != 0.0;

    v_rect = a_rect;
    v_radii = a_radii;
    v_color0 = a_color0;
    v_color1 = a_color1;
    v_paint = a_paint;
    v_uvRect = a_uv;
    v_clip = a_clip;
    v_clipRadius = a_trans.w;
    v_additive = a_ext.w;
    v_type = type;

    if (type == TYPE_QUAD) {
        // Corners in strip order A, B, C, D; the fragment stage sees (u, v) across / along the quad.
        int i = gl_VertexID & 3;
        vec2 p = i == 0 ? a_rect.xy : i == 1 ? a_rect.zw : i == 2 ? a_radii.xy : a_radii.zw;
        float z = i == 0 ? a_uv.x : i == 1 ? a_uv.y : i == 2 ? a_uv.z : a_uv.w;
        vec2 px = m * p + a_trans.xy;
        gl_Position = planar ? onPlane(plane, px) : toClip(px, z);
        v_local = corner;
        v_uv = corner;
        return;
    }

    float scale = planar ? planeScale(plane, m, m * a_rect.xy + a_trans.xy) : max(sqrt(abs(determinant(m))), 1e-4);
    float pad;
    if (type == TYPE_SHADOW) pad = a_paint.w * 3.0 + 1.0 / scale;
    else if (type == TYPE_GLYPH || type == TYPE_IMAGE) pad = 0.0;
    else if (type == TYPE_BACKDROP || type == TYPE_GLASS || type == TYPE_SPRITE) pad = 1.5 / scale;
    else pad = 1.5 / scale + a_paint.w;

    vec2 halfSize = a_rect.zw + pad;
    vec2 local = (corner * 2.0 - 1.0) * halfSize;
    vec2 px = m * (a_rect.xy + local) + a_trans.xy;
    gl_Position = planar ? onPlane(plane, px) : toClip(px, a_ext.x + dot(a_ext.yz, local));

    v_local = local;
    v_uv = mix(a_uv.xy, a_uv.zw, corner);
}
