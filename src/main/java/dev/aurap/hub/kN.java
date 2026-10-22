package dev.aurap.hub;

import mvggs.modules.hud.hudstyle;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Glass;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class kN {
    private static final float bq = 0.93F;
    public static final int CL;

    private kN() {
    }

    public static void BT(Canvas var0, Oo var1, float var2, float var3, float var4, float var5, float var6) {
        int var7 = CL;
        var7 ^= 1845196893;
        int var8 = System.identityHashCode(var0);
        float var9 = var3 + 2.0F;
        Integer var23 = var8;
        if (var23 == null) {
            long var10 = switch (var7) {
                case 455824447 -> var7 ^ -1346838712;
                default -> var7 ^ 1805062612;
                case 1281856591 -> {
                    var7 += -1430817676;
                    var7 += 9265349;
                    yield var7 ^ -51014858;
                }
            };
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            var10 = var12 & 1L;
            long var28;
            int var24 = (var28 = var10 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var24 == 0) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            }
        } else {
            Integer var20 = switch (var7) {
                case -566693480 -> var7 ^ 87957411;
                case 1281856591 -> {
                    var7 *= -1760943947;
                    yield var7 ^ -2760500;
                }
                default -> var7 ^ 404146449;
            };
            if (var20 != null) {
                int var22 = var1.g();
                var0.shadow(var2, var9, var4, var5, var6, 14.0F, var22);
                return;
            }
        }

        RuntimeException var21 = new RuntimeException();
        throw var21;
    }

    public static void i(Canvas var0, hudstyle var1, Oo var2, float var3, float var4, float var5, float var6, float var7) {
        label108: {
            int var8 = CL;
            var8 ^= -975158486;
            int var9 = System.identityHashCode(var0);
            int var10 = var2.uo() ? 1 : 0;
            Integer var11 = var9;
            if (var11 != null) {
                var8 ^= 1263453110;
                var8 ^= 532509884;
                var8 &= 574248622;
                var8 |= -337173607;
                var8 ^= 1659285701;
                if (var10 != 0) {
                    var8 *= 1809865869;
                    var8 &= 285395422;
                    var8 *= -2082124403;
                    var8 ^= 1350687752;
                    var10 = var8 + 1;
                    var10 = var8 * var10;
                    var10 &= 1;
                    if (var10 != 0) {
                        break label108;
                    }

                    int var106 = var1.Ot() ? 1 : 0;
                    var11 = var9;
                    if (var11 == null) {
                        var8 *= 1407620969;
                        var8 >>>= 16;
                        var8 ^= -1215308879;
                    } else {
                        var8 *= -38191409;
                        var8 &= -1891201692;
                        var8 ^= 1508812893;
                        if (var106 != 0) {
                            var8 += -10384541;
                            var8 *= 683036727;
                            var8 ^= -304092538;
                            var106 = var8 + 1;
                            var106 = var8 * var106;
                            var106 &= 1;
                            if (var106 != 0) {
                                break label108;
                            }

                            Glass var110 = var2.sO();
                            long var131 = var9;
                            long var13 = var131 + 1L;
                            var13 = var131 * var13;
                            long var15 = var131 + 2L;
                            var13 *= var15;
                            long var132 = var131 + 3L;
                            var13 *= var132;
                            long var133 = var13 & 7L;
                            long var160;
                            int var134 = (var160 = var133 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                            if (var134 == 0) {
                                var8 = switch (var8) {
                                    default -> var8 ^ 929859330;
                                    case 1265250822 -> {
                                        var8 += 1458188254;
                                        var8 &= 197604582;
                                        var8 ^= -284088650;
                                        yield var8 ^ 1321898255;
                                    }
                                    case 1510839300 -> var8 ^ -1470005655;
                                };
                                var0.glass(var3, var4, var5, var6, var7, var110);
                                switch (var8) {
                                    case -1549822115:
                                        var8 += 234095726;
                                        var8 >>>= 30;
                                        var8 += 1946481200;
                                        var8 ^= 2033041159;
                                        return;
                                    case -610766408:
                                    default:
                                        var8 ^= 254333772;
                                        return;
                                    case 488551076:
                                        var8 ^= -1046500022;
                                        return;
                                }
                            }

                            switch (var8) {
                                case 265143388:
                                default:
                                    var8 ^= -207098299;
                                    break;
                                case 867862266:
                                    var8 ^= 986674975;
                                    break;
                                case 1265250822:
                                    var8 &= -993850754;
                                    var8 >>>= 6;
                                    var8 += 843953013;
                                    var8 ^= -2067680165;
                            }
                        } else {
                            var8 &= 779094899;
                            var8 |= -1110173028;
                            var8 ^= -1912967050;
                            var8 ^= -1622515844;
                            var106 = var8 + 1;
                            var106 = var8 * var106;
                            int var135 = var8 + 2;
                            var106 *= var135;
                            var135 = var8 + 3;
                            var106 *= var135;
                            var106 &= 7;
                            if (var106 != 0) {
                                break label108;
                            }

                            var106 = var2.CU();
                            var135 = var9 + 1;
                            var135 = var9 * var135;
                            int var12 = var9 + 2;
                            var135 *= var12;
                            var12 = var9 + 3;
                            var135 *= var12;
                            var135 &= 7;
                            if (var135 == 0) {
                                var8 *= -603697877;
                                var8 += -1893258050;
                                var8 ^= -1075747358;
                                var106 = DP.Y(var106, 0.93F);
                                var0.roundRect(var3, var4, var5, var6, var7, var106);
                                var8 |= 1969367862;
                                var8 ^= -119622966;
                                return;
                            }

                            var8 |= -669592070;
                            var8 += 264267252;
                            var8 &= -1867163413;
                            var8 ^= -1214621755;
                        }
                    }
                } else {
                    var8 ^= -2125231482;
                    var8 ^= 907976902;
                    long var118 = var8;
                    long var151 = var118 + 1L;
                    var151 = var118 * var151;
                    long var14 = var118 + 2L;
                    var151 *= var14;
                    long var119 = var118 + 3L;
                    var151 *= var119;
                    long var120 = var151 & 7L;
                    long var161;
                    var10 = (var161 = var120 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                    if (var10 != 0) {
                        break label108;
                    }

                    int var122 = var1.Ot() ? 1 : 0;
                    var11 = var9;
                    if (var11 == null) {
                        var8 *= -1981447223;
                        var8 ^= -143555195;
                        var8 ^= 2082417802;
                        var8 ^= -1541915257;
                    } else {
                        var8 |= 941083540;
                        var8 -= 698760306;
                        var8 &= 1321407954;
                        var8 -= 1810456142;
                        var8 ^= 1948887239;
                        if (var122 != 0) {
                            var8 -= -1334362185;
                            var8 ^= 1687526218;
                            var122 = var8 + 1;
                            var122 = var8 * var122;
                            int var143 = var8 + 2;
                            var122 *= var143;
                            var143 = var8 + 3;
                            var122 *= var143;
                            var122 &= 7;
                            if (var122 != 0) {
                                break label108;
                            }

                            var122 = var1.E(var2);
                            var143 = var9 + 1;
                            var143 = var9 * var143;
                            int var155 = var9 + 2;
                            var143 *= var155;
                            int var156 = var9 + 3;
                            var143 *= var156;
                            var143 &= 7;
                            if (var143 == 0) {
                                var8 |= 59639524;
                                var8 ^= -2050817441;
                                var8 ^= -1243954646;
                                var8 >>= 13;
                                var8 ^= -884770942;
                                var0.backdrop(var3, var4, var5, var6, var7, 3, var122);
                                var8 *= -1296914207;
                                var8 ^= 1182356931;
                                return;
                            }

                            var8 ^= -1437202418;
                            var8 ^= 1158304284;
                        } else {
                            var8 *= 454937591;
                            var8 *= -1334429397;
                            var8 |= 2147266949;
                            var8 ^= 278818260;
                            var122 = var1.E(var2);
                            Integer var97 = var9;
                            if (var97 != null) {
                                var8 += 2038429423;
                                var8 <<= 7;
                                var8 ^= -673151678;
                                int var98 = var8 + 1;
                                var98 = var8 * var98;
                                var98 &= 1;
                                if (var98 != 0) {
                                    break label108;
                                }

                                var0.roundRect(var3, var4, var5, var6, var7, var122);
                                var8 <<= 12;
                                var8 -= 1308452043;
                                var8 ^= 780137984;
                                return;
                            }

                            var8 ^= -1833298226;
                            var8 += 699596385;
                            var8 ^= 268665414;
                        }
                    }
                }
            } else {
                var8 *= -80669757;
                var8 ^= 171806862;
            }

            var9 = var8 + 1;
            var9 = var8 * var9;
            var8 = var9 & 1;
            if (var8 == 0) {
                UnsupportedOperationException var96 = new UnsupportedOperationException();
                throw var96;
            }
        }

        IllegalStateException var95 = new IllegalStateException();
        throw var95;
    }

    public static void R(Canvas var0, Oo var1, float var2, float var3, float var4, float var5, float var6) {
        label66: {
            int var7 = CL;
            var7 ^= 1753867629;
            int var8 = System.identityHashCode(var0);
            int var9 = var1.QE();
            long var10 = var8;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            var10 = var12 & 1L;
            long var78;
            int var63 = (var78 = var10 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
            if (var63 != 0) {
                var7 += -1791295969;
                var7 ^= -455050171;
                var7 += -1094659603;
                var7 ^= -287888174;
            } else {
                label76: {
                    var7 = switch (var7) {
                        default -> var7 ^ 1304977798;
                        case 965873502 -> var7 ^ -2047695490;
                        case 1226115455 -> {
                            var7 += -938417481;
                            var7 |= 557918877;
                            var7 *= -410331709;
                            yield var7 ^ -1275057171;
                        }
                    };
                    if (var9 != 0) {
                        var7 = switch (var7) {
                            case -935334512 -> {
                                var7 &= -72925623;
                                var7 &= 679016143;
                                yield var7 ^ 186526409;
                            }
                            case -400491921 -> var7 ^ 1138127594;
                            default -> var7 ^ 815668548;
                        };
                        Integer var53 = var7;
                        if (var53 == null) {
                            break label66;
                        }

                        float var54 = var5 * 0.5F;
                        var10 = var8;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var79;
                        int var67 = (var79 = var10 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                        if (var67 != 0) {
                            var7 -= 1700794452;
                            var7 -= -1526377448;
                            var7 ^= -276903097;
                            break label76;
                        }

                        var7 &= 2084589478;
                        var7 -= 1925156428;
                        var7 ^= -678623860;
                        var7 ^= -1192737267;
                        Integer var68 = var7;
                        if (var68 == null) {
                            break label66;
                        }

                        Paint var69 = var1.Kc();
                        var0.roundRect(var2, var3, var4, var54, var6, var6, 0.0F, 0.0F, var69);
                        var7 &= 1233761017;
                        var7 ^= 1348708463;
                        var7 *= 2014800645;
                        var7 += 525329667;
                        var7 ^= 1691868482;
                    } else {
                        var7 >>>= 30;
                        var7 -= -1016227254;
                        var7 -= -230873075;
                        var7 ^= 1301636535;
                    }

                    var9 = var7 + 1;
                    var9 = var7 * var9;
                    var9 &= 1;
                    if (var9 != 0) {
                        break label66;
                    }

                    float var58 = var1.x();
                    float var59 = var58 * 0.5F;
                    float var70 = var2 + var59;
                    float var11 = var3 + var59;
                    float var76 = var59 * 2.0F;
                    Integer var48 = var8;
                    if (var48 != null) {
                        Integer var45 = switch (var7) {
                            case -595176179 -> var7 ^ -1094271846;
                            case 130045979 -> {
                                var7 |= 693191707;
                                yield var7 ^ 633311105;
                            }
                            default -> var7 ^ 1202648867;
                        };
                        if (var45 != null) {
                            float var46 = var4 - var76;
                            float var51 = var59 * 2.0F;
                            float var52 = var5 - var51;
                            float var60 = var6 - var59;
                            float var61 = Math.max(0.0F, var60);
                            Paint var77 = var1.Io();
                            var0.roundRect(var70, var11, var46, var52, var61, var77);
                            return;
                        }
                        break label66;
                    }

                    var7 ^= 979852598;
                    var7 ^= 704734263;
                }
            }

            Integer var49 = var7;
            if (var49 != null) {
                RuntimeException var50 = new RuntimeException();
                throw var50;
            }
        }

        AssertionError var47 = new AssertionError();
        throw var47;
    }

    public static void MB(Canvas var0, Oo var1, float var2, float var3, float var4, float var5) {
        int var6 = CL;
        var6 ^= -402258821;
        int var7 = System.identityHashCode(var0);
        float var8 = var5 * 0.5F;
        int var9 = var1.kG();
        int var10 = var7 + 1;
        var10 = var7 * var10;
        var7 = var10 & 1;
        if (var7 != 0) {
            var6 >>>= 30;
            var6 |= 654546134;
            var6 ^= 1000306401;
            var6 ^= 1821458225;
            var7 = var6 + 1;
            var7 = var6 * var7;
            var7 &= 1;
            if (var7 == 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        } else {
            var6 *= -264573737;
            var6 &= -248690894;
            var6 ^= -1688561644;
            Integer var20 = var6;
            if (var20 != null) {
                var0.roundRect(var2, var3, var4, var5, var8, var9);
                float var22 = var2 + 0.25F;
                float var28 = var3 + 0.25F;
                var8 = var4 - 0.5F;
                float var30 = var5 - 0.5F;
                float var32 = var5 * 0.5F;
                Paint var11 = var1.FH();
                var0.roundRect(var22, var28, var8, var30, var32, var11);
                return;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    public static void O(Canvas var0, Oo var1, String var2, float var3, float var4, float var5, TextStyle var6) {
        int var7 = CL;
        var7 ^= -1061638035;
        int var8 = System.identityHashCode(var0);
        float var9 = var4 + 12.0F;
        float var10 = var6.size();
        var10 = var5 - var10;
        int var11 = var8 + 1;
        var11 = var8 * var11;
        int var12 = var8 + 2;
        var11 *= var12;
        var8 += 3;
        var11 *= var8;
        var8 = var11 & 7;
        if (var8 != 0) {
            switch (var7) {
                case -517710721:
                    var7 &= -847050871;
                    var7 ^= 1367165790;
                    var7 += -151195541;
                    var7 ^= 1656359426;
                    break;
                case 828008609:
                default:
                    var7 ^= 173663944;
                    break;
                case 1255375281:
                    var7 ^= -2127956636;
            }

            IllegalStateException var34 = new IllegalStateException();
            throw var34;
        } else {
            var7 |= 367556327;
            var7 &= 37995517;
            var7 *= -1885973833;
            var7 ^= 972120316;
            Integer var18 = var7;
            if (var18 == null) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            } else {
                float var19 = var10 * 0.5F;
                float var20 = var19 - 0.2F;
                float var21 = var0.text(var2, var9, var20, var6);
                float var22 = var5 - 0.5F;
                float var32 = var4 * 2.0F;
                float var33 = var3 - var32;
                int var35 = var1.s();
                var0.rect(var4, var22, var33, 0.5F, var35);
            }
        }
    }

    public static void GV(Canvas var0, float var1, float var2, float var3, int var4) {
        int var5 = CL;
        var5 ^= -1930740263;
        int var7 = System.identityHashCode(var0);
        float var8 = var3 * 0.11F;
        var8 = Math.max(0.55F, var8);
        long var9 = var7;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        var9 = var11 & 1L;
        long var38;
        var7 = (var38 = var9 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var7 != 0) {
            var5 += -1091182041;
            var5 *= 468644977;
            var5 ^= -1247696851;
            Integer var28 = var4;
            if (var28 != null) {
                AssertionError var29 = new AssertionError();
                throw var29;
            }
        } else {
            switch (var5) {
                case -1384656437:
                    var5 += -1266688147;
                    var5 ^= -1769356934;
                    break;
                case 1472548916:
                default:
                    var5 ^= 52059664;
                    break;
                case 2065361076:
                    var5 ^= 404727461;
            }

            Integer var21 = var4;
            if (var21 != null) {
                float var6 = var3 * 0.17F;
                var6 = var2 - var6;
                float var30 = var3 * 0.19F;
                Paint var33 = Paint.solid(var4);
                Paint var34 = var33.stroke(var8);
                var0.circle(var1, var6, var30, var34);
                var6 = var3 * 0.46F;
                var6 = var2 + var6;
                float var31 = var3 * 0.36F;
                Paint var35 = Paint.solid(var4);
                var0.arc(var1, var6, var31, var8, (float) Math.PI, (float) Math.PI, var35);
                return;
            }
        }

        IllegalStateException var22 = new IllegalStateException();
        throw var22;
    }

    public static void MY(Canvas var0, float var1, float var2, float var3, int var4, int var5) {
        int var6 = CL;
        var6 ^= -157470603;
        int var8 = System.identityHashCode(var0);
        float var9 = var3 * 0.1F;
        var9 = Math.max(0.55F, var9);
        float var10 = var3 * 0.3F;
        float var11 = var3 * 0.16F;
        var11 = var2 + var11;
        var0.save();
        float var12 = var1 - var10;
        float var13 = var10 * 0.1F;
        var13 = var11 - var13;
        float var14 = var10 * 2.0F;
        long var15 = var8;
        long var17 = var15 + 1L;
        var17 = var15 * var17;
        long var19 = var15 + 2L;
        var17 *= var19;
        var15 += 3L;
        var17 *= var15;
        var15 = var17 & 7L;
        long var64;
        var8 = (var64 = var15 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
        if (var8 == 0) {
            var6 >>>= 28;
            var6 ^= 1118504138;
            float var35 = var10 * 1.2F;
            var0.clip(var12, var13, var14, var35, 0.0F);
            float var36 = var9 * 0.5F;
            float var37 = var10 - var36;
            var0.circle(var1, var11, var37, var5);
            var0.restore();
            Paint var38 = Paint.solid(var4);
            Paint var39 = var38.stroke(var9);
            var0.circle(var1, var11, var10, var39);
            float var40 = var3 * 0.1F;
            float var41 = var1 - var40;
            var10 = var3 * 0.42F;
            var10 = var2 - var10;
            var11 = var3 * 0.2F;
            var12 = var3 * 0.3F;
            var13 = var3 * 0.04F;
            Paint var58 = Paint.solid(var4);
            Paint var45 = var58.stroke(var9);
            var0.roundRect(var41, var10, var11, var12, var13, var45);
            float var42 = var3 * 0.14F;
            float var43 = var1 - var42;
            var9 = var3 * 0.48F;
            var9 = var2 - var9;
            var10 = var3 * 0.28F;
            var11 = var3 * 0.08F;
            var12 = var3 * 0.04F;
            var0.roundRect(var43, var9, var10, var11, var12, var4);
        } else {
            var6 -= 1854940444;
            var6 *= -2106549469;
            var6 ^= -1187629706;
            var6 -= -774397026;
            var6 ^= 46685863;
            var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 == 0) {
                IllegalStateException var31 = new IllegalStateException();
                throw var31;
            } else {
                AssertionError var30 = new AssertionError();
                throw var30;
            }
        }
    }

    public static void W(Canvas var0, float var1, float var2, float var3, int var4, double var5) {
        int var7 = CL;
        var7 ^= -412570676;
        int var9 = System.identityHashCode(var0);
        float var10 = var3 * 0.1F;
        var10 = Math.max(0.55F, var10);
        float var11 = var3 * 0.42F;
        Paint var12 = Paint.solid(var4);
        var12 = var12.stroke(var10);
        var0.circle(var1, var2, var11, var12);
        double var41 = var5 * 1.2;
        double var42 = var41 % (float) (Math.PI * 2);
        var11 = (float)var42;
        var11--;
        float var51 = var3 * 0.25F;
        double var13 = var11;
        var13 = Math.cos(var13);
        float var56 = (float)var13;
        float var57 = var56 * var51;
        float var58 = var1 + var57;
        double var14 = var11;
        var14 = Math.sin(var14);
        var11 = (float)var14;
        var11 *= var51;
        var11 = var2 + var11;
        var0.line(var1, var2, var58, var11, var10, var4);
        var11 = var3 * 0.13F;
        var11 = var1 + var11;
        int var52 = var9 + 1;
        int var53 = var9 * var52;
        var9 = var53 & 1;
        if (var9 != 0) {
            switch (var7) {
                case -957069346:
                    var7 -= -348981225;
                    var7 += 1351183989;
                    var7 &= 899557362;
                    var7 ^= -935139757;
                    break;
                case -71036154:
                default:
                    var7 ^= -1052973744;
                    break;
                case 529828704:
                    var7 ^= 326463150;
            }

            var9 = var4 + 1;
            var9 = var4 * var9;
            int var54 = var4 + 2;
            var9 *= var54;
            int var8 = var4 + 3;
            var9 *= var8;
            var8 = var9 & 7;
            if (var8 != 0) {
                IllegalStateException var34 = new IllegalStateException();
                throw var34;
            } else {
                IllegalStateException var33 = new IllegalStateException();
                throw var33;
            }
        } else {
            switch (var7) {
                case -957069346:
                    var7 &= -1470099348;
                    var7 *= -2128976903;
                    var7 &= 513723346;
                    var7 |= -1695515473;
                    var7 ^= 1537596231;
                    break;
                case -665178209:
                    var7 ^= -1483714009;
                    break;
                case -384297308:
                default:
                    var7 ^= 916682108;
            }

            float var24 = var3 * 0.08F;
            float var25 = var2 + var24;
            var0.line(var1, var2, var11, var25, var10, var4);
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 752265517;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        CL = var4;
    }
}
