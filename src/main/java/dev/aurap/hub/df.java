package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class df {
    public static final float AK = 3.2F;
    public static final float Lf = 1.35F;
    public static final int Dq;

    private df() {
    }

    public static float xM(float var0, float var1, float var2) {
        int var3 = Dq;
        var3 ^= -2098398849;
        int var4 = (int)var0;
        float var5 = var0 - var1;
        var5 /= var2;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var41;
        var4 = (var41 = var6 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        int var34 = of_2.qG;
        var3 ^= var34;
        var3 ^= 1220043223;
        of_2.qG = 1220043223;
        int var35 = of_2.z;
        var3 ^= var35;
        var3 ^= 2054334215;
        of_2.z = 2054334215;
        if (var4 != 0) {
            var3 = switch (var3) {
                case -2121828467 -> var3 ^ -479965243;
                case -1381737912 -> {
                    var3 &= 512897293;
                    var3 <<= 30;
                    yield var3 ^ -712401841;
                }
                default -> var3 ^ -1336782632;
            };
            var4 = var3 + 1;
            var4 = var3 * var4;
            int var36 = var3 + 2;
            var4 *= var36;
            int var37 = var3 + 3;
            var4 *= var37;
            var4 &= 7;
            if (var4 == 0) {
                UnsupportedOperationException var31 = new UnsupportedOperationException();
                throw var31;
            }
        } else {
            long var21 = switch (var3) {
                case -1381737912 -> {
                    var3 ^= -748284115;
                    var3 ^= 1888550593;
                    yield var3 ^ -1874789008;
                }
                case -291968463 -> var3 ^ 450633251;
                default -> var3 ^ -2063964940;
            };
            var6 = var21 + 1L;
            var6 = var21 * var6;
            long var22 = var6 & 1L;
            long var42;
            var3 = (var42 = var22 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var3 == 0) {
                return TP.S(var5);
            }
        }

        RuntimeException var24 = new RuntimeException();
        throw var24;
    }

    public static float B(float var0) {
        int var1 = Dq;
        var1 ^= 1725683139;
        int var2 = (int)var0;
        float var3 = var0 * var0;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var38;
        var2 = (var38 = var4 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        int var35 = of_2.qG;
        var1 ^= var35;
        var1 ^= 1220043223;
        int var36 = of_2.z;
        var1 ^= var36;
        var1 ^= 2054334215;
        if (var2 == 0) {
            Integer var27 = switch (var1) {
                case -1915114429 -> var1 ^ -1828694404;
                default -> var1 ^ -2134232969;
                case 1234401012 -> {
                    var1 &= -16304081;
                    var1 <<= 23;
                    var1 ^= -279336960;
                    yield var1 ^ 1928031068;
                }
            };
            if (var27 != null) {
                float var28 = 2.0F * var0;
                float var29 = 3.0F - var28;
                return var3 * var29;
            }
        } else {
            var1 ^= -884745916;
            var1 ^= -694807143;
            var1 ^= 995917554;
            long var20 = var1;
            long var30 = var20 + 1L;
            long var31 = var20 * var30;
            long var5 = var20 + 2L;
            long var32 = var31 * var5;
            long var21 = var20 + 3L;
            long var33 = var32 * var21;
            long var22 = var33 & 7L;
            long var39;
            var1 = (var39 = var22 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        }

        AssertionError var24 = new AssertionError();
        throw var24;
    }

    public static float XH(float var0) {
        label141: {
            int var1 = Dq;
            var1 ^= -1832919495;
            int var2 = (int)var0;
            Integer var3 = var2;
            if (var3 != null) {
                var1 += -1677879884;
                var1 ^= 69437350;
                var3 = var1;
                if (var3 == null) {
                    break label141;
                }

                float var156;
                int var97 = (var156 = var0 - 0.5F) == 0.0F ? 0 : (var156 < 0.0F ? -1 : 1);
                if (var97 < 0) {
                    switch (var1) {
                        case -1700170792:
                            var1 ^= 474964928;
                            break;
                        case 1574344036:
                            var1 *= -1157191141;
                            var1 >>>= 24;
                            var1 ^= 62881999;
                            break;
                        case 1658587727:
                        default:
                            var1 ^= -529583079;
                    }

                    return 0.0F;
                }

                var1 >>>= 8;
                var1 |= -787916718;
                var1 |= 1306069076;
                var1 ^= -1692178893;
                float var157;
                var97 = (var157 = var0 - 1.05F) == 0.0F ? 0 : (var157 < 0.0F ? -1 : 1);
                int var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 == 0) {
                    var1 &= -371052392;
                    var1 ^= 1473323816;
                    var1 ^= -1390508708;
                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        break label141;
                    }

                    if (var97 < 0) {
                        var1 &= -1873843624;
                        var1 *= 381836671;
                        var1 += -524049691;
                        var1 ^= 1363983148;
                        var97 = var1 + 1;
                        var97 = var1 * var97;
                        var97 &= 1;
                        if (var97 != 0) {
                            break label141;
                        }

                        float var102 = xM(var0, 0.5F, 0.55F);
                        float var103 = B(var102);
                        long var125 = var2;
                        long var6 = var125 + 1L;
                        var6 = var125 * var6;
                        long var8 = var125 + 2L;
                        var6 *= var8;
                        long var126 = var125 + 3L;
                        var6 *= var126;
                        long var127 = var6 & 7L;
                        long var158;
                        var4 = (var158 = var127 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            switch (var1) {
                                case -522034247:
                                    var1 >>>= 8;
                                    var1 |= 2067554417;
                                    var1 += -1016158879;
                                    var1 ^= 359554250;
                                    var1 ^= 75995698;
                                    break;
                                case -429454969:
                                    var1 ^= 67484020;
                                    break;
                                case 659317285:
                                default:
                                    var1 ^= 626574121;
                            }

                            return 48.0F * var103;
                        }

                        var1 *= -271782297;
                        var1 <<= 3;
                        var1 ^= 18241152;
                    } else {
                        var1 &= -1601209284;
                        var1 *= -898173903;
                        var1 &= -1221900744;
                        var1 ^= 1535436943;
                        long var104 = var1;
                        long var5 = var104 + 1L;
                        var5 = var104 * var5;
                        long var7 = var104 + 2L;
                        var5 *= var7;
                        long var105 = var104 + 3L;
                        var5 *= var105;
                        long var106 = var5 & 7L;
                        long var159;
                        var97 = (var159 = var106 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                        if (var97 != 0) {
                            break label141;
                        }

                        float var160;
                        var97 = (var160 = var0 - 1.35F) == 0.0F ? 0 : (var160 < 0.0F ? -1 : 1);
                        Integer var129 = var2;
                        if (var129 != null) {
                            var1 ^= 407273883;
                            var1 -= -715553995;
                            var1 ^= 827842044;
                            if (var97 < 0) {
                                var1 *= -429815539;
                                var1 ^= -1521612830;
                                long var109 = var1;
                                var5 = var109 + 1L;
                                var5 = var109 * var5;
                                long var110 = var5 & 1L;
                                long var161;
                                var97 = (var161 = var110 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                                if (var97 != 0) {
                                    break label141;
                                }

                                float var112 = xM(var0, 1.05F, 0.3F);
                                float var130 = 138.0F * var112;
                                Integer var145 = var2;
                                if (var145 != null) {
                                    var1 |= 156519160;
                                    var1 ^= -2092059915;
                                    int var146 = var1 + 1;
                                    int var147 = var1 * var146;
                                    int var154 = var1 + 2;
                                    int var148 = var147 * var154;
                                    var154 = var1 + 3;
                                    int var149 = var148 * var154;
                                    int var150 = var149 & 7;
                                    if (var150 == 0) {
                                        float var113 = var130 * var112;
                                        return 48.0F - var113;
                                    }
                                    break label141;
                                }

                                switch (var1) {
                                    case -1777203179:
                                        var1 *= 638806801;
                                        var1 -= 1368119272;
                                        var1 += -1127056093;
                                        var1 -= -1599982843;
                                        var1 ^= 303071075;
                                        break;
                                    case -1639279819:
                                        var1 ^= 1128195160;
                                        break;
                                    case -955676632:
                                    default:
                                        var1 ^= -416664011;
                                }
                            } else {
                                var1 -= -1827672625;
                                var1 ^= -1939927747;
                                var1 ^= 1870520908;
                                float var162;
                                var97 = (var162 = var0 - 1.6F) == 0.0F ? 0 : (var162 < 0.0F ? -1 : 1);
                                var129 = var2;
                                if (var129 == null) {
                                    var1 <<= 2;
                                    var1 ^= 1376338845;
                                    var1 ^= 1651854947;
                                    var1 -= -989944882;
                                    var1 ^= 101038244;
                                } else {
                                    var1 = switch (var1) {
                                        case -85235403 -> {
                                            var1 &= -1517640743;
                                            var1 -= 594863613;
                                            var1 ^= 1650098490;
                                            yield var1 ^ -1971252375;
                                        }
                                        case 671087976 -> var1 ^ -161708148;
                                        default -> var1 ^ -891502470;
                                    };
                                    if (var97 < 0) {
                                        var1 &= -1948990141;
                                        var1 ^= -116415534;
                                        float var115 = xM(var0, 1.35F, 0.25F);
                                        float var116 = B(var115);
                                        int var132 = var2 + 1;
                                        var132 = var2 * var132;
                                        var132 &= 1;
                                        if (var132 == 0) {
                                            var1 ^= -192980885;
                                            var1 ^= 942323723;
                                            var132 = var1 + 1;
                                            var132 = var1 * var132;
                                            var132 &= 1;
                                            if (var132 == 0) {
                                                float var117 = 25.0F * var116;
                                                return -90.0F - var117;
                                            }
                                            break label141;
                                        }

                                        var1 -= 610829080;
                                        var1 += -1655907893;
                                        var1 ^= 1755581051;
                                        var1 ^= -1981952313;
                                    } else {
                                        var1 = switch (var1) {
                                            case -1781618361 -> {
                                                var1 ^= -1932594675;
                                                yield var1 ^ 132572804;
                                            }
                                            case -922586962 -> var1 ^ 422506408;
                                            default -> var1 ^ -984866407;
                                        };
                                        float var118 = xM(var0, 1.6F, 0.6F);
                                        float var119 = B(var118);
                                        Integer var89 = var2;
                                        if (var89 != null) {
                                            var1 -= -1143593666;
                                            var1 ^= -1225669094;
                                            var1 &= 1271190213;
                                            var1 ^= 1465858255;
                                            int var90 = var1 + 1;
                                            var90 = var1 * var90;
                                            int var138 = var1 + 2;
                                            var90 *= var138;
                                            var138 = var1 + 3;
                                            var90 *= var138;
                                            var90 &= 7;
                                            if (var90 == 0) {
                                                float var95 = 1.0F - var119;
                                                return -115.0F * var95;
                                            }
                                            break label141;
                                        }

                                        switch (var1) {
                                            case -2053052681:
                                                var1 ^= 285013826;
                                                break;
                                            case -1358502918:
                                            default:
                                                var1 ^= -1551737926;
                                                break;
                                            case 518438350:
                                                var1 += -717954477;
                                                var1 &= 1934124129;
                                                var1 |= -1977045647;
                                                var1 ^= -352448375;
                                        }
                                    }
                                }
                            }
                        } else {
                            var1 += -1864386496;
                            var1 &= -1840207119;
                            var1 ^= -2099864311;
                        }
                    }
                } else {
                    switch (var1) {
                        case 24160914:
                            var1 ^= 1049569523;
                            break;
                        case 477694779:
                        default:
                            var1 ^= 1362722981;
                            break;
                        case 1191098596:
                            var1 &= 1895074950;
                            var1 |= -1135003835;
                            var1 ^= -332725699;
                    }
                }
            } else {
                var1 += 1246490642;
                var1 ^= 412471512;
            }

            Integer var86 = var1;
            if (var86 != null) {
                IllegalStateException var88 = new IllegalStateException();
                throw var88;
            }
        }

        UnsupportedOperationException var87 = new UnsupportedOperationException();
        throw var87;
    }

    public static boolean L(float var0, float var1) {
        int var2 = Dq;
        var2 ^= -891687799;
        int var3 = (int)var0;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var4 &= 1;
        if (var4 != 0) {
            var2 |= 134691543;
            var2 &= 1116617363;
            var2 *= -1725684365;
            var2 ^= 777720570;
        } else {
            label67: {
                var2 += 370293060;
                var2 &= 551738378;
                var2 ^= -1080861154;
                var2 ^= -9761340;
                Integer var56 = var2;
                label48:
                if (var56 != null) {
                    float var63;
                    int var57 = (var63 = var0 - 1.35F) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
                    if (var57 < 0) {
                        var2 &= -171692500;
                        var2 -= -319330988;
                        var2 ^= 1750709309;
                        var2 += 541544914;
                        var2 ^= 2003940591;
                        float var64;
                        var57 = (var64 = var1 - 1.35F) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
                        int var5 = var3 + 1;
                        var5 = var3 * var5;
                        var3 = var5 & 1;
                        if (var3 != 0) {
                            var2 &= -1123294078;
                            var2 -= -442108841;
                            var2 -= -1702513029;
                            var2 ^= -538278819;
                            break label67;
                        }

                        var2 &= -88990321;
                        var2 += 1830666091;
                        var2 &= 609614978;
                        var2 -= 206177689;
                        var2 ^= 458473703;
                        if (var57 >= 0) {
                            var2 &= 774981982;
                            var2 |= 543379469;
                            var2 |= -1353339707;
                            var2 &= 586749447;
                            var2 ^= 309870034;
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var3 &= 1;
                            if (var3 != 0) {
                                break label48;
                            }

                            boolean var52 = true;
                            var2 &= -494870396;
                            var2 |= 341637061;
                            var2 ^= 1670259777;
                            return var52;
                        }

                        switch (var2) {
                            case -852687899:
                                var2 ^= 664852924;
                                break;
                            case 211290638:
                                var2 >>= 1;
                                var2 |= 1931755002;
                                var2 -= 1032081235;
                                var2 ^= -2123237368;
                                break;
                            case 328065082:
                            default:
                                var2 ^= -2115094946;
                        }
                    } else {
                        switch (var2) {
                            case -1798584329:
                                var2 ^= -2012653433;
                                break;
                            case -840296003:
                            default:
                                var2 ^= 1930766217;
                                break;
                            case 1616567256:
                                var2 += -777708592;
                                var2 ^= -1989549812;
                        }
                    }

                    var57 = var2 + 1;
                    var57 = var2 * var57;
                    var57 &= 1;
                    if (var57 == 0) {
                        boolean var65 = false;
                        var2 -= 2139089913;
                        var2 &= 755367984;
                        var2 ^= -1889590729;
                        var2 |= -1702400029;
                        var2 ^= -384975757;
                        return var65;
                    }
                }

                RuntimeException var53 = new RuntimeException();
                throw var53;
            }
        }

        IllegalArgumentException var47 = new IllegalArgumentException();
        throw var47;
    }

    public static float Kn(float var0) {
        int var1 = Dq;
        var1 ^= -364020449;
        int var2 = (int)var0;
        float var3 = xM(var0, 0.12F, 0.25F);
        var3 = B(var3);
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var42;
        var2 = (var42 = var4 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1148427311:
                default:
                    var1 ^= -1680437083;
                    break;
                case -989471192:
                    var1 += -561591901;
                    var1 -= 1826232805;
                    var1 ^= -898895177;
                    break;
                case -944563241:
                    var1 ^= -660611566;
            }

            UnsupportedOperationException var30 = new UnsupportedOperationException();
            throw var30;
        } else {
            var1 |= -769777084;
            var1 |= -24951125;
            var1 -= 609751348;
            var1 >>= 17;
            var1 ^= 76530991;
            long var16 = var1;
            var4 = var16 + 1L;
            var4 = var16 * var4;
            var6 = var16 + 2L;
            var4 *= var6;
            long var17 = var16 + 3L;
            var4 *= var17;
            long var18 = var4 & 7L;
            long var43;
            var1 = (var43 = var18 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var1 == 0) {
                float var21 = xM(var0, 1.9F, 0.6F);
                float var22 = B(var21);
                float var23 = 1.0F - var22;
                return var3 * var23;
            } else {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }
    }

    public static float Z(float var0) {
        int var1 = Dq;
        var1 ^= 1171102605;
        int var2 = (int)var0;
        float var3 = xM(var0, 0.0F, 0.22F);
        var3 = B(var3);
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var37;
        var2 = (var37 = var4 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 &= -1544548454;
            var1 >>= 14;
            var1 >>>= 6;
            var1 -= -1129776064;
            var1 ^= 367534779;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var38;
            var2 = (var38 = var4 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            long var18 = switch (var1) {
                case -1967736982 -> var1 ^ 1399512620;
                default -> var1 ^ 350783188;
                case 1787115706 -> {
                    var1 <<= 26;
                    var1 *= 1739187117;
                    var1 |= 1001057530;
                    yield var1 ^ 204047238;
                }
            };
            var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var39;
            var1 = (var39 = var19 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var1 == 0) {
                float var22 = xM(var0, 2.55F, 0.65F);
                float var23 = B(var22);
                float var24 = 1.0F - var23;
                return var3 * var24;
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1110152868;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Dq = var4;
    }
}
