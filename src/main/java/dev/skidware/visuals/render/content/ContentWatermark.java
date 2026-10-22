package dev.skidware.visuals.render.content;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class ContentWatermark {
    private static final String DOMAIN = "auravisuals/watermark/v2";
    private static final double AMPLITUDE = 0.0017647058823529412;
    public static final int CHANNELS = 4;

    private ContentWatermark() {
    }

    public static double[] offsets(byte[] copyId) {
        byte[] seed = digest(copyId);
        double[] out = new double[4];

        for (int i = 0; i < 4; i++) {
            int b = seed[i] & 255;
            out[i] = (b / 255.0 * 2.0 - 1.0) * 0.0017647058823529412;
        }

        return out;
    }

    public static Map defines(byte[] copyId) {
        double[] offsets = offsets(copyId);
        Map<String, String> defines = new LinkedHashMap<>();

        for (int i = 0; i < 4; i++) {
            defines.put("AURA_WM".concat(Integer.toString(i)), literal(offsets[i]));
        }

        return defines;
    }

    public static Map zero() {
        Map<String, String> defines = new LinkedHashMap<>();

        for (int i = 0; i < 4; i++) {
            defines.put("AURA_WM".concat(Integer.toString(i)), "0.0");
        }

        return defines;
    }

    private static String literal(double value) {
        return String.format(Locale.ROOT, "%.9f", value);
    }

    private static byte[] digest(byte[] copyId) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update("auravisuals/watermark/v2".getBytes(StandardCharsets.US_ASCII));
            md.update((byte)0);
            md.update(copyId);

            for (int salt : new int[]{-914954667, -387592667, 1396552045, -409311256}) {
                md.update((byte)(salt >>> 24));
                md.update((byte)(salt >>> 16));
                md.update((byte)(salt >>> 8));
                md.update((byte)salt);
            }

            return md.digest();
        } catch (NoSuchAlgorithmException var6) {
            throw new IllegalStateException("SHA-256 missing", var6);
        }
    }
}
