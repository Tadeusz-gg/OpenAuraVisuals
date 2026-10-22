package dev.aurap.hub;

import mvggs.modules.hud.hudstyle;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.function.BooleanSupplier;

public final class zS implements nM {
    private static final int u = 64;
    private final r_2 Y;
    private final Fk Kb;
    private final Fk Yr;
    private final int[] BG;
    private int yC;
    private int j;
    private boolean p;
    private hudstyle QX;
    public static final int Z;

    public zS() {
        this(Ry.THEME, -11559425, -5870593);
    }

    public zS(Ry var1, int var2, int var3) {
        int[] var4 = new int[64];
        this.BG = var4;
        r_2 var6 = new r_2("color_mode", "Color", var1);
        this.Y = var6;
        Fk var7 = new Fk("color", "Primary", var2, false);
        BooleanSupplier var5 = () -> {
            boolean var50;
            label75: {
                int var1x = Z;
                var1x ^= -2009690302;
                int var2x = System.identityHashCode(this);
                r_2 var3x = this.Y;
                Integer var4x = var2x;
                if (var4x == null) {
                    var1x -= -491132422;
                    var1x ^= -1008156126;
                } else {
                    label84: {
                        var1x >>>= 17;
                        var1x += 237154055;
                        var1x >>>= 2;
                        var1x += 1076016805;
                        var1x ^= -391410261;
                        var4x = var1x;
                        if (var4x == null) {
                            break label75;
                        }

                        label78: {
                            Ry var63 = Ry.CUSTOM;
                            boolean var52 = var3x.TJ(var63);
                            if (!var52) {
                                var1x >>>= 16;
                                var1x ^= -1440121219;
                                Integer var53 = var1x;
                                if (var53 == null) {
                                    break label75;
                                }

                                var3x = this.Y;
                                Integer var45 = var2x;
                                if (var45 == null) {
                                    var1x *= -1080941173;
                                    var1x ^= -2022139757;
                                    var1x += -864135586;
                                    var1x -= 231819932;
                                    var1x ^= 1005737174;
                                    break label84;
                                }
                                var1x = switch (var1x) {
                                    case -1440098947 -> {
                                        var1x -= 1495611356;
                                        var1x |= -591907969;
                                        var1x -= 366972995;
                                        var1x ^= 2082382098;
                                        yield var1x ^ 708390015;
                                    }
                                    case 1322990064 -> var1x ^ 2069392423;
                                    default -> var1x ^ -1317842607;
                                };
                                var45 = var1x;
                                if (var45 == null) {
                                    break label75;
                                }

                                Ry var47 = Ry.GRADIENT;
                                boolean var48 = var3x.TJ(var47);
                                if (!var48) {
                                    var1x |= -1521068107;
                                    var1x += -331272249;
                                    var1x ^= 1900485178;
                                    var45 = var1x;
                                    if (var45 == null) {
                                        break label75;
                                    }

                                    var50 = false;
                                    switch (var1x) {
                                        case -1899395108:
                                        default:
                                            var1x ^= -913346395;
                                            break label78;
                                        case -754500218:
                                            var1x += 1519298857;
                                            var1x |= -2010484632;
                                            var1x *= 1775553165;
                                            var1x ^= -619006865;
                                            var1x ^= -1021902517;
                                            break label78;
                                        case 121419558:
                                            var1x ^= -1936717503;
                                            break label78;
                                    }
                                }

                                var1x *= 1430537589;
                                var1x *= -894459241;
                                var1x ^= 1496904624;
                            } else {
                                var1x ^= -1697059234;
                                var1x &= 2017660690;
                                var1x ^= -1020635445;
                                var1x &= 2023732738;
                                var1x ^= -526684733;
                            }

                            int var55 = var1x + 1;
                            int var56 = var1x * var55;
                            int var64 = var1x + 2;
                            int var57 = var56 * var64;
                            var64 = var1x + 3;
                            int var58 = var57 * var64;
                            int var59 = var58 & 7;
                            if (var59 != 0) {
                                break label75;
                            }

                            var50 = true;
                            switch (var1x) {
                                case -1869514301:
                                    var1x &= -1675252457;
                                    var1x ^= 947063684;
                                    break;
                                case -1419493798:
                                    var1x ^= 1039082502;
                                    break;
                                case 2053589962:
                                default:
                                    var1x ^= 734637602;
                            }
                        }

                        long var60 = var1x;
                        long var5x = var60 + 1L;
                        var5x = var60 * var5x;
                        long var61 = var5x & 1L;
                        long var67;
                        var1x = (var67 = var61 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                        if (var1x == 0) {
                            return var50;
                        }
                        break label75;
                    }
                }

                AssertionError var51 = new AssertionError();
                throw var51;
            }

            RuntimeException var44 = new RuntimeException();
            throw var44;
        };
        xB var8 = var7.Pt(var5);
        Fk var9 = (Fk)var8;
        this.Kb = var9;
        Fk var10 = new Fk("color_2", "Secondary", var3, false);
        var5 = () -> {
            int var1x = Z;
            var1x ^= 18969199;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.Y;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            long var8x = var4x + 2L;
            var6x *= var8x;
            var4x += 3L;
            var6x *= var4x;
            var4x = var6x & 7L;
            long var32;
            var2x = (var32 = var4x - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x |= -1471237756;
                var1x ^= 699332031;
                var1x ^= -1423086908;
                var4x = var1x;
                var6x = var4x + 1L;
                var6x = var4x * var6x;
                var4x = var6x & 1L;
                long var33;
                var2x = (var33 = var4x - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
                if (var2x == 0) {
                    RuntimeException var22 = new RuntimeException();
                    throw var22;
                }
            } else {
                Integer var17 = switch (var1x) {
                    case -1542250791 -> {
                        var1x &= -1022338770;
                        var1x *= 1850979799;
                        yield var1x ^ 267584726;
                    }
                    default -> var1x ^ -1865821615;
                    case -851915225 -> var1x ^ -118491826;
                };
                if (var17 != null) {
                    Ry var19 = Ry.GRADIENT;
                    return var3x.TJ(var19);
                }
            }

            IllegalArgumentException var18 = new IllegalArgumentException();
            throw var18;
        };
        xB var11 = var10.Pt(var5);
        Fk var12 = (Fk)var11;
        this.Yr = var12;
    }

    @Override
    public List o() {
        int var1 = Z;
        var1 ^= -2035483257;
        int var2 = System.identityHashCode(this);
        r_2 var3 = this.Y;
        Fk var4 = this.Kb;
        Fk var5 = this.Yr;
        long var6 = var2;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var27;
        var2 = (var27 = var6 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case 597594417:
                    var1 -= -99879271;
                    var1 -= -1627770583;
                    var1 *= -234240365;
                    var1 |= -1347919962;
                    var1 ^= -837919580;
                    break;
                case 914869387:
                default:
                    var1 ^= -528653814;
                    break;
                case 1237284376:
                    var1 ^= 851543776;
            }

            IllegalStateException var24 = new IllegalStateException();
            throw var24;
        } else {
            var1 |= 1342756801;
            var1 -= 1721436389;
            var1 ^= -1502692622;
            Integer var14 = var1;
            if (var14 == null) {
                AssertionError var15 = new AssertionError();
                throw var15;
            } else {
                return List.of(var3, var4, var5);
            }
        }
    }

    public int x(float var1, double var2) {
        label91: {
            int var4 = Z;
            var4 ^= 1726329841;
            int var5 = System.identityHashCode(this);
            r_2 var6 = this.Y;
            Enum var98 = var6.A();
            Ry var99 = (Ry)var98;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var149;
            int var108 = (var149 = var7 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
            int var8 = of_2.i;
            var4 ^= var8;
            var4 ^= 563708667;
            of_2.i = 563708667;
            var8 = of_2.Jq;
            var4 ^= var8;
            var4 ^= -783378126;
            of_2.Jq = -783378126;
            if (var108 == 0) {
                var4 += 710506745;
                var4 *= 387712943;
                var4 += -38157935;
                var4 ^= -1426313902;
                int var100 = var99.ordinal();
                switch (var100) {
                    case 0:
                        var4 &= 179034402;
                        var4 |= 560605642;
                        var4 |= 769169009;
                        var4 ^= -2108394244;
                        Integer var122 = var4;
                        if (var122 == null) {
                            break label91;
                        }

                        int var123 = var4 & -2087300491;
                        int var124 = var123 << 17;
                        int var125 = var124 | 885829415;
                        int var126 = var125 ^ -849814331;
                        int var127 = this.W(var126);
                        long var142 = var5;
                        long var10 = var142 + 1L;
                        var10 = var142 * var10;
                        long var12 = var142 + 2L;
                        var10 *= var12;
                        long var143 = var142 + 3L;
                        var10 *= var143;
                        long var144 = var10 & 7L;
                        long var150;
                        var5 = (var150 = var144 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var4 &= 34253120;
                            var4 -= 1268002953;
                            var4 ^= -236336212;
                            var5 = var4 + 1;
                            var5 = var4 * var5;
                            var5 &= 1;
                            if (var5 != 0) {
                                break label91;
                            }

                            var4 -= 1908402301;
                            var4 *= 110036979;
                            var4 &= 1455892963;
                            var4 *= 323591951;
                            var4 ^= -1517327629;
                            return var127;
                        }

                        var4 |= 97327718;
                        var4 |= -504707543;
                        var4 ^= 1662165082;
                        break;
                    case 1:
                        var4 = switch (var4) {
                            default -> var4 ^ -1654039900;
                            case 992147459 -> {
                                var4 |= 483862713;
                                var4 |= -1312968868;
                                var4 -= 171640192;
                                yield var4 ^ 468507566;
                            }
                            case 1343172052 -> var4 ^ -1650486085;
                        };
                        Fk var120 = this.Kb;
                        Integer var141 = var5;
                        if (var141 != null) {
                            var4 -= 2058839007;
                            var4 |= 669407687;
                            var4 |= -809662999;
                            var4 ^= 186568276;
                            var4 ^= 2103829477;
                            int var121 = var120.zz();
                            var4 |= -782382947;
                            var4 &= 1378404435;
                            var4 -= -1075611874;
                            var4 ^= 43666488;
                            return var121;
                        }

                        var4 |= 1123873265;
                        var4 ^= 1610714820;
                        break;
                    case 2:
                        var4 = switch (var4) {
                            case -1383739134 -> var4 ^ -1356407922;
                            case 992147459 -> {
                                var4 += -1918506523;
                                var4 |= 1571743326;
                                var4 *= -1299323207;
                                var4 -= -1196250805;
                                yield var4 ^ -1148927467;
                            }
                            default -> var4 ^ -1271512428;
                        };
                        int var112 = var4 + 1;
                        int var113 = var4 * var112;
                        int var114 = var113 & 1;
                        if (var114 != 0) {
                            break label91;
                        }

                        double var115 = var2 * 0.35;
                        float var116 = (float)var115;
                        Integer var129 = var5;
                        if (var129 != null) {
                            var4 = switch (var4) {
                                case -2058606663 -> var4 ^ -1219931405;
                                default -> var4 ^ 2137716375;
                                case 197391190 -> {
                                    var4 &= -875440474;
                                    var4 ^= 1826554905;
                                    var4 &= 1864980549;
                                    var4 >>= 18;
                                    yield var4 ^ -553266716;
                                }
                            };
                            int var130 = var4 + 1;
                            var130 = var4 * var130;
                            var130 &= 1;
                            if (var130 != 0) {
                                break label91;
                            }

                            float var117 = var1 + var116;
                            var130 = var4 >>> 21;
                            var130 -= 938033332;
                            var130 |= 35680276;
                            var130 += -658906720;
                            var130 ^= -1576936179;
                            float var118 = Vv(var117, var130);
                            var130 = var4 + -1779329768;
                            var130 -= 661581990;
                            var130 ^= -2140252856;
                            int var119 = this.F(var118, var130);
                            var4 >>>= 30;
                            var4 ^= -1832968946;
                            return var119;
                        }

                        var4 += -2034864313;
                        var4 -= 1919229699;
                        var4 ^= -1360511825;
                        break;
                    case 3:
                        var4 *= -695771195;
                        var4 *= -1105640847;
                        var4 ^= -877905056;
                        float var103 = var1 * 0.35F;
                        Integer var109 = var5;
                        if (var109 != null) {
                            var4 ^= 1299660428;
                            var4 >>= 20;
                            var4 ^= 189907104;
                            double var110 = var2 * 0.12;
                            float var111 = (float)var110;
                            float var104 = var103 + var111;
                            int var105 = DP.SW(var104, 0.62F, 1.0F);
                            var4 *= 1485281073;
                            var4 &= 1062185581;
                            var4 &= 564856233;
                            var4 -= -245185732;
                            var4 ^= -1676140064;
                            return var105;
                        }

                        var4 -= -1651600760;
                        var4 *= -222774849;
                        var4 ^= 2053783868;
                        break;
                    default:
                        var4 &= -524876531;
                        var4 -= 1259146169;
                        var4 *= 633175283;
                        var4 *= -67876675;
                        var4 ^= 13208529;
                        var5 = var4 + 1;
                        var5 = var4 * var5;
                        int var101 = var4 + 2;
                        var5 *= var101;
                        int var102 = var4 + 3;
                        var5 *= var102;
                        var5 &= 7;
                        if (var5 == 0) {
                            MatchException var93 = new MatchException(null, null);
                            throw var93;
                        }
                        break label91;
                }
            } else {
                switch (var4) {
                    case -1609303585:
                    default:
                        var4 ^= -1044252400;
                        break;
                    case -1009262777:
                        var4 &= -730423285;
                        var4 ^= 1319894838;
                        break;
                    case 1389340322:
                        var4 ^= 238857149;
                }
            }

            Integer var85 = var4;
            if (var85 != null) {
                IllegalArgumentException var87 = new IllegalArgumentException();
                throw var87;
            }
        }

        UnsupportedOperationException var86 = new UnsupportedOperationException();
        throw var86;
    }

    public int Na(float var1, double var2, float var4) {
        label51: {
            int var35;
            int var59;
            label50: {
                var35 = Z;
                var35 ^= -2113899006;
                int var6 = System.identityHashCode(this);
                int var7 = this.x(var1, var2);
                float var81;
                var59 = (var81 = var4 - 0.001F) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
                long var9 = var6;
                long var11 = var9 + 1L;
                var11 = var9 * var11;
                var9 = var11 & 1L;
                long var82;
                int var66 = (var82 = var9 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                int var10 = of_2.i;
                var35 ^= var10;
                var35 ^= 563708667;
                var10 = of_2.Jq;
                var35 ^= var10;
                var35 ^= -783378126;
                if (var66 != 0) {
                    var35 &= 183777032;
                    var35 |= -1622567201;
                    var35 ^= 1461458577;
                } else {
                    var35 ^= 550707529;
                    var35 *= -742529357;
                    var35 |= -1031966750;
                    var35 -= -1178088595;
                    var35 ^= -214582456;
                    int var67 = var35 + 1;
                    int var68 = var35 * var67;
                    int var69 = var68 & 1;
                    if (var69 != 0) {
                        break label51;
                    }

                    if (var59 <= 0) {
                        var35 += -292735255;
                        var35 |= -1427121475;
                        var35 |= 1316735473;
                        var35 ^= -919643752;
                        var35 ^= 373146335;
                        var59 = var35 + 1;
                        var59 = var35 * var59;
                        int var71 = var35 + 2;
                        var59 *= var71;
                        int var72 = var35 + 3;
                        var59 *= var72;
                        var59 &= 7;
                        if (var59 != 0) {
                            break label51;
                        }

                        var59 = var7;
                        var35 *= 1965549495;
                        var35 -= -692594048;
                        var35 ^= 1463668077;
                        break label50;
                    }

                    var35 <<= 7;
                    var35 ^= 1477068954;
                    float var70 = Math.min(1.0F, var4);
                    var10 = var6 + 1;
                    var10 = var6 * var10;
                    var6 = var10 & 1;
                    if (var6 == 0) {
                        var35 >>>= 19;
                        var35 ^= 333728632;
                        var6 = var35 + 1;
                        var6 = var35 * var6;
                        var10 = var35 + 2;
                        var6 *= var10;
                        var10 = var35 + 3;
                        var6 *= var10;
                        var6 &= 7;
                        if (var6 != 0) {
                            break label51;
                        }

                        var6 = DP.Z(var7, -50354, var70);
                        var59 = var6;
                        var35 += -311544571;
                        var35 ^= 226622779;
                        break label50;
                    }

                    switch (var35) {
                        case 420336026:
                            var35 &= 306880311;
                            var35 ^= -663940772;
                            break;
                        case 1359035074:
                        default:
                            var35 ^= -489297933;
                            break;
                        case 1372264046:
                            var35 ^= 1728194199;
                    }
                }

                var6 = var35 + 1;
                var6 = var35 * var6;
                var7 = var35 + 2;
                var6 *= var7;
                var35 += 3;
                var6 *= var35;
                var35 = var6 & 7;
                if (var35 == 0) {
                    AssertionError var31 = new AssertionError();
                    throw var31;
                }
                break label51;
            }

            long var55 = var35;
            long var73 = var55 + 1L;
            var73 = var55 * var73;
            var55 = var73 & 1L;
            long var83;
            int var57 = (var83 = var55 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
            if (var57 == 0) {
                return var59;
            }
        }

        UnsupportedOperationException var43 = new UnsupportedOperationException();
        throw var43;
    }

    private int W(int var1) {
        label62: {
            int var25;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            label61:
            if (var4 != null) {
                var25 = var1 & -170836382;
                var25 *= 141428825;
                var25 *= 203110843;
                var25 >>>= 2;
                var25 ^= 325321945;
                hudstyle var43 = this.QX;
                hudstyle var52;
                if (var43 == null) {
                    var25 -= 633489439;
                    var25 >>>= 20;
                    var25 -= -1485413403;
                    var25 += -158736539;
                    var25 ^= -178795564;
                    long var5 = var25;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    long var46 = var7 & 1L;
                    long var61;
                    int var47 = (var61 = var46 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
                    if (var47 != 0) {
                        break label62;
                    }

                    Ud var48 = Ud.Z();
                    NW var49 = var48.sP();
                    Integer var6 = var3;
                    if (var6 == null) {
                        switch (var25) {
                            case -1169931886:
                                var25 &= -1091407900;
                                var25 -= -498597616;
                                var25 ^= -629882482;
                                break label61;
                            case 256735867:
                                var25 ^= -839542655;
                                break label61;
                            case 1211936857:
                            default:
                                var25 ^= -343349062;
                                break label61;
                        }
                    }
                    var25 = switch (var25) {
                        default -> var25 ^ 587396275;
                        case -1169931886 -> {
                            var25 -= 457580088;
                            yield var25 ^ 639568871;
                        }
                        case 171060424 -> var25 ^ -9196830;
                    };
                    int var53 = var25 + 1;
                    var53 = var25 * var53;
                    int var59 = var25 + 2;
                    var53 *= var59;
                    int var60 = var25 + 3;
                    var53 *= var60;
                    var53 &= 7;
                    if (var53 != 0) {
                        break label62;
                    }

                    Yn var50 = var49.tG(hudstyle.class);
                    var52 = (hudstyle)var50;
                    this.QX = var52;
                    var52 = var52;
                    var25 -= -848179097;
                    var25 *= -1488191263;
                    var25 += 1956578645;
                    var25 -= 607666805;
                    var25 ^= -2142506397;
                } else {
                    var25 >>>= 22;
                    var25 *= -1248424679;
                    var25 ^= -161219575;
                    var52 = var43;
                    var25 |= -1748787154;
                    var25 >>>= 28;
                    var25 <<= 1;
                    var25 ^= 276861963;
                }

                var4 = var25;
                if (var4 == null) {
                    break label62;
                }

                Oo var45 = var52.eo();
                Integer var42 = var3;
                if (var42 != null) {
                    var25 &= 1789634698;
                    var25 -= -1222840147;
                    var25 ^= -1508389577;
                    return var45.K();
                }

                var25 >>>= 10;
                var25 ^= 227058139;
            } else {
                switch (var1) {
                    case -1634528725:
                        var25 = var1 ^ 796608876;
                        break;
                    case -513635534:
                    default:
                        var25 = var1 ^ 1071312387;
                        break;
                    case -107580446:
                        var25 = var1 * 483478841;
                        var25 ^= 726681260;
                }
            }

            Integer var39 = var25;
            if (var39 != null) {
                UnsupportedOperationException var41 = new UnsupportedOperationException();
                throw var41;
            }
        }

        AssertionError var40 = new AssertionError();
        throw var40;
    }

    private int F(float var1, int var2) {
        label183: {
            int var38;
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            int var6 = var4 + 2;
            var5 *= var6;
            var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            label182:
            if (var5 == 0) {
                var38 = var2 - 1076205152;
                var38 ^= -315989938;
                var5 = var38 + 1;
                var5 = var38 * var5;
                var6 = var38 + 2;
                var5 *= var6;
                var6 = var38 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label183;
                }

                label195: {
                    Fk var102 = this.Kb;
                    var5 = var102.zz();
                    var5 = var5;
                    Fk var118 = this.Yr;
                    var6 = var118.zz();
                    var6 = var6;
                    int var7 = (this.p ? 1 : 0);
                    if (var7 != 0) {
                        var38 *= 2083389343;
                        var38 &= -1964754210;
                        var38 >>= 6;
                        var38 ^= -2126460667;
                        Integer var125 = var38;
                        if (var125 == null) {
                            break label183;
                        }

                        var7 = this.yC;
                        long var8 = var4;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var220;
                        int var155 = (var220 = var8 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                        if (var155 != 0) {
                            switch (var38) {
                                case -2126493433:
                                    var38 -= 350295956;
                                    var38 -= 1333277263;
                                    var38 ^= -113191347;
                                    break label182;
                                case 1398884871:
                                default:
                                    var38 ^= -38758423;
                                    break label182;
                                case 2127448452:
                                    var38 ^= 1722826223;
                                    break label182;
                            }
                        }

                        var38 ^= -1964565076;
                        var38 *= -1212637971;
                        var38 *= -1648722273;
                        var38 ^= -271148123;
                        var8 = var38;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        long var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var221;
                        int var159 = (var221 = var8 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                        if (var159 != 0) {
                            break label183;
                        }

                        if (var5 == var7) {
                            var38 &= -1544942722;
                            var38 *= 784668517;
                            var38 -= 91998786;
                            var38 ^= 1644274997;
                            long var127 = var38;
                            long var9 = var127 + 1L;
                            var9 = var127 * var9;
                            long var11 = var127 + 2L;
                            var9 *= var11;
                            long var128 = var127 + 3L;
                            var9 *= var128;
                            long var129 = var9 & 7L;
                            long var222;
                            int var130 = (var222 = var129 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                            if (var130 != 0) {
                                break label183;
                            }

                            var130 = this.j;
                            Integer var160 = var4;
                            if (var160 == null) {
                                var38 ^= 1774897063;
                                var38 ^= -1589081159;
                                break label182;
                            }

                            var38 ^= -1995917408;
                            var38 ^= -960691790;
                            int var161 = var38 + 1;
                            int var162 = var38 * var161;
                            int var163 = var162 & 1;
                            if (var163 != 0) {
                                break label183;
                            }

                            if (var6 == var130) {
                                var38 += -2048555708;
                                var38 ^= 1094270299;
                                break label195;
                            }

                            var38 -= 1099273449;
                            var38 ^= -1007092920;
                            var38 &= 1115611798;
                            var38 ^= 1445413861;
                        } else {
                            var38 ^= -1157868865;
                            var38 ^= -376670214;
                        }
                    } else {
                        switch (var38) {
                            case -603839110:
                            default:
                                var38 ^= -1945127557;
                                break;
                            case 1625998142:
                                var38 &= -971597471;
                                var38 -= 1685630542;
                                var38 ^= -807775965;
                                break;
                            case 2070933933:
                                var38 ^= 1073187665;
                        }
                    }

                    long var132 = var38;
                    long var177 = var132 + 1L;
                    var177 = var132 * var177;
                    long var212 = var132 + 2L;
                    var177 *= var212;
                    long var133 = var132 + 3L;
                    var177 *= var133;
                    long var134 = var177 & 7L;
                    long var223;
                    var7 = (var223 = var134 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label183;
                    }

                    int var136 = 0;
                    Integer var164 = var4;
                    if (var164 == null) {
                        var38 <<= 29;
                        var38 ^= -992618603;
                        var38 ^= 24379132;
                        break label182;
                    }
                    var38 = switch (var38) {
                        default -> var38 ^ -1874343806;
                        case -1076174555 -> var38 ^ -616067879;
                        case 341017585 -> {
                            var38 ^= -917209901;
                            var38 &= 1698800072;
                            var38 ^= -2140446591;
                            var38 -= -559840749;
                            yield var38 ^ 1609558676;
                        }
                    };
                    long var165 = var38;
                    long var199 = var165 + 1L;
                    var199 = var165 * var199;
                    long var166 = var199 & 1L;
                    long var224;
                    int var167 = (var224 = var166 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                    if (var167 != 0) {
                        break label183;
                    }

                    var136 = var136;
                    var38 ^= 543978976;
                    var38 <<= 4;
                    var38 >>>= 16;
                    var38 ^= 956246128;

                    while (true) {
                        Integer var168 = var38;
                        if (var168 == null) {
                            break label183;
                        }

                        if (var136 >= 64) {
                            var38 = switch (var38) {
                                case -1608644925 -> var38 ^ -1844560758;
                                default -> var38 ^ 722173267;
                                case 956284122 -> {
                                    var38 -= -1970775105;
                                    yield var38 ^ 577759806;
                                }
                            };
                            long var138 = var38;
                            var177 = var138 + 1L;
                            var177 = var138 * var177;
                            long var139 = var177 & 1L;
                            long var227;
                            var136 = (var227 = var139 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                            if (var136 != 0) {
                                break label183;
                            }

                            this.yC = var5;
                            this.j = var6;
                            long var105 = var4;
                            long var141 = var105 + 1L;
                            long var142 = var105 * var141;
                            var177 = var105 + 2L;
                            long var143 = var142 * var177;
                            long var106 = var105 + 3L;
                            long var144 = var143 * var106;
                            long var107 = var144 & 7L;
                            long var228;
                            var5 = (var228 = var107 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                switch (var38) {
                                    case -1944548571:
                                        var38 ^= -984209790;
                                        var38 <<= 8;
                                        var38 ^= 366701691;
                                        var38 *= -70486851;
                                        var38 ^= -62006106;
                                        break label182;
                                    case -137770103:
                                        var38 ^= 1045058645;
                                        break label182;
                                    case 274001989:
                                    default:
                                        var38 ^= 1735249108;
                                        break label182;
                                }
                            }

                            var38 |= 2009164541;
                            var38 *= 1160177827;
                            var38 ^= -649229802;
                            Integer var109 = var38;
                            if (var109 == null) {
                                break label183;
                            }

                            this.p = true;
                            var38 += -559092876;
                            var38 -= -45900210;
                            var38 += 339021282;
                            var38 ^= -1783546117;
                            break;
                        }

                        var38 -= -2132048115;
                        var38 += 2111087026;
                        var38 ^= -692285249;
                        long var169 = var38;
                        var199 = var169 + 1L;
                        var199 = var169 * var199;
                        long var170 = var199 & 1L;
                        long var225;
                        int var171 = (var225 = var170 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                        if (var171 != 0) {
                            break label183;
                        }

                        int[] var172 = this.BG;
                        float var181 = var136;
                        int var203 = var4 + 1;
                        int var204 = var4 * var203;
                        int var213 = var4 + 2;
                        int var205 = var204 * var213;
                        int var214 = var4 + 3;
                        int var206 = var205 * var214;
                        int var207 = var206 & 7;
                        if (var207 != 0) {
                            switch (var38) {
                                case -1691743238:
                                default:
                                    var38 ^= 1193350149;
                                    break label182;
                                case -481015872:
                                    var38 >>>= 10;
                                    var38 *= 1683497605;
                                    var38 ^= -1469171287;
                                    var38 ^= -740417949;
                                    var38 ^= 364707190;
                                    break label182;
                                case 1986730370:
                                    var38 ^= 1430508839;
                                    break label182;
                            }
                        }

                        var38 *= 1171777331;
                        var38 >>>= 10;
                        var38 -= 1911852618;
                        var38 ^= -388437433;
                        var38 ^= -1572315398;
                        var199 = var38;
                        long var216 = var199 + 1L;
                        var216 = var199 * var216;
                        long var14 = var199 + 2L;
                        var216 *= var14;
                        var199 += 3L;
                        var216 *= var199;
                        var199 = var216 & 7L;
                        long var226;
                        int var211 = (var226 = var199 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                        if (var211 != 0) {
                            break label183;
                        }

                        float var182 = var181 / 63.0F;
                        int var183 = DP.Bp(var5, var6, var182);
                        var172[var136] = var183;
                        var171 = var136 + 1;
                        var136 = var171;
                        switch (var38) {
                            case -995027099:
                                var38 |= -877583094;
                                var38 *= 414262691;
                                var38 ^= -1368921481;
                                break;
                            case 1901215205:
                            default:
                                var38 ^= -2111168314;
                                break;
                            case 2045380413:
                                var38 ^= 1462660179;
                        }
                    }
                }

                long var110 = var38;
                long var145 = var110 + 1L;
                var145 = var110 * var145;
                long var187 = var110 + 2L;
                var145 *= var187;
                long var111 = var110 + 3L;
                var145 *= var111;
                long var112 = var145 & 7L;
                long var229;
                var5 = (var229 = var112 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label183;
                }

                int[] var114 = this.BG;
                float var121 = Math.min(1.0F, var1);
                float var122 = Math.max(0.0F, var121);
                float var123 = var122 * 63.0F;
                var6 = Math.round(var123);
                var145 = var4;
                var187 = var145 + 1L;
                var187 = var145 * var187;
                long var215 = var145 + 2L;
                var187 *= var215;
                var145 += 3L;
                var187 *= var145;
                var145 = var187 & 7L;
                long var230;
                var4 = (var230 = var145 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                if (var4 == 0) {
                    var38 ^= -503515310;
                    var38 >>>= 2;
                    var38 ^= -1088609552;
                    var145 = var38;
                    var187 = var145 + 1L;
                    var187 = var145 * var187;
                    var145 = var187 & 1L;
                    long var231;
                    var4 = (var231 = var145 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        return var114[var6];
                    }
                    break label183;
                }

                switch (var38) {
                    case -1913230025:
                        var38 ^= -1973462961;
                        break;
                    case -1454479886:
                        var38 -= -626713693;
                        var38 ^= 722428710;
                        break;
                    case -1098843418:
                    default:
                        var38 ^= -723915762;
                }
            } else {
                switch (var2) {
                    case -840549936:
                        var38 = var2 ^ -470652557;
                        var38 >>>= 22;
                        var38 *= -1069490129;
                        var38 ^= -888731487;
                        break;
                    case -768030072:
                    default:
                        var38 = var2 ^ 415444475;
                        break;
                    case -143202659:
                        var38 = var2 ^ 1850510089;
                }
            }

            Integer var88 = var38;
            if (var88 != null) {
                AssertionError var90 = new AssertionError();
                throw var90;
            }
        }

        IllegalArgumentException var89 = new IllegalArgumentException();
        throw var89;
    }

    private static float Vv(float var0, int var1) {
        label59: {
            int var25;
            float var44;
            label58: {
                int var3 = (int)var0;
                float var4 = var0 * 0.5F;
                long var5 = var3;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var75;
                int var56 = (var75 = var5 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                if (var56 == 0) {
                    var25 = switch (var1) {
                        case -238314096 -> var1 ^ -922317288;
                        case 15796985 -> {
                            var25 = var1 + -1851636522;
                            yield var25 ^ -596053392;
                        }
                        default -> var1 ^ -198499048;
                    };
                    double var47 = var4;
                    double var48 = Math.floor(var47);
                    var4 = (float)var48;
                    var4 *= 2.0F;
                    var4 = var0 - var4;
                    float var76;
                    int var57 = (var76 = var4 - 1.0F) == 0.0F ? 0 : (var76 < 0.0F ? -1 : 1);
                    if (var57 <= 0) {
                        var25 >>= 20;
                        var25 |= -906270525;
                        var25 >>>= 30;
                        var25 -= 1498990510;
                        var25 ^= -165637182;
                        var44 = var4;
                        var25 *= 1653426033;
                        var25 *= -192970177;
                        var25 ^= -685886673;
                        break label58;
                    }
                    var25 = switch (var25) {
                        case -944489887 -> var25 ^ -1721947502;
                        default -> var25 ^ -1756457009;
                        case 1324072383 -> {
                            var25 |= -1030765158;
                            var25 ^= -1662152406;
                            var25 += 1699765543;
                            var25 += 2076697580;
                            yield var25 ^ 531761640;
                        }
                    };
                    var5 = var25;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    long var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var77;
                    int var61 = (var77 = var5 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                    if (var61 != 0) {
                        break label59;
                    }

                    float var62 = 2.0F - var4;
                    long var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var78;
                    int var43 = (var78 = var6 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var43 == 0) {
                        var25 = switch (var25) {
                            default -> var25 ^ 1544280146;
                            case 632242444 -> var25 ^ -832536872;
                            case 749249600 -> {
                                var25 ^= 1211075579;
                                var25 += -474985650;
                                var25 -= 859742596;
                                yield var25 ^ -297822176;
                            }
                        };
                        var44 = var62;
                        switch (var25) {
                            case -691286359:
                                var25 ^= -571683792;
                                break label58;
                            case -87604827:
                                var25 += 1503494629;
                                var25 -= -1587703943;
                                var25 &= 576802546;
                                var25 >>= 20;
                                var25 ^= -218961898;
                                break label58;
                            case 678631393:
                            default:
                                var25 ^= 630866949;
                                break label58;
                        }
                    }

                    var25 <<= 14;
                    var25 -= 1264057344;
                    var25 ^= -474157051;
                } else {
                    var25 = var1 & 1058363289;
                    var25 &= 1194704904;
                    var25 >>>= 5;
                    var25 ^= 1040481285;
                }

                int var45 = var25 + 1;
                int var46 = var25 * var45;
                var25 = var46 & 1;
                if (var25 == 0) {
                    UnsupportedOperationException var42 = new UnsupportedOperationException();
                    throw var42;
                }
                break label59;
            }

            long var52 = var25;
            long var65 = var52 + 1L;
            var65 = var52 * var65;
            var52 = var65 & 1L;
            long var79;
            int var54 = (var79 = var52 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
            if (var54 == 0) {
                return var44;
            }
        }

        RuntimeException var41 = new RuntimeException();
        throw var41;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1377741090;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Z = var4;
    }
}
