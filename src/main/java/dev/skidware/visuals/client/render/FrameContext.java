package dev.skidware.visuals.client.render;

public final class FrameContext {
    float dt;
    double time;
    long frame;
    float partialTick;
    float guiScale = 1.0F;
    float guiWidth;
    float guiHeight;
    int framebufferWidth;
    int framebufferHeight;
    boolean inWorld;
    boolean hideGui;
    boolean screenOpen;

    public FrameContext() {
    }

    public float dt() {
        return this.dt;
    }

    public double time() {
        return this.time;
    }

    public long frame() {
        return this.frame;
    }

    public float partialTick() {
        return this.partialTick;
    }

    public float guiScale() {
        return this.guiScale;
    }

    public float guiWidth() {
        return this.guiWidth;
    }

    public float guiHeight() {
        return this.guiHeight;
    }

    public int framebufferWidth() {
        return this.framebufferWidth;
    }

    public int framebufferHeight() {
        return this.framebufferHeight;
    }

    public boolean inWorld() {
        return this.inWorld;
    }

    public boolean hideGui() {
        return this.hideGui;
    }

    public boolean screenOpen() {
        return this.screenOpen;
    }
}
