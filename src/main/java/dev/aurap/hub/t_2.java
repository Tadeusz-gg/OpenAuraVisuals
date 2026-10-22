package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum t_2 {
    DARK(),
    GLASS();

    public static final int gf;

    private t_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1479969501;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        gf = var4;
    }
}
