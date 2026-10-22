package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum qS implements oF {
    VELOCITY("Velocity Based"),
    FRAME_BLENDING("Frame Blending"),
    HYBRID("Hybrid Blending"),
    ACCUMULATION_MAX("Accumulation MAX"),
    ACCUMULATION_MIX("Accumulation MIX");

    private final String gX;
    public static final int tH;

    private qS(String var3) {
        this.gX = var3;
    }

    @Override
    public String displayName() {
        int var1 = tH;
        var1 ^= -399065632;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var35;
        var2 = (var35 = var21 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= 224993199;
            var1 ^= 1434037150;
            long var23 = var1;
            var4 = var23 + 1L;
            var4 = var23 * var4;
            var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var36;
            var2 = (var36 = var25 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.gX;
            }
        } else {
            var1 += -1329271899;
            var1 += 64523008;
            var1 &= 348626984;
            var1 ^= 422170185;
            var1 ^= 173596885;
            Integer var16 = var1;
            if (var16 != null) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public boolean velocity() {
        label62: {
            int var1 = tH;
            var1 ^= -1250191080;
            int var2 = System.identityHashCode(this);
            Integer var3 = var2;
            int var4 = of_2.sS;
            var1 ^= var4;
            var1 ^= -1964026;
            of_2.sS = -1964026;
            var4 = of_2.Ll;
            var1 ^= var4;
            var1 ^= -415344531;
            of_2.Ll = -415344531;
            if (var3 == null) {
                var1 += -588224650;
                var1 ^= -152621255;
            } else {
                label67: {
                    var1 = switch (var1) {
                        case -2002320880 -> var1 ^ 458290956;
                        default -> var1 ^ 496551653;
                        case 1825307767 -> {
                            var1 += 206985753;
                            var1 &= 1784177567;
                            yield var1 ^ -1881303354;
                        }
                    };
                    qS var49 = VELOCITY;
                    if (this != var49) {
                        var1 |= 905848251;
                        var1 |= -873614208;
                        var1 -= -965959597;
                        var1 += -1041146009;
                        var1 ^= 143047587;
                        qS var50 = HYBRID;
                        long var54 = var2;
                        long var6 = var54 + 1L;
                        var6 = var54 * var6;
                        long var55 = var6 & 1L;
                        long var57;
                        var2 = (var57 = var55 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            var1 ^= 1557842570;
                            var1 ^= 1203819142;
                            var1 *= -373012397;
                            var1 *= -707164931;
                            var1 ^= 675761136;
                            break label67;
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -483760495;
                            case -217968976 -> {
                                var1 -= -122552292;
                                var1 |= -688122234;
                                var1 &= -393757069;
                                yield var1 ^ -133289315;
                            }
                            case 1873406087 -> var1 ^ 1793069028;
                        };
                        if (this != var50) {
                            var1 >>= 20;
                            var1 *= -1900271019;
                            var1 &= -723858360;
                            var1 <<= 7;
                            var1 ^= -1032229741;
                            Integer var46 = var1;
                            if (var46 != null) {
                                boolean var47 = false;
                                var1 *= 1805260559;
                                var1 ^= 516867562;
                                return var47;
                            }
                            break label62;
                        }

                        var1 |= -565395193;
                        var1 ^= 1211685391;
                    } else {
                        switch (var1) {
                            case -404892586:
                                var1 -= -2126532171;
                                var1 ^= -261616351;
                                break;
                            case 208250010:
                                var1 ^= 77595956;
                                break;
                            case 824418063:
                            default:
                                var1 ^= 178822185;
                        }
                    }

                    var3 = var1;
                    if (var3 != null) {
                        boolean var58 = true;
                        var1 <<= 23;
                        var1 ^= 182524725;
                        var1 ^= -2006873278;
                        return var58;
                    }
                    break label62;
                }
            }

            AssertionError var48 = new AssertionError();
            throw var48;
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    public boolean blendsFrames() {
        boolean var54 = false;
        label86: {
            int var1 = tH;
            var1 ^= -1735588294;
            int var2 = System.identityHashCode(this);
            qS var3 = FRAME_BLENDING;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var92;
            int var71 = (var92 = var4 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
            if (var71 != 0) {
                var1 *= 1612410425;
                var1 *= 541122427;
                var1 *= 1367514845;
                var1 |= 2040496701;
                var1 ^= 1348748714;
            } else {
                label91: {
                    var1 ^= -1077323850;
                    var1 >>>= 24;
                    var1 *= -1964273511;
                    var1 ^= -1143559609;
                    int var72 = var1 + 1;
                    int var73 = var1 * var72;
                    int var74 = var73 & 1;
                    if (var74 != 0) {
                        break label86;
                    }

                    label83: {
                        if (this != var3) {
                            var1 |= 451409049;
                            var1 += 1214348783;
                            var1 ^= 1915559492;
                            var1 |= 1339844083;
                            var1 ^= 1629982399;
                            long var57 = var1;
                            long var5 = var57 + 1L;
                            var5 = var57 * var5;
                            long var7 = var57 + 2L;
                            var5 *= var7;
                            long var58 = var57 + 3L;
                            var5 *= var58;
                            long var59 = var5 & 7L;
                            long var93;
                            int var60 = (var93 = var59 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                            if (var60 != 0) {
                                break label86;
                            }

                            var3 = HYBRID;
                            var4 = var2;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var94;
                            var2 = (var94 = var4 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                switch (var1) {
                                    case -1629754560:
                                        var1 *= -961408691;
                                        var1 ^= 1488905301;
                                        break label91;
                                    case 85269027:
                                    default:
                                        var1 ^= -965170367;
                                        break label91;
                                    case 1974712597:
                                        var1 ^= -201566853;
                                        break label91;
                                }
                            }
                            var1 = switch (var1) {
                                case -1629754560 -> {
                                    var1 *= -2022526969;
                                    var1 += -671508262;
                                    var1 ^= -1003075319;
                                    yield var1 ^ -2063902759;
                                }
                                case 263978697 -> var1 ^ 858033297;
                                default -> var1 ^ 181267493;
                            };
                            var2 = var1 + 1;
                            var2 = var1 * var2;
                            var2 &= 1;
                            if (var2 != 0) {
                                break label86;
                            }

                            if (this != var3) {
                                var1 += -252793817;
                                var1 -= 871649132;
                                var1 ^= -1003957712;
                                Integer var53 = var1;
                                if (var53 == null) {
                                    break label86;
                                }

                                var54 = false;
                                var1 &= 448456976;
                                var1 &= -1923186120;
                                var1 |= -277431714;
                                var1 |= -1305795947;
                                var1 ^= -1711404200;
                                break label83;
                            }

                            var1 *= 125822617;
                            var1 ^= 1480933275;
                        } else {
                            var1 |= -1449961406;
                            var1 += 1947295267;
                            var1 &= 732748146;
                            var1 |= -360843733;
                            var1 ^= -999728694;
                        }

                        long var62 = var1;
                        long var83 = var62 + 1L;
                        var83 = var62 * var83;
                        long var63 = var83 & 1L;
                        long var95;
                        int var64 = (var95 = var63 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                        if (var64 != 0) {
                            break label86;
                        }

                        var54 = true;
                        switch (var1) {
                            case -1142440357:
                            default:
                                var1 ^= -234191760;
                                break;
                            case 773105313:
                                var1 *= 110854247;
                                var1 += -722051916;
                                var1 ^= 982603516;
                                break;
                            case 2068917991:
                                var1 ^= 170186082;
                        }
                    }

                    int var65 = var1 + 1;
                    int var66 = var1 * var65;
                    int var77 = var1 + 2;
                    int var67 = var66 * var77;
                    var1 += 3;
                    int var68 = var67 * var1;
                    var1 = var68 & 7;
                    if (var1 == 0) {
                        return var54;
                    }
                    break label86;
                }
            }

            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var96;
            var2 = (var96 = var4 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var56 = new AssertionError();
                throw var56;
            }
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    public boolean accumulates() {
        boolean var52 = false;
        int var1 = tH;
        var1 ^= 789656373;
        int var2 = System.identityHashCode(this);
        qS var3 = ACCUMULATION_MAX;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var77;
        int var67 = (var77 = var4 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
        if (var67 != 0) {
            var1 &= -182495164;
            var1 *= -1811528871;
            var1 >>>= 12;
            var1 ^= -961038491;
        } else {
            label84: {
                var1 |= 1716852633;
                var1 ^= 906260568;
                var1 *= -687565385;
                var1 ^= 1138295392;
                Integer var68 = var1;
                label65:
                if (var68 != null) {
                    label79: {
                        if (this != var3) {
                            var1 = switch (var1) {
                                case -1464369211 -> {
                                    var1 |= -331208347;
                                    var1 ^= 257685430;
                                    var1 ^= 1192690898;
                                    var1 |= -1488633193;
                                    yield var1 ^ 1251701286;
                                }
                                case -414324246 -> var1 ^ 2069636004;
                                default -> var1 ^ 2140584121;
                            };
                            Integer var54 = var1;
                            if (var54 == null) {
                                break label65;
                            }

                            var3 = ACCUMULATION_MIX;
                            Integer var50 = var2;
                            if (var50 == null) {
                                switch (var1) {
                                    case -1210236187:
                                        var1 ^= 1402792005;
                                        break label84;
                                    case -680540670:
                                    default:
                                        var1 ^= 185259068;
                                        break label84;
                                    case -312165199:
                                        var1 >>>= 14;
                                        var1 >>>= 19;
                                        var1 ^= -961058753;
                                        break label84;
                                }
                            }

                            var1 &= -2046306263;
                            var1 *= 286819331;
                            var1 ^= -1604218663;
                            var50 = var1;
                            if (var50 == null) {
                                break label65;
                            }

                            if (this != var3) {
                                var1 = switch (var1) {
                                    default -> var1 ^ 986700619;
                                    case -17343302 -> {
                                        var1 += -496406114;
                                        var1 <<= 20;
                                        yield var1 ^ 1042917395;
                                    }
                                    case 416485737 -> var1 ^ -1731426090;
                                };
                                var52 = false;
                                switch (var1) {
                                    case -1601536510:
                                        var1 ^= -1030046223;
                                        break label79;
                                    case -609638381:
                                        var1 |= -150459103;
                                        var1 &= -957970015;
                                        var1 ^= -2014741480;
                                        break label79;
                                    case 679582323:
                                    default:
                                        var1 ^= -1138026661;
                                        break label79;
                                }
                            }

                            var1 ^= -339731397;
                            var1 &= -281437260;
                            var1 += -125110617;
                            var1 |= -884698595;
                            var1 ^= -1565133707;
                        } else {
                            var1 += 783679963;
                            var1 ^= 1847983331;
                            var1 ^= -469598711;
                        }

                        int var56 = var1 + 1;
                        int var57 = var1 * var56;
                        int var69 = var1 + 2;
                        int var58 = var57 * var69;
                        int var70 = var1 + 3;
                        int var59 = var58 * var70;
                        int var60 = var59 & 7;
                        if (var60 != 0) {
                            break label65;
                        }

                        var52 = true;
                        var1 >>= 14;
                        var1 *= 897436837;
                        var1 |= 822904980;
                        var1 += 940327061;
                        var1 ^= -1365189048;
                    }

                    long var61 = var1;
                    long var5 = var61 + 1L;
                    var5 = var61 * var5;
                    long var7 = var61 + 2L;
                    var5 *= var7;
                    long var62 = var61 + 3L;
                    var5 *= var62;
                    long var63 = var5 & 7L;
                    long var78;
                    int var64 = (var78 = var63 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var64 == 0) {
                        return var52;
                    }
                }

                UnsupportedOperationException var53 = new UnsupportedOperationException();
                throw var53;
            }
        }

        RuntimeException var49 = new RuntimeException();
        throw var49;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2137752717;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        tH = var4;
    }
}
