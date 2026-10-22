package dev.skidware.visuals.render.gl;

import org.lwjgl.opengl.GL33C;

public final class GlFramebuffer implements AutoCloseable {
    private final int id;
    private final GlTexture ownedColor;
    private int attachedColor = -1;
    private int attachedDepth = -1;
    private int width;
    private int height;

    private GlFramebuffer(GlTexture ownedColor) {
        this.id = GL33C.glGenFramebuffers();
        this.ownedColor = ownedColor;
    }

    public static GlFramebuffer owned(int width, int height) {
        GlFramebuffer fb = new GlFramebuffer(GlTexture.rgba8(width, height));
        fb.attach(fb.ownedColor.id(), 0, width, height);
        return fb;
    }

    public static GlFramebuffer proxy() {
        return new GlFramebuffer(null);
    }

    public void attach(int colorTexture, int depthTexture, int w, int h) {
        boolean changed = colorTexture != this.attachedColor || depthTexture != this.attachedDepth || w != this.width || h != this.height;
        this.width = w;
        this.height = h;
        GL33C.glBindFramebuffer(36160, this.id);
        GL33C.glFramebufferTexture2D(36160, 36064, 3553, colorTexture, 0);
        GL33C.glFramebufferTexture2D(36160, 36096, 3553, depthTexture, 0);
        if (changed) {
            int status = GL33C.glCheckFramebufferStatus(36160);
            if (status != 36053) {
                this.attachedColor = this.attachedDepth = -1;
                throw new IllegalStateException(
                    "Framebuffer incomplete: 0x" + Integer.toHexString(status) + " (color=" + colorTexture + ", depth=" + depthTexture + ")"
                );
            } else {
                this.attachedColor = colorTexture;
                this.attachedDepth = depthTexture;
            }
        }
    }

    public void resize(int w, int h) {
        if (this.ownedColor == null) {
            throw new IllegalStateException("Cannot resize a proxy framebuffer");
        } else if (w != this.width || h != this.height) {
            this.ownedColor.resize(w, h);
            this.width = Math.max(1, w);
            this.height = Math.max(1, h);
        }
    }

    public void bind() {
        GL33C.glBindFramebuffer(36160, this.id);
        GL33C.glViewport(0, 0, this.width, this.height);
    }

    public int id() {
        return this.id;
    }

    public int colorTexture() {
        return this.ownedColor != null ? this.ownedColor.id() : this.attachedColor;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    @Override
    public void close() {
        GL33C.glDeleteFramebuffers(this.id);
        if (this.ownedColor != null) {
            this.ownedColor.close();
        }
    }
}
