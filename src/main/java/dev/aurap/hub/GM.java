package dev.aurap.hub;

import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class GM {
    private final Ci[] ov;
    private final Vector3f CU;
    private final Vector3f m;
    private final Vector3f mR;
    private final Vector3f j;
    private double B;
    private double A;
    private double ZJ;
    private double J;
    private double H;
    private double Q;
    private int Ok;
    public static final int r;

    public GM() {
        Ci[] var1 = new Ci[768];
        this.ov = var1;
        Vector3f var3 = new Vector3f();
        this.CU = var3;
        Vector3f var4 = new Vector3f();
        this.m = var4;
        Vector3f var5 = new Vector3f();
        this.mR = var5;
        Vector3f var6 = new Vector3f();
        this.j = var6;
        var1 = this.ov;
        IntFunction var2 = var0 -> {
            int var1x = r;
            var1x ^= -193348629;
            int var4x = var0 + 1;
            var4x = var0 * var4x;
            int var5x = var0 + 2;
            var4x *= var5x;
            int var3x = var0 + 3;
            var4x *= var3x;
            var3x = var4x & 7;
            if (var3x == 0) {
                switch (var1x) {
                    case -1321138641:
                        var1x ^= -1598350640;
                        break;
                    case -12381372:
                        var1x &= -1314810884;
                        var1x &= 990063292;
                        var1x ^= -114219463;
                        var1x ^= 343654860;
                        break;
                    case 1805324950:
                    default:
                        var1x ^= 2011192440;
                }

                var3x = var0 + 1;
                var3x = var0 * var3x;
                var3x &= 1;
                if (var3x == 0) {
                    return new Ci();
                }
            } else {
                var1x += 116920446;
                var1x |= 574649729;
                var1x += 1910048025;
                var1x *= 1752729025;
                var1x ^= 1880662939;
                long var18 = var0;
                long var27 = var18 + 1L;
                long var28 = var18 * var27;
                long var19 = var28 & 1L;
                long var32;
                var1x = (var32 = var19 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
                if (var1x == 0) {
                    RuntimeException var22 = new RuntimeException();
                    throw var22;
                }
            }

            RuntimeException var21 = new RuntimeException();
            throw var21;
        };
        Arrays.setAll(var1, var2);
    }

    public void oi(WorldDraw var1, double var2, double var4, double var6) {
        int var8 = r;
        var8 ^= 1864657638;
        int var9 = System.identityHashCode(this);
        long var32 = var9;
        long var11 = var32 + 1L;
        var11 = var32 * var11;
        long var13 = var32 + 2L;
        var11 *= var13;
        long var33 = var32 + 3L;
        var11 *= var33;
        long var34 = var11 & 7L;
        long var46;
        var9 = (var46 = var34 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
        if (var9 != 0) {
            var8 &= 1594011759;
            var8 &= 189756800;
            var8 &= -462646911;
            var8 |= -109517961;
            var8 ^= -431698888;
            var9 = var8 + 1;
            var9 = var8 * var9;
            int var10 = var8 + 2;
            var9 *= var10;
            var10 = var8 + 3;
            var9 *= var10;
            var9 &= 7;
            if (var9 == 0) {
                IllegalStateException var41 = new IllegalStateException();
                throw var41;
            }
        } else {
            var8 += -1260478627;
            var8 >>= 15;
            var8 ^= 1296403332;
            Integer var24 = var8;
            if (var24 != null) {
                this.B = var2;
                this.A = var4;
                this.ZJ = var6;
                Projection var26 = var1.projection();
                double var27 = var26.cameraX();
                this.J = var27;
                Projection var28 = var1.projection();
                double var29 = var28.cameraY();
                this.H = var29;
                Projection var30 = var1.projection();
                double var31 = var30.cameraZ();
                this.Q = var31;
                this.Ok = 0;
                return;
            }
        }

        IllegalArgumentException var25 = new IllegalArgumentException();
        throw var25;
    }

    public void uT(
        Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float[][] var9, float var10, float var11, float var12
    ) {
        int var13 = r;
        var13 ^= 1322565344;
        int var15 = System.identityHashCode(this);
        long var16 = var15;
        long var18 = var16 + 1L;
        var18 = var16 * var18;
        long var20 = var16 + 2L;
        var18 *= var20;
        var16 += 3L;
        var18 *= var16;
        var16 = var18 & 7L;
        long var118;
        int var70 = (var118 = var16 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
        int var17 = of_2.l;
        var13 ^= var17;
        var13 ^= 1720137465;
        var17 = of_2.Ab;
        var13 ^= var17;
        var13 ^= -589993299;
        if (var70 != 0) {
            switch (var13) {
                case -2060993011:
                    var13 ^= 790236451;
                    break;
                case -1851099672:
                default:
                    var13 ^= -1610098184;
                    break;
                case 1173231183:
                    var13 -= -607953871;
                    var13 ^= 995061031;
            }
        } else {
            label71: {
                var13 ^= -209248069;
                var13 -= 2100745922;
                var13 ^= -376620892;
                int var71 = var8 + 1;
                int var72 = var8 * var71;
                int var73 = var72 & 1;
                label60:
                if (var73 == 0) {
                    if (var8 > 0) {
                        var13 = switch (var13) {
                            default -> var13 ^ -839714674;
                            case -792766314 -> {
                                var13 ^= -797326794;
                                yield var13 ^ -1053170974;
                            }
                            case 1650561771 -> var13 ^ 2014960961;
                        };
                        var16 = var8;
                        var18 = var16 + 1L;
                        var18 = var16 * var18;
                        var16 = var18 & 1L;
                        long var119;
                        int var76 = (var119 = var16 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                        if (var76 != 0) {
                            break label60;
                        }

                        float var120;
                        int var77 = (var120 = var12 - 0.0F) == 0.0F ? 0 : (var120 < 0.0F ? -1 : 1);
                        var17 = var15 + 1;
                        var17 = var15 * var17;
                        var17 &= 1;
                        if (var17 != 0) {
                            var13 ^= -717037513;
                            var13 ^= 1171803980;
                            break label71;
                        }

                        var13 -= 134185538;
                        var13 ^= -164693533;
                        if (var77 > 0) {
                            var13 *= 1957885735;
                            var13 &= -1444737349;
                            var13 >>= 17;
                            var13 ^= -1027650159;
                            Integer var78 = var8;
                            if (var78 != null) {
                                float var79 = var2 + var5;
                                float var80 = var79 / 2.0F;
                                float var85 = var3 + var6;
                                float var86 = var85 / 2.0F;
                                float var95 = var4 + var7;
                                float var96 = var95 / 2.0F;
                                float var19 = var5 - var2;
                                float var97 = var6 - var3;
                                float var21 = var7 - var4;
                                float var22 = -var97;
                                float[] var23 = var9[0];
                                int var24 = var13 - 1197530616;
                                var24 ^= -1097693378;
                                this.z(
                                    var1, var80, var86, var4, var19, 0.0F, 0.0F, 0.0F, var22, 0.0F, 0.0F, 0.0F, -1.0F, var8, var23, var10, var11, var12, var24
                                );
                                var22 = -var19;
                                float var108 = -var97;
                                float[] var111 = var9[1];
                                int var25 = var13 | 1055437576;
                                var25 >>= 12;
                                var25 -= 648368085;
                                var25 >>>= 2;
                                var25 ^= 2098889611;
                                this.z(
                                    var1, var80, var86, var7, var22, 0.0F, 0.0F, 0.0F, var108, 0.0F, 0.0F, 0.0F, 1.0F, var8, var111, var10, var11, var12, var25
                                );
                                Integer var63 = var15;
                                if (var63 != null) {
                                    var13 ^= -699582494;
                                    var13 &= 1300374787;
                                    var13 += -156675466;
                                    var13 ^= -132957830;
                                    var13 ^= -1006629640;
                                    float var64 = -var21;
                                    var22 = -var97;
                                    var23 = var9[2];
                                    var24 = var13 ^ 1714490100;
                                    var24 ^= 784753960;
                                    this.z(
                                        var1,
                                        var2,
                                        var86,
                                        var96,
                                        0.0F,
                                        0.0F,
                                        var64,
                                        0.0F,
                                        var22,
                                        0.0F,
                                        -1.0F,
                                        0.0F,
                                        0.0F,
                                        var8,
                                        var23,
                                        var10,
                                        var11,
                                        var12,
                                        var24
                                    );
                                    float var65 = -var97;
                                    float[] var98 = var9[3];
                                    int var105 = var13 - 1707071756;
                                    int var106 = var105 & -2001249275;
                                    int var107 = var106 ^ -1006672862;
                                    this.z(
                                        var1,
                                        var5,
                                        var86,
                                        var96,
                                        0.0F,
                                        0.0F,
                                        var21,
                                        0.0F,
                                        var65,
                                        0.0F,
                                        1.0F,
                                        0.0F,
                                        0.0F,
                                        var8,
                                        var98,
                                        var10,
                                        var11,
                                        var12,
                                        var107
                                    );
                                    float[] var66 = var9[4];
                                    var17 = var13 & -60763785;
                                    var17 ^= 1265461588;
                                    this.z(
                                        var1,
                                        var80,
                                        var6,
                                        var96,
                                        var19,
                                        0.0F,
                                        0.0F,
                                        0.0F,
                                        0.0F,
                                        var21,
                                        0.0F,
                                        1.0F,
                                        0.0F,
                                        var8,
                                        var66,
                                        var10,
                                        var11,
                                        var12,
                                        var17
                                    );
                                    float var67 = -var21;
                                    float[] var89 = var9[5];
                                    int var99 = var13 | -845429883;
                                    int var100 = var99 + -1021822028;
                                    int var101 = var100 + 1838524379;
                                    int var102 = var101 ^ 1260684200;
                                    this.z(
                                        var1,
                                        var80,
                                        var3,
                                        var96,
                                        var19,
                                        0.0F,
                                        0.0F,
                                        0.0F,
                                        0.0F,
                                        var67,
                                        0.0F,
                                        -1.0F,
                                        0.0F,
                                        var8,
                                        var89,
                                        var10,
                                        var11,
                                        var12,
                                        var102
                                    );
                                    return;
                                }

                                var13 &= 1750377238;
                                var13 *= 565207505;
                                var13 ^= 1240840489;
                                break label71;
                            }
                            break label60;
                        }

                        var13 <<= 21;
                        var13 ^= -979778120;
                    } else {
                        var13 -= 19717520;
                        var13 <<= 26;
                        var13 ^= 570017208;
                    }

                    Integer var14 = var8;
                    if (var14 != null) {
                        return;
                    }
                }

                AssertionError var62 = new AssertionError();
                throw var62;
            }
        }

        UnsupportedOperationException var61 = new UnsupportedOperationException();
        throw var61;
    }

    private void z(
        Matrix4f var1,
        float var2,
        float var3,
        float var4,
        float var5,
        float var6,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        float var12,
        float var13,
        int var14,
        float[] var15,
        float var16,
        float var17,
        float var18,
        int var19
    ) {
        label74: {
            int var22 = System.identityHashCode(this);
            Vector3f var23 = this.CU;
            var23 = var23.set(var2, var3, var4);
            var23 = var1.transformPosition(var23);
            var23 = this.j;
            var23 = var23.set(var11, var12, var13);
            var23 = var1.transformDirection(var23);
            var23 = var23.normalize();
            double var108 = this.B;
            Vector3f var25 = this.CU;
            float var136 = var25.x;
            double var137 = var136;
            double var109 = var108 + var137;
            double var138 = this.A;
            Vector3f var27 = this.CU;
            float var142 = var27.y;
            double var143 = var142;
            double var139 = var138 + var143;
            double var144 = this.ZJ;
            Vector3f var29 = this.CU;
            float var146 = var29.z;
            double var147 = var146;
            double var145 = var144 + var147;
            Integer var148 = var22;
            if (var148 == null) {
                switch (var19) {
                    case -1662016922:
                    default:
                        int var43 = var19 ^ -1803859511;
                        break;
                    case -1069499240:
                        int var42 = var19 ^ 295003081;
                        break;
                    case 1263347750:
                        int var20 = var19 - 1611964311;
                        var20 ^= 950719307;
                        var20 *= 734720065;
                        var20 ^= 1645140850;
                }
            } else {
                label76: {
                    int var44 = var19 ^ -376794062;
                    var44 &= 1500443517;
                    var44 >>= 7;
                    var44 += 1224590854;
                    var44 ^= 158150483;
                    Integer var149 = var14;
                    if (var149 == null) {
                        break label74;
                    }

                    double var150 = this.J;
                    double var151 = var150 - var109;
                    double var31 = this.H;
                    var31 -= var139;
                    double var33 = this.Q;
                    var33 -= var145;
                    Vector3f var35 = this.j;
                    float var154 = var35.x;
                    double var155 = var154;
                    double var156 = var155 * var151;
                    Vector3f var37 = this.j;
                    float var175 = var37.y;
                    double var176 = var175;
                    double var177 = var176 * var31;
                    double var157 = var156 + var177;
                    var37 = this.j;
                    float var179 = var37.z;
                    double var180 = var179;
                    double var181 = var180 * var33;
                    double var158 = var157 + var181;
                    double var190;
                    int var159 = (var190 = var158 - 0.0) == 0.0 ? 0 : (var190 < 0.0 ? -1 : 1);
                    if (var159 > 0) {
                        var44 ^= 1439924644;
                        var44 &= 436732881;
                        var44 >>>= 19;
                        var44 ^= 763584563;
                        Integer var160 = var14;
                        if (var160 == null) {
                            break label74;
                        }

                        int var161 = this.Ok;
                        Ci[] var36 = this.ov;
                        Integer var182 = var22;
                        if (var182 == null) {
                            var44 += 2146226662;
                            var44 ^= -1918377041;
                            break label76;
                        }

                        var44 += -575252275;
                        var44 ^= 2049543158;
                        int var183 = var14 + 1;
                        int var184 = var14 * var183;
                        int var38 = var14 + 2;
                        int var185 = var184 * var38;
                        var38 = var14 + 3;
                        int var186 = var185 * var38;
                        int var187 = var186 & 7;
                        if (var187 != 0) {
                            break label74;
                        }

                        int var173 = var36.length;
                        if (var161 != var173) {
                            var44 += -884269012;
                            var44 *= 111554771;
                            var44 >>>= 17;
                            var44 >>= 1;
                            var44 ^= -1902228236;
                            int var162 = var14 + 1;
                            int var163 = var14 * var162;
                            int var164 = var163 & 1;
                            if (var164 != 0) {
                                break label74;
                            }

                            var35 = this.m;
                            var35 = var35.set(var5, var6, var7);
                            var35 = var1.transformDirection(var35);
                            var35 = this.mR;
                            var35 = var35.set(var8, var9, var10);
                            var35 = var1.transformDirection(var35);
                            Ci[] var171 = this.ov;
                            int var174 = this.Ok;
                            int var188 = var174 + 1;
                            this.Ok = var188;
                            Ci var172 = var171[var174];
                            var172.S = var109;
                            var172.R = var139;
                            var172.Uc = var145;
                            var23 = this.m;
                            float var111 = var23.x;
                            var172.G = var111;
                            var23 = this.m;
                            float var113 = var23.y;
                            var172.mJ = var113;
                            var23 = this.m;
                            float var115 = var23.z;
                            var172.I = var115;
                            var23 = this.mR;
                            float var117 = var23.x;
                            var172.w = var117;
                            var23 = this.mR;
                            float var119 = var23.y;
                            var172.C = var119;
                            var23 = this.mR;
                            float var121 = var23.z;
                            var172.y = var121;
                            double var122 = var151 * var151;
                            double var140 = var31 * var31;
                            double var123 = var122 + var140;
                            double var141 = var33 * var33;
                            double var124 = var123 + var141;
                            var172.T = var124;
                            int var125 = var22 + 1;
                            int var126 = var22 * var125;
                            int var24 = var22 + 2;
                            int var127 = var126 * var24;
                            var22 += 3;
                            int var128 = var127 * var22;
                            var22 = var128 & 7;
                            if (var22 == 0) {
                                switch (var44) {
                                    case -1902224043:
                                        var44 -= -1098190404;
                                        var44 ^= -1718701571;
                                        var44 ^= -1242085568;
                                        break;
                                    case 1363644421:
                                    default:
                                        var44 ^= -887008439;
                                        break;
                                    case 1543473303:
                                        var44 ^= 850192645;
                                }

                                Integer var83 = var14;
                                if (var83 != null) {
                                    var172.YR = var14;
                                    float var84 = var15[0];
                                    float var85 = var84 / var16;
                                    var172.l = var85;
                                    float var86 = var15[1];
                                    float var87 = var86 / var17;
                                    var172.Xf = var87;
                                    float var88 = var15[2];
                                    float var89 = var88 / var16;
                                    var172.x = var89;
                                    float var90 = var15[3];
                                    float var91 = var90 / var17;
                                    var172.VG = var91;
                                    Vector3f var92 = this.j;
                                    float var93 = var92.y;
                                    float var94 = 0.16F * var93;
                                    float var95 = 0.78F + var94;
                                    var23 = this.j;
                                    float var130 = var23.z;
                                    float var131 = 0.06F * var130;
                                    float var96 = var95 + var131;
                                    float var97 = 255.0F * var96;
                                    int var98 = Math.round(var97);
                                    int var132 = var98 << 16;
                                    int var133 = 0xFF000000 | var132;
                                    var24 = var98 << 8;
                                    int var134 = var133 | var24;
                                    var98 = var134 | var98;
                                    var98 = DP.Y(var98, var18);
                                    var172.v = var98;
                                    return;
                                }
                                break label74;
                            }

                            var44 ^= -103940527;
                            var44 ^= 1468298418;
                            break label76;
                        }

                        switch (var44) {
                            case 590980833:
                            default:
                                var44 ^= -1442272132;
                                break;
                            case 1145356941:
                                var44 ^= 1206153022;
                                break;
                            case 1896886518:
                                var44 ^= 1730001006;
                                var44 &= -646266388;
                                var44 ^= -212497474;
                        }
                    } else {
                        var44 -= 1374062172;
                        var44 ^= -196833037;
                        var44 -= 563837142;
                        var44 <<= 1;
                        var44 ^= 398775198;
                    }

                    Integer var79 = var14;
                    if (var79 != null) {
                        return;
                    }
                    break label74;
                }
            }

            IllegalStateException var101 = new IllegalStateException();
            throw var101;
        }

        IllegalArgumentException var80 = new IllegalArgumentException();
        throw var80;
    }

    public void gf(Canvas var1, WorldDraw var2) {
        label218: {
            int var3 = r;
            var3 ^= -1930661037;
            int var4 = System.identityHashCode(this);
            int var5 = 1;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 != 0) {
                var3 <<= 21;
                var3 -= -1379711227;
                var3 += -747007832;
                var3 ^= -1328908413;
            } else {
                var3 -= 1425621210;
                var3 |= 1337238093;
                var3 ^= -1656543618;
                Integer var173 = var3;
                if (var173 == null) {
                    break label218;
                }

                var5 = var5;
                var3 += -2004085910;
                var3 ^= 111100891;

                label214:
                while (true) {
                    long var174 = var3;
                    long var8 = var174 + 1L;
                    var8 = var174 * var8;
                    long var10 = var174 + 2L;
                    var8 *= var10;
                    long var175 = var174 + 3L;
                    var8 *= var175;
                    long var176 = var8 & 7L;
                    long var290;
                    int var177 = (var290 = var176 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                    if (var177 != 0) {
                        break label218;
                    }

                    var177 = this.Ok;
                    Integer var7 = var4;
                    if (var7 == null) {
                        switch (var3) {
                            case 78450939:
                                var3 ^= 261445725;
                                break label214;
                            case 514785086:
                            default:
                                var3 ^= -1439274005;
                                break label214;
                            case 1842738080:
                                var3 ^= -526466899;
                                var3 >>>= 26;
                                var3 ^= 368852483;
                                break label214;
                        }
                    }

                    var3 *= 1849559575;
                    var3 -= 1420277490;
                    var3 += -1555972715;
                    var3 ^= 158387042;
                    var7 = var3;
                    if (var7 == null) {
                        break label218;
                    }

                    if (var5 >= var177) {
                        var3 *= 1693701469;
                        var3 ^= 1366622744;
                        var3 &= 350753064;
                        var3 ^= 180121784;
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label218;
                        }

                        var1.save();
                        Integer var168 = var4;
                        if (var168 != null) {
                            var3 += -481878489;
                            var3 |= -922299890;
                            var3 |= -816199545;
                            var3 -= 1126044136;
                            var3 ^= -1841173053;
                            var1.additive(0.0F);
                            byte var169 = 0;
                            int var170 = var169;
                            var3 &= 305899798;
                            var3 >>= 19;
                            var3 -= 2046343624;
                            var3 ^= -1423122042;

                            while (true) {
                                long var204 = var3;
                                long var248 = var204 + 1L;
                                var248 = var204 * var248;
                                long var205 = var248 & 1L;
                                long var291;
                                int var206 = (var291 = var205 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                                if (var206 != 0) {
                                    break label218;
                                }

                                var206 = this.Ok;
                                Integer var227 = var4;
                                if (var227 == null) {
                                    var3 += -1298834385;
                                    var3 >>>= 9;
                                    var3 ^= 362012323;
                                    break label214;
                                }

                                var3 >>= 11;
                                var3 ^= -1240476656;
                                Integer var228 = var3;
                                if (var228 == null) {
                                    break label218;
                                }

                                if (var170 >= var206) {
                                    var3 += -132776448;
                                    var3 |= 1094548131;
                                    var3 ^= -1551509429;
                                    var3 ^= 1113025570;
                                    Integer var163 = var3;
                                    if (var163 != null) {
                                        var1.restore();
                                        return;
                                    }
                                    break label218;
                                }

                                var3 |= -1471843944;
                                var3 += 984755127;
                                var3 += -2000694836;
                                var3 |= 961292141;
                                var3 ^= -1201790335;
                                Ci[] var208 = this.ov;
                                Ci var209 = var208[var170];
                                var1.save();
                                double var210 = var209.S;
                                double var250 = var209.R;
                                double var271 = var209.Uc;
                                float var283 = var209.G;
                                double var284 = var283;
                                float var15 = var209.mJ;
                                double var285 = var15;
                                float var17 = var209.I;
                                double var286 = var17;
                                float var19 = var209.w;
                                Integer var20 = var4;
                                if (var20 == null) {
                                    var3 |= 1140276164;
                                    var3 += -761233788;
                                    var3 -= 1795632181;
                                    var3 ^= -1100157925;
                                    break label214;
                                }

                                var3 ^= 1529654050;
                                var3 -= 1774716740;
                                var3 |= -873718701;
                                var3 &= -431276257;
                                var3 ^= -260995812;
                                double var287 = var19;
                                float var21 = var209.C;
                                double var288 = var21;
                                float var23 = var209.y;
                                double var289 = var23;
                                int var211 = var2.plane(var1, var210, var250, var271, var284, var285, var286, var287, var288, var289) ? 1 : 0;
                                if (var211 != 0) {
                                    var3 <<= 27;
                                    var3 ^= 694445339;
                                    Integer var212 = var3;
                                    if (var212 == null) {
                                        break label218;
                                    }

                                    var211 = var209.YR;
                                    float var229 = var209.l;
                                    float var251 = var209.Xf;
                                    Integer var255 = var4;
                                    if (var255 == null) {
                                        switch (var3) {
                                            case -1722033773:
                                                var3 ^= 1848246739;
                                                break label214;
                                            case 291792155:
                                                var3 ^= -2067553663;
                                                var3 -= -1938645668;
                                                var3 ^= 1034153521;
                                                var3 ^= 560658991;
                                                break label214;
                                            case 816377351:
                                            default:
                                                var3 ^= 220779636;
                                                break label214;
                                        }
                                    }

                                    var3 &= -331078783;
                                    var3 ^= -1701004747;
                                    int var256 = var3 + 1;
                                    int var257 = var3 * var256;
                                    int var272 = var3 + 2;
                                    int var258 = var257 * var272;
                                    int var273 = var3 + 3;
                                    int var259 = var258 * var273;
                                    int var260 = var259 & 7;
                                    if (var260 != 0) {
                                        break label218;
                                    }

                                    float var261 = var209.x;
                                    float var274 = var209.VG;
                                    var177 = var209.v;
                                    var1.image(var211, -0.5F, -0.5F, 1.0F, 1.0F, var229, var251, var261, var274, var177, 0.0F, false);
                                    var3 *= 829442935;
                                    var3 ^= 1951735430;
                                } else {
                                    var3 *= 1600461563;
                                    var3 &= 598658011;
                                    var3 -= 512669864;
                                    var3 ^= 1061203355;
                                }

                                long var187 = var3;
                                var8 = var187 + 1L;
                                var8 = var187 * var8;
                                long var188 = var8 & 1L;
                                long var292;
                                var177 = (var292 = var188 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                                if (var177 != 0) {
                                    break label218;
                                }

                                var1.restore();
                                var177 = var4 + 1;
                                var177 = var4 * var177;
                                var211 = var4 + 2;
                                var177 *= var211;
                                var211 = var4 + 3;
                                var177 *= var211;
                                var177 &= 7;
                                if (var177 != 0) {
                                    var3 *= -1223915635;
                                    var3 >>>= 28;
                                    var3 ^= 368852527;
                                    break label214;
                                }

                                var3 |= -259164377;
                                var3 &= 344061699;
                                var3 ^= 502003818;
                                var177 = var170 + 1;
                                var170 = var177;
                                var3 >>>= 10;
                                var3 ^= 757723993;
                            }
                        } else {
                            switch (var3) {
                                case -469394445:
                                    var3 ^= -1616067991;
                                    break label214;
                                case 472797072:
                                default:
                                    var3 ^= -1136221584;
                                    break label214;
                                case 513565080:
                                    var3 *= 2124056701;
                                    var3 *= -1120061833;
                                    var3 += -1731760534;
                                    var3 += -1975779141;
                                    var3 ^= -1083112435;
                                    break label214;
                            }
                        }
                    }

                    var3 ^= 616365116;
                    var3 ^= 227097753;
                    var177 = var3 + 1;
                    var177 = var3 * var177;
                    var177 &= 1;
                    if (var177 != 0) {
                        break label218;
                    }

                    Ci[] var182 = this.ov;
                    long var197 = var4;
                    long var9 = var197 + 1L;
                    var9 = var197 * var9;
                    long var198 = var9 & 1L;
                    long var293;
                    int var199 = (var293 = var198 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                    if (var199 != 0) {
                        switch (var3) {
                            case 941794769:
                                var3 ^= 1799177396;
                                break label214;
                            case 1243896069:
                            default:
                                var3 ^= 1356200679;
                                break label214;
                            case 1766990276:
                                var3 ^= 212135762;
                                var3 &= 526935156;
                                var3 |= 1984292506;
                                var3 ^= 1654249662;
                                break label214;
                        }
                    }

                    var3 -= -1153197188;
                    var3 <<= 4;
                    var3 ^= 763654771;
                    Ci var183 = var182[var5];
                    Ci var184 = var183;
                    var199 = var5 - 1;
                    var199 = var199;
                    var3 -= 1395141146;
                    var3 ^= -12116375;

                    while (true) {
                        Integer var219 = var3;
                        if (var219 == null) {
                            break label218;
                        }

                        if (var199 >= 0) {
                            var3 = switch (var3) {
                                case -2063273296 -> {
                                    var3 &= -904192763;
                                    var3 ^= -998935731;
                                    var3 &= 568550323;
                                    yield var3 ^ -1362336842;
                                }
                                case 992687632 -> var3 ^ -948417253;
                                default -> var3 ^ -1688769888;
                            };
                            Ci[] var220 = this.ov;
                            Ci var221 = var220[var199];
                            double var222 = var221.T;
                            double var252 = var184.T;
                            Integer var12 = var4;
                            if (var12 == null) {
                                var3 ^= -760654440;
                                var3 ^= 1777888015;
                                break label214;
                            }

                            var3 += -1527110581;
                            var3 |= -1663642312;
                            var3 ^= -577407761;
                            int var275 = var3 + 1;
                            var275 = var3 * var275;
                            int var13 = var3 + 2;
                            var275 *= var13;
                            var13 = var3 + 3;
                            var275 *= var13;
                            var275 &= 7;
                            if (var275 != 0) {
                                break label218;
                            }

                            double var294;
                            int var223 = (var294 = var222 - var252) == 0.0 ? 0 : (var294 < 0.0 ? -1 : 1);
                            if (var223 < 0) {
                                var3 += -2096865443;
                                var3 <<= 5;
                                var3 *= 1895384563;
                                var3 -= 2029580125;
                                var3 ^= -1629186871;
                                Ci[] var224 = this.ov;
                                var9 = var4;
                                long var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var9 = var11 & 1L;
                                long var295;
                                int var235 = (var295 = var9 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                                if (var235 != 0) {
                                    var3 -= -1664242765;
                                    var3 *= -1635315939;
                                    var3 += 1285105883;
                                    var3 ^= -1311981834;
                                    break label214;
                                }
                                var3 = switch (var3) {
                                    case -1201009750 -> {
                                        var3 ^= -1354082722;
                                        var3 -= -1863265545;
                                        yield var3 ^ -267766120;
                                    }
                                    case -140924816 -> var3 ^ 69304104;
                                    default -> var3 ^ -1204974509;
                                };
                                var9 = var3;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                long var281 = var9 + 2L;
                                var11 *= var281;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var296;
                                int var239 = (var296 = var9 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                if (var239 != 0) {
                                    break label218;
                                }

                                int var240 = var199 + 1;
                                Ci[] var253 = this.ov;
                                Ci var254 = var253[var199];
                                var224[var240] = var254;
                                int var225 = var199 + -1;
                                var199 = var225;
                                var3 *= 879102521;
                                var3 |= -1926639418;
                                var3 <<= 30;
                                var3 -= -1731456275;
                                var3 ^= -1573445725;
                                continue;
                            }

                            switch (var3) {
                                case -69451993:
                                default:
                                    var3 ^= -436133353;
                                    break;
                                case 40010197:
                                    var3 <<= 6;
                                    var3 ^= 436735077;
                                    break;
                                case 796196387:
                                    var3 ^= -134900402;
                            }
                        } else {
                            var3 -= 919315077;
                            var3 ^= -862902002;
                        }

                        Ci[] var226 = this.ov;
                        var199++;
                        int var241 = var4 + 1;
                        int var242 = var4 * var241;
                        int var243 = var242 & 1;
                        if (var243 != 0) {
                            switch (var3) {
                                case -2102888155:
                                    var3 *= 847190589;
                                    var3 |= 1048555786;
                                    var3 &= 1693877425;
                                    var3 -= 1087309063;
                                    var3 ^= -237289046;
                                    break label214;
                                case 1256947888:
                                    var3 ^= -448180084;
                                    break label214;
                                case 1919330228:
                                default:
                                    var3 ^= -397651125;
                                    break label214;
                            }
                        }

                        var3 ^= 1770371447;
                        var3 ^= -1223428181;
                        var9 = var3;
                        long var267 = var9 + 1L;
                        var267 = var9 * var267;
                        long var282 = var9 + 2L;
                        var267 *= var282;
                        var9 += 3L;
                        var267 *= var9;
                        var9 = var267 & 7L;
                        long var297;
                        int var247 = (var297 = var9 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                        if (var247 != 0) {
                            break label218;
                        }

                        var226[var199] = var184;
                        var199 = var5 + 1;
                        var5 = var199;
                        switch (var3) {
                            case 573452206:
                            default:
                                var3 ^= -1308108172;
                                continue label214;
                            case 908135072:
                                var3 ^= -239310241;
                                continue label214;
                            case 1547581433:
                                var3 |= -876796688;
                                var3 |= 1154408263;
                                var3 ^= -1305867169;
                                continue label214;
                        }
                    }
                }
            }

            RuntimeException var161 = new RuntimeException();
            throw var161;
        }

        RuntimeException var162 = new RuntimeException();
        throw var162;
    }

    public static float[][] ee(int var0, int var1, int var2, int var3, int var4) {
        int var5 = r;
        var5 ^= -1361677706;
        float[][] var8 = new float[6][];
        float[] var9 = new float[4];
        int var10 = var0 + var4;
        float var101 = var10;
        var9[0] = var101;
        var10 = var1 + var4;
        float var103 = var10;
        var9[1] = var103;
        long var104 = var0;
        long var12 = var104 + 1L;
        var12 = var104 * var12;
        long var105 = var12 & 1L;
        long var111;
        int var7 = (var111 = var105 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
        if (var7 == 0) {
            switch (var5) {
                case -1511204135:
                    var5 *= 1370250885;
                    var5 ^= 904094237;
                    var5 += 1105306900;
                    var5 >>= 11;
                    var5 ^= -962382816;
                    break;
                case -1025028979:
                default:
                    var5 ^= -350638932;
                    break;
                case 944371898:
                    var5 ^= 517369607;
            }

            long var106 = var0;
            var12 = var106 + 1L;
            var12 = var106 * var12;
            long var107 = var12 & 1L;
            long var112;
            var7 = (var112 = var107 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
            if (var7 == 0) {
                var7 = var0 + var4;
                var7 += var2;
                float var39 = var7;
                var9[2] = var39;
                var7 = var1 + var4;
                var7 += var3;
                float var42 = var7;
                var9[3] = var42;
                var8[0] = var9;
                float[] var43 = new float[4];
                int var49 = var0 + var4;
                int var50 = var49 + var2;
                int var51 = var50 + var4;
                float var52 = var51;
                var43[0] = var52;
                int var53 = var1 + var4;
                float var54 = var53;
                var43[1] = var54;
                int var55 = var0 + var4;
                int var56 = var55 + var2;
                int var57 = var56 + var4;
                int var58 = var57 + var2;
                float var59 = var58;
                var43[2] = var59;
                int var60 = var1 + var4;
                int var61 = var60 + var3;
                float var62 = var61;
                var43[3] = var62;
                var8[1] = var43;
                float[] var44 = new float[4];
                float var63 = var0;
                var44[0] = var63;
                int var64 = var1 + var4;
                float var65 = var64;
                var44[1] = var65;
                int var66 = var0 + var4;
                float var67 = var66;
                var44[2] = var67;
                int var68 = var1 + var4;
                int var69 = var68 + var3;
                float var70 = var69;
                var44[3] = var70;
                var8[2] = var44;
                float[] var45 = new float[4];
                int var71 = var0 + var4;
                int var72 = var71 + var2;
                float var73 = var72;
                var45[0] = var73;
                int var74 = var1 + var4;
                float var75 = var74;
                var45[1] = var75;
                int var76 = var0 + var4;
                int var77 = var76 + var2;
                int var78 = var77 + var4;
                float var79 = var78;
                var45[2] = var79;
                int var80 = var1 + var4;
                int var81 = var80 + var3;
                float var82 = var81;
                var45[3] = var82;
                var8[3] = var45;
                float[] var46 = new float[4];
                int var83 = var0 + var4;
                float var84 = var83;
                var46[0] = var84;
                float var85 = var1;
                var46[1] = var85;
                int var86 = var0 + var4;
                int var87 = var86 + var2;
                float var88 = var87;
                var46[2] = var88;
                int var89 = var1 + var4;
                float var90 = var89;
                var46[3] = var90;
                var8[4] = var46;
                float[] var47 = new float[4];
                int var91 = var0 + var4;
                int var92 = var91 + var2;
                float var93 = var92;
                var47[0] = var93;
                int var94 = var1 + var4;
                float var95 = var94;
                var47[1] = var95;
                int var96 = var0 + var4;
                int var97 = var96 + var2;
                int var98 = var97 + var2;
                float var99 = var98;
                var47[2] = var99;
                float var100 = var1;
                var47[3] = var100;
                var8[5] = var47;
                return var8;
            }
        } else {
            switch (var5) {
                case -1511204135:
                    var5 *= -2113484525;
                    var5 |= 1206280688;
                    var5 |= 1928456800;
                    var5 += -742482074;
                    var5 ^= -1348595069;
                    break;
                case 829774606:
                    var5 ^= 843588407;
                    break;
                case 2010406548:
                default:
                    var5 ^= -206167428;
            }

            var5 = var0 + 1;
            var5 = var0 * var5;
            var7 = var0 + 2;
            var5 *= var7;
            int var6 = var0 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 == 0) {
                IllegalStateException var35 = new IllegalStateException();
                throw var35;
            }
        }

        IllegalArgumentException var34 = new IllegalArgumentException();
        throw var34;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1875394409;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        r = var4;
    }
}
