package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class C {
    public static final Logger LOG;
    private static final long RH = 20000L;
    private static final long R = 600000L;
    private final Ud v;
    private final Queue F;
    private final ExecutorService vy;
    private final Lh_2 k;
    private final BooleanSupplier qp;
    long lastFailureNotice;
    public static final int B;

    public C(Ud var1, Path var2) {
        ConcurrentLinkedQueue var3 = new ConcurrentLinkedQueue();
        this.F = var3;
        ThreadFactory var11 = var0 -> {
            int var1x = B;
            var1x ^= 448645270;
            int var2x = System.identityHashCode(var0);
            Thread var3x = new Thread(var0, "aura-cloud");
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            var2x = var4x & 1;
            if (var2x != 0) {
                var1x -= -1757262363;
                var1x -= -1794340012;
                var1x -= 1487399719;
                var1x >>= 9;
                var1x ^= -174470392;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    IllegalArgumentException var26 = new IllegalArgumentException();
                    throw var26;
                }
            } else {
                var1x += 599144579;
                var1x *= 147014831;
                var1x ^= -436529371;
                long var17x = var1x;
                long var28 = var17x + 1L;
                long var29 = var17x * var28;
                long var6x = var17x + 2L;
                long var30 = var29 * var6x;
                long var18x = var17x + 3L;
                long var31 = var30 * var18x;
                long var19x = var31 & 7L;
                long var32;
                var1x = (var32 = var19x - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
                if (var1x == 0) {
                    var3x.setDaemon(true);
                    return var3x;
                }
            }

            AssertionError var21 = new AssertionError();
            throw var21;
        };
        ExecutorService var12 = Executors.newSingleThreadExecutor(var11);
        this.vy = var12;
        this.v = var1;
        xy var13 = var1.nT();
        Object var4 = Objects.requireNonNull(var13);
        BooleanSupplier var14 = var13::LA;
        this.qp = var14;
        var4 = var1.YT();
        xy var6 = var1.nT();
        O var5 = new O(var6);
        Path var17 = var2.resolve("auravisuals-cloud.json");
        ExecutorService var7 = this.vy;
        Queue var8 = this.F;
        Objects.requireNonNull(var8);
        Executor var18 = var8::add;
        LongSupplier var9 = System::currentTimeMillis;
        PZ var10 = new PZ(this);
        Lh_2 var15 = new Lh_2((Zx)var4, var5, var17, var7, var18, (LongSupplier)var9, var10);
        this.k = var15;
    }

    public void k() {
        int var1 = B;
        var1 ^= 1811856122;
        int var2 = System.identityHashCode(this);
        var1 |= -754296638;
        var1 >>>= 5;
        var1 += -1163312451;
        var1 += 705839290;
        var1 ^= 777873800;

        while (true) {
            long var3 = var1;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            var3 = var5 & 1L;
            long var80;
            int var49 = (var80 = var3 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
            if (var49 != 0) {
                break;
            }

            Queue var50 = this.F;
            Object var51 = var50.poll();
            Runnable var52 = (Runnable)var51;
            var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var81;
            int var68 = (var81 = var5 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
            if (var68 != 0) {
                var1 *= -400056089;
                var1 ^= -127429100;
            } else {
                var1 = switch (var1) {
                    case -1037582619 -> {
                        var1 ^= 610286614;
                        yield var1 ^ -618155680;
                    }
                    default -> var1 ^ -370628985;
                    case 451882776 -> var1 ^ 1419186794;
                };
                var5 = var1;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var82;
                int var71 = (var82 = var5 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                if (var71 != 0) {
                    break;
                }

                if (var52 != null) {
                    var1 &= -1579763369;
                    var1 ^= -1810396277;
                    var52.run();
                    var1 *= 385412321;
                    var1 -= 1013883796;
                    var1 &= 1036162911;
                    var1 |= -1871700986;
                    var1 ^= 1524081379;
                    continue;
                }

                var1 *= 567066157;
                var1 &= -814818896;
                var1 ^= -1985405636;
                int var53 = var1 + 1;
                int var54 = var1 * var53;
                int var4 = var1 + 2;
                int var55 = var54 * var4;
                var4 = var1 + 3;
                int var56 = var55 * var4;
                int var57 = var56 & 7;
                if (var57 != 0) {
                    break;
                }

                Lh_2 var58 = this.k;
                BooleanSupplier var64 = this.qp;
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var83;
                var2 = (var83 = var5 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                if (var2 == 0) {
                    var1 &= 531300715;
                    var1 ^= 2035639347;
                    var1 *= -695579261;
                    var1 ^= 1285467080;
                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    var2 &= 1;
                    if (var2 == 0) {
                        boolean var46 = var64.getAsBoolean();
                        var58.F(var46);
                        Lh_2 var47 = this.k;
                        var47.S();
                        return;
                    }
                    break;
                }

                switch (var1) {
                    case -2048059988:
                        var1 += 1726674095;
                        var1 -= -233443674;
                        var1 ^= 1549950363;
                        var1 *= -2087800635;
                        var1 ^= -1083090991;
                        break;
                    case 173125727:
                    default:
                        var1 ^= -2119334814;
                        break;
                    case 1188940669:
                        var1 ^= -1242487558;
                }
            }

            long var26 = var1;
            var3 = var26 + 1L;
            var3 = var26 * var3;
            var5 = var26 + 2L;
            var3 *= var5;
            long var27 = var26 + 3L;
            var3 *= var27;
            long var28 = var3 & 7L;
            long var84;
            var1 = (var84 = var28 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var30 = new IllegalArgumentException();
                throw var30;
            }
            break;
        }

        UnsupportedOperationException var41 = new UnsupportedOperationException();
        throw var41;
    }

    public void Mg() {
        int var1 = B;
        var1 ^= -102281179;
        int var2 = System.identityHashCode(this);

        var1 = switch (var1) {
            case -1209515523 -> var1 ^ 239180862;
            case -1208236861 -> {
                var1 |= 78687213;
                var1 <<= 19;
                yield var1 ^ 1025740709;
            }
            default -> var1 ^ 370151653;
        };

        while (true) {
            Object var3 = var1;
            if (var3 == null) {
                break;
            }

            Queue var50 = this.F;
            var3 = var50.poll();
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 == 0) {
                var1 += 26448393;
                var1 <<= 26;
                var1 += -817594393;
                var1 |= 973056496;
                var1 ^= -618309456;
                var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break;
                }

                Runnable var52 = (Runnable)var3;
                if (var52 != null) {
                    var1 &= 462055455;
                    var1 += 1690028067;
                    var1 ^= 243914452;
                    long var73 = var1;
                    long var7 = var73 + 1L;
                    var7 = var73 * var7;
                    long var9 = var73 + 2L;
                    var7 *= var9;
                    long var74 = var73 + 3L;
                    var7 *= var74;
                    long var75 = var7 & 7L;
                    long var79;
                    int var55 = (var79 = var75 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                    if (var55 != 0) {
                        break;
                    }

                    var52.run();
                    var1 ^= 1364047948;
                    var1 |= -1825305958;
                    var1 ^= -101842657;
                    continue;
                }

                var1 &= 414254629;
                var1 *= 1986652461;
                var1 ^= 1086671746;
                var3 = var1;
                if (var3 == null) {
                    break;
                }

                Lh_2 var54 = this.k;
                var54.tk();
                long var41 = var2;
                long var66 = var41 + 1L;
                long var67 = var41 * var66;
                long var6 = var41 + 2L;
                long var68 = var67 * var6;
                long var42 = var41 + 3L;
                long var69 = var68 * var42;
                long var43 = var69 & 7L;
                long var80;
                var2 = (var80 = var43 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                if (var2 == 0) {
                    long var45 = switch (var1) {
                        case -1273114525 -> {
                            var1 |= -1687162786;
                            var1 += -1407980784;
                            yield var1 ^ -1643077412;
                        }
                        default -> var1 ^ -1436382489;
                        case -441823473 -> var1 ^ 1879127591;
                    };
                    long var70 = var45 + 1L;
                    long var71 = var45 * var70;
                    long var46 = var71 & 1L;
                    long var81;
                    var2 = (var81 = var46 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        ExecutorService var48 = this.vy;
                        List var49 = var48.shutdownNow();
                        return;
                    }
                    break;
                }

                switch (var1) {
                    case -1273114525:
                        var1 -= -1625565212;
                        var1 &= -331099228;
                        var1 *= -261131797;
                        var1 ^= -1769602576;
                        break;
                    case 1076650211:
                        var1 ^= 497378480;
                        break;
                    case 1210436560:
                    default:
                        var1 ^= 1570549797;
                }
            } else {
                var1 -= 600768110;
                var1 ^= -231774773;
            }

            long var36 = var1;
            long var56 = var36 + 1L;
            long var57 = var36 * var56;
            long var37 = var57 & 1L;
            long var82;
            var1 = (var82 = var37 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var39 = new RuntimeException();
                throw var39;
            }
            break;
        }

        IllegalArgumentException var40 = new IllegalArgumentException();
        throw var40;
    }

    public Lh_2 W() {
        int var1 = B;
        var1 ^= -1314751070;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var29;
        var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            Integer var24 = switch (var1) {
                case -4265660 -> {
                    var1 *= -2037124239;
                    var1 >>>= 24;
                    var1 *= -1315507687;
                    var1 |= 329248110;
                    yield var1 ^ -983061393;
                }
                default -> var1 ^ -1205022658;
                case 1392630754 -> var1 ^ 433925787;
            };
            if (var24 != null) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            }
        } else {
            Integer var18 = switch (var1) {
                case -4265660 -> {
                    var1 <<= 9;
                    var1 ^= -653349387;
                    var1 &= 1611126764;
                    yield var1 ^ 1843199009;
                }
                case 283297952 -> var1 ^ -1892474122;
                default -> var1 ^ 870542600;
            };
            if (var18 != null) {
                return this.k;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public void M() {
        label42: {
            int var1 = B;
            var1 ^= -579009967;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            var3 = var5 & 1L;
            long var56;
            int var40 = (var56 = var3 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
            if (var40 == 0) {
                var1 -= -2092605106;
                var1 &= -25354600;
                var1 ^= -2123267087;
                var3 = var1;
                var5 = var3 + 1L;
                var5 = var3 * var5;
                long var7 = var3 + 2L;
                var5 *= var7;
                var3 += 3L;
                var5 *= var3;
                var3 = var5 & 7L;
                long var57;
                int var44 = (var57 = var3 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                if (var44 != 0) {
                    break label42;
                }

                int var45 = var1 * -184972749;
                int var46 = var45 ^ 1614488242;
                boolean var47 = this.e(var46);
                if (!var47) {
                    switch (var1) {
                        case -1855088647:
                            var1 *= -2141235985;
                            var1 >>>= 26;
                            var1 += -346907804;
                            var1 ^= -1054492872;
                            break;
                        case -585688134:
                            var1 ^= 1602285710;
                            break;
                        case -223633587:
                        default:
                            var1 ^= 402580296;
                    }

                    return;
                }

                var1 += 657405898;
                var1 += 1425627244;
                var1 >>= 16;
                var1 &= -1618909700;
                var1 ^= -909544872;
                Integer var48 = var1;
                if (var48 == null) {
                    break label42;
                }

                i_2.Je("§7Udostępniam config…");
                Lh_2 var49 = this.k;
                CompletableFuture var50 = var49.mj();
                BiConsumer var4 = (var0, var1x) -> {
                    label54: {
                        int var2x = B;
                        var2x ^= 1544021390;
                        int var3x = System.identityHashCode(var0);
                        int var4x = var3x + 1;
                        var4x = var3x * var4x;
                        int var5x = var3x + 2;
                        var4x *= var5x;
                        var5x = var3x + 3;
                        var4x *= var5x;
                        var4x &= 7;
                        if (var4x == 0) {
                            var2x += -1850447111;
                            var2x += -1701747611;
                            var2x *= 368999731;
                            var2x ^= 1136865637;
                            long var55x = var2x;
                            long var6 = var55x + 1L;
                            var6 = var55x * var6;
                            long var8 = var55x + 2L;
                            var6 *= var8;
                            long var56x = var55x + 3L;
                            var6 *= var56x;
                            long var57x = var6 & 7L;
                            long var93;
                            var4x = (var93 = var57x - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                            if (var4x != 0) {
                                break label54;
                            }

                            if (var1x != null) {
                                var2x &= 374313614;
                                var2x -= -1156261056;
                                var2x >>= 6;
                                var2x ^= 1272694029;
                                var4x = var2x + 1;
                                var4x = var2x * var4x;
                                var4x &= 1;
                                if (var4x != 0) {
                                    break label54;
                                }

                                var4x = var2x ^ 2084153903;
                                var4x *= -223555895;
                                var4x += -1955122230;
                                var4x ^= 1925335590;
                                var4x ^= -689253506;
                                String var67 = j((Throwable)var1x, var4x);
                                Integer var82 = var3x;
                                if (var82 != null) {
                                    switch (var2x) {
                                        case -1675073372:
                                            var2x ^= -1091660075;
                                            break;
                                        case -62665866:
                                        default:
                                            var2x ^= -1616632037;
                                            break;
                                        case 1257246622:
                                            var2x &= 2042940818;
                                            var2x &= -1052217921;
                                            var2x += -1548289628;
                                            var2x *= -471535867;
                                            var2x ^= -1247671469;
                                    }

                                    String var68 = "§c" + var67;
                                    i_2.Je(var68);
                                    return;
                                }

                                var2x >>>= 28;
                                var2x ^= 1038311332;
                            } else {
                                var2x ^= -1408188642;
                                var2x >>= 2;
                                var2x >>>= 26;
                                var2x &= 1367230754;
                                var2x ^= 1415566450;
                                long var69 = var2x;
                                var6 = var69 + 1L;
                                var6 = var69 * var6;
                                var8 = var69 + 2L;
                                var6 *= var8;
                                long var70 = var69 + 3L;
                                var6 *= var70;
                                long var71 = var6 & 7L;
                                long var94;
                                var4x = (var94 = var71 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                                if (var4x != 0) {
                                    break label54;
                                }

                                i_2.y((String)var0);
                                var4x = var3x + 1;
                                var4x = var3x * var4x;
                                var5x = var3x + 2;
                                var4x *= var5x;
                                var3x += 3;
                                var4x *= var3x;
                                var3x = var4x & 7;
                                if (var3x == 0) {
                                    var2x |= 9319037;
                                    var2x ^= 24308779;
                                    var3x = var2x + 1;
                                    var3x = var2x * var3x;
                                    var3x &= 1;
                                    if (var3x == 0) {
                                        String var50x = "§7Kod configu §f" + var0 + " §7(skopiowany do schowka). Wczytanie: §f/aura config load " + var0;
                                        i_2.Je(var50x);
                                        return;
                                    }
                                    break label54;
                                }

                                var2x &= -659031164;
                                var2x += -1911210792;
                                var2x &= -2085442348;
                                var2x ^= -1077718160;
                            }
                        } else {
                            var2x -= 1035052496;
                            var2x ^= -376794056;
                        }

                        long var39x = var2x;
                        long var77 = var39x + 1L;
                        long var78 = var39x * var77;
                        long var91 = var39x + 2L;
                        long var79 = var78 * var91;
                        long var40x = var39x + 3L;
                        long var80 = var79 * var40x;
                        long var41x = var80 & 7L;
                        long var95;
                        var2x = (var95 = var41x - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                        if (var2x == 0) {
                            RuntimeException var44x = new RuntimeException();
                            throw var44x;
                        }
                    }

                    IllegalArgumentException var43x = new IllegalArgumentException();
                    throw var43x;
                };
                Integer var37 = var2;
                if (var37 != null) {
                    var1 &= 1644031368;
                    var1 += -1021469758;
                    var1 -= 1899301328;
                    var1 &= 135269752;
                    var1 ^= 1831366234;
                    CompletableFuture var38 = var50.whenComplete(var4);
                    return;
                }

                var1 >>>= 17;
                var1 |= -1466267614;
                var1 &= -403122146;
                var1 ^= 2019551235;
            } else {
                var1 -= 2106672222;
                var1 ^= -854101412;
            }

            Integer var34 = var1;
            if (var34 != null) {
                IllegalArgumentException var36 = new IllegalArgumentException();
                throw var36;
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    public void o(String var1) {
        label51: {
            int var2 = B;
            var2 ^= 978355940;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var2 = switch (var2) {
                    default -> var2 ^ 1774201890;
                    case 1951142402 -> {
                        var2 ^= 1678453059;
                        yield var2 ^ -1440046099;
                    }
                    case 1984306205 -> var2 ^ 2039577406;
                };
                Integer var51 = var2;
                if (var51 == null) {
                    break label51;
                }

                int var52 = var2 - -688608480;
                var52 &= 1151842333;
                var52 <<= 20;
                var52 *= 1454309799;
                var52 ^= -326524375;
                boolean var57 = this.e(var52);
                if (!var57) {
                    switch (var2) {
                        case -1167222612:
                            var2 *= 2020422817;
                            var2 <<= 12;
                            var2 ^= 1265791906;
                            break;
                        case -908676041:
                        default:
                            var2 ^= 1265178884;
                            break;
                        case -180156684:
                            var2 ^= -838411743;
                    }

                    return;
                }

                var2 &= -403054079;
                var2 ^= 1127998910;
                var2 &= 985734855;
                var2 |= 261946029;
                var2 ^= -296794741;
                Integer var58 = var2;
                if (var58 == null) {
                    break label51;
                }

                Lh_2 var59 = this.k;
                String var5 = var1.trim();
                CompletableFuture var60 = var59.b(var5);
                long var62 = var3;
                long var7 = var62 + 1L;
                var7 = var62 * var7;
                long var9 = var62 + 2L;
                var7 *= var9;
                long var63 = var62 + 3L;
                var7 *= var63;
                long var64 = var7 & 7L;
                long var68;
                var3 = (var68 = var64 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var2 >>>= 15;
                    var2 |= -1005285220;
                    var2 -= 426500701;
                    var2 *= -712511585;
                    var2 ^= 49745319;
                    BiConsumer<mQ, Throwable> var43 = (mQ var0, Throwable var1x) -> {
                        label95: {
                            int var2x = B;
                            var2x ^= -570975663;
                            int var3x = System.identityHashCode(var0);
                            int var4x = var3x + 1;
                            var4x = var3x * var4x;
                            var4x &= 1;
                            if (var4x != 0) {
                                switch (var2x) {
                                    case -1813311817:
                                        var2x >>= 4;
                                        var2x &= 999576433;
                                        var2x ^= -1830714354;
                                        break;
                                    case -1072580601:
                                    default:
                                        var2x ^= -1813077882;
                                        break;
                                    case 1969165923:
                                        var2x ^= 329725918;
                                }
                            } else {
                                var2x >>= 15;
                                var2x ^= 1169991352;
                                if (var1x != null) {
                                    var2x <<= 25;
                                    var2x &= 1789200859;
                                    var2x += -1030177476;
                                    var2x *= 698802933;
                                    var2x ^= -882203217;
                                    var4x = var2x + 1;
                                    var4x = var2x * var4x;
                                    var4x &= 1;
                                    if (var4x != 0) {
                                        break label95;
                                    }

                                    var4x = var2x + -851207963;
                                    var4x *= 666274903;
                                    var4x ^= 1835493763;
                                    String var75 = j(var1x, var4x);
                                    String var76 = "§c" + var75;
                                    Integer var5x = var3x;
                                    if (var5x != null) {
                                        var2x = switch (var2x) {
                                            case -2024884285 -> {
                                                var2x &= -1018693424;
                                                var2x <<= 30;
                                                yield var2x ^ -674216296;
                                            }
                                            case 76423028 -> var2x ^ 872888483;
                                            default -> var2x ^ -1641940483;
                                        };
                                        int var89 = var2x + 1;
                                        var89 = var2x * var89;
                                        var89 &= 1;
                                        if (var89 == 0) {
                                            i_2.Je(var76);
                                            return;
                                        }
                                        break label95;
                                    }

                                    var2x |= -1726699684;
                                    var2x -= -1232624096;
                                    var2x ^= -1528486688;
                                    var2x *= 783611883;
                                    var2x ^= 1469330266;
                                } else {
                                    var2x = switch (var2x) {
                                        case -2104688741 -> var2x ^ -1487134597;
                                        case -1169981074 -> {
                                            var2x += 1927747136;
                                            var2x &= -48199862;
                                            var2x *= -53228429;
                                            yield var2x ^ 1323935632;
                                        }
                                        default -> var2x ^ 426574016;
                                    };
                                    Integer var77 = var2x;
                                    if (var77 == null) {
                                        break label95;
                                    }

                                    List var78 = var0.changed();
                                    boolean var79 = var78.isEmpty();
                                    Integer var92 = var3x;
                                    if (var92 == null) {
                                        var2x ^= -1920121315;
                                        var2x += 1859469812;
                                        var2x += -895969063;
                                        var2x &= 731588866;
                                        var2x ^= -1586127505;
                                    } else {
                                        var2x -= 470961022;
                                        var2x ^= -953255508;
                                        var2x >>>= 3;
                                        var2x ^= -1560095111;
                                        var92 = var2x;
                                        if (var92 == null) {
                                            break label95;
                                        }

                                        if (var79) {
                                            var2x ^= -1286026145;
                                            var2x *= 2065980677;
                                            var2x ^= -1840627544;
                                            int var80 = var2x + 1;
                                            var80 = var2x * var80;
                                            int var94 = var2x + 2;
                                            var80 *= var94;
                                            var94 = var2x + 3;
                                            var80 *= var94;
                                            var80 &= 7;
                                            if (var80 != 0) {
                                                break label95;
                                            }

                                            String var85 = var0.code();
                                            String var86 = "§7Config §f" + var85 + " §7jest taki sam jak Twój.";
                                            long var96 = var3x;
                                            long var7x = var96 + 1L;
                                            var7x = var96 * var7x;
                                            long var9x = var96 + 2L;
                                            var7x *= var9x;
                                            long var97 = var96 + 3L;
                                            var7x *= var97;
                                            long var98 = var7x & 7L;
                                            long var114;
                                            var94 = (var114 = var98 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                                            if (var94 == 0) {
                                                var2x -= -137833059;
                                                var2x += 333841972;
                                                var2x ^= -1330471016;
                                                Integer var100 = var2x;
                                                if (var100 != null) {
                                                    i_2.Je(var86);
                                                    return;
                                                }
                                                break label95;
                                            }

                                            var2x >>>= 26;
                                            var2x >>= 8;
                                            var2x ^= -1409969041;
                                        } else {
                                            var2x >>= 24;
                                            var2x += -133538445;
                                            var2x *= 1745829119;
                                            var2x -= 1113443811;
                                            var2x ^= -505594698;
                                            var77 = var2x;
                                            if (var77 == null) {
                                                break label95;
                                            }

                                            String var88 = var0.code();
                                            List var101 = var0.changed();
                                            int var102 = var101.size();
                                            List var6 = var0.changed();
                                            int var103 = var6.size();
                                            int var108 = var2x | 1808004444;
                                            var108 += 917778090;
                                            var108 ^= -2001340259;
                                            String var104 = modules(var103, var108);
                                            List var111 = var0.changed();
                                            List var112 = Lh_2.sC(var111);
                                            String var113 = String.join(", ", var112);
                                            Integer var62x = var3x;
                                            if (var62x != null) {
                                                var2x *= 497143921;
                                                var2x ^= -2100095983;
                                                var2x ^= 570055067;
                                                String var60x = "§7Wczytano §f"
                                                    + var88
                                                    + "§7: zmienione "
                                                    + var102
                                                    + " "
                                                    + var104
                                                    + " §f("
                                                    + var113
                                                    + ")§7. Cofnij: §f/aura config undo";
                                                i_2.Je(var60x);
                                                return;
                                            }

                                            switch (var2x) {
                                                case -339579728:
                                                    var2x <<= 26;
                                                    var2x ^= -1581718227;
                                                    var2x += -1745675343;
                                                    var2x ^= 1381602481;
                                                    break;
                                                case -100952727:
                                                    var2x ^= 8166740;
                                                    break;
                                                case 1186575554:
                                                default:
                                                    var2x ^= -1540534483;
                                            }
                                        }
                                    }
                                }
                            }

                            var3x = var2x + 1;
                            var3x = var2x * var3x;
                            var3x &= 1;
                            if (var3x == 0) {
                                UnsupportedOperationException var66x = new UnsupportedOperationException();
                                throw var66x;
                            }
                        }

                        IllegalArgumentException var61x = new IllegalArgumentException();
                        throw var61x;
                    };
                    CompletableFuture var44 = var60.whenComplete(var43);
                    return;
                }

                switch (var2) {
                    case -1047282908:
                        var2 += 1596450932;
                        var2 ^= -1661667306;
                        var2 |= 1309100127;
                        var2 &= 296011090;
                        var2 ^= -474783894;
                        break;
                    case -62199328:
                    default:
                        var2 ^= 977571283;
                        break;
                    case 597364520:
                        var2 ^= 2051836449;
                }
            } else {
                var2 <<= 31;
                var2 >>>= 28;
                var2 -= -1778650069;
                var2 >>= 20;
                var2 ^= -206104424;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalArgumentException var41 = new IllegalArgumentException();
                throw var41;
            }
        }

        UnsupportedOperationException var40 = new UnsupportedOperationException();
        throw var40;
    }

    public void iV() {
        int var1 = B;
        var1 ^= -250161712;
        int var2 = System.identityHashCode(this);
        Lh_2 var3 = this.k;
        List var47 = var3.xu();
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var4 &= 1;
        if (var4 != 0) {
            switch (var1) {
                case -1515743400:
                default:
                    var1 ^= -392299848;
                    break;
                case -1089846986:
                    var1 += 261035518;
                    var1 ^= -506345765;
                    break;
                case -210086208:
                    var1 ^= -1517839680;
            }
        } else {
            label61: {
                var1 |= -1074448829;
                var1 >>>= 28;
                var1 ^= 855971347;
                var1 *= -2118259563;
                var1 ^= -1810403851;
                var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                label50:
                if (var4 == 0) {
                    if (var47 == null) {
                        var1 = switch (var1) {
                            default -> var1 ^ 1641245010;
                            case 1578931725 -> {
                                var1 &= -247265726;
                                var1 |= -326293558;
                                yield var1 ^ 1129153208;
                            }
                            case 2030691413 -> var1 ^ -1228549100;
                        };
                        i_2.Je("§7Nie ma czego cofnąć.");
                        var1 |= 320737418;
                        var1 |= 772679726;
                        var1 ^= 766071408;
                    } else {
                        var1 -= -1088906822;
                        var1 += 523206717;
                        var1 -= -1644879975;
                        var1 ^= -1715923322;
                        long var58 = var1;
                        long var6 = var58 + 1L;
                        var6 = var58 * var6;
                        long var59 = var6 & 1L;
                        long var65;
                        var4 = (var65 = var59 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label50;
                        }

                        var4 = var47.size();
                        long var5 = var2;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var66;
                        var2 = (var66 = var5 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            switch (var1) {
                                case -1901596520:
                                    var1 ^= 1691124469;
                                    break label61;
                                case -1182315919:
                                    var1 <<= 13;
                                    var1 |= -2098351542;
                                    var1 ^= 1134766035;
                                    var1 ^= -2029779850;
                                    break label61;
                                case 589989621:
                                default:
                                    var1 ^= -591154512;
                                    break label61;
                            }
                        }

                        var1 *= -447375287;
                        var1 >>>= 17;
                        var1 &= -1157903872;
                        var1 ^= -1086747258;
                        var2 = var47.size();
                        int var48 = var1 ^ -1092358738;
                        int var49 = var48 - -343643792;
                        int var50 = var49 & -1365367590;
                        int var51 = var50 ^ -1717151232;
                        int var52 = var51 ^ 897559203;
                        String var43 = modules(var2, var52);
                        String var44 = "§7Przywrócono poprzedni config §f(" + var4 + " " + var43 + ")§7.";
                        i_2.Je(var44);
                        var1 -= -991791276;
                        var1 ^= 1746991548;
                    }

                    Integer var45 = var1;
                    if (var45 != null) {
                        return;
                    }
                }

                IllegalArgumentException var46 = new IllegalArgumentException();
                throw var46;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    public void x() {
        label39: {
            int var1 = B;
            var1 ^= -1054171834;
            int var2 = System.identityHashCode(this);
            int var3 = var1 | 1124306824;
            var3 |= 623488264;
            var3 ^= -1091170943;
            int var33 = this.e(var3) ? 1 : 0;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var1 -= -280846931;
                var1 &= -2089168067;
                var1 ^= -804724820;
            } else {
                var1 = switch (var1) {
                    case -1892284000 -> {
                        var1 <<= 15;
                        yield var1 ^ -679822193;
                    }
                    case -888481838 -> var1 ^ -1256760742;
                    default -> var1 ^ 1376864338;
                };
                var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label39;
                }

                if (var33 == 0) {
                    var1 >>>= 17;
                    var1 *= -179432915;
                    var1 *= -10908799;
                    var1 ^= 1960301882;
                    return;
                }

                var1 |= 826776897;
                var1 ^= -366001880;
                long var34 = var1;
                long var49 = var34 + 1L;
                long var50 = var34 * var49;
                long var7 = var34 + 2L;
                long var51 = var50 * var7;
                long var35 = var34 + 3L;
                long var52 = var51 * var35;
                long var36 = var52 & 7L;
                long var53;
                var33 = (var53 = var36 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                if (var33 != 0) {
                    break label39;
                }

                Lh_2 var38 = this.k;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var2 = var4 & 1;
                if (var2 == 0) {
                    var1 *= -907178829;
                    var1 &= -1926463862;
                    var1 ^= -238174021;
                    var38.p();
                    i_2.Je("§7Synchronizuję config z chmurą…");
                    return;
                }

                var1 |= -1568790278;
                var1 ^= -1690915327;
                var1 |= 1343581472;
                var1 ^= 598008675;
            }

            AssertionError var30 = new AssertionError();
            throw var30;
        }

        RuntimeException var28 = new RuntimeException();
        throw var28;
    }

    public void t() {
        String var99 = null;
        label134: {
            int var1 = B;
            var1 ^= 1336506394;
            int var2 = System.identityHashCode(this);
            int[] var3 = TR.g;
            Lh_2 var4 = this.k;
            BR var108 = var4.Y();
            int var109 = var108.ordinal();
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var172;
            int var138 = (var172 = var5 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
            if (var138 != 0) {
                var1 ^= -1414478404;
                var1 += 1070328123;
                var1 >>>= 7;
                var1 *= 492288497;
                var1 ^= -16952909;
            } else {
                label133: {
                    var1 ^= 227141881;
                    var1 ^= 1097021052;
                    Integer var139 = var1;
                    if (var139 == null) {
                        break label134;
                    }

                    int var92 = var3[var109];
                    label119:
                    switch (var92) {
                        case 1:
                            var1 ^= 667458545;
                            var1 += 865755545;
                            var1 ^= -1331496992;
                            int var121 = var1 + 1;
                            int var122 = var1 * var121;
                            int var123 = var122 & 1;
                            if (var123 != 0) {
                                break label134;
                            }

                            var99 = "§cbrak połączenia";
                            var1 |= -1323835776;
                            var1 += -1265129866;
                            var1 *= 1065330915;
                            var1 ^= -877503042;
                            break;
                        case 2:
                            var1 = switch (var1) {
                                default -> var1 ^ -467397038;
                                case 1298084473 -> {
                                    var1 &= -2019797038;
                                    var1 >>>= 10;
                                    yield var1 ^ 1211536177;
                                }
                                case 1877401004 -> var1 ^ 652673623;
                            };
                            long var117 = var1;
                            long var6 = var117 + 1L;
                            var6 = var117 * var6;
                            long var8 = var117 + 2L;
                            var6 *= var8;
                            long var118 = var117 + 3L;
                            var6 *= var118;
                            long var119 = var6 & 7L;
                            long var174;
                            int var120 = (var174 = var119 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                            if (var120 != 0) {
                                break label134;
                            }

                            var99 = "§esynchronizacja…";
                            switch (var1) {
                                case 1104776053:
                                    var1 ^= 244873441;
                                    break label119;
                                case 1211618357:
                                    var1 ^= -1670989244;
                                    var1 *= -619341271;
                                    var1 >>>= 6;
                                    var1 ^= 567412552;
                                    var1 ^= 558511003;
                                    break label119;
                                case 1419100382:
                                default:
                                    var1 ^= 1942057950;
                                    break label119;
                            }
                        case 3:
                            var1 = switch (var1) {
                                case -2129752113 -> var1 ^ 1831940381;
                                case 1298084473 -> {
                                    var1 &= 1785406365;
                                    yield var1 ^ 1349552988;
                                }
                                default -> var1 ^ -2033459978;
                            };
                            Integer var116 = var1;
                            if (var116 == null) {
                                break label134;
                            }

                            var99 = "§azsynchronizowany";
                            var1 &= 1554162722;
                            var1 >>>= 29;
                            var1 ^= 38193787;
                            break;
                        case 4:
                            var1 = switch (var1) {
                                case 550435396 -> var1 ^ -971531766;
                                case 1298084473 -> {
                                    var1 += 1666090371;
                                    var1 >>= 5;
                                    yield var1 ^ 63688077;
                                }
                                default -> var1 ^ -2080328344;
                            };
                            int var111 = var1 + 1;
                            int var112 = var1 * var111;
                            int var140 = var1 + 2;
                            int var113 = var112 * var140;
                            int var141 = var1 + 3;
                            int var114 = var113 * var141;
                            int var115 = var114 & 7;
                            if (var115 != 0) {
                                break label134;
                            }

                            var99 = "§ezmiany czekają na wysłanie";
                            var1 *= -1203964245;
                            var1 &= -1189526831;
                            var1 -= 1435972962;
                            var1 *= -250571547;
                            var1 ^= 917773037;
                            break;
                        case 5:
                            var1 <<= 9;
                            var1 &= -418518483;
                            var1 >>= 18;
                            var1 ^= -706745269;
                            Integer var95 = var1;
                            if (var95 == null) {
                                break label134;
                            }

                            Lh_2 var96 = this.k;
                            String var97 = var96.Zk();
                            Integer var110 = var2;
                            if (var110 == null) {
                                var1 &= -1627687566;
                                var1 ^= 578745109;
                                break label133;
                            }

                            var1 <<= 2;
                            var1 |= 584078779;
                            var1 *= 1869982811;
                            var1 ^= 392940922;
                            String var98 = "§cbłąd: " + var97;
                            var99 = var98;
                            switch (var1) {
                                case -1236735866:
                                default:
                                    var1 ^= -781785426;
                                    break label119;
                                case -149152253:
                                    var1 *= -896791667;
                                    var1 &= -1346769307;
                                    var1 ^= 91120222;
                                    break label119;
                                case 2121403652:
                                    var1 ^= -516606225;
                                    break label119;
                            }
                        default:
                            var1 >>>= 28;
                            var1 &= -415564605;
                            var1 ^= 1496680572;
                            long var17 = var1;
                            long var93 = var17 + 1L;
                            long var94 = var17 * var93;
                            long var18 = var94 & 1L;
                            long var173;
                            var1 = (var173 = var18 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                            if (var1 == 0) {
                                MatchException var20 = new MatchException(null, null);
                                throw var20;
                            }
                            break label134;
                    }

                    long var124 = var1;
                    long var156 = var124 + 1L;
                    var156 = var124 * var156;
                    long var170 = var124 + 2L;
                    var156 *= var170;
                    long var125 = var124 + 3L;
                    var156 *= var125;
                    long var126 = var156 & 7L;
                    long var175;
                    int var127 = (var175 = var126 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var127 != 0) {
                        break label134;
                    }

                    String var100 = "§7Config w chmurze §f" + var99;
                    i_2.Je(var100);
                    Lh_2 var101 = this.k;
                    int var128 = var2 + 1;
                    int var129 = var2 * var128;
                    int var130 = var129 & 1;
                    label113:
                    if (var130 == 0) {
                        var1 ^= 2111410655;
                        var1 ^= 1554352714;
                        long var131 = var1;
                        var156 = var131 + 1L;
                        var156 = var131 * var156;
                        long var132 = var156 & 1L;
                        long var176;
                        int var133 = (var176 = var132 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var133 != 0) {
                            break label134;
                        }

                        long var102 = var101.MF();
                        long var177;
                        int var103 = (var177 = var102 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                        if (var103 > 0) {
                            var1 -= 1565805028;
                            var1 |= -1495100537;
                            var1 <<= 24;
                            var1 ^= -717182985;
                            var1 ^= -665126892;
                            long var104 = System.currentTimeMillis();
                            Lh_2 var142 = this.k;
                            var5 = var142.MF();
                            long var105 = var104 - var5;
                            long var106 = Math.max(0L, var105);
                            int var144 = var1 & 672839673;
                            int var145 = var144 ^ 813102808;
                            String var107 = r(var106, var145);
                            var4 = this.k;
                            int var146 = var2 + 1;
                            int var147 = var2 * var146;
                            int var162 = var2 + 2;
                            int var148 = var147 * var162;
                            var2 += 3;
                            int var149 = var148 * var2;
                            var2 = var149 & 7;
                            if (var2 != 0) {
                                var1 -= 1547559857;
                                var1 ^= 1728282522;
                                var1 |= 789676399;
                                var1 ^= 1199666616;
                                break label113;
                            }
                            var1 = switch (var1) {
                                case -2112200733 -> {
                                    var1 -= 736338226;
                                    yield var1 ^ 586650131;
                                }
                                case 1290212199 -> var1 ^ -1482022102;
                                default -> var1 ^ 2118463848;
                            };
                            var5 = var1;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var178;
                            var2 = (var178 = var5 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                break label134;
                            }

                            long var135 = var4.xZ();
                            String var90 = "§7Ostatnia synchronizacja §f" + var107 + " §7temu §8(rewizja " + var135 + ")";
                            i_2.Je(var90);
                            var1 -= 2038205783;
                            var1 >>>= 26;
                            var1 ^= -1064067693;
                        } else {
                            var1 *= -1068682853;
                            var1 += -1215450862;
                            var1 *= -1561813935;
                            var1 ^= -2011313599;
                        }

                        return;
                    } else {
                        var1 >>= 27;
                        var1 &= -2122336147;
                        var1 ^= 677312087;
                    }
                }
            }

            AssertionError var91 = new AssertionError();
            throw var91;
        }

        UnsupportedOperationException var81 = new UnsupportedOperationException();
        throw var81;
    }

    private boolean e(int var1) {
        int var3 = System.identityHashCode(this);
        BooleanSupplier var4 = this.qp;
        Integer var22 = var3;
        if (var22 == null) {
            int var20 = var1 * -1396801777;
            var20 ^= -1066318375;
            UnsupportedOperationException var29 = new UnsupportedOperationException();
            throw var29;
        } else {
            int var2 = var1 - -1152876569;
            var2 &= 142873000;
            var2 ^= -644526750;
            int var23 = var2 + 1;
            var23 = var2 * var23;
            int var5 = var2 + 2;
            var23 *= var5;
            var5 = var2 + 3;
            var23 *= var5;
            var23 &= 7;
            if (var23 == 0) {
                boolean var28 = var4.getAsBoolean();
                if (var28) {
                    switch (var2) {
                        case -1134034200:
                        default:
                            var2 ^= -567814207;
                            break;
                        case -652915358:
                            var2 >>= 14;
                            var2 += -406132989;
                            var2 ^= -947185937;
                            break;
                        case 1241692488:
                            var2 ^= -1885130057;
                    }

                    return true;
                }
                long var11 = switch (var2) {
                    default -> var2 ^ -2027923875;
                    case -652915358 -> {
                        var2 ^= 104460662;
                        var2 ^= 236335948;
                        yield var2 ^ 664230475;
                    }
                    case 1510644158 -> var2 ^ 1927891620;
                };
                long var30 = var11 + 1L;
                long var31 = var11 * var30;
                long var12 = var31 & 1L;
                long var33;
                var2 = (var33 = var12 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
                if (var2 == 0) {
                    i_2.Je("§cBrak połączenia z serwerem licencji - spróbuj za chwilę.");
                    return false;
                }
            }

            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        }
    }

    private static String r(long var0, int var2) {
        label87: {
            int var4 = (int)var0;
            Duration var5 = Duration.ofMillis(var0);
            long var6 = var5.toMinutes();
            Integer var8 = var4;
            int var12;
            if (var8 == null) {
                var12 = var2 * 916149101;
                var12 ^= -1638641591;
            } else {
                var12 = var2 - -785430547;
                var12 ^= 1747663517;
                var12 += 552105783;
                var12 ^= -890671046;
                long var114;
                int var59 = (var114 = var6 - 1L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                if (var59 < 0) {
                    var12 |= -1517897857;
                    var12 -= -695490870;
                    var12 >>= 26;
                    var12 <<= 1;
                    var12 ^= -1646673334;
                    int var60 = var12 + 1;
                    int var61 = var12 * var60;
                    int var7 = var12 + 2;
                    int var62 = var61 * var7;
                    var7 = var12 + 3;
                    int var63 = var62 * var7;
                    int var64 = var63 & 7;
                    if (var64 != 0) {
                        break label87;
                    }

                    var6 = var5.toSeconds();
                    long var92 = var4;
                    long var10 = var92 + 1L;
                    var10 = var92 * var10;
                    long var93 = var10 & 1L;
                    long var115;
                    int var94 = (var115 = var93 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                    if (var94 == 0) {
                        var12 ^= 1040649746;
                        var12 -= 398932748;
                        var12 <<= 13;
                        var12 ^= -1112266662;
                        var94 = var12 + 1;
                        var94 = var12 * var94;
                        var94 &= 1;
                        if (var94 == 0) {
                            return var6 + " s";
                        }
                        break label87;
                    }

                    var12 ^= 996323451;
                    var12 ^= -1980449329;
                } else {
                    var12 |= -522595273;
                    var12 += -51646682;
                    var12 += 2115647465;
                    var12 ^= 144498359;
                    int var66 = var12 + 1;
                    int var67 = var12 * var66;
                    int var68 = var67 & 1;
                    if (var68 != 0) {
                        break label87;
                    }

                    var6 = var5.toHours();
                    long var116;
                    int var70 = (var116 = var6 - 1L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                    int var80 = var4 + 1;
                    var80 = var4 * var80;
                    int var98 = var4 + 2;
                    var80 *= var98;
                    var98 = var4 + 3;
                    var80 *= var98;
                    var80 &= 7;
                    if (var80 == 0) {
                        var12 |= -391724227;
                        var12 ^= 435836861;
                        var80 = var12 + 1;
                        var80 = var12 * var80;
                        var98 = var12 + 2;
                        var80 *= var98;
                        var98 = var12 + 3;
                        var80 *= var98;
                        var80 &= 7;
                        if (var80 != 0) {
                            break label87;
                        }

                        if (var70 < 0) {
                            var12 = switch (var12) {
                                default -> var12 ^ 1337604990;
                                case -519787456 -> {
                                    var12 ^= -111016357;
                                    var12 -= 1276705421;
                                    var12 ^= -1821121342;
                                    var12 <<= 24;
                                    yield var12 ^ 1819275365;
                                }
                                case 1055274608 -> var12 ^ -1001779543;
                            };
                            var6 = var12;
                            long var102 = var6 + 1L;
                            long var103 = var6 * var102;
                            var6 = var103 & 1L;
                            long var117;
                            int var73 = (var117 = var6 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                            if (var73 != 0) {
                                break label87;
                            }

                            var6 = var5.toMinutes();
                            var98 = var4 + 1;
                            var98 = var4 * var98;
                            var98 &= 1;
                            if (var98 == 0) {
                                var12 <<= 27;
                                var12 ^= 2117812598;
                                return var6 + " min";
                            }

                            var12 &= -767107593;
                            var12 *= -777549473;
                            var12 ^= -1241492873;
                        } else {
                            var12 += 778296645;
                            var12 ^= -2109455921;
                            var6 = var12;
                            long var107 = var6 + 1L;
                            long var108 = var6 * var107;
                            long var113 = var6 + 2L;
                            long var109 = var108 * var113;
                            var6 += 3L;
                            long var110 = var109 * var6;
                            var6 = var110 & 7L;
                            long var118;
                            int var78 = (var118 = var6 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                            if (var78 != 0) {
                                break label87;
                            }

                            long var58 = var5.toHours();
                            Integer var56 = var4;
                            if (var56 != null) {
                                long var90 = switch (var12) {
                                    case -1926444982 -> {
                                        var12 -= 958548342;
                                        var12 >>>= 29;
                                        var12 &= 1098676719;
                                        yield var12 ^ 354378042;
                                    }
                                    case -1824426178 -> var12 ^ 763462549;
                                    default -> var12 ^ -1823329595;
                                };
                                long var9 = var90 + 1L;
                                var9 = var90 * var9;
                                long var91 = var9 & 1L;
                                long var119;
                                int var57 = (var119 = var91 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                                if (var57 == 0) {
                                    return var58 + " h";
                                }
                                break label87;
                            }

                            var12 += 263987718;
                            var12 *= -686167741;
                            var12 >>= 2;
                            var12 *= -119869613;
                            var12 ^= -564631304;
                        }
                    } else {
                        var12 >>= 14;
                        var12 ^= -793644569;
                    }
                }
            }

            Integer var53 = var12;
            if (var53 != null) {
                IllegalStateException var54 = new IllegalStateException();
                throw var54;
            }
        }

        UnsupportedOperationException var55 = new UnsupportedOperationException();
        throw var55;
    }

    static String modules(int var0, int var1) {
        String var74 = null;
        label82: {
            long var5 = var0;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var96;
            int var76 = (var96 = var5 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var76 != 0) {
                int var2 = var1 << 31;
                var2 *= 694002373;
                var2 ^= 1955041905;
            } else {
                int var14 = var1 * 36751957;
                var14 ^= 1842098315;
                var5 = var0;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var97;
                int var80 = (var97 = var5 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                if (var80 != 0) {
                    break label82;
                }

                if (var0 == 1) {
                    var14 &= 962728799;
                    var14 ^= -458961045;
                    return "moduł";
                }

                var14 *= -1263406567;
                var14 &= -2122610922;
                var14 |= -2122831261;
                var14 -= 344933960;
                var14 ^= -487036173;
                int var81 = var0 % 100;
                int var6 = var0 + 1;
                var6 = var0 * var6;
                int var4 = var6 & 1;
                if (var4 == 0) {
                    label85: {
                        label86: {
                            var14 |= -1092885539;
                            var14 <<= 27;
                            var14 += -558429103;
                            var14 ^= -1188517130;
                            var4 = var0 % 10;
                            if (var4 >= 2) {
                                var14 ^= 2124452763;
                                var14 *= 664791263;
                                var14 += -939246591;
                                var14 >>= 30;
                                var14 ^= 1945539548;
                                if (var4 <= 4) {
                                    var14 -= 803172520;
                                    var14 += 283385368;
                                    var14 ^= -36966022;
                                    long var85 = var0;
                                    long var8 = var85 + 1L;
                                    var8 = var85 * var8;
                                    long var10 = var85 + 2L;
                                    var8 *= var10;
                                    long var86 = var85 + 3L;
                                    var8 *= var86;
                                    long var87 = var8 & 7L;
                                    long var98;
                                    var4 = (var98 = var87 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                                    if (var4 != 0) {
                                        break label82;
                                    }

                                    if (var81 < 12) {
                                        var14 *= 1376835895;
                                        var14 <<= 24;
                                        var14 ^= 1931444052;
                                        break label86;
                                    }

                                    var14 >>= 25;
                                    var14 ^= -1834418280;
                                    if (var81 > 14) {
                                        var14 -= -702035404;
                                        var14 *= 883056193;
                                        var14 ^= 1981215564;
                                        break label86;
                                    }

                                    var14 &= -936428579;
                                    var14 ^= -265385435;
                                    var14 ^= 492154600;
                                } else {
                                    var14 *= 603473031;
                                    var14 += 648082047;
                                    var14 *= -39541761;
                                    var14 &= -1721868397;
                                    var14 ^= -1388682477;
                                }
                            } else {
                                var14 ^= -181227601;
                                var14 -= -1768782617;
                                var14 ^= -282881308;
                                var14 ^= -1102761404;
                            }

                            Integer var82 = var0;
                            if (var82 == null) {
                                break label82;
                            }

                            var74 = "modułów";
                            var14 ^= 846231073;
                            var14 += 785162871;
                            var14 -= 150208537;
                            var14 -= -1812024430;
                            var14 ^= -2131027731;
                            break label85;
                        }

                        Integer var73 = var0;
                        if (var73 == null) {
                            break label82;
                        }

                        var74 = "moduły";
                        var14 -= -745280287;
                        var14 ^= 1721158642;
                    }

                    var14 = var0 + 1;
                    var14 = var0 * var14;
                    int var83 = var0 + 2;
                    var14 *= var83;
                    int var3 = var0 + 3;
                    var14 *= var3;
                    var14 &= 7;
                    if (var14 == 0) {
                        return var74;
                    }
                    break label82;
                }

                switch (var14) {
                    case -1928398371:
                        var14 ^= -1374939661;
                        break;
                    case -1911290916:
                        var14 |= -1539777704;
                        var14 ^= 1522223533;
                        break;
                    case -647167346:
                    default:
                        var14 ^= -148723853;
                }
            }

            Integer var69 = var0;
            if (var69 != null) {
                IllegalStateException var70 = new IllegalStateException();
                throw var70;
            }
        }

        UnsupportedOperationException var68 = new UnsupportedOperationException();
        throw var68;
    }

    private static String j(Throwable var0, int var1) {
        Throwable var95 = null;
        label125: {
            int var3 = System.identityHashCode(var0);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            int var12;
            if (var4 != 0) {
                var12 = var1 & -1251101036;
                var12 >>>= 8;
                var12 &= -102163456;
                var12 ^= 1963098781;
            } else {
                label142: {
                    var12 = var1 & -1458298464;
                    var12 ^= 54664098;
                    long var84 = var12;
                    long var6 = var84 + 1L;
                    var6 = var84 * var6;
                    long var85 = var6 & 1L;
                    long var136;
                    var4 = (var136 = var85 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label125;
                    }

                    label130: {
                        int var87 = (var0 instanceof CompletionException) ? 1 : 0;
                        if (var87 != 0) {
                            var12 &= 303055865;
                            var12 ^= 1284378998;
                            var87 = var12 + 1;
                            var87 = var12 * var87;
                            var5 = var12 + 2;
                            var87 *= var5;
                            var5 = var12 + 3;
                            var87 *= var5;
                            var87 &= 7;
                            if (var87 != 0) {
                                break label125;
                            }

                            Throwable var93 = var0.getCause();
                            Integer var105 = var3;
                            if (var105 == null) {
                                switch (var12) {
                                    case -1037465541:
                                        var12 ^= 1941528649;
                                        break label142;
                                    case 746010115:
                                    default:
                                        var12 ^= 1074406118;
                                        break label142;
                                    case 1317933654:
                                        var12 *= -779911389;
                                        var12 -= 1780121569;
                                        var12 ^= 334375292;
                                        break label142;
                                }
                            }

                            var12 ^= -968300001;
                            var12 ^= 1444705888;
                            var105 = var12;
                            if (var105 == null) {
                                break label125;
                            }

                            if (var93 != null) {
                                var12 ^= 1989203455;
                                var12 += -2079450866;
                                var12 ^= -21147243;
                                Throwable var94 = var0.getCause();
                                var105 = var3;
                                if (var105 == null) {
                                    var12 <<= 17;
                                    var12 += -1686442847;
                                    var12 >>>= 16;
                                    var12 *= 1984901847;
                                    var12 ^= -643699239;
                                    break label142;
                                }

                                var12 |= -1765524465;
                                var12 ^= 373081861;
                                var12 >>>= 2;
                                var12 -= 1675147844;
                                var12 ^= -902728221;
                                var95 = var94;
                                var12 ^= 455188812;
                                var12 += -1641247101;
                                var12 ^= 500282152;
                                break label130;
                            }

                            switch (var12) {
                                case -768038161:
                                    var12 ^= -1785033125;
                                    break;
                                case -556102103:
                                    var12 *= 641769835;
                                    var12 ^= -721804393;
                                    break;
                                case 1682627940:
                                default:
                                    var12 ^= 562690388;
                            }
                        } else {
                            var12 &= -1647839795;
                            var12 ^= -1693443193;
                            var12 ^= -5685965;
                        }

                        Integer var108 = var12;
                        if (var108 == null) {
                            break label125;
                        }

                        var95 = var0;
                        var12 ^= -18701363;
                        var12 *= 415742483;
                        var12 *= 1732205133;
                        var12 ^= 824431407;
                    }

                    var5 = var12 + 1;
                    var5 = var12 * var5;
                    int var123 = var12 + 2;
                    var5 *= var123;
                    int var124 = var12 + 3;
                    var5 *= var124;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label125;
                    }

                    int var114 = (var95 instanceof ms) ? 1 : 0;
                    var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var137;
                    int var127 = (var137 = var6 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                    if (var127 != 0) {
                        var12 += 746570605;
                        var12 >>>= 1;
                        var12 |= -721346956;
                        var12 ^= -2012119709;
                    } else {
                        var12 *= 1131988953;
                        var12 ^= 1583607587;
                        var6 = var12;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var138;
                        int var130 = (var138 = var6 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                        if (var130 != 0) {
                            break label125;
                        }

                        if (var114 == 0) {
                            var12 = switch (var12) {
                                default -> var12 ^ 419173981;
                                case -367243021 -> {
                                    var12 *= 1018693465;
                                    var12 += -1431218941;
                                    yield var12 ^ 1861057763;
                                }
                                case 722377942 -> var12 ^ 1786343875;
                            };
                            var4 = var12 + 1;
                            var4 = var12 * var4;
                            var114 = var12 + 2;
                            var4 *= var114;
                            var114 = var12 + 3;
                            var4 *= var114;
                            var4 &= 7;
                            if (var4 != 0) {
                                break label125;
                            }

                            String var79 = "Nie udało się połączyć z serwerem.";
                            var12 += -93018843;
                            var12 -= -1394322878;
                            var12 ^= -566967180;
                            return var79;
                        }

                        var12 -= 1439651838;
                        var12 |= 453633519;
                        var12 -= -1608652257;
                        var12 >>= 22;
                        var12 ^= 728270885;
                        var114 = var12 + 1;
                        var114 = var12 * var114;
                        int var131 = var12 + 2;
                        var114 *= var131;
                        int var132 = var12 + 3;
                        var114 *= var132;
                        var114 &= 7;
                        if (var114 != 0) {
                            break label125;
                        }

                        ms var96 = (ms)var95;
                        Integer var72 = var3;
                        if (var72 != null) {
                            var12 = switch (var12) {
                                case -728270887 -> {
                                    var12 *= -441671011;
                                    var12 &= -130038188;
                                    yield var12 ^ 969938888;
                                }
                                case -166699479 -> var12 ^ -998918356;
                                default -> var12 ^ 1346117838;
                            };
                            int var75 = var12 + 1;
                            var75 = var12 * var75;
                            var75 &= 1;
                            if (var75 != 0) {
                                break label125;
                            }

                            String var78 = var96.getMessage();
                            var12 <<= 15;
                            var12 *= 1244094819;
                            var12 >>= 16;
                            var12 -= -1311386888;
                            var12 ^= 1997227238;
                            return var78;
                        }

                        switch (var12) {
                            case -728270887:
                                var12 -= -1198809531;
                                var12 >>= 4;
                                var12 -= -614097485;
                                var12 |= 528775994;
                                var12 ^= 1247673699;
                                break;
                            case 199828635:
                                var12 ^= 1585840059;
                                break;
                            case 890608251:
                            default:
                                var12 ^= 1122637606;
                        }
                    }
                }
            }

            Integer var73 = var12;
            if (var73 != null) {
                IllegalStateException var74 = new IllegalStateException();
                throw var74;
            }
        }

        IllegalStateException var71 = new IllegalStateException();
        throw var71;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 878822843;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        B = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/cloud");
        LOG = var5;
    }
}
