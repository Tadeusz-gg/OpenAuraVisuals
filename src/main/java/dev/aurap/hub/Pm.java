package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Pm {
    private float zv;
    private float V = 1.0F;
    private float tw = 1.0F;
    public static final int tm;

    public Pm() {
    }

    public void IS() {
        int var1 = tm;
        var1 ^= 1818930150;
        int var2 = System.identityHashCode(this);
        this.zv = 0.0F;
        Integer var14 = var2;
        if (var14 == null) {
            var1 >>= 13;
            var1 += -628327449;
            var1 ^= -961816902;
            var14 = var1;
            if (var14 != null) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            } else {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        } else {
            switch (var1) {
                case -1623938261:
                default:
                    var1 ^= 2062182504;
                    break;
                case -1609998866:
                    var1 |= -1947576673;
                    var1 >>>= 28;
                    var1 -= -302248146;
                    var1 ^= -689590362;
                    var1 ^= 1199146195;
                    break;
                case 1882356841:
                    var1 ^= -122210790;
            }

            this.V = 1.0F;
            this.tw = 1.0F;
        }
    }

    public void nQ(float var1, float var2, float var3) {
        int var4 = tm;
        var4 ^= -820290367;
        int var5 = System.identityHashCode(this);
        float var6 = this.zv;
        var6 += var1;
        this.zv = var6;
        var6 = this.V;
        float var7 = Math.max(0.0F, var2);
        var6 *= var7;
        this.V = var6;
        int var29 = var5 + 1;
        int var30 = var5 * var29;
        var5 = var30 & 1;
        if (var5 != 0) {
            var4 <<= 26;
            var4 += 809893069;
            var4 ^= 2127138423;
            var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            if (var5 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            } else {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            var4 >>>= 20;
            var4 -= 1940491273;
            var4 |= 252576542;
            var4 >>>= 1;
            var4 ^= -573141446;
            float var14 = this.tw;
            float var20 = Math.max(0.0F, var3);
            float var15 = var14 * var20;
            this.tw = var15;
        }
    }

    public boolean LR() {
        int var1 = tm;
        var1 ^= 1877210279;
        int var2 = System.identityHashCode(this);
        float var3 = this.zv;
        var3 = Math.abs(var3);
        Integer var4 = var2;
        if (var4 == null) {
            var1 += 79980039;
            var1 += 129241098;
            var1 |= -1784372795;
            var1 *= -406226495;
            var1 ^= 1072962487;
        } else {
            label88: {
                label68: {
                    var1 = switch (var1) {
                        case -1551891793 -> {
                            var1 -= 1421942906;
                            yield var1 ^ -833365726;
                        }
                        case -82692112 -> var1 ^ -912228794;
                        default -> var1 ^ 1069388403;
                    };
                    int var78 = var1 + 1;
                    var78 = var1 * var78;
                    var78 &= 1;
                    if (var78 == 0) {
                        float var90;
                        int var64 = (var90 = var3 - 1.0E-4F) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
                        if (var64 >= 0) {
                            var1 += -1082977592;
                            var1 ^= -1358533192;
                            break label68;
                        }

                        var1 ^= 1619376229;
                        var1 -= -541542965;
                        var1 ^= 2029659369;
                        var3 = this.V;
                        Integer var81 = var2;
                        if (var81 == null) {
                            var1 += 1434043136;
                            var1 *= 822651965;
                            var1 ^= -214497372;
                            break label88;
                        }

                        var1 ^= 1775766339;
                        var1 += 1006051495;
                        var1 ^= 1882367031;
                        var3 = Math.abs(--var3);
                        float var91;
                        int var68 = (var91 = var3 - 1.0E-4F) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                        if (var68 >= 0) {
                            var1 ^= 222361967;
                            var1 ^= -544112757;
                            break label68;
                        }

                        var1 ^= -2081872442;
                        var1 |= -560264236;
                        var1 *= 1938365343;
                        var1 *= 39847791;
                        var1 ^= -1528034836;
                        int var69 = var1 + 1;
                        int var70 = var1 * var69;
                        int var82 = var1 + 2;
                        int var71 = var70 * var82;
                        var82 = var1 + 3;
                        int var72 = var71 * var82;
                        int var73 = var72 & 7;
                        if (var73 == 0) {
                            var3 = this.tw;
                            var3 = Math.abs(--var3);
                            var82 = var2 + 1;
                            var82 = var2 * var82;
                            var2 = var82 & 1;
                            if (var2 != 0) {
                                switch (var1) {
                                    case -129182615:
                                        var1 &= -1928008968;
                                        var1 &= 1640085601;
                                        var1 ^= 294121810;
                                        break label88;
                                    case 560641770:
                                    default:
                                        var1 ^= 1904695242;
                                        break label88;
                                    case 930168079:
                                        var1 ^= -1204599097;
                                        break label88;
                                }
                            }

                            var1 &= 681592327;
                            var1 ^= 1408048542;
                            var1 ^= 360482280;
                            float var92;
                            var2 = (var92 = var3 - 1.0E-4F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                            if (var2 >= 0) {
                                switch (var1) {
                                    case 40520251:
                                        var1 ^= 601429573;
                                        break label68;
                                    case 106798474:
                                    default:
                                        var1 ^= -1175043763;
                                        break label68;
                                    case 1855052919:
                                        var1 -= 1705314722;
                                        var1 ^= -410324302;
                                        break label68;
                                }
                            }

                            var1 *= 661476687;
                            var1 |= 941541157;
                            var1 ^= 1782261645;
                            long var57 = var1;
                            long var86 = var57 + 1L;
                            long var87 = var57 * var86;
                            long var6 = var57 + 2L;
                            long var88 = var87 * var6;
                            long var58 = var57 + 3L;
                            long var89 = var88 * var58;
                            long var59 = var89 & 7L;
                            long var93;
                            var2 = (var93 = var59 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                            if (var2 == 0) {
                                boolean var62 = true;
                                var1 *= -35108909;
                                var1 &= -603512659;
                                var1 |= -1997109700;
                                var1 -= 1129220635;
                                var1 ^= -1000327238;
                                return var62;
                            }
                        }
                    }

                    AssertionError var61 = new AssertionError();
                    throw var61;
                }

                boolean var94 = false;
                var1 += 2050766508;
                var1 ^= 1979379390;
                var1 |= -797255613;
                var1 *= -1677928081;
                var1 ^= -826679622;
                return var94;
            }
        }

        UnsupportedOperationException var77 = new UnsupportedOperationException();
        throw var77;
    }

    public float U() {
        int var1 = tm;
        var1 ^= 1649235673;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 |= 98663190;
            var1 >>>= 19;
            var1 *= 998823071;
            var1 += 1451259184;
            var1 ^= -637429400;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.zv;
            }
        } else {
            var1 |= -523127967;
            var1 ^= -335340044;
            long var15 = var1;
            long var29 = var15 + 1L;
            long var30 = var15 * var29;
            long var5 = var15 + 2L;
            long var31 = var30 * var5;
            long var16 = var15 + 3L;
            long var32 = var31 * var16;
            long var17 = var32 & 7L;
            long var33;
            var1 = (var33 = var17 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public float w() {
        int var1 = tm;
        var1 ^= 4246948;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var35;
        var2 = (var35 = var22 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 >>>= 6;
            var1 |= -51138336;
            var1 &= -1623661105;
            var1 += -1450114725;
            var1 ^= -973574997;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.V;
            }
        } else {
            long var15 = switch (var1) {
                default -> var1 ^ 1987146539;
                case -870106196 -> {
                    var1 |= -819363861;
                    yield var1 ^ 1260268667;
                }
                case 2030216314 -> var1 ^ -944447218;
            };
            long var30 = var15 + 1L;
            var30 = var15 * var30;
            long var5 = var15 + 2L;
            var30 *= var5;
            long var16 = var15 + 3L;
            var30 *= var16;
            long var17 = var30 & 7L;
            long var36;
            var1 = (var36 = var17 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public float I() {
        int var1 = tm;
        var1 ^= -1568977464;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 = switch (var1) {
                default -> var1 ^ 407350217;
                case 1847114688 -> {
                    var1 |= -1682134629;
                    var1 &= 608285178;
                    var1 <<= 22;
                    yield var1 ^ -104982811;
                }
                case 1893831462 -> var1 ^ -201697684;
            };
            int var13 = var1 + 1;
            var13 = var1 * var13;
            var13 &= 1;
            if (var13 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            } else {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            }
        } else {
            var1 ^= -1726934009;
            var1 <<= 14;
            var1 ^= -1482036104;
            var1 ^= -1732686573;
            return this.tw;
        }
    }

    public void B(float[] var1) {
        int var2 = tm;
        var2 ^= -595202144;
        int var3 = System.identityHashCode(this);
        float var4 = var1[0];
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        if (var5 != 0) {
            var2 -= -1783650679;
            var2 ^= 768691537;
        } else {
            label52: {
                var2 *= 1394692487;
                var2 |= -1132327773;
                var2 ^= 1939050075;
                var2 ^= -845561935;
                long var51 = var2;
                long var7 = var51 + 1L;
                var7 = var51 * var7;
                long var9 = var51 + 2L;
                var7 *= var9;
                long var52 = var51 + 3L;
                var7 *= var52;
                long var53 = var7 & 7L;
                long var77;
                var5 = (var77 = var53 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                label35:
                if (var5 == 0) {
                    var4 *= 0.2126F;
                    float var55 = var1[1];
                    float var56 = var55 * 0.7152F;
                    var4 += var56;
                    float var57 = var1[2];
                    float var58 = var57 * 0.0722F;
                    var4 += var58;
                    var4 = var4;
                    int var59 = 0;
                    var59 = var59;
                    var2 ^= 1733307741;
                    var2 *= 190135785;
                    var2 >>>= 27;
                    var2 |= 995836686;
                    var2 ^= 596426015;

                    while (var59 < 3) {
                        var2 >>= 13;
                        var2 |= -1256074891;
                        var2 &= 1488940604;
                        var2 ^= 836772654;
                        float var6 = var1[var59];
                        var6 -= var4;
                        float var73 = this.V;
                        var6 *= var73;
                        var6 = var4 + var6;
                        var6 -= 0.5F;
                        float var74 = this.tw;
                        Integer var8 = var3;
                        if (var8 == null) {
                            var2 &= -1695516335;
                            var2 >>= 9;
                            var2 ^= 1458003582;
                            break label52;
                        }

                        var2 |= -241987555;
                        var2 += -611579242;
                        var2 &= 652337370;
                        var2 |= -1486563252;
                        var2 ^= -759213390;
                        var8 = var2;
                        if (var8 == null) {
                            break label35;
                        }

                        var6 *= var74;
                        var6 += 0.5F;
                        float var75 = this.zv;
                        var6 += var75;
                        var6 = TP.S(var6);
                        var1[var59] = var6;
                        int var69 = var59 + 1;
                        var59 = var69;
                        var2 ^= 626380191;
                        var2 ^= 1324459039;
                        var2 &= 895475339;
                        var2 ^= 210320539;
                    }

                    var2 &= 1285987941;
                    var2 >>>= 19;
                    var2 ^= -71677121;
                    var2 ^= 1845112375;
                    Integer var43 = var2;
                    if (var43 != null) {
                        return;
                    }
                }

                AssertionError var44 = new AssertionError();
                throw var44;
            }
        }

        IllegalArgumentException var42 = new IllegalArgumentException();
        throw var42;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1008910299;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        tm = var4;
    }
}
