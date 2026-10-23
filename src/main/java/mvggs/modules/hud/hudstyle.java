package mvggs.modules.hud;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public final class hudstyle extends Module {
    private final ModeSetting kO;
    private final ColorSetting u;
    private final ColorSetting kR;
    private final ModeSetting g;
    private final NumberSetting nR;
    private final BooleanSetting as;
    private final BooleanSetting TI;
    private final BooleanSetting W;
    private Oo R;
    public static final int Rw;

    public hudstyle() {
        super("hud_style", "HUD Style", ModuleCategory.HUD);
        ModuleCategory var1 = ModuleCategory.HUD;

        eG var2 = eG.CLASSIC;
        ModeSetting var3 = new ModeSetting("theme", "Theme", var2);
        El var42 = (var1x, var2x) -> {
            label62: {
                int var3x = Rw;
                var3x ^= 1782275901;
                int var5x = System.identityHashCode(this);
                Integer var6x = var5x;
                if (var6x != null) {
                    var3x &= 1998344704;
                    var3x ^= 1782304661;
                    var3x |= -1752536566;
                    var3x ^= 1376406227;
                    int var57 = var3x - 1465092393;
                    var57 <<= 4;
                    var57 ^= 2005801887;
                    var57 -= -751342424;
                    var57 ^= -1247358363;
                    Oo var62 = this.K((eG)var1x, var57);
                    if (var2x == 0) {
                        var3x -= -1012025538;
                        var3x -= 1886607484;
                        var3x -= -367623032;
                        var3x ^= -653946941;
                        Integer var7x = var2x;
                        if (var7x == null) {
                            break label62;
                        }

                        int var64 = var62.E();
                        int var8x = var5x + 1;
                        var8x = var5x * var8x;
                        int var9x = var5x + 2;
                        var8x *= var9x;
                        var9x = var5x + 3;
                        var8x *= var9x;
                        var8x &= 7;
                        if (var8x == 0) {
                            var3x = switch (var3x) {
                                case -1700810031 -> var3x ^ -1642608173;
                                default -> var3x ^ -183036019;
                                case 1450159817 -> {
                                    var3x *= -1909094919;
                                    var3x <<= 3;
                                    var3x -= 1616986733;
                                    var3x -= 1337857228;
                                    yield var3x ^ -108985270;
                                }
                            };
                            Integer var70 = var2x;
                            if (var70 == null) {
                                break label62;
                            }

                            var3x *= 641198135;
                            var3x ^= -1328231736;
                            return var64;
                        }

                        var3x &= -1851364215;
                        var3x ^= -1818943919;
                    } else {
                        var3x = switch (var3x) {
                            case -1381911220 -> {
                                var3x += 1906723362;
                                var3x |= 382007216;
                                var3x += -1084112216;
                                var3x |= -1728027643;
                                yield var3x ^ 2071456219;
                            }
                            default -> var3x ^ -1765877179;
                            case 1459387062 -> var3x ^ -519254569;
                        };
                        var57 = var62.P();
                        int var71 = var5x + 1;
                        var71 = var5x * var71;
                        var5x = var71 & 1;
                        if (var5x == 0) {
                            var3x *= -222385639;
                            var3x += 153101588;
                            var3x >>= 19;
                            var3x *= 524380797;
                            var3x ^= -1945724944;
                            Integer var56x = var2x;
                            if (var56x == null) {
                                break label62;
                            }

                            var3x += -1424259925;
                            var3x |= -2051639519;
                            var3x ^= -1795100188;
                            return var57;
                        }

                        switch (var3x) {
                            case -1537339524:
                                var3x -= -1387029618;
                                var3x |= 305202931;
                                var3x ^= -1313393219;
                                var3x ^= -985698150;
                                break;
                            case -563911894:
                                var3x ^= 1231621901;
                                break;
                            case 732904721:
                            default:
                                var3x ^= 790166853;
                        }
                    }
                } else {
                    var3x &= -1493470520;
                    var3x ^= -1194402882;
                    var3x ^= 1072019750;
                }

                var3x = var2x + 1;
                var3x = var2x * var3x;
                var3x &= 1;
                if (var3x == 0) {
                    IllegalStateException var54x = new IllegalStateException();
                    throw var54x;
                }
            }

            AssertionError var53x = new AssertionError();
            throw var53x;
        };
        ModeSetting var4 = var3.w(var42);
        Setting var5 = var4.q("Colors and material of every HUD panel. Classic matches the menu.");
        ModeSetting var6 = (ModeSetting)var5;
        Setting var7 = this.addSetting(var6);
        ModeSetting var8 = (ModeSetting)var7;
        this.kO = var8;
        var2 = eG.PURPLE;
        Oo var44 = var2.palette();
        int var45 = var44.E();
        ColorSetting var9 = new ColorSetting("accent", "Accent", var45, false);
        BooleanSupplier var46 = this::nE;
        Setting var10 = var9.Pt(var46);
        ColorSetting var11 = (ColorSetting)var10;
        Setting var12 = this.addSetting(var11);
        ColorSetting var13 = (ColorSetting)var12;
        this.u = var13;
        var2 = eG.PURPLE;
        Oo var48 = var2.palette();
        int var49 = var48.P();
        ColorSetting var14 = new ColorSetting("accent_2", "Accent 2", var49, false);
        BooleanSupplier var50 = this::nE;
        Setting var15 = var14.Pt(var50);
        ColorSetting var16 = (ColorSetting)var15;
        Setting var17 = this.addSetting(var16);
        ColorSetting var18 = (ColorSetting)var17;
        this.kR = var18;
        t_2 var51 = t_2.DARK;
        ModeSetting var19 = new ModeSetting("material", "Background", var51);
        BooleanSupplier var52 = this::nE;
        Setting var20 = var19.Pt(var52);
        ModeSetting var21 = (ModeSetting)var20;
        Setting var22 = this.addSetting(var21);
        ModeSetting var23 = (ModeSetting)var22;
        this.g = var23;
        NumberSetting var24 = new NumberSetting("opacity", "Opacity", 0.9F, 0.4F, 1.0F);
        NumberSetting var25 = var24.W(0.05F);
        BooleanSupplier var53 = () -> {
            int var1x = Rw;
            var1x ^= -454671786;
            int var2x = System.identityHashCode(this);
            Oo var3x = this.eo();
            Integer var32x = var2x;
            label31:
            if (var32x != null) {
                var1x |= -1001295262;
                var1x >>= 18;
                var1x *= 1012340641;
                var1x <<= 4;
                var1x ^= -1845496979;
                boolean var33x = var3x.uo();
                boolean var37x;
                if (!var33x) {
                    var1x *= -1739584053;
                    var1x |= 1472353963;
                    var1x ^= 316282175;
                    int var34x = var1x + 1;
                    var34x = var1x * var34x;
                    var34x &= 1;
                    if (var34x != 0) {
                        break label31;
                    }

                    var37x = true;
                    var1x |= 1771572363;
                    var1x ^= 364320678;
                } else {
                    var1x |= 1117436174;
                    var1x ^= -863164331;
                    long var42x = var1x;
                    long var46x = var42x + 1L;
                    var46x = var42x * var46x;
                    long var7x = var42x + 2L;
                    var46x *= var7x;
                    long var43x = var42x + 3L;
                    var46x *= var43x;
                    long var44x = var46x & 7L;
                    long var50x;
                    int var45x = (var50x = var44x - 0L) == 0L ? 0 : (var50x < 0L ? -1 : 1);
                    if (var45x != 0) {
                        break label31;
                    }

                    var37x = false;
                    var1x ^= 674490447;
                    var1x ^= 1779351624;
                }

                return var37x;
            } else {
                var1x |= 1662606610;
                var1x ^= 802566169;
                long var12x = var1x;
                long var38x = var12x + 1L;
                long var39x = var12x * var38x;
                long var5x = var12x + 2L;
                long var40x = var39x * var5x;
                long var13x = var12x + 3L;
                long var41x = var40x * var13x;
                long var14x = var41x & 7L;
                long var51x;
                var1x = (var51x = var14x - 0L) == 0L ? 0 : (var51x < 0L ? -1 : 1);
                if (var1x == 0) {
                    IllegalStateException var16x = new IllegalStateException();
                    throw var16x;
                }
            }

            UnsupportedOperationException var31x = new UnsupportedOperationException();
            throw var31x;
        };
        Setting var26 = var25.Pt(var53);
        NumberSetting var27 = (NumberSetting)var26;
        Setting var28 = this.addSetting(var27);
        NumberSetting var29 = (NumberSetting)var28;
        this.nR = var29;
        BooleanSetting var30 = new BooleanSetting("blur", "Backdrop Blur", true);
        Setting var31 = this.addSetting(var30);
        BooleanSetting var32 = (BooleanSetting)var31;
        this.as = var32;
        BooleanSetting var33 = new BooleanSetting("chat_editor", "Edit In Chat", true);
        Setting var34 = var33.q("Open chat to drag HUD elements, scroll to resize, right-click to reset.");
        BooleanSetting var35 = (BooleanSetting)var34;
        Setting var36 = this.addSetting(var35);
        BooleanSetting var37 = (BooleanSetting)var36;
        this.TI = var37;
        BooleanSetting var38 = new BooleanSetting("snap", "Snap To Guides", true);
        Setting var39 = this.addSetting(var38);
        BooleanSetting var40 = (BooleanSetting)var39;
        this.W = var40;
        this.dy("Theme, background and the in-chat editor shared by every HUD panel.");
        this.ao();
        Runnable var41 = () -> {
            int var1x = Rw;
            var1x ^= 311135549;
            int var2x = System.identityHashCode(this);
            long var22x = var2x;
            long var4x = var22x + 1L;
            var4x = var22x * var4x;
            long var23x = var4x & 1L;
            long var30x;
            var2x = (var30x = var23x - 0L) == 0L ? 0 : (var30x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x ^= 640212554;
                var1x &= -2054754599;
                var1x >>= 25;
                var1x &= 1082048750;
                var1x ^= -1474308644;
                IllegalStateException var25x = new IllegalStateException();
                throw var25x;
            } else {
                var1x ^= 1388781626;
                var1x |= -2001446702;
                var1x |= -520366207;
                var1x ^= 32272464;
                long var12x = var1x;
                long var3x = var12x + 1L;
                var3x = var12x * var3x;
                long var5x = var12x + 2L;
                var3x *= var5x;
                long var13x = var12x + 3L;
                var3x *= var13x;
                long var14x = var3x & 7L;
                long var31x;
                var1x = (var31x = var14x - 0L) == 0L ? 0 : (var31x < 0L ? -1 : 1);
                if (var1x == 0) {
                    this.R = null;
                } else {
                    UnsupportedOperationException var16x = new UnsupportedOperationException();
                    throw var16x;
                }
            }
        };
        ColorSetting var54 = this.u;
        var54.k(var41);
        ColorSetting var55 = this.kR;
        var55.k(var41);
        ModeSetting var56 = this.g;
        var56.k(var41);
    }

    public eG zf() {
        int var1 = Rw;
        var1 ^= 1259957760;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 == null) {
            var1 &= -875512059;
            var1 >>= 7;
            var1 &= 984164747;
            var1 += -1371454731;
            var1 ^= 967907975;
            int var16 = var1 + 1;
            var16 = var1 * var16;
            var16 &= 1;
            if (var16 != 0) {
                AssertionError var20 = new AssertionError();
                throw var20;
            } else {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        } else {
            var1 &= 1783915579;
            var1 *= 971308071;
            var1 >>>= 2;
            var1 ^= 573864961;
            ModeSetting var8 = this.kO;
            Enum var9 = var8.A();
            return (eG)var9;
        }
    }

    public void Wf(eG var1) {
        int var2 = Rw;
        var2 ^= -372589365;
        int var3 = System.identityHashCode(this);
        long var21 = var3;
        long var5 = var21 + 1L;
        var5 = var21 * var5;
        long var7 = var21 + 2L;
        var5 *= var7;
        long var22 = var21 + 3L;
        var5 *= var22;
        long var23 = var5 & 7L;
        long var30;
        var3 = (var30 = var23 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var3 != 0) {
            Integer var25 = switch (var2) {
                case -2023145598 -> {
                    var2 ^= -2043876173;
                    var2 ^= 1052965401;
                    var2 += 588988027;
                    yield var2 ^ 1431629296;
                }
                case -910514311 -> var2 ^ 827024500;
                default -> var2 ^ 1127054719;
            };
            if (var25 != null) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var2 &= -1287542766;
            var2 <<= 24;
            var2 *= -1152438651;
            var2 ^= 199660296;
            Integer var18 = var2;
            if (var18 != null) {
                ModeSetting var20 = this.kO;
                var20.UY(var1);
                return;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public Oo eo() {
        int var1 = Rw;
        var1 ^= -642748599;
        int var2 = System.identityHashCode(this);
        ModeSetting var3 = this.kO;
        Enum var19 = var3.A();
        eG var20 = (eG)var19;
        Integer var13 = var2;
        if (var13 != null) {
            var1 ^= -985734688;
            var1 -= 823376465;
            var1 ^= -1657078574;
            var13 = var1;
            if (var13 != null) {
                int var15 = var1 | -1931901565;
                var15 |= 218169876;
                var15 &= -69867246;
                var15 ^= 742528624;
                return this.K(var20, var15);
            }
        } else {
            Integer var10 = switch (var1) {
                default -> var1 ^ -1299267191;
                case -1223431168 -> {
                    var1 += 344916071;
                    yield var1 ^ 1925413190;
                }
                case 2028325224 -> var1 ^ -919981634;
            };
            if (var10 != null) {
                IllegalStateException var12 = new IllegalStateException();
                throw var12;
            }
        }

        UnsupportedOperationException var11 = new UnsupportedOperationException();
        throw var11;
    }

    private Oo K(eG var1, int var2) {
        label152: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var43;
            if (var5 == 0) {
                var43 = switch (var2) {
                    case -264949192 -> var2 ^ -1384258350;
                    case -174866590 -> {
                        var43 = var2 & 1813244694;
                        var43 *= 2031188969;
                        var43 += 1165714451;
                        var43 ^= 2011069103;
                        yield var43 ^ -1310759126;
                    }
                    default -> var2 ^ -216514547;
                };
                Integer var97 = var43;
                if (var97 == null) {
                    break label152;
                }

                eG var98 = eG.CUSTOM;
                if (var1 != var98) {
                    var43 = switch (var43) {
                        default -> var43 ^ 314453325;
                        case -575872160 -> {
                            var43 *= -1288015789;
                            var43 += 698946677;
                            var43 &= -434087591;
                            var43 >>>= 11;
                            yield var43 ^ -101888542;
                        }
                        case 1868885653 -> var43 ^ 1340900370;
                    };
                    int var100 = var43 + 1;
                    var100 = var43 * var100;
                    var100 &= 1;
                    if (var100 == 0) {
                        return var1.palette();
                    }
                    break label152;
                }

                var43 &= -408590322;
                var43 >>>= 14;
                var43 ^= 319715908;
                Oo var99 = this.R;
                Integer var6 = var4;
                if (var6 != null) {
                    var43 >>>= 24;
                    var43 += -534872220;
                    var43 ^= 427473044;
                    var6 = var43;
                    if (var6 == null) {
                        break label152;
                    }

                    if (var99 != null) {
                        var43 += -601591638;
                        var43 *= 203276347;
                        var43 >>>= 11;
                        var43 &= -1968551855;
                        var43 ^= -1685437457;
                        var6 = var43;
                        if (var6 == null) {
                            break label152;
                        }

                        var43 += 1298308797;
                        var43 ^= 2133249537;
                        return var99;
                    }
                    var43 = switch (var43) {
                        case -110835741 -> {
                            var43 &= 93622561;
                            var43 >>= 4;
                            var43 *= 1213986883;
                            var43 >>>= 12;
                            yield var43 ^ -955195505;
                        }
                        default -> var43 ^ -639746775;
                        case 1469865562 -> var43 ^ -499629744;
                    };
                    ModeSetting var106 = this.g;
                    t_2 var7 = t_2.GLASS;
                    boolean var107 = var106.TJ(var7);
                    long var116 = var4;
                    long var9 = var116 + 1L;
                    var9 = var116 * var9;
                    long var11 = var116 + 2L;
                    var9 *= var11;
                    long var117 = var116 + 3L;
                    var9 *= var117;
                    long var118 = var9 & 7L;
                    long var156;
                    int var119 = (var156 = var118 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                    label144:
                    if (var119 == 0) {
                        var43 &= 687442093;
                        var43 *= 2127730207;
                        var43 |= -1270979493;
                        var43 ^= -1999031173;
                        Integer var120 = var43;
                        if (var120 == null) {
                            break label152;
                        }

                        eG var112;
                        if (var107) {
                            var43 = switch (var43) {
                                default -> var43 ^ 419999510;
                                case -951929100 -> var43 ^ 1376268500;
                                case 1957122692 -> {
                                    var43 += 1319860995;
                                    var43 ^= 1907749271;
                                    yield var43 ^ 1803787556;
                                }
                            };
                            long var108 = var43;
                            long var8 = var108 + 1L;
                            var8 = var108 * var8;
                            long var109 = var8 & 1L;
                            long var157;
                            int var110 = (var157 = var109 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                            if (var110 != 0) {
                                break label152;
                            }

                            eG var111 = eG.CLASSIC;
                            Integer var121 = var4;
                            if (var121 == null) {
                                switch (var43) {
                                    case -647716556:
                                        var43 ^= -560635927;
                                        var43 &= -729734659;
                                        var43 *= -761990483;
                                        var43 |= 1634996328;
                                        var43 ^= -887788295;
                                        break label144;
                                    case 1621383612:
                                    default:
                                        var43 ^= -696724200;
                                        break label144;
                                    case 1749212155:
                                        var43 ^= 2072288525;
                                        break label144;
                                }
                            }

                            var43 += 1648802767;
                            var43 ^= 2068622241;
                            var112 = var111;
                            switch (var43) {
                                case 459338120:
                                    var43 ^= 1644265991;
                                    break;
                                case 801300618:
                                default:
                                    var43 ^= -1274881400;
                                    break;
                                case 1088943778:
                                    var43 -= -506727501;
                                    var43 += -498300638;
                                    var43 <<= 19;
                                    var43 *= 695332277;
                                    var43 ^= -1934331224;
                            }
                        } else {
                            var43 *= -62475673;
                            var43 ^= 368888129;
                            var43 ^= 1938729964;
                            eG var122 = eG.PURPLE;
                            long var135 = var4;
                            long var10 = var135 + 1L;
                            var10 = var135 * var10;
                            long var12 = var135 + 2L;
                            var10 *= var12;
                            var135 += 3L;
                            var10 *= var135;
                            var135 = var10 & 7L;
                            long var158;
                            int var138 = (var158 = var135 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                            if (var138 != 0) {
                                switch (var43) {
                                    case -2136643206:
                                    default:
                                        var43 ^= 1691461608;
                                        break label144;
                                    case -1778085940:
                                        var43 ^= -145332364;
                                        break label144;
                                    case -1598318159:
                                        var43 >>= 1;
                                        var43 |= -130850718;
                                        var43 ^= 1410768762;
                                        break label144;
                                }
                            }
                            var43 = switch (var43) {
                                case -1598318159 -> {
                                    var43 &= -187351241;
                                    var43 -= -903599396;
                                    yield var43 ^ -645199700;
                                }
                                default -> var43 ^ 1909891932;
                                case 1847869900 -> var43 ^ -2030672771;
                            };
                            int var139 = var43 + 1;
                            int var140 = var43 * var139;
                            int var141 = var140 & 1;
                            if (var141 != 0) {
                                break label152;
                            }

                            var112 = var122;
                            switch (var43) {
                                case -1540622251:
                                default:
                                    var43 ^= -811105639;
                                    break;
                                case 235930213:
                                    var43 ^= 533030537;
                                    break;
                                case 266856185:
                                    var43 ^= -1454517401;
                                    var43 |= 475727279;
                                    var43 ^= 442976023;
                            }
                        }

                        int var123 = var43 + 1;
                        int var124 = var43 * var123;
                        int var142 = var43 + 2;
                        int var125 = var124 * var142;
                        var142 = var43 + 3;
                        int var126 = var125 * var142;
                        int var127 = var126 & 7;
                        if (var127 != 0) {
                            break label152;
                        }

                        Oo var113 = var112.palette();
                        ColorSetting var128 = this.u;
                        int var129 = var128.zz();
                        ColorSetting var144 = this.kR;
                        var142 = var144.zz();
                        Oo var114 = var113.Y(var129, var142);
                        long var130 = var4;
                        var9 = var130 + 1L;
                        var9 = var130 * var9;
                        long var131 = var9 & 1L;
                        long var159;
                        var4 = (var159 = var131 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            var43 >>= 3;
                            var43 ^= -1811018591;
                            var43 ^= 245478797;
                            long var132 = var43;
                            var9 = var132 + 1L;
                            var9 = var132 * var9;
                            long var133 = var9 & 1L;
                            long var160;
                            var4 = (var160 = var133 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                            if (var4 != 0) {
                                break label152;
                            }

                            this.R = var114;
                            switch (var43) {
                                case 76735888:
                                    var43 ^= -1907322447;
                                    return var114;
                                case 206113337:
                                default:
                                    var43 ^= -695616160;
                                    return var114;
                                case 1849440121:
                                    var43 ^= -1210151816;
                                    var43 *= 889505201;
                                    var43 &= 1187542251;
                                    var43 ^= -683524901;
                                    return var114;
                            }
                        }

                        var43 += 1963078588;
                        var43 ^= -543115630;
                        var43 ^= 1555551757;
                        var43 >>= 8;
                        var43 ^= 1408498246;
                    } else {
                        var43 &= -1789978802;
                        var43 &= -743756190;
                        var43 ^= 761951106;
                    }
                } else {
                    var43 ^= 2132020996;
                    var43 ^= -1066397615;
                }
            } else {
                var43 = var2 - -247215480;
                var43 ^= -1473869990;
            }

            long var87 = var43;
            long var103 = var87 + 1L;
            long var104 = var87 * var103;
            long var88 = var104 & 1L;
            long var161;
            var43 = (var161 = var88 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
            if (var43 == 0) {
                RuntimeException var91 = new RuntimeException();
                throw var91;
            }
        }

        IllegalArgumentException var90 = new IllegalArgumentException();
        throw var90;
    }

    private boolean nE() {
        int var1 = Rw;
        var1 ^= -1750481850;
        int var2 = System.identityHashCode(this);
        ModeSetting var3 = this.kO;
        eG var4 = eG.CUSTOM;
        int var5 = var2 + 1;
        var5 = var2 * var5;
        int var6 = var2 + 2;
        var5 *= var6;
        var2 += 3;
        var5 *= var2;
        var2 = var5 & 7;
        if (var2 != 0) {
            Integer var21 = switch (var1) {
                case -1664573207 -> var1 ^ -1338634371;
                case -116766961 -> {
                    var1 &= -1798997827;
                    var1 ^= 713891222;
                    var1 &= 1602543873;
                    var1 |= -216525103;
                    yield var1 ^ -9049445;
                }
                default -> var1 ^ -338394344;
            };
            if (var21 != null) {
                AssertionError var22 = new AssertionError();
                throw var22;
            }
        } else {
            var1 >>>= 17;
            var1 ^= 1503342517;
            long var15 = var1;
            long var26 = var15 + 1L;
            long var27 = var15 * var26;
            long var16 = var27 & 1L;
            long var28;
            var1 = (var28 = var16 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                return var3.TJ(var4);
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    public int E(Oo var1) {
        int var2 = Rw;
        var2 ^= 1469926866;
        int var3 = System.identityHashCode(this);
        long var18 = var3;
        long var5 = var18 + 1L;
        var5 = var18 * var5;
        long var7 = var18 + 2L;
        var5 *= var7;
        long var19 = var18 + 3L;
        var5 *= var19;
        long var20 = var5 & 7L;
        long var30;
        var3 = (var30 = var20 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 ^= 902778479;
            var2 *= -1712648295;
            var2 ^= 2125132072;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                var3 = var1.CU();
                NumberSetting var4 = this.nR;
                float var26 = var4.WM();
                return DP.Y(var3, var26);
            }
        } else {
            Integer var15 = switch (var2) {
                case -905177187 -> var2 ^ 161536813;
                default -> var2 ^ -1524580642;
                case 960417435 -> {
                    var2 >>= 12;
                    yield var2 ^ -1016307613;
                }
            };
            if (var15 != null) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    public boolean Ot() {
        int var1 = Rw;
        var1 ^= 968590521;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 -= -449277748;
            var1 ^= 201650902;
            BooleanSetting var21 = this.as;
            return var21.vb();
        } else {
            var1 |= 1216371521;
            var1 >>= 10;
            var1 -= -124535204;
            var1 -= -475637256;
            var1 ^= 1031934187;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            } else {
                IllegalStateException var12 = new IllegalStateException();
                throw var12;
            }
        }
    }

    public boolean T() {
        int var1 = Rw;
        var1 ^= -669625948;
        int var2 = System.identityHashCode(this);
        BooleanSetting var3 = this.TI;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 != 0) {
            Integer var20 = switch (var1) {
                case -1229597971 -> {
                    var1 -= 1404814880;
                    var1 *= -1166125243;
                    var1 -= 1854148277;
                    var1 |= 1003924688;
                    yield var1 ^ -379477967;
                }
                default -> var1 ^ 243226971;
                case 443209779 -> var1 ^ -728158738;
            };
            if (var20 != null) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            var1 *= 1389770235;
            var1 >>>= 28;
            var1 ^= 513438648;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var4 = var1 + 2;
            var2 *= var4;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return var3.vb();
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public boolean ja() {
        int var1 = Rw;
        var1 ^= 350376443;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var20 = var4 & 1L;
        long var25;
        var2 = (var25 = var20 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 1278521129;
            var1 += -1515314432;
            var1 -= 107211172;
            var1 += 1330622506;
            var1 ^= -1395702616;
            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            var1 &= 80585286;
            var1 ^= -2012273730;
            long var9 = var1;
            long var3 = var9 + 1L;
            var3 = var9 * var3;
            long var10 = var3 & 1L;
            long var26;
            var1 = (var26 = var10 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 != 0) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            } else {
                BooleanSetting var12 = this.W;
                return var12.vb();
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -228349769;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        Rw = var4;
    }
}
