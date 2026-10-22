package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class zT {
    public static final float i = 0.5646216F;
    public static final float j = 4.0F;
    public static final float qQ = 0.9F;
    private static final float QZ = 0.01F;
    private float P;
    private float VY;
    private float II = 1.0F;
    private float a = 1.0F;
    public static final int Z;

    public zT() {
    }

    public void KT() {
        int var1 = Z;
        var1 ^= 1477637486;
        int var2 = System.identityHashCode(this);
        this.P = 0.0F;
        this.VY = 0.0F;
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var39;
        var2 = (var39 = var23 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1751190865;
            var1 ^= -1234936443;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                RuntimeException var30 = new RuntimeException();
                throw var30;
            }
        } else {
            var1 >>>= 6;
            var1 >>= 18;
            var1 *= 1968045709;
            var1 ^= 1977244128;
            var1 ^= -1325543832;
            long var16 = var1;
            long var32 = var16 + 1L;
            var32 = var16 * var32;
            long var5 = var16 + 2L;
            var32 *= var5;
            long var17 = var16 + 3L;
            var32 *= var17;
            long var18 = var32 & 7L;
            long var40;
            var1 = (var40 = var18 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var1 == 0) {
                this.II = 1.0F;
                this.a = 1.0F;
                return;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public void U(float var1, float var2, float var3, float var4) {
        int var5 = Z;
        var5 ^= -2046925358;
        int var6 = System.identityHashCode(this);
        float var7 = this.P;
        var7 += var1;
        var7 = TP.jA(var7);
        this.P = var7;
        var7 = this.VY;
        var7 += var2;
        this.VY = var7;
        var7 = this.II;
        float var8 = Math.max(0.0F, var3);
        var7 *= var8;
        int var30 = var6 + 1;
        int var31 = var6 * var30;
        var6 = var31 & 1;
        if (var6 == 0) {
            var5 >>>= 9;
            var5 += -1263917597;
            var5 ^= -410631177;
            this.II = var7;
            float var21 = this.a;
            var7 = Math.max(0.0F, var4);
            float var22 = var21 * var7;
            this.a = var22;
        } else {
            var5 ^= -1039823268;
            var5 ^= -1889782704;
            var6 = var5 + 1;
            var6 = var5 * var6;
            var5 = var6 & 1;
            if (var5 != 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        }
    }

    public boolean OP() {
        label103: {
            int var1 = Z;
            var1 ^= 1889083437;
            int var2 = System.identityHashCode(this);
            float var3 = this.P;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var121;
            int var99 = (var121 = var4 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
            if (var99 != 0) {
                var1 |= 51130818;
                var1 ^= -81743132;
                var1 ^= 186718311;
            } else {
                label112: {
                    var1 ^= -1244455636;
                    var1 >>>= 3;
                    var1 &= 2075828673;
                    var1 <<= 19;
                    var1 ^= -1252552213;
                    int var100 = var1 + 1;
                    int var101 = var1 * var100;
                    int var102 = var101 & 1;
                    if (var102 != 0) {
                        break label103;
                    }

                    var3 = Math.abs(var3);
                    float var122;
                    int var78 = (var122 = var3 - 0.001F) == 0.0F ? 0 : (var122 < 0.0F ? -1 : 1);
                    if (var78 < 0) {
                        var1 = switch (var1) {
                            case -1319661077 -> {
                                var1 <<= 3;
                                var1 += 1842752608;
                                yield var1 ^ -1705213030;
                            }
                            default -> var1 ^ 944840028;
                            case 653923928 -> var1 ^ -1895546476;
                        };
                        int var79 = var1 + 1;
                        int var80 = var1 * var79;
                        int var103 = var1 + 2;
                        int var81 = var80 * var103;
                        int var104 = var1 + 3;
                        int var82 = var81 * var104;
                        int var83 = var82 & 7;
                        if (var83 != 0) {
                            break label103;
                        }

                        var3 = this.VY;
                        int var105 = var2 + 1;
                        int var106 = var2 * var105;
                        int var107 = var106 & 1;
                        if (var107 != 0) {
                            switch (var1) {
                                case -563527153:
                                default:
                                    var1 ^= -1476047322;
                                    break label112;
                                case 1000225793:
                                    var1 ^= -1388155213;
                                    break label112;
                                case 1657681954:
                                    var1 -= -1408016474;
                                    var1 -= 1221901601;
                                    var1 += 995824533;
                                    var1 ^= -1369588344;
                                    break label112;
                            }
                        }

                        var1 <<= 17;
                        var1 |= -553559176;
                        var1 |= -96030829;
                        var1 ^= -2014502154;
                        Integer var108 = var1;
                        if (var108 == null) {
                            break label103;
                        }

                        var3 = Math.abs(var3);
                        float var123;
                        int var86 = (var123 = var3 - 1.0E-4F) == 0.0F ? 0 : (var123 < 0.0F ? -1 : 1);
                        if (var86 < 0) {
                            var1 -= -157887011;
                            var1 >>= 4;
                            var1 |= 1015195630;
                            var1 &= -1394156304;
                            var1 ^= 1753031989;
                            Integer var87 = var1;
                            if (var87 == null) {
                                break label103;
                            }

                            var3 = this.II;
                            var3 = Math.abs(--var3);
                            var4 = var2;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var124;
                            int var111 = (var124 = var4 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                            if (var111 != 0) {
                                var1 |= -1627674025;
                                var1 -= -12109880;
                                var1 ^= 1059835578;
                                var1 ^= -409998899;
                                break label112;
                            }

                            var1 -= 599281404;
                            var1 ^= 393747378;
                            float var125;
                            int var91 = (var125 = var3 - 1.0E-4F) == 0.0F ? 0 : (var125 < 0.0F ? -1 : 1);
                            if (var91 < 0) {
                                var1 |= -1786260442;
                                var1 *= -573979449;
                                var1 &= 431884941;
                                var1 ^= -826781891;
                                Integer var92 = var1;
                                if (var92 == null) {
                                    break label103;
                                }

                                var3 = this.a;
                                var3--;
                                int var112 = var2 + 1;
                                int var113 = var2 * var112;
                                int var5 = var2 + 2;
                                int var114 = var113 * var5;
                                var2 += 3;
                                int var115 = var114 * var2;
                                var2 = var115 & 7;
                                if (var2 != 0) {
                                    var1 += -233603149;
                                    var1 ^= 1412797726;
                                    var1 &= 1166131546;
                                    var1 ^= 60609312;
                                    break label112;
                                }

                                var1 *= -338902185;
                                var1 ^= 1709147455;
                                Integer var73 = var1;
                                if (var73 == null) {
                                    break label103;
                                }

                                float var74 = Math.abs(var3);
                                float var126;
                                int var75 = (var126 = var74 - 1.0E-4F) == 0.0F ? 0 : (var126 < 0.0F ? -1 : 1);
                                if (var75 < 0) {
                                    var1 *= -1169689753;
                                    var1 >>>= 20;
                                    var1 ^= 102416972;
                                    var1 ^= 1145689624;
                                    boolean var76 = true;
                                    var1 ^= 1202996382;
                                    var1 ^= -1185458986;
                                    return var76;
                                }

                                var1 &= -155822158;
                                var1 -= -2101234185;
                                var1 ^= -1797677509;
                            } else {
                                var1 >>>= 6;
                                var1 ^= -1273289701;
                                var1 |= -126525441;
                                var1 ^= 1274044639;
                            }
                        } else {
                            switch (var1) {
                                case -556976866:
                                    var1 ^= -839487673;
                                    break;
                                case 1841419753:
                                default:
                                    var1 ^= -1711046795;
                                    break;
                                case 2024463629:
                                    var1 *= -675112939;
                                    var1 *= 1752273347;
                                    var1 ^= 902202579;
                            }
                        }
                    } else {
                        var1 ^= -240708925;
                        var1 ^= -168313848;
                    }

                    boolean var127 = false;
                    var1 <<= 12;
                    var1 |= 1911493715;
                    var1 ^= -816899510;
                    return var127;
                }
            }

            AssertionError var96 = new AssertionError();
            throw var96;
        }

        IllegalStateException var95 = new IllegalStateException();
        throw var95;
    }

    public float o() {
        int var1 = Z;
        var1 ^= 1321286173;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 |= -952365442;
            var1 >>= 31;
            var1 *= 1904859617;
            var1 *= 1424673667;
            var1 ^= -1591940464;
            long var15 = var1;
            long var4 = var15 + 1L;
            var4 = var15 * var4;
            long var16 = var4 & 1L;
            long var21;
            int var17 = (var21 = var16 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var17 != 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            } else {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        } else {
            var1 >>= 3;
            var1 ^= -1470067887;
            return this.P;
        }
    }

    public float CW() {
        int var1 = Z;
        var1 ^= 886521822;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 &= -636690681;
            var1 += 891695028;
            var1 -= -2097562318;
            var1 += 901063989;
            var1 ^= 591066717;
            UnsupportedOperationException var25 = new UnsupportedOperationException();
            throw var25;
        } else {
            var1 ^= 1602232973;
            var1 &= -1070699085;
            var1 |= 1890915142;
            var1 -= 1503208060;
            var1 ^= -21648370;
            long var13 = var1;
            long var29 = var13 + 1L;
            long var30 = var13 * var29;
            long var5 = var13 + 2L;
            long var31 = var30 * var5;
            long var14 = var13 + 3L;
            long var32 = var31 * var14;
            long var15 = var32 & 7L;
            long var33;
            var1 = (var33 = var15 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.VY;
            } else {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            }
        }
    }

    public float Re() {
        int var1 = Z;
        var1 ^= -250949985;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 += 1493770253;
            var1 &= -1384796320;
            var1 ^= -151135647;
            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        } else {
            switch (var1) {
                case -332937703:
                default:
                    var1 ^= 1996607716;
                    break;
                case -162311318:
                    var1 ^= -1392480474;
                    break;
                case 1988818891:
                    var1 += 2083561205;
                    var1 ^= 997343278;
                    var1 ^= 76618277;
            }

            return this.II;
        }
    }

    public float vb() {
        int var1 = Z;
        var1 ^= 1235293092;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 &= 876792971;
            var1 ^= 2070732451;
            var1 += -11245779;
            var1 ^= -1040715619;
            return this.a;
        } else {
            var1 >>= 17;
            var1 ^= 964599462;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            } else {
                AssertionError var9 = new AssertionError();
                throw var9;
            }
        }
    }

    public float j() {
        int var1 = Z;
        var1 ^= -1389494518;
        int var2 = System.identityHashCode(this);
        float var3 = this.VY;
        var3 = -var3;
        double var23 = var3;
        double var24 = Math.pow(2.0, var23);
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var31;
        var2 = (var31 = var5 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 1175927940;
            var1 ^= 183736293;
            var5 = var1;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var32;
            var2 = (var32 = var5 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            var1 ^= 921709443;
            var1 >>>= 10;
            var1 += -1487853412;
            var1 += -1931658609;
            var1 ^= -694489330;
            Integer var17 = var1;
            if (var17 != null) {
                return (float)var24;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    public float qA() {
        int var1 = Z;
        var1 ^= -1475084468;
        int var2 = System.identityHashCode(this);
        float var3 = this.a;
        Integer var21 = var2;
        if (var21 == null) {
            var1 *= 1230951367;
            var1 |= 927084701;
            var1 >>= 11;
            var1 &= -2021314163;
            var1 ^= 1006123745;
            IllegalStateException var22 = new IllegalStateException();
            throw var22;
        } else {
            var1 <<= 5;
            var1 |= -1754199030;
            var1 += 141555084;
            var1 -= 1169949938;
            var1 ^= 977073243;
            long var12 = var1;
            long var4 = var12 + 1L;
            var4 = var12 * var4;
            long var13 = var4 & 1L;
            long var24;
            var1 = (var24 = var13 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var1 == 0) {
                return Math.max(var3, 0.01F);
            } else {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        }
    }

    public float V() {
        int var1 = Z;
        var1 ^= -492747237;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 >>>= 24;
            var1 -= -1024662735;
            var1 ^= 47948443;
            var12 = var1;
            if (var12 == null) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            } else {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        } else {
            var1 -= -1312617122;
            var1 &= 2004097605;
            var1 ^= -171929034;
            float var8 = this.II;
            float var13 = this.P;
            float var14 = var13 * (float) (Math.PI / 180.0);
            double var15 = var14;
            double var16 = Math.cos(var15);
            float var17 = (float)var16;
            return var8 * var17;
        }
    }

    public float O() {
        int var1 = Z;
        var1 ^= -1576221525;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= -1544406815;
            var1 += 1718558537;
            var1 += 10223490;
            var1 ^= -1768537333;
            var1 ^= -722396679;
            long var21 = var1;
            long var4 = var21 + 1L;
            var4 = var21 * var4;
            long var22 = var4 & 1L;
            long var34;
            var2 = (var34 = var22 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                float var24 = this.II;
                float var26 = this.P;
                float var27 = var26 * (float) (Math.PI / 180.0);
                double var28 = var27;
                double var29 = Math.sin(var28);
                float var30 = (float)var29;
                return var24 * var30;
            }
        } else {
            long var15 = switch (var1) {
                case -218240229 -> var1 ^ 2045595560;
                case 629997055 -> {
                    var1 *= -2051510255;
                    var1 += -1415286094;
                    yield var1 ^ 2130318874;
                }
                default -> var1 ^ 354969816;
            };
            long var31 = var15 + 1L;
            long var32 = var15 * var31;
            long var16 = var32 & 1L;
            long var35;
            var1 = (var35 = var16 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public float PF(float var1) {
        label60: {
            int var36;
            float var81;
            label59: {
                var36 = Z;
                var36 ^= -795520752;
                int var3 = System.identityHashCode(this);
                float var4 = TP.S(var1);
                double var55 = var4;
                var81 = this.j();
                double var65 = var81;
                double var56 = Math.pow(var55, var65);
                var4 = (float)var56;
                float var5 = this.qA();
                int var66 = var3 + 1;
                int var67 = var3 * var66;
                int var7 = var3 + 2;
                int var68 = var67 * var7;
                var7 = var3 + 3;
                int var69 = var68 * var7;
                int var70 = var69 & 7;
                if (var70 != 0) {
                    var36 &= 1020995474;
                    var36 += -1117442412;
                    var36 ^= 958522576;
                } else {
                    var36 &= 661057;
                    var36 *= -1239661409;
                    var36 ^= -1313479757;
                    long var71 = var36;
                    long var8 = var71 + 1L;
                    var8 = var71 * var8;
                    long var10 = var71 + 2L;
                    var8 *= var10;
                    long var72 = var71 + 3L;
                    var8 *= var72;
                    long var73 = var8 & 7L;
                    long var106;
                    int var74 = (var106 = var73 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        break label60;
                    }

                    float var107;
                    int var75 = (var107 = var4 - 0.5646216F) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
                    if (var75 < 0) {
                        var36 += -268161983;
                        var36 += 1369353274;
                        var36 += -401308157;
                        var36 ^= -1823773152;
                        var36 ^= -1123147582;
                        var81 = var4 / 0.5646216F;
                        double var77 = var81;
                        int var89 = var3 + 1;
                        int var90 = var3 * var89;
                        int var9 = var3 + 2;
                        int var91 = var90 * var9;
                        var9 = var3 + 3;
                        int var92 = var91 * var9;
                        int var93 = var92 & 7;
                        if (var93 == 0) {
                            var36 *= -173364561;
                            var36 += 1914133887;
                            var36 |= -1121674437;
                            var36 ^= 659035249;
                            var8 = var36;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            long var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var108;
                            int var97 = (var108 = var8 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                            if (var97 != 0) {
                                break label60;
                            }

                            double var98 = var5;
                            double var78 = Math.pow(var77, var98);
                            var81 = (float)var78;
                            var81 = 0.5646216F * var81;
                            var81 = var81;
                            var36 <<= 24;
                            var36 |= 738974159;
                            var36 -= 2069105832;
                            var36 ^= -748726681;
                            break label59;
                        }

                        switch (var36) {
                            case 35986857:
                                var36 ^= 500591017;
                                break;
                            case 1310288915:
                                var36 ^= 1149923163;
                                var36 += -147941241;
                                var36 &= -600618721;
                                var36 ^= -396975285;
                                break;
                            case 1387387140:
                            default:
                                var36 ^= 289699261;
                        }
                    } else {
                        var36 -= 32813322;
                        var36 >>>= 24;
                        var36 ^= 700658653;
                        var4 = 1.0F - var4;
                        var4 /= 0.43537837F;
                        double var83 = var4;
                        double var60 = var5;
                        double var61 = Math.pow(var83, var60);
                        var4 = (float)var61;
                        var4 = 0.43537837F * var4;
                        var4 = 1.0F - var4;
                        Integer var52 = var3;
                        if (var52 != null) {
                            var36 += -1431379860;
                            var36 ^= 770836293;
                            long var84 = var36;
                            long var100 = var84 + 1L;
                            var100 = var84 * var100;
                            long var85 = var100 & 1L;
                            long var109;
                            int var53 = (var109 = var85 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                            if (var53 != 0) {
                                break label60;
                            }

                            var81 = var4;
                            var36 &= 155016896;
                            var36 <<= 17;
                            var36 >>>= 14;
                            var36 &= 1309237358;
                            var36 ^= 1642634048;
                            break label59;
                        }

                        switch (var36) {
                            case -854949234:
                                var36 ^= -1877120494;
                                break;
                            case 700658665:
                                var36 |= 2123931818;
                                var36 |= -1252641452;
                                var36 ^= -1967980515;
                                var36 ^= -1657070170;
                                break;
                            case 1196145493:
                            default:
                                var36 ^= 1059178205;
                        }
                    }
                }

                Integer var43 = var36;
                if (var43 != null) {
                    IllegalStateException var44 = new IllegalStateException();
                    throw var44;
                }
                break label60;
            }

            Integer var54 = var36;
            if (var54 != null) {
                return var81;
            }
        }

        AssertionError var51 = new AssertionError();
        throw var51;
    }

    public void XL(float[] var1) {
        label63: {
            int var2 = Z;
            var2 ^= 1040045745;
            int var3 = System.identityHashCode(this);
            this.x(var1);
            Integer var4 = var3;
            if (var4 == null) {
                var2 &= 1491265212;
                var2 |= -2115547062;
                var2 -= -1782219243;
                var2 *= -1858337483;
                var2 ^= 1857734985;
            } else {
                var2 -= 1841721421;
                var2 ^= -273883595;
                int var45 = var2 + 1;
                var45 = var2 * var45;
                int var5 = var2 + 2;
                var45 *= var5;
                var5 = var2 + 3;
                var45 *= var5;
                var45 &= 7;
                if (var45 != 0) {
                    break label63;
                }

                int var50 = 0;
                var50 = var50;

                var2 = switch (var2) {
                    case -1558470227 -> {
                        var2 |= -798097409;
                        yield var2 ^ -689861445;
                    }
                    default -> var2 ^ 215483401;
                    case 2131009091 -> var2 ^ 1767582326;
                };

                while (true) {
                    Integer var57 = var2;
                    if (var57 == null) {
                        break label63;
                    }

                    if (var50 >= 3) {
                        var2 *= 2128368107;
                        var2 ^= -785559150;
                        var2 ^= 1142355114;
                        long var35 = var2;
                        long var54 = var35 + 1L;
                        long var55 = var35 * var54;
                        long var36 = var55 & 1L;
                        long var72;
                        var2 = (var72 = var36 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            return;
                        }
                        break label63;
                    }

                    var2 -= -532423753;
                    var2 ^= -1711715883;
                    var2 *= -742633959;
                    var2 >>>= 25;
                    var2 ^= -1337972535;
                    long var58 = var2;
                    long var7 = var58 + 1L;
                    var7 = var58 * var7;
                    long var59 = var7 & 1L;
                    long var73;
                    int var60 = (var73 = var59 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var60 != 0) {
                        break label63;
                    }

                    float var61 = var1[var50];
                    float var62 = ed.v(var61);
                    var1[var50] = var62;
                    var60 = var3 + 1;
                    var60 = var3 * var60;
                    int var6 = var3 + 2;
                    var60 *= var6;
                    var6 = var3 + 3;
                    var60 *= var6;
                    var60 &= 7;
                    if (var60 != 0) {
                        var2 >>>= 16;
                        var2 -= -1631814477;
                        var2 ^= -861553879;
                        break;
                    }
                    var2 = switch (var2) {
                        case -1665894554 -> var2 ^ -1054113376;
                        case -1337972500 -> {
                            var2 &= -105788501;
                            var2 |= -1238527387;
                            yield var2 ^ -1874219137;
                        }
                        default -> var2 ^ 1780034282;
                    };
                    Integer var68 = var2;
                    if (var68 == null) {
                        break label63;
                    }

                    int var69 = var50 + 1;
                    var50 = var69;
                    var2 += -1152066605;
                    var2 &= -1145443890;
                    var2 *= 41951307;
                    var2 ^= -1899647576;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var52 = var2 + 2;
            var3 *= var52;
            var52 = var2 + 3;
            var3 *= var52;
            var3 &= 7;
            if (var3 == 0) {
                RuntimeException var44 = new RuntimeException();
                throw var44;
            }
        }

        AssertionError var38 = new AssertionError();
        throw var38;
    }

    public void x(float[] var1) {
        label57: {
            int var2 = Z;
            var2 ^= 791998457;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 == null) {
                var2 -= -46219382;
                var2 >>= 22;
                var2 &= 1525949225;
                var2 &= 89197;
                var2 ^= -1995414740;
            } else {
                label59: {
                    var2 >>= 2;
                    var2 -= -257268571;
                    var2 ^= 1495118714;
                    var2 <<= 3;
                    var2 ^= -1969066724;
                    int var56 = var2 + 1;
                    var56 = var2 * var56;
                    var56 &= 1;
                    if (var56 != 0) {
                        break label57;
                    }

                    int var59 = 0;
                    var59 = var59;
                    var2 <<= 19;
                    var2 |= -16396778;
                    var2 -= -812584248;
                    var2 += 1272082086;
                    var2 ^= -302441939;

                    while (var59 < 3) {
                        var2 = switch (var2) {
                            case -1847700519 -> {
                                var2 -= 409387675;
                                var2 *= -1167776053;
                                var2 += 189144034;
                                var2 |= 1130723676;
                                yield var2 ^ -1564290347;
                            }
                            default -> var2 ^ 10584449;
                            case 1524285221 -> var2 ^ -1677618501;
                        };
                        float var5 = var1[var59];
                        var5 = ed.Ik(var5);
                        var1[var59] = var5;
                        Integer var70 = var3;
                        if (var70 == null) {
                            var2 *= -522997065;
                            var2 ^= -1249845270;
                            break label59;
                        }

                        var2 += -1872469450;
                        var2 ^= 563957678;
                        var2 *= -1862870683;
                        var2 ^= 1259068386;
                        int var71 = var59 + 1;
                        var59 = var71;
                        var2 >>= 12;
                        var2 &= -1297026085;
                        var2 ^= -1847692728;
                    }

                    var2 >>= 31;
                    var2 += 261277244;
                    var2 ^= 1185287987;
                    var59 = var2 + 1;
                    var59 = var2 * var59;
                    int var72 = var2 + 2;
                    var59 *= var72;
                    var72 = var2 + 3;
                    var59 *= var72;
                    var59 &= 7;
                    if (var59 != 0) {
                        break label57;
                    }

                    ed.u(var1);
                    float var66 = var1[0];
                    float var67 = TP.S(var66);
                    float var74 = var1[1];
                    float var6 = var1[2];
                    float var7 = this.PF(var67);
                    float var8 = Math.max(var67, 1.0E-5F);
                    var8 = var7 / var8;
                    var8 = Math.min(var8, 4.0F);
                    float var9 = this.V();
                    var9 *= var8;
                    float var10 = this.O();
                    var8 = var10 * var8;
                    var10 = var9 * var74;
                    float var11 = var8 * var6;
                    var10 -= var11;
                    var8 *= var74;
                    var9 *= var6;
                    var8 += var9;
                    int var88 = var2 - 259013698;
                    int var89 = var88 ^ -1569064444;
                    float var68 = L(var67, var74, var6, var7, var10, var8, var89);
                    var1[0] = var7;
                    float var75 = var10 * var68;
                    int var76 = var3 + 1;
                    int var77 = var3 * var76;
                    var3 = var77 & 1;
                    if (var3 == 0) {
                        var2 *= 623970095;
                        var2 >>= 29;
                        var2 ^= -1294531545;
                        long var78 = var2;
                        long var90 = var78 + 1L;
                        long var91 = var78 * var90;
                        long var96 = var78 + 2L;
                        long var92 = var91 * var96;
                        long var79 = var78 + 3L;
                        long var93 = var92 * var79;
                        long var80 = var93 & 7L;
                        long var97;
                        var3 = (var97 = var80 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var1[1] = var75;
                            float var55 = var8 * var68;
                            var1[2] = var55;
                            ed.N(var1);
                            return;
                        }
                        break label57;
                    }

                    var2 += 1129123965;
                    var2 >>>= 13;
                    var2 ^= 1054159124;
                    var2 ^= -1212074465;
                }
            }

            Integer var47 = var2;
            if (var47 != null) {
                AssertionError var48 = new AssertionError();
                throw var48;
            }
        }

        UnsupportedOperationException var52 = new UnsupportedOperationException();
        throw var52;
    }

    private static float L(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
        label192: {
            int var8 = (int)var0;
            float var9 = var4 * var4;
            float var10 = var5 * var5;
            int var11 = var8 + 1;
            var11 = var8 * var11;
            int var12 = var8 + 2;
            var11 *= var12;
            var12 = var8 + 3;
            var11 *= var12;
            var11 &= 7;
            int var20;
            if (var11 != 0) {
                var20 = var6 - 1668420031;
                var20 ^= -15029113;
                var20 >>= 27;
                var20 *= -553374925;
                var20 ^= 1911634482;
            } else {
                var20 = switch (var6) {
                    case -1682082110 -> {
                        var20 = var6 | -1875938086;
                        var20 += -1906213577;
                        var20 |= -1090653082;
                        var20 -= -485666239;
                        yield var20 ^ 1643131167;
                    }
                    case -314406830 -> var6 ^ -1640859049;
                    default -> var6 ^ -534243195;
                };
                long var163 = var20;
                long var13 = var163 + 1L;
                var13 = var163 * var13;
                long var15 = var163 + 2L;
                var13 *= var15;
                long var164 = var163 + 3L;
                var13 *= var164;
                long var165 = var13 & 7L;
                long var249;
                var11 = (var249 = var165 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                if (var11 != 0) {
                    break label192;
                }

                var9 += var10;
                double var116 = var9;
                double var117 = Math.sqrt(var116);
                var9 = (float)var117;
                float var250;
                int var120 = (var250 = var9 - 1.0E-6F) == 0.0F ? 0 : (var250 < 0.0F ? -1 : 1);
                if (var120 < 0) {
                    var20 &= 588638036;
                    var20 ^= -2024992423;
                    int var154 = var20 + 1;
                    int var155 = var20 * var154;
                    var11 = var20 + 2;
                    int var156 = var155 * var11;
                    var11 = var20 + 3;
                    int var157 = var156 * var11;
                    int var158 = var157 & 7;
                    if (var158 == 0) {
                        return 1.0F;
                    }
                    break label192;
                }

                var20 ^= -220741467;
                var20 ^= 92162097;
                double var121 = var5;
                double var183 = var4;
                double var122 = Math.atan2(var121, var183);
                var12 = var8 + 1;
                var12 = var8 * var12;
                var12 &= 1;
                if (var12 == 0) {
                    var20 >>>= 20;
                    var20 |= -1445009575;
                    var20 ^= 1542307700;
                    Integer var187 = var20;
                    if (var187 == null) {
                        break label192;
                    }

                    var10 = (float)var122;
                    var10 = dS.PE(var3, var10);
                    float var251;
                    var11 = (var251 = var10 - 1.0E-6F) == 0.0F ? 0 : (var251 < 0.0F ? -1 : 1);
                    if (var11 <= 0) {
                        var20 -= -665988045;
                        var20 *= 520261239;
                        var20 += 1344171372;
                        var20 &= -1516509073;
                        var20 ^= -923665354;
                        Integer var179 = var20;
                        if (var179 != null) {
                            return 0.0F;
                        }
                        break label192;
                    }
                    var20 = switch (var20) {
                        case -231515985 -> {
                            var20 >>>= 24;
                            yield var20 ^ 181553127;
                        }
                        default -> var20 ^ 332698365;
                        case 1928045227 -> var20 ^ 450190148;
                    };
                    var9 /= var10;
                    long var125 = var8;
                    long var188 = var125 + 1L;
                    long var189 = var125 * var188;
                    long var14 = var125 + 2L;
                    long var190 = var189 * var14;
                    long var126 = var125 + 3L;
                    long var191 = var190 * var126;
                    long var127 = var191 & 7L;
                    long var252;
                    int var128 = (var252 = var127 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                    if (var128 == 0) {
                        var20 = switch (var20) {
                            default -> var20 ^ 406910223;
                            case -1101490146 -> var20 ^ 429538972;
                            case 181552917 -> {
                                var20 += 1238003394;
                                yield var20 ^ 1517160042;
                            }
                        };
                        int var129 = var20 + 1;
                        int var130 = var20 * var129;
                        var11 = var20 + 2;
                        int var131 = var130 * var11;
                        var11 = var20 + 3;
                        int var132 = var131 * var11;
                        int var133 = var132 & 7;
                        if (var133 != 0) {
                            break label192;
                        }

                        var10 = 0.9F;
                        float var253;
                        var11 = (var253 = var9 - var10) == 0.0F ? 0 : (var253 < 0.0F ? -1 : 1);
                        if (var11 <= 0) {
                            var20 += 1209243027;
                            var20 ^= -133159204;
                            return 1.0F;
                        }

                        var20 >>>= 2;
                        var20 ^= 955163595;
                        float var171 = var1 * var1;
                        var187 = var8;
                        label182:
                        if (var187 != null) {
                            var20 <<= 25;
                            var20 |= 1360059093;
                            var20 -= 1830756874;
                            var20 += 1408199824;
                            var20 ^= 767212813;
                            int var193 = var20 + 1;
                            var193 = var20 * var193;
                            var193 &= 1;
                            if (var193 != 0) {
                                break label192;
                            }

                            float var196 = var2 * var2;
                            float var172 = var171 + var196;
                            double var173 = var172;
                            double var174 = Math.sqrt(var173);
                            float var175 = (float)var174;
                            float var254;
                            var193 = (var254 = var175 - 1.0E-6F) == 0.0F ? 0 : (var254 < 0.0F ? -1 : 1);
                            float var178;
                            if (var193 > 0) {
                                var20 *= -1714118225;
                                var20 >>>= 17;
                                var20 ^= 1299315837;
                                var193 = var20 + 1;
                                var193 = var20 * var193;
                                int var229 = var20 + 2;
                                var193 *= var229;
                                int var230 = var20 + 3;
                                var193 *= var230;
                                var193 &= 7;
                                if (var193 != 0) {
                                    break label192;
                                }

                                double var203 = var2;
                                double var244 = var1;
                                double var204 = Math.atan2(var203, var244);
                                float var205 = (float)var204;
                                float var206 = dS.PE(var0, var205);
                                float var207 = Math.max(var206, 1.0E-6F);
                                int var231 = var8 + 1;
                                int var232 = var8 * var231;
                                int var233 = var232 & 1;
                                if (var233 != 0) {
                                    switch (var20) {
                                        case -1268143751:
                                        default:
                                            var20 ^= -2073890662;
                                            break label182;
                                        case 27018800:
                                            var20 ^= 1151660857;
                                            break label182;
                                        case 1299293740:
                                            var20 *= -677252779;
                                            var20 *= 1136837043;
                                            var20 ^= 808111438;
                                            break label182;
                                    }
                                }

                                var20 >>= 15;
                                var20 ^= 1208160051;
                                var20 <<= 25;
                                var20 ^= 1703328177;
                                int var234 = var20 + 1;
                                int var235 = var20 * var234;
                                int var245 = var20 + 2;
                                int var236 = var235 * var245;
                                int var246 = var20 + 3;
                                int var237 = var236 * var246;
                                int var238 = var237 & 7;
                                if (var238 != 0) {
                                    break label192;
                                }

                                float var176 = var175 / var207;
                                float var177 = Math.max(var10, var176);
                                var178 = var177;
                                var20 &= -1020485559;
                                var20 += -867713711;
                                var20 ^= 886164847;
                            } else {
                                var20 |= -1304617517;
                                var20 &= 206484254;
                                var20 *= -416539665;
                                var20 ^= -1774922083;
                                var20 ^= 2015017746;
                                var193 = var20 + 1;
                                var193 = var20 * var193;
                                int var239 = var20 + 2;
                                var193 *= var239;
                                int var240 = var20 + 3;
                                var193 *= var240;
                                var193 &= 7;
                                if (var193 != 0) {
                                    break label192;
                                }

                                var178 = var10;
                                switch (var20) {
                                    case -1843323273:
                                    default:
                                        var20 ^= 1641348546;
                                        break;
                                    case -1304385531:
                                        var20 *= -1551608249;
                                        var20 ^= 1080678238;
                                        break;
                                    case 1280476088:
                                        var20 ^= -1732219844;
                                }
                            }

                            Integer var135 = var20;
                            if (var135 == null) {
                                break label192;
                            }

                            float var255;
                            int var136 = (var255 = var9 - var178) == 0.0F ? 0 : (var255 < 0.0F ? -1 : 1);
                            Integer var213 = var8;
                            if (var213 != null) {
                                var20 -= -704302517;
                                var20 -= 1985022696;
                                var20 *= 1060112609;
                                var20 ^= -1473068672;
                                long var214 = var20;
                                var14 = var214 + 1L;
                                var14 = var214 * var14;
                                long var215 = var14 & 1L;
                                long var256;
                                int var216 = (var256 = var215 - 0L) == 0L ? 0 : (var256 < 0L ? -1 : 1);
                                if (var216 != 0) {
                                    break label192;
                                }

                                if (var136 <= 0) {
                                    var20 <<= 15;
                                    var20 &= -861933680;
                                    var20 -= 845482425;
                                    var20 ^= 345841749;
                                    int var151 = var20 + 1;
                                    int var152 = var20 * var151;
                                    int var153 = var152 & 1;
                                    if (var153 == 0) {
                                        return 1.0F;
                                    }
                                    break label192;
                                }

                                var20 &= 706615877;
                                var20 ^= 15334161;
                                Integer var137 = var20;
                                if (var137 == null) {
                                    break label192;
                                }

                                float var257;
                                int var138 = (var257 = var178 - 1.0F) == 0.0F ? 0 : (var257 < 0.0F ? -1 : 1);
                                var216 = var8 + 1;
                                var216 = var8 * var216;
                                int var241 = var8 + 2;
                                var216 *= var241;
                                int var242 = var8 + 3;
                                var216 *= var242;
                                var216 &= 7;
                                if (var216 != 0) {
                                    switch (var20) {
                                        case -1378634040:
                                        default:
                                            var20 ^= 1564156199;
                                            break;
                                        case 24483077:
                                            var20 ^= -1696277969;
                                            break;
                                        case 586412369:
                                            var20 *= -800875795;
                                            var20 |= -1893043803;
                                            var20 ^= -384701017;
                                    }
                                } else {
                                    var20 >>= 25;
                                    var20 &= -212962541;
                                    var20 ^= -1468721489;
                                    if (var138 >= 0) {
                                        var20 *= -641094095;
                                        var20 *= -968037309;
                                        var20 ^= 690059787;
                                        int var148 = var20 + 1;
                                        int var149 = var20 * var148;
                                        int var150 = var149 & 1;
                                        if (var150 == 0) {
                                            return var178 / var9;
                                        }
                                        break label192;
                                    }

                                    var20 -= 494244378;
                                    var20 ^= 760588661;
                                    int var139 = var20 + 1;
                                    int var140 = var20 * var139;
                                    int var141 = var140 & 1;
                                    if (var141 != 0) {
                                        break label192;
                                    }

                                    var10 = 1.0F - var178;
                                    var216 = var8 + 1;
                                    var216 = var8 * var216;
                                    int var243 = var8 + 2;
                                    var216 *= var243;
                                    var8 += 3;
                                    var216 *= var8;
                                    var8 = var216 & 7;
                                    if (var8 == 0) {
                                        var20 ^= 664173937;
                                        var20 &= -455910692;
                                        var20 &= 211215120;
                                        var20 ^= -330453332;
                                        Integer var109 = var20;
                                        if (var109 != null) {
                                            float var143 = var178 - var9;
                                            float var144 = var143 / var10;
                                            double var145 = var144;
                                            double var146 = Math.exp(var145);
                                            float var147 = (float)var146;
                                            float var111 = var10 * var147;
                                            float var112 = 1.0F - var111;
                                            return var112 / var9;
                                        }
                                        break label192;
                                    }

                                    var20 <<= 25;
                                    var20 ^= -735077286;
                                }
                            } else {
                                var20 <<= 9;
                                var20 ^= -90400366;
                                var20 ^= -1215070264;
                            }
                        } else {
                            var20 &= -1496410325;
                            var20 += 96167159;
                            var20 |= -642072051;
                            var20 ^= -1982827963;
                        }
                    } else {
                        switch (var20) {
                            case -1546631704:
                                var20 ^= 894798023;
                                break;
                            case 181552917:
                                var20 -= -1072108606;
                                var20 ^= 705492391;
                                var20 ^= 379204270;
                                break;
                            case 2089819571:
                            default:
                                var20 ^= -1111338863;
                        }
                    }
                } else {
                    switch (var20) {
                        case -561841457:
                            var20 ^= -1057195488;
                            break;
                        case 1302928317:
                            var20 |= 1087088512;
                            var20 += 1078520699;
                            var20 &= -734680766;
                            var20 ^= -233097894;
                            break;
                        case 1785786247:
                        default:
                            var20 ^= 2022027129;
                    }
                }
            }

            var8 = var20 + 1;
            var8 = var20 * var8;
            var20 = var8 & 1;
            if (var20 == 0) {
                IllegalStateException var103 = new IllegalStateException();
                throw var103;
            }
        }

        AssertionError var106 = new AssertionError();
        throw var106;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1166689781;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Z = var4;
    }
}
