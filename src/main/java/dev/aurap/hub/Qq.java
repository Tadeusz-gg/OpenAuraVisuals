package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Qq {
    FADED(),
    SOLID(),
    INVERT();

    public static final int x;

    private Qq() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 741231545;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        x = var4;
    }
}
