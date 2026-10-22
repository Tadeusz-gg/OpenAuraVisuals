package dev.skidware.visuals.render.gl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.system.MemoryStack;

public final class GlState {
    public static final int UNITS = 3;
    private int program;
    private int vertexArray;
    private int arrayBuffer;
    private int pixelUnpackBuffer;
    private int pixelPackBuffer;
    private int activeTexture;
    private final int[] textures = new int[3];
    private final int[] arrayTextures = new int[3];
    private final int[] samplers = new int[3];
    private int drawFramebuffer;
    private int readFramebuffer;
    private int renderbuffer;
    private final int[] viewport = new int[4];
    private final int[] scissorBox = new int[4];
    private boolean blend;
    private boolean depthTest;
    private boolean cullFace;
    private boolean scissorTest;
    private boolean stencilTest;
    private boolean polygonOffsetFill;
    private boolean framebufferSrgb;
    private int blendSrcRgb;
    private int blendDstRgb;
    private int blendSrcAlpha;
    private int blendDstAlpha;
    private int blendEqRgb;
    private int blendEqAlpha;
    private boolean depthMask;
    private int depthFunc;
    private final boolean[] colorMask = new boolean[4];
    private int unpackAlignment;
    private int unpackRowLength;
    private int unpackSkipPixels;
    private int unpackSkipRows;
    private int packAlignment;
    private final boolean samplerObjects;

    public GlState(boolean samplerObjects) {
        this.samplerObjects = samplerObjects;
    }

