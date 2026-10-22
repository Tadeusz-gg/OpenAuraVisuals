package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Ru {
    MIXED(),
    STARS(),
    HEARTS(),
    BLOOM(),
    SPARKLES(),
    CRYSTALS(),
    SNOWFLAKES(),
    DOLLARS(),
    CROWNS(),
    FIREFLIES(),
    GLYPHS(),
    CUSTOM();

    public static final int Bc;

    private Ru() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 113379009;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Bc = var4;
    }
}
