package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Fb {
    THEME(),
    CUSTOM();

    public static final int G;

    private Fb() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 71782159;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        G = var4;
    }
}
