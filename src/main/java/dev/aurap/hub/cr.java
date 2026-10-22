package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class cr {
    public static final int UE = 100;
    public static final int tO = 12;
    public static final int ON;

    private cr() {
    }

    public static void gI(Dx var0, float var1, float var2, int var3, boolean var4) {
        label130: {
            int var114;
            float var123;
            label129: {
                int var5 = ON;
                var5 ^= 1031506905;
                var114 = System.identityHashCode(var0);
                int var8 = var114 + 1;
                int var115 = var114 * var8;
                int var116 = var115 & 1;
                label128:
                if (var116 == 0) {
                    var5 += 2002981038;
                    var5 >>>= 7;
                    var5 += -825027648;
                    var5 ^= 1394519706;
                    Integer var117 = var3;
                    if (var117 == null) {
                        break label130;
                    }

                    if (!var4) {
                        var5 &= -492399625;
                        var5 |= -1638857695;
                        var5 |= -1665076332;
                        var5 ^= 823494211;
                        var0.xJ(var1, 100);
                        return;
                    }

                    var5 |= 1525688061;
                    var5 |= -305607921;
                    var5 *= 1050707697;
                    var5 ^= 470776928;
                    var5 ^= 952682016;
                    Integer var118 = var3;
                    if (var118 == null) {
                        break label130;
                    }

                    if (var3 > 0) {
                        var5 = switch (var5) {
                            default -> var5 ^ -665851992;
                            case -623618279 -> var5 ^ -45081050;
                            case 139182927 -> {
                                var5 *= 595626183;
                                yield var5 ^ 1631555020;
                            }
                        };
                        var123 = var3;
                        int var9 = var114 + 1;
                        var9 = var114 * var9;
                        int var10 = var114 + 2;
                        var9 *= var10;
                        var10 = var114 + 3;
                        var9 *= var10;
                        var9 &= 7;
                        if (var9 != 0) {
                            var5 -= -51714354;
                            var5 ^= -681024091;
                            break label128;
                        }

                        var5 <<= 6;
                        var5 *= -1633700839;
                        var5 -= -1074298176;
                        var5 ^= 1575484298;
                        Integer var128 = var3;
                        if (var128 == null) {
                            break label130;
                        }

                        var123 = var2 / var123;
                        var123 = var123;
                        var5 -= 1299966231;
                        var5 &= -1016510284;
                        var5 |= -770252914;
                        var5 ^= -737015988;
                    } else {
                        var5 ^= 430870410;
                        var5 ^= 677670921;
                        Integer var129 = var3;
                        if (var129 == null) {
                            break label130;
                        }

                        var123 = 1.0F;
                        var5 += -1591768983;
                        var5 >>>= 14;
                        var5 *= -925071611;
                        var5 ^= -1426787971;
                    }

                    int var130 = var114 + 1;
                    var130 = var114 * var130;
                    int var143 = var114 + 2;
                    var130 *= var143;
                    var143 = var114 + 3;
                    var130 *= var143;
                    var130 &= 7;
                    if (var130 != 0) {
                        switch (var5) {
                            case -472930109:
                                var5 ^= 384225852;
                                break;
                            case 119855346:
                                var5 += -315684649;
                                var5 *= 2022564429;
                                var5 &= 341686116;
                                var5 |= 2102928398;
                                var5 ^= -484494820;
                                break;
                            case 380735812:
                            default:
                                var5 ^= -1462551127;
                        }
                    } else {
                        label134: {
                            var5 <<= 2;
                            var5 ^= 1821650101;
                            long var135 = var3;
                            long var11 = var135 + 1L;
                            var11 = var135 * var11;
                            long var136 = var11 & 1L;
                            long var168;
                            var130 = (var168 = var136 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                            if (var130 != 0) {
                                break label130;
                            }

                            float var169;
                            var130 = (var169 = var123 - 1.0F) == 0.0F ? 0 : (var169 < 0.0F ? -1 : 1);
                            float var140;
                            if (var130 < 0) {
                                var5 += -124825260;
                                var5 += -572818789;
                                var5 += 271063883;
                                var5 ^= 1441202032;
                                float var139 = 1.0F;
                                var143 = var114 + 1;
                                var143 = var114 * var143;
                                int var156 = var114 + 2;
                                var143 *= var156;
                                int var157 = var114 + 3;
                                var143 *= var157;
                                var143 &= 7;
                                if (var143 != 0) {
                                    var5 += 1781161609;
                                    var5 >>>= 30;
                                    var5 >>= 2;
                                    var5 >>= 19;
                                    var5 ^= -1639578254;
                                    break label134;
                                }

                                var5 |= 1374586959;
                                var5 ^= -877830794;
                                Integer var150 = var3;
                                if (var150 == null) {
                                    break label130;
                                }

                                var140 = var139;
                                var5 += -735771298;
                                var5 ^= -784639767;
                            } else {
                                var5 = switch (var5) {
                                    case -646734186 -> var5 ^ 585402893;
                                    default -> var5 ^ 582372860;
                                    case 1879527293 -> {
                                        var5 += -185816088;
                                        var5 *= -487774149;
                                        var5 &= 550592197;
                                        var5 >>>= 1;
                                        yield var5 ^ -1942811412;
                                    }
                                };
                                var140 = var123;
                                var5 -= -1795969923;
                                var5 ^= 1249646255;
                            }

                            long var151 = var3;
                            long var12 = var151 + 1L;
                            var12 = var151 * var12;
                            long var14 = var151 + 2L;
                            var12 *= var14;
                            long var152 = var151 + 3L;
                            var12 *= var152;
                            long var153 = var12 & 7L;
                            long var170;
                            int var122 = (var170 = var153 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                            if (var122 != 0) {
                                break label130;
                            }

                            var123 = var1 * var140;
                            float var171;
                            var143 = (var171 = var140 - 1.0F) == 0.0F ? 0 : (var171 < 0.0F ? -1 : 1);
                            var11 = var114;
                            long var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var172;
                            int var161 = (var172 = var11 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                            if (var161 == 0) {
                                var5 &= -1808331871;
                                var5 -= 1564050458;
                                var5 *= 797176365;
                                var5 ^= 1526657344;
                                if (var143 <= 0) {
                                    var5 += 907788224;
                                    var5 &= -793488277;
                                    var5 |= 149140162;
                                    var5 ^= 1708499304;
                                    var114 = 100;
                                    var5 ^= -1524282668;
                                    var5 ^= -400660038;
                                    break label129;
                                }
                                var5 = switch (var5) {
                                    default -> var5 ^ -1557557176;
                                    case 79361212 -> var5 ^ 816843920;
                                    case 694753486 -> {
                                        var5 &= 1246428517;
                                        var5 *= 1395882165;
                                        var5 ^= 1151250721;
                                        yield var5 ^ -1288570379;
                                    }
                                };
                                float var141 = 100.0F * var140;
                                Integer var112 = var114;
                                if (var112 != null) {
                                    var5 *= -1289571937;
                                    var5 ^= 36054235;
                                    int var113 = (int)var141;
                                    var114 = var113;
                                    switch (var5) {
                                        case -760107499:
                                        default:
                                            var5 ^= 133130057;
                                            break label129;
                                        case -664087184:
                                            var5 ^= -1858708242;
                                            break label129;
                                        case -331033701:
                                            var5 ^= 1198557572;
                                            var5 -= 496352512;
                                            var5 &= 1250934298;
                                            var5 -= 177031377;
                                            var5 ^= -1912069243;
                                            break label129;
                                    }
                                }

                                var5 += 1221282008;
                                var5 ^= 659786986;
                            } else {
                                var5 += 387776611;
                                var5 ^= -2145923727;
                                var5 |= 617631262;
                                var5 ^= -357479572;
                            }
                        }
                    }
                } else {
                    var5 >>= 12;
                    var5 -= 5846906;
                    var5 *= -830028733;
                    var5 ^= -106331935;
                }

                Integer var109 = var3;
                if (var109 != null) {
                    RuntimeException var111 = new RuntimeException();
                    throw var111;
                }
                break label130;
            }

            var0.xJ(var123, var114);
            return;
        }

        AssertionError var110 = new AssertionError();
        throw var110;
    }

    public static float c(float var0, float var1, int var2, float var3, int var4, int var5) {
        label177: {
            int var7;
            float var152;
            label176: {
                int var6 = ON;
                var7 = var2;
                var6 ^= 354664645;
                int var8 = (int)var0;
                float var9 = Math.max(0.0F, var0);
                Integer var10 = var8;
                if (var10 == null) {
                    switch (var6) {
                        case -1403094999:
                        default:
                            var6 ^= 1095320827;
                            break;
                        case -1066993888:
                            var6 += -1242761026;
                            var6 *= 1941777817;
                            var6 ^= -58062543;
                            break;
                        case 1156962723:
                            var6 ^= 1550527742;
                    }
                } else {
                    var6 >>= 17;
                    var6 >>= 19;
                    var6 += -949110187;
                    var6 += -927454268;
                    var6 ^= 1929155327;
                    long var153 = var2;
                    long var12 = var153 + 1L;
                    var12 = var153 * var12;
                    long var14 = var153 + 2L;
                    var12 *= var14;
                    long var154 = var153 + 3L;
                    var12 *= var154;
                    long var155 = var12 & 7L;
                    long var291;
                    int var156 = (var291 = var155 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                    if (var156 != 0) {
                        break label177;
                    }

                    float var292;
                    var156 = (var292 = var9 - 0.0F) == 0.0F ? 0 : (var292 < 0.0F ? -1 : 1);
                    if (var156 == 0) {
                        var6 *= 2100472547;
                        var6 ^= 1718640125;
                        var6 ^= -1264101921;
                        return var9;
                    }

                    var6 *= -670075845;
                    var6 <<= 2;
                    var6 += 618799173;
                    var6 += 1790361133;
                    var6 ^= 249239447;
                    long var158 = var2;
                    var12 = var158 + 1L;
                    var12 = var158 * var12;
                    long var159 = var12 & 1L;
                    long var293;
                    var156 = (var293 = var159 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                    if (var156 != 0) {
                        break label177;
                    }

                    float var294;
                    var156 = (var294 = var1 - 0.0F) == 0.0F ? 0 : (var294 < 0.0F ? -1 : 1);
                    long var11 = var8;
                    long var13 = var11 + 1L;
                    var13 = var11 * var13;
                    var11 = var13 & 1L;
                    long var295;
                    int var177 = (var295 = var11 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                    if (var177 != 0) {
                        var6 &= -702354873;
                        var6 ^= 1655711966;
                    } else {
                        var6 |= -2119203388;
                        var6 *= -1977386803;
                        var6 ^= -446106282;
                        var11 = var2;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        var11 = var13 & 1L;
                        long var296;
                        int var180 = (var296 = var11 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                        if (var180 != 0) {
                            break label177;
                        }

                        if (var156 <= 0) {
                            var6 ^= -262600055;
                            var6 |= 1054593468;
                            var6 ^= 62846217;
                            return var9;
                        }

                        var6 += 2116878771;
                        var6 *= -708664467;
                        var6 += 834602573;
                        var6 ^= -177948541;
                        if (var2 <= 0) {
                            var6 += 965904863;
                            var6 |= -673052631;
                            var6 |= 1100052088;
                            var6 <<= 3;
                            var6 ^= 1138686255;
                            return var9;
                        }
                        var6 = switch (var6) {
                            case -2010845909 -> var6 ^ -1574813507;
                            default -> var6 ^ -1073264497;
                            case 746502620 -> {
                                var6 *= -630403899;
                                var6 &= -839531391;
                                var6 |= -1103429176;
                                yield var6 ^ 476880866;
                            }
                        };
                        float var162 = var2;
                        float var163 = Math.min(var1, var162);
                        float var164 = var1 / var163;
                        float var165 = var9 * var164;
                        var11 = var8;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var297;
                        int var184 = (var297 = var11 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                        label171:
                        if (var184 == 0) {
                            var6 |= 460602457;
                            var6 ^= -1696655148;
                            int var185 = var2 + 1;
                            int var186 = var2 * var185;
                            int var187 = var186 & 1;
                            if (var187 != 0) {
                                break label177;
                            }

                            float var166 = Math.min(1.0F, var165);
                            float var298;
                            int var188 = (var298 = var3 - 0.0F) == 0.0F ? 0 : (var298 < 0.0F ? -1 : 1);
                            float var194;
                            if (var188 <= 0) {
                                var6 <<= 14;
                                var6 |= 981318352;
                                var6 -= 1553464588;
                                var6 ^= -168083411;
                                int var189 = var2 + 1;
                                int var190 = var2 * var189;
                                int var215 = var2 + 2;
                                int var191 = var190 * var215;
                                int var216 = var2 + 3;
                                int var192 = var191 * var216;
                                int var193 = var192 & 7;
                                if (var193 != 0) {
                                    break label177;
                                }

                                var194 = var1;
                                var6 >>= 1;
                                var6 <<= 20;
                                var6 *= 1957615835;
                                var6 |= -1886222645;
                                var6 ^= -57791135;
                            } else {
                                var6 ^= -37170763;
                                var6 |= 1599936668;
                                var6 &= 274311507;
                                var6 ^= -1777429993;
                                float var217 = var3 * 0.85F;
                                float var237 = var1 * 0.15F;
                                int var246 = var8 + 1;
                                int var247 = var8 * var246;
                                int var259 = var8 + 2;
                                int var248 = var247 * var259;
                                int var260 = var8 + 3;
                                int var249 = var248 * var260;
                                int var250 = var249 & 7;
                                if (var250 != 0) {
                                    var6 >>= 27;
                                    var6 -= 508319009;
                                    var6 &= -463395181;
                                    var6 ^= 1452362268;
                                    break label171;
                                }

                                var6 >>= 12;
                                var6 -= -1443564848;
                                var6 *= 1872386161;
                                var6 *= 1235919571;
                                var6 ^= -624079643;
                                var14 = var2;
                                long var16 = var14 + 1L;
                                var16 = var14 * var16;
                                long var18 = var14 + 2L;
                                var16 *= var18;
                                var14 += 3L;
                                var16 *= var14;
                                var14 = var16 & 7L;
                                long var299;
                                int var254 = (var299 = var14 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                if (var254 != 0) {
                                    break label177;
                                }

                                float var218 = var217 + var237;
                                var194 = var218;
                                var6 += -589559412;
                                var6 &= -2011857885;
                                var6 *= 1895577045;
                                var6 ^= -567678038;
                            }

                            Integer var219 = var2;
                            if (var219 == null) {
                                break label177;
                            }

                            float var220 = var2;
                            float var221 = Math.min(var194, var220);
                            Integer var238 = var8;
                            if (var238 == null) {
                                var6 |= 1862800579;
                                var6 >>= 10;
                                var6 ^= -1229996112;
                            } else {
                                var6 |= 13226078;
                                var6 |= 2050698546;
                                var6 += -744547996;
                                var6 ^= 1848967287;
                                float var195 = var194 / var221;
                                float var196 = var9 * var195;
                                float var197 = var196 - 1.0E-6F;
                                double var198 = var197;
                                double var199 = Math.ceil(var198);
                                int var200 = (int)var199;
                                int var201 = Math.min(24, var200);
                                int var222 = var4 + 1;
                                int var223 = Math.min(24, var222);
                                int var224 = Math.min(var201, var223);
                                int var202 = var224;
                                if (var224 <= var5) {
                                    var6 = switch (var6) {
                                        case -1944640097 -> var6 ^ -379946638;
                                        default -> var6 ^ 553505327;
                                        case 564795669 -> {
                                            var6 *= -1343236891;
                                            var6 |= 1009570395;
                                            var6 ^= -1818247967;
                                            yield var6 ^ -2034098910;
                                        }
                                    };
                                    var152 = var166;
                                    var6 &= -493747759;
                                    var6 &= 339378514;
                                    var6 ^= -1406397619;
                                    break label176;
                                }

                                var6 |= 2057604273;
                                var6 >>= 2;
                                var6 -= -145783049;
                                var6 ^= -1548208152;
                                var6 ^= 1718073786;
                                byte var225 = 1;
                                int var239 = var8 + 1;
                                int var240 = var8 * var239;
                                int var255 = var8 + 2;
                                int var241 = var240 * var255;
                                int var256 = var8 + 3;
                                int var242 = var241 * var256;
                                int var243 = var242 & 7;
                                if (var243 != 0) {
                                    switch (var6) {
                                        case -498880988:
                                            var6 += -268463314;
                                            var6 ^= 1693657549;
                                            break;
                                        case 90104992:
                                            var6 ^= -317553184;
                                            break;
                                        case 100570307:
                                        default:
                                            var6 ^= -1004481504;
                                    }
                                } else {
                                    var6 = switch (var6) {
                                        case -498880988 -> {
                                            var6 += 1253853235;
                                            yield var6 ^ 1626700018;
                                        }
                                        default -> var6 ^ 716663601;
                                        case 1972634877 -> var6 ^ 590563600;
                                    };
                                    byte var244 = 0;
                                    byte var257 = 1;
                                    int var226 = var225;
                                    int var245 = var244;
                                    int var258 = var257;
                                    var6 -= -486303990;
                                    var6 ^= 1570623592;
                                    var6 += 1536515860;
                                    var6 ^= 839144047;

                                    while (true) {
                                        int var261 = var7 + 1;
                                        int var262 = var7 * var261;
                                        int var278 = var7 + 2;
                                        int var263 = var262 * var278;
                                        var278 = var7 + 3;
                                        int var264 = var263 * var278;
                                        int var265 = var264 & 7;
                                        if (var265 != 0) {
                                            break label177;
                                        }

                                        if (var258 >= var5) {
                                            var6 ^= 1338118261;
                                            var6 |= -579746995;
                                            var6 ^= -1485786932;
                                            int var203 = var7 + 1;
                                            int var204 = var7 * var203;
                                            int var205 = var204 & 1;
                                            if (var205 != 0) {
                                                break label177;
                                            }

                                            float var206 = var226;
                                            float var207 = Math.max(var166, var206);
                                            int var227 = var8 + 1;
                                            int var228 = var8 * var227;
                                            int var151 = var228 & 1;
                                            if (var151 == 0) {
                                                var6 = switch (var6) {
                                                    default -> var6 ^ -94985931;
                                                    case 1518827409 -> {
                                                        var6 |= -1883598214;
                                                        var6 ^= -19764933;
                                                        yield var6 ^ 463548577;
                                                    }
                                                    case 1733592805 -> var6 ^ -463007131;
                                                };
                                                var152 = var207;
                                                var6 ^= -520937323;
                                                var6 -= 1313140284;
                                                var6 -= 731774185;
                                                var6 ^= -866078574;
                                                break label176;
                                            }

                                            var6 += 551709712;
                                            var6 <<= 27;
                                            var6 >>= 20;
                                            var6 ^= -793547865;
                                            var6 ^= 1711473592;
                                            break;
                                        }

                                        var6 -= 1913744028;
                                        var6 *= -1858862109;
                                        var6 ^= 1099928162;
                                        int var266 = var7 + 1;
                                        int var267 = var7 * var266;
                                        var278 = var7 + 2;
                                        int var268 = var267 * var278;
                                        var278 = var7 + 3;
                                        int var269 = var268 * var278;
                                        int var270 = var269 & 7;
                                        if (var270 != 0) {
                                            break label177;
                                        }

                                        float var271 = var258;
                                        var278 = var8 + 1;
                                        var278 = var8 * var278;
                                        var278 &= 1;
                                        if (var278 != 0) {
                                            var6 &= 114779770;
                                            var6 ^= -1339593571;
                                            break;
                                        }

                                        var6 += 686163481;
                                        var6 *= 413296005;
                                        var6 ^= 902997999;
                                        var6 ^= -373345425;
                                        var278 = var202 - 1;
                                        float var286 = var278;
                                        float var272 = var271 * var286;
                                        var278 = var5 - 1;
                                        float var288 = var278;
                                        float var273 = var272 / var288;
                                        int var274 = Math.round(var273);
                                        var278 = var274 - var245;
                                        var278 = Math.max(var226, var278);
                                        int var17 = var258 + 1;
                                        var226 = var278;
                                        var245 = var274;
                                        var258 = var17;
                                        var6 <<= 23;
                                        var6 ^= -1832573210;
                                        var6 -= 492371256;
                                        var6 ^= -1546060602;
                                    }
                                }
                            }
                        } else {
                            var6 >>= 17;
                            var6 ^= 1229953428;
                        }
                    }
                }

                long var146 = var7;
                long var172 = var146 + 1L;
                long var173 = var146 * var172;
                long var229 = var146 + 2L;
                long var174 = var173 * var229;
                long var147 = var146 + 3L;
                long var175 = var174 * var147;
                long var148 = var175 & 7L;
                long var300;
                var7 = (var300 = var148 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                if (var7 == 0) {
                    IllegalStateException var150 = new IllegalStateException();
                    throw var150;
                }
                break label177;
            }

            int var167 = var7 + 1;
            var167 = var7 * var167;
            int var208 = var7 + 2;
            var167 *= var208;
            var208 = var7 + 3;
            var167 *= var208;
            var167 &= 7;
            if (var167 == 0) {
                return var152;
            }
        }

        UnsupportedOperationException var145 = new UnsupportedOperationException();
        throw var145;
    }

    public static int gM(float var0) {
        int var1 = ON;
        var1 ^= -383723052;
        int var2 = (int)var0;
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= -1576359792;
            var1 |= 765779153;
            var1 ^= 930249440;
            var1 ^= -2061295145;
            Integer var23 = var1;
            if (var23 != null) {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            }
        } else {
            var1 >>>= 4;
            var1 ^= 14309821;
            long var14 = var1;
            long var28 = var14 + 1L;
            long var29 = var14 * var28;
            long var5 = var14 + 2L;
            long var30 = var29 * var5;
            long var15 = var14 + 3L;
            long var31 = var30 * var15;
            long var16 = var31 & 7L;
            long var32;
            var1 = (var32 = var16 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var1 == 0) {
                float var19 = 100.0F * var0;
                var1 = Math.round(var19);
                return Math.max(100, var1);
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public static float l(float var0, boolean var1) {
        int var2 = ON;
        var2 ^= -1625494263;
        int var3 = (int)var0;
        double var4 = var0;
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var80;
        int var57 = (var80 = var6 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
        if (var57 != 0) {
            var2 -= -1531536550;
            var2 &= -520387196;
            var2 ^= 1722730858;
            var2 ^= -2012343561;
            var2 ^= -1156659344;
        } else {
            label51: {
                label46: {
                    var2 &= 935447948;
                    var2 += 1554403325;
                    var2 ^= -1569069412;
                    var2 += 1957074675;
                    var2 ^= -949400985;
                    double var59;
                    if (var1) {
                        var2 += -81128443;
                        var2 |= 2116268621;
                        var2 |= 965140103;
                        var2 <<= 14;
                        var2 ^= -824896074;
                        Integer var58 = var2;
                        if (var58 == null) {
                            break label46;
                        }

                        var59 = 7.0;
                        switch (var2) {
                            case -1014351432:
                            default:
                                var2 ^= 1089208734;
                                break;
                            case 824890806:
                                var2 -= 231054363;
                                var2 ^= 2106756626;
                                break;
                            case 1181845999:
                                var2 ^= 1160231351;
                        }
                    } else {
                        var2 |= -1106362076;
                        var2 += -1626470640;
                        var2 ^= -887017618;
                        var2 ^= 371344074;
                        Integer var66 = var2;
                        if (var66 == null) {
                            break label46;
                        }

                        var59 = 5.0;
                        var2 |= -1943862757;
                        var2 -= 1022463367;
                        var2 -= 1199099042;
                        var2 ^= 1458734651;
                    }

                    var8 = var2;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var81;
                    int var70 = (var81 = var8 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                    if (var70 == 0) {
                        var4 *= var59;
                        var6 = var3;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var82;
                        var3 = (var82 = var6 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                        if (var3 != 0) {
                            var2 += 1999595781;
                            var2 ^= 589969891;
                            break label51;
                        }

                        var2 *= -137069909;
                        var2 ^= 4698373;
                        var2 >>= 7;
                        var2 ^= 1542057850;
                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        var3 &= 1;
                        if (var3 == 0) {
                            double var50 = var4 / 3.0;
                            double var51 = Math.pow(0.5, var50);
                            double var52 = 1.0 - var51;
                            return (float)var52;
                        }
                    }
                }

                AssertionError var53 = new AssertionError();
                throw var53;
            }
        }

        AssertionError var45 = new AssertionError();
        throw var45;
    }

    public static float i(long var0) {
        int var67 = 0;
        int var2 = ON;
        var2 ^= -1168691033;
        int var3 = (int)var0;
        long var4 = var3;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var112;
        int var70 = (var112 = var4 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
        if (var70 != 0) {
            switch (var2) {
                case 1163335682:
                    var2 ^= 690497368;
                    break;
                case 1366492897:
                default:
                    var2 ^= 18319490;
                    break;
                case 1863452482:
                    var2 <<= 29;
                    var2 *= -418367491;
                    var2 ^= 1317643682;
            }
        } else {
            label97: {
                var2 >>= 28;
                var2 ^= -1924577351;
                var4 = var2;
                var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var113;
                int var73 = (var113 = var4 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
                label77:
                if (var73 == 0) {
                    label91: {
                        float var74 = (float)var0;
                        float var75 = var74 / 1.0E9F;
                        float var114;
                        int var5 = (var114 = var75 - 0.0F) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                        if (var5 > 0) {
                            var2 -= -30086902;
                            var2 *= 1617864843;
                            var2 += 949224433;
                            var2 &= -674050446;
                            var2 ^= 843865416;
                            long var81 = var2;
                            long var7 = var81 + 1L;
                            var7 = var81 * var7;
                            long var82 = var7 & 1L;
                            long var115;
                            var5 = (var115 = var82 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label77;
                            }

                            float var116;
                            var5 = (var116 = var75 - 1.0F) == 0.0F ? 0 : (var116 < 0.0F ? -1 : 1);
                            Integer var96 = var3;
                            if (var96 == null) {
                                switch (var2) {
                                    case -1966808592:
                                        var2 ^= 537432689;
                                        break label97;
                                    case -1752013393:
                                    default:
                                        var2 ^= -533161922;
                                        break label97;
                                    case -488876680:
                                        var2 -= -1907334532;
                                        var2 |= 1223200973;
                                        var2 &= 623680263;
                                        var2 ^= 178337703;
                                        break label97;
                                }
                            }

                            var2 -= 1286642288;
                            var2 ^= 2059769047;
                            var2 ^= -672041185;
                            var6 = var2;
                            long var8 = var6 + 1L;
                            var8 = var6 * var8;
                            long var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var117;
                            int var100 = (var117 = var6 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                            if (var100 != 0) {
                                break label77;
                            }

                            if (var5 < 0) {
                                var2 |= -1754552708;
                                var2 |= -1157358867;
                                var2 |= 88562122;
                                var2 -= -621757738;
                                var2 ^= -446993888;
                                long var85 = var2;
                                var7 = var85 + 1L;
                                var7 = var85 * var7;
                                long var9 = var85 + 2L;
                                var7 *= var9;
                                long var86 = var85 + 3L;
                                var7 *= var86;
                                long var87 = var7 & 7L;
                                long var118;
                                var5 = (var118 = var87 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label77;
                                }

                                float var76 = 1.0F / var75;
                                var5 = var3 + 1;
                                var5 = var3 * var5;
                                int var101 = var3 + 2;
                                var5 *= var101;
                                var3 += 3;
                                var5 *= var3;
                                var3 = var5 & 7;
                                if (var3 != 0) {
                                    switch (var2) {
                                        case -1096206982:
                                            var2 ^= 364124150;
                                            break label97;
                                        case -828814027:
                                        default:
                                            var2 ^= 1273762870;
                                            break label97;
                                        case 30682889:
                                            var2 ^= 1942581649;
                                            var2 ^= 2090138426;
                                            break label97;
                                    }
                                }

                                var2 &= 1484590345;
                                var2 += 1782661547;
                                var2 &= -863047677;
                                var2 >>>= 17;
                                var2 ^= 822326873;
                                var3 = var2 + 1;
                                var3 = var2 * var3;
                                var3 &= 1;
                                if (var3 != 0) {
                                    break label77;
                                }

                                var67 = (int)var76;
                                switch (var2) {
                                    case 128465974:
                                    default:
                                        var2 ^= 903753591;
                                        break label91;
                                    case 822317595:
                                        var2 += 574745831;
                                        var2 ^= 1605411705;
                                        var2 ^= -833299173;
                                        var2 *= 2044126175;
                                        var2 ^= 1871538700;
                                        break label91;
                                    case 894806234:
                                        var2 ^= 473426182;
                                        break label91;
                                }
                            }

                            var2 |= 1937776863;
                            var2 |= -1885445158;
                            var2 ^= 397563524;
                        } else {
                            var2 <<= 30;
                            var2 &= -735935711;
                            var2 >>= 24;
                            var2 ^= 399692443;
                        }

                        var4 = var2;
                        var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var119;
                        int var79 = (var119 = var4 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                        if (var79 != 0) {
                            break label77;
                        }

                        var67 = 0;
                        var2 &= 1404534140;
                        var2 ^= 539628581;
                        var2 ^= -616955439;
                    }

                    Integer var80 = var2;
                    if (var80 != null) {
                        return var67;
                    }
                }

                IllegalArgumentException var68 = new IllegalArgumentException();
                throw var68;
            }
        }

        AssertionError var61 = new AssertionError();
        throw var61;
    }

    public static float sS(float var0, float var1) {
        label80: {
            int var2 = ON;
            var2 ^= 2135574421;
            int var3 = (int)var0;
            float var91;
            int var4 = (var91 = var1 - 0.0F) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
            Integer var5 = var3;
            if (var5 == null) {
                switch (var2) {
                    case -1441828752:
                        var2 &= -145370820;
                        var2 &= 533066494;
                        var2 ^= 927175607;
                        break;
                    case 665585423:
                    default:
                        var2 ^= -1007674427;
                        break;
                    case 869177712:
                        var2 ^= -220633135;
                }
            } else {
                var2 -= -370916690;
                var2 ^= -1609878909;
                if (var4 <= 0) {
                    var2 *= -661676451;
                    var2 &= -1638522447;
                    var2 &= -638648917;
                    var2 ^= 632032138;
                    Integer var73 = var2;
                    if (var73 != null) {
                        return var0;
                    }
                    break label80;
                }

                var2 += 724502736;
                var2 |= -154140477;
                var2 *= 1671174719;
                var2 -= -324590609;
                var2 ^= 260780720;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label80;
                }

                float var92;
                var4 = (var92 = var0 - 0.0F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                long var74 = var3;
                long var7 = var74 + 1L;
                var7 = var74 * var7;
                long var75 = var7 & 1L;
                long var93;
                int var76 = (var93 = var75 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                label67:
                if (var76 == 0) {
                    var2 -= -927411093;
                    var2 ^= -1459882793;
                    var76 = var2 + 1;
                    var76 = var2 * var76;
                    int var6 = var2 + 2;
                    var76 *= var6;
                    var6 = var2 + 3;
                    var76 *= var6;
                    var76 &= 7;
                    if (var76 != 0) {
                        break label80;
                    }

                    float var72;
                    if (var4 <= 0) {
                        var2 <<= 8;
                        var2 ^= -193058693;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        var76 = var2 + 2;
                        var4 *= var76;
                        var76 = var2 + 3;
                        var4 *= var76;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label80;
                        }

                        var72 = var1;
                        var2 |= -821757594;
                        var2 += -168489664;
                        var2 ^= -161582242;
                        var2 *= -378756517;
                        var2 ^= 1730397905;
                    } else {
                        var2 *= 1882160797;
                        var2 ^= 475535212;
                        var76 = var2 + 1;
                        var76 = var2 * var76;
                        var76 &= 1;
                        if (var76 != 0) {
                            break label80;
                        }

                        float var87 = var0 * 0.85F;
                        float var89 = var1 * 0.15F;
                        Integer var58 = var3;
                        if (var58 == null) {
                            var2 -= -1613528550;
                            var2 ^= -973427241;
                            var2 ^= 154582590;
                            break label67;
                        }

                        var2 ^= 1521202289;
                        var2 >>= 16;
                        var2 |= 1415520348;
                        var2 |= -1289190060;
                        var2 ^= 1457429901;
                        int var59 = var2 + 1;
                        var59 = var2 * var59;
                        var59 &= 1;
                        if (var59 != 0) {
                            break label80;
                        }

                        float var62 = var87 + var89;
                        var72 = var62;
                        switch (var2) {
                            case -1457423760:
                                var2 |= -1051221451;
                                var2 |= -2124175498;
                                var2 -= -421660429;
                                var2 -= 1310996993;
                                var2 ^= 376290985;
                                break;
                            case 594603921:
                                var2 ^= -280905258;
                                break;
                            case 1182172861:
                            default:
                                var2 ^= -1854455356;
                        }
                    }

                    return var72;
                } else {
                    var2 |= -1986218408;
                    var2 += 991717268;
                    var2 *= 211331565;
                    var2 ^= -688755827;
                }
            }

            AssertionError var57 = new AssertionError();
            throw var57;
        }

        RuntimeException var51 = new RuntimeException();
        throw var51;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1569922104;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ON = var4;
    }
}
