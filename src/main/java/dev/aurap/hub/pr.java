package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class pr implements Ya_2 {
    private static final float n = 0.3F;
    private final du Yj;
    private final float pq;
    public static final int SL;

    private pr(du var1, float var2) {
        this.Yj = var1;
        this.pq = var2;
    }

    public static void QD(du var0, kP_2 var1, VA var2, float var3) {
        int var4 = SL;
        var4 ^= -2083178663;
        int var5 = System.identityHashCode(var0);
        du var6 = new du();
        pr var7 = new pr(var6, var3);
        int var8 = var5 + 1;
        var8 = var5 * var8;
        int var9 = var5 + 2;
        var8 *= var9;
        var5 += 3;
        var8 *= var5;
        var5 = var8 & 7;
        if (var5 != 0) {
            long var28 = switch (var4) {
                default -> var4 ^ -814353526;
                case 674995402 -> {
                    var4 -= 960870257;
                    yield var4 ^ -318086663;
                }
                case 815683834 -> var4 ^ 413993665;
            };
            long var10 = var28 + 1L;
            var10 = var28 * var10;
            long var12 = var28 + 2L;
            var10 *= var12;
            long var29 = var28 + 3L;
            var10 *= var29;
            long var30 = var10 & 7L;
            long var34;
            var5 = (var34 = var30 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var5 == 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            } else {
                AssertionError var23 = new AssertionError();
                throw var23;
            }
        } else {
            var4 ^= -524869167;
            var4 -= -1197469291;
            var4 ^= 888939891;
            var1.emit(var7, var2);
            var0.R(var6);
        }
    }

    @Override
    public void jG(float var1, float var2, float var3, float var4, float var5, int var6, float var7) {
        label223: {
            int var8 = SL;
            int var9 = var6;
            var8 ^= -1776111999;
            int var10 = System.identityHashCode(this);
            int var11 = var10 + 1;
            var11 = var10 * var11;
            int var12 = var10 + 2;
            var11 *= var12;
            var12 = var10 + 3;
            var11 *= var12;
            var11 &= 7;
            if (var11 != 0) {
                var8 -= 1481372034;
                var8 ^= -481166457;
                var8 ^= 1325605511;
            } else {
                var8 *= 1061420849;
                var8 ^= 1843296864;
                var8 ^= 1316107762;
                float var286;
                var11 = (var286 = var7 - 0.5F) == 0.0F ? 0 : (var286 < 0.0F ? -1 : 1);
                if (var11 < 0) {
                    switch (var8) {
                        case -2020879170:
                        default:
                            var8 ^= 1116737837;
                            break;
                        case -312235552:
                            var8 |= -1041825400;
                            var8 += 558498894;
                            var8 -= -202033505;
                            var8 ^= -1247485066;
                            break;
                        case 1540796726:
                            var8 ^= -365893043;
                    }

                    long var171 = var6;
                    long var182 = var171 + 1L;
                    var182 = var171 * var182;
                    long var193 = var171 + 2L;
                    var182 *= var193;
                    long var172 = var171 + 3L;
                    var182 *= var172;
                    long var173 = var182 & 7L;
                    long var287;
                    var11 = (var287 = var173 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                    if (var11 == 0) {
                        return;
                    }
                    break label223;
                }

                var8 &= -444658090;
                var8 *= 2092003891;
                var8 |= 1542182590;
                var8 ^= -926064784;
                float var164 = this.pq;
                float var165 = Math.max(var5, var164);
                float var166 = var165 * 0.5F;
                float var176 = this.pq;
                float var177 = 0.3F * var176;
                float var178 = var177 * 0.5F;
                float var167 = var166 + var178;
                float var168 = var167;
                float var179 = var3 - var1;
                float var180 = var179;
                float var13 = var4 - var2;
                float var181 = var13;
                float var14 = var179 * var179;
                float var15 = var13 * var13;
                var14 += var15;
                var14 = var14;
                int var188 = var10 + 1;
                int var189 = var10 * var188;
                int var190 = var189 & 1;
                if (var190 != 0) {
                    switch (var8) {
                        case 256886188:
                            var8 ^= 1322549726;
                            break;
                        case 321038734:
                            var8 ^= -112334650;
                            var8 ^= -1547858984;
                            break;
                        case 902223150:
                        default:
                            var8 ^= 513955971;
                    }
                } else {
                    var8 -= -1454414447;
                    var8 ^= 396761452;
                    byte var191 = 0;
                    int var192 = var191;

                    var8 = switch (var8) {
                        default -> var8 ^ 1580305022;
                        case 1963621641 -> var8 ^ -2078922762;
                        case 2121620113 -> {
                            var8 -= -2054772555;
                            var8 &= 613556164;
                            var8 >>>= 6;
                            yield var8 ^ 951821082;
                        }
                    };

                    label209:
                    while (true) {
                        if (var192 >= 17) {
                            switch (var8) {
                                case -356183045:
                                default:
                                    var8 ^= 599241578;
                                    break;
                                case 308165630:
                                    var8 ^= -1750487759;
                                    break;
                                case 943303517:
                                    var8 += -2127796084;
                                    var8 *= 43290899;
                                    var8 ^= -680191395;
                            }

                            var10 = var9 + 1;
                            var10 = var9 * var10;
                            var11 = var9 + 2;
                            var10 *= var11;
                            var11 = var9 + 3;
                            var10 *= var11;
                            var10 &= 7;
                            if (var10 == 0) {
                                return;
                            }
                            break label223;
                        }
                        var8 = switch (var8) {
                            default -> var8 ^ -1906519334;
                            case 57504516 -> var8 ^ 573537953;
                            case 943303517 -> {
                                var8 *= -1721824739;
                                var8 &= 1051334013;
                                var8 |= 1356886062;
                                yield var8 ^ 1813133157;
                            }
                        };
                        Integer var16 = var9;
                        if (var16 == null) {
                            break label223;
                        }

                        byte var194 = 0;
                        long var17 = var10;
                        long var19 = var17 + 1L;
                        var19 = var17 * var19;
                        long var21 = var17 + 2L;
                        var19 *= var21;
                        var17 += 3L;
                        var19 *= var17;
                        var17 = var19 & 7L;
                        long var288;
                        int var199 = (var288 = var17 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                        if (var199 != 0) {
                            switch (var8) {
                                case -304796152:
                                default:
                                    var8 ^= 1543937633;
                                    break label209;
                                case 250194427:
                                    var8 ^= -443194799;
                                    break label209;
                                case 922371658:
                                    var8 += 736095338;
                                    var8 |= 1765204513;
                                    var8 &= 1500837671;
                                    var8 <<= 15;
                                    var8 ^= 817908368;
                                    break label209;
                            }
                        }
                        var8 = switch (var8) {
                            default -> var8 ^ 1555607611;
                            case 922371658 -> {
                                var8 &= -149597516;
                                yield var8 ^ -1627325578;
                            }
                            case 949698014 -> var8 ^ -1237976211;
                        };
                        int var200 = var9 + 1;
                        int var201 = var9 * var200;
                        int var18 = var9 + 2;
                        int var202 = var201 * var18;
                        var18 = var9 + 3;
                        int var203 = var202 * var18;
                        int var204 = var203 & 7;
                        if (var204 != 0) {
                            break label223;
                        }

                        int var195 = var194;
                        var8 >>>= 28;
                        var8 <<= 28;
                        var8 ^= -1543769597;

                        while (true) {
                            Integer var205 = var9;
                            if (var205 == null) {
                                break label223;
                            }

                            if (var195 >= 17) {
                                var8 = switch (var8) {
                                    default -> var8 ^ -281496583;
                                    case 66843139 -> {
                                        var8 <<= 4;
                                        var8 |= 2025468802;
                                        yield var8 ^ -1902176720;
                                    }
                                    case 839519006 -> var8 ^ -1383016341;
                                };
                                var195 = var192 + 1;
                                int var219 = var10 + 1;
                                int var220 = var10 * var219;
                                var18 = var10 + 2;
                                int var221 = var220 * var18;
                                var18 = var10 + 3;
                                int var222 = var221 * var18;
                                int var223 = var222 & 7;
                                if (var223 != 0) {
                                    switch (var8) {
                                        case -2129950274:
                                        default:
                                            var8 ^= -1641565012;
                                            break label209;
                                        case -249551486:
                                            var8 += 138586547;
                                            var8 ^= -1330641499;
                                            break label209;
                                        case 1673339660:
                                            var8 ^= -924924985;
                                            break label209;
                                    }
                                }

                                var8 -= -130351781;
                                var8 += -1253981156;
                                var8 >>= 26;
                                var8 ^= -810048917;
                                var8 ^= 1550237843;
                                var192 = var195;
                                var8 -= 755537700;
                                var8 ^= 119516850;
                                break;
                            }

                            var8 |= 1170427034;
                            var8 ^= -321534473;
                            var17 = var9;
                            var19 = var17 + 1L;
                            var19 = var17 * var19;
                            var17 = var19 & 1L;
                            long var289;
                            int var208 = (var289 = var17 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                            if (var208 != 0) {
                                break label223;
                            }

                            int var209 = var8 & -379322637;
                            int var210 = var209 ^ -438399960;
                            float var211 = this.Ka(var195, var210);
                            var18 = var8 - 2075531592;
                            var18 ^= 1669633132;
                            float var227 = this.Ka(var192, var18);
                            Integer var247 = var10;
                            if (var247 == null) {
                                var8 += 520657125;
                                var8 -= -1644854132;
                                var8 *= -1488997035;
                                var8 *= 1186516287;
                                var8 ^= 570385223;
                                break label209;
                            }

                            var8 += -1087043819;
                            var8 >>>= 22;
                            var8 ^= -770288499;
                            var8 ^= -1121461947;
                            var19 = var9;
                            var21 = var19 + 1L;
                            var21 = var19 * var21;
                            var19 = var21 & 1L;
                            long var290;
                            int var250 = (var290 = var19 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                            if (var250 != 0) {
                                break label223;
                            }

                            float var291;
                            int var251 = (var291 = var14 - 1.0E-6F) == 0.0F ? 0 : (var291 < 0.0F ? -1 : 1);
                            float var252;
                            if (var251 <= 0) {
                                var8 -= 933880379;
                                var8 *= -359050211;
                                var8 -= -1761184499;
                                var8 &= 586314415;
                                var8 ^= 1619141605;
                                var252 = 0.0F;
                                switch (var8) {
                                    case -1993001678:
                                    default:
                                        var8 ^= -1097184207;
                                        break;
                                    case 857050081:
                                        var8 ^= 1600007551;
                                        break;
                                    case 1113613284:
                                        var8 ^= -259305245;
                                        var8 ^= -1309091518;
                                }
                            } else {
                                var8 >>>= 19;
                                var8 -= -840037406;
                                var8 <<= 2;
                                var8 -= 246339724;
                                var8 ^= -142958661;
                                float var20 = var211 - var1;
                                var20 *= var180;
                                float var278 = var227 - var2;
                                float var279 = var278 * var181;
                                Integer var22 = var10;
                                if (var22 == null) {
                                    switch (var8) {
                                        case -885083522:
                                        default:
                                            var8 ^= -1161217030;
                                            break label209;
                                        case 1323544639:
                                            var8 ^= -2008066107;
                                            var8 ^= -1887556246;
                                            break label209;
                                        case 1577016354:
                                            var8 ^= -1371746085;
                                            break label209;
                                    }
                                }

                                var8 += -446401839;
                                var8 >>>= 23;
                                var8 &= 493112873;
                                var8 ^= -96008114;
                                var8 ^= -945774663;
                                var22 = var9;
                                if (var22 == null) {
                                    break label223;
                                }

                                var20 += var279;
                                var20 /= var14;
                                var20 = Math.min(1.0F, var20);
                                var20 = Math.max(0.0F, var20);
                                var252 = var20;
                                switch (var8) {
                                    case -1518888350:
                                    default:
                                        var8 ^= -1838957490;
                                        break;
                                    case 1038587871:
                                        var8 *= -150701691;
                                        var8 ^= 730179486;
                                        break;
                                    case 1898780173:
                                        var8 ^= 1854487378;
                                }
                            }

                            long var266 = var9;
                            long var281 = var266 + 1L;
                            var281 = var266 * var281;
                            long var24 = var266 + 2L;
                            var281 *= var24;
                            var266 += 3L;
                            var281 *= var266;
                            var266 = var281 & 7L;
                            long var292;
                            int var269 = (var292 = var266 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                            if (var269 != 0) {
                                break label223;
                            }

                            float var270 = var180 * var252;
                            float var271 = var1 + var270;
                            float var212 = var211 - var271;
                            float var253 = var181 * var252;
                            float var254 = var2 + var253;
                            float var228 = var227 - var254;
                            float var213 = var212 * var212;
                            float var229 = var228 * var228;
                            int var255 = var10 + 1;
                            int var256 = var10 * var255;
                            int var257 = var256 & 1;
                            if (var257 != 0) {
                                switch (var8) {
                                    case -749094650:
                                    default:
                                        var8 ^= -118253444;
                                        break label209;
                                    case 51636805:
                                        var8 <<= 13;
                                        var8 |= -852499921;
                                        var8 &= -24497445;
                                        var8 ^= -1244075877;
                                        break label209;
                                    case 568287676:
                                        var8 ^= 1931452119;
                                        break label209;
                                }
                            }

                            var8 ^= 2146406552;
                            var8 += 853383740;
                            var8 ^= -1805686112;
                            Integer var258 = var9;
                            if (var258 == null) {
                                break label223;
                            }

                            float var214 = var213 + var229;
                            float var230 = var168 * var168;
                            float var293;
                            int var215 = (var293 = var214 - var230) == 0.0F ? 0 : (var293 < 0.0F ? -1 : 1);
                            if (var215 <= 0) {
                                var8 |= 1984205139;
                                var8 += 205961840;
                                var8 ^= -1792905422;
                                var8 ^= -1065227354;
                                int var216 = var8 | -1814416886;
                                int var217 = var216 ^ 445732524;
                                this.b(var195, var192, var6, var217);
                                var8 &= -325420940;
                                var8 ^= -1963082940;
                            } else {
                                var8 += 1775256066;
                                var8 ^= -417185141;
                            }

                            int var218 = var195 + 1;
                            long var231 = var10;
                            var266 = var231 + 1L;
                            var266 = var231 * var266;
                            var281 = var231 + 2L;
                            var266 *= var281;
                            long var232 = var231 + 3L;
                            var266 *= var232;
                            long var233 = var266 & 7L;
                            long var294;
                            var18 = (var294 = var233 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                            if (var18 != 0) {
                                var8 <<= 30;
                                var8 >>>= 14;
                                var8 >>>= 18;
                                var8 ^= 1238551184;
                                break label209;
                            }

                            var8 -= -1706034633;
                            var8 &= 779407501;
                            var8 -= 869985495;
                            var8 ^= 1097290801;
                            var18 = var9 + 1;
                            var18 = var9 * var18;
                            int var259 = var9 + 2;
                            var18 *= var259;
                            int var260 = var9 + 3;
                            var18 *= var260;
                            var18 &= 7;
                            if (var18 != 0) {
                                break label223;
                            }

                            var195 = var218;
                            switch (var8) {
                                case -1630521339:
                                default:
                                    var8 ^= 839832118;
                                    break;
                                case -1255225469:
                                    var8 += -625218067;
                                    var8 ^= -1945024653;
                                    break;
                                case -1001048457:
                                    var8 ^= -840869354;
                            }
                        }
                    }
                }
            }

            var8 = var9 + 1;
            var8 = var9 * var8;
            var10 = var9 + 2;
            var8 *= var10;
            var9 += 3;
            var8 *= var9;
            var8 &= 7;
            if (var8 == 0) {
                IllegalStateException var151 = new IllegalStateException();
                throw var151;
            }
        }

        IllegalStateException var150 = new IllegalStateException();
        throw var150;
    }

    @Override
    public void a(float var1, float var2, float var3, int var4, float var5) {
        label141: {
            int var6 = SL;
            int var7 = var4;
            var6 ^= 178209100;
            int var8 = System.identityHashCode(this);
            float var201;
            int var9 = (var201 = var5 - 0.5F) == 0.0F ? 0 : (var201 < 0.0F ? -1 : 1);
            long var10 = var8;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            long var14 = var10 + 2L;
            var12 *= var14;
            var10 += 3L;
            var12 *= var10;
            var10 = var12 & 7L;
            long var202;
            int var122 = (var202 = var10 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
            if (var122 != 0) {
                var6 += -660539487;
                var6 |= -2027362909;
                var6 >>= 27;
                var6 ^= 1353811031;
            } else {
                var6 &= 1735206815;
                var6 ^= 1843874277;
                Integer var123 = var4;
                if (var123 == null) {
                    break label141;
                }

                if (var9 < 0) {
                    switch (var6) {
                        case 333228039:
                            var6 ^= 1754897637;
                            break;
                        case 911133903:
                        default:
                            var6 ^= -1836801481;
                            break;
                        case 1283877754:
                            var6 *= -1172134655;
                            var6 &= 118292162;
                            var6 >>= 9;
                            var6 ^= 1885141434;
                    }

                    long var117 = var4;
                    long var138 = var117 + 1L;
                    var138 = var117 * var138;
                    long var118 = var138 & 1L;
                    long var203;
                    var9 = (var203 = var118 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                    if (var9 == 0) {
                        return;
                    }
                    break label141;
                }

                var6 += -14165498;
                var6 += -123043288;
                var6 |= -1336769246;
                var6 -= 487122388;
                var6 ^= 2100637025;
                Integer var111 = var4;
                if (var111 == null) {
                    break label141;
                }

                float var112 = this.pq;
                float var113 = var112 * 0.5F;
                float var114 = Math.max(var3, var113);
                var10 = var8;
                var12 = var10 + 1L;
                var12 = var10 * var12;
                var10 = var12 & 1L;
                long var204;
                int var126 = (var204 = var10 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                if (var126 == 0) {
                    var6 = switch (var6) {
                        case -1436234569 -> {
                            var6 &= 1213162109;
                            var6 >>>= 24;
                            var6 ^= -320425354;
                            yield var6 ^ 1829501331;
                        }
                        case 198019742 -> var6 ^ -674390716;
                        default -> var6 ^ -1305719255;
                    };
                    Integer var127 = var4;
                    if (var127 == null) {
                        break label141;
                    }

                    float var128 = this.pq;
                    float var129 = 0.3F * var128;
                    float var130 = var129 * 0.5F;
                    float var115 = var114 + var130;
                    float var116 = var115;
                    byte var131 = 0;
                    int var132 = var131;
                    var6 &= -432386912;
                    var6 &= -366555442;
                    var6 ^= 1018424190;

                    label133:
                    while (true) {
                        if (var132 >= 17) {
                            var6 &= 481792068;
                            var6 ^= 1229019318;
                            var6 ^= 1941559563;
                            var8 = var7 + 1;
                            var8 = var7 * var8;
                            var7 = var8 & 1;
                            if (var7 == 0) {
                                return;
                            }
                            break label141;
                        }

                        var6 *= -518166727;
                        var6 -= 1995449348;
                        var6 -= 709044204;
                        var6 |= -1066489690;
                        var6 ^= -1808293611;
                        long var11 = var7;
                        long var13 = var11 + 1L;
                        var13 = var11 * var13;
                        var11 = var13 & 1L;
                        long var205;
                        int var134 = (var205 = var11 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                        if (var134 != 0) {
                            break label141;
                        }

                        byte var135 = 0;
                        int var145 = var8 + 1;
                        int var146 = var8 * var145;
                        int var177 = var8 + 2;
                        int var147 = var146 * var177;
                        int var178 = var8 + 3;
                        int var148 = var147 * var178;
                        int var149 = var148 & 7;
                        if (var149 != 0) {
                            var6 ^= 1843161838;
                            var6 += 256491926;
                            var6 ^= -1820092301;
                            break;
                        }

                        var6 &= -268660761;
                        var6 >>>= 11;
                        var6 -= -635268550;
                        var6 ^= -941640861;
                        var12 = var7;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var206;
                        int var152 = (var206 = var12 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                        if (var152 != 0) {
                            break label141;
                        }

                        int var136 = var135;

                        var6 = switch (var6) {
                            default -> var6 ^ 970614629;
                            case -499463260 -> {
                                var6 &= 266894582;
                                yield var6 ^ 1063706408;
                            }
                            case 957403187 -> var6 ^ -2066023053;
                        };

                        while (true) {
                            Integer var153 = var7;
                            if (var153 == null) {
                                break label141;
                            }

                            if (var136 >= 17) {
                                var6 |= 601221168;
                                var6 &= -1482282582;
                                var6 |= -1490225628;
                                var6 *= 208208765;
                                var6 ^= -924552948;
                                int var137 = var132 + 1;
                                var12 = var8;
                                var14 = var12 + 1L;
                                var14 = var12 * var14;
                                long var16 = var12 + 2L;
                                var14 *= var16;
                                var12 += 3L;
                                var14 *= var12;
                                var12 = var14 & 7L;
                                long var210;
                                int var175 = (var210 = var12 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                                if (var175 != 0) {
                                    var6 |= -730011680;
                                    var6 ^= -635683195;
                                    var6 <<= 14;
                                    var6 ^= -619496536;
                                    break label133;
                                }

                                var6 *= 16085387;
                                var6 ^= 641733444;
                                var132 = var137;
                                var6 += 1719484253;
                                var6 ^= 1188115599;
                                break;
                            }

                            var6 ^= -166386356;
                            var6 *= 966654755;
                            var6 >>= 19;
                            var6 += 1396476222;
                            var6 ^= 650500437;
                            int var154 = var6 << 6;
                            int var155 = var154 * -862247071;
                            int var156 = var155 ^ 550971592;
                            float var157 = this.Ka(var136, var156);
                            float var158 = var157 - var1;
                            int var179 = var6 * -362025495;
                            int var180 = var179 ^ -2051224830;
                            float var181 = this.Ka(var132, var180);
                            float var182 = var181 - var2;
                            float var159 = var158 * var158;
                            Integer var191 = var8;
                            if (var191 == null) {
                                var6 ^= -2104025993;
                                var6 ^= -1431443265;
                                var6 ^= -225583654;
                                break label133;
                            }

                            var6 *= -2034291395;
                            var6 ^= 1113514408;
                            var6 ^= 1796917405;
                            float var183 = var182 * var182;
                            float var160 = var159 + var183;
                            float var184 = var116 * var116;
                            float var207;
                            int var161 = (var207 = var160 - var184) == 0.0F ? 0 : (var207 < 0.0F ? -1 : 1);
                            if (var161 <= 0) {
                                var6 &= 373937587;
                                var6 ^= 533898658;
                                Integer var162 = var7;
                                if (var162 == null) {
                                    break label141;
                                }

                                int var163 = var6 & 1187209409;
                                int var164 = var163 >> 4;
                                int var165 = var164 | -1195409867;
                                int var166 = var165 ^ 1449095415;
                                int var167 = var166 ^ 797861529;
                                this.b(var136, var132, var4, var167);
                                var6 >>= 7;
                                var6 += -489519694;
                                var6 ^= -1730069058;
                            } else {
                                var6 -= 1633047624;
                                var6 >>= 9;
                                var6 <<= 4;
                                var6 ^= -2054309979;
                            }

                            var12 = var7;
                            var14 = var12 + 1L;
                            var14 = var12 * var14;
                            var12 = var14 & 1L;
                            long var208;
                            int var170 = (var208 = var12 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                            if (var170 != 0) {
                                break label141;
                            }

                            int var171 = var136 + 1;
                            var13 = var8;
                            long var15 = var13 + 1L;
                            var15 = var13 * var15;
                            long var17 = var13 + 2L;
                            var15 *= var17;
                            var13 += 3L;
                            var15 *= var13;
                            var13 = var15 & 7L;
                            long var209;
                            int var188 = (var209 = var13 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                            if (var188 != 0) {
                                var6 += -849391812;
                                var6 -= 1991585852;
                                var6 ^= 2111628397;
                                break label133;
                            }
                            var6 = switch (var6) {
                                case -622578614 -> var6 ^ 1902911252;
                                default -> var6 ^ -1403211631;
                                case 2078834885 -> {
                                    var6 *= 1596489873;
                                    var6 -= -22832350;
                                    var6 |= 1775871864;
                                    yield var6 ^ -941552942;
                                }
                            };
                            var136 = var171;
                            var6 -= -1895737383;
                            var6 ^= -1605160356;
                        }
                    }
                } else {
                    switch (var6) {
                        case -1436234569:
                            var6 |= 34226991;
                            var6 *= 2005676021;
                            var6 <<= 18;
                            var6 ^= 610433960;
                            break;
                        case -650012389:
                        default:
                            var6 ^= -1387173077;
                            break;
                        case 563310774:
                            var6 ^= -682282564;
                    }
                }
            }

            RuntimeException var100 = new RuntimeException();
            throw var100;
        }

        RuntimeException var107 = new RuntimeException();
        throw var107;
    }

    @Override
    public void ag(float var1, float var2, float var3, float var4, float var5, float var6, int var7, float var8) {
        label220: {
            int var9 = SL;
            int var10 = var7;
            var9 ^= 2042854270;
            int var11 = System.identityHashCode(this);
            int var12 = var11 + 1;
            var12 = var11 * var12;
            int var13 = var11 + 2;
            var12 *= var13;
            var13 = var11 + 3;
            var12 *= var13;
            var12 &= 7;
            if (var12 != 0) {
                var9 |= -779794816;
                var9 *= -984000681;
                var9 &= -2080672433;
                var9 ^= 1425626384;
                var9 ^= 220878029;
            } else {
                var9 += 880906300;
                var9 |= 2039144467;
                var9 ^= 1782799957;
                float var297;
                var12 = (var297 = var8 - 0.5F) == 0.0F ? 0 : (var297 < 0.0F ? -1 : 1);
                if (var12 < 0) {
                    switch (var9) {
                        case -566567365:
                        default:
                            var9 ^= 1982011323;
                            break;
                        case 367837038:
                            var9 ^= 1314903960;
                            var9 &= 704141513;
                            var9 |= -456255465;
                            var9 ^= -1747092392;
                            break;
                        case 824168442:
                            var9 ^= -1973162299;
                    }

                    var12 = var7 + 1;
                    var12 = var7 * var12;
                    var12 &= 1;
                    if (var12 == 0) {
                        return;
                    }
                    break label220;
                }
                var9 = switch (var9) {
                    default -> var9 ^ -1906185122;
                    case 367837038 -> {
                        var9 >>>= 18;
                        var9 += -32621599;
                        yield var9 ^ -1914347287;
                    }
                    case 1572280781 -> var9 ^ -588163278;
                };
                Integer var181 = var7;
                if (var181 == null) {
                    break label220;
                }

                float var182 = this.pq;
                float var183 = Math.max(var4, var182);
                float var184 = var183 * 0.5F;
                float var191 = this.pq;
                float var192 = 0.3F * var191;
                float var193 = var192 * 0.5F;
                float var185 = var184 + var193;
                float var186 = var185;
                long var194 = var11;
                long var15 = var194 + 1L;
                var15 = var194 * var15;
                long var195 = var15 & 1L;
                long var298;
                var13 = (var298 = var195 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                if (var13 == 0) {
                    var9 ^= 129870059;
                    var9 -= 1041715448;
                    var9 ^= 83492668;
                    Integer var197 = var7;
                    if (var197 == null) {
                        break label220;
                    }

                    float var198 = (float) (Math.PI * 2);
                    float var14 = var198 - 1.0E-4F;
                    float var299;
                    int var201 = (var299 = var6 - var14) == 0.0F ? 0 : (var299 < 0.0F ? -1 : 1);
                    boolean var205;
                    if (var201 >= 0) {
                        var9 &= 915755651;
                        var9 <<= 22;
                        var9 ^= -527157638;
                        long var202 = var7;
                        long var16 = var202 + 1L;
                        var16 = var202 * var16;
                        long var203 = var16 & 1L;
                        long var300;
                        int var204 = (var300 = var203 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                        if (var204 != 0) {
                            break label220;
                        }

                        var205 = true;
                        var9 -= 1161081527;
                        var9 ^= -1650912250;
                    } else {
                        var9 = switch (var9) {
                            default -> var9 ^ 1490744641;
                            case 675834132 -> var9 ^ 1086799485;
                            case 851887962 -> {
                                var9 |= 2061052368;
                                var9 *= 8190021;
                                var9 ^= -1327315315;
                                var9 >>= 30;
                                yield var9 ^ -813964142;
                            }
                        };
                        Integer var208 = var7;
                        if (var208 == null) {
                            break label220;
                        }

                        var205 = false;
                        var9 >>>= 3;
                        var9 *= -8100785;
                        var9 -= 664816857;
                        var9 -= -291322572;
                        var9 ^= 338069331;
                    }

                    boolean var206 = var205;
                    Integer var209 = var11;
                    if (var209 != null) {
                        var9 += -1517282591;
                        var9 &= -124229815;
                        var9 ^= -496970083;
                        int var210 = var7 + 1;
                        int var211 = var7 * var210;
                        int var212 = var211 & 1;
                        if (var212 != 0) {
                            break label220;
                        }

                        byte var213 = 0;
                        int var214 = var213;
                        var9 ^= -1087601532;
                        var9 >>= 11;
                        var9 ^= -791911898;

                        label210:
                        while (true) {
                            Integer var216 = var10;
                            if (var216 == null) {
                                break label220;
                            }

                            if (var214 >= 17) {
                                var9 >>= 7;
                                var9 ^= 804396716;
                                long var172 = var10;
                                long var199 = var172 + 1L;
                                long var200 = var172 * var199;
                                long var173 = var200 & 1L;
                                long var301;
                                var11 = (var301 = var173 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                                if (var11 == 0) {
                                    return;
                                }
                                break label220;
                            }

                            var9 *= -2045911011;
                            var9 -= -1213245108;
                            var9 *= -1580920353;
                            var9 ^= -273149190;
                            byte var217 = 0;
                            Integer var17 = var11;
                            if (var17 == null) {
                                var9 &= 818827271;
                                var9 >>= 2;
                                var9 *= -1970253323;
                                var9 -= 1422439058;
                                var9 ^= -1039365195;
                                break;
                            }
                            var9 = switch (var9) {
                                default -> var9 ^ 1683970836;
                                case 1370817342 -> {
                                    var9 &= 1844149347;
                                    var9 &= 1728595366;
                                    var9 ^= 1009161387;
                                    yield var9 ^ 2075530569;
                                }
                                case 2043981728 -> var9 ^ -1569490438;
                            };
                            int var221 = var10 + 1;
                            var221 = var10 * var221;
                            var221 &= 1;
                            if (var221 != 0) {
                                break label220;
                            }

                            int var218 = var217;
                            var9 -= -91705719;
                            var9 ^= -476721622;

                            while (true) {
                                Integer var224 = var10;
                                if (var224 == null) {
                                    break label220;
                                }

                                if (var218 >= 17) {
                                    var9 *= -1151305633;
                                    var9 *= 1414111177;
                                    var9 |= -1846928403;
                                    var9 ^= -926635450;
                                    Integer var219 = var10;
                                    if (var219 == null) {
                                        break label220;
                                    }

                                    int var220 = var214 + 1;
                                    var224 = var11;
                                    if (var224 == null) {
                                        switch (var9) {
                                            case -1213943035:
                                            default:
                                                var9 ^= -1427410842;
                                                break label210;
                                            case 489402809:
                                                var9 -= -2030350638;
                                                var9 -= -1731392293;
                                                var9 ^= -1523367206;
                                                break label210;
                                            case 1660892642:
                                                var9 ^= 1730528755;
                                                break label210;
                                        }
                                    }

                                    var9 ^= 2041976317;
                                    var9 += -672925464;
                                    var9 ^= 437444227;
                                    long var245 = var10;
                                    long var291 = var245 + 1L;
                                    var291 = var245 * var291;
                                    long var246 = var291 & 1L;
                                    long var302;
                                    int var247 = (var302 = var246 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                                    if (var247 != 0) {
                                        break label220;
                                    }

                                    var214 = var220;
                                    var9 &= -1216464358;
                                    var9 *= 815169329;
                                    var9 ^= -1701609406;
                                    break;
                                }

                                var9 += -1432538340;
                                var9 -= 2122934408;
                                var9 ^= 1780664480;
                                int var225 = var9 | 1671079436;
                                var225 &= 1674230614;
                                var225 ^= 796269916;
                                float var228 = this.Ka(var218, var225);
                                float var229 = var228 - var1;
                                Integer var18 = var11;
                                if (var18 == null) {
                                    var9 |= -852796101;
                                    var9 *= -1974954715;
                                    var9 ^= 1045605969;
                                    break label210;
                                }

                                var9 >>= 24;
                                var9 |= -734660270;
                                var9 >>= 10;
                                var9 ^= -2142687004;
                                var9 ^= -886354005;
                                int var248 = var9 | -1530500161;
                                var248 ^= -131346953;
                                float var250 = this.Ka(var214, var248);
                                float var251 = var250 - var2;
                                float var19 = var229 * var229;
                                float var20 = var251 * var251;
                                var19 += var20;
                                double var271 = var19;
                                double var272 = Math.sqrt(var271);
                                var19 = (float)var272;
                                var19 -= var3;
                                var19 = Math.abs(var19);
                                float var303;
                                int var276 = (var303 = var19 - var186) == 0.0F ? 0 : (var303 < 0.0F ? -1 : 1);
                                if (var276 > 0) {
                                    var9 -= -1898040286;
                                    var9 *= 888663479;
                                    var9 *= 539979461;
                                    var9 ^= -624118358;
                                    int var277 = var10 + 1;
                                    int var278 = var10 * var277;
                                    int var293 = var10 + 2;
                                    int var279 = var278 * var293;
                                    int var294 = var10 + 3;
                                    int var280 = var279 * var294;
                                    int var281 = var280 & 7;
                                    if (var281 != 0) {
                                        break label220;
                                    }

                                    var9 >>= 10;
                                    var9 |= -1036000;
                                    var9 &= -1520860890;
                                    var9 &= -1758809021;
                                    var9 ^= -1995065202;
                                } else {
                                    label229: {
                                        var9 >>= 22;
                                        var9 += -1979718921;
                                        var9 ^= 628166762;
                                        long var282 = var10;
                                        long var21 = var282 + 1L;
                                        var21 = var282 * var21;
                                        long var283 = var21 & 1L;
                                        long var304;
                                        int var284 = (var304 = var283 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                                        if (var284 != 0) {
                                            break label220;
                                        }

                                        if (!var206) {
                                            var9 -= 80156669;
                                            var9 >>= 22;
                                            var9 ^= -709669285;
                                            var9 ^= -48151703;
                                            double var252 = var251;
                                            double var295 = var229;
                                            double var230 = Math.atan2(var252, var295);
                                            float var231 = (float)var230;
                                            float var232 = var231 - var5;
                                            var248 = var11 + 1;
                                            var248 = var11 * var248;
                                            int var285 = var11 + 2;
                                            var248 *= var285;
                                            int var286 = var11 + 3;
                                            var248 *= var286;
                                            var248 &= 7;
                                            if (var248 != 0) {
                                                var9 -= 1608276355;
                                                var9 ^= 801214204;
                                                break label210;
                                            }

                                            var9 *= 1763129719;
                                            var9 -= -1633762228;
                                            var9 ^= -1198906700;
                                            var9 *= 1377397833;
                                            var9 ^= -891755901;
                                            Integer var258 = var10;
                                            if (var258 == null) {
                                                break label220;
                                            }

                                            float var259 = var232 / var198;
                                            double var260 = var259;
                                            double var261 = Math.floor(var260);
                                            float var262 = (float)var261;
                                            float var263 = var198 * var262;
                                            float var264 = var232 - var263;
                                            float var305;
                                            var225 = (var305 = var264 - var6) == 0.0F ? 0 : (var305 < 0.0F ? -1 : 1);
                                            if (var225 > 0) {
                                                var9 += -1378586700;
                                                var9 ^= -419740291;
                                                var9 *= 308586155;
                                                var9 ^= 1843323203;
                                                long var234 = var10;
                                                long var287 = var234 + 1L;
                                                long var288 = var234 * var287;
                                                long var235 = var288 & 1L;
                                                long var306;
                                                var225 = (var306 = var235 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                                                if (var225 != 0) {
                                                    break label220;
                                                }

                                                var9 -= -2097534706;
                                                var9 += 891760245;
                                                var9 |= 375527778;
                                                var9 ^= -41698674;
                                                var9 ^= -1897301657;
                                                break label229;
                                            }

                                            var9 >>>= 26;
                                            var9 ^= 1647565138;
                                        } else {
                                            switch (var9) {
                                                case -1683252421:
                                                default:
                                                    var9 ^= -1941398946;
                                                    break;
                                                case -1399918173:
                                                    var9 ^= -2131859594;
                                                    var9 += 66334411;
                                                    var9 >>= 4;
                                                    var9 <<= 9;
                                                    var9 ^= 1756065092;
                                                    break;
                                                case -1239350274:
                                                    var9 ^= 1043099931;
                                            }
                                        }

                                        Integer var237 = var10;
                                        if (var237 == null) {
                                            break label220;
                                        }

                                        int var238 = var9 ^ -502252480;
                                        var238 *= -150526185;
                                        var238 >>>= 14;
                                        var238 ^= -1049755465;
                                        this.b(var218, var214, var7, var238);
                                        var9 &= -720658259;
                                        var9 *= -1679916109;
                                        var9 += -237860835;
                                        var9 ^= -501076377;
                                    }
                                }

                                Integer var242 = var10;
                                if (var242 == null) {
                                    break label220;
                                }

                                int var243 = var218 + 1;
                                var248 = var11 + 1;
                                var248 = var11 * var248;
                                int var289 = var11 + 2;
                                var248 *= var289;
                                int var290 = var11 + 3;
                                var248 *= var290;
                                var248 &= 7;
                                if (var248 != 0) {
                                    var9 += 709147339;
                                    var9 ^= -202320695;
                                    var9 -= -821916256;
                                    var9 ^= -1361146586;
                                    break label210;
                                }
                                var9 = switch (var9) {
                                    case -1719420978 -> var9 ^ -1235765950;
                                    case 203241614 -> {
                                        var9 += -880295214;
                                        var9 += -857773509;
                                        var9 |= 406681231;
                                        yield var9 ^ 1665403230;
                                    }
                                    default -> var9 ^ -649894989;
                                };
                                var218 = var243;
                                var9 &= 1216618503;
                                var9 ^= -1491976932;
                            }
                        }
                    } else {
                        var9 *= -411163437;
                        var9 ^= 1142516413;
                        var9 >>= 24;
                        var9 ^= -873406277;
                        var9 ^= 1818168267;
                    }
                } else {
                    var9 ^= 1041984363;
                    var9 |= -2091066552;
                    var9 |= 331723265;
                    var9 ^= -2018644215;
                }
            }

            var9 = var10 + 1;
            var9 = var10 * var9;
            var11 = var10 + 2;
            var9 *= var11;
            var10 += 3;
            var9 *= var10;
            var9 &= 7;
            if (var9 == 0) {
                RuntimeException var163 = new RuntimeException();
                throw var163;
            }
        }

        IllegalArgumentException var170 = new IllegalArgumentException();
        throw var170;
    }

    private float Ka(int var1, int var2) {
        int var5 = System.identityHashCode(this);
        int var6 = var1 - 8;
        long var7 = var5;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var33;
        var5 = (var33 = var7 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var3 = var2 ^ 1131516659;
            var3 |= -735257191;
            var3 += 849949646;
            var3 ^= 1636241204;
            Integer var24 = var1;
            if (var24 != null) {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        } else {
            int var14 = var2 | 642310873;
            var14 *= -1523914437;
            var14 ^= -1176814407;
            long var17 = var1;
            var7 = var17 + 1L;
            var7 = var17 * var7;
            var9 = var17 + 2L;
            var7 *= var9;
            long var18 = var17 + 3L;
            var7 *= var18;
            long var19 = var7 & 7L;
            long var34;
            var14 = (var34 = var19 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var14 == 0) {
                float var22 = var6;
                float var4 = this.pq;
                return var22 * var4;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    private void b(int var1, int var2, int var3, int var4) {
        label73: {
            label72: {
                int var7 = System.identityHashCode(this);
                long var8 = var7;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                var8 = var10 & 1L;
                long var97;
                int var73 = (var97 = var8 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                if (var73 == 0) {
                    int var5 = var4 >> 3;
                    var5 &= -1038190190;
                    var5 ^= 1305914650;
                    int var74 = var1 + 1;
                    int var75 = var1 * var74;
                    int var9 = var1 + 2;
                    int var76 = var75 * var9;
                    var9 = var1 + 3;
                    int var77 = var76 * var9;
                    int var78 = var77 & 7;
                    if (var78 != 0) {
                        break label73;
                    }

                    byte var79;
                    if (var3 == 1) {
                        var5 = switch (var5) {
                            case -1915034600 -> {
                                var5 |= 1325196152;
                                var5 >>>= 9;
                                yield var5 ^ -2105034375;
                            }
                            default -> var5 ^ 1823860937;
                            case 1097806835 -> var5 ^ -1450444505;
                        };
                        var79 = 2;
                        var5 += 1129988877;
                        var5 *= 1283567963;
                        var5 |= -322929107;
                        var5 ^= 2066289920;
                    } else {
                        var5 = switch (var5) {
                            case -1915034600 -> {
                                var5 *= -374560703;
                                var5 &= 1295487829;
                                var5 >>>= 2;
                                var5 |= -659018394;
                                yield var5 ^ 1475428862;
                            }
                            default -> var5 ^ 830215744;
                            case -186875159 -> var5 ^ 360908131;
                        };
                        var79 = 1;
                        var5 &= -726597731;
                        var5 ^= 63391541;
                    }

                    du var81 = this.Yj;
                    Integer var89 = var7;
                    if (var89 == null) {
                        var5 &= 160031712;
                        var5 ^= -1063638384;
                    } else {
                        var5 ^= -464571216;
                        var5 |= -1015137563;
                        var5 *= -1290282763;
                        var5 ^= -1279795917;
                        Integer var90 = var1;
                        if (var90 == null) {
                            break label73;
                        }

                        byte var82 = var81.q(var1, var2);
                        if (var82 == 2) {
                            var5 -= 1699497714;
                            var5 += 15028208;
                            var5 ^= -980023506;
                            break label72;
                        }

                        var5 += 968960327;
                        var5 ^= -1258037338;
                        Integer var83 = var1;
                        if (var83 == null) {
                            break label73;
                        }

                        du var84 = this.Yj;
                        var10 = var7;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var98;
                        var7 = (var98 = var10 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                        if (var7 == 0) {
                            var5 <<= 31;
                            var5 ^= -1086158278;
                            Integer var63 = var1;
                            if (var63 == null) {
                                break label73;
                            }

                            boolean var64 = var84.Q(var1, var2, var79);
                            var5 -= -798768535;
                            var5 ^= 625308143;
                            break label72;
                        }

                        var5 &= -1511835194;
                        var5 |= -1894304021;
                        var5 += -1057305244;
                        var5 <<= 2;
                        var5 ^= -2116814596;
                    }
                } else {
                    int var51 = var4 & 104345493;
                    var51 -= 653174588;
                    var51 ^= 618879398;
                    var51 *= -230208463;
                    var51 ^= 1431112371;
                }

                long var56 = var1;
                long var68 = var56 + 1L;
                long var69 = var56 * var68;
                long var87 = var56 + 2L;
                long var70 = var69 * var87;
                var56 += 3L;
                long var71 = var70 * var56;
                var56 = var71 & 7L;
                long var99;
                int var59 = (var99 = var56 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                if (var59 == 0) {
                    IllegalArgumentException var61 = new IllegalArgumentException();
                    throw var61;
                }
                break label73;
            }

            long var65 = var1;
            long var85 = var65 + 1L;
            var85 = var65 * var85;
            var65 = var85 & 1L;
            long var100;
            int var67 = (var100 = var65 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
            if (var67 == 0) {
                return;
            }
        }

        IllegalStateException var60 = new IllegalStateException();
        throw var60;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1571594254;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        SL = var4;
    }
}
