package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Gu {
    TOGGLE(),
    NEXT(),
    PREVIOUS(),
    RESTART(),
    SEEK();

    public static final int iP;

    private Gu() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -693182006;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        iP = var4;
    }
}
