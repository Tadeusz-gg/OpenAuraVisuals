package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Xo {
    TICKS(),
    CROSS(),
    RING();

    public static final int na;

    private Xo() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2058991246;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        na = var4;
    }
}
