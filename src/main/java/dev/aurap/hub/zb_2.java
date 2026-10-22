package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class zb_2 {
    public static final int i = 5;
    private static final Map Q;
    public static final int DK;

    private zb_2() {
    }

    public static boolean A(JsonObject var0) {
        label162: {
            int var1 = DK;
            var1 ^= 1021621873;
            int var2 = System.identityHashCode(var0);
            JsonElement var3 = var0.get("schema");
            Integer var4 = var2;
            if (var4 == null) {
                var1 >>= 24;
                var1 &= -936950059;
                var1 ^= 1082077481;
            } else {
                label164: {
                    var1 &= -434031091;
                    var1 -= -183177181;
                    var1 ^= -2002735003;
                    long var119 = var1;
                    long var6 = var119 + 1L;
                    var6 = var119 * var6;
                    long var8 = var119 + 2L;
                    var6 *= var8;
                    long var120 = var119 + 3L;
                    var6 *= var120;
                    long var121 = var6 & 7L;
                    long var192;
                    int var122 = (var192 = var121 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                    if (var122 != 0) {
                        break label162;
                    }

                    if (var3 != null) {
                        var1 |= -741580529;
                        var1 -= 1867222598;
                        var1 += -1975945922;
                        var1 ^= 472841563;
                        var122 = var1 + 1;
                        var122 = var1 * var122;
                        var122 &= 1;
                        if (var122 != 0) {
                            break label162;
                        }

                        int var126 = (var3.isJsonPrimitive()) ? 1 : 0;
                        long var5 = var2;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var193;
                        int var151 = (var193 = var5 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                        if (var151 != 0) {
                            switch (var1) {
                                case -372894884:
                                default:
                                    var1 ^= -1989527114;
                                    break label164;
                                case -217667951:
                                    var1 ^= -1268243948;
                                    break label164;
                                case 311637468:
                                    var1 *= 1811881525;
                                    var1 <<= 29;
                                    var1 >>>= 16;
                                    var1 ^= -2007435272;
                                    break label164;
                            }
                        }

                        var1 >>= 29;
                        var1 += -626979961;
                        var1 ^= 149375443;
                        var1 -= -1869494829;
                        var1 ^= 800450620;
                        var5 = var1;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var194;
                        int var154 = (var194 = var5 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                        if (var154 != 0) {
                            break label162;
                        }

                        if (var126 != 0) {
                            var1 |= -2043206942;
                            var1 |= 1193273728;
                            var1 ^= -1848292214;
                            Integer var127 = var1;
                            if (var127 == null) {
                                break label162;
                            }

                            JsonPrimitive var128 = var3.getAsJsonPrimitive();
                            var5 = var2;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var195;
                            int var157 = (var195 = var5 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                            if (var157 != 0) {
                                switch (var1) {
                                    case -1801320679:
                                        var1 ^= -687741921;
                                        break label164;
                                    case 2129310581:
                                        var1 *= -1985020207;
                                        var1 *= 1899453573;
                                        var1 ^= -335905055;
                                        break label164;
                                    case 2140103534:
                                    default:
                                        var1 ^= -910461518;
                                        break label164;
                                }
                            }

                            var1 += 1678590382;
                              var126 = var128.isNumber() ? 1 : 0;
                            var126 = var128.isNumber() ? 1 : 0;
                            if (var126 != 0) {
                                var1 ^= 511427223;
                                var1 &= -1130896536;
                                var1 ^= 590817659;
                                var127 = var1;
                                if (var127 == null) {
                                    break label162;
                                }

                                int var109 = var3.getAsInt();
                                long var131 = var2;
                                var6 = var131 + 1L;
                                var6 = var131 * var6;
                                long var132 = var6 & 1L;
                                long var196;
                                var126 = (var196 = var132 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                                if (var126 != 0) {
                                    var1 -= -802611547;
                                    var1 &= -1281613073;
                                    var1 ^= -1420535938;
                                    break label164;
                                }

                                var1 ^= 135579187;
                                var1 ^= 759565055;
                                var1 ^= -425848509;
                                if (var109 >= 5) {
                                    var1 >>= 14;
                                    var1 -= 64945892;
                                    var1 ^= 252626223;
                                    var1 -= 935818777;
                                    var1 ^= 2136175109;
                                    Integer var110 = var1;
                                    if (var110 != null) {
                                        return false;
                                    }
                                    break label162;
                                }

                                switch (var1) {
                                    case -800098280:
                                    default:
                                        var1 ^= 1603044122;
                                        break;
                                    case -252094796:
                                        var1 -= -844205668;
                                        var1 |= -1258223606;
                                        var1 &= 1726312509;
                                        var1 ^= 2073812604;
                                        break;
                                    case 1722096474:
                                        var1 ^= -53300368;
                                }
                            } else {
                                var1 += -305014076;
                                var1 ^= -1495668255;
                            }
                        } else {
                            switch (var1) {
                                case -718875131:
                                default:
                                    var1 ^= -1614887968;
                                    break;
                                case 673150033:
                                    var1 ^= 517971873;
                                    break;
                                case 1845597373:
                                    var1 -= -626441102;
                                    var1 ^= -1544586128;
                                    var1 ^= 1835897439;
                            }
                        }
                    } else {
                        switch (var1) {
                            case -1528395002:
                                var1 ^= -2019915761;
                                break;
                            case -1474436002:
                            default:
                                var1 ^= 547931857;
                                break;
                            case 1649115524:
                                var1 &= -930693401;
                                var1 ^= 500711136;
                        }
                    }

                    Integer var111 = var1;
                    if (var111 == null) {
                        break label162;
                    }

                    var3 = var0.get("modules");
                    var122 = var2 + 1;
                    var122 = var2 * var122;
                    var122 &= 1;
                    if (var122 != 0) {
                        var1 >>= 14;
                        var1 -= -780696185;
                        var1 ^= -1496218085;
                    } else {
                        label172: {
                            var1 = switch (var1) {
                                case 378109086 -> var1 ^ -57447313;
                                default -> var1 ^ 834463293;
                                case 1574616676 -> {
                                    var1 |= 1462789779;
                                    var1 >>= 1;
                                    var1 ^= 1849338717;
                                    var1 |= -1545058950;
                                    yield var1 ^ -1977583180;
                                }
                            };
                            var122 = var1 + 1;
                            var122 = var1 * var122;
                            int var158 = var1 + 2;
                            var122 *= var158;
                            var158 = var1 + 3;
                            var122 *= var158;
                            var122 &= 7;
                            if (var122 != 0) {
                                break label162;
                            }

                            if (var3 != null) {
                                var1 <<= 18;
                                var1 ^= 877500303;
                                Integer var142 = var1;
                                if (var142 == null) {
                                    break label162;
                                }

                                boolean var143 = var3.isJsonObject();
                                var158 = var2 + 1;
                                var158 = var2 * var158;
                                var158 &= 1;
                                if (var158 != 0) {
                                    var1 += 1884533575;
                                    var1 ^= 2145467694;
                                    break label172;
                                }

                                var1 |= -2021427802;
                                var1 -= 1409557105;
                                var1 ^= 1353679564;
                                Integer var163 = var1;
                                if (var163 == null) {
                                    break label162;
                                }

                                if (var143) {
                                    var1 *= -298896295;
                                    var1 ^= -414527010;
                                    JsonObject var113 = var3.getAsJsonObject();
                                    Map var144 = Q;
                                    BiConsumer var114 = (var1x, var2x) -> {
                                        int var3x = DK;
                                        var3x ^= -395500641;
                                        int var4x = System.identityHashCode(var113);
                                        int var5x = var4x + 1;
                                        var5x = var4x * var5x;
                                        int var6x = var4x + 2;
                                        var5x *= var6x;
                                        var6x = var4x + 3;
                                        var5x *= var6x;
                                        var5x &= 7;
                                        if (var5x != 0) {
                                            var3x *= 562136005;
                                            var3x &= -1791326299;
                                            var3x ^= 2142963634;
                                            var3x *= -1708723913;
                                            var3x ^= 1959218053;
                                        } else {
                                            label115: {
                                                var3x |= -2132349142;
                                                var3x -= 172952066;
                                                var3x += -49311507;
                                                var3x ^= 618514305;
                                                long var84x = var3x;
                                                long var7x = var84x + 1L;
                                                var7x = var84x * var7x;
                                                long var9x = var84x + 2L;
                                                var7x *= var9x;
                                                long var85x = var84x + 3L;
                                                var7x *= var85x;
                                                long var86x = var7x & 7L;
                                                long var156x;
                                                var5x = (var156x = var86x - 0L) == 0L ? 0 : (var156x < 0L ? -1 : 1);
                                                label99:
                                                if (var5x == 0) {
                                                      JsonElement var88x = var113.get((String)var1x);
                                                    var6x = var3x << 27;
                                                    var6x += -506878467;
                                                    var6x <<= 6;
                                                    var6x ^= -1096648935;
                                                    JsonObject var89x = XJ(var88x, var6x);
                                                    JsonObject var102x;
                                                    if (var89x == null) {
                                                        var3x &= 1503181382;
                                                        var3x ^= -863958107;
                                                        var102x = null;
                                                        var3x ^= 2087715748;
                                                        var3x ^= 1859181927;
                                                    } else {
                                                        var3x = switch (var3x) {
                                                            case -2072690332 -> {
                                                                var3x -= -1270127507;
                                                                yield var3x ^ -1495572477;
                                                            }
                                                            default -> var3x ^ -1926792133;
                                                            case 1975173036 -> var3x ^ 1066459655;
                                                        };
                                                        Integer var130x = var3x;
                                                        if (var130x == null) {
                                                            break label99;
                                                        }

                                                        JsonElement var90x = var89x.get("settings");
                                                        int var131x = var3x * 84373215;
                                                        int var132x = var131x ^ 361003221;
                                                        JsonObject var91x = XJ(var90x, var132x);
                                                        var7x = var4x;
                                                        var9x = var7x + 1L;
                                                        var9x = var7x * var9x;
                                                        var7x = var9x & 1L;
                                                        long var157x;
                                                        int var135x = (var157x = var7x - 0L) == 0L ? 0 : (var157x < 0L ? -1 : 1);
                                                        if (var135x != 0) {
                                                            var3x -= 1101405579;
                                                            var3x ^= 595976882;
                                                            break label115;
                                                        }

                                                        var3x |= -1094744394;
                                                        var3x *= 409223989;
                                                        var3x ^= 4055581;
                                                        var3x ^= -379767871;
                                                        var3x ^= 2115988889;
                                                        var102x = var91x;
                                                        var3x -= 1400507084;
                                                        var3x |= -865600793;
                                                        var3x ^= 810954461;
                                                    }

                                                    var5x = var3x + 1;
                                                    var5x = var3x * var5x;
                                                    var5x &= 1;
                                                    if (var5x == 0) {
                                                        JsonObject var95x = var102x;
                                                        var6x = var4x + 1;
                                                        var6x = var4x * var6x;
                                                        int var136x = var4x + 2;
                                                        var6x *= var136x;
                                                        int var137x = var4x + 3;
                                                        var6x *= var137x;
                                                        var6x &= 7;
                                                        if (var6x != 0) {
                                                            switch (var3x) {
                                                                case -1415842722:
                                                                default:
                                                                    var3x ^= -916668686;
                                                                    break label115;
                                                                case -567159518:
                                                                    var3x -= 2105104068;
                                                                    var3x ^= 1987117957;
                                                                    break label115;
                                                                case -507279905:
                                                                    var3x ^= 1564284266;
                                                                    break label115;
                                                            }
                                                        }

                                                        var3x += 1724292233;
                                                        var3x >>= 30;
                                                        var3x += 883857157;
                                                        var3x &= 365795347;
                                                        var3x ^= 2033251660;
                                                        var6x = var3x + 1;
                                                        var6x = var3x * var6x;
                                                        int var138x = var3x + 2;
                                                        var6x *= var138x;
                                                        int var139x = var3x + 3;
                                                        var6x *= var139x;
                                                        var6x &= 7;
                                                        if (var6x == 0) {
                                                            if (var95x == null) {
                                                                var3x *= -901888585;
                                                                var3x |= 957693239;
                                                                var3x ^= 542314692;
                                                                var3x ^= -1501990993;
                                                                long var124x = var3x;
                                                                long var150x = var124x + 1L;
                                                                var150x = var124x * var150x;
                                                                long var125x = var150x & 1L;
                                                                long var158x;
                                                                var6x = (var158x = var125x - 0L) == 0L ? 0 : (var158x < 0L ? -1 : 1);
                                                                if (var6x == 0) {
                                                                    return;
                                                                }
                                                            } else {
                                                                var3x -= -2025857409;
                                                                var3x *= -30113415;
                                                                var3x ^= 1357882917;
                                                                var3x += -552635526;
                                                                var3x ^= 1312193374;
                                                                long var113x = var3x;
                                                                long var8x = var113x + 1L;
                                                                var8x = var113x * var8x;
                                                                long var10 = var113x + 2L;
                                                                var8x *= var10;
                                                                long var114x = var113x + 3L;
                                                                var8x *= var114x;
                                                                long var115x = var8x & 7L;
                                                                long var159x;
                                                                var6x = (var159x = var115x - 0L) == 0L ? 0 : (var159x < 0L ? -1 : 1);
                                                                label85:
                                                                if (var6x == 0) {
                                                                      Set var117x = ((JsonObject)var2x).entrySet();
                                                                    Stream var118x = var117x.stream();
                                                                    Integer var140x = var4x;
                                                                    if (var140x == null) {
                                                                        var3x += 1705637401;
                                                                        var3x += 115784824;
                                                                        var3x *= 203039497;
                                                                        var3x >>= 28;
                                                                        var3x ^= 382303710;
                                                                        break label115;
                                                                    }

                                                                    var3x <<= 13;
                                                                    var3x &= -73422125;
                                                                    var3x *= -1114999695;
                                                                    var3x ^= -973269722;
                                                                    Predicate var141x = var1xx -> {
                                                                        int var2xx = DK;
                                                                        var2xx ^= 1483505557;
                                                                        int var3xx = System.identityHashCode(var95x);
                                                                        long var19xx = var3xx;
                                                                        long var5xx = var19xx + 1L;
                                                                        var5xx = var19xx * var5xx;
                                                                        long var20xx = var5xx & 1L;
                                                                        long var36xx;
                                                                        var3xx = (var36xx = var20xx - 0L) == 0L ? 0 : (var36xx < 0L ? -1 : 1);
                                                                        if (var3xx != 0) {
                                                                            var2xx >>>= 16;
                                                                            var2xx -= -1415963894;
                                                                            var2xx += 138228558;
                                                                            var2xx *= 635065785;
                                                                            var2xx ^= 1348084704;
                                                                            long var22xx = var2xx;
                                                                            var5xx = var22xx + 1L;
                                                                            var5xx = var22xx * var5xx;
                                                                            long var23xx = var5xx & 1L;
                                                                            long var37xx;
                                                                            var3xx = (var37xx = var23xx - 0L) == 0L ? 0 : (var37xx < 0L ? -1 : 1);
                                                                            if (var3xx == 0) {
                                                                                RuntimeException var25xx = new RuntimeException();
                                                                                throw var25xx;
                                                                            }
                                                                        } else {
                                                                            var2xx -= -1218252329;
                                                                            var2xx -= -687345175;
                                                                            var2xx ^= -1091552424;
                                                                            var3xx = var2xx + 1;
                                                                            var3xx = var2xx * var3xx;
                                                                            var3xx &= 1;
                                                                            if (var3xx == 0) {
                                                                                  Object var30xx = ((Map.Entry)var1xx).getKey();
                                                                                String var31xx = (String)var30xx;
                                                                                JsonElement var32xx = var95x.get(var31xx);
                                                                                  Object var4xx = ((Map.Entry)var1xx).getValue();
                                                                                var2xx += -1899726926;
                                                                                var2xx <<= 28;
                                                                                var2xx ^= -1674641452;
                                                                                return BD(var32xx, var4xx, var2xx);
                                                                            }
                                                                        }

                                                                        RuntimeException var29xx = new RuntimeException();
                                                                        throw var29xx;
                                                                    };
                                                                      int var119x = var118x.allMatch(var141x) ? 1 : 0;
                                                                    if (var119x != 0) {
                                                                        var3x -= 1833150584;
                                                                        var3x ^= 27656895;
                                                                        long var120x = var3x;
                                                                        var8x = var120x + 1L;
                                                                        var8x = var120x * var8x;
                                                                        long var121x = var8x & 1L;
                                                                        long var160x;
                                                                        var119x = (var160x = var121x - 0L) == 0L ? 0 : (var160x < 0L ? -1 : 1);
                                                                        if (var119x != 0) {
                                                                            break label85;
                                                                        }

                                                                          Set var123x = ((JsonObject)var2x).keySet();
                                                                        Object var142x = Objects.requireNonNull(var95x);
                                                                          Consumer var96x = var96y2 -> var95x.remove((String)var96y2);
                                                                        var7x = var4x;
                                                                        var9x = var7x + 1L;
                                                                        var9x = var7x * var9x;
                                                                        var7x = var9x & 1L;
                                                                        long var161x;
                                                                        var4x = (var161x = var7x - 0L) == 0L ? 0 : (var161x < 0L ? -1 : 1);
                                                                        if (var4x != 0) {
                                                                            var3x |= -32402275;
                                                                            var3x ^= -369589434;
                                                                            break label115;
                                                                        }
                                                                        var3x = switch (var3x) {
                                                                            default -> var3x ^ -1109416254;
                                                                            case -1657704943 -> {
                                                                                var3x += -65826040;
                                                                                var3x ^= -1101280676;
                                                                                yield var3x ^ 277270620;
                                                                            }
                                                                            case -1290156290 -> var3x ^ 1644848569;
                                                                        };
                                                                        var123x.forEach(var96x);
                                                                        var3x ^= -1525934237;
                                                                        var3x ^= 936940700;
                                                                    } else {
                                                                        var3x |= 697072155;
                                                                        var3x &= 1877735585;
                                                                        var3x &= 1665460641;
                                                                        var3x ^= -2079526713;
                                                                    }

                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }

                                                IllegalArgumentException var79x = new IllegalArgumentException();
                                                throw var79x;
                                            }
                                        }

                                        IllegalStateException var77x = new IllegalStateException();
                                        throw var77x;
                                    };
                                    long var164 = var2;
                                    long var186 = var164 + 1L;
                                    var186 = var164 * var186;
                                    long var191 = var164 + 2L;
                                    var186 *= var191;
                                    long var165 = var164 + 3L;
                                    var186 *= var165;
                                    long var166 = var186 & 7L;
                                    long var197;
                                    int var167 = (var197 = var166 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                    if (var167 != 0) {
                                        var1 |= 745337036;
                                        var1 |= 976658817;
                                        var1 ^= 2007469061;
                                        break label172;
                                    }

                                    var1 *= -1585147595;
                                    var1 ^= 1226105324;
                                    var1 += 2010257658;
                                    var1 ^= 475577814;
                                    var144.forEach(var114);
                                    var1 *= -876569823;
                                    var1 ^= 2111140558;
                                } else {
                                    var1 <<= 10;
                                    var1 ^= 643991586;
                                }
                            } else {
                                var1 |= -1738331906;
                                var1 -= -954660561;
                                var1 ^= 636216301;
                            }

                            long var115 = var1;
                            long var168 = var115 + 1L;
                            long var169 = var115 * var168;
                            long var116 = var169 & 1L;
                            long var198;
                            int var117 = (var198 = var116 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                            if (var117 != 0) {
                                break label162;
                            }

                            Integer var118 = 5;
                            long var145 = var2;
                            var6 = var145 + 1L;
                            var6 = var145 * var6;
                            var8 = var145 + 2L;
                            var6 *= var8;
                            long var146 = var145 + 3L;
                            var6 *= var146;
                            long var147 = var6 & 7L;
                            long var199;
                            var2 = (var199 = var147 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                            if (var2 == 0) {
                                var1 -= -979969862;
                                var1 ^= -1173973181;
                                var1 ^= 1921190883;
                                var1 ^= 1878431117;
                                var2 = var1 + 1;
                                var2 = var1 * var2;
                                var122 = var1 + 2;
                                var2 *= var122;
                                var1 += 3;
                                var2 *= var1;
                                var1 = var2 & 7;
                                if (var1 == 0) {
                                    var0.addProperty("schema", var118);
                                    return true;
                                }
                                break label162;
                            }

                            var1 -= 2623291;
                            var1 ^= -1622323425;
                        }
                    }
                }
            }

            AssertionError var104 = new AssertionError();
            throw var104;
        }

        IllegalArgumentException var102 = new IllegalArgumentException();
        throw var102;
    }

    private static JsonObject XJ(JsonElement var0, int var1) {
        label92: {
            int var37;
            JsonObject var51;
            label96: {
                int var3 = System.identityHashCode(var0);
                long var4 = var3;
                long var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var87;
                int var55 = (var87 = var4 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                label89:
                if (var55 == 0) {
                    var37 = switch (var1) {
                        default -> var1 ^ 1518549915;
                        case -859109287 -> {
                            var37 = var1 - -637333645;
                            yield var37 ^ 1917582611;
                        }
                        case 1787983234 -> var1 ^ 1645022625;
                    };
                    if (var0 != null) {
                        var37 *= -1880113487;
                        var37 |= 816043297;
                        var37 += 268332407;
                        var37 >>>= 26;
                        var37 ^= 1573915141;
                        Integer var56 = var37;
                        if (var56 == null) {
                            break label92;
                        }

                        boolean var57 = var0.isJsonObject();
                        long var5 = var3;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var88;
                        int var71 = (var88 = var5 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                        if (var71 != 0) {
                            switch (var37) {
                                case -855080365:
                                    var37 ^= -1049318221;
                                    break label89;
                                case 1573915156:
                                    var37 |= 451002991;
                                    var37 &= -1422841038;
                                    var37 *= 358359647;
                                    var37 ^= 1866671690;
                                    break label89;
                                case 2064313529:
                                default:
                                    var37 ^= -1120615120;
                                    break label89;
                            }
                        }

                        var37 -= -1670989031;
                        var37 += -374029149;
                        var37 >>= 27;
                        var37 *= -1628688033;
                        var37 ^= -1569007478;
                        var5 = var37;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var89;
                        int var74 = (var89 = var5 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var74 != 0) {
                            break label92;
                        }

                        if (var57) {
                            var37 |= 1459256015;
                            var37 *= 821905133;
                            var37 ^= 1253128058;
                            JsonObject var58 = var0.getAsJsonObject();
                            int var75 = var3 + 1;
                            int var76 = var3 * var75;
                            int var49 = var76 & 1;
                            if (var49 == 0) {
                                var37 &= -1736490865;
                                var37 -= -1381935913;
                                var37 *= -404740041;
                                var37 ^= 1983099196;
                                Integer var50 = var37;
                                if (var50 == null) {
                                    break label92;
                                }

                                var51 = var58;
                                switch (var37) {
                                    case -1670044030:
                                        var37 *= -681280291;
                                        var37 ^= -1660266652;
                                        break label96;
                                    case -1361251710:
                                        var37 ^= 1032895523;
                                        break label96;
                                    case 144349740:
                                    default:
                                        var37 ^= 656609178;
                                        break label96;
                                }
                            }

                            var37 ^= 1550963609;
                            var37 ^= -2108701693;
                            var37 ^= -118996121;
                            break label89;
                        }

                        var37 |= -928203692;
                        var37 ^= -2114910079;
                    } else {
                        switch (var37) {
                            case -2138307083:
                                var37 &= 475554632;
                                var37 -= 936945907;
                                var37 ^= -2067685578;
                                var37 ^= 78672783;
                                break;
                            case -1804273615:
                                var37 ^= -1901735890;
                                break;
                            case -305211856:
                            default:
                                var37 ^= 407290755;
                        }
                    }

                    int var59 = var37 + 1;
                    int var60 = var37 * var59;
                    int var77 = var37 + 2;
                    int var61 = var60 * var77;
                    var77 = var37 + 3;
                    int var62 = var61 * var77;
                    int var63 = var62 & 7;
                    if (var63 != 0) {
                        break label92;
                    }

                    var51 = null;
                    switch (var37) {
                        case 1214166260:
                            var37 -= 356335213;
                            var37 ^= -1497753639;
                            break label96;
                        case 1378585490:
                        default:
                            var37 ^= 1648575701;
                            break label96;
                        case 1539470088:
                            var37 ^= -1075705802;
                            break label96;
                    }
                } else {
                    switch (var1) {
                        case -859109287:
                            var37 = var1 * -714084983;
                            var37 ^= 2113244527;
                            var37 |= 1657409715;
                            var37 ^= 1711872827;
                            break;
                        case -568042079:
                        default:
                            var37 = var1 ^ -1331537247;
                            break;
                        case -167969964:
                            var37 = var1 ^ 1094476861;
                    }
                }

                int var52 = var37 + 1;
                int var53 = var37 * var52;
                var37 = var53 & 1;
                if (var37 == 0) {
                    IllegalArgumentException var43 = new IllegalArgumentException();
                    throw var43;
                }
                break label92;
            }

            int var64 = var37 + 1;
            var64 = var37 * var64;
            int var79 = var37 + 2;
            var64 *= var79;
            var79 = var37 + 3;
            var64 *= var79;
            var64 &= 7;
            if (var64 == 0) {
                return var51;
            }
        }

        AssertionError var48 = new AssertionError();
        throw var48;
    }

    private static boolean BD(JsonElement var0, Object var1, int var2) {
        label128: {
            int var55;
            int var88;
            label137: {
                var88 = System.identityHashCode(var0);
                long var5 = var88;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var136;
                int var91 = (var136 = var5 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                if (var91 == 0) {
                    var55 = var2 & -1961447898;
                    var55 ^= 1341178096;
                    if (var0 == null) {
                        var55 *= 1472791065;
                        var55 -= -1721878293;
                        var55 ^= 1540831203;
                        return false;
                    }

                    var55 |= -2021213649;
                    var55 ^= -236469598;
                    var55 ^= 2001317499;
                    var55 ^= -1893520045;
                    boolean var92 = var0.isJsonPrimitive();
                    Integer var6 = var88;
                    if (var6 != null) {
                        var55 += 814512884;
                        var55 ^= 27034106;
                        long var106 = var55;
                        long var8 = var106 + 1L;
                        var8 = var106 * var8;
                        long var107 = var8 & 1L;
                        long var137;
                        int var108 = (var137 = var107 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                        if (var108 != 0) {
                            break label128;
                        }

                        if (!var92) {
                            var55 |= -685106382;
                            var55 ^= 330731777;
                            var55 ^= -738485832;
                            return false;
                        }
                        var55 = switch (var55) {
                            case -23807085 -> {
                                var55 -= -1764408274;
                                var55 |= 261647929;
                                yield var55 ^ -484215344;
                            }
                            default -> var55 ^ -1318365523;
                            case 1403917694 -> var55 ^ -489460086;
                        };
                        JsonPrimitive var93 = var0.getAsJsonPrimitive();
                        boolean var109 = var1 instanceof Number;
                        var7 = var88;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var138;
                        int var119 = (var138 = var7 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                        if (var119 != 0) {
                            var55 -= 1145159354;
                            var55 += 1204850131;
                            var55 ^= -1822076197;
                        } else {
                            label143: {
                                var55 = switch (var55) {
                                    case -1935930707 -> {
                                        var55 |= -2116475416;
                                        var55 -= -689176241;
                                        yield var55 ^ -200302549;
                                    }
                                    case -1384491972 -> var55 ^ 832796167;
                                    default -> var55 ^ -1230593110;
                                };
                                Integer var120 = var55;
                                if (var120 == null) {
                                    break label128;
                                }

                                if (var109) {
                                    var55 &= 1811518009;
                                    var55 >>>= 20;
                                    var55 <<= 29;
                                    var55 ^= 763975475;
                                    Integer var110 = var55;
                                    if (var110 == null) {
                                        break label128;
                                    }

                                    Number var111 = (Number)var1;
                                    var7 = var88;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    long var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var139;
                                    int var124 = (var139 = var7 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                    if (var124 != 0) {
                                        var55 &= 80558774;
                                        var55 ^= 130455855;
                                        break label143;
                                    }

                                    var55 &= -1993435758;
                                    var55 += 1971032674;
                                    var55 ^= -729023093;
                                    var55 ^= 1298472222;
                                    Integer var125 = var55;
                                    if (var125 == null) {
                                        break label128;
                                    }

                                    boolean var126 = var93.isNumber();
                                    if (var126) {
                                        var55 <<= 17;
                                        var55 ^= -63122164;
                                        Integer var127 = var55;
                                        if (var127 == null) {
                                            break label128;
                                        }

                                        double var128 = var93.getAsDouble();
                                        double var94 = var111.doubleValue();
                                        double var95 = var128 - var94;
                                        double var96 = Math.abs(var95);
                                        double var140;
                                        int var97 = (var140 = var96 - 1.0E-5) == 0.0 ? 0 : (var140 < 0.0 ? -1 : 1);
                                        Integer var82 = var88;
                                        if (var82 == null) {
                                            var55 *= -1683197889;
                                            var55 ^= 855046004;
                                            var55 *= -1352164723;
                                            var55 ^= 1342460829;
                                            break label143;
                                        }

                                        var55 += 1817499384;
                                        var55 |= -1081760392;
                                        var55 |= -2123859547;
                                        var55 &= 549685122;
                                        var55 ^= -233760577;
                                        if (var97 < 0) {
                                            var55 &= 500453294;
                                            var55 &= 357545660;
                                            var55 >>= 11;
                                            var55 ^= 661247672;
                                            int var83 = var55 + 1;
                                            var83 = var55 * var83;
                                            int var98 = var55 + 2;
                                            var83 *= var98;
                                            int var99 = var55 + 3;
                                            var83 *= var99;
                                            var83 &= 7;
                                            if (var83 != 0) {
                                                break label128;
                                            }

                                            var88 = 1;
                                            switch (var55) {
                                                case -326691479:
                                                    var55 ^= -2137945867;
                                                    break label137;
                                                case 661380792:
                                                    var55 >>>= 25;
                                                    var55 += 980371521;
                                                    var55 ^= -1095194088;
                                                    break label137;
                                                case 1653443438:
                                                default:
                                                    var55 ^= -526954906;
                                                    break label137;
                                            }
                                        }

                                        var55 -= 2011748834;
                                        var55 ^= -19707428;
                                    } else {
                                        var55 &= 886188953;
                                        var55 &= -193336284;
                                        var55 *= -81198267;
                                        var55 ^= 561678977;
                                    }
                                } else {
                                    var55 += -355990647;
                                    var55 <<= 18;
                                    var55 >>>= 6;
                                    var55 ^= -1525060991;
                                }

                                Integer var100 = var55;
                                if (var100 == null) {
                                    break label128;
                                }

                                var88 = 0;
                                var55 >>= 29;
                                var55 += 1002861779;
                                var55 -= -692896540;
                                var55 ^= -507193952;
                                break label137;
                            }
                        }
                    } else {
                        var55 |= 1405741629;
                        var55 ^= -1494556076;
                        var55 += 1367131970;
                        var55 ^= -910004362;
                    }
                } else {
                    switch (var2) {
                        case -715145321:
                        default:
                            var55 = var2 ^ -2121261104;
                            break;
                        case -62793137:
                            var55 = var2 ^ -1162564636;
                            break;
                        case 1546584020:
                            var55 = var2 - 1032935926;
                            var55 &= 806478052;
                            var55 &= 1852309982;
                            var55 -= -1447876225;
                            var55 ^= 1426283608;
                    }
                }

                Integer var73 = var55;
                if (var73 != null) {
                    RuntimeException var74 = new RuntimeException();
                    throw var74;
                }
                break label128;
            }

            int var101 = var55 + 1;
            var101 = var55 * var101;
            int var112 = var55 + 2;
            var101 *= var112;
            var112 = var55 + 3;
            var101 *= var112;
            var101 &= 7;
            if (var101 == 0) {
                return (var88 != 0);
            }
        }

        UnsupportedOperationException var78 = new UnsupportedOperationException();
        throw var78;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1323781744;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        DK = var4;
        Double var5 = 96.0;
        Double var8 = 44.0;
        Map var6 = Map.of("offset_x", var5, "offset_y", var8);
        Map var7 = Map.of("target_hud", var6);
        Q = var7;
    }
}
