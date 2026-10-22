package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class XK {
    public float jQ;
    public float i = 1.0F;
    public float mz = 1.0F;
    public float dW;
    public float C;
    public float A;
    public boolean a;
    public String MZ = "";
    public String Ry = "";
    public String W = "";
    public int K;
    public static final int I;

    public XK() {
    }

    public float Os(float var1) {
        int var2 = I;
        var2 ^= 137908947;
        int var3 = System.identityHashCode(this);
        float var4 = this.C;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var49;
        var3 = (var49 = var5 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
        int var35 = of_2.Ik;
        var2 ^= var35;
        var2 ^= -924068123;
        of_2.Ik = -924068123;
        int var36 = of_2.Ta;
        var2 ^= var36;
        var2 ^= -1819336878;
        of_2.Ta = -1819336878;
        if (var3 != 0) {
            var2 >>>= 31;
            var2 |= -1567892358;
            var2 ^= -41209331;
            var5 = var2;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var50;
            var3 = (var50 = var5 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
            if (var3 == 0) {
                UnsupportedOperationException var30 = new UnsupportedOperationException();
                throw var30;
            }
        } else {
            var2 += -1225607532;
            var2 *= 2083909591;
            var2 ^= 1981665383;
            long var22 = var2;
            var5 = var22 + 1L;
            var5 = var22 * var5;
            var7 = var22 + 2L;
            var5 *= var7;
            long var23 = var22 + 3L;
            var5 *= var23;
            long var24 = var5 & 7L;
            long var51;
            var2 = (var51 = var24 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
            if (var2 == 0) {
                float var27 = var4 * 0.5F;
                float var31 = this.A;
                float var32 = var31 - var1;
                return Math.min(var27, var32);
            }
        }

        IllegalStateException var26 = new IllegalStateException();
        throw var26;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 310062474;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        I = var4;
    }
}
