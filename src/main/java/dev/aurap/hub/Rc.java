package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Rc {
    public static final float Nc = 0.035F;
    private static final int GC = 24;
    private static final float bQ = 0.8F;
    public static final int c;

    private Rc() {
    }

    public static int ve(int[] var0, int var1) {
        label519: {
            int var3;
            label542: {
                int var2 = c;
                var3 = var1;
                var2 ^= -149064896;
                int var4 = System.identityHashCode(var0);
                float[] var5 = new float[24];
                var5 = var5;
                float[] var6 = new float[3];
                int var7 = var4 + 1;
                var7 = var4 * var7;
                var7 &= 1;
                if (var7 == 0) {
                    var2 += -1122335230;
                    var2 *= 1463642119;
                    var2 |= 1358005552;
                    var2 *= 815170461;
                    var2 ^= -2062282883;
                    var6 = var6;
                    float var396 = 0.0F;
                    int var8 = 0;
                    int var9 = 0;
                    float var397 = var396;
                    var8 = var8;
                    var9 = var9;
                    var2 -= 1157143708;
                    var2 <<= 24;
                    var2 ^= -1263267473;

                    label514:
                    while (true) {
                        int var10 = var3 + 1;
                        var10 = var3 * var10;
                        var10 &= 1;
                        if (var10 != 0) {
                            break label519;
                        }

                        if (var9 >= var1) {
                            var2 = switch (var2) {
                                case -1058851014 -> var2 ^ 2018665938;
                                case -558624401 -> {
                                    var2 <<= 8;
                                    var2 += -1339455299;
                                    yield var2 ^ 296612682;
                                }
                                default -> var2 ^ 1754753122;
                            };
                            long var449 = var3;
                            long var547 = var449 + 1L;
                            var547 = var449 * var547;
                            long var450 = var547 & 1L;
                            long var758;
                            var9 = (var758 = var450 - 0L) == 0L ? 0 : (var758 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                break label519;
                            }

                            if (var8 == 0) {
                                var2 *= -783876159;
                                var2 >>= 21;
                                var2 ^= -1312419554;
                                break label542;
                            }
                            var2 = switch (var2) {
                                case -1250762405 -> var2 ^ -759587352;
                                default -> var2 ^ 2064721430;
                                case 1972831479 -> {
                                    var2 *= 2128727099;
                                    var2 &= -1586182771;
                                    var2 >>>= 20;
                                    yield var2 ^ -1511593357;
                                }
                            };
                            float var416 = var8;
                            float var398 = var397 / var416;
                            float var759;
                            var7 = (var759 = var398 - 0.035F) == 0.0F ? 0 : (var759 < 0.0F ? -1 : 1);
                            var8 = var4 + 1;
                            var8 = var4 * var8;
                            var8 &= 1;
                            if (var8 == 0) {
                                var2 *= 1042257949;
                                var2 *= -504331797;
                                var2 ^= -1336059474;
                                Integer var420 = var3;
                                if (var420 == null) {
                                    break label519;
                                }

                                if (var7 < 0) {
                                    var2 ^= -2090148370;
                                    var2 ^= 910753454;
                                    break label542;
                                }

                                var2 += 1478378468;
                                var2 ^= -448393724;
                                int var400 = 0;
                                float var421 = -1.0F;
                                Integer var452 = var4;
                                if (var452 != null) {
                                    var2 += 1937960137;
                                    var2 *= 25443367;
                                    var2 |= 1045994402;
                                    var2 ^= 948442319;
                                    var2 ^= 2021662817;
                                    int var453 = var3 + 1;
                                    var453 = var3 * var453;
                                    var10 = var3 + 2;
                                    var453 *= var10;
                                    var10 = var3 + 3;
                                    var453 *= var10;
                                    var453 &= 7;
                                    if (var453 != 0) {
                                        break label519;
                                    }

                                    int var458 = 0;
                                    var400 = var400;
                                    float var422 = var421;
                                    var458 = var458;
                                    var2 |= 1367943502;
                                    var2 ^= 1472605935;

                                    while (true) {
                                        Integer var499 = var3;
                                        if (var499 == null) {
                                            break label519;
                                        }

                                        if (var458 >= 24) {
                                            var2 ^= 1565285344;
                                            var2 ^= -1758929383;
                                            var2 ^= -847102553;
                                            float var760;
                                            int var372 = (var760 = var422 - 0.0F) == 0.0F ? 0 : (var760 < 0.0F ? -1 : 1);
                                            int var423 = var4 + 1;
                                            var423 = var4 * var423;
                                            var458 = var4 + 2;
                                            var423 *= var458;
                                            var458 = var4 + 3;
                                            var423 *= var458;
                                            var423 &= 7;
                                            if (var423 != 0) {
                                                var2 >>>= 10;
                                                var2 <<= 1;
                                                var2 *= -211297111;
                                                var2 ^= 1594728685;
                                            } else {
                                                var2 = switch (var2) {
                                                    default -> var2 ^ -1799959750;
                                                    case 805010926 -> {
                                                        var2 >>= 1;
                                                        var2 += -38797991;
                                                        var2 += -91481276;
                                                        var2 >>>= 19;
                                                        yield var2 ^ -640667363;
                                                    }
                                                    case 2062469520 -> var2 ^ 470269609;
                                                };
                                                long var428 = var3;
                                                long var512 = var428 + 1L;
                                                long var513 = var428 * var512;
                                                long var627 = var428 + 2L;
                                                long var514 = var513 * var627;
                                                long var429 = var428 + 3L;
                                                long var515 = var514 * var429;
                                                long var430 = var515 & 7L;
                                                long var761;
                                                var423 = (var761 = var430 - 0L) == 0L ? 0 : (var761 < 0L ? -1 : 1);
                                                if (var423 != 0) {
                                                    break label519;
                                                }

                                                if (var372 <= 0) {
                                                    switch (var2) {
                                                        case -640666854:
                                                            var2 += 1794673661;
                                                            var2 -= 319663971;
                                                            var2 ^= 1587380584;
                                                            break;
                                                        case -516489997:
                                                            var2 ^= -25696820;
                                                            break;
                                                        case 1245381767:
                                                        default:
                                                            var2 ^= 1289266243;
                                                    }

                                                    return 0;
                                                }

                                                var2 |= -1025965496;
                                                var2 &= -2128151949;
                                                var2 += -1916860434;
                                                var2 ^= -1701593323;
                                                Integer var373 = var3;
                                                if (var373 == null) {
                                                    break label519;
                                                }

                                                float var374 = 0.0F;
                                                var423 = var4 + 1;
                                                var423 = var4 * var423;
                                                var423 &= 1;
                                                if (var423 != 0) {
                                                    switch (var2) {
                                                        case -1956418860:
                                                        default:
                                                            var2 ^= 339681263;
                                                            break label514;
                                                        case -1809021611:
                                                            var2 -= 1319355780;
                                                            var2 *= 895295361;
                                                            var2 |= 1458886873;
                                                            var2 ^= -1616538278;
                                                            break label514;
                                                        case 1761553005:
                                                            var2 ^= -313454736;
                                                    }
                                                } else {
                                                    var2 = switch (var2) {
                                                        case -1809021611 -> {
                                                            var2 += 1535057261;
                                                            yield var2 ^ -1047968916;
                                                        }
                                                        default -> var2 ^ 531666014;
                                                        case -216336137 -> var2 ^ 1170683303;
                                                    };
                                                    float var435 = 0.0F;
                                                    float var462 = 0.0F;
                                                    byte var516 = 0;
                                                    float var375 = var374;
                                                    float var436 = var435;
                                                    float var463 = var462;
                                                    int var517 = var516;
                                                    var2 += -1591571504;
                                                    var2 -= 123688462;
                                                    var2 -= 571690086;
                                                    var2 ^= 816812409;

                                                    while (var517 < var1) {
                                                        var2 += 1643488120;
                                                        var2 ^= -614946436;
                                                        Integer var573 = var3;
                                                        if (var573 == null) {
                                                            break label519;
                                                        }

                                                        int var574 = var0[var517];
                                                        var627 = var4;
                                                        long var685 = var627 + 1L;
                                                        var685 = var627 * var685;
                                                        var627 = var685 & 1L;
                                                        long var762;
                                                        int var630 = (var762 = var627 - 0L) == 0L ? 0 : (var762 < 0L ? -1 : 1);
                                                        if (var630 != 0) {
                                                            var2 *= -324293715;
                                                            var2 |= 1371777654;
                                                            var2 |= -1750533439;
                                                            var2 ^= -1751018116;
                                                            break label514;
                                                        }

                                                        var2 *= 1234447319;
                                                        var2 ^= -1150877354;
                                                        Integer var631 = var3;
                                                        if (var631 == null) {
                                                            break label519;
                                                        }

                                                        int var632 = var574 >>> 24;
                                                        float var637;
                                                        float var669;
                                                        float var692;
                                                        if (var632 < 128) {
                                                            var2 += -718068589;
                                                            var2 >>= 24;
                                                            var2 &= -1610797745;
                                                            var2 ^= -1984350453;
                                                            var627 = var3;
                                                            var685 = var627 + 1L;
                                                            var685 = var627 * var685;
                                                            long var736 = var627 + 2L;
                                                            var685 *= var736;
                                                            var627 += 3L;
                                                            var685 *= var627;
                                                            var627 = var685 & 7L;
                                                            long var763;
                                                            int var636 = (var763 = var627 - 0L) == 0L ? 0 : (var763 < 0L ? -1 : 1);
                                                            if (var636 != 0) {
                                                                break label519;
                                                            }

                                                            var637 = var375;
                                                            var669 = var436;
                                                            Integer var691 = var4;
                                                            if (var691 == null) {
                                                                var2 ^= -681477923;
                                                                var2 >>= 19;
                                                                var2 ^= 1079664984;
                                                                break label514;
                                                            }

                                                            var2 -= -1013787132;
                                                            var2 |= -308202130;
                                                            var2 -= -1662817505;
                                                            var2 -= 382437151;
                                                            var2 ^= -1891796707;
                                                            var692 = var463;
                                                            switch (var2) {
                                                                case -1262093780:
                                                                    var2 -= -704471195;
                                                                    var2 *= 1881852753;
                                                                    var2 ^= 270826226;
                                                                    break;
                                                                case -1212835885:
                                                                default:
                                                                    var2 ^= 192423569;
                                                                    break;
                                                                case 204395999:
                                                                    var2 ^= -967886315;
                                                            }
                                                        } else {
                                                            var2 |= 917060123;
                                                            var2 ^= 77085895;
                                                            var2 <<= 30;
                                                            var2 |= 854471421;
                                                            var2 ^= -390716267;
                                                            Integer var715 = var3;
                                                            if (var715 == null) {
                                                                break label519;
                                                            }

                                                            int var716 = var2 | 1709337679;
                                                            var716 &= 1051363705;
                                                            var716 &= 778542672;
                                                            var716 += 887072234;
                                                            var716 ^= -1218695134;
                                                            J(var574, var6, var716);
                                                            int var575 = var2 >> 31;
                                                            int var576 = var575 ^ -1932308786;
                                                            int var577 = var576 - -1859444479;
                                                            int var578 = var577 - 1669815613;
                                                            int var579 = var578 ^ 1420706782;
                                                            int var580 = Bx(var6, var579);
                                                            int var581 = var580 - var400;
                                                            int var582 = Math.abs(var581);
                                                            var716 = var4 + 1;
                                                            var716 = var4 * var716;
                                                            var716 &= 1;
                                                            if (var716 != 0) {
                                                                switch (var2) {
                                                                    case -1591317696:
                                                                        var2 ^= -2032465530;
                                                                        break label514;
                                                                    case -881726659:
                                                                    default:
                                                                        var2 ^= -211086567;
                                                                        break label514;
                                                                    case -631761304:
                                                                        var2 >>>= 1;
                                                                        var2 ^= 762732983;
                                                                        break label514;
                                                                }
                                                            }

                                                            var2 |= -1297017336;
                                                            var2 *= -1845724013;
                                                            var2 &= 581724078;
                                                            var2 ^= -1648822;
                                                            var716 = 24 - var582;
                                                            int var583 = Math.min(var582, var716);
                                                            if (var583 > 1) {
                                                                var2 &= 929787914;
                                                                var2 &= 104111650;
                                                                var2 &= 90981137;
                                                                var2 -= 1315368831;
                                                                var2 ^= -1138765661;
                                                                Integer var584 = var3;
                                                                if (var584 == null) {
                                                                    break label519;
                                                                }

                                                                var637 = var375;
                                                                var669 = var436;
                                                                Integer var585 = var4;
                                                                if (var585 == null) {
                                                                    var2 *= 1137119543;
                                                                    var2 ^= 643425229;
                                                                    break label514;
                                                                }

                                                                var2 ^= -778879536;
                                                                var2 *= -808325573;
                                                                var2 &= 137849031;
                                                                var2 <<= 29;
                                                                var2 ^= 1821390228;
                                                                var692 = var463;
                                                                switch (var2) {
                                                                    case -1399835244:
                                                                        var2 &= -1903111957;
                                                                        var2 *= 2138336307;
                                                                        var2 += -1304867673;
                                                                        var2 ^= 985098530;
                                                                        break;
                                                                    case -338622117:
                                                                    default:
                                                                        var2 ^= -654151678;
                                                                        break;
                                                                    case 799943423:
                                                                        var2 ^= -1359670948;
                                                                }
                                                            } else {
                                                                var2 = switch (var2) {
                                                                    default -> var2 ^ -1781232443;
                                                                    case -572067102 -> {
                                                                        var2 -= -686380491;
                                                                        var2 *= 1110922183;
                                                                        var2 &= -1352880771;
                                                                        var2 ^= -2120558355;
                                                                        yield var2 ^ 1847116961;
                                                                    }
                                                                    case 1974217264 -> var2 ^ 1892399660;
                                                                };
                                                                float var586 = var6[0];
                                                                float var725 = var6[1];
                                                                double var726 = var725;
                                                                int var746 = var4 + 1;
                                                                var746 = var4 * var746;
                                                                int var756 = var4 + 2;
                                                                var746 *= var756;
                                                                var756 = var4 + 3;
                                                                var746 *= var756;
                                                                var746 &= 7;
                                                                if (var746 != 0) {
                                                                    var2 += 77637147;
                                                                    var2 |= -522548382;
                                                                    var2 &= 1646388741;
                                                                    var2 ^= 578538627;
                                                                    break label514;
                                                                }

                                                                var2 += -755125006;
                                                                var2 += 966031780;
                                                                var2 ^= -1033222596;
                                                                float var751 = var6[2];
                                                                double var752 = var751;
                                                                double var727 = Math.hypot(var726, var752);
                                                                float var728 = (float)var727;
                                                                int var737 = var2 >>> 7;
                                                                var737 ^= -1541999891;
                                                                var737 &= 387898589;
                                                                var737 ^= 1527828644;
                                                                float var587 = bp(var586, var728, var737);
                                                                float var729 = var6[1];
                                                                float var730 = var729 * var587;
                                                                float var731 = var375 + var730;
                                                                float var741 = var6[2];
                                                                float var742 = var741 * var587;
                                                                float var743 = var436 + var742;
                                                                float var588 = var463 + var587;
                                                                var637 = var731;
                                                                var669 = var743;
                                                                var692 = var588;
                                                                var2 |= 1823331971;
                                                                var2 ^= 900344050;
                                                            }
                                                        }

                                                        long var732 = var3;
                                                        long var753 = var732 + 1L;
                                                        var753 = var732 * var753;
                                                        var732 = var753 & 1L;
                                                        long var764;
                                                        int var589 = (var764 = var732 - 0L) == 0L ? 0 : (var764 < 0L ? -1 : 1);
                                                        if (var589 != 0) {
                                                            break label519;
                                                        }

                                                        int var590 = var517 + 1;
                                                        var375 = var637;
                                                        var436 = var669;
                                                        var463 = var692;
                                                        var627 = var4;
                                                        var685 = var627 + 1L;
                                                        var685 = var627 * var685;
                                                        var627 = var685 & 1L;
                                                        long var765;
                                                        int var640 = (var765 = var627 - 0L) == 0L ? 0 : (var765 < 0L ? -1 : 1);
                                                        if (var640 != 0) {
                                                            var2 -= 1747008242;
                                                            var2 -= 759833895;
                                                            var2 &= 822452955;
                                                            var2 *= -686468999;
                                                            var2 ^= 1155414539;
                                                            break label514;
                                                        }
                                                        var2 = switch (var2) {
                                                            case -974945986 -> var2 ^ 1355373843;
                                                            default -> var2 ^ 262014438;
                                                            case 1230372613 -> {
                                                                var2 += -406455347;
                                                                yield var2 ^ 183700941;
                                                            }
                                                        };
                                                        Integer var641 = var3;
                                                        if (var641 == null) {
                                                            break label519;
                                                        }

                                                        var517 = var590;
                                                        var2 -= 865350695;
                                                        var2 *= 842265229;
                                                        var2 >>>= 6;
                                                        var2 ^= -1769681607;
                                                    }

                                                    var2 ^= 1147755000;
                                                    var2 |= -534569682;
                                                    var2 ^= 2104390837;
                                                    int var383 = var3 + 1;
                                                    int var384 = var3 * var383;
                                                    int var385 = var384 & 1;
                                                    if (var385 != 0) {
                                                        break label519;
                                                    }

                                                    float var766;
                                                    int var386 = (var766 = var463 - 0.0F) == 0.0F ? 0 : (var766 < 0.0F ? -1 : 1);
                                                    var400 = var4 + 1;
                                                    var400 = var4 * var400;
                                                    var400 &= 1;
                                                    if (var400 == 0) {
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ -69874653;
                                                            case -1940296934 -> {
                                                                var2 &= -2104425912;
                                                                var2 ^= 454514263;
                                                                var2 &= -1222882824;
                                                                var2 ^= -975782207;
                                                                yield var2 ^ 1003978141;
                                                            }
                                                            case -1866353229 -> var2 ^ 40979076;
                                                        };
                                                        if (var386 <= 0) {
                                                            var2 += 39394168;
                                                            var2 ^= 521698844;
                                                            long var391 = var3;
                                                            long var537 = var391 + 1L;
                                                            long var538 = var391 * var537;
                                                            long var392 = var538 & 1L;
                                                            long var767;
                                                            int var393 = (var767 = var392 - 0L) == 0L ? 0 : (var767 < 0L ? -1 : 1);
                                                            if (var393 == 0) {
                                                                return 0;
                                                            }
                                                            break label519;
                                                        }

                                                        var2 += -1820002388;
                                                        var2 *= 266059835;
                                                        var2 ^= 1123991012;
                                                        var2 ^= 1377799664;
                                                        float var376 = var375 / var463;
                                                        float var387 = var436 / var463;
                                                        double var405 = var376;
                                                        double var464 = var387;
                                                        double var406 = Math.hypot(var405, var464);
                                                        long var465 = var4;
                                                        var547 = var465 + 1L;
                                                        var547 = var465 * var547;
                                                        long var670 = var465 + 2L;
                                                        var547 *= var670;
                                                        long var466 = var465 + 3L;
                                                        var547 *= var466;
                                                        long var467 = var547 & 7L;
                                                        long var768;
                                                        var458 = (var768 = var467 - 0L) == 0L ? 0 : (var768 < 0L ? -1 : 1);
                                                        if (var458 != 0) {
                                                            switch (var2) {
                                                                case -437235339:
                                                                default:
                                                                    var2 ^= -1934411922;
                                                                    break label514;
                                                                case 674345015:
                                                                    var2 ^= 1092471102;
                                                                    break label514;
                                                                case 1352627844:
                                                                    var2 *= -323462137;
                                                                    var2 |= -1815081751;
                                                                    var2 >>>= 14;
                                                                    var2 += 2094700263;
                                                                    var2 ^= 1015286966;
                                                            }
                                                        } else {
                                                            var2 ^= -415382189;
                                                            var2 &= -223274313;
                                                            var2 &= 36888958;
                                                            var2 ^= 1518625524;
                                                            Integer var469 = var3;
                                                            if (var469 == null) {
                                                                break label519;
                                                            }

                                                            float var407 = (float)var406;
                                                            float var769;
                                                            var423 = (var769 = var407 - 1.0E-4F) == 0.0F ? 0 : (var769 < 0.0F ? -1 : 1);
                                                            if (var423 < 0) {
                                                                var2 += 1849547741;
                                                                var2 *= 1083185247;
                                                                var2 -= 269555201;
                                                                var2 ^= 2078737351;
                                                                var423 = var3 + 1;
                                                                var423 = var3 * var423;
                                                                int var479 = var3 + 2;
                                                                var423 *= var479;
                                                                var479 = var3 + 3;
                                                                var423 *= var479;
                                                                var423 &= 7;
                                                                if (var423 == 0) {
                                                                    return 0;
                                                                }
                                                                break label519;
                                                            }

                                                            var2 *= -1809670727;
                                                            var2 >>= 6;
                                                            var2 &= -719104935;
                                                            var2 ^= -1339797047;
                                                            var2 ^= 1621554314;
                                                            Integer var438 = var3;
                                                            if (var438 == null) {
                                                                break label519;
                                                            }

                                                            float var439 = var407 * 1.3F;
                                                            float var440 = Math.max(0.09F, var439);
                                                            float var441 = Math.min(0.19F, var440);
                                                            float var377 = var376 / var407;
                                                            float var378 = var377;
                                                            float var388 = var387 / var407;
                                                            float var389 = var388;
                                                            float[] var408 = new float[3];
                                                            var469 = var4;
                                                            if (var469 != null) {
                                                                var2 >>>= 13;
                                                                var2 ^= -1068919997;
                                                                float[] var409 = var408;
                                                                byte var471 = 0;
                                                                float var442 = var441;
                                                                int var472 = var471;
                                                                var2 <<= 14;
                                                                var2 -= -511262845;
                                                                var2 += -1891222443;
                                                                var2 -= -1453179322;
                                                                var2 ^= 517213959;

                                                                while (true) {
                                                                    Integer var518 = var3;
                                                                    if (var518 == null) {
                                                                        break label519;
                                                                    }

                                                                    if (var472 >= 24) {
                                                                        var2 *= -809461275;
                                                                        var2 += -1603346326;
                                                                        var2 ^= -722312437;
                                                                        var2 -= -1502810255;
                                                                        var2 ^= 792905753;
                                                                        break;
                                                                    }

                                                                    var2 &= -356879427;
                                                                    var2 ^= 931409024;
                                                                    long var519 = var3;
                                                                    var627 = var519 + 1L;
                                                                    var627 = var519 * var627;
                                                                    long var520 = var627 & 1L;
                                                                    long var770;
                                                                    int var521 = (var770 = var520 - 0L) == 0L ? 0 : (var770 < 0L ? -1 : 1);
                                                                    if (var521 != 0) {
                                                                        break label519;
                                                                    }

                                                                    var409[0] = 0.8F;
                                                                    var521 = var4 + 1;
                                                                    var521 = var4 * var521;
                                                                    int var595 = var4 + 2;
                                                                    var521 *= var595;
                                                                    int var596 = var4 + 3;
                                                                    var521 *= var596;
                                                                    var521 &= 7;
                                                                    if (var521 != 0) {
                                                                        var2 *= 46706301;
                                                                        var2 ^= 1169957350;
                                                                        break label514;
                                                                    }

                                                                    var2 += -162465733;
                                                                    var2 += -478527989;
                                                                    var2 &= -1179570120;
                                                                    var2 ^= -380876696;
                                                                    float var527 = var378 * var442;
                                                                    var409[1] = var527;
                                                                    float var528 = var389 * var442;
                                                                    var409[2] = var528;
                                                                    ed.N(var409);
                                                                    var521 = var2 - 1735024722;
                                                                    var521 ^= -1487405302;
                                                                    var521 ^= -946833743;
                                                                    int var532 = r(var409, var521) ? 1 : 0;
                                                                    if (var532 != 0) {
                                                                        var2 -= 655946189;
                                                                        var2 ^= 170353639;
                                                                        var2 -= -1874053759;
                                                                        var2 ^= 1696350131;
                                                                        break;
                                                                    }

                                                                    var2 <<= 30;
                                                                    var2 ^= 1040413648;
                                                                    var532 = var3 + 1;
                                                                    var532 = var3 * var532;
                                                                    var532 &= 1;
                                                                    if (var532 != 0) {
                                                                        break label519;
                                                                    }

                                                                    float var536 = var442 * 0.9F;
                                                                    var547 = var4;
                                                                    var670 = var547 + 1L;
                                                                    var670 = var547 * var670;
                                                                    var547 = var670 & 1L;
                                                                    long var771;
                                                                    int var599 = (var771 = var547 - 0L) == 0L ? 0 : (var771 < 0L ? -1 : 1);
                                                                    if (var599 != 0) {
                                                                        var2 += 625254695;
                                                                        var2 >>= 31;
                                                                        var2 += 1300221907;
                                                                        var2 >>= 20;
                                                                        var2 ^= 1079668308;
                                                                        break label514;
                                                                    }

                                                                    var2 *= -1587893077;
                                                                    var2 ^= 792368783;
                                                                    Integer var600 = var3;
                                                                    if (var600 == null) {
                                                                        break label519;
                                                                    }

                                                                    int var601 = var472 + 1;
                                                                    var442 = var536;
                                                                    var472 = var601;
                                                                    var2 += -1416155261;
                                                                    var2 >>= 6;
                                                                    var2 ^= 1870028671;
                                                                }

                                                                float var379 = var378 * var442;
                                                                float var390 = var389 * var442;
                                                                long var410 = var4;
                                                                long var473 = var410 + 1L;
                                                                long var474 = var410 * var473;
                                                                long var411 = var474 & 1L;
                                                                long var772;
                                                                var4 = (var772 = var411 - 0L) == 0L ? 0 : (var772 < 0L ? -1 : 1);
                                                                if (var4 == 0) {
                                                                    switch (var2) {
                                                                        case -1162500825:
                                                                            var2 ^= -1418136120;
                                                                            break;
                                                                        case -654968285:
                                                                        default:
                                                                            var2 ^= 185865327;
                                                                            break;
                                                                        case 1312485440:
                                                                            var2 &= 126358940;
                                                                            var2 *= -2022697929;
                                                                            var2 += 1379109040;
                                                                            var2 *= 1043490925;
                                                                            var2 ^= -384235553;
                                                                    }

                                                                    long var412 = var3;
                                                                    long var475 = var412 + 1L;
                                                                    long var476 = var412 * var475;
                                                                    var547 = var412 + 2L;
                                                                    long var477 = var476 * var547;
                                                                    long var413 = var412 + 3L;
                                                                    long var478 = var477 * var413;
                                                                    long var414 = var478 & 7L;
                                                                    long var773;
                                                                    var4 = (var773 = var414 - 0L) == 0L ? 0 : (var773 < 0L ? -1 : 1);
                                                                    if (var4 == 0) {
                                                                        return ed.Module(0.8F, var379, var390);
                                                                    }
                                                                    break label519;
                                                                }

                                                                var2 ^= 2133737027;
                                                                var2 <<= 23;
                                                                var2 |= 211148959;
                                                                var2 <<= 29;
                                                                var2 ^= -1604687229;
                                                            } else {
                                                                var2 |= -2068203752;
                                                                var2 >>>= 22;
                                                                var2 -= 433164209;
                                                                var2 ^= -1502340894;
                                                            }
                                                        }
                                                    } else {
                                                        var2 ^= 1833497699;
                                                        var2 ^= -1604723988;
                                                        var2 ^= 17968918;
                                                    }
                                                }
                                            }
                                            break label514;
                                        }
                                        var2 = switch (var2) {
                                            case -1383152077 -> var2 ^ 1979596650;
                                            default -> var2 ^ -1359058354;
                                            case 673039792 -> {
                                                var2 &= -643670204;
                                                var2 *= 363337961;
                                                var2 += 2129441898;
                                                var2 ^= 1369863420;
                                                yield var2 ^ -681070803;
                                            }
                                        };
                                        long var500 = var3;
                                        long var613 = var500 + 1L;
                                        var613 = var500 * var613;
                                        long var501 = var613 & 1L;
                                        long var774;
                                        int var502 = (var774 = var501 - 0L) == 0L ? 0 : (var774 < 0L ? -1 : 1);
                                        if (var502 != 0) {
                                            break label519;
                                        }

                                        var502 = var458 + 24;
                                        var502 = --var502 % 24;
                                        float var506 = var5[var502];
                                        float var507 = var506 * 0.5F;
                                        float var549 = var5[var458];
                                        float var508 = var507 + var549;
                                        int var550 = var458 + 1;
                                        int var551 = var550 % 24;
                                        float var552 = var5[var551];
                                        float var553 = var552 * 0.5F;
                                        float var509 = var508 + var553;
                                        var547 = var4;
                                        long var659 = var547 + 1L;
                                        var659 = var547 * var659;
                                        var547 = var659 & 1L;
                                        long var775;
                                        int var556 = (var775 = var547 - 0L) == 0L ? 0 : (var775 < 0L ? -1 : 1);
                                        if (var556 != 0) {
                                            var2 &= -277522330;
                                            var2 -= -1867039236;
                                            var2 ^= -1292668763;
                                            break label514;
                                        }

                                        var2 += 100067753;
                                        var2 ^= -2040102255;
                                        Integer var557 = var3;
                                        if (var557 == null) {
                                            break label519;
                                        }

                                        float var776;
                                        int var558 = (var776 = var509 - var422) == 0.0F ? 0 : (var776 < 0.0F ? -1 : 1);
                                        float var510;
                                        int var572;
                                        if (var558 > 0) {
                                            var2 = switch (var2) {
                                                case -1419556582 -> var2 ^ 711971816;
                                                case 524273397 -> {
                                                    var2 &= -1998192595;
                                                    var2 -= -1494824536;
                                                    var2 ^= -2062988232;
                                                    yield var2 ^ 1161420550;
                                                }
                                                default -> var2 ^ -1887448463;
                                            };
                                            var547 = var3;
                                            var659 = var547 + 1L;
                                            var659 = var547 * var659;
                                            long var713 = var547 + 2L;
                                            var659 *= var713;
                                            var547 += 3L;
                                            var659 *= var547;
                                            var547 = var659 & 7L;
                                            long var777;
                                            int var562 = (var777 = var547 - 0L) == 0L ? 0 : (var777 < 0L ? -1 : 1);
                                            if (var562 != 0) {
                                                break label519;
                                            }

                                            var547 = var4;
                                            var659 = var547 + 1L;
                                            var659 = var547 * var659;
                                            var713 = var547 + 2L;
                                            var659 *= var713;
                                            var547 += 3L;
                                            var659 *= var547;
                                            var547 = var659 & 7L;
                                            long var778;
                                            int var566 = (var778 = var547 - 0L) == 0L ? 0 : (var778 < 0L ? -1 : 1);
                                            if (var566 != 0) {
                                                var2 *= 1649197591;
                                                var2 |= -83133022;
                                                var2 ^= 167009357;
                                                var2 ^= -1306146455;
                                                break label514;
                                            }
                                            var2 = switch (var2) {
                                                case -1592810173 -> {
                                                    var2 ^= -312849159;
                                                    var2 += 1552051510;
                                                    var2 -= 596419761;
                                                    yield var2 ^ 1904897726;
                                                }
                                                case -1141756127 -> var2 ^ -1252923725;
                                                default -> var2 ^ -1545725675;
                                            };
                                            int var567 = var3 + 1;
                                            int var568 = var3 * var567;
                                            int var615 = var3 + 2;
                                            int var569 = var568 * var615;
                                            int var616 = var3 + 3;
                                            int var570 = var569 * var616;
                                            int var571 = var570 & 7;
                                            if (var571 != 0) {
                                                break label519;
                                            }

                                            var572 = var458;
                                            var510 = var509;
                                            var2 >>= 31;
                                            var2 ^= 2142665981;
                                            var2 ^= 1877946236;
                                        } else {
                                            var2 |= -1990489273;
                                            var2 ^= 1687459131;
                                            var2 ^= -2080762693;
                                            var613 = var3;
                                            long var681 = var613 + 1L;
                                            var681 = var613 * var681;
                                            var613 = var681 & 1L;
                                            long var779;
                                            int var619 = (var779 = var613 - 0L) == 0L ? 0 : (var779 < 0L ? -1 : 1);
                                            if (var619 != 0) {
                                                break label519;
                                            }

                                            var572 = var400;
                                            int var620 = var4 + 1;
                                            int var621 = var4 * var620;
                                            int var622 = var621 & 1;
                                            if (var622 != 0) {
                                                switch (var2) {
                                                    case 1345559420:
                                                    default:
                                                        var2 ^= -583270251;
                                                        break label514;
                                                    case 1731604779:
                                                        var2 ^= 455962425;
                                                        break label514;
                                                    case 2014400119:
                                                        var2 -= 844360351;
                                                        var2 ^= 555199538;
                                                        var2 ^= -1634920294;
                                                        var2 += 218399054;
                                                        var2 ^= 1198928445;
                                                        break label514;
                                                }
                                            }

                                            var2 |= -1350174231;
                                            var2 += -1901533084;
                                            var2 ^= -2141454174;
                                            var510 = var422;
                                            var2 ^= 1523639890;
                                            var2 -= 1849619212;
                                            var2 ^= 165001209;
                                        }

                                        var613 = var3;
                                        long var683 = var613 + 1L;
                                        var683 = var613 * var683;
                                        var613 = var683 & 1L;
                                        long var780;
                                        int var625 = (var780 = var613 - 0L) == 0L ? 0 : (var780 < 0L ? -1 : 1);
                                        if (var625 != 0) {
                                            break label519;
                                        }

                                        int var626 = var458 + 1;
                                        var400 = var572;
                                        var422 = var510;
                                        Integer var511 = var4;
                                        if (var511 == null) {
                                            var2 ^= 2120916774;
                                            var2 += 1189684762;
                                            var2 &= 1462456066;
                                            var2 >>= 18;
                                            var2 ^= 1079672459;
                                            break label514;
                                        }

                                        var2 -= -2040180301;
                                        var2 *= -921294639;
                                        var2 ^= -659530732;
                                        var458 = var626;
                                        var2 *= 1576677647;
                                        var2 ^= -285397035;
                                        var2 &= 590959423;
                                        var2 ^= 154977444;
                                    }
                                } else {
                                    var2 |= 932183342;
                                    var2 ^= -6973587;
                                }
                            } else {
                                var2 |= -2090472499;
                                var2 -= -855550679;
                                var2 += 1633581213;
                                var2 ^= 2082432496;
                            }
                            break;
                        }

                        var2 <<= 14;
                        var2 >>= 19;
                        var2 -= 1386686051;
                        var2 ^= 2108776332;
                        var10 = var0[var9];
                        Integer var11 = var4;
                        if (var11 == null) {
                            var2 += 1639337801;
                            var2 ^= -656809088;
                            var2 |= 99431143;
                            var2 ^= -1347068564;
                            break;
                        }
                        var2 = switch (var2) {
                            case -1343156210 -> var2 ^ 1532500439;
                            case -790002268 -> {
                                var2 += 520608763;
                                var2 &= -365702546;
                                var2 &= -947364029;
                                yield var2 ^ 397790291;
                            }
                            default -> var2 ^ -371989287;
                        };
                        int var539 = var10 >>> 24;
                        float var545;
                        int var612;
                        if (var539 < 128) {
                            var2 -= -614353761;
                            var2 -= 2032467723;
                            var2 += -536066043;
                            var2 *= 377822897;
                            var2 ^= 26905829;
                            var539 = var3 + 1;
                            var539 = var3 * var539;
                            var612 = var3 + 2;
                            var539 *= var612;
                            var612 = var3 + 3;
                            var539 *= var612;
                            var539 &= 7;
                            if (var539 != 0) {
                                break label519;
                            }

                            var545 = var397;
                            long var604 = var4;
                            long var14 = var604 + 1L;
                            var14 = var604 * var14;
                            long var16 = var604 + 2L;
                            var14 *= var16;
                            long var605 = var604 + 3L;
                            var14 *= var605;
                            long var606 = var14 & 7L;
                            long var781;
                            var612 = (var781 = var606 - 0L) == 0L ? 0 : (var781 < 0L ? -1 : 1);
                            if (var612 != 0) {
                                switch (var2) {
                                    case -543026239:
                                    default:
                                        var2 ^= -2017271488;
                                        break label514;
                                    case -393530871:
                                        var2 -= 948262132;
                                        var2 -= 9609194;
                                        var2 >>>= 2;
                                        var2 ^= 1803986377;
                                        break label514;
                                    case 409379797:
                                        var2 ^= -271757740;
                                        break label514;
                                }
                            }

                            var2 >>>= 17;
                            var2 <<= 28;
                            var2 ^= -2002274524;
                            long var608 = var3;
                            var14 = var608 + 1L;
                            var14 = var608 * var14;
                            var16 = var608 + 2L;
                            var14 *= var16;
                            long var609 = var608 + 3L;
                            var14 *= var609;
                            long var610 = var14 & 7L;
                            long var782;
                            var612 = (var782 = var610 - 0L) == 0L ? 0 : (var782 < 0L ? -1 : 1);
                            if (var612 != 0) {
                                break label519;
                            }

                            var612 = var8;
                            var2 ^= -726640394;
                            var2 += 353109362;
                            var2 ^= -1267182829;
                        } else {
                            var2 = switch (var2) {
                                default -> var2 ^ -962955289;
                                case -709522351 -> {
                                    var2 >>= 15;
                                    yield var2 ^ 1100062164;
                                }
                                case 643353334 -> var2 ^ 797594611;
                            };
                            long var13 = var3;
                            long var15 = var13 + 1L;
                            var15 = var13 * var15;
                            long var17 = var13 + 2L;
                            var15 *= var17;
                            var13 += 3L;
                            var15 *= var13;
                            var13 = var15 & 7L;
                            long var783;
                            int var646 = (var783 = var13 - 0L) == 0L ? 0 : (var783 < 0L ? -1 : 1);
                            if (var646 != 0) {
                                break label519;
                            }

                            int var647 = var2 << 2;
                            int var648 = var647 >>> 5;
                            int var649 = var648 | -717260489;
                            int var650 = var649 ^ 60973567;
                            J(var10, var6, var650);
                            float var484 = var6[1];
                            double var651 = var484;
                            float var485 = var6[2];
                            double var698 = var485;
                            double var652 = Math.hypot(var651, var698);
                            float var486 = (float)var652;
                            float var653 = var397 + var486;
                            int var680 = var8 + 1;
                            int var699 = var2 | 1353922396;
                            int var700 = var699 - -2057550813;
                            int var701 = var700 << 18;
                            int var702 = var701 | 830079675;
                            int var703 = var702 ^ -709987434;
                            int var704 = Bx(var6, var703);
                            float var735 = var5[var704];
                            float var744 = var6[0];
                            int var18 = var2 - 176042307;
                            var18 ^= -319366892;
                            float var487 = bp(var744, var486, var18);
                            float var488 = var735 + var487;
                            var5[var704] = var488;
                            var10 = var4 + 1;
                            var10 = var4 * var10;
                            int var705 = var4 + 2;
                            var10 *= var705;
                            int var706 = var4 + 3;
                            var10 *= var706;
                            var10 &= 7;
                            if (var10 != 0) {
                                switch (var2) {
                                    case -1585201006:
                                    default:
                                        var2 ^= -1936472828;
                                        break label514;
                                    case -1100073281:
                                        var2 &= 1877847659;
                                        var2 ^= 1849052328;
                                        break label514;
                                    case 2094421898:
                                        var2 ^= 503786930;
                                        break label514;
                                }
                            }

                            var2 -= -1723687330;
                            var2 |= -1247192185;
                            var2 ^= 1627433772;
                            Integer var494 = var3;
                            if (var494 == null) {
                                break label519;
                            }

                            var545 = var653;
                            var612 = var680;
                            var2 *= -1728674753;
                            var2 ^= 842058658;
                        }

                        long var654 = var3;
                        long var707 = var654 + 1L;
                        var707 = var654 * var707;
                        var654 = var707 & 1L;
                        long var784;
                        var10 = (var784 = var654 - 0L) == 0L ? 0 : (var784 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            break label519;
                        }

                        var10 = var9 + 1;
                        var397 = var545;
                        var654 = var4;
                        var707 = var654 + 1L;
                        var707 = var654 * var707;
                        long var745 = var654 + 2L;
                        var707 *= var745;
                        var654 += 3L;
                        var707 *= var654;
                        var654 = var707 & 7L;
                        long var785;
                        var539 = (var785 = var654 - 0L) == 0L ? 0 : (var785 < 0L ? -1 : 1);
                        if (var539 != 0) {
                            var2 &= -1628207474;
                            var2 ^= -737547131;
                            break;
                        }

                        var2 >>>= 21;
                        var2 += 1741945629;
                        var2 ^= -761670288;
                        var8 = var612;
                        var9 = var10;
                        var2 &= -724267330;
                        var2 |= -565294921;
                        var2 <<= 6;
                        var2 -= -1166628232;
                        var2 ^= 128455207;
                    }
                } else {
                    var2 ^= 853259114;
                    var2 &= -2121691228;
                    var2 |= -2131899835;
                    var2 ^= -1061707290;
                }

                var2 = var3 + 1;
                var2 = var3 * var2;
                var4 = var3 + 2;
                var2 *= var4;
                var3 += 3;
                var2 *= var3;
                var2 &= 7;
                if (var2 == 0) {
                    IllegalArgumentException var357 = new IllegalArgumentException();
                    throw var357;
                }
                break label519;
            }

            int var366 = var3 + 1;
            var366 = var3 * var366;
            int var380 = var3 + 2;
            var366 *= var380;
            var380 = var3 + 3;
            var366 *= var380;
            var366 &= 7;
            if (var366 == 0) {
                return 0;
            }
        }

        UnsupportedOperationException var361 = new UnsupportedOperationException();
        throw var361;
    }

    private static void J(int var0, float[] var1, int var2) {
        int var6 = var0 >> 16;
        Integer var5 = var0;
        if (var5 == null) {
            int var24 = var2 - -1009441728;
            var24 |= -769447695;
            var24 |= -228846489;
            var24 ^= -842089789;
            Integer var4 = var0;
            if (var4 == null) {
                RuntimeException var29 = new RuntimeException();
                throw var29;
            } else {
                AssertionError var28 = new AssertionError();
                throw var28;
            }
        } else {
            int var3 = var2 - 378090109;
            var3 ^= 1633684851;
            var3 ^= -1544225904;
            var3 |= 1521009832;
            var3 ^= -1299290066;
            var3 = var6 & 0xFF;
            float var12 = var3;
            float var13 = var12 / 255.0F;
            float var14 = ed.Ik(var13);
            var1[0] = var14;
            var3 = var0 >> 8;
            var3 &= 255;
            float var17 = var3;
            float var18 = var17 / 255.0F;
            float var19 = ed.Ik(var18);
            var1[1] = var19;
            var3 = var0 & 0xFF;
            float var21 = var3;
            float var22 = var21 / 255.0F;
            float var23 = ed.Ik(var22);
            var1[2] = var23;
            ed.u(var1);
        }
    }

    private static int Bx(float[] var0, int var1) {
        int var3 = System.identityHashCode(var0);
        float var4 = var0[2];
        double var25 = var4;
        float var6 = var0[1];
        double var27 = var6;
        double var26 = Math.atan2(var25, var27);
        long var28 = var3;
        long var8 = var28 + 1L;
        var8 = var28 * var8;
        long var10 = var28 + 2L;
        var8 *= var10;
        long var29 = var28 + 3L;
        var8 *= var29;
        long var30 = var8 & 7L;
        long var38;
        var3 = (var38 = var30 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var19 = var1 | 2125215418;
            var19 ^= -932830842;
            long var31 = var19;
            var8 = var31 + 1L;
            var8 = var31 * var8;
            long var32 = var8 & 1L;
            long var39;
            var3 = (var39 = var32 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var3 != 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            } else {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            int var2 = var1 ^ -650789573;
            var2 &= 717626808;
            var2 ^= -1640309425;
            double var14 = var26 + Math.PI;
            double var15 = var14 / (Math.PI * 2);
            double var16 = var15 * 24.0;
            double var17 = Math.floor(var16);
            var2 = (int)var17;
            return Math.floorMod(var2, 24);
        }
    }

    private static float bp(float var0, float var1, int var2) {
        label46: {
            int var4 = (int)var0;
            float var5 = var0 - 0.62F;
            var5 = Math.abs(var5);
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            int var16;
            if (var6 == 0) {
                var16 = var2 | -1094699932;
                var16 += -1142034168;
                var16 ^= 1031206786;
                var5 /= 0.5F;
                var5 = 1.0F - var5;
                float var48;
                var6 = (var48 = var5 - 0.0F) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                if (var6 <= 0) {
                    switch (var16) {
                        case -2034099466:
                            var16 &= 1514107560;
                            var16 -= 901024792;
                            var16 ^= 1139315566;
                            break;
                        case -60045401:
                        default:
                            var16 ^= -1700152412;
                            break;
                        case 1418215976:
                            var16 ^= -528870901;
                    }

                    return 0.0F;
                }

                var16 -= -362708954;
                var16 ^= -2069314204;
                long var40 = var16;
                long var8 = var40 + 1L;
                var8 = var40 * var8;
                long var10 = var40 + 2L;
                var8 *= var10;
                long var41 = var40 + 3L;
                var8 *= var41;
                long var42 = var8 & 7L;
                long var49;
                var6 = (var49 = var42 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var6 != 0) {
                    break label46;
                }

                float var44 = var1 * var1;
                Integer var33 = var4;
                if (var33 != null) {
                    var16 &= -286566939;
                    var16 ^= 474667871;
                    return var44 * var5;
                }

                switch (var16) {
                    case -807641477:
                    default:
                        var16 ^= 874027670;
                        break;
                    case 415784884:
                        var16 >>>= 4;
                        var16 &= -258009430;
                        var16 ^= -333040370;
                        break;
                    case 899011461:
                        var16 ^= 741183102;
                }
            } else {
                switch (var2) {
                    case 721548814:
                    default:
                        var16 = var2 ^ -1244607321;
                        break;
                    case 1034055733:
                        var16 = var2 ^ -931880974;
                        break;
                    case 1594285160:
                        var16 = var2 >>> 30;
                        var16 ^= -529619682;
                        var16 -= -1368828964;
                        var16 |= 1095742010;
                        var16 ^= -1612332321;
                }
            }

            Integer var30 = var16;
            if (var30 != null) {
                AssertionError var32 = new AssertionError();
                throw var32;
            }
        }

        IllegalStateException var31 = new IllegalStateException();
        throw var31;
    }

    private static boolean r(float[] var0, int var1) {
        label131: {
            int var49;
            label121: {
                int var3 = System.identityHashCode(var0);
                float[] var4 = var0;
                int var5 = var0.length;
                Integer var6 = var3;
                if (var6 != null) {
                    var49 = switch (var1) {
                        case 298152373 -> {
                            var49 = var1 & 979162332;
                            var49 ^= 1817396414;
                            yield var49 ^ -48558519;
                        }
                        case 469314088 -> var1 ^ 1747107982;
                        default -> var1 ^ 78842038;
                    };
                    var5 = var5;
                    byte var76 = 0;
                    int var77 = var76;

                    var49 = switch (var49) {
                        case -2129913245 -> {
                            var49 -= 1633988491;
                            var49 += -1150950079;
                            var49 &= -1938205057;
                            yield var49 ^ 578225089;
                        }
                        case -1818253199 -> var49 ^ -1275725537;
                        default -> var49 ^ 66173802;
                    };

                    label110:
                    while (true) {
                        int var7 = var49 + 1;
                        var7 = var49 * var7;
                        int var8 = var49 + 2;
                        var7 *= var8;
                        var8 = var49 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label131;
                        }

                        if (var77 >= var5) {
                            long var67 = switch (var49) {
                                case -1434561576 -> {
                                    var49 -= 503631814;
                                    var49 &= 70119230;
                                    yield var49 ^ 1479524498;
                                }
                                default -> var49 ^ -979670499;
                                case 638536078 -> var49 ^ -857402668;
                            };
                            long var72 = var67 + 1L;
                            long var73 = var67 * var72;
                            long var92 = var67 + 2L;
                            long var74 = var73 * var92;
                            long var68 = var67 + 3L;
                            long var75 = var74 * var68;
                            long var69 = var75 & 7L;
                            long var142;
                            var3 = (var142 = var69 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                return true;
                            }
                            break label131;
                        }

                        var49 ^= 2094289938;
                        var49 >>= 2;
                        var49 ^= 2134498186;
                        var7 = var49 + 1;
                        var7 = var49 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label131;
                        }

                        float var85 = var4[var77];
                        var8 = var3 + 1;
                        var8 = var3 * var8;
                        int var9 = var3 + 2;
                        var8 *= var9;
                        var9 = var3 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            var49 <<= 13;
                            var49 -= -223811947;
                            var49 -= 1668655976;
                            var49 += -1871766076;
                            var49 ^= 1846807060;
                            break;
                        }

                        var49 &= 219010739;
                        var49 *= -93525485;
                        var49 ^= 2058343661;
                        var8 = var49 + 1;
                        var8 = var49 * var8;
                        var9 = var49 + 2;
                        var8 *= var9;
                        var9 = var49 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label131;
                        }

                        float var136;
                        var8 = (var136 = var85 - -0.002F) == 0.0F ? 0 : (var136 < 0.0F ? -1 : 1);
                        if (var8 < 0) {
                            var49 ^= 1574315554;
                            var49 ^= 1370868533;
                            var49 ^= -313392340;
                            break label121;
                        }

                        var49 -= -1790965279;
                        var49 += -1904711750;
                        var49 -= 1869721223;
                        var49 ^= 1563031103;
                        long var105 = var49;
                        long var10 = var105 + 1L;
                        var10 = var105 * var10;
                        long var12 = var105 + 2L;
                        var10 *= var12;
                        long var106 = var105 + 3L;
                        var10 *= var106;
                        long var107 = var10 & 7L;
                        long var137;
                        var8 = (var137 = var107 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label131;
                        }

                        float var138;
                        var7 = (var138 = var85 - 1.002F) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
                        long var109 = var3;
                        var10 = var109 + 1L;
                        var10 = var109 * var10;
                        var12 = var109 + 2L;
                        var10 *= var12;
                        long var110 = var109 + 3L;
                        var10 *= var110;
                        long var111 = var10 & 7L;
                        long var139;
                        var8 = (var139 = var111 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            switch (var49) {
                                case -1540769992:
                                default:
                                    var49 ^= 444364172;
                                    break label110;
                                case -256627984:
                                    var49 -= 401010873;
                                    var49 >>= 21;
                                    var49 += -2083422981;
                                    var49 &= -981466563;
                                    var49 ^= 1242268626;
                                    break label110;
                                case -162659547:
                                    var49 ^= -861272803;
                                    break label110;
                            }
                        }

                        var49 |= 705639086;
                        var49 ^= 256032493;
                        long var113 = var49;
                        var10 = var113 + 1L;
                        var10 = var113 * var10;
                        long var114 = var10 & 1L;
                        long var140;
                        var8 = (var140 = var114 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label131;
                        }

                        if (var7 > 0) {
                            var49 -= 1828005203;
                            var49 >>= 15;
                            var49 ^= 1025102166;
                            break label121;
                        }

                        var49 ^= 1753185693;
                        var49 &= -994851148;
                        var49 ^= 776246938;
                        long var87 = var49;
                        long var122 = var87 + 1L;
                        long var123 = var87 * var122;
                        long var11 = var87 + 2L;
                        long var124 = var123 * var11;
                        long var88 = var87 + 3L;
                        long var125 = var124 * var88;
                        long var89 = var125 & 7L;
                        long var141;
                        var7 = (var141 = var89 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label131;
                        }

                        var7 = var77 + 1;
                        var8 = var3 + 1;
                        var8 = var3 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            var49 |= -419465534;
                            var49 ^= 628422413;
                            break;
                        }

                        var49 |= -1463206684;
                        var49 *= -407417289;
                        var49 ^= -1549326360;
                        var77 = var7;
                        var49 += 1180833873;
                        var49 &= -1351864168;
                        var49 ^= -794102926;
                        var49 ^= -141262814;
                    }
                } else {
                    switch (var1) {
                        case 110558826:
                            var49 = var1 ^ 1547176445;
                            break;
                        case 298152373:
                            var49 = var1 & -1923383605;
                            var49 *= 1732779795;
                            var49 ^= -30601395;
                            var49 *= 1714896459;
                            var49 ^= -7543847;
                            break;
                        case 1440364048:
                        default:
                            var49 = var1 ^ 633901240;
                    }
                }

                Integer var60 = var49;
                if (var60 != null) {
                    RuntimeException var61 = new RuntimeException();
                    throw var61;
                }
                break label131;
            }

            Integer var66 = var49;
            if (var66 != null) {
                return false;
            }
        }

        IllegalArgumentException var65 = new IllegalArgumentException();
        throw var65;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1165885029;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        c = var4;
    }
}
