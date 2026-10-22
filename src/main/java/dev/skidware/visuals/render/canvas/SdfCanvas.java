package dev.skidware.visuals.render.canvas;

import dev.aurap.hub.DP;
import dev.aurap.hub.TP;
import dev.skidware.visuals.render.text.Font;
import dev.skidware.visuals.render.text.FontFamily;
import dev.skidware.visuals.render.text.Glyph;
import dev.skidware.visuals.render.text.Wordmark;
import java.util.Arrays;

public final class SdfCanvas implements Canvas {
    private static final int MAX_DEPTH = 64;
    private static final int FRAME = 32;
    private static final float DEFAULT_DEPTH = 0.5F;
    private final DrawList list = new DrawList();
    private final FontFamily fonts;
    private final float[] stack = new float[2048];
    private int depth;
    private float width;
    private float height;
    private float pixelScale;
    private float m00;
    private float m01;
    private float m10;
    private float m11;
    private float tx;
    private float ty;
    private float clipX0;
    private float clipY0;
    private float clipX1;
    private float clipY1;
    private float clipR;
    private float alpha;
    private float depth0;
    private float depthOx;
    private float depthOy;
    private float depthGx;
    private float depthGy;
    private float additive;
    private float soften;
    private final float[] plane = new float[12];
    private boolean planar;
    private boolean drawnSinceBarrier = true;
    private int lastBarrierBlur = -1;
    private static final float SDF_PER_UNIT_AT_1 = 2.0078433F;

    public SdfCanvas(FontFamily fonts) {
        this.fonts = fonts;
    }

    public void begin(float logicalW, float logicalH, float pixelScale) {
        this.list.reset();
        this.width = logicalW;
        this.height = logicalH;
        this.pixelScale = pixelScale;
        this.m00 = pixelScale;
        this.m01 = 0.0F;
        this.m10 = 0.0F;
        this.m11 = pixelScale;
        this.tx = 0.0F;
        this.ty = 0.0F;
        this.clipX0 = 0.0F;
        this.clipY0 = 0.0F;
        this.clipX1 = logicalW * pixelScale;
        this.clipY1 = logicalH * pixelScale;
        this.clipR = 0.0F;
        this.alpha = 1.0F;
        this.depth0 = 0.5F;
        this.depthOx = this.depthOy = this.depthGx = this.depthGy = 0.0F;
        this.additive = 0.0F;
        this.soften = 0.0F;
        this.planar = false;
        this.depth = 0;
        this.drawnSinceBarrier = true;
        this.lastBarrierBlur = -1;
    }

    public DrawList drawList() {
        return this.list;
    }

    public boolean isEmpty() {
        return this.list.instanceCount() == 0;
    }

    @Override
    public float width() {
        return this.width;
    }

    @Override
    public float height() {
        return this.height;
    }

    @Override
    public float pixelScale() {
        return this.pixelScale;
    }

    @Override
    public void save() {
        if (this.depth >= 64) {
            throw new IllegalStateException("Canvas save() depth exceeded (unbalanced save/restore?)");
        } else {
            int o = this.depth++ * 32;
            this.stack[o] = this.m00;
            this.stack[o + 1] = this.m01;
            this.stack[o + 2] = this.m10;
            this.stack[o + 3] = this.m11;
            this.stack[o + 4] = this.tx;
            this.stack[o + 5] = this.ty;
            this.stack[o + 6] = this.clipX0;
            this.stack[o + 7] = this.clipY0;
            this.stack[o + 8] = this.clipX1;
            this.stack[o + 9] = this.clipY1;
            this.stack[o + 10] = this.clipR;
            this.stack[o + 11] = this.alpha;
            this.stack[o + 12] = this.depth0;
            this.stack[o + 13] = this.depthOx;
            this.stack[o + 14] = this.depthOy;
            this.stack[o + 15] = this.depthGx;
            this.stack[o + 16] = this.depthGy;
            this.stack[o + 17] = this.additive;
            this.stack[o + 18] = this.soften;
            this.stack[o + 19] = this.planar ? 1.0F : 0.0F;
            System.arraycopy(this.plane, 0, this.stack, o + 20, 12);
        }
    }

