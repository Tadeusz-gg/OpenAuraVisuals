package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.client.gui.widget.ButtonWidget.Builder;
import net.minecraft.client.gui.widget.ButtonWidget.PressAction;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public final class Na extends Screen {
    private final ClientRuntime cl;
    private Uo GG;
    public static final int Fc;

    public Na(ClientRuntime var1) {
        super(Text.literal("Aura Visuals - Licencja"));
        this.cl = var1;
    }

    protected void init() {
        int var1 = Fc;
        var1 ^= -582766300;
        int var2 = System.identityHashCode(this);
        ClientRuntime var3 = this.cl;
        xy var47 = var3.nT();
        KP var48 = var47.UJ();
        Uo var4 = var48.b();
        this.GG = var4;
        int var56 = this.width;
        int var57 = var56 / 2;
        int var5 = this.height;
        var5 /= 4;
        var5 = Math.max(40, var5);
        Integer var33 = var2;
        if (var33 == null) {
            var1 = switch (var1) {
                case -1191958173 -> {
                    var1 -= 1581862288;
                    var1 ^= 1903708836;
                    var1 ^= 1237870905;
                    var1 ^= -1683380153;
                    yield var1 ^ 944277054;
                }
                case -1117999714 -> var1 ^ 878410925;
                default -> var1 ^ -1618828280;
            };
            int var42 = var1 + 1;
            var42 = var1 * var42;
            var42 &= 1;
            if (var42 == 0) {
                IllegalStateException var46 = new IllegalStateException();
                throw var46;
            } else {
                RuntimeException var45 = new RuntimeException();
                throw var45;
            }
        } else {
            var1 = switch (var1) {
                case -1191958173 -> {
                    var1 *= -1816014301;
                    var1 -= -392684580;
                    yield var1 ^ 1551454728;
                }
                case 468017785 -> var1 ^ 1233228885;
                default -> var1 ^ -1059395247;
            };
            short var60 = 320;
            int var6 = var60 / 2;
            var6 = var57 - var6;
            MutableText var8 = Text.literal("Aura Visuals - status licencji");
            Formatting var9 = Formatting.WHITE;
            var8 = var8.formatted(var9);
            TextRenderer var69 = this.textRenderer;
            TextWidget var7 = new TextWidget(var6, var5, var60, 14, var8, var69);
            Element var62 = this.addDrawableChild(var7);
            int var66 = var5 + 22;
            int var70 = var1 * 1797696601;
            int var71 = var70 & 1538747024;
            int var72 = var71 ^ 429581891;
            String var73 = A(var48, var72);
            MutableText var74 = Text.literal(var73);
            Uo var10 = var48.b();
            var1 |= 1489832909;
            var1 += 984098542;
            var1 &= -1875657032;
            var1 ^= -1229380609;
            Formatting var19 = Fy(var10, var1);
            MutableText var20 = var74.formatted(var19);
            TextRenderer var75 = this.textRenderer;
            var7 = new TextWidget(var6, var66, var60, 12, var20, var75);
            Element var21 = this.addDrawableChild(var7);
            int var64 = var5 + 40;
            String var49 = var48.K();
            MutableText var50 = Text.literal(var49);
            Formatting var67 = Formatting.GRAY;
            MutableText var51 = var50.formatted(var67);
            TextRenderer var68 = this.textRenderer;
            TextWidget var22 = new TextWidget(var6, var64, var60, 12, var51, var68);
            Element var23 = this.addDrawableChild(var22);
            var1 = var5 + 70;
            MutableText var35 = Text.literal("Ponów");
            PressAction var52 = var1x -> {
                int var2x = Fc;
                var2x ^= 1569753934;
                int var3x = System.identityHashCode(this);
                ClientRuntime var4x = this.cl;
                xy var26x = var4x.nT();
                int var5x = var3x + 1;
                var5x = var3x * var5x;
                var3x = var5x & 1;
                if (var3x == 0) {
                    var2x >>>= 3;
                    var2x &= 1148923316;
                    var2x *= -1481358543;
                    var2x ^= 1829477167;
                    long var29x = var2x;
                    long var7x = var29x + 1L;
                    var7x = var29x * var7x;
                    long var30x = var7x & 1L;
                    long var32x;
                    var3x = (var32x = var30x - 0L) == 0L ? 0 : (var32x < 0L ? -1 : 1);
                    if (var3x == 0) {
                        var26x.Wr();
                        return;
                    }
                } else {
                    var2x ^= -1447816133;
                    var2x ^= 480844573;
                    var3x = var2x + 1;
                    var3x = var2x * var3x;
                    int var27x = var2x + 2;
                    var3x *= var27x;
                    var2x += 3;
                    var3x *= var2x;
                    var2x = var3x & 7;
                    if (var2x == 0) {
                        IllegalStateException var19x = new IllegalStateException();
                        throw var19x;
                    }
                }

                UnsupportedOperationException var18x = new UnsupportedOperationException();
                throw var18x;
            };
            Builder var36 = ButtonWidget.builder(var35, var52);
            int var53 = var57 - 102;
            Builder var37 = var36.dimensions(var53, var1, 100, 20);
            ButtonWidget var38 = var37.build();
            Element var39 = this.addDrawableChild(var38);
            MutableText var40 = Text.literal("Zamknij");
            PressAction var54 = var1x -> {
                int var2x = Fc;
                var2x ^= -1793530327;
                int var3x = System.identityHashCode(this);
                Integer var16x = var3x;
                if (var16x == null) {
                    long var17x = switch (var2x) {
                        default -> var2x ^ 94065879;
                        case -834172284 -> var2x ^ 1128165698;
                        case -256934290 -> {
                            var2x &= -1560030160;
                            var2x <<= 24;
                            yield var2x ^ 1445401559;
                        }
                    };
                    long var5x = var17x + 1L;
                    var5x = var17x * var5x;
                    long var18x = var5x & 1L;
                    long var22x;
                    int var19x = (var22x = var18x - 0L) == 0L ? 0 : (var22x < 0L ? -1 : 1);
                    if (var19x == 0) {
                        AssertionError var20x = new AssertionError();
                        throw var20x;
                    }
                } else {
                    var2x ^= 1753753977;
                    var2x *= -1475579641;
                    var2x ^= -1951145121;
                    Integer var14x = var2x;
                    if (var14x != null) {
                        this.close();
                        return;
                    }
                }

                AssertionError var15x = new AssertionError();
                throw var15x;
            };
            Builder var41 = ButtonWidget.builder(var40, var54);
            int var55 = var57 + 2;
            Builder var25 = var41.dimensions(var55, var1, 100, 20);
            ButtonWidget var26 = var25.build();
            Element var27 = this.addDrawableChild(var26);
        }
    }

    public void tick() {
        int var1 = Fc;
        var1 ^= 1475940468;
        int var2 = System.identityHashCode(this);
        ClientRuntime var3 = this.cl;
        xy var48 = var3.nT();
        KP var49 = var48.UJ();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var56;
        var2 = (var56 = var4 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= -1299258945;
            var1 ^= 1576652300;
            var1 ^= 1654160645;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var53 = var1 + 2;
            var2 *= var53;
            int var54 = var1 + 3;
            var2 *= var54;
            var2 &= 7;
            if (var2 == 0) {
                AssertionError var39 = new AssertionError();
                throw var39;
            }
        } else {
            label33: {
                var1 &= 1203339907;
                var1 -= -1617751244;
                var1 &= -353811202;
                var1 |= -1361648159;
                var1 ^= 1846808765;
                Uo var40 = var49.b();
                Uo var50 = this.GG;
                if (var40 != var50) {
                    var1 |= -1860586099;
                    var1 <<= 27;
                    var1 += 244489915;
                    var1 += -2109517480;
                    var1 ^= -1326571332;
                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    var2 &= 1;
                    if (var2 != 0) {
                        break label33;
                    }

                    this.clearAndInit();
                    switch (var1) {
                        case 274435153:
                        default:
                            var1 ^= 739128755;
                            break;
                        case 943444143:
                            var1 -= -1177811320;
                            var1 ^= -1321051567;
                            var1 -= -937853539;
                            var1 |= -1656092236;
                            var1 ^= -51299847;
                            break;
                        case 1979693396:
                            var1 ^= 1614686624;
                    }
                } else {
                    var1 >>= 30;
                    var1 <<= 9;
                    var1 |= 1670127960;
                    var1 ^= -1672421540;
                }

                var2 = var1 + 1;
                var2 = var1 * var2;
                int var51 = var1 + 2;
                var2 *= var51;
                var1 += 3;
                var2 *= var1;
                var1 = var2 & 7;
                if (var1 == 0) {
                    return;
                }
            }
        }

        AssertionError var32 = new AssertionError();
        throw var32;
    }

    public boolean shouldPause() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    private static String A(KP var0, int var1) {
        String var105 = null;
        label118: {
            int var3 = System.identityHashCode(var0);
            int[] var4 = NO.C;
            Uo var5 = var0.b();
            int var106 = var5.ordinal();
            int var6 = var3 + 1;
            var6 = var3 * var6;
            int var7 = var3 + 2;
            var6 *= var7;
            var7 = var3 + 3;
            var6 *= var7;
            var6 &= 7;
            int var14;
            if (var6 != 0) {
                var14 = var1 | -734866014;
                var14 <<= 12;
                var14 ^= -225352907;
                var14 &= 1574767320;
                var14 ^= -538550793;
            } else {
                var14 = var1 ^ 2086615255;
                var14 ^= 1245251883;
                var6 = var14 + 1;
                var6 = var14 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    break label118;
                }

                int var99 = var4[var106];
                label113:
                switch (var99) {
                    case 1:
                        var14 *= 1088873801;
                        var14 >>>= 21;
                        var14 *= 302079865;
                        var14 ^= -79853118;
                        long var117 = var14;
                        long var149 = var117 + 1L;
                        long var150 = var117 * var149;
                        long var118 = var150 & 1L;
                        long var160;
                        int var119 = (var160 = var118 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                        if (var119 != 0) {
                            break label118;
                        }

                        var105 = "Aktywna";
                        var14 += -7901314;
                        var14 *= 643284555;
                        var14 += -262680361;
                        var14 += -1699468335;
                        var14 ^= -1088473773;
                        break;
                    case 2:
                        var14 = switch (var14) {
                            case -98461488 -> var14 ^ 254545535;
                            default -> var14 ^ 1327206132;
                            case 921302959 -> {
                                var14 += -1071855275;
                                var14 ^= 2033162916;
                                var14 <<= 4;
                                var14 &= 774897432;
                                yield var14 ^ 2062612467;
                            }
                        };
                        long var113 = var14;
                        long var145 = var113 + 1L;
                        long var146 = var113 * var145;
                        long var9 = var113 + 2L;
                        long var147 = var146 * var9;
                        long var114 = var113 + 3L;
                        long var148 = var147 * var114;
                        long var115 = var148 & 7L;
                        long var159;
                        int var116 = (var159 = var115 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                        if (var116 != 0) {
                            break label118;
                        }

                        var105 = "Łączenie…";
                        var14 += 966919965;
                        var14 -= 651910261;
                        var14 += 1086734416;
                        var14 *= -1182651107;
                        var14 ^= -946212248;
                        break;
                    case 3:
                        var14 = switch (var14) {
                            case -1097890416 -> var14 ^ 820112333;
                            default -> var14 ^ 89885840;
                            case 921302959 -> {
                                var14 *= 636343037;
                                var14 &= 2055581411;
                                var14 >>>= 12;
                                var14 |= 1279735356;
                                yield var14 ^ 1956437927;
                            }
                        };
                        var105 = "Ponawianie…";
                        var14 |= 1103387353;
                        var14 += 2121895806;
                        var14 ^= 383203502;
                        break;
                    case 4:
                        var14 *= -318641449;
                        var14 += -1557886789;
                        var14 -= -167104118;
                        var14 *= 1012123433;
                        var14 ^= -1074800896;
                        Integer var112 = var14;
                        if (var112 == null) {
                            break label118;
                        }

                        var105 = "Wygasła";
                        var14 &= -1349506715;
                        var14 &= 1845726467;
                        var14 ^= -426888201;
                        break;
                    case 5:
                        var14 += -1890106520;
                        var14 -= 253900954;
                        var14 ^= -1077546073;
                        int var107 = var14 + 1;
                        int var108 = var14 * var107;
                        var6 = var14 + 2;
                        int var109 = var108 * var6;
                        var6 = var14 + 3;
                        int var110 = var109 * var6;
                        int var111 = var110 & 7;
                        if (var111 != 0) {
                            break label118;
                        }

                        var105 = "Cofnięta";
                        var14 *= 146723763;
                        var14 ^= -1897772306;
                        var14 |= 1083271455;
                        var14 >>= 29;
                        var14 ^= -292670476;
                        break;
                    case 6:
                        var14 ^= 1909795877;
                        var14 ^= -1729709145;
                        var14 ^= -450604781;
                        Integer var104 = var14;
                        if (var104 == null) {
                            break label118;
                        }

                        var105 = "Błąd";
                        switch (var14) {
                            case -1092663455:
                                var14 ^= -1089805419;
                                break label113;
                            case 164151989:
                            default:
                                var14 ^= -1685083722;
                                break label113;
                            case 989737278:
                                var14 -= 184481025;
                                var14 ^= -1049554998;
                                break label113;
                        }
                    default:
                        var14 >>>= 27;
                        var14 >>>= 18;
                        var14 ^= -1154521425;
                        var14 |= -1466187095;
                        var14 ^= 1238232572;
                        long var22 = var14;
                        long var100 = var22 + 1L;
                        long var101 = var22 * var100;
                        long var139 = var22 + 2L;
                        long var102 = var101 * var139;
                        long var23 = var22 + 3L;
                        long var103 = var102 * var23;
                        long var24 = var103 & 7L;
                        long var158;
                        var14 = (var158 = var24 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                        if (var14 == 0) {
                            MatchException var26 = new MatchException(null, null);
                            throw var26;
                        }
                        break label118;
                }

                Integer var120 = var14;
                if (var120 == null) {
                    break label118;
                }

                long var121 = var3;
                long var151 = var121 + 1L;
                long var152 = var121 * var151;
                long var157 = var121 + 2L;
                long var153 = var152 * var157;
                long var122 = var121 + 3L;
                long var154 = var153 * var122;
                long var123 = var154 & 7L;
                long var161;
                var3 = (var161 = var123 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var14 *= 161620415;
                    var14 |= 11320591;
                    var14 -= 201925627;
                    var14 ^= -928264612;
                    var14 ^= -494139090;
                    Integer var96 = var14;
                    if (var96 != null) {
                        boolean var97 = var0.T();
                        String var98;
                        if (var97) {
                            var14 |= -1809837147;
                            var14 ^= -811823161;
                            var98 = " · efekty działają";
                            switch (var14) {
                                case -749106417:
                                    var14 ^= -91583999;
                                    break;
                                case 131793034:
                                default:
                                    var14 ^= -425962192;
                                    break;
                                case 858771552:
                                    var14 &= 1147421143;
                                    var14 >>>= 13;
                                    var14 -= -736403093;
                                    var14 ^= 19459136;
                            }
                        } else {
                            var14 = switch (var14) {
                                default -> var14 ^ -919226134;
                                case -1757439411 -> var14 ^ 1559372467;
                                case -57450970 -> {
                                    var14 *= 1325910739;
                                    var14 ^= -1731442101;
                                    yield var14 ^ -1326746689;
                                }
                            };
                            int var124 = var14 + 1;
                            int var125 = var14 * var124;
                            var6 = var14 + 2;
                            int var126 = var125 * var6;
                            var6 = var14 + 3;
                            int var127 = var126 * var6;
                            int var128 = var127 & 7;
                            if (var128 != 0) {
                                break label118;
                            }

                            var98 = " · efekty zablokowane";
                            var14 *= 321209581;
                            var14 >>= 31;
                            var14 |= -1570957839;
                            var14 ^= -718042104;
                        }

                        long var129 = var14;
                        long var155 = var129 + 1L;
                        long var156 = var129 * var155;
                        long var130 = var156 & 1L;
                        long var162;
                        int var131 = (var162 = var130 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                        if (var131 == 0) {
                            return var105 + var98;
                        }
                    }
                    break label118;
                }

                switch (var14) {
                    case -292670473:
                        var14 >>>= 25;
                        var14 >>= 14;
                        var14 += 1014198640;
                        var14 ^= -296145257;
                        break;
                    case -166337765:
                        var14 ^= 731415434;
                        break;
                    case 846881511:
                    default:
                        var14 ^= -2054865460;
                }
            }

            var3 = var14 + 1;
            var3 = var14 * var3;
            var3 &= 1;
            if (var3 == 0) {
                RuntimeException var95 = new RuntimeException();
                throw var95;
            }
        }

        UnsupportedOperationException var90 = new UnsupportedOperationException();
        throw var90;
    }

    private static Formatting Fy(Uo var0, int var1) {
        label114: {
            int var36;
            Formatting var89;
            label122: {
                int var3 = System.identityHashCode(var0);
                int[] var4 = NO.C;
                int var5 = var0.ordinal();
                int var6 = var3 + 1;
                var6 = var3 * var6;
                int var7 = var3 + 2;
                var6 *= var7;
                var7 = var3 + 3;
                var6 *= var7;
                var6 &= 7;
                label111:
                if (var6 == 0) {
                    var36 = var1 * 1826954649;
                    var36 >>= 20;
                    var36 *= -1313969873;
                    var36 >>>= 25;
                    var36 ^= -183609096;
                    Integer var120 = var36;
                    if (var120 == null) {
                        break label114;
                    }

                    label120: {
                        int var87 = var4[var5];
                        switch (var87) {
                            case 1:
                                var36 += -2084145452;
                                var36 ^= -935405010;
                                var36 >>= 18;
                                var36 ^= 261430567;
                                long var109 = var36;
                                long var152 = var109 + 1L;
                                long var153 = var109 * var152;
                                long var159 = var109 + 2L;
                                long var154 = var153 * var159;
                                long var110 = var109 + 3L;
                                long var155 = var154 * var110;
                                long var111 = var155 & 7L;
                                long var163;
                                var5 = (var163 = var111 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label114;
                                }

                                Formatting var113 = Formatting.GREEN;
                                int var139 = var3 + 1;
                                var139 = var3 * var139;
                                var3 = var139 & 1;
                                if (var3 == 0) {
                                    var36 &= -1930447786;
                                    var36 <<= 22;
                                    var36 >>= 19;
                                    var36 += 1966938147;
                                    var36 ^= 91207181;
                                    var3 = var36 + 1;
                                    var3 = var36 * var3;
                                    var3 &= 1;
                                    if (var3 != 0) {
                                        break label114;
                                    }

                                    var89 = var113;
                                    var36 *= -253717045;
                                    var36 <<= 15;
                                    var36 ^= -2040876562;
                                    break label122;
                                }

                                switch (var36) {
                                    case -261426915:
                                        var36 |= -1931301878;
                                        var36 ^= -1707665927;
                                        break label111;
                                    case 1038247144:
                                    default:
                                        var36 ^= 695718678;
                                        break label111;
                                    case 1759160148:
                                        var36 ^= 1764438446;
                                        break label111;
                                }
                            case 2:
                                var36 ^= -1215491470;
                                var36 &= -663270385;
                                var36 >>>= 3;
                                var36 += 1539446364;
                                var36 ^= 1282115190;
                                break;
                            case 3:
                                var36 -= -1752767659;
                                var36 &= -570250977;
                                var36 ^= 1940641828;
                                break;
                            case 4:
                                var36 &= 128006344;
                                var36 -= -994045577;
                                var36 *= 1514757301;
                                var36 += 1543409015;
                                var36 ^= 886509845;
                                break label120;
                            case 5:
                                var36 >>>= 27;
                                var36 -= -218488504;
                                var36 += 248243520;
                                var36 |= 282989839;
                                var36 ^= -1960419320;
                                var89 = Formatting.RED;
                                var5 = var3 + 1;
                                var5 = var3 * var5;
                                int var121 = var3 + 2;
                                var5 *= var121;
                                var121 = var3 + 3;
                                var5 *= var121;
                                var5 &= 7;
                                if (var5 == 0) {
                                    var36 |= -1962470794;
                                    var36 += 1810776463;
                                    var36 ^= 1617311480;
                                    long var95 = var36;
                                    long var142 = var95 + 1L;
                                    long var143 = var95 * var142;
                                    long var96 = var143 & 1L;
                                    long var162;
                                    var5 = (var162 = var96 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        break label114;
                                    }

                                    var89 = var89;
                                    var36 <<= 27;
                                    var36 &= 1067819090;
                                    var36 ^= -134762002;
                                    break label122;
                                }

                                var36 >>= 2;
                                var36 |= -165398352;
                                var36 -= -163397392;
                                var36 ^= -1725540893;
                                break label111;
                            case 6:
                                var36 += 1371815450;
                                var36 ^= -2057419428;
                                break label120;
                            default:
                                var36 &= 687820999;
                                var36 ^= 600847056;
                                MatchException var81 = new MatchException(null, null);
                                throw var81;
                        }

                        long var104 = var36;
                        long var146 = var104 + 1L;
                        long var147 = var104 * var146;
                        long var9 = var104 + 2L;
                        long var148 = var147 * var9;
                        long var105 = var104 + 3L;
                        long var149 = var148 * var105;
                        long var106 = var149 & 7L;
                        long var160;
                        var5 = (var160 = var106 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label114;
                        }

                        Formatting var108 = Formatting.YELLOW;
                        long var131 = var3;
                        long var8 = var131 + 1L;
                        var8 = var131 * var8;
                        long var132 = var8 & 1L;
                        long var161;
                        int var133 = (var161 = var132 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                        if (var133 == 0) {
                            var36 >>= 7;
                            var36 += 1300125762;
                            var36 ^= 322287748;
                            var133 = var36 + 1;
                            var133 = var36 * var133;
                            var7 = var36 + 2;
                            var133 *= var7;
                            var7 = var36 + 3;
                            var133 *= var7;
                            var133 &= 7;
                            if (var133 != 0) {
                                break label114;
                            }

                            var89 = var108;
                            var36 ^= 1975437753;
                            var36 &= -270333421;
                            var36 ^= -323634705;
                            break label122;
                        }

                        var36 |= -756507784;
                        var36 *= 557014571;
                        var36 ^= -550510184;
                        break label111;
                    }

                    var5 = var36 + 1;
                    var5 = var36 * var5;
                    int var123 = var36 + 2;
                    var5 *= var123;
                    var123 = var36 + 3;
                    var5 *= var123;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label114;
                    }

                    Formatting var103 = Formatting.GOLD;
                    var123 = var3 + 1;
                    var123 = var3 * var123;
                    var7 = var3 + 2;
                    var123 *= var7;
                    var7 = var3 + 3;
                    var123 *= var7;
                    var123 &= 7;
                    if (var123 == 0) {
                        var36 = switch (var36) {
                            default -> var36 ^ 1370379464;
                            case -1014180927 -> {
                                var36 &= -1094996180;
                                var36 |= -1790797287;
                                var36 ^= -579857970;
                                var36 += 1763405906;
                                yield var36 ^ -1505960020;
                            }
                            case 504281865 -> var36 ^ 909999290;
                        };
                        Integer var130 = var36;
                        if (var130 == null) {
                            break label114;
                        }

                        var89 = var103;
                        var36 += 617958492;
                        var36 *= 533031531;
                        var36 ^= -1125263803;
                        var36 ^= -10403936;
                        break label122;
                    }

                    var36 -= -1093322504;
                    var36 *= 548680349;
                    var36 &= 1260990361;
                    var36 ^= 1693763559;
                } else {
                    var36 = var1 >>> 18;
                    var36 *= -1201907771;
                    var36 |= -738532114;
                    var36 ^= -1859707624;
                }

                Integer var71 = var36;
                if (var71 != null) {
                    UnsupportedOperationException var72 = new UnsupportedOperationException();
                    throw var72;
                }
                break label114;
            }

            long var114 = var36;
            long var156 = var114 + 1L;
            var156 = var114 * var156;
            var114 = var156 & 1L;
            long var164;
            int var86 = (var164 = var114 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
            if (var86 == 0) {
                return var89;
            }
        }

        IllegalArgumentException var80 = new IllegalArgumentException();
        throw var80;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1839823050;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Fc = var4;
    }
}
