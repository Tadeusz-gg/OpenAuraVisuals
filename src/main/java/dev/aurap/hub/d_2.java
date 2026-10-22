package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum d_2 {
    WASTED(),
    YOU_DIED(),
    FLATLINE(),
    ELIMINATED();

    public static final int yV;

    private d_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1943190537;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        yV = var4;
    }
}
