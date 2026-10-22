package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum YJ {
    IMPACT(),
    BODY();

    public static final int ax;

    private YJ() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -360017033;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ax = var4;
    }
}
