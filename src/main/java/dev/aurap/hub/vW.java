package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record vW(boolean Am, boolean e, boolean xA) {
    public static final int fV;




    public boolean showServer() {
        int var1 = fV;
        var1 ^= -1476327608;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 &= 1587561821;
            var1 ^= 364371847;
            UnsupportedOperationException var15 = new UnsupportedOperationException();
            throw var15;
        } else {
            var1 |= 498422532;
            var1 ^= -705495309;
            long var8 = var1;
            long var17 = var8 + 1L;
            long var18 = var8 * var17;
            long var9 = var18 & 1L;
            long var19;
            var1 = (var19 = var9 - 0L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.Am;
            } else {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            }
        }
    }

    public boolean showElapsed() {
        int var1 = fV;
        var1 ^= 1404446873;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var33;
        var2 = (var33 = var21 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 != 0) {
            long var23 = switch (var1) {
                case -1863373597 -> {
                    var1 >>>= 4;
                    var1 *= -1276389491;
                    var1 ^= -2002642992;
                    var1 -= -481811430;
                    yield var1 ^ -288849421;
                }
                case -1201569704 -> var1 ^ 50184769;
                default -> var1 ^ 421921132;
            };
            var4 = var23 + 1L;
            var4 = var23 * var4;
            long var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var34;
            var2 = (var34 = var25 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            var1 &= 1333964994;
            var1 ^= -1669062418;
            var1 *= -1712146291;
            var1 ^= -1716126612;
            Integer var18 = var1;
            if (var18 != null) {
                return this.e;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    public boolean showButton() {
        int var1 = fV;
        var1 ^= -1766746416;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 >>>= 11;
            var1 |= 82730975;
            var1 |= 752454613;
            var1 ^= 1006850899;
            AssertionError var15 = new AssertionError();
            throw var15;
        } else {
            var1 -= 453241890;
            var1 |= 183489643;
            var1 ^= -1380593208;
            Integer var8 = var1;
            if (var8 == null) {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            } else {
                return this.xA;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 56167392;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        fV = var4;
    }
}
