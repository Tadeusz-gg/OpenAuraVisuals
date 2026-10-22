package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class yt extends vS_2 {
    private static final int b = -12714100;
    private static final int ar = -50373;
    private static final float[] a;
    private static final float[] xk;
    private static final String[] z;
    private static final float pJ = 2.9F;
    private static final float C = 2.45F;
    private static final float N = 1.0F;
    private static final float Dq = 14.0F;
    private static final float Fd = 3.6F;
    private String q = "";
    private float[] xD;
    public static final int bD;

    public yt() {
        float[] var1 = new float[0];
        this.xD = var1;
    }

    @Override
    public float w() {
        int var1 = System.identityHashCode(this);
        return 3.3F;
    }

    @Override
    public float Vb() {
        int var1 = System.identityHashCode(this);
        return 4.6F;
    }

    @Override
    public String K() {
        int var1 = System.identityHashCode(this);
        return "death_flatline";
    }

    @Override
    public void N(XK var1) {
        int var2 = bD;
        var2 ^= -771701173;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 == 0) {
            var2 >>= 6;
            var2 >>>= 15;
            var2 *= -1623436949;
            var2 ^= 1775467082;
            String var16 = var1.W;
            String var17 = "TIME OF DEATH  " + var16;
            this.q = var17;
        } else {
            var2 += 766104701;
            var2 |= -1066964416;
            var2 ^= 1996016577;
            var2 ^= -1114017936;
            IllegalArgumentException var10 = new IllegalArgumentException();
            throw var10;
        }
    }

    public static float dE(float var0) {
        int var1 = bD;
        var1 ^= -1712326171;
        int var2 = (int)var0;
        float var3 = var0 + 0.17F;
        int var4 = var1 * -1962253031;
        var4 -= 740036758;
        var4 -= 1174109165;
        var4 &= 1685448265;
        var4 ^= -1764999038;
        var3 = pn(var3, 0.028F, var4);
        var3 = 0.11F * var3;
        float var38 = var0 + 0.028F;
        int var5 = var1 + -1856157213;
        var5 -= 231139851;
        var5 &= 1890033952;
        var5 ^= -950981439;
        var5 ^= 625946218;
        float var39 = pn(var38, 0.009F, var5);
        float var40 = 0.1F * var39;
        var3 -= var40;
        var4 = var1 | 1431854391;
        var4 ^= 650764886;
        var4 ^= -920018966;
        float var44 = pn(var0, 0.011F, var4);
        var3 += var44;
        var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 != 0) {
            switch (var1) {
                case -398055835:
                default:
                    var1 ^= 2123931324;
                    break;
                case 1421516870:
                    var1 ^= 185738726;
                    break;
                case 1548751634:
                    var1 += 1193854621;
                    var1 ^= 1786215614;
                    var1 ^= -1296674563;
            }

            UnsupportedOperationException var28 = new UnsupportedOperationException();
            throw var28;
        } else {
            var1 &= 2145824410;
            var1 ^= 465408394;
            long var47 = var1;
            long var6 = var47 + 1L;
            var6 = var47 * var6;
            long var48 = var6 & 1L;
            long var57;
            var2 = (var57 = var48 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
            if (var2 != 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            } else {
                float var23 = var0 - 0.03F;
                var4 = var1 ^ 2019891669;
                var4 += -1315586232;
                var4 ^= 1133931294;
                float var24 = pn(var23, 0.011F, var4);
                float var25 = 0.26F * var24;
                float var26 = var3 - var25;
                var3 = var0 - 0.23F;
                var1 &= 1578367824;
                var1 += 615289278;
                var1 ^= -670693819;
                float var14 = pn(var3, 0.05F, var1);
                float var15 = 0.2F * var14;
                return var26 + var15;
            }
        }
    }

    private static float pn(float var0, float var1, int var2) {
        int var4 = (int)var0;
        float var5 = var0 * var0;
        var5 = -var5;
        float var6 = 2.0F * var1;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        var4 = var7 & 1;
        if (var4 == 0) {
            int var10 = var2 ^ -909620525;
            var10 <<= 3;
            var10 ^= -133778740;
            float var14 = var6 * var1;
            float var15 = var5 / var14;
            double var16 = var15;
            double var17 = Math.exp(var16);
            return (float)var17;
        } else {
            int var3 = var2 * -1142870461;
            var3 ^= 1956652224;
            IllegalArgumentException var9 = new IllegalArgumentException();
            throw var9;
        }
    }

    public static float Zk(float var0) {
        label111: {
            int var1 = bD;
            var1 ^= 1993109109;
            int var2 = (int)var0;
            Integer var3 = var2;
            int var4 = of_2.Tk;
            var1 ^= var4;
            var1 ^= 475706417;
            of_2.Tk = 475706417;
            var4 = of_2.FW;
            var1 ^= var4;
            var1 ^= -673612338;
            of_2.FW = -673612338;
            if (var3 == null) {
                var1 *= -1622227939;
                var1 ^= 729669269;
            } else {
                var1 = switch (var1) {
                    case -1284275070 -> {
                        var1 |= -694930760;
                        yield var1 ^ -668259545;
                    }
                    default -> var1 ^ -530065659;
                    case -310515746 -> var1 ^ -553682154;
                };
                long var91 = var1;
                long var5 = var91 + 1L;
                var5 = var91 * var5;
                long var92 = var5 & 1L;
                long var162;
                int var93 = (var162 = var92 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                if (var93 != 0) {
                    break label111;
                }

                float var94 = 0.0F;
                int var97 = 0;
                float var95 = var94;
                var97 = var97;
                var1 ^= -1538540151;
                var1 ^= 2141769314;

                label108:
                while (true) {
                    int var100 = var1 + 1;
                    int var101 = var1 * var100;
                    int var6 = var1 + 2;
                    int var102 = var101 * var6;
                    var6 = var1 + 3;
                    int var103 = var102 * var6;
                    int var104 = var103 & 7;
                    if (var104 != 0) {
                        break label111;
                    }

                    float[] var105 = a;
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    int var7 = var2 + 2;
                    var6 *= var7;
                    var7 = var2 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        var1 >>>= 29;
                        var1 ^= -933735384;
                        break;
                    }

                    var1 += -315402363;
                    var1 ^= 2009155478;
                    long var123 = var1;
                    long var8 = var123 + 1L;
                    var8 = var123 * var8;
                    long var10 = var123 + 2L;
                    var8 *= var10;
                    long var124 = var123 + 3L;
                    var8 *= var124;
                    long var125 = var8 & 7L;
                    long var163;
                    var6 = (var163 = var125 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label111;
                    }

                    int var106 = var105.length;
                    if (var97 >= var106) {
                        var1 *= 834992963;
                        var1 ^= -1687792606;
                        return var95;
                    }

                    var1 |= 1660117831;
                    var1 <<= 14;
                    var1 ^= 1218037204;
                    int var107 = var1 + 1;
                    int var108 = var1 * var107;
                    int var109 = var108 & 1;
                    if (var109 != 0) {
                        break label111;
                    }

                    float[] var110 = a;
                    Integer var127 = var2;
                    if (var127 == null) {
                        switch (var1) {
                            case -1874721324:
                                var1 |= 987379875;
                                var1 += 78057829;
                                var1 += -917665825;
                                var1 ^= 1083605780;
                                break label108;
                            case -1703962626:
                            default:
                                var1 ^= 1431351699;
                                break label108;
                            case -576659931:
                                var1 ^= -1413967844;
                                break label108;
                        }
                    }

                    var1 |= -207988884;
                    var1 += -1152722213;
                    var1 ^= -724489517;
                    var1 ^= -1151490331;
                    float var111 = var110[var97];
                    float var112 = var0 - var111;
                    float var164;
                    int var128 = (var164 = var112 - -0.4F) == 0.0F ? 0 : (var164 < 0.0F ? -1 : 1);
                    float var116;
                    if (var128 > 0) {
                        var1 = switch (var1) {
                            case -1745867542 -> var1 ^ 573229168;
                            case -1062617375 -> {
                                var1 -= -1793615059;
                                var1 += 107453139;
                                var1 |= -1364088310;
                                yield var1 ^ -1136415720;
                            }
                            default -> var1 ^ 1111423655;
                        };
                        var128 = var1 + 1;
                        var128 = var1 * var128;
                        var128 &= 1;
                        if (var128 != 0) {
                            break label111;
                        }

                        float var165;
                        var128 = (var165 = var112 - 0.5F) == 0.0F ? 0 : (var165 < 0.0F ? -1 : 1);
                        long var142 = var2;
                        long var9 = var142 + 1L;
                        var9 = var142 * var9;
                        long var11 = var142 + 2L;
                        var9 *= var11;
                        long var143 = var142 + 3L;
                        var9 *= var143;
                        long var144 = var9 & 7L;
                        long var166;
                        var7 = (var166 = var144 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var1 -= 1564608515;
                            var1 ^= 1847615163;
                            break;
                        }

                        var1 ^= 55404444;
                        var1 &= -900531732;
                        var1 ^= -128388230;
                        var1 ^= -1881434191;
                        if (var128 < 0) {
                            var1 += -2059954828;
                            var1 ^= 1701878845;
                            var1 <<= 1;
                            var1 ^= -1749732834;
                            var1 ^= -1878938794;
                            float[] var133 = xk;
                            float var134 = var133[var97];
                            float var113 = dE(var112);
                            long var146 = var2;
                            var9 = var146 + 1L;
                            var9 = var146 * var9;
                            long var147 = var9 & 1L;
                            long var167;
                            var7 = (var167 = var147 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                var1 ^= -2096232038;
                                var1 |= 1968371963;
                                var1 |= -1749164060;
                                var1 &= 457519892;
                                var1 ^= -618830021;
                                break;
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ 1674688855;
                                case 927266652 -> {
                                    var1 >>= 12;
                                    yield var1 ^ -1939367355;
                                }
                                case 1725445422 -> var1 ^ -530943632;
                            };
                            float var114 = var134 * var113;
                            float var115 = var95 + var114;
                            var116 = var115;
                            var1 *= 705233919;
                            var1 |= -373746979;
                            var1 -= -247440660;
                            var1 &= 2050216384;
                            var1 ^= 1713871073;
                        } else {
                            var1 &= 545642148;
                            var1 ^= -1366333446;
                            var116 = var95;
                            var1 ^= -1048446758;
                            var1 ^= 1368969793;
                        }
                    } else {
                        var1 <<= 7;
                        var1 -= -1668271934;
                        var1 ^= 173246025;
                        var116 = var95;
                        var1 -= 1715292873;
                        var1 ^= 1439184591;
                    }

                    var128 = var1 + 1;
                    var128 = var1 * var128;
                    var7 = var1 + 2;
                    var128 *= var7;
                    var7 = var1 + 3;
                    var128 *= var7;
                    var128 &= 7;
                    if (var128 != 0) {
                        break label111;
                    }

                    var128 = var97 + 1;
                    var7 = var2 + 1;
                    var7 = var2 * var7;
                    var7 &= 1;
                    if (var7 != 0) {
                        var1 -= 1180693519;
                        var1 >>>= 11;
                        var1 *= -1695933659;
                        var1 *= 1708500339;
                        var1 ^= 388284603;
                        break;
                    }

                    var1 -= -1691254778;
                    var1 *= 1539344093;
                    var1 >>= 27;
                    var1 -= 1481221174;
                    var1 ^= -799368038;
                    var95 = var116;
                    var97 = var128;
                    var1 &= -695594057;
                    var1 += -281821306;
                    var1 ^= -1316737839;
                }
            }

            UnsupportedOperationException var90 = new UnsupportedOperationException();
            throw var90;
        }

        AssertionError var89 = new AssertionError();
        throw var89;
    }

    private static float xY(float var0, int var1) {
        int var3 = (int)var0;
        Integer var12 = var3;
        if (var12 == null) {
            int var7 = var1 * -1112768407;
            var7 ^= -401657965;
            var7 *= -1211172131;
            var7 += -470372610;
            var7 ^= 1646987504;
            int var13 = var7 + 1;
            var13 = var7 * var13;
            int var4 = var7 + 2;
            var13 *= var4;
            var4 = var7 + 3;
            var13 *= var4;
            var13 &= 7;
            if (var13 != 0) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            int var2 = var1 & -1778777748;
            var2 -= 1274602231;
            var2 ^= -720957012;
            return qB(var0, 2.45F, 0.5F);
        }
    }

    @Override
    public void l(ScreenEffects var1, XK var2) {
        label126: {
            int var3 = bD;
            var3 ^= -1033227537;
            int var4 = System.identityHashCode(this);
            float var5 = var2.mz;
            float var6 = var2.i;
            var5 *= var6;
            int var113 = var4 + 1;
            int var114 = var4 * var113;
            int var115 = var114 & 1;
            if (var115 == 0) {
                var3 -= -890314511;
                var3 ^= 1507887910;
                var3 += 2059857915;
                var3 |= -503368421;
                var3 ^= -955611200;
                float var211;
                int var116 = (var211 = var5 - 0.0F) == 0.0F ? 0 : (var211 < 0.0F ? -1 : 1);
                if (var116 <= 0) {
                    var3 >>= 26;
                    var3 ^= -770799313;
                    return;
                }
                var3 = switch (var3) {
                    default -> var3 ^ 509575501;
                    case -735129083 -> var3 ^ -901676692;
                    case 955643967 -> {
                        var3 &= 1136673313;
                        var3 &= -1700911504;
                        var3 &= 422262937;
                        yield var3 ^ -1372568915;
                    }
                };
                var6 = 0.0F;
                int var7 = 0;
                var6 = var6;
                long var8 = var4;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                long var12 = var8 + 2L;
                var10 *= var12;
                var8 += 3L;
                var10 *= var8;
                var8 = var10 & 7L;
                long var212;
                int var137 = (var212 = var8 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                if (var137 == 0) {
                    var3 = switch (var3) {
                        case -1372568915 -> {
                            var3 |= 2012337599;
                            var3 ^= 58329189;
                            var3 |= -1826219846;
                            var3 += -1176495707;
                            yield var3 ^ -439727079;
                        }
                        default -> var3 ^ 1986781064;
                        case 1928601789 -> var3 ^ -1599686952;
                    };
                    Integer var138 = var3;
                    if (var138 == null) {
                        break label126;
                    }

                    var7 = var7;
                    var3 += 1019812167;
                    var3 >>= 30;
                    var3 ^= 1333904255;

                    label121:
                    while (true) {
                        var8 = var3;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var213;
                        int var141 = (var213 = var8 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var141 != 0) {
                            break label126;
                        }

                        float[] var142 = a;
                        int var9 = var4 + 1;
                        var9 = var4 * var9;
                        int var184 = var4 + 2;
                        var9 *= var184;
                        int var185 = var4 + 3;
                        var9 *= var185;
                        var9 &= 7;
                        if (var9 != 0) {
                            var3 *= -925411803;
                            var3 |= 779238849;
                            var3 <<= 16;
                            var3 ^= 78790091;
                            var3 ^= -54475223;
                            break;
                        }

                        var3 -= 1390963767;
                        var3 ^= -1071896943;
                        var3 ^= -2076909422;
                        var3 ^= 1303542712;
                        var3 ^= 1969846440;
                        var9 = var3 + 1;
                        var9 = var3 * var9;
                        int var186 = var3 + 2;
                        var9 *= var186;
                        int var187 = var3 + 3;
                        var9 *= var187;
                        var9 &= 7;
                        if (var9 != 0) {
                            break label126;
                        }

                        int var143 = var142.length;
                        if (var7 >= var143) {
                            var3 <<= 20;
                            var3 ^= 101237437;
                            float var133 = var2.jQ;
                            float var134 = qB(var133, 2.45F, 1.2F);
                            var6 = 0.42F * var6;
                            var6 = 0.24F + var6;
                            float var153 = 1.0F - var134;
                            var6 *= var153;
                            float var154 = 0.58F * var134;
                            var6 += var154;
                            var6 *= var5;
                            int var155 = DP.Z(-8779244, -16777216, var134);
                            var1.vignette(var6, var155, 0.42F, 1.05F);
                            var6 = 0.65F * var134;
                            var6 = 0.25F + var6;
                            var6 *= var5;
                            var6 = 1.0F - var6;
                            var1.saturation(var6);
                            var6 = 0.2F * var134;
                            var6 = 0.06F + var6;
                            var6 = -var6;
                            var6 *= var5;
                            var5 = 0.1F * var5;
                            Integer var109 = var4;
                            if (var109 != null) {
                                switch (var3) {
                                    case 354847811:
                                    default:
                                        var3 ^= 774418268;
                                        break;
                                    case 1402520253:
                                        var3 >>>= 10;
                                        var3 <<= 18;
                                        var3 <<= 27;
                                        var3 += -216240346;
                                        var3 ^= 1343549784;
                                        break;
                                    case 1507017783:
                                        var3 ^= -1429880428;
                                }

                                float var110 = 1.0F + var5;
                                var1.grade(0.0F, var6, 1.0F, var110);
                                return;
                            }

                            var3 += 768534589;
                            var3 -= -1910850378;
                            var3 &= -628801751;
                            var3 ^= 395564514;
                            break;
                        }

                        var3 *= 144759981;
                        var3 &= 1035183493;
                        var3 ^= 851508911;
                        float var144 = var2.jQ;
                        float[] var165 = a;
                        float var166 = var165[var7];
                        float var145 = var144 - var166;
                        var9 = var4 + 1;
                        var9 = var4 * var9;
                        var9 &= 1;
                        if (var9 != 0) {
                            var3 *= -294063567;
                            var3 ^= -1690896280;
                            break;
                        }

                        var3 |= -160197698;
                        var3 ^= 1233862266;
                        float var214;
                        var9 = (var214 = var145 - -0.03F) == 0.0F ? 0 : (var214 < 0.0F ? -1 : 1);
                        float var152;
                        if (var9 > 0) {
                            var3 |= -1674807975;
                            var3 <<= 10;
                            var3 |= -371162055;
                            var3 |= 1803951262;
                            var3 ^= -1256835973;
                            float[] var171 = xk;
                            float var172 = var171[var7];
                            float var146 = Math.max(var145, 0.0F);
                            var10 = var4;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var215;
                            int var191 = (var215 = var10 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                            if (var191 != 0) {
                                switch (var3) {
                                    case -1320016323:
                                    default:
                                        var3 ^= -1342130490;
                                        break label121;
                                    case 1323419844:
                                        var3 <<= 11;
                                        var3 += 1341786124;
                                        var3 -= -2083186958;
                                        var3 ^= 536668920;
                                        break label121;
                                    case 1930473505:
                                        var3 ^= 1140159666;
                                        break label121;
                                }
                            }
                            var3 = switch (var3) {
                                case 1323419844 -> {
                                    var3 += 613886932;
                                    var3 ^= 936602060;
                                    var3 -= -988686228;
                                    yield var3 ^ 30662255;
                                }
                                default -> var3 ^ 1098003839;
                                case 2117612812 -> var3 ^ -1314541846;
                            };
                            var10 = var3;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var10 = var12 & 1L;
                            long var216;
                            int var194 = (var216 = var10 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label126;
                            }

                            float var147 = -var146;
                            float var148 = var147 / 0.22F;
                            double var195 = var148;
                            double var196 = Math.exp(var195);
                            float var149 = (float)var196;
                            float var150 = var172 * var149;
                            float var151 = Math.max(var6, var150);
                            var152 = var151;
                            switch (var3) {
                                case -1328636976:
                                default:
                                    var3 ^= 886448645;
                                    break;
                                case 1259200551:
                                    var3 ^= -1696205722;
                                    break;
                                case 2118785671:
                                    var3 *= 856862615;
                                    var3 += 449565704;
                                    var3 ^= -52317087;
                            }
                        } else {
                            var3 >>= 1;
                            var3 ^= 2080726701;
                            var9 = var3 + 1;
                            var9 = var3 * var9;
                            int var197 = var3 + 2;
                            var9 *= var197;
                            int var198 = var3 + 3;
                            var9 *= var198;
                            var9 &= 7;
                            if (var9 != 0) {
                                break label126;
                            }

                            var152 = var6;
                            var3 |= 1486915144;
                            var3 >>= 17;
                            var3 -= 898337463;
                            var3 |= 1445958912;
                            var3 ^= 566199181;
                        }

                        var9 = var7 + 1;
                        int var199 = var4 + 1;
                        int var200 = var4 * var199;
                        int var11 = var4 + 2;
                        int var201 = var200 * var11;
                        var11 = var4 + 3;
                        int var202 = var201 * var11;
                        int var203 = var202 & 7;
                        if (var203 != 0) {
                            var3 -= -868085833;
                            var3 ^= -867121417;
                            var3 |= -1176446246;
                            var3 += -202679003;
                            var3 ^= 911057601;
                            break;
                        }

                        var3 >>>= 15;
                        var3 &= -137830287;
                        var3 |= -235234827;
                        var3 *= 931242991;
                        var3 ^= 204204820;
                        var6 = var152;
                        var7 = var9;
                        var3 *= 933753291;
                        var3 -= -1472145873;
                        var3 &= -1290391229;
                        var3 -= -241694883;
                        var3 ^= -1643658204;
                    }
                } else {
                    var3 += 1954277808;
                    var3 &= 1478149950;
                    var3 >>= 1;
                    var3 >>>= 31;
                    var3 ^= -979895326;
                }
            } else {
                var3 += 1624846174;
                var3 += 996115271;
                var3 &= -1541584038;
                var3 |= 1972436216;
                var3 ^= 806028570;
            }

            Integer var106 = var3;
            if (var106 != null) {
                IllegalArgumentException var108 = new IllegalArgumentException();
                throw var108;
            }
        }

        RuntimeException var107 = new RuntimeException();
        throw var107;
    }

    @Override
    public void XE(Canvas var1, XK var2) {
        boolean var184 = false;
        label152: {
            int var90;
            label161: {
                var90 = bD;
                var90 ^= 399721695;
                int var4 = System.identityHashCode(this);
                float var5 = var2.dW;
                float var6 = var2.C;
                float var7 = var6 * 0.14F;
                var7 = TP.t(var7, 22.0F, 90.0F);
                float var8 = var6 * 0.062F;
                var8 = TP.t(var8, 12.0F, 38.0F);
                float var9 = var7 * 0.6F;
                float var10 = var8 * 0.6F;
                var9 += var10;
                var9 = var2.Os(var9);
                var10 = var2.jQ;
                int var11 = var90 | -1618739873;
                var11 ^= 1772180480;
                var11 -= -1788586015;
                var11 <<= 15;
                var11 ^= -2030852019;
                var10 = xY(var10, var11);
                var11 = DP.Z(-12714100, -50373, var10);
                var1.save();
                float var12 = var2.jQ;
                long var13 = var4;
                long var15 = var13 + 1L;
                var15 = var13 * var15;
                long var17 = var13 + 2L;
                var15 *= var17;
                var13 += 3L;
                var15 *= var13;
                var13 = var15 & 7L;
                long var289;
                int var243 = (var289 = var13 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                if (var243 != 0) {
                    switch (var90) {
                        case -1524168466:
                        default:
                            var90 ^= 1044697544;
                            break;
                        case -965924497:
                            var90 ^= -2017983930;
                            break;
                        case -764629464:
                            var90 ^= 958651474;
                            var90 &= 1354916896;
                            var90 ^= 1780217949;
                            var90 ^= 424385443;
                    }
                } else {
                    var90 &= -409632165;
                    var90 ^= -1176291003;
                    int var244 = var90 + 1;
                    int var245 = var90 * var244;
                    int var246 = var245 & 1;
                    if (var246 != 0) {
                        break label152;
                    }

                    var12 = qB(var12, 0.0F, 0.15F);
                    float var247 = var2.i;
                    var12 *= var247;
                    var1.alpha(var12);
                    int var203 = var90 - -803526394;
                    int var204 = var203 | 238413720;
                    int var205 = var204 ^ -1007921028;
                    vA(var1, var5, var9, var7, var11, var205);
                    var12 = var2.jQ;
                    int var248 = var90 - 468428060;
                    int var249 = var248 | 2019864497;
                    int var250 = var249 + 1837044853;
                    int var251 = var250 ^ 1282903060;
                    this.R(var1, var12, var5, var9, var7, var11, var251);
                    var11 = var90 & 1629333148;
                    var11 |= -1024745066;
                    var11 ^= -1805745632;
                    C(var1, var2, var5, var9, var7, var10, var11);
                    var1.restore();
                    var10 = var2.jQ;
                    var10 = qB(var10, 2.6000001F, 0.05F);
                    float var290;
                    var11 = (var290 = var10 - 0.0F) == 0.0F ? 0 : (var290 < 0.0F ? -1 : 1);
                    if (var11 <= 0) {
                        var90 *= 1785968889;
                        var90 <<= 23;
                        var90 &= -614572133;
                        var90 ^= 730314698;
                        return;
                    }

                    var90 |= -706864071;
                    var90 -= -1849047527;
                    var90 &= -1667134022;
                    var90 <<= 4;
                    var90 ^= 1041568779;
                    var11 = var90 + 1;
                    var11 = var90 * var11;
                    var11 &= 1;
                    if (var11 != 0) {
                        break label152;
                    }

                    float var178 = var2.jQ;
                    float var179 = var178 - 2.45F;
                    float var180 = var179 - 0.15F;
                    long var207 = var4;
                    long var14 = var207 + 1L;
                    var14 = var207 * var14;
                    long var208 = var14 & 1L;
                    long var291;
                    int var209 = (var291 = var208 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                    if (var209 != 0) {
                        var90 >>= 16;
                        var90 += -161454440;
                        var90 ^= -982359685;
                    } else {
                        label169: {
                            label155: {
                                var90 = switch (var90) {
                                    case -914041192 -> var90 ^ 1965385544;
                                    default -> var90 ^ 757387881;
                                    case -66222581 -> {
                                        var90 <<= 25;
                                        var90 += 1867122466;
                                        yield var90 ^ -472948053;
                                    }
                                };
                                float var292;
                                int var210 = (var292 = var180 - 0.5F) == 0.0F ? 0 : (var292 < 0.0F ? -1 : 1);
                                if (var210 < 0) {
                                    var90 = switch (var90) {
                                        default -> var90 ^ -1438195779;
                                        case 1542164150 -> var90 ^ -895404589;
                                        case 1720018313 -> {
                                            var90 &= -712833422;
                                            yield var90 ^ 1985436288;
                                        }
                                    };
                                    float var181 = var180 / 0.125F;
                                    var11 = (int)var181;
                                    var11 &= 1;
                                    Integer var211 = var4;
                                    if (var211 == null) {
                                        var90 += 2111714999;
                                        var90 ^= -2086234391;
                                        break label169;
                                    }

                                    var90 ^= -387003762;
                                    var90 &= 1607309792;
                                    var90 ^= -709281311;
                                    var90 |= 1301096253;
                                    var90 ^= -1856044525;
                                    long var212 = var90;
                                    var14 = var212 + 1L;
                                    var14 = var212 * var14;
                                    long var16 = var212 + 2L;
                                    var14 *= var16;
                                    long var213 = var212 + 3L;
                                    var14 *= var213;
                                    long var214 = var14 & 7L;
                                    long var293;
                                    int var215 = (var293 = var214 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                                    if (var215 != 0) {
                                        break label152;
                                    }

                                    if (var11 == 1) {
                                        var90 *= -1058068223;
                                        var90 ^= -1761081730;
                                        var184 = true;
                                        switch (var90) {
                                            case 451399056:
                                                var90 -= 1818418648;
                                                var90 -= -1130019050;
                                                var90 -= -1653902947;
                                                var90 *= 78036903;
                                                var90 ^= 2011553153;
                                                break label155;
                                            case 698300258:
                                                var90 ^= 1695767076;
                                                break label155;
                                            case 1607668932:
                                            default:
                                                var90 ^= -1487173231;
                                                break label155;
                                        }
                                    }

                                    var90 -= 720202401;
                                    var90 ^= -478333897;
                                    var90 += -64326363;
                                    var90 |= -1813477496;
                                    var90 ^= 1224687266;
                                } else {
                                    var90 <<= 19;
                                    var90 &= -1178300271;
                                    var90 &= -2049896610;
                                    var90 ^= -1757032131;
                                }

                                long var216 = var90;
                                var14 = var216 + 1L;
                                var14 = var216 * var14;
                                long var285 = var216 + 2L;
                                var14 *= var285;
                                long var217 = var216 + 3L;
                                var14 *= var217;
                                long var218 = var14 & 7L;
                                long var294;
                                int var219 = (var294 = var218 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                                if (var219 != 0) {
                                    break label152;
                                }

                                var184 = false;
                                var90 -= -1316821816;
                                var90 |= 1572210029;
                                var90 ^= 71937983;
                            }

                            var12 = var2.i;
                            var10 *= var12;
                            long var221 = var4;
                            var14 = var221 + 1L;
                            var14 = var221 * var14;
                            long var286 = var221 + 2L;
                            var14 *= var286;
                            long var222 = var221 + 3L;
                            var14 *= var222;
                            long var223 = var14 & 7L;
                            long var295;
                            int var224 = (var295 = var223 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                            if (var224 == 0) {
                                var90 -= -1604652904;
                                var90 ^= 286179954;
                                long var225 = var90;
                                var14 = var225 + 1L;
                                var14 = var225 * var14;
                                var286 = var225 + 2L;
                                var14 *= var286;
                                long var226 = var225 + 3L;
                                var14 *= var226;
                                long var227 = var14 & 7L;
                                long var296;
                                int var228 = (var296 = var227 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                if (var228 != 0) {
                                    break label152;
                                }

                                float var186;
                                if (var184) {
                                    var90 *= -146013607;
                                    var90 ^= 2127182780;
                                    Integer var185 = var90;
                                    if (var185 == null) {
                                        break label152;
                                    }

                                    var186 = 0.15F;
                                    var90 -= -1808300057;
                                    var90 -= -1799040265;
                                    var90 &= 2079101540;
                                    var90 ^= 1984140398;
                                } else {
                                    var90 *= 1820266987;
                                    var90 ^= 2019857394;
                                    var90 &= -347812112;
                                    var90 ^= -461412486;
                                    var186 = 1.0F;
                                    switch (var90) {
                                        case 390893210:
                                            var90 ^= 1154831957;
                                            break;
                                        case 711367682:
                                        default:
                                            var90 ^= -483160100;
                                            break;
                                        case 1333505354:
                                            var90 -= -901462244;
                                            var90 ^= -2009206780;
                                    }
                                }

                                int var229 = var90 + 1;
                                int var230 = var90 * var229;
                                int var231 = var230 & 1;
                                if (var231 != 0) {
                                    break label152;
                                }

                                var10 *= var186;
                                var11 = DP.Y(-50373, var10);
                                TextStyle var188 = TextStyle.of(var8, var11);
                                TextStyle var189 = var188.bold();
                                var8 *= 0.32F;
                                TextStyle var139 = var189.spacing(var8);
                                var10 = 0.55F * var10;
                                int var157 = DP.Y(-57312, var10);
                                TextStyle var140 = var139.shadow(var157, 0.0F, 0.36F);
                                var10 = var5 * 0.5F;
                                float var190 = var7 * 1.05F;
                                long var232 = var4;
                                var14 = var232 + 1L;
                                var14 = var232 * var14;
                                var286 = var232 + 2L;
                                var14 *= var286;
                                long var233 = var232 + 3L;
                                var14 *= var233;
                                long var234 = var14 & 7L;
                                long var297;
                                int var235 = (var297 = var234 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                                if (var235 != 0) {
                                    switch (var90) {
                                        case -1552280417:
                                            var90 ^= 1092201903;
                                            break;
                                        case 93723659:
                                        default:
                                            var90 ^= -1924833097;
                                            break;
                                        case 218830378:
                                            var90 &= 1116980464;
                                            var90 *= -793712175;
                                            var90 &= -395090280;
                                            var90 *= 736735261;
                                            var90 ^= -2099212834;
                                    }
                                } else {
                                    var90 &= 1087467635;
                                    var90 += -602325138;
                                    var90 >>>= 9;
                                    var90 <<= 24;
                                    var90 ^= -1756180052;
                                    long var236 = var90;
                                    var14 = var236 + 1L;
                                    var14 = var236 * var14;
                                    long var237 = var14 & 1L;
                                    long var298;
                                    int var238 = (var298 = var237 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                                    if (var238 != 0) {
                                        break label152;
                                    }

                                    float var191 = var9 - var190;
                                    var12 = var1.lineHeight(var140);
                                    float var192 = var191 - var12;
                                    var8 = var1.textCentered("FLATLINE", var10, var192, var140);
                                    var6 *= 0.03F;
                                    var6 = TP.t(var6, 7.0F, 13.0F);
                                    var8 = var2.jQ;
                                    var8 = qB(var8, 3.0500002F, 0.4F);
                                    var10 = var2.i;
                                    var8 *= var10;
                                    var10 = 0.72F * var8;
                                    int var161 = DP.Y(-1, var10);
                                    TextStyle var162 = TextStyle.of(var6, var161);
                                    TextStyle var163 = var162.medium();
                                    TextStyle var164 = var163.tabular();
                                    float var193 = var6 * 0.14F;
                                    TextStyle var165 = var164.spacing(var193);
                                    String var194 = this.q;
                                    var12 = var5 * 0.5F;
                                    float var252 = var7 * 0.5F;
                                    float var253 = var9 + var252;
                                    float var195 = var1.textCentered(var194, var12, var253, var165);
                                    String var196 = var2.MZ;
                                    boolean var197 = var196.isEmpty();
                                    if (var197) {
                                        var90 &= 1722485408;
                                        var90 -= -1870286731;
                                        var90 ^= 1332541868;
                                        break label161;
                                    }

                                    var90 += -1682073856;
                                    var90 >>>= 18;
                                    var90 &= -1474802034;
                                    var90 ^= -1227116338;
                                    var6 *= 0.9F;
                                    long var198 = var4;
                                    var13 = var198 + 1L;
                                    var13 = var198 * var13;
                                    var15 = var198 + 2L;
                                    var13 *= var15;
                                    long var199 = var198 + 3L;
                                    var13 *= var199;
                                    long var200 = var13 & 7L;
                                    long var299;
                                    var4 = (var299 = var200 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                    if (var4 == 0) {
                                        var90 |= -64618660;
                                        var90 ^= -1823788694;
                                        float var111 = 0.5F * var8;
                                        var4 = DP.Y(-1, var111);
                                        TextStyle var113 = TextStyle.of(var6, var4);
                                        String var128 = var2.MZ;
                                        var5 *= 0.5F;
                                        var7 *= 0.5F;
                                        var7 = var9 + var7;
                                        var8 = var1.lineHeight(var165);
                                        var8 *= 1.25F;
                                        var7 += var8;
                                        float var114 = var1.textCentered(var128, var5, var7, var113);
                                        var90 *= 670384339;
                                        var90 ^= -218927695;
                                        var90 ^= -283862422;
                                        break label161;
                                    }

                                    var90 += 553124329;
                                    var90 += 370755548;
                                    var90 |= 1632696982;
                                    var90 -= -1376939359;
                                    var90 ^= 1931307040;
                                }
                            } else {
                                var90 >>>= 24;
                                var90 ^= 523818396;
                                var90 |= -972041666;
                                var90 += 1158902452;
                                var90 ^= 390154733;
                            }
                        }
                    }
                }

                var4 = var90 + 1;
                var4 = var90 * var4;
                int var124 = var90 + 2;
                var4 *= var124;
                var90 += 3;
                var4 *= var90;
                var90 = var4 & 7;
                if (var90 == 0) {
                    IllegalArgumentException var109 = new IllegalArgumentException();
                    throw var109;
                }
                break label152;
            }

            long var115 = var90;
            long var129 = var115 + 1L;
            var129 = var115 * var129;
            long var147 = var115 + 2L;
            var129 *= var147;
            var115 += 3L;
            var129 *= var115;
            var115 = var129 & 7L;
            long var300;
            int var118 = (var300 = var115 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
            if (var118 == 0) {
                return;
            }
        }

        IllegalStateException var108 = new IllegalStateException();
        throw var108;
    }

    private static void vA(Canvas var0, float var1, float var2, float var3, int var4, int var5) {
        int var7 = var4;
        int var8 = System.identityHashCode(var0);
        float var9 = var3 * 1.15F;
        float var10 = var3 * 0.55F;
        long var11 = var8;
        long var13 = var11 + 1L;
        var13 = var11 * var13;
        var11 = var13 & 1L;
        long var143;
        int var91 = (var143 = var11 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
        if (var91 != 0) {
            switch (var5) {
                case -287285202:
                    int var80 = var5 ^ -944962941;
                    break;
                case 1813098403:
                    int var77 = var5 ^ 1133851511;
                    var77 ^= 167060808;
                    var77 ^= -456690108;
                    break;
                case 1969964187:
                default:
                    int var76 = var5 ^ -942493418;
            }
        } else {
            int var6 = var5 | 672223282;
            var6 |= -362053298;
            var6 -= -1356522743;
            var6 += -390111456;
            var6 ^= -626357870;
            nS(var0, var1, var2, var9, var10, 1929379840);
            var9 = var3 * 0.4F;
            var9 = var9;
            int var88 = DP.Y(var4, 0.07F);
            int var89 = var88;
            byte var92 = -2;
            int var93 = var92;

            var6 = switch (var6) {
                default -> var6 ^ -1623055206;
                case -1094199933 -> var6 ^ 611171925;
                case -222507644 -> {
                    var6 -= -1890881753;
                    var6 -= 682442135;
                    var6 >>>= 1;
                    yield var6 ^ -1919370215;
                }
            };

            label122:
            while (true) {
                int var12 = var7 + 1;
                var12 = var7 * var12;
                var12 &= 1;
                if (var12 == 0) {
                    if (var93 <= 2) {
                        var6 = switch (var6) {
                            case -1862620038 -> {
                                var6 &= -166773248;
                                var6 ^= -563326101;
                                yield var6 ^ 789030638;
                            }
                            default -> var6 ^ 2146816253;
                            case -516023014 -> var6 ^ 334236266;
                        };
                        float var100 = var93;
                        Integer var121 = var8;
                        if (var121 == null) {
                            switch (var6) {
                                case -744757903:
                                default:
                                    var6 ^= 1010780363;
                                    break label122;
                                case -329838963:
                                    var6 ^= 996053575;
                                    break label122;
                                case 1633802629:
                                    var6 |= -986636154;
                                    var6 *= -290040623;
                                    var6 ^= 1565641967;
                                    break label122;
                            }
                        }
                        var6 = switch (var6) {
                            case -483148203 -> var6 ^ -979833592;
                            case 1633802629 -> {
                                var6 ^= 670747507;
                                yield var6 ^ -1466412629;
                            }
                            default -> var6 ^ 859622053;
                        };
                        var13 = var7;
                        long var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var13 = var15 & 1L;
                        long var144;
                        int var124 = (var144 = var13 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                        if (var124 == 0) {
                            float var101 = var100 * var9;
                            float var102 = var2 + var101;
                            float var103 = var102 - 0.25F;
                            var0.rect(0.0F, var103, var1, 0.5F, var89);
                            var12 = var93 + 1;
                            var93 = var12;
                            var6 |= 1641418447;
                            var6 |= -1836403546;
                            var6 -= -1142887182;
                            var6 *= -1072772025;
                            var6 ^= 2035812577;
                            continue;
                        }
                    } else {
                        var6 ^= -1153372470;
                        var6 -= 1038201829;
                        var6 ^= -294597424;
                        var6 ^= 173258629;
                        Integer var94 = var7;
                        if (var94 != null) {
                            float var95 = var1 * 0.5F;
                            var12 = var8 + 1;
                            var12 = var8 * var12;
                            var12 &= 1;
                            if (var12 != 0) {
                                var6 ^= 60356911;
                                var6 *= 1287709147;
                                var6 ^= -1021992013;
                                break;
                            }

                            var6 -= -2095819031;
                            var6 -= 1423531150;
                            var6 -= -744135787;
                            var6 -= 1080812334;
                            var6 ^= 819979228;
                            long var108 = var7;
                            long var14 = var108 + 1L;
                            var14 = var108 * var14;
                            long var109 = var14 & 1L;
                            long var145;
                            var12 = (var145 = var109 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                            if (var12 == 0) {
                                float var96 = var95 % var9;
                                float var97 = var96;

                                var6 = switch (var6) {
                                    case 123955163 -> var6 ^ -1885280465;
                                    case 757274808 -> {
                                        var6 -= -1999557055;
                                        var6 += 1241106318;
                                        yield var6 ^ 1266871651;
                                    }
                                    default -> var6 ^ -754355612;
                                };

                                while (true) {
                                    Integer var111 = var7;
                                    if (var111 == null) {
                                        break;
                                    }

                                    float var146;
                                    int var112 = (var146 = var97 - var1) == 0.0F ? 0 : (var146 < 0.0F ? -1 : 1);
                                    Integer var125 = var8;
                                    if (var125 == null) {
                                        var6 <<= 14;
                                        var6 ^= -1787867176;
                                        break label122;
                                    }

                                    var6 |= -2099539630;
                                    var6 -= -1668278926;
                                    var6 ^= 2036168091;
                                    if (var112 >= 0) {
                                        var6 ^= -925524808;
                                        var6 >>>= 1;
                                        var6 *= -78065369;
                                        var6 ^= -1102176353;
                                        var8 = var7 + 1;
                                        var8 = var7 * var8;
                                        var7 = var8 & 1;
                                        if (var7 == 0) {
                                            return;
                                        }
                                        break;
                                    }
                                    var6 = switch (var6) {
                                        default -> var6 ^ 656895985;
                                        case -642350336 -> var6 ^ 118693473;
                                        case 1914093471 -> {
                                            var6 += 285096519;
                                            yield var6 ^ -820686886;
                                        }
                                    };
                                    var112 = var7 + 1;
                                    var112 = var7 * var112;
                                    int var126 = var7 + 2;
                                    var112 *= var126;
                                    int var127 = var7 + 3;
                                    var112 *= var127;
                                    var112 &= 7;
                                    if (var112 != 0) {
                                        break;
                                    }

                                    float var118 = var97 - 0.25F;
                                    float var128 = var9 * 2.0F;
                                    float var129 = var2 - var128;
                                    float var139 = var9 * 4.0F;
                                    var0.rect(var118, var129, 0.5F, var139, var89);
                                    float var119 = var97 + var9;
                                    int var130 = var8 + 1;
                                    int var131 = var8 * var130;
                                    int var132 = var131 & 1;
                                    if (var132 != 0) {
                                        switch (var6) {
                                            case -1316583034:
                                            default:
                                                var6 ^= -214612019;
                                                break label122;
                                            case 1275180604:
                                                var6 >>= 22;
                                                var6 *= -1524142255;
                                                var6 |= -102494496;
                                                var6 += -1881376376;
                                                var6 ^= 1298560928;
                                                break label122;
                                            case 1492219758:
                                                var6 ^= 994210166;
                                                break label122;
                                        }
                                    }

                                    var6 &= -907673132;
                                    var6 ^= -1771010437;
                                    int var133 = var7 + 1;
                                    int var134 = var7 * var133;
                                    int var140 = var7 + 2;
                                    int var135 = var134 * var140;
                                    int var141 = var7 + 3;
                                    int var136 = var135 * var141;
                                    int var137 = var136 & 7;
                                    if (var137 != 0) {
                                        break;
                                    }

                                    var97 = var119;
                                    var6 -= -1466524092;
                                    var6 |= -376702060;
                                    var6 ^= 1477616857;
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var83 = new UnsupportedOperationException();
                throw var83;
            }
        }

        AssertionError var81 = new AssertionError();
        throw var81;
    }

    private void R(Canvas var1, float var2, float var3, float var4, float var5, int var6, int var7) {
        int var9 = var6;
        int var10 = System.identityHashCode(this);
        float var11 = var2 / 2.9F;
        var11 = Math.min(var11, 1.0F);
        var11 *= var3;
        int var12 = var10 + 1;
        var12 = var10 * var12;
        var12 &= 1;
        if (var12 != 0) {
            int var327 = var7 >>> 2;
            var327 -= 769370381;
            var327 ^= -1462934911;
        } else {
            label467: {
                label452: {
                    int var8 = var7 | 1918020442;
                    var8 &= -1749035683;
                    var8 &= 1105669574;
                    var8 &= 1951124941;
                    var8 ^= 1879972110;
                    var11 = var11;
                    float var654;
                    var12 = (var654 = var2 - 2.9F) == 0.0F ? 0 : (var654 < 0.0F ? -1 : 1);
                    float var359;
                    if (var12 > 0) {
                        var8 -= 1171481435;
                        var8 |= -1860939545;
                        var8 += 1743133387;
                        var8 *= 2090538245;
                        var8 ^= 426972599;
                        Integer var354 = var6;
                        if (var354 == null) {
                            break label452;
                        }

                        float var355 = var2 - 2.9F;
                        float var356 = var355 / 2.9F;
                        float var357 = Math.min(var356, 1.0F);
                        float var358 = var357 * var3;
                        long var13 = var10;
                        long var15 = var13 + 1L;
                        var15 = var13 * var15;
                        long var17 = var13 + 2L;
                        var15 *= var17;
                        var13 += 3L;
                        var15 *= var13;
                        var13 = var15 & 7L;
                        long var655;
                        int var385 = (var655 = var13 - 0L) == 0L ? 0 : (var655 < 0L ? -1 : 1);
                        if (var385 != 0) {
                            var8 >>= 10;
                            var8 &= 1173158755;
                            var8 *= 1447654027;
                            var8 ^= -308644656;
                            var8 ^= 336675023;
                            break label467;
                        }

                        var8 <<= 26;
                        var8 &= -1528246739;
                        var8 <<= 20;
                        var8 ^= -1992714844;
                        var8 ^= 553677425;
                        var13 = var6;
                        var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var13 = var15 & 1L;
                        long var656;
                        int var388 = (var656 = var13 - 0L) == 0L ? 0 : (var656 < 0L ? -1 : 1);
                        if (var388 != 0) {
                            break label452;
                        }

                        var359 = var358;
                        var8 += 196899442;
                        var8 ^= 1615389436;
                    } else {
                        var8 *= 99837169;
                        var8 &= -1071559470;
                        var8 &= 131035430;
                        var8 ^= -96582751;
                        int var389 = var6 + 1;
                        var389 = var6 * var389;
                        int var14 = var6 + 2;
                        var389 *= var14;
                        var14 = var6 + 3;
                        var389 *= var14;
                        var389 &= 7;
                        if (var389 != 0) {
                            break label452;
                        }

                        var359 = -1.0F;
                        var8 += 972018791;
                        var8 &= 83643128;
                        var8 &= -93028657;
                        var8 += 265747978;
                        var8 ^= -599392599;
                    }

                    Integer var394 = var6;
                    if (var394 != null) {
                        float var360 = var359;
                        var394 = var10;
                        if (var394 == null) {
                            var8 ^= 1025218587;
                            var8 += -824777120;
                            var8 ^= -271185538;
                            break label467;
                        }
                        var8 = switch (var8) {
                            case -742475589 -> {
                                var8 += -1100456267;
                                var8 >>= 11;
                                yield var8 ^ -1493078846;
                            }
                            default -> var8 ^ -636715513;
                            case 1914603644 -> var8 ^ -1603442497;
                        };
                        long var396 = var6;
                        long var424 = var396 + 1L;
                        var424 = var396 * var424;
                        long var508 = var396 + 2L;
                        var424 *= var508;
                        long var397 = var396 + 3L;
                        var424 *= var397;
                        long var398 = var424 & 7L;
                        long var657;
                        int var399 = (var657 = var398 - 0L) == 0L ? 0 : (var657 < 0L ? -1 : 1);
                        label432:
                        if (var399 == 0) {
                            float var658;
                            var399 = (var658 = var359 - 0.0F) == 0.0F ? 0 : (var658 < 0.0F ? -1 : 1);
                            float var401;
                            if (var399 < 0) {
                                var8 = switch (var8) {
                                    default -> var8 ^ 1492941067;
                                    case 1492330528 -> {
                                        var8 ^= -1468641411;
                                        var8 >>= 30;
                                        var8 |= -67587475;
                                        var8 -= -2076425055;
                                        yield var8 ^ 1558926030;
                                    }
                                    case 1570434939 -> var8 ^ 1515804793;
                                };
                                var401 = 0.0F;
                                var8 -= -495672271;
                                var8 >>>= 26;
                                var8 &= -1774803548;
                                var8 ^= -54498164;
                            } else {
                                var8 &= 985709637;
                                var8 <<= 10;
                                var8 ^= 1347824273;
                                var8 += 1463607909;
                                var8 ^= 739166419;
                                long var406 = var6;
                                long var16 = var406 + 1L;
                                var16 = var406 * var16;
                                long var18 = var406 + 2L;
                                var16 *= var18;
                                var406 += 3L;
                                var16 *= var406;
                                var406 = var16 & 7L;
                                long var659;
                                int var409 = (var659 = var406 - 0L) == 0L ? 0 : (var659 < 0L ? -1 : 1);
                                if (var409 != 0) {
                                    break label432;
                                }

                                float var410 = var359 + 14.0F;
                                var424 = var10;
                                var508 = var424 + 1L;
                                var508 = var424 * var508;
                                long var19 = var424 + 2L;
                                var508 *= var19;
                                var424 += 3L;
                                var508 *= var424;
                                var424 = var508 & 7L;
                                long var660;
                                int var431 = (var660 = var424 - 0L) == 0L ? 0 : (var660 < 0L ? -1 : 1);
                                if (var431 != 0) {
                                    var8 ^= -1320538657;
                                    var8 ^= -1461067526;
                                    var8 ^= -2034919589;
                                    var8 |= -1170177902;
                                    var8 ^= -373190491;
                                    break label467;
                                }

                                var8 <<= 2;
                                var8 *= -63947243;
                                var8 ^= 1627003303;
                                float var411 = Math.min(var3, var410);
                                var401 = var411;
                                var8 *= 668591655;
                                var8 >>= 10;
                                var8 *= 2106045449;
                                var8 ^= -740847452;
                            }

                            float var402 = var401;
                            Integer var412 = var10;
                            if (var412 == null) {
                                var8 -= -156396532;
                                var8 -= -1915113225;
                                var8 &= -151259224;
                                var8 |= -2093516776;
                                var8 ^= -1584041498;
                                break label467;
                            }

                            var8 ^= 1159735135;
                            var8 ^= -1780201277;
                            var412 = var6;
                            label425:
                            if (var412 != null) {
                                float var661;
                                int var414 = (var661 = var359 - 0.0F) == 0.0F ? 0 : (var661 < 0.0F ? -1 : 1);
                                float var418;
                                if (var414 < 0) {
                                    var8 = switch (var8) {
                                        case -1713003839 -> var8 ^ -380947164;
                                        default -> var8 ^ 1110147957;
                                        case 738460432 -> {
                                            var8 >>= 5;
                                            var8 >>= 3;
                                            var8 ^= -690242052;
                                            yield var8 ^ -1991142920;
                                        }
                                    };
                                    var414 = var6 + 1;
                                    var414 = var6 * var414;
                                    var414 &= 1;
                                    if (var414 != 0) {
                                        break label425;
                                    }

                                    var418 = var11;
                                    var8 *= -995007027;
                                    var8 |= -1598404729;
                                    var8 ^= 601357442;
                                    var8 ^= 2006622332;
                                } else {
                                    var8 += 2049315232;
                                    var8 *= -2069364411;
                                    var8 ^= -2070871452;
                                    var418 = var359;
                                    var8 -= -355844567;
                                    var8 -= 2096527538;
                                    var8 |= -923416933;
                                    var8 |= -1229626125;
                                    var8 ^= 68117914;
                                }

                                int var432 = var6 + 1;
                                int var433 = var6 * var432;
                                int var467 = var6 + 2;
                                int var434 = var433 * var467;
                                var467 = var6 + 3;
                                int var435 = var434 * var467;
                                int var436 = var435 & 7;
                                if (var436 == 0) {
                                    int var437 = var10 + 1;
                                    int var438 = var10 * var437;
                                    var467 = var10 + 2;
                                    int var439 = var438 * var467;
                                    var467 = var10 + 3;
                                    int var440 = var439 * var467;
                                    int var441 = var440 & 7;
                                    if (var441 != 0) {
                                        var8 <<= 13;
                                        var8 *= -554611309;
                                        var8 |= 1456550933;
                                        var8 ^= 610105963;
                                        break label467;
                                    }

                                    var8 ^= 1912603734;
                                    var8 ^= 1007362658;
                                    int var442 = var6 + 1;
                                    int var443 = var6 * var442;
                                    int var444 = var443 & 1;
                                    label415:
                                    if (var444 == 0) {
                                        float var662;
                                        int var445 = (var662 = var11 - var401) == 0.0F ? 0 : (var662 < 0.0F ? -1 : 1);
                                        int var454;
                                        if (var445 > 0) {
                                            var8 = switch (var8) {
                                                case -1258705579 -> {
                                                    var8 &= 773014442;
                                                    var8 |= 497410496;
                                                    var8 ^= -1486660559;
                                                    var8 ^= 1716371898;
                                                    yield var8 ^ 307991464;
                                                }
                                                default -> var8 ^ 869299384;
                                                case 1631786878 -> var8 ^ -618279120;
                                            };
                                            var424 = var6;
                                            var508 = var424 + 1L;
                                            var508 = var424 * var508;
                                            long var607 = var424 + 2L;
                                            var508 *= var607;
                                            var424 += 3L;
                                            var508 *= var424;
                                            var424 = var508 & 7L;
                                            long var663;
                                            int var449 = (var663 = var424 - 0L) == 0L ? 0 : (var663 < 0L ? -1 : 1);
                                            if (var449 != 0) {
                                                break label415;
                                            }

                                            float var450 = var11 - var401;
                                            float var451 = var450 / 1.0F;
                                            int var452 = (int)var451;
                                            var452++;
                                            var467 = var10 + 1;
                                            var467 = var10 * var467;
                                            int var517 = var10 + 2;
                                            var467 *= var517;
                                            int var518 = var10 + 3;
                                            var467 *= var518;
                                            var467 &= 7;
                                            if (var467 != 0) {
                                                var8 |= -472151813;
                                                var8 ^= -1116610171;
                                                break label467;
                                            }

                                            var8 |= -35913106;
                                            var8 += 1570075689;
                                            var8 += -956193526;
                                            var8 >>>= 28;
                                            var8 ^= -1432623039;
                                            var454 = var452;
                                            var8 -= -741625662;
                                            var8 |= -1459652711;
                                            var8 ^= -1427161310;
                                            var8 >>>= 30;
                                            var8 ^= 152904754;
                                        } else {
                                            var8 -= -1132730929;
                                            var8 += -2132315670;
                                            var8 ^= -521657066;
                                            var8 ^= -1763300065;
                                            long var476 = var6;
                                            long var571 = var476 + 1L;
                                            var571 = var476 * var571;
                                            long var477 = var571 & 1L;
                                            long var664;
                                            var467 = (var664 = var477 - 0L) == 0L ? 0 : (var664 < 0L ? -1 : 1);
                                            if (var467 != 0) {
                                                break label415;
                                            }

                                            var454 = 0;
                                            var8 |= -1327904104;
                                            var8 ^= -1226383414;
                                        }

                                        Integer var479 = var6;
                                        label406:
                                        if (var479 != null) {
                                            int var455 = var454;
                                            float[] var480 = this.xD;
                                            int var481 = var480.length;
                                            var508 = var10;
                                            long var608 = var508 + 1L;
                                            var608 = var508 * var608;
                                            var508 = var608 & 1L;
                                            long var665;
                                            int var521 = (var665 = var508 - 0L) == 0L ? 0 : (var665 < 0L ? -1 : 1);
                                            if (var521 != 0) {
                                                var8 |= -899546060;
                                                var8 -= -2052040224;
                                                var8 ^= 392479785;
                                                break label467;
                                            }

                                            var8 ^= -1749218398;
                                            var8 ^= 50775771;
                                            if (var481 < var454) {
                                                var8 >>= 25;
                                                var8 <<= 3;
                                                var8 *= -1262976181;
                                                var8 ^= 1518082572;
                                                long var482 = var6;
                                                long var573 = var482 + 1L;
                                                var573 = var482 * var573;
                                                long var20 = var482 + 2L;
                                                var573 *= var20;
                                                long var483 = var482 + 3L;
                                                var573 *= var483;
                                                long var484 = var573 & 7L;
                                                long var666;
                                                var481 = (var666 = var484 - 0L) == 0L ? 0 : (var666 < 0L ? -1 : 1);
                                                if (var481 != 0) {
                                                    break label406;
                                                }

                                                var481 = var454 + 64;
                                                var508 = var10;
                                                var608 = var508 + 1L;
                                                var608 = var508 * var608;
                                                var508 = var608 & 1L;
                                                long var667;
                                                int var524 = (var667 = var508 - 0L) == 0L ? 0 : (var667 < 0L ? -1 : 1);
                                                if (var524 != 0) {
                                                    var8 *= 1989305265;
                                                    var8 ^= 1286234722;
                                                    break label467;
                                                }
                                                var8 = switch (var8) {
                                                    case -976305956 -> {
                                                        var8 ^= 2109238987;
                                                        var8 *= 170348297;
                                                        var8 |= -1906992219;
                                                        var8 ^= 1590729897;
                                                        yield var8 ^ 2027397871;
                                                    }
                                                    case -100546191 -> var8 ^ 1497502758;
                                                    default -> var8 ^ -851192357;
                                                };
                                                int var525 = var6 + 1;
                                                int var526 = var6 * var525;
                                                int var527 = var526 & 1;
                                                if (var527 != 0) {
                                                    break label406;
                                                }

                                                float[] var487 = new float[var481];
                                                this.xD = var487;
                                                var8 *= 1386798965;
                                                var8 |= -867944554;
                                                var8 -= -1274686639;
                                                var8 ^= 548722206;
                                            } else {
                                                var8 >>= 28;
                                                var8 -= -2085844130;
                                                var8 ^= 1725435627;
                                            }

                                            var481 = var6 + 1;
                                            var481 = var6 * var481;
                                            var481 &= 1;
                                            if (var481 == 0) {
                                                int var491 = 0;
                                                var508 = var10;
                                                var608 = var508 + 1L;
                                                var608 = var508 * var608;
                                                long var21 = var508 + 2L;
                                                var608 *= var21;
                                                var508 += 3L;
                                                var608 *= var508;
                                                var508 = var608 & 7L;
                                                long var668;
                                                int var531 = (var668 = var508 - 0L) == 0L ? 0 : (var668 < 0L ? -1 : 1);
                                                if (var531 != 0) {
                                                    switch (var8) {
                                                        case 445348464:
                                                            var8 <<= 20;
                                                            var8 ^= -173404546;
                                                            break label467;
                                                        case 1665104953:
                                                        default:
                                                            var8 ^= -1186373966;
                                                            break label467;
                                                        case 1766750845:
                                                            var8 ^= -1537046396;
                                                            break label467;
                                                    }
                                                }

                                                var8 ^= -1829455217;
                                                var8 ^= -816604511;
                                                var491 = var491;
                                                var8 |= -50152443;
                                                var8 |= 1124455497;
                                                var8 |= 858251305;
                                                var8 ^= -503954767;

                                                label391:
                                                while (true) {
                                                    Integer var532 = var9;
                                                    if (var532 == null) {
                                                        break;
                                                    }

                                                    if (var491 >= var455) {
                                                        var8 = switch (var8) {
                                                            case -706494148 -> var8 ^ 1194920135;
                                                            case 517586126 -> {
                                                                var8 |= 1656982812;
                                                                var8 &= -1222221792;
                                                                var8 &= -831630686;
                                                                yield var8 ^ -1176545337;
                                                            }
                                                            default -> var8 ^ 273580343;
                                                        };
                                                        var491 = var9 + 1;
                                                        var491 = var9 * var491;
                                                        var491 &= 1;
                                                        if (var491 == 0) {
                                                            var1.save();
                                                            var1.additive(0.8F);
                                                            var491 = DP.Y(var6, 0.16F);
                                                            Integer var541 = var10;
                                                            if (var541 == null) {
                                                                var8 &= -1485565121;
                                                                var8 &= 1227519493;
                                                                var8 ^= 1403657339;
                                                                break label467;
                                                            }

                                                            var8 *= 983189527;
                                                            var8 ^= 1991675678;
                                                            var8 &= 1538924999;
                                                            var8 ^= 817021876;
                                                            Integer var542 = var9;
                                                            if (var542 != null) {
                                                                float var669;
                                                                int var543 = (var669 = var359 - 0.0F) == 0.0F ? 0 : (var669 < 0.0F ? -1 : 1);
                                                                if (var543 > 0) {
                                                                    var8 -= 388282086;
                                                                    var8 ^= 97201914;
                                                                    var8 ^= -1334636597;
                                                                    Integer var544 = var9;
                                                                    if (var544 == null) {
                                                                        break;
                                                                    }

                                                                    int var545 = var8 ^ -690612465;
                                                                    int var546 = var545 + 565319985;
                                                                    int var547 = var546 & 487637974;
                                                                    int var548 = var547 - 173717248;
                                                                    int var549 = var548 ^ 713351116;
                                                                    Uk(var1, 0.0F, var4, var359, var4, var491, var549);
                                                                    switch (var8) {
                                                                        case -1101256004:
                                                                            var8 >>= 11;
                                                                            var8 |= -610084171;
                                                                            var8 >>>= 2;
                                                                            var8 ^= -161473539;
                                                                            break;
                                                                        case -259280886:
                                                                            var8 ^= 124179456;
                                                                            break;
                                                                        case 116141317:
                                                                        default:
                                                                            var8 ^= 1570693790;
                                                                    }
                                                                } else {
                                                                    switch (var8) {
                                                                        case -287534306:
                                                                            var8 ^= -637522998;
                                                                            break;
                                                                        case 431035349:
                                                                        default:
                                                                            var8 ^= 1751451871;
                                                                            break;
                                                                        case 587776627:
                                                                            var8 *= -212984285;
                                                                            var8 &= -1026030844;
                                                                            var8 *= 359329647;
                                                                            var8 ^= -1991008240;
                                                                    }
                                                                }

                                                                Integer var497 = var9;
                                                                if (var497 != null) {
                                                                    byte var498 = 1;
                                                                    var508 = var10;
                                                                    var608 = var508 + 1L;
                                                                    var608 = var508 * var608;
                                                                    var21 = var508 + 2L;
                                                                    var608 *= var21;
                                                                    var508 += 3L;
                                                                    var608 *= var508;
                                                                    var508 = var608 & 7L;
                                                                    long var670;
                                                                    int var553 = (var670 = var508 - 0L) == 0L ? 0 : (var670 < 0L ? -1 : 1);
                                                                    if (var553 != 0) {
                                                                        var8 += -1749255489;
                                                                        var8 ^= 61180432;
                                                                        var8 &= 1308584812;
                                                                        var8 |= 340612964;
                                                                        var8 ^= 106262802;
                                                                        break label467;
                                                                    }

                                                                    var8 ^= -1589597381;
                                                                    var8 *= -1149759137;
                                                                    var8 += 979564709;
                                                                    var8 ^= -907633590;
                                                                    int var554 = var9 + 1;
                                                                    int var555 = var9 * var554;
                                                                    int var585 = var9 + 2;
                                                                    int var556 = var555 * var585;
                                                                    var585 = var9 + 3;
                                                                    int var557 = var556 * var585;
                                                                    int var558 = var557 & 7;
                                                                    if (var558 == 0) {
                                                                        int var499 = var498;
                                                                        var8 &= 1873905954;
                                                                        var8 |= 1969469767;
                                                                        var8 <<= 25;
                                                                        var8 ^= 2086202024;

                                                                        while (true) {
                                                                            int var559 = var9 + 1;
                                                                            int var560 = var9 * var559;
                                                                            var585 = var9 + 2;
                                                                            int var561 = var560 * var585;
                                                                            var585 = var9 + 3;
                                                                            int var562 = var561 * var585;
                                                                            int var563 = var562 & 7;
                                                                            if (var563 != 0) {
                                                                                break label391;
                                                                            }

                                                                            if (var499 >= var455) {
                                                                                var8 = switch (var8) {
                                                                                    case -1043508463 -> var8 ^ -802392594;
                                                                                    case -229053784 -> {
                                                                                        var8 >>>= 11;
                                                                                        var8 ^= 1362025284;
                                                                                        var8 *= 1044696287;
                                                                                        var8 -= -1349105270;
                                                                                        yield var8 ^ 2024379910;
                                                                                    }
                                                                                    default -> var8 ^ 852266341;
                                                                                };
                                                                                var1.additive(0.0F);
                                                                                float var671;
                                                                                var499 = (var671 = var360 - 0.0F) == 0.0F ? 0 : (var671 < 0.0F ? -1 : 1);
                                                                                var585 = var10 + 1;
                                                                                var585 = var10 * var585;
                                                                                int var624 = var10 + 2;
                                                                                var585 *= var624;
                                                                                int var625 = var10 + 3;
                                                                                var585 *= var625;
                                                                                var585 &= 7;
                                                                                if (var585 != 0) {
                                                                                    var8 -= 1880657676;
                                                                                    var8 ^= 941175953;
                                                                                    break label467;
                                                                                }

                                                                                var8 >>= 22;
                                                                                var8 += 921005550;
                                                                                var8 &= -1937645598;
                                                                                var8 -= 890540950;
                                                                                var8 ^= 15365328;
                                                                                var585 = var9 + 1;
                                                                                var585 = var9 * var585;
                                                                                var585 &= 1;
                                                                                if (var585 == 0) {
                                                                                    if (var499 > 0) {
                                                                                        var8 *= 1656091099;
                                                                                        var8 += 620577880;
                                                                                        var8 -= -86959555;
                                                                                        var8 ^= 1865832535;
                                                                                        var499 = var9 + 1;
                                                                                        var499 = var9 * var499;
                                                                                        var585 = var9 + 2;
                                                                                        var499 *= var585;
                                                                                        var585 = var9 + 3;
                                                                                        var499 *= var585;
                                                                                        var499 &= 7;
                                                                                        if (var499 != 0) {
                                                                                            break label391;
                                                                                        }

                                                                                        var1.line(0.0F, var4, var360, var4, 1.2F, var6);
                                                                                        var8 |= -1304946967;
                                                                                        var8 *= 127847549;
                                                                                        var8 ^= -488942436;
                                                                                    } else {
                                                                                        switch (var8) {
                                                                                            case -1070094713:
                                                                                            default:
                                                                                                var8 ^= 2124015756;
                                                                                                break;
                                                                                            case -813249158:
                                                                                                var8 -= -269484807;
                                                                                                var8 -= 41446120;
                                                                                                var8 |= 754799071;
                                                                                                var8 *= 2037091199;
                                                                                                var8 ^= -493323890;
                                                                                                break;
                                                                                            case 1770924260:
                                                                                                var8 ^= -1562203524;
                                                                                        }
                                                                                    }

                                                                                    int var506 = 1;
                                                                                    Integer var601 = var10;
                                                                                    if (var601 == null) {
                                                                                        var8 <<= 18;
                                                                                        var8 &= 1288424326;
                                                                                        var8 &= 1578893172;
                                                                                        var8 &= 257504110;
                                                                                        var8 ^= 1587678846;
                                                                                        break label467;
                                                                                    }

                                                                                    var8 *= -899009329;
                                                                                    var8 ^= 1005125774;
                                                                                    var506 = var506;

                                                                                    var8 = switch (var8) {
                                                                                        case -1680010550 -> var8 ^ -820826374;
                                                                                        default -> var8 ^ 831149668;
                                                                                        case 945974159 -> {
                                                                                            var8 &= 1250231136;
                                                                                            var8 ^= -2052835742;
                                                                                            var8 -= 1775110129;
                                                                                            var8 += 1368159407;
                                                                                            yield var8 ^ -169697720;
                                                                                        }
                                                                                    };

                                                                                    while (true) {
                                                                                        var601 = var9;
                                                                                        if (var601 == null) {
                                                                                            break label391;
                                                                                        }

                                                                                        if (var506 >= var455) {
                                                                                            var8 = switch (var8) {
                                                                                                case -2139079576 -> {
                                                                                                    var8 >>= 10;
                                                                                                    var8 -= -1886120723;
                                                                                                    var8 |= -145199326;
                                                                                                    yield var8 ^ 1238772939;
                                                                                                }
                                                                                                default -> var8 ^ -637883212;
                                                                                                case 1649011424 -> var8 ^ 1604643942;
                                                                                            };
                                                                                            Integer var340 = var9;
                                                                                            if (var340 != null) {
                                                                                                float var672;
                                                                                                int var341 = (var672 = var360 - 0.0F) == 0.0F
                                                                                                    ? 0
                                                                                                    : (var672 < 0.0F ? -1 : 1);
                                                                                                Integer var361 = var10;
                                                                                                if (var361 == null) {
                                                                                                    switch (var8) {
                                                                                                        case -1889521978:
                                                                                                            var8 ^= 939789859;
                                                                                                            break label467;
                                                                                                        case -1702719292:
                                                                                                        default:
                                                                                                            var8 ^= -2050786028;
                                                                                                            break label467;
                                                                                                        case -1098234903:
                                                                                                            var8 ^= -1442693009;
                                                                                                            var8 &= 604146556;
                                                                                                            var8 ^= 1453985146;
                                                                                                            break label467;
                                                                                                    }
                                                                                                }

                                                                                                var8 -= 1807444871;
                                                                                                var8 *= 1693967617;
                                                                                                var8 += 1369592917;
                                                                                                var8 -= 1739308115;
                                                                                                var8 ^= 711876463;
                                                                                                int var362 = var9 + 1;
                                                                                                var362 = var9 * var362;
                                                                                                var362 &= 1;
                                                                                                if (var362 == 0) {
                                                                                                    if (var341 < 0) {
                                                                                                        var8 += 1101922265;
                                                                                                        var8 ^= -1942485173;
                                                                                                        Integer var342 = var9;
                                                                                                        if (var342 == null) {
                                                                                                            break label391;
                                                                                                        }

                                                                                                        var11 = var418 / var3;
                                                                                                        var11 *= 2.9F;
                                                                                                        var11 = Zk(var11);
                                                                                                        var11 *= var5;
                                                                                                        long var365 = var10;
                                                                                                        var424 = var365 + 1L;
                                                                                                        var424 = var365 * var424;
                                                                                                        long var366 = var424 & 1L;
                                                                                                        long var673;
                                                                                                        var362 = (var673 = var366 - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var673 < 0L ? -1 : 1);
                                                                                                        if (var362 != 0) {
                                                                                                            var8 >>= 13;
                                                                                                            var8 ^= 1386987108;
                                                                                                            break label467;
                                                                                                        }

                                                                                                        var8 *= 176394257;
                                                                                                        var8 -= 174689652;
                                                                                                        var8 *= -945542789;
                                                                                                        var8 ^= 2089502435;
                                                                                                        long var368 = var9;
                                                                                                        var424 = var368 + 1L;
                                                                                                        var424 = var368 * var424;
                                                                                                        long var369 = var424 & 1L;
                                                                                                        long var674;
                                                                                                        var362 = (var674 = var369 - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var674 < 0L ? -1 : 1);
                                                                                                        if (var362 != 0) {
                                                                                                            break label391;
                                                                                                        }

                                                                                                        var11 = var4 - var11;
                                                                                                        var11 = var11;
                                                                                                        var8 ^= -1087999806;
                                                                                                        var8 ^= -653236678;
                                                                                                    } else {
                                                                                                        var8 -= 924433436;
                                                                                                        var8 |= 1479161168;
                                                                                                        var8 += 164702612;
                                                                                                        var8 ^= -136011505;
                                                                                                        long var371 = var9;
                                                                                                        var424 = var371 + 1L;
                                                                                                        var424 = var371 * var424;
                                                                                                        long var372 = var424 & 1L;
                                                                                                        long var675;
                                                                                                        var362 = (var675 = var372 - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var675 < 0L ? -1 : 1);
                                                                                                        if (var362 != 0) {
                                                                                                            break label391;
                                                                                                        }

                                                                                                        var11 = var4;
                                                                                                        var8 <<= 15;
                                                                                                        var8 &= -344398702;
                                                                                                        var8 &= -2072713475;
                                                                                                        var8 ^= 961856178;
                                                                                                    }

                                                                                                    var362 = var9 + 1;
                                                                                                    var362 = var9 * var362;
                                                                                                    var399 = var9 + 2;
                                                                                                    var362 *= var399;
                                                                                                    var399 = var9 + 3;
                                                                                                    var362 *= var399;
                                                                                                    var362 &= 7;
                                                                                                    if (var362 == 0) {
                                                                                                        Integer var379 = var10;
                                                                                                        if (var379 == null) {
                                                                                                            var8 -= 2128192246;
                                                                                                            var8 &= -1156594471;
                                                                                                            var8 -= 1466315017;
                                                                                                            var8 ^= 806280689;
                                                                                                            break label467;
                                                                                                        }

                                                                                                        var8 <<= 4;
                                                                                                        var8 ^= 1608445089;
                                                                                                        var1.additive(1.0F);
                                                                                                        float var676;
                                                                                                        int var380 = (var676 = var418 - var3) == 0.0F
                                                                                                            ? 0
                                                                                                            : (var676 < 0.0F ? -1 : 1);
                                                                                                        if (var380 < 0) {
                                                                                                            var8 *= 2100607047;
                                                                                                            var8 &= 1867293256;
                                                                                                            var8 &= 339244263;
                                                                                                            var8 ^= 24116657;
                                                                                                            Integer var381 = var9;
                                                                                                            if (var381 == null) {
                                                                                                                break label391;
                                                                                                            }

                                                                                                            SpriteShape var382 = SpriteShape.GLOW;
                                                                                                            Integer var335 = var10;
                                                                                                            if (var335 == null) {
                                                                                                                var8 &= -829779306;
                                                                                                                var8 -= -1692695809;
                                                                                                                var8 ^= 1657356674;
                                                                                                                var8 *= -819789893;
                                                                                                                var8 ^= 1471443103;
                                                                                                                break label467;
                                                                                                            }

                                                                                                            var8 *= 841209619;
                                                                                                            var8 ^= -1722697188;
                                                                                                            var424 = var9;
                                                                                                            var508 = var424 + 1L;
                                                                                                            var508 = var424 * var508;
                                                                                                            var424 = var508 & 1L;
                                                                                                            long var677;
                                                                                                            int var336 = (var677 = var424 - 0L) == 0L
                                                                                                                ? 0
                                                                                                                : (var677 < 0L ? -1 : 1);
                                                                                                            if (var336 != 0) {
                                                                                                                break label391;
                                                                                                            }

                                                                                                            var1.sprite(
                                                                                                                var382,
                                                                                                                var418,
                                                                                                                var11,
                                                                                                                1.6F,
                                                                                                                7.0F,
                                                                                                                -1,
                                                                                                                var6,
                                                                                                                0.0F
                                                                                                            );
                                                                                                            var8 *= -1105246039;
                                                                                                            var8 ^= -418448570;
                                                                                                            var8 *= 1511481077;
                                                                                                            var8 ^= 1610545603;
                                                                                                        } else {
                                                                                                            switch (var8) {
                                                                                                                case -829241471:
                                                                                                                    var8 -= -1166438096;
                                                                                                                    var8 -= 1031826764;
                                                                                                                    var8 *= -1616722407;
                                                                                                                    var8 ^= -852780293;
                                                                                                                    break;
                                                                                                                case -715054816:
                                                                                                                default:
                                                                                                                    var8 ^= -1046304985;
                                                                                                                    break;
                                                                                                                case 1279712199:
                                                                                                                    var8 ^= 2081560960;
                                                                                                            }
                                                                                                        }

                                                                                                        long var331 = var9;
                                                                                                        long var349 = var331 + 1L;
                                                                                                        long var350 = var331 * var349;
                                                                                                        long var332 = var350 & 1L;
                                                                                                        long var678;
                                                                                                        var9 = (var678 = var332 - 0L) == 0L
                                                                                                            ? 0
                                                                                                            : (var678 < 0L ? -1 : 1);
                                                                                                        if (var9 == 0) {
                                                                                                            var1.restore();
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break label391;
                                                                                        }

                                                                                        var8 *= -842473473;
                                                                                        var8 &= -347808928;
                                                                                        var8 ^= 1999794287;
                                                                                        float var603 = var506;
                                                                                        float var604 = var603 * 1.0F;
                                                                                        float var605 = var402 + var604;
                                                                                        float var567 = var605--;
                                                                                        float[] var626 = this.xD;
                                                                                        int var631 = var506 - 1;
                                                                                        float var627 = var626[var631];
                                                                                        float[] var632 = this.xD;
                                                                                        float var633 = var632[var506];
                                                                                        int var641 = var8 + -525038640;
                                                                                        int var642 = var641 & -2066480089;
                                                                                        int var643 = var642 ^ 1517512991;
                                                                                        float var644 = T(var360, var11, var567, var3, var643);
                                                                                        int var645 = DP.Y(var6, var644);
                                                                                        int var647 = var10 + 1;
                                                                                        var647 = var10 * var647;
                                                                                        int var23 = var10 + 2;
                                                                                        var647 *= var23;
                                                                                        var23 = var10 + 3;
                                                                                        var647 *= var23;
                                                                                        var647 &= 7;
                                                                                        if (var647 != 0) {
                                                                                            var8 -= -1487291989;
                                                                                            var8 ^= -462227526;
                                                                                            break label467;
                                                                                        }

                                                                                        var8 *= -14778577;
                                                                                        var8 -= -2066084219;
                                                                                        var8 |= 1337600824;
                                                                                        var8 ^= -1044455710;
                                                                                        Integer var652 = var9;
                                                                                        if (var652 == null) {
                                                                                            break label391;
                                                                                        }

                                                                                        var1.line(var605, var627, var567, var633, 1.2F, var645);
                                                                                        int var568 = var506 + 1;
                                                                                        var506 = var568;
                                                                                        var8 += 277240517;
                                                                                        var8 ^= 1784236905;
                                                                                        var8 *= -158514327;
                                                                                        var8 ^= 1671599858;
                                                                                    }
                                                                                }
                                                                                break label391;
                                                                            }

                                                                            var8 >>= 5;
                                                                            var8 |= -1646350064;
                                                                            var8 += -1221521672;
                                                                            var8 -= -58842390;
                                                                            var8 ^= -2089953696;
                                                                            float var564 = var499;
                                                                            float var565 = var564 * 1.0F;
                                                                            float var566 = var402 + var565;
                                                                            float var589 = var566 - 1.0F;
                                                                            float[] var622 = this.xD;
                                                                            int var628 = var499 - 1;
                                                                            float var623 = var622[var628];
                                                                            float[] var629 = this.xD;
                                                                            float var630 = var629[var499];
                                                                            Integer var635 = var10;
                                                                            if (var635 == null) {
                                                                                var8 ^= 2063645290;
                                                                                var8 -= -1585590430;
                                                                                var8 &= 893934555;
                                                                                var8 ^= 1944211069;
                                                                                break label467;
                                                                            }

                                                                            var8 -= 1479516681;
                                                                            var8 ^= -2028356058;
                                                                            int var636 = var8 >> 15;
                                                                            int var637 = var636 ^ 1589092498;
                                                                            float var638 = T(var360, var11, var566, var3, var637);
                                                                            float var639 = 0.16F * var638;
                                                                            int var640 = DP.Y(var6, var639);
                                                                            int var22 = var8 * -39381451;
                                                                            var22 ^= -1666161276;
                                                                            Uk(var1, var589, var623, var566, var630, var640, var22);
                                                                            var585 = var499 + 1;
                                                                            var499 = var585;
                                                                            var8 >>>= 16;
                                                                            var8 |= -1164152820;
                                                                            var8 *= 610961657;
                                                                            var8 ^= 512749149;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }

                                                    var8 >>>= 29;
                                                    var8 ^= 217465995;
                                                    var8 ^= -1175431376;
                                                    float[] var533 = this.xD;
                                                    float var577 = var491;
                                                    var577 *= 1.0F;
                                                    var577 = var402 + var577;
                                                    var577 /= var3;
                                                    var577 *= 2.9F;
                                                    var577 = Zk(var577);
                                                    var577 *= var5;
                                                    var577 = var4 - var577;
                                                    var533[var491] = var577;
                                                    var508 = var10;
                                                    var608 = var508 + 1L;
                                                    var608 = var508 * var608;
                                                    var508 = var608 & 1L;
                                                    long var679;
                                                    int var536 = (var679 = var508 - 0L) == 0L ? 0 : (var679 < 0L ? -1 : 1);
                                                    if (var536 != 0) {
                                                        var8 <<= 17;
                                                        var8 ^= 1977355902;
                                                        break label467;
                                                    }

                                                    var8 += -1632717731;
                                                    var8 ^= -737117177;
                                                    int var537 = var9 + 1;
                                                    int var538 = var9 * var537;
                                                    int var539 = var538 & 1;
                                                    if (var539 != 0) {
                                                        break;
                                                    }

                                                    int var540 = var491 + 1;
                                                    var491 = var540;
                                                    var8 ^= 1493998372;
                                                    var8 ^= -1066298379;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var334 = new UnsupportedOperationException();
                throw var334;
            }
        }

        UnsupportedOperationException var330 = new UnsupportedOperationException();
        throw var330;
    }

    private static void Uk(Canvas var0, float var1, float var2, float var3, float var4, int var5, int var6) {
        label47: {
            int var8 = var5;
            int var9 = System.identityHashCode(var0);
            float var10 = var3 - var1;
            float var49 = var10;
            float var11 = var4 - var2;
            float var50 = var11;
            float var12 = var10 * var10;
            float var13 = var11 * var11;
            var12 += var13;
            double var52 = var12;
            double var53 = Math.sqrt(var52);
            double var54 = var53 / 1.0;
            int var14 = var9 + 1;
            var14 = var9 * var14;
            int var15 = var9 + 2;
            var14 *= var15;
            var15 = var9 + 3;
            var14 *= var15;
            var14 &= 7;
            if (var14 != 0) {
                int var7 = var6 >>> 14;
                var7 *= 925886589;
                var7 &= -803589629;
                var7 ^= 1643398407;
            } else {
                int var23 = switch (var6) {
                    default -> var6 ^ -1538753853;
                    case -684633080 -> {
                        int var24 = var6 | -41830848;
                        var24 |= 1173987505;
                        var24 &= -1370973333;
                        yield var24 ^ 1415835474;
                    }
                    case 1315742863 -> var6 ^ -1366419769;
                };
                long var65 = var5;
                long var16 = var65 + 1L;
                var16 = var65 * var16;
                long var18 = var65 + 2L;
                var16 *= var18;
                long var66 = var65 + 3L;
                var16 *= var66;
                long var67 = var16 & 7L;
                long var99;
                var14 = (var99 = var67 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                if (var14 != 0) {
                    break label47;
                }

                double var55 = Math.ceil(var54);
                int var56 = (int)var55;
                int var57 = Math.max(1, var56);
                int var58 = var57;
                byte var59 = 0;
                int var60 = var59;
                var23 ^= 1537591158;
                var23 -= -1929743191;
                var23 &= 2094277093;
                var23 &= -1105376433;
                var23 ^= 155614561;

                while (true) {
                    if (var60 >= var58) {
                        var23 *= -117206831;
                        var23 += -1367038122;
                        var23 ^= 2087273682;
                        Integer var47 = var8;
                        if (var47 != null) {
                            return;
                        }
                        break label47;
                    }

                    var23 *= -817203351;
                    var23 ^= 1938469597;
                    long var69 = var8;
                    var16 = var69 + 1L;
                    var16 = var69 * var16;
                    long var70 = var16 & 1L;
                    long var100;
                    var14 = (var100 = var70 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    if (var14 != 0) {
                        break label47;
                    }

                    float var72 = var60;
                    float var78 = var58;
                    float var73 = var72 / var78;
                    long var79 = var9;
                    long var17 = var79 + 1L;
                    var17 = var79 * var17;
                    long var80 = var17 & 1L;
                    long var101;
                    var15 = (var101 = var80 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                    if (var15 != 0) {
                        var23 *= 283279541;
                        var23 |= -496697237;
                        var23 &= 1160797524;
                        var23 ^= 1640241494;
                        break;
                    }

                    var23 *= 148489009;
                    var23 ^= 1413386125;
                    var15 = var60 + 1;
                    float var83 = var15;
                    float var93 = var58;
                    float var84 = var83 / var93;
                    float var94 = var49 * var73;
                    float var95 = var1 + var94;
                    float var74 = var50 * var73;
                    float var75 = var2 + var74;
                    float var97 = var49 * var84;
                    float var98 = var1 + var97;
                    float var85 = var50 * var84;
                    float var86 = var2 + var85;
                    var0.line(var95, var75, var98, var86, 3.6F, var5);
                    var14 = var60 + 1;
                    var60 = var14;
                    var23 -= 442943096;
                    var23 += -366433745;
                    var23 <<= 12;
                    var23 *= 386748161;
                    var23 ^= 2104310885;
                }
            }

            UnsupportedOperationException var87 = new UnsupportedOperationException();
            throw var87;
        }

        IllegalStateException var48 = new IllegalStateException();
        throw var48;
    }

    private static float T(float var0, float var1, float var2, float var3, int var4) {
        label53: {
            int var6 = (int)var0;
            float var68;
            int var7 = (var68 = var0 - 0.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
            Integer var8 = var6;
            int var11;
            if (var8 == null) {
                var11 = var4 >>> 23;
                var11 += -160916499;
                var11 ^= -2017711748;
            } else {
                label55: {
                    var11 = var4 * -1898669661;
                    var11 >>= 21;
                    var11 &= -1450462868;
                    var11 -= -1716247226;
                    var11 ^= -2104329348;
                    int var59 = var11 + 1;
                    var59 = var11 * var59;
                    var59 &= 1;
                    if (var59 != 0) {
                        break label53;
                    }

                    float var56;
                    if (var7 < 0) {
                        var11 = switch (var11) {
                            default -> var11 ^ -275787686;
                            case -455499586 -> {
                                var11 <<= 1;
                                var11 -= 1079816492;
                                var11 <<= 21;
                                var11 ^= -717662837;
                                yield var11 ^ 934787090;
                            }
                            case 1005235611 -> var11 ^ 1611329672;
                        };
                        float var54 = var1 - var2;
                        var59 = var6 + 1;
                        var59 = var6 * var59;
                        int var9 = var6 + 2;
                        var59 *= var9;
                        var9 = var6 + 3;
                        var59 *= var9;
                        var59 &= 7;
                        if (var59 != 0) {
                            var11 -= 1735703800;
                            var11 -= 1709766941;
                            var11 &= 1911443857;
                            var11 |= 2075322045;
                            var11 ^= 174473835;
                            break label55;
                        }

                        var11 ^= 211944061;
                        var11 |= 653310409;
                        var11 ^= -1644103607;
                        float var55 = var54 / var3;
                        var56 = var55;
                        var11 >>= 4;
                        var11 += 652265420;
                        var11 ^= -2104913743;
                    } else {
                        var11 ^= -1455930620;
                        var11 *= -1839539135;
                        var11 ^= 95059922;
                        var56 = 1.0F;
                        var11 &= 153994794;
                        var11 |= -276633869;
                        var11 ^= 1131675148;
                    }

                    float var57 = 0.7F * var56;
                    Integer var48 = var6;
                    if (var48 != null) {
                        var11 += 1481622991;
                        var11 += -247667612;
                        var11 ^= 779309042;
                        var48 = var11;
                        if (var48 != null) {
                            return 1.0F - var57;
                        }
                        break label53;
                    }

                    switch (var11) {
                        case -1392961289:
                            var11 += 1755358412;
                            var11 &= 1159246822;
                            var11 -= -1919376389;
                            var11 |= -1437740413;
                            var11 ^= -1910937071;
                            break;
                        case 718289321:
                        default:
                            var11 ^= -771292648;
                            break;
                        case 1566672557:
                            var11 ^= 153973602;
                    }
                }
            }

            var6 = var11 + 1;
            var6 = var11 * var6;
            var7 = var11 + 2;
            var6 *= var7;
            var11 += 3;
            var6 *= var11;
            var11 = var6 & 7;
            if (var11 == 0) {
                IllegalArgumentException var43 = new IllegalArgumentException();
                throw var43;
            }
        }

        IllegalArgumentException var47 = new IllegalArgumentException();
        throw var47;
    }

    private static void C(Canvas var0, XK var1, float var2, float var3, float var4, float var5, int var6) {
        int var8 = System.identityHashCode(var0);
        int var9 = -1;
        int var10 = 0;
        long var11 = var8;
        long var13 = var11 + 1L;
        var13 = var11 * var13;
        long var15 = var11 + 2L;
        var13 *= var15;
        var11 += 3L;
        var13 *= var11;
        var11 = var13 & 7L;
        long var266;
        int var168 = (var266 = var11 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
        if (var168 != 0) {
            int var126 = var6 - 1190599576;
            var126 ^= -345276222;
            var126 -= -1783549253;
            var126 |= -310189102;
            var126 ^= -1843046716;
        } else {
            label187: {
                int var7 = var6 & 699138913;
                var7 <<= 10;
                var7 &= -1888121004;
                var7 *= 1832841503;
                var7 ^= 532434842;
                Integer var169 = var7;
                if (var169 != null) {
                    var9 = var9;
                    var10 = var10;

                    var7 = switch (var7) {
                        case -1565012070 -> {
                            var7 <<= 16;
                            yield var7 ^ 1824332435;
                        }
                        case -1548328165 -> var7 ^ -40842778;
                        default -> var7 ^ 1222295511;
                    };

                    while (true) {
                        int var170 = var7 + 1;
                        int var171 = var7 * var170;
                        int var12 = var7 + 2;
                        int var172 = var171 * var12;
                        var12 = var7 + 3;
                        int var173 = var172 * var12;
                        int var174 = var173 & 7;
                        if (var174 != 0) {
                            break;
                        }

                        float[] var175 = a;
                        int var176 = var175.length;
                        Integer var193 = var8;
                        if (var193 == null) {
                            switch (var7) {
                                case -1557718381:
                                    var7 += 2076183258;
                                    var7 ^= -1683660112;
                                    var7 *= 1534358353;
                                    var7 ^= 1927455442;
                                    break label187;
                                case -835697877:
                                    var7 ^= -963681035;
                                    break label187;
                                case 557788160:
                                default:
                                    var7 ^= -551913886;
                                    break label187;
                            }
                        }

                        var7 *= 979490715;
                        var7 ^= 408146640;
                        if (var10 >= var176) {
                            var7 >>= 8;
                            var7 += -2075356745;
                            var7 |= 462173196;
                            var7 ^= -153910285;
                            Integer var147 = var7;
                            if (var147 == null) {
                                break;
                            }

                            if (var9 < 0) {
                                var7 *= 502355167;
                                var7 *= -194493305;
                                var7 -= -680526122;
                                var7 ^= -1962914652;
                                var7 ^= 1837659499;
                                int var161 = var7 + 1;
                                var161 = var7 * var161;
                                int var190 = var7 + 2;
                                var161 *= var190;
                                int var191 = var7 + 3;
                                var161 *= var191;
                                var161 &= 7;
                                if (var161 == 0) {
                                    return;
                                }
                                break;
                            }

                            var7 &= -996191207;
                            var7 -= 111592555;
                            var7 ^= -636040678;
                            var7 |= -406897447;
                            var7 ^= 1912379379;
                            long var148 = var7;
                            long var201 = var148 + 1L;
                            long var202 = var148 * var201;
                            long var149 = var202 & 1L;
                            long var267;
                            int var150 = (var267 = var149 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                            if (var150 != 0) {
                                break;
                            }

                            float var151 = var1.C;
                            float var152 = var151 * 0.05F;
                            float var153 = TP.t(var152, 10.0F, 30.0F);
                            float var187 = var2 * 0.06F;
                            float var188 = Math.max(14.0F, var187);
                            float var189 = var2 - var188;
                            float var203 = var4 * 1.25F;
                            float var204 = var3 - var203;
                            int var216 = DP.Z(-12714100, -50373, var5);
                            float var220 = var153 * 0.42F;
                            int var227 = DP.Y(var216, 0.85F);
                            TextStyle var221 = TextStyle.of(var220, var227);
                            TextStyle var222 = var221.bold();
                            float var228 = var153 * 0.06F;
                            TextStyle var223 = var222.spacing(var228);
                            var15 = var8;
                            long var17 = var15 + 1L;
                            var17 = var15 * var17;
                            var15 = var17 & 1L;
                            long var268;
                            int var231 = (var268 = var15 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                            if (var231 != 0) {
                                var7 >>>= 19;
                                var7 ^= 1039184373;
                                var7 *= -1561888745;
                                var7 ^= -2018615148;
                                var7 ^= -774160280;
                                break label187;
                            }

                            var7 *= -454511629;
                            var7 += -2137228498;
                            var7 ^= -946505965;
                            TextStyle var232 = TextStyle.of(var153, var216);
                            TextStyle var233 = var232.semibold();
                            TextStyle var234 = var233.tabular();
                            int var217 = DP.Y(var216, 0.45F);
                            TextStyle var218 = var234.shadow(var217, 0.0F, 0.3F);
                            float var269;
                            int var235 = (var269 = var5 - 0.5F) == 0.0F ? 0 : (var269 < 0.0F ? -1 : 1);
                            String var239;
                            if (var235 > 0) {
                                var7 &= 1313765522;
                                var7 >>= 31;
                                var7 ^= -114777131;
                                var15 = var7;
                                var17 = var15 + 1L;
                                var17 = var15 * var17;
                                var15 = var17 & 1L;
                                long var270;
                                int var238 = (var270 = var15 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                                if (var238 != 0) {
                                    break;
                                }

                                var239 = "0";
                                var7 -= 1573551202;
                                var7 |= -762015352;
                                var7 ^= 1676291833;
                                var7 >>>= 27;
                                var7 ^= 1264178038;
                            } else {
                                var7 += -1246110069;
                                var7 ^= 1339600645;
                                int var16 = var7 + 1;
                                var16 = var7 * var16;
                                int var254 = var7 + 2;
                                var16 *= var254;
                                int var255 = var7 + 3;
                                var16 *= var255;
                                var16 &= 7;
                                if (var16 != 0) {
                                    break;
                                }

                                String[] var245 = z;
                                Integer var256 = var8;
                                if (var256 == null) {
                                    var7 += -2142943460;
                                    var7 ^= 814442426;
                                    break label187;
                                }
                                var7 = switch (var7) {
                                    case -859340951 -> {
                                        var7 <<= 14;
                                        yield var7 ^ -2074248468;
                                    }
                                    case -608074558 -> var7 ^ 807429931;
                                    default -> var7 ^ -104238126;
                                };
                                var17 = var7;
                                long var19 = var17 + 1L;
                                var19 = var17 * var19;
                                long var21 = var17 + 2L;
                                var19 *= var21;
                                var17 += 3L;
                                var19 *= var17;
                                var17 = var19 & 7L;
                                long var271;
                                int var260 = (var271 = var17 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                                if (var260 != 0) {
                                    break;
                                }

                                String var139 = var245[var9];
                                var239 = var139;
                                var7 -= -1504723364;
                                var7 &= 937587075;
                                var7 += -1875107034;
                                var7 ^= 1704609106;
                                var7 ^= -342030955;
                            }

                            var9 = var7 + 1;
                            var9 = var7 * var9;
                            int var246 = var7 + 2;
                            var9 *= var246;
                            var246 = var7 + 3;
                            var9 *= var246;
                            var9 &= 7;
                            if (var9 == 0) {
                                float var240 = var0.measure(var239, var218);
                                float var248 = var189 - var240;
                                float var261 = var0.measure("HR", var223);
                                float var249 = var248 - var261;
                                float var262 = var153 * 0.22F;
                                float var250 = var249 - var262;
                                float var154 = var153 * 0.1F;
                                float var155 = var204 + var154;
                                float var156 = var0.text("HR", var250, var155, var223);
                                var150 = var8 + 1;
                                var150 = var8 * var150;
                                int var224 = var8 + 2;
                                var150 *= var224;
                                var8 += 3;
                                var150 *= var8;
                                var8 = var150 & 7;
                                if (var8 != 0) {
                                    switch (var7) {
                                        case -1415632662:
                                            var7 ^= -1586882213;
                                            break label187;
                                        case 702209017:
                                        default:
                                            var7 ^= -1904722930;
                                            break label187;
                                        case 1264178017:
                                            var7 &= 1876399800;
                                            var7 ^= 920007455;
                                            break label187;
                                    }
                                }

                                var7 ^= -1060145490;
                                var7 >>= 3;
                                var7 &= 441610495;
                                var7 ^= 178816513;
                                Integer var134 = var7;
                                if (var134 != null) {
                                    float var135 = var189 - var240;
                                    float var136 = var0.text(var239, var135, var204, var218);
                                    return;
                                }
                            }
                            break;
                        }

                        var7 |= 1411530447;
                        var7 &= 1839108099;
                        var7 &= -1025290658;
                        var7 ^= 460240691;
                        Integer var177 = var7;
                        if (var177 == null) {
                            break;
                        }

                        float var178 = var1.jQ;
                        float[] var194 = a;
                        var13 = var8;
                        var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var13 = var15 & 1L;
                        long var272;
                        int var210 = (var272 = var13 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                        if (var210 != 0) {
                            var7 ^= -604456116;
                            var7 >>= 5;
                            var7 >>>= 2;
                            var7 <<= 27;
                            var7 ^= -1115184833;
                            break label187;
                        }

                        var7 += 623663989;
                        var7 ^= 1352890718;
                        int var211 = var7 + 1;
                        int var212 = var7 * var211;
                        int var14 = var7 + 2;
                        int var213 = var212 * var14;
                        var14 = var7 + 3;
                        int var214 = var213 * var14;
                        int var215 = var214 & 7;
                        if (var215 != 0) {
                            break;
                        }

                        float var195 = var194[var10];
                        float var273;
                        int var179 = (var273 = var178 - var195) == 0.0F ? 0 : (var273 < 0.0F ? -1 : 1);
                        int var185;
                        if (var179 >= 0) {
                            var7 -= -1078766093;
                            var7 |= 62370726;
                            var7 ^= -1850941187;
                            int var180 = var7 + 1;
                            int var181 = var7 * var180;
                            int var196 = var7 + 2;
                            int var182 = var181 * var196;
                            var196 = var7 + 3;
                            int var183 = var182 * var196;
                            int var184 = var183 & 7;
                            if (var184 != 0) {
                                break;
                            }

                            Integer var198 = var8;
                            if (var198 == null) {
                                var7 -= 1590223708;
                                var7 *= -251413371;
                                var7 ^= 494496713;
                                break label187;
                            }
                            var7 = switch (var7) {
                                case -2112137382 -> {
                                    var7 &= -41334396;
                                    var7 += 1758507233;
                                    yield var7 ^ -279753476;
                                }
                                case -1938029747 -> var7 ^ -1304352328;
                                default -> var7 ^ -49180928;
                            };
                            var185 = var10;
                            var7 |= 536932781;
                            var7 |= -934655820;
                            var7 ^= 2027794668;
                        } else {
                            var7 ^= 1602263515;
                            var7 ^= 777091601;
                            var193 = var7;
                            if (var193 == null) {
                                break;
                            }

                            var185 = var9;
                            var7 >>= 30;
                            var7 >>= 6;
                            var7 ^= 1760080558;
                        }

                        int var200 = var10 + 1;
                        var9 = var185;
                        Integer var186 = var8;
                        if (var186 == null) {
                            switch (var7) {
                                case -1760080559:
                                    var7 &= 1928660586;
                                    var7 ^= 578643200;
                                    var7 ^= 1307558015;
                                    break label187;
                                case 267710953:
                                    var7 ^= 146387258;
                                    break label187;
                                case 1979114697:
                                default:
                                    var7 ^= 1014006749;
                                    break label187;
                            }
                        }
                        var7 = switch (var7) {
                            case -1928497782 -> var7 ^ 1926175277;
                            case -1760080559 -> {
                                var7 ^= 158446828;
                                var7 |= 289256722;
                                var7 &= 1089714464;
                                var7 += -148484080;
                                yield var7 ^ -1655065214;
                            }
                            default -> var7 ^ 1469782503;
                        };
                        var10 = var200;
                        var7 |= 214142689;
                        var7 &= -96394322;
                        var7 <<= 19;
                        var7 *= -442259677;
                        var7 ^= -233366893;
                    }
                }

                IllegalArgumentException var137 = new IllegalArgumentException();
                throw var137;
            }
        }

        UnsupportedOperationException var131 = new UnsupportedOperationException();
        throw var131;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 318680880;
        int var2 = vS_2.Ol;
        int var4 = of_2.kj(var3, var1, var2);
        bD = var4;
        float[] var5 = new float[]{0.32F, 1.12F, 2.0F};
        a = var5;
        float[] var6 = new float[]{1.0F, 0.72F, 0.4F};
        xk = var6;
        String[] var7 = new String[]{"78", "75", "68"};
        z = var7;
    }
}
