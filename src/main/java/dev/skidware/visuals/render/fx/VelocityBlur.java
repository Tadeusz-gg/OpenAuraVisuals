package dev.skidware.visuals.render.fx;

public final class VelocityBlur {
    private final float[] reprojection = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
    private VelocityBlur$Mode mode = VelocityBlur$Mode.FULL;
    private float strength = 1.0F;
    private int samples = 100;
    private boolean weighted;

    public VelocityBlur() {
    }

    public VelocityBlur reprojection(float[] columnMajor) {
        System.arraycopy(columnMajor, 0, this.reprojection, 0, 16);
        return this;
    }

    public VelocityBlur mode(VelocityBlur$Mode mode) {
        this.mode = mode;
        return this;
    }

    public VelocityBlur budget(float strength, int samples) {
        this.strength = strength;
        this.samples = Math.max(4, samples);
        return this;
    }

    public VelocityBlur weighted(boolean weighted) {
        this.weighted = weighted;
        return this;
    }

    public float[] reprojection() {
        return this.reprojection;
    }

    public VelocityBlur$Mode mode() {
        return this.mode;
    }

    public float strength() {
        return this.strength;
    }

    public int samples() {
        return this.samples;
    }

    public boolean weighted() {
        return this.weighted;
    }
}
