package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public final class FS {
    public static final int wx = 2;
    private static final Map o;
    public static final int L;

    private FS() {
    }

    public static boolean Dk(JsonObject var0) {
        int var1 = L;
        var1 ^= -2109942973;
        int var2 = System.identityHashCode(var0);
        JsonElement var3 = var0.get("schema");
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var5 = var2 + 3;
        var4 *= var5;
        var4 &= 7;
        var5 = of_2.GI;
        var1 ^= var5;
        var1 ^= 970741366;
        var5 = of_2.t;
        var1 ^= var5;
        var1 ^= -1202142587;
        if (var4 != 0) {
            var1 |= -2043311634;
            var1 -= 1023607652;
            var1 ^= 927847787;
        } else {
            label198: {
                var1 ^= -1291368825;
                var1 ^= -717949877;
                long var133 = var1;
                long var6 = var133 + 1L;
                var6 = var133 * var6;
                long var8 = var133 + 2L;
                var6 *= var8;
                long var134 = var133 + 3L;
                var6 *= var134;
                long var135 = var6 & 7L;
                long var201;
                var4 = (var201 = var135 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                label182:
                if (var4 == 0) {
                    if (var3 != null) {
                        var1 += 1907859513;
                        var1 ^= 419019312;
                        var1 ^= -909749103;
                        Integer var137 = var1;
                        if (var137 == null) {
                            break label182;
                        }

                        boolean var138 = var3.isJsonPrimitive();
                        Integer var168 = var2;
                        if (var168 == null) {
                            var1 ^= 1116350088;
                            var1 >>= 12;
                            var1 |= 355573747;
                            var1 ^= -1291681253;
                            break label198;
                        }

                        var1 *= 171584309;
                        var1 ^= 1176663591;
                        var1 >>>= 3;
                        var1 -= 1346839806;
                        var1 ^= 1100797799;
                        var168 = var1;
                        if (var168 == null) {
                            break label182;
                        }

                        if (var138) {
                            var1 ^= -1654427857;
                            var1 ^= 1637045551;
                            long var139 = var1;
                            var6 = var139 + 1L;
                            var6 = var139 * var6;
                            long var140 = var6 & 1L;
                            long var202;
                            int var141 = (var202 = var140 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                            if (var141 != 0) {
                                break label182;
                            }

                            JsonPrimitive var142 = var3.getAsJsonPrimitive();
                            var168 = var2;
                            if (var168 == null) {
                                var1 -= 1865867215;
                                var1 += -201311753;
                                var1 ^= -121866299;
                                var1 ^= -1522201967;
                                break label198;
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ -297794897;
                                case 1972381404 -> var1 ^ -1408537130;
                                case 1996416652 -> {
                                    var1 ^= -307214222;
                                    yield var1 ^ -1157354569;
                                }
                            };
                            int var171 = var1 + 1;
                            var171 = var1 * var171;
                            int var192 = var1 + 2;
                            var171 *= var192;
                            int var193 = var1 + 3;
                            var171 *= var193;
                            var171 &= 7;
                            if (var171 != 0) {
                                break label182;
                            }

                            int var143 = (var142.isNumber()) ? 1 : 0;
                            if (var143 != 0) {
                                var1 += -459120851;
                                var1 ^= 995146026;
                                Integer var144 = var1;
                                if (var144 == null) {
                                    break label182;
                                }

                                int var114 = var3.getAsInt();
                                var144 = var2;
                                if (var144 == null) {
                                    var1 ^= -125504470;
                                    var1 ^= 85577664;
                                    var1 *= 227440559;
                                    var1 ^= -726209142;
                                    break label198;
                                }

                                var1 -= -1309801122;
                                var1 ^= 1322679892;
                                var1 >>>= 3;
                                var1 ^= -1232440095;
                                var143 = var1 + 1;
                                int var147 = var1 * var143;
                                var171 = var1 + 2;
                                var147 *= var171;
                                var171 = var1 + 3;
                                var147 *= var171;
                                var147 &= 7;
                                if (var147 != 0) {
                                    break label182;
                                }

                                if (var114 >= 2) {
                                    var1 ^= 1822276896;
                                    var1 |= -313445670;
                                    var1 += -74324109;
                                    var1 ^= -562559488;
                                    int var115 = var1 + 1;
                                    int var116 = var1 * var115;
                                    int var117 = var116 & 1;
                                    if (var117 == 0) {
                                        return false;
                                    }
                                    break label182;
                                }

                                switch (var1) {
                                    case -1360432684:
                                        var1 ^= -462448162;
                                        var1 *= 2043964791;
                                        var1 ^= 1522747254;
                                        break;
                                    case -967844856:
                                    default:
                                        var1 ^= -1596205125;
                                        break;
                                    case 738160565:
                                        var1 ^= 748295379;
                                }
                            } else {
                                switch (var1) {
                                    case -1766219113:
                                    default:
                                        var1 ^= -1334949948;
                                        break;
                                    case 541754697:
                                        var1 |= -1576925682;
                                        var1 ^= 256106143;
                                        break;
                                    case 718674984:
                                        var1 ^= 731142760;
                                }
                            }
                        } else {
                            switch (var1) {
                                case -1978737524:
                                    var1 |= -1006167106;
                                    var1 |= -1747343795;
                                    var1 ^= 1926669871;
                                    break;
                                case 651063737:
                                default:
                                    var1 ^= 966008395;
                                    break;
                                case 705028660:
                                    var1 ^= 1639532206;
                            }
                        }
                    } else {
                        var1 &= -1335302673;
                        var1 ^= -1922983595;
                    }

                    int var118 = var1 + 1;
                    int var119 = var1 * var118;
                    var4 = var1 + 2;
                    int var120 = var119 * var4;
                    var4 = var1 + 3;
                    int var121 = var120 * var4;
                    int var122 = var121 & 7;
                    label156:
                    if (var122 == 0) {
                        var3 = var0.get("modules");
                        Integer var153 = var2;
                        if (var153 == null) {
                            switch (var1) {
                                case -1391896112:
                                    var1 ^= -681781263;
                                    var1 ^= -597380159;
                                    break label198;
                                case 391685080:
                                default:
                                    var1 ^= -865445217;
                                    break label198;
                                case 1846640425:
                                    var1 ^= -317154494;
                                    break label198;
                            }
                        }

                        var1 <<= 25;
                        var1 ^= -2140262854;
                        var1 ^= -988404252;
                        if (var3 != null) {
                            var1 += 769962286;
                            var1 &= 1046191886;
                            var1 &= -955913870;
                            var1 |= -654425474;
                            var1 ^= -776145910;
                            int var154 = var1 + 1;
                            var154 = var1 * var154;
                            var154 &= 1;
                            if (var154 != 0) {
                                break label156;
                            }

                            int var157 = (var3.isJsonObject()) ? 1 : 0;
                            Integer var178 = var2;
                            if (var178 == null) {
                                switch (var1) {
                                    case -1106768682:
                                        var1 ^= 1722367624;
                                        break label198;
                                    case 188890996:
                                        var1 ^= -13423367;
                                        var1 ^= 1379937901;
                                        break label198;
                                    case 317416231:
                                    default:
                                        var1 ^= -1392724232;
                                        break label198;
                                }
                            }

                            var1 >>>= 15;
                            var1 ^= 1127870642;
                            var1 <<= 3;
                            var1 ^= -1896322823;
                            var1 ^= -921030744;
                            if (var157 != 0) {
                                var1 = switch (var1) {
                                    case -599353867 -> var1 ^ -230941032;
                                    default -> var1 ^ 528102071;
                                    case 1580037857 -> {
                                        var1 ^= 1671845958;
                                        var1 |= -2114904595;
                                        var1 += -1273144195;
                                        yield var1 ^ -1815712561;
                                    }
                                };
                                var157 = var1 + 1;
                                var157 = var1 * var157;
                                var157 &= 1;
                                if (var157 != 0) {
                                    break label156;
                                }

                                Map var161 = o;
                                final JsonElement modules = var3;
                                BiConsumer var124 = (var1x, var2x) -> {
                                    label118: {
                                        int var3x = L;
                                        var3x ^= 1616606585;
                                        int var4x = System.identityHashCode(modules);
                                        JsonObject var5x = modules.getAsJsonObject();
                                        JsonElement var83x = var5x.get((String)var1x);
                                        long var6x = var4x;
                                        long var8x = var6x + 1L;
                                        var8x = var6x * var8x;
                                        long var10x = var6x + 2L;
                                        var8x *= var10x;
                                        var6x += 3L;
                                        var8x *= var6x;
                                        var6x = var8x & 7L;
                                        long var141x;
                                        int var91x = (var141x = var6x - 0L) == 0L ? 0 : (var141x < 0L ? -1 : 1);
                                        if (var91x != 0) {
                                            switch (var3x) {
                                                case -1438792589:
                                                    var3x &= 1062294696;
                                                    var3x &= -437811735;
                                                    var3x *= 537946987;
                                                    var3x -= -1108989596;
                                                    var3x ^= -1793140367;
                                                    break;
                                                case -1372304305:
                                                default:
                                                    var3x ^= 219697293;
                                                    break;
                                                case -1077391580:
                                                    var3x ^= 1469158230;
                                            }
                                        } else {
                                            label117: {
                                                var3x *= 409645633;
                                                var3x ^= 1793511578;
                                                var3x += 2092261826;
                                                var3x ^= 1527285780;
                                                var6x = var3x;
                                                var8x = var6x + 1L;
                                                var8x = var6x * var8x;
                                                var6x = var8x & 1L;
                                                long var142x;
                                                int var94x = (var142x = var6x - 0L) == 0L ? 0 : (var142x < 0L ? -1 : 1);
                                                if (var94x != 0) {
                                                    break label118;
                                                }

                                                if (var83x != null) {
                                                    var3x >>>= 7;
                                                    var3x += 698000533;
                                                    var3x >>= 28;
                                                    var3x ^= 2134507220;
                                                    var6x = var3x;
                                                    var8x = var6x + 1L;
                                                    var8x = var6x * var8x;
                                                    var6x = var8x & 1L;
                                                    long var143x;
                                                    int var97x = (var143x = var6x - 0L) == 0L ? 0 : (var143x < 0L ? -1 : 1);
                                                    if (var97x != 0) {
                                                        break label118;
                                                    }

                                                    boolean var98x = var83x.isJsonObject();
                                                    long var7 = var4x;
                                                    long var9 = var7 + 1L;
                                                    var9 = var7 * var9;
                                                    long var11x = var7 + 2L;
                                                    var9 *= var11x;
                                                    var7 += 3L;
                                                    var9 *= var7;
                                                    var7 = var9 & 7L;
                                                    long var144x;
                                                    int var119x = (var144x = var7 - 0L) == 0L ? 0 : (var144x < 0L ? -1 : 1);
                                                    if (var119x != 0) {
                                                        var3x |= 866606006;
                                                        var3x *= -1359396435;
                                                        var3x &= 1087329428;
                                                        var3x ^= -1004375399;
                                                        break label117;
                                                    }

                                                    var3x += 1223318683;
                                                    var3x ^= 345559585;
                                                    var3x &= -1861832817;
                                                    var3x += 364319069;
                                                    var3x ^= -1030429932;
                                                    if (var98x) {
                                                        var3x += 880717713;
                                                        var3x += 1568573071;
                                                        var3x ^= 1561387871;
                                                        var5x = var83x.getAsJsonObject();
                                                        JsonElement var85x = var5x.get("settings");
                                                        int var99x = var4x + 1;
                                                        int var100x = var4x * var99x;
                                                        int var101x = var100x & 1;
                                                        if (var101x != 0) {
                                                            var3x &= -1103532725;
                                                            var3x ^= 2004664499;
                                                            var3x -= -56101753;
                                                            var3x ^= 314420903;
                                                            break label117;
                                                        }
                                                        var3x = switch (var3x) {
                                                            default -> var3x ^ 567841702;
                                                            case -1806294721 -> var3x ^ -574865245;
                                                            case -1539552202 -> {
                                                                var3x *= -570930615;
                                                                yield var3x ^ -1390657231;
                                                            }
                                                        };
                                                        if (var85x != null) {
                                                            var3x = switch (var3x) {
                                                                case 412423767 -> {
                                                                    var3x -= 262534198;
                                                                    yield var3x ^ -696812144;
                                                                }
                                                                default -> var3x ^ -1695592953;
                                                                case 1230601111 -> var3x ^ -1710438345;
                                                            };
                                                            var6x = var3x;
                                                            var8x = var6x + 1L;
                                                            var8x = var6x * var8x;
                                                            var10x = var6x + 2L;
                                                            var8x *= var10x;
                                                            var6x += 3L;
                                                            var8x *= var6x;
                                                            var6x = var8x & 7L;
                                                            long var145x;
                                                            int var105x = (var145x = var6x - 0L) == 0L ? 0 : (var145x < 0L ? -1 : 1);
                                                            if (var105x != 0) {
                                                                break label118;
                                                            }

                                                            boolean var106x = var85x.isJsonObject();
                                                            int var120x = var4x + 1;
                                                            int var121x = var4x * var120x;
                                                            int var122x = var121x & 1;
                                                            if (var122x != 0) {
                                                                var3x >>= 1;
                                                                var3x ^= 728570197;
                                                                break label117;
                                                            }

                                                            var3x -= -68193665;
                                                            var3x ^= -673309203;
                                                            var3x ^= -1635952145;
                                                            Integer var123x = var3x;
                                                            if (var123x == null) {
                                                                break label118;
                                                            }

                                                            if (var106x) {
                                                                var3x *= -495449741;
                                                                var3x ^= -1214768514;
                                                                var5x = var85x.getAsJsonObject();
                                                                final JsonObject settings = var5x;
                                                                BiConsumer var88x = (var1xx, var2xx) -> {
                                                                    label62: {
                                                                        int var3xx = L;
                                                                        var3xx ^= 469981780;
                                                                        int var4xx = System.identityHashCode(settings);
                                                                        int var5xx = var4xx + 1;
                                                                        var5xx = var4xx * var5xx;
                                                                        var5xx &= 1;
                                                                        if (var5xx == 0) {
                                                                            var3xx &= -764100540;
                                                                            var3xx -= 1534775571;
                                                                            var3xx ^= -1576126049;
                                                                            var5xx = var3xx + 1;
                                                                            var5xx = var3xx * var5xx;
                                                                            var5xx &= 1;
                                                                            if (var5xx != 0) {
                                                                                break label62;
                                                                            }

                                                                            JsonElement var67xx = settings.get((String)var1xx);
                                                                            if (var67xx == null) {
                                                                                var3xx *= -1778691127;
                                                                                var3xx ^= -66885317;
                                                                                return;
                                                                            }

                                                                            var3xx &= -515276416;
                                                                            var3xx ^= 564067201;
                                                                            Integer var6xx = var3xx;
                                                                            if (var6xx == null) {
                                                                                break label62;
                                                                            }

                                                                            boolean var69xx = var67xx.isJsonPrimitive();
                                                                            long var7x = var4xx;
                                                                            long var9x = var7x + 1L;
                                                                            var9x = var7x * var9x;
                                                                            long var11xx = var7x + 2L;
                                                                            var9x *= var11xx;
                                                                            var7x += 3L;
                                                                            var9x *= var7x;
                                                                            var7x = var9x & 7L;
                                                                            long var79xx;
                                                                            int var75xx = (var79xx = var7x - 0L) == 0L ? 0 : (var79xx < 0L ? -1 : 1);
                                                                            if (var75xx != 0) {
                                                                                var3xx |= -637079193;
                                                                                var3xx <<= 15;
                                                                                var3xx |= -1670020084;
                                                                                var3xx >>= 4;
                                                                                var3xx ^= -1044854365;
                                                                            } else {
                                                                                var3xx &= 802364715;
                                                                                var3xx ^= -69616680;
                                                                                if (!var69xx) {
                                                                                    var3xx -= 1783436642;
                                                                                    var3xx <<= 31;
                                                                                    var3xx ^= 1798869413;
                                                                                    return;
                                                                                }

                                                                                var3xx <<= 25;
                                                                                var3xx ^= 1460693964;
                                                                                int var70xx = var3xx + 1;
                                                                                var70xx = var3xx * var70xx;
                                                                                var70xx &= 1;
                                                                                if (var70xx != 0) {
                                                                                    break label62;
                                                                                }

                                                                                JsonPrimitive var68xx = var67xx.getAsJsonPrimitive();
                                                                                Integer var53xx = var4xx;
                                                                                if (var53xx != null) {
                                                                                    var3xx *= 316885317;
                                                                                    var3xx ^= 565808405;
                                                                                    int var54xx = var3xx + 1;
                                                                                    var54xx = var3xx * var54xx;
                                                                                    var54xx &= 1;
                                                                                    if (var54xx != 0) {
                                                                                        break label62;
                                                                                    }

                                                                                    var54xx = var3xx + 1761582533;
                                                                                    var54xx *= -207675129;
                                                                                    var54xx ^= 1582972670;
                                                                                    boolean var60xx = Tc(var68xx, var2xx, var54xx);
                                                                                    if (var60xx) {
                                                                                        var3xx >>= 4;
                                                                                        var3xx -= -819491813;
                                                                                        var3xx |= 1889953214;
                                                                                        var3xx += -1821562917;
                                                                                        var3xx ^= -1356222348;
                                                                                        JsonElement var61xx = settings.remove((String)var1xx);
                                                                                        var3xx *= -1684819613;
                                                                                        var3xx ^= -1097666897;
                                                                                    } else {
                                                                                        var3xx ^= -217157033;
                                                                                        var3xx -= -230110739;
                                                                                        var3xx -= 1133294657;
                                                                                        var3xx |= 1131920445;
                                                                                        var3xx ^= -1194365672;
                                                                                    }

                                                                                    return;
                                                                                }

                                                                                var3xx ^= 1403167210;
                                                                                var3xx ^= -1999275067;
                                                                            }
                                                                        } else {
                                                                            var3xx -= 1244608468;
                                                                            var3xx ^= -696723455;
                                                                            var3xx ^= 1680464488;
                                                                        }

                                                                        Integer var50xx = var3xx;
                                                                        if (var50xx != null) {
                                                                            IllegalStateException var52xx = new IllegalStateException();
                                                                            throw var52xx;
                                                                        }
                                                                    }

                                                                    IllegalStateException var51xx = new IllegalStateException();
                                                                    throw var51xx;
                                                                };
                                                                int var107x = var4x + 1;
                                                                int var108x = var4x * var107x;
                                                                int var124x = var4x + 2;
                                                                int var109x = var108x * var124x;
                                                                var4x += 3;
                                                                int var110x = var109x * var4x;
                                                                var4x = var110x & 7;
                                                                if (var4x == 0) {
                                                                    var3x += 702298206;
                                                                    var3x >>>= 25;
                                                                    var3x ^= -923306326;
                                                                    Integer var72x = var3x;
                                                                    if (var72x != null) {
                                                                        ((Map)var2x).forEach(var88x);
                                                                        return;
                                                                    }
                                                                    break label118;
                                                                }

                                                                var3x |= -1047921770;
                                                                var3x ^= 530500979;
                                                                break label117;
                                                            }

                                                            var3x |= 361653533;
                                                            var3x |= 212589762;
                                                            var3x *= 713823853;
                                                            var3x *= -1676343713;
                                                            var3x ^= -1722074883;
                                                        } else {
                                                            var3x |= -449697275;
                                                            var3x &= -523321104;
                                                            var3x -= 317528276;
                                                            var3x ^= 905388734;
                                                            var3x ^= -1074805582;
                                                        }

                                                        long var73x = var3x;
                                                        var6x = var73x + 1L;
                                                        var6x = var73x * var6x;
                                                        var8x = var73x + 2L;
                                                        var6x *= var8x;
                                                        long var74x = var73x + 3L;
                                                        var6x *= var74x;
                                                        long var75x = var6x & 7L;
                                                        long var146x;
                                                        var4x = (var146x = var75x - 0L) == 0L ? 0 : (var146x < 0L ? -1 : 1);
                                                        if (var4x == 0) {
                                                            return;
                                                        }
                                                        break label118;
                                                    }

                                                    switch (var3x) {
                                                        case -1770668098:
                                                            var3x ^= 1259916805;
                                                            break;
                                                        case -1386141693:
                                                        default:
                                                            var3x ^= -772112066;
                                                            break;
                                                        case 1731164489:
                                                            var3x += -820735472;
                                                            var3x ^= 170441605;
                                                            var3x ^= -986888966;
                                                    }
                                                } else {
                                                    var3x >>>= 8;
                                                    var3x ^= -108573753;
                                                }

                                                var4x = var3x + 1;
                                                var4x = var3x * var4x;
                                                var3x = var4x & 1;
                                                if (var3x == 0) {
                                                    return;
                                                }
                                                break label118;
                                            }
                                        }

                                        long var79x = var3x;
                                        var6x = var79x + 1L;
                                        var6x = var79x * var6x;
                                        long var80x = var6x & 1L;
                                        long var147x;
                                        var4x = (var147x = var80x - 0L) == 0L ? 0 : (var147x < 0L ? -1 : 1);
                                        if (var4x == 0) {
                                            IllegalStateException var82x = new IllegalStateException();
                                            throw var82x;
                                        }
                                    }

                                    IllegalStateException var69x = new IllegalStateException();
                                    throw var69x;
                                };
                                var178 = var2;
                                if (var178 == null) {
                                    var1 -= -1091330344;
                                    var1 ^= -2066060245;
                                    break label198;
                                }

                                var1 += -1401875684;
                                var1 += 1676056305;
                                var1 <<= 3;
                                var1 ^= -1614487884;
                                int var180 = var1 + 1;
                                var180 = var1 * var180;
                                int var194 = var1 + 2;
                                var180 *= var194;
                                int var195 = var1 + 3;
                                var180 *= var195;
                                var180 &= 7;
                                if (var180 != 0) {
                                    break label156;
                                }

                                var161.forEach(var124);
                                switch (var1) {
                                    case -1623791783:
                                        var1 ^= -1589610114;
                                        break;
                                    case 242223924:
                                        var1 |= 1720564383;
                                        var1 ^= -353984997;
                                        break;
                                    case 1527456439:
                                    default:
                                        var1 ^= 1839610323;
                                }
                            } else {
                                var1 -= 335657203;
                                var1 += -1294313313;
                                var1 -= 155477547;
                                var1 ^= 2010813894;
                            }
                        } else {
                            var1 *= -1944226713;
                            var1 ^= -794703759;
                            var1 &= 449571850;
                            var1 ^= -1940282970;
                        }

                        long var125 = var1;
                        long var185 = var125 + 1L;
                        long var186 = var125 * var185;
                        long var126 = var186 & 1L;
                        long var203;
                        int var127 = (var203 = var126 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                        if (var127 == 0) {
                            Integer var128 = 2;
                            long var162 = var2;
                            var6 = var162 + 1L;
                            var6 = var162 * var6;
                            var8 = var162 + 2L;
                            var6 *= var8;
                            long var163 = var162 + 3L;
                            var6 *= var163;
                            long var164 = var6 & 7L;
                            long var204;
                            var2 = (var204 = var164 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                switch (var1) {
                                    case -2078595676:
                                        var1 -= 1842439146;
                                        var1 <<= 12;
                                        var1 ^= -456597253;
                                        var1 ^= -555582181;
                                        break label198;
                                    case -662454046:
                                        var1 ^= 1910331993;
                                        break label198;
                                    case 949499026:
                                    default:
                                        var1 ^= 1932356871;
                                        break label198;
                                }
                            }

                            var1 |= 1098313977;
                            var1 ^= 578122709;
                            var2 = var1 + 1;
                            var2 = var1 * var2;
                            var2 &= 1;
                            if (var2 == 0) {
                                var0.addProperty("schema", var128);
                                return true;
                            }
                        }
                    }
                }

                IllegalArgumentException var113 = new IllegalArgumentException();
                throw var113;
            }
        }

        IllegalArgumentException var108 = new IllegalArgumentException();
        throw var108;
    }

    private static boolean Tc(JsonPrimitive var0, Object var1, int var2) {
        boolean var156 = false;
        boolean var177 = false;
        boolean var188 = false;
        int var4 = System.identityHashCode(var0);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var5 &= 1;
        if (var5 != 0) {
            int var145 = var2 - -2092338409;
            var145 += 543150259;
            var145 ^= -1718453699;
        } else {
            label230: {
                int var3 = var2 << 17;
                var3 |= -1671753594;
                var3 += 1400707727;
                var3 ^= 1867967956;
                Integer var160 = var3;
                if (var160 != null) {
                    boolean var161 = var1 instanceof Number;
                    if (var161) {
                        var3 = switch (var3) {
                            case -2136029503 -> {
                                var3 += -1826505658;
                                var3 ^= -1519653675;
                                var3 ^= -514677631;
                                yield var3 ^ -430341148;
                            }
                            default -> var3 ^ -1607784917;
                            case 2059774911 -> var3 ^ -161551255;
                        };
                        long var178 = var3;
                        long var244 = var178 + 1L;
                        var244 = var178 * var244;
                        long var179 = var244 & 1L;
                        long var288;
                        int var180 = (var288 = var179 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                        label160:
                        if (var180 == 0) {
                            Number var181 = (Number)var1;
                            long var221 = var4;
                            long var272 = var221 + 1L;
                            var272 = var221 * var272;
                            long var286 = var221 + 2L;
                            var272 *= var286;
                            var221 += 3L;
                            var272 *= var221;
                            var221 = var272 & 7L;
                            long var289;
                            int var224 = (var289 = var221 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                            if (var224 != 0) {
                                var3 += 460732872;
                                var3 >>= 22;
                                var3 ^= -1282380079;
                                break label230;
                            }

                            label217: {
                                var3 += 97202587;
                                var3 |= -560639646;
                                var3 ^= -248781255;
                                var3 *= 1774250099;
                                var3 ^= 197124497;
                                boolean var225 = var0.isNumber();
                                if (var225) {
                                    var3 *= -1844801655;
                                    var3 <<= 31;
                                    var3 |= -423255601;
                                    var3 |= -953824057;
                                    var3 ^= -19009642;
                                    Integer var226 = var3;
                                    if (var226 == null) {
                                        break label160;
                                    }

                                    double var227 = var0.getAsDouble();
                                    double var276 = var181.doubleValue();
                                    double var182 = var227 - var276;
                                    Integer var246 = var4;
                                    if (var246 == null) {
                                        var3 >>>= 2;
                                        var3 <<= 15;
                                        var3 ^= 1277465061;
                                        break label230;
                                    }

                                    var3 *= -1260082247;
                                    var3 &= -278157084;
                                    var3 ^= -1924491056;
                                    double var183 = Math.abs(var182);
                                    double var290;
                                    var180 = (var290 = var183 - 1.0E-5) == 0.0 ? 0 : (var290 < 0.0 ? -1 : 1);
                                    if (var180 < 0) {
                                        var3 -= -2101258480;
                                        var3 |= -786379747;
                                        var3 ^= 1680671809;
                                        long var185 = var3;
                                        var244 = var185 + 1L;
                                        var244 = var185 * var244;
                                        long var186 = var244 & 1L;
                                        long var291;
                                        var180 = (var291 = var186 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                                        if (var180 != 0) {
                                            break label160;
                                        }

                                        var188 = true;
                                        var3 &= -978382404;
                                        var3 &= 2094469050;
                                        var3 -= -281309528;
                                        var3 ^= 1322594451;
                                        break label217;
                                    }

                                    var3 -= -1964239424;
                                    var3 <<= 3;
                                    var3 &= -948265805;
                                    var3 ^= -1366904506;
                                } else {
                                    switch (var3) {
                                        case 418464032:
                                            var3 *= 624922835;
                                            var3 *= -1456785807;
                                            var3 &= -910413902;
                                            var3 ^= 1863754470;
                                            break;
                                        case 1470193582:
                                            var3 ^= 1390608755;
                                            break;
                                        case 1880701180:
                                        default:
                                            var3 ^= 1630734514;
                                    }
                                }

                                var221 = var3;
                                var272 = var221 + 1L;
                                var272 = var221 * var272;
                                var286 = var221 + 2L;
                                var272 *= var286;
                                var221 += 3L;
                                var272 *= var221;
                                var221 = var272 & 7L;
                                long var292;
                                int var231 = (var292 = var221 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                                if (var231 != 0) {
                                    break label160;
                                }

                                var188 = false;
                                var3 ^= -1924797873;
                                var3 ^= -2021386006;
                                var3 *= 1534291407;
                                var3 ^= 1252627054;
                            }

                            var221 = var3;
                            var272 = var221 + 1L;
                            var272 = var221 * var272;
                            var221 = var272 & 1L;
                            long var293;
                            int var234 = (var293 = var221 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                            if (var234 == 0) {
                                return var188;
                            }
                        }
                    } else {
                        var3 *= 1358017747;
                        var3 &= 1385952934;
                        var3 |= -175683725;
                        var3 &= -1230201215;
                        var3 ^= -777074881;
                        boolean var162 = var1 instanceof Boolean;
                        long var6 = var4;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var294;
                        int var191 = (var294 = var6 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                        if (var191 != 0) {
                            var3 |= -644462601;
                            var3 += 839846452;
                            var3 >>>= 13;
                            var3 >>= 4;
                            var3 ^= 1282377991;
                            break label230;
                        }

                        var3 &= -1979157757;
                        var3 ^= -1867095544;
                        if (var162) {
                            var3 &= 1637074266;
                            var3 *= -1118663851;
                            var3 -= 456479094;
                            var3 ^= 407298928;
                            int var172 = var3 + 1;
                            var172 = var3 * var172;
                            var172 &= 1;
                            if (var172 == 0) {
                                Boolean var175 = (Boolean)var1;
                                var6 = var4;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var6 = var8 & 1L;
                                long var295;
                                int var205 = (var295 = var6 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                                if (var205 != 0) {
                                    var3 -= 1283532286;
                                    var3 ^= -224272309;
                                    break label230;
                                }

                                var3 >>= 4;
                                var3 -= -1632351903;
                                var3 += -1538865172;
                                var3 |= 1167743421;
                                var3 ^= -1710605985;
                                var6 = var3;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var6 = var8 & 1L;
                                long var296;
                                int var208 = (var296 = var6 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                label186:
                                if (var208 == 0) {
                                    label220: {
                                        boolean var209 = var0.isBoolean();
                                        if (var209) {
                                            var3 -= 1878676067;
                                            var3 <<= 10;
                                            var3 += 1220670732;
                                            var3 ^= 432343206;
                                            Integer var210 = var3;
                                            if (var210 == null) {
                                                break label186;
                                            }

                                            boolean var211 = var0.getAsBoolean();
                                            Integer var236 = var4;
                                            if (var236 == null) {
                                                var3 >>>= 4;
                                                var3 |= 998688538;
                                                var3 *= 2009370635;
                                                var3 <<= 17;
                                                var3 ^= -1689021979;
                                                break label230;
                                            }
                                            var3 = switch (var3) {
                                                case -1379993174 -> {
                                                    var3 += -1950773468;
                                                    var3 ^= 1411558096;
                                                    var3 &= 2119526695;
                                                    yield var3 ^ 2099693612;
                                                }
                                                default -> var3 ^ -1942811722;
                                                case 2027256234 -> var3 ^ -2075891631;
                                            };
                                            int var237 = var3 + 1;
                                            var237 = var3 * var237;
                                            int var266 = var3 + 2;
                                            var237 *= var266;
                                            int var267 = var3 + 3;
                                            var237 *= var267;
                                            var237 &= 7;
                                            if (var237 != 0) {
                                                break label186;
                                            }

                                            boolean var176 = var175;
                                            if (var211 == var176) {
                                                var3 = switch (var3) {
                                                    case 293005354 -> {
                                                        var3 += 1041977712;
                                                        var3 -= 210127727;
                                                        var3 <<= 11;
                                                        var3 &= 691548745;
                                                        yield var3 ^ -1568198403;
                                                    }
                                                    default -> var3 ^ -190676656;
                                                    case 1573776953 -> var3 ^ -557393488;
                                                };
                                                var177 = true;
                                                var3 *= -875381067;
                                                var3 >>>= 22;
                                                var3 ^= -817414308;
                                                break label220;
                                            }

                                            var3 >>= 7;
                                            var3 ^= -390079568;
                                            var3 ^= -1707187453;
                                            var3 <<= 31;
                                            var3 ^= 875920303;
                                        } else {
                                            var3 += 595194412;
                                            var3 |= -156959653;
                                            var3 ^= 1138394352;
                                        }

                                        var6 = var3;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var297;
                                        int var215 = (var297 = var6 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                                        if (var215 != 0) {
                                            break label186;
                                        }

                                        var177 = false;
                                        var3 &= 101448375;
                                        var3 -= -285482670;
                                        var3 ^= -633166321;
                                    }

                                    int var216 = var3 + 1;
                                    int var217 = var3 * var216;
                                    int var242 = var3 + 2;
                                    int var218 = var217 * var242;
                                    var242 = var3 + 3;
                                    int var219 = var218 * var242;
                                    int var220 = var219 & 7;
                                    if (var220 == 0) {
                                        return var177;
                                    }
                                }
                            }
                        } else {
                            var3 |= -1751526193;
                            var3 ^= -326667302;
                            var3 *= 1086637369;
                            var3 ^= -924046900;
                            boolean var163 = var0.isString();
                            var6 = var4;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var298;
                            int var195 = (var298 = var6 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                            if (var195 != 0) {
                                var3 -= -498017769;
                                var3 &= 971795325;
                                var3 |= 1018039341;
                                var3 |= 528239311;
                                var3 ^= 1938939658;
                                break label230;
                            }

                            var3 ^= 24871180;
                            var3 >>= 16;
                            var3 ^= 1177809608;
                            Integer var196 = var3;
                            label177:
                            if (var196 != null) {
                                label175: {
                                    if (var163) {
                                        var3 = switch (var3) {
                                            case -1177782766 -> {
                                                var3 -= 539336780;
                                                yield var3 ^ 1163853791;
                                            }
                                            default -> var3 ^ 1493035750;
                                            case 1966845853 -> var3 ^ 1329467475;
                                        };
                                        var160 = var3;
                                        if (var160 == null) {
                                            break label177;
                                        }

                                        String var165 = var0.getAsString();
                                        String var197 = (String)var1;
                                        boolean var166 = var165.equalsIgnoreCase(var197);
                                        var6 = var4;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var299;
                                        var4 = (var299 = var6 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                        if (var4 != 0) {
                                            var3 <<= 15;
                                            var3 |= 1167338730;
                                            var3 ^= 435371279;
                                            break label230;
                                        }

                                        var3 -= -40803357;
                                        var3 |= -286233323;
                                        var3 |= -1960045547;
                                        var3 &= 973326301;
                                        var3 ^= -1772586191;
                                        var6 = var3;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var6 = var8 & 1L;
                                        long var300;
                                        var4 = (var300 = var6 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                                        if (var4 != 0) {
                                            break label177;
                                        }

                                        if (var166) {
                                            var3 += 1616953807;
                                            var3 -= 9629862;
                                            var3 ^= 192054773;
                                            var4 = var3 + 1;
                                            var4 = var3 * var4;
                                            int var167 = var3 + 2;
                                            var4 *= var167;
                                            var167 = var3 + 3;
                                            var4 *= var167;
                                            var4 &= 7;
                                            if (var4 != 0) {
                                                break label177;
                                            }

                                            var156 = true;
                                            var3 |= 453425253;
                                            var3 *= 1486289931;
                                            var3 *= 1895164027;
                                            var3 ^= -187342391;
                                            break label175;
                                        }

                                        var3 *= 471157233;
                                        var3 ^= 108389464;
                                        var3 >>= 3;
                                        var3 ^= -1440514706;
                                    } else {
                                        var3 &= 18956999;
                                        var3 |= -902557534;
                                        var3 &= 1072175860;
                                        var3 ^= 1372422009;
                                    }

                                    var156 = false;
                                    var3 *= -617403263;
                                    var3 ^= 1153583797;
                                }

                                long var169 = var3;
                                long var7 = var169 + 1L;
                                var7 = var169 * var7;
                                long var170 = var7 & 1L;
                                long var301;
                                int var171 = (var301 = var170 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                                if (var171 == 0) {
                                    return var156;
                                }
                            }
                        }
                    }
                }

                RuntimeException var157 = new RuntimeException();
                throw var157;
            }
        }

        IllegalArgumentException var148 = new IllegalArgumentException();
        throw var148;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var4 = var0.lookupClass();
        int var1 = -84621939;
        byte var2 = 0;
        int var5 = of_2.kj(var4, var1, var2);
        L = var5;
        Entry[] var6 = new Entry[9];
        Double var8 = 4.5;
        Double var35 = 1.1;
        Boolean var3 = true;
        Map var9 = Map.of("size", var8, "thickness", var35, "glow", var3, "crit_color", "#FFFFC857", "kill_color", "#FFFF4D5E");
        Entry var10 = Map.entry("hit_marker", var9);
        var6[0] = var10;
        Double var11 = 10.0;
        Map var12 = Map.of("amount", var11);
        Entry var13 = Map.entry("hit_particles", var12);
        var6[1] = var13;
        Double var14 = 1.1;
        Boolean var36 = false;
        Map var15 = Map.of("duration", var14, "only_mine", var36, "crit_color", "#FFFFC857", "heal_color", "#FF5EEAD4");
        Entry var16 = Map.entry("damage_numbers", var15);
        var6[2] = var16;
        Double var17 = 0.18;
        Map var18 = Map.of("flash", var17, "color", "#FFFF4D5E");
        Entry var19 = Map.entry("kill_effect", var18);
        var6[3] = var19;
        Double var20 = 90.0;
        Double var37 = 40.0;
        var3 = true;
        Map var21 = Map.of("offset_x", var20, "offset_y", var37, "win_chip", var3);
        Entry var22 = Map.entry("target_hud", var21);
        var6[4] = var22;
        Double var23 = 9.0;
        Double var38 = 1.6;
        Map var24 = Map.of("radius", var23, "thickness", var38, "from", "#99FFFFFF", "to", "#FFFFFFFF");
        Entry var25 = Map.entry("cooldown_ring", var24);
        var6[5] = var25;
        Boolean var26 = true;
        Double var39 = 7.0;
        var3 = true;
        Map var27 = Map.of("hurt_aberration", var26, "aberration", var39, "desaturate", var3);
        Entry var28 = Map.entry("atmosphere", var27);
        var6[6] = var28;
        Double var29 = 4.0;
        Double var40 = 0.62;
        Map var30 = Map.of("blur", var29, "dim", var40);
        Entry var31 = Map.entry("click_gui", var30);
        var6[7] = var31;
        Double var32 = 0.35;
        Map var33 = Map.of("strength", var32);
        Entry var34 = Map.entry("hurt_cam", var33);
        var6[8] = var34;
        Map var7 = Map.ofEntries(var6);
        o = var7;
    }
}
