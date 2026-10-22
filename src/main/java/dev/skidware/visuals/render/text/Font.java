package dev.skidware.visuals.render.text;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Font implements AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger("auravisuals/font");
    public static final float BAKE_SIZE = 48.0F;
    public static final int SDF_PADDING = 6;
    private static final byte ON_EDGE = -128;
    private static final float DIST_SCALE = 21.333334F;
    private static final int FAST_RANGE = 2048;
    private static final String PREWARM = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ąćęłńóśźżĄĆĘŁŃÓŚŹŻ•·×÷°±…–—∞";
    private final String name;
    private final ByteBuffer data;
    private final STBTTFontinfo info;
    private final FontAtlas atlas;
    private final boolean ownsAtlas;
    private final GposKerning gpos;
    private final float scale;
    private final float ascent;
    private final float descent;
    private final float lineGap;
    private final float tabularAdvance;
    private final Glyph[] fast = new Glyph[2048];
    private final Map slow = new HashMap();
    private final float[] asciiKern = new float[16384];
    private final boolean[] asciiKernKnown = new boolean[16384];
    private int atlasGeneration;
    private Glyph missing;

    private Font(String name, ByteBuffer data, STBTTFontinfo info, FontAtlas atlas, boolean ownsAtlas) {
        this.name = name;
        this.data = data;
        this.info = info;
        this.atlas = atlas;
        this.ownsAtlas = ownsAtlas;
        this.gpos = GposKerning.parse(data);
        this.scale = STBTruetype.stbtt_ScaleForPixelHeight(info, 48.0F);
        int[] a = new int[1];
        int[] d = new int[1];
        int[] g = new int[1];
        STBTruetype.stbtt_GetFontVMetrics(info, a, d, g);
        this.ascent = a[0] * this.scale;
        this.descent = d[0] * this.scale;
        this.lineGap = g[0] * this.scale;
        int[] advance = new int[1];
        int[] bearing = new int[1];
        float widest = 0.0F;

        for (char c = '0'; c <= '9'; c++) {
            STBTruetype.stbtt_GetCodepointHMetrics(info, c, advance, bearing);
            widest = Math.max(widest, advance[0] * this.scale);
        }

        this.tabularAdvance = widest;
        this.atlasGeneration = atlas.generation();
    }

    public static Font load(String name, byte[] ttf) {
        return load(name, ttf, new FontAtlas(1024, 1024), true);
    }

    public static Font load(String name, byte[] ttf, FontAtlas shared) {
        return load(name, ttf, shared, false);
    }

    private static Font load(String name, byte[] ttf, FontAtlas atlas, boolean ownsAtlas) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(ttf.length).put(ttf).flip();
        STBTTFontinfo info = STBTTFontinfo.create();
        if (!STBTruetype.stbtt_InitFont(info, buffer)) {
            throw new IllegalArgumentException("Not a valid TrueType font: " + name);
        } else {
            Font font = new Font(name, buffer, info, atlas, ownsAtlas);
            font.missing = font.bake(63);
            font.prewarm(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ąćęłńóśźżĄĆĘŁŃÓŚŹŻ•·×÷°±…–—∞");
            return font;
        }
    }

    public String name() {
        return this.name;
    }

    public FontAtlas atlas() {
        return this.atlas;
    }

    public float ascent() {
        return this.ascent;
    }

    public float descent() {
        return this.descent;
    }

    public float lineGap() {
        return this.lineGap;
    }

    public float tabularAdvance() {
        return this.tabularAdvance;
    }

    public boolean hasGposKerning() {
        return this.gpos != null;
    }

    public void prewarm(CharSequence chars) {
        chars.codePoints().forEach(this::glyph);
    }

    public Glyph glyph(int codepoint) {
        if (this.atlasGeneration != this.atlas.generation()) {
            this.forgetGlyphs();
        }

        if (codepoint >= 0 && codepoint < 2048) {
            Glyph g = this.fast[codepoint];
            if (g == null) {
                g = this.bakeOrMissing(codepoint);
                this.fast[codepoint] = g;
            }

            return g;
        } else {
            Glyph g = (Glyph)this.slow.get(codepoint);
            if (g == null) {
                g = this.bakeOrMissing(codepoint);
                this.slow.put(codepoint, g);
            }

            return g;
        }
    }

    public float kerning(int left, int right) {
        if (left < 128 && right < 128 && left >= 0 && right >= 0) {
            int i = left * 128 + right;
            if (!this.asciiKernKnown[i]) {
                this.asciiKern[i] = this.kernUncached(left, right);
                this.asciiKernKnown[i] = true;
            }

            return this.asciiKern[i];
        } else {
            return this.kernUncached(left, right);
        }
    }

    int kerningUnits(int left, int right) {
        if (this.gpos == null) {
            return 0;
        } else {
            int a = STBTruetype.stbtt_FindGlyphIndex(this.info, left);
            int b = STBTruetype.stbtt_FindGlyphIndex(this.info, right);
            return a != 0 && b != 0 ? this.gpos.kerning(a, b) : 0;
        }
    }

    private float kernUncached(int left, int right) {
        if (this.gpos == null) {
            return STBTruetype.stbtt_GetCodepointKernAdvance(this.info, left, right) * this.scale;
        } else {
            int a = STBTruetype.stbtt_FindGlyphIndex(this.info, left);
            int b = STBTruetype.stbtt_FindGlyphIndex(this.info, right);
            return a != 0 && b != 0 ? this.gpos.kerning(a, b) * this.scale : 0.0F;
        }
    }

    public float measure(CharSequence text, float size, float letterSpacing) {
        return this.measure(text, size, letterSpacing, false);
    }

    public float measure(CharSequence text, float size, float letterSpacing, boolean tabular) {
        float k = size / 48.0F;
        float width = 0.0F;
        int prev = -1;
        int n = text.length();
        int i = 0;

        while (i < n) {
            int cp = Character.codePointAt(text, i);
            i += Character.charCount(cp);
            if (prev >= 0) {
                width += this.kerningBetween(prev, cp, tabular) * k + letterSpacing;
            }

            width += this.advance(cp, tabular) * k;
            prev = cp;
        }

        return width;
    }

    public float advance(int codepoint, boolean tabular) {
        return tabular && isDigit(codepoint) ? this.tabularAdvance : this.glyph(codepoint).advance();
    }

    public float kerningBetween(int left, int right, boolean tabular) {
        return !tabular || !isDigit(left) && !isDigit(right) ? this.kerning(left, right) : 0.0F;
    }

    public static boolean isDigit(int codepoint) {
        return codepoint >= 48 && codepoint <= 57;
    }

    public float lineHeight(float size) {
        return (this.ascent - this.descent + this.lineGap) * size / 48.0F;
    }

    private Glyph bakeOrMissing(int codepoint) {
        if (STBTruetype.stbtt_FindGlyphIndex(this.info, codepoint) == 0 && codepoint != 32) {
            return this.missing != null ? this.missing : this.bake(63);
        } else {
            Glyph g = this.bake(codepoint);
            return g != null ? g : this.missing;
        }
    }

    private Glyph bake(int codepoint) {
        int[] advance = new int[1];
        int[] bearing = new int[1];
        STBTruetype.stbtt_GetCodepointHMetrics(this.info, codepoint, advance, bearing);
        float adv = advance[0] * this.scale;
        int[] w = new int[1];
        int[] h = new int[1];
        int[] xo = new int[1];
        int[] yo = new int[1];
        ByteBuffer sdf = STBTruetype.stbtt_GetCodepointSDF(this.info, this.scale, codepoint, 6, (byte)-128, 21.333334F, w, h, xo, yo);
        if (sdf == null) {
            return new Glyph(codepoint, adv, 0.0F, 0.0F, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            try {
                int[] at = this.atlas.allocate(w[0], h[0]);
                if (at == null) {
                    LOG.info("Font atlas for {} is full, rebuilding (U+{})", this.name, Integer.toHexString(codepoint));
                    this.rebuildAtlas();
                    at = this.atlas.allocate(w[0], h[0]);
                    if (at == null) {
                        return this.missing;
                    }
                }

                this.atlas.blit(at[0], at[1], w[0], h[0], sdf);
                float aw = this.atlas.width();
                float ah = this.atlas.height();
                return new Glyph(codepoint, adv, xo[0], yo[0], w[0], h[0], at[0] / aw, at[1] / ah, (at[0] + w[0]) / aw, (at[1] + h[0]) / ah);
            } finally {
                STBTruetype.stbtt_FreeSDF(sdf);
            }
        }
    }

    private void rebuildAtlas() {
        this.atlas.reset();
        this.forgetGlyphs();
        this.prewarm(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ąćęłńóśźżĄĆĘŁŃÓŚŹŻ•·×÷°±…–—∞");
    }

    private void forgetGlyphs() {
        this.atlasGeneration = this.atlas.generation();
        Arrays.fill(this.fast, null);
        this.slow.clear();
        this.missing = this.bake(63);
    }

    @Override
    public void close() {
        if (this.ownsAtlas) {
            this.atlas.close();
        }
    }

    @Override
    public String toString() {
        return "Font[" + this.name + ", " + this.data.capacity() + " bytes" + (this.gpos != null ? ", GPOS kerning" : "") + "]";
    }
}
