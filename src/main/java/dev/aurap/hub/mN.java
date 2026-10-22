package dev.aurap.hub;

import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public final class mN {
    private static final SpriteShape[] Q;
    private static final bA_2[] v;
    private static final float G = 14.0F;
    private static final float EN = 0.1F;
    private static final float Wj = 3.6F;
    private static final float F = 1.0F;
    private static final float KO = 0.9090909F;
    private static final float o = 0.6F;
    private final int Kw;
    private final double[] H;
    private final double[] Vf;
    private final double[] j;
    private final float[] Sz;
    private final float[] eu;
    private final float[] m;
    private final float[] N;
    private final float[] b;
    private final float[] AD;
    private final float[] r;
    private final float[] Gf;
    private final float[] e;
    private final int[] RX;
    private final byte[] ja;
    private final byte[] bB;
    private int Ww;
    private ka MW;
    private float k;
    private boolean TX;
    public static final int uH;

    public mN(int var1) {
        ka var2 = ka.ALPHA;
        this.MW = var2;
        this.Kw = var1;
        double[] var3 = new double[var1];
        this.H = var3;
        double[] var4 = new double[var1];
        this.Vf = var4;
        double[] var5 = new double[var1];
        this.j = var5;
        float[] var6 = new float[var1];
        this.Sz = var6;
        float[] var7 = new float[var1];
        this.eu = var7;
        float[] var8 = new float[var1];
        this.m = var8;
        float[] var9 = new float[var1];
        this.N = var9;
        float[] var10 = new float[var1];
        this.b = var10;
        float[] var11 = new float[var1];
        this.AD = var11;
        float[] var12 = new float[var1];
        this.r = var12;
        float[] var13 = new float[var1];
        this.Gf = var13;
        float[] var14 = new float[var1];
        this.e = var14;
        int[] var15 = new int[var1];
        this.RX = var15;
        byte[] var16 = new byte[var1];
        this.ja = var16;
        byte[] var17 = new byte[var1];
        this.bB = var17;
    }

    public void Vs(ka var1, float var2, boolean var3) {
        int var4 = uH;
        var4 ^= -1258303170;
        int var5 = System.identityHashCode(this);
        this.MW = var1;
        float var6 = TP.t(var2, 0.0F, 0.95F);
        int var7 = var5 + 1;
        var7 = var5 * var7;
        int var8 = var5 + 2;
        var7 *= var8;
        var5 += 3;
        var7 *= var5;
        var5 = var7 & 7;
        var7 = of_2.sZ;
        var4 ^= var7;
        var4 ^= 1468362197;
        of_2.sZ = 1468362197;
        var7 = of_2.XH;
        var4 ^= var7;
        var4 ^= -1875319654;
        of_2.XH = -1875319654;
        if (var5 != 0) {
            var4 <<= 4;
            var4 <<= 6;
            var4 ^= 341980308;
            var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            if (var5 == 0) {
                UnsupportedOperationException var27 = new UnsupportedOperationException();
                throw var27;
            }
        } else {
            var4 += 4493578;
            var4 ^= 1599533538;
            var5 = var4 + 1;
            var5 = var4 * var5;
            var7 = var4 + 2;
            var5 *= var7;
            var4 += 3;
            var5 *= var4;
            var4 = var5 & 7;
            if (var4 == 0) {
                this.k = var6;
                this.TX = var3;
                return;
            }
        }

        IllegalStateException var21 = new IllegalStateException();
        throw var21;
    }

    public void q(
        double var1,
        double var3,
        double var5,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        float var12,
        float var13,
        SpriteShape var14,
        bA_2 var15,
        float var16
    ) {
        int var17 = uH;
        var17 ^= -373830526;
        int var18 = System.identityHashCode(this);
        Integer var28 = var18;
        if (var28 == null) {
            var17 &= -60424161;
            var17 ^= -1878416862;
            var17 ^= -1046673117;
            var28 = var17;
            if (var28 != null) {
                AssertionError var30 = new AssertionError();
                throw var30;
            }
        } else {
            var17 |= 1589176826;
            var17 >>>= 5;
            var17 ^= 1747012293;
            Integer var26 = var17;
            if (var26 != null) {
                this.B(var1, var3, var5, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, 0);
                return;
            }
        }

        IllegalStateException var27 = new IllegalStateException();
        throw var27;
    }

    public void B(
        double var1,
        double var3,
        double var5,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        float var12,
        float var13,
        SpriteShape var14,
        bA_2 var15,
        float var16,
        int var17
    ) {
        label61: {
            int var18 = uH;
            var18 ^= -539443314;
            int var20 = System.identityHashCode(this);
            int var21 = this.Ww;
            int var22 = this.Ww;
            var22++;
            int var23 = this.Kw;
            var22 %= var23;
            this.Ww = var22;
            double[] var76 = this.H;
            var76[var21] = var1;
            double[] var77 = this.Vf;
            var77[var21] = var3;
            double[] var78 = this.j;
            var78[var21] = var5;
            float[] var79 = this.Sz;
            var79[var21] = var7;
            float[] var80 = this.eu;
            var80[var21] = var8;
            float[] var81 = this.m;
            var81[var21] = var9;
            float[] var82 = this.N;
            var82[var21] = 0.0F;
            float[] var83 = this.b;
            var83[var21] = var10;
            float[] var84 = this.AD;
            var84[var21] = var11;
            float[] var85 = this.r;
            Integer var92 = var20;
            label60:
            if (var92 != null) {
                var18 ^= 163585555;
                var18 ^= 113750978;
                long var93 = var17;
                long var25 = var93 + 1L;
                var25 = var93 * var25;
                long var27 = var93 + 2L;
                var25 *= var27;
                long var94 = var93 + 3L;
                var25 *= var94;
                long var95 = var25 & 7L;
                long var112;
                int var96 = (var112 = var95 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                if (var96 != 0) {
                    break label61;
                }

                var85[var21] = var12;
                float[] var86 = this.Gf;
                var86[var21] = var13;
                float[] var87 = this.e;
                var87[var21] = var16;
                int[] var88 = this.RX;
                if (var17 == 0) {
                    var18 -= -1586515448;
                    var18 *= -837385411;
                    var18 &= -1833053558;
                    var18 ^= -1538536736;
                    var96 = 0;
                    switch (var18) {
                        case -1225881494:
                            var18 *= -110507015;
                            var18 ^= -569534504;
                            break;
                        case 42904441:
                            var18 ^= 236807702;
                            break;
                        case 1415306780:
                        default:
                            var18 ^= -2042031321;
                    }
                } else {
                    var18 &= -1949606808;
                    var18 -= -168160140;
                    var18 ^= 1083637317;
                    Integer var24 = var17;
                    if (var24 == null) {
                        break label61;
                    }

                    int var99 = var17 | 0xFF000000;
                    Integer var110 = var20;
                    if (var110 == null) {
                        var18 *= 1423249165;
                        var18 ^= -509957521;
                        break label60;
                    }

                    var18 ^= -1048546128;
                    var18 += 332782226;
                    var18 *= 770166427;
                    var18 ^= -231407670;
                    var96 = var99;
                    var18 <<= 18;
                    var18 &= -1317805021;
                    var18 &= 1529314481;
                    var18 >>>= 23;
                    var18 ^= -5952798;
                }

                long var100 = var17;
                long var26 = var100 + 1L;
                var26 = var100 * var26;
                var100 = var26 & 1L;
                long var113;
                int var102 = (var113 = var100 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
                if (var102 != 0) {
                    break label61;
                }

                var88[var21] = var96;
                byte[] var89 = this.ja;
                var96 = var14.ordinal();
                int var103 = var20 + 1;
                int var104 = var20 * var103;
                var20 = var104 & 1;
                if (var20 == 0) {
                    var18 += 344432940;
                    var18 ^= -1594954334;
                    var20 = var17 + 1;
                    var20 = var17 * var20;
                    int var105 = var17 + 2;
                    var20 *= var105;
                    int var106 = var17 + 3;
                    var20 *= var106;
                    var20 &= 7;
                    if (var20 == 0) {
                        byte var72 = (byte)var96;
                        var89[var21] = var72;
                        byte[] var73 = this.bB;
                        var22 = var15.ordinal();
                        byte var91 = (byte)var22;
                        var73[var21] = var91;
                        return;
                    }
                    break label61;
                }

                switch (var18) {
                    case -5952830:
                        var18 *= 1265194447;
                        var18 &= 1543390373;
                        var18 += 1425201938;
                        var18 ^= -1014063452;
                        break;
                    case 1466968753:
                    default:
                        var18 ^= 1480581079;
                        break;
                    case 2098957062:
                        var18 ^= -570647282;
                }
            } else {
                var18 ^= 1599916930;
                var18 ^= 92567595;
            }

            var18 = var17 + 1;
            var18 = var17 * var18;
            var18 &= 1;
            if (var18 == 0) {
                IllegalStateException var65 = new IllegalStateException();
                throw var65;
            }
        }

        AssertionError var64 = new AssertionError();
        throw var64;
    }

    public void wW() {
        int var1 = uH;
        var1 ^= 1311832676;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var28;
        var2 = (var28 = var21 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        int var3 = of_2.sZ;
        var1 ^= var3;
        var1 ^= 1468362197;
        var3 = of_2.XH;
        var1 ^= var3;
        var1 ^= -1875319654;
        if (var2 == 0) {
            Integer var23 = switch (var1) {
                case -1761773711 -> {
                    var1 |= -1001539051;
                    var1 |= -555401607;
                    var1 >>= 22;
                    yield var1 ^ 1290141452;
                }
                case -562787234 -> var1 ^ -956312556;
                default -> var1 ^ 1708438647;
            };
            if (var23 == null) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            } else {
                float[] var24 = this.b;
                Arrays.fill(var24, 0.0F);
            }
        } else {
            var1 |= -679986938;
            var1 += -1330658971;
            var1 *= 1664081473;
            var1 ^= -1677874592;
            AssertionError var15 = new AssertionError();
            throw var15;
        }
    }

    public int qi() {
        label117: {
            int var1 = uH;
            var1 ^= 940186760;
            int var2 = System.identityHashCode(this);
            int var3 = 0;
            int var4 = 0;
            int var5 = var2 + 1;
            var5 = var2 * var5;
            int var6 = var2 + 2;
            var5 *= var6;
            var6 = var2 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                var1 *= -369966769;
                var1 ^= -1064185227;
            } else {
                var1 >>>= 1;
                var1 |= -1278392614;
                var1 >>>= 14;
                var1 ^= -670197921;
                Integer var73 = var1;
                if (var73 == null) {
                    break label117;
                }

                var3 = var3;
                var4 = var4;
                var1 ^= -1224261833;
                var1 ^= 553003554;
                var1 -= -1307824672;
                var1 ^= 1350170562;

                label109:
                while (true) {
                    int var74 = var1 + 1;
                    var74 = var1 * var74;
                    var74 &= 1;
                    if (var74 != 0) {
                        break label117;
                    }

                    var74 = this.Kw;
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    int var7 = var2 + 2;
                    var6 *= var7;
                    var7 = var2 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        var1 |= -1037278534;
                        var1 -= -1934331352;
                        var1 ^= -542368815;
                        break;
                    }

                    var1 |= 132726029;
                    var1 <<= 12;
                    var1 &= 2146169466;
                    var1 ^= 397314254;
                    if (var4 >= var74) {
                        var1 += -1516980919;
                        var1 ^= 1432167187;
                        var2 = var1 + 1;
                        var2 = var1 * var2;
                        var1 = var2 & 1;
                        if (var1 == 0) {
                            return var3;
                        }
                        break label117;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ 1911236515;
                        case 675772622 -> {
                            var1 ^= 90546104;
                            yield var1 ^ 1185380178;
                        }
                        case 1058835881 -> var1 ^ 135153873;
                    };
                    float[] var78 = this.b;
                    float var79 = var78[var4];
                    float var117;
                    var74 = (var117 = var79 - 0.0F) == 0.0F ? 0 : (var117 < 0.0F ? -1 : 1);
                    Integer var94 = var2;
                    if (var94 == null) {
                        var1 &= 1334652547;
                        var1 += 1649156091;
                        var1 &= -596841886;
                        var1 ^= 286692452;
                        break;
                    }
                    var1 = switch (var1) {
                        case 390633326 -> var1 ^ 1314541671;
                        default -> var1 ^ 823134447;
                        case 1803915300 -> {
                            var1 ^= 624621862;
                            var1 ^= -1671869408;
                            yield var1 ^ 748122276;
                        }
                    };
                    int var95 = var1 + 1;
                    var95 = var1 * var95;
                    var95 &= 1;
                    if (var95 != 0) {
                        break label117;
                    }

                    if (var74 > 0) {
                        var1 += -951597738;
                        var1 ^= -1738089112;
                        var74 = var1 + 1;
                        var74 = var1 * var74;
                        var95 = var1 + 2;
                        var74 *= var95;
                        var95 = var1 + 3;
                        var74 *= var95;
                        var74 &= 7;
                        if (var74 != 0) {
                            break label117;
                        }

                        var74 = var3 + 1;
                        Integer var100 = var2;
                        if (var100 == null) {
                            var1 -= -1508323777;
                            var1 ^= 714106739;
                            break;
                        }

                        var1 *= 2014055661;
                        var1 &= 1681949841;
                        var1 ^= -552381666;
                        var74 = var74;
                        switch (var1) {
                            case -719642833:
                            default:
                                var1 ^= -1112385116;
                                break;
                            case -11316322:
                                var1 += -902525391;
                                var1 >>= 6;
                                var1 -= 1824367212;
                                var1 ^= 1206017007;
                                break;
                            case 593444136:
                                var1 ^= -2013906204;
                        }
                    } else {
                        var1 |= 1471108632;
                        var1 ^= 903413425;
                        Integer var101 = var1;
                        if (var101 == null) {
                            break label117;
                        }

                        var74 = var3;
                        switch (var1) {
                            case -903370449:
                                var1 *= -621621047;
                                var1 >>>= 13;
                                var1 *= -1790983163;
                                var1 += -1611396627;
                                var1 ^= -345831975;
                                break;
                            case -123062199:
                                var1 ^= 1700307220;
                                break;
                            case 1667959305:
                            default:
                                var1 ^= 1420946601;
                        }
                    }

                    long var102 = var1;
                    long var8 = var102 + 1L;
                    var8 = var102 * var8;
                    long var10 = var102 + 2L;
                    var8 *= var10;
                    long var103 = var102 + 3L;
                    var8 *= var103;
                    long var104 = var8 & 7L;
                    long var118;
                    var95 = (var118 = var104 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                    if (var95 != 0) {
                        break label117;
                    }

                    var95 = var4 + 1;
                    long var108 = var2;
                    long var9 = var108 + 1L;
                    var9 = var108 * var9;
                    long var109 = var9 & 1L;
                    long var119;
                    var7 = (var119 = var109 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        switch (var1) {
                            case -712366348:
                                var1 += 991748992;
                                var1 &= 648738653;
                                var1 *= -1498859513;
                                var1 ^= -348983734;
                                break label109;
                            case 1695057059:
                                var1 ^= 1316134965;
                                break label109;
                            case 2133728282:
                            default:
                                var1 ^= 1088058388;
                                break label109;
                        }
                    }

                    var1 &= 1561300402;
                    var1 |= 1079524547;
                    var1 += 1944796999;
                    var1 ^= 1060037678;
                    var3 = var74;
                    var4 = var95;
                    var1 *= 710421201;
                    var1 ^= -1373591677;
                }
            }

            Integer var111 = var1;
            if (var111 != null) {
                RuntimeException var112 = new RuntimeException();
                throw var112;
            }
        }

        IllegalArgumentException var64 = new IllegalArgumentException();
        throw var64;
    }

    public void h(Canvas var1, WorldDraw var2, float var3, double var4, zS var6, float var7) {
        label400: {
            int var8 = uH;
            var8 ^= 971556789;
            int var9 = System.identityHashCode(this);
            float var10 = -2.1F * var3;
            double var271 = var10;
            double var272 = Math.exp(var271);
            var10 = (float)var272;
            var10 = var10;
            float var11 = -3.25F * var3;
            double var275 = var11;
            double var276 = Math.exp(var275);
            var11 = (float)var276;
            int var12 = var9 + 1;
            var12 = var9 * var12;
            var12 &= 1;
            if (var12 != 0) {
                var8 |= 1151457108;
                var8 |= 18297773;
                var8 -= 358159193;
                var8 -= 1872993782;
                var8 ^= -172579936;
            } else {
                var8 = switch (var8) {
                    case -1339161175 -> var8 ^ -846392322;
                    default -> var8 ^ -1179068402;
                    case -517649760 -> {
                        var8 |= 2048573059;
                        var8 *= 586506829;
                        var8 -= 833296620;
                        var8 -= -1053221325;
                        yield var8 ^ 694796150;
                    }
                };
                var11 = var11;
                float var281 = -0.1F * var3;
                double var282 = var281;
                double var283 = Math.exp(var282);
                float var284 = (float)var283;
                float var285 = var284;
                var1.save();
                var1.additive(var7);
                int var13 = 0;
                var13 = var13;
                var8 += -942373244;
                var8 += 655165331;
                var8 -= 1243829555;
                var8 ^= -385406602;

                label378:
                while (true) {
                    int var14 = var8 + 1;
                    var14 = var8 * var14;
                    int var15 = var8 + 2;
                    var14 *= var15;
                    var15 = var8 + 3;
                    var14 *= var15;
                    var14 &= 7;
                    if (var14 != 0) {
                        break label400;
                    }

                    var14 = this.Kw;
                    var15 = var9 + 1;
                    var15 = var9 * var15;
                    var15 &= 1;
                    if (var15 != 0) {
                        var8 ^= 776962920;
                        var8 ^= 1446966418;
                        break;
                    }

                    var8 *= -1453109497;
                    var8 ^= -491929045;
                    var8 ^= 1476475219;
                    var8 ^= 571372436;
                    if (var13 >= var14) {
                        Integer var261 = switch (var8) {
                            case -1994088922 -> var8 ^ 1966045282;
                            default -> var8 ^ -1729007177;
                            case 1781989440 -> {
                                var8 += -741314280;
                                yield var8 ^ -112551521;
                            }
                        };
                        if (var261 != null) {
                            var1.restore();
                            return;
                        }
                        break label400;
                    }

                    var8 >>>= 4;
                    var8 *= 2099154295;
                    var8 *= -1246529575;
                    var8 ^= -1285808359;
                    float[] var292 = this.b;
                    float var293 = var292[var13];
                    Integer var333 = var9;
                    if (var333 == null) {
                        var8 *= -414048383;
                        var8 ^= 2053965759;
                        var8 ^= -473744556;
                        break;
                    }

                    var8 &= 1718776388;
                    var8 *= 1604218331;
                    var8 ^= -1697449679;
                    float var566;
                    var14 = (var566 = var293 - 0.0F) == 0.0F ? 0 : (var566 < 0.0F ? -1 : 1);
                    if (var14 <= 0) {
                        var8 -= -1404894339;
                        var8 *= 2005174595;
                        var8 >>= 12;
                        var8 ^= 1033235675;
                        long var295 = var8;
                        long var16 = var295 + 1L;
                        var16 = var295 * var16;
                        long var18 = var295 + 2L;
                        var16 *= var18;
                        long var296 = var295 + 3L;
                        var16 *= var296;
                        long var297 = var16 & 7L;
                        long var567;
                        var14 = (var567 = var297 - 0L) == 0L ? 0 : (var567 < 0L ? -1 : 1);
                        if (var14 != 0) {
                            break label400;
                        }

                        var8 -= -1147461580;
                        var8 ^= -875867403;
                    } else {
                        var8 ^= 262505751;
                        var8 &= 1251863082;
                        var8 ^= -783016474;
                        float[] var299 = this.N;
                        float var334 = var299[var13];
                        float var335 = var334 + var3;
                        var299[var13] = var335;
                        float[] var300 = this.N;
                        float var301 = var300[var13];
                        int var336 = var9 + 1;
                        var336 = var9 * var336;
                        int var367 = var9 + 2;
                        var336 *= var367;
                        var367 = var9 + 3;
                        var336 *= var367;
                        var336 &= 7;
                        if (var336 != 0) {
                            var8 |= 296453737;
                            var8 += 1429825811;
                            var8 ^= 2050278414;
                            break;
                        }

                        var8 <<= 17;
                        var8 += -1942335760;
                        var8 += 1919567657;
                        var8 |= 2089968919;
                        var8 ^= 1857187583;
                        long var341 = var8;
                        long var17 = var341 + 1L;
                        var17 = var341 * var17;
                        long var342 = var17 & 1L;
                        long var568;
                        var336 = (var568 = var342 - 0L) == 0L ? 0 : (var568 < 0L ? -1 : 1);
                        if (var336 != 0) {
                            break label400;
                        }

                        float[] var344 = this.b;
                        float var345 = var344[var13];
                        float var569;
                        var14 = (var569 = var301 - var345) == 0.0F ? 0 : (var569 < 0.0F ? -1 : 1);
                        if (var14 >= 0) {
                            var8 = switch (var8) {
                                case -1317295234 -> var8 ^ -854211484;
                                case 273455584 -> {
                                    var8 &= -1522372133;
                                    var8 &= -42662789;
                                    var8 &= 337584246;
                                    var8 >>>= 4;
                                    yield var8 ^ 2130044102;
                                }
                                default -> var8 ^ 159223346;
                            };
                            float[] var303 = this.b;
                            long var346 = var9;
                            var17 = var346 + 1L;
                            var17 = var346 * var17;
                            long var347 = var17 & 1L;
                            long var570;
                            var336 = (var570 = var347 - 0L) == 0L ? 0 : (var570 < 0L ? -1 : 1);
                            if (var336 != 0) {
                                var8 <<= 18;
                                var8 ^= 101051662;
                                break;
                            }
                            var8 = switch (var8) {
                                default -> var8 ^ 607324298;
                                case 458958649 -> var8 ^ 89266465;
                                case 2130044098 -> {
                                    var8 ^= 1261220377;
                                    var8 >>>= 5;
                                    yield var8 ^ 1603472497;
                                }
                            };
                            var303[var13] = 0.0F;
                            var8 >>= 5;
                            var8 >>= 18;
                            var8 *= -371364993;
                            var8 += 1664811798;
                            var8 ^= -322294526;
                        } else {
                            var8 = switch (var8) {
                                default -> var8 ^ -1096537936;
                                case -1574221273 -> var8 ^ -1646764055;
                                case 273455584 -> {
                                    var8 += 73404184;
                                    var8 ^= -295117154;
                                    yield var8 ^ 452734367;
                                }
                            };
                            long var304 = var8;
                            long var369 = var304 + 1L;
                            long var370 = var304 * var369;
                            long var305 = var370 & 1L;
                            long var571;
                            var14 = (var571 = var305 - 0L) == 0L ? 0 : (var571 < 0L ? -1 : 1);
                            if (var14 != 0) {
                                break label400;
                            }

                            var14 = var8 * -1518500543;
                            var14 ^= 1444011821;
                            this.u(var13, var3, var10, var11, var285, var14);
                            double[] var309 = this.H;
                            double var310 = var309[var13];
                            double[] var371 = this.Vf;
                            var17 = var9;
                            long var19 = var17 + 1L;
                            var19 = var17 * var19;
                            long var21 = var17 + 2L;
                            var19 *= var21;
                            var17 += 3L;
                            var19 *= var17;
                            var17 = var19 & 7L;
                            long var572;
                            int var422 = (var572 = var17 - 0L) == 0L ? 0 : (var572 < 0L ? -1 : 1);
                            if (var422 != 0) {
                                var8 ^= -681673865;
                                var8 >>>= 30;
                                var8 ^= -48817040;
                                var8 ^= 1746596222;
                                break;
                            }
                            var8 = switch (var8) {
                                case -533177351 -> {
                                    var8 ^= -197322458;
                                    var8 >>= 19;
                                    yield var8 ^ 1988551826;
                                }
                                default -> var8 ^ -1118495438;
                                case 1991392188 -> var8 ^ 1421212727;
                            };
                            Integer var423 = var8;
                            if (var423 == null) {
                                break label400;
                            }

                            double var372 = var371[var13];
                            double[] var474 = this.j;
                            double var475 = var474[var13];
                            int var311 = (var2.at(var1, var310, var372, var475)) ? 1 : 0;
                            if (var311 == 0) {
                                var8 -= -1441402917;
                                var8 ^= 1785795444;
                                var8 += -1925035217;
                                var8 |= 992983460;
                                var8 ^= -160407378;
                            } else {
                                var8 += 363574018;
                                var8 *= 887539887;
                                var8 += -727258882;
                                var8 ^= 888023904;
                                float[] var312 = this.N;
                                float var313 = var312[var13];
                                float[] var349 = this.b;
                                float var350 = var349[var13];
                                float var314 = var313 / var350;
                                float var351 = this.k;
                                float var315 = var314 - var351;
                                float var352 = this.k;
                                float var353 = 1.0F - var352;
                                float var316 = var315 / var353;
                                float var317 = TP.S(var316);
                                Lv var354 = sT_2.qQ;
                                var367 = var9 + 1;
                                var367 = var9 * var367;
                                int var424 = var9 + 2;
                                var367 *= var424;
                                int var425 = var9 + 3;
                                var367 *= var425;
                                var367 &= 7;
                                if (var367 != 0) {
                                    var8 &= -2129601240;
                                    var8 ^= 353233158;
                                    break;
                                }

                                var8 &= 1859335886;
                                var8 ^= 664531380;
                                var8 *= -590786997;
                                var8 ^= 1412101011;
                                Integer var378 = var8;
                                if (var378 == null) {
                                    break label400;
                                }

                                float[] var379 = this.N;
                                float var380 = var379[var13];
                                float var381 = var380 / 0.2F;
                                float var382 = TP.S(var381);
                                float var355 = var354.l(var382);
                                float var356 = 0.45F * var355;
                                float var357 = 0.55F + var356;
                                float[] var383 = this.AD;
                                float var384 = var383[var13];
                                float var426 = var2.unitsPerBlock();
                                float var385 = var384 * var426;
                                float var358 = var385 * var357;
                                ka var386 = this.MW;
                                ka var427 = ka.SCALE;
                                float var391;
                                if (var386 == var427) {
                                    var8 += 1537451559;
                                    var8 |= 120413802;
                                    var8 -= 1991128310;
                                    var8 ^= 622726679;
                                    long var387 = var8;
                                    long var476 = var387 + 1L;
                                    long var477 = var387 * var476;
                                    long var388 = var477 & 1L;
                                    long var573;
                                    int var389 = (var573 = var388 - 0L) == 0L ? 0 : (var573 < 0L ? -1 : 1);
                                    if (var389 != 0) {
                                        break label400;
                                    }

                                    float var390 = 1.0F - var317;
                                    var17 = var9;
                                    var19 = var17 + 1L;
                                    var19 = var17 * var19;
                                    var17 = var19 & 1L;
                                    long var574;
                                    int var430 = (var574 = var17 - 0L) == 0L ? 0 : (var574 < 0L ? -1 : 1);
                                    if (var430 != 0) {
                                        var8 += 1131809581;
                                        var8 *= -599458735;
                                        var8 ^= 1600546078;
                                        break;
                                    }

                                    var8 |= 857689987;
                                    var8 ^= -1383642928;
                                    var17 = var8;
                                    var19 = var17 + 1L;
                                    var19 = var17 * var19;
                                    var17 = var19 & 1L;
                                    long var575;
                                    int var433 = (var575 = var17 - 0L) == 0L ? 0 : (var575 < 0L ? -1 : 1);
                                    if (var433 != 0) {
                                        break label400;
                                    }

                                    var391 = var390;
                                    var8 -= -698163495;
                                    var8 <<= 12;
                                    var8 -= -840005715;
                                    var8 *= -873047289;
                                    var8 ^= 626001856;
                                } else {
                                    var8 &= 1979441679;
                                    var8 ^= 122587096;
                                    var8 |= 1027870853;
                                    var8 -= 824001727;
                                    var8 ^= -1591590149;
                                    var17 = var8;
                                    var19 = var17 + 1L;
                                    var19 = var17 * var19;
                                    var21 = var17 + 2L;
                                    var19 *= var21;
                                    var17 += 3L;
                                    var19 *= var17;
                                    var17 = var19 & 7L;
                                    long var576;
                                    int var437 = (var576 = var17 - 0L) == 0L ? 0 : (var576 < 0L ? -1 : 1);
                                    if (var437 != 0) {
                                        break label400;
                                    }

                                    var391 = 1.0F;
                                    switch (var8) {
                                        case -1358228499:
                                            var8 += -1788153067;
                                            var8 += 171920677;
                                            var8 ^= 1783760550;
                                            var8 ^= -1898596808;
                                            var8 ^= 837535804;
                                            break;
                                        case -942761603:
                                            var8 ^= 735215565;
                                            break;
                                        case 435542945:
                                        default:
                                            var8 ^= -1831556037;
                                    }
                                }

                                int var438 = var8 + 1;
                                int var439 = var8 * var438;
                                int var478 = var8 + 2;
                                int var440 = var439 * var478;
                                int var479 = var8 + 3;
                                int var441 = var440 * var479;
                                int var442 = var441 & 7;
                                if (var442 != 0) {
                                    break label400;
                                }

                                float var359 = var358 * var391;
                                long var392 = var9;
                                long var480 = var392 + 1L;
                                long var481 = var392 * var480;
                                long var20 = var392 + 2L;
                                long var482 = var481 * var20;
                                long var393 = var392 + 3L;
                                long var483 = var482 * var393;
                                long var394 = var483 & 7L;
                                long var577;
                                int var395 = (var577 = var394 - 0L) == 0L ? 0 : (var577 < 0L ? -1 : 1);
                                if (var395 != 0) {
                                    var8 ^= 1983663758;
                                    var8 ^= 2028506885;
                                    break;
                                }

                                var8 &= 556324853;
                                var8 ^= -741517668;
                                float var578;
                                var395 = (var578 = var359 - 0.2F) == 0.0F ? 0 : (var578 < 0.0F ? -1 : 1);
                                if (var395 < 0) {
                                    var8 -= -1196785497;
                                    var8 ^= -304252392;
                                    var8 ^= 273978719;
                                    long var397 = var8;
                                    long var484 = var397 + 1L;
                                    long var485 = var397 * var484;
                                    var20 = var397 + 2L;
                                    long var486 = var485 * var20;
                                    long var398 = var397 + 3L;
                                    long var487 = var486 * var398;
                                    long var399 = var487 & 7L;
                                    long var579;
                                    var395 = (var579 = var399 - 0L) == 0L ? 0 : (var579 < 0L ? -1 : 1);
                                    if (var395 != 0) {
                                        break label400;
                                    }

                                    var8 += 1529621622;
                                    var8 ^= -1885293581;
                                } else {
                                    var8 |= -84003728;
                                    var8 ^= 1199278044;
                                    float[] var401 = this.N;
                                    float var402 = var401[var13];
                                    float var403 = var402 / 0.06F;
                                    int var443 = var9 + 1;
                                    int var444 = var9 * var443;
                                    int var488 = var9 + 2;
                                    int var445 = var444 * var488;
                                    int var489 = var9 + 3;
                                    int var446 = var445 * var489;
                                    int var447 = var446 & 7;
                                    if (var447 != 0) {
                                        var8 *= -830253785;
                                        var8 += -1530117001;
                                        var8 *= -1881514975;
                                        var8 |= -912430564;
                                        var8 ^= 1324484560;
                                        break;
                                    }

                                    var8 *= 418041097;
                                    var8 ^= -1666301546;
                                    var8 &= -1027612699;
                                    var8 ^= 1280350324;
                                    float var404 = TP.S(var403);
                                    ka var448 = this.MW;
                                    ka var490 = ka.ALPHA;
                                    float var319;
                                    if (var448 == var490) {
                                        var8 = switch (var8) {
                                            case -1908324811 -> {
                                                var8 &= 1473212967;
                                                var8 &= -1161386745;
                                                var8 -= -765079281;
                                                yield var8 ^ 1702463126;
                                            }
                                            default -> var8 ^ 2130077534;
                                            case 1212884382 -> var8 ^ 1929817493;
                                        };
                                        int var449 = var8 + 1;
                                        int var450 = var8 * var449;
                                        int var491 = var8 + 2;
                                        int var451 = var450 * var491;
                                        int var492 = var8 + 3;
                                        int var452 = var451 * var492;
                                        int var453 = var452 & 7;
                                        if (var453 != 0) {
                                            break label400;
                                        }

                                        float var318 = 1.0F - var317;
                                        var17 = var9;
                                        var19 = var17 + 1L;
                                        var19 = var17 * var19;
                                        var17 = var19 & 1L;
                                        long var580;
                                        int var456 = (var580 = var17 - 0L) == 0L ? 0 : (var580 < 0L ? -1 : 1);
                                        if (var456 != 0) {
                                            switch (var8) {
                                                case 288639940:
                                                    var8 ^= 1325228185;
                                                    break label378;
                                                case 895673532:
                                                default:
                                                    var8 ^= 2078946734;
                                                    break label378;
                                                case 1252239456:
                                                    var8 *= -777581939;
                                                    var8 += 534713215;
                                                    var8 |= -894614422;
                                                    var8 -= -1268892772;
                                                    var8 ^= -1100188179;
                                                    break label378;
                                            }
                                        }

                                        var8 <<= 11;
                                        var8 ^= 1593939711;
                                        var17 = var8;
                                        var19 = var17 + 1L;
                                        var19 = var17 * var19;
                                        var21 = var17 + 2L;
                                        var19 *= var21;
                                        var17 += 3L;
                                        var19 *= var17;
                                        var17 = var19 & 7L;
                                        long var581;
                                        int var460 = (var581 = var17 - 0L) == 0L ? 0 : (var581 < 0L ? -1 : 1);
                                        if (var460 != 0) {
                                            break label400;
                                        }

                                        var319 = var318;
                                        var8 -= 1265296543;
                                        var8 *= 1028221789;
                                        var8 *= -1535627337;
                                        var8 ^= -1735586907;
                                    } else {
                                        var8 &= 958732358;
                                        var8 ^= -926989352;
                                        var319 = 1.0F;
                                        var8 *= 1545450601;
                                        var8 ^= -92996935;
                                    }

                                    Integer var461 = var8;
                                    if (var461 == null) {
                                        break label400;
                                    }

                                    float var320 = var404 * var319;
                                    int[] var405 = this.RX;
                                    int var462 = var9 + 1;
                                    int var463 = var9 * var462;
                                    int var464 = var463 & 1;
                                    if (var464 != 0) {
                                        var8 -= -1153761110;
                                        var8 ^= 563123157;
                                        break;
                                    }

                                    var8 += -279574435;
                                    var8 |= 369317272;
                                    var8 ^= 1960644455;
                                    var8 ^= -206274465;
                                    Integer var465 = var8;
                                    if (var465 == null) {
                                        break label400;
                                    }

                                    var395 = var405[var13];
                                    if (var395 != 0) {
                                        var8 ^= 917271621;
                                        var8 >>= 30;
                                        var8 ^= -1871348979;
                                        long var407 = var8;
                                        long var493 = var407 + 1L;
                                        long var494 = var407 * var493;
                                        long var408 = var494 & 1L;
                                        long var582;
                                        var395 = (var582 = var408 - 0L) == 0L ? 0 : (var582 < 0L ? -1 : 1);
                                        if (var395 != 0) {
                                            break label400;
                                        }

                                        int[] var410 = this.RX;
                                        var395 = var410[var13];
                                        Integer var466 = var9;
                                        if (var466 == null) {
                                            var8 <<= 26;
                                            var8 ^= 1561193742;
                                            break;
                                        }
                                        var8 = switch (var8) {
                                            default -> var8 ^ 2100211476;
                                            case 1871348978 -> {
                                                var8 >>= 14;
                                                var8 *= 1428087717;
                                                yield var8 ^ 913976270;
                                            }
                                            case 1901035686 -> var8 ^ -1801843480;
                                        };
                                        var395 = var395;
                                        var8 *= -191191491;
                                        var8 |= 697234974;
                                        var8 ^= -1028047803;
                                    } else {
                                        var8 += 771012230;
                                        var8 &= -46338525;
                                        var8 += -710078778;
                                        var8 ^= -1024430123;
                                        float[] var467 = this.e;
                                        float var468 = var467[var13];
                                        Integer var495 = var9;
                                        if (var495 == null) {
                                            var8 *= 1622390985;
                                            var8 ^= -774116123;
                                            break;
                                        }
                                        var8 = switch (var8) {
                                            case -699379640 -> var8 ^ 1803354369;
                                            case 454390547 -> {
                                                var8 *= 422373677;
                                                var8 -= 232223060;
                                                yield var8 ^ -1454459505;
                                            }
                                            default -> var8 ^ -2127083975;
                                        };
                                        long var496 = var8;
                                        var20 = var496 + 1L;
                                        var20 = var496 * var20;
                                        long var497 = var20 & 1L;
                                        long var583;
                                        int var498 = (var583 = var497 - 0L) == 0L ? 0 : (var583 < 0L ? -1 : 1);
                                        if (var498 != 0) {
                                            break label400;
                                        }

                                        int var469 = var6.x(var468, var4);
                                        var395 = var469;
                                        var8 += -1719067238;
                                        var8 ^= -1574996707;
                                    }

                                    var311 = DP.Y(var395, var320);
                                    Integer var413 = var9;
                                    if (var413 == null) {
                                        var8 &= 476803117;
                                        var8 &= -1621877161;
                                        var8 >>>= 23;
                                        var8 |= 35223409;
                                        var8 ^= -1760257417;
                                        break;
                                    }

                                    var8 ^= 1428079169;
                                    var8 ^= 674536906;
                                    int var414 = var311 | 16777215;
                                    var414 = DP.Z(var311, var414, 0.14F);
                                    SpriteShape[] var470 = Q;
                                    byte[] var499 = this.ja;
                                    byte var500 = var499[var13];
                                    SpriteShape var471 = var470[var500];
                                    var1.save();
                                    float var501 = var2.depth();
                                    var1.depth(var501);
                                    float var502 = var2.x();
                                    float var536 = var2.y();
                                    var1.translate(var502, var536);
                                    float[] var503 = this.r;
                                    float var504 = var503[var13];
                                    var1.rotate(var504);
                                    SpriteShape var505 = SpriteShape.GLOW;
                                    if (var471 == var505) {
                                        var8 |= -1367163931;
                                        var8 &= 823616996;
                                        var8 ^= -1302823986;
                                        Integer var506 = var8;
                                        if (var506 == null) {
                                            break label400;
                                        }

                                        float var507 = var359 * 0.45F;
                                        Integer var537 = var9;
                                        if (var537 == null) {
                                            var8 >>>= 2;
                                            var8 |= 1287957168;
                                            var8 >>= 30;
                                            var8 ^= -1794249457;
                                            break;
                                        }
                                        var8 = switch (var8) {
                                            case -2108793302 -> {
                                                var8 |= 955137161;
                                                var8 ^= 169404260;
                                                var8 ^= 1563917100;
                                                var8 += -447780614;
                                                yield var8 ^ 1419720998;
                                            }
                                            default -> var8 ^ -1304060237;
                                            case 1150256557 -> var8 ^ 211626005;
                                        };
                                        int var538 = var8 + 1;
                                        int var539 = var8 * var538;
                                        int var560 = var8 + 2;
                                        int var540 = var539 * var560;
                                        int var561 = var8 + 3;
                                        int var541 = var540 * var561;
                                        int var542 = var541 & 7;
                                        if (var542 != 0) {
                                            break label400;
                                        }

                                        float var543 = var359 * 1.5F;
                                        var1.sprite(var471, 0.0F, 0.0F, var507, var543, var414, var311, 0.0F);
                                        var8 *= 2072619533;
                                        var8 -= -1531288152;
                                        var8 -= 974854662;
                                        var8 -= -1766829662;
                                        var8 ^= 160915300;
                                    } else {
                                        var8 |= 1820191583;
                                        var8 |= -1245664130;
                                        var8 &= 1935895844;
                                        var8 ^= -1903869156;
                                        int var508 = var8 + 1;
                                        int var509 = var8 * var508;
                                        int var544 = var8 + 2;
                                        int var510 = var509 * var544;
                                        int var545 = var8 + 3;
                                        int var511 = var510 * var545;
                                        int var512 = var511 & 7;
                                        if (var512 != 0) {
                                            break label400;
                                        }

                                        SpriteShape var513 = SpriteShape.FIREFLY;
                                        int var546 = var9 + 1;
                                        int var547 = var9 * var546;
                                        int var548 = var547 & 1;
                                        if (var548 != 0) {
                                            var8 -= -2051151290;
                                            var8 *= 840306879;
                                            var8 *= -387925771;
                                            var8 ^= 1143239144;
                                            break;
                                        }

                                        var8 *= 2137970379;
                                        var8 ^= 195974622;
                                        var8 |= 793616618;
                                        var8 ^= 1107780676;
                                        Integer var549 = var8;
                                        if (var549 == null) {
                                            break label400;
                                        }

                                        if (var471 == var513) {
                                            var8 = switch (var8) {
                                                default -> var8 ^ 243215459;
                                                case 759875514 -> {
                                                    var8 += -2080993427;
                                                    yield var8 ^ 1536784482;
                                                }
                                                case 1492265010 -> var8 ^ 79976003;
                                            };
                                            float var514 = var359 * 0.35F;
                                            Integer var550 = var9;
                                            if (var550 == null) {
                                                var8 += -382518150;
                                                var8 &= 1460111037;
                                                var8 ^= -1055985741;
                                                break;
                                            }

                                            var8 |= 1291878016;
                                            var8 ^= 1463840213;
                                            int var551 = var8 + 1;
                                            int var552 = var8 * var551;
                                            int var553 = var552 & 1;
                                            if (var553 != 0) {
                                                break label400;
                                            }

                                            float var554 = var359 * 1.65F;
                                            int var562 = var311 | 16777215;
                                            int var563 = DP.Z(var311, var562, 0.6F);
                                            var1.sprite(var471, 0.0F, 0.0F, var514, var554, var563, var311, 0.0F);
                                            var8 <<= 12;
                                            var8 ^= -1361712117;
                                        } else {
                                            var8 |= 1362540489;
                                            var8 ^= 1852580112;
                                            int var515 = var8 + 1;
                                            int var516 = var8 * var515;
                                            int var517 = var516 & 1;
                                            if (var517 != 0) {
                                                break label400;
                                            }

                                            float var518 = var359 * 0.8F;
                                            Integer var555 = var9;
                                            if (var555 == null) {
                                                switch (var8) {
                                                    case -2039217935:
                                                        var8 ^= 1463061243;
                                                        break label378;
                                                    case -124272024:
                                                    default:
                                                        var8 ^= -1980913235;
                                                        break label378;
                                                    case 320001771:
                                                        var8 <<= 6;
                                                        var8 += 1882611074;
                                                        var8 -= 2125399764;
                                                        var8 ^= 590412896;
                                                        break label378;
                                                }
                                            }

                                            var8 -= -639249695;
                                            var8 -= -144663095;
                                            var8 -= 559201241;
                                            var8 <<= 25;
                                            var8 ^= 2116819156;
                                            Integer var556 = var8;
                                            if (var556 == null) {
                                                break label400;
                                            }

                                            var1.sprite(var471, 0.0F, 0.0F, var359, var518, var414, var311, 0.0F);
                                            var8 -= -1495493154;
                                            var8 ^= 683372285;
                                        }
                                    }

                                    var311 = var8 + 1;
                                    var311 = var8 * var311;
                                    var311 &= 1;
                                    if (var311 != 0) {
                                        break label400;
                                    }

                                    var1.restore();
                                    var8 *= -1588550375;
                                    var8 ^= -194904757;
                                }
                            }
                        }
                    }

                    var14 = var8 + 1;
                    var14 = var8 * var14;
                    var14 &= 1;
                    if (var14 != 0) {
                        break label400;
                    }

                    var14 = var13 + 1;
                    var333 = var9;
                    if (var333 == null) {
                        var8 -= 1101974547;
                        var8 ^= 511500363;
                        break;
                    }

                    var8 *= 1790481531;
                    var8 &= -445723921;
                    var8 ^= 400000314;
                    long var361 = var8;
                    long var472 = var361 + 1L;
                    var472 = var361 * var472;
                    long var362 = var472 & 1L;
                    long var584;
                    int var363 = (var584 = var362 - 0L) == 0L ? 0 : (var584 < 0L ? -1 : 1);
                    if (var363 != 0) {
                        break label400;
                    }

                    var13 = var14;
                    var8 &= -613680703;
                    var8 -= 455109207;
                    var8 ^= -1721912862;
                    var8 <<= 3;
                    var8 ^= -1651776852;
                }
            }

            AssertionError var270 = new AssertionError();
            throw var270;
        }

        IllegalStateException var264 = new IllegalStateException();
        throw var264;
    }

    private void u(int var1, float var2, float var3, float var4, float var5, int var6) {
        int var9 = System.identityHashCode(this);
        Object var10 = v;
        byte[] var11 = this.bB;
        byte var132 = var11[var1];
        Integer var12 = var9;
        label147:
        if (var12 != null) {
            int var21 = switch (var6) {
                case -1646361759 -> var6 ^ -409947106;
                case -843225068 -> {
                    int var22 = var6 - 376956717;
                    var22 ^= 150591552;
                    var22 -= 1532510175;
                    yield var22 ^ -1867882883;
                }
                default -> var6 ^ -1383668097;
            };
            long var178 = var1;
            long var14 = var178 + 1L;
            var14 = var178 * var14;
            long var179 = var14 & 1L;
            long var265;
            int var180 = (var265 = var179 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
            label143:
            if (var180 == 0) {
                var10 = ((Object[])var10)[var132];
                int var133 = ((bA_2)var10).ordinal();
                label141:
                switch (var133) {
                    case 0:
                        var21 = switch (var21) {
                            case -187808075 -> {
                                var21 &= 349461210;
                                yield var21 ^ -1810919783;
                            }
                            case 712527905 -> var21 ^ 1201812073;
                            default -> var21 ^ 1850956427;
                        };
                        int var158 = var1 + 1;
                        int var159 = var1 * var158;
                        var180 = var1 + 2;
                        int var160 = var159 * var180;
                        var180 = var1 + 3;
                        int var161 = var160 * var180;
                        int var162 = var161 & 7;
                        if (var162 != 0) {
                            break label143;
                        }

                        float[] var163 = this.Sz;
                        float var219 = var163[var1];
                        float var220 = var219 * var3;
                        var163[var1] = var220;
                        float[] var164 = this.m;
                        float var221 = var164[var1];
                        float var222 = var221 * var3;
                        var164[var1] = var222;
                        Integer var165 = var9;
                        if (var165 == null) {
                            var21 &= -913793176;
                            var21 >>= 25;
                            var21 ^= -2086166485;
                            var21 &= 899289989;
                            var21 ^= -27627199;
                            break label147;
                        }

                        var21 *= 1396667129;
                        var21 &= -541988357;
                        var21 += -649389922;
                        var21 ^= 1674537804;
                        long var166 = var1;
                        long var253 = var166 + 1L;
                        var253 = var166 * var253;
                        long var264 = var166 + 2L;
                        var253 *= var264;
                        long var167 = var166 + 3L;
                        var253 *= var167;
                        long var168 = var253 & 7L;
                        long var271;
                        int var169 = (var271 = var168 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                        if (var169 != 0) {
                            break label143;
                        }

                        float[] var170 = this.eu;
                        float[] var223 = this.eu;
                        float var224 = var223[var1];
                        float var225 = var224 * var3;
                        float var257 = 0.4F * var2;
                        float var226 = var225 - var257;
                        var170[var1] = var226;
                        var21 *= 1061187065;
                        var21 ^= -1026406320;
                        var21 ^= 1943245711;
                        break;
                    case 1:
                        var21 = switch (var21) {
                            default -> var21 ^ 347672468;
                            case -187808075 -> {
                                var21 ^= -232971326;
                                var21 *= -1156186139;
                                var21 >>= 1;
                                var21 *= -985102123;
                                yield var21 ^ -1027266497;
                            }
                            case 1333089700 -> var21 ^ 2046762580;
                        };
                        float[] var151 = this.Sz;
                        float var211 = var151[var1];
                        float var212 = var211 * var3;
                        var151[var1] = var212;
                        float[] var152 = this.m;
                        float var213 = var152[var1];
                        float var214 = var213 * var3;
                        var152[var1] = var214;
                        long var153 = var9;
                        long var248 = var153 + 1L;
                        var248 = var153 * var248;
                        long var263 = var153 + 2L;
                        var248 *= var263;
                        long var154 = var153 + 3L;
                        var248 *= var154;
                        long var155 = var248 & 7L;
                        long var267;
                        int var156 = (var267 = var155 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                        if (var156 != 0) {
                            var21 ^= -317959511;
                            var21 *= 19419625;
                            var21 -= -233695943;
                            var21 += -929534584;
                            var21 ^= 1803602946;
                            break label147;
                        }

                        var21 &= 552263082;
                        var21 ^= -1047294960;
                        float[] var157 = this.eu;
                        float var215 = var157[var1];
                        float var252 = 7.5F * var2;
                        float var216 = var215 - var252;
                        var157[var1] = var216;
                        var21 *= -1112934493;
                        var21 ^= 505531602;
                        break;
                    case 2:
                        var21 >>= 1;
                        var21 ^= -2101956609;
                        var21 ^= 1909803482;
                        float[] var148 = this.Sz;
                        float var203 = var148[var1];
                        float var204 = var203 * var3;
                        int var243 = var9 + 1;
                        var243 = var9 * var243;
                        var243 &= 1;
                        if (var243 != 0) {
                            var21 -= 1878424244;
                            var21 ^= 1397499915;
                            break label147;
                        }
                        var21 = switch (var21) {
                            case -1319787795 -> var21 ^ -633352809;
                            case 151307647 -> {
                                var21 &= -1620245178;
                                var21 |= 548817240;
                                yield var21 ^ -696014458;
                            }
                            default -> var21 ^ 518733116;
                        };
                        Integer var246 = var1;
                        if (var246 == null) {
                            break label143;
                        }

                        var148[var1] = var204;
                        float[] var149 = this.m;
                        float var205 = var149[var1];
                        float var206 = var205 * var3;
                        var149[var1] = var206;
                        float[] var150 = this.eu;
                        float[] var207 = this.eu;
                        float var208 = var207[var1];
                        float var209 = var208 * var4;
                        float var247 = 0.4F * var2;
                        float var210 = var209 - var247;
                        var150[var1] = var210;
                        switch (var21) {
                            case -1392422327:
                                var21 ^= 241023226;
                                break label141;
                            case -13245224:
                                var21 -= -430963331;
                                var21 ^= -1345128742;
                                var21 >>= 22;
                                var21 -= 33440270;
                                var21 ^= 283626602;
                                break label141;
                            case 1152893604:
                            default:
                                var21 ^= 32404797;
                                break label141;
                        }
                    case 3:
                        var21 = switch (var21) {
                            case -1215559416 -> var21 ^ -767150147;
                            default -> var21 ^ -286329041;
                            case -187808075 -> {
                                var21 += 1672830137;
                                var21 ^= 685894183;
                                var21 *= -1411599571;
                                yield var21 ^ -1076559891;
                            }
                        };
                        long var141 = var1;
                        long var234 = var141 + 1L;
                        var234 = var141 * var234;
                        long var15 = var141 + 2L;
                        var234 *= var15;
                        long var142 = var141 + 3L;
                        var234 *= var142;
                        long var143 = var234 & 7L;
                        long var269;
                        int var144 = (var269 = var143 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                        if (var144 != 0) {
                            break label143;
                        }

                        float[] var145 = this.Sz;
                        float var195 = var145[var1];
                        float var196 = var195 * var5;
                        var145[var1] = var196;
                        float[] var146 = this.m;
                        float var197 = var146[var1];
                        float var198 = var197 * var5;
                        var146[var1] = var198;
                        float[] var147 = this.eu;
                        float[] var199 = this.eu;
                        float var200 = var199[var1];
                        float var201 = var200 * var5;
                        float var238 = 14.0F * var2;
                        float var202 = var201 - var238;
                        var234 = var9;
                        var15 = var234 + 1L;
                        var15 = var234 * var15;
                        var234 = var15 & 1L;
                        long var270;
                        int var241 = (var270 = var234 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                        if (var241 != 0) {
                            var21 &= 1287677395;
                            var21 ^= -826121264;
                            break label147;
                        }

                        var21 *= -1122941735;
                        var21 ^= 621986280;
                        var21 <<= 8;
                        var21 ^= -1843061209;
                        Integer var242 = var1;
                        if (var242 == null) {
                            break label143;
                        }

                        var147[var1] = var202;
                        switch (var21) {
                            case -674329049:
                                var21 >>>= 17;
                                var21 ^= -286909629;
                                break label141;
                            case -580130761:
                            default:
                                var21 ^= -904692711;
                                break label141;
                            case 1487185770:
                                var21 ^= -349269310;
                                break label141;
                        }
                    case 4:
                        var21 -= -1967354967;
                        var21 <<= 26;
                        var21 *= 814259213;
                        var21 += 698531478;
                        var21 ^= 847175844;
                        float[] var138 = this.Sz;
                        float var186 = var138[var1];
                        float var187 = var186 * var5;
                        var138[var1] = var187;
                        float[] var139 = this.eu;
                        float var188 = var139[var1];
                        float var189 = var188 * var5;
                        var139[var1] = var189;
                        float[] var140 = this.m;
                        long var190 = var9;
                        var14 = var190 + 1L;
                        var14 = var190 * var14;
                        long var191 = var14 & 1L;
                        long var266;
                        var180 = (var266 = var191 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                        if (var180 != 0) {
                            var21 ^= -575080720;
                            var21 += -908354911;
                            var21 += -1133960149;
                            var21 >>>= 29;
                            var21 ^= -901619001;
                            break label147;
                        }
                        var21 = switch (var21) {
                            case -1904335060 -> var21 ^ 2072588183;
                            case -1411621326 -> {
                                var21 &= 1137142772;
                                var21 *= 931439925;
                                var21 >>>= 23;
                                var21 &= -1283950379;
                                yield var21 ^ 1060408157;
                            }
                            default -> var21 ^ -2033597936;
                        };
                        float var193 = var140[var1];
                        float var194 = var193 * var5;
                        var140[var1] = var194;
                        var21 += -362464274;
                        var21 >>= 16;
                        var21 |= 878754414;
                        var21 ^= -628700325;
                        break;
                    case 5:
                        var21 += 1786303941;
                        var21 += 1479799641;
                        var21 &= -92072394;
                        var21 ^= 737964806;
                        long var134 = var1;
                        long var13 = var134 + 1L;
                        var13 = var134 * var13;
                        long var135 = var13 & 1L;
                        long var268;
                        int var136 = (var268 = var135 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var136 != 0) {
                            break label143;
                        }

                        float[] var137 = this.eu;
                        float[] var181 = this.eu;
                        float var182 = var181[var1];
                        int var230 = var9 + 1;
                        int var231 = var9 * var230;
                        int var232 = var231 & 1;
                        if (var232 != 0) {
                            var21 -= 1481055825;
                            var21 ^= -1946536957;
                            break label147;
                        }

                        var21 >>>= 28;
                        var21 += -2075211411;
                        var21 ^= 805153460;
                        var21 ^= 1975705674;
                        float var183 = var182 * var5;
                        float var184 = var183 * var5;
                        float var233 = 14.0F * var2;
                        float var185 = var184 - var233;
                        var137[var1] = var185;
                        var21 -= 1351397878;
                        var21 >>>= 31;
                        var21 += 1185664343;
                        var21 ^= -1471300100;
                        break;
                    default:
                        var21 -= 1132906262;
                        var21 += 1745950969;
                        var21 |= -1395626525;
                        var21 ^= 1396608351;
                }

                int var171 = var1 + 1;
                int var172 = var1 * var171;
                var180 = var1 + 2;
                int var173 = var172 * var180;
                var180 = var1 + 3;
                int var174 = var173 * var180;
                int var175 = var174 & 7;
                if (var175 == 0) {
                    int var176 = var21 - 1979171725;
                    int var177 = var176 ^ -934254852;
                    this.n(var1, (bA_2)var10, var2, var177);
                    float[] var127 = this.r;
                    Integer var118 = var9;
                    if (var118 == null) {
                        var21 -= 848559432;
                        var21 ^= 1980764572;
                        break label147;
                    }

                    var21 -= 1006528391;
                    var21 ^= 769209608;
                    int var119 = var1 + 1;
                    var119 = var1 * var119;
                    int var8 = var119 & 1;
                    if (var8 == 0) {
                        float var114 = var127[var1];
                        float[] var121 = this.Gf;
                        float var122 = var121[var1];
                        float var123 = var122 * var2;
                        float var115 = var114 + var123;
                        var127[var1] = var115;
                        float[] var116 = this.Gf;
                        float var124 = var116[var1];
                        float var128 = -0.6F * var2;
                        double var129 = var128;
                        double var130 = Math.exp(var129);
                        float var131 = (float)var130;
                        float var125 = var124 * var131;
                        var116[var1] = var125;
                        return;
                    }
                }
            }

            IllegalArgumentException var117 = new IllegalArgumentException();
            throw var117;
        } else {
            int var7 = var6 & 384477776;
            var7 ^= 307915752;
            var7 >>>= 16;
            var7 *= 1275697007;
            var7 ^= 2119619118;
        }

        AssertionError var113 = new AssertionError();
        throw var113;
    }

    private void n(int var1, bA_2 var2, float var3, int var4) {
        label624: {
            int var7 = System.identityHashCode(this);
            double[] var8 = this.H;
            double var457 = var8[var1];
            float[] var10 = this.Sz;
            float var516 = var10[var1];
            float var517 = var516 * var3;
            double var518 = var517;
            double var458 = var457 + var518;
            int var519 = var7 + 1;
            int var520 = var7 * var519;
            int var521 = var520 & 1;
            if (var521 != 0) {
                int var5 = var4 << 28;
                var5 >>= 31;
                var5 |= 1906930714;
                var5 ^= -1113424906;
            } else {
                int var31 = var4 - -1112021287;
                var31 >>>= 6;
                var31 ^= 365593315;
                double[] var522 = this.Vf;
                double var523 = var522[var1];
                float[] var12 = this.eu;
                float var591 = var12[var1];
                float var592 = var591 * var3;
                double var593 = var592;
                double var524 = var523 + var593;
                double[] var594 = this.j;
                double var595 = var594[var1];
                float[] var14 = this.m;
                float var599 = var14[var1];
                float var600 = var599 * var3;
                double var601 = var600;
                double var596 = var595 + var601;
                boolean var602 = this.TX;
                if (!var602) {
                    var31 |= 1645106841;
                    var31 &= 2036161159;
                    var31 += -1905433433;
                    var31 |= -923749669;
                    var31 ^= 129686840;
                    long var603 = var1;
                    long var16 = var603 + 1L;
                    var16 = var603 * var16;
                    long var604 = var16 & 1L;
                    long var937;
                    int var605 = (var937 = var604 - 0L) == 0L ? 0 : (var937 < 0L ? -1 : 1);
                    if (var605 != 0) {
                        break label624;
                    }

                    double[] var606 = this.H;
                    var606[var1] = var458;
                    double[] var607 = this.Vf;
                    var607[var1] = var524;
                    Integer var608 = var7;
                    if (var608 != null) {
                        var31 |= -1580299264;
                        var31 ^= -1048566497;
                        double[] var609 = this.j;
                        var609[var1] = var596;
                        return;
                    }

                    switch (var31) {
                        case -730833568:
                            var31 ^= -91784411;
                            break;
                        case -113024313:
                            var31 *= -145426361;
                            var31 &= -477760303;
                            var31 &= 372367414;
                            var31 <<= 31;
                            var31 ^= 1113424905;
                            break;
                        case 794485244:
                        default:
                            var31 ^= -881358885;
                    }
                } else {
                    var31 = switch (var31) {
                        case -1604422636 -> var31 ^ 930205063;
                        case 369531255 -> {
                            var31 *= -1522878291;
                            var31 |= 399675444;
                            yield var31 ^ 1973508081;
                        }
                        default -> var31 ^ 1397663810;
                    };
                    var14 = this.AD;
                    int var15 = var7 + 1;
                    var15 = var7 * var15;
                    int var624 = var7 + 2;
                    var15 *= var624;
                    var624 = var7 + 3;
                    var15 *= var624;
                    var15 &= 7;
                    if (var15 != 0) {
                        var31 <<= 23;
                        var31 <<= 29;
                        var31 &= -545656020;
                        var31 ^= 1113424905;
                    } else {
                        label685: {
                            var31 = switch (var31) {
                                case -211751951 -> var31 ^ 793374917;
                                default -> var31 ^ -447628901;
                                case 1784343182 -> {
                                    var31 -= 1543386665;
                                    var31 |= -1519254797;
                                    yield var31 ^ -998405731;
                                }
                            };
                            float var611 = var14[var1];
                            double[] var618 = this.H;
                            double var619 = var618[var1];
                            double var620 = Math.floor(var619);
                            var15 = (int)var620;
                            double[] var626 = this.j;
                            double var627 = var626[var1];
                            double var628 = Math.floor(var627);
                            var624 = (int)var628;
                            float[] var17 = this.eu;
                            float var642 = var17[var1];
                            float var938;
                            int var643 = (var938 = var642 - 0.0F) == 0.0F ? 0 : (var938 < 0.0F ? -1 : 1);
                            double var859;
                            if (var643 != 0) {
                                var31 -= 1311697350;
                                var31 &= 328045628;
                                var31 ^= 352373352;
                                long var644 = var1;
                                long var19 = var644 + 1L;
                                var19 = var644 * var19;
                                long var645 = var19 & 1L;
                                long var939;
                                int var646 = (var939 = var645 - 0L) == 0L ? 0 : (var939 < 0L ? -1 : 1);
                                if (var646 != 0) {
                                    break label624;
                                }

                                var17 = this.eu;
                                float var648 = var17[var1];
                                Integer var18 = var7;
                                if (var18 == null) {
                                    var31 += -23150555;
                                    var31 += -330979795;
                                    var31 -= -1916171210;
                                    var31 ^= 549600353;
                                    break label685;
                                }

                                var31 += -263419161;
                                var31 ^= -1424599968;
                                var31 -= 601188079;
                                var31 ^= -1648094057;
                                long var658 = var1;
                                long var20 = var658 + 1L;
                                var20 = var658 * var20;
                                long var22 = var658 + 2L;
                                var20 *= var22;
                                long var659 = var658 + 3L;
                                var20 *= var659;
                                long var660 = var20 & 7L;
                                long var940;
                                int var661 = (var940 = var660 - 0L) == 0L ? 0 : (var940 < 0L ? -1 : 1);
                                if (var661 != 0) {
                                    break label624;
                                }

                                float var941;
                                int var649 = (var941 = var648 - 0.0F) == 0.0F ? 0 : (var941 < 0.0F ? -1 : 1);
                                double var652;
                                if (var649 < 0) {
                                    var31 = switch (var31) {
                                        default -> var31 ^ -795465458;
                                        case -1489648909 -> {
                                            var31 -= 1678164322;
                                            var31 *= -45679547;
                                            var31 *= 1827249701;
                                            var31 -= 86414773;
                                            yield var31 ^ 1889535764;
                                        }
                                        case -170641118 -> var31 ^ -430175039;
                                    };
                                    float var650 = -var611;
                                    var661 = var7 + 1;
                                    var661 = var7 * var661;
                                    int var725 = var7 + 2;
                                    var661 *= var725;
                                    int var726 = var7 + 3;
                                    var661 *= var726;
                                    var661 &= 7;
                                    if (var661 != 0) {
                                        var31 >>= 16;
                                        var31 ^= 1113443628;
                                        break label685;
                                    }

                                    var31 *= 351119427;
                                    var31 |= 18244439;
                                    var31 += -724232184;
                                    var31 ^= -952052259;
                                    var31 ^= 1520975263;
                                    Integer var667 = var1;
                                    if (var667 == null) {
                                        break label624;
                                    }

                                    double var651 = var650;
                                    var652 = var651;
                                    var31 += 901845035;
                                    var31 *= -1972056543;
                                    var31 -= 786641945;
                                    var31 *= 76484705;
                                    var31 ^= -357767234;
                                } else {
                                    var31 &= 932038609;
                                    var31 ^= -1138758965;
                                    Integer var727 = var1;
                                    if (var727 == null) {
                                        break label624;
                                    }

                                    double var728 = var611;
                                    Integer var21 = var7;
                                    if (var21 == null) {
                                        switch (var31) {
                                            case -1692784614:
                                                var31 -= 1781827907;
                                                var31 <<= 4;
                                                var31 ^= 1275357561;
                                                break label685;
                                            case -319216498:
                                            default:
                                                var31 ^= 1592437557;
                                                break label685;
                                            case 117300654:
                                                var31 ^= 1989612996;
                                                break label685;
                                        }
                                    }

                                    var31 |= -794361295;
                                    var31 ^= -1852983286;
                                    var31 |= -1208628511;
                                    var31 ^= 1074874470;
                                    long var817 = var1;
                                    long var23 = var817 + 1L;
                                    var23 = var817 * var23;
                                    long var818 = var23 & 1L;
                                    long var942;
                                    int var819 = (var942 = var818 - 0L) == 0L ? 0 : (var942 < 0L ? -1 : 1);
                                    if (var819 != 0) {
                                        break label624;
                                    }

                                    var652 = var728;
                                    var31 -= 1815020618;
                                    var31 -= 1260130830;
                                    var31 ^= 1956919012;
                                    var31 &= 367268778;
                                    var31 ^= 997833595;
                                }

                                double[] var729 = this.Vf;
                                int var776 = var7 + 1;
                                int var777 = var7 * var776;
                                int var778 = var777 & 1;
                                if (var778 != 0) {
                                    switch (var31) {
                                        case -1415802103:
                                        default:
                                            var31 ^= -179424243;
                                            break label685;
                                        case -1342996732:
                                            var31 ^= -668695804;
                                            break label685;
                                        case 794671601:
                                            var31 &= -1165686318;
                                            var31 ^= 1259073394;
                                            var31 |= 601048882;
                                            var31 ^= 562193339;
                                            break label685;
                                    }
                                }
                                var31 = switch (var31) {
                                    case -714719331 -> var31 ^ 1068088926;
                                    case 794671601 -> {
                                        var31 |= -411562099;
                                        var31 -= -37675739;
                                        var31 >>>= 13;
                                        yield var31 ^ 1094418599;
                                    }
                                    default -> var31 ^ 865058059;
                                };
                                double var730 = var729[var1];
                                double var731 = var730 + var652;
                                double var732 = Math.floor(var731);
                                int var733 = (int)var732;
                                double var653 = var524 + var652;
                                double var654 = Math.floor(var653);
                                int var655 = (int)var654;
                                if (var733 != var655) {
                                    var31 += 115789565;
                                    var31 ^= 1042059630;
                                    long var668 = var1;
                                    var20 = var668 + 1L;
                                    var20 = var668 * var20;
                                    var22 = var668 + 2L;
                                    var20 *= var22;
                                    long var669 = var668 + 3L;
                                    var20 *= var669;
                                    long var670 = var20 & 7L;
                                    long var943;
                                    var661 = (var943 = var670 - 0L) == 0L ? 0 : (var943 < 0L ? -1 : 1);
                                    if (var661 != 0) {
                                        break label624;
                                    }

                                    int var672 = i_2.rZ(var15, var655, var624) ? 1 : 0;
                                    int var734 = var7 + 1;
                                    int var735 = var7 * var734;
                                    int var783 = var7 + 2;
                                    int var736 = var735 * var783;
                                    int var784 = var7 + 3;
                                    int var737 = var736 * var784;
                                    int var738 = var737 & 7;
                                    if (var738 != 0) {
                                        switch (var31) {
                                            case -1616479806:
                                            default:
                                                var31 ^= 1212621497;
                                                break label685;
                                            case 464804416:
                                                var31 ^= -1551965527;
                                                break label685;
                                            case 1983794513:
                                                var31 += -1470093505;
                                                var31 += -1363025823;
                                                var31 += 391276994;
                                                var31 >>= 24;
                                                var31 ^= -1113424915;
                                                break label685;
                                        }
                                    }

                                    var31 -= -1065508411;
                                    var31 *= -1997312461;
                                    var31 += -52428367;
                                    var31 ^= -2091605241;
                                    var19 = var1;
                                    long var820 = var19 + 1L;
                                    long var821 = var19 * var820;
                                    long var897 = var19 + 2L;
                                    long var822 = var821 * var897;
                                    var19 += 3L;
                                    long var823 = var822 * var19;
                                    var19 = var823 & 7L;
                                    long var944;
                                    int var742 = (var944 = var19 - 0L) == 0L ? 0 : (var944 < 0L ? -1 : 1);
                                    if (var742 != 0) {
                                        break label624;
                                    }

                                    if (var672 != 0) {
                                        var31 -= -989108809;
                                        var31 >>>= 30;
                                        var31 ^= -988540330;
                                        var672 = var1 + 1;
                                        var672 = var1 * var672;
                                        var672 &= 1;
                                        if (var672 != 0) {
                                            break label624;
                                        }

                                        float[] var676 = this.eu;
                                        Integer var743 = var7;
                                        if (var743 == null) {
                                            var31 -= 421191101;
                                            var31 ^= -375082863;
                                            break label685;
                                        }

                                        var31 *= -1300331959;
                                        var31 >>= 12;
                                        var31 ^= 1323579174;
                                        var19 = var1;
                                        long var824 = var19 + 1L;
                                        long var825 = var19 * var824;
                                        var897 = var19 + 2L;
                                        long var826 = var825 * var897;
                                        var19 += 3L;
                                        long var827 = var826 * var19;
                                        var19 = var827 & 7L;
                                        long var945;
                                        int var747 = (var945 = var19 - 0L) == 0L ? 0 : (var945 < 0L ? -1 : 1);
                                        if (var747 != 0) {
                                            break label624;
                                        }

                                        float var677 = var676[var1];
                                        float var946;
                                        var672 = (var946 = var677 - 0.0F) == 0.0F ? 0 : (var946 < 0.0F ? -1 : 1);
                                        int var679;
                                        if (var672 < 0) {
                                            var31 ^= 1092009537;
                                            var31 ^= 1082692060;
                                            var679 = 1;
                                            var31 &= -1019767513;
                                            var31 += 95661885;
                                            var31 ^= 1816463103;
                                        } else {
                                            var31 &= 1391884397;
                                            var31 ^= 818874269;
                                            int var748 = var1 + 1;
                                            int var749 = var1 * var748;
                                            int var785 = var1 + 2;
                                            int var750 = var749 * var785;
                                            int var786 = var1 + 3;
                                            int var751 = var750 * var786;
                                            int var752 = var751 & 7;
                                            if (var752 != 0) {
                                                break label624;
                                            }

                                            var679 = 0;
                                            var31 &= 780364776;
                                            var31 &= -1658275795;
                                            var31 ^= -370099531;
                                        }

                                        var19 = var1;
                                        long var828 = var19 + 1L;
                                        long var829 = var19 * var828;
                                        var897 = var19 + 2L;
                                        long var830 = var829 * var897;
                                        var19 += 3L;
                                        long var831 = var830 * var19;
                                        var19 = var831 & 7L;
                                        long var947;
                                        int var756 = (var947 = var19 - 0L) == 0L ? 0 : (var947 < 0L ? -1 : 1);
                                        if (var756 != 0) {
                                            break label624;
                                        }

                                        Integer var757 = var7;
                                        if (var757 == null) {
                                            var31 += -46220839;
                                            var31 &= -121059526;
                                            var31 ^= -1571438565;
                                            break label685;
                                        }

                                        var31 >>>= 23;
                                        var31 ^= 1558614266;
                                        var19 = var1;
                                        long var832 = var19 + 1L;
                                        long var833 = var19 * var832;
                                        var897 = var19 + 2L;
                                        long var834 = var833 * var897;
                                        var19 += 3L;
                                        long var835 = var834 * var19;
                                        var19 = var835 & 7L;
                                        long var948;
                                        int var761 = (var948 = var19 - 0L) == 0L ? 0 : (var948 < 0L ? -1 : 1);
                                        if (var761 != 0) {
                                            break label624;
                                        }

                                        double var772;
                                        if (var679 != 0) {
                                            var31 -= -1424670503;
                                            var31 >>>= 15;
                                            var31 -= -2050519274;
                                            var31 ^= 452075504;
                                            var31 ^= -463800804;
                                            int var762 = var1 + 1;
                                            int var763 = var1 * var762;
                                            int var787 = var1 + 2;
                                            int var764 = var763 * var787;
                                            int var788 = var1 + 3;
                                            int var765 = var764 * var788;
                                            int var766 = var765 & 7;
                                            if (var766 != 0) {
                                                break label624;
                                            }

                                            int var767 = var655 + 1;
                                            float var768 = var767;
                                            float var769 = var768 + var611;
                                            double var770 = var769;
                                            double var771 = var770 + 0.001;
                                            Integer var836 = var7;
                                            if (var836 == null) {
                                                var31 >>>= 22;
                                                var31 ^= -1815066548;
                                                var31 <<= 21;
                                                var31 &= -243180977;
                                                var31 ^= 64848905;
                                                break label685;
                                            }

                                            var31 |= 1185142914;
                                            var31 -= 957131354;
                                            var31 ^= -1647834138;
                                            int var837 = var1 + 1;
                                            int var838 = var1 * var837;
                                            int var839 = var838 & 1;
                                            if (var839 != 0) {
                                                break label624;
                                            }

                                            var772 = var771;
                                            var31 &= 352172613;
                                            var31 *= -511176969;
                                            var31 -= -83035370;
                                            var31 ^= -191785703;
                                        } else {
                                            var31 |= -696796746;
                                            var31 ^= -1849731770;
                                            int var840 = var1 + 1;
                                            int var841 = var1 * var840;
                                            int var842 = var841 & 1;
                                            if (var842 != 0) {
                                                break label624;
                                            }

                                            float var843 = var655;
                                            float var844 = var843 - var611;
                                            var22 = var7;
                                            long var24 = var22 + 1L;
                                            var24 = var22 * var24;
                                            long var26 = var22 + 2L;
                                            var24 *= var26;
                                            var22 += 3L;
                                            var24 *= var22;
                                            var22 = var24 & 7L;
                                            long var949;
                                            int var872 = (var949 = var22 - 0L) == 0L ? 0 : (var949 < 0L ? -1 : 1);
                                            if (var872 != 0) {
                                                switch (var31) {
                                                    case -1960680504:
                                                        var31 ^= 262897235;
                                                        break label685;
                                                    case 1330179321:
                                                        var31 += 1747462659;
                                                        var31 ^= 1305255415;
                                                        var31 ^= -1193275646;
                                                        break label685;
                                                    case 1706177286:
                                                    default:
                                                        var31 ^= -310068866;
                                                        break label685;
                                                }
                                            }
                                            var31 = switch (var31) {
                                                default -> var31 ^ 1350767818;
                                                case 427983924 -> var31 ^ -116575811;
                                                case 1330179321 -> {
                                                    var31 &= 758777649;
                                                    var31 <<= 2;
                                                    var31 ^= 1485445133;
                                                    var31 ^= 1141077865;
                                                    yield var31 ^ 1175471413;
                                                }
                                            };
                                            var22 = var1;
                                            var24 = var22 + 1L;
                                            var24 = var22 * var24;
                                            var26 = var22 + 2L;
                                            var24 *= var26;
                                            var22 += 3L;
                                            var24 *= var22;
                                            var22 = var24 & 7L;
                                            long var950;
                                            int var876 = (var950 = var22 - 0L) == 0L ? 0 : (var950 < 0L ? -1 : 1);
                                            if (var876 != 0) {
                                                break label624;
                                            }

                                            var859 = var844;
                                            var859 -= 0.001;
                                            var772 = var859;
                                            switch (var31) {
                                                case -1783676889:
                                                    var31 ^= 1504652371;
                                                    break;
                                                case 1857632917:
                                                    var31 += -517439861;
                                                    var31 >>>= 3;
                                                    var31 -= 1999733904;
                                                    var31 ^= 468844811;
                                                    break;
                                                case 2109719169:
                                                default:
                                                    var31 ^= 1328327840;
                                            }
                                        }

                                        int var847 = var7 + 1;
                                        int var848 = var7 * var847;
                                        int var877 = var7 + 2;
                                        int var849 = var848 * var877;
                                        int var878 = var7 + 3;
                                        int var850 = var849 * var878;
                                        int var851 = var850 & 7;
                                        if (var851 != 0) {
                                            var31 ^= -1934391323;
                                            var31 ^= 1205252211;
                                            break label685;
                                        }
                                        var31 = switch (var31) {
                                            case -1992772705 -> {
                                                var31 += -818428226;
                                                var31 -= 1280297790;
                                                var31 >>= 28;
                                                var31 ^= 1207543076;
                                                yield var31 ^ -27501304;
                                            }
                                            default -> var31 ^ 2052754618;
                                            case 1908769319 -> var31 ^ 2137840154;
                                        };
                                        int var852 = var1 + 1;
                                        int var853 = var1 * var852;
                                        int var879 = var1 + 2;
                                        int var854 = var853 * var879;
                                        int var880 = var1 + 3;
                                        int var855 = var854 * var880;
                                        int var856 = var855 & 7;
                                        if (var856 != 0) {
                                            break label624;
                                        }

                                        if (var679 != 0) {
                                            var31 *= -2110088221;
                                            var31 &= 1851660792;
                                            var31 ^= 778177924;
                                            var31 |= 6474522;
                                            var31 ^= 587471423;
                                            var679 = var31 | 2139423417;
                                            var679 >>>= 31;
                                            var679 |= -1279906996;
                                            var679 ^= -2005538684;
                                            this.la(var1, var2, var679);
                                            var679 = var7 + 1;
                                            var679 = var7 * var679;
                                            int var857 = var7 + 2;
                                            var679 *= var857;
                                            int var858 = var7 + 3;
                                            var679 *= var858;
                                            var679 &= 7;
                                            if (var679 != 0) {
                                                var31 ^= -416472151;
                                                var31 *= -1156819837;
                                                var31 += 1820086949;
                                                var31 ^= -43766604;
                                                break label685;
                                            }

                                            var31 *= 922326537;
                                            var31 &= 1828332369;
                                            var31 ^= -1162149492;
                                            var859 = var772;
                                            var31 *= -34433389;
                                            var31 |= 663273725;
                                            var31 -= -30304438;
                                            var31 ^= 1945918999;
                                        } else {
                                            var31 -= -1234920433;
                                            var31 ^= -810528614;
                                            float[] var689 = this.eu;
                                            float[] var901 = this.eu;
                                            float var902 = var901[var1];
                                            float var903 = -var902;
                                            float var904 = var903 * 0.9090909F;
                                            var689[var1] = var904;
                                            Integer var690 = var7;
                                            if (var690 == null) {
                                                switch (var31) {
                                                    case -1817999915:
                                                        var31 ^= -144804600;
                                                        break label685;
                                                    case -1441867994:
                                                    default:
                                                        var31 ^= 562537084;
                                                        break label685;
                                                    case -856617849:
                                                        var31 |= -627683538;
                                                        var31 |= -2026735055;
                                                        var31 &= -1163566424;
                                                        var31 ^= -654776671;
                                                        break label685;
                                                }
                                            }

                                            var31 >>>= 19;
                                            var31 -= 1803896356;
                                            var31 |= 877295958;
                                            var31 ^= 799397406;
                                            int var691 = var1 + 1;
                                            var691 = var1 * var691;
                                            int var905 = var1 + 2;
                                            var691 *= var905;
                                            int var906 = var1 + 3;
                                            var691 *= var906;
                                            var691 &= 7;
                                            if (var691 != 0) {
                                                break label624;
                                            }

                                            var859 = var772;
                                            var31 ^= 1953065125;
                                            var31 ^= 636957031;
                                        }
                                    } else {
                                        var31 = switch (var31) {
                                            case -2079133486 -> var31 ^ -2005274108;
                                            default -> var31 ^ -1602386760;
                                            case -1299647086 -> {
                                                var31 += -1888236113;
                                                yield var31 ^ 1258541795;
                                            }
                                        };
                                        var859 = var524;
                                        switch (var31) {
                                            case -1131768067:
                                            default:
                                                var31 ^= 1256802538;
                                                break;
                                            case 46418962:
                                                var31 ^= 1935603031;
                                                break;
                                            case 184488354:
                                                var31 *= 1079285221;
                                                var31 += 1514426306;
                                                var31 &= 665642206;
                                                var31 += -323678292;
                                                var31 ^= -646176614;
                                        }
                                    }
                                } else {
                                    var31 += -532643755;
                                    var31 ^= 30380974;
                                    var661 = var1 + 1;
                                    var661 = var1 * var661;
                                    var661 &= 1;
                                    if (var661 != 0) {
                                        break label624;
                                    }

                                    var859 = var524;
                                    var31 |= 974954335;
                                    var31 -= 718001336;
                                    var31 ^= -978141595;
                                }
                            } else {
                                var31 |= 85534533;
                                var31 ^= 1642077723;
                                Integer var699 = var1;
                                if (var699 == null) {
                                    break label624;
                                }

                                var859 = var524;
                                switch (var31) {
                                    case -1705745569:
                                    default:
                                        var31 ^= -1908525378;
                                        break;
                                    case -780010503:
                                        var31 ^= 1788897291;
                                        break;
                                    case 251339124:
                                        var31 >>>= 19;
                                        var31 ^= -901679747;
                                }
                            }

                            long var525 = var1;
                            long var700 = var525 + 1L;
                            var700 = var525 * var700;
                            long var907 = var525 + 2L;
                            var700 *= var907;
                            long var526 = var525 + 3L;
                            var700 *= var526;
                            long var527 = var700 & 7L;
                            long var951;
                            int var528 = (var951 = var527 - 0L) == 0L ? 0 : (var951 < 0L ? -1 : 1);
                            if (var528 != 0) {
                                break label624;
                            }

                            double[] var529 = this.Vf;
                            var529[var1] = var859;
                            double[] var530 = this.Vf;
                            double var531 = var530[var1];
                            double var532 = Math.floor(var531);
                            Integer var704 = var7;
                            label570:
                            if (var704 != null) {
                                var31 -= -1030292232;
                                var31 *= -1783414991;
                                var31 &= -376867057;
                                var31 ^= -432460881;
                                int var533 = (int)var532;
                                float[] var11 = this.Sz;
                                float var544 = var11[var1];
                                float var952;
                                int var545 = (var952 = var544 - 0.0F) == 0.0F ? 0 : (var952 < 0.0F ? -1 : 1);
                                double var805;
                                if (var545 != 0) {
                                    var31 = switch (var31) {
                                        default -> var31 ^ -1816135040;
                                        case -289923419 -> {
                                            var31 &= -2049144298;
                                            yield var31 ^ 2060203340;
                                        }
                                        case -50358493 -> var31 ^ -870403536;
                                    };
                                    var700 = var1;
                                    long var789 = var700 + 1L;
                                    long var790 = var700 * var789;
                                    var700 = var790 & 1L;
                                    long var953;
                                    int var546 = (var953 = var700 - 0L) == 0L ? 0 : (var953 < 0L ? -1 : 1);
                                    if (var546 != 0) {
                                        break label624;
                                    }

                                    var11 = this.Sz;
                                    float var548 = var11[var1];
                                    float var954;
                                    int var549 = (var954 = var548 - 0.0F) == 0.0F ? 0 : (var954 < 0.0F ? -1 : 1);
                                    Integer var707 = var7;
                                    if (var707 == null) {
                                        var31 &= 894026187;
                                        var31 ^= 1981646145;
                                        break label570;
                                    }

                                    var31 &= -850251214;
                                    var31 ^= 1492587241;
                                    int var708 = var1 + 1;
                                    int var709 = var1 * var708;
                                    int var710 = var709 & 1;
                                    if (var710 != 0) {
                                        break label624;
                                    }

                                    double var720;
                                    if (var549 < 0) {
                                        var31 = switch (var31) {
                                            case -1800986391 -> {
                                                var31 ^= -789952265;
                                                var31 -= -903298405;
                                                var31 -= -1290091722;
                                                yield var31 ^ -1776039791;
                                            }
                                            default -> var31 ^ -974665140;
                                            case 418579059 -> var31 ^ -1836430416;
                                        };
                                        int var550 = var1 + 1;
                                        int var551 = var1 * var550;
                                        int var711 = var1 + 2;
                                        int var552 = var551 * var711;
                                        int var712 = var1 + 3;
                                        int var553 = var552 * var712;
                                        int var554 = var553 & 7;
                                        if (var554 != 0) {
                                            break label624;
                                        }

                                        float var555 = -var611;
                                        int var713 = var7 + 1;
                                        int var714 = var7 * var713;
                                        int var715 = var714 & 1;
                                        if (var715 != 0) {
                                            var31 ^= -1382261577;
                                            var31 >>= 17;
                                            var31 -= 52002256;
                                            var31 ^= 1520554049;
                                            var31 ^= -468003645;
                                            break label570;
                                        }
                                        var31 = switch (var31) {
                                            default -> var31 ^ -206715124;
                                            case -271067238 -> var31 ^ -912073257;
                                            case 1361717980 -> {
                                                var31 += -929223580;
                                                var31 *= 1643902893;
                                                var31 ^= 2023922747;
                                                var31 ^= 715380183;
                                                yield var31 ^ 1480541353;
                                            }
                                        };
                                        var700 = var1;
                                        long var791 = var700 + 1L;
                                        long var792 = var700 * var791;
                                        var700 = var792 & 1L;
                                        long var955;
                                        int var718 = (var955 = var700 - 0L) == 0L ? 0 : (var955 < 0L ? -1 : 1);
                                        if (var718 != 0) {
                                            break label624;
                                        }

                                        double var719 = var555;
                                        var720 = var719;
                                        var31 ^= -1570583902;
                                        var31 *= -109825045;
                                        var31 += 467407514;
                                        var31 *= -1511616923;
                                        var31 ^= -92662734;
                                    } else {
                                        var31 &= -926377481;
                                        var31 |= 1940993666;
                                        var31 ^= -1375920064;
                                        int var556 = var1 + 1;
                                        int var557 = var1 * var556;
                                        int var558 = var557 & 1;
                                        if (var558 != 0) {
                                            break label624;
                                        }

                                        var805 = var611;
                                        long var881 = var7;
                                        long var923 = var881 + 1L;
                                        var923 = var881 * var923;
                                        var881 = var923 & 1L;
                                        long var956;
                                        int var559 = (var956 = var881 - 0L) == 0L ? 0 : (var956 < 0L ? -1 : 1);
                                        if (var559 != 0) {
                                            var31 <<= 26;
                                            var31 += 770277491;
                                            var31 >>= 2;
                                            var31 -= -2105010964;
                                            var31 ^= 699387705;
                                            break label570;
                                        }

                                        var31 >>>= 2;
                                        var31 -= 2044033038;
                                        var31 ^= 1031715814;
                                        int var560 = var1 + 1;
                                        int var561 = var1 * var560;
                                        int var883 = var1 + 2;
                                        int var562 = var561 * var883;
                                        int var884 = var1 + 3;
                                        int var563 = var562 * var884;
                                        int var564 = var563 & 7;
                                        if (var564 != 0) {
                                            break label624;
                                        }

                                        var720 = var805;
                                        switch (var31) {
                                            case -1597819268:
                                                var31 -= -913748064;
                                                var31 -= -1358206973;
                                                var31 *= -1435041593;
                                                var31 ^= 1739225790;
                                                break;
                                            case -1592521056:
                                                var31 ^= 1313708169;
                                                break;
                                            case 700902348:
                                            default:
                                                var31 ^= -1697327439;
                                        }
                                    }

                                    var805 = var458 + var720;
                                    var805 = Math.floor(var805);
                                    int var565 = (int)var805;
                                    double[] var566 = this.H;
                                    var805 = var566[var1];
                                    int var567 = var7 + 1;
                                    int var568 = var7 * var567;
                                    int var885 = var7 + 2;
                                    int var569 = var568 * var885;
                                    var885 = var7 + 3;
                                    int var570 = var569 * var885;
                                    int var571 = var570 & 7;
                                    if (var571 != 0) {
                                        var31 >>>= 29;
                                        var31 |= 2123137091;
                                        var31 += -1826246198;
                                        var31 ^= 1408218628;
                                        break label570;
                                    }
                                    var31 = switch (var31) {
                                        default -> var31 ^ -1197433415;
                                        case 715776017 -> {
                                            var31 <<= 25;
                                            var31 ^= 812720902;
                                            var31 |= 1947188806;
                                            var31 += 326425641;
                                            yield var31 ^ 1355986317;
                                        }
                                        case 1619663790 -> var31 ^ 954459542;
                                    };
                                    var805 += var720;
                                    var805 = Math.floor(var805);
                                    int var572 = (int)var805;
                                    if (var572 != var565) {
                                        var31 |= -2061905966;
                                        var31 &= -1980196979;
                                        var31 += 2089005545;
                                        var31 ^= 852105398;
                                        boolean var573 = i_2.rZ(var565, var533, var624);
                                        var624 = var7 + 1;
                                        var624 = var7 * var624;
                                        int var799 = var7 + 2;
                                        var624 *= var799;
                                        int var800 = var7 + 3;
                                        var624 *= var800;
                                        var624 &= 7;
                                        if (var624 != 0) {
                                            var31 += -1208855425;
                                            var31 |= -1205322413;
                                            var31 &= -471087251;
                                            var31 ^= -1590312124;
                                            break label570;
                                        }

                                        var31 *= -746923755;
                                        var31 >>>= 11;
                                        var31 &= -393022480;
                                        var31 *= -869155769;
                                        var31 ^= -1805370236;
                                        var624 = var1 + 1;
                                        var624 = var1 * var624;
                                        var624 &= 1;
                                        if (var624 != 0) {
                                            break label624;
                                        }

                                        if (var573) {
                                            var31 &= -1743659447;
                                            var31 |= 1390745465;
                                            var31 |= -856770755;
                                            var31 ^= 1958407405;
                                            var11 = this.Sz;
                                            float[] var638 = this.Sz;
                                            float var639 = var638[var1];
                                            float var640 = -var639;
                                            int var801 = var31 & -762841059;
                                            int var802 = var801 ^ 224540878;
                                            float var803 = G(var2, var802);
                                            long var860 = var7;
                                            var907 = var860 + 1L;
                                            var907 = var860 * var907;
                                            long var25 = var860 + 2L;
                                            var907 *= var25;
                                            long var861 = var860 + 3L;
                                            var907 *= var861;
                                            long var862 = var907 & 7L;
                                            long var957;
                                            int var863 = (var957 = var862 - 0L) == 0L ? 0 : (var957 < 0L ? -1 : 1);
                                            if (var863 != 0) {
                                                switch (var31) {
                                                    case -1437246576:
                                                        var31 -= -1889282212;
                                                        var31 ^= 1650689662;
                                                        var31 ^= 986678851;
                                                        break label570;
                                                    case -6919347:
                                                        var31 ^= 1210781033;
                                                        break label570;
                                                    case 1174614747:
                                                    default:
                                                        var31 ^= -1469259775;
                                                        break label570;
                                                }
                                            }
                                            var31 = switch (var31) {
                                                case -1437246576 -> {
                                                    var31 >>= 20;
                                                    var31 |= -782618474;
                                                    yield var31 ^ 1829954256;
                                                }
                                                default -> var31 ^ 93649410;
                                                case 521411488 -> var31 ^ 1528198318;
                                            };
                                            long var864 = var1;
                                            var907 = var864 + 1L;
                                            var907 = var864 * var907;
                                            var25 = var864 + 2L;
                                            var907 *= var25;
                                            long var865 = var864 + 3L;
                                            var907 *= var865;
                                            long var866 = var907 & 7L;
                                            long var958;
                                            int var867 = (var958 = var866 - 0L) == 0L ? 0 : (var958 < 0L ? -1 : 1);
                                            if (var867 != 0) {
                                                break label624;
                                            }

                                            float var641 = var640 * var803;
                                            var11[var1] = var641;
                                            double[] var575 = this.H;
                                            var805 = var575[var1];
                                            var805 = var805;
                                            var31 *= 2060348315;
                                            var31 |= 768545270;
                                            var31 &= 500964720;
                                            var31 >>= 19;
                                            var31 ^= 1435937074;
                                        } else {
                                            var31 -= 2064900476;
                                            var31 *= -783054101;
                                            var31 ^= -971882594;
                                            var805 = var458;
                                            var31 &= 1522055066;
                                            var31 ^= -857020311;
                                            var31 ^= -1854610192;
                                        }
                                    } else {
                                        var31 = switch (var31) {
                                            case -651809054 -> {
                                                var31 ^= 901397689;
                                                var31 |= -401762445;
                                                var31 &= -1858883340;
                                                var31 <<= 27;
                                                yield var31 ^ -1392295790;
                                            }
                                            default -> var31 ^ 527557566;
                                            case 839797075 -> var31 ^ 1516917691;
                                        };
                                        long var887 = var1;
                                        long var925 = var887 + 1L;
                                        var925 = var887 * var925;
                                        long var935 = var887 + 2L;
                                        var925 *= var935;
                                        long var888 = var887 + 3L;
                                        var925 *= var888;
                                        long var889 = var925 & 7L;
                                        long var959;
                                        int var576 = (var959 = var889 - 0L) == 0L ? 0 : (var959 < 0L ? -1 : 1);
                                        if (var576 != 0) {
                                            break label624;
                                        }

                                        var805 = var458;
                                        var31 &= -792721437;
                                        var31 += 2125994384;
                                        var31 |= 1574087536;
                                        var31 <<= 15;
                                        var31 ^= 137341067;
                                    }
                                } else {
                                    var31 = switch (var31) {
                                        case -289923419 -> {
                                            var31 -= 1636369653;
                                            var31 -= 1087389045;
                                            var31 ^= 966442486;
                                            var31 -= 1979640728;
                                            yield var31 ^ 886944664;
                                        }
                                        case 542912315 -> var31 ^ -959535308;
                                        default -> var31 ^ 223802365;
                                    };
                                    Integer var577 = var1;
                                    if (var577 == null) {
                                        break label624;
                                    }

                                    var805 = var458;
                                    switch (var31) {
                                        case -887568979:
                                            var31 *= -1988097367;
                                            var31 -= -1314081844;
                                            var31 >>>= 7;
                                            var31 ^= 1411343761;
                                            break;
                                        case -515815261:
                                            var31 ^= 745009627;
                                            break;
                                        case 734740293:
                                        default:
                                            var31 ^= -873217138;
                                    }
                                }

                                Integer var459 = var1;
                                if (var459 == null) {
                                    break label624;
                                }

                                var8 = this.H;
                                var8[var1] = var805;
                                var8 = this.H;
                                double var462 = var8[var1];
                                double var463 = Math.floor(var462);
                                int var464 = (int)var463;
                                long var465 = var7;
                                long var806 = var465 + 1L;
                                long var807 = var465 * var806;
                                long var466 = var807 & 1L;
                                long var960;
                                int var467 = (var960 = var466 - 0L) == 0L ? 0 : (var960 < 0L ? -1 : 1);
                                label543:
                                if (var467 == 0) {
                                    var31 = switch (var31) {
                                        default -> var31 ^ 1855229158;
                                        case 1044812446 -> var31 ^ -1271732571;
                                        case 1435936907 -> {
                                            var31 *= -785587165;
                                            var31 += -3290258;
                                            yield var31 ^ -2070262881;
                                        }
                                    };
                                    long var468 = var1;
                                    long var808 = var468 + 1L;
                                    long var809 = var468 * var808;
                                    long var890 = var468 + 2L;
                                    long var810 = var809 * var890;
                                    long var469 = var468 + 3L;
                                    long var811 = var810 * var469;
                                    long var470 = var811 & 7L;
                                    long var961;
                                    int var471 = (var961 = var470 - 0L) == 0L ? 0 : (var961 < 0L ? -1 : 1);
                                    if (var471 != 0) {
                                        break label624;
                                    }

                                    float[] var472 = this.m;
                                    float var473 = var472[var1];
                                    float var962;
                                    int var474 = (var962 = var473 - 0.0F) == 0.0F ? 0 : (var962 < 0.0F ? -1 : 1);
                                    double var497;
                                    if (var474 != 0) {
                                        var31 = switch (var31) {
                                            case -1178186533 -> var31 ^ 317439987;
                                            default -> var31 ^ -898022542;
                                            case -788731408 -> {
                                                var31 += -1323340057;
                                                var31 -= -1063036969;
                                                var31 *= 402725313;
                                                yield var31 ^ 185360772;
                                            }
                                        };
                                        int var475 = var1 + 1;
                                        int var476 = var1 * var475;
                                        int var477 = var476 & 1;
                                        if (var477 != 0) {
                                            break label624;
                                        }

                                        float[] var478 = this.m;
                                        int var9 = var7 + 1;
                                        var9 = var7 * var9;
                                        int var578 = var7 + 2;
                                        var9 *= var578;
                                        int var579 = var7 + 3;
                                        var9 *= var579;
                                        var9 &= 7;
                                        if (var9 != 0) {
                                            var31 >>= 17;
                                            var31 ^= -1113434458;
                                            break label543;
                                        }

                                        var31 &= -1087895246;
                                        var31 -= -1851126733;
                                        var31 += -1275934408;
                                        var31 ^= 180496851;
                                        var9 = var1 + 1;
                                        var9 = var1 * var9;
                                        int var580 = var1 + 2;
                                        var9 *= var580;
                                        int var581 = var1 + 3;
                                        var9 *= var581;
                                        var9 &= 7;
                                        if (var9 != 0) {
                                            break label624;
                                        }

                                        float var479 = var478[var1];
                                        float var963;
                                        int var480 = (var963 = var479 - 0.0F) == 0.0F ? 0 : (var963 < 0.0F ? -1 : 1);
                                        double var483;
                                        if (var480 < 0) {
                                            var31 ^= -264281633;
                                            var31 |= 1271272950;
                                            var31 >>= 24;
                                            var31 -= -2266161;
                                            var31 ^= -1175522356;
                                            float var481 = -var611;
                                            double var482 = var481;
                                            long var812 = var7;
                                            var890 = var812 + 1L;
                                            var890 = var812 * var890;
                                            long var813 = var890 & 1L;
                                            long var964;
                                            int var582 = (var964 = var813 - 0L) == 0L ? 0 : (var964 < 0L ? -1 : 1);
                                            if (var582 != 0) {
                                                var31 += 969536010;
                                                var31 |= 1613503482;
                                                var31 ^= -2015063546;
                                                var31 ^= 906448369;
                                                break label543;
                                            }

                                            var31 += 1617217594;
                                            var31 ^= 669133623;
                                            Integer var583 = var1;
                                            if (var583 == null) {
                                                break label624;
                                            }

                                            var483 = var482;
                                            var31 |= 1856507219;
                                            var31 ^= -1591451346;
                                        } else {
                                            var31 *= -640335257;
                                            var31 -= -1424663825;
                                            var31 >>>= 19;
                                            var31 ^= 1519645148;
                                            var805 = var611;
                                            var890 = var7;
                                            long var929 = var890 + 1L;
                                            var929 = var890 * var929;
                                            long var936 = var890 + 2L;
                                            var929 *= var936;
                                            var890 += 3L;
                                            var929 *= var890;
                                            var890 = var929 & 7L;
                                            long var965;
                                            int var584 = (var965 = var890 - 0L) == 0L ? 0 : (var965 < 0L ? -1 : 1);
                                            if (var584 != 0) {
                                                var31 &= -830860353;
                                                var31 *= 1913546963;
                                                var31 ^= -964580597;
                                                break label543;
                                            }

                                            var31 *= 1723898573;
                                            var31 -= 220275712;
                                            var31 ^= -1740888032;
                                            var31 >>= 10;
                                            var31 ^= -1419601612;
                                            int var585 = var1 + 1;
                                            int var586 = var1 * var585;
                                            int var587 = var586 & 1;
                                            if (var587 != 0) {
                                                break label624;
                                            }

                                            var483 = var805;
                                            var31 *= -876280821;
                                            var31 >>>= 21;
                                            var31 *= -99412733;
                                            var31 ^= 1567956794;
                                        }

                                        Integer var588 = var1;
                                        if (var588 == null) {
                                            break label624;
                                        }

                                        double var484 = var596 + var483;
                                        double var485 = Math.floor(var484);
                                        int var486 = (int)var485;
                                        var8 = this.j;
                                        double var488 = var8[var1];
                                        double var489 = var488 + var483;
                                        double var490 = Math.floor(var489);
                                        int var491 = (int)var490;
                                        var700 = var7;
                                        long var815 = var700 + 1L;
                                        long var816 = var700 * var815;
                                        var700 = var816 & 1L;
                                        long var966;
                                        var9 = (var966 = var700 - 0L) == 0L ? 0 : (var966 < 0L ? -1 : 1);
                                        if (var9 != 0) {
                                            var31 &= 1380625457;
                                            var31 *= -1169440361;
                                            var31 *= 574583227;
                                            var31 ^= -1631002956;
                                            break label543;
                                        }

                                        var31 *= 413163025;
                                        var31 <<= 1;
                                        var31 >>= 8;
                                        var31 *= 2034910823;
                                        var31 ^= 1194441175;
                                        if (var491 != var486) {
                                            var31 = switch (var31) {
                                                case -850703852 -> {
                                                    var31 >>= 5;
                                                    var31 ^= 49151779;
                                                    yield var31 ^ -849263557;
                                                }
                                                default -> var31 ^ -1372946358;
                                                case -53089899 -> var31 ^ 1547513998;
                                            };
                                            boolean var492 = i_2.rZ(var464, var533, var486);
                                            Integer var508 = var7;
                                            if (var508 == null) {
                                                var31 -= 1474395493;
                                                var31 |= 791499764;
                                                var31 -= 1163500147;
                                                var31 -= -1355402969;
                                                var31 ^= 1220553812;
                                                break label543;
                                            }

                                            var31 -= 2027332311;
                                            var31 &= -583887479;
                                            var31 ^= 1402444973;
                                            if (var492) {
                                                var31 >>= 16;
                                                var31 &= -72124111;
                                                var31 ^= 2019567101;
                                                Integer var493 = var1;
                                                if (var493 == null) {
                                                    break label624;
                                                }

                                                float[] var494 = this.m;
                                                long var509 = var7;
                                                long var612 = var509 + 1L;
                                                long var613 = var509 * var612;
                                                long var510 = var613 & 1L;
                                                long var967;
                                                int var511 = (var967 = var510 - 0L) == 0L ? 0 : (var967 < 0L ? -1 : 1);
                                                if (var511 != 0) {
                                                    switch (var31) {
                                                        case -2083295748:
                                                            var31 <<= 13;
                                                            var31 ^= 803341321;
                                                            break label543;
                                                        case -6771331:
                                                            var31 ^= 1587250379;
                                                            break label543;
                                                        case 1694555035:
                                                        default:
                                                            var31 ^= -654252465;
                                                            break label543;
                                                    }
                                                }

                                                var31 -= -2121814622;
                                                var31 ^= -752342340;
                                                var31 ^= 1772878236;
                                                float[] var512 = this.m;
                                                float var513 = var512[var1];
                                                float var514 = -var513;
                                                int var534 = var31 * -1066718031;
                                                int var535 = var534 ^ -560870659;
                                                int var536 = var535 + 366231440;
                                                int var537 = var536 ^ -1569290775;
                                                float var538 = G(var2, var537);
                                                float var515 = var514 * var538;
                                                var494[var1] = var515;
                                                var8 = this.j;
                                                double var496 = var8[var1];
                                                var497 = var496;
                                                var31 ^= -1474119674;
                                                var31 -= -982430548;
                                                var31 ^= 90054837;
                                                var31 >>= 5;
                                                var31 ^= 996504825;
                                            } else {
                                                var31 += -191278462;
                                                var31 ^= -751655951;
                                                var497 = var596;
                                                var31 += 1145432525;
                                                var31 -= 794004147;
                                                var31 &= 823310878;
                                                var31 ^= -982014902;
                                                var31 ^= -43812520;
                                            }
                                        } else {
                                            var31 &= -1099984663;
                                            var31 >>= 19;
                                            var31 -= 1920322037;
                                            var31 ^= 1213950716;
                                            var31 ^= -47330646;
                                            Integer var539 = var1;
                                            if (var539 == null) {
                                                break label624;
                                            }

                                            var497 = var596;
                                            var31 ^= 1713801565;
                                            var31 &= -503987477;
                                            var31 &= -234294852;
                                            var31 ^= 2031374210;
                                        }
                                    } else {
                                        var31 ^= 1768857461;
                                        var31 *= -1741365933;
                                        var31 -= 1797375246;
                                        var31 &= 1133674325;
                                        var31 ^= 1276550732;
                                        var497 = var596;
                                        var31 += 1072189566;
                                        var31 ^= 426080311;
                                        var31 -= 652007696;
                                        var31 <<= 6;
                                        var31 ^= 935983114;
                                    }

                                    long var540 = var1;
                                    long var597 = var540 + 1L;
                                    long var598 = var540 * var597;
                                    long var541 = var598 & 1L;
                                    long var968;
                                    int var542 = (var968 = var541 - 0L) == 0L ? 0 : (var968 < 0L ? -1 : 1);
                                    if (var542 != 0) {
                                        break label624;
                                    }

                                    double[] var543 = this.j;
                                    int var589 = var7 + 1;
                                    int var590 = var7 * var589;
                                    var7 = var590 & 1;
                                    if (var7 == 0) {
                                        switch (var31) {
                                            case -1090717808:
                                            default:
                                                var31 ^= -1007915557;
                                                break;
                                            case 206588726:
                                                var31 ^= 1747938903;
                                                break;
                                            case 957632266:
                                                var31 ^= -1870935043;
                                                var31 *= 2121735063;
                                                var31 *= -1973000655;
                                                var31 ^= 533544173;
                                        }

                                        var7 = var1 + 1;
                                        var7 = var1 * var7;
                                        var7 &= 1;
                                        if (var7 == 0) {
                                            var543[var1] = var497;
                                            return;
                                        }
                                        break label624;
                                    }

                                    var31 |= 1710472521;
                                    var31 ^= 1068137282;
                                } else {
                                    var31 *= -949313649;
                                    var31 += -143007177;
                                    var31 &= -1695712232;
                                    var31 ^= 2008743197;
                                    var31 ^= 1059792140;
                                }
                            } else {
                                switch (var31) {
                                    case -901679966:
                                        var31 += 76139796;
                                        var31 &= -1165433877;
                                        var31 += 385239163;
                                        var31 *= -15668783;
                                        var31 ^= -896621916;
                                        break;
                                    case 415414011:
                                    default:
                                        var31 ^= -2129204492;
                                        break;
                                    case 1206325473:
                                        var31 ^= -1413489572;
                                }
                            }
                        }
                    }
                }
            }

            Integer var450 = var1;
            if (var450 != null) {
                UnsupportedOperationException var451 = new UnsupportedOperationException();
                throw var451;
            }
        }

        IllegalStateException var452 = new IllegalStateException();
        throw var452;
    }

    private void la(int var1, bA_2 var2, int var3) {
        label131: {
            label139: {
                int var6 = System.identityHashCode(this);
                ThreadLocalRandom var7 = ThreadLocalRandom.current();
                long var8 = var6;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                var8 = var10 & 1L;
                long var214;
                int var139 = (var214 = var8 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                if (var139 != 0) {
                    int var97 = var3 << 10;
                    var97 -= -1597128654;
                    var97 |= 1557684444;
                    var97 ^= -578755422;
                } else {
                    label138: {
                        int var24;
                        label144: {
                            var24 = var3 << 26;
                            var24 *= 792981477;
                            var24 += -1337241220;
                            var24 ^= 1899500462;
                            int var140 = var2.ordinal();
                            switch (var140) {
                                case 3:
                                    var24 &= 1583801410;
                                    var24 ^= 183195850;
                                    break;
                                case 4:
                                    var24 &= 382486945;
                                    var24 ^= 180967432;
                                    break;
                                case 5:
                                    var24 *= -1392084651;
                                    var24 ^= 244349904;
                                    Integer var155 = var1;
                                    if (var155 == null) {
                                        break label131;
                                    }

                                    float[] var156 = this.eu;
                                    float var9 = var7.nextFloat();
                                    var9 *= 1.0F;
                                    var9 = 3.6F + var9;
                                    var156[var1] = var9;
                                    float[] var157 = this.Sz;
                                    float[] var180 = this.Sz;
                                    int var200 = var6 + 1;
                                    int var201 = var6 * var200;
                                    int var202 = var201 & 1;
                                    if (var202 != 0) {
                                        var24 += 1590618513;
                                        var24 ^= -567776036;
                                        var24 ^= 5571675;
                                        break label138;
                                    }

                                    var24 |= -1929365208;
                                    var24 <<= 20;
                                    var24 ^= -1195132611;
                                    int var203 = var1 + 1;
                                    int var204 = var1 * var203;
                                    int var205 = var204 & 1;
                                    if (var205 != 0) {
                                        break label131;
                                    }

                                    var9 = var180[var1];
                                    var9 *= 0.98F;
                                    float var206 = var7.nextFloat();
                                    float var207 = var206 - 0.5F;
                                    float var208 = var207 * 0.2F;
                                    var9 += var208;
                                    var157[var1] = var9;
                                    float[] var158 = this.m;
                                    float[] var184 = this.m;
                                    var9 = var184[var1];
                                    var9 *= 0.98F;
                                    float var114 = var7.nextFloat();
                                    float var115 = var114 - 0.5F;
                                    float var116 = var115 * 0.2F;
                                    float var117 = var9 + var116;
                                    var158[var1] = var117;
                                    var24 |= -1954681042;
                                    var24 <<= 20;
                                    var24 += 1146063994;
                                    var24 ^= 1949657374;
                                    break label144;
                                default:
                                    var24 += -1897029681;
                                    var24 -= 872739552;
                                    var24 |= -726769703;
                                    var24 &= 748692425;
                                    var24 ^= 1756336843;
                                    int var106 = var1 + 1;
                                    int var107 = var1 * var106;
                                    int var141 = var1 + 2;
                                    int var108 = var107 * var141;
                                    int var142 = var1 + 3;
                                    int var109 = var108 * var142;
                                    int var110 = var109 & 7;
                                    if (var110 != 0) {
                                        break label131;
                                    }

                                    float[] var111 = this.eu;
                                    var8 = var6;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    long var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var215;
                                    int var146 = (var215 = var8 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                                    if (var146 != 0) {
                                        var24 |= 2083661651;
                                        var24 <<= 24;
                                        var24 &= -560400285;
                                        var24 ^= -245785732;
                                        break label138;
                                    }

                                    var24 <<= 6;
                                    var24 ^= -1950840297;
                                    float[] var147 = this.eu;
                                    float var148 = var147[var1];
                                    float var149 = -var148;
                                    float var150 = var149 * 0.35F;
                                    var111[var1] = var150;
                                    float[] var112 = this.Sz;
                                    float var151 = var112[var1];
                                    float var152 = var151 * 0.6F;
                                    var112[var1] = var152;
                                    float[] var113 = this.m;
                                    float var153 = var113[var1];
                                    float var154 = var153 * 0.6F;
                                    var113[var1] = var154;
                                    switch (var24) {
                                        case -2007709033:
                                            var24 ^= 814011145;
                                            var24 += -2127065275;
                                            var24 ^= 1980583303;
                                            break label144;
                                        case -1593965703:
                                            var24 ^= -1182294765;
                                            break label144;
                                        case 1840915215:
                                        default:
                                            var24 ^= 1285198723;
                                            break label144;
                                    }
                            }

                            float[] var118 = this.eu;
                            float[] var159 = this.eu;
                            float var160 = var159[var1];
                            float var161 = -var160;
                            float var162 = var161 * 0.9090909F;
                            var118[var1] = var162;
                            Integer var119 = var6;
                            if (var119 == null) {
                                var24 |= 1279456283;
                                var24 |= 754137959;
                                var24 ^= -844995453;
                                break label138;
                            }
                            var24 = switch (var24) {
                                case -229788538 -> var24 ^ -1547686477;
                                case 176756872 -> {
                                    var24 += -338536517;
                                    var24 ^= 891088884;
                                    var24 &= 1122267629;
                                    yield var24 ^ -1896840603;
                                }
                                default -> var24 ^ -1491953146;
                            };
                            long var120 = var1;
                            long var187 = var120 + 1L;
                            var187 = var120 * var187;
                            long var11 = var120 + 2L;
                            var187 *= var11;
                            long var121 = var120 + 3L;
                            var187 *= var121;
                            long var122 = var187 & 7L;
                            long var216;
                            int var123 = (var216 = var122 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                            if (var123 != 0) {
                                break label131;
                            }

                            float[] var124 = this.Sz;
                            float var163 = var124[var1];
                            float var164 = var163 * 0.9090909F;
                            var124[var1] = var164;
                            float[] var125 = this.m;
                            float var165 = var125[var1];
                            float var166 = var165 * 0.9090909F;
                            var125[var1] = var166;
                            var24 -= 1949792404;
                            var24 &= -1987612300;
                            var24 ^= 1141896256;
                        }

                        int var126 = var1 + 1;
                        int var127 = var1 * var126;
                        int var128 = var127 & 1;
                        if (var128 != 0) {
                            break label131;
                        }

                        bA_2 var129 = bA_2.HOP;
                        int var167 = var6 + 1;
                        int var168 = var6 * var167;
                        int var191 = var6 + 2;
                        int var169 = var168 * var191;
                        var191 = var6 + 3;
                        int var170 = var169 * var191;
                        int var171 = var170 & 7;
                        if (var171 == 0) {
                            var24 += 1261500247;
                            var24 ^= 249368025;
                            var24 += 1312006055;
                            var24 ^= 365809310;
                            if (var2 == var129) {
                                var24 >>= 1;
                                var24 >>>= 23;
                                var24 ^= 1890014291;
                                break label139;
                            }

                            var24 *= -641570061;
                            var24 *= 1407243703;
                            var24 ^= -684960079;
                            float[] var130 = this.eu;
                            int var172 = var6 + 1;
                            int var173 = var6 * var172;
                            int var174 = var173 & 1;
                            if (var174 == 0) {
                                var24 = switch (var24) {
                                    case -1100065422 -> {
                                        var24 ^= 1873232461;
                                        var24 *= 488319587;
                                        yield var24 ^ 398391078;
                                    }
                                    default -> var24 ^ -1001845639;
                                    case 1208652182 -> var24 ^ 614471285;
                                };
                                float var131 = var130[var1];
                                float var132 = Math.abs(var131);
                                float var217;
                                int var133 = (var217 = var132 - 0.6F) == 0.0F ? 0 : (var217 < 0.0F ? -1 : 1);
                                if (var133 >= 0) {
                                    var24 ^= 2046201923;
                                    var24 |= 632142493;
                                    var24 ^= -1222525993;
                                    var24 >>= 21;
                                    var24 ^= 1890015208;
                                    break label139;
                                }

                                var24 += 1541278324;
                                var24 += 1270454856;
                                var24 ^= 358992547;
                                long var134 = var1;
                                long var193 = var134 + 1L;
                                long var194 = var134 * var193;
                                long var135 = var194 & 1L;
                                long var218;
                                int var136 = (var218 = var135 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                                if (var136 != 0) {
                                    break label131;
                                }

                                float[] var137 = this.eu;
                                var8 = var6;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var213 = var8 + 2L;
                                var10 *= var213;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var219;
                                var6 = (var219 = var8 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    var24 = switch (var24) {
                                        case -1305440034 -> var24 ^ -1247178244;
                                        default -> var24 ^ 487439320;
                                        case 1601864596 -> {
                                            var24 ^= 1516012617;
                                            var24 ^= -790251956;
                                            var24 ^= 1416254418;
                                            yield var24 ^ -1294376277;
                                        }
                                    };
                                    var137[var1] = 0.0F;
                                    var24 ^= -952396648;
                                    var24 *= -323128473;
                                    var24 -= -1993847689;
                                    var24 |= 553823875;
                                    var24 ^= -2125665483;
                                    break label139;
                                }

                                var24 *= -1066997799;
                                var24 -= -79214933;
                                var24 ^= -731266604;
                                var24 ^= 1849042303;
                                var24 ^= -196955618;
                            } else {
                                var24 -= -1961693451;
                                var24 ^= -1878852351;
                            }
                        } else {
                            switch (var24) {
                                case 121612506:
                                default:
                                    var24 ^= 1955579965;
                                    break;
                                case 1275782500:
                                    var24 += 1299058447;
                                    var24 &= -48035115;
                                    var24 += -10786390;
                                    var24 ^= 992146055;
                                    break;
                                case 1707035165:
                                    var24 ^= -1071898065;
                            }
                        }
                    }
                }

                Integer var101 = var1;
                if (var101 != null) {
                    IllegalArgumentException var103 = new IllegalArgumentException();
                    throw var103;
                }
                break label131;
            }

            Integer var105 = var1;
            if (var105 != null) {
                return;
            }
        }

        AssertionError var102 = new AssertionError();
        throw var102;
    }

    private static float G(bA_2 var0, int var1) {
        label120: {
            int var3 = System.identityHashCode(var0);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var116;
            int var89 = (var116 = var4 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
            if (var89 != 0) {
                switch (var1) {
                    case -1889050402:
                        int var72 = var1 | 589936683;
                        var72 *= -1355920345;
                        var72 -= -312155597;
                        var72 ^= 136325512;
                        break;
                    case -1098201939:
                    default:
                        int var71 = var1 ^ -1787704813;
                        break;
                    case -834645989:
                        int var70 = var1 ^ -780815288;
                }
            } else {
                label121: {
                    int var2 = var1 >> 31;
                    var2 >>= 17;
                    var2 -= 1114879414;
                    var2 ^= 1509755321;
                    Integer var90 = var2;
                    if (var90 == null) {
                        break label120;
                    }

                    bA_2 var91 = bA_2.HOP;
                    float var118;
                    if (var0 == var91) {
                        var2 = switch (var2) {
                            case -462339088 -> {
                                var2 >>= 9;
                                var2 += 1955687697;
                                yield var2 ^ 417884354;
                            }
                            case 1067594611 -> var2 ^ -554116937;
                            default -> var2 ^ -968096535;
                        };
                        Integer var93 = var2;
                        if (var93 == null) {
                            break label120;
                        }

                        var118 = 0.9F;
                        switch (var2) {
                            case 297489230:
                            default:
                                var2 ^= 976114906;
                                break;
                            case 596328154:
                                var2 ^= -538663510;
                                break;
                            case 1819004272:
                                var2 *= -701826391;
                                var2 ^= 1253223038;
                                var2 -= 98929941;
                                var2 ^= -1562221292;
                        }
                    } else {
                        var2 -= -1803944699;
                        var2 &= 979379308;
                        var2 ^= 650730427;
                        bA_2 var5 = bA_2.BOUNCE;
                        Integer var105 = var3;
                        if (var105 == null) {
                            switch (var2) {
                                case -1847976293:
                                default:
                                    var2 ^= -642671475;
                                    break label121;
                                case -1259098869:
                                    var2 ^= 2128202480;
                                    break label121;
                                case 749297619:
                                    var2 *= 1611133761;
                                    var2 ^= -889424707;
                                    break label121;
                            }
                        }

                        var2 ^= -618245126;
                        var2 >>= 24;
                        var2 &= -1074534732;
                        var2 ^= 1058475632;
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var117;
                        int var109 = (var117 = var6 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                        if (var109 != 0) {
                            break label120;
                        }

                        if (var0 != var5) {
                            var2 >>= 6;
                            var2 >>= 1;
                            var2 += -672886589;
                            var2 -= -79029401;
                            var2 ^= 1638021133;
                            int var94 = var2 + 1;
                            int var95 = var2 * var94;
                            int var110 = var2 + 2;
                            int var96 = var95 * var110;
                            int var111 = var2 + 3;
                            int var97 = var96 * var111;
                            int var98 = var97 & 7;
                            if (var98 != 0) {
                                break label120;
                            }

                            var5 = bA_2.GLIDE;
                            Integer var77 = var3;
                            if (var77 == null) {
                                var2 *= 1978565093;
                                var2 |= -2143348269;
                                var2 ^= -1950837027;
                                break label121;
                            }

                            var2 += 1820694018;
                            var2 ^= -1407246567;
                            var2 ^= -2041918998;
                            var2 ^= 1323770915;
                            var77 = var2;
                            if (var77 == null) {
                                break label120;
                            }

                            if (var0 != var5) {
                                var2 -= 1068600602;
                                var2 >>>= 15;
                                var2 |= -1813518086;
                                var2 += 365008668;
                                var2 ^= 155459424;
                                int var79 = var2 + 1;
                                var79 = var2 * var79;
                                var79 &= 1;
                                if (var79 != 0) {
                                    break label120;
                                }

                                float var92 = 0.5F;
                                switch (var2) {
                                    case -1595041157:
                                        var2 &= -527011911;
                                        var2 -= -1869251710;
                                        var2 ^= -205968166;
                                        return var92;
                                    case 599442539:
                                        var2 ^= 987890170;
                                        return var92;
                                    case 754819128:
                                    default:
                                        var2 ^= 287033744;
                                        return var92;
                                }
                            }

                            switch (var2) {
                                case -1234156884:
                                default:
                                    var2 ^= -1163405536;
                                    break;
                                case 1114730482:
                                    var2 -= 1068508656;
                                    var2 &= -606577943;
                                    var2 ^= -986768593;
                                    var2 ^= 16177186;
                                    var2 ^= 1819269083;
                                    break;
                                case 1998576968:
                                    var2 ^= -1641184324;
                            }
                        } else {
                            var2 -= -2086083981;
                            var2 &= 391530202;
                            var2 |= 217875463;
                            var2 ^= -1232414591;
                        }

                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        int var100 = var2 + 2;
                        var3 *= var100;
                        int var101 = var2 + 3;
                        var3 *= var101;
                        var3 &= 7;
                        if (var3 != 0) {
                            break label120;
                        }

                        var118 = 1.0F;
                        switch (var2) {
                            case -1418305834:
                                var2 >>>= 7;
                                var2 ^= -50245936;
                                break;
                            case -269702646:
                                var2 ^= -1801061482;
                                break;
                            case 48094655:
                            default:
                                var2 ^= -1835577030;
                        }
                    }

                    return var118;
                }
            }

            IllegalStateException var76 = new IllegalStateException();
            throw var76;
        }

        UnsupportedOperationException var69 = new UnsupportedOperationException();
        throw var69;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -533855622;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        uH = var4;
        SpriteShape[] var5 = SpriteShape.values();
        Q = var5;
        bA_2[] var6 = bA_2.values();
        v = var6;
    }
}
