package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class jX {
    public float oO = -1.0F;
    public float RD = -1.0F;
    public float FM;
    public boolean tX = true;
    public Object Q;
    public Object dl;
    public static final int R;

    public jX() {
    }

    public boolean iL(eJ var1) {
        label72: {
            int var35;
            int var56;
            label76: {
                var35 = R;
                var35 ^= -765031791;
                var56 = System.identityHashCode(this);
                int var4 = var56 + 1;
                var4 = var56 * var4;
                int var5 = var56 + 2;
                var4 *= var5;
                var5 = var56 + 3;
                var4 *= var5;
                var4 &= 7;
                label69:
                if (var4 == 0) {
                    var35 &= -1874714225;
                    var35 ^= 1646097930;
                    var4 = var35 + 1;
                    var4 = var35 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        break label72;
                    }

                    if (var1 != null) {
                        var35 = switch (var35) {
                            case -920520635 -> var35 ^ 146492960;
                            case -228632818 -> {
                                var35 *= 1172439835;
                                var35 >>= 1;
                                var35 |= -1664496972;
                                var35 >>>= 30;
                                yield var35 ^ 848779101;
                            }
                            default -> var35 ^ 1852539853;
                        };
                        var4 = var35 + 1;
                        var4 = var35 * var4;
                        var5 = var35 + 2;
                        var4 *= var5;
                        var5 = var35 + 3;
                        var4 *= var5;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label72;
                        }

                        float var69 = this.oO;
                        double var70 = var69;
                        float var6 = this.RD;
                        double var83 = var6;
                        long var8 = var56;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        long var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var104;
                        var56 = (var104 = var8 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var56 != 0) {
                            var35 *= -2039353247;
                            var35 += -753373968;
                            var35 -= -263052587;
                            var35 *= -2117112739;
                            var35 ^= 543024981;
                            break label69;
                        }

                        var35 |= -563170019;
                        var35 ^= 1068863739;
                        var8 = var35;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var105;
                        var56 = (var105 = var8 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                        if (var56 != 0) {
                            break label72;
                        }

                        int var50 = (var1.contains(var70, var83)) ? 1 : 0;
                        if (var50 != 0) {
                            var35 ^= -1193967886;
                            var35 -= -2099087340;
                            var35 ^= -605630936;
                            var50 = var35 + 1;
                            var50 = var35 * var50;
                            var4 = var35 + 2;
                            var50 *= var4;
                            var4 = var35 + 3;
                            var50 *= var4;
                            var50 &= 7;
                            if (var50 != 0) {
                                break label72;
                            }

                            var56 = 1;
                            var35 *= -1578987905;
                            var35 += 2096520402;
                            var35 ^= 1872975924;
                            break label76;
                        }

                        switch (var35) {
                            case -1774748960:
                            default:
                                var35 ^= 326707817;
                                break;
                            case -1052088412:
                                var35 ^= 1767792136;
                                var35 ^= -933879150;
                                break;
                            case -603944443:
                                var35 ^= -751372592;
                        }
                    } else {
                        var35 >>= 22;
                        var35 -= -1814748080;
                        var35 ^= 80182362;
                        var35 &= 1817086670;
                        var35 ^= 135174460;
                    }

                    long var73 = var35;
                    long var84 = var73 + 1L;
                    var84 = var73 * var84;
                    long var95 = var73 + 2L;
                    var84 *= var95;
                    long var74 = var73 + 3L;
                    var84 *= var74;
                    long var75 = var84 & 7L;
                    long var106;
                    var4 = (var106 = var75 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label72;
                    }

                    var56 = 0;
                    var35 *= -602515025;
                    var35 ^= 610933566;
                    break label76;
                } else {
                    var35 >>= 5;
                    var35 += 525296187;
                    var35 -= -1870094641;
                    var35 ^= -2146811997;
                }

                Integer var40 = var35;
                if (var40 != null) {
                    IllegalArgumentException var41 = new IllegalArgumentException();
                    throw var41;
                }
                break label72;
            }

            long var77 = var35;
            long var88 = var77 + 1L;
            var88 = var77 * var88;
            var77 = var88 & 1L;
            long var107;
            int var79 = (var107 = var77 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
            if (var79 == 0) {
                return (var56 != 0);
            }
        }

        IllegalArgumentException var47 = new IllegalArgumentException();
        throw var47;
    }

    public boolean hQ(float var1, float var2, float var3, float var4) {
        boolean var85 = false;
        int var5 = R;
        var5 ^= -1049239852;
        int var6 = System.identityHashCode(this);
        float var7 = this.oO;
        int var8 = var6 + 1;
        var8 = var6 * var8;
        var8 &= 1;
        int var9 = of_2.i;
        var5 ^= var9;
        var5 ^= 563708667;
        var9 = of_2.kH;
        var5 ^= var9;
        var5 ^= 498993189;
        if (var8 != 0) {
            var5 -= 513576029;
            var5 ^= 2025237711;
        } else {
            label139: {
                label115: {
                    label121: {
                        var5 -= 1884462557;
                        var5 *= 2081323737;
                        var5 ^= 245924734;
                        float var136;
                        int var87 = (var136 = var7 - var1) == 0.0F ? 0 : (var136 < 0.0F ? -1 : 1);
                        if (var87 >= 0) {
                            var5 = switch (var5) {
                                case -990466374 -> {
                                    var5 |= 2075981348;
                                    var5 -= -294227552;
                                    yield var5 ^ -2023239441;
                                }
                                default -> var5 ^ 1824781070;
                                case 1730852299 -> var5 ^ 1263656075;
                            };
                            var7 = this.RD;
                            var8 = var6 + 1;
                            var8 = var6 * var8;
                            var9 = var6 + 2;
                            var8 *= var9;
                            var9 = var6 + 3;
                            var8 *= var9;
                            var8 &= 7;
                            if (var8 != 0) {
                                switch (var5) {
                                    case -1762697743:
                                        var5 >>= 8;
                                        var5 |= -121742185;
                                        var5 ^= 1322088948;
                                        break label139;
                                    case -1061164896:
                                    default:
                                        var5 ^= 1296033800;
                                        break label139;
                                    case 2069380232:
                                        var5 ^= -2053580160;
                                        break label139;
                                }
                            }
                            var5 = switch (var5) {
                                case -1762697743 -> {
                                    var5 ^= 2081353929;
                                    var5 <<= 25;
                                    yield var5 ^ -318265419;
                                }
                                default -> var5 ^ -22042047;
                                case 1056960312 -> var5 ^ 874259829;
                            };
                            Integer var107 = var5;
                            if (var107 == null) {
                                break label115;
                            }

                            float var137;
                            int var89 = (var137 = var7 - var2) == 0.0F ? 0 : (var137 < 0.0F ? -1 : 1);
                            if (var89 >= 0) {
                                var5 = switch (var5) {
                                    case -1660442699 -> {
                                        var5 <<= 3;
                                        var5 ^= -87094091;
                                        yield var5 ^ 105297883;
                                    }
                                    default -> var5 ^ 31481768;
                                    case 1798702892 -> var5 ^ -384739647;
                                };
                                long var90 = var5;
                                long var120 = var90 + 1L;
                                long var121 = var90 * var120;
                                long var91 = var121 & 1L;
                                long var138;
                                int var92 = (var138 = var91 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                                if (var92 != 0) {
                                    break label115;
                                }

                                var7 = this.oO;
                                float var108 = var1 + var3;
                                float var139;
                                int var94 = (var139 = var7 - var108) == 0.0F ? 0 : (var139 < 0.0F ? -1 : 1);
                                long var109 = var6;
                                long var10 = var109 + 1L;
                                var10 = var109 * var10;
                                long var110 = var10 & 1L;
                                long var140;
                                int var111 = (var140 = var110 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                                if (var111 != 0) {
                                    switch (var5) {
                                        case 347375302:
                                            var5 -= 1672680442;
                                            var5 |= -1894082602;
                                            var5 *= 867462203;
                                            var5 -= 1358980233;
                                            var5 ^= -1201085046;
                                            break label139;
                                        case 1554714770:
                                            var5 ^= -894112998;
                                            break label139;
                                        case 2126913091:
                                        default:
                                            var5 ^= 556943528;
                                            break label139;
                                    }
                                }

                                var5 += -1525648018;
                                var5 &= -434210643;
                                var5 ^= 1675291286;
                                if (var94 < 0) {
                                    var5 = switch (var5) {
                                        default -> var5 ^ -17757675;
                                        case -1008823630 -> {
                                            var5 *= -33757491;
                                            yield var5 ^ -1376180903;
                                        }
                                        case 1348863800 -> var5 ^ -1904324299;
                                    };
                                    var7 = this.RD;
                                    float var112 = var2 + var4;
                                    long var122 = var6;
                                    long var11 = var122 + 1L;
                                    var11 = var122 * var11;
                                    long var123 = var11 & 1L;
                                    long var141;
                                    var6 = (var141 = var123 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                                    if (var6 != 0) {
                                        var5 += -2110952576;
                                        var5 += 1170411945;
                                        var5 *= 531721023;
                                        var5 += -1186633952;
                                        var5 ^= -264356593;
                                        break label139;
                                    }

                                    var5 &= -959677231;
                                    var5 ^= 1382314070;
                                    long var124 = var5;
                                    var11 = var124 + 1L;
                                    var11 = var124 * var11;
                                    long var13 = var124 + 2L;
                                    var11 *= var13;
                                    long var125 = var124 + 3L;
                                    var11 *= var125;
                                    long var126 = var11 & 7L;
                                    long var142;
                                    var6 = (var142 = var126 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                                    if (var6 != 0) {
                                        break label115;
                                    }

                                    float var143;
                                    var6 = (var143 = var7 - var112) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
                                    if (var6 < 0) {
                                        var5 -= 899953640;
                                        var5 ^= 990504999;
                                        long var81 = var5;
                                        long var113 = var81 + 1L;
                                        long var114 = var81 * var113;
                                        var10 = var81 + 2L;
                                        long var115 = var114 * var10;
                                        long var82 = var81 + 3L;
                                        long var116 = var115 * var82;
                                        long var83 = var116 & 7L;
                                        long var144;
                                        var6 = (var144 = var83 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                                        if (var6 != 0) {
                                            break label115;
                                        }

                                        var85 = true;
                                        var5 += -400314596;
                                        var5 ^= -1414613798;
                                        break label121;
                                    }

                                    var5 ^= 1634620566;
                                    var5 &= 830283929;
                                    var5 >>>= 16;
                                    var5 ^= 103653117;
                                } else {
                                    var5 &= -2034895756;
                                    var5 ^= -238036589;
                                    var5 ^= 1970726418;
                                }
                            } else {
                                var5 &= 316923930;
                                var5 |= 1675688102;
                                var5 ^= -1995262192;
                                var5 ^= -52633577;
                            }
                        } else {
                            var5 >>>= 11;
                            var5 ^= 845296518;
                            var5 ^= 878117602;
                        }

                        long var96 = var5;
                        long var127 = var96 + 1L;
                        long var128 = var96 * var127;
                        long var97 = var128 & 1L;
                        long var145;
                        int var98 = (var145 = var97 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                        if (var98 != 0) {
                            break label115;
                        }

                        var85 = false;
                        switch (var5) {
                            case -1766645918:
                            default:
                                var5 ^= 491799382;
                                break;
                            case -1609883435:
                                var5 ^= 329662307;
                                break;
                            case 103657393:
                                var5 &= 139299677;
                                var5 *= -885744387;
                                var5 -= 1917591444;
                                var5 *= -1400633177;
                                var5 ^= 1301632545;
                        }
                    }

                    Integer var99 = var5;
                    if (var99 != null) {
                        return var85;
                    }
                }

                UnsupportedOperationException var86 = new UnsupportedOperationException();
                throw var86;
            }
        }

        IllegalArgumentException var77 = new IllegalArgumentException();
        throw var77;
    }

    public void Ht(String var1) {
        int var2 = R;
        var2 ^= 929873100;
        int var3 = System.identityHashCode(this);
        long var23 = var3;
        long var5 = var23 + 1L;
        var5 = var23 * var5;
        long var7 = var23 + 2L;
        var5 *= var7;
        long var24 = var23 + 3L;
        var5 *= var24;
        long var25 = var5 & 7L;
        long var41;
        var3 = (var41 = var25 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        int var4 = of_2.i;
        var2 ^= var4;
        var2 ^= 563708667;
        of_2.i = 563708667;
        var4 = of_2.kH;
        var2 ^= var4;
        var2 ^= 498993189;
        of_2.kH = 498993189;
        if (var3 != 0) {
            long var27 = switch (var2) {
                case -1057691724 -> var2 ^ -128858811;
                default -> var2 ^ -1372547712;
                case 511235417 -> {
                    var2 &= -1994310829;
                    var2 *= -1114150633;
                    yield var2 ^ 1866850393;
                }
            };
            var5 = var27 + 1L;
            var5 = var27 * var5;
            var7 = var27 + 2L;
            var5 *= var7;
            long var28 = var27 + 3L;
            var5 *= var28;
            long var29 = var5 & 7L;
            long var42;
            var3 = (var42 = var29 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var3 == 0) {
                AssertionError var31 = new AssertionError();
                throw var31;
            }
        } else {
            var2 -= 858943165;
            var2 &= -585705608;
            var2 ^= 944845399;
            Integer var20 = var2;
            if (var20 != null) {
                Ud var22 = Ud.Z();
                var22.P(var1);
                return;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 160245670;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        R = var4;
    }
}
