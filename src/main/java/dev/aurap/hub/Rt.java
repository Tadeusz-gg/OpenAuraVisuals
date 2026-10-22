package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Rt {
    BLACK(),
    THEME();

    public static final int RN;

    private Rt() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1328286164;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        RN = var4;
    }
}
