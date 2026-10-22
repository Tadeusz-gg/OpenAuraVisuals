package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Nb {
    MODERN(),
    COMPACT();

    public static final int Hp;

    private Nb() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -106961647;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Hp = var4;
    }
}
