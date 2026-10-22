package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum v_2 {
    OFF(),
    BAR(),
    RING();

    public static final int K;

    private v_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1549161419;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        K = var4;
    }
}
