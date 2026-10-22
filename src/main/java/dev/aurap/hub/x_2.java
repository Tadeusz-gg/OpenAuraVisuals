package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum x_2 {
    SOLID(),
    GLOW();

    public static final int gm;

    private x_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1247105209;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        gm = var4;
    }
}
