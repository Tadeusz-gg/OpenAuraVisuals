package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum b_2 {
    FIXED(),
    FOLLOW();

    public static final int Wf;

    private b_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1398761644;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Wf = var4;
    }
}
