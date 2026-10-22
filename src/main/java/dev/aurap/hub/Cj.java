package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Cj {
    OFF(),
    OK(),
    DENIED(),
    MISSING_TOOL(),
    UNSUPPORTED(),
    ERROR();

    public static final int xc;

    private Cj() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1455511937;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        xc = var4;
    }
}
