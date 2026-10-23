package mvggs.modules.animations;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.RotationAxis;

public final class swinganimations extends Module {
    private final ModeSetting G;
    private final NumberSetting D;
    private final NumberSetting EC;
    private final NumberSetting r;
    private final NumberSetting RE;
    private final NumberSetting F;
    private final NumberSetting k;
    public static final int FN;

    public swinganimations() {
        super("swing_animations", "Swing Animations", ModuleCategory.ANIMATIONS);
        ModuleCategory var1 = ModuleCategory.ANIMATIONS;

        D var2 = dev.aurap.hub.D.SMOOTH;
        ModeSetting var3 = new ModeSetting("style", "Style", var2);
        Setting var4 = this.addSetting(var3);
        ModeSetting var5 = (ModeSetting)var4;
        this.G = var5;
        NumberSetting var6 = new NumberSetting("speed", "Swing Speed", 1.0F, 0.4F, 2.5F);
        NumberSetting var7 = var6.W(0.05F);
        NumberSetting var8 = var7.L("x");
        Setting var9 = this.addSetting(var8);
        NumberSetting var10 = (NumberSetting)var9;
        this.D = var10;
        NumberSetting var11 = new NumberSetting("strength", "Swing Strength", 1.0F, 0.35F, 1.8F);
        NumberSetting var12 = var11.W(0.05F);
        NumberSetting var13 = var12.L("x");
        Setting var14 = this.addSetting(var13);
        NumberSetting var15 = (NumberSetting)var14;
        this.EC = var15;
        NumberSetting var16 = new NumberSetting("scale", "Item Scale", 1.0F, 0.4F, 1.6F);
        NumberSetting var17 = var16.W(0.05F);
        NumberSetting var18 = var17.L("x");
        Setting var19 = this.addSetting(var18);
        NumberSetting var20 = (NumberSetting)var19;
        this.r = var20;
        NumberSetting var21 = new NumberSetting("offset_x", "Offset X", 0.0F, -1.0F, 1.0F);
        NumberSetting var22 = var21.W(0.02F);
        Setting var23 = this.addSetting(var22);
        NumberSetting var24 = (NumberSetting)var23;
        this.RE = var24;
        NumberSetting var25 = new NumberSetting("offset_y", "Offset Y", 0.0F, -1.0F, 1.0F);
        NumberSetting var26 = var25.W(0.02F);
        Setting var27 = this.addSetting(var26);
        NumberSetting var28 = (NumberSetting)var27;
        this.F = var28;
        NumberSetting var29 = new NumberSetting("offset_z", "Offset Z", 0.0F, -1.0F, 1.0F);
        NumberSetting var30 = var29.W(0.02F);
        Setting var31 = this.addSetting(var30);
        NumberSetting var32 = (NumberSetting)var31;
        this.k = var32;
        this.dy("Custom first-person swing styles, speed and item placement.");
    }

