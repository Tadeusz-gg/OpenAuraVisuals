package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class YH {
    private final dZ_2 X;
    private float Eg;
    private float e = 1.0F;
    private boolean dA;
    public static final int A;

    YH(dZ_2 var1) {
        this.X = var1;
    }

    public YH J(boolean var1) {
        int var2 = A;
        var2 ^= 1641427098;
        int var3 = System.identityHashCode(this);
        Integer var14 = var3;
        if (var14 == null) {
            var2 -= -1796300937;
            var2 ^= -1157167957;
            int var15 = var2 + 1;
            var15 = var2 * var15;
            var15 &= 1;
            if (var15 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        } else {
            var2 += 1397663491;
            var2 += 639235551;
            var2 ^= 1530645536;
            int var19 = var2 + 1;
            var19 = var2 * var19;
            int var4 = var2 + 2;
            var19 *= var4;
            var2 += 3;
            var19 *= var2;
            var2 = var19 & 7;
            if (var2 == 0) {
                this.dA = var1;
                return this;
            }
        }

        AssertionError var13 = new AssertionError();
        throw var13;
    }

    public YH fQ(float var1) {
        int var2 = A;
        var2 ^= -968962628;
        int var3 = System.identityHashCode(this);
        Integer var21 = var3;
        if (var21 == null) {
            var2 *= -1080665545;
            var2 |= -828106565;
            var2 |= -1942183510;
            var2 += -1208850523;
            var2 ^= 929893775;
            long var22 = var2;
            long var5 = var22 + 1L;
            var5 = var22 * var5;
            long var7 = var22 + 2L;
            var5 *= var7;
            long var23 = var22 + 3L;
            var5 *= var23;
            long var24 = var5 & 7L;
            long var31;
            int var25 = (var31 = var24 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var25 == 0) {
                AssertionError var26 = new AssertionError();
                throw var26;
            }
        } else {
            var2 += -608803476;
            var2 ^= 252734186;
            long var17 = var2;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var32;
            var2 = (var32 = var18 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                this.e = var1;
                return this;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public void s(float var1) {
        label80: {
            int var26;
            label79: {
                var26 = A;
                var26 ^= 750306053;
                int var3 = System.identityHashCode(this);
                float var4 = this.Eg;
                Integer var5 = var3;
                if (var5 != null) {
                    var26 = switch (var26) {
                        default -> var26 ^ 1188197387;
                        case 241805617 -> var26 ^ 1887375222;
                        case 1504470204 -> {
                            var26 >>>= 14;
                            var26 += -1828654907;
                            yield var26 ^ 531808082;
                        }
                    };
                    int var65 = var26 + 1;
                    var65 = var26 * var65;
                    int var6 = var26 + 2;
                    var65 *= var6;
                    var6 = var26 + 3;
                    var65 *= var6;
                    var65 &= 7;
                    if (var65 != 0) {
                        break label80;
                    }

                    float var70 = this.e;
                    float var71 = var1 * var70;
                    var4 += var71;
                    this.Eg = var4;
                    boolean var51 = this.dA;
                    if (!var51) {
                        var26 >>= 15;
                        var26 ^= 1156690603;
                        break label79;
                    }
                    var26 = switch (var26) {
                        case -1934563292 -> {
                            var26 ^= 449541952;
                            var26 <<= 14;
                            var26 >>= 23;
                            yield var26 ^ -1469661296;
                        }
                        default -> var26 ^ 827602568;
                        case 767654225 -> var26 ^ -576430357;
                    };
                    int var52 = var26 + 1;
                    int var53 = var26 * var52;
                    int var54 = var53 & 1;
                    if (var54 != 0) {
                        break label80;
                    }

                    dZ_2 var55 = this.X;
                    var65 = var3 + 1;
                    var65 = var3 * var65;
                    var65 &= 1;
                    if (var65 == 0) {
                        var26 <<= 28;
                        var26 |= 1440832423;
                        var26 |= 973450026;
                        var26 ^= 209683993;
                        Integer var75 = var26;
                        if (var75 == null) {
                            break label80;
                        }

                        var4 = var55.aw();
                        float var83;
                        int var57 = (var83 = var4 - 0.0F) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
                        if (var57 <= 0) {
                            var26 *= 1765713523;
                            var26 ^= 150001416;
                            break label79;
                        }

                        var26 |= -289418372;
                        var26 ^= -1992203967;
                        var26 ^= -1157879730;
                        int var58 = var26 + 1;
                        int var59 = var26 * var58;
                        int var60 = var59 & 1;
                        if (var60 != 0) {
                            break label80;
                        }

                        var4 = this.Eg;
                        dZ_2 var76 = this.X;
                        float var77 = var76.aw();
                        var4 %= var77;
                        Integer var41 = var3;
                        if (var41 != null) {
                            var26 += 662730581;
                            var26 ^= -265694137;
                            int var42 = var26 + 1;
                            var42 = var26 * var42;
                            int var78 = var26 + 2;
                            var42 *= var78;
                            var78 = var26 + 3;
                            var42 *= var78;
                            var42 &= 7;
                            if (var42 != 0) {
                                break label80;
                            }

                            this.Eg = var4;
                            switch (var26) {
                                case -181281945:
                                    var26 ^= -266821625;
                                    break label79;
                                case 61536769:
                                    var26 *= -2010825047;
                                    var26 += 1445544021;
                                    var26 ^= 1874273076;
                                    break label79;
                                case 1400678480:
                                default:
                                    var26 ^= -1940605784;
                                    break label79;
                            }
                        }

                        var26 >>>= 19;
                        var26 ^= 1190592578;
                    } else {
                        var26 *= 550196925;
                        var26 ^= 1441688033;
                    }
                } else {
                    var26 &= -132405036;
                    var26 |= 491711041;
                    var26 *= 18711055;
                    var26 |= 273821582;
                    var26 ^= -1129974211;
                }

                long var36 = var26;
                long var63 = var36 + 1L;
                long var64 = var36 * var63;
                long var37 = var64 & 1L;
                long var84;
                var26 = (var84 = var37 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                if (var26 == 0) {
                    RuntimeException var40 = new RuntimeException();
                    throw var40;
                }
                break label80;
            }

            long var47 = var26;
            long var80 = var47 + 1L;
            var80 = var47 * var80;
            var47 = var80 & 1L;
            long var85;
            int var49 = (var85 = var47 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
            if (var49 == 0) {
                return;
            }
        }

        IllegalArgumentException var39 = new IllegalArgumentException();
        throw var39;
    }

    public float JZ(String var1) {
        int var2 = A;
        var2 ^= 1317333150;
        int var3 = System.identityHashCode(this);
        dZ_2 var4 = this.X;
        LH var30 = var4.U(var1);
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var38;
        var3 = (var38 = var5 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        int var33 = of_2.EM;
        var2 ^= var33;
        var2 ^= -1767770242;
        of_2.EM = -1767770242;
        int var34 = of_2.n;
        var2 ^= var34;
        var2 ^= 1676159939;
        of_2.n = 1676159939;
        if (var3 != 0) {
            var2 |= -1720160778;
            var2 <<= 24;
            var2 |= -1913998143;
            var2 *= -513601049;
            var2 ^= 1189258013;
            IllegalStateException var29 = new IllegalStateException();
            throw var29;
        } else {
            var2 -= -1817196034;
            var2 *= 657442899;
            var2 *= 1577280603;
            var2 ^= 219918010;
            Integer var20 = var2;
            if (var20 != null) {
                float var22 = this.Eg;
                return var30.u(var22);
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        }
    }

    public float Ly() {
        int var1 = A;
        var1 ^= 997632544;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var27;
        var2 = (var27 = var19 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -803587531:
                default:
                    var1 ^= 1575687126;
                    break;
                case 451980546:
                    var1 ^= 1653009209;
                    break;
                case 1315048857:
                    var1 -= 545496017;
                    var1 ^= -1916606896;
            }

            IllegalStateException var23 = new IllegalStateException();
            throw var23;
        } else {
            var1 = switch (var1) {
                case -1996346871 -> var1 ^ -1090596374;
                default -> var1 ^ 635531760;
                case 1315048857 -> {
                    var1 >>>= 8;
                    yield var1 ^ 1655310642;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.Eg;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    public float yx() {
        label61: {
            int var26;
            float var51;
            label60: {
                var26 = A;
                var26 ^= -580124209;
                int var2 = System.identityHashCode(this);
                dZ_2 var3 = this.X;
                var51 = var3.aw();
                long var4 = var2;
                long var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var70;
                int var56 = (var70 = var4 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                if (var56 == 0) {
                    var26 = switch (var26) {
                        case -1468488074 -> {
                            var26 ^= -1241637699;
                            var26 &= -1885520806;
                            yield var26 ^ -2068474703;
                        }
                        default -> var26 ^ -1349169404;
                        case -739643367 -> var26 ^ 1255979748;
                    };
                    float var71;
                    int var50 = (var71 = var51 - 0.0F) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
                    if (var50 <= 0) {
                        var26 &= 323708389;
                        var26 ^= 1671670977;
                        var26 ^= -744500200;
                        var26 -= -431332300;
                        var26 ^= 235278219;
                        long var52 = var26;
                        long var66 = var52 + 1L;
                        var66 = var52 * var66;
                        long var53 = var66 & 1L;
                        long var72;
                        int var54 = (var72 = var53 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var54 != 0) {
                            break label61;
                        }

                        var51 = 1.0F;
                        var26 += 634410362;
                        var26 ^= 1484396676;
                        var26 *= 2009977105;
                        var26 ^= 1057418426;
                        break label60;
                    }

                    var26 += -916414145;
                    var26 -= -477965967;
                    var26 <<= 28;
                    var26 *= 696812371;
                    var26 ^= 854006181;
                    int var57 = var26 + 1;
                    int var58 = var26 * var57;
                    int var59 = var58 & 1;
                    if (var59 != 0) {
                        break label61;
                    }

                    float var60 = this.Eg;
                    dZ_2 var5 = this.X;
                    float var63 = var5.aw();
                    float var61 = var60 / var63;
                    float var62 = Math.min(1.0F, var61);
                    long var64 = var2;
                    long var7 = var64 + 1L;
                    var7 = var64 * var7;
                    long var65 = var7 & 1L;
                    long var73;
                    var2 = (var73 = var65 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var26 -= 335549868;
                        var26 += 414557185;
                        var26 >>>= 7;
                        var26 ^= 1526738094;
                        Integer var43 = var26;
                        if (var43 == null) {
                            break label61;
                        }

                        var51 = var62;
                        switch (var26) {
                            case -1684205775:
                            default:
                                var26 ^= 204276444;
                                break label60;
                            case 1510938081:
                                var26 -= -112842159;
                                var26 += -1871700755;
                                var26 ^= -297128038;
                                break label60;
                            case 1798433692:
                                var26 ^= -1870129349;
                                break label60;
                        }
                    }

                    var26 |= -394762920;
                    var26 |= 691291947;
                    var26 &= -1474753898;
                    var26 ^= -392068465;
                } else {
                    switch (var26) {
                        case -2081334097:
                            var26 ^= -1451315928;
                            break;
                        case -1468488074:
                            var26 ^= 1355690350;
                            var26 += 1401538148;
                            var26 ^= 217634149;
                            break;
                        case 343240050:
                        default:
                            var26 ^= -1393869692;
                    }
                }

                var2 = var26 + 1;
                var2 = var26 * var2;
                var26 = var2 & 1;
                if (var26 == 0) {
                    UnsupportedOperationException var41 = new UnsupportedOperationException();
                    throw var41;
                }
                break label61;
            }

            int var44 = var26 + 1;
            var44 = var26 * var44;
            var44 &= 1;
            if (var44 == 0) {
                return var51;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    public boolean XT() {
        label59: {
            int var35;
            int var48;
            label63: {
                var35 = A;
                var35 ^= -2116919657;
                var48 = System.identityHashCode(this);
                Integer var3 = var48;
                int var4 = of_2.EM;
                var35 ^= var4;
                var35 ^= -1767770242;
                var4 = of_2.n;
                var35 ^= var4;
                var35 ^= 1676159939;
                label56:
                if (var3 != null) {
                    var35 >>= 15;
                    var35 ^= 2102938612;
                    var35 ^= 782631271;
                    var35 ^= -1835950945;
                    boolean var49 = this.dA;
                    if (!var49) {
                        var35 ^= 318465854;
                        var35 &= -462653196;
                        var35 ^= -1959787732;
                        var35 -= 339212440;
                        var35 ^= -1446486111;
                        long var50 = var35;
                        long var5 = var50 + 1L;
                        var5 = var50 * var5;
                        long var51 = var5 & 1L;
                        long var71;
                        int var52 = (var71 = var51 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                        if (var52 != 0) {
                            break label59;
                        }

                        float var53 = this.Eg;
                        dZ_2 var63 = this.X;
                        float var64 = var63.aw();
                        int var66 = var48 + 1;
                        int var67 = var48 * var66;
                        var48 = var67 & 1;
                        if (var48 != 0) {
                            switch (var35) {
                                case -1645552608:
                                default:
                                    var35 ^= -941158383;
                                    break label56;
                                case 854080673:
                                    var35 &= -1612949095;
                                    var35 &= -1187672185;
                                    var35 ^= -33261250;
                                    break label56;
                                case 2146907055:
                                    var35 ^= 1246747698;
                                    break label56;
                            }
                        }

                        var35 &= -685512851;
                        var35 ^= -2015019353;
                        float var72;
                        var48 = (var72 = var53 - var64) == 0.0F ? 0 : (var72 < 0.0F ? -1 : 1);
                        if (var48 >= 0) {
                            var35 |= 1837129201;
                            var35 >>>= 13;
                            var35 ^= -643785646;
                            var48 = 1;
                            var35 ^= -749756825;
                            var35 *= -1844315955;
                            var35 >>= 16;
                            var35 ^= -1058200662;
                            break label63;
                        }

                        var35 *= -800983825;
                        var35 >>>= 21;
                        var35 ^= -1554090351;
                    } else {
                        var35 &= 974672226;
                        var35 ^= -1722915341;
                    }

                    long var58 = var35;
                    long var69 = var58 + 1L;
                    var69 = var58 * var69;
                    long var59 = var69 & 1L;
                    long var73;
                    int var60 = (var73 = var59 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var60 != 0) {
                        break label59;
                    }

                    var48 = 0;
                    var35 |= 2032153077;
                    var35 ^= -999494897;
                    break label63;
                } else {
                    switch (var35) {
                        case -2018734412:
                            var35 ^= 1589008108;
                            break;
                        case -188286674:
                            var35 >>= 16;
                            var35 |= -613445624;
                            var35 ^= 301696369;
                            break;
                        case 742877279:
                        default:
                            var35 ^= 667395957;
                    }
                }

                long var38 = var35;
                long var54 = var38 + 1L;
                long var55 = var38 * var54;
                long var68 = var38 + 2L;
                long var56 = var55 * var68;
                long var39 = var38 + 3L;
                long var57 = var56 * var39;
                long var40 = var57 & 7L;
                long var74;
                var35 = (var74 = var40 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                if (var35 == 0) {
                    AssertionError var42 = new AssertionError();
                    throw var42;
                }
                break label59;
            }

            Integer var61 = var35;
            if (var61 != null) {
                return (var48 != 0);
            }
        }

        RuntimeException var45 = new RuntimeException();
        throw var45;
    }

    public void Sj() {
        int var1 = A;
        var1 ^= 1504449451;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        if (var20 == null) {
            var20 = switch (var1) {
                case -382427211 -> var1 ^ 612529336;
                case 750302226 -> {
                    var1 >>>= 8;
                    yield var1 ^ 1003956788;
                }
                default -> var1 ^ -190089022;
            };
            if (var20 != null) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        } else {
            var1 ^= -764361005;
            var1 >>>= 5;
            var1 ^= 1509090567;
            var1 ^= 1113645137;
            var1 ^= 610302497;
            long var15 = var1;
            long var3 = var15 + 1L;
            var3 = var15 * var3;
            long var5 = var15 + 2L;
            var3 *= var5;
            long var16 = var15 + 3L;
            var3 *= var16;
            long var17 = var3 & 7L;
            long var26;
            var1 = (var26 = var17 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 == 0) {
                this.Eg = 0.0F;
                return;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1084408204;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        A = var4;
    }
}
