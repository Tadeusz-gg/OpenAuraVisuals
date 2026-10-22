package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class JL extends xB {
    private final boolean Bd;
    private boolean L;
    public static final int U;

    public JL(String var1, String var2, boolean var3) {
        super(var1, var2);
        this.Bd = var3;
        this.L = var3;
    }

    public boolean vb() {
        int var1 = U;
        var1 ^= -1210704872;
        int var2 = System.identityHashCode(this);
        long var24 = var2;
        long var4 = var24 + 1L;
        var4 = var24 * var4;
        long var6 = var24 + 2L;
        var4 *= var6;
        long var25 = var24 + 3L;
        var4 *= var25;
        long var26 = var4 & 7L;
        long var36;
        var2 = (var36 = var26 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        int var3 = of_2.qG;
        var1 ^= var3;
        var1 ^= 1220043223;
        of_2.qG = 1220043223;
        var3 = of_2.w;
        var1 ^= var3;
        var1 ^= 784599903;
        of_2.w = 784599903;
        if (var2 != 0) {
            var1 |= 1614589560;
            var1 |= -270690118;
            var1 += 195226923;
            var1 <<= 15;
            var1 ^= -1235956656;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                RuntimeException var31 = new RuntimeException();
                throw var31;
            }
        } else {
            var1 += 189601706;
            var1 |= -1720335874;
            var1 ^= -1800305846;
            var1 ^= 1202130931;
            Integer var22 = var1;
            if (var22 != null) {
                return this.L;
            }
        }

        IllegalStateException var23 = new IllegalStateException();
        throw var23;
    }

    public void Y(boolean var1) {
        label31: {
            int var2 = U;
            var2 ^= 49088958;
            int var3 = System.identityHashCode(this);
            int var4 = (this.L ? 1 : 0);
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            int var6 = of_2.qG;
            var2 ^= var6;
            var2 ^= 1220043223;
            var6 = of_2.w;
            var2 ^= var6;
            var2 ^= 784599903;
            if (var5 == 0) {
                var2 += -1175627129;
                var2 *= 1611542839;
                var2 ^= -1982467074;
                var2 ^= -139944085;
                if ((var4 != 0) == var1) {
                    var2 >>= 1;
                    var2 >>= 18;
                    var2 ^= -334381661;
                    var2 ^= -213913131;
                    return;
                }

                var2 += -739331365;
                var2 >>= 31;
                var2 ^= 1482965187;
                var2 ^= 1416672458;
                this.L = var1;
                var4 = var3 + 1;
                var4 = var3 * var4;
                var5 = var3 + 2;
                var4 *= var5;
                var3 += 3;
                var4 *= var3;
                var3 = var4 & 7;
                if (var3 == 0) {
                    var2 <<= 1;
                    var2 &= 1558472738;
                    var2 &= -427573935;
                    var2 *= -1371792327;
                    var2 ^= -1397128786;
                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var4 = var2 + 2;
                    var3 *= var4;
                    var4 = var2 + 3;
                    var3 *= var4;
                    var3 &= 7;
                    if (var3 == 0) {
                        this.lU();
                        return;
                    }
                    break label31;
                }

                var2 -= 222837815;
                var2 -= -1056985519;
                var2 ^= -115756062;
                var2 ^= 789130886;
            } else {
                var2 >>>= 7;
                var2 ^= -368741762;
            }

            long var35 = var2;
            long var54 = var35 + 1L;
            long var55 = var35 * var54;
            long var62 = var35 + 2L;
            long var56 = var55 * var62;
            long var36 = var35 + 3L;
            long var57 = var56 * var36;
            long var37 = var57 & 7L;
            long var63;
            var2 = (var63 = var37 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var40 = new IllegalStateException();
                throw var40;
            }
        }

        UnsupportedOperationException var39 = new UnsupportedOperationException();
        throw var39;
    }

    public void lK() {
        int var1 = U;
        var1 ^= -1478735395;
        int var2 = System.identityHashCode(this);
        int var3 = (this.L ? 1 : 0);
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        label41:
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ -1316382146;
                case 1229065677 -> {
                    var1 ^= 1701142763;
                    var1 *= -50505811;
                    yield var1 ^ -1618817366;
                }
                case 1349181924 -> var1 ^ 141164740;
            };
            int var35;
            if (var3 == 0) {
                var1 |= 1836448485;
                var1 ^= -572316598;
                long var31 = var1;
                long var43 = var31 + 1L;
                long var44 = var31 * var43;
                long var6 = var31 + 2L;
                long var45 = var44 * var6;
                long var32 = var31 + 3L;
                long var46 = var45 * var32;
                long var33 = var46 & 7L;
                long var51;
                var35 = (var51 = var33 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
                if (var35 != 0) {
                    break label41;
                }

                var35 = 1;
                var1 *= 802481737;
                var1 ^= -1075597421;
            } else {
                var1 ^= -2010488420;
                var1 ^= 1706175794;
                long var36 = var1;
                long var47 = var36 + 1L;
                long var48 = var36 * var47;
                long var7 = var36 + 2L;
                long var49 = var48 * var7;
                long var37 = var36 + 3L;
                long var50 = var49 * var37;
                long var38 = var50 & 7L;
                long var52;
                var3 = (var52 = var38 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                if (var3 != 0) {
                    break label41;
                }

                var35 = 0;
                var1 ^= 2006306623;
                var1 ^= -672335903;
            }

            this.Y((var35 != 0));
            return;
        } else {
            Integer var15 = switch (var1) {
                default -> var1 ^ 1796184508;
                case 1229065677 -> {
                    var1 >>>= 8;
                    var1 *= -259109063;
                    var1 += -670108506;
                    var1 &= -452996682;
                    yield var1 ^ 151923345;
                }
                case 1463850296 -> var1 ^ -1618128698;
            };
            if (var15 != null) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        AssertionError var28 = new AssertionError();
        throw var28;
    }

    public Boolean nk() {
        int var1 = U;
        var1 ^= 1598822123;
        int var2 = System.identityHashCode(this);
        boolean var3 = this.L;
        Integer var15 = var2;
        if (var15 != null) {
            switch (var1) {
                case -1868907386:
                default:
                    var1 ^= 1212014100;
                    break;
                case -1311616261:
                    var1 *= -1684656989;
                    var1 ^= -1214838649;
                    break;
                case 1134329099:
                    var1 ^= 147832750;
            }

            return var3;
        } else {
            var1 = switch (var1) {
                case -1311616261 -> {
                    var1 -= 605309450;
                    var1 -= -1296527109;
                    yield var1 ^ 1003440567;
                }
                case 97037435 -> var1 ^ 381712820;
                default -> var1 ^ 1509197316;
            };
            int var16 = var1 + 1;
            var16 = var1 * var16;
            var1 = var16 & 1;
            if (var1 == 0) {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            } else {
                RuntimeException var9 = new RuntimeException();
                throw var9;
            }
        }
    }

    public void YI(Boolean var1) {
        int var2 = U;
        var2 ^= -178103475;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            var2 &= 104652561;
            var2 ^= 1848130215;
            Integer var17 = var2;
            if (var17 == null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            } else {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        } else {
            switch (var2) {
                case -1838212506:
                default:
                    var2 ^= -2073176356;
                    break;
                case 469507933:
                    var2 += -35863111;
                    var2 |= 737520577;
                    var2 ^= 1594460662;
                    break;
                case 1828091361:
                    var2 ^= -369262013;
            }

            boolean var12 = var1;
            this.Y(var12);
        }
    }

    public Boolean I() {
        int var1 = U;
        var1 ^= 1654199208;
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
        if (var2 == 0) {
            var1 |= -328076461;
            var1 &= 1822427374;
            var1 ^= 1221624883;
            boolean var24 = this.Bd;
            return var24;
        } else {
            switch (var1) {
                case -1945675848:
                    var1 |= 1679496052;
                    var1 ^= 1124548532;
                    var1 *= -1259935953;
                    var1 &= 1210348694;
                    var1 ^= -1595985703;
                    break;
                case 260287286:
                default:
                    var1 ^= -1824131085;
                    break;
                case 1034839214:
                    var1 ^= 1731050360;
            }

            AssertionError var16 = new AssertionError();
            throw var16;
        }
    }

    @Override
    public Object yW() {
        int var1 = U;
        var1 ^= 1038158778;
        int var2 = System.identityHashCode(this);
        boolean var3 = this.L;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var36;
        var2 = (var36 = var4 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 1574311726;
            var1 ^= -1614862270;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var37;
            var2 = (var37 = var4 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            var1 &= -2113732586;
            var1 += -1603667424;
            var1 <<= 11;
            var1 &= 330746161;
            var1 ^= -485388245;
            long var18 = var1;
            var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var38;
            var1 = (var38 = var19 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var1 == 0) {
                return var3;
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    @Override
    public boolean YT(Object var1) {
        int var2 = U;
        var2 ^= 778569683;
        int var3 = System.identityHashCode(this);
        boolean var4 = var1 instanceof Boolean;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        label67:
        if (var5 == 0) {
            var2 ^= 1862823052;
            var2 -= -175999944;
            var2 ^= -473736958;
            var2 ^= -917987823;
            long var71 = var2;
            long var7 = var71 + 1L;
            var7 = var71 * var7;
            long var9 = var71 + 2L;
            var7 *= var9;
            long var72 = var71 + 3L;
            var7 *= var72;
            long var73 = var7 & 7L;
            long var96;
            var5 = (var96 = var73 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var5 == 0) {
                if (var4) {
                    var2 = switch (var2) {
                        case -1863287804 -> {
                            var2 += -1287352794;
                            var2 -= -737905349;
                            var2 *= 632579761;
                            yield var2 ^ 708337258;
                        }
                        default -> var2 ^ 1545181128;
                        case 1759575901 -> var2 ^ -1679734949;
                    };
                    Integer var66 = var2;
                    if (var66 != null) {
                        Boolean var67 = (Boolean)var1;
                        Integer var75 = var3;
                        if (var75 == null) {
                            switch (var2) {
                                case 96628053:
                                    var2 *= -518269495;
                                    var2 ^= 662094614;
                                    break label67;
                                case 140081000:
                                default:
                                    var2 ^= -1512505916;
                                    break label67;
                                case 497429929:
                                    var2 ^= 651033813;
                                    break label67;
                            }
                        }

                        var2 *= -1052209845;
                        var2 -= -1199024560;
                        var2 += -179006065;
                        var2 ^= -807522769;
                        var2 ^= 939491640;
                        int var76 = var2 + 1;
                        var76 = var2 * var76;
                        int var6 = var2 + 2;
                        var76 *= var6;
                        var6 = var2 + 3;
                        var76 *= var6;
                        var76 &= 7;
                        if (var76 == 0) {
                            var2 &= 1180443075;
                            var2 *= -577795769;
                            var2 &= 169412342;
                            var2 *= -322996805;
                            var2 ^= -594994587;
                            Integer var81 = var2;
                            if (var81 != null) {
                                boolean var68 = var67;
                                long var82 = var3;
                                var7 = var82 + 1L;
                                var7 = var82 * var7;
                                var9 = var82 + 2L;
                                var7 *= var9;
                                long var83 = var82 + 3L;
                                var7 *= var83;
                                long var84 = var7 & 7L;
                                long var97;
                                var3 = (var97 = var84 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                                if (var3 != 0) {
                                    switch (var2) {
                                        case -2113751500:
                                            var2 ^= -256313581;
                                            break label67;
                                        case 1553738567:
                                            var2 <<= 18;
                                            var2 -= 2108563670;
                                            var2 ^= -340670984;
                                            var2 |= 360528698;
                                            var2 ^= 1964861521;
                                            break label67;
                                        case 1804886622:
                                        default:
                                            var2 ^= 1028375809;
                                            break label67;
                                    }
                                }

                                var2 += -1401536307;
                                var2 >>= 16;
                                var2 ^= 1546935273;
                                var2 &= 1437241227;
                                var2 ^= -538054459;
                                var3 = var2 + 1;
                                var3 = var2 * var3;
                                int var85 = var2 + 2;
                                var3 *= var85;
                                var85 = var2 + 3;
                                var3 *= var85;
                                var3 &= 7;
                                if (var3 == 0) {
                                    this.Y(var68);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    var2 |= -964577447;
                    var2 -= 1787325187;
                    var2 ^= 190716148;
                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        return false;
                    }
                }
            }

            RuntimeException var65 = new RuntimeException();
            throw var65;
        } else {
            switch (var2) {
                case -1558857116:
                    var2 ^= 1182412271;
                    break;
                case -1057602621:
                    var2 &= 545962925;
                    var2 ^= 980268602;
                    var2 -= -2516019;
                    var2 ^= -1678357947;
                    break;
                case 1715784785:
                default:
                    var2 ^= -607598207;
            }
        }

        UnsupportedOperationException var52 = new UnsupportedOperationException();
        throw var52;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 636670862;
        int var2 = xB.nu;
        int var4 = of_2.ro(var3, var1, var2);
        U = var4;
    }

    @Override
    public Object a() {
        return this.I();
    }

    @Override
    public void t(Object var1) {
        this.YI((Boolean)var1);
    }

    @Override
    public Object cQ() {
        return this.nk();
    }
}
