package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class KK {
    public static final int dl = 8;
    public static final int V = 32;
    private final float[] O;
    private final e_2[] TI;
    private final int Cv;
    public static final int vt;

    KK(float[] var1, e_2[] var2, int var3) {
        this.O = var1;
        this.TI = var2;
        this.Cv = var3;
    }

    public int bX() {
        int var1 = vt;
        var1 ^= -460555619;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var22;
        var2 = (var22 = var18 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1827496240:
                default:
                    var1 ^= -2117015289;
                    break;
                case 974961011:
                    var1 ^= -73185737;
                    break;
                case 1594040827:
                    var1 |= 356276399;
                    var1 ^= 476632224;
            }

            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            var1 ^= -1098956008;
            var1 <<= 12;
            var1 += -1663501003;
            var1 ^= 1560542849;
            Integer var11 = var1;
            if (var11 == null) {
                IllegalStateException var12 = new IllegalStateException();
                throw var12;
            } else {
                return this.Cv;
            }
        }
    }

    public float[] j() {
        int var1 = vt;
        var1 ^= -1100065834;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var30;
        var2 = (var30 = var19 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += -642623232;
            var1 &= -1404294845;
            var1 ^= 1639295413;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.O;
            }
        } else {
            Integer var14 = switch (var1) {
                case 98633904 -> {
                    var1 ^= 984456574;
                    yield var1 ^ -1572033172;
                }
                case 1512461384 -> var1 ^ 2103036555;
                default -> var1 ^ -1354135134;
            };
            if (var14 != null) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public e_2 J(int var1) {
        int var2 = vt;
        var2 ^= -922056777;
        int var4 = System.identityHashCode(this);
        e_2[] var5 = this.TI;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var32;
        var4 = (var32 = var6 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var4 == 0) {
            switch (var2) {
                case -1319416482:
                    var2 ^= 1052702705;
                    break;
                case 756900560:
                default:
                    var2 ^= 351648290;
                    break;
                case 1921375441:
                    var2 |= -1516099069;
                    var2 *= 496912755;
                    var2 ^= -525872002;
            }

            var4 = var1 + 1;
            var4 = var1 * var4;
            int var30 = var1 + 2;
            var4 *= var30;
            int var3 = var1 + 3;
            var4 *= var3;
            var3 = var4 & 7;
            if (var3 == 0) {
                return var5[var1];
            } else {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var2 >>= 15;
            var2 -= 2082790297;
            var2 |= 502451948;
            var2 |= -1487153385;
            var2 ^= 740873416;
            UnsupportedOperationException var16 = new UnsupportedOperationException();
            throw var16;
        }
    }

    public static float[] ev(float[][] var0) {
        label64: {
            int var1 = vt;
            var1 ^= -1974648507;
            int var2 = System.identityHashCode(var0);
            float[] var3 = new float[3];
            Integer var4 = var2;
            int var5 = of_2.p;
            var1 ^= var5;
            var1 ^= -1554133772;
            of_2.p = -1554133772;
            var5 = of_2.FR;
            var1 ^= var5;
            var1 ^= 2026243100;
            of_2.FR = 2026243100;
            if (var4 == null) {
                var1 -= -776800458;
                var1 <<= 16;
                var1 &= 395802876;
                var1 &= -1798126818;
                var1 ^= 1650373921;
            } else {
                var1 -= -287246651;
                var1 += -428192511;
                var1 *= 28285777;
                var1 -= 786641994;
                var1 ^= 1138892072;
                long var67 = var1;
                long var6 = var67 + 1L;
                var6 = var67 * var6;
                long var8 = var67 + 2L;
                var6 *= var8;
                long var68 = var67 + 3L;
                var6 *= var68;
                long var69 = var6 & 7L;
                long var99;
                int var70 = (var99 = var69 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                if (var70 != 0) {
                    break label64;
                }

                var3 = var3;
                float[][] var71 = var0;
                var5 = var0.length;
                var5 = var5;
                byte var84 = 0;
                int var85 = var84;
                var1 ^= -928313663;
                var1 &= -234719485;
                var1 >>>= 28;
                var1 &= -987403192;
                var1 ^= 1604379055;

                label61:
                while (true) {
                    Integer var7 = var1;
                    if (var7 == null) {
                        break label64;
                    }

                    if (var85 >= var5) {
                        var1 = switch (var1) {
                            default -> var1 ^ -1609779148;
                            case -1688865818 -> var1 ^ 753411286;
                            case 1604379047 -> {
                                var1 |= 695281114;
                                var1 += -659133184;
                                var1 *= 2018092383;
                                var1 += -268665698;
                                yield var1 ^ -285610445;
                            }
                        };
                        var70 = var1 + 1;
                        var70 = var1 * var70;
                        var70 &= 1;
                        if (var70 != 0) {
                            break label64;
                        }

                        var70 = var0.length;
                        var5 = var2 + 1;
                        var5 = var2 * var5;
                        var2 = var5 & 1;
                        if (var2 == 0) {
                            var1 |= -588994750;
                            var1 <<= 31;
                            var1 -= 548317464;
                            var1 += -755314543;
                            var1 ^= 1319772557;
                            Integer var60 = var1;
                            if (var60 != null) {
                                float var61 = var70;
                                float var62 = 1.0F / var61;
                                u(var3, var62);
                                return var3;
                            }
                            break label64;
                        }

                        var1 &= 1647875101;
                        var1 |= -1985639749;
                        var1 *= 1727943663;
                        var1 -= -706975761;
                        var1 ^= -1732200381;
                        break;
                    }

                    var1 += -2010278577;
                    var1 ^= 641162946;
                    long var86 = var1;
                    long var9 = var86 + 1L;
                    var9 = var86 * var9;
                    long var87 = var9 & 1L;
                    long var100;
                    int var88 = (var100 = var87 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        break label64;
                    }

                    float[] var89 = var71[var85];
                    int var91 = var2 + 1;
                    int var92 = var2 * var91;
                    int var97 = var2 + 2;
                    int var93 = var92 * var97;
                    int var98 = var2 + 3;
                    int var94 = var93 * var98;
                    int var95 = var94 & 7;
                    if (var95 != 0) {
                        switch (var1) {
                            case -1040635852:
                                var1 &= -1609595495;
                                var1 &= -142336457;
                                var1 &= 1413386963;
                                var1 ^= 1658762545;
                                break label61;
                            case 584147351:
                            default:
                                var1 ^= 341889424;
                                break label61;
                            case 880896936:
                                var1 ^= 2081459494;
                                break label61;
                        }
                    }

                    var1 &= 1833705746;
                    var1 -= 91632946;
                    var1 ^= 1658135121;
                    xm(var3, var89);
                    var88 = var85 + 1;
                    var85 = var88;
                    var1 ^= 6826976;
                    var1 &= -1835408560;
                    var1 |= -552230164;
                    var1 ^= -2135096757;
                }
            }

            AssertionError var65 = new AssertionError();
            throw var65;
        }

        AssertionError var63 = new AssertionError();
        throw var63;
    }

    public static float[] UZ(float[] var0, float[] var1) {
        int var2 = vt;
        var2 ^= 1411610503;
        int var3 = System.identityHashCode(var0);
        float[] var4 = new float[3];
        float var5 = var0[0];
        float var6 = var1[0];
        var5 += var6;
        var5 /= 2.0F;
        var4[0] = var5;
        var5 = var0[1];
        var6 = var1[1];
        Integer var22 = var3;
        if (var22 == null) {
            var2 += -1940764470;
            var2 &= -320278490;
            var2 -= 1756950045;
            var2 ^= 1871745650;
            var2 ^= 19591795;
            var22 = var2;
            if (var22 != null) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            var2 &= -2066641565;
            var2 ^= 712452951;
            int var25 = var2 + 1;
            var25 = var2 * var25;
            var2 = var25 & 1;
            if (var2 == 0) {
                float var17 = var5 + var6;
                float var18 = var17 / 2.0F;
                var4[1] = var18;
                float var19 = var0[2];
                float var27 = var1[2];
                float var20 = var19 + var27;
                float var21 = var20 / 2.0F;
                var4[2] = var21;
                return var4;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    public static float[] w(float[] var0, float[] var1) {
        int var2 = vt;
        var2 ^= 735819532;
        int var3 = System.identityHashCode(var0);
        float[] var4 = new float[3];
        float var5 = var0[0];
        float var6 = var1[0];
        var5 -= var6;
        int var32 = var3 + 1;
        int var33 = var3 * var32;
        var3 = var33 & 1;
        if (var3 == 0) {
            var2 -= -1009064172;
            var2 |= -2001477841;
            var2 ^= -867984616;
            long var34 = var2;
            long var8 = var34 + 1L;
            var8 = var34 * var8;
            long var35 = var8 & 1L;
            long var37;
            var3 = (var37 = var35 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var3 == 0) {
                var4[0] = var5;
                float var23 = var0[1];
                var5 = var1[1];
                float var24 = var23 - var5;
                var4[1] = var24;
                float var25 = var0[2];
                var5 = var1[2];
                float var26 = var25 - var5;
                var4[2] = var26;
                return var4;
            }
        } else {
            var2 -= 1666650185;
            var2 ^= 2064599531;
            var2 &= -546236074;
            var2 ^= 1146320328;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public static float ab(float[] var0, float[] var1) {
        int var2 = vt;
        var2 ^= -1369516238;
        int var3 = System.identityHashCode(var0);
        float var4 = var0[0];
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var45;
        var3 = (var45 = var5 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
        int var38 = of_2.p;
        var2 ^= var38;
        var2 ^= -1554133772;
        int var39 = of_2.FR;
        var2 ^= var39;
        var2 ^= 2026243100;
        if (var3 == 0) {
            var2 = switch (var2) {
                default -> var2 ^ 671110526;
                case -759424421 -> var2 ^ -1077336602;
                case 366054484 -> {
                    var2 ^= -1962887973;
                    var2 |= 348697399;
                    var2 >>= 9;
                    var2 *= -1657297289;
                    yield var2 ^ -2132414267;
                }
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                float var29 = var1[0];
                float var30 = var4 * var29;
                var4 = var0[1];
                float var40 = var1[1];
                var4 *= var40;
                float var31 = var30 + var4;
                var4 = var0[2];
                float var41 = var1[2];
                var4 *= var41;
                return var31 + var4;
            } else {
                UnsupportedOperationException var28 = new UnsupportedOperationException();
                throw var28;
            }
        } else {
            var2 &= 791806235;
            var2 ^= -858458938;
            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        }
    }

    public static void xm(float[] var0, float[] var1) {
        int var2 = vt;
        var2 ^= 1163401144;
        int var3 = System.identityHashCode(var0);
        float var4 = var0[0];
        float var5 = var1[0];
        var4 += var5;
        var0[0] = var4;
        var4 = var0[1];
        var5 = var1[1];
        var4 += var5;
        var0[1] = var4;
        var4 = var0[2];
        var5 = var1[2];
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var41;
        var3 = (var41 = var6 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var3 == 0) {
            switch (var2) {
                case -19444514:
                    var2 <<= 11;
                    var2 -= -1061512917;
                    var2 += 1441178797;
                    var2 ^= 1107627457;
                    break;
                case 1317213128:
                    var2 ^= 91874450;
                    break;
                case 1452138266:
                default:
                    var2 ^= 1928342532;
            }

            float var31 = var4 + var5;
            var0[2] = var31;
        } else {
            var2 = switch (var2) {
                case -1549184867 -> var2 ^ -55692695;
                default -> var2 ^ 860278037;
                case -19444514 -> {
                    var2 |= 1445964130;
                    var2 |= -1209884654;
                    var2 *= 522572227;
                    var2 ^= 1939550037;
                    yield var2 ^ 638484015;
                }
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var36 = var2 + 2;
            var3 *= var36;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        }
    }

    public static void u(float[] var0, float var1) {
        int var2 = vt;
        var2 ^= 579585553;
        int var3 = System.identityHashCode(var0);
        float var4 = var0[0];
        var4 *= var1;
        var0[0] = var4;
        var4 = var0[1];
        var4 *= var1;
        var0[1] = var4;
        var4 = var0[2];
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 != 0) {
            var2 ^= 495179131;
            var2 >>= 12;
            var2 |= -21710840;
            var2 >>>= 3;
            var2 ^= -1919069687;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                UnsupportedOperationException var22 = new UnsupportedOperationException();
                throw var22;
            }
        } else {
            var2 |= 289781627;
            var2 ^= -1274666306;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var5 = var2 + 2;
            var3 *= var5;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                float var17 = var4 * var1;
                var0[2] = var17;
                return;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    public static boolean UB(float[] var0) {
        int var1 = vt;
        var1 ^= -850527746;
        int var2 = System.identityHashCode(var0);
        float var3 = ab(var0, var0);
        double var38 = var3;
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var57;
        int var47 = (var57 = var5 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
        label45:
        if (var47 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ -1335072358;
                case 239244675 -> var1 ^ -958912030;
                case 1992467096 -> {
                    var1 ^= -714708770;
                    var1 ^= -1468831629;
                    var1 *= -877622485;
                    var1 |= -1668957715;
                    yield var1 ^ 698811233;
                }
            };
            var5 = var1;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var58;
            int var50 = (var58 = var5 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
            if (var50 == 0) {
                double var39 = Math.sqrt(var38);
                var3 = (float)var39;
                float var59;
                int var4 = (var59 = var3 - 1.0E-6F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
                if (var4 < 0) {
                    var1 &= 1906655429;
                    var1 ^= 2042177374;
                    return false;
                }
                var1 = switch (var1) {
                    default -> var1 ^ -676013664;
                    case -1273446770 -> {
                        var1 <<= 19;
                        var1 |= 1719079189;
                        var1 |= -1759282215;
                        var1 ^= -1686359452;
                        yield var1 ^ 1961215844;
                    }
                    case 1056516304 -> var1 ^ 1446213929;
                };
                Integer var42 = var1;
                if (var42 != null) {
                    var3 = 1.0F / var3;
                    long var43 = var2;
                    long var6 = var43 + 1L;
                    var6 = var43 * var6;
                    long var8 = var43 + 2L;
                    var6 *= var8;
                    long var44 = var43 + 3L;
                    var6 *= var44;
                    long var45 = var6 & 7L;
                    long var60;
                    var2 = (var60 = var45 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                    if (var2 != 0) {
                        var1 ^= 1729276718;
                        var1 ^= -402142312;
                        break label45;
                    }

                    var1 &= 196767938;
                    var1 ^= 792850881;
                    var1 *= 869889205;
                    var1 ^= 370812711;
                    Integer var36 = var1;
                    if (var36 != null) {
                        u(var0, var3);
                        return true;
                    }
                }
            }

            IllegalStateException var37 = new IllegalStateException();
            throw var37;
        } else {
            var1 &= 1377720657;
            var1 &= -1790571222;
            var1 &= -505369388;
            var1 >>>= 19;
            var1 ^= -1745097109;
        }

        IllegalStateException var32 = new IllegalStateException();
        throw var32;
    }

    public static float[] Mr(float[] var0, float[] var1, float[] var2, float[] var3) {
        int var4 = vt;
        var4 ^= -2020999321;
        int var5 = System.identityHashCode(var0);
        float[][] var6 = new float[][]{var0, var1, null, null};
        int var7 = var5 + 1;
        var7 = var5 * var7;
        int var8 = var5 + 2;
        var7 *= var8;
        var5 += 3;
        var7 *= var5;
        var5 = var7 & 7;
        if (var5 != 0) {
            var4 &= -1313650599;
            var4 ^= -2142849411;
            long var29 = var4;
            long var9 = var29 + 1L;
            var9 = var29 * var9;
            long var11 = var29 + 2L;
            var9 *= var11;
            long var30 = var29 + 3L;
            var9 *= var30;
            long var31 = var9 & 7L;
            long var35;
            var5 = (var35 = var31 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalArgumentException var25 = new IllegalArgumentException();
                throw var25;
            } else {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            var4 &= -1185184921;
            var4 *= 1634898589;
            var4 -= 431888044;
            var4 -= 573544932;
            var4 ^= 1755374573;
            var6[2] = var2;
            var6[3] = var3;
            return D(var6);
        }
    }

    public static float[] D(float[][] var0) {
        label75: {
            int var1 = vt;
            var1 ^= -1197885361;
            int var2 = System.identityHashCode(var0);
            float[] var3 = new float[3];
            var3 = var3;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                switch (var1) {
                    case 51831593:
                        var1 >>>= 15;
                        var1 &= 888770366;
                        var1 += -1844294124;
                        var1 ^= 1768441120;
                        break;
                    case 789256265:
                    default:
                        var1 ^= -241921232;
                        break;
                    case 2043413491:
                        var1 ^= 995958341;
                }
            } else {
                var1 <<= 13;
                var1 ^= 1813508339;
                Integer var58 = var1;
                if (var58 == null) {
                    break label75;
                }

                byte var59 = 0;
                int var60 = var59;

                var1 = switch (var1) {
                    case -1334652685 -> {
                        var1 |= 783125233;
                        var1 <<= 14;
                        yield var1 ^ -78492171;
                    }
                    case 1503274772 -> var1 ^ 1690591041;
                    default -> var1 ^ -449306801;
                };

                label71:
                while (true) {
                    var5 = var0.length;
                    int var6 = var2 + 1;
                    var6 = var2 * var6;
                    int var7 = var2 + 2;
                    var6 *= var7;
                    var7 = var2 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        var1 -= 199088274;
                        var1 *= -563122403;
                        var1 -= 931781087;
                        var1 *= -1188859427;
                        var1 ^= 1895462808;
                        break;
                    }
                    var1 = switch (var1) {
                        case -1345098978 -> var1 ^ -1226452477;
                        case 233737717 -> {
                            var1 ^= -380116636;
                            var1 -= -479992194;
                            var1 |= 1809777644;
                            var1 *= 901474671;
                            yield var1 ^ 1155351314;
                        }
                        default -> var1 ^ 326644378;
                    };
                    var6 = var1 + 1;
                    var6 = var1 * var6;
                    var7 = var1 + 2;
                    var6 *= var7;
                    var7 = var1 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label75;
                    }

                    if (var60 >= var5) {
                        var1 ^= 903355358;
                        var1 ^= -1577360739;
                        var2 = var1 + 1;
                        var2 = var1 * var2;
                        var60 = var1 + 2;
                        var2 *= var60;
                        var60 = var1 + 3;
                        var2 *= var60;
                        var2 &= 7;
                        if (var2 == 0) {
                            return var3;
                        }
                        break label75;
                    }

                    var1 <<= 22;
                    var1 -= 604988828;
                    var1 ^= 1095078335;
                    float[] var65 = var0[var60];
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        switch (var1) {
                            case -1033189599:
                            default:
                                var1 ^= 2139050410;
                                break label71;
                            case 684995158:
                                var1 ^= 1870528624;
                                break label71;
                            case 2113211355:
                                var1 *= -1810934723;
                                var1 ^= -461359706;
                                var1 >>= 8;
                                var1 ^= -81293830;
                                break label71;
                        }
                    }

                    var1 |= 161176165;
                    var1 -= -958966336;
                    var1 |= -65213574;
                    var1 <<= 7;
                    var1 ^= 272116572;
                    var6 = var60 + 1;
                    var7 = var0.length;
                    var6 %= var7;
                    float[] var85 = var0[var6];
                    float var91 = var3[0];
                    float var8 = var65[1];
                    float var9 = var85[1];
                    var8 -= var9;
                    var9 = var65[2];
                    float var10 = var85[2];
                    var9 += var10;
                    var8 *= var9;
                    float var92 = var91 + var8;
                    var3[0] = var92;
                    float var93 = var3[1];
                    var8 = var65[2];
                    var9 = var85[2];
                    var8 -= var9;
                    var9 = var65[0];
                    var10 = var85[0];
                    var9 += var10;
                    var8 *= var9;
                    float var94 = var93 + var8;
                    var3[1] = var94;
                    float var95 = var3[2];
                    var8 = var65[0];
                    var9 = var85[0];
                    var8 -= var9;
                    float var66 = var65[1];
                    float var86 = var85[1];
                    float var67 = var66 + var86;
                    float var68 = var8 * var67;
                    float var69 = var95 + var68;
                    var3[2] = var69;
                    var5 = var60 + 1;
                    var60 = var5;
                    switch (var1) {
                        case -1907387172:
                            var1 <<= 3;
                            var1 <<= 16;
                            var1 ^= -1425109515;
                            break;
                        case -671554130:
                        default:
                            var1 ^= -1055363358;
                            break;
                        case 924041549:
                            var1 ^= -314632552;
                    }
                }
            }

            Integer var45 = var1;
            if (var45 != null) {
                IllegalStateException var46 = new IllegalStateException();
                throw var46;
            }
        }

        IllegalStateException var47 = new IllegalStateException();
        throw var47;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 599842309;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        vt = var4;
    }
}
