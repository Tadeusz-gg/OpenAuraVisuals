package dev.skidware.visuals.render;

public record RenderTarget(int colorTexture, int depthTexture, int width, int height, boolean reversedDepth) {
    public RenderTarget(int colorTexture, int depthTexture, int width, int height) {
        this(colorTexture, depthTexture, width, height, false);
    }

    public boolean isValid() {
        return this.colorTexture > 0 && this.width > 0 && this.height > 0;
    }

    public RenderTarget withReversedDepth(boolean reversed) {
        return reversed == this.reversedDepth ? this : new RenderTarget(this.colorTexture, this.depthTexture, this.width, this.height, reversed);
    }
}
