package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum K {
    BLIP(),
    CHIME();

    public static final int c;

    private K() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1962884478;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        c = var4;
    }
}
