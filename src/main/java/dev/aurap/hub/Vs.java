package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Vs {
    NONE(),
    SQUARE(),
    HUE(),
    ALPHA();

    public static final int za;

    private Vs() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -594278487;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        za = var4;
    }
}
