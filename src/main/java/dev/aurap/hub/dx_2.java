package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class dx_2 {
    private float[] bx;
    private e_2[] b;
    private int a;
    public static final int jX;

    public dx_2() {
        float[] var1 = new float[8192];
        this.bx = var1;
        e_2[] var2 = new e_2[256];
        this.b = var2;
    }

    public void Y(float[] var1, float[] var2, float[] var3, float[] var4, e_2 var5) {
        label48: {
            int var35;
            var35 = jX;
            var35 ^= -1767562783;
            int var7 = System.identityHashCode(this);
            int var8 = this.a;
            e_2[] var9 = this.b;
            int var66 = var9.length;
            int var10 = var7 + 1;
            var10 = var7 * var10;
            int var11 = var7 + 2;
            var10 *= var11;
            var11 = var7 + 3;
            var10 *= var11;
            var10 &= 7;
            label47:
            if (var10 == 0) {
                var35 -= 1130421767;
                var35 |= 746979525;
                var35 += 810279619;
                var35 ^= 738493163;
                long var81 = var35;
                long var12 = var81 + 1L;
                var12 = var81 * var12;
                long var14 = var81 + 2L;
                var12 *= var14;
                long var82 = var81 + 3L;
                var12 *= var82;
                long var83 = var12 & 7L;
                long var92;
                var10 = (var92 = var83 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                if (var10 != 0) {
                    break label48;
                }

                if (var8 == var66) {
                    var35 ^= -1466245067;
                    var35 ^= 901139178;
                    var35 ^= 1283854369;
                    float[] var56 = this.bx;
                    float[] var67 = this.bx;
                    Integer var85 = var7;
                    if (var85 == null) {
                        var35 |= -569825367;
                        var35 *= -1805176391;
                        var35 |= 1372643114;
                        var35 ^= 2014285464;
                        break label47;
                    }

                    var35 |= 335817065;
                    var35 |= 1125346825;
                    var35 &= 1648376260;
                    var35 ^= -90579739;
                    int var68 = var67.length;
                    int var69 = var68 * 2;
                    float[] var57 = Arrays.copyOf(var56, var69);
                    this.bx = var57;
                    e_2[] var58 = this.b;
                    var9 = this.b;
                    int var71 = var9.length;
                    int var72 = var71 * 2;
                    Object[] var59 = Arrays.copyOf(var58, var72);
                    e_2[] var60 = (e_2[])var59;
                    this.b = var60;
                    var35 <<= 31;
                    var35 += 943343262;
                    var35 ^= 1268583021;
                    var35 ^= -1677129003;
                } else {
                    var35 &= 1899660592;
                    var35 ^= 224456450;
                    var35 <<= 9;
                    var35 ^= -1971822042;
                }

                Integer var61 = var35;
                if (var61 == null) {
                    break label48;
                }

                int var62 = this.a;
                var62 *= 32;
                float[] var73 = this.bx;
                System.arraycopy(var1, 0, var73, var62, 8);
                float[] var74 = this.bx;
                var10 = var62 + 8;
                System.arraycopy(var2, 0, var74, var10, 8);
                float[] var75 = this.bx;
                var10 = var62 + 16;
                System.arraycopy(var3, 0, var75, var10, 8);
                Integer var53 = var7;
                if (var53 != null) {
                    switch (var35) {
                        case -1725117697:
                            var35 ^= 84370389;
                            break;
                        case 1873692198:
                            var35 >>>= 28;
                            var35 |= 2006944746;
                            var35 ^= 993839176;
                            break;
                        case 1930852316:
                        default:
                            var35 ^= -2043746233;
                    }

                    float[] var54 = this.bx;
                    var62 += 24;
                    System.arraycopy(var4, 0, var54, var62, 8);
                    e_2[] var55 = this.b;
                    var62 = this.a;
                    int var76 = var62 + 1;
                    this.a = var76;
                    var55[var62] = var5;
                    return;
                }

                var35 >>>= 31;
                var35 *= 1438337163;
                var35 ^= 1491988566;
                var35 -= 1805779588;
                var35 ^= 1687919669;
            } else {
                var35 *= -680243553;
                var35 += -338338239;
                var35 ^= -588686360;
            }

            Integer var50 = var35;
            if (var50 != null) {
                RuntimeException var52 = new RuntimeException();
                throw var52;
            }
        }

        IllegalArgumentException var51 = new IllegalArgumentException();
        throw var51;
    }

    public void tD(float[][][] var1, float[][][] var2, boolean var3, boolean var4, e_2 var5) {
        label328: {
            int var6 = jX;
            var6 ^= 2002518391;
            int var7 = System.identityHashCode(this);
            int var8 = var1.length;
            long var9 = var7;
            long var11 = var9 + 1L;
            var11 = var9 * var11;
            var9 = var11 & 1L;
            long var474;
            int var232 = (var474 = var9 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
            if (var232 != 0) {
                var6 ^= 2034082358;
                var6 &= -180398419;
                var6 >>= 16;
                var6 &= -641523421;
                var6 ^= 833258497;
            } else {
                label330: {
                    var6 *= 2139520417;
                    var6 &= 488571711;
                    var6 ^= 524625539;
                    int var233 = var6 + 1;
                    int var234 = var6 * var233;
                    int var235 = var234 & 1;
                    if (var235 != 0) {
                        break label328;
                    }

                    var8 = var8;
                    float[][] var236 = var1[0];
                    int var237 = var236.length;
                    int var238 = var237;
                    int var243;
                    if (var3) {
                        var6 >>= 20;
                        var6 ^= -1152113439;
                        var243 = var6 + 1;
                        var243 = var6 * var243;
                        int var246 = var6 + 2;
                        var243 *= var246;
                        int var247 = var6 + 3;
                        var243 *= var247;
                        var243 &= 7;
                        if (var243 != 0) {
                            break label328;
                        }

                        var243 = var237;
                        var6 ^= 508038504;
                        var6 ^= -1017403162;
                    } else {
                        var6 += 1540424005;
                        var6 += 1715152457;
                        var6 += 1665780046;
                        var6 ^= 1945766657;
                        int var248 = var237 - 1;
                        long var12 = var7;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var475;
                        int var253 = (var475 = var12 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                        if (var253 != 0) {
                            var6 -= -478174030;
                            var6 += -1938458458;
                            var6 += 112180555;
                            var6 |= -1968694721;
                            var6 ^= 328342237;
                            break label330;
                        }

                        var6 |= -181733700;
                        var6 -= 87751730;
                        var6 -= 1441173235;
                        var6 |= -352500388;
                        var6 ^= -457279902;
                        int var254 = var6 + 1;
                        int var255 = var6 * var254;
                        int var13 = var6 + 2;
                        int var256 = var255 * var13;
                        var13 = var6 + 3;
                        int var257 = var256 * var13;
                        int var258 = var257 & 7;
                        if (var258 != 0) {
                            break label328;
                        }

                        var243 = var248;
                        var6 ^= 1669086481;
                        var6 >>>= 18;
                        var6 ^= 1715968901;
                    }

                    var243 = var243;
                    int var249 = var8 - 1;
                    long var259 = var7;
                    long var289 = var259 + 1L;
                    var289 = var259 * var289;
                    long var16 = var259 + 2L;
                    var289 *= var16;
                    var259 += 3L;
                    var289 *= var259;
                    var259 = var289 & 7L;
                    long var476;
                    int var262 = (var476 = var259 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                    if (var262 == 0) {
                        var6 &= 513199840;
                        var6 += 1884202622;
                        var6 *= -1399450781;
                        var6 ^= 555552295;
                        var259 = var6;
                        var289 = var259 + 1L;
                        var289 = var259 * var289;
                        var259 = var289 & 1L;
                        long var477;
                        int var265 = (var477 = var259 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                        if (var265 != 0) {
                            break label328;
                        }

                        float[][][] var250 = new float[var249][var243][];
                        float[][][] var251 = var250;
                        byte var266 = 0;
                        int var267 = var266;
                        var6 ^= 662531642;
                        var6 >>= 9;
                        var6 += 93396327;
                        var6 ^= -1648732787;

                        label318:
                        while (true) {
                            long var271 = var6;
                            long var15 = var271 + 1L;
                            var15 = var271 * var15;
                            long var17 = var271 + 2L;
                            var15 *= var17;
                            var271 += 3L;
                            var15 *= var271;
                            var271 = var15 & 7L;
                            long var478;
                            int var274 = (var478 = var271 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                            if (var274 != 0) {
                                break label328;
                            }

                            int var275 = var8 - 1;
                            Integer var295 = var7;
                            if (var295 == null) {
                                var6 -= -1353428665;
                                var6 += 195038325;
                                var6 ^= 491320519;
                                break;
                            }

                            var6 *= -721136261;
                            var6 ^= -109992057;
                            if (var267 >= var275) {
                                var6 = switch (var6) {
                                    default -> var6 ^ -12033446;
                                    case -1274307867 -> var6 ^ -2029135473;
                                    case 251104106 -> {
                                        var6 -= -1762842434;
                                        var6 ^= 1240664873;
                                        var6 += -1869372718;
                                        yield var6 ^ 1914125929;
                                    }
                                };
                                byte var268 = 0;
                                Integer var281 = var7;
                                if (var281 == null) {
                                    var6 >>= 18;
                                    var6 ^= 395725060;
                                    break;
                                } else {
                                    var6 &= 1525312725;
                                    var6 ^= -1300916073;
                                    Integer var282 = var6;
                                    if (var282 == null) {
                                        break label328;
                                    }

                                    int var269 = var268;
                                    var6 &= -1602126682;
                                    var6 ^= 1468022073;

                                    while (true) {
                                        Integer var283 = var6;
                                        if (var283 == null) {
                                            break label328;
                                        }

                                        int var284 = var8 - 1;
                                        long var386 = var7;
                                        long var445 = var386 + 1L;
                                        var445 = var386 * var445;
                                        long var466 = var386 + 2L;
                                        var445 *= var466;
                                        var386 += 3L;
                                        var445 *= var386;
                                        var386 = var445 & 7L;
                                        long var479;
                                        int var303 = (var479 = var386 - 0L) == 0L ? 0 : (var479 < 0L ? -1 : 1);
                                        if (var303 != 0) {
                                            var6 >>>= 16;
                                            var6 *= 1207209749;
                                            var6 ^= -38853007;
                                            var6 ^= 734482758;
                                            break label318;
                                        }

                                        var6 += -2026698638;
                                        var6 &= -1571327271;
                                        var6 <<= 1;
                                        var6 ^= 433822410;
                                        var386 = var6;
                                        var445 = var386 + 1L;
                                        var445 = var386 * var445;
                                        var466 = var386 + 2L;
                                        var445 *= var466;
                                        var386 += 3L;
                                        var445 *= var386;
                                        var386 = var445 & 7L;
                                        long var480;
                                        int var304 = (var480 = var386 - 0L) == 0L ? 0 : (var480 < 0L ? -1 : 1);
                                        if (var304 != 0) {
                                            break label328;
                                        }

                                        if (var269 >= var284) {
                                            Integer var229 = switch (var6) {
                                                case -2072830314 -> var6 ^ 1250265724;
                                                default -> var6 ^ -726625318;
                                                case 1576247000 -> {
                                                    var6 |= -779209938;
                                                    var6 += -210809418;
                                                    yield var6 ^ -96873919;
                                                }
                                            };
                                            if (var229 != null) {
                                                return;
                                            }
                                            break label328;
                                        }
                                        var6 = switch (var6) {
                                            case 351501470 -> var6 ^ 639399043;
                                            case 1576247000 -> {
                                                var6 -= -1384362160;
                                                var6 += -1563703441;
                                                yield var6 ^ -1349811580;
                                            }
                                            default -> var6 ^ 900248304;
                                        };
                                        byte var285 = 0;
                                        int var305 = var7 + 1;
                                        int var306 = var7 * var305;
                                        int var307 = var306 & 1;
                                        if (var307 != 0) {
                                            var6 *= -1254859775;
                                            var6 |= -581868725;
                                            var6 ^= 890523225;
                                            break label318;
                                        }

                                        var6 |= 1116147839;
                                        var6 += -1649666469;
                                        var6 ^= 1408926371;
                                        var386 = var6;
                                        var445 = var386 + 1L;
                                        var445 = var386 * var445;
                                        var466 = var386 + 2L;
                                        var445 *= var466;
                                        var386 += 3L;
                                        var445 *= var386;
                                        var386 = var445 & 7L;
                                        long var481;
                                        int var308 = (var481 = var386 - 0L) == 0L ? 0 : (var481 < 0L ? -1 : 1);
                                        if (var308 != 0) {
                                            break label328;
                                        }

                                        int var286 = var285;
                                        var6 *= -362657233;
                                        var6 += -484524970;
                                        var6 ^= 684963023;

                                        while (true) {
                                            int var309 = var6 + 1;
                                            int var310 = var6 * var309;
                                            int var395 = var6 + 2;
                                            int var311 = var310 * var395;
                                            int var396 = var6 + 3;
                                            int var312 = var311 * var396;
                                            int var313 = var312 & 7;
                                            if (var313 != 0) {
                                                break label328;
                                            }

                                            if (var286 >= var243) {
                                                var6 ^= 1126437344;
                                                var6 -= -1043979599;
                                                var6 ^= -2067063270;
                                                int var287 = var269 + 1;
                                                Integer var322 = var7;
                                                if (var322 == null) {
                                                    var6 ^= -1117577794;
                                                    var6 *= -631942219;
                                                    var6 ^= 1383147835;
                                                    break label318;
                                                }
                                                var6 = switch (var6) {
                                                    case -995344149 -> {
                                                        var6 |= 437196385;
                                                        var6 += -2110171848;
                                                        var6 *= 955893057;
                                                        yield var6 ^ 711721061;
                                                    }
                                                    default -> var6 ^ -2114941641;
                                                    case 914049801 -> var6 ^ 898957981;
                                                };
                                                var269 = var287;
                                                var6 *= 1363278297;
                                                var6 |= -349137209;
                                                var6 ^= 415232876;
                                                break;
                                            }
                                            var6 = switch (var6) {
                                                default -> var6 ^ 392022764;
                                                case -1553531055 -> var6 ^ 1250937534;
                                                case 1091145794 -> {
                                                    var6 |= 1833236;
                                                    var6 |= -2048543003;
                                                    var6 *= -618657703;
                                                    yield var6 ^ 1853018648;
                                                }
                                            };
                                            int var314 = var286 + 1;
                                            Integer var397 = var7;
                                            if (var397 == null) {
                                                switch (var6) {
                                                    case -32293639:
                                                    default:
                                                        var6 ^= -855982540;
                                                        break label318;
                                                    case 830604022:
                                                        var6 ^= 1135298494;
                                                        break label318;
                                                    case 1336764103:
                                                        var6 -= 529610369;
                                                        var6 &= 1930507118;
                                                        var6 ^= -663120540;
                                                        break label318;
                                                }
                                            }
                                            var6 = switch (var6) {
                                                case -408889369 -> var6 ^ -1286946311;
                                                case 1336764103 -> {
                                                    var6 |= -1101875562;
                                                    yield var6 ^ 1008313893;
                                                }
                                                default -> var6 ^ -938258394;
                                            };
                                            int var315 = var314 % var238;
                                            float[][] var398 = var2[var269];
                                            int var399 = var398.length;
                                            int var402;
                                            if (var399 > var238) {
                                                var6 ^= -489327388;
                                                var6 |= -182198896;
                                                var6 ^= 699765893;
                                                Integer var400 = var6;
                                                if (var400 == null) {
                                                    break label328;
                                                }

                                                int var401 = var286 + 1;
                                                int var418 = var7 + 1;
                                                var418 = var7 * var418;
                                                var418 &= 1;
                                                if (var418 != 0) {
                                                    var6 &= -93769584;
                                                    var6 ^= 459524528;
                                                    var6 ^= 722095234;
                                                    break label318;
                                                }

                                                var6 |= -2023322865;
                                                var6 >>>= 29;
                                                var6 >>= 14;
                                                var6 ^= -1140534758;
                                                Integer var421 = var6;
                                                if (var421 == null) {
                                                    break label328;
                                                }

                                                var402 = var401;
                                                var6 ^= -355299450;
                                                var6 >>>= 1;
                                                var6 *= 1419498279;
                                                var6 ^= -1098345176;
                                            } else {
                                                var6 <<= 20;
                                                var6 -= -1428951783;
                                                var6 ^= -1280410290;
                                                var402 = var315;
                                                var6 *= 1774270731;
                                                var6 += 1744085712;
                                                var6 ^= 395464963;
                                                var6 ^= -766623910;
                                            }

                                            int var422 = var6 + 1;
                                            var422 = var6 * var422;
                                            int var457 = var6 + 2;
                                            var422 *= var457;
                                            int var458 = var6 + 3;
                                            var422 *= var458;
                                            var422 &= 7;
                                            if (var422 != 0) {
                                                break label328;
                                            }

                                            int var403 = var6 & 231515618;
                                            int var404 = var403 ^ 16772788;
                                            float[] var405 = rR(var1, var2, var251, var269, var286, var269, var286, var286, var4, var3, var404);
                                            int var406 = var269 + 1;
                                            var422 = var6 + -512081474;
                                            var422 += -1627903300;
                                            var422 |= 1089458745;
                                            var422 >>>= 17;
                                            var422 ^= 234333193;
                                            float[] var407 = rR(var1, var2, var251, var269, var286, var406, var286, var286, var4, var3, var422);
                                            int var408 = var269 + 1;
                                            var422 = var6 << 1;
                                            var422 ^= -1213909406;
                                            float[] var409 = rR(var1, var2, var251, var269, var286, var408, var315, var402, var4, var3, var422);
                                            var422 = var6 & 65010575;
                                            var422 -= 1761345739;
                                            var422 *= 775700359;
                                            var422 ^= 826457039;
                                            float[] var341 = rR(var1, var2, var251, var269, var286, var269, var315, var402, var4, var3, var422);
                                            float[][] var438 = var1[var269];
                                            float[] var439 = var438[var286];
                                            int var459 = var269 + 1;
                                            float[][] var460 = var1[var459];
                                            float[] var461 = var460[var286];
                                            int var463 = var269 + 1;
                                            float[][] var464 = var1[var463];
                                            float[] var465 = var464[var315];
                                            int var469 = var7 + 1;
                                            int var470 = var7 * var469;
                                            int var471 = var470 & 1;
                                            if (var471 != 0) {
                                                var6 += -1977988705;
                                                var6 |= 213842284;
                                                var6 ^= 127294159;
                                                break label318;
                                            }

                                            var6 *= 1865441227;
                                            var6 *= 2138183487;
                                            var6 >>>= 18;
                                            var6 ^= -1242067610;
                                            Integer var472 = var6;
                                            if (var472 == null) {
                                                break label328;
                                            }

                                            float[][] var473 = var1[var269];
                                            float[] var316 = var473[var315];
                                            float[] var317 = KK.Mr(var439, var461, var465, var316);
                                            float[][] var440 = var251[var269];
                                            float[] var441 = var440[var286];
                                            float var318 = KK.ab(var317, var441);
                                            float var482;
                                            int var319 = (var482 = var318 - 0.0F) == 0.0F ? 0 : (var482 < 0.0F ? -1 : 1);
                                            if (var319 >= 0) {
                                                var6 -= 737681489;
                                                var6 &= 80723446;
                                                var6 -= 1167874602;
                                                var6 <<= 27;
                                                var6 ^= 189278987;
                                                Integer var320 = var6;
                                                if (var320 == null) {
                                                    break label328;
                                                }

                                                this.Y(var405, var407, var409, var341, var5);
                                                var6 &= -807423502;
                                                var6 += -2100487854;
                                                var6 += -2072911250;
                                                var6 ^= -92651082;
                                            } else {
                                                var6 ^= -1544542015;
                                                var6 &= 1340717378;
                                                var6 *= 471306807;
                                                var6 ^= -1074527086;
                                                this.Y(var341, var409, var407, var405, var5);
                                                var6 += 444265071;
                                                var6 &= 314763763;
                                                var6 ^= 947895319;
                                            }

                                            int var321 = var286 + 1;
                                            Integer var342 = var7;
                                            if (var342 == null) {
                                                var6 &= -528777660;
                                                var6 ^= -938411674;
                                                break label318;
                                            }

                                            var6 *= 956800633;
                                            var6 ^= 564239131;
                                            var286 = var321;
                                            switch (var6) {
                                                case 3889359:
                                                    var6 -= -1938329626;
                                                    var6 ^= 852129963;
                                                    break;
                                                case 25037532:
                                                    var6 ^= 765190436;
                                                    break;
                                                case 888032915:
                                                default:
                                                    var6 ^= -1021130128;
                                            }
                                        }
                                    }
                                }
                            }

                            var6 ^= 1889803207;
                            var6 ^= -402326168;
                            float[][] var276 = var1[var267];
                            float[] var277 = KK.ev(var276);
                            int var296 = var267 + 1;
                            float[][] var297 = var1[var296];
                            int var326 = var7 + 1;
                            int var327 = var7 * var326;
                            int var343 = var7 + 2;
                            int var328 = var327 * var343;
                            int var344 = var7 + 3;
                            int var329 = var328 * var344;
                            int var330 = var329 & 7;
                            if (var330 != 0) {
                                var6 &= 650814372;
                                var6 += -103923085;
                                var6 -= -401515251;
                                var6 ^= -6904888;
                                break;
                            }

                            var6 *= -1371714811;
                            var6 |= -1790634316;
                            var6 ^= -1803842078;
                            var15 = var6;
                            var17 = var15 + 1L;
                            var17 = var15 * var17;
                            long var19 = var15 + 2L;
                            var17 *= var19;
                            var15 += 3L;
                            var17 *= var15;
                            var15 = var17 & 7L;
                            long var483;
                            int var334 = (var483 = var15 - 0L) == 0L ? 0 : (var483 < 0L ? -1 : 1);
                            if (var334 != 0) {
                                break label328;
                            }

                            float[] var298 = KK.ev(var297);
                            float[] var278 = KK.UZ(var277, var298);
                            float[] var279 = var278;
                            byte var299 = 0;
                            int var300 = var299;

                            var6 = switch (var6) {
                                case 196366879 -> {
                                    var6 <<= 4;
                                    var6 += 1363613369;
                                    var6 |= -673194232;
                                    var6 &= 384223168;
                                    yield var6 ^ 474839489;
                                }
                                default -> var6 ^ 1471981358;
                                case 1486138710 -> var6 ^ -2146735333;
                            };

                            while (true) {
                                var15 = var6;
                                var17 = var15 + 1L;
                                var17 = var15 * var17;
                                var15 = var17 & 1L;
                                long var484;
                                int var337 = (var484 = var15 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                                if (var337 != 0) {
                                    break label328;
                                }

                                if (var300 >= var243) {
                                    var6 *= -1213695919;
                                    var6 ^= 881549823;
                                    int var280 = var267 + 1;
                                    Integer var301 = var7;
                                    if (var301 == null) {
                                        switch (var6) {
                                            case -2000022693:
                                            default:
                                                var6 ^= -274103594;
                                                break label318;
                                            case 53058064:
                                                var6 ^= 1419636179;
                                                break label318;
                                            case 495373166:
                                                var6 += 160010715;
                                                var6 ^= -814090133;
                                                break label318;
                                        }
                                    }

                                    var6 &= 486017756;
                                    var6 ^= -1125009060;
                                    Integer var302 = var6;
                                    if (var302 == null) {
                                        break label328;
                                    }

                                    var267 = var280;
                                    switch (var6) {
                                        case -1603161328:
                                            var6 -= 807388863;
                                            var6 ^= -393970970;
                                            continue label318;
                                        case 1701409292:
                                        default:
                                            var6 ^= 126770144;
                                            continue label318;
                                        case 1870584834:
                                            var6 ^= 506090888;
                                            continue label318;
                                    }
                                }

                                var6 >>>= 21;
                                var6 ^= 1175761838;
                                var6 ^= 785783284;
                                int var338 = var300 + 1;
                                int var339 = var338 % var238;
                                float[][] var345 = var1[var267];
                                float[] var346 = var345[var300];
                                int var355 = var267 + 1;
                                float[][] var356 = var1[var355];
                                float[] var357 = var356[var300];
                                int var18 = var267 + 1;
                                float[][] var363 = var1[var18];
                                float[] var364 = var363[var339];
                                float[][] var410 = var1[var267];
                                float[] var411 = var410[var339];
                                float[] var347 = KK.Mr(var346, var357, var364, var411);
                                float[][] var358 = var1[var267];
                                float[] var359 = var358[var300];
                                var18 = var267 + 1;
                                float[][] var366 = var1[var18];
                                float[] var367 = var366[var339];
                                float[] var360 = KK.UZ(var359, var367);
                                var18 = var267 + 1;
                                float[][] var369 = var1[var18];
                                Integer var412 = var7;
                                if (var412 == null) {
                                    var6 |= -1169595654;
                                    var6 >>= 13;
                                    var6 >>= 8;
                                    var6 >>>= 16;
                                    var6 ^= -395748643;
                                    break label318;
                                }
                                var6 = switch (var6) {
                                    case -614415544 -> var6 ^ -1046282326;
                                    default -> var6 ^ 367468593;
                                    case 1757587982 -> {
                                        var6 |= 1061188941;
                                        var6 ^= -229406769;
                                        var6 &= 1199661693;
                                        yield var6 ^ 1568026831;
                                    }
                                };
                                var19 = var6;
                                long var21 = var19 + 1L;
                                var21 = var19 * var21;
                                var19 = var21 & 1L;
                                long var485;
                                int var415 = (var485 = var19 - 0L) == 0L ? 0 : (var485 < 0L ? -1 : 1);
                                if (var415 != 0) {
                                    break label328;
                                }

                                float[] var370 = var369[var300];
                                float[][] var416 = var1[var267];
                                float[] var417 = var416[var339];
                                float[] var371 = KK.UZ(var370, var417);
                                float[] var361 = KK.UZ(var360, var371);
                                float[] var372 = KK.w(var361, var279);
                                float var373 = KK.ab(var347, var372);
                                float var486;
                                var18 = (var486 = var373 - 0.0F) == 0.0F ? 0 : (var486 < 0.0F ? -1 : 1);
                                if (var18 < 0) {
                                    var6 *= 345334109;
                                    var6 ^= 489769795;
                                    long var375 = var6;
                                    long var20 = var375 + 1L;
                                    var20 = var375 * var20;
                                    long var22 = var375 + 2L;
                                    var20 *= var22;
                                    long var376 = var375 + 3L;
                                    var20 *= var376;
                                    long var377 = var20 & 7L;
                                    long var487;
                                    var18 = (var487 = var377 - 0L) == 0L ? 0 : (var487 < 0L ? -1 : 1);
                                    if (var18 != 0) {
                                        break label328;
                                    }

                                    KK.u(var347, -1.0F);
                                    var6 -= 494896584;
                                    var6 |= -1236247856;
                                    var6 += -371845976;
                                    var6 ^= -358874290;
                                    var6 ^= 202608212;
                                } else {
                                    var6 &= -1178292119;
                                    var6 *= -374340407;
                                    var6 ^= -506080393;
                                    var6 += -1329303603;
                                    var6 ^= 986722377;
                                }

                                Integer var379 = var6;
                                if (var379 == null) {
                                    break label328;
                                }

                                float[][] var380 = var251[var267];
                                var380[var300] = var347;
                                var379 = var7;
                                if (var379 == null) {
                                    var6 ^= -856666939;
                                    var6 *= -1733247957;
                                    var6 |= 30995417;
                                    var6 -= 1532400726;
                                    var6 ^= -1225800027;
                                    break label318;
                                }

                                var6 ^= -1273083597;
                                var6 ^= -59599840;
                                int var382 = var6 + 1;
                                var382 = var6 * var382;
                                var382 &= 1;
                                if (var382 != 0) {
                                    break label328;
                                }

                                var382 = var300 + 1;
                                var300 = var382;
                                var6 |= -2038820164;
                                var6 *= 138417831;
                                var6 ^= 600803594;
                            }
                        }
                    } else {
                        var6 &= -1534496042;
                        var6 *= -355443605;
                        var6 ^= -1304908748;
                    }
                }
            }

            RuntimeException var227 = new RuntimeException();
            throw var227;
        }

        AssertionError var228 = new AssertionError();
        throw var228;
    }

    private static float[] rR(
        float[][][] var0, float[][][] var1, float[][][] var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10
    ) {
        label326: {
            int var12 = var3;
            int var13 = System.identityHashCode(var0);
            int var14 = var2.length;
            var14 = var14;
            Integer var15 = var13;
            if (var15 == null) {
                switch (var10) {
                    case -1974205286:
                    default:
                        int var29 = var10 ^ 1338176364;
                        break;
                    case 234343158:
                        int var27 = var10 * 838193145;
                        var27 ^= -973394545;
                        break;
                    case 1566527760:
                        int var11 = var10 ^ -1213340302;
                }
            } else {
                int var30 = var10 >>> 3;
                var30 &= -1744732313;
                var30 ^= 887471363;
                int var223 = var3 + 1;
                var223 = var3 * var223;
                var223 &= 1;
                if (var223 != 0) {
                    break label326;
                }

                float[][] var226 = var2[0];
                var223 = var226.length;
                var223 = var223;
                float[] var16 = new float[3];
                var16 = var16;
                int var17 = -1;
                var17 = var17;
                var30 ^= 1113916745;
                var30 ^= -479469601;

                label323:
                while (true) {
                    if (var17 > 0) {
                        var30 &= -774278621;
                        var30 += -1443017182;
                        var30 ^= -663659319;
                        Object var216 = var12;
                        if (var216 == null) {
                            break label326;
                        }

                        boolean var217 = KK.UB(var16);
                        var223 = var13 + 1;
                        var223 = var13 * var223;
                        var223 &= 1;
                        if (var223 != 0) {
                            var30 ^= -7602047;
                            var30 += -970841652;
                            var30 ^= 1630085360;
                        } else {
                            var30 -= 1182425722;
                            var30 ^= 1346876410;
                            float[] var222;
                            if (!var217) {
                                var30 |= -1795542356;
                                var30 &= -1524185463;
                                var30 *= 1337949523;
                                var30 *= -1021790055;
                                var30 ^= 750156336;
                                float[][] var218 = var2[var3];
                                float[] var219 = var218[var4];
                                var216 = var219.clone();
                                float[] var221 = (float[])var216;
                                long var240 = var13;
                                long var283 = var240 + 1L;
                                var283 = var240 * var283;
                                long var241 = var283 & 1L;
                                long var380;
                                var223 = (var380 = var241 - 0L) == 0L ? 0 : (var380 < 0L ? -1 : 1);
                                if (var223 != 0) {
                                    switch (var30) {
                                        case -1824800152:
                                            var30 += -315703646;
                                            var30 ^= 52363203;
                                            break label323;
                                        case 1008792453:
                                        default:
                                            var30 ^= -1514569809;
                                            break label323;
                                        case 1169330031:
                                            var30 ^= -993100024;
                                            break label323;
                                    }
                                }

                                var30 &= 1925636000;
                                var30 &= -262494886;
                                var30 &= -927170060;
                                var30 ^= -1153832446;
                                var222 = var221;
                                var30 &= -949640241;
                                var30 >>= 28;
                                var30 += 36607570;
                                var30 ^= 412211940;
                            } else {
                                var30 = switch (var30) {
                                    case -1496922718 -> var30 ^ -1090359792;
                                    case -847550072 -> {
                                        var30 ^= -1195732841;
                                        var30 &= 1921064848;
                                        yield var30 ^ -394064192;
                                    }
                                    default -> var30 ^ -1745617453;
                                };
                                long var242 = var12;
                                long var285 = var242 + 1L;
                                var285 = var242 * var285;
                                long var243 = var285 & 1L;
                                long var381;
                                var223 = (var381 = var243 - 0L) == 0L ? 0 : (var381 < 0L ? -1 : 1);
                                if (var223 != 0) {
                                    break label326;
                                }

                                var222 = var16;
                                var30 &= -1623253186;
                                var30 &= -732573484;
                                var30 ^= -1967170370;
                            }

                            float[][] var234 = var0[var5];
                            float[] var235 = var234[var6];
                            float[][] var237 = var1[var5];
                            var16 = var237[var7];
                            long var244 = var13;
                            long var287 = var244 + 1L;
                            var287 = var244 * var287;
                            long var245 = var287 & 1L;
                            long var382;
                            var13 = (var382 = var245 - 0L) == 0L ? 0 : (var382 < 0L ? -1 : 1);
                            if (var13 == 0) {
                                switch (var30) {
                                    case -1117608226:
                                        var30 ^= -1907442646;
                                        break;
                                    case 448744622:
                                        var30 -= 1142288693;
                                        var30 *= -1874306107;
                                        var30 += 1531283305;
                                        var30 |= -804795762;
                                        var30 ^= -1139939272;
                                        break;
                                    case 1516030201:
                                    default:
                                        var30 ^= -912721887;
                                }

                                float[] var202 = new float[8];
                                float var206 = var235[0];
                                var202[0] = var206;
                                float var207 = var235[1];
                                var202[1] = var207;
                                float var208 = var235[2];
                                var202[2] = var208;
                                float var209 = var222[0];
                                var202[3] = var209;
                                float var210 = var222[1];
                                var202[4] = var210;
                                float var211 = var222[2];
                                var202[5] = var211;
                                float var212 = var16[0];
                                var202[6] = var212;
                                float var213 = var16[1];
                                var202[7] = var213;
                                return var202;
                            }

                            switch (var30) {
                                case 448744622:
                                    var30 >>= 7;
                                    var30 *= 721266783;
                                    var30 ^= -697596424;
                                    var30 ^= 859609590;
                                    break label323;
                                case 1254230449:
                                    var30 ^= -1221783409;
                                    break label323;
                                case 2079763081:
                                default:
                                    var30 ^= 229523287;
                            }
                        }
                        break;
                    }
                    var30 = switch (var30) {
                        case -1779753261 -> {
                            var30 &= 191685674;
                            yield var30 ^ 1372776400;
                        }
                        case -655131087 -> var30 ^ -1504633298;
                        default -> var30 ^ 261889402;
                    };
                    int var18 = var12 + 1;
                    var18 = var12 * var18;
                    var18 &= 1;
                    if (var18 != 0) {
                        break label326;
                    }

                    var18 = var5 + var17;
                    var18 = var18;
                    Integer var19 = var13;
                    if (var19 == null) {
                        var30 |= -823336460;
                        var30 *= 1810404495;
                        var30 ^= -697306973;
                        break;
                    }

                    var30 |= 334121762;
                    var30 <<= 1;
                    var30 += 993079069;
                    var30 ^= -1735478173;
                    var19 = var12;
                    if (var19 == null) {
                        break label326;
                    }

                    if (var18 >= 0) {
                        var30 = switch (var30) {
                            default -> var30 ^ 1912537436;
                            case 2074719074 -> {
                                var30 -= -1102457659;
                                yield var30 ^ -231215117;
                            }
                            case 2095400536 -> var30 ^ -1292147260;
                        };
                        int var259 = var12 + 1;
                        var259 = var12 * var259;
                        var259 &= 1;
                        if (var259 != 0) {
                            break label326;
                        }

                        if (var18 >= var14) {
                            var30 *= -1656972913;
                            var30 -= 1501549117;
                            var30 -= -920231046;
                            var30 ^= -67122335;
                            var30 *= -161867859;
                            var30 -= 241880634;
                            var30 *= 32239341;
                            var30 ^= -1566229426;
                        } else {
                            var30 *= 716708297;
                            var30 >>>= 17;
                            var30 ^= -1854481806;
                            Integer var262 = var12;
                            if (var262 == null) {
                                break label326;
                            }

                            if (var8) {
                                var30 <<= 26;
                                var30 *= -997607331;
                                var30 ^= 1762567432;
                                var262 = var12;
                                if (var262 == null) {
                                    break label326;
                                }

                                byte var264 = -1;
                                long var20 = var13;
                                long var22 = var20 + 1L;
                                var22 = var20 * var22;
                                var20 = var22 & 1L;
                                long var383;
                                int var290 = (var383 = var20 - 0L) == 0L ? 0 : (var383 < 0L ? -1 : 1);
                                if (var290 != 0) {
                                    var30 ^= 929418463;
                                    var30 |= 949112274;
                                    var30 -= 1630817479;
                                    var30 ^= 1521704921;
                                    break;
                                }
                                var30 = switch (var30) {
                                    case -2028640342 -> var30 ^ -759171706;
                                    case 353281288 -> {
                                        var30 -= -1687993559;
                                        var30 += 646930096;
                                        var30 -= -36417596;
                                        yield var30 ^ 1944794842;
                                    }
                                    default -> var30 ^ -2086513209;
                                };
                                var20 = var12;
                                var22 = var20 + 1L;
                                var22 = var20 * var22;
                                var20 = var22 & 1L;
                                long var384;
                                int var293 = (var384 = var20 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                                if (var293 != 0) {
                                    break label326;
                                }

                                int var265 = var264;
                                var30 |= -1881292127;
                                var30 ^= -86350729;

                                label308:
                                while (true) {
                                    Integer var294 = var12;
                                    if (var294 == null) {
                                        break label326;
                                    }

                                    if (var265 > 0) {
                                        var30 = switch (var30) {
                                            case 621257414 -> {
                                                var30 ^= 1195966689;
                                                yield var30 ^ 968170932;
                                            }
                                            case 767636627 -> var30 ^ 729778315;
                                            default -> var30 ^ 1493646045;
                                        };
                                        var265 = var12 + 1;
                                        var265 = var12 * var265;
                                        int var307 = var12 + 2;
                                        var265 *= var307;
                                        int var308 = var12 + 3;
                                        var265 *= var308;
                                        var265 &= 7;
                                        if (var265 != 0) {
                                            break label326;
                                        }

                                        switch (var30) {
                                            case 635383142:
                                                var30 ^= -1353235928;
                                                break label308;
                                            case 1543225235:
                                                var30 -= 1616608512;
                                                var30 <<= 22;
                                                var30 ^= -1429942154;
                                                break label308;
                                            case 1710480054:
                                            default:
                                                var30 ^= -478664522;
                                                break label308;
                                        }
                                    }

                                    var30 >>>= 12;
                                    var30 ^= -1367128203;
                                    int var295 = var12 + 1;
                                    int var296 = var12 * var295;
                                    int var21 = var12 + 2;
                                    int var297 = var296 * var21;
                                    var21 = var12 + 3;
                                    int var298 = var297 * var21;
                                    int var299 = var298 & 7;
                                    if (var299 != 0) {
                                        break label326;
                                    }

                                    int var300 = var6 + var265;
                                    long var312 = var13;
                                    long var23 = var312 + 1L;
                                    var23 = var312 * var23;
                                    long var25 = var312 + 2L;
                                    var23 *= var25;
                                    long var313 = var312 + 3L;
                                    var23 *= var313;
                                    long var314 = var23 & 7L;
                                    long var385;
                                    var21 = (var385 = var314 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                                    if (var21 != 0) {
                                        var30 &= -1804571991;
                                        var30 ^= 125074624;
                                        break label323;
                                    }

                                    var30 <<= 19;
                                    var30 *= 1117092285;
                                    var30 ^= 758877970;
                                    var21 = var12 + 1;
                                    var21 = var12 * var21;
                                    int var350 = var12 + 2;
                                    var21 *= var350;
                                    int var351 = var12 + 3;
                                    var21 *= var351;
                                    var21 &= 7;
                                    if (var21 != 0) {
                                        break label326;
                                    }

                                    label361: {
                                        if (var9) {
                                            var30 >>>= 2;
                                            var30 |= -1818203074;
                                            var30 -= 1426648968;
                                            var30 *= -603244903;
                                            var30 ^= -2078128888;
                                            long var321 = var12;
                                            var23 = var321 + 1L;
                                            var23 = var321 * var23;
                                            var25 = var321 + 2L;
                                            var23 *= var25;
                                            long var322 = var321 + 3L;
                                            var23 *= var322;
                                            long var323 = var23 & 7L;
                                            long var386;
                                            var21 = (var386 = var323 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                                            if (var21 != 0) {
                                                break label326;
                                            }

                                            var21 = var300 + var223;
                                            var21 %= var223;
                                            int var352 = var13 + 1;
                                            int var353 = var13 * var352;
                                            int var354 = var353 & 1;
                                            if (var354 != 0) {
                                                var30 <<= 27;
                                                var30 += 1333295461;
                                                var30 += 516202495;
                                                var30 ^= 1565091757;
                                                break label323;
                                            }
                                            var30 = switch (var30) {
                                                case -533908344 -> var30 ^ -1653715735;
                                                case -450269298 -> {
                                                    var30 &= -1158536555;
                                                    yield var30 ^ -1736862431;
                                                }
                                                default -> var30 ^ -2035787870;
                                            };
                                            var21 = var21;
                                            var30 *= 1886437231;
                                            var30 ^= -342085501;
                                            var30 >>= 9;
                                            var30 ^= -1833066565;
                                        } else {
                                            var30 *= 1014829135;
                                            var30 >>>= 4;
                                            var30 *= 1567163923;
                                            var30 ^= 1257498030;
                                            if (var300 < 0) {
                                                switch (var30) {
                                                    case -902303015:
                                                        var30 ^= 1112959000;
                                                        break label361;
                                                    case 1217619478:
                                                        var30 |= -1858566386;
                                                        var30 ^= 1951566501;
                                                        break label361;
                                                    case 1957363883:
                                                    default:
                                                        var30 ^= 1512035709;
                                                        break label361;
                                                }
                                            }

                                            var30 *= 1718453699;
                                            var30 |= -513607410;
                                            var30 ^= 1389381670;
                                            int var355 = var12 + 1;
                                            int var356 = var12 * var355;
                                            int var357 = var356 & 1;
                                            if (var357 != 0) {
                                                break label326;
                                            }

                                            if (var300 >= var223) {
                                                var30 += -1384605434;
                                                var30 >>= 28;
                                                var30 ^= -1584886805;
                                                var22 = var12;
                                                long var24 = var22 + 1L;
                                                var24 = var22 * var24;
                                                var22 = var24 & 1L;
                                                long var387;
                                                int var360 = (var387 = var22 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                                                if (var360 != 0) {
                                                    break label326;
                                                }

                                                var30 += -1543868848;
                                                var30 *= 1220783097;
                                                var30 ^= -1959805451;
                                                break label361;
                                            }

                                            var30 &= 1349654889;
                                            var30 *= -1627278137;
                                            var30 ^= -1416646228;
                                            var21 = var300;
                                            var30 >>= 24;
                                            var30 ^= 1833182033;
                                        }

                                        float[][] var301 = var2[var18];
                                        float[] var302 = var301[var21];
                                        long var328 = var13;
                                        var23 = var328 + 1L;
                                        var23 = var328 * var23;
                                        long var329 = var23 & 1L;
                                        long var388;
                                        var21 = (var388 = var329 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                                        if (var21 != 0) {
                                            var30 += 2116030649;
                                            var30 &= 1571983661;
                                            var30 -= -479185614;
                                            var30 |= -670895741;
                                            var30 ^= 2119599418;
                                            break label323;
                                        }
                                        var30 = switch (var30) {
                                            case -1833181954 -> {
                                                var30 ^= 327673979;
                                                yield var30 ^ -1273042848;
                                            }
                                            default -> var30 ^ 845464010;
                                            case 258139745 -> var30 ^ -822001055;
                                        };
                                        long var331 = var12;
                                        var23 = var331 + 1L;
                                        var23 = var331 * var23;
                                        var25 = var331 + 2L;
                                        var23 *= var25;
                                        long var332 = var331 + 3L;
                                        var23 *= var332;
                                        long var333 = var23 & 7L;
                                        long var389;
                                        var21 = (var389 = var333 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                                        if (var21 != 0) {
                                            break label326;
                                        }

                                        KK.xm(var16, var302);
                                        var30 &= -740262668;
                                        var30 *= 1999289917;
                                        var30 ^= -18466833;
                                    }

                                    int var303 = var12 + 1;
                                    int var304 = var12 * var303;
                                    int var305 = var304 & 1;
                                    if (var305 != 0) {
                                        break label326;
                                    }

                                    int var306 = var265 + 1;
                                    var21 = var13 + 1;
                                    var21 = var13 * var21;
                                    var21 &= 1;
                                    if (var21 != 0) {
                                        var30 ^= 234560987;
                                        var30 ^= -2059683326;
                                        var30 ^= -1503808341;
                                        break label323;
                                    }
                                    var30 = switch (var30) {
                                        case -1377210949 -> {
                                            var30 *= 367645493;
                                            yield var30 ^ 603694429;
                                        }
                                        default -> var30 ^ -1401790677;
                                        case -171885642 -> var30 ^ 652415075;
                                    };
                                    var21 = var12 + 1;
                                    var21 = var12 * var21;
                                    int var361 = var12 + 2;
                                    var21 *= var361;
                                    int var362 = var12 + 3;
                                    var21 *= var362;
                                    var21 &= 7;
                                    if (var21 != 0) {
                                        break label326;
                                    }

                                    var265 = var306;
                                    switch (var30) {
                                        case -1135767288:
                                        default:
                                            var30 ^= -787493366;
                                            break;
                                        case -1089700374:
                                            var30 += 163435076;
                                            var30 ^= -305270040;
                                            break;
                                        case -710190292:
                                            var30 ^= 2046769366;
                                    }
                                }
                            } else {
                                var30 |= -1006747320;
                                var30 += -75417189;
                                var30 ^= 2033304314;
                                var262 = var12;
                                if (var262 == null) {
                                    break label326;
                                }

                                float[][] var250 = var2[var18];
                                float[] var251 = var250[var4];
                                long var272 = var13;
                                long var343 = var272 + 1L;
                                var343 = var272 * var343;
                                long var376 = var272 + 2L;
                                var343 *= var376;
                                long var273 = var272 + 3L;
                                var343 *= var273;
                                long var274 = var343 & 7L;
                                long var390;
                                int var275 = (var390 = var274 - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                                if (var275 != 0) {
                                    switch (var30) {
                                        case -2043957074:
                                        default:
                                            var30 ^= -1059984840;
                                            break label323;
                                        case -1229859844:
                                            var30 |= 1337455165;
                                            var30 -= -329756503;
                                            var30 ^= -1880749365;
                                            var30 ^= 533583702;
                                            break label323;
                                        case 668229440:
                                            var30 ^= -668517821;
                                            break label323;
                                    }
                                }

                                var30 ^= -934569008;
                                var30 -= 112000120;
                                var30 ^= 418848080;
                                KK.xm(var16, var251);
                                switch (var30) {
                                    case -1760766040:
                                        var30 ^= -39467716;
                                        break;
                                    case 130448899:
                                    default:
                                        var30 ^= 1013293410;
                                        break;
                                    case 1622824676:
                                        var30 |= -1570852331;
                                        var30 ^= -550299930;
                                        var30 ^= 1833873424;
                                        var30 ^= 1585938549;
                                }
                            }
                        }
                    } else {
                        switch (var30) {
                            case 1897818517:
                            default:
                                var30 ^= -586857190;
                                break;
                            case 1961195569:
                                var30 ^= 1642139248;
                                break;
                            case 2074719074:
                                var30 *= -1428063261;
                                var30 &= -1890366971;
                                var30 |= -356622543;
                                var30 *= -790698403;
                                var30 ^= 1458365495;
                        }
                    }

                    var18 = var12 + 1;
                    var18 = var12 * var18;
                    int var276 = var12 + 2;
                    var18 *= var276;
                    var276 = var12 + 3;
                    var18 *= var276;
                    var18 &= 7;
                    if (var18 != 0) {
                        break label326;
                    }

                    var18 = var17 + 1;
                    var276 = var13 + 1;
                    var276 = var13 * var276;
                    int var309 = var13 + 2;
                    var276 *= var309;
                    var309 = var13 + 3;
                    var276 *= var309;
                    var276 &= 7;
                    if (var276 != 0) {
                        var30 >>>= 25;
                        var30 ^= -381824962;
                        var30 *= 2131257203;
                        var30 |= 1571927329;
                        var30 ^= -58227854;
                        break;
                    }

                    var30 &= 349946043;
                    var30 -= 914855950;
                    var30 >>>= 17;
                    var30 ^= -811511840;
                    var17 = var18;
                    var30 &= -199812331;
                    var30 += 1956860329;
                    var30 ^= -1387314066;
                }
            }

            Integer var204 = var12;
            if (var204 != null) {
                RuntimeException var205 = new RuntimeException();
                throw var205;
            }
        }

        UnsupportedOperationException var203 = new UnsupportedOperationException();
        throw var203;
    }

    public void M(float[][] var1, float[][] var2, float[] var3, float[] var4, e_2 var5) {
        int var6 = jX;
        var6 ^= -264449833;
        int var7 = System.identityHashCode(this);
        float[] var8 = KK.ev(var1);
        long var9 = var7;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        var9 = var11 & 1L;
        long var264;
        int var145 = (var264 = var9 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
        if (var145 != 0) {
            var6 *= 1181256021;
            var6 >>= 28;
            var6 ^= -726077672;
        } else {
            label184: {
                label181: {
                    var6 += 1285770267;
                    var6 += -568868757;
                    var6 >>= 28;
                    var6 += -1919848755;
                    var6 ^= 1719000273;
                    float[] var146 = KK.D(var1);
                    float[] var147 = var146;
                    float[] var10 = KK.w(var8, var4);
                    float var148 = KK.ab(var146, var10);
                    float var265;
                    int var149 = (var265 = var148 - 0.0F) == 0.0F ? 0 : (var265 < 0.0F ? -1 : 1);
                    if (var149 < 0) {
                        var6 = switch (var6) {
                            case -1484538832 -> var6 ^ 1263225338;
                            case -337333740 -> {
                                var6 &= -1754873482;
                                var6 *= 171433569;
                                var6 >>>= 31;
                                yield var6 ^ 759808200;
                            }
                            default -> var6 ^ -861366176;
                        };
                        Integer var150 = var6;
                        if (var150 == null) {
                            break label181;
                        }

                        KK.u(var146, -1.0F);
                        var6 += 960044097;
                        var6 += 1984045575;
                        var6 &= -2092314191;
                        var6 ^= -1485152447;
                    } else {
                        var6 &= 750363350;
                        var6 >>= 1;
                        var6 ^= 862642011;
                    }

                    Integer var151 = var6;
                    if (var151 != null) {
                        boolean var152 = KK.UB(var146);
                        var11 = var7;
                        long var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var266;
                        int var164 = (var266 = var11 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                        if (var164 != 0) {
                            switch (var6) {
                                case -1456972719:
                                default:
                                    var6 ^= -1088170914;
                                    break label184;
                                case 658148945:
                                    var6 >>>= 20;
                                    var6 += -2159448;
                                    var6 *= -172068125;
                                    var6 ^= -1875474962;
                                    break label184;
                                case 666219392:
                                    var6 ^= -283763382;
                                    break label184;
                            }
                        }

                        var6 *= 57334799;
                        var6 ^= 1116689770;
                        Integer var165 = var6;
                        if (var165 != null) {
                            if (!var152) {
                                Integer var159 = switch (var6) {
                                    case -1565759757 -> var6 ^ -1197343199;
                                    case 1036691413 -> {
                                        var6 >>>= 29;
                                        var6 -= 1985129077;
                                        var6 >>>= 28;
                                        yield var6 ^ -1262690240;
                                    }
                                    default -> var6 ^ -1301093492;
                                };
                                if (var159 != null) {
                                    return;
                                }
                            } else {
                                var6 -= 321056208;
                                var6 *= 1876938819;
                                var6 ^= 2052787602;
                                var10 = new float[8];
                                float var166 = var8[0];
                                var10[0] = var166;
                                float var167 = var8[1];
                                var10[1] = var167;
                                float var137 = var8[2];
                                int var168 = var7 + 1;
                                int var169 = var7 * var168;
                                int var170 = var169 & 1;
                                if (var170 != 0) {
                                    switch (var6) {
                                        case -2077302200:
                                        default:
                                            var6 ^= 1890149061;
                                            break label184;
                                        case -1196301735:
                                            var6 ^= 947146951;
                                            break label184;
                                        case -599805219:
                                            var6 >>>= 9;
                                            var6 ^= -724111162;
                                            break label184;
                                    }
                                }

                                var6 |= -1674044529;
                                var6 *= 1612629127;
                                var6 *= 2110910859;
                                var6 ^= 833054242;
                                int var171 = var6 + 1;
                                int var172 = var6 * var171;
                                int var12 = var6 + 2;
                                int var173 = var172 * var12;
                                var12 = var6 + 3;
                                int var174 = var173 * var12;
                                int var175 = var174 & 7;
                                label149:
                                if (var175 == 0) {
                                    var10[2] = var137;
                                    float var138 = var146[0];
                                    var10[3] = var138;
                                    float var139 = var146[1];
                                    var10[4] = var139;
                                    float var140 = var146[2];
                                    var10[5] = var140;
                                    float var141 = var3[0];
                                    var10[6] = var141;
                                    float var142 = var3[1];
                                    var10[7] = var142;
                                    var8 = var10;
                                    var10 = KK.D(var1);
                                    float var155 = KK.ab(var10, var146);
                                    float var267;
                                    int var156 = (var267 = var155 - 0.0F) == 0.0F ? 0 : (var267 < 0.0F ? -1 : 1);
                                    boolean var157;
                                    if (var156 >= 0) {
                                        var6 = switch (var6) {
                                            case -1617670095 -> {
                                                var6 ^= -161175903;
                                                var6 >>>= 19;
                                                yield var6 ^ 1017961301;
                                            }
                                            default -> var6 ^ -1561896755;
                                            case -734483414 -> var6 ^ 48699741;
                                        };
                                        var157 = true;
                                        switch (var6) {
                                            case -487466295:
                                                var6 ^= -600211011;
                                                break;
                                            case 1017960043:
                                                var6 &= 294881567;
                                                var6 ^= 141329709;
                                                break;
                                            case 1069231337:
                                            default:
                                                var6 ^= -361912536;
                                        }
                                    } else {
                                        var6 |= -884539608;
                                        var6 -= -740135508;
                                        var6 -= 1151468676;
                                        var6 ^= 583905599;
                                        var6 ^= 1425864915;
                                        int var176 = var6 + 1;
                                        int var177 = var6 * var176;
                                        var12 = var6 + 2;
                                        int var178 = var177 * var12;
                                        var12 = var6 + 3;
                                        int var179 = var178 * var12;
                                        int var180 = var179 & 7;
                                        if (var180 != 0) {
                                            break label149;
                                        }

                                        var157 = false;
                                        var6 -= -873500425;
                                        var6 += -1991320067;
                                        var6 ^= 1982805197;
                                    }

                                    boolean var158 = var157;
                                    int var181 = var7 + 1;
                                    int var182 = var7 * var181;
                                    var12 = var7 + 2;
                                    int var183 = var182 * var12;
                                    var12 = var7 + 3;
                                    int var184 = var183 * var12;
                                    int var185 = var184 & 7;
                                    if (var185 != 0) {
                                        var6 &= -1400849871;
                                        var6 -= -1934193800;
                                        var6 += -1643290966;
                                        var6 ^= -848413619;
                                        break label184;
                                    }

                                    var6 -= -1307378676;
                                    var6 ^= 1597805312;
                                    byte var186 = 0;
                                    int var187 = var186;
                                    var6 &= 1710344049;
                                    var6 ^= 1552981799;
                                    var6 ^= 360547474;

                                    while (true) {
                                        long var193 = var6;
                                        long var14 = var193 + 1L;
                                        var14 = var193 * var14;
                                        long var16 = var193 + 2L;
                                        var14 *= var16;
                                        long var194 = var193 + 3L;
                                        var14 *= var194;
                                        long var195 = var14 & 7L;
                                        long var268;
                                        var12 = (var268 = var195 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                                        if (var12 != 0) {
                                            break;
                                        }

                                        var12 = var1.length;
                                        int var207 = var7 + 1;
                                        int var208 = var7 * var207;
                                        int var209 = var208 & 1;
                                        if (var209 != 0) {
                                            var6 -= 1223276388;
                                            var6 -= -704996686;
                                            var6 ^= -761074065;
                                            var6 ^= 1328695039;
                                            break label184;
                                        }

                                        var6 >>>= 4;
                                        var6 ^= -264428749;
                                        int var210 = var6 + 1;
                                        int var211 = var6 * var210;
                                        int var226 = var6 + 2;
                                        int var212 = var211 * var226;
                                        int var227 = var6 + 3;
                                        int var213 = var212 * var227;
                                        int var214 = var213 & 7;
                                        if (var214 != 0) {
                                            break;
                                        }

                                        if (var187 >= var12) {
                                            switch (var6) {
                                                case -214897488:
                                                default:
                                                    var6 ^= -1350756302;
                                                    break;
                                                case -155325783:
                                                    var6 -= -413969381;
                                                    var6 -= -391515434;
                                                    var6 |= -916372597;
                                                    var6 ^= 586804368;
                                                    break;
                                                case 1058527262:
                                                    var6 ^= -1057858268;
                                            }

                                            return;
                                        }
                                        var6 = switch (var6) {
                                            case -1139167508 -> var6 ^ 1224613181;
                                            default -> var6 ^ 958480229;
                                            case -155325783 -> {
                                                var6 ^= 1028719860;
                                                var6 &= 1674833022;
                                                var6 &= 1940689842;
                                                yield var6 ^ 172213540;
                                            }
                                        };
                                        var12 = var187 + 1;
                                        int var215 = var1.length;
                                        var12 %= var215;
                                        float[] var216 = new float[8];
                                        float[] var228 = var1[var187];
                                        float var229 = var228[0];
                                        var216[0] = var229;
                                        float[] var230 = var1[var187];
                                        float var231 = var230[1];
                                        var216[1] = var231;
                                        float[] var232 = var1[var187];
                                        float var233 = var232[2];
                                        var216[2] = var233;
                                        float var234 = var147[0];
                                        var216[3] = var234;
                                        float var235 = var147[1];
                                        var216[4] = var235;
                                        float var236 = var147[2];
                                        var216[5] = var236;
                                        float[] var237 = var2[var187];
                                        float var238 = var237[0];
                                        var216[6] = var238;
                                        float[] var239 = var2[var187];
                                        float var240 = var239[1];
                                        var216[7] = var240;
                                        float[] var241 = new float[8];
                                        float[] var248 = var1[var12];
                                        float var249 = var248[0];
                                        var241[0] = var249;
                                        float[] var250 = var1[var12];
                                        float var251 = var250[1];
                                        var241[1] = var251;
                                        float[] var252 = var1[var12];
                                        float var253 = var252[2];
                                        var241[2] = var253;
                                        float var254 = var147[0];
                                        var241[3] = var254;
                                        float var255 = var147[1];
                                        var241[4] = var255;
                                        float var256 = var147[2];
                                        var241[5] = var256;
                                        float[] var257 = var2[var12];
                                        float var258 = var257[0];
                                        Integer var259 = var7;
                                        if (var259 == null) {
                                            switch (var6) {
                                                case -1040543191:
                                                    var6 ^= 1817386085;
                                                    break label184;
                                                case -61171480:
                                                default:
                                                    var6 ^= 1348362040;
                                                    break label184;
                                                case 1237534004:
                                                    var6 *= 519937901;
                                                    var6 |= -1285303379;
                                                    var6 ^= 1801141426;
                                                    break label184;
                                            }
                                        }

                                        var6 -= 904811174;
                                        var6 += -1410495183;
                                        var6 <<= 29;
                                        var6 -= 71361143;
                                        var6 ^= -709015250;
                                        var241[6] = var258;
                                        float[] var200 = var2[var12];
                                        float var201 = var200[1];
                                        var241[7] = var201;
                                        if (var158) {
                                            var6 >>>= 17;
                                            var6 ^= -1494508263;
                                            var14 = var6;
                                            var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            long var18 = var14 + 2L;
                                            var16 *= var18;
                                            var14 += 3L;
                                            var16 *= var14;
                                            var14 = var16 & 7L;
                                            long var269;
                                            int var245 = (var269 = var14 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                                            if (var245 != 0) {
                                                break;
                                            }

                                            this.Y(var8, var216, var241, var241, var5);
                                            var6 += 1972545236;
                                            var6 += 788432802;
                                            var6 >>>= 27;
                                            var6 ^= 559768200;
                                        } else {
                                            var6 = switch (var6) {
                                                case 235033767 -> {
                                                    var6 += -1111554094;
                                                    var6 += 273303399;
                                                    var6 |= -1642132735;
                                                    var6 -= 1225136095;
                                                    yield var6 ^ 58043188;
                                                }
                                                case 1763960422 -> var6 ^ 1497563256;
                                                default -> var6 ^ -236368368;
                                            };
                                            this.Y(var8, var241, var216, var216, var5);
                                            var6 += -1655191431;
                                            var6 &= 1032873720;
                                            var6 ^= 282944553;
                                        }

                                        var12 = var187 + 1;
                                        int var217 = var7 + 1;
                                        int var218 = var7 * var217;
                                        int var246 = var7 + 2;
                                        int var219 = var218 * var246;
                                        int var247 = var7 + 3;
                                        int var220 = var219 * var247;
                                        int var221 = var220 & 7;
                                        if (var221 != 0) {
                                            var6 *= 1498135229;
                                            var6 |= -925411435;
                                            var6 += -2083258899;
                                            var6 <<= 16;
                                            var6 ^= -1592594657;
                                            break label184;
                                        }

                                        var6 += 1333374683;
                                        var6 &= 161131502;
                                        var6 >>>= 26;
                                        var6 ^= -630148614;
                                        Integer var222 = var6;
                                        if (var222 == null) {
                                            break;
                                        }

                                        var187 = var12;
                                        var6 &= -1285991617;
                                        var6 ^= 143585670;
                                        var6 |= 590299473;
                                        var6 >>= 31;
                                        var6 ^= -1745656230;
                                    }
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var136 = new UnsupportedOperationException();
                throw var136;
            }
        }

        IllegalStateException var135 = new IllegalStateException();
        throw var135;
    }

    public KK F() {
        int var1 = jX;
        var1 ^= -1882559155;
        int var2 = System.identityHashCode(this);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var24 = var4 & 1L;
        long var45;
        var2 = (var45 = var24 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= 1984275852;
            var1 += -1455152363;
            var1 <<= 22;
            var1 ^= 344121158;
            var1 ^= 32864530;
            long var26 = var1;
            var4 = var26 + 1L;
            var4 = var26 * var4;
            long var27 = var4 & 1L;
            long var46;
            var2 = (var46 = var27 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var29 = new UnsupportedOperationException();
                throw var29;
            }
        } else {
            long var18 = switch (var1) {
                case 608754654 -> {
                    var1 &= -1934168285;
                    var1 >>= 16;
                    var1 += 1546525165;
                    var1 &= 51448257;
                    yield var1 ^ 673750171;
                }
                default -> var1 ^ -1048815641;
                case 1717267751 -> var1 ^ -442135001;
            };
            long var3 = var18 + 1L;
            var3 = var18 * var3;
            long var5 = var18 + 2L;
            var3 *= var5;
            long var19 = var18 + 3L;
            var3 *= var19;
            long var20 = var3 & 7L;
            long var47;
            var1 = (var47 = var20 - 0L) == 0L ? 0 : (var47 < 0L ? -1 : 1);
            if (var1 == 0) {
                float[] var30 = this.bx;
                int var35 = this.a;
                int var36 = var35 * 32;
                float[] var31 = Arrays.copyOf(var30, var36);
                e_2[] var37 = this.b;
                int var43 = this.a;
                Object[] var38 = Arrays.copyOf(var37, var43);
                e_2[] var39 = (e_2[])var38;
                int var44 = this.a;
                return new KK(var31, var39, var44);
            }
        }

        UnsupportedOperationException var22 = new UnsupportedOperationException();
        throw var22;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1578894994;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        jX = var4;
    }
}
