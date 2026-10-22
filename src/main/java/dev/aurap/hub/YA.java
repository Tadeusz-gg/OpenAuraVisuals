package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.StringConcatFactory;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.LongSupplier;

public final class YA implements Co {
    private static final String Qq = "\u001f";
    public static final String FORMAT;
    private final String wR;
    private final LongSupplier p;
    private Boolean h;
    public static final int WA;

    public YA(boolean var1, LongSupplier var2) {
        String var3;
        if (var1) {
            var3 = "spotify,%any";
        } else {
            var3 = "spotify";
        }

        this.wR = var3;
        this.p = var2;
    }

    @Override
    public String name() {
        int var1 = System.identityHashCode(this);
        return "Spotify";
    }

    @Override
    public FX poll() throws IOException {
        int var1 = WA;
        var1 ^= 482614248;
        int var2 = System.identityHashCode(this);
        long var3 = var2;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        long var7 = var3 + 2L;
        var5 *= var7;
        var3 += 3L;
        var5 *= var3;
        var3 = var5 & 7L;
        long var164;
        int var88 = (var164 = var3 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
        label132:
        if (var88 == 0) {
            var1 = switch (var1) {
                case -1989635778 -> var1 ^ 1980960644;
                case -1510707844 -> {
                    var1 += -138808954;
                    yield var1 ^ 1416587303;
                }
                default -> var1 ^ -827641594;
            };
            var3 = var1;
            var5 = var3 + 1L;
            var5 = var3 * var5;
            var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var165;
            int var92 = (var165 = var3 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
            label128:
            if (var92 == 0) {
                Boolean var93 = this.h;
                if (var93 == null) {
                    var1 = switch (var1) {
                        case -910084315 -> {
                            var1 ^= -1941446577;
                            var1 &= -450492255;
                            var1 ^= 76901808;
                            yield var1 ^ -1188780577;
                        }
                        default -> var1 ^ -1704420308;
                        case 1416559627 -> var1 ^ 1495958524;
                    };
                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var166;
                    int var96 = (var166 = var3 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                    if (var96 != 0) {
                        break label128;
                    }

                    boolean var97 = CG.VM("playerctl");
                    Boolean var98 = var97;
                    int var4 = var2 + 1;
                    var4 = var2 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        switch (var1) {
                            case -1542632389:
                                var1 ^= -654521920;
                                break label132;
                            case -122173361:
                                var1 ^= -2116731782;
                                var1 &= 752110284;
                                var1 -= -502064538;
                                var1 |= 1478528717;
                                var1 ^= 1154425046;
                                break label132;
                            case 1631700454:
                            default:
                                var1 ^= -1728826352;
                                break label132;
                        }
                    }

                    var1 += -1901820095;
                    var1 += 1511280273;
                    var1 *= -1007191495;
                    var1 ^= 1284175476;
                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        break label128;
                    }

                    this.h = var98;
                    var1 *= 1389518779;
                    var1 &= -412973064;
                    var1 *= 1069804569;
                    var1 ^= 1177645369;
                } else {
                    var1 <<= 10;
                    var1 ^= 708455969;
                }

                Boolean var99 = this.h;
                boolean var100 = var99;
                Integer var125 = var2;
                if (var125 == null) {
                    var1 &= 2053726173;
                    var1 ^= 771250980;
                    var1 ^= 494587436;
                    break label132;
                }

                var1 *= -1108283135;
                var1 ^= -690911449;
                long var126 = var1;
                long var6 = var126 + 1L;
                var6 = var126 * var6;
                long var8 = var126 + 2L;
                var6 *= var8;
                long var127 = var126 + 3L;
                var6 *= var127;
                long var128 = var6 & 7L;
                long var167;
                int var129 = (var167 = var128 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                if (var129 == 0) {
                    if (!var100) {
                        var1 ^= 122259417;
                        var1 -= -1606539538;
                        var1 >>>= 19;
                        var1 >>= 8;
                        var1 ^= -609593279;
                        int var101 = var1 + 1;
                        int var102 = var1 * var101;
                        int var103 = var102 & 1;
                        if (var103 == 0) {
                            this.h = null;
                            int var104 = var2 + 1;
                            int var105 = var2 * var104;
                            var129 = var2 + 2;
                            int var106 = var105 * var129;
                            var129 = var2 + 3;
                            int var107 = var106 * var129;
                            int var108 = var107 & 7;
                            if (var108 != 0) {
                                switch (var1) {
                                    case -1966363894:
                                        var1 ^= 739600657;
                                        break label132;
                                    case -609593249:
                                        var1 += -1169874154;
                                        var1 ^= -1894910852;
                                        break label132;
                                    case 1749935112:
                                    default:
                                        var1 ^= 719510656;
                                        break label132;
                                }
                            }

                            var1 >>>= 16;
                            var1 -= 2125351860;
                            var1 += 2037119580;
                            var1 += 1810671191;
                            var1 ^= -1117766054;
                            int var109 = var1 + 1;
                            int var110 = var1 * var109;
                            int var111 = var110 & 1;
                            if (var111 == 0) {
                                H var132 = H.MISSING_TOOL;
                                yq var112 = new yq(var132, "Install playerctl to show what Spotify plays");
                                throw var112;
                            }
                        }
                    } else {
                        var1 <<= 4;
                        var1 |= -1548152129;
                        var1 *= 1847052399;
                        var1 ^= -589984851;
                        Integer var113 = var1;
                        if (var113 != null) {
                            String var114 = this.wR;
                            String var115 = "--player=" + var114;
                            String var133 = FORMAT;
                            Integer var149 = var2;
                            if (var149 == null) {
                                switch (var1) {
                                    case -1440270822:
                                        var1 ^= 1740682730;
                                        break label132;
                                    case 911232320:
                                    default:
                                        var1 ^= 653687745;
                                        break label132;
                                    case 1041973052:
                                        var1 ^= 2006668363;
                                        var1 |= -1398019926;
                                        var1 *= -1476894577;
                                        var1 ^= 695401592;
                                        break label132;
                                }
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ 592653676;
                                case 1041973052 -> {
                                    var1 -= 566996804;
                                    yield var1 ^ -669234927;
                                }
                                case 1396448958 -> var1 ^ -1806552875;
                            };
                            var5 = var1;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var168;
                            int var152 = (var168 = var5 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                            if (var152 == 0) {
                                List var116 = List.of("playerctl", var115, "metadata", "--format", var133);
                                FN var117 = CG.XK(3000L, var116);
                                var129 = var117.exitCode();
                                if (var129 != 0) {
                                    var1 |= 1870908048;
                                    var1 -= -1780023511;
                                    var1 &= -2035233887;
                                    var1 -= -1986924159;
                                    var1 ^= -2004103653;
                                    var129 = var1 + 1;
                                    var129 = var1 * var129;
                                    var129 &= 1;
                                    if (var129 == 0) {
                                        return null;
                                    }
                                } else {
                                    var1 |= -435064393;
                                    var1 &= 1171231596;
                                    var1 ^= -997585480;
                                    String var118 = var117.stdout();
                                    String var119 = var118.strip();
                                    LongSupplier var138 = this.p;
                                    long var139 = var138.getAsLong();
                                    int var156 = var2 + 1;
                                    int var157 = var2 * var156;
                                    int var163 = var2 + 2;
                                    int var158 = var157 * var163;
                                    var2 += 3;
                                    int var159 = var158 * var2;
                                    var2 = var159 & 7;
                                    if (var2 != 0) {
                                        var1 &= -440968757;
                                        var1 ^= 1835993289;
                                        var1 ^= -150167808;
                                        break label132;
                                    }
                                    Integer var84 = switch (var1) {
                                        case -2134270252 -> {
                                            var1 <<= 18;
                                            yield var1 ^ 880812909;
                                        }
                                        case -46272124 -> var1 ^ 205462316;
                                        default -> var1 ^ -375059705;
                                    };
                                    if (var84 != null) {
                                        return Uo(var119, var139);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            RuntimeException var85 = new RuntimeException();
            throw var85;
        } else {
            switch (var1) {
                case -2000501198:
                default:
                    var1 ^= 1728987482;
                    break;
                case -1510707844:
                    var1 <<= 14;
                    var1 ^= 29200137;
                    break;
                case 1887860590:
                    var1 ^= 2134149950;
            }
        }

        UnsupportedOperationException var81 = new UnsupportedOperationException();
        throw var81;
    }

    @Override
    public void send(Ar var1) throws IOException {
        label92: {
            int var2 = WA;
            var2 ^= -393335264;
            int var3 = System.identityHashCode(this);
            String var5 = this.wR;
            var5 = "--player=" + var5;
            List var91 = List.of("playerctl", var5);
            ArrayList var4 = new ArrayList(var91);
            long var92 = var3;
            long var7 = var92 + 1L;
            var7 = var92 * var7;
            long var93 = var7 & 1L;
            long var134;
            int var94 = (var134 = var93 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
            if (var94 != 0) {
                var2 += 1341841747;
                var2 <<= 12;
                var2 ^= 1719208375;
            } else {
                label91: {
                    var2 |= -396818983;
                    var2 ^= 1383952202;
                    long var95 = var2;
                    var7 = var95 + 1L;
                    var7 = var95 * var7;
                    long var96 = var7 & 1L;
                    long var135;
                    int var97 = (var135 = var96 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                    if (var97 != 0) {
                        break label92;
                    }

                    int[] var98 = De.E;
                    Gu var6 = var1.kind();
                    int var107 = var6.ordinal();
                    int var99 = var98[var107];
                    label81:
                    switch (var99) {
                        case 1:
                            var2 -= -1650048042;
                            var2 -= -910388531;
                            var2 -= 1183907884;
                            var2 >>= 3;
                            var2 ^= 1087049289;
                            Integer var82 = var2;
                            if (var82 == null) {
                                break label92;
                            }

                            boolean var83 = var4.add("play-pause");
                            var2 -= -1625030808;
                            var2 *= 1231626831;
                            var2 |= -1407719185;
                            var2 += -1184377557;
                            var2 ^= -5643063;
                            break;
                        case 2:
                            var2 >>>= 23;
                            var2 |= -1417206737;
                            var2 ^= -1938861115;
                            var2 ^= -747747132;
                            boolean var81 = var4.add("next");
                            var2 -= -62899270;
                            var2 ^= 743382217;
                            var2 ^= -1937291794;
                            break;
                        case 3:
                            var2 *= -1071385791;
                            var2 ^= -998244636;
                            Integer var79 = var2;
                            if (var79 == null) {
                                break label92;
                            }

                            boolean var80 = var4.add("previous");
                            switch (var2) {
                                case -1790415981:
                                    var2 ^= -1775662567;
                                    var2 |= 1684614609;
                                    var2 |= -1118925781;
                                    var2 ^= -1478380008;
                                    break label81;
                                case 586338790:
                                    var2 ^= 1613123685;
                                    break label81;
                                case 1787077740:
                                default:
                                    var2 ^= 478066998;
                                    break label81;
                            }
                        case 4:
                            var2 = switch (var2) {
                                case -1417530697 -> {
                                    var2 ^= 2122609290;
                                    var2 |= 622569978;
                                    yield var2 ^ 1787782800;
                                }
                                case -1101757006 -> var2 ^ 340021200;
                                default -> var2 ^ -13241523;
                            };
                            List var104 = List.of("position", "0");
                            int var109 = var3 + 1;
                            int var110 = var3 * var109;
                            int var122 = var3 + 2;
                            int var111 = var110 * var122;
                            var3 += 3;
                            int var112 = var111 * var3;
                            var3 = var112 & 7;
                            if (var3 != 0) {
                                var2 &= -1202458867;
                                var2 ^= 1841952442;
                                break label91;
                            }

                            var2 &= -467729455;
                            var2 += -32818627;
                            var2 <<= 4;
                            var2 ^= -1142184136;
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var3 &= 1;
                            if (var3 != 0) {
                                break label92;
                            }

                            boolean var78 = var4.addAll(var104);
                            var2 ^= 165690659;
                            var2 += -1492475858;
                            var2 |= 2142345225;
                            var2 ^= 662545866;
                            break;
                        case 5:
                            var2 >>= 27;
                            var2 &= -1068440457;
                            var2 ^= -1921652958;
                            Locale var100 = Locale.ROOT;
                            Object[] var108 = new Object[1];
                            var7 = var1.argument();
                            double var119 = var7;
                            long var9 = var3;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var136;
                            int var125 = (var136 = var9 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                            if (var125 != 0) {
                                switch (var2) {
                                    case -2000786027:
                                        var2 ^= 251214812;
                                        break label91;
                                    case -862787097:
                                    default:
                                        var2 ^= -2063619700;
                                        break label91;
                                    case 1294271319:
                                        var2 >>= 20;
                                        var2 *= -1057498633;
                                        var2 ^= -687467009;
                                        var2 ^= 141018326;
                                        break label91;
                                }
                            }
                            var2 = switch (var2) {
                                case -6324971 -> var2 ^ 1445519868;
                                case 1294271319 -> {
                                    var2 &= 238724211;
                                    var2 += -667107249;
                                    var2 |= -1124812795;
                                    yield var2 ^ 1007765747;
                                }
                                default -> var2 ^ 86490501;
                            };
                            var9 = var2;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var137;
                            int var128 = (var137 = var9 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var128 != 0) {
                                break label92;
                            }

                            double var120 = var119 / 1000.0;
                            Double var121 = var120;
                            var108[0] = var121;
                            var5 = String.format(var100, "%.3f", var108);
                            List var102 = List.of("position", var5);
                            boolean var103 = var4.addAll(var102);
                            var2 *= -869875229;
                            var2 ^= 967112095;
                            break;
                        default:
                            var2 |= 146489977;
                            var2 |= -1916116719;
                            var2 -= -475362190;
                            var2 += -85391355;
                            var2 ^= -1615350671;
                    }

                    long var66 = var2;
                    long var105 = var66 + 1L;
                    long var106 = var66 * var105;
                    long var67 = var106 & 1L;
                    long var138;
                    var2 = (var138 = var67 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        FN var69 = CG.XK(3000L, var4);
                        return;
                    }
                    break label92;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var113 = var2 + 2;
            var3 *= var113;
            var113 = var2 + 3;
            var3 *= var113;
            var3 &= 7;
            if (var3 == 0) {
                IllegalStateException var89 = new IllegalStateException();
                throw var89;
            }
        }

        AssertionError var72 = new AssertionError();
        throw var72;
    }

    public static FX Uo(String var0, long var1) {
        int var3 = WA;
        var3 ^= -1034723704;
        int var4 = System.identityHashCode(var0);
        String[] var5 = var0.split("\u001f", -1);
        Integer var6 = var4;
        if (var6 == null) {
            var3 ^= -1609416147;
            var3 ^= -473606327;
            var3 &= 153646616;
            var3 ^= 1750237507;
        } else {
            label324: {
                var3 >>>= 15;
                var3 |= 131111206;
                var3 ^= 673239442;
                int var221 = var3 + 1;
                var221 = var3 * var221;
                int var7 = var3 + 2;
                var221 *= var7;
                var7 = var3 + 3;
                var221 *= var7;
                var221 &= 7;
                if (var221 == 0) {
                    var221 = var5.length;
                    if (var221 < 9) {
                        var3 |= -2121117175;
                        var3 *= -939493037;
                        var3 &= 534538405;
                        var3 ^= 1773478583;
                        Integer var229 = var3;
                        if (var229 != null) {
                            return null;
                        }
                    } else {
                        var3 += -661773764;
                        var3 |= 1096458821;
                        var3 |= 649495605;
                        var3 ^= -1253670607;
                        String var227 = var5[0];
                        boolean var228 = var227.equals("playing");
                        var7 = var4 + 1;
                        var7 = var4 * var7;
                        int var8 = var4 + 2;
                        var7 *= var8;
                        var8 = var4 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            var3 <<= 8;
                            var3 ^= -670731941;
                            break label324;
                        }
                        var3 = switch (var3) {
                            case -1493733661 -> var3 ^ -173254023;
                            case -625444924 -> {
                                var3 &= -2138937880;
                                var3 *= -927491389;
                                var3 &= -383184163;
                                yield var3 ^ -1233507701;
                            }
                            default -> var3 ^ 1006494685;
                        };
                        Integer var236 = var3;
                        label293:
                        if (var236 != null) {
                            if (!var228) {
                                var3 |= 1675244583;
                                var3 >>= 3;
                                var3 -= -1095420064;
                                var3 ^= 1982262522;
                                String var237 = var5[0];
                                long var258 = var4;
                                long var10 = var258 + 1L;
                                var10 = var258 * var10;
                                long var259 = var10 & 1L;
                                long var430;
                                var8 = (var430 = var259 - 0L) == 0L ? 0 : (var430 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    var3 ^= -486633875;
                                    var3 ^= -1491520230;
                                    var3 |= 345376870;
                                    var3 *= -1801055399;
                                    var3 ^= -2076992547;
                                    break label324;
                                }

                                var3 *= -1406252599;
                                var3 <<= 11;
                                var3 ^= 1299132992;
                                long var261 = var3;
                                var10 = var261 + 1L;
                                var10 = var261 * var10;
                                long var262 = var10 & 1L;
                                long var431;
                                var8 = (var431 = var262 - 0L) == 0L ? 0 : (var431 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    break label293;
                                }

                                boolean var238 = var237.equals("paused");
                                if (!var238) {
                                    var3 |= 1592901274;
                                    var3 ^= 810855259;
                                    var3 ^= -314760639;
                                    var236 = var3;
                                    if (var236 != null) {
                                        return null;
                                    }
                                    break label293;
                                }

                                var3 ^= -1765118156;
                                var3 += -683623526;
                                var3 ^= -605870827;
                            } else {
                                var3 ^= 244761920;
                                var3 *= -302452671;
                                var3 ^= 2144723222;
                                var3 ^= 307332934;
                            }

                            long var240 = var3;
                            long var9 = var240 + 1L;
                            var9 = var240 * var9;
                            long var11 = var240 + 2L;
                            var9 *= var11;
                            long var241 = var240 + 3L;
                            var9 *= var241;
                            long var242 = var9 & 7L;
                            long var432;
                            int var243 = (var432 = var242 - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
                            label284:
                            if (var243 == 0) {
                                String var244 = var5[3];
                                int var245 = var244.isBlank() ? 1 : 0;
                                Integer var264 = var4;
                                if (var264 != null) {
                                    var3 = switch (var3) {
                                        case -702528485 -> {
                                            var3 ^= 2019689441;
                                            var3 *= -652599365;
                                            var3 |= 400325966;
                                            var3 -= -801901045;
                                            yield var3 ^ 661215085;
                                        }
                                        default -> var3 ^ -403492000;
                                        case 1698064654 -> var3 ^ 895381539;
                                    };
                                    long var265 = var3;
                                    long var327 = var265 + 1L;
                                    var327 = var265 * var327;
                                    long var12 = var265 + 2L;
                                    var327 *= var12;
                                    long var266 = var265 + 3L;
                                    var327 *= var266;
                                    long var267 = var327 & 7L;
                                    long var433;
                                    int var268 = (var433 = var267 - 0L) == 0L ? 0 : (var433 < 0L ? -1 : 1);
                                    if (var268 != 0) {
                                        break label284;
                                    }

                                    if (var245 != 0) {
                                        long var254 = switch (var3) {
                                            case -389852994 -> {
                                                var3 *= 773750907;
                                                yield var3 ^ 1789958769;
                                            }
                                            default -> var3 ^ 718475060;
                                            case 684622274 -> var3 ^ 1185947789;
                                        };
                                        var9 = var254 + 1L;
                                        var9 = var254 * var9;
                                        long var255 = var9 & 1L;
                                        long var434;
                                        var245 = (var434 = var255 - 0L) == 0L ? 0 : (var434 < 0L ? -1 : 1);
                                        if (var245 == 0) {
                                            return null;
                                        }
                                        break label284;
                                    }

                                    var3 *= -964460109;
                                    var3 ^= 179905066;
                                    Integer var246 = var3;
                                    if (var246 == null) {
                                        break label284;
                                    }

                                    String var247 = var5[1];
                                    long var269 = var4;
                                    var327 = var269 + 1L;
                                    var327 = var269 * var327;
                                    var12 = var269 + 2L;
                                    var327 *= var12;
                                    long var270 = var269 + 3L;
                                    var327 *= var270;
                                    long var271 = var327 & 7L;
                                    long var435;
                                    var268 = (var435 = var271 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
                                    if (var268 == 0) {
                                        var3 = switch (var3) {
                                            case -764777426 -> var3 ^ -1554616633;
                                            default -> var3 ^ 1274067563;
                                            case 2076315888 -> {
                                                var3 ^= -895686651;
                                                yield var3 ^ 1503387286;
                                            }
                                        };
                                        Locale var273 = Locale.ROOT;
                                        String var248 = var247.toLowerCase(var273);
                                        boolean var249 = var248.startsWith("spotify");
                                        String var253;
                                        if (var249) {
                                            var3 <<= 27;
                                            var3 &= -57182830;
                                            var3 &= 1445329303;
                                            var3 -= -342682467;
                                            var3 ^= -1487582282;
                                            long var250 = var3;
                                            var9 = var250 + 1L;
                                            var9 = var250 * var9;
                                            long var251 = var9 & 1L;
                                            long var436;
                                            int var252 = (var436 = var251 - 0L) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                                            if (var252 != 0) {
                                                break label284;
                                            }

                                            var253 = "Spotify";
                                            var3 += 1104232430;
                                            var3 -= 1972118701;
                                            var3 <<= 15;
                                            var3 ^= -1656377647;
                                        } else {
                                            var3 = switch (var3) {
                                                default -> var3 ^ -128914293;
                                                case -389732765 -> {
                                                    var3 >>= 15;
                                                    var3 |= 209436786;
                                                    var3 ^= -1894440472;
                                                    yield var3 ^ 788227360;
                                                }
                                                case 530134839 -> var3 ^ -318721799;
                                            };
                                            long var274 = var3;
                                            var327 = var274 + 1L;
                                            var327 = var274 * var327;
                                            long var275 = var327 & 1L;
                                            long var437;
                                            var268 = (var437 = var275 - 0L) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                                            if (var268 != 0) {
                                                break label284;
                                            }

                                            String var277 = var5[1];
                                            Integer var302 = var4;
                                            if (var302 == null) {
                                                var3 >>>= 21;
                                                var3 ^= 1618130859;
                                                break label324;
                                            }

                                            var3 += 436162194;
                                            var3 -= -1745201622;
                                            var3 ^= -1160833234;
                                            int var278 = (var277.isEmpty()) ? 1 : 0;
                                            if (var278 != 0) {
                                                var3 -= 1320821730;
                                                var3 ^= -1238286307;
                                                var253 = "Media";
                                                var3 *= -1377268913;
                                                var3 &= 1238925522;
                                                var3 ^= -875123183;
                                            } else {
                                                var3 <<= 8;
                                                var3 >>= 22;
                                                var3 ^= -1123321058;
                                                var3 ^= -1333744118;
                                                var3 ^= -277150137;
                                                var278 = var3 + 1;
                                                var278 = var3 * var278;
                                                var278 &= 1;
                                                if (var278 != 0) {
                                                    break label284;
                                                }

                                                String var282 = var5[1];
                                                char var283 = var282.charAt(0);
                                                var283 = Character.toUpperCase(var283);
                                                String var303 = var5[1];
                                                int var337 = var4 + 1;
                                                int var338 = var4 * var337;
                                                int var355 = var4 + 2;
                                                int var339 = var338 * var355;
                                                int var356 = var4 + 3;
                                                int var340 = var339 * var356;
                                                int var341 = var340 & 7;
                                                if (var341 != 0) {
                                                    var3 ^= 2012170618;
                                                    var3 ^= -1505396433;
                                                    var3 |= -1422298468;
                                                    var3 &= 1115731230;
                                                    var3 ^= 586318151;
                                                    break label324;
                                                }
                                                var3 = switch (var3) {
                                                    case -1996909168 -> var3 ^ 349557965;
                                                    default -> var3 ^ 1941279996;
                                                    case 487533621 -> {
                                                        var3 += -1240011983;
                                                        var3 -= 794920833;
                                                        var3 ^= 71055427;
                                                        yield var3 ^ -637866889;
                                                    }
                                                };
                                                Integer var342 = var3;
                                                if (var342 == null) {
                                                    break label284;
                                                }

                                                String var304 = var303.substring(1);
                                                String var285 = var283 + var304;
                                                var253 = var285;
                                                var3 ^= 294374598;
                                                var3 += -972739904;
                                                var3 &= 1835467477;
                                                var3 ^= -431444476;
                                            }
                                        }

                                        long var286 = var3;
                                        var327 = var286 + 1L;
                                        var327 = var286 * var327;
                                        long var287 = var327 & 1L;
                                        long var438;
                                        var268 = (var438 = var287 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                                        if (var268 == 0) {
                                            String var289 = var5[2];
                                            int var290 = (var289.startsWith("/com/spotify/track/")) ? 1 : 0;
                                            int var305 = var4 + 1;
                                            int var306 = var4 * var305;
                                            int var307 = var306 & 1;
                                            if (var307 != 0) {
                                                var3 >>>= 10;
                                                var3 |= 1598281220;
                                                var3 += -1913589857;
                                                var3 *= 1904432725;
                                                var3 ^= 2015811005;
                                                break label324;
                                            }

                                            var3 >>>= 23;
                                            var3 ^= -656007862;
                                            String var294;
                                            if (var290 != 0) {
                                                var3 -= -406456496;
                                                var3 &= 349616616;
                                                var3 *= -1169385469;
                                                var3 ^= 557432663;
                                                String var291 = var5[2];
                                                int var308 = "/com/spotify/track/".length();
                                                String var292 = var291.substring(var308);
                                                int var309 = var4 + 1;
                                                int var310 = var4 * var309;
                                                int var311 = var310 & 1;
                                                if (var311 != 0) {
                                                    var3 *= 1309152301;
                                                    var3 += 1476660118;
                                                    var3 ^= 699252546;
                                                    break label324;
                                                }

                                                var3 *= -436703737;
                                                var3 &= -1865513053;
                                                var3 >>= 14;
                                                var3 >>= 31;
                                                var3 ^= 2125207958;
                                                Integer var312 = var3;
                                                if (var312 == null) {
                                                    break label284;
                                                }

                                                String var293 = "spotify:track:" + var292;
                                                var294 = var293;
                                                var3 *= 33037899;
                                                var3 ^= 119773681;
                                            } else {
                                                var3 &= 522067665;
                                                var3 ^= 2077728197;
                                                var3 ^= -754313897;
                                                int var313 = var3 + 1;
                                                int var314 = var3 * var313;
                                                int var345 = var3 + 2;
                                                int var315 = var314 * var345;
                                                int var346 = var3 + 3;
                                                int var316 = var315 * var346;
                                                int var317 = var316 & 7;
                                                if (var317 != 0) {
                                                    break label284;
                                                }

                                                String var318 = var5[2];
                                                int var347 = var4 + 1;
                                                int var348 = var4 * var347;
                                                int var349 = var348 & 1;
                                                if (var349 != 0) {
                                                    var3 -= -1611786819;
                                                    var3 *= 2041311673;
                                                    var3 ^= -1440543754;
                                                    break label324;
                                                }

                                                var3 *= 1683811317;
                                                var3 ^= -346753862;
                                                var294 = var318;
                                                var3 >>>= 12;
                                                var3 += -1323644709;
                                                var3 ^= -515352875;
                                            }

                                            String var319 = var5[6];
                                            int var350 = var3 ^ -297730449;
                                            int var351 = var350 << 19;
                                            int var352 = var351 - -837091323;
                                            int var353 = var352 - -846618297;
                                            int var354 = var353 ^ 1918016314;
                                            var9 = v(var319, var354);
                                            String var357 = var5[7];
                                            int var361 = var3 | -165914074;
                                            int var362 = var361 ^ 728668856;
                                            var11 = v(var357, var362);
                                            long var13 = var4;
                                            long var15 = var13 + 1L;
                                            var15 = var13 * var15;
                                            long var17 = var13 + 2L;
                                            var15 *= var17;
                                            var13 += 3L;
                                            var15 *= var13;
                                            var13 = var15 & 7L;
                                            long var439;
                                            int var365 = (var439 = var13 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                                            if (var365 != 0) {
                                                var3 -= 484811437;
                                                var3 -= -179045539;
                                                var3 -= -1248758359;
                                                var3 ^= -388565468;
                                                break label324;
                                            }

                                            var3 += 2026403288;
                                            var3 -= -67581492;
                                            var3 ^= -2132174682;
                                            int var366 = var3 + 1;
                                            int var367 = var3 * var366;
                                            int var14 = var3 + 2;
                                            int var368 = var367 * var14;
                                            var14 = var3 + 3;
                                            int var369 = var368 * var14;
                                            int var370 = var369 & 7;
                                            if (var370 == 0) {
                                                String var371 = var5[8];
                                                boolean var372 = var371.startsWith("");
                                                String var377;
                                                if (var372) {
                                                    var3 ^= 965190538;
                                                    var3 &= 138606154;
                                                    var3 += 1521854629;
                                                    var3 ^= -529515488;
                                                    var3 ^= 512783828;
                                                    Integer var373 = var3;
                                                    if (var373 == null) {
                                                        break label284;
                                                    }

                                                    String var374 = var5[8];
                                                    var14 = var4 + 1;
                                                    var14 = var4 * var14;
                                                    int var402 = var4 + 2;
                                                    var14 *= var402;
                                                    int var403 = var4 + 3;
                                                    var14 *= var403;
                                                    var14 &= 7;
                                                    if (var14 != 0) {
                                                        var3 |= 454739658;
                                                        var3 ^= -546479488;
                                                        break label324;
                                                    }

                                                    var3 <<= 9;
                                                    var3 <<= 2;
                                                    var3 <<= 6;
                                                    var3 ^= -1144184260;
                                                    var14 = var3 + 1;
                                                    var14 = var3 * var14;
                                                    var14 &= 1;
                                                    if (var14 != 0) {
                                                        break label284;
                                                    }

                                                    String var375 = var374.substring(31);
                                                    String var376 = var375;
                                                    var377 = var376;
                                                    var3 += 861859861;
                                                    var3 <<= 5;
                                                    var3 ^= -1164998347;
                                                } else {
                                                    var3 >>= 14;
                                                    var3 *= 1782300851;
                                                    var3 &= 1298048712;
                                                    var3 <<= 20;
                                                    var3 ^= 2057437100;
                                                    var14 = var3 + 1;
                                                    var14 = var3 * var14;
                                                    int var404 = var3 + 2;
                                                    var14 *= var404;
                                                    int var405 = var3 + 3;
                                                    var14 *= var405;
                                                    var14 &= 7;
                                                    if (var14 != 0) {
                                                        break label284;
                                                    }

                                                    String var392 = var5[8];
                                                    var15 = var4;
                                                    var17 = var15 + 1L;
                                                    var17 = var15 * var17;
                                                    var15 = var17 & 1L;
                                                    long var440;
                                                    int var408 = (var440 = var15 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                                                    if (var408 != 0) {
                                                        var3 |= -1138567338;
                                                        var3 ^= -1638839643;
                                                        break label324;
                                                    }

                                                    var3 |= 1195033453;
                                                    var3 >>= 23;
                                                    var3 <<= 5;
                                                    var3 ^= -1492104202;
                                                    Integer var409 = var3;
                                                    if (var409 == null) {
                                                        break label284;
                                                    }

                                                    var377 = var392;
                                                    switch (var3) {
                                                        case -1492099530:
                                                            var3 &= -1641667896;
                                                            var3 |= -257633755;
                                                            var3 -= 293229618;
                                                            var3 ^= -957890842;
                                                            break;
                                                        case 376082004:
                                                        default:
                                                            var3 ^= -1656150345;
                                                            break;
                                                        case 1719249951:
                                                            var3 ^= -212049766;
                                                    }
                                                }

                                                long var393 = var3;
                                                long var16 = var393 + 1L;
                                                var16 = var393 * var16;
                                                long var18 = var393 + 2L;
                                                var16 *= var18;
                                                long var394 = var393 + 3L;
                                                var16 *= var394;
                                                long var395 = var16 & 7L;
                                                long var441;
                                                var14 = (var441 = var395 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                                                if (var14 == 0) {
                                                    Integer var397 = var4;
                                                    if (var397 == null) {
                                                        var3 *= 1992727199;
                                                        var3 &= -300609534;
                                                        var3 |= 971892853;
                                                        var3 ^= -576758484;
                                                        break label324;
                                                    }

                                                    var3 -= 716357535;
                                                    var3 &= 413609815;
                                                    var3 &= 1403276661;
                                                    var3 ^= -421588320;
                                                    FX var398;
                                                    boolean var410 = var294.startsWith("/org/mpris/MediaPlayer2/TrackList/NoTrack");
                                                    String var412;
                                                    if (var410) {
                                                        var3 ^= -1053896364;
                                                        var3 &= 220654098;
                                                        var3 *= -1103462167;
                                                        var3 += -640434171;
                                                        var3 ^= 1272841676;
                                                        Integer var411 = var3;
                                                        if (var411 == null) {
                                                            break label284;
                                                        }

                                                        var412 = "";
                                                        var3 += 1140449110;
                                                        var3 *= -1357350297;
                                                        var3 ^= -1396890962;
                                                    } else {
                                                        var3 |= -1916447499;
                                                        var3 ^= -905598826;
                                                        Integer var416 = var3;
                                                        if (var416 == null) {
                                                            break label284;
                                                        }

                                                        var412 = var294;
                                                        var3 <<= 20;
                                                        var3 ^= 1550045655;
                                                    }

                                                    var16 = var3;
                                                    var18 = var16 + 1L;
                                                    var18 = var16 * var18;
                                                    long var20 = var16 + 2L;
                                                    var18 *= var20;
                                                    var16 += 3L;
                                                    var18 *= var16;
                                                    var16 = var18 & 7L;
                                                    long var442;
                                                    var290 = (var442 = var16 - 0L) == 0L ? 0 : (var442 < 0L ? -1 : 1);
                                                    if (var290 == 0) {
                                                        String var296 = var5[3];
                                                        String var420 = var5[4];
                                                        String var220 = var5[5];
                                                        Integer var216 = var4;
                                                        if (var216 == null) {
                                                            var3 *= 1536557217;
                                                            var3 *= -2047089961;
                                                            var3 *= -574377067;
                                                            var3 ^= -839186722;
                                                            break label324;
                                                        }

                                                        var3 &= 587819270;
                                                        var3 -= -486376657;
                                                        var3 ^= 1255371898;
                                                        var17 = var3;
                                                        long var19 = var17 + 1L;
                                                        var19 = var17 * var19;
                                                        var17 = var19 & 1L;
                                                        long var443;
                                                        int var217 = (var443 = var17 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                                                        if (var217 == 0) {
                                                            var9 /= 1000L;
                                                            var11 /= 1000L;
                                                            String var218 = zf.e(var377);
                                                            var398 = new FX(                                                                var253, var412, var296, var420, var220, var9, var11, var1, var228, var218, true                                                             );
                                                            return var398;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break label284;
                                    }

                                    switch (var3) {
                                        case -1857907051:
                                            var3 ^= -305235504;
                                            break label324;
                                        case -841738345:
                                        default:
                                            var3 ^= 1789269051;
                                            break label324;
                                        case 2076315888:
                                            var3 *= -1257018437;
                                            var3 ^= 366221835;
                                            break label324;
                                    }
                                }

                                var3 &= -186518820;
                                var3 -= -1667466148;
                                var3 -= 1687028207;
                                var3 ^= -1299745642;
                                break label324;
                            }
                        }
                    }
                }

                AssertionError var219 = new AssertionError();
                throw var219;
            }
        }

        UnsupportedOperationException var215 = new UnsupportedOperationException();
        throw var215;
    }

    private static long v(String var0, int var1) {
        String var5 = null;
        label60: {
            int var47;
            long var49;
            label59: {
                Throwable var2;
                int var7 = 0;
                label62: {
                    try {
                        Object var4 = null;
                        var47 = var1 & 792570623;
                        var47 += 60866207;
                        var47 &= -690386417;
                        var47 ^= -2124169998;
                        var5 = var0.strip();
                        var47 >>>= 8;
                        var47 ^= 1365780387;
                    } catch (Throwable var12) {
                        var2 = var12;
                        int var3 = WA;
                        int var16 = var3 ^ -1899191384;
                        var7 = (var12 instanceof NumberFormatException) ? 1 : 0;
                        int var17 = var16 & 143886674;
                        int var18 = var17 + 1405557141;
                        var47 = var18 ^ 994760577;
                        int var8 = var47 + 1;
                        var8 = var47 * var8;
                        int var9 = var47 + 2;
                        var8 *= var9;
                        var9 = var47 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label60;
                        }
                        break label62;
                    }

                    Integer var6 = var47;
                    if (var6 == null) {
                        break label60;
                    }

                    try {
                        var49 = Long.parseLong(var5);
                        var47 <<= 29;
                        var47 ^= -1532905024;
                        var47 |= -1844271941;
                        var47 ^= 847387262;
                        break label59;
                    } catch (Throwable var11) {
                        var2 = var11;
                        int var26 = WA;
                        int var27 = var26 ^ -1899191384;
                        var7 = (var11 instanceof NumberFormatException) ? 1 : 0;
                        int var28 = var27 & 143886674;
                        int var29 = var28 + 1405557141;
                        var47 = var29 ^ 994760577;
                        int var62 = var47 + 1;
                        var62 = var47 * var62;
                        int var68 = var47 + 2;
                        var62 *= var68;
                        var68 = var47 + 3;
                        var62 *= var68;
                        var62 &= 7;
                        if (var62 != 0) {
                            break label60;
                        }
                    }
                }

                if (var7 == 0) {
                    long var50 = switch (var47) {
                        case -2020065484 -> var47 ^ -2137232339;
                        default -> var47 ^ 746243574;
                        case 1864191268 -> {
                            var47 <<= 14;
                            var47 |= 369156147;
                            var47 >>= 11;
                            yield var47 ^ 92179195;
                        }
                    };
                    long var70 = var50 + 1L;
                    var70 = var50 * var70;
                    long var51 = var70 & 1L;
                    long var74;
                    var7 = (var74 = var51 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                    if (var7 == 0) {
                        throw UncheckedExceptions.rethrow(var2);
                    }
                } else {
                    var47 = switch (var47) {
                        case -423664507 -> var47 ^ -1060725725;
                        default -> var47 ^ -1774573864;
                        case 1864191268 -> {
                            var47 ^= -624187074;
                            var47 &= 1011870116;
                            var47 -= -1611864934;
                            var47 *= 1210326275;
                            yield var47 ^ 85123103;
                        }
                    };
                    var7 = var47 + 1;
                    var7 = var47 * var7;
                    var7 &= 1;
                    if (var7 == 0) {
                        NumberFormatException var48 = (NumberFormatException)var2;
                        var47 += 1692639078;
                        var47 |= 654176751;
                        var47 ^= -1629765668;
                        var47 &= 1281063215;
                        var47 ^= -1307689214;
                        long var56 = var47;
                        long var72 = var56 + 1L;
                        var72 = var56 * var72;
                        long var57 = var72 & 1L;
                        long var75;
                        int var13 = (var75 = var57 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                        if (var13 == 0) {
                            return 0L;
                        }
                    }
                }
                break label60;
            }

            Integer var14 = var47;
            if (var14 != null) {
                return var49;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 686100728;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        WA = var4;
        CharSequence[] var5 = new CharSequence[]{
            "{{lc(status)}}",
            "{{playerName}}",
            "{{mpris:trackid}}",
            "{{xesam:title}}",
            "{{xesam:artist}}",
            "{{xesam:album}}",
            "{{mpris:length}}",
            "{{position}}",
            "{{mpris:artUrl}}"
        };
        String var6 = String.join("\u001f", var5);
        FORMAT = var6;
    }
}
