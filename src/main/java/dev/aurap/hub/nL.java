package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class nL {
    public static final int El = 0;
    public static final int GW = 1;
    public static final int K = 2;
    public static final int YX = 3;
    public final int nU;
    public final long Kx;
    public final int UX;
    public final byte[] E;
    public final String NZ;
    public static final int i;

    public nL(int var1, long var2, int var4, byte[] var5, String var6) {
        this.nU = var1;
        this.Kx = var2;
        this.UX = var4;
        byte[] var8;
        if (var5 == null) {
            var8 = new byte[0];
            var8 = var8;
        } else {
            var8 = var5;
        }

        this.E = var8;
        String var9;
        if (var6 == null) {
            var9 = "";
        } else {
            var9 = var6;
        }

        this.NZ = var9;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1731236264;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        i = var4;
    }
}
