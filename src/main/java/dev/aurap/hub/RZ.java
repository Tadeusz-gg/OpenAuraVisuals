package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.random.RandomGenerator;

public final class RZ implements nM {
    public static final SpriteShape[] AP;
    private static final SpriteShape[] p;
    private final r_2 hv;
    private final JL q;
    private final JL Z;
    private final JL lf;
    private final JL l;
    private final JL L;
    private final JL li;
    private final JL EX;
    private final JL S;
    private SpriteShape[] f;
    public static final int Q;

    public RZ() {
        this(Ru.MIXED);
    }

    public RZ(Ru var1) {
        r_2 var2 = new r_2("shape", "Shape", var1);
        this.hv = var2;
        JL var5 = this.T("with_stars", "Stars", true, 1303866027);
        this.q = var5;
        JL var6 = this.T("with_hearts", "Hearts", true, 1303866027);
        this.Z = var6;
        JL var7 = this.T("with_bloom", "Bloom", false, 1303866027);
        this.lf = var7;
        JL var8 = this.T("with_snowflakes", "Snowflakes", false, 1303866027);
        this.l = var8;
        JL var9 = this.T("with_dollars", "Dollars", false, 1303866027);
        this.L = var9;
        JL var10 = this.T("with_crowns", "Crowns", false, 1303866027);
        this.li = var10;
        JL var11 = this.T("with_fireflies", "Fireflies", false, 1303866027);
        this.EX = var11;
        JL var12 = this.T("with_glyphs", "Glyphs", false, 1303866027);
        this.S = var12;
        List var13 = this.o();
        Iterator var14 = var13.iterator();
        Iterator var15 = var14;

        while (true) {
            boolean var3 = var15.hasNext();
            if (!var3) {
                return;
            }

            Object var16 = var15.next();
            xB var17 = (xB)var16;
            Runnable var4 = () -> {
                int var1x = Q;
                var1x ^= -564377345;
                int var2x = System.identityHashCode(this);
                int var3x = var2x + 1;
                var3x = var2x * var3x;
                int var4x = var2x + 2;
                var3x *= var4x;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    Integer var16x = switch (var1x) {
                        case 919932107 -> {
                            var1x >>>= 10;
                            var1x ^= -169062399;
                            yield var1x ^ 236059733;
                        }
                        default -> var1x ^ 1888650831;
                        case 2112505612 -> var1x ^ -1661616256;
                    };
                    if (var16x != null) {
                        this.f = null;
                    } else {
                        IllegalStateException var17x = new IllegalStateException();
                        throw var17x;
                    }
                } else {
                    switch (var1x) {
                        case -1295445824:
                        default:
                            var1x ^= -1293963717;
                            break;
                        case 136499579:
                            var1x ^= -1806901044;
                            break;
                        case 919932107:
                            var1x *= -519527737;
                            var1x ^= 2117198607;
                    }

                    AssertionError var10x = new AssertionError();
                    throw var10x;
                }
            };
            var17.k(var4);
        }
    }

    private JL T(String var1, String var2, boolean var3, int var4) {
        int var6 = System.identityHashCode(this);
        JL var7 = new JL(var1, var2, var3);
        BooleanSupplier var8 = () -> {
            int var1x = Q;
            var1x ^= -2102361038;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.hv;
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            var2x = var4x & 1;
            if (var2x == 0) {
                var1x = switch (var1x) {
                    case -487266903 -> var1x ^ 1677579726;
                    default -> var1x ^ 2110862891;
                    case 1782169606 -> {
                        var1x &= -771507743;
                        yield var1x ^ -776645420;
                    }
                };
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var4x = var1x + 2;
                var2x *= var4x;
                var4x = var1x + 3;
                var2x *= var4x;
                var2x &= 7;
                if (var2x == 0) {
                    Ru var21 = Ru.CUSTOM;
                    return var3x.TJ(var21);
                }
            } else {
                var1x += 205531537;
                var1x *= -1815345727;
                var1x ^= -551892924;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                int var26 = var1x + 2;
                var2x *= var26;
                var1x += 3;
                var2x *= var1x;
                var1x = var2x & 7;
                if (var1x == 0) {
                    AssertionError var14x = new AssertionError();
                    throw var14x;
                }
            }

            UnsupportedOperationException var13x = new UnsupportedOperationException();
            throw var13x;
        };
        int var9 = var6 + 1;
        var9 = var6 * var9;
        var6 = var9 & 1;
        if (var6 == 0) {
            int var14 = var4 >> 25;
            var14 ^= -1508243516;
            xB var17 = var7.Pt(var8);
            return (JL)var17;
        } else {
            int var5 = var4 * -1415365173;
            var5 *= -1083590959;
            var5 &= -1463839697;
            var5 ^= -428494750;
            IllegalStateException var13 = new IllegalStateException();
            throw var13;
        }
    }

    @Override
    public List o() {
        int var1 = Q;
        var1 ^= 2075824730;
        int var2 = System.identityHashCode(this);
        r_2 var3 = this.hv;
        JL var4 = this.q;
        Integer var25 = var2;
        if (var25 == null) {
            var1 += 876935782;
            var1 ^= -1726413501;
            var1 |= 635711762;
            var1 ^= -1164695085;
            var25 = var1;
            if (var25 != null) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            }
        } else {
            var1 |= -890677060;
            var1 += 820259296;
            var1 += 2084818121;
            var1 ^= -2111630975;
            long var19 = var1;
            long var5 = var19 + 1L;
            var5 = var19 * var5;
            long var7 = var19 + 2L;
            var5 *= var7;
            long var20 = var19 + 3L;
            var5 *= var20;
            long var21 = var5 & 7L;
            long var34;
            var1 = (var34 = var21 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                JL var24 = this.Z;
                JL var28 = this.lf;
                JL var32 = this.l;
                JL var6 = this.L;
                JL var33 = this.li;
                JL var8 = this.EX;
                JL var9 = this.S;
                return List.of(var3, var4, var24, var28, var32, var6, var33, var8, var9);
            }
        }

        RuntimeException var23 = new RuntimeException();
        throw var23;
    }

    public SpriteShape xZ(RandomGenerator var1) {
        int var2 = Q;
        var2 ^= 1406634944;
        int var3 = System.identityHashCode(this);
        SpriteShape[] var4 = this.f;
        Integer var5 = var3;
        int var6 = of_2.l;
        var2 ^= var6;
        var2 ^= 1720137465;
        of_2.l = 1720137465;
        var6 = of_2.Ab;
        var2 ^= var6;
        var2 ^= -589993299;
        of_2.Ab = -589993299;
        if (var5 == null) {
            var2 ^= 808080117;
            var2 >>>= 16;
            var2 ^= 1515955936;
        } else {
            label119: {
                var2 -= 225946655;
                var2 -= 2135958832;
                var2 ^= -481562400;
                long var94 = var2;
                long var7 = var94 + 1L;
                var7 = var94 * var7;
                long var9 = var94 + 2L;
                var7 *= var9;
                long var95 = var94 + 3L;
                var7 *= var95;
                long var96 = var7 & 7L;
                long var160;
                int var97 = (var160 = var96 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                label104:
                if (var97 == 0) {
                    SpriteShape[] var105;
                    if (var4 == null) {
                        var2 += 612913457;
                        var2 -= 1092381841;
                        var2 ^= 1975616881;
                        var2 |= -1320199891;
                        var2 ^= 1888488715;
                        long var98 = var2;
                        var7 = var98 + 1L;
                        var7 = var98 * var7;
                        var9 = var98 + 2L;
                        var7 *= var9;
                        long var99 = var98 + 3L;
                        var7 *= var99;
                        long var100 = var7 & 7L;
                        long var161;
                        var97 = (var161 = var100 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                        if (var97 != 0) {
                            break label104;
                        }

                        var97 = var2 - -551956854;
                        var97 ^= -1528967318;
                        SpriteShape[] var104 = this.nD(var97);
                        Integer var138 = var3;
                        if (var138 == null) {
                            var2 |= 273863608;
                            var2 -= 1012444649;
                            var2 -= 1248514222;
                            var2 += 1302893864;
                            var2 ^= 102639579;
                            break label119;
                        }

                        var2 -= 1719026474;
                        var2 ^= -1796442267;
                        var2 >>= 20;
                        var2 += -2007118851;
                        var2 ^= 1353922483;
                        int var139 = var2 + 1;
                        int var140 = var2 * var139;
                        int var141 = var140 & 1;
                        if (var141 != 0) {
                            break label104;
                        }

                        this.f = var104;
                        var105 = var104;
                        var2 -= 1999044502;
                        var2 |= -1576877635;
                        var2 |= 403422406;
                        var2 ^= 155773232;
                    } else {
                        var2 -= -1881170355;
                        var2 ^= -1022231778;
                        var2 ^= 113551347;
                        long var109 = var2;
                        long var8 = var109 + 1L;
                        var8 = var109 * var8;
                        long var110 = var8 & 1L;
                        long var162;
                        var6 = (var162 = var110 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label104;
                        }

                        var105 = var4;
                        var2 *= 1005200537;
                        var2 ^= -1914671806;
                    }

                    long var112 = var2;
                    long var151 = var112 + 1L;
                    var151 = var112 * var151;
                    long var10 = var112 + 2L;
                    var151 *= var10;
                    long var113 = var112 + 3L;
                    var151 *= var113;
                    long var114 = var151 & 7L;
                    long var163;
                    int var89 = (var163 = var114 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                    if (var89 == 0) {
                        int var90 = var105.length;
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var142 = var3 + 2;
                        var6 *= var142;
                        int var143 = var3 + 3;
                        var6 *= var143;
                        var6 &= 7;
                        if (var6 != 0) {
                            var2 -= -1149497224;
                            var2 &= 615625220;
                            var2 &= 1880198425;
                            var2 ^= 2052730260;
                            break label119;
                        }

                        var2 ^= 119236479;
                        var2 -= 1156938991;
                        var2 ^= -983347141;
                        Integer var120 = var2;
                        label90:
                        if (var120 != null) {
                            SpriteShape var93;
                            if (var90 == 1) {
                                var2 >>>= 6;
                                var2 ^= 1842593484;
                                var2 &= -1213292423;
                                var2 >>= 1;
                                var2 ^= -1733236250;
                                long var121 = var2;
                                var151 = var121 + 1L;
                                var151 = var121 * var151;
                                long var122 = var151 & 1L;
                                long var164;
                                int var91 = (var164 = var122 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                                if (var91 != 0) {
                                    break label90;
                                }

                                SpriteShape var92 = var105[0];
                                var120 = var3;
                                if (var120 == null) {
                                    switch (var2) {
                                        case -1967998518:
                                            var2 >>>= 14;
                                            var2 ^= 1515784030;
                                            break label119;
                                        case -571613781:
                                        default:
                                            var2 ^= -888445678;
                                            break label119;
                                        case -259869361:
                                            var2 ^= 1016669245;
                                            break label119;
                                    }
                                }

                                var2 &= -1796029499;
                                var2 ^= -2031126155;
                                var120 = var2;
                                if (var120 == null) {
                                    break label90;
                                }

                                var93 = var92;
                                var2 >>>= 14;
                                var2 *= 1464222313;
                                var2 ^= 511555359;
                            } else {
                                var2 *= 509401391;
                                var2 -= -856751925;
                                var2 ^= -491022000;
                                int var125 = var2 + 1;
                                var125 = var2 * var125;
                                int var144 = var2 + 2;
                                var125 *= var144;
                                int var145 = var2 + 3;
                                var125 *= var145;
                                var125 &= 7;
                                if (var125 != 0) {
                                    break label90;
                                }

                                var125 = var105.length;
                                int var146 = var3 + 1;
                                int var147 = var3 * var146;
                                var3 = var147 & 1;
                                if (var3 != 0) {
                                    var2 -= -1677514941;
                                    var2 ^= 771075740;
                                    break label119;
                                }

                                var2 ^= 1299934960;
                                var2 += -286695273;
                                var2 <<= 27;
                                var2 >>= 17;
                                var2 ^= -122978687;
                                var7 = var2;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var165;
                                var3 = (var165 = var7 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
                                if (var3 != 0) {
                                    break label90;
                                }

                                var3 = var1.nextInt(var125);
                                SpriteShape var82 = var105[var3];
                                var93 = var82;
                                switch (var2) {
                                    case -786101095:
                                        var2 ^= 1272275828;
                                        break;
                                    case 122992257:
                                        var2 *= 1154337251;
                                        var2 ^= 485406131;
                                        break;
                                    case 302597178:
                                    default:
                                        var2 ^= 47317468;
                                }
                            }

                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var97 = var2 + 2;
                            var3 *= var97;
                            var97 = var2 + 3;
                            var3 *= var97;
                            var3 &= 7;
                            if (var3 == 0) {
                                return var93;
                            }
                        }
                    }
                }

                IllegalStateException var88 = new IllegalStateException();
                throw var88;
            }
        }

        AssertionError var78 = new AssertionError();
        throw var78;
    }

    private SpriteShape[] nD(int var1) {
        label259: {
            int var3 = System.identityHashCode(this);
            r_2 var4 = this.hv;
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var340;
            int var199 = (var340 = var5 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
            int var21;
            if (var199 == 0) {
                var21 = var1 | 1216958163;
                var21 <<= 7;
                var21 ^= 1847245378;
                Enum var190 = var4.A();
                Ru var191 = (Ru)var190;
                int var192 = var191.ordinal();
                label256:
                switch (var192) {
                    case 0:
                        var21 ^= -1414999918;
                        var21 |= 512759176;
                        var21 *= -1951085513;
                        var21 ^= 813830685;
                        int var235 = var21 + 1;
                        int var236 = var21 * var235;
                        int var237 = var236 & 1;
                        if (var237 != 0) {
                            break label259;
                        }

                        SpriteShape[] var238 = p;
                        int var292 = var3 + 1;
                        var292 = var3 * var292;
                        int var314 = var3 + 2;
                        var292 *= var314;
                        var3 += 3;
                        var292 *= var3;
                        var3 = var292 & 7;
                        if (var3 == 0) {
                            var21 += 934695916;
                            var21 *= 1706418371;
                            var21 ^= 1991943321;
                            var3 = var21 + 1;
                            var3 = var21 * var3;
                            var3 &= 1;
                            if (var3 != 0) {
                                break label259;
                            }

                            var21 -= -675239841;
                            var21 += -1043312184;
                            var21 ^= 1457781886;
                            var21 ^= -1778874367;
                            return var238;
                        }

                        switch (var21) {
                            case 21583664:
                            default:
                                var21 ^= 205856073;
                                break label256;
                            case 283722613:
                                var21 -= -2034987047;
                                var21 ^= -1706597295;
                                break label256;
                            case 1830310961:
                                var21 ^= -1235820985;
                                break label256;
                        }
                    case 1:
                        var21 &= 81465656;
                        var21 += 1951184137;
                        var21 ^= -1710348397;
                        int var231 = var21 + 1;
                        int var232 = var21 * var231;
                        int var233 = var232 & 1;
                        if (var233 != 0) {
                            break label259;
                        }

                        SpriteShape[] var234 = new SpriteShape[1];
                        SpriteShape var287 = SpriteShape.STAR;
                        var234[0] = var287;
                        long var288 = var3;
                        long var332 = var288 + 1L;
                        var332 = var288 * var332;
                        long var289 = var332 & 1L;
                        long var341;
                        int var290 = (var341 = var289 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                        if (var290 == 0) {
                            var21 &= -1095945984;
                            var21 ^= -935665;
                            Integer var291 = var21;
                            if (var291 == null) {
                                break label259;
                            }

                            var21 |= -436510930;
                            var21 ^= 200196639;
                            var21 ^= 591289004;
                            return var234;
                        }

                        switch (var21) {
                            case -2111281854:
                                var21 ^= -2069670977;
                                break label256;
                            case -1804546985:
                            default:
                                var21 ^= -1630473543;
                                break label256;
                            case -287579750:
                                var21 *= 335260653;
                                var21 -= 947157823;
                                var21 ^= 2025384350;
                                break label256;
                        }
                    case 2:
                        var21 -= -35616218;
                        var21 |= 1777946008;
                        var21 ^= 1684797155;
                        var21 ^= 2005573860;
                        Integer var229 = var21;
                        if (var229 == null) {
                            break label259;
                        }

                        SpriteShape[] var230 = new SpriteShape[1];
                        SpriteShape var286 = SpriteShape.HEART;
                        Integer var313 = var3;
                        if (var313 != null) {
                            var21 += 1712463041;
                            var21 &= -1018726581;
                            var21 &= 784445873;
                            var21 &= -212504664;
                            var21 ^= -1557342848;
                            var230[0] = var286;
                            var21 |= 282498380;
                            var21 += 1982475678;
                            var21 ^= -150838026;
                            return var230;
                        }

                        var21 += 27455674;
                        var21 ^= 1875664280;
                        break;
                    case 3:
                        var21 *= 477538509;
                        var21 ^= -1235841981;
                        SpriteShape[] var228 = new SpriteShape[1];
                        SpriteShape var285 = SpriteShape.GLOW;
                        Integer var309 = var3;
                        if (var309 != null) {
                            var21 *= 2065976829;
                            var21 ^= 625540463;
                            var7 = var21;
                            long var335 = var7 + 1L;
                            var335 = var7 * var335;
                            var7 = var335 & 1L;
                            long var342;
                            int var312 = (var342 = var7 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
                            if (var312 != 0) {
                                break label259;
                            }

                            var228[0] = var285;
                            switch (var21) {
                                case -1825306246:
                                default:
                                    var21 ^= -249069562;
                                    return var228;
                                case -1139218701:
                                    var21 ^= -1964468727;
                                    return var228;
                                case 1139354842:
                                    var21 ^= -685092907;
                                    var21 |= -782729316;
                                    var21 ^= 149960707;
                                    return var228;
                            }
                        }

                        switch (var21) {
                            case -1830329487:
                            default:
                                var21 ^= -940191014;
                                break label256;
                            case -544521191:
                                var21 <<= 21;
                                var21 ^= 1065362400;
                                var21 <<= 13;
                                var21 ^= 1714941729;
                                var21 ^= 1916287212;
                                break label256;
                            case 329959430:
                                var21 ^= -1084584926;
                                break label256;
                        }
                    case 4:
                        var21 = switch (var21) {
                            default -> var21 ^ -1632829171;
                            case 581784002 -> {
                                var21 *= 610187539;
                                yield var21 ^ 1772678630;
                            }
                            case 2131423320 -> var21 ^ 503271127;
                        };
                        Integer var226 = var21;
                        if (var226 == null) {
                            break label259;
                        }

                        SpriteShape[] var227 = new SpriteShape[1];
                        long var276 = var3;
                        long var324 = var276 + 1L;
                        var324 = var276 * var324;
                        long var338 = var276 + 2L;
                        var324 *= var338;
                        var276 += 3L;
                        var324 *= var276;
                        var276 = var324 & 7L;
                        long var343;
                        int var279 = (var343 = var276 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
                        if (var279 == 0) {
                            var21 += -551853768;
                            var21 >>>= 21;
                            var21 |= -892019624;
                            var21 |= -1623448104;
                            var21 ^= -1255872083;
                            var276 = var21;
                            var324 = var276 + 1L;
                            var324 = var276 * var324;
                            var338 = var276 + 2L;
                            var324 *= var338;
                            var276 += 3L;
                            var324 *= var276;
                            var276 = var324 & 7L;
                            long var344;
                            int var283 = (var344 = var276 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                            if (var283 != 0) {
                                break label259;
                            }

                            SpriteShape var284 = SpriteShape.SPARKLE;
                            var227[0] = var284;
                            switch (var21) {
                                case -1260387620:
                                default:
                                    var21 ^= 1166427590;
                                    return var227;
                                case 550086669:
                                    var21 ^= -1983896394;
                                    return var227;
                                case 1792545904:
                                    var21 >>>= 20;
                                    var21 ^= -584367823;
                                    return var227;
                            }
                        }

                        switch (var21) {
                            case -1566342388:
                                var21 ^= 2088273285;
                                break label256;
                            case -404897122:
                            default:
                                var21 ^= -613094493;
                                break label256;
                            case 1233563264:
                                var21 >>>= 31;
                                var21 <<= 30;
                                var21 ^= 276027341;
                                break label256;
                        }
                    case 5:
                        var21 >>= 15;
                        var21 *= 1781700237;
                        var21 ^= -1744926642;
                        Integer var224 = var21;
                        if (var224 == null) {
                            break label259;
                        }

                        SpriteShape[] var225 = new SpriteShape[1];
                        SpriteShape var273 = SpriteShape.DIAMOND;
                        var225[0] = var273;
                        Integer var274 = var3;
                        if (var274 != null) {
                            var21 >>>= 22;
                            var21 -= 1095974959;
                            var21 &= -1251380398;
                            var21 ^= 1234517536;
                            Integer var275 = var21;
                            if (var275 == null) {
                                break label259;
                            }

                            switch (var21) {
                                case -1815344999:
                                    var21 ^= 1097594145;
                                    return var225;
                                case -37912798:
                                    var21 ^= -1095889177;
                                    var21 -= -1001435290;
                                    var21 += 608749790;
                                    var21 *= -2128194265;
                                    var21 ^= 336220375;
                                    return var225;
                                case 845049793:
                                default:
                                    var21 ^= -496964290;
                                    return var225;
                            }
                        }

                        var21 += -1452570274;
                        var21 &= 1841598099;
                        var21 ^= 427251679;
                        break;
                    case 6:
                        var21 &= 1040182302;
                        var21 |= -1645168335;
                        var21 ^= -660711073;
                        Integer var222 = var21;
                        if (var222 == null) {
                            break label259;
                        }

                        SpriteShape[] var223 = new SpriteShape[1];
                        int var266 = var3 + 1;
                        var266 = var3 * var266;
                        int var307 = var3 + 2;
                        var266 *= var307;
                        int var308 = var3 + 3;
                        var266 *= var308;
                        var266 &= 7;
                        if (var266 == 0) {
                            var21 *= 845460681;
                            var21 += 1152230606;
                            var21 ^= -1095950286;
                            Integer var271 = var21;
                            if (var271 == null) {
                                break label259;
                            }

                            SpriteShape var272 = SpriteShape.SNOWFLAKE;
                            var223[0] = var272;
                            switch (var21) {
                                case -125141491:
                                    var21 ^= -2146013502;
                                    return var223;
                                case 273656232:
                                    var21 |= -2001217915;
                                    var21 *= -1332211753;
                                    var21 ^= -526804265;
                                    return var223;
                                case 472546056:
                                default:
                                    var21 ^= 53534477;
                                    return var223;
                            }
                        }

                        var21 += -1149096444;
                        var21 ^= 815143357;
                        break;
                    case 7:
                        var21 >>= 6;
                        var21 ^= 264954513;
                        var21 ^= 502594203;
                        int var216 = var21 + 1;
                        int var217 = var21 * var216;
                        int var255 = var21 + 2;
                        int var218 = var217 * var255;
                        var255 = var21 + 3;
                        int var219 = var218 * var255;
                        int var220 = var219 & 7;
                        if (var220 != 0) {
                            break label259;
                        }

                        SpriteShape[] var221 = new SpriteShape[1];
                        long var257 = var3;
                        long var322 = var257 + 1L;
                        var322 = var257 * var322;
                        long var258 = var322 & 1L;
                        long var349;
                        var255 = (var349 = var258 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                        if (var255 == 0) {
                            var21 >>>= 8;
                            var21 |= 74178843;
                            var21 |= 1368198470;
                            var21 ^= -2141853436;
                            var255 = var21 + 1;
                            var255 = var21 * var255;
                            int var305 = var21 + 2;
                            var255 *= var305;
                            int var306 = var21 + 3;
                            var255 *= var306;
                            var255 &= 7;
                            if (var255 != 0) {
                                break label259;
                            }

                            SpriteShape var265 = SpriteShape.DOLLAR;
                            var221[0] = var265;
                            switch (var21) {
                                case -710273797:
                                    var21 <<= 13;
                                    var21 += -1278198129;
                                    var21 ^= 725932307;
                                    return var221;
                                case 513865359:
                                default:
                                    var21 ^= -635080779;
                                    return var221;
                                case 1550390255:
                                    var21 ^= -1204884791;
                                    return var221;
                            }
                        }

                        var21 -= -33880769;
                        var21 ^= 80379843;
                        break;
                    case 8:
                        var21 |= -1896388775;
                        var21 &= 446463448;
                        var21 ^= -634038603;
                        var5 = var21;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var334 = var5 + 2L;
                        var7 *= var334;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var347;
                        int var214 = (var347 = var5 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                        if (var214 != 0) {
                            break label259;
                        }

                        SpriteShape[] var215 = new SpriteShape[1];
                        SpriteShape var249 = SpriteShape.CROWN;
                        var215[0] = var249;
                        Integer var250 = var3;
                        if (var250 != null) {
                            var21 -= 635741096;
                            var21 |= -1839380762;
                            var21 |= -759278830;
                            var21 ^= 363297723;
                            var21 ^= 2077659393;
                            long var251 = var21;
                            long var318 = var251 + 1L;
                            var318 = var251 * var318;
                            long var337 = var251 + 2L;
                            var318 *= var337;
                            long var252 = var251 + 3L;
                            var318 *= var252;
                            long var253 = var318 & 7L;
                            long var348;
                            int var254 = (var348 = var253 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                            if (var254 != 0) {
                                break label259;
                            }

                            switch (var21) {
                                case -1802594995:
                                    var21 &= 2104561767;
                                    var21 -= -351217914;
                                    var21 *= 1253096277;
                                    var21 ^= 983843191;
                                    return var215;
                                case -906726413:
                                    var21 ^= -917343029;
                                    return var215;
                                case 1284610622:
                                default:
                                    var21 ^= -1170818151;
                                    return var215;
                            }
                        }

                        var21 ^= 334871077;
                        var21 ^= -751874427;
                        break;
                    case 9:
                        var21 ^= 1796198387;
                        var21 |= -177577178;
                        var21 ^= -1521920117;
                        Integer var209 = var21;
                        if (var209 == null) {
                            break label259;
                        }

                        SpriteShape[] var210 = new SpriteShape[1];
                        int var245 = var3 + 1;
                        var245 = var3 * var245;
                        var245 &= 1;
                        if (var245 == 0) {
                            var21 |= -1531016840;
                            var21 ^= 1463327159;
                            var21 ^= 1032189789;
                            SpriteShape var248 = SpriteShape.FIREFLY;
                            var210[0] = var248;
                            var21 |= -1060629814;
                            var21 ^= 199331906;
                            return var210;
                        }

                        var21 *= -800908237;
                        var21 <<= 21;
                        var21 &= -188409866;
                        var21 ^= 1316912822;
                        var21 ^= -91379333;
                        break;
                    case 10:
                        var21 ^= 1106953387;
                        var21 -= -868302320;
                        var21 &= 354479429;
                        var21 += -1611060911;
                        var21 ^= 1854630068;
                        int var205 = var21 + 1;
                        int var206 = var21 * var205;
                        int var207 = var206 & 1;
                        if (var207 != 0) {
                            break label259;
                        }

                        SpriteShape[] var208 = AP;
                        int var6 = var3 + 1;
                        var6 = var3 * var6;
                        var6 &= 1;
                        if (var6 == 0) {
                            var21 -= -94600350;
                            var21 <<= 9;
                            var21 |= -1410024448;
                            var21 ^= 2022635190;
                            long var241 = var21;
                            long var8 = var241 + 1L;
                            var8 = var241 * var8;
                            long var10 = var241 + 2L;
                            var8 *= var10;
                            long var242 = var241 + 3L;
                            var8 *= var242;
                            long var243 = var8 & 7L;
                            long var346;
                            var6 = (var346 = var243 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                break label259;
                            }

                            var21 *= 1515484067;
                            var21 += -298586741;
                            var21 *= 2079548963;
                            var21 ^= -2053760901;
                            return var208;
                        }

                        var21 >>>= 10;
                        var21 ^= 272976749;
                        break;
                    case 11:
                        var21 += 579460075;
                        var21 ^= 926899497;
                        int var193 = var21 | -863826692;
                        int var194 = var193 ^ -413426048;
                        SpriteShape[] var195 = this.x(var194);
                        var5 = var3;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var345;
                        int var203 = (var345 = var5 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
                        if (var203 == 0) {
                            var21 = switch (var21) {
                                default -> var21 ^ 711285654;
                                case -761318499 -> var21 ^ 189409227;
                                case 1913155716 -> {
                                    var21 *= -1913423379;
                                    var21 += 2101048947;
                                    var21 <<= 9;
                                    var21 |= -182987731;
                                    yield var21 ^ -1982727936;
                                }
                            };
                            Integer var204 = var21;
                            if (var204 == null) {
                                break label259;
                            }

                            var21 += -493319553;
                            var21 += -312389011;
                            var21 |= 691400860;
                            var21 ^= 112418922;
                            var21 ^= -1234840725;
                            return var195;
                        }

                        switch (var21) {
                            case -1926255339:
                            default:
                                var21 ^= -1947660138;
                                break label256;
                            case 473057783:
                                var21 ^= -80730067;
                                break label256;
                            case 1913155716:
                                var21 |= -1649370415;
                                var21 ^= -271897320;
                                break label256;
                        }
                    default:
                        var21 += 2124139656;
                        var21 ^= -1069686237;
                        var21 += -1312305755;
                        var21 ^= 766271409;
                        MatchException var180 = new MatchException(null, null);
                        throw var180;
                }
            } else {
                var21 = var1 << 5;
                var21 ^= 1132379917;
            }

            var3 = var21 + 1;
            var3 = var21 * var3;
            int var197 = var21 + 2;
            var3 *= var197;
            var21 += 3;
            var3 *= var21;
            var21 = var3 & 7;
            if (var21 == 0) {
                IllegalArgumentException var179 = new IllegalArgumentException();
                throw var179;
            }
        }

        UnsupportedOperationException var178 = new UnsupportedOperationException();
        throw var178;
    }

    private SpriteShape[] x(int var1) {
        label380: {
            int var175;
            SpriteShape[] var230;
            label398: {
                int var3 = System.identityHashCode(this);
                ArrayList var4 = new ArrayList();
                var230 = AP;
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var443;
                int var233 = (var443 = var6 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                label377:
                if (var233 == 0) {
                    var175 = switch (var1) {
                        case -877329633 -> var1 ^ 676255939;
                        default -> var1 ^ -225938831;
                        case 433119868 -> {
                            var175 = var1 - 1302929539;
                            var175 *= 795410285;
                            var175 -= -1391016593;
                            yield var175 ^ 1515785566;
                        }
                    };
                    int var216 = var230.length;
                    JL var234 = this.q;
                    boolean var235 = var234.vb();
                    if (var235) {
                        var175 *= 669029839;
                        var175 *= -1959935267;
                        var175 ^= -1788639360;
                        SpriteShape var236 = SpriteShape.STAR;
                        int var7 = var3 + 1;
                        var7 = var3 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            switch (var175) {
                                case -1476442792:
                                    var175 |= 1573864511;
                                    var175 &= -541892160;
                                    var175 ^= -375881213;
                                    break label377;
                                case 743572925:
                                default:
                                    var175 ^= -529151719;
                                    break label377;
                                case 795081066:
                                    var175 ^= 2004619037;
                                    break label377;
                            }
                        }

                        var175 *= -1763425535;
                        var175 ^= -1180843028;
                        Integer var329 = var175;
                        if (var329 == null) {
                            break label380;
                        }

                        int var330 = var175 & -2121441045;
                        var330 ^= 1127647695;
                        V(var4, var236, var216, var330);
                        switch (var175) {
                            case -1203240262:
                            default:
                                var175 ^= -1081303278;
                                break;
                            case -262200449:
                                var175 ^= 112512411;
                                break;
                            case 1880657588:
                                var175 >>>= 7;
                                var175 *= -2009519597;
                                var175 *= 733142315;
                                var175 += 1707744378;
                                var175 ^= 332786629;
                        }
                    } else {
                        switch (var175) {
                            case -1060785676:
                                var175 ^= 2054631220;
                                break;
                            case 74241480:
                                var175 |= -1326092699;
                                var175 ^= 1639649071;
                                break;
                            case 1985809117:
                            default:
                                var175 ^= 1079358341;
                        }
                    }

                    var6 = var175;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var444;
                    int var239 = (var444 = var6 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                    if (var239 != 0) {
                        break label380;
                    }

                    JL var240 = this.Z;
                    Integer var332 = var3;
                    if (var332 == null) {
                        switch (var175) {
                            case -1079766727:
                            default:
                                var175 ^= 433740172;
                                break;
                            case -716771134:
                                var175 ^= 1804801815;
                                var175 |= -346559289;
                                var175 |= -1405399767;
                                var175 |= -399567249;
                                var175 ^= -908837700;
                                break;
                            case 373442562:
                                var175 ^= 644054713;
                        }
                    } else {
                        label412: {
                            var175 = switch (var175) {
                                case -716771134 -> {
                                    var175 -= -584542224;
                                    var175 <<= 8;
                                    var175 -= 1501342147;
                                    yield var175 ^ 1146421410;
                                }
                                default -> var175 ^ -408094557;
                                case 1509509269 -> var175 ^ -932739557;
                            };
                            var332 = var175;
                            if (var332 == null) {
                                break label380;
                            }

                            boolean var241 = var240.vb();
                            if (var241) {
                                var175 |= 825836850;
                                var175 ^= -2078245994;
                                var175 -= -107033206;
                                var175 &= 1671496582;
                                var175 ^= 2098720257;
                                int var242 = var175 + 1;
                                int var243 = var175 * var242;
                                int var244 = var243 & 1;
                                if (var244 != 0) {
                                    break label380;
                                }

                                SpriteShape var245 = SpriteShape.HEART;
                                long var334 = var3;
                                long var9 = var334 + 1L;
                                var9 = var334 * var9;
                                long var11 = var334 + 2L;
                                var9 *= var11;
                                long var335 = var334 + 3L;
                                var9 *= var335;
                                long var336 = var9 & 7L;
                                long var445;
                                int var337 = (var445 = var336 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                if (var337 != 0) {
                                    var175 <<= 11;
                                    var175 ^= -1990198461;
                                    break label412;
                                }
                                var175 = switch (var175) {
                                    default -> var175 ^ 1265186882;
                                    case 603142314 -> var175 ^ 1126552186;
                                    case 1589112455 -> {
                                        var175 += 174729944;
                                        yield var175 ^ 1893563410;
                                    }
                                };
                                var337 = var175 & -443601828;
                                var337 ^= 751886232;
                                var337 ^= 1851880123;
                                V(var4, var245, var216, var337);
                                switch (var175) {
                                    case -1108197418:
                                        var175 ^= 414903764;
                                        break;
                                    case 436168013:
                                        var175 -= -1497738688;
                                        var175 ^= 373354773;
                                        var175 ^= 1703264245;
                                        break;
                                    case 1531501973:
                                    default:
                                        var175 ^= -1817073718;
                                }
                            } else {
                                var175 ^= 342199043;
                                var175 ^= -1804796303;
                            }

                            int var246 = var175 + 1;
                            int var247 = var175 * var246;
                            int var341 = var175 + 2;
                            int var248 = var247 * var341;
                            var341 = var175 + 3;
                            int var249 = var248 * var341;
                            int var250 = var249 & 7;
                            if (var250 != 0) {
                                break label380;
                            }

                            JL var251 = this.lf;
                            boolean var252 = var251.vb();
                            Integer var343 = var3;
                            if (var343 == null) {
                                var175 *= 116716059;
                                var175 ^= -1724978629;
                                var175 ^= 831809076;
                                var175 -= 910031459;
                                var175 ^= -1436270386;
                            } else {
                                label414: {
                                    var175 = switch (var175) {
                                        default -> var175 ^ 1096070344;
                                        case 8412653 -> {
                                            var175 <<= 3;
                                            var175 |= 207358830;
                                            var175 *= -649753957;
                                            var175 -= -1624701541;
                                            yield var175 ^ 1524274803;
                                        }
                                        case 648531326 -> var175 ^ -1620958175;
                                    };
                                    long var344 = var175;
                                    long var430 = var344 + 1L;
                                    var430 = var344 * var430;
                                    long var442 = var344 + 2L;
                                    var430 *= var442;
                                    long var345 = var344 + 3L;
                                    var430 *= var345;
                                    long var346 = var430 & 7L;
                                    long var446;
                                    int var347 = (var446 = var346 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                    if (var347 != 0) {
                                        break label380;
                                    }

                                    if (var252) {
                                        var175 *= 1260341961;
                                        var175 <<= 28;
                                        var175 |= 1594742461;
                                        var175 ^= 693635434;
                                        int var253 = var175 + 1;
                                        int var254 = var175 * var253;
                                        var347 = var175 + 2;
                                        int var255 = var254 * var347;
                                        var347 = var175 + 3;
                                        int var256 = var255 * var347;
                                        int var257 = var256 & 7;
                                        if (var257 != 0) {
                                            break label380;
                                        }

                                        SpriteShape var258 = SpriteShape.GLOW;
                                        var347 = var3 + 1;
                                        var347 = var3 * var347;
                                        var347 &= 1;
                                        if (var347 != 0) {
                                            var175 ^= -323357456;
                                            var175 ^= 751298660;
                                            break label414;
                                        }

                                        var175 >>>= 17;
                                        var175 <<= 7;
                                        var175 &= -1770812279;
                                        var175 ^= -1553659968;
                                        Integer var353 = var175;
                                        if (var353 == null) {
                                            break label380;
                                        }

                                        int var354 = var175 | -1576653610;
                                        var354 ^= 1575259329;
                                        var354 *= 1050493855;
                                        var354 *= -573404571;
                                        var354 ^= 1841434530;
                                        V(var4, var258, var216, var354);
                                        var175 |= -2131774786;
                                        var175 ^= 1210100194;
                                    } else {
                                        var175 -= 1566813264;
                                        var175 |= 300068888;
                                        var175 >>= 9;
                                        var175 ^= -339546653;
                                    }

                                    var6 = var175;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var447;
                                    int var262 = (var447 = var6 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                    if (var262 != 0) {
                                        break label380;
                                    }

                                    JL var263 = this.l;
                                    boolean var264 = var263.vb();
                                    Integer var359 = var3;
                                    if (var359 == null) {
                                        var175 -= 531257100;
                                        var175 &= -1635394200;
                                        var175 ^= -1731069296;
                                        var175 ^= 587135187;
                                    } else {
                                        label394: {
                                            var175 &= -1449594699;
                                            var175 ^= -1679110908;
                                            if (var264) {
                                                var175 += 880205411;
                                                var175 -= 412934960;
                                                var175 ^= -2067106726;
                                                int var265 = var175 + 1;
                                                int var266 = var175 * var265;
                                                int var267 = var266 & 1;
                                                if (var267 != 0) {
                                                    break label380;
                                                }

                                                SpriteShape var268 = SpriteShape.SNOWFLAKE;
                                                var359 = var3;
                                                if (var359 == null) {
                                                    var175 -= 1393845289;
                                                    var175 &= -1592876878;
                                                    var175 |= -814546302;
                                                    var175 ^= -648494607;
                                                    break label394;
                                                }

                                                var175 *= -2014321725;
                                                var175 ^= 1861644786;
                                                int var361 = var175 + 1;
                                                var361 = var175 * var361;
                                                var361 &= 1;
                                                if (var361 != 0) {
                                                    break label380;
                                                }

                                                var361 = var175 >>> 19;
                                                var361 ^= 331968914;
                                                var361 ^= 1358423059;
                                                V(var4, var268, var216, var361);
                                                switch (var175) {
                                                    case -1535059366:
                                                        var175 ^= -820451904;
                                                        break;
                                                    case -957099825:
                                                    default:
                                                        var175 ^= -1615445128;
                                                        break;
                                                    case -412077063:
                                                        var175 >>>= 16;
                                                        var175 += 1902958992;
                                                        var175 ^= 11554472;
                                                }
                                            } else {
                                                var175 >>>= 12;
                                                var175 >>>= 27;
                                                var175 *= -2113004333;
                                                var175 ^= 1910345640;
                                            }

                                            JL var269 = this.L;
                                            boolean var270 = var269.vb();
                                            long var367 = var3;
                                            var430 = var367 + 1L;
                                            var430 = var367 * var430;
                                            long var368 = var430 & 1L;
                                            long var448;
                                            int var369 = (var448 = var368 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                            if (var369 != 0) {
                                                var175 += -1343260802;
                                                var175 ^= 400999525;
                                            } else {
                                                label395: {
                                                    var175 *= 762737887;
                                                    var175 += -680630046;
                                                    var175 ^= 1210381839;
                                                    Integer var370 = var175;
                                                    if (var370 == null) {
                                                        break label380;
                                                    }

                                                    if (var270) {
                                                        var175 += -1352958248;
                                                        var175 ^= 1293696786;
                                                        var175 ^= -1908812256;
                                                        int var271 = var175 + 1;
                                                        int var272 = var175 * var271;
                                                        int var371 = var175 + 2;
                                                        int var273 = var272 * var371;
                                                        var371 = var175 + 3;
                                                        int var274 = var273 * var371;
                                                        int var275 = var274 & 7;
                                                        if (var275 != 0) {
                                                            break label380;
                                                        }

                                                        SpriteShape var276 = SpriteShape.DOLLAR;
                                                        Integer var373 = var3;
                                                        if (var373 == null) {
                                                            var175 += 1840499634;
                                                            var175 &= 1250644679;
                                                            var175 += -2008284230;
                                                            var175 ^= -1493396168;
                                                            break label395;
                                                        }

                                                        var175 |= -709607415;
                                                        var175 *= 958871571;
                                                        var175 ^= -297902264;
                                                        var373 = var175;
                                                        if (var373 == null) {
                                                            break label380;
                                                        }

                                                        int var375 = var175 + -2106621210;
                                                        var375 |= -214898760;
                                                        var375 ^= -1199411564;
                                                        V(var4, var276, var216, var375);
                                                        var175 >>= 29;
                                                        var175 ^= 215695948;
                                                        var175 >>>= 24;
                                                        var175 ^= 528572966;
                                                    } else {
                                                        switch (var175) {
                                                            case -1256717624:
                                                            default:
                                                                var175 ^= -231175332;
                                                                break;
                                                            case -192738166:
                                                                var175 ^= -547968712;
                                                                break;
                                                            case 1674730037:
                                                                var175 *= -1749174569;
                                                                var175 *= -1087449229;
                                                                var175 += -1309527877;
                                                                var175 += -1660508083;
                                                                var175 ^= -1196029388;
                                                        }
                                                    }

                                                    int var277 = var175 + 1;
                                                    int var278 = var175 * var277;
                                                    int var279 = var278 & 1;
                                                    if (var279 != 0) {
                                                        break label380;
                                                    }

                                                    JL var280 = this.li;
                                                    boolean var281 = var280.vb();
                                                    var370 = var3;
                                                    if (var370 == null) {
                                                        var175 *= 77635361;
                                                        var175 &= 302551906;
                                                        var175 ^= 908837667;
                                                    } else {
                                                        label396: {
                                                            var175 <<= 10;
                                                            var175 -= 1441685906;
                                                            var175 -= 830381576;
                                                            var175 ^= -1765677596;
                                                            int var379 = var175 + 1;
                                                            var379 = var175 * var379;
                                                            int var413 = var175 + 2;
                                                            var379 *= var413;
                                                            int var414 = var175 + 3;
                                                            var379 *= var414;
                                                            var379 &= 7;
                                                            if (var379 != 0) {
                                                                break label380;
                                                            }

                                                            if (var281) {
                                                                var175 += 178398077;
                                                                var175 &= -954777572;
                                                                var175 ^= -799461588;
                                                                SpriteShape var282 = SpriteShape.CROWN;
                                                                long var384 = var3;
                                                                var430 = var384 + 1L;
                                                                var430 = var384 * var430;
                                                                long var385 = var430 & 1L;
                                                                long var449;
                                                                var379 = (var449 = var385 - 0L) == 0L ? 0 : (var449 < 0L ? -1 : 1);
                                                                if (var379 != 0) {
                                                                    var175 *= 641914673;
                                                                    var175 -= -1825558455;
                                                                    var175 ^= 106276004;
                                                                    break label396;
                                                                }

                                                                var175 -= 1133380138;
                                                                var175 |= -768045949;
                                                                var175 ^= -1347279580;
                                                                var379 = var175 | 258451006;
                                                                var379 += -1163913194;
                                                                var379 *= 1926786379;
                                                                var379 ^= 812398600;
                                                                V(var4, var282, var216, var379);
                                                                var175 += -646042367;
                                                                var175 ^= 890831801;
                                                            } else {
                                                                switch (var175) {
                                                                    case -387993214:
                                                                        var175 <<= 27;
                                                                        var175 ^= 1826616861;
                                                                        break;
                                                                    case 1022228787:
                                                                    default:
                                                                        var175 ^= -1892374320;
                                                                        break;
                                                                    case 1261152294:
                                                                        var175 ^= -1588795614;
                                                                }
                                                            }

                                                            int var283 = var175 + 1;
                                                            int var284 = var175 * var283;
                                                            var379 = var175 + 2;
                                                            int var285 = var284 * var379;
                                                            var379 = var175 + 3;
                                                            int var286 = var285 * var379;
                                                            int var287 = var286 & 7;
                                                            if (var287 != 0) {
                                                                break label380;
                                                            }

                                                            JL var288 = this.EX;
                                                            boolean var289 = var288.vb();
                                                            Integer var393 = var3;
                                                            label327:
                                                            if (var393 != null) {
                                                                var175 *= -2104067065;
                                                                var175 &= -1674069465;
                                                                var175 &= -115278017;
                                                                var175 ^= 1476070702;
                                                                if (var289) {
                                                                    var175 -= 598909463;
                                                                    var175 ^= -1772487130;
                                                                    SpriteShape var290 = SpriteShape.FIREFLY;
                                                                    var393 = var3;
                                                                    if (var393 == null) {
                                                                        var175 |= 721189805;
                                                                        var175 ^= 215398654;
                                                                        break label327;
                                                                    }

                                                                    var175 <<= 26;
                                                                    var175 ^= 565558199;
                                                                    int var395 = var175 + -743320633;
                                                                    var395 &= 1664109112;
                                                                    var395 ^= 1646166871;
                                                                    V(var4, var290, var216, var395);
                                                                    switch (var175) {
                                                                        case -691799335:
                                                                        default:
                                                                            var175 ^= 1109291943;
                                                                            break;
                                                                        case -508183625:
                                                                            var175 &= 2143346875;
                                                                            var175 ^= -761838546;
                                                                            break;
                                                                        case 665079078:
                                                                            var175 ^= -342694749;
                                                                    }
                                                                } else {
                                                                    var175 >>>= 26;
                                                                    var175 ^= -1290279764;
                                                                }

                                                                Integer var217 = var175;
                                                                if (var217 == null) {
                                                                    break label380;
                                                                }

                                                                JL var218 = this.S;
                                                                var6 = var3;
                                                                var8 = var6 + 1L;
                                                                var8 = var6 * var8;
                                                                var10 = var6 + 2L;
                                                                var8 *= var10;
                                                                var6 += 3L;
                                                                var8 *= var6;
                                                                var6 = var8 & 7L;
                                                                long var450;
                                                                int var294 = (var450 = var6 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                                                                if (var294 != 0) {
                                                                    var175 |= 1122452863;
                                                                    var175 ^= -1150470878;
                                                                    var175 &= 1199995641;
                                                                    var175 ^= 1990824858;
                                                                } else {
                                                                    label415: {
                                                                        var175 = switch (var175) {
                                                                            case -1290279779 -> {
                                                                                var175 &= 109204263;
                                                                                var175 *= -1326384393;
                                                                                yield var175 ^ 730905531;
                                                                            }
                                                                            case -317839600 -> var175 ^ -2070902219;
                                                                            default -> var175 ^ 683370263;
                                                                        };
                                                                        var6 = var175;
                                                                        var8 = var6 + 1L;
                                                                        var8 = var6 * var8;
                                                                        var10 = var6 + 2L;
                                                                        var8 *= var10;
                                                                        var6 += 3L;
                                                                        var8 *= var6;
                                                                        var6 = var8 & 7L;
                                                                        long var451;
                                                                        int var298 = (var451 = var6 - 0L) == 0L ? 0 : (var451 < 0L ? -1 : 1);
                                                                        if (var298 != 0) {
                                                                            break label380;
                                                                        }

                                                                        boolean var219 = var218.vb();
                                                                        if (var219) {
                                                                            var175 |= 555104970;
                                                                            var175 -= -1242027054;
                                                                            var175 *= -288797503;
                                                                            var175 >>= 23;
                                                                            var175 ^= 958718980;
                                                                            long var220 = var175;
                                                                            long var398 = var220 + 1L;
                                                                            long var399 = var220 * var398;
                                                                            long var221 = var399 & 1L;
                                                                            long var452;
                                                                            int var222 = (var452 = var221 - 0L) == 0L ? 0 : (var452 < 0L ? -1 : 1);
                                                                            if (var222 != 0) {
                                                                                break label380;
                                                                            }

                                                                            var230 = AP;
                                                                            int var299 = var3 + 1;
                                                                            int var300 = var3 * var299;
                                                                            int var301 = var300 & 1;
                                                                            if (var301 != 0) {
                                                                                switch (var175) {
                                                                                    case -958719214:
                                                                                        var175 &= -1562972078;
                                                                                        var175 |= -1977812962;
                                                                                        var175 &= 418108225;
                                                                                        var175 *= -1935676329;
                                                                                        var175 ^= 310866755;
                                                                                        break label415;
                                                                                    case 7276726:
                                                                                    default:
                                                                                        var175 ^= 938278063;
                                                                                        break label415;
                                                                                    case 1758241927:
                                                                                        var175 ^= -25248870;
                                                                                        break label415;
                                                                                }
                                                                            }

                                                                            var175 += 1898040132;
                                                                            var175 -= 845138782;
                                                                            var175 >>>= 31;
                                                                            var175 ^= -912090609;
                                                                            var6 = var175;
                                                                            var8 = var6 + 1L;
                                                                            var8 = var6 * var8;
                                                                            var10 = var6 + 2L;
                                                                            var8 *= var10;
                                                                            var6 += 3L;
                                                                            var8 *= var6;
                                                                            var6 = var8 & 7L;
                                                                            long var453;
                                                                            int var305 = (var453 = var6 - 0L) == 0L ? 0 : (var453 < 0L ? -1 : 1);
                                                                            if (var305 != 0) {
                                                                                break label380;
                                                                            }

                                                                            List var224 = List.of(var230);
                                                                            boolean var225 = var4.addAll(var224);
                                                                            switch (var175) {
                                                                                case -1425415849:
                                                                                default:
                                                                                    var175 ^= -965809921;
                                                                                    break;
                                                                                case -1151514617:
                                                                                    var175 ^= 2015937267;
                                                                                    break;
                                                                                case -912090609:
                                                                                    var175 *= 631400177;
                                                                                    var175 ^= 735213083;
                                                                                    var175 >>= 13;
                                                                                    var175 ^= -192167653;
                                                                            }
                                                                        } else {
                                                                            var175 &= 392238691;
                                                                            var175 <<= 29;
                                                                            var175 ^= 1643061463;
                                                                            var175 ^= -1788370745;
                                                                        }

                                                                        Integer var226 = var175;
                                                                        if (var226 == null) {
                                                                            break label380;
                                                                        }

                                                                        boolean var227 = var4.isEmpty();
                                                                        int var306 = var3 + 1;
                                                                        int var307 = var3 * var306;
                                                                        int var308 = var307 & 1;
                                                                        if (var308 == 0) {
                                                                            var175 *= 620683125;
                                                                            var175 *= 124023573;
                                                                            var175 ^= 245799995;
                                                                            int var309 = var175 + 1;
                                                                            int var310 = var175 * var309;
                                                                            int var400 = var175 + 2;
                                                                            int var311 = var310 * var400;
                                                                            var400 = var175 + 3;
                                                                            int var312 = var311 * var400;
                                                                            int var313 = var312 & 7;
                                                                            if (var313 != 0) {
                                                                                break label380;
                                                                            }

                                                                            if (var227) {
                                                                                var175 |= 1486880464;
                                                                                var175 *= -26166829;
                                                                                var175 ^= -2145106528;
                                                                                Integer var228 = var175;
                                                                                if (var228 == null) {
                                                                                    break label380;
                                                                                }

                                                                                var230 = new SpriteShape[1];
                                                                                SpriteShape var314 = SpriteShape.FIREFLY;
                                                                                var230[0] = var314;
                                                                                int var315 = var3 + 1;
                                                                                int var316 = var3 * var315;
                                                                                int var317 = var316 & 1;
                                                                                if (var317 == 0) {
                                                                                    var175 ^= 685648851;
                                                                                    var175 += 715249769;
                                                                                    var175 <<= 5;
                                                                                    var175 *= -1988198237;
                                                                                    var175 ^= -73381850;
                                                                                    int var318 = var175 + 1;
                                                                                    int var319 = var175 * var318;
                                                                                    var400 = var175 + 2;
                                                                                    int var320 = var319 * var400;
                                                                                    var400 = var175 + 3;
                                                                                    int var321 = var320 * var400;
                                                                                    int var322 = var321 & 7;
                                                                                    if (var322 != 0) {
                                                                                        break label380;
                                                                                    }

                                                                                    var230 = var230;
                                                                                    var175 |= -1033724864;
                                                                                    var175 >>= 27;
                                                                                    var175 ^= 1471497209;
                                                                                    break label398;
                                                                                }

                                                                                var175 <<= 3;
                                                                                var175 *= -1566268009;
                                                                                var175 -= -1109318835;
                                                                                var175 ^= -701670360;
                                                                            } else {
                                                                                var175 = switch (var175) {
                                                                                    case -531356245 -> {
                                                                                        var175 >>= 9;
                                                                                        var175 -= -1564662251;
                                                                                        var175 &= -1999883951;
                                                                                        yield var175 ^ 727282347;
                                                                                    }
                                                                                    case -524452436 -> var175 ^ 1832674968;
                                                                                    default -> var175 ^ -269797478;
                                                                                };
                                                                                int var323 = var175 + 1;
                                                                                int var324 = var175 * var323;
                                                                                int var325 = var324 & 1;
                                                                                if (var325 != 0) {
                                                                                    break label380;
                                                                                }

                                                                                IntFunction var326 = var0 -> {
                                                                                    int var1x = Q;
                                                                                    var1x ^= -2111479279;
                                                                                    Integer var3x = var0;
                                                                                    if (var3x != null) {
                                                                                        var1x >>>= 8;
                                                                                        var1x ^= -17467563;
                                                                                        long var17x = var0;
                                                                                        long var5x = var17x + 1L;
                                                                                        var5x = var17x * var5x;
                                                                                        long var18x = var5x & 1L;
                                                                                        long var21x;
                                                                                        int var19x = (var21x = var18x - 0L) == 0L ? 0 : (var21x < 0L ? -1 : 1);
                                                                                        if (var19x == 0) {
                                                                                            return new SpriteShape[var0];
                                                                                        }
                                                                                    } else {
                                                                                        var1x += 1575379433;
                                                                                        var1x += -1077498493;
                                                                                        var1x &= -1773970744;
                                                                                        var1x ^= 1384959256;
                                                                                        Integer var14x = var0;
                                                                                        if (var14x != null) {
                                                                                            RuntimeException var16x = new RuntimeException();
                                                                                            throw var16x;
                                                                                        }
                                                                                    }

                                                                                    AssertionError var15x = new AssertionError();
                                                                                    throw var15x;
                                                                                };
                                                                                Integer var209 = var3;
                                                                                if (var209 != null) {
                                                                                    var175 |= -1508005396;
                                                                                    var175 ^= -645475825;
                                                                                    var209 = var175;
                                                                                    if (var209 == null) {
                                                                                        break label380;
                                                                                    }

                                                                                    Object[] var211 = var4.toArray(var326);
                                                                                    SpriteShape[] var212 = (SpriteShape[])var211;
                                                                                    var230 = var212;
                                                                                    var175 += -1647959922;
                                                                                    var175 <<= 10;
                                                                                    var175 |= -680661266;
                                                                                    var175 &= -205103731;
                                                                                    var175 ^= 2064572556;
                                                                                    break label398;
                                                                                }

                                                                                var175 &= 1547262556;
                                                                                var175 &= -1681210995;
                                                                                var175 ^= 908297035;
                                                                            }
                                                                        } else {
                                                                            var175 -= 898449377;
                                                                            var175 ^= -1999600788;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                var175 |= -357329943;
                                                                var175 += -739828913;
                                                                var175 |= 1695621348;
                                                                var175 |= 1303682755;
                                                                var175 ^= -908297044;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var175 = var1 & -1068554327;
                    var175 &= 1899231210;
                    var175 *= 501648727;
                    var175 += -1883287857;
                    var175 ^= -324980444;
                }

                var3 = var175 + 1;
                var3 = var175 * var3;
                var175 = var3 & 1;
                if (var175 == 0) {
                    IllegalStateException var207 = new IllegalStateException();
                    throw var207;
                }
                break label380;
            }

            Integer var213 = var175;
            if (var213 != null) {
                return var230;
            }
        }

        IllegalArgumentException var208 = new IllegalArgumentException();
        throw var208;
    }

    private static void V(List var0, SpriteShape var1, int var2, int var3) {
        label70: {
            int var5 = var2;
            int var6 = System.identityHashCode(var0);
            int var7 = 0;
            int var8 = var6 + 1;
            var8 = var6 * var8;
            var8 &= 1;
            if (var8 == 0) {
                int var19 = var3 << 24;
                var19 &= -729227709;
                var19 >>= 30;
                var19 -= 816662807;
                var19 ^= -1239302054;
                long var52 = var2;
                long var10 = var52 + 1L;
                var10 = var52 * var10;
                long var12 = var52 + 2L;
                var10 *= var12;
                long var53 = var52 + 3L;
                var10 *= var53;
                long var54 = var10 & 7L;
                long var82;
                var8 = (var82 = var54 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                if (var8 != 0) {
                    break label70;
                }

                var7 = var7;
                var19 += 629472649;
                var19 += -223833781;
                var19 ^= 1357087471;

                while (true) {
                    Integer var56 = var5;
                    if (var56 == null) {
                        break label70;
                    }

                    if (var7 >= var2) {
                        switch (var19) {
                            case -1324788472:
                                var19 ^= 1007095183;
                                break;
                            case -1052604565:
                                var19 &= 849366169;
                                var19 *= -1283614413;
                                var19 ^= 2042149796;
                                break;
                            case 239973136:
                            default:
                                var19 ^= -896854387;
                        }

                        Integer var48 = var5;
                        if (var48 != null) {
                            return;
                        }
                        break label70;
                    }

                    var19 *= -1063514895;
                    var19 &= -1608024003;
                    var19 ^= 112832073;
                    int var57 = var5 + 1;
                    var57 = var5 * var57;
                    int var9 = var5 + 2;
                    var57 *= var9;
                    var9 = var5 + 3;
                    var57 *= var9;
                    var57 &= 7;
                    if (var57 != 0) {
                        break label70;
                    }

                    var0.add(var1);
                    int var62 = var7 + 1;
                    var9 = var6 + 1;
                    var9 = var6 * var9;
                    int var77 = var6 + 2;
                    var9 *= var77;
                    int var78 = var6 + 3;
                    var9 *= var78;
                    var9 &= 7;
                    if (var9 != 0) {
                        var19 -= 1846741116;
                        var19 |= -1719999681;
                        var19 ^= 1046972008;
                        break;
                    }
                    var19 = switch (var19) {
                        case -2036355472 -> {
                            var19 -= 1244422597;
                            var19 += 1056498399;
                            var19 += -1727853099;
                            yield var19 ^ 916627;
                        }
                        case -433208022 -> var19 ^ -122685050;
                        default -> var19 ^ 1219634144;
                    };
                    long var70 = var5;
                    long var11 = var70 + 1L;
                    var11 = var70 * var11;
                    long var13 = var70 + 2L;
                    var11 *= var13;
                    long var71 = var70 + 3L;
                    var11 *= var71;
                    long var72 = var11 & 7L;
                    long var83;
                    var9 = (var83 = var72 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                    if (var9 != 0) {
                        break label70;
                    }

                    var7 = var62;
                    var19 &= -1292870604;
                    var19 *= 1724959071;
                    var19 <<= 14;
                    var19 ^= 2015201131;
                }
            } else {
                int var4 = var3 | 1248255093;
                var4 *= 1769414333;
                var4 *= 1242921911;
                var4 -= -1160908672;
                var4 ^= 615236210;
            }

            Integer var40 = var5;
            if (var40 != null) {
                IllegalArgumentException var41 = new IllegalArgumentException();
                throw var41;
            }
        }

        IllegalStateException var47 = new IllegalStateException();
        throw var47;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 165739031;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Q = var4;
        SpriteShape[] var5 = new SpriteShape[12];
        SpriteShape var7 = SpriteShape.CROSS;
        var5[0] = var7;
        SpriteShape var8 = SpriteShape.TRIANGLE;
        var5[1] = var8;
        SpriteShape var9 = SpriteShape.SQUARE;
        var5[2] = var9;
        SpriteShape var10 = SpriteShape.RING;
        var5[3] = var10;
        SpriteShape var11 = SpriteShape.CHEVRON;
        var5[4] = var11;
        SpriteShape var12 = SpriteShape.ARROW;
        var5[5] = var12;
        SpriteShape var13 = SpriteShape.ZIGZAG;
        var5[6] = var13;
        SpriteShape var14 = SpriteShape.FLOWER;
        var5[7] = var14;
        SpriteShape var15 = SpriteShape.INFINITY;
        var5[8] = var15;
        SpriteShape var16 = SpriteShape.LINE;
        var5[9] = var16;
        SpriteShape var17 = SpriteShape.SPARKLE;
        var5[10] = var17;
        SpriteShape var18 = SpriteShape.SPIRAL;
        var5[11] = var18;
        AP = var5;
        SpriteShape[] var6 = new SpriteShape[3];
        SpriteShape var19 = SpriteShape.STAR;
        var6[0] = var19;
        SpriteShape var20 = SpriteShape.HEART;
        var6[1] = var20;
        SpriteShape var21 = SpriteShape.GLOW;
        var6[2] = var21;
        p = var6;
    }
}
