package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class sT_2 {
    private static final float oo = 1.70158F;
    private static final float h = 2.5949094F;
    private static final float j = 2.70158F;
    private static final float Pt = (float) (Math.PI * 2.0 / 3.0);
    private static final float E = (float) Math.PI * 4.0F / 9.0F;
    public static final Lv S;
    public static final Lv H;
    public static final Lv d;
    public static final Lv s;
    public static final Lv bS;
    public static final Lv aO;
    public static final Lv q;
    public static final Lv Z;
    public static final Lv B;
    public static final Lv qX;
    public static final Lv Kg;
    public static final Lv O;
    public static final Lv th;
    public static final Lv go;
    public static final Lv Q;
    public static final Lv Jj;
    public static final Lv vN;
    public static final Lv R;
    public static final Lv W;
    public static final Lv su;
    public static final Lv fU;
    public static final Lv o;
    public static final Lv WJ;
    public static final Lv qQ;
    public static final Lv r;
    public static final Lv ri;
    public static final Lv p;
    public static final Lv F;
    public static final Lv a;
    public static final Lv Ry;
    public static final Lv ki;
    public static final Lv c;
    public static final Lv os;
    public static final Lv jP;
    public static final Lv oC;
    public static final int XP;

    private sT_2() {
    }

    public static Lv C(float var0, float var1, float var2, float var3) {
        int var4 = XP;
        var4 ^= 362510347;
        int var5 = (int)var0;
        Integer var25 = var5;
        if (var25 != null) {
            var4 *= -1505228739;
            var4 -= -783539964;
            var4 &= 2019553466;
            var4 += 1947744996;
            var4 ^= -2005724490;
            return new bQ(var0, var1, var2, var3);
        } else {
            var4 ^= 2093350408;
            var4 &= 1410215255;
            var4 ^= 649433055;
            long var14 = var4;
            long var6 = var14 + 1L;
            var6 = var14 * var6;
            long var8 = var14 + 2L;
            var6 *= var8;
            long var15 = var14 + 3L;
            var6 *= var15;
            long var16 = var6 & 7L;
            long var29;
            var4 = (var29 = var16 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var4 != 0) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }
    }

    public static Lv v(int var0) {
        int var1 = XP;
        var1 ^= 109617748;
        int var4 = var0 + 1;
        var4 = var0 * var4;
        int var3 = var4 & 1;
        if (var3 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ -1092400586;
                case 104517391 -> {
                    var1 >>>= 9;
                    yield var1 ^ -1658861193;
                }
                case 1919366723 -> var1 ^ 796565199;
            };
            Integer var28 = var0;
            if (var28 != null) {
                if (var0 < 1) {
                    var1 *= 2106634311;
                    var1 &= 1671135157;
                    var1 <<= 11;
                    var1 &= -2085731254;
                    var1 ^= 951353545;
                    IllegalArgumentException var31 = new IllegalArgumentException("steps must be >= 1");
                    throw var31;
                }

                switch (var1) {
                    case -1659055088:
                        var1 ^= -1430040359;
                        var1 *= -1994922497;
                        var1 ^= -1400841881;
                        var1 += 1898817449;
                        var1 ^= 1975398214;
                        break;
                    case -734504149:
                    default:
                        var1 ^= -233904598;
                        break;
                    case 1331534529:
                        var1 ^= 590008734;
                }

                int var29 = var0 + 1;
                var29 = var0 * var29;
                int var2 = var29 & 1;
                if (var2 == 0) {
                    return var1x -> {
                        label53: {
                            float var54;
                            label52: {
                                int var2x = XP;
                                var2x ^= 552017484;
                                Integer var5x = var0;
                                if (var5x != null) {
                                    var2x += -1805498828;
                                    var2x ^= -70343103;
                                    float var65;
                                    int var53 = (var65 = var1x - 1.0F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                                    if (var53 >= 0) {
                                        var2x -= -1004294939;
                                        var2x *= 1739189165;
                                        var2x ^= -363765609;
                                        var2x ^= -1309805593;
                                        int var55 = var0 + 1;
                                        int var56 = var0 * var55;
                                        int var61 = var0 + 2;
                                        int var57 = var56 * var61;
                                        var61 = var0 + 3;
                                        int var58 = var57 * var61;
                                        int var59 = var58 & 7;
                                        if (var59 != 0) {
                                            break label53;
                                        }

                                        var54 = 1.0F;
                                        var2x |= 636377759;
                                        var2x |= 2026537543;
                                        var2x <<= 14;
                                        var2x ^= -2143140254;
                                        break label52;
                                    }

                                    var2x += -1270248410;
                                    var2x |= -2075128781;
                                    var2x ^= 949506872;
                                    float var6x = var0;
                                    Integer var4x = var0;
                                    if (var4x != null) {
                                        var2x = switch (var2x) {
                                            case -1491948824 -> var2x ^ 673685592;
                                            case -1085604853 -> {
                                                var2x <<= 2;
                                                var2x += 1336366719;
                                                yield var2x ^ -1201535269;
                                            }
                                            default -> var2x ^ 384034859;
                                        };
                                        var4x = var0;
                                        if (var4x == null) {
                                            break label53;
                                        }

                                        float var43 = var1x * var6x;
                                        int var44 = TP.s(var43);
                                        float var45 = var44;
                                        var6x = var0;
                                        float var46 = var45 / var6x;
                                        var54 = var46;
                                        switch (var2x) {
                                            case -2111609415:
                                            default:
                                                var2x ^= -1041363077;
                                                break label52;
                                            case -839111521:
                                                var2x ^= 591734980;
                                                break label52;
                                            case -189710224:
                                                var2x *= 1290422749;
                                                var2x ^= -1736894766;
                                                break label52;
                                        }
                                    }

                                    var2x += 569365294;
                                    var2x &= -926582516;
                                    var2x ^= -986789140;
                                } else {
                                    var2x += -264398933;
                                    var2x &= 1988287774;
                                    var2x |= -93291820;
                                    var2x ^= -2295502;
                                }

                                var2x = var0 + 1;
                                var2x = var0 * var2x;
                                int var52 = var0 + 2;
                                var2x *= var52;
                                int var3x = var0 + 3;
                                var2x *= var3x;
                                var2x &= 7;
                                if (var2x == 0) {
                                    IllegalArgumentException var41 = new IllegalArgumentException();
                                    throw var41;
                                }
                                break label53;
                            }

                            int var47 = var0 + 1;
                            var47 = var0 * var47;
                            int var63 = var0 + 2;
                            var47 *= var63;
                            var63 = var0 + 3;
                            var47 *= var63;
                            var47 &= 7;
                            if (var47 == 0) {
                                return var54;
                            }
                        }

                        AssertionError var40 = new AssertionError();
                        throw var40;
                    };
                }
            }

            IllegalArgumentException var27 = new IllegalArgumentException();
            throw var27;
        } else {
            switch (var1) {
                case -1585019510:
                default:
                    var1 ^= -1063203934;
                    break;
                case -572876784:
                    var1 ^= -1099709943;
                    break;
                case 104517391:
                    var1 += -1119217746;
                    var1 *= -641965513;
                    var1 <<= 6;
                    var1 ^= 64908810;
            }

            IllegalStateException var12 = new IllegalStateException();
            throw var12;
        }
    }

    private static float z(float var0) {
        int var1 = XP;
        var1 ^= 1223128724;
        int var2 = (int)var0;
        float var3 = 7.5625F;
        int var90 = var2 + 1;
        int var91 = var2 * var90;
        int var4 = var2 + 2;
        int var92 = var91 * var4;
        var4 = var2 + 3;
        int var93 = var92 * var4;
        int var94 = var93 & 7;
        if (var94 != 0) {
            switch (var1) {
                case -768323059:
                    var1 ^= -220727116;
                    break;
                case 1213537231:
                    var1 += -1003583943;
                    var1 |= 2109868948;
                    var1 ^= 1471841001;
                    break;
                case 1988932657:
                default:
                    var1 ^= -15022580;
            }
        } else {
            label149: {
                var1 = switch (var1) {
                    case 143699771 -> var1 ^ 2146510360;
                    case 1213537231 -> {
                        var1 -= 267070711;
                        var1 ^= -1669566019;
                        var1 += 278603171;
                        var1 |= -862328073;
                        yield var1 ^ -643651103;
                    }
                    default -> var1 ^ 251767456;
                };
                long var95 = var1;
                long var5 = var95 + 1L;
                var5 = var95 * var5;
                long var7 = var95 + 2L;
                var5 *= var7;
                long var96 = var95 + 3L;
                var5 *= var96;
                long var97 = var5 & 7L;
                long var153;
                int var98 = (var153 = var97 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
                if (var98 == 0) {
                    var3 = 2.75F;
                    float var154;
                    int var100 = (var154 = var0 - 0.36363637F) == 0.0F ? 0 : (var154 < 0.0F ? -1 : 1);
                    if (var100 < 0) {
                        var1 = switch (var1) {
                            default -> var1 ^ 769618433;
                            case 339666967 -> var1 ^ -1512512065;
                            case 622544414 -> {
                                var1 -= 1491973505;
                                var1 -= -225698305;
                                yield var1 ^ 1927607337;
                            }
                        };
                        var3 = 7.5625F * var0;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        var4 &= 1;
                        if (var4 == 0) {
                            var1 += -1874262315;
                            var1 ^= 1333826615;
                            return var3 * var0;
                        }

                        var1 *= 1412478941;
                        var1 ^= -153406066;
                        break label149;
                    }

                    var1 >>>= 2;
                    var1 ^= -1363421830;
                    float var155;
                    int var101 = (var155 = var0 - 0.72727275F) == 0.0F ? 0 : (var155 < 0.0F ? -1 : 1);
                    Integer var118 = var2;
                    if (var118 == null) {
                        var1 |= 2017253830;
                        var1 -= 271733914;
                        var1 |= 257355307;
                        var1 -= -1725978152;
                        var1 ^= 2092526818;
                        break label149;
                    }
                    var1 = switch (var1) {
                        case -1476590339 -> {
                            var1 += -1940402852;
                            var1 ^= -229661904;
                            var1 ^= -1737464036;
                            var1 >>>= 22;
                            yield var1 ^ 1558973741;
                        }
                        default -> var1 ^ -852703275;
                        case 653620724 -> var1 ^ -1104305566;
                    };
                    var118 = var1;
                    if (var118 != null) {
                        if (var101 < 0) {
                            var1 ^= -934850608;
                            var1 >>= 4;
                            var1 &= -194683961;
                            var1 |= 2004648792;
                            var1 ^= 1745772595;
                            var3 = var0 - 0.54545456F;
                            var118 = var2;
                            if (var118 == null) {
                                var1 ^= -244949082;
                                var1 ^= -789745779;
                                var1 ^= -1803490763;
                                break label149;
                            }
                            var118 = switch (var1) {
                                case -1619856533 -> {
                                    var1 |= -1549103805;
                                    yield var1 ^ -771306270;
                                }
                                default -> var1 ^ -1108801739;
                                case 588236486 -> var1 ^ -1654797936;
                            };
                            if (var118 != null) {
                                float var103 = 7.5625F * var3;
                                var3 = var103 * var3;
                                return var3 + 0.75F;
                            }
                        } else {
                            var1 >>>= 27;
                            var1 &= 1653458845;
                            var1 >>= 29;
                            var1 ^= 1479212449;
                            float var156;
                            int var105 = (var156 = var0 - 0.90909094F) == 0.0F ? 0 : (var156 < 0.0F ? -1 : 1);
                            int var122 = var2 + 1;
                            var122 = var2 * var122;
                            int var143 = var2 + 2;
                            var122 *= var143;
                            int var144 = var2 + 3;
                            var122 *= var144;
                            var122 &= 7;
                            if (var122 != 0) {
                                var1 |= 1389477028;
                                var1 ^= 1887622352;
                                break label149;
                            }

                            var1 ^= -1339393130;
                            var1 -= -816458105;
                            var1 ^= -1614524639;
                            var122 = var1 + 1;
                            var122 = var1 * var122;
                            var122 &= 1;
                            if (var122 == 0) {
                                if (var105 >= 0) {
                                    var1 = switch (var1) {
                                        case -2022776687 -> {
                                            var1 >>= 8;
                                            var1 |= -420325872;
                                            yield var1 ^ 1851364956;
                                        }
                                        case 1407380676 -> var1 ^ 193968376;
                                        default -> var1 ^ -1663211685;
                                    };
                                    var3 = var0 - 0.95454544F;
                                    float var114 = 7.5625F * var3;
                                    var3 = var114 * var3;
                                    long var134 = var2;
                                    long var6 = var134 + 1L;
                                    var6 = var134 * var6;
                                    long var8 = var134 + 2L;
                                    var6 *= var8;
                                    long var135 = var134 + 3L;
                                    var6 *= var135;
                                    long var136 = var6 & 7L;
                                    long var157;
                                    var2 = (var157 = var136 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                                    if (var2 == 0) {
                                        switch (var1) {
                                            case -1850808148:
                                                var1 += -208159267;
                                                var1 |= 1075088796;
                                                var1 ^= 1845839419;
                                                break;
                                            case 748035805:
                                            default:
                                                var1 ^= 625915678;
                                                break;
                                            case 1087062765:
                                                var1 ^= -977401395;
                                        }

                                        return var3 + 0.984375F;
                                    }

                                    var1 &= 1860222974;
                                    var1 -= 878098851;
                                    var1 -= 4516080;
                                    var1 ^= -428069012;
                                    break label149;
                                }
                                var1 = switch (var1) {
                                    case -2022776687 -> {
                                        var1 |= 706338419;
                                        var1 += -1680334619;
                                        var1 >>= 17;
                                        var1 ^= 1334333363;
                                        yield var1 ^ 1603638219;
                                    }
                                    default -> var1 ^ 614289929;
                                    case -758263201 -> var1 ^ -1171928824;
                                };
                                long var106 = var1;
                                var5 = var106 + 1L;
                                var5 = var106 * var5;
                                var7 = var106 + 2L;
                                var5 *= var7;
                                long var107 = var106 + 3L;
                                var5 *= var107;
                                long var108 = var5 & 7L;
                                long var158;
                                int var109 = (var158 = var108 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                                if (var109 == 0) {
                                    var3 = var0 - 0.8181818F;
                                    var122 = var2 + 1;
                                    var122 = var2 * var122;
                                    var122 &= 1;
                                    if (var122 != 0) {
                                        var1 &= 1240965574;
                                        var1 *= 1467221251;
                                        var1 &= -1990216697;
                                        var1 ^= -319069616;
                                        var1 ^= -946078943;
                                        break label149;
                                    }

                                    var1 >>= 21;
                                    var1 *= -1745296269;
                                    var1 ^= -1362447279;
                                    Integer var133 = var1;
                                    if (var133 != null) {
                                        float var111 = 7.5625F * var3;
                                        var3 = var111 * var3;
                                        return var3 + 0.9375F;
                                    }
                                }
                            }
                        }
                    }
                }

                RuntimeException var88 = new RuntimeException();
                throw var88;
            }
        }

        IllegalStateException var87 = new IllegalStateException();
        throw var87;
    }

    private static float Rg(float var0, int var1, int var2) {
        label56: {
            int var4 = var1;
            int var5 = (int)var0;
            float var6 = 1.0F;
            int var7 = 0;
            int var8 = var5 + 1;
            var8 = var5 * var8;
            int var9 = var5 + 2;
            var8 *= var9;
            var9 = var5 + 3;
            var8 *= var9;
            var8 &= 7;
            if (var8 != 0) {
                int var34 = var2 + -494662991;
                var34 ^= -1604837030;
            } else {
                int var3 = switch (var2) {
                    case 989395827 -> {
                        int var10 = var2 >>> 31;
                        yield var10 ^ -773310818;
                    }
                    case 1364623127 -> var2 ^ -221379004;
                    default -> var2 ^ 1168770400;
                };
                var6 = var6;
                var7 = var7;
                var3 += -1697007612;
                var3 ^= -1618015943;

                while (true) {
                    var8 = var4 + 1;
                    var8 = var4 * var8;
                    var9 = var4 + 2;
                    var8 *= var9;
                    var9 = var4 + 3;
                    var8 *= var9;
                    var8 &= 7;
                    if (var8 != 0) {
                        break label56;
                    }

                    if (var7 >= var1) {
                        var3 *= -476300437;
                        var3 ^= 2098537960;
                        long var30 = var4;
                        long var38 = var30 + 1L;
                        long var39 = var30 * var38;
                        long var31 = var39 & 1L;
                        long var58;
                        var3 = (var58 = var31 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return var6;
                        }
                        break label56;
                    }

                    var3 += 1526300545;
                    var3 -= -1845108965;
                    var3 >>>= 12;
                    var3 ^= -833248434;
                    Integer var49 = var4;
                    if (var49 == null) {
                        break label56;
                    }

                    float var50 = var6 * var0;
                    var9 = var7 + 1;
                    var6 = var50;
                    var49 = var5;
                    if (var49 == null) {
                        var3 *= 1224314989;
                        var3 -= -861652002;
                        var3 -= 1908546340;
                        var3 ^= 1091446802;
                        break;
                    }

                    var3 ^= -1618430881;
                    var3 ^= -23752046;
                    var3 |= 2009124993;
                    var3 >>= 24;
                    var3 ^= -407770511;
                    var49 = var4;
                    if (var49 == null) {
                        break label56;
                    }

                    var7 = var9;
                    var3 |= -9160042;
                    var3 -= -1961894337;
                    var3 ^= -2027911484;
                }
            }

            RuntimeException var53 = new RuntimeException();
            throw var53;
        }

        IllegalArgumentException var33 = new IllegalArgumentException();
        throw var33;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 339732926;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        XP = var4;
        Lv var5 = var0x -> {
            int var1x = (int)var0x;
            return var0x;
        };
        S = var5;
        Lv var6 = var0x -> {
            int var1x = XP;
            var1x ^= -2067796294;
            int var2x = (int)var0x;
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var2x += 3;
            var3x *= var2x;
            var2x = var3x & 7;
            if (var2x != 0) {
                var1x |= 233032651;
                var1x ^= -2085937;
                var1x ^= 530407474;
                var1x ^= -608008943;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    UnsupportedOperationException var20x = new UnsupportedOperationException();
                    throw var20x;
                }
            } else {
                var1x &= -1798056034;
                var1x ^= 289625760;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var3x = var1x + 2;
                var2x *= var3x;
                var1x += 3;
                var2x *= var1x;
                var1x = var2x & 7;
                if (var1x == 0) {
                    return var0x * var0x;
                }
            }

            IllegalArgumentException var14x = new IllegalArgumentException();
            throw var14x;
        };
        H = var6;
        Lv var7 = var0x -> {
            int var1x = XP;
            var1x ^= 1299571942;
            int var2x = (int)var0x;
            float var3x = 1.0F - var0x;
            float var4x = 1.0F - var0x;
            Integer var14x = var2x;
            if (var14x == null) {
                var1x &= -624981164;
                var1x <<= 2;
                var1x -= 2003659868;
                var1x ^= 1572038078;
                var1x ^= 946795848;
                IllegalStateException var15x = new IllegalStateException();
                throw var15x;
            } else {
                var1x -= 387378583;
                var1x ^= -934731201;
                float var8x = var3x * var4x;
                return 1.0F - var8x;
            }
        };
        d = var7;
        Lv var8 = var0x -> {
            int var1x = XP;
            var1x ^= 1951712285;
            int var2x = (int)var0x;
            float var105;
            int var3x = (var105 = var0x - 0.5F) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            long var8x = var4x + 2L;
            var6x *= var8x;
            var4x += 3L;
            var6x *= var4x;
            var4x = var6x & 7L;
            long var106;
            int var66 = (var106 = var4x - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
            if (var66 != 0) {
                var1x &= -415640266;
                var1x &= 1967735815;
                var1x += -360459152;
                var1x ^= -1448145218;
            } else {
                label78: {
                    var1x >>= 1;
                    var1x *= -1408941719;
                    var1x ^= 1271713353;
                    int var67 = var1x + 1;
                    int var68 = var1x * var67;
                    int var69 = var68 & 1;
                    label66:
                    if (var69 == 0) {
                        float var63;
                        if (var3x < 0) {
                            var1x = switch (var1x) {
                                default -> var1x ^ 583554154;
                                case 657905554 -> {
                                    var1x -= -680967053;
                                    var1x <<= 25;
                                    yield var1x ^ 1195933712;
                                }
                                case 1685623762 -> var1x ^ -424110866;
                            };
                            long var58 = var1x;
                            long var5x = var58 + 1L;
                            var5x = var58 * var5x;
                            long var59 = var5x & 1L;
                            long var107;
                            var3x = (var107 = var59 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                            if (var3x != 0) {
                                break label66;
                            }

                            float var61 = 2.0F * var0x;
                            float var62 = var61 * var0x;
                            int var70 = var2x + 1;
                            int var71 = var2x * var70;
                            int var72 = var71 & 1;
                            if (var72 != 0) {
                                var1x += 1192744199;
                                var1x ^= 922806915;
                                var1x *= -670802459;
                                var1x ^= -1437009492;
                                break label78;
                            }
                            var1x = switch (var1x) {
                                case 511608987 -> var1x ^ 741707257;
                                case 2034794512 -> {
                                    var1x |= 1757499749;
                                    var1x <<= 17;
                                    yield var1x ^ 723660149;
                                }
                                default -> var1x ^ -786100181;
                            };
                            Integer var73 = var1x;
                            if (var73 == null) {
                                break label66;
                            }

                            var63 = var62;
                            var1x -= 778630796;
                            var1x &= -805675535;
                            var1x &= 1997106929;
                            var1x ^= -2131965224;
                        } else {
                            var1x |= 678372329;
                            var1x ^= 955504660;
                            var1x -= -2111116373;
                            var1x ^= 1092339583;
                            var1x ^= -1909646793;
                            var4x = var1x;
                            var6x = var4x + 1L;
                            var6x = var4x * var6x;
                            var4x = var6x & 1L;
                            long var108;
                            int var76 = (var108 = var4x - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                            if (var76 != 0) {
                                break label66;
                            }

                            float var77 = -2.0F * var0x;
                            float var78 = var77 + 2.0F;
                            int var85 = var1x * -17799805;
                            var85 += -1738909420;
                            var85 >>>= 1;
                            var85 ^= 1478445167;
                            float var79 = Rg(var78, 2, var85);
                            float var80 = var79 / 2.0F;
                            float var81 = 1.0F - var80;
                            var85 = var2x + 1;
                            var85 = var2x * var85;
                            int var101 = var2x + 2;
                            var85 *= var101;
                            var2x += 3;
                            var85 *= var2x;
                            var2x = var85 & 7;
                            if (var2x != 0) {
                                var1x &= 968938784;
                                var1x ^= -9679928;
                                break label78;
                            }

                            var1x += -1083639601;
                            var1x >>= 19;
                            var1x += 37027498;
                            var1x ^= -1647112129;
                            long var93 = var1x;
                            long var7x = var93 + 1L;
                            var7x = var93 * var7x;
                            long var9x = var93 + 2L;
                            var7x *= var9x;
                            long var94 = var93 + 3L;
                            var7x *= var94;
                            long var95 = var7x & 7L;
                            long var109;
                            var2x = (var109 = var95 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                            if (var2x != 0) {
                                break label66;
                            }

                            var63 = var81;
                            var1x &= 1761626792;
                            var1x >>>= 10;
                            var1x ^= 691103762;
                            var1x |= 2116260423;
                            var1x ^= -1126730642;
                        }

                        var2x = var1x + 1;
                        var2x = var1x * var2x;
                        int var82 = var1x + 2;
                        var2x *= var82;
                        int var83 = var1x + 3;
                        var2x *= var83;
                        var2x &= 7;
                        if (var2x == 0) {
                            return var63;
                        }
                    }

                    UnsupportedOperationException var57 = new UnsupportedOperationException();
                    throw var57;
                }
            }

            AssertionError var48 = new AssertionError();
            throw var48;
        };
        s = var8;
        Lv var9 = var0x -> {
            int var1x = XP;
            var1x ^= 321966286;
            int var2x = (int)var0x;
            long var17x = var2x;
            long var4x = var17x + 1L;
            var4x = var17x * var4x;
            long var6x = var17x + 2L;
            var4x *= var6x;
            long var18x = var17x + 3L;
            var4x *= var18x;
            long var19x = var4x & 7L;
            long var31x;
            var2x = (var31x = var19x - 0L) == 0L ? 0 : (var31x < 0L ? -1 : 1);
            if (var2x == 0) {
                long var21x = switch (var1x) {
                    default -> var1x ^ -1747823744;
                    case 327335317 -> {
                        var1x *= 547869853;
                        var1x -= -644771474;
                        var1x -= -593268449;
                        var1x += 1899665391;
                        yield var1x ^ -986786062;
                    }
                    case 1337548114 -> var1x ^ 300924069;
                };
                var4x = var21x + 1L;
                var4x = var21x * var4x;
                long var22x = var4x & 1L;
                long var32x;
                var2x = (var32x = var22x - 0L) == 0L ? 0 : (var32x < 0L ? -1 : 1);
                if (var2x != 0) {
                    UnsupportedOperationException var25x = new UnsupportedOperationException();
                    throw var25x;
                } else {
                    float var24x = var0x * var0x;
                    return var24x * var0x;
                }
            } else {
                var1x *= 2122262049;
                var1x ^= -1003655795;
                IllegalArgumentException var11x = new IllegalArgumentException();
                throw var11x;
            }
        };
        bS = var9;
        Lv var10 = var0x -> {
            int var1x = XP;
            var1x ^= 208455357;
            int var2x = (int)var0x;
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var2x += 3;
            var3x *= var2x;
            var2x = var3x & 7;
            if (var2x != 0) {
                var1x ^= -1652209743;
                var1x -= 1862255680;
                var1x |= 143195143;
                var1x *= -171794983;
                var1x ^= -1142885016;
                AssertionError var26x = new AssertionError();
                throw var26x;
            } else {
                var1x ^= -2073506233;
                var1x ^= 1134645001;
                var1x ^= -1856306994;
                long var22x = var1x;
                long var30x = var22x + 1L;
                long var31x = var22x * var30x;
                long var23x = var31x & 1L;
                long var32x;
                var2x = (var32x = var23x - 0L) == 0L ? 0 : (var32x < 0L ? -1 : 1);
                if (var2x == 0) {
                    float var25x = 1.0F - var0x;
                    var1x ^= -962582360;
                    var1x += -854945346;
                    var1x ^= 1393455103;
                    float var14x = Rg(var25x, 3, var1x);
                    return 1.0F - var14x;
                } else {
                    IllegalStateException var10x = new IllegalStateException();
                    throw var10x;
                }
            }
        };
        aO = var10;
        Lv var11 = var0x -> {
            int var1x = XP;
            var1x ^= 348911328;
            int var2x = (int)var0x;
            float var95;
            int var3x = (var95 = var0x - 0.5F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            var4x = var6x & 1L;
            long var96;
            int var66 = (var96 = var4x - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var66 != 0) {
                switch (var1x) {
                    case 343514043:
                        var1x += 481276768;
                        var1x *= -1183032995;
                        var1x ^= 1509181332;
                        break;
                    case 1635785478:
                    default:
                        var1x ^= 2066017318;
                        break;
                    case 1903183398:
                        var1x ^= -1906606545;
                }
            } else {
                label72: {
                    var1x >>= 29;
                    var1x -= 147028433;
                    var1x *= 622267617;
                    var1x ^= -1515077956;
                    int var67 = var1x + 1;
                    int var68 = var1x * var67;
                    int var69 = var68 & 1;
                    label60:
                    if (var69 == 0) {
                        float var64;
                        if (var3x < 0) {
                            var1x = switch (var1x) {
                                default -> var1x ^ 1310486102;
                                case 327405687 -> var1x ^ 1805774056;
                                case 1577360883 -> {
                                    var1x |= 114946645;
                                    var1x ^= 1934479546;
                                    yield var1x ^ 293200035;
                                }
                            };
                            long var57 = var1x;
                            long var5x = var57 + 1L;
                            var5x = var57 * var5x;
                            long var7x = var57 + 2L;
                            var5x *= var7x;
                            long var58 = var57 + 3L;
                            var5x *= var58;
                            long var59 = var5x & 7L;
                            long var97;
                            var3x = (var97 = var59 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                            if (var3x != 0) {
                                break label60;
                            }

                            float var61 = 4.0F * var0x;
                            int var70 = var2x + 1;
                            int var71 = var2x * var70;
                            int var72 = var71 & 1;
                            if (var72 != 0) {
                                var1x += -1153788598;
                                var1x += 1093378684;
                                var1x ^= 96296901;
                                var1x *= 19094207;
                                var1x ^= 1006497300;
                                break label72;
                            }

                            var1x &= 1171882270;
                            var1x &= 334339567;
                            var1x ^= -1851154840;
                            var4x = var1x;
                            var6x = var4x + 1L;
                            var6x = var4x * var6x;
                            var4x = var6x & 1L;
                            long var98;
                            int var75 = (var98 = var4x - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                            if (var75 != 0) {
                                break label60;
                            }

                            float var62 = var61 * var0x;
                            float var63 = var62 * var0x;
                            var64 = var63;
                            var1x ^= 1677819126;
                            var1x ^= -3176203;
                        } else {
                            var1x ^= 2018408760;
                            var1x -= -1880330801;
                            var1x *= 1289289763;
                            var1x *= 894065373;
                            var1x ^= 364536968;
                            int var76 = var1x + 1;
                            int var77 = var1x * var76;
                            int var78 = var77 & 1;
                            if (var78 != 0) {
                                break label60;
                            }

                            float var79 = -2.0F * var0x;
                            Integer var50 = var2x;
                            if (var50 == null) {
                                var1x >>= 1;
                                var1x += 1341026732;
                                var1x |= 95164390;
                                var1x += -730960242;
                                var1x ^= -1485242833;
                                break label72;
                            }

                            var1x |= 797297510;
                            var1x ^= -1340596374;
                            float var51 = var79 + 2.0F;
                            int var80 = var1x | 1210726125;
                            int var81 = var80 ^ 1968639390;
                            float var52 = Rg(var51, 3, var81);
                            float var53 = var52 / 2.0F;
                            float var54 = 1.0F - var53;
                            var64 = var54;
                            var1x -= 1822285663;
                            var1x <<= 21;
                            var1x &= 1905343589;
                            var1x |= -263935986;
                            var1x ^= -93699221;
                        }

                        var4x = var1x;
                        var6x = var4x + 1L;
                        var6x = var4x * var6x;
                        long var8x = var4x + 2L;
                        var6x *= var8x;
                        var4x += 3L;
                        var6x *= var4x;
                        var4x = var6x & 7L;
                        long var99;
                        var2x = (var99 = var4x - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                        if (var2x == 0) {
                            return var64;
                        }
                    }

                    RuntimeException var56 = new RuntimeException();
                    throw var56;
                }
            }

            IllegalArgumentException var49 = new IllegalArgumentException();
            throw var49;
        };
        q = var11;
        Lv var12 = var0x -> {
            int var1x = XP;
            var1x ^= -693922602;
            int var2x = (int)var0x;
            float var3x = var0x * var0x;
            Integer var19x = var2x;
            if (var19x == null) {
                var19x = switch (var1x) {
                    case -2012581534 -> var1x ^ 8249876;
                    case -703465075 -> {
                        var1x *= 896086463;
                        yield var1x ^ -692620544;
                    }
                    default -> var1x ^ 1090256352;
                };
                if (var19x != null) {
                    IllegalArgumentException var21x = new IllegalArgumentException();
                    throw var21x;
                }
            } else {
                var1x += -1245987394;
                var1x ^= -817048653;
                long var13x = var1x;
                long var4x = var13x + 1L;
                var4x = var13x * var4x;
                long var6x = var13x + 2L;
                var4x *= var6x;
                long var14x = var13x + 3L;
                var4x *= var14x;
                long var15x = var4x & 7L;
                long var25x;
                var1x = (var25x = var15x - 0L) == 0L ? 0 : (var25x < 0L ? -1 : 1);
                if (var1x == 0) {
                    float var18x = var3x * var0x;
                    return var18x * var0x;
                }
            }

            AssertionError var17x = new AssertionError();
            throw var17x;
        };
        Z = var12;
        Lv var13 = var0x -> {
            int var1x = XP;
            var1x ^= 1498458518;
            int var2x = (int)var0x;
            Integer var17x = var2x;
            if (var17x == null) {
                var1x ^= -1424234631;
                var1x ^= 1637413185;
                int var18x = var1x + 1;
                var18x = var1x * var18x;
                int var3x = var1x + 2;
                var18x *= var3x;
                var3x = var1x + 3;
                var18x *= var3x;
                var18x &= 7;
                if (var18x == 0) {
                    RuntimeException var23x = new RuntimeException();
                    throw var23x;
                }
            } else {
                var1x &= 1186635265;
                var1x ^= -280932433;
                var1x += -773141545;
                var1x >>= 24;
                var1x ^= 487639866;
                var17x = var1x;
                if (var17x != null) {
                    float var25x = 1.0F - var0x;
                    var1x ^= 464337641;
                    var1x &= 1832526549;
                    var1x ^= 1408956707;
                    float var16x = Rg(var25x, 4, var1x);
                    return 1.0F - var16x;
                }
            }

            IllegalStateException var12x = new IllegalStateException();
            throw var12x;
        };
        B = var13;
        Lv var14 = var0x -> {
            label66: {
                int var29x;
                float var63;
                label65: {
                    var29x = XP;
                    var29x ^= -302661942;
                    int var2x = (int)var0x;
                    long var3x = var2x;
                    long var5x = var3x + 1L;
                    var5x = var3x * var5x;
                    long var7x = var3x + 2L;
                    var5x *= var7x;
                    long var50 = var3x + 3L;
                    var5x *= var50;
                    long var51 = var5x & 7L;
                    long var87;
                    int var52 = (var87 = var51 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var52 != 0) {
                        var29x |= -542307766;
                        var29x <<= 16;
                        var29x ^= -1689315810;
                    } else {
                        var29x ^= 212298921;
                        var29x |= -1095695502;
                        var29x *= 1703617037;
                        var29x ^= -636977971;
                        var29x ^= -1203366003;
                        long var53 = var29x;
                        var5x = var53 + 1L;
                        var5x = var53 * var5x;
                        long var54 = var5x & 1L;
                        long var88;
                        int var55 = (var88 = var54 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                        if (var55 != 0) {
                            break label66;
                        }

                        float var89;
                        int var56 = (var89 = var0x - 0.5F) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                        if (var56 < 0) {
                            var29x ^= 1811689639;
                            var29x ^= -1208871565;
                            var29x <<= 16;
                            var29x ^= -947965067;
                            int var57 = var29x - 1423118460;
                            int var58 = var57 ^ 39150091;
                            int var59 = var58 >> 25;
                            int var60 = var59 ^ 989395834;
                            var63 = Rg(var0x, 4, var60);
                            var63 = 8.0F * var63;
                            int var4x = var2x + 1;
                            var4x = var2x * var4x;
                            int var79 = var2x + 2;
                            var4x *= var79;
                            int var80 = var2x + 3;
                            var4x *= var80;
                            var4x &= 7;
                            if (var4x == 0) {
                                var29x -= 928497345;
                                var29x |= -425004827;
                                var29x ^= -1801297694;
                                var29x ^= -550196335;
                                Integer var68 = var29x;
                                if (var68 == null) {
                                    break label66;
                                }

                                var63 = var63;
                                switch (var29x) {
                                    case -1539489914:
                                        var29x += 1423375160;
                                        var29x *= -1313035245;
                                        var29x &= -564059588;
                                        var29x ^= 288243506;
                                        break label65;
                                    case -646502005:
                                        var29x ^= -1621299749;
                                        break label65;
                                    case 2021070028:
                                    default:
                                        var29x ^= -1303569733;
                                        break label65;
                                }
                            }

                            switch (var29x) {
                                case -1005120009:
                                default:
                                    var29x ^= 1143049023;
                                    break;
                                case -756380833:
                                    var29x ^= -1356761674;
                                    break;
                                case 1691956085:
                                    var29x ^= -1775285015;
                                    var29x >>>= 28;
                                    var29x -= 1829860549;
                                    var29x ^= -763716268;
                            }
                        } else {
                            var29x &= -106366844;
                            var29x ^= -1309393489;
                            Integer var69 = var29x;
                            if (var69 == null) {
                                break label66;
                            }

                            float var70 = -2.0F * var0x;
                            float var71 = var70 + 2.0F;
                            int var81 = var29x * -866097151;
                            int var82 = var81 ^ 435367644;
                            float var72 = Rg(var71, 4, var82);
                            float var73 = var72 / 2.0F;
                            var5x = var2x;
                            var7x = var5x + 1L;
                            var7x = var5x * var7x;
                            var5x = var7x & 1L;
                            long var90;
                            var2x = (var90 = var5x - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                            if (var2x == 0) {
                                var29x += -760244913;
                                var29x -= -540225357;
                                var29x ^= -388617582;
                                float var46 = 1.0F - var73;
                                var63 = var46;
                                switch (var29x) {
                                    case -715792668:
                                        var29x ^= -1954393397;
                                        break label65;
                                    case 1005168857:
                                        var29x >>>= 23;
                                        var29x += -12786971;
                                        var29x ^= 2048056438;
                                        break label65;
                                    case 1576807937:
                                    default:
                                        var29x ^= -998317975;
                                        break label65;
                                }
                            }

                            var29x += -815999487;
                            var29x += -187107539;
                            var29x ^= -469328701;
                        }
                    }

                    Integer var37x = var29x;
                    if (var37x != null) {
                        IllegalStateException var38x = new IllegalStateException();
                        throw var38x;
                    }
                    break label66;
                }

                int var47 = var29x + 1;
                var47 = var29x * var47;
                var47 &= 1;
                if (var47 == 0) {
                    return var63;
                }
            }

            AssertionError var44 = new AssertionError();
            throw var44;
        };
        qX = var14;
        Lv var15 = var0x -> {
            int var1x = XP;
            var1x ^= -2094310777;
            int var2x = (int)var0x;
            Integer var19x = var2x;
            if (var19x != null) {
                var1x = switch (var1x) {
                    case -2087110692 -> {
                        var1x -= -577754669;
                        yield var1x ^ 603105522;
                    }
                    case -1524533776 -> var1x ^ 2010000098;
                    default -> var1x ^ -341382448;
                };
                var19x = var1x;
                if (var19x != null) {
                    int var21x = var1x >> 30;
                    var21x ^= -989395827;
                    return Rg(var0x, 5, var21x);
                }
            } else {
                var1x += 468153222;
                var1x >>>= 29;
                var1x ^= 1465310493;
                long var13x = var1x;
                long var3x = var13x + 1L;
                var3x = var13x * var3x;
                long var5x = var13x + 2L;
                var3x *= var5x;
                long var14x = var13x + 3L;
                var3x *= var14x;
                long var15x = var3x & 7L;
                long var26x;
                var1x = (var26x = var15x - 0L) == 0L ? 0 : (var26x < 0L ? -1 : 1);
                if (var1x == 0) {
                    UnsupportedOperationException var18x = new UnsupportedOperationException();
                    throw var18x;
                }
            }

            IllegalArgumentException var17x = new IllegalArgumentException();
            throw var17x;
        };
        Kg = var15;
        Lv var16 = var0x -> {
            int var1x = XP;
            var1x ^= 1652586573;
            int var2x = (int)var0x;
            long var16x = var2x;
            long var4x = var16x + 1L;
            var4x = var16x * var4x;
            long var17x = var4x & 1L;
            long var34x;
            var2x = (var34x = var17x - 0L) == 0L ? 0 : (var34x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x >>= 8;
                var1x &= 469070874;
                var1x <<= 13;
                var1x ^= 241863777;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                int var3x = var1x + 2;
                var2x *= var3x;
                var3x = var1x + 3;
                var2x *= var3x;
                var2x &= 7;
                if (var2x == 0) {
                    IllegalArgumentException var24x = new IllegalArgumentException();
                    throw var24x;
                }
            } else {
                var1x &= 1587384886;
                var1x ^= -633125157;
                long var25x = var1x;
                var4x = var25x + 1L;
                var4x = var25x * var4x;
                long var26x = var4x & 1L;
                long var35x;
                var2x = (var35x = var26x - 0L) == 0L ? 0 : (var35x < 0L ? -1 : 1);
                if (var2x == 0) {
                    float var29x = 1.0F - var0x;
                    var1x *= -1729674819;
                    var1x ^= -1821058774;
                    float var15x = Rg(var29x, 5, var1x);
                    return 1.0F - var15x;
                }
            }

            UnsupportedOperationException var28x = new UnsupportedOperationException();
            throw var28x;
        };
        O = var16;
        Lv var17 = var0x -> {
            label53: {
                int var1x = XP;
                var1x ^= -946088775;
                int var2x = (int)var0x;
                float var70;
                int var3x = (var70 = var0x - 0.5F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                int var4x = var2x + 1;
                var4x = var2x * var4x;
                var4x &= 1;
                if (var4x == 0) {
                    var1x ^= -1482125376;
                    var1x |= -657762750;
                    var1x ^= -1254064655;
                    if (var3x < 0) {
                        var1x ^= 1504911712;
                        var1x *= -1685704899;
                        var1x ^= 346524768;
                        var3x = var1x * 1163397679;
                        var3x ^= -153407046;
                        float var51 = Rg(var0x, 5, var3x);
                        float var52 = 16.0F * var51;
                        var4x = var2x + 1;
                        var4x = var2x * var4x;
                        var4x &= 1;
                        if (var4x == 0) {
                            var1x -= -2067033264;
                            var1x *= -2106098973;
                            var1x ^= 682743838;
                            var1x &= 364851664;
                            var1x >>>= 29;
                            var1x ^= -1922251110;
                            return var52;
                        }

                        switch (var1x) {
                            case -1445899129:
                                var1x |= -880155061;
                                var1x |= -676465799;
                                var1x ^= -2086189190;
                                break;
                            case -359634837:
                            default:
                                var1x ^= -860549792;
                                break;
                            case 1136742157:
                                var1x ^= 1838037406;
                        }
                    } else {
                        var1x *= 1067736673;
                        var1x ^= -472556912;
                        Integer var61 = var1x;
                        if (var61 == null) {
                            break label53;
                        }

                        float var62 = -2.0F * var0x;
                        float var63 = var62 + 2.0F;
                        int var5x = var1x >>> 7;
                        var5x ^= 993093503;
                        float var64 = Rg(var63, 5, var5x);
                        float var65 = var64 / 2.0F;
                        float var66 = 1.0F - var65;
                        var5x = var2x + 1;
                        var5x = var2x * var5x;
                        var2x = var5x & 1;
                        if (var2x == 0) {
                            var1x += 464578607;
                            var1x &= 1876672770;
                            var1x += 1731490745;
                            var1x ^= 1882242687;
                            var1x ^= 1802386551;
                            var2x = var1x + 1;
                            var2x = var1x * var2x;
                            var2x &= 1;
                            if (var2x != 0) {
                                break label53;
                            }

                            switch (var1x) {
                                case -1991053759:
                                default:
                                    var1x ^= -1277753616;
                                    return var66;
                                case -446628470:
                                    var1x ^= -1592356871;
                                    return var66;
                                case 2094117299:
                                    var1x *= 706247481;
                                    var1x &= -632855267;
                                    var1x -= -1343129779;
                                    var1x ^= 1831030614;
                                    return var66;
                            }
                        }

                        var1x |= -880864441;
                        var1x += 1324893124;
                        var1x &= -253625235;
                        var1x ^= 1287383212;
                    }
                } else {
                    var1x += -573395037;
                    var1x -= 737946752;
                    var1x ^= 89820544;
                }

                long var40 = var1x;
                long var54 = var40 + 1L;
                long var55 = var40 * var54;
                long var41 = var55 & 1L;
                long var71;
                var1x = (var71 = var41 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                if (var1x == 0) {
                    IllegalArgumentException var44 = new IllegalArgumentException();
                    throw var44;
                }
            }

            UnsupportedOperationException var43 = new UnsupportedOperationException();
            throw var43;
        };
        th = var17;
        Lv var18 = var0x -> {
            int var1x = XP;
            var1x ^= 1646592641;
            int var2x = (int)var0x;
            float var3x = var0x * (float) Math.PI;
            var3x /= 2.0F;
            double var22x = var3x;
            double var23x = Math.cos(var22x);
            int var5x = var2x + 1;
            var5x = var2x * var5x;
            var2x = var5x & 1;
            if (var2x == 0) {
                var1x += 464776081;
                var1x ^= 1726101178;
                long var25x = var1x;
                long var7x = var25x + 1L;
                var7x = var25x * var7x;
                long var26x = var7x & 1L;
                long var28x;
                var2x = (var28x = var26x - 0L) == 0L ? 0 : (var28x < 0L ? -1 : 1);
                if (var2x == 0) {
                    float var20x = (float)var23x;
                    return 1.0F - var20x;
                } else {
                    IllegalArgumentException var19x = new IllegalArgumentException();
                    throw var19x;
                }
            } else {
                switch (var1x) {
                    case -900047401:
                        var1x ^= 2007245470;
                        break;
                    case 59464925:
                    default:
                        var1x ^= 35975705;
                        break;
                    case 1654091738:
                        var1x ^= 82113844;
                        var1x ^= -1093209739;
                }

                IllegalStateException var14x = new IllegalStateException();
                throw var14x;
            }
        };
        go = var18;
        Lv var19 = var0x -> {
            int var1x = XP;
            var1x ^= 70305745;
            int var2x = (int)var0x;
            float var3x = var0x * (float) Math.PI;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            var4x = var6x & 1L;
            long var26x;
            var2x = (var26x = var4x - 0L) == 0L ? 0 : (var26x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x ^= 1175876786;
                var1x >>>= 4;
                var1x &= 293879590;
                var1x += 563274850;
                var1x ^= 1527611852;
                Integer var19x = var1x;
                if (var19x != null) {
                    float var21x = var3x / 2.0F;
                    double var22x = var21x;
                    double var23x = Math.sin(var22x);
                    return (float)var23x;
                } else {
                    IllegalArgumentException var20x = new IllegalArgumentException();
                    throw var20x;
                }
            } else {
                var1x += 115630971;
                var1x |= 203097147;
                var1x ^= 1261047576;
                AssertionError var12x = new AssertionError();
                throw var12x;
            }
        };
        Q = var19;
        Lv var20 = var0x -> {
            int var1x = XP;
            var1x ^= -606631251;
            int var2x = (int)var0x;
            float var3x = (float) Math.PI * var0x;
            double var23x = var3x;
            double var24x = Math.cos(var23x);
            var3x = (float)var24x;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            var4x = var6x & 1L;
            long var28x;
            var2x = (var28x = var4x - 0L) == 0L ? 0 : (var28x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x += -1775269365;
                var1x -= -2097220840;
                var1x *= -1183993917;
                var1x ^= 79798394;
                IllegalArgumentException var22x = new IllegalArgumentException();
                throw var22x;
            } else {
                switch (var1x) {
                    case -614078474:
                        var1x -= -1472518184;
                        var1x ^= 1136146275;
                        var1x *= 336186269;
                        var1x ^= -1053743382;
                        break;
                    case -482783021:
                        var1x ^= 1480010485;
                        break;
                    case -170310252:
                    default:
                        var1x ^= 1769670164;
                }

                float var15x = var3x - 1.0F;
                float var16x = -var15x;
                return var16x / 2.0F;
            }
        };
        Jj = var20;
        Lv var21 = var0x -> {
            int var1x = XP;
            var1x ^= 1389304264;
            int var2x = (int)var0x;
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var4x = var2x + 3;
            var3x *= var4x;
            var3x &= 7;
            if (var3x != 0) {
                var1x ^= 1736725360;
                var1x -= -1947872804;
                var1x &= 1852153635;
                var1x ^= 972041578;
            } else {
                label52: {
                    var1x -= 617593629;
                    var1x |= -1890503099;
                    var1x &= 1508224702;
                    var1x ^= -1953430835;
                    long var45 = var1x;
                    long var5x = var45 + 1L;
                    var5x = var45 * var5x;
                    long var7x = var45 + 2L;
                    var5x *= var7x;
                    long var46 = var45 + 3L;
                    var5x *= var46;
                    long var47 = var5x & 7L;
                    long var67;
                    var3x = (var67 = var47 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                    label41:
                    if (var3x == 0) {
                        float var68;
                        var3x = (var68 = var0x - 0.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                        float var53;
                        if (var3x <= 0) {
                            var1x -= 133103960;
                            var1x ^= -1112467923;
                            var1x -= -801509731;
                            var1x ^= -1414655067;
                            var3x = var1x + 1;
                            var3x = var1x * var3x;
                            var3x &= 1;
                            if (var3x != 0) {
                                break label41;
                            }

                            var53 = 0.0F;
                            var1x += 1215058229;
                            var1x ^= -1198899061;
                        } else {
                            var1x ^= 2103382164;
                            var1x ^= 1083329997;
                            Integer var55 = var1x;
                            if (var55 == null) {
                                break label41;
                            }

                            float var56 = 10.0F * var0x;
                            float var57 = var56 - 10.0F;
                            int var63 = var2x + 1;
                            int var64 = var2x * var63;
                            int var6x = var2x + 2;
                            int var65 = var64 * var6x;
                            var2x += 3;
                            int var66 = var65 * var2x;
                            var2x = var66 & 7;
                            if (var2x != 0) {
                                var1x <<= 20;
                                var1x *= 1045112125;
                                var1x ^= -900646039;
                                break label52;
                            }

                            var1x *= -1221417899;
                            var1x ^= -2059920323;
                            double var58 = var57;
                            double var59 = Math.pow(2.0, var58);
                            float var38x = (float)var59;
                            var53 = var38x;
                            var1x -= 531570484;
                            var1x += -545963322;
                            var1x *= 1852569085;
                            var1x |= 1172798712;
                            var1x ^= 1085051135;
                        }

                        Integer var39x = var1x;
                        if (var39x != null) {
                            return var53;
                        }
                    }

                    UnsupportedOperationException var40 = new UnsupportedOperationException();
                    throw var40;
                }
            }

            AssertionError var35x = new AssertionError();
            throw var35x;
        };
        vN = var21;
        Lv var22 = var0x -> {
            label62: {
                int var25x;
                float var44;
                label61: {
                    var25x = XP;
                    var25x ^= -286235316;
                    int var2x = (int)var0x;
                    float var65;
                    int var3x = (var65 = var0x - 1.0F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                    int var4x = var2x + 1;
                    var4x = var2x * var4x;
                    var4x &= 1;
                    if (var4x == 0) {
                        var25x = switch (var25x) {
                            case -297662441 -> {
                                var25x |= 545301571;
                                yield var25x ^ -34713269;
                            }
                            case 1107844860 -> var25x ^ 1768471743;
                            default -> var25x ^ -1718186001;
                        };
                        if (var3x >= 0) {
                            var25x = switch (var25x) {
                                default -> var25x ^ 70517191;
                                case -680766974 -> var25x ^ 373915687;
                                case 321715484 -> {
                                    var25x <<= 25;
                                    var25x -= 1976033061;
                                    var25x ^= 503336665;
                                    yield var25x ^ 80922894;
                                }
                            };
                            long var45 = var25x;
                            long var60 = var45 + 1L;
                            var60 = var45 * var60;
                            long var7x = var45 + 2L;
                            var60 *= var7x;
                            long var46 = var45 + 3L;
                            var60 *= var46;
                            long var47 = var60 & 7L;
                            long var66;
                            int var48 = (var66 = var47 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                            if (var48 != 0) {
                                break label62;
                            }

                            var44 = 1.0F;
                            var25x += 1879033462;
                            var25x ^= -1671369773;
                            break label61;
                        }
                        var25x = switch (var25x) {
                            case -1949744583 -> var25x ^ 2116676630;
                            default -> var25x ^ 1682884672;
                            case 321715484 -> {
                                var25x &= -318350322;
                                var25x ^= 972066438;
                                yield var25x ^ -1087475142;
                            }
                        };
                        long var53 = var25x;
                        long var6x = var53 + 1L;
                        var6x = var53 * var6x;
                        long var54 = var6x & 1L;
                        long var67;
                        var4x = (var67 = var54 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                        if (var4x != 0) {
                            break label62;
                        }

                        float var56 = -10.0F * var0x;
                        int var5x = var2x + 1;
                        var5x = var2x * var5x;
                        var2x = var5x & 1;
                        if (var2x == 0) {
                            var25x &= 222853695;
                            var25x |= 155375813;
                            var25x |= -1121701822;
                            var25x ^= 1068231921;
                            Integer var38x = var25x;
                            if (var38x == null) {
                                break label62;
                            }

                            double var57 = var56;
                            double var58 = Math.pow(2.0, var57);
                            float var39x = (float)var58;
                            float var40 = 1.0F - var39x;
                            var44 = var40;
                            var25x *= 1676869425;
                            var25x ^= 1121732983;
                            break label61;
                        }

                        var25x >>>= 12;
                        var25x &= 1724617706;
                        var25x >>= 2;
                        var25x *= 1809252407;
                        var25x ^= -417543171;
                    } else {
                        var25x ^= -1574777761;
                        var25x ^= -1475805837;
                    }

                    long var32x = var25x;
                    long var49 = var32x + 1L;
                    long var50 = var32x * var49;
                    long var33x = var50 & 1L;
                    long var68;
                    var25x = (var68 = var33x - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                    if (var25x == 0) {
                        UnsupportedOperationException var36x = new UnsupportedOperationException();
                        throw var36x;
                    }
                    break label62;
                }

                int var41 = var25x + 1;
                var41 = var25x * var41;
                var41 &= 1;
                if (var41 == 0) {
                    return var44;
                }
            }

            UnsupportedOperationException var35x = new UnsupportedOperationException();
            throw var35x;
        };
        R = var22;
        Lv var23 = var0x -> {
            label110: {
                int var1x = XP;
                var1x ^= -1765297929;
                int var2x = (int)var0x;
                int var3x = var2x + 1;
                var3x = var2x * var3x;
                var3x &= 1;
                if (var3x != 0) {
                    var1x <<= 21;
                    var1x ^= 1382116389;
                } else {
                    var1x *= -849522379;
                    var1x += -422201431;
                    var1x ^= -105959967;
                    var3x = var1x + 1;
                    var3x = var1x * var3x;
                    int var4x = var1x + 2;
                    var3x *= var4x;
                    var4x = var1x + 3;
                    var3x *= var4x;
                    var3x &= 7;
                    if (var3x != 0) {
                        break label110;
                    }

                    float var162;
                    var3x = (var162 = var0x - 0.0F) == 0.0F ? 0 : (var162 < 0.0F ? -1 : 1);
                    if (var3x <= 0) {
                        var1x = switch (var1x) {
                            case 397676763 -> var1x ^ 2070390231;
                            default -> var1x ^ 1870282856;
                            case 1651713444 -> {
                                var1x -= 2140118051;
                                var1x ^= -745478607;
                                var1x &= -697179593;
                                var1x ^= -1544736436;
                                yield var1x ^ 854107034;
                            }
                        };
                        var3x = var1x + 1;
                        var3x = var1x * var3x;
                        var3x &= 1;
                        if (var3x == 0) {
                            return 0.0F;
                        }
                        break label110;
                    }

                    var1x |= -1997534705;
                    var1x ^= -1147230902;
                    Integer var99 = var1x;
                    if (var99 == null) {
                        break label110;
                    }

                    float var163;
                    int var100 = (var163 = var0x - 1.0F) == 0.0F ? 0 : (var163 < 0.0F ? -1 : 1);
                    var4x = var2x + 1;
                    var4x = var2x * var4x;
                    var4x &= 1;
                    if (var4x != 0) {
                        switch (var1x) {
                            case -1335473582:
                                var1x ^= 568411286;
                                break;
                            case 1366133477:
                                var1x += 1417744786;
                                var1x &= -858141889;
                                var1x <<= 11;
                                var1x |= -1895059752;
                                var1x ^= 682283773;
                                break;
                            case 2065215396:
                            default:
                                var1x ^= 397685050;
                        }
                    } else {
                        var1x -= 78005546;
                        var1x *= 817078241;
                        var1x ^= -2044726578;
                        if (var100 >= 0) {
                            var1x += 864195055;
                            var1x += -88110273;
                            var1x += 976463722;
                            var1x |= 400007639;
                            var1x ^= -1245741915;
                            return 1.0F;
                        }

                        var1x |= 817980707;
                        var1x |= 239365287;
                        var1x -= 232861212;
                        var1x *= 235729729;
                        var1x ^= 1827172326;
                        long var101 = var1x;
                        long var5x = var101 + 1L;
                        var5x = var101 * var5x;
                        long var7x = var101 + 2L;
                        var5x *= var7x;
                        long var102 = var101 + 3L;
                        var5x *= var102;
                        long var103 = var5x & 7L;
                        long var164;
                        var100 = (var164 = var103 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                        if (var100 != 0) {
                            break label110;
                        }

                        float var165;
                        var100 = (var165 = var0x - 0.5F) == 0.0F ? 0 : (var165 < 0.0F ? -1 : 1);
                        var4x = var2x + 1;
                        var4x = var2x * var4x;
                        var4x &= 1;
                        if (var4x == 0) {
                            var1x >>>= 1;
                            var1x <<= 26;
                            var1x &= 2050042758;
                            var1x += 1548263516;
                            var1x ^= 2013081999;
                            if (var100 < 0) {
                                var1x = switch (var1x) {
                                    case -1548381741 -> {
                                        var1x -= 1835235288;
                                        var1x *= -252417317;
                                        var1x -= 1447646044;
                                        yield var1x ^ -1686595305;
                                    }
                                    case -69307794 -> var1x ^ 1743572088;
                                    default -> var1x ^ 2051073157;
                                };
                                var100 = var1x + 1;
                                var100 = var1x * var100;
                                var4x = var1x + 2;
                                var100 *= var4x;
                                var4x = var1x + 3;
                                var100 *= var4x;
                                var100 &= 7;
                                if (var100 != 0) {
                                    break label110;
                                }

                                float var111 = 20.0F * var0x;
                                float var112 = var111 - 10.0F;
                                long var134 = var2x;
                                long var6x = var134 + 1L;
                                var6x = var134 * var6x;
                                long var135 = var6x & 1L;
                                long var166;
                                var4x = (var166 = var135 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                                if (var4x == 0) {
                                    var1x <<= 18;
                                    var1x += -1381381776;
                                    var1x &= -1614802872;
                                    var1x >>= 17;
                                    var1x ^= 1429467598;
                                    long var137 = var1x;
                                    var6x = var137 + 1L;
                                    var6x = var137 * var6x;
                                    long var138 = var6x & 1L;
                                    long var167;
                                    var4x = (var167 = var138 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                                    if (var4x != 0) {
                                        break label110;
                                    }

                                    double var113 = var112;
                                    double var114 = Math.pow(2.0, var113);
                                    float var115 = (float)var114;
                                    float var116 = var115 / 2.0F;
                                    var1x ^= 525504324;
                                    var1x *= -374113749;
                                    var1x *= 678719609;
                                    var1x -= 1784241010;
                                    var1x ^= 427941509;
                                    return var116;
                                }

                                var1x *= -1289252237;
                                var1x ^= 309690395;
                            } else {
                                var1x -= 1395074802;
                                var1x ^= 751851155;
                                var4x = var1x + 1;
                                var4x = var1x * var4x;
                                var4x &= 1;
                                if (var4x != 0) {
                                    break label110;
                                }

                                float var143 = -20.0F * var0x;
                                float var144 = var143 + 10.0F;
                                double var145 = var144;
                                double var146 = Math.pow(2.0, var145);
                                float var147 = (float)var146;
                                int var151 = var2x + 1;
                                int var152 = var2x * var151;
                                int var161 = var2x + 2;
                                int var153 = var152 * var161;
                                var2x += 3;
                                int var154 = var153 * var2x;
                                var2x = var154 & 7;
                                if (var2x == 0) {
                                    var1x = switch (var1x) {
                                        case 276241085 -> var1x ^ -1330948035;
                                        default -> var1x ^ -589942736;
                                        case 2086550642 -> {
                                            var1x ^= 137291758;
                                            var1x += 706422663;
                                            var1x >>= 31;
                                            var1x += 475175406;
                                            yield var1x ^ -76485337;
                                        }
                                    };
                                    var2x = var1x + 1;
                                    var2x = var1x * var2x;
                                    int var155 = var1x + 2;
                                    var2x *= var155;
                                    int var156 = var1x + 3;
                                    var2x *= var156;
                                    var2x &= 7;
                                    if (var2x != 0) {
                                        break label110;
                                    }

                                    float var89 = 2.0F - var147;
                                    float var90 = var89 / 2.0F;
                                    var1x >>>= 18;
                                    var1x >>= 10;
                                    var1x ^= -1196412571;
                                    var1x -= 442046359;
                                    var1x ^= 101084733;
                                    return var90;
                                }

                                var1x &= -394852631;
                                var1x |= 305763272;
                                var1x <<= 15;
                                var1x ^= 739601445;
                            }
                        } else {
                            var1x &= 297820515;
                            var1x |= -2125767276;
                            var1x ^= 1982468496;
                        }
                    }
                }

                long var66 = var1x;
                long var118 = var66 + 1L;
                long var119 = var66 * var118;
                long var157 = var66 + 2L;
                long var120 = var119 * var157;
                long var67 = var66 + 3L;
                long var121 = var120 * var67;
                long var68 = var121 & 7L;
                long var168;
                var1x = (var168 = var68 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                if (var1x == 0) {
                    UnsupportedOperationException var70 = new UnsupportedOperationException();
                    throw var70;
                }
            }

            AssertionError var81 = new AssertionError();
            throw var81;
        };
        W = var23;
        Lv var24 = var0x -> {
            int var1x = XP;
            var1x ^= 68922259;
            int var2x = (int)var0x;
            float var3x = var0x * var0x;
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            int var5x = var2x + 2;
            var4x *= var5x;
            var2x += 3;
            var4x *= var2x;
            var2x = var4x & 7;
            if (var2x == 0) {
                var1x ^= 1940852767;
                var1x ^= 1269882236;
                float var16x = 1.0F - var3x;
                double var17x = var16x;
                double var18x = Math.sqrt(var17x);
                float var19x = (float)var18x;
                return 1.0F - var19x;
            } else {
                var1x += -1192852897;
                var1x >>= 7;
                var1x ^= 1085447138;
                var1x ^= 1371188265;
                RuntimeException var11x = new RuntimeException();
                throw var11x;
            }
        };
        su = var24;
        Lv var25 = var0x -> {
            int var1x = XP;
            var1x ^= 1864220100;
            int var2x = (int)var0x;
            float var3x = var0x - 1.0F;
            float var4x = var0x - 1.0F;
            var3x *= var4x;
            var3x = 1.0F - var3x;
            int var27x = var2x + 1;
            int var28x = var2x * var27x;
            int var5x = var2x + 2;
            int var29x = var28x * var5x;
            var2x += 3;
            int var30x = var29x * var2x;
            var2x = var30x & 7;
            if (var2x != 0) {
                var1x -= 328074597;
                var1x += -642239963;
                var1x -= -1091881786;
                var1x ^= 115332805;
                long var31x = var1x;
                long var6x = var31x + 1L;
                var6x = var31x * var6x;
                long var32x = var6x & 1L;
                long var34x;
                var2x = (var34x = var32x - 0L) == 0L ? 0 : (var34x < 0L ? -1 : 1);
                if (var2x != 0) {
                    UnsupportedOperationException var24x = new UnsupportedOperationException();
                    throw var24x;
                } else {
                    RuntimeException var23x = new RuntimeException();
                    throw var23x;
                }
            } else {
                var1x ^= 1638765263;
                var1x &= 970651192;
                var1x += -557766492;
                var1x += 1911718444;
                var1x ^= -2005779157;
                double var14x = var3x;
                double var15x = Math.sqrt(var14x);
                return (float)var15x;
            }
        };
        fU = var25;
        Lv var26 = var0x -> {
            label51: {
                int var25x;
                float var72;
                label50: {
                    var25x = XP;
                    var25x ^= 724127990;
                    int var2x = (int)var0x;
                    long var3x = var2x;
                    long var5x = var3x + 1L;
                    var5x = var3x * var5x;
                    long var57 = var5x & 1L;
                    long var93;
                    int var58 = (var93 = var57 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                    if (var58 == 0) {
                        var25x *= -768776923;
                        var25x += -1301869970;
                        var25x ^= -658129895;
                        float var94;
                        int var59 = (var94 = var0x - 0.5F) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                        if (var59 < 0) {
                            var25x &= 1259658115;
                            var25x ^= 417162223;
                            long var60 = var25x;
                            var5x = var60 + 1L;
                            var5x = var60 * var5x;
                            long var7x = var60 + 2L;
                            var5x *= var7x;
                            long var61 = var60 + 3L;
                            var5x *= var61;
                            long var62 = var5x & 7L;
                            long var95;
                            int var63 = (var95 = var62 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                            if (var63 != 0) {
                                break label51;
                            }

                            var72 = 2.0F * var0x;
                            int var4x = var25x | -1017192856;
                            var4x |= 24629325;
                            var4x ^= -385415778;
                            var72 = Rg(var72, 2, var4x);
                            var72 = 1.0F - var72;
                            var4x = var2x + 1;
                            var4x = var2x * var4x;
                            var4x &= 1;
                            if (var4x == 0) {
                                var25x >>>= 9;
                                var25x &= -137507014;
                                var25x ^= 1497559347;
                                double var67 = var72;
                                double var68 = Math.sqrt(var67);
                                var72 = (float)var68;
                                var72 = 1.0F - var72;
                                var72 /= 2.0F;
                                var72 = var72;
                                var25x -= -1395568775;
                                var25x &= 1273724888;
                                var25x |= 218729591;
                                var25x <<= 25;
                                var25x ^= 915656939;
                                break label50;
                            }

                            var25x -= -998110099;
                            var25x ^= -1569746840;
                            var25x ^= -1029968799;
                        } else {
                            var25x += 1285712372;
                            var25x >>= 3;
                            var25x &= -1218558252;
                            var25x ^= -1837811076;
                            Integer var79 = var25x;
                            if (var79 == null) {
                                break label51;
                            }

                            float var80 = -2.0F * var0x;
                            float var81 = var80 + 2.0F;
                            int var90 = var25x + 1943031333;
                            int var91 = var90 | 287171920;
                            int var92 = var91 ^ 566694958;
                            float var82 = Rg(var81, 2, var92);
                            Integer var46 = var2x;
                            if (var46 != null) {
                                var25x |= -1489875831;
                                var25x += 1065549069;
                                var25x -= 1745081756;
                                var25x |= -1822261422;
                                var25x ^= 1102513364;
                                var46 = var25x;
                                if (var46 == null) {
                                    break label51;
                                }

                                float var48 = 1.0F - var82;
                                double var83 = var48;
                                double var84 = Math.sqrt(var83);
                                float var49 = (float)var84;
                                var49++;
                                float var51 = var49 / 2.0F;
                                var72 = var51;
                                var25x |= 1899260581;
                                var25x &= -580933358;
                                var25x ^= 365853161;
                                break label50;
                            }

                            var25x ^= 187865909;
                            var25x += -540645237;
                            var25x ^= -1851790063;
                        }
                    } else {
                        var25x ^= -1812545379;
                        var25x >>>= 17;
                        var25x &= 1145008178;
                        var25x ^= -322964805;
                    }

                    var2x = var25x + 1;
                    var2x = var25x * var2x;
                    int var73 = var25x + 2;
                    var2x *= var73;
                    var25x += 3;
                    var2x *= var25x;
                    var25x = var2x & 7;
                    if (var25x == 0) {
                        AssertionError var45 = new AssertionError();
                        throw var45;
                    }
                    break label51;
                }

                Integer var52 = var25x;
                if (var52 != null) {
                    return var72;
                }
            }

            AssertionError var44 = new AssertionError();
            throw var44;
        };
        o = var26;
        Lv var27 = var0x -> {
            int var1x = XP;
            var1x ^= 89464501;
            int var2x = (int)var0x;
            float var3x = 2.70158F * var0x;
            var3x *= var0x;
            var3x *= var0x;
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            var2x = var4x & 1;
            if (var2x == 0) {
                var1x |= 1128561962;
                var1x &= -1024757009;
                var1x ^= -1664528779;
                float var15x = 1.70158F * var0x;
                float var16x = var15x * var0x;
                return var3x - var16x;
            } else {
                Integer var8x = switch (var1x) {
                    case -2119361654 -> var1x ^ 760021046;
                    default -> var1x ^ 128268869;
                    case 99054574 -> {
                        var1x &= 1069735182;
                        yield var1x ^ 180514580;
                    }
                };
                if (var8x != null) {
                    AssertionError var10x = new AssertionError();
                    throw var10x;
                } else {
                    RuntimeException var9x = new RuntimeException();
                    throw var9x;
                }
            }
        };
        WJ = var27;
        Lv var28 = var0x -> {
            int var1x = XP;
            var1x ^= -1528638484;
            int var2x = (int)var0x;
            float var3x = var0x - 1.0F;
            int var4x = var1x - 212149103;
            var4x ^= -1838323654;
            var4x >>>= 24;
            var4x ^= 989395830;
            var3x = Rg(var3x, 3, var4x);
            var3x = 2.70158F * var3x;
            long var32x = var2x;
            long var6x = var32x + 1L;
            var6x = var32x * var6x;
            long var33x = var6x & 1L;
            long var35x;
            var2x = (var35x = var33x - 0L) == 0L ? 0 : (var35x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x *= 561824923;
                var1x -= 971904060;
                var1x |= -1470744568;
                var1x |= 1292443249;
                var1x ^= 1225903408;
                IllegalStateException var25x = new IllegalStateException();
                throw var25x;
            } else {
                var1x &= 695454997;
                var1x ^= -1471379993;
                var1x += -1397337210;
                var1x += 675422531;
                var1x ^= -555628434;
                float var24x = 1.0F + var3x;
                var3x = var0x - 1.0F;
                var1x |= 628098753;
                var1x ^= -1660072538;
                float var16x = Rg(var3x, 2, var1x);
                float var17x = 1.70158F * var16x;
                return var24x + var17x;
            }
        };
        qQ = var28;
        Lv var29 = var0x -> {
            int var1x = XP;
            var1x ^= -1495621954;
            int var2x = (int)var0x;
            long var3x = var2x;
            long var5x = var3x + 1L;
            var5x = var3x * var5x;
            long var7x = var3x + 2L;
            var5x *= var7x;
            var3x += 3L;
            var5x *= var3x;
            var3x = var5x & 7L;
            long var93;
            int var61 = (var93 = var3x - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
            if (var61 != 0) {
                switch (var1x) {
                    case -1503071259:
                        var1x ^= -1271764101;
                        var1x -= 580055965;
                        var1x ^= 1182421174;
                        break;
                    case 1884219117:
                    default:
                        var1x ^= -634264115;
                        break;
                    case 1955828283:
                        var1x ^= 2117966346;
                }
            } else {
                label65: {
                    label58: {
                        var1x |= -622638826;
                        var1x *= -266255819;
                        var1x ^= 307198458;
                        float var94;
                        int var62 = (var94 = var0x - 0.5F) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                        float var67;
                        if (var62 < 0) {
                            var1x *= -2087348819;
                            var1x += -708477352;
                            var1x &= -950028586;
                            var1x >>>= 9;
                            var1x ^= -1453582425;
                            float var63 = 2.0F * var0x;
                            Integer var4x = var2x;
                            if (var4x == null) {
                                var1x *= -295993795;
                                var1x ^= 904726377;
                                break label65;
                            }
                            var1x = switch (var1x) {
                                case -1455637962 -> {
                                    var1x += 1363849259;
                                    var1x >>= 4;
                                    var1x |= 1564334176;
                                    var1x ^= -1912906670;
                                    yield var1x ^ -2012061926;
                                }
                                case 443041945 -> var1x ^ 1245672511;
                                default -> var1x ^ 630319196;
                            };
                            var4x = var1x;
                            if (var4x == null) {
                                break label58;
                            }

                            int var69 = var1x & 48731432;
                            var69 ^= 951873115;
                            float var64 = Rg(var63, 2, var69);
                            float var71 = 7.189819F * var0x;
                            float var72 = var71 - 2.5949094F;
                            float var65 = var64 * var72;
                            float var66 = var65 / 2.0F;
                            var67 = var66;
                            var1x |= 1361262855;
                            var1x -= -1394525585;
                            var1x ^= 536406882;
                        } else {
                            var1x ^= -765016965;
                            var1x *= 1947609333;
                            var1x &= -1022033703;
                            var1x ^= 224523115;
                            Integer var73 = var1x;
                            if (var73 == null) {
                                break label58;
                            }

                            float var74 = 2.0F * var0x;
                            Integer var48 = var2x;
                            if (var48 == null) {
                                var1x -= 850280092;
                                var1x -= 87686371;
                                var1x ^= -1137687981;
                                break label65;
                            }

                            var1x |= -1719839867;
                            var1x ^= 310666565;
                            var5x = var1x;
                            var7x = var5x + 1L;
                            var7x = var5x * var7x;
                            long var9x = var5x + 2L;
                            var7x *= var9x;
                            var5x += 3L;
                            var7x *= var5x;
                            var5x = var7x & 7L;
                            long var95;
                            int var49 = (var95 = var5x - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                            if (var49 != 0) {
                                break label58;
                            }

                            float var50 = var74 - 2.0F;
                            int var75 = var1x - 97687739;
                            var75 ^= -1262615240;
                            var75 ^= -1347254496;
                            var75 ^= -338525044;
                            float var51 = Rg(var50, 2, var75);
                            float var79 = var0x * 2.0F;
                            float var80 = var79 - 2.0F;
                            float var81 = 3.5949094F * var80;
                            float var82 = var81 + 2.5949094F;
                            float var52 = var51 * var82;
                            float var53 = var52 + 2.0F;
                            float var54 = var53 / 2.0F;
                            var67 = var54;
                            var1x ^= -1586979685;
                            var1x *= -183627401;
                            var1x -= 204839490;
                            var1x ^= 1181730591;
                        }

                        var2x = var1x + 1;
                        var2x = var1x * var2x;
                        var2x &= 1;
                        if (var2x == 0) {
                            return var67;
                        }
                    }

                    UnsupportedOperationException var58 = new UnsupportedOperationException();
                    throw var58;
                }
            }

            IllegalArgumentException var47 = new IllegalArgumentException();
            throw var47;
        };
        r = var29;
        Lv var30 = var0x -> {
            int var1x = XP;
            var1x ^= -970644302;
            int var2x = (int)var0x;
            float var108;
            int var3x = (var108 = var0x - 0.0F) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            int var5x = var2x + 2;
            var4x *= var5x;
            var5x = var2x + 3;
            var4x *= var5x;
            var4x &= 7;
            label66:
            if (var4x == 0) {
                var1x += 844467826;
                var1x ^= -593343651;
                var4x = var1x + 1;
                var4x = var1x * var4x;
                var5x = var1x + 2;
                var4x *= var5x;
                var5x = var1x + 3;
                var4x *= var5x;
                var4x &= 7;
                if (var4x == 0) {
                    if (var3x <= 0) {
                        var1x += 8520597;
                        var1x &= 952704985;
                        var1x ^= 545625730;
                        return 0.0F;
                    }

                    var1x >>= 2;
                    var1x |= -902475373;
                    var1x ^= 117463772;
                    long var57 = var1x;
                    long var97 = var57 + 1L;
                    long var98 = var57 * var97;
                    long var7x = var57 + 2L;
                    long var99 = var98 * var7x;
                    long var58 = var57 + 3L;
                    long var100 = var99 * var58;
                    long var59 = var100 & 7L;
                    long var109;
                    var3x = (var109 = var59 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                    if (var3x == 0) {
                        float var110;
                        var3x = (var110 = var0x - 1.0F) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
                        var4x = var2x + 1;
                        var4x = var2x * var4x;
                        var4x &= 1;
                        if (var4x != 0) {
                            switch (var1x) {
                                case -868765937:
                                    var1x ^= -443473813;
                                    var1x -= -823165727;
                                    var1x *= -1390370623;
                                    var1x |= 441271192;
                                    var1x ^= -1827067246;
                                    break label66;
                                case 217261271:
                                default:
                                    var1x ^= 953935827;
                                    break label66;
                                case 1422298089:
                                    var1x ^= 700944525;
                                    break label66;
                            }
                        }

                        var1x ^= -1947068912;
                        var1x |= -323722248;
                        var1x ^= 413322316;
                        var1x ^= -1815840690;
                        var1x ^= 1448732600;
                        if (var3x >= 0) {
                            var1x = switch (var1x) {
                                default -> var1x ^ -1648548084;
                                case -240771617 -> var1x ^ -842995292;
                                case 852142149 -> {
                                    var1x ^= -1983052176;
                                    var1x &= -462306081;
                                    var1x >>= 1;
                                    yield var1x ^ 1036629896;
                                }
                            };
                            var3x = var1x + 1;
                            var3x = var1x * var3x;
                            var3x &= 1;
                            if (var3x == 0) {
                                return 1.0F;
                            }
                        } else {
                            var1x &= 2113400152;
                            var1x &= 1550760924;
                            var1x |= 477912891;
                            var1x += -1466533797;
                            var1x ^= -2003754464;
                            var3x = var1x + 1;
                            var3x = var1x * var3x;
                            var4x = var1x + 2;
                            var3x *= var4x;
                            var4x = var1x + 3;
                            var3x *= var4x;
                            var3x &= 7;
                            if (var3x == 0) {
                                float var70 = 10.0F * var0x;
                                float var71 = var70 - 10.0F;
                                double var72 = var71;
                                double var73 = Math.pow(2.0, var72);
                                float var74 = (float)var73;
                                float var75 = -var74;
                                float var90 = var0x * 10.0F;
                                float var91 = var90 - 10.75F;
                                long var101 = var2x;
                                var7x = var101 + 1L;
                                var7x = var101 * var7x;
                                long var9x = var101 + 2L;
                                var7x *= var9x;
                                long var102 = var101 + 3L;
                                var7x *= var102;
                                long var103 = var7x & 7L;
                                long var111;
                                var2x = (var111 = var103 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                                if (var2x != 0) {
                                    var1x <<= 9;
                                    var1x += -1127713350;
                                    var1x ^= -393044749;
                                    break label66;
                                }
                                Integer var53 = switch (var1x) {
                                    case -2067621162 -> var1x ^ 99328701;
                                    default -> var1x ^ 670768512;
                                    case 1300518390 -> {
                                        var1x ^= -140487266;
                                        yield var1x ^ -1041651068;
                                    }
                                };
                                if (var53 != null) {
                                    float var55 = var91 * (float) (Math.PI * 2.0 / 3.0);
                                    double var92 = var55;
                                    double var93 = Math.sin(var92);
                                    float var56 = (float)var93;
                                    return var75 * var56;
                                }
                            }
                        }
                    }
                }

                IllegalStateException var54 = new IllegalStateException();
                throw var54;
            } else {
                var1x ^= -257681324;
                var1x ^= 265994502;
                var1x *= -404280431;
                var1x ^= 1615380216;
                var1x ^= 335094106;
            }

            IllegalArgumentException var48 = new IllegalArgumentException();
            throw var48;
        };
        ri = var30;
        Lv var31 = var0x -> {
            label76: {
                int var1x = XP;
                var1x ^= 1750075390;
                int var2x = (int)var0x;
                Integer var3x = var2x;
                if (var3x == null) {
                    var1x ^= 131927389;
                    var1x &= 1847577145;
                    var1x ^= 1920439473;
                } else {
                    var1x = switch (var1x) {
                        case 657313357 -> var1x ^ -1331432708;
                        case 1759668901 -> {
                            var1x &= 944065779;
                            var1x ^= 1220559673;
                            var1x += -432313673;
                            yield var1x ^ 264593740;
                        }
                        default -> var1x ^ 2132326001;
                    };
                    int var56 = var1x + 1;
                    var56 = var1x * var56;
                    var56 &= 1;
                    if (var56 != 0) {
                        break label76;
                    }

                    float var89;
                    var56 = (var89 = var0x - 0.0F) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                    if (var56 <= 0) {
                        var1x |= -1257262760;
                        var1x ^= 662409279;
                        var1x ^= 61561279;
                        var56 = var1x + 1;
                        var56 = var1x * var56;
                        var56 &= 1;
                        if (var56 == 0) {
                            return 0.0F;
                        }
                        break label76;
                    }

                    var1x += 1952399685;
                    var1x >>= 15;
                    var1x += 1460294203;
                    var1x ^= -115805538;
                    long var60 = var1x;
                    long var5x = var60 + 1L;
                    var5x = var60 * var5x;
                    long var61 = var5x & 1L;
                    long var90;
                    var56 = (var90 = var61 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                    if (var56 != 0) {
                        break label76;
                    }

                    float var91;
                    var56 = (var91 = var0x - 1.0F) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                    int var4x = var2x + 1;
                    var4x = var2x * var4x;
                    var4x &= 1;
                    if (var4x == 0) {
                        var1x |= 1597944616;
                        var1x ^= -57915101;
                        var1x >>= 23;
                        var1x += 2095980931;
                        var1x ^= 1324826695;
                        Integer var75 = var1x;
                        if (var75 == null) {
                            break label76;
                        }

                        if (var56 >= 0) {
                            Integer var69 = switch (var1x) {
                                case 635113249 -> var1x ^ 1836550336;
                                case 840524237 -> {
                                    var1x -= 31177046;
                                    var1x -= 2017582985;
                                    var1x |= 1163155121;
                                    var1x |= -1037389165;
                                    yield var1x ^ 115458224;
                                }
                                default -> var1x ^ -827941024;
                            };
                            if (var69 != null) {
                                return 1.0F;
                            }
                            break label76;
                        }

                        var1x &= -169592594;
                        var1x ^= -174956757;
                        Integer var64 = var1x;
                        if (var64 == null) {
                            break label76;
                        }

                        float var65 = -10.0F * var0x;
                        double var66 = var65;
                        double var67 = Math.pow(2.0, var66);
                        float var68 = (float)var67;
                        float var76 = var0x * 10.0F;
                        float var77 = var76 - 0.75F;
                        float var78 = var77 * (float) (Math.PI * 2.0 / 3.0);
                        double var79 = var78;
                        double var80 = Math.sin(var79);
                        float var81 = (float)var80;
                        Integer var53 = var2x;
                        if (var53 != null) {
                            var1x *= 1254518519;
                            var1x ^= 1585344035;
                            var1x >>= 21;
                            var1x += -308589807;
                            var1x ^= 2026283624;
                            var5x = var1x;
                            long var7x = var5x + 1L;
                            var7x = var5x * var7x;
                            long var9x = var5x + 2L;
                            var7x *= var9x;
                            var5x += 3L;
                            var7x *= var5x;
                            var5x = var7x & 7L;
                            long var92;
                            int var54 = (var92 = var5x - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                            if (var54 == 0) {
                                float var55 = var68 * var81;
                                return var55 + 1.0F;
                            }
                            break label76;
                        }

                        var1x |= -1202434006;
                        var1x &= 1092996319;
                        var1x += -1151724508;
                        var1x ^= -533285254;
                    } else {
                        var1x <<= 18;
                        var1x >>>= 25;
                        var1x += -143778068;
                        var1x <<= 19;
                        var1x ^= -415705463;
                    }
                }

                Integer var47 = var1x;
                if (var47 != null) {
                    IllegalArgumentException var48 = new IllegalArgumentException();
                    throw var48;
                }
            }

            AssertionError var52 = new AssertionError();
            throw var52;
        };
        p = var31;
        Lv var32 = var0x -> {
            label99: {
                int var47;
                float var120;
                label98: {
                    var47 = XP;
                    var47 ^= -893351189;
                    int var2x = (int)var0x;
                    float var145;
                    int var3x = (var145 = var0x - 0.0F) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                    Integer var4x = var2x;
                    if (var4x == null) {
                        var47 ^= 437440802;
                        var47 ^= -1779717947;
                    } else {
                        var47 = switch (var47) {
                            case -987436402 -> var47 ^ -992246798;
                            case -898439248 -> {
                                var47 += 495065508;
                                var47 <<= 29;
                                yield var47 ^ 1365344272;
                            }
                            default -> var47 ^ 406178868;
                        };
                        if (var3x <= 0) {
                            var47 |= 2120959961;
                            var47 -= 1546685818;
                            var47 ^= 1435868234;
                            var47 |= 1941530405;
                            var47 ^= -2062814950;
                            var3x = var47 + 1;
                            var3x = var47 * var3x;
                            int var121 = var47 + 2;
                            var3x *= var121;
                            int var122 = var47 + 3;
                            var3x *= var122;
                            var3x &= 7;
                            if (var3x == 0) {
                                return 0.0F;
                            }
                            break label99;
                        }

                        var47 += 723432783;
                        var47 &= 1500559841;
                        var47 <<= 1;
                        var47 ^= 1124255263;
                        long var82 = var47;
                        long var5x = var82 + 1L;
                        var5x = var82 * var5x;
                        long var7x = var82 + 2L;
                        var5x *= var7x;
                        long var83 = var82 + 3L;
                        var5x *= var83;
                        long var84 = var5x & 7L;
                        long var146;
                        var3x = (var146 = var84 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                        if (var3x != 0) {
                            break label99;
                        }

                        float var147;
                        var3x = (var147 = var0x - 1.0F) == 0.0F ? 0 : (var147 < 0.0F ? -1 : 1);
                        Integer var107 = var2x;
                        if (var107 == null) {
                            var47 &= 857785714;
                            var47 += -308070289;
                            var47 ^= 1697129000;
                        } else {
                            var47 = switch (var47) {
                                default -> var47 ^ 824629887;
                                case -217930595 -> {
                                    var47 >>= 22;
                                    var47 ^= 469760465;
                                    var47 += -2025359295;
                                    yield var47 ^ -1052572253;
                                }
                                case 660481565 -> var47 ^ 734540789;
                            };
                            if (var3x >= 0) {
                                var47 >>= 14;
                                var47 *= -1043255273;
                                var47 |= 382627382;
                                var47 &= -2045115454;
                                var47 ^= 934420181;
                                long var99 = var47;
                                var5x = var99 + 1L;
                                var5x = var99 * var5x;
                                long var100 = var5x & 1L;
                                long var150;
                                var3x = (var150 = var100 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                                if (var3x == 0) {
                                    return 1.0F;
                                }
                                break label99;
                            }

                            var47 >>= 22;
                            var47 *= -2064338181;
                            var47 ^= 1710351421;
                            long var87 = var47;
                            var5x = var87 + 1L;
                            var5x = var87 * var5x;
                            var7x = var87 + 2L;
                            var5x *= var7x;
                            long var88 = var87 + 3L;
                            var5x *= var88;
                            long var89 = var5x & 7L;
                            long var148;
                            var3x = (var148 = var89 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                            if (var3x != 0) {
                                break label99;
                            }

                            float var91 = 20.0F * var0x;
                            float var92 = var91 - 11.125F;
                            int var108 = var2x + 1;
                            int var109 = var2x * var108;
                            int var110 = var109 & 1;
                            if (var110 != 0) {
                                var47 -= 819737362;
                                var47 ^= 1200224548;
                            } else {
                                var47 ^= 342309197;
                                var47 &= -1712873333;
                                var47 -= 978353477;
                                var47 >>= 6;
                                var47 ^= 836868892;
                                float var93 = var92 * ((float) Math.PI * 4.0F / 9.0F);
                                double var94 = var93;
                                double var95 = Math.sin(var94);
                                float var96 = (float)var95;
                                float var149;
                                int var111 = (var149 = var0x - 0.5F) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
                                if (var111 < 0) {
                                    var47 -= -1246176448;
                                    var47 |= 324092832;
                                    var47 ^= -1864177317;
                                    var47 |= 94402678;
                                    var47 ^= -1256931424;
                                    var120 = 20.0F * var0x;
                                    var120 -= 10.0F;
                                    double var114 = var120;
                                    double var115 = Math.pow(2.0, var114);
                                    var120 = (float)var115;
                                    var120 *= var96;
                                    var120 = -var120;
                                    var120 /= 2.0F;
                                    Integer var130 = var2x;
                                    if (var130 != null) {
                                        var47 = switch (var47) {
                                            case 158749279 -> var47 ^ 83983218;
                                            default -> var47 ^ -999416211;
                                            case 984039774 -> {
                                                var47 ^= 1873411515;
                                                var47 *= -1717207459;
                                                var47 &= 1160288663;
                                                var47 += -28528670;
                                                yield var47 ^ 1523652540;
                                            }
                                        };
                                        var120 = var120;
                                        var47 += -196088973;
                                        var47 ^= 1181584820;
                                        var47 ^= -535276552;
                                        break label98;
                                    }

                                    var47 += 38495881;
                                    var47 ^= 2037987760;
                                } else {
                                    var47 -= 2035512621;
                                    var47 += -2067002968;
                                    var47 += -943248203;
                                    var47 ^= 1642763524;
                                    int var131 = var47 + 1;
                                    int var132 = var47 * var131;
                                    int var6x = var47 + 2;
                                    int var133 = var132 * var6x;
                                    var6x = var47 + 3;
                                    int var134 = var133 * var6x;
                                    int var135 = var134 & 7;
                                    if (var135 != 0) {
                                        break label99;
                                    }

                                    float var136 = -20.0F * var0x;
                                    float var137 = var136 + 10.0F;
                                    double var138 = var137;
                                    double var139 = Math.pow(2.0, var138);
                                    float var140 = (float)var139;
                                    float var97 = var140 * var96;
                                    float var98 = var97 / 2.0F;
                                    Integer var75 = var2x;
                                    if (var75 != null) {
                                        var47 *= 1630341079;
                                        var47 ^= 1898739599;
                                        var47 ^= 1364716348;
                                        float var78 = var98 + 1.0F;
                                        var120 = var78;
                                        var47 *= 2135581467;
                                        var47 ^= -1624920459;
                                        var47 |= -1078694643;
                                        var47 ^= 3634099;
                                        break label98;
                                    }

                                    var47 |= 2044415360;
                                    var47 ^= 1836504127;
                                    var47 += -1733819153;
                                    var47 *= -476370607;
                                    var47 ^= 1891186414;
                                }
                            }
                        }
                    }

                    var2x = var47 + 1;
                    var2x = var47 * var2x;
                    var47 = var2x & 1;
                    if (var47 == 0) {
                        RuntimeException var57 = new RuntimeException();
                        throw var57;
                    }
                    break label99;
                }

                int var79 = var47 + 1;
                var79 = var47 * var79;
                var79 &= 1;
                if (var79 == 0) {
                    return var120;
                }
            }

            AssertionError var74 = new AssertionError();
            throw var74;
        };
        F = var32;
        Lv var33 = sT_2::z;
        a = var33;
        Lv var34 = var0x -> {
            int var1x = XP;
            var1x ^= -815877131;
            int var2x = (int)var0x;
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var2x += 3;
            var3x *= var2x;
            var2x = var3x & 7;
            if (var2x != 0) {
                var1x *= -1254487681;
                var1x |= 927663512;
                var1x ^= -1016367022;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var3x = var1x + 2;
                var2x *= var3x;
                var3x = var1x + 3;
                var2x *= var3x;
                var2x &= 7;
                if (var2x == 0) {
                    IllegalStateException var25x = new IllegalStateException();
                    throw var25x;
                }
            } else {
                Integer var14x = switch (var1x) {
                    case -1754685214 -> var1x ^ -1343210143;
                    default -> var1x ^ -132241717;
                    case -806560082 -> {
                        var1x *= 119046795;
                        var1x -= -594337792;
                        var1x -= -1357722110;
                        var1x >>>= 12;
                        yield var1x ^ 2131872128;
                    }
                };
                if (var14x != null) {
                    float var16x = 1.0F - var0x;
                    float var17x = z(var16x);
                    return 1.0F - var17x;
                }
            }

            AssertionError var15x = new AssertionError();
            throw var15x;
        };
        Ry = var34;
        Lv var35 = var0x -> {
            int var1x = XP;
            var1x ^= 891796340;
            int var2x = (int)var0x;
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var4x = var2x + 3;
            var3x *= var4x;
            var3x &= 7;
            if (var3x != 0) {
                var1x >>= 24;
                var1x += 868597538;
                var1x *= 1216034559;
                var1x >>= 8;
                var1x ^= 473574997;
            } else {
                label68: {
                    var1x += 1196831879;
                    var1x *= 2039399583;
                    var1x &= -174470467;
                    var1x <<= 5;
                    var1x ^= -1412872802;
                    Integer var61 = var1x;
                    label56:
                    if (var61 != null) {
                        float var87;
                        int var62 = (var87 = var0x - 0.5F) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
                        float var68;
                        if (var62 < 0) {
                            var1x ^= 1771575359;
                            var1x ^= -430223440;
                            float var63 = 2.0F * var0x;
                            var4x = var2x + 1;
                            var4x = var2x * var4x;
                            var4x &= 1;
                            if (var4x != 0) {
                                var1x -= 1878473792;
                                var1x &= -921200106;
                                var1x ^= -955854723;
                                var1x += 1197865372;
                                var1x ^= -303189843;
                                break label68;
                            }

                            var1x &= 1628992816;
                            var1x &= -1983820188;
                            var1x ^= 1582291074;
                            var1x ^= -122938130;
                            long var73 = var1x;
                            long var6x = var73 + 1L;
                            var6x = var73 * var6x;
                            long var74 = var6x & 1L;
                            long var88;
                            var4x = (var88 = var74 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                            if (var4x != 0) {
                                break label56;
                            }

                            float var64 = 1.0F - var63;
                            float var65 = z(var64);
                            float var66 = 1.0F - var65;
                            float var67 = var66 / 2.0F;
                            var68 = var67;
                            switch (var1x) {
                                case -1495038868:
                                    var1x -= -1454700255;
                                    var1x ^= -2007345842;
                                    var1x += -938858415;
                                    var1x *= -2104545347;
                                    var1x ^= 1630253335;
                                    break;
                                case 376202990:
                                    var1x ^= -749426673;
                                    break;
                                case 1926271049:
                                default:
                                    var1x ^= 408882640;
                            }
                        } else {
                            var1x += 1382171645;
                            var1x *= 778720923;
                            var1x ^= -356853588;
                            var1x ^= -1333588856;
                            Integer var76 = var1x;
                            if (var76 == null) {
                                break label56;
                            }

                            float var77 = 2.0F * var0x;
                            float var79 = z(--var77);
                            var79++;
                            float var81 = var79 / 2.0F;
                            int var5x = var2x + 1;
                            var5x = var2x * var5x;
                            int var86 = var2x + 2;
                            var5x *= var86;
                            var2x += 3;
                            var5x *= var2x;
                            var2x = var5x & 7;
                            if (var2x != 0) {
                                switch (var1x) {
                                    case 6149117:
                                        var1x &= 330645573;
                                        var1x *= -835539847;
                                        var1x += -1281933893;
                                        var1x >>= 2;
                                        var1x ^= -444091854;
                                        break label68;
                                    case 1270299536:
                                        var1x ^= -2146570239;
                                        break label68;
                                    case 2024955218:
                                    default:
                                        var1x ^= -171869320;
                                        break label68;
                                }
                            }

                            var1x += -1537885211;
                            var1x ^= -320253425;
                            var1x += 856068135;
                            var1x ^= -738139651;
                            var68 = var81;
                            var1x ^= -569619243;
                            var1x += 1090317718;
                            var1x ^= -620853573;
                        }

                        Integer var55 = var1x;
                        if (var55 != null) {
                            return var68;
                        }
                    }

                    IllegalStateException var56 = new IllegalStateException();
                    throw var56;
                }
            }

            UnsupportedOperationException var52 = new UnsupportedOperationException();
            throw var52;
        };
        ki = var35;
        Lv var36 = C(0.2F, 0.0F, 0.0F, 1.0F);
        c = var36;
        Lv var37 = C(0.05F, 0.7F, 0.1F, 1.0F);
        os = var37;
        Lv var38 = C(0.3F, 0.0F, 0.8F, 0.15F);
        jP = var38;
        Lv var39 = C(0.25F, 0.1F, 0.25F, 1.0F);
        oC = var39;
    }
}
