package dev.skidware.visuals.render.fx;

import dev.aurap.hub.DP;
import dev.aurap.hub.Pm;
import dev.aurap.hub.zT;

public final class ScreenEffects {
    private final zT grade = new zT();
    private final Pm displayGrade = new Pm();
    private float vignette;
    private int vignetteColor = -16777216;
    private float vignetteInner = 0.35F;
    private float vignetteOuter = 0.95F;
    private float aberration;
    private float saturation = 1.0F;
    private float flash;
    private int flashColor = -1;

    public ScreenEffects() {
    }

    public void reset() {
        this.grade.KT();
        this.displayGrade.IS();
        this.vignette = 0.0F;
        this.vignetteColor = -16777216;
        this.aberration = 0.0F;
        this.saturation = 1.0F;
        this.flash = 0.0F;
    }

    public void grade(float hueDegrees, float brightness, float saturation, float contrast) {
        this.grade.U(hueDegrees, brightness, saturation, contrast);
    }

    public void displayGrade(float brightness, float saturation, float contrast) {
        this.displayGrade.nQ(brightness, saturation, contrast);
    }

    public Pm displayGrade() {
        return this.displayGrade;
    }

    public void vignette(float intensity, int color, float inner, float outer) {
        if (!(intensity <= this.vignette)) {
            this.vignette = Math.min(1.0F, intensity);
            this.vignetteColor = color;
            this.vignetteInner = inner;
            this.vignetteOuter = outer;
        }
    }

    public void aberration(float pixels) {
        this.aberration = Math.max(this.aberration, pixels);
    }

    public void saturation(float value) {
        this.saturation = Math.min(this.saturation, Math.max(0.0F, value));
    }

    public void flash(float amount, int color) {
        if (!(amount <= this.flash)) {
            this.flash = Math.min(1.0F, amount);
            this.flashColor = color;
        }
    }

    public boolean isActive() {
        return this.vignette > 0.001F
            || this.aberration > 0.05F
            || this.saturation < 0.999F
            || this.flash > 0.001F
            || !this.grade.OP()
            || !this.displayGrade.LR();
    }

    public zT colorGrade() {
        return this.grade;
    }

    public float vignette() {
        return this.vignette;
    }

    public float vignetteR() {
        return DP.QN(this.vignetteColor) / 255.0F;
    }

    public float vignetteG() {
        return DP.W(this.vignetteColor) / 255.0F;
    }

    public float vignetteB() {
        return DP.Of(this.vignetteColor) / 255.0F;
    }

    public float vignetteInner() {
        return this.vignetteInner;
    }

    public float vignetteOuter() {
        return this.vignetteOuter;
    }

    public float aberration() {
        return this.aberration;
    }

    public float saturation() {
        return this.saturation;
    }

    public float flash() {
        return this.flash;
    }

    public int flashColor() {
        return this.flashColor;
    }
}
