package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record kE_2(float Hs, float x) {
    public static final kE_2 SMOOTH;
    public static final kE_2 SNAPPY;
    public static final kE_2 BOUNCY;
    public static final kE_2 GENTLE;
    public static final int QI;

    public kE_2(float Hs, float x) {
        float var7;
        int var3 = (var7 = Hs - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
        if (var3 <= 0) {
            IllegalArgumentException var6 = new IllegalArgumentException("stiffness must be > 0");
            throw var6;
        } else {
            float var8;
            var3 = (var8 = x - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
            if (var3 < 0) {
                IllegalArgumentException var5 = new IllegalArgumentException("damping must be >= 0");
                throw var5;
            } else {
                this.Hs = Hs;
                this.x = x;
            }
        }
    }

    public static kE_2 uY(float var0, float var1) {
        label39: {
            int var2 = QI;
            var2 ^= 1740690228;
            int var3 = (int)var0;
            Integer var4 = var3;
            if (var4 != null) {
                var2 += -476516441;
                var2 ^= -1777537641;
                float var64;
                int var45 = (var64 = var0 - 0.0F) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
                if (var45 <= 0) {
                    var2 ^= -620545322;
                    var2 ^= -451684750;
                    var2 -= 1035972382;
                    var2 <<= 26;
                    var2 ^= -199606750;
                    Integer var52 = var2;
                    if (var52 != null) {
                        IllegalArgumentException var53 = new IllegalArgumentException("response must be > 0");
                        throw var53;
                    }
                    break label39;
                }

                var2 &= -323579775;
                var2 -= 776265114;
                var2 += -563244861;
                var2 *= -1807235347;
                var2 ^= 898043481;
                var45 = var2 + 1;
                var45 = var2 * var45;
                int var5 = var2 + 2;
                var45 *= var5;
                var5 = var2 + 3;
                var45 *= var5;
                var45 &= 7;
                if (var45 != 0) {
                    break label39;
                }

                double var51 = var0;
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var65;
                var3 = (var65 = var6 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var2 |= 1495619867;
                    var2 &= -1697708327;
                    var2 ^= 501995581;
                    Integer var41 = var2;
                    if (var41 != null) {
                        double var42 = (Math.PI * 2) / var51;
                        float var43 = (float)var42;
                        float var57 = var43 * var43;
                        float var60 = 2.0F * var1;
                        float var44 = var60 * var43;
                        return new kE_2(var57, var44);
                    }
                    break label39;
                }

                var2 ^= 993691522;
                var2 ^= -1563459355;
                var2 >>>= 22;
                var2 ^= -130049543;
            } else {
                var2 |= 483550459;
                var2 &= -864212762;
                var2 ^= -272701109;
                var2 ^= -604218979;
            }

            long var35 = var2;
            long var54 = var35 + 1L;
            long var55 = var35 * var54;
            long var36 = var55 & 1L;
            long var66;
            var2 = (var66 = var36 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var39 = new AssertionError();
                throw var39;
            }
        }

        UnsupportedOperationException var38 = new UnsupportedOperationException();
        throw var38;
    }

    public float angularFrequency() {
        int var1 = QI;
        var1 ^= -2114309752;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            Integer var17 = switch (var1) {
                case -2124704074 -> var1 ^ 674102669;
                default -> var1 ^ 965066654;
                case 415743742 -> {
                    var1 *= -1602467195;
                    var1 ^= -1502681116;
                    var1 -= -386099445;
                    yield var1 ^ 334301971;
                }
            };
            if (var17 == null) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            } else {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            var1 += -1252863075;
            var1 ^= -1972666249;
            float var8 = this.Hs;
            double var9 = var8;
            double var10 = Math.sqrt(var9);
            return (float)var10;
        }
    }

    public float dampingRatio() {
        int var1 = QI;
        var1 ^= 1887728851;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            switch (var1) {
                case -635720703:
                    var1 ^= -1366237798;
                    break;
                case -373687387:
                    var1 &= 1534497020;
                    var1 -= 1916790706;
                    var1 += -550763889;
                    var1 ^= 359524048;
                    break;
                case 2134527576:
                default:
                    var1 ^= 395686659;
            }

            float var23 = this.x;
            float var24 = this.angularFrequency();
            var24 = 2.0F * var24;
            return var23 / var24;
        } else {
            var1 += -200063035;
            var1 *= 1007190325;
            var1 ^= -2061375684;
            int var19 = var1 + 1;
            var19 = var1 * var19;
            int var3 = var1 + 2;
            var19 *= var3;
            var1 += 3;
            var19 *= var1;
            var1 = var19 & 7;
            if (var1 != 0) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                AssertionError var10 = new AssertionError();
                throw var10;
            }
        }
    }




    public float stiffness() {
        int var1 = QI;
        var1 ^= -855258557;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 = switch (var1) {
                default -> var1 ^ -1317930409;
                case -51265053 -> var1 ^ 1735361796;
                case 1412973877 -> {
                    var1 &= 64945437;
                    yield var1 ^ -1259099142;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        } else {
            var1 >>= 8;
            var1 ^= -2058135216;
            Integer var10 = var1;
            if (var10 != null) {
                return this.Hs;
            }
        }

        IllegalArgumentException var11 = new IllegalArgumentException();
        throw var11;
    }

    public float damping() {
        int var1 = QI;
        var1 ^= -2143470983;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 |= -2016328876;
            var1 ^= -2007069987;
            long var20 = var1;
            long var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var27;
            int var23 = (var27 = var22 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var23 == 0) {
                return this.x;
            }
        } else {
            Integer var16 = switch (var1) {
                case -1219439982 -> var1 ^ -1551843745;
                default -> var1 ^ -444029557;
                case 419476751 -> {
                    var1 *= -497030309;
                    var1 *= 1019027577;
                    var1 <<= 22;
                    var1 >>= 19;
                    yield var1 ^ -1687020195;
                }
            };
            if (var16 != null) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -189475740;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        QI = var4;
        kE_2 var5 = uY(0.35F, 1.0F);
        SMOOTH = var5;
        kE_2 var6 = uY(0.25F, 0.82F);
        SNAPPY = var6;
        kE_2 var7 = uY(0.4F, 0.55F);
        BOUNCY = var7;
        kE_2 var8 = uY(0.7F, 1.0F);
        GENTLE = var8;
    }
}
