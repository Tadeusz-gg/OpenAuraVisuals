package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class TP {
    public static final float kH = (float) Math.PI;
    public static final float cp = (float) (Math.PI * 2);
    public static final float J = (float) (Math.PI / 180.0);
    public static final int Nb;

    private TP() {
    }

    public static float t(float var0, float var1, float var2) {
        label68: {
            int var3 = Nb;
            var3 ^= 471486729;
            int var4 = (int)var0;
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var6 = of_2.qG;
            var3 ^= var6;
            var3 ^= 1220043223;
            var6 = of_2.h;
            var3 ^= var6;
            var3 ^= -685055834;
            if (var5 == 0) {
                var3 <<= 14;
                var3 ^= -647181374;
                var5 = var3 + 1;
                var5 = var3 * var5;
                var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label68;
                }

                float var70;
                var5 = (var70 = var0 - var1) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                if (var5 < 0) {
                    var3 = switch (var3) {
                        default -> var3 ^ 1908236791;
                        case -1100346430 -> {
                            var3 >>>= 24;
                            var3 ^= 296248212;
                            var3 -= 1351388665;
                            yield var3 ^ -1788688673;
                        }
                        case 453154239 -> var3 ^ -1032117976;
                    } + 1843957698;
                    var3 -= -1728118555;
                    var3 |= 1323284187;
                    var3 ^= 2036976898;
                    return var1;
                }

                var3 >>>= 30;
                var3 &= -1595810011;
                var3 ^= 458640179;
                float var71;
                var6 = (var71 = var0 - var2) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
                Integer var53 = var4;
                if (var53 != null) {
                    var3 *= 2047559401;
                    var3 &= 1505329221;
                    var3 |= -872632346;
                    var3 *= -1050596031;
                    var3 ^= -628315663;
                    float var65;
                    if (var6 > 0) {
                        var3 = switch (var3) {
                            case -363795114 -> {
                                var3 += 1528782055;
                                var3 |= 1287538541;
                                yield var3 ^ -337578585;
                            }
                            default -> var3 ^ -1809877082;
                            case 1409219101 -> var3 ^ -1520065971;
                        };
                        var65 = var2;
                        switch (var3) {
                            case -1507935526:
                                var3 |= 1489514220;
                                var3 += -615845246;
                                var3 *= -375165129;
                                var3 -= 441312761;
                                var3 ^= 1267451742;
                                return var2;
                            case 536198705:
                            default:
                                var3 ^= -650195950;
                                return var2;
                            case 860667354:
                                var3 ^= 1685500953;
                        }
                    } else {
                        var3 &= 1386150938;
                        var3 ^= 631818021;
                        var53 = var3;
                        if (var53 == null) {
                            break label68;
                        }

                        var65 = var0;
                        var3 += -1049888860;
                        var3 ^= 1068652802;
                    }

                    return var65;
                }

                switch (var3) {
                    case -1691841528:
                        var3 ^= 1291910975;
                        break;
                    case -896695431:
                    default:
                        var3 ^= 796207320;
                        break;
                    case 458640179:
                        var3 |= 1549814282;
                        var3 *= -29915371;
                        var3 ^= -1270694903;
                }
            } else {
                switch (var3) {
                    case -231203298:
                        var3 ^= 964187079;
                        break;
                    case 543267867:
                        var3 *= -169976153;
                        var3 &= -726592679;
                        var3 |= 1401459578;
                        var3 ^= 166160293;
                        break;
                    case 1753055394:
                    default:
                        var3 ^= 2088909587;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 == 0) {
                RuntimeException var52 = new RuntimeException();
                throw var52;
            }
        }

        UnsupportedOperationException var51 = new UnsupportedOperationException();
        throw var51;
    }

    public static double pp(double var0, double var2, double var4) {
        label76: {
            int var37;
            double var62;
            label75: {
                var37 = Nb;
                var37 ^= -1911710414;
                int var7 = (int)var0;
                double var80;
                int var8 = (var80 = var0 - var2) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                int var9 = var7 + 1;
                var9 = var7 * var9;
                var9 &= 1;
                if (var9 == 0) {
                    var37 -= 266443498;
                    var37 |= -951561911;
                    var37 ^= 173927923;
                    var9 = var37 + 1;
                    var9 = var37 * var9;
                    int var10 = var37 + 2;
                    var9 *= var10;
                    var10 = var37 + 3;
                    var9 *= var10;
                    var9 &= 7;
                    if (var9 != 0) {
                        break label76;
                    }

                    if (var8 < 0) {
                        var37 *= 293999017;
                        var37 &= -984284422;
                        var37 |= -1962267676;
                        var37 ^= 873839665;
                        Integer var63 = var37;
                        if (var63 == null) {
                            break label76;
                        }

                        var62 = var2;
                        var37 &= 2038275844;
                        var37 ^= 1847846275;
                        break label75;
                    }
                    var37 = switch (var37) {
                        default -> var37 ^ 1429767524;
                        case -310306676 -> {
                            var37 += 1753045776;
                            var37 |= 1454234908;
                            var37 >>>= 8;
                            var37 *= -942143677;
                            yield var37 ^ 2062987856;
                        }
                        case 893477646 -> var37 ^ -1209554032;
                    };
                    double var81;
                    var10 = (var81 = var0 - var4) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
                    int var11 = var7 + 1;
                    var11 = var7 * var11;
                    int var12 = var7 + 2;
                    var11 *= var12;
                    var7 += 3;
                    var11 *= var7;
                    var7 = var11 & 7;
                    if (var7 == 0) {
                        var37 = switch (var37) {
                            case -2110273282 -> var37 ^ 201688700;
                            case -841397523 -> {
                                var37 <<= 3;
                                yield var37 ^ -539308230;
                            }
                            default -> var37 ^ -610161233;
                        };
                        var7 = var37 + 1;
                        var7 = var37 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label76;
                        }

                        if (var10 > 0) {
                            var37 = switch (var37) {
                                case -1324312494 -> {
                                    var37 >>>= 13;
                                    var37 |= -39200143;
                                    var37 -= 368374915;
                                    var37 += -274023735;
                                    yield var37 ^ 1789223322;
                                }
                                default -> var37 ^ -494023961;
                                case 1306237016 -> var37 ^ 1906151042;
                            };
                            Integer var60 = var37;
                            if (var60 == null) {
                                break label76;
                            }

                            var62 = var4;
                            var37 += -1062757097;
                            var37 += 1204522667;
                            var37 ^= 1438574861;
                            var37 <<= 28;
                            var37 ^= -1220644217;
                        } else {
                            var37 &= -1879338673;
                            var37 &= 1822231896;
                            var37 >>>= 5;
                            var37 ^= -1789174164;
                            var62 = var0;
                            var37 ^= 1706144830;
                            var37 ^= -1479272233;
                        }
                        break label75;
                    }

                    var37 >>>= 29;
                    var37 ^= 822322842;
                    var37 ^= 1630611497;
                } else {
                    switch (var37) {
                        case -2084100505:
                            var37 ^= -1461649565;
                            break;
                        case -1300869088:
                            var37 -= 2143151308;
                            var37 &= -141082917;
                            var37 >>= 17;
                            var37 |= 1120558212;
                            var37 ^= 318296953;
                            break;
                        case 789506290:
                        default:
                            var37 ^= 828520899;
                    }
                }

                Integer var52 = var37;
                if (var52 != null) {
                    AssertionError var54 = new AssertionError();
                    throw var54;
                }
                break label76;
            }

            long var73 = var37;
            long var78 = var73 + 1L;
            var78 = var73 * var78;
            var73 = var78 & 1L;
            long var82;
            int var61 = (var82 = var73 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
            if (var61 == 0) {
                return var62;
            }
        }

        IllegalStateException var53 = new IllegalStateException();
        throw var53;
    }

    public static int B(int var0, int var1, int var2) {
        int var3 = Nb;
        var3 ^= -359235391;
        Integer var5 = var0;
        if (var5 != null) {
            var3 = switch (var3) {
                default -> var3 ^ 171350327;
                case -689091117 -> {
                    var3 *= -1578339443;
                    var3 >>>= 21;
                    var3 += 1413494781;
                    yield var3 ^ -66258677;
                }
                case 157805646 -> var3 ^ 58009514;
            };
            var5 = var0;
            label59:
            if (var5 != null) {
                int var55;
                if (var0 < var1) {
                    var3 ^= 1121879282;
                    var3 ^= -2094802402;
                    var3 *= -976193377;
                    var3 ^= 592344228;
                    Integer var54 = var0;
                    if (var54 == null) {
                        break label59;
                    }

                    var55 = var1;
                    switch (var3) {
                        case -1215600889:
                            var3 ^= 578841215;
                            break;
                        case -1185318333:
                            var3 -= -1280050637;
                            var3 += -2019417879;
                            var3 += 1511301348;
                            var3 -= 1150299645;
                            var3 ^= 1711941970;
                            break;
                        case 1320232372:
                        default:
                            var3 ^= 398807149;
                    }
                } else {
                    var3 |= -820760845;
                    var3 += 1525702585;
                    var3 ^= -2041854884;
                    long var6 = var0;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var77;
                    int var62 = (var77 = var6 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                    if (var62 != 0) {
                        break label59;
                    }

                    if (var0 > var2) {
                        var3 += 890336712;
                        var3 |= 410347718;
                        var3 |= -834868742;
                        var3 ^= 2116248275;
                        Integer var63 = var0;
                        if (var63 == null) {
                            break label59;
                        }

                        var55 = var2;
                        var3 >>>= 23;
                        var3 += 37254109;
                        var3 |= -206293044;
                        var3 <<= 22;
                        var3 ^= 856046258;
                    } else {
                        var3 ^= -1215341938;
                        var3 ^= 2037160703;
                        Integer var64 = var0;
                        if (var64 == null) {
                            break label59;
                        }

                        var55 = var0;
                        var3 += 2103874147;
                        var3 >>>= 10;
                        var3 ^= -991549371;
                    }
                }

                long var65 = var0;
                long var72 = var65 + 1L;
                var72 = var65 * var72;
                long var76 = var65 + 2L;
                var72 *= var76;
                var65 += 3L;
                var72 *= var65;
                var65 = var72 & 7L;
                long var78;
                int var68 = (var78 = var65 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                if (var68 == 0) {
                    return var55;
                }
            }
        } else {
            var3 ^= 515338178;
            var3 ^= -353431602;
            long var47 = var0;
            long var56 = var47 + 1L;
            long var57 = var47 * var56;
            long var7 = var47 + 2L;
            long var58 = var57 * var7;
            long var48 = var47 + 3L;
            long var59 = var58 * var48;
            long var49 = var59 & 7L;
            long var79;
            var3 = (var79 = var49 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var52 = new IllegalArgumentException();
                throw var52;
            }
        }

        UnsupportedOperationException var51 = new UnsupportedOperationException();
        throw var51;
    }

    public static float S(float var0) {
        int var1 = Nb;
        var1 ^= 2034365287;
        int var2 = (int)var0;
        Integer var20 = var2;
        int var3 = of_2.qG;
        var1 ^= var3;
        var1 ^= 1220043223;
        of_2.qG = 1220043223;
        var3 = of_2.h;
        var1 ^= var3;
        var1 ^= -685055834;
        of_2.h = -685055834;
        if (var20 != null) {
            var1 &= 267204439;
            var1 ^= -1853276285;
            var1 -= -311102152;
            var1 ^= 1915210041;
            var20 = var1;
            if (var20 != null) {
                return t(var0, 0.0F, 1.0F);
            }
        } else {
            var1 *= 828931881;
            var1 *= 1841180177;
            var1 ^= -2075587425;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            var3 = var1 + 2;
            var22 *= var3;
            var1 += 3;
            var22 *= var1;
            var1 = var22 & 7;
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    public static float GO(float var0, float var1, float var2) {
        int var3 = Nb;
        var3 ^= 172505876;
        int var4 = (int)var0;
        float var5 = var1 - var0;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var35;
        var4 = (var35 = var6 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var4 != 0) {
            var3 ^= -60649435;
            var3 ^= 1553334640;
            var4 = var3 + 1;
            var4 = var3 * var4;
            int var30 = var3 + 2;
            var4 *= var30;
            int var31 = var3 + 3;
            var4 *= var31;
            var4 &= 7;
            if (var4 != 0) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            } else {
                RuntimeException var26 = new RuntimeException();
                throw var26;
            }
        } else {
            var3 ^= -1859210149;
            var3 >>>= 15;
            var3 &= -1990594436;
            var3 ^= 1435175408;
            float var17 = var5 * var2;
            return var0 + var17;
        }
    }

    public static double y(double var0, double var2, double var4) {
        int var6 = Nb;
        var6 ^= 496949952;
        int var7 = (int)var0;
        double var8 = var2 - var0;
        var8 *= var4;
        Integer var24 = var7;
        if (var24 == null) {
            var6 &= 1474783803;
            var6 >>= 27;
            var6 *= 1870668713;
            var6 >>>= 14;
            var6 ^= -225952157;
            var24 = var6;
            if (var24 != null) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            }
        } else {
            var6 >>= 3;
            var6 ^= 1782137022;
            long var20 = var6;
            long var10 = var20 + 1L;
            var10 = var20 * var10;
            long var21 = var10 & 1L;
            long var29;
            var6 = (var29 = var21 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var6 == 0) {
                return var0 + var8;
            }
        }

        AssertionError var23 = new AssertionError();
        throw var23;
    }

    public static float q(float var0, float var1, float var2) {
        label53: {
            int var3 = Nb;
            var3 ^= 1975504498;
            int var4 = (int)var0;
            int var5 = var4 + 1;
            var5 = var4 * var5;
            int var6 = var4 + 2;
            var5 *= var6;
            var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                var3 >>>= 4;
                var3 += -516604779;
                var3 ^= -1915533807;
            } else {
                var3 = switch (var3) {
                    default -> var3 ^ 1676212096;
                    case 1098197193 -> var3 ^ 2134238311;
                    case 1237582688 -> {
                        var3 |= 338645369;
                        var3 &= 313954522;
                        yield var3 ^ -1474409733;
                    }
                };
                long var50 = var3;
                long var7 = var50 + 1L;
                var7 = var50 * var7;
                long var9 = var50 + 2L;
                var7 *= var9;
                long var51 = var50 + 3L;
                var7 *= var51;
                long var52 = var7 & 7L;
                long var69;
                var5 = (var69 = var52 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label53;
                }

                float var70;
                var5 = (var70 = var0 - var1) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                if (var5 == 0) {
                    var3 ^= -21864953;
                    var3 >>>= 20;
                    var3 &= -325567006;
                    var3 ^= 248075066;
                    float var55 = 0.0F;
                    var3 ^= 1201727875;
                    var3 -= -1381631329;
                    var3 <<= 3;
                    var3 += -1795296349;
                    var3 ^= -225135821;
                    return var55;
                }
                var3 = switch (var3) {
                    default -> var3 ^ 881529736;
                    case -1195877725 -> {
                        var3 |= 850910389;
                        var3 -= -874948617;
                        yield var3 ^ -69132211;
                    }
                    case 1057906035 -> var3 ^ 890360074;
                };
                float var57 = var2 - var0;
                Integer var40 = var4;
                if (var40 != null) {
                    var3 &= 1976357938;
                    var3 ^= 552610129;
                    var7 = var3;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var71;
                    int var43 = (var71 = var7 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                    if (var43 != 0) {
                        break label53;
                    }

                    float var44 = var1 - var0;
                    float var45 = var57 / var44;
                    var3 += -453956558;
                    var3 |= 2072035443;
                    var3 ^= -93487181;
                    return var45;
                }

                switch (var3) {
                    case -1538283000:
                    default:
                        var3 ^= -589747360;
                        break;
                    case 352822925:
                        var3 >>>= 2;
                        var3 |= -79772272;
                        var3 &= 1538987606;
                        var3 *= 1960855539;
                        var3 ^= -957881908;
                        break;
                    case 1340607594:
                        var3 ^= -213954771;
                }
            }

            long var61 = var3;
            long var65 = var61 + 1L;
            var65 = var61 * var65;
            var61 = var65 & 1L;
            long var72;
            var4 = (var72 = var61 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var42 = new IllegalStateException();
                throw var42;
            }
        }

        IllegalStateException var39 = new IllegalStateException();
        throw var39;
    }

    public static float j(float var0, float var1, float var2, float var3, float var4) {
        int var5 = Nb;
        var5 ^= 6767939;
        int var6 = (int)var0;
        long var25 = var6;
        long var8 = var25 + 1L;
        var8 = var25 * var8;
        long var26 = var8 & 1L;
        long var33;
        var6 = (var33 = var26 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var6 == 0) {
            var5 <<= 4;
            var5 ^= -1146617363;
            float var28 = q(var1, var2, var0);
            return GO(var3, var4, var28);
        } else {
            var5 |= -81526345;
            var5 -= -1035657611;
            var5 &= 526169846;
            var5 &= 599535623;
            var5 ^= 916930736;
            long var17 = var5;
            long var7 = var17 + 1L;
            var7 = var17 * var7;
            long var9 = var17 + 2L;
            var7 *= var9;
            long var18 = var17 + 3L;
            var7 *= var18;
            long var19 = var7 & 7L;
            long var34;
            var5 = (var34 = var19 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var5 != 0) {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        }
    }

    public static float hd(float var0, float var1, float var2, float var3, float var4) {
        int var5 = Nb;
        var5 ^= 780686050;
        int var6 = (int)var0;
        float var7 = q(var1, var2, var0);
        int var8 = var6 + 1;
        var8 = var6 * var8;
        int var9 = var6 + 2;
        var8 *= var9;
        var6 += 3;
        var8 *= var6;
        var6 = var8 & 7;
        if (var6 == 0) {
            var5 >>>= 17;
            var5 += -266515704;
            var5 *= 1026193819;
            var5 |= -1262324907;
            var5 ^= 1731054449;
            var6 = var5 + 1;
            var6 = var5 * var6;
            var8 = var5 + 2;
            var6 *= var8;
            var8 = var5 + 3;
            var6 *= var8;
            var6 &= 7;
            if (var6 == 0) {
                float var32 = S(var7);
                return GO(var3, var4, var32);
            }
        } else {
            var5 -= 81943593;
            var5 += -2043858601;
            var5 ^= -1525651630;
            var5 ^= 1224992077;
            long var20 = var5;
            long var33 = var20 + 1L;
            long var34 = var20 * var33;
            long var21 = var34 & 1L;
            long var40;
            var5 = (var40 = var21 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var5 == 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        }

        IllegalStateException var23 = new IllegalStateException();
        throw var23;
    }

    public static float N(float var0, float var1, float var2) {
        int var3 = Nb;
        var3 ^= -211493001;
        int var4 = (int)var0;
        float var5 = q(var0, var1, var2);
        var5 = S(var5);
        float var6 = var5 * var5;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        var4 = var7 & 1;
        if (var4 == 0) {
            var3 &= 1742104372;
            var3 |= -1083539386;
            var3 -= 585291119;
            var3 ^= 1738407677;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var7 = var3 + 2;
            var4 *= var7;
            var7 = var3 + 3;
            var4 *= var7;
            var4 &= 7;
            if (var4 == 0) {
                float var24 = 2.0F * var5;
                float var25 = 3.0F - var24;
                return var6 * var25;
            }
        } else {
            var3 |= -1764792916;
            var3 ^= 279651763;
            Integer var15 = var3;
            if (var15 != null) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    public static float up(float var0, float var1, float var2, float var3) {
        int var4 = Nb;
        var4 ^= -283080385;
        int var5 = (int)var0;
        float var6 = var0 - var1;
        float var7 = -var2;
        var7 *= var3;
        double var27 = var7;
        double var28 = Math.exp(var27);
        var7 = (float)var28;
        int var8 = var5 + 1;
        var8 = var5 * var8;
        var5 = var8 & 1;
        if (var5 != 0) {
            var4 ^= 1347740659;
            var4 += 1947196589;
            var4 ^= -52650037;
            var4 ^= -1515664709;
            var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            if (var5 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        } else {
            var4 &= 1233474128;
            var4 *= 1866408723;
            var4 |= -464008378;
            var4 ^= 779118308;
            Integer var18 = var4;
            if (var18 != null) {
                float var20 = var6 * var7;
                return var1 + var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    public static float h(float var0, float var1, float var2) {
        label44: {
            int var3 = Nb;
            var3 ^= -157806977;
            int var4 = (int)var0;
            float var5 = var1 - var0;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var74;
            int var44 = (var74 = var6 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
            if (var44 != 0) {
                switch (var3) {
                    case -1378024583:
                    default:
                        var3 ^= -287475356;
                        break;
                    case -891042963:
                        var3 >>>= 24;
                        var3 += 1313519187;
                        var3 += 752473762;
                        var3 ^= -1093671831;
                        break;
                    case 412762221:
                        var3 ^= -1915223543;
                }
            } else {
                var3 ^= -1413715036;
                var3 += 830842048;
                var3 ^= -1056311824;
                var3 ^= -833023817;
                int var45 = var3 + 1;
                int var46 = var3 * var45;
                int var47 = var46 & 1;
                if (var47 != 0) {
                    break label44;
                }

                float var48 = Math.abs(var5);
                float var75;
                int var49 = (var75 = var48 - var2) == 0.0F ? 0 : (var75 < 0.0F ? -1 : 1);
                if (var49 <= 0) {
                    var3 |= -557322516;
                    var3 ^= 1542222465;
                    var3 ^= 2055960085;
                    var3 ^= 25938169;
                    int var63 = var3 + 1;
                    int var64 = var3 * var63;
                    int var70 = var3 + 2;
                    int var65 = var64 * var70;
                    var70 = var3 + 3;
                    int var66 = var65 * var70;
                    int var67 = var66 & 7;
                    if (var67 == 0) {
                        return var1;
                    }
                    break label44;
                }

                var3 *= 989915905;
                var3 += -1966655659;
                var3 -= -13907695;
                var3 ^= -1561178733;
                int var50 = var3 + 1;
                int var51 = var3 * var50;
                int var7 = var3 + 2;
                int var52 = var51 * var7;
                var7 = var3 + 3;
                int var53 = var52 * var7;
                int var54 = var53 & 7;
                if (var54 != 0) {
                    break label44;
                }

                var5 = Math.copySign(var2, var5);
                int var55 = var4 + 1;
                int var56 = var4 * var55;
                var7 = var4 + 2;
                int var57 = var56 * var7;
                var4 += 3;
                int var58 = var57 * var4;
                var4 = var58 & 7;
                if (var4 == 0) {
                    var3 -= -514860810;
                    var3 ^= -2014974325;
                    long var30 = var3;
                    var6 = var30 + 1L;
                    var6 = var30 * var6;
                    var8 = var30 + 2L;
                    var6 *= var8;
                    long var31 = var30 + 3L;
                    var6 *= var31;
                    long var32 = var6 & 7L;
                    long var76;
                    var3 = (var76 = var32 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return var0 + var5;
                    }
                    break label44;
                }

                var3 >>>= 3;
                var3 >>>= 25;
                var3 ^= -974427686;
            }

            IllegalStateException var41 = new IllegalStateException();
            throw var41;
        }

        IllegalArgumentException var38 = new IllegalArgumentException();
        throw var38;
    }

    public static float jA(float var0) {
        label102: {
            int var1 = Nb;
            var1 ^= -304779095;
            int var2 = (int)var0;
            Integer var3 = var2;
            if (var3 == null) {
                switch (var1) {
                    case -1886247502:
                    default:
                        var1 ^= 1351360338;
                        break;
                    case -777077317:
                        var1 &= -80385515;
                        var1 &= 641418088;
                        var1 *= -1026095927;
                        var1 ^= -2074335176;
                        break;
                    case -280282359:
                        var1 ^= -703826876;
                }
            } else {
                label104: {
                    var1 -= -176034771;
                    var1 += 886497388;
                    var1 ^= 303861745;
                    var1 ^= -452504302;
                    int var85 = var1 + 1;
                    var85 = var1 * var85;
                    var85 &= 1;
                    if (var85 != 0) {
                        break label102;
                    }

                    float var88 = var0 % 360.0F;
                    float var127;
                    int var4 = (var127 = var88 - 180.0F) == 0.0F ? 0 : (var127 < 0.0F ? -1 : 1);
                    float var100;
                    if (var4 >= 0) {
                        var1 <<= 2;
                        var1 ^= 80573905;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label102;
                        }

                        float var99 = var88 - 360.0F;
                        Integer var5 = var2;
                        if (var5 == null) {
                            var1 |= 62234937;
                            var1 &= -529334719;
                            var1 ^= -1655910343;
                            break label104;
                        }
                        var1 = switch (var1) {
                            case -1704150034 -> var1 ^ 1543813720;
                            case -1666393675 -> {
                                var1 += 1153883697;
                                yield var1 ^ 1777757786;
                            }
                            default -> var1 ^ -65694945;
                        };
                        int var102 = var1 + 1;
                        var102 = var1 * var102;
                        int var6 = var1 + 2;
                        var102 *= var6;
                        var6 = var1 + 3;
                        var102 *= var6;
                        var102 &= 7;
                        if (var102 != 0) {
                            break label102;
                        }

                        var100 = var99;
                        var1 *= 666136347;
                        var1 -= -187012185;
                        var1 *= 32804211;
                        var1 *= 1139235083;
                        var1 ^= -1067476020;
                    } else {
                        var1 ^= -1563188867;
                        var1 *= 1618193541;
                        var1 |= 1553774789;
                        var1 ^= -742365851;
                        long var107 = var1;
                        long var7 = var107 + 1L;
                        var7 = var107 * var7;
                        var107 = var7 & 1L;
                        long var128;
                        int var109 = (var128 = var107 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                        if (var109 != 0) {
                            break label102;
                        }

                        var100 = var88;
                        var1 *= -1168257459;
                        var1 |= 1937408891;
                        var1 -= 714708073;
                        var1 -= 103191911;
                        var1 ^= 721665338;
                    }

                    float var129;
                    var85 = (var129 = var100 - -180.0F) == 0.0F ? 0 : (var129 < 0.0F ? -1 : 1);
                    Integer var110 = var2;
                    if (var110 == null) {
                        var1 |= 179828766;
                        var1 *= -497338017;
                        var1 -= 1854588881;
                        var1 ^= 151287304;
                    } else {
                        label106: {
                            var1 |= 891246360;
                            var1 *= -201745433;
                            var1 ^= -1288071354;
                            var1 ^= 366761301;
                            int var111 = var1 + 1;
                            var111 = var1 * var111;
                            int var120 = var1 + 2;
                            var111 *= var120;
                            var120 = var1 + 3;
                            var111 *= var120;
                            var111 &= 7;
                            if (var111 != 0) {
                                break label102;
                            }

                            float var83;
                            if (var85 < 0) {
                                var1 ^= 635495895;
                                var1 >>= 14;
                                var1 -= 3382957;
                                var1 &= 1578326380;
                                var1 ^= -1897520786;
                                float var90 = var100 + 360.0F;
                                long var116 = var2;
                                long var123 = var116 + 1L;
                                var123 = var116 * var123;
                                long var9 = var116 + 2L;
                                var123 *= var9;
                                long var117 = var116 + 3L;
                                var123 *= var117;
                                long var118 = var123 & 7L;
                                long var130;
                                var2 = (var130 = var118 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    switch (var1) {
                                        case -903361897:
                                        default:
                                            var1 ^= 1532213257;
                                            break label106;
                                        case -790206398:
                                            var1 <<= 24;
                                            var1 ^= 1601972280;
                                            break label106;
                                        case 1256529484:
                                            var1 ^= 59541258;
                                            break label106;
                                    }
                                }

                                var1 *= -1855331319;
                                var1 >>= 16;
                                var1 += 1498632420;
                                var1 ^= 945971895;
                                var2 = var1 + 1;
                                var2 = var1 * var2;
                                var2 &= 1;
                                if (var2 != 0) {
                                    break label102;
                                }

                                var83 = var90;
                                var1 ^= -1307287447;
                                var1 |= 459619715;
                                var1 >>= 18;
                                var1 ^= -732432391;
                            } else {
                                var1 = switch (var1) {
                                    default -> var1 ^ -1355263835;
                                    case 181017497 -> var1 ^ -626053970;
                                    case 647646236 -> {
                                        var1 ^= -602742816;
                                        var1 |= -801415692;
                                        var1 ^= 288249423;
                                        var1 ^= 1651471787;
                                        yield var1 ^ 290645786;
                                    }
                                };
                                Integer var91 = var1;
                                if (var91 == null) {
                                    break label102;
                                }

                                var83 = var100;
                                switch (var1) {
                                    case -1733813502:
                                        var1 -= -103698292;
                                        var1 >>>= 13;
                                        var1 ^= 1711847759;
                                        var1 >>>= 23;
                                        var1 ^= 732430828;
                                        break;
                                    case -687146198:
                                        var1 ^= -612380118;
                                        break;
                                    case 1618276934:
                                    default:
                                        var1 ^= -1003555848;
                                }
                            }

                            var85 = var1 + 1;
                            var85 = var1 * var85;
                            var4 = var1 + 2;
                            var85 *= var4;
                            var1 += 3;
                            var85 *= var1;
                            var1 = var85 & 7;
                            if (var1 == 0) {
                                return var83;
                            }
                            break label102;
                        }
                    }
                }
            }

            RuntimeException var84 = new RuntimeException();
            throw var84;
        }

        IllegalStateException var78 = new IllegalStateException();
        throw var78;
    }

    public static float Mm(float var0, float var1) {
        int var2 = Nb;
        var2 ^= 1876181175;
        int var3 = (int)var0;
        float var4 = var1 - var0;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var21;
        var3 = (var21 = var5 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 -= 357808337;
            var2 ^= 734173783;
            IllegalArgumentException var18 = new IllegalArgumentException();
            throw var18;
        } else {
            var2 *= 1223454037;
            var2 ^= -1388941800;
            var2 ^= 1613927032;
            Integer var13 = var2;
            if (var13 == null) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            } else {
                return jA(var4);
            }
        }
    }

    public static boolean o(float var0, float var1, float var2) {
        int var3 = Nb;
        var3 ^= 1045669790;
        int var4 = (int)var0;
        float var5 = var0 - var1;
        var5 = Math.abs(var5);
        float var44;
        int var39 = (var44 = var5 - var2) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
        Integer var32 = var4;
        if (var32 == null) {
            switch (var3) {
                case -730716497:
                default:
                    var3 ^= -552464338;
                    break;
                case 36203148:
                    var3 &= -1200178983;
                    var3 ^= -1143567550;
                    var3 -= 1971643102;
                    var3 ^= 425823253;
                    break;
                case 119032078:
                    var3 ^= -1298056638;
            }

            IllegalArgumentException var31 = new IllegalArgumentException();
            throw var31;
        } else {
            label44: {
                var3 >>= 24;
                var3 |= 397934614;
                var3 ^= -649630061;
                boolean var36;
                if (var39 <= 0) {
                    var3 = switch (var3) {
                        default -> var3 ^ -1147828963;
                        case -822120827 -> {
                            var3 ^= -2056288409;
                            var3 *= -1837293899;
                            var3 ^= -985968785;
                            yield var3 ^ 1444199394;
                        }
                        case 1652710871 -> var3 ^ -295730116;
                    };
                    long var33 = var3;
                    long var6 = var33 + 1L;
                    var6 = var33 * var6;
                    long var34 = var6 & 1L;
                    long var45;
                    int var35 = (var45 = var34 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
                    if (var35 != 0) {
                        break label44;
                    }

                    var36 = true;
                    switch (var3) {
                        case -2098785595:
                        default:
                            var3 ^= 1797045062;
                            break;
                        case -333299578:
                            var3 ^= 605381265;
                            break;
                        case 320351303:
                            var3 ^= 244673812;
                            var3 |= -181193783;
                            var3 ^= -554985702;
                    }
                } else {
                    var3 |= -512429829;
                    var3 ^= -252372628;
                    int var40 = var3 + 1;
                    int var41 = var3 * var40;
                    int var42 = var41 & 1;
                    if (var42 != 0) {
                        break label44;
                    }

                    var36 = false;
                    var3 *= -1374085181;
                    var3 ^= 1575015736;
                }

                return var36;
            }

            AssertionError var37 = new AssertionError();
            throw var37;
        }
    }

    public static int s(float var0) {
        int var1 = Nb;
        var1 ^= 1259260918;
        int var2 = (int)var0;
        int var3 = (int)var0;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var5 = var2 + 3;
        var4 *= var5;
        var4 &= 7;
        if (var4 != 0) {
            var1 *= -160356727;
            var1 *= 1480186347;
            var1 ^= -969643366;
        } else {
            label63: {
                label57: {
                    var1 &= 401668226;
                    var1 += -1435158982;
                    var1 &= -1046269022;
                    var1 ^= 204824936;
                    float var54 = var3;
                    float var67;
                    var4 = (var67 = var0 - var54) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                    if (var4 < 0) {
                        var1 = switch (var1) {
                            case -845917238 -> {
                                var1 += 1253252106;
                                var1 |= -408715585;
                                var1 ^= 1566810591;
                                var1 &= -210652126;
                                yield var1 ^ 1163358542;
                            }
                            case 1547351055 -> var1 ^ 1579069543;
                            default -> var1 ^ 255074187;
                        };
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label57;
                        }

                        var4 = var3 - 1;
                        long var64 = var2;
                        long var7 = var64 + 1L;
                        var7 = var64 * var7;
                        long var65 = var7 & 1L;
                        long var68;
                        var2 = (var68 = var65 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            switch (var1) {
                                case -1885520869:
                                    var1 ^= 1788170864;
                                    break label63;
                                case -1191386861:
                                default:
                                    var1 ^= -1241981197;
                                    break label63;
                                case -413670034:
                                    var1 <<= 31;
                                    var1 ^= -216312303;
                                    var1 -= 867477625;
                                    var1 ^= -2033649490;
                                    break label63;
                            }
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -1897083897;
                            case -413670034 -> {
                                var1 |= -1267501233;
                                var1 ^= -1214393144;
                                yield var1 ^ -859495872;
                            }
                            case 2105533700 -> var1 ^ 526682115;
                        };
                        var2 = var4;
                        var1 += -2037075158;
                        var1 <<= 5;
                        var1 &= -751996651;
                        var1 >>= 6;
                        var1 ^= 641774219;
                    } else {
                        var1 += 919376154;
                        var1 += -511275873;
                        var1 |= 143185534;
                        var1 -= 1968220286;
                        var1 ^= 1505331728;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label57;
                        }

                        var2 = var3;
                        switch (var1) {
                            case -197456781:
                            default:
                                var1 ^= 1148177398;
                                break;
                            case 369092511:
                                var1 ^= 46293613;
                                break;
                            case 556189073:
                                var1 ^= 252055684;
                                var1 >>= 8;
                                var1 ^= 657326814;
                        }
                    }

                    var3 = var1 + 1;
                    var3 = var1 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        return var2;
                    }
                }

                IllegalArgumentException var46 = new IllegalArgumentException();
                throw var46;
            }
        }

        IllegalArgumentException var43 = new IllegalArgumentException();
        throw var43;
    }

    public static int f(int var0) {
        label44: {
            int var1 = Nb;
            var1 ^= 1917913322;
            int var4 = var0 + 1;
            var4 = var0 * var4;
            var4 &= 1;
            if (var4 != 0) {
                var1 >>>= 8;
                var1 |= 1440982222;
                var1 += -586764645;
                var1 -= -1623725219;
                var1 ^= -1959316061;
            } else {
                var1 += 571387351;
                var1 ^= -30671687;
                Integer var39 = var0;
                if (var39 == null) {
                    break label44;
                }

                if (var0 <= 1) {
                    var1 -= 309699664;
                    var1 ^= -1597188215;
                    int var45 = var0 + 1;
                    var45 = var0 * var45;
                    var45 &= 1;
                    if (var45 == 0) {
                        return 1;
                    }
                    break label44;
                }

                var1 -= -2114413795;
                var1 *= 114353673;
                var1 ^= -867315300;
                long var40 = var0;
                long var6 = var40 + 1L;
                var6 = var40 * var6;
                long var41 = var6 & 1L;
                long var49;
                int var42 = (var49 = var41 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var42 != 0) {
                    break label44;
                }

                var42 = var0 - 1;
                var42 = Integer.highestOneBit(var42);
                Integer var3 = var0;
                if (var3 != null) {
                    var1 += 1941025617;
                    var1 >>= 27;
                    var1 += -1944674850;
                    var1 ^= 3176983;
                    var1 ^= 1031225070;
                    int var35 = var0 + 1;
                    var35 = var0 * var35;
                    int var2 = var35 & 1;
                    if (var2 == 0) {
                        return var42 << 1;
                    }
                    break label44;
                }

                switch (var1) {
                    case -1869849411:
                        var1 &= -1470585185;
                        var1 *= -1302211753;
                        var1 -= -1683675516;
                        var1 *= 266593843;
                        var1 ^= 1787211899;
                        break;
                    case -1204182899:
                    default:
                        var1 ^= 1765363486;
                        break;
                    case 1678692637:
                        var1 ^= 305973082;
                }
            }

            IllegalArgumentException var26 = new IllegalArgumentException();
            throw var26;
        }

        IllegalArgumentException var34 = new IllegalArgumentException();
        throw var34;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1026055381;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Nb = var4;
    }
}
