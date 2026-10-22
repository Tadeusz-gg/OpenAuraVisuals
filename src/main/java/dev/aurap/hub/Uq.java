package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Locale;

public final class Uq extends xB {
    private final float Z;
    private final float Q;
    private final float X;
    private float pT;
    private String N = "";
    private float l;
    public static final int kW;

    public Uq(String var1, String var2, float var3, float var4, float var5) {
        super(var1, var2);
        float var10;
        int var6 = (var10 = var4 - var5) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
        if (var6 >= 0) {
            IllegalArgumentException var9 = new IllegalArgumentException("min must be < max");
            throw var9;
        } else {
            this.Z = var4;
            this.Q = var5;
            this.pT = 0.0F;
            float var7 = TP.t(var3, var4, var5);
            this.X = var7;
            float var8 = this.X;
            this.l = var8;
        }
    }

    public Uq W(float var1) {
        int var2 = kW;
        var2 ^= 568267881;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        var4 = of_2.i;
        var2 ^= var4;
        var2 ^= 563708667;
        var4 = of_2.L;
        var2 ^= var4;
        var2 ^= 884980270;
        if (var3 == 0) {
            var2 ^= -168529757;
            var2 &= -58866939;
            var2 ^= -1560367895;
            long var27 = var2;
            long var44 = var27 + 1L;
            long var45 = var27 * var44;
            long var7 = var27 + 2L;
            long var46 = var45 * var7;
            long var28 = var27 + 3L;
            long var47 = var46 * var28;
            long var29 = var47 & 7L;
            long var48;
            var3 = (var48 = var29 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var3 == 0) {
                float var31 = Math.max(0.0F, var1);
                this.pT = var31;
                float var32 = this.l;
                var4 = var2 | 990264835;
                var4 += -905582209;
                var4 ^= -1937198538;
                float var33 = this.o(var32, var4);
                this.l = var33;
                return this;
            }
        } else {
            var2 *= -1397970331;
            var2 >>= 3;
            var2 |= 1055753221;
            var2 *= -451272835;
            var2 ^= -146238356;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        }

        UnsupportedOperationException var23 = new UnsupportedOperationException();
        throw var23;
    }

    public Uq L(String var1) {
        int var2 = kW;
        var2 ^= 1680927193;
        int var3 = System.identityHashCode(this);
        Integer var15 = var3;
        if (var15 == null) {
            var2 -= 645775883;
            var2 *= 741474137;
            var2 ^= -1598620911;
            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        } else {
            var2 |= 181488114;
            var2 &= -6120647;
            var2 &= 479195991;
            var2 += -1552078657;
            var2 ^= -199833407;
            Integer var10 = var2;
            if (var10 != null) {
                this.N = var1;
                return this;
            } else {
                RuntimeException var11 = new RuntimeException();
                throw var11;
            }
        }
    }

