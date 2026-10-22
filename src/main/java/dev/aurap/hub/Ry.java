package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Ry {
    THEME(),
    CUSTOM(),
    GRADIENT(),
    RAINBOW();

    public static final int aX;

    private Ry() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -255636774;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        aX = var4;
    }
}
