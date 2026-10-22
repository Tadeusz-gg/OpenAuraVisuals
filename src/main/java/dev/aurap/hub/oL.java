package dev.aurap.hub;

import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.joml.Matrix4f;

public final class oL {
    private final S[] sg;
    private final GM HD;
    private final Matrix4f kQ;
    private final Matrix4f F;
    private final Matrix4f A;
    private Bf t;
    private int Fy;
    private static final float[][] aR;
    private static final float[][] W;
    private static final float[][] sY;
    private static final float[][] Q;
    private static final float[][] c;
    private static final float[][] VF;
    private static final float[][] n;
    private static final float[][] ze;
    private static final float[][][] SQ;
    private static final float[][][] X;
    private static final float[][][] R;
    private static final float[][][] dU;
    public static final int p;

    public oL() {
        S[] var1 = new S[4];
        S var2 = new S();
        var1[0] = var2;
        var2 = new S();
        var1[1] = var2;
        var2 = new S();
        var1[2] = var2;
        var2 = new S();
        var1[3] = var2;
        this.sg = var1;
        GM var3 = new GM();
        this.HD = var3;
        Matrix4f var4 = new Matrix4f();
        this.kQ = var4;
        Matrix4f var5 = new Matrix4f();
        this.F = var5;
        Matrix4f var6 = new Matrix4f();
        this.A = var6;
    }

