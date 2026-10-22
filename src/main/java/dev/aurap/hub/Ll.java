package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Ll {
    RING(),
    PORTAL(),
    BADGE(),
    HEXAGON(),
    BOLD(),
    SCIFI();

    public static final int Sp;

    private Ll() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1014200579;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Sp = var4;
    }
}
