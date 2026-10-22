package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Ue {
    private final String q;
    private final List Kb;
    private final List w;
    private final List a;
    private float[] gt;
    public static final int WT;

    Ue(String var1) {
        ArrayList var2 = new ArrayList();
        this.Kb = var2;
        var2 = new ArrayList();
        this.w = var2;
        var2 = new ArrayList();
        this.a = var2;
        this.q = var1;
    }

    public Ue Zs(float... var1) {
        int var2 = WT;
        var2 ^= -1301799017;
        int var3 = System.identityHashCode(this);
        Integer var12 = var3;
        if (var12 == null) {
            var2 += -1350590713;
            var2 ^= -1619525093;
            var12 = var2;
            if (var12 != null) {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            }
        } else {
            var2 &= 606810305;
            var2 ^= -641230450;
            int var15 = var2 + 1;
            var15 = var2 * var15;
            var15 &= 1;
            if (var15 == 0) {
                var2 |= 1082223122;
                var2 ^= -1046501371;
                float[] var11 = M(var1, var2);
                this.gt = var11;
                return this;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public Ue eA(float var1, Lv var2, float... var3) {
        int var4 = WT;
        var4 ^= -2115725240;
        int var5 = System.identityHashCode(this);
        List var6 = this.Kb;
        Float var7 = var1;
        boolean var24 = var6.add(var7);
        var6 = this.w;
        int var26 = var4 * 1367387111;
        int var27 = var26 * 1945105201;
        int var28 = var27 * -2011773173;
        int var29 = var28 ^ 731340366;
        float[] var30 = M(var3, var29);
        int var8 = var5 + 1;
        var8 = var5 * var8;
        var5 = var8 & 1;
        if (var5 != 0) {
            Integer var22 = switch (var4) {
                case -1101767708 -> {
                    var4 ^= -532952749;
                    var4 &= 810039079;
                    yield var4 ^ 1553498500;
                }
                default -> var4 ^ -1962878925;
                case -216370823 -> var4 ^ 376407780;
            };
            if (var22 != null) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var4 &= -858650832;
            var4 -= -492461558;
            var4 ^= 1292976204;
            Integer var16 = var4;
            if (var16 != null) {
                boolean var18 = var6.add(var30);
                List var19 = this.a;
                boolean var20 = var19.add(var2);
                return this;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public Ue z(float var1, Lv var2, float... var3) {
        int var4 = WT;
        var4 ^= -1728483106;
        int var5 = System.identityHashCode(this);
        float[] var6 = new float[8];
        var6 = var6;
        int var7 = 0;
        int var8 = var5 + 1;
        var8 = var5 * var8;
        int var9 = var5 + 2;
        var8 *= var9;
        var9 = var5 + 3;
        var8 *= var9;
        var8 &= 7;
        if (var8 != 0) {
            var4 <<= 19;
            var4 >>= 31;
            var4 -= 495948793;
            var4 ^= -1885742493;
        } else {
            label68: {
                var4 &= -298007779;
                var4 ^= -1112915105;
                Integer var67 = var4;
                if (var67 != null) {
                    var7 = var7;

                    var4 = switch (var4) {
                        case -923565153 -> var4 ^ 387148141;
                        default -> var4 ^ -1108174282;
                        case 463650895 -> {
                            var4 <<= 8;
                            var4 >>= 18;
                            var4 &= -1168583902;
                            yield var4 ^ -1904622359;
                        }
                    };

                    while (true) {
                        int var68 = var3.length;
                        long var82 = var5;
                        long var11 = var82 + 1L;
                        var11 = var82 * var11;
                        long var13 = var82 + 2L;
                        var11 *= var13;
                        long var83 = var82 + 3L;
                        var11 *= var83;
                        long var84 = var11 & 7L;
                        long var104;
                        var9 = (var104 = var84 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            switch (var4) {
                                case -65890424:
                                    var4 ^= -548136864;
                                    break label68;
                                case 874579145:
                                    var4 &= 1896394783;
                                    var4 += -633705902;
                                    var4 >>>= 30;
                                    var4 |= 288030988;
                                    var4 ^= 2093135721;
                                    break label68;
                                case 1443527291:
                                default:
                                    var4 ^= -1259476192;
                                    break label68;
                            }
                        }

                        var4 -= 1995611667;
                        var4 += -1571764060;
                        var4 ^= -1503616012;
                        var9 = var4 + 1;
                        var9 = var4 * var9;
                        int var10 = var4 + 2;
                        var9 *= var10;
                        var10 = var4 + 3;
                        var9 *= var10;
                        var9 &= 7;
                        if (var9 != 0) {
                            break;
                        }

                        if (var7 >= var68) {
                            var4 += -1838090638;
                            var4 *= 653986049;
                            var4 |= -720494962;
                            var4 ^= -2058208621;
                            var5 = var4 + 1;
                            var5 = var4 * var5;
                            var5 &= 1;
                            if (var5 == 0) {
                                return this.eA(var1, var2, var6);
                            }
                            break;
                        }

                        var4 += -1469853182;
                        var4 += -14967594;
                        var4 |= -913848562;
                        var4 ^= -117240467;
                        long var69 = var4;
                        long var93 = var69 + 1L;
                        long var94 = var69 * var93;
                        long var70 = var94 & 1L;
                        long var105;
                        var68 = (var105 = var70 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break;
                        }

                        var68 = 3 + var7;
                        float var91 = var3[var7];
                        var6[var68] = var91;
                        long var73 = var5;
                        long var95 = var73 + 1L;
                        long var96 = var73 * var95;
                        long var12 = var73 + 2L;
                        long var97 = var96 * var12;
                        long var74 = var73 + 3L;
                        long var98 = var97 * var74;
                        long var75 = var98 & 7L;
                        long var106;
                        var68 = (var106 = var75 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            var4 |= -341265662;
                            var4 -= 929636275;
                            var4 += 1492132408;
                            var4 -= -1430812035;
                            var4 ^= 526769550;
                            break label68;
                        }

                        var4 ^= -942351121;
                        var4 |= 563175762;
                        var4 -= 53956084;
                        var4 >>>= 25;
                        var4 ^= 1882775009;
                        long var77 = var4;
                        long var99 = var77 + 1L;
                        long var100 = var77 * var99;
                        long var78 = var100 & 1L;
                        long var107;
                        var68 = (var107 = var78 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break;
                        }

                        var68 = var7 + 1;
                        var7 = var68;
                        var4 ^= -9458216;
                        var4 -= -929338027;
                        var4 ^= -224590297;
                    }
                }

                IllegalStateException var60 = new IllegalStateException();
                throw var60;
            }
        }

        AssertionError var56 = new AssertionError();
        throw var56;
    }

    public g_2 Y() {
        int var1 = WT;
        var1 ^= 1294575361;
        int var2 = System.identityHashCode(this);
        List var3 = this.w;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var119;
        int var75 = (var119 = var4 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
        if (var75 != 0) {
            var1 &= -1056155615;
            var1 |= 1477074351;
            var1 ^= -1875578493;
        } else {
            label94: {
                var1 >>= 9;
                var1 ^= 451873237;
                Integer var76 = var1;
                if (var76 != null) {
                    boolean var60 = var3.isEmpty();
                    if (var60) {
                        var1 += 1620729199;
                        var1 += -1495964184;
                        var1 |= -995273710;
                        var1 *= -303048091;
                        var1 ^= -130514150;
                        long var69 = var1;
                        long var98 = var69 + 1L;
                        var98 = var69 * var98;
                        long var118 = var69 + 2L;
                        var98 *= var118;
                        long var70 = var69 + 3L;
                        var98 *= var70;
                        long var71 = var98 & 7L;
                        long var120;
                        int var72 = (var120 = var71 - 0L) == 0L ? 0 : (var120 < 0L ? -1 : 1);
                        if (var72 == 0) {
                            String var80 = this.q;
                            String var81 = var80 + ": no keys";
                            IllegalStateException var73 = new IllegalStateException(var81);
                            throw var73;
                        }
                    } else {
                        var1 = switch (var1) {
                            default -> var1 ^ -1179742734;
                            case 450250087 -> {
                                var1 ^= 1589562560;
                                var1 ^= 1377306228;
                                var1 &= -1001202820;
                                yield var1 ^ -1215990640;
                            }
                            case 580613840 -> var1 ^ 2129664054;
                        };
                        long var61 = var1;
                        long var5 = var61 + 1L;
                        var5 = var61 * var5;
                        long var7 = var61 + 2L;
                        var5 *= var7;
                        long var62 = var61 + 3L;
                        var5 *= var62;
                        long var63 = var5 & 7L;
                        long var121;
                        int var64 = (var121 = var63 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                        if (var64 == 0) {
                            var3 = this.Kb;
                            int var66 = var3.size();
                            float[] var67 = new float[var66];
                            float[] var68 = var67;
                            byte var77 = 0;
                            Integer var85 = var2;
                            if (var85 == null) {
                                var1 += 1647967583;
                                var1 <<= 23;
                                var1 |= 540624566;
                                var1 |= -1263548733;
                                var1 ^= 2004970203;
                                break label94;
                            }
                            var1 = switch (var1) {
                                case -1277820992 -> {
                                    var1 -= -1769631178;
                                    var1 >>= 6;
                                    yield var1 ^ 421289922;
                                }
                                default -> var1 ^ -254705089;
                                case -349160663 -> var1 ^ 1365374152;
                            };
                            int var78 = var77;
                            var1 -= -66163061;
                            var1 <<= 21;
                            var1 &= -1542846780;
                            var1 ^= 1452725543;

                            while (true) {
                                int var86 = var1 + 1;
                                int var87 = var1 * var86;
                                int var88 = var87 & 1;
                                if (var88 != 0) {
                                    break;
                                }

                                int var89 = var68.length;
                                Integer var103 = var2;
                                if (var103 == null) {
                                    var1 &= -1931694047;
                                    var1 += -1067942472;
                                    var1 ^= -1999396363;
                                    break label94;
                                }

                                var1 ^= -1339646496;
                                var1 -= 385713846;
                                var1 ^= 603435712;
                                if (var78 >= var89) {
                                    var1 -= 732720250;
                                    var1 &= 88385223;
                                    var1 ^= -86293310;
                                    String var79 = this.q;
                                    List var95 = this.w;
                                    float[][] var110 = new float[0][];
                                    Object[] var96 = var95.toArray(var110);
                                    float[][] var97 = (float[][])var96;
                                    List var111 = this.a;
                                    Lv[] var116 = new Lv[0];
                                    Object[] var112 = var111.toArray(var116);
                                    Lv[] var113 = (Lv[])var112;
                                    float[] var117 = this.gt;
                                    return new g_2(var79, var68, var97, var113, var117);
                                }

                                var1 |= -705354687;
                                var1 ^= -1506271259;
                                List var90 = this.Kb;
                                Object var91 = var90.get(var78);
                                Float var92 = (Float)var91;
                                float var93 = var92;
                                int var104 = var2 + 1;
                                int var105 = var2 * var104;
                                int var114 = var2 + 2;
                                int var106 = var105 * var114;
                                int var115 = var2 + 3;
                                int var107 = var106 * var115;
                                int var108 = var107 & 7;
                                if (var108 != 0) {
                                    switch (var1) {
                                        case 28713880:
                                        default:
                                            var1 ^= 1830671273;
                                            break label94;
                                        case 485150936:
                                            var1 ^= -695653199;
                                            break label94;
                                        case 2077059892:
                                            var1 -= -588055736;
                                            var1 &= -877723481;
                                            var1 >>>= 8;
                                            var1 ^= -927717844;
                                            break label94;
                                    }
                                }

                                var1 |= 1751056324;
                                var1 >>= 12;
                                var1 += 599331409;
                                var1 ^= 223306018;
                                Integer var109 = var1;
                                if (var109 == null) {
                                    break;
                                }

                                var68[var78] = var93;
                                int var94 = var78 + 1;
                                var78 = var94;
                                var1 &= -1602320024;
                                var1 ^= -761768889;
                            }
                        }
                    }
                }

                IllegalArgumentException var59 = new IllegalArgumentException();
                throw var59;
            }
        }

        IllegalStateException var58 = new IllegalStateException();
        throw var58;
    }

    private static float[] M(float[] var0, int var1) {
        int var3 = System.identityHashCode(var0);
        int var4 = var0.length;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 == 0) {
            int var2 = var1 | 304201020;
            var2 ^= 1620407145;
            var2 ^= -924291378;
            if (var4 <= 8) {
                var2 += 860282816;
                var2 ^= -1255657287;
                return Arrays.copyOf(var0, 8);
            }

            var2 *= -1137297121;
            var2 <<= 29;
            var2 &= -1835535187;
            var2 ^= -2084345520;
            Integer var25 = var2;
            if (var25 != null) {
                IllegalArgumentException var26 = new IllegalArgumentException("too many channels");
                throw var26;
            }
        } else {
            int var15 = var1 | 441905310;
            var15 <<= 27;
            var15 += -519015100;
            var15 *= -1588000297;
            var15 ^= -1893789884;
            Integer var20 = var15;
            if (var20 != null) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2074897768;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        WT = var4;
    }
}
