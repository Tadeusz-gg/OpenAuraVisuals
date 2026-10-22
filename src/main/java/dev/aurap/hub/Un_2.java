package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import java.util.function.BiConsumer;

public final class Un_2 {
    public static final int lH = 3;
    private static final Map o;
    public static final int Eo;

    private Un_2() {
    }

    public static boolean O(JsonObject var0) {
        label158: {
            int var1 = Eo;
            var1 ^= 291523040;
            int var2 = System.identityHashCode(var0);
            JsonElement var3 = var0.get("schema");
            Integer var4 = var2;
            if (var4 == null) {
                var1 ^= 1592577596;
                var1 ^= 1412050369;
            } else {
                label160: {
                    var1 += -233785184;
                    var1 ^= 1685994942;
                    if (var3 != null) {
                        var1 = switch (var1) {
                            case -1400246102 -> var1 ^ 2000454956;
                            default -> var1 ^ -1781608102;
                            case 1102747580 -> {
                                var1 += 656775294;
                                yield var1 ^ 1715439076;
                            }
                        };
                        boolean var112 = var3.isJsonPrimitive();
                        long var5 = var2;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var184;
                        int var139 = (var184 = var5 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                        if (var139 != 0) {
                            var1 += -1991813752;
                            var1 -= -833873002;
                            var1 ^= -256901809;
                            break label160;
                        }

                        var1 -= -1358075269;
                        var1 -= -396421662;
                        var1 ^= 925026639;
                        Integer var140 = var1;
                        if (var140 == null) {
                            break label158;
                        }

                        if (var112) {
                            var1 += 1671544758;
                            var1 >>>= 24;
                            var1 >>= 2;
                            var1 ^= 427003044;
                            JsonPrimitive var113 = var3.getAsJsonPrimitive();
                            boolean var114 = var113.isNumber();
                            Integer var141 = var2;
                            if (var141 == null) {
                                var1 *= -1858071533;
                                var1 -= 1193691982;
                                var1 ^= 723321225;
                                break label160;
                            }
                            var1 = switch (var1) {
                                case -742331490 -> var1 ^ 904725444;
                                case 427003020 -> {
                                    var1 -= 1682080091;
                                    var1 *= 925861531;
                                    yield var1 ^ -526936168;
                                }
                                default -> var1 ^ 532988555;
                            };
                            int var142 = var1 + 1;
                            int var143 = var1 * var142;
                            int var144 = var143 & 1;
                            if (var144 != 0) {
                                break label158;
                            }

                            if (var114) {
                                var1 *= -871387443;
                                var1 -= -756140572;
                                var1 ^= -78297679;
                                long var115 = var1;
                                long var6 = var115 + 1L;
                                var6 = var115 * var6;
                                long var8 = var115 + 2L;
                                var6 *= var8;
                                long var116 = var115 + 3L;
                                var6 *= var116;
                                long var117 = var6 & 7L;
                                long var185;
                                int var118 = (var185 = var117 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                                if (var118 != 0) {
                                    break label158;
                                }

                                int var104 = var3.getAsInt();
                                long var119 = var2;
                                var6 = var119 + 1L;
                                var6 = var119 * var6;
                                var8 = var119 + 2L;
                                var6 *= var8;
                                long var120 = var119 + 3L;
                                var6 *= var120;
                                long var121 = var6 & 7L;
                                long var186;
                                var118 = (var186 = var121 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                                if (var118 != 0) {
                                    var1 *= -1807334763;
                                    var1 ^= 1817015029;
                                    break label160;
                                }

                                var1 |= 1701225868;
                                var1 ^= -1222904538;
                                Integer var123 = var1;
                                if (var123 == null) {
                                    break label158;
                                }

                                if (var104 >= 3) {
                                    var1 *= 177775037;
                                    var1 -= -2131735690;
                                    var1 *= 72136789;
                                    var1 ^= 2043834148;
                                    return false;
                                }

                                switch (var1) {
                                    case -443973815:
                                    default:
                                        var1 ^= -55827005;
                                        break;
                                    case 1400373374:
                                        var1 ^= -129441076;
                                        break;
                                    case 1484589800:
                                        var1 &= -2137361422;
                                        var1 |= 327817023;
                                        var1 ^= -1524079029;
                                }
                            } else {
                                var1 += -801009876;
                                var1 ^= 1408236523;
                            }
                        } else {
                            var1 *= 2120579423;
                            var1 -= 178108045;
                            var1 >>= 11;
                            var1 *= -275641323;
                            var1 ^= -1532610094;
                        }
                    } else {
                        switch (var1) {
                            case 1102747580:
                                var1 >>>= 5;
                                var1 >>>= 23;
                                var1 ^= -1229819472;
                                break;
                            case 1341991341:
                                var1 ^= 2038020455;
                                break;
                            case 1678757964:
                            default:
                                var1 ^= -1852123330;
                        }
                    }

                    long var105 = var1;
                    long var145 = var105 + 1L;
                    var145 = var105 * var145;
                    long var106 = var145 & 1L;
                    long var187;
                    int var107 = (var187 = var106 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                    if (var107 != 0) {
                        break label158;
                    }

                    var3 = var0.get("modules");
                    long var124 = var2;
                    long var168 = var124 + 1L;
                    var168 = var124 * var168;
                    long var182 = var124 + 2L;
                    var168 *= var182;
                    long var125 = var124 + 3L;
                    var168 *= var125;
                    long var126 = var168 & 7L;
                    long var188;
                    int var127 = (var188 = var126 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                    label140:
                    if (var127 == 0) {
                        var1 >>>= 18;
                        var1 *= -1628318365;
                        var1 *= 1886361721;
                        var1 >>>= 29;
                        var1 ^= -2081587475;
                        long var128 = var1;
                        var168 = var128 + 1L;
                        var168 = var128 * var168;
                        var182 = var128 + 2L;
                        var168 *= var182;
                        long var129 = var128 + 3L;
                        var168 *= var129;
                        long var130 = var168 & 7L;
                        long var189;
                        var127 = (var189 = var130 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                        if (var127 != 0) {
                            break label158;
                        }

                        if (var3 != null) {
                            var1 = switch (var1) {
                                case -2081587474 -> {
                                    var1 >>= 4;
                                    var1 &= 1533481069;
                                    var1 ^= 1390761609;
                                    yield var1 ^ -244189242;
                                }
                                default -> var1 ^ -1358193903;
                                case 1895115022 -> var1 ^ 1282779760;
                            };
                            boolean var132 = var3.isJsonObject();
                            int var147 = var2 + 1;
                            int var148 = var2 * var147;
                            int var149 = var148 & 1;
                            if (var149 != 0) {
                                var1 >>>= 30;
                                var1 ^= -1403911554;
                                var1 >>= 5;
                                var1 ^= -1005092212;
                                break label140;
                            }

                            var1 *= 971014129;
                            var1 ^= -200242073;
                            int var150 = var1 + 1;
                            int var151 = var1 * var150;
                            int var152 = var151 & 1;
                            if (var152 != 0) {
                                break label158;
                            }

                            if (var132) {
                                var1 >>>= 18;
                                var1 &= 321764268;
                                var1 ^= 413558761;
                                Map var133 = o;
                                final JsonElement modules = var3;
                                BiConsumer var109 = (var1x, var2x) -> {
                                    label110: {
                                        int var57x;
                                        label109: {
                                            var57x = Eo;
                                            var57x ^= 1127030159;
                                            int var4x = System.identityHashCode(modules);
                                            int var5x = var4x + 1;
                                            var5x = var4x * var5x;
                                            var5x &= 1;
                                            if (var5x != 0) {
                                                var57x += 100600373;
                                                var57x *= 1205008605;
                                                var57x >>= 26;
                                                var57x &= 1035598478;
                                                var57x ^= -1423413638;
                                            } else {
                                                var57x -= -1464459643;
                                                var57x >>>= 9;
                                                var57x += -574392112;
                                                var57x ^= -1440954144;
                                                Integer var78x = var57x;
                                                if (var78x == null) {
                                                    break label110;
                                                }

                                                JsonObject var79x = modules.getAsJsonObject();
                                                JsonElement var80x = var79x.get((String)var1x);
                                                if (var80x == null) {
                                                    var57x &= -1680719410;
                                                    var57x ^= -1383425871;
                                                    return;
                                                }

                                                var57x &= -1943099305;
                                                var57x += -1832758605;
                                                var57x ^= -2015121297;
                                                int var6x = (var80x.isJsonObject()) ? 1 : 0;
                                                long var7x = var4x;
                                                long var9x = var7x + 1L;
                                                var9x = var7x * var9x;
                                                long var11x = var7x + 2L;
                                                var9x *= var11x;
                                                var7x += 3L;
                                                var9x *= var7x;
                                                var7x = var9x & 7L;
                                                long var131x;
                                                int var103x = (var131x = var7x - 0L) == 0L ? 0 : (var131x < 0L ? -1 : 1);
                                                if (var103x != 0) {
                                                    var57x &= -455556678;
                                                    var57x ^= -1768303148;
                                                } else {
                                                    var57x -= -537968293;
                                                    var57x -= 1784334323;
                                                    var57x ^= 453505406;
                                                    int var104x = var57x + 1;
                                                    int var105x = var57x * var104x;
                                                    int var106x = var105x & 1;
                                                    if (var106x != 0) {
                                                        break label110;
                                                    }

                                                    if (var6x == 0) {
                                                        var57x &= -1410777930;
                                                        var57x ^= 878375255;
                                                        return;
                                                    }
                                                    var57x = switch (var57x) {
                                                        case -1512684125 -> var57x ^ -1477523984;
                                                        default -> var57x ^ -2048664279;
                                                        case -574313627 -> {
                                                            var57x += 2139206071;
                                                            var57x ^= 422281304;
                                                            var57x &= -1883885952;
                                                            var57x >>= 8;
                                                            yield var57x ^ 1663244762;
                                                        }
                                                    };
                                                    long var84x = var57x;
                                                    long var8x = var84x + 1L;
                                                    var8x = var84x * var8x;
                                                    long var10 = var84x + 2L;
                                                    var8x *= var10;
                                                    long var85x = var84x + 3L;
                                                    var8x *= var85x;
                                                    long var86x = var8x & 7L;
                                                    long var132x;
                                                    var6x = (var132x = var86x - 0L) == 0L ? 0 : (var132x < 0L ? -1 : 1);
                                                    if (var6x != 0) {
                                                        break label110;
                                                    }

                                                    JsonObject var81x = var80x.getAsJsonObject();
                                                    JsonElement var82x = var81x.get("settings");
                                                    Integer var88x = var4x;
                                                    if (var88x != null) {
                                                        var57x &= 1428833127;
                                                        var57x *= 420851097;
                                                        var57x ^= 1864365709;
                                                        var88x = var57x;
                                                        if (var88x == null) {
                                                            break label110;
                                                        }

                                                        if (var82x == null) {
                                                            switch (var57x) {
                                                                case -1249657511:
                                                                    var57x ^= 1284417912;
                                                                    break label109;
                                                                case -1208818085:
                                                                    var57x |= -1294257742;
                                                                    var57x |= 1388351372;
                                                                    var57x ^= -16188533;
                                                                    break label109;
                                                                case 1858451705:
                                                                default:
                                                                    var57x ^= 850847366;
                                                                    break label109;
                                                            }
                                                        }

                                                        var57x *= 453565859;
                                                        var57x ^= -395234864;
                                                        long var90x = var57x;
                                                        var8x = var90x + 1L;
                                                        var8x = var90x * var8x;
                                                        long var91x = var8x & 1L;
                                                        long var133x;
                                                        int var92x = (var133x = var91x - 0L) == 0L ? 0 : (var133x < 0L ? -1 : 1);
                                                        if (var92x != 0) {
                                                            break label110;
                                                        }

                                                        int var93x = (var82x.isJsonObject()) ? 1 : 0;
                                                        Integer var107x = var4x;
                                                        if (var107x == null) {
                                                            var57x -= -610210545;
                                                            var57x ^= 236620526;
                                                        } else {
                                                            var57x += 906709284;
                                                            var57x >>>= 17;
                                                            var57x -= 2094370086;
                                                            var57x >>>= 2;
                                                            var57x ^= -171301239;
                                                            var7x = var57x;
                                                            var9x = var7x + 1L;
                                                            var9x = var7x * var9x;
                                                            var11x = var7x + 2L;
                                                            var9x *= var11x;
                                                            var7x += 3L;
                                                            var9x *= var7x;
                                                            var7x = var9x & 7L;
                                                            long var134x;
                                                            int var111x = (var134x = var7x - 0L) == 0L ? 0 : (var134x < 0L ? -1 : 1);
                                                            if (var111x != 0) {
                                                                break label110;
                                                            }

                                                            if (var93x == 0) {
                                                                var57x *= -962979947;
                                                                var57x ^= -766994704;
                                                                break label109;
                                                            }

                                                            var57x += -664355833;
                                                            var57x -= -695522737;
                                                            var57x -= 148361338;
                                                            var57x ^= -177208178;
                                                            JsonObject var83x = var82x.getAsJsonObject();
                                                            var93x = var4x + 1;
                                                            var93x = var4x * var93x;
                                                            int var112x = var4x + 2;
                                                            var93x *= var112x;
                                                            var4x += 3;
                                                            var93x *= var4x;
                                                            var4x = var93x & 7;
                                                            if (var4x == 0) {
                                                                var57x += -1204234371;
                                                                var57x ^= 427915741;
                                                                long var98x = var57x;
                                                                var8x = var98x + 1L;
                                                                var8x = var98x * var8x;
                                                                var10 = var98x + 2L;
                                                                var8x *= var10;
                                                                long var99x = var98x + 3L;
                                                                var8x *= var99x;
                                                                long var100x = var8x & 7L;
                                                                long var135x;
                                                                var4x = (var135x = var100x - 0L) == 0L ? 0 : (var135x < 0L ? -1 : 1);
                                                                if (var4x == 0) {
                                                                    BiConsumer var70x = (var1xx, var2xx) -> {
                                                                        boolean var163x;
                                                                        label200: {
                                                                            int var3xx = Eo;
                                                                            var3xx ^= 432793746;
                                                                            int var4xx = System.identityHashCode(var83x);
                                                                            JsonElement var5xx = var83x.get((String)var1xx);
                                                                            int var6xx = var4xx + 1;
                                                                            var6xx = var4xx * var6xx;
                                                                            int var7xx = var4xx + 2;
                                                                            var6xx *= var7xx;
                                                                            var7xx = var4xx + 3;
                                                                            var6xx *= var7xx;
                                                                            var6xx &= 7;
                                                                            if (var6xx != 0) {
                                                                                var3xx <<= 9;
                                                                                var3xx &= 1896591310;
                                                                                var3xx &= -893446120;
                                                                                var3xx |= 1008290951;
                                                                                var3xx ^= -237160078;
                                                                            } else {
                                                                                var3xx ^= 1814729885;
                                                                                var3xx ^= -50166238;
                                                                                if (var5xx == null) {
                                                                                    var3xx -= -1433845354;
                                                                                    var3xx <<= 4;
                                                                                    var3xx >>>= 22;
                                                                                    var3xx += 498926530;
                                                                                    var3xx ^= -691354336;
                                                                                    return;
                                                                                }

                                                                                var3xx *= 1772386579;
                                                                                var3xx ^= -973342884;
                                                                                var6xx = var3xx + 1;
                                                                                var6xx = var3xx * var6xx;
                                                                                var6xx &= 1;
                                                                                if (var6xx != 0) {
                                                                                    break label200;
                                                                                }

                                                                                int var156x = (var5xx.isJsonPrimitive()) ? 1 : 0;
                                                                                Integer var185x = var4xx;
                                                                                if (var185x == null) {
                                                                                    var3xx *= 789319881;
                                                                                    var3xx -= 1525864676;
                                                                                    var3xx ^= 89126512;
                                                                                } else {
                                                                                    var3xx |= -1128708489;
                                                                                    var3xx -= 54454812;
                                                                                    var3xx |= 2087103895;
                                                                                    var3xx *= -925878295;
                                                                                    var3xx ^= 50168779;
                                                                                    if (var156x == 0) {
                                                                                        var3xx *= 2016342355;
                                                                                        var3xx ^= -129584385;
                                                                                        return;
                                                                                    }

                                                                                    var3xx |= -668947150;
                                                                                    var3xx &= -1025489728;
                                                                                    var3xx ^= -22119436;
                                                                                    JsonPrimitive var143x = var5xx.getAsJsonPrimitive();
                                                                                    Integer var157x = var4xx;
                                                                                    if (var157x == null) {
                                                                                        switch (var3xx) {
                                                                                            case -680737831:
                                                                                                var3xx ^= -1252449566;
                                                                                                break;
                                                                                            case 1015955444:
                                                                                                var3xx += 1843504807;
                                                                                                var3xx -= 1415176723;
                                                                                                var3xx ^= 2050211244;
                                                                                                var3xx ^= -505295663;
                                                                                                break;
                                                                                            case 1838489738:
                                                                                            default:
                                                                                                var3xx ^= -867885278;
                                                                                        }
                                                                                    } else {
                                                                                        label226: {
                                                                                            var3xx ^= -1150448363;
                                                                                            var3xx ^= -407893400;
                                                                                            long var158x = var3xx;
                                                                                            long var8xx = var158x + 1L;
                                                                                            var8xx = var158x * var8xx;
                                                                                            long var10x = var158x + 2L;
                                                                                            var8xx *= var10x;
                                                                                            long var159x = var158x + 3L;
                                                                                            var8xx *= var159x;
                                                                                            long var160x = var8xx & 7L;
                                                                                            long var237;
                                                                                            var156x = (var237 = var160x - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var237 < 0L ? -1 : 1);
                                                                                            if (var156x != 0) {
                                                                                                break label200;
                                                                                            }

                                                                                            boolean var162x = var2xx instanceof Number;
                                                                                            label189:
                                                                                            if (var162x) {
                                                                                                var3xx = switch (var3xx) {
                                                                                                    default -> var3xx ^ -1149760439;
                                                                                                    case 1107092799 -> var3xx ^ -572718107;
                                                                                                    case 1616099465 -> {
                                                                                                        var3xx ^= 804871979;
                                                                                                        yield var3xx ^ -114935335;
                                                                                                    }
                                                                                                };
                                                                                                int var164x = var3xx + 1;
                                                                                                var164x = var3xx * var164x;
                                                                                                int var189x = var3xx + 2;
                                                                                                var164x *= var189x;
                                                                                                var189x = var3xx + 3;
                                                                                                var164x *= var189x;
                                                                                                var164x &= 7;
                                                                                                if (var164x != 0) {
                                                                                                    break label200;
                                                                                                }

                                                                                                Number var169x = (Number)var2xx;
                                                                                                long var191 = var4xx;
                                                                                                long var219 = var191 + 1L;
                                                                                                var219 = var191 * var219;
                                                                                                long var192 = var219 & 1L;
                                                                                                long var238;
                                                                                                var189x = (var238 = var192 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var238 < 0L ? -1 : 1);
                                                                                                if (var189x != 0) {
                                                                                                    switch (var3xx) {
                                                                                                        case -1590729538:
                                                                                                        default:
                                                                                                            var3xx ^= -2004607439;
                                                                                                            break label226;
                                                                                                        case -1232281989:
                                                                                                            var3xx -= -1800116808;
                                                                                                            var3xx += -1994111715;
                                                                                                            var3xx ^= 1731774485;
                                                                                                            break label226;
                                                                                                        case 444190020:
                                                                                                            var3xx ^= -1801896779;
                                                                                                            break label226;
                                                                                                    }
                                                                                                }

                                                                                                var3xx -= -1160889937;
                                                                                                var3xx ^= 831772040;
                                                                                                long var194 = var3xx;
                                                                                                var219 = var194 + 1L;
                                                                                                var219 = var194 * var219;
                                                                                                long var195 = var219 & 1L;
                                                                                                long var239;
                                                                                                var189x = (var239 = var195 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var239 < 0L ? -1 : 1);
                                                                                                if (var189x != 0) {
                                                                                                    break label200;
                                                                                                }

                                                                                                boolean var197 = var143x.isNumber();
                                                                                                if (var197) {
                                                                                                    var3xx += -1263826423;
                                                                                                    var3xx |= 1865845491;
                                                                                                    var3xx |= -1224939640;
                                                                                                    var3xx |= -257849300;
                                                                                                    var3xx ^= -185919563;
                                                                                                    double var198 = var143x.getAsDouble();
                                                                                                    int var223 = var4xx + 1;
                                                                                                    int var224 = var4xx * var223;
                                                                                                    int var235 = var4xx + 2;
                                                                                                    int var225 = var224 * var235;
                                                                                                    int var236 = var4xx + 3;
                                                                                                    int var226 = var225 * var236;
                                                                                                    int var227 = var226 & 7;
                                                                                                    if (var227 != 0) {
                                                                                                        var3xx >>>= 18;
                                                                                                        var3xx -= 13187718;
                                                                                                        var3xx *= -34242081;
                                                                                                        var3xx += -1375534482;
                                                                                                        var3xx ^= 1294615994;
                                                                                                        break label226;
                                                                                                    }

                                                                                                    var3xx -= 1390644373;
                                                                                                    var3xx ^= -1053970090;
                                                                                                    double var228 = var169x.doubleValue();
                                                                                                    double var170x = var198 - var228;
                                                                                                    double var171x = Math.abs(var170x);
                                                                                                    double var240;
                                                                                                    var164x = (var240 = var171x - 1.0E-5) == 0.0
                                                                                                        ? 0
                                                                                                        : (var240 < 0.0 ? -1 : 1);
                                                                                                    if (var164x < 0) {
                                                                                                        var3xx |= -1032395619;
                                                                                                        var3xx &= 1738634101;
                                                                                                        var3xx += 1575185772;
                                                                                                        var3xx ^= -727383803;
                                                                                                        Integer var173x = var3xx;
                                                                                                        if (var173x == null) {
                                                                                                            break label200;
                                                                                                        }

                                                                                                        var163x = true;
                                                                                                        var3xx -= -936189224;
                                                                                                        var3xx |= -239711321;
                                                                                                        var3xx *= -1075720441;
                                                                                                        var3xx ^= 48958272;
                                                                                                        break label189;
                                                                                                    }

                                                                                                    var3xx >>= 11;
                                                                                                    var3xx ^= 120523547;
                                                                                                } else {
                                                                                                    var3xx ^= 2085385590;
                                                                                                    var3xx ^= 1740364122;
                                                                                                    var3xx ^= -688196114;
                                                                                                }

                                                                                                var163x = false;
                                                                                                var3xx ^= 446778405;
                                                                                                var3xx |= -206930279;
                                                                                                var3xx -= -1091498973;
                                                                                                var3xx ^= -466323695;
                                                                                            } else {
                                                                                                label211: {
                                                                                                    var3xx += 374514147;
                                                                                                    var3xx ^= 70861337;
                                                                                                    boolean var186x = var143x.isString();
                                                                                                    int var202 = var4xx + 1;
                                                                                                    int var203 = var4xx * var202;
                                                                                                    int var9xx = var4xx + 2;
                                                                                                    int var204 = var203 * var9xx;
                                                                                                    var9xx = var4xx + 3;
                                                                                                    int var205 = var204 * var9xx;
                                                                                                    int var206 = var205 & 7;
                                                                                                    if (var206 != 0) {
                                                                                                        var3xx |= 1506930392;
                                                                                                        var3xx ^= -53610565;
                                                                                                        var3xx >>= 16;
                                                                                                        var3xx -= 1030275828;
                                                                                                        var3xx ^= 257077739;
                                                                                                        break label226;
                                                                                                    }

                                                                                                    var3xx ^= -767370325;
                                                                                                    var3xx -= -1158512379;
                                                                                                    var3xx ^= -116502256;
                                                                                                    var8xx = var3xx;
                                                                                                    var10x = var8xx + 1L;
                                                                                                    var10x = var8xx * var10x;
                                                                                                    long var12x = var8xx + 2L;
                                                                                                    var10x *= var12x;
                                                                                                    var8xx += 3L;
                                                                                                    var10x *= var8xx;
                                                                                                    var8xx = var10x & 7L;
                                                                                                    long var241;
                                                                                                    int var210 = (var241 = var8xx - 0L) == 0L
                                                                                                        ? 0
                                                                                                        : (var241 < 0L ? -1 : 1);
                                                                                                    if (var210 != 0) {
                                                                                                        break label200;
                                                                                                    }

                                                                                                    if (var186x) {
                                                                                                        var3xx = switch (var3xx) {
                                                                                                            default -> var3xx ^ -1598333769;
                                                                                                            case -1783421073 -> var3xx ^ 89718711;
                                                                                                            case 484774857 -> {
                                                                                                                var3xx += -1424531045;
                                                                                                                var3xx ^= -665229164;
                                                                                                                var3xx ^= 1455682833;
                                                                                                                var3xx &= 434843805;
                                                                                                                yield var3xx ^ -1861280801;
                                                                                                            }
                                                                                                        };
                                                                                                        var185x = var3xx;
                                                                                                        if (var185x == null) {
                                                                                                            break label200;
                                                                                                        }

                                                                                                        String var144x = var143x.getAsString();
                                                                                                        String var188x = (String)var2xx;
                                                                                                        var8xx = var4xx;
                                                                                                        var10x = var8xx + 1L;
                                                                                                        var10x = var8xx * var10x;
                                                                                                        var8xx = var10x & 1L;
                                                                                                        long var242;
                                                                                                        int var213 = (var242 = var8xx - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var242 < 0L ? -1 : 1);
                                                                                                        if (var213 != 0) {
                                                                                                            var3xx -= 578470324;
                                                                                                            var3xx ^= -1204417441;
                                                                                                            break label226;
                                                                                                        }
                                                                                                        var3xx = switch (var3xx) {
                                                                                                            case -1737671842 -> {
                                                                                                                var3xx -= 1477893795;
                                                                                                                var3xx |= 1793903737;
                                                                                                                var3xx &= -738434263;
                                                                                                                var3xx *= -2019459515;
                                                                                                                yield var3xx ^ -772001756;
                                                                                                            }
                                                                                                            default -> var3xx ^ 1875683324;
                                                                                                            case 1696596509 -> var3xx ^ 1031677454;
                                                                                                        };
                                                                                                        boolean var145x = var144x.equalsIgnoreCase(var188x);
                                                                                                        if (var145x) {
                                                                                                            var3xx ^= -169676551;
                                                                                                            var3xx ^= -1666452671;
                                                                                                            Integer var146x = var3xx;
                                                                                                            if (var146x == null) {
                                                                                                                break label200;
                                                                                                            }

                                                                                                            var163x = true;
                                                                                                            var3xx += 1242964637;
                                                                                                            var3xx ^= 1166764199;
                                                                                                            break label211;
                                                                                                        }

                                                                                                        var3xx *= 828182417;
                                                                                                        var3xx *= 1397613323;
                                                                                                        var3xx >>>= 3;
                                                                                                        var3xx >>>= 16;
                                                                                                        var3xx ^= -574572091;
                                                                                                    } else {
                                                                                                        var3xx *= -493901525;
                                                                                                        var3xx ^= -1264282044;
                                                                                                        var3xx ^= 257673523;
                                                                                                        var3xx -= 1015580857;
                                                                                                        var3xx ^= 912615710;
                                                                                                    }

                                                                                                    Integer var147x = var3xx;
                                                                                                    if (var147x == null) {
                                                                                                        break label200;
                                                                                                    }

                                                                                                    var163x = false;
                                                                                                    switch (var3xx) {
                                                                                                        case -581950901:
                                                                                                        default:
                                                                                                            var3xx ^= 1144575841;
                                                                                                            break;
                                                                                                        case -574571803:
                                                                                                            var3xx <<= 13;
                                                                                                            var3xx *= -168554593;
                                                                                                            var3xx ^= -882285175;
                                                                                                            break;
                                                                                                        case 1429058602:
                                                                                                            var3xx ^= 1601197200;
                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                            long var174x = var4xx;
                                                                                            var8xx = var174x + 1L;
                                                                                            var8xx = var174x * var8xx;
                                                                                            long var175x = var8xx & 1L;
                                                                                            long var243;
                                                                                            var4xx = (var243 = var175x - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                                                                                            if (var4xx == 0) {
                                                                                                var3xx = switch (var3xx) {
                                                                                                    case -1534196343 -> {
                                                                                                        var3xx += -452985084;
                                                                                                        var3xx &= 146467969;
                                                                                                        yield var3xx ^ -1091451691;
                                                                                                    }
                                                                                                    case -684167686 -> var3xx ^ -829072486;
                                                                                                    default -> var3xx ^ 1634239256;
                                                                                                };
                                                                                                if (var163x) {
                                                                                                    var3xx += -232883628;
                                                                                                    var3xx &= 524583459;
                                                                                                    var3xx ^= -1288711784;
                                                                                                    long var129xx = var3xx;
                                                                                                    long var176x = var129xx + 1L;
                                                                                                    long var177x = var129xx * var176x;
                                                                                                    var8xx = var129xx + 2L;
                                                                                                    long var178x = var177x * var8xx;
                                                                                                    long var130xx = var129xx + 3L;
                                                                                                    long var179x = var178x * var130xx;
                                                                                                    long var131xx = var179x & 7L;
                                                                                                    long var244;
                                                                                                    var4xx = (var244 = var131xx - 0L) == 0L
                                                                                                        ? 0
                                                                                                        : (var244 < 0L ? -1 : 1);
                                                                                                    if (var4xx != 0) {
                                                                                                        break label200;
                                                                                                    }

                                                                                                    JsonElement var133xx = var83x.remove((String)var1xx);
                                                                                                    var3xx *= -929695531;
                                                                                                    var3xx >>>= 18;
                                                                                                    var3xx -= -1914454477;
                                                                                                    var3xx &= -1409231428;
                                                                                                    var3xx ^= -508399623;
                                                                                                } else {
                                                                                                    switch (var3xx) {
                                                                                                        case -1233403820:
                                                                                                            var3xx |= 953828005;
                                                                                                            var3xx += 560023107;
                                                                                                            var3xx >>= 20;
                                                                                                            var3xx ^= 1045288176;
                                                                                                            break;
                                                                                                        case -189136585:
                                                                                                            var3xx ^= 1391134559;
                                                                                                            break;
                                                                                                        case 663692799:
                                                                                                        default:
                                                                                                            var3xx ^= -1574590739;
                                                                                                    }
                                                                                                }

                                                                                                long var134xx = var3xx;
                                                                                                long var180x = var134xx + 1L;
                                                                                                long var181x = var134xx * var180x;
                                                                                                var8xx = var134xx + 2L;
                                                                                                long var182x = var181x * var8xx;
                                                                                                long var135xx = var134xx + 3L;
                                                                                                long var183x = var182x * var135xx;
                                                                                                long var136x = var183x & 7L;
                                                                                                long var245;
                                                                                                var4xx = (var245 = var136x - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var245 < 0L ? -1 : 1);
                                                                                                if (var4xx == 0) {
                                                                                                    return;
                                                                                                }
                                                                                                break label200;
                                                                                            }

                                                                                            var3xx ^= 737132866;
                                                                                            var3xx += -1571563167;
                                                                                            var3xx ^= -59642919;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }

                                                                            var4xx = var3xx + 1;
                                                                            var4xx = var3xx * var4xx;
                                                                            var4xx &= 1;
                                                                            if (var4xx == 0) {
                                                                                IllegalStateException var141x = new IllegalStateException();
                                                                                throw var141x;
                                                                            }
                                                                        }

                                                                        IllegalStateException var142x = new IllegalStateException();
                                                                        throw var142x;
                                                                    };
                                                                    ((Map)var2x).forEach(var70x);
                                                                    return;
                                                                }
                                                                break label110;
                                                            }

                                                            var57x >>>= 19;
                                                            var57x -= -611484944;
                                                            var57x >>>= 31;
                                                            var57x ^= 1956175525;
                                                            var57x ^= -502707623;
                                                        }
                                                    } else {
                                                        switch (var57x) {
                                                            case -1610230329:
                                                            default:
                                                                var57x ^= -1558155216;
                                                                break;
                                                            case 1053469806:
                                                                var57x ^= 98905654;
                                                                break;
                                                            case 1663516118:
                                                                var57x -= -1044461386;
                                                                var57x &= -1972171964;
                                                                var57x ^= 384931324;
                                                        }
                                                    }
                                                }
                                            }

                                            Integer var74x = var57x;
                                            if (var74x != null) {
                                                UnsupportedOperationException var75x = new UnsupportedOperationException();
                                                throw var75x;
                                            }
                                            break label110;
                                        }

                                        int var71x = var57x + 1;
                                        var71x = var57x * var71x;
                                        var71x &= 1;
                                        if (var71x == 0) {
                                            return;
                                        }
                                    }

                                    IllegalStateException var66x = new IllegalStateException();
                                    throw var66x;
                                };
                                int var153 = var2 + 1;
                                int var154 = var2 * var153;
                                int var155 = var154 & 1;
                                if (var155 != 0) {
                                    var1 += -24480892;
                                    var1 &= 2005179471;
                                    var1 ^= 779455194;
                                    break label140;
                                }

                                var1 += -993604666;
                                var1 += 211532390;
                                var1 -= 13783585;
                                var1 ^= 1684580038;
                                var145 = var1;
                                long var177 = var145 + 1L;
                                var177 = var145 * var177;
                                long var9 = var145 + 2L;
                                var177 *= var9;
                                var145 += 3L;
                                var177 *= var145;
                                var145 = var177 & 7L;
                                long var190;
                                int var159 = (var190 = var145 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                                if (var159 != 0) {
                                    break label158;
                                }

                                var133.forEach(var109);
                                var1 *= 489811325;
                                var1 ^= 1519692770;
                            } else {
                                switch (var1) {
                                    case -1767271788:
                                        var1 -= 1929022875;
                                        var1 ^= 1360724061;
                                        var1 ^= 2065391134;
                                        var1 ^= -488865734;
                                        break;
                                    case -1426885568:
                                    default:
                                        var1 ^= -1423895174;
                                        break;
                                    case -42285504:
                                        var1 ^= 1564957880;
                                }
                            }
                        } else {
                            var1 += 992908598;
                            var1 += 833559475;
                            var1 += -1120852596;
                            var1 ^= 1183813603;
                        }

                        Integer var110 = var1;
                        if (var110 == null) {
                            break label158;
                        }

                        Integer var111 = 3;
                        var127 = var2 + 1;
                        var127 = var2 * var127;
                        int var160 = var2 + 2;
                        var127 *= var160;
                        var2 += 3;
                        var127 *= var2;
                        var2 = var127 & 7;
                        if (var2 == 0) {
                            var1 ^= 209947448;
                            var1 ^= -62035699;
                            var0.addProperty("schema", var111);
                            return true;
                        }

                        switch (var1) {
                            case -680964960:
                                var1 ^= 530543423;
                                break;
                            case -344728960:
                                var1 ^= 1008630853;
                                var1 += -436826031;
                                var1 -= 656818110;
                                var1 <<= 6;
                                var1 ^= -1240939361;
                                break;
                            case 767668952:
                            default:
                                var1 ^= 2055926128;
                        }
                    } else {
                        var1 &= 1799300910;
                        var1 += -896224622;
                        var1 ^= -709639895;
                    }
                }
            }

            RuntimeException var100 = new RuntimeException();
            throw var100;
        }

        UnsupportedOperationException var101 = new UnsupportedOperationException();
        throw var101;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var7 = var0.lookupClass();
        int var1 = 1312458176;
        byte var2 = 0;
        int var8 = of_2.xF(var7, var1, var2);
        Eo = var8;
        Map var9 = Map.of("color", "#FFA4C9BA");
        Map var11 = Map.of("color", "#FFA4C9BA");
        Map var12 = Map.of("color", "#FFA4C9BA");
        Map var3 = Map.of("heal_color", "#FFA4C9BA");
        Map var4 = Map.of("from", "#FF8DA99E", "to", "#FFA4C9BA");
        Double var5 = 3.0;
        Double var6 = 0.6;
        Map var13 = Map.of("blur", var5, "dim", var6);
        Map var10 = Map.of("hit_particles", var9, "hit_bubbles", var11, "kill_effect", var12, "damage_numbers", var3, "cooldown_ring", var4, "click_gui", var13);
        o = var10;
    }
}
