package mvggs.modules.sound;

import dev.aurap.hub.*;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public final class hitsounds extends Yn {
    private static final String[] c;
    private static final Set K;
    private static Object[] a;
    private final r_2 S;
    private final r_2 Zd;
    private final r_2 b;
    private final Uq I;
    private final Uq iA;
    private final Uq dv;
    private final Uq EC;
    private final JL bM;
    private final JL HT;
    private final JL Cv;
    private final JL ms;
    private final JL Ub;
    private final JL N;
    private final JL E;
    private final Uq[] Wf;
    private boolean EU;
    public static final int zb;

    public hitsounds() {
        super("hit_sounds", "Hit Sounds", AJ.SOUND);
        AJ var1 = AJ.SOUND;

        c_2 var2 = c_2.AURA;
        r_2 var4 = new r_2("sound", "Normal Sound", var2);
        xB var5 = this.vn(var4);
        r_2 var6 = (r_2)var5;
        this.S = var6;
        var2 = c_2.AURA;
        r_2 var7 = new r_2("crit_sound", "Critical Sound", var2);
        xB var8 = this.vn(var7);
        r_2 var9 = (r_2)var8;
        this.Zd = var9;
        var2 = c_2.AURA;
        r_2 var10 = new r_2("sweep_sound", "Sweep / Spam Sound", var2);
        xB var11 = var10.q("Hits below 90% attack charge use this channel.");
        r_2 var12 = (r_2)var11;
        xB var13 = this.vn(var12);
        r_2 var14 = (r_2)var13;
        this.b = var14;
        Uq var15 = new Uq("normal_volume", "Normal Volume", 100.0F, 0.0F, 200.0F);
        Uq var16 = var15.W(5.0F);
        Uq var17 = var16.L("%");
        xB var18 = this.vn(var17);
        Uq var19 = (Uq)var18;
        this.I = var19;
        Uq var20 = new Uq("crit_volume", "Critical Volume", 100.0F, 0.0F, 200.0F);
        Uq var21 = var20.W(5.0F);
        Uq var22 = var21.L("%");
        xB var23 = this.vn(var22);
        Uq var24 = (Uq)var23;
        this.iA = var24;
        Uq var25 = new Uq("sweep_volume", "Sweep Volume", 75.0F, 0.0F, 200.0F);
        Uq var26 = var25.W(5.0F);
        Uq var27 = var26.L("%");
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.dv = var29;
        Uq var30 = new Uq("volume", "Volume", 1.0F, 0.0F, 2.0F);
        Uq var31 = var30.W(0.05F);
        Uq var32 = var31.L("x");
        xB var33 = this.vn(var32);
        Uq var34 = (Uq)var33;
        this.EC = var34;
        JL var35 = new JL("positional", "Positional", false);
        xB var36 = this.vn(var35);
        JL var37 = (JL)var36;
        this.bM = var37;
        JL var38 = new JL("combo_pitch", "Combo Pitch", true);
        xB var39 = this.vn(var38);
        JL var40 = (JL)var39;
        this.HT = var40;
        JL var41 = new JL("random_pitch", "Random Pitch", false);
        xB var42 = this.vn(var41);
        JL var43 = (JL)var42;
        this.Cv = var43;
        JL var44 = new JL("crit_only", "Crits Only", false);
        xB var45 = this.vn(var44);
        JL var46 = (JL)var45;
        this.ms = var46;
        JL var47 = new JL("kill", "Kill Sound", true);
        xB var48 = this.vn(var47);
        JL var49 = (JL)var48;
        this.Ub = var49;
        JL var50 = new JL("totem", "Totem Sound", true);
        xB var51 = this.vn(var50);
        JL var52 = (JL)var51;
        this.N = var52;
        JL var53 = new JL("mute_vanilla", "Mute Vanilla Hits", true);
        xB var54 = this.vn(var53);
        JL var55 = (JL)var54;
        this.E = var55;
        Uq[] var56 = new Uq[6];
        Uq var67 = this.m("vanilla_crit", "Vanilla Crit", -1470036949);
        var56[0] = var67;
        Uq var68 = this.m("vanilla_sweep", "Vanilla Sweep", -1470036949);
        var56[1] = var68;
        Uq var69 = this.m("vanilla_nodamage", "Vanilla No Damage", -1470036949);
        var56[2] = var69;
        Uq var70 = this.m("vanilla_knockback", "Vanilla Knockback", -1470036949);
        var56[3] = var70;
        Uq var71 = this.m("vanilla_strong", "Vanilla Strong", -1470036949);
        var56[4] = var71;
        Uq var72 = this.m("vanilla_weak", "Vanilla Weak", -1470036949);
        var56[5] = var72;
        this.Wf = var56;
        this.dy("Separate voices and volume for normal hits, criticals and low-cooldown sweep / spam hits.");
        this.fJ(true);
        r_2 var57 = this.S;
        r_2 var73 = this.Zd;
        r_2 var3 = this.b;
        List var58 = List.of(var57, var73, var3);
        Iterator var59 = var58.iterator();
        Iterator var60 = var59;

        while (true) {
            boolean var74 = var60.hasNext();
            if (!var74) {
                wD<Hm> var61 = (Hm var1x) -> {
                    label69: {
                        int var14x;
                        var14x = zb;
                        var14x ^= 800164219;
                        int var3x = System.identityHashCode(this);
                        JL var4x = this.ms;
                        boolean var56x = var4x.vb();
                        int var5x = var3x + 1;
                        var5x = var3x * var5x;
                        var5x &= 1;
                        label62:
                        if (var5x == 0) {
                            var14x &= 1554846332;
                            var14x >>>= 26;
                            var14x ^= -461647421;
                            if (var56x) {
                                var14x >>>= 14;
                                var14x -= 567232939;
                                var14x ^= 792610160;
                                long var57x = var14x;
                                long var6x = var57x + 1L;
                                var6x = var57x * var6x;
                                long var8x = var57x + 2L;
                                var6x *= var8x;
                                long var58x = var57x + 3L;
                                var6x *= var58x;
                                long var59x = var6x & 7L;
                                long var74x;
                                int var60x = (var74x = var59x - 0L) == 0L ? 0 : (var74x < 0L ? -1 : 1);
                                if (var60x != 0) {
                                    break label69;
                                }

                                int var61x = (var1x.crit()) ? 1 : 0;
                                var5x = var3x + 1;
                                var5x = var3x * var5x;
                                var3x = var5x & 1;
                                if (var3x != 0) {
                                    var14x *= 2054842843;
                                    var14x -= 1887158055;
                                    var14x ^= -553857116;
                                    break label62;
                                }
                                var14x = switch (var14x) {
                                    case -1068022442 -> var14x ^ 900945475;
                                    case -250999500 -> {
                                        var14x <<= 4;
                                        var14x |= -1036153725;
                                        var14x *= -1252257951;
                                        var14x &= -416960056;
                                        yield var14x ^ -2056412212;
                                    }
                                    default -> var14x ^ 851959737;
                                };
                                if (var61x == 0) {
                                    switch (var14x) {
                                        case -967994868:
                                            var14x ^= -96767253;
                                            var14x ^= 480001438;
                                            return;
                                        case -420126264:
                                        default:
                                            var14x ^= 201018818;
                                            return;
                                        case 502318991:
                                            var14x ^= -2116024037;
                                            return;
                                    }
                                }

                                switch (var14x) {
                                    case -967994868:
                                        var14x += 996927318;
                                        var14x |= 934978637;
                                        var14x &= -347536290;
                                        var14x -= 379443031;
                                        var14x ^= -2007726987;
                                        break;
                                    case 258994142:
                                    default:
                                        var14x ^= 486629883;
                                        break;
                                    case 1627539121:
                                        var14x ^= -1452283903;
                                }
                            } else {
                                var14x += -1582895222;
                                var14x ^= 35482072;
                            }

                            Integer var51x = var14x;
                            if (var51x == null) {
                                break label69;
                            }

                            int var52x = var14x & -888954467;
                            var52x |= -1617681745;
                            var52x ^= -101555892;
                            var52x ^= 1836417602;
                            this.eA(var1x, var52x);
                            switch (var14x) {
                                case -2076202878:
                                    var14x += 1303413496;
                                    var14x -= -624800837;
                                    var14x += -656476283;
                                    var14x ^= -253359555;
                                    return;
                                case -1337566753:
                                    var14x ^= 1681122356;
                                    return;
                                case 1433881722:
                                default:
                                    var14x ^= -1149874611;
                                    return;
                            }
                        } else {
                            var14x ^= 1904288070;
                            var14x &= 2056652847;
                            var14x &= 658591705;
                            var14x ^= 196292593;
                        }

                        long var37x = var14x;
                        long var62x = var37x + 1L;
                        long var63x = var37x * var62x;
                        long var73x = var37x + 2L;
                        long var64x = var63x * var73x;
                        long var38x = var37x + 3L;
                        long var65x = var64x * var38x;
                        long var39x = var65x & 7L;
                        long var75x;
                        var14x = (var75x = var39x - 0L) == 0L ? 0 : (var75x < 0L ? -1 : 1);
                        if (var14x == 0) {
                            IllegalArgumentException var41x = new IllegalArgumentException();
                            throw var41x;
                        }
                    }

                    IllegalArgumentException var49x = new IllegalArgumentException();
                    throw var49x;
                };
                this.iI(Hm.class, var61);
                wD<I> var62 = (I var1x) -> {
                    label55: {
                        int var2x = zb;
                        var2x ^= 1582558401;
                        int var3x = System.identityHashCode(this);
                        JL var4x = this.Ub;
                        long var5x = var3x;
                        long var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        var5x = var7x & 1L;
                        long var73x;
                        int var57x = (var73x = var5x - 0L) == 0L ? 0 : (var73x < 0L ? -1 : 1);
                        if (var57x != 0) {
                            switch (var2x) {
                                case -1977677593:
                                default:
                                    var2x ^= 1705133663;
                                    break;
                                case -1109072408:
                                    var2x >>= 23;
                                    var2x &= 2053389056;
                                    var2x ^= -243921910;
                                    break;
                                case 256263329:
                                    var2x ^= 1478402274;
                            }
                        } else {
                            label54: {
                                var2x >>= 6;
                                var2x ^= 1583145435;
                                var2x *= -2054234829;
                                var2x *= -1752533845;
                                var2x ^= -36429835;
                                int var58x = var2x + 1;
                                int var59x = var2x * var58x;
                                int var6x = var2x + 2;
                                int var60x = var59x * var6x;
                                var6x = var2x + 3;
                                int var61x = var60x * var6x;
                                int var62x = var61x & 7;
                                if (var62x != 0) {
                                    break label55;
                                }

                                boolean var49x = var4x.vb();
                                if (var49x) {
                                    var2x |= -597708673;
                                    var2x += 1503608339;
                                    var2x *= 1878253633;
                                    var2x *= -1486645821;
                                    var2x ^= -1393753126;
                                    Integer var50x = var2x;
                                    if (var50x == null) {
                                        break label55;
                                    }

                                    LivingEntity var51x = var1x.victim();
                                    Integer var40x = var3x;
                                    if (var40x == null) {
                                        var2x *= 763993555;
                                        var2x ^= -319698290;
                                        break label54;
                                    }

                                    var2x >>>= 25;
                                    var2x |= 512572435;
                                    var2x ^= -1424698909;
                                    var40x = var2x;
                                    if (var40x == null) {
                                        break label55;
                                    }

                                    int var42x = var2x >> 6;
                                    var42x *= -899764429;
                                    var42x ^= 159147706;
                                    var42x *= 484358937;
                                    var42x ^= -115806855;
                                    this.j("kill", var51x, false, 1.0F, var42x);
                                    var2x ^= -401985337;
                                    var2x ^= -1083992848;
                                } else {
                                    var2x *= 507595191;
                                    var2x ^= -1499506941;
                                    var2x += -472630924;
                                    var2x <<= 11;
                                    var2x ^= 799787503;
                                }

                                long var33x = var2x;
                                long var52x = var33x + 1L;
                                long var53x = var33x * var52x;
                                long var67x = var33x + 2L;
                                long var54x = var53x * var67x;
                                long var34x = var33x + 3L;
                                long var55x = var54x * var34x;
                                long var35x = var55x & 7L;
                                long var74x;
                                var2x = (var74x = var35x - 0L) == 0L ? 0 : (var74x < 0L ? -1 : 1);
                                if (var2x == 0) {
                                    return;
                                }
                                break label55;
                            }
                        }

                        var5x = var2x;
                        var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        long var9x = var5x + 2L;
                        var7x *= var9x;
                        var5x += 3L;
                        var7x *= var5x;
                        var5x = var7x & 7L;
                        long var75x;
                        var3x = (var75x = var5x - 0L) == 0L ? 0 : (var75x < 0L ? -1 : 1);
                        if (var3x == 0) {
                            IllegalStateException var48x = new IllegalStateException();
                            throw var48x;
                        }
                    }

                    UnsupportedOperationException var39x = new UnsupportedOperationException();
                    throw var39x;
                };
                this.iI(I.class, var62);
                wD<Vt> var63 = (Vt var1x) -> {
                    int var2x = zb;
                    var2x ^= -947318787;
                    int var3x = System.identityHashCode(this);
                    JL var4x = this.N;
                    boolean var44x = var4x.vb();
                    int var5x = var3x + 1;
                    var5x = var3x * var5x;
                    int var6x = var3x + 2;
                    var5x *= var6x;
                    var6x = var3x + 3;
                    var5x *= var6x;
                    var5x &= 7;
                    label34:
                    if (var5x == 0) {
                        var2x += -943214009;
                        var2x &= -185610622;
                        var2x ^= 1519217457;
                        if (var44x) {
                            var2x -= -213990865;
                            var2x += -1758191002;
                            var2x |= 1889726170;
                            var2x ^= 849015353;
                            Entity var45x = var1x.entity();
                            Integer var38x = var3x;
                            if (var38x == null) {
                                var2x |= -1027861389;
                                var2x ^= -135165963;
                                var2x ^= 244502127;
                                break label34;
                            }

                            var2x += 1738138923;
                            var2x |= 55597268;
                            var2x ^= 1254911717;
                            long var50x = var2x;
                            long var7x = var50x + 1L;
                            var7x = var50x * var7x;
                            long var51x = var7x & 1L;
                            long var54x;
                            int var39x = (var54x = var51x - 0L) == 0L ? 0 : (var54x < 0L ? -1 : 1);
                            if (var39x != 0) {
                                AssertionError var43x = new AssertionError();
                                throw var43x;
                            }

                            var39x = var2x - -459414374;
                            var39x |= -1899852303;
                            var39x ^= 664367039;
                            this.j("totem", var45x, false, 1.0F, var39x);
                            switch (var2x) {
                                case -1639752613:
                                default:
                                    var2x ^= -1428990234;
                                    break;
                                case -1560931555:
                                    var2x ^= 1759213516;
                                    break;
                                case -315476965:
                                    var2x |= 1521064229;
                                    var2x *= -1938934503;
                                    var2x ^= -2138577452;
                            }
                        } else {
                            var2x += -1250060986;
                            var2x ^= -1229606266;
                            var2x |= 631223095;
                            var2x |= 498461448;
                            var2x ^= -475162612;
                        }

                        return;
                    } else {
                        var2x *= 548727755;
                        var2x -= -1158492905;
                        var2x |= 59372110;
                        var2x ^= 67546918;
                    }

                    UnsupportedOperationException var32x = new UnsupportedOperationException();
                    throw var32x;
                };
                this.iI(Vt.class, var63);
                wD<Kl> var64 = (Kl var1x) -> {
                    label72: {
                        int var2x = zb;
                        var2x ^= 832711039;
                        int var3x = System.identityHashCode(this);
                        JL var4x = this.E;
                        long var5x = var3x;
                        long var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        long var9x = var5x + 2L;
                        var7x *= var9x;
                        var5x += 3L;
                        var7x *= var5x;
                        var5x = var7x & 7L;
                        long var65x;
                        int var58x = (var65x = var5x - 0L) == 0L ? 0 : (var65x < 0L ? -1 : 1);
                        if (var58x != 0) {
                            var2x <<= 18;
                            var2x ^= 1570401868;
                        } else {
                            label71: {
                                var2x -= 955237312;
                                var2x += 1956387253;
                                var2x ^= -783389020;
                                Integer var59x = var2x;
                                if (var59x == null) {
                                    break label72;
                                }

                                boolean var49x = var4x.vb();
                                if (var49x) {
                                    var2x = switch (var2x) {
                                        default -> var2x ^ 1764166368;
                                        case -594601745 -> {
                                            var2x += -38799114;
                                            var2x &= 365368109;
                                            yield var2x ^ -885665907;
                                        }
                                        case 183863523 -> var2x ^ 2068270125;
                                    };
                                    long var50x = var2x;
                                    long var6x = var50x + 1L;
                                    var6x = var50x * var6x;
                                    long var51x = var6x & 1L;
                                    long var66x;
                                    int var52x = (var66x = var51x - 0L) == 0L ? 0 : (var66x < 0L ? -1 : 1);
                                    if (var52x != 0) {
                                        break label72;
                                    }

                                    Set var53x = K;
                                    String var60x = var1x.P();
                                    int var54x = (var53x.contains(var60x)) ? 1 : 0;
                                    Integer var39x = var3x;
                                    if (var39x == null) {
                                        var2x += 248828309;
                                        var2x >>>= 5;
                                        var2x ^= -611167283;
                                        break label71;
                                    }

                                    var2x >>>= 20;
                                    var2x ^= 1695395353;
                                    if (var54x != 0) {
                                        var2x = switch (var2x) {
                                            default -> var2x ^ 873448542;
                                            case 357494635 -> var2x ^ 2029432698;
                                            case 1695392682 -> {
                                                var2x ^= -1944109226;
                                                var2x |= -862892025;
                                                yield var2x ^ -1448660785;
                                            }
                                        };
                                        var39x = var2x;
                                        if (var39x == null) {
                                            break label72;
                                        }

                                        var1x.wq();
                                        switch (var2x) {
                                            case -1682856609:
                                            default:
                                                var2x ^= 344632988;
                                                break;
                                            case -1562979053:
                                                var2x ^= 172686812;
                                                break;
                                            case 1144319024:
                                                var2x *= 1429444273;
                                                var2x -= 1847489783;
                                                var2x ^= 1590323451;
                                        }
                                    } else {
                                        var2x += -1979561605;
                                        var2x <<= 15;
                                        var2x >>= 15;
                                        var2x ^= 458849767;
                                    }
                                } else {
                                    var2x |= 156175625;
                                    var2x -= 1137043604;
                                    var2x += 923300455;
                                    var2x ^= 901199616;
                                }

                                var3x = var2x + 1;
                                var3x = var2x * var3x;
                                int var55x = var2x + 2;
                                var3x *= var55x;
                                var2x += 3;
                                var3x *= var2x;
                                var2x = var3x & 7;
                                if (var2x == 0) {
                                    return;
                                }
                                break label72;
                            }
                        }

                        var3x = var2x + 1;
                        var3x = var2x * var3x;
                        var3x &= 1;
                        if (var3x == 0) {
                            UnsupportedOperationException var48x = new UnsupportedOperationException();
                            throw var48x;
                        }
                    }

                    IllegalStateException var38x = new IllegalStateException();
                    throw var38x;
                };
                this.iI(Kl.class, var64);
                return;
            }

        Object var2q = (Object)var60.next();
            Object var2y = var2q;
            r_2 var76 = (r_2)var2y;
            Runnable var77 = () -> {
                int var1x = zb;
                var1x ^= 1196224085;
                int var2x = System.identityHashCode(var76);
                c_2 var3x = c_2.CUSTOM;
                int var42x = (var76.TJ(var3x)) ? 1 : 0;
                long var4x = var2x;
                long var6x = var4x + 1L;
                var6x = var4x * var6x;
                long var8x = var4x + 2L;
                var6x *= var8x;
                var4x += 3L;
                var6x *= var4x;
                var4x = var6x & 7L;
                long var53x;
                var2x = (var53x = var4x - 0L) == 0L ? 0 : (var53x < 0L ? -1 : 1);
                if (var2x == 0) {
                    var1x <<= 24;
                    var1x |= 1248515906;
                    var1x -= -1193635054;
                    var1x ^= 576381514;
                    var2x = var1x + 1;
                    var2x = var1x * var2x;
                    var2x &= 1;
                    label35:
                    if (var2x == 0) {
                        if (var42x != 0) {
                            var1x >>>= 24;
                            var1x >>>= 25;
                            var1x ^= 1649734546;
                            var2x = var1x + 1;
                            var2x = var1x * var2x;
                            var2x &= 1;
                            if (var2x != 0) {
                                break label35;
                            }

                            bw_2.Q();
                            var1x |= -284260508;
                            var1x *= -1853741025;
                            var1x -= 339505868;
                            var1x ^= -652729777;
                            var1x ^= -406704926;
                        } else {
                            switch (var1x) {
                                case -406149510:
                                    var1x ^= 925192520;
                                    var1x &= -1344100621;
                                    var1x ^= 1104587617;
                                    break;
                                case 399277370:
                                default:
                                    var1x ^= 966470629;
                                    break;
                                case 1081441797:
                                    var1x ^= 53455730;
                            }
                        }

                        long var38x = var1x;
                        var4x = var38x + 1L;
                        var4x = var38x * var4x;
                        var6x = var38x + 2L;
                        var4x *= var6x;
                        long var39x = var38x + 3L;
                        var4x *= var39x;
                        long var40x = var4x & 7L;
                        long var54x;
                        var2x = (var54x = var40x - 0L) == 0L ? 0 : (var54x < 0L ? -1 : 1);
                        if (var2x == 0) {
                            return;
                        }
                    }
                } else {
                    var1x |= 703794021;
                    var1x >>= 10;
                    var1x ^= -1527192894;
                    Integer var28x = var1x;
                    if (var28x != null) {
                        IllegalStateException var30x = new IllegalStateException();
                        throw var30x;
                    }
                }

                IllegalStateException var29x = new IllegalStateException();
                throw var29x;
            };
            var76.k(var77);
        }
    }

    private Uq m(String var1, String var2, int var3) {
        int var5 = System.identityHashCode(this);
        Uq var6 = new Uq(var1, var2, 1.0F, 0.0F, 1.0F);
        var6 = var6.W(0.05F);
        BooleanSupplier var7 = () -> {
            int var1x = zb;
            var1x ^= 174205049;
            int var2x = System.identityHashCode(this);
            long var35x = var2x;
            long var4x = var35x + 1L;
            var4x = var35x * var4x;
            long var36x = var4x & 1L;
            long var51;
            var2x = (var51 = var36x - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x >>= 2;
                var1x *= -1117574479;
                var1x >>>= 25;
                var1x += 1565258748;
                var1x ^= 518786458;
                IllegalStateException var43 = new IllegalStateException();
                throw var43;
            } else {
                var1x *= -2139432139;
                var1x >>>= 17;
                var1x ^= -1641972400;
                Integer var38 = var1x;
                label38:
                if (var38 != null) {
                    JL var39 = this.E;
                    boolean var40 = var39.vb();
                    boolean var42;
                    if (!var40) {
                        var1x &= 222569483;
                        var1x *= 177850661;
                        var1x ^= -2125934774;
                        var38 = var1x;
                        if (var38 == null) {
                            break label38;
                        }

                        var42 = true;
                        var1x |= -1822321059;
                        var1x -= 612034417;
                        var1x ^= -129956093;
                    } else {
                        var1x &= -365712642;
                        var1x |= 1416875085;
                        var1x &= 1213728152;
                        var1x -= 837044557;
                        var1x ^= -347607551;
                        Integer var3x = var1x;
                        if (var3x == null) {
                            break label38;
                        }

                        var42 = false;
                        switch (var1x) {
                            case -47426374:
                                var1x ^= 849194210;
                                var1x &= -729649463;
                                var1x -= 1728284094;
                                var1x *= -1143757311;
                                var1x ^= -250617371;
                                break;
                            case 808850019:
                            default:
                                var1x ^= 1684284907;
                                break;
                            case 839197054:
                                var1x ^= -762588012;
                        }
                    }

                    long var44 = var1x;
                    long var5x = var44 + 1L;
                    var5x = var44 * var5x;
                    long var7x = var44 + 2L;
                    var5x *= var7x;
                    var44 += 3L;
                    var5x *= var44;
                    var44 = var5x & 7L;
                    long var52;
                    var1x = (var52 = var44 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var1x == 0) {
                        return var42;
                    }
                }

                UnsupportedOperationException var29x = new UnsupportedOperationException();
                throw var29x;
            }
        };
        xB var29 = var6.Pt(var7);
        var6 = (Uq)var29;
        xB var31 = this.vn(var6);
        int var32 = var5 + 1;
        int var33 = var5 * var32;
        var5 = var33 & 1;
        if (var5 != 0) {
            int var4 = switch (var3) {
                case -1470036949 -> {
                    int var8 = var3 + -255699768;
                    var8 &= 1552476109;
                    var8 -= -319078889;
                    var8 -= -1191995174;
                    yield var8 ^ -1653428897;
                }
                default -> var3 ^ 765371189;
                case 997321156 -> var3 ^ 637115013;
            };
            var5 = var4 + 1;
            var5 = var4 * var5;
            int var34 = var4 + 2;
            var5 *= var34;
            int var35 = var4 + 3;
            var5 *= var35;
            var5 &= 7;
            if (var5 == 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            }
        } else {
            int var12 = switch (var3) {
                default -> var3 ^ -163485786;
                case -1470036949 -> {
                    int var13 = var3 * -1644083239;
                    yield var13 ^ 666689960;
                }
                case 1406050088 -> var3 ^ -644170942;
            };
            var5 = var12 + 1;
            var5 = var12 * var5;
            int var36 = var12 + 2;
            var5 *= var36;
            var12 += 3;
            var5 *= var12;
            var12 = var5 & 7;
            if (var12 == 0) {
                return (Uq)var31;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public static float r(SoundInstance var0) {
        int var1 = zb;
        var1 ^= 1535528178;
        int var2 = System.identityHashCode(var0);
        Integer var3 = var2;
        if (var3 == null) {
            var1 -= -1805522106;
            var1 <<= 14;
            var1 ^= -726418815;
            var1 |= 1772359547;
            var1 ^= -69365061;
        } else {
            label252: {
                var1 *= 40239535;
                var1 ^= -1937176103;
                var3 = var1;
                label220:
                if (var3 != null) {
                    boolean var181 = Ud.y();
                    if (!var181) {
                        switch (var1) {
                            case -1998762587:
                                var1 ^= 290368866;
                                break;
                            case 717197932:
                                var1 |= 2109260380;
                                var1 ^= -1382288629;
                                var1 ^= 204160005;
                                break;
                            case 1262045248:
                            default:
                                var1 ^= -1543687873;
                        }

                        return 1.0F;
                    }

                    var1 ^= -657922662;
                    var1 |= -2105590990;
                    var1 ^= -474044669;
                    Ud var182 = Ud.Z();
                    NW var183 = var182.sP();
                    Yn var184 = var183.tG(hitsounds.class);
                    hitsounds var185 = (hitsounds)var184;
                    int var4 = (var185.IU()) ? 1 : 0;
                    Integer var5 = var2;
                    if (var5 == null) {
                        switch (var1) {
                            case -225858923:
                            default:
                                var1 ^= -1325931447;
                                break label252;
                            case 297916661:
                                var1 -= 406950092;
                                var1 += 1233133568;
                                var1 ^= -747960983;
                                break label252;
                            case 901421269:
                                var1 ^= -1968994357;
                                break label252;
                        }
                    }

                    var1 -= 966327260;
                    var1 += -106323795;
                    var1 |= -172354732;
                    var1 |= -734816557;
                    var1 ^= 709321531;
                    if (var4 != 0) {
                        var1 *= 479790183;
                        var1 *= 631793185;
                        var1 ^= -138736741;
                        JL var186 = var185.E;
                        int var199 = var2 + 1;
                        var199 = var2 * var199;
                        int var6 = var2 + 2;
                        var199 *= var6;
                        var6 = var2 + 3;
                        var199 *= var6;
                        var199 &= 7;
                        if (var199 != 0) {
                            var1 ^= -2108070572;
                            var1 &= 108136714;
                            var1 ^= -1804899254;
                            break label252;
                        }

                        var1 &= 2077805686;
                        var1 -= 1107316635;
                        var1 >>>= 26;
                        var1 ^= 1770578613;
                        var199 = var1 + 1;
                        var199 = var1 * var199;
                        var199 &= 1;
                        if (var199 != 0) {
                            break label220;
                        }

                        var4 = var186.vb() ? 1 : 0;
                        if (var4 == 0) {
                            var1 -= 690013084;
                            var1 ^= -1254470190;
                            var4 = var1 + 1;
                            var4 = var1 * var4;
                            var199 = var1 + 2;
                            var4 *= var199;
                            var199 = var1 + 3;
                            var4 *= var199;
                            var4 &= 7;
                            if (var4 != 0) {
                                break label220;
                            }

                            Object[] var193 = a;
                            Integer var209 = var2;
                            if (var209 == null) {
                                var1 += 801690711;
                                var1 |= -607193224;
                                var1 ^= 1874106938;
                                break label252;
                            }

                            var1 &= 2004158808;
                            var1 >>>= 28;
                            var1 ^= 1076713603;
                            var209 = var1;
                            if (var209 == null) {
                                break label220;
                            }

                            Object[] var215;
                            if (var193 == null) {
                                var1 *= -1937200471;
                                var1 += -2113009133;
                                var1 >>>= 5;
                                var1 ^= 1508850305;
                                var1 ^= 1223210550;
                                String[] var211 = c;
                                int var212 = var211.length;
                                Object[] var213 = new Object[var212];
                                Object[] var214 = var213;
                                int var217 = 0;
                                int var7 = var2 + 1;
                                var7 = var2 * var7;
                                int var8 = var2 + 2;
                                var7 *= var8;
                                var8 = var2 + 3;
                                var7 *= var8;
                                var7 &= 7;
                                if (var7 != 0) {
                                    var1 += 493346715;
                                    var1 ^= -1114380263;
                                    break label252;
                                }

                                var1 -= -1856126954;
                                var1 *= -1038557155;
                                var1 &= -1572592330;
                                var1 ^= 302106827;
                                var7 = var1 + 1;
                                var7 = var1 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    break label220;
                                }

                                var217 = var217;
                                var1 += -851613383;
                                var1 &= 127583695;
                                var1 ^= -153052824;
                                var1 ^= 1086447625;

                                while (true) {
                                    Integer var235 = var1;
                                    if (var235 == null) {
                                        break label220;
                                    }

                                    int var236 = var214.length;
                                    Integer var254 = var2;
                                    if (var254 == null) {
                                        var1 -= -682339370;
                                        var1 *= -1375679899;
                                        var1 &= 1541432982;
                                        var1 += 133798104;
                                        var1 ^= -1047341158;
                                        break label252;
                                    }

                                    var1 &= 1703848477;
                                    var1 ^= 1741020851;
                                    var1 *= -1822268099;
                                    var1 ^= -1600399377;
                                    var1 ^= -451877274;
                                    if (var217 >= var236) {
                                        var1 = switch (var1) {
                                            default -> var1 ^ 113465789;
                                            case 1387046615 -> {
                                                var1 ^= 468760134;
                                                var1 -= 1900199762;
                                                var1 |= 532622255;
                                                yield var1 ^ -184191590;
                                            }
                                            case 1430450462 -> var1 ^ 1522836870;
                                        };
                                        a = var214;
                                        long var219 = var2;
                                        long var259 = var219 + 1L;
                                        long var260 = var219 * var259;
                                        long var220 = var260 & 1L;
                                        long var299;
                                        var217 = (var299 = var220 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                        if (var217 != 0) {
                                            var1 -= 1128889446;
                                            var1 ^= 1998322943;
                                            break label252;
                                        }

                                        var1 += 722374465;
                                        var1 &= 1464153629;
                                        var1 |= -1033240085;
                                        var1 ^= 412172639;
                                        var215 = var214;
                                        var1 -= -1022301343;
                                        var1 ^= -987441704;
                                        var1 ^= -859340149;
                                        var1 ^= -1042244909;
                                        break;
                                    }

                                    var1 &= 1993709179;
                                    var1 &= 1990496341;
                                    var1 &= -1126433521;
                                    var1 ^= -1931858127;
                                    long var237 = var1;
                                    long var9 = var237 + 1L;
                                    var9 = var237 * var9;
                                    long var11 = var237 + 2L;
                                    var9 *= var11;
                                    long var238 = var237 + 3L;
                                    var9 *= var238;
                                    long var239 = var9 & 7L;
                                    long var300;
                                    var236 = (var300 = var239 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                                    if (var236 != 0) {
                                        break label220;
                                    }

                                    String[] var241 = c;
                                    var254 = var2;
                                    if (var254 == null) {
                                        var1 *= -1504276527;
                                        var1 ^= 568106682;
                                        var1 ^= -105699894;
                                        break label252;
                                    }

                                    var1 -= -169298507;
                                    var1 |= 737422162;
                                    var1 ^= -866283330;
                                    int var256 = var1 + 1;
                                    var256 = var1 * var256;
                                    var256 &= 1;
                                    if (var256 != 0) {
                                        break label220;
                                    }

                                    String var242 = var241[var217];
                                    Object var243 = i_2.o(var242);
                                    var214[var217] = var243;
                                    var236 = var217 + 1;
                                    var217 = var236;
                                    var1 *= 1589510185;
                                    var1 ^= -108249112;
                                }
                            } else {
                                var1 |= -780571036;
                                var1 >>= 31;
                                var1 ^= -1761898474;
                                var215 = var193;
                                var1 -= 1441547863;
                                var1 *= -272911489;
                                var1 *= -2114705567;
                                var1 >>= 18;
                                var1 ^= -991314197;
                            }

                            Integer var194 = var1;
                            if (var194 == null) {
                                break label220;
                            }

                            var194 = (Integer)i_2.mq(var0);
                            var194 = var194;
                            long var222 = var2;
                            long var261 = var222 + 1L;
                            var261 = var222 * var261;
                            long var223 = var261 & 1L;
                            long var301;
                            var6 = (var301 = var223 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                var1 ^= -629128216;
                                var1 >>= 24;
                                var1 ^= -1872007842;
                                break label252;
                            }
                            var1 = switch (var1) {
                                case -991320881 -> {
                                    var1 -= -549326968;
                                    var1 >>= 18;
                                    var1 &= -498963853;
                                    var1 |= -1814530874;
                                    yield var1 ^ 801413590;
                                }
                                case -127060802 -> var1 ^ -1717372498;
                                default -> var1 ^ -1564326345;
                            };
                            Integer var225 = var1;
                            if (var225 == null) {
                                break label220;
                            }

                            byte var226 = 0;
                            int var227 = var226;
                            var1 -= -11079718;
                            var1 &= -147730424;
                            var1 ^= 1759585152;

                            while (true) {
                                Integer var245 = var1;
                                if (var245 == null) {
                                    break label220;
                                }

                                int var246 = var215.length;
                                var261 = var2;
                                long var10 = var261 + 1L;
                                var10 = var261 * var10;
                                var261 = var10 & 1L;
                                long var302;
                                int var265 = (var302 = var261 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                                if (var265 != 0) {
                                    switch (var1) {
                                        case -1126108288:
                                            var1 |= -925646439;
                                            var1 ^= 1821941465;
                                            break label252;
                                        case 840836217:
                                        default:
                                            var1 ^= 1540096132;
                                            break label252;
                                        case 1224542259:
                                            var1 ^= -1979631327;
                                            break label252;
                                    }
                                }

                                var1 <<= 6;
                                var1 += -1951528765;
                                var1 ^= 2130692927;
                                if (var227 >= var246) {
                                    switch (var1) {
                                        case -1274074687:
                                            var1 ^= -634397946;
                                            break;
                                        case -1122688004:
                                            var1 |= 1749338694;
                                            var1 &= 953162931;
                                            var1 ^= 538516708;
                                            var1 += -1603506160;
                                            var1 ^= 730008165;
                                            break;
                                        case 1957173328:
                                        default:
                                            var1 ^= -1699221471;
                                    }

                                    return 1.0F;
                                }
                                var1 = switch (var1) {
                                    case -1122688004 -> {
                                        var1 &= -550129535;
                                        yield var1 ^ 1543651045;
                                    }
                                    default -> var1 ^ -938449645;
                                    case 1911646304 -> var1 ^ 1308421046;
                                };
                                Object var247 = var215[var227];
                                int var248 = (var247.equals(var194)) ? 1 : 0;
                                int var266 = var2 + 1;
                                int var267 = var2 * var266;
                                int var268 = var267 & 1;
                                if (var268 != 0) {
                                    var1 *= -1923303097;
                                    var1 ^= 1606878787;
                                    break label252;
                                }

                                var1 &= -1698743895;
                                var1 &= -1129328087;
                                var1 |= -832808514;
                                var1 ^= 767382706;
                                var261 = var1;
                                var10 = var261 + 1L;
                                var10 = var261 * var10;
                                long var12 = var261 + 2L;
                                var10 *= var12;
                                var261 += 3L;
                                var10 *= var261;
                                var261 = var10 & 7L;
                                long var303;
                                int var272 = (var303 = var261 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                                if (var272 != 0) {
                                    break label220;
                                }

                                if (var248 != 0) {
                                    var1 ^= 377857060;
                                    var1 &= 1958743522;
                                    var1 ^= -1936268679;
                                    Integer var250 = var1;
                                    if (var250 != null) {
                                        Uq[] var251 = var185.Wf;
                                        int var278 = var2 + 1;
                                        int var279 = var2 * var278;
                                        int var280 = var279 & 1;
                                        if (var280 != 0) {
                                            var1 |= 1833623968;
                                            var1 ^= 1840613049;
                                            break label252;
                                        }

                                        var1 >>>= 8;
                                        var1 ^= -2122987908;
                                        var261 = var1;
                                        var10 = var261 + 1L;
                                        var10 = var261 * var10;
                                        var261 = var10 & 1L;
                                        long var304;
                                        int var283 = (var304 = var261 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                                        if (var283 == 0) {
                                            Uq var252 = var251[var227];
                                            return var252.WM();
                                        }
                                    }
                                    break label220;
                                }

                                var1 >>= 1;
                                var1 ^= -1986056159;
                                var248 = var227 + 1;
                                var261 = var2;
                                var10 = var261 + 1L;
                                var10 = var261 * var10;
                                var12 = var261 + 2L;
                                var10 *= var12;
                                var261 += 3L;
                                var10 *= var261;
                                var261 = var10 & 7L;
                                long var305;
                                int var276 = (var305 = var261 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                                if (var276 != 0) {
                                    var1 <<= 27;
                                    var1 >>>= 17;
                                    var1 += -913605619;
                                    var1 ^= 1507915085;
                                    break label252;
                                }

                                var1 &= 1465756172;
                                var1 |= -1115565014;
                                var1 ^= 825736507;
                                Integer var277 = var1;
                                if (var277 == null) {
                                    break label220;
                                }

                                var227 = var248;
                                var1 *= 1731442105;
                                var1 ^= 164609595;
                                var1 &= 1073198375;
                                var1 += 2095357907;
                                var1 ^= 975681369;
                            }
                        }

                        var1 >>= 7;
                        var1 -= 350878049;
                        var1 ^= 1266299815;
                    } else {
                        var1 >>>= 24;
                        var1 ^= 506967824;
                        var1 -= 799133283;
                        var1 ^= 1555519888;
                        var1 ^= 313629503;
                    }

                    long var176 = var1;
                    long var197 = var176 + 1L;
                    long var198 = var176 * var197;
                    long var177 = var198 & 1L;
                    long var306;
                    var2 = (var306 = var177 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return 1.0F;
                    }
                }

                UnsupportedOperationException var179 = new UnsupportedOperationException();
                throw var179;
            }
        }

        IllegalArgumentException var175 = new IllegalArgumentException();
        throw var175;
    }

    private void eA(Hm var1, int var2) {
        boolean var476 = false;
        float var687 = 0.0F;
        label748: {
            int var4 = System.identityHashCode(this);
            Integer var5 = var4;
            if (var5 == null) {
                int var462 = var2 + 937277656;
                var462 ^= -1781768602;
                var462 *= 619752549;
                var462 ^= -1014771372;
            } else {
                label785: {
                    int var3 = switch (var2) {
                        case 185614753 -> {
                            int var16 = var2 ^ 1197211732;
                            var16 |= -663606782;
                            var16 |= 145247293;
                            var16 >>>= 26;
                            yield var16 ^ 1564045557;
                        }
                        default -> var2 ^ 1980314616;
                        case 1899203735 -> var2 ^ -1046650270;
                    };
                    boolean var478 = var1.crit();
                    r_2 var484;
                    if (var478) {
                        var3 >>>= 13;
                        var3 ^= 100787584;
                        long var479 = var3;
                        long var7 = var479 + 1L;
                        var7 = var479 * var7;
                        long var9 = var479 + 2L;
                        var7 *= var9;
                        long var480 = var479 + 3L;
                        var7 *= var480;
                        long var481 = var7 & 7L;
                        long var892;
                        int var482 = (var892 = var481 - 0L) == 0L ? 0 : (var892 < 0L ? -1 : 1);
                        if (var482 != 0) {
                            break label748;
                        }

                        r_2 var483 = this.Zd;
                        long var6 = var4;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var893;
                        int var495 = (var893 = var6 - 0L) == 0L ? 0 : (var893 < 0L ? -1 : 1);
                        if (var495 != 0) {
                            switch (var3) {
                                case -1707966398:
                                default:
                                    var3 ^= 1982146076;
                                    break label785;
                                case 100863051:
                                    var3 ^= -1735835053;
                                    var3 |= -1691552602;
                                    var3 ^= -273171503;
                                    break label785;
                                case 1140425164:
                                    var3 ^= 462851027;
                                    break label785;
                            }
                        }

                        var3 *= 699372571;
                        var3 ^= -169198911;
                        var3 ^= 1572132614;
                        var484 = var483;
                        var3 <<= 21;
                        var3 *= 1718269131;
                        var3 &= 451652258;
                        var3 ^= -233537199;
                    } else {
                        var3 = switch (var3) {
                            case -1623482482 -> var3 ^ -1506703844;
                            default -> var3 ^ -1835875390;
                            case 1564045506 -> {
                                var3 *= 170275037;
                                var3 *= 531749559;
                                var3 |= -1094362458;
                                yield var3 ^ -1382464508;
                            }
                        };
                        long var496 = var3;
                        long var601 = var496 + 1L;
                        var601 = var496 * var601;
                        long var10 = var496 + 2L;
                        var601 *= var10;
                        var496 += 3L;
                        var601 *= var496;
                        var496 = var601 & 7L;
                        long var894;
                        int var499 = (var894 = var496 - 0L) == 0L ? 0 : (var894 < 0L ? -1 : 1);
                        if (var499 != 0) {
                            break label748;
                        }

                        boolean var500 = var1.sweep();
                        int var521 = var4 + 1;
                        var521 = var4 * var521;
                        var521 &= 1;
                        if (var521 != 0) {
                            var3 >>= 4;
                            var3 += 1930499180;
                            var3 ^= 69309304;
                            break label785;
                        }
                        var3 = switch (var3) {
                            case -69253913 -> var3 ^ -1234463414;
                            case 310123186 -> {
                                var3 |= -2122219969;
                                var3 &= 1617573706;
                                var3 += -1951558547;
                                yield var3 ^ -913648311;
                            }
                            default -> var3 ^ 741182847;
                        };
                        if (var500) {
                            var3 >>= 21;
                            var3 ^= -436854287;
                            var496 = var3;
                            var601 = var496 + 1L;
                            var601 = var496 * var601;
                            var10 = var496 + 2L;
                            var601 *= var10;
                            var496 += 3L;
                            var601 *= var496;
                            var496 = var601 & 7L;
                            long var895;
                            int var504 = (var895 = var496 - 0L) == 0L ? 0 : (var895 < 0L ? -1 : 1);
                            if (var504 != 0) {
                                break label748;
                            }

                            r_2 var505 = this.b;
                            long var524 = var4;
                            long var688 = var524 + 1L;
                            var688 = var524 * var688;
                            long var11 = var524 + 2L;
                            var688 *= var11;
                            long var525 = var524 + 3L;
                            var688 *= var525;
                            long var526 = var688 & 7L;
                            long var896;
                            var521 = (var896 = var526 - 0L) == 0L ? 0 : (var896 < 0L ? -1 : 1);
                            if (var521 != 0) {
                                var3 &= -503019164;
                                var3 <<= 7;
                                var3 &= 142912868;
                                var3 ^= 1880745327;
                                break label785;
                            }

                            var3 ^= 1069059981;
                            var3 ^= 661372451;
                            var484 = var505;
                            var3 |= -1365206763;
                            var3 ^= -136850270;
                            var3 += 1546421368;
                            var3 ^= -1664461540;
                        } else {
                            var3 *= -361674369;
                            var3 ^= 71428805;
                            var3 ^= -162437762;
                            var3 ^= 973155594;
                            int var506 = var3 + 1;
                            int var507 = var3 * var506;
                            var521 = var3 + 2;
                            int var508 = var507 * var521;
                            var521 = var3 + 3;
                            int var509 = var508 * var521;
                            int var510 = var509 & 7;
                            if (var510 != 0) {
                                break label748;
                            }

                            r_2 var511 = this.S;
                            long var530 = var4;
                            long var692 = var530 + 1L;
                            var692 = var530 * var692;
                            long var531 = var692 & 1L;
                            long var897;
                            var521 = (var897 = var531 - 0L) == 0L ? 0 : (var897 < 0L ? -1 : 1);
                            if (var521 != 0) {
                                var3 &= -1679676189;
                                var3 >>>= 10;
                                var3 |= -1763109683;
                                var3 ^= -420324960;
                                break label785;
                            }

                            var3 ^= -1532565217;
                            var3 -= 1734138292;
                            var3 |= 602258685;
                            var3 ^= -81076919;
                            var521 = var3 + 1;
                            var521 = var3 * var521;
                            var521 &= 1;
                            if (var521 != 0) {
                                break label748;
                            }

                            var484 = var511;
                            var3 &= -597077620;
                            var3 ^= -1541553963;
                        }
                    }

                    Enum var485 = var484.A();
                    c_2 var486 = (c_2)var485;
                    boolean var512 = var1.crit();
                    int var536 = var4 + 1;
                    var536 = var4 * var536;
                    int var609 = var4 + 2;
                    var536 *= var609;
                    var609 = var4 + 3;
                    var536 *= var609;
                    var536 &= 7;
                    if (var536 != 0) {
                        switch (var3) {
                            case -774206955:
                                var3 ^= -1956338483;
                                break;
                            case -128679599:
                                var3 *= -823072915;
                                var3 ^= 377643794;
                                break;
                            case 780504099:
                            default:
                                var3 ^= 1543426907;
                        }
                    } else {
                        label747: {
                            var3 *= 1824562051;
                            var3 -= -1736092917;
                            var3 |= -1815986363;
                            var3 *= 739654257;
                            var3 ^= 2013601053;
                            long var541 = var3;
                            long var694 = var541 + 1L;
                            var694 = var541 * var694;
                            long var834 = var541 + 2L;
                            var694 *= var834;
                            long var542 = var541 + 3L;
                            var694 *= var542;
                            long var543 = var694 & 7L;
                            long var898;
                            var536 = (var898 = var543 - 0L) == 0L ? 0 : (var898 < 0L ? -1 : 1);
                            if (var536 != 0) {
                                break label748;
                            }

                            Uq var515;
                            if (var512) {
                                var3 *= -893339377;
                                var3 -= -2008512853;
                                var3 *= 645971765;
                                var3 -= -47936238;
                                var3 ^= 1138167745;
                                Integer var513 = var3;
                                if (var513 == null) {
                                    break label748;
                                }

                                Uq var514 = this.iA;
                                var536 = var4 + 1;
                                var536 = var4 * var536;
                                var609 = var4 + 2;
                                var536 *= var609;
                                var609 = var4 + 3;
                                var536 *= var609;
                                var536 &= 7;
                                if (var536 != 0) {
                                    var3 -= 169868149;
                                    var3 ^= 1800111651;
                                    var3 -= -1567888077;
                                    var3 ^= -352157507;
                                    var3 ^= -2104767123;
                                    break label747;
                                }

                                var3 -= -1957742872;
                                var3 ^= 1868924315;
                                Integer var550 = var3;
                                if (var550 == null) {
                                    break label748;
                                }

                                var515 = var514;
                                var3 ^= -344499110;
                                var3 &= -827069438;
                                var3 ^= -1174051045;
                            } else {
                                var3 = switch (var3) {
                                    default -> var3 ^ -1108812744;
                                    case -199857152 -> {
                                        var3 ^= -1283855466;
                                        var3 ^= 2102020668;
                                        var3 *= 655376809;
                                        var3 *= 1200598633;
                                        yield var3 ^ -683085040;
                                    }
                                    case 58047712 -> var3 ^ 569004704;
                                };
                                long var551 = var3;
                                var694 = var551 + 1L;
                                var694 = var551 * var694;
                                var834 = var551 + 2L;
                                var694 *= var834;
                                long var552 = var551 + 3L;
                                var694 *= var552;
                                long var553 = var694 & 7L;
                                long var899;
                                var536 = (var899 = var553 - 0L) == 0L ? 0 : (var899 < 0L ? -1 : 1);
                                if (var536 != 0) {
                                    break label748;
                                }

                                int var555 = (var1.sweep()) ? 1 : 0;
                                Integer var613 = var4;
                                if (var613 == null) {
                                    switch (var3) {
                                        case -1705376297:
                                            var3 ^= -839895497;
                                            break label747;
                                        case -1522173478:
                                            var3 *= -1048727413;
                                            var3 |= 896053403;
                                            var3 -= -1269465001;
                                            var3 ^= -1178764057;
                                            break label747;
                                        case -1081963484:
                                        default:
                                            var3 ^= -35144157;
                                            break label747;
                                    }
                                }

                                var3 *= -531468235;
                                var3 >>>= 7;
                                var3 += 764357062;
                                var3 |= -1621310094;
                                var3 ^= -1220568639;
                                int var614 = var3 + 1;
                                var614 = var3 * var614;
                                var614 &= 1;
                                if (var614 != 0) {
                                    break label748;
                                }

                                if (var555 != 0) {
                                    var3 *= -1796218191;
                                    var3 >>>= 15;
                                    var3 |= -228911055;
                                    var3 &= 139780633;
                                    var3 ^= 858352909;
                                    Uq var556 = this.dv;
                                    Integer var617 = var4;
                                    if (var617 == null) {
                                        switch (var3) {
                                            case 519898146:
                                            default:
                                                var3 ^= -92315407;
                                                break label747;
                                            case 863571732:
                                                var3 |= 1583263129;
                                                var3 *= -757328487;
                                                var3 ^= 297439418;
                                                break label747;
                                            case 1418732856:
                                                var3 ^= -1714152177;
                                                break label747;
                                        }
                                    }

                                    var3 *= 725732985;
                                    var3 -= 1724442283;
                                    var3 *= -2048623095;
                                    var3 ^= -155035582;
                                    long var618 = var3;
                                    long var774 = var618 + 1L;
                                    var774 = var618 * var774;
                                    long var12 = var618 + 2L;
                                    var774 *= var12;
                                    long var619 = var618 + 3L;
                                    var774 *= var619;
                                    long var620 = var774 & 7L;
                                    long var900;
                                    int var621 = (var900 = var620 - 0L) == 0L ? 0 : (var900 < 0L ? -1 : 1);
                                    if (var621 != 0) {
                                        break label748;
                                    }

                                    var515 = var556;
                                    switch (var3) {
                                        case -1856138919:
                                        default:
                                            var3 ^= 846600277;
                                            break;
                                        case -1848207789:
                                            var3 |= -527509814;
                                            var3 ^= -1233207913;
                                            var3 ^= 541459052;
                                            var3 ^= 533786169;
                                            break;
                                        case 1016234561:
                                            var3 ^= -947219776;
                                    }
                                } else {
                                    var3 <<= 3;
                                    var3 -= -1116386482;
                                    var3 *= -1114154307;
                                    var3 += -1984344283;
                                    var3 ^= -1643042446;
                                    long var557 = var3;
                                    var694 = var557 + 1L;
                                    var694 = var557 * var694;
                                    var834 = var557 + 2L;
                                    var694 *= var834;
                                    long var558 = var557 + 3L;
                                    var694 *= var558;
                                    long var559 = var694 & 7L;
                                    long var901;
                                    var555 = (var901 = var559 - 0L) == 0L ? 0 : (var901 < 0L ? -1 : 1);
                                    if (var555 != 0) {
                                        break label748;
                                    }

                                    Uq var561 = this.I;
                                    Integer var622 = var4;
                                    if (var622 == null) {
                                        var3 <<= 17;
                                        var3 |= -574220873;
                                        var3 ^= -1913171752;
                                        break label747;
                                    }

                                    var3 += 782663305;
                                    var3 &= -2107278425;
                                    var3 ^= -852988005;
                                    var3 >>>= 17;
                                    var3 ^= 2076976635;
                                    var622 = var3;
                                    if (var622 == null) {
                                        break label748;
                                    }

                                    var515 = var561;
                                    var3 &= 648208826;
                                    var3 &= -1122440760;
                                    var3 ^= -338373150;
                                    var3 ^= -1277013261;
                                }
                            }

                            float var516 = var515.WM();
                            long var562 = var4;
                            var694 = var562 + 1L;
                            var694 = var562 * var694;
                            var834 = var562 + 2L;
                            var694 *= var834;
                            long var563 = var562 + 3L;
                            var694 *= var563;
                            long var564 = var694 & 7L;
                            long var902;
                            var536 = (var902 = var564 - 0L) == 0L ? 0 : (var902 < 0L ? -1 : 1);
                            label708:
                            if (var536 == 0) {
                                var3 = switch (var3) {
                                    case 1377889908 -> var3 ^ -1232040364;
                                    default -> var3 ^ 479884147;
                                    case 2016839449 -> {
                                        var3 ^= 284576818;
                                        yield var3 ^ -1664114675;
                                    }
                                };
                                var536 = var3 + 1;
                                var536 = var3 * var536;
                                var609 = var3 + 2;
                                var536 *= var609;
                                var609 = var3 + 3;
                                var536 *= var609;
                                var536 &= 7;
                                if (var536 != 0) {
                                    break label748;
                                }

                                float var517 = var516 / 100.0F;
                                c_2 var571 = c_2.OFF_SOUND;
                                if (var486 != var571) {
                                    var3 = switch (var3) {
                                        case -200316122 -> {
                                            var3 &= 1063689153;
                                            var3 &= 1366086465;
                                            var3 -= 99027866;
                                            yield var3 ^ -1531622338;
                                        }
                                        default -> var3 ^ 1801454126;
                                        case 657681268 -> var3 ^ 93287985;
                                    };
                                    float var903;
                                    var536 = (var903 = var517 - 0.0F) == 0.0F ? 0 : (var903 < 0.0F ? -1 : 1);
                                    long var626 = var4;
                                    long var778 = var626 + 1L;
                                    var778 = var626 * var778;
                                    long var627 = var778 & 1L;
                                    long var904;
                                    var609 = (var904 = var627 - 0L) == 0L ? 0 : (var904 < 0L ? -1 : 1);
                                    if (var609 != 0) {
                                        var3 *= -1843181837;
                                        var3 >>= 22;
                                        var3 <<= 4;
                                        var3 ^= 2045601680;
                                        var3 ^= 166994607;
                                        break label708;
                                    }
                                    var3 = switch (var3) {
                                        case -1364608168 -> {
                                            var3 >>>= 25;
                                            yield var3 ^ -1078924143;
                                        }
                                        case 427406156 -> var3 ^ -1766119082;
                                        default -> var3 ^ 1774392006;
                                    };
                                    Integer var629 = var3;
                                    if (var629 == null) {
                                        break label748;
                                    }

                                    if (var536 > 0) {
                                        var3 |= -231864800;
                                        var3 ^= -1860601120;
                                        long var573 = var3;
                                        var694 = var573 + 1L;
                                        var694 = var573 * var694;
                                        var834 = var573 + 2L;
                                        var694 *= var834;
                                        long var574 = var573 + 3L;
                                        var694 *= var574;
                                        long var575 = var694 & 7L;
                                        long var905;
                                        var536 = (var905 = var575 - 0L) == 0L ? 0 : (var905 < 0L ? -1 : 1);
                                        if (var536 != 0) {
                                            break label748;
                                        }

                                        String var577 = var486.cue;
                                        c_2 var630 = c_2.AURA;
                                        Integer var714 = var4;
                                        if (var714 == null) {
                                            var3 |= 196539813;
                                            var3 >>>= 31;
                                            var3 ^= 1880704367;
                                            break label708;
                                        }

                                        var3 -= 177939162;
                                        var3 ^= -1037418784;
                                        Integer var715 = var3;
                                        if (var715 == null) {
                                            break label748;
                                        }

                                        String var638;
                                        if (var486 == var630) {
                                            var3 -= -1646252950;
                                            var3 ^= -744837601;
                                            boolean var631 = var1.crit();
                                            var694 = var4;
                                            var834 = var694 + 1L;
                                            var834 = var694 * var834;
                                            long var13 = var694 + 2L;
                                            var834 *= var13;
                                            var694 += 3L;
                                            var834 *= var694;
                                            var694 = var834 & 7L;
                                            long var906;
                                            int var719 = (var906 = var694 - 0L) == 0L ? 0 : (var906 < 0L ? -1 : 1);
                                            if (var719 != 0) {
                                                var3 *= 1786634189;
                                                var3 |= -601856328;
                                                var3 -= -1124011103;
                                                var3 ^= 1375520375;
                                                break label708;
                                            }

                                            var3 += 1666768351;
                                            var3 += 1854519248;
                                            var3 &= -365715253;
                                            var3 ^= 438746506;
                                            Integer var720 = var3;
                                            if (var720 == null) {
                                                break label748;
                                            }

                                            String var637;
                                            if (var631) {
                                                var3 = switch (var3) {
                                                    case -1307206270 -> {
                                                        var3 -= 1164689125;
                                                        var3 ^= 1200611932;
                                                        var3 &= -1991287774;
                                                        yield var3 ^ -270306900;
                                                    }
                                                    case -19050621 -> var3 ^ 759411667;
                                                    default -> var3 ^ 507115674;
                                                };
                                                int var632 = var3 + 1;
                                                var632 = var3 * var632;
                                                int var721 = var3 + 2;
                                                var632 *= var721;
                                                int var722 = var3 + 3;
                                                var632 *= var722;
                                                var632 &= 7;
                                                if (var632 != 0) {
                                                    break label748;
                                                }

                                                var637 = "crit";
                                                switch (var3) {
                                                    case -1458472450:
                                                    default:
                                                        var3 ^= -1086457881;
                                                        break;
                                                    case -440209749:
                                                        var3 ^= 155178203;
                                                        break;
                                                    case -421171796:
                                                        var3 -= -567875302;
                                                        var3 ^= -2090389914;
                                                }
                                            } else {
                                                var3 -= -260051083;
                                                var3 ^= 874981977;
                                                Integer var723 = var3;
                                                if (var723 == null) {
                                                    break label748;
                                                }

                                                boolean var724 = var1.sweep();
                                                int var780 = var4 + 1;
                                                int var781 = var4 * var780;
                                                int var843 = var4 + 2;
                                                int var782 = var781 * var843;
                                                int var844 = var4 + 3;
                                                int var783 = var782 * var844;
                                                int var784 = var783 & 7;
                                                if (var784 != 0) {
                                                    var3 *= -1541041655;
                                                    var3 &= -1734587363;
                                                    var3 &= 1217977628;
                                                    var3 ^= 1889094011;
                                                    break label708;
                                                }
                                                var3 = switch (var3) {
                                                    case -2112395161 -> var3 ^ 1977616202;
                                                    default -> var3 ^ -251132160;
                                                    case -172850092 -> {
                                                        var3 |= 520080975;
                                                        var3 -= -1525915885;
                                                        var3 ^= -5310061;
                                                        yield var3 ^ -1090298888;
                                                    }
                                                };
                                                var778 = var3;
                                                long var870 = var778 + 1L;
                                                var870 = var778 * var870;
                                                long var14 = var778 + 2L;
                                                var870 *= var14;
                                                var778 += 3L;
                                                var870 *= var778;
                                                var778 = var870 & 7L;
                                                long var907;
                                                int var788 = (var907 = var778 - 0L) == 0L ? 0 : (var907 < 0L ? -1 : 1);
                                                if (var788 != 0) {
                                                    break label748;
                                                }

                                                if (var724) {
                                                    var3 <<= 4;
                                                    var3 -= 120122485;
                                                    var3 += 971500964;
                                                    var3 <<= 12;
                                                    var3 ^= 1120532652;
                                                    var694 = var3;
                                                    var834 = var694 + 1L;
                                                    var834 = var694 * var834;
                                                    var13 = var694 + 2L;
                                                    var834 *= var13;
                                                    var694 += 3L;
                                                    var834 *= var694;
                                                    var694 = var834 & 7L;
                                                    long var908;
                                                    int var728 = (var908 = var694 - 0L) == 0L ? 0 : (var908 < 0L ? -1 : 1);
                                                    if (var728 != 0) {
                                                        break label748;
                                                    }

                                                    var637 = "sweep";
                                                    switch (var3) {
                                                        case -276544440:
                                                        default:
                                                            var3 ^= 1168429063;
                                                            break;
                                                        case -1046356:
                                                            var3 &= 1297544347;
                                                            var3 ^= -964056452;
                                                            break;
                                                        case 1644494115:
                                                            var3 ^= -1868178140;
                                                    }
                                                } else {
                                                    var3 *= -484970347;
                                                    var3 >>>= 12;
                                                    var3 &= 712921654;
                                                    var3 ^= -921901854;
                                                    var637 = "hit";
                                                    var3 += 543798038;
                                                    var3 -= 768658206;
                                                    var3 >>>= 30;
                                                    var3 ^= -1948669194;
                                                }
                                            }

                                            var694 = var4;
                                            var834 = var694 + 1L;
                                            var834 = var694 * var834;
                                            var13 = var694 + 2L;
                                            var834 *= var13;
                                            var694 += 3L;
                                            var834 *= var694;
                                            var694 = var834 & 7L;
                                            long var909;
                                            int var732 = (var909 = var694 - 0L) == 0L ? 0 : (var909 < 0L ? -1 : 1);
                                            if (var732 != 0) {
                                                var3 >>= 13;
                                                var3 ^= -1880810590;
                                                break label708;
                                            }

                                            var3 |= 2078543522;
                                            var3 &= -642868437;
                                            var3 ^= 1215618899;
                                            var638 = var637;
                                            switch (var3) {
                                                case -1848093327:
                                                    var3 &= 492130223;
                                                    var3 <<= 1;
                                                    var3 ^= -440657084;
                                                    break;
                                                case -185690064:
                                                    var3 ^= 415997849;
                                                    break;
                                                case -154342773:
                                                default:
                                                    var3 ^= -1545697260;
                                            }
                                        } else {
                                            var3 += -836500747;
                                            var3 *= 822832045;
                                            var3 &= 1494497640;
                                            var3 ^= 192173172;
                                            var694 = var3;
                                            var834 = var694 + 1L;
                                            var834 = var694 * var834;
                                            long var886 = var694 + 2L;
                                            var834 *= var886;
                                            var694 += 3L;
                                            var834 *= var694;
                                            var694 = var834 & 7L;
                                            long var910;
                                            int var736 = (var910 = var694 - 0L) == 0L ? 0 : (var910 < 0L ? -1 : 1);
                                            if (var736 != 0) {
                                                break label748;
                                            }

                                            var638 = var577;
                                            switch (var3) {
                                                case -1904895360:
                                                default:
                                                    var3 ^= -2035220044;
                                                    break;
                                                case -763899553:
                                                    var3 ^= 510974090;
                                                    break;
                                                case 191120668:
                                                    var3 ^= 1342671137;
                                                    var3 ^= -1669374661;
                                            }
                                        }

                                        c_2 var578 = c_2.CUSTOM;
                                        int var737 = var4 + 1;
                                        int var738 = var4 * var737;
                                        int var789 = var4 + 2;
                                        int var739 = var738 * var789;
                                        int var790 = var4 + 3;
                                        int var740 = var739 * var790;
                                        int var741 = var740 & 7;
                                        if (var741 == 0) {
                                            var3 |= -1324278448;
                                            var3 *= 558058909;
                                            var3 ^= 1641323137;
                                            String var759;
                                            if (var486 == var578) {
                                                var3 = switch (var3) {
                                                    case -2097418064 -> var3 ^ -229557843;
                                                    case -651509441 -> {
                                                        var3 ^= 1421219059;
                                                        var3 *= -945761365;
                                                        var3 *= -2062918865;
                                                        yield var3 ^ 112086674;
                                                    }
                                                    default -> var3 ^ 1425122059;
                                                };
                                                Integer var579 = var3;
                                                if (var579 == null) {
                                                    break label748;
                                                }

                                                boolean var580 = var1.crit();
                                                int var742 = var4 + 1;
                                                int var743 = var4 * var742;
                                                int var791 = var4 + 2;
                                                int var744 = var743 * var791;
                                                int var792 = var4 + 3;
                                                int var745 = var744 * var792;
                                                int var746 = var745 & 7;
                                                if (var746 != 0) {
                                                    var3 -= -315970842;
                                                    var3 *= 1875020601;
                                                    var3 ^= -1913305177;
                                                    break label708;
                                                }

                                                var3 *= 912501505;
                                                var3 |= 1235470239;
                                                var3 &= 2023371660;
                                                var3 ^= 2046033524;
                                                String var582;
                                                if (var580) {
                                                    var3 += -1412715228;
                                                    var3 ^= -1055966046;
                                                    var579 = var3;
                                                    if (var579 == null) {
                                                        break label748;
                                                    }

                                                    var582 = "custom_crit";
                                                    var3 *= -380470345;
                                                    var3 -= 1725322768;
                                                    var3 ^= 94614929;
                                                } else {
                                                    var3 |= -1003733164;
                                                    var3 &= -633425324;
                                                    var3 ^= 886141843;
                                                    Integer var747 = var3;
                                                    if (var747 == null) {
                                                        break label748;
                                                    }

                                                    boolean var748 = var1.sweep();
                                                    int var793 = var4 + 1;
                                                    int var794 = var4 * var793;
                                                    int var795 = var794 & 1;
                                                    if (var795 != 0) {
                                                        var3 ^= 108866781;
                                                        var3 += -231865424;
                                                        var3 *= -202241963;
                                                        var3 ^= -1299642755;
                                                        break label708;
                                                    }
                                                    var3 = switch (var3) {
                                                        default -> var3 ^ 1410932716;
                                                        case -184696377 -> {
                                                            var3 -= 1133223358;
                                                            var3 >>= 18;
                                                            var3 *= 1664545917;
                                                            yield var3 ^ -32390168;
                                                        }
                                                        case -58736795 -> var3 ^ -837154242;
                                                    };
                                                    if (var748) {
                                                        var3 = switch (var3) {
                                                            case -1565009148 -> {
                                                                var3 ^= 645728375;
                                                                var3 *= 901294527;
                                                                var3 |= -1109025799;
                                                                yield var3 ^ 125625094;
                                                            }
                                                            default -> var3 ^ -679120307;
                                                            case -444064357 -> var3 ^ -1554638049;
                                                        };
                                                        var694 = var3;
                                                        var834 = var694 + 1L;
                                                        var834 = var694 * var834;
                                                        long var887 = var694 + 2L;
                                                        var834 *= var887;
                                                        var694 += 3L;
                                                        var834 *= var694;
                                                        var694 = var834 & 7L;
                                                        long var911;
                                                        int var752 = (var911 = var694 - 0L) == 0L ? 0 : (var911 < 0L ? -1 : 1);
                                                        if (var752 != 0) {
                                                            break label748;
                                                        }

                                                        var582 = "custom_sweep";
                                                        switch (var3) {
                                                            case -810159443:
                                                            default:
                                                                var3 ^= -793301620;
                                                                break;
                                                            case -125084421:
                                                                var3 |= -1089641940;
                                                                var3 ^= 883365804;
                                                                break;
                                                            case 231589705:
                                                                var3 ^= 1106885489;
                                                        }
                                                    } else {
                                                        var3 &= -1054802949;
                                                        var3 -= -56872734;
                                                        var3 -= 121116589;
                                                        var3 ^= -1134761739;
                                                        var582 = "custom";
                                                        var3 ^= 1786067387;
                                                        var3 ^= -1792518243;
                                                        var3 >>>= 30;
                                                        var3 &= -598085711;
                                                        var3 ^= -886544045;
                                                    }
                                                }

                                                boolean var753 = this.EU;
                                                var778 = var4;
                                                long var874 = var778 + 1L;
                                                var874 = var778 * var874;
                                                long var891 = var778 + 2L;
                                                var874 *= var891;
                                                var778 += 3L;
                                                var874 *= var778;
                                                var778 = var874 & 7L;
                                                long var912;
                                                int var799 = (var912 = var778 - 0L) == 0L ? 0 : (var912 < 0L ? -1 : 1);
                                                if (var799 != 0) {
                                                    var3 ^= -2043549741;
                                                    var3 -= -287783476;
                                                    var3 |= 802670634;
                                                    var3 ^= 265194961;
                                                    break label708;
                                                }

                                                var3 >>= 9;
                                                var3 ^= 971202721;
                                                var3 += -1822728538;
                                                var3 ^= -293661908;
                                                if (!var753) {
                                                    var3 ^= 2123067450;
                                                    var3 &= 1067574523;
                                                    var3 ^= 1346235316;
                                                    this.EU = true;
                                                    int var754 = var4 + 1;
                                                    int var755 = var4 * var754;
                                                    int var800 = var4 + 2;
                                                    int var756 = var755 * var800;
                                                    int var801 = var4 + 3;
                                                    int var757 = var756 * var801;
                                                    int var758 = var757 & 7;
                                                    if (var758 != 0) {
                                                        var3 |= 455351692;
                                                        var3 &= 1013159739;
                                                        var3 ^= -1047701754;
                                                        var3 &= 2079067808;
                                                        var3 ^= 699745647;
                                                        break label708;
                                                    }

                                                    var3 *= 1730318505;
                                                    var3 ^= -965739926;
                                                    var3 ^= -874970021;
                                                    bw_2.Q();
                                                    i_2.Je("§7Aura sounds: §fhit.ogg§7, §fcrit.ogg§7, §fsweep.ogg §7in config/auravisuals/sounds (Ogg Vorbis).");
                                                    var759 = var582;
                                                    switch (var3) {
                                                        case -97347185:
                                                        default:
                                                            var3 ^= 1926881709;
                                                            break;
                                                        case 991642772:
                                                            var3 |= 1790379421;
                                                            var3 ^= -1381177971;
                                                            break;
                                                        case 2027707114:
                                                            var3 ^= -1246149227;
                                                    }
                                                } else {
                                                    var3 = switch (var3) {
                                                        case -1222819817 -> {
                                                            var3 >>>= 7;
                                                            yield var3 ^ 398308406;
                                                        }
                                                        case -566932405 -> var3 ^ 1046118239;
                                                        default -> var3 ^ -1881548501;
                                                    };
                                                    var759 = var582;
                                                    var3 >>>= 7;
                                                    var3 ^= -794284836;
                                                    var3 |= -808028449;
                                                    var3 ^= 163864527;
                                                }
                                            } else {
                                                var3 >>= 4;
                                                var3 -= -1643203981;
                                                var3 -= -550336665;
                                                var3 ^= -630736929;
                                                var759 = var638;
                                                var3 ^= -1239734100;
                                                var3 |= -473655720;
                                                var3 ^= 972971850;
                                            }

                                            long var583 = var3;
                                            var778 = var583 + 1L;
                                            var778 = var583 * var778;
                                            long var584 = var778 & 1L;
                                            long var913;
                                            var536 = (var913 = var584 - 0L) == 0L ? 0 : (var913 < 0L ? -1 : 1);
                                            if (var536 != 0) {
                                                break label748;
                                            }

                                            c_2 var586 = c_2.AURA;
                                            int var639 = var4 + 1;
                                            var639 = var4 * var639;
                                            int var804 = var4 + 2;
                                            var639 *= var804;
                                            int var805 = var4 + 3;
                                            var639 *= var805;
                                            var639 &= 7;
                                            if (var639 != 0) {
                                                switch (var3) {
                                                    case -1842088032:
                                                        var3 ^= 616570121;
                                                        break label708;
                                                    case -703356912:
                                                        var3 -= -562752084;
                                                        var3 ^= -2021142773;
                                                        break label708;
                                                    case 452538632:
                                                    default:
                                                        var3 ^= 800050704;
                                                        break label708;
                                                }
                                            }

                                            var3 |= -1906376850;
                                            var3 += -1064129827;
                                            var3 ^= -1485308297;
                                            String var599;
                                            if (var486 != var586) {
                                                var3 >>>= 29;
                                                var3 ^= 951934905;
                                                var536 = var3 + 1;
                                                var536 = var3 * var536;
                                                var536 &= 1;
                                                if (var536 != 0) {
                                                    break label748;
                                                }

                                                c_2 var590 = c_2.CUSTOM;
                                                var778 = var4;
                                                long var878 = var778 + 1L;
                                                var878 = var778 * var878;
                                                var778 = var878 & 1L;
                                                long var914;
                                                var639 = (var914 = var778 - 0L) == 0L ? 0 : (var914 < 0L ? -1 : 1);
                                                if (var639 != 0) {
                                                    var3 >>>= 19;
                                                    var3 ^= -667554247;
                                                    var3 ^= -1194957517;
                                                    var3 >>= 22;
                                                    var3 ^= 1880704236;
                                                    break label708;
                                                }
                                                var3 = switch (var3) {
                                                    case 784056001 -> var3 ^ 1103599765;
                                                    case 951934904 -> {
                                                        var3 -= 1007354904;
                                                        var3 ^= -1565039645;
                                                        yield var3 ^ 835388099;
                                                    }
                                                    default -> var3 ^ 546112574;
                                                };
                                                var639 = var3 + 1;
                                                var639 = var3 * var639;
                                                int var808 = var3 + 2;
                                                var639 *= var808;
                                                int var809 = var3 + 3;
                                                var639 *= var809;
                                                var639 &= 7;
                                                if (var639 != 0) {
                                                    break label748;
                                                }

                                                if (var486 != var590) {
                                                    var3 |= -163673714;
                                                    var3 <<= 27;
                                                    var3 -= -761834237;
                                                    var3 |= 210725166;
                                                    var3 ^= 1180983992;
                                                    Integer var591 = var3;
                                                    if (var591 == null) {
                                                        break label748;
                                                    }

                                                    boolean var592 = var1.crit();
                                                    var639 = var4 + 1;
                                                    var639 = var4 * var639;
                                                    var639 &= 1;
                                                    if (var639 != 0) {
                                                        var3 |= -901604750;
                                                        var3 ^= -1412243944;
                                                        break label708;
                                                    }

                                                    var3 &= 466936208;
                                                    var3 ^= -1258938112;
                                                    var639 = var3 + 1;
                                                    var639 = var3 * var639;
                                                    var639 &= 1;
                                                    if (var639 != 0) {
                                                        break label748;
                                                    }

                                                    String var597;
                                                    if (var592) {
                                                        var3 += -356417173;
                                                        var3 += -1814120162;
                                                        var3 ^= 1775406537;
                                                        long var593 = var3;
                                                        var778 = var593 + 1L;
                                                        var778 = var593 * var778;
                                                        var878 = var593 + 2L;
                                                        var778 *= var878;
                                                        long var594 = var593 + 3L;
                                                        var778 *= var594;
                                                        long var595 = var778 & 7L;
                                                        long var915;
                                                        int var596 = (var915 = var595 - 0L) == 0L ? 0 : (var915 < 0L ? -1 : 1);
                                                        if (var596 != 0) {
                                                            break label748;
                                                        }

                                                        var597 = "critical_";
                                                        var3 -= 197764718;
                                                        var3 += -1600440374;
                                                        var3 &= 720257282;
                                                        var3 *= 1225289115;
                                                        var3 ^= -412950961;
                                                    } else {
                                                        var3 |= 1787072884;
                                                        var3 ^= -1412201667;
                                                        var778 = var3;
                                                        var878 = var778 + 1L;
                                                        var878 = var778 * var878;
                                                        var778 = var878 & 1L;
                                                        long var916;
                                                        var639 = (var916 = var778 - 0L) == 0L ? 0 : (var916 < 0L ? -1 : 1);
                                                        if (var639 != 0) {
                                                            break label748;
                                                        }

                                                        int var657 = (var1.sweep()) ? 1 : 0;
                                                        Integer var816 = var4;
                                                        if (var816 == null) {
                                                            switch (var3) {
                                                                case -1303486028:
                                                                default:
                                                                    var3 ^= 100105092;
                                                                    break label708;
                                                                case 753122784:
                                                                    var3 ^= 440830608;
                                                                    break label708;
                                                                case 1143288393:
                                                                    var3 |= -891263368;
                                                                    var3 -= 1601151428;
                                                                    var3 *= 418197765;
                                                                    var3 ^= -1295737173;
                                                                    var3 ^= 1548293965;
                                                                    break label708;
                                                            }
                                                        }
                                                        var3 = switch (var3) {
                                                            case -86001162 -> var3 ^ -562137972;
                                                            default -> var3 ^ -966989757;
                                                            case 1143288393 -> {
                                                                var3 |= 1863216659;
                                                                var3 <<= 31;
                                                                var3 -= -2124539955;
                                                                yield var3 ^ -1339453379;
                                                            }
                                                        };
                                                        if (var657 != 0) {
                                                            var3 *= 1035886679;
                                                            var3 ^= -862731757;
                                                            var657 = var3 + 1;
                                                            var657 = var3 * var657;
                                                            var657 &= 1;
                                                            if (var657 != 0) {
                                                                break label748;
                                                            }

                                                            var597 = "sweep_";
                                                            switch (var3) {
                                                                case -2124820783:
                                                                    var3 -= 2033117815;
                                                                    var3 ^= -1743062507;
                                                                    break;
                                                                case 545954901:
                                                                default:
                                                                    var3 ^= -1747810284;
                                                                    break;
                                                                case 1515663838:
                                                                    var3 ^= -94022796;
                                                            }
                                                        } else {
                                                            var3 += -241454967;
                                                            var3 ^= -157350460;
                                                            Integer var661 = var3;
                                                            if (var661 == null) {
                                                                break label748;
                                                            }

                                                            var597 = "normal_";
                                                            var3 += 1524150;
                                                            var3 ^= 1930897416;
                                                            var3 &= 1847678766;
                                                            var3 ^= -734963377;
                                                        }
                                                    }

                                                    var639 = var3 + 1;
                                                    var639 = var3 * var639;
                                                    int var817 = var3 + 2;
                                                    var639 *= var817;
                                                    int var818 = var3 + 3;
                                                    var639 *= var818;
                                                    var639 &= 7;
                                                    if (var639 != 0) {
                                                        break label748;
                                                    }

                                                    String var598 = var597 + var759;
                                                    Integer var667 = var4;
                                                    if (var667 == null) {
                                                        var3 &= 1224940931;
                                                        var3 += -409079173;
                                                        var3 ^= -1752741103;
                                                        break label708;
                                                    }

                                                    var3 &= 888596837;
                                                    var3 -= 2003513681;
                                                    var3 += 1000873813;
                                                    var3 ^= -1170599241;
                                                    var599 = var598;
                                                    var3 += 1396193078;
                                                    var3 += -669090140;
                                                    var3 &= -1893966704;
                                                    var3 >>>= 25;
                                                    var3 ^= 160786646;
                                                } else {
                                                    var3 &= 232273885;
                                                    var3 += -1105210264;
                                                    var3 &= 941300614;
                                                    var3 ^= -338337482;
                                                    var639 = var3 + 1;
                                                    var639 = var3 * var639;
                                                    int var819 = var3 + 2;
                                                    var639 *= var819;
                                                    int var820 = var3 + 3;
                                                    var639 *= var820;
                                                    var639 &= 7;
                                                    if (var639 != 0) {
                                                        break label748;
                                                    }

                                                    var599 = var759;
                                                    var3 *= -131135971;
                                                    var3 ^= -1757288692;
                                                }
                                            } else {
                                                var3 >>>= 5;
                                                var3 ^= 1151290691;
                                                Integer var673 = var3;
                                                if (var673 == null) {
                                                    break label748;
                                                }

                                                var599 = var759;
                                                var3 ^= 759393372;
                                                var3 += -379972583;
                                                var3 &= 926487331;
                                                var3 ^= 133725779;
                                                var3 ^= 524617154;
                                            }

                                            long var674 = var3;
                                            var778 = var674 + 1L;
                                            var778 = var674 * var778;
                                            long var883 = var674 + 2L;
                                            var778 *= var883;
                                            long var675 = var674 + 3L;
                                            var778 *= var675;
                                            long var676 = var778 & 7L;
                                            long var917;
                                            var639 = (var917 = var676 - 0L) == 0L ? 0 : (var917 < 0L ? -1 : 1);
                                            if (var639 != 0) {
                                                break label748;
                                            }

                                            c_2 var678 = c_2.AURA;
                                            int var760 = var4 + 1;
                                            int var761 = var4 * var760;
                                            int var825 = var4 + 2;
                                            int var762 = var761 * var825;
                                            int var826 = var4 + 3;
                                            int var763 = var762 * var826;
                                            int var764 = var763 & 7;
                                            if (var764 != 0) {
                                                var3 ^= -1096829644;
                                                var3 ^= -955017015;
                                                break label708;
                                            }

                                            label686: {
                                                var3 -= 519500719;
                                                var3 += -1031947064;
                                                var3 >>>= 2;
                                                var3 ^= -1480240576;
                                                if (var486 != var678) {
                                                    var3 ^= -1967678657;
                                                    var3 ^= 1684703630;
                                                    var3 *= -1562463049;
                                                    var3 *= 1109423101;
                                                    var3 ^= 247245275;
                                                    JL var679 = this.Cv;
                                                    int var680 = (var679.vb()) ? 1 : 0;
                                                    var694 = var4;
                                                    var834 = var694 + 1L;
                                                    var834 = var694 * var834;
                                                    long var888 = var694 + 2L;
                                                    var834 *= var888;
                                                    var694 += 3L;
                                                    var834 *= var694;
                                                    var694 = var834 & 7L;
                                                    long var918;
                                                    int var768 = (var918 = var694 - 0L) == 0L ? 0 : (var918 < 0L ? -1 : 1);
                                                    if (var768 != 0) {
                                                        var3 -= 1905159483;
                                                        var3 -= 980043362;
                                                        var3 *= 1613301171;
                                                        var3 ^= -390865104;
                                                        break label708;
                                                    }
                                                    var3 = switch (var3) {
                                                        default -> var3 ^ 2042358961;
                                                        case -1235481022 -> {
                                                            var3 += -2049519115;
                                                            var3 *= 1964472825;
                                                            var3 *= 1538367763;
                                                            var3 |= -364125918;
                                                            yield var3 ^ 1482022405;
                                                        }
                                                        case -218494118 -> var3 ^ -101167747;
                                                    };
                                                    Integer var769 = var3;
                                                    if (var769 == null) {
                                                        break label748;
                                                    }

                                                    if (var680 != 0) {
                                                        var3 = switch (var3) {
                                                            case -1492239510 -> {
                                                                var3 *= -1063319439;
                                                                var3 ^= -1716287697;
                                                                var3 += 2052732781;
                                                                yield var3 ^ 718399574;
                                                            }
                                                            default -> var3 ^ 689487480;
                                                            case -237028978 -> var3 ^ 427540217;
                                                        };
                                                        Integer var681 = var3;
                                                        if (var681 == null) {
                                                            break label748;
                                                        }

                                                        ThreadLocalRandom var682 = ThreadLocalRandom.current();
                                                        var680 = var682.nextInt(51);
                                                        float var684 = var680;
                                                        Integer var770 = var4;
                                                        if (var770 == null) {
                                                            var3 *= 114855299;
                                                            var3 >>= 29;
                                                            var3 &= 1731328279;
                                                            var3 |= -1669802762;
                                                            var3 ^= -1889486696;
                                                            break label708;
                                                        }

                                                        var3 &= -757631045;
                                                        var3 ^= -185073050;
                                                        float var685 = var684 / 100.0F;
                                                        float var686 = 0.9F + var685;
                                                        var687 = var686;
                                                        var3 ^= -407903887;
                                                        var3 += 997719035;
                                                        var3 |= -1208072938;
                                                        var3 >>= 26;
                                                        var3 ^= 1482329481;
                                                        break label686;
                                                    }

                                                    switch (var3) {
                                                        case -1492239510:
                                                            var3 *= -1983807891;
                                                            var3 |= -1487681174;
                                                            var3 >>= 1;
                                                            var3 ^= 1867873555;
                                                            break;
                                                        case -115215108:
                                                            var3 ^= 1921066021;
                                                            break;
                                                        case 2100064836:
                                                        default:
                                                            var3 ^= 1764743748;
                                                    }
                                                } else {
                                                    switch (var3) {
                                                        case -1937613270:
                                                            var3 &= -280957737;
                                                            var3 ^= 1384575185;
                                                            var3 ^= 1650998645;
                                                            break;
                                                        case -213143825:
                                                            var3 ^= -539018159;
                                                            break;
                                                        case 637533426:
                                                        default:
                                                            var3 ^= -221636291;
                                                    }
                                                }

                                                var687 = 1.0F;
                                                var3 -= 1636891844;
                                                var3 ^= -50792812;
                                            }

                                            Integer var771 = var3;
                                            if (var771 == null) {
                                                break label748;
                                            }

                                            Entity var772 = var1.target();
                                            c_2 var827 = c_2.AURA;
                                            var834 = var4;
                                            long var889 = var834 + 1L;
                                            var889 = var834 * var889;
                                            var834 = var889 & 1L;
                                            long var919;
                                            int var867 = (var919 = var834 - 0L) == 0L ? 0 : (var919 < 0L ? -1 : 1);
                                            if (var867 != 0) {
                                                switch (var3) {
                                                    case -1482329482:
                                                        var3 -= 394322225;
                                                        var3 ^= -532818902;
                                                        break label708;
                                                    case -1362376894:
                                                        var3 ^= -670630576;
                                                        break label708;
                                                    case 998482773:
                                                    default:
                                                        var3 ^= -877853809;
                                                        break label708;
                                                }
                                            }

                                            var3 += 1029608737;
                                            var3 &= 762615167;
                                            var3 &= -808487563;
                                            var3 &= 630978794;
                                            var3 ^= -232676223;
                                            Integer var868 = var3;
                                            if (var868 == null) {
                                                break label748;
                                            }

                                            label743: {
                                                if (var486 == var827) {
                                                    var3 >>>= 26;
                                                    var3 += 466428413;
                                                    var3 ^= -2039993418;
                                                    JL var487 = this.HT;
                                                    int var828 = var4 + 1;
                                                    int var829 = var4 * var828;
                                                    int var869 = var4 + 2;
                                                    int var830 = var829 * var869;
                                                    var4 += 3;
                                                    int var831 = var830 * var4;
                                                    var4 = var831 & 7;
                                                    if (var4 != 0) {
                                                        switch (var3) {
                                                            case -1650128500:
                                                                var3 += -1427767195;
                                                                var3 ^= 949111966;
                                                                break label708;
                                                            case 357383023:
                                                            default:
                                                                var3 ^= -433822290;
                                                                break label708;
                                                            case 600623725:
                                                                var3 ^= -2031946964;
                                                                break label708;
                                                        }
                                                    }
                                                    var3 = switch (var3) {
                                                        case -1650128500 -> {
                                                            var3 |= -1213307476;
                                                            var3 ^= 2059532756;
                                                            yield var3 ^ -817511360;
                                                        }
                                                        case -442534494 -> var3 ^ 1889704018;
                                                        default -> var3 ^ 1500015328;
                                                    };
                                                    var4 = var3 + 1;
                                                    var4 = var3 * var4;
                                                    int var832 = var3 + 2;
                                                    var4 *= var832;
                                                    int var833 = var3 + 3;
                                                    var4 *= var833;
                                                    var4 &= 7;
                                                    if (var4 != 0) {
                                                        break label748;
                                                    }

                                                    boolean var474 = var487.vb();
                                                    if (var474) {
                                                        var3 = switch (var3) {
                                                            default -> var3 ^ 997953872;
                                                            case 170610744 -> {
                                                                var3 <<= 26;
                                                                var3 += -653448350;
                                                                var3 *= 388776883;
                                                                var3 ^= 1338428288;
                                                                yield var3 ^ 2127337779;
                                                            }
                                                            case 704705793 -> var3 ^ 2109225308;
                                                        };
                                                        Integer var475 = var3;
                                                        if (var475 == null) {
                                                            break label748;
                                                        }

                                                        var476 = true;
                                                        var3 >>= 11;
                                                        var3 ^= 249617278;
                                                        var3 ^= 796009457;
                                                        var3 ^= 1965561250;
                                                        break label743;
                                                    }

                                                    var3 &= -890056820;
                                                    var3 -= -832968919;
                                                    var3 ^= -1126419459;
                                                } else {
                                                    var3 >>>= 3;
                                                    var3 ^= -636475434;
                                                    var3 ^= 1138784356;
                                                }

                                                var5 = var3;
                                                if (var5 == null) {
                                                    break label748;
                                                }

                                                var476 = false;
                                                var3 |= 37017205;
                                                var3 += 1240170098;
                                                var3 -= 1700671385;
                                                var3 ^= 1065201352;
                                            }

                                            int var489 = var3 - 939305079;
                                            var489 ^= -353702998;
                                            var489 &= 975203910;
                                            var489 >>>= 28;
                                            var489 ^= 56778584;
                                            this.W(var599, var772, var476, var687, var517, var489);
                                            return;
                                        }

                                        var3 &= -893458849;
                                        var3 -= 1795971464;
                                        var3 *= 1813730653;
                                        var3 ^= 1157010601;
                                        break label708;
                                    }

                                    var3 += 1440251719;
                                    var3 -= 1188280893;
                                    var3 ^= 1317010243;
                                    var3 += -1675816801;
                                    var3 ^= -19681555;
                                } else {
                                    var3 >>= 24;
                                    var3 |= -393324681;
                                    var3 *= 1793405125;
                                    var3 |= 199805284;
                                    var3 ^= -573752152;
                                }

                                Integer var477 = var3;
                                if (var477 != null) {
                                    return;
                                }
                                break label748;
                            } else {
                                var3 <<= 1;
                                var3 ^= -2139862179;
                            }
                        }
                    }
                }
            }

            RuntimeException var466 = new RuntimeException();
            throw var466;
        }

        AssertionError var461 = new AssertionError();
        throw var461;
    }

    private void j(String var1, Entity var2, boolean var3, float var4, int var5) {
        int var7 = System.identityHashCode(this);
        Integer var18 = var7;
        if (var18 == null) {
            int var16 = var5 + -663820836;
            var16 ^= -392613579;
            var18 = var16;
            if (var18 != null) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            } else {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            int var6 = var5 - -1689253270;
            var6 |= -700521887;
            var6 &= -65167952;
            var6 ^= 1851071517;
            var6 ^= 1825814907;
            var6 ^= -1496015349;
            var6 >>= 9;
            var6 -= -1975062860;
            var6 ^= 1989633656;
            this.W(var1, var2, var3, var4, 1.0F, var6);
        }
    }

    private void W(String var1, Entity var2, boolean var3, float var4, float var5, int var6) {
        HP var94 = null;
        label115: {
            Fp var85;
            HP var102;
            label114: {
                int var39;
                int var8 = System.identityHashCode(this);
                Ud var9 = Ud.Z();
                Integer var10 = var8;
                label113:
                if (var10 != null) {
                    label118: {
                        var39 = switch (var6) {
                            case 56778587 -> {
                                var39 = var6 * 1143787237;
                                var39 |= 1754456935;
                                yield var39 ^ 1559300398;
                            }
                            default -> var6 ^ -1618632578;
                            case 466776322 -> var6 ^ -237602503;
                        };
                        JL var87 = this.bM;
                        boolean var88 = var87.vb();
                        if (var88) {
                            var39 = switch (var39) {
                                case -1557139895 -> {
                                    var39 &= -538763500;
                                    var39 <<= 15;
                                    var39 *= -539191831;
                                    var39 *= 324125391;
                                    yield var39 ^ 2019113596;
                                }
                                default -> var39 ^ 1036286824;
                                case -643799371 -> var39 ^ -472736098;
                            };
                            if (var2 != null) {
                                var39 *= 443855495;
                                var39 &= 1861879167;
                                var39 ^= -1348699314;
                                long var89 = var39;
                                long var12 = var89 + 1L;
                                var12 = var89 * var12;
                                long var90 = var12 & 1L;
                                long var133;
                                int var91 = (var133 = var90 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                                if (var91 != 0) {
                                    break label115;
                                }

                                double var92 = var2.getX();
                                var12 = var8;
                                long var14 = var12 + 1L;
                                var14 = var12 * var14;
                                long var16 = var12 + 2L;
                                var14 *= var16;
                                var12 += 3L;
                                var14 *= var12;
                                var12 = var14 & 7L;
                                long var134;
                                int var110 = (var134 = var12 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                                if (var110 != 0) {
                                    var39 &= 993121859;
                                    var39 *= -547012891;
                                    var39 <<= 30;
                                    var39 ^= 617258421;
                                    break label113;
                                }

                                var39 |= 89145643;
                                var39 |= -1293965063;
                                var39 ^= 892182306;
                                double var111 = var2.getY();
                                double var125 = var2.getZ();
                                HP var93 = HP.G(var92, var111, var125);
                                var94 = var93;
                                var39 ^= -2057852370;
                                var39 ^= -857044794;
                                var39 ^= 859384042;
                                break label118;
                            }

                            switch (var39) {
                                case 693713532:
                                    var39 |= 87850129;
                                    var39 ^= -236282691;
                                    break;
                                case 1043909487:
                                    var39 ^= 54246757;
                                    break;
                                case 1609009221:
                                default:
                                    var39 ^= -1771052366;
                            }
                        } else {
                            var39 &= -1030503068;
                            var39 ^= 1586767360;
                        }

                        Integer var11 = var39;
                        if (var11 == null) {
                            break label115;
                        }

                        var102 = HP.Aa();
                        int var112 = var8 + 1;
                        var112 = var8 * var112;
                        var112 &= 1;
                        if (var112 != 0) {
                            switch (var39) {
                                case -1774442569:
                                default:
                                    var39 ^= -964496777;
                                    break label113;
                                case -594025920:
                                    var39 ^= -435962114;
                                    var39 ^= 1898660718;
                                    var39 ^= -277511579;
                                    break label113;
                                case 1287558419:
                                    var39 ^= -1989550941;
                                    break label113;
                            }
                        }

                        var39 -= -1524826522;
                        var39 |= 368353010;
                        var39 ^= -939406834;
                        long var115 = var39;
                        long var126 = var115 + 1L;
                        var126 = var115 * var126;
                        long var132 = var115 + 2L;
                        var126 *= var132;
                        long var116 = var115 + 3L;
                        var126 *= var116;
                        long var117 = var126 & 7L;
                        long var135;
                        var112 = (var135 = var117 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                        if (var112 != 0) {
                            break label115;
                        }

                        var94 = var102;
                        switch (var39) {
                            case -494132478:
                                var39 ^= -1834543203;
                                break;
                            case -51724:
                                var39 ^= 1869362078;
                                var39 ^= 549809329;
                                break;
                            case 1570815190:
                            default:
                                var39 ^= -1773939570;
                        }
                    }

                    Uq var98 = this.EC;
                    float var99 = var98.WM();
                    Integer var119 = var8;
                    if (var119 != null) {
                        var39 *= 705309141;
                        var39 |= 1576296772;
                        var39 += -1837662452;
                        var39 ^= -1417209505;
                        float var100 = var99 * var5;
                        var102 = var94.scaled(var100, var4);
                        var85 = var9.J();
                        if (var3) {
                            var39 |= -1397904561;
                            var39 ^= -379955155;
                            int var103 = var39 + 1;
                            int var104 = var39 * var103;
                            int var105 = var104 & 1;
                            if (var105 != 0) {
                                break label115;
                            }

                            var102 = var102;
                            switch (var39) {
                                case -1733775361:
                                default:
                                    var39 ^= 505889684;
                                    break label114;
                                case -1260439962:
                                    var39 ^= -1124951611;
                                    break label114;
                                case 1454748658:
                                    var39 ^= 696908649;
                                    var39 ^= -324335085;
                                    break label114;
                            }
                        }
                        var39 = switch (var39) {
                            case -1183320547 -> var39 ^ 2063104646;
                            default -> var39 ^ 1670526118;
                            case 1005216732 -> {
                                var39 *= 45667233;
                                var39 &= -827013069;
                                var39 ^= 603500784;
                                yield var39 ^ -2134819336;
                            }
                        };
                        HP var96 = var102.withoutCombo();
                        long var120 = var8;
                        long var130 = var120 + 1L;
                        var130 = var120 * var130;
                        long var121 = var130 & 1L;
                        long var136;
                        var8 = (var136 = var121 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                        if (var8 == 0) {
                            var39 -= 143573761;
                            var39 ^= 877445505;
                            var102 = var96;
                            var39 *= -1730493927;
                            var39 ^= -790888406;
                            var39 ^= -1327681500;
                            var39 >>>= 28;
                            var39 ^= -1818803579;
                            break label114;
                        }

                        var39 *= 990356309;
                        var39 |= 256621722;
                        var39 ^= -610983601;
                    } else {
                        var39 <<= 26;
                        var39 -= -828504074;
                        var39 >>= 21;
                        var39 ^= 1530224990;
                    }
                } else {
                    var39 = var6 * -755117741;
                    var39 ^= -1817864063;
                    var39 ^= 2093101237;
                }

                var8 = var39 + 1;
                var8 = var39 * var8;
                int var86 = var39 + 2;
                var8 *= var86;
                var39 += 3;
                var8 *= var39;
                var39 = var8 & 7;
                if (var39 == 0) {
                    RuntimeException var78 = new RuntimeException();
                    throw var78;
                }
                break label115;
            }

            boolean var80 = var85.t(var1, var102);
            return;
        }

        RuntimeException var77 = new RuntimeException();
        throw var77;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1694940857;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        zb = var4;
        String[] var5 = new String[]{
            "minecraft:entity.player.attack.crit",
            "minecraft:entity.player.attack.sweep",
            "minecraft:entity.player.attack.nodamage",
            "minecraft:entity.player.attack.knockback",
            "minecraft:entity.player.attack.strong",
            "minecraft:entity.player.attack.weak"
        };
        c = var5;
        String[] var6 = c;
        Set var7 = Set.of(var6);
        K = var7;
    }
}
