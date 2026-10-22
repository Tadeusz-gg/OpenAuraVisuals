package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum BR {
    OFFLINE(),
    SYNCING(),
    SYNCED(),
    PENDING(),
    FAILED();

    public static final int GO;

    private BR() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 46164697;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        GO = var4;
    }
}