    public float WM() {
        int var1 = kW;
        var1 ^= -771374130;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.i;
        var1 ^= var3;
        var1 ^= 563708667;
        of_2.i = 563708667;
        var3 = of_2.L;
        var1 ^= var3;
        var1 ^= 884980270;
        of_2.L = 884980270;
        if (var2 == 0) {
            var1 <<= 22;
            var1 |= 489375063;
            var1 ^= -1822321211;
            Integer var18 = var1;
            if (var18 == null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            } else {
                return this.l;
            }
        } else {
            var1 ^= -1574797689;
            var1 ^= -988357733;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public int B() {
        int var1 = kW;
        var1 ^= -97261857;
        int var2 = System.identityHashCode(this);
        float var3 = this.l;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 != 0) {
            var1 += 532401818;
            var1 &= 839549937;
            var1 ^= 1216364595;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            } else {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            var1 *= -43471003;
            var1 |= 478942616;
            var1 -= -2033345193;
            var1 ^= 36096800;
            return Math.round(var3);
        }
    }

    public void Bi(float var1) {
        label41: {
            int var2 = kW;
            var2 ^= -120151890;
            int var3 = System.identityHashCode(this);
            int var4 = var2 + 465762834;
            var4 >>>= 26;
            var4 >>>= 6;
            var4 -= 2142997153;
            var4 ^= 1187556871;
            float var40 = this.o(var1, var4);
            float var5 = this.l;
            float var58;
            int var47 = (var58 = var40 - var5) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
            int var6 = var3 + 1;
            var6 = var3 * var6;
            var6 &= 1;
            if (var6 != 0) {
                var2 ^= 941132054;
                var2 ^= 1464228494;
                var2 -= -842354940;
                var2 ^= -128069899;
            } else {
                var2 = switch (var2) {
                    default -> var2 ^ -492727134;
                    case -117636101 -> {
                        var2 += -1048453381;
                        var2 &= -1706195857;
                        var2 |= 264082280;
                        yield var2 ^ 144704934;
                    }
                    case 1705057781 -> var2 ^ -1575169470;
                };
                var6 = var2 + 1;
                var6 = var2 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    break label41;
                }

                if (var47 == 0) {
                    var2 ^= -833742592;
                    var2 ^= 184338710;
                    long var49 = var2;
                    long var7 = var49 + 1L;
                    var7 = var49 * var7;
                    long var50 = var7 & 1L;
                    long var59;
                    int var51 = (var59 = var50 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                    if (var51 == 0) {
                        return;
                    }
                    break label41;
                }

                var2 |= -104982247;
                var2 |= -711138013;
                var2 ^= -232104018;
                this.l = var40;
                var4 = var3 + 1;
                var4 = var3 * var4;
                int var48 = var3 + 2;
                var4 *= var48;
                var3 += 3;
                var4 *= var3;
                var3 = var4 & 7;
                if (var3 == 0) {
                    var2 &= -301788254;
                    var2 &= -460412272;
                    var2 ^= 1632184801;
                    this.lU();
                    return;
                }

                var2 &= 1536664092;
                var2 ^= 940658622;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                UnsupportedOperationException var34 = new UnsupportedOperationException();
                throw var34;
            }
        }

        UnsupportedOperationException var35 = new UnsupportedOperationException();
        throw var35;
    }

    public void U(float var1) {
        int var2 = kW;
        var2 ^= -1664836761;
        int var3 = System.identityHashCode(this);
        float var4 = this.Z;
        float var5 = this.Q;
        float var6 = TP.S(var1);
        var4 = TP.GO(var4, var5, var6);
        long var25 = var3;
        long var7 = var25 + 1L;
        var7 = var25 * var7;
        long var9 = var25 + 2L;
        var7 *= var9;
        long var26 = var25 + 3L;
        var7 *= var26;
        long var27 = var7 & 7L;
        long var31;
        var3 = (var31 = var27 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var3 == 0) {
            switch (var2) {
                case -1662044110:
                    var2 *= -538125663;
                    var2 >>= 3;
                    var2 ^= 845634010;
                    break;
                case 1189458921:
                default:
                    var2 ^= 371477815;
                    break;
                case 1405975778:
                    var2 ^= -1628298415;
            }

            this.Bi(var4);
        } else {
            Integer var15 = switch (var2) {
                case -1662044110 -> {
                    var2 &= -248239073;
                    var2 *= -689292717;
                    yield var2 ^ -1885170764;
                }
                default -> var2 ^ -2111545452;
                case 2098608080 -> var2 ^ -1230817565;
            };
            if (var15 != null) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            } else {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }
    }

    public float MU() {
        int var1 = kW;
        var1 ^= 376872191;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 |= 220191804;
            var1 -= -1669142481;
            var1 ^= -73240607;
            int var16 = var1 + 1;
            var16 = var1 * var16;
            int var23 = var1 + 2;
            var16 *= var23;
            var23 = var1 + 3;
            var16 *= var23;
            var16 &= 7;
            if (var16 != 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            } else {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            switch (var1) {
                case -395422785:
                    var1 ^= -1590827749;
                    break;
                case -134169231:
                default:
                    var1 ^= 784323054;
                    break;
                case 375209898:
                    var1 >>>= 10;
                    var1 &= 1010495846;
                    var1 ^= -1502754105;
            }

            float var10 = this.Z;
            float var15 = this.Q;
            float var3 = this.l;
            return TP.q(var10, var15, var3);
        }
    }

    public float g() {
        int var1 = kW;
        var1 ^= -1372385235;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var25;
        var2 = (var25 = var20 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 1808822773;
            var1 -= 336444650;
            var1 ^= 1380572823;
            return this.Z;
        } else {
            var1 &= -832135926;
            var1 |= 253522981;
            var1 ^= 467737343;
            Integer var12 = var1;
            if (var12 == null) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        }
    }

    public float li() {
        int var1 = kW;
        var1 ^= -1667529223;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= -360355858;
            var1 &= 906650308;
            var1 >>>= 6;
            var1 ^= 1904555660;
            return this.Q;
        } else {
            var1 &= 379654392;
            var1 >>= 7;
            var1 <<= 29;
            var1 ^= -1021609215;
            long var10 = var1;
            long var24 = var10 + 1L;
            long var25 = var10 * var24;
            long var11 = var25 & 1L;
            long var26;
            var1 = (var26 = var11 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            }
        }
    }

