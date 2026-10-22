package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum gm_3 {
    HOP(),
    GLIDE();

    public static final int U;

    private gm_3() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -772830217;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        U = var4;
    }
}
