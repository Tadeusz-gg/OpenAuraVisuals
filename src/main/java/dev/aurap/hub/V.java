package dev.aurap.hub;

import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public final class V {
    private static final long G = 150L;
    private static final long t = 450L;
    private static final long pC = 4000L;
    private static final long CH = 1600L;
    private static final long E = 5000L;
    private static final double Wm = 48.0;
    private final EventBus TH;
    private final List j;
    private final Int2LongOpenHashMap zb;
    private final Int2LongOpenHashMap F;
    private final Int2FloatOpenHashMap q;
    private final IntOpenHashSet Pb;
    private Entity g;
    private long C;
    private boolean uK;
    private float s;
    private Entity uC;
    private long m;
    private int fy;
    private int O;
    private long eu;
    public static final int P;

    public V(EventBus var1) {
        ArrayList var2 = new ArrayList();
        this.j = var2;
        Int2LongOpenHashMap var3 = new Int2LongOpenHashMap();
        this.zb = var3;
        Int2LongOpenHashMap var4 = new Int2LongOpenHashMap();
        this.F = var4;
        Int2FloatOpenHashMap var5 = new Int2FloatOpenHashMap();
        this.q = var5;
        IntOpenHashSet var6 = new IntOpenHashSet();
        this.Pb = var6;
        this.s = 1.0F;
        this.fy = -1;
        this.TH = var1;
        EventListener<o_2> var7 = this::VN;
        EventSubscription var8 = var1.DP(o_2.class, 1000, var7);
        EventListener<PC> var9 = this::M;
        EventSubscription var10 = var1.DP(PC.class, 1000, var9);
        EventListener<GN> var11 = this::oF;
        EventSubscription var12 = var1.DP(GN.class, 1000, var11);
        EventListener<Yb> var13 = (Yb var1x) -> {
            int var2x = P;
            var2x ^= -211896720;
            int var3x = System.identityHashCode(this);
            Int2LongOpenHashMap var4x = this.zb;
            Entity var5x = var1x.target();
            int var32 = var5x.getId();
            long var6x = dU();
            long var8x = var3x;
            long var10x = var8x + 1L;
            var10x = var8x * var10x;
            long var12x = var8x + 2L;
            var10x *= var12x;
            var8x += 3L;
            var10x *= var8x;
            var8x = var10x & 7L;
            long var39;
            var3x = (var39 = var8x - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var3x != 0) {
                var2x += 1839591141;
                var2x *= 1876916231;
                var2x ^= 648056734;
                Integer var26 = var2x;
                if (var26 != null) {
                    UnsupportedOperationException var27 = new UnsupportedOperationException();
                    throw var27;
                }
            } else {
                var2x *= -41024587;
                var2x *= -88472705;
                var2x ^= 1788912508;
                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var35 = var2x + 2;
                var3x *= var35;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    long var24 = var4x.put(var32, var6x);
                    return;
                }
            }

            UnsupportedOperationException var23 = new UnsupportedOperationException();
            throw var23;
        };
        EventSubscription var14 = var1.DP(Yb.class, 1000, var13);
        EventListener<X> var15 = this::Wz;
        EventSubscription var16 = var1.DP(X.class, 1000, var15);
        EventListener<p_2> var17 = (p_2 var1x) -> {
            int var2x = P;
            var2x ^= -1597171962;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            var3x = var4x & 1;
            if (var3x == 0) {
                var2x -= 397663593;
                var2x *= -696117655;
                var2x *= 2075172859;
                var2x |= 1257147171;
                var2x ^= 310790327;
                Integer var25 = var2x;
                if (var25 != null) {
                    int var26 = var2x >>> 25;
                    var26 ^= 565605343;
                    this.WW(var26);
                    return;
                }
            } else {
                var2x *= -350659211;
                var2x += 1023138304;
                var2x ^= 1230798912;
                var2x ^= -1606848443;
                long var18x = var2x;
                long var29 = var18x + 1L;
                long var30 = var18x * var29;
                long var6x = var18x + 2L;
                long var31 = var30 * var6x;
                long var19x = var18x + 3L;
                long var32 = var31 * var19x;
                long var20x = var32 & 7L;
                long var33;
                var2x = (var33 = var20x - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
                if (var2x == 0) {
                    IllegalStateException var23 = new IllegalStateException();
                    throw var23;
                }
            }

            AssertionError var22 = new AssertionError();
            throw var22;
        };
        EventSubscription var18 = var1.DP(p_2.class, 1000, var17);
        EventListener<TickEvent> var19 = (TickEvent var1x) -> {
            int var2x = P;
            var2x ^= -1048375143;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            int var5x = var3x + 2;
            var4x *= var5x;
            var3x += 3;
            var4x *= var3x;
            var3x = var4x & 7;
            if (var3x != 0) {
                switch (var2x) {
                    case -1841910408:
                        var2x &= 1788971494;
                        var2x ^= 320585765;
                        break;
                    case -981771833:
                    default:
                        var2x ^= -2124473579;
                        break;
                    case 425814261:
                        var2x ^= -1329327683;
                }

                AssertionError var20x = new AssertionError();
                throw var20x;
            } else {
                var2x ^= 638375113;
                var2x ^= 1328115800;
                var2x ^= 220295598;
                var2x >>>= 11;
                var2x ^= -1042869442;
                var2x ^= -1217804690;
                var2x ^= -782258036;
                this.o(var2x);
            }
        };
        EventSubscription var20 = var1.DP(TickEvent.class, 1000, var19);
    }

    public Entity i() {
        int var1 = P;
        var1 ^= 1367134397;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var4 = var2 + 3;
        var3 *= var4;
        var3 &= 7;
        var4 = of_2.GI;
        var1 ^= var4;
        var1 ^= 970741366;
        of_2.GI = 970741366;
        var4 = of_2.Im;
        var1 ^= var4;
        var1 ^= 1542612131;
        of_2.Im = 1542612131;
        if (var3 != 0) {
            var1 |= -1342258278;
            var1 ^= -492034796;
        } else {
            label150: {
                var1 |= 1644923311;
                var1 |= -87382694;
                var1 ^= -928516583;
                long var83 = var1;
                long var5 = var83 + 1L;
                var5 = var83 * var5;
                long var84 = var5 & 1L;
                long var134;
                var3 = (var134 = var84 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                if (var3 == 0) {
                    Entity var86 = this.uC;
                    if (var86 == null) {
                        var1 *= 1207580329;
                        var1 *= -313022857;
                        var1 ^= 1971974851;
                        return this.uC;
                    }

                    var1 >>= 3;
                    var1 &= -1449973191;
                    var1 ^= -86786825;
                    Integer var87 = var1;
                    if (var87 != null) {
                        long var88 = dU();
                        var5 = this.m;
                        long var89 = var88 - var5;
                        var5 = var2;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var135;
                        int var115 = (var135 = var5 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                        if (var115 != 0) {
                            var1 += 863254864;
                            var1 ^= -1781731708;
                            var1 ^= -153494447;
                            break label150;
                        }
                        var1 = switch (var1) {
                            case -1900835173 -> var1 ^ -1517516528;
                            case -86851889 -> {
                                var1 += 1260382243;
                                var1 |= -927496351;
                                yield var1 ^ -950461092;
                            }
                            default -> var1 ^ -1771946684;
                        };
                        var5 = var1;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var136;
                        int var118 = (var136 = var5 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                        label107:
                        if (var118 == 0) {
                            long var137;
                            int var90 = (var137 = var89 - 5000L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var90 <= 0) {
                                var1 ^= 1144412259;
                                var1 ^= 1410353832;
                                long var91 = var1;
                                var5 = var91 + 1L;
                                var5 = var91 * var5;
                                long var92 = var5 & 1L;
                                long var138;
                                var90 = (var138 = var92 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                                if (var90 != 0) {
                                    break label107;
                                }

                                Entity var94 = this.uC;
                                long var103 = var2;
                                long var6 = var103 + 1L;
                                var6 = var103 * var6;
                                long var8 = var103 + 2L;
                                var6 *= var8;
                                long var104 = var103 + 3L;
                                var6 *= var104;
                                long var105 = var6 & 7L;
                                long var139;
                                var4 = (var139 = var105 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    switch (var1) {
                                        case -1835069334:
                                            var1 ^= -1926572776;
                                            break label150;
                                        case -450435630:
                                        default:
                                            var1 ^= -877560972;
                                            break label150;
                                        case 445163620:
                                            var1 -= -1201038481;
                                            var1 ^= 793560639;
                                            break label150;
                                    }
                                }
                                var1 = switch (var1) {
                                    case -1844278943 -> var1 ^ 1861257752;
                                    case 445163620 -> {
                                        var1 >>= 18;
                                        yield var1 ^ 1854785803;
                                    }
                                    default -> var1 ^ 29535665;
                                };
                                Integer var107 = var1;
                                if (var107 == null) {
                                    break label107;
                                }

                                int var95 = (var94.isAlive()) ? 1 : 0;
                                if (var95 != 0) {
                                    var1 <<= 26;
                                    var1 *= -1937547107;
                                    var1 &= -1825484404;
                                    var1 ^= -477626746;
                                    long var96 = var1;
                                    var5 = var96 + 1L;
                                    var5 = var96 * var5;
                                    long var97 = var5 & 1L;
                                    long var140;
                                    var95 = (var140 = var97 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                                    if (var95 != 0) {
                                        break label107;
                                    }

                                    Entity var99 = this.uC;
                                    Integer var74 = var2;
                                    if (var74 == null) {
                                        switch (var1) {
                                            case -1655043981:
                                                var1 ^= -361745197;
                                                break label150;
                                            case 427790264:
                                            default:
                                                var1 ^= 823246831;
                                                break label150;
                                            case 1938292358:
                                                var1 ^= -1634111220;
                                                var1 *= 2140588509;
                                                var1 |= -1657425969;
                                                var1 ^= -972909473;
                                                var1 ^= 1420079482;
                                                break label150;
                                        }
                                    }
                                    var1 = switch (var1) {
                                        case -856187637 -> var1 ^ 1486777536;
                                        default -> var1 ^ -475404853;
                                        case 1938292358 -> {
                                            var1 |= -972972104;
                                            var1 ^= -259578860;
                                            var1 |= -1493742786;
                                            var1 |= -1827176104;
                                            yield var1 ^ 392186299;
                                        }
                                    };
                                    long var108 = var1;
                                    var6 = var108 + 1L;
                                    var6 = var108 * var6;
                                    var8 = var108 + 2L;
                                    var6 *= var8;
                                    long var109 = var108 + 3L;
                                    var6 *= var109;
                                    long var110 = var6 & 7L;
                                    long var141;
                                    int var75 = (var141 = var110 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                                    if (var75 != 0) {
                                        break label107;
                                    }

                                    boolean var76 = var99.isRemoved();
                                    if (!var76) {
                                        var1 <<= 22;
                                        var1 ^= -1081984071;
                                        return this.uC;
                                    }

                                    var1 ^= 535683242;
                                    var1 ^= 446946923;
                                } else {
                                    var1 ^= 825621119;
                                    var1 >>>= 12;
                                    var1 ^= -1512286457;
                                }
                            } else {
                                var1 |= 2035342377;
                                var1 ^= 304059003;
                                var1 &= 981210910;
                                var1 >>>= 16;
                                var1 ^= -1512471324;
                            }

                            Integer var77 = var1;
                            if (var77 != null) {
                                this.uC = null;
                                switch (var1) {
                                    case -1512461180:
                                        var1 ^= -471019159;
                                        var1 &= 865154888;
                                        var1 -= -982223517;
                                        var1 <<= 29;
                                        var1 ^= -1899873351;
                                        return this.uC;
                                    case 1340511230:
                                        var1 ^= 57022101;
                                        return this.uC;
                                    case 1623198165:
                                    default:
                                        var1 ^= -215124864;
                                        return this.uC;
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var78 = new UnsupportedOperationException();
                throw var78;
            }
        }

        IllegalArgumentException var73 = new IllegalArgumentException();
        throw var73;
    }

    public int K() {
        label44: {
            int var1 = P;
            var1 ^= 560832505;
            int var2 = System.identityHashCode(this);
            long var3 = dU();
            long var5 = this.eu;
            var3 -= var5;
            long var57;
            int var46 = (var57 = var3 - 1600L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
            Integer var4 = var2;
            if (var4 == null) {
                var1 &= 746167527;
                var1 ^= 1530374797;
            } else {
                label49: {
                    var1 *= -577372883;
                    var1 |= 1144421114;
                    var1 |= 246271255;
                    var1 >>= 8;
                    var1 ^= 1478521398;
                    int var49 = var1 + 1;
                    var49 = var1 * var49;
                    int var55 = var1 + 2;
                    var49 *= var55;
                    int var56 = var1 + 3;
                    var49 *= var56;
                    var49 &= 7;
                    if (var49 != 0) {
                        break label44;
                    }

                    int var48;
                    if (var46 > 0) {
                        var1 >>= 29;
                        var1 >>= 31;
                        var1 ^= -557276067;
                        Integer var47 = var1;
                        if (var47 == null) {
                            break label44;
                        }

                        var48 = 0;
                        var1 |= -572963932;
                        var1 >>>= 9;
                        var1 ^= -1789035388;
                    } else {
                        var1 &= 1687511282;
                        var1 <<= 12;
                        var1 ^= 1284987364;
                        var1 |= 342731746;
                        var1 ^= -2093964401;
                        var49 = this.O;
                        Integer var42 = var2;
                        if (var42 == null) {
                            var1 *= 1683229929;
                            var1 ^= 2061284236;
                            var1 ^= 358821884;
                            var1 += -2076761224;
                            var1 ^= -1723299372;
                            break label49;
                        }

                        var1 *= -186638647;
                        var1 >>= 1;
                        var1 ^= -1879936883;
                        var1 ^= 2084400084;
                        var1 ^= -1714835302;
                        var42 = var1;
                        if (var42 == null) {
                            break label44;
                        }

                        var48 = var49;
                        var1 -= 522511090;
                        var1 += -802183465;
                        var1 ^= -581772531;
                        var1 &= -1013353310;
                        var1 ^= 1445720279;
                    }

                    Integer var35 = var1;
                    if (var35 != null) {
                        return var48;
                    }
                    break label44;
                }
            }

            IllegalStateException var44 = new IllegalStateException();
            throw var44;
        }

        IllegalArgumentException var41 = new IllegalArgumentException();
        throw var41;
    }

    public void WS(LivingEntity var1, Entity var2, float var3, boolean var4) {
        label87: {
            int var33;
            var33 = P;
            var33 ^= -2076696023;
            int var6 = System.identityHashCode(this);
            long var7 = var6;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var130;
            int var76 = (var130 = var7 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
            label86:
            if (var76 == 0) {
                var33 >>>= 24;
                var33 -= 930623056;
                var33 |= -285979961;
                var33 *= -422815157;
                var33 ^= 1556514590;
                Integer var77 = var33;
                if (var77 == null) {
                    break label87;
                }

                if (var4) {
                    var33 -= -686222966;
                    var33 += 1168493074;
                    var33 ^= -1526654691;
                    EventBus var78 = this.TH;
                    Integer var8 = var6;
                    if (var8 == null) {
                        switch (var33) {
                            case 745232582:
                                var33 |= -1883515423;
                                var33 *= -311290189;
                                var33 ^= 1963984466;
                                break label86;
                            case 1149509117:
                                var33 ^= -471924647;
                                break label86;
                            case 1723728735:
                            default:
                                var33 ^= -549228796;
                                break label86;
                        }
                    }

                    var33 += 907193837;
                    var33 -= 618904361;
                    var33 >>>= 1;
                    var33 ^= -1120661995;
                    var8 = var33;
                    if (var8 == null) {
                        break label87;
                    }

                    Yb var97 = new Yb(var1, false);
                    Object var79 = var78.A(var97);
                    var33 &= 805409657;
                    var33 >>= 13;
                    var33 ^= 552880600;
                    var33 += 270408662;
                    var33 ^= -742871666;
                } else {
                    var33 &= 47767418;
                    var33 ^= -529317510;
                }

                int var80 = var33 + 1;
                int var81 = var33 * var80;
                int var98 = var33 + 2;
                int var82 = var81 * var98;
                var98 = var33 + 3;
                int var83 = var82 * var98;
                int var84 = var83 & 7;
                if (var84 != 0) {
                    break label87;
                }

                EventBus var85 = this.TH;
                PC var100 = new PC(var1, var2, var2, true);
                Object var86 = var85.A(var100);
                int var87 = var33 & -1238006668;
                int var88 = var87 ^ -2087193701;
                this.WW(var88);
                Int2FloatOpenHashMap var89 = this.q;
                var98 = var6 + 1;
                var98 = var6 * var98;
                int var117 = var6 + 2;
                var98 *= var117;
                int var118 = var6 + 3;
                var98 *= var118;
                var98 &= 7;
                if (var98 == 0) {
                    var33 = switch (var33) {
                        case -492058584 -> {
                            var33 *= 1415935299;
                            var33 -= -1620304749;
                            yield var33 ^ -1590349998;
                        }
                        default -> var33 ^ -1474613082;
                        case 1181238807 -> var33 ^ -1584782720;
                    };
                    var98 = var33 + 1;
                    var98 = var33 * var98;
                    int var119 = var33 + 2;
                    var98 *= var119;
                    int var120 = var33 + 3;
                    var98 *= var120;
                    var98 &= 7;
                    if (var98 != 0) {
                        break label87;
                    }

                    var98 = var1.getId();
                    float var121 = var1.getHealth();
                    float var90 = var89.put(var98, var121);
                    EventBus var91 = this.TH;
                    float var122 = var1.getHealth();
                    tZ var112 = new tZ(var1, var3, var122);
                    Object var92 = var91.A(var112);
                    boolean var93 = var1.isAlive();
                    if (var93) {
                        var33 |= -1116127259;
                        var33 ^= 311996251;
                        return;
                    }
                    var33 = switch (var33) {
                        case -1047850298 -> var33 ^ 1838043943;
                        case -318856521 -> {
                            var33 *= -1707027127;
                            var33 ^= -531318521;
                            yield var33 ^ 654590480;
                        }
                        default -> var33 ^ -941073391;
                    };
                    EventBus var94 = this.TH;
                    X var113 = new X(var1);
                    var9 = var6;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    long var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var131;
                    var6 = (var131 = var9 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        var33 *= 530226161;
                        var33 ^= -1157620183;
                        var33 += -885826779;
                        var33 &= -592121969;
                        var33 ^= -977886924;
                        Integer var68 = var33;
                        if (var68 == null) {
                            break label87;
                        }

                        var68 = (Integer)var94.A(var113);
                        var33 <<= 30;
                        var33 ^= 1974915494;
                        var33 >>= 29;
                        var33 ^= 278458195;
                        return;
                    }

                    var33 += 970762961;
                    var33 -= 465395170;
                    var33 ^= 974232560;
                } else {
                    switch (var33) {
                        case -1351565972:
                        default:
                            var33 ^= 1707892255;
                            break;
                        case -492058584:
                            var33 &= 1550851939;
                            var33 *= -1244817761;
                            var33 -= 1244047313;
                            var33 ^= 1530732760;
                            break;
                        case 2105067001:
                            var33 ^= 1347766725;
                    }
                }
            } else {
                var33 ^= 1169820120;
                var33 -= -391780898;
                var33 -= 1657152350;
                var33 >>= 10;
                var33 ^= 722318900;
            }

            var6 = var33 + 1;
            var6 = var33 * var6;
            int var95 = var33 + 2;
            var6 *= var95;
            var33 += 3;
            var6 *= var33;
            var33 = var6 & 7;
            if (var33 == 0) {
                IllegalArgumentException var66 = new IllegalArgumentException();
                throw var66;
            }
        }

        UnsupportedOperationException var65 = new UnsupportedOperationException();
        throw var65;
    }

    private void VN(o_2 var1) {
        int var2 = P;
        var2 ^= -1385847346;
        int var3 = System.identityHashCode(this);
        Entity var4 = var1.target();
        this.g = var4;
        float var22 = var1.attackStrength();
        this.s = var22;
        long var23 = dU();
        Integer var18 = var3;
        if (var18 != null) {
            var2 ^= -393084382;
            var2 ^= -189357448;
            long var6 = var2;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var26;
            int var19 = (var26 = var6 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var19 == 0) {
                this.C = var23;
                this.uK = false;
                return;
            }
        } else {
            var2 *= 799308019;
            var2 ^= 496515621;
            int var20 = var2 + 1;
            var20 = var2 * var20;
            var2 = var20 & 1;
            if (var2 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    private void M(PC var1) {
        ip var146 = null;
        Entity var156 = null;
        float var173 = 0.0F;
        label196: {
            int var105;
            label208: {
                var105 = P;
                var105 ^= 1821968642;
                int var3 = System.identityHashCode(this);
                Entity var4 = i_2.QI();
                int var5 = var3 + 1;
                var5 = var3 * var5;
                int var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                label193:
                if (var5 == 0) {
                    var105 *= 1118123667;
                    var105 *= 1417479041;
                    var105 ^= 1727352279;
                    if (var4 != null) {
                        var105 *= -620302553;
                        var105 *= 499787713;
                        var105 ^= 1446566621;
                        Integer var132 = var105;
                        if (var132 == null) {
                            break label196;
                        }

                        Entity var133 = var1.victim();
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var7 = var3 + 2;
                        var6 *= var7;
                        var7 = var3 + 3;
                        var6 *= var7;
                        var6 &= 7;
                        if (var6 != 0) {
                            var105 *= -1268383567;
                            var105 ^= 539658873;
                            var105 ^= -409875566;
                            break label193;
                        }

                        var105 -= 1180189938;
                        var105 &= 1830694167;
                        var105 -= -933419819;
                        var105 ^= -1094551621;
                        long var153 = var105;
                        long var8 = var153 + 1L;
                        var8 = var153 * var8;
                        long var154 = var8 & 1L;
                        long var191;
                        var6 = (var191 = var154 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label196;
                        }

                        if (var133 == var4) {
                            var105 >>= 29;
                            var105 -= 2142552521;
                            var105 += 1957870069;
                            var105 >>>= 2;
                            var105 ^= 1071443089;
                            this.O = 0;
                            return;
                        }

                        var105 += -483320320;
                        var105 |= -16089511;
                        var105 ^= -1159744494;
                    } else {
                        var105 *= 467484421;
                        var105 *= -646549137;
                        var105 ^= -2090075501;
                    }

                    Integer var120 = var105;
                    if (var120 == null) {
                        break label196;
                    }

                    boolean var121 = var1.byLocalPlayer();
                    Integer var134 = var3;
                    if (var134 != null) {
                        var105 |= 2001465669;
                        var105 ^= 158858331;
                        int var135 = var105 + 1;
                        var135 = var105 * var135;
                        var135 &= 1;
                        if (var135 != 0) {
                            break label196;
                        }

                        if (!var121) {
                            switch (var105) {
                                case -1701293874:
                                    var105 ^= 1217598568;
                                    break label208;
                                case 1672861546:
                                default:
                                    var105 ^= -137352846;
                                    break label208;
                                case 2114717590:
                                    var105 >>= 16;
                                    var105 ^= -364747098;
                                    break label208;
                            }
                        }
                        var105 = switch (var105) {
                            default -> var105 ^ 906061624;
                            case 1874890591 -> var105 ^ -1479654264;
                            case 2114717590 -> {
                                var105 -= -1231826770;
                                yield var105 ^ -395436939;
                            }
                        };
                        Integer var122 = var105;
                        if (var122 == null) {
                            break label196;
                        }

                        var4 = var1.victim();
                        long var138 = var3;
                        long var161 = var138 + 1L;
                        var161 = var138 * var161;
                        long var139 = var161 & 1L;
                        long var192;
                        var135 = (var192 = var139 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                        if (var135 != 0) {
                            var105 -= 130565588;
                            var105 ^= 959936493;
                        } else {
                            var105 += -1170221221;
                            var105 ^= -1103424204;
                            Integer var141 = var105;
                            if (var141 == null) {
                                break label196;
                            }

                            Entity var142 = this.g;
                            if (var4 == var142) {
                                var105 *= 1549096065;
                                var105 ^= 2029652787;
                                int var124 = var105 + 1;
                                int var125 = var105 * var124;
                                int var126 = var125 & 1;
                                if (var126 != 0) {
                                    break label196;
                                }

                                this.uK = true;
                                switch (var105) {
                                    case -92937688:
                                    default:
                                        var105 ^= -1786178064;
                                        break;
                                    case 939863605:
                                        var105 ^= 1699076338;
                                        break;
                                    case 1752982015:
                                        var105 += 1745799634;
                                        var105 += 390894202;
                                        var105 -= -1922876250;
                                        var105 += -601193411;
                                        var105 ^= -1611113605;
                                }
                            } else {
                                var105 -= -2022113844;
                                var105 ^= 1720928665;
                            }

                            List var127 = this.j;
                            long var143 = var3;
                            var161 = var143 + 1L;
                            var161 = var143 * var161;
                            long var144 = var161 & 1L;
                            long var193;
                            int var145 = (var193 = var144 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                            if (var145 != 0) {
                                switch (var105) {
                                    case -1452843367:
                                        var105 ^= 1940981698;
                                        var105 |= 2061375248;
                                        var105 += -1919558389;
                                        var105 ^= -1777422526;
                                        break;
                                    case -589165619:
                                        var105 ^= -1910894071;
                                        break;
                                    case 559863065:
                                    default:
                                        var105 ^= -1762968774;
                                }
                            } else {
                                label222: {
                                    label203: {
                                        var105 = switch (var105) {
                                            case -1556408919 -> var105 ^ -541822933;
                                            case -1452843367 -> {
                                                var105 *= 937386185;
                                                var105 ^= -553778597;
                                                var105 &= -1749950049;
                                                var105 |= 1742155525;
                                                yield var105 ^ -235739492;
                                            }
                                            default -> var105 ^ -396495741;
                                        };
                                        var146 = null;
                                        var156 = var1.victim();
                                        Entity var165 = var1.victim();
                                        Entity var175 = this.g;
                                        if (var165 == var175) {
                                            var105 = switch (var105) {
                                                default -> var105 ^ -1819280418;
                                                case 103106947 -> {
                                                    var105 ^= -746457691;
                                                    var105 ^= 817376676;
                                                    yield var105 ^ 1622423202;
                                                }
                                                case 2042895793 -> var105 ^ 667756942;
                                            };
                                            var161 = dU();
                                            long var9 = this.C;
                                            int var11 = var3 + 1;
                                            var11 = var3 * var11;
                                            var11 &= 1;
                                            if (var11 != 0) {
                                                var105 &= 1084077452;
                                                var105 ^= 1744919355;
                                                var105 += 425367449;
                                                var105 *= -278340689;
                                                var105 ^= 1072977096;
                                                break label222;
                                            }
                                            var105 = switch (var105) {
                                                case -2052544736 -> {
                                                    var105 -= -485007415;
                                                    yield var105 ^ 248356787;
                                                }
                                                default -> var105 ^ 1935940359;
                                                case -869535874 -> var105 ^ 1308350789;
                                            };
                                            Integer var190 = var105;
                                            if (var190 == null) {
                                                break label196;
                                            }

                                            var161 -= var9;
                                            long var194;
                                            int var168 = (var194 = var161 - 450L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                                            if (var168 < 0) {
                                                var105 ^= 537212984;
                                                var105 &= 1827683281;
                                                var105 ^= -1839211058;
                                                var161 = var105;
                                                var9 = var161 + 1L;
                                                var9 = var161 * var9;
                                                var161 = var9 & 1L;
                                                long var195;
                                                int var171 = (var195 = var161 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                                                if (var171 != 0) {
                                                    break label196;
                                                }

                                                float var172 = this.s;
                                                long var176 = var3;
                                                long var10 = var176 + 1L;
                                                var10 = var176 * var10;
                                                long var177 = var10 & 1L;
                                                long var196;
                                                int var178 = (var196 = var177 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                                                if (var178 != 0) {
                                                    switch (var105) {
                                                        case -1643119330:
                                                            var105 += -769589197;
                                                            var105 &= -547537112;
                                                            var105 += -1144010375;
                                                            var105 ^= 362452317;
                                                            break label222;
                                                        case 482270258:
                                                            var105 ^= -384940723;
                                                            break label222;
                                                        case 842897843:
                                                        default:
                                                            var105 ^= -1642347555;
                                                            break label222;
                                                    }
                                                }

                                                var105 >>>= 13;
                                                var105 += 1428509377;
                                                var105 |= 2055086974;
                                                var105 ^= -2039260225;
                                                var173 = var172;
                                                var105 += -1040512077;
                                                var105 += -1803762618;
                                                var105 ^= 2019114522;
                                                break label203;
                                            }

                                            var105 ^= -119985975;
                                            var105 <<= 16;
                                            var105 -= 709191833;
                                            var105 ^= 870219825;
                                            var105 ^= 795143243;
                                        } else {
                                            var105 += -110864953;
                                            var105 ^= 1676708674;
                                            var105 ^= 1160048405;
                                        }

                                        Integer var179 = var105;
                                        if (var179 == null) {
                                            break label196;
                                        }

                                        var173 = 1.0F;
                                        var105 &= -1304362123;
                                        var105 &= 1195507894;
                                        var105 >>= 16;
                                        var105 += 1867497128;
                                        var105 ^= 1486063688;
                                    }

                                    var146 = new ip(var156, var173);
                                    Integer var114 = var3;
                                    if (var114 != null) {
                                        var105 += 176798962;
                                        var105 += -1872432318;
                                        var105 *= 1335270019;
                                        var105 *= 1785229651;
                                        var105 ^= -832291265;
                                        long var157 = var105;
                                        long var180 = var157 + 1L;
                                        var180 = var157 * var180;
                                        long var187 = var157 + 2L;
                                        var180 *= var187;
                                        long var158 = var157 + 3L;
                                        var180 *= var158;
                                        long var159 = var180 & 7L;
                                        long var197;
                                        int var115 = (var197 = var159 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                        if (var115 != 0) {
                                            break label196;
                                        }

                                        boolean var116 = var127.add(var146);
                                        switch (var105) {
                                            case -1426675252:
                                                var105 ^= -731420361;
                                                break label208;
                                            case -893062723:
                                            default:
                                                var105 ^= 1008333697;
                                                break label208;
                                            case 60000267:
                                                var105 >>= 30;
                                                var105 &= 2027360254;
                                                var105 -= 1263954171;
                                                var105 &= -952904358;
                                                var105 ^= 1852018090;
                                                break label208;
                                        }
                                    }

                                    var105 ^= 584867841;
                                    var105 ^= 192595333;
                                }
                            }
                        }
                    } else {
                        var105 ^= 7659047;
                        var105 ^= -328707960;
                        var105 >>>= 20;
                        var105 ^= 511351218;
                    }
                } else {
                    var105 &= 673182233;
                    var105 >>>= 25;
                    var105 &= 1918315900;
                    var105 *= -2073729589;
                    var105 ^= 1234264312;
                }

                Integer var110 = var105;
                if (var110 != null) {
                    UnsupportedOperationException var111 = new UnsupportedOperationException();
                    throw var111;
                }
                break label196;
            }

            int var117 = var105 + 1;
            var117 = var105 * var117;
            var117 &= 1;
            if (var117 == 0) {
                return;
            }
        }

        UnsupportedOperationException var113 = new UnsupportedOperationException();
        throw var113;
    }

    private void oF(GN var1) {
        label138: {
            int var35;
            var35 = P;
            var35 ^= 352521723;
            int var3 = System.identityHashCode(this);
            Entity var4 = i_2.QI();
            Integer var5 = var3;
            label137:
            if (var5 != null) {
                var35 |= -1061001870;
                var35 ^= -41218255;
                long var130 = var35;
                long var7 = var130 + 1L;
                var7 = var130 * var7;
                long var9 = var130 + 2L;
                var7 *= var9;
                long var131 = var130 + 3L;
                var7 *= var131;
                long var132 = var7 & 7L;
                long var181;
                int var133 = (var181 = var132 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                if (var133 != 0) {
                    break label138;
                }

                if (var4 != null) {
                    var35 &= 1198092508;
                    var35 ^= -67345850;
                    var35 *= -278505479;
                    var35 ^= 1607592206;
                    Entity var134 = var1.entity();
                    Integer var6 = var3;
                    if (var6 == null) {
                        var35 -= -1984888149;
                        var35 -= -737328172;
                        var35 &= -1436456272;
                        var35 &= 1005585812;
                        var35 ^= 397383021;
                        break label137;
                    }

                    var35 -= 1480160432;
                    var35 -= -1687163199;
                    var35 ^= 1599638550;
                    var35 >>= 16;
                    var35 ^= -1645290391;
                    long var155 = var35;
                    long var8 = var155 + 1L;
                    var8 = var155 * var8;
                    long var156 = var8 & 1L;
                    long var182;
                    int var157 = (var182 = var156 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                    if (var157 != 0) {
                        break label138;
                    }

                    if (var134 == var4) {
                        long var102 = switch (var35) {
                            case -1368904818 -> var35 ^ 1688787186;
                            default -> var35 ^ -116366508;
                            case 1645311370 -> {
                                var35 >>>= 21;
                                var35 += 1090136827;
                                yield var35 ^ 424195122;
                            }
                        };
                        long var158 = var102 + 1L;
                        long var159 = var102 * var158;
                        long var103 = var159 & 1L;
                        long var183;
                        int var104 = (var183 = var103 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                        if (var104 == 0) {
                            this.O = 0;
                            return;
                        }
                        break label138;
                    }

                    switch (var35) {
                        case -29614640:
                            var35 ^= -782875063;
                            break;
                        case 1645311370:
                            var35 <<= 10;
                            var35 += -1559589259;
                            var35 <<= 25;
                            var35 |= -1007493285;
                            var35 ^= 448944591;
                            break;
                        case 2098146042:
                        default:
                            var35 ^= 1750638343;
                    }
                } else {
                    switch (var35) {
                        case -2096884644:
                            var35 ^= 1701198136;
                            break;
                        case -767090595:
                        default:
                            var35 ^= -1858238184;
                            break;
                        case 998111819:
                            var35 |= 2089785769;
                            var35 >>>= 31;
                            var35 *= 500972357;
                            var35 ^= -248478060;
                    }
                }

                int var105 = var35 + 1;
                int var106 = var35 * var105;
                var133 = var35 + 2;
                int var107 = var106 * var133;
                var133 = var35 + 3;
                int var108 = var107 * var133;
                int var109 = var108 & 7;
                if (var109 != 0) {
                    break label138;
                }

                var4 = var1.entity();
                var133 = var3 + 1;
                var133 = var3 * var133;
                int var160 = var3 + 2;
                var133 *= var160;
                var160 = var3 + 3;
                var133 *= var160;
                var133 &= 7;
                if (var133 != 0) {
                    switch (var35) {
                        case -1439990491:
                        default:
                            var35 ^= -174814157;
                            break;
                        case -570746294:
                            var35 ^= -716182418;
                            break;
                        case -248478060:
                            var35 ^= -1579143504;
                            var35 ^= 1331641689;
                    }
                } else {
                    var35 |= -703828995;
                    var35 *= -998203475;
                    var35 &= 1364731541;
                    var35 += 1018908707;
                    var35 ^= -135662184;
                    Integer var142 = var35;
                    if (var142 == null) {
                        break label138;
                    }

                    Entity var143 = this.g;
                    if (var4 != var143) {
                        var35 &= -2136714060;
                        var35 |= 2132111601;
                        var35 ^= 1160453657;
                        return;
                    }

                    var35 <<= 3;
                    var35 &= -1474079826;
                    var35 *= 1295563697;
                    var35 ^= 345282288;
                    int var111 = var35 + 1;
                    int var112 = var35 * var111;
                    int var113 = var112 & 1;
                    if (var113 != 0) {
                        break label138;
                    }

                    boolean var114 = this.uK;
                    long var144 = var3;
                    var7 = var144 + 1L;
                    var7 = var144 * var7;
                    long var145 = var7 & 1L;
                    long var184;
                    int var146 = (var184 = var145 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                    if (var146 != 0) {
                        var35 -= 1043954372;
                        var35 *= 983124077;
                        var35 &= -1016431125;
                        var35 ^= 516408693;
                    } else {
                        var35 += 45151568;
                        var35 ^= 959805689;
                        long var147 = var35;
                        var7 = var147 + 1L;
                        var7 = var147 * var7;
                        long var148 = var7 & 1L;
                        long var185;
                        var146 = (var185 = var148 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                        if (var146 != 0) {
                            break label138;
                        }

                        if (var114) {
                            var35 += 1839396040;
                            var35 -= -1650516129;
                            var35 &= -747600495;
                            var35 &= 1774800688;
                            var35 ^= -94474260;
                            return;
                        }

                        var35 &= -172361435;
                        var35 ^= 1136918223;
                        int var115 = var35 + 1;
                        int var116 = var35 * var115;
                        var146 = var35 + 2;
                        int var117 = var116 * var146;
                        var146 = var35 + 3;
                        int var118 = var117 * var146;
                        int var119 = var118 & 7;
                        if (var119 != 0) {
                            break label138;
                        }

                        long var120 = dU();
                        long var162 = this.C;
                        long var121 = var120 - var162;
                        var160 = var3 + 1;
                        var160 = var3 * var160;
                        int var178 = var3 + 2;
                        var160 *= var178;
                        int var179 = var3 + 3;
                        var160 *= var179;
                        var160 &= 7;
                        if (var160 != 0) {
                            var35 >>>= 9;
                            var35 ^= -861898322;
                            var35 ^= -752986816;
                        } else {
                            var35 += 918640663;
                            var35 *= 684352639;
                            var35 ^= 338956310;
                            var35 &= 361633962;
                            var35 ^= -2127692590;
                            Integer var168 = var35;
                            if (var168 == null) {
                                break label138;
                            }

                            long var186;
                            int var122 = (var186 = var121 - 450L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                            if (var122 >= 0) {
                                var35 |= 2043896170;
                                var35 &= 469627409;
                                var35 ^= -1545106692;
                                return;
                            }

                            var35 |= -50069219;
                            var35 >>= 24;
                            var35 &= 2011085516;
                            var35 ^= 1139265117;
                            this.uK = true;
                            int var123 = var3 + 1;
                            int var124 = var3 * var123;
                            var3 = var124 & 1;
                            if (var3 == 0) {
                                var35 |= 1649089417;
                                var35 *= 1182864625;
                                var35 &= -587629137;
                                var35 ^= -2133648490;
                                long var97 = var35;
                                long var152 = var97 + 1L;
                                long var153 = var97 * var152;
                                long var98 = var153 & 1L;
                                long var187;
                                var3 = (var187 = var98 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                                if (var3 != 0) {
                                    break label138;
                                }

                                List var100 = this.j;
                                Entity var154 = var1.entity();
                                float var169 = this.s;
                                ip var125 = new ip(var154, var169);
                                boolean var101 = var100.add(var125);
                                switch (var35) {
                                    case -796718433:
                                        var35 *= -1579780767;
                                        var35 ^= 2138430419;
                                        return;
                                    case -290051400:
                                        var35 ^= 820279551;
                                        return;
                                    case 1167822563:
                                    default:
                                        var35 ^= 384146799;
                                        return;
                                }
                            }

                            var35 |= -1592615609;
                            var35 += 308717721;
                            var35 ^= -668126451;
                        }
                    }
                }
            } else {
                var35 += -913908276;
                var35 >>>= 10;
                var35 ^= 529242654;
            }

            long var90 = var35;
            long var126 = var90 + 1L;
            long var127 = var90 * var126;
            long var170 = var90 + 2L;
            long var128 = var127 * var170;
            long var91 = var90 + 3L;
            long var129 = var128 * var91;
            long var92 = var129 & 7L;
            long var188;
            var35 = (var188 = var92 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
            if (var35 == 0) {
                AssertionError var95 = new AssertionError();
                throw var95;
            }
        }

        UnsupportedOperationException var94 = new UnsupportedOperationException();
        throw var94;
    }

    private void WW(int var1) {
        boolean var214 = false;
        label217: {
            int var3 = System.identityHashCode(this);
            List var4 = this.j;
            Integer var5 = var3;
            if (var5 == null) {
                switch (var1) {
                    case -2018087716:
                        int var20 = var1 ^ -117244009;
                        break;
                    case -59547113:
                    default:
                        int var19 = var1 ^ -1199727949;
                        break;
                    case 565605307:
                        int var2 = var1 | 608403900;
                        var2 |= -936150318;
                        var2 ^= -377936989;
                }
            } else {
                int var24 = switch (var1) {
                    case -63851346 -> var1 ^ -1554298331;
                    default -> var1 ^ -1362989478;
                    case 565605307 -> {
                        int var21 = var1 ^ -2035418913;
                        var21 *= -1235287045;
                        var21 += 1997752472;
                        yield var21 ^ 553412231;
                    }
                };
                boolean var159 = var4.isEmpty();
                if (var159) {
                    var24 += -1510528960;
                    var24 += 90544761;
                    var24 &= 324501946;
                    var24 -= 801257177;
                    var24 ^= 71364244;
                    Integer var163 = var24;
                    if (var163 != null) {
                        return;
                    }
                    break label217;
                }
                var24 = switch (var24) {
                    case -1886202830 -> var24 ^ -90812199;
                    default -> var24 ^ -1218829409;
                    case 1395620131 -> {
                        var24 += -1934338614;
                        var24 -= 1097664321;
                        yield var24 ^ 1383959707;
                    }
                };
                long var160 = dU();
                long var161 = var160;
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var283;
                int var169 = (var283 = var6 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                if (var169 != 0) {
                    var24 -= 1064653629;
                    var24 <<= 7;
                    var24 ^= 1316300124;
                } else {
                    var24 = switch (var24) {
                        case -871675081 -> {
                            var24 *= -1704067185;
                            var24 |= -42328589;
                            var24 -= 1182476858;
                            yield var24 ^ 947314056;
                        }
                        case 469679311 -> var24 ^ -5584677;
                        default -> var24 ^ 1782417550;
                    };
                    List var170 = this.j;
                    Iterator var171 = var170.iterator();
                    Iterator var172 = var171;
                    var24 <<= 30;
                    var24 ^= -1691839268;
                    var24 >>>= 3;
                    var24 ^= -694010224;

                    label209:
                    while (true) {
                        int var7 = var24 + 1;
                        var7 = var24 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label217;
                        }

                        int var176 = (var172.hasNext()) ? 1 : 0;
                        Integer var189 = var3;
                        if (var189 == null) {
                            var24 -= 150771841;
                            var24 *= 409421497;
                            var24 &= 1318129676;
                            var24 <<= 19;
                            var24 ^= -2066818980;
                            break;
                        }
                        var24 = switch (var24) {
                            case -842585077 -> {
                                var24 -= 1203166943;
                                var24 *= 2106969279;
                                var24 &= -927578888;
                                var24 -= 1460133810;
                                yield var24 ^ -1731219454;
                            }
                            default -> var24 ^ 128178624;
                            case 439055958 -> var24 ^ -168852559;
                        };
                        int var190 = var24 + 1;
                        int var191 = var24 * var190;
                        int var192 = var191 & 1;
                        if (var192 != 0) {
                            break label217;
                        }

                        if (var176 != 0) {
                            var24 -= -1305006145;
                            var24 >>= 18;
                            var24 ^= -1372836187;
                            long var177 = var24;
                            long var9 = var177 + 1L;
                            var9 = var177 * var9;
                            long var178 = var9 & 1L;
                            long var284;
                            var176 = (var284 = var178 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                            if (var176 != 0) {
                                break label217;
                            }

                            Object var180 = var172.next();
                            ip var181 = (ip)var180;
                            Entity var193 = var181.target();
                            int var195 = var193.getId();
                            int var10 = var3 + 1;
                            var10 = var3 * var10;
                            var10 &= 1;
                            if (var10 == 0) {
                                var24 &= -421670655;
                                var24 *= 1654842427;
                                var24 += 305579577;
                                var24 ^= -169907166;
                                Integer var199 = var24;
                                if (var199 == null) {
                                    break label217;
                                }

                                label196: {
                                    float var200 = var181.strength();
                                    float var285;
                                    int var201 = (var285 = var200 - 0.9F) == 0.0F ? 0 : (var285 < 0.0F ? -1 : 1);
                                    if (var201 > 0) {
                                        var24 ^= -762405341;
                                        var24 ^= 1016595993;
                                        var24 -= -490784813;
                                        var24 ^= 309147045;
                                        var24 ^= -572571727;
                                        long var202 = var24;
                                        long var12 = var202 + 1L;
                                        var12 = var202 * var12;
                                        long var203 = var12 & 1L;
                                        long var286;
                                        var201 = (var286 = var203 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                                        if (var201 != 0) {
                                            break label217;
                                        }

                                        Int2LongOpenHashMap var205 = this.zb;
                                        int var11 = var3 + 1;
                                        var11 = var3 * var11;
                                        int var250 = var3 + 2;
                                        var11 *= var250;
                                        int var251 = var3 + 3;
                                        var11 *= var251;
                                        var11 &= 7;
                                        if (var11 != 0) {
                                            var24 >>= 26;
                                            var24 ^= -76470356;
                                            break;
                                        }

                                        var24 >>>= 30;
                                        var24 -= -885289608;
                                        var24 &= 1597036742;
                                        var24 -= -377164510;
                                        var24 ^= 1473462968;
                                        var11 = var24 + 1;
                                        var11 = var24 * var11;
                                        int var252 = var24 + 2;
                                        var11 *= var252;
                                        int var253 = var24 + 3;
                                        var11 *= var253;
                                        var11 &= 7;
                                        if (var11 != 0) {
                                            break label217;
                                        }

                                        long var206 = var205.getOrDefault(var195, -4611686018427387904L);
                                        long var207 = var161 - var206;
                                        long var287;
                                        var201 = (var287 = var207 - 150L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                                        if (var201 < 0) {
                                            var24 &= -1116401454;
                                            var24 *= 636854689;
                                            var24 ^= 1583538390;
                                            var201 = var24 + 1;
                                            var201 = var24 * var201;
                                            var11 = var24 + 2;
                                            var201 *= var11;
                                            var11 = var24 + 3;
                                            var201 *= var11;
                                            var201 &= 7;
                                            if (var201 != 0) {
                                                break label217;
                                            }

                                            var214 = true;
                                            var24 >>= 17;
                                            var24 >>= 3;
                                            var24 -= 463333026;
                                            var24 ^= -1062255145;
                                            break label196;
                                        }

                                        var24 -= -1063371723;
                                        var24 *= 1324944095;
                                        var24 ^= 943550315;
                                    } else {
                                        var24 >>= 7;
                                        var24 ^= 740053964;
                                    }

                                    var214 = false;
                                    var24 <<= 25;
                                    var24 <<= 15;
                                    var24 &= 607960064;
                                    var24 -= 1372763938;
                                    var24 ^= -1965026878;
                                }

                                Integer var226 = var24;
                                if (var226 == null) {
                                    break label217;
                                }

                                Int2LongOpenHashMap var227 = this.zb;
                                int var254 = var3 + 1;
                                var254 = var3 * var254;
                                int var13 = var3 + 2;
                                var254 *= var13;
                                var13 = var3 + 3;
                                var254 *= var13;
                                var254 &= 7;
                                if (var254 != 0) {
                                    var24 += -1878851556;
                                    var24 += -161548633;
                                    var24 <<= 5;
                                    var24 -= 2143465104;
                                    var24 ^= -492202740;
                                    break;
                                }

                                var24 -= 1465908137;
                                var24 ^= 1355544826;
                                var254 = var24 + 1;
                                var254 = var24 * var254;
                                var13 = var24 + 2;
                                var254 *= var13;
                                var13 = var24 + 3;
                                var254 *= var13;
                                var254 &= 7;
                                if (var254 != 0) {
                                    break label217;
                                }

                                label179: {
                                    long var228 = var227.remove(var195);
                                    int var229 = this.fy;
                                    if (var195 == var229) {
                                        var24 += 1339536148;
                                        var24 >>>= 23;
                                        var24 *= -122189779;
                                        var24 += -531519957;
                                        var24 ^= 2093995295;
                                        long var230 = var24;
                                        long var275 = var230 + 1L;
                                        long var276 = var230 * var275;
                                        long var231 = var276 & 1L;
                                        long var288;
                                        var229 = (var288 = var231 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                                        if (var229 != 0) {
                                            break label217;
                                        }

                                        long var233 = this.eu;
                                        long var234 = var161 - var233;
                                        long var277 = var3;
                                        long var15 = var277 + 1L;
                                        var15 = var277 * var15;
                                        long var278 = var15 & 1L;
                                        long var289;
                                        var13 = (var289 = var278 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                                        if (var13 != 0) {
                                            var24 *= 2015513985;
                                            var24 ^= -1054826773;
                                            var24 |= -884860415;
                                            var24 *= -1954344535;
                                            var24 ^= 912547373;
                                            break;
                                        }
                                        var24 = switch (var24) {
                                            case 418126946 -> {
                                                var24 >>= 8;
                                                yield var24 ^ -1212608328;
                                            }
                                            default -> var24 ^ -1345533948;
                                            case 2075663835 -> var24 ^ 620651807;
                                        };
                                        long var290;
                                        var229 = (var290 = var234 - 1600L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                                        if (var229 < 0) {
                                            var24 ^= 230965360;
                                            var24 ^= -206189778;
                                            var24 ^= 1507664875;
                                            var229 = var24 + 1;
                                            var229 = var24 * var229;
                                            var254 = var24 + 2;
                                            var229 *= var254;
                                            var254 = var24 + 3;
                                            var229 *= var254;
                                            var229 &= 7;
                                            if (var229 != 0) {
                                                break label217;
                                            }

                                            var229 = this.O;
                                            Integer var266 = var3;
                                            if (var266 == null) {
                                                var24 ^= 185044914;
                                                var24 += 1139724030;
                                                var24 += -711777825;
                                                var24 ^= 805442780;
                                                break;
                                            }

                                            var24 += -1340728894;
                                            var24 -= -398984323;
                                            var24 <<= 29;
                                            var24 >>>= 13;
                                            var24 ^= 1057242173;
                                            this.O = ++var229;
                                            var24 -= 1452760183;
                                            var24 *= 1230556967;
                                            var24 ^= 477066824;
                                            break label179;
                                        }

                                        var24 >>>= 20;
                                        var24 &= 2125108915;
                                        var24 *= -1305791553;
                                        var24 |= 1406349786;
                                        var24 ^= 1031990655;
                                    } else {
                                        var24 -= 698230710;
                                        var24 &= -755846886;
                                        var24 *= -1449905835;
                                        var24 ^= -1752569765;
                                    }

                                    this.O = 1;
                                    switch (var24) {
                                        case 242120140:
                                        default:
                                            var24 ^= -601352006;
                                            break;
                                        case 1194495654:
                                            var24 ^= -2037692903;
                                            break;
                                        case 1314215073:
                                            var24 <<= 24;
                                            var24 += -1163778131;
                                            var24 ^= -1232547008;
                                            var24 ^= -1005800561;
                                    }
                                }

                                long var243 = var24;
                                long var280 = var243 + 1L;
                                long var281 = var243 * var280;
                                long var244 = var281 & 1L;
                                long var291;
                                int var245 = (var291 = var244 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                                if (var245 != 0) {
                                    break label217;
                                }

                                this.fy = var195;
                                this.eu = var161;
                                Int2LongOpenHashMap var246 = this.F;
                                long var247 = var246.put(var195, var161);
                                this.uC = var193;
                                this.m = var161;
                                EventBus var196 = this.TH;
                                var254 = this.O;
                                float var182 = var181.strength();
                                HitEvent var248 = new HitEvent(var193, var214, var254, var182);
                                long var183 = var3;
                                long var268 = var183 + 1L;
                                long var269 = var183 * var268;
                                long var14 = var183 + 2L;
                                long var270 = var269 * var14;
                                long var184 = var183 + 3L;
                                long var271 = var270 * var184;
                                long var185 = var271 & 7L;
                                long var292;
                                var176 = (var292 = var185 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                                if (var176 != 0) {
                                    var24 |= 1596984982;
                                    var24 ^= 2075695018;
                                    break;
                                }

                                var24 -= 1478177089;
                                var24 -= 418548471;
                                var24 *= 1138288865;
                                var24 ^= -884673970;
                                Object var187 = var196.A(var248);
                                switch (var24) {
                                    case -1418515337:
                                        var24 ^= 1879122596;
                                        continue;
                                    case -1100698204:
                                        var24 -= -1527114007;
                                        var24 *= -1137313001;
                                        var24 *= -1059435029;
                                        var24 ^= 916449828;
                                        continue;
                                    case 684661475:
                                    default:
                                        var24 ^= 1696502197;
                                        continue;
                                }
                            }

                            var24 *= -1150297639;
                            var24 >>= 3;
                            var24 ^= 74416613;
                            break;
                        }

                        var24 &= -858436723;
                        var24 += -1003395060;
                        var24 ^= 1436773503;
                        var24 ^= -786387953;
                        var4 = this.j;
                        int var164 = var3 + 1;
                        var164 = var3 * var164;
                        int var173 = var3 + 2;
                        var164 *= var173;
                        var3 += 3;
                        var164 *= var3;
                        var3 = var164 & 7;
                        if (var3 == 0) {
                            var24 ^= 1356776641;
                            var24 ^= -323141919;
                            var4.clear();
                            return;
                        }

                        switch (var24) {
                            case -2000574104:
                                var24 |= 1315917105;
                                var24 ^= -899599067;
                                break label209;
                            case -1161768895:
                                var24 ^= -33476578;
                                break label209;
                            case 363665601:
                            default:
                                var24 ^= -1782380569;
                                break label209;
                        }
                    }
                }
            }

            UnsupportedOperationException var158 = new UnsupportedOperationException();
            throw var158;
        }

        RuntimeException var155 = new RuntimeException();
        throw var155;
    }

    private void Wz(X var1) {
        label82: {
            int var2 = P;
            var2 ^= 1042800899;
            int var3 = System.identityHashCode(this);
            Entity var4 = var1.entity();
            int var65 = var4.getId();
            Int2LongOpenHashMap var5 = this.F;
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var94;
            int var76 = (var94 = var6 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
            if (var76 != 0) {
                switch (var2) {
                    case -531558073:
                    default:
                        var2 ^= 344900545;
                        break;
                    case -68990720:
                        var2 ^= 245727274;
                        break;
                    case 1838308578:
                        var2 |= -331434048;
                        var2 &= -1632735968;
                        var2 &= 786875459;
                        var2 ^= 658691429;
                        var2 ^= -515943980;
                }
            } else {
                label87: {
                    var2 = switch (var2) {
                        case -2127908245 -> var2 ^ 74283024;
                        default -> var2 ^ -895099535;
                        case 1838308578 -> {
                            var2 += 80520971;
                            var2 *= 1644311043;
                            yield var2 ^ 1813023904;
                        }
                    };
                    long var67 = var5.getOrDefault(var65, -4611686018427387904L);
                    long var7 = dU();
                    long var68 = var7 - var67;
                    long var95;
                    int var69 = (var95 = var68 - 4000L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                    if (var69 < 0) {
                        var2 += 1092478787;
                        var2 &= 1711020770;
                        var2 ^= 956660127;
                        int var70 = var2 + 1;
                        int var71 = var2 * var70;
                        int var72 = var71 & 1;
                        if (var72 != 0) {
                            break label82;
                        }

                        Entity var73 = var1.entity();
                        boolean var77 = var73 instanceof LivingEntity;
                        int var83 = var3 + 1;
                        int var84 = var3 * var83;
                        int var85 = var84 & 1;
                        if (var85 != 0) {
                            var2 |= -1174862301;
                            var2 >>= 29;
                            var2 ^= -1238961860;
                            var2 &= -948842331;
                            var2 ^= -1953841104;
                            break label87;
                        }
                        var2 = switch (var2) {
                            case -1647246263 -> var2 ^ -597575070;
                            default -> var2 ^ 1428922340;
                            case 1036876093 -> {
                                var2 ^= 1902444035;
                                var2 >>>= 31;
                                var2 += 983703454;
                                var2 += -1482877346;
                                yield var2 ^ 316586861;
                            }
                        };
                        var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var96;
                        int var89 = (var96 = var7 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                        if (var89 != 0) {
                            break label82;
                        }

                        if (var77) {
                            var2 *= 49106039;
                            var2 >>>= 5;
                            var2 <<= 27;
                            var2 ^= 1335598962;
                            LivingEntity var74 = (LivingEntity)var73;
                            Int2LongOpenHashMap var78 = this.F;
                            var6 = var78.remove(var65);
                            EventBus var66 = this.TH;
                            int var80 = var3 + 1;
                            int var81 = var3 * var80;
                            var3 = var81 & 1;
                            if (var3 != 0) {
                                switch (var2) {
                                    case -1635636602:
                                    default:
                                        var2 ^= 1377274224;
                                        break label87;
                                    case -725104093:
                                        var2 ^= 1517510648;
                                        break label87;
                                    case 396074866:
                                        var2 |= -251541804;
                                        var2 |= -1712151322;
                                        var2 ^= 891305799;
                                        break label87;
                                }
                            }

                            var2 += -1358993275;
                            var2 >>= 11;
                            var2 *= 1487384777;
                            var2 *= 1490492861;
                            var2 ^= -1519155845;
                            Integer var61 = var2;
                            if (var61 == null) {
                                break label82;
                            }

                            int var82 = this.O;
                            KillEvent var62 = new KillEvent(var74, var82);
                            var61 = (Integer)var66.A(var62);
                            var2 *= -955114051;
                            var2 -= 397519000;
                            var2 += -2031944019;
                            var2 ^= 335090442;
                        } else {
                            var2 += -1373560792;
                            var2 ^= -949229257;
                        }
                    } else {
                        switch (var2) {
                            case -877930137:
                                var2 >>>= 8;
                                var2 -= -416842263;
                                var2 ^= 1103981182;
                                break;
                            case -834438093:
                            default:
                                var2 ^= -786967399;
                                break;
                            case 984240966:
                                var2 ^= -919499306;
                        }
                    }

                    Integer var51 = var2;
                    if (var51 != null) {
                        return;
                    }
                    break label82;
                }
            }

            IllegalStateException var64 = new IllegalStateException();
            throw var64;
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    private void o(int var1) {
        label303: {
            int var3 = System.identityHashCode(this);
            Entity var4 = i_2.QI();
            var4 = var4;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            int var92;
            if (var5 != 0) {
                var92 = var1 >>> 22;
                var92 += -414719476;
                var92 <<= 27;
                var92 ^= 334797229;
            } else {
                var92 = var1 >>> 25;
                var92 |= 787216323;
                var92 ^= -1794958424;
                var92 ^= -1544920420;
                var92 ^= 1847878869;
                Integer var200 = var92;
                if (var200 == null) {
                    break label303;
                }

                if (var4 == null) {
                    var92 >>= 2;
                    var92 ^= 472361148;
                    var92 &= -1009004968;
                    var92 ^= -1122786223;
                    Int2FloatOpenHashMap var228 = this.q;
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    var6 &= 1;
                    if (var6 == 0) {
                        var92 *= -164074053;
                        var92 ^= -1333146846;
                        long var254 = var92;
                        long var278 = var254 + 1L;
                        var278 = var254 * var278;
                        long var255 = var278 & 1L;
                        long var381;
                        var6 = (var381 = var255 - 0L) == 0L ? 0 : (var381 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            var228.clear();
                            return;
                        }
                        break label303;
                    }

                    switch (var92) {
                        case -1570789405:
                        default:
                            var92 ^= 1479455035;
                            break;
                        case -1130781119:
                            var92 ^= -1322096831;
                            var92 <<= 20;
                            var92 ^= -1308589345;
                            var92 ^= -369878158;
                            break;
                        case 1010376417:
                            var92 ^= 8103450;
                    }
                } else {
                    var92 += 1651073274;
                    var92 ^= -1168217953;
                    long var201 = var92;
                    long var7 = var201 + 1L;
                    var7 = var201 * var7;
                    long var9 = var201 + 2L;
                    var7 *= var9;
                    long var202 = var201 + 3L;
                    var7 *= var202;
                    long var203 = var7 & 7L;
                    long var382;
                    int var204 = (var382 = var203 - 0L) == 0L ? 0 : (var382 < 0L ? -1 : 1);
                    if (var204 != 0) {
                        break label303;
                    }

                    IntOpenHashSet var205 = this.Pb;
                    var205.clear();
                    EventBus var206 = this.TH;
                    int var207 = var206.l(tZ.class) ? 1 : 0;
                    var207 = (var207 != 0) ? 1 : 0;
                    long var230 = var3;
                    long var8 = var230 + 1L;
                    var8 = var230 * var8;
                    long var231 = var8 & 1L;
                    long var383;
                    var6 = (var383 = var231 - 0L) == 0L ? 0 : (var383 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        var92 ^= 721112417;
                        var92 ^= 63043455;
                    } else {
                        var92 *= 2129532173;
                        var92 &= 1001221798;
                        var92 ^= 566182328;
                        double var233 = 2304.0;
                        Iterable var273 = i_2.S();
                        Iterator var274 = var273.iterator();
                        Iterator var275 = var274;
                        var92 ^= -1763290797;
                        var92 *= -903188593;
                        var92 ^= -1045715479;

                        label278:
                        while (true) {
                            var9 = var92;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var384;
                            int var283 = (var384 = var9 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                            if (var283 != 0) {
                                break label303;
                            }

                            boolean var284 = var275.hasNext();
                            Integer var10 = var3;
                            if (var10 == null) {
                                var92 |= 1315838234;
                                var92 ^= 1295322189;
                                var92 ^= -1654490889;
                                var92 ^= 69867868;
                                var92 ^= 1895295441;
                                break;
                            }
                            var92 = switch (var92) {
                                default -> var92 ^ -1935406453;
                                case -463389877 -> var92 ^ -1003905789;
                                case -348779382 -> {
                                    var92 += -620718539;
                                    yield var92 ^ 354758971;
                                }
                            };
                            long var294 = var92;
                            long var12 = var294 + 1L;
                            var12 = var294 * var12;
                            long var14 = var294 + 2L;
                            var12 *= var14;
                            long var295 = var294 + 3L;
                            var12 *= var295;
                            long var296 = var12 & 7L;
                            long var385;
                            int var297 = (var385 = var296 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                            if (var297 != 0) {
                                break label303;
                            }

                            if (!var284) {
                                var92 >>>= 8;
                                var92 &= 1158460285;
                                var92 &= 454520732;
                                var92 ^= -359290463;
                                int var187 = var92 + 1;
                                int var188 = var92 * var187;
                                var207 = var92 + 2;
                                int var189 = var188 * var207;
                                var207 = var92 + 3;
                                int var190 = var189 * var207;
                                int var191 = var190 & 7;
                                if (var191 != 0) {
                                    break label303;
                                }

                                Int2FloatOpenHashMap var192 = this.q;
                                Integer var211 = var3;
                                if (var211 != null) {
                                    var92 ^= -381463943;
                                    var92 -= 448801767;
                                    var92 -= 175808692;
                                    var92 |= -1455928666;
                                    var92 ^= -1452964901;
                                    long var212 = var92;
                                    var7 = var212 + 1L;
                                    var7 = var212 * var7;
                                    var9 = var212 + 2L;
                                    var7 *= var9;
                                    long var213 = var212 + 3L;
                                    var7 *= var213;
                                    long var214 = var7 & 7L;
                                    long var386;
                                    int var215 = (var386 = var214 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                                    if (var215 != 0) {
                                        break label303;
                                    }

                                    IntSet var193 = var192.keySet();
                                    IntIterator var194 = var193.iterator();
                                    IntIterator var195 = var194;
                                    var92 >>= 30;
                                    var92 ^= 1890783400;

                                    while (true) {
                                        var215 = var92 + 1;
                                        var215 = var92 * var215;
                                        var215 &= 1;
                                        if (var215 != 0) {
                                            break label303;
                                        }

                                        int var219 = (var195.hasNext()) ? 1 : 0;
                                        var6 = var3 + 1;
                                        var6 = var3 * var6;
                                        var6 &= 1;
                                        if (var6 != 0) {
                                            var92 *= 329558523;
                                            var92 >>= 30;
                                            var92 ^= -1274321326;
                                            break label278;
                                        }

                                        var92 ^= -1345561186;
                                        var92 |= -362532081;
                                        var92 &= 524525554;
                                        var92 ^= 1604833992;
                                        long var237 = var92;
                                        var8 = var237 + 1L;
                                        var8 = var237 * var8;
                                        long var238 = var8 & 1L;
                                        long var387;
                                        var6 = (var387 = var238 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                                        if (var6 != 0) {
                                            break label303;
                                        }

                                        if (var219 == 0) {
                                            var92 |= -1017057054;
                                            var92 ^= 216500364;
                                            long var183 = var92;
                                            long var226 = var183 + 1L;
                                            long var227 = var183 * var226;
                                            long var184 = var227 & 1L;
                                            long var397;
                                            var3 = (var397 = var184 - 0L) == 0L ? 0 : (var397 < 0L ? -1 : 1);
                                            if (var3 == 0) {
                                                return;
                                            }
                                            break label303;
                                        }

                                        var92 *= 247402985;
                                        var92 *= 1991103061;
                                        var92 <<= 22;
                                        var92 &= -700306078;
                                        var92 ^= -826288001;
                                        long var220 = var92;
                                        var7 = var220 + 1L;
                                        var7 = var220 * var7;
                                        var9 = var220 + 2L;
                                        var7 *= var9;
                                        long var221 = var220 + 3L;
                                        var7 *= var221;
                                        long var222 = var7 & 7L;
                                        long var388;
                                        var219 = (var388 = var222 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                                        if (var219 != 0) {
                                            break label303;
                                        }

                                        IntOpenHashSet var224 = this.Pb;
                                        var6 = var195.nextInt();
                                        boolean var225 = var224.contains(var6);
                                        var6 = var3 + 1;
                                        var6 = var3 * var6;
                                        int var268 = var3 + 2;
                                        var6 *= var268;
                                        int var269 = var3 + 3;
                                        var6 *= var269;
                                        var6 &= 7;
                                        if (var6 != 0) {
                                            switch (var92) {
                                                case 384255683:
                                                    var92 ^= -633350680;
                                                    break label278;
                                                case 448780415:
                                                    var92 >>>= 11;
                                                    var92 -= -1860721259;
                                                    var92 += 1751967001;
                                                    var92 ^= -1666445614;
                                                    break label278;
                                                case 1014535374:
                                                default:
                                                    var92 ^= 1143898284;
                                                    break label278;
                                            }
                                        }
                                        var92 = switch (var92) {
                                            case -1289610118 -> var92 ^ -601834775;
                                            case 448780415 -> {
                                                var92 += -1282851584;
                                                yield var92 ^ -1861130539;
                                            }
                                            default -> var92 ^ -1257249184;
                                        };
                                        var6 = var92 + 1;
                                        var6 = var92 * var6;
                                        int var270 = var92 + 2;
                                        var6 *= var270;
                                        int var271 = var92 + 3;
                                        var6 *= var271;
                                        var6 &= 7;
                                        if (var6 != 0) {
                                            break label303;
                                        }

                                        if (!var225) {
                                            var92 = switch (var92) {
                                                default -> var92 ^ 311298138;
                                                case 1599632298 -> {
                                                    var92 += -1463031891;
                                                    var92 &= -1487334583;
                                                    var92 *= -1839865345;
                                                    yield var92 ^ -1484371933;
                                                }
                                                case 1998526295 -> var92 ^ 1145293995;
                                            };
                                            var195.remove();
                                            var92 >>= 5;
                                            var92 -= 1808481736;
                                            var92 &= 431217359;
                                            var92 >>= 10;
                                            var92 ^= 1891065085;
                                        } else {
                                            var92 &= -1734773084;
                                            var92 >>>= 26;
                                            var92 >>>= 9;
                                            var92 ^= 231591822;
                                            var92 ^= 2105466663;
                                        }
                                    }
                                }

                                var92 -= -240729389;
                                var92 ^= -1290109325;
                                break;
                            }

                            var92 |= 1261711340;
                            var92 += -1239933139;
                            var92 >>= 25;
                            var92 ^= 1818831148;
                            var9 = var92;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var389;
                            int var287 = (var389 = var9 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                            if (var287 != 0) {
                                break label303;
                            }

                            Object var288 = var275.next();
                            Entity var289 = (Entity)var288;
                            int var298 = (var289 instanceof LivingEntity) ? 1 : 0;
                            var11 = var3;
                            var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var390;
                            int var316 = (var390 = var11 - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                            if (var316 != 0) {
                                var92 += 1936637450;
                                var92 -= -1729579094;
                                var92 ^= 635978985;
                                break;
                            }

                            var92 >>= 21;
                            var92 -= -628925245;
                            var92 += 2128791357;
                            var92 ^= -649230345;
                            if (var298 != 0) {
                                var92 &= 180791429;
                                var92 ^= 208340096;
                                var92 <<= 31;
                                var92 &= -318449967;
                                var92 ^= -1403018827;
                                LivingEntity var299 = (LivingEntity)var289;
                                double var317 = var289.squaredDistanceTo(var4);
                                int var345 = var3 + 1;
                                int var346 = var3 * var345;
                                int var360 = var3 + 2;
                                int var347 = var346 * var360;
                                int var361 = var3 + 3;
                                int var348 = var347 * var361;
                                int var349 = var348 & 7;
                                if (var349 != 0) {
                                    switch (var92) {
                                        case 722844440:
                                        default:
                                            var92 ^= 526666817;
                                            break label278;
                                        case 744464821:
                                            var92 ^= -1840550845;
                                            var92 -= -560900245;
                                            var92 ^= -1804079322;
                                            break label278;
                                        case 1433997053:
                                            var92 ^= -1670977084;
                                            break label278;
                                    }
                                }

                                var92 |= -1897947708;
                                var92 ^= 1007904228;
                                var92 += 1633890246;
                                var92 ^= -977047689;
                                var13 = var92;
                                var15 = var13 + 1L;
                                var15 = var13 * var15;
                                var13 = var15 & 1L;
                                long var391;
                                int var352 = (var391 = var13 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                                if (var352 != 0) {
                                    break label303;
                                }

                                double var392;
                                int var318 = (var392 = var317 - var233) == 0.0 ? 0 : (var392 < 0.0 ? -1 : 1);
                                if (var318 > 0) {
                                    var92 = switch (var92) {
                                        case -1213628912 -> var92 ^ -447411512;
                                        case 838035616 -> {
                                            var92 *= 1815765321;
                                            var92 ^= -2136141831;
                                            yield var92 ^ 42197542;
                                        }
                                        default -> var92 ^ 1345142045;
                                    } + 1522650824;
                                    var92 -= 25564246;
                                    var92 += 1003515674;
                                    var92 += 2005465943;
                                    var92 ^= -791760408;
                                } else {
                                    var92 >>>= 3;
                                    var92 |= -1673801458;
                                    var92 |= -732553013;
                                    var92 ^= -98093580;
                                    var92 ^= -729953546;
                                    int var290 = var289.getId();
                                    float var319 = var299.getHealth();
                                    IntOpenHashSet var323 = this.Pb;
                                    boolean var324 = var323.add(var290);
                                    Integer var325 = var3;
                                    if (var325 == null) {
                                        switch (var92) {
                                            case -1957823416:
                                                var92 ^= -1014631371;
                                                break label278;
                                            case -1220146917:
                                            default:
                                                var92 ^= 1126478122;
                                                break label278;
                                            case -266009891:
                                                var92 *= 1675353171;
                                                var92 += -45113169;
                                                var92 >>>= 11;
                                                var92 ^= 1273406242;
                                                break label278;
                                        }
                                    }
                                    var92 = switch (var92) {
                                        default -> var92 ^ -105489780;
                                        case -266009891 -> {
                                            var92 ^= 875017714;
                                            yield var92 ^ -228349873;
                                        }
                                        case 1449402637 -> var92 ^ 1995671021;
                                    };
                                    var12 = var92;
                                    var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var12 = var14 & 1L;
                                    long var393;
                                    int var328 = (var393 = var12 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                                    if (var328 != 0) {
                                        break label303;
                                    }

                                    Int2FloatOpenHashMap var329 = this.q;
                                    boolean var330 = var329.containsKey(var290);
                                    if (var330) {
                                        var92 += 208259939;
                                        var92 *= 1695223885;
                                        var92 *= 681422947;
                                        var92 ^= -2010046919;
                                        int var331 = var92 + 1;
                                        int var332 = var92 * var331;
                                        int var353 = var92 + 2;
                                        int var333 = var332 * var353;
                                        int var354 = var92 + 3;
                                        int var334 = var333 * var354;
                                        int var335 = var334 & 7;
                                        if (var335 != 0) {
                                            break label303;
                                        }

                                        Int2FloatOpenHashMap var336 = this.q;
                                        float var337 = var336.get(var290);
                                        float var394;
                                        int var355 = (var394 = var337 - var319) == 0.0F ? 0 : (var394 < 0.0F ? -1 : 1);
                                        var14 = var3;
                                        long var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        long var18 = var14 + 2L;
                                        var16 *= var18;
                                        var14 += 3L;
                                        var16 *= var14;
                                        var14 = var16 & 7L;
                                        long var395;
                                        int var367 = (var395 = var14 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                                        if (var367 != 0) {
                                            var92 *= 1511873419;
                                            var92 ^= 511785938;
                                            var92 ^= 1754649611;
                                            var92 ^= 562362640;
                                            break;
                                        }

                                        var92 ^= -201828214;
                                        var92 -= -1325711724;
                                        var92 ^= -541850698;
                                        Integer var368 = var92;
                                        if (var368 == null) {
                                            break label303;
                                        }

                                        if (var355 != 0) {
                                            var92 ^= 846067727;
                                            var92 -= 678841223;
                                            var92 += -348583152;
                                            var92 >>= 7;
                                            var92 ^= -1752687723;
                                            int var356 = var92 + 1;
                                            int var357 = var92 * var356;
                                            int var358 = var357 & 1;
                                            if (var358 != 0) {
                                                break label303;
                                            }

                                            if (var207 != 0) {
                                                var92 += 1557243734;
                                                var92 ^= -1452615815;
                                                EventBus var359 = this.TH;
                                                tZ var369 = new tZ(var299, var337, var319);
                                                var15 = var3;
                                                long var17 = var15 + 1L;
                                                var17 = var15 * var17;
                                                long var19 = var15 + 2L;
                                                var17 *= var19;
                                                var15 += 3L;
                                                var17 *= var15;
                                                var15 = var17 & 7L;
                                                long var396;
                                                var298 = (var396 = var15 - 0L) == 0L ? 0 : (var396 < 0L ? -1 : 1);
                                                if (var298 != 0) {
                                                    var92 <<= 20;
                                                    var92 &= 1540453819;
                                                    var92 &= 1637159092;
                                                    var92 ^= 825307874;
                                                    var92 ^= 978692943;
                                                    break;
                                                }
                                                var92 = switch (var92) {
                                                    default -> var92 ^ 1101281757;
                                                    case 250268602 -> var92 ^ -1896936531;
                                                    case 1560565513 -> {
                                                        var92 += 593485109;
                                                        var92 &= 45908880;
                                                        var92 &= -326022338;
                                                        var92 &= -1442592364;
                                                        yield var92 ^ -669451071;
                                                    }
                                                };
                                                var298 = var92 + 1;
                                                var298 = var92 * var298;
                                                int var338 = var92 + 2;
                                                var298 *= var338;
                                                int var339 = var92 + 3;
                                                var298 *= var339;
                                                var298 &= 7;
                                                if (var298 != 0) {
                                                    break label303;
                                                }

                                                Object var306 = var359.A(var369);
                                                var92 &= -1973643545;
                                                var92 &= 1008026838;
                                                var92 ^= -1888862251;
                                            } else {
                                                switch (var92) {
                                                    case -1751328486:
                                                        var92 &= -618018515;
                                                        var92 ^= 686388448;
                                                        var92 -= -1363816681;
                                                        var92 ^= -1974348348;
                                                        break;
                                                    case -310746072:
                                                    default:
                                                        var92 ^= -1774491856;
                                                        break;
                                                    case -57322534:
                                                        var92 ^= -23754673;
                                                }
                                            }
                                        } else {
                                            var92 |= 101004439;
                                            var92 ^= 1311217302;
                                            var92 ^= -1096099532;
                                        }
                                    } else {
                                        var92 ^= -1221140373;
                                        var92 ^= 103662622;
                                    }

                                    Int2FloatOpenHashMap var307 = this.q;
                                    Integer var340 = var3;
                                    if (var340 == null) {
                                        switch (var92) {
                                            case -2022032619:
                                                var92 -= 933276235;
                                                var92 += 1807022476;
                                                var92 ^= -260434949;
                                                break label278;
                                            case -599430800:
                                            default:
                                                var92 ^= -541298107;
                                                break label278;
                                            case 669341122:
                                                var92 ^= 1014855996;
                                                break label278;
                                        }
                                    }

                                    var92 &= -1082594327;
                                    var92 += -1659502296;
                                    var92 *= -1556259385;
                                    var92 ^= -653192066;
                                    float var291 = var307.put(var290, var319);
                                    switch (var92) {
                                        case -2041720165:
                                        default:
                                            var92 ^= -1661312748;
                                            break;
                                        case -811625295:
                                            var92 ^= -1732829206;
                                            break;
                                        case 1749363873:
                                            var92 -= 849748886;
                                            var92 >>>= 28;
                                            var92 ^= -348779383;
                                    }
                                }
                            } else {
                                switch (var92) {
                                    case -1108039894:
                                    default:
                                        var92 ^= 166895678;
                                        break;
                                    case 799543175:
                                        var92 ^= 1072346325;
                                        break;
                                    case 2098389217:
                                        var92 >>>= 6;
                                        var92 += -377867035;
                                        var92 |= -765026111;
                                        var92 |= 1599135626;
                                        var92 ^= 340325217;
                                }
                            }
                        }
                    }
                }
            }

            Integer var180 = var92;
            if (var180 != null) {
                UnsupportedOperationException var182 = new UnsupportedOperationException();
                throw var182;
            }
        }

        UnsupportedOperationException var181 = new UnsupportedOperationException();
        throw var181;
    }

    private static long dU() {
        return System.currentTimeMillis();
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1902527574;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        P = var4;
    }
}
