package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum D {
    VANILLA(),
    SMOOTH(),
    PUNCH(),
    SLIDE(),
    CHOP(),
    ARC(),
    SWEEP(),
    REVERSE(),
    UPPERCUT(),
    THRUST(),
    SPIN(),
    BLOCK_HIT();

    public static final int Go;

    private D() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1364104412;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Go = var4;
    }
}
