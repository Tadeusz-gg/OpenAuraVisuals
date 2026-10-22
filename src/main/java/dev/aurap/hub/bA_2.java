package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum bA_2 {
    FLY(),
    FALL(),
    FOUNTAIN(),
    BOUNCE(),
    GLIDE(),
    HOP();

    public static final int FZ;

    private bA_2() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 262567893;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        FZ = var4;
    }
}
