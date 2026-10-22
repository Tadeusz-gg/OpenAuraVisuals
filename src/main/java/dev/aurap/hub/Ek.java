package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Ek {
    OFF(),
    MOVEMENT(),
    COOLDOWN(),
    BOTH();

    public static final int V;

    private Ek() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -672112152;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        V = var4;
    }
}