    public void AO() {
        label49: {
            int var1 = p;
            var1 ^= -332824416;
            int var2 = System.identityHashCode(this);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            int var4 = of_2.l;
            var1 ^= var4;
            var1 ^= 1720137465;
            of_2.l = 1720137465;
            var4 = of_2.fP;
            var1 ^= var4;
            var1 ^= 2048140945;
            of_2.fP = 2048140945;
            if (var3 != 0) {
                var1 += 1152869662;
                var1 -= -1783791323;
                var1 |= -1151011684;
                var1 >>>= 26;
                var1 ^= -1493462020;
            } else {
                var1 = switch (var1) {
                    case -1803590457 -> {
                        var1 ^= -85044343;
                        var1 |= -1190123926;
                        var1 >>= 5;
                        yield var1 ^ -1298770814;
                    }
                    default -> var1 ^ 964944582;
                    case 2115627274 -> var1 ^ -1896121795;
                };
                Integer var48 = var1;
                if (var48 == null) {
                    break label49;
                }

                Bf var49 = this.t;
                if (var49 != null) {
                    var1 -= -698061275;
                    var1 &= -72335123;
                    var1 |= 1732612758;
                    var1 ^= -675592481;
                    return;
                }

                var1 -= 1587680936;
                var1 *= 1364912469;
                var1 += -963797057;
                var1 ^= -1954708298;
                Bf var50 = new Bf();
                var4 = var2 + 1;
                var4 = var2 * var4;
                int var5 = var2 + 2;
                var4 *= var5;
                var2 += 3;
                var4 *= var2;
                var2 = var4 & 7;
                if (var2 == 0) {
                    var1 = switch (var1) {
                        case -258604462 -> {
                            var1 -= 1957650160;
                            var1 ^= -97551646;
                            yield var1 ^ 440645691;
                        }
                        default -> var1 ^ 1998434558;
                        case 906100391 -> var1 ^ -747184319;
                    };
                    long var56 = var1;
                    long var6 = var56 + 1L;
                    var6 = var56 * var6;
                    long var8 = var56 + 2L;
                    var6 *= var8;
                    long var57 = var56 + 3L;
                    var6 *= var57;
                    long var58 = var6 & 7L;
                    long var62;
                    var2 = (var62 = var58 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
                    if (var2 != 0) {
                        break label49;
                    }

                    this.t = var50;
                    var1 -= 698204050;
                    var1 ^= -787335584;
                    return;
                }

                switch (var1) {
                    case -258604462:
                        var1 -= -34959394;
                        var1 ^= 1414586806;
                        break;
                    case 193828236:
                    default:
                        var1 ^= -965513517;
                        break;
                    case 1086821818:
                        var1 ^= 579831751;
                }
            }

            AssertionError var44 = new AssertionError();
            throw var44;
        }

        UnsupportedOperationException var41 = new UnsupportedOperationException();
        throw var41;
    }

    public boolean SZ(LivingEntity var1, float var2) {
        int var3 = p;
        var3 ^= 2048402744;
        int var4 = System.identityHashCode(this);
        int var5 = (var1 instanceof AbstractClientPlayerEntity) ? 1 : 0;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        int var7 = var4 + 2;
        var6 *= var7;
        var7 = var4 + 3;
        var6 *= var7;
        var6 &= 7;
        if (var6 != 0) {
            switch (var3) {
                case -1531178984:
                    var3 ^= -836383357;
                    break;
                case 38715743:
                    var3 &= 393347280;
                    var3 |= 1589471620;
                    var3 -= -1517459512;
                    var3 |= -738970339;
                    var3 ^= 1237581028;
                    break;
                case 862934785:
                default:
                    var3 ^= 1460993009;
            }
        } else {
            label94: {
                var3 = switch (var3) {
                    case 38715743 -> {
                        var3 -= 359207907;
                        yield var3 ^ -1454734769;
                    }
                    default -> var3 ^ -1680248098;
                    case 873825636 -> var3 ^ -1404026289;
                };
                long var82 = var3;
                long var8 = var82 + 1L;
                var8 = var82 * var8;
                long var10 = var82 + 2L;
                var8 *= var10;
                long var83 = var82 + 3L;
                var8 *= var83;
                long var84 = var8 & 7L;
                long var138;
                var6 = (var138 = var84 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                if (var6 == 0) {
                    if (var5 == 0) {
                        var3 *= 1237533339;
                        var3 ^= 2041595013;
                        long var72 = var3;
                        long var108 = var72 + 1L;
                        long var109 = var72 * var108;
                        long var9 = var72 + 2L;
                        long var110 = var109 * var9;
                        long var73 = var72 + 3L;
                        long var111 = var110 * var73;
                        long var74 = var111 & 7L;
                        long var139;
                        var5 = (var139 = var74 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            return false;
                        }
                    } else {
                        label85: {
                            var3 += -188810553;
                            var3 ^= -1647048348;
                            var3 *= 1086510965;
                            var3 ^= -1322650478;
                            this.AO();
                            S[] var76 = this.sg;
                            var6 = this.Fy;
                            S var77 = var76[var6];
                            var6 = this.Fy;
                            var6++;
                            S[] var112 = this.sg;
                            var7 = var112.length;
                            var6 %= var7;
                            this.Fy = var6;
                            var77.o = var1;
                            double var90 = var1.getX();
                            var77.a = var90;
                            Integer var91 = var4;
                            if (var91 == null) {
                                var3 *= 1438706975;
                                var3 += -297579813;
                                var3 &= 1145722581;
                                var3 *= 1803161055;
                                var3 ^= 2143962418;
                                break label94;
                            }

                            var3 -= 1522127368;
                            var3 >>>= 21;
                            var3 -= -1683649745;
                            var3 &= -11737033;
                            var3 ^= -755799103;
                            double var92 = var1.getY();
                            var77.L = var92;
                            double var93 = var1.getZ();
                            var77.C = var93;
                            Entity var94 = i_2.QI();
                            float var117;
                            if (var94 == null) {
                                var3 = switch (var3) {
                                    default -> var3 ^ -1304641202;
                                    case -1229255694 -> {
                                        var3 += -1825150990;
                                        var3 <<= 16;
                                        var3 -= 121863068;
                                        var3 |= 1892646836;
                                        yield var3 ^ -926156434;
                                    }
                                    case 817460564 -> var3 ^ 1709886083;
                                };
                                var7 = var3 + 1;
                                var7 = var3 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    break label85;
                                }

                                var117 = 0.0F;
                                var3 -= 904988623;
                                var3 -= 1770914428;
                                var3 |= -716136601;
                                var3 ^= 454850847;
                                var3 ^= -88553149;
                            } else {
                                var3 >>>= 3;
                                var3 &= 2621734;
                                var3 ^= -1768920474;
                                Integer var122 = var3;
                                if (var122 == null) {
                                    break label85;
                                }

                                double var123 = var1.getX();
                                double var126 = var94.getX();
                                double var124 = var123 - var126;
                                double var127 = var1.getZ();
                                double var12 = var94.getZ();
                                double var128 = var127 - var12;
                                double var125 = Math.atan2(var124, var128);
                                var10 = var4;
                                long var134 = var10 + 1L;
                                long var135 = var10 * var134;
                                long var14 = var10 + 2L;
                                long var136 = var135 * var14;
                                var10 += 3L;
                                long var137 = var136 * var10;
                                var10 = var137 & 7L;
                                long var140;
                                int var95 = (var140 = var10 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                                if (var95 != 0) {
                                    var3 >>= 18;
                                    var3 += 457173472;
                                    var3 ^= -1458961283;
                                    break label94;
                                }

                                var3 += -1126195187;
                                var3 &= -1889831127;
                                var3 ^= -1965660650;
                                var95 = var3 + 1;
                                var95 = var3 * var95;
                                int var132 = var3 + 2;
                                var95 *= var132;
                                int var133 = var3 + 3;
                                var95 *= var133;
                                var95 &= 7;
                                if (var95 != 0) {
                                    break label85;
                                }

                                float var101 = (float)var125;
                                var117 = var101;
                                var3 += -1967900373;
                                var3 ^= 543871353;
                            }

                            var91 = var3;
                            if (var91 != null) {
                                var77.FU = var117;
                                int var103 = var4 + 1;
                                var103 = var4 * var103;
                                var7 = var4 + 2;
                                var103 *= var7;
                                var4 += 3;
                                var103 *= var4;
                                var4 = var103 & 7;
                                if (var4 == 0) {
                                    var3 ^= -315466253;
                                    var3 += -2095141373;
                                    var3 *= -1197766289;
                                    var3 ^= 1752129908;
                                    var77.Os = 0.0F;
                                    var77.H = var2;
                                    return true;
                                }

                                var3 >>>= 8;
                                var3 ^= -1308517450;
                                break label94;
                            }
                        }
                    }
                }

                IllegalStateException var71 = new IllegalStateException();
                throw var71;
            }
        }

        IllegalArgumentException var68 = new IllegalArgumentException();
        throw var68;
    }

    public void U() {
        label62: {
            int var1 = p;
            var1 ^= -933288269;
            int var2 = System.identityHashCode(this);
            S[] var3 = this.sg;
            S[] var37 = var3;
            int var4 = var3.length;
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var65;
            int var40 = (var65 = var5 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
            if (var40 != 0) {
                var1 += -1302769125;
                var1 >>>= 23;
                var1 -= -1492653593;
                var1 ^= -413838691;
            } else {
                label67: {
                    var1 = switch (var1) {
                        case -1341537580 -> {
                            var1 -= 640833058;
                            yield var1 ^ 453983489;
                        }
                        case -666912970 -> var1 ^ 1128194031;
                        default -> var1 ^ -826062821;
                    };
                    Integer var41 = var1;
                    if (var41 == null) {
                        break label62;
                    }

                    var4 = var4;
                    byte var42 = 0;
                    int var43 = var42;
                    var1 &= 2075882256;
                    var1 ^= -615005270;
                    var1 ^= 1411375809;

                    while (var43 < var4) {
                        var1 = switch (var1) {
                            case -1647284101 -> {
                                var1 <<= 28;
                                yield var1 ^ -849606278;
                            }
                            default -> var1 ^ 2142891696;
                            case 450588055 -> var1 ^ -1286391932;
                        };
                        S var6 = var37[var43];
                        var6.o = null;
                        int var44 = var43 + 1;
                        var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var66;
                        int var49 = (var66 = var7 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                        if (var49 != 0) {
                            var1 &= 2011125272;
                            var1 |= -32809392;
                            var1 -= 776957493;
                            var1 ^= 1856156771;
                            break label67;
                        }

                        var1 &= -1264738341;
                        var1 >>>= 28;
                        var1 ^= 1323328667;
                        var7 = var1;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var67;
                        int var52 = (var67 = var7 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                        if (var52 != 0) {
                            break label62;
                        }

                        var43 = var44;
                        var1 |= 1358465323;
                        var1 &= -873947873;
                        var1 ^= -684130976;
                    }

                    var1 |= -213743356;
                    var1 ^= 621442341;
                    Integer var32 = var1;
                    if (var32 != null) {
                        this.Fy = 0;
                        return;
                    }
                    break label62;
                }
            }

            int var53 = var1 + 1;
            int var54 = var1 * var53;
            int var8 = var1 + 2;
            int var55 = var54 * var8;
            var8 = var1 + 3;
            int var56 = var55 * var8;
            int var57 = var56 & 7;
            if (var57 == 0) {
                IllegalArgumentException var58 = new IllegalArgumentException();
                throw var58;
            }
        }

        AssertionError var36 = new AssertionError();
        throw var36;
    }

    public int uq() {
        label114: {
            int var1 = p;
            var1 ^= 293690108;
            int var2 = System.identityHashCode(this);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                var1 = switch (var1) {
                    case -1693044414 -> var1 ^ -140143355;
                    default -> var1 ^ 1783139206;
                    case 1775746715 -> {
                        var1 &= -1974477337;
                        var1 ^= -277208833;
                        var1 |= 313751951;
                        var1 |= -2074241510;
                        yield var1 ^ 1393408285;
                    }
                };
                var3 = var1 + 1;
                var3 = var1 * var3;
                var4 = var1 + 2;
                var3 *= var4;
                var4 = var1 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 != 0) {
                    break label114;
                }

                int var90 = 0;
                S[] var99 = this.sg;
                S[] var100 = var99;
                int var5 = var99.length;
                var5 = var5;
                int var6 = 0;
                var90 = var90;
                var6 = var6;

                var1 = switch (var1) {
                    case -1527626014 -> {
                        var1 -= -647388403;
                        var1 ^= -874860041;
                        var1 &= 1581883096;
                        var1 |= -733856988;
                        yield var1 ^ -1958873075;
                    }
                    default -> var1 ^ -900335926;
                    case 658717096 -> var1 ^ 1769929829;
                };

                label111:
                while (true) {
                    Integer var7 = var1;
                    if (var7 == null) {
                        break label114;
                    }

                    if (var6 >= var5) {
                        var1 ^= -1381370877;
                        var1 |= 1605338566;
                        var1 *= 1925669215;
                        var1 &= 406831359;
                        var1 ^= 1383768239;
                        return var90;
                    }

                    var1 <<= 24;
                    var1 *= 56997249;
                    var1 >>= 17;
                    var1 ^= 1350052894;
                    long var104 = var1;
                    long var9 = var104 + 1L;
                    var9 = var104 * var9;
                    long var11 = var104 + 2L;
                    var9 *= var11;
                    long var105 = var104 + 3L;
                    var9 *= var105;
                    long var106 = var9 & 7L;
                    long var140;
                    int var107 = (var140 = var106 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                    if (var107 != 0) {
                        break label114;
                    }

                    S var108 = var100[var6];
                    LivingEntity var109 = var108.o;
                    int var8 = var2 + 1;
                    var8 = var2 * var8;
                    int var134 = var2 + 2;
                    var8 *= var134;
                    int var135 = var2 + 3;
                    var8 *= var135;
                    var8 &= 7;
                    if (var8 != 0) {
                        var1 += -1481911341;
                        var1 += -1692190767;
                        var1 ^= 362726856;
                        var1 &= -2113156778;
                        var1 ^= 1333086493;
                        break;
                    }

                    var1 |= -1879336151;
                    var1 -= 1389816390;
                    var1 ^= -1928651771;
                    var8 = var1 + 1;
                    var8 = var1 * var8;
                    int var136 = var1 + 2;
                    var8 *= var136;
                    int var137 = var1 + 3;
                    var8 *= var137;
                    var8 &= 7;
                    if (var8 != 0) {
                        break label114;
                    }

                    if (var109 != null) {
                        var1 = switch (var1) {
                            case -803074692 -> {
                                var1 >>= 9;
                                var1 ^= 814049676;
                                yield var1 ^ 796014698;
                            }
                            default -> var1 ^ -148443247;
                            case 415615184 -> var1 ^ 412756533;
                        };
                        Integer var110 = var1;
                        if (var110 == null) {
                            break label114;
                        }

                        int var111 = var90 + 1;
                        var8 = var2 + 1;
                        var8 = var2 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            switch (var1) {
                                case -1589729923:
                                    var1 ^= 857938063;
                                    break label111;
                                case -534822688:
                                    var1 &= 1336410019;
                                    var1 &= -2019041060;
                                    var1 ^= -847525729;
                                    break label111;
                                case 1148122189:
                                default:
                                    var1 ^= 1520795206;
                                    break label111;
                            }
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -1313786014;
                            case -534822688 -> {
                                var1 |= 1863218927;
                                var1 ^= -1041246918;
                                var1 -= 1134767613;
                                var1 &= -1365803860;
                                yield var1 ^ 952751049;
                            }
                            case 1491356084 -> var1 ^ 1411745208;
                        };
                        Integer var125 = var1;
                        if (var125 == null) {
                            break label114;
                        }

                        var107 = var111;
                        var1 += 329369111;
                        var1 ^= 653744451;
                        var1 |= -7069982;
                        var1 ^= -649632237;
                    } else {
                        var1 += 1475632252;
                        var1 += -1545814428;
                        var1 |= -2028450971;
                        var1 ^= -960518593;
                        Integer var126 = var1;
                        if (var126 == null) {
                            break label114;
                        }

                        var107 = var90;
                        var1 *= 1773433353;
                        var1 *= -307372949;
                        var1 *= -1604360131;
                        var1 ^= -1759031482;
                    }

                    long var127 = var1;
                    long var10 = var127 + 1L;
                    var10 = var127 * var10;
                    long var128 = var10 & 1L;
                    long var141;
                    var8 = (var141 = var128 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        break label114;
                    }

                    var8 = var6 + 1;
                    Integer var138 = var2;
                    if (var138 == null) {
                        var1 |= 199392020;
                        var1 |= 801796939;
                        var1 ^= 1648860572;
                        var1 ^= -2134806916;
                        break;
                    }

                    var1 *= 321350827;
                    var1 *= 1380577117;
                    var1 ^= -1025269462;
                    var90 = var107;
                    var6 = var8;
                    switch (var1) {
                        case -339772110:
                            var1 &= 1658428697;
                            var1 >>= 7;
                            var1 ^= -1006351125;
                            var1 ^= -1681998344;
                            break;
                        case 952081913:
                        default:
                            var1 ^= -1587222978;
                            break;
                        case 1179677127:
                            var1 ^= 58929801;
                    }
                }
            } else {
                var1 *= -1385671799;
                var1 -= 1486399980;
                var1 -= 1915439957;
                var1 -= 468497528;
                var1 ^= 334762021;
            }

            long var75 = var1;
            long var92 = var75 + 1L;
            long var93 = var75 * var92;
            long var102 = var75 + 2L;
            long var94 = var93 * var102;
            long var76 = var75 + 3L;
            long var95 = var94 * var76;
            long var77 = var95 & 7L;
            long var142;
            var1 = (var142 = var77 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var80 = new AssertionError();
                throw var80;
            }
        }

        IllegalStateException var79 = new IllegalStateException();
        throw var79;
    }

    public void mZ(float var1, boolean var2, float var3) {
        label237: {
            int var4 = p;
            var4 ^= 1432452357;
            int var5 = System.identityHashCode(this);
            S[] var6 = this.sg;
            var6 = var6;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var268;
            int var153 = (var268 = var7 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
            if (var153 != 0) {
                switch (var4) {
                    case -6811314:
                    default:
                        var4 ^= -131090256;
                        break;
                    case 758618466:
                        var4 *= -718675959;
                        var4 ^= -215156559;
                        var4 ^= -2088829196;
                        break;
                    case 1895748890:
                        var4 ^= -1729985413;
                }
            } else {
                var4 += 958067061;
                var4 += 1882611309;
                var4 *= -1687004347;
                var4 *= 559817463;
                var4 ^= 941609711;
                var7 = var4;
                var9 = var7 + 1L;
                var9 = var7 * var9;
                var11 = var7 + 2L;
                var9 *= var11;
                var7 += 3L;
                var9 *= var7;
                var7 = var9 & 7L;
                long var269;
                int var157 = (var269 = var7 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                if (var157 != 0) {
                    break label237;
                }

                int var158 = var6.length;
                int var159 = var158;
                int var8 = 0;
                var8 = var8;

                var4 = switch (var4) {
                    case -1989819165 -> {
                        var4 >>>= 14;
                        var4 ^= -1310175870;
                        var4 *= -978311631;
                        var4 &= 880978004;
                        yield var4 ^ 1261139264;
                    }
                    case 1282977720 -> var4 ^ 583131385;
                    default -> var4 ^ 311810589;
                };

                label223:
                while (true) {
                    int var169 = var4 + 1;
                    int var170 = var4 * var169;
                    int var10 = var4 + 2;
                    int var171 = var170 * var10;
                    var10 = var4 + 3;
                    int var172 = var171 * var10;
                    int var173 = var172 & 7;
                    if (var173 != 0) {
                        break label237;
                    }

                    if (var8 >= var159) {
                        var4 &= 1618738264;
                        var4 <<= 15;
                        var4 ^= 227160332;
                        var5 = var4 + 1;
                        var5 = var4 * var5;
                        var5 &= 1;
                        if (var5 == 0) {
                            return;
                        }
                        break label237;
                    }

                    var4 |= 1831456129;
                    var4 |= -1494195087;
                    var4 ^= -466417949;
                    Integer var174 = var4;
                    if (var174 == null) {
                        break label237;
                    }

                    S var175 = var6[var8];
                    Integer var183 = var5;
                    if (var183 == null) {
                        switch (var4) {
                            case -252682:
                                var4 ^= 1772373819;
                                break label223;
                            case 466156310:
                                var4 += 1753305582;
                                var4 ^= 672829047;
                                var4 &= -1770525393;
                                var4 ^= -1545673964;
                                break label223;
                            case 1548247687:
                            default:
                                var4 ^= -1932936822;
                                break label223;
                        }
                    }

                    var4 &= 724462520;
                    var4 &= 760740860;
                    var4 ^= 592264777;
                    var183 = var4;
                    if (var183 == null) {
                        break label237;
                    }

                    LivingEntity var185 = var175.o;
                    if (var185 == null) {
                        var4 |= 119536134;
                        var4 <<= 11;
                        var4 *= -190981199;
                        var4 ^= 1445398111;
                        long var205 = var4;
                        long var256 = var205 + 1L;
                        var256 = var205 * var256;
                        long var206 = var256 & 1L;
                        long var270;
                        int var207 = (var270 = var206 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                        if (var207 != 0) {
                            break label237;
                        }

                        var4 ^= -1961482282;
                        var4 += 2142349426;
                        var4 += -987067296;
                        var4 -= 227428593;
                        var4 ^= 1863607232;
                    } else {
                        label236: {
                            var4 |= -1775227907;
                            var4 |= -705631480;
                            var4 ^= -2118170353;
                            LivingEntity var186 = var175.o;
                            World var187 = var186.getEntityWorld();
                            var11 = var5;
                            long var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var271;
                            int var216 = (var271 = var11 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                            if (var216 != 0) {
                                var4 &= -519120011;
                                var4 ^= 1200402503;
                                break;
                            }

                            var4 >>>= 23;
                            var4 ^= 1898959976;
                            var4 ^= 553318649;
                            Object var217 = i_2.U();
                            if (var187 == var217) {
                                var4 -= -1637728805;
                                var4 ^= 863819360;
                                long var188 = var4;
                                long var12 = var188 + 1L;
                                var12 = var188 * var12;
                                long var14 = var188 + 2L;
                                var12 *= var14;
                                long var189 = var188 + 3L;
                                var12 *= var189;
                                long var190 = var12 & 7L;
                                long var272;
                                int var191 = (var272 = var190 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                                if (var191 != 0) {
                                    break label237;
                                }

                                int var192 = (i_2.BD()) ? 1 : 0;
                                Integer var218 = var5;
                                if (var218 == null) {
                                    var4 *= 638042101;
                                    var4 &= 1663316058;
                                    var4 |= -757026385;
                                    var4 ^= -714435704;
                                    break;
                                }

                                var4 -= -488077452;
                                var4 ^= -477265819;
                                var11 = var4;
                                var13 = var11 + 1L;
                                var13 = var11 * var13;
                                var11 = var13 & 1L;
                                long var273;
                                int var221 = (var273 = var11 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                                if (var221 != 0) {
                                    break label237;
                                }

                                if (var192 != 0) {
                                    var4 = switch (var4) {
                                        case 241197745 -> var4 ^ 513181167;
                                        case 2124951835 -> {
                                            var4 &= 764429923;
                                            yield var4 ^ -1211962276;
                                        }
                                        default -> var4 ^ 707730415;
                                    };
                                    var192 = var4 + 1;
                                    var192 = var4 * var192;
                                    int var222 = var4 + 2;
                                    var192 *= var222;
                                    int var223 = var4 + 3;
                                    var192 *= var223;
                                    var192 &= 7;
                                    if (var192 != 0) {
                                        break label237;
                                    }

                                    float var198 = var175.Os;
                                    int var224 = var5 + 1;
                                    int var225 = var5 * var224;
                                    int var226 = var225 & 1;
                                    if (var226 != 0) {
                                        var4 *= -441677509;
                                        var4 += 260371046;
                                        var4 &= -1377004708;
                                        var4 ^= 113910143;
                                        break;
                                    }

                                    var4 += 79936124;
                                    var4 -= -237869387;
                                    var4 >>>= 23;
                                    var4 ^= -1897579915;
                                    int var227 = var4 + 1;
                                    int var228 = var4 * var227;
                                    int var229 = var228 & 1;
                                    if (var229 != 0) {
                                        break label237;
                                    }

                                    float var230 = var175.Os;
                                    float var250 = Math.min(var1, 0.1F);
                                    float var251 = Math.max(0.0F, var250);
                                    float var252 = var251 * 3.2F;
                                    float var263 = var175.H;
                                    float var253 = var252 / var263;
                                    float var231 = var230 + var253;
                                    var175.Os = var231;
                                    if (var2) {
                                        var4 += 1129204619;
                                        var4 += -547021260;
                                        var4 ^= 739237042;
                                        int var232 = var4 + 1;
                                        int var233 = var4 * var232;
                                        int var234 = var233 & 1;
                                        if (var234 != 0) {
                                            break label237;
                                        }

                                        float var235 = var175.Os;
                                        boolean var199 = df.L(var198, var235);
                                        Integer var236 = var5;
                                        if (var236 == null) {
                                            var4 ^= -164796949;
                                            var4 += -830860572;
                                            var4 ^= 498733730;
                                            break;
                                        }

                                        var4 *= 978473685;
                                        var4 += 559556162;
                                        var4 &= 1000203541;
                                        var4 -= -1784529816;
                                        var4 ^= -2094597121;
                                        Integer var237 = var4;
                                        if (var237 == null) {
                                            break label237;
                                        }

                                        if (var199) {
                                            var4 ^= -351401738;
                                            var4 |= -567106036;
                                            var4 ^= -164701214;
                                            double var200 = var175.a;
                                            double var254 = var175.L;
                                            var254++;
                                            double var266 = var175.C;
                                            HP var201 = HP.G(var200, var254, var266);
                                            i_2.zf("minecraft:block.note_block.basedrum", var3, 0.65F, var201);
                                            float var202 = var3 * 0.65F;
                                            int var238 = var5 + 1;
                                            int var239 = var5 * var238;
                                            int var240 = var239 & 1;
                                            if (var240 != 0) {
                                                switch (var4) {
                                                    case -43365725:
                                                    default:
                                                        var4 ^= -958931254;
                                                        break label223;
                                                    case 165241983:
                                                        var4 &= 2096921591;
                                                        var4 |= 239101457;
                                                        var4 |= 1250182367;
                                                        var4 ^= 1766999240;
                                                        break label223;
                                                    case 1512511930:
                                                        var4 ^= 1666288918;
                                                        break label223;
                                                }
                                            }

                                            var4 ^= -1461698195;
                                            var4 ^= -988517035;
                                            double var241 = var175.a;
                                            double var264 = var175.L;
                                            var264++;
                                            double var267 = var175.C;
                                            HP var242 = HP.G(var241, var264, var267);
                                            i_2.zf("minecraft:entity.player.attack.knockback", var202, 0.8F, var242);
                                            switch (var4) {
                                                case -1155885266:
                                                default:
                                                    var4 ^= -1745935413;
                                                    break;
                                                case 1044770480:
                                                    var4 ^= -277304927;
                                                    break;
                                                case 1680689223:
                                                    var4 += -1186029120;
                                                    var4 |= 213137997;
                                                    var4 ^= -4029238;
                                            }
                                        } else {
                                            var4 >>>= 26;
                                            var4 &= 509452787;
                                            var4 ^= -499286393;
                                        }
                                    } else {
                                        var4 -= -34025334;
                                        var4 <<= 10;
                                        var4 -= -207915070;
                                        var4 += 958015214;
                                        var4 ^= 353654185;
                                    }

                                    float var203 = var175.Os;
                                    int var243 = var5 + 1;
                                    int var244 = var5 * var243;
                                    int var245 = var244 & 1;
                                    if (var245 != 0) {
                                        var4 -= 859528766;
                                        var4 ^= -11285447;
                                        var4 ^= 2011156041;
                                        break;
                                    }

                                    var4 |= -1892976208;
                                    var4 ^= -1283359278;
                                    var4 -= -399625322;
                                    var4 &= 726211621;
                                    var4 ^= -1261051805;
                                    Integer var246 = var4;
                                    if (var246 == null) {
                                        break label237;
                                    }

                                    float var274;
                                    var192 = (var274 = var203 - 3.2F) == 0.0F ? 0 : (var274 < 0.0F ? -1 : 1);
                                    if (var192 >= 0) {
                                        var4 = switch (var4) {
                                            case -1797460894 -> {
                                                var4 >>>= 12;
                                                var4 |= -2100460943;
                                                var4 |= -18714172;
                                                var4 -= 839529464;
                                                yield var4 ^ 824477560;
                                            }
                                            case 70898417 -> var4 ^ 604378153;
                                            default -> var4 ^ -1958884900;
                                        };
                                        var175.o = null;
                                        var4 |= 1538414023;
                                        var4 >>>= 28;
                                        var4 >>>= 29;
                                        var4 |= 1956201937;
                                        var4 ^= 1231512443;
                                    } else {
                                        switch (var4) {
                                            case -2133388507:
                                            default:
                                                var4 ^= -1482843001;
                                                break label236;
                                            case -1797460894:
                                                var4 -= 1199453918;
                                                var4 += -1789027181;
                                                var4 ^= -801998084;
                                                var4 ^= 259001921;
                                                break label236;
                                            case 957063940:
                                                var4 ^= -1955597171;
                                        }
                                    }
                                    break label236;
                                }

                                switch (var4) {
                                    case -613020686:
                                    default:
                                        var4 ^= -1882885325;
                                        break;
                                    case -536151999:
                                        var4 ^= -1931999621;
                                        break;
                                    case 2124951835:
                                        var4 ^= 2011250714;
                                        var4 ^= -1892990927;
                                        var4 ^= -1061659990;
                                }
                            } else {
                                var4 -= -2006549839;
                                var4 -= -534169692;
                                var4 ^= -1348529790;
                            }

                            var175.o = null;
                            switch (var4) {
                                case 875052247:
                                default:
                                    var4 ^= -648731722;
                                    break;
                                case 1188719514:
                                    var4 ^= 392523640;
                                    var4 ^= 1816207944;
                                    break;
                                case 1193697868:
                                    var4 ^= 1871139415;
                            }
                        }
                    }

                    int var176 = var4 + 1;
                    int var177 = var4 * var176;
                    int var208 = var4 + 2;
                    int var178 = var177 * var208;
                    var208 = var4 + 3;
                    int var179 = var178 * var208;
                    int var180 = var179 & 7;
                    if (var180 != 0) {
                        break label237;
                    }

                    int var181 = var8 + 1;
                    Integer var210 = var5;
                    if (var210 == null) {
                        var4 -= 1466332105;
                        var4 *= 231095269;
                        var4 ^= -474905323;
                        var4 ^= 1068593296;
                        var4 ^= -109311497;
                        break;
                    }

                    var4 -= -1549936946;
                    var4 += 12737097;
                    var4 ^= -1835064753;
                    var210 = var4;
                    if (var210 == null) {
                        break label237;
                    }

                    var8 = var181;
                    var4 |= -265076640;
                    var4 += -779423311;
                    var4 |= 677335669;
                    var4 ^= -1326151877;
                }
            }

            long var137 = var4;
            long var147 = var137 + 1L;
            long var148 = var137 * var147;
            long var161 = var137 + 2L;
            long var149 = var148 * var161;
            long var138 = var137 + 3L;
            long var150 = var149 * var138;
            long var139 = var150 & 7L;
            long var275;
            var4 = (var275 = var139 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
            if (var4 == 0) {
                RuntimeException var142 = new RuntimeException();
                throw var142;
            }
        }

        AssertionError var141 = new AssertionError();
        throw var141;
    }

    public void gP(Canvas var1, WorldDraw var2) {
        label181: {
            int var3 = p;
            var3 ^= 1085795873;
            int var4 = System.identityHashCode(this);
            S[] var5 = this.sg;
            S[] var120 = var5;
            int var6 = var5.length;
            var6 = var6;
            long var7 = var4;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var262;
            int var129 = (var262 = var7 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
            if (var129 != 0) {
                var3 >>= 26;
                var3 ^= -1102620735;
            } else {
                var3 = switch (var3) {
                    case -960588966 -> var3 ^ -2047668466;
                    case 954272326 -> {
                        var3 >>= 22;
                        yield var3 ^ -725895298;
                    }
                    default -> var3 ^ -1202242622;
                };
                byte var130 = 0;
                int var131 = var130;

                var3 = switch (var3) {
                    case -725895267 -> {
                        var3 *= 382316187;
                        var3 *= -676572971;
                        var3 += 629497045;
                        yield var3 ^ -2084200170;
                    }
                    case 1727393308 -> var3 ^ 956262525;
                    default -> var3 ^ 1008270292;
                };

                label178:
                while (true) {
                    if (var131 >= var6) {
                        var3 = switch (var3) {
                            case -1486108655 -> var3 ^ 1960551342;
                            case -836599226 -> {
                                var3 &= -140136170;
                                var3 >>>= 14;
                                yield var3 ^ -545645744;
                            }
                            default -> var3 ^ -1974857740;
                        };
                        var4 = var3 + 1;
                        var4 = var3 * var4;
                        int var121 = var3 + 2;
                        var4 *= var121;
                        var3 += 3;
                        var4 *= var3;
                        var3 = var4 & 7;
                        if (var3 == 0) {
                            return;
                        }
                        break label181;
                    }

                    var3 ^= 985185257;
                    var3 += 1178757672;
                    var3 |= -1866850791;
                    var3 ^= -1422447788;
                    Integer var8 = var3;
                    if (var8 == null) {
                        break label181;
                    }

                    S var132 = var120[var131];
                    int var148 = var4 + 1;
                    int var149 = var4 * var148;
                    int var10 = var4 + 2;
                    int var150 = var149 * var10;
                    var10 = var4 + 3;
                    int var151 = var150 * var10;
                    int var152 = var151 & 7;
                    if (var152 != 0) {
                        var3 >>= 16;
                        var3 -= 1215317944;
                        var3 ^= 164142558;
                        break;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ -2012129378;
                        case -368787596 -> var3 ^ -674055900;
                        case 298423435 -> {
                            var3 -= 1480938724;
                            var3 *= -1033913225;
                            var3 += 902478066;
                            var3 += 975547419;
                            yield var3 ^ 1133040970;
                        }
                    };
                    LivingEntity var153 = var132.o;
                    if (var153 == null) {
                        var3 = switch (var3) {
                            case -1146533148 -> {
                                var3 -= -825292799;
                                var3 &= 1683894324;
                                yield var3 ^ 670740885;
                            }
                            case -803164326 -> var3 ^ -746035276;
                            default -> var3 ^ -218550380;
                        };
                        var9 = var3;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var263;
                        int var156 = (var263 = var9 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                        if (var156 != 0) {
                            break label181;
                        }

                        var3 *= 54624687;
                        var3 &= 492531096;
                        var3 ^= -761491388;
                    } else {
                        var3 |= -305802972;
                        var3 ^= -1933588154;
                        var3 |= 1507291182;
                        var3 ^= 13417177;
                        Integer var157 = var3;
                        if (var157 == null) {
                            break label181;
                        }

                        float var158 = var132.Os;
                        GM var172 = this.HD;
                        double var189 = var132.a;
                        double var13 = var132.L;
                        double var15 = var132.C;
                        var172.oi(var2, var189, var13, var15);
                        Matrix4f var173 = this.kQ;
                        Matrix4f var174 = var173.identity();
                        float var190 = var132.FU;
                        Matrix4f var175 = var174.rotateY(var190);
                        float var176 = df.xM(var158, 0.0F, 0.45F);
                        float var177 = df.B(var176);
                        float var178 = 1.0F - var177;
                        Matrix4f var191 = this.F;
                        Matrix4f var12 = this.kQ;
                        Matrix4f var192 = var191.set(var12);
                        float var203 = var178 * 0.55F;
                        float var204 = -1.05F - var203;
                        Matrix4f var193 = var192.translate(var204, 0.0F, 0.375F);
                        Matrix4f var194 = var193.rotateY((float) (-Math.PI / 2));
                        Matrix4f var195 = var194.scale(0.0625F);
                        Bf var196 = this.t;
                        GM var205 = this.HD;
                        Matrix4f var221 = this.F;
                        int var14 = i_2.P();
                        float var245 = df.XH(var158);
                        var15 = var245;
                        var15 = Math.toRadians(var15);
                        float var248 = (float)var15;
                        float var16 = var158 * 18.0F;
                        double var258 = var16;
                        double var259 = Math.sin(var258);
                        var16 = (float)var259;
                        float var179 = var16 * var178;
                        float var180 = var179 * 0.4F;
                        var16 = df.Z(var158);
                        var196.GN(var205, var221, var14, var248, var180, var16);
                        LivingEntity var181 = var132.o;
                        var10 = i_2.jA(var181);
                        float var197 = df.xM(var158, 1.35F, 1.15F);
                        float var206 = df.xM(var158, 0.12F, 0.3F);
                        float var207 = df.B(var206);
                        Matrix4f var222 = this.F;
                        Matrix4f var236 = this.kQ;
                        Matrix4f var223 = var222.set(var236);
                        float var237 = var197 * 2.2F;
                        float var208 = 1.0F - var207;
                        float var209 = -0.22F * var208;
                        var15 = var197;
                        var15 *= Math.PI;
                        var15 = Math.sin(var15);
                        float var252 = (float)var15;
                        float var253 = var252 * 0.9F;
                        float var210 = var209 + var253;
                        Integer var254 = var4;
                        if (var254 == null) {
                            var3 &= -425771167;
                            var3 ^= -597925970;
                            break;
                        }

                        var3 |= -975678244;
                        var3 ^= -1363636183;
                        var3 += -409341240;
                        var3 ^= 655535081;
                        int var255 = var3 + 1;
                        int var256 = var3 * var255;
                        int var257 = var256 & 1;
                        if (var257 != 0) {
                            break label181;
                        }

                        var12 = var223.translate(var237, var210, 0.0F);
                        var12 = var12.translate(0.0F, 0.9F, 0.0F);
                        float var224 = -var197;
                        float var225 = var224 * 2.3F;
                        var12 = var12.rotateZ(var225);
                        var12 = var12.translate(0.0F, -0.9F, 0.0F);
                        var12 = var12.scale(0.0625F);
                        LivingEntity var216 = var132.o;
                        boolean var217 = i_2.Jv(var216);
                        float var226 = df.Kn(var158);
                        var14 = var3 | 1620738016;
                        var14 *= 2044834443;
                        var14 >>= 14;
                        var14 >>= 8;
                        var14 ^= -478935775;
                        this.k(var10, var217, var226, var197, var14);
                        GM var183 = this.HD;
                        var183.gf(var1, var2);
                        float var184 = df.xM(var158, 1.35F, 0.24F);
                        float var264;
                        int var159 = (var264 = var158 - 1.35F) == 0.0F ? 0 : (var264 < 0.0F ? -1 : 1);
                        if (var159 >= 0) {
                            var3 = switch (var3) {
                                case 110620783 -> var3 ^ 1161748711;
                                case 535794807 -> {
                                    var3 ^= 968076812;
                                    var3 -= -1340827480;
                                    var3 |= -526313956;
                                    yield var3 ^ -1732883066;
                                }
                                default -> var3 ^ -1126397038;
                            };
                            Integer var160 = var3;
                            if (var160 == null) {
                                break label181;
                            }

                            float var265;
                            int var161 = (var265 = var184 - 1.0F) == 0.0F ? 0 : (var265 < 0.0F ? -1 : 1);
                            int var198 = var4 + 1;
                            int var199 = var4 * var198;
                            int var200 = var199 & 1;
                            if (var200 != 0) {
                                var3 >>>= 10;
                                var3 ^= 163504732;
                                var3 ^= 641284059;
                                var3 |= 1044280052;
                                var3 ^= -2114378702;
                                break;
                            }

                            var3 |= 1946757038;
                            var3 |= -955453195;
                            var3 *= 1612705873;
                            var3 ^= 600092200;
                            if (var161 < 0) {
                                var3 = switch (var3) {
                                    case -1353014905 -> {
                                        var3 >>= 3;
                                        yield var3 ^ -1555465588;
                                    }
                                    case 498392848 -> var3 ^ -1968013753;
                                    default -> var3 ^ -656334152;
                                };
                                Integer var162 = var3;
                                if (var162 == null) {
                                    break label181;
                                }

                                double var201 = var132.a;
                                var13 = var132.L;
                                var13++;
                                int var163 = var4 + 1;
                                int var164 = var4 * var163;
                                int var165 = var164 & 1;
                                if (var165 != 0) {
                                    var3 &= 1541881342;
                                    var3 |= -1453598094;
                                    var3 *= -489965661;
                                    var3 ^= -1167869323;
                                    break;
                                }

                                var3 ^= -1818920109;
                                var3 >>= 29;
                                var3 ^= 1705542064;
                                var3 *= 1447796413;
                                var3 ^= -222424927;
                                double var133 = var132.C;
                                boolean var134 = var2.at(var1, var201, var13, var133);
                                if (var134) {
                                    var3 &= 1810368215;
                                    var3 ^= 1462764461;
                                    var8 = var3;
                                    if (var8 == null) {
                                        break label181;
                                    }

                                    var1.save();
                                    float var136 = var2.depth();
                                    var1.depth(var136);
                                    var1.additive(0.35F);
                                    SpriteShape var137 = SpriteShape.STAR;
                                    float var166 = var2.x();
                                    float var202 = var2.y();
                                    float var218 = var184 * 0.3F;
                                    float var219 = 0.12F + var218;
                                    float var229 = var2.unitsPerBlock();
                                    float var220 = var219 * var229;
                                    float var185 = 1.0F - var184;
                                    int var230 = var4 + 1;
                                    int var231 = var4 * var230;
                                    var14 = var4 + 2;
                                    int var232 = var231 * var14;
                                    var14 = var4 + 3;
                                    int var233 = var232 * var14;
                                    int var234 = var233 & 7;
                                    if (var234 != 0) {
                                        switch (var3) {
                                            case -1891755574:
                                            default:
                                                var3 ^= -259748769;
                                                break label178;
                                            case 385352122:
                                                var3 &= 1797535047;
                                                var3 ^= -1134078259;
                                                break label178;
                                            case 1407857569:
                                                var3 ^= -1369724273;
                                                break label178;
                                        }
                                    }

                                    var3 *= -311754341;
                                    var3 ^= 1678220253;
                                    Integer var235 = var3;
                                    if (var235 == null) {
                                        break label181;
                                    }

                                    var10 = DP.Y(-11638, var185);
                                    var1.sprite(var137, var166, var202, var220, var10);
                                    var1.restore();
                                    var3 -= 1164153039;
                                    var3 -= 1979761372;
                                    var3 *= 1610216933;
                                    var3 ^= 1620921380;
                                } else {
                                    var3 ^= 554496488;
                                    var3 += -1974881843;
                                    var3 += 671542503;
                                    var3 |= 1556737159;
                                    var3 ^= 1026248779;
                                }
                            } else {
                                switch (var3) {
                                    case -1933810372:
                                        var3 ^= -1980399537;
                                        break;
                                    case -1827423831:
                                    default:
                                        var3 ^= 462461911;
                                        break;
                                    case -1353014905:
                                        var3 &= 607723209;
                                        var3 &= -189885081;
                                        var3 >>= 10;
                                        var3 *= 1754049885;
                                        var3 ^= -212269092;
                                }
                            }
                        } else {
                            var3 -= -1581884677;
                            var3 ^= -1124105056;
                        }
                    }

                    int var138 = var3 + 1;
                    var138 = var3 * var138;
                    int var167 = var3 + 2;
                    var138 *= var167;
                    int var168 = var3 + 3;
                    var138 *= var168;
                    var138 &= 7;
                    if (var138 != 0) {
                        break label181;
                    }

                    var138 = var131 + 1;
                    Integer var169 = var4;
                    if (var169 == null) {
                        switch (var3) {
                            case -1027162660:
                                var3 *= -1770909845;
                                var3 |= -1326370457;
                                var3 &= 199233544;
                                var3 *= 1647596189;
                                var3 ^= 1993246671;
                                break label178;
                            case 1448401329:
                            default:
                                var3 ^= -1200600958;
                                break label178;
                            case 1577024661:
                                var3 ^= 1807969420;
                                break label178;
                        }
                    }

                    var3 >>= 21;
                    var3 &= 72957197;
                    var3 <<= 27;
                    var3 *= -1944055015;
                    var3 ^= -1671127152;
                    Integer var170 = var3;
                    if (var170 == null) {
                        break label181;
                    }

                    var131 = var138;
                    switch (var3) {
                        case -1134256240:
                            var3 -= -69043527;
                            var3 <<= 9;
                            var3 &= -954115265;
                            var3 |= 283640599;
                            var3 ^= -624195247;
                            break;
                        case -494024995:
                            var3 ^= 1302728684;
                            break;
                        case 855716699:
                        default:
                            var3 ^= -817682030;
                    }
                }
            }

            long var111 = var3;
            long var123 = var111 + 1L;
            long var124 = var111 * var123;
            long var144 = var111 + 2L;
            long var125 = var124 * var144;
            long var112 = var111 + 3L;
            long var126 = var125 * var112;
            long var113 = var126 & 7L;
            long var266;
            var4 = (var266 = var113 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var115 = new UnsupportedOperationException();
                throw var115;
            }
        }

        IllegalStateException var110 = new IllegalStateException();
        throw var110;
    }

    private void k(int var1, boolean var2, float var3, float var4, int var5) {
        label431: {
            int var7 = var1;
            int var8 = System.identityHashCode(this);
            int var9 = var8 + 1;
            var9 = var8 * var9;
            int var10 = var8 + 2;
            var9 *= var10;
            var10 = var8 + 3;
            var9 *= var10;
            var9 &= 7;
            if (var9 != 0) {
                int var6 = var5 & 2037616169;
                var6 ^= -505531397;
                var6 &= 263073020;
                var6 ^= -1096267714;
            } else {
                int var24 = var5 * 35331383;
                var24 |= 47110162;
                var24 ^= 572516862;
                var9 = var1 + 1;
                var9 = var1 * var9;
                var10 = var1 + 2;
                var9 *= var10;
                var10 = var1 + 3;
                var9 *= var10;
                var9 &= 7;
                if (var9 != 0) {
                    break label431;
                }

                Matrix4f var306 = this.F;
                float[][] var315 = aR;
                int var11 = var24 ^ 352786849;
                var11 ^= 1205434161;
                var11 &= 1938497793;
                var11 ^= -348429789;
                this.EO(var306, -4.0F, 24.0F, -4.0F, 4.0F, 32.0F, 4.0F, var1, var315, var3, 0.0F, var11);
                Matrix4f var307 = this.F;
                float[][] var316 = W;
                var11 = var24 | 1200454406;
                var11 &= 375909288;
                var11 ^= 1985318261;
                var11 >>>= 27;
                var11 ^= -1993260242;
                this.EO(var307, -4.0F, 24.0F, -4.0F, 4.0F, 32.0F, 4.0F, var1, var316, var3, 0.25F, var11);
                Matrix4f var308 = this.F;
                float[][] var317 = sY;
                var11 = var24 * -502094393;
                var11 += 788930288;
                var11 &= -92037449;
                var11 -= -1341272626;
                var11 ^= -289174201;
                this.EO(var308, -4.0F, 12.0F, -2.0F, 4.0F, 24.0F, 2.0F, var1, var317, var3, 0.0F, var11);
                Matrix4f var309 = this.F;
                float[][] var318 = Q;
                var11 = var24 * 644938953;
                var11 ^= -201661252;
                var11 ^= 1378778899;
                this.EO(var309, -4.0F, 12.0F, -2.0F, 4.0F, 24.0F, 2.0F, var1, var318, var3, 0.125F, var11);
                int var310 = 0;
                var310 = var310;
                var24 *= -273842975;
                var24 ^= 1649137713;
                var24 ^= -2118946391;
                var24 -= 1841958729;
                var24 ^= -1530672468;

                label428:
                while (true) {
                    long var319 = var7;
                    long var12 = var319 + 1L;
                    var12 = var319 * var12;
                    long var14 = var319 + 2L;
                    var12 *= var14;
                    long var320 = var319 + 3L;
                    var12 *= var320;
                    long var321 = var12 & 7L;
                    long var623;
                    var10 = (var623 = var321 - 0L) == 0L ? 0 : (var623 < 0L ? -1 : 1);
                    if (var10 != 0) {
                        break label431;
                    }

                    if (var310 >= 2) {
                        var24 *= -2062571047;
                        var24 >>= 4;
                        var24 ^= 9400622;
                        return;
                    }

                    var24 <<= 1;
                    var24 >>>= 28;
                    var24 ^= 1905901068;
                    var10 = var7 + 1;
                    var10 = var7 * var10;
                    var11 = var7 + 2;
                    var10 *= var11;
                    var11 = var7 + 3;
                    var10 *= var11;
                    var10 &= 7;
                    if (var10 != 0) {
                        break label431;
                    }

                    float var328;
                    if (var310 == 0) {
                        var24 = switch (var24) {
                            case -2147335105 -> var24 ^ 1695132328;
                            default -> var24 ^ 282060876;
                            case 1905901064 -> {
                                var24 += 255432266;
                                var24 &= -573079435;
                                var24 ^= -702973334;
                                yield var24 ^ 243575654;
                            }
                        };
                        var328 = -1.0F;
                        var24 ^= -475804614;
                        var24 |= -505646985;
                        var24 |= 180225263;
                        var24 *= -99702579;
                        var24 ^= 1873836916;
                    } else {
                        var24 = switch (var24) {
                            default -> var24 ^ -1726487398;
                            case -1246829099 -> var24 ^ 354236946;
                            case 1905901064 -> {
                                var24 *= -1749934279;
                                var24 -= 2010509776;
                                var24 ^= 2104135630;
                                yield var24 ^ -1206809532;
                            }
                        };
                        var11 = var7 + 1;
                        var11 = var7 * var11;
                        var11 &= 1;
                        if (var11 != 0) {
                            break label431;
                        }

                        var328 = 1.0F;
                        switch (var24) {
                            case -1887218062:
                                var24 -= 650721779;
                                var24 <<= 10;
                                var24 -= 2043034882;
                                var24 ^= 1629681849;
                                break;
                            case -1609223988:
                                var24 ^= 1358927629;
                                break;
                            case -12928731:
                            default:
                                var24 ^= 1884755513;
                        }
                    }

                    long var356 = var7;
                    long var13 = var356 + 1L;
                    var13 = var356 * var13;
                    long var15 = var356 + 2L;
                    var13 *= var15;
                    long var357 = var356 + 3L;
                    var13 *= var357;
                    long var358 = var13 & 7L;
                    long var624;
                    var11 = (var624 = var358 - 0L) == 0L ? 0 : (var624 < 0L ? -1 : 1);
                    if (var11 != 0) {
                        break label431;
                    }

                    Matrix4f var360 = this.A;
                    Matrix4f var378 = this.F;
                    Matrix4f var361 = var360.set(var378);
                    float var379 = var328 * 2.0F;
                    Matrix4f var362 = var361.translate(var379, 12.0F, 0.0F);
                    float var380 = var328 * var4;
                    float var381 = var380 * 0.7F;
                    Matrix4f var363 = var362.rotateX(var381);
                    Integer var382 = var8;
                    if (var382 != null) {
                        var24 ^= 1008675237;
                        var24 |= 1175111706;
                        var24 -= -209697294;
                        var24 ^= 1298498239;
                        int var383 = var7 + 1;
                        int var384 = var7 * var383;
                        int var385 = var384 & 1;
                        if (var385 != 0) {
                            break label431;
                        }

                        float var386 = -var328;
                        float var387 = var386 * 2.0F;
                        Matrix4f var364 = var363.translate(var387, -12.0F, 0.0F);
                        float var368;
                        if (var310 == 0) {
                            var24 *= 317895781;
                            var24 *= -1820190945;
                            var24 &= 40105428;
                            var24 ^= 1997859286;
                            var11 = var7 + 1;
                            var11 = var7 * var11;
                            var11 &= 1;
                            if (var11 != 0) {
                                break label431;
                            }

                            var368 = -4.0F;
                            var24 += -287390071;
                            var24 ^= 1301041084;
                            var24 *= -1489897151;
                            var24 *= 816248855;
                            var24 ^= 588226914;
                        } else {
                            var24 >>>= 24;
                            var24 >>= 22;
                            var24 ^= 1046301040;
                            var368 = 0.0F;
                            switch (var24) {
                                case -1310434175:
                                default:
                                    var24 ^= -1138583291;
                                    break;
                                case 1046301040:
                                    var24 *= -1301990875;
                                    var24 |= 748015461;
                                    var24 |= 1444358701;
                                    var24 ^= 146162718;
                                    break;
                                case 1063267270:
                                    var24 ^= -863718671;
                            }
                        }

                        var12 = var7;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        long var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var625;
                        int var391 = (var625 = var12 - 0L) == 0L ? 0 : (var625 < 0L ? -1 : 1);
                        if (var391 != 0) {
                            break label431;
                        }

                        Matrix4f var392 = this.A;
                        float var412 = var368 + 4.0F;
                        var14 = var8;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        var14 = var16 & 1L;
                        long var626;
                        int var445 = (var626 = var14 - 0L) == 0L ? 0 : (var626 < 0L ? -1 : 1);
                        if (var445 != 0) {
                            switch (var24) {
                                case -243200802:
                                    var24 ^= 472527825;
                                    break label428;
                                case 919321512:
                                default:
                                    var24 ^= 476458480;
                                    break label428;
                                case 1998699363:
                                    var24 &= -734998157;
                                    var24 ^= -366543475;
                                    break label428;
                            }
                        }

                        var24 += -255711997;
                        var24 <<= 30;
                        var24 ^= 1286611645;
                        var14 = var7;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        long var18 = var14 + 2L;
                        var16 *= var18;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var627;
                        int var449 = (var627 = var14 - 0L) == 0L ? 0 : (var627 < 0L ? -1 : 1);
                        if (var449 != 0) {
                            break label431;
                        }

                        float[][] var452;
                        if (var310 == 0) {
                            var24 = switch (var24) {
                                default -> var24 ^ 1543205366;
                                case -860872003 -> {
                                    var24 >>= 30;
                                    var24 ^= 1677253779;
                                    var24 ^= -914390181;
                                    var24 *= 2057424183;
                                    yield var24 ^ -1387689054;
                                }
                                case -841062742 -> var24 ^ 616603623;
                            };
                            Integer var450 = var7;
                            if (var450 == null) {
                                break label431;
                            }

                            float[][] var451 = c;
                            Integer var484 = var8;
                            if (var484 == null) {
                                var24 &= 242653283;
                                var24 += -537794584;
                                var24 -= 1288959424;
                                var24 += 447383452;
                                var24 ^= 332103369;
                                break;
                            }

                            var24 *= 1479409871;
                            var24 *= -1569983339;
                            var24 ^= 363179966;
                            var24 ^= -1810602731;
                            var452 = var451;
                            var24 *= 2069769283;
                            var24 ^= -1354756440;
                            var24 >>>= 4;
                            var24 &= 374436928;
                            var24 ^= 2051930019;
                        } else {
                            var24 ^= 1462670043;
                            var24 *= 1135556773;
                            var24 |= 64388867;
                            var24 >>= 30;
                            var24 ^= 648967439;
                            float[][] var485 = VF;
                            int var552 = var8 + 1;
                            int var553 = var8 * var552;
                            int var17 = var8 + 2;
                            int var554 = var553 * var17;
                            var17 = var8 + 3;
                            int var555 = var554 * var17;
                            int var556 = var555 & 7;
                            if (var556 != 0) {
                                var24 += -430297437;
                                var24 ^= -1290875041;
                                break;
                            }

                            var24 |= -1453727051;
                            var24 ^= -1939395620;
                            var16 = var7;
                            var18 = var16 + 1L;
                            var18 = var16 * var18;
                            var16 = var18 & 1L;
                            long var628;
                            int var559 = (var628 = var16 - 0L) == 0L ? 0 : (var628 < 0L ? -1 : 1);
                            if (var559 != 0) {
                                break label431;
                            }

                            var452 = var485;
                            var24 &= -1760447121;
                            var24 ^= 2103264192;
                        }

                        int var486 = var24 + -463401908;
                        int var487 = var486 ^ -341860147;
                        this.EO(var392, var368, 0.0F, -2.0F, var412, 12.0F, 2.0F, var1, var452, var3, 0.0F, var487);
                        Matrix4f var393 = this.A;
                        float var413 = var368 + 4.0F;
                        int var453 = var8 + 1;
                        int var454 = var8 * var453;
                        int var455 = var454 & 1;
                        if (var455 != 0) {
                            var24 <<= 18;
                            var24 += 458774200;
                            var24 ^= -941475242;
                            break;
                        }

                        var24 ^= 172009796;
                        var24 ^= -2099422565;
                        Integer var456 = var7;
                        if (var456 == null) {
                            break label431;
                        }

                        float[][] var458;
                        if (var310 == 0) {
                            var24 ^= 623255653;
                            var24 -= 99784091;
                            var24 ^= 950650611;
                            float[][] var457 = n;
                            var15 = var8;
                            long var593 = var15 + 1L;
                            var593 = var15 * var593;
                            var15 = var593 & 1L;
                            long var629;
                            int var490 = (var629 = var15 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
                            if (var490 != 0) {
                                var24 >>= 15;
                                var24 -= -272566974;
                                var24 += -950301119;
                                var24 ^= 1771891386;
                                break;
                            }

                            var24 |= -287112620;
                            var24 -= -711878191;
                            var24 |= 2094438430;
                            var24 ^= -1829759104;
                            var458 = var457;
                            var24 |= -1196360863;
                            var24 *= 1583434247;
                            var24 += -2064120198;
                            var24 |= 362313606;
                            var24 ^= 1607549577;
                        } else {
                            var24 ^= 1946438115;
                            var24 &= 60585107;
                            var24 ^= 775129746;
                            float[][] var491 = ze;
                            int var560 = var8 + 1;
                            int var561 = var8 * var560;
                            int var562 = var561 & 1;
                            if (var562 != 0) {
                                var24 |= -257627019;
                                var24 ^= 1117880987;
                                break;
                            }

                            var24 &= -1111562250;
                            var24 ^= -1373224132;
                            var16 = var7;
                            var18 = var16 + 1L;
                            var18 = var16 * var18;
                            var16 = var18 & 1L;
                            long var630;
                            int var565 = (var630 = var16 - 0L) == 0L ? 0 : (var630 < 0L ? -1 : 1);
                            if (var565 != 0) {
                                break label431;
                            }

                            var458 = var491;
                            var24 -= 1282975393;
                            var24 *= 262641939;
                            var24 ^= -170838529;
                        }

                        var15 = var7;
                        long var595 = var15 + 1L;
                        var595 = var15 * var595;
                        long var19 = var15 + 2L;
                        var595 *= var19;
                        var15 += 3L;
                        var595 *= var15;
                        var15 = var595 & 7L;
                        long var631;
                        int var495 = (var631 = var15 - 0L) == 0L ? 0 : (var631 < 0L ? -1 : 1);
                        if (var495 != 0) {
                            break label431;
                        }

                        int var496 = var24 & 2093880429;
                        int var497 = var496 ^ 452921117;
                        int var498 = var497 ^ 8316829;
                        int var499 = var498 ^ -1816217650;
                        this.EO(var393, var368, 0.0F, -2.0F, var413, 12.0F, 2.0F, var1, var458, var3, 0.125F, var499);
                        Integer var394 = var8;
                        if (var394 == null) {
                            var24 *= 1018370891;
                            var24 -= 787901851;
                            var24 >>= 21;
                            var24 &= 1711103295;
                            var24 ^= -1106874883;
                            break;
                        }

                        var24 -= 1361115610;
                        var24 ^= 352020744;
                        Integer var395 = var7;
                        if (var395 == null) {
                            break label431;
                        }

                        byte var401;
                        if (var2) {
                            var24 = switch (var24) {
                                case -1172919636 -> {
                                    var24 += 2034050282;
                                    var24 |= 41664674;
                                    var24 ^= 1795465885;
                                    yield var24 ^ 260554005;
                                }
                                default -> var24 ^ 403353538;
                                case 1367804096 -> var24 ^ -1310975868;
                            };
                            int var396 = var7 + 1;
                            int var397 = var7 * var396;
                            int var414 = var7 + 2;
                            int var398 = var397 * var414;
                            int var415 = var7 + 3;
                            int var399 = var398 * var415;
                            int var400 = var399 & 7;
                            if (var400 != 0) {
                                break label431;
                            }

                            var401 = 1;
                            var24 *= -270391143;
                            var24 += -1311541741;
                            var24 += 688568691;
                            var24 ^= 1230855072;
                        } else {
                            var24 -= -125107560;
                            var24 ^= 753970309;
                            var13 = var7;
                            var15 = var13 + 1L;
                            var15 = var13 * var15;
                            var13 = var15 & 1L;
                            long var632;
                            int var418 = (var632 = var13 - 0L) == 0L ? 0 : (var632 < 0L ? -1 : 1);
                            if (var418 != 0) {
                                break label431;
                            }

                            var401 = 0;
                            switch (var24) {
                                case -310705007:
                                    var24 &= -659786922;
                                    var24 |= -1133014935;
                                    var24 ^= -1292198067;
                                    break;
                                case 1905797087:
                                default:
                                    var24 ^= -193958512;
                                    break;
                                case 1989364124:
                                    var24 ^= 1793315601;
                            }
                        }

                        var13 = var7;
                        var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var595 = var13 + 2L;
                        var15 *= var595;
                        var13 += 3L;
                        var15 *= var13;
                        var13 = var15 & 7L;
                        long var633;
                        int var422 = (var633 = var13 - 0L) == 0L ? 0 : (var633 < 0L ? -1 : 1);
                        if (var422 != 0) {
                            break label431;
                        }

                        var13 = var8;
                        var15 = var13 + 1L;
                        var15 = var13 * var15;
                        var595 = var13 + 2L;
                        var15 *= var595;
                        var13 += 3L;
                        var15 *= var13;
                        var13 = var15 & 7L;
                        long var634;
                        int var426 = (var634 = var13 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
                        if (var426 != 0) {
                            var24 *= 723275817;
                            var24 ^= 867812282;
                            break;
                        }
                        var24 = switch (var24) {
                            default -> var24 ^ 447476970;
                            case 1317343028 -> {
                                var24 *= -406846865;
                                var24 >>>= 2;
                                yield var24 ^ 810671680;
                            }
                            case 1712087402 -> var24 ^ 456548604;
                        };
                        Integer var427 = var7;
                        if (var427 == null) {
                            break label431;
                        }

                        float var433;
                        if (var2) {
                            var24 = switch (var24) {
                                case 711074211 -> {
                                    var24 |= -652921582;
                                    var24 >>>= 4;
                                    yield var24 ^ 2103929862;
                                }
                                default -> var24 ^ -1789670228;
                                case 1643333970 -> var24 ^ 1130047255;
                            };
                            int var428 = var7 + 1;
                            int var429 = var7 * var428;
                            int var459 = var7 + 2;
                            int var430 = var429 * var459;
                            int var460 = var7 + 3;
                            int var431 = var430 * var460;
                            int var432 = var431 & 7;
                            if (var432 != 0) {
                                break label431;
                            }

                            var433 = 3.0F;
                            var24 += 1266765001;
                            var24 |= -635850866;
                            var24 ^= -1211777250;
                        } else {
                            var24 *= 596381951;
                            var24 *= -1906169021;
                            var24 ^= -1635155426;
                            var14 = var7;
                            var16 = var14 + 1L;
                            var16 = var14 * var16;
                            var14 = var16 & 1L;
                            long var635;
                            int var463 = (var635 = var14 - 0L) == 0L ? 0 : (var635 < 0L ? -1 : 1);
                            if (var463 != 0) {
                                break label431;
                            }

                            var433 = 4.0F;
                            var24 -= 249776791;
                            var24 ^= -335778558;
                        }

                        Integer var464 = var7;
                        if (var464 == null) {
                            break label431;
                        }

                        var14 = var8;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        var14 = var16 & 1L;
                        long var636;
                        int var467 = (var636 = var14 - 0L) == 0L ? 0 : (var636 < 0L ? -1 : 1);
                        if (var467 != 0) {
                            switch (var24) {
                                case -2073878433:
                                    var24 ^= -1773763279;
                                    break label428;
                                case -1118427338:
                                default:
                                    var24 ^= 208882304;
                                    break label428;
                                case 1234981040:
                                    var24 ^= 2031825004;
                                    var24 -= 2086779359;
                                    var24 |= 210134248;
                                    var24 -= -255913302;
                                    var24 ^= 1978579133;
                                    break label428;
                            }
                        }

                        var24 &= 1983642010;
                        var24 <<= 5;
                        var24 >>= 28;
                        var24 ^= 228422847;
                        int var468 = var7 + 1;
                        int var469 = var7 * var468;
                        int var470 = var469 & 1;
                        if (var470 != 0) {
                            break label431;
                        }

                        float var472;
                        if (var310 == 0) {
                            var24 = switch (var24) {
                                case -1321648846 -> var24 ^ 531393337;
                                default -> var24 ^ 1732469026;
                                case 228422847 -> {
                                    var24 += -1712233823;
                                    var24 += -211076148;
                                    var24 ^= -1371854102;
                                    yield var24 ^ -1955611654;
                                }
                            };
                            float var471 = -4.0F - var433;
                            int var510 = var8 + 1;
                            int var511 = var8 * var510;
                            int var512 = var511 & 1;
                            if (var512 != 0) {
                                var24 += 279252885;
                                var24 ^= 1851129151;
                                break;
                            }
                            var24 = switch (var24) {
                                default -> var24 ^ 1514664750;
                                case -1079082436 -> {
                                    var24 |= -1939788885;
                                    var24 *= 1716331015;
                                    yield var24 ^ 1439728664;
                                }
                                case -700195814 -> var24 ^ -950491584;
                            };
                            var472 = var471;
                            var24 ^= 1756805710;
                            var24 ^= 2099138527;
                            var24 ^= 1027884644;
                        } else {
                            var24 -= 154173592;
                            var24 ^= 711276912;
                            var24 ^= -747267149;
                            var15 = var7;
                            var595 = var15 + 1L;
                            var595 = var15 * var595;
                            var15 = var595 & 1L;
                            long var637;
                            int var515 = (var637 = var15 - 0L) == 0L ? 0 : (var637 < 0L ? -1 : 1);
                            if (var515 != 0) {
                                break label431;
                            }

                            var472 = 4.0F;
                            var24 |= 1293314842;
                            var24 *= -1079370171;
                            var24 |= 242376392;
                            var24 >>>= 12;
                            var24 ^= -1410938703;
                        }

                        Matrix4f var473 = this.A;
                        Matrix4f var516 = this.F;
                        Matrix4f var474 = var473.set(var516);
                        int var517 = var8 + 1;
                        int var518 = var8 * var517;
                        int var519 = var518 & 1;
                        if (var519 == 0) {
                            var24 ^= 1069569021;
                            var24 >>>= 10;
                            var24 >>>= 30;
                            var24 *= 738623087;
                            var24 ^= -1864039743;
                            float var520 = var328 * 5.0F;
                            Matrix4f var475 = var474.translate(var520, 23.0F, 0.0F);
                            float var521 = -var328;
                            float var570 = var4 * 1.4F;
                            float var571 = 0.08F + var570;
                            float var522 = var521 * var571;
                            Matrix4f var476 = var475.rotateZ(var522);
                            float var329 = -var328;
                            float var330 = var329 * 5.0F;
                            Matrix4f var331 = var476.translate(var330, -23.0F, 0.0F);
                            Matrix4f var332 = this.A;
                            float var477 = var472 + var433;
                            float[][] var526;
                            if (var310 == 0) {
                                var24 -= 579876409;
                                var24 ^= 1779601455;
                                var24 *= -1829717603;
                                var24 ^= -1897056504;
                                Integer var523 = var7;
                                if (var523 == null) {
                                    break label431;
                                }

                                float[][][] var524 = SQ;
                                int var572 = var8 + 1;
                                int var573 = var8 * var572;
                                int var603 = var8 + 2;
                                int var574 = var573 * var603;
                                int var604 = var8 + 3;
                                int var575 = var574 * var604;
                                int var576 = var575 & 7;
                                if (var576 != 0) {
                                    var24 |= 980946012;
                                    var24 *= -1113742879;
                                    var24 ^= -2079317903;
                                    break;
                                }
                                var24 = switch (var24) {
                                    case -705986760 -> var24 ^ -2077810720;
                                    case 474396259 -> {
                                        var24 &= 1862626718;
                                        var24 >>= 10;
                                        yield var24 ^ -669882583;
                                    }
                                    default -> var24 ^ 706316755;
                                };
                                Integer var577 = var7;
                                if (var577 == null) {
                                    break label431;
                                }

                                float[][] var525 = var524[var401];
                                var526 = var525;
                                switch (var24) {
                                    case -669948384:
                                        var24 *= -1091810971;
                                        var24 ^= -2023140134;
                                        var24 -= -1029624011;
                                        var24 |= -1339229492;
                                        var24 ^= -279436436;
                                        break;
                                    case 167352751:
                                    default:
                                        var24 ^= -508272647;
                                        break;
                                    case 687078857:
                                        var24 ^= 2007496873;
                                }
                            } else {
                                var24 ^= 174455194;
                                var24 >>= 28;
                                var24 ^= -1826792480;
                                float[][][] var578 = X;
                                int var605 = var8 + 1;
                                int var606 = var8 * var605;
                                int var607 = var606 & 1;
                                if (var607 != 0) {
                                    var24 >>= 2;
                                    var24 |= 1706378349;
                                    var24 >>= 22;
                                    var24 ^= -1106875120;
                                    break;
                                }

                                var24 += 1647141377;
                                var24 &= 1307827753;
                                var24 *= -1552470717;
                                var24 += -1032381820;
                                var24 ^= 962924726;
                                int var608 = var7 + 1;
                                int var609 = var7 * var608;
                                int var621 = var7 + 2;
                                int var610 = var609 * var621;
                                int var622 = var7 + 3;
                                int var611 = var610 * var622;
                                int var612 = var611 & 7;
                                if (var612 != 0) {
                                    break label431;
                                }

                                float[][] var579 = var578[var401];
                                var526 = var579;
                                switch (var24) {
                                    case -1659566550:
                                        var24 &= 631672871;
                                        var24 |= -856871106;
                                        var24 &= -1184584568;
                                        var24 ^= -1673465687;
                                        break;
                                    case -1200954472:
                                    default:
                                        var24 ^= 2022816361;
                                        break;
                                    case 1731125406:
                                        var24 ^= 167953649;
                                }
                            }

                            Integer var580 = var7;
                            if (var580 == null) {
                                break label431;
                            }

                            int var581 = var24 | -1438593876;
                            int var582 = var581 - -405605947;
                            int var583 = var582 + -57860193;
                            int var584 = var583 * -631159455;
                            int var585 = var584 ^ 972104453;
                            this.EO(var332, var472, 12.0F, -2.0F, var477, 24.0F, 2.0F, var1, var526, var3, 0.0F, var585);
                            Matrix4f var333 = this.A;
                            var14 = var8;
                            var16 = var14 + 1L;
                            var16 = var14 * var16;
                            var14 = var16 & 1L;
                            long var638;
                            int var480 = (var638 = var14 - 0L) == 0L ? 0 : (var638 < 0L ? -1 : 1);
                            if (var480 == 0) {
                                var24 &= -737770007;
                                var24 &= -1473328980;
                                var24 ^= -258477153;
                                float var434 = var472 + var433;
                                float[][] var483;
                                if (var310 == 0) {
                                    var24 |= -950412534;
                                    var24 >>>= 24;
                                    var24 -= -1081218306;
                                    var24 ^= 1396787014;
                                    float[][][] var481 = R;
                                    Integer var527 = var8;
                                    if (var527 == null) {
                                        switch (var24) {
                                            case -844648889:
                                            default:
                                                var24 ^= 861274591;
                                                break label428;
                                            case 322130623:
                                                var24 += -1033289071;
                                                var24 ^= 843779313;
                                                var24 ^= 1506932047;
                                                break label428;
                                            case 1283684383:
                                                var24 ^= 33734258;
                                                break label428;
                                        }
                                    }

                                    var24 ^= -534680579;
                                    var24 -= 347072201;
                                    var24 ^= -1069705615;
                                    var24 |= -344276678;
                                    var24 ^= 94854588;
                                    int var528 = var7 + 1;
                                    int var529 = var7 * var528;
                                    int var588 = var7 + 2;
                                    int var530 = var529 * var588;
                                    int var589 = var7 + 3;
                                    int var531 = var530 * var589;
                                    int var532 = var531 & 7;
                                    if (var532 != 0) {
                                        break label431;
                                    }

                                    float[][] var482 = var481[var401];
                                    var483 = var482;
                                    var24 ^= 287122221;
                                    var24 <<= 26;
                                    var24 >>>= 2;
                                    var24 ^= -1502361154;
                                } else {
                                    var24 ^= 665528726;
                                    var24 ^= -304632143;
                                    var24 ^= -137534568;
                                    var15 = var7;
                                    var595 = var15 + 1L;
                                    var595 = var15 * var595;
                                    var15 = var595 & 1L;
                                    long var639;
                                    int var535 = (var639 = var15 - 0L) == 0L ? 0 : (var639 < 0L ? -1 : 1);
                                    if (var535 != 0) {
                                        break label431;
                                    }

                                    float[][][] var536 = dU;
                                    float[][] var402 = var536[var401];
                                    var15 = var8;
                                    var595 = var15 + 1L;
                                    var595 = var15 * var595;
                                    var15 = var595 & 1L;
                                    long var640;
                                    int var539 = (var640 = var15 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
                                    if (var539 != 0) {
                                        var24 >>= 11;
                                        var24 &= -1619444306;
                                        var24 ^= 561989868;
                                        break;
                                    }

                                    var24 ^= -1994448588;
                                    var24 += 763955674;
                                    var24 >>>= 11;
                                    var24 -= 966083527;
                                    var24 ^= 655703025;
                                    int var540 = var7 + 1;
                                    int var541 = var7 * var540;
                                    int var590 = var7 + 2;
                                    int var542 = var541 * var590;
                                    int var591 = var7 + 3;
                                    int var543 = var542 * var591;
                                    int var544 = var543 & 7;
                                    if (var544 != 0) {
                                        break label431;
                                    }

                                    var483 = var402;
                                    switch (var24) {
                                        case -1755333645:
                                            var24 ^= -1204264092;
                                            break;
                                        case -781779943:
                                        default:
                                            var24 ^= -2042960319;
                                            break;
                                        case -512897312:
                                            var24 &= -1723058318;
                                            var24 -= -169064532;
                                            var24 >>>= 13;
                                            var24 ^= -1921543357;
                                    }
                                }

                                int var403 = var7 + 1;
                                int var404 = var7 * var403;
                                int var405 = var404 & 1;
                                if (var405 != 0) {
                                    break label431;
                                }

                                int var406 = var24 ^ 11582392;
                                int var407 = var406 - -311251265;
                                int var408 = var407 ^ 694255717;
                                this.EO(var333, var472, 12.0F, -2.0F, var434, 24.0F, 2.0F, var1, var483, var3, 0.125F, var408);
                                var10 = var310 + 1;
                                long var370 = var8;
                                var13 = var370 + 1L;
                                var13 = var370 * var13;
                                var15 = var370 + 2L;
                                var13 *= var15;
                                long var371 = var370 + 3L;
                                var13 *= var371;
                                long var372 = var13 & 7L;
                                long var641;
                                var11 = (var641 = var372 - 0L) == 0L ? 0 : (var641 < 0L ? -1 : 1);
                                if (var11 != 0) {
                                    switch (var24) {
                                        case -1921791554:
                                            var24 *= -664233307;
                                            var24 ^= -1507115112;
                                            break label428;
                                        case 539377224:
                                        default:
                                            var24 ^= -690885451;
                                            break label428;
                                        case 1140149940:
                                            var24 ^= 329784454;
                                            break label428;
                                    }
                                }

                                var24 &= 615560315;
                                var24 |= 559699720;
                                var24 ^= 522622191;
                                Integer var374 = var7;
                                if (var374 == null) {
                                    break label431;
                                }

                                var310 = var10;
                                var24 &= -987122136;
                                var24 |= -1482310390;
                                var24 <<= 28;
                                var24 ^= -2070462216;
                                continue;
                            }

                            var24 *= 259926399;
                            var24 |= 427515953;
                            var24 |= -1247313981;
                            var24 ^= 1106842385;
                            break;
                        }

                        var24 |= 762951938;
                        var24 |= -637240678;
                        var24 &= 1700392154;
                        var24 ^= -614498252;
                        break;
                    }

                    switch (var24) {
                        case -1112845173:
                            var24 ^= 1397256670;
                            break label428;
                        case 260654663:
                            var24 &= 1292761143;
                            var24 ^= -1290851095;
                            break label428;
                        case 575086106:
                        default:
                            var24 ^= -1623167594;
                            break label428;
                    }
                }
            }

            IllegalStateException var295 = new IllegalStateException();
            throw var295;
        }

        UnsupportedOperationException var296 = new UnsupportedOperationException();
        throw var296;
    }

    private void EO(
        Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float[][] var9, float var10, float var11, int var12
    ) {
        int var14 = System.identityHashCode(this);
        GM var15 = this.HD;
        float var16 = var2 - var11;
        float var17 = var3 - var11;
        float var18 = var4 - var11;
        float var19 = var5 + var11;
        float var20 = var6 + var11;
        float var21 = var7 + var11;
        int var22 = var14 + 1;
        var22 = var14 * var22;
        var14 = var22 & 1;
        if (var14 != 0) {
            int var27 = var12 | -904272500;
            var27 |= 1196353805;
            var27 ^= -594172239;
            RuntimeException var31 = new RuntimeException();
            throw var31;
        } else {
            switch (var12) {
                case -1993260254:
                    int var24 = var12 & 631257550;
                    var24 <<= 10;
                    var24 ^= 800162054;
                    break;
                case -1985635427:
                default:
                    int var23 = var12 ^ -2035285275;
                    break;
                case -582039221:
                    int var13 = var12 ^ -1764210329;
            }

            var15.uT(var1, var16, var17, var18, var19, var20, var21, var8, var9, 64.0F, 64.0F, var10);
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1497533293;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        p = var4;
        float[][] var5 = GM.ee(0, 0, 8, 8, 8);
        aR = var5;
        float[][] var6 = GM.ee(32, 0, 8, 8, 8);
        W = var6;
        float[][] var7 = GM.ee(16, 16, 8, 12, 4);
        sY = var7;
        float[][] var8 = GM.ee(16, 32, 8, 12, 4);
        Q = var8;
        float[][] var9 = GM.ee(0, 16, 4, 12, 4);
        c = var9;
        float[][] var10 = GM.ee(16, 48, 4, 12, 4);
        VF = var10;
        float[][] var11 = GM.ee(0, 32, 4, 12, 4);
        n = var11;
        float[][] var12 = GM.ee(0, 48, 4, 12, 4);
        ze = var12;
        float[][][] var13 = new float[2][][];
        float[][] var17 = GM.ee(40, 16, 4, 12, 4);
        var13[0] = var17;
        float[][] var18 = GM.ee(40, 16, 3, 12, 4);
        var13[1] = var18;
        SQ = var13;
        float[][][] var14 = new float[2][][];
        float[][] var19 = GM.ee(32, 48, 4, 12, 4);
        var14[0] = var19;
        float[][] var20 = GM.ee(32, 48, 3, 12, 4);
        var14[1] = var20;
        X = var14;
        float[][][] var15 = new float[2][][];
        float[][] var21 = GM.ee(40, 32, 4, 12, 4);
        var15[0] = var21;
        float[][] var22 = GM.ee(40, 32, 3, 12, 4);
        var15[1] = var22;
        R = var15;
        float[][][] var16 = new float[2][][];
        float[][] var23 = GM.ee(48, 48, 4, 12, 4);
        var16[0] = var23;
        float[][] var24 = GM.ee(48, 48, 3, 12, 4);
        var16[1] = var24;
        dU = var16;
    }
}
