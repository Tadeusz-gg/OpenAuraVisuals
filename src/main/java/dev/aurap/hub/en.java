package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class en {
    public static final String et = "none";
    private static final String R = "key.keyboard.";
    private static final Pattern t;
    private static final Map H;
    private static final Map K;
    public static final int XW;

    private en() {
    }

    private static void h(String var0, String var1, int var2) {
        int var4 = System.identityHashCode(var0);
        Map var5 = H;
        Integer var16 = var4;
        if (var16 == null) {
            int var3 = switch (var2) {
                case -1579909853 -> {
                    int var6 = var2 ^ -214353850;
                    var6 >>>= 20;
                    yield var6 ^ -1764516552;
                }
                case 645329263 -> var2 ^ -1283545515;
                default -> var2 ^ -465732009;
            };
            int var17 = var3 + 1;
            var17 = var3 * var17;
            var17 &= 1;
            if (var17 == 0) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        } else {
            int var8 = var2 * 1155044077;
            var8 &= 1376505502;
            var8 ^= 1794556023;
            var8 >>= 6;
            var8 ^= -630912504;
            Object var13 = var8;
            if (var13 != null) {
                var13 = var5.put(var0, var1);
                return;
            }
        }

        IllegalStateException var14 = new IllegalStateException();
        throw var14;
    }

    private static void ei(String var0, String[] var1, int var2) {
        int var4 = System.identityHashCode(var0);
        String[] var5 = var1;
        int var6 = var1.length;
        long var7 = var4;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var74;
        int var47 = (var74 = var7 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
        if (var47 != 0) {
            int var32 = var2 | 1489599005;
            var32 |= -1722671686;
            var32 ^= -423671595;
        } else {
            label60: {
                int var3 = var2 ^ 833178707;
                var3 += -1818650762;
                var3 ^= 1667012965;
                var7 = var3;
                var9 = var7 + 1L;
                var9 = var7 * var9;
                var11 = var7 + 2L;
                var9 *= var11;
                var7 += 3L;
                var9 *= var7;
                var7 = var9 & 7L;
                long var75;
                int var51 = (var75 = var7 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                if (var51 == 0) {
                    var6 = var6;
                    byte var52 = 0;
                    int var53 = var52;

                    var3 = switch (var3) {
                        default -> var3 ^ -290146627;
                        case 34306850 -> {
                            var3 += 1541947031;
                            yield var3 ^ -1077995645;
                        }
                        case 1247923129 -> var3 ^ 1041206651;
                    };

                    while (true) {
                        if (var53 >= var6) {
                            var3 -= -1802520223;
                            var3 -= -183070888;
                            var3 ^= -1935156626;
                            var4 = var3 + 1;
                            var4 = var3 * var4;
                            int var42 = var3 + 2;
                            var4 *= var42;
                            int var43 = var3 + 3;
                            var4 *= var43;
                            var4 &= 7;
                            if (var4 == 0) {
                                return;
                            }
                            break;
                        }

                        var3 |= -7735740;
                        var3 -= -1496765225;
                        var3 ^= 736674587;
                        int var8 = var3 + 1;
                        var8 = var3 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            break;
                        }

                        String var56 = var5[var53];
                        Map var66 = K;
                        int var10 = var4 + 1;
                        var10 = var4 * var10;
                        int var72 = var4 + 2;
                        var10 *= var72;
                        int var73 = var4 + 3;
                        var10 *= var73;
                        var10 &= 7;
                        if (var10 != 0) {
                            var3 += -1771093148;
                            var3 += -696591210;
                            var3 |= 241758530;
                            var3 ^= -996227940;
                            break label60;
                        }

                        var3 -= 454746010;
                        var3 ^= 568040181;
                        Object var57 = var66.put(var56, var0);
                        var8 = var53 + 1;
                        var53 = var8;
                        switch (var3) {
                            case 1078325357:
                            default:
                                var3 ^= 275823145;
                                break;
                            case 1353785655:
                                var3 ^= -1170679917;
                                break;
                            case 1980410327:
                                var3 += 140105714;
                                var3 ^= 274128907;
                                var3 ^= -1035014240;
                                var3 ^= 1311776856;
                        }
                    }
                }

                IllegalStateException var41 = new IllegalStateException();
                throw var41;
            }
        }

        IllegalStateException var35 = new IllegalStateException();
        throw var35;
    }

    public static String YR(String var0) {
        int var1 = XW;
        var1 ^= -882902046;
        int var2 = System.identityHashCode(var0);
        Integer var3 = var2;
        int var4 = of_2.I;
        var1 ^= var4;
        var1 ^= 1186804733;
        of_2.I = 1186804733;
        var4 = of_2.LF;
        var1 ^= var4;
        var1 ^= -1499845651;
        of_2.LF = -1499845651;
        if (var3 == null) {
            var1 <<= 6;
            var1 <<= 25;
            var1 ^= 1863756774;
        } else {
            label254: {
                var1 &= 1983823629;
                var1 >>>= 18;
                var1 ^= 757378003;
                int var157 = var1 + 1;
                var157 = var1 * var157;
                var157 &= 1;
                if (var157 == 0) {
                    if (var0 == null) {
                        var1 -= -1515798903;
                        var1 >>>= 3;
                        var1 ^= 1295452603;
                        var1 ^= -40030162;
                        Integer var170 = var1;
                        if (var170 != null) {
                            return null;
                        }
                    } else {
                        var1 |= -188793400;
                        var1 ^= -520526333;
                        String var160 = var0.trim();
                        Locale var172 = Locale.ROOT;
                        Object var5 = var2;
                        if (var5 == null) {
                            switch (var1) {
                                case -1837442744:
                                    var1 ^= -1649483983;
                                    break label254;
                                case -182482247:
                                default:
                                    var1 ^= 1769803566;
                                    break label254;
                                case 491182558:
                                    var1 &= -1322116516;
                                    var1 >>>= 19;
                                    var1 += 913977945;
                                    var1 ^= -647192673;
                                    break label254;
                            }
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -1570518538;
                            case 491182558 -> {
                                var1 ^= 1000054063;
                                var1 -= -1074777511;
                                yield var1 ^ 13643558;
                            }
                            case 1734689107 -> var1 ^ -1665115029;
                        };
                        var5 = var1;
                        label227:
                        if (var5 != null) {
                            String var161 = var160.toLowerCase(var172);
                            int var173 = (var161.startsWith("key.keyboard.")) ? 1 : 0;
                            String var176;
                            if (var173 != 0) {
                                var1 = switch (var1) {
                                    default -> var1 ^ -1667710597;
                                    case 1311874001 -> var1 ^ 751428832;
                                    case 1715289534 -> {
                                        var1 &= 353212906;
                                        var1 ^= 436277429;
                                        var1 ^= 769647396;
                                        var1 *= -586912533;
                                        yield var1 ^ 445226808;
                                    }
                                };
                                var173 = "key.keyboard.".length();
                                String var175 = var161.substring(var173);
                                var5 = var2;
                                if (var5 == null) {
                                    var1 -= 1936992606;
                                    var1 -= 1897317578;
                                    var1 >>= 29;
                                    var1 <<= 1;
                                    var1 ^= 283726876;
                                    break label254;
                                }

                                var1 |= 1677616338;
                                var1 ^= -1647029866;
                                long var200 = var1;
                                long var7 = var200 + 1L;
                                var7 = var200 * var7;
                                long var201 = var7 & 1L;
                                long var271;
                                int var202 = (var271 = var201 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                                if (var202 != 0) {
                                    break label227;
                                }

                                var176 = var175;
                                var1 += -85362650;
                                var1 ^= -1770477145;
                                var1 += 227029383;
                                var1 ^= 618304723;
                            } else {
                                var1 <<= 20;
                                var1 -= 624637187;
                                var1 ^= 23595714;
                                int var203 = var1 + 1;
                                var203 = var1 * var203;
                                var203 &= 1;
                                if (var203 != 0) {
                                    break label227;
                                }

                                var176 = var161;
                                var1 &= -345492761;
                                var1 ^= 1889498989;
                                var1 ^= 66685642;
                            }

                            long var206 = var1;
                            long var251 = var206 + 1L;
                            var251 = var206 * var251;
                            long var9 = var206 + 2L;
                            var251 *= var9;
                            long var207 = var206 + 3L;
                            var251 *= var207;
                            long var208 = var251 & 7L;
                            long var272;
                            var157 = (var272 = var208 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                            if (var157 == 0) {
                                String var163 = var176.replace('_', '.');
                                long var177 = var2;
                                long var6 = var177 + 1L;
                                var6 = var177 * var6;
                                long var8 = var177 + 2L;
                                var6 *= var8;
                                long var178 = var177 + 3L;
                                var6 *= var178;
                                long var179 = var6 & 7L;
                                long var273;
                                var173 = (var273 = var179 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                                if (var173 != 0) {
                                    var1 += -387336232;
                                    var1 *= -585860407;
                                    var1 |= 1431370633;
                                    var1 |= 1127684309;
                                    var1 ^= -1864282053;
                                    break label254;
                                }

                                var1 &= 432194071;
                                var1 ^= 845048745;
                                var173 = var1 + 1;
                                var173 = var1 * var173;
                                var173 &= 1;
                                label215:
                                if (var173 == 0) {
                                    String var164 = var163.replace('-', '.');
                                    int var184 = (var164.equals("none")) ? 1 : 0;
                                    if (var184 != 0) {
                                        var1 += -10227448;
                                        var1 *= 1400229007;
                                        var1 ^= -2002416606;
                                        return "none";
                                    }
                                    var1 = switch (var1) {
                                        default -> var1 ^ -1717385873;
                                        case 576498601 -> {
                                            var1 += 1925758199;
                                            var1 += 1798926271;
                                            yield var1 ^ 909202066;
                                        }
                                        case 1842861837 -> var1 ^ -1510895669;
                                    };
                                    String var185 = var164.replace(".", "");
                                    Map var209 = H;
                                    var5 = var209.get(var185);
                                    String var211 = (String)var5;
                                    Integer var232 = var2;
                                    if (var232 == null) {
                                        var1 &= -1535178995;
                                        var1 ^= -881219093;
                                        break label254;
                                    }
                                    var1 = switch (var1) {
                                        default -> var1 ^ -426099387;
                                        case 913279693 -> {
                                            var1 |= 882297992;
                                            var1 &= -767578271;
                                            yield var1 ^ 1860671871;
                                        }
                                        case 1394940549 -> var1 ^ -1624267072;
                                    };
                                    String var188;
                                    if (var211 == null) {
                                        var1 = switch (var1) {
                                            case -1550767376 -> var1 ^ 1632034548;
                                            default -> var1 ^ 136628540;
                                            case 2094536510 -> {
                                                var1 ^= 1934456070;
                                                yield var1 ^ 1889858796;
                                            }
                                        };
                                        var6 = var1;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        long var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var274;
                                        int var236 = (var274 = var6 - 0L) == 0L ? 0 : (var274 < 0L ? -1 : 1);
                                        if (var236 != 0) {
                                            break label215;
                                        }

                                        Map var237 = K;
                                        Object var186 = var237.get(var185);
                                        int var238 = var2 + 1;
                                        int var239 = var2 * var238;
                                        int var240 = var239 & 1;
                                        if (var240 != 0) {
                                            var1 *= -369209039;
                                            var1 ^= 1285052786;
                                            break label254;
                                        }
                                        var1 = switch (var1) {
                                            case -1884265263 -> var1 ^ 1083382757;
                                            default -> var1 ^ 1661694773;
                                            case 2133956308 -> {
                                                var1 &= 381934649;
                                                var1 >>>= 21;
                                                var1 += -1098017677;
                                                var1 *= 681232811;
                                                yield var1 ^ 99060862;
                                            }
                                        };
                                        var6 = var1;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var275;
                                        int var244 = (var275 = var6 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                                        if (var244 != 0) {
                                            break label215;
                                        }

                                        String var187 = (String)var186;
                                        var188 = var187;
                                        switch (var1) {
                                            case -1956514349:
                                            default:
                                                var1 ^= 1319591918;
                                                break;
                                            case -1537305313:
                                                var1 <<= 20;
                                                var1 += -2046783098;
                                                var1 |= -148838103;
                                                var1 <<= 20;
                                                var1 ^= 1936232340;
                                                break;
                                            case 1075921957:
                                                var1 ^= -343063781;
                                        }
                                    } else {
                                        var1 |= -774868023;
                                        var1 -= 213598572;
                                        var1 ^= -2093197895;
                                        Integer var245 = var1;
                                        if (var245 == null) {
                                            break label215;
                                        }

                                        var188 = var211;
                                        var1 &= 214285035;
                                        var1 >>= 11;
                                        var1 &= -309088109;
                                        var1 ^= -280587243;
                                        var1 ^= 115219329;
                                    }

                                    var5 = var1;
                                    label195:
                                    if (var5 != null) {
                                        String var165;
                                        if (var188 == null) {
                                            var1 += 553575186;
                                            var1 *= -1129866653;
                                            var1 *= 1579127003;
                                            var1 ^= 85750800;
                                            var1 ^= 491424651;
                                            int var213 = var1 + 1;
                                            var213 = var1 * var213;
                                            var213 &= 1;
                                            if (var213 != 0) {
                                                break label195;
                                            }

                                            var213 = var2 + 1;
                                            var213 = var2 * var213;
                                            var213 &= 1;
                                            if (var213 != 0) {
                                                var1 &= -6050766;
                                                var1 &= -1593010254;
                                                var1 ^= 1846947830;
                                                break label254;
                                            }

                                            var1 &= 570302175;
                                            var1 += 2137173337;
                                            var1 &= -2116991468;
                                            var1 ^= 1781366233;
                                            var165 = var164;
                                            switch (var1) {
                                                case -349339699:
                                                    var1 ^= 277614824;
                                                    var1 >>= 15;
                                                    var1 -= -2043251832;
                                                    var1 ^= -2098159144;
                                                    break;
                                                case 834933288:
                                                    var1 ^= -1506220764;
                                                    break;
                                                case 1724836109:
                                                default:
                                                    var1 ^= -1694226226;
                                            }
                                        } else {
                                            var1 >>= 29;
                                            var1 |= 1492108874;
                                            var1 ^= -984513302;
                                            long var219 = var1;
                                            var251 = var219 + 1L;
                                            var251 = var219 * var251;
                                            long var220 = var251 & 1L;
                                            long var276;
                                            int var221 = (var276 = var220 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                            if (var221 != 0) {
                                                break label195;
                                            }

                                            var165 = var188;
                                            var1 ^= -2024640951;
                                            var1 -= -1088206792;
                                            var1 ^= 98692934;
                                        }

                                        Integer var189 = var1;
                                        if (var189 != null) {
                                            Pattern var190 = t;
                                            Matcher var191 = var190.matcher(var165);
                                            var184 = var191.matches() ? 1 : 0;
                                            long var222 = var2;
                                            var251 = var222 + 1L;
                                            var251 = var222 * var251;
                                            var9 = var222 + 2L;
                                            var251 *= var9;
                                            long var223 = var222 + 3L;
                                            var251 *= var223;
                                            long var224 = var251 & 7L;
                                            long var277;
                                            int var225 = (var277 = var224 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                                            if (var225 != 0) {
                                                var1 &= -2063421988;
                                                var1 *= -441121019;
                                                var1 &= 1397852967;
                                                var1 |= 1491946737;
                                                var1 ^= -1258559977;
                                                break label254;
                                            }
                                            var1 = switch (var1) {
                                                case -2044400915 -> var1 ^ -2048298893;
                                                case -80141726 -> {
                                                    var1 += -1696577691;
                                                    var1 -= 1183332479;
                                                    yield var1 ^ -2087335141;
                                                }
                                                default -> var1 ^ -128695462;
                                            };
                                            Integer var226 = var1;
                                            label183:
                                            if (var226 != null) {
                                                String var155;
                                                if (var184 != 0) {
                                                    var1 -= 1343291012;
                                                    var1 *= 783571023;
                                                    var1 &= 1501558876;
                                                    var1 += -98071019;
                                                    var1 ^= -1968774328;
                                                    long var193 = var1;
                                                    var6 = var193 + 1L;
                                                    var6 = var193 * var6;
                                                    long var194 = var6 & 1L;
                                                    long var278;
                                                    var184 = (var278 = var194 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                                                    if (var184 != 0) {
                                                        break label183;
                                                    }

                                                    String var166 = "key.keyboard." + var165;
                                                    long var196 = var2;
                                                    var6 = var196 + 1L;
                                                    var6 = var196 * var6;
                                                    long var197 = var6 & 1L;
                                                    long var279;
                                                    var2 = (var279 = var197 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                                                    if (var2 != 0) {
                                                        switch (var1) {
                                                            case -2001518360:
                                                            default:
                                                                var1 ^= -387561489;
                                                                break label254;
                                                            case -668236515:
                                                                var1 += 505233194;
                                                                var1 ^= 425619361;
                                                                break label254;
                                                            case 1164876709:
                                                                var1 ^= 702417433;
                                                                break label254;
                                                        }
                                                    }

                                                    var1 -= 494717387;
                                                    var1 -= -991685709;
                                                    var1 *= -2058364507;
                                                    var1 ^= 918852731;
                                                    var2 = var1 + 1;
                                                    var2 = var1 * var2;
                                                    var2 &= 1;
                                                    if (var2 != 0) {
                                                        break label183;
                                                    }

                                                    var155 = var166;
                                                    var1 += 1757145994;
                                                    var1 ^= -1091034989;
                                                } else {
                                                    var1 = switch (var1) {
                                                        case -1902462199 -> var1 ^ 686578898;
                                                        case -872089005 -> {
                                                            var1 -= 303112300;
                                                            var1 -= 572238630;
                                                            var1 |= 913066142;
                                                            var1 += -700275061;
                                                            yield var1 ^ 1011103176;
                                                        }
                                                        default -> var1 ^ 586345158;
                                                    };
                                                    var155 = null;
                                                    var1 >>>= 2;
                                                    var1 += -549299225;
                                                    var1 <<= 21;
                                                    var1 ^= 430182169;
                                                }

                                                long var167 = var1;
                                                long var227 = var167 + 1L;
                                                long var228 = var167 * var227;
                                                long var168 = var228 & 1L;
                                                long var280;
                                                var157 = (var280 = var168 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                                                if (var157 == 0) {
                                                    return var155;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalStateException var156 = new IllegalStateException();
                throw var156;
            }
        }

        RuntimeException var150 = new RuntimeException();
        throw var150;
    }

    public static List Wc() {
        int var0 = XW;
        var0 ^= -648591049;
        Map var2 = H;
        Set var15 = var2.keySet();
        ArrayList var1 = new ArrayList(var15);
        var0 ^= -907470715;
        var0 += 224913460;
        var0 &= 339116450;
        var0 ^= -1220278847;
        var0 ^= 1635533277;
        long var16 = var0;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var19;
        var0 = (var19 = var17 - 0L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
        if (var0 != 0) {
            RuntimeException var14 = new RuntimeException();
            throw var14;
        } else {
            boolean var13 = var1.add("none");
            return var1;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var4 = var0.lookupClass();
        int var1 = 1477976338;
        byte var2 = 0;
        int var5 = of_2.kj(var4, var1, var2);
        XW = var5;
        Pattern var6 = Pattern.compile("[a-z][a-z0-9.]*|[0-9]");
        t = var6;
        LinkedHashMap var7 = new LinkedHashMap();
        H = var7;
        HashMap var8 = new HashMap();
        K = var8;
        h("rshift", "right.shift", -1579909853);
        h("rctrl", "right.control", -1579909853);
        h("ralt", "right.alt", -1579909853);
        h("lshift", "left.shift", -1579909853);
        h("lctrl", "left.control", -1579909853);
        h("lalt", "left.alt", -1579909853);
        h("insert", "insert", -1579909853);
        h("delete", "delete", -1579909853);
        h("home", "home", -1579909853);
        h("end", "end", -1579909853);
        h("pageup", "page.up", -1579909853);
        h("pagedown", "page.down", -1579909853);
        h("grave", "grave.accent", -1579909853);
        h("tab", "tab", -1579909853);
        h("capslock", "caps.lock", -1579909853);
        byte var9 = 48;
        char var10 = (char)var9;

        while (var10 <= '9') {
            String var37 = "numpad" + var10;
            String var41 = "keypad." + var10;
            h(var37, var41, -1579909853);
            String var38 = "keypad." + var10;
            String[] var42 = new String[3];
            String var3 = "keypad" + var10;
            var42[0] = var3;
            var3 = "kp" + var10;
            var42[1] = var3;
            var3 = "num" + var10;
            var42[2] = var3;
            ei(var38, var42, -65599870);
            var1 = var10 + 1;
            char var40 = (char)var1;
            var10 = var40;
        }

        String[] var11 = new String[]{"rightshift"};
        ei("right.shift", var11, -65599870);
        String[] var12 = new String[]{"leftshift", "shift"};
        ei("left.shift", var12, -65599870);
        String[] var13 = new String[]{"rightctrl", "rightcontrol", "rcontrol"};
        ei("right.control", var13, -65599870);
        String[] var14 = new String[]{"leftctrl", "leftcontrol", "lcontrol", "ctrl", "control"};
        ei("left.control", var14, -65599870);
        String[] var15 = new String[]{"rightalt", "rmenu", "altgr", "ropt", "roption"};
        ei("right.alt", var15, -65599870);
        String[] var16 = new String[]{"leftalt", "lmenu", "alt", "lopt", "loption"};
        ei("left.alt", var16, -65599870);
        String[] var17 = new String[]{"rightwin", "rwin", "rsuper", "rcmd", "rmeta"};
        ei("right.win", var17, -65599870);
        String[] var18 = new String[]{"leftwin", "lwin", "lsuper", "lcmd", "lmeta"};
        ei("left.win", var18, -65599870);
        String[] var19 = new String[]{"ins"};
        ei("insert", var19, -65599870);
        String[] var20 = new String[]{"del"};
        ei("delete", var20, -65599870);
        String[] var21 = new String[]{"pgup", "prior"};
        ei("page.up", var21, -65599870);
        String[] var22 = new String[]{"pgdn", "pgdown", "next"};
        ei("page.down", var22, -65599870);
        String[] var23 = new String[]{"graveaccent", "tilde", "backtick"};
        ei("grave.accent", var23, -65599870);
        String[] var24 = new String[]{"caps"};
        ei("caps.lock", var24, -65599870);
        String[] var25 = new String[]{"numlock"};
        ei("num.lock", var25, -65599870);
        String[] var26 = new String[]{"scrolllock", "scroll"};
        ei("scroll.lock", var26, -65599870);
        String[] var27 = new String[]{"printscreen", "prtsc", "print"};
        ei("print.screen", var27, -65599870);
        String[] var28 = new String[]{"return"};
        ei("enter", var28, -65599870);
        String[] var29 = new String[]{"bksp", "back"};
        ei("backspace", var29, -65599870);
        String[] var30 = new String[]{"esc"};
        ei("escape", var30, -65599870);
        String[] var31 = new String[]{"leftbracket", "lbracket"};
        ei("left.bracket", var31, -65599870);
        String[] var32 = new String[]{"rightbracket", "rbracket"};
        ei("right.bracket", var32, -65599870);
        String[] var33 = new String[]{"quote"};
        ei("apostrophe", var33, -65599870);
        String[] var34 = new String[]{"dot"};
        ei("period", var34, -65599870);
        String[] var35 = new String[]{"equals"};
        ei("equal", var35, -65599870);
        String[] var36 = new String[]{"dash"};
        ei("minus", var36, -65599870);
    }
}
