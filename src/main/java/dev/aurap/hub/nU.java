package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class nU {
    private final g_2 T;
    private final g_2 kI;
    private final g_2[] h;
    private static final nU U;
    private static final nU Nf;
    public static final int Tl;

    private nU(g_2 var1, g_2 var2, g_2... var3) {
        this.T = var1;
        this.kI = var2;
        this.h = var3;
    }

    public static nU G(Da var0) {
        label63: {
            int var1 = Tl;
            var1 ^= -1441534700;
            int var2 = System.identityHashCode(var0);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            int var4 = of_2.IX;
            var1 ^= var4;
            var1 ^= -922803453;
            of_2.IX = -922803453;
            var4 = of_2.s;
            var1 ^= var4;
            var1 ^= 145660289;
            of_2.s = 145660289;
            if (var3 != 0) {
                switch (var1) {
                    case 134997236:
                        var1 ^= -352912678;
                        var1 ^= 1539001780;
                        var1 ^= -1881309874;
                        break;
                    case 433725872:
                    default:
                        var1 ^= 1735149341;
                        break;
                    case 1680476504:
                        var1 ^= -27881697;
                }
            } else {
                label65: {
                    var1 *= 1511468897;
                    var1 ^= 1044567560;
                    var1 |= -1252703792;
                    var1 ^= -356392757;
                    Integer var59 = var1;
                    if (var59 == null) {
                        break label63;
                    }

                    Da var60 = Da.KARAMBIT;
                    nU var62;
                    if (var0 == var60) {
                        var1 = switch (var1) {
                            case -842969403 -> var1 ^ 1562162289;
                            case 1437907767 -> {
                                var1 += 240825450;
                                yield var1 ^ -614638462;
                            }
                            default -> var1 ^ -1487629296;
                        };
                        nU var61 = U;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        int var5 = var2 + 2;
                        var4 *= var5;
                        var5 = var2 + 3;
                        var4 *= var5;
                        var4 &= 7;
                        if (var4 != 0) {
                            var1 |= -1375048917;
                            var1 += -585573804;
                            var1 |= 192949196;
                            var1 ^= 2073916859;
                            var1 ^= -755686256;
                            break label65;
                        }

                        var1 *= 1940473241;
                        var1 ^= -678813072;
                        var62 = var61;
                        var1 -= -497248153;
                        var1 &= -1394422627;
                        var1 ^= -839717789;
                    } else {
                        var1 |= -248503510;
                        var1 >>= 6;
                        var1 -= 419252247;
                        var1 >>= 26;
                        var1 ^= 1150111354;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        int var78 = var1 + 2;
                        var4 *= var78;
                        var78 = var1 + 3;
                        var4 *= var78;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label63;
                        }

                        nU var74 = Nf;
                        var78 = var2 + 1;
                        var78 = var2 * var78;
                        int var6 = var2 + 2;
                        var78 *= var6;
                        var2 += 3;
                        var78 *= var2;
                        var2 = var78 & 7;
                        if (var2 != 0) {
                            var1 ^= -666019949;
                            var1 ^= 1436862660;
                            break label65;
                        }

                        var1 -= -1730950038;
                        var1 *= 329967079;
                        var1 ^= 2074371422;
                        long var84 = var1;
                        long var7 = var84 + 1L;
                        var7 = var84 * var7;
                        long var85 = var7 & 1L;
                        long var87;
                        var2 = (var87 = var85 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            break label63;
                        }

                        var62 = var74;
                        switch (var1) {
                            case -1643653891:
                                var1 ^= 59684348;
                                break;
                            case -497147059:
                            default:
                                var1 ^= 1994280643;
                                break;
                            case 642675665:
                                var1 <<= 31;
                                var1 ^= 1855808080;
                                var1 &= 576513646;
                                var1 -= -775969977;
                                var1 ^= -1785850226;
                        }
                    }

                    long var47 = var1;
                    long var75 = var47 + 1L;
                    long var76 = var47 * var75;
                    long var48 = var76 & 1L;
                    long var88;
                    var1 = (var88 = var48 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return var62;
                    }
                    break label63;
                }
            }

            IllegalArgumentException var56 = new IllegalArgumentException();
            throw var56;
        }

        UnsupportedOperationException var52 = new UnsupportedOperationException();
        throw var52;
    }

    public g_2 s() {
        int var1 = Tl;
        var1 ^= -1759893429;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        if (var20 != null) {
            var1 ^= 1816395107;
            var1 &= 1638269237;
            var1 ^= 1272766707;
            var20 = var1;
            if (var20 != null) {
                return this.T;
            }
        } else {
            var1 ^= -1280141120;
            var1 |= -342777984;
            var1 ^= 984642225;
            long var14 = var1;
            long var3 = var14 + 1L;
            var3 = var14 * var3;
            long var5 = var14 + 2L;
            var3 *= var5;
            long var15 = var14 + 3L;
            var3 *= var15;
            long var16 = var3 & 7L;
            long var25;
            var1 = (var25 = var16 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public g_2 a() {
        int var1 = Tl;
        var1 ^= 361646286;
        int var2 = System.identityHashCode(this);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var24 = var4 & 1L;
        long var28;
        var2 = (var28 = var24 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        int var3 = of_2.IX;
        var1 ^= var3;
        var1 ^= -922803453;
        var3 = of_2.s;
        var1 ^= var3;
        var1 ^= 145660289;
        if (var2 == 0) {
            var1 *= 1612852437;
            var1 &= -1994977338;
            var1 &= 969570519;
            var1 ^= 1798537290;
            return this.kI;
        } else {
            Integer var16 = switch (var1) {
                default -> var1 ^ -1821757337;
                case -1214889682 -> {
                    var1 *= 844605463;
                    var1 &= 2024880044;
                    var1 ^= 767363456;
                    var1 |= -395082790;
                    yield var1 ^ -1978495596;
                }
                case -323636481 -> var1 ^ 687725535;
            };
            if (var16 == null) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }
    }

    public g_2 cJ(int var1) {
        int var2 = Tl;
        var2 ^= 1132940212;
        int var4 = System.identityHashCode(this);
        g_2[] var5 = this.h;
        g_2[] var6 = this.h;
        Integer var26 = var4;
        if (var26 != null) {
            var2 &= -839794091;
            var2 |= 609118982;
            var2 *= -1366446633;
            var2 *= -1666240141;
            var2 ^= 295253091;
            int var27 = var1 + 1;
            var27 = var1 * var27;
            int var7 = var1 + 2;
            var27 *= var7;
            int var3 = var1 + 3;
            var27 *= var3;
            var3 = var27 & 7;
            if (var3 != 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            } else {
                var3 = var6.length;
                var3 = Math.floorMod(var1, var3);
                return var5[var3];
            }
        } else {
            switch (var2) {
                case -509656492:
                    var2 -= -1949431349;
                    var2 -= -862608377;
                    var2 ^= 334975638;
                    var2 |= 1200775618;
                    var2 ^= 879320472;
                    break;
                case -390135622:
                default:
                    var2 ^= 1885807510;
                    break;
                case -296568625:
                    var2 ^= -615709981;
            }

            UnsupportedOperationException var16 = new UnsupportedOperationException();
            throw var16;
        }
    }

    public int p() {
        int var1 = Tl;
        var1 ^= -611859407;
        int var2 = System.identityHashCode(this);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var24 = var4 & 1L;
        long var39;
        var2 = (var39 = var24 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -796888057;
            var1 &= -1107879137;
            var1 |= 265431036;
            var1 ^= -1008804262;
            var1 ^= -968170621;
            long var26 = var1;
            var4 = var26 + 1L;
            var4 = var26 * var4;
            long var6 = var26 + 2L;
            var4 *= var6;
            long var27 = var26 + 3L;
            var4 *= var27;
            long var28 = var4 & 7L;
            long var40;
            var2 = (var40 = var28 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                g_2[] var30 = this.h;
                return var30.length;
            }
        } else {
            var1 &= 607442448;
            var1 -= 1439446561;
            var1 ^= -1908081910;
            long var17 = var1;
            long var3 = var17 + 1L;
            var3 = var17 * var3;
            long var5 = var17 + 2L;
            var3 *= var5;
            long var18 = var17 + 3L;
            var3 *= var18;
            long var19 = var3 & 7L;
            long var41;
            var1 = (var41 = var19 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var10 = var0.lookupClass();
        int var1 = -885584367;
        byte var2 = 0;
        int var11 = of_2.kj(var10, var1, var2);
        Tl = var11;
        Ue var12 = g_2.qX("slash");
        Lv var22 = sT_2.aO;
        float[] var38 = new float[]{0.1F, 0.07F, 0.04F, 22.0F, 18.0F, 28.0F};
        Ue var13 = var12.eA(0.08F, var22, var38);
        Lv var23 = sT_2.bS;
        float[] var39 = new float[]{-0.36F, -0.13F, -0.06F, -42.0F, -22.0F, -42.0F};
        Ue var14 = var13.eA(0.2F, var23, var39);
        Lv var24 = sT_2.aO;
        float[] var40 = new float[0];
        Ue var15 = var14.z(0.45F, var24, var40);
        g_2 var16 = var15.Y();
        Ue var25 = g_2.qX("hook");
        Lv var41 = sT_2.aO;
        float[] var3 = new float[]{-0.26F, 0.04F, -0.1F, -46.0F, 12.0F, 22.0F};
        Ue var26 = var25.eA(0.1F, var41, var3);
        Lv var42 = sT_2.H;
        var3 = new float[]{0.14F, -0.16F, 0.05F, 18.0F, -32.0F, -36.0F, 0.0F, 30.0F};
        Ue var27 = var26.eA(0.26F, var42, var3);
        Lv var43 = sT_2.aO;
        var3 = new float[0];
        Ue var28 = var27.z(0.5F, var43, var3);
        g_2 var29 = var28.Y();
        Ue var44 = g_2.qX("twirl-slash");
        Lv var63 = sT_2.q;
        float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -360.0F};
        Ue var45 = var44.eA(0.26F, var63, var4);
        Lv var64 = sT_2.aO;
        var4 = new float[]{0.1F, 0.07F, 0.04F, 22.0F, 18.0F, 28.0F, 0.0F, -360.0F};
        Ue var46 = var45.eA(0.34F, var64, var4);
        Lv var65 = sT_2.bS;
        var4 = new float[]{-0.36F, -0.13F, -0.06F, -42.0F, -22.0F, -42.0F, 0.0F, -360.0F};
        Ue var47 = var46.eA(0.46F, var65, var4);
        Lv var66 = sT_2.aO;
        var4 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, -360.0F};
        Ue var48 = var47.z(0.7F, var66, var4);
        g_2 var49 = var48.Y();
        Ue var67 = g_2.qX("backhand");
        Lv var86 = sT_2.aO;
        float[] var5 = new float[]{-0.22F, -0.08F, 0.02F, -30.0F, -10.0F, -32.0F, 180.0F};
        Ue var68 = var67.eA(0.09F, var86, var5);
        Lv var87 = sT_2.bS;
        var5 = new float[]{0.3F, 0.12F, -0.04F, 38.0F, 22.0F, 30.0F, 180.0F};
        Ue var69 = var68.eA(0.24F, var87, var5);
        Lv var88 = sT_2.aO;
        var5 = new float[]{0.0F, 0.0F, 0.0F, 360.0F};
        Ue var70 = var69.z(0.5F, var88, var5);
        g_2 var71 = var70.Y();
        Ue var89 = g_2.qX("flick");
        Lv var103 = sT_2.aO;
        float[] var6 = new float[]{0.05F, -0.05F, 0.08F, 0.0F, 15.0F, 0.0F, 0.0F, 180.0F};
        Ue var90 = var89.eA(0.12F, var103, var6);
        Lv var104 = sT_2.Jj;
        var6 = new float[]{-0.05F, 0.05F, -0.18F, -10.0F, -25.0F, 0.0F, 0.0F, 360.0F};
        Ue var91 = var90.eA(0.3F, var104, var6);
        Lv var105 = sT_2.aO;
        var6 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 360.0F};
        Ue var92 = var91.z(0.55F, var105, var6);
        g_2 var93 = var92.Y();
        Ue var117 = g_2.qX("draw");
        float[] var7 = new float[]{0.06F, -0.42F, 0.12F, 0.0F, 35.0F, 0.0F, -30.0F, -400.0F};
        Ue var118 = var117.Zs(var7);
        Lv var133 = sT_2.aO;
        float[] var8 = new float[]{0.0F, 0.025F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -10.0F};
        Ue var119 = var118.eA(0.42F, var133, var8);
        Lv var134 = sT_2.Jj;
        var8 = new float[0];
        Ue var120 = var119.z(0.75F, var134, var8);
        g_2 var121 = var120.Y();
        Ue var135 = g_2.qX("inspect");
        Lv var155 = sT_2.qQ;
        float[] var9 = new float[]{-0.28F, 0.1F, 0.14F, -28.0F, 38.0F, 0.0F, -30.0F};
        Ue var136 = var135.eA(0.4F, var155, var9);
        Lv var156 = sT_2.Jj;
        var9 = new float[]{-0.29F, 0.11F, 0.14F, -24.0F, 42.0F, 3.0F, -24.0F};
        Ue var137 = var136.eA(0.95F, var156, var9);
        Lv var157 = sT_2.q;
        var9 = new float[]{-0.29F, 0.11F, 0.14F, -24.0F, 42.0F, 3.0F, -24.0F, -720.0F};
        Ue var138 = var137.eA(1.7F, var157, var9);
        Lv var158 = sT_2.qQ;
        var9 = new float[]{-0.28F, 0.12F, 0.13F, -20.0F, 36.0F, 0.0F, 156.0F, -720.0F};
        Ue var139 = var138.eA(2.05F, var158, var9);
        Lv var159 = sT_2.Jj;
        var9 = new float[]{-0.27F, 0.12F, 0.13F, -14.0F, 32.0F, -4.0F, 162.0F, -720.0F};
        Ue var140 = var139.eA(2.6F, var159, var9);
        Lv var160 = sT_2.q;
        var9 = new float[]{-0.25F, 0.1F, 0.12F, -10.0F, 30.0F, -2.0F, 170.0F, -360.0F};
        Ue var141 = var140.eA(3.05F, var160, var9);
        Lv var161 = sT_2.q;
        var9 = new float[]{-0.12F, 0.05F, 0.06F, -6.0F, 16.0F, 0.0F, 170.0F};
        Ue var142 = var141.eA(3.35F, var161, var9);
        Lv var162 = sT_2.q;
        var9 = new float[]{0.0F, 0.0F, 0.0F, 360.0F};
        Ue var143 = var142.z(3.85F, var162, var9);
        g_2 var144 = var143.Y();
        g_2[] var163 = new g_2[]{var16, var29, var49, var16, var71, var93};
        nU var106 = new nU(var121, var144, var163);
        U = var106;
        Ue var17 = g_2.qX("slash");
        Lv var30 = sT_2.aO;
        float[] var50 = new float[]{0.12F, 0.08F, 0.04F, 24.0F, 16.0F, 30.0F};
        Ue var18 = var17.eA(0.08F, var30, var50);
        Lv var31 = sT_2.bS;
        float[] var51 = new float[]{-0.38F, -0.14F, -0.06F, -44.0F, -24.0F, -44.0F};
        Ue var19 = var18.eA(0.2F, var31, var51);
        Lv var32 = sT_2.aO;
        float[] var52 = new float[0];
        Ue var20 = var19.z(0.45F, var32, var52);
        g_2 var21 = var20.Y();
        Ue var33 = g_2.qX("backhand");
        Lv var53 = sT_2.aO;
        var3 = new float[]{-0.24F, -0.08F, 0.02F, -32.0F, -10.0F, -34.0F, 180.0F};
        Ue var34 = var33.eA(0.09F, var53, var3);
        Lv var54 = sT_2.bS;
        var3 = new float[]{0.32F, 0.12F, -0.04F, 40.0F, 22.0F, 32.0F, 180.0F};
        Ue var35 = var34.eA(0.24F, var54, var3);
        Lv var55 = sT_2.aO;
        var3 = new float[]{0.0F, 0.0F, 0.0F, 360.0F};
        Ue var36 = var35.z(0.5F, var55, var3);
        g_2 var37 = var36.Y();
        Ue var56 = g_2.qX("stab");
        Lv var75 = sT_2.aO;
        var4 = new float[]{0.04F, -0.04F, 0.12F, 0.0F, 12.0F};
        Ue var57 = var56.eA(0.07F, var75, var4);
        Lv var76 = sT_2.bS;
        var4 = new float[]{-0.05F, 0.06F, -0.32F, -6.0F, -28.0F};
        Ue var58 = var57.eA(0.17F, var76, var4);
        Lv var77 = sT_2.aO;
        var4 = new float[0];
        Ue var59 = var58.z(0.4F, var77, var4);
        g_2 var60 = var59.Y();
        Ue var78 = g_2.qX("overhead");
        Lv var97 = sT_2.aO;
        var5 = new float[]{0.05F, 0.16F, 0.05F, 6.0F, 40.0F, 10.0F};
        Ue var79 = var78.eA(0.1F, var97, var5);
        Lv var98 = sT_2.bS;
        var5 = new float[]{-0.08F, -0.24F, -0.1F, -10.0F, -48.0F, -12.0F};
        Ue var80 = var79.eA(0.24F, var98, var5);
        Lv var99 = sT_2.aO;
        var5 = new float[0];
        Ue var81 = var80.z(0.5F, var99, var5);
        g_2 var82 = var81.Y();
        Ue var110 = g_2.qX("draw");
        var6 = new float[]{0.05F, -0.45F, 0.1F, 0.0F, 40.0F, 0.0F, -180.0F};
        Ue var111 = var110.Zs(var6);
        Lv var123 = sT_2.aO;
        var7 = new float[]{0.0F, 0.03F, 0.0F, 0.0F, -5.0F, 0.0F, -5.0F};
        Ue var112 = var111.eA(0.42F, var123, var7);
        Lv var124 = sT_2.Jj;
        var7 = new float[0];
        Ue var113 = var112.z(0.7F, var124, var7);
        g_2 var114 = var113.Y();
        Ue var125 = g_2.qX("inspect");
        Lv var147 = sT_2.qQ;
        var8 = new float[]{-0.27F, 0.1F, 0.12F, -30.0F, 40.0F, -5.0F, -25.0F};
        Ue var126 = var125.eA(0.42F, var147, var8);
        Lv var148 = sT_2.Jj;
        var8 = new float[]{-0.29F, 0.11F, 0.12F, -26.0F, 44.0F, -2.0F, -18.0F};
        Ue var127 = var126.eA(1.0F, var148, var8);
        Lv var149 = sT_2.qQ;
        var8 = new float[]{-0.29F, 0.12F, 0.12F, -24.0F, 40.0F, 0.0F, 160.0F};
        Ue var128 = var127.eA(1.35F, var149, var8);
        Lv var150 = sT_2.Jj;
        var8 = new float[]{-0.27F, 0.12F, 0.12F, -18.0F, 36.0F, 4.0F, 166.0F};
        Ue var129 = var128.eA(1.9F, var150, var8);
        Lv var151 = sT_2.q;
        var8 = new float[]{-0.22F, 0.16F, 0.1F, -14.0F, 34.0F, 4.0F, 166.0F, -360.0F};
        Ue var130 = var129.eA(2.6F, var151, var8);
        Lv var152 = sT_2.q;
        var8 = new float[]{0.0F, 0.0F, 0.0F, 360.0F, -360.0F};
        Ue var131 = var130.z(3.3F, var152, var8);
        g_2 var132 = var131.Y();
        g_2[] var153 = new g_2[]{var21, var37, var60, var21, var82};
        nU var100 = new nU(var114, var132, var153);
        Nf = var100;
    }
}
