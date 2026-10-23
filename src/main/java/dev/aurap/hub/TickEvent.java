package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class TickEvent {
    public static final TickEvent B;
    public static final int qg;

    private TickEvent() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2098076091;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        qg = var4;
        TickEvent var5 = new TickEvent();
        B = var5;
    }
}
