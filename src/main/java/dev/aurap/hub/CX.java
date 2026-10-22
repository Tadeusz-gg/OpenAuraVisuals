package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum CX implements oF {
    UNIFORM("Uniform"),
    WEIGHTED("Weighted");

    private final String j;
    public static final int ih;

    private CX(String var3) {
        this.j = var3;
    }

    @Override
    public String displayName() {
        int var1 = ih;
        var1 ^= -1314006712;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 ^= 1786564299;
            var1 += 692400269;
            var1 ^= 1211974824;
            var1 *= 1243405425;
            var1 ^= 227109984;
            long var22 = var1;
            long var34 = var22 + 1L;
            long var35 = var22 * var34;
            long var6 = var22 + 2L;
            long var36 = var35 * var6;
            long var23 = var22 + 3L;
            long var37 = var36 * var23;
            long var24 = var37 & 7L;
            long var38;
            var2 = (var38 = var24 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.j;
            }
        } else {
            var1 &= -74531674;
            var1 ^= -2033592422;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1187536027;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        ih = var4;
    }
}
