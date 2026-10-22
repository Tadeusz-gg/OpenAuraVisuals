package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Ix {
    public static final int u = 0;
    public static final int S = 1;
    public static final int Pk = 2;
    public static final int r = 3;
    private final int UV;
    private final long AF;
    private final int p;
    private final byte[] U;
    private final String Q;
    public static final int Gz;

    public Ix(int var1, long var2, int var4, byte[] var5, String var6) {
        if (var1 >= 0 && var1 <= 3) {
            if (var5 != null) {
                int var9 = var5.length;
                if (var9 > 7168) {
                    IllegalArgumentException var13 = new IllegalArgumentException("body");
                    throw var13;
                }
            }

            this.UV = var1;
            this.AF = var2;
            this.p = var4;
            byte[] var11;
            if (var5 == null) {
                var11 = new byte[0];
                var11 = var11;
            } else {
                Object var8 = var5.clone();
                var8 = (byte[])var8;
                var11 = (byte[])var8;
            }

            this.U = var11;
            String var12;
            if (var6 == null) {
                var12 = "";
            } else {
                var12 = var6;
            }

            this.Q = var12;
        } else {
            IllegalArgumentException var7 = new IllegalArgumentException("status");
            throw var7;
        }
    }

    public byte[] Ir() {
        int var1 = Gz;
        var1 ^= -2030472989;
        int var2 = System.identityHashCode(this);
        byte[] var4 = this.U;
        int var32 = var4.length;
        int var33 = var32 + 64;
        ra var3 = new ra(var33);
        int var34 = rr.bv;
        var3 = var3.T(var34);
        var3 = var3.h(1);
        int var35 = this.UV;
        var3 = var3.h(var35);
        long var36 = this.AF;
        var3 = var3.FX(var36);
        int var37 = this.p;
        var3 = var3.C(var37);
        var4 = this.U;
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var46;
        var2 = (var46 = var5 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 1809102329;
            var1 ^= 543101735;
            IllegalStateException var26 = new IllegalStateException();
            throw var26;
        } else {
            var1 *= 1046097391;
            var1 ^= -2057892144;
            long var12 = var1;
            var5 = var12 + 1L;
            var5 = var12 * var5;
            var7 = var12 + 2L;
            var5 *= var7;
            long var13 = var12 + 3L;
            var5 *= var13;
            long var14 = var5 & 7L;
            long var47;
            var1 = (var47 = var14 - 0L) == 0L ? 0 : (var47 < 0L ? -1 : 1);
            if (var1 == 0) {
                var1 = var4.length;
                ra var18 = var3.C(var1);
                byte[] var24 = this.U;
                ra var19 = var18.N(var24);
                String var25 = this.Q;
                ra var20 = var19.c(var25, 16);
                return var20.ET();
            } else {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }
    }

    public static Ix fc(byte[] var0) throws hh {
        label78: {
            int var1 = Gz;
            var1 ^= -310681685;
            int var2 = System.identityHashCode(var0);
            Gb var3 = new Gb(var0);
            Integer var4 = var2;
            if (var4 == null) {
                switch (var1) {
                    case -1573721684:
                    default:
                        var1 ^= -20114837;
                        break;
                    case -888890829:
                        var1 ^= -1023214608;
                        break;
                    case -61910590:
                        var1 >>= 12;
                        var1 |= -726398087;
                        var1 += 1684025484;
                        var1 &= 1855297340;
                        var1 ^= 99623219;
                }
            } else {
                label90: {
                    var1 &= 94157543;
                    var1 ^= 1055922202;
                    long var83 = var1;
                    long var6 = var83 + 1L;
                    var6 = var83 * var6;
                    long var84 = var6 & 1L;
                    long var112;
                    int var85 = (var112 = var84 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                    if (var85 != 0) {
                        break label78;
                    }

                    var85 = rr.bv;
                    var3.n(var85, "config reply");
                    var3.U();
                    var85 = var3.Co();
                    if (var85 >= 0) {
                        var1 |= 603559292;
                        var1 >>= 12;
                        var1 &= 333729383;
                        var1 ^= 1751836003;
                        var1 ^= -1786693591;
                        long var5 = var1;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var113;
                        int var90 = (var113 = var5 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            break label78;
                        }

                        if (var85 <= 3) {
                            var1 *= 1720895663;
                            var1 += 1675419398;
                            var1 *= 223454065;
                            var1 ^= 1678226949;
                            var5 = var3.nB();
                            var7 = var2;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var115;
                            int var100 = (var115 = var7 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                            if (var100 != 0) {
                                var1 += -324362800;
                                var1 *= 1908837695;
                                var1 |= -286995395;
                                var1 -= 1992843970;
                                var1 ^= -389658490;
                            } else {
                                var1 += 1075791501;
                                var1 |= 1666585640;
                                var1 >>>= 24;
                                var1 |= 353476295;
                                var1 ^= -701252749;
                                int var101 = var3.mA();
                                int var8 = var3.mA();
                                if (var8 > 7168) {
                                    var1 |= 1551003342;
                                    var1 ^= 1338943616;
                                    hh var108 = hh.ug("config body");
                                    throw var108;
                                }
                                var1 = switch (var1) {
                                    case -1895073545 -> var1 ^ -2056986653;
                                    default -> var1 ^ 2006648029;
                                    case -1021172332 -> {
                                        var1 <<= 2;
                                        var1 ^= 693343100;
                                        var1 *= -36143037;
                                        yield var1 ^ 410792891;
                                    }
                                };
                                byte[] var102 = var3.A(var8);
                                String var107 = var3.Hs(16);
                                var3.Cj();
                                int var77 = var2 + 1;
                                int var78 = var2 * var77;
                                var2 = var78 & 1;
                                if (var2 == 0) {
                                    long var73 = switch (var1) {
                                        case -1672313752 -> var1 ^ 1842995366;
                                        default -> var1 ^ -144845776;
                                        case 1551132991 -> {
                                            var1 -= 1283274388;
                                            var1 >>= 31;
                                            var1 -= 1844750473;
                                            yield var1 ^ 1622411066;
                                        }
                                    };
                                    long var10 = var73 + 1L;
                                    var10 = var73 * var10;
                                    long var12 = var73 + 2L;
                                    var10 *= var12;
                                    long var74 = var73 + 3L;
                                    var10 *= var74;
                                    long var75 = var10 & 7L;
                                    long var116;
                                    var2 = (var116 = var75 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                                    if (var2 == 0) {
                                        return new Ix(var85, var5, var101, var102, var107);
                                    }
                                    break label78;
                                }

                                var1 >>= 12;
                                var1 += 354869308;
                                var1 *= 1471840209;
                                var1 -= 313810412;
                                var1 ^= 566083597;
                            }
                            break label90;
                        }

                        switch (var1) {
                            case -34876661:
                                var1 -= -93200605;
                                var1 -= 2105555978;
                                var1 -= 1519048817;
                                var1 ^= -1912083696;
                                var1 ^= 1527226296;
                                break;
                            case 573308484:
                                var1 ^= 1657885769;
                                break;
                            case 1835493158:
                            default:
                                var1 ^= 1770344472;
                        }
                    } else {
                        var1 *= -1927996595;
                        var1 -= 958251360;
                        var1 ^= 892929117;
                    }

                    long var65 = var1;
                    long var79 = var65 + 1L;
                    long var80 = var65 * var79;
                    long var92 = var65 + 2L;
                    long var81 = var80 * var92;
                    long var66 = var65 + 3L;
                    long var82 = var81 * var66;
                    long var67 = var82 & 7L;
                    long var114;
                    var1 = (var114 = var67 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        hh var69 = hh.ug("config status");
                        throw var69;
                    }
                    break label78;
                }
            }

            IllegalArgumentException var72 = new IllegalArgumentException();
            throw var72;
        }

        IllegalArgumentException var70 = new IllegalArgumentException();
        throw var70;
    }

    public int PT() {
        int var1 = Gz;
        var1 ^= 2088430607;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var23;
        var2 = (var23 = var17 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 1586831007;
            var1 += 1546558963;
            var1 += 1168482593;
            var1 ^= 370996203;
            Integer var19 = var1;
            if (var19 != null) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            } else {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            switch (var1) {
                case 673149962:
                default:
                    var1 ^= 1102460394;
                    break;
                case 946155103:
                    var1 ^= -1300455419;
                    break;
                case 1833886310:
                    var1 -= 1150121585;
                    var1 ^= 1459267830;
                    var1 ^= 388050336;
            }

            return this.UV;
        }
    }

    public long x() {
        int var1 = Gz;
        var1 ^= 333199707;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var6 = var15 + 2L;
        var4 *= var6;
        long var16 = var15 + 3L;
        var4 *= var16;
        long var17 = var4 & 7L;
        long var22;
        var2 = (var22 = var17 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -533572153;
            var1 ^= -1540105766;
            return this.AF;
        } else {
            var1 *= 1224347733;
            var1 >>= 9;
            var1 ^= 1901218327;
            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        }
    }

    public int Xs() {
        int var1 = Gz;
        var1 ^= 1686133338;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 &= 1802831715;
            var1 += 1767472407;
            var1 *= 1777794925;
            var1 ^= -207219931;
            long var23 = var1;
            long var4 = var23 + 1L;
            var4 = var23 * var4;
            long var24 = var4 & 1L;
            long var32;
            var2 = (var32 = var24 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.p;
            }
        } else {
            var1 &= -997471590;
            var1 &= 203749314;
            var1 &= -1132142261;
            var1 ^= -1940544449;
            long var16 = var1;
            long var27 = var16 + 1L;
            long var28 = var16 * var27;
            long var5 = var16 + 2L;
            long var29 = var28 * var5;
            long var17 = var16 + 3L;
            long var30 = var29 * var17;
            long var18 = var30 & 7L;
            long var33;
            var1 = (var33 = var18 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public byte[] AL() {
        int var1 = Gz;
        var1 ^= 1684808257;
        int var2 = System.identityHashCode(this);
        byte[] var3 = this.U;
        Object var25 = var3.clone();
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            Integer var20 = switch (var1) {
                default -> var1 ^ 1673449711;
                case 463548296 -> var1 ^ 1403634056;
                case 1968712744 -> {
                    var1 *= 3964941;
                    var1 *= -1121911921;
                    var1 ^= 1504222741;
                    var1 |= 40806531;
                    yield var1 ^ 1606907728;
                }
            };
            if (var20 != null) {
                return (byte[])var25;
            }
        } else {
            var1 >>>= 4;
            var1 += -1420994991;
            var1 *= -1861270387;
            var1 ^= -1738975786;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var26 = var1 + 2;
            var2 *= var26;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public String Z() {
        int var1 = Gz;
        var1 ^= 903636758;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 = switch (var1) {
                case -883570867 -> var1 ^ -1161559600;
                default -> var1 ^ 297379176;
                case 619211135 -> {
                    var1 ^= 739597547;
                    var1 *= 197215707;
                    var1 -= -1153383617;
                    yield var1 ^ 343638476;
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
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var1 ^= 1672556711;
            var1 ^= -1044930802;
            var1 ^= -2121298238;
            long var13 = var1;
            long var27 = var13 + 1L;
            long var28 = var13 * var27;
            long var14 = var28 & 1L;
            long var29;
            var1 = (var29 = var14 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.Q;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1255247998;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Gz = var4;
    }
}
