package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class ed {
    public static final int M;

    private ed() {
    }

    public static float[] I(int var0) {
        int var1 = M;
        var1 ^= 308571704;
        float[] var4 = new float[3];
        int var5 = DP.QN(var0);
        float var32 = var5;
        float var33 = var32 / 255.0F;
        float var34 = Ik(var33);
        var4[0] = var34;
        var5 = DP.W(var0);
        int var6 = var0 + 1;
        var6 = var0 * var6;
        int var3 = var6 & 1;
        if (var3 != 0) {
            switch (var1) {
                case -1490485584:
                    var1 ^= -129079002;
                    break;
                case -387697419:
                default:
                    var1 ^= -1539188225;
                    break;
                case 1362602443:
                    var1 <<= 6;
                    var1 <<= 23;
                    var1 |= 1365288529;
                    var1 |= 1380396345;
                    var1 ^= -1168850131;
            }

            var3 = var0 + 1;
            var3 = var0 * var3;
            var3 &= 1;
            if (var3 == 0) {
                UnsupportedOperationException var31 = new UnsupportedOperationException();
                throw var31;
            }
        } else {
            var1 >>= 29;
            var1 >>= 22;
            var1 += 414210387;
            var1 ^= 52216480;
            Integer var19 = var0;
            if (var19 != null) {
                float var21 = var5;
                float var22 = var21 / 255.0F;
                float var23 = Ik(var22);
                var4[1] = var23;
                int var24 = DP.Of(var0);
                float var25 = var24;
                float var26 = var25 / 255.0F;
                float var27 = Ik(var26);
                var4[2] = var27;
                u(var4);
                return var4;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public static int Yn(float var0, float var1, float var2) {
        int var3 = M;
        var3 ^= 2022584412;
        int var4 = (int)var0;
        float[] var5 = new float[]{var0, var1, var2};
        N(var5);
        float var6 = var5[0];
        var6 = v(var6);
        float var7 = var5[1];
        var7 = v(var7);
        float var25 = var5[2];
        float var26 = v(var25);
        Integer var23 = var4;
        if (var23 == null) {
            switch (var3) {
                case -793410975:
                    var3 ^= 842624968;
                    break;
                case -45110692:
                default:
                    var3 ^= 781089112;
                    break;
                case 1004402607:
                    var3 += -589063688;
                    var3 += 1374479174;
                    var3 &= -317349856;
                    var3 |= -2121643713;
                    var3 ^= 806741458;
            }

            AssertionError var24 = new AssertionError();
            throw var24;
        } else {
            Integer var14 = switch (var3) {
                default -> var3 ^ -424241280;
                case 1004402607 -> {
                    var3 >>= 9;
                    var3 *= -1529843203;
                    var3 -= -180436997;
                    var3 &= 547296196;
                    yield var3 ^ 487655550;
                }
                case 1877142935 -> var3 ^ -6747074;
            };
            if (var14 != null) {
                return DP.J(1.0F, var6, var7, var26);
            } else {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }
    }

    public static void u(float[] var0) {
        int var1 = M;
        var1 ^= -1813216725;
        int var2 = System.identityHashCode(var0);
        float var3 = var0[0];
        var3 = 0.41222146F * var3;
        float var4 = var0[1];
        var4 = 0.53633255F * var4;
        var3 += var4;
        var4 = var0[2];
        var4 = 0.051445995F * var4;
        var3 += var4;
        double var26 = var3;
        Integer var16 = var2;
        if (var16 != null) {
            var1 <<= 13;
            var1 ^= -1485404066;
            var1 ^= 983535637;
            var16 = var1;
            if (var16 != null) {
                double var18 = Math.cbrt(var26);
                float var19 = (float)var18;
                var3 = var0[0];
                var3 = 0.2119035F * var3;
                var4 = var0[1];
                var4 = 0.6806995F * var4;
                var3 += var4;
                var4 = var0[2];
                var4 = 0.10739696F * var4;
                var3 += var4;
                double var31 = var3;
                double var32 = Math.cbrt(var31);
                var3 = (float)var32;
                var4 = var0[0];
                var4 = 0.08830246F * var4;
                float var5 = var0[1];
                var5 = 0.28171885F * var5;
                var4 += var5;
                var5 = var0[2];
                var5 = 0.6299787F * var5;
                var4 += var5;
                double var47 = var4;
                double var48 = Math.cbrt(var47);
                var4 = (float)var48;
                var5 = 0.21045426F * var19;
                float var6 = 0.7936178F * var3;
                var5 += var6;
                var6 = 0.004072047F * var4;
                var5 -= var6;
                var0[0] = var5;
                var5 = 1.9779985F * var19;
                var6 = 2.4285922F * var3;
                var5 -= var6;
                var6 = 0.4505937F * var4;
                var5 += var6;
                var0[1] = var5;
                float var20 = 0.025904037F * var19;
                var3 = 0.78277177F * var3;
                float var21 = var20 + var3;
                var3 = 0.80867577F * var4;
                float var22 = var21 - var3;
                var0[2] = var22;
                return;
            }
        } else {
            var1 >>>= 14;
            var1 ^= -83306642;
            Integer var13 = var1;
            if (var13 != null) {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    public static void N(float[] var0) {
        int var1 = M;
        var1 ^= 573639778;
        int var2 = System.identityHashCode(var0);
        float var3 = var0[0];
        float var4 = var0[1];
        var4 = 0.39633778F * var4;
        var3 += var4;
        var4 = var0[2];
        var4 = 0.21580376F * var4;
        var3 += var4;
        var4 = var0[0];
        float var5 = var0[1];
        var5 = 0.105561346F * var5;
        var4 -= var5;
        var5 = var0[2];
        var5 = 0.06385417F * var5;
        var4 -= var5;
        var5 = var0[0];
        float var6 = var0[1];
        var6 = 0.08948418F * var6;
        var5 -= var6;
        var6 = var0[2];
        var6 = 1.2914855F * var6;
        var5 -= var6;
        var6 = var3 * var3;
        var6 *= var3;
        var6 = var4 * var4;
        var6 *= var4;
        var6 = var5 * var5;
        var6 *= var5;
        long var7 = var2;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var87;
        var2 = (var87 = var7 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
        int var82 = of_2.l;
        var1 ^= var82;
        var1 ^= 1720137465;
        int var83 = of_2.W;
        var1 ^= var83;
        var1 ^= 1105749463;
        if (var2 == 0) {
            switch (var1) {
                case 1633864593:
                    var1 += -2061180264;
                    var1 += 1969257467;
                    var1 ^= 317427471;
                    var1 ^= -613630558;
                    break;
                case 1734483677:
                default:
                    var1 ^= -1821735752;
                    break;
                case 1868153304:
                    var1 ^= -639890402;
            }

            float var38 = 4.0767417F * var6;
            float var76 = 3.3077116F * var6;
            float var39 = var38 - var76;
            float var77 = 0.23096994F * var6;
            float var40 = var39 + var77;
            var0[0] = var40;
            float var41 = -1.268438F * var6;
            float var78 = 2.6097574F * var6;
            float var42 = var41 + var78;
            float var79 = 0.34131938F * var6;
            float var43 = var42 - var79;
            var0[1] = var43;
            float var44 = -0.0041960864F * var6;
            var3 = 0.7034186F * var6;
            float var45 = var44 - var3;
            var3 = 1.7076147F * var6;
            float var46 = var45 + var3;
            var0[2] = var46;
        } else {
            var1 += -668792631;
            var1 >>= 22;
            var1 |= -1995630528;
            var1 ^= 1360624505;
            var1 ^= 762480263;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var50 = var1 + 2;
            var2 *= var50;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                AssertionError var26 = new AssertionError();
                throw var26;
            } else {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        }
    }

    public static float Ik(float var0) {
        label68: {
            int var1 = M;
            var1 ^= 423017938;
            int var2 = (int)var0;
            Integer var3 = var2;
            int var4 = of_2.l;
            var1 ^= var4;
            var1 ^= 1720137465;
            of_2.l = 1720137465;
            var4 = of_2.W;
            var1 ^= var4;
            var1 ^= 1105749463;
            of_2.W = 1105749463;
            if (var3 != null) {
                var1 = switch (var1) {
                    default -> var1 ^ 1191844853;
                    case 1189278422 -> var1 ^ 538878052;
                    case 1516599841 -> {
                        var1 >>>= 17;
                        var1 ^= 31485705;
                        var1 >>= 6;
                        yield var1 ^ 1124627710;
                    }
                };
                float var96;
                int var58 = (var96 = var0 - 0.04045F) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
                if (var58 <= 0) {
                    var1 ^= -403148627;
                    var1 *= 1030789447;
                    var1 += -737224418;
                    var1 ^= -590755923;
                    long var59 = var1;
                    long var5 = var59 + 1L;
                    var5 = var59 * var5;
                    long var7 = var59 + 2L;
                    var5 *= var7;
                    long var60 = var59 + 3L;
                    var5 *= var60;
                    long var61 = var5 & 7L;
                    long var97;
                    var58 = (var97 = var61 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                    if (var58 != 0) {
                        break label68;
                    }

                    float var63 = var0 / 12.92F;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    var4 &= 1;
                    if (var4 == 0) {
                        var1 &= -892499987;
                        var1 >>= 26;
                        var1 ^= -121449999;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        int var87 = var1 + 2;
                        var4 *= var87;
                        int var88 = var1 + 3;
                        var4 *= var88;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label68;
                        }

                        switch (var1) {
                            case -121450015:
                                var1 += 1159688518;
                                var1 ^= 1637393371;
                                return var63;
                            case 1386802439:
                                var1 ^= 843268870;
                                return var63;
                            case 1673154335:
                            default:
                                var1 ^= 175889855;
                                return var63;
                        }
                    }

                    var1 &= -738882512;
                    var1 -= -2068682221;
                    var1 ^= -1783862358;
                } else {
                    var1 *= -587381213;
                    var1 += -1401748703;
                    var1 ^= -250359287;
                    long var78 = var1;
                    long var6 = var78 + 1L;
                    var6 = var78 * var6;
                    long var79 = var6 & 1L;
                    long var98;
                    var4 = (var98 = var79 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label68;
                    }

                    float var81 = var0 + 0.055F;
                    int var89 = var2 + 1;
                    var89 = var2 * var89;
                    int var95 = var2 + 2;
                    var89 *= var95;
                    var2 += 3;
                    var89 *= var2;
                    var2 = var89 & 7;
                    if (var2 == 0) {
                        var1 = switch (var1) {
                            case -534182325 -> var1 ^ -1651800322;
                            default -> var1 ^ 611684654;
                            case 1075000778 -> {
                                var1 *= -400816261;
                                var1 += -642448986;
                                var1 ^= -1692359707;
                                var1 &= 279758061;
                                yield var1 ^ -14020439;
                            }
                        };
                        float var56 = var81 / 1.055F;
                        double var82 = var56;
                        double var83 = Math.pow(var82, 2.4F);
                        float var57 = (float)var83;
                        switch (var1) {
                            case -1009617762:
                            default:
                                var1 ^= -215128834;
                                return var57;
                            case -7678744:
                                var1 ^= -1202510290;
                                var1 ^= 463671866;
                                return var57;
                            case 326717479:
                                var1 ^= -478021623;
                                return var57;
                        }
                    }

                    var1 ^= 1991369067;
                    var1 -= 2124011072;
                    var1 &= -551583761;
                    var1 ^= -1013237802;
                }
            } else {
                var1 -= -101458492;
                var1 ^= 1004721642;
            }

            long var48 = var1;
            long var65 = var48 + 1L;
            long var66 = var48 * var65;
            long var93 = var48 + 2L;
            long var67 = var66 * var93;
            long var49 = var48 + 3L;
            long var68 = var67 * var49;
            long var50 = var68 & 7L;
            long var99;
            var1 = (var99 = var50 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var53 = new UnsupportedOperationException();
                throw var53;
            }
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    public static float v(float var0) {
        label113: {
            int var48;
            float var93;
            label112: {
                var48 = M;
                var48 ^= 63509655;
                int var2 = (int)var0;
                long var3 = var2;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                long var7 = var3 + 2L;
                var5 *= var7;
                long var80 = var3 + 3L;
                var5 *= var80;
                long var81 = var5 & 7L;
                long var144;
                int var82 = (var144 = var81 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                if (var82 == 0) {
                    var48 = switch (var48) {
                        case -1472862645 -> var48 ^ 1142361921;
                        default -> var48 ^ -1200209239;
                        case 1083888484 -> {
                            var48 >>>= 1;
                            var48 >>>= 7;
                            yield var48 ^ 1200694376;
                        }
                    };
                    Integer var83 = var48;
                    if (var83 == null) {
                        break label113;
                    }

                    float var145;
                    int var84 = (var145 = var0 - 0.0F) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                    if (var84 <= 0) {
                        var48 *= 1651768465;
                        var48 += -997029570;
                        var48 ^= 151206427;
                        long var95 = var48;
                        var5 = var95 + 1L;
                        var5 = var95 * var5;
                        long var96 = var5 & 1L;
                        long var154;
                        int var97 = (var154 = var96 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                        if (var97 == 0) {
                            return 0.0F;
                        }
                        break label113;
                    }

                    var48 |= -512594864;
                    var48 ^= 949600810;
                    Integer var85 = var48;
                    if (var85 == null) {
                        break label113;
                    }

                    float var146;
                    int var86 = (var146 = var0 - 1.0F) == 0.0F ? 0 : (var146 < 0.0F ? -1 : 1);
                    int var4 = var2 + 1;
                    var4 = var2 * var4;
                    int var124 = var2 + 2;
                    var4 *= var124;
                    int var125 = var2 + 3;
                    var4 *= var125;
                    var4 &= 7;
                    if (var4 != 0) {
                        switch (var48) {
                            case -546685743:
                                var48 *= 1586899763;
                                var48 += 1090984405;
                                var48 ^= 1584998293;
                                break;
                            case 1110287713:
                                var48 ^= 1094500061;
                                break;
                            case 1876167448:
                            default:
                                var48 ^= 352478557;
                        }
                    } else {
                        var48 <<= 17;
                        var48 *= -1099035939;
                        var48 *= 1587644095;
                        var48 ^= 147303565;
                        var4 = var48 + 1;
                        var4 = var48 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label113;
                        }

                        if (var86 >= 0) {
                            var48 += 1122377269;
                            var48 *= -843620723;
                            var48 ^= -987368936;
                            Integer var94 = var48;
                            if (var94 != null) {
                                return 1.0F;
                            }
                            break label113;
                        }

                        var48 ^= -182475033;
                        var48 <<= 31;
                        var48 ^= 69523247;
                        long var87 = var48;
                        var5 = var87 + 1L;
                        var5 = var87 * var5;
                        var7 = var87 + 2L;
                        var5 *= var7;
                        long var88 = var87 + 3L;
                        var5 *= var88;
                        long var89 = var5 & 7L;
                        long var147;
                        int var90 = (var147 = var89 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            break label113;
                        }

                        float var148;
                        int var91 = (var148 = var0 - 0.0031308F) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
                        long var107 = var2;
                        long var6 = var107 + 1L;
                        var6 = var107 * var6;
                        long var108 = var6 & 1L;
                        long var149;
                        var4 = (var149 = var108 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            switch (var48) {
                                case -2051621429:
                                default:
                                    var48 ^= -229833877;
                                    break;
                                case 69523247:
                                    var48 -= 58836525;
                                    var48 >>= 16;
                                    var48 *= 860196433;
                                    var48 ^= 15657086;
                                    break;
                                case 1163163636:
                                    var48 ^= 1531728812;
                            }
                        } else {
                            var48 -= -208803957;
                            var48 &= -2140743501;
                            var48 -= 1678338391;
                            var48 ^= 942172603;
                            Integer var110 = var48;
                            if (var110 == null) {
                                break label113;
                            }

                            if (var91 <= 0) {
                                var48 *= -1527530153;
                                var48 += 1363319414;
                                var48 *= 1008873925;
                                var48 ^= 596743640;
                                var93 = var0 * 12.92F;
                                int var111 = var2 + 1;
                                var111 = var2 * var111;
                                var111 &= 1;
                                if (var111 == 0) {
                                    var48 -= 1619427511;
                                    var48 -= 288727859;
                                    var48 -= 1465183234;
                                    var48 ^= -4802303;
                                    long var114 = var48;
                                    var6 = var114 + 1L;
                                    var6 = var114 * var6;
                                    long var115 = var6 & 1L;
                                    long var150;
                                    var111 = (var150 = var115 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                                    if (var111 != 0) {
                                        break label113;
                                    }

                                    var93 = var93;
                                    var48 *= 1385106763;
                                    var48 ^= -256305434;
                                    break label112;
                                }

                                var48 -= -385804766;
                                var48 += -496159756;
                                var48 += 1764313032;
                                var48 &= -1723111234;
                                var48 ^= -1393666725;
                            } else {
                                var48 &= 1076540142;
                                var48 &= -790258216;
                                var48 |= -1495228089;
                                var48 ^= -614553054;
                                double var117 = var0;
                                double var118 = Math.pow(var117, 0.41666666F);
                                Integer var74 = var2;
                                if (var74 != null) {
                                    var48 += 1252656744;
                                    var48 &= 1475161393;
                                    var48 *= -1876993339;
                                    var48 ^= 1495825048;
                                    var6 = var48;
                                    long var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    long var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var151;
                                    int var75 = (var151 = var6 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                                    if (var75 != 0) {
                                        break label113;
                                    }

                                    float var76 = (float)var118;
                                    float var77 = 1.055F * var76;
                                    float var78 = var77 - 0.055F;
                                    var93 = var78;
                                    var48 *= -1721210523;
                                    var48 += 662002016;
                                    var48 += -542496112;
                                    var48 *= -98714087;
                                    var48 ^= 1152426052;
                                    break label112;
                                }

                                var48 += -1083096952;
                                var48 ^= -1735906944;
                            }
                        }
                    }
                } else {
                    var48 |= -1213201264;
                    var48 ^= 1377673753;
                }

                long var69 = var48;
                long var98 = var69 + 1L;
                long var99 = var69 * var98;
                long var70 = var99 & 1L;
                long var152;
                var48 = (var152 = var70 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                if (var48 == 0) {
                    AssertionError var73 = new AssertionError();
                    throw var73;
                }
                break label113;
            }

            long var119 = var48;
            long var138 = var119 + 1L;
            var138 = var119 * var138;
            var119 = var138 & 1L;
            long var153;
            int var79 = (var153 = var119 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
            if (var79 == 0) {
                return var93;
            }
        }

        IllegalStateException var72 = new IllegalStateException();
        throw var72;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -99686338;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        M = var4;
    }
}
