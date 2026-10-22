package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record HP(boolean M, double YB, double v, double Uy, float Ng, float H, boolean G) {
    private static final HP S;
    public static final int jZ;

    public static HP Aa() {
        return S;
    }

    public static HP G(double var0, double var2, double var4) {
        int var6 = jZ;
        var6 ^= -205983100;
        int var7 = (int)var0;
        long var25 = var7;
        long var9 = var25 + 1L;
        var9 = var25 * var9;
        long var26 = var9 & 1L;
        long var31;
        var7 = (var31 = var26 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        int var8 = of_2.iP;
        var6 ^= var8;
        var6 ^= 380143496;
        of_2.iP = 380143496;
        var8 = of_2.Fi;
        var6 ^= var8;
        var6 ^= 676228549;
        of_2.Fi = 676228549;
        if (var7 == 0) {
            var6 <<= 28;
            var6 >>>= 5;
            var6 ^= 978672095;
            var6 ^= -404560203;
            Integer var28 = var6;
            if (var28 != null) {
                return new HP(true, var0, var2, var4, 1.0F, 1.0F, true);
            }
        } else {
            var6 -= -1008766473;
            var6 ^= -2019499139;
            Integer var22 = var6;
            if (var22 != null) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        }

        IllegalArgumentException var23 = new IllegalArgumentException();
        throw var23;
    }

    public HP scaled(float var1, float var2) {
        int var3 = jZ;
        var3 ^= 525839849;
        int var4 = System.identityHashCode(this);
        Integer var28 = var4;
        int var5 = of_2.iP;
        var3 ^= var5;
        var3 ^= 380143496;
        var5 = of_2.Fi;
        var3 ^= var5;
        var3 ^= 676228549;
        if (var28 == null) {
            var3 -= -1730222985;
            var3 ^= -1561784663;
            var3 ^= -1244182163;
            IllegalStateException var30 = new IllegalStateException();
            throw var30;
        } else {
            var3 &= 1794514964;
            var3 -= -1631991435;
            var3 |= 1332129401;
            var3 ^= -2103414617;
            Integer var23 = var3;
            if (var23 == null) {
                AssertionError var24 = new AssertionError();
                throw var24;
            } else {
                boolean var29 = this.M;
                double var32 = this.YB;
                double var7 = this.v;
                double var9 = this.Uy;
                float var11 = this.Ng;
                var11 *= var1;
                float var12 = this.H;
                var12 *= var2;
                boolean var13 = this.G;
                return new HP(var29, var32, var7, var9, var11, var12, var13);
            }
        }
    }

    public HP withoutCombo() {
        int var1 = jZ;
        var1 ^= 1897526927;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var6 = var22 + 2L;
        var4 *= var6;
        long var23 = var22 + 3L;
        var4 *= var23;
        long var24 = var4 & 7L;
        long var38;
        var2 = (var38 = var24 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 2064035888;
            var1 -= 327594350;
            var1 &= -1925399522;
            var1 ^= -375428973;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                boolean var32 = this.M;
                double var36 = this.YB;
                double var37 = this.v;
                double var8 = this.Uy;
                float var10 = this.Ng;
                float var11 = this.H;
                return new HP(var32, var36, var37, var8, var10, var11, false);
            }
        } else {
            var1 &= -1173934315;
            var1 ^= 208554544;
            Integer var19 = var1;
            if (var19 != null) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }




    public boolean positional() {
        int var1 = jZ;
        var1 ^= -1927323890;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 -= -607734930;
            var1 ^= -474381604;
            var14 = var1;
            if (var14 != null) {
                return this.M;
            }
        } else {
            Integer var11 = switch (var1) {
                default -> var1 ^ -247087542;
                case -865497423 -> var1 ^ 1158441880;
                case 1720918733 -> {
                    var1 |= -641383719;
                    var1 ^= -1577560265;
                    var1 |= -1307135199;
                    var1 &= -1488420809;
                    yield var1 ^ -1015782800;
                }
            };
            if (var11 != null) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            }
        }

        UnsupportedOperationException var12 = new UnsupportedOperationException();
        throw var12;
    }

    public double x() {
        int var1 = jZ;
        var1 ^= 1764625929;
        int var2 = System.identityHashCode(this);
        long var13 = var2;
        long var4 = var13 + 1L;
        var4 = var13 * var4;
        long var14 = var4 & 1L;
        long var17;
        var2 = (var17 = var14 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -142521343;
            var1 &= -2146950289;
            var1 ^= 2141132762;
            return this.YB;
        } else {
            var1 >>>= 28;
            var1 ^= 1240127845;
            IllegalArgumentException var9 = new IllegalArgumentException();
            throw var9;
        }
    }

    public double y() {
        int var1 = jZ;
        var1 ^= 1992001492;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 = switch (var1) {
                case -1772238143 -> var1 ^ 1993129100;
                case -1657275881 -> {
                    var1 *= -2046455605;
                    var1 |= -143084325;
                    var1 >>>= 15;
                    yield var1 ^ 1042289257;
                }
                default -> var1 ^ -1746480378;
            };
            int var13 = var1 + 1;
            var13 = var1 * var13;
            var13 &= 1;
            if (var13 != 0) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            } else {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            }
        } else {
            switch (var1) {
                case -1657275881:
                    var1 |= 541996417;
                    var1 ^= 1775828363;
                    break;
                case -1146341596:
                default:
                    var1 ^= 1526029502;
                    break;
                case -887972503:
                    var1 ^= -1287109237;
            }

            return this.v;
        }
    }

    public double z() {
        int var1 = jZ;
        var1 ^= -683444867;
        int var2 = System.identityHashCode(this);
        long var12 = var2;
        long var4 = var12 + 1L;
        var4 = var12 * var4;
        long var13 = var4 & 1L;
        long var16;
        var2 = (var16 = var13 - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += -784748304;
            var1 ^= -666398465;
            return this.Uy;
        } else {
            var1 >>>= 15;
            var1 ^= -561216773;
            IllegalArgumentException var9 = new IllegalArgumentException();
            throw var9;
        }
    }

    public float volumeScale() {
        int var1 = jZ;
        var1 ^= 98721914;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var16 = var4 & 1L;
        long var22;
        var2 = (var22 = var16 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 = switch (var1) {
                case -480053135 -> var1 ^ 1952936749;
                case -294773319 -> {
                    var1 >>= 18;
                    yield var1 ^ -2006167545;
                }
                default -> var1 ^ 1577761425;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.Ng;
            }
        } else {
            var1 >>>= 24;
            var1 *= 1137862737;
            var1 ^= 904036471;
            Integer var12 = var1;
            if (var12 != null) {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            }
        }

        IllegalStateException var13 = new IllegalStateException();
        throw var13;
    }

    public float pitchScale() {
        int var1 = jZ;
        var1 ^= -1617929376;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var33;
        var2 = (var33 = var22 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= 115097432;
            var1 |= 1055220380;
            var1 *= -2063371479;
            var1 |= 480483546;
            var1 ^= 1345822244;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var25 = var4 & 1L;
            long var34;
            var2 = (var34 = var25 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.H;
            } else {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        } else {
            var1 += -993799342;
            var1 -= -1631702624;
            var1 += 1297770269;
            var1 ^= -2027917416;
            var1 ^= 1745146380;
            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        }
    }

    public boolean combo() {
        int var1 = jZ;
        var1 ^= 1221079436;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var28;
        var2 = (var28 = var22 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += -1437885763;
            var1 >>>= 3;
            var1 &= 926696637;
            var1 ^= 998708696;
            UnsupportedOperationException var24 = new UnsupportedOperationException();
            throw var24;
        } else {
            var1 ^= 821111876;
            var1 -= 285281098;
            var1 ^= 2081414878;
            var1 >>= 30;
            var1 ^= -87176402;
            Integer var14 = var1;
            if (var14 == null) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            } else {
                return this.G;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1816710106;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        jZ = var4;
        HP var5 = new HP(false, 0.0, 0.0, 0.0, 1.0F, 1.0F, true);
        S = var5;
    }
}
