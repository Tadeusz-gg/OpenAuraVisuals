package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record oK(Class B, int a, wD OK) {
    public static final int Bs;

    public kf subscribe(PH var1) {
        int var2 = Bs;
        var2 ^= 476892081;
        int var3 = System.identityHashCode(this);
        Class var4 = this.B;
        int var5 = this.a;
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var38;
        var3 = (var38 = var6 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var3 != 0) {
            Integer var26 = switch (var2) {
                default -> var2 ^ -1808019664;
                case -148288296 -> var2 ^ 2109505328;
                case 1170385125 -> {
                    var2 += 1446335433;
                    var2 += -1064384258;
                    var2 <<= 1;
                    var2 &= -1646865210;
                    yield var2 ^ -1328107126;
                }
            };
            if (var26 != null) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            }
        } else {
            var2 = switch (var2) {
                case 727689270 -> var2 ^ 707811599;
                case 1170385125 -> {
                    var2 |= 149249983;
                    var2 &= 2095888229;
                    yield var2 ^ 121717823;
                }
                default -> var2 ^ -1550321731;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var34 = var2 + 2;
            var3 *= var34;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                wD var24 = this.OK;
                return var1.DP(var4, var5, var24);
            }
        }

        RuntimeException var23 = new RuntimeException();
        throw var23;
    }




    public Class type() {
        int var1 = Bs;
        var1 ^= -439846584;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= 1219983161;
            var1 ^= 1699967066;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.B;
            }
        } else {
            var1 ^= -231008254;
            var1 ^= 968118213;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            }
        }

        UnsupportedOperationException var11 = new UnsupportedOperationException();
        throw var11;
    }

    public int priority() {
        int var1 = Bs;
        var1 ^= -329441548;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var26;
        var2 = (var26 = var19 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -398671576;
            var1 &= -2055340770;
            var1 ^= 784288581;
            Integer var21 = var1;
            if (var21 != null) {
                return this.a;
            } else {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            var1 -= 1081714855;
            var1 &= 404284589;
            var1 &= -2092922602;
            var1 ^= -1909620149;
            UnsupportedOperationException var13 = new UnsupportedOperationException();
            throw var13;
        }
    }

    public wD listener() {
        int var1 = Bs;
        var1 ^= -983195373;
        int var2 = System.identityHashCode(this);
        long var14 = var2;
        long var4 = var14 + 1L;
        var4 = var14 * var4;
        long var15 = var4 & 1L;
        long var28;
        var2 = (var28 = var15 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1666436088;
            var1 -= -1782614897;
            var1 ^= 1281144226;
            long var17 = var1;
            var4 = var17 + 1L;
            var4 = var17 * var4;
            long var6 = var17 + 2L;
            var4 *= var6;
            long var18 = var17 + 3L;
            var4 *= var18;
            long var19 = var4 & 7L;
            long var29;
            var2 = (var29 = var19 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            } else {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            var1 &= -840102515;
            var1 ^= 1508053769;
            return this.OK;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1774409311;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Bs = var4;
    }
}
