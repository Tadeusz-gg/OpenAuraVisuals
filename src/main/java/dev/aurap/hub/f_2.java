package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum f_2 {
    PLAYERS(),
    LIVING(),
    COMBAT_TARGET();

    public static final int qp;

    private f_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -379361114;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        qp = var4;
    }
}
