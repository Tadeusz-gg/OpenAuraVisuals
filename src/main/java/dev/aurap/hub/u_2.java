package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum u_2 {
    POP(),
    FADE(),
    SNAP();

    public static final int q;

    private u_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1296127439;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        q = var4;
    }
}
