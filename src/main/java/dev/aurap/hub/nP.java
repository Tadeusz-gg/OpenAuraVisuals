package dev.aurap.hub;

import mvggs.modules.hud.hudstyle;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.List;

public final class nP {
    private static final float jN = 4.0F;
    private static final float Nk = 4.0F;
    private static final float LZ = 12.0F;
    private static final float Mr = 64.0F;
    private static final String w = "Drag to move  ·  Scroll to resize  ·  Right-click to reset";
    private static final TextStyle j;
    private static final TextStyle lH;
    private final BP Ie;
    private TextStyle tq;
    private TextStyle k;
    private final XF A;
    private final XF wO;
    private final XF Ul;
    private final Re T;
    private final XF qV;
    private tR_2 fu;
    private tR_2 i;
    private boolean zz;
    private boolean Q;
    private float Rk;
    private float zA;
    private tR_2 Bn;
    private float c;
    private float n;
    private float J;
    private float U;
    private float Td;
    private float B;
    private float WF;
    private float m;
    private float dL;
    private float D;
    private float RS;
    private float XZ;
    private float O;
    public static final int f;

    public nP(BP var1) {
        TextStyle var2 = j;
        this.tq = var2;
        var2 = lH;
        this.k = var2;
        kE_2 var3 = kE_2.SMOOTH;
        XF var5 = new XF(0.0F, var3);
        this.A = var5;
        var3 = kE_2.SNAPPY;
        XF var6 = new XF(0.0F, var3);
        this.wO = var6;
        var3 = kE_2.SNAPPY;
        XF var7 = new XF(0.0F, var3);
        this.Ul = var7;
        Re var8 = new Re(4.0F, 0.08F);
        this.T = var8;
        var3 = kE_2.SMOOTH;
        XF var9 = new XF(1.0F, var3);
        this.qV = var9;
        this.dL = Float.NaN;
        this.D = Float.NaN;
        this.Ie = var1;
    }

    public void EF(Oo var1) {
        int var2 = f;
        var2 ^= 244193962;
        int var3 = System.identityHashCode(this);
        TextStyle var4 = j;
        int var5 = var1.Hb();
        var4 = var4.color(var5);
        this.tq = var4;
        Integer var18 = var3;
        if (var18 != null) {
            var2 ^= -682921529;
            var2 -= -2127511210;
            var2 += -1080835417;
            var2 &= -39389707;
            var2 ^= -483879053;
            var18 = var2;
            if (var18 != null) {
                TextStyle var21 = lH;
                int var24 = var1.MD();
                TextStyle var22 = var21.color(var24);
                this.k = var22;
            } else {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var2 *= 265610329;
            var2 ^= 1559466876;
            var2 *= -866665847;
            var2 >>= 2;
            var2 ^= -1976820346;
            IllegalArgumentException var12 = new IllegalArgumentException();
            throw var12;
        }
    }

    public boolean K(tR_2 var1) {
        int var2 = f;
        var2 ^= 863091704;
        int var3 = System.identityHashCode(this);
        Integer var31 = var3;
        int var4 = of_2.Tk;
        var2 ^= var4;
        var2 ^= 475706417;
        of_2.Tk = 475706417;
        var4 = of_2.Tz;
        var2 ^= var4;
        var2 ^= -1988837544;
        of_2.Tz = -1988837544;
        if (var31 == null) {
            switch (var2) {
                case -1490908620:
                default:
                    var2 ^= -630857027;
                    break;
                case -647954435:
                    var2 &= 1184024524;
                    var2 <<= 12;
                    var2 >>= 29;
                    var2 >>>= 14;
                    var2 ^= -1184307013;
                    break;
                case 33698771:
                    var2 ^= -1642231948;
            }

            IllegalStateException var30 = new IllegalStateException();
            throw var30;
        } else {
            label41: {
                var2 += 1963767268;
                var2 ^= 277902886;
                var2 ^= 1744953224;
                tR_2 var32 = this.Bn;
                boolean var34;
                if (var32 == var1) {
                    var2 += 869945254;
                    var2 ^= 1849916919;
                    var31 = var2;
                    if (var31 == null) {
                        break label41;
                    }

                    var34 = true;
                    var2 -= -244296239;
                    var2 >>>= 9;
                    var2 ^= 1814822730;
                } else {
                    var2 = switch (var2) {
                        case 424400250 -> var2 ^ -1399882403;
                        case 922491983 -> {
                            var2 *= -2089000657;
                            var2 ^= 1741977221;
                            var2 |= -1084398325;
                            yield var2 ^ 1736932589;
                        }
                        default -> var2 ^ -719211287;
                    };
                    Integer var37 = var2;
                    if (var37 == null) {
                        break label41;
                    }

                    var34 = false;
                    var2 += -657219294;
                    var2 ^= -586563538;
                }

                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 == 0) {
                    return var34;
                }
            }

            IllegalArgumentException var35 = new IllegalArgumentException();
            throw var35;
        }
    }

