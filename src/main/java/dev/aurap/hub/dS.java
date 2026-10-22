package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class dS {
    public static final int K = 128;
    public static final int W = 256;
    private static final float wa = 0.5F;
    private static final int V = 18;
    private static final float bu = (float) (Math.PI * 2);
    public static final int JS;

    private dS() {
    }

    public static float iW(float var0, float var1) {
        int var2 = JS;
        var2 ^= 1543696428;
        int var3 = (int)var0;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 != 0) {
            var2 ^= 413571902;
            var2 |= -1658472827;
            var2 ^= 1784937782;
            var2 ^= 109465853;
            Integer var17 = var2;
            if (var17 != null) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        } else {
            var2 -= 91498310;
            var2 += -422863369;
            var2 ^= 1251530011;
            var2 ^= 231026632;
            Integer var19 = var2;
            if (var19 != null) {
                float[] var21 = new float[3];
                var2 |= 1439059786;
                var2 ^= -1028998081;
                return maxChroma(var0, var1, var21, var2);
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    static float maxChroma(float var0, float var1, float[] var2, int var3) {
        label128: {
            int var5 = (int)var0;
            int var6 = var5 + 1;
            var6 = var5 * var6;
            int var7 = var5 + 2;
            var6 *= var7;
            var7 = var5 + 3;
            var6 *= var7;
            var6 &= 7;
            int var22;
            if (var6 != 0) {
                var22 = var3 + -961548086;
                var22 *= -893766183;
                var22 ^= 1978352921;
                var22 ^= 1515846679;
            } else {
                var22 = var3 * -755599247;
                var22 ^= 905823532;
                var22 ^= -1257467180;
                var22 <<= 12;
                var22 ^= -873791657;
                float var234;
                var6 = (var234 = var0 - 0.0F) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                if (var6 <= 0) {
                    var22 *= 116901709;
                    var22 |= -1269429042;
                    var22 ^= -1066564096;
                    return 0.0F;
                }

                var22 *= -2117787765;
                var22 -= 1050456045;
                var22 >>= 29;
                var22 ^= 469350381;
                Integer var118 = var22;
                if (var118 == null) {
                    break label128;
                }

                float var235;
                int var119 = (var235 = var0 - 1.0F) == 0.0F ? 0 : (var235 < 0.0F ? -1 : 1);
                long var130 = var5;
                long var9 = var130 + 1L;
                var9 = var130 * var9;
                long var11 = var130 + 2L;
                var9 *= var11;
                long var131 = var130 + 3L;
                var9 *= var131;
                long var132 = var9 & 7L;
                long var236;
                var7 = (var236 = var132 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                if (var7 != 0) {
                    var22 -= -1218170607;
                    var22 ^= 1344355517;
                } else {
                    var22 *= -945312765;
                    var22 >>= 10;
                    var22 *= 1372714379;
                    var22 ^= 888972469;
                    if (var119 >= 0) {
                        var22 |= 702174041;
                        var22 &= 533284198;
                        var22 ^= 1693674923;
                        return 0.0F;
                    }

                    var22 -= 2037606242;
                    var22 &= 378436726;
                    var22 <<= 15;
                    var22 &= 1182941744;
                    var22 ^= -2113991087;
                    var119 = var22 + 1;
                    var119 = var22 * var119;
                    var7 = var22 + 2;
                    var119 *= var7;
                    var7 = var22 + 3;
                    var119 *= var7;
                    var119 &= 7;
                    if (var119 != 0) {
                        break label128;
                    }

                    double var125 = var1;
                    double var126 = Math.cos(var125);
                    float var127 = (float)var126;
                    float var128 = var127;
                    double var136 = var1;
                    double var137 = Math.sin(var136);
                    float var138 = (float)var137;
                    float var139 = var138;
                    float var8 = 0.0F;
                    float var144 = 0.5F;
                    long var10 = var5;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    long var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var237;
                    int var154 = (var237 = var10 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                    if (var154 != 0) {
                        switch (var22) {
                            case -2080436655:
                                var22 >>>= 10;
                                var22 ^= -916046126;
                                var22 += 64634412;
                                var22 ^= -107723427;
                                break;
                            case -1400332643:
                            default:
                                var22 ^= 1585290813;
                                break;
                            case 302847438:
                                var22 ^= -142154289;
                        }
                    } else {
                        var22 = switch (var22) {
                            case -2080436655 -> {
                                var22 &= 1740049541;
                                yield var22 ^ -143365172;
                            }
                            default -> var22 ^ -1266352885;
                            case 2076486250 -> var22 ^ 19616896;
                        };
                        int var155 = var22 + 1;
                        int var156 = var22 * var155;
                        int var162 = var22 + 2;
                        int var157 = var156 * var162;
                        int var163 = var22 + 3;
                        int var158 = var157 * var163;
                        int var159 = var158 & 7;
                        if (var159 != 0) {
                            break label128;
                        }

                        byte var160 = 0;
                        var8 = var8;
                        float var145 = var144;
                        int var161 = var160;

                        var22 = switch (var22) {
                            default -> var22 ^ 902287297;
                            case -1109208046 -> var22 ^ 2093665761;
                            case -188520499 -> {
                                var22 <<= 12;
                                yield var22 ^ 273999236;
                            }
                        };

                        while (true) {
                            int var164 = var22 + 1;
                            int var165 = var22 * var164;
                            int var176 = var22 + 2;
                            int var166 = var165 * var176;
                            int var177 = var22 + 3;
                            int var167 = var166 * var177;
                            int var168 = var167 & 7;
                            if (var168 != 0) {
                                break label128;
                            }

                            if (var161 >= 18) {
                                var22 -= 1989881443;
                                var22 ^= -2066407757;
                                var22 += -1432581045;
                                var22 ^= 806415534;
                                long var108 = var22;
                                var9 = var108 + 1L;
                                var9 = var108 * var9;
                                var11 = var108 + 2L;
                                var9 *= var11;
                                long var109 = var108 + 3L;
                                var9 *= var109;
                                long var110 = var9 & 7L;
                                long var238;
                                var5 = (var238 = var110 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                                if (var5 == 0) {
                                    return var8;
                                }
                                break label128;
                            }

                            var22 += 320733538;
                            var22 |= 1800781313;
                            var22 ^= 306846819;
                            float var169 = var8 + var145;
                            float var170 = var169 * 0.5F;
                            var2[0] = var0;
                            int var178 = var5 + 1;
                            int var179 = var5 * var178;
                            int var13 = var5 + 2;
                            int var180 = var179 * var13;
                            var13 = var5 + 3;
                            int var181 = var180 * var13;
                            int var182 = var181 & 7;
                            if (var182 != 0) {
                                var22 ^= 1276213948;
                                var22 ^= 297296472;
                                break;
                            }

                            var22 |= 300602127;
                            var22 *= -2114075373;
                            var22 ^= -1135803159;
                            var22 ^= -145657750;
                            float var183 = var170 * var128;
                            var2[1] = var183;
                            float var184 = var170 * var139;
                            var2[2] = var184;
                            ed.N(var2);
                            int var185 = var22 >> 28;
                            int var186 = var185 & 121229661;
                            int var187 = var186 ^ -669919378;
                            boolean var188 = l(var2, var187);
                            float var189;
                            float var198;
                            if (var188) {
                                var22 *= -284202569;
                                var22 *= 800653233;
                                var22 >>>= 28;
                                var22 |= 1412061607;
                                var22 ^= 1252516453;
                                var189 = var170;
                                long var191 = var5;
                                long var15 = var191 + 1L;
                                var15 = var191 * var15;
                                long var17 = var191 + 2L;
                                var15 *= var17;
                                long var192 = var191 + 3L;
                                var15 *= var192;
                                long var193 = var15 & 7L;
                                long var239;
                                var13 = (var239 = var193 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                                if (var13 != 0) {
                                    var22 -= -1129574927;
                                    var22 |= 1754794273;
                                    var22 ^= 1565333401;
                                    break;
                                }

                                var22 <<= 18;
                                var22 *= -1825345861;
                                var22 ^= 1191520063;
                                var22 ^= 179531281;
                                var22 ^= 834802853;
                                var13 = var22 + 1;
                                var13 = var22 * var13;
                                var13 &= 1;
                                if (var13 != 0) {
                                    break label128;
                                }

                                var198 = var145;
                                var22 |= 859388186;
                                var22 <<= 11;
                                var22 -= -1805994677;
                                var22 ^= -1083981397;
                            } else {
                                var22 ^= 1084293633;
                                var22 ^= -48654300;
                                var14 = var5;
                                long var16 = var14 + 1L;
                                var16 = var14 * var16;
                                long var18 = var14 + 2L;
                                var16 *= var18;
                                var14 += 3L;
                                var16 *= var14;
                                var14 = var16 & 7L;
                                long var240;
                                int var202 = (var240 = var14 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                                if (var202 != 0) {
                                    var22 += 110698891;
                                    var22 -= 764698817;
                                    var22 ^= 1049889637;
                                    break;
                                }

                                var22 += -1540132680;
                                var22 |= -1176047798;
                                var22 ^= -245173991;
                                var14 = var22;
                                var16 = var14 + 1L;
                                var16 = var14 * var16;
                                var18 = var14 + 2L;
                                var16 *= var18;
                                var14 += 3L;
                                var16 *= var14;
                                var14 = var16 & 7L;
                                long var241;
                                int var206 = (var241 = var14 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                                if (var206 != 0) {
                                    break label128;
                                }

                                var189 = var8;
                                var198 = var170;
                                var22 |= 469397331;
                                var22 *= 1056387195;
                                var22 ^= 2110057183;
                            }

                            int var171 = var161 + 1;
                            var14 = var5;
                            long var228 = var14 + 1L;
                            var228 = var14 * var228;
                            long var233 = var14 + 2L;
                            var228 *= var233;
                            var14 += 3L;
                            var228 *= var14;
                            var14 = var228 & 7L;
                            long var242;
                            int var210 = (var242 = var14 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                            if (var210 != 0) {
                                var22 *= 2031503393;
                                var22 *= 1429433557;
                                var22 &= 765303054;
                                var22 ^= -625955425;
                                var22 ^= -880435207;
                                break;
                            }

                            var22 |= -1346375281;
                            var22 -= -312895159;
                            var22 >>>= 21;
                            var22 -= 1607806295;
                            var22 ^= 1233593593;
                            int var211 = var22 + 1;
                            int var212 = var22 * var211;
                            int var219 = var22 + 2;
                            int var213 = var212 * var219;
                            var219 = var22 + 3;
                            int var214 = var213 * var219;
                            int var215 = var214 & 7;
                            if (var215 != 0) {
                                break label128;
                            }

                            var8 = var189;
                            var145 = var198;
                            var161 = var171;
                            var22 |= -531966918;
                            var22 -= -1065739924;
                            var22 += 792255320;
                            var22 ^= 2122747375;
                        }
                    }
                }
            }

            long var104 = var22;
            long var146 = var104 + 1L;
            var146 = var104 * var146;
            long var105 = var146 & 1L;
            long var243;
            var5 = (var243 = var105 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalStateException var107 = new IllegalStateException();
                throw var107;
            }
        }

        IllegalStateException var112 = new IllegalStateException();
        throw var112;
    }

    private static boolean l(float[] var0, int var1) {
        label93: {
            int var3 = System.identityHashCode(var0);
            float[] var4 = var0;
            int var5 = var0.length;
            Integer var6 = var3;
            int var17;
            if (var6 != null) {
                var17 = var1 - 2108675605;
                var17 ^= 713690661;
                var5 = var5;
                byte var78 = 0;
                int var79 = var78;
                var17 += -313816915;
                var17 ^= -899900430;
                var17 += -1392044588;
                var17 ^= 2017019347;
                var17 ^= -39392685;

                while (true) {
                    if (var79 >= var5) {
                        var17 *= 1349243025;
                        var17 <<= 7;
                        var17 *= 1917753211;
                        var17 &= -304502490;
                        var17 ^= -1058865943;
                        return true;
                    }

                    var17 -= -546979264;
                    var17 *= -1614880625;
                    var17 *= 2058713245;
                    var17 += 64425785;
                    var17 ^= -1156376665;
                    int var7 = var17 + 1;
                    var7 = var17 * var7;
                    var7 &= 1;
                    if (var7 != 0) {
                        break label93;
                    }

                    float var82 = var4[var79];
                    Integer var8 = var3;
                    if (var8 == null) {
                        var17 -= -588256284;
                        var17 >>>= 31;
                        var17 |= 883080803;
                        var17 ^= -124343509;
                        break;
                    }

                    var17 -= -1494956696;
                    var17 *= 1899717697;
                    var17 >>>= 19;
                    var17 ^= 383763870;
                    var8 = var17;
                    if (var8 == null) {
                        break label93;
                    }

                    float var119;
                    int var91 = (var119 = var82 - -1.0E-6F) == 0.0F ? 0 : (var119 < 0.0F ? -1 : 1);
                    if (var91 < 0) {
                        var17 ^= -664715041;
                        var17 += -1419151565;
                        var17 ^= -1320945165;
                        var17 *= 79750301;
                        var17 ^= 242624048;
                        return false;
                    }

                    var17 -= -1047096281;
                    var17 >>>= 8;
                    var17 &= -1569059484;
                    var17 ^= 567869399;
                    long var92 = var17;
                    long var10 = var92 + 1L;
                    var10 = var92 * var10;
                    long var12 = var92 + 2L;
                    var10 *= var12;
                    long var93 = var92 + 3L;
                    var10 *= var93;
                    long var94 = var10 & 7L;
                    long var120;
                    var91 = (var120 = var94 - 0L) == 0L ? 0 : (var120 < 0L ? -1 : 1);
                    if (var91 != 0) {
                        break label93;
                    }

                    float var121;
                    var7 = (var121 = var82 - 1.000001F) == 0.0F ? 0 : (var121 < 0.0F ? -1 : 1);
                    long var96 = var3;
                    var10 = var96 + 1L;
                    var10 = var96 * var10;
                    var12 = var96 + 2L;
                    var10 *= var12;
                    long var97 = var96 + 3L;
                    var10 *= var97;
                    long var98 = var10 & 7L;
                    long var122;
                    var91 = (var122 = var98 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                    if (var91 != 0) {
                        var17 += 1873524972;
                        var17 |= -1407226798;
                        var17 ^= 1896610491;
                        break;
                    }

                    var17 += -1776789990;
                    var17 |= -1399278864;
                    var17 -= -567595085;
                    var17 ^= -2065875095;
                    if (var7 > 0) {
                        var17 ^= -1826273568;
                        var17 *= 1227977161;
                        var17 |= 954156125;
                        var17 >>>= 10;
                        var17 ^= 1726648671;
                        return false;
                    }

                    var17 <<= 30;
                    var17 ^= 1858995529;
                    var7 = var17 + 1;
                    var7 = var17 * var7;
                    var91 = var17 + 2;
                    var7 *= var91;
                    var91 = var17 + 3;
                    var7 *= var91;
                    var7 &= 7;
                    if (var7 != 0) {
                        break label93;
                    }

                    var7 = var79 + 1;
                    var91 = var3 + 1;
                    var91 = var3 * var91;
                    var91 &= 1;
                    if (var91 != 0) {
                        var17 ^= 11219495;
                        var17 -= 759607385;
                        var17 |= 505488221;
                        var17 ^= -42864902;
                        var17 ^= -1367712529;
                        break;
                    }

                    var17 *= 1888897001;
                    var17 ^= 459185224;
                    var91 = var17 + 1;
                    var91 = var17 * var91;
                    int var9 = var17 + 2;
                    var91 *= var9;
                    var9 = var17 + 3;
                    var91 *= var9;
                    var91 &= 7;
                    if (var91 != 0) {
                        break label93;
                    }

                    var79 = var7;
                    switch (var17) {
                        case -762931642:
                        default:
                            var17 ^= -676441927;
                            break;
                        case 645050961:
                            var17 ^= 373523771;
                            break;
                        case 1587450425:
                            var17 -= -280432697;
                            var17 -= 1926496637;
                            var17 += -43770158;
                            var17 >>>= 30;
                            var17 ^= 637000852;
                    }
                }
            } else {
                var17 = var1 * 1358312289;
                var17 += 1746055459;
                var17 *= 166331899;
                var17 |= -1213456685;
                var17 ^= 1942653851;
            }

            Integer var69 = var17;
            if (var69 != null) {
                IllegalArgumentException var70 = new IllegalArgumentException();
                throw var70;
            }
        }

        AssertionError var71 = new AssertionError();
        throw var71;
    }

    public static float[] Tw() {
        int var0 = JS;
        var0 ^= 776530637;
        float[] var1 = Q.I;
        switch (var0) {
            case -2147286449:
                var0 ^= -1033589691;
                break;
            case -2139378927:
            default:
                var0 ^= -1511328890;
                break;
            case 1571714976:
                var0 += 1877342851;
                var0 ^= -1720934538;
                var0 |= 118163589;
                var0 -= -1401603277;
                var0 ^= 881235283;
        }

        Object var10 = var1.clone();
        return (float[])var10;
    }

    public static float PE(float var0, float var1) {
        int var2 = JS;
        var2 ^= 1665823300;
        int var3 = (int)var0;
        float[] var4 = Q.I;
        float var5 = var1 / (float) (Math.PI * 2);
        var5 += 0.5F;
        var5 *= 256.0F;
        float var6 = Math.min(1.0F, var0);
        var6 = Math.max(0.0F, var6);
        var6 *= 127.0F;
        double var7 = var5;
        var7 = Math.floor(var7);
        int var47 = (int)var7;
        int var8 = (int)var6;
        var8 = Math.min(var8, 126);
        float var9 = var47;
        var5 -= var9;
        var9 = var8;
        var6 -= var9;
        int var48 = Math.floorMod(var47, 256);
        int var58 = var3 + 1;
        int var59 = var3 * var58;
        var3 = var59 & 1;
        if (var3 == 0) {
            var2 >>>= 28;
            var2 ^= 249649269;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var60 = var2 + 2;
            var3 *= var60;
            int var61 = var2 + 3;
            var3 *= var61;
            var3 &= 7;
            if (var3 == 0) {
                var3 = var48 + 1;
                var3 %= 256;
                var8 *= 256;
                int var62 = var8 + 256;
                int var10 = var8 + var48;
                float var63 = var4[var10];
                int var11 = var8 + var3;
                float var66 = var4[var11];
                var8 += var48;
                float var53 = var4[var8];
                float var54 = var66 - var53;
                float var55 = var54 * var5;
                float var56 = var63 + var55;
                var10 = var62 + var48;
                float var65 = var4[var10];
                var3 = var62 + var3;
                float var31 = var4[var3];
                int var49 = var62 + var48;
                float var39 = var4[var49];
                float var32 = var31 - var39;
                float var33 = var32 * var5;
                float var34 = var65 + var33;
                float var35 = var34 - var56;
                float var36 = var35 * var6;
                return var56 + var36;
            }
        } else {
            var2 *= 1858018771;
            var2 *= -533833697;
            var2 += -1461293822;
            var2 ^= -467671689;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        }

        AssertionError var20 = new AssertionError();
        throw var20;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 967795929;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        JS = var4;
    }
}
