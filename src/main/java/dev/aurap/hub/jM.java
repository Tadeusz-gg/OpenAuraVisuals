package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class jM {
    public static final int Iu = 512;
    private static final float h = 0.0F;
    private static final float N = 0.5F;
    private static final float p = 0.5F;
    private static final float Ft = 0.625F;
    private static final float ti = 0.625F;
    private static final float BC = 0.875F;
    private static final float yd = 0.0029296875F;
    public static final float t = 0.5F;
    public static final float GQ = 0.9375F;
    public static final int m;

    private jM() {
    }

    public static float[] V(float var0, float var1) {
        int var2 = m;
        var2 ^= -652326285;
        int var3 = (int)var0;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        var4 = of_2.y;
        var2 ^= var4;
        var2 ^= -864320044;
        var4 = of_2.DG;
        var2 ^= var4;
        var2 ^= -2002287152;
        if (var3 == 0) {
            var2 |= -614361377;
            var2 += -1172348012;
            var2 -= -1099075052;
            var2 ^= 1949670146;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                var3 = var2 + 1938019553;
                var3 ^= -1122198892;
                return LV(var0, var1, 0.0F, 0.5F, var3);
            }
        } else {
            var2 |= -1762378714;
            var2 &= -1956431239;
            var2 >>>= 6;
            var2 ^= -1397329201;
            Integer var18 = var2;
            if (var18 != null) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public static float[] Qm(float var0, float var1) {
        int var2 = m;
        var2 ^= 544883295;
        int var3 = (int)var0;
        long var26 = var3;
        long var5 = var26 + 1L;
        var5 = var26 * var5;
        long var27 = var5 & 1L;
        long var44;
        var3 = (var44 = var27 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
        int var4 = of_2.y;
        var2 ^= var4;
        var2 ^= -864320044;
        of_2.y = -864320044;
        var4 = of_2.DG;
        var2 ^= var4;
        var2 ^= -2002287152;
        of_2.DG = -2002287152;
        if (var3 != 0) {
            long var29 = switch (var2) {
                case -2068003183 -> var2 ^ -1686521381;
                case -496755869 -> {
                    var2 |= -1679770540;
                    var2 &= 142966399;
                    var2 -= -457397059;
                    var2 ^= 1820531644;
                    yield var2 ^ -278765715;
                }
                default -> var2 ^ -4236040;
            };
            var5 = var29 + 1L;
            var5 = var29 * var5;
            long var7 = var29 + 2L;
            var5 *= var7;
            long var30 = var29 + 3L;
            var5 *= var30;
            long var31 = var5 & 7L;
            long var45;
            var3 = (var45 = var31 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
            if (var3 == 0) {
                UnsupportedOperationException var33 = new UnsupportedOperationException();
                throw var33;
            }
        } else {
            var2 = switch (var2) {
                case -496755869 -> {
                    var2 += -2009975941;
                    var2 &= 2084405114;
                    yield var2 ^ -1250990544;
                }
                default -> var2 ^ -1608700974;
                case 2126219360 -> var2 ^ 2009239033;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                var2 &= 650777569;
                var2 += 750835877;
                var2 &= 1521767630;
                var2 ^= -1146802770;
                return LV(var0, var1, 0.5F, 0.625F, var2);
            }
        }

        AssertionError var37 = new AssertionError();
        throw var37;
    }

    public static float[] qk(float var0, float var1) {
        int var2 = m;
        var2 ^= 1421872735;
        int var3 = (int)var0;
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var7 = var19 + 2L;
        var5 *= var7;
        long var20 = var19 + 3L;
        var5 *= var20;
        long var21 = var5 & 7L;
        long var38;
        var3 = (var38 = var21 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 *= 1551667951;
            var2 ^= -106653491;
            var2 -= -1325730879;
            var2 |= 1658118387;
            var2 ^= -44246177;
            long var23 = var2;
            var5 = var23 + 1L;
            var5 = var23 * var5;
            var7 = var23 + 2L;
            var5 *= var7;
            long var24 = var23 + 3L;
            var5 *= var24;
            long var25 = var5 & 7L;
            long var39;
            var3 = (var39 = var25 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var3 == 0) {
                var3 = var2 << 26;
                var3 ^= 732265898;
                return LV(var0, var1, 0.625F, 0.875F, var3);
            } else {
                UnsupportedOperationException var27 = new UnsupportedOperationException();
                throw var27;
            }
        } else {
            var2 -= -237522454;
            var2 += -1689245782;
            var2 ^= -980382997;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    private static float[] LV(float var0, float var1, float var2, float var3, int var4) {
        int var6 = (int)var0;
        float[] var7 = new float[2];
        float var8 = TP.t(var0, 0.0029296875F, 0.9970703F);
        Integer var23 = var6;
        if (var23 == null) {
            int var5 = switch (var4) {
                case -1415217750 -> {
                    int var10 = var4 | 1733834845;
                    var10 *= 2130941075;
                    var10 <<= 31;
                    yield var10 ^ 892088628;
                }
                case -126810426 -> var4 ^ -1032603210;
                default -> var4 ^ -1203082028;
            };
            int var24 = var5 + 1;
            var24 = var5 * var24;
            int var9 = var5 + 2;
            var24 *= var9;
            var9 = var5 + 3;
            var24 *= var9;
            var24 &= 7;
            if (var24 == 0) {
                IllegalStateException var29 = new IllegalStateException();
                throw var29;
            }
        } else {
            int var13 = var4 ^ -707851940;
            var13 >>= 27;
            var13 -= -2140621498;
            var13 ^= -1951629787;
            Integer var17 = var13;
            if (var17 != null) {
                var7[0] = var8;
                float var19 = var3 - var2;
                float var20 = var1 * var19;
                float var21 = var2 + var20;
                float var30 = var2 + 0.0029296875F;
                var8 = var3 - 0.0029296875F;
                float var22 = TP.t(var21, var30, var8);
                var7[1] = var22;
                return var7;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public static int[] on(Da var0, bT var1, int var2) {
        label225: {
            int var3 = m;
            int var4 = var2;
            var3 ^= 272100193;
            int var5 = System.identityHashCode(var0);
            long var6 = var5;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var331;
            int var174 = (var331 = var6 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
            if (var174 != 0) {
                var3 += 944428338;
                var3 <<= 6;
                var3 ^= 740011922;
            } else {
                var3 |= -1717330118;
                var3 += -807970275;
                var3 >>= 27;
                var3 -= -559965009;
                var3 ^= 1626371947;
                int var175 = var2 + 1;
                int var176 = var2 * var175;
                int var177 = var176 & 1;
                if (var177 != 0) {
                    break label225;
                }

                int[] var178 = new int[262144];
                int[] var179 = var178;
                int var188 = var2 * 31;
                int var9 = var1.ordinal();
                int var189 = var188 + var9;
                rH var7 = new rH(var189);
                var7 = var7;
                byte var190 = 0;
                int var191 = var190;
                var3 += -92455279;
                var3 += -2009641510;
                var3 += -530843169;
                var3 *= 1146998155;
                var3 ^= -1832703949;

                label222:
                while (true) {
                    if (var191 >= 512) {
                        var3 += 1123810247;
                        var3 *= -108845099;
                        var3 ^= 736910741;
                        long var166 = var4;
                        long var181 = var166 + 1L;
                        long var182 = var166 * var181;
                        long var200 = var166 + 2L;
                        long var183 = var182 * var200;
                        long var167 = var166 + 3L;
                        long var184 = var183 * var167;
                        long var168 = var184 & 7L;
                        long var332;
                        var3 = (var332 = var168 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return var179;
                        }
                        break label225;
                    }

                    var3 += 34023405;
                    var3 &= -1893101658;
                    var3 >>= 10;
                    var3 ^= 1499631541;
                    var3 ^= 333502662;
                    float var192 = var191;
                    float var193 = var192 + 0.5F;
                    float var194 = var193 / 512.0F;
                    int var201 = var5 + 1;
                    int var202 = var5 * var201;
                    int var11 = var5 + 2;
                    int var203 = var202 * var11;
                    var11 = var5 + 3;
                    int var204 = var203 * var11;
                    int var205 = var204 & 7;
                    if (var205 != 0) {
                        var3 -= -1062513510;
                        var3 |= -1542932225;
                        var3 -= 542944087;
                        var3 ^= -1676412005;
                        var3 ^= -1599358367;
                        break;
                    }

                    var3 *= -1923716403;
                    var3 ^= -25462898;
                    float var195 = var194;
                    byte var206 = 0;
                    int var207 = var206;
                    var3 ^= 89144961;
                    var3 <<= 16;
                    var3 *= -2114803035;
                    var3 ^= 406843367;

                    while (true) {
                        long var212 = var4;
                        long var13 = var212 + 1L;
                        var13 = var212 * var13;
                        long var213 = var13 & 1L;
                        long var333;
                        var11 = (var333 = var213 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                        if (var11 != 0) {
                            break label225;
                        }

                        if (var207 >= 512) {
                            var3 = switch (var3) {
                                default -> var3 ^ -160220274;
                                case -1186598937 -> {
                                    var3 *= 1214265333;
                                    var3 -= 1585369575;
                                    var3 |= 2087050087;
                                    yield var3 ^ 91795935;
                                }
                                case -276000026 -> var3 ^ -1018694563;
                            };
                            long var196 = var4;
                            long var224 = var196 + 1L;
                            long var225 = var196 * var224;
                            long var197 = var225 & 1L;
                            long var343;
                            var9 = (var343 = var197 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                break label225;
                            }

                            var9 = var191 + 1;
                            var10 = var5;
                            long var240 = var10 + 1L;
                            var240 = var10 * var240;
                            var10 = var240 & 1L;
                            long var344;
                            int var210 = (var344 = var10 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                            if (var210 != 0) {
                                var3 <<= 12;
                                var3 >>>= 22;
                                var3 ^= -1321579135;
                                break label222;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ 1156177472;
                                case -2055314089 -> var3 ^ 1145591672;
                                case -75018576 -> {
                                    var3 |= -943178412;
                                    var3 ^= -290643749;
                                    var3 |= 390141844;
                                    yield var3 ^ -1289690721;
                                }
                            };
                            var191 = var9;
                            var3 ^= -325689678;
                            var3 ^= -953541420;
                            var3 ^= -1524826648;
                            break;
                        }

                        var3 -= 207092465;
                        var3 &= 1735084786;
                        var3 |= 687016705;
                        var3 ^= -564156323;
                        float var215 = var207;
                        float var216 = var215 + 0.5F;
                        int var12 = var5 + 1;
                        var12 = var5 * var12;
                        var12 &= 1;
                        if (var12 != 0) {
                            switch (var3) {
                                case -1080109740:
                                    var3 ^= -1965255977;
                                    break label222;
                                case -224074834:
                                    var3 += 1894623844;
                                    var3 ^= -760692160;
                                    break label222;
                                case 1179615182:
                                default:
                                    var3 ^= 2007524562;
                                    break label222;
                            }
                        }
                        var3 = switch (var3) {
                            default -> var3 ^ -1407375611;
                            case -597326382 -> var3 ^ 1197548230;
                            case -224074834 -> {
                                var3 &= 763873778;
                                var3 += -182685048;
                                yield var3 ^ 1765362725;
                            }
                        };
                        Integer var228 = var4;
                        if (var228 == null) {
                            break label225;
                        }

                        float var217 = var216 / 512.0F;
                        float var334;
                        int var229 = (var334 = var195 - 0.5F) == 0.0F ? 0 : (var334 < 0.0F ? -1 : 1);
                        if (var229 < 0) {
                            var3 += 2008580336;
                            var3 ^= -204371149;
                            var229 = var4 + 1;
                            var229 = var4 * var229;
                            var229 &= 1;
                            if (var229 != 0) {
                                break label225;
                            }

                            float var233 = var195 - 0.0F;
                            float var234 = var233 / 0.5F;
                            int var243 = var1.color(var217, var234, var7);
                            float var235 = var0.bladeShade(var217, var234);
                            var229 = DP.PP(var243, --var235);
                            var13 = var5;
                            long var15 = var13 + 1L;
                            var15 = var13 * var15;
                            var13 = var15 & 1L;
                            long var335;
                            int var246 = (var335 = var13 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                            if (var246 != 0) {
                                switch (var3) {
                                    case -1756709713:
                                        var3 ^= -164669957;
                                        break label222;
                                    case -64163741:
                                    default:
                                        var3 ^= 1054837786;
                                        break label222;
                                    case 125924300:
                                        var3 += 1526536189;
                                        var3 ^= -750467173;
                                        break label222;
                                }
                            }

                            var3 |= -797870204;
                            var3 ^= -1158463118;
                            int var247 = var4 + 1;
                            int var248 = var4 * var247;
                            int var14 = var4 + 2;
                            int var249 = var248 * var14;
                            var14 = var4 + 3;
                            int var250 = var249 * var14;
                            int var251 = var250 & 7;
                            if (var251 != 0) {
                                break label225;
                            }

                            var229 = var229;
                            var3 &= 256818488;
                            var3 <<= 25;
                            var3 ^= -46025256;
                            var3 ^= -2080583299;
                        } else {
                            var3 |= 1753047229;
                            var3 ^= -1357053648;
                            var3 ^= -18387489;
                            int var252 = var4 + 1;
                            int var253 = var4 * var252;
                            int var254 = var253 & 1;
                            if (var254 != 0) {
                                break label225;
                            }

                            float var336;
                            int var255 = (var336 = var195 - 0.625F) == 0.0F ? 0 : (var336 < 0.0F ? -1 : 1);
                            long var280 = var5;
                            long var16 = var280 + 1L;
                            var16 = var280 * var16;
                            long var18 = var280 + 2L;
                            var16 *= var18;
                            var280 += 3L;
                            var16 *= var280;
                            var280 = var16 & 7L;
                            long var337;
                            int var283 = (var337 = var280 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                            if (var283 != 0) {
                                switch (var3) {
                                    case 740309559:
                                        var3 ^= -592958451;
                                        break label222;
                                    case 755438672:
                                        var3 -= 1281171767;
                                        var3 ^= 1368637259;
                                        break label222;
                                    case 1492168492:
                                    default:
                                        var3 ^= 103262510;
                                        break label222;
                                }
                            }

                            var3 &= 2042807037;
                            var3 ^= 1213601101;
                            Integer var284 = var4;
                            if (var284 == null) {
                                break label225;
                            }

                            if (var255 < 0) {
                                var3 *= 975483121;
                                var3 += 2010179342;
                                var3 += 634142181;
                                var3 |= 515904327;
                                var3 ^= 760533806;
                                Integer var256 = var4;
                                if (var256 == null) {
                                    break label225;
                                }

                                float var257 = var195 - 0.5F;
                                int var285 = var5 + 1;
                                int var286 = var5 * var285;
                                int var311 = var5 + 2;
                                int var287 = var286 * var311;
                                var311 = var5 + 3;
                                int var288 = var287 * var311;
                                int var289 = var288 & 7;
                                if (var289 != 0) {
                                    var3 >>= 22;
                                    var3 *= -1099938371;
                                    var3 -= 826119323;
                                    var3 ^= -1649065175;
                                    break label222;
                                }

                                var3 &= -1613082131;
                                var3 >>= 18;
                                var3 ^= -2133033217;
                                var3 >>>= 17;
                                var3 ^= -1799998911;
                                var280 = var4;
                                var16 = var280 + 1L;
                                var16 = var280 * var16;
                                var18 = var280 + 2L;
                                var16 *= var18;
                                var280 += 3L;
                                var16 *= var280;
                                var280 = var16 & 7L;
                                long var338;
                                int var293 = (var338 = var280 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                                if (var293 != 0) {
                                    break label225;
                                }

                                float var258 = var257 / 0.125F;
                                int var294 = var3 ^ 1857716600;
                                int var295 = var294 - 913168408;
                                int var296 = var295 * -1248629157;
                                int var297 = var296 * -1060379581;
                                int var298 = var297 ^ 800912024;
                                int var259 = B(var0, var1, var217, var258, var7, var298);
                                var229 = var259;
                                var3 |= 625256495;
                                var3 += -576084977;
                                var3 |= -1490890984;
                                var3 += 1498092026;
                                var3 ^= 508597693;
                            } else {
                                var3 |= -1271418890;
                                var3 ^= 837278943;
                                var3 ^= 640436315;
                                Integer var260 = var4;
                                if (var260 == null) {
                                    break label225;
                                }

                                float var339;
                                int var261 = (var339 = var195 - 0.875F) == 0.0F ? 0 : (var339 < 0.0F ? -1 : 1);
                                int var299 = var5 + 1;
                                int var300 = var5 * var299;
                                int var313 = var5 + 2;
                                int var301 = var300 * var313;
                                var313 = var5 + 3;
                                int var302 = var301 * var313;
                                int var303 = var302 & 7;
                                if (var303 != 0) {
                                    var3 >>= 9;
                                    var3 <<= 5;
                                    var3 ^= 1326550770;
                                    break label222;
                                }

                                var3 &= 1200007460;
                                var3 ^= -369262212;
                                Integer var304 = var4;
                                if (var304 == null) {
                                    break label225;
                                }

                                if (var261 < 0) {
                                    var3 |= 324936240;
                                    var3 *= -1997939049;
                                    var3 |= -1450005704;
                                    var3 *= 326232365;
                                    var3 ^= 1195249376;
                                    Integer var262 = var4;
                                    if (var262 == null) {
                                        break label225;
                                    }

                                    float var263 = var195 - 0.625F;
                                    Integer var305 = var5;
                                    if (var305 == null) {
                                        switch (var3) {
                                            case 353341380:
                                                var3 ^= 121800411;
                                                break label222;
                                            case 1924937580:
                                                var3 ^= 1990087420;
                                                var3 += 857852354;
                                                var3 ^= -2038537472;
                                                break label222;
                                            case 2006634017:
                                            default:
                                                var3 ^= -1203775755;
                                                break label222;
                                        }
                                    }

                                    var3 |= -1033099588;
                                    var3 &= -653333733;
                                    var3 ^= 688480695;
                                    float var264 = var263 / 0.25F;
                                    int var306 = var3 & 1762723577;
                                    int var307 = var306 ^ 1970285647;
                                    var11 = T(var0, var217, var264, var7, var307);
                                    var229 = var11;
                                    switch (var3) {
                                        case -117095761:
                                            var3 *= 1741876495;
                                            var3 ^= -1675259932;
                                            break;
                                        case 532117277:
                                            var3 ^= 312638565;
                                            break;
                                        case 1289116374:
                                        default:
                                            var3 ^= 894091308;
                                    }
                                } else {
                                    var3 = switch (var3) {
                                        case -1418090404 -> {
                                            var3 ^= 2023624253;
                                            var3 |= 2147178510;
                                            var3 ^= -1381253236;
                                            var3 += 212901779;
                                            yield var3 ^ -612097586;
                                        }
                                        default -> var3 ^ 1897051246;
                                        case 1486540089 -> var3 ^ -999418845;
                                    };
                                    byte var219 = -1;
                                    var13 = var5;
                                    long var315 = var13 + 1L;
                                    long var316 = var13 * var315;
                                    long var17 = var13 + 2L;
                                    long var317 = var316 * var17;
                                    var13 += 3L;
                                    long var318 = var317 * var13;
                                    var13 = var318 & 7L;
                                    long var340;
                                    int var268 = (var340 = var13 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                                    if (var268 != 0) {
                                        var3 &= -163247188;
                                        var3 &= -444966472;
                                        var3 <<= 1;
                                        var3 ^= -1187361534;
                                        break label222;
                                    }

                                    var3 += 49231573;
                                    var3 *= 885422937;
                                    var3 &= 1433880999;
                                    var3 *= 1145749681;
                                    var3 ^= 848089790;
                                    int var269 = var4 + 1;
                                    int var270 = var4 * var269;
                                    int var308 = var4 + 2;
                                    int var271 = var270 * var308;
                                    int var309 = var4 + 3;
                                    int var272 = var271 * var309;
                                    int var273 = var272 & 7;
                                    if (var273 != 0) {
                                        break label225;
                                    }

                                    var229 = var219;
                                    var3 &= 1742045920;
                                    var3 += 306836782;
                                    var3 -= 705652531;
                                    var3 ^= -500337634;
                                }
                            }
                        }

                        var13 = var4;
                        long var319 = var13 + 1L;
                        var319 = var13 * var319;
                        var13 = var319 & 1L;
                        long var341;
                        var11 = (var341 = var13 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                        if (var11 != 0) {
                            break label225;
                        }

                        var11 = var191 * 512;
                        var11 += var207;
                        var13 = var5;
                        var319 = var13 + 1L;
                        var319 = var13 * var319;
                        var13 = var319 & 1L;
                        long var342;
                        int var278 = (var342 = var13 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
                        if (var278 != 0) {
                            var3 *= -1454677145;
                            var3 += 1043573348;
                            var3 *= 477961351;
                            var3 *= 1193298513;
                            var3 ^= 1340751635;
                            break label222;
                        }

                        var3 -= -1189482624;
                        var3 -= 403175429;
                        var3 ^= 536746022;
                        var3 &= -1762783498;
                        var3 ^= -948983973;
                        var229 |= -16777216;
                        var179[var11] = var229;
                        var11 = var207 + 1;
                        var207 = var11;
                        switch (var3) {
                            case -1539889262:
                            default:
                                var3 ^= -848777547;
                                break;
                            case -989093027:
                                var3 += -884446315;
                                var3 ^= 689037589;
                                break;
                            case 270698085:
                                var3 ^= -1580009787;
                        }
                    }
                }
            }

            RuntimeException var171 = new RuntimeException();
            throw var171;
        }

        IllegalStateException var170 = new IllegalStateException();
        throw var170;
    }

    private static int B(Da var0, bT var1, float var2, float var3, rH var4, int var5) {
        label76: {
            int var7 = System.identityHashCode(var0);
            int var8 = var1.bare() ? 1 : 0;
            Integer var9 = var7;
            int var6;
            if (var9 == null) {
                switch (var5) {
                    case -568964344:
                        var6 = var5 - -2090533075;
                        var6 ^= -1457394803;
                        break;
                    case 533532948:
                    default:
                        var6 = var5 ^ -1003141096;
                        break;
                    case 1570861783:
                        var6 = var5 ^ -729209734;
                }
            } else {
                label78: {
                    var6 = var5 & -5798344;
                    var6 ^= -649154327;
                    var6 ^= -819828192;
                    var6 += 404839412;
                    var6 ^= -1182458494;
                    int var68 = var6 + 1;
                    var68 = var6 * var68;
                    int var10 = var6 + 2;
                    var68 *= var10;
                    var10 = var6 + 3;
                    var68 *= var10;
                    var68 &= 7;
                    if (var68 != 0) {
                        break label76;
                    }

                    if (var8 != 0) {
                        var6 <<= 13;
                        var6 *= -714157303;
                        var6 *= 1045190593;
                        var6 ^= 144943985;
                        float var61 = var2 * 0.3F;
                        var68 = var7 + 1;
                        var68 = var7 * var68;
                        var10 = var7 + 2;
                        var68 *= var10;
                        var10 = var7 + 3;
                        var68 *= var10;
                        var68 &= 7;
                        if (var68 != 0) {
                            var6 *= -47514885;
                            var6 &= -205301841;
                            var6 |= -323211636;
                            var6 *= -173669019;
                            var6 ^= 657505853;
                            break label78;
                        }

                        var6 ^= -1048583055;
                        var6 |= 2086265002;
                        var6 ^= 1222270052;
                        long var78 = var6;
                        long var11 = var78 + 1L;
                        var11 = var78 * var11;
                        long var13 = var78 + 2L;
                        var11 *= var13;
                        long var79 = var78 + 3L;
                        var11 *= var79;
                        long var80 = var11 & 7L;
                        long var126;
                        var68 = (var126 = var80 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break label76;
                        }

                        var8 = var1.color(var61, 0.35F, var4);
                        var8 = var8;
                        var6 -= 928222349;
                        var6 ^= -950894658;
                    } else {
                        var6 = switch (var6) {
                            default -> var6 ^ 289513002;
                            case -1266980838 -> var6 ^ 943609754;
                            case 1493772599 -> {
                                var6 -= -409246408;
                                var6 |= -102144462;
                                yield var6 ^ -1283042494;
                            }
                        };
                        long var82 = var6;
                        long var100 = var82 + 1L;
                        var100 = var82 * var100;
                        long var114 = var82 + 2L;
                        var100 *= var114;
                        long var83 = var82 + 3L;
                        var100 *= var83;
                        long var84 = var100 & 7L;
                        long var127;
                        var68 = (var127 = var84 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break label76;
                        }

                        float var86 = var2 * 0.25F;
                        float var87 = 0.08F + var86;
                        float var93 = 0.3F * var3;
                        float var94 = 0.35F + var93;
                        Integer var104 = var7;
                        if (var104 == null) {
                            var6 ^= 1079894517;
                            var6 |= 1083653373;
                            var6 ^= -1188569685;
                            break label78;
                        }

                        var6 ^= 499393770;
                        var6 ^= -1997215110;
                        var100 = var6;
                        var114 = var100 + 1L;
                        var114 = var100 * var114;
                        long var15 = var100 + 2L;
                        var114 *= var15;
                        var100 += 3L;
                        var114 *= var100;
                        var100 = var114 & 7L;
                        long var128;
                        int var108 = (var128 = var100 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                        if (var108 != 0) {
                            break label76;
                        }

                        var68 = var1.color(var87, var94, var4);
                        var8 = var68;
                        var6 <<= 11;
                        var6 ^= -1665978113;
                    }

                    float var89 = var2 * 3.0F;
                    float var95 = var3 * 40.0F;
                    long var109 = var7;
                    long var119 = var109 + 1L;
                    var119 = var109 * var119;
                    long var125 = var109 + 2L;
                    var119 *= var125;
                    var109 += 3L;
                    var119 *= var109;
                    var109 = var119 & 7L;
                    long var129;
                    var7 = (var129 = var109 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                    if (var7 == 0) {
                        var109 = switch (var6) {
                            case -256363250 -> var6 ^ -1934787228;
                            default -> var6 ^ -293320451;
                            case 1197627647 -> {
                                var6 ^= 1204848985;
                                yield var6 ^ -105521091;
                            }
                        };
                        var119 = var109 + 1L;
                        var119 = var109 * var119;
                        var109 = var119 & 1L;
                        long var130;
                        var7 = (var130 = var109 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                        if (var7 == 0) {
                            float var57 = var4.dA(var89, var95, 2);
                            float var58 = var57 - 0.5F;
                            float var59 = 0.12F * var58;
                            float var60 = -0.1F + var59;
                            return DP.PP(var8, var60);
                        }
                        break label76;
                    }

                    var6 >>= 21;
                    var6 -= -16948895;
                    var6 &= -84491843;
                    var6 ^= -208527154;
                }
            }

            long var49 = var6;
            long var64 = var49 + 1L;
            long var65 = var49 * var64;
            long var96 = var49 + 2L;
            long var66 = var65 * var96;
            long var50 = var49 + 3L;
            long var67 = var66 * var50;
            long var51 = var67 & 7L;
            long var131;
            var6 = (var131 = var51 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
            if (var6 == 0) {
                AssertionError var53 = new AssertionError();
                throw var53;
            }
        }

        IllegalArgumentException var54 = new IllegalArgumentException();
        throw var54;
    }

    private static int T(Da var0, float var1, float var2, rH var3, int var4) {
        label77: {
            int var6 = System.identityHashCode(var0);
            long var7 = var6;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var137;
            int var74 = (var137 = var7 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
            int var17;
            if (var74 != 0) {
                var17 = var4 & -2134486316;
                var17 -= -637205902;
                var17 ^= -583074940;
            } else {
                label88: {
                    var17 = switch (var4) {
                        case -787737484 -> var4 ^ 2125684752;
                        case 477179622 -> {
                            var17 = var4 >>> 6;
                            var17 &= 1858780925;
                            var17 &= 1623639992;
                            yield var17 ^ 1483132807;
                        }
                        default -> var4 ^ -516552299;
                    };
                    Da var75 = Da.KARAMBIT;
                    int var100;
                    if (var0 == var75) {
                        var17 += 1510849878;
                        var17 |= -134006280;
                        var17 += 1442545707;
                        var17 >>= 22;
                        var17 ^= -342410740;
                        var7 = var17;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var138;
                        int var78 = (var138 = var7 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                        if (var78 != 0) {
                            break label77;
                        }

                        float var79 = var1 * 26.0F;
                        float var8 = var2 * 30.0F;
                        float var80 = var79 + var8;
                        float var81 = var80 % 1.0F;
                        var8 = var1 * 26.0F;
                        float var91 = var2 * 30.0F;
                        var8 -= var91;
                        var8 += 50.0F;
                        var8 %= 1.0F;
                        float var92 = var81 - 0.5F;
                        float var93 = Math.abs(var92);
                        Integer var10 = var6;
                        if (var10 == null) {
                            var17 -= 780498760;
                            var17 |= 32572636;
                            var17 ^= 1190412042;
                            break label88;
                        }
                        var17 = switch (var17) {
                            case -342410420 -> {
                                var17 += 543337845;
                                var17 &= -2077357301;
                                var17 += -510611174;
                                var17 += -799697398;
                                yield var17 ^ -1105199320;
                            }
                            case 1207039132 -> var17 ^ 1107032487;
                            default -> var17 ^ 973376956;
                        };
                        int var101 = var17 + 1;
                        var101 = var17 * var101;
                        int var119 = var17 + 2;
                        var101 *= var119;
                        int var120 = var17 + 3;
                        var101 *= var120;
                        var101 &= 7;
                        if (var101 != 0) {
                            break label77;
                        }

                        float var106 = var8 - 0.5F;
                        float var107 = Math.abs(var106);
                        float var94 = Math.min(var93, var107);
                        float var95 = var94 * 4.0F;
                        float var96 = TP.S(var95);
                        float var97 = var96 * 0.8F;
                        float var108 = var1 * 60.0F;
                        float var121 = var2 * 60.0F;
                        float var109 = var3.g(var108, var121);
                        float var110 = 0.2F * var109;
                        float var98 = var97 + var110;
                        int var99 = DP.Z(-15329510, -13881547, var98);
                        var100 = var99;
                        var17 += -1144908329;
                        var17 &= -20925140;
                        var17 ^= 1183845028;
                    } else {
                        var17 |= -1378531925;
                        var17 |= -1058033551;
                        var17 ^= 251056760;
                        int var111 = var17 + 1;
                        var111 = var17 * var111;
                        var111 &= 1;
                        if (var111 != 0) {
                            break label77;
                        }

                        float var114 = var1 * 40.0F;
                        float var122 = var2 * 30.0F;
                        long var12 = var6;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var139;
                        int var127 = (var139 = var12 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var127 != 0) {
                            var17 -= -1816155120;
                            var17 &= -471609503;
                            var17 += -283941812;
                            var17 += 1632864134;
                            var17 ^= 1756206821;
                            break label88;
                        }

                        var17 |= -1547815321;
                        var17 ^= -692962075;
                        var17 += -1809116067;
                        var17 |= 1650556019;
                        var17 ^= -636400760;
                        float var115 = var3.dA(var114, var122, 3);
                        var111 = DP.Z(-15461096, -14276563, var115);
                        var100 = var111;
                        var17 -= -1654710984;
                        var17 ^= -1057283416;
                        var17 ^= -995968361;
                    }

                    Integer var117 = var17;
                    if (var117 == null) {
                        break label77;
                    }

                    float var118 = Math.abs(var2);
                    float var123 = var2 - 0.5F;
                    float var124 = Math.abs(var123);
                    float var128 = var2 - 1.0F;
                    var128 = Math.abs(var128);
                    float var125 = Math.min(var124, var128);
                    int var130 = var6 + 1;
                    int var131 = var6 * var130;
                    var6 = var131 & 1;
                    if (var6 == 0) {
                        long var132 = switch (var17) {
                            case -2142204032 -> {
                                var17 |= 319423067;
                                var17 -= -428965238;
                                var17 >>= 17;
                                var17 |= 1465645340;
                                yield var17 ^ -999444752;
                            }
                            case -1588380972 -> var17 ^ -238067212;
                            default -> var17 ^ 1288064378;
                        };
                        long var135 = var132 + 1L;
                        var135 = var132 * var135;
                        long var133 = var135 & 1L;
                        long var140;
                        var6 = (var140 = var133 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            float var65 = Math.min(var118, var125);
                            float var66 = var65 / 0.022F;
                            float var67 = 1.0F - var66;
                            float var68 = TP.S(var67);
                            float var69 = var68 * 0.85F;
                            return DP.Z(var100, -7498853, var69);
                        }
                        break label77;
                    }

                    var17 ^= -103408803;
                    var17 *= 1313159401;
                    var17 |= 1067538014;
                    var17 &= 760875718;
                    var17 ^= -702547568;
                }
            }

            var6 = var17 + 1;
            var6 = var17 * var6;
            var17 = var6 & 1;
            if (var17 == 0) {
                AssertionError var61 = new AssertionError();
                throw var61;
            }
        }

        AssertionError var62 = new AssertionError();
        throw var62;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -78884699;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        m = var4;
    }
}
