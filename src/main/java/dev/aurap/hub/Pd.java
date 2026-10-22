package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record Pd(String IN, List<WK> N, int a, float X, int k, int yD) {
    public static final int Mf;

    public Pd(String IN, List<WK> N, int a, float X, int k, int yD) {
        List var7 = List.copyOf(N);
        boolean var10 = var7.isEmpty();
        if (var10) {
            String var8 = "Cue " + IN + " has no layers";
            IllegalArgumentException var11 = new IllegalArgumentException(var8);
            throw var11;
        } else {
            this.IN = IN;
            this.N = var7;
            this.a = a;
            this.X = X;
            this.k = k;
            this.yD = yD;
        }
    }

    public static hn gz(String var0) {
        int var1 = Mf;
        var1 ^= 2126583411;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += -1317301181;
            var1 += 919336696;
            var1 ^= -800726013;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return new hn(var0);
            }
        } else {
            var1 |= -1809618455;
            var1 ^= 985864559;
            var1 ^= -1309908862;
            long var12 = var1;
            long var22 = var12 + 1L;
            long var23 = var12 * var22;
            long var13 = var23 & 1L;
            long var24;
            var1 = (var24 = var13 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }




    public String id() {
        int var1 = Mf;
        var1 ^= 737154305;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var35;
        var2 = (var35 = var22 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 >>= 23;
            var1 ^= 1409664467;
            var1 += 1712645562;
            var1 -= -78652603;
            var1 ^= 711916312;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var6 = var24 + 2L;
            var4 *= var6;
            long var25 = var24 + 3L;
            var4 *= var25;
            long var26 = var4 & 7L;
            long var36;
            var2 = (var36 = var26 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var28 = new IllegalArgumentException();
                throw var28;
            }
        } else {
            var1 ^= 38876644;
            var1 &= -634112081;
            var1 ^= 1614798230;
            long var17 = var1;
            long var3 = var17 + 1L;
            var3 = var17 * var3;
            long var18 = var3 & 1L;
            long var37;
            var1 = (var37 = var18 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.IN;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public List layers() {
        int var1 = Mf;
        var1 ^= 1907912429;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var29;
        var2 = (var29 = var17 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 2086919838;
            var1 ^= 1634936483;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var1 -= 1336035691;
            var1 ^= 928766432;
            var1 ^= -2136863151;
            long var12 = var1;
            long var26 = var12 + 1L;
            var26 = var12 * var26;
            long var13 = var26 & 1L;
            long var30;
            var1 = (var30 = var13 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.N;
            }
        }

        UnsupportedOperationException var15 = new UnsupportedOperationException();
        throw var15;
    }

    public int cooldownMs() {
        int var1 = Mf;
        var1 ^= -1370995802;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            switch (var1) {
                case -1265074348:
                    var1 ^= 59917988;
                    break;
                case -1114776896:
                default:
                    var1 ^= -1250117612;
                    break;
                case 738930370:
                    var1 &= 1786049231;
                    var1 ^= 852590302;
                    var1 ^= -828949689;
            }

            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            long var11 = switch (var1) {
                case -1579551874 -> var1 ^ -2053423028;
                case 738930370 -> {
                    var1 |= -1066597612;
                    var1 *= -1526407363;
                    var1 >>= 18;
                    var1 -= 1124516338;
                    yield var1 ^ 216472641;
                }
                default -> var1 ^ 1572514939;
            };
            long var26 = var11 + 1L;
            long var27 = var11 * var26;
            long var12 = var27 & 1L;
            long var28;
            var1 = (var28 = var12 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.a;
            } else {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        }
    }

    public float comboPitchStep() {
        int var1 = Mf;
        var1 ^= -1438433007;
        int var2 = System.identityHashCode(this);
        long var14 = var2;
        long var4 = var14 + 1L;
        var4 = var14 * var4;
        long var15 = var4 & 1L;
        long var24;
        var2 = (var24 = var15 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 287764148;
            var1 ^= -1956897939;
            long var17 = var1;
            var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var25;
            var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var1 -= 917816578;
            var1 *= 1941934145;
            var1 ^= -427940308;
            Integer var12 = var1;
            if (var12 != null) {
                return this.X;
            }
        }

        IllegalStateException var13 = new IllegalStateException();
        throw var13;
    }

    public int maxCombo() {
        int var1 = Mf;
        var1 ^= 974906426;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 == null) {
            var1 = switch (var1) {
                case -1202157218 -> {
                    var1 <<= 13;
                    var1 *= 1860943337;
                    var1 |= -1311019398;
                    yield var1 ^ -569112705;
                }
                default -> var1 ^ -1074620638;
                case 445156288 -> var1 ^ -419139062;
            };
            int var16 = var1 + 1;
            var16 = var1 * var16;
            int var3 = var1 + 2;
            var16 *= var3;
            var3 = var1 + 3;
            var16 *= var3;
            var16 &= 7;
            if (var16 == 0) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        } else {
            var1 ^= -1960791025;
            var1 += 1554724627;
            var1 -= -816292853;
            var1 ^= 420545005;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            var1 = var22 & 1;
            if (var1 == 0) {
                return this.k;
            }
        }

        IllegalArgumentException var14 = new IllegalArgumentException();
        throw var14;
    }

    public int comboWindowMs() {
        int var1 = Mf;
        var1 ^= -865043021;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var27;
        var2 = (var27 = var18 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= 1824665716;
            var1 ^= 746856062;
            long var20 = var1;
            var4 = var20 + 1L;
            var4 = var20 * var4;
            long var21 = var4 & 1L;
            long var28;
            var2 = (var28 = var21 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.yD;
            }
        } else {
            var1 >>= 9;
            var1 >>>= 14;
            var1 ^= 799682552;
            long var12 = var1;
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var13 = var3 & 1L;
            long var29;
            var1 = (var29 = var13 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 927057550;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Mf = var4;
    }
}
