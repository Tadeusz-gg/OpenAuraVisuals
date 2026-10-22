package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum bW {
    IDLE(),
    SPRING(),
    TWEEN();

    public static final int xI;

    private bW() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 706830565;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        xI = var4;
    }
}
