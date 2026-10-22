package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Hl {
    RISE(),
    PHYSICS();

    public static final int m;

    private Hl() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1275234926;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        m = var4;
    }
}
