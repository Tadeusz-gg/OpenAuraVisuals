package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum fy {
    TERMINAL(),
    REAUTHENTICATE(),
    ACTIVATE(),
    RETRY_NOW(),
    RETRY_LATER(),
    USER_ACTION(),
    FIX_CLIENT();

    public static final int Zc;

    private fy() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -725840637;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Zc = var4;
    }
}
