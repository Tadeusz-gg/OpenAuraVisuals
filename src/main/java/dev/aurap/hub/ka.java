package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum ka {
    ALPHA(),
    SCALE();

    public static final int Rj;

    private ka() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 645348811;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Rj = var4;
    }
}
