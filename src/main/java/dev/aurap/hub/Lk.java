package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Lk {
    COMPACT(),
    ANNOUNCE(),
    EXPANDED();

    public static final int Pr;

    private Lk() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2059761396;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Pr = var4;
    }
}
