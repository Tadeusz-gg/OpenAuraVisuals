package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record J(String bone, float[] from, float[] to, float[] origin, float[][] uv) {
    public static final int jB;




    public String bone() {
        int var1 = jB;
        var1 ^= 1427655581;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -1279940387:
                    var1 >>= 26;
                    var1 ^= 73260504;
                    var1 ^= 495819960;
                    var1 &= -1571901639;
                    var1 ^= 1877721181;
                    break;
                case -731191269:
                default:
                    var1 ^= -80038739;
                    break;
                case 821621876:
                    var1 ^= 1666308728;
            }

            return this.bone;
        } else {
            var1 -= -857590581;
            var1 ^= 980034476;
            AssertionError var7 = new AssertionError();
            throw var7;
        }
    }

    public float[] from() {
        int var1 = jB;
        var1 ^= 1094896698;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 *= 183709293;
            var1 -= -1219367807;
            var1 &= 1436993907;
            var1 ^= -466957983;
            return this.from;
        } else {
            var1 -= 231336940;
            var1 *= -1068884501;
            var1 ^= -1653825407;
            var1 += 1952717871;
            var1 ^= -1720527160;
            AssertionError var9 = new AssertionError();
            throw var9;
        }
    }

    public float[] to() {
        int var1 = jB;
        var1 ^= 552267522;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var16 = var4 & 1L;
        long var26;
        var2 = (var26 = var16 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 535528297;
            var1 ^= 541363455;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.to;
            } else {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var1 &= -1458957048;
            var1 += -1762345445;
            var1 -= 820881648;
            var1 |= -1428044795;
            var1 ^= 1054396440;
            RuntimeException var12 = new RuntimeException();
            throw var12;
        }
    }

    public float[] origin() {
        int var1 = jB;
        var1 ^= -237396731;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 |= -1943162164;
            var1 -= 444297700;
            var1 *= 2006386943;
            var1 ^= -449748544;
            var1 ^= -1945918100;
            return this.origin;
        } else {
            Integer var7 = switch (var1) {
                case 393510469 -> {
                    var1 >>= 5;
                    yield var1 ^ 66340687;
                }
                case 1822453126 -> var1 ^ -1278690834;
                default -> var1 ^ -975781416;
            };
            if (var7 == null) {
                AssertionError var9 = new AssertionError();
                throw var9;
            } else {
                IllegalStateException var8 = new IllegalStateException();
                throw var8;
            }
        }
    }

    public float[][] uv() {
        int var1 = jB;
        var1 ^= 871741055;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var20 = var4 & 1L;
        long var27;
        var2 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 1791032854;
            var1 >>= 23;
            var1 ^= 1749085888;
            IllegalStateException var22 = new IllegalStateException();
            throw var22;
        } else {
            var1 &= -820824149;
            var1 &= -1418204150;
            var1 ^= -666836141;
            long var11 = var1;
            long var3 = var11 + 1L;
            var3 = var11 * var3;
            long var5 = var11 + 2L;
            var3 *= var5;
            long var12 = var11 + 3L;
            var3 *= var12;
            long var13 = var3 & 7L;
            long var28;
            var1 = (var28 = var13 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 != 0) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            } else {
                return this.uv;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1094790417;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        jB = var4;
    }
}