    public void sR(D var1) {
        int var2 = FN;
        var2 ^= -1509716527;
        int var3 = System.identityHashCode(this);
        Integer var20 = var3;
        if (var20 == null) {
            var2 += 1985539395;
            var2 |= -247804691;
            var2 ^= -1644771520;
            int var21 = var2 + 1;
            var21 = var2 * var21;
            int var4 = var2 + 2;
            var21 *= var4;
            var4 = var2 + 3;
            var21 *= var4;
            var21 &= 7;
            if (var21 == 0) {
                UnsupportedOperationException var26 = new UnsupportedOperationException();
                throw var26;
            }
        } else {
            long var15 = switch (var2) {
                default -> var2 ^ 1220120532;
                case -1659540676 -> {
                    var2 |= -2047625831;
                    var2 >>= 1;
                    var2 -= 246460198;
                    var2 -= -309185765;
                    yield var2 ^ -1002917341;
                }
                case 708422461 -> var2 ^ 1703869597;
            };
            long var28 = var15 + 1L;
            var28 = var15 * var28;
            long var16 = var28 & 1L;
            long var30;
            var2 = (var30 = var16 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                ModeSetting var19 = this.G;
                var19.UY(var1);
                return;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    private static swinganimations s(int var0) {
        int var2 = (ClientRuntime.y()) ? 1 : 0;
        int var1 = var0 << 29;
        var1 *= -839813185;
        var1 >>= 10;
        var1 &= 424535774;
        var1 ^= 431442042;
        int var3 = var1 + 1;
        var3 = var1 * var3;
        int var4 = var1 + 2;
        var3 *= var4;
        var4 = var1 + 3;
        var3 *= var4;
        var3 &= 7;
        if (var3 == 0) {
            if (var2 == 0) {
                var1 &= -818009384;
                var1 |= -358347666;
                var1 -= -1743075278;
                var1 ^= -685107869;
                var2 = var1 + 1;
                var2 = var1 * var2;
                var2 &= 1;
                if (var2 == 0) {
                    return null;
                }
            } else {
                var1 = switch (var1) {
                    case -2128505617 -> var1 ^ 826447182;
                    case 16730234 -> {
                        var1 -= -1174599848;
                        yield var1 ^ -555714760;
                    }
                    default -> var1 ^ 1553818786;
                };
                Integer var39 = var1;
                if (var39 != null) {
                    ClientRuntime var40 = ClientRuntime.Z();
                    var1 *= -832207425;
                    var1 |= -1032486567;
                    var1 ^= 1959047138;
                    var1 += -800185426;
                    var1 ^= 918581900;
                    long var49 = var1;
                    long var5 = var49 + 1L;
                    var5 = var49 * var5;
                    long var50 = var5 & 1L;
                    long var69;
                    var3 = (var69 = var50 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                    label51:
                    if (var3 == 0) {
                        ModuleManager var41 = var40.sP();
                        Module var42 = var41.tG(swinganimations.class);
                        swinganimations var43 = (swinganimations)var42;
                        int var52 = (var43.IU()) ? 1 : 0;
                        swinganimations var44;
                        if (var52 != 0) {
                            var1 ^= -931142724;
                            var1 &= -1265828858;
                            var1 ^= -1823512812;
                            long var53 = var1;
                            var5 = var53 + 1L;
                            var5 = var53 * var5;
                            long var7 = var53 + 2L;
                            var5 *= var7;
                            long var54 = var53 + 3L;
                            var5 *= var54;
                            long var55 = var5 & 7L;
                            long var70;
                            var52 = (var70 = var55 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                            if (var52 != 0) {
                                break label51;
                            }

                            var44 = var43;
                            switch (var1) {
                                case -617599561:
                                    var1 ^= -876453386;
                                    break;
                                case 331571990:
                                    var1 += -499928563;
                                    var1 ^= -1139888181;
                                    break;
                                case 651189728:
                                default:
                                    var1 ^= -1140767527;
                            }
                        } else {
                            var1 &= -204525878;
                            var1 &= 1270126430;
                            var1 ^= -181763512;
                            Integer var57 = var1;
                            if (var57 == null) {
                                break label51;
                            }

                            var44 = null;
                            var1 &= -1784319929;
                            var1 ^= -581322006;
                        }

                        var52 = var1 + 1;
                        var52 = var1 * var52;
                        var4 = var1 + 2;
                        var52 *= var4;
                        var1 += 3;
                        var52 *= var1;
                        var1 = var52 & 7;
                        if (var1 == 0) {
                            return var44;
                        }
                    }
                }
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    public static int K(int var0) {
        int var1 = FN;
        var1 ^= 1195914671;
        int var4 = var1 ^ -1558123031;
        var4 &= 1405586496;
        var4 &= -497204092;
        var4 += 743103106;
        var4 ^= 1673491275;
        swinganimations var47 = s(var4);
        long var5 = var0;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var65;
        int var55 = (var65 = var5 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
        if (var55 == 0) {
            var1 &= 972477342;
            var1 *= -171974307;
            var1 ^= 563446734;
            var1 *= 660031325;
            var1 ^= -1477658453;
            if (var47 == null) {
                var1 ^= 2015204562;
                var1 -= 115890171;
                var1 ^= -1656773768;
                return var0;
            }

            var1 ^= 2127667526;
            var1 &= 1252334044;
            var1 ^= 1916519174;
            var1 >>= 25;
            var1 ^= -201667832;
            var5 = var0;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var66;
            int var2 = (var66 = var5 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
            if (var2 != 0) {
                IllegalArgumentException var41 = new IllegalArgumentException();
                throw var41;
            }

            float var38 = var0;
            NumberSetting var48 = var47.D;
            float var49 = var48.WM();
            float var39 = var38 / var49;
            var4 = var0 + 1;
            var4 = var0 * var4;
            int var59 = var0 + 2;
            var4 *= var59;
            int var3 = var0 + 3;
            var4 *= var3;
            var3 = var4 & 7;
            if (var3 == 0) {
                var1 &= 504273396;
                var1 ^= 735968839;
                var2 = Math.round(var39);
                return Math.max(1, var2);
            }

            var1 &= -297105560;
            var1 += 1732715093;
            var1 ^= 1348709319;
            var1 -= 1814159706;
            var1 ^= 159490896;
        } else {
            var1 ^= 2056727424;
            var1 += 820357721;
            var1 |= 835242117;
            var1 >>= 9;
            var1 ^= -1538622979;
        }

        UnsupportedOperationException var37 = new UnsupportedOperationException();
        throw var37;
    }

    public static void GY(MatrixStack var0, Arm var1) {
        label94: {
            int var2 = FN;
            var2 ^= 1715379224;
            int var3 = System.identityHashCode(var0);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 == 0) {
                var2 *= -444373823;
                var2 ^= 1206877876;
                long var75 = var2;
                long var6 = var75 + 1L;
                var6 = var75 * var6;
                long var8 = var75 + 2L;
                var6 *= var8;
                long var76 = var75 + 3L;
                var6 *= var76;
                long var77 = var6 & 7L;
                long var119;
                var4 = (var119 = var77 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label94;
                }

                var4 = var2 & 1022417442;
                var4 >>= 14;
                var4 |= -768369341;
                var4 ^= 1120514118;
                var4 ^= -1647583028;
                swinganimations var84 = s(var4);
                if (var84 == null) {
                    var2 = switch (var2) {
                        default -> var2 ^ -516282713;
                        case 1476663297 -> {
                            var2 += 843019016;
                            var2 |= -1956003797;
                            var2 &= 987606947;
                            yield var2 ^ -517879299;
                        }
                        case 1778252631 -> var2 ^ 1885596041;
                    };
                    var5 = var2 + 1;
                    var5 = var2 * var5;
                    var5 &= 1;
                    if (var5 == 0) {
                        return;
                    }
                    break label94;
                }

                var2 |= 1696081890;
                var2 &= 304079936;
                var2 ^= 1498838362;
                var2 ^= -1172800790;
                var5 = var2 + 1;
                var5 = var2 * var5;
                var5 &= 1;
                if (var5 != 0) {
                    break label94;
                }

                Arm var93 = Arm.RIGHT;
                Integer var106 = var3;
                if (var106 == null) {
                    var2 &= 2105088271;
                    var2 &= 641925816;
                    var2 ^= 1208973895;
                } else {
                    var2 = switch (var2) {
                        case -1965936547 -> var2 ^ 770273084;
                        case -212718608 -> {
                            var2 ^= -1974023798;
                            var2 += -2103105274;
                            var2 >>= 21;
                            var2 *= -434955609;
                            yield var2 ^ 1058742834;
                        }
                        default -> var2 ^ -1626070223;
                    };
                    int var107 = var2 + 1;
                    int var108 = var2 * var107;
                    int var109 = var108 & 1;
                    if (var109 != 0) {
                        break label94;
                    }

                    float var98;
                    if (var1 == var93) {
                        var2 >>= 16;
                        var2 *= 178563457;
                        var2 ^= 2072820820;
                        long var94 = var2;
                        long var7 = var94 + 1L;
                        var7 = var94 * var7;
                        long var9 = var94 + 2L;
                        var7 *= var9;
                        long var95 = var94 + 3L;
                        var7 *= var95;
                        long var96 = var7 & 7L;
                        long var120;
                        var5 = (var120 = var96 - 0L) == 0L ? 0 : (var120 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label94;
                        }

                        var98 = 1.0F;
                        var2 |= -1517216284;
                        var2 ^= 860805176;
                        var2 &= 1358286396;
                        var2 ^= -1601157593;
                    } else {
                        var2 |= -1984644895;
                        var2 ^= -1688169177;
                        Integer var110 = var2;
                        if (var110 == null) {
                            break label94;
                        }

                        var98 = -1.0F;
                        var2 *= -1571857529;
                        var2 >>>= 28;
                        var2 &= -357592663;
                        var2 ^= -617200019;
                        var2 ^= 724780126;
                    }

                    Integer var111 = var2;
                    if (var111 == null) {
                        break label94;
                    }

                    NumberSetting var112 = var84.RE;
                    float var113 = var112.WM();
                    float var99 = var113 * var98;
                    NumberSetting var114 = var84.F;
                    float var115 = var114.WM();
                    Integer var63 = var3;
                    if (var63 != null) {
                        var2 >>= 11;
                        var2 += 844962232;
                        var2 |= -1647665775;
                        var2 ^= 638857152;
                        int var64 = var2 + 1;
                        var64 = var2 * var64;
                        var64 &= 1;
                        if (var64 != 0) {
                            break label94;
                        }

                        NumberSetting var67 = var84.k;
                        float var68 = var67.WM();
                        var0.translate(var99, var115, var68);
                        NumberSetting var69 = var84.r;
                        float var70 = var69.WM();
                        float var121;
                        var4 = (var121 = var70 - 1.0F) == 0.0F ? 0 : (var121 < 0.0F ? -1 : 1);
                        if (var4 != 0) {
                            var2 -= 1648970958;
                            var2 ^= 250777205;
                            var2 |= -817014649;
                            var2 ^= -673965994;
                            var4 = var2 + 1;
                            var4 = var2 * var4;
                            var4 &= 1;
                            if (var4 != 0) {
                                break label94;
                            }

                            var0.scale(var70, var70, var70);
                            var2 |= -1339888540;
                            var2 |= -1896839325;
                            var2 ^= -1474925706;
                        } else {
                            var2 |= 2018782676;
                            var2 *= 455509883;
                            var2 &= -1112015852;
                            var2 ^= -1614266211;
                        }

                        return;
                    }

                    var2 ^= 1576746864;
                    var2 ^= -978237692;
                }
            } else {
                var2 *= -1637898117;
                var2 ^= 1111597552;
            }

            Integer var60 = var2;
            if (var60 != null) {
                IllegalStateException var62 = new IllegalStateException();
                throw var62;
            }
        }

        UnsupportedOperationException var61 = new UnsupportedOperationException();
        throw var61;
    }

    public static boolean ey(MatrixStack var0, Arm var1, float var2) {
        label469: {
            int var100;
            label423: {
                label445: {
                    var100 = FN;
                    var100 ^= -632817707;
                    int var4 = System.identityHashCode(var0);
                    long var5 = var4;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var712;
                    int var286 = (var712 = var5 - 0L) == 0L ? 0 : (var712 < 0L ? -1 : 1);
                    if (var286 == 0) {
                        var100 = switch (var100) {
                            default -> var100 ^ 2039300164;
                            case -1589222805 -> var100 ^ 1658729440;
                            case -514780872 -> {
                                var100 &= 608033260;
                                var100 ^= 1211098838;
                                var100 *= -559460401;
                                yield var100 ^ 1621321930;
                            }
                        };
                        int var287 = var100 >>> 17;
                        int var288 = var287 + 863586209;
                        int var289 = var288 - -1228310930;
                        int var290 = var289 ^ 1904316090;
                        swinganimations var291 = s(var290);
                        if (var291 == null) {
                            switch (var100) {
                                case -1937795594:
                                    var100 ^= 983429868;
                                    break label445;
                                case -1535082328:
                                    var100 &= -1996807156;
                                    var100 -= -1603955903;
                                    var100 >>>= 10;
                                    var100 ^= -1435455815;
                                    break label445;
                                case 1940802560:
                                default:
                                    var100 ^= 1664558488;
                                    break label445;
                            }
                        }

                        var100 <<= 24;
                        var100 |= -1962455990;
                        var100 ^= -809035481;
                        var100 ^= -662390020;
                        int var6 = var100 + 1;
                        var6 = var100 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            break label469;
                        }

                        ModeSetting var349 = var291.G;
                        D var365 = dev.aurap.hub.D.VANILLA;
                        int var350 = (var349.TJ(var365)) ? 1 : 0;
                        var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var713;
                        int var369 = (var713 = var7 - 0L) == 0L ? 0 : (var713 < 0L ? -1 : 1);
                        if (var369 != 0) {
                            var100 ^= -173158731;
                            var100 *= 1015262881;
                            var100 ^= -1076614925;
                        } else {
                            var100 = switch (var100) {
                                case -1136332911 -> {
                                    var100 |= 1996531723;
                                    yield var100 ^ -1487239848;
                                }
                                default -> var100 ^ 1311333909;
                                case 2141611706 -> var100 ^ -1616349085;
                            };
                            int var370 = var100 + 1;
                            int var371 = var100 * var370;
                            int var8 = var100 + 2;
                            int var372 = var371 * var8;
                            var8 = var100 + 3;
                            int var373 = var372 * var8;
                            int var374 = var373 & 7;
                            if (var374 != 0) {
                                break label469;
                            }

                            if (var350 != 0) {
                                switch (var100) {
                                    case -1859338708:
                                    default:
                                        var100 ^= 963053412;
                                        break label445;
                                    case 704784624:
                                        var100 ^= 445503645;
                                        break label445;
                                    case 1478388419:
                                        var100 &= 2094692352;
                                        var100 |= 1033261585;
                                        var100 += -2008604757;
                                        var100 ^= -1347604066;
                                        break label445;
                                }
                            }

                            var100 >>= 2;
                            var100 ^= -976817994;
                            float var351 = TP.S(var2);
                            long var352 = var4;
                            long var389 = var352 + 1L;
                            long var390 = var352 * var389;
                            long var10 = var352 + 2L;
                            long var391 = var390 * var10;
                            long var353 = var352 + 3L;
                            long var392 = var391 * var353;
                            long var354 = var392 & 7L;
                            long var714;
                            var350 = (var714 = var354 - 0L) == 0L ? 0 : (var714 < 0L ? -1 : 1);
                            if (var350 != 0) {
                                var100 >>= 19;
                                var100 ^= 364617007;
                            } else {
                                var100 = switch (var100) {
                                    case -1260603555 -> var100 ^ 795058054;
                                    case -742299130 -> {
                                        var100 *= -1453050523;
                                        var100 += -1542820961;
                                        var100 += 1271706784;
                                        yield var100 ^ -2014356805;
                                    }
                                    default -> var100 ^ 871267776;
                                };
                                Integer var356 = var100;
                                if (var356 == null) {
                                    break label469;
                                }

                                Arm var357 = Arm.RIGHT;
                                float var361;
                                if (var1 == var357) {
                                    var100 &= -1744042252;
                                    var100 *= -1474212015;
                                    var100 &= -1853628215;
                                    var100 ^= 610115217;
                                    var100 ^= 2012997798;
                                    int var358 = var100 + 1;
                                    var358 = var100 * var358;
                                    var358 &= 1;
                                    if (var358 != 0) {
                                        break label469;
                                    }

                                    var361 = 1.0F;
                                    var100 <<= 6;
                                    var100 ^= -846687061;
                                    var100 *= 366847245;
                                    var100 ^= -2125848705;
                                } else {
                                    var100 = switch (var100) {
                                        case 446532872 -> var100 ^ -330313499;
                                        default -> var100 ^ -1745523067;
                                        case 1637771302 -> {
                                            var100 >>= 5;
                                            var100 -= -705262143;
                                            var100 ^= 638654180;
                                            var100 &= -185602638;
                                            yield var100 ^ -1068377752;
                                        }
                                    };
                                    var7 = var100;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var715;
                                    int var378 = (var715 = var7 - 0L) == 0L ? 0 : (var715 < 0L ? -1 : 1);
                                    if (var378 != 0) {
                                        break label469;
                                    }

                                    var361 = -1.0F;
                                    switch (var100) {
                                        case -2131693900:
                                        default:
                                            var100 ^= -997081914;
                                            break;
                                        case -1068058552:
                                            var100 >>= 18;
                                            var100 &= -1897524690;
                                            var100 ^= 822509076;
                                            break;
                                        case -272813324:
                                            var100 ^= -796085163;
                                    }
                                }

                                Integer var379 = var100;
                                if (var379 == null) {
                                    break label469;
                                }

                                NumberSetting var380 = var291.EC;
                                float var381 = var380.WM();
                                float var393 = var351 * (float) Math.PI;
                                double var394 = var393;
                                Integer var452 = var4;
                                if (var452 == null) {
                                    var100 &= -1480985096;
                                    var100 ^= 1306788679;
                                } else {
                                    label443: {
                                        var100 += -1777314862;
                                        var100 -= -1325917114;
                                        var100 ^= -2015323289;
                                        var10 = var100;
                                        long var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        var10 = var12 & 1L;
                                        long var716;
                                        int var455 = (var716 = var10 - 0L) == 0L ? 0 : (var716 < 0L ? -1 : 1);
                                        if (var455 != 0) {
                                            break label469;
                                        }

                                        double var395 = Math.sin(var394);
                                        float var396 = (float)var395;
                                        float var397 = var396 * var381;
                                        double var419 = var351;
                                        double var420 = Math.sqrt(var419);
                                        double var421 = var420 * (float) Math.PI;
                                        double var422 = Math.sin(var421);
                                        float var423 = (float)var422;
                                        float var424 = var423 * var381;
                                        float var717;
                                        int var456 = (var717 = var351 - 0.3F) == 0.0F ? 0 : (var717 < 0.0F ? -1 : 1);
                                        float var459;
                                        if (var456 < 0) {
                                            var100 -= -1058597045;
                                            var100 ^= -404570132;
                                            Lv var457 = sT_2.aO;
                                            float var502 = var351 / 0.3F;
                                            int var603 = var4 + 1;
                                            int var604 = var4 * var603;
                                            int var13 = var4 + 2;
                                            int var605 = var604 * var13;
                                            var13 = var4 + 3;
                                            int var606 = var605 * var13;
                                            int var607 = var606 & 7;
                                            if (var607 != 0) {
                                                var100 ^= -840965977;
                                                var100 += 509604021;
                                                var100 += -2051628660;
                                                var100 *= -1695652193;
                                                var100 ^= -1069447917;
                                                break label443;
                                            }

                                            var100 -= -42193656;
                                            var100 &= 1940217634;
                                            var100 += -657361892;
                                            var100 ^= -1749454451;
                                            int var608 = var100 + 1;
                                            int var609 = var100 * var608;
                                            var13 = var100 + 2;
                                            int var610 = var609 * var13;
                                            var13 = var100 + 3;
                                            int var611 = var610 * var13;
                                            int var612 = var611 & 7;
                                            if (var612 != 0) {
                                                break label469;
                                            }

                                            float var458 = var457.l(var502);
                                            var459 = var458;
                                            var100 ^= 1231449185;
                                            var100 += -865736885;
                                            var100 ^= 1289618602;
                                            var100 >>= 6;
                                            var100 ^= 1661557158;
                                        } else {
                                            var100 -= -1835860681;
                                            var100 >>= 17;
                                            var100 += 1072976764;
                                            var100 ^= -619414828;
                                            Lv var503 = sT_2.Jj;
                                            float var613 = var351 - 0.3F;
                                            float var614 = var613 / 0.7F;
                                            float var504 = var503.l(var614);
                                            var12 = var4;
                                            long var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            long var16 = var12 + 2L;
                                            var14 *= var16;
                                            var12 += 3L;
                                            var14 *= var12;
                                            var12 = var14 & 7L;
                                            long var718;
                                            int var618 = (var718 = var12 - 0L) == 0L ? 0 : (var718 < 0L ? -1 : 1);
                                            if (var618 != 0) {
                                                var100 |= 351392088;
                                                var100 ^= 515216941;
                                                break label443;
                                            }
                                            var100 = switch (var100) {
                                                default -> var100 ^ 189590738;
                                                case -455057046 -> {
                                                    var100 -= 660967334;
                                                    yield var100 ^ 1423365253;
                                                }
                                                case 1353128532 -> var100 ^ -669127416;
                                            };
                                            float var505 = 1.0F - var504;
                                            var459 = var505;
                                            var100 ^= -1167525692;
                                            var100 += -1398459817;
                                            var100 ^= -1659260864;
                                        }

                                        var11 = var100;
                                        long var672 = var11 + 1L;
                                        var672 = var11 * var672;
                                        var11 = var672 & 1L;
                                        long var719;
                                        int var508 = (var719 = var11 - 0L) == 0L ? 0 : (var719 < 0L ? -1 : 1);
                                        if (var508 != 0) {
                                            break label469;
                                        }

                                        float var460 = var459 * var381;
                                        Integer var509 = var4;
                                        if (var509 != null) {
                                            var100 *= -2130774703;
                                            var100 >>= 14;
                                            var100 &= -928285541;
                                            var100 ^= 937167325;
                                            int var510 = var100 + 1;
                                            int var511 = var100 * var510;
                                            int var512 = var511 & 1;
                                            if (var512 != 0) {
                                                break label469;
                                            }

                                            ModeSetting var292 = var291.G;
                                            Enum var293 = var292.A();
                                            D var294 = (D)var293;
                                            int var295 = var294.ordinal();
                                            label395:
                                            switch (var295) {
                                                case 1:
                                                    var100 &= -1061324004;
                                                    var100 &= -2020128624;
                                                    var100 += 909107846;
                                                    var100 ^= -1908711462;
                                                    Integer var406 = var100;
                                                    if (var406 == null) {
                                                        break label469;
                                                    }

                                                    float var730;
                                                    int var407 = (var730 = var351 - 0.32F) == 0.0F ? 0 : (var730 < 0.0F ? -1 : 1);
                                                    int var428 = var4 + 1;
                                                    int var429 = var4 * var428;
                                                    int var481 = var4 + 2;
                                                    int var430 = var429 * var481;
                                                    int var482 = var4 + 3;
                                                    int var431 = var430 * var482;
                                                    int var432 = var431 & 7;
                                                    if (var432 != 0) {
                                                        var100 += 401566578;
                                                        var100 -= 730201318;
                                                        var100 ^= -828142401;
                                                    } else {
                                                        var100 |= 1522962410;
                                                        var100 *= 1083843613;
                                                        var100 += 1358362698;
                                                        var100 ^= 755973505;
                                                        var9 = var100;
                                                        var11 = var9 + 1L;
                                                        var11 = var9 * var11;
                                                        var9 = var11 & 1L;
                                                        long var731;
                                                        int var435 = (var731 = var9 - 0L) == 0L ? 0 : (var731 < 0L ? -1 : 1);
                                                        if (var435 != 0) {
                                                            break label469;
                                                        }

                                                        float var410;
                                                        if (var407 < 0) {
                                                            var100 *= 13490195;
                                                            var100 *= 275178829;
                                                            var100 ^= -1224576853;
                                                            Lv var408 = sT_2.aO;
                                                            float var436 = var351 / 0.32F;
                                                            int var483 = var4 + 1;
                                                            int var484 = var4 * var483;
                                                            int var597 = var4 + 2;
                                                            int var485 = var484 * var597;
                                                            int var598 = var4 + 3;
                                                            int var486 = var485 * var598;
                                                            int var487 = var486 & 7;
                                                            if (var487 != 0) {
                                                                var100 &= 865714532;
                                                                var100 ^= -112335021;
                                                                break;
                                                            }

                                                            var100 *= 1937684635;
                                                            var100 <<= 20;
                                                            var100 -= -306928433;
                                                            var100 ^= 1816487407;
                                                            Integer var488 = var100;
                                                            if (var488 == null) {
                                                                break label469;
                                                            }

                                                            float var409 = var408.l(var436);
                                                            var410 = var409;
                                                            var100 -= -817692260;
                                                            var100 ^= -106300443;
                                                        } else {
                                                            var100 *= 1689907783;
                                                            var100 -= 1755623130;
                                                            var100 ^= 938003111;
                                                            int var437 = var100 + 1;
                                                            int var438 = var100 * var437;
                                                            int var489 = var100 + 2;
                                                            int var439 = var438 * var489;
                                                            int var490 = var100 + 3;
                                                            int var440 = var439 * var490;
                                                            int var441 = var440 & 7;
                                                            if (var441 != 0) {
                                                                break label469;
                                                            }

                                                            Lv var442 = sT_2.Jj;
                                                            var10 = var4;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            long var709 = var10 + 2L;
                                                            var12 *= var709;
                                                            var10 += 3L;
                                                            var12 *= var10;
                                                            var10 = var12 & 7L;
                                                            long var732;
                                                            int var494 = (var732 = var10 - 0L) == 0L ? 0 : (var732 < 0L ? -1 : 1);
                                                            if (var494 != 0) {
                                                                var100 |= -297422183;
                                                                var100 >>= 3;
                                                                var100 += -1714841434;
                                                                var100 *= -1189144097;
                                                                var100 ^= -1379762292;
                                                                break;
                                                            }

                                                            var100 ^= -1414949617;
                                                            var100 &= 1186679089;
                                                            var100 ^= 801976039;
                                                            var10 = var100;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            var709 = var10 + 2L;
                                                            var12 *= var709;
                                                            var10 += 3L;
                                                            var12 *= var10;
                                                            var10 = var12 & 7L;
                                                            long var733;
                                                            int var498 = (var733 = var10 - 0L) == 0L ? 0 : (var733 < 0L ? -1 : 1);
                                                            if (var498 != 0) {
                                                                break label469;
                                                            }

                                                            float var499 = var351 - 0.32F;
                                                            float var500 = var499 / 0.68F;
                                                            float var443 = var442.l(var500);
                                                            float var444 = 1.0F - var443;
                                                            var410 = var444;
                                                            var100 &= 2147387801;
                                                            var100 >>>= 7;
                                                            var100 &= -2097504633;
                                                            var100 ^= -2106564956;
                                                        }

                                                        var9 = var100;
                                                        var11 = var9 + 1L;
                                                        var11 = var9 * var11;
                                                        var9 = var11 & 1L;
                                                        long var734;
                                                        int var447 = (var734 = var9 - 0L) == 0L ? 0 : (var734 < 0L ? -1 : 1);
                                                        if (var447 != 0) {
                                                            break label469;
                                                        }

                                                        float var344 = TP.S(var410);
                                                        float var345 = var344 * var381;
                                                        var7 = var4;
                                                        var9 = var7 + 1L;
                                                        var9 = var7 * var9;
                                                        var11 = var7 + 2L;
                                                        var9 *= var11;
                                                        var7 += 3L;
                                                        var9 *= var7;
                                                        var7 = var9 & 7L;
                                                        long var735;
                                                        var4 = (var735 = var7 - 0L) == 0L ? 0 : (var735 < 0L ? -1 : 1);
                                                        if (var4 == 0) {
                                                            var100 += 1241179568;
                                                            var100 >>= 12;
                                                            var100 += 597879472;
                                                            var100 |= 1927897028;
                                                            var100 ^= -1046780505;
                                                            float var274 = var361 * -0.08F;
                                                            float var275 = var274 * var345;
                                                            float var385 = 0.035F * var345;
                                                            float var411 = -0.1F * var345;
                                                            var0.translate(var275, var385, var411);
                                                            RotationAxis var276 = RotationAxis.POSITIVE_Y;
                                                            float var386 = var361 * var345;
                                                            float var387 = var386 * 12.0F;
                                                            i_2.xo(var0, var276, var387);
                                                            RotationAxis var277 = RotationAxis.POSITIVE_Z;
                                                            float var362 = var361 * var345;
                                                            float var363 = var362 * -16.0F;
                                                            i_2.xo(var0, var277, var363);
                                                            RotationAxis var278 = RotationAxis.POSITIVE_X;
                                                            float var346 = var345 * -38.0F;
                                                            i_2.xo(var0, var278, var346);
                                                            var100 &= -15839291;
                                                            var100 += 1099973182;
                                                            var100 ^= -1512952369;
                                                            break label423;
                                                        }

                                                        var100 += 193777242;
                                                        var100 *= -127185847;
                                                        var100 ^= 754757150;
                                                    }
                                                    break;
                                                case 2:
                                                    var100 += 1831935578;
                                                    var100 ^= 1165266263;
                                                    var100 ^= -221758416;
                                                    var100 ^= 119464308;
                                                    Integer var399 = var100;
                                                    if (var399 == null) {
                                                        break label469;
                                                    }

                                                    Lv var400 = sT_2.qQ;
                                                    float var425 = var424 / var381;
                                                    float var401 = var400.l(var425);
                                                    float var402 = var401 * var381;
                                                    float var403 = var361 * -0.05F;
                                                    float var404 = var403 * var402;
                                                    float var426 = 0.02F * var402;
                                                    float var480 = -0.32F * var402;
                                                    var11 = var4;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    var11 = var672 & 1L;
                                                    long var720;
                                                    int var591 = (var720 = var11 - 0L) == 0L ? 0 : (var720 < 0L ? -1 : 1);
                                                    if (var591 == 0) {
                                                        var100 &= -1139355526;
                                                        var100 *= 685004993;
                                                        var100 <<= 31;
                                                        var100 ^= 65776699;
                                                        int var592 = var100 + 1;
                                                        int var593 = var100 * var592;
                                                        int var594 = var593 & 1;
                                                        if (var594 != 0) {
                                                            break label469;
                                                        }

                                                        var0.translate(var404, var426, var480);
                                                        RotationAxis var405 = RotationAxis.POSITIVE_X;
                                                        float var427 = var402 * -18.0F;
                                                        i_2.xo(var0, var405, var427);
                                                        var100 *= 200702961;
                                                        var100 |= 1327728424;
                                                        var100 |= -1217598135;
                                                        var100 ^= -1456890277;
                                                        break label423;
                                                    }

                                                    switch (var100) {
                                                        case -603316165:
                                                            var100 -= 1378159678;
                                                            var100 &= 1312542891;
                                                            var100 ^= -496666626;
                                                            break label395;
                                                        case -112061067:
                                                            var100 ^= -566732300;
                                                            break label395;
                                                        case 1038448772:
                                                        default:
                                                            var100 ^= -1487356973;
                                                            break label395;
                                                    }
                                                case 3:
                                                    var100 += 539421567;
                                                    var100 &= -933749664;
                                                    var100 *= 71184257;
                                                    var100 ^= -967925404;
                                                    Integer var474 = var100;
                                                    if (var474 == null) {
                                                        break label469;
                                                    }

                                                    float var475 = var361 * -0.3F;
                                                    float var476 = var475 * var424;
                                                    var11 = var4;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    var11 = var672 & 1L;
                                                    long var729;
                                                    int var583 = (var729 = var11 - 0L) == 0L ? 0 : (var729 < 0L ? -1 : 1);
                                                    if (var583 == 0) {
                                                        var100 += -1009441590;
                                                        var100 -= -102062249;
                                                        var100 ^= 1976178212;
                                                        float var584 = 0.18F * var424;
                                                        float var660 = -0.1F * var397;
                                                        var0.translate(var476, var584, var660);
                                                        RotationAxis var477 = RotationAxis.POSITIVE_Y;
                                                        float var585 = var361 * 20.0F;
                                                        float var586 = var585 * var424;
                                                        i_2.xo(var0, var477, var586);
                                                        RotationAxis var478 = RotationAxis.POSITIVE_Z;
                                                        float var587 = var361 * -30.0F;
                                                        float var588 = var587 * var424;
                                                        i_2.xo(var0, var478, var588);
                                                        RotationAxis var479 = RotationAxis.POSITIVE_X;
                                                        float var398 = -60.0F * var397;
                                                        i_2.xo(var0, var479, var398);
                                                        switch (var100) {
                                                            case -2029011918:
                                                            default:
                                                                var100 ^= 538003453;
                                                                break label423;
                                                            case 491769011:
                                                                var100 -= 1498349999;
                                                                var100 >>= 31;
                                                                var100 ^= -1447453105;
                                                                break label423;
                                                            case 712652996:
                                                                var100 ^= 852115632;
                                                                break label423;
                                                        }
                                                    }

                                                    var100 += -82472686;
                                                    var100 *= 494583613;
                                                    var100 <<= 11;
                                                    var100 >>>= 26;
                                                    var100 ^= -364615831;
                                                    break;
                                                case 4:
                                                    var100 |= 326134720;
                                                    var100 ^= 576785526;
                                                    Lv var469 = sT_2.q;
                                                    float var578 = var397 / var381;
                                                    float var470 = var469.l(var578);
                                                    float var471 = var470 * var381;
                                                    float var472 = 0.12F * var471;
                                                    float var579 = -0.05F * var471;
                                                    int var650 = var4 + 1;
                                                    int var651 = var4 * var650;
                                                    int var694 = var4 + 2;
                                                    int var652 = var651 * var694;
                                                    int var695 = var4 + 3;
                                                    int var653 = var652 * var695;
                                                    int var654 = var653 & 7;
                                                    if (var654 == 0) {
                                                        var100 <<= 21;
                                                        var100 &= 538832057;
                                                        var100 ^= -1558149985;
                                                        var100 ^= -1654884992;
                                                        int var655 = var100 + 1;
                                                        int var656 = var100 * var655;
                                                        int var696 = var100 + 2;
                                                        int var657 = var656 * var696;
                                                        int var697 = var100 + 3;
                                                        int var658 = var657 * var697;
                                                        int var659 = var658 & 7;
                                                        if (var659 != 0) {
                                                            break label469;
                                                        }

                                                        var0.translate(0.0F, var472, var579);
                                                        RotationAxis var473 = RotationAxis.POSITIVE_X;
                                                        float var580 = -95.0F * var471;
                                                        i_2.xo(var0, var473, var580);
                                                        var100 ^= -298802315;
                                                        var100 -= -912044422;
                                                        var100 += 938470799;
                                                        var100 |= -2109910250;
                                                        var100 ^= -1996778801;
                                                        break label423;
                                                    }

                                                    var100 += 1403041022;
                                                    var100 ^= -621589535;
                                                    break;
                                                case 5:
                                                    var100 ^= 683858180;
                                                    var100 |= 1006317731;
                                                    var100 *= -1716512507;
                                                    var100 &= 392106096;
                                                    var100 ^= 738153714;
                                                    Lv var337 = sT_2.d;
                                                    float var338 = var337.l(var351);
                                                    float var339 = (float) Math.PI * var338;
                                                    double var462 = var339;
                                                    double var463 = Math.sin(var462);
                                                    float var340 = (float)var463;
                                                    float var341 = var340 * var381;
                                                    float var464 = var361 * -0.16F;
                                                    float var465 = var464 * var341;
                                                    float var572 = 0.08F * var341;
                                                    int var641 = var4 + 1;
                                                    int var642 = var4 * var641;
                                                    int var692 = var4 + 2;
                                                    int var643 = var642 * var692;
                                                    int var693 = var4 + 3;
                                                    int var644 = var643 * var693;
                                                    int var645 = var644 & 7;
                                                    if (var645 == 0) {
                                                        var100 += 665028775;
                                                        var100 -= -1733047227;
                                                        var100 ^= 1708471708;
                                                        var12 = var100;
                                                        long var707 = var12 + 1L;
                                                        var707 = var12 * var707;
                                                        var12 = var707 & 1L;
                                                        long var721;
                                                        int var648 = (var721 = var12 - 0L) == 0L ? 0 : (var721 < 0L ? -1 : 1);
                                                        if (var648 != 0) {
                                                            break label469;
                                                        }

                                                        float var649 = -0.12F * var341;
                                                        var0.translate(var465, var572, var649);
                                                        RotationAxis var466 = RotationAxis.POSITIVE_Y;
                                                        float var573 = var361 * 28.0F;
                                                        float var574 = var573 * var341;
                                                        i_2.xo(var0, var466, var574);
                                                        RotationAxis var467 = RotationAxis.POSITIVE_Z;
                                                        float var575 = var361 * -36.0F;
                                                        float var576 = var575 * var341;
                                                        i_2.xo(var0, var467, var576);
                                                        RotationAxis var468 = RotationAxis.POSITIVE_X;
                                                        float var577 = -42.0F * var341;
                                                        i_2.xo(var0, var468, var577);
                                                        var100 ^= 1331230988;
                                                        var100 ^= -1055277980;
                                                        break label423;
                                                    }

                                                    switch (var100) {
                                                        case 786584802:
                                                            var100 |= 101618283;
                                                            var100 *= 122747789;
                                                            var100 &= -911966950;
                                                            var100 <<= 2;
                                                            var100 ^= -925546625;
                                                            break label395;
                                                        case 1264290826:
                                                        default:
                                                            var100 ^= -2030571060;
                                                            break label395;
                                                        case 2055922779:
                                                            var100 ^= 1637525528;
                                                            break label395;
                                                    }
                                                case 6:
                                                    var100 = switch (var100) {
                                                        default -> var100 ^ 289079186;
                                                        case -8957490 -> {
                                                            var100 |= 1287351606;
                                                            var100 ^= -1984337155;
                                                            var100 &= -554012848;
                                                            yield var100 ^ -91798911;
                                                        }
                                                        case 551278245 -> var100 ^ -6979297;
                                                    };
                                                    int var329 = var100 + 1;
                                                    int var330 = var100 * var329;
                                                    int var331 = var330 & 1;
                                                    if (var331 != 0) {
                                                        break label469;
                                                    }

                                                    float var332 = var361 * -0.42F;
                                                    int var561 = var4 + 1;
                                                    int var562 = var4 * var561;
                                                    int var563 = var562 & 1;
                                                    if (var563 == 0) {
                                                        var100 <<= 7;
                                                        var100 -= -1079384683;
                                                        var100 &= -989021523;
                                                        var100 |= 1848105121;
                                                        var100 ^= -1325993097;
                                                        var11 = var100;
                                                        var672 = var11 + 1L;
                                                        var672 = var11 * var672;
                                                        var11 = var672 & 1L;
                                                        long var728;
                                                        int var566 = (var728 = var11 - 0L) == 0L ? 0 : (var728 < 0L ? -1 : 1);
                                                        if (var566 != 0) {
                                                            break label469;
                                                        }

                                                        float var333 = var332 * var460;
                                                        float var567 = 0.04F * var397;
                                                        float var640 = -0.08F * var460;
                                                        var0.translate(var333, var567, var640);
                                                        RotationAxis var334 = RotationAxis.POSITIVE_Y;
                                                        float var568 = var361 * 78.0F;
                                                        float var569 = var568 * var460;
                                                        i_2.xo(var0, var334, var569);
                                                        RotationAxis var335 = RotationAxis.POSITIVE_Z;
                                                        float var570 = var361 * -62.0F;
                                                        float var571 = var570 * var460;
                                                        i_2.xo(var0, var335, var571);
                                                        RotationAxis var336 = RotationAxis.POSITIVE_X;
                                                        float var461 = -26.0F * var460;
                                                        i_2.xo(var0, var336, var461);
                                                        var100 ^= -870754426;
                                                        var100 >>= 16;
                                                        var100 |= -1503897919;
                                                        var100 &= 971785783;
                                                        var100 ^= 1873422257;
                                                        break label423;
                                                    }

                                                    var100 &= -1319456925;
                                                    var100 |= -1809583000;
                                                    var100 ^= 1579651646;
                                                    break;
                                                case 7:
                                                    var100 = switch (var100) {
                                                        case -1709807374 -> var100 ^ -1949799556;
                                                        default -> var100 ^ -917355271;
                                                        case -8957490 -> {
                                                            var100 ^= 1663968519;
                                                            yield var100 ^ -2041293027;
                                                        }
                                                    };
                                                    var11 = var100;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    long var711 = var11 + 2L;
                                                    var672 *= var711;
                                                    var11 += 3L;
                                                    var672 *= var11;
                                                    var11 = var672 & 7L;
                                                    long var726;
                                                    int var323 = (var726 = var11 - 0L) == 0L ? 0 : (var726 < 0L ? -1 : 1);
                                                    if (var323 != 0) {
                                                        break label469;
                                                    }

                                                    float var324 = var361 * 0.18F;
                                                    float var325 = var324 * var460;
                                                    float var555 = -0.12F * var397;
                                                    float var633 = -0.16F * var460;
                                                    var0.translate(var325, var555, var633);
                                                    RotationAxis var326 = RotationAxis.POSITIVE_Y;
                                                    float var556 = var361 * -68.0F;
                                                    float var557 = var556 * var460;
                                                    i_2.xo(var0, var326, var557);
                                                    RotationAxis var327 = RotationAxis.POSITIVE_Z;
                                                    float var558 = var361 * 72.0F;
                                                    int var634 = var4 + 1;
                                                    int var635 = var4 * var634;
                                                    int var636 = var635 & 1;
                                                    if (var636 == 0) {
                                                        var100 *= 991808973;
                                                        var100 += -1107206726;
                                                        var100 ^= 1280624296;
                                                        var12 = var100;
                                                        long var705 = var12 + 1L;
                                                        var705 = var12 * var705;
                                                        var12 = var705 & 1L;
                                                        long var727;
                                                        int var639 = (var727 = var12 - 0L) == 0L ? 0 : (var727 < 0L ? -1 : 1);
                                                        if (var639 != 0) {
                                                            break label469;
                                                        }

                                                        float var559 = var558 * var460;
                                                        i_2.xo(var0, var327, var559);
                                                        RotationAxis var328 = RotationAxis.POSITIVE_X;
                                                        float var560 = -48.0F * var460;
                                                        i_2.xo(var0, var328, var560);
                                                        switch (var100) {
                                                            case -1954816160:
                                                            default:
                                                                var100 ^= 761059238;
                                                                break label423;
                                                            case 1198462166:
                                                                var100 >>>= 29;
                                                                var100 |= -1762597984;
                                                                var100 += 979023844;
                                                                var100 ^= -2029127114;
                                                                break label423;
                                                            case 1573428658:
                                                                var100 ^= -694163314;
                                                                break label423;
                                                        }
                                                    }

                                                    var100 += 1816682425;
                                                    var100 ^= 1813112026;
                                                    break;
                                                case 8:
                                                    var100 ^= 1502079797;
                                                    var100 -= -70056935;
                                                    var100 |= 2118343758;
                                                    var100 -= -1362527303;
                                                    var100 ^= -231678869;
                                                    float var314 = var361 * -0.12F;
                                                    float var315 = var314 * var397;
                                                    float var546 = 0.34F * var460;
                                                    float var632 = -0.22F * var460;
                                                    var0.translate(var315, var546, var632);
                                                    RotationAxis var316 = RotationAxis.POSITIVE_Z;
                                                    float var547 = var361 * -24.0F;
                                                    float var548 = var547 * var397;
                                                    i_2.xo(var0, var316, var548);
                                                    RotationAxis var317 = RotationAxis.POSITIVE_X;
                                                    float var549 = 92.0F * var460;
                                                    i_2.xo(var0, var317, var549);
                                                    Integer var318 = var4;
                                                    if (var318 != null) {
                                                        var100 += -265041411;
                                                        var100 += 1408007198;
                                                        var100 ^= 307550607;
                                                        var100 ^= -607538214;
                                                        int var319 = var100 + 1;
                                                        int var320 = var100 * var319;
                                                        int var321 = var320 & 1;
                                                        if (var321 != 0) {
                                                            break label469;
                                                        }

                                                        RotationAxis var322 = RotationAxis.POSITIVE_Y;
                                                        float var550 = var361 * 24.0F;
                                                        float var551 = var550 * var460;
                                                        i_2.xo(var0, var322, var551);
                                                        var100 += 134227190;
                                                        var100 ^= 1629328786;
                                                        break label423;
                                                    }

                                                    switch (var100) {
                                                        case -1566154914:
                                                            var100 += 550519180;
                                                            var100 &= -224588947;
                                                            var100 -= -1237576981;
                                                            var100 ^= -1322057966;
                                                            var100 ^= 1352758584;
                                                            break label395;
                                                        case 1025708768:
                                                            var100 ^= 160334159;
                                                            break label395;
                                                        case 2050602711:
                                                        default:
                                                            var100 ^= 1147393578;
                                                            break label395;
                                                    }
                                                case 9:
                                                    var100 *= -49813717;
                                                    var100 *= 1730926665;
                                                    var100 ^= 1631001474;
                                                    var100 &= -810014325;
                                                    var100 ^= 265019415;
                                                    float var309 = var361 * -0.16F;
                                                    float var310 = var309 * var460;
                                                    float var533 = 0.04F * var460;
                                                    float var631 = -0.62F * var460;
                                                    var0.translate(var310, var533, var631);
                                                    RotationAxis var311 = RotationAxis.POSITIVE_Y;
                                                    float var534 = var361 * 12.0F;
                                                    float var535 = var534 * var460;
                                                    i_2.xo(var0, var311, var535);
                                                    RotationAxis var312 = RotationAxis.POSITIVE_X;
                                                    float var536 = -68.0F * var460;
                                                    i_2.xo(var0, var312, var536);
                                                    RotationAxis var313 = RotationAxis.POSITIVE_Z;
                                                    var11 = var4;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    long var15 = var11 + 2L;
                                                    var672 *= var15;
                                                    var11 += 3L;
                                                    var672 *= var11;
                                                    var11 = var672 & 7L;
                                                    long var724;
                                                    int var540 = (var724 = var11 - 0L) == 0L ? 0 : (var724 < 0L ? -1 : 1);
                                                    if (var540 == 0) {
                                                        var100 ^= 21361121;
                                                        var100 >>= 25;
                                                        var100 += 1569365160;
                                                        var100 &= 360226224;
                                                        var100 ^= 2017655499;
                                                        var11 = var100;
                                                        var672 = var11 + 1L;
                                                        var672 = var11 * var672;
                                                        var11 = var672 & 1L;
                                                        long var725;
                                                        int var543 = (var725 = var11 - 0L) == 0L ? 0 : (var725 < 0L ? -1 : 1);
                                                        if (var543 != 0) {
                                                            break label469;
                                                        }

                                                        float var544 = var361 * 12.0F;
                                                        float var545 = var544 * var460;
                                                        i_2.xo(var0, var313, var545);
                                                        switch (var100) {
                                                            case -659565885:
                                                            default:
                                                                var100 ^= -1420306824;
                                                                break label423;
                                                            case 1744607161:
                                                                var100 ^= 779540067;
                                                                break label423;
                                                            case 1833592555:
                                                                var100 |= 399020726;
                                                                var100 -= -1959722643;
                                                                var100 ^= -1562405854;
                                                                break label423;
                                                        }
                                                    }

                                                    var100 *= 1377396905;
                                                    var100 ^= -950060512;
                                                    break;
                                                case 10:
                                                    var100 *= -1470105599;
                                                    var100 -= -1781195914;
                                                    var100 ^= 683217589;
                                                    var100 >>>= 29;
                                                    var100 ^= 78821896;
                                                    float var304 = var361 * -0.14F;
                                                    float var305 = var304 * var397;
                                                    float var527 = 0.1F * var397;
                                                    float var620 = -0.1F * var397;
                                                    var0.translate(var305, var527, var620);
                                                    RotationAxis var306 = RotationAxis.POSITIVE_Y;
                                                    float var528 = var361 * 22.0F;
                                                    float var529 = var528 * var397;
                                                    int var621 = var4 + 1;
                                                    int var622 = var4 * var621;
                                                    int var678 = var4 + 2;
                                                    int var623 = var622 * var678;
                                                    int var679 = var4 + 3;
                                                    int var624 = var623 * var679;
                                                    int var625 = var624 & 7;
                                                    if (var625 == 0) {
                                                        var100 >>= 29;
                                                        var100 ^= -1145790427;
                                                        int var626 = var100 + 1;
                                                        int var627 = var100 * var626;
                                                        int var628 = var627 & 1;
                                                        if (var628 != 0) {
                                                            break label469;
                                                        }

                                                        i_2.xo(var0, var306, var529);
                                                        RotationAxis var307 = RotationAxis.POSITIVE_Z;
                                                        float var530 = var361 * -360.0F;
                                                        Lv var629 = sT_2.q;
                                                        float var630 = var629.l(var351);
                                                        float var531 = var530 * var630;
                                                        i_2.xo(var0, var307, var531);
                                                        RotationAxis var308 = RotationAxis.POSITIVE_X;
                                                        float var532 = -32.0F * var397;
                                                        i_2.xo(var0, var308, var532);
                                                        var100 -= 1459997660;
                                                        var100 ^= 854111737;
                                                        break label423;
                                                    }

                                                    switch (var100) {
                                                        case -1035979888:
                                                        default:
                                                            var100 ^= 503306182;
                                                            break label395;
                                                        case -1011086807:
                                                            var100 ^= 1384635313;
                                                            break label395;
                                                        case 78821901:
                                                            var100 *= 2106820481;
                                                            var100 ^= 652737754;
                                                            break label395;
                                                    }
                                                case 11:
                                                    var100 -= -1234563535;
                                                    var100 *= 1412120789;
                                                    var100 *= -40076433;
                                                    var100 ^= 1751545661;
                                                    var100 ^= -1331240317;
                                                    var11 = var100;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    var11 = var672 & 1L;
                                                    long var722;
                                                    int var298 = (var722 = var11 - 0L) == 0L ? 0 : (var722 < 0L ? -1 : 1);
                                                    if (var298 != 0) {
                                                        break label469;
                                                    }

                                                    float var299 = var361 * -0.26F;
                                                    float var300 = var299 * var460;
                                                    float var515 = 0.18F * var460;
                                                    float var619 = -0.12F * var460;
                                                    var0.translate(var300, var515, var619);
                                                    RotationAxis var301 = RotationAxis.POSITIVE_Y;
                                                    float var516 = var361 * 18.0F;
                                                    float var517 = var516 * var460;
                                                    i_2.xo(var0, var301, var517);
                                                    RotationAxis var302 = RotationAxis.POSITIVE_Z;
                                                    float var518 = var361 * -68.0F;
                                                    float var519 = var518 * var460;
                                                    i_2.xo(var0, var302, var519);
                                                    RotationAxis var303 = RotationAxis.POSITIVE_X;
                                                    var11 = var4;
                                                    var672 = var11 + 1L;
                                                    var672 = var11 * var672;
                                                    var11 = var672 & 1L;
                                                    long var723;
                                                    int var522 = (var723 = var11 - 0L) == 0L ? 0 : (var723 < 0L ? -1 : 1);
                                                    if (var522 == 0) {
                                                        var100 &= -1085404610;
                                                        var100 ^= 1442212911;
                                                        int var523 = var100 + 1;
                                                        int var524 = var100 * var523;
                                                        int var525 = var524 & 1;
                                                        if (var525 != 0) {
                                                            break label469;
                                                        }

                                                        float var526 = -28.0F * var460;
                                                        i_2.xo(var0, var303, var526);
                                                        var100 += 2072511829;
                                                        var100 ^= -1480324412;
                                                        break label423;
                                                    }

                                                    var100 += -149216589;
                                                    var100 >>>= 26;
                                                    var100 ^= -364615854;
                                                    break;
                                                default:
                                                    var100 = switch (var100) {
                                                        case -8957490 -> {
                                                            var100 *= -1971300325;
                                                            var100 += -2095003445;
                                                            var100 -= 1913242740;
                                                            var100 &= 1918188421;
                                                            yield var100 ^ -361439948;
                                                        }
                                                        default -> var100 ^ 1546040826;
                                                        case 1844715184 -> var100 ^ -1368250383;
                                                    };
                                                    var4 = var100 + 1;
                                                    var4 = var100 * var4;
                                                    int var296 = var100 + 2;
                                                    var4 *= var296;
                                                    int var297 = var100 + 3;
                                                    var4 *= var297;
                                                    var4 &= 7;
                                                    if (var4 == 0) {
                                                        return false;
                                                    }
                                                    break label469;
                                            }
                                        } else {
                                            switch (var100) {
                                                case -1653366884:
                                                    var100 -= -63731053;
                                                    var100 ^= 1258582622;
                                                    break;
                                                case -1449612581:
                                                default:
                                                    var100 ^= 1814411335;
                                                    break;
                                                case -458033371:
                                                    var100 ^= -1680571927;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var100 >>= 1;
                        var100 ^= 451735499;
                    }

                    var4 = var100 + 1;
                    var4 = var100 * var4;
                    var100 = var4 & 1;
                    if (var100 == 0) {
                        AssertionError var263 = new AssertionError();
                        throw var263;
                    }
                    break label469;
                }

                Integer var284 = var100;
                if (var284 != null) {
                    return false;
                }
                break label469;
            }

            int var279 = var100 + 1;
            var279 = var100 * var279;
            var279 &= 1;
            if (var279 == 0) {
                return true;
            }
        }

        UnsupportedOperationException var267 = new UnsupportedOperationException();
        throw var267;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1192122376;
        int var2 = Module.C;
        int var4 = of_2.xF(var3, var1, var2);
        FN = var4;
    }
}
