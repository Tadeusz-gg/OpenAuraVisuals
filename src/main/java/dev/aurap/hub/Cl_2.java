package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Cl_2 {
    TOP_LEFT(0.0F, 0.0F),
    TOP_CENTER(0.5F, 0.0F),
    TOP_RIGHT(1.0F, 0.0F),
    CENTER_LEFT(0.0F, 0.5F),
    CENTER(0.5F, 0.5F),
    CENTER_RIGHT(1.0F, 0.5F),
    BOTTOM_LEFT(0.0F, 1.0F),
    BOTTOM_CENTER(0.5F, 1.0F),
    BOTTOM_RIGHT(1.0F, 1.0F);

    public final float fx;
    public final float fy;
    public static final int BF;

    private Cl_2(float var3, float var4) {
        this.fx = var3;
        this.fy = var4;
    }

    public float fx() {
        int var1 = BF;
        var1 ^= -2134363667;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.dq;
        var1 ^= var3;
        var1 ^= 1054152787;
        of_2.dq = 1054152787;
        var3 = of_2.bW;
        var1 ^= var3;
        var1 ^= 1588277462;
        of_2.bW = 1588277462;
        if (var2 == 0) {
            var1 *= 1431560061;
            var1 ^= -333004719;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.fx;
            }
        } else {
            var1 *= -2005512525;
            var1 &= -713307840;
            var1 ^= -1672167229;
            Integer var15 = var1;
            if (var15 != null) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    public float fy() {
        int var1 = BF;
        var1 ^= -1039211069;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        int var3 = of_2.dq;
        var1 ^= var3;
        var1 ^= 1054152787;
        var3 = of_2.bW;
        var1 ^= var3;
        var1 ^= 1588277462;
        if (var20 != null) {
            var1 *= 1453775535;
            var1 += -1721627067;
            var1 ^= -1526521840;
            var20 = var1;
            if (var20 != null) {
                return this.fy;
            }
        } else {
            var1 += -183505864;
            var1 *= 1368887837;
            var1 ^= 1877685222;
            var1 ^= 109927201;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            var3 = var1 + 2;
            var22 *= var3;
            var1 += 3;
            var22 *= var1;
            var1 = var22 & 7;
            if (var1 == 0) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    public static Cl_2 gJ(float var0, float var1) {
        label134: {
            int var45;
            var45 = BF;
            var45 ^= 1267536294;
            int var3 = (int)var0;
            Integer var4 = var3;
            label133:
            if (var4 != null) {
                var45 *= 57686005;
                var45 *= 1321239373;
                var45 *= -1000485687;
                var45 &= -1118265838;
                var45 ^= 1360513403;
                float var178;
                int var106 = (var178 = var0 - 0.33333334F) == 0.0F ? 0 : (var178 < 0.0F ? -1 : 1);
                byte var107;
                if (var106 < 0) {
                    var45 *= 1548314861;
                    var45 <<= 13;
                    var45 |= 196896350;
                    var45 += -1165579747;
                    var45 ^= -668839194;
                    var107 = 0;
                    var45 ^= 1643958953;
                    var45 ^= -1233803147;
                    var45 -= 1984755275;
                    var45 &= 1006548458;
                    var45 ^= -510231102;
                } else {
                    var45 -= 973000524;
                    var45 -= -801947707;
                    var45 -= 712165703;
                    var45 ^= -1459598408;
                    long var5 = var45;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var179;
                    int var110 = (var179 = var5 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                    if (var110 != 0) {
                        break label134;
                    }

                    float var180;
                    int var111 = (var180 = var0 - 0.6666667F) == 0.0F ? 0 : (var180 < 0.0F ? -1 : 1);
                    int var6 = var3 + 1;
                    var6 = var3 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        var45 += -198476649;
                        var45 &= 1423781703;
                        var45 <<= 10;
                        var45 ^= -610185749;
                        break label133;
                    }

                    var45 ^= -628807716;
                    var45 |= 1088545743;
                    var45 &= 868366341;
                    var45 ^= -1310823162;
                    long var134 = var45;
                    long var8 = var134 + 1L;
                    var8 = var134 * var8;
                    long var10 = var134 + 2L;
                    var8 *= var10;
                    long var135 = var134 + 3L;
                    var8 *= var135;
                    long var136 = var8 & 7L;
                    long var181;
                    var6 = (var181 = var136 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label134;
                    }

                    if (var111 < 0) {
                        var45 += 1330414609;
                        var45 += 829382987;
                        var45 ^= 2092245218;
                        var107 = 1;
                        switch (var45) {
                            case -846845276:
                                var45 ^= 1832159367;
                                break;
                            case 599777162:
                            default:
                                var45 ^= 1002833265;
                                break;
                            case 2104300221:
                                var45 |= 1735121536;
                                var45 ^= -1547009684;
                                var45 ^= 533964785;
                        }
                    } else {
                        var45 = switch (var45) {
                            case -2128851709 -> {
                                var45 ^= 192413387;
                                var45 *= -30253817;
                                yield var45 ^ 176488580;
                            }
                            default -> var45 ^ 1841208842;
                            case 1383587285 -> var45 ^ 84200987;
                        };
                        var5 = var45;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var182;
                        int var114 = (var182 = var5 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                        if (var114 != 0) {
                            break label134;
                        }

                        var107 = 2;
                        var45 <<= 20;
                        var45 ^= -323552224;
                    }
                }

                int var115 = var45 + 1;
                var115 = var45 * var115;
                int var138 = var45 + 2;
                var115 *= var138;
                var138 = var45 + 3;
                var115 *= var138;
                var115 &= 7;
                if (var115 != 0) {
                    break label134;
                }

                var115 = var3 + 1;
                var115 = var3 * var115;
                var138 = var3 + 2;
                var115 *= var138;
                var138 = var3 + 3;
                var115 *= var138;
                var115 &= 7;
                if (var115 != 0) {
                    switch (var45) {
                        case -1279724261:
                            var45 ^= 1026690264;
                            break;
                        case -1015612384:
                            var45 >>= 19;
                            var45 ^= -348034147;
                            var45 ^= -1155279336;
                            break;
                        case 314921563:
                        default:
                            var45 ^= 356360881;
                    }
                } else {
                    label139: {
                        var45 -= 146962109;
                        var45 &= -333896548;
                        var45 ^= 1911034945;
                        var115 = var45 + 1;
                        var115 = var45 * var115;
                        var115 &= 1;
                        if (var115 != 0) {
                            break label134;
                        }

                        float var183;
                        var115 = (var183 = var1 - 0.33333334F) == 0.0F ? 0 : (var183 < 0.0F ? -1 : 1);
                        byte var130;
                        if (var115 < 0) {
                            var45 ^= -1606518106;
                            var45 *= 1711611103;
                            var45 -= -1695503365;
                            var45 ^= 642649869;
                            Integer var129 = var45;
                            if (var129 == null) {
                                break label134;
                            }

                            var130 = 0;
                            var45 ^= 429664574;
                            var45 ^= 704239410;
                            var45 *= -1885168277;
                            var45 += -1739222556;
                            var45 ^= -1460682634;
                        } else {
                            var45 &= -1069073936;
                            var45 *= 1445759277;
                            var45 &= -1434542021;
                            var45 ^= -98288699;
                            float var184;
                            var138 = (var184 = var1 - 0.6666667F) == 0.0F ? 0 : (var184 < 0.0F ? -1 : 1);
                            int var158 = var3 + 1;
                            var158 = var3 * var158;
                            int var173 = var3 + 2;
                            var158 *= var173;
                            var173 = var3 + 3;
                            var158 *= var173;
                            var158 &= 7;
                            if (var158 != 0) {
                                switch (var45) {
                                    case -924781742:
                                        var45 ^= -1879598754;
                                        break label139;
                                    case -263177275:
                                        var45 ^= -2118227200;
                                        var45 &= 1236236392;
                                        var45 ^= 1104789576;
                                        var45 ^= -1343564317;
                                        break label139;
                                    case -34371996:
                                    default:
                                        var45 ^= -322448639;
                                        break label139;
                                }
                            }

                            var45 &= -1635754644;
                            var45 -= -131887155;
                            var45 ^= 465178486;
                            var158 = var45 + 1;
                            var158 = var45 * var158;
                            var158 &= 1;
                            if (var158 != 0) {
                                break label134;
                            }

                            if (var138 < 0) {
                                var45 <<= 17;
                                var45 -= 1344503031;
                                var45 += 339978158;
                                var45 ^= 2102228327;
                                long var143 = var45;
                                long var175 = var143 + 1L;
                                long var176 = var143 * var175;
                                long var144 = var176 & 1L;
                                long var185;
                                var138 = (var185 = var144 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                                if (var138 != 0) {
                                    break label134;
                                }

                                var130 = 1;
                                var45 |= 1396585864;
                                var45 ^= -982503785;
                            } else {
                                var45 &= 1712050206;
                                var45 <<= 20;
                                var45 ^= 530896006;
                                var138 = var45 + 1;
                                var138 = var45 * var138;
                                var158 = var45 + 2;
                                var138 *= var158;
                                var158 = var45 + 3;
                                var138 *= var158;
                                var138 &= 7;
                                if (var138 != 0) {
                                    break label134;
                                }

                                var130 = 2;
                                var45 -= -1145395393;
                                var45 ^= 1386868149;
                                var45 *= -173505219;
                                var45 ^= 764808684;
                                var45 ^= 1051455241;
                            }
                        }

                        var138 = var45 + 1;
                        var138 = var45 * var138;
                        var138 &= 1;
                        if (var138 != 0) {
                            break label134;
                        }

                        Cl_2[] var154 = values();
                        var130 *= 3;
                        long var168 = var3;
                        long var9 = var168 + 1L;
                        var9 = var168 * var9;
                        var168 = var9 & 1L;
                        long var186;
                        var3 = (var186 = var168 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            Integer var100 = switch (var45) {
                                case -882897734 -> var45 ^ -939572794;
                                default -> var45 ^ 452093489;
                                case 974082383 -> {
                                    var45 |= 957929703;
                                    var45 *= 2027062893;
                                    var45 &= 1095762390;
                                    var45 |= 484717290;
                                    yield var45 ^ 798363323;
                                }
                            };
                            if (var100 != null) {
                                int var101 = var130 + var107;
                                return var154[var101];
                            }
                            break label134;
                        }

                        var45 >>= 14;
                        var45 ^= -1348620842;
                    }
                }
            } else {
                var45 -= -896098736;
                var45 |= -1328791813;
                var45 -= -1986877441;
                var45 *= -1007438399;
                var45 ^= -878521621;
            }

            var3 = var45 + 1;
            var3 = var45 * var3;
            int var108 = var45 + 2;
            var3 *= var108;
            var45 += 3;
            var3 *= var45;
            var45 = var3 & 7;
            if (var45 == 0) {
                IllegalArgumentException var98 = new IllegalArgumentException();
                throw var98;
            }
        }

        UnsupportedOperationException var97 = new UnsupportedOperationException();
        throw var97;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1472395124;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        BF = var4;
    }
}