    public void capture() {
        this.program = GL33C.glGetInteger(35725);
        this.vertexArray = GL33C.glGetInteger(34229);
        this.arrayBuffer = GL33C.glGetInteger(34964);
        this.pixelUnpackBuffer = GL33C.glGetInteger(35055);
        this.pixelPackBuffer = GL33C.glGetInteger(35053);
        this.activeTexture = GL33C.glGetInteger(34016);

        for (int i = 0; i < 3; i++) {
            GL33C.glActiveTexture(33984 + i);
            this.textures[i] = GL33C.glGetInteger(32873);
            this.arrayTextures[i] = GL33C.glGetInteger(35869);
            if (this.samplerObjects) {
                this.samplers[i] = GL33C.glGetInteger(35097);
            }
        }

        GL33C.glActiveTexture(this.activeTexture);
        this.drawFramebuffer = GL33C.glGetInteger(36006);
        this.readFramebuffer = GL33C.glGetInteger(36010);
        this.renderbuffer = GL33C.glGetInteger(36007);
        MemoryStack stack = MemoryStack.stackPush();

        try {
            IntBuffer buf = stack.mallocInt(4);
            GL33C.glGetIntegerv(2978, buf);
            buf.get(this.viewport);
            buf.clear();
            GL33C.glGetIntegerv(3088, buf);
            buf.get(this.scissorBox);
            ByteBuffer mask = stack.malloc(4);
            GL33C.glGetBooleanv(3107, mask);

            for (int ix = 0; ix < 4; ix++) {
                this.colorMask[ix] = mask.get(ix) != 0;
            }
        } catch (Throwable var6) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }
            }

            throw var6;
        }

        if (stack != null) {
            stack.close();
        }

        this.blend = GL33C.glIsEnabled(3042);
        this.depthTest = GL33C.glIsEnabled(2929);
        this.cullFace = GL33C.glIsEnabled(2884);
        this.scissorTest = GL33C.glIsEnabled(3089);
        this.stencilTest = GL33C.glIsEnabled(2960);
        this.polygonOffsetFill = GL33C.glIsEnabled(32823);
        this.framebufferSrgb = GL33C.glIsEnabled(36281);
        this.blendSrcRgb = GL33C.glGetInteger(32969);
        this.blendDstRgb = GL33C.glGetInteger(32968);
        this.blendSrcAlpha = GL33C.glGetInteger(32971);
        this.blendDstAlpha = GL33C.glGetInteger(32970);
        this.blendEqRgb = GL33C.glGetInteger(32777);
        this.blendEqAlpha = GL33C.glGetInteger(34877);
        this.depthMask = GL33C.glGetBoolean(2930);
        this.depthFunc = GL33C.glGetInteger(2932);
        this.unpackAlignment = GL33C.glGetInteger(3317);
        this.unpackRowLength = GL33C.glGetInteger(3314);
        this.unpackSkipPixels = GL33C.glGetInteger(3316);
        this.unpackSkipRows = GL33C.glGetInteger(3315);
        this.packAlignment = GL33C.glGetInteger(3333);
    }

    public void restore() {
        GL33C.glUseProgram(this.program);
        GL33C.glBindVertexArray(this.vertexArray);
        GL33C.glBindBuffer(34962, this.arrayBuffer);
        GL33C.glBindBuffer(35052, this.pixelUnpackBuffer);
        GL33C.glBindBuffer(35051, this.pixelPackBuffer);

        for (int i = 0; i < 3; i++) {
            GL33C.glActiveTexture(33984 + i);
            GL33C.glBindTexture(3553, this.textures[i]);
            GL33C.glBindTexture(35866, this.arrayTextures[i]);
            if (this.samplerObjects) {
                GL33C.glBindSampler(i, this.samplers[i]);
            }
        }

        GL33C.glActiveTexture(this.activeTexture);
        GL33C.glBindFramebuffer(36009, this.drawFramebuffer);
        GL33C.glBindFramebuffer(36008, this.readFramebuffer);
        GL33C.glBindRenderbuffer(36161, this.renderbuffer);
        GL33C.glViewport(this.viewport[0], this.viewport[1], this.viewport[2], this.viewport[3]);
        GL33C.glScissor(this.scissorBox[0], this.scissorBox[1], this.scissorBox[2], this.scissorBox[3]);
        toggle(3042, this.blend);
        toggle(2929, this.depthTest);
        toggle(2884, this.cullFace);
        toggle(3089, this.scissorTest);
        toggle(2960, this.stencilTest);
        toggle(32823, this.polygonOffsetFill);
        toggle(36281, this.framebufferSrgb);
        GL33C.glBlendFuncSeparate(this.blendSrcRgb, this.blendDstRgb, this.blendSrcAlpha, this.blendDstAlpha);
        GL33C.glBlendEquationSeparate(this.blendEqRgb, this.blendEqAlpha);
        GL33C.glDepthMask(this.depthMask);
        GL33C.glDepthFunc(this.depthFunc);
        GL33C.glColorMask(this.colorMask[0], this.colorMask[1], this.colorMask[2], this.colorMask[3]);
        GL33C.glPixelStorei(3317, this.unpackAlignment);
        GL33C.glPixelStorei(3314, this.unpackRowLength);
        GL33C.glPixelStorei(3316, this.unpackSkipPixels);
        GL33C.glPixelStorei(3315, this.unpackSkipRows);
        GL33C.glPixelStorei(3333, this.packAlignment);
    }

    public void applyOverlayDefaults() {
        GL33C.glDisable(2929);
        GL33C.glDisable(2884);
        GL33C.glDisable(3089);
        GL33C.glDisable(2960);
        GL33C.glDisable(32823);
        GL33C.glDisable(36281);
        GL33C.glDepthMask(false);
        GL33C.glColorMask(true, true, true, true);
        GL33C.glEnable(3042);
        GL33C.glBlendEquationSeparate(32774, 32774);
        GL33C.glBlendFuncSeparate(1, 771, 1, 771);
        GL33C.glBindBuffer(35052, 0);
        GL33C.glBindBuffer(35051, 0);
        if (this.samplerObjects) {
            for (int i = 0; i < 3; i++) {
                GL33C.glBindSampler(i, 0);
            }
        }
    }

    private static void toggle(int cap, boolean on) {
        if (on) {
            GL33C.glEnable(cap);
        } else {
            GL33C.glDisable(cap);
        }
    }
}
