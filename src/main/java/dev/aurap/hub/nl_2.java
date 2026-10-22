package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum nl_2 {
    STYLE(),
    CUSTOM(),
    OFF();

    public static final int ql;

    private nl_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1827728426;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ql = var4;
    }
}
