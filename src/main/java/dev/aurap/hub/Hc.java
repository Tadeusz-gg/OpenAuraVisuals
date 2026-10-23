package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Hc {
    public static final int X;

    private Hc() {
    }

    public static void e(Canvas var0, float var1, float var2, float var3, float var4, float var5) {
        int var6 = X;
        var6 ^= 1929071388;
        int var7 = System.identityHashCode(var0);
        float var8 = TP.S(var3);
        float var9 = 22.0F;
        float var10 = 12.0F;
        int var11 = DP.Z(1216127441, -9392902, var8);
        var11 = DP.nq(var11, var5);
        var0.roundRect(var1, var2, var9, var10, 6.0F, var11);
        var9 = var1 + 6.0F;
        var10 = 10.0F * var8;
        var9 += var10;
        var10 = Math.abs(var4);
        var10 *= 0.18F;
        var11 = var7 + 1;
        var11 = var7 * var11;
        var7 = var11 & 1;
        if (var7 == 0) {
            var6 += 213276887;
            var6 ^= 1939852101;
            var6 ^= -1093073119;
            var7 = var6 + 1;
            var7 = var6 * var7;
            var11 = var6 + 2;
            var7 *= var11;
            var11 = var6 + 3;
            var7 *= var11;
            var7 &= 7;
            if (var7 == 0) {
                float var30 = Math.min(1.0F, var10);
                var10 = 4.1F;
                float var46 = var10 * 2.0F;
                float var31 = var46 + var30;
                float var47 = var31 * 0.5F;
                float var48 = var9 - var47;
                float var12 = var2 + 2.5F;
                float var13 = var10 * 2.0F;
                int var14 = DP.nq(638064427, var5);
                var0.shadow(var48, var12, var31, var13, var10, 1.5F, var14);
                float var49 = var31 * 0.5F;
                var9 -= var49;
                float var50 = var2 + 6.0F;
                float var51 = var50 - var10;
                var12 = var10 * 2.0F;
                int var32 = DP.Z(-4402708, -525569, var8);
                int var33 = DP.nq(var32, var5);
                var0.roundRect(var9, var51, var31, var12, var10, var33);
            } else {
                UnsupportedOperationException var29 = new UnsupportedOperationException();
                throw var29;
            }
        } else {
            var6 |= -788478077;
            var6 ^= -150832011;
            var6 ^= 1672194416;
            AssertionError var19 = new AssertionError();
            throw var19;
        }
    }

    public static void j(Canvas var0, float var1, float var2, float var3, float var4) {
        label52: {
            int var5 = X;
            var5 ^= 631159974;
            int var6 = System.identityHashCode(var0);
            float var7 = 10.0F;
            int var8 = DP.Z(452984831, -7684353, var3);
            var8 = DP.nq(var8, var4);
            var0.roundRect(var1, var2, var7, var7, 3.0F, var8);
            long var53 = var6;
            long var10 = var53 + 1L;
            var10 = var53 * var10;
            long var54 = var10 & 1L;
            long var86;
            var8 = (var86 = var54 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
            if (var8 != 0) {
                var5 >>>= 10;
                var5 ^= -505730341;
            } else {
                label51: {
                    var5 ^= 509312207;
                    var5 |= -299301884;
                    var5 ^= 1215863770;
                    long var56 = var5;
                    var10 = var56 + 1L;
                    var10 = var56 * var10;
                    long var57 = var10 & 1L;
                    long var87;
                    var8 = (var87 = var57 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        break label52;
                    }

                    float var59 = var1 + 0.5F;
                    float var9 = var2 + 0.5F;
                    float var77 = var7 - 1.0F;
                    var7--;
                    float var11 = 1.0F - var3;
                    var11 = var4 * var11;
                    int var82 = DP.nq(872415231, var11);
                    Paint var83 = Paint.solid(var82);
                    Paint var84 = var83.stroke(0.8F);
                    var0.roundRect(var59, var9, var77, var7, 2.6F, var84);
                    float var88;
                    int var45 = (var88 = var3 - 0.02F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
                    if (var45 > 0) {
                        var5 -= 151351301;
                        var5 ^= -1900702989;
                        long var46 = var5;
                        long var64 = var46 + 1L;
                        long var65 = var46 * var64;
                        long var85 = var46 + 2L;
                        long var66 = var65 * var85;
                        long var47 = var46 + 3L;
                        long var67 = var66 * var47;
                        long var48 = var67 & 7L;
                        long var89;
                        int var49 = (var89 = var48 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var49 != 0) {
                            break label52;
                        }

                        var7 = var4 * var3;
                        int var51 = DP.nq(-15658474, var7);
                        float var60 = var1 + 2.6F;
                        int var68 = var6 + 1;
                        int var69 = var6 * var68;
                        int var78 = var6 + 2;
                        int var70 = var69 * var78;
                        var6 += 3;
                        int var71 = var70 * var6;
                        var6 = var71 & 7;
                        if (var6 != 0) {
                            var5 *= 1731162813;
                            var5 >>= 16;
                            var5 += 136458555;
                            var5 ^= -369896192;
                            break label51;
                        }
                        var5 = switch (var5) {
                            case -381043733 -> var5 ^ 787974741;
                            default -> var5 ^ -31869974;
                            case 602259202 -> {
                                var5 *= 1538108773;
                                var5 &= -1999818181;
                                var5 *= -1905027421;
                                yield var5 ^ 10089339;
                            }
                        };
                        float var38 = var2 + 5.2F;
                        var9 = var1 + 4.3F;
                        float var79 = var2 + 7.0F;
                        var0.line(var60, var38, var9, var79, 1.3F, var51);
                        float var39 = var1 + 4.3F;
                        float var61 = var2 + 7.0F;
                        var9 = var1 + 7.6F;
                        float var80 = var2 + 3.2F;
                        var0.line(var39, var61, var9, var80, 1.3F, var51);
                        var5 >>= 20;
                        var5 += -1038855634;
                        var5 ^= 825726313;
                        var5 ^= -1264116191;
                        var5 ^= 1831525728;
                    } else {
                        var5 >>= 21;
                        var5 ^= -716046743;
                    }

                    Integer var33 = var5;
                    if (var33 != null) {
                        return;
                    }
                    break label52;
                }
            }

            long var40 = var5;
            long var62 = var40 + 1L;
            long var63 = var40 * var62;
            long var41 = var63 & 1L;
            long var90;
            var6 = (var90 = var41 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
            if (var6 == 0) {
                IllegalArgumentException var43 = new IllegalArgumentException();
                throw var43;
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    public static void F(Canvas var0, float var1, float var2, float var3, float var4) {
        label46: {
            int var5 = X;
            var5 ^= 189029904;
            int var6 = System.identityHashCode(var0);
            int var7 = DP.nq(1090519039, var4);
            Paint var47 = Paint.solid(var7);
            Paint var48 = var47.stroke(0.8F);
            var0.circle(var1, var2, 3.6F, var48);
            float var65;
            var7 = (var65 = var3 - 0.02F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
            long var8 = var6;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var66;
            int var54 = (var66 = var8 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
            if (var54 == 0) {
                var5 *= -742280795;
                var5 -= -1533121215;
                var5 |= -1146334613;
                var5 *= -2044351911;
                var5 ^= -1742532028;
                int var55 = var5 + 1;
                int var56 = var5 * var55;
                int var57 = var56 & 1;
                if (var57 != 0) {
                    break label46;
                }

                if (var7 <= 0) {
                    var5 >>= 23;
                    var5 *= 167119979;
                    var5 ^= -151167091;
                    return;
                }

                var5 &= 420309766;
                var5 ^= -947660231;
                var5 |= -588180400;
                var5 *= 1601109863;
                var5 ^= -232117498;
                Integer var50 = var5;
                if (var50 == null) {
                    break label46;
                }

                float var51 = 2.2F * var3;
                int var58 = DP.nq(-7684353, var4);
                int var9 = var6 + 1;
                var9 = var6 * var9;
                var6 = var9 & 1;
                if (var6 == 0) {
                    var5 += -1544204647;
                    var5 |= -1468569944;
                    var5 &= -809444372;
                    var5 ^= -456788745;
                    var6 = var5 + 1;
                    var6 = var5 * var6;
                    var9 = var5 + 2;
                    var6 *= var9;
                    var9 = var5 + 3;
                    var6 *= var9;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label46;
                    }

                    var0.circle(var1, var2, var51, var58);
                    var5 <<= 14;
                    var5 ^= 1246075722;
                    return;
                }

                switch (var5) {
                    case -136995003:
                    default:
                        var5 ^= 826163236;
                        break;
                    case 1616770079:
                        var5 += 1368903898;
                        var5 |= 886287436;
                        var5 ^= -2070534444;
                        break;
                    case 1726546775:
                        var5 ^= 125354499;
                }
            } else {
                var5 ^= 1901328491;
                var5 ^= 1251387927;
            }

            Integer var38 = var5;
            if (var38 != null) {
                RuntimeException var40 = new RuntimeException();
                throw var40;
            }
        }

        IllegalStateException var39 = new IllegalStateException();
        throw var39;
    }

    public static void xQ(Canvas var0, float var1, float var2, int var3) {
        int var4 = X;
        int var5 = var3;
        var4 ^= 319131364;
        int var6 = System.identityHashCode(var0);
        int var7 = 0;
        int var8 = var6 + 1;
        var8 = var6 * var8;
        int var9 = var6 + 2;
        var8 *= var9;
        var9 = var6 + 3;
        var8 *= var9;
        var8 &= 7;
        label104:
        if (var8 == 0) {
            var4 = switch (var4) {
                case 317016225 -> {
                    var4 += 1844080883;
                    yield var4 ^ 2145023522;
                }
                case 754119242 -> var4 ^ -70978558;
                default -> var4 ^ 2133062635;
            };
            var8 = var3 + 1;
            var8 = var3 * var8;
            var9 = var3 + 2;
            var8 *= var9;
            var9 = var3 + 3;
            var8 *= var9;
            var8 &= 7;
            if (var8 == 0) {
                var7 = var7;
                var4 += 151211152;
                var4 ^= 233282463;
                var4 ^= -2146348630;
                var4 >>>= 4;
                var4 ^= 939525173;

                label100:
                while (true) {
                    if (var7 >= 3) {
                        var4 -= 1996366339;
                        var4 *= 1968217283;
                        var4 ^= -1360457500;
                        var4 ^= 1563963351;
                        long var75 = var5;
                        long var80 = var75 + 1L;
                        long var81 = var75 * var80;
                        long var76 = var81 & 1L;
                        long var130;
                        var5 = (var130 = var76 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            return;
                        }
                        break;
                    }

                    var4 += -1229517936;
                    var4 &= 1500548553;
                    var4 ^= -84367364;
                    Integer var91 = var5;
                    if (var91 == null) {
                        break;
                    }

                    byte var92 = 0;
                    long var99 = var6;
                    long var11 = var99 + 1L;
                    var11 = var99 * var11;
                    long var100 = var11 & 1L;
                    long var131;
                    var9 = (var131 = var100 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                    if (var9 != 0) {
                        var4 |= 2053544941;
                        var4 ^= -454212260;
                        break label104;
                    }

                    var4 += 301376729;
                    var4 += -2030657142;
                    var4 ^= -2045708282;
                    int var93 = var92;
                    var4 -= -1979714892;
                    var4 ^= 1777148271;
                    var4 |= -1563937596;
                    var4 ^= 96092417;

                    while (var93 < 2) {
                        var4 |= -144517674;
                        var4 -= 940490443;
                        var4 ^= -1652355745;
                        long var102 = var5;
                        var11 = var102 + 1L;
                        var11 = var102 * var11;
                        long var103 = var11 & 1L;
                        long var132;
                        var9 = (var132 = var103 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            break label100;
                        }

                        float var105 = var93;
                        long var10 = var6;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var133;
                        int var114 = (var133 = var10 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                        if (var114 != 0) {
                            var4 += -386537261;
                            var4 |= 623586520;
                            var4 |= -1784395604;
                            var4 <<= 19;
                            var4 ^= -252445023;
                            break label104;
                        }
                        var4 = switch (var4) {
                            default -> var4 ^ -1688980977;
                            case 585583691 -> {
                                var4 <<= 3;
                                yield var4 ^ -1440332422;
                            }
                            case 1255656412 -> var4 ^ 472636071;
                        };
                        var10 = var5;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var134;
                        int var118 = (var134 = var10 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                        if (var118 != 0) {
                            break label100;
                        }

                        float var106 = var105 * 2.6F;
                        float var107 = var1 + var106;
                        float var119 = var7;
                        float var120 = var119 * 2.6F;
                        float var121 = var2 + var120;
                        var0.circle(var107, var121, 0.75F, var3);
                        var9 = var93 + 1;
                        var93 = var9;
                        var4 ^= 1158100122;
                        var4 |= -1789547662;
                        var4 &= -1748559494;
                        var4 ^= 857040821;
                    }

                    var4 &= 838436141;
                    var4 -= -686269280;
                    var4 ^= 1522534381;
                    Integer var94 = var5;
                    if (var94 == null) {
                        break;
                    }

                    int var95 = var7 + 1;
                    var9 = var6 + 1;
                    var9 = var6 * var9;
                    var9 &= 1;
                    if (var9 != 0) {
                        switch (var4) {
                            case -2106762823:
                            default:
                                var4 ^= -954672273;
                                break label104;
                            case 334995584:
                                var4 -= -750456008;
                                var4 ^= 1605456873;
                                break label104;
                            case 1399836880:
                                var4 ^= -1900752808;
                                break label104;
                        }
                    }
                    var4 = switch (var4) {
                        default -> var4 ^ -1953671432;
                        case 334995584 -> {
                            var4 -= 1466068947;
                            var4 -= -994008288;
                            var4 &= 1613331243;
                            var4 *= -1279909849;
                            yield var4 ^ -1650205578;
                        }
                        case 1165321395 -> var4 ^ -1751132606;
                    };
                    Integer var112 = var5;
                    if (var112 == null) {
                        break;
                    }

                    var7 = var95;
                    var4 -= 771038763;
                    var4 >>= 28;
                    var4 ^= -811530581;
                }
            }

            IllegalArgumentException var78 = new IllegalArgumentException();
            throw var78;
        } else {
            switch (var4) {
                case 317016225:
                    var4 += 197097188;
                    var4 |= -54148934;
                    var4 &= -163052454;
                    var4 -= -1859678425;
                    var4 ^= 2048625234;
                    break;
                case 657043080:
                    var4 ^= 560375298;
                    break;
                case 922254142:
                default:
                    var4 ^= -1048890683;
            }
        }

        UnsupportedOperationException var70 = new UnsupportedOperationException();
        throw var70;
    }

    public static void D(Canvas var0, float var1, float var2, float var3, int var4) {
        int var5 = X;
        var5 ^= -1494743929;
        int var7 = System.identityHashCode(var0);
        var0.save();
        var0.translate(var1, var2);
        float var8 = var3 * (float) Math.PI;
        var8 /= 2.0F;
        var0.rotate(var8);
        long var31 = var7;
        long var9 = var31 + 1L;
        var9 = var31 * var9;
        long var11 = var31 + 2L;
        var9 *= var11;
        long var32 = var31 + 3L;
        var9 *= var32;
        long var33 = var9 & 7L;
        long var42;
        var7 = (var42 = var33 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        int var37 = of_2.Tk;
        var5 ^= var37;
        var5 ^= 475706417;
        of_2.Tk = 475706417;
        int var38 = of_2.R;
        var5 ^= var38;
        var5 ^= -108786826;
        of_2.R = -108786826;
        if (var7 != 0) {
            var5 *= 1289766097;
            var5 |= 1904748682;
            var5 <<= 25;
            var5 ^= 907601380;
            AssertionError var35 = new AssertionError();
            throw var35;
        } else {
            switch (var5) {
                case -1654178242:
                default:
                    var5 ^= -778898341;
                    break;
                case -1492598078:
                    var5 |= 394538435;
                    var5 ^= 785523289;
                    var5 += -900026621;
                    var5 *= 227136427;
                    var5 ^= 1222926760;
                    break;
                case -1211369332:
                    var5 ^= 174665039;
            }

            Integer var25 = var4;
            if (var25 == null) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            } else {
                var0.line(-1.5F, -3.0F, 1.5F, 0.0F, 1.1F, var4);
                var0.line(1.5F, 0.0F, -1.5F, 3.0F, 1.1F, var4);
                var0.restore();
            }
        }
    }

    public static void HU(Canvas var0, float var1, float var2, int var3) {
        int var4 = X;
        var4 ^= -1610973294;
        int var6 = System.identityHashCode(var0);
        float var7 = var1 - 1.0F;
        float var8 = var2 - 1.0F;
        Paint var9 = Paint.solid(var3);
        var9 = var9.stroke(1.1F);
        var0.circle(var7, var8, 3.4F, var9);
        var7 = var1 + 1.6F;
        var8 = var2 + 1.6F;
        long var38 = var6;
        long var11 = var38 + 1L;
        var11 = var38 * var11;
        long var13 = var38 + 2L;
        var11 *= var13;
        long var39 = var38 + 3L;
        var11 *= var39;
        long var40 = var11 & 7L;
        long var53;
        var6 = (var53 = var40 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
        if (var6 == 0) {
            var4 >>= 21;
            var4 &= -1520448742;
            var4 ^= 436786557;
            long var41 = var3;
            var11 = var41 + 1L;
            var11 = var41 * var11;
            var13 = var41 + 2L;
            var11 *= var13;
            long var42 = var41 + 3L;
            var11 *= var42;
            long var43 = var11 & 7L;
            long var54;
            var6 = (var54 = var43 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
            if (var6 == 0) {
                float var29 = var1 + 4.0F;
                float var44 = var2 + 4.0F;
                var0.line(var7, var8, var29, var44, 1.2F, var3);
                return;
            }
        } else {
            var4 &= 570451171;
            var4 ^= -88192789;
            long var21 = var3;
            long var30 = var21 + 1L;
            long var31 = var21 * var30;
            long var36 = var21 + 2L;
            long var32 = var31 * var36;
            long var22 = var21 + 3L;
            long var33 = var32 * var22;
            long var23 = var33 & 7L;
            long var55;
            var4 = (var55 = var23 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            }
        }

        UnsupportedOperationException var25 = new UnsupportedOperationException();
        throw var25;
    }

    public static void WQ(Canvas var0, ModuleCategory var1, float var2, float var3, int var4) {
        label192: {
            int var6;
            label203: {
                int var5 = X;
                var6 = var4;
                var5 ^= 1049345156;
                int var7 = System.identityHashCode(var0);
                Integer var8 = var7;
                if (var8 != null) {
                    var5 ^= -483893525;
                    var5 -= 1817304734;
                    var5 ^= -427823534;
                    var5 &= 516576387;
                    var5 ^= -1794228575;
                    int[] var163 = Z.eM;
                    int var9 = var1.ordinal();
                    int var164 = var163[var9];
                    label188:
                    switch (var164) {
                        case 1:
                            var5 = switch (var5) {
                                case -2076334879 -> var5 ^ 1881495044;
                                case -1652277725 -> {
                                    var5 *= -821416883;
                                    var5 += 1789603981;
                                    var5 -= 1385834561;
                                    yield var5 ^ 2060361939;
                                }
                                default -> var5 ^ -1785535259;
                            };
                            long var198 = var4;
                            long var261 = var198 + 1L;
                            var261 = var198 * var261;
                            long var199 = var261 & 1L;
                            long var294;
                            var164 = (var294 = var199 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                            if (var164 != 0) {
                                break label192;
                            }

                            float var201 = var2 - 4.0F;
                            float var237 = var3 - 4.0F;
                            var261 = var7;
                            long var284 = var261 + 1L;
                            var284 = var261 * var284;
                            var261 = var284 & 1L;
                            long var295;
                            var7 = (var295 = var261 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                            if (var7 == 0) {
                                var5 >>= 12;
                                var5 ^= 2117117980;
                                Integer var155 = var4;
                                if (var155 == null) {
                                    break label192;
                                }

                                float var156 = var2 + 4.0F;
                                float var265 = var3 + 4.0F;
                                var0.line(var201, var237, var156, var265, 1.3F, var4);
                                float var157 = var2 + 4.0F;
                                float var202 = var3 - 4.0F;
                                float var238 = var2 - 4.0F;
                                float var266 = var3 + 4.0F;
                                var0.line(var157, var202, var238, var266, 1.3F, var4);
                                float var158 = var2 - 4.5F;
                                float var203 = var3 + 1.5F;
                                float var239 = var2 - 1.5F;
                                float var267 = var3 + 4.5F;
                                var0.line(var158, var203, var239, var267, 1.3F, var4);
                                float var159 = var2 + 4.5F;
                                float var204 = var3 + 1.5F;
                                float var240 = var2 + 1.5F;
                                float var268 = var3 + 4.5F;
                                var0.line(var159, var204, var240, var268, 1.3F, var4);
                                var5 *= -1190817083;
                                var5 ^= 1552112080;
                                break label203;
                            }

                            var5 -= 1268951788;
                            var5 -= 1022981147;
                            var5 ^= 86907694;
                            break;
                        case 2:
                            var5 *= -1052572887;
                            var5 ^= 1458481147;
                            long var190 = var4;
                            long var256 = var190 + 1L;
                            var256 = var190 * var256;
                            long var191 = var256 & 1L;
                            long var293;
                            var164 = (var293 = var191 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                            if (var164 != 0) {
                                break label192;
                            }

                            float var193 = var2 - 5.0F;
                            float var234 = var3 - 4.0F;
                            Paint var258 = Paint.solid(var4);
                            Paint var259 = var258.stroke(1.1F);
                            var0.roundRect(var193, var234, 10.0F, 7.5F, 1.8F, var259);
                            float var194 = var2 - 2.5F;
                            float var235 = var3 + 5.0F;
                            float var260 = var2 + 2.5F;
                            float var275 = var3 + 5.0F;
                            var0.line(var194, var235, var260, var275, 1.1F, var4);
                            Integer var195 = var7;
                            if (var195 != null) {
                                var5 *= -472643579;
                                var5 += 1657854544;
                                var5 -= -1169826456;
                                var5 ^= 2052884661;
                                var195 = var4;
                                if (var195 == null) {
                                    break label192;
                                }

                                float var197 = var2 - 3.0F;
                                float var236 = var3 - 2.0F;
                                var0.roundRect(var197, var236, 3.5F, 1.5F, 0.75F, var4);
                                var5 >>>= 28;
                                var5 += -1478717422;
                                var5 &= 701890615;
                                var5 ^= 390598657;
                                break label203;
                            }

                            var5 ^= -1061623483;
                            var5 >>>= 30;
                            var5 ^= 197060564;
                            break;
                        case 3:
                            var5 <<= 30;
                            var5 |= 1717548909;
                            var5 &= -852032615;
                            var5 >>>= 10;
                            var5 ^= -453734961;
                            Integer var186 = var4;
                            if (var186 == null) {
                                break label192;
                            }

                            float var187 = var2 + 2.5F;
                            var0.circle(var187, var3, 2.6F, var4);
                            float var188 = var2 - 1.8F;
                            var9 = DP.nq(var4, 0.6F);
                            var0.circle(var188, var3, 1.9F, var9);
                            float var189 = var2 - 4.8F;
                            Integer var232 = var7;
                            if (var232 != null) {
                                var5 >>= 29;
                                var5 ^= -2136145032;
                                var5 ^= -1200082102;
                                int var233 = DP.nq(var4, 0.3F);
                                var0.circle(var189, var3, 1.2F, var233);
                                var5 &= 1262501846;
                                var5 -= 1529044290;
                                var5 -= 122165074;
                                var5 += -596847605;
                                var5 ^= -1952612566;
                                break label203;
                            }

                            switch (var5) {
                                case -456816625:
                                    var5 -= -1132938421;
                                    var5 &= -1617509468;
                                    var5 ^= 62531411;
                                    break label188;
                                case 760257178:
                                default:
                                    var5 ^= -1072797364;
                                    break label188;
                                case 2133170626:
                                    var5 ^= -74368077;
                                    break label188;
                            }
                        case 4:
                            var5 = switch (var5) {
                                default -> var5 ^ 1627084290;
                                case -1652277725 -> {
                                    var5 -= 912635893;
                                    var5 *= -478788605;
                                    yield var5 ^ 1569668742;
                                }
                                case 1026642607 -> var5 ^ -925108898;
                            };
                            long var176 = var4;
                            long var249 = var176 + 1L;
                            var249 = var176 * var249;
                            long var277 = var176 + 2L;
                            var249 *= var277;
                            long var177 = var176 + 3L;
                            var249 *= var177;
                            long var178 = var249 & 7L;
                            long var291;
                            var164 = (var291 = var178 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                            if (var164 != 0) {
                                break label192;
                            }

                            float var180 = var2 - 5.0F;
                            float var224 = var3 - 1.8F;
                            var0.roundRect(var180, var224, 3.0F, 3.6F, 0.8F, var4);
                            float var181 = var2 - 2.0F;
                            float var225 = var3 - 1.5F;
                            float var253 = var2 + 0.5F;
                            float var272 = var3 - 4.0F;
                            var0.line(var181, var225, var253, var272, 1.1F, var4);
                            float var182 = var2 - 2.0F;
                            float var226 = var3 + 1.5F;
                            float var254 = var2 + 0.5F;
                            var272 = var3 + 4.0F;
                            var277 = var7;
                            long var14 = var277 + 1L;
                            var14 = var277 * var14;
                            var277 = var14 & 1L;
                            long var292;
                            int var280 = (var292 = var277 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                            if (var280 == 0) {
                                var5 |= 1408913394;
                                var5 *= 912221837;
                                var5 >>= 30;
                                var5 &= -422201058;
                                var5 ^= -288249955;
                                int var281 = var4 + 1;
                                int var282 = var4 * var281;
                                int var283 = var282 & 1;
                                if (var283 != 0) {
                                    break label192;
                                }

                                var0.line(var182, var226, var254, var272, 1.1F, var4);
                                float var183 = var2 + 0.5F;
                                float var227 = var3 - 4.0F;
                                float var255 = var2 + 0.5F;
                                var272 = var3 + 4.0F;
                                var0.line(var183, var227, var255, var272, 1.1F, var4);
                                float var184 = var2 + 1.0F;
                                Paint var228 = Paint.solid(var4);
                                var0.arc(var184, var3, 3.2F, 1.0F, -0.7F, 1.4F, var228);
                                float var185 = var2 + 1.0F;
                                var9 = DP.nq(var4, 0.6F);
                                Paint var230 = Paint.solid(var9);
                                var0.arc(var185, var3, 5.2F, 1.0F, -0.7F, 1.4F, var230);
                                switch (var5) {
                                    case -460489940:
                                    default:
                                        var5 ^= -357976728;
                                        break label203;
                                    case 134487683:
                                        var5 ^= -553683915;
                                        var5 &= -1118423005;
                                        var5 ^= -1563543501;
                                        break label203;
                                    case 2089592019:
                                        var5 ^= -1685637879;
                                        break label203;
                                }
                            }

                            switch (var5) {
                                case -1447234548:
                                    var5 -= -123735870;
                                    var5 ^= 1493456156;
                                    var5 ^= 811305347;
                                    var5 ^= -738445310;
                                    break label188;
                                case 1947757538:
                                    var5 ^= 805679924;
                                    break label188;
                                case 2017467770:
                                default:
                                    var5 ^= -227109515;
                                    break label188;
                            }
                        case 5:
                            var5 = switch (var5) {
                                case -1652277725 -> {
                                    var5 -= 1848630258;
                                    yield var5 ^ -1072993889;
                                }
                                case -1245276300 -> var5 ^ 1587050044;
                                default -> var5 ^ -1639403611;
                            };
                            Integer var170 = var4;
                            if (var170 == null) {
                                break label192;
                            }

                            Paint var171 = Paint.solid(var4);
                            Integer var220 = var7;
                            if (var220 != null) {
                                var5 = switch (var5) {
                                    case -278983762 -> {
                                        var5 *= 1144278529;
                                        yield var5 ^ -565211623;
                                    }
                                    case 1353761786 -> var5 ^ 1614621715;
                                    default -> var5 ^ 1457937365;
                                };
                                Paint var172 = var171.stroke(1.1F);
                                var0.circle(var2, var3, 4.8F, var172);
                                float var173 = var2 - 4.5F;
                                float var221 = var2 + 4.5F;
                                var0.line(var173, var3, var221, var3, 0.9F, var4);
                                float var174 = var2 + 5.5F;
                                Paint var222 = Paint.solid(var4);
                                var0.arc(var174, var3, 6.0F, 0.9F, 2.261947F, 1.7592919F, var222);
                                float var175 = var2 - 5.5F;
                                Paint var223 = Paint.solid(var4);
                                var0.arc(var175, var3, 6.0F, 0.9F, -0.87964594F, 1.7592919F, var223);
                                switch (var5) {
                                    case -1598903857:
                                        var5 ^= 1699710147;
                                        break label203;
                                    case -1576435273:
                                        var5 *= 955766565;
                                        var5 -= -183844712;
                                        var5 ^= 799394396;
                                        var5 |= -1538438969;
                                        var5 ^= -1729921578;
                                        break label203;
                                    case 1371387441:
                                    default:
                                        var5 ^= -768757155;
                                        break label203;
                                }
                            }

                            var5 += 2130740147;
                            var5 ^= 1709271222;
                            break;
                        case 6:
                            var5 = switch (var5) {
                                case -1652277725 -> {
                                    var5 *= -963039341;
                                    var5 ^= -2094060148;
                                    var5 &= 1214993019;
                                    yield var5 ^ -300092093;
                                }
                                default -> var5 ^ 1099232401;
                                case 583360362 -> var5 ^ 1028989922;
                            };
                            int var165 = 0;
                            Integer var205 = var7;
                            if (var205 == null) {
                                var5 <<= 28;
                                var5 -= -928360790;
                                var5 ^= 1558924929;
                                break;
                            } else {
                                var5 = switch (var5) {
                                    default -> var5 ^ 768252696;
                                    case -1502288046 -> {
                                        var5 *= -1287719007;
                                        yield var5 ^ 83126857;
                                    }
                                    case -602037902 -> var5 ^ -1958397710;
                                };
                                int var206 = var4 + 1;
                                var206 = var4 * var206;
                                int var10 = var4 + 2;
                                var206 *= var10;
                                var10 = var4 + 3;
                                var206 *= var10;
                                var206 &= 7;
                                if (var206 != 0) {
                                    break label192;
                                }

                                var165 = var165;
                                var5 += 820594451;
                                var5 *= 282361167;
                                var5 ^= 158638948;

                                while (true) {
                                    Integer var211 = var6;
                                    if (var211 == null) {
                                        break label192;
                                    }

                                    if (var165 >= 8) {
                                        var5 *= 1322377137;
                                        var5 &= -1918177861;
                                        var5 |= -707907877;
                                        var5 <<= 14;
                                        var5 ^= -1446477156;
                                        Integer var167 = var6;
                                        if (var167 == null) {
                                            break label192;
                                        }

                                        Paint var168 = Paint.solid(var4);
                                        Paint var169 = var168.stroke(1.4F);
                                        var211 = var7;
                                        if (var211 != null) {
                                            var5 ^= 351030700;
                                            var5 >>>= 6;
                                            var5 ^= 621592909;
                                            var0.circle(var2, var3, 3.6F, var169);
                                            var5 -= 999797428;
                                            var5 |= 407358556;
                                            var5 ^= -815534356;
                                            break label203;
                                        }

                                        var5 ^= -264713358;
                                        var5 *= -26900461;
                                        var5 += -645091619;
                                        var5 ^= -2043429808;
                                        break label188;
                                    }

                                    var5 *= -293315433;
                                    var5 ^= 2055609156;
                                    var5 ^= 7622089;
                                    float var212 = var165;
                                    float var213 = var212 * (float) Math.PI;
                                    float var214 = var213 / 4.0F;
                                    double var244 = var214;
                                    double var245 = Math.cos(var244);
                                    float var246 = (float)var245;
                                    double var11 = var214;
                                    var11 = Math.sin(var11);
                                    float var215 = (float)var11;
                                    float var270 = var246 * 3.2F;
                                    float var271 = var2 + var270;
                                    float var12 = var215 * 3.2F;
                                    var12 = var3 + var12;
                                    float var247 = var246 * 5.0F;
                                    long var13 = var7;
                                    long var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    var13 = var15 & 1L;
                                    long var296;
                                    int var287 = (var296 = var13 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                    if (var287 != 0) {
                                        var5 ^= 1871732272;
                                        var5 ^= -773171056;
                                        break label188;
                                    }

                                    var5 >>= 15;
                                    var5 >>>= 4;
                                    var5 ^= 610390859;
                                    var5 ^= -1582311635;
                                    Integer var288 = var6;
                                    if (var288 == null) {
                                        break label192;
                                    }

                                    float var248 = var2 + var247;
                                    float var216 = var215 * 5.0F;
                                    float var217 = var3 + var216;
                                    var0.line(var271, var12, var248, var217, 1.6F, var4);
                                    int var218 = var165 + 1;
                                    var165 = var218;
                                    var5 ^= 1642061919;
                                    var5 += 1369241789;
                                    var5 ^= -1188315608;
                                }
                            }
                        default:
                            var5 *= 449905065;
                            var5 ^= -1516844420;
                            var5 &= 582987154;
                            var5 -= 1419670797;
                            var5 ^= -42583324;
                            break label203;
                    }
                } else {
                    var5 |= 1618590723;
                    var5 >>= 13;
                    var5 += 616994235;
                    var5 += -195891425;
                    var5 ^= 312698734;
                }

                var5 = var6 + 1;
                var5 = var6 * var5;
                var7 = var6 + 2;
                var5 *= var7;
                var6 += 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    UnsupportedOperationException var146 = new UnsupportedOperationException();
                    throw var146;
                }
                break label192;
            }

            long var160 = var6;
            long var241 = var160 + 1L;
            var241 = var160 * var241;
            var160 = var241 & 1L;
            long var297;
            int var162 = (var297 = var160 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
            if (var162 == 0) {
                return;
            }
        }

        IllegalArgumentException var151 = new IllegalArgumentException();
        throw var151;
    }

    public static void zP(Canvas var0, float var1, float var2, float var3, float var4, float var5) {
        label169: {
            int var6 = X;
            var6 ^= 1718236978;
            int var7 = System.identityHashCode(var0);
            var0.save();
            var0.clip(var1, var2, var3, var4, var5);
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var211;
            int var114 = (var211 = var8 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
            int var9 = of_2.Tk;
            var6 ^= var9;
            var6 ^= 475706417;
            var9 = of_2.R;
            var6 ^= var9;
            var6 ^= -108786826;
            if (var114 != 0) {
                switch (var6) {
                    case -1795820955:
                        var6 ^= -1497112081;
                        break;
                    case 771019445:
                    default:
                        var6 ^= -81305416;
                        break;
                    case 1737159031:
                        var6 -= 2006514834;
                        var6 &= 1849339198;
                        var6 += -126090402;
                        var6 *= 159647861;
                        var6 ^= -1258624416;
                }
            } else {
                var6 *= 1376725437;
                var6 |= -1806323303;
                var6 <<= 20;
                var6 &= -985086573;
                var6 ^= 470851107;
                var0.rect(var1, var2, var3, var4, -1644826);
                float var115 = 3.0F;
                float var117 = var2;
                var6 &= -1111738827;
                var6 *= 550793223;
                var6 ^= -2064504156;

                label166:
                while (true) {
                    var10 = var6;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var212;
                    int var125 = (var212 = var10 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                    if (var125 != 0) {
                        break label169;
                    }

                    float var126 = var2 + var4;
                    long var11 = var7;
                    long var13 = var11 + 1L;
                    var13 = var11 * var13;
                    var11 = var13 & 1L;
                    long var213;
                    int var139 = (var213 = var11 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                    if (var139 != 0) {
                        var6 *= -372247825;
                        var6 ^= -2047934329;
                        break;
                    }

                    var6 ^= -534006523;
                    var6 *= 1198311627;
                    var6 *= -559826163;
                    var6 += -447657140;
                    var6 ^= -1709802311;
                    float var214;
                    int var127 = (var214 = var117 - var126) == 0.0F ? 0 : (var214 < 0.0F ? -1 : 1);
                    if (var127 >= 0) {
                        var6 += -579528528;
                        var6 ^= 388276875;
                        Integer var105 = var6;
                        if (var105 != null) {
                            var0.restore();
                            return;
                        }
                        break label169;
                    }

                    var6 &= 121654791;
                    var6 >>= 18;
                    var6 <<= 23;
                    var6 ^= -1289506824;
                    Integer var128 = var6;
                    if (var128 == null) {
                        break label169;
                    }

                    float var129 = var117 - var2;
                    float var130 = var129 / var115;
                    int var140 = var7 + 1;
                    int var141 = var7 * var140;
                    int var179 = var7 + 2;
                    int var142 = var141 * var179;
                    int var180 = var7 + 3;
                    int var143 = var142 * var180;
                    int var144 = var143 & 7;
                    if (var144 != 0) {
                        switch (var6) {
                            case 787156048:
                                var6 ^= -1400275724;
                                break label166;
                            case 1063114993:
                            default:
                                var6 ^= -63563579;
                                break label166;
                            case 1394847736:
                                var6 &= 733824415;
                                var6 ^= -311976852;
                                var6 *= -2044508381;
                                var6 ^= 459525206;
                                break label166;
                        }
                    }
                    var6 = switch (var6) {
                        default -> var6 ^ -1816027329;
                        case 434712734 -> var6 ^ -1895069355;
                        case 1394847736 -> {
                            var6 ^= 246258281;
                            var6 &= -1486354136;
                            var6 &= 304943591;
                            yield var6 ^ 703675276;
                        }
                    };
                    int var145 = var6 + 1;
                    int var146 = var6 * var145;
                    int var147 = var146 & 1;
                    if (var147 != 0) {
                        break label169;
                    }

                    int var131 = (int)var130;
                    int var132 = var131 % 2;
                    float var133;
                    if (var132 == 0) {
                        var6 = switch (var6) {
                            case -865253767 -> var6 ^ 1993760486;
                            default -> var6 ^ -16397301;
                            case 704199308 -> {
                                var6 -= -247284060;
                                var6 &= -972401837;
                                var6 &= 256855910;
                                yield var6 ^ -1540346044;
                            }
                        };
                        var133 = 0.0F;
                        switch (var6) {
                            case -1913827883:
                            default:
                                var6 ^= -415499723;
                                break;
                            case -1790077205:
                                var6 ^= -230393196;
                                break;
                            case -1540199420:
                                var6 += 1466461177;
                                var6 &= -437513771;
                                var6 &= 2056186092;
                                var6 <<= 13;
                                var6 ^= 406128581;
                        }
                    } else {
                        var6 ^= 141871854;
                        var6 *= 1748529381;
                        var6 *= 1351553723;
                        var6 *= -1285858467;
                        var6 ^= 1407503337;
                        var11 = var6;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        var11 = var13 & 1L;
                        long var215;
                        int var150 = (var215 = var11 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                        if (var150 != 0) {
                            break label169;
                        }

                        var133 = var115;
                        switch (var6) {
                            case -1214787059:
                                var6 ^= -1480576508;
                                break;
                            case -971213932:
                            default:
                                var6 ^= -1161065255;
                                break;
                            case 680003679:
                                var6 &= -1531793615;
                                var6 ^= 950898644;
                        }
                    }

                    float var134 = var1 + var133;
                    int var151 = var7 + 1;
                    int var152 = var7 * var151;
                    int var181 = var7 + 2;
                    int var153 = var152 * var181;
                    int var182 = var7 + 3;
                    int var154 = var153 * var182;
                    int var155 = var154 & 7;
                    if (var155 != 0) {
                        var6 ^= 667440978;
                        var6 ^= -936139619;
                        break;
                    }
                    var6 = switch (var6) {
                        default -> var6 ^ -1612883576;
                        case -1106686545 -> var6 ^ 1952558373;
                        case 405637061 -> {
                            var6 += 844919912;
                            var6 *= 976101209;
                            var6 += 1155710518;
                            var6 *= 1334423825;
                            yield var6 ^ 1529757538;
                        }
                    };
                    int var156 = var6 + 1;
                    int var157 = var6 * var156;
                    int var183 = var6 + 2;
                    int var158 = var157 * var183;
                    int var184 = var6 + 3;
                    int var159 = var158 * var184;
                    int var160 = var159 & 7;
                    if (var160 != 0) {
                        break label169;
                    }

                    float var135 = var134;
                    var6 >>>= 9;
                    var6 -= 16202665;
                    var6 ^= -2011607013;

                    while (true) {
                        float var161 = var1 + var3;
                        float var216;
                        int var162 = (var216 = var135 - var161) == 0.0F ? 0 : (var216 < 0.0F ? -1 : 1);
                        var12 = var7;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        long var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var217;
                        int var188 = (var217 = var12 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                        if (var188 != 0) {
                            var6 *= 156740391;
                            var6 += 2138748781;
                            var6 ^= -101744124;
                            break label166;
                        }

                        var6 ^= -1471395513;
                        var6 ^= 633411560;
                        var6 &= -1546932201;
                        var6 ^= 1112657761;
                        if (var162 >= 0) {
                            var6 = switch (var6) {
                                default -> var6 ^ 36478625;
                                case -527212687 -> {
                                    var6 ^= -1643825914;
                                    yield var6 ^ -1764844159;
                                }
                                case -41244904 -> var6 ^ 1672945225;
                            };
                            Integer var136 = var6;
                            if (var136 == null) {
                                break label169;
                            }

                            float var137 = var117 + var115;
                            int var168 = var7 + 1;
                            int var169 = var7 * var168;
                            int var194 = var7 + 2;
                            int var170 = var169 * var194;
                            int var195 = var7 + 3;
                            int var171 = var170 * var195;
                            int var172 = var171 & 7;
                            if (var172 != 0) {
                                switch (var6) {
                                    case -1930179144:
                                        var6 ^= 1238688304;
                                        break label166;
                                    case -396822538:
                                        var6 += -183524755;
                                        var6 |= 1057536312;
                                        var6 >>>= 5;
                                        var6 ^= -265473583;
                                        break label166;
                                    case 2088273636:
                                    default:
                                        var6 ^= 460328254;
                                        break label166;
                                }
                            }

                            var6 ^= -1507053504;
                            var6 >>= 13;
                            var6 ^= -1277201995;
                            var11 = var6;
                            var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var219;
                            int var176 = (var219 = var11 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                            if (var176 != 0) {
                                break label169;
                            }

                            var117 = var137;
                            var6 *= -1070933031;
                            var6 >>>= 24;
                            var6 ^= -1467932579;
                            break;
                        }

                        var6 |= 811217518;
                        var6 ^= -1054227653;
                        var6 -= -48656087;
                        var6 ^= -154375442;
                        int var163 = var6 + 1;
                        int var164 = var6 * var163;
                        int var165 = var164 & 1;
                        if (var165 != 0) {
                            break label169;
                        }

                        var0.rect(var135, var117, var115, var115, -5197648);
                        float var166 = var115 * 2.0F;
                        var12 = var7;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var218;
                        int var192 = (var218 = var12 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                        if (var192 != 0) {
                            var6 -= 496742409;
                            var6 >>>= 10;
                            var6 *= -66686503;
                            var6 += -1498558696;
                            var6 ^= -509820458;
                            break label166;
                        }
                        var6 = switch (var6) {
                            case -1038794251 -> {
                                var6 *= 335334901;
                                yield var6 ^ 773884816;
                            }
                            case -443600 -> var6 ^ -645420007;
                            default -> var6 ^ -1778576598;
                        };
                        Integer var193 = var6;
                        if (var193 == null) {
                            break label169;
                        }

                        float var167 = var135 + var166;
                        var135 = var167;
                        var6 *= 1064697753;
                        var6 ^= -711654986;
                    }
                }
            }

            long var108 = var6;
            long var118 = var108 + 1L;
            long var119 = var108 * var118;
            long var109 = var119 & 1L;
            long var220;
            var7 = (var220 = var109 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
            if (var7 == 0) {
                RuntimeException var111 = new RuntimeException();
                throw var111;
            }
        }

        RuntimeException var107 = new RuntimeException();
        throw var107;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1071009279;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        X = var4;
    }
}
