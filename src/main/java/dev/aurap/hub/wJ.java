package dev.aurap.hub;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;

public record wJ(String M, String vz, long Hr, String F, String rz, String Di, String E, List<GE> z) {
    public static final int TEXT_MIN = 2;
    public static final int TEXT_MAX = 128;
    public static final int LABEL_MAX = 32;
    public static final int URL_MAX = 512;
    public static final int IL;

    public wJ(String M, String vz, long Hr, String F, String rz, String Di, String E, List<GE> z) {
        List var12;
        if (z == null) {
            var12 = List.of();
            var12 = var12;
        } else {
            int var11 = z.size();
            var11 = Math.min(2, var11);
            List var14 = z.subList(0, var11);
            List var15 = List.copyOf(var14);
            var12 = var15;
        }

        this.M = M;
        this.vz = vz;
        this.Hr = Hr;
        this.F = F;
        this.rz = rz;
        this.Di = Di;
        this.E = E;
        this.z = var12;
    }

    public JsonObject toJson() {
        label249: {
            int var1 = IL;
            var1 ^= 1741091156;
            int var2 = System.identityHashCode(this);
            JsonObject var3 = new JsonObject();
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var330;
            int var163 = (var330 = var4 - 0L) == 0L ? 0 : (var330 < 0L ? -1 : 1);
            if (var163 != 0) {
                var1 |= 2041485227;
                var1 ^= 828544086;
            } else {
                label251: {
                    var1 |= 1597528753;
                    var1 &= -1383967462;
                    var1 *= 2052207517;
                    var1 ^= 1517511474;
                    Integer var164 = var1;
                    if (var164 == null) {
                        break label249;
                    }

                    Integer var165 = 0;
                    var3.addProperty("type", var165);
                    String var166 = this.M;
                    int var5 = var1 - 1190685984;
                    var5 ^= -636359278;
                    RK(var3, "details", var166, 128, var5);
                    String var167 = this.vz;
                    var5 = var1 ^ 997700698;
                    var5 |= -384121106;
                    var5 |= 68982613;
                    var5 -= 1268264343;
                    var5 ^= 1224490808;
                    RK(var3, "state", var167, 128, var5);
                    var4 = this.Hr;
                    long var331;
                    int var169 = (var331 = var4 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                    if (var169 > 0) {
                        var1 = switch (var1) {
                            case -1854123819 -> var1 ^ -526677124;
                            default -> var1 ^ 1889685627;
                            case 2109900258 -> {
                                var1 &= 934391091;
                                yield var1 ^ 4189443;
                            }
                        };
                        JsonObject var170 = new JsonObject();
                        long var189 = this.Hr;
                        Long var190 = var189;
                        var170.addProperty("start", var190);
                        long var191 = var2;
                        long var7 = var191 + 1L;
                        var7 = var191 * var7;
                        long var192 = var7 & 1L;
                        long var332;
                        var5 = (var332 = var192 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            var1 |= 1965403113;
                            var1 -= 266732877;
                            var1 ^= -1455108831;
                            break label251;
                        }

                        var1 -= -43617310;
                        var1 ^= -263710800;
                        var1 ^= 1149918593;
                        long var194 = var1;
                        var7 = var194 + 1L;
                        var7 = var194 * var7;
                        long var9 = var194 + 2L;
                        var7 *= var9;
                        long var195 = var194 + 3L;
                        var7 *= var195;
                        long var196 = var7 & 7L;
                        long var333;
                        var5 = (var333 = var196 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label249;
                        }

                        var3.add("timestamps", var170);
                        switch (var1) {
                            case -1936015858:
                                var1 *= 1029507159;
                                var1 ^= -1394475614;
                                var1 -= -463910305;
                                var1 &= -2028379736;
                                var1 ^= 873828363;
                                break;
                            case -202579477:
                                var1 ^= -989415489;
                                break;
                            case 1120637298:
                            default:
                                var1 ^= 114756024;
                        }
                    } else {
                        switch (var1) {
                            case 1155195823:
                                var1 ^= 1953308027;
                                break;
                            case 1941944051:
                            default:
                                var1 ^= 229119270;
                                break;
                            case 2109900258:
                                var1 *= 1604806527;
                                var1 ^= 1626214178;
                                var1 += -868668791;
                                var1 ^= -1269878322;
                        }
                    }

                    long var198 = var1;
                    long var269 = var198 + 1L;
                    var269 = var198 * var269;
                    long var305 = var198 + 2L;
                    var269 *= var305;
                    long var199 = var198 + 3L;
                    var269 *= var199;
                    long var200 = var269 & 7L;
                    long var334;
                    var5 = (var334 = var200 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label249;
                    }

                    JsonObject var202 = new JsonObject();
                    String var203 = this.F;
                    int var230 = var1 << 29;
                    int var231 = var230 + -712902181;
                    int var232 = var231 ^ 1180667980;
                    int var233 = var232 ^ -1627022137;
                    RK(var202, "large_image", var203, 512, var233);
                    String var204 = this.rz;
                    int var234 = var1 - 1345715609;
                    int var235 = var234 << 16;
                    int var236 = var235 ^ 1604973904;
                    RK(var202, "large_text", var204, 128, var236);
                    String var205 = this.Di;
                    int var237 = var1 & 281568195;
                    int var238 = var237 ^ -1658995653;
                    int var239 = var238 & 1458817081;
                    int var240 = var239 & 1328631087;
                    int var241 = var240 ^ -389350024;
                    RK(var202, "small_image", var205, 512, var241);
                    String var206 = this.E;
                    int var242 = var1 | 265173076;
                    int var243 = var242 & -1772865802;
                    int var244 = var243 + 1864557625;
                    int var245 = var244 & -383478933;
                    int var246 = var245 ^ 1845486939;
                    RK(var202, "small_text", var206, 128, var246);
                    Integer var207 = var2;
                    if (var207 != null) {
                        var1 = switch (var1) {
                            default -> var1 ^ -1682344809;
                            case 769731511 -> var1 ^ 1003835061;
                            case 856994059 -> {
                                var1 >>>= 5;
                                var1 *= -111565451;
                                yield var1 ^ 383367314;
                            }
                        };
                        int var208 = var202.size();
                        if (var208 > 0) {
                            var1 >>= 22;
                            var1 ^= 502928653;
                            long var209 = var1;
                            var269 = var209 + 1L;
                            var269 = var209 * var269;
                            var305 = var209 + 2L;
                            var269 *= var305;
                            long var210 = var209 + 3L;
                            var269 *= var210;
                            long var211 = var269 & 7L;
                            long var335;
                            var208 = (var335 = var211 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                            if (var208 != 0) {
                                break label249;
                            }

                            var3.add("assets", var202);
                            switch (var1) {
                                case -502928752:
                                    var1 -= 226503756;
                                    var1 ^= 1768342713;
                                    var1 -= 44546889;
                                    var1 -= 1341769019;
                                    var1 ^= -1518926293;
                                    break;
                                case -397506085:
                                default:
                                    var1 ^= 1097520719;
                                    break;
                                case 729061675:
                                    var1 ^= -1888126822;
                            }
                        } else {
                            switch (var1) {
                                case -1668814338:
                                    var1 ^= -1760077709;
                                    break;
                                case -1096901968:
                                default:
                                    var1 ^= -225694312;
                                    break;
                                case -412747846:
                                    var1 |= -1465462867;
                                    var1 |= 853363974;
                                    var1 <<= 14;
                                    var1 ^= 836320338;
                            }
                        }

                        var4 = var1;
                        var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var336;
                        int var174 = (var336 = var4 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                        if (var174 != 0) {
                            break label249;
                        }

                        JsonArray var175 = new JsonArray();
                        JsonArray var176 = var175;
                        List var213 = this.z;
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var337;
                        int var252 = (var337 = var6 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                        if (var252 != 0) {
                            var1 &= -1284016700;
                            var1 ^= 1319854077;
                        } else {
                            var1 = switch (var1) {
                                default -> var1 ^ 942310994;
                                case -1101749979 -> var1 ^ -1770236904;
                                case -835257262 -> {
                                    var1 -= 62404001;
                                    var1 |= -1217225118;
                                    var1 >>>= 14;
                                    var1 ^= -360363255;
                                    yield var1 ^ 1602741194;
                                }
                            };
                            Integer var253 = var1;
                            if (var253 == null) {
                                break label249;
                            }

                            Iterator var214 = var213.iterator();
                            Iterator var215 = var214;
                            var1 *= -678163405;
                            var1 ^= -1908629439;
                            var1 ^= 1961786490;

                            label234:
                            while (true) {
                                boolean var254 = var215.hasNext();
                                Integer var277 = var2;
                                if (var277 == null) {
                                    var1 <<= 31;
                                    var1 &= 1083061314;
                                    var1 ^= -188513644;
                                    var1 &= -236139920;
                                    var1 ^= 1012771245;
                                    break;
                                }
                                var1 = switch (var1) {
                                    case -1854913005 -> {
                                        var1 -= -1530225187;
                                        var1 >>>= 27;
                                        yield var1 ^ -970332672;
                                    }
                                    default -> var1 ^ 2102474554;
                                    case 2099544019 -> var1 ^ -350475184;
                                };
                                Integer var278 = var1;
                                if (var278 == null) {
                                    break label249;
                                }

                                if (!var254) {
                                    var1 = switch (var1) {
                                        default -> var1 ^ 172914927;
                                        case -970332643 -> {
                                            var1 &= -940881317;
                                            var1 *= -1131644267;
                                            var1 *= -1322802873;
                                            yield var1 ^ 1628343955;
                                        }
                                        case 114836374 -> var1 ^ -766400968;
                                    };
                                    Integer var216 = var1;
                                    if (var216 == null) {
                                        break label249;
                                    }

                                    int var217 = var176.size();
                                    Integer var258 = var2;
                                    if (var258 != null) {
                                        var1 &= -1180405037;
                                        var1 &= 1369116074;
                                        var1 >>>= 6;
                                        var1 += -402379819;
                                        var1 ^= 561057775;
                                        var6 = var1;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var338;
                                        int var262 = (var338 = var6 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                                        if (var262 != 0) {
                                            break label249;
                                        }

                                        if (var217 > 0) {
                                            var1 >>= 23;
                                            var1 ^= 2057953457;
                                            long var218 = var1;
                                            var269 = var218 + 1L;
                                            var269 = var218 * var269;
                                            long var219 = var269 & 1L;
                                            long var339;
                                            var217 = (var339 = var219 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                                            if (var217 != 0) {
                                                break label249;
                                            }

                                            var3.add("buttons", var176);
                                            var1 &= 1617905017;
                                            var1 ^= -1037679653;
                                        } else {
                                            var1 -= 847068882;
                                            var1 |= 1286433290;
                                            var1 *= 51944073;
                                            var1 ^= 375196452;
                                        }

                                        int var177 = var1 + 1;
                                        int var178 = var1 * var177;
                                        var217 = var1 + 2;
                                        int var179 = var178 * var217;
                                        var217 = var1 + 3;
                                        int var180 = var179 * var217;
                                        int var181 = var180 & 7;
                                        if (var181 != 0) {
                                            break label249;
                                        }

                                        Boolean var182 = false;
                                        var217 = var2 + 1;
                                        var217 = var2 * var217;
                                        int var263 = var2 + 2;
                                        var217 *= var263;
                                        var2 += 3;
                                        var217 *= var2;
                                        var2 = var217 & 7;
                                        if (var2 == 0) {
                                            var1 += 2087472001;
                                            var1 *= 1860325977;
                                            var1 += 373239307;
                                            var1 &= -775454383;
                                            var1 ^= -874760426;
                                            var3.addProperty("instance", var182);
                                            return var3;
                                        }

                                        var1 &= 1572510324;
                                        var1 >>= 17;
                                        var1 |= -284938069;
                                        var1 += 1215612900;
                                        var1 ^= -68824286;
                                    } else {
                                        var1 += 2077843606;
                                        var1 += 204447722;
                                        var1 ^= 67151541;
                                    }
                                    break;
                                }

                                var1 ^= -1898119704;
                                var1 ^= -726073253;
                                Object var255 = var215.next();
                                GE var256 = (GE)var255;
                                Integer var279 = var2;
                                if (var279 == null) {
                                    switch (var1) {
                                        case -1672733778:
                                            var1 ^= 1222146391;
                                            var1 -= -1615353643;
                                            var1 -= -1788953638;
                                            var1 ^= 1407243767;
                                            break label234;
                                        case -1120153106:
                                        default:
                                            var1 ^= -68492162;
                                            break label234;
                                        case -1091810593:
                                            var1 ^= -458028512;
                                            break label234;
                                    }
                                }
                                var1 = switch (var1) {
                                    case -1672733778 -> {
                                        var1 &= -1065193314;
                                        var1 += -1968526764;
                                        var1 += -558834012;
                                        var1 >>>= 15;
                                        yield var1 ^ 24470783;
                                    }
                                    case -1578752615 -> var1 ^ -1568838511;
                                    default -> var1 ^ -1217572168;
                                };
                                String var280 = var256.label();
                                String var281 = L(var280, 32);
                                if (var281 != null) {
                                    var1 ^= 621965120;
                                    var1 -= 1060547183;
                                    var1 |= 1726809427;
                                    var1 ^= 1405207946;
                                    var8 = var1;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    long var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var340;
                                    int var294 = (var340 = var8 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                                    if (var294 != 0) {
                                        break label249;
                                    }

                                    String var295 = var256.url();
                                    int var307 = var2 + 1;
                                    int var308 = var2 * var307;
                                    int var324 = var2 + 2;
                                    int var309 = var308 * var324;
                                    int var325 = var2 + 3;
                                    int var310 = var309 * var325;
                                    int var311 = var310 & 7;
                                    if (var311 != 0) {
                                        var1 ^= -1267907493;
                                        var1 ^= -859011657;
                                        break;
                                    }

                                    var1 <<= 21;
                                    var1 *= 808204359;
                                    var1 &= 1138585479;
                                    var1 ^= -266828960;
                                    var1 ^= 1876454044;
                                    var305 = var1;
                                    long var11 = var305 + 1L;
                                    var11 = var305 * var11;
                                    var305 = var11 & 1L;
                                    long var341;
                                    int var314 = (var341 = var305 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                                    if (var314 != 0) {
                                        break label249;
                                    }

                                    if (var295 != null) {
                                        var1 -= 1301484512;
                                        var1 -= -1770925244;
                                        var1 &= -1398132906;
                                        var1 *= -873475807;
                                        var1 ^= -1644595059;
                                        Integer var296 = var1;
                                        if (var296 == null) {
                                            break label249;
                                        }

                                        String var297 = var256.url();
                                        int var315 = var2 + 1;
                                        int var316 = var2 * var315;
                                        int var326 = var2 + 2;
                                        int var317 = var316 * var326;
                                        int var327 = var2 + 3;
                                        int var318 = var317 * var327;
                                        int var319 = var318 & 7;
                                        if (var319 != 0) {
                                            var1 &= 1605173983;
                                            var1 ^= -786617504;
                                            break;
                                        }

                                        var1 &= 119040173;
                                        var1 |= -590280654;
                                        var1 &= 69235937;
                                        var1 += -965260976;
                                        var1 ^= 2130188118;
                                        int var298 = var297.length();
                                        if (var298 > 512) {
                                            var1 += -1108961617;
                                            var1 ^= -130000646;
                                            var1 ^= 697807556;
                                            Integer var299 = var1;
                                            if (var299 == null) {
                                                break label249;
                                            }

                                            switch (var1) {
                                                case -1549680792:
                                                    var1 >>>= 9;
                                                    var1 &= -548048059;
                                                    var1 >>= 27;
                                                    var1 ^= 1000198174;
                                                    var1 ^= -1427270131;
                                                    break;
                                                case -379259770:
                                                default:
                                                    var1 ^= 991356431;
                                                    break;
                                                case 822370507:
                                                    var1 ^= 1097138980;
                                            }
                                        } else {
                                            var1 ^= -60600418;
                                            var1 >>>= 27;
                                            var1 *= -1753927053;
                                            var1 -= -2144752942;
                                            var1 ^= -413764136;
                                            JsonObject var300 = new JsonObject();
                                            var300.addProperty("label", var281);
                                            int var282 = var2 + 1;
                                            int var283 = var2 * var282;
                                            int var284 = var283 & 1;
                                            if (var284 != 0) {
                                                switch (var1) {
                                                    case 19465979:
                                                        var1 ^= 1432967944;
                                                        break label234;
                                                    case 899903201:
                                                        var1 += 2120669881;
                                                        var1 -= -329075466;
                                                        var1 |= 966651954;
                                                        var1 -= -2137771098;
                                                        var1 ^= -1279858003;
                                                        break label234;
                                                    case 1233032038:
                                                    default:
                                                        var1 ^= 1794702843;
                                                        break label234;
                                                }
                                            }

                                            var1 |= 1155831877;
                                            var1 ^= 1013234794;
                                            var1 *= -376171793;
                                            var1 >>= 3;
                                            var1 ^= -450846232;
                                            String var257 = var256.url();
                                            var300.addProperty("url", var257);
                                            var176.add(var300);
                                            var1 >>>= 8;
                                            var1 ^= -1852122604;
                                        }
                                    } else {
                                        switch (var1) {
                                            case -1660884484:
                                                var1 &= -1393283907;
                                                var1 &= -254241012;
                                                var1 -= 1571539986;
                                                var1 ^= -1289456151;
                                                break;
                                            case -22878524:
                                            default:
                                                var1 ^= 759204452;
                                                break;
                                            case 1722097099:
                                                var1 ^= -450316594;
                                        }
                                    }
                                } else {
                                    var1 *= -750835493;
                                    var1 ^= 1048275339;
                                }
                            }
                        }
                    } else {
                        var1 &= -1021787379;
                        var1 ^= -812799308;
                    }
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            int var160 = var1 + 2;
            var2 *= var160;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalArgumentException var152 = new IllegalArgumentException();
                throw var152;
            }
        }

        UnsupportedOperationException var153 = new UnsupportedOperationException();
        throw var153;
    }

    private static void RK(JsonObject var0, String var1, String var2, int var3, int var4) {
        int var7 = System.identityHashCode(var0);
        String var8 = L(var2, var3);
        Integer var28 = var7;
        if (var28 != null) {
            int var11 = var4 & 952802314;
            var11 ^= 471821495;
            var11 |= 751470965;
            var11 ^= -843209033;
            var28 = var3;
            if (var28 != null) {
                if (var8 != null) {
                    var11 *= -1456731615;
                    var11 |= -1133196774;
                    var11 ^= -773730438;
                    var11 &= 1488977536;
                    var11 ^= 672202193;
                    var0.addProperty(var1, var8);
                    var11 ^= 537904025;
                    var11 ^= -495386556;
                    var11 *= -1559067265;
                    var11 ^= 1947515754;
                } else {
                    var11 |= -1402238480;
                    var11 |= 1335234474;
                    var11 ^= -1607899292;
                }

                int var30 = var3 + 1;
                var30 = var3 * var30;
                int var6 = var30 & 1;
                if (var6 == 0) {
                    return;
                }
            }

            RuntimeException var27 = new RuntimeException();
            throw var27;
        } else {
            int var5 = var4 + -801671160;
            var5 ^= 824217526;
            AssertionError var10 = new AssertionError();
            throw var10;
        }
    }

    public static String L(String var0, int var1) {
        int var2 = IL;
        var2 ^= 1735442854;
        int var4 = System.identityHashCode(var0);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var5 &= 1;
        if (var5 != 0) {
            var2 *= -1489269257;
            var2 *= 56316423;
            var2 += 2102925597;
            var2 |= -1323291780;
            var2 ^= -2126241323;
        } else {
            label130: {
                var2 &= -395684353;
                var2 &= 747220105;
                var2 *= -1228072545;
                var2 >>= 10;
                var2 ^= -2021701563;
                var5 = var1 + 1;
                var5 = var1 * var5;
                int var6 = var1 + 2;
                var5 *= var6;
                var6 = var1 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    if (var0 == null) {
                        var2 *= 790644009;
                        var2 ^= -974653713;
                        var5 = var1 + 1;
                        var5 = var1 * var5;
                        var5 &= 1;
                        if (var5 == 0) {
                            return null;
                        }
                    } else {
                        var2 <<= 17;
                        var2 >>= 30;
                        var2 &= -557786088;
                        var2 ^= 572345113;
                        String var109 = var0.strip();
                        var6 = var109.length();
                        Integer var7 = var4;
                        if (var7 == null) {
                            switch (var2) {
                                case -52586751:
                                    var2 |= 473431105;
                                    var2 >>>= 5;
                                    var2 ^= 1301788402;
                                    var2 ^= 2093516578;
                                    break label130;
                                case -36679425:
                                default:
                                    var2 ^= 2125250168;
                                    break label130;
                                case 994435191:
                                    var2 ^= -332461062;
                                    break label130;
                            }
                        }

                        var2 &= -1133649715;
                        var2 ^= 575805932;
                        long var132 = var1;
                        long var9 = var132 + 1L;
                        var9 = var132 * var9;
                        long var133 = var9 & 1L;
                        long var162;
                        int var134 = (var162 = var133 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                        if (var134 == 0) {
                            if (var6 < 2) {
                                var2 += 172689758;
                                var2 ^= -1096053013;
                                var2 ^= 89296376;
                                var2 ^= 903675951;
                                long var114 = var1;
                                long var8 = var114 + 1L;
                                var8 = var114 * var8;
                                long var115 = var8 & 1L;
                                long var163;
                                var6 = (var163 = var115 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    return null;
                                }
                            } else {
                                var2 |= 1722743408;
                                var2 <<= 8;
                                var2 &= 1120926369;
                                var2 ^= -1539293801;
                                var6 = var1 + 1;
                                var6 = var1 * var6;
                                var6 &= 1;
                                if (var6 == 0) {
                                    var6 = var109.length();
                                    Integer var135 = var4;
                                    if (var135 == null) {
                                        var2 += -977942941;
                                        var2 ^= 256127400;
                                        var2 += -767923468;
                                        var2 ^= 66644844;
                                        break label130;
                                    }

                                    var2 *= 1687762965;
                                    var2 ^= -1185138482;
                                    long var136 = var1;
                                    var9 = var136 + 1L;
                                    var9 = var136 * var9;
                                    long var137 = var9 & 1L;
                                    long var164;
                                    int var138 = (var164 = var137 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                                    if (var138 == 0) {
                                        if (var6 <= var1) {
                                            var2 += 1308711664;
                                            var2 <<= 18;
                                            var2 ^= 2141751595;
                                            return var109;
                                        }

                                        var2 *= 199632775;
                                        var2 &= -229175252;
                                        var2 >>= 19;
                                        var2 ^= 128253071;
                                        var2 ^= -1255938840;
                                        var6 = var1 + 1;
                                        var6 = var1 * var6;
                                        var138 = var1 + 2;
                                        var6 *= var138;
                                        var138 = var1 + 3;
                                        var6 *= var138;
                                        var6 &= 7;
                                        if (var6 == 0) {
                                            var6 = var1 - 1;
                                            long var141 = var4;
                                            var9 = var141 + 1L;
                                            var9 = var141 * var9;
                                            long var142 = var9 & 1L;
                                            long var165;
                                            var138 = (var165 = var142 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
                                            if (var138 != 0) {
                                                var2 *= 1534672189;
                                                var2 -= -1097170561;
                                                var2 ^= -1263181192;
                                                break label130;
                                            }
                                            var2 = switch (var2) {
                                                default -> var2 ^ 648871351;
                                                case 831216316 -> var2 ^ -1445184170;
                                                case 1299768357 -> {
                                                    var2 += -22420408;
                                                    var2 *= -1925967991;
                                                    var2 -= -384910677;
                                                    yield var2 ^ -2015270915;
                                                }
                                            };
                                            Integer var144 = var1;
                                            label110:
                                            if (var144 != null) {
                                                int var145 = var6 - 1;
                                                char var146 = var109.charAt(var145);
                                                int var147 = Character.isHighSurrogate(var146) ? 1 : 0;
                                                if (var147 != 0) {
                                                    var2 *= 1692839355;
                                                    var2 ^= 1271519019;
                                                    var2 ^= -734089871;
                                                    Integer var148 = var1;
                                                    if (var148 == null) {
                                                        break label110;
                                                    }

                                                    int var149 = var6 + -1;
                                                    Integer var153 = var4;
                                                    if (var153 == null) {
                                                        var2 &= 740490109;
                                                        var2 |= -264030157;
                                                        var2 ^= -891570851;
                                                        break label130;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -1644727337 -> {
                                                            var2 *= -53989491;
                                                            var2 >>= 2;
                                                            var2 >>= 7;
                                                            var2 |= 25198593;
                                                            yield var2 ^ 179150729;
                                                        }
                                                        case -305390186 -> var2 ^ -1140782007;
                                                        default -> var2 ^ 45933433;
                                                    };
                                                    var147 = var149;
                                                    var2 |= -1963795333;
                                                    var2 ^= -1730399023;
                                                } else {
                                                    var2 &= 111557763;
                                                    var2 &= -1383447742;
                                                    var2 ^= 1677134257;
                                                    var2 ^= -1474686090;
                                                    var147 = var6;
                                                    var2 ^= -798599666;
                                                    var2 &= -559227575;
                                                    var2 ^= 2099291363;
                                                }

                                                long var154 = var1;
                                                long var10 = var154 + 1L;
                                                var10 = var154 * var10;
                                                var154 = var10 & 1L;
                                                long var166;
                                                var6 = (var166 = var154 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                                                if (var6 == 0) {
                                                    String var110 = var109.substring(0, var147);
                                                    String var111 = var110.stripTrailing();
                                                    var6 = var4 + 1;
                                                    var6 = var4 * var6;
                                                    var147 = var4 + 2;
                                                    var6 *= var147;
                                                    var4 += 3;
                                                    var6 *= var4;
                                                    var4 = var6 & 7;
                                                    if (var4 != 0) {
                                                        switch (var2) {
                                                            case -1726563368:
                                                                var2 ^= -615367312;
                                                                break label130;
                                                            case 314580972:
                                                            default:
                                                                var2 ^= 1607019622;
                                                                break label130;
                                                            case 1730865322:
                                                                var2 *= 1181151063;
                                                                var2 &= -838180928;
                                                                var2 ^= 2025490922;
                                                                break label130;
                                                        }
                                                    }

                                                    var2 -= -1377714762;
                                                    var2 ^= 290060633;
                                                    var2 += 342584280;
                                                    var2 ^= 1744933467;
                                                    var2 ^= -1577412159;
                                                    Integer var3 = var1;
                                                    if (var3 != null) {
                                                        return var111 + "…";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                RuntimeException var96 = new RuntimeException();
                throw var96;
            }
        }

        IllegalStateException var95 = new IllegalStateException();
        throw var95;
    }




    public String details() {
        int var1 = IL;
        var1 ^= -1656250126;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var23;
        var2 = (var23 = var19 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= -254029353;
            var1 &= 2143431255;
            var1 |= -887483145;
            var1 *= -249952655;
            var1 ^= 2092396702;
            IllegalStateException var21 = new IllegalStateException();
            throw var21;
        } else {
            var1 |= 1235318107;
            var1 *= 725331833;
            var1 -= -1350631691;
            var1 ^= -1887002544;
            Integer var11 = var1;
            if (var11 != null) {
                return this.M;
            } else {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            }
        }
    }

    public String state() {
        int var1 = IL;
        var1 ^= 201839686;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var26;
        var2 = (var26 = var21 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            Integer var23 = switch (var1) {
                case -1766158606 -> {
                    var1 <<= 11;
                    var1 ^= -496295098;
                    var1 ^= 1131641962;
                    var1 -= 68077602;
                    yield var1 ^ 1954641169;
                }
                default -> var1 ^ 2036088372;
                case 2131212960 -> var1 ^ 1155553821;
            };
            if (var23 != null) {
                return this.vz;
            }
        } else {
            var1 |= -2000040947;
            var1 *= 1860206153;
            var1 ^= 505506101;
            long var15 = var1;
            long var3 = var15 + 1L;
            var3 = var15 * var3;
            long var16 = var3 & 1L;
            long var27;
            var1 = (var27 = var16 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public long startEpochSeconds() {
        int var1 = IL;
        var1 ^= 47350528;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 *= 345180459;
            var1 ^= -1247806432;
            long var17 = var1;
            long var25 = var17 + 1L;
            long var26 = var17 * var25;
            long var6 = var17 + 2L;
            long var27 = var26 * var6;
            long var18 = var17 + 3L;
            long var28 = var27 * var18;
            long var19 = var28 & 7L;
            long var29;
            var2 = (var29 = var19 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var1 += 2131563632;
            var1 ^= -1639894564;
            Integer var13 = var1;
            if (var13 != null) {
                return this.Hr;
            }
        }

        IllegalStateException var14 = new IllegalStateException();
        throw var14;
    }

    public String largeImage() {
        int var1 = IL;
        var1 ^= 1584631101;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 >>= 14;
            var1 ^= -1461840716;
            long var16 = var1;
            long var24 = var16 + 1L;
            long var25 = var16 * var24;
            long var17 = var25 & 1L;
            long var26;
            var2 = (var26 = var17 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            } else {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        } else {
            switch (var1) {
                case -2020295870:
                default:
                    var1 ^= -1143164928;
                    break;
                case -993077367:
                    var1 ^= -1659255460;
                    var1 |= -499327518;
                    var1 ^= 231441937;
                    break;
                case -390187031:
                    var1 ^= 12742701;
            }

            return this.F;
        }
    }

    public String largeText() {
        int var1 = IL;
        var1 ^= 2006959188;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ 360128775;
                case -316498208 -> {
                    var1 -= -503848872;
                    yield var1 ^ -1215139983;
                }
                case 1033213049 -> var1 ^ -947880393;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.rz;
            }
        } else {
            long var11 = switch (var1) {
                default -> var1 ^ -1384408232;
                case -316498208 -> {
                    var1 &= -2141653960;
                    var1 += -1100894067;
                    yield var1 ^ -63919859;
                }
                case 354791440 -> var1 ^ 701451794;
            };
            long var25 = var11 + 1L;
            long var26 = var11 * var25;
            long var12 = var26 & 1L;
            long var27;
            var1 = (var27 = var12 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            }
        }

        AssertionError var14 = new AssertionError();
        throw var14;
    }

    public String smallImage() {
        int var1 = IL;
        var1 ^= -2045589088;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 = switch (var1) {
                default -> var1 ^ -146142682;
                case 481268500 -> {
                    var1 >>= 1;
                    yield var1 ^ 971567574;
                }
                case 1586933639 -> var1 ^ 1636936719;
            };
            int var13 = var1 + 1;
            var13 = var1 * var13;
            int var3 = var1 + 2;
            var13 *= var3;
            var3 = var1 + 3;
            var13 *= var3;
            var13 &= 7;
            if (var13 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        } else {
            var1 <<= 5;
            var1 &= -1373947306;
            var1 >>>= 9;
            var1 |= -623877208;
            var1 ^= -1233230112;
            return this.Di;
        }
    }

    public String smallText() {
        int var1 = IL;
        var1 ^= 1155484503;
        int var2 = System.identityHashCode(this);
        Integer var9 = var2;
        if (var9 == null) {
            var1 |= -1600692560;
            var1 ^= 1334540926;
            int var10 = var1 + 1;
            var10 = var1 * var10;
            var10 &= 1;
            if (var10 != 0) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            } else {
                AssertionError var13 = new AssertionError();
                throw var13;
            }
        } else {
            var1 += 773372729;
            var1 &= 1050211288;
            var1 ^= -28981049;
            return this.E;
        }
    }

    public List buttons() {
        int var1 = IL;
        var1 ^= -1607540757;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 ^= -1013714768;
            var1 |= 1241825766;
            var1 -= 1136375919;
            var1 -= 1480414057;
            var1 ^= -1696504975;
            AssertionError var13 = new AssertionError();
            throw var13;
        } else {
            var1 |= -1651635079;
            var1 <<= 26;
            var1 ^= 330145311;
            return this.z;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -383427570;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        IL = var4;
    }
}