    public float h() {
        int var1 = f;
        var1 ^= 2044230838;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 -= -123807465;
            var1 *= 1007847181;
            var1 >>= 1;
            var1 ^= -1976741150;
            long var21 = var1;
            long var30 = var21 + 1L;
            long var31 = var21 * var30;
            long var22 = var31 & 1L;
            long var32;
            var2 = (var32 = var22 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            var1 *= 118766889;
            var1 >>= 31;
            var1 *= 332646363;
            var1 ^= -1278180644;
            long var15 = var1;
            long var28 = var15 + 1L;
            long var29 = var15 * var28;
            long var16 = var29 & 1L;
            long var33;
            var1 = (var33 = var16 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.J;
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    public float Mo() {
        int var1 = f;
        var1 ^= 1713368428;
        int var2 = System.identityHashCode(this);
        Integer var9 = var2;
        if (var9 != null) {
            var1 += 2038384599;
            var1 ^= 450791116;
            return this.U;
        } else {
            var1 &= -1931762130;
            var1 ^= -1721131019;
            IllegalStateException var6 = new IllegalStateException();
            throw var6;
        }
    }

    public void H(lH_3 var1) {
        label402: {
            int var2 = f;
            var2 ^= -1658902182;
            int var3 = System.identityHashCode(this);
            XF var4 = this.A;
            int var5 = var1.J ? 1 : 0;
            Integer var6 = var3;
            if (var6 == null) {
                var2 >>>= 18;
                var2 &= -840328107;
                var2 ^= -1645476115;
            } else {
                var2 *= 2141569645;
                var2 += 1936956152;
                var2 *= -1718761745;
                var2 <<= 29;
                var2 ^= 1467261001;
                long var420 = var2;
                long var8 = var420 + 1L;
                var8 = var420 * var8;
                long var10 = var420 + 2L;
                var8 *= var10;
                long var421 = var420 + 3L;
                var8 *= var421;
                long var422 = var8 & 7L;
                long var530;
                int var423 = (var530 = var422 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                if (var423 != 0) {
                    break label402;
                }

                float var357;
                if (var5 != 0) {
                    var2 >>>= 8;
                    var2 >>>= 14;
                    var2 ^= -415246160;
                    var2 *= 823924739;
                    var2 ^= 1679941161;
                    Integer var356 = var2;
                    if (var356 == null) {
                        break label402;
                    }

                    var357 = 1.0F;
                    var2 ^= -1615889127;
                    var2 <<= 22;
                    var2 >>>= 1;
                    var2 ^= -650785510;
                } else {
                    var2 *= -910452033;
                    var2 *= 1669777807;
                    var2 += 1325195785;
                    var2 ^= 1549550459;
                    Integer var424 = var2;
                    if (var424 == null) {
                        break label402;
                    }

                    var357 = 0.0F;
                    switch (var2) {
                        case -2119448321:
                            var2 ^= 2087905700;
                            break;
                        case -507798937:
                        default:
                            var2 ^= 1155381362;
                            break;
                        case 999706873:
                            var2 &= -307799092;
                            var2 -= 1687074953;
                            var2 ^= 857888037;
                    }
                }

                var423 = var2 + 1;
                var423 = var2 * var423;
                int var7 = var2 + 2;
                var423 *= var7;
                var7 = var2 + 3;
                var423 *= var7;
                var423 &= 7;
                if (var423 != 0) {
                    break label402;
                }

                var4.H(var357);
                var4 = this.A;
                float var358 = var1.Ik;
                Integer var430 = var3;
                if (var430 != null) {
                    var2 >>>= 1;
                    var2 -= 1528260089;
                    var2 ^= 1212164038;
                    var430 = var2;
                    if (var430 == null) {
                        break label402;
                    }

                    float var287 = var4.N(var358);
                    boolean var288 = var1.J;
                    if (!var288) {
                        var2 *= -898712061;
                        var2 <<= 23;
                        var2 ^= 54464524;
                        Integer var289 = var2;
                        if (var289 == null) {
                            break label402;
                        }

                        tR_2 var290 = this.Bn;
                        long var359 = var3;
                        long var493 = var359 + 1L;
                        long var494 = var359 * var493;
                        long var9 = var359 + 2L;
                        long var495 = var494 * var9;
                        long var360 = var359 + 3L;
                        long var496 = var495 * var360;
                        long var361 = var496 & 7L;
                        long var531;
                        var5 = (var531 = var361 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var2 *= 531189245;
                            var2 ^= 700528508;
                            Integer var363 = var2;
                            if (var363 == null) {
                                break label402;
                            }

                            if (var290 != null) {
                                var2 = switch (var2) {
                                    default -> var2 ^ 1818668015;
                                    case 62895088 -> var2 ^ -1719006046;
                                    case 1943224480 -> {
                                        var2 &= -1595676934;
                                        var2 *= -1593758581;
                                        var2 -= -1634258676;
                                        yield var2 ^ 51379079;
                                    }
                                };
                                int var291 = var2 | 64147392;
                                int var292 = var291 * 1204678481;
                                int var293 = var292 * -347546819;
                                int var294 = var293 ^ 213476950;
                                int var295 = var294 ^ -1426749423;
                                this.SY(var1, var295);
                                var2 -= 1342970009;
                                var2 -= 1183506739;
                                var2 ^= 659973206;
                            } else {
                                switch (var2) {
                                    case -542583364:
                                    default:
                                        var2 ^= -264093791;
                                        break;
                                    case -271201581:
                                        var2 ^= -12657649;
                                        break;
                                    case 1943224480:
                                        var2 += -1982819895;
                                        var2 ^= -614133064;
                                }
                            }

                            Integer var296 = var2;
                            if (var296 == null) {
                                break label402;
                            }

                            this.fu = null;
                            this.i = null;
                            Integer var297 = var3;
                            if (var297 != null) {
                                var2 -= -630963665;
                                var2 &= -997002463;
                                var2 >>>= 30;
                                var2 ^= 1419871416;
                                long var298 = var2;
                                long var432 = var298 + 1L;
                                long var433 = var298 * var432;
                                long var299 = var433 & 1L;
                                long var532;
                                int var300 = (var532 = var299 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                if (var300 == 0) {
                                    int var301 = var2 - -635941010;
                                    int var302 = var301 | 803394492;
                                    int var303 = var302 | -1806231597;
                                    int var304 = var303 & 2107219448;
                                    int var305 = var304 ^ 1487689800;
                                    this.mX(null, var305);
                                    var1.Wa = Float.NaN;
                                    var1.gO = Float.NaN;
                                    return;
                                }
                                break label402;
                            }

                            var2 |= -2052797202;
                            var2 *= 1305770881;
                            var2 ^= 1746652115;
                        } else {
                            var2 &= -184860125;
                            var2 |= -42357936;
                            var2 ^= 1620554236;
                        }
                    } else {
                        var2 -= -2090084219;
                        var2 ^= 773103155;
                        var2 |= 49985323;
                        var2 &= 1984285060;
                        var2 ^= -1642351601;
                        int var306 = var2 + -995722669;
                        int var307 = var306 ^ -315837191;
                        this.aG(var307);
                        long var308 = var3;
                        long var434 = var308 + 1L;
                        long var435 = var308 * var434;
                        var8 = var308 + 2L;
                        long var436 = var435 * var8;
                        long var309 = var308 + 3L;
                        long var437 = var436 * var309;
                        long var310 = var437 & 7L;
                        long var533;
                        int var311 = (var533 = var310 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                        label396:
                        if (var311 == 0) {
                            var2 |= -304055393;
                            var2 -= 801468467;
                            var2 ^= -1881709250;
                            var2 ^= 343792735;
                            int var312 = var2 + 1;
                            int var313 = var2 * var312;
                            int var314 = var313 & 1;
                            if (var314 != 0) {
                                break label402;
                            }

                            float var315 = this.WF;
                            var1.gO = var315;
                            float var316 = this.m;
                            var1.Wa = var316;
                            tR_2 var317 = this.Bn;
                            label389:
                            if (var317 != null) {
                                var2 = switch (var2) {
                                    case -1296952223 -> var2 ^ 643935362;
                                    case 1436530189 -> {
                                        var2 <<= 24;
                                        var2 *= 1914016269;
                                        yield var2 ^ -1557393708;
                                    }
                                    default -> var2 ^ 1436169170;
                                };
                                boolean var318 = this.zz;
                                Integer var364 = var3;
                                if (var364 == null) {
                                    var2 |= 1938025428;
                                    var2 ^= -431753864;
                                    break label396;
                                }

                                var2 &= -458769427;
                                var2 ^= -1123483051;
                                int var365 = var2 + 1;
                                var365 = var2 * var365;
                                var365 &= 1;
                                if (var365 != 0) {
                                    break label402;
                                }

                                boolean var324;
                                if (var318) {
                                    var2 &= 800606842;
                                    var2 -= -21978900;
                                    var2 -= 1827404526;
                                    var2 <<= 8;
                                    var2 ^= -1122527140;
                                    long var319 = var2;
                                    long var438 = var319 + 1L;
                                    long var439 = var319 * var438;
                                    var8 = var319 + 2L;
                                    long var440 = var439 * var8;
                                    long var320 = var319 + 3L;
                                    long var441 = var440 * var320;
                                    long var321 = var441 & 7L;
                                    long var534;
                                    int var322 = (var534 = var321 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                    if (var322 != 0) {
                                        break label402;
                                    }

                                    boolean var323 = this.Q;
                                    long var368 = var3;
                                    long var497 = var368 + 1L;
                                    long var498 = var368 * var497;
                                    long var369 = var498 & 1L;
                                    long var535;
                                    var365 = (var535 = var369 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                                    if (var365 != 0) {
                                        switch (var2) {
                                            case 800409028:
                                            default:
                                                var2 ^= -101965325;
                                                break label396;
                                            case 914075228:
                                                var2 <<= 28;
                                                var2 |= 246646131;
                                                var2 ^= 1398775775;
                                                break label396;
                                            case 1451416815:
                                                var2 ^= 527484046;
                                                break label396;
                                        }
                                    }
                                    var2 = switch (var2) {
                                        case -248221180 -> var2 ^ 1903517692;
                                        case 914075228 -> {
                                            var2 -= 1271916876;
                                            var2 &= -1672558729;
                                            var2 ^= 113600544;
                                            var2 >>>= 5;
                                            yield var2 ^ 1213783232;
                                        }
                                        default -> var2 ^ 341615844;
                                    };
                                    var365 = var2 + 1;
                                    var365 = var2 * var365;
                                    var365 &= 1;
                                    if (var365 != 0) {
                                        break label402;
                                    }

                                    var324 = var323;
                                    switch (var2) {
                                        case -800514626:
                                            var2 ^= -1706155121;
                                            break;
                                        case 1278124457:
                                            var2 *= -1207083439;
                                            var2 ^= 211234123;
                                            var2 >>>= 16;
                                            var2 <<= 27;
                                            var2 ^= -766762317;
                                            break;
                                        case 2096345696:
                                        default:
                                            var2 ^= -20058793;
                                    }
                                } else {
                                    var2 -= -1064146728;
                                    var2 -= -143193402;
                                    var2 ^= -1750122704;
                                    Integer var374 = var2;
                                    if (var374 == null) {
                                        break label402;
                                    }

                                    boolean var375 = i_2.sW();
                                    int var442 = var3 + 1;
                                    var442 = var3 * var442;
                                    var442 &= 1;
                                    if (var442 != 0) {
                                        var2 += 351182458;
                                        var2 += 460798579;
                                        var2 *= 1739124871;
                                        var2 ^= -735239844;
                                        var2 ^= 1141490464;
                                        break label396;
                                    }

                                    var2 += 2043180794;
                                    var2 ^= 818133643;
                                    var2 ^= -433867319;
                                    long var445 = var2;
                                    var8 = var445 + 1L;
                                    var8 = var445 * var8;
                                    long var446 = var8 & 1L;
                                    long var536;
                                    var442 = (var536 = var446 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                                    if (var442 != 0) {
                                        break label402;
                                    }

                                    var324 = var375;
                                    var2 ^= -2018984983;
                                    var2 += 558246800;
                                    var2 ^= -2077236459;
                                }

                                var365 = var2 + 1;
                                var365 = var2 * var365;
                                int var448 = var2 + 2;
                                var365 *= var448;
                                var448 = var2 + 3;
                                var365 *= var448;
                                var365 &= 7;
                                if (var365 != 0) {
                                    break label402;
                                }

                                var365 = var3 + 1;
                                var365 = var3 * var365;
                                var365 &= 1;
                                if (var365 != 0) {
                                    switch (var2) {
                                        case -1880327507:
                                        default:
                                            var2 ^= -2006214148;
                                            break label396;
                                        case -95673677:
                                            var2 -= 640811167;
                                            var2 -= -1145784966;
                                            var2 |= 888017062;
                                            var2 ^= -1593612782;
                                            break label396;
                                        case 1913000716:
                                            var2 ^= 804695990;
                                            break label396;
                                    }
                                }

                                var2 += -1286313042;
                                var2 -= -1306778946;
                                var2 &= 1837024078;
                                var2 ^= 1094136374;
                                Integer var384 = var2;
                                if (var384 == null) {
                                    break label402;
                                }

                                if (var324) {
                                    var2 = switch (var2) {
                                        case -648840430 -> var2 ^ 604461916;
                                        case 674459956 -> {
                                            var2 &= -148538827;
                                            var2 ^= -1428082375;
                                            var2 |= -1714849363;
                                            yield var2 ^ 1959308127;
                                        }
                                        default -> var2 ^ 80922225;
                                    };
                                    long var325 = var2;
                                    long var450 = var325 + 1L;
                                    long var451 = var325 * var450;
                                    long var326 = var451 & 1L;
                                    long var537;
                                    int var327 = (var537 = var326 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                                    if (var327 != 0) {
                                        break label402;
                                    }

                                    tR_2 var328 = this.Bn;
                                    boolean var329 = var328.B();
                                    var384 = var3;
                                    if (var384 == null) {
                                        var2 ^= 1351520292;
                                        var2 *= -2040670747;
                                        var2 |= 1286249559;
                                        var2 ^= 1078379987;
                                        break label396;
                                    }

                                    var2 *= -2010054761;
                                    var2 &= 1710712665;
                                    var2 &= 1640516775;
                                    var2 &= -514760988;
                                    var2 ^= 632923674;
                                    var384 = var2;
                                    if (var384 == null) {
                                        break label402;
                                    }

                                    if (var329) {
                                        var2 |= -1158746784;
                                        var2 *= -1678257401;
                                        var2 ^= -271109942;
                                        long var330 = var2;
                                        long var452 = var330 + 1L;
                                        long var453 = var330 * var452;
                                        var8 = var330 + 2L;
                                        long var454 = var453 * var8;
                                        long var331 = var330 + 3L;
                                        long var455 = var454 * var331;
                                        long var332 = var455 & 7L;
                                        long var538;
                                        int var333 = (var538 = var332 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                                        if (var333 != 0) {
                                            break label402;
                                        }

                                        int var334 = var2 * -1367942773;
                                        int var335 = var334 * 1237294909;
                                        int var336 = var335 - 1346388603;
                                        int var337 = var336 ^ -1515864283;
                                        this.zj(var1, var337);
                                        var2 -= -12489419;
                                        var2 >>>= 1;
                                        var2 -= -285669355;
                                        var2 ^= -583401583;
                                        var2 ^= 2042607292;
                                        break label389;
                                    }

                                    var2 ^= -262632626;
                                    var2 |= 6574606;
                                    var2 |= -274133392;
                                    var2 ^= 1057978091;
                                    var2 ^= 1819461679;
                                } else {
                                    var2 ^= 1231484918;
                                    var2 >>>= 27;
                                    var2 &= -193423077;
                                    var2 |= 231491916;
                                    var2 ^= -1587771146;
                                }

                                int var338 = var2 & -312957462;
                                int var339 = var338 + 491351667;
                                int var340 = var339 ^ 256445229;
                                this.SY(var1, var340);
                                var2 += -776731593;
                                var2 ^= -217785790;
                            } else {
                                switch (var2) {
                                    case -1367296303:
                                        var2 ^= 174429071;
                                        break;
                                    case -819359109:
                                    default:
                                        var2 ^= 704134068;
                                        break;
                                    case 1436530189:
                                        var2 >>= 9;
                                        var2 |= -761655317;
                                        var2 |= -1084058412;
                                        var2 -= 2087970082;
                                        var2 ^= 247915886;
                                }
                            }

                            tR_2 var341 = this.Bn;
                            var5 = var3 + 1;
                            var5 = var3 * var5;
                            int var456 = var3 + 2;
                            var5 *= var456;
                            var456 = var3 + 3;
                            var5 *= var456;
                            var5 &= 7;
                            label359:
                            if (var5 == 0) {
                                var2 ^= 1225882065;
                                var2 |= 1800505281;
                                var2 += 1015403714;
                                var2 ^= -1900025196;
                                tR_2 var346;
                                if (var341 != null) {
                                    var2 *= 373467731;
                                    var2 ^= 459547540;
                                    int var342 = var2 + 1;
                                    int var343 = var2 * var342;
                                    int var344 = var343 & 1;
                                    if (var344 != 0) {
                                        break label402;
                                    }

                                    tR_2 var345 = this.Bn;
                                    long var392 = var3;
                                    long var499 = var392 + 1L;
                                    long var500 = var392 * var499;
                                    long var393 = var500 & 1L;
                                    long var539;
                                    var5 = (var539 = var393 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        var2 ^= 710634110;
                                        var2 ^= -194959195;
                                        break label359;
                                    }

                                    var2 ^= -598977852;
                                    var2 |= 807234391;
                                    var2 ^= -1296988895;
                                    var346 = var345;
                                    var2 &= 33698150;
                                    var2 >>= 30;
                                    var2 |= 654163049;
                                    var2 >>= 14;
                                    var2 ^= 951156718;
                                } else {
                                    var2 &= 1077790633;
                                    var2 ^= -1455746014;
                                    tR_2 var395 = this.i;
                                    long var458 = var3;
                                    var8 = var458 + 1L;
                                    var8 = var458 * var8;
                                    var10 = var458 + 2L;
                                    var8 *= var10;
                                    long var459 = var458 + 3L;
                                    var8 *= var459;
                                    long var460 = var8 & 7L;
                                    long var540;
                                    var456 = (var540 = var460 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                                    if (var456 != 0) {
                                        var2 *= 1430213079;
                                        var2 += 1160738500;
                                        var2 |= 2104953560;
                                        var2 ^= 1653821557;
                                        break label359;
                                    }

                                    var2 *= -1218278805;
                                    var2 ^= -126213943;
                                    var2 <<= 24;
                                    var2 += 1303964816;
                                    var2 ^= 1438271952;
                                    Integer var462 = var2;
                                    if (var462 == null) {
                                        break label402;
                                    }

                                    if (var395 != null) {
                                        var2 = switch (var2) {
                                            case -2147310272 -> {
                                                var2 -= 1148679362;
                                                var2 -= -1481780659;
                                                var2 *= -319812409;
                                                var2 ^= 641744379;
                                                yield var2 ^ 382448183;
                                            }
                                            case 1679258584 -> var2 ^ -619657964;
                                            default -> var2 ^ 568618417;
                                        };
                                        Integer var396 = var2;
                                        if (var396 == null) {
                                            break label402;
                                        }

                                        tR_2 var397 = this.i;
                                        var462 = var3;
                                        if (var462 == null) {
                                            switch (var2) {
                                                case -68875301:
                                                    var2 &= 630225166;
                                                    var2 ^= 155279974;
                                                    var2 ^= -1255312960;
                                                    break label359;
                                                case 1622890121:
                                                default:
                                                    var2 ^= 1277105962;
                                                    break label359;
                                                case 1987611951:
                                                    var2 ^= 1204470295;
                                                    break label359;
                                            }
                                        }

                                        var2 >>>= 4;
                                        var2 &= 1304235627;
                                        var2 *= -1361257573;
                                        var2 ^= -2130883411;
                                        var2 ^= 1881903370;
                                        var346 = var397;
                                        switch (var2) {
                                            case -689572236:
                                                var2 ^= 561712498;
                                                var2 ^= -818995426;
                                                break;
                                            case -93458292:
                                            default:
                                                var2 ^= 320725892;
                                                break;
                                            case 1104252711:
                                                var2 ^= -980388750;
                                        }
                                    } else {
                                        var2 >>= 26;
                                        var2 ^= -1717181856;
                                        var2 *= 450736139;
                                        var2 ^= -1725157687;
                                        var5 = var2 + 1;
                                        var5 = var2 * var5;
                                        var5 &= 1;
                                        if (var5 != 0) {
                                            break label402;
                                        }

                                        float var401 = this.WF;
                                        float var464 = this.m;
                                        var7 = var2 & -488876724;
                                        var7 ^= 2009542996;
                                        tR_2 var402 = this.dK(var401, var464, var1, var7);
                                        var462 = var3;
                                        if (var462 == null) {
                                            switch (var2) {
                                                case -1539602742:
                                                    var2 ^= -105562800;
                                                    break label359;
                                                case 405882807:
                                                default:
                                                    var2 ^= -500855131;
                                                    break label359;
                                                case 1217096265:
                                                    var2 <<= 22;
                                                    var2 *= 29449513;
                                                    var2 *= 2070134621;
                                                    var2 *= 1921443349;
                                                    var2 ^= -911467860;
                                                    break label359;
                                            }
                                        }

                                        var2 &= 1648893837;
                                        var2 -= 1972026239;
                                        var2 ^= -42300673;
                                        var462 = var2;
                                        if (var462 == null) {
                                            break label402;
                                        }

                                        var346 = var402;
                                        var2 |= 271115352;
                                        var2 &= -1926868136;
                                        var2 ^= 1033348160;
                                    }
                                }

                                this.fu = var346;
                                tR_2 var347 = this.fu;
                                var5 = var2 ^ -86456763;
                                var5 ^= 1216470432;
                                var5 ^= -1344458163;
                                this.mX(var347, var5);
                                long var348 = var3;
                                long var467 = var348 + 1L;
                                long var468 = var348 * var467;
                                long var349 = var468 & 1L;
                                long var541;
                                int var350 = (var541 = var349 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                                if (var350 == 0) {
                                    var2 = switch (var2) {
                                        case 951182360 -> {
                                            var2 -= 1551151194;
                                            yield var2 ^ 1751782179;
                                        }
                                        default -> var2 ^ 1379074887;
                                        case 1785652423 -> var2 ^ 745992275;
                                    };
                                    var4 = this.wO;
                                    float var406 = this.dL;
                                    int var407 = (Float.isNaN(var406)) ? 1 : 0;
                                    float var409;
                                    if (var407 != 0) {
                                        var2 &= -1057123239;
                                        var2 ^= -199782411;
                                        var2 *= 1880529293;
                                        var2 ^= -138979258;
                                        Integer var408 = var2;
                                        if (var408 == null) {
                                            break label402;
                                        }

                                        var409 = 0.0F;
                                        var2 *= -533103347;
                                        var2 -= 773872139;
                                        var2 >>>= 19;
                                        var2 <<= 6;
                                        var2 ^= 808850740;
                                    } else {
                                        var2 -= -1863260657;
                                        var2 &= 602716468;
                                        var2 |= 1689340564;
                                        var2 ^= 209038052;
                                        long var469 = var2;
                                        var8 = var469 + 1L;
                                        var8 = var469 * var8;
                                        long var470 = var8 & 1L;
                                        long var542;
                                        var456 = (var542 = var470 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
                                        if (var456 != 0) {
                                            break label402;
                                        }

                                        var409 = 1.0F;
                                        var2 ^= 122226911;
                                        var2 >>>= 27;
                                        var2 ^= 808606265;
                                    }

                                    var4.H(var409);
                                    var4 = this.Ul;
                                    float var410 = this.D;
                                    long var472 = var3;
                                    var8 = var472 + 1L;
                                    var8 = var472 * var8;
                                    var10 = var472 + 2L;
                                    var8 *= var10;
                                    long var473 = var472 + 3L;
                                    var8 *= var473;
                                    long var474 = var8 & 7L;
                                    long var543;
                                    var456 = (var543 = var474 - 0L) == 0L ? 0 : (var543 < 0L ? -1 : 1);
                                    if (var456 == 0) {
                                        var2 >>>= 31;
                                        var2 ^= -364922813;
                                        var456 = var2 + 1;
                                        var456 = var2 * var456;
                                        var7 = var2 + 2;
                                        var456 *= var7;
                                        var7 = var2 + 3;
                                        var456 *= var7;
                                        var456 &= 7;
                                        if (var456 != 0) {
                                            break label402;
                                        }

                                        var407 = Float.isNaN(var410) ? 1 : 0;
                                        float var417;
                                        if (var407 != 0) {
                                            var2 -= -1795157646;
                                            var2 ^= 1228798375;
                                            var2 ^= -1655216652;
                                            var407 = var2 + 1;
                                            var407 = var2 * var407;
                                            var456 = var2 + 2;
                                            var407 *= var456;
                                            var456 = var2 + 3;
                                            var407 *= var456;
                                            var407 &= 7;
                                            if (var407 != 0) {
                                                break label402;
                                            }

                                            var417 = 0.0F;
                                            var2 += 2034633949;
                                            var2 += 1314990989;
                                            var2 >>= 30;
                                            var2 &= 345706898;
                                            var2 ^= -1961214223;
                                        } else {
                                            var2 += -1175234907;
                                            var2 *= -326136907;
                                            var2 -= 62229030;
                                            var2 ^= -1017230569;
                                            Integer var483 = var2;
                                            if (var483 == null) {
                                                break label402;
                                            }

                                            var417 = 1.0F;
                                            switch (var2) {
                                                case -1147698839:
                                                    var2 ^= 1740308331;
                                                    break;
                                                case -1035092747:
                                                    var2 ^= 735581306;
                                                    var2 <<= 2;
                                                    var2 ^= 759995597;
                                                    break;
                                                case 171416987:
                                                default:
                                                    var2 ^= -1320155214;
                                            }
                                        }

                                        long var484 = var2;
                                        var8 = var484 + 1L;
                                        var8 = var484 * var8;
                                        var10 = var484 + 2L;
                                        var8 *= var10;
                                        long var485 = var484 + 3L;
                                        var8 *= var485;
                                        long var486 = var8 & 7L;
                                        long var544;
                                        var456 = (var544 = var486 - 0L) == 0L ? 0 : (var544 < 0L ? -1 : 1);
                                        if (var456 != 0) {
                                            break label402;
                                        }

                                        var4.H(var417);
                                        var4 = this.wO;
                                        float var418 = var1.Ik;
                                        float var354 = var4.N(var418);
                                        var4 = this.Ul;
                                        float var419 = var1.Ik;
                                        var456 = var3 + 1;
                                        var456 = var3 * var456;
                                        var3 = var456 & 1;
                                        if (var3 == 0) {
                                            var2 |= 274234777;
                                            var2 |= -1052237058;
                                            var2 ^= -553378493;
                                            var2 *= 1305203303;
                                            var2 ^= 1887833617;
                                            var3 = var2 + 1;
                                            var3 = var2 * var3;
                                            var456 = var2 + 2;
                                            var3 *= var456;
                                            var456 = var2 + 3;
                                            var3 *= var456;
                                            var3 &= 7;
                                            if (var3 == 0) {
                                                float var285 = var4.N(var419);
                                                return;
                                            }
                                            break label402;
                                        }

                                        var2 -= 1947833132;
                                        var2 += -1994969298;
                                        var2 ^= 1039908959;
                                    } else {
                                        var2 -= 558250369;
                                        var2 ^= 1758522993;
                                        var2 -= -1201554876;
                                        var2 ^= 808914642;
                                    }
                                } else {
                                    var2 *= -2009850391;
                                    var2 &= 384020310;
                                    var2 &= 1530214135;
                                    var2 ^= -1913840900;
                                }
                            } else {
                                switch (var2) {
                                    case -1925177421:
                                        var2 |= -1346203543;
                                        var2 -= -1390204836;
                                        var2 |= 1737637047;
                                        var2 &= -1074397412;
                                        var2 ^= -1166449232;
                                        break;
                                    case -1353444344:
                                        var2 ^= -2017960994;
                                        break;
                                    case 1973893955:
                                    default:
                                        var2 ^= 2133330012;
                                }
                            }
                        } else {
                            var2 <<= 24;
                            var2 *= 862378937;
                            var2 -= 774439645;
                            var2 ^= -650451057;
                        }
                    }
                } else {
                    var2 |= -13256486;
                    var2 ^= 1645864822;
                }
            }

            RuntimeException var277 = new RuntimeException();
            throw var277;
        }

        RuntimeException var278 = new RuntimeException();
        throw var278;
    }

    private void mX(tR_2 var1, int var2) {
        XF var134 = null;
        float var152 = 0.0F;
        int var4 = System.identityHashCode(this);
        BP var5 = this.Ie;
        Integer var6 = var4;
        if (var6 == null) {
            int var101 = var2 * -366362533;
            var101 ^= 1929717355;
        } else {
            label168: {
                int var3 = var2 | 1517852967;
                var3 *= 1125303777;
                var3 >>= 15;
                var3 *= 1628158671;
                var3 ^= 1422268456;
                long var111 = var3;
                long var8 = var111 + 1L;
                var8 = var111 * var8;
                long var112 = var8 & 1L;
                long var184;
                int var113 = (var184 = var112 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                if (var113 == 0) {
                    List var108 = var5.TR();
                    Iterator var109 = var108.iterator();
                    Iterator var110 = var109;

                    var3 = switch (var3) {
                        default -> var3 ^ 1514949905;
                        case 1255283534 -> var3 ^ -298697094;
                        case 1311400017 -> {
                            var3 &= -180330370;
                            var3 -= -1336132044;
                            var3 &= -284162140;
                            var3 >>>= 4;
                            yield var3 ^ 1527075660;
                        }
                    };

                    while (true) {
                        var113 = var3 + 1;
                        var113 = var3 * var113;
                        var113 &= 1;
                        if (var113 != 0) {
                            break;
                        }

                        boolean var117 = var110.hasNext();
                        long var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var185;
                        int var123 = (var185 = var7 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                        if (var123 != 0) {
                            var3 ^= -1887419604;
                            var3 |= 1516066712;
                            var3 *= 1077763131;
                            var3 ^= 1224598835;
                            break label168;
                        }

                        var3 -= -384973130;
                        var3 >>>= 11;
                        var3 *= -482829535;
                        var3 ^= 1239182093;
                        var7 = var3;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var186;
                        int var127 = (var186 = var7 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                        if (var127 != 0) {
                            break;
                        }

                        if (!var117) {
                            var3 |= -1159064712;
                            var3 ^= -784584364;
                            var3 |= -1394890667;
                            var3 ^= -1524569218;
                            var4 = var3 + 1;
                            var4 = var3 * var4;
                            var4 &= 1;
                            if (var4 == 0) {
                                return;
                            }
                            break;
                        }

                        var3 += 832070734;
                        var3 *= -800004543;
                        var3 += 1457125017;
                        var3 ^= 1213133467;
                        Integer var118 = var3;
                        if (var118 == null) {
                            break;
                        }

                        Object var119 = var110.next();
                        tR_2 var120 = (tR_2)var119;
                        Integer var128 = var4;
                        if (var128 == null) {
                            switch (var3) {
                                case -2028674449:
                                    var3 ^= -1318335120;
                                    break label168;
                                case 1246716952:
                                    var3 ^= -1682499080;
                                    var3 &= -333162176;
                                    var3 <<= 31;
                                    var3 >>= 12;
                                    var3 ^= 378616827;
                                    break label168;
                                case 1887340072:
                                default:
                                    var3 ^= 1856163062;
                                    break label168;
                            }
                        }
                        var3 = switch (var3) {
                            case -2131816099 -> var3 ^ -1337967112;
                            default -> var3 ^ 1539768092;
                            case 1246716952 -> {
                                var3 &= -1866783896;
                                yield var3 ^ 204191668;
                            }
                        };
                        int var129 = var3 + 1;
                        int var130 = var3 * var129;
                        int var142 = var3 + 2;
                        int var131 = var130 * var142;
                        int var143 = var3 + 3;
                        int var132 = var131 * var143;
                        int var133 = var132 & 7;
                        if (var133 != 0) {
                            break;
                        }

                        label163: {
                            var134 = var120.PN;
                            if (var120 == var1) {
                                var3 <<= 4;
                                var3 *= 1006790587;
                                var3 += 1783908238;
                                var3 += 1774139236;
                                var3 ^= 799584528;
                                var8 = var3;
                                long var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var187;
                                int var147 = (var187 = var8 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                                if (var147 != 0) {
                                    break;
                                }

                                boolean var148 = var120.jV();
                                int var165 = var4 + 1;
                                int var166 = var4 * var165;
                                int var179 = var4 + 2;
                                int var167 = var166 * var179;
                                int var180 = var4 + 3;
                                int var168 = var167 * var180;
                                int var169 = var168 & 7;
                                if (var169 != 0) {
                                    switch (var3) {
                                        case 831413474:
                                            var3 ^= 1298300830;
                                            break label168;
                                        case 842119437:
                                        default:
                                            var3 ^= -1249636590;
                                            break label168;
                                        case 1994626338:
                                            var3 >>>= 17;
                                            var3 |= 1718229905;
                                            var3 -= 585643373;
                                            var3 ^= 1427324287;
                                            break label168;
                                    }
                                }

                                var3 &= 502398711;
                                var3 |= -1266890277;
                                var3 |= -1256396882;
                                var3 -= -591222291;
                                var3 ^= -1865130540;
                                Integer var170 = var3;
                                if (var170 == null) {
                                    break;
                                }

                                if (var148) {
                                    var3 *= -1929340437;
                                    var3 &= 1109714653;
                                    var3 ^= -1013418043;
                                    var8 = var3;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var188;
                                    int var151 = (var188 = var8 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                                    if (var151 != 0) {
                                        break;
                                    }

                                    var152 = 1.0F;
                                    var3 *= 1001910689;
                                    var3 ^= 146569755;
                                    break label163;
                                }

                                switch (var3) {
                                    case -812148992:
                                    default:
                                        var3 ^= -186520037;
                                        break;
                                    case 707956803:
                                        var3 ^= -277788119;
                                        break;
                                    case 1240402886:
                                        var3 >>>= 28;
                                        var3 |= 1001275968;
                                        var3 -= 568683854;
                                        var3 ^= -1537899906;
                                }
                            } else {
                                switch (var3) {
                                    case 203462588:
                                        var3 &= 245229716;
                                        var3 ^= -1986406609;
                                        var3 -= 72533457;
                                        var3 ^= 1021036386;
                                        break;
                                    case 477841375:
                                    default:
                                        var3 ^= 432183420;
                                        break;
                                    case 1514604537:
                                        var3 ^= 997485899;
                                }
                            }

                            Integer var171 = var3;
                            if (var171 == null) {
                                break;
                            }

                            var152 = 0.0F;
                            switch (var3) {
                                case -1113762168:
                                    var3 ^= 974845573;
                                    var3 ^= 985606387;
                                    var3 *= 446885015;
                                    var3 ^= -1522244372;
                                    break;
                                case -230285098:
                                    var3 ^= -505661687;
                                    break;
                                case 397238076:
                                default:
                                    var3 ^= 459177151;
                            }
                        }

                        var134.H(var152);
                        Integer var135 = var4;
                        if (var135 == null) {
                            var3 |= 1573534992;
                            var3 ^= -917797179;
                            break label168;
                        }

                        var3 >>>= 15;
                        var3 |= -645929383;
                        var3 &= 435336642;
                        var3 ^= -482617330;
                        Integer var136 = var3;
                        if (var136 == null) {
                            break;
                        }

                        boolean var140;
                        if (var120 == var1) {
                            var3 &= -1556442531;
                            var3 &= -1909264786;
                            var3 |= -1444768933;
                            var3 ^= -1080231922;
                            var3 ^= -43728113;
                            var7 = var3;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var189;
                            int var139 = (var189 = var7 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                            if (var139 != 0) {
                                break;
                            }

                            var140 = true;
                            var3 >>= 22;
                            var3 ^= 1592944478;
                        } else {
                            var3 -= -451504592;
                            var3 &= 2141098503;
                            var3 -= -1221981750;
                            var3 ^= -1828674363;
                            var140 = false;
                            var3 |= -1992136892;
                            var3 -= 1171873407;
                            var3 >>>= 9;
                            var3 ^= -1589080022;
                        }

                        int var153 = var3 + 1;
                        int var154 = var3 * var153;
                        int var174 = var3 + 2;
                        int var155 = var154 * var174;
                        int var175 = var3 + 3;
                        int var156 = var155 * var175;
                        int var157 = var156 & 7;
                        if (var157 != 0) {
                            break;
                        }

                        var120.W = var140;
                        var3 &= -675724348;
                        var3 *= 1000916289;
                        var3 ^= 1038721964;
                    }
                }

                AssertionError var107 = new AssertionError();
                throw var107;
            }
        }

        IllegalStateException var103 = new IllegalStateException();
        throw var103;
    }

    private tR_2 dK(float var1, float var2, lH_3 var3, int var4) {
        tR_2 var414 = null;
        boolean var430 = false;
        label421: {
            int var6 = System.identityHashCode(this);
            tR_2 var7 = null;
            boolean var8 = false;
            BP var9 = this.Ie;
            List var252 = var9.TR();
            long var10 = var6;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            long var14 = var10 + 2L;
            var12 *= var14;
            var10 += 3L;
            var12 *= var10;
            var10 = var12 & 7L;
            long var463;
            int var257 = (var463 = var10 - 0L) == 0L ? 0 : (var463 < 0L ? -1 : 1);
            int var48;
            if (var257 != 0) {
                switch (var4) {
                    case -985422278:
                        var48 = var4 ^ -1347110943;
                        break;
                    case -868532077:
                    default:
                        var48 = var4 ^ 2084425477;
                        break;
                    case 927953180:
                        var48 = var4 >> 27;
                        var48 |= 1506586630;
                        var48 &= -699273772;
                        var48 ^= 447166296;
                }
            } else {
                var48 = switch (var4) {
                    default -> var4 ^ -1301374330;
                    case 927953180 -> {
                        var48 = var4 | 135423909;
                        var48 *= 1813155919;
                        yield var48 ^ 54073773;
                    }
                    case 2021465702 -> var4 ^ -1327213121;
                };
                Iterator var253 = var252.iterator();
                Iterator var254 = var253;
                var7 = var7;
                var8 = var8;
                var48 |= 1997086839;
                var48 *= 1877203813;
                var48 -= -1553150457;
                var48 &= -2111589452;
                var48 ^= 2109460996;

                label394:
                while (true) {
                    boolean var258 = var254.hasNext();
                    long var11 = var6;
                    long var13 = var11 + 1L;
                    var13 = var11 * var13;
                    long var15 = var11 + 2L;
                    var13 *= var15;
                    var11 += 3L;
                    var13 *= var11;
                    var11 = var13 & 7L;
                    long var464;
                    int var310 = (var464 = var11 - 0L) == 0L ? 0 : (var464 < 0L ? -1 : 1);
                    if (var310 != 0) {
                        switch (var48) {
                            case 1120866919:
                                var48 ^= -2044545065;
                                break label394;
                            case 1758875980:
                            default:
                                var48 ^= -1367313472;
                                break label394;
                            case 2109227920:
                                var48 >>>= 29;
                                var48 ^= 1256691551;
                                break label394;
                        }
                    }

                    var48 |= -2075573500;
                    var48 >>= 14;
                    var48 ^= -204458099;
                    var48 ^= -1742706865;
                    Integer var311 = var48;
                    if (var311 == null) {
                        break label421;
                    }

                    if (!var258) {
                        var48 *= -1808076705;
                        var48 ^= -686760747;
                        var6 = var48 + 1;
                        var6 = var48 * var6;
                        var6 &= 1;
                        if (var6 == 0) {
                            return var7;
                        }
                        break label421;
                    }
                    var48 = switch (var48) {
                        case -1810913497 -> {
                            var48 >>= 6;
                            var48 >>>= 14;
                            yield var48 ^ 378759445;
                        }
                        default -> var48 ^ 644922399;
                        case 775869260 -> var48 ^ 1208424815;
                    };
                    var10 = var48;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var465;
                    int var262 = (var465 = var10 - 0L) == 0L ? 0 : (var465 < 0L ? -1 : 1);
                    if (var262 != 0) {
                        break label421;
                    }

                    Object var263 = var254.next();
                    tR_2 var264 = (tR_2)var263;
                    Integer var312 = var6;
                    if (var312 == null) {
                        var48 -= -2039303169;
                        var48 >>>= 21;
                        var48 += 1377970564;
                        var48 &= 1118244726;
                        var48 ^= 147167576;
                        break;
                    }

                    var48 *= -1792809177;
                    var48 ^= -1770130640;
                    Integer var313 = var48;
                    if (var313 == null) {
                        break label421;
                    }

                    boolean var314 = var264.JK;
                    if (var314) {
                        var48 = switch (var48) {
                            case -2137236285 -> {
                                var48 <<= 7;
                                var48 -= 200848235;
                                var48 *= 1421210799;
                                var48 -= -36009062;
                                yield var48 ^ 256725899;
                            }
                            case -1103304425 -> var48 ^ 1973586076;
                            default -> var48 ^ 388371167;
                        };
                        Integer var317 = var48;
                        if (var317 == null) {
                            break label421;
                        }

                        float var318 = var264.J;
                        int var366 = var6 + 1;
                        int var367 = var6 * var366;
                        int var418 = var6 + 2;
                        int var368 = var367 * var418;
                        int var419 = var6 + 3;
                        int var369 = var368 * var419;
                        int var370 = var369 & 7;
                        if (var370 != 0) {
                            switch (var48) {
                                case -1869247753:
                                default:
                                    var48 ^= 847203130;
                                    break label394;
                                case 520793043:
                                    var48 ^= 1479244037;
                                    break label394;
                                case 1758538570:
                                    var48 ^= 1601176824;
                                    var48 >>= 21;
                                    var48 ^= 1256691425;
                                    break label394;
                            }
                        }

                        var48 += 1849321890;
                        var48 -= 1791394022;
                        var48 |= 523593693;
                        var48 ^= -1876262137;
                        Integer var371 = var48;
                        if (var371 == null) {
                            break label421;
                        }

                        float var466;
                        int var319 = (var466 = var318 - 0.3F) == 0.0F ? 0 : (var466 < 0.0F ? -1 : 1);
                        if (var319 >= 0) {
                            var48 += -804509018;
                            var48 ^= -568931838;
                            Integer var320 = var48;
                            if (var320 == null) {
                                break label421;
                            }

                            boolean var321 = var264.sg(var3);
                            Integer var376 = var6;
                            if (var376 == null) {
                                var48 -= -1377256259;
                                var48 *= 1472862195;
                                var48 ^= 1232810257;
                                break;
                            }

                            var48 &= -1621627392;
                            var48 ^= -1774751779;
                            if (!var321) {
                                var48 = switch (var48) {
                                    case -1754944547 -> {
                                        var48 &= 1352170096;
                                        yield var48 ^ 2095194926;
                                    }
                                    default -> var48 ^ 1548781135;
                                    case 575666014 -> var48 ^ -15273931;
                                };
                                var7 = var7;
                                Integer var354 = var6;
                                if (var354 == null) {
                                    switch (var48) {
                                        case -433498375:
                                        default:
                                            var48 ^= -1066025510;
                                            break label394;
                                        case 462823971:
                                            var48 ^= 424064750;
                                            break label394;
                                        case 1826752894:
                                            var48 += 1512865024;
                                            var48 -= 1911816000;
                                            var48 |= -1147496521;
                                            var48 &= -951409024;
                                            var48 ^= -1913843236;
                                            break label394;
                                    }
                                }

                                var48 |= 1145130963;
                                var48 ^= -1821186706;
                                var8 = var8;
                                var48 |= -1238942952;
                                var48 *= -81065655;
                                var48 ^= -1692951503;
                            } else {
                                var48 <<= 16;
                                var48 ^= 1013185809;
                                float var322 = var264.Au;
                                var12 = var6;
                                var14 = var12 + 1L;
                                var14 = var12 * var14;
                                long var16 = var12 + 2L;
                                var14 *= var16;
                                var12 += 3L;
                                var14 *= var12;
                                var12 = var14 & 7L;
                                long var467;
                                int var380 = (var467 = var12 - 0L) == 0L ? 0 : (var467 < 0L ? -1 : 1);
                                if (var380 != 0) {
                                    var48 ^= -326014844;
                                    var48 *= 259348753;
                                    var48 &= 653980952;
                                    var48 |= -1054288749;
                                    var48 ^= -1953668401;
                                    break;
                                }

                                var48 |= -452712037;
                                var48 ^= -820108621;
                                float var323 = var322 - 2.0F;
                                float var468;
                                int var324 = (var468 = var1 - var323) == 0.0F ? 0 : (var468 < 0.0F ? -1 : 1);
                                if (var324 >= 0) {
                                    var48 -= -1685244878;
                                    var48 *= 1681262767;
                                    var48 ^= -149953310;
                                    int var325 = var48 + 1;
                                    int var326 = var48 * var325;
                                    int var385 = var48 + 2;
                                    int var327 = var326 * var385;
                                    int var386 = var48 + 3;
                                    int var328 = var327 * var386;
                                    int var329 = var328 & 7;
                                    if (var329 != 0) {
                                        break label421;
                                    }

                                    float var330 = var264.gd;
                                    float var331 = var330 + 2.0F;
                                    float var469;
                                    int var332 = (var469 = var1 - var331) == 0.0F ? 0 : (var469 < 0.0F ? -1 : 1);
                                    var12 = var6;
                                    var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var12 = var14 & 1L;
                                    long var470;
                                    int var389 = (var470 = var12 - 0L) == 0L ? 0 : (var470 < 0L ? -1 : 1);
                                    if (var389 != 0) {
                                        var48 |= -1913923150;
                                        var48 ^= -1794347866;
                                        break;
                                    }
                                    var48 = switch (var48) {
                                        case -761107768 -> {
                                            var48 += 496651271;
                                            var48 &= -678275841;
                                            yield var48 ^ -729808613;
                                        }
                                        default -> var48 ^ -774936855;
                                        case 1323477216 -> var48 ^ -1397037908;
                                    };
                                    var12 = var48;
                                    var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var16 = var12 + 2L;
                                    var14 *= var16;
                                    var12 += 3L;
                                    var14 *= var12;
                                    var12 = var14 & 7L;
                                    long var471;
                                    int var393 = (var471 = var12 - 0L) == 0L ? 0 : (var471 < 0L ? -1 : 1);
                                    if (var393 != 0) {
                                        break label421;
                                    }

                                    if (var332 <= 0) {
                                        var48 += -191442896;
                                        var48 &= -1197495520;
                                        var48 &= -1508120742;
                                        var48 ^= -927532957;
                                        Integer var333 = var48;
                                        if (var333 == null) {
                                            break label421;
                                        }

                                        float var334 = var264.eU;
                                        float var335 = var334 - 2.0F;
                                        float var472;
                                        int var336 = (var472 = var2 - var335) == 0.0F ? 0 : (var472 < 0.0F ? -1 : 1);
                                        Integer var398 = var6;
                                        if (var398 == null) {
                                            var48 >>>= 20;
                                            var48 ^= -948305304;
                                            var48 ^= -1919052865;
                                            break;
                                        }

                                        var48 >>>= 2;
                                        var48 += -1113531721;
                                        var48 *= 2116657139;
                                        var48 >>= 31;
                                        var48 ^= -369153599;
                                        int var399 = var48 + 1;
                                        int var400 = var48 * var399;
                                        int var420 = var48 + 2;
                                        int var401 = var400 * var420;
                                        int var421 = var48 + 3;
                                        int var402 = var401 * var421;
                                        int var403 = var402 & 7;
                                        if (var403 != 0) {
                                            break label421;
                                        }

                                        if (var336 >= 0) {
                                            var48 ^= 241059352;
                                            var48 ^= 610081336;
                                            var11 = var48;
                                            var13 = var11 + 1L;
                                            var13 = var11 * var13;
                                            var11 = var13 & 1L;
                                            long var473;
                                            int var339 = (var473 = var11 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
                                            if (var339 != 0) {
                                                break label421;
                                            }

                                            float var340 = var264.CW;
                                            float var341 = var340 + 2.0F;
                                            float var474;
                                            int var342 = (var474 = var2 - var341) == 0.0F ? 0 : (var474 < 0.0F ? -1 : 1);
                                            var12 = var6;
                                            var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            var12 = var14 & 1L;
                                            long var475;
                                            int var408 = (var475 = var12 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                                            if (var408 != 0) {
                                                var48 *= -949133347;
                                                var48 >>= 31;
                                                var48 ^= -1256691549;
                                                break;
                                            }

                                            var48 += 1309954565;
                                            var48 *= 953666433;
                                            var48 -= -1563143598;
                                            var48 -= 1747640623;
                                            var48 ^= -1526468892;
                                            Integer var409 = var48;
                                            if (var409 == null) {
                                                break label421;
                                            }

                                            if (var342 > 0) {
                                                var48 &= 1674803472;
                                                var48 ^= 1034176625;
                                                Integer var347 = var48;
                                                if (var347 == null) {
                                                    break label421;
                                                }

                                                var7 = var7;
                                                var11 = var6;
                                                var13 = var11 + 1L;
                                                var13 = var11 * var13;
                                                var11 = var13 & 1L;
                                                long var476;
                                                int var350 = (var476 = var11 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                                                if (var350 != 0) {
                                                    var48 >>= 20;
                                                    var48 -= -826416668;
                                                    var48 -= 1934788164;
                                                    var48 += 53836848;
                                                    var48 ^= -1950186866;
                                                    break;
                                                }

                                                var48 &= -836723728;
                                                var48 -= -1484100256;
                                                var48 += 840080809;
                                                var48 ^= -974067296;
                                                var11 = var48;
                                                var13 = var11 + 1L;
                                                var13 = var11 * var13;
                                                var11 = var13 & 1L;
                                                long var477;
                                                int var353 = (var477 = var11 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                                                if (var353 != 0) {
                                                    break label421;
                                                }

                                                var8 = var8;
                                                var48 |= -109580741;
                                                var48 &= 805223566;
                                                var48 |= -272346140;
                                                var48 ^= -1840857986;
                                            } else {
                                                var48 = switch (var48) {
                                                    default -> var48 ^ -2122368500;
                                                    case 891357057 -> {
                                                        var48 >>= 11;
                                                        var48 &= -1206124204;
                                                        var48 |= 2145170482;
                                                        var48 += -1465212700;
                                                        yield var48 ^ -425449769;
                                                    }
                                                    case 1037836310 -> var48 ^ -423969311;
                                                };
                                                Integer var343 = var48;
                                                if (var343 == null) {
                                                    break label421;
                                                }

                                                boolean var344 = var264.HI(var3);
                                                var12 = var6;
                                                var14 = var12 + 1L;
                                                var14 = var12 * var14;
                                                var12 = var14 & 1L;
                                                long var478;
                                                int var412 = (var478 = var12 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                                if (var412 != 0) {
                                                    var48 &= 669904436;
                                                    var48 -= 478017004;
                                                    var48 -= 379789927;
                                                    var48 >>= 10;
                                                    var48 ^= -1257023666;
                                                    break;
                                                }
                                                label411: {
                                                    var48 = switch (var48) {
                                                        case -836537407 -> {
                                                            var48 &= 1688560012;
                                                            var48 |= -1948693584;
                                                            yield var48 ^ 446380361;
                                                        }
                                                        case 130374357 -> var48 ^ -649692932;
                                                        default -> var48 ^ 1884537739;
                                                    };
                                                    if (!var344) {
                                                        var48 += 607554566;
                                                        var48 |= 511558782;
                                                        var48 |= 642984538;
                                                        var48 -= 957956011;
                                                        var48 ^= 921171281;
                                                        if (var8) {
                                                            var48 *= 575753747;
                                                            var48 >>= 10;
                                                            var48 *= 1507532447;
                                                            var48 |= 1572986447;
                                                            var48 ^= -1363861119;
                                                            Integer var413 = var48;
                                                            if (var413 == null) {
                                                                break label421;
                                                            }

                                                            var414 = var7;
                                                            Integer var424 = var6;
                                                            if (var424 == null) {
                                                                switch (var48) {
                                                                    case -748093858:
                                                                        var48 ^= -2033867289;
                                                                        var48 >>>= 18;
                                                                        var48 -= -664060322;
                                                                        var48 ^= 1836269649;
                                                                        break label394;
                                                                    case 198894528:
                                                                        var48 ^= -1445943128;
                                                                        break label394;
                                                                    case 1919895905:
                                                                    default:
                                                                        var48 ^= 1834372249;
                                                                        break label394;
                                                                }
                                                            }
                                                            var48 = switch (var48) {
                                                                case -748093858 -> {
                                                                    var48 >>= 25;
                                                                    var48 <<= 9;
                                                                    var48 |= -2024379729;
                                                                    var48 |= -258796867;
                                                                    yield var48 ^ 20116408;
                                                                }
                                                                case -262031572 -> var48 ^ -954827134;
                                                                default -> var48 ^ 1393339586;
                                                            };
                                                            int var425 = var48 + 1;
                                                            int var426 = var48 * var425;
                                                            int var454 = var48 + 2;
                                                            int var427 = var426 * var454;
                                                            int var455 = var48 + 3;
                                                            int var428 = var427 * var455;
                                                            int var429 = var428 & 7;
                                                            if (var429 != 0) {
                                                                break label421;
                                                            }

                                                            var430 = var8;
                                                            switch (var48) {
                                                                case -1131101919:
                                                                default:
                                                                    var48 ^= 720517030;
                                                                    break label411;
                                                                case -20117241:
                                                                    var48 += 1435191526;
                                                                    var48 ^= -1474523070;
                                                                    var48 *= 976108997;
                                                                    var48 ^= 2057251320;
                                                                    var48 ^= -178822990;
                                                                    break label411;
                                                                case 1939848359:
                                                                    var48 ^= -1412843197;
                                                                    break label411;
                                                            }
                                                        }

                                                        var48 *= 1687778613;
                                                        var48 += -1357045212;
                                                        var48 ^= -265322614;
                                                    } else {
                                                        var48 += 859826686;
                                                        var48 |= 1331248592;
                                                        var48 <<= 6;
                                                        var48 ^= 701676647;
                                                    }

                                                    var414 = var264;
                                                    var14 = var6;
                                                    var16 = var14 + 1L;
                                                    var16 = var14 * var16;
                                                    var14 = var16 & 1L;
                                                    long var479;
                                                    int var296 = (var479 = var14 - 0L) == 0L ? 0 : (var479 < 0L ? -1 : 1);
                                                    if (var296 != 0) {
                                                        var48 ^= -1449171416;
                                                        var48 ^= -551860564;
                                                        var48 *= 2024418423;
                                                        var48 &= 1517085783;
                                                        var48 ^= 277034777;
                                                        break;
                                                    }

                                                    var48 <<= 28;
                                                    var48 &= -629733456;
                                                    var48 ^= -1886259373;
                                                    int var297 = var48 + 1;
                                                    int var298 = var48 * var297;
                                                    int var299 = var298 & 1;
                                                    if (var299 != 0) {
                                                        break label421;
                                                    }

                                                    var430 = var344;
                                                    switch (var48) {
                                                        case -544082093:
                                                            var48 &= -2000214987;
                                                            var48 |= 330600826;
                                                            var48 *= -916791077;
                                                            var48 += -1153530055;
                                                            var48 ^= 938709139;
                                                            break;
                                                        case -386024816:
                                                        default:
                                                            var48 ^= 167132060;
                                                            break;
                                                        case 1145505794:
                                                            var48 ^= -1560278175;
                                                    }
                                                }

                                                var7 = var414;
                                                int var300 = var6 + 1;
                                                int var301 = var6 * var300;
                                                int var345 = var6 + 2;
                                                int var302 = var301 * var345;
                                                int var346 = var6 + 3;
                                                int var303 = var302 * var346;
                                                int var304 = var303 & 7;
                                                if (var304 != 0) {
                                                    var48 *= 1263779697;
                                                    var48 ^= 1215159821;
                                                    break;
                                                }

                                                var48 &= -1203776148;
                                                var48 ^= 1182739204;
                                                var48 ^= 592324190;
                                                var10 = var48;
                                                var14 = var10 + 1L;
                                                var14 = var10 * var14;
                                                var10 = var14 & 1L;
                                                long var480;
                                                int var307 = (var480 = var10 - 0L) == 0L ? 0 : (var480 < 0L ? -1 : 1);
                                                if (var307 != 0) {
                                                    break label421;
                                                }

                                                var8 = var430;
                                                switch (var48) {
                                                    case -1069889457:
                                                    default:
                                                        var48 ^= -1692012833;
                                                        break;
                                                    case 596862285:
                                                        var48 ^= -1938168889;
                                                        break;
                                                    case 1564006458:
                                                        var48 *= -522299221;
                                                        var48 >>>= 13;
                                                        var48 |= 1742369749;
                                                        var48 >>= 23;
                                                        var48 ^= 2109227871;
                                                }
                                            }
                                        } else {
                                            var48 -= 1519146094;
                                            var48 ^= -593490426;
                                            var48 += -1975636177;
                                            var48 ^= 1667912158;
                                            var7 = var7;
                                            var10 = var6;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var10 = var12 & 1L;
                                            long var481;
                                            int var294 = (var481 = var10 - 0L) == 0L ? 0 : (var481 < 0L ? -1 : 1);
                                            if (var294 != 0) {
                                                var48 |= 1757339474;
                                                var48 &= -2139906323;
                                                var48 -= -1785257363;
                                                var48 *= 918528277;
                                                var48 ^= -1028098901;
                                                break;
                                            }

                                            var48 ^= 662842686;
                                            var48 ^= 1222080703;
                                            Integer var295 = var48;
                                            if (var295 == null) {
                                                break label421;
                                            }

                                            var8 = var8;
                                            var48 += 668383142;
                                            var48 ^= -2017688303;
                                        }
                                    } else {
                                        var48 -= -1950734445;
                                        var48 >>= 24;
                                        var48 >>>= 23;
                                        var48 ^= 909850977;
                                        Integer var287 = var48;
                                        if (var287 == null) {
                                            break label421;
                                        }

                                        var7 = var7;
                                        var10 = var6;
                                        var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        var14 = var10 + 2L;
                                        var12 *= var14;
                                        var10 += 3L;
                                        var12 *= var10;
                                        var10 = var12 & 7L;
                                        long var482;
                                        int var291 = (var482 = var10 - 0L) == 0L ? 0 : (var482 < 0L ? -1 : 1);
                                        if (var291 != 0) {
                                            var48 *= 1593789901;
                                            var48 |= 2089490308;
                                            var48 ^= 891848945;
                                            break;
                                        }

                                        var48 *= -1037002125;
                                        var48 += 1631494211;
                                        var48 += 162216084;
                                        var48 ^= -492040183;
                                        var8 = var8;
                                        var48 ^= 1457545856;
                                        var48 *= -893260325;
                                        var48 >>>= 23;
                                        var48 ^= 2109227866;
                                    }
                                } else {
                                    var48 *= -1495949373;
                                    var48 ^= -1680222771;
                                    var48 &= -1048132563;
                                    var48 ^= -1562536968;
                                    Integer var282 = var48;
                                    if (var282 == null) {
                                        break label421;
                                    }

                                    var7 = var7;
                                    var10 = var6;
                                    var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    var14 = var10 + 2L;
                                    var12 *= var14;
                                    var10 += 3L;
                                    var12 *= var10;
                                    var10 = var12 & 7L;
                                    long var483;
                                    int var286 = (var483 = var10 - 0L) == 0L ? 0 : (var483 < 0L ? -1 : 1);
                                    if (var286 != 0) {
                                        var48 *= -1986943831;
                                        var48 -= 35395368;
                                        var48 ^= -7197983;
                                        break;
                                    }

                                    var48 *= -1266866287;
                                    var48 |= -1093100105;
                                    var48 ^= 271647249;
                                    var8 = var8;
                                    var48 *= -342230137;
                                    var48 += 2001770723;
                                    var48 |= 1033847994;
                                    var48 *= 1429731385;
                                    var48 ^= 1606763543;
                                }
                            }
                        } else {
                            var48 >>= 26;
                            var48 ^= -954191307;
                            var7 = var7;
                            Integer var277 = var6;
                            if (var277 == null) {
                                var48 -= 1571898133;
                                var48 ^= -1849090587;
                                break;
                            }

                            var48 -= -2006787180;
                            var48 &= -1022188742;
                            var48 -= -1511720965;
                            var48 ^= 1270247328;
                            var10 = var48;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var484;
                            int var281 = (var484 = var10 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                            if (var281 != 0) {
                                break label421;
                            }

                            var8 = var8;
                            switch (var48) {
                                case -1851931233:
                                    var48 -= 673673546;
                                    var48 |= -1689226086;
                                    var48 -= 23264682;
                                    var48 |= 1892335313;
                                    var48 ^= -2023506843;
                                    break;
                                case -393032324:
                                default:
                                    var48 ^= -884787621;
                                    break;
                                case 302013961:
                                    var48 ^= 113963637;
                            }
                        }
                    } else {
                        var48 >>>= 8;
                        var48 |= -1579961414;
                        var48 += 2145923142;
                        var48 ^= 1826578219;
                        var10 = var48;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var485;
                        int var268 = (var485 = var10 - 0L) == 0L ? 0 : (var485 < 0L ? -1 : 1);
                        if (var268 != 0) {
                            break label421;
                        }

                        var7 = var7;
                        int var269 = var6 + 1;
                        int var270 = var6 * var269;
                        int var315 = var6 + 2;
                        int var271 = var270 * var315;
                        int var316 = var6 + 3;
                        int var272 = var271 * var316;
                        int var273 = var272 & 7;
                        if (var273 != 0) {
                            switch (var48) {
                                case -1976857590:
                                default:
                                    var48 ^= -1120058052;
                                    break label394;
                                case 770780003:
                                    var48 ^= 197820274;
                                    break label394;
                                case 1298444143:
                                    var48 -= -611999999;
                                    var48 <<= 14;
                                    var48 |= 745605747;
                                    var48 |= 1637496111;
                                    var48 ^= -1491326941;
                                    break label394;
                            }
                        }

                        var48 |= -648252436;
                        var48 &= -434407400;
                        var48 ^= -568848625;
                        int var274 = var48 + 1;
                        int var275 = var48 * var274;
                        int var276 = var275 & 1;
                        if (var276 != 0) {
                            break label421;
                        }

                        var8 = var8;
                        var48 ^= -453612196;
                        var48 >>>= 21;
                        var48 |= -2034880508;
                        var48 ^= -82938777;
                    }
                }
            }

            var6 = var48 + 1;
            var6 = var48 * var6;
            var48 = var6 & 1;
            if (var48 == 0) {
                IllegalArgumentException var244 = new IllegalArgumentException();
                throw var244;
            }
        }

        AssertionError var243 = new AssertionError();
        throw var243;
    }

    public boolean Wy(int var1) {
        label120: {
            int var2 = f;
            var2 ^= 957730565;
            int var4 = System.identityHashCode(this);
            BP var5 = this.Ie;
            lH_3 var89 = var5.G();
            int var6 = var89.J ? 1 : 0;
            int var7 = var4 + 1;
            var7 = var4 * var7;
            var7 &= 1;
            if (var7 == 0) {
                var2 = switch (var2) {
                    case -1431425256 -> var2 ^ 1297052388;
                    case -754676992 -> {
                        var2 += 793469260;
                        var2 &= -1444061698;
                        yield var2 ^ 823323569;
                    }
                    default -> var2 ^ -689521878;
                };
                Integer var109 = var1;
                if (var109 == null) {
                    break label120;
                }

                if (var6 == 0) {
                    var2 &= 991806189;
                    var2 ^= 1348833962;
                    var6 = var1 + 1;
                    var6 = var1 * var6;
                    var6 &= 1;
                    if (var6 == 0) {
                        return false;
                    }
                    break label120;
                }

                var2 -= 2000008913;
                var2 <<= 5;
                var2 &= 604445822;
                var2 ^= 523036630;
                var6 = var2 & 532113130;
                var6 += 234302752;
                var6 ^= 1698026693;
                this.aG(var6);
                float var102 = this.WF;
                int var110 = var4 + 1;
                var110 = var4 * var110;
                int var8 = var4 + 2;
                var110 *= var8;
                var8 = var4 + 3;
                var110 *= var8;
                var110 &= 7;
                if (var110 == 0) {
                    var2 = switch (var2) {
                        case -117707176 -> var2 ^ -1212308787;
                        case 455795670 -> {
                            var2 -= -1587769531;
                            yield var2 ^ -932488007;
                        }
                        default -> var2 ^ -2091868236;
                    };
                    long var115 = var1;
                    long var9 = var115 + 1L;
                    var9 = var115 * var9;
                    long var116 = var9 & 1L;
                    long var153;
                    var110 = (var153 = var116 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
                    if (var110 != 0) {
                        break label120;
                    }

                    float var118 = this.m;
                    var8 = var2 + -2059315197;
                    var8 &= -1812553977;
                    var8 |= -61709255;
                    var8 |= -1002260624;
                    var8 ^= -910588313;
                    tR_2 var103 = this.dK(var102, var118, var89, var8);
                    if (var103 == null) {
                        var2 *= 1301217619;
                        var2 += -1483536228;
                        var2 -= -923224108;
                        var2 ^= -1911067251;
                        return false;
                    }
                    var2 = switch (var2) {
                        case -1314584536 -> {
                            var2 *= 1475905275;
                            var2 >>= 12;
                            yield var2 ^ -975715733;
                        }
                        case -522233338 -> var2 ^ -504602403;
                        default -> var2 ^ -339380120;
                    };
                    long var119 = var1;
                    var9 = var119 + 1L;
                    var9 = var119 * var9;
                    long var120 = var9 & 1L;
                    long var154;
                    var110 = (var154 = var120 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                    if (var110 != 0) {
                        break label120;
                    }

                    float var122 = this.WF;
                    float var123 = var103.M(var122);
                    var8 = var4 + 1;
                    var8 = var4 * var8;
                    int var148 = var4 + 2;
                    var8 *= var148;
                    int var149 = var4 + 3;
                    var8 *= var149;
                    var8 &= 7;
                    if (var8 != 0) {
                        switch (var2) {
                            case -1028026367:
                            default:
                                var2 ^= 49996987;
                                break;
                            case -975757483:
                                var2 *= -2109889973;
                                var2 ^= 1704940882;
                                break;
                            case -26967864:
                                var2 ^= 1786460964;
                        }
                    } else {
                        var2 <<= 17;
                        var2 ^= -1473908926;
                        var2 <<= 21;
                        var2 ^= -1981344236;
                        float var143 = this.m;
                        float var144 = var103.D(var143);
                        boolean var90 = var103.vo(var123, var144, var1, var89);
                        if (var90) {
                            var2 *= 1194580741;
                            var2 |= -53626479;
                            var2 &= -1042374154;
                            var2 |= 127213897;
                            var2 ^= -2102111246;
                            long var130 = var1;
                            var9 = var130 + 1L;
                            var9 = var130 * var9;
                            long var131 = var9 & 1L;
                            long var155;
                            int var98 = (var155 = var131 - 0L) == 0L ? 0 : (var155 < 0L ? -1 : 1);
                            if (var98 == 0) {
                                return true;
                            }
                            break label120;
                        }

                        var2 ^= -901458141;
                        var2 += -1209159533;
                        var2 ^= -1382798422;
                        Integer var91 = var1;
                        if (var91 == null) {
                            break label120;
                        }

                        if (var1 != 0) {
                            var2 ^= 836192813;
                            var2 -= 1165009676;
                            var2 += -1702409885;
                            var2 ^= 362428530;
                            if (var1 == 1) {
                                var2 += 1630009452;
                                var2 &= 1676424577;
                                var2 ^= -1594685795;
                                Integer var87 = var1;
                                if (var87 != null) {
                                    var103.qI();
                                    return true;
                                }
                            } else {
                                var2 &= -794155813;
                                var2 -= -1467364653;
                                var2 >>= 14;
                                var2 |= 1100921405;
                                var2 ^= -344475117;
                                Integer var88 = var1;
                                if (var88 != null) {
                                    return false;
                                }
                            }
                            break label120;
                        }

                        var2 *= 907706429;
                        var2 *= 1465941255;
                        var2 *= 1569890325;
                        var2 ^= 1808510430;
                        Integer var92 = var1;
                        if (var92 == null) {
                            break label120;
                        }

                        this.Bn = var103;
                        float var93 = this.WF;
                        float var124 = var103.PC;
                        float var94 = var93 - var124;
                        this.c = var94;
                        float var95 = this.m;
                        float var125 = var103.G;
                        float var96 = var95 - var125;
                        this.n = var96;
                        float var97 = var103.PC;
                        this.Td = var97;
                        this.J = var97;
                        long var79 = var4;
                        long var126 = var79 + 1L;
                        long var127 = var79 * var126;
                        var9 = var79 + 2L;
                        long var128 = var127 * var9;
                        long var80 = var79 + 3L;
                        long var129 = var128 * var80;
                        long var81 = var129 & 7L;
                        long var156;
                        var4 = (var156 = var81 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            var2 += -969074410;
                            var2 ^= -403945917;
                            var4 = var1 + 1;
                            var4 = var1 * var4;
                            var4 &= 1;
                            if (var4 == 0) {
                                float var86 = var103.G;
                                this.B = var86;
                                this.U = var86;
                                return true;
                            }
                            break label120;
                        }

                        var2 -= 809452218;
                        var2 |= -664642917;
                        var2 |= 1550563469;
                        var2 ^= 585783402;
                    }
                } else {
                    var2 += -2101031190;
                    var2 <<= 25;
                    var2 >>= 15;
                    var2 ^= 595239605;
                }
            } else {
                var2 -= 1897549;
                var2 += 242984650;
                var2 ^= 874487500;
                var2 ^= 167313668;
            }

            Integer var76 = var1;
            if (var76 != null) {
                IllegalArgumentException var78 = new IllegalArgumentException();
                throw var78;
            }
        }

        AssertionError var77 = new AssertionError();
        throw var77;
    }

    private void aG(int var1) {
        label117: {
            int var55;
            float var95;
            label122: {
                int var3 = System.identityHashCode(this);
                Integer var4 = var3;
                label114:
                if (var4 != null) {
                    var55 = var1 - 221481851;
                    var55 -= -752070627;
                    var55 >>= 20;
                    var55 ^= -228319969;
                    Integer var81 = var55;
                    if (var81 == null) {
                        break label117;
                    }

                    boolean var82 = this.zz;
                    if (var82) {
                        var55 = switch (var55) {
                            case -262668458 -> var55 ^ 189903325;
                            case -228320349 -> {
                                var55 ^= 865654008;
                                var55 *= -947525269;
                                yield var55 ^ 442531390;
                            }
                            default -> var55 ^ 1596485818;
                        };
                        var95 = this.Rk;
                        long var5 = var3;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var137;
                        int var98 = (var137 = var5 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                        if (var98 != 0) {
                            var55 ^= -2055715829;
                            var55 ^= 1864999065;
                            break label114;
                        }

                        var55 >>= 1;
                        var55 ^= -1919008958;
                        var95 = var95;
                        var55 &= 360502814;
                        var55 *= -823971071;
                        var55 -= 110944890;
                        var55 ^= 1869702923;
                    } else {
                        var55 -= -675069973;
                        var55 *= 1902005695;
                        var55 ^= 1775214365;
                        var55 ^= -1652740066;
                        var55 ^= -1978516935;
                        int var99 = var55 + 1;
                        var99 = var55 * var99;
                        int var6 = var55 + 2;
                        var99 *= var6;
                        var6 = var55 + 3;
                        var99 *= var6;
                        var99 &= 7;
                        if (var99 != 0) {
                            break label117;
                        }

                        float var104 = i_2.bY();
                        long var114 = var3;
                        long var8 = var114 + 1L;
                        var8 = var114 * var8;
                        long var10 = var114 + 2L;
                        var8 *= var10;
                        long var115 = var114 + 3L;
                        var8 *= var115;
                        long var116 = var8 & 7L;
                        long var138;
                        var6 = (var138 = var116 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var55 |= 762062820;
                            var55 &= 937115577;
                            var55 ^= 1674629909;
                            break label114;
                        }

                        var55 += -1607724037;
                        var55 ^= 936381060;
                        Integer var118 = var55;
                        if (var118 == null) {
                            break label117;
                        }

                        var95 = var104;
                        switch (var55) {
                            case -2120752940:
                            default:
                                var55 ^= -781816746;
                                break;
                            case -857281047:
                                var55 <<= 12;
                                var55 -= -660100997;
                                var55 ^= 138142308;
                                var55 += 1863287665;
                                var55 ^= 359110087;
                                break;
                            case 1603648194:
                                var55 ^= -604476857;
                        }
                    }

                    int var105 = var55 + 1;
                    var105 = var55 * var105;
                    var105 &= 1;
                    if (var105 != 0) {
                        break label117;
                    }

                    this.WF = var95;
                    long var85 = var3;
                    long var119 = var85 + 1L;
                    var119 = var85 * var119;
                    long var133 = var85 + 2L;
                    var119 *= var133;
                    long var86 = var85 + 3L;
                    var119 *= var86;
                    long var87 = var119 & 7L;
                    long var139;
                    int var88 = (var139 = var87 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        var55 &= -1840459500;
                        var55 ^= 1992064647;
                        var55 ^= 846105142;
                    } else {
                        var55 >>>= 17;
                        var55 ^= 1342589385;
                        long var89 = var55;
                        var119 = var89 + 1L;
                        var119 = var89 * var119;
                        var133 = var89 + 2L;
                        var119 *= var133;
                        long var90 = var89 + 3L;
                        var119 *= var90;
                        long var91 = var119 & 7L;
                        long var140;
                        int var92 = (var140 = var91 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var92 != 0) {
                            break label117;
                        }

                        boolean var93 = this.zz;
                        if (var93) {
                            var55 *= 862550511;
                            var55 &= -868243079;
                            var55 ^= 1378613814;
                            var95 = this.zA;
                            var105 = var3 + 1;
                            var105 = var3 * var105;
                            var105 &= 1;
                            if (var105 == 0) {
                                var55 -= -2142651547;
                                var55 += 1731779229;
                                var55 ^= 193874064;
                                Integer var111 = var55;
                                if (var111 == null) {
                                    break label117;
                                }

                                var95 = var95;
                                var55 *= 1972226145;
                                var55 += 1196865236;
                                var55 |= -1308751498;
                                var55 ^= 469887324;
                                break label122;
                            }

                            switch (var55) {
                                case -1709942146:
                                    var55 &= -1629039276;
                                    var55 += -24507569;
                                    var55 ^= -871055610;
                                    break;
                                case -193263956:
                                default:
                                    var55 ^= -574377140;
                                    break;
                                case 1771274626:
                                    var55 ^= -2081107616;
                            }
                        } else {
                            var55 -= 491977928;
                            var55 += -211956121;
                            var55 ^= 2105691432;
                            float var112 = i_2.i();
                            var119 = var3;
                            var133 = var119 + 1L;
                            var133 = var119 * var133;
                            var119 = var133 & 1L;
                            long var141;
                            var3 = (var141 = var119 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                var55 |= 1676283623;
                                var55 ^= 552088676;
                                var3 = var55 + 1;
                                var3 = var55 * var3;
                                var3 &= 1;
                                if (var3 != 0) {
                                    break label117;
                                }

                                var95 = var112;
                                var55 ^= 893631603;
                                var55 &= -110703970;
                                var55 ^= -1044437846;
                                break label122;
                            }

                            switch (var55) {
                                case -1094421066:
                                    var55 ^= 1603570922;
                                    break;
                                case 65182059:
                                default:
                                    var55 ^= -285550824;
                                    break;
                                case 1536383675:
                                    var55 |= -862893438;
                                    var55 &= -655716440;
                                    var55 &= 389630719;
                                    var55 ^= 1151004173;
                            }
                        }
                    }
                } else {
                    switch (var1) {
                        case -580669542:
                            var55 = var1 ^ 381470209;
                            break;
                        case 1252160093:
                        default:
                            var55 = var1 ^ 1514330932;
                            break;
                        case 1277975335:
                            var55 = var1 | 1541575389;
                            var55 |= 79273034;
                            var55 &= 1446958911;
                            var55 ^= 44315546;
                    }
                }

                var3 = var55 + 1;
                var3 = var55 * var3;
                int var96 = var55 + 2;
                var3 *= var96;
                var55 += 3;
                var3 *= var55;
                var55 = var3 & 7;
                if (var55 == 0) {
                    IllegalArgumentException var70 = new IllegalArgumentException();
                    throw var70;
                }
                break label117;
            }

            Integer var76 = var55;
            if (var76 != null) {
                this.m = var95;
                return;
            }
        }

        AssertionError var71 = new AssertionError();
        throw var71;
    }

    public boolean I(double var1) {
        label151: {
            int var3 = f;
            var3 ^= 768528033;
            int var4 = System.identityHashCode(this);
            BP var5 = this.Ie;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 != 0) {
                switch (var3) {
                    case -941651292:
                        var3 ^= 1169384955;
                        var3 >>>= 18;
                        var3 ^= -869564233;
                        break;
                    case -624240151:
                    default:
                        var3 ^= 802739312;
                        break;
                    case 1571273387:
                        var3 ^= -498567579;
                }
            } else {
                label150: {
                    var3 += -355380901;
                    var3 >>= 6;
                    var3 >>= 2;
                    var3 &= 1414431063;
                    var3 ^= -199872372;
                    long var115 = var3;
                    long var8 = var115 + 1L;
                    var8 = var115 * var8;
                    long var116 = var8 & 1L;
                    long var162;
                    var6 = (var162 = var116 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label151;
                    }

                    lH_3 var88 = var5.G();
                    boolean var89 = var88.J;
                    if (var89) {
                        var3 *= -243091189;
                        var3 ^= 1507640382;
                        int var90 = var3 + 1;
                        int var91 = var3 * var90;
                        var6 = var3 + 2;
                        int var92 = var91 * var6;
                        var6 = var3 + 3;
                        int var93 = var92 * var6;
                        int var94 = var93 & 7;
                        if (var94 != 0) {
                            break label151;
                        }

                        tR_2 var95 = this.fu;
                        var6 = var4 + 1;
                        var6 = var4 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            switch (var3) {
                                case -1308830997:
                                default:
                                    var3 ^= 2013018127;
                                    break label150;
                                case -852622165:
                                    var3 |= -2022422477;
                                    var3 ^= -1016438930;
                                    var3 ^= -1069566983;
                                    break label150;
                                case -824674186:
                                    var3 ^= -1430806409;
                                    break label150;
                            }
                        }

                        var3 &= -1647916359;
                        var3 ^= -42501396;
                        long var123 = var3;
                        var8 = var123 + 1L;
                        var8 = var123 * var8;
                        long var124 = var8 & 1L;
                        long var163;
                        var6 = (var163 = var124 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label151;
                        }

                        if (var95 != null) {
                            var3 = switch (var3) {
                                default -> var3 ^ -1976517218;
                                case 1656165131 -> var3 ^ 136448794;
                                case 1886485061 -> {
                                    var3 -= -1478770431;
                                    var3 -= 1025260322;
                                    var3 -= -2113243842;
                                    yield var3 ^ -757160057;
                                }
                            };
                            long var96 = var3;
                            long var7 = var96 + 1L;
                            var7 = var96 * var7;
                            long var9 = var96 + 2L;
                            var7 *= var9;
                            long var97 = var96 + 3L;
                            var7 *= var97;
                            long var98 = var7 & 7L;
                            long var164;
                            int var99 = (var164 = var98 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                            if (var99 != 0) {
                                break label151;
                            }

                            double var165;
                            int var100 = (var165 = var1 - 0.0) == 0.0 ? 0 : (var165 < 0.0 ? -1 : 1);
                            var6 = var4 + 1;
                            var6 = var4 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                var3 |= -656356958;
                                var3 &= -1973378382;
                                var3 &= 1824319227;
                                var3 ^= 1306630736;
                                var3 ^= -1981114146;
                                break label150;
                            }

                            var3 ^= 564130250;
                            var3 >>= 3;
                            var3 ^= -1054199912;
                            long var129 = var3;
                            var8 = var129 + 1L;
                            var8 = var129 * var8;
                            long var130 = var8 & 1L;
                            long var166;
                            var6 = (var166 = var130 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                break label151;
                            }

                            if (var100 != 0) {
                                var3 &= -1214169797;
                                var3 ^= -629197563;
                                tR_2 var101 = this.fu;
                                tR_2 var132 = this.fu;
                                float var146 = this.WF;
                                float var133 = var132.M(var146);
                                tR_2 var147 = this.fu;
                                float var156 = this.m;
                                float var148 = var147.D(var156);
                                int var157 = var4 + 1;
                                int var158 = var4 * var157;
                                int var159 = var158 & 1;
                                if (var159 == 0) {
                                    var3 -= -2096613105;
                                    var3 &= 1871751868;
                                    var3 ^= 2054976886;
                                    BP var160 = this.Ie;
                                    lH_3 var161 = var160.G();
                                    boolean var102 = var101.cu(var133, var148, var1, var161);
                                    if (var102) {
                                        var3 |= -1848476938;
                                        var3 ^= -1969680644;
                                        int var107 = var3 + 1;
                                        int var108 = var3 * var107;
                                        var6 = var3 + 2;
                                        int var109 = var108 * var6;
                                        var6 = var3 + 3;
                                        int var110 = var109 * var6;
                                        int var111 = var110 & 7;
                                        if (var111 == 0) {
                                            return true;
                                        }
                                        break label151;
                                    }

                                    var3 += 1750115871;
                                    var3 &= -375231908;
                                    var3 >>>= 11;
                                    var3 -= -1746432166;
                                    var3 ^= -929346459;
                                    int var103 = var3 + 1;
                                    int var104 = var3 * var103;
                                    int var105 = var104 & 1;
                                    if (var105 != 0) {
                                        break label151;
                                    }

                                    tR_2 var106 = this.fu;
                                    double var167;
                                    var6 = (var167 = var1 - 0.0) == 0.0 ? 0 : (var167 < 0.0 ? -1 : 1);
                                    Integer var78 = var4;
                                    if (var78 != null) {
                                        var3 = switch (var3) {
                                            default -> var3 ^ -264073671;
                                            case -1598101310 -> {
                                                var3 |= -704441027;
                                                yield var3 ^ 1963976944;
                                            }
                                            case -145458982 -> var3 ^ 618371451;
                                        };
                                        float var79;
                                        if (var6 > 0) {
                                            var3 &= -359802671;
                                            var3 ^= -1766947039;
                                            var79 = 0.05F;
                                            switch (var3) {
                                                case -16147654:
                                                    var3 ^= 934486288;
                                                    break;
                                                case 338597664:
                                                    var3 >>>= 9;
                                                    var3 &= -864802687;
                                                    var3 ^= -475185751;
                                                    break;
                                                case 813510405:
                                                default:
                                                    var3 ^= 1977894836;
                                            }
                                        } else {
                                            var3 ^= 2082719281;
                                            var3 += 473385303;
                                            var3 ^= -761876723;
                                            var6 = var3 + 1;
                                            var6 = var3 * var6;
                                            int var149 = var3 + 2;
                                            var6 *= var149;
                                            int var150 = var3 + 3;
                                            var6 *= var150;
                                            var6 &= 7;
                                            if (var6 != 0) {
                                                break label151;
                                            }

                                            var79 = -0.05F;
                                            var3 &= 933105964;
                                            var3 >>>= 20;
                                            var3 -= 2062851618;
                                            var3 ^= 1722178631;
                                        }

                                        Integer var140 = var3;
                                        if (var140 != null) {
                                            var106.YR(var79);
                                            return true;
                                        }
                                        break label151;
                                    }

                                    var3 |= -36400561;
                                    var3 += 93460315;
                                    var3 += 1156812673;
                                    var3 >>>= 27;
                                    var3 ^= -869556187;
                                } else {
                                    var3 ^= 879227639;
                                    var3 *= -106774909;
                                    var3 += -2084590922;
                                    var3 += -1516158094;
                                    var3 ^= -501136971;
                                }
                                break label150;
                            }

                            switch (var3) {
                                case -623029899:
                                    var3 ^= 1321289834;
                                    break;
                                case 1047520333:
                                    var3 -= -1399072077;
                                    var3 += -806696549;
                                    var3 ^= 1173333709;
                                    break;
                                case 1292887763:
                                default:
                                    var3 ^= 1817871008;
                            }
                        } else {
                            switch (var3) {
                                case 1734682812:
                                    var3 ^= -204962247;
                                    break;
                                case 1801110098:
                                default:
                                    var3 ^= -138968801;
                                    break;
                                case 1886485061:
                                    var3 *= -1087691673;
                                    var3 ^= 320966715;
                            }
                        }
                    } else {
                        var3 ^= -1193699709;
                        var3 ^= 1016877988;
                    }

                    var4 = var3 + 1;
                    var4 = var3 * var4;
                    int var112 = var3 + 2;
                    var4 *= var112;
                    var3 += 3;
                    var4 *= var3;
                    var3 = var4 & 7;
                    if (var3 == 0) {
                        return false;
                    }
                    break label151;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                UnsupportedOperationException var87 = new UnsupportedOperationException();
                throw var87;
            }
        }

        IllegalArgumentException var77 = new IllegalArgumentException();
        throw var77;
    }

    private void zj(lH_3 var1, int var2) {
        label677: {
            int var417;
            label703: {
                int var4 = System.identityHashCode(this);
                tR_2 var5 = this.Bn;
                float var442 = var5.tQ();
                tR_2 var6 = this.Bn;
                float var470 = var6.Q;
                float var443 = var442 * var470;
                float var444 = var443;
                var6 = this.Bn;
                float var472 = var6.Yo();
                tR_2 var7 = this.Bn;
                float var482 = var7.Q;
                float var473 = var472 * var482;
                float var474 = var473;
                float var483 = var1.d;
                float var8 = var1.S;
                float var9 = this.WF;
                float var10 = this.c;
                Integer var11 = var4;
                if (var11 == null) {
                    switch (var2) {
                        case -1917804772:
                        default:
                            var417 = var2 ^ -253268853;
                            break;
                        case -51883437:
                            var417 = var2 ^ -563988768;
                            break;
                        case 230204748:
                            var417 = var2 & -1790655916;
                            var417 &= -1999519744;
                            var417 ^= 394996484;
                    }
                } else {
                    label701: {
                        var417 = var2 >>> 6;
                        var417 -= 1902425396;
                        var417 -= -193071194;
                        var417 ^= 1939472173;
                        var9 -= var10;
                        var10 = this.m;
                        float var515 = this.n;
                        var10 -= var515;
                        tR_2 var516 = this.Bn;
                        float var517 = var516.dj();
                        this.dL = Float.NaN;
                        this.D = Float.NaN;
                        hudstyle var12 = var1.eB;
                        boolean var518 = var12.ja();
                        float var575;
                        float var694;
                        if (var518) {
                            var417 &= 1752916142;
                            var417 += 222246616;
                            var417 ^= 1919679849;
                            float var519 = var443 * 0.5F;
                            float var520 = var9 + var519;
                            Integer var13 = var4;
                            if (var13 == null) {
                                var417 |= -143043262;
                                var417 -= 296798752;
                                var417 >>= 30;
                                var417 -= -1896326033;
                                var417 ^= 1720453268;
                                break label701;
                            }

                            var417 >>>= 18;
                            var417 >>>= 20;
                            var417 -= -2076847684;
                            var417 ^= 1970014359;
                            int var545 = var417 + 1;
                            int var546 = var417 * var545;
                            int var14 = var417 + 2;
                            int var547 = var546 * var14;
                            var14 = var417 + 3;
                            int var548 = var547 * var14;
                            int var549 = var548 & 7;
                            if (var549 != 0) {
                                break label677;
                            }

                            var575 = var483 * 0.5F;
                            float var521 = var520 - var575;
                            float var522 = Math.abs(var521);
                            float var918;
                            int var523 = (var918 = var522 - 4.0F) == 0.0F ? 0 : (var918 < 0.0F ? -1 : 1);
                            float var529;
                            if (var523 < 0) {
                                var417 = switch (var417) {
                                    case 245769939 -> {
                                        var417 |= 1203671432;
                                        var417 += -1754973746;
                                        var417 *= -1572175929;
                                        yield var417 ^ -850241466;
                                    }
                                    default -> var417 ^ 618239088;
                                    case 1307461101 -> var417 ^ -1858676957;
                                };
                                int var524 = var417 + 1;
                                int var525 = var417 * var524;
                                int var526 = var525 & 1;
                                if (var526 != 0) {
                                    break label677;
                                }

                                float var527 = var483 * 0.5F;
                                var575 = var443 * 0.5F;
                                float var528 = var527 - var575;
                                int var552 = var4 + 1;
                                int var553 = var4 * var552;
                                int var554 = var553 & 1;
                                if (var554 != 0) {
                                    var417 &= 1223560995;
                                    var417 |= -1820455839;
                                    var417 ^= 1409322850;
                                    var417 |= -139679795;
                                    var417 ^= -529199925;
                                    break label701;
                                }

                                var417 *= 879733947;
                                var417 ^= -964086360;
                                var575 = var483 * 0.5F;
                                this.dL = var575;
                                var529 = var528;
                                var417 &= 1868982482;
                                var417 ^= 262161370;
                            } else {
                                var417 |= -868826103;
                                var417 ^= -2038276155;
                                Integer var556 = var417;
                                if (var556 == null) {
                                    break label677;
                                }

                                var529 = var9;
                                var417 |= -1214689146;
                                var417 |= -1534041721;
                                var417 ^= -1266705785;
                            }

                            Integer var557 = var417;
                            if (var557 == null) {
                                break label677;
                            }

                            var575 = var473 * 0.5F;
                            var575 = var10 + var575;
                            float var577 = var8 * 0.5F;
                            var575 -= var577;
                            var575 = Math.abs(var575);
                            var14 = var4 + 1;
                            var14 = var4 * var14;
                            int var15 = var4 + 2;
                            var14 *= var15;
                            int var604 = var4 + 3;
                            var14 *= var604;
                            var14 &= 7;
                            if (var14 != 0) {
                                var417 |= -1428709720;
                                var417 ^= -61057860;
                                break label701;
                            }

                            var417 *= -334784317;
                            var417 -= -1350276908;
                            var417 ^= -616611562;
                            float var919;
                            int var562 = (var919 = var575 - 4.0F) == 0.0F ? 0 : (var919 < 0.0F ? -1 : 1);
                            if (var562 < 0) {
                                var417 = switch (var417) {
                                    default -> var417 ^ 1909807360;
                                    case 53364536 -> var417 ^ -1168383767;
                                    case 156504930 -> {
                                        var417 ^= 319475571;
                                        yield var417 ^ -1290380914;
                                    }
                                };
                                Integer var563 = var417;
                                if (var563 == null) {
                                    break label677;
                                }

                                var575 = var8 * 0.5F;
                                float var583 = var473 * 0.5F;
                                long var605 = var4;
                                long var17 = var605 + 1L;
                                var17 = var605 * var17;
                                long var19 = var605 + 2L;
                                var17 *= var19;
                                long var606 = var605 + 3L;
                                var17 *= var606;
                                long var607 = var17 & 7L;
                                long var920;
                                int var608 = (var920 = var607 - 0L) == 0L ? 0 : (var920 < 0L ? -1 : 1);
                                if (var608 != 0) {
                                    var417 += 306656399;
                                    var417 <<= 24;
                                    var417 ^= 1145277430;
                                    var417 &= -1397981866;
                                    var417 ^= 1066115666;
                                    break label701;
                                }

                                var417 |= -1405643574;
                                var417 *= 1368474707;
                                var417 -= -465437316;
                                var417 ^= 926877507;
                                long var609 = var417;
                                var17 = var609 + 1L;
                                var17 = var609 * var17;
                                long var610 = var17 & 1L;
                                long var921;
                                int var611 = (var921 = var610 - 0L) == 0L ? 0 : (var921 < 0L ? -1 : 1);
                                if (var611 != 0) {
                                    break label677;
                                }

                                var575 -= var583;
                                float var584 = var8 * 0.5F;
                                this.D = var584;
                                var575 = var575;
                                switch (var417) {
                                    case -2063150446:
                                        var417 |= 1781721221;
                                        var417 ^= -307832223;
                                        var417 >>>= 4;
                                        var417 ^= 159417313;
                                        break;
                                    case -1612880262:
                                    default:
                                        var417 ^= 1334779980;
                                        break;
                                    case -1227029617:
                                        var417 ^= -1685490747;
                                }
                            } else {
                                var417 &= 36929930;
                                var417 += 1614238425;
                                var417 ^= -708757547;
                                Integer var585 = var417;
                                if (var585 == null) {
                                    break label677;
                                }

                                var575 = var10;
                                var417 &= -71174089;
                                var417 += 97230032;
                                var417 *= 2071219733;
                                var417 ^= -1701482400;
                            }

                            BP var586 = this.Ie;
                            List var587 = var586.TR();
                            Iterator var588 = var587.iterator();
                            Iterator var589 = var588;
                            float var530 = var529;
                            Integer var612 = var4;
                            if (var612 == null) {
                                var417 &= 2102968586;
                                var417 ^= 511912462;
                                break label701;
                            }
                            var417 = switch (var417) {
                                case 162103790 -> {
                                    var417 *= -1619555439;
                                    var417 |= 1990209195;
                                    yield var417 ^ -1580558641;
                                }
                                case 1060901175 -> var417 ^ -750497472;
                                default -> var417 ^ 537178980;
                            };
                            long var613 = var417;
                            long var760 = var613 + 1L;
                            var760 = var613 * var760;
                            long var866 = var613 + 2L;
                            var760 *= var866;
                            long var614 = var613 + 3L;
                            var760 *= var614;
                            long var615 = var760 & 7L;
                            long var922;
                            int var616 = (var922 = var615 - 0L) == 0L ? 0 : (var922 < 0L ? -1 : 1);
                            if (var616 != 0) {
                                break label677;
                            }

                            var575 = var575;
                            var417 -= -727617432;
                            var417 <<= 29;
                            var417 ^= 2055882228;

                            while (true) {
                                boolean var617 = var589.hasNext();
                                int var16 = var4 + 1;
                                var16 = var4 * var16;
                                var16 &= 1;
                                if (var16 != 0) {
                                    var417 += 520813613;
                                    var417 |= 80240506;
                                    var417 ^= 549401868;
                                    var417 &= 1986056793;
                                    var417 ^= 602663253;
                                    break label701;
                                }

                                var417 *= 93016211;
                                var417 -= 796477292;
                                var417 += -904453327;
                                var417 ^= 1338788536;
                                if (!var617) {
                                    var417 += 559450488;
                                    var417 ^= 1946812673;
                                    float var590 = var530 - var517;
                                    float var591 = Math.abs(var590);
                                    int var648 = var4 + 1;
                                    int var649 = var4 * var648;
                                    var16 = var4 + 2;
                                    int var650 = var649 * var16;
                                    var16 = var4 + 3;
                                    int var651 = var650 * var16;
                                    int var652 = var651 & 7;
                                    if (var652 != 0) {
                                        var417 += 1346313959;
                                        var417 &= -1859799142;
                                        var417 += 228611417;
                                        var417 *= -1019661375;
                                        var417 ^= 334045487;
                                        break label701;
                                    }
                                    var417 = switch (var417) {
                                        case -1209887536 -> {
                                            var417 *= -837648549;
                                            var417 *= -1765756755;
                                            yield var417 ^ -1375096782;
                                        }
                                        default -> var417 ^ 1324254530;
                                        case 411535471 -> var417 ^ 625511526;
                                    };
                                    long var653 = var417;
                                    var760 = var653 + 1L;
                                    var760 = var653 * var760;
                                    long var654 = var760 & 1L;
                                    long var935;
                                    int var655 = (var935 = var654 - 0L) == 0L ? 0 : (var935 < 0L ? -1 : 1);
                                    if (var655 != 0) {
                                        break label677;
                                    }

                                    float var936;
                                    var14 = (var936 = var591 - 4.0F) == 0.0F ? 0 : (var936 < 0.0F ? -1 : 1);
                                    float var593;
                                    if (var14 < 0) {
                                        var417 *= -1891851161;
                                        var417 ^= -386352298;
                                        var417 *= 408966217;
                                        var417 ^= 479212694;
                                        Integer var656 = var4;
                                        if (var656 == null) {
                                            var417 &= -2133401469;
                                            var417 <<= 17;
                                            var417 &= 1015716813;
                                            var417 ^= 395029252;
                                            break label701;
                                        }

                                        var417 &= 970412426;
                                        var417 ^= -1666276875;
                                        var593 = var517;
                                        var417 -= 572971367;
                                        var417 -= -1833152545;
                                        var417 ^= -1211463004;
                                        var417 ^= 1263967347;
                                        var417 ^= 732838161;
                                    } else {
                                        var417 += 817462310;
                                        var417 -= 729432357;
                                        var417 ^= 834655469;
                                        Integer var657 = var417;
                                        if (var657 == null) {
                                            break label677;
                                        }

                                        var593 = var530;
                                        var417 ^= -2065052378;
                                        var417 *= -1822198423;
                                        var417 &= -631428302;
                                        var417 += -382012936;
                                        var417 ^= 607130119;
                                    }

                                    long var658 = var417;
                                    var760 = var658 + 1L;
                                    var760 = var658 * var760;
                                    long var659 = var760 & 1L;
                                    long var937;
                                    int var531 = (var937 = var659 - 0L) == 0L ? 0 : (var937 < 0L ? -1 : 1);
                                    if (var531 != 0) {
                                        break label677;
                                    }

                                    float var532 = var593 + var444;
                                    var694 = var483 - var517;
                                    float var533 = var532 - var694;
                                    long var661 = var4;
                                    var760 = var661 + 1L;
                                    var760 = var661 * var760;
                                    var866 = var661 + 2L;
                                    var760 *= var866;
                                    long var662 = var661 + 3L;
                                    var760 *= var662;
                                    long var663 = var760 & 7L;
                                    long var938;
                                    int var664 = (var938 = var663 - 0L) == 0L ? 0 : (var938 < 0L ? -1 : 1);
                                    if (var664 != 0) {
                                        var417 &= 716852002;
                                        var417 ^= 892986150;
                                        break label701;
                                    }

                                    var417 |= 1958123052;
                                    var417 <<= 27;
                                    var417 ^= -633350723;
                                    int var665 = var417 + 1;
                                    int var666 = var417 * var665;
                                    int var667 = var666 & 1;
                                    if (var667 != 0) {
                                        break label677;
                                    }

                                    float var534 = Math.abs(var533);
                                    float var939;
                                    int var535 = (var939 = var534 - 4.0F) == 0.0F ? 0 : (var939 < 0.0F ? -1 : 1);
                                    float var538;
                                    if (var535 < 0) {
                                        var417 = switch (var417) {
                                            default -> var417 ^ 1826487541;
                                            case 574608829 -> {
                                                var417 *= -1920400985;
                                                yield var417 ^ -2128866580;
                                            }
                                            case 1653537235 -> var417 ^ -1192174531;
                                        };
                                        float var536 = var483 - var517;
                                        float var537 = var536 - var444;
                                        int var668 = var4 + 1;
                                        int var669 = var4 * var668;
                                        int var670 = var669 & 1;
                                        if (var670 != 0) {
                                            var417 ^= 2055505565;
                                            var417 *= 1844666863;
                                            var417 -= -530634413;
                                            var417 += 654646580;
                                            var417 ^= -303047165;
                                            break label701;
                                        }

                                        var417 &= 753186573;
                                        var417 -= 141384192;
                                        var417 ^= 562707475;
                                        var417 |= -435625165;
                                        var417 ^= -1983320233;
                                        var538 = var537;
                                        var417 += -1822753758;
                                        var417 &= -1050587854;
                                        var417 += -1431985018;
                                        var417 ^= 481287261;
                                    } else {
                                        var417 |= 1420602139;
                                        var417 += -1887760686;
                                        var417 ^= -1098720398;
                                        int var671 = var417 + 1;
                                        int var672 = var417 * var671;
                                        var16 = var417 + 2;
                                        int var673 = var672 * var16;
                                        var16 = var417 + 3;
                                        int var674 = var673 * var16;
                                        int var675 = var674 & 7;
                                        if (var675 != 0) {
                                            break label677;
                                        }

                                        var538 = var593;
                                        var417 &= 1547993318;
                                        var417 ^= -1352009673;
                                    }

                                    Integer var594 = var417;
                                    if (var594 == null) {
                                        break label677;
                                    }

                                    float var595 = var575 - var517;
                                    float var596 = Math.abs(var595);
                                    Integer var676 = var4;
                                    if (var676 == null) {
                                        var417 += -2093326148;
                                        var417 *= 100705511;
                                        var417 ^= 1353817811;
                                        break label701;
                                    }
                                    var417 = switch (var417) {
                                        default -> var417 ^ 2063514979;
                                        case -1217824555 -> {
                                            var417 >>>= 25;
                                            var417 ^= 545828120;
                                            yield var417 ^ -1769546215;
                                        }
                                        case -850344008 -> var417 ^ -1792798240;
                                    };
                                    Integer var677 = var417;
                                    if (var677 == null) {
                                        break label677;
                                    }

                                    float var940;
                                    int var597 = (var940 = var596 - 4.0F) == 0.0F ? 0 : (var940 < 0.0F ? -1 : 1);
                                    float var603;
                                    if (var597 < 0) {
                                        var417 ^= -1605369041;
                                        var417 |= -1657143195;
                                        var417 &= 1636437365;
                                        var417 &= 1041487674;
                                        var417 ^= -1331415647;
                                        var597 = var417 + 1;
                                        var597 = var417 * var597;
                                        int var678 = var417 + 2;
                                        var597 *= var678;
                                        int var679 = var417 + 3;
                                        var597 *= var679;
                                        var597 &= 7;
                                        if (var597 != 0) {
                                            break label677;
                                        }

                                        long var680 = var4;
                                        var760 = var680 + 1L;
                                        var760 = var680 * var760;
                                        var866 = var680 + 2L;
                                        var760 *= var866;
                                        long var681 = var680 + 3L;
                                        var760 *= var681;
                                        long var682 = var760 & 7L;
                                        long var941;
                                        int var683 = (var941 = var682 - 0L) == 0L ? 0 : (var941 < 0L ? -1 : 1);
                                        if (var683 != 0) {
                                            var417 |= 929083858;
                                            var417 += 388710563;
                                            var417 *= 479280719;
                                            var417 |= -294893961;
                                            var417 ^= -118076037;
                                            break label701;
                                        }
                                        var417 = switch (var417) {
                                            default -> var417 ^ 2086561506;
                                            case -1331284591 -> {
                                                var417 *= -1830677117;
                                                var417 >>>= 20;
                                                var417 += -1141742334;
                                                var417 >>= 2;
                                                yield var417 ^ -1609220739;
                                            }
                                            case -185317872 -> var417 ^ 1955797023;
                                        };
                                        var603 = var517;
                                        var417 += 593348649;
                                        var417 >>= 20;
                                        var417 |= -1639668774;
                                        var417 ^= -2096912593;
                                        var417 ^= 2002556327;
                                    } else {
                                        var417 |= -1581167979;
                                        var417 |= -717244348;
                                        var417 ^= 951322742;
                                        long var684 = var417;
                                        var760 = var684 + 1L;
                                        var760 = var684 * var760;
                                        long var685 = var760 & 1L;
                                        long var942;
                                        int var686 = (var942 = var685 - 0L) == 0L ? 0 : (var942 < 0L ? -1 : 1);
                                        if (var686 != 0) {
                                            break label677;
                                        }

                                        var603 = var575;
                                        var417 += 2104758031;
                                        var417 ^= 651925454;
                                    }

                                    var575 = var603 + var474;
                                    int var687 = var4 + 1;
                                    int var688 = var4 * var687;
                                    int var689 = var688 & 1;
                                    if (var689 != 0) {
                                        var417 |= 1277279432;
                                        var417 ^= -1159437053;
                                        var417 ^= -1017875463;
                                        break label701;
                                    }

                                    var417 += 477383102;
                                    var417 *= 111217447;
                                    var417 &= 1826414681;
                                    var417 |= -849367201;
                                    var417 ^= -229175484;
                                    var694 = var8 - var517;
                                    var575 -= var694;
                                    var575 = Math.abs(var575);
                                    float var943;
                                    int var571 = (var943 = var575 - 4.0F) == 0.0F ? 0 : (var943 < 0.0F ? -1 : 1);
                                    if (var571 < 0) {
                                        var417 *= -1685226199;
                                        var417 ^= -2078184736;
                                        var417 |= 631937851;
                                        var417 -= 212649429;
                                        var417 ^= -1005929950;
                                        long var691 = var417;
                                        var760 = var691 + 1L;
                                        var760 = var691 * var760;
                                        var866 = var691 + 2L;
                                        var760 *= var866;
                                        long var692 = var691 + 3L;
                                        var760 *= var692;
                                        long var693 = var760 & 7L;
                                        long var944;
                                        int var572 = (var944 = var693 - 0L) == 0L ? 0 : (var944 < 0L ? -1 : 1);
                                        if (var572 != 0) {
                                            break label677;
                                        }

                                        var575 = var8 - var517;
                                        var575 -= var474;
                                        var694 = var538;
                                        var16 = var4 + 1;
                                        var16 = var4 * var16;
                                        var16 &= 1;
                                        if (var16 != 0) {
                                            var417 -= -1330870916;
                                            var417 ^= 1649575997;
                                            var417 ^= -1958221455;
                                            break label701;
                                        }

                                        var417 |= 1697235554;
                                        var417 *= -1329533307;
                                        var417 -= 1093736256;
                                        var417 >>>= 8;
                                        var417 ^= 413751610;
                                        Integer var747 = var417;
                                        if (var747 == null) {
                                            break label677;
                                        }

                                        var575 = var575;
                                        var417 += -680372199;
                                        var417 += -790875422;
                                        var417 += 1468680019;
                                        var417 ^= 771948213;
                                        var417 ^= 1866356159;
                                    } else {
                                        var417 -= -154915401;
                                        var417 <<= 20;
                                        var417 |= 254772690;
                                        var417 ^= -1586976123;
                                        var694 = var538;
                                        Integer var539 = var4;
                                        if (var539 == null) {
                                            var417 ^= 553641061;
                                            var417 ^= -1183621066;
                                            break label701;
                                        }

                                        var417 |= -1061188107;
                                        var417 |= -1248740392;
                                        var417 >>= 24;
                                        var417 ^= 658038220;
                                        var575 = var603;
                                        var417 += 617248451;
                                        var417 >>>= 4;
                                        var417 -= 1100429377;
                                        var417 -= 1267253307;
                                        var417 ^= -618915638;
                                    }
                                    break;
                                }

                                var417 |= 1288119546;
                                var417 |= -1175244562;
                                var417 ^= -1498452394;
                                Object var618 = var589.next();
                                tR_2 var619 = (tR_2)var618;
                                long var697 = var4;
                                long var18 = var697 + 1L;
                                var18 = var697 * var18;
                                long var698 = var18 & 1L;
                                long var923;
                                var16 = (var923 = var698 - 0L) == 0L ? 0 : (var923 < 0L ? -1 : 1);
                                if (var16 != 0) {
                                    var417 -= 18434086;
                                    var417 ^= 1337237895;
                                    break label701;
                                }
                                var417 = switch (var417) {
                                    case 1498960553 -> {
                                        var417 *= 7243897;
                                        var417 |= -2488556;
                                        var417 |= -81187747;
                                        yield var417 ^ -1117092600;
                                    }
                                    default -> var417 ^ -1853480813;
                                    case 1670582914 -> var417 ^ 109977045;
                                };
                                var16 = var417 + 1;
                                var16 = var417 * var16;
                                var16 &= 1;
                                if (var16 != 0) {
                                    break label677;
                                }

                                tR_2 var703 = this.Bn;
                                if (var619 != var703) {
                                    var417 &= -427704424;
                                    var417 += -87549908;
                                    var417 ^= -106882817;
                                    var417 >>>= 1;
                                    var417 ^= -1743701587;
                                    int var704 = var619.JK ? 1 : 0;
                                    var760 = var4;
                                    var866 = var760 + 1L;
                                    var866 = var760 * var866;
                                    long var21 = var760 + 2L;
                                    var866 *= var21;
                                    var760 += 3L;
                                    var866 *= var760;
                                    var760 = var866 & 7L;
                                    long var924;
                                    int var767 = (var924 = var760 - 0L) == 0L ? 0 : (var924 < 0L ? -1 : 1);
                                    if (var767 != 0) {
                                        var417 |= -1641879070;
                                        var417 &= -527806328;
                                        var417 ^= -141952116;
                                        break label701;
                                    }
                                    var417 = switch (var417) {
                                        case -2023451144 -> var417 ^ 633623566;
                                        case -94036852 -> {
                                            var417 += -1221178430;
                                            var417 += 151615633;
                                            yield var417 ^ -1468372932;
                                        }
                                        default -> var417 ^ 1038688605;
                                    };
                                    int var768 = var417 + 1;
                                    int var769 = var417 * var768;
                                    int var825 = var417 + 2;
                                    int var770 = var769 * var825;
                                    int var826 = var417 + 3;
                                    int var771 = var770 * var826;
                                    int var772 = var771 & 7;
                                    if (var772 != 0) {
                                        break label677;
                                    }

                                    if (var704 != 0) {
                                        var417 ^= 86842153;
                                        var417 ^= 1672743840;
                                        float var705 = var619.J;
                                        float var925;
                                        var704 = (var925 = var705 - 0.3F) == 0.0F ? 0 : (var925 < 0.0F ? -1 : 1);
                                        var760 = var4;
                                        var866 = var760 + 1L;
                                        var866 = var760 * var866;
                                        var21 = var760 + 2L;
                                        var866 *= var21;
                                        var760 += 3L;
                                        var866 *= var760;
                                        var760 = var866 & 7L;
                                        long var926;
                                        int var776 = (var926 = var760 - 0L) == 0L ? 0 : (var926 < 0L ? -1 : 1);
                                        if (var776 != 0) {
                                            var417 *= -1865755367;
                                            var417 ^= -939933858;
                                            break label701;
                                        }
                                        var417 = switch (var417) {
                                            case 1185780923 -> var417 ^ 1243648201;
                                            default -> var417 ^ 1889442793;
                                            case 1950849130 -> {
                                                var417 ^= 1114176433;
                                                yield var417 ^ 2023937507;
                                            }
                                        };
                                        int var777 = var417 + 1;
                                        int var778 = var417 * var777;
                                        int var827 = var417 + 2;
                                        int var779 = var778 * var827;
                                        int var828 = var417 + 3;
                                        int var780 = var779 * var828;
                                        int var781 = var780 & 7;
                                        if (var781 != 0) {
                                            break label677;
                                        }

                                        if (var704 < 0) {
                                            var417 = switch (var417) {
                                                default -> var417 ^ 1273495375;
                                                case 1317910072 -> {
                                                    var417 -= -2064900347;
                                                    var417 &= -562698981;
                                                    var417 *= -1049450179;
                                                    var417 |= -1115091577;
                                                    yield var417 ^ -196709061;
                                                }
                                                case 1334502620 -> var417 ^ -404346444;
                                            };
                                            Integer var707 = var417;
                                            if (var707 == null) {
                                                break label677;
                                            }

                                            var530 = var530;
                                            var707 = var4;
                                            if (var707 == null) {
                                                switch (var417) {
                                                    case -1133963825:
                                                        var417 ^= -689688845;
                                                        break label701;
                                                    case 193673404:
                                                        var417 &= -1072466821;
                                                        var417 >>= 10;
                                                        var417 ^= 395029448;
                                                        break label701;
                                                    case 1435005014:
                                                    default:
                                                        var417 ^= -360121742;
                                                        break label701;
                                                }
                                            }

                                            var417 -= 1059787399;
                                            var417 &= 269575799;
                                            var417 -= -1246833356;
                                            var417 ^= 1665478693;
                                            var417 ^= 2103932471;
                                            int var709 = var417 + 1;
                                            var709 = var417 * var709;
                                            int var782 = var417 + 2;
                                            var709 *= var782;
                                            int var783 = var417 + 3;
                                            var709 *= var783;
                                            var709 &= 7;
                                            if (var709 != 0) {
                                                break label677;
                                            }

                                            var575 = var575;
                                            var417 |= 101214433;
                                            var417 ^= 754006535;
                                        } else {
                                            var417 -= 378396457;
                                            var417 ^= -128747461;
                                            var417 ^= 1765081375;
                                            Integer var714 = var417;
                                            if (var714 == null) {
                                                break label677;
                                            }

                                            float var715 = this.dL;
                                            boolean var716 = Float.isNaN(var715);
                                            int var784 = var4 + 1;
                                            int var785 = var4 * var784;
                                            int var786 = var785 & 1;
                                            if (var786 != 0) {
                                                switch (var417) {
                                                    case -1499877845:
                                                        var417 += 8675409;
                                                        var417 ^= -939849219;
                                                        var417 ^= 2003741829;
                                                        break label701;
                                                    case -168657324:
                                                        var417 ^= 582406748;
                                                        break label701;
                                                    case 666580290:
                                                    default:
                                                        var417 ^= 1829283893;
                                                        break label701;
                                                }
                                            }

                                            var417 += 241586407;
                                            var417 += 1969804284;
                                            var417 &= -789558846;
                                            var417 |= 341929511;
                                            var417 ^= -1285352675;
                                            var760 = var417;
                                            var866 = var760 + 1L;
                                            var866 = var760 * var866;
                                            var760 = var866 & 1L;
                                            long var927;
                                            int var789 = (var927 = var760 - 0L) == 0L ? 0 : (var927 < 0L ? -1 : 1);
                                            if (var789 != 0) {
                                                break label677;
                                            }

                                            float var799;
                                            if (var716) {
                                                var417 = switch (var417) {
                                                    case -1493009350 -> {
                                                        var417 -= -1028286651;
                                                        var417 *= 920179521;
                                                        var417 *= 2147330233;
                                                        var417 += 433114893;
                                                        yield var417 ^ -1237401807;
                                                    }
                                                    case -798149560 -> var417 ^ -1661637845;
                                                    default -> var417 ^ 461794309;
                                                };
                                                float var717 = var619.PC;
                                                float var790 = var619.tQ();
                                                int var829 = var4 + 1;
                                                int var830 = var4 * var829;
                                                int var877 = var4 + 2;
                                                int var831 = var830 * var877;
                                                int var878 = var4 + 3;
                                                int var832 = var831 * var878;
                                                int var833 = var832 & 7;
                                                if (var833 != 0) {
                                                    var417 ^= -1545448749;
                                                    var417 ^= -193865237;
                                                    var417 ^= 603691351;
                                                    break label701;
                                                }
                                                var417 = switch (var417) {
                                                    default -> var417 ^ 357544888;
                                                    case 729530620 -> var417 ^ -301533442;
                                                    case 1675868523 -> {
                                                        var417 |= 869453183;
                                                        var417 &= 1924182331;
                                                        var417 *= 2058490541;
                                                        yield var417 ^ 566311112;
                                                    }
                                                };
                                                float var834 = var619.Q;
                                                float var791 = var790 * var834;
                                                int var835 = var417 & 142148915;
                                                int var836 = var835 * 250991951;
                                                int var837 = var836 + 737029079;
                                                int var838 = var837 ^ 134175092;
                                                float var718 = this.J(var530, var444, var717, var791, var838);
                                                boolean var792 = Float.isNaN(var718);
                                                if (!var792) {
                                                    var417 &= -802855407;
                                                    var417 >>>= 23;
                                                    var417 -= 1362485016;
                                                    var417 |= 2126379109;
                                                    var417 ^= -49891459;
                                                    int var793 = var417 + 1;
                                                    int var794 = var417 * var793;
                                                    int var839 = var417 + 2;
                                                    int var795 = var794 * var839;
                                                    int var840 = var417 + 3;
                                                    int var796 = var795 * var840;
                                                    int var797 = var796 & 7;
                                                    if (var797 != 0) {
                                                        break label677;
                                                    }

                                                    float var798 = var530 + var718;
                                                    float var841 = this.O;
                                                    var866 = var4;
                                                    var21 = var866 + 1L;
                                                    var21 = var866 * var21;
                                                    var866 = var21 & 1L;
                                                    long var928;
                                                    int var881 = (var928 = var866 - 0L) == 0L ? 0 : (var928 < 0L ? -1 : 1);
                                                    if (var881 != 0) {
                                                        var417 |= 680408440;
                                                        var417 *= 922678525;
                                                        var417 |= 371481090;
                                                        var417 ^= -911937378;
                                                        break label701;
                                                    }

                                                    var417 >>= 14;
                                                    var417 |= -1703856005;
                                                    var417 -= -1423073008;
                                                    var417 ^= -1514993375;
                                                    var866 = var417;
                                                    var21 = var866 + 1L;
                                                    var21 = var866 * var21;
                                                    long var23 = var866 + 2L;
                                                    var21 *= var23;
                                                    var866 += 3L;
                                                    var21 *= var866;
                                                    var866 = var21 & 7L;
                                                    long var929;
                                                    int var885 = (var929 = var866 - 0L) == 0L ? 0 : (var929 < 0L ? -1 : 1);
                                                    if (var885 != 0) {
                                                        break label677;
                                                    }

                                                    this.dL = var841;
                                                    var799 = var798;
                                                    var417 &= 1899181624;
                                                    var417 *= 334367063;
                                                    var417 ^= 1899860584;
                                                } else {
                                                    var417 |= -220501147;
                                                    var417 ^= -1384217418;
                                                    Integer var842 = var417;
                                                    if (var842 == null) {
                                                        break label677;
                                                    }

                                                    var799 = var530;
                                                    var417 += -346058805;
                                                    var417 >>= 18;
                                                    var417 >>>= 20;
                                                    var417 >>= 13;
                                                    var417 ^= -441428272;
                                                }
                                            } else {
                                                var417 *= 1710537691;
                                                var417 *= 818168485;
                                                var417 ^= -373263823;
                                                Integer var843 = var417;
                                                if (var843 == null) {
                                                    break label677;
                                                }

                                                var799 = var530;
                                                switch (var417) {
                                                    case -1731312921:
                                                        var417 += 260416785;
                                                        var417 |= 1920552200;
                                                        var417 ^= 1668793510;
                                                        var417 &= -876593946;
                                                        var417 ^= 1823506070;
                                                        break;
                                                    case -1040270646:
                                                        var417 ^= -515437686;
                                                        break;
                                                    case 402318072:
                                                    default:
                                                        var417 ^= 430924704;
                                                }
                                            }

                                            float var844 = this.D;
                                            Integer var886 = var4;
                                            if (var886 == null) {
                                                switch (var417) {
                                                    case -441428272:
                                                        var417 >>>= 22;
                                                        var417 |= 1392277891;
                                                        var417 += -38142694;
                                                        var417 ^= 1195234229;
                                                        break label701;
                                                    case 809514338:
                                                    default:
                                                        var417 ^= 294374884;
                                                        break label701;
                                                    case 1693026679:
                                                        var417 ^= 1688451871;
                                                        break label701;
                                                }
                                            }
                                            var417 = switch (var417) {
                                                case -441428272 -> {
                                                    var417 -= -311401908;
                                                    yield var417 ^ 617444729;
                                                }
                                                default -> var417 ^ -1469612163;
                                                case 1630153136 -> var417 ^ 1990531249;
                                            };
                                            var866 = var417;
                                            var21 = var866 + 1L;
                                            var21 = var866 * var21;
                                            long var917 = var866 + 2L;
                                            var21 *= var917;
                                            var866 += 3L;
                                            var21 *= var866;
                                            var866 = var21 & 7L;
                                            long var930;
                                            int var890 = (var930 = var866 - 0L) == 0L ? 0 : (var930 < 0L ? -1 : 1);
                                            if (var890 != 0) {
                                                break label677;
                                            }

                                            boolean var845 = Float.isNaN(var844);
                                            if (var845) {
                                                var417 |= 996098473;
                                                var417 -= 602114506;
                                                var417 += -882639239;
                                                var417 -= -1085463859;
                                                var417 ^= -1911980857;
                                                int var846 = var417 + 1;
                                                int var847 = var417 * var846;
                                                int var891 = var417 + 2;
                                                int var848 = var847 * var891;
                                                int var892 = var417 + 3;
                                                int var849 = var848 * var892;
                                                int var850 = var849 & 7;
                                                if (var850 != 0) {
                                                    break label677;
                                                }

                                                float var851 = var619.G;
                                                float var893 = var619.Yo();
                                                var694 = var619.Q;
                                                var694 = var893 * var694;
                                                int var894 = var417 | 211973028;
                                                int var895 = var894 & 383254785;
                                                int var896 = var895 | 647503935;
                                                int var897 = var896 ^ -747996929;
                                                var694 = this.J(var575, var474, var851, var694, var897);
                                                int var623 = var4 + 1;
                                                int var624 = var4 * var623;
                                                int var625 = var624 & 1;
                                                if (var625 != 0) {
                                                    switch (var417) {
                                                        case -1283614046:
                                                            var417 ^= 1718058298;
                                                            break label701;
                                                        case -903253879:
                                                        default:
                                                            var417 ^= -1884682836;
                                                            break label701;
                                                        case 1715105560:
                                                            var417 |= -958565999;
                                                            var417 |= 1634165815;
                                                            var417 *= -1997046695;
                                                            var417 ^= 897009251;
                                                            break label701;
                                                    }
                                                }
                                                var417 = switch (var417) {
                                                    case 838817403 -> var417 ^ -105629526;
                                                    default -> var417 ^ -430673102;
                                                    case 1715105560 -> {
                                                        var417 -= -850585897;
                                                        var417 *= 1839550919;
                                                        var417 -= -771717429;
                                                        var417 &= 1873060491;
                                                        yield var417 ^ -1687400781;
                                                    }
                                                };
                                                int var626 = var417 + 1;
                                                int var627 = var417 * var626;
                                                int var852 = var417 + 2;
                                                int var628 = var627 * var852;
                                                int var853 = var417 + 3;
                                                int var629 = var628 * var853;
                                                int var630 = var629 & 7;
                                                if (var630 != 0) {
                                                    break label677;
                                                }

                                                boolean var631 = Float.isNaN(var694);
                                                if (!var631) {
                                                    var417 ^= 1394649574;
                                                    var417 ^= 23541203;
                                                    var417 ^= 614394310;
                                                    var694 = var575 + var694;
                                                    float var720 = this.O;
                                                    this.D = var720;
                                                    var714 = var4;
                                                    if (var714 == null) {
                                                        var417 |= 372982499;
                                                        var417 &= 1206792136;
                                                        var417 ^= 1344643276;
                                                        break label701;
                                                    }

                                                    var417 |= -565116870;
                                                    var417 |= 1616959078;
                                                    var417 *= -1885825467;
                                                    var417 -= -622268254;
                                                    var417 ^= -1227247903;
                                                    var18 = var417;
                                                    long var20 = var18 + 1L;
                                                    var20 = var18 * var20;
                                                    long var22 = var18 + 2L;
                                                    var20 *= var22;
                                                    var18 += 3L;
                                                    var20 *= var18;
                                                    var18 = var20 & 7L;
                                                    long var931;
                                                    int var722 = (var931 = var18 - 0L) == 0L ? 0 : (var931 < 0L ? -1 : 1);
                                                    if (var722 != 0) {
                                                        break label677;
                                                    }

                                                    var694 = var694;
                                                    var417 |= 1889170775;
                                                    var417 |= 1972748296;
                                                    var417 ^= 616957356;
                                                    var417 *= 1882236233;
                                                    var417 ^= -1446423178;
                                                } else {
                                                    var417 += 1366384169;
                                                    var417 += 651233132;
                                                    var417 ^= -1666994102;
                                                    int var723 = var417 + 1;
                                                    var723 = var417 * var723;
                                                    int var857 = var417 + 2;
                                                    var723 *= var857;
                                                    int var858 = var417 + 3;
                                                    var723 *= var858;
                                                    var723 &= 7;
                                                    if (var723 != 0) {
                                                        break label677;
                                                    }

                                                    var694 = var575;
                                                    var417 >>>= 23;
                                                    var417 -= -162132634;
                                                    var417 += 585603490;
                                                    var417 *= -1264130585;
                                                    var417 ^= 1182033791;
                                                }
                                            } else {
                                                var417 = switch (var417) {
                                                    case -588086787 -> {
                                                        var417 |= -1141239815;
                                                        var417 &= 844878305;
                                                        var417 += 318949868;
                                                        yield var417 ^ 485010405;
                                                    }
                                                    case 42776862 -> var417 ^ -642117805;
                                                    default -> var417 ^ -960383072;
                                                };
                                                int var728 = var417 + 1;
                                                var728 = var417 * var728;
                                                var728 &= 1;
                                                if (var728 != 0) {
                                                    break label677;
                                                }

                                                var694 = var575;
                                                var417 |= 1477308765;
                                                var417 ^= 660394724;
                                                var417 *= -1857556367;
                                                var417 -= -1353896477;
                                                var417 ^= -1600168197;
                                            }

                                            int var731 = var417 + 1;
                                            var731 = var417 * var731;
                                            var731 &= 1;
                                            if (var731 != 0) {
                                                break label677;
                                            }

                                            var530 = var799;
                                            var731 = var4 + 1;
                                            var731 = var4 * var731;
                                            var731 &= 1;
                                            if (var731 != 0) {
                                                var417 >>>= 1;
                                                var417 >>= 19;
                                                var417 += -697611860;
                                                var417 += -602817878;
                                                var417 ^= -1510563319;
                                                break label701;
                                            }

                                            var417 += -639995282;
                                            var417 ^= 1052873347;
                                            long var737 = var417;
                                            var18 = var737 + 1L;
                                            var18 = var737 * var18;
                                            long var738 = var18 & 1L;
                                            long var932;
                                            var731 = (var932 = var738 - 0L) == 0L ? 0 : (var932 < 0L ? -1 : 1);
                                            if (var731 != 0) {
                                                break label677;
                                            }

                                            var575 = var694;
                                            var417 ^= -1098433157;
                                            var417 |= -1660570249;
                                            var417 -= 2060700452;
                                            var417 ^= 952215975;
                                        }
                                    } else {
                                        var417 += 1721834050;
                                        var417 *= -895990453;
                                        var417 <<= 5;
                                        var417 -= 1313629407;
                                        var417 ^= -697321848;
                                        var530 = var530;
                                        Integer var634 = var4;
                                        if (var634 == null) {
                                            var417 *= 2140646959;
                                            var417 *= 533485233;
                                            var417 ^= 2137133299;
                                            break label701;
                                        }

                                        var417 <<= 5;
                                        var417 += -756724342;
                                        var417 ^= 198151172;
                                        long var635 = var417;
                                        var760 = var635 + 1L;
                                        var760 = var635 * var760;
                                        var866 = var635 + 2L;
                                        var760 *= var866;
                                        long var636 = var635 + 3L;
                                        var760 *= var636;
                                        long var637 = var760 & 7L;
                                        long var933;
                                        int var638 = (var933 = var637 - 0L) == 0L ? 0 : (var933 < 0L ? -1 : 1);
                                        if (var638 != 0) {
                                            break label677;
                                        }

                                        var575 = var575;
                                        var417 += -1355424988;
                                        var417 ^= 2068361791;
                                        var417 >>>= 1;
                                        var417 ^= 616974850;
                                    }
                                } else {
                                    var417 = switch (var417) {
                                        case 338708381 -> var417 ^ 1182151515;
                                        case 1117092597 -> {
                                            var417 *= 1000110297;
                                            yield var417 ^ -517461721;
                                        }
                                        default -> var417 ^ -1841613669;
                                    };
                                    int var639 = var417 + 1;
                                    int var640 = var417 * var639;
                                    int var641 = var640 & 1;
                                    if (var641 != 0) {
                                        break label677;
                                    }

                                    var530 = var530;
                                    long var642 = var4;
                                    var760 = var642 + 1L;
                                    var760 = var642 * var760;
                                    long var643 = var760 & 1L;
                                    long var934;
                                    int var644 = (var934 = var643 - 0L) == 0L ? 0 : (var934 < 0L ? -1 : 1);
                                    if (var644 != 0) {
                                        var417 -= -120876682;
                                        var417 -= -1199082283;
                                        var417 -= 1702662150;
                                        var417 ^= -415823555;
                                        break label701;
                                    }
                                    var417 = switch (var417) {
                                        default -> var417 ^ 772914339;
                                        case -301188494 -> var417 ^ -472562724;
                                        case 126630026 -> {
                                            var417 &= -90244056;
                                            var417 += 1698287384;
                                            yield var417 ^ -1093413678;
                                        }
                                    };
                                    int var645 = var417 + 1;
                                    int var646 = var417 * var645;
                                    int var647 = var646 & 1;
                                    if (var647 != 0) {
                                        break label677;
                                    }

                                    var575 = var575;
                                    var417 *= 992891021;
                                    var417 ^= 1144461758;
                                }
                            }
                        } else {
                            var417 += -346153787;
                            var417 ^= -1193041932;
                            int var540 = var417 + 1;
                            int var541 = var417 * var540;
                            int var542 = var541 & 1;
                            if (var542 != 0) {
                                break label677;
                            }

                            var694 = var9;
                            long var748 = var4;
                            long var861 = var748 + 1L;
                            var861 = var748 * var861;
                            long var905 = var748 + 2L;
                            var861 *= var905;
                            var748 += 3L;
                            var861 *= var748;
                            var748 = var861 & 7L;
                            long var945;
                            int var498 = (var945 = var748 - 0L) == 0L ? 0 : (var945 < 0L ? -1 : 1);
                            if (var498 != 0) {
                                var417 >>= 1;
                                var417 &= 1800685393;
                                var417 ^= 902803285;
                                break label701;
                            }

                            var417 += 1113215267;
                            var417 ^= -426710844;
                            int var499 = var417 + 1;
                            int var500 = var417 * var499;
                            int var543 = var417 + 2;
                            int var501 = var500 * var543;
                            int var544 = var417 + 3;
                            int var502 = var501 * var544;
                            int var503 = var502 & 7;
                            if (var503 != 0) {
                                break label677;
                            }

                            var575 = var10;
                            var417 -= -1322300762;
                            var417 ^= -334619642;
                            var417 &= 504986470;
                            var417 ^= 1370321855;
                        }

                        int var504 = var417 + 1;
                        int var505 = var417 * var504;
                        int var506 = var505 & 1;
                        if (var506 != 0) {
                            break label677;
                        }

                        float var445 = var483 - var444;
                        long var507 = var4;
                        long var751 = var507 + 1L;
                        var751 = var507 * var751;
                        long var865 = var507 + 2L;
                        var751 *= var865;
                        long var508 = var507 + 3L;
                        var751 *= var508;
                        long var509 = var751 & 7L;
                        long var946;
                        int var484 = (var946 = var509 - 0L) == 0L ? 0 : (var946 < 0L ? -1 : 1);
                        if (var484 != 0) {
                            var417 |= -1912321729;
                            var417 |= -2017242073;
                            var417 += -1548624477;
                            var417 ^= -1810698074;
                        } else {
                            label702: {
                                var417 &= -1400557919;
                                var417 += -1352821087;
                                var417 ^= -473960330;
                                int var485 = var417 + 1;
                                int var486 = var417 * var485;
                                int var510 = var417 + 2;
                                int var487 = var486 * var510;
                                int var511 = var417 + 3;
                                int var488 = var487 * var511;
                                int var489 = var488 & 7;
                                if (var489 != 0) {
                                    break label677;
                                }

                                float var446 = var445 - var517;
                                float var447 = Math.max(var517, var446);
                                float var448 = TP.t(var694, var517, var447);
                                this.J = var448;
                                float var449 = var8 - var474;
                                float var450 = var449 - var517;
                                float var451 = Math.max(var517, var450);
                                float var452 = TP.t(var575, var517, var451);
                                this.U = var452;
                                float var453 = this.dL;
                                boolean var454 = Float.isNaN(var453);
                                if (!var454) {
                                    var417 = switch (var417) {
                                        case -1234005630 -> var417 ^ 831138958;
                                        case 1415401300 -> {
                                            var417 *= 712155353;
                                            var417 &= 1005640081;
                                            yield var417 ^ -1871365451;
                                        }
                                        default -> var417 ^ 542862886;
                                    };
                                    float var455 = this.dL;
                                    Integer var475 = var4;
                                    if (var475 == null) {
                                        var417 |= 766327353;
                                        var417 ^= -1167715911;
                                        break label702;
                                    }
                                    var417 = switch (var417) {
                                        case -1603951963 -> {
                                            var417 ^= 1994780356;
                                            var417 ^= 750449890;
                                            yield var417 ^ -1699012137;
                                        }
                                        case -234150861 -> var417 ^ -1868779978;
                                        default -> var417 ^ 366146586;
                                    };
                                    this.RS = var455;
                                    var417 += -1906584297;
                                    var417 <<= 31;
                                    var417 ^= 1220048115;
                                    var417 ^= 506982938;
                                } else {
                                    var417 += -574714564;
                                    var417 += 701828798;
                                    var417 ^= -1921028697;
                                }

                                long var456 = var417;
                                long var490 = var456 + 1L;
                                long var491 = var456 * var490;
                                long var512 = var456 + 2L;
                                long var492 = var491 * var512;
                                long var457 = var456 + 3L;
                                long var493 = var492 * var457;
                                long var458 = var493 & 7L;
                                long var947;
                                int var459 = (var947 = var458 - 0L) == 0L ? 0 : (var947 < 0L ? -1 : 1);
                                if (var459 != 0) {
                                    break label677;
                                }

                                float var460 = this.D;
                                Integer var476 = var4;
                                if (var476 != null) {
                                    var417 &= -2066852751;
                                    var417 -= 1110134549;
                                    var417 |= -1801288190;
                                    var417 |= 338398425;
                                    var417 ^= -1554862971;
                                    int var477 = var417 + 1;
                                    int var478 = var417 * var477;
                                    int var479 = var478 & 1;
                                    if (var479 != 0) {
                                        break label677;
                                    }

                                    boolean var461 = Float.isNaN(var460);
                                    if (var461) {
                                        var417 *= 411228081;
                                        var417 ^= 1231420358;
                                        var417 += 293245512;
                                        var417 += 1264139694;
                                        var417 ^= -1562920426;
                                        break label703;
                                    }

                                    var417 &= 491240251;
                                    var417 ^= -839039961;
                                    long var462 = var417;
                                    long var494 = var462 + 1L;
                                    long var495 = var462 * var494;
                                    long var463 = var495 & 1L;
                                    long var948;
                                    int var464 = (var948 = var463 - 0L) == 0L ? 0 : (var948 < 0L ? -1 : 1);
                                    if (var464 != 0) {
                                        break label677;
                                    }

                                    float var465 = this.D;
                                    Integer var437 = var4;
                                    if (var437 != null) {
                                        var417 ^= -2144483617;
                                        var417 >>= 6;
                                        var417 ^= -926659360;
                                        var417 &= -8115474;
                                        var417 ^= -376085398;
                                        var437 = var417;
                                        if (var437 == null) {
                                            break label677;
                                        }

                                        this.XZ = var465;
                                        var417 >>>= 9;
                                        var417 ^= 430272083;
                                        break label703;
                                    }

                                    switch (var417) {
                                        case -1371143292:
                                            var417 ^= 1569290373;
                                            break;
                                        case -654551235:
                                            var417 ^= -897829304;
                                            var417 += -1885733238;
                                            var417 *= -2097168819;
                                            var417 += 667435002;
                                            var417 ^= -1904424279;
                                            break;
                                        case 2135995252:
                                        default:
                                            var417 ^= -1931098797;
                                    }
                                } else {
                                    var417 &= 1932511847;
                                    var417 &= -2118645177;
                                    var417 ^= 394504517;
                                }
                            }
                        }
                    }
                }

                long var431 = var417;
                long var466 = var431 + 1L;
                long var467 = var431 * var466;
                long var496 = var431 + 2L;
                long var468 = var467 * var496;
                long var432 = var431 + 3L;
                long var469 = var468 * var432;
                long var433 = var469 & 7L;
                long var949;
                var417 = (var949 = var433 - 0L) == 0L ? 0 : (var949 < 0L ? -1 : 1);
                if (var417 == 0) {
                    IllegalStateException var436 = new IllegalStateException();
                    throw var436;
                }
                break label677;
            }

            long var439 = var417;
            long var480 = var439 + 1L;
            var480 = var439 * var480;
            var439 = var480 & 1L;
            long var950;
            int var441 = (var950 = var439 - 0L) == 0L ? 0 : (var950 < 0L ? -1 : 1);
            if (var441 == 0) {
                return;
            }
        }

        IllegalStateException var435 = new IllegalStateException();
        throw var435;
    }

    private float J(float var1, float var2, float var3, float var4, int var5) {
        label96: {
            int var7 = System.identityHashCode(this);
            float var8 = var3 - var1;
            float var9 = Math.abs(var8);
            float var152;
            int var87 = (var152 = var9 - 4.0F) == 0.0F ? 0 : (var152 < 0.0F ? -1 : 1);
            long var10 = var7;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            var10 = var12 & 1L;
            long var153;
            int var111 = (var153 = var10 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
            int var15;
            if (var111 != 0) {
                var15 = var5 ^ 37936526;
                var15 ^= 1352725810;
            } else {
                var15 = var5 - -1683837979;
                var15 |= 293073825;
                var15 |= 1796129206;
                var15 ^= -182224395;
                var15 ^= 1752157381;
                if (var87 < 0) {
                    switch (var15) {
                        case -1648181934:
                            var15 ^= 1125036837;
                            break;
                        case -432846129:
                            var15 *= 485309713;
                            var15 ^= 1283520930;
                            var15 ^= 755583248;
                            var15 |= 445021826;
                            var15 ^= 480806307;
                            break;
                        case 2074800205:
                        default:
                            var15 ^= 1235586605;
                    }

                    this.O = var3;
                    return var8;
                }

                var15 -= 450610353;
                var15 &= -621809065;
                var15 &= -127317680;
                var15 ^= -1952712795;
                Integer var88 = var15;
                if (var88 == null) {
                    break label96;
                }

                var9 = var3 + var4;
                float var112 = var1 + var2;
                var9 -= var112;
                var10 = var7;
                var12 = var10 + 1L;
                var12 = var10 * var12;
                var10 = var12 & 1L;
                long var154;
                int var115 = (var154 = var10 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                if (var115 != 0) {
                    var15 >>= 8;
                    var15 -= -318352098;
                    var15 |= 280433466;
                    var15 -= -115498131;
                    var15 ^= -1112439310;
                } else {
                    var15 |= -1366138675;
                    var15 *= 376350559;
                    var15 *= 618835389;
                    var15 ^= 340042477;
                    Integer var116 = var15;
                    if (var116 == null) {
                        break label96;
                    }

                    var9 = Math.abs(var9);
                    float var155;
                    int var92 = (var155 = var9 - 4.0F) == 0.0F ? 0 : (var155 < 0.0F ? -1 : 1);
                    if (var92 < 0) {
                        var15 >>= 18;
                        var15 &= -483659282;
                        var15 *= -896917311;
                        var15 ^= -1666322509;
                        long var93 = var15;
                        long var11 = var93 + 1L;
                        var11 = var93 * var11;
                        long var13 = var93 + 2L;
                        var11 *= var13;
                        long var94 = var93 + 3L;
                        var11 *= var94;
                        long var95 = var11 & 7L;
                        long var156;
                        int var96 = (var156 = var95 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var96 != 0) {
                            break label96;
                        }

                        var9 = var3 + var4;
                        var10 = var7;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var157;
                        int var119 = (var157 = var10 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                        if (var119 == 0) {
                            var15 ^= 1919106237;
                            var15 ^= 215999948;
                            Integer var120 = var15;
                            if (var120 != null) {
                                this.O = var9;
                                return var9;
                            }
                            break label96;
                        }

                        var15 += 1994096124;
                        var15 *= 1252079989;
                        var15 += -1024245186;
                        var15 ^= 1015193811;
                    } else {
                        var15 ^= -148332321;
                        var15 >>= 13;
                        var15 *= 1835524895;
                        var15 ^= -49321576;
                        var9 = var4 * 0.5F;
                        var9 = var3 + var9;
                        float var121 = var2 * 0.5F;
                        float var122 = var1 + var121;
                        var9 -= var122;
                        var9 = Math.abs(var9);
                        float var158;
                        int var102 = (var158 = var9 - 4.0F) == 0.0F ? 0 : (var158 < 0.0F ? -1 : 1);
                        int var123 = var7 + 1;
                        int var124 = var7 * var123;
                        int var142 = var7 + 2;
                        int var125 = var124 * var142;
                        var142 = var7 + 3;
                        int var126 = var125 * var142;
                        int var127 = var126 & 7;
                        if (var127 == 0) {
                            var15 &= -527829956;
                            var15 |= 380781343;
                            var15 *= -791110093;
                            var15 ^= -1451050216;
                            var15 ^= 477243514;
                            int var128 = var15 + 1;
                            int var129 = var15 * var128;
                            var142 = var15 + 2;
                            int var130 = var129 * var142;
                            var142 = var15 + 3;
                            int var131 = var130 * var142;
                            int var132 = var131 & 7;
                            if (var132 != 0) {
                                break label96;
                            }

                            if (var102 >= 0) {
                                var15 -= -2115324412;
                                var15 ^= -892142485;
                                Integer var84 = var15;
                                if (var84 != null) {
                                    return Float.NaN;
                                }
                                break label96;
                            }

                            var15 -= 878597006;
                            var15 |= 514625565;
                            var15 += -1714542388;
                            var15 -= 1882656706;
                            var15 ^= -1386743263;
                            int var103 = var15 + 1;
                            int var104 = var15 * var103;
                            int var133 = var15 + 2;
                            int var105 = var104 * var133;
                            int var134 = var15 + 3;
                            int var106 = var105 * var134;
                            int var107 = var106 & 7;
                            if (var107 != 0) {
                                break label96;
                            }

                            var9 = var4 * 0.5F;
                            var9 = var3 + var9;
                            int var135 = var7 + 1;
                            int var136 = var7 * var135;
                            var142 = var7 + 2;
                            int var137 = var136 * var142;
                            var7 += 3;
                            int var138 = var137 * var7;
                            var7 = var138 & 7;
                            if (var7 == 0) {
                                var15 &= -566588053;
                                var15 -= 1837986718;
                                var15 >>>= 16;
                                var15 ^= -695095556;
                                var15 ^= 1606193460;
                                var7 = var15 + 1;
                                var7 = var15 * var7;
                                var7 &= 1;
                                if (var7 == 0) {
                                    this.O = var9;
                                    return var9;
                                }
                                break label96;
                            }

                            var15 &= -1799414534;
                            var15 |= 230180461;
                            var15 -= 1797065385;
                            var15 ^= -377437190;
                            var15 ^= -334561600;
                        } else {
                            switch (var15) {
                                case -603257860:
                                    var15 >>= 22;
                                    var15 &= 138386166;
                                    var15 ^= -1355814132;
                                    break;
                                case 1870207604:
                                default:
                                    var15 ^= 975809418;
                                    break;
                                case 1921157801:
                                    var15 ^= 2006592613;
                            }
                        }
                    }
                }
            }

            Integer var69 = var15;
            if (var69 != null) {
                UnsupportedOperationException var70 = new UnsupportedOperationException();
                throw var70;
            }
        }

        IllegalStateException var71 = new IllegalStateException();
        throw var71;
    }

    private void SY(lH_3 var1, int var2) {
        int var4 = System.identityHashCode(this);
        tR_2 var5 = this.Bn;
        this.Bn = null;
        this.D = Float.NaN;
        this.dL = Float.NaN;
        float var6 = this.J;
        float var7 = this.Td;
        var6 -= var7;
        var6 = Math.abs(var6);
        var7 = this.U;
        float var8 = this.B;
        int var9 = var4 + 1;
        var9 = var4 * var9;
        int var10 = var4 + 2;
        var9 *= var10;
        var10 = var4 + 3;
        var9 *= var10;
        var9 &= 7;
        label34:
        if (var9 == 0) {
            int var16 = var2 + 358569189;
            var16 ^= 1326558762;
            long var61 = var16;
            long var11 = var61 + 1L;
            var11 = var61 * var11;
            long var62 = var11 & 1L;
            long var71;
            var9 = (var71 = var62 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
            if (var9 == 0) {
                var7 -= var8;
                var7 = Math.abs(var7);
                var6 += var7;
                float var72;
                int var39 = (var72 = var6 - 0.5F) == 0.0F ? 0 : (var72 < 0.0F ? -1 : 1);
                if (var39 < 0) {
                    var16 *= 1240093599;
                    var16 ^= -191043708;
                    var16 >>>= 27;
                    var16 ^= -1433657754;
                    Integer var40 = var16;
                    if (var40 != null) {
                        return;
                    }
                } else {
                    var16 >>= 4;
                    var16 ^= -1484216616;
                    long var41 = var16;
                    long var52 = var41 + 1L;
                    long var53 = var41 * var52;
                    long var42 = var53 & 1L;
                    long var73;
                    int var43 = (var73 = var42 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var43 == 0) {
                        var6 = this.J;
                        long var48 = var4;
                        long var64 = var48 + 1L;
                        long var65 = var48 * var64;
                        long var49 = var65 & 1L;
                        long var74;
                        var4 = (var74 = var49 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            var16 &= 293599157;
                            var16 &= 2113976755;
                            var16 &= 808995364;
                            var16 |= -1742533944;
                            var16 ^= -785617865;
                            float var35 = this.U;
                            var7 = var5.tQ();
                            var8 = var5.Q;
                            var7 *= var8;
                            var8 = var5.Yo();
                            float var66 = var5.Q;
                            var8 *= var66;
                            float var67 = var1.d;
                            float var69 = var1.S;
                            var5.BH(var6, var35, var7, var8, var67, var69);
                            return;
                        }

                        var16 *= 1936586729;
                        var16 |= 2053626525;
                        var16 ^= -1257161131;
                        break label34;
                    }
                }
            }

            UnsupportedOperationException var33 = new UnsupportedOperationException();
            throw var33;
        } else {
            int var3 = var2 + 314093075;
            var3 += 1549407820;
            var3 &= 1885397593;
            var3 ^= -87144477;
        }

        AssertionError var27 = new AssertionError();
        throw var27;
    }

    public void S(Canvas var1, lH_3 var2) {
        label101: {
            int var3 = f;
            var3 ^= 265479980;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var145;
            int var85 = (var145 = var5 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
            if (var85 == 0) {
                var3 -= 2076024117;
                var3 -= 1873404795;
                var3 += 2081819705;
                var3 ^= 1013531742;
                Integer var86 = var3;
                if (var86 == null) {
                    break label101;
                }

                XF var87 = this.A;
                float var88 = var87.bs();
                float var146;
                int var6 = (var146 = var88 - 0.01F) == 0.0F ? 0 : (var146 < 0.0F ? -1 : 1);
                if (var6 < 0) {
                    var3 ^= 241524489;
                    var3 &= 830483487;
                    var3 ^= 1897686825;
                    Integer var95 = var3;
                    if (var95 != null) {
                        return;
                    }
                    break label101;
                }
                var3 = switch (var3) {
                    case -1543377692 -> var3 ^ -479036199;
                    default -> var3 ^ 62884229;
                    case 1243310828 -> {
                        var3 |= 1625254279;
                        var3 |= 2082847525;
                        yield var3 ^ -2070002952;
                    }
                };
                Oo var93 = var2.Y;
                var6 = var93.E();
                XF var97 = this.wO;
                float var98 = var97.bs();
                float var8 = TP.S(var88);
                float var99 = var98 * var8;
                XF var109 = this.Ul;
                var8 = var109.bs();
                float var89 = TP.S(var88);
                float var90 = var8 * var89;
                long var111 = var4;
                long var10 = var111 + 1L;
                var10 = var111 * var10;
                long var12 = var111 + 2L;
                var10 *= var12;
                long var112 = var111 + 3L;
                var10 *= var112;
                long var113 = var10 & 7L;
                long var147;
                int var114 = (var147 = var113 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                if (var114 != 0) {
                    switch (var3) {
                        case -1092396723:
                        default:
                            var3 ^= 309902807;
                            break;
                        case -94258921:
                            var3 &= 162639154;
                            var3 -= 1764337161;
                            var3 ^= -1748525713;
                            break;
                        case 1473160856:
                            var3 ^= -1186379579;
                    }
                } else {
                    label105: {
                        var3 &= -1699402503;
                        var3 >>>= 5;
                        var3 ^= 937911516;
                        float var148;
                        int var115 = (var148 = var99 - 0.01F) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
                        if (var115 > 0) {
                            var3 += 1952444814;
                            var3 += 1773237161;
                            var3 -= 1688206488;
                            var3 ^= 344793651;
                            var3 ^= -856993933;
                            int var116 = var3 + 1;
                            int var117 = var3 * var116;
                            int var118 = var117 & 1;
                            if (var118 != 0) {
                                break label101;
                            }

                            var8 = this.RS;
                            var8 -= 0.3F;
                            Integer var9 = var4;
                            if (var9 == null) {
                                var3 *= 1034095679;
                                var3 *= -27779965;
                                var3 >>= 15;
                                var3 += 856532339;
                                var3 ^= 976392822;
                                break label105;
                            }

                            var3 &= 1907359725;
                            var3 ^= -1096793291;
                            var3 ^= 1742030972;
                            var3 ^= 502144314;
                            var9 = var3;
                            if (var9 == null) {
                                break label101;
                            }

                            float var131 = var2.S;
                            float var100 = 0.75F * var99;
                            int var101 = DP.Y(var6, var100);
                            var1.rect(var8, 0.0F, 0.6F, var131, var101);
                            var3 |= 1596558361;
                            var3 |= 1566312565;
                            var3 |= 1904179519;
                            var3 ^= -1400280134;
                        } else {
                            var3 ^= -577331910;
                            var3 ^= 1673876533;
                            var3 ^= -560778666;
                        }

                        var7 = var3;
                        long var132 = var7 + 1L;
                        var132 = var7 * var132;
                        long var11 = var7 + 2L;
                        var132 *= var11;
                        var7 += 3L;
                        var132 *= var7;
                        var7 = var132 & 7L;
                        long var149;
                        int var105 = (var149 = var7 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                        if (var105 != 0) {
                            break label101;
                        }

                        float var150;
                        int var106 = (var150 = var90 - 0.01F) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
                        Integer var121 = var4;
                        if (var121 == null) {
                            var3 += 80659163;
                            var3 += -1076643275;
                            var3 ^= -1640076681;
                            var3 ^= -1885804604;
                        } else {
                            var3 *= 331353481;
                            var3 += 436643205;
                            var3 ^= -484826313;
                            Integer var122 = var3;
                            if (var122 == null) {
                                break label101;
                            }

                            if (var106 <= 0) {
                                var3 ^= 457144026;
                                var3 <<= 27;
                                var3 ^= 867933000;
                                return;
                            }

                            var3 |= -81184421;
                            var3 += 1172134729;
                            var3 |= -1424594636;
                            var3 ^= 1451595715;
                            float var107 = this.XZ;
                            float var108 = var107 - 0.3F;
                            int var123 = var4 + 1;
                            int var124 = var4 * var123;
                            int var136 = var4 + 2;
                            int var125 = var124 * var136;
                            var4 += 3;
                            int var126 = var125 * var4;
                            var4 = var126 & 7;
                            if (var4 == 0) {
                                var3 -= -230937115;
                                var3 ^= -1809350410;
                                var3 -= 1196564318;
                                var3 ^= 971661343;
                                long var127 = var3;
                                var10 = var127 + 1L;
                                var10 = var127 * var10;
                                var12 = var127 + 2L;
                                var10 *= var12;
                                long var128 = var127 + 3L;
                                var10 *= var128;
                                long var129 = var10 & 7L;
                                long var151;
                                var4 = (var151 = var129 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label101;
                                }

                                float var83 = var2.d;
                                float var91 = 0.75F * var90;
                                int var92 = DP.Y(var6, var91);
                                var1.rect(0.0F, var108, var83, 0.6F, var92);
                                var3 ^= -1530515045;
                                var3 &= 2055112465;
                                var3 ^= -888422993;
                                var3 ^= 16426983;
                                return;
                            }

                            switch (var3) {
                                case -1970153122:
                                default:
                                    var3 ^= -1337907749;
                                    break;
                                case -1109693185:
                                    var3 &= -1599645398;
                                    var3 &= -1385124551;
                                    var3 >>>= 13;
                                    var3 ^= 154836582;
                                    break;
                                case -516451401:
                                    var3 ^= -1898787316;
                            }
                        }
                    }
                }
            } else {
                var3 *= 1270276979;
                var3 ^= 256153318;
                var3 -= 1820921066;
                var3 ^= 1482145221;
            }

            Integer var77 = var3;
            if (var77 != null) {
                IllegalStateException var79 = new IllegalStateException();
                throw var79;
            }
        }

        UnsupportedOperationException var78 = new UnsupportedOperationException();
        throw var78;
    }

    public void O(Canvas var1, lH_3 var2) {
        label457: {
            label456: {
                int var3 = f;
                var3 ^= -2096418559;
                int var4 = System.identityHashCode(this);
                XF var5 = this.A;
                float var292 = var5.bs();
                long var6 = var4;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var601;
                int var304 = (var601 = var6 - 0L) == 0L ? 0 : (var601 < 0L ? -1 : 1);
                if (var304 == 0) {
                    var3 &= 1332981924;
                    var3 >>= 11;
                    var3 >>= 12;
                    var3 += -161466164;
                    var3 ^= -1178557872;
                    Integer var305 = var3;
                    if (var305 == null) {
                        break label457;
                    }

                    float var602;
                    int var306 = (var602 = var292 - 0.01F) == 0.0F ? 0 : (var602 < 0.0F ? -1 : 1);
                    if (var306 < 0) {
                        var3 &= 715245645;
                        var3 >>= 17;
                        var3 |= -1250621384;
                        var3 *= 587581481;
                        var3 ^= -346410683;
                        return;
                    }

                    var3 &= -1361840751;
                    var3 >>>= 16;
                    var3 ^= -2142113485;
                    int var307 = var3 + 1;
                    int var308 = var3 * var307;
                    int var7 = var3 + 2;
                    int var309 = var308 * var7;
                    var7 = var3 + 3;
                    int var310 = var309 * var7;
                    int var311 = var310 & 7;
                    if (var311 != 0) {
                        break label457;
                    }

                    Oo var312 = var2.Y;
                    var7 = var4 + 1;
                    var7 = var4 * var7;
                    var7 &= 1;
                    if (var7 == 0) {
                        var3 = switch (var3) {
                            case -2142109773 -> {
                                var3 -= -577947032;
                                var3 += 1366655534;
                                var3 ^= 302185126;
                                var3 += -1627387709;
                                yield var3 ^ -2130734479;
                            }
                            default -> var3 ^ -1682179174;
                            case 1763982763 -> var3 ^ 2144145601;
                        };
                        Integer var321 = var3;
                        if (var321 == null) {
                            break label457;
                        }

                        Oo var313 = var312;
                        int var322 = var312.E();
                        var322 = var322;
                        var1.save();
                        float var332 = TP.S(var292);
                        var1.alpha(var332);
                        BP var333 = this.Ie;
                        List var334 = var333.TR();
                        Iterator var335 = var334.iterator();
                        Iterator var336 = var335;
                        var3 *= -1890979063;
                        var3 ^= -1758361561;

                        label450:
                        while (true) {
                            int var9 = (var336.hasNext()) ? 1 : 0;
                            int var10 = var4 + 1;
                            var10 = var4 * var10;
                            var10 &= 1;
                            if (var10 != 0) {
                                var3 |= 955447804;
                                var3 ^= -216518746;
                                break;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ -292512547;
                                case -511652788 -> {
                                    var3 += 2125012225;
                                    var3 ^= 691029100;
                                    yield var3 ^ -1024062846;
                                }
                                case 893518210 -> var3 ^ -1191828311;
                            };
                            if (var9 == 0) {
                                var3 |= 672200850;
                                var3 *= 659353567;
                                var3 -= -1141543317;
                                var3 ^= 25669022;
                                Integer var324 = var3;
                                if (var324 == null) {
                                    break label457;
                                }

                                TextStyle var325 = this.tq;
                                float var326 = var1.measure("Drag to move  ·  Scroll to resize  ·  Right-click to reset", var325);
                                float var327 = var326 + 14.0F;
                                float var328 = var327;
                                Integer var337 = var4;
                                if (var337 != null) {
                                    var3 *= -1257736923;
                                    var3 ^= 953111611;
                                    Integer var338 = var3;
                                    if (var338 == null) {
                                        break label457;
                                    }

                                    float var339 = var2.d;
                                    float var340 = var339 - var327;
                                    float var341 = var340 * 0.5F;
                                    float var342 = var341;
                                    float var354 = 4.0F;
                                    BP var377 = this.Ie;
                                    List var378 = var377.TR();
                                    Iterator var379 = var378.iterator();
                                    Iterator var380 = var379;
                                    float var355 = var354;

                                    var3 = switch (var3) {
                                        case -1237108169 -> {
                                            var3 *= 242578699;
                                            var3 &= -316508447;
                                            var3 >>= 18;
                                            yield var3 ^ -2055090185;
                                        }
                                        default -> var3 ^ 446487216;
                                        case 1284279380 -> var3 ^ -1231735264;
                                    };

                                    while (true) {
                                        int var445 = (var380.hasNext()) ? 1 : 0;
                                        long var471 = var4;
                                        long var567 = var471 + 1L;
                                        var567 = var471 * var567;
                                        long var599 = var471 + 2L;
                                        var567 *= var599;
                                        var471 += 3L;
                                        var567 *= var471;
                                        var471 = var567 & 7L;
                                        long var603;
                                        int var474 = (var603 = var471 - 0L) == 0L ? 0 : (var603 < 0L ? -1 : 1);
                                        if (var474 != 0) {
                                            var3 |= -536396336;
                                            var3 ^= -278057051;
                                            break label450;
                                        }

                                        var3 >>>= 14;
                                        var3 >>= 13;
                                        var3 *= -1528162329;
                                        var3 |= -1170988062;
                                        var3 ^= -1694468423;
                                        var471 = var3;
                                        var567 = var471 + 1L;
                                        var567 = var471 * var567;
                                        var471 = var567 & 1L;
                                        long var604;
                                        int var477 = (var604 = var471 - 0L) == 0L ? 0 : (var604 < 0L ? -1 : 1);
                                        if (var477 != 0) {
                                            break label457;
                                        }

                                        if (var445 == 0) {
                                            var3 -= -2054971985;
                                            var3 -= -1308855400;
                                            var3 &= -834507678;
                                            var3 ^= 713148563;
                                            XF var381 = this.qV;
                                            float var605;
                                            var445 = (var605 = var355 - 64.0F) == 0.0F ? 0 : (var605 < 0.0F ? -1 : 1);
                                            Integer var508 = var4;
                                            if (var508 != null) {
                                                var3 >>>= 10;
                                                var3 ^= 1116590795;
                                                var3 &= 1376584242;
                                                var3 >>>= 17;
                                                var3 ^= -268012989;
                                                int var509 = var3 + 1;
                                                int var510 = var3 * var509;
                                                int var511 = var510 & 1;
                                                if (var511 != 0) {
                                                    break label457;
                                                }

                                                float var458;
                                                if (var445 > 0) {
                                                    var3 >>= 23;
                                                    var3 -= 814495162;
                                                    var3 ^= -484053858;
                                                    var3 ^= 597100624;
                                                    var458 = 0.0F;
                                                    var3 -= 1104328092;
                                                    var3 >>= 14;
                                                    var3 ^= -1844803962;
                                                } else {
                                                    var3 |= 819301985;
                                                    var3 &= -1536700563;
                                                    var3 ^= 826397635;
                                                    int var512 = var3 + 1;
                                                    int var513 = var3 * var512;
                                                    int var560 = var3 + 2;
                                                    int var514 = var513 * var560;
                                                    var560 = var3 + 3;
                                                    int var515 = var514 * var560;
                                                    int var516 = var515 & 7;
                                                    if (var516 != 0) {
                                                        break label457;
                                                    }

                                                    var458 = 1.0F;
                                                    switch (var3) {
                                                        case -2095487549:
                                                        default:
                                                            var3 ^= 316636181;
                                                            break;
                                                        case -1861870430:
                                                            var3 ^= -1846186899;
                                                            var3 ^= 1829159408;
                                                            break;
                                                        case 1864615519:
                                                            var3 ^= -898915413;
                                                    }
                                                }

                                                var471 = var3;
                                                var567 = var471 + 1L;
                                                var567 = var471 * var567;
                                                var471 = var567 & 1L;
                                                long var606;
                                                int var519 = (var606 = var471 - 0L) == 0L ? 0 : (var606 < 0L ? -1 : 1);
                                                if (var519 != 0) {
                                                    break label457;
                                                }

                                                var381.H(var458);
                                                XF var382 = this.qV;
                                                float var459 = var2.Ik;
                                                float var383 = var382.N(var459);
                                                float var384 = TP.S(var383);
                                                Re var385 = this.T;
                                                float var356 = Math.min(var355, 64.0F);
                                                float var460 = var2.Ik;
                                                float var357 = var385.Gc(var356, var460);
                                                float var293 = 1.0F - var292;
                                                var10 = var4 + 1;
                                                var10 = var4 * var10;
                                                var445 = var4 + 2;
                                                var10 *= var445;
                                                var445 = var4 + 3;
                                                var10 *= var445;
                                                var10 &= 7;
                                                if (var10 == 0) {
                                                    var3 = switch (var3) {
                                                        default -> var3 ^ 1342180011;
                                                        case 854999641 -> var3 ^ 1518778510;
                                                        case 1844818239 -> {
                                                            var3 -= -422008315;
                                                            var3 -= 925811558;
                                                            var3 &= -1738568098;
                                                            var3 ^= 285255207;
                                                            yield var3 ^ -1490076874;
                                                        }
                                                    };
                                                    long var463 = var3;
                                                    long var562 = var463 + 1L;
                                                    var562 = var463 * var562;
                                                    long var464 = var562 & 1L;
                                                    long var607;
                                                    var10 = (var607 = var464 - 0L) == 0L ? 0 : (var607 < 0L ? -1 : 1);
                                                    if (var10 != 0) {
                                                        break label457;
                                                    }

                                                    float var294 = var293 * -6.0F;
                                                    float var295 = var357 + var294;
                                                    float var608;
                                                    int var296 = (var608 = var384 - 0.01F) == 0.0F ? 0 : (var608 < 0.0F ? -1 : 1);
                                                    if (var296 <= 0) {
                                                        var3 <<= 9;
                                                        var3 ^= 2028709874;
                                                        var3 |= 855263777;
                                                        var3 ^= 526617678;
                                                        break label456;
                                                    }

                                                    var3 -= 691603262;
                                                    var3 &= -1383508260;
                                                    var3 |= 1087523241;
                                                    var3 ^= -1522646358;
                                                    long var358 = var3;
                                                    long var465 = var358 + 1L;
                                                    long var466 = var358 * var465;
                                                    long var359 = var466 & 1L;
                                                    long var609;
                                                    int var297 = (var609 = var359 - 0L) == 0L ? 0 : (var609 < 0L ? -1 : 1);
                                                    if (var297 != 0) {
                                                        break label457;
                                                    }

                                                    var1.save();
                                                    var1.alpha(var384);
                                                    float var298 = var295 + 1.5F;
                                                    var9 = var313.g();
                                                    var1.shadow(var342, var298, var328, 12.0F, 6.0F, 10.0F, var9);
                                                    int var299 = var3 + 28253869;
                                                    int var300 = var299 >>> 10;
                                                    int var301 = var300 ^ 1422851568;
                                                    bI(var1, var313, var342, var295, var328, 12.0F, 0.92F, var301);
                                                    float var302 = var342 + 7.0F;
                                                    TextStyle var314 = this.tq;
                                                    float var315 = var314.size();
                                                    int var329 = var4 + 1;
                                                    var329 = var4 * var329;
                                                    var4 = var329 & 1;
                                                    if (var4 == 0) {
                                                        var3 -= 1045534392;
                                                        var3 += 1051433398;
                                                        var3 ^= 1049193028;
                                                        var4 = var3 + 1;
                                                        var4 = var3 * var4;
                                                        var4 &= 1;
                                                        if (var4 != 0) {
                                                            break label457;
                                                        }

                                                        float var288 = 12.0F - var315;
                                                        float var289 = var288 * 0.5F;
                                                        float var290 = var295 + var289;
                                                        TextStyle var316 = this.tq;
                                                        float var291 = var1.text(
                                                            "Drag to move  ·  Scroll to resize  ·  Right-click to reset", var302, var290, var316
                                                        );
                                                        var1.restore();
                                                        var3 += -486963693;
                                                        var3 ^= -433317399;
                                                        break label456;
                                                    }

                                                    var3 ^= 1792150141;
                                                    var3 |= -1954803308;
                                                    var3 &= -1093834382;
                                                    var3 &= -453176846;
                                                    var3 ^= -1968778456;
                                                } else {
                                                    var3 *= 318034045;
                                                    var3 ^= -1931253719;
                                                    var3 += 1230877908;
                                                    var3 ^= 1739152100;
                                                }
                                            } else {
                                                switch (var3) {
                                                    case 612475027:
                                                        var3 *= -923030913;
                                                        var3 += -1489054548;
                                                        var3 ^= 716884419;
                                                        break label450;
                                                    case 1168565178:
                                                        var3 ^= 786838678;
                                                        break label450;
                                                    case 1369057345:
                                                    default:
                                                        var3 ^= -1323105738;
                                                }
                                            }
                                            break label450;
                                        }
                                        var3 = switch (var3) {
                                            case 473113673 -> var3 ^ -8885156;
                                            default -> var3 ^ -733308948;
                                            case 1706363211 -> {
                                                var3 -= -933953388;
                                                var3 |= -337510708;
                                                var3 &= -1069293816;
                                                yield var3 ^ -2038906629;
                                            }
                                        };
                                        var445 = var3 + 1;
                                        var445 = var3 * var445;
                                        int var478 = var3 + 2;
                                        var445 *= var478;
                                        int var479 = var3 + 3;
                                        var445 *= var479;
                                        var445 &= 7;
                                        if (var445 != 0) {
                                            break label457;
                                        }

                                        Object var451 = var380.next();
                                        Integer var480 = var4;
                                        if (var480 == null) {
                                            var3 ^= -388761593;
                                            var3 ^= 1097307919;
                                            var3 &= -524593075;
                                            var3 -= 1295845218;
                                            var3 ^= -1717134659;
                                            break label450;
                                        }

                                        var3 &= -749959678;
                                        var3 += -1981644916;
                                        var3 -= -1255101706;
                                        var3 ^= 1204305623;
                                        int var481 = var3 + 1;
                                        int var482 = var3 * var481;
                                        int var483 = var482 & 1;
                                        if (var483 != 0) {
                                            break label457;
                                        }

                                        tR_2 var452 = (tR_2)var451;
                                        boolean var484 = var452.JK;
                                        if (var484) {
                                            var3 >>= 3;
                                            var3 <<= 5;
                                            var3 &= -147161117;
                                            var3 ^= 1367039173;
                                            int var485 = var3 + 1;
                                            int var486 = var3 * var485;
                                            int var487 = var486 & 1;
                                            if (var487 != 0) {
                                                break label457;
                                            }

                                            float var488 = var452.J;
                                            Integer var538 = var4;
                                            if (var538 == null) {
                                                var3 >>>= 30;
                                                var3 *= 536909017;
                                                var3 &= -1241278048;
                                                var3 >>= 13;
                                                var3 ^= 183161434;
                                                break label450;
                                            }
                                            var3 = switch (var3) {
                                                case -1989229419 -> var3 ^ 934137042;
                                                default -> var3 ^ -884273155;
                                                case 343494117 -> {
                                                    var3 += 135856743;
                                                    var3 >>= 15;
                                                    yield var3 ^ -1778841112;
                                                }
                                            };
                                            int var539 = var3 + 1;
                                            var539 = var3 * var539;
                                            int var573 = var3 + 2;
                                            var539 *= var573;
                                            int var574 = var3 + 3;
                                            var539 *= var574;
                                            var539 &= 7;
                                            if (var539 != 0) {
                                                break label457;
                                            }

                                            float var610;
                                            int var489 = (var610 = var488 - 0.05F) == 0.0F ? 0 : (var610 < 0.0F ? -1 : 1);
                                            if (var489 < 0) {
                                                var3 &= 1767045597;
                                                var3 += 1505191604;
                                                var3 ^= 628912200;
                                                Integer var490 = var3;
                                                if (var490 == null) {
                                                    break label457;
                                                }

                                                var355 = var355;
                                                var3 += -631780848;
                                                var3 ^= 668688805;
                                                var3 ^= -91679294;
                                            } else {
                                                var3 *= 1254813447;
                                                var3 ^= -364696522;
                                                Integer var491 = var3;
                                                if (var491 == null) {
                                                    break label457;
                                                }

                                                float var492 = var452.Au;
                                                Integer var544 = var4;
                                                if (var544 == null) {
                                                    var3 >>>= 21;
                                                    var3 ^= 563370125;
                                                    var3 -= 527218878;
                                                    var3 -= -318539619;
                                                    var3 ^= 533659472;
                                                    break label450;
                                                }

                                                var3 -= 446768146;
                                                var3 += 845261602;
                                                var3 >>= 26;
                                                var3 ^= -972816591;
                                                var544 = var3;
                                                if (var544 == null) {
                                                    break label457;
                                                }

                                                float var546 = var342 + var328;
                                                float var611;
                                                int var493 = (var611 = var492 - var546) == 0.0F ? 0 : (var611 < 0.0F ? -1 : 1);
                                                float var456;
                                                if (var493 < 0) {
                                                    var3 &= 1173257061;
                                                    var3 ^= -1561504384;
                                                    var471 = var3;
                                                    var567 = var471 + 1L;
                                                    var567 = var471 * var567;
                                                    var471 = var567 & 1L;
                                                    long var612;
                                                    int var496 = (var612 = var471 - 0L) == 0L ? 0 : (var612 < 0L ? -1 : 1);
                                                    if (var496 != 0) {
                                                        break label457;
                                                    }

                                                    float var497 = var452.gd;
                                                    long var547 = var4;
                                                    long var587 = var547 + 1L;
                                                    var587 = var547 * var587;
                                                    long var600 = var547 + 2L;
                                                    var587 *= var600;
                                                    long var548 = var547 + 3L;
                                                    var587 *= var548;
                                                    long var549 = var587 & 7L;
                                                    long var613;
                                                    int var550 = (var613 = var549 - 0L) == 0L ? 0 : (var613 < 0L ? -1 : 1);
                                                    if (var550 != 0) {
                                                        switch (var3) {
                                                            case -1560193596:
                                                                var3 *= 1012289553;
                                                                var3 -= 1733785326;
                                                                var3 ^= 1570152924;
                                                                var3 *= -972764195;
                                                                var3 ^= 1101519928;
                                                                break label450;
                                                            case -1496101104:
                                                                var3 ^= -1620164644;
                                                                break label450;
                                                            case 1791205358:
                                                            default:
                                                                var3 ^= -1932399735;
                                                                break label450;
                                                        }
                                                    }

                                                    var3 ^= 855095909;
                                                    var3 ^= 1078539570;
                                                    var3 ^= 548313076;
                                                    float var614;
                                                    int var498 = (var614 = var342 - var497) == 0.0F ? 0 : (var614 < 0.0F ? -1 : 1);
                                                    if (var498 < 0) {
                                                        var3 *= 1280954249;
                                                        var3 ^= 611616928;
                                                        var3 ^= -617501437;
                                                        float var499 = var452.eU;
                                                        float var551 = var355 + 12.0F;
                                                        float var615;
                                                        int var500 = (var615 = var499 - var551) == 0.0F ? 0 : (var615 < 0.0F ? -1 : 1);
                                                        long var552 = var4;
                                                        var587 = var552 + 1L;
                                                        var587 = var552 * var587;
                                                        long var553 = var587 & 1L;
                                                        long var616;
                                                        var550 = (var616 = var553 - 0L) == 0L ? 0 : (var616 < 0L ? -1 : 1);
                                                        if (var550 != 0) {
                                                            switch (var3) {
                                                                case -2082303812:
                                                                    var3 >>= 9;
                                                                    var3 |= 1940220352;
                                                                    var3 ^= -183555182;
                                                                    break label450;
                                                                case -1250259012:
                                                                default:
                                                                    var3 ^= 2085072710;
                                                                    break label450;
                                                                case 844291500:
                                                                    var3 ^= 1298566932;
                                                                    break label450;
                                                            }
                                                        }

                                                        var3 >>>= 5;
                                                        var3 -= 1868179187;
                                                        var3 ^= -1679382703;
                                                        var550 = var3 + 1;
                                                        var550 = var3 * var550;
                                                        var550 &= 1;
                                                        if (var550 != 0) {
                                                            break label457;
                                                        }

                                                        if (var500 < 0) {
                                                            var3 = switch (var3) {
                                                                default -> var3 ^ 1177406217;
                                                                case 253905603 -> {
                                                                    var3 ^= -8898104;
                                                                    yield var3 ^ -1166181605;
                                                                }
                                                                case 398030649 -> var3 ^ 1170381102;
                                                            };
                                                            float var453 = var452.CW;
                                                            float var454 = var453 + 4.0F;
                                                            Integer var501 = var4;
                                                            if (var501 == null) {
                                                                var3 += 725169222;
                                                                var3 ^= 2139811340;
                                                                break label450;
                                                            }

                                                            var3 >>= 13;
                                                            var3 ^= 1754297052;
                                                            float var455 = Math.max(var355, var454);
                                                            var456 = var455;
                                                            var3 ^= -941446059;
                                                            var3 += 811780777;
                                                            var3 ^= -861938678;
                                                        } else {
                                                            var3 += -1551708277;
                                                            var3 ^= 1231499697;
                                                            var456 = var355;
                                                            var3 *= 306594939;
                                                            var3 ^= 1799880519;
                                                            var3 *= 1173341225;
                                                            var3 ^= 1282294082;
                                                        }
                                                    } else {
                                                        var3 &= 771062879;
                                                        var3 ^= 1009534301;
                                                        Integer var502 = var3;
                                                        if (var502 == null) {
                                                            break label457;
                                                        }

                                                        var456 = var355;
                                                        switch (var3) {
                                                            case -1901346398:
                                                            default:
                                                                var3 ^= 1169131421;
                                                                break;
                                                            case 489535271:
                                                                var3 ^= -1163691187;
                                                                break;
                                                            case 490539290:
                                                                var3 -= -1000596190;
                                                                var3 ^= 266161955;
                                                                var3 &= -1366943604;
                                                                var3 ^= 357074648;
                                                        }
                                                    }
                                                } else {
                                                    var3 -= -1225539483;
                                                    var3 |= 344740517;
                                                    var3 ^= 1395064389;
                                                    var456 = var355;
                                                    switch (var3) {
                                                        case -995447646:
                                                            var3 -= -1954043760;
                                                            var3 *= -1952663063;
                                                            var3 ^= -1668599758;
                                                            break;
                                                        case -23402168:
                                                            var3 ^= -459183672;
                                                            break;
                                                        case 1520630348:
                                                        default:
                                                            var3 ^= 1397420154;
                                                    }
                                                }

                                                int var503 = var3 + 1;
                                                int var504 = var3 * var503;
                                                int var558 = var3 + 2;
                                                int var505 = var504 * var558;
                                                var558 = var3 + 3;
                                                int var506 = var505 * var558;
                                                int var507 = var506 & 7;
                                                if (var507 != 0) {
                                                    break label457;
                                                }

                                                var355 = var456;
                                                switch (var3) {
                                                    case 323782224:
                                                        var3 >>>= 28;
                                                        var3 *= -1869462623;
                                                        var3 -= -871448592;
                                                        var3 += 1303197229;
                                                        var3 ^= -1749975967;
                                                        break;
                                                    case 598382245:
                                                    default:
                                                        var3 ^= 841470981;
                                                        break;
                                                    case 667854393:
                                                        var3 ^= -945352763;
                                                }
                                            }
                                        } else {
                                            var3 >>>= 27;
                                            var3 += -158745804;
                                            var3 -= 250744276;
                                            var3 ^= -1714398697;
                                            var355 = var355;
                                            var3 |= 1233795122;
                                            var3 -= 1463881714;
                                            var3 += -1507328250;
                                            var3 ^= 1261906732;
                                        }
                                    }
                                } else {
                                    var3 <<= 1;
                                    var3 ^= 1284362869;
                                    var3 ^= 1736410060;
                                    var3 -= -596854989;
                                    var3 ^= -869272556;
                                    break;
                                }
                            }
                            var3 = switch (var3) {
                                case -1947228253 -> {
                                    var3 += 1606933771;
                                    var3 |= -522736308;
                                    var3 += -796724415;
                                    var3 -= -602484682;
                                    yield var3 ^ 1822086107;
                                }
                                case -1308115560 -> var3 ^ 402615982;
                                default -> var3 ^ 1410924230;
                            };
                            long var343 = var3;
                            long var11 = var343 + 1L;
                            var11 = var343 * var11;
                            long var13 = var343 + 2L;
                            var11 *= var13;
                            long var344 = var343 + 3L;
                            var11 *= var344;
                            long var345 = var11 & 7L;
                            long var617;
                            var9 = (var617 = var345 - 0L) == 0L ? 0 : (var617 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                break label457;
                            }

                            Object var347 = var336.next();
                            tR_2 var348 = (tR_2)var347;
                            var10 = var4 + 1;
                            var10 = var4 * var10;
                            int var395 = var4 + 2;
                            var10 *= var395;
                            int var396 = var4 + 3;
                            var10 *= var396;
                            var10 &= 7;
                            if (var10 != 0) {
                                var3 ^= 609956096;
                                var3 ^= -1236171861;
                                var3 -= -846426498;
                                var3 |= -462211782;
                                var3 ^= -6429343;
                                break;
                            }

                            var3 += 2092681157;
                            var3 ^= 1191514524;
                            int var368 = var348.JK ? 1 : 0;
                            if (var368 != 0) {
                                var3 = switch (var3) {
                                    default -> var3 ^ -1228207723;
                                    case -2017245358 -> var3 ^ 725489069;
                                    case 1320278907 -> {
                                        var3 &= 1830741294;
                                        var3 -= -1490864515;
                                        yield var3 ^ -1529468626;
                                    }
                                };
                                float var369 = var348.J;
                                int var397 = var4 + 1;
                                int var398 = var4 * var397;
                                int var12 = var4 + 2;
                                int var399 = var398 * var12;
                                var12 = var4 + 3;
                                int var400 = var399 * var12;
                                int var401 = var400 & 7;
                                if (var401 != 0) {
                                    var3 |= -668974721;
                                    var3 ^= -758042203;
                                    break;
                                }

                                var3 ^= 1495630393;
                                var3 ^= -2010484948;
                                int var402 = var3 + 1;
                                int var403 = var3 * var402;
                                var12 = var3 + 2;
                                int var404 = var403 * var12;
                                var12 = var3 + 3;
                                int var405 = var404 * var12;
                                int var406 = var405 & 7;
                                if (var406 != 0) {
                                    break label457;
                                }

                                float var618;
                                var368 = (var618 = var369 - 0.05F) == 0.0F ? 0 : (var618 < 0.0F ? -1 : 1);
                                if (var368 >= 0) {
                                    var3 *= 2072258883;
                                    var3 += -1602854260;
                                    var3 ^= -137864596;
                                    Integer var371 = var3;
                                    if (var371 == null) {
                                        break label457;
                                    }

                                    boolean var372 = var348.sg(var2);
                                    int var407 = var4 + 1;
                                    int var408 = var4 * var407;
                                    var12 = var4 + 2;
                                    int var409 = var408 * var12;
                                    var12 = var4 + 3;
                                    int var410 = var409 * var12;
                                    int var411 = var410 & 7;
                                    if (var411 != 0) {
                                        var3 &= 1140560702;
                                        var3 >>>= 12;
                                        var3 <<= 5;
                                        var3 += -457396092;
                                        var3 ^= -299322402;
                                        break;
                                    }

                                    var3 >>>= 18;
                                    var3 |= -2145759014;
                                    var3 ^= 659163345;
                                    if (var372) {
                                        var3 = switch (var3) {
                                            default -> var3 ^ -689879000;
                                            case -1487899858 -> {
                                                var3 |= 1801859282;
                                                var3 -= 1852061679;
                                                var3 >>>= 6;
                                                yield var3 ^ -2094862258;
                                            }
                                            case 628085855 -> var3 ^ 1399664834;
                                        };
                                        boolean var373 = var348.jV();
                                        var11 = var4;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        long var15 = var11 + 2L;
                                        var13 *= var15;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var619;
                                        int var415 = (var619 = var11 - 0L) == 0L ? 0 : (var619 < 0L ? -1 : 1);
                                        if (var415 != 0) {
                                            var3 >>>= 18;
                                            var3 &= -284977544;
                                            var3 ^= 183161362;
                                            break;
                                        }

                                        var3 >>>= 25;
                                        var3 |= -209220389;
                                        var3 ^= 660619904;
                                        var11 = var3;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        var15 = var11 + 2L;
                                        var13 *= var15;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var620;
                                        int var419 = (var620 = var11 - 0L) == 0L ? 0 : (var620 < 0L ? -1 : 1);
                                        if (var419 != 0) {
                                            break label457;
                                        }

                                        if (!var373) {
                                            var3 &= -1795068732;
                                            var3 |= 344830425;
                                            var3 ^= -132218100;
                                            var371 = var3;
                                            if (var371 == null) {
                                                break label457;
                                            }

                                            var3 ^= -806812415;
                                            var3 >>>= 16;
                                            var3 *= -2115577655;
                                            var3 ^= 93030022;
                                        } else {
                                            var3 ^= 290034174;
                                            var3 += 1466854927;
                                            var3 ^= 124526753;
                                            XF var375 = var348.PN;
                                            float var376 = var375.bs();
                                            float var420 = 2.0F + var376;
                                            float var427 = var348.Au;
                                            float var428 = var427 - var420;
                                            float var438 = var348.eU;
                                            float var439 = var438 - var420;
                                            float var14 = var348.gd;
                                            float var521 = var348.Au;
                                            var14 -= var521;
                                            float var522 = var420 * 2.0F;
                                            var14 += var522;
                                            float var523 = var348.CW;
                                            float var16 = var348.eU;
                                            float var524 = var523 - var16;
                                            var16 = var420 * 2.0F;
                                            float var525 = var524 + var16;
                                            var16 = var525 * 0.5F;
                                            var16 = Math.min(var16, 9.0F);
                                            int var17 = DP.Y(var322, 0.95F);
                                            var17 = DP.Z(788529151, var17, var376);
                                            float var18 = var348.J;
                                            var17 = DP.nq(var17, var18);
                                            Paint var581 = Paint.solid(var17);
                                            Integer var593 = var4;
                                            if (var593 == null) {
                                                var3 >>>= 26;
                                                var3 ^= 183161436;
                                                break;
                                            }

                                            var3 -= -1040678952;
                                            var3 -= -561697094;
                                            var3 += -1945469116;
                                            var3 ^= 1854572340;
                                            int var594 = var3 + 1;
                                            int var595 = var3 * var594;
                                            int var596 = var595 & 1;
                                            if (var596 != 0) {
                                                break label457;
                                            }

                                            var18 = 0.25F * var376;
                                            var18 = 0.6F + var18;
                                            Paint var582 = var581.stroke(var18);
                                            var1.roundRect(var428, var439, var14, var525, var16, var582);
                                            float var621;
                                            int var526 = (var621 = var376 - 0.02F) == 0.0F ? 0 : (var621 < 0.0F ? -1 : 1);
                                            if (var526 > 0) {
                                                var3 ^= 1265671420;
                                                var3 ^= 1492654361;
                                                Integer var527 = var3;
                                                if (var527 == null) {
                                                    break label457;
                                                }

                                                String var349 = var348.UJ();
                                                var14 *= 0.5F;
                                                var14 = var428 + var14;
                                                var15 = var4;
                                                long var583 = var15 + 1L;
                                                long var584 = var15 * var583;
                                                long var19 = var15 + 2L;
                                                long var585 = var584 * var19;
                                                var15 += 3L;
                                                long var586 = var585 * var15;
                                                var15 = var586 & 7L;
                                                long var622;
                                                int var531 = (var622 = var15 - 0L) == 0L ? 0 : (var622 < 0L ? -1 : 1);
                                                if (var531 != 0) {
                                                    var3 |= 233055143;
                                                    var3 >>>= 27;
                                                    var3 *= -110047667;
                                                    var3 ^= 1666953818;
                                                    var3 ^= -198347133;
                                                    break;
                                                }

                                                var3 ^= -1443516911;
                                                var3 *= 828507287;
                                                var3 &= 424936860;
                                                var3 |= -1639556210;
                                                var3 ^= -1515443730;
                                                Integer var532 = var3;
                                                if (var532 == null) {
                                                    break label457;
                                                }

                                                float var440 = var439 - 3.0F;
                                                int var533 = var3 & -902271835;
                                                int var534 = var533 * -1199510117;
                                                int var535 = var534 + -814797686;
                                                int var536 = var535 ^ 2120991531;
                                                this.yA(var1, var313, var349, var14, var440, var376, var536);
                                                var3 *= -1276807983;
                                                var3 |= -1852262392;
                                                var3 ^= 614962608;
                                            } else {
                                                var3 += 605354549;
                                                var3 ^= -293073478;
                                                var3 ^= -27455158;
                                            }

                                            long var350 = var3;
                                            var13 = var350 + 1L;
                                            var13 = var350 * var13;
                                            var15 = var350 + 2L;
                                            var13 *= var15;
                                            long var351 = var350 + 3L;
                                            var13 *= var351;
                                            long var352 = var13 & 7L;
                                            long var623;
                                            var9 = (var623 = var352 - 0L) == 0L ? 0 : (var623 < 0L ? -1 : 1);
                                            if (var9 != 0) {
                                                break label457;
                                            }

                                            var3 *= -894065773;
                                            var3 += 1406025172;
                                            var3 *= -1090183159;
                                            var3 *= -1296761959;
                                            var3 ^= 1104114448;
                                        }
                                    } else {
                                        switch (var3) {
                                            case -1487899858:
                                                var3 += -1215288369;
                                                var3 ^= -1084206415;
                                                break;
                                            case -153973609:
                                                var3 ^= -1455213318;
                                                break;
                                            case 1877143658:
                                            default:
                                                var3 ^= -9698921;
                                        }
                                    }
                                } else {
                                    switch (var3) {
                                        case -785101162:
                                            var3 |= -1700538782;
                                            var3 >>>= 5;
                                            var3 ^= -413306181;
                                            break;
                                        case -735889352:
                                            var3 ^= -730637511;
                                            break;
                                        case 525912620:
                                        default:
                                            var3 ^= 2011448575;
                                    }
                                }
                            } else {
                                var3 *= -9896521;
                                var3 *= -2144833541;
                                var3 -= -965880705;
                                var3 ^= -625255508;
                            }
                        }
                    } else {
                        var3 &= 96545374;
                        var3 ^= 179042376;
                    }
                } else {
                    switch (var3) {
                        case -964270627:
                        default:
                            var3 ^= 644517875;
                            break;
                        case -7529151:
                            var3 ^= -1271773263;
                            break;
                        case 1763341572:
                            var3 -= -62442540;
                            var3 ^= 1715049322;
                    }
                }

                Integer var281 = var3;
                if (var281 != null) {
                    UnsupportedOperationException var283 = new UnsupportedOperationException();
                    throw var283;
                }
                break label457;
            }

            var1.restore();
            return;
        }

        IllegalArgumentException var282 = new IllegalArgumentException();
        throw var282;
    }

    private void yA(Canvas var1, Oo var2, String var3, float var4, float var5, float var6, int var7) {
        int var9 = System.identityHashCode(this);
        TextStyle var10 = this.k;
        float var26 = var1.measure(var3, var10);
        float var27 = var26 + 10.0F;
        float var11 = 10.0F;
        float var12 = var27 * 0.5F;
        var12 = var4 - var12;
        float var13 = var5 - var11;
        float var14 = 1.0F - var6;
        var14 *= 3.0F;
        var13 -= var14;
        var1.save();
        var1.alpha(var6);
        int var38 = var7 & -779477784;
        int var39 = var38 * -693427435;
        int var40 = var39 & 1952145300;
        int var41 = var40 | 468661314;
        int var42 = var41 ^ 1329147644;
        bI(var1, var2, var12, var13, var27, var11, 0.95F, var42);
        float var28 = var12 + 5.0F;
        TextStyle var33 = this.k;
        var12 = var33.size();
        var11 -= var12;
        var11 *= 0.5F;
        var11 = var13 + var11;
        TextStyle var35 = this.k;
        Integer var24 = var9;
        if (var24 == null) {
            int var19 = var7 ^ 525594616;
            var19 &= -639364482;
            var19 &= 1563800568;
            var19 >>= 18;
            var19 ^= -559257078;
            UnsupportedOperationException var25 = new UnsupportedOperationException();
            throw var25;
        } else {
            int var8 = var7 * 1809628323;
            var8 |= 1502972177;
            var8 -= 1693570740;
            var8 ^= 256859536;
            float var18 = var1.text(var3, var28, var11, var35);
            var1.restore();
        }
    }

    private static void bI(Canvas var0, Oo var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        int var9 = System.identityHashCode(var0);
        float var10 = var5 * 0.5F;
        int var11 = var1.CU();
        var11 = DP.Y(var11, var6);
        var0.roundRect(var2, var3, var4, var5, var10, var11);
        var10 = var1.x();
        var10 *= 0.5F;
        float var38 = var2 + var10;
        float var12 = var3 + var10;
        float var13 = var10 * 2.0F;
        var13 = var4 - var13;
        float var14 = var10 * 2.0F;
        var14 = var5 - var14;
        float var15 = var5 * 0.5F;
        var10 = var15 - var10;
        int var41 = var9 + 1;
        int var42 = var9 * var41;
        int var16 = var9 + 2;
        int var43 = var42 * var16;
        var9 += 3;
        int var44 = var43 * var9;
        var9 = var44 & 7;
        if (var9 != 0) {
            switch (var7) {
                case -2126967946:
                default:
                    int var28 = var7 ^ -214556624;
                    break;
                case -1824506351:
                    int var27 = var7 ^ 95993953;
                    break;
                case 1423333694:
                    int var22 = var7 + 1895884830;
                    var22 += -59851408;
                    var22 >>= 11;
                    var22 *= -924197179;
                    var22 ^= -1604691031;
            }

            IllegalStateException var33 = new IllegalStateException();
            throw var33;
        } else {
            int var8 = var7 & 1282577093;
            var8 >>= 4;
            var8 ^= -386111592;
            var9 = var8 + 1;
            var9 = var8 * var9;
            var8 = var9 & 1;
            if (var8 != 0) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            } else {
                Paint var20 = var1.Io();
                var0.roundRect(var38, var12, var13, var14, var10, var20);
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1117283887;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        f = var4;
        TextStyle var5 = TextStyle.of(6.2F, -1);
        TextStyle var6 = var5.medium();
        j = var6;
        TextStyle var7 = TextStyle.of(6.0F, -1);
        TextStyle var8 = var7.semibold();
        lH = var8;
    }
}
