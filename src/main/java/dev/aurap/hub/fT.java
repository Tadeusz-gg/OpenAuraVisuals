package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class fT {
    private final float[] y;
    private final float[] q;
    private final float[] W;
    private final float[] lW;
    public static final int zH;

    public fT() {
        float[] var1 = new float[8];
        this.y = var1;
        var1 = new float[9];
        this.q = var1;
        var1 = new float[9];
        this.W = var1;
        var1 = new float[9];
        this.lW = var1;
    }

    public void we(Da var1, float[] var2, float[] var3) {
        label194: {
            int var4 = zH;
            var4 ^= -34704856;
            int var5 = System.identityHashCode(this);
            int var6 = 0;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var324;
            int var161 = (var324 = var7 - 0L) == 0L ? 0 : (var324 < 0L ? -1 : 1);
            if (var161 == 0) {
                var4 ^= -1747141413;
                var4 ^= -1900104054;
                var6 = var6;
                var4 ^= -750665097;
                var4 ^= 1104151888;

                label191:
                while (true) {
                    Integer var162 = var4;
                    if (var162 == null) {
                        break label194;
                    }

                    float[] var163 = this.y;
                    Integer var8 = var5;
                    if (var8 == null) {
                        var4 += -1712206689;
                        var4 ^= -695271703;
                        break;
                    }

                    var4 -= 1064343147;
                    var4 *= -1007907763;
                    var4 ^= 1056232681;
                    var4 ^= 1870508053;
                    long var193 = var4;
                    long var10 = var193 + 1L;
                    var10 = var193 * var10;
                    long var194 = var10 & 1L;
                    long var325;
                    int var195 = (var325 = var194 - 0L) == 0L ? 0 : (var325 < 0L ? -1 : 1);
                    if (var195 != 0) {
                        break label194;
                    }

                    int var164 = var163.length;
                    if (var6 >= var164) {
                        var4 >>= 26;
                        var4 ^= -1309510540;
                        float[] var134 = this.y;
                        float var135 = var134[3];
                        float[] var170 = this.q;
                        var195 = var4 & -1041657861;
                        var195 ^= 296740982;
                        I(1, var135, var170, var195);
                        float[] var136 = this.y;
                        float var137 = var136[4];
                        float[] var171 = this.W;
                        var195 = var4 - 1611858018;
                        var195 -= 1791369202;
                        var195 ^= 2002171942;
                        I(0, var137, var171, var195);
                        float[] var138 = this.q;
                        float[] var172 = this.W;
                        var195 = var4 & 1426488508;
                        var195 ^= 1200584777;
                        this.a(var138, var172, var195);
                        float[] var139 = this.y;
                        float var140 = var139[5];
                        float[] var173 = this.W;
                        long var205 = var5;
                        var10 = var205 + 1L;
                        var10 = var205 * var10;
                        long var12 = var205 + 2L;
                        var10 *= var12;
                        long var206 = var205 + 3L;
                        var10 *= var206;
                        long var207 = var10 & 7L;
                        long var326;
                        var195 = (var326 = var207 - 0L) == 0L ? 0 : (var326 < 0L ? -1 : 1);
                        if (var195 == 0) {
                            var4 = switch (var4) {
                                default -> var4 ^ -1339090071;
                                case -1309510529 -> {
                                    var4 ^= 1985810819;
                                    yield var4 ^ -1107384169;
                                }
                                case 876878511 -> var4 ^ -1013977939;
                            };
                            long var209 = var4;
                            var10 = var209 + 1L;
                            var10 = var209 * var10;
                            var12 = var209 + 2L;
                            var10 *= var12;
                            long var210 = var209 + 3L;
                            var10 *= var210;
                            long var211 = var10 & 7L;
                            long var327;
                            var195 = (var327 = var211 - 0L) == 0L ? 0 : (var327 < 0L ? -1 : 1);
                            if (var195 != 0) {
                                break label194;
                            }

                            var195 = var4 ^ -1545269731;
                            var195 ^= 1241198459;
                            I(2, var140, var173, var195);
                            float[] var141 = this.q;
                            float[] var174 = this.W;
                            var195 = var4 * -384102039;
                            var195 &= -1052057019;
                            var195 ^= -674804172;
                            this.a(var141, var174, var195);
                            float[] var142 = this.y;
                            float var143 = var142[6];
                            float[] var175 = this.W;
                            var195 = var4 * 1049119063;
                            var195 += 1402746547;
                            var195 ^= -744790755;
                            I(1, var143, var175, var195);
                            float[] var144 = this.q;
                            float[] var176 = this.W;
                            var195 = var4 & 1376953481;
                            var195 >>>= 4;
                            var195 += -814188668;
                            var195 -= -759635260;
                            var195 ^= 1466798453;
                            this.a(var144, var176, var195);
                            float[] var145 = this.y;
                            float var146 = var145[7];
                            float[] var177 = this.W;
                            var195 = var4 >>> 6;
                            var195 *= -1881905275;
                            var195 &= -171428078;
                            var195 |= 1759678961;
                            var195 ^= -56263172;
                            I(2, var146, var177, var195);
                            float[] var147 = this.q;
                            float[] var178 = this.W;
                            var195 = var4 << 25;
                            var195 &= -1728308120;
                            var195 &= 1406549374;
                            var195 ^= 1183648885;
                            this.a(var147, var178, var195);
                            Arrays.fill(var3, 0.0F);
                            int var148 = 0;
                            var148 = var148;

                            var4 = switch (var4) {
                                default -> var4 ^ -1134952774;
                                case 50208132 -> var4 ^ -736111666;
                                case 2052181355 -> {
                                    var4 &= 5515893;
                                    yield var4 ^ 420233423;
                                }
                            };

                            while (true) {
                                Integer var179 = var4;
                                if (var179 == null) {
                                    break label194;
                                }

                                if (var148 >= 3) {
                                    var4 *= -1184336825;
                                    var4 += 1321752345;
                                    var4 *= -720112761;
                                    var4 |= -1182008199;
                                    var4 ^= 1705417286;
                                    var148 = var4 + 1;
                                    var148 = var4 * var148;
                                    var148 &= 1;
                                    if (var148 != 0) {
                                        break label194;
                                    }

                                    float[] var153 = this.y;
                                    float var154 = var153[0];
                                    var3[12] = var154;
                                    float[] var155 = this.y;
                                    float var156 = var155[1];
                                    var7 = var5;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var328;
                                    var5 = (var328 = var7 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                                    if (var5 == 0) {
                                        var4 >>>= 21;
                                        var4 ^= 179929722;
                                        Integer var130 = var4;
                                        if (var130 != null) {
                                            var3[13] = var156;
                                            float[] var131 = this.y;
                                            float var132 = var131[2];
                                            var3[14] = var132;
                                            var3[15] = 1.0F;
                                            return;
                                        }
                                        break label194;
                                    }

                                    var4 += -2142120600;
                                    var4 *= -1582638831;
                                    var4 -= -477207943;
                                    var4 ^= 1018134272;
                                    break label191;
                                }

                                var4 ^= 2122791908;
                                var4 ^= -443206382;
                                var4 ^= -979754528;
                                var4 ^= 589344817;
                                var7 = var4;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var329;
                                int var183 = (var329 = var7 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                                if (var183 != 0) {
                                    break label194;
                                }

                                byte var184 = 0;
                                Integer var235 = var5;
                                if (var235 == null) {
                                    switch (var4) {
                                        case -1972362260:
                                            var4 ^= 875417131;
                                            break label191;
                                        case -1718841797:
                                        default:
                                            var4 ^= -52101878;
                                            break label191;
                                        case 1693767561:
                                            var4 &= 500109739;
                                            var4 ^= 1898854739;
                                            break label191;
                                    }
                                }

                                var4 &= -231452560;
                                var4 ^= 1670194776;
                                int var185 = var184;
                                var4 += 763693990;
                                var4 -= -663680492;
                                var4 -= 711520276;
                                var4 ^= -1162958445;
                                var4 ^= 237579680;

                                while (var185 < 3) {
                                    var4 |= -604537467;
                                    var4 -= 580630327;
                                    var4 ^= 2043429923;
                                    int var236 = var4 + 1;
                                    var236 = var4 * var236;
                                    int var275 = var4 + 2;
                                    var236 *= var275;
                                    int var276 = var4 + 3;
                                    var236 *= var276;
                                    var236 &= 7;
                                    if (var236 != 0) {
                                        break label194;
                                    }

                                    var236 = var148 * 4;
                                    var236 += var185;
                                    float[] var277 = this.q;
                                    int var298 = var185 * 3;
                                    int var299 = var298 + var148;
                                    float var278 = var277[var299];
                                    var3[var236] = var278;
                                    var236 = var5 + 1;
                                    var236 = var5 * var236;
                                    int var279 = var5 + 2;
                                    var236 *= var279;
                                    int var280 = var5 + 3;
                                    var236 *= var280;
                                    var236 &= 7;
                                    if (var236 != 0) {
                                        var4 >>= 10;
                                        var4 ^= -1978004167;
                                        break label191;
                                    }

                                    var4 *= -64339447;
                                    var4 -= -1891853216;
                                    var4 ^= -804545438;
                                    long var248 = var4;
                                    var10 = var248 + 1L;
                                    var10 = var248 * var10;
                                    var12 = var248 + 2L;
                                    var10 *= var12;
                                    long var249 = var248 + 3L;
                                    var10 *= var249;
                                    long var250 = var10 & 7L;
                                    long var330;
                                    var236 = (var330 = var250 - 0L) == 0L ? 0 : (var330 < 0L ? -1 : 1);
                                    if (var236 != 0) {
                                        break label194;
                                    }

                                    var236 = var185 + 1;
                                    var185 = var236;
                                    var4 ^= 288756564;
                                    var4 |= 1994046036;
                                    var4 ^= 1815722002;
                                }

                                var4 *= 1230972905;
                                var4 &= -1559717565;
                                var4 ^= -66324358;
                                var4 &= -1739899820;
                                var4 ^= -44170396;
                                var7 = var4;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var331;
                                int var188 = (var331 = var7 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                                if (var188 != 0) {
                                    break label194;
                                }

                                int var189 = var148 + 1;
                                long var253 = var5;
                                var10 = var253 + 1L;
                                var10 = var253 * var10;
                                var12 = var253 + 2L;
                                var10 *= var12;
                                long var254 = var253 + 3L;
                                var10 *= var254;
                                long var255 = var10 & 7L;
                                long var332;
                                int var256 = (var332 = var255 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                                if (var256 != 0) {
                                    switch (var4) {
                                        case -708763574:
                                        default:
                                            var4 ^= -519734179;
                                            break label191;
                                        case 759825646:
                                            var4 ^= -911700793;
                                            break label191;
                                        case 1700082548:
                                            var4 -= 410138475;
                                            var4 *= -1976926739;
                                            var4 |= 208218146;
                                            var4 *= -1114358009;
                                            var4 ^= 958034843;
                                            break label191;
                                    }
                                }

                                var4 |= 776860193;
                                var4 ^= 265227526;
                                long var257 = var4;
                                var10 = var257 + 1L;
                                var10 = var257 * var10;
                                long var258 = var10 & 1L;
                                long var333;
                                var256 = (var333 = var258 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                                if (var256 != 0) {
                                    break label194;
                                }

                                var148 = var189;
                                var4 -= -1920963879;
                                var4 ^= -269644071;
                                var4 |= -1439574899;
                                var4 ^= -1482451615;
                            }
                        } else {
                            var4 -= 1043980197;
                            var4 |= -493369104;
                            var4 |= -788277774;
                            var4 *= -1576438711;
                            var4 ^= 33537168;
                            break;
                        }
                    }

                    var4 -= -416163264;
                    var4 <<= 19;
                    var4 *= -584683091;
                    var4 >>= 30;
                    var4 ^= -1730413675;
                    var7 = var4;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var334;
                    int var167 = (var334 = var7 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                    if (var167 != 0) {
                        break label194;
                    }

                    float[] var168 = this.y;
                    float var196 = var1.idle(var6);
                    var9 = var5;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var335;
                    int var267 = (var335 = var9 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                    if (var267 != 0) {
                        var4 &= -154158321;
                        var4 += -2063025000;
                        var4 |= 1376631110;
                        var4 ^= -1897425604;
                        break;
                    }

                    var4 ^= -1393850887;
                    var4 ^= -201872687;
                    float var269;
                    if (var2 == null) {
                        var4 &= 397181921;
                        var4 *= -418072905;
                        var4 ^= -1635623410;
                        Integer var268 = var4;
                        if (var268 == null) {
                            break label194;
                        }

                        var269 = 0.0F;
                        var4 >>>= 12;
                        var4 &= -699024062;
                        var4 += -1102406639;
                        var4 ^= 1810964785;
                    } else {
                        var4 += -1819261573;
                        var4 &= 1492379802;
                        var4 ^= 290154010;
                        var4 -= 85966043;
                        var4 ^= -208203943;
                        float var288 = var2[var6];
                        var11 = var5;
                        long var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var336;
                        int var315 = (var336 = var11 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                        if (var315 != 0) {
                            var4 &= -1987944247;
                            var4 |= -17637559;
                            var4 *= -953078095;
                            var4 += 92077562;
                            var4 ^= -1057817303;
                            break;
                        }

                        var4 >>= 21;
                        var4 ^= -189897416;
                        var269 = var288;
                        var4 |= 1299642597;
                        var4 ^= -1885624458;
                        var4 ^= 357813937;
                    }

                    Integer var289 = var4;
                    if (var289 == null) {
                        break label194;
                    }

                    float var197 = var196 + var269;
                    Integer var270 = var5;
                    if (var270 == null) {
                        var4 &= 616960363;
                        var4 |= -353848346;
                        var4 >>= 14;
                        var4 -= -988394231;
                        var4 ^= 1325614699;
                        break;
                    }
                    var4 = switch (var4) {
                        case -708865760 -> {
                            var4 *= 54152745;
                            var4 ^= 696272123;
                            yield var4 ^ 1572943029;
                        }
                        default -> var4 ^ -2079548368;
                        case 132503274 -> var4 ^ -1866696183;
                    };
                    var168[var6] = var197;
                    int var169 = var6 + 1;
                    var6 = var169;
                    switch (var4) {
                        case -1352364434:
                            var4 |= -126852670;
                            var4 ^= 168673768;
                            var4 ^= -1023536539;
                            var4 ^= 1056191991;
                            break;
                        case -32189416:
                        default:
                            var4 ^= 817338761;
                            break;
                        case 2154158:
                            var4 ^= 283610543;
                    }
                }
            } else {
                var4 -= -1983048899;
                var4 ^= -1923507841;
            }

            long var124 = var4;
            long var157 = var124 + 1L;
            long var158 = var124 * var157;
            long var125 = var158 & 1L;
            long var337;
            var4 = (var337 = var125 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalArgumentException var128 = new IllegalArgumentException();
                throw var128;
            }
        }

        IllegalStateException var127 = new IllegalStateException();
        throw var127;
    }

    private void a(float[] var1, float[] var2, int var3) {
        label117: {
            int var5 = System.identityHashCode(this);
            int var6 = 0;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var179;
            int var94 = (var179 = var7 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
            int var49;
            if (var94 == 0) {
                var49 = switch (var3) {
                    case -137304687 -> var3 ^ 451697952;
                    default -> var3 ^ -1909256606;
                    case 1452084341 -> {
                        var49 = var3 | -546254205;
                        var49 -= 244990231;
                        yield var49 ^ 1913445102;
                    }
                };
                int var95 = var49 + 1;
                int var96 = var49 * var95;
                int var8 = var49 + 2;
                int var97 = var96 * var8;
                var8 = var49 + 3;
                int var98 = var97 * var8;
                int var99 = var98 & 7;
                if (var99 != 0) {
                    break label117;
                }

                var6 = var6;

                var49 = switch (var49) {
                    case -1552988402 -> {
                        var49 ^= -429003438;
                        var49 -= -152875849;
                        var49 >>>= 31;
                        yield var49 ^ -1047847610;
                    }
                    default -> var49 ^ -1954042596;
                    case 1526555102 -> var49 ^ -35859043;
                };

                label114:
                while (true) {
                    var7 = var49;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var180;
                    int var102 = (var180 = var7 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                    if (var102 != 0) {
                        break label117;
                    }

                    if (var6 >= 3) {
                        var49 &= -865666228;
                        var49 |= 1993640770;
                        var49 |= -1734366158;
                        var49 ^= 284259780;
                        Integer var91 = var49;
                        if (var91 == null) {
                            break label117;
                        }

                        float[] var92 = this.lW;
                        var7 = var5;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var171 = var7 + 2L;
                        var9 *= var171;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var181;
                        var5 = (var181 = var7 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var49 += -1605739446;
                            var49 ^= 962781878;
                            Integer var87 = var49;
                            if (var87 != null) {
                                System.arraycopy(var92, 0, var1, 0, 9);
                                return;
                            }
                            break label117;
                        }

                        var49 &= 281231814;
                        var49 -= -1428707;
                        var49 ^= 1812189106;
                        break;
                    }

                    var49 &= 830838605;
                    var49 >>= 28;
                    var49 *= 1547718423;
                    var49 &= -848844718;
                    var49 ^= 1709504539;
                    Integer var103 = var49;
                    if (var103 == null) {
                        break label117;
                    }

                    byte var104 = 0;
                    var8 = var5 + 1;
                    var8 = var5 * var8;
                    var8 &= 1;
                    if (var8 != 0) {
                        var49 += -482759224;
                        var49 &= -1836849834;
                        var49 |= 1817487897;
                        var49 &= -1437284828;
                        var49 ^= 1146045655;
                        break;
                    }

                    var49 -= 333761971;
                    var49 &= -1128102594;
                    var49 ^= -185967095;
                    Integer var118 = var49;
                    if (var118 == null) {
                        break label117;
                    }

                    int var105 = var104;
                    var49 &= 1788383617;
                    var49 -= -705873025;
                    var49 *= -18962467;
                    var49 &= -250236225;
                    var49 ^= -1100054118;

                    while (true) {
                        long var119 = var49;
                        long var10 = var119 + 1L;
                        var10 = var119 * var10;
                        long var120 = var10 & 1L;
                        long var182;
                        int var121 = (var182 = var120 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                        if (var121 != 0) {
                            break label117;
                        }

                        if (var105 >= 3) {
                            var49 ^= 1338998810;
                            var49 |= -678286569;
                            var49 &= -436595295;
                            var49 += 1761824073;
                            var49 ^= 240961956;
                            var7 = var49;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var170 = var7 + 2L;
                            var9 *= var170;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var185;
                            int var109 = (var185 = var7 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                            if (var109 != 0) {
                                break label117;
                            }

                            int var110 = var6 + 1;
                            var121 = var5 + 1;
                            var121 = var5 * var121;
                            var121 &= 1;
                            if (var121 != 0) {
                                var49 += 466042769;
                                var49 >>>= 13;
                                var49 &= -2016721304;
                                var49 += 1485184870;
                                var49 ^= 882680241;
                                break label114;
                            }

                            var49 &= -1013902338;
                            var49 ^= -1573857597;
                            var49 += 867353160;
                            var49 += -682047391;
                            var49 ^= 207886832;
                            var121 = var49 + 1;
                            var121 = var49 * var121;
                            int var144 = var49 + 2;
                            var121 *= var144;
                            int var145 = var49 + 3;
                            var121 *= var145;
                            var121 &= 7;
                            if (var121 != 0) {
                                break label117;
                            }

                            var6 = var110;
                            var49 &= -1807935374;
                            var49 -= 353201921;
                            var49 -= -1678974553;
                            var49 ^= 244701916;
                            break;
                        }
                        var49 = switch (var49) {
                            case -956764460 -> var49 ^ -1242746578;
                            case 1600816032 -> {
                                var49 |= -2118094183;
                                var49 |= -588829093;
                                var49 += -671864173;
                                yield var49 ^ 875734680;
                            }
                            default -> var49 ^ -1389760887;
                        };
                        long var122 = var49;
                        var10 = var122 + 1L;
                        var10 = var122 * var10;
                        long var123 = var10 & 1L;
                        long var183;
                        var121 = (var183 = var123 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                        if (var121 != 0) {
                            break label117;
                        }

                        float[] var125 = this.lW;
                        int var138 = var6 * 3;
                        var10 = var5;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var184;
                        int var156 = (var184 = var10 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                        if (var156 != 0) {
                            var49 |= -776806810;
                            var49 *= 975663863;
                            var49 ^= 2116087053;
                            break label114;
                        }

                        var49 ^= 683432784;
                        var49 -= 58389070;
                        var49 |= 1818084691;
                        var49 ^= 688007439;
                        int var139 = var138 + var105;
                        int var157 = var6 * 3;
                        float var158 = var1[var157];
                        float var11 = var2[var105];
                        float var159 = var158 * var11;
                        int var162 = var6 * 3;
                        var11 = var1[++var162];
                        int var175 = 3 + var105;
                        float var176 = var2[var175];
                        var11 *= var176;
                        float var160 = var159 + var11;
                        int var166 = var6 * 3;
                        int var167 = var166 + 2;
                        var11 = var1[var167];
                        int var177 = 6 + var105;
                        float var178 = var2[var177];
                        var11 *= var178;
                        float var161 = var160 + var11;
                        var125[var139] = var161;
                        var121 = var105 + 1;
                        var105 = var121;
                        var49 *= -323954349;
                        var49 &= -29445435;
                        var49 &= 1178007956;
                        var49 -= 1045357196;
                        var49 ^= 1491050200;
                    }
                }
            } else {
                var49 = var3 - 1105669813;
                var49 += 739098162;
                var49 &= 452112139;
                var49 *= -829958561;
                var49 ^= 9995113;
            }

            var5 = var49 + 1;
            var5 = var49 * var5;
            var49 = var5 & 1;
            if (var49 == 0) {
                IllegalArgumentException var85 = new IllegalArgumentException();
                throw var85;
            }
        }

        AssertionError var84 = new AssertionError();
        throw var84;
    }

    private static void I(int var0, float var1, float[] var2, int var3) {
        label73: {
            float var7 = var1 * (float) (Math.PI / 180.0);
            double var67 = var7;
            double var68 = Math.cos(var67);
            var7 = (float)var68;
            float var8 = var1 * (float) (Math.PI / 180.0);
            double var70 = var8;
            int var10 = var0 + 1;
            var10 = var0 * var10;
            int var11 = var0 + 2;
            var10 *= var11;
            var11 = var0 + 3;
            var10 *= var11;
            var10 &= 7;
            if (var10 != 0) {
                int var4 = var3 + 2043620052;
                var4 -= -473121750;
                var4 ^= 1741020093;
            } else {
                int var18 = var3 & 138445668;
                var18 >>>= 16;
                var18 ^= 1241889588;
                long var94 = var0;
                long var12 = var94 + 1L;
                var12 = var94 * var12;
                long var14 = var94 + 2L;
                var12 *= var14;
                long var95 = var94 + 3L;
                var12 *= var95;
                long var96 = var12 & 7L;
                long var116;
                var10 = (var116 = var96 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                if (var10 != 0) {
                    break label73;
                }

                double var71 = Math.sin(var70);
                var8 = (float)var71;
                Arrays.fill(var2, 0.0F);
                switch (var0) {
                    case 0:
                        var18 *= -2112068647;
                        var18 *= -1463263009;
                        var18 &= 2018013689;
                        var18 ^= -768318453;
                        var2[0] = 1.0F;
                        var2[4] = var7;
                        float var89 = -var8;
                        long var102 = var0;
                        var12 = var102 + 1L;
                        var12 = var102 * var12;
                        long var103 = var12 & 1L;
                        long var117;
                        var10 = (var117 = var103 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                        if (var10 == 0) {
                            var18 ^= -1581750930;
                            var18 ^= 1023102435;
                            Integer var105 = var0;
                            if (var105 == null) {
                                break label73;
                            }

                            var2[5] = var89;
                            var2[7] = var8;
                            var2[8] = var7;
                            var18 *= -902012487;
                            var18 += 1112772954;
                            var18 ^= -799807229;
                            return;
                        }

                        var18 >>>= 3;
                        var18 += -622372348;
                        var18 ^= -1246143614;
                        break;
                    case 1:
                        var18 += -981840726;
                        var18 |= -127259719;
                        var18 -= 170105570;
                        var18 ^= -151631987;
                        var18 ^= 1775574273;
                        int var77 = var0 + 1;
                        var77 = var0 * var77;
                        var10 = var0 + 2;
                        var77 *= var10;
                        var10 = var0 + 3;
                        var77 *= var10;
                        var77 &= 7;
                        if (var77 != 0) {
                            break label73;
                        }

                        var2[0] = var7;
                        var2[2] = var8;
                        var2[4] = 1.0F;
                        float var82 = -var8;
                        var2[6] = var82;
                        Integer var83 = var0;
                        if (var83 != null) {
                            var18 = switch (var18) {
                                case -1487996968 -> var18 ^ 901760995;
                                default -> var18 ^ -1701626538;
                                case 1793444433 -> {
                                    var18 &= 1689679620;
                                    var18 -= 1142278277;
                                    var18 -= -1638374181;
                                    yield var18 ^ 1807007092;
                                }
                            };
                            int var84 = var0 + 1;
                            var84 = var0 * var84;
                            var10 = var0 + 2;
                            var84 *= var10;
                            var10 = var0 + 3;
                            var84 *= var10;
                            var84 &= 7;
                            if (var84 != 0) {
                                break label73;
                            }

                            var2[8] = var7;
                            switch (var18) {
                                case -242349735:
                                    var18 ^= -1471919073;
                                    return;
                                case 360884692:
                                    var18 ^= 1650057520;
                                    var18 ^= -2143009833;
                                    var18 ^= -495958181;
                                    var18 -= 890628479;
                                    var18 ^= 1098531570;
                                    return;
                                case 1915540302:
                                default:
                                    var18 ^= 219407825;
                                    return;
                            }
                        }

                        var18 &= 1632637852;
                        var18 ^= 567771930;
                        break;
                    default:
                        var18 >>>= 3;
                        var18 &= 313222105;
                        var18 -= 441728661;
                        var18 ^= 2060075771;
                        Integer var9 = var0;
                        if (var9 == null) {
                            break label73;
                        }

                        var2[0] = var7;
                        float var73 = -var8;
                        var2[1] = var73;
                        long var74 = var0;
                        long var107 = var74 + 1L;
                        long var108 = var74 * var107;
                        long var13 = var74 + 2L;
                        long var109 = var108 * var13;
                        long var75 = var74 + 3L;
                        long var110 = var109 * var75;
                        long var76 = var110 & 7L;
                        long var118;
                        int var6 = (var118 = var76 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            var18 &= 914382911;
                            var18 -= 127208878;
                            var18 ^= 206522210;
                            var2[3] = var8;
                            var2[4] = var7;
                            var2[8] = 1.0F;
                            var18 >>= 13;
                            var18 |= 1750710149;
                            var18 ^= -906324036;
                            return;
                        }

                        var18 >>= 17;
                        var18 ^= -1860633328;
                        var18 ^= 795915178;
                }
            }

            Integer var59 = var0;
            if (var59 != null) {
                IllegalArgumentException var60 = new IllegalArgumentException();
                throw var60;
            }
        }

        UnsupportedOperationException var66 = new UnsupportedOperationException();
        throw var66;
    }

    public static float ef(float var0, float var1, float var2) {
        int var3 = zH;
        var3 ^= 205273077;
        int var4 = (int)var0;
        float var5 = -0.42F * var0;
        float var6 = 0.72F * var1;
        Integer var21 = var4;
        if (var21 == null) {
            var3 <<= 22;
            var3 ^= 2106766978;
            var3 |= 451268253;
            var3 -= 1985293334;
            var3 ^= -223869679;
            UnsupportedOperationException var28 = new UnsupportedOperationException();
            throw var28;
        } else {
            var3 ^= -1929907363;
            var3 ^= 527081263;
            float var10 = var5 + var6;
            float var22 = 0.55F * var2;
            float var11 = var10 + var22;
            float var12 = Math.max(0.0F, var11);
            float var23 = 0.62F * var0;
            var5 = 0.1F * var1;
            float var24 = var23 + var5;
            var5 = 0.78F * var2;
            float var25 = var24 + var5;
            float var26 = Math.max(0.0F, var25);
            float var13 = 0.55F * var12;
            float var14 = 0.38F + var13;
            float var27 = 0.24F * var26;
            float var15 = var14 + var27;
            return Math.min(1.0F, var15);
        }
    }

    public static float uK(float var0, float var1, float var2, float var3, float var4, float var5) {
        int var6 = zH;
        var6 ^= -1635218393;
        int var7 = (int)var0;
        float var8 = var0 * var0;
        float var9 = var1 * var1;
        var8 += var9;
        var9 = var2 * var2;
        var8 += var9;
        double var84 = var8;
        double var85 = Math.sqrt(var84);
        var8 = (float)var85;
        long var95 = var7;
        long var11 = var95 + 1L;
        var11 = var95 * var11;
        long var13 = var95 + 2L;
        var11 *= var13;
        long var96 = var95 + 3L;
        var11 *= var96;
        long var97 = var11 & 7L;
        long var173;
        int var98 = (var173 = var97 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
        label111:
        if (var98 == 0) {
            var6 = switch (var6) {
                case -505005331 -> {
                    var6 -= 1845163406;
                    var6 ^= -1308174224;
                    var6 |= -1782215696;
                    var6 -= 1563305209;
                    yield var6 ^ 398735063;
                }
                default -> var6 ^ -746277684;
                case 1500918234 -> var6 ^ 1059861374;
            };
            Integer var99 = var6;
            if (var99 != null) {
                float var174;
                int var100 = (var174 = var8 - 1.0E-5F) == 0.0F ? 0 : (var174 < 0.0F ? -1 : 1);
                if (var100 < 0) {
                    var6 *= 846762013;
                    var6 &= 2018531404;
                    var6 >>>= 10;
                    var6 ^= 1517774098;
                    var6 ^= -1113171853;
                    return 0.0F;
                }

                var6 *= 539174987;
                var6 ^= 417094844;
                long var101 = var6;
                var11 = var101 + 1L;
                var11 = var101 * var11;
                long var102 = var11 & 1L;
                long var175;
                int var103 = (var175 = var102 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                if (var103 == 0) {
                    var9 = -var0;
                    var9 /= var8;
                    float var10 = -var1;
                    var10 /= var8;
                    float var123 = -var2;
                    var8 = var123 / var8;
                    float var124 = var3 * var9;
                    float var12 = var4 * var10;
                    float var125 = var124 + var12;
                    var12 = var5 * var8;
                    float var126 = var125 + var12;
                    int var139 = var7 + 1;
                    int var140 = var7 * var139;
                    int var152 = var7 + 2;
                    int var141 = var140 * var152;
                    int var153 = var7 + 3;
                    int var142 = var141 * var153;
                    int var143 = var142 & 7;
                    if (var143 != 0) {
                        switch (var6) {
                            case -1475925881:
                                var6 >>= 3;
                                var6 ^= -103264688;
                                break label111;
                            case 438929636:
                                var6 ^= 403873077;
                                break label111;
                            case 953994905:
                            default:
                                var6 ^= -1138494257;
                                break label111;
                        }
                    }

                    var6 *= 632403443;
                    var6 <<= 8;
                    var6 ^= -1170745371;
                    Integer var144 = var6;
                    label101:
                    if (var144 != null) {
                        float var176;
                        int var145 = (var176 = var126 - 0.0F) == 0.0F ? 0 : (var176 < 0.0F ? -1 : 1);
                        float var155;
                        float var160;
                        float var161;
                        if (var145 < 0) {
                            var6 |= -1243188782;
                            var6 ^= 860672006;
                            var6 += 1946351631;
                            var6 ^= 1846894133;
                            long var146 = var6;
                            long var14 = var146 + 1L;
                            long var156 = var146 * var14;
                            long var16 = var146 + 2L;
                            long var157 = var156 * var16;
                            long var147 = var146 + 3L;
                            long var158 = var157 * var147;
                            long var148 = var158 & 7L;
                            long var177;
                            int var149 = (var177 = var148 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                            if (var149 != 0) {
                                break label101;
                            }

                            var12 = -var3;
                            float var154 = -var4;
                            var160 = -var5;
                            var161 = -var126;
                            var161 = var161;
                            var12 = var12;
                            var155 = var154;
                            Integer var162 = var7;
                            if (var162 == null) {
                                var6 ^= 387916299;
                                var6 ^= -129545371;
                                var6 ^= -1256161253;
                                break label111;
                            }

                            var6 -= 78629680;
                            var6 ^= 701272019;
                            var160 = var160;
                            switch (var6) {
                                case -248895904:
                                default:
                                    var6 ^= 744802913;
                                    break;
                                case 1117323954:
                                    var6 ^= -50053351;
                                    break;
                                case 2017261782:
                                    var6 >>= 10;
                                    var6 ^= 39829122;
                            }
                        } else {
                            var6 = switch (var6) {
                                case -1981255211 -> var6 ^ -1940553377;
                                default -> var6 ^ -974880350;
                                case 1943859941 -> {
                                    var6 *= 1227843161;
                                    yield var6 ^ 1465240798;
                                }
                            };
                            int var163 = var6 + 1;
                            var163 = var6 * var163;
                            var163 &= 1;
                            if (var163 != 0) {
                                break label101;
                            }

                            var161 = var126;
                            int var127 = var7 + 1;
                            int var128 = var7 * var127;
                            var163 = var7 + 2;
                            int var129 = var128 * var163;
                            var163 = var7 + 3;
                            int var130 = var129 * var163;
                            int var131 = var130 & 7;
                            if (var131 != 0) {
                                var6 -= 1193238522;
                                var6 -= 735204773;
                                var6 ^= -52623644;
                                break label111;
                            }

                            var6 |= -1082457770;
                            var6 ^= 841229939;
                            Integer var132 = var6;
                            if (var132 == null) {
                                break label101;
                            }

                            var12 = var3;
                            var155 = var4;
                            var160 = var5;
                            switch (var6) {
                                case -841267932:
                                    var6 |= 38377457;
                                    var6 ^= -845519287;
                                    break;
                                case -348969174:
                                    var6 ^= -1652336951;
                                    break;
                                case 365206934:
                                default:
                                    var6 ^= 2038900337;
                            }
                        }

                        float var133 = -0.42F;
                        float var168 = 0.72F;
                        float var17 = 0.55F;
                        var9 = var133 + var9;
                        var10 = var168 + var10;
                        var8 = var17 + var8;
                        float var134 = var9 * var9;
                        var168 = var10 * var10;
                        float var135 = var134 + var168;
                        var168 = var8 * var8;
                        float var136 = var135 + var168;
                        double var171 = var136;
                        double var172 = Math.sqrt(var171);
                        float var137 = (float)var172;
                        var9 = var12 * var9;
                        var10 = var155 * var10;
                        Integer var72 = var7;
                        if (var72 != null) {
                            switch (var6) {
                                case -1139472564:
                                default:
                                    var6 ^= 922207747;
                                    break;
                                case -280214734:
                                    var6 ^= 847128780;
                                    break;
                                case 37859772:
                                    var6 *= 1619731477;
                                    var6 <<= 4;
                                    var6 &= -1581486760;
                                    var6 ^= -1795810405;
                            }

                            float var73 = var9 + var10;
                            var8 = var160 * var8;
                            float var74 = var73 + var8;
                            float var75 = var74 / var137;
                            float var76 = Math.max(0.0F, var75);
                            double var90 = var76;
                            double var91 = Math.pow(var90, 48.0);
                            var8 = (float)var91;
                            var8 *= 0.55F;
                            double var108 = var76;
                            double var109 = Math.pow(var108, 7.0);
                            float var77 = (float)var109;
                            float var78 = var77 * 0.14F;
                            var9 = 1.0F - var161;
                            double var111 = var9;
                            double var112 = Math.pow(var111, 5.0);
                            var9 = (float)var112;
                            var9 *= 0.12F;
                            float var79 = var8 + var78;
                            float var80 = var79 + var9;
                            return Math.min(1.0F, var80);
                        }

                        switch (var6) {
                            case -1186904230:
                                var6 ^= 1466739177;
                                break label111;
                            case 37859772:
                                var6 &= 1972846636;
                                var6 |= -2114610382;
                                var6 -= -155704376;
                                var6 ^= -2014979018;
                                break label111;
                            case 1056237816:
                            default:
                                var6 ^= -1430832634;
                                break label111;
                        }
                    }
                }
            }

            RuntimeException var81 = new RuntimeException();
            throw var81;
        } else {
            var6 &= -694029874;
            var6 ^= -864511092;
        }

        UnsupportedOperationException var66 = new UnsupportedOperationException();
        throw var66;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 496630860;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        zH = var4;
    }
}
