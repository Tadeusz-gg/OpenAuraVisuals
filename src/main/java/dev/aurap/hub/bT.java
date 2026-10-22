package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum bT {
    VANILLA(-4603704, -7564389),
    FADE(-999350, -7455541),
    DOPPLER(-4047986, -14021058),
    SAPPHIRE(-12606209, -16113813),
    RUBY(-1760454, -11926256),
    EMERALD(-13642630, -16500706),
    BLACK_PEARL(-9678928, -15069136),
    MARBLE_FADE(-601540, -13865504),
    TIGER_TOOTH(-15782, -4893170),
    SLAUGHTER(-2084806, -865841),
    CRIMSON_WEB(-7465956, -15465462),
    CASE_HARDENED(-12949800, -2513855),
    NIGHT(-11906983, -14802650);

    private static final int[] y;
    private static final int[] mz;
    private static final int[] dP;
    private static final int[] L;
    private static final int[] Je;
    private static final int[] q;
    private final int Rx;
    private final int o;
    public static final int KU;

    private bT(int var3, int var4) {
        this.Rx = var3;
        this.o = var4;
    }

    public int swatch(int var1) {
        label60: {
            int var66;
            label59: {
                int var2 = KU;
                var2 ^= 111248584;
                int var4 = System.identityHashCode(this);
                long var5 = var4;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var57 = var7 & 1L;
                long var83;
                var66 = (var83 = var57 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                if (var66 == 0) {
                    var2 >>>= 6;
                    var2 *= 1798946097;
                    var2 *= -1789421981;
                    var2 ^= -700981165;
                    Integer var59 = var1;
                    if (var59 == null) {
                        break label60;
                    }

                    if (var1 == 0) {
                        var2 ^= -713694026;
                        var2 *= -1695136147;
                        var2 ^= -1307990927;
                        int var60 = var1 + 1;
                        var60 = var1 * var60;
                        int var6 = var1 + 2;
                        var60 *= var6;
                        var6 = var1 + 3;
                        var60 *= var6;
                        var60 &= 7;
                        if (var60 != 0) {
                            break label60;
                        }

                        var60 = this.Rx;
                        var6 = var4 + 1;
                        var6 = var4 * var6;
                        var6 &= 1;
                        if (var6 == 0) {
                            var2 -= -821245591;
                            var2 |= 1696907533;
                            var2 ^= -513716553;
                            long var71 = var1;
                            long var8 = var71 + 1L;
                            var8 = var71 * var8;
                            long var72 = var8 & 1L;
                            long var84;
                            var6 = (var84 = var72 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                break label60;
                            }

                            var66 = var60;
                            var2 ^= 583355349;
                            var2 &= -253323874;
                            var2 ^= 697554588;
                            break label59;
                        }

                        var2 -= -609297971;
                        var2 >>>= 22;
                        var2 &= 1587709243;
                        var2 |= -876177172;
                        var2 ^= -1280029835;
                    } else {
                        var2 -= 1538924237;
                        var2 ^= -82336748;
                        Integer var74 = var1;
                        if (var74 == null) {
                            break label60;
                        }

                        int var75 = this.o;
                        int var77 = var4 + 1;
                        int var78 = var4 * var77;
                        int var82 = var4 + 2;
                        int var79 = var78 * var82;
                        var4 += 3;
                        int var80 = var79 * var4;
                        var4 = var80 & 7;
                        if (var4 == 0) {
                            var2 &= -873129302;
                            var2 *= 312283149;
                            var2 ^= 1750790230;
                            var66 = var75;
                            var2 += -72970523;
                            var2 ^= 1762916257;
                            break label59;
                        }

                        var2 <<= 19;
                        var2 += 86211656;
                        var2 *= -834149247;
                        var2 ^= -876932158;
                    }
                } else {
                    switch (var2) {
                        case -2003580307:
                            var2 ^= 974078347;
                            break;
                        case -76412740:
                        default:
                            var2 ^= 1707044235;
                            break;
                        case 408225709:
                            var2 += -224217460;
                            var2 |= 1034892722;
                            var2 &= 97777718;
                            var2 |= 1061804259;
                            var2 ^= 1202269049;
                    }
                }

                long var47 = var1;
                long var55 = var47 + 1L;
                long var56 = var47 * var55;
                long var48 = var56 & 1L;
                long var85;
                var2 = (var85 = var48 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                if (var2 == 0) {
                    IllegalStateException var51 = new IllegalStateException();
                    throw var51;
                }
                break label60;
            }

            Integer var54 = var1;
            if (var54 != null) {
                return var66;
            }
        }

        IllegalArgumentException var50 = new IllegalArgumentException();
        throw var50;
    }

    public boolean bare() {
        label63: {
            int var26;
            int var40;
            label67: {
                var26 = KU;
                var26 ^= -853875473;
                var40 = System.identityHashCode(this);
                bT var3 = VANILLA;
                int var4 = var40 + 1;
                var4 = var40 * var4;
                var4 &= 1;
                label60:
                if (var4 == 0) {
                    var26 |= 1018194919;
                    var26 ^= 1472062770;
                    var26 ^= 1118206107;
                    Integer var55 = var26;
                    if (var55 == null) {
                        break label63;
                    }

                    if (this != var3) {
                        var26 ^= -1811054348;
                        var26 ^= -1014283384;
                        long var41 = var26;
                        long var5 = var41 + 1L;
                        var5 = var41 * var5;
                        long var42 = var5 & 1L;
                        long var63;
                        int var43 = (var63 = var42 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                        if (var43 != 0) {
                            break label63;
                        }

                        var3 = NIGHT;
                        int var56 = var40 + 1;
                        var56 = var40 * var56;
                        var40 = var56 & 1;
                        if (var40 != 0) {
                            var26 >>= 19;
                            var26 += 1798509706;
                            var26 &= -1090267813;
                            var26 ^= 1996010898;
                            break label60;
                        }

                        var26 |= -1558903768;
                        var26 |= 1274505080;
                        var26 *= 2126094733;
                        var26 *= -1374892039;
                        var26 ^= 1317118756;
                        Integer var39 = var26;
                        if (var39 == null) {
                            break label63;
                        }

                        if (this != var3) {
                            var26 ^= 998759160;
                            var26 &= -1803918583;
                            var26 ^= -1921722481;
                            var40 = 0;
                            var26 *= 371600701;
                            var26 ^= -1530488736;
                            break label67;
                        }

                        switch (var26) {
                            case -1505278586:
                                var26 >>= 26;
                                var26 ^= 955754057;
                                break;
                            case -258751823:
                            default:
                                var26 ^= 1071522069;
                                break;
                            case 145903331:
                                var26 ^= 216286394;
                        }
                    } else {
                        var26 += 1935185075;
                        var26 -= 1544319269;
                        var26 *= 1207502223;
                        var26 -= 2053713932;
                        var26 ^= 104496320;
                    }

                    long var45 = var26;
                    long var61 = var45 + 1L;
                    var61 = var45 * var61;
                    long var46 = var61 & 1L;
                    long var64;
                    int var47 = (var64 = var46 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
                    if (var47 != 0) {
                        break label63;
                    }

                    var40 = 1;
                    var26 >>= 25;
                    var26 ^= 734345384;
                    break label67;
                } else {
                    var26 -= -832823093;
                    var26 ^= 1483339583;
                }

                Integer var30 = var26;
                if (var30 != null) {
                    IllegalArgumentException var31 = new IllegalArgumentException();
                    throw var31;
                }
                break label63;
            }

            int var48 = var26 + 1;
            var48 = var26 * var48;
            int var58 = var26 + 2;
            var48 *= var58;
            var58 = var26 + 3;
            var48 *= var58;
            var48 &= 7;
            if (var48 == 0) {
                return (var40 != 0);
            }
        }

        IllegalStateException var37 = new IllegalStateException();
        throw var37;
    }

    public int color(float var1, float var2, rH var3) {
        label237: {
            int var4 = KU;
            var4 ^= -951544740;
            int var5 = System.identityHashCode(this);
            float var6 = var1 * 3.6F;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var423;
            int var214 = (var423 = var7 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
            int var8 = of_2.qG;
            var4 ^= var8;
            var4 ^= 1220043223;
            of_2.qG = 1220043223;
            var8 = of_2.il;
            var4 ^= var8;
            var4 ^= -1419200420;
            of_2.il = -1419200420;
            if (var214 != 0) {
                var4 ^= -1160702786;
                var4 ^= -63918210;
                var4 ^= 83789873;
            } else {
                var4 *= 1261508737;
                var4 *= -1781029547;
                var4 ^= 945153037;
                var8 = this.ordinal();
                label235:
                switch (var8) {
                    case 0:
                        var4 &= 1100438046;
                        var4 -= -1956064464;
                        var4 >>>= 26;
                        var4 ^= 1575173478;
                        int var296 = var4 + 1;
                        int var297 = var4 * var296;
                        int var385 = var4 + 2;
                        int var298 = var297 * var385;
                        var385 = var4 + 3;
                        int var299 = var298 * var385;
                        int var300 = var299 & 7;
                        if (var300 != 0) {
                            break label237;
                        }

                        int var301 = var4 | 1593450693;
                        int var302 = var301 - 744578938;
                        int var303 = var302 & -1510824175;
                        int var304 = var303 ^ 1908626417;
                        int var211 = dQ(var6, var2, var3, -6445908, -2893602, var304);
                        int var215 = var5 + 1;
                        int var216 = var5 * var215;
                        var5 = var216 & 1;
                        if (var5 == 0) {
                            var4 = switch (var4) {
                                default -> var4 ^ 1498627229;
                                case 1096410514 -> var4 ^ -272023503;
                                case 1575173451 -> {
                                    var4 -= -1352260147;
                                    var4 -= -1129463505;
                                    var4 &= -728484590;
                                    var4 <<= 2;
                                    yield var4 ^ 1585573450;
                                }
                            } + -2013058119;
                            var4 ^= 508515704;
                            var4 ^= 641730759;
                            var4 *= 130557705;
                            var4 ^= -1157599124;
                            return var211;
                        }

                        var4 ^= 660594628;
                        var4 |= 335979090;
                        var4 *= 883141751;
                        var4 >>= 26;
                        var4 ^= 1683807026;
                        break;
                    case 1:
                        var4 >>= 28;
                        var4 <<= 27;
                        var4 ^= 1545254575;
                        float var291 = 0.72F * var1;
                        float var375 = 1.0F - var2;
                        var375 = 0.28F * var375;
                        float var292 = var291 + var375;
                        var375 = var6 * 1.4F;
                        float var405 = var2 * 2.0F;
                        var375 = var3.dA(var375, var405, 3);
                        var375 -= 0.5F;
                        var375 = 0.06F * var375;
                        float var293 = var292 + var375;
                        float var294 = TP.S(var293);
                        long var381 = var5;
                        long var420 = var381 + 1L;
                        var420 = var381 * var420;
                        long var382 = var420 & 1L;
                        long var431;
                        int var383 = (var431 = var382 - 0L) == 0L ? 0 : (var431 < 0L ? -1 : 1);
                        if (var383 == 0) {
                            var4 |= 575493984;
                            var4 ^= 1556688071;
                            int[] var384 = y;
                            int var406 = var4 - -1678358176;
                            int var407 = var406 * 1345870945;
                            int var408 = var407 >>> 2;
                            int var409 = var408 ^ 600218963;
                            int var410 = var409 ^ -91931009;
                            int var295 = t(var384, var294, var410);
                            var4 &= 963972180;
                            var4 &= -929804880;
                            var4 &= 1881748931;
                            var4 ^= 1343209992;
                            return var295;
                        }

                        var4 *= -395605063;
                        var4 <<= 5;
                        var4 |= -1096613935;
                        var4 ^= 134175210;
                        var4 ^= 1660912339;
                        break;
                    case 2:
                        var4 *= -2018371871;
                        var4 += -198341553;
                        var4 &= -1163865576;
                        var4 ^= -1315705691;
                        var4 ^= -29221755;
                        int[] var289 = mz;
                        int var367 = var4 - 217558436;
                        var367 *= 890842707;
                        var367 += -976011365;
                        var367 *= -1383328407;
                        var367 ^= -1876470556;
                        int var290 = I(var6, var2, var3, var289, true, var367);
                        var367 = var5 + 1;
                        var367 = var5 * var367;
                        var367 &= 1;
                        if (var367 == 0) {
                            var4 -= 1761416513;
                            var4 -= -1999939592;
                            var4 |= 1135244689;
                            var4 ^= 1522205245;
                            var4 &= 1418393955;
                            var4 *= -1985847071;
                            var4 += 313764039;
                            var4 ^= -1621347903;
                            return var290;
                        }

                        var4 |= -412625582;
                        var4 <<= 7;
                        var4 ^= 1616484808;
                        break;
                    case 3:
                        var4 += 1707910333;
                        var4 ^= -1148755639;
                        Integer var286 = var4;
                        if (var286 == null) {
                            break label237;
                        }

                        int[] var287 = dP;
                        int var354 = var4 - 584966406;
                        var354 ^= 1930253187;
                        var354 &= -1203744108;
                        var354 += 283583485;
                        var354 ^= 840402266;
                        int var288 = I(var6, var2, var3, var287, false, var354);
                        var354 = var5 + 1;
                        var354 = var5 * var354;
                        var354 &= 1;
                        if (var354 == 0) {
                            var4 = switch (var4) {
                                default -> var4 ^ 2105159553;
                                case -617084076 -> {
                                    var4 += -949316749;
                                    var4 |= 5046845;
                                    yield var4 ^ 2101884285;
                                }
                                case 1667149287 -> var4 ^ 1031658281;
                            };
                            var354 = var4 + 1;
                            var354 = var4 * var354;
                            int var403 = var4 + 2;
                            var354 *= var403;
                            int var404 = var4 + 3;
                            var354 *= var404;
                            var354 &= 7;
                            if (var354 != 0) {
                                break label237;
                            }

                            var4 *= -833101851;
                            var4 |= -344968906;
                            var4 *= 100164437;
                            var4 ^= 735287146;
                            var4 ^= -1855650380;
                            return var288;
                        }

                        var4 &= -1592330551;
                        var4 ^= 447948424;
                        break;
                    case 4:
                        var4 &= 122845839;
                        var4 ^= 1004139783;
                        Integer var283 = var4;
                        if (var283 == null) {
                            break label237;
                        }

                        int[] var284 = L;
                        int var349 = var4 << 3;
                        var349 ^= 1735219683;
                        int var285 = I(var6, var2, var3, var284, false, var349);
                        long var351 = var5;
                        long var418 = var351 + 1L;
                        var418 = var351 * var418;
                        long var352 = var418 & 1L;
                        long var430;
                        var349 = (var430 = var352 - 0L) == 0L ? 0 : (var430 < 0L ? -1 : 1);
                        if (var349 == 0) {
                            var4 *= 1260456377;
                            var4 ^= 1248978951;
                            var4 -= 486838581;
                            var4 |= -723534829;
                            var4 |= -1525305038;
                            var4 *= -1690082427;
                            var4 ^= -50581449;
                            return var285;
                        }

                        var4 >>= 3;
                        var4 |= 1414191053;
                        var4 |= 910821279;
                        var4 ^= -321334473;
                        break;
                    case 5:
                        var4 -= 483985816;
                        var4 ^= 1790299840;
                        Integer var280 = var4;
                        if (var280 == null) {
                            break label237;
                        }

                        int[] var281 = Je;
                        Integer var345 = var5;
                        if (var345 != null) {
                            var4 = switch (var4) {
                                case -1263766264 -> {
                                    var4 >>>= 28;
                                    var4 += -83299125;
                                    yield var4 ^ -1211230719;
                                }
                                case 1109940481 -> var4 ^ -1952653125;
                                default -> var4 ^ 1329298961;
                            };
                            var345 = var4;
                            if (var345 == null) {
                                break label237;
                            }

                            int var347 = var4 - 787050375;
                            var347 ^= -1225948533;
                            int var282 = I(var6, var2, var3, var281, false, var347);
                            var4 >>= 10;
                            var4 *= -2074512199;
                            var4 ^= -1185837072;
                            return var282;
                        }

                        var4 &= 1444682212;
                        var4 *= -1254375925;
                        var4 ^= 662806472;
                        break;
                    case 6:
                        var4 -= 1294981157;
                        var4 += -1246156010;
                        var4 ^= -473694933;
                        Integer var277 = var4;
                        if (var277 == null) {
                            break label237;
                        }

                        int[] var278 = q;
                        int var334 = var4 & 2081387154;
                        var334 <<= 9;
                        var334 &= -1995530223;
                        var334 -= 741684877;
                        var334 ^= 1895438504;
                        int var279 = I(var6, var2, var3, var278, true, var334);
                        var334 = var5 + 1;
                        var334 = var5 * var334;
                        var334 &= 1;
                        if (var334 == 0) {
                            var4 &= -543441562;
                            var4 >>>= 3;
                            var4 ^= -1627917670;
                            long var342 = var4;
                            long var416 = var342 + 1L;
                            var416 = var342 * var416;
                            long var343 = var416 & 1L;
                            long var429;
                            var334 = (var429 = var343 - 0L) == 0L ? 0 : (var429 < 0L ? -1 : 1);
                            if (var334 != 0) {
                                break label237;
                            }

                            var4 ^= 2138023763;
                            var4 ^= -1585126547;
                            return var279;
                        }

                        var4 <<= 10;
                        var4 += -163094406;
                        var4 <<= 1;
                        var4 |= -1477226850;
                        var4 ^= 1951988278;
                        break;
                    case 7:
                        var4 = switch (var4) {
                            case -84753056 -> {
                                var4 *= -1100340989;
                                var4 -= -284837289;
                                var4 ^= -1572551547;
                                yield var4 ^ 1012623318;
                            }
                            case 594379726 -> var4 ^ -1356698021;
                            default -> var4 ^ 546738382;
                        };
                        var9 = var4;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var422 = var9 + 2L;
                        var11 *= var422;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var428;
                        int var271 = (var428 = var9 - 0L) == 0L ? 0 : (var428 < 0L ? -1 : 1);
                        if (var271 != 0) {
                            break label237;
                        }

                        int var272 = var4 * -1273357327;
                        int var273 = var272 >> 14;
                        int var274 = var273 | 638371490;
                        int var275 = var274 ^ -1316594826;
                        int var276 = mg(var1, var6, var2, var3, var275);
                        int var324 = var5 + 1;
                        var324 = var5 * var324;
                        int var399 = var5 + 2;
                        var324 *= var399;
                        int var400 = var5 + 3;
                        var324 *= var400;
                        var324 &= 7;
                        if (var324 == 0) {
                            var4 += 991820230;
                            var4 ^= 42882305;
                            var324 = var4 + 1;
                            var324 = var4 * var324;
                            int var401 = var4 + 2;
                            var324 *= var401;
                            int var402 = var4 + 3;
                            var324 *= var402;
                            var324 &= 7;
                            if (var324 != 0) {
                                break label237;
                            }

                            switch (var4) {
                                case -1355321617:
                                default:
                                    var4 ^= -499979253;
                                    return var276;
                                case 380896609:
                                    var4 += -922373874;
                                    var4 >>>= 5;
                                    var4 ^= 1458704315;
                                    return var276;
                                case 1133084087:
                                    var4 ^= 1042457071;
                                    return var276;
                            }
                        }

                        var4 += -480828358;
                        var4 ^= 667967004;
                        break;
                    case 8:
                        var4 &= 1768503227;
                        var4 -= -2027823628;
                        var4 *= -1425032707;
                        var4 <<= 31;
                        var4 ^= -700991612;
                        int var260 = var4 + 1;
                        int var261 = var4 * var260;
                        int var317 = var4 + 2;
                        int var262 = var261 * var317;
                        var317 = var4 + 3;
                        int var263 = var262 * var317;
                        int var264 = var263 & 7;
                        if (var264 != 0) {
                            break label237;
                        }

                        int var265 = var4 ^ -1429209516;
                        int var266 = var265 ^ 966991808;
                        int var267 = N(var1, var6, var2, var3, var266);
                        var317 = var5 + 1;
                        var317 = var5 * var317;
                        int var393 = var5 + 2;
                        var317 *= var393;
                        int var394 = var5 + 3;
                        var317 *= var394;
                        var317 &= 7;
                        if (var317 == 0) {
                            var4 <<= 4;
                            var4 >>>= 5;
                            var4 ^= 1232061046;
                            var4 |= 265517819;
                            var4 &= -1881457456;
                            var4 ^= 1608317656;
                            return var267;
                        }

                        var4 &= 1707260832;
                        var4 ^= -1622190583;
                        var4 ^= 1089388865;
                        break;
                    case 9:
                        var4 = switch (var4) {
                            default -> var4 ^ 1387821848;
                            case -84753056 -> {
                                var4 *= 59353275;
                                yield var4 ^ -1795955177;
                            }
                            case 1078715591 -> var4 ^ 1039568664;
                        };
                        Integer var256 = var4;
                        if (var256 == null) {
                            break label237;
                        }

                        int var257 = var4 * 2016981961;
                        int var258 = var257 ^ 1059757267;
                        int var259 = Jb(var6, var2, var3, var258);
                        Integer var313 = var5;
                        if (var313 != null) {
                            var4 |= -958559906;
                            var4 += 441541163;
                            var4 &= -676142189;
                            var4 ^= -1665613540;
                            long var314 = var4;
                            long var414 = var314 + 1L;
                            var414 = var314 * var414;
                            long var315 = var414 & 1L;
                            long var425;
                            int var316 = (var425 = var315 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                            if (var316 != 0) {
                                break label237;
                            }

                            var4 &= -1695762075;
                            var4 ^= -628661748;
                            return var259;
                        }

                        switch (var4) {
                            case -789214885:
                            default:
                                var4 ^= 1970567035;
                                break label235;
                            case -170996937:
                                var4 *= 1291793095;
                                var4 >>>= 17;
                                var4 |= 1162147772;
                                var4 += 1945250806;
                                var4 ^= 580128634;
                                break label235;
                            case 421520753:
                                var4 ^= -313203969;
                                break label235;
                        }
                    case 10:
                        var4 >>= 24;
                        var4 &= -1350663017;
                        var4 ^= -602475675;
                        int var253 = var4 ^ 760980409;
                        int var254 = var253 ^ 1139624942;
                        int var255 = GV(var6, var2, var3, var254);
                        int var308 = var5 + 1;
                        var308 = var5 * var308;
                        int var391 = var5 + 2;
                        var308 *= var391;
                        int var392 = var5 + 3;
                        var308 *= var392;
                        var308 &= 7;
                        if (var308 == 0) {
                            var4 = switch (var4) {
                                default -> var4 ^ -430884535;
                                case -39431558 -> var4 ^ -901315194;
                                case 1936226295 -> {
                                    var4 += -637887583;
                                    var4 ^= 2088037361;
                                    var4 -= -2002677777;
                                    yield var4 ^ -245695940;
                                }
                            } >> 27;
                            var4 *= -1437122185;
                            var4 ^= 28316181;
                            return var255;
                        }

                        var4 *= 1280075701;
                        var4 -= -1832220600;
                        var4 |= -611175776;
                        var4 -= 1731690324;
                        var4 ^= 52436847;
                        break;
                    case 11:
                        var4 <<= 12;
                        var4 ^= 2040103095;
                        int var248 = var4 * 1262380993;
                        int var249 = var248 | -1157070200;
                        int var250 = var249 + -628871962;
                        int var251 = var250 ^ -292174891;
                        int var252 = ep(var6, var2, var3, var251);
                        long var10 = var5;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var427;
                        int var307 = (var427 = var10 - 0L) == 0L ? 0 : (var427 < 0L ? -1 : 1);
                        if (var307 == 0) {
                            var4 ^= 890429689;
                            var4 += 690051615;
                            var4 += 1690093839;
                            var4 -= -1676418704;
                            var4 ^= 341138337;
                            var4 += -178231043;
                            var4 -= -122411312;
                            var4 ^= 328268242;
                            return var252;
                        }

                        var4 += -582258902;
                        var4 ^= -1464218839;
                        break;
                    case 12:
                        var4 ^= 538480469;
                        var4 *= -1084549241;
                        var4 &= 637306857;
                        var4 ^= -119556866;
                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            break label237;
                        }

                        var8 = var4 * 241294483;
                        var8 -= 682170642;
                        var8 *= -187674179;
                        var8 += -601392761;
                        var8 ^= 273907574;
                        var8 = dQ(var6, var2, var3, -14012876, -12433328, var8);
                        int var236 = var5 + 1;
                        int var237 = var5 * var236;
                        int var238 = var237 & 1;
                        if (var238 == 0) {
                            var4 |= -1581677926;
                            var4 ^= -2086795882;
                            var9 = var4;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var426;
                            int var242 = (var426 = var9 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                            if (var242 != 0) {
                                break label237;
                            }

                            int var243 = var4 | 1956519802;
                            int var244 = var243 << 14;
                            int var245 = var244 - 2111324321;
                            int var246 = var245 * 77721387;
                            int var247 = var246 ^ -1869326775;
                            var8 = E(var8, var6, var2, var3, -9669764, var247);
                            switch (var4) {
                                case -1249585399:
                                    var4 ^= 1242844155;
                                    return var8;
                                case 2053486345:
                                    var4 ^= 91234047;
                                    var4 += -1009817075;
                                    var4 ^= 317380107;
                                    return var8;
                                case 2083098630:
                                default:
                                    var4 ^= -605412672;
                                    return var8;
                            }
                        }

                        var4 &= 753394544;
                        var4 *= -1320773123;
                        var4 -= -1301957700;
                        var4 ^= -212227876;
                        break;
                    default:
                        long var29 = switch (var4) {
                            case -84753056 -> {
                                var4 |= -2109474071;
                                yield var4 ^ -233342206;
                            }
                            default -> var4 ^ -1777395878;
                            case 668621173 -> var4 ^ 742717246;
                        };
                        long var207 = var29 + 1L;
                        long var208 = var29 * var207;
                        long var221 = var29 + 2L;
                        long var209 = var208 * var221;
                        long var30 = var29 + 3L;
                        long var210 = var209 * var30;
                        long var31 = var210 & 7L;
                        long var424;
                        var4 = (var424 = var31 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            MatchException var33 = new MatchException(null, null);
                            throw var33;
                        }
                        break label237;
                }
            }

            long var203 = var4;
            var7 = var203 + 1L;
            var7 = var203 * var7;
            long var204 = var7 & 1L;
            long var432;
            var5 = (var432 = var204 - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalStateException var206 = new IllegalStateException();
                throw var206;
            }
        }

        AssertionError var201 = new AssertionError();
        throw var201;
    }

    private static int dQ(float var0, float var1, rH var2, int var3, int var4, int var5) {
        int var8 = (int)var0;
        float var9 = var0 * 0.7F;
        float var10 = var1 * 38.0F;
        var9 = var2.dA(var9, var10, 3);
        var10 = var1 - 0.38F;
        var10 /= 0.22F;
        double var34 = var10;
        double var35 = Math.pow(var34, 2.0);
        double var36 = -var35;
        double var37 = Math.exp(var36);
        var10 = (float)var37;
        var9 = 0.45F * var9;
        var9 = 0.35F + var9;
        var10 = 0.25F * var10;
        int var11 = var8 + 1;
        var11 = var8 * var11;
        var8 = var11 & 1;
        if (var8 != 0) {
            int var6 = var5 - -1535032677;
            var6 ^= 1781254713;
            Integer var26 = var3;
            if (var26 != null) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            }
        } else {
            int var13 = var5 & -281664216;
            var13 -= 310216618;
            var13 <<= 19;
            var13 ^= 1533265387;
            var13 = var3 + 1;
            var13 = var3 * var13;
            var8 = var3 + 2;
            var13 *= var8;
            int var7 = var3 + 3;
            var13 *= var7;
            var13 &= 7;
            if (var13 == 0) {
                float var23 = var9 + var10;
                float var24 = TP.S(var23);
                return DP.Z(var3, var4, var24);
            }
        }

        IllegalStateException var22 = new IllegalStateException();
        throw var22;
    }

    private static int E(int var0, float var1, float var2, rH var3, int var4, int var5) {
        float var9 = var1 * 2.2F;
        float var10 = var2 * 9.0F;
        int var11 = var0 + 1;
        var11 = var0 * var11;
        int var12 = var0 + 2;
        var11 *= var12;
        int var8 = var0 + 3;
        var11 *= var8;
        var8 = var11 & 7;
        if (var8 == 0) {
            switch (var5) {
                case -1683066045:
                default:
                    int var24 = var5 ^ 179236773;
                    break;
                case -901711243:
                    int var23 = var5 ^ -129318372;
                    break;
                case 1582580668:
                    int var21 = var5 ^ 716888823;
                    var21 ^= 626056342;
            }

            float var27 = var9 + var10;
            var9 = var2 * 3.0F;
            var10 = var1 * 0.8F;
            var9 -= var10;
            float var28 = var3.R(var27, var9, 2);
            float var29 = var28 - 0.93F;
            float var30 = var29 * 9.0F;
            float var31 = TP.S(var30);
            float var32 = var31 * 0.55F;
            return DP.Z(var0, var4, var32);
        } else {
            int var6 = var5 - 719386021;
            var6 ^= -71809056;
            var6 = var0 + 1;
            var6 = var0 * var6;
            var8 = var0 + 2;
            var6 *= var8;
            int var7 = var0 + 3;
            var6 *= var7;
            var6 &= 7;
            if (var6 == 0) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            } else {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        }
    }

    private static int I(float var0, float var1, rH var2, int[] var3, boolean var4, int var5) {
        label66: {
            int var27;
            int var49;
            label65: {
                var49 = (int)var0;
                float var8 = var0 * 0.9F;
                float var9 = var1 * 1.6F;
                var8 = var2.dA(var8, var9, 4);
                var9 = var0 * 0.9F;
                var9 += 5.2F;
                float var10 = var1 * 1.6F;
                var9 = var2.dA(var9, ++var10, 4);
                var10 = var0 * 0.9F;
                float var11 = 3.5F * var8;
                var10 += var11;
                var10++;
                var11 = var1 * 1.6F;
                float var12 = 3.5F * var9;
                var11 += var12;
                var11 += 9.2F;
                var10 = var2.dA(var10, var11, 4);
                var11 = var0 * 1.1F;
                var12 = 3.0F * var10;
                var11 += var12;
                var12 = var1 * 2.0F;
                var9 = 3.0F * var9;
                var9 = var12 + var9;
                var9 = var2.dA(var11, var9, 5);
                var11 = var0 * 1.3F;
                var8 = 2.0F * var8;
                var8 = var11 + var8;
                var11 = var1 * 2.4F;
                var10 = 2.0F * var10;
                var10 = var11 + var10;
                var8 = var2.R(var8, var10, 4);
                double var91 = var8;
                double var92 = Math.pow(var91, 6.0);
                var8 = (float)var92;
                Integer var93 = var49;
                if (var93 != null) {
                    var27 = var5 + -1993624629;
                    var27 += -1431846783;
                    var27 <<= 5;
                    var27 ^= -770004777;
                    int var94 = var27 + 1;
                    int var95 = var27 * var94;
                    int var116 = var27 + 2;
                    int var96 = var95 * var116;
                    int var117 = var27 + 3;
                    int var97 = var96 * var117;
                    int var98 = var97 & 7;
                    if (var98 != 0) {
                        break label66;
                    }

                    var9 -= 0.28F;
                    var9 *= 1.9F;
                    var8 *= 0.35F;
                    var8 = var9 + var8;
                    var8 = TP.S(var8);
                    int var79 = var27 + 1134462310;
                    int var80 = var79 ^ -1815505533;
                    int var81 = t(var3, var8, var80);
                    if (!var4) {
                        var27 = switch (var27) {
                            case 848718903 -> {
                                var27 *= -1910915997;
                                var27 ^= 366784120;
                                var27 &= -2023177649;
                                yield var27 ^ 943577187;
                            }
                            case 1878459807 -> var27 ^ 1647112320;
                            default -> var27 ^ -1655002394;
                        };
                        int var59 = var27 + 1;
                        int var60 = var27 * var59;
                        int var61 = var60 & 1;
                        if (var61 != 0) {
                            break label66;
                        }

                        var49 = var81;
                        var27 &= 1197435774;
                        var27 ^= 2041852905;
                        break label65;
                    }
                    var27 = switch (var27) {
                        case -2046771964 -> var27 ^ 118807453;
                        default -> var27 ^ 1752257517;
                        case 848718903 -> {
                            var27 <<= 4;
                            yield var27 ^ 1185011023;
                        }
                    };
                    long var99 = var27;
                    long var123 = var99 + 1L;
                    long var124 = var99 * var123;
                    long var100 = var124 & 1L;
                    long var125;
                    int var101 = (var125 = var100 - 0L) == 0L ? 0 : (var125 < 0L ? -1 : 1);
                    if (var101 != 0) {
                        break label66;
                    }

                    var10 = var0 * 0.6F;
                    var10 += 11.0F;
                    var11 = var1 * 0.9F;
                    var10 = var2.dA(var10, var11, 3);
                    var10 -= 0.55F;
                    var10 *= 4.0F;
                    var10 = TP.S(var10);
                    Integer var41 = var49;
                    if (var41 != null) {
                        var27 = switch (var27) {
                            case 114792037 -> var27 ^ -2041809572;
                            default -> var27 ^ -2007949916;
                            case 1875318335 -> {
                                var27 >>= 23;
                                var27 &= 281091745;
                                yield var27 ^ 1649356628;
                            }
                        };
                        int var42 = var27 + 1;
                        var42 = var27 * var42;
                        int var119 = var27 + 2;
                        var42 *= var119;
                        int var120 = var27 + 3;
                        var42 *= var120;
                        var42 &= 7;
                        if (var42 != 0) {
                            break label66;
                        }

                        var42 = DP.Z(-15985856, -12947496, var8);
                        var8 = var10 * 0.7F;
                        var42 = DP.Z(var81, var42, var8);
                        var49 = var42;
                        var27 >>>= 8;
                        var27 <<= 21;
                        var27 *= -1323137983;
                        var27 ^= -1576961657;
                        break label65;
                    }

                    var27 *= 822881303;
                    var27 ^= 1364127829;
                } else {
                    var27 = var5 & -1272906364;
                    var27 ^= -1973665144;
                    var27 ^= 664506612;
                }

                long var35 = var27;
                long var67 = var35 + 1L;
                long var68 = var35 * var67;
                long var108 = var35 + 2L;
                long var69 = var68 * var108;
                long var36 = var35 + 3L;
                long var70 = var69 * var36;
                long var37 = var70 & 7L;
                long var126;
                var27 = (var126 = var37 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
                if (var27 == 0) {
                    AssertionError var40 = new AssertionError();
                    throw var40;
                }
                break label66;
            }

            int var62 = var27 + 1;
            var62 = var27 * var62;
            int var82 = var27 + 2;
            var62 *= var82;
            var82 = var27 + 3;
            var62 *= var82;
            var62 &= 7;
            if (var62 == 0) {
                return var49;
            }
        }

        IllegalStateException var39 = new IllegalStateException();
        throw var39;
    }

    private static int mg(float var0, float var1, float var2, rH var3, int var4) {
        int var6 = (int)var0;
        float var7 = var0 * 2.4F;
        float var8 = var1 * 1.2F;
        float var9 = var2 * 2.2F;
        var8 = var3.dA(var8, var9, 4);
        var8 = 0.55F * var8;
        var7 += var8;
        var8 = 0.25F * var2;
        var7 += var8;
        long var110 = var6;
        long var10 = var110 + 1L;
        var10 = var110 * var10;
        long var111 = var10 & 1L;
        long var202;
        int var112 = (var202 = var111 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
        if (var112 != 0) {
            switch (var4) {
                case -1938605975:
                default:
                    int var91 = var4 ^ -746124954;
                    break;
                case -1752462183:
                    int var89 = var4 * 712122259;
                    var89 ^= -2011013582;
                    break;
                case 1333423468:
                    int var88 = var4 ^ 411441342;
            }
        } else {
            label128: {
                int var5 = var4 * -249378223;
                var5 += 1606729764;
                var5 ^= 897276454;
                long var113 = var5;
                var10 = var113 + 1L;
                var10 = var113 * var10;
                long var12 = var113 + 2L;
                var10 *= var12;
                long var114 = var113 + 3L;
                var10 *= var114;
                long var115 = var10 & 7L;
                long var203;
                int var116 = (var203 = var115 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                label114:
                if (var116 == 0) {
                    double var117 = var7;
                    double var118 = Math.floor(var117);
                    var8 = (float)var118;
                    var7 -= var8;
                    int var120 = -2087378;
                    int var126 = -601540;
                    int var144 = -13865504;
                    float var204;
                    int var11 = (var204 = var7 - 0.33F) == 0.0F ? 0 : (var204 < 0.0F ? -1 : 1);
                    if (var11 < 0) {
                        var5 = switch (var5) {
                            default -> var5 ^ 621977251;
                            case 274050219 -> {
                                var5 ^= -421303574;
                                var5 &= 154264163;
                                var5 ^= -72985988;
                                yield var5 ^ -284162218;
                            }
                            case 1489263235 -> var5 ^ -1476764891;
                        };
                        float var145 = var7 / 0.33F;
                        int var153 = var5 ^ 314452961;
                        int var154 = var153 * -101315783;
                        int var155 = var154 & 1090615033;
                        int var156 = var155 ^ -1449224068;
                        float var146 = c(var145, var156);
                        var11 = DP.Z(var120, var126, var146);
                        Integer var157 = var6;
                        if (var157 == null) {
                            switch (var5) {
                                case 344364907:
                                    var5 -= 428062180;
                                    var5 ^= -764740242;
                                    break label128;
                                case 542767541:
                                default:
                                    var5 ^= -1043378023;
                                    break label128;
                                case 551912160:
                                    var5 ^= 283331321;
                                    break label128;
                            }
                        }

                        var5 &= 856089804;
                        var5 |= 1416661566;
                        var5 ^= -1992527470;
                        var5 |= -439918695;
                        var5 ^= -907850199;
                        int var158 = var5 + 1;
                        int var159 = var5 * var158;
                        int var160 = var159 & 1;
                        if (var160 != 0) {
                            break label114;
                        }

                        var11 = var11;
                        var5 *= -2089124755;
                        var5 *= -894097613;
                        var5 |= 1667855821;
                        var5 ^= 1348264136;
                        var5 ^= 1901630300;
                    } else {
                        var5 |= -283572529;
                        var5 -= 1425050133;
                        var5 |= 913263680;
                        var5 ^= -910090677;
                        Integer var161 = var5;
                        if (var161 == null) {
                            break label114;
                        }

                        float var205;
                        int var162 = (var205 = var7 - 0.66F) == 0.0F ? 0 : (var205 < 0.0F ? -1 : 1);
                        long var13 = var6;
                        long var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var13 = var15 & 1L;
                        long var206;
                        int var176 = (var206 = var13 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                        if (var176 != 0) {
                            var5 -= -122295512;
                            var5 ^= 1469094784;
                            break label128;
                        }

                        var5 |= 1552980100;
                        var5 &= -53689783;
                        var5 ^= -1412499207;
                        int var177 = var5 + 1;
                        int var178 = var5 * var177;
                        int var14 = var5 + 2;
                        int var179 = var178 * var14;
                        var14 = var5 + 3;
                        int var180 = var179 * var14;
                        int var181 = var180 & 7;
                        if (var181 != 0) {
                            break label114;
                        }

                        if (var162 < 0) {
                            var5 |= 1552918693;
                            var5 ^= -1702888940;
                            int var163 = var5 + 1;
                            int var164 = var5 * var163;
                            int var182 = var5 + 2;
                            int var165 = var164 * var182;
                            int var183 = var5 + 3;
                            int var166 = var165 * var183;
                            int var167 = var166 & 7;
                            if (var167 != 0) {
                                break label114;
                            }

                            float var168 = var7 - 0.33F;
                            float var169 = var168 / 0.33F;
                            int var184 = var5 & 230011892;
                            int var185 = var184 >>> 14;
                            int var186 = var185 >> 9;
                            int var187 = var186 ^ -1465911089;
                            float var170 = c(var169, var187);
                            var13 = var6;
                            var15 = var13 + 1L;
                            var15 = var13 * var15;
                            long var17 = var13 + 2L;
                            var15 *= var17;
                            var13 += 3L;
                            var15 *= var13;
                            var13 = var15 & 7L;
                            long var207;
                            int var191 = (var207 = var13 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                            if (var191 != 0) {
                                switch (var5) {
                                    case 1169178857:
                                        var5 >>>= 23;
                                        var5 >>>= 8;
                                        var5 <<= 14;
                                        var5 += -1673614598;
                                        var5 ^= -1252608493;
                                        break label128;
                                    case 1601143405:
                                        var5 ^= 1692704525;
                                        break label128;
                                    case 1878965997:
                                    default:
                                        var5 ^= -892290227;
                                        break label128;
                                }
                            }

                            var5 -= -117901526;
                            var5 -= -2094174755;
                            var5 += 1471697242;
                            var5 ^= -1314110265;
                            int var192 = var5 + 1;
                            int var193 = var5 * var192;
                            int var194 = var193 & 1;
                            if (var194 != 0) {
                                break label114;
                            }

                            int var127 = DP.Z(var126, var144, var170);
                            var11 = var127;
                            var5 -= 1896778640;
                            var5 *= 117715585;
                            var5 |= -1870699507;
                            var5 &= -1025811649;
                            var5 ^= -936979082;
                        } else {
                            var5 ^= -1919382090;
                            var5 >>= 16;
                            var5 <<= 10;
                            var5 ^= -559202161;
                            int var128 = var5 + 1;
                            int var129 = var5 * var128;
                            int var171 = var5 + 2;
                            int var130 = var129 * var171;
                            int var172 = var5 + 3;
                            int var131 = var130 * var172;
                            int var132 = var131 & 7;
                            if (var132 != 0) {
                                break label114;
                            }

                            var7 -= 0.66F;
                            var7 /= 0.34F;
                            int var133 = var5 - 1421344387;
                            int var134 = var133 & -1673058159;
                            int var135 = var134 ^ 547344580;
                            var7 = c(var7, var135);
                            int var105 = DP.Z(var144, var120, var7);
                            Integer var121 = var6;
                            if (var121 == null) {
                                var5 *= -305937437;
                                var5 ^= 660471588;
                                break label128;
                            }
                            var5 = switch (var5) {
                                case -618030739 -> var5 ^ 2145161587;
                                case -541054833 -> {
                                    var5 &= -1312988368;
                                    var5 ^= 1987300530;
                                    var5 ^= 2117056203;
                                    var5 |= 815013863;
                                    yield var5 ^ 4799134;
                                }
                                default -> var5 ^ 1071735660;
                            };
                            long var122 = var5;
                            var12 = var122 + 1L;
                            var12 = var122 * var12;
                            long var123 = var12 & 1L;
                            long var208;
                            int var124 = (var208 = var123 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                            if (var124 != 0) {
                                break label114;
                            }

                            var11 = var105;
                            var5 -= 1614909445;
                            var5 -= -1983168461;
                            var5 &= 298661571;
                            var5 -= 33071321;
                            var5 ^= -1250754703;
                        }
                    }

                    var8 = var0 - 0.82F;
                    long var136 = var6;
                    long var149 = var136 + 1L;
                    long var150 = var136 * var149;
                    long var195 = var136 + 2L;
                    long var151 = var150 * var195;
                    long var137 = var136 + 3L;
                    long var152 = var151 * var137;
                    long var138 = var152 & 7L;
                    long var209;
                    var6 = (var209 = var138 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        var5 *= 1887967369;
                        var5 |= -1633695186;
                        var5 |= 1994310183;
                        var5 ^= -677910714;
                        break label128;
                    }

                    var5 &= 155738190;
                    var5 *= -248020021;
                    var5 *= 1684246103;
                    var5 ^= 351465740;
                    Integer var94 = var5;
                    if (var94 != null) {
                        float var95 = var8 * 3.0F;
                        float var96 = TP.S(var95);
                        float var97 = var96 * 0.35F;
                        return DP.Z(var11, -2872, var97);
                    }
                }

                IllegalStateException var98 = new IllegalStateException();
                throw var98;
            }
        }

        RuntimeException var92 = new RuntimeException();
        throw var92;
    }

    private static int N(float var0, float var1, float var2, rH var3, int var4) {
        int var6 = (int)var0;
        float var7 = 0.55F * var2;
        var7 = 0.35F + var7;
        float var8 = 0.2F * var0;
        var7 += var8;
        var7 = TP.S(var7);
        int var43 = DP.Z(-1537506, -11654, var7);
        var8 = var1 * 4.2F;
        Integer var29 = var6;
        if (var29 == null) {
            int var24 = var4 * -2039306497;
            var24 &= 1524499035;
            var24 <<= 24;
            var24 -= -2087906938;
            var24 ^= 478085456;
            IllegalArgumentException var39 = new IllegalArgumentException();
            throw var39;
        } else {
            int var5 = var4 - 2137226670;
            var5 ^= 1529051001;
            int var30 = var5 + 1;
            var30 = var5 * var30;
            var5 = var30 & 1;
            if (var5 == 0) {
                float var12 = var2 * 1.4F;
                float var13 = var8 + var12;
                float var32 = var1 * 1.5F;
                var8 = var2 * 3.0F;
                float var33 = var3.dA(var32, var8, 3);
                float var34 = 1.6F * var33;
                float var14 = var13 + var34;
                double var15 = var14;
                double var16 = var15 * Math.PI;
                double var17 = Math.sin(var16);
                float var18 = (float)var17;
                float var19 = var18 - 0.35F;
                float var20 = var19 * 2.6F;
                float var21 = TP.S(var20);
                float var35 = var1 * 3.0F;
                var8 = var2 * 5.0F;
                float var36 = var3.dA(var35, var8, 2);
                float var37 = 0.45F * var36;
                float var38 = 0.55F + var37;
                float var22 = var21 * var38;
                float var23 = var22 * 0.75F;
                return DP.Z(var43, -7718394, var23);
            } else {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }
    }

    private static int Jb(float var0, float var1, rH var2, int var3) {
        int var5 = (int)var0;
        long var18 = var5;
        long var7 = var18 + 1L;
        var7 = var18 * var7;
        long var19 = var7 & 1L;
        long var49;
        var5 = (var49 = var19 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
        if (var5 == 0) {
            int var4 = switch (var3) {
                default -> var3 ^ 1331741407;
                case -329801732 -> {
                    int var9 = var3 - -957013205;
                    yield var9 ^ -1221181984;
                }
                case 919685168 -> var3 ^ -763410031;
            };
            var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            if (var5 == 0) {
                float var24 = var0 * 1.4F;
                float var6 = var1 * 2.5F;
                float var25 = var2.dA(var24, var6, 3);
                var5 = DP.Z(-6549736, -2084806, var25);
                var6 = var0 * 1.1F;
                var6 += 7.0F;
                float var41 = var1 * 2.0F;
                var6 = var2.dA(var6, var41, 5);
                float var42 = var0 * 2.2F;
                float var8 = var1 * 4.0F;
                float var43 = var2.R(var42, var8, 4);
                double var44 = var43;
                double var45 = Math.pow(var44, 5.0);
                float var46 = (float)var45;
                var6 -= 0.52F;
                var6 *= 5.0F;
                var6 = TP.S(var6);
                float var47 = 0.3F * var46;
                float var48 = 0.7F + var47;
                var6 *= var48;
                var6 *= 0.9F;
                return DP.Z(var5, -732456, var6);
            }
        } else {
            int var10 = var3 + 1809767979;
            var10 += -505391937;
            var10 -= -1534407411;
            var10 ^= -1907034318;
            var5 = var10 + 1;
            var5 = var10 * var5;
            int var39 = var10 + 2;
            var5 *= var39;
            var10 += 3;
            var5 *= var10;
            var10 = var5 & 7;
            if (var10 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }

    private static int GV(float var0, float var1, rH var2, int var3) {
        int var5 = (int)var0;
        float var6 = var0 * 1.2F;
        float var7 = var1 * 2.0F;
        var6 = var2.dA(var6, var7, 3);
        int var37 = DP.Z(-7729642, -3135952, var6);
        var7 = var2.ti(1, 1);
        var7 *= 0.8F;
        var7 = 0.9F + var7;
        float var8 = 0.35F;
        var7 = var0 - var7;
        var8 = var1 - var8;
        var8 *= 1.6F;
        float var9 = var7 * var7;
        float var10 = var8 * var8;
        var9 += var10;
        double var66 = var9;
        double var67 = Math.sqrt(var66);
        var9 = (float)var67;
        double var71 = var8;
        double var43 = var7;
        double var44 = Math.atan2(var71, var43);
        var7 = (float)var44;
        var8 = var7 * 4.5F;
        var10 = var9 * 2.0F;
        var10 = var2.g(var10, 0.0F);
        var10 = 0.3F * var10;
        var8 += var10;
        double var75 = var8;
        double var76 = Math.sin(var75);
        var8 = (float)var76;
        var8 = Math.abs(var8);
        int var77 = var5 + 1;
        int var78 = var5 * var77;
        var5 = var78 & 1;
        if (var5 == 0) {
            int var19 = var3 + -898451958;
            var19 &= 571902816;
            var19 |= 196197647;
            var19 *= -1553533965;
            var19 ^= -833248113;
            float var29 = Math.max(0.25F, var9);
            float var30 = var8 / var29;
            var8 = var9 * 9.0F;
            var7 *= 9.0F;
            double var69 = var7;
            double var70 = Math.cos(var69);
            var7 = (float)var70;
            var7 = 0.15F * var7;
            var7 = 0.85F + var7;
            var7 = var8 / var7;
            double var51 = var7;
            double var52 = Math.sin(var51);
            var7 = (float)var52;
            var7 = Math.abs(var7);
            float var31 = var30 * 9.0F;
            float var32 = TP.S(var31);
            float var33 = 1.0F - var32;
            var7 *= 9.0F;
            var7 = TP.S(var7);
            var7 = 1.0F - var7;
            float var34 = Math.max(var33, var7);
            float var35 = var34 * 0.95F;
            return DP.Z(var37, -16121341, var35);
        } else {
            int var4 = var3 & -2144934716;
            var4 -= 452197098;
            var4 |= -2118785670;
            var4 ^= 351584968;
            var5 = var4 + 1;
            var5 = var4 * var5;
            int var38 = var4 + 2;
            var5 *= var38;
            var4 += 3;
            var5 *= var4;
            var4 = var5 & 7;
            if (var4 == 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }
    }

    private static int ep(float var0, float var1, rH var2, int var3) {
        int var5 = (int)var0;
        int var6 = var3 ^ -2070713546;
        var6 *= 1689262073;
        var6 ^= -275397834;
        var6 = dQ(var0, var1, var2, -8485491, -4274997, var6);
        long var7 = var5;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var51;
        var5 = (var51 = var7 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var21 = var3 - -1677925889;
            var21 ^= -977275634;
            var21 ^= 1280813211;
            var21 ^= 780731061;
            IllegalArgumentException var32 = new IllegalArgumentException();
            throw var32;
        } else {
            int var4 = var3 & -1663936528;
            var4 ^= 585658216;
            var4 ^= -102027665;
            float var13 = var0 * 0.8F;
            float var26 = var1 * 1.6F;
            float var14 = var2.dA(var13, var26, 5);
            float var27 = 0.46F - var14;
            float var28 = var27 * 6.0F;
            float var29 = TP.S(var28);
            float var42 = var14 - 0.56F;
            float var43 = var42 * 6.0F;
            float var44 = TP.S(var43);
            float var8 = var0 * 2.0F;
            float var50 = var1 * 3.0F;
            var8 = var2.dA(var8, var50, 2);
            int var47 = DP.Z(-14926692, -11630864, var8);
            float var30 = var29 * 0.85F;
            var5 = DP.Z(var6, var47, var30);
            float var36 = var0 * 2.0F;
            float var37 = var36 + 4.0F;
            var8 = var1 * 3.0F;
            float var38 = var2.dA(var37, var8, 2);
            var6 = DP.Z(-5211614, -998822, var38);
            float var45 = var44 * 0.8F;
            var6 = DP.Z(var5, var6, var45);
            float var15 = var14 - 0.5F;
            float var16 = Math.abs(var15);
            float var17 = var16 * 22.0F;
            float var18 = 1.0F - var17;
            float var19 = TP.S(var18);
            float var20 = var19 * 0.35F;
            return DP.Z(var6, -8762696, var20);
        }
    }

    private static int t(int[] var0, float var1, int var2) {
        int var4 = System.identityHashCode(var0);
        float var5 = TP.S(var1);
        int var6 = var0.length;
        float var30 = --var6;
        var5 *= var30;
        var6 = var0.length;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        int var8 = var4 + 2;
        var7 *= var8;
        var4 += 3;
        var7 *= var4;
        var4 = var7 & 7;
        if (var4 != 0) {
            int var3 = var2 >>> 17;
            var3 ^= -2080943492;
            Integer var19 = var3;
            if (var19 != null) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        } else {
            int var10 = var2 | 1993780522;
            var10 += -1477821849;
            var10 ^= 1264419130;
            var4 = var10 + 1;
            var4 = var10 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var4 = var6 - 2;
                var6 = (int)var5;
                var4 = Math.min(var4, var6);
                var6 = var0[var4];
                var7 = var4 + 1;
                var7 = var0[var7];
                float var26 = var4;
                float var27 = var5 - var26;
                var10 >>= 30;
                var10 ^= 1465911099;
                float var16 = c(var27, var10);
                return DP.Z(var6, var7, var16);
            }
        }

        AssertionError var13 = new AssertionError();
        throw var13;
    }

    private static float c(float var0, int var1) {
        int var3 = (int)var0;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            int var14 = var1 * 565120563;
            var14 >>>= 3;
            var14 *= 102061361;
            var14 += 1937190548;
            var14 ^= 1874754716;
            RuntimeException var23 = new RuntimeException();
            throw var23;
        } else {
            int var2 = var1 >> 26;
            var2 -= -283158351;
            var2 *= -1941525817;
            var2 ^= 1304067704;
            Integer var10 = var2;
            if (var10 == null) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            } else {
                float var11 = TP.S(var0);
                float var12 = var11 * var11;
                float var21 = 2.0F * var11;
                float var22 = 3.0F - var21;
                return var12 * var22;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 108376145;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        KU = var4;
        int[] var19 = new int[]{-12964706, -7455541, -1947493, -681396, -467878};
        y = var19;
        int[] var20 = new int[]{-16317428, -14415050, -9823085, -4048018, -1147720};
        mz = var20;
        int[] var21 = new int[]{-16644587, -16113813, -14986026, -12606209, -4921601};
        dP = var21;
        int[] var22 = new int[]{-15597052, -11926256, -6090721, -1760454, -25952};
        L = var22;
        int[] var23 = new int[]{-16708602, -16500706, -15824315, -13642630, -5177392};
        Je = var23;
        int[] var24 = new int[]{-16514295, -15331287, -13426596, -9678928, -3885836};
        q = var24;
    }
}
