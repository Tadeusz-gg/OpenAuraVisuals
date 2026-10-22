package dev.skidware.visuals.render.text;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public final class FontFamily implements AutoCloseable {
    private static final int ATLAS_SIZE = 2048;
    private final String name;
    private final FontAtlas atlas;
    private final Font[] faces = new Font[FontWeight.values().length];

    private FontFamily(String name, FontAtlas atlas) {
        this.name = name;
        this.atlas = atlas;
    }

    public static FontFamily load(String name, Function<FontWeight, byte[]> files) {
        FontFamily family = new FontFamily(name, new FontAtlas(2048, 2048));
        Map<FontWeight, Font> loaded = new EnumMap<>(FontWeight.class);

        for (FontWeight w : FontWeight.values()) {
            byte[] ttf = files.apply(w);
            if (ttf != null) {
                loaded.put(w, Font.load(name + "-" + w.name().toLowerCase(Locale.ROOT), ttf, family.atlas));
            }
        }

        if (loaded.isEmpty()) {
            throw new IllegalArgumentException("Font family " + name + " has no faces");
        } else {
            for (FontWeight wx : FontWeight.values()) {
                family.faces[wx.ordinal()] = nearest(loaded, wx);
            }

            return family;
        }
    }

    private static Font nearest(Map<FontWeight, Font> loaded, FontWeight wanted) {
        Font best = null;
        int bestDistance = Integer.MAX_VALUE;

        for (Entry<FontWeight, Font> e : loaded.entrySet()) {
            int distance = Math.abs(e.getKey().css() - wanted.css()) * 2 - (e.getKey().css() > wanted.css() ? 1 : 0);
            if (distance < bestDistance) {
                bestDistance = distance;
                best = e.getValue();
            }
        }

        return best;
    }

    public String name() {
        return this.name;
    }

    public Font face(FontWeight weight) {
        return this.faces[weight.ordinal()];
    }

    public Font regular() {
        return this.face(FontWeight.REGULAR);
    }

    public FontAtlas atlas() {
        return this.atlas;
    }

    @Override
    public void close() {
        this.atlas.close();
    }
}
