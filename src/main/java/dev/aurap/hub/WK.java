package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record WK(String XT, float q, float c, float N, float o, int L) {
    public static final int hM;

    public WK(String XT, float q, float c, float N, float o, int L) {
        if (XT != null) {
            int var7 = (XT.contains(":")) ? 1 : 0;
            if (var7 != 0) {
                float var14;
                var7 = (var14 = q - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
                if (var7 >= 0) {
                    float var15;
                    var7 = (var15 = c - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                    if (var7 > 0) {
                        this.XT = XT;
                        this.q = q;
                        this.c = c;
                        this.N = N;
                        this.o = o;
                        this.L = L;
                        return;
                    }
                }

                String var13 = "Invalid volume/pitch for " + XT;
                IllegalArgumentException var12 = new IllegalArgumentException(var13);
                throw var12;
            }
        }

        String var8 = "Sound id must be namespaced: " + XT;
        IllegalArgumentException var9 = new IllegalArgumentException(var8);
        throw var9;
    }

    public static WK vY(String var0) {
        int var1 = hM;
        var1 ^= -1721973134;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.I;
        var1 ^= var3;
        var1 ^= 1186804733;
        of_2.I = 1186804733;
        var3 = of_2.B;
        var1 ^= var3;
        var1 ^= -1330247516;
        of_2.B = -1330247516;
        if (var2 == 0) {
            var1 -= -296035189;
            var1 -= -1370731256;
            var1 ^= 1319608604;
            var1 ^= -1477338956;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return new WK(var0, 1.0F, 1.0F, 0.0F, 0.0F, 0);
            }
        } else {
            var1 ^= 1499432433;
            var1 ^= -105684065;
            long var16 = var1;
            long var35 = var16 + 1L;
            long var36 = var16 * var35;
            long var17 = var36 & 1L;
            long var37;
            var1 = (var37 = var17 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public WK volume(float var1) {
        int var2 = hM;
        var2 ^= -825146087;
        int var3 = System.identityHashCode(this);
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var7 = var19 + 2L;
        var5 *= var7;
        long var20 = var19 + 3L;
        var5 *= var20;
        long var21 = var5 & 7L;
        long var41;
        var3 = (var41 = var21 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 += 1680977310;
            var2 >>= 21;
            var2 *= 969513153;
            var2 ^= -1457706658;
            long var23 = var2;
            var5 = var23 + 1L;
            var5 = var23 * var5;
            var7 = var23 + 2L;
            var5 *= var7;
            long var24 = var23 + 3L;
            var5 *= var24;
            long var25 = var5 & 7L;
            long var42;
            var3 = (var42 = var25 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            }
        } else {
            var2 = switch (var2) {
                case -999587575 -> {
                    var2 >>= 21;
                    var2 -= 1408182462;
                    yield var2 ^ -1787485351;
                }
                default -> var2 ^ -1370516463;
                case 1176742275 -> var2 ^ -1172332464;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                String var30 = this.XT;
                float var4 = this.c;
                float var38 = this.N;
                float var6 = this.o;
                int var40 = this.L;
                return new WK(var30, var1, var4, var38, var6, var40);
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public WK pitch(float var1) {
        int var2 = hM;
        var2 ^= -1802234877;
        int var3 = System.identityHashCode(this);
        Integer var15 = var3;
        if (var15 == null) {
            var2 -= -332893338;
            var2 ^= 1911866652;
            int var17 = var2 + 1;
            var17 = var2 * var17;
            var17 &= 1;
            if (var17 != 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            } else {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            var2 &= 1355645954;
            var2 += -1385786677;
            var2 |= 487013034;
            var2 ^= -1692001866;
            String var16 = this.XT;
            float var4 = this.q;
            float var5 = this.N;
            float var6 = this.o;
            int var7 = this.L;
            return new WK(var16, var4, var1, var5, var6, var7);
        }
    }

    public WK jitter(float var1, float var2) {
        int var3 = hM;
        var3 ^= -732248570;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var4 += 3;
        var5 *= var4;
        var4 = var5 & 7;
        if (var4 == 0) {
            var3 |= -1649813989;
            var3 ^= -60869794;
            var3 ^= 1160196206;
            Integer var22 = var3;
            if (var22 != null) {
                String var28 = this.XT;
                float var29 = this.q;
                float var7 = this.c;
                int var8 = this.L;
                return new WK(var28, var29, var7, var1, var2, var8);
            }
        } else {
            var3 &= 464587730;
            var3 += -70224153;
            var3 *= -409897157;
            var3 ^= 417103515;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 == 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    public WK delay(int var1) {
        int var2 = hM;
        var2 ^= -330484131;
        int var4 = System.identityHashCode(this);
        Integer var21 = var4;
        if (var21 != null) {
            var2 &= 1550263761;
            var2 += 1610521124;
            var2 >>= 22;
            var2 ^= -1203437588;
            long var3 = var1;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            var3 = var5 & 1L;
            long var25;
            int var19 = (var25 = var3 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var19 == 0) {
                String var22 = this.XT;
                float var24 = this.q;
                float var6 = this.c;
                float var7 = this.N;
                float var8 = this.o;
                return new WK(var22, var24, var6, var7, var8, var1);
            } else {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var2 <<= 14;
            var2 |= -1219505065;
            var2 ^= 46055855;
            RuntimeException var13 = new RuntimeException();
            throw var13;
        }
    }




    public String sound() {
        int var1 = hM;
        var1 ^= 1873209922;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var31;
        var2 = (var31 = var21 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 566704511;
            var1 *= 678543471;
            var1 += 916341644;
            var1 |= 51200712;
            var1 ^= 1248654551;
            RuntimeException var27 = new RuntimeException();
            throw var27;
        } else {
            var1 = switch (var1) {
                case 1273116908 -> var1 ^ 795720979;
                default -> var1 ^ 1436303051;
                case 1696345682 -> {
                    var1 |= 1406776361;
                    yield var1 ^ 776934839;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.XT;
            } else {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            }
        }
    }

    public float volume() {
        int var1 = hM;
        var1 ^= 1688000442;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            switch (var1) {
                case -1307832484:
                    var1 ^= 1862703605;
                    break;
                case 1259849501:
                default:
                    var1 ^= 1891824436;
                    break;
                case 1847989162:
                    var1 &= -1212382321;
                    var1 ^= 1119015546;
            }

            IllegalArgumentException var13 = new IllegalArgumentException();
            throw var13;
        } else {
            var1 <<= 13;
            var1 >>= 2;
            var1 += 929620403;
            var1 ^= -1280197900;
            return this.q;
        }
    }

    public float pitch() {
        int var1 = hM;
        var1 ^= 1095852996;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            switch (var1) {
                case -1188685469:
                default:
                    var1 ^= 929972804;
                    break;
                case 108505467:
                    var1 ^= -1633872027;
                    break;
                case 1273735124:
                    var1 <<= 15;
                    var1 ^= -1301647385;
            }

            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            var1 -= 301650659;
            var1 += -791576299;
            var1 -= 1818107234;
            var1 |= -368893230;
            var1 ^= -1423754132;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            int var3 = var1 + 2;
            var18 *= var3;
            var1 += 3;
            var18 *= var1;
            var1 = var18 & 7;
            if (var1 != 0) {
                AssertionError var12 = new AssertionError();
                throw var12;
            } else {
                return this.c;
            }
        }
    }

    public float pitchJitter() {
        int var1 = hM;
        var1 ^= -239229949;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var33;
        var2 = (var33 = var23 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 &= 522443815;
            var1 += -326343581;
            var1 -= 1842766822;
            var1 *= -1426242383;
            var1 ^= 1617972914;
            RuntimeException var29 = new RuntimeException();
            throw var29;
        } else {
            var1 = switch (var1) {
                case -397415088 -> var1 ^ 1421090981;
                case -83402733 -> {
                    var1 += 328551048;
                    var1 *= 1245133451;
                    var1 |= -568884959;
                    yield var1 ^ 1921090791;
                }
                default -> var1 ^ 1017431263;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.N;
            } else {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        }
    }

    public float volumeJitter() {
        int var1 = hM;
        var1 ^= -1769576022;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var23;
        var2 = (var23 = var18 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 >>>= 30;
            var1 -= 1612947556;
            var1 ^= 1760272870;
            var1 ^= -858433503;
            AssertionError var20 = new AssertionError();
            throw var20;
        } else {
            var1 |= -1415517234;
            var1 ^= -2082465162;
            long var9 = var1;
            long var3 = var9 + 1L;
            var3 = var9 * var3;
            long var10 = var3 & 1L;
            long var24;
            var1 = (var24 = var10 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var1 != 0) {
                UnsupportedOperationException var12 = new UnsupportedOperationException();
                throw var12;
            } else {
                return this.o;
            }
        }
    }

    public int delayMs() {
        int var1 = hM;
        var1 ^= -73604609;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 = switch (var1) {
                case -249158161 -> {
                    var1 *= 733028457;
                    var1 *= -1336191019;
                    var1 -= 913757983;
                    yield var1 ^ 435575949;
                }
                default -> var1 ^ 1100690228;
                case 1034865332 -> var1 ^ -656031881;
            };
            int var19 = var1 + 1;
            var19 = var1 * var19;
            int var3 = var1 + 2;
            var19 *= var3;
            var3 = var1 + 3;
            var19 *= var3;
            var19 &= 7;
            if (var19 == 0) {
                return this.L;
            }
        } else {
            var1 = switch (var1) {
                case -249158161 -> {
                    var1 |= 810470625;
                    var1 ^= -1034013803;
                    var1 *= 1933119335;
                    var1 += 553543554;
                    yield var1 ^ 1151276276;
                }
                case -38830512 -> var1 ^ 887767838;
                default -> var1 ^ -288253669;
            };
            int var24 = var1 + 1;
            var24 = var1 * var24;
            int var29 = var1 + 2;
            var24 *= var29;
            var1 += 3;
            var24 *= var1;
            var1 = var24 & 7;
            if (var1 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1178505373;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        hM = var4;
    }
}
