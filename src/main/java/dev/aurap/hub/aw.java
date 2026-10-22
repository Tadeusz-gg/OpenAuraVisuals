package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record aw(Cl_2 J, float HD, float FN) {
    public static final int Gb;

    public float resolveX(float var1, float var2) {
        int var3 = Gb;
        var3 ^= 3430443;
        int var4 = System.identityHashCode(this);
        Cl_2 var5 = this.J;
        float var25 = var5.fx;
        float var6 = var1 - var2;
        float var26 = var25 * var6;
        int var31 = var4 + 1;
        int var32 = var4 * var31;
        int var7 = var4 + 2;
        int var33 = var32 * var7;
        var4 += 3;
        int var34 = var33 * var4;
        var4 = var34 & 7;
        if (var4 == 0) {
            switch (var3) {
                case -294231456:
                    var3 ^= -1156371585;
                    break;
                case 102031661:
                default:
                    var3 ^= -2117619819;
                    break;
                case 735613005:
                    var3 >>= 23;
                    var3 ^= 1767950807;
            }

            float var24 = this.HD;
            return var26 + var24;
        } else {
            var3 ^= 1677385869;
            var3 ^= -1220588983;
            long var12 = var3;
            long var27 = var12 + 1L;
            long var28 = var12 * var27;
            long var35 = var12 + 2L;
            long var29 = var28 * var35;
            long var13 = var12 + 3L;
            long var30 = var29 * var13;
            long var14 = var30 & 7L;
            long var36;
            var3 = (var36 = var14 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            } else {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            }
        }
    }

    public float resolveY(float var1, float var2) {
        int var3 = Gb;
        var3 ^= 857328326;
        int var4 = System.identityHashCode(this);
        Cl_2 var5 = this.J;
        float var26 = var5.fy;
        float var6 = var1 - var2;
        long var7 = var4;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var32;
        var4 = (var32 = var7 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var4 != 0) {
            var3 ^= 1129723333;
            var3 *= -1921466837;
            var3 ^= 1414116741;
            Integer var23 = var3;
            if (var23 != null) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var3 *= -26191259;
            var3 ^= 1433493388;
            Integer var19 = var3;
            if (var19 != null) {
                float var21 = var26 * var6;
                float var25 = this.FN;
                return var21 + var25;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }




    public Cl_2 anchor() {
        int var1 = Gb;
        var1 ^= 287227239;
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
            var1 += -764840558;
            var1 ^= 279997436;
            return this.J;
        } else {
            var1 &= -1761958375;
            var1 ^= 1029145274;
            var1 ^= 1569546542;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            }
        }
    }

    public float offsetX() {
        int var1 = Gb;
        var1 ^= 1333222607;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var32;
        var2 = (var32 = var20 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 1797995993;
            var1 ^= -1909802664;
            var1 ^= 6389654;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            } else {
                return this.HD;
            }
        } else {
            var1 ^= -1403722060;
            var1 &= -1661932309;
            var1 &= -1734070689;
            var1 -= 2076236547;
            var1 ^= 1208272373;
            AssertionError var14 = new AssertionError();
            throw var14;
        }
    }

    public float offsetY() {
        int var1 = Gb;
        var1 ^= 350871696;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 == null) {
            var1 *= -561477527;
            var1 &= -1922630159;
            var1 ^= 403594434;
            AssertionError var12 = new AssertionError();
            throw var12;
        } else {
            var1 *= 567382171;
            var1 ^= -810853888;
            Integer var6 = var1;
            if (var6 != null) {
                return this.FN;
            } else {
                IllegalStateException var7 = new IllegalStateException();
                throw var7;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -166057419;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Gb = var4;
    }
}
