package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum BZ {
    GHOSTS(),
    CIRCLE(),
    MARKER(),
    SPIRAL(),
    CORNERS(),
    CHEVRONS(),
    SPINNER(),
    SCIFI();

    public static final int aG;

    private BZ() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 348919378;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        aG = var4;
    }
}
