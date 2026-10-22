package dev.skidware.visuals.render.canvas;

public record Glass(int blur, int tint, float refraction, float bezel, float dispersion, float specular, int rimColor) {
    public static final Glass SMOKE = new Glass(3, -1290589883, 4.0F, 3.0F, 0.015F, 0.16F, -2167041);
    public static final Glass CLEAR = new Glass(3, 1880965739, 6.0F, 4.0F, 0.03F, 0.2F, -2167041);

    public Glass withTint(int argb) {
        return new Glass(this.blur, argb, this.refraction, this.bezel, this.dispersion, this.specular, this.rimColor);
    }

    public Glass withSpecular(float s) {
        return new Glass(this.blur, this.tint, this.refraction, this.bezel, this.dispersion, s, this.rimColor);
    }

    public Glass withRefraction(float r) {
        return new Glass(this.blur, this.tint, r, this.bezel, this.dispersion, this.specular, this.rimColor);
    }
}
