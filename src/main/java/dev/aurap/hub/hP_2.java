package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record hP_2(long startMs, String ay) {
    public static final int KW;

    public boolean isBreak() {
        int var1 = KW;
        var1 ^= 2062818262;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var29;
        var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= -1896923587;
            var1 &= -1894657271;
            var1 <<= 11;
            var1 ^= -1130358502;
            IllegalArgumentException var24 = new IllegalArgumentException();
            throw var24;
        } else {
            var1 -= 1072228790;
            var1 ^= -1035492151;
            long var11 = var1;
            long var3 = var11 + 1L;
            var3 = var11 * var3;
            long var12 = var3 & 1L;
            long var30;
            var1 = (var30 = var12 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                String var15 = this.ay;
                return var15.isBlank();
            } else {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        }
    }




    public long startMs() {
        int var1 = KW;
        var1 ^= -374516239;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 += -1142020890;
            var1 |= -500058996;
            var1 *= -1040792921;
            var1 ^= 1697970374;
            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        } else {
            var1 -= 1726755846;
            var1 *= 2123292417;
            var1 += 1622834802;
            var1 ^= 379770956;
            Integer var8 = var1;
            if (var8 != null) {
                return this.startMs;
            } else {
                RuntimeException var9 = new RuntimeException();
                throw var9;
            }
        }
    }

    public String text() {
        int var1 = KW;
        var1 ^= -1897404068;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var37;
        var2 = (var37 = var22 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -204219673;
            var1 -= 1658521512;
            var1 ^= 64667580;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            var6 = var24 + 2L;
            var4 *= var6;
            long var25 = var24 + 3L;
            var4 *= var25;
            long var26 = var4 & 7L;
            long var38;
            var2 = (var38 = var26 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.ay;
            }
        } else {
            var1 *= 1858444707;
            var1 += -340662601;
            var1 ^= 884582462;
            long var15 = var1;
            long var3 = var15 + 1L;
            var3 = var15 * var3;
            long var16 = var3 & 1L;
            long var39;
            var1 = (var39 = var16 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1478197032;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        KW = var4;
    }
}
