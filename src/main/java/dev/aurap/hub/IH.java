package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum IH {
    PORTAL(),
    RING(),
    DOUBLE(),
    HEXAGON(),
    BOLD();

    public static final int R;

    private IH() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1113169709;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        R = var4;
    }
}
