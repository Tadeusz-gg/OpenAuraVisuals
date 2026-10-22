package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum H {
    DENIED(),
    MISSING_TOOL(),
    UNSUPPORTED();

    public static final int py;

    private H() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 969600328;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        py = var4;
    }
}