    public float oB() {
        int var1 = kW;
        var1 ^= -1786875377;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 ^= 1648154067;
            var1 *= 1584300475;
            var1 ^= -1295734935;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            } else {
                return this.pT;
            }
        } else {
            var1 *= 538407137;
            var1 ^= -1041576896;
            AssertionError var7 = new AssertionError();
            throw var7;
        }
    }

    public String Wh() {
        int var1 = kW;
        var1 ^= -384478309;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 2116828127;
            var1 *= -1485430665;
            var1 -= -1425131489;
            var1 |= -125937208;
            var1 ^= 2140529901;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.N;
            }
        } else {
            Integer var17 = switch (var1) {
                case -381751090 -> {
                    var1 += -198096618;
                    var1 *= 237385525;
                    var1 += 1154870977;
                    var1 -= 922339303;
                    yield var1 ^ -303228229;
                }
                default -> var1 ^ -1935901195;
                case 1531001227 -> var1 ^ 1990780748;
            };
            if (var17 != null) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public String D() {
        int var1 = kW;
        var1 ^= 1952903533;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var4 = var2 + 3;
        var3 *= var4;
        var3 &= 7;
        if (var3 != 0) {
            var1 |= -1098941322;
            var1 ^= 677069150;
            var1 <<= 26;
            var1 >>>= 7;
            var1 ^= 267201594;
        } else {
            label59: {
                label53: {
                    var1 *= 1062498319;
                    var1 &= 1436472265;
                    var1 ^= 1922530095;
                    var1 += -1115415412;
                    var1 ^= 1095076112;
                    float var52 = this.pT;
                    float var91;
                    var3 = (var91 = var52 - 0.0F) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                    if (var3 <= 0) {
                        var1 <<= 30;
                        var1 ^= -705851386;
                        var3 = var1 + 1;
                        var3 = var1 * var3;
                        var3 &= 1;
                        if (var3 != 0) {
                            break label53;
                        }

                        var3 = 2;
                        var1 >>= 7;
                        var1 ^= -148879649;
                    } else {
                        var1 *= -642544095;
                        var1 -= -2048328298;
                        var1 |= -805957087;
                        var1 ^= -2067215115;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        int var5 = var1 + 2;
                        var4 *= var5;
                        var5 = var1 + 3;
                        var4 *= var5;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label53;
                        }

                        float var66 = this.pT;
                        long var79 = var2;
                        long var7 = var79 + 1L;
                        var7 = var79 * var7;
                        long var80 = var7 & 1L;
                        long var92;
                        var5 = (var92 = var80 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            var1 ^= 222809997;
                            var1 <<= 12;
                            var1 &= 336001362;
                            var1 ^= -297303502;
                            var1 ^= -256967160;
                            break label59;
                        }

                        var1 >>= 13;
                        var1 += -273463014;
                        var1 &= 1896835939;
                        var1 ^= -718842812;
                        var5 = var1 + 1;
                        var5 = var1 * var5;
                        int var6 = var1 + 2;
                        var5 *= var6;
                        var6 = var1 + 3;
                        var5 *= var6;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label53;
                        }

                        double var67 = var66;
                        double var68 = Math.log10(var67);
                        double var69 = -var68;
                        double var70 = var69 - 1.0E-6;
                        double var71 = Math.ceil(var70);
                        var4 = (int)var71;
                        var4 = Math.max(0, var4);
                        var3 = var4;
                        switch (var1) {
                            case -1272875515:
                                var1 >>= 14;
                                var1 -= -1769634925;
                                var1 ^= -1636642547;
                                break;
                            case 1904757834:
                                var1 ^= 321797452;
                                break;
                            case 2080771577:
                            default:
                                var1 ^= -1147972780;
                        }
                    }

                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var4 &= 1;
                    if (var4 == 0) {
                        Locale var77 = Locale.ROOT;
                        String var58 = "%." + var3 + "f";
                        Integer var44 = var2;
                        if (var44 != null) {
                            var1 -= -1349990818;
                            var1 ^= -1288680784;
                            Object[] var45 = new Object[1];
                            float var87 = this.l;
                            Float var88 = var87;
                            var45[0] = var88;
                            String var46 = String.format(var77, var58, var45);
                            String var59 = this.N;
                            return var46 + var59;
                        }

                        var1 += -1535661697;
                        var1 ^= -1787925692;
                        break label59;
                    }
                }

                RuntimeException var47 = new RuntimeException();
                throw var47;
            }
        }

        UnsupportedOperationException var43 = new UnsupportedOperationException();
        throw var43;
    }

    private float o(float var1, int var2) {
        label87: {
            int var35;
            float var51;
            label86: {
                int var4 = System.identityHashCode(this);
                int var5 = (Float.isNaN(var1)) ? 1 : 0;
                int var6 = var4 + 1;
                var6 = var4 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    var35 = var2 | 482571993;
                    var35 *= 1385449025;
                    var35 ^= 621721577;
                } else {
                    var35 = switch (var2) {
                        case -963847336 -> {
                            var35 = var2 | 1016619240;
                            var35 >>>= 25;
                            var35 -= -527770994;
                            yield var35 ^ 280278957;
                        }
                        default -> var2 ^ 1872760397;
                        case 2079649358 -> var2 ^ -540901498;
                    };
                    if (var5 != 0) {
                        var35 >>>= 6;
                        var35 ^= -887329716;
                        var5 = var35 + 1;
                        var5 = var35 * var5;
                        var5 &= 1;
                        if (var5 == 0) {
                            return this.l;
                        }
                        break label87;
                    }

                    var35 -= -1923103650;
                    var35 += -1463912511;
                    var35 |= -1532844354;
                    var35 ^= -661121907;
                    Integer var54 = var35;
                    if (var54 == null) {
                        break label87;
                    }

                    float var55 = this.Z;
                    float var65 = this.Q;
                    float var56 = TP.t(var1, var55, var65);
                    float var66 = this.pT;
                    long var7 = var4;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var86;
                    int var75 = (var86 = var7 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var75 == 0) {
                        var35 = switch (var35) {
                            default -> var35 ^ -713533583;
                            case 1744824798 -> var35 ^ 352171208;
                            case 2000352050 -> {
                                var35 -= 1772542379;
                                var35 &= -215877656;
                                var35 |= 1627734149;
                                var35 &= 764692339;
                                yield var35 ^ 603191856;
                            }
                        };
                        Integer var76 = var35;
                        if (var76 == null) {
                            break label87;
                        }

                        float var87;
                        var6 = (var87 = var66 - 0.0F) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
                        if (var6 <= 0) {
                            var35 |= -848560059;
                            var35 |= 723927765;
                            var35 >>>= 16;
                            var35 ^= 1182396326;
                            var6 = var35 + 1;
                            var6 = var35 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                break label87;
                            }

                            var51 = var56;
                            switch (var35) {
                                case 579072487:
                                    var35 ^= -1727096925;
                                    break label86;
                                case 1182335065:
                                    var35 <<= 14;
                                    var35 |= 732019068;
                                    var35 ^= -59802398;
                                    break label86;
                                case 1750107223:
                                default:
                                    var35 ^= -1552493383;
                                    break label86;
                            }
                        }

                        var35 ^= 1229046809;
                        var35 <<= 12;
                        var35 ^= -1300233675;
                        Integer var68 = var35;
                        if (var68 == null) {
                            break label87;
                        }

                        float var69 = this.Z;
                        float var77 = this.Z;
                        float var78 = var56 - var77;
                        float var8 = this.pT;
                        float var79 = var78 / var8;
                        int var80 = Math.round(var79);
                        float var81 = var80;
                        var8 = this.pT;
                        float var82 = var81 * var8;
                        float var70 = var69 + var82;
                        Integer var48 = var4;
                        if (var48 != null) {
                            var35 = switch (var35) {
                                case -1667980321 -> var35 ^ -510676583;
                                case -713915851 -> {
                                    var35 += 1938354698;
                                    var35 <<= 18;
                                    yield var35 ^ 1766896237;
                                }
                                default -> var35 ^ 851052510;
                            };
                            var51 = this.Z;
                            float var83 = this.Q;
                            var51 = TP.t(var70, var51, var83);
                            var51 = var51;
                            var35 &= 433719870;
                            var35 ^= -1907325006;
                            break label86;
                        }

                        var35 += -2015267037;
                        var35 &= -1401112003;
                        var35 ^= -144227352;
                    } else {
                        var35 *= -82326645;
                        var35 ^= -1603319338;
                    }
                }

                int var52 = var35 + 1;
                int var53 = var35 * var52;
                var35 = var53 & 1;
                if (var35 == 0) {
                    UnsupportedOperationException var44 = new UnsupportedOperationException();
                    throw var44;
                }
                break label87;
            }

            int var57 = var35 + 1;
            var57 = var35 * var57;
            var57 &= 1;
            if (var57 == 0) {
                return var51;
            }
        }

        AssertionError var47 = new AssertionError();
        throw var47;
    }

    public Float US() {
        int var1 = kW;
        var1 ^= -827885854;
        int var2 = System.identityHashCode(this);
        float var3 = this.l;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 == 0) {
            var1 ^= -1680363348;
            var1 ^= 1765774743;
            var1 -= -1096507276;
            var1 <<= 18;
            var1 ^= -1346691497;
            long var30 = var1;
            long var6 = var30 + 1L;
            var6 = var30 * var6;
            long var31 = var6 & 1L;
            long var33;
            var2 = (var33 = var31 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                return var3;
            }
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 2060924177;
                case -829631049 -> {
                    var1 ^= -99161651;
                    var1 -= -1484246673;
                    var1 *= 1797009381;
                    var1 |= 1596789670;
                    yield var1 ^ -1046305737;
                }
                case -63421702 -> var1 ^ -474397799;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        }

        AssertionError var20 = new AssertionError();
        throw var20;
    }

    public void vQ(Float var1) {
        int var2 = kW;
        var2 ^= -1281555531;
        int var3 = System.identityHashCode(this);
        float var4 = var1;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var30;
        var3 = (var30 = var5 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 &= -1252652019;
            var2 |= 384578595;
            var2 *= 1762050371;
            var2 ^= 1248749929;
            var2 ^= -1241325185;
            this.Bi(var4);
        } else {
            var2 -= -1879201945;
            var2 >>>= 4;
            var2 *= 1894875535;
            var2 ^= 441001406;
            Integer var16 = var2;
            if (var16 != null) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }
    }

    public Float cg() {
        int var1 = kW;
        var1 ^= 1548154114;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var29;
        var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 &= -646879882;
            var1 ^= -1211901175;
            var1 ^= -1110850264;
            UnsupportedOperationException var24 = new UnsupportedOperationException();
            throw var24;
        } else {
            var1 ^= -1080599915;
            var1 &= -825026567;
            var1 -= 511143972;
            var1 ^= -549969443;
            long var12 = var1;
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var5 = var12 + 2L;
            var3 *= var5;
            long var13 = var12 + 3L;
            var3 *= var13;
            long var14 = var3 & 7L;
            long var30;
            var1 = (var30 = var14 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 != 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            } else {
                float var16 = this.X;
                return var16;
            }
        }
    }

    @Override
    public Object yW() {
        int var1 = kW;
        var1 ^= 1524082235;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var31;
        var2 = (var31 = var22 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 658973510;
            var1 -= -1144041084;
            var1 ^= 1333445517;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            var1 &= 89426762;
            var1 |= 499971093;
            var1 >>>= 14;
            var1 ^= -278676801;
            Integer var16 = var1;
            if (var16 != null) {
                float var18 = this.l;
                double var19 = var18;
                return var19;
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    @Override
    public boolean YT(Object var1) {
        label58: {
            int var38;
            label57: {
                var38 = kW;
                var38 ^= -475835119;
                int var3 = System.identityHashCode(this);
                Integer var4 = var3;
                if (var4 != null) {
                    var38 &= -366238088;
                    var38 ^= -54034577;
                    boolean var51 = var1 instanceof Number;
                    if (!var51) {
                        var38 |= -1995681916;
                        var38 ^= -1163157181;
                        break label57;
                    }

                    var38 |= 1682735614;
                    var38 *= 1649267763;
                    var38 ^= 1793858333;
                    var38 &= -857822856;
                    var38 ^= 2035019354;
                    var4 = var38;
                    if (var4 == null) {
                        break label58;
                    }

                    Number var53 = (Number)var1;
                    double var5 = var53.doubleValue();
                    boolean var56 = Double.isNaN(var5);
                    long var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var64;
                    int var59 = (var64 = var6 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
                    if (var59 != 0) {
                        var38 &= -706250590;
                        var38 |= -703702421;
                        var38 &= -2146847258;
                        var38 ^= 1095267340;
                    } else {
                        var38 = switch (var38) {
                            case -1963132884 -> var38 ^ 1447793076;
                            case -1325044214 -> {
                                var38 >>= 25;
                                var38 |= -500817983;
                                yield var38 ^ -406970227;
                            }
                            default -> var38 ^ -1427908944;
                        };
                        Integer var60 = var38;
                        if (var60 == null) {
                            break label58;
                        }

                        if (var56) {
                            var38 |= -1464213972;
                            var38 -= -419645863;
                            var38 ^= -191277105;
                            break label57;
                        }

                        var38 += -907183743;
                        var38 ^= -112434415;
                        float var54 = var53.floatValue();
                        Integer var45 = var3;
                        if (var45 != null) {
                            var38 *= -557469475;
                            var38 |= -1127772309;
                            var38 >>= 5;
                            var38 ^= 1547978171;
                            this.Bi(var54);
                            return true;
                        }

                        var38 ^= 1167738039;
                        var38 &= -1692325114;
                        var38 ^= -658354429;
                        var38 ^= 60956783;
                    }
                } else {
                    var38 >>>= 7;
                    var38 ^= -1064938110;
                }

                var3 = var38 + 1;
                var3 = var38 * var3;
                int var55 = var38 + 2;
                var3 *= var55;
                var38 += 3;
                var3 *= var38;
                var38 = var3 & 7;
                if (var38 == 0) {
                    IllegalArgumentException var44 = new IllegalArgumentException();
                    throw var44;
                }
                break label58;
            }

            Integer var46 = var38;
            if (var46 != null) {
                return false;
            }
        }

        IllegalStateException var43 = new IllegalStateException();
        throw var43;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -434647654;
        int var2 = xB.nu;
        int var4 = of_2.ro(var3, var1, var2);
        kW = var4;
    }

    @Override
    public Object a() {
        return this.cg();
    }

    @Override
    public void t(Object var1) {
        this.vQ((Float)var1);
    }

    @Override
    public Object cQ() {
        return this.US();
    }
}
