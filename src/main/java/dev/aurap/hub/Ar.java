package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record Ar(Gu f, long e) {
    public static final Ar TOGGLE;
    public static final Ar NEXT;
    public static final Ar PREVIOUS;
    public static final Ar RESTART;
    public static final int nq;

    public static Ar ge(long var0) {
        int var2 = nq;
        var2 ^= 789631919;
        int var3 = (int)var0;
        long var16 = var3;
        long var5 = var16 + 1L;
        var5 = var16 * var5;
        long var17 = var5 & 1L;
        long var29;
        var3 = (var29 = var17 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 ^= -466186715;
            var2 |= 1625180669;
            var2 ^= 726207701;
            var2 ^= 1290059431;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                Gu var26 = Gu.SEEK;
                var5 = Math.max(0L, var0);
                return new Ar(var26, var5);
            } else {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var2 += 612207756;
            var2 &= 1465936995;
            var2 ^= 72038533;
            IllegalArgumentException var11 = new IllegalArgumentException();
            throw var11;
        }
    }




    public Gu kind() {
        int var1 = nq;
        var1 ^= -9306461;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.Kx;
        var1 ^= var3;
        var1 ^= -194859278;
        of_2.Kx = -194859278;
        var3 = of_2.qa;
        var1 ^= var3;
        var1 ^= -1022963785;
        of_2.qa = -1022963785;
        if (var2 == 0) {
            Integer var22 = switch (var1) {
                case -959554867 -> var1 ^ -490783190;
                default -> var1 ^ -1627829850;
                case 275715232 -> {
                    var1 *= -612040255;
                    yield var1 ^ -1037976287;
                }
            };
            if (var22 != null) {
                return this.f;
            }
        } else {
            long var16 = switch (var1) {
                default -> var1 ^ -1434411412;
                case 275715232 -> {
                    var1 |= 505904426;
                    var1 >>>= 17;
                    var1 *= -1686012439;
                    yield var1 ^ -1337730526;
                }
                case 603654211 -> var1 ^ 718692735;
            };
            long var26 = var16 + 1L;
            long var27 = var16 * var26;
            long var17 = var27 & 1L;
            long var28;
            var1 = (var28 = var17 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    public long argument() {
        int var1 = nq;
        var1 ^= 147935545;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var30;
        var2 = (var30 = var22 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -405816518:
                    var1 |= 274062924;
                    var1 += -1253676396;
                    var1 ^= 387668743;
                    var1 ^= -739942493;
                    break;
                case 46952901:
                default:
                    var1 ^= 1352745211;
                    break;
                case 668698039:
                    var1 ^= 1447079618;
            }

            AssertionError var28 = new AssertionError();
            throw var28;
        } else {
            var1 = switch (var1) {
                case -1063486957 -> var1 ^ -15131614;
                case -405816518 -> {
                    var1 *= -747737451;
                    var1 *= -1763442509;
                    var1 ^= -1491603704;
                    var1 |= -1308076020;
                    yield var1 ^ -1395609241;
                }
                default -> var1 ^ 1357293892;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.e;
            } else {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1776767675;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        nq = var4;
        Gu var9 = Gu.TOGGLE;
        Ar var5 = new Ar(var9, 0L);
        TOGGLE = var5;
        Gu var10 = Gu.NEXT;
        Ar var6 = new Ar(var10, 0L);
        NEXT = var6;
        Gu var11 = Gu.PREVIOUS;
        Ar var7 = new Ar(var11, 0L);
        PREVIOUS = var7;
        Gu var12 = Gu.RESTART;
        Ar var8 = new Ar(var12, 0L);
        RESTART = var8;
    }
}
