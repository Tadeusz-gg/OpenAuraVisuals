package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Dx {
    private float A;
    private int g = 100;
    public static final int aK;

    public Dx() {
    }

    public void xJ(float var1, int var2) {
        int var3 = aK;
        var3 ^= -857214424;
        int var5 = System.identityHashCode(this);
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var5 = var6 & 1;
        var6 = of_2.sS;
        var3 ^= var6;
        var3 ^= -1964026;
        var6 = of_2.gl;
        var3 ^= var6;
        var3 ^= -1560118394;
        if (var5 == 0) {
            var3 -= 1342814080;
            var3 ^= -343720634;
            var3 ^= 994186779;
            var5 = var2 + 1;
            var5 = var2 * var5;
            var6 = var2 + 2;
            var5 *= var6;
            var6 = var2 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 == 0) {
                this.A = var1;
                this.g = var2;
                return;
            }
        } else {
            var3 <<= 15;
            var3 += 1483300452;
            var3 *= -1793803439;
            var3 &= 1646428741;
            var3 ^= 508722389;
            Integer var20 = var2;
            if (var20 != null) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        }

        IllegalStateException var21 = new IllegalStateException();
        throw var21;
    }

    public float Zc() {
        int var1 = aK;
        var1 ^= 1813233705;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 &= 1057749672;
            var1 ^= -126989408;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.A;
            }
        } else {
            var1 *= -885275889;
            var1 -= 616497156;
            var1 -= 538070161;
            var1 ^= 738116583;
            Integer var11 = var1;
            if (var11 != null) {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        }

        UnsupportedOperationException var12 = new UnsupportedOperationException();
        throw var12;
    }

    public int rX() {
        int var1 = aK;
        var1 ^= 1917346230;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 != null) {
            var1 = switch (var1) {
                case -1806620653 -> {
                    var1 |= -558998419;
                    var1 *= 1415160725;
                    yield var1 ^ 429184224;
                }
                case -1468422623 -> var1 ^ -1805482738;
                default -> var1 ^ 915135626;
            };
            int var12 = var1 + 1;
            var12 = var1 * var12;
            int var3 = var1 + 2;
            var12 *= var3;
            var3 = var1 + 3;
            var12 *= var3;
            var12 &= 7;
            if (var12 != 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            } else {
                return this.g;
            }
        } else {
            var1 -= -1058915877;
            var1 ^= -603098686;
            IllegalArgumentException var7 = new IllegalArgumentException();
            throw var7;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -929664071;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        aK = var4;
    }
}
