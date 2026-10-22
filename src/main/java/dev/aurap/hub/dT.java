package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class dT {
    public static final int Ph;

    private dT() {
    }

    public static String N(com.google.gson.JsonObject var0, String var1, String var2) {
        of_2.KM = -1337530627;
        of_2.sb = 1933037776;
        com.google.gson.JsonElement var6 = var0.get(var1);
        if (var6 == null || var6.isJsonNull()) {
            return var2;
        }
        try {
            return var6.getAsString();
        } catch (RuntimeException e) {
            return var2;
        }
    }
    public static long M(JsonObject var0, String var1) {
        boolean var110 = false;
        double var92 = 0.0;
        int var3 = Ph;
        var3 ^= -1417865166;
        Object var4 = null;
        JsonElement var5 = var0.get(var1);
        var5 = var5;
        var3 ^= 21256280;
        var3 &= -234270510;
        var3 ^= -1891112932;
        int var6 = of_2.KM;
        var3 ^= var6;
        var3 ^= -1337530627;
        var6 = of_2.sb;
        var3 ^= var6;
        var3 ^= 1933037776;
        long var95 = var3;
        long var8 = var95 + 1L;
        var8 = var95 * var8;
        long var96 = var8 & 1L;
        long var144;
        var6 = (var144 = var96 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
        label96:
        if (var6 == 0) {
            if (var5 != null) {
                var3 = switch (var3) {
                    case -1924667250 -> {
                        var3 += 1406633629;
                        var3 *= 1728471417;
                        yield var3 ^ 1399188951;
                    }
                    default -> var3 ^ 1168823466;
                    case 1970619975 -> var3 ^ 182939197;
                };
                var6 = var3 + 1;
                var6 = var3 * var6;
                int var7 = var3 + 2;
                var6 *= var7;
                var7 = var3 + 3;
                var6 *= var7;
                var6 &= 7;
                if (var6 != 0) {
                    break label96;
                }

                boolean var103 = var5.isJsonNull();
                var3 *= 2070473749;
                var3 += -1447214401;
                var3 >>= 2;
                var3 ^= 857913293;
                long var106 = var3;
                long var9 = var106 + 1L;
                var9 = var106 * var9;
                long var11 = var106 + 2L;
                var9 *= var11;
                long var107 = var106 + 3L;
                var9 *= var107;
                long var108 = var9 & 7L;
                long var145;
                var7 = (var145 = var108 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                if (var7 != 0) {
                    break label96;
                }

                if (!var103) {
                    var3 = switch (var3) {
                        case -1246921990 -> var3 ^ -1827605763;
                        default -> var3 ^ 2075758575;
                        case 626098921 -> {
                            var3 -= 1492938486;
                            var3 ^= 333500359;
                            var3 <<= 25;
                            var3 &= -1937783792;
                            yield var3 ^ 1248726458;
                        }
                    };

                    Throwable var2;
                    label133: {
                        try {
                            var3 |= -1400311254;
                            var3 += 2080428467;
                            var3 ^= 2047509588;
                        } catch (Throwable var15) {
                            var2 = var15;
                            int var46 = Ph;
                            int var47 = var46 ^ -1954736704;
                            var110 = var15 instanceof RuntimeException;
                            int var48 = var47 - 590101805;
                            int var49 = var48 - 1191789502;
                            int var50 = var49 - 371823369;
                            var3 = var50 ^ 683809320;
                            var8 = var3;
                            long var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var146;
                            int var122 = (var146 = var8 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                            if (var122 != 0) {
                                break label96;
                            }
                            break label133;
                        }

                        Integer var104 = var3;
                        if (var104 == null) {
                            break label96;
                        }

                        try {
                            var92 = var5.getAsDouble();
                        } catch (Throwable var14) {
                            var2 = var14;
                            int var55 = Ph;
                            int var56 = var55 ^ -1954736704;
                            var110 = var14 instanceof RuntimeException;
                            int var57 = var56 - 590101805;
                            int var58 = var57 - 1191789502;
                            int var59 = var58 - 371823369;
                            var3 = var59 ^ 683809320;
                            var8 = var3;
                            long var139 = var8 + 1L;
                            var139 = var8 * var139;
                            var8 = var139 & 1L;
                            long var147;
                            int var125 = (var147 = var8 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                            if (var125 != 0) {
                                break label96;
                            }
                            break label133;
                        }
                        var3 = switch (var3) {
                            case 283465017 -> {
                                var3 ^= -561828754;
                                var3 *= -798042447;
                                var3 *= -1785021077;
                                var3 -= -867692383;
                                yield var3 ^ -1740673900;
                            }
                            default -> var3 ^ 796756632;
                            case 1514358818 -> var3 ^ 994219100;
                        };
                        long var111 = var3;
                        var9 = var111 + 1L;
                        var9 = var111 * var9;
                        long var112 = var9 & 1L;
                        long var148;
                        var7 = (var148 = var112 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label96;
                        }

                        try {
                            long var93 = Math.round(var92);
                            var3 *= 280970899;
                            var3 ^= 1549011166;
                            return var93;
                        } catch (Throwable var13) {
                            var2 = var13;
                            int var65 = Ph;
                            int var66 = var65 ^ -1954736704;
                            var110 = var13 instanceof RuntimeException;
                            int var67 = var66 - 590101805;
                            int var68 = var67 - 1191789502;
                            int var69 = var68 - 371823369;
                            var3 = var69 ^ 683809320;
                            var8 = var3;
                            long var141 = var8 + 1L;
                            var141 = var8 * var141;
                            var8 = var141 & 1L;
                            long var149;
                            int var128 = (var149 = var8 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                            if (var128 != 0) {
                                break label96;
                            }
                        }
                    }

                    if (!var110) {
                        var3 += -40393853;
                        var3 *= 1417446917;
                        var3 ^= -1286318531;
                        var3 += 2147090461;
                        var3 ^= 911122967;
                        long var114 = var3;
                        var9 = var114 + 1L;
                        var9 = var114 * var9;
                        var11 = var114 + 2L;
                        var9 *= var11;
                        long var115 = var114 + 3L;
                        var9 *= var115;
                        long var116 = var9 & 7L;
                        long var150;
                        var7 = (var150 = var116 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var7 == 0) {
                            throw UncheckedExceptions.rethrow(var2);
                        }
                    } else {
                        var3 = switch (var3) {
                            case -2033715095 -> {
                                var3 ^= 180431325;
                                var3 += 624563566;
                                var3 <<= 2;
                                yield var3 ^ 2051505439;
                            }
                            default -> var3 ^ -1731739973;
                            case 121805869 -> var3 ^ 503172762;
                        };
                        Integer var118 = var3;
                        if (var118 != null) {
                            var4 = (RuntimeException)var2;
                            var3 ^= 1175266074;
                            var3 += 392490249;
                            var3 ^= -139599711;
                            Integer var16 = var3;
                            if (var16 != null) {
                                return 0L;
                            }
                        }
                    }
                    break label96;
                }

                switch (var3) {
                    case -377376212:
                        var3 ^= -639521169;
                        break;
                    case -176171252:
                    default:
                        var3 ^= -564075122;
                        break;
                    case 626098921:
                        var3 |= -791434132;
                        var3 >>= 2;
                        var3 ^= 1586839755;
                }
            } else {
                switch (var3) {
                    case -1924667250:
                        var3 &= -995554929;
                        var3 ^= -137321042;
                        var3 |= -1198379797;
                        var3 ^= -268949288;
                        var3 ^= -1211486653;
                        break;
                    case -1109698608:
                    default:
                        var3 ^= -24503605;
                        break;
                    case 493503893:
                        var3 ^= 1940337731;
                }
            }

            int var17 = var3 + 1;
            var17 = var3 * var17;
            int var90 = var3 + 2;
            var17 *= var90;
            var3 += 3;
            var17 *= var3;
            var17 &= 7;
            if (var17 == 0) {
                return 0L;
            }
        }

        IllegalStateException var22 = new IllegalStateException();
        throw var22;
    }

    public static double Ka(JsonObject var0, String var1) {
        double var128 = 0.0;
        double var129 = 0.0;
        boolean var142 = false;
        boolean var147 = false;
        int var3 = Ph;
        var3 ^= 423885356;
        Object var4 = null;
        JsonElement var5 = var0.get(var1);
        var5 = var5;

        var3 = switch (var3) {
            case -1134945831 -> {
                var3 >>= 6;
                var3 *= -1796360795;
                var3 >>>= 23;
                var3 *= 975628549;
                yield var3 ^ 170199020;
            }
            case 1485363306 -> var3 ^ 2073356008;
            default -> var3 ^ -848239634;
        };
        int var6 = var3 + 1;
        var6 = var3 * var6;
        int var7 = var3 + 2;
        var6 *= var7;
        var7 = var3 + 3;
        var6 *= var7;
        var6 &= 7;
        label159:
        if (var6 == 0) {
            if (var5 != null) {
                var3 ^= 1507534558;
                var3 &= -411121903;
                var3 += 1207852097;
                var3 ^= -58783613;
                var3 ^= -860654272;
                var6 = var3 + 1;
                var6 = var3 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    break label159;
                }

                boolean var137 = var5.isJsonNull();
                var3 ^= 138315091;
                var3 &= 573797853;
                var3 -= -728271894;
                var3 ^= -1877743373;
                Integer var141 = var3;
                if (var141 == null) {
                    break label159;
                }

                if (!var137) {
                    var3 |= 230114128;
                    var3 ^= 242692784;
                    Integer var138 = var3;
                    if (var138 != null) {
                        var3 = switch (var3) {
                            case -1609252027 -> var3 ^ -1766288795;
                            case -1278711355 -> {
                                var3 ^= -1140749748;
                                var3 <<= 10;
                                yield var3 ^ 2075683440;
                            }
                            default -> var3 ^ 1081300775;
                        };
                        Integer var139 = var3;
                        if (var139 != null) {
                            label177: {
                                Throwable var2;
                                label178: {
                                    try {
                                        double var127 = var5.getAsDouble();
                                        var3 += 1007986029;
                                        var3 += -1406090147;
                                        var3 <<= 8;
                                        var3 += -819231357;
                                        var3 ^= -198803732;
                                        var128 = var127;
                                        var3 += -1837744709;
                                        var3 ^= 526210548;
                                    } catch (Throwable var15) {
                                        var2 = var15;
                                        int var56 = Ph;
                                        int var57 = var56 ^ 860072888;
                                        var142 = var15 instanceof RuntimeException;
                                        int var58 = var57 - 2027838537;
                                        int var59 = var58 & 1902006101;
                                        int var60 = var59 + 2027919174;
                                        int var61 = var60 & 1767724446;
                                        var3 = var61 ^ -619087387;
                                        int var8 = var3 + 1;
                                        var8 = var3 * var8;
                                        int var9 = var3 + 2;
                                        var8 *= var9;
                                        var9 = var3 + 3;
                                        var8 *= var9;
                                        var8 &= 7;
                                        if (var8 != 0) {
                                            break label159;
                                        }
                                        break label178;
                                    }

                                    long var143 = var3;
                                    long var185 = var143 + 1L;
                                    var185 = var143 * var185;
                                    long var11 = var143 + 2L;
                                    var185 *= var11;
                                    long var144 = var143 + 3L;
                                    var185 *= var144;
                                    long var145 = var185 & 7L;
                                    long var197;
                                    int var146 = (var197 = var145 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                    if (var146 != 0) {
                                        break label159;
                                    }

                                    try {
                                        var147 = Double.isFinite(var128);
                                        var3 ^= -1161055560;
                                        var3 ^= -145614264;
                                    } catch (Throwable var14) {
                                        var2 = var14;
                                        int var70 = Ph;
                                        int var71 = var70 ^ 860072888;
                                        var142 = var14 instanceof RuntimeException;
                                        int var72 = var71 - 2027838537;
                                        int var73 = var72 & 1902006101;
                                        int var74 = var73 + 2027919174;
                                        int var75 = var74 & 1767724446;
                                        var3 = var75 ^ -619087387;
                                        int var166 = var3 + 1;
                                        var166 = var3 * var166;
                                        int var189 = var3 + 2;
                                        var166 *= var189;
                                        int var190 = var3 + 3;
                                        var166 *= var190;
                                        var166 &= 7;
                                        if (var166 != 0) {
                                            break label159;
                                        }
                                        break label178;
                                    }

                                    Integer var171 = var3;
                                    if (var171 == null) {
                                        break label159;
                                    }

                                    label166: {
                                        try {
                                            if (var147) {
                                                break label166;
                                            }
                                        } catch (Throwable var16) {
                                            var2 = var16;
                                            int var78 = Ph;
                                            int var79 = var78 ^ 860072888;
                                            var142 = var16 instanceof RuntimeException;
                                            int var80 = var79 - 2027838537;
                                            int var81 = var80 & 1902006101;
                                            int var82 = var81 + 2027919174;
                                            int var83 = var82 & 1767724446;
                                            var3 = var83 ^ -619087387;
                                            int var172 = var3 + 1;
                                            var172 = var3 * var172;
                                            int var191 = var3 + 2;
                                            var172 *= var191;
                                            int var192 = var3 + 3;
                                            var172 *= var192;
                                            var172 &= 7;
                                            if (var172 != 0) {
                                                break label159;
                                            }
                                            break label178;
                                        }

                                        var3 ^= -1010621060;
                                        var3 += 1856471341;
                                        var3 ^= 1471237415;
                                        var3 ^= 1951186893;
                                        long var148 = var3;
                                        var185 = var148 + 1L;
                                        var185 = var148 * var185;
                                        long var149 = var185 & 1L;
                                        long var198;
                                        var146 = (var198 = var149 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                                        if (var146 != 0) {
                                            break label159;
                                        }

                                        try {
                                            var3 *= -117851877;
                                            var3 ^= 2108150668;
                                            var3 ^= -2058540561;
                                            var3 ^= 846616142;
                                            var3 ^= -1359362749;
                                        } catch (Throwable var13) {
                                            var2 = var13;
                                            int var88 = Ph;
                                            int var89 = var88 ^ 860072888;
                                            var142 = var13 instanceof RuntimeException;
                                            int var90 = var89 - 2027838537;
                                            int var91 = var90 & 1902006101;
                                            int var92 = var91 + 2027919174;
                                            int var93 = var92 & 1767724446;
                                            var3 = var93 ^ -619087387;
                                            int var177 = var3 + 1;
                                            var177 = var3 * var177;
                                            int var195 = var3 + 2;
                                            var177 *= var195;
                                            int var196 = var3 + 3;
                                            var177 *= var196;
                                            var177 &= 7;
                                            if (var177 != 0) {
                                                break label159;
                                            }
                                            break label178;
                                        }

                                        int var20 = var3 + 1;
                                        int var21 = var3 * var20;
                                        int var22 = var21 & 1;
                                        if (var22 != 0) {
                                            break label159;
                                        }

                                        var129 = 0.0;
                                        var3 >>= 12;
                                        var3 &= 1538096461;
                                        var3 ^= 1230684987;
                                        break label177;
                                    }

                                    var3 += -1202245302;
                                    var3 *= -1864662643;
                                    var3 ^= -1576194767;
                                    var146 = var3 + 1;
                                    var146 = var3 * var146;
                                    int var182 = var3 + 2;
                                    var146 *= var182;
                                    var182 = var3 + 3;
                                    var146 *= var182;
                                    var146 &= 7;
                                    if (var146 != 0) {
                                        break label159;
                                    }
                                    var3 = switch (var3) {
                                        default -> var3 ^ -2083214550;
                                        case 287112233 -> {
                                            var3 += -1349320267;
                                            var3 += 813273906;
                                            yield var3 ^ 2058688429;
                                        }
                                        case 1561452344 -> var3 ^ -321515294;
                                    };
                                    var146 = var3 + 1;
                                    var146 = var3 * var146;
                                    var146 &= 1;
                                    if (var146 != 0) {
                                        break label159;
                                    }

                                    var129 = var128;
                                    switch (var3) {
                                        case -1952676163:
                                            var3 *= -318710773;
                                            var3 &= 1764802114;
                                            var3 ^= 2062743612;
                                            break label177;
                                        case -1545231651:
                                            var3 ^= 432095302;
                                            break label177;
                                        case -473414258:
                                        default:
                                            var3 ^= 208090795;
                                            break label177;
                                    }
                                }

                                if (!var142) {
                                    var3 += -386807375;
                                    var3 -= -984854598;
                                    var3 ^= -708757234;
                                    throw UncheckedExceptions.rethrow(var2);
                                }
                                var3 = switch (var3) {
                                    default -> var3 ^ -209897878;
                                    case -754960145 -> {
                                        var3 -= -1460149650;
                                        yield var3 ^ 1267204443;
                                    }
                                    case 1538387864 -> var3 ^ -321224205;
                                };
                                int var151 = var3 + 1;
                                var151 = var3 * var151;
                                var151 &= 1;
                                if (var151 == 0) {
                                    var4 = (RuntimeException)var2;
                                    var3 <<= 20;
                                    var3 ^= -1087132142;
                                    int var17 = var3 + 1;
                                    int var18 = var3 * var17;
                                    int var19 = var18 & 1;
                                    if (var19 == 0) {
                                        return 0.0;
                                    }
                                }
                                break label159;
                            }

                            int var23 = var3 + 1;
                            var23 = var3 * var23;
                            int var123 = var3 + 2;
                            var23 *= var123;
                            int var124 = var3 + 3;
                            var23 *= var124;
                            var23 &= 7;
                            if (var23 == 0) {
                                return var129;
                            }
                        }
                    }
                    break label159;
                }

                switch (var3) {
                    case -1113974747:
                        var3 ^= 1018739018;
                        var3 ^= -1552757044;
                        break;
                    case 749370910:
                    default:
                        var3 ^= -2123643698;
                        break;
                    case 1826657701:
                        var3 ^= 1562547699;
                }
            } else {
                var3 <<= 24;
                var3 ^= -920796856;
                var3 >>= 9;
                var3 ^= 400063487;
                var3 ^= 899357372;
            }

            int var28 = var3 + 1;
            var28 = var3 * var28;
            int var125 = var3 + 2;
            var28 *= var125;
            var3 += 3;
            var28 *= var3;
            var28 &= 7;
            if (var28 == 0) {
                return 0.0;
            }
        }

        UnsupportedOperationException var33 = new UnsupportedOperationException();
        throw var33;
    }

    public static boolean F(JsonObject var0, String var1, boolean var2) {
        boolean var70 = false;
        int var4 = Ph;
        var4 ^= -979552407;
        Object var5 = null;
        JsonElement var6 = var0.get(var1);

        var4 = switch (var4) {
            default -> var4 ^ -1087016881;
            case 1619317916 -> {
                var4 ^= 548920795;
                var4 *= 1083616821;
                var4 += 402961010;
                yield var4 ^ 2062255932;
            }
            case 2140906370 -> var4 ^ 1650374876;
        };
        Integer var7 = var4;
        label89:
        if (var7 != null) {
            var6 = var6;
            if (var6 != null) {
                var4 &= 139403331;
                var4 ^= 1680228355;
                var4 ^= -1430034679;
                var7 = var4;
                if (var7 == null) {
                    break label89;
                }

                boolean var72 = var6.isJsonNull();
                var4 *= 914712619;
                var4 ^= 396900352;
                Integer var8 = var4;
                if (var8 == null) {
                    break label89;
                }

                if (!var72) {
                    var4 ^= 1391383486;
                    var4 |= -1402947886;
                    var4 ^= -1825588745;
                    long var73 = var4;
                    long var9 = var73 + 1L;
                    var9 = var73 * var9;
                    long var11 = var73 + 2L;
                    var9 *= var11;
                    long var74 = var73 + 3L;
                    var9 *= var74;
                    long var75 = var9 & 7L;
                    long var91;
                    int var76 = (var91 = var75 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                    if (var76 == 0) {
                        try {
                            var4 -= -322372961;
                            var4 += -1742804386;
                            var4 &= -2116614258;
                            var4 += -765142592;
                            var4 ^= -1815607957;
                            var70 = var6.getAsBoolean();
                            var4 |= -2123502787;
                            var4 >>= 16;
                            var4 ^= 521064869;
                        } catch (Throwable var13) {
                            var4 = Ph;
                            var4 ^= 1868596165;
                            int var77 = (var13 instanceof RuntimeException) ? 1 : 0;
                            var4 *= 701019761;
                            var4 ^= 1395254985;
                            var4 |= -2031952293;
                            var4 ^= 440110690;
                            var8 = var4;
                            if (var8 != null) {
                                if (var77 == 0) {
                                    switch (var4) {
                                        case -1262128743:
                                            var4 |= -663847405;
                                            var4 -= 1646827156;
                                            var4 |= -1484470946;
                                            var4 |= -1289314880;
                                            var4 ^= -573341699;
                                            break;
                                        case -873207059:
                                        default:
                                            var4 ^= -59361289;
                                            break;
                                        case -389732681:
                                            var4 ^= -791190518;
                                    }

                                    throw var13;
                                }
                                var4 = switch (var4) {
                                    case -1743472811 -> var4 ^ -1769400251;
                                    case -1262128743 -> {
                                        var4 >>>= 31;
                                        var4 += -1459628867;
                                        yield var4 ^ -351711447;
                                    }
                                    default -> var4 ^ 453053884;
                                };
                                long var78 = var4;
                                var9 = var78 + 1L;
                                var9 = var78 * var9;
                                var11 = var78 + 2L;
                                var9 *= var11;
                                long var79 = var78 + 3L;
                                var9 *= var79;
                                long var80 = var9 & 7L;
                                long var92;
                                var77 = (var92 = var80 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                                if (var77 == 0) {
                                    var5 = (RuntimeException)var13;
                                    switch (var4) {
                                        case 1140235159:
                                            var4 &= 1334336337;
                                            var4 >>>= 1;
                                            var4 <<= 27;
                                            var4 ^= -869313418;
                                            break;
                                        case 2050263252:
                                        default:
                                            var4 ^= 956505516;
                                            break;
                                        case 2106313127:
                                            var4 ^= -553588718;
                                    }

                                    return var2;
                                }
                            }
                            break label89;
                        }

                        Integer var3 = var4;
                        if (var3 != null) {
                            return var70;
                        }
                    }
                    break label89;
                }

                var4 &= 1305663797;
                var4 -= -593402921;
                var4 += 1773669877;
                var4 ^= 1046788436;
                var4 ^= 399069273;
            } else {
                switch (var4) {
                    case -1069872429:
                        var4 ^= 682023145;
                        break;
                    case 949380889:
                        var4 ^= 1608710924;
                        var4 += -1963463649;
                        var4 ^= 1323705110;
                        break;
                    case 1766686183:
                    default:
                        var4 ^= 230832042;
                }
            }

            return var2;
        }

        UnsupportedOperationException var14 = new UnsupportedOperationException();
        throw var14;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1828814268;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Ph = var4;
    }
}
