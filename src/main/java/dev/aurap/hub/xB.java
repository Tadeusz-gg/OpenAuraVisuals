package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BooleanSupplier;

public abstract sealed class xB permits JL, Uq, r_2, Fk, ia, cS {
    private final String If;
    private final String os;
    private String A = "";
    private BooleanSupplier e;
    private boolean Me;
    private final List W;
    public static final int nu;

    protected xB(String var1, String var2) {
        BooleanSupplier var3 = () -> true;
        this.e = var3;
        this.Me = true;
        CopyOnWriteArrayList var5 = new CopyOnWriteArrayList();
        this.W = var5;
        boolean var6 = var1.matches("[a-z0-9_]+");
        if (!var6) {
            String var4 = "Setting id must be [a-z0-9_]+: " + var1;
            IllegalArgumentException var7 = new IllegalArgumentException(var4);
            throw var7;
        } else {
            this.If = var1;
            this.os = var2;
        }
    }

    public final String oQ() {
        int var1 = nu;
        var1 ^= 1379963413;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        of_2.y = -864320044;
        var3 = of_2.C;
        var1 ^= var3;
        var1 ^= 1492222019;
        of_2.C = 1492222019;
        if (var2 == 0) {
            Integer var17 = switch (var1) {
                default -> var1 ^ 1274613369;
                case -1843063848 -> var1 ^ 195061846;
                case -358837474 -> {
                    var1 -= 2052687661;
                    yield var1 ^ 2036881478;
                }
            };
            if (var17 != null) {
                return this.If;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            var1 <<= 24;
            var1 ^= 1833087754;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public final String Tp() {
        int var1 = nu;
        var1 ^= 1240992593;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var20 = var4 & 1L;
        long var23;
        var2 = (var23 = var20 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -456333536;
            var1 *= -85914501;
            var1 -= 739509291;
            var1 *= 497431067;
            var1 ^= -1374273807;
            return this.os;
        } else {
            var1 |= -1113336425;
            var1 |= 1089220554;
            var1 += 1651312874;
            var1 ^= -1622169559;
            Integer var11 = var1;
            if (var11 != null) {
                AssertionError var13 = new AssertionError();
                throw var13;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    public final String ZE() {
        int var1 = nu;
        var1 ^= -846441772;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 <<= 17;
            var1 += 56467769;
            var1 -= -1553843655;
            var1 += -817973514;
            var1 ^= 1336348574;
            AssertionError var15 = new AssertionError();
            throw var15;
        } else {
            var1 &= -143254156;
            var1 &= 470758863;
            var1 *= -2084707791;
            var1 *= 1860013727;
            var1 ^= 256278942;
            return this.A;
        }
    }

    public abstract Object cQ();

    public abstract void t(Object var1);

    public abstract Object a();

    public final void s() {
        int var1 = nu;
        var1 ^= -1449499463;
        int var2 = System.identityHashCode(this);
        Object var3 = this.a();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var25;
        var2 = (var25 = var4 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 310700689;
            var1 ^= 2082817954;
            var1 ^= -1910382099;
            UnsupportedOperationException var20 = new UnsupportedOperationException();
            throw var20;
        } else {
            long var12 = switch (var1) {
                case -916423789 -> var1 ^ 1220103715;
                case 289826226 -> {
                    var1 += 1636018990;
                    var1 -= -309625710;
                    yield var1 ^ -455130443;
                }
                default -> var1 ^ 841565800;
            };
            var4 = var12 + 1L;
            var4 = var12 * var4;
            long var13 = var4 & 1L;
            long var26;
            var1 = (var26 = var13 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 != 0) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            } else {
                this.t(var3);
            }
        }
    }

    public boolean Mm() {
        int var1 = nu;
        var1 ^= -535131981;
        int var2 = System.identityHashCode(this);
        Object var3 = this.cQ();
        Object var4 = this.a();
        Integer var16 = var2;
        if (var16 == null) {
            var1 |= 258220983;
            var1 *= -940819179;
            var1 ^= 1823963493;
            UnsupportedOperationException var17 = new UnsupportedOperationException();
            throw var17;
        } else {
            var1 &= -2129410983;
            var1 &= 287809912;
            var1 |= -519814653;
            var1 *= 33869613;
            var1 ^= -649228379;
            Integer var11 = var1;
            if (var11 == null) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            } else {
                return var3.equals(var4);
            }
        }
    }

    public abstract Object yW();

    public abstract boolean YT(Object var1);

    public final boolean gQ() {
        int var1 = nu;
        var1 ^= 1607950976;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        int var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        var3 = of_2.C;
        var1 ^= var3;
        var1 ^= 1492222019;
        if (var2 != 0) {
            var1 |= -58759272;
            var1 |= 1877191574;
            var1 <<= 17;
            var1 ^= 2005374680;
            Integer var23 = var1;
            if (var23 != null) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            Integer var17 = switch (var1) {
                case -1511484211 -> var1 ^ 382440080;
                case -418684021 -> {
                    var1 |= 179821918;
                    yield var1 ^ 826476349;
                }
                default -> var1 ^ 1948805341;
            };
            if (var17 != null) {
                BooleanSupplier var19 = this.e;
                return var19.getAsBoolean();
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    public final xB q(String var1) {
        int var2 = nu;
        var2 ^= 1054447483;
        int var3 = System.identityHashCode(this);
        Integer var11 = var3;
        if (var11 == null) {
            var2 *= -1461140133;
            var2 &= 1146822974;
            var2 ^= -2041638721;
            RuntimeException var12 = new RuntimeException();
            throw var12;
        } else {
            var2 &= -1171213799;
            var2 -= 1434948341;
            var2 ^= 1406538302;
            this.A = var1;
            return this;
        }
    }

    public final xB Pt(BooleanSupplier var1) {
        int var2 = nu;
        var2 ^= -1442950845;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            switch (var2) {
                case -722711565:
                default:
                    var2 ^= 1620601469;
                    break;
                case 287461448:
                    var2 >>>= 13;
                    var2 += -1692175714;
                    var2 |= 898818538;
                    var2 >>>= 11;
                    var2 ^= 1743526792;
                    break;
                case 1908568065:
                    var2 ^= 1353100314;
            }

            this.e = var1;
            return this;
        } else {
            var2 *= -671217165;
            var2 -= -976065091;
            var2 -= -2011676524;
            var2 += 2096742289;
            var2 ^= 702292261;
            long var12 = var2;
            long var29 = var12 + 1L;
            long var30 = var12 * var29;
            long var13 = var30 & 1L;
            long var31;
            var2 = (var31 = var13 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            }
        }
    }

    public final xB K() {
        int var1 = nu;
        var1 ^= -1249754145;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 &= -1003405575;
            var1 >>= 19;
            var1 ^= -1011919367;
            var12 = var1;
            if (var12 != null) {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            }
        } else {
            var1 += -1257075976;
            var1 |= 418896089;
            var1 ^= 575089273;
            Integer var10 = var1;
            if (var10 != null) {
                this.Me = false;
                return this;
            }
        }

        RuntimeException var11 = new RuntimeException();
        throw var11;
    }

    public boolean ji() {
        int var1 = nu;
        var1 ^= -1995960938;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= 281391041;
            var1 += 105556223;
            var1 &= -2000313097;
            var1 ^= -1273595779;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.Me;
            }
        } else {
            var1 &= -1340295259;
            var1 |= 2083732892;
            var1 -= -1185569161;
            var1 ^= 893771570;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public final void k(Runnable var1) {
        int var2 = nu;
        var2 ^= -1774999099;
        int var3 = System.identityHashCode(this);
        long var15 = var3;
        long var5 = var15 + 1L;
        var5 = var15 * var5;
        long var16 = var5 & 1L;
        long var25;
        var3 = (var25 = var16 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 *= -633703217;
            var2 ^= 1168412846;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                List var22 = this.W;
                boolean var23 = var22.add(var1);
            } else {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            var2 *= -260391229;
            var2 |= 1216943448;
            var2 *= -310468511;
            var2 ^= 107029237;
            IllegalArgumentException var12 = new IllegalArgumentException();
            throw var12;
        }
    }

    protected final void lU() {
        label74: {
            int var1 = nu;
            var1 ^= 1276272079;
            int var2 = System.identityHashCode(this);
            Integer var3 = var2;
            if (var3 != null) {
                var1 >>= 4;
                var1 ^= -50334932;
                var1 -= -717190349;
                var1 ^= -1773777378;
                int var56 = var1 + 1;
                var56 = var1 * var56;
                int var4 = var1 + 2;
                var56 *= var4;
                var4 = var1 + 3;
                var56 *= var4;
                var56 &= 7;
                if (var56 != 0) {
                    break label74;
                }

                List var61 = this.W;
                Iterator var62 = var61.iterator();
                Iterator var63 = var62;

                var1 = switch (var1) {
                    case -1204501069 -> {
                        var1 &= -656545960;
                        var1 &= -563467838;
                        var1 >>>= 5;
                        var1 -= 1163235755;
                        yield var1 ^ 1620307791;
                    }
                    case -1196690651 -> var1 ^ -1116106715;
                    default -> var1 ^ -979935503;
                };

                while (true) {
                    long var66 = var1;
                    long var6 = var66 + 1L;
                    var6 = var66 * var6;
                    long var8 = var66 + 2L;
                    var6 *= var8;
                    long var67 = var66 + 3L;
                    var6 *= var67;
                    long var68 = var6 & 7L;
                    long var104;
                    var4 = (var104 = var68 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label74;
                    }

                    int var70 = (var63.hasNext()) ? 1 : 0;
                    int var5 = var2 + 1;
                    var5 = var2 * var5;
                    int var97 = var2 + 2;
                    var5 *= var97;
                    int var98 = var2 + 3;
                    var5 *= var98;
                    var5 &= 7;
                    if (var5 != 0) {
                        var1 |= 599597649;
                        var1 ^= 136942474;
                        break;
                    }

                    var1 |= 2066804006;
                    var1 *= -1212655263;
                    var1 ^= 1882274560;
                    long var82 = var1;
                    long var7 = var82 + 1L;
                    var7 = var82 * var7;
                    long var9 = var82 + 2L;
                    var7 *= var9;
                    long var83 = var82 + 3L;
                    var7 *= var83;
                    long var84 = var7 & 7L;
                    long var105;
                    var5 = (var105 = var84 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label74;
                    }

                    if (var70 == 0) {
                        var1 += -129715330;
                        var1 -= 753752357;
                        var1 &= -1477440654;
                        var1 += -579367234;
                        var1 ^= 2080293249;
                        Integer var51 = var1;
                        if (var51 != null) {
                            return;
                        }
                        break label74;
                    }

                    var1 &= -1639261244;
                    var1 -= -526180620;
                    var1 >>>= 25;
                    var1 ^= 712114332;
                    var70 = var1 + 1;
                    var70 = var1 * var70;
                    var5 = var1 + 2;
                    var70 *= var5;
                    var5 = var1 + 3;
                    var70 *= var5;
                    var70 &= 7;
                    if (var70 != 0) {
                        break label74;
                    }

                    Object var76 = var63.next();
                    Runnable var77 = (Runnable)var76;
                    long var88 = var2;
                    var7 = var88 + 1L;
                    var7 = var88 * var7;
                    long var89 = var7 & 1L;
                    long var106;
                    var5 = (var106 = var89 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        var1 ^= -1041026800;
                        var1 ^= 475332870;
                        break;
                    }

                    var1 -= 973922418;
                    var1 *= -663966777;
                    var1 += -237542225;
                    var1 &= 1198772630;
                    var1 ^= -520203054;
                    var5 = var1 + 1;
                    var5 = var1 * var5;
                    var5 &= 1;
                    if (var5 != 0) {
                        break label74;
                    }

                    var77.run();
                    var1 >>= 20;
                    var1 &= 1805069291;
                    var1 -= -1253961303;
                    var1 -= 2056846325;
                    var1 ^= -465199681;
                }
            } else {
                var1 *= 736417865;
                var1 &= 911105348;
                var1 ^= -1042783843;
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            int var64 = var1 + 2;
            var2 *= var64;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                AssertionError var49 = new AssertionError();
                throw var49;
            }
        }

        IllegalArgumentException var50 = new IllegalArgumentException();
        throw var50;
    }

    @Override
    public String toString() {
        int var1 = nu;
        var1 ^= 1047968091;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var36;
        var2 = (var36 = var23 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += -1730450265;
            var1 &= 155040588;
            var1 ^= -779311757;
            AssertionError var30 = new AssertionError();
            throw var30;
        } else {
            var1 += 963893709;
            var1 *= 254571729;
            var1 >>= 28;
            var1 ^= 1857188769;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            } else {
                Class var15 = this.getClass();
                String var16 = var15.getSimpleName();
                String var29 = this.If;
                Object var31 = this.yW();
                String var32 = String.valueOf(var31);
                return var16 + "[" + var29 + "=" + var32 + "]";
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1945996392;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        nu = var4;
    }
}
