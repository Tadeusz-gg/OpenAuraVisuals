package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum XE {
    STEADY(),
    REDUCED(),
    SOFT();

    public static final int hF;

    private XE() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -617268344;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        hF = var4;
    }
}
