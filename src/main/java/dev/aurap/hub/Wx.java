package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class Wx {
    private final float[] D;
    private final float[] b;
    private g_2 qb;
    private float g;
    private float Ol;
    public static final int qG;

    public Wx() {
        float[] var1 = new float[8];
        this.D = var1;
        var1 = new float[8];
        this.b = var1;
        this.Ol = 1.0F;
    }

    public void lm(g_2 var1, float var2) {
        label103: {
            int var3 = qG;
            var3 ^= 1563522258;
            int var4 = System.identityHashCode(this);
            float[] var5 = var1.s();
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            int var7 = of_2.EM;
            var3 ^= var7;
            var3 ^= -1767770242;
            var7 = of_2.Hi;
            var3 ^= var7;
            var3 ^= 1545382391;
            if (var6 != 0) {
                var3 >>>= 3;
                var3 ^= 1518534930;
            } else {
                label113: {
                    var3 = switch (var3) {
                        case -118693522 -> {
                            var3 += -54332846;
                            var3 ^= -1939624891;
                            var3 >>= 11;
                            var3 <<= 30;
                            yield var3 ^ -1855798431;
                        }
                        default -> var3 ^ -915647481;
                        case 1659464100 -> var3 ^ -353435910;
                    };
                    if (var5 != null) {
                        var3 >>= 19;
                        var3 += -1419803155;
                        var3 += 1966915158;
                        var3 ^= 1808798145;
                        float[] var92 = this.b;
                        float[] var99 = this.b;
                        var7 = var99.length;
                        long var8 = var4;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var148;
                        int var118 = (var148 = var8 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                        if (var118 != 0) {
                            var3 |= -133354461;
                            var3 *= 1544318249;
                            var3 &= 1605272487;
                            var3 &= 1866083684;
                            var3 ^= 1270127931;
                            break label113;
                        }

                        var3 *= -1475765457;
                        var3 >>= 10;
                        var3 *= -1232616993;
                        var3 &= 608954826;
                        var3 ^= -376502948;
                        var8 = var3;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var149;
                        int var121 = (var149 = var8 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                        if (var121 != 0) {
                            break label103;
                        }

                        System.arraycopy(var5, 0, var92, 0, var7);
                        switch (var3) {
                            case -1283337942:
                                var3 ^= -1185284485;
                                break;
                            case -951901719:
                            default:
                                var3 ^= 828039424;
                                break;
                            case -305306338:
                                var3 -= 1350764179;
                                var3 ^= -1320277582;
                        }
                    } else {
                        var3 -= -158523314;
                        var3 ^= 1651790512;
                        var5 = this.D;
                        float[] var93 = this.b;
                        float[] var101 = this.b;
                        var7 = var101.length;
                        System.arraycopy(var5, 0, var93, 0, var7);
                        var5 = var1.Mj();
                        var5 = var5;
                        int var94 = 3;
                        long var103 = var4;
                        long var9 = var103 + 1L;
                        var9 = var103 * var9;
                        long var11 = var103 + 2L;
                        var9 *= var11;
                        long var104 = var103 + 3L;
                        var9 *= var104;
                        long var105 = var9 & 7L;
                        long var150;
                        var7 = (var150 = var105 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var3 &= -394714650;
                            var3 *= 1520157581;
                            var3 &= 1815031196;
                            var3 ^= 1639821607;
                            break label113;
                        }

                        var3 |= 163416714;
                        var3 |= -702709796;
                        var3 &= -1869255492;
                        var3 &= -746070107;
                        var3 ^= -1935384524;
                        var7 = var3 + 1;
                        var7 = var3 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label103;
                        }

                        var94 = var94;
                        var3 *= -644895383;
                        var3 &= -1657880382;
                        var3 ^= -1736137289;

                        while (true) {
                            long var110 = var3;
                            var9 = var110 + 1L;
                            var9 = var110 * var9;
                            var11 = var110 + 2L;
                            var9 *= var11;
                            long var111 = var110 + 3L;
                            var9 *= var111;
                            long var112 = var9 & 7L;
                            long var151;
                            var7 = (var151 = var112 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label103;
                            }

                            if (var94 >= 8) {
                                var3 -= -1201898639;
                                var3 ^= 1967906175;
                                break;
                            }
                            var3 = switch (var3) {
                                case 296494519 -> {
                                    var3 <<= 9;
                                    var3 >>>= 30;
                                    yield var3 ^ 1639552724;
                                }
                                case 914145809 -> var3 ^ -308291759;
                                default -> var3 ^ -35760540;
                            };
                            Integer var114 = var3;
                            if (var114 == null) {
                                break label103;
                            }

                            float[] var115 = this.b;
                            float var122 = var115[var94];
                            float[] var131 = this.b;
                            float var132 = var131[var94];
                            float var141 = var5[var94];
                            float var133 = var132 - var141;
                            float var134 = var133 / 360.0F;
                            Integer var142 = var4;
                            if (var142 == null) {
                                switch (var3) {
                                    case -1110948533:
                                    default:
                                        var3 ^= -1980554056;
                                        break label113;
                                    case -461630064:
                                        var3 ^= -344498722;
                                        break label113;
                                    case 1639552725:
                                        var3 <<= 21;
                                        var3 ^= -1557266080;
                                        var3 ^= 1007721567;
                                        break label113;
                                }
                            }

                            var3 >>= 3;
                            var3 &= 1178965620;
                            var3 ^= 1324976500;
                            var3 &= -149508634;
                            var3 ^= 441817719;
                            long var143 = var3;
                            long var12 = var143 + 1L;
                            var12 = var143 * var12;
                            long var144 = var12 & 1L;
                            long var152;
                            int var145 = (var152 = var144 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                            if (var145 != 0) {
                                break label103;
                            }

                            int var135 = Math.round(var134);
                            float var136 = var135;
                            float var137 = 360.0F * var136;
                            var122 -= var137;
                            var115[var94] = var122;
                            int var116 = var94 + 1;
                            var94 = var116;
                            var3 >>= 26;
                            var3 += -1651359897;
                            var3 -= -1998602942;
                            var3 &= 1531588096;
                            var3 ^= 28190647;
                        }
                    }

                    Integer var88 = var3;
                    if (var88 == null) {
                        break label103;
                    }

                    this.qb = var1;
                    float var89 = Math.max(0.05F, var2);
                    this.Ol = var89;
                    Integer var79 = var4;
                    if (var79 != null) {
                        var3 >>= 8;
                        var3 >>>= 12;
                        var3 += -2025083820;
                        var3 ^= -672483355;
                        this.g = 0.0F;
                        float[] var74 = this.b;
                        float[] var80 = this.D;
                        var1.Z(0.0F, var74, var80);
                        return;
                    }

                    var3 *= 190907337;
                    var3 ^= 2086531918;
                    var3 *= 1540970571;
                    var3 |= 991459049;
                    var3 ^= -1107106862;
                }
            }

            long var81 = var3;
            long var96 = var81 + 1L;
            long var97 = var81 * var96;
            long var82 = var97 & 1L;
            long var153;
            var4 = (var153 = var82 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalArgumentException var84 = new IllegalArgumentException();
                throw var84;
            }
        }

        UnsupportedOperationException var78 = new UnsupportedOperationException();
        throw var78;
    }

    public void LK(float var1) {
        label78: {
            int var2 = qG;
            var2 ^= 1079267362;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                switch (var2) {
                    case -443955810:
                        var2 &= 1153832440;
                        var2 *= -1394186271;
                        var2 ^= 1007469724;
                        var2 |= -374383656;
                        var2 ^= 213346628;
                        break;
                    case -105391140:
                        var2 ^= -1272424365;
                        break;
                    case 1136033390:
                    default:
                        var2 ^= 1024415217;
                }
            } else {
                var2 &= 1979976003;
                var2 ^= 1706528433;
                var2 *= 964827335;
                var2 ^= -1952013925;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label78;
                }

                g_2 var54 = this.qb;
                if (var54 == null) {
                    switch (var2) {
                        case -727065154:
                            var2 ^= -902583607;
                            var2 ^= 60470447;
                            break;
                        case 384789311:
                        default:
                            var2 ^= 1783663273;
                            break;
                        case 1890746323:
                            var2 ^= -1847031012;
                    }

                    return;
                }
                var2 = switch (var2) {
                    case -1797594412 -> var2 ^ 624318983;
                    default -> var2 ^ -1253883815;
                    case -727065154 -> {
                        var2 &= -906087183;
                        yield var2 ^ -899933619;
                    }
                };
                long var55 = var2;
                long var6 = var55 + 1L;
                var6 = var55 * var6;
                long var8 = var55 + 2L;
                var6 *= var8;
                long var56 = var55 + 3L;
                var6 *= var56;
                long var57 = var6 & 7L;
                long var85;
                var4 = (var85 = var57 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label78;
                }

                float var59 = this.g;
                float var72 = this.Ol;
                float var73 = var1 * var72;
                float var60 = var59 + var73;
                this.g = var60;
                long var61 = var3;
                var6 = var61 + 1L;
                var6 = var61 * var6;
                long var62 = var6 & 1L;
                long var86;
                var4 = (var86 = var62 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                if (var4 != 0) {
                    var2 ^= -1333478324;
                    var2 ^= 1597506601;
                } else {
                    var2 = switch (var2) {
                        default -> var2 ^ -362261932;
                        case -15937577 -> var2 ^ 1708750767;
                        case 183766781 -> {
                            var2 -= -470819888;
                            yield var2 ^ -1197251694;
                        }
                    };
                    long var64 = var2;
                    var6 = var64 + 1L;
                    var6 = var64 * var6;
                    long var65 = var6 & 1L;
                    long var87;
                    var4 = (var87 = var65 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label78;
                    }

                    float var67 = this.g;
                    g_2 var74 = this.qb;
                    float var75 = var74.OX();
                    float var88;
                    var4 = (var88 = var67 - var75) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
                    if (var4 >= 0) {
                        var2 &= -2038282809;
                        var2 ^= 971012058;
                        Integer var70 = var2;
                        if (var70 != null) {
                            this.e();
                            return;
                        }
                        break label78;
                    }

                    var2 |= 38958544;
                    var2 ^= 350234492;
                    g_2 var69 = this.qb;
                    float var76 = this.g;
                    Integer var42 = var3;
                    if (var42 != null) {
                        var2 *= -1791339867;
                        var2 ^= 1618224090;
                        int var43 = var2 + 1;
                        var43 = var2 * var43;
                        var43 &= 1;
                        if (var43 == 0) {
                            float[] var46 = this.b;
                            float[] var84 = this.D;
                            var69.Z(var76, var46, var84);
                            return;
                        }
                        break label78;
                    }

                    var2 *= -1658672381;
                    var2 |= -1947918001;
                    var2 += 488316118;
                    var2 >>= 21;
                    var2 ^= 448220112;
                }
            }

            Integer var31 = var2;
            if (var31 != null) {
                IllegalArgumentException var32 = new IllegalArgumentException();
                throw var32;
            }
        }

        AssertionError var41 = new AssertionError();
        throw var41;
    }

    public void e() {
        int var1 = qG;
        var1 ^= 2119073593;
        int var2 = System.identityHashCode(this);
        this.qb = null;
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= -1314354008;
            var1 += 285151039;
            var1 *= 1466160771;
            var1 *= -72385601;
            var1 ^= 1026520508;
            Integer var25 = var1;
            if (var25 != null) {
                this.g = 0.0F;
                float[] var26 = this.D;
                Arrays.fill(var26, 0.0F);
                return;
            }
        } else {
            var1 &= -1459941264;
            var1 += 265233298;
            var1 *= -1187662483;
            var1 ^= 1683911059;
            long var17 = var1;
            long var30 = var17 + 1L;
            long var31 = var17 * var30;
            long var5 = var17 + 2L;
            long var32 = var31 * var5;
            long var18 = var17 + 3L;
            long var33 = var32 * var18;
            long var19 = var33 & 7L;
            long var34;
            var1 = (var34 = var19 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    public g_2 PP() {
        int var1 = qG;
        var1 ^= 1377269751;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            switch (var1) {
                case -541819142:
                default:
                    var1 ^= 7184796;
                    break;
                case -137698741:
                    var1 ^= 300322134;
                    var1 ^= 543961112;
                    break;
                case 1339327719:
                    var1 ^= 1139438893;
            }

            return this.qb;
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 874138235;
                case -137698741 -> {
                    var1 &= -1324848036;
                    yield var1 ^ 73304854;
                }
                case 470223461 -> var1 ^ -1329768825;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            } else {
                AssertionError var9 = new AssertionError();
                throw var9;
            }
        }
    }

    public boolean rY(g_2 var1) {
        int var2 = qG;
        var2 ^= -1777409718;
        int var3 = System.identityHashCode(this);
        g_2 var4 = this.qb;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var49;
        var3 = (var49 = var5 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 ^= 2027002997;
            var2 ^= -1672641815;
            var5 = var2;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var50;
            var3 = (var50 = var5 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
            if (var3 == 0) {
                AssertionError var31 = new AssertionError();
                throw var31;
            }
        } else {
            label33: {
                var2 -= -2096812548;
                var2 <<= 30;
                var2 -= 1581031953;
                var2 -= 1484880124;
                var2 ^= -1563777923;
                int var35;
                if (var4 == var1) {
                    var2 &= -828680928;
                    var2 ^= 1103179260;
                    long var32 = var2;
                    var5 = var32 + 1L;
                    var5 = var32 * var5;
                    long var33 = var5 & 1L;
                    long var51;
                    var35 = (var51 = var33 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
                    if (var35 != 0) {
                        break label33;
                    }

                    var35 = 1;
                    var2 |= 1679518806;
                    var2 &= 739623375;
                    var2 ^= 918928458;
                } else {
                    var2 *= 1532017655;
                    var2 &= 2019036420;
                    var2 |= -1858642253;
                    var2 ^= -735885165;
                    int var36 = var2 + 1;
                    int var37 = var2 * var36;
                    int var38 = var37 & 1;
                    if (var38 != 0) {
                        break label33;
                    }

                    var35 = 0;
                    var2 >>= 15;
                    var2 ^= 450115372;
                }

                int var39 = var2 + 1;
                int var40 = var2 * var39;
                var2 = var40 & 1;
                if (var2 == 0) {
                    return (var35 != 0);
                }
            }
        }

        RuntimeException var28 = new RuntimeException();
        throw var28;
    }

    public float j() {
        int var1 = qG;
        var1 ^= -547324503;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var26;
        var2 = (var26 = var20 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 16345323;
            var1 &= 23706981;
            var1 |= 1448533235;
            var1 ^= -255039078;
            IllegalStateException var22 = new IllegalStateException();
            throw var22;
        } else {
            var1 <<= 6;
            var1 ^= -842100455;
            var1 ^= -200789090;
            Integer var12 = var1;
            if (var12 != null) {
                return this.g;
            } else {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            }
        }
    }

    public float[] sl() {
        int var1 = qG;
        var1 ^= 603237783;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            long var21 = switch (var1) {
                case -2044118997 -> {
                    var1 ^= -104262817;
                    var1 <<= 16;
                    var1 |= -1143043831;
                    yield var1 ^ -1744920270;
                }
                case -1823948513 -> var1 ^ 409042855;
                default -> var1 ^ 226330542;
            };
            long var27 = var21 + 1L;
            long var28 = var21 * var27;
            long var22 = var28 & 1L;
            long var29;
            var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.D;
            }
        } else {
            Integer var16 = switch (var1) {
                case -2044118997 -> {
                    var1 >>>= 12;
                    var1 ^= 151411750;
                    var1 <<= 29;
                    var1 ^= -1967907742;
                    yield var1 ^ -1696806817;
                }
                case 1562466133 -> var1 ^ 1586939290;
                default -> var1 ^ -1400098210;
            };
            if (var16 != null) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public float J(int var1) {
        int var2 = qG;
        var2 ^= 228970846;
        int var4 = System.identityHashCode(this);
        long var18 = var4;
        long var6 = var18 + 1L;
        var6 = var18 * var6;
        long var19 = var6 & 1L;
        long var24;
        var4 = (var24 = var19 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var4 != 0) {
            switch (var2) {
                case -2027349467:
                default:
                    var2 ^= -169899062;
                    break;
                case -1468513054:
                    var2 &= -617814040;
                    var2 ^= -1878721100;
                    break;
                case -1048252326:
                    var2 ^= -502384593;
            }

            var4 = var1 + 1;
            var4 = var1 * var4;
            int var3 = var4 & 1;
            if (var3 != 0) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            } else {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            }
        } else {
            var2 *= 117920163;
            var2 ^= 1098171420;
            float[] var11 = this.D;
            return var11[var1];
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1518584075;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        qG = var4;
    }
}
