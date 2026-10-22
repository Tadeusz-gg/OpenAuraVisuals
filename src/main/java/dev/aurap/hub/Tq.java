package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Tq {
    DRIFT(),
    SNOW();

    public static final int Pt;

    private Tq() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1007119123;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Pt = var4;
    }
}
