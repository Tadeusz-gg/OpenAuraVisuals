package dev.skidware.visuals.render.gl;

import org.lwjgl.opengl.ARBInstancedArrays;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.opengl.GLCapabilities;

public final class GlCaps {
    private final boolean core33;
    private final boolean divisorArb;
    private final boolean samplers;
    private final boolean timerQuery;
    private final boolean clipControl;
    private final String version;

    private GlCaps(boolean core33, boolean divisorArb, boolean samplers, boolean timerQuery, boolean clipControl, String version) {
        this.core33 = core33;
        this.divisorArb = divisorArb;
        this.samplers = samplers;
        this.timerQuery = timerQuery;
        this.clipControl = clipControl;
        this.version = version;
    }

    public static GlCaps detect() {
        GLCapabilities caps = GL.getCapabilities();
        boolean forceLegacy = Boolean.getBoolean("auravisuals.gl.legacy");
        boolean core33 = caps.OpenGL33 && !forceLegacy;
        boolean divisorArb = !caps.OpenGL33 && caps.GL_ARB_instanced_arrays;
        boolean samplers = core33 || !forceLegacy && caps.GL_ARB_sampler_objects;
        boolean timer = core33 || !forceLegacy && caps.GL_ARB_timer_query;
        boolean clipControl = caps.OpenGL45 || caps.GL_ARB_clip_control;
        String version = GL33C.glGetString(7938);
        return new GlCaps(core33, divisorArb, samplers, timer, clipControl, version == null ? "?" : version);
    }

    public String unsupportedReason() {
        GLCapabilities caps = GL.getCapabilities();
        if (!caps.OpenGL32) {
            return "OpenGL 3.2 core is required (driver reports " + this.version + ")";
        } else {
            return !caps.OpenGL33 && !caps.GL_ARB_instanced_arrays
                ? "instanced vertex attributes are unavailable (OpenGL " + this.version + " without ARB_instanced_arrays)"
                : null;
        }
    }

    public void vertexAttribDivisor(int index, int divisor) {
        if (this.divisorArb) {
            ARBInstancedArrays.glVertexAttribDivisorARB(index, divisor);
        } else {
            GL33C.glVertexAttribDivisor(index, divisor);
        }
    }

    public boolean samplers() {
        return this.samplers;
    }

    public boolean timerQuery() {
        return this.timerQuery;
    }

    public boolean clipControl() {
        return this.clipControl;
    }

    public String describe() {
        return "OpenGL "
            + this.version
            + (this.core33 ? "" : " + ARB extensions" + (this.samplers ? "" : ", no sampler objects") + (this.timerQuery ? "" : ", no GPU timer"));
    }
}
