package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.SwitchBootstraps;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public final class dt_2 {
    public static final int P = 4;
    private static final Map F;
    private static final Map Kt;
    public static final int t;

    private dt_2() {
    }

    public static boolean p(JsonObject var0) {
        int var1 = t;
        var1 ^= -1490254869;
        int var2 = System.identityHashCode(var0);
        JsonElement var3 = var0.get("schema");
        Integer var4 = var2;
        if (var4 == null) {
            switch (var1) {
                case -1517974556:
                    var1 >>= 8;
                    var1 ^= 1182666257;
                    break;
                case -1308651891:
                    var1 ^= -617874182;
                    break;
                case 1142806794:
                default:
                    var1 ^= -1222414601;
            }
        } else {
            label153: {
                var1 >>>= 13;
                var1 ^= -1466098020;
                var1 &= -541270385;
                var1 ^= 1377613889;
                long var122 = var1;
                long var6 = var122 + 1L;
                var6 = var122 * var6;
                long var123 = var6 & 1L;
                long var191;
                int var124 = (var191 = var123 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                label139:
                if (var124 == 0) {
                    if (var3 != null) {
                        var1 -= -1250923601;
                        var1 &= 1590952548;
                        var1 >>>= 9;
                        var1 |= -1331339605;
                        var1 ^= 499590494;
                        Integer var125 = var1;
                        if (var125 == null) {
                            break label139;
                        }

                        boolean var126 = var3.isJsonPrimitive();
                        int var5 = var2 + 1;
                        var5 = var2 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            var1 |= 1889040827;
                            var1 ^= 1143205989;
                            break label153;
                        }

                        var1 *= -10560313;
                        var1 ^= 788436618;
                        long var145 = var1;
                        long var7 = var145 + 1L;
                        var7 = var145 * var7;
                        long var9 = var145 + 2L;
                        var7 *= var9;
                        long var146 = var145 + 3L;
                        var7 *= var146;
                        long var147 = var7 & 7L;
                        long var192;
                        var5 = (var192 = var147 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label139;
                        }

                        if (var126) {
                            var1 += -2112376063;
                            var1 ^= 1178630703;
                            var1 ^= 1812373809;
                            JsonPrimitive var127 = var3.getAsJsonPrimitive();
                            boolean var128 = var127.isNumber();
                            var5 = var2 + 1;
                            var5 = var2 * var5;
                            int var171 = var2 + 2;
                            var5 *= var171;
                            int var172 = var2 + 3;
                            var5 *= var172;
                            var5 &= 7;
                            if (var5 != 0) {
                                var1 += 268618930;
                                var1 -= -1329819942;
                                var1 *= -434466977;
                                var1 += -1289665870;
                                var1 ^= 1511171308;
                                break label153;
                            }
                            var1 = switch (var1) {
                                case -1176698908 -> {
                                    var1 <<= 5;
                                    var1 &= 891306388;
                                    yield var1 ^ 1880659008;
                                }
                                default -> var1 ^ -1788919583;
                                case 235412405 -> var1 ^ -49529034;
                            };
                            Integer var154 = var1;
                            if (var154 == null) {
                                break label139;
                            }

                            if (var128) {
                                var1 |= -649254703;
                                var1 |= -308132383;
                                var1 ^= 46096195;
                                int var107 = var3.getAsInt();
                                var125 = var2;
                                if (var125 == null) {
                                    var1 >>>= 19;
                                    var1 ^= 1641584472;
                                    var1 |= -95224022;
                                    var1 += -845999776;
                                    var1 ^= 1890949760;
                                    break label153;
                                }

                                var1 -= -184765480;
                                var1 *= 209519727;
                                var1 -= 59629880;
                                var1 <<= 7;
                                var1 ^= -1099369434;
                                long var130 = var1;
                                var6 = var130 + 1L;
                                var6 = var130 * var6;
                                long var131 = var6 & 1L;
                                long var193;
                                int var132 = (var193 = var131 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                                if (var132 != 0) {
                                    break label139;
                                }

                                if (var107 >= 4) {
                                    var1 += 1901910305;
                                    var1 ^= -1208480989;
                                    long var108 = var1;
                                    long var155 = var108 + 1L;
                                    long var156 = var108 * var155;
                                    long var109 = var156 & 1L;
                                    long var194;
                                    int var110 = (var194 = var109 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                                    if (var110 == 0) {
                                        return false;
                                    }
                                    break label139;
                                }

                                var1 >>>= 24;
                                var1 |= 1061371294;
                                var1 ^= -1534249829;
                            } else {
                                var1 *= 955235921;
                                var1 ^= 189720462;
                                var1 ^= 914439787;
                            }
                        } else {
                            var1 <<= 15;
                            var1 ^= -1556969179;
                        }
                    } else {
                        var1 += 2133575287;
                        var1 -= -693389171;
                        var1 >>>= 16;
                        var1 ^= -1680963039;
                    }

                    long var111 = var1;
                    long var157 = var111 + 1L;
                    var157 = var111 * var157;
                    long var180 = var111 + 2L;
                    var157 *= var180;
                    long var112 = var111 + 3L;
                    var157 *= var112;
                    long var113 = var157 & 7L;
                    long var195;
                    int var114 = (var195 = var113 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                    if (var114 == 0) {
                        var3 = var0.get("modules");
                        Integer var133 = var2;
                        if (var133 == null) {
                            var1 -= -1364402965;
                            var1 ^= 1425713056;
                            break label153;
                        }

                        var1 >>>= 7;
                        var1 += -1803746069;
                        var1 ^= 1498437820;
                        var133 = var1;
                        label116:
                        if (var133 != null) {
                            if (var3 != null) {
                                var1 ^= -139752;
                                var1 *= -1965165189;
                                var1 ^= -1878222935;
                                boolean var135 = var3.isJsonObject();
                                var157 = var2;
                                var180 = var157 + 1L;
                                var180 = var157 * var180;
                                long var189 = var157 + 2L;
                                var180 *= var189;
                                var157 += 3L;
                                var180 *= var157;
                                var157 = var180 & 7L;
                                long var196;
                                int var164 = (var196 = var157 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                                if (var164 != 0) {
                                    var1 &= -161115250;
                                    var1 |= -1676690156;
                                    var1 ^= 131347588;
                                    break label153;
                                }

                                var1 *= -445070691;
                                var1 >>= 6;
                                var1 <<= 25;
                                var1 *= -1162021303;
                                var1 ^= -407259951;
                                if (var135) {
                                    var1 &= -142477638;
                                    var1 ^= 590347952;
                                    int var136 = var1 + 1;
                                    var136 = var1 * var136;
                                    var136 &= 1;
                                    if (var136 != 0) {
                                        break label116;
                                    }

                                    JsonObject var116 = var3.getAsJsonObject();
                                    Map var139 = Kt;
                                    BiConsumer var165 = (var1x, var2x) -> {
                                        label60: {
                                            int var30x;
                                            label59: {
                                                var30x = t;
                                                var30x ^= -286524781;
                                                int var4x = System.identityHashCode(var116);
                                                  JsonElement var5x = var116.get((String)var1x);
                                                int var6x = var30x | -1518707019;
                                                var6x *= -2007839105;
                                                var6x ^= -1713618732;
                                                var6x |= 914836404;
                                                var6x ^= 1378443790;
                                                JsonObject var57x = n(var5x, var6x);
                                                Integer var62x = var4x;
                                                if (var62x != null) {
                                                    var30x |= -1872143005;
                                                    var30x -= -104624652;
                                                    var30x += -1016093151;
                                                    var30x ^= -508228735;
                                                    int var63x = var30x + 1;
                                                    var63x = var30x * var63x;
                                                    int var7x = var30x + 2;
                                                    var63x *= var7x;
                                                    var7x = var30x + 3;
                                                    var63x *= var7x;
                                                    var63x &= 7;
                                                    if (var63x != 0) {
                                                        break label60;
                                                    }

                                                    if (var57x == null) {
                                                        var30x *= -387617515;
                                                        var30x *= 715266019;
                                                        var30x -= 1214150374;
                                                        var30x += -1229796460;
                                                        var30x ^= -764896877;
                                                        break label59;
                                                    }

                                                    var30x *= -946061553;
                                                    var30x &= -125187469;
                                                    var30x ^= 1718620738;
                                                    var30x ^= 2012542174;
                                                    var63x = var30x + 1;
                                                    var63x = var30x * var63x;
                                                    var7x = var30x + 2;
                                                    var63x *= var7x;
                                                    var7x = var30x + 3;
                                                    var63x *= var7x;
                                                    var63x &= 7;
                                                    if (var63x != 0) {
                                                        break label60;
                                                    }

                                                    JsonElement var73x = var57x.get("enabled");
                                                    var7x = var30x - -1887267529;
                                                    var7x ^= -851344461;
                                                    boolean var74x = Y(var73x, var2x, var7x);
                                                    long var87x = var4x;
                                                    long var9x = var87x + 1L;
                                                    var9x = var87x * var9x;
                                                    long var88x = var9x & 1L;
                                                    long var96x;
                                                    var4x = (var96x = var88x - 0L) == 0L ? 0 : (var96x < 0L ? -1 : 1);
                                                    if (var4x == 0) {
                                                        var30x |= 682744549;
                                                        var30x ^= 1723521691;
                                                        var4x = var30x + 1;
                                                        var4x = var30x * var4x;
                                                        var7x = var30x + 2;
                                                        var4x *= var7x;
                                                        var7x = var30x + 3;
                                                        var4x *= var7x;
                                                        var4x &= 7;
                                                        if (var4x != 0) {
                                                            break label60;
                                                        }

                                                        if (var74x) {
                                                            var30x = switch (var30x) {
                                                                default -> var30x ^ 1013867253;
                                                                case 521086052 -> {
                                                                    var30x ^= 1904626550;
                                                                    yield var30x ^ -1111373004;
                                                                }
                                                                case 872915657 -> var30x ^ 383584116;
                                                            };
                                                            long var75x = var30x;
                                                            long var8 = var75x + 1L;
                                                            var8 = var75x * var8;
                                                            long var10 = var75x + 2L;
                                                            var8 *= var10;
                                                            long var76x = var75x + 3L;
                                                            var8 *= var76x;
                                                            long var77x = var8 & 7L;
                                                            long var97x;
                                                            var4x = (var97x = var77x - 0L) == 0L ? 0 : (var97x < 0L ? -1 : 1);
                                                            if (var4x != 0) {
                                                                break label60;
                                                            }

                                                            JsonElement var50x = var57x.remove("enabled");
                                                            var30x *= 308822963;
                                                            var30x ^= 1585061309;
                                                            var30x += -491145499;
                                                            var30x ^= -919454554;
                                                        } else {
                                                            var30x |= 1228140134;
                                                            var30x -= 139866442;
                                                            var30x *= -765542009;
                                                            var30x <<= 12;
                                                            var30x ^= 594157746;
                                                        }
                                                        break label59;
                                                    }

                                                    var30x += -1026532606;
                                                    var30x ^= 1793364749;
                                                } else {
                                                    var30x += 161169570;
                                                    var30x ^= -1418762254;
                                                }

                                                var4x = var30x + 1;
                                                var4x = var30x * var4x;
                                                var30x = var4x & 1;
                                                if (var30x == 0) {
                                                    RuntimeException var42x = new RuntimeException();
                                                    throw var42x;
                                                }
                                                break label60;
                                            }

                                            long var51x = var30x;
                                            long var78x = var51x + 1L;
                                            var78x = var51x * var78x;
                                            long var94x = var51x + 2L;
                                            var78x *= var94x;
                                            var51x += 3L;
                                            var78x *= var51x;
                                            var51x = var78x & 7L;
                                            long var98x;
                                            int var54x = (var98x = var51x - 0L) == 0L ? 0 : (var98x < 0L ? -1 : 1);
                                            if (var54x == 0) {
                                                return;
                                            }
                                        }

                                        IllegalArgumentException var41x = new IllegalArgumentException();
                                        throw var41x;
                                    };
                                    var139.forEach(var165);
                                    Map var140 = F;
                                    BiConsumer var117 = (var1x, var2x) -> {
                                        label82: {
                                            int var3x = t;
                                            var3x ^= 447642261;
                                            int var4x = System.identityHashCode(var116);
                                            JsonElement var5x = var116.get((String)var1x);
                                            int var6x = var3x * -360792985;
                                            var6x ^= 1779052111;
                                            JsonObject var69x = n(var5x, var6x);
                                            Integer var75x = var4x;
                                            if (var75x == null) {
                                                switch (var3x) {
                                                    case -1541869652:
                                                    default:
                                                        var3x ^= -371786418;
                                                        break;
                                                    case -215584659:
                                                        var3x ^= 1376282901;
                                                        break;
                                                    case 403141274:
                                                        var3x ^= 1936046176;
                                                        var3x -= 1796363134;
                                                        var3x &= -541975493;
                                                        var3x ^= -1007982054;
                                                }
                                            } else {
                                                label80: {
                                                    var3x *= 1476468643;
                                                    var3x >>= 12;
                                                    var3x -= 1237902452;
                                                    var3x *= 414293787;
                                                    var3x ^= 1534444566;
                                                    JsonObject var79x;
                                                    if (var69x == null) {
                                                        var3x >>= 2;
                                                        var3x *= -1508327;
                                                        var3x ^= 1501961095;
                                                        int var76x = var3x + 1;
                                                        var76x = var3x * var76x;
                                                        var76x &= 1;
                                                        if (var76x != 0) {
                                                            break label82;
                                                        }

                                                        var79x = null;
                                                        switch (var3x) {
                                                            case -983303708:
                                                                var3x ^= -1647279184;
                                                                break;
                                                            case 1004380059:
                                                            default:
                                                                var3x ^= 709943177;
                                                                break;
                                                            case 1563134415:
                                                                var3x |= 485038702;
                                                                var3x += -1753134067;
                                                                var3x *= 1158699755;
                                                                var3x += 1685095900;
                                                                var3x ^= -985939074;
                                                        }
                                                    } else {
                                                        var3x = switch (var3x) {
                                                            default -> var3x ^ 1836017706;
                                                            case 1308754457 -> var3x ^ 270552537;
                                                            case 1894102561 -> {
                                                                var3x += 1154844389;
                                                                yield var3x ^ 1847549476;
                                                            }
                                                        };
                                                        var5x = var69x.get("settings");
                                                        int var7x = var3x * 1607900045;
                                                        var7x += -852921437;
                                                        var7x ^= -270811420;
                                                        JsonObject var71x = n(var5x, var7x);
                                                        long var90x = var4x;
                                                        long var9x = var90x + 1L;
                                                        var9x = var90x * var9x;
                                                        long var11x = var90x + 2L;
                                                        var9x *= var11x;
                                                        long var91x = var90x + 3L;
                                                        var9x *= var91x;
                                                        long var92x = var9x & 7L;
                                                        long var101x;
                                                        var7x = (var101x = var92x - 0L) == 0L ? 0 : (var101x < 0L ? -1 : 1);
                                                        if (var7x != 0) {
                                                            var3x *= 1497244055;
                                                            var3x ^= 1359127852;
                                                            break label80;
                                                        }

                                                        var3x -= -1030302635;
                                                        var3x &= -730378822;
                                                        var3x += -2139719387;
                                                        var3x += -67292814;
                                                        var3x ^= 1065072154;
                                                        Integer var94x = var3x;
                                                        if (var94x == null) {
                                                            break label82;
                                                        }

                                                        var79x = var71x;
                                                        var3x ^= -1218733460;
                                                        var3x ^= -1512355289;
                                                    }

                                                    JsonObject var72x = var79x;
                                                    var75x = var4x;
                                                    if (var75x == null) {
                                                        var3x >>>= 15;
                                                        var3x *= 926198699;
                                                        var3x *= -1273971289;
                                                        var3x *= 1016260797;
                                                        var3x ^= 776256141;
                                                    } else {
                                                        var3x >>= 25;
                                                        var3x &= -871815693;
                                                        var3x ^= -443003336;
                                                        if (var72x == null) {
                                                            var3x <<= 16;
                                                            var3x |= 1490021132;
                                                            var3x ^= 146504967;
                                                            int var85x = var3x + 1;
                                                            var85x = var3x * var85x;
                                                            var85x &= 1;
                                                            if (var85x == 0) {
                                                                return;
                                                            }
                                                            break label82;
                                                        }
                                                        var3x = switch (var3x) {
                                                            default -> var3x ^ -1051018740;
                                                            case -823761311 -> var3x ^ 1097876792;
                                                            case 697396200 -> {
                                                                var3x += 1039960569;
                                                                var3x &= -1189767022;
                                                                var3x |= 366402275;
                                                                var3x ^= 1368650718;
                                                                yield var3x ^ 926457312;
                                                            }
                                                        };
                                                        BiConsumer var73x = (var1xx, var2xx) -> {
                                                            int var3xx = t;
                                                            var3xx ^= 1109332104;
                                                            int var4xx = System.identityHashCode(var72x);
                                                            int var5xx = var4xx + 1;
                                                            var5xx = var4xx * var5xx;
                                                            var4xx = var5xx & 1;
                                                            if (var4xx != 0) {
                                                                var3xx -= -1361797968;
                                                                var3xx += -517450099;
                                                                var3xx ^= 40755939;
                                                                Integer var26xx = var3xx;
                                                                if (var26xx != null) {
                                                                    IllegalArgumentException var27xx = new IllegalArgumentException();
                                                                    throw var27xx;
                                                                }
                                                            } else {
                                                                var3xx *= 569313595;
                                                                var3xx ^= 214675581;
                                                                Integer var28xx = var3xx;
                                                                if (var28xx != null) {
                                                                      JsonElement var29xx = var72x.get((String)var1xx);
                                                                    var5xx = var3xx + 1678833087;
                                                                    var5xx |= 110635322;
                                                                    var5xx ^= -654526204;
                                                                    boolean var30xx = Y(var29xx, var2xx, var5xx);
                                                                    if (var30xx) {
                                                                        var3xx -= 828086535;
                                                                        var3xx |= -1807773926;
                                                                        var3xx ^= 173134958;
                                                                        JsonElement var31xx = var72x.remove((String)var1xx);
                                                                        var3xx |= -1168600367;
                                                                        var3xx += 216947012;
                                                                        var3xx &= 691711853;
                                                                        var3xx |= -1540188218;
                                                                        var3xx ^= 927027092;
                                                                    } else {
                                                                        switch (var3xx) {
                                                                            case -1860774304:
                                                                                var3xx >>= 23;
                                                                                var3xx ^= 1686382425;
                                                                                break;
                                                                            case -393389493:
                                                                            default:
                                                                                var3xx ^= -365253424;
                                                                                break;
                                                                            case 1414053556:
                                                                                var3xx ^= -1148344838;
                                                                        }
                                                                    }

                                                                    return;
                                                                }
                                                            }

                                                            RuntimeException var12x = new RuntimeException();
                                                            throw var12x;
                                                        };
                                                        long var81x = var4x;
                                                        long var8 = var81x + 1L;
                                                        var8 = var81x * var8;
                                                        long var82x = var8 & 1L;
                                                        long var102x;
                                                        var4x = (var102x = var82x - 0L) == 0L ? 0 : (var102x < 0L ? -1 : 1);
                                                        if (var4x == 0) {
                                                            var3x >>>= 7;
                                                            var3x *= -1455699955;
                                                            var3x += 425284937;
                                                            var3x ^= -1528490091;
                                                            long var83x = var3x;
                                                            var8 = var83x + 1L;
                                                            var8 = var83x * var8;
                                                            long var84x = var8 & 1L;
                                                            long var103x;
                                                            var4x = (var103x = var84x - 0L) == 0L ? 0 : (var103x < 0L ? -1 : 1);
                                                            if (var4x == 0) {
                                                                ((Map)var2x).forEach(var73x);
                                                                return;
                                                            }
                                                            break label82;
                                                        }

                                                        var3x *= -882443935;
                                                        var3x |= -1063668806;
                                                        var3x += -900601677;
                                                        var3x ^= 200316496;
                                                    }
                                                }
                                            }

                                            var4x = var3x + 1;
                                            var4x = var3x * var4x;
                                            var3x = var4x & 1;
                                            if (var3x == 0) {
                                                IllegalArgumentException var64x = new IllegalArgumentException();
                                                throw var64x;
                                            }
                                        }

                                        UnsupportedOperationException var63x = new UnsupportedOperationException();
                                        throw var63x;
                                    };
                                    var157 = var2;
                                    var180 = var157 + 1L;
                                    var180 = var157 * var180;
                                    var189 = var157 + 2L;
                                    var180 *= var189;
                                    var157 += 3L;
                                    var180 *= var157;
                                    var157 = var180 & 7L;
                                    long var197;
                                    int var169 = (var197 = var157 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                    if (var169 != 0) {
                                        var1 -= 616936327;
                                        var1 ^= -196797382;
                                        var1 ^= -1741811306;
                                        var1 |= -1730194994;
                                        var1 ^= 1644449893;
                                        break label153;
                                    }

                                    var1 ^= 1376864271;
                                    var1 *= 294857837;
                                    var1 ^= 1237251197;
                                    var140.forEach(var117);
                                    var1 *= 1062353133;
                                    var1 ^= 861732732;
                                } else {
                                    var1 += 214963197;
                                    var1 ^= 1792800020;
                                }
                            } else {
                                var1 &= -438340340;
                                var1 ^= -1567207974;
                            }

                            int var118 = var1 + 1;
                            int var119 = var1 * var118;
                            int var120 = var119 & 1;
                            if (var120 == 0) {
                                Integer var121 = 4;
                                long var141 = var2;
                                var6 = var141 + 1L;
                                var6 = var141 * var6;
                                long var142 = var6 & 1L;
                                long var198;
                                var2 = (var198 = var142 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    var1 += -803885433;
                                    var1 -= 1444017333;
                                    var1 |= 2094726611;
                                    var1 |= -1693596818;
                                    var1 ^= 1174697061;
                                    break label153;
                                }

                                var1 -= 355287963;
                                var1 &= -642210135;
                                var1 *= -134432619;
                                var1 ^= -1375643758;
                                Integer var105 = var1;
                                if (var105 != null) {
                                    var0.addProperty("schema", var121);
                                    return true;
                                }
                            }
                        }
                    }
                }

                IllegalArgumentException var106 = new IllegalArgumentException();
                throw var106;
            }
        }

        IllegalStateException var103 = new IllegalStateException();
        throw var103;
    }

    private static JsonObject n(JsonElement var0, int var1) {
        JsonObject var50 = null;
        label103: {
            int var3 = System.identityHashCode(var0);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            int var35;
            if (var4 != 0) {
                var35 = var1 * 2142725237;
                var35 ^= -1838588037;
                var35 *= 781384453;
                var35 ^= -1260069437;
            } else {
                label111: {
                    var35 = var1 & -1649430442;
                    var35 ^= 669601241;
                    var35 ^= -527119789;
                    long var53 = var35;
                    long var6 = var53 + 1L;
                    var6 = var53 * var6;
                    long var54 = var6 & 1L;
                    long var100;
                    var4 = (var100 = var54 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label103;
                    }

                    label99: {
                        if (var0 != null) {
                            var35 = switch (var35) {
                                case -1821333402 -> var35 ^ -2142497341;
                                case -1009543270 -> {
                                    var35 |= 2058544882;
                                    var35 &= -1083112875;
                                    var35 ^= 1060123782;
                                    yield var35 ^ 2097200221;
                                }
                                default -> var35 ^ 562244064;
                            };
                            int var56 = (var0.isJsonObject()) ? 1 : 0;
                            long var5 = var3;
                            long var7 = var5 + 1L;
                            var7 = var5 * var7;
                            long var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var101;
                            int var73 = (var101 = var5 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                            if (var73 != 0) {
                                var35 >>>= 16;
                                var35 ^= 1534128204;
                                break label111;
                            }

                            var35 >>= 16;
                            var35 &= -1828236121;
                            var35 += -273355476;
                            var35 ^= -934991826;
                            int var74 = var35 + 1;
                            int var75 = var35 * var74;
                            int var84 = var35 + 2;
                            int var76 = var75 * var84;
                            int var85 = var35 + 3;
                            int var77 = var76 * var85;
                            int var78 = var77 & 7;
                            if (var78 != 0) {
                                break label103;
                            }

                            if (var56 != 0) {
                                var35 -= 1066554006;
                                var35 ^= 264083933;
                                var35 -= -538581555;
                                var35 ^= -1213220576;
                                long var57 = var35;
                                var6 = var57 + 1L;
                                var6 = var57 * var6;
                                long var58 = var6 & 1L;
                                long var102;
                                var56 = (var102 = var58 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                                if (var56 != 0) {
                                    break label103;
                                }

                                JsonObject var60 = var0.getAsJsonObject();
                                var5 = var3;
                                var7 = var5 + 1L;
                                var7 = var5 * var7;
                                var9 = var5 + 2L;
                                var7 *= var9;
                                var5 += 3L;
                                var7 *= var5;
                                var5 = var7 & 7L;
                                long var103;
                                var3 = (var103 = var5 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                                if (var3 != 0) {
                                    switch (var35) {
                                        case -1822765885:
                                            var35 &= 1446406716;
                                            var35 >>>= 25;
                                            var35 ^= 1534068996;
                                            break label111;
                                        case -476540957:
                                            var35 ^= 1254012498;
                                            break label111;
                                        case -447444408:
                                        default:
                                            var35 ^= -1737642121;
                                            break label111;
                                    }
                                }
                                var35 = switch (var35) {
                                    case -1822765885 -> {
                                        var35 >>= 27;
                                        var35 &= -994579799;
                                        var35 += 263560919;
                                        var35 ^= 149071320;
                                        yield var35 ^ 1105177207;
                                    }
                                    case -396651102 -> var35 ^ -1039209739;
                                    default -> var35 ^ 591562436;
                                };
                                Integer var49 = var35;
                                if (var49 == null) {
                                    break label103;
                                }

                                var50 = var60;
                                switch (var35) {
                                    case -1655666984:
                                        var35 |= -795995043;
                                        var35 ^= -481171024;
                                        break label99;
                                    case -1610172559:
                                    default:
                                        var35 ^= 462906746;
                                        break label99;
                                    case 406629312:
                                        var35 ^= -548611289;
                                        break label99;
                                }
                            }

                            var35 &= -1733425275;
                            var35 *= 439124627;
                            var35 ^= -351563453;
                        } else {
                            var35 += -1330109345;
                            var35 ^= -558806231;
                        }

                        long var61 = var35;
                        var6 = var61 + 1L;
                        var6 = var61 * var6;
                        long var8 = var61 + 2L;
                        var6 *= var8;
                        long var62 = var61 + 3L;
                        var6 *= var62;
                        long var63 = var6 & 7L;
                        long var104;
                        var4 = (var104 = var63 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label103;
                        }

                        var50 = null;
                        switch (var35) {
                            case -2017077173:
                            default:
                                var35 ^= -980645319;
                                break;
                            case -1438977840:
                                var35 >>= 15;
                                var35 >>= 25;
                                var35 ^= -1049591662;
                                break;
                            case 1126326961:
                                var35 ^= -444544834;
                        }
                    }

                    var4 = var35 + 1;
                    var4 = var35 * var4;
                    int var82 = var35 + 2;
                    var4 *= var82;
                    var35 += 3;
                    var4 *= var35;
                    var35 = var4 & 7;
                    if (var35 == 0) {
                        return var50;
                    }
                    break label103;
                }
            }

            Integer var69 = var35;
            if (var69 != null) {
                AssertionError var70 = new AssertionError();
                throw var70;
            }
        }

        RuntimeException var47 = new RuntimeException();
        throw var47;
    }

    private static boolean Y(JsonElement var0, Object var1, int var2) {
        int var4 = System.identityHashCode(var0);
        Integer var5 = var4;
        if (var5 == null) {
            int var141 = var2 - -1870536497;
            var141 += 1972735244;
            var141 ^= 1521155723;
        } else {
            int var3 = var2 & 1743971888;
            var3 -= -1070721621;
            var3 ^= 1477710204;
            label223:
            if (var0 != null) {
                var3 = switch (var3) {
                    case -1423053560 -> var3 ^ -237460315;
                    default -> var3 ^ -1107206488;
                    case 1056980985 -> {
                        var3 &= 727552282;
                        var3 -= -1429267929;
                        yield var3 ^ 1245025097;
                    }
                };
                boolean var155 = var0.isJsonPrimitive();
                long var6 = var4;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var215;
                int var159 = (var215 = var6 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                if (var159 != 0) {
                    switch (var3) {
                        case -905615944:
                            var3 >>>= 16;
                            var3 *= 77622315;
                            var3 ^= -494799836;
                            break label223;
                        case 1482694767:
                        default:
                            var3 ^= 1292169672;
                            break label223;
                        case 2058636914:
                            var3 ^= -1988185938;
                    }
                } else {
                    var3 >>>= 21;
                    var3 ^= -627737010;
                    Integer var160 = var3;
                    label185:
                    if (var160 != null) {
                        if (!var155) {
                            switch (var3) {
                                case -1411264566:
                                default:
                                    var3 ^= 1368022205;
                                    return false;
                                case -759382038:
                                    var3 ^= 1587434402;
                                    return false;
                                case -627738594:
                                    var3 += -350239498;
                                    var3 *= -427781119;
                                    var3 ^= -1954867402;
                                    return false;
                            }
                        }

                        var3 ^= 541759895;
                        var3 -= -592211750;
                        var3 += -1033367532;
                        var3 ^= 609906514;
                        JsonPrimitive var156 = var0.getAsJsonPrimitive();
                        Integer var161 = var4;
                        if (var161 == null) {
                            switch (var3) {
                                case -993128559:
                                    var3 *= -158292133;
                                    var3 += 475987893;
                                    var3 ^= 1011962643;
                                    var3 ^= -403000672;
                                    break label223;
                                case -854452555:
                                default:
                                    var3 ^= -1933015572;
                                    break label223;
                                case 119175503:
                                    var3 ^= 658481754;
                                    break label223;
                            }
                        }

                        int var172;
                        var3 ^= -671840488;
                        var3 ^= -1999441107;
                        Object var162 = Objects.requireNonNull(var1);
                        var172 = (byte)0;
                        var172 = (var1 instanceof Number) ? 0 : ((var1 instanceof Boolean) ? 1 : -1);
                        label214:
                        switch (var172) {
                            case 0:
                                var3 *= -1519430301;
                                var3 &= -1686972563;
                                var3 ^= 1870803536;
                                var8 = var3;
                                long var205 = var8 + 1L;
                                var205 = var8 * var205;
                                long var12 = var8 + 2L;
                                var205 *= var12;
                                var8 += 3L;
                                var205 *= var8;
                                var8 = var205 & 7L;
                                long var216;
                                int var187 = (var216 = var8 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                                if (var187 != 0) {
                                    break label185;
                                }

                                Number var166 = (Number)var1;
                                int var188 = var4 + 1;
                                int var189 = var4 * var188;
                                int var190 = var189 & 1;
                                if (var190 != 0) {
                                    var3 *= 1499825369;
                                    var3 *= -708216099;
                                    var3 ^= -702487777;
                                    break label223;
                                }

                                var3 += -1215477782;
                                var3 ^= 1897800011;
                                var8 = var3;
                                var205 = var8 + 1L;
                                var205 = var8 * var205;
                                var8 = var205 & 1L;
                                long var217;
                                int var193 = (var217 = var8 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                                if (var193 != 0) {
                                    break label185;
                                }

                                boolean var194 = var156.isNumber();
                                if (var194) {
                                    var3 -= -107460280;
                                    var3 &= -1883221763;
                                    var3 ^= 63435213;
                                    double var195 = var156.getAsDouble();
                                    double var211 = var166.doubleValue();
                                    var12 = var4;
                                    long var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var12 = var14 & 1L;
                                    long var218;
                                    int var167 = (var218 = var12 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                                    if (var167 != 0) {
                                        var3 >>>= 5;
                                        var3 ^= 1254212604;
                                        break label223;
                                    }

                                    var3 <<= 19;
                                    var3 &= -1696581565;
                                    var3 -= -1284162975;
                                    var3 ^= -2100114860;
                                    Integer var168 = var3;
                                    if (var168 == null) {
                                        break label185;
                                    }

                                    double var196 = var195 - var211;
                                    double var197 = Math.abs(var196);
                                    double var219;
                                    int var169 = (var219 = var197 - 1.0E-5) == 0.0 ? 0 : (var219 < 0.0 ? -1 : 1);
                                    if (var169 < 0) {
                                        var3 ^= 1669814999;
                                        var3 *= 714921585;
                                        var3 += 1979889943;
                                        var3 ^= -476096291;
                                        Integer var170 = var3;
                                        if (var170 == null) {
                                            break label185;
                                        }

                                        var172 = 1;
                                        var3 -= 284448885;
                                        var3 ^= 968006437;
                                        break;
                                    }

                                    var3 *= -193176675;
                                    var3 ^= 1842577646;
                                } else {
                                    var3 -= -1825173595;
                                    var3 >>>= 21;
                                    var3 ^= -1352574393;
                                }

                                var172 = 0;
                                var3 ^= 1512588270;
                                var3 |= 1280423840;
                                var3 ^= 2113189603;
                                break;
                            case 1:
                                var3 ^= -1502504838;
                                var3 <<= 25;
                                var3 ^= 431697819;
                                Boolean var173 = (Boolean)var1;
                                boolean var179 = var156.isBoolean();
                                Integer var9 = var4;
                                if (var9 != null) {
                                    var3 = switch (var3) {
                                        case -1514459237 -> {
                                            var3 &= -459616084;
                                            var3 -= 1173539153;
                                            var3 *= -1257666729;
                                            yield var3 ^ -654463048;
                                        }
                                        case 1156120472 -> var3 ^ 733888677;
                                        default -> var3 ^ -381763902;
                                    };
                                    var9 = var3;
                                    if (var9 == null) {
                                        break label185;
                                    }

                                    if (var179) {
                                        var3 &= -2048756039;
                                        var3 <<= 21;
                                        var3 ^= 1289663820;
                                        var3 |= 518149802;
                                        var3 ^= 1038668827;
                                        int var180 = var3 + 1;
                                        int var181 = var3 * var180;
                                        int var182 = var181 & 1;
                                        if (var182 != 0) {
                                            break label185;
                                        }

                                        boolean var183 = var156.getAsBoolean();
                                        int var201 = var4 + 1;
                                        var201 = var4 * var201;
                                        var201 &= 1;
                                        if (var201 != 0) {
                                            var3 ^= -791852030;
                                            var3 ^= -1138323196;
                                            break label223;
                                        }
                                        var3 = switch (var3) {
                                            default -> var3 ^ -1280486425;
                                            case -1040649299 -> var3 ^ 461953264;
                                            case 571876341 -> {
                                                var3 |= -218094791;
                                                var3 += 495620170;
                                                yield var3 ^ -235746790;
                                            }
                                        };
                                        boolean var174 = var173;
                                        if (var183 == var174) {
                                            var3 *= 1875983401;
                                            var3 -= -1586836113;
                                            var3 ^= -1773971578;
                                            var172 = 1;
                                            var3 -= -1577823198;
                                            var3 &= -141561568;
                                            var3 ^= -1481893604;
                                            break;
                                        }

                                        switch (var3) {
                                            case -1791757563:
                                            default:
                                                var3 ^= 1975614780;
                                                break;
                                            case -1534403538:
                                                var3 ^= 2082868860;
                                                break;
                                            case -514687395:
                                                var3 -= 38270751;
                                                var3 ^= -553173648;
                                        }
                                    } else {
                                        var3 += -459176279;
                                        var3 |= 2145588742;
                                        var3 -= -735821158;
                                        var3 ^= 735448914;
                                    }

                                    var172 = 0;
                                    switch (var3) {
                                        case -615761687:
                                            var3 ^= -1302649077;
                                            break label214;
                                        case -331292266:
                                        default:
                                            var3 ^= 686738738;
                                            break label214;
                                        case 899662:
                                            var3 >>= 6;
                                            var3 ^= -2136129547;
                                            break label214;
                                    }
                                }

                                switch (var3) {
                                    case -1514459237:
                                        var3 *= 899861045;
                                        var3 += 2082013783;
                                        var3 ^= -760450732;
                                        var3 -= -1422685401;
                                        var3 ^= -167431712;
                                        break label223;
                                    case 130403578:
                                    default:
                                        var3 ^= -933692731;
                                        break label223;
                                    case 2128413460:
                                        var3 ^= -1564846992;
                                        break label223;
                                }
                            default:
                                label233: {
                                    var3 ^= 201373633;
                                    var3 *= 1029030113;
                                    var3 ^= 910341950;
                                    Integer var163 = var3;
                                    if (var163 == null) {
                                        break label185;
                                    }

                                    boolean var164 = var156.isString();
                                    var8 = var4;
                                    long var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var220;
                                    int var178 = (var220 = var8 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                                    if (var178 != 0) {
                                        var3 |= -1138604396;
                                        var3 |= -489315246;
                                        var3 += 664279448;
                                        var3 ^= 1768812388;
                                        break label223;
                                    }

                                    var3 &= 267714987;
                                    var3 ^= -1915329386;
                                    if (var164) {
                                        var3 *= 1897453167;
                                        var3 ^= 78492544;
                                        Integer var165 = var3;
                                        if (var165 == null) {
                                            break label185;
                                        }

                                        String var157 = var156.getAsString();
                                        Integer var145 = var4;
                                        if (var145 == null) {
                                            switch (var3) {
                                                case -476884749:
                                                    var3 <<= 10;
                                                    var3 ^= 62796531;
                                                    break label223;
                                                case 344432937:
                                                default:
                                                    var3 ^= -148057433;
                                                    break label223;
                                                case 425204152:
                                                    var3 ^= -1965966908;
                                                    break label223;
                                            }
                                        }

                                        var3 -= -1196247224;
                                        var3 |= -915093792;
                                        var3 -= 1469871687;
                                        var3 ^= 1369291207;
                                        String var146 = (String)var1;
                                        boolean var147 = var157.equalsIgnoreCase(var146);
                                        if (var147) {
                                            var3 -= -1620241125;
                                            var3 *= 1569646145;
                                            var3 &= -832785920;
                                            var3 &= 710914119;
                                            var3 ^= -23584120;
                                            var172 = 1;
                                            var3 &= -1098526832;
                                            var3 ^= 875367324;
                                            break label233;
                                        }

                                        var3 *= 63424601;
                                        var3 &= 536875546;
                                        var3 ^= -1813177624;
                                    } else {
                                        var3 &= 1352186736;
                                        var3 ^= -1284687406;
                                    }

                                    var4 = var3 + 1;
                                    var4 = var3 * var4;
                                    var4 &= 1;
                                    if (var4 != 0) {
                                        break label185;
                                    }

                                    var172 = 0;
                                    switch (var3) {
                                        case -1276307230:
                                            var3 += -1449510929;
                                            var3 ^= -584427059;
                                            break;
                                        case 226597858:
                                        default:
                                            var3 ^= -1020210625;
                                            break;
                                        case 391201192:
                                            var3 ^= 1126564406;
                                    }
                                }
                        }

                        long var151 = var3;
                        var8 = var151 + 1L;
                        var8 = var151 * var8;
                        long var152 = var8 & 1L;
                        long var221;
                        var4 = (var221 = var152 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            return (var172 != 0);
                        }
                    }

                    IllegalStateException var154 = new IllegalStateException();
                    throw var154;
                }
            } else {
                var3 &= 1151590877;
                var3 ^= -2139096069;
                return false;
            }
        }

        UnsupportedOperationException var144 = new UnsupportedOperationException();
        throw var144;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var6 = var0.lookupClass();
        int var1 = -2117903354;
        byte var2 = 0;
        int var7 = of_2.ro(var6, var1, var2);
        t = var7;
        Double var8 = 7.0;
        Double var13 = 0.65;
        Double var16 = 1.0;
        Map var9 = Map.of("style", "SPARKS", "amount", var8, "lifetime", var13, "size", var16, "color", "#FF8ABEFF");
        Double var14 = 0.22;
        Double var17 = 0.45;
        Map var15 = Map.of("size", var14, "lifetime", var17, "color", "#FF8ABEFF");
        Boolean var18 = true;
        Boolean var3 = true;
        Double var4 = 0.0;
        Map var19 = Map.of("banner", var18, "ring", var3, "flash", var4, "color", "#FF8ABEFF");
        Double var20 = 78.0;
        var4 = 34.0;
        Boolean var5 = false;
        Map var21 = Map.of("style", "GLASS", "offset_x", var20, "offset_y", var4, "on_look", var5);
        Map var10 = Map.of("hit_particles", var9, "hit_bubbles", var15, "kill_effect", var19, "target_hud", var21);
        F = var10;
        Boolean var11 = false;
        Map var12 = Map.of("hit_bubbles", var11);
        Kt = var12;
    }
}
