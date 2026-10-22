package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class vZ_2 {
    public static final int W = 6;
    private static final String r = "hud_style";
    private static final Map d;
    public static final int S;

    private vZ_2() {
    }

    public static boolean rk(JsonObject var0) {
        label177: {
            int var1 = S;
            var1 ^= -439769204;
            int var2 = System.identityHashCode(var0);
            JsonElement var3 = var0.get("schema");
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var190;
            int var124 = (var190 = var4 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
            int var5 = of_2.GI;
            var1 ^= var5;
            var1 ^= 970741366;
            of_2.GI = 970741366;
            var5 = of_2.t;
            var1 ^= var5;
            var1 ^= -1202142587;
            of_2.t = -1202142587;
            if (var124 != 0) {
                var1 |= -1467800303;
                var1 ^= 1691114765;
            } else {
                label179: {
                    var1 ^= -1718428697;
                    var1 &= 954268961;
                    var1 ^= 208027417;
                    if (var3 != null) {
                        var1 = switch (var1) {
                            case 342273592 -> {
                                var1 ^= 605802974;
                                var1 *= -1878780019;
                                var1 -= -732795871;
                                yield var1 ^ 467577014;
                            }
                            case 890327986 -> var1 ^ 319355270;
                            default -> var1 ^ -216419622;
                        };
                        boolean var125 = var3.isJsonPrimitive();
                        Integer var153 = var2;
                        if (var153 == null) {
                            switch (var1) {
                                case -1657010373:
                                    var1 &= 325237697;
                                    var1 ^= -1637665835;
                                    break label179;
                                case -946368276:
                                default:
                                    var1 ^= -1273605929;
                                    break label179;
                                case -795871873:
                                    var1 ^= 1809198467;
                                    break label179;
                            }
                        }

                        var1 &= 1517083862;
                        var1 |= -2032898051;
                        var1 |= 1377692941;
                        var1 ^= 1462244493;
                        var153 = var1;
                        if (var153 == null) {
                            break label177;
                        }

                        if (var125) {
                            var1 *= 631125465;
                            var1 ^= 424631245;
                            var4 = var1;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            long var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var191;
                            int var129 = (var191 = var4 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                            if (var129 != 0) {
                                break label177;
                            }

                            JsonPrimitive var130 = var3.getAsJsonPrimitive();
                            var153 = var2;
                            if (var153 == null) {
                                var1 -= -733286804;
                                var1 ^= -1887713065;
                                break label179;
                            }

                            var1 -= -4722638;
                            var1 ^= -916971604;
                            var153 = var1;
                            if (var153 == null) {
                                break label177;
                            }

                            boolean var131 = var130.isNumber();
                            if (var131) {
                                var1 += -2007113197;
                                var1 &= -33118438;
                                var1 *= -46316691;
                                var1 ^= -900014046;
                                Integer var132 = var1;
                                if (var132 == null) {
                                    break label177;
                                }

                                int var111 = var3.getAsInt();
                                var4 = var2;
                                var6 = var4 + 1L;
                                var6 = var4 * var6;
                                var8 = var4 + 2L;
                                var6 *= var8;
                                var4 += 3L;
                                var6 *= var4;
                                var4 = var6 & 7L;
                                long var192;
                                int var136 = (var192 = var4 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                                if (var136 != 0) {
                                    var1 |= -906402022;
                                    var1 += 620645071;
                                    var1 ^= -1682275619;
                                    break label179;
                                }
                                var1 = switch (var1) {
                                    case -405133534 -> {
                                        var1 ^= 1106664360;
                                        yield var1 ^ -1073810629;
                                    }
                                    default -> var1 ^ -1665519194;
                                    case 1240059609 -> var1 ^ -1408615472;
                                };
                                if (var111 >= 6) {
                                    var1 >>= 9;
                                    var1 &= 960687506;
                                    var1 ^= -2069101485;
                                    return false;
                                }

                                var1 += 1903042384;
                                var1 *= -903167657;
                                var1 ^= 78507244;
                                var1 *= 1515363111;
                                var1 ^= 402703555;
                            } else {
                                var1 &= -1381631590;
                                var1 ^= -1509965014;
                                var1 += 1518729994;
                                var1 ^= -837746885;
                                var1 ^= 604369217;
                            }
                        } else {
                            var1 -= 1200338536;
                            var1 &= -2013833249;
                            var1 |= -773113031;
                            var1 -= 98932985;
                            var1 ^= 655674876;
                        }
                    } else {
                        var1 += 1695938128;
                        var1 += -1256709018;
                        var1 ^= -947526832;
                    }

                    int var112 = var1 + 1;
                    int var113 = var1 * var112;
                    int var137 = var1 + 2;
                    int var114 = var113 * var137;
                    int var138 = var1 + 3;
                    int var115 = var114 * var138;
                    int var116 = var115 & 7;
                    if (var116 != 0) {
                        break label177;
                    }

                    int var117 = var1 * 863385693;
                    int var118 = var117 ^ 1378638202;
                    JsonObject var119 = i(var0, var118);
                    Integer var139 = var2;
                    label158:
                    if (var139 != null) {
                        var1 = switch (var1) {
                            case -384750658 -> {
                                var1 -= 1396210715;
                                var1 |= 876290457;
                                var1 ^= -1128937550;
                                var1 -= 584812429;
                                yield var1 ^ -1909192053;
                            }
                            case 1236220192 -> var1 ^ 1950906411;
                            default -> var1 ^ -1190683761;
                        };
                        Integer var140 = var1;
                        if (var140 == null) {
                            break label177;
                        }

                        if (var119 != null) {
                            var1 = switch (var1) {
                                default -> var1 ^ 788606614;
                                case 704414026 -> var1 ^ -569832388;
                                case 1749478135 -> {
                                    var1 += 1027540635;
                                    yield var1 ^ -1675817001;
                                }
                            };
                            boolean var141 = var119.has("theme");
                            var5 = var2 + 1;
                            var5 = var2 * var5;
                            int var173 = var2 + 2;
                            var5 *= var173;
                            int var174 = var2 + 3;
                            var5 *= var174;
                            var5 &= 7;
                            if (var5 != 0) {
                                var1 |= -1162222727;
                                var1 >>= 30;
                                var1 ^= 2024205191;
                                var1 |= 1753645219;
                                var1 ^= 1620878383;
                                break label158;
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ -1802391776;
                                case 734444884 -> var1 ^ 198932362;
                                case 966327877 -> {
                                    var1 &= 1399582086;
                                    yield var1 ^ -432314705;
                                }
                            };
                            Integer var162 = var1;
                            if (var162 == null) {
                                break label177;
                            }

                            if (!var141) {
                                var1 -= -892022659;
                                var1 ^= 647538741;
                                var4 = var1;
                                var6 = var4 + 1L;
                                var6 = var4 * var6;
                                var4 = var6 & 1L;
                                long var193;
                                int var144 = (var193 = var4 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                                if (var144 != 0) {
                                    break label177;
                                }

                                Map var145 = d;
                                Set var146 = var145.entrySet();
                                Stream var147 = var146.stream();
                                Predicate var163 = var1x -> {
                                    int var2x = S;
                                    var2x ^= 679360108;
                                    int var3x = System.identityHashCode(var119);
                                    Object var4x = ((Map.Entry)var1x).getKey();
                                    var4x = (String)var4x;
                                    var4x = var119.get((String)var4x);
                                    Integer var22x = var3x;
                                    if (var22x == null) {
                                        var2x &= 1822859314;
                                        var2x -= 1914978539;
                                        var2x ^= -25819651;
                                        var22x = var2x;
                                        if (var22x != null) {
                                            IllegalArgumentException var24x = new IllegalArgumentException();
                                            throw var24x;
                                        }
                                    } else {
                                        var2x = switch (var2x) {
                                            case 238606632 -> {
                                                var2x |= -753427726;
                                                var2x |= -651032354;
                                                yield var2x ^ -466499117;
                                            }
                                            default -> var2x ^ 129515117;
                                            case 1988360408 -> var2x ^ 2059539016;
                                        };
                                        long var5x = var2x;
                                        long var7 = var5x + 1L;
                                        var7 = var5x * var7;
                                        long var9 = var5x + 2L;
                                        var7 *= var9;
                                        var5x += 3L;
                                        var7 *= var5x;
                                        var5x = var7 & 7L;
                                        long var37x;
                                        int var25x = (var37x = var5x - 0L) == 0L ? 0 : (var37x < 0L ? -1 : 1);
                                        if (var25x == 0) {
                                            Object var27x = ((Map.Entry)var1x).getValue();
                                            Integer var28x = (Integer)var27x;
                                            int var29x = var28x;
                                            var2x += -1645645906;
                                            var2x += -955865629;
                                            var2x &= 1929688442;
                                            var2x ^= 1342671611;
                                            return jR((JsonElement)var4x, var29x, var2x);
                                        }
                                    }

                                    RuntimeException var26x = new RuntimeException();
                                    throw var26x;
                                };
                                var6 = var2;
                                long var186 = var6 + 1L;
                                var186 = var6 * var186;
                                var6 = var186 & 1L;
                                long var194;
                                int var179 = (var194 = var6 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                                if (var179 != 0) {
                                    var1 |= -540621402;
                                    var1 ^= -712309884;
                                    var1 ^= -2062621457;
                                    break label158;
                                }

                                var1 += 1429995750;
                                var1 += 591224493;
                                var1 ^= 1620818575;
                                var6 = var1;
                                var186 = var6 + 1L;
                                var186 = var6 * var186;
                                var6 = var186 & 1L;
                                long var195;
                                int var182 = (var195 = var6 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                                if (var182 != 0) {
                                    break label177;
                                }

                                boolean var148 = var147.anyMatch(var163);
                                if (var148) {
                                    var1 = switch (var1) {
                                        default -> var1 ^ 946789513;
                                        case -475739359 -> {
                                            var1 <<= 17;
                                            yield var1 ^ -1361021398;
                                        }
                                        case 785133677 -> var1 ^ -545395239;
                                    };
                                    Integer var149 = var1;
                                    if (var149 == null) {
                                        break label177;
                                    }

                                    var119.addProperty("theme", "CUSTOM");
                                    var1 *= -333355705;
                                    var1 &= -293736104;
                                    var1 |= -1231604555;
                                    var1 *= -1509752335;
                                    var1 ^= 1627796103;
                                } else {
                                    var1 <<= 4;
                                    var1 ^= 1120818700;
                                    var1 |= -11288599;
                                    var1 ^= -436254433;
                                }
                            } else {
                                switch (var1) {
                                    case -147617109:
                                        var1 |= 1402333418;
                                        var1 &= -358417442;
                                        var1 >>= 27;
                                        var1 *= 1482554389;
                                        var1 ^= -2069579442;
                                        break;
                                    case 1081369191:
                                    default:
                                        var1 ^= 1451078824;
                                        break;
                                    case 1395441580:
                                        var1 ^= 312749257;
                                }
                            }
                        } else {
                            var1 |= -705547303;
                            var1 &= 949196481;
                            var1 ^= -2073160278;
                            var1 ^= -1496305271;
                        }

                        Integer var120 = 6;
                        var4 = var2;
                        var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var196;
                        var2 = (var196 = var4 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            var1 |= 302161543;
                            var1 &= 1672582812;
                            var1 ^= -1697791033;
                            var1 ^= -1521460339;
                            var0.addProperty("schema", var120);
                            return true;
                        }

                        var1 &= -676354594;
                        var1 ^= -1653631978;
                    } else {
                        var1 |= -34582599;
                        var1 &= 163891376;
                        var1 &= 82044400;
                        var1 ^= -1887211420;
                    }
                }
            }

            long var105 = var1;
            long var121 = var105 + 1L;
            long var122 = var105 * var121;
            long var106 = var122 & 1L;
            long var197;
            var1 = (var197 = var106 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var108 = new RuntimeException();
                throw var108;
            }
        }

        IllegalStateException var109 = new IllegalStateException();
        throw var109;
    }

    private static JsonObject i(JsonObject var0, int var1) {
        label107: {
            int var47;
            JsonObject var96;
            label114: {
                int var3 = System.identityHashCode(var0);
                Integer var4 = var3;
                if (var4 == null) {
                    switch (var1) {
                        case -1090792350:
                            var47 = var1 ^ -2007325919;
                            break;
                        case -915887069:
                        default:
                            var47 = var1 ^ 1118141945;
                            break;
                        case 575548796:
                            var47 = var1 & -866662865;
                            var47 >>>= 4;
                            var47 ^= 2087063000;
                    }
                } else {
                    label113: {
                        var47 = var1 - 244996977;
                        var47 += -536185780;
                        var47 ^= 2031875116;
                        int var74 = var47 + 1;
                        var74 = var47 * var74;
                        var74 &= 1;
                        if (var74 != 0) {
                            break label107;
                        }

                        JsonElement var77 = var0.get("modules");
                        int var5 = var47 - -181723620;
                        int var86 = var5 | -1996279396;
                        int var87 = var86 & -843330622;
                        int var88 = var87 >> 2;
                        int var89 = var88 ^ -1919509593;
                        JsonObject var78 = ZD(var77, var89);
                        if (var78 == null) {
                            var47 &= -252485526;
                            var47 += -786824075;
                            var47 &= 422659221;
                            var47 -= 34250460;
                            var47 ^= -1351182751;
                            Integer var90 = var47;
                            if (var90 == null) {
                                break label107;
                            }

                            var96 = null;
                            var47 *= -1026596707;
                            var47 ^= 1929716852;
                            var47 ^= 1130881190;
                        } else {
                            var47 >>>= 29;
                            var47 |= 1555848570;
                            var47 ^= -183224312;
                            int var6 = var47 + 1;
                            var6 = var47 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                break label107;
                            }

                            JsonElement var79 = var78.get("hud_style");
                            Integer var104 = var3;
                            if (var104 == null) {
                                var47 |= 1558737742;
                                var47 |= 1236903781;
                                var47 |= -1852324001;
                                var47 &= -1322482597;
                                var47 ^= -850466367;
                                break label113;
                            }

                            var47 |= -362101453;
                            var47 += 1551890709;
                            var47 -= -965384684;
                            var47 ^= 983382327;
                            var47 ^= -78664474;
                            long var105 = var47;
                            long var8 = var105 + 1L;
                            var8 = var105 * var8;
                            long var10 = var105 + 2L;
                            var8 *= var10;
                            long var106 = var105 + 3L;
                            var8 *= var106;
                            long var107 = var8 & 7L;
                            long var134;
                            int var108 = (var134 = var107 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                            if (var108 != 0) {
                                break label107;
                            }

                            var108 = var47 << 6;
                            var108 |= -36270833;
                            var108 += -94355832;
                            var108 -= 333457412;
                            var108 ^= -1973912060;
                            JsonObject var80 = ZD(var79, var108);
                            var96 = var80;
                            var47 >>= 24;
                            var47 -= -593037872;
                            var47 >>>= 27;
                            var47 ^= -1193521234;
                        }

                        Integer var92 = var3;
                        if (var92 != null) {
                            var47 = switch (var47) {
                                case -1193521238 -> {
                                    var47 >>>= 27;
                                    var47 ^= -278499082;
                                    var47 *= 130473199;
                                    yield var47 ^ 1526653875;
                                }
                                default -> var47 ^ 1224210979;
                                case 2032478624 -> var47 ^ 918630609;
                            };
                            int var93 = var47 + 1;
                            int var94 = var47 * var93;
                            int var95 = var94 & 1;
                            if (var95 != 0) {
                                break label107;
                            }

                            if (var96 == null) {
                                var47 *= -167206071;
                                var47 ^= 659102359;
                                var47 &= -1495135918;
                                var47 |= -1282989026;
                                var47 ^= -1729774927;
                                int var97 = var47 + 1;
                                int var98 = var47 * var97;
                                int var122 = var47 + 2;
                                int var99 = var98 * var122;
                                var122 = var47 + 3;
                                int var100 = var99 * var122;
                                int var101 = var100 & 7;
                                if (var101 != 0) {
                                    break label107;
                                }

                                var96 = null;
                                var47 |= -730035145;
                                var47 |= 1452770782;
                                var47 -= 635247540;
                                var47 |= 764459931;
                                var47 ^= -1583033597;
                                break label114;
                            }

                            var47 <<= 14;
                            var47 ^= 1940461583;
                            long var114 = var47;
                            long var127 = var114 + 1L;
                            var127 = var114 * var127;
                            var114 = var127 & 1L;
                            long var135;
                            int var116 = (var135 = var114 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                break label107;
                            }

                            JsonElement var82 = var96.get("settings");
                            int var117 = var47 - 941736595;
                            int var118 = var117 ^ 1115434667;
                            JsonObject var83 = ZD(var82, var118);
                            var114 = var3;
                            var127 = var114 + 1L;
                            var127 = var114 * var127;
                            long var133 = var114 + 2L;
                            var127 *= var133;
                            var114 += 3L;
                            var127 *= var114;
                            var114 = var127 & 7L;
                            long var136;
                            var3 = (var136 = var114 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                var47 = switch (var47) {
                                    case -783039201 -> var47 ^ -1752182368;
                                    default -> var47 ^ -522817913;
                                    case 1690703887 -> {
                                        var47 += 1466444443;
                                        var47 |= 1796697962;
                                        var47 |= 341937886;
                                        yield var47 ^ -159490448;
                                    }
                                };
                                Integer var72 = var47;
                                if (var72 == null) {
                                    break label107;
                                }

                                var96 = var83;
                                switch (var47) {
                                    case 151105934:
                                        var47 *= 1441960177;
                                        var47 ^= 849504886;
                                        break label114;
                                    case 1707621576:
                                    default:
                                        var47 ^= 302916087;
                                        break label114;
                                    case 2019859471:
                                        var47 ^= -670465839;
                                        break label114;
                                }
                            }

                            var47 >>= 28;
                            var47 ^= 1809265604;
                            var47 <<= 28;
                            var47 ^= 1549954458;
                        } else {
                            var47 |= 338599716;
                            var47 |= -112175542;
                            var47 ^= -2120437132;
                        }
                    }
                }

                long var66 = var47;
                long var84 = var66 + 1L;
                long var85 = var66 * var84;
                long var67 = var85 & 1L;
                long var137;
                var47 = (var137 = var67 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                if (var47 == 0) {
                    AssertionError var70 = new AssertionError();
                    throw var70;
                }
                break label107;
            }

            Integer var73 = var47;
            if (var73 != null) {
                return var96;
            }
        }

        UnsupportedOperationException var69 = new UnsupportedOperationException();
        throw var69;
    }

    private static boolean jR(JsonElement var0, int var1, int var2) {
        String var135 = null;
        Object var137 = null;
        boolean var138 = false;
        boolean var150 = false;
        Object var6 = null;
        int var4 = var2 | -662369071;
        var4 &= 485771394;
        var4 <<= 18;
        var4 ^= 1706240301;
        long var7 = var1;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var202;
        int var127 = (var202 = var7 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
        label198:
        if (var127 == 0) {
            if (var0 != null) {
                var4 ^= 1356838565;
                var4 |= -490637360;
                var4 >>>= 8;
                var4 ^= 383012438;
                var7 = var1;
                var9 = var7 + 1L;
                var9 = var7 * var9;
                var7 = var9 & 1L;
                long var203;
                int var130 = (var203 = var7 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                if (var130 != 0) {
                    break label198;
                }

                boolean var131 = var0.isJsonPrimitive();

                var4 = switch (var4) {
                    default -> var4 ^ 2131317607;
                    case 371434409 -> {
                        var4 += 654100383;
                        var4 -= -881190141;
                        yield var4 ^ -874525524;
                    }
                    case 1159139679 -> var4 ^ 1818685644;
                };
                Integer var8 = var1;
                if (var8 == null) {
                    break label198;
                }

                if (var131) {
                    var4 += 1792624632;
                    var4 &= -288089803;
                    var4 ^= 1122829529;
                    var4 ^= -1096480399;
                    Integer var132 = var1;
                    if (var132 != null) {
                        JsonPrimitive var133 = var0.getAsJsonPrimitive();
                        JsonPrimitive var134 = var133;
                        boolean var141 = var133.isString();
                        var4 += -1507704107;
                        var4 += 666192210;
                        var4 ^= -390256157;
                        var9 = var1;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var204;
                        int var174 = (var204 = var9 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                        if (var174 == 0) {
                            if (!var141) {
                                var4 &= 1281081462;
                                var4 <<= 26;
                                var4 *= -1111778401;
                                var4 ^= -1445155997;
                                long var142 = var1;
                                long var10 = var142 + 1L;
                                var10 = var142 * var10;
                                long var12 = var142 + 2L;
                                var10 *= var12;
                                long var143 = var142 + 3L;
                                var10 *= var143;
                                long var144 = var10 & 7L;
                                long var205;
                                int var145 = (var205 = var144 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                                if (var145 == 0) {
                                    return false;
                                }
                            } else {
                                var4 |= 690107314;
                                var4 -= 1693533977;
                                var4 ^= -1774299096;
                                var4 ^= -1279138102;

                                var4 = switch (var4) {
                                    case -1354673640 -> var4 ^ -686304566;
                                    case 763286072 -> {
                                        var4 &= -449490305;
                                        var4 >>>= 24;
                                        yield var4 ^ -453845407;
                                    }
                                    default -> var4 ^ -336905194;
                                };
                                long var146 = var1;
                                long var183 = var146 + 1L;
                                var183 = var146 * var183;
                                long var199 = var146 + 2L;
                                var183 *= var199;
                                long var147 = var146 + 3L;
                                var183 *= var147;
                                long var148 = var183 & 7L;
                                long var206;
                                int var149 = (var206 = var148 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                                if (var149 == 0) {
                                    label181: {
                                        Throwable var3;
                                        int var5;
                                        label180: {
                                            label179: {
                                                label178: {
                                                    label211: {
                                                        try {
                                                            var135 = var134.getAsString();
                                                        } catch (Throwable var18) {
                                                            var3 = var18;
                                                            var5 = var1;
                                                            var4 = S;
                                                            var4 ^= -1161791431;
                                                            var150 = var18 instanceof IllegalArgumentException;
                                                            switch (var4) {
                                                                case -1668900995:
                                                                    break label178;
                                                                case 830116264:
                                                                default:
                                                                    break label179;
                                                                case 1793913364:
                                                                    break label211;
                                                            }
                                                        }
                                                        var4 = switch (var4) {
                                                            case -1642755167 -> var4 ^ 966680799;
                                                            case -453845436 -> {
                                                                var4 -= -1653927554;
                                                                var4 ^= -795046696;
                                                                yield var4 ^ 1560709283;
                                                            }
                                                            default -> var4 ^ -1285219005;
                                                        };
                                                        long var151 = var1;
                                                        var183 = var151 + 1L;
                                                        var183 = var151 * var183;
                                                        var199 = var151 + 2L;
                                                        var183 *= var199;
                                                        long var152 = var151 + 3L;
                                                        var183 *= var152;
                                                        long var153 = var183 & 7L;
                                                        long var207;
                                                        var149 = (var207 = var153 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                                                        if (var149 != 0) {
                                                            break label198;
                                                        }

                                                        try {
                                                            int var136 = DP.ue(var135);
                                                            var137 = var136 | 0xFF000000;
                                                            var4 -= 2060338841;
                                                            var4 |= 1517403487;
                                                            var4 >>>= 6;
                                                            var4 += -1246451683;
                                                            var4 ^= -1065736519;
                                                        } catch (Throwable var17) {
                                                            var3 = var17;
                                                            var5 = var1;
                                                            var4 = S;
                                                            var4 ^= -1161791431;
                                                            var150 = var17 instanceof IllegalArgumentException;
                                                            switch (var4) {
                                                                case -1668900995:
                                                                    break label178;
                                                                case 830116264:
                                                                default:
                                                                    break label179;
                                                                case 1793913364:
                                                                    break label211;
                                                            }
                                                        }

                                                        var149 = var1 + 1;
                                                        var149 = var1 * var149;
                                                        var149 &= 1;
                                                        if (var149 != 0) {
                                                            break label198;
                                                        }

                                                        label202: {
                                                            try {
                                                                if (var137 != null) {
                                                                    break label202;
                                                                }
                                                            } catch (Throwable var16) {
                                                                var3 = var16;
                                                                var5 = var1;
                                                                var4 = S;
                                                                var4 ^= -1161791431;
                                                                var150 = var16 instanceof IllegalArgumentException;
                                                                switch (var4) {
                                                                    case -1668900995:
                                                                        break label178;
                                                                    case 830116264:
                                                                    default:
                                                                        break label179;
                                                                    case 1793913364:
                                                                        break label211;
                                                                }
                                                            }

                                                            var4 -= -628523698;
                                                            var4 += 1721351395;
                                                            var4 ^= -381700439;
                                                            var149 = var1 + 1;
                                                            var149 = var1 * var149;
                                                            int var175 = var1 + 2;
                                                            var149 *= var175;
                                                            int var176 = var1 + 3;
                                                            var149 *= var176;
                                                            var149 &= 7;
                                                            if (var149 != 0) {
                                                                break label198;
                                                            }

                                                            try {
                                                                var4 &= 1105913192;
                                                                var4 &= 1043745789;
                                                                var4 |= 133425560;
                                                                var4 ^= 2024297589;
                                                            } catch (Throwable var15) {
                                                                var3 = var15;
                                                                var5 = var1;
                                                                var4 = S;
                                                                var4 ^= -1161791431;
                                                                var150 = var15 instanceof IllegalArgumentException;
                                                                switch (var4) {
                                                                    case -1668900995:
                                                                        break label178;
                                                                    case 830116264:
                                                                    default:
                                                                        break label179;
                                                                    case 1793913364:
                                                                        break label211;
                                                                }
                                                            }

                                                            int var19 = var1 + 1;
                                                            int var20 = var1 * var19;
                                                            int var21 = var20 & 1;
                                                            if (var21 != 0) {
                                                                break label198;
                                                            }

                                                            var138 = false;
                                                            switch (var4) {
                                                                case -1306939093:
                                                                default:
                                                                    var4 ^= 483327589;
                                                                    break label181;
                                                                case -381295391:
                                                                    var4 ^= 278001459;
                                                                    break label181;
                                                                case 2136718829:
                                                                    var4 |= -1752301816;
                                                                    var4 |= 430326481;
                                                                    var4 ^= 125259770;
                                                                    break label181;
                                                            }
                                                        }

                                                        var4 *= -688785059;
                                                        var4 |= 1499926909;
                                                        var4 |= -1484864815;
                                                        var4 |= 1084176594;
                                                        var4 ^= 1434013372;
                                                        Integer var139 = var1;
                                                        if (var139 == null) {
                                                            break label198;
                                                        }

                                                        try {
                                                            var4 |= 1385957184;
                                                            var4 -= 284415742;
                                                            var4 *= -2101425533;
                                                            var4 <<= 24;
                                                            var4 ^= -2056940353;
                                                        } catch (Throwable var14) {
                                                            var3 = var14;
                                                            var5 = var1;
                                                            var4 = S;
                                                            var4 ^= -1161791431;
                                                            var150 = var14 instanceof IllegalArgumentException;
                                                            switch (var4) {
                                                                case -1668900995:
                                                                    break label178;
                                                                case 830116264:
                                                                default:
                                                                    break label179;
                                                                case 1793913364:
                                                                    break label211;
                                                            }
                                                        }

                                                        Integer var140 = var1;
                                                        if (var140 == null) {
                                                            break label198;
                                                        }

                                                        var138 = true;
                                                        var4 ^= -1969671282;
                                                        var4 >>= 28;
                                                        var4 += 1476146013;
                                                        var4 += -1936339954;
                                                        var4 ^= 471420776;
                                                        break label181;
                                                    }

                                                    var4 ^= 1382259402;
                                                    break label180;
                                                }

                                                var4 |= -850352605;
                                                var4 ^= -1041839897;
                                                var4 -= 1852658051;
                                                var4 |= 785372546;
                                                var4 ^= 1031834885;
                                                break label180;
                                            }

                                            var4 ^= 1204437049;
                                        }

                                        var9 = var5;
                                        var11 = var9 + 1L;
                                        var11 = var9 * var11;
                                        var9 = var11 & 1L;
                                        long var208;
                                        int var179 = (var208 = var9 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                                        if (var179 == 0) {
                                            if (var150) {
                                                var4 = switch (var4) {
                                                    case -1840287086 -> {
                                                        var4 ^= -807364748;
                                                        var4 *= 1657231485;
                                                        var4 *= -763787763;
                                                        var4 |= -2009765746;
                                                        yield var4 ^ 508786974;
                                                    }
                                                    case -396924905 -> var4 ^ -374944865;
                                                    default -> var4 ^ 1486595109;
                                                };
                                                var6 = (IllegalArgumentException)var3;
                                                var4 ^= 446291610;
                                                var4 ^= 404558607;
                                                return false;
                                            }

                                            var4 <<= 28;
                                            var4 |= -1725306709;
                                            var4 >>= 8;
                                            var4 >>= 19;
                                            var4 ^= 995752637;
                                            long var163 = var5;
                                            var183 = var163 + 1L;
                                            var183 = var163 * var183;
                                            var199 = var163 + 2L;
                                            var183 *= var199;
                                            long var164 = var163 + 3L;
                                            var183 *= var164;
                                            long var165 = var183 & 7L;
                                            long var209;
                                            var149 = (var209 = var165 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                                            if (var149 == 0) {
                                                throw UncheckedExceptions.rethrow(var3);
                                            }
                                        }
                                        break label198;
                                    }

                                    int var22 = var1 + 1;
                                    var22 = var1 * var22;
                                    int var123 = var1 + 2;
                                    var22 *= var123;
                                    int var124 = var1 + 3;
                                    var22 *= var124;
                                    var22 &= 7;
                                    if (var22 == 0) {
                                        return var138;
                                    }
                                }
                            }
                        }
                    }
                    break label198;
                }

                var4 += -1618142433;
                var4 ^= 1976878201;
                var4 |= -66282759;
                var4 ^= 1406452922;
                var4 ^= 1538433989;
            } else {
                var4 |= -530614557;
                var4 ^= 273147497;
            }

            Integer var27 = var1;
            if (var27 != null) {
                return false;
            }
        }

        UnsupportedOperationException var28 = new UnsupportedOperationException();
        throw var28;
    }

    private static JsonObject ZD(JsonElement var0, int var1) {
        label74: {
            int var2;
            int var3 = System.identityHashCode(var0);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var85;
            int var59 = (var85 = var4 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
            label67:
            if (var59 == 0) {
                var2 = var1 - -548454358;
                var2 ^= -585333571;
                var2 >>>= 2;
                var2 *= 1197279281;
                var2 ^= 1354960902;
                int var60 = var2 + 1;
                int var61 = var2 * var60;
                int var5 = var2 + 2;
                int var62 = var61 * var5;
                var5 = var2 + 3;
                int var63 = var62 * var5;
                int var64 = var63 & 7;
                if (var64 != 0) {
                    break label74;
                }

                if (var0 != null) {
                    var2 >>>= 31;
                    var2 ^= -558162267;
                    boolean var65 = var0.isJsonObject();
                    Integer var73 = var3;
                    if (var73 == null) {
                        var2 |= 1331531431;
                        var2 += -2042684429;
                        var2 ^= -1816055426;
                        break label67;
                    }

                    var2 += 329942996;
                    var2 ^= 559342340;
                    long var74 = var2;
                    long var7 = var74 + 1L;
                    var7 = var74 * var7;
                    long var75 = var7 & 1L;
                    long var86;
                    int var76 = (var86 = var75 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var76 != 0) {
                        break label74;
                    }

                    if (var65) {
                        var2 |= 557184611;
                        var2 >>>= 4;
                        var2 >>>= 10;
                        var2 ^= -1092421378;
                        JsonObject var66 = var0.getAsJsonObject();
                        var76 = var3 + 1;
                        var76 = var3 * var76;
                        var3 = var76 & 1;
                        if (var3 == 0) {
                            var2 &= -1261848328;
                            var2 ^= -1740235451;
                            var2 ^= 529539776;
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var3 &= 1;
                            if (var3 != 0) {
                                break label74;
                            }

                            var2 -= -528411094;
                            var2 ^= -527068578;
                            return var66;
                        }

                        var2 &= 841945824;
                        var2 ^= -941712444;
                        break label67;
                    }

                    var2 -= -1519397137;
                    var2 >>>= 27;
                    var2 |= -719367353;
                    var2 ^= 1941044751;
                } else {
                    switch (var2) {
                        case -704619632:
                        default:
                            var2 ^= -473938895;
                            break;
                        case 678184927:
                            var2 ^= 2074879589;
                            break;
                        case 1168086146:
                            var2 |= 1300497596;
                            var2 >>= 13;
                            var2 += 665487649;
                            var2 ^= -2130551979;
                    }
                }

                var4 = var2;
                var6 = var4 + 1L;
                var6 = var4 * var6;
                long var8 = var4 + 2L;
                var6 *= var8;
                var4 += 3L;
                var6 *= var4;
                var4 = var6 & 7L;
                long var87;
                int var71 = (var87 = var4 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                if (var71 != 0) {
                    break label74;
                }

                Object var53 = null;
                var2 <<= 12;
                var2 ^= -240172699;
                var2 >>>= 7;
                var2 -= 980335474;
                var2 ^= 2009618229;
                return (JsonObject)var53;
            } else {
                switch (var1) {
                    case -643172440:
                        var2 = var1 ^ 1256910865;
                        break;
                    case 1859681239:
                        var2 = var1 & 293749857;
                        var2 ^= -2087673599;
                        var2 ^= 1995401892;
                        break;
                    case 2020375631:
                    default:
                        var2 = var1 ^ 828587679;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var67 = var2 + 2;
            var3 *= var67;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalArgumentException var39 = new IllegalArgumentException();
                throw var39;
            }
        }

        IllegalStateException var48 = new IllegalStateException();
        throw var48;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 947938934;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        S = var4;
        Integer var5 = -9546254;
        Integer var7 = -11559425;
        Map var6 = Map.of("accent", var5, "accent_2", var7);
        d = var6;
    }
}
