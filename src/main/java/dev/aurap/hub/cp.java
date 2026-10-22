package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class cp {
    private static final float CZ = 0.1F;
    private long r = -1L;
    private float u;
    private double lT;
    private float n = 1.0F;
    private float Cm = 0.1F;
    private float hl = -1.0F;
    private long MU;
    public static final int A;

    public cp() {
    }

    public void gB(long var1) {
        int var3 = A;
        var3 ^= -450052945;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var6 = var4 + 3;
        var5 *= var6;
        var5 &= 7;
        label117:
        if (var5 == 0) {
            var3 = switch (var3) {
                default -> var3 ^ 1171360189;
                case 314795505 -> {
                    var3 *= 1223333615;
                    var3 *= 472735259;
                    var3 >>>= 4;
                    var3 >>>= 24;
                    yield var3 ^ -1642649798;
                }
                case 854058386 -> var3 ^ 5067973;
            };
            Integer var95 = var3;
            label113:
            if (var95 != null) {
                float var96 = this.hl;
                float var159;
                int var97 = (var159 = var96 - 0.0F) == 0.0F ? 0 : (var159 < 0.0F ? -1 : 1);
                float var100;
                if (var97 > 0) {
                    var3 *= 1612873929;
                    var3 ^= 1742533471;
                    var3 >>>= 14;
                    var3 ^= 1452521416;
                    Integer var98 = var3;
                    if (var98 == null) {
                        break label113;
                    }

                    float var99 = this.hl;
                    long var104 = var4;
                    long var8 = var104 + 1L;
                    var8 = var104 * var8;
                    long var10 = var104 + 2L;
                    var8 *= var10;
                    long var105 = var104 + 3L;
                    var8 *= var105;
                    long var106 = var8 & 7L;
                    long var160;
                    var6 = (var160 = var106 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        var3 ^= 1871341738;
                        var3 ^= 137744109;
                        break label117;
                    }

                    var3 |= -632865121;
                    var3 >>= 8;
                    var3 *= -1240192607;
                    var3 ^= 806685469;
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label113;
                    }

                    var100 = var99;
                    var3 |= -608258563;
                    var3 ^= 728718901;
                } else {
                    var3 &= -607632674;
                    var3 |= -1122436510;
                    var3 &= 2130750185;
                    var3 ^= -1732605397;
                    long var111 = this.r;
                    long var161;
                    var6 = (var161 = var111 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                    Integer var7 = var4;
                    if (var7 == null) {
                        switch (var3) {
                            case -1480974261:
                                var3 >>= 14;
                                var3 ^= -825216163;
                                break label117;
                            case -370541699:
                            default:
                                var3 ^= 687337238;
                                break label117;
                            case 236387470:
                                var3 ^= -428115603;
                                break label117;
                        }
                    }

                    var3 |= -1247253711;
                    var3 |= 1618649460;
                    var3 -= 562461395;
                    var3 ^= 1650273262;
                    var7 = var3;
                    if (var7 == null) {
                        break label113;
                    }

                    if (var6 < 0) {
                        var3 += -1956106016;
                        var3 |= 1938144737;
                        var3 ^= 471960915;
                        float var113 = 0.0F;
                        long var131 = var4;
                        long var9 = var131 + 1L;
                        var9 = var131 * var9;
                        long var11 = var131 + 2L;
                        var9 *= var11;
                        long var132 = var131 + 3L;
                        var9 *= var132;
                        long var133 = var9 & 7L;
                        long var162;
                        int var134 = (var162 = var133 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                        if (var134 != 0) {
                            var3 ^= -1266753487;
                            var3 *= 1078140907;
                            var3 ^= 1226746078;
                            break label117;
                        }
                        var3 = switch (var3) {
                            case 862530789 -> var3 ^ 1375094602;
                            case 1672753328 -> {
                                var3 ^= 557901124;
                                var3 >>>= 3;
                                var3 >>= 7;
                                yield var3 ^ 1269066092;
                            }
                            default -> var3 ^ -1111548845;
                        };
                        long var135 = var3;
                        var9 = var135 + 1L;
                        var9 = var135 * var9;
                        long var136 = var9 & 1L;
                        long var163;
                        var134 = (var163 = var136 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                        if (var134 != 0) {
                            break label113;
                        }

                        var100 = var113;
                        switch (var3) {
                            case -47992869:
                            default:
                                var3 ^= -1834195901;
                                break;
                            case 343676254:
                                var3 ^= -1889098935;
                                break;
                            case 1270142041:
                                var3 &= -1436498920;
                                var3 ^= -17799726;
                        }
                    } else {
                        var3 = switch (var3) {
                            case -1272358078 -> {
                                var3 &= -1921970977;
                                var3 -= -118428058;
                                var3 += 314117327;
                                yield var3 ^ 473025931;
                            }
                            default -> var3 ^ 20033321;
                            case 2033346166 -> var3 ^ -1172368073;
                        };
                        long var114 = var3;
                        long var143 = var114 + 1L;
                        var143 = var114 * var143;
                        long var157 = var114 + 2L;
                        var143 *= var157;
                        long var115 = var114 + 3L;
                        var143 *= var115;
                        long var116 = var143 & 7L;
                        long var164;
                        var6 = (var164 = var116 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label113;
                        }

                        long var118 = this.r;
                        long var119 = var1 - var118;
                        Integer var147 = var4;
                        if (var147 == null) {
                            switch (var3) {
                                case -2116490464:
                                    var3 += -600122108;
                                    var3 -= -1304529921;
                                    var3 &= -1871530494;
                                    var3 ^= -1317094987;
                                    break label117;
                                case -62777416:
                                    var3 ^= 59600968;
                                    break label117;
                                case 869618545:
                                default:
                                    var3 ^= 1610213804;
                                    break label117;
                            }
                        }

                        var3 *= -1189735871;
                        var3 &= 108664193;
                        var3 ^= 193918796;
                        float var120 = (float)var119;
                        float var121 = var120 / 1.0E9F;
                        var100 = var121;
                        var3 *= 824913937;
                        var3 -= -920469620;
                        var3 += -1027736784;
                        var3 += 61708541;
                        var3 ^= -997261721;
                    }
                }

                long var122 = var3;
                long var148 = var122 + 1L;
                var148 = var122 * var148;
                long var158 = var122 + 2L;
                var148 *= var158;
                long var123 = var122 + 3L;
                var148 *= var123;
                long var124 = var148 & 7L;
                long var165;
                var6 = (var165 = var124 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
                if (var6 == 0) {
                    this.r = var1;
                    float var101 = Math.max(var100, 0.0F);
                    float var126 = this.Cm;
                    float var102 = Math.min(var101, var126);
                    float var127 = this.n;
                    int var138 = var4 + 1;
                    var138 = var4 * var138;
                    var4 = var138 & 1;
                    if (var4 != 0) {
                        var3 &= 1260003437;
                        var3 *= 1574503285;
                        var3 |= 1301549068;
                        var3 ^= -856083111;
                        break label117;
                    }

                    var3 |= -1534491740;
                    var3 *= 674666227;
                    var3 *= -1338999009;
                    var3 ^= -1291880675;
                    Integer var84 = var3;
                    if (var84 != null) {
                        float var85 = var102 * var127;
                        this.u = var85;
                        double var86 = this.lT;
                        float var128 = this.u;
                        double var129 = var128;
                        double var87 = var86 + var129;
                        this.lT = var87;
                        long var88 = this.MU;
                        this.MU = ++var88;
                        return;
                    }
                }
            }

            IllegalStateException var90 = new IllegalStateException();
            throw var90;
        } else {
            var3 += 558254052;
            var3 += 699181753;
            var3 ^= 1821963579;
        }

        IllegalArgumentException var82 = new IllegalArgumentException();
        throw var82;
    }

    public float A() {
        int var1 = A;
        var1 ^= -1347455379;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -884114172:
                default:
                    var1 ^= -744713550;
                    break;
                case -621596623:
                    var1 ^= -1793129632;
                    break;
                case 1480634163:
                    var1 &= 125163446;
                    var1 ^= -1708187139;
            }

            return this.u;
        } else {
            var1 -= 810466325;
            var1 ^= -116548055;
            IllegalStateException var7 = new IllegalStateException();
            throw var7;
        }
    }

    public double pl() {
        int var1 = A;
        var1 ^= -1260728130;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 == null) {
            var1 -= 1360505489;
            var1 += -730799767;
            var1 <<= 23;
            var1 += 1740367272;
            var1 ^= 1005477332;
            AssertionError var17 = new AssertionError();
            throw var17;
        } else {
            switch (var1) {
                case -1389721859:
                default:
                    var1 ^= 978763931;
                    break;
                case 579125138:
                    var1 ^= 417827555;
                    break;
                case 1127549408:
                    var1 -= 1790158363;
                    var1 -= 1775145812;
                    var1 += 417125298;
                    var1 &= -2067838549;
                    var1 ^= 303908551;
            }

            return this.lT;
        }
    }

    public long P() {
        int var1 = A;
        var1 ^= 818471569;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var27;
        var2 = (var27 = var19 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1773942722;
            var1 += -1478882713;
            var1 += -144710129;
            var1 += 1219466095;
            var1 ^= 36544711;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var1 &= 1192051947;
            var1 ^= -249508775;
            long var14 = var1;
            long var3 = var14 + 1L;
            var3 = var14 * var3;
            long var15 = var3 & 1L;
            long var28;
            var1 = (var28 = var15 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.MU;
            }
        }

        AssertionError var17 = new AssertionError();
        throw var17;
    }

    public void qo(float var1) {
        int var2 = A;
        var2 ^= 394872679;
        int var3 = System.identityHashCode(this);
        float var4 = Math.max(0.0F, var1);
        Integer var16 = var3;
        if (var16 == null) {
            switch (var2) {
                case -2050972539:
                    var2 ^= 2098226040;
                    break;
                case -530145735:
                    var2 &= 2114241975;
                    var2 ^= 1815315008;
                    break;
                case 325796194:
                default:
                    var2 ^= 659594369;
            }

            IllegalArgumentException var17 = new IllegalArgumentException();
            throw var17;
        } else {
            var2 *= 1308924453;
            var2 -= 1210977554;
            var2 *= -1758491011;
            var2 ^= 19228419;
            Integer var10 = var2;
            if (var10 == null) {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            } else {
                this.n = var4;
            }
        }
    }

    public void Ro(float var1) {
        int var2 = A;
        var2 ^= 2039106067;
        int var3 = System.identityHashCode(this);
        float var4 = Math.max(0.001F, var1);
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 != 0) {
            var2 >>= 7;
            var2 *= -1801454241;
            var2 *= -579315497;
            var2 ^= 1909750618;
            Integer var25 = var2;
            if (var25 != null) {
                AssertionError var26 = new AssertionError();
                throw var26;
            }
        } else {
            var2 *= 378800039;
            var2 >>>= 1;
            var2 <<= 21;
            var2 ^= -2026124825;
            var2 ^= -1853272251;
            long var19 = var2;
            long var28 = var19 + 1L;
            long var29 = var19 * var28;
            long var7 = var19 + 2L;
            long var30 = var29 * var7;
            long var20 = var19 + 3L;
            long var31 = var30 * var20;
            long var21 = var31 & 7L;
            long var32;
            var2 = (var32 = var21 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                this.Cm = var4;
                return;
            }
        }

        RuntimeException var23 = new RuntimeException();
        throw var23;
    }

    public void v(float var1) {
        int var2 = A;
        var2 ^= -1676733676;
        int var3 = System.identityHashCode(this);
        Integer var16 = var3;
        if (var16 != null) {
            var2 *= 1558966803;
            var2 ^= -157961375;
            var2 &= 144096918;
            var2 ^= -810984157;
            var2 ^= -1128752444;
            this.hl = var1;
        } else {
            var2 ^= 1944305337;
            var2 ^= -1616590007;
            var2 ^= 1288665889;
            Integer var8 = var2;
            if (var8 == null) {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            } else {
                AssertionError var9 = new AssertionError();
                throw var9;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -908215623;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        A = var4;
    }
}