    @Override
    public void restore() {
        if (this.depth == 0) {
            throw new IllegalStateException("Canvas restore() without save()");
        } else {
            int o = --this.depth * 32;
            this.m00 = this.stack[o];
            this.m01 = this.stack[o + 1];
            this.m10 = this.stack[o + 2];
            this.m11 = this.stack[o + 3];
            this.tx = this.stack[o + 4];
            this.ty = this.stack[o + 5];
            this.clipX0 = this.stack[o + 6];
            this.clipY0 = this.stack[o + 7];
            this.clipX1 = this.stack[o + 8];
            this.clipY1 = this.stack[o + 9];
            this.clipR = this.stack[o + 10];
            this.alpha = this.stack[o + 11];
            this.depth0 = this.stack[o + 12];
            this.depthOx = this.stack[o + 13];
            this.depthOy = this.stack[o + 14];
            this.depthGx = this.stack[o + 15];
            this.depthGy = this.stack[o + 16];
            this.additive = this.stack[o + 17];
            this.soften = this.stack[o + 18];
            this.planar = this.stack[o + 19] != 0.0F;
            System.arraycopy(this.stack, o + 20, this.plane, 0, 12);
        }
    }

    public void checkBalanced() {
        if (this.depth != 0) {
            int leaked = this.depth;
            this.depth = 0;
            throw new IllegalStateException("Canvas has " + leaked + " unbalanced save() call(s)");
        }
    }

    @Override
    public void translate(float x, float y) {
        this.tx = this.tx + (this.m00 * x + this.m01 * y);
        this.ty = this.ty + (this.m10 * x + this.m11 * y);
    }

    @Override
    public void scale(float sx, float sy) {
        this.m00 *= sx;
        this.m10 *= sx;
        this.m01 *= sy;
        this.m11 *= sy;
    }

    @Override
    public void rotate(float radians) {
        float c = (float)Math.cos(radians);
        float s = (float)Math.sin(radians);
        float a = this.m00;
        float b = this.m01;
        float d = this.m10;
        float e = this.m11;
        this.m00 = a * c + b * s;
        this.m01 = -a * s + b * c;
        this.m10 = d * c + e * s;
        this.m11 = -d * s + e * c;
    }

    @Override
    public void transform(float a, float b, float c, float d) {
        float n00 = this.m00 * a + this.m01 * c;
        float n01 = this.m00 * b + this.m01 * d;
        float n10 = this.m10 * a + this.m11 * c;
        float n11 = this.m10 * b + this.m11 * d;
        this.m00 = n00;
        this.m01 = n01;
        this.m10 = n10;
        this.m11 = n11;
    }

    @Override
    public void clip(float x, float y, float w, float h, float radius) {
        if (!this.planar) {
            float ax = this.m00 * x + this.m01 * y + this.tx;
            float ay = this.m10 * x + this.m11 * y + this.ty;
            float bx = this.m00 * (x + w) + this.m01 * (y + h) + this.tx;
            float by = this.m10 * (x + w) + this.m11 * (y + h) + this.ty;
            this.clipX0 = Math.max(this.clipX0, Math.min(ax, bx));
            this.clipY0 = Math.max(this.clipY0, Math.min(ay, by));
            this.clipX1 = Math.min(this.clipX1, Math.max(ax, bx));
            this.clipY1 = Math.min(this.clipY1, Math.max(ay, by));
            this.clipR = radius * this.scaleEstimate();
        }
    }

    @Override
    public void alpha(float a) {
        this.alpha = this.alpha * Math.max(0.0F, Math.min(1.0F, a));
    }

    @Override
    public void blur(float units) {
        this.soften = this.soften + Math.max(0.0F, units);
    }

