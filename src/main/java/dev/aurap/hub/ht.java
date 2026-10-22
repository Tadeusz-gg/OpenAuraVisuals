package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Optional;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public final class ht {
    public static final int be;

    private ht() {
    }

    public static void xN(Entity var0, float var1, double[] var2) {
        label81: {
            int var3 = be;
            var3 ^= 958494001;
            int var4 = System.identityHashCode(var0);
            Entity var5 = i_2.QI();
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var175;
            int var103 = (var175 = var6 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
            int var7 = of_2.Ny;
            var3 ^= var7;
            var3 ^= 130860231;
            of_2.Ny = 130860231;
            var7 = of_2.bm;
            var3 ^= var7;
            var3 ^= 660357361;
            of_2.bm = 660357361;
            if (var103 != 0) {
                var3 &= 1448637189;
                var3 ^= -1851395650;
                var3 += -770568174;
                var3 |= 1110651402;
                var3 ^= 967264995;
            } else {
                var3 &= -1352214196;
                var3 ^= 1839406725;
                Box var104 = var0.getBoundingBox();
                double var107 = var104.minX;
                double var9 = var104.maxX;
                double var108 = var107 + var9;
                double var109 = var108 * 0.5;
                var9 = var104.minY;
                double var11 = var104.maxY;
                double var13 = var104.minY;
                var11 -= var13;
                var11 *= 0.62;
                var9 += var11;
                var11 = var104.minZ;
                var13 = var104.maxZ;
                var11 += var13;
                var11 *= 0.5;
                if (var5 == null) {
                    var3 *= -1787315309;
                    var3 ^= 692540349;
                    var3 ^= 1338506219;
                    int var128 = var3 + 1;
                    int var129 = var3 * var128;
                    int var130 = var129 & 1;
                    if (var130 == 0) {
                        int var131 = var3 & -1218880634;
                        int var132 = var131 >> 3;
                        int var133 = var132 ^ -716622132;
                        hy(var2, var109, var9, var11, 0.0, 0.0, 1.0, var133);
                        return;
                    }
                    break label81;
                }
                var3 = switch (var3) {
                    case -1041823859 -> {
                        var3 += -673492726;
                        var3 ^= 1081752010;
                        var3 *= -692239043;
                        yield var3 ^ 22996452;
                    }
                    case 744061630 -> var3 ^ -1928715523;
                    default -> var3 ^ -882858936;
                };
                int var124 = var3 + 1;
                int var125 = var3 * var124;
                int var126 = var125 & 1;
                if (var126 != 0) {
                    break label81;
                }

                Vec3d var127 = var5.getCameraPosVec(var1);
                long var14 = var4;
                long var16 = var14 + 1L;
                var16 = var14 * var16;
                var14 = var16 & 1L;
                long var176;
                int var135 = (var176 = var14 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                if (var135 == 0) {
                    var3 = switch (var3) {
                        default -> var3 ^ 905815460;
                        case -768102830 -> var3 ^ 1050126122;
                        case 864592333 -> {
                            var3 >>= 17;
                            yield var3 ^ -856981171;
                        }
                    };
                    var14 = var3;
                    var16 = var14 + 1L;
                    var16 = var14 * var16;
                    var14 = var16 & 1L;
                    long var177;
                    int var138 = (var177 = var14 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                    if (var138 != 0) {
                        break label81;
                    }

                    Vec3d var85 = var5.getRotationVec(var1);
                    Box var139 = var104.expand(0.05);
                    Vec3d var15 = var85.multiply(8.0);
                    var15 = var127.add(var15);
                    Optional var140 = var139.raycast(var127, var15);
                    boolean var149 = var140.isPresent();
                    if (var149) {
                        var3 -= -1875122536;
                        var3 &= 1184876666;
                        var3 -= -1861276188;
                        var3 -= -1167834603;
                        var3 ^= 1863126537;
                        int var150 = var3 + 1;
                        int var151 = var3 * var150;
                        int var159 = var3 + 2;
                        int var152 = var151 * var159;
                        int var160 = var3 + 3;
                        int var153 = var152 * var160;
                        int var154 = var153 & 7;
                        if (var154 != 0) {
                            break label81;
                        }

                        Object var141 = var140.get();
                        Vec3d var142 = (Vec3d)var141;
                        double var155 = var142.x;
                        double var17 = var142.y;
                        double var19 = var142.z;
                        double var21 = var85.x;
                        double var23 = var85.y;
                        double var25 = var85.z;
                        Integer var86 = var4;
                        if (var86 != null) {
                            var3 *= -659473253;
                            var3 &= 1506327879;
                            var3 -= -390333957;
                            var3 ^= -195308414;
                            Integer var87 = var3;
                            if (var87 != null) {
                                int var88 = var3 ^ 1333792199;
                                int var89 = var88 << 17;
                                int var90 = var89 ^ -1529840516;
                                int var91 = var90 ^ 119917719;
                                int var92 = var91 ^ -1327788745;
                                hy(var2, var155, var17, var19, var21, var23, var25, var92);
                                return;
                            }
                            break label81;
                        }

                        var3 *= 684130707;
                        var3 &= -478248498;
                        var3 *= 1498817981;
                        var3 ^= 321540251;
                    } else {
                        var3 *= -1909946911;
                        var3 -= 1495219268;
                        var3 += 1619242462;
                        var3 ^= -332415486;
                        int var93 = var3 + 1;
                        int var94 = var3 * var93;
                        int var143 = var3 + 2;
                        int var95 = var94 * var143;
                        int var144 = var3 + 3;
                        int var96 = var95 * var144;
                        int var97 = var96 & 7;
                        if (var97 != 0) {
                            break label81;
                        }

                        double var145 = var127.x;
                        double var146 = var109 - var145;
                        double var161 = var127.y;
                        double var162 = var9 - var161;
                        double var18 = var127.z;
                        var18 = var11 - var18;
                        double var20 = var146 * var146;
                        double var22 = var162 * var162;
                        var20 += var22;
                        var22 = var18 * var18;
                        var20 += var22;
                        var20 = Math.sqrt(var20);
                        var20 = Math.max(1.0E-4, var20);
                        var22 = var146 / var20;
                        var22 = var162 / var20;
                        var20 = var18 / var20;
                        int var98 = var4 + 1;
                        int var99 = var4 * var98;
                        var4 = var99 & 1;
                        if (var4 == 0) {
                            var3 <<= 22;
                            var3 &= 1492775054;
                            var3 <<= 11;
                            var3 ^= -957920720;
                            var4 = var3 + 1;
                            var4 = var3 * var4;
                            int var100 = var3 + 2;
                            var4 *= var100;
                            int var101 = var3 + 3;
                            var4 *= var101;
                            var4 &= 7;
                            if (var4 == 0) {
                                double var80 = var104.maxX;
                                double var170 = var104.minX;
                                double var81 = var80 - var170;
                                double var82 = var81 * 0.5;
                                double var171 = var22 * var82;
                                double var105 = var109 - var171;
                                double var83 = var20 * var82;
                                double var84 = var11 - var83;
                                int var111 = var3 * -715964913;
                                int var112 = var111 & -1308512500;
                                int var113 = var112 & -1813635236;
                                int var114 = var113 | 1720588194;
                                int var115 = var114 ^ -1012653442;
                                hy(var2, var105, var9, var84, var22, var22, var20, var115);
                                return;
                            }
                            break label81;
                        }

                        var3 >>= 25;
                        var3 &= -922625646;
                        var3 ^= -1433312855;
                    }
                } else {
                    var3 *= 2019865155;
                    var3 ^= -1429841250;
                }
            }

            Integer var68 = var3;
            if (var68 != null) {
                RuntimeException var69 = new RuntimeException();
                throw var69;
            }
        }

        RuntimeException var73 = new RuntimeException();
        throw var73;
    }

    private static void hy(double[] var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
        int var15 = System.identityHashCode(var0);
        int var16 = var15 + 1;
        var16 = var15 * var16;
        var15 = var16 & 1;
        if (var15 == 0) {
            int var21 = var13 - 1049028430;
            var21 *= 478106453;
            var21 ^= -1865878037;
            Integer var25 = var21;
            if (var25 == null) {
                AssertionError var26 = new AssertionError();
                throw var26;
            } else {
                var0[0] = var1;
                var0[1] = var3;
                var0[2] = var5;
                var0[3] = var7;
                var0[4] = var9;
                var0[5] = var11;
            }
        } else {
            int var14 = var13 ^ -1354308018;
            var14 *= -1227791839;
            var14 &= 535164332;
            var14 ^= 1899556463;
            UnsupportedOperationException var20 = new UnsupportedOperationException();
            throw var20;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 961088034;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        be = var4;
    }
}
