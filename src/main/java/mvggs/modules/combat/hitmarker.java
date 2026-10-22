package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class hitmarker extends Yn {
    private static final dZ_2 V;
    private static final dZ_2 iX;
    private final r_2 y;
    private final Uq n;
    private final Uq aW;
    private final JL iO;
    private final Fk qk;
    private final Fk oR;
    private final Fk C;
    private YH Tq;
    private int Ws;
    private boolean Be;
    public static final int W;

    public hitmarker() {
        super("hit_marker", "Hit Marker", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        Xo var2 = Xo.TICKS;
        r_2 var3 = new r_2("style", "Style", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.y = var5;
        Uq var6 = new Uq("size", "Size", 3.0F, 2.0F, 10.0F);
        Uq var7 = var6.W(0.5F);
        xB var8 = this.vn(var7);
        Uq var9 = (Uq)var8;
        this.n = var9;
        Uq var10 = new Uq("thickness", "Thickness", 0.8F, 0.5F, 3.0F);
        Uq var11 = var10.W(0.1F);
        xB var12 = this.vn(var11);
        Uq var13 = (Uq)var12;
        this.aW = var13;
        JL var14 = new JL("glow", "Glow", false);
        xB var15 = this.vn(var14);
        JL var16 = (JL)var15;
        this.iO = var16;
        Fk var17 = new Fk("hit_color", "Hit Color", -854017);
        xB var18 = this.vn(var17);
        Fk var19 = (Fk)var18;
        this.qk = var19;
        Fk var20 = new Fk("crit_color", "Crit Color", -1850997);
        xB var21 = this.vn(var20);
        Fk var22 = (Fk)var21;
        this.oR = var22;
        Fk var23 = new Fk("kill_color", "Kill Color", -1601135);
        xB var24 = this.vn(var23);
        Fk var25 = (Fk)var24;
        this.C = var25;
        this.dy("Animated crosshair confirmation for landed hits, crits and kills.");
        this.fJ(true);
        wD<Hm> var26 = (Hm var1x) -> {
            label75: {
                dZ_2 var4x;
                int var27x;
                int var67;
                label74: {
                    var27x = W;
                    var27x ^= -1788999336;
                    int var3x = System.identityHashCode(this);
                    var4x = V;
                    int var5x = (var1x.crit()) ? 1 : 0;
                    int var6x = var3x + 1;
                    var6x = var3x * var6x;
                    int var7x = var3x + 2;
                    var6x *= var7x;
                    var7x = var3x + 3;
                    var6x *= var7x;
                    var6x &= 7;
                    if (var6x == 0) {
                        var27x = switch (var27x) {
                            case 266221351 -> var27x ^ -516427381;
                            default -> var27x ^ -1112314395;
                            case 1542312148 -> {
                                var27x >>= 8;
                                var27x >>= 22;
                                var27x *= -1722973483;
                                yield var27x ^ 1826058653;
                            }
                        };
                        var6x = var27x + 1;
                        var6x = var27x * var6x;
                        var7x = var27x + 2;
                        var6x *= var7x;
                        var7x = var27x + 3;
                        var6x *= var7x;
                        var6x &= 7;
                        if (var6x != 0) {
                            break label75;
                        }

                        if (var5x != 0) {
                            var27x = switch (var27x) {
                                case -174394552 -> {
                                    var27x <<= 18;
                                    var27x |= 1160154032;
                                    yield var27x ^ -1662210222;
                                }
                                case 951246350 -> var27x ^ 554089804;
                                default -> var27x ^ -1160047872;
                            };
                            long var61 = var27x;
                            long var84 = var61 + 1L;
                            long var85 = var61 * var84;
                            long var9x = var61 + 2L;
                            long var86 = var85 * var9x;
                            long var62 = var61 + 3L;
                            long var87 = var86 * var62;
                            long var63 = var87 & 7L;
                            long var95;
                            var5x = (var95 = var63 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                            if (var5x != 0) {
                                break label75;
                            }

                            Fk var65 = this.oR;
                            var5x = var65.zz();
                            var6x = var3x + 1;
                            var6x = var3x * var6x;
                            var6x &= 1;
                            if (var6x == 0) {
                                var27x = switch (var27x) {
                                    default -> var27x ^ -2032372089;
                                    case -1244849433 -> var27x ^ -1870196398;
                                    case 1372202210 -> {
                                        var27x |= -1031267836;
                                        yield var27x ^ 1565284531;
                                    }
                                };
                                var67 = var5x;
                                var27x &= 356718550;
                                var27x ^= 1579741931;
                                break label74;
                            }

                            switch (var27x) {
                                case -686722608:
                                default:
                                    var27x ^= 1315770636;
                                    break;
                                case 1372202210:
                                    var27x ^= 1804975886;
                                    var27x &= -1365982863;
                                    var27x ^= 390768226;
                                    break;
                                case 1611412376:
                                    var27x ^= -755830210;
                            }
                        } else {
                            var27x -= 506412250;
                            var27x ^= 1264239921;
                            Fk var80 = this.qk;
                            long var88 = var3x;
                            long var91 = var88 + 1L;
                            var91 = var88 * var91;
                            long var11x = var88 + 2L;
                            var91 *= var11x;
                            long var89 = var88 + 3L;
                            var91 *= var89;
                            long var90 = var91 & 7L;
                            long var96;
                            var3x = (var96 = var90 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                            if (var3x == 0) {
                                var27x -= -1403608240;
                                var27x &= 1043998169;
                                var27x ^= 1858505068;
                                Integer var46 = var27x;
                                if (var46 == null) {
                                    break label75;
                                }

                                int var47 = var80.zz();
                                var67 = var47;
                                var27x ^= 1281542414;
                                var27x += -895814573;
                                var27x -= 1971302480;
                                var27x ^= 1005809873;
                                break label74;
                            }

                            switch (var27x) {
                                case -1674480801:
                                    var27x *= 933538315;
                                    var27x <<= 5;
                                    var27x &= 1785871231;
                                    var27x ^= 2138965282;
                                    break;
                                case -1602137157:
                                    var27x ^= 1635790285;
                                    break;
                                case 1705661129:
                                default:
                                    var27x ^= 1571467974;
                            }
                        }
                    } else {
                        var27x *= 993203995;
                        var27x >>>= 19;
                        var27x ^= 1029584832;
                    }

                    var3x = var27x + 1;
                    var3x = var27x * var3x;
                    int var60 = var27x + 2;
                    var3x *= var60;
                    var27x += 3;
                    var3x *= var27x;
                    var27x = var3x & 7;
                    if (var27x == 0) {
                        UnsupportedOperationException var44 = new UnsupportedOperationException();
                        throw var44;
                    }
                    break label75;
                }

                int var48 = var27x + 1;
                var48 = var27x * var48;
                var48 &= 1;
                if (var48 == 0) {
                    var48 = var27x + -2021331533;
                    var48 += -1830464535;
                    var48 -= 193871173;
                    var48 -= 1730390215;
                    var48 ^= 112751400;
                    this.NE(var4x, var67, false, var48);
                    return;
                }
            }

            AssertionError var43 = new AssertionError();
            throw var43;
        };
        this.iI(Hm.class, var26);
        wD<I> var27 = (I var1x) -> {
            int var2x = W;
            var2x ^= 1307987946;
            int var3x = System.identityHashCode(this);
            dZ_2 var4x = iX;
            Fk var5x = this.C;
            long var6x = var3x;
            long var8x = var6x + 1L;
            var8x = var6x * var8x;
            long var10x = var6x + 2L;
            var8x *= var10x;
            var6x += 3L;
            var8x *= var6x;
            var6x = var8x & 7L;
            long var49;
            var3x = (var49 = var6x - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
            if (var3x == 0) {
                var2x = switch (var2x) {
                    case -2092591514 -> {
                        var2x *= 789901867;
                        var2x |= -1130552029;
                        var2x -= -1784175362;
                        var2x >>>= 7;
                        yield var2x ^ 460971262;
                    }
                    case -602212100 -> var2x ^ 836367186;
                    default -> var2x ^ -353577169;
                };
                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var44 = var2x + 2;
                var3x *= var44;
                int var45 = var2x + 3;
                var3x *= var45;
                var3x &= 7;
                if (var3x == 0) {
                    var3x = var5x.zz();
                    int var37 = var2x + -1735036591;
                    int var38 = var37 | 209945826;
                    int var39 = var38 * 1346210857;
                    int var40 = var39 ^ 41597935;
                    int var41 = var40 ^ 1901566651;
                    this.NE(var4x, var3x, true, var41);
                    return;
                }
            } else {
                var2x = switch (var2x) {
                    case -2092591514 -> {
                        var2x += 1125705437;
                        var2x &= -1962833791;
                        yield var2x ^ -825802827;
                    }
                    default -> var2x ^ -1229370223;
                    case 1964889129 -> var2x ^ -2105201037;
                };
                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var36 = var2x + 2;
                var3x *= var36;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    IllegalStateException var24x = new IllegalStateException();
                    throw var24x;
                }
            }

            RuntimeException var23x = new RuntimeException();
            throw var23x;
        };
        this.iI(I.class, var27);
        wD<T> var28 = this::ee;
        this.iI(T.class, var28);
    }

    private void NE(dZ_2 var1, int var2, boolean var3, int var4) {
        int var7 = System.identityHashCode(this);
        long var8 = var7;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        var8 = var10 & 1L;
        long var134;
        int var76 = (var134 = var8 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
        if (var76 != 0) {
            int var66 = var4 | -2066209686;
            var66 <<= 19;
            var66 -= -659186761;
            var66 ^= -503128459;
        } else {
            label101: {
                int var5 = var4 - 1996848202;
                var5 ^= 379088300;
                var8 = var2;
                var10 = var8 + 1L;
                var10 = var8 * var10;
                long var12 = var8 + 2L;
                var10 *= var12;
                var8 += 3L;
                var10 *= var8;
                var8 = var10 & 7L;
                long var135;
                int var80 = (var135 = var8 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                label89:
                if (var80 == 0) {
                    boolean var81 = this.Be;
                    if (var81) {
                        var5 += -2031506559;
                        var5 ^= 642789601;
                        var8 = var2;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var136;
                        int var85 = (var136 = var8 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                        if (var85 != 0) {
                            break label89;
                        }

                        YH var86 = this.Tq;
                        long var9 = var7;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var137;
                        int var95 = (var137 = var9 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                        if (var95 != 0) {
                            var5 &= -1651136343;
                            var5 += -1671064567;
                            var5 ^= 623521462;
                            break label101;
                        }

                        var5 *= -581805583;
                        var5 ^= 675878879;
                        int var96 = var2 + 1;
                        int var97 = var2 * var96;
                        int var98 = var97 & 1;
                        if (var98 != 0) {
                            break label89;
                        }

                        if (var86 != null) {
                            var5 *= -155460121;
                            var5 ^= 509409213;
                            YH var87 = this.Tq;
                            boolean var88 = var87.XT();
                            var9 = var7;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var138;
                            int var102 = (var138 = var9 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                            if (var102 != 0) {
                                switch (var5) {
                                    case -453305255:
                                        var5 *= -1705763737;
                                        var5 |= 2072397468;
                                        var5 ^= -360452643;
                                        var5 ^= 362098750;
                                        break label101;
                                    case 577340693:
                                        var5 ^= 405833048;
                                        break label101;
                                    case 1555430367:
                                    default:
                                        var5 ^= 135277479;
                                        break label101;
                                }
                            }

                            var5 |= 1710700712;
                            var5 >>>= 9;
                            var5 <<= 28;
                            var5 -= 552345663;
                            var5 ^= -1748583659;
                            Integer var103 = var2;
                            if (var103 == null) {
                                break label89;
                            }

                            if (!var88) {
                                var5 &= 2068051373;
                                var5 *= -2008584809;
                                var5 -= -68447488;
                                var5 ^= 1384511925;
                                if (!var3) {
                                    switch (var5) {
                                        case -913632407:
                                            var5 -= 791591562;
                                            var5 -= 985463294;
                                            var5 -= 1701664482;
                                            var5 += 77025822;
                                            var5 ^= 1501130974;
                                            break;
                                        case -85060622:
                                        default:
                                            var5 ^= 965781728;
                                            break;
                                        case 892923744:
                                            var5 ^= -1847280908;
                                    }

                                    var8 = var2;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var139;
                                    int var92 = (var139 = var8 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                    if (var92 == 0) {
                                        return;
                                    }
                                    break label89;
                                }

                                var5 += 1863580949;
                                var5 += 1144942421;
                                var5 ^= -259332402;
                            } else {
                                var5 -= -1498153488;
                                var5 *= 1510835461;
                                var5 *= 138671055;
                                var5 |= -1670450417;
                                var5 ^= 1371106002;
                            }
                        } else {
                            var5 ^= -1375965542;
                            var5 >>>= 23;
                            var5 ^= -1940416205;
                        }
                    } else {
                        var5 *= -724069815;
                        var5 *= -2061961059;
                        var5 ^= -1289776856;
                    }

                    YH var93 = var1.zV();
                    long var104 = var7;
                    long var127 = var104 + 1L;
                    var127 = var104 * var127;
                    long var133 = var104 + 2L;
                    var127 *= var133;
                    var104 += 3L;
                    var127 *= var104;
                    var104 = var127 & 7L;
                    long var140;
                    var7 = (var140 = var104 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        var5 += -558153324;
                        var5 ^= -236179066;
                        var5 ^= 440291595;
                        break label101;
                    }

                    switch (var5) {
                        case -1940416227:
                            var5 -= 1010626664;
                            var5 *= -1351291767;
                            var5 ^= -58895207;
                            break;
                        case -1789820640:
                        default:
                            var5 ^= -1979361640;
                            break;
                        case 304869456:
                            var5 ^= 1977436967;
                    }

                    long var6 = var2;
                    var104 = var6 + 1L;
                    var104 = var6 * var104;
                    var6 = var104 & 1L;
                    long var141;
                    int var72 = (var141 = var6 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                    if (var72 == 0) {
                        this.Tq = var93;
                        this.Ws = var2;
                        this.Be = var3;
                        return;
                    }
                }

                UnsupportedOperationException var73 = new UnsupportedOperationException();
                throw var73;
            }
        }

        IllegalArgumentException var70 = new IllegalArgumentException();
        throw var70;
    }

    private void ee(T var1) {
        label398: {
            int var105;
            Canvas var268;
            label387: {
                var105 = W;
                var105 ^= 2061391514;
                int var3 = System.identityHashCode(this);
                RenderPhase var4 = var1.phase();
                Integer var5 = var3;
                if (var5 == null) {
                    var105 *= -968525773;
                    var105 >>= 8;
                    var105 += 736174961;
                    var105 ^= -14939310;
                } else {
                    var105 &= -1747319360;
                    var105 ^= 1002487937;
                    int var275 = var105 + 1;
                    var275 = var105 * var275;
                    var275 &= 1;
                    if (var275 != 0) {
                        break label398;
                    }

                    RenderPhase var278 = RenderPhase.UNDERLAY;
                    if (var4 != var278) {
                        var105 ^= -7102663;
                        var105 >>= 15;
                        var105 -= 972392182;
                        var105 |= 191742112;
                        var105 ^= 1512089414;
                        return;
                    }

                    var105 &= 298694468;
                    var105 ^= 1496151137;
                    int var253 = var105 + 1;
                    int var254 = var105 * var253;
                    var275 = var105 + 2;
                    int var255 = var254 * var275;
                    var275 = var105 + 3;
                    int var256 = var255 * var275;
                    int var257 = var256 & 7;
                    if (var257 != 0) {
                        break label398;
                    }

                    YH var258 = this.Tq;
                    Integer var281 = var3;
                    if (var281 != null) {
                        var105 ^= 1667532538;
                        var105 -= -2061533158;
                        var105 ^= 1847241791;
                        var281 = var105;
                        if (var281 == null) {
                            break label398;
                        }

                        if (var258 == null) {
                            var105 += -1674983018;
                            var105 *= -1943237145;
                            var105 <<= 16;
                            var105 ^= 1736670886;
                            return;
                        }

                        var105 <<= 7;
                        var105 >>= 23;
                        var105 &= 1256528247;
                        var105 ^= 799988384;
                        Integer var259 = var105;
                        if (var259 == null) {
                            break label398;
                        }

                        FrameContext var260 = var1.frame();
                        boolean var261 = var260.hideGui();
                        var281 = var3;
                        if (var281 != null) {
                            var105 *= -451428555;
                            var105 -= -2050513735;
                            var105 ^= 628596357;
                            long var284 = var105;
                            long var7 = var284 + 1L;
                            var7 = var284 * var7;
                            long var9 = var284 + 2L;
                            var7 *= var9;
                            long var285 = var284 + 3L;
                            var7 *= var285;
                            long var286 = var7 & 7L;
                            long var524;
                            int var287 = (var524 = var286 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                            if (var287 != 0) {
                                break label398;
                            }

                            if (var261) {
                                var105 -= 252825132;
                                var105 += 964789896;
                                var105 ^= -1786974167;
                                return;
                            }

                            var105 >>>= 2;
                            var105 &= 938590190;
                            var105 ^= -582310029;
                            FrameContext var262 = var1.frame();
                            var287 = var3 + 1;
                            var287 = var3 * var287;
                            int var6 = var3 + 2;
                            var287 *= var6;
                            var6 = var3 + 3;
                            var287 *= var6;
                            var287 &= 7;
                            if (var287 != 0) {
                                var105 >>>= 31;
                                var105 |= 1921079086;
                                var105 ^= -1503679681;
                            } else {
                                var105 = switch (var105) {
                                    default -> var105 ^ -237272655;
                                    case -398847233 -> {
                                        var105 += -1354982666;
                                        yield var105 ^ -154340115;
                                    }
                                    case 1712568639 -> var105 ^ 2033615367;
                                };
                                Integer var293 = var105;
                                if (var293 == null) {
                                    break label398;
                                }

                                boolean var263 = var262.screenOpen();
                                if (var263) {
                                    var105 &= 1986390702;
                                    var105 &= 380294768;
                                    var105 |= -555592573;
                                    var105 *= 15446219;
                                    var105 ^= 2124115271;
                                    return;
                                }

                                var105 += -298363396;
                                var105 ^= 1580341359;
                                var105 |= 1096997601;
                                var105 ^= 1469680888;
                                YH var264 = this.Tq;
                                FrameContext var294 = var1.frame();
                                float var295 = var294.dt();
                                long var304 = var3;
                                long var8 = var304 + 1L;
                                var8 = var304 * var8;
                                long var10 = var304 + 2L;
                                var8 *= var10;
                                long var305 = var304 + 3L;
                                var8 *= var305;
                                long var306 = var8 & 7L;
                                long var525;
                                var6 = (var525 = var306 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    switch (var105) {
                                        case -1701312421:
                                        default:
                                            var105 ^= -1540289904;
                                            break;
                                        case -417421571:
                                            var105 ^= -1851550366;
                                            break;
                                        case 108688131:
                                            var105 &= 1380691360;
                                            var105 -= 775158696;
                                            var105 &= -2138383365;
                                            var105 -= -1115749761;
                                            var105 ^= 375128777;
                                    }
                                } else {
                                    var105 = switch (var105) {
                                        default -> var105 ^ 1577424483;
                                        case 108688131 -> {
                                            var105 -= 1063724753;
                                            var105 &= 1614553598;
                                            var105 <<= 18;
                                            yield var105 ^ -1287169124;
                                        }
                                        case 655409648 -> var105 ^ 972943017;
                                    };
                                    var264.s(var295);
                                    YH var265 = this.Tq;
                                    boolean var266 = var265.XT();
                                    if (var266) {
                                        var105 |= 482143485;
                                        var105 >>= 22;
                                        var105 += 1010505233;
                                        var105 -= -1419828688;
                                        var105 ^= -1243306666;
                                        int var269 = var105 + 1;
                                        int var270 = var105 * var269;
                                        int var271 = var270 & 1;
                                        if (var271 != 0) {
                                            break label398;
                                        }

                                        this.Tq = null;
                                        int var272 = var3 + 1;
                                        int var273 = var3 * var272;
                                        int var274 = var273 & 1;
                                        if (var274 == 0) {
                                            var105 ^= -1247570948;
                                            var105 ^= -352790432;
                                            this.Be = false;
                                            return;
                                        }

                                        switch (var105) {
                                            case -1014904729:
                                                var105 ^= -351218990;
                                                break;
                                            case -928139784:
                                            default:
                                                var105 ^= 2086615951;
                                                break;
                                            case 624908169:
                                                var105 |= 848851799;
                                                var105 += -525692600;
                                                var105 ^= -860555977;
                                        }
                                    } else {
                                        var105 &= -1798202194;
                                        var105 <<= 7;
                                        var105 |= -1133070476;
                                        var105 ^= 1223351689;
                                        var268 = var1.canvas();
                                        var268 = var268;
                                        float var296 = var268.width();
                                        float var297 = var296 * 0.5F;
                                        float var298 = var297;
                                        float var308 = var268.height();
                                        float var309 = var308 * 0.5F;
                                        float var310 = var309;
                                        YH var314 = this.Tq;
                                        var8 = var3;
                                        var10 = var8 + 1L;
                                        var10 = var8 * var10;
                                        long var12 = var8 + 2L;
                                        var10 *= var12;
                                        var8 += 3L;
                                        var10 *= var8;
                                        var8 = var10 & 7L;
                                        long var526;
                                        int var331 = (var526 = var8 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                        if (var331 == 0) {
                                            var105 >>= 11;
                                            var105 ^= -253844486;
                                            var105 *= 813642179;
                                            var105 ^= -452745801;
                                            var105 ^= 1254730341;
                                            float var315 = var314.JZ("scale");
                                            YH var332 = this.Tq;
                                            float var333 = var332.JZ("gap");
                                            float var334 = var333;
                                            YH var335 = this.Tq;
                                            float var336 = var335.JZ("alpha");
                                            float var337 = TP.S(var336);
                                            Uq var344 = this.n;
                                            float var345 = var344.WM();
                                            boolean var11 = this.Be;
                                            float var348;
                                            if (var11) {
                                                var105 = switch (var105) {
                                                    default -> var105 ^ -822163228;
                                                    case 137485679 -> {
                                                        var105 >>= 15;
                                                        var105 += 325064973;
                                                        var105 ^= 177462935;
                                                        yield var105 ^ -93352485;
                                                    }
                                                    case 217909031 -> var105 ^ -151906017;
                                                };
                                                var348 = 1.25F;
                                                var105 -= 44329263;
                                                var105 += -1304464362;
                                                var105 >>>= 9;
                                                var105 |= -768291751;
                                                var105 ^= -826478714;
                                            } else {
                                                var105 -= -1758996520;
                                                var105 &= 1619818089;
                                                var105 &= 1100910899;
                                                var105 &= 808894636;
                                                var105 ^= -1980704634;
                                                Integer var353 = var105;
                                                if (var353 == null) {
                                                    break label398;
                                                }

                                                var348 = 1.0F;
                                                var105 += 522228243;
                                                var105 -= -1601377798;
                                                var105 ^= 340111554;
                                            }

                                            var12 = var105;
                                            long var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            long var16 = var12 + 2L;
                                            var14 *= var16;
                                            var12 += 3L;
                                            var14 *= var12;
                                            var12 = var14 & 7L;
                                            long var527;
                                            int var357 = (var527 = var12 - 0L) == 0L ? 0 : (var527 < 0L ? -1 : 1);
                                            if (var357 != 0) {
                                                break label398;
                                            }

                                            float var346 = var345 * var348;
                                            float var347 = var346;
                                            Uq var349 = this.aW;
                                            float var350 = var349.WM();
                                            boolean var358 = this.Be;
                                            long var13 = var3;
                                            long var15 = var13 + 1L;
                                            var15 = var13 * var15;
                                            var13 = var15 & 1L;
                                            long var528;
                                            int var401 = (var528 = var13 - 0L) == 0L ? 0 : (var528 < 0L ? -1 : 1);
                                            if (var401 != 0) {
                                                var105 ^= -350941897;
                                                var105 ^= 587907450;
                                            } else {
                                                var105 >>>= 1;
                                                var105 ^= -250777487;
                                                int var402 = var105 + 1;
                                                int var403 = var105 * var402;
                                                int var442 = var105 + 2;
                                                int var404 = var403 * var442;
                                                int var443 = var105 + 3;
                                                int var405 = var404 * var443;
                                                int var406 = var405 & 7;
                                                if (var406 != 0) {
                                                    break label398;
                                                }

                                                float var360;
                                                if (var358) {
                                                    var105 += 1968010381;
                                                    var105 |= 1031658096;
                                                    var105 -= 262623166;
                                                    var105 ^= 1215078444;
                                                    var105 ^= -73983665;
                                                    Integer var359 = var105;
                                                    if (var359 == null) {
                                                        break label398;
                                                    }

                                                    var360 = 1.4F;
                                                    var105 ^= 1678824690;
                                                    var105 |= 2069454514;
                                                    var105 ^= 231681917;
                                                } else {
                                                    var105 >>>= 31;
                                                    var105 ^= 1645003730;
                                                    var360 = 1.0F;
                                                    var105 &= 1743263277;
                                                    var105 <<= 7;
                                                    var105 >>= 30;
                                                    var105 *= -1446453765;
                                                    var105 ^= -164310590;
                                                }

                                                float var351 = var350 * var360;
                                                float var352 = var351;
                                                int var361 = var3 + 1;
                                                int var362 = var3 * var361;
                                                int var407 = var3 + 2;
                                                int var363 = var362 * var407;
                                                int var408 = var3 + 3;
                                                int var364 = var363 * var408;
                                                int var365 = var364 & 7;
                                                label340:
                                                if (var365 == 0) {
                                                    var105 *= -833216751;
                                                    var105 ^= -2141568844;
                                                    var105 ^= -817662958;
                                                    int var366 = this.Ws;
                                                    int var338 = DP.nq(var366, var337);
                                                    int var339 = var338;
                                                    var268.save();
                                                    var268.scale(var315, var297, var309);
                                                    r_2 var316 = this.y;
                                                    Enum var317 = var316.A();
                                                    Xo var318 = (Xo)var317;
                                                    int var319 = var318.ordinal();
                                                    switch (var319) {
                                                        case 0:
                                                            var105 &= -413394;
                                                            var105 |= 909828970;
                                                            var105 ^= 353913586;
                                                            break;
                                                        case 1:
                                                            var105 ^= 17402657;
                                                            var105 <<= 9;
                                                            var105 ^= -660703992;
                                                            var105 ^= -82508140;
                                                            break;
                                                        case 2:
                                                            var105 <<= 27;
                                                            var105 *= -1034715323;
                                                            var105 |= -1464412329;
                                                            var105 ^= -155688131;
                                                            var12 = var105;
                                                            var14 = var12 + 1L;
                                                            var14 = var12 * var14;
                                                            var16 = var12 + 2L;
                                                            var14 *= var16;
                                                            var12 += 3L;
                                                            var14 *= var12;
                                                            var12 = var14 & 7L;
                                                            long var529;
                                                            int var320 = (var529 = var12 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
                                                            if (var320 != 0) {
                                                                break label398;
                                                            }

                                                            float var321 = var346 * 0.8F;
                                                            var12 = var3;
                                                            var14 = var12 + 1L;
                                                            var14 = var12 * var14;
                                                            var16 = var12 + 2L;
                                                            var14 *= var16;
                                                            var12 += 3L;
                                                            var14 *= var12;
                                                            var12 = var14 & 7L;
                                                            long var530;
                                                            int var373 = (var530 = var12 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                                                            if (var373 != 0) {
                                                                var105 -= 643838885;
                                                                var105 ^= -479167275;
                                                            } else {
                                                                var105 += -1714088064;
                                                                var105 &= 760254832;
                                                                var105 ^= -1904974409;
                                                                var12 = var105;
                                                                var14 = var12 + 1L;
                                                                var14 = var12 * var14;
                                                                var12 = var14 & 1L;
                                                                long var531;
                                                                int var376 = (var531 = var12 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                                                                if (var376 != 0) {
                                                                    break label398;
                                                                }

                                                                float var322 = var333 + var321;
                                                                JL var377 = this.iO;
                                                                boolean var378 = var377.vb();
                                                                if (var378) {
                                                                    var105 -= 2136293406;
                                                                    var105 ^= -1474158126;
                                                                    Integer var379 = var105;
                                                                    if (var379 == null) {
                                                                        break label398;
                                                                    }

                                                                    float var380 = var351 * 3.0F;
                                                                    int var409 = DP.nq(var338, 0.35F);
                                                                    Integer var454 = var3;
                                                                    if (var454 == null) {
                                                                        var105 *= 1994165459;
                                                                        var105 ^= -1735354849;
                                                                        var105 += 1728831105;
                                                                        var105 ^= -2088421441;
                                                                        break label340;
                                                                    }

                                                                    var105 -= -1358362650;
                                                                    var105 <<= 2;
                                                                    var105 *= 1743089383;
                                                                    var105 &= -177104482;
                                                                    var105 ^= 489066023;
                                                                    Integer var455 = var105;
                                                                    if (var455 == null) {
                                                                        break label398;
                                                                    }

                                                                    Paint var410 = Paint.solid(var409);
                                                                    Paint var411 = var410.soft(3.0F);
                                                                    var268.arc(var297, var309, var322, var380, 0.0F, (float) (Math.PI * 2), var411);
                                                                    var105 &= -611707649;
                                                                    var105 += -2133822274;
                                                                    var105 &= 1111545173;
                                                                    var105 ^= 814338262;
                                                                } else {
                                                                    switch (var105) {
                                                                        case -2091573972:
                                                                            var105 ^= -276706541;
                                                                            break;
                                                                        case -1422596905:
                                                                            var105 >>>= 27;
                                                                            var105 += -600216008;
                                                                            var105 |= 983540504;
                                                                            var105 &= 1354707616;
                                                                            var105 ^= 1618387607;
                                                                            break;
                                                                        case 1121265976:
                                                                        default:
                                                                            var105 ^= 1693407228;
                                                                    }
                                                                }

                                                                Integer var381 = var105;
                                                                if (var381 == null) {
                                                                    break label398;
                                                                }

                                                                Paint var382 = Paint.solid(var338);
                                                                var13 = var3;
                                                                var15 = var13 + 1L;
                                                                var15 = var13 * var15;
                                                                long var17 = var13 + 2L;
                                                                var15 *= var17;
                                                                var13 += 3L;
                                                                var15 *= var13;
                                                                var13 = var15 & 7L;
                                                                long var532;
                                                                int var415 = (var532 = var13 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                                                if (var415 == 0) {
                                                                    var105 |= -524170102;
                                                                    var105 ^= -51633606;
                                                                    var268.arc(var297, var309, var322, var351, 0.0F, (float) (Math.PI * 2), var382);
                                                                    var105 |= 2091776398;
                                                                    var105 &= 1712584646;
                                                                    var105 *= 838061999;
                                                                    var105 ^= 855674247;
                                                                    break label387;
                                                                }

                                                                var105 *= 331844083;
                                                                var105 += 2139900415;
                                                                var105 <<= 27;
                                                                var105 |= -2147447469;
                                                                var105 ^= 1960735043;
                                                            }
                                                            break label340;
                                                        default:
                                                            var105 |= -753596929;
                                                            var105 ^= 1655856354;
                                                            break label387;
                                                    }

                                                    int var383 = var105 + 1;
                                                    int var384 = var105 * var383;
                                                    int var385 = var384 & 1;
                                                    if (var385 != 0) {
                                                        break label398;
                                                    }

                                                    r_2 var386 = this.y;
                                                    Integer var416 = var3;
                                                    if (var416 != null) {
                                                        var105 &= -548720764;
                                                        var105 ^= 212378697;
                                                        var105 -= 871776213;
                                                        var105 ^= 1722718179;
                                                        Integer var417 = var105;
                                                        if (var417 == null) {
                                                            break label398;
                                                        }

                                                        Xo var418 = Xo.CROSS;
                                                        boolean var387 = var386.TJ(var418);
                                                        float var391;
                                                        if (var387) {
                                                            var105 += -1281449542;
                                                            var105 &= 666601572;
                                                            var105 ^= 431741378;
                                                            var12 = var105;
                                                            var14 = var12 + 1L;
                                                            var14 = var12 * var14;
                                                            var12 = var14 & 1L;
                                                            long var533;
                                                            int var390 = (var533 = var12 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                                                            if (var390 != 0) {
                                                                break label398;
                                                            }

                                                            var391 = 0.0F;
                                                            var105 &= -597733609;
                                                            var105 ^= -1876133118;
                                                        } else {
                                                            var105 *= -1396071891;
                                                            var105 &= -1579153949;
                                                            var105 ^= -378381731;
                                                            Integer var419 = var105;
                                                            if (var419 == null) {
                                                                break label398;
                                                            }

                                                            var391 = (float) (Math.PI / 4);
                                                            switch (var105) {
                                                                case -1502084303:
                                                                default:
                                                                    var105 ^= -1716335172;
                                                                    break;
                                                                case -337092933:
                                                                    var105 ^= -582998650;
                                                                    break;
                                                                case 1232232190:
                                                                    var105 ^= -1855941831;
                                                                    var105 &= 1699310542;
                                                                    var105 >>= 8;
                                                                    var105 ^= -1938998707;
                                                            }
                                                        }

                                                        Integer var420 = var105;
                                                        if (var420 == null) {
                                                            break label398;
                                                        }

                                                        float var323 = var391;
                                                        int var392 = var3 + 1;
                                                        int var393 = var3 * var392;
                                                        int var421 = var3 + 2;
                                                        int var394 = var393 * var421;
                                                        int var422 = var3 + 3;
                                                        int var395 = var394 * var422;
                                                        int var396 = var395 & 7;
                                                        if (var396 == 0) {
                                                            var105 -= 124149221;
                                                            var105 |= -1656176669;
                                                            var105 ^= -1680443902;
                                                            Integer var397 = var105;
                                                            if (var397 == null) {
                                                                break label398;
                                                            }

                                                            byte var398 = 0;
                                                            int var399 = var398;

                                                            var105 = switch (var105) {
                                                                case 102271485 -> {
                                                                    var105 -= -1306392475;
                                                                    var105 -= -177527218;
                                                                    var105 &= 1660935918;
                                                                    var105 += -683538081;
                                                                    yield var105 ^ -1696232807;
                                                                }
                                                                default -> var105 ^ 1898031188;
                                                                case 1002433908 -> var105 ^ -302410835;
                                                            };

                                                            while (true) {
                                                                var13 = var105;
                                                                var15 = var13 + 1L;
                                                                var15 = var13 * var15;
                                                                long var492 = var13 + 2L;
                                                                var15 *= var492;
                                                                var13 += 3L;
                                                                var15 *= var13;
                                                                var13 = var15 & 7L;
                                                                long var534;
                                                                int var426 = (var534 = var13 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                                                if (var426 != 0) {
                                                                    break label398;
                                                                }

                                                                if (var399 >= 4) {
                                                                    var105 -= -821885807;
                                                                    var105 &= -239452933;
                                                                    var105 -= 1745455210;
                                                                    var105 += -958534821;
                                                                    var105 ^= -1285847919;
                                                                    break label387;
                                                                }

                                                                var105 >>>= 9;
                                                                var105 &= 1374933020;
                                                                var105 ^= 1255586916;
                                                                var13 = var105;
                                                                var15 = var13 + 1L;
                                                                var15 = var13 * var15;
                                                                var492 = var13 + 2L;
                                                                var15 *= var492;
                                                                var13 += 3L;
                                                                var15 *= var13;
                                                                var13 = var15 & 7L;
                                                                long var535;
                                                                int var430 = (var535 = var13 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                                                                if (var430 != 0) {
                                                                    break label398;
                                                                }

                                                                float var431 = var399;
                                                                float var432 = var431 * (float) Math.PI;
                                                                float var433 = var432 / 2.0F;
                                                                float var434 = var323 + var433;
                                                                double var458 = var434;
                                                                double var459 = Math.cos(var458);
                                                                float var460 = (float)var459;
                                                                double var482 = var434;
                                                                double var483 = Math.sin(var482);
                                                                float var435 = (float)var483;
                                                                float var484 = var460 * var334;
                                                                float var485 = var298 + var484;
                                                                float var490 = var435 * var334;
                                                                float var491 = var310 + var490;
                                                                float var494 = var334 + var347;
                                                                float var461 = var460 * var494;
                                                                float var462 = var298 + var461;
                                                                int var495 = var3 + 1;
                                                                int var496 = var3 * var495;
                                                                int var497 = var496 & 1;
                                                                if (var497 != 0) {
                                                                    var105 |= -667175623;
                                                                    var105 &= -1540676301;
                                                                    var105 ^= 1425398049;
                                                                    break;
                                                                }

                                                                var105 &= 577817488;
                                                                var105 -= 305712106;
                                                                var105 ^= -753629152;
                                                                Integer var498 = var105;
                                                                if (var498 == null) {
                                                                    break label398;
                                                                }

                                                                float var499 = var334 + var347;
                                                                float var436 = var435 * var499;
                                                                float var437 = var310 + var436;
                                                                JL var500 = this.iO;
                                                                boolean var501 = var500.vb();
                                                                if (var501) {
                                                                    var105 ^= -1362756574;
                                                                    var105 *= -383450181;
                                                                    var105 |= 573285442;
                                                                    var105 ^= -256726741;
                                                                    var492 = var105;
                                                                    long var19 = var492 + 1L;
                                                                    var19 = var492 * var19;
                                                                    long var21 = var492 + 2L;
                                                                    var19 *= var21;
                                                                    var492 += 3L;
                                                                    var19 *= var492;
                                                                    var492 = var19 & 7L;
                                                                    long var536;
                                                                    int var505 = (var536 = var492 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                                                                    if (var505 != 0) {
                                                                        break label398;
                                                                    }

                                                                    float var506 = var352 * 2.8F;
                                                                    int var18 = DP.nq(var339, 0.35F);
                                                                    Paint var511 = Paint.solid(var18);
                                                                    int var516 = var3 + 1;
                                                                    int var517 = var3 * var516;
                                                                    int var518 = var517 & 1;
                                                                    if (var518 != 0) {
                                                                        var105 ^= 1116947575;
                                                                        var105 ^= -2007716094;
                                                                        break;
                                                                    }

                                                                    var105 |= -1545150330;
                                                                    var105 |= -840636357;
                                                                    var105 ^= 825233026;
                                                                    var19 = var105;
                                                                    var21 = var19 + 1L;
                                                                    var21 = var19 * var21;
                                                                    var19 = var21 & 1L;
                                                                    long var537;
                                                                    int var521 = (var537 = var19 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                                                                    if (var521 != 0) {
                                                                        break label398;
                                                                    }

                                                                    Paint var512 = var511.soft(2.5F);
                                                                    var268.line(var485, var491, var462, var437, var506, var512);
                                                                    var105 &= -2054884115;
                                                                    var105 ^= -315296686;
                                                                } else {
                                                                    switch (var105) {
                                                                        case -1127088530:
                                                                        default:
                                                                            var105 ^= 1575209701;
                                                                            break;
                                                                        case 1019458566:
                                                                            var105 -= 337627645;
                                                                            var105 -= -2123181039;
                                                                            var105 *= -679577481;
                                                                            var105 |= 1632412679;
                                                                            var105 ^= -1696730512;
                                                                            break;
                                                                        case 1798255184:
                                                                            var105 ^= -703744634;
                                                                    }
                                                                }

                                                                int var507 = var105 + 1;
                                                                int var508 = var105 * var507;
                                                                int var509 = var508 & 1;
                                                                if (var509 != 0) {
                                                                    break label398;
                                                                }

                                                                Paint var510 = Paint.solid(var339);
                                                                var268.line(var485, var491, var462, var437, var352, var510);
                                                                int var438 = var399 + 1;
                                                                int var463 = var3 + 1;
                                                                int var464 = var3 * var463;
                                                                int var486 = var3 + 2;
                                                                int var465 = var464 * var486;
                                                                int var487 = var3 + 3;
                                                                int var466 = var465 * var487;
                                                                int var467 = var466 & 7;
                                                                if (var467 != 0) {
                                                                    var105 ^= -365370434;
                                                                    var105 -= -1236102816;
                                                                    var105 <<= 4;
                                                                    var105 ^= 129736192;
                                                                    break;
                                                                }

                                                                var105 &= -837486992;
                                                                var105 *= 232544743;
                                                                var105 ^= 153461739;
                                                                Integer var468 = var105;
                                                                if (var468 == null) {
                                                                    break label398;
                                                                }

                                                                var399 = var438;
                                                                var105 &= 1971331234;
                                                                var105 &= 1442761673;
                                                                var105 ^= -2094470736;
                                                            }
                                                        } else {
                                                            var105 += -679391827;
                                                            var105 *= -2058784147;
                                                            var105 ^= 82535501;
                                                        }
                                                    } else {
                                                        var105 &= -807169060;
                                                        var105 &= -750712356;
                                                        var105 *= -70557327;
                                                        var105 += -1978191380;
                                                        var105 ^= -603455528;
                                                    }
                                                } else {
                                                    var105 |= 2066053000;
                                                    var105 ^= 502495503;
                                                    var105 ^= 907571925;
                                                }
                                            }
                                        } else {
                                            var105 &= -1754066547;
                                            var105 &= -222486420;
                                            var105 >>= 4;
                                            var105 &= -264334653;
                                            var105 ^= 618593296;
                                        }
                                    }
                                }
                            }
                        } else {
                            var105 &= -518621115;
                            var105 ^= -170351599;
                        }
                    } else {
                        var105 += -1490617863;
                        var105 ^= 722605898;
                    }
                }

                long var247 = var105;
                long var299 = var247 + 1L;
                long var300 = var247 * var299;
                long var324 = var247 + 2L;
                long var301 = var300 * var324;
                long var248 = var247 + 3L;
                long var302 = var301 * var248;
                long var249 = var302 & 7L;
                long var538;
                var3 = (var538 = var249 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                if (var3 == 0) {
                    AssertionError var252 = new AssertionError();
                    throw var252;
                }
                break label398;
            }

            Integer var246 = var105;
            if (var246 != null) {
                var268.restore();
                return;
            }
        }

        IllegalArgumentException var251 = new IllegalArgumentException();
        throw var251;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 931692743;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        W = var4;
        ik var5 = dZ_2.a();
        GQ var15 = LH.ve();
        GQ var16 = var15.E(0.0F, 0.9F);
        Lv var45 = sT_2.aO;
        GQ var17 = var16.cr(0.06F, 1.08F, var45);
        Lv var46 = sT_2.Jj;
        GQ var18 = var17.cr(0.18F, 1.0F, var46);
        LH var19 = var18.z();
        ik var6 = var5.LQ("scale", var19);
        GQ var20 = LH.ve();
        GQ var21 = var20.E(0.0F, 2.0F);
        Lv var47 = sT_2.aO;
        GQ var22 = var21.cr(0.08F, 4.5F, var47);
        Lv var48 = sT_2.Jj;
        GQ var23 = var22.cr(0.3F, 3.5F, var48);
        LH var24 = var23.z();
        ik var7 = var6.LQ("gap", var24);
        GQ var25 = LH.ve();
        GQ var26 = var25.E(0.0F, 1.0F);
        GQ var27 = var26.E(0.22F, 1.0F);
        Lv var49 = sT_2.H;
        GQ var28 = var27.cr(0.42F, 0.0F, var49);
        LH var29 = var28.z();
        ik var8 = var7.LQ("alpha", var29);
        dZ_2 var9 = var8.z();
        V = var9;
        ik var10 = dZ_2.a();
        GQ var30 = LH.ve();
        GQ var31 = var30.E(0.0F, 0.9F);
        Lv var50 = sT_2.aO;
        GQ var32 = var31.cr(0.08F, 1.12F, var50);
        Lv var51 = sT_2.Jj;
        GQ var33 = var32.cr(0.25F, 1.0F, var51);
        LH var34 = var33.z();
        ik var11 = var10.LQ("scale", var34);
        GQ var35 = LH.ve();
        GQ var36 = var35.E(0.0F, 1.0F);
        Lv var52 = sT_2.aO;
        GQ var37 = var36.cr(0.12F, 5.0F, var52);
        GQ var38 = var37.E(0.5F, 4.0F);
        LH var39 = var38.z();
        ik var12 = var11.LQ("gap", var39);
        GQ var40 = LH.ve();
        GQ var41 = var40.E(0.0F, 1.0F);
        GQ var42 = var41.E(0.55F, 1.0F);
        Lv var53 = sT_2.H;
        GQ var43 = var42.cr(0.85F, 0.0F, var53);
        LH var44 = var43.z();
        ik var13 = var12.LQ("alpha", var44);
        dZ_2 var14 = var13.z();
        iX = var14;
    }
}
