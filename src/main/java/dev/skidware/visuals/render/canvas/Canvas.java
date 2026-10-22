package dev.skidware.visuals.render.canvas;

import dev.skidware.visuals.render.text.Font;
import dev.skidware.visuals.render.text.FontFamily;
import dev.skidware.visuals.render.text.Wordmark;

public interface Canvas {
    float width();

    float height();

    float pixelScale();

    void save();

    void restore();

    void translate(float var1, float var2);

    void scale(float var1, float var2);

    default void scale(float s) {
        this.scale(s, s);
    }

    default void scale(float s, float pivotX, float pivotY) {
        this.translate(pivotX, pivotY);
        this.scale(s, s);
        this.translate(-pivotX, -pivotY);
    }

    void rotate(float var1);

    void transform(float var1, float var2, float var3, float var4);

    void clip(float var1, float var2, float var3, float var4, float var5);

    void alpha(float var1);

    void blur(float var1);

    default void depth(float ndcZ) {
        this.depthPlane(0.0F, 0.0F, ndcZ, 0.0F, 0.0F);
    }

    void depthPlane(float var1, float var2, float var3, float var4, float var5);

    void additive(float var1);

    void perspective(float[] var1);

    void roundRect(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Paint var9);

    default void roundRect(float x, float y, float w, float h, float radius, Paint paint) {
        this.roundRect(x, y, w, h, radius, radius, radius, radius, paint);
    }

    default void roundRect(float x, float y, float w, float h, float radius, int color) {
        this.roundRect(x, y, w, h, radius, radius, radius, radius, Paint.solid(color));
    }

    default void rect(float x, float y, float w, float h, int color) {
        this.roundRect(x, y, w, h, 0.0F, 0.0F, 0.0F, 0.0F, Paint.solid(color));
    }

    default void rect(float x, float y, float w, float h, Paint paint) {
        this.roundRect(x, y, w, h, 0.0F, 0.0F, 0.0F, 0.0F, paint);
    }

    default void circle(float cx, float cy, float r, Paint paint) {
        this.roundRect(cx - r, cy - r, r * 2.0F, r * 2.0F, r, r, r, r, paint);
    }

    default void circle(float cx, float cy, float r, int color) {
        this.circle(cx, cy, r, Paint.solid(color));
    }

    void arc(float var1, float var2, float var3, float var4, float var5, float var6, Paint var7);

    void line(float var1, float var2, float var3, float var4, float var5, Paint var6);

    default void line(float x1, float y1, float x2, float y2, float thickness, int color) {
        this.line(x1, y1, x2, y2, thickness, Paint.solid(color));
    }

    void shadow(float var1, float var2, float var3, float var4, float var5, float var6, int var7);

    void backdrop(float var1, float var2, float var3, float var4, float var5, int var6, int var7);

    void glass(float var1, float var2, float var3, float var4, float var5, Glass var6);

    void image(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11, boolean var12);

    void sprite(SpriteShape var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8);

    default void sprite(SpriteShape shape, float cx, float cy, float size, int color) {
        this.sprite(shape, cx, cy, size, size * 0.6F, color, color, 0.0F);
    }

    void quad(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, boolean var11);

    void quad(
        float var1,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        float var12,
        int var13,
        int var14,
        boolean var15
    );

    void quad(
        float var1,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        float var12,
        int var13,
        int var14,
        float var15,
        float var16,
        float var17
    );

    Font defaultFont();

    FontFamily fonts();

    float text(CharSequence var1, float var2, float var3, TextStyle var4);

    float text(CharSequence var1, float var2, float var3, TextStyle var4, GlyphTint var5);

    default float text(CharSequence text, float x, float y, float size, int color) {
        return this.text(text, x, y, TextStyle.of(size, color));
    }

    default float textCentered(CharSequence text, float cx, float y, TextStyle style) {
        float w = this.measure(text, style);
        return this.text(text, cx - w * 0.5F, y, style);
    }

    default float textRight(CharSequence text, float right, float y, TextStyle style) {
        float w = this.measure(text, style);
        return this.text(text, right - w, y, style);
    }

    float measure(CharSequence var1, TextStyle var2);

    float lineHeight(TextStyle var1);

    void wordmark(Wordmark var1, float var2, float var3, float var4, TextStyle var5);
}
