package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public record FX(String N, String Kx, String C, String I, String u, long o, long WK, long k, boolean xo, String Y, boolean uI) {
    public static final int zl;

    public FX(String N, String Kx, String C, String I, String u, long o, long WK, long k, boolean xo, String Y, boolean uI) {
        String var24;
        label26: {

            var24 = Objects.requireNonNullElse(N, "");
            var24 = var24;
            var24 = Objects.requireNonNullElse(C, "");
            var24 = var24;
            var24 = Objects.requireNonNullElse(I, "");
            var24 = var24;
            var24 = Objects.requireNonNullElse(u, "");
            var24 = var24;
            var24 = Objects.requireNonNullElse(Y, "");
            var24 = var24;
            if (Kx != null) {
                boolean var33 = Kx.isEmpty();
                if (!var33) {
                    var24 = Kx;
                    break label26;
                }
            }

            String var16 = var24 + "|" + var24 + "|" + var24 + "|" + var24;
            var24 = var16;
        }

        long var35 = Math.max(0L, o);
        long var40;
        int var36 = (var40 = var35 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        if (var36 > 0) {
            var35 = Math.min(WK, var35);
            var35 = var35;
        } else {
            var35 = WK;
        }

        long var39 = Math.max(0L, var35);
        this.N = var24;
        this.Kx = var24;
        this.C = var24;
        this.I = var24;
        this.u = var24;
        this.o = var35;
        this.WK = var39;
        this.k = k;
        this.xo = xo;
        this.Y = var24;
        this.uI = uI;
    }

    public long positionAt(long var1) {
        label80: {
            int var3 = zl;
            var3 ^= -1562643513;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var147;
            int var74 = (var147 = var5 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
            if (var74 != 0) {
                var3 *= 1914551095;
                var3 ^= 1260327440;
            } else {
                label83: {
                    var3 *= 1275670677;
                    var3 *= -1705722531;
                    var3 &= 528807927;
                    var3 ^= -732353614;
                    int var75 = var3 + 1;
                    int var76 = var3 * var75;
                    int var77 = var76 & 1;
                    if (var77 != 0) {
                        break label80;
                    }

                    var5 = this.WK;
                    boolean var100 = this.xo;
                    if (var100) {
                        var3 -= 592736232;
                        var3 ^= 580936678;
                        var7 = this.k;
                        var9 = var4;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var148;
                        int var109 = (var148 = var9 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                        if (var109 != 0) {
                            var3 += -889983846;
                            var3 += -2078938844;
                            var3 >>= 9;
                            var3 &= -527730915;
                            var3 ^= -1415183336;
                            break label83;
                        }

                        var3 ^= 901234362;
                        var3 >>= 19;
                        var3 &= 1119089452;
                        var3 ^= 2103960816;
                        int var110 = var3 + 1;
                        int var111 = var3 * var110;
                        int var112 = var111 & 1;
                        if (var112 != 0) {
                            break label80;
                        }

                        var7 = var1 - var7;
                        var7 = Math.max(0L, var7);
                        var7 = var5 + var7;
                        var7 = var7;
                        switch (var3) {
                            case -1810847736:
                            default:
                                var3 ^= 258760951;
                                break;
                            case 1070864080:
                                var3 >>= 29;
                                var3 >>= 18;
                                var3 ^= 962181405;
                                break;
                            case 1118185166:
                                var3 ^= -874344205;
                        }
                    } else {
                        var3 &= -1657150547;
                        var3 |= 893464089;
                        var3 *= -1609279117;
                        var3 *= 1019495129;
                        var3 ^= -1650922254;
                        var9 = var3;
                        long var135 = var9 + 1L;
                        var135 = var9 * var135;
                        long var145 = var9 + 2L;
                        var135 *= var145;
                        var9 += 3L;
                        var135 *= var9;
                        var9 = var135 & 7L;
                        long var149;
                        int var116 = (var149 = var9 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                        if (var116 != 0) {
                            break label80;
                        }

                        var7 = var5;
                        var3 &= 1361939290;
                        var3 ^= 1768995597;
                    }

                    var5 = this.o;
                    long var150;
                    int var80 = (var150 = var5 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                    var9 = var4;
                    long var139 = var9 + 1L;
                    var139 = var9 * var139;
                    long var146 = var9 + 2L;
                    var139 *= var146;
                    var9 += 3L;
                    var139 *= var9;
                    var9 = var139 & 7L;
                    long var151;
                    int var6 = (var151 = var9 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        var3 *= -564838575;
                        var3 >>>= 21;
                        var3 &= -1092415224;
                        var3 *= 204176833;
                        var3 ^= 1260720912;
                    } else {
                        var3 *= 162500655;
                        var3 &= 1863636441;
                        var3 ^= 826298268;
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var120 = var3 + 2;
                        var6 *= var120;
                        int var121 = var3 + 3;
                        var6 *= var121;
                        var6 &= 7;
                        if (var6 != 0) {
                            break label80;
                        }

                        if (var80 <= 0) {
                            var3 <<= 28;
                            var3 &= 780277861;
                            var3 *= -89172577;
                            var3 ^= -1206203038;
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            int var130 = var3 + 2;
                            var6 *= var130;
                            int var131 = var3 + 3;
                            var6 *= var131;
                            var6 &= 7;
                            if (var6 != 0) {
                                break label80;
                            }

                            var3 |= -1994239135;
                            var3 += -1559774866;
                            var3 ^= 694606942;
                            return var7;
                        }

                        var3 ^= 873857740;
                        var3 -= -420910984;
                        var3 ^= -1753124764;
                        var5 = var3;
                        var9 = var5 + 1L;
                        var9 = var5 * var9;
                        var5 = var9 & 1L;
                        long var152;
                        int var83 = (var152 = var5 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                        if (var83 != 0) {
                            break label80;
                        }

                        var5 = this.o;
                        int var124 = var4 + 1;
                        int var125 = var4 * var124;
                        int var10 = var4 + 2;
                        int var126 = var125 * var10;
                        var4 += 3;
                        int var127 = var126 * var4;
                        var4 = var127 & 7;
                        if (var4 == 0) {
                            var3 |= -547360953;
                            var3 += 1418488919;
                            var3 ^= -388069186;
                            long var70 = Math.min(var7, var5);
                            var3 &= -738432610;
                            var3 &= 835369004;
                            var3 &= 149709121;
                            var3 ^= -517085985;
                            var3 ^= -1807122352;
                            return var70;
                        }

                        var3 &= -269928299;
                        var3 ^= -271842411;
                    }
                }
            }

            var9 = var3;
            long var143 = var9 + 1L;
            var143 = var9 * var143;
            var9 = var143 & 1L;
            long var153;
            int var90 = (var153 = var9 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
            if (var90 == 0) {
                IllegalStateException var91 = new IllegalStateException();
                throw var91;
            }
        }

        IllegalArgumentException var67 = new IllegalArgumentException();
        throw var67;
    }

    public float progressAt(long var1) {
        label57: {
            int var3 = zl;
            var3 ^= -1483653402;
            int var4 = System.identityHashCode(this);
            long var5 = this.o;
            long var71;
            int var46 = (var71 = var5 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
            Integer var6 = var4;
            if (var6 == null) {
                var3 ^= -1954903708;
                var3 ^= 151802566;
                var3 ^= -2006477673;
            } else {
                label60: {
                    var3 = switch (var3) {
                        case -2067117535 -> {
                            var3 ^= -980797927;
                            var3 &= 609280094;
                            var3 += -1309821141;
                            var3 -= -967231799;
                            yield var3 ^ 642661560;
                        }
                        case -494149304 -> var3 ^ -1390128201;
                        default -> var3 ^ 2119015524;
                    };
                    float var51;
                    if (var46 <= 0) {
                        var3 += 1791678726;
                        var3 ^= -2121680834;
                        var5 = var3;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var72;
                        int var50 = (var72 = var5 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var50 != 0) {
                            break label57;
                        }

                        var51 = 0.0F;
                        var3 >>= 1;
                        var3 *= -903632873;
                        var3 |= 1558442971;
                        var3 ^= -1705004895;
                    } else {
                        var3 ^= 1227310788;
                        var3 >>= 11;
                        var3 >>>= 19;
                        var3 ^= -1721549070;
                        long var52 = var3;
                        long var8 = var52 + 1L;
                        var8 = var52 * var8;
                        long var10 = var52 + 2L;
                        var8 *= var10;
                        long var53 = var52 + 3L;
                        var8 *= var53;
                        long var54 = var8 & 7L;
                        long var73;
                        int var55 = (var73 = var54 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                        if (var55 != 0) {
                            break label57;
                        }

                        long var56 = this.positionAt(var1);
                        float var57 = (float)var56;
                        long var61 = this.o;
                        long var65 = var4;
                        long var11 = var65 + 1L;
                        var11 = var65 * var11;
                        long var13 = var65 + 2L;
                        var11 *= var13;
                        var65 += 3L;
                        var11 *= var65;
                        var65 = var11 & 7L;
                        long var74;
                        var4 = (var74 = var65 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            switch (var3) {
                                case -1721556724:
                                    var3 |= 1324224004;
                                    var3 ^= 1362373144;
                                    break label60;
                                case 1607584424:
                                    var3 ^= 1071556388;
                                    break label60;
                                case 1998897755:
                                default:
                                    var3 ^= 743914981;
                                    break label60;
                            }
                        }

                        var3 *= -257248559;
                        var3 ^= -45213286;
                        float var42 = (float)var61;
                        float var43 = var57 / var42;
                        var51 = var43;
                        var3 |= 1629258124;
                        var3 <<= 15;
                        var3 ^= -1571599490;
                    }

                    Integer var35 = var3;
                    if (var35 != null) {
                        return var51;
                    }
                    break label57;
                }
            }

            Integer var44 = var3;
            if (var44 != null) {
                IllegalArgumentException var45 = new IllegalArgumentException();
                throw var45;
            }
        }

        IllegalArgumentException var40 = new IllegalArgumentException();
        throw var40;
    }

    public boolean sameTrack(FX var1) {
        boolean var50 = false;
        int var2 = zl;
        var2 ^= 636350194;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var5 = var3 + 3;
        var4 *= var5;
        var4 &= 7;
        label66:
        if (var4 == 0) {
            var2 = switch (var2) {
                case -1755259223 -> var2 ^ 1596029307;
                case 112630325 -> {
                    var2 |= -1129828500;
                    yield var2 ^ 1128587462;
                }
                default -> var2 ^ -1667986871;
            };
            Integer var56 = var2;
            label55:
            if (var56 != null) {
                label61: {
                    if (var1 != null) {
                        var2 = switch (var2) {
                            case -1169014688 -> var2 ^ 935283536;
                            default -> var2 ^ -657496348;
                            case -33923141 -> {
                                var2 |= 1714472766;
                                yield var2 ^ -489305723;
                            }
                        };
                        long var57 = var2;
                        long var6 = var57 + 1L;
                        var6 = var57 * var6;
                        long var58 = var6 & 1L;
                        long var71;
                        int var59 = (var71 = var58 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                        if (var59 != 0) {
                            break label55;
                        }

                        String var60 = this.Kx;
                        String var63 = var1.Kx;
                        var6 = var3;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var72;
                        var3 = (var72 = var6 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var3 != 0) {
                            var2 &= 1203788139;
                            var2 &= 432520091;
                            var2 >>= 31;
                            var2 &= -990068459;
                            var2 ^= 1984826516;
                            break label66;
                        }

                        var2 &= -1733964271;
                        var2 ^= -366073407;
                        boolean var48 = var60.equals(var63);
                        if (var48) {
                            var2 += -1622516905;
                            var2 -= 819537788;
                            var2 += -2091390669;
                            var2 *= -1831162733;
                            var2 ^= 1391903705;
                            Integer var49 = var2;
                            if (var49 == null) {
                                break label55;
                            }

                            var50 = true;
                            var2 ^= 156631364;
                            var2 ^= 1746358068;
                            var2 += -1313573742;
                            var2 ^= -1059187760;
                            break label61;
                        }

                        var2 += 292065396;
                        var2 ^= 1101900129;
                        var2 -= 2106498441;
                        var2 ^= -779208153;
                    } else {
                        var2 *= -444031319;
                        var2 >>>= 22;
                        var2 -= 1210624655;
                        var2 ^= -1558796541;
                    }

                    var50 = false;
                    switch (var2) {
                        case -1753973685:
                            var2 ^= -771505844;
                            break;
                        case -746059857:
                        default:
                            var2 ^= 423981802;
                            break;
                        case 348254652:
                            var2 -= -148622760;
                            var2 <<= 15;
                            var2 -= 242772263;
                            var2 ^= -895520961;
                    }
                }

                var56 = var2;
                if (var56 != null) {
                    return var50;
                }
            }

            AssertionError var51 = new AssertionError();
            throw var51;
        } else {
            var2 &= 725375181;
            var2 *= -824051145;
            var2 ^= 222627719;
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    public FX withPlayback(boolean var1, long var2, long var4) {
        int var6 = zl;
        var6 ^= 72434123;
        int var7 = System.identityHashCode(this);
        Integer var27 = var7;
        if (var27 != null) {
            var6 >>= 2;
            var6 ^= 1104971403;
            String var8 = this.N;
            String var9 = this.Kx;
            String var10 = this.C;
            String var11 = this.I;
            String var12 = this.u;
            long var13 = this.o;
            String var15 = this.Y;
            boolean var16 = this.uI;
            return new FX(var8, var9, var10, var11, var12, var13, var2, var4, var1, var15, var16);
        } else {
            var6 *= -755831527;
            var6 &= 866171001;
            var6 |= 1241809487;
            var6 ^= -206942913;
            Integer var22 = var6;
            if (var22 == null) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            } else {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        }
    }

    public boolean isSong() {
        boolean var53 = false;
        label83: {
            int var1 = zl;
            var1 ^= -1574512148;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var96;
            int var60 = (var96 = var3 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var60 != 0) {
                switch (var1) {
                    case -2122470101:
                        var1 &= 1295821470;
                        var1 ^= -1051059702;
                        var1 &= -1592929815;
                        var1 >>>= 4;
                        var1 ^= -1033242179;
                        break;
                    case -957889233:
                    default:
                        var1 ^= 1310673173;
                        break;
                    case 1514403680:
                        var1 ^= -765413313;
                }
            } else {
                label85: {
                    var1 += 1226866549;
                    var1 &= 494864982;
                    var1 ^= -1366673759;
                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var97;
                    int var63 = (var97 = var3 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                    if (var63 != 0) {
                        break label83;
                    }

                    label71: {
                        String var64 = this.C;
                        boolean var65 = var64.isBlank();
                        if (!var65) {
                            var1 *= -918933247;
                            var1 ^= -1671816152;
                            int var66 = var1 + 1;
                            int var67 = var1 * var66;
                            int var4 = var1 + 2;
                            int var68 = var67 * var4;
                            var4 = var1 + 3;
                            int var69 = var68 * var4;
                            int var70 = var69 & 7;
                            if (var70 != 0) {
                                break label83;
                            }

                            String var71 = this.Kx;
                            Integer var79 = var2;
                            if (var79 == null) {
                                var1 *= 16874111;
                                var1 ^= -428258742;
                                break label85;
                            }

                            var1 += -2116578209;
                            var1 ^= -930852352;
                            var79 = var1;
                            if (var79 == null) {
                                break label83;
                            }

                            boolean var72 = var71.startsWith("spotify:ad:");
                            if (!var72) {
                                var1 &= -253383402;
                                var1 += 529239156;
                                var1 += -1852605708;
                                var1 ^= 1298779166;
                                String var73 = this.Kx;
                                boolean var74 = var73.startsWith("spotify:episode:");
                                int var81 = var2 + 1;
                                var81 = var2 * var81;
                                int var90 = var2 + 2;
                                var81 *= var90;
                                var2 += 3;
                                var81 *= var2;
                                var2 = var81 & 7;
                                if (var2 != 0) {
                                    var1 >>>= 23;
                                    var1 >>= 28;
                                    var1 ^= -899043139;
                                    break label85;
                                }

                                var1 ^= -1483666233;
                                var1 <<= 23;
                                var1 >>>= 6;
                                var1 ^= 329080803;
                                if (!var74) {
                                    var1 *= -1270127525;
                                    var1 ^= -562423568;
                                    var53 = true;
                                    var1 += -336378513;
                                    var1 *= -85002775;
                                    var1 ^= -1317312607;
                                    var1 |= 2138249464;
                                    var1 ^= -238876225;
                                    break label71;
                                }

                                var1 *= -1980053549;
                                var1 ^= -1462728832;
                            } else {
                                switch (var1) {
                                    case -1880516410:
                                        var1 ^= -1266357227;
                                        break;
                                    case -5071410:
                                    default:
                                        var1 ^= 75439774;
                                        break;
                                    case 1991046632:
                                        var1 >>= 24;
                                        var1 |= -1821311516;
                                        var1 &= 2006902741;
                                        var1 <<= 19;
                                        var1 ^= -859571559;
                                }
                            }
                        } else {
                            var1 ^= 2073702772;
                            var1 ^= 1064170828;
                        }

                        var53 = false;
                        var1 -= 2141540937;
                        var1 &= -1662639191;
                        var1 ^= -1910894522;
                    }

                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var7 = var3 + 2L;
                    var5 *= var7;
                    var3 += 3L;
                    var5 *= var3;
                    var3 = var5 & 7L;
                    long var98;
                    var1 = (var98 = var3 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return var53;
                    }
                    break label83;
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                AssertionError var57 = new AssertionError();
                throw var57;
            }
        }

        RuntimeException var50 = new RuntimeException();
        throw var50;
    }




    public String player() {
        int var1 = zl;
        var1 ^= -1055292046;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var16 = var4 & 1L;
        long var29;
        var2 = (var29 = var16 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 >>>= 27;
            var1 ^= -464362420;
            long var18 = var1;
            var4 = var18 + 1L;
            var4 = var18 * var4;
            long var6 = var18 + 2L;
            var4 *= var6;
            long var19 = var18 + 3L;
            var4 *= var19;
            long var20 = var4 & 7L;
            long var30;
            var2 = (var30 = var20 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            } else {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        } else {
            var1 >>>= 6;
            var1 &= 1554217263;
            var1 |= -1491118009;
            var1 ^= 1704263901;
            return this.N;
        }
    }

    public String trackId() {
        int var1 = zl;
        var1 ^= 1526092572;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var25;
        var2 = (var25 = var21 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        int var3 = of_2.p;
        var1 ^= var3;
        var1 ^= -1554133772;
        of_2.p = -1554133772;
        var3 = of_2.uY;
        var1 ^= var3;
        var1 ^= 803671914;
        of_2.uY = 803671914;
        if (var2 == 0) {
            switch (var1) {
                case -1528139329:
                    var1 ^= -798549235;
                    break;
                case 1602910138:
                default:
                    var1 ^= -1784916396;
                    break;
                case 2041391067:
                    var1 &= -1227607436;
                    var1 -= -658682035;
                    var1 ^= -1054625167;
            }

            return this.Kx;
        } else {
            var1 ^= 1111903355;
            var1 >>>= 6;
            var1 ^= -588319436;
            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        }
    }

    public String title() {
        int var1 = zl;
        var1 ^= -410687890;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var6 = var22 + 2L;
        var4 *= var6;
        long var23 = var22 + 3L;
        var4 *= var23;
        long var24 = var4 & 7L;
        long var33;
        var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 218713033;
            var1 ^= 1532096912;
            var1 += 628774604;
            var1 ^= -869800548;
            var1 ^= 10396984;
            return this.C;
        } else {
            var1 += 1376919606;
            var1 *= 601092685;
            var1 += 1134852237;
            var1 ^= 1032310864;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            } else {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }
    }

    public String artist() {
        int var1 = zl;
        var1 ^= 1028997705;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 ^= -981885832;
            var1 *= 1654002749;
            var1 += 1186207937;
            var1 &= -1351762207;
            var1 ^= 1305247439;
            return this.I;
        } else {
            var1 >>= 13;
            var1 ^= -1273946127;
            long var8 = var1;
            long var3 = var8 + 1L;
            var3 = var8 * var3;
            long var9 = var3 & 1L;
            long var20;
            var1 = (var20 = var9 - 0L) == 0L ? 0 : (var20 < 0L ? -1 : 1);
            if (var1 != 0) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            } else {
                IllegalArgumentException var11 = new IllegalArgumentException();
                throw var11;
            }
        }
    }

    public String album() {
        int var1 = zl;
        var1 ^= -1853522501;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 != null) {
            var1 *= -1955847883;
            var1 |= -8373470;
            var1 ^= -1337281847;
            return this.u;
        } else {
            var1 &= -1272204289;
            var1 ^= -1560577479;
            Integer var6 = var1;
            if (var6 != null) {
                IllegalArgumentException var8 = new IllegalArgumentException();
                throw var8;
            } else {
                IllegalStateException var7 = new IllegalStateException();
                throw var7;
            }
        }
    }

    public long durationMs() {
        int var1 = zl;
        var1 ^= 1827385793;
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
            var1 *= -1266771081;
            var1 >>= 17;
            var1 ^= -1044519789;
            var1 *= -504399739;
            var1 ^= 279166575;
            AssertionError var22 = new AssertionError();
            throw var22;
        } else {
            var1 <<= 26;
            var1 ^= -556900897;
            Integer var11 = var1;
            if (var11 != null) {
                return this.o;
            } else {
                AssertionError var12 = new AssertionError();
                throw var12;
            }
        }
    }

    public long positionMs() {
        int var1 = zl;
        var1 ^= 700173763;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= 1280962975;
            var1 -= -918594778;
            var1 += 1817146617;
            var1 ^= -1320924188;
            long var20 = var1;
            long var28 = var20 + 1L;
            long var29 = var20 * var28;
            long var21 = var29 & 1L;
            long var30;
            var2 = (var30 = var21 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.WK;
            }
        } else {
            long var13 = switch (var1) {
                default -> var1 ^ 1448201084;
                case 182499588 -> {
                    var1 >>= 14;
                    yield var1 ^ -1935052671;
                }
                case 928589687 -> var1 ^ 583189799;
            };
            long var26 = var13 + 1L;
            long var27 = var13 * var26;
            long var14 = var27 & 1L;
            long var31;
            var1 = (var31 = var14 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }

    public long sampledAtMs() {
        int var1 = zl;
        var1 ^= 1281818889;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var31;
        var2 = (var31 = var20 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1218583281;
            var1 += 2075006064;
            var1 |= -27345323;
            var1 += -1689204138;
            var1 ^= -96004340;
            long var22 = var1;
            var4 = var22 + 1L;
            var4 = var22 * var4;
            long var23 = var4 & 1L;
            long var32;
            var2 = (var32 = var23 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        } else {
            var1 *= -929480015;
            var1 ^= -1659030232;
            Integer var16 = var1;
            if (var16 != null) {
                return this.k;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public boolean playing() {
        int var1 = zl;
        var1 ^= -1925369316;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var34;
        var2 = (var34 = var19 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        if (var2 == 0) {
            long var21 = switch (var1) {
                case -1369028901 -> {
                    var1 &= 1765494361;
                    var1 >>>= 12;
                    var1 += -410200747;
                    var1 += -527175125;
                    yield var1 ^ -311574185;
                }
                default -> var1 ^ -1290931927;
                case 1151883758 -> var1 ^ -305752516;
            };
            var4 = var21 + 1L;
            var4 = var21 * var4;
            var6 = var21 + 2L;
            var4 *= var6;
            long var22 = var21 + 3L;
            var4 *= var22;
            long var23 = var4 & 7L;
            long var35;
            var2 = (var35 = var23 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.xo;
            } else {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        } else {
            var1 -= 1686602781;
            var1 ^= -987408578;
            RuntimeException var11 = new RuntimeException();
            throw var11;
        }
    }

    public String artKey() {
        int var1 = zl;
        var1 ^= 374528177;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var26;
        var2 = (var26 = var18 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1665171490;
            var1 -= 1417569757;
            var1 |= 1098690664;
            var1 &= -1415661790;
            var1 ^= 797989325;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            } else {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            }
        } else {
            var1 |= -618220270;
            var1 += 2131620943;
            var1 += -132254365;
            var1 *= 1063772297;
            var1 ^= 477782781;
            return this.Y;
        }
    }

    public boolean canSeek() {
        int var1 = zl;
        var1 ^= -858399102;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var35;
        var2 = (var35 = var23 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 != 0) {
            long var25 = switch (var1) {
                default -> var1 ^ -1552179238;
                case -275862971 -> {
                    var1 += -736322934;
                    var1 &= -369894593;
                    yield var1 ^ -1737394379;
                }
                case 1212642735 -> var1 ^ -225274068;
            };
            var4 = var25 + 1L;
            var4 = var25 * var4;
            long var26 = var4 & 1L;
            long var36;
            var2 = (var36 = var26 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var28 = new RuntimeException();
                throw var28;
            }
        } else {
            long var17 = switch (var1) {
                case -275862971 -> {
                    var1 *= 977379011;
                    var1 *= -1152227889;
                    var1 &= -274710185;
                    var1 += 275748163;
                    yield var1 ^ 766094707;
                }
                default -> var1 ^ -1056432894;
                case 2098303069 -> var1 ^ -785194400;
            };
            long var3 = var17 + 1L;
            var3 = var17 * var3;
            long var18 = var3 & 1L;
            long var37;
            var1 = (var37 = var18 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.uI;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -337645803;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        zl = var4;
    }
}
