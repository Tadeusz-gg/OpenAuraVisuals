package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum qr {
    MAIN(),
    ACCENT(),
    ERASE();

    public static final int Lc;

    private qr() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 486819279;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Lc = var4;
    }
}
