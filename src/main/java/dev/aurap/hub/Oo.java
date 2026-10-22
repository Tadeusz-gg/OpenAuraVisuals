package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Glass;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Oo {
    private final Glass Sl;
    private final int S;
    private final int b;
    private final int Fx;
    private final Paint cc;
    private final Paint X;
    private final float V;
    private final int TN;
    private final Paint K;
    private final int U;
    private final int W;
    private final int NS;
    private final int uq;
    private final int P;
    private final int Tz;
    private final int o;
    private final int j;
    private final int rV;
    private final int T;
    private final int qO;
    private final zG l;
    public static final int p;

    public Oo(zG var1) {
        Glass var2 = var1.glass;
        this.Sl = var2;
        int var4 = var1.ink;
        this.S = var4;
        int var5 = var1.shadow;
        this.b = var5;
        int var6 = var1.sheen;
        this.Fx = var6;
        int var7 = var1.sheen;
        int var3 = var1.sheen;
        var3 &= 16777215;
        Paint var8 = Paint.vertical(var7, var3);
        this.cc = var8;
        int var9 = var1.rimTop;
        var3 = var1.rimBottom;
        Paint var10 = Paint.vertical(var9, var3);
        float var31 = var1.rimWidth;
        Paint var11 = var10.stroke(var31);
        this.X = var11;
        float var12 = var1.rimWidth;
        this.V = var12;
        int var13 = var1.inset;
        this.TN = var13;
        int var14 = var1.insetRim;
        Paint var15 = Paint.solid(var14);
        Paint var16 = var15.stroke(0.5F);
        this.K = var16;
        int var17 = var1.line;
        this.U = var17;
        int var18 = var1.track;
        this.W = var18;
        int var19 = var1.trackLine;
        this.NS = var19;
        int var20 = var1.text;
        this.uq = var20;
        int var21 = var1.value;
        this.P = var21;
        int var22 = var1.text2;
        this.Tz = var22;
        int var23 = var1.text3;
        this.o = var23;
        int var24 = var1.accent;
        this.j = var24;
        int var25 = var1.accent2;
        this.rV = var25;
        int var26 = var1.effect;
        this.T = var26;
        int var27 = var1.harmful;
        this.qO = var27;
        zG var28 = var1.copy(-2123731881);
        this.l = var28;
    }

    public static zG r(Glass var0, int var1) {
        int var2 = p;
        var2 ^= 896682368;
        int var4 = System.identityHashCode(var0);
        zG var5 = new zG();
        Integer var25 = var4;
        if (var25 != null) {
            var2 ^= 732571023;
            var2 += -1374447727;
            var2 *= -1584501041;
            var2 ^= -1484310336;
            long var6 = var1;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var31;
            int var26 = (var31 = var6 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var26 == 0) {
                var5.glass = var0;
                var5.ink = var1;
                return var5;
            }
        } else {
            var2 -= 2144215316;
            var2 += -589528489;
            var2 -= -113890110;
            var2 &= 1754296018;
            var2 ^= 966056317;
            long var20 = var1;
            long var27 = var20 + 1L;
            long var28 = var20 * var27;
            long var21 = var28 & 1L;
            long var32;
            var2 = (var32 = var21 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        }

        IllegalStateException var23 = new IllegalStateException();
        throw var23;
    }

    public static zG T(int var0) {
        int var1 = p;
        var1 ^= -476247807;
        int var4 = var0 + 1;
        var4 = var0 * var4;
        int var5 = var0 + 2;
        var4 *= var5;
        int var3 = var0 + 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            var1 >>= 22;
            var1 ^= -635949992;
            var1 ^= 100572912;
            zG var20 = new zG();
            var20.ink = var0;
            return var20;
        } else {
            var1 <<= 28;
            var1 >>>= 13;
            var1 *= -153100737;
            var1 ^= -2088604737;
            var1 = var0 + 1;
            var1 = var0 * var1;
            var1 &= 1;
            if (var1 == 0) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            } else {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            }
        }
    }

    public Oo Y(int var1, int var2) {
        int var3 = p;
        var3 ^= -132396132;
        int var5 = System.identityHashCode(this);
        zG var6 = this.l;
        int var7 = var3 * 75595985;
        var7 *= 338903283;
        var7 ^= 1231701458;
        var6 = var6.copy(var7);
        var7 = var1 | 0xFF000000;
        var6.accent = var7;
        Integer var22 = var5;
        if (var22 == null) {
            var3 -= -1675355419;
            var3 &= -1140111429;
            var3 ^= -1930446966;
            IllegalArgumentException var23 = new IllegalArgumentException();
            throw var23;
        } else {
            var3 -= -1188955355;
            var3 <<= 31;
            var3 -= -560930817;
            var3 ^= -1340176304;
            var3 = var1 + 1;
            var3 = var1 * var3;
            var3 &= 1;
            if (var3 != 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            } else {
                var3 = var2 | 0xFF000000;
                var6.accent2 = var3;
                var3 = var6.accent;
                var6.effect = var3;
                return new Oo(var6);
            }
        }
    }

    public boolean uo() {
        int var1 = p;
        var1 ^= -461279545;
        int var2 = System.identityHashCode(this);
        Integer var30 = var2;
        if (var30 != null) {
            var1 >>= 23;
            var1 -= 1747338169;
            var1 ^= -888351804;
            var30 = var1;
            if (var30 != null) {
                Glass var32 = this.Sl;
                boolean var33;
                if (var32 != null) {
                    var1 ^= 405089384;
                    var1 -= 1388679009;
                    var1 *= 1748407895;
                    var1 -= -564598666;
                    var1 ^= -663414783;
                    var33 = true;
                    var1 <<= 1;
                    var1 -= -322570096;
                    var1 ^= 1515201132;
                } else {
                    var1 -= 901551893;
                    var1 ^= -891303112;
                    var1 >>>= 4;
                    var1 ^= -306613669;
                    var33 = false;
                    switch (var1) {
                        case -967313180:
                            var1 ^= -683142880;
                            break;
                        case -479919254:
                            var1 ^= -2008968768;
                            var1 *= -202373391;
                            var1 ^= 1027049378;
                            break;
                        case -420295096:
                        default:
                            var1 ^= -327688133;
                    }
                }

                Integer var3 = var1;
                if (var3 != null) {
                    return var33;
                }
            }
        } else {
            var1 *= -1255706249;
            var1 |= -600962791;
            var1 |= 524492173;
            var1 |= 853118194;
            var1 ^= 869727200;
            int var34 = var1 + 1;
            var34 = var1 * var34;
            var1 = var34 & 1;
            if (var1 == 0) {
                IllegalStateException var29 = new IllegalStateException();
                throw var29;
            }
        }

        RuntimeException var28 = new RuntimeException();
        throw var28;
    }

    public Glass sO() {
        int var1 = p;
        var1 ^= -1121425537;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 == null) {
            var11 = switch (var1) {
                default -> var1 ^ 2041862205;
                case 1198009364 -> {
                    var1 ^= 2093308430;
                    var1 *= -449142523;
                    yield var1 ^ 2050177541;
                }
                case 2097082976 -> var1 ^ -462428991;
            };
            if (var11 != null) {
                AssertionError var14 = new AssertionError();
                throw var14;
            } else {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        } else {
            var1 ^= -172690769;
            var1 ^= -1109965714;
            var1 += 266583538;
            var1 ^= 1445541684;
            return this.Sl;
        }
    }

    public int CU() {
        int var1 = p;
        var1 ^= -1253757430;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var30;
        var2 = (var30 = var23 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= -330037589;
            var1 -= 1711620384;
            var1 ^= -775582150;
            var1 ^= -1915050956;
            return this.S;
        } else {
            var1 &= 1800926895;
            var1 *= -238433103;
            var1 &= -1999735062;
            var1 += 871532036;
            var1 ^= 671489108;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    public int g() {
        int var1 = p;
        var1 ^= -526001504;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 != null) {
            var1 = switch (var1) {
                case -1327951058 -> var1 ^ -1415683275;
                default -> var1 ^ 426706605;
                case 451252683 -> {
                    var1 >>= 14;
                    var1 <<= 24;
                    var1 *= 1434617625;
                    yield var1 ^ 151736999;
                }
            };
            int var12 = var1 + 1;
            var12 = var1 * var12;
            var12 &= 1;
            if (var12 == 0) {
                return this.b;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        } else {
            var1 += 1604723068;
            var1 ^= -70144817;
            UnsupportedOperationException var6 = new UnsupportedOperationException();
            throw var6;
        }
    }

    public int QE() {
        int var1 = p;
        var1 ^= 1998912725;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 -= 1890603839;
            var1 &= 497933867;
            var1 |= -647450977;
            var1 -= -1495479384;
            var1 ^= 52256798;
            Integer var20 = var1;
            if (var20 != null) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            Integer var16 = switch (var1) {
                case -1922779202 -> {
                    var1 |= 1310918595;
                    var1 ^= -859446336;
                    var1 &= 784953370;
                    var1 ^= 585908596;
                    yield var1 ^ 1024927635;
                }
                default -> var1 ^ 173895521;
                case 1368700125 -> var1 ^ 1389390419;
            };
            if (var16 != null) {
                return this.Fx;
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    public Paint Kc() {
        int var1 = p;
        var1 ^= -1737411314;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 &= 285765326;
            var1 |= 1291873222;
            var1 *= -1138997197;
            var1 ^= -452190384;
            return this.cc;
        } else {
            var1 += -761765562;
            var1 >>= 27;
            var1 += -2010159481;
            var1 ^= -1456449596;
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }

    public Paint Io() {
        int var1 = p;
        var1 ^= 1583811332;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 *= -1665449865;
            var1 += 147563293;
            var1 |= -786723097;
            var1 ^= -65373564;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            } else {
                return this.X;
            }
        } else {
            switch (var1) {
                case -1540931473:
                    var1 *= 1683275133;
                    var1 &= 1153637147;
                    var1 += 2023267294;
                    var1 &= -58153363;
                    var1 ^= 301316632;
                    break;
                case -611394526:
                    var1 ^= 818838947;
                    break;
                case 1939713360:
                default:
                    var1 ^= 521553124;
            }

            IllegalArgumentException var13 = new IllegalArgumentException();
            throw var13;
        }
    }

    public float x() {
        int var1 = p;
        var1 ^= 1720790089;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 == null) {
            var1 ^= -1353237312;
            var1 ^= 902602526;
            var1 ^= 1382004185;
            long var17 = var1;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var6 = var17 + 2L;
            var4 *= var6;
            long var18 = var17 + 3L;
            var4 *= var18;
            long var19 = var4 & 7L;
            long var25;
            int var20 = (var25 = var19 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var20 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        } else {
            var1 *= -1850788677;
            var1 ^= -1483506138;
            Integer var14 = var1;
            if (var14 != null) {
                return this.V;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    public int kG() {
        int var1 = p;
        var1 ^= -1007827677;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 = switch (var1) {
                case 967675464 -> {
                    var1 |= -1542062460;
                    yield var1 ^ 972811730;
                }
                default -> var1 ^ 1455990761;
                case 1835468815 -> var1 ^ -945914986;
            };
            int var15 = var1 + 1;
            var15 = var1 * var15;
            int var3 = var1 + 2;
            var15 *= var3;
            var3 = var1 + 3;
            var15 *= var3;
            var15 &= 7;
            if (var15 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var1 = switch (var1) {
                case -168647703 -> var1 ^ 516786501;
                default -> var1 ^ -2024546615;
                case 967675464 -> {
                    var1 -= 128596202;
                    var1 *= -1899304819;
                    var1 *= -251981093;
                    yield var1 ^ 1114221826;
                }
            };
            int var21 = var1 + 1;
            var21 = var1 * var21;
            int var26 = var1 + 2;
            var21 *= var26;
            var1 += 3;
            var21 *= var1;
            var1 = var21 & 7;
            if (var1 == 0) {
                return this.TN;
            }
        }

        IllegalStateException var13 = new IllegalStateException();
        throw var13;
    }

    public Paint FH() {
        int var1 = p;
        var1 ^= 1245225633;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 >>>= 7;
            var1 *= -814913943;
            var1 >>= 12;
            var1 ^= -2026025522;
            return this.K;
        } else {
            var1 <<= 31;
            var1 ^= -1528184169;
            long var8 = var1;
            long var19 = var8 + 1L;
            long var20 = var8 * var19;
            long var9 = var20 & 1L;
            long var21;
            var1 = (var21 = var9 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            } else {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }
    }

    public int s() {
        int var1 = p;
        var1 ^= 1970689438;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 != null) {
            var1 -= -1918075326;
            var1 <<= 25;
            var1 ^= -738733354;
            var12 = var1;
            if (var12 != null) {
                return this.U;
            }
        } else {
            var1 >>= 12;
            var1 ^= 1467545620;
            Integer var9 = var1;
            if (var9 != null) {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }

        IllegalArgumentException var10 = new IllegalArgumentException();
        throw var10;
    }

    public int UK() {
        int var1 = p;
        var1 ^= -1640158657;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 |= 1114600602;
            var1 ^= 526196224;
            return this.W;
        } else {
            var1 += -1527596272;
            var1 |= -764791907;
            var1 ^= 439994354;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            } else {
                AssertionError var10 = new AssertionError();
                throw var10;
            }
        }
    }

    public int D() {
        int var1 = p;
        var1 ^= 1581049862;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += 493062041;
            var1 *= -1088538315;
            var1 ^= 632758622;
            var1 ^= 1289352882;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.NS;
            }
        } else {
            var1 *= -2118616879;
            var1 >>>= 5;
            var1 ^= 690936655;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            }
        }

        IllegalStateException var13 = new IllegalStateException();
        throw var13;
    }

    public int MD() {
        int var1 = p;
        var1 ^= 1760367602;
        int var2 = System.identityHashCode(this);
        Integer var21 = var2;
        int var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        of_2.Ik = -924068123;
        var3 = of_2.OV;
        var1 ^= var3;
        var1 ^= 1424833073;
        of_2.OV = 1424833073;
        if (var21 != null) {
            switch (var1) {
                case -1834133351:
                    var1 -= -2045267659;
                    var1 -= -1555176847;
                    var1 &= 515555867;
                    var1 -= 1333052756;
                    var1 ^= 1697431227;
                    break;
                case -1116680290:
                    var1 ^= 1057356577;
                    break;
                case -960778520:
                default:
                    var1 ^= 2092268760;
            }

            return this.uq;
        } else {
            var1 &= 1863832606;
            var1 &= 831335865;
            var1 |= 983924263;
            var1 ^= -1266160304;
            RuntimeException var13 = new RuntimeException();
            throw var13;
        }
    }

    public int FM() {
        int var1 = p;
        var1 ^= 2132346616;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 >>= 10;
            var1 ^= 1869161301;
            var14 = var1;
            if (var14 != null) {
                return this.P;
            }
        } else {
            var1 &= 1359793023;
            var1 -= -1714208171;
            var1 ^= -1401485426;
            int var16 = var1 + 1;
            var16 = var1 * var16;
            int var3 = var1 + 2;
            var16 *= var3;
            var1 += 3;
            var16 *= var1;
            var1 = var16 & 7;
            if (var1 == 0) {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        }

        IllegalArgumentException var12 = new IllegalArgumentException();
        throw var12;
    }

    public int Hb() {
        int var1 = p;
        var1 ^= 2020620993;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 ^= 761484703;
            var1 *= 437732773;
            var1 += -1484646318;
            var1 ^= 559784697;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            } else {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            }
        } else {
            var1 &= 1671605250;
            var1 ^= 52367568;
            return this.Tz;
        }
    }

    public int bb() {
        int var1 = p;
        var1 ^= -2016774781;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var23 = var4 & 1L;
        long var30;
        var2 = (var30 = var23 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= 1347758017;
            var1 <<= 30;
            var1 |= 1405752462;
            var1 ^= -1971456584;
            RuntimeException var25 = new RuntimeException();
            throw var25;
        } else {
            var1 <<= 6;
            var1 *= -752408277;
            var1 &= -23277179;
            var1 ^= -1193805489;
            var1 ^= -1498251455;
            long var13 = var1;
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var5 = var13 + 2L;
            var3 *= var5;
            long var14 = var13 + 3L;
            var3 *= var14;
            long var15 = var3 & 7L;
            long var31;
            var1 = (var31 = var15 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.o;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }
    }

    public int E() {
        int var1 = p;
        var1 ^= 1889338600;
        int var2 = System.identityHashCode(this);
        long var24 = var2;
        long var4 = var24 + 1L;
        var4 = var24 * var4;
        long var25 = var4 & 1L;
        long var31;
        var2 = (var31 = var25 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        int var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        var3 = of_2.OV;
        var1 ^= var3;
        var1 ^= 1424833073;
        if (var2 == 0) {
            var1 &= -1154822401;
            var1 ^= -349045929;
            var1 += 676289963;
            var1 *= -1391604213;
            var1 ^= -231159742;
            return this.j;
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 1260188805;
                case -1965207677 -> {
                    var1 -= 1952794304;
                    var1 -= -1629015619;
                    var1 -= -1246570208;
                    var1 &= 1865527453;
                    yield var1 ^ -1164317332;
                }
                case 875267303 -> var1 ^ 416042892;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var18 = new AssertionError();
                throw var18;
            } else {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }
    }

    public int P() {
        int var1 = p;
        var1 ^= 436185153;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 ^= 552930367;
            var1 &= -404652428;
            var1 ^= -1676239762;
            Integer var14 = var1;
            if (var14 != null) {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        } else {
            var1 ^= 1545791873;
            var1 += 1925164471;
            var1 ^= 296820183;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.rV;
            }
        }

        UnsupportedOperationException var12 = new UnsupportedOperationException();
        throw var12;
    }

    public int K() {
        int var1 = p;
        var1 ^= -527806622;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 <<= 5;
            var1 *= -1705266453;
            var1 += 1576021550;
            var1 ^= 1453859057;
            long var20 = var1;
            long var29 = var20 + 1L;
            long var30 = var20 * var29;
            long var6 = var20 + 2L;
            long var31 = var30 * var6;
            long var21 = var20 + 3L;
            long var32 = var31 * var21;
            long var22 = var32 & 7L;
            long var33;
            var2 = (var33 = var22 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            } else {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1351796124:
                    var1 ^= -405159719;
                    break;
                case -564383912:
                default:
                    var1 ^= -188546776;
                    break;
                case 449446921:
                    var1 &= 1173434971;
                    var1 ^= -921036251;
                    var1 ^= -1931910938;
            }

            return this.T;
        }
    }

    public int AE() {
        int var1 = p;
        var1 ^= 1773434895;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var26;
        var2 = (var26 = var21 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= -151587907;
            var1 <<= 27;
            var1 += 1123237603;
            var1 ^= 1284635772;
            return this.qO;
        } else {
            var1 += -324905319;
            var1 *= 1701887327;
            var1 ^= 2120411552;
            Integer var12 = var1;
            if (var12 != null) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1567227144;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        p = var4;
    }
}
