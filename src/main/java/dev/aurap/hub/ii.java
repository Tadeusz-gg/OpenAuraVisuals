package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.text.Font;
import dev.skidware.visuals.render.text.FontFamily;
import dev.skidware.visuals.render.text.FontWeight;
import dev.skidware.visuals.render.text.Glyph;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class ii {
    private static final String ld = "▶";
    private static final String Ll = "◀";
    private static final String RK = "♫";
    private static final int g = 9654;
    private static final int M = 9664;
    private static final int Lo = 9835;
    private static final float cq = 1.42F;
    private static final float cW = 0.07F;
    public static final int K;

    private ii() {
    }

    public static TextStyle rO(float var0, int var1) {
        int var2 = K;
        var2 ^= -1020614707;
        int var4 = (int)var0;
        float var5 = var0 * 1.42F;
        TextStyle var28 = TextStyle.of(var5, var1);
        TextStyle var29 = var28.bold();
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var39;
        var4 = (var39 = var6 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var4 != 0) {
            switch (var2) {
                case -1262958992:
                default:
                    var2 ^= -1589118178;
                    break;
                case -1252243306:
                    var2 ^= -370995894;
                    break;
                case 1232034913:
                    var2 -= 1145917095;
                    var2 ^= 1337493911;
                    var2 += -893785857;
                    var2 ^= 956004229;
            }

            var6 = var1;
            var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var40;
            var4 = (var40 = var6 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            var2 |= -1496273582;
            var2 ^= -1421328111;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return var29.weight(0.07F);
            }
        }

        IllegalStateException var24 = new IllegalStateException();
        throw var24;
    }

    public static TextStyle w(float var0, int var1) {
        int var2 = K;
        var2 ^= 1994457223;
        int var3 = (int)var0;
        Integer var14 = var3;
        if (var14 != null) {
            switch (var2) {
                case -287566862:
                    var2 ^= -1889919902;
                    break;
                case -56296661:
                    var2 &= -2063394978;
                    var2 ^= -277327680;
                    var2 ^= 1854559614;
                    var2 ^= -818950684;
                    break;
                case 1689281299:
                default:
                    var2 ^= -2141077738;
            }

            TextStyle var15 = TextStyle.of(var0, var1);
            return var15.semibold();
        } else {
            var2 -= -390338239;
            var2 ^= 1334450264;
            UnsupportedOperationException var7 = new UnsupportedOperationException();
            throw var7;
        }
    }

    public static void J(Canvas var0, float var1, float var2, TextStyle var3) {
        int var4 = K;
        var4 ^= -1754800390;
        int var5 = System.identityHashCode(var0);
        int var6 = var4 + 865896810;
        var6 ^= -673992877;
        var6 ^= 1580409645;
        float var27 = K(var3, var6);
        float var28 = var27 * 0.06F;
        float var29 = var1 + var28;
        Integer var23 = var5;
        if (var23 != null) {
            var4 |= -481960365;
            var4 <<= 20;
            var4 |= 1075933834;
            var4 ^= 444288743;
            long var7 = var4;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var34;
            int var24 = (var34 = var7 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var24 == 0) {
                wN(var0, 9654, "▶", var29, var2, var3);
                return;
            }
        } else {
            var4 *= 1961611445;
            var4 ^= 55926220;
            long var18 = var4;
            long var30 = var18 + 1L;
            long var31 = var18 * var30;
            long var19 = var31 & 1L;
            long var35;
            var4 = (var35 = var19 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var22 = new UnsupportedOperationException();
                throw var22;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    public static void U(Canvas var0, float var1, float var2, float var3, int var4) {
        int var5 = K;
        var5 ^= 579379604;
        int var6 = System.identityHashCode(var0);
        float var7 = var3 * 0.27F;
        float var8 = var3 * 0.84F;
        float var9 = var3 * 0.2F;
        float var10 = var7 * 0.32F;
        float var11 = var9 * 0.5F;
        var11 = var1 - var11;
        var11 -= var7;
        float var12 = var8 * 0.5F;
        long var13 = var6;
        long var15 = var13 + 1L;
        var15 = var13 * var15;
        long var17 = var13 + 2L;
        var15 *= var17;
        var13 += 3L;
        var15 *= var13;
        var13 = var15 & 7L;
        long var40;
        var6 = (var40 = var13 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        if (var6 != 0) {
            var5 &= 1203280372;
            var5 *= 1317133885;
            var5 <<= 14;
            var5 ^= -2089736114;
            RuntimeException var32 = new RuntimeException();
            throw var32;
        } else {
            var5 <<= 5;
            var5 ^= 585981255;
            float var22 = var2 - var12;
            var0.roundRect(var11, var22, var7, var8, var10, var4);
            float var23 = var9 * 0.5F;
            float var24 = var1 + var23;
            float var30 = var8 * 0.5F;
            float var31 = var2 - var30;
            var0.roundRect(var24, var31, var7, var8, var10, var4);
        }
    }

    public static void mr(Canvas var0, float var1, float var2, TextStyle var3, int var4) {
        int var5 = K;
        var5 ^= 572818226;
        int var7 = System.identityHashCode(var0);
        int var8 = var5 + -1591134772;
        var8 ^= -1865118508;
        float var31 = K(var3, var8);
        float var32 = var31 / 0.86F;
        float var9 = var32 * 0.17F;
        float var10 = var32 * 0.86F;
        float var11 = var10 * 0.86F;
        var11 += var9;
        float var12 = var11 * 0.5F;
        var12 = var1 - var12;
        var10 *= 0.43F;
        var10 = var12 + var10;
        wN(var0, 9654, "▶", var10, var2, var3);
        var10 = var12 + var11;
        Integer var27 = var7;
        if (var27 != null) {
            var5 += 592737665;
            var5 *= 999930485;
            var5 ^= 1449105767;
            float var29 = var10 - var9;
            var10 = var32 * 0.4F;
            var10 = var2 - var10;
            float var33 = var32 * 0.8F;
            var11 = var9 * 0.4F;
            var0.roundRect(var29, var10, var9, var33, var11, var4);
        } else {
            var5 &= -652962449;
            var5 *= -1836801019;
            var5 ^= 1448334935;
            var5 = var4 + 1;
            var5 = var4 * var5;
            int var28 = var4 + 2;
            var5 *= var28;
            int var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 == 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            } else {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        }
    }

    public static void G(Canvas var0, float var1, float var2, TextStyle var3, int var4) {
        int var5 = K;
        var5 ^= 787474812;
        int var6 = System.identityHashCode(var0);
        int var7 = var5 * -284803271;
        var7 &= 582204141;
        var7 ^= -112393474;
        float var30 = K(var3, var7);
        float var31 = var30 / 0.86F;
        float var8 = var31 * 0.17F;
        float var9 = var31 * 0.86F;
        float var10 = var9 * 0.86F;
        var10 += var8;
        var10 *= 0.5F;
        var10 = var1 - var10;
        Integer var23 = var6;
        if (var23 == null) {
            var5 *= 246031949;
            var5 |= -833995398;
            var5 ^= -1354696423;
            AssertionError var27 = new AssertionError();
            throw var27;
        } else {
            switch (var5) {
                case -2066281748:
                default:
                    var5 ^= 1761677051;
                    break;
                case -1532357936:
                    var5 += -341639856;
                    var5 *= -219714079;
                    var5 ^= -208234542;
                    break;
                case -836913294:
                    var5 ^= 2085717092;
            }

            float var24 = var31 * 0.4F;
            float var25 = var2 - var24;
            float var32 = var31 * 0.8F;
            float var36 = var8 * 0.4F;
            var0.roundRect(var10, var25, var8, var32, var36, var4);
            float var18 = var10 + var8;
            float var26 = var9 * 0.43F;
            float var19 = var18 + var26;
            wN(var0, 9664, "◀", var19, var2, var3);
        }
    }

    public static void o(Canvas var0, float var1, float var2, TextStyle var3) {
        int var4 = K;
        var4 ^= 408235586;
        int var5 = System.identityHashCode(var0);
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var5 = var6 & 1;
        if (var5 == 0) {
            var4 |= 42723969;
            var4 ^= 310583861;
            wN(var0, 9835, "♫", var1, var2, var3);
        } else {
            var4 &= -55313070;
            var4 &= -830283606;
            var4 >>= 5;
            var4 >>= 18;
            var4 ^= -1353183092;
            Integer var13 = var4;
            if (var13 == null) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            } else {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        }
    }

    public static void ZI(Canvas var0, float var1, float var2, float var3, float var4, float[] var5, int var6) {
        label91: {
            int var7 = K;
            int var8 = var6;
            var7 ^= -1202038936;
            int var9 = System.identityHashCode(var0);
            int var10 = var5.length;
            int var90 = var10;
            float var11 = var10;
            var11 *= 1.7F;
            var11 = var3 / var11;
            float var12 = var4 * 0.32F;
            var11 = Math.min(var11, var12);
            var11 = var11;
            Integer var96 = var9;
            int var13 = of_2.KM;
            var7 ^= var13;
            var7 ^= -1337530627;
            var13 = of_2.x;
            var7 ^= var13;
            var7 ^= 598208521;
            if (var96 == null) {
                var7 *= -1182107783;
                var7 >>>= 24;
                var7 += 1346815141;
                var7 >>>= 27;
                var7 ^= 1722801990;
            } else {
                label93: {
                    var7 &= 712571388;
                    var7 *= 553178647;
                    var7 ^= -272753794;
                    int var97 = var6 + 1;
                    int var98 = var6 * var97;
                    var13 = var6 + 2;
                    int var99 = var98 * var13;
                    var13 = var6 + 3;
                    int var100 = var99 * var13;
                    int var101 = var100 & 7;
                    if (var101 != 0) {
                        break label91;
                    }

                    if (var10 > 1) {
                        var7 >>= 29;
                        var7 ^= -981820603;
                        var12 = var3 - var11;
                        var13 = var10 - 1;
                        float var110 = var13;
                        int var14 = var9 + 1;
                        var14 = var9 * var14;
                        var14 &= 1;
                        if (var14 != 0) {
                            var7 |= -1298418303;
                            var7 *= 97122349;
                            var7 ^= 85858372;
                            var7 ^= -1929790733;
                            break label93;
                        }

                        var7 &= 698202605;
                        var7 += -37572295;
                        var7 &= 627372870;
                        var7 ^= -1016886306;
                        var12 /= var110;
                        var12 = var12;
                        var7 ^= 1548916187;
                        var7 ^= 708028894;
                    } else {
                        var7 &= 1673320766;
                        var7 &= -1528091860;
                        var7 ^= 206025286;
                        var7 ^= -814048603;
                        var13 = var6 + 1;
                        var13 = var6 * var13;
                        int var124 = var6 + 2;
                        var13 *= var124;
                        var124 = var6 + 3;
                        var13 *= var124;
                        var13 &= 7;
                        if (var13 != 0) {
                            break label91;
                        }

                        var12 = 0.0F;
                        var7 += -2058842530;
                        var7 ^= -666412356;
                    }

                    var13 = var6 + 1;
                    var13 = var6 * var13;
                    var13 &= 1;
                    if (var13 != 0) {
                        break label91;
                    }

                    var12 = var12;
                    float var119 = var4 * 0.5F;
                    float var120 = var2 + var119;
                    int var126 = var9 + 1;
                    var126 = var9 * var126;
                    var126 &= 1;
                    if (var126 == 0) {
                        var7 -= -1779535603;
                        var7 <<= 23;
                        var7 ^= 1659725154;
                        var7 ^= 406949869;
                        var126 = var6 + 1;
                        var126 = var6 * var126;
                        int var15 = var6 + 2;
                        var126 *= var15;
                        var15 = var6 + 3;
                        var126 *= var15;
                        var126 &= 7;
                        if (var126 != 0) {
                            break label91;
                        }

                        float var121 = var120;
                        int var134 = 0;
                        var134 = var134;

                        var7 = switch (var7) {
                            case -772085377 -> var7 ^ 2041318999;
                            case 850193039 -> {
                                var7 += 160149848;
                                var7 *= 2083284371;
                                var7 += 1812022684;
                                yield var7 ^ -214353670;
                            }
                            default -> var7 ^ 1728542735;
                        };

                        while (true) {
                            if (var134 >= var90) {
                                var7 -= -1815296699;
                                var7 += 1919197222;
                                var7 -= 1289429628;
                                var7 *= 715926281;
                                var7 ^= -1206418524;
                                Integer var85 = var8;
                                if (var85 != null) {
                                    return;
                                }
                                break label91;
                            }

                            var7 *= -439303225;
                            var7 ^= -1757275493;
                            float var137 = var5[var134];
                            float var138 = Math.min(1.0F, var137);
                            float var139 = var138 * var4;
                            float var140 = Math.max(var11, var139);
                            float var16 = var134;
                            var16 *= var12;
                            var16 = var1 + var16;
                            float var17 = var140 * 0.5F;
                            var17 = var121 - var17;
                            float var18 = var11 * 0.5F;
                            var0.roundRect(var16, var17, var11, var140, var18, var6);
                            var15 = var134 + 1;
                            long var144 = var9;
                            long var151 = var144 + 1L;
                            long var152 = var144 * var151;
                            long var145 = var152 & 1L;
                            long var153;
                            int var146 = (var153 = var145 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
                            if (var146 != 0) {
                                var7 += 502013587;
                                var7 &= -492249966;
                                var7 ^= -2035836068;
                                break;
                            }

                            var7 *= -1442154463;
                            var7 &= -2055409003;
                            var7 ^= -341105524;
                            int var147 = var8 + 1;
                            int var148 = var8 * var147;
                            int var149 = var148 & 1;
                            if (var149 != 0) {
                                break label91;
                            }

                            var134 = var15;
                            switch (var7) {
                                case -357054968:
                                    var7 &= 2047194020;
                                    var7 &= 1802608999;
                                    var7 >>= 5;
                                    var7 ^= -2800748;
                                    var7 ^= 168073519;
                                    break;
                                case -12952527:
                                default:
                                    var7 ^= 416573862;
                                    break;
                                case 1884723622:
                                    var7 ^= 2138671545;
                            }
                        }
                    } else {
                        switch (var7) {
                            case -1857882723:
                                var7 &= -2049233707;
                                var7 ^= -403833895;
                                break;
                            case -1298300413:
                            default:
                                var7 ^= 1550610587;
                                break;
                            case -1213115737:
                                var7 ^= 1796881115;
                        }
                    }
                }
            }

            long var79 = var8;
            long var86 = var79 + 1L;
            long var87 = var79 * var86;
            long var95 = var79 + 2L;
            long var88 = var87 * var95;
            long var80 = var79 + 3L;
            long var89 = var88 * var80;
            long var81 = var89 & 7L;
            long var154;
            var7 = (var154 = var81 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
            if (var7 == 0) {
                IllegalStateException var83 = new IllegalStateException();
                throw var83;
            }
        }

        UnsupportedOperationException var84 = new UnsupportedOperationException();
        throw var84;
    }

    private static float K(TextStyle var0, int var1) {
        int var3 = System.identityHashCode(var0);
        float var4 = var0.size();
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 == 0) {
            int var12 = var1 | -595756030;
            var12 ^= 1836945361;
            return var4 / 1.42F;
        } else {
            int var2 = switch (var1) {
                case -648142146 -> {
                    int var6 = var1 | 1952841426;
                    var6 |= 1600292560;
                    var6 ^= -924903273;
                    yield var6 ^ 890771632;
                }
                default -> var1 ^ 1011590772;
                case 243301915 -> var1 ^ 222350355;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                IllegalArgumentException var11 = new IllegalArgumentException();
                throw var11;
            } else {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            }
        }
    }

    public static void wN(Canvas var0, int var1, String var2, float var3, float var4, TextStyle var5) {
        label75: {
            int var6 = K;
            var6 ^= 993562840;
            int var8 = System.identityHashCode(var0);
            Integer var9 = var8;
            int var10 = of_2.KM;
            var6 ^= var10;
            var6 ^= -1337530627;
            of_2.KM = -1337530627;
            var10 = of_2.x;
            var6 ^= var10;
            var6 ^= 598208521;
            of_2.x = 598208521;
            if (var9 == null) {
                var6 >>= 7;
                var6 ^= 1276766280;
                var6 -= -212554862;
                var6 ^= 428849748;
            } else {
                label77: {
                    var6 ^= 547660314;
                    var6 |= 941822873;
                    var6 ^= -529434854;
                    var6 |= 944855303;
                    var6 ^= 1710479102;
                    Font var91 = var5.font();
                    Font var96;
                    if (var91 != null) {
                        var6 += -367970144;
                        var6 ^= -1155098538;
                        var6 ^= 1468020275;
                        var6 -= 191976775;
                        var6 ^= -1067575158;
                        int var92 = var1 + 1;
                        var92 = var1 * var92;
                        var92 &= 1;
                        if (var92 != 0) {
                            break label75;
                        }

                        Font var95 = var5.font();
                        long var101 = var8;
                        long var12 = var101 + 1L;
                        var12 = var101 * var12;
                        long var14 = var101 + 2L;
                        var12 *= var14;
                        long var102 = var101 + 3L;
                        var12 *= var102;
                        long var103 = var12 & 7L;
                        long var139;
                        var10 = (var139 = var103 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            var6 ^= 1072608746;
                            var6 ^= -113833811;
                            break label77;
                        }

                        var6 |= -1690753330;
                        var6 += 1838302559;
                        var6 -= 1609192403;
                        var6 ^= 635181788;
                        var10 = var1 + 1;
                        var10 = var1 * var10;
                        int var11 = var1 + 2;
                        var10 *= var11;
                        var11 = var1 + 3;
                        var10 *= var11;
                        var10 &= 7;
                        if (var10 != 0) {
                            break label75;
                        }

                        var96 = var95;
                        var6 *= -968214599;
                        var6 <<= 20;
                        var6 += -585241011;
                        var6 ^= 899322131;
                    } else {
                        var6 = switch (var6) {
                            default -> var6 ^ 1556406454;
                            case -243510412 -> var6 ^ 331719588;
                            case 472394521 -> {
                                var6 >>= 17;
                                var6 += 155799064;
                                var6 &= 1000973744;
                                yield var6 ^ 625844218;
                            }
                        };
                        var10 = var1 + 1;
                        var10 = var1 * var10;
                        int var123 = var1 + 2;
                        var10 *= var123;
                        var123 = var1 + 3;
                        var10 *= var123;
                        var10 &= 7;
                        if (var10 != 0) {
                            break label75;
                        }

                        FontFamily var115 = var0.fonts();
                        Integer var125 = var8;
                        if (var125 == null) {
                            switch (var6) {
                                case 41007850:
                                    var6 ^= -760983515;
                                    break label77;
                                case 742693850:
                                    var6 += 79236482;
                                    var6 &= -638106015;
                                    var6 *= 120230653;
                                    var6 ^= 1253717339;
                                    var6 ^= -707373245;
                                    break label77;
                                case 1171303016:
                                default:
                                    var6 ^= 961410235;
                                    break label77;
                            }
                        }

                        var6 -= 1148508064;
                        var6 *= 514616365;
                        var6 -= -1778840699;
                        var6 ^= -1391949668;
                        FontWeight var126 = var5.fontWeight();
                        Font var116 = var115.face(var126);
                        var96 = var116;
                        var6 *= -609088775;
                        var6 <<= 2;
                        var6 &= 1863847152;
                        var6 ^= 1100968958;
                    }

                    long var117 = var1;
                    long var133 = var117 + 1L;
                    var133 = var117 * var133;
                    long var118 = var133 & 1L;
                    long var140;
                    var10 = (var140 = var118 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                    if (var10 != 0) {
                        break label75;
                    }

                    Integer var80 = var8;
                    if (var80 != null) {
                        var6 |= -1167955216;
                        var6 -= 1599177070;
                        var6 >>>= 5;
                        var6 ^= -2105886081;
                        var80 = var1;
                        if (var80 != null) {
                            Glyph var82 = var96.glyph(var1);
                            float var120 = var5.size();
                            float var121 = var120 / 48.0F;
                            float var127 = var82.xOffset();
                            int var135 = var82.width();
                            float var136 = var135;
                            float var137 = var136 * 0.5F;
                            var127 += var137;
                            var127 *= var121;
                            float var97 = var96.ascent();
                            float var138 = var82.yOffset();
                            float var98 = var97 + var138;
                            int var83 = var82.height();
                            float var84 = var83;
                            float var85 = var84 * 0.5F;
                            float var86 = var98 + var85;
                            float var87 = var86 * var121;
                            float var99 = var3 - var127;
                            float var88 = var4 - var87;
                            float var89 = var0.text(var2, var99, var88, var5);
                            return;
                        }
                        break label75;
                    }

                    switch (var6) {
                        case 553696319:
                        default:
                            var6 ^= 136115427;
                            break;
                        case 1070821278:
                            var6 ^= 808234358;
                            break;
                        case 1687650142:
                            var6 >>= 30;
                            var6 <<= 14;
                            var6 ^= 1228851571;
                            var6 ^= -1869130709;
                    }
                }
            }

            var6 = var1 + 1;
            var6 = var1 * var6;
            var8 = var1 + 2;
            var6 *= var8;
            int var7 = var1 + 3;
            var6 *= var7;
            var6 &= 7;
            if (var6 == 0) {
                UnsupportedOperationException var78 = new UnsupportedOperationException();
                throw var78;
            }
        }

        IllegalArgumentException var79 = new IllegalArgumentException();
        throw var79;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -519881014;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        K = var4;
    }
}