    @Override
    public void depthPlane(float x, float y, float ndcZ, float dzdx, float dzdy) {
        this.depthOx = this.m00 * x + this.m01 * y + this.tx;
        this.depthOy = this.m10 * x + this.m11 * y + this.ty;
        this.depth0 = ndcZ;
        float det = this.m00 * this.m11 - this.m01 * this.m10;
        if (Math.abs(det) < 1.0E-12F) {
            this.depthGx = this.depthGy = 0.0F;
        } else {
            this.depthGx = (dzdx * this.m11 - dzdy * this.m10) / det;
            this.depthGy = (dzdy * this.m00 - dzdx * this.m01) / det;
        }
    }

    @Override
    public void additive(float amount) {
        this.additive = Math.max(0.0F, Math.min(1.0F, amount));
    }

    @Override
    public void perspective(float[] basis) {
        this.planar = true;
        float det = this.m00 * this.m11 - this.m01 * this.m10;
        if (Math.abs(det) < 1.0E-12F) {
            Arrays.fill(this.plane, 0.0F);
        } else {
            float i00 = this.m11 / det;
            float i01 = -this.m01 / det;
            float i10 = -this.m10 / det;
            float i11 = this.m00 / det;

            for (int k = 0; k < 4; k++) {
                float dx = basis[k];
                float dy = basis[4 + k];
                float hx = dx * i00 + dy * i10;
                float hy = dx * i01 + dy * i11;
                this.plane[k] = hx;
                this.plane[4 + k] = hy;
                this.plane[8 + k] = basis[8 + k] - hx * this.tx - hy * this.ty;
            }
        }
    }

    private float depthAt(float x, float y) {
        float px = this.m00 * x + this.m01 * y + this.tx;
        float py = this.m10 * x + this.m11 * y + this.ty;
        return this.depth0 + this.depthGx * (px - this.depthOx) + this.depthGy * (py - this.depthOy);
    }

    private float scaleEstimate() {
        return (float)Math.sqrt(Math.abs(this.m00 * this.m11 - this.m01 * this.m10));
    }

    @Override
    public void roundRect(float x, float y, float w, float h, float tl, float tr, float br, float bl, Paint paint) {
        if (!(w <= 0.0F) && !(h <= 0.0F)) {
            float hw = w * 0.5F;
            float hh = h * 0.5F;
            float max = Math.min(hw, hh);
            float soft = paint.softness() + this.soften;
            this.emit(
                0,
                null,
                false,
                x + hw,
                y + hh,
                hw,
                hh,
                soft + 1.0F,
                Math.min(tl, max),
                Math.min(tr, max),
                Math.min(br, max),
                Math.min(bl, max),
                paint.color0(),
                paint.color1(),
                paint.gpuKind(),
                paint.angle(),
                paint.stroke(),
                soft,
                0.0F,
                0.0F,
                0.0F,
                0.0F
            );
        }
    }

    @Override
    public void arc(float cx, float cy, float radius, float thickness, float startAngle, float sweep, Paint paint) {
        float ext = radius + thickness * 0.5F;
        float soft = paint.softness() + this.soften;
        this.emit(
            2,
            null,
            false,
            cx,
            cy,
            ext,
            ext,
            soft + 1.0F,
            radius,
            thickness,
            startAngle,
            sweep,
            paint.color0(),
            paint.color1(),
            paint.gpuKind(),
            paint.angle(),
            0.0F,
            soft,
            0.0F,
            0.0F,
            0.0F,
            0.0F
        );
    }

    @Override
    public void line(float x1, float y1, float x2, float y2, float thickness, Paint paint) {
        float cx = (x1 + x2) * 0.5F;
        float cy = (y1 + y2) * 0.5F;
        float half = thickness * 0.5F;
        float soft = paint.softness() + this.soften;
        this.emit(
            3,
            null,
            false,
            cx,
            cy,
            Math.abs(x2 - x1) * 0.5F + half,
            Math.abs(y2 - y1) * 0.5F + half,
            soft + 1.0F,
            half,
            0.0F,
            0.0F,
            0.0F,
            paint.color0(),
            paint.color1(),
            paint.gpuKind(),
            paint.angle(),
            0.0F,
            soft,
            x1 - cx,
            y1 - cy,
            x2 - cx,
            y2 - cy
        );
    }

