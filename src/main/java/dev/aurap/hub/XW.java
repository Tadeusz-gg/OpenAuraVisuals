package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum XW {
    PARTICLES(),
    FIREFLIES(),
    BOTH();

    public static final int h;

    private XW() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1123011846;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        h = var4;
    }
}
