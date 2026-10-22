package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public final class GQ {
    private final List gM;
    private final List n;
    private final List I;
    public static final int Lw;

    public GQ() {
        ArrayList var1 = new ArrayList();
        this.gM = var1;
        var1 = new ArrayList();
        this.n = var1;
        var1 = new ArrayList();
        this.I = var1;
    }

    public GQ E(float var1, float var2) {
        int var3 = Lw;
        var3 ^= -1268075987;
        int var4 = System.identityHashCode(this);
        long var21 = var4;
        long var6 = var21 + 1L;
        var6 = var21 * var6;
        long var8 = var21 + 2L;
        var6 *= var8;
        long var22 = var21 + 3L;
        var6 *= var22;
        long var23 = var6 & 7L;
        long var30;
        var4 = (var30 = var23 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var4 != 0) {
            var3 -= 812038878;
            var3 -= -1690986391;
            var3 ^= 535736998;
            IllegalArgumentException var25 = new IllegalArgumentException();
            throw var25;
        } else {
            long var13 = switch (var3) {
                default -> var3 ^ -594364335;
                case -331974497 -> var3 ^ 1672624118;
                case 638665649 -> {
                    var3 *= -1585155413;
                    yield var3 ^ 1424383911;
                }
            };
            long var5 = var13 + 1L;
            var5 = var13 * var5;
            long var14 = var5 & 1L;
            long var31;
            var3 = (var31 = var14 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var3 != 0) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            } else {
                Lv var16 = sT_2.S;
                return this.cr(var1, var2, var16);
            }
        }
    }

    public GQ cr(float var1, float var2, Lv var3) {
        label74: {
            int var31;
            var31 = Lw;
            var31 ^= -1885091291;
            int var5 = System.identityHashCode(this);
            List var6 = this.gM;
            boolean var51 = var6.isEmpty();
            Integer var7 = var5;
            label73:
            if (var7 != null) {
                var31 |= 1617952616;
                var31 ^= -80764485;
                var7 = var31;
                if (var7 == null) {
                    break label74;
                }

                if (!var51) {
                    var31 = switch (var31) {
                        case -2033164734 -> {
                            var31 &= -1241178863;
                            yield var31 ^ 1140987439;
                        }
                        default -> var31 ^ -841962920;
                        case -1844435406 -> var31 ^ -89952989;
                    };
                    Integer var52 = var31;
                    if (var52 == null) {
                        break label74;
                    }

                    var6 = this.gM;
                    List var72 = this.gM;
                    int var73 = var72.size();
                    int var8 = var5 + 1;
                    var8 = var5 * var8;
                    int var9 = var5 + 2;
                    var8 *= var9;
                    var9 = var5 + 3;
                    var8 *= var9;
                    var8 &= 7;
                    if (var8 != 0) {
                        var31 -= -1832403964;
                        var31 <<= 18;
                        var31 += 383676349;
                        var31 &= 1587972696;
                        var31 ^= 996978441;
                        break label73;
                    }

                    var31 *= -538107237;
                    var31 += -491483759;
                    var31 >>= 30;
                    var31 ^= -1555679526;
                    Integer var81 = var31;
                    if (var81 == null) {
                        break label74;
                    }

                    Float var54 = (Float)var6.get(--var73);
                    var54 = var54;
                    float var56 = var54;
                    float var87;
                    int var57 = (var87 = var1 - var56) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
                    if (var57 <= 0) {
                        var31 -= -405938283;
                        var31 ^= -1269658750;
                        var31 ^= -2116158392;
                        int var58 = var31 + 1;
                        int var59 = var31 * var58;
                        int var60 = var59 & 1;
                        if (var60 == 0) {
                            IllegalArgumentException var61 = new IllegalArgumentException("Keyframe times must be strictly increasing");
                            throw var61;
                        }
                        break label74;
                    }

                    var31 ^= 1810164526;
                    var31 &= 1721438651;
                    var31 ^= 599505183;
                } else {
                    switch (var31) {
                        case -2115933277:
                            var31 ^= -857734654;
                            break;
                        case -2033164734:
                            var31 += -1867409027;
                            var31 -= 2035143740;
                            var31 += 1364749876;
                            var31 += -1059002131;
                            var31 ^= -1244675152;
                            break;
                        case 1323782072:
                        default:
                            var31 ^= 950863037;
                    }
                }

                long var62 = var31;
                long var82 = var62 + 1L;
                var82 = var62 * var82;
                long var10 = var62 + 2L;
                var82 *= var10;
                long var63 = var62 + 3L;
                var82 *= var63;
                long var64 = var82 & 7L;
                long var88;
                int var65 = (var88 = var64 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                if (var65 != 0) {
                    break label74;
                }

                var6 = this.gM;
                Float var75 = var1;
                boolean var67 = var6.add(var75);
                var6 = this.n;
                Float var76 = var2;
                Integer var47 = var5;
                if (var47 != null) {
                    var31 += -1172603071;
                    var31 ^= -1486672764;
                    var31 ^= 552340478;
                    boolean var48 = var6.add(var76);
                    List var49 = this.I;
                    boolean var50 = var49.add(var3);
                    return this;
                }

                var31 ^= 2087236692;
                var31 ^= 203728977;
            } else {
                switch (var31) {
                    case -24359428:
                        var31 ^= 736029379;
                        break;
                    case 500710329:
                        var31 ^= -19533505;
                        var31 |= -41605729;
                        var31 ^= -1973204338;
                        break;
                    case 1087746351:
                    default:
                        var31 ^= 959611585;
                }
            }

            long var42 = var31;
            long var69 = var42 + 1L;
            long var70 = var42 * var69;
            long var43 = var70 & 1L;
            long var89;
            var31 = (var89 = var43 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
            if (var31 == 0) {
                AssertionError var46 = new AssertionError();
                throw var46;
            }
        }

        AssertionError var45 = new AssertionError();
        throw var45;
    }

    public LH z() {
        label85: {
            int var1 = Lw;
            var1 ^= 333759206;
            int var2 = System.identityHashCode(this);
            List var3 = this.gM;
            boolean var58 = var3.isEmpty();
            Integer var4 = var2;
            if (var4 == null) {
                switch (var1) {
                    case -2120273030:
                        var1 >>>= 14;
                        var1 *= 2041429853;
                        var1 += -1373407055;
                        var1 ^= -725475668;
                        break;
                    case 1235535297:
                    default:
                        var1 ^= -992494810;
                        break;
                    case 1696501844:
                        var1 ^= -1281837284;
                }
            } else {
                var1 -= 1372250686;
                var1 *= -1354998979;
                var1 ^= 1850999157;
                var4 = var1;
                if (var4 == null) {
                    break label85;
                }

                if (var58) {
                    var1 |= 1804195804;
                    var1 <<= 16;
                    var1 *= 990253683;
                    var1 ^= 1110647479;
                    int var66 = var1 + 1;
                    int var67 = var1 * var66;
                    int var68 = var67 & 1;
                    if (var68 == 0) {
                        IllegalStateException var69 = new IllegalStateException("At least one keyframe is required");
                        throw var69;
                    }
                    break label85;
                }

                var1 *= 581488877;
                var1 <<= 22;
                var1 ^= 434059670;
                long var59 = var1;
                long var5 = var59 + 1L;
                var5 = var59 * var5;
                long var60 = var5 & 1L;
                long var104;
                int var61 = (var104 = var60 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                if (var61 != 0) {
                    break label85;
                }

                var3 = this.gM;
                int var63 = var3.size();
                float[] var64 = new float[var63];
                float[] var65 = var64;
                List var71 = this.n;
                var5 = var2;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var105;
                int var79 = (var105 = var5 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                if (var79 == 0) {
                    var1 &= -1290900619;
                    var1 ^= -149619480;
                    int var72 = var71.size();
                    float[] var73 = new float[var72];
                    float[] var74 = var73;
                    byte var80 = 0;
                    int var81 = var80;
                    var1 += 1711414841;
                    var1 ^= -137581003;

                    while (true) {
                        int var6 = var65.length;
                        Integer var103 = var2;
                        if (var103 == null) {
                            var1 ^= 1308263098;
                            var1 <<= 24;
                            var1 |= -637465760;
                            var1 ^= -102947308;
                            var1 ^= -123968411;
                            break;
                        }

                        var1 -= 12832735;
                        var1 ^= 868867029;
                        var1 ^= -1502812758;
                        if (var81 >= var6) {
                            var1 >>>= 7;
                            var1 ^= -1864013573;
                            List var82 = this.I;
                            IntFunction var99 = var0 -> {
                                int var1x = Lw;
                                var1x ^= -1336203126;
                                int var4x = var0 + 1;
                                var4x = var0 * var4x;
                                int var5x = var0 + 2;
                                var4x *= var5x;
                                int var3x = var0 + 3;
                                var4x *= var3x;
                                var3x = var4x & 7;
                                if (var3x == 0) {
                                    var1x += 1300715667;
                                    var1x ^= 1754555167;
                                    var3x = var0 + 1;
                                    var3x = var0 * var3x;
                                    var4x = var0 + 2;
                                    var3x *= var4x;
                                    var4x = var0 + 3;
                                    var3x *= var4x;
                                    var3x &= 7;
                                    if (var3x == 0) {
                                        return new Lv[var0];
                                    }
                                } else {
                                    var1x ^= -1837460743;
                                    var1x += -2031460774;
                                    var1x ^= -2107831692;
                                    var1x = var0 + 1;
                                    var1x = var0 * var1x;
                                    var1x &= 1;
                                    if (var1x == 0) {
                                        IllegalStateException var16x = new IllegalStateException();
                                        throw var16x;
                                    }
                                }

                                RuntimeException var15x = new RuntimeException();
                                throw var15x;
                            };
                            Object[] var83 = var82.toArray(var99);
                            Lv[] var84 = (Lv[])var83;
                            return new LH(var65, var74, var84);
                        }

                        var1 += 1257651197;
                        var1 ^= 1917938354;
                        var1 ^= -473931664;
                        Object var85 = var1;
                        if (var85 == null) {
                            break label85;
                        }

                        List var86 = this.gM;
                        var85 = var86.get(var81);
                        Float var88 = (Float)var85;
                        float var89 = var88;
                        var65[var81] = var89;
                        List var90 = this.n;
                        var85 = var90.get(var81);
                        Float var92 = (Float)var85;
                        float var93 = var92;
                        var74[var81] = var93;
                        var85 = var2;
                        if (var85 == null) {
                            var1 *= 1624727001;
                            var1 &= -1529436691;
                            var1 -= -914920055;
                            var1 ^= 1104861705;
                            break;
                        }
                        var1 = switch (var1) {
                            case -1394786126 -> var1 ^ -1763640169;
                            case -1156646247 -> {
                                var1 &= 1943501168;
                                var1 <<= 3;
                                var1 &= 702727554;
                                yield var1 ^ -230797501;
                            }
                            default -> var1 ^ 586730634;
                        };
                        int var95 = var1 + 1;
                        var95 = var1 * var95;
                        var95 &= 1;
                        if (var95 != 0) {
                            break label85;
                        }

                        var95 = var81 + 1;
                        var81 = var95;
                        var1 -= 1892764362;
                        var1 ^= -1013244167;
                    }
                } else {
                    switch (var1) {
                        case -1465960042:
                            var1 &= 1187234889;
                            var1 ^= 796921275;
                            var1 ^= 442192648;
                            var1 ^= -837281886;
                            break;
                        case 1259134295:
                            var1 ^= -1882359122;
                            break;
                        case 1530166778:
                        default:
                            var1 ^= 1152151558;
                    }
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                IllegalArgumentException var50 = new IllegalArgumentException();
                throw var50;
            }
        }

        RuntimeException var55 = new RuntimeException();
        throw var55;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1817876607;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Lw = var4;
    }
}
