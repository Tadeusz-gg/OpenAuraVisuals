package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum lB {
    GLOW(),
    OUTLINE(),
    FILL();

    public static final int Sk;

    private lB() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 228013334;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Sk = var4;
    }
}
