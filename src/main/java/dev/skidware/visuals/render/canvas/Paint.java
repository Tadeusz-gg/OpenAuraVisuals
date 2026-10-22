package dev.skidware.visuals.render.canvas;

public record Paint(Paint$Kind kind, int color0, int color1, float angle, float stroke, float softness) {
    public static Paint solid(int argb) {
        return new Paint(Paint$Kind.SOLID, argb, argb, 0.0F, 0.0F, 0.0F);
    }

    public static Paint linear(int from, int to, float angle) {
        return new Paint(Paint$Kind.LINEAR, from, to, angle, 0.0F, 0.0F);
    }

    public static Paint vertical(int top, int bottom) {
        return linear(top, bottom, (float) (Math.PI / 2));
    }

    public static Paint horizontal(int left, int right) {
        return linear(left, right, 0.0F);
    }

    public static Paint radial(int inner, int outer) {
        return new Paint(Paint$Kind.RADIAL, inner, outer, 0.0F, 0.0F, 0.0F);
    }

    public static Paint conic(int from, int to, float offsetTurns) {
        return new Paint(Paint$Kind.CONIC, from, to, offsetTurns, 0.0F, 0.0F);
    }

    public Paint stroke(float width) {
        return new Paint(this.kind, this.color0, this.color1, this.angle, width, this.softness);
    }

    public Paint soft(float feather) {
        return new Paint(this.kind, this.color0, this.color1, this.angle, this.stroke, feather);
    }

    int gpuKind() {
        return this.kind.ordinal();
    }
}
