package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum e_2 {
    BLADE(),
    METAL(),
    GRIP();

    public static final int fF;

    private e_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -132406925;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        fF = var4;
    }
}