    @Override
    public void shadow(float x, float y, float w, float h, float radius, float blur, int color) {
        if (!(w <= 0.0F) && !(h <= 0.0F)) {
            float sigma = Math.max(0.01F, (blur + this.soften) * 0.5F);
            float hw = w * 0.5F;
            float hh = h * 0.5F;
            this.emit(
                1,
                null,
                false,
                x + hw,
                y + hh,
                hw,
                hh,
                sigma * 3.0F + 1.0F,
                Math.min(radius, Math.min(hw, hh)),
                0.0F,
                0.0F,
                0.0F,
                color,
                color,
                0.0F,
                0.0F,
                0.0F,
                sigma,
                0.0F,
                0.0F,
                0.0F,
                0.0F
            );
        }
    }

    @Override
    public void backdrop(float x, float y, float w, float h, float radius, int blur, int tint) {
        float hw = w * 0.5F;
        float hh = h * 0.5F;
        if (this.visibleBackdrop(x + hw, y + hh, hw, hh)) {
            this.barrier(blur);
            float r = Math.min(radius, Math.min(hw, hh));
            this.emitBackdrop(6, x + hw, y + hh, hw, hh, r, tint, -1, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @Override
    public void glass(float x, float y, float w, float h, float radius, Glass glass) {
        float hw = w * 0.5F;
        float hh = h * 0.5F;
        if (this.visibleBackdrop(x + hw, y + hh, hw, hh)) {
            this.barrier(glass.blur());
            float r = Math.min(radius, Math.min(hw, hh));
            this.emitBackdrop(
                7,
                x + hw,
                y + hh,
                hw,
                hh,
                r,
                glass.tint(),
                glass.rimColor(),
                glass.refraction() * this.scaleEstimate(),
                glass.bezel(),
                glass.dispersion(),
                glass.specular()
            );
        }
    }

    private boolean visibleBackdrop(float cx, float cy, float hw, float hh) {
        return hw > 0.0F && hh > 0.0F && this.alpha > 0.0F && !this.culled(cx, cy, hw + 1.0F, hh + 1.0F);
    }

    private void barrier(int blur) {
        int level = Math.max(1, Math.min(6, blur));
        if (this.drawnSinceBarrier || level != this.lastBarrierBlur) {
            this.list.backdropBarrier(level);
            this.lastBarrierBlur = level;
            this.drawnSinceBarrier = false;
        }
    }

    private void emitBackdrop(int type, float cx, float cy, float hw, float hh, float r, int c0, int c1, float p0, float p1, float p2, float p3) {
        this.list.beginInstance(null, true);
        this.list
            .put(
                cx,
                cy,
                hw,
                hh,
                r,
                r,
                r,
                r,
                this.m00,
                this.m01,
                this.m10,
                this.m11,
                this.tx,
                this.ty,
                type,
                this.clipR,
                this.fade(c0),
                this.fade(c1),
                p0,
                p1,
                p2,
                p3,
                0.0F,
                0.0F,
                0.0F,
                0.0F,
                this.clipX0,
                this.clipY0,
                this.clipX1,
                this.clipY1,
                this.depthAt(cx, cy),
                0.0F,
                0.0F,
                0.0F,
                this.planeOrNull()
            );
    }

    @Override
    public void image(int textureId, float x, float y, float w, float h, float u0, float v0, float u1, float v1, int tint, float radius, boolean linearFilter) {
        if (!(w <= 0.0F) && !(h <= 0.0F) && textureId > 0) {
            float hw = w * 0.5F;
            float hh = h * 0.5F;
            float r = Math.min(radius, Math.min(hw, hh));
            this.emit(5, TextureRef.of(textureId), linearFilter, x + hw, y + hh, hw, hh, 0.0F, r, r, r, r, tint, tint, 0.0F, 0.0F, 0.0F, 0.0F, u0, v0, u1, v1);
        }
    }

    @Override
    public void sprite(SpriteShape shape, float cx, float cy, float size, float glow, int core, int halo, float phase) {
        size = Math.max(0.0F, size);
        glow = Math.max(0.0F, glow);
        float ext = size + glow;
        if (!(ext <= 0.0F)) {
            this.emit(8, null, false, cx, cy, ext, ext, 1.0F, size, glow, 0.0F, 0.0F, core, halo, shape.ordinal(), phase, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @Override
    public void quad(float ax, float ay, float bx, float by, float cx, float cy, float dx, float dy, int from, int to, boolean ribbon) {
        this.quad(ax, ay, this.depthAt(ax, ay), bx, by, this.depthAt(bx, by), cx, cy, this.depthAt(cx, cy), dx, dy, this.depthAt(dx, dy), from, to, ribbon);
    }

    @Override
    public void quad(
        float ax,
        float ay,
        float az,
        float bx,
        float by,
        float bz,
        float cx,
        float cy,
        float cz,
        float dx,
        float dy,
        float dz,
        int from,
        int to,
        boolean ribbon
    ) {
        this.emitQuad(ax, ay, az, bx, by, bz, cx, cy, cz, dx, dy, dz, from, to, ribbon ? 1.0F : 0.0F, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void quad(
        float ax,
        float ay,
        float az,
        float bx,
        float by,
        float bz,
        float cx,
        float cy,
        float cz,
        float dx,
        float dy,
        float dz,
        int from,
        int to,
        float edgeA,
        float middle,
        float edgeB
    ) {
        if (!(edgeA <= 0.0F) || !(middle <= 0.0F) || !(edgeB <= 0.0F)) {
            this.emitQuad(ax, ay, az, bx, by, bz, cx, cy, cz, dx, dy, dz, from, to, 2.0F, TP.S(edgeA), TP.S(middle), TP.S(edgeB));
        }
    }

    private void emitQuad(
        float ax,
        float ay,
        float az,
        float bx,
        float by,
        float bz,
        float cx,
        float cy,
        float cz,
        float dx,
        float dy,
        float dz,
        int from,
        int to,
        float profile,
        float p1,
        float p2,
        float p3
    ) {
        if (!(this.alpha <= 0.0F) && (DP.R(from) != 0 || DP.R(to) != 0)) {
            float minX = Math.min(Math.min(ax, bx), Math.min(cx, dx));
            float maxX = Math.max(Math.max(ax, bx), Math.max(cx, dx));
            float minY = Math.min(Math.min(ay, by), Math.min(cy, dy));
            float maxY = Math.max(Math.max(ay, by), Math.max(cy, dy));
            if (!this.culled((minX + maxX) * 0.5F, (minY + maxY) * 0.5F, (maxX - minX) * 0.5F + 1.0F, (maxY - minY) * 0.5F + 1.0F)) {
                this.list.beginInstance(null, false);
                this.list
                    .put(
                        ax,
                        ay,
                        bx,
                        by,
                        cx,
                        cy,
                        dx,
                        dy,
                        this.m00,
                        this.m01,
                        this.m10,
                        this.m11,
                        this.tx,
                        this.ty,
                        9,
                        this.clipR,
                        this.fade(from),
                        this.fade(to),
                        profile,
                        p1,
                        p2,
                        p3,
                        az,
                        bz,
                        cz,
                        dz,
                        this.clipX0,
                        this.clipY0,
                        this.clipX1,
                        this.clipY1,
                        0.0F,
                        0.0F,
                        0.0F,
                        this.additive,
                        this.planeOrNull()
                    );
                this.drawnSinceBarrier = true;
            }
        }
    }

    @Override
    public Font defaultFont() {
        return this.fonts.regular();
    }

    @Override
    public FontFamily fonts() {
        return this.fonts;
    }

    private Font fontOf(TextStyle style) {
        return style.font() != null ? style.font() : this.fonts.face(style.fontWeight());
    }

    @Override
    public float text(CharSequence text, float x, float y, TextStyle style) {
        return this.text(text, x, y, style, null);
    }

    @Override
    public float text(CharSequence text, float x, float y, TextStyle style, GlyphTint tint) {
        Font font = this.fontOf(style);
        float soft = this.soften > 0.0F ? Math.min(0.45F, this.soften * 2.0078433F / Math.max(style.size(), 0.5F)) : 0.0F;
        if (DP.R(style.shadowColor()) > 0) {
            float o = style.shadowOffset();
            this.glyphRun(font, text, x + o, y + o, style, style.shadowColor(), 0, 0.0F, Math.max(style.shadowBlur(), 0.02F) + soft, null);
        }

        return this.glyphRun(font, text, x, y, style, style.color(), style.outlineColor(), style.outlineWidth(), soft, tint);
    }

    private float glyphRun(
        Font font, CharSequence text, float x, float y, TextStyle style, int color, int outline, float outlineWidth, float softness, GlyphTint tint
    ) {
        float k = style.size() / 48.0F;
        boolean tabular = style.tabularDigits();
        float baseline = y + font.ascent() * k;
        float pen = x;
        int prev = -1;
        int n = text.length();
        int i = 0;

        while (i < n) {
            int cp = Character.codePointAt(text, i);
            i += Character.charCount(cp);
            if (prev >= 0) {
                pen += font.kerningBetween(prev, cp, tabular) * k + style.letterSpacing();
            }

            Glyph g = font.glyph(cp);
            float advance = font.advance(cp, tabular);
            if (!g.isEmpty()) {
                float gw = g.width() * k;
                float gh = g.height() * k;
                float gx = pen + (g.xOffset() + (advance - g.advance()) * 0.5F) * k;
                float gy = baseline + g.yOffset() * k;
                int fill = tint == null ? color : tint.tint(color, gx + gw * 0.5F);
                this.emit(
                    4,
                    font.atlas(),
                    true,
                    gx + gw * 0.5F,
                    gy + gh * 0.5F,
                    gw * 0.5F,
                    gh * 0.5F,
                    0.0F,
                    0.0F,
                    0.0F,
                    0.0F,
                    0.0F,
                    fill,
                    outline,
                    style.weight(),
                    outlineWidth,
                    softness,
                    0.0F,
                    g.u0(),
                    g.v0(),
                    g.u1(),
                    g.v1()
                );
            }

            pen += advance * k;
            prev = cp;
        }

        return pen - x;
    }

    @Override
    public float measure(CharSequence text, TextStyle style) {
        return this.fontOf(style).measure(text, style.size(), style.letterSpacing(), style.tabularDigits());
    }

    @Override
    public float lineHeight(TextStyle style) {
        return this.fontOf(style).lineHeight(style.size());
    }

    @Override
    public void wordmark(Wordmark mark, float x, float y, float inkHeight, TextStyle style) {
        if (!(inkHeight <= 0.0F)) {
            float k = inkHeight / mark.inkHeight();
            float hw = mark.width() * k * 0.5F;
            float hh = mark.height() * k * 0.5F;
            float cx = x - 32.0F * k + hw;
            float cy = y - 32.0F * k + hh;
            float soft = this.soften > 0.0F ? Math.min(0.45F, this.soften * 2.0078433F / (256.0F * k)) : 0.0F;
            if (DP.R(style.shadowColor()) > 0) {
                float o = style.shadowOffset();
                this.emit(
                    4,
                    mark,
                    true,
                    cx + o,
                    cy + o,
                    hw,
                    hh,
                    0.0F,
                    0.0F,
                    0.0F,
                    0.0F,
                    0.0F,
                    style.shadowColor(),
                    0,
                    style.weight(),
                    0.0F,
                    Math.max(style.shadowBlur(), 0.02F) + soft,
                    0.0F,
                    0.0F,
                    0.0F,
                    1.0F,
                    1.0F
                );
            }

            this.emit(
                4,
                mark,
                true,
                cx,
                cy,
                hw,
                hh,
                0.0F,
                0.0F,
                0.0F,
                0.0F,
                0.0F,
                style.color(),
                style.outlineColor(),
                style.weight(),
                style.outlineWidth(),
                soft,
                0.0F,
                0.0F,
                0.0F,
                1.0F,
                1.0F
            );
        }
    }

    private void emit(
        int type,
        TextureRef texture,
        boolean linear,
        float cx,
        float cy,
        float hw,
        float hh,
        float pad,
        float r0,
        float r1,
        float r2,
        float r3,
        int c0,
        int c1,
        float p0,
        float p1,
        float p2,
        float p3,
        float u0,
        float v0,
        float u1,
        float v1
    ) {
        if (!(this.alpha <= 0.0F) && (DP.R(c0) != 0 || DP.R(c1) != 0)) {
            if (!this.culled(cx, cy, hw + pad, hh + pad)) {
                this.list.beginInstance(texture, linear);
                float z = this.depthAt(cx, cy);
                float gx = this.depthGx * this.m00 + this.depthGy * this.m10;
                float gy = this.depthGx * this.m01 + this.depthGy * this.m11;
                this.list
                    .put(
                        cx,
                        cy,
                        hw,
                        hh,
                        r0,
                        r1,
                        r2,
                        r3,
                        this.m00,
                        this.m01,
                        this.m10,
                        this.m11,
                        this.tx,
                        this.ty,
                        type,
                        this.clipR,
                        this.fade(c0),
                        this.fade(c1),
                        p0,
                        p1,
                        p2,
                        p3,
                        u0,
                        v0,
                        u1,
                        v1,
                        this.clipX0,
                        this.clipY0,
                        this.clipX1,
                        this.clipY1,
                        z,
                        gx,
                        gy,
                        this.additive,
                        this.planeOrNull()
                    );
                this.drawnSinceBarrier = true;
            }
        }
    }

    private float[] planeOrNull() {
        return this.planar ? this.plane : null;
    }

    private boolean culled(float cx, float cy, float ex, float ey) {
        if (this.clipX1 <= this.clipX0 || this.clipY1 <= this.clipY0) {
            return true;
        } else if (this.planar) {
            return (this.outcode(cx - ex, cy - ey) & this.outcode(cx + ex, cy - ey) & this.outcode(cx + ex, cy + ey) & this.outcode(cx - ex, cy + ey)) != 0;
        } else {
            float px = this.m00 * cx + this.m01 * cy + this.tx;
            float py = this.m10 * cx + this.m11 * cy + this.ty;
            float rx = Math.abs(this.m00) * ex + Math.abs(this.m01) * ey;
            float ry = Math.abs(this.m10) * ex + Math.abs(this.m11) * ey;
            return px + rx < this.clipX0 || px - rx > this.clipX1 || py + ry < this.clipY0 || py - ry > this.clipY1;
        }
    }

    private int outcode(float lx, float ly) {
        float px = this.m00 * lx + this.m01 * ly + this.tx;
        float py = this.m10 * lx + this.m11 * ly + this.ty;
        float x = this.plane[0] * px + this.plane[4] * py + this.plane[8];
        float y = this.plane[1] * px + this.plane[5] * py + this.plane[9];
        float w = this.plane[3] * px + this.plane[7] * py + this.plane[11];
        return (x < -w ? 1 : 0) | (x > w ? 2 : 0) | (y < -w ? 4 : 0) | (y > w ? 8 : 0) | (w <= 0.0F ? 16 : 0);
    }

    private int fade(int argb) {
        return this.alpha >= 1.0F ? argb : DP.nq(argb, this.alpha);
    }
}
