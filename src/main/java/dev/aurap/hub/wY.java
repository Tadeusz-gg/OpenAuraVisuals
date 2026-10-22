package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class wY extends XR {
    private static final float y = 15.0F;
    private static final float Hm = 12.0F;
    private static final float u = 3.0F;
    private static final String[] O;
    private final cS S;
    private final XF J;
    private boolean tS;
    private qr U;
    private Be T;
    private byte Qv;
    private int IG;
    private int Fr;
    public static final int LP;

    public wY(cS var1) {
        kE_2 var3 = kE_2.uY(0.32F, 0.95F);
        XF var2 = new XF(0.0F, var3);
        this.J = var2;
        qr var4 = qr.MAIN;
        this.U = var4;
        Be var5 = Be.QUAD;
        this.T = var5;
        this.IG = -1;
        this.Fr = -1;
        this.S = var1;
    }

    @Override
    public xB W() {
        int var1 = LP;
        var1 ^= 1613315223;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var22;
        var2 = (var22 = var18 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1889911218:
                    var1 -= -2145179827;
                    var1 -= 1702225974;
                    var1 -= 678688670;
                    var1 += 1837711491;
                    var1 ^= -335898779;
                    break;
                case -1387203510:
                    var1 ^= 534901260;
                    break;
                case 1400795670:
                default:
                    var1 ^= 268678049;
            }

            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            var1 *= -926506725;
            var1 += 864988986;
            var1 ^= 248401335;
            return this.S;
        }
    }

    private float l(int var1) {
        int var3 = System.identityHashCode(this);
        float var4 = this.pP;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            int var8 = var1 + -1966881803;
            var8 &= -1367250774;
            var8 ^= -1946448951;
            Integer var13 = var8;
            if (var13 == null) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        } else {
            int var2 = var1 & -419249920;
            var2 ^= -2063548216;
            return Math.max(var4, 110.0F);
        }
    }

    @Override
    public float v() {
        int var1 = LP;
        var1 ^= -213085071;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= -913900372;
            var1 ^= -1475103697;
            Integer var14 = var1;
            if (var14 != null) {
                XF var16 = this.J;
                float var17 = var16.bs();
                var3 = var1 >> 24;
                var3 |= -1170448224;
                var3 ^= -1228739021;
                var3 += 1689209798;
                var3 ^= 1794628835;
                float var27 = this.l(var3);
                float var28 = 33.0F + var27;
                float var29 = var28 + 2.0F;
                float var18 = var17 * var29;
                return 15.0F + var18;
            } else {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        } else {
            var1 |= 1537760500;
            var1 += 989142624;
            var1 ^= -1670126090;
            AssertionError var9 = new AssertionError();
            throw var9;
        }
    }

    @Override
    public void ol(float var1) {
        label54: {
            int var2 = LP;
            var2 ^= -767279532;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var62;
            int var42 = (var62 = var4 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var42 != 0) {
                switch (var2) {
                    case 101473783:
                    default:
                        var2 ^= -582700123;
                        break;
                    case 1027030157:
                        var2 |= 598614882;
                        var2 ^= -1015692784;
                        var2 |= -212592861;
                        var2 *= -1033909011;
                        var2 ^= -172107822;
                        break;
                    case 1066814535:
                        var2 ^= 1720731978;
                }
            } else {
                var2 >>= 31;
                var2 ^= 762789819;
                int var43 = var2 + 1;
                int var44 = var2 * var43;
                int var5 = var2 + 2;
                int var45 = var44 * var5;
                var5 = var2 + 3;
                int var46 = var45 * var5;
                int var47 = var46 & 7;
                if (var47 != 0) {
                    break label54;
                }

                XF var48 = this.J;
                int var51 = (this.tS ? 1 : 0);
                float var52;
                if (var51 != 0) {
                    var2 = switch (var2) {
                        case 762789819 -> {
                            var2 &= 1543071406;
                            var2 -= 1345838353;
                            yield var2 ^ -1482710742;
                        }
                        case 1066014074 -> var2 ^ 448282090;
                        default -> var2 ^ -992768922;
                    };
                    var52 = 1.0F;
                    switch (var2) {
                        case -1215628958:
                        default:
                            var2 ^= 1433721723;
                            break;
                        case 514255027:
                            var2 |= 1198699973;
                            var2 ^= 418662350;
                            break;
                        case 1937616895:
                            var2 ^= -721333074;
                    }
                } else {
                    var2 &= 681383146;
                    var2 ^= 958793610;
                    Integer var60 = var2;
                    if (var60 == null) {
                        break label54;
                    }

                    var52 = 0.0F;
                    switch (var2) {
                        case -2013178233:
                            var2 ^= -265751727;
                            break;
                        case 288559904:
                            var2 |= -1343314015;
                            var2 >>= 2;
                            var2 &= 1678763462;
                            var2 ^= 588079097;
                            break;
                        case 1224966546:
                        default:
                            var2 ^= -1046212154;
                    }
                }

                var48.H(var52);
                XF var49 = this.J;
                var51 = var3 + 1;
                var51 = var3 * var51;
                int var61 = var3 + 2;
                var51 *= var61;
                var3 += 3;
                var51 *= var3;
                var3 = var51 & 7;
                if (var3 == 0) {
                    var2 |= 564478569;
                    var2 ^= -2088179400;
                    float var39 = var49.N(var1);
                    return;
                }

                var2 >>= 21;
                var2 -= -1099424088;
                var2 ^= 1730742097;
            }

            UnsupportedOperationException var33 = new UnsupportedOperationException();
            throw var33;
        }

        UnsupportedOperationException var36 = new UnsupportedOperationException();
        throw var36;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        boolean var448 = false;
        label432: {
            label394: {
                int var4 = LP;
                var4 ^= -1403949842;
                int var5 = System.identityHashCode(this);
                cS var6 = this.S;
                du var266 = var6.lP();
                cS var7 = this.S;
                int var272 = var7.b();
                cS var8 = this.S;
                int var285 = var8.U();
                cS var9 = this.S;
                String var291 = var9.Tp();
                float var10 = super.U;
                float var11 = this.y;
                var11 += 3.5F;
                int var12 = var5 + 1;
                var12 = var5 * var12;
                var12 &= 1;
                if (var12 == 0) {
                    var4 = switch (var4) {
                        case 492565197 -> var4 ^ 977334756;
                        default -> var4 ^ -996094721;
                        case 1126329911 -> {
                            var4 ^= -948197080;
                            var4 -= 1046485129;
                            var4 += 1967375695;
                            yield var4 ^ -2007428360;
                        }
                    };
                    Integer var376 = var4;
                    if (var376 == null) {
                        break label432;
                    }

                    TextStyle var377 = lt;
                    TextStyle var13 = lt;
                    int var409 = var13.color();
                    int var410 = DP.nq(var409, var3);
                    TextStyle var378 = var377.color(var410);
                    float var292 = var1.text(var291, var10, var11, var378);
                    float var293 = 0.72F;
                    var10 = 17.0F * var293;
                    var11 = super.U;
                    float var379 = this.pP;
                    var11 += var379;
                    var11 -= 10.0F;
                    var10 = var11 - var10;
                    var11 = this.y;
                    var11++;
                    int var380 = var4 | -86715025;
                    var380 ^= 1159080212;
                    var380 |= 888753254;
                    var380 |= 902506832;
                    var380 ^= -1796025432;
                    eC(var1, var266, var10, var11, var293, var272, var285, var3, 0.0F, var380);
                    float var294 = super.U;
                    var10 = this.pP;
                    float var295 = var294 + var10;
                    float var296 = var295 - 2.0F;
                    var10 = this.y;
                    var10 += 7.5F;
                    XF var363 = this.J;
                    var11 = var363.bs();
                    var380 = DP.nq(-2130706433, var3);
                    Hc.D(var1, var296, var10, var11, var380);
                    XF var297 = this.J;
                    float var298 = var297.bs();
                    float var299 = TP.S(var298);
                    float var637;
                    int var333 = (var637 = var299 - 0.01F) == 0.0F ? 0 : (var637 < 0.0F ? -1 : 1);
                    if (var333 <= 0) {
                        switch (var4) {
                            case -1399051904:
                                var4 ^= 719214473;
                                break;
                            case 104152130:
                            default:
                                var4 ^= -964957003;
                                break;
                            case 862216477:
                                var4 >>= 16;
                                var4 ^= 1838776048;
                                var4 ^= -1024313090;
                                var4 ^= 366138682;
                        }

                        return;
                    }
                    var4 = switch (var4) {
                        case -1520393892 -> var4 ^ -1479592864;
                        case 862216477 -> {
                            var4 |= 83339308;
                            var4 *= -1769855767;
                            var4 *= 895543341;
                            yield var4 ^ 1571790966;
                        }
                        default -> var4 ^ 730094996;
                    };
                    long var334 = var4;
                    long var386 = var334 + 1L;
                    long var387 = var334 * var386;
                    long var335 = var387 & 1L;
                    long var638;
                    int var336 = (var638 = var335 - 0L) == 0L ? 0 : (var638 < 0L ? -1 : 1);
                    if (var336 != 0) {
                        break label432;
                    }

                    var1.save();
                    var1.alpha(var299);
                    float var300 = super.U;
                    float var301 = var300 - 2.0F;
                    var10 = this.y;
                    var10 += 15.0F;
                    var11 = this.pP;
                    var11 += 4.0F;
                    float var388 = this.v();
                    float var389 = var388 - 15.0F;
                    var1.clip(var301, var10, var11, var389, 0.0F);
                    float var302 = this.y;
                    float var303 = var302 + 15.0F;
                    float var304 = var303 + 3.0F;
                    long var339 = var5;
                    long var390 = var339 + 1L;
                    long var391 = var339 * var390;
                    long var14 = var339 + 2L;
                    long var392 = var391 * var14;
                    long var340 = var339 + 3L;
                    long var393 = var392 * var340;
                    long var341 = var393 & 7L;
                    long var639;
                    int var342 = (var639 = var341 - 0L) == 0L ? 0 : (var639 < 0L ? -1 : 1);
                    if (var342 != 0) {
                        var4 += 823585156;
                        var4 += -2012414559;
                        var4 *= -1868206115;
                        var4 ^= -1712574111;
                        var4 ^= -888538043;
                    } else {
                        var4 <<= 16;
                        var4 ^= -692899457;
                        long var343 = var4;
                        long var394 = var343 + 1L;
                        long var395 = var343 * var394;
                        var14 = var343 + 2L;
                        long var396 = var395 * var14;
                        long var344 = var343 + 3L;
                        long var397 = var396 * var344;
                        long var345 = var397 & 7L;
                        long var640;
                        int var346 = (var640 = var345 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
                        if (var346 != 0) {
                            break label432;
                        }

                        var10 = var304 + 12.0F;
                        var10 += 3.0F;
                        var11 = var10 + 12.0F;
                        var11 += 3.0F;
                        var11 = var11;
                        float var398 = this.pP;
                        float var399 = var398 / 3.0F;
                        float var411 = super.U;
                        qr var455 = this.U;
                        qr var15 = qr.MAIN;
                        boolean var459;
                        if (var455 == var15) {
                            var4 = switch (var4) {
                                case -1196134484 -> var4 ^ 168667393;
                                default -> var4 ^ -1545644820;
                                case 1034170751 -> {
                                    var4 -= -1868876502;
                                    var4 -= 1958552732;
                                    yield var4 ^ 1770335130;
                                }
                            };
                            int var456 = var4 + 1;
                            int var457 = var4 * var456;
                            int var458 = var457 & 1;
                            if (var458 != 0) {
                                break label432;
                            }

                            var459 = true;
                            var4 *= 2135764159;
                            var4 ^= 1396947072;
                        } else {
                            var4 |= 799458545;
                            var4 += -324243391;
                            var4 &= -1880964242;
                            var4 ^= -1274120572;
                            var4 ^= 1518855213;
                            int var519 = var4 + 1;
                            int var520 = var4 * var519;
                            int var16 = var4 + 2;
                            int var521 = var520 * var16;
                            var16 = var4 + 3;
                            int var522 = var521 * var16;
                            int var523 = var522 & 7;
                            if (var523 != 0) {
                                break label432;
                            }

                            var459 = false;
                            switch (var4) {
                                case -813269091:
                                    var4 ^= 1158973138;
                                    break;
                                case -489959191:
                                    var4 *= -594635305;
                                    var4 ^= -1274377678;
                                    break;
                                case 333892768:
                                default:
                                    var4 ^= 976938379;
                            }
                        }

                        int var524 = var4 & -1684173153;
                        int var525 = var524 * -1956859665;
                        int var526 = var525 * 214437507;
                        int var527 = var526 ^ 1708148792;
                        this.H(var1, var2, var411, var304, var399, "Paint", var459, var272, var3, var527);
                        float var412 = super.U;
                        float var413 = var412 + var399;
                        Integer var460 = var5;
                        if (var460 != null) {
                            var4 -= 560134609;
                            var4 -= 1101756000;
                            var4 |= -1271741504;
                            var4 ^= -244169982;
                            var4 ^= 2039723700;
                            int var461 = var4 + 1;
                            int var462 = var4 * var461;
                            int var463 = var462 & 1;
                            if (var463 != 0) {
                                break label432;
                            }

                            qr var464 = this.U;
                            var15 = qr.ACCENT;
                            boolean var466;
                            if (var464 == var15) {
                                var4 ^= 917070404;
                                var4 ^= -67287058;
                                Integer var465 = var4;
                                if (var465 == null) {
                                    break label432;
                                }

                                var466 = true;
                                var4 *= -1877236283;
                                var4 -= 12622693;
                                var4 &= -1814921512;
                                var4 &= -2126482799;
                                var4 ^= 1674495830;
                            } else {
                                var4 -= -724726181;
                                var4 |= 543661599;
                                var4 *= -648817581;
                                var4 ^= 1099043052;
                                int var529 = var4 + 1;
                                int var530 = var4 * var529;
                                int var531 = var530 & 1;
                                if (var531 != 0) {
                                    break label432;
                                }

                                var466 = false;
                                var4 >>= 9;
                                var4 ^= 1675532507;
                            }

                            long var532 = var4;
                            long var17 = var532 + 1L;
                            var17 = var532 * var17;
                            long var533 = var17 & 1L;
                            long var641;
                            int var534 = (var641 = var533 - 0L) == 0L ? 0 : (var641 < 0L ? -1 : 1);
                            if (var534 != 0) {
                                break label432;
                            }

                            int var535 = var4 ^ 1012508366;
                            int var536 = var535 | -119450107;
                            int var537 = var536 + 1855904093;
                            int var538 = var537 ^ 1714824699;
                            this.H(var1, var2, var413, var304, var399, "Accent", var466, var285, var3, var538);
                            float var414 = super.U;
                            float var467 = var399 * 2.0F;
                            float var415 = var414 + var467;
                            qr var468 = this.U;
                            Integer var539 = var5;
                            if (var539 == null) {
                                var4 >>>= 29;
                                var4 *= 2131986623;
                                var4 ^= -1852582187;
                            } else {
                                var4 >>= 24;
                                var4 += -1702311364;
                                var4 += 2066241541;
                                var4 ^= -925671681;
                                var15 = qr.ERASE;
                                boolean var473;
                                if (var468 == var15) {
                                    var4 ^= -1999135469;
                                    var4 *= -86583197;
                                    var4 += -2079070716;
                                    var4 ^= -46639648;
                                    var14 = var4;
                                    long var581 = var14 + 1L;
                                    var581 = var14 * var581;
                                    long var18 = var14 + 2L;
                                    var581 *= var18;
                                    var14 += 3L;
                                    var581 *= var14;
                                    var14 = var581 & 7L;
                                    long var642;
                                    int var472 = (var642 = var14 - 0L) == 0L ? 0 : (var642 < 0L ? -1 : 1);
                                    if (var472 != 0) {
                                        break label432;
                                    }

                                    var473 = true;
                                    var4 |= 272141715;
                                    var4 ^= -899994860;
                                } else {
                                    var4 *= -217045853;
                                    var4 += 2080515321;
                                    var4 ^= -1152158480;
                                    var473 = false;
                                    var4 ^= 2012174820;
                                    var4 ^= 1270711637;
                                }

                                int var541 = var4 | -109459194;
                                int var542 = var541 >> 29;
                                int var543 = var542 ^ -144708866;
                                this.H(var1, var2, var415, var304, var399, "Erase", var473, 0, var3, var543);
                                var9 = this.S;
                                long var416 = var5;
                                long var544 = var416 + 1L;
                                long var545 = var416 * var544;
                                long var417 = var545 & 1L;
                                long var643;
                                int var418 = (var643 = var417 - 0L) == 0L ? 0 : (var643 < 0L ? -1 : 1);
                                if (var418 != 0) {
                                    var4 += -1436424741;
                                    var4 &= -627219856;
                                    var4 -= -198230374;
                                    var4 |= -141908826;
                                    var4 ^= 326543630;
                                } else {
                                    label427: {
                                        var4 = switch (var4) {
                                            case -1255042824 -> var4 ^ -220959127;
                                            default -> var4 ^ 2031634313;
                                            case -152717653 -> {
                                                var4 &= -1734681545;
                                                yield var4 ^ -1538885793;
                                            }
                                        };
                                        Integer var419 = var4;
                                        if (var419 == null) {
                                            break label432;
                                        }

                                        boolean var306 = var9.H();
                                        if (var306) {
                                            var4 >>= 1;
                                            var4 += -816092629;
                                            var4 ^= -222307262;
                                            long var420 = var4;
                                            long var546 = var420 + 1L;
                                            long var547 = var420 * var546;
                                            var17 = var420 + 2L;
                                            long var548 = var547 * var17;
                                            long var421 = var420 + 3L;
                                            long var549 = var548 * var421;
                                            long var422 = var549 & 7L;
                                            long var644;
                                            int var307 = (var644 = var422 - 0L) == 0L ? 0 : (var644 < 0L ? -1 : 1);
                                            if (var307 != 0) {
                                                break label432;
                                            }

                                            float var308 = super.U;
                                            float var423 = var399 * 1.4F;
                                            String[] var474 = O;
                                            Be var550 = this.T;
                                            int var551 = var550.ordinal();
                                            String var475 = var474[var551];
                                            Be var552 = this.T;
                                            Be var585 = Be.NONE;
                                            Integer var614 = var5;
                                            if (var614 == null) {
                                                var4 >>>= 7;
                                                var4 += -1112295289;
                                                var4 ^= 1363211902;
                                                break label427;
                                            }

                                            var4 += 1162282440;
                                            var4 ^= -2004121153;
                                            Integer var615 = var4;
                                            if (var615 == null) {
                                                break label432;
                                            }

                                            boolean var556;
                                            if (var552 != var585) {
                                                var4 = switch (var4) {
                                                    case -389839668 -> {
                                                        var4 *= 111358215;
                                                        var4 ^= -1704011745;
                                                        var4 ^= -100665922;
                                                        var4 <<= 19;
                                                        yield var4 ^ 791281948;
                                                    }
                                                    case 712223934 -> var4 ^ 71038868;
                                                    default -> var4 ^ -554333250;
                                                };
                                                int var553 = var4 + 1;
                                                int var554 = var4 * var553;
                                                int var555 = var554 & 1;
                                                if (var555 != 0) {
                                                    break label432;
                                                }

                                                var556 = true;
                                                switch (var4) {
                                                    case -1073695926:
                                                        var4 ^= -788981213;
                                                        break;
                                                    case 780271900:
                                                        var4 += -1382988932;
                                                        var4 ^= 135633564;
                                                        break;
                                                    case 1228902088:
                                                    default:
                                                        var4 ^= 457397104;
                                                }
                                            } else {
                                                var4 += 1952632996;
                                                var4 ^= 722692578;
                                                var4 ^= -66771690;
                                                var556 = false;
                                                var4 |= -1155194867;
                                                var4 &= 2069452746;
                                                var4 ^= -283652212;
                                            }

                                            long var586 = var4;
                                            long var629 = var586 + 1L;
                                            var629 = var586 * var629;
                                            long var587 = var629 & 1L;
                                            long var645;
                                            int var588 = (var645 = var587 - 0L) == 0L ? 0 : (var645 < 0L ? -1 : 1);
                                            if (var588 != 0) {
                                                break label432;
                                            }

                                            int var589 = var4 & 883389425;
                                            int var590 = var589 - 1466231532;
                                            int var591 = var590 >> 24;
                                            int var592 = var591 - 233959689;
                                            int var593 = var592 ^ -89252942;
                                            this.H(var1, var2, var308, var10, var423, var475, var556, 0, var3, var593);
                                            float var309 = super.U;
                                            float var424 = var399 * 1.4F;
                                            int var476 = var5 + 1;
                                            int var477 = var5 * var476;
                                            int var478 = var477 & 1;
                                            if (var478 != 0) {
                                                var4 &= 2137977184;
                                                var4 *= -1915644239;
                                                var4 *= 1690630079;
                                                var4 |= 1961967561;
                                                var4 ^= 425620257;
                                                break label427;
                                            }

                                            var4 += -132806102;
                                            var4 ^= 1233540151;
                                            int var479 = var4 + 1;
                                            int var480 = var4 * var479;
                                            int var557 = var4 + 2;
                                            int var481 = var480 * var557;
                                            int var558 = var4 + 3;
                                            int var482 = var481 * var558;
                                            int var483 = var482 & 7;
                                            if (var483 != 0) {
                                                break label432;
                                            }

                                            float var310 = var309 + var424;
                                            float var425 = var399 * 0.8F;
                                            int var484 = var4 * 1379164123;
                                            int var485 = var484 >> 6;
                                            int var486 = var485 * 2079504407;
                                            int var487 = var486 * -1256797589;
                                            int var488 = var487 ^ 1311324764;
                                            this.H(var1, var2, var310, var10, var425, "Load", false, 0, var3, var488);
                                            float var311 = super.U;
                                            float var426 = var399 * 2.2F;
                                            float var312 = var311 + var426;
                                            float var427 = var399 * 0.8F;
                                            int var489 = var4 & -842581209;
                                            int var490 = var489 * -1323052515;
                                            int var491 = var490 | 342212638;
                                            int var492 = var491 * -1369826851;
                                            int var493 = var492 ^ 1471035074;
                                            this.H(var1, var2, var312, var10, var427, "Clear", false, 0, var3, var493);
                                            switch (var4) {
                                                case -2053489639:
                                                    var4 &= 594686689;
                                                    var4 -= -995603778;
                                                    var4 <<= 28;
                                                    var4 &= -2074721971;
                                                    var4 ^= -124305166;
                                                    break;
                                                case -1257468930:
                                                default:
                                                    var4 ^= 1547079579;
                                                    break;
                                                case -1010712688:
                                                    var4 ^= 781666928;
                                            }
                                        } else {
                                            var4 *= -1785818087;
                                            var4 += -1785658340;
                                            var4 ^= -1150957974;
                                            Integer var313 = var4;
                                            if (var313 == null) {
                                                break label432;
                                            }

                                            float var314 = super.U;
                                            float var428 = var399 * 2.0F;
                                            String[] var494 = O;
                                            Be var559 = this.T;
                                            int var560 = var559.ordinal();
                                            String var495 = var494[var560];
                                            Be var561 = this.T;
                                            Be var594 = Be.NONE;
                                            int var616 = var5 + 1;
                                            int var617 = var5 * var616;
                                            int var631 = var5 + 2;
                                            int var618 = var617 * var631;
                                            var631 = var5 + 3;
                                            int var619 = var618 * var631;
                                            int var620 = var619 & 7;
                                            if (var620 != 0) {
                                                var4 *= 1025612829;
                                                var4 += 51639910;
                                                var4 -= 955696527;
                                                var4 ^= 750913481;
                                                break label427;
                                            }

                                            var4 |= 900003890;
                                            var4 ^= 1742032134;
                                            var4 ^= -515804739;
                                            boolean var565;
                                            if (var561 != var594) {
                                                var4 ^= -1748424470;
                                                var4 *= -2112557295;
                                                var4 ^= 1792403391;
                                                int var562 = var4 + 1;
                                                int var563 = var4 * var562;
                                                int var564 = var563 & 1;
                                                if (var564 != 0) {
                                                    break label432;
                                                }

                                                var565 = true;
                                                var4 -= 1824543198;
                                                var4 |= 1996826535;
                                                var4 &= 833543535;
                                                var4 *= -1298090477;
                                                var4 ^= -1004627308;
                                            } else {
                                                var4 = switch (var4) {
                                                    default -> var4 ^ 1085123521;
                                                    case 501525929 -> var4 ^ -1792190370;
                                                    case 993640905 -> {
                                                        var4 -= 1746955519;
                                                        var4 += 1611079390;
                                                        yield var4 ^ 668034489;
                                                    }
                                                };
                                                var565 = false;
                                                var4 += 1865257597;
                                                var4 ^= -1594333593;
                                            }

                                            long var595 = var4;
                                            long var633 = var595 + 1L;
                                            long var634 = var595 * var633;
                                            long var596 = var634 & 1L;
                                            long var646;
                                            int var597 = (var646 = var596 - 0L) == 0L ? 0 : (var646 < 0L ? -1 : 1);
                                            if (var597 != 0) {
                                                break label432;
                                            }

                                            int var598 = var4 << 2;
                                            int var599 = var598 << 13;
                                            int var600 = var599 ^ 1876202753;
                                            this.H(var1, var2, var314, var10, var428, var495, var565, 0, var3, var600);
                                            float var315 = super.U;
                                            int var429 = var5 + 1;
                                            int var430 = var5 * var429;
                                            int var496 = var5 + 2;
                                            int var431 = var430 * var496;
                                            int var497 = var5 + 3;
                                            int var432 = var431 * var497;
                                            int var433 = var432 & 7;
                                            if (var433 != 0) {
                                                switch (var4) {
                                                    case -1408836551:
                                                        var4 ^= -229565528;
                                                        break label427;
                                                    case 619106025:
                                                        var4 -= -1194426464;
                                                        var4 |= -857717541;
                                                        var4 -= 1219082343;
                                                        var4 ^= 1223154588;
                                                        break label427;
                                                    case 1410203473:
                                                    default:
                                                        var4 ^= 1729343705;
                                                        break label427;
                                                }
                                            }
                                            var4 = switch (var4) {
                                                case -2132301938 -> var4 ^ -420461607;
                                                default -> var4 ^ -239489328;
                                                case 619106025 -> {
                                                    var4 >>>= 7;
                                                    var4 ^= 891568536;
                                                    var4 >>= 16;
                                                    yield var4 ^ -142461487;
                                                }
                                            };
                                            float var434 = var399 * 2.0F;
                                            float var316 = var315 + var434;
                                            int var435 = var4 + 1799171348;
                                            int var436 = var435 & -1990310953;
                                            int var437 = var436 | -1066203882;
                                            int var438 = var437 | 230959284;
                                            int var439 = var438 ^ -983615241;
                                            this.H(var1, var2, var316, var10, var399, "Clear", false, 0, var3, var439);
                                            var4 *= -740460383;
                                            var4 *= 654332161;
                                            var4 ^= 813224654;
                                        }

                                        int var317 = var4 >>> 11;
                                        int var318 = var317 + -1612875989;
                                        int var319 = var318 ^ 1491536767;
                                        float var320 = this.l(var319);
                                        Integer var349 = var5;
                                        label368:
                                        if (var349 != null) {
                                            var4 &= -59458305;
                                            var4 ^= 474050671;
                                            int var350 = var4 + 1;
                                            int var351 = var4 * var350;
                                            var380 = var4 + 2;
                                            int var352 = var351 * var380;
                                            var380 = var4 + 3;
                                            int var353 = var352 * var380;
                                            int var354 = var353 & 7;
                                            if (var354 != 0) {
                                                break label432;
                                            }

                                            float var321 = var320;
                                            var10 = var320 / 17.0F;
                                            var10 = var10;
                                            float var402 = super.U;
                                            int var440 = DP.nq(1426063360, var3);
                                            var1.roundRect(var402, var11, var320, var320, 5.0F, var440);
                                            int var403 = 1;
                                            var403 = var403;

                                            var4 = switch (var4) {
                                                case -1643484348 -> var4 ^ -167449456;
                                                case -464162659 -> {
                                                    var4 ^= -937006968;
                                                    var4 -= -1250867288;
                                                    yield var4 ^ 1916494648;
                                                }
                                                default -> var4 ^ -146896067;
                                            };

                                            while (var403 < 17) {
                                                var4 -= 1296405670;
                                                var4 -= 276268419;
                                                var4 &= 718650183;
                                                var4 ^= 1090171108;
                                                long var441 = var4;
                                                long var566 = var441 + 1L;
                                                long var567 = var441 * var566;
                                                long var442 = var567 & 1L;
                                                long var647;
                                                int var443 = (var647 = var442 - 0L) == 0L ? 0 : (var647 < 0L ? -1 : 1);
                                                if (var443 != 0) {
                                                    break label432;
                                                }

                                                label362: {
                                                    if (var403 != 8) {
                                                        var4 <<= 15;
                                                        var4 -= -1811963153;
                                                        var4 += -1532245314;
                                                        var4 ^= 1332128531;
                                                        if (var403 != 9) {
                                                            var4 -= 1177119671;
                                                            var4 *= -874603463;
                                                            var4 ^= -914409978;
                                                            var4 ^= -54022395;
                                                            long var444 = var4;
                                                            long var568 = var444 + 1L;
                                                            long var569 = var444 * var568;
                                                            var17 = var444 + 2L;
                                                            long var570 = var569 * var17;
                                                            long var445 = var444 + 3L;
                                                            long var571 = var570 * var445;
                                                            long var446 = var571 & 7L;
                                                            long var648;
                                                            int var447 = (var648 = var446 - 0L) == 0L ? 0 : (var648 < 0L ? -1 : 1);
                                                            if (var447 != 0) {
                                                                break label432;
                                                            }

                                                            var448 = false;
                                                            var4 |= -1587680143;
                                                            var4 -= 39808211;
                                                            var4 &= 1022079433;
                                                            var4 ^= -401121595;
                                                            break label362;
                                                        }

                                                        var4 |= 476444106;
                                                        var4 ^= -1048400107;
                                                    } else {
                                                        var4 &= -1769949984;
                                                        var4 ^= 1040020011;
                                                    }

                                                    var448 = true;
                                                    var4 -= -1396623878;
                                                    var4 |= -507730995;
                                                    var4 &= 1137831613;
                                                    var4 ^= -1953664560;
                                                }

                                                var14 = var4;
                                                long var601 = var14 + 1L;
                                                var601 = var14 * var601;
                                                var14 = var601 & 1L;
                                                long var649;
                                                int var500 = (var649 = var14 - 0L) == 0L ? 0 : (var649 < 0L ? -1 : 1);
                                                if (var500 != 0) {
                                                    break label432;
                                                }

                                                Integer var501 = var5;
                                                if (var501 == null) {
                                                    var4 *= 804154839;
                                                    var4 *= 60603899;
                                                    var4 -= -879016992;
                                                    var4 ^= 1520124961;
                                                    break label368;
                                                }

                                                var4 ^= 1249326634;
                                                var4 += 1657477531;
                                                var4 >>= 2;
                                                var4 *= 1777890267;
                                                var4 ^= 822962939;
                                                int var502 = var4 + 1;
                                                int var503 = var4 * var502;
                                                int var572 = var4 + 2;
                                                int var504 = var503 * var572;
                                                int var573 = var4 + 3;
                                                int var505 = var504 * var573;
                                                int var506 = var505 & 7;
                                                if (var506 != 0) {
                                                    break label432;
                                                }

                                                int var507;
                                                if (var448) {
                                                    var4 ^= 1738719803;
                                                    var4 ^= 88305426;
                                                    var507 = 822083583;
                                                    switch (var4) {
                                                        case -1009802350:
                                                            var4 *= 290199549;
                                                            var4 ^= 1383947076;
                                                            var4 += -942320497;
                                                            var4 ^= -2095116533;
                                                            break;
                                                        case 89707991:
                                                            var4 ^= -2141146086;
                                                            break;
                                                        case 291028103:
                                                        default:
                                                            var4 ^= -263023987;
                                                    }
                                                } else {
                                                    var4 = switch (var4) {
                                                        default -> var4 ^ -1482685670;
                                                        case -1590817093 -> {
                                                            var4 |= 2077131329;
                                                            var4 -= -359590733;
                                                            yield var4 ^ 482037132;
                                                        }
                                                        case 1545728508 -> var4 ^ 1607822465;
                                                    };
                                                    Integer var574 = var4;
                                                    if (var574 == null) {
                                                        break label432;
                                                    }

                                                    var507 = 318767103;
                                                    var4 &= -2117906705;
                                                    var4 -= 28243113;
                                                    var4 *= -197619155;
                                                    var4 *= 1979944961;
                                                    var4 ^= 91879721;
                                                }

                                                int var508 = DP.nq(var507, var3);
                                                float var575 = super.U;
                                                float var603 = var403;
                                                float var604 = var603 * var10;
                                                int var622 = var5 + 1;
                                                int var623 = var5 * var622;
                                                int var635 = var5 + 2;
                                                int var624 = var623 * var635;
                                                var635 = var5 + 3;
                                                int var625 = var624 * var635;
                                                int var626 = var625 & 7;
                                                if (var626 != 0) {
                                                    var4 <<= 20;
                                                    var4 *= -1521396215;
                                                    var4 ^= -1103437519;
                                                    var4 |= 74581233;
                                                    var4 ^= -1294751463;
                                                    break label368;
                                                }

                                                var4 += -71833680;
                                                var4 *= 62447925;
                                                var4 -= 596638990;
                                                var4 *= 674327233;
                                                var4 ^= -738279488;
                                                float var576 = var575 + var604;
                                                float var577 = var576 - 0.25F;
                                                float var605 = var11 + 1.0F;
                                                float var627 = var321 - 2.0F;
                                                var1.rect(var577, var605, 0.5F, var627, var508);
                                                float var578 = super.U;
                                                var578++;
                                                float var606 = var403;
                                                float var607 = var606 * var10;
                                                float var608 = var11 + var607;
                                                float var609 = var608 - 0.25F;
                                                float var628 = var321 - 2.0F;
                                                var1.rect(var578, var609, var628, 0.5F, var508);
                                                int var509 = var403 + 1;
                                                var403 = var509;
                                                var4 ^= -1247129783;
                                                var4 |= 1027340094;
                                                var4 ^= 1039051986;
                                                var4 ^= -2014582664;
                                            }

                                            var4 -= 709968210;
                                            var4 *= 620733889;
                                            var4 += -926719217;
                                            var4 &= -1230952760;
                                            var4 ^= 2075191915;
                                            int var322 = var4 + 1;
                                            int var323 = var4 * var322;
                                            var403 = var4 + 2;
                                            int var324 = var323 * var403;
                                            var403 = var4 + 3;
                                            int var325 = var324 * var403;
                                            int var326 = var325 & 7;
                                            if (var326 != 0) {
                                                break label432;
                                            }

                                            float var327 = super.U;
                                            float var407 = var10 * 0.08F;
                                            float var408 = Math.min(0.6F, var407);
                                            Integer var510 = var5;
                                            if (var510 == null) {
                                                switch (var4) {
                                                    case -583170794:
                                                    default:
                                                        var4 ^= 840362220;
                                                        break;
                                                    case 1933209749:
                                                        var4 ^= -1825137414;
                                                        break;
                                                    case 2106715179:
                                                        var4 += 1819142138;
                                                        var4 <<= 29;
                                                        var4 |= -1823424497;
                                                        var4 ^= 1610190055;
                                                }
                                            } else {
                                                var4 *= 889005915;
                                                var4 |= 1795078795;
                                                var4 |= -1119460189;
                                                var4 ^= -1769098984;
                                                var14 = var4;
                                                long var610 = var14 + 1L;
                                                var610 = var14 * var610;
                                                var14 = var610 & 1L;
                                                long var650;
                                                int var513 = (var650 = var14 - 0L) == 0L ? 0 : (var650 < 0L ? -1 : 1);
                                                if (var513 != 0) {
                                                    break label432;
                                                }

                                                int var514 = var4 | -1874010926;
                                                int var515 = var514 - 738706477;
                                                int var516 = var515 & 967387439;
                                                int var517 = var516 << 22;
                                                int var518 = var517 ^ 1787375319;
                                                eC(var1, var266, var327, var11, var10, var272, var285, var3, var408, var518);
                                                float var267 = var2.oO;
                                                int var273 = var4 * 353588647;
                                                int var274 = var273 | -1290597129;
                                                int var275 = var274 * 1634201031;
                                                int var276 = var275 + -210709339;
                                                int var277 = var276 ^ -1914593276;
                                                int var268 = this.a(var267, var277);
                                                float var278 = var2.RD;
                                                int var286 = var4 * -1521395537;
                                                int var287 = var286 & 453508663;
                                                int var288 = var287 ^ -203239244;
                                                int var279 = this.BG(var278, var288);
                                                if (var268 < 0) {
                                                    var4 -= 2025050316;
                                                    var4 -= -1213808518;
                                                    var4 &= 738941312;
                                                    var4 ^= -1584316498;
                                                    break label394;
                                                }

                                                var4 ^= 1396092650;
                                                var4 |= -55082790;
                                                var4 ^= 1325693950;
                                                if (var279 < 0) {
                                                    var4 |= 2028173378;
                                                    var4 ^= 1886051657;
                                                    break label394;
                                                }

                                                var4 &= -1133317026;
                                                var4 *= 709326997;
                                                var4 |= -877776536;
                                                var4 ^= 236576199;
                                                Integer var280 = var4;
                                                if (var280 == null) {
                                                    break label432;
                                                }

                                                float var281 = super.U;
                                                float var269 = var268;
                                                float var270 = var269 * var10;
                                                float var271 = var281 + var270;
                                                float var282 = var279;
                                                float var283 = var282 * var10;
                                                float var284 = var11 + var283;
                                                int var289 = DP.nq(-1325400065, var3);
                                                Paint var290 = Paint.solid(var289);
                                                long var370 = var5;
                                                long var450 = var370 + 1L;
                                                long var451 = var370 * var450;
                                                long var371 = var451 & 1L;
                                                long var651;
                                                var5 = (var651 = var371 - 0L) == 0L ? 0 : (var651 < 0L ? -1 : 1);
                                                if (var5 == 0) {
                                                    var4 -= -565039609;
                                                    var4 |= 182321438;
                                                    var4 |= -1589162066;
                                                    var4 *= -177157425;
                                                    var4 ^= -1372006464;
                                                    long var372 = var4;
                                                    long var452 = var372 + 1L;
                                                    long var453 = var372 * var452;
                                                    long var373 = var453 & 1L;
                                                    long var652;
                                                    var5 = (var652 = var373 - 0L) == 0L ? 0 : (var652 < 0L ? -1 : 1);
                                                    if (var5 != 0) {
                                                        break label432;
                                                    }

                                                    Paint var265 = var290.stroke(0.8F);
                                                    var1.roundRect(var271, var284, var10, var10, 1.2F, var265);
                                                    var4 |= 309650836;
                                                    var4 ^= 2015901200;
                                                    var4 &= 1463640022;
                                                    var4 ^= -830184216;
                                                    break label394;
                                                }

                                                var4 += 1749780671;
                                                var4 *= 1782106857;
                                                var4 += -593684780;
                                                var4 ^= 815201448;
                                                var4 ^= 1789012126;
                                            }
                                        } else {
                                            var4 |= -1448398486;
                                            var4 &= 1750340702;
                                            var4 ^= -2038681730;
                                            var4 -= 829507865;
                                            var4 ^= 1348451043;
                                        }
                                    }
                                }
                            }
                        } else {
                            switch (var4) {
                                case -2096588131:
                                    var4 |= -689478178;
                                    var4 |= -1120438692;
                                    var4 |= 778798504;
                                    var4 ^= 324449047;
                                    break;
                                case -1335085113:
                                    var4 ^= -98558200;
                                    break;
                                case 1838174700:
                                default:
                                    var4 ^= 529152922;
                            }
                        }
                    }
                } else {
                    var4 += 744322792;
                    var4 += -2116237456;
                    var4 += 732169412;
                    var4 ^= -240517701;
                }

                Integer var260 = var4;
                if (var260 != null) {
                    IllegalArgumentException var262 = new IllegalArgumentException();
                    throw var262;
                }
                break label432;
            }

            var1.restore();
            return;
        }

        IllegalArgumentException var261 = new IllegalArgumentException();
        throw var261;
    }

    private static void eC(Canvas var0, du var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, int var9) {
        label170: {
            int var11 = var5;
            int var12 = System.identityHashCode(var0);
            int var13 = 0;
            int var14 = var12 + 1;
            var14 = var12 * var14;
            int var15 = var12 + 2;
            var14 *= var15;
            var15 = var12 + 3;
            var14 *= var15;
            var14 &= 7;
            if (var14 != 0) {
                switch (var9) {
                    case -1352586970:
                        int var119 = var9 ^ -1915821813;
                        break;
                    case 722022103:
                        int var117 = var9 - -476814533;
                        var117 ^= -1631519049;
                        break;
                    case 828321237:
                    default:
                        int var116 = var9 ^ -1273231080;
                }
            } else {
                int var10 = var9 ^ -1486583170;
                var10 |= -508034387;
                var10 ^= -80505354;
                var13 = var13;

                var10 = switch (var10) {
                    case -1449813099 -> var10 ^ -1735273996;
                    case 382612315 -> {
                        var10 &= -1037157785;
                        yield var10 ^ -987847691;
                    }
                    default -> var10 ^ 1922057211;
                };

                label157:
                while (true) {
                    if (var13 >= 17) {
                        switch (var10) {
                            case -955215434:
                                var10 >>= 23;
                                var10 &= 895114959;
                                var10 -= 1171897562;
                                var10 ^= -1845343424;
                                break;
                            case -206956253:
                            default:
                                var10 ^= -2112051803;
                                break;
                            case 430655213:
                                var10 ^= 1049394704;
                        }

                        long var126 = var11;
                        long var151 = var126 + 1L;
                        long var152 = var126 * var151;
                        long var127 = var152 & 1L;
                        long var216;
                        var12 = (var216 = var127 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                        if (var12 == 0) {
                            return;
                        }
                        break label170;
                    }

                    var10 -= 1920825525;
                    var10 |= 1010445615;
                    var10 ^= -1903241106;
                    var14 = var11 + 1;
                    var14 = var11 * var14;
                    var15 = var11 + 2;
                    var14 *= var15;
                    var15 = var11 + 3;
                    var14 *= var15;
                    var14 &= 7;
                    if (var14 != 0) {
                        break label170;
                    }

                    int var143 = 0;
                    var15 = var12 + 1;
                    var15 = var12 * var15;
                    int var16 = var12 + 2;
                    var15 *= var16;
                    var16 = var12 + 3;
                    var15 *= var16;
                    var15 &= 7;
                    if (var15 != 0) {
                        var10 |= 1304680057;
                        var10 &= -940638090;
                        var10 &= -1125112540;
                        var10 ^= 1565799691;
                        break;
                    }

                    var10 *= 1540491753;
                    var10 *= -194672607;
                    var10 |= -1365357277;
                    var10 -= 1855296284;
                    var10 ^= -720420080;
                    var143 = var143;
                    var10 &= -2084979181;
                    var10 >>>= 12;
                    var10 -= -415278333;
                    var10 ^= 2101580683;

                    while (true) {
                        var15 = var11 + 1;
                        var15 = var11 * var15;
                        var15 &= 1;
                        if (var15 != 0) {
                            break label170;
                        }

                        if (var143 >= 17) {
                            var10 ^= -173589312;
                            var10 |= -861579121;
                            var10 >>= 7;
                            var10 ^= 289839748;
                            var143 = var11 + 1;
                            var143 = var11 * var143;
                            var15 = var11 + 2;
                            var143 *= var15;
                            var15 = var11 + 3;
                            var143 *= var15;
                            var143 &= 7;
                            if (var143 != 0) {
                                break label170;
                            }

                            var143 = var13 + 1;
                            var15 = var12 + 1;
                            var15 = var12 * var15;
                            var16 = var12 + 2;
                            var15 *= var16;
                            var16 = var12 + 3;
                            var15 *= var16;
                            var15 &= 7;
                            if (var15 != 0) {
                                var10 *= 923803681;
                                var10 ^= -1967406214;
                                break label157;
                            }

                            var10 <<= 22;
                            var10 &= -698500705;
                            var10 |= -800272375;
                            var10 ^= -937588104;
                            Integer var176 = var11;
                            if (var176 == null) {
                                break label170;
                            }

                            var13 = var143;
                            var10 *= -1492317231;
                            var10 -= 1886107338;
                            var10 ^= -1131516991;
                            break;
                        }
                        var10 = switch (var10) {
                            default -> var10 ^ -1072629285;
                            case 1703097990 -> {
                                var10 |= -924942544;
                                var10 += -2002042562;
                                yield var10 ^ 526652017;
                            }
                            case 2145540289 -> var10 ^ 1677503592;
                        };
                        int var165 = var1.q(var143, var13);
                        long var178 = var12;
                        long var18 = var178 + 1L;
                        var18 = var178 * var18;
                        long var179 = var18 & 1L;
                        long var213;
                        var16 = (var213 = var179 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var16 != 0) {
                            var10 *= -1738523547;
                            var10 *= 1706356809;
                            var10 ^= 391260586;
                            break label157;
                        }

                        var10 |= 622205930;
                        var10 &= 110566663;
                        var10 ^= -836732542;
                        var16 = var11 + 1;
                        var16 = var11 * var16;
                        var16 &= 1;
                        if (var16 != 0) {
                            break label170;
                        }

                        if (var165 == 0) {
                            var10 *= 1084474443;
                            var10 ^= -1467182072;
                            var10 ^= -1804602846;
                            var10 >>>= 24;
                            var10 |= -2000231500;
                            var10 ^= -963322428;
                        } else {
                            var10 = switch (var10) {
                                case -1440114279 -> var10 ^ 491511470;
                                case -894017403 -> {
                                    var10 &= 896733115;
                                    var10 ^= 384441769;
                                    var10 >>>= 10;
                                    var10 ^= -1620477674;
                                    yield var10 ^ 1128780191;
                                }
                                default -> var10 ^ 254332744;
                            };
                            if (var165 == 2) {
                                var10 |= -934900830;
                                var10 += 1591359810;
                                var10 |= 761548712;
                                var10 ^= -1985004296;
                                var165 = var6;
                                switch (var10) {
                                    case -1228741888:
                                        var10 *= -1744538681;
                                        var10 >>>= 24;
                                        var10 += 743165629;
                                        var10 ^= 322904898;
                                        break;
                                    case 1340966931:
                                        var10 ^= 1252406640;
                                        break;
                                    case 1862103957:
                                    default:
                                        var10 ^= 1050910794;
                                }
                            } else {
                                var10 ^= -617805816;
                                var10 *= -38046513;
                                var10 &= -1335613501;
                                var10 ^= -27451444;
                                var165 = var5;
                                var10 *= -1535103645;
                                var10 ^= -1196182356;
                                var10 ^= -672370974;
                            }

                            Integer var184 = var11;
                            if (var184 == null) {
                                break label170;
                            }

                            var165 = DP.nq(var165, var7);
                            int var185 = var12 + 1;
                            var185 = var12 * var185;
                            var185 &= 1;
                            if (var185 != 0) {
                                switch (var10) {
                                    case 331197494:
                                    default:
                                        var10 ^= 111695702;
                                        break label157;
                                    case 1064627620:
                                        var10 |= 1094232531;
                                        var10 &= -1392138057;
                                        var10 &= -1865457940;
                                        var10 ^= -1831978992;
                                        var10 ^= 1266550175;
                                        break label157;
                                    case 1089554652:
                                        var10 ^= -70311690;
                                        break label157;
                                }
                            }

                            var10 &= 1787842390;
                            var10 >>>= 7;
                            var10 -= 1983683549;
                            var10 ^= 2034326319;
                            long var188 = var11;
                            var18 = var188 + 1L;
                            var18 = var188 * var18;
                            long var20 = var188 + 2L;
                            var18 *= var20;
                            long var189 = var188 + 3L;
                            var18 *= var189;
                            long var190 = var18 & 7L;
                            long var214;
                            var185 = (var214 = var190 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                            if (var185 != 0) {
                                break label170;
                            }

                            float var192 = var143;
                            float var193 = var192 * var4;
                            float var194 = var2 + var193;
                            float var195 = var194 + var8;
                            float var17 = var13;
                            var17 *= var4;
                            var17 = var3 + var17;
                            var17 += var8;
                            float var210 = var8 * 2.0F;
                            float var211 = var4 - var210;
                            float var19 = var8 * 2.0F;
                            var19 = var4 - var19;
                            var0.roundRect(var195, var17, var211, var19, var8, var165);
                            switch (var10) {
                                case -1027819889:
                                default:
                                    var10 ^= 1366400827;
                                    break;
                                case -588036041:
                                    var10 ^= 1289452180;
                                    break;
                                case -212410478:
                                    var10 -= 640141194;
                                    var10 ^= -1715640675;
                                    var10 += -1134488698;
                                    var10 ^= 1587653737;
                            }
                        }

                        var165 = var143 + 1;
                        var16 = var12 + 1;
                        var16 = var12 * var16;
                        var16 &= 1;
                        if (var16 != 0) {
                            var10 -= -1148370611;
                            var10 *= 678884109;
                            var10 &= -243126355;
                            var10 ^= 951327882;
                            break label157;
                        }

                        var10 *= -1113786897;
                        var10 *= 1045124229;
                        var10 ^= -357281219;
                        Integer var199 = var11;
                        if (var199 == null) {
                            break label170;
                        }

                        var143 = var165;
                        var10 += 1971542065;
                        var10 ^= 87180234;
                    }
                }
            }

            long var120 = var11;
            long var129 = var120 + 1L;
            long var130 = var120 * var129;
            long var153 = var120 + 2L;
            long var131 = var130 * var153;
            var120 += 3L;
            long var132 = var131 * var120;
            var120 = var132 & 7L;
            long var215;
            int var123 = (var215 = var120 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
            if (var123 == 0) {
                RuntimeException var125 = new RuntimeException();
                throw var125;
            }
        }

        UnsupportedOperationException var124 = new UnsupportedOperationException();
        throw var124;
    }

    private void H(Canvas var1, jX var2, float var3, float var4, float var5, String var6, boolean var7, int var8, float var9, int var10) {
        label192: {
            int var13 = System.identityHashCode(this);
            float var14 = var3 + 1.0F;
            float var15 = var5 - 2.0F;
            boolean var167 = var2.hQ(var14, var4, var15, 12.0F);
            long var196 = var13;
            long var17 = var196 + 1L;
            var17 = var196 * var17;
            long var19 = var196 + 2L;
            var17 *= var19;
            long var197 = var196 + 3L;
            var17 *= var197;
            long var198 = var17 & 7L;
            long var280;
            int var199 = (var280 = var198 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
            if (var199 != 0) {
                int var11 = var10 ^ 609479406;
                var11 <<= 15;
                var11 ^= -2055890045;
            } else {
                label194: {
                    int var26 = var10 << 27;
                    var26 ^= -520113048;
                    int var204;
                    if (var7) {
                        var26 <<= 14;
                        var26 |= -1559462322;
                        var26 ^= 377735710;
                        int var200 = var8 + 1;
                        int var201 = var8 * var200;
                        int var202 = var201 & 1;
                        if (var202 != 0) {
                            break label192;
                        }

                        int var203 = DP.U(-7684353, 52);
                        Integer var16 = var13;
                        if (var16 == null) {
                            var26 |= -1571273826;
                            var26 ^= 475084868;
                            var26 |= 994379291;
                            var26 <<= 16;
                            var26 ^= -1256645757;
                            break label194;
                        }

                        var26 ^= -1850029015;
                        var26 -= -25081328;
                        var26 *= 262526779;
                        var26 ^= -1144243045;
                        var204 = var203;
                        var26 |= -1699782678;
                        var26 >>>= 9;
                        var26 -= 1928376579;
                        var26 ^= -1815160029;
                    } else {
                        var26 = switch (var26) {
                            case -385895320 -> {
                                var26 *= -688088253;
                                var26 *= -71273699;
                                var26 |= -1155870495;
                                yield var26 ^ 827924624;
                            }
                            default -> var26 ^ -1497077773;
                            case 2108062492 -> var26 ^ 185944041;
                        };
                        if (var167) {
                            var26 = switch (var26) {
                                case -1966608023 -> {
                                    var26 <<= 25;
                                    var26 -= 1091944032;
                                    var26 ^= -1628457618;
                                    var26 *= 22263521;
                                    yield var26 ^ -565755259;
                                }
                                default -> var26 ^ 1574864033;
                                case 1377403247 -> var26 ^ -2058306944;
                            };
                            Integer var168 = var8;
                            if (var168 == null) {
                                break label192;
                            }

                            var204 = 650501887;
                            var26 *= 1379189555;
                            var26 += -1525361577;
                            var26 |= -917536712;
                            var26 ^= -974369801;
                        } else {
                            var26 &= -326218574;
                            var26 >>>= 11;
                            var26 >>>= 24;
                            var26 <<= 22;
                            var26 ^= -1906726371;
                            int var169 = var8 + 1;
                            int var170 = var8 * var169;
                            int var218 = var8 + 2;
                            int var171 = var170 * var218;
                            var218 = var8 + 3;
                            int var172 = var171 * var218;
                            int var173 = var172 & 7;
                            if (var173 != 0) {
                                break label192;
                            }

                            var204 = 314957567;
                            var26 ^= 787843788;
                            var26 >>= 30;
                            var26 -= 1194647945;
                            var26 ^= -1502024774;
                        }
                    }

                    int var174 = var8 + 1;
                    int var175 = var8 * var174;
                    int var176 = var175 & 1;
                    if (var176 != 0) {
                        break label192;
                    }

                    var15 = var3 + 1.0F;
                    float var220 = var5 - 2.0F;
                    int var178 = DP.nq(var204, var9);
                    var1.roundRect(var15, var4, var220, 12.0F, 4.0F, var178);
                    long var179 = var13;
                    long var221 = var179 + 1L;
                    long var222 = var179 * var221;
                    long var180 = var222 & 1L;
                    long var281;
                    int var181 = (var281 = var180 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                    label183:
                    if (var181 == 0) {
                        var26 -= 123142108;
                        var26 *= -548862161;
                        var26 ^= 2022321787;
                        long var182 = var8;
                        long var223 = var182 + 1L;
                        long var224 = var182 * var223;
                        long var183 = var224 & 1L;
                        long var282;
                        int var184 = (var282 = var183 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                        if (var184 != 0) {
                            break label192;
                        }

                        if (var7) {
                            var26 -= 672225000;
                            var26 ^= -2129566705;
                            var26 *= -2002100937;
                            var26 ^= -1367515179;
                            Integer var185 = var8;
                            if (var185 == null) {
                                break label192;
                            }

                            var14 = var3 + 1.4F;
                            var15 = var4 + 0.4F;
                            var220 = var5 - 2.8F;
                            float var239 = var9 * 0.8F;
                            Integer var18 = var13;
                            if (var18 == null) {
                                var26 >>>= 28;
                                var26 &= 307083327;
                                var26 += -958050454;
                                var26 *= -1247249849;
                                var26 ^= 2009724490;
                                break label183;
                            }
                            var26 = switch (var26) {
                                default -> var26 ^ 1193654294;
                                case 868775190 -> var26 ^ 1232567501;
                                case 1407993362 -> {
                                    var26 *= 1081924789;
                                    var26 >>>= 14;
                                    yield var26 ^ 530116427;
                                }
                            };
                            long var254 = var8;
                            long var20 = var254 + 1L;
                            var20 = var254 * var20;
                            long var22 = var254 + 2L;
                            var20 *= var22;
                            long var255 = var254 + 3L;
                            var20 *= var255;
                            long var256 = var20 & 7L;
                            long var283;
                            int var257 = (var283 = var256 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                            if (var257 != 0) {
                                break label192;
                            }

                            int var240 = DP.nq(-7684353, var239);
                            Paint var241 = Paint.solid(var240);
                            Paint var242 = var241.stroke(0.7F);
                            var1.roundRect(var14, var15, var220, 11.2F, 3.6F, var242);
                            var26 ^= 332316205;
                            var26 &= 1154132220;
                            var26 *= 491052913;
                            var26 ^= -351030159;
                        } else {
                            var26 &= -2099681439;
                            var26 ^= 1450434945;
                        }

                        int var187 = var8 + 1;
                        int var188 = var8 * var187;
                        int var189 = var188 & 1;
                        if (var189 != 0) {
                            break label192;
                        }

                        TextStyle var190 = G;
                        var14 = var1.measure(var6, var190);
                        var15 = var5 / 2.0F;
                        var15 = var3 + var15;
                        var14 /= 2.0F;
                        var14 = var15 - var14;
                        long var209 = var13;
                        var17 = var209 + 1L;
                        var17 = var209 * var17;
                        long var210 = var17 & 1L;
                        long var284;
                        int var211 = (var284 = var210 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                        label174:
                        if (var211 == 0) {
                            var26 = switch (var26) {
                                case -1012432335 -> var26 ^ -1488939923;
                                case -689273887 -> {
                                    var26 |= 303474113;
                                    yield var26 ^ -1408744665;
                                }
                                default -> var26 ^ -754937556;
                            };
                            int var212 = var8 + 1;
                            int var213 = var8 * var212;
                            int var214 = var213 & 1;
                            if (var214 != 0) {
                                break label192;
                            }

                            if (var8 != 0) {
                                var26 *= 1516386471;
                                var26 |= 2059512209;
                                var26 |= 1583160277;
                                var26 &= -1080875184;
                                var26 ^= 174489882;
                                Integer var215 = var8;
                                if (var215 == null) {
                                    break label192;
                                }

                                var15 = var14 + 3.5F;
                                var220 = var15 - 7.0F;
                                float var245 = var4 + 6.0F;
                                float var246 = var245 - 2.5F;
                                int var258 = DP.nq(var8, var9);
                                int var268 = var13 + 1;
                                int var269 = var13 * var268;
                                int var270 = var269 & 1;
                                if (var270 != 0) {
                                    switch (var26) {
                                        case 311517839:
                                        default:
                                            var26 ^= 1538778893;
                                            break label174;
                                        case 888514122:
                                            var26 &= -1104677897;
                                            var26 &= 1952162379;
                                            var26 ^= 1207353850;
                                            var26 |= -1649030909;
                                            var26 ^= -2055868360;
                                            break label174;
                                        case 1387072763:
                                            var26 ^= 1904497843;
                                            break label174;
                                    }
                                }
                                var26 = switch (var26) {
                                    default -> var26 ^ 130149501;
                                    case 888514122 -> {
                                        var26 |= 1241349288;
                                        var26 -= -1595804623;
                                        var26 &= -1243137372;
                                        var26 |= 1119101291;
                                        yield var26 ^ -281756700;
                                    }
                                    case 1878965534 -> var26 ^ 1903250067;
                                };
                                var1.roundRect(var220, var246, 5.0F, 5.0F, 1.2F, var258);
                                var15 = var15;
                                var26 &= -706518102;
                                var26 *= 890281157;
                                var26 += 617551972;
                                var26 ^= -463871267;
                            } else {
                                var26 ^= 595884070;
                                var26 |= -1947248742;
                                var26 *= 1776113657;
                                var26 &= -1103882126;
                                var26 ^= -452305842;
                                Integer var227 = var8;
                                if (var227 == null) {
                                    break label192;
                                }

                                var15 = var14;
                                var26 &= 449932988;
                                var26 |= -351299048;
                                var26 |= -71197586;
                                var26 <<= 1;
                                var26 ^= -99391945;
                            }

                            long var228 = var8;
                            long var259 = var228 + 1L;
                            var259 = var228 * var259;
                            long var229 = var259 & 1L;
                            long var285;
                            int var194 = (var285 = var229 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label192;
                            }

                            var14 = var4 + 2.2F;
                            Integer var230 = var13;
                            if (var230 != null) {
                                var26 <<= 9;
                                var26 += 1029104923;
                                var26 -= -32724661;
                                var26 += 1611465388;
                                var26 ^= -1856597145;
                                long var231 = var8;
                                var259 = var231 + 1L;
                                var259 = var231 * var259;
                                long var232 = var259 & 1L;
                                long var286;
                                int var233 = (var286 = var232 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                                if (var233 != 0) {
                                    break label192;
                                }

                                TextStyle var234 = G;
                                int var247;
                                if (var7) {
                                    var26 &= 2071203548;
                                    var26 &= -370974638;
                                    var26 ^= 1430731424;
                                    var247 = -854017;
                                    var26 += 2120292045;
                                    var26 += 2035988472;
                                    var26 += 1951956838;
                                    var26 -= -991848131;
                                    var26 ^= -220292097;
                                } else {
                                    var26 &= -1588242834;
                                    var26 ^= -472682570;
                                    var26 *= -718555703;
                                    var26 |= -1071044088;
                                    var26 ^= -810756864;
                                    int var263 = var8 + 1;
                                    int var264 = var8 * var263;
                                    int var271 = var8 + 2;
                                    int var265 = var264 * var271;
                                    int var272 = var8 + 3;
                                    int var266 = var265 * var272;
                                    int var267 = var266 & 7;
                                    if (var267 != 0) {
                                        break label192;
                                    }

                                    var247 = -4075035;
                                    switch (var26) {
                                        case -115036258:
                                            var26 ^= 1702696669;
                                            break;
                                        case 580218780:
                                            var26 ^= -581839113;
                                            var26 &= 883169153;
                                            var26 |= -325198070;
                                            var26 ^= -361059478;
                                            break;
                                        case 2123839662:
                                        default:
                                            var26 ^= -409697113;
                                    }
                                }

                                int var248 = DP.nq(var247, var9);
                                TextStyle var235 = var234.color(var248);
                                int var249 = var13 + 1;
                                int var250 = var13 * var249;
                                var13 = var250 & 1;
                                if (var13 == 0) {
                                    var26 += 1822130058;
                                    var26 ^= 478377755;
                                    var26 ^= 323974533;
                                    var17 = var8;
                                    var19 = var17 + 1L;
                                    var19 = var17 * var19;
                                    long var21 = var17 + 2L;
                                    var19 *= var21;
                                    var17 += 3L;
                                    var19 *= var17;
                                    var17 = var19 & 7L;
                                    long var287;
                                    var13 = (var287 = var17 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                                    if (var13 == 0) {
                                        float var165 = var1.text(var6, var15, var14, var235);
                                        return;
                                    }
                                    break label192;
                                }

                                switch (var26) {
                                    case -155304295:
                                    default:
                                        var26 ^= -159974569;
                                        break;
                                    case 384267361:
                                        var26 &= -1484936359;
                                        var26 |= -1803101665;
                                        var26 ^= 1886331114;
                                        var26 ^= -1677016778;
                                        break;
                                    case 2087284415:
                                        var26 ^= 426645067;
                                }
                            } else {
                                var26 -= -1924960210;
                                var26 += -782466801;
                                var26 ^= 726134831;
                            }
                        } else {
                            var26 -= -691083113;
                            var26 += 494717844;
                            var26 *= -1664634443;
                            var26 ^= -252697739;
                        }
                    } else {
                        var26 &= 52605796;
                        var26 >>>= 9;
                        var26 ^= 2055408347;
                    }
                }
            }

            int var156 = var8 + 1;
            var156 = var8 * var156;
            var13 = var8 + 2;
            var156 *= var13;
            int var12 = var8 + 3;
            var156 *= var12;
            var156 &= 7;
            if (var156 == 0) {
                IllegalStateException var161 = new IllegalStateException();
                throw var161;
            }
        }

        AssertionError var162 = new AssertionError();
        throw var162;
    }

    private float y(int var1) {
        int var3 = System.identityHashCode(this);
        float var4 = this.y;
        var4 += 15.0F;
        var4 += 3.0F;
        var4 += 12.0F;
        var4 += 3.0F;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            int var17 = var1 ^ -1381233503;
            var17 += 1418921609;
            var17 += -670117899;
            var17 |= -321074041;
            var17 ^= -1891516922;
            IllegalArgumentException var24 = new IllegalArgumentException();
            throw var24;
        } else {
            int var2 = var1 & -358151984;
            var2 -= -1450299371;
            var2 ^= -1614256125;
            long var11 = var2;
            long var32 = var11 + 1L;
            long var33 = var11 * var32;
            long var7 = var11 + 2L;
            long var34 = var33 * var7;
            long var12 = var11 + 3L;
            long var35 = var34 * var12;
            long var13 = var35 & 7L;
            long var36;
            var2 = (var36 = var13 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                float var16 = var4 + 12.0F;
                return var16 + 3.0F;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    private int a(float var1, int var2) {
        label72: {
            int var37;
            label64: {
                int var4 = System.identityHashCode(this);
                int var5 = var2 * 343648499;
                var5 |= -1620300055;
                var5 += 193761887;
                var5 ^= 744636450;
                float var69 = this.l(var5);
                float var70 = var69 / 17.0F;
                float var6 = super.U;
                var6 = var1 - var6;
                float var71 = var6 / var70;
                double var72 = var71;
                double var73 = Math.floor(var72);
                long var7 = var4;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                var7 = var9 & 1L;
                long var103;
                int var87 = (var103 = var7 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                if (var87 != 0) {
                    var37 = var2 ^ -1954573466;
                    var37 ^= -1921797640;
                    var37 -= -2111392016;
                    var37 -= 578466257;
                    var37 ^= 433739981;
                } else {
                    var37 = var2 ^ 1174267870;
                    var37 -= 2019272843;
                    var37 >>>= 2;
                    var37 ^= -1935702123;
                    var7 = var37;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var104;
                    int var91 = (var104 = var7 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                    if (var91 != 0) {
                        break label72;
                    }

                    var5 = (int)var73;
                    if (var5 < 0) {
                        switch (var37) {
                            case -1784726295:
                                var37 |= -82876024;
                                var37 -= -1328503028;
                                var37 ^= 796913770;
                                break label64;
                            case -1034096910:
                            default:
                                var37 ^= -1576322860;
                                break label64;
                            case 152893707:
                                var37 ^= 1465960658;
                                break label64;
                        }
                    }

                    var37 -= 1641021292;
                    var37 *= 1128820887;
                    var37 ^= 351737340;
                    var37 |= 765205606;
                    var37 ^= -113672051;
                    int var80 = var37 + 1;
                    int var81 = var37 * var80;
                    int var92 = var37 + 2;
                    int var82 = var81 * var92;
                    int var93 = var37 + 3;
                    int var83 = var82 * var93;
                    int var84 = var83 & 7;
                    if (var84 != 0) {
                        break label72;
                    }

                    if (var5 >= 17) {
                        var37 |= -1642476208;
                        var37 += -1889387432;
                        var37 >>= 10;
                        var37 &= -1488774636;
                        var37 ^= 1639065267;
                        break label64;
                    }

                    var37 |= -288898511;
                    var37 ^= 1906212054;
                    XF var85 = this.J;
                    int var94 = var4 + 1;
                    int var95 = var4 * var94;
                    int var8 = var4 + 2;
                    int var96 = var95 * var8;
                    var4 += 3;
                    int var97 = var96 * var4;
                    var4 = var97 & 7;
                    if (var4 == 0) {
                        var37 *= 1767841179;
                        var37 ^= -1832481255;
                        var37 -= -1762750040;
                        var37 ^= 823638412;
                        var37 ^= 798033228;
                        Integer var59 = var37;
                        if (var59 == null) {
                            break label72;
                        }

                        float var60 = var85.bs();
                        float var105;
                        int var61 = (var105 = var60 - 0.5F) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
                        if (var61 > 0) {
                            var37 += -2042489925;
                            var37 += 896958539;
                            var37 ^= -596396442;
                            var61 = var37 + 1;
                            var61 = var37 * var61;
                            var61 &= 1;
                            if (var61 != 0) {
                                break label72;
                            }

                            var37 &= -1945931309;
                            var37 -= -941907141;
                            var37 <<= 19;
                            var37 |= 1078454987;
                            var37 ^= 584025118;
                            return var5;
                        }

                        var37 ^= -341413710;
                        var37 >>>= 9;
                        var37 *= -312157627;
                        var37 ^= 1141108469;
                        break label64;
                    }

                    var37 -= 1620391228;
                    var37 ^= -871104697;
                }

                var5 = var37 + 1;
                var5 = var37 * var5;
                var5 &= 1;
                if (var5 == 0) {
                    IllegalStateException var78 = new IllegalStateException();
                    throw var78;
                }
                break label72;
            }

            byte var65 = -1;
            var37 += -1203808114;
            var37 >>= 23;
            var37 <<= 2;
            var37 ^= -793743847;
            return var65;
        }

        IllegalStateException var56 = new IllegalStateException();
        throw var56;
    }

    private int BG(float var1, int var2) {
        label66: {
            int var10;
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            label59:
            if (var5 == 0) {
                var10 = var2 | 564349109;
                var10 |= -1761537231;
                var10 ^= 1210071674;
                var5 = var10 & -430254527;
                var5 >>>= 18;
                var5 ^= -954488580;
                float var68 = this.l(var5);
                float var69 = var68 / 17.0F;
                int var6 = var10 ^ 2042809155;
                var6 -= 2049427421;
                var6 += 1363247026;
                var6 ^= -220355378;
                float var78 = this.y(var6);
                float var79 = var1 - var78;
                float var70 = var79 / var69;
                double var71 = var70;
                double var72 = Math.floor(var71);
                var5 = (int)var72;
                if (var5 >= 0) {
                    var10 -= -1124183544;
                    var10 *= 1835884929;
                    var10 += -1754719722;
                    var10 &= 1961079185;
                    var10 ^= -1694925438;
                    var6 = var10 + 1;
                    var6 = var10 * var6;
                    int var7 = var10 + 2;
                    var6 *= var7;
                    var7 = var10 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label66;
                    }

                    if (var5 < 17) {
                        var10 -= -479038691;
                        var10 &= -1645294088;
                        var10 |= -638277702;
                        var10 ^= -1416874905;
                        long var85 = var10;
                        long var8 = var85 + 1L;
                        var8 = var85 * var8;
                        long var86 = var8 & 1L;
                        long var91;
                        var6 = (var91 = var86 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label66;
                        }

                        XF var88 = this.J;
                        Integer var57 = var4;
                        if (var57 == null) {
                            var10 ^= 1095877532;
                            var10 ^= -1745651825;
                            var10 *= 1358665303;
                            var10 ^= -195701064;
                            break label59;
                        }
                        var10 = switch (var10) {
                            case 182031389 -> var10 ^ 262942739;
                            default -> var10 ^ 1310339212;
                            case 1920654237 -> {
                                var10 -= -571397163;
                                var10 *= -223824509;
                                var10 &= 776500967;
                                var10 ^= 1124254775;
                                yield var10 ^ 1865265397;
                            }
                        };
                        float var58 = var88.bs();
                        float var92;
                        int var59 = (var92 = var58 - 0.5F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                        if (var59 > 0) {
                            var10 -= -986656810;
                            var10 -= -389951290;
                            var10 |= -582075210;
                            var10 += -1907122991;
                            var10 ^= -583621656;
                            var10 *= -900758211;
                            var10 ^= 1714738673;
                            return var5;
                        }

                        var10 ^= -593424060;
                        var10 *= -2100909941;
                        var10 += 2110944560;
                        var10 += -1279060873;
                        var10 ^= -1880088213;
                    } else {
                        var10 >>= 15;
                        var10 -= 1828326783;
                        var10 += 1186751649;
                        var10 += 1883124347;
                        var10 ^= 922994124;
                    }
                } else {
                    var10 &= 738439260;
                    var10 -= -913171800;
                    var10 ^= -1432317013;
                    var10 ^= -1244523187;
                }

                Integer var74 = var10;
                if (var74 == null) {
                    break label66;
                }

                byte var60 = -1;
                var10 &= 1334431830;
                var10 -= 660793627;
                var10 *= -478684625;
                var10 ^= 3188971;
                return var60;
            } else {
                var10 = var2 * 83996805;
                var10 ^= -438095265;
            }

            var4 = var10 + 1;
            var4 = var10 * var4;
            var10 = var4 & 1;
            if (var10 == 0) {
                RuntimeException var44 = new RuntimeException();
                throw var44;
            }
        }

        UnsupportedOperationException var56 = new UnsupportedOperationException();
        throw var56;
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        int var504 = 0;
        label557: {
            label556: {
                label583: {
                    int var5 = LP;
                    var5 ^= 129569562;
                    int var7 = System.identityHashCode(this);
                    float var8 = this.y;
                    var8 += 15.0F;
                    Integer var9 = var7;
                    if (var9 != null) {
                        var5 += -1457284264;
                        var5 ^= 382114109;
                        var5 <<= 7;
                        var5 ^= -838658160;
                        float var628;
                        int var349 = (var628 = var3 - var8) == 0.0F ? 0 : (var628 < 0.0F ? -1 : 1);
                        if (var349 < 0) {
                            var5 = switch (var5) {
                                case -1957678383 -> var5 ^ 1504681737;
                                default -> var5 ^ -901133539;
                                case 1536754832 -> {
                                    var5 += 84808701;
                                    var5 &= -1716619265;
                                    yield var5 ^ 1734725762;
                                }
                            };
                            int var395 = var4 + 1;
                            int var396 = var4 * var395;
                            int var432 = var4 + 2;
                            int var397 = var396 * var432;
                            var432 = var4 + 3;
                            int var398 = var397 * var432;
                            int var399 = var398 & 7;
                            if (var399 != 0) {
                                break label557;
                            }

                            if (var4 != 0) {
                                var5 = switch (var5) {
                                    default -> var5 ^ 808055040;
                                    case 766384549 -> var5 ^ -1909152654;
                                    case 1740881935 -> {
                                        var5 >>= 22;
                                        var5 -= -517866702;
                                        var5 *= 1291447033;
                                        var5 >>= 25;
                                        yield var5 ^ 1104438362;
                                    }
                                };
                                long var400 = var4;
                                long var510 = var400 + 1L;
                                var510 = var400 * var510;
                                long var401 = var510 & 1L;
                                long var629;
                                int var402 = (var629 = var401 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
                                if (var402 != 0) {
                                    break label557;
                                }

                                if (var4 != 1) {
                                    var5 ^= 1731901890;
                                    var5 ^= -1637989652;
                                    return false;
                                }

                                switch (var5) {
                                    case -1104438381:
                                        var5 += -1127261783;
                                        var5 ^= -1668471379;
                                        break;
                                    case -918732963:
                                    default:
                                        var5 ^= 407617180;
                                        break;
                                    case 1151170356:
                                        var5 ^= -1711390547;
                                }
                            } else {
                                switch (var5) {
                                    case 1457736363:
                                        var5 ^= 1146340011;
                                        break;
                                    case 1740881935:
                                        var5 += -904201864;
                                        var5 &= -1063369632;
                                        var5 ^= -420884335;
                                        break;
                                    case 2122717290:
                                    default:
                                        var5 ^= -1323381630;
                                }
                            }

                            Integer var403 = var4;
                            if (var403 == null) {
                                break label557;
                            }

                            boolean var404 = this.tS;
                            var432 = var7 + 1;
                            var432 = var7 * var432;
                            int var512 = var7 + 2;
                            var432 *= var512;
                            var512 = var7 + 3;
                            var432 *= var512;
                            var432 &= 7;
                            if (var432 != 0) {
                                var5 *= 683542561;
                                var5 ^= 1433566973;
                            } else {
                                var5 = switch (var5) {
                                    default -> var5 ^ 2118324655;
                                    case -428426407 -> var5 ^ 2127702446;
                                    case -428355439 -> {
                                        var5 *= -2093993149;
                                        var5 += 1413856126;
                                        yield var5 ^ 1697892169;
                                    }
                                };
                                var432 = var4 + 1;
                                var432 = var4 * var432;
                                var512 = var4 + 2;
                                var432 *= var512;
                                var512 = var4 + 3;
                                var432 *= var512;
                                var432 &= 7;
                                if (var432 != 0) {
                                    break label557;
                                }

                                boolean var405;
                                if (!var404) {
                                    var5 |= -27125170;
                                    var5 <<= 30;
                                    var5 &= 257594471;
                                    var5 ^= -975423140;
                                    var405 = true;
                                    var5 ^= 1492438950;
                                    var5 &= -591241311;
                                    var5 ^= -1275896613;
                                } else {
                                    var5 += 840908883;
                                    var5 >>= 27;
                                    var5 -= -1731020412;
                                    var5 -= 702916262;
                                    var5 ^= -358705570;
                                    Integer var444 = var4;
                                    if (var444 == null) {
                                        break label557;
                                    }

                                    var405 = false;
                                    var5 *= -2064644467;
                                    var5 &= -1387456777;
                                    var5 ^= -1884153126;
                                }

                                var432 = var4 + 1;
                                var432 = var4 * var432;
                                var432 &= 1;
                                if (var432 != 0) {
                                    break label557;
                                }

                                this.tS = var405;
                                Integer var406 = var7;
                                if (var406 != null) {
                                    var5 *= 1434284905;
                                    var5 &= -1206993276;
                                    var5 -= -508949283;
                                    var5 &= -1832792856;
                                    var5 ^= 1733373318;
                                    var1.Ht("ui_click");
                                    return true;
                                }

                                switch (var5) {
                                    case -669668154:
                                    default:
                                        var5 ^= 1466094949;
                                        break;
                                    case -107700661:
                                        var5 ^= 1034723085;
                                        break;
                                    case 804457083:
                                        var5 *= -2086221007;
                                        var5 &= 369326711;
                                        var5 ^= -1327227313;
                                }
                            }
                        } else {
                            var5 = switch (var5) {
                                default -> var5 ^ -1744951045;
                                case 234480851 -> var5 ^ 645154475;
                                case 1536754832 -> {
                                    var5 |= -1201120433;
                                    yield var5 ^ 1209292169;
                                }
                            };
                            int var350 = var4 + 1;
                            int var351 = var4 * var350;
                            int var407 = var4 + 2;
                            int var352 = var351 * var407;
                            var407 = var4 + 3;
                            int var353 = var352 * var407;
                            int var354 = var353 & 7;
                            if (var354 != 0) {
                                break label557;
                            }

                            boolean var355 = this.tS;
                            var407 = var7 + 1;
                            var407 = var7 * var407;
                            int var10 = var7 + 2;
                            var407 *= var10;
                            var10 = var7 + 3;
                            var407 *= var10;
                            var407 &= 7;
                            if (var407 == 0) {
                                var5 ^= 880353884;
                                var5 ^= -146136352;
                                if (!var355) {
                                    var5 ^= 1250393934;
                                    var5 *= -1490897567;
                                    var5 &= 1504826456;
                                    var5 &= 1424830040;
                                    var5 ^= 1934042590;
                                    long var391 = var4;
                                    long var506 = var391 + 1L;
                                    long var507 = var391 * var506;
                                    long var603 = var391 + 2L;
                                    long var508 = var507 * var603;
                                    long var392 = var391 + 3L;
                                    long var509 = var508 * var392;
                                    long var393 = var509 & 7L;
                                    long var630;
                                    int var394 = (var630 = var393 - 0L) == 0L ? 0 : (var630 < 0L ? -1 : 1);
                                    if (var394 == 0) {
                                        return false;
                                    }
                                    break label557;
                                }

                                var5 &= 1757218134;
                                var5 += 770228515;
                                var5 ^= -299398488;
                                var8 = this.y;
                                var8 += 15.0F;
                                var8 += 3.0F;
                                float var414 = var8 + 12.0F;
                                float var415 = var414 + 3.0F;
                                float var449 = this.pP;
                                float var450 = var449 / 3.0F;
                                Integer var11 = var7;
                                if (var11 == null) {
                                    var5 *= -1669914471;
                                    var5 ^= -507840055;
                                } else {
                                    label618: {
                                        var5 = switch (var5) {
                                            default -> var5 ^ -1438816870;
                                            case 441582424 -> var5 ^ 1862834302;
                                            case 1621314509 -> {
                                                var5 -= 1385870577;
                                                var5 ^= -1761232441;
                                                yield var5 ^ -205727160;
                                            }
                                        };
                                        var11 = var4;
                                        if (var11 == null) {
                                            break label557;
                                        }

                                        float var631;
                                        int var517 = (var631 = var3 - var8) == 0.0F ? 0 : (var631 < 0.0F ? -1 : 1);
                                        if (var517 >= 0) {
                                            var5 ^= -1870212042;
                                            var5 -= -1349757847;
                                            var5 ^= -1518038566;
                                            long var518 = var4;
                                            long var13 = var518 + 1L;
                                            var13 = var518 * var13;
                                            long var15 = var518 + 2L;
                                            var13 *= var15;
                                            long var519 = var518 + 3L;
                                            var13 *= var519;
                                            long var520 = var13 & 7L;
                                            long var632;
                                            var517 = (var632 = var520 - 0L) == 0L ? 0 : (var632 < 0L ? -1 : 1);
                                            if (var517 != 0) {
                                                break label557;
                                            }

                                            var8 += 12.0F;
                                            var517 = var7 + 1;
                                            var517 = var7 * var517;
                                            int var12 = var7 + 2;
                                            var517 *= var12;
                                            var12 = var7 + 3;
                                            var517 *= var12;
                                            var517 &= 7;
                                            if (var517 != 0) {
                                                var5 *= 1283709251;
                                                var5 -= 2060482998;
                                                var5 -= 1789420621;
                                                var5 ^= -1051673554;
                                                var5 ^= -2136600435;
                                                break label618;
                                            }

                                            var5 |= 1697416334;
                                            var5 &= 583580868;
                                            var5 ^= 86455231;
                                            float var633;
                                            int var360 = (var633 = var3 - var8) == 0.0F ? 0 : (var633 < 0.0F ? -1 : 1);
                                            if (var360 < 0) {
                                                var5 = switch (var5) {
                                                    default -> var5 ^ -112511384;
                                                    case 657436475 -> {
                                                        var5 <<= 19;
                                                        var5 ^= 576084746;
                                                        yield var5 ^ 1412447601;
                                                    }
                                                    case 884934764 -> var5 ^ -1297104741;
                                                };
                                                qr[] var361 = qr.values();
                                                float var527 = super.U;
                                                var12 = var7 + 1;
                                                var12 = var7 * var12;
                                                var12 &= 1;
                                                if (var12 == 0) {
                                                    var5 ^= 1904610056;
                                                    var5 ^= -1329303503;
                                                    var5 += 213429519;
                                                    var5 <<= 9;
                                                    var5 ^= 2065228904;
                                                    long var586 = var4;
                                                    long var14 = var586 + 1L;
                                                    var14 = var586 * var14;
                                                    long var587 = var14 & 1L;
                                                    long var634;
                                                    var12 = (var634 = var587 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
                                                    if (var12 == 0) {
                                                        float var528 = var2 - var527;
                                                        float var529 = var528 / var450;
                                                        var517 = (int)var529;
                                                        var517 = TP.B(var517, 0, 2);
                                                        qr var362 = var361[var517];
                                                        this.U = var362;
                                                        var1.Ht("ui_click");
                                                        return true;
                                                    }
                                                    break label557;
                                                }

                                                var5 |= 1795413086;
                                                var5 -= -758932021;
                                                var5 += -1205761255;
                                                var5 += -1892321558;
                                                var5 ^= 1454722811;
                                                break label618;
                                            }

                                            var5 ^= -420122527;
                                            var5 -= 948400563;
                                            var5 += 1772512575;
                                            var5 &= 53433059;
                                            var5 ^= -1465424373;
                                        } else {
                                            switch (var5) {
                                                case -879536961:
                                                    var5 ^= 1077583018;
                                                    break;
                                                case 579957190:
                                                default:
                                                    var5 ^= 828260227;
                                                    break;
                                                case 1790047571:
                                                    var5 *= 402461477;
                                                    var5 ^= 578464022;
                                            }
                                        }

                                        int var363 = var4 + 1;
                                        int var364 = var4 * var363;
                                        int var365 = var364 & 1;
                                        if (var365 != 0) {
                                            break label557;
                                        }

                                        float var635;
                                        int var366 = (var635 = var3 - var415) == 0.0F ? 0 : (var635 < 0.0F ? -1 : 1);
                                        long var532 = var7;
                                        long var607 = var532 + 1L;
                                        var607 = var532 * var607;
                                        long var626 = var532 + 2L;
                                        var607 *= var626;
                                        long var533 = var532 + 3L;
                                        var607 *= var533;
                                        long var534 = var607 & 7L;
                                        long var636;
                                        var517 = (var636 = var534 - 0L) == 0L ? 0 : (var636 < 0L ? -1 : 1);
                                        if (var517 != 0) {
                                            var5 &= -340593434;
                                            var5 *= -2082068023;
                                            var5 &= 357679264;
                                            var5 ^= -1548266260;
                                        } else {
                                            label620: {
                                                var5 = switch (var5) {
                                                    case -1433520919 -> {
                                                        var5 += 1155528344;
                                                        var5 |= -527085732;
                                                        var5 |= -221313228;
                                                        var5 *= 1296169301;
                                                        yield var5 ^ -1911641301;
                                                    }
                                                    case 1025907798 -> var5 ^ -1062142250;
                                                    default -> var5 ^ -2036734878;
                                                };
                                                if (var366 >= 0) {
                                                    var5 &= 1367141598;
                                                    var5 += -951879738;
                                                    var5 ^= -381304241;
                                                    var8 = var415 + 12.0F;
                                                    long var536 = var7;
                                                    var607 = var536 + 1L;
                                                    var607 = var536 * var607;
                                                    long var537 = var607 & 1L;
                                                    long var637;
                                                    var407 = (var637 = var537 - 0L) == 0L ? 0 : (var637 < 0L ? -1 : 1);
                                                    if (var407 != 0) {
                                                        switch (var5) {
                                                            case -235036257:
                                                                var5 -= -1288340540;
                                                                var5 |= -818140594;
                                                                var5 ^= 1301346407;
                                                                var5 >>>= 27;
                                                                var5 ^= -1293544358;
                                                                break label620;
                                                            case 805664453:
                                                            default:
                                                                var5 ^= -1164583108;
                                                                break label620;
                                                            case 1198311356:
                                                                var5 ^= -1193906552;
                                                                break label620;
                                                        }
                                                    }
                                                    var5 = switch (var5) {
                                                        case -235036257 -> {
                                                            var5 -= 475768578;
                                                            var5 <<= 18;
                                                            var5 *= -745134319;
                                                            var5 -= -233996163;
                                                            yield var5 ^ -1722954339;
                                                        }
                                                        default -> var5 ^ -695928712;
                                                        case 1654490583 -> var5 ^ 987990668;
                                                    };
                                                    float var638;
                                                    int var368 = (var638 = var3 - var8) == 0.0F ? 0 : (var638 < 0.0F ? -1 : 1);
                                                    if (var368 < 0) {
                                                        var5 ^= 245921916;
                                                        var5 -= -110533966;
                                                        var5 &= 438582118;
                                                        var5 |= -1544260856;
                                                        var5 ^= 560777520;
                                                        int var369 = var4 + 1;
                                                        int var370 = var4 * var369;
                                                        var407 = var4 + 2;
                                                        int var371 = var370 * var407;
                                                        var407 = var4 + 3;
                                                        int var372 = var371 * var407;
                                                        int var373 = var372 & 7;
                                                        if (var373 != 0) {
                                                            break label557;
                                                        }

                                                        var8 = super.U;
                                                        var407 = var7 + 1;
                                                        var407 = var7 * var407;
                                                        var517 = var7 + 2;
                                                        var407 *= var517;
                                                        var517 = var7 + 3;
                                                        var407 *= var517;
                                                        var407 &= 7;
                                                        if (var407 != 0) {
                                                            switch (var5) {
                                                                case -2103920104:
                                                                    var5 ^= 287395243;
                                                                    var5 |= -1948544362;
                                                                    var5 |= -1440547873;
                                                                    var5 ^= 152955827;
                                                                    break label620;
                                                                case -38576182:
                                                                    var5 ^= 1809753367;
                                                                    break label620;
                                                                case 1529641017:
                                                                default:
                                                                    var5 ^= -1534701446;
                                                            }
                                                        } else {
                                                            var5 -= -954996628;
                                                            var5 ^= 172897300;
                                                            var407 = var4 + 1;
                                                            var407 = var4 * var407;
                                                            var517 = var4 + 2;
                                                            var407 *= var517;
                                                            var517 = var4 + 3;
                                                            var407 *= var517;
                                                            var407 &= 7;
                                                            if (var407 != 0) {
                                                                break label557;
                                                            }

                                                            var8 = var2 - var8;
                                                            var8 /= var450;
                                                            cS var429 = this.S;
                                                            boolean var430 = var429.H();
                                                            float var452;
                                                            if (var430) {
                                                                var5 -= 198234980;
                                                                var5 <<= 23;
                                                                var5 *= 1597046493;
                                                                var5 ^= 600338348;
                                                                Integer var451 = var4;
                                                                if (var451 == null) {
                                                                    break label557;
                                                                }

                                                                var452 = 1.4F;
                                                                switch (var5) {
                                                                    case 57254957:
                                                                        var5 ^= 452877175;
                                                                        break;
                                                                    case 1279584934:
                                                                    default:
                                                                        var5 ^= -1316515050;
                                                                        break;
                                                                    case 1640525740:
                                                                        var5 += -1709925119;
                                                                        var5 ^= 514882162;
                                                                        var5 ^= 1771330183;
                                                                }
                                                            } else {
                                                                var5 &= -713575227;
                                                                var5 ^= 233046935;
                                                                var5 += -385927016;
                                                                var5 &= -1861267410;
                                                                var5 ^= -1303887159;
                                                                var452 = 2.0F;
                                                                var5 *= 1254208897;
                                                                var5 += 1486365317;
                                                                var5 += -696870810;
                                                                var5 ^= 26261514;
                                                            }

                                                            Integer var542 = var4;
                                                            if (var542 == null) {
                                                                break label557;
                                                            }

                                                            float var639;
                                                            var10 = (var639 = var8 - var452) == 0.0F ? 0 : (var639 < 0.0F ? -1 : 1);
                                                            long var543 = var7;
                                                            var607 = var543 + 1L;
                                                            var607 = var543 * var607;
                                                            long var544 = var607 & 1L;
                                                            long var640;
                                                            int var545 = (var640 = var544 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
                                                            if (var545 != 0) {
                                                                var5 ^= -2017766941;
                                                                var5 *= -895767381;
                                                                var5 |= 842346548;
                                                                var5 *= 1361609813;
                                                                var5 ^= -522115251;
                                                            } else {
                                                                var5 *= 17634857;
                                                                var5 &= -1955044789;
                                                                var5 &= -2089346106;
                                                                var5 ^= 1492767987;
                                                                var545 = var4 + 1;
                                                                var545 = var4 * var545;
                                                                var545 &= 1;
                                                                if (var545 != 0) {
                                                                    break label557;
                                                                }

                                                                if (var10 < 0) {
                                                                    var5 |= -2120369191;
                                                                    var5 &= 1175834730;
                                                                    var5 &= 313542283;
                                                                    var5 ^= 66785089;
                                                                    Integer var454 = var4;
                                                                    if (var454 == null) {
                                                                        break label557;
                                                                    }

                                                                    Be var455 = this.T;
                                                                    Be var456 = var455.next();
                                                                    var545 = var7 + 1;
                                                                    var545 = var7 * var545;
                                                                    int var589 = var7 + 2;
                                                                    var545 *= var589;
                                                                    var589 = var7 + 3;
                                                                    var545 *= var589;
                                                                    var545 &= 7;
                                                                    if (var545 == 0) {
                                                                        var5 = switch (var5) {
                                                                            default -> var5 ^ 702259780;
                                                                            case 32198475 -> {
                                                                                var5 |= 1021649124;
                                                                                var5 += -278042354;
                                                                                var5 -= -442513061;
                                                                                var5 *= -1918692703;
                                                                                yield var5 ^ 1919117372;
                                                                            }
                                                                            case 1138263285 -> var5 ^ -898630412;
                                                                        };
                                                                        Integer var554 = var4;
                                                                        if (var554 == null) {
                                                                            break label557;
                                                                        }

                                                                        this.T = var456;
                                                                        switch (var5) {
                                                                            case -1600497281:
                                                                                var5 ^= 197091069;
                                                                                break label556;
                                                                            case -1084010720:
                                                                            default:
                                                                                var5 ^= -1447970866;
                                                                                break label556;
                                                                            case -448442146:
                                                                                var5 *= 892348045;
                                                                                var5 ^= 116675154;
                                                                                var5 -= 1757175261;
                                                                                var5 *= -1554705607;
                                                                                var5 ^= 230757609;
                                                                                break label556;
                                                                        }
                                                                    }

                                                                    var5 |= -809625887;
                                                                    var5 -= 1273296893;
                                                                    var5 ^= 922514338;
                                                                } else {
                                                                    var5 &= 1965776277;
                                                                    var5 <<= 8;
                                                                    var5 -= -1113118542;
                                                                    var5 -= -1011277113;
                                                                    var5 ^= -739787201;
                                                                    var10 = var4 + 1;
                                                                    var10 = var4 * var10;
                                                                    var545 = var4 + 2;
                                                                    var10 *= var545;
                                                                    var545 = var4 + 3;
                                                                    var10 *= var545;
                                                                    var10 &= 7;
                                                                    if (var10 != 0) {
                                                                        break label557;
                                                                    }

                                                                    if (var430) {
                                                                        var5 = switch (var5) {
                                                                            default -> var5 ^ -1470368151;
                                                                            case 603298106 -> var5 ^ 408119042;
                                                                            case 1410595768 -> {
                                                                                var5 &= -1185873568;
                                                                                var5 |= -465128103;
                                                                                var5 |= -7328116;
                                                                                var5 ^= 1084254171;
                                                                                yield var5 ^ 1305550380;
                                                                            }
                                                                        };
                                                                        Integer var462 = var4;
                                                                        if (var462 == null) {
                                                                            break label557;
                                                                        }

                                                                        float var641;
                                                                        int var377 = (var641 = var8 - 2.2F) == 0.0F ? 0 : (var641 < 0.0F ? -1 : 1);
                                                                        long var463 = var7;
                                                                        long var591 = var463 + 1L;
                                                                        var591 = var463 * var591;
                                                                        long var622 = var463 + 2L;
                                                                        var591 *= var622;
                                                                        long var464 = var463 + 3L;
                                                                        var591 *= var464;
                                                                        long var465 = var591 & 7L;
                                                                        long var642;
                                                                        int var466 = (var642 = var465 - 0L) == 0L ? 0 : (var642 < 0L ? -1 : 1);
                                                                        if (var466 != 0) {
                                                                            var5 += -1609763010;
                                                                            var5 ^= 542484740;
                                                                            break label620;
                                                                        }

                                                                        var5 += 1095312282;
                                                                        var5 ^= -882499496;
                                                                        Integer var467 = var4;
                                                                        if (var467 == null) {
                                                                            break label557;
                                                                        }

                                                                        if (var377 < 0) {
                                                                            var5 = switch (var5) {
                                                                                case -125187588 -> {
                                                                                    var5 >>= 9;
                                                                                    yield var5 ^ -888918573;
                                                                                }
                                                                                case 764528007 -> var5 ^ 2087382083;
                                                                                default -> var5 ^ -1494131493;
                                                                            };
                                                                            Integer var378 = var4;
                                                                            if (var378 == null) {
                                                                                break label557;
                                                                            }

                                                                            cS var379 = this.S;
                                                                            int var468 = var7 + 1;
                                                                            var468 = var7 * var468;
                                                                            var468 &= 1;
                                                                            if (var468 == 0) {
                                                                                var5 &= -1795410709;
                                                                                var5 ^= -69770893;
                                                                                var468 = var4 + 1;
                                                                                var468 = var4 * var468;
                                                                                var468 &= 1;
                                                                                if (var468 != 0) {
                                                                                    break label557;
                                                                                }

                                                                                var379.B();
                                                                                var5 *= -1068725581;
                                                                                var5 ^= -368533360;
                                                                                var5 += 835779405;
                                                                                var5 ^= 999984763;
                                                                                break label556;
                                                                            }

                                                                            switch (var5) {
                                                                                case -1503836536:
                                                                                    var5 ^= -722706551;
                                                                                    break label620;
                                                                                case 888695095:
                                                                                    var5 &= 145234067;
                                                                                    var5 ^= -1303503777;
                                                                                    break label620;
                                                                                case 1722033617:
                                                                                default:
                                                                                    var5 ^= -1179071059;
                                                                                    break label620;
                                                                            }
                                                                        }

                                                                        var5 |= 1097181064;
                                                                        var5 += 289845656;
                                                                        var5 += 1788378069;
                                                                        var5 |= 1198684826;
                                                                        var5 ^= -1088175597;
                                                                    } else {
                                                                        switch (var5) {
                                                                            case 37915624:
                                                                            default:
                                                                                var5 ^= 239216106;
                                                                                break;
                                                                            case 1245453393:
                                                                                var5 ^= -738303102;
                                                                                break;
                                                                            case 1410595768:
                                                                                var5 <<= 23;
                                                                                var5 >>>= 26;
                                                                                var5 *= 1097467229;
                                                                                var5 |= -1995520724;
                                                                                var5 ^= 1158896151;
                                                                        }
                                                                    }

                                                                    int var380 = var4 + 1;
                                                                    int var381 = var4 * var380;
                                                                    int var382 = var381 & 1;
                                                                    if (var382 != 0) {
                                                                        break label557;
                                                                    }

                                                                    cS var383 = this.S;
                                                                    var10 = var7 + 1;
                                                                    var10 = var7 * var10;
                                                                    var10 &= 1;
                                                                    if (var10 == 0) {
                                                                        var5 = switch (var5) {
                                                                            default -> var5 ^ -397664892;
                                                                            case -1531471036 -> var5 ^ 10271164;
                                                                            case -925057560 -> {
                                                                                var5 *= -1846479095;
                                                                                var5 >>= 27;
                                                                                yield var5 ^ 990537407;
                                                                            }
                                                                        };
                                                                        Integer var477 = var4;
                                                                        if (var477 == null) {
                                                                            break label557;
                                                                        }

                                                                        var383.sJ();
                                                                        var5 &= 1413640831;
                                                                        var5 *= -52408747;
                                                                        var5 ^= 770167334;
                                                                        break label556;
                                                                    }

                                                                    var5 -= -329308835;
                                                                    var5 -= -1931427472;
                                                                    var5 -= -1698896208;
                                                                    var5 ^= 104457255;
                                                                }
                                                            }
                                                        }
                                                        break label620;
                                                    }

                                                    switch (var5) {
                                                        case -756305378:
                                                            var5 *= -1168028677;
                                                            var5 *= -994661353;
                                                            var5 ^= 2010075299;
                                                            break;
                                                        case 1746339705:
                                                        default:
                                                            var5 ^= 1687751114;
                                                            break;
                                                        case 1962818644:
                                                            var5 ^= 842961498;
                                                    }
                                                } else {
                                                    var5 &= -400040754;
                                                    var5 += -701197028;
                                                    var5 |= 981676914;
                                                    var5 *= -610305373;
                                                    var5 ^= -1436509177;
                                                }

                                                int var384 = var4 + 1;
                                                int var385 = var4 * var384;
                                                int var386 = var385 & 1;
                                                if (var386 != 0) {
                                                    break label557;
                                                }

                                                int var387 = var5 * 925707821;
                                                int var388 = var387 >> 4;
                                                int var389 = var388 ^ -1656787926;
                                                int var390 = this.a(var2, var389);
                                                var10 = var5 << 31;
                                                var10 |= -1502711475;
                                                var10 |= 80959822;
                                                var10 += 392129806;
                                                var10 ^= 1304303868;
                                                var10 = this.BG(var3, var10);
                                                var517 = var7 + 1;
                                                var517 = var7 * var517;
                                                var517 &= 1;
                                                if (var517 != 0) {
                                                    switch (var5) {
                                                        case -1193107735:
                                                            var5 ^= 1771864122;
                                                            break;
                                                        case -378905563:
                                                            var5 -= 814983466;
                                                            var5 ^= 170960567;
                                                            break;
                                                        case -234719113:
                                                        default:
                                                            var5 ^= 182616743;
                                                    }
                                                } else {
                                                    label630: {
                                                        var5 |= -2094573356;
                                                        var5 ^= 1483436242;
                                                        long var560 = var4;
                                                        var607 = var560 + 1L;
                                                        var607 = var560 * var607;
                                                        long var561 = var607 & 1L;
                                                        long var643;
                                                        var517 = (var643 = var561 - 0L) == 0L ? 0 : (var643 < 0L ? -1 : 1);
                                                        if (var517 != 0) {
                                                            break label557;
                                                        }

                                                        if (var390 < 0) {
                                                            var5 ^= 839903383;
                                                            var5 += -152301529;
                                                            var5 ^= 1609972447;
                                                            var5 ^= -1358821185;
                                                            var5 ^= 1568248012;
                                                            break label583;
                                                        }
                                                        var5 = switch (var5) {
                                                            case -1397507098 -> var5 ^ -529387838;
                                                            case -1291572185 -> {
                                                                var5 *= -75329515;
                                                                var5 *= 1033300085;
                                                                yield var5 ^ 455504433;
                                                            }
                                                            default -> var5 ^ 1268236174;
                                                        };
                                                        long var484 = var4;
                                                        long var595 = var484 + 1L;
                                                        var595 = var484 * var595;
                                                        long var485 = var595 & 1L;
                                                        long var644;
                                                        var10 = (var644 = var485 - 0L) == 0L ? 0 : (var644 < 0L ? -1 : 1);
                                                        if (var10 != 0) {
                                                            break label557;
                                                        }

                                                        if (var10 < 0) {
                                                            var5 += 781358434;
                                                            var5 *= 427893243;
                                                            var5 -= -802363465;
                                                            var5 += -1694514552;
                                                            var5 ^= 397476618;
                                                            break label583;
                                                        }

                                                        var5 |= 1486595359;
                                                        var5 += -998801828;
                                                        var5 |= 1823385324;
                                                        var5 <<= 14;
                                                        var5 ^= 40284381;
                                                        if (var4 != 0) {
                                                            var5 ^= 1475236617;
                                                            var5 -= 2095404908;
                                                            var5 <<= 30;
                                                            var5 |= -1093972312;
                                                            var5 ^= 343617575;
                                                            var10 = var4 + 1;
                                                            var10 = var4 * var10;
                                                            var10 &= 1;
                                                            if (var10 != 0) {
                                                                break label557;
                                                            }

                                                            if (var4 != 1) {
                                                                var5 *= 195401419;
                                                                var5 ^= -1589816546;
                                                                break label583;
                                                            }

                                                            var5 <<= 11;
                                                            var5 *= 178290763;
                                                            var5 ^= 838343244;
                                                        } else {
                                                            var5 -= -2143231389;
                                                            var5 -= 1615204565;
                                                            var5 ^= -931835927;
                                                        }

                                                        label577: {
                                                            if (var4 != 1) {
                                                                var5 = switch (var5) {
                                                                    default -> var5 ^ 2012181012;
                                                                    case -714657204 -> {
                                                                        var5 |= 1857433439;
                                                                        var5 |= -1880310233;
                                                                        yield var5 ^ -335537944;
                                                                    }
                                                                    case 245115615 -> var5 ^ -1761134666;
                                                                };
                                                                long var490 = var4;
                                                                var595 = var490 + 1L;
                                                                var595 = var490 * var595;
                                                                long var623 = var490 + 2L;
                                                                var595 *= var623;
                                                                long var491 = var490 + 3L;
                                                                var595 *= var491;
                                                                long var492 = var595 & 7L;
                                                                long var645;
                                                                var10 = (var645 = var492 - 0L) == 0L ? 0 : (var645 < 0L ? -1 : 1);
                                                                if (var10 != 0) {
                                                                    break label557;
                                                                }

                                                                qr var494 = this.U;
                                                                var517 = var7 + 1;
                                                                var517 = var7 * var517;
                                                                var517 &= 1;
                                                                if (var517 != 0) {
                                                                    var5 |= -2083546737;
                                                                    var5 ^= 555330515;
                                                                    break label630;
                                                                }

                                                                var5 &= 1526803569;
                                                                var5 += -1245578316;
                                                                var5 |= 57119749;
                                                                var5 <<= 6;
                                                                var5 ^= 1842439578;
                                                                var517 = var4 + 1;
                                                                var517 = var4 * var517;
                                                                var517 &= 1;
                                                                if (var517 != 0) {
                                                                    break label557;
                                                                }

                                                                qr var569 = qr.ERASE;
                                                                if (var494 != var569) {
                                                                    var5 >>= 27;
                                                                    var5 >>>= 20;
                                                                    var5 -= 1616828650;
                                                                    var5 >>= 15;
                                                                    var5 ^= 507684020;
                                                                    var10 = var4 + 1;
                                                                    var10 = var4 * var10;
                                                                    var517 = var4 + 2;
                                                                    var10 *= var517;
                                                                    var517 = var4 + 3;
                                                                    var10 *= var517;
                                                                    var10 &= 7;
                                                                    if (var10 != 0) {
                                                                        break label557;
                                                                    }

                                                                    qr var500 = this.U;
                                                                    long var572 = var7;
                                                                    var607 = var572 + 1L;
                                                                    var607 = var572 * var607;
                                                                    var626 = var572 + 2L;
                                                                    var607 *= var626;
                                                                    long var573 = var572 + 3L;
                                                                    var607 *= var573;
                                                                    long var574 = var607 & 7L;
                                                                    long var646;
                                                                    var517 = (var646 = var574 - 0L) == 0L ? 0 : (var646 < 0L ? -1 : 1);
                                                                    if (var517 != 0) {
                                                                        var5 -= -1593214465;
                                                                        var5 ^= -229493317;
                                                                        break label630;
                                                                    }
                                                                    var5 = switch (var5) {
                                                                        case -507667466 -> {
                                                                            var5 >>= 25;
                                                                            var5 += 899611833;
                                                                            var5 -= -1648489525;
                                                                            yield var5 ^ 1863281451;
                                                                        }
                                                                        case -354521309 -> var5 ^ -850248555;
                                                                        default -> var5 ^ 688037430;
                                                                    };
                                                                    var517 = var4 + 1;
                                                                    var517 = var4 * var517;
                                                                    var517 &= 1;
                                                                    if (var517 != 0) {
                                                                        break label557;
                                                                    }

                                                                    qr var579 = qr.ACCENT;
                                                                    if (var500 == var579) {
                                                                        var5 ^= -882093446;
                                                                        var5 |= -147657809;
                                                                        var5 ^= 1062545051;
                                                                        var10 = var4 + 1;
                                                                        var10 = var4 * var10;
                                                                        var10 &= 1;
                                                                        if (var10 != 0) {
                                                                            break label557;
                                                                        }

                                                                        var504 = 2;
                                                                        var5 >>>= 2;
                                                                        var5 |= -539378825;
                                                                        var5 ^= -37539897;
                                                                    } else {
                                                                        var5 ^= 518180971;
                                                                        var5 *= 1088618823;
                                                                        var5 ^= 760555524;
                                                                        var504 = 1;
                                                                        switch (var5) {
                                                                            case -1879281127:
                                                                            default:
                                                                                var5 ^= -1896909218;
                                                                                break label577;
                                                                            case 1161871062:
                                                                                var5 <<= 8;
                                                                                var5 -= 1726960402;
                                                                                var5 += -318164799;
                                                                                var5 -= -53668349;
                                                                                var5 ^= -936310508;
                                                                                break label577;
                                                                            case 1363112697:
                                                                                var5 ^= 787752333;
                                                                        }
                                                                    }
                                                                    break label577;
                                                                }

                                                                switch (var5) {
                                                                    case -1808362278:
                                                                        var5 >>>= 29;
                                                                        var5 ^= -2073064456;
                                                                        var5 ^= -78598248;
                                                                        var5 += 1718236915;
                                                                        var5 ^= -1296197819;
                                                                        break;
                                                                    case -1346818005:
                                                                        var5 ^= -1334345766;
                                                                        break;
                                                                    case 1527148025:
                                                                    default:
                                                                        var5 ^= -77861892;
                                                                }
                                                            } else {
                                                                var5 &= -1619136072;
                                                                var5 ^= -1032717286;
                                                            }

                                                            Integer var580 = var4;
                                                            if (var580 == null) {
                                                                break label557;
                                                            }

                                                            var504 = 0;
                                                            switch (var5) {
                                                                case -1737551452:
                                                                default:
                                                                    var5 ^= 520913657;
                                                                    break;
                                                                case -1596139888:
                                                                    var5 ^= 1581041400;
                                                                    break;
                                                                case 1460980754:
                                                                    var5 |= 514321343;
                                                                    var5 -= -949773219;
                                                                    var5 |= 1474893394;
                                                                    var5 ^= -574110774;
                                                            }
                                                        }

                                                        this.Qv = (byte)var504;
                                                        cS var505 = this.S;
                                                        byte var581 = this.Qv;
                                                        Integer var344 = var7;
                                                        if (var344 != null) {
                                                            var5 -= -93621546;
                                                            var5 |= 399109166;
                                                            var5 *= -1896359467;
                                                            var5 += 1579469334;
                                                            var5 ^= 635193635;
                                                            var595 = var4;
                                                            long var624 = var595 + 1L;
                                                            var624 = var595 * var624;
                                                            var595 = var624 & 1L;
                                                            long var647;
                                                            int var345 = (var647 = var595 - 0L) == 0L ? 0 : (var647 < 0L ? -1 : 1);
                                                            if (var345 == 0) {
                                                                Be var346 = this.T;
                                                                var505.pJ(var390, var10, var581, var346);
                                                                this.IG = var390;
                                                                this.Fr = var10;
                                                                var1.Q = this;
                                                                return true;
                                                            }
                                                            break label557;
                                                        }

                                                        var5 |= -1235171416;
                                                        var5 |= 961190067;
                                                        var5 += 1411655904;
                                                        var5 <<= 13;
                                                        var5 ^= 1408595020;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                switch (var5) {
                                    case -1855238910:
                                        var5 ^= -485775877;
                                        break;
                                    case -1276310954:
                                        var5 |= 1068440718;
                                        var5 ^= 218696338;
                                        break;
                                    case 1021134495:
                                    default:
                                        var5 ^= -1971804466;
                                }
                            }
                        }
                    } else {
                        var5 *= 2000588949;
                        var5 ^= -1422781901;
                    }

                    var5 = var4 + 1;
                    var5 = var4 * var5;
                    var5 &= 1;
                    if (var5 == 0) {
                        UnsupportedOperationException var337 = new UnsupportedOperationException();
                        throw var337;
                    }
                    break label557;
                }

                Integer var347 = var4;
                if (var347 != null) {
                    return false;
                }
                break label557;
            }

            var1.Ht("ui_click");
            return true;
        }

        IllegalStateException var343 = new IllegalStateException();
        throw var343;
    }

    @Override
    public void M(jX var1, float var2, float var3) {
        int var4 = LP;
        var4 ^= 493741026;
        int var5 = System.identityHashCode(this);
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var6 &= 1;
        if (var6 != 0) {
            var4 >>>= 4;
            var4 -= -1721266037;
            var4 |= 1414253371;
            var4 ^= 1426149345;
        } else {
            label314: {
                var4 &= 1946641752;
                var4 -= 1442840592;
                var4 &= -1656829556;
                var4 ^= 952927969;
                long var210 = var4;
                long var8 = var210 + 1L;
                var8 = var210 * var8;
                long var211 = var8 & 1L;
                long var393;
                var6 = (var393 = var211 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                if (var6 == 0) {
                    var6 = this.IG;
                    if (var6 < 0) {
                        long var229 = switch (var4) {
                            case 550160361 -> {
                                var4 &= -1041167103;
                                var4 ^= 1403617452;
                                var4 &= 1541765328;
                                yield var4 ^ 2092563893;
                            }
                            default -> var4 ^ 809497673;
                            case 1211186574 -> var4 ^ 1327006096;
                        };
                        var8 = var229 + 1L;
                        var8 = var229 * var8;
                        long var230 = var8 & 1L;
                        long var394;
                        var6 = (var394 = var230 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            return;
                        }
                    } else {
                        var4 += 395615637;
                        var4 ^= 2036433717;
                        long var214 = var4;
                        var8 = var214 + 1L;
                        var8 = var214 * var8;
                        long var10 = var214 + 2L;
                        var8 *= var10;
                        long var215 = var214 + 3L;
                        var8 *= var215;
                        long var216 = var8 & 7L;
                        long var395;
                        var6 = (var395 = var216 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            var6 = var4 + 24325790;
                            var6 += -853231000;
                            var6 *= 645341357;
                            var6 >>>= 13;
                            var6 ^= -954461003;
                            float var223 = this.l(var6);
                            float var224 = var223 / 17.0F;
                            float var7 = super.U;
                            var7 = var2 - var7;
                            var7 /= var224;
                            double var234 = var7;
                            double var235 = Math.floor(var234);
                            int var236 = (int)var235;
                            int var237 = TP.B(var236, 0, 16);
                            int var238 = var237;
                            int var244 = var4 * 323020755;
                            int var245 = var244 * -1185869039;
                            int var246 = var245 ^ -303649202;
                            float var247 = this.y(var246);
                            float var248 = var3 - var247;
                            float var225 = var248 / var224;
                            double var249 = var225;
                            double var250 = Math.floor(var249);
                            var6 = (int)var250;
                            var6 = TP.B(var6, 0, 16);
                            var6 = var6;
                            int var251 = this.IG;
                            long var9 = var5;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var396;
                            int var256 = (var396 = var9 - 0L) == 0L ? 0 : (var396 < 0L ? -1 : 1);
                            if (var256 != 0) {
                                var4 *= 1651741259;
                                var4 *= -933291497;
                                var4 &= -207959985;
                                var4 <<= 30;
                                var4 ^= -520449958;
                                break label314;
                            }

                            var4 &= 362853185;
                            var4 &= -1463414161;
                            var4 &= -949975887;
                            var4 *= 2020175317;
                            var4 ^= -1758535597;
                            var9 = var4;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var397;
                            int var259 = (var397 = var9 - 0L) == 0L ? 0 : (var397 < 0L ? -1 : 1);
                            label253:
                            if (var259 == 0) {
                                int var260 = this.Fr;
                                int var262 = var237 - var251;
                                int var263 = Math.abs(var262);
                                int var264 = var263;
                                int var268 = var6 - var260;
                                int var269 = Math.abs(var268);
                                int var270 = -var269;
                                int var271 = var270;
                                byte var274;
                                if (var251 < var237) {
                                    var4 += -1680527700;
                                    var4 ^= 895498981;
                                    long var12 = var4;
                                    long var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    long var272 = var14 & 1L;
                                    long var398;
                                    var274 = (byte)((var398 = var272 - 0L) == 0L ? 0 : (var398 < 0L ? -1 : 1));
                                    if (var274 != 0) {
                                        break label253;
                                    }

                                    var274 = 1;
                                    var4 |= -38218315;
                                    var4 *= 749142321;
                                    var4 ^= -1302665633;
                                } else {
                                    var4 = switch (var4) {
                                        case -280523386 -> {
                                            var4 += -640497490;
                                            yield var4 ^ 1141804948;
                                        }
                                        default -> var4 ^ -1000236333;
                                        case 2109794623 -> var4 ^ 54780221;
                                    };
                                    var274 = -1;
                                    switch (var4) {
                                        case -1928013408:
                                            var4 &= -1792330383;
                                            var4 |= 91239425;
                                            var4 ^= 1702141497;
                                            break;
                                        case 1237477998:
                                            var4 ^= -1091024665;
                                            break;
                                        case 1546717989:
                                        default:
                                            var4 ^= -1609783814;
                                    }
                                }

                                long var13 = var4;
                                long var15 = var13 + 1L;
                                var15 = var13 * var15;
                                long var17 = var13 + 2L;
                                var15 *= var17;
                                var13 += 3L;
                                var15 *= var13;
                                var13 = var15 & 7L;
                                long var399;
                                int var278 = (var399 = var13 - 0L) == 0L ? 0 : (var399 < 0L ? -1 : 1);
                                if (var278 == 0) {
                                    byte var275 = (byte)var274;
                                    int var279 = var5 + 1;
                                    int var280 = var5 * var279;
                                    int var288 = var5 + 2;
                                    int var281 = var280 * var288;
                                    var288 = var5 + 3;
                                    int var282 = var281 * var288;
                                    int var283 = var282 & 7;
                                    if (var283 != 0) {
                                        var4 += 1692554096;
                                        var4 ^= -1970687081;
                                        var4 &= -484983389;
                                        var4 *= 135144279;
                                        var4 ^= -1783872161;
                                        break label314;
                                    }

                                    var4 &= -743180491;
                                    var4 ^= -754703332;
                                    Integer var284 = var4;
                                    label244:
                                    if (var284 != null) {
                                        byte var285;
                                        if (var260 < var6) {
                                            var4 *= -225136997;
                                            var4 ^= 34080767;
                                            var4 += 1051519609;
                                            var4 *= 721766665;
                                            var4 ^= -1383762962;
                                            var285 = 1;
                                            var4 *= 1194833033;
                                            var4 <<= 26;
                                            var4 ^= -694581540;
                                        } else {
                                            var4 += 2141329072;
                                            var4 += -656754451;
                                            var4 ^= -1405611052;
                                            var288 = var4 + 1;
                                            var288 = var4 * var288;
                                            var288 &= 1;
                                            if (var288 != 0) {
                                                break label244;
                                            }

                                            var285 = -1;
                                            var4 &= 1215579381;
                                            var4 -= -1489670568;
                                            var4 |= -644726372;
                                            var4 ^= -1949381728;
                                            var4 ^= -1397908767;
                                        }

                                        byte var286 = var285;
                                        var288 = var263 + var270;
                                        Integer var298 = var5;
                                        if (var298 == null) {
                                            switch (var4) {
                                                case -23492900:
                                                    var4 *= 2143522399;
                                                    var4 |= -2089809724;
                                                    var4 += 1104953176;
                                                    var4 *= -213907457;
                                                    var4 ^= -1736960866;
                                                    break label314;
                                                case 273430544:
                                                default:
                                                    var4 ^= -1909799422;
                                                    break label314;
                                                case 1013358257:
                                                    var4 ^= 471778097;
                                                    break label314;
                                            }
                                        }

                                        var4 >>= 20;
                                        var4 |= 764164065;
                                        var4 -= 2062223485;
                                        var4 ^= -740774495;
                                        int var252 = var251;
                                        int var261 = var260;
                                        var288 = var288;
                                        var4 &= 1956834757;
                                        var4 |= 384720227;
                                        var4 ^= 908647915;

                                        while (true) {
                                            var15 = var4;
                                            var17 = var15 + 1L;
                                            var17 = var15 * var17;
                                            var15 = var17 & 1L;
                                            long var400;
                                            int var301 = (var400 = var15 - 0L) == 0L ? 0 : (var400 < 0L ? -1 : 1);
                                            if (var301 != 0) {
                                                break;
                                            }

                                            cS var302 = this.S;
                                            int var16 = this.Qv;
                                            Be var346 = this.T;
                                            var302.pJ(var252, var261, (byte)var16, var346);
                                            var15 = var5;
                                            var17 = var15 + 1L;
                                            var17 = var15 * var17;
                                            var15 = var17 & 1L;
                                            long var401;
                                            int var305 = (var401 = var15 - 0L) == 0L ? 0 : (var401 < 0L ? -1 : 1);
                                            if (var305 != 0) {
                                                switch (var4) {
                                                    case -876553911:
                                                        var4 ^= -1650638075;
                                                        break label314;
                                                    case 460674589:
                                                    default:
                                                        var4 ^= 808543924;
                                                        break label314;
                                                    case 1623621644:
                                                        var4 *= 555250741;
                                                        var4 ^= -1463328218;
                                                        break label314;
                                                }
                                            }

                                            var4 -= 1805735098;
                                            var4 ^= 1078511266;
                                            Integer var306 = var4;
                                            if (var306 == null) {
                                                break;
                                            }

                                            if (var252 == var238) {
                                                var4 += -1532323993;
                                                var4 *= -266888951;
                                                var4 ^= 1999724526;
                                                var4 ^= -1810665497;
                                                var4 ^= 326513437;
                                                var15 = var4;
                                                var17 = var15 + 1L;
                                                var17 = var15 * var17;
                                                var15 = var17 & 1L;
                                                long var402;
                                                int var309 = (var402 = var15 - 0L) == 0L ? 0 : (var402 < 0L ? -1 : 1);
                                                if (var309 != 0) {
                                                    break;
                                                }

                                                if (var261 == var6) {
                                                    var4 >>= 8;
                                                    var4 |= 935583127;
                                                    var4 ^= 1270135187;
                                                    var4 ^= 1549344595;
                                                    var4 <<= 8;
                                                    var4 ^= -89705557;
                                                    Integer var310 = var4;
                                                    if (var310 != null) {
                                                        this.IG = var238;
                                                        int var311 = var5 + 1;
                                                        int var312 = var5 * var311;
                                                        var16 = var5 + 2;
                                                        int var313 = var312 * var16;
                                                        var16 = var5 + 3;
                                                        int var314 = var313 * var16;
                                                        int var315 = var314 & 7;
                                                        if (var315 != 0) {
                                                            switch (var4) {
                                                                case -1901113342:
                                                                    var4 ^= 289624428;
                                                                    break label314;
                                                                case -1157316184:
                                                                default:
                                                                    var4 ^= -220842377;
                                                                    break label314;
                                                                case -119649109:
                                                                    var4 -= -2020281392;
                                                                    var4 += -1041851647;
                                                                    var4 *= -1067163171;
                                                                    var4 -= 928315946;
                                                                    var4 ^= 1184659096;
                                                                    break label314;
                                                            }
                                                        }

                                                        var4 &= 1691886446;
                                                        var4 |= 468374093;
                                                        var4 += -161014581;
                                                        var4 ^= 1910424168;
                                                        var15 = var4;
                                                        var17 = var15 + 1L;
                                                        var17 = var15 * var17;
                                                        var15 = var17 & 1L;
                                                        long var403;
                                                        int var318 = (var403 = var15 - 0L) == 0L ? 0 : (var403 < 0L ? -1 : 1);
                                                        if (var318 == 0) {
                                                            this.Fr = var6;
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                }

                                                switch (var4) {
                                                    case -1747421232:
                                                    default:
                                                        var4 ^= 936187855;
                                                        break;
                                                    case -1658802160:
                                                        var4 ^= -1560486566;
                                                        break;
                                                    case -1391809509:
                                                        var4 |= 1945011336;
                                                        var4 ^= 1290995396;
                                                }
                                            } else {
                                                var4 ^= 816729154;
                                                var4 ^= 965791164;
                                                var4 -= -1957251507;
                                                var4 *= -1416322163;
                                                var4 ^= 1382044690;
                                            }

                                            Integer var319 = var4;
                                            if (var319 == null) {
                                                break;
                                            }

                                            int var320 = 2 * var288;
                                            var16 = var5 + 1;
                                            var16 = var5 * var16;
                                            var16 &= 1;
                                            if (var16 != 0) {
                                                var4 *= -348820739;
                                                var4 ^= -411228743;
                                                break label314;
                                            }

                                            var4 += 908721955;
                                            var4 += -147563385;
                                            var4 ^= 985999000;
                                            Integer var328 = var4;
                                            if (var328 == null) {
                                                break;
                                            }

                                            int var331;
                                            int var354;
                                            if (var320 >= var271) {
                                                var4 += 2076671264;
                                                var4 |= -1438554328;
                                                var4 &= 550088574;
                                                var4 ^= -1299034942;
                                                Integer var329 = var4;
                                                if (var329 == null) {
                                                    break;
                                                }

                                                int var330 = var288 + var271;
                                                int var353 = var252 + var275;
                                                var354 = var353;
                                                long var18 = var5;
                                                long var20 = var18 + 1L;
                                                var20 = var18 * var20;
                                                long var22 = var18 + 2L;
                                                var20 *= var22;
                                                var18 += 3L;
                                                var20 *= var18;
                                                var18 = var20 & 7L;
                                                long var404;
                                                int var357 = (var404 = var18 - 0L) == 0L ? 0 : (var404 < 0L ? -1 : 1);
                                                if (var357 != 0) {
                                                    switch (var4) {
                                                        case -1839995910:
                                                            var4 |= 426522696;
                                                            var4 += 265689622;
                                                            var4 ^= -1951627702;
                                                            break label314;
                                                        case 100407690:
                                                        default:
                                                            var4 ^= 1765924280;
                                                            break label314;
                                                        case 2071806293:
                                                            var4 ^= 1630228836;
                                                            break label314;
                                                    }
                                                }
                                                var4 = switch (var4) {
                                                    case -1839995910 -> {
                                                        var4 <<= 18;
                                                        var4 &= 1996477614;
                                                        var4 ^= 486783101;
                                                        var4 <<= 19;
                                                        yield var4 ^ 57453124;
                                                    }
                                                    default -> var4 ^ -474609146;
                                                    case 1893868258 -> var4 ^ 1165171344;
                                                };
                                                int var358 = var4 + 1;
                                                int var359 = var4 * var358;
                                                int var360 = var359 & 1;
                                                if (var360 != 0) {
                                                    break;
                                                }

                                                var331 = var330;
                                                switch (var4) {
                                                    case -1065047484:
                                                        var4 -= -1488430499;
                                                        var4 |= 1456257725;
                                                        var4 ^= -309789758;
                                                        break;
                                                    case -95928874:
                                                        var4 ^= -189045232;
                                                        break;
                                                    case 919764869:
                                                    default:
                                                        var4 ^= -1240056882;
                                                }
                                            } else {
                                                var4 &= 1689706704;
                                                var4 ^= -90957376;
                                                int var361 = var4 + 1;
                                                var361 = var4 * var361;
                                                var361 &= 1;
                                                if (var361 != 0) {
                                                    break;
                                                }

                                                var354 = var252;
                                                var361 = var5 + 1;
                                                var361 = var5 * var361;
                                                int var19 = var5 + 2;
                                                var361 *= var19;
                                                var19 = var5 + 3;
                                                var361 *= var19;
                                                var361 &= 7;
                                                if (var361 != 0) {
                                                    var4 ^= -470540380;
                                                    var4 += 1298539867;
                                                    var4 += 628567579;
                                                    var4 |= -38035804;
                                                    var4 ^= -582652236;
                                                    break label314;
                                                }
                                                var4 = switch (var4) {
                                                    case -1172031152 -> {
                                                        var4 += 2125405828;
                                                        var4 &= 511960389;
                                                        var4 ^= 1817224615;
                                                        var4 |= -251127563;
                                                        yield var4 ^ 1529639913;
                                                    }
                                                    default -> var4 ^ -247159820;
                                                    case 169421898 -> var4 ^ 2118025916;
                                                };
                                                Integer var369 = var4;
                                                if (var369 == null) {
                                                    break;
                                                }

                                                var331 = var288;
                                                var4 *= 1705486605;
                                                var4 ^= 1368316603;
                                            }

                                            int var322;
                                            int var371;
                                            if (var320 <= var264) {
                                                var4 >>>= 30;
                                                var4 += 296929398;
                                                var4 -= 104548567;
                                                var4 *= 75079391;
                                                var4 ^= 2136795837;
                                                int var321 = var331 + var264;
                                                var371 = var261 + var286;
                                                var371 = var371;
                                                Integer var373 = var5;
                                                if (var373 == null) {
                                                    var4 &= -1617935191;
                                                    var4 |= 1174644941;
                                                    var4 ^= 891013908;
                                                    var4 ^= -631065725;
                                                    break label314;
                                                }
                                                var4 = switch (var4) {
                                                    default -> var4 ^ 2104211682;
                                                    case -341155454 -> {
                                                        var4 *= 1323367315;
                                                        var4 *= -1143318753;
                                                        var4 >>= 28;
                                                        yield var4 ^ -338449030;
                                                    }
                                                    case 121084815 -> var4 ^ -1959655222;
                                                };
                                                long var374 = var4;
                                                long var21 = var374 + 1L;
                                                var21 = var374 * var21;
                                                long var23 = var374 + 2L;
                                                var21 *= var23;
                                                long var375 = var374 + 3L;
                                                var21 *= var375;
                                                long var376 = var21 & 7L;
                                                long var405;
                                                int var377 = (var405 = var376 - 0L) == 0L ? 0 : (var405 < 0L ? -1 : 1);
                                                if (var377 != 0) {
                                                    break;
                                                }

                                                var322 = var321;
                                                var4 += 86431988;
                                                var4 ^= -1868017605;
                                                var4 >>>= 7;
                                                var4 *= 1570337665;
                                                var4 ^= 1125656477;
                                            } else {
                                                var4 = switch (var4) {
                                                    case -1301019587 -> {
                                                        var4 <<= 31;
                                                        yield var4 ^ 1373562998;
                                                    }
                                                    case -1045262472 -> var4 ^ -938297936;
                                                    default -> var4 ^ -153090339;
                                                };
                                                Integer var378 = var4;
                                                if (var378 == null) {
                                                    break;
                                                }

                                                var371 = var261;
                                                var378 = var5;
                                                if (var378 == null) {
                                                    switch (var4) {
                                                        case -773920650:
                                                            var4 *= 568377389;
                                                            var4 -= 1919392683;
                                                            var4 ^= 497373513;
                                                            break label314;
                                                        case -434010759:
                                                            var4 ^= 369886868;
                                                            break label314;
                                                        case -258989833:
                                                        default:
                                                            var4 ^= 228536027;
                                                            break label314;
                                                    }
                                                }

                                                var4 <<= 24;
                                                var4 ^= -914663563;
                                                var4 -= -1471329381;
                                                var4 ^= -1773511679;
                                                var322 = var331;
                                                var4 ^= -81189519;
                                                var4 ^= 1129359041;
                                            }

                                            var331 = var4 + 1;
                                            var331 = var4 * var331;
                                            int var380 = var4 + 2;
                                            var331 *= var380;
                                            var380 = var4 + 3;
                                            var331 *= var380;
                                            var331 &= 7;
                                            if (var331 != 0) {
                                                break;
                                            }

                                            var252 = var354;
                                            long var337 = var5;
                                            long var382 = var337 + 1L;
                                            long var383 = var337 * var382;
                                            long var392 = var337 + 2L;
                                            long var384 = var383 * var392;
                                            long var338 = var337 + 3L;
                                            long var385 = var384 * var338;
                                            long var339 = var385 & 7L;
                                            long var406;
                                            var331 = (var406 = var339 - 0L) == 0L ? 0 : (var406 < 0L ? -1 : 1);
                                            if (var331 != 0) {
                                                var4 &= -313981827;
                                                var4 *= 774886809;
                                                var4 *= 1545910215;
                                                var4 ^= -617982371;
                                                break label314;
                                            }

                                            var4 *= 1881072715;
                                            var4 += 565071449;
                                            var4 ^= 304742471;
                                            var4 ^= 965943036;
                                            var331 = var4 + 1;
                                            var331 = var4 * var331;
                                            var331 &= 1;
                                            if (var331 != 0) {
                                                break;
                                            }

                                            var261 = var371;
                                            var288 = var322;
                                            switch (var4) {
                                                case 144558857:
                                                    var4 += 286683074;
                                                    var4 >>= 31;
                                                    var4 ^= -1287444772;
                                                    var4 &= -1464878648;
                                                    var4 ^= -1060790076;
                                                    break;
                                                case 157477592:
                                                    var4 ^= 1543336770;
                                                    break;
                                                case 2046686081:
                                                default:
                                                    var4 ^= 34217136;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var207 = new UnsupportedOperationException();
                throw var207;
            }
        }

        UnsupportedOperationException var206 = new UnsupportedOperationException();
        throw var206;
    }

    @Override
    public void u(jX var1) {
        int var2 = LP;
        var2 ^= -1833228995;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            var2 ^= -1863931852;
            var2 ^= 456907797;
            var2 &= -1442582937;
            var2 ^= -146391403;
            long var36 = var2;
            long var46 = var36 + 1L;
            long var47 = var36 * var46;
            long var7 = var36 + 2L;
            long var48 = var47 * var7;
            long var37 = var36 + 3L;
            long var49 = var48 * var37;
            long var38 = var49 & 7L;
            long var50;
            var3 = (var50 = var38 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var40 = new IllegalStateException();
                throw var40;
            }
        } else {
            var2 = switch (var2) {
                default -> var2 ^ 1242179429;
                case -341289067 -> var2 ^ -1153635677;
                case 2110269412 -> {
                    var2 += -1556924621;
                    var2 -= -629050023;
                    yield var2 ^ 1876638204;
                }
            };
            Object var31 = var2;
            label37:
            if (var31 != null) {
                this.Fr = -1;
                this.IG = -1;
                var31 = var1.Q;
                if (var31 == this) {
                    var2 = switch (var2) {
                        case 100088632 -> var2 ^ -122791005;
                        default -> var2 ^ 1275851797;
                        case 698536002 -> {
                            var2 |= -973655989;
                            var2 += -1489776576;
                            var2 -= -1118252442;
                            yield var2 ^ 156708536;
                        }
                    };
                    long var33 = var2;
                    long var44 = var33 + 1L;
                    long var45 = var33 * var44;
                    long var34 = var45 & 1L;
                    long var51;
                    int var35 = (var51 = var34 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
                    if (var35 != 0) {
                        break label37;
                    }

                    var1.Q = null;
                    var2 &= -453078032;
                    var2 += 1282267598;
                    var2 |= -1218090566;
                    var2 ^= -2063055949;
                    var2 ^= -279233753;
                } else {
                    var2 *= 871802227;
                    var2 ^= 879629516;
                }

                return;
            }
        }

        UnsupportedOperationException var28 = new UnsupportedOperationException();
        throw var28;
    }

    @Override
    public void zx(boolean var1) {
        int var2 = LP;
        var2 ^= -531956251;
        int var3 = System.identityHashCode(this);
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var7 = var19 + 2L;
        var5 *= var7;
        long var20 = var19 + 3L;
        var5 *= var20;
        long var21 = var5 & 7L;
        long var31;
        var3 = (var31 = var21 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 ^= 300447476;
            var2 ^= 1194103107;
            long var23 = var2;
            var5 = var23 + 1L;
            var5 = var23 * var5;
            long var24 = var5 & 1L;
            long var32;
            var3 = (var32 = var24 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var3 == 0) {
                this.tS = var1;
                return;
            }
        } else {
            var2 ^= 1558032805;
            var2 |= -361492762;
            var2 -= -1691039650;
            var2 ^= -2015241413;
            Integer var16 = var2;
            if (var16 != null) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 578537515;
        int var2 = XR.Mz;
        int var4 = of_2.xF(var3, var1, var2);
        LP = var4;
        String[] var5 = new String[]{"Mirror: Off", "Mirror: Sides", "Mirror: Quad", "Mirror: Star"};
        O = var5;
    }
}
