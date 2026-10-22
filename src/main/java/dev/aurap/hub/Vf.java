package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.item.ItemStack;

public final class Vf {
    public final Object vx;
    public final ItemStack Q;
    public final String i;
    public final XF GK;
    public final Re qA;
    public final StringBuilder io;
    public boolean s;
    public float QJ;
    public float b;
    public float al;
    public float Pf;
    private int o;
    public static final int Zy;

    public Vf(Object var1, ItemStack var2) {
        kE_2 var4 = kE_2.uY(0.42F, 0.82F);
        XF var3 = new XF(0.0F, var4);
        this.GK = var3;
        Re var5 = new Re(1.0F, 0.08F);
        this.qA = var5;
        StringBuilder var6 = new StringBuilder(8);
        this.io = var6;
        this.o = Integer.MIN_VALUE;
        this.vx = var1;
        this.Q = var2;
        boolean var7 = var2.isEmpty();
        String var9;
        if (var7) {
            String var8 = var1.toString();
            var9 = var8;
        } else {
            String var10 = i_2.Wb(var2);
            var9 = var10;
        }

        this.i = var9;
    }

    public void w(float var1, float var2) {
        label125: {
            int var57;
            label124: {
                var57 = Zy;
                var57 ^= -807794664;
                int var4 = System.identityHashCode(this);
                float var5 = var1 / var2;
                int var6 = var4 + 1;
                var6 = var4 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    var57 ^= -469740013;
                    var57 -= -1882772516;
                    var57 &= -989584865;
                    var57 ^= 203533695;
                } else {
                    var57 -= -1877994741;
                    var57 *= 687825393;
                    var57 ^= 1855539899;
                    Integer var100 = var57;
                    if (var100 == null) {
                        break label125;
                    }

                    var5 = TP.S(var5);
                    this.QJ = var5;
                    var5 = var1 / 2.0F;
                    double var92 = var5;
                    double var93 = Math.ceil(var92);
                    int var94 = (int)var93;
                    int var95 = Math.max(0, var94);
                    int var101 = this.o;
                    if (var95 == var101) {
                        var57 += -330029847;
                        var57 -= -9349478;
                        var57 ^= 17109628;
                        var101 = var57 + 1;
                        var101 = var57 * var101;
                        var101 &= 1;
                        if (var101 == 0) {
                            return;
                        }
                        break label125;
                    }

                    var57 += 434299928;
                    var57 ^= 717692736;
                    var57 -= 572258705;
                    var57 >>= 16;
                    var57 ^= -551013209;
                    Integer var102 = var57;
                    if (var102 == null) {
                        break label125;
                    }

                    this.o = var95;
                    StringBuilder var103 = this.io;
                    var103.setLength(0);
                    long var104 = var4;
                    long var8 = var104 + 1L;
                    var8 = var104 * var8;
                    long var10 = var104 + 2L;
                    var8 *= var10;
                    long var105 = var104 + 3L;
                    var8 *= var105;
                    long var106 = var8 & 7L;
                    long var183;
                    int var107 = (var183 = var106 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                    if (var107 == 0) {
                        var57 &= -532824857;
                        var57 &= -1176560255;
                        var57 |= 1129095587;
                        var57 ^= 1371737544;
                        long var108 = var57;
                        var8 = var108 + 1L;
                        var8 = var108 * var8;
                        long var109 = var8 & 1L;
                        long var184;
                        var107 = (var184 = var109 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                        if (var107 != 0) {
                            break label125;
                        }

                        if (var95 >= 600) {
                            var57 = switch (var57) {
                                case -1358728278 -> var57 ^ 1573469365;
                                case 849263723 -> {
                                    var57 += -1116380770;
                                    var57 ^= 765202834;
                                    yield var57 ^ -436755996;
                                }
                                default -> var57 ^ -1506490288;
                            };
                            var107 = var57 + 1;
                            var107 = var57 * var107;
                            int var7 = var57 + 2;
                            var107 *= var7;
                            var7 = var57 + 3;
                            var107 *= var7;
                            var107 &= 7;
                            if (var107 != 0) {
                                break label125;
                            }

                            var107 = var95 + 9;
                            var107 /= 10;
                            StringBuilder var137 = this.io;
                            int var147 = var107 / 60;
                            StringBuilder var138 = var137.append(var147);
                            int var148 = var4 + 1;
                            int var149 = var4 * var148;
                            int var9 = var4 + 2;
                            int var150 = var149 * var9;
                            var9 = var4 + 3;
                            int var151 = var150 * var9;
                            int var152 = var151 & 7;
                            if (var152 != 0) {
                                var57 -= 591694818;
                                var57 *= -1978987559;
                                var57 ^= 1635621228;
                            } else {
                                var57 ^= -929364196;
                                var57 ^= 1016124225;
                                StringBuilder var139 = var138.append(':');
                                int var153 = var107 % 60;
                                String var158;
                                if (var153 < 10) {
                                    var57 = switch (var57) {
                                        case -864781790 -> {
                                            var57 >>>= 23;
                                            yield var57 ^ 1025339923;
                                        }
                                        case 1138354715 -> var57 ^ -855988427;
                                        default -> var57 ^ 1781044430;
                                    };
                                    var8 = var57;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    long var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var185;
                                    int var157 = (var185 = var8 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                                    if (var157 != 0) {
                                        break label125;
                                    }

                                    var158 = "0";
                                    switch (var57) {
                                        case -1862710991:
                                            var57 ^= -1503496987;
                                            break;
                                        case -33529366:
                                        default:
                                            var57 ^= -1483080461;
                                            break;
                                        case 1025340299:
                                            var57 ^= -1431687820;
                                            var57 >>>= 4;
                                            var57 ^= -471577790;
                                            var57 -= -1703094418;
                                            var57 ^= 647033690;
                                    }
                                } else {
                                    var57 |= 1378433995;
                                    var57 >>>= 30;
                                    var57 >>= 15;
                                    var57 ^= -1615493158;
                                    var9 = var57 + 1;
                                    var9 = var57 * var9;
                                    var9 &= 1;
                                    if (var9 != 0) {
                                        break label125;
                                    }

                                    var158 = "";
                                    switch (var57) {
                                        case -1999424577:
                                        default:
                                            var57 ^= 596445208;
                                            break;
                                        case -1615493158:
                                            var57 <<= 29;
                                            var57 ^= 917673061;
                                            break;
                                        case -567023373:
                                            var57 ^= 1190070759;
                                    }
                                }

                                Integer var172 = var57;
                                if (var172 == null) {
                                    break label125;
                                }

                                StringBuilder var140 = var139.append(var158);
                                var107 %= 60;
                                var8 = var4;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var182 = var8 + 2L;
                                var10 *= var182;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var186;
                                int var162 = (var186 = var8 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                                if (var162 == 0) {
                                    var57 >>= 5;
                                    var57 += -605871236;
                                    var57 ^= 936853511;
                                    StringBuilder var119 = var140.append(var107);
                                    var57 <<= 11;
                                    var57 -= 1932948005;
                                    var57 ^= 700643191;
                                    break label124;
                                }

                                var57 -= 1763555445;
                                var57 ^= -422090517;
                                var57 ^= 576863330;
                            }
                        } else {
                            var57 *= -859437043;
                            var57 <<= 29;
                            var57 += 1644032403;
                            var57 |= 1840678138;
                            var57 ^= 478918795;
                            var107 = var57 + 1;
                            var107 = var57 * var107;
                            var107 &= 1;
                            if (var107 != 0) {
                                break label125;
                            }

                            StringBuilder var123 = this.io;
                            int var141 = var95 / 10;
                            StringBuilder var124 = var123.append(var141);
                            StringBuilder var125 = var124.append('.');
                            int var96 = var95 % 10;
                            StringBuilder var97 = var125.append(var96);
                            long var126 = var4;
                            var8 = var126 + 1L;
                            var8 = var126 * var8;
                            var10 = var126 + 2L;
                            var8 *= var10;
                            long var127 = var126 + 3L;
                            var8 *= var127;
                            long var128 = var8 & 7L;
                            long var187;
                            var4 = (var187 = var128 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                var57 >>= 12;
                                var57 *= 145963959;
                                var57 <<= 18;
                                var57 -= 515582483;
                                var57 ^= -850253003;
                                Integer var84 = var57;
                                if (var84 == null) {
                                    break label125;
                                }

                                StringBuilder var85 = var97.append('s');
                                var57 += 786030599;
                                var57 |= 1944622394;
                                var57 <<= 10;
                                var57 ^= -2043197780;
                                break label124;
                            }

                            var57 &= 1901250422;
                            var57 -= 1128302047;
                            var57 ^= 1082477176;
                            var57 ^= -1481934192;
                        }
                    } else {
                        var57 += 833092610;
                        var57 -= -1991992700;
                        var57 -= 893479839;
                        var57 ^= 1524131727;
                    }
                }

                Integer var77 = var57;
                if (var77 != null) {
                    RuntimeException var78 = new RuntimeException();
                    throw var78;
                }
                break label125;
            }

            long var86 = var57;
            long var129 = var86 + 1L;
            var129 = var86 * var129;
            long var167 = var86 + 2L;
            var129 *= var167;
            var86 += 3L;
            var129 *= var86;
            var86 = var129 & 7L;
            long var188;
            int var89 = (var188 = var86 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
            if (var89 == 0) {
                return;
            }
        }

        IllegalArgumentException var82 = new IllegalArgumentException();
        throw var82;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1896812387;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Zy = var4;
    }
}
