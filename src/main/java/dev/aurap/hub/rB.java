package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum rB implements oF {
    NATIVE("Native", 0.0F),
    CLASSIC("4:3", 1.3333334F),
    STRETCHED("5:4", 1.25F),
    WIDE("16:9", 1.7777778F),
    CINEMA("21:9", 2.3333333F),
    CUSTOM("Custom", 0.0F);

    private final String f;
    public final float ratio;
    public static final int rV;

    private rB(String var3, float var4) {
        this.f = var3;
        this.ratio = var4;
    }

    @Override
    public String displayName() {
        int var1 = rV;
        var1 ^= 1074399748;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var31;
        var2 = (var31 = var18 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 561182276;
            var1 *= 1483598951;
            var1 += 1745702965;
            var1 >>>= 2;
            var1 ^= -1500407861;
            long var20 = var1;
            var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var32;
            var2 = (var32 = var22 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 != 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            } else {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            var1 &= 630010040;
            var1 ^= -54130698;
            var1 ^= 1676436146;
            return this.f;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1851026064;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        rV = var4;
    }
}
