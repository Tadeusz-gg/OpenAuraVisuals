package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum fA {
    HEALTH(),
    HEARTS();

    public static final int L;

    private fA() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1601388904;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        L = var4;
    }
}
