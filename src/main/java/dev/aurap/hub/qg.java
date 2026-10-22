package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.LongSupplier;

public final class qg implements AutoCloseable {
    public static final long RESTART_GAP_MS = 10000L;
    private static final int F = 6291456;
    private static final int QX = 2048;
    private static final Set a;
    private final List Xq;
    private final Consumer N;
    private final LongSupplier gp;
    private Process q;
    private Writer Dh;
    private long p = Long.MIN_VALUE;
    private final StringBuilder t;
    public static final int Qk;

    public qg(List var1, Consumer var2, LongSupplier var3) {
        StringBuilder var4 = new StringBuilder();
        this.t = var4;
        this.Xq = var1;
        this.N = var2;
        this.gp = var3;
    }

    public synchronized boolean ensureRunning() throws IOException {
        int var1 = Qk;
        var1 ^= 170993223;
        int var2 = System.identityHashCode(this);
        Integer var3 = var2;
        if (var3 == null) {
            var1 -= 1434647641;
            var1 |= 1281245885;
            var1 ^= -1689233255;
        } else {
            label140: {
                label131: {
                    var1 -= 871329251;
                    var1 |= 1164815378;
                    var1 >>>= 13;
                    var1 |= 1454223429;
                    var1 ^= -919232272;
                    Process var94 = this.q;
                    if (var94 != null) {
                        var1 *= -1045794597;
                        var1 ^= 1331180297;
                        var3 = var1;
                        if (var3 == null) {
                            break label131;
                        }

                        Process var96 = this.q;
                        long var4 = var2;
                        long var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var172;
                        int var109 = (var172 = var4 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                        if (var109 != 0) {
                            var1 ^= 702025435;
                            var1 ^= 1434077601;
                            break label140;
                        }

                        var1 += 451045162;
                        var1 -= -378546711;
                        var1 ^= 659226554;
                        int var110 = var1 + 1;
                        int var111 = var1 * var110;
                        int var112 = var111 & 1;
                        if (var112 != 0) {
                            break label131;
                        }

                        boolean var97 = var96.isAlive();
                        if (var97) {
                            var1 >>= 3;
                            var1 ^= 8135500;
                            var3 = var1;
                            if (var3 != null) {
                                return true;
                            }
                            break label131;
                        }

                        var1 *= -1816521699;
                        var1 >>>= 14;
                        var1 ^= -1122450179;
                    } else {
                        var1 |= 116804799;
                        var1 ^= 585464887;
                    }

                    long var99 = var1;
                    long var5 = var99 + 1L;
                    var5 = var99 * var5;
                    long var100 = var5 & 1L;
                    long var173;
                    int var101 = (var173 = var100 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                    if (var101 == 0) {
                        LongSupplier var102 = this.gp;
                        long var103 = var102.getAsLong();
                        Process var119 = this.q;
                        int var142 = var2 + 1;
                        var142 = var2 * var142;
                        int var7 = var2 + 2;
                        var142 *= var7;
                        var7 = var2 + 3;
                        var142 *= var7;
                        var142 &= 7;
                        if (var142 != 0) {
                            switch (var1) {
                                case -1687806428:
                                default:
                                    var1 ^= -1606826886;
                                    break label140;
                                case -1122294904:
                                    var1 |= -151843649;
                                    var1 &= 794463298;
                                    var1 <<= 10;
                                    var1 += 1783730734;
                                    var1 ^= -1213226744;
                                    break label140;
                                case -614088817:
                                    var1 ^= 1806432285;
                                    break label140;
                            }
                        }

                        var1 *= -1622112887;
                        var1 ^= 948637817;
                        var142 = var1 + 1;
                        var142 = var1 * var142;
                        var142 &= 1;
                        label111:
                        if (var142 == 0) {
                            label138: {
                                if (var119 == null) {
                                    var1 = switch (var1) {
                                        default -> var1 ^ 929861332;
                                        case -403653711 -> {
                                            var1 >>= 6;
                                            var1 &= -741172306;
                                            yield var1 ^ -581253484;
                                        }
                                        case 2095715175 -> var1 ^ -153180882;
                                    };
                                    int var120 = var1 + 1;
                                    int var121 = var1 * var120;
                                    int var122 = var121 & 1;
                                    if (var122 != 0) {
                                        break label111;
                                    }

                                    var5 = this.p;
                                    long var174;
                                    int var124 = (var174 = var5 - Long.MIN_VALUE) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                                    var142 = var2 + 1;
                                    var142 = var2 * var142;
                                    var142 &= 1;
                                    if (var142 != 0) {
                                        var1 -= 862010246;
                                        var1 &= 1130283891;
                                        var1 >>>= 24;
                                        var1 ^= 1697528677;
                                        break label140;
                                    }

                                    var1 ^= -239362205;
                                    var1 >>>= 19;
                                    var1 *= 1070357887;
                                    var1 >>= 13;
                                    var1 ^= -2131753927;
                                    var142 = var1 + 1;
                                    var142 = var1 * var142;
                                    var7 = var1 + 2;
                                    var142 *= var7;
                                    var7 = var1 + 3;
                                    var142 *= var7;
                                    var142 &= 7;
                                    if (var142 != 0) {
                                        break label111;
                                    }

                                    if (var124 == 0) {
                                        var1 *= -1031793947;
                                        var1 ^= 616002468;
                                        break label138;
                                    }

                                    var1 >>= 26;
                                    var1 ^= -496854198;
                                } else {
                                    var1 *= 1663960379;
                                    var1 += 548995552;
                                    var1 ^= 1748098049;
                                }

                                int var125 = var1 + 1;
                                int var126 = var1 * var125;
                                int var127 = var126 & 1;
                                if (var127 != 0) {
                                    break label111;
                                }

                                var5 = this.p;
                                var5 = var103 - var5;
                                var7 = var2 + 1;
                                var7 = var2 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    switch (var1) {
                                        case 496854186:
                                            var1 -= -1137053230;
                                            var1 &= -607594233;
                                            var1 |= -2120853545;
                                            var1 -= 168048583;
                                            var1 ^= -755229898;
                                            break label140;
                                        case 632249520:
                                        default:
                                            var1 ^= 536342135;
                                            break label140;
                                        case 678663086:
                                            var1 ^= 1654704467;
                                            break label140;
                                    }
                                }

                                var1 |= 1324696881;
                                var1 *= -1198155195;
                                var1 *= 568820767;
                                var1 ^= 2079278425;
                                long var165 = var1;
                                long var9 = var165 + 1L;
                                var9 = var165 * var9;
                                long var11 = var165 + 2L;
                                var9 *= var11;
                                long var166 = var165 + 3L;
                                var9 *= var166;
                                long var167 = var9 & 7L;
                                long var175;
                                var7 = (var175 = var167 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label111;
                                }

                                long var176;
                                int var130 = (var176 = var5 - 10000L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                if (var130 < 0) {
                                    var1 &= 28481780;
                                    var1 ^= -267300296;
                                    var1 &= -140705361;
                                    var1 -= 1553821471;
                                    var1 ^= -1853959033;
                                    int var138 = var1 + 1;
                                    int var139 = var1 * var138;
                                    int var140 = var139 & 1;
                                    if (var140 == 0) {
                                        return false;
                                    }
                                    break label111;
                                }

                                var1 ^= -47604065;
                                var1 ^= 1346968324;
                            }

                            int var131 = var1 - 928762767;
                            int var132 = var131 ^ 357271372;
                            this.r(var132);
                            this.p = var103;
                            List var113 = this.Xq;
                            ProcessBuilder var104 = new ProcessBuilder(var113);
                            Process var105 = var104.start();
                            Process var106 = var105;
                            this.q = var106;
                            Set var114 = a;
                            int var133 = var2 + 1;
                            int var134 = var2 * var133;
                            var142 = var2 + 2;
                            int var135 = var134 * var142;
                            var2 += 3;
                            int var136 = var135 * var2;
                            var2 = var136 & 7;
                            if (var2 != 0) {
                                var1 ^= -1469028736;
                                var1 ^= -698301923;
                                break label140;
                            }

                            var1 &= 2065040865;
                            var1 ^= -489021830;
                            Integer var86 = var1;
                            if (var86 != null) {
                                boolean var87 = var114.add(var106);
                                CompletableFuture var88 = var106.onExit();
                                Runnable var115 = () -> {
                                    int var1x = Qk;
                                    var1x ^= 1737126235;
                                    int var2x = System.identityHashCode(var106);
                                    Integer var14x = var2x;
                                    if (var14x != null) {
                                        var1x -= 1799903342;
                                        var1x &= -2064705916;
                                        var1x += -540905880;
                                        var1x ^= 329498200;
                                        int var15x = var1x + 1;
                                        var15x = var1x * var15x;
                                        var15x &= 1;
                                        if (var15x == 0) {
                                            Set var19x = a;
                                            int var20x = (var19x.remove(var106)) ? 1 : 0;
                                        } else {
                                            AssertionError var18x = new AssertionError();
                                            throw var18x;
                                        }
                                    } else {
                                        switch (var1x) {
                                            case -1808224420:
                                            default:
                                                var1x ^= 392011639;
                                                break;
                                            case -286964134:
                                                var1x ^= 1479121585;
                                                break;
                                            case 1644169871:
                                                var1x -= -83338548;
                                                var1x >>>= 29;
                                                var1x ^= -146485217;
                                        }

                                        UnsupportedOperationException var9x = new UnsupportedOperationException();
                                        throw var9x;
                                    }
                                };
                                CompletableFuture var89 = var88.thenRun(var115);
                                OutputStream var116 = var106.getOutputStream();
                                Charset var137 = StandardCharsets.UTF_8;
                                OutputStreamWriter var90 = new OutputStreamWriter(var116, var137);
                                this.Dh = var90;
                                Runnable var117 = () -> {
                                    int var2x = Qk;
                                    var2x ^= -503945996;
                                    int var3x = System.identityHashCode(this);
                                    long var20x = var3x;
                                    long var5x = var20x + 1L;
                                    var5x = var20x * var5x;
                                    long var21x = var5x & 1L;
                                    long var36x;
                                    var3x = (var36x = var21x - 0L) == 0L ? 0 : (var36x < 0L ? -1 : 1);
                                    if (var3x == 0) {
                                        var2x += -326170058;
                                        var2x += -79210952;
                                        var2x ^= -1507536612;
                                        long var23x = var2x;
                                        var5x = var23x + 1L;
                                        var5x = var23x * var5x;
                                        long var24x = var5x & 1L;
                                        long var37x;
                                        var3x = (var37x = var24x - 0L) == 0L ? 0 : (var37x < 0L ? -1 : 1);
                                        if (var3x == 0) {
                                            InputStream var26x = var106.getInputStream();
                                            int var4x = var2x >> 7;
                                            var4x |= -1441231304;
                                            var4x += 1138742653;
                                            var4x ^= -1742982516;
                                            var4x ^= -328697583;
                                            this.WW(var26x, var4x);
                                            return;
                                        }
                                    } else {
                                        var2x &= 1970789065;
                                        var2x -= -1712629456;
                                        var2x += 1416557321;
                                        var2x ^= -331522253;
                                        long var15x = var2x;
                                        long var31x = var15x + 1L;
                                        var31x = var15x * var31x;
                                        long var16x = var31x & 1L;
                                        long var38x;
                                        var2x = (var38x = var16x - 0L) == 0L ? 0 : (var38x < 0L ? -1 : 1);
                                        if (var2x == 0) {
                                            RuntimeException var19x = new RuntimeException();
                                            throw var19x;
                                        }
                                    }

                                    IllegalArgumentException var18x = new IllegalArgumentException();
                                    throw var18x;
                                };
                                Thread var91 = new Thread(var117, "Aura Media Reader");
                                var91.setDaemon(true);
                                var91.start();
                                Runnable var107 = () -> {
                                    int var2x = Qk;
                                    var2x ^= -714677280;
                                    int var3x = System.identityHashCode(this);
                                    Integer var15x = var3x;
                                    if (var15x != null) {
                                        var2x |= -1186777637;
                                        var2x |= -307637758;
                                        var2x ^= 782238605;
                                        int var16x = var2x + 1;
                                        var16x = var2x * var16x;
                                        int var4x = var2x + 2;
                                        var16x *= var4x;
                                        var4x = var2x + 3;
                                        var16x *= var4x;
                                        var16x &= 7;
                                        if (var16x == 0) {
                                            InputStream var21x = var106.getErrorStream();
                                            var4x = var2x - 395114847;
                                            var4x ^= 962001285;
                                            var4x ^= -1947755010;
                                            this.u(var21x, var4x);
                                            return;
                                        }
                                    } else {
                                        var2x *= -1219246297;
                                        var2x ^= -1320867646;
                                        int var22x = var2x + 1;
                                        var22x = var2x * var22x;
                                        int var30x = var2x + 2;
                                        var22x *= var30x;
                                        var2x += 3;
                                        var22x *= var2x;
                                        var2x = var22x & 7;
                                        if (var2x == 0) {
                                            AssertionError var14x = new AssertionError();
                                            throw var14x;
                                        }
                                    }

                                    UnsupportedOperationException var13x = new UnsupportedOperationException();
                                    throw var13x;
                                };
                                Thread var92 = new Thread(var107, "Aura Media Errors");
                                var92.setDaemon(true);
                                var92.start();
                                return true;
                            }
                        }
                    }
                }

                AssertionError var93 = new AssertionError();
                throw var93;
            }
        }

        IllegalStateException var83 = new IllegalStateException();
        throw var83;
    }

    public synchronized boolean alive() {
        label62: {
            int var1 = Qk;
            var1 ^= -248132972;
            int var2 = System.identityHashCode(this);
            Process var3 = this.q;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var70;
            int var59 = (var70 = var4 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
            if (var59 != 0) {
                var1 *= 316957701;
                var1 &= 1949421771;
                var1 |= -1678896913;
                var1 ^= -1008596122;
            } else {
                label71: {
                    var1 -= -1950149896;
                    var1 ^= -2036081458;
                    var1 &= 1399454736;
                    var1 ^= -921257827;
                    if (var3 != null) {
                        var1 >>= 15;
                        var1 -= -1051431030;
                        var1 *= -495734999;
                        var1 ^= 1189383625;
                        Integer var54 = var1;
                        if (var54 == null) {
                            break label62;
                        }

                        var3 = this.q;
                        int var60 = var2 + 1;
                        int var61 = var2 * var60;
                        int var5 = var2 + 2;
                        int var62 = var61 * var5;
                        var2 += 3;
                        int var63 = var62 * var2;
                        var2 = var63 & 7;
                        if (var2 != 0) {
                            var1 -= -207368557;
                            var1 <<= 16;
                            var1 *= -471556113;
                            var1 ^= -1865262199;
                            break label71;
                        }
                        var1 = switch (var1) {
                            case -2068505171 -> var1 ^ -1971286082;
                            default -> var1 ^ 1835953304;
                            case -560623692 -> {
                                var1 += 706107750;
                                yield var1 ^ -219364905;
                            }
                        };
                        var2 = var1 + 1;
                        var2 = var1 * var2;
                        var2 &= 1;
                        if (var2 != 0) {
                            break label62;
                        }

                        int var48 = (var3.isAlive()) ? 1 : 0;
                        if (var48 != 0) {
                            var1 ^= -968247069;
                            var1 *= 586667647;
                            var1 |= -1004626033;
                            var1 ^= -1268750;
                            long var49 = var1;
                            var4 = var49 + 1L;
                            var4 = var49 * var4;
                            var6 = var49 + 2L;
                            var4 *= var6;
                            long var50 = var49 + 3L;
                            var4 *= var50;
                            long var51 = var4 & 7L;
                            long var71;
                            var48 = (var71 = var51 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                            if (var48 == 0) {
                                boolean var53 = true;
                                var1 &= 1553065584;
                                var1 |= -455868810;
                                var1 -= 447246240;
                                var1 ^= 140406778;
                                return var53;
                            }
                            break label62;
                        }

                        var1 += 151892912;
                        var1 ^= 1077900070;
                    } else {
                        switch (var1) {
                            case -1956644707:
                                var1 &= -1970403506;
                                var1 ^= -916082857;
                                break;
                            case -1296209630:
                                var1 ^= -1472718374;
                                break;
                            case 1910810834:
                            default:
                                var1 ^= -1834387996;
                        }
                    }

                    boolean var72 = false;
                    var1 += -1731004288;
                    var1 |= 1457532097;
                    var1 >>= 13;
                    var1 -= 1946552866;
                    var1 ^= 1368198399;
                    return var72;
                }
            }

            AssertionError var57 = new AssertionError();
            throw var57;
        }

        AssertionError var56 = new AssertionError();
        throw var56;
    }

    public synchronized String errors() {
        int var1 = Qk;
        var1 ^= 1843599958;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 != null) {
            var1 &= -1979662011;
            var1 &= 1011998358;
            var1 ^= 1982866675;
            var12 = var1;
            if (var12 == null) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                StringBuilder var14 = this.t;
                String var15 = var14.toString();
                return var15.strip();
            }
        } else {
            var1 |= 753159344;
            var1 *= -1032665673;
            var1 |= 647271550;
            var1 ^= 645457447;
            AssertionError var8 = new AssertionError();
            throw var8;
        }
    }

    public synchronized void writeLine(String var1) throws IOException {
        label83: {
            int var2 = Qk;
            var2 ^= 534079164;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 == null) {
                var2 |= -736145373;
                var2 ^= 1909462175;
            } else {
                label94: {
                    var2 = switch (var2) {
                        default -> var2 ^ -1888339271;
                        case 442441064 -> {
                            var2 += 962637300;
                            var2 &= 2100201036;
                            yield var2 ^ 879228136;
                        }
                        case 1725304029 -> var2 ^ -2031910321;
                    };
                    int var61 = var2 + 1;
                    var61 = var2 * var61;
                    var61 &= 1;
                    if (var61 != 0) {
                        break label83;
                    }

                    Writer var64 = this.Dh;
                    if (var64 != null) {
                        var2 = switch (var2) {
                            case -537449182 -> var2 ^ 66620253;
                            default -> var2 ^ 61029619;
                            case 1699313316 -> {
                                var2 |= 1075892149;
                                yield var2 ^ 651685054;
                            }
                        };
                        Integer var65 = var2;
                        if (var65 == null) {
                            break label83;
                        }

                        Process var66 = this.q;
                        long var5 = var3;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var89;
                        int var72 = (var89 = var5 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var72 != 0) {
                            var2 += -1395744052;
                            var2 += -1675511039;
                            var2 += -1958371287;
                            var2 += -1846692182;
                            var2 ^= 107908703;
                            break label94;
                        }

                        var2 -= -373366641;
                        var2 >>= 17;
                        var2 ^= -2145980242;
                        int var73 = var2 + 1;
                        int var74 = var2 * var73;
                        int var75 = var74 & 1;
                        if (var75 != 0) {
                            break label83;
                        }

                        if (var66 != null) {
                            var2 = switch (var2) {
                                case -2145985455 -> {
                                    var2 ^= -1560892829;
                                    var2 <<= 6;
                                    var2 ^= 2055466521;
                                    var2 += 1357737288;
                                    yield var2 ^ 1218825361;
                                }
                                default -> var2 ^ -2079476372;
                                case 906427225 -> var2 ^ -1496736187;
                            };
                            Process var67 = this.q;
                            boolean var68 = var67.isAlive();
                            var5 = var3;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var90;
                            int var78 = (var90 = var5 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                            if (var78 != 0) {
                                var2 *= 1649724227;
                                var2 ^= -183763036;
                                break label94;
                            }

                            var2 >>>= 17;
                            var2 &= -2044386726;
                            var2 ^= 1007048844;
                            if (var68) {
                                var2 <<= 10;
                                var2 ^= -1995780698;
                                Writer var69 = this.Dh;
                                var69.write(var1);
                                Writer var70 = this.Dh;
                                var5 = var3;
                                var7 = var5 + 1L;
                                var7 = var5 * var7;
                                long var9 = var5 + 2L;
                                var7 *= var9;
                                var5 += 3L;
                                var7 *= var5;
                                var5 = var7 & 7L;
                                long var91;
                                var3 = (var91 = var5 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                                if (var3 == 0) {
                                    var2 |= 1864210700;
                                    var2 *= 1274046383;
                                    var2 += 1622746179;
                                    var2 ^= 1174100532;
                                    var2 ^= -1621010832;
                                    Integer var56 = var2;
                                    if (var56 != null) {
                                        var70.write(10);
                                        Writer var57 = this.Dh;
                                        var57.flush();
                                        return;
                                    }
                                    break label83;
                                }

                                var2 |= 322264375;
                                var2 += 1130852941;
                                var2 ^= 2028616176;
                                break label94;
                            }

                            var2 *= 343778497;
                            var2 ^= -241596871;
                        } else {
                            var2 *= -2062023927;
                            var2 ^= -751890178;
                        }
                    } else {
                        var2 |= -138542367;
                        var2 ^= 726854304;
                        var2 ^= -1904722590;
                    }

                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var2 = var3 & 1;
                    if (var2 == 0) {
                        IOException var53 = new IOException("helper not running");
                        throw var53;
                    }
                    break label83;
                }
            }

            UnsupportedOperationException var58 = new UnsupportedOperationException();
            throw var58;
        }

        AssertionError var54 = new AssertionError();
        throw var54;
    }

    private void WW(InputStream param1, int param2) {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(param1, java.nio.charset.StandardCharsets.UTF_8))) {
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isBlank()) {
                this.N.accept(line);
            }
        }
    } catch (IOException ignored) {}
}


    private void u(InputStream param1, int param2) {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(param1, java.nio.charset.StandardCharsets.UTF_8))) {
        String line;
        while ((line = reader.readLine()) != null) {
            synchronized (this.t) {
                if (this.t.length() < 6291456) {
                    this.t.append(line).append('\n');
                }
            }
        }
    } catch (IOException ignored) {}
}


    private void r(int var1) {
        boolean var158 = false;
        Object var5 = null;
        Object var6 = null;
        int var4 = var1 * -1132670681;
        var4 ^= -1701496817;
        var4 &= -2040053539;
        var4 ^= 1732548521;
        long var7 = var4;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var181;
        int var153 = (var181 = var7 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
        label177:
        if (var153 == 0) {
            Process var154 = this.q;
            this.q = null;
            Writer var8 = this.Dh;
            if (var8 != null) {
                var4 &= 1724291904;
                var4 &= -1891192881;
                var4 ^= -1635419471;

                label180: {
                    label181: {
                        Throwable var2;
                        label196: {
                            try {
                                var4 *= 268957019;
                                var4 -= -1499377582;
                                var4 ^= 303527577;
                                var4 ^= -510873627;
                            } catch (Throwable var17) {
                                var2 = var17;
                                int var41 = Qk;
                                int var42 = var41 ^ -1370504631;
                                var158 = var17 instanceof IOException;
                                int var43 = var42 * -1882153493;
                                int var44 = var43 | 1165575430;
                                int var45 = var44 - 34106513;
                                int var46 = var45 & -122044292;
                                var4 = var46 ^ -797533372;
                                Integer var166 = var4;
                                if (var166 == null) {
                                    break label177;
                                }
                                break label196;
                            }

                            Integer var159 = var4;
                            if (var159 == null) {
                                break label177;
                            }

                            try {
                                var8 = this.Dh;
                            } catch (Throwable var16) {
                                var2 = var16;
                                int var52 = Qk;
                                int var53 = var52 ^ -1370504631;
                                var158 = var16 instanceof IOException;
                                int var54 = var53 * -1882153493;
                                int var55 = var54 | 1165575430;
                                int var56 = var55 - 34106513;
                                int var57 = var56 & -122044292;
                                var4 = var57 ^ -797533372;
                                Integer var167 = var4;
                                if (var167 == null) {
                                    break label177;
                                }
                                break label196;
                            }
                            var4 = switch (var4) {
                                case -704535294 -> var4 ^ -897373664;
                                case 616828901 -> {
                                    var4 -= -1350606233;
                                    var4 &= 1106564702;
                                    var4 &= -467213132;
                                    yield var4 ^ -672952356;
                                }
                                default -> var4 ^ 497065992;
                            };
                            int var168 = var4 + 1;
                            int var169 = var4 * var168;
                            int var10 = var4 + 2;
                            int var170 = var169 * var10;
                            var10 = var4 + 3;
                            int var171 = var170 * var10;
                            int var172 = var171 & 7;
                            if (var172 != 0) {
                                break label177;
                            }

                            try {
                                var8.close();
                                var4 |= -523995763;
                                var4 -= 1187847779;
                                var4 &= 1777487952;
                                var4 ^= 1999731769;
                                var4 ^= -1928588969;
                                break label181;
                            } catch (Throwable var15) {
                                var2 = var15;
                                int var62 = Qk;
                                int var63 = var62 ^ -1370504631;
                                var158 = var15 instanceof IOException;
                                int var64 = var63 * -1882153493;
                                int var65 = var64 | 1165575430;
                                int var66 = var65 - 34106513;
                                int var67 = var66 & -122044292;
                                var4 = var67 ^ -797533372;
                                Integer var173 = var4;
                                if (var173 == null) {
                                    break label177;
                                }
                            }
                        }

                        if (!var158) {
                            Integer var162 = switch (var4) {
                                case -1647690917 -> var4 ^ -1678800951;
                                case -1597564088 -> {
                                    var4 += 797690625;
                                    var4 ^= -1641268723;
                                    yield var4 ^ -811341405;
                                }
                                default -> var4 ^ -527159980;
                            };
                            if (var162 != null) {
                                throw UncheckedExceptions.rethrow(var2);
                            }
                            break label177;
                        }

                        var4 |= -1778770480;
                        var4 += 881173627;
                        var4 ^= -1328397037;
                        var4 *= 1607126179;
                        var4 ^= -523514781;
                        Integer var161 = var4;
                        if (var161 == null) {
                            break label177;
                        }

                        var5 = (IOException)var2;
                        var4 ^= 907296011;
                        var4 ^= 234582125;
                        var4 &= 1924165565;
                        var4 ^= 1001663448;
                        Integer var18 = var4;
                        if (var18 == null) {
                            break label177;
                        }

                        var4 |= 1809609648;
                        var4 |= 1631340015;
                        var4 ^= -1100507109;
                        break label180;
                    }

                    Integer var19 = var4;
                    if (var19 == null) {
                        break label177;
                    }

                    switch (var4) {
                        case -617665234:
                            var4 *= -1239665495;
                            var4 ^= 700564666;
                            break;
                        case -273318721:
                        default:
                            var4 ^= -1690493508;
                            break;
                        case 1739610835:
                            var4 ^= -1209368633;
                    }
                }

                this.Dh = null;
                var4 *= 1882020641;
                var4 += 106335610;
                var4 += -1580837886;
                var4 ^= 501335688;
            } else {
                switch (var4) {
                    case -793950997:
                    default:
                        var4 ^= 185023038;
                        break;
                    case -134406904:
                        var4 ^= 599522850;
                        break;
                    case 1728354084:
                        var4 *= 1573432619;
                        var4 ^= -143021980;
                }
            }

            long var163 = var4;
            long var179 = var163 + 1L;
            var179 = var163 * var179;
            long var164 = var179 & 1L;
            long var182;
            int var20 = (var182 = var164 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
            label143:
            if (var20 == 0) {
                label140:
                if (var154 != null) {
                    var4 -= 1018284201;
                    var4 ^= 1142061761;
                    Integer var21 = var4;
                    if (var21 == null) {
                        break label143;
                    }

                    var154.destroy();
                    OutputStream var22 = var154.getOutputStream();
                    var4 -= 1963433402;
                    var4 |= -576030398;
                    var4 ^= 1595549333;
                    OutputStream var23 = var22;
                    var4 -= -1615479513;
                    var4 >>>= 1;
                    var4 -= 641896034;
                    var4 ^= 1787296448;
                    var7 = var4;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var183;
                    int var145 = (var183 = var7 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                    if (var145 != 0) {
                        break label143;
                    }

                    label199: {
                        Throwable var3;
                        label185: {
                            label186: {
                                try {
                                    var4 ^= 1908726339;
                                    var4 |= 190712250;
                                    var4 ^= 2002433950;
                                    var4 ^= 1705689664;
                                } catch (Throwable var14) {
                                    var3 = var14;
                                    var4 = Qk;
                                    var4 ^= 1330107073;
                                    boolean var24 = var14 instanceof IOException;
                                    var4 &= 1506547678;
                                    var4 &= -1992589478;
                                    var4 ^= 1463731295;
                                    if (!var24) {
                                        break label185;
                                    }
                                    break label186;
                                }

                                int var146 = var4 + 1;
                                int var147 = var4 * var146;
                                int var148 = var147 & 1;
                                if (var148 != 0) {
                                    break label143;
                                }

                                try {
                                    var23.close();
                                    break label199;
                                } catch (Throwable var13) {
                                    var3 = var13;
                                    var4 = Qk;
                                    var4 ^= 1330107073;
                                    boolean var25 = var13 instanceof IOException;
                                    var4 &= 1506547678;
                                    var4 &= -1992589478;
                                    var4 ^= 1463731295;
                                    if (!var25) {
                                        break label185;
                                    }
                                }
                            }

                            var4 ^= 409578398;
                            var4 -= 1606062480;
                            var4 &= -1864833272;
                            var4 ^= -2134497756;
                            var6 = (IOException)var3;
                            var4 += 1052497530;
                            var4 >>>= 8;
                            var4 ^= -1360838088;
                            var21 = var4;
                            if (var21 == null) {
                                break label143;
                            }

                            var4 |= -1578494534;
                            var4 >>>= 10;
                            var4 <<= 18;
                            var4 ^= -1218211035;
                            break label140;
                        }
                        var21 = switch (var4) {
                            default -> var4 ^ 528905919;
                            case -891842531 -> var4 ^ -2030388782;
                            case 1597424975 -> {
                                var4 -= 2028169013;
                                var4 ^= 114677115;
                                var4 += -1706973868;
                                yield var4 ^ 763743981;
                            }
                        };
                        if (var21 != null) {
                            throw UncheckedExceptions.rethrow(var3);
                        }
                        break label143;
                    }
                    var4 = switch (var4) {
                        case -644994463 -> {
                            var4 <<= 29;
                            var4 >>>= 4;
                            var4 |= 1755043686;
                            yield var4 ^ 1085283650;
                        }
                        case -60395385 -> var4 ^ 2080598973;
                        default -> var4 ^ 2116908612;
                    };
                    long var28 = var4;
                    long var149 = var28 + 1L;
                    long var150 = var28 * var149;
                    long var29 = var150 & 1L;
                    long var184;
                    int var30 = (var184 = var29 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                    if (var30 != 0) {
                        break label143;
                    }

                    var4 >>>= 9;
                    var4 &= 954009399;
                    var4 |= 163070279;
                    var4 ^= 1082840642;
                } else {
                    var4 >>= 18;
                    var4 &= -246361571;
                    var4 += 20496850;
                    var4 *= -635571101;
                    var4 ^= 1546753071;
                }

                long var31 = var4;
                long var142 = var31 + 1L;
                long var143 = var31 * var142;
                long var32 = var143 & 1L;
                long var185;
                var20 = (var185 = var32 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                if (var20 == 0) {
                    return;
                }
            }
        }

        IllegalArgumentException var34 = new IllegalArgumentException();
        throw var34;
    }

    @Override
    public synchronized void close() {
        int var1 = Qk;
        var1 ^= -940829117;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= 1164273765;
            var1 ^= -867901733;
            var1 ^= 1993747368;
            var1 ^= -982788438;
            var1 ^= 1806573567;
            long var19 = var1;
            long var4 = var19 + 1L;
            var4 = var19 * var4;
            long var20 = var4 & 1L;
            long var26;
            var2 = (var26 = var20 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var2 == 0) {
                var2 = var1 + 1928050541;
                var2 ^= 1802187586;
                this.r(var2);
                this.p = Long.MIN_VALUE;
                return;
            }
        } else {
            var1 -= -848703561;
            var1 += -1911316289;
            var1 ^= 960690005;
            Integer var15 = var1;
            if (var15 != null) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

        static {
        Qk = of_2.ro(MethodHandles.lookup().lookupClass(), 1413440215, 0);
        a = java.util.concurrent.ConcurrentHashMap.newKeySet();
        try {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                for (Object p : a) {
                    if (p instanceof Process proc) {
                        try { proc.destroy(); } catch (Exception ignored) {}
                    }
                }
            }, "Aura Media Shutdown"));
        } catch (IllegalStateException ignored) {}
    }
}
