package dev.skidware.visuals.render.canvas;

import dev.skidware.visuals.render.text.Font;
import dev.skidware.visuals.render.text.FontWeight;

public record TextStyle(
    Font font,
    float size,
    int color,
    float weight,
    float letterSpacing,
    int outlineColor,
    float outlineWidth,
    int shadowColor,
    float shadowOffset,
    float shadowBlur,
    FontWeight fontWeight,
    boolean tabularDigits
) {
    public TextStyle(
        Font font,
        float size,
        int color,
        float weight,
        float letterSpacing,
        int outlineColor,
        float outlineWidth,
        int shadowColor,
        float shadowOffset,
        float shadowBlur,
        FontWeight fontWeight,
        boolean tabularDigits
    ) {
        if (fontWeight == null) {
            fontWeight = FontWeight.REGULAR;
        }

        this.font = font;
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.letterSpacing = letterSpacing;
        this.outlineColor = outlineColor;
        this.outlineWidth = outlineWidth;
        this.shadowColor = shadowColor;
        this.shadowOffset = shadowOffset;
        this.shadowBlur = shadowBlur;
        this.fontWeight = fontWeight;
        this.tabularDigits = tabularDigits;
    }

    public static TextStyle of(float size, int color) {
        return new TextStyle(null, size, color, 0.0F, 0.0F, 0, 0.0F, 0, 0.0F, 0.0F, FontWeight.REGULAR, false);
    }

    public TextStyle font(Font f) {
        return new TextStyle(
            f,
            this.size,
            this.color,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle size(float s) {
        return new TextStyle(
            this.font,
            s,
            this.color,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle color(int c) {
        return new TextStyle(
            this.font,
            this.size,
            c,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle weight(float w) {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            w,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle face(FontWeight face) {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            face,
            this.tabularDigits
        );
    }

    public TextStyle regular() {
        return this.face(FontWeight.REGULAR);
    }

    public TextStyle medium() {
        return this.face(FontWeight.MEDIUM);
    }

    public TextStyle semibold() {
        return this.face(FontWeight.SEMIBOLD);
    }

    public TextStyle bold() {
        return this.face(FontWeight.BOLD);
    }

    public TextStyle tabular() {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            true
        );
    }

    public TextStyle spacing(float s) {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            this.weight,
            s,
            this.outlineColor,
            this.outlineWidth,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle outline(int c, float width) {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            this.weight,
            this.letterSpacing,
            c,
            width,
            this.shadowColor,
            this.shadowOffset,
            this.shadowBlur,
            this.fontWeight,
            this.tabularDigits
        );
    }

    public TextStyle shadow(int c, float offset, float blur) {
        return new TextStyle(
            this.font,
            this.size,
            this.color,
            this.weight,
            this.letterSpacing,
            this.outlineColor,
            this.outlineWidth,
            c,
            offset,
            blur,
            this.fontWeight,
            this.tabularDigits
        );
    }
}
