package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public final class hitparticles extends Yn {
    private static final float bz = 0.065F;
    private final RZ zk;
    private final r_2 y;
    private final r_2 BK;
    private final Uq t;
    private final Uq j;
    private final Uq ro;
    private final Uq rC;
    private final Uq mp;
    private final r_2 S;
    private final JL l;
    private final Uq a;
    private final zS O;
    private final JL IG;
    private final JL vr;
    private final mN Ip;
    private final double[] M;
    private Object aq;
    public static final int yY;

    public hitparticles() {
        super("hit_particles", "Hit Particles", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        RZ var3 = new RZ();
        nM var4 = this.bU(var3);
        RZ var5 = (RZ)var4;
        this.zk = var5;
        bA_2 var2 = bA_2.FLY;
        r_2 var6 = new r_2("motion", "Motion", var2);
        xB var7 = this.vn(var6);
        r_2 var8 = (r_2)var7;
        this.y = var8;
        YJ var59 = YJ.IMPACT;
        r_2 var9 = new r_2("spawn", "Spawn", var59);
        xB var10 = this.vn(var9);
        r_2 var11 = (r_2)var10;
        this.BK = var11;
        Uq var12 = new Uq("amount", "Amount", 6.0F, 1.0F, 24.0F);
        Uq var13 = var12.W(1.0F);
        xB var14 = this.vn(var13);
        Uq var15 = (Uq)var14;
        this.t = var15;
        Uq var16 = new Uq("crit_bonus", "Crit Bonus", 4.0F, 0.0F, 16.0F);
        Uq var17 = var16.W(1.0F);
        xB var18 = this.vn(var17);
        Uq var19 = (Uq)var18;
        this.j = var19;
        Uq var20 = new Uq("size", "Size", 1.0F, 0.4F, 3.0F);
        Uq var21 = var20.W(0.05F);
        Uq var22 = var21.L("x");
        xB var23 = this.vn(var22);
        Uq var24 = (Uq)var23;
        this.ro = var24;
        Uq var25 = new Uq("lifetime", "Lifetime", 2.0F, 0.4F, 10.0F);
        Uq var26 = var25.W(0.1F);
        Uq var27 = var26.L("s");
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.rC = var29;
        Uq var30 = new Uq("speed", "Speed", 1.0F, 0.2F, 3.0F);
        Uq var31 = var30.W(0.05F);
        Uq var32 = var31.L("x");
        xB var33 = this.vn(var32);
        Uq var34 = (Uq)var33;
        this.mp = var34;
        ka var60 = ka.ALPHA;
        r_2 var35 = new r_2("fade", "Fade", var60);
        xB var36 = this.vn(var35);
        r_2 var37 = (r_2)var36;
        this.S = var37;
        JL var38 = new JL("collisions", "Block Collisions", true);
        xB var39 = this.vn(var38);
        JL var40 = (JL)var39;
        this.l = var40;
        Uq var41 = new Uq("glow", "Glow", 0.7F, 0.0F, 1.0F);
        Uq var42 = var41.W(0.05F);
        xB var43 = this.vn(var42);
        Uq var44 = (Uq)var43;
        this.a = var44;
        zS var45 = new zS();
        nM var46 = this.bU(var45);
        zS var47 = (zS)var46;
        this.O = var47;
        JL var48 = new JL("crit_only", "Crits Only", false);
        xB var49 = this.vn(var48);
        JL var50 = (JL)var49;
        this.IG = var50;
        JL var51 = new JL("self", "On Self", false);
        xB var52 = this.vn(var51);
        JL var53 = (JL)var52;
        this.vr = var53;
        mN var54 = new mN(512);
        this.Ip = var54;
        double[] var55 = new double[6];
        this.M = var55;
        this.dy("Glowing stars, hearts, snowflakes or glyphs bursting from the spot you hit.");
        this.fJ(true);
        wD<Hm> var56 = (Hm var1x) -> {
            label78: {
                int var2x = yY;
                var2x ^= -1908929315;
                int var3x = System.identityHashCode(this);
                JL var4x = this.IG;
                int var5x = var3x + 1;
                var5x = var3x * var5x;
                int var6x = var3x + 2;
                var5x *= var6x;
                var6x = var3x + 3;
                var5x *= var6x;
                var5x &= 7;
                if (var5x != 0) {
                    var2x ^= 1342671258;
                    var2x ^= -21519408;
                    var2x += 817381654;
                    var2x ^= -123712742;
                } else {
                    label77: {
                        label81: {
                            var2x >>= 6;
                            var2x ^= -334478079;
                            boolean var61 = var4x.vb();
                            if (var61) {
                                var2x <<= 1;
                                var2x |= -1386015385;
                                var2x ^= 1599882076;
                                Integer var62 = var2x;
                                if (var62 == null) {
                                    break label78;
                                }

                                boolean var63 = var1x.crit();
                                var5x = var3x + 1;
                                var5x = var3x * var5x;
                                var5x &= 1;
                                if (var5x != 0) {
                                    switch (var2x) {
                                        case -1564756941:
                                            var2x <<= 26;
                                            var2x |= 1684746550;
                                            var2x >>= 2;
                                            var2x -= -1069732768;
                                            var2x ^= 558408870;
                                            break label77;
                                        case -1180410936:
                                            var2x ^= 150748256;
                                            break label77;
                                        case -215335578:
                                        default:
                                            var2x ^= -351302341;
                                            break label77;
                                    }
                                }

                                var2x -= 1406811236;
                                var2x += 756736676;
                                var2x += 2006226834;
                                var2x ^= 1317357516;
                                if (!var63) {
                                    var2x &= -1036632047;
                                    var2x ^= 1700373339;
                                    break label81;
                                }

                                var2x += -1090524615;
                                var2x |= 135668513;
                                var2x |= -1219128016;
                                var2x ^= 969152084;
                            } else {
                                var2x += 1235262174;
                                var2x *= -1510205371;
                                var2x += 603764710;
                                var2x *= -1531422865;
                                var2x ^= -147460985;
                            }

                            long var64 = var2x;
                            long var79 = var64 + 1L;
                            long var80 = var64 * var79;
                            long var65 = var80 & 1L;
                            long var84;
                            int var66 = (var84 = var65 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                            if (var66 != 0) {
                                break label78;
                            }

                            Entity var67 = var1x.target();
                            boolean var77 = var1x.crit();
                            r_2 var81 = this.BK;
                            Integer var52x = var3x;
                            if (var52x == null) {
                                var2x >>>= 6;
                                var2x >>>= 3;
                                var2x |= 769267757;
                                var2x |= -968411740;
                                var2x ^= -194361674;
                                break label77;
                            }
                            var2x = switch (var2x) {
                                case -1854110201 -> var2x ^ 1871005285;
                                case -963403417 -> {
                                    var2x |= -1947684581;
                                    var2x *= -1468285967;
                                    var2x += -1926986354;
                                    var2x &= -70743834;
                                    yield var2x ^ -42397120;
                                }
                                default -> var2x ^ -1495125630;
                            };
                            var52x = var2x;
                            if (var52x == null) {
                                break label78;
                            }

                            Enum var54x = var81.A();
                            YJ var55x = (YJ)var54x;
                            var6x = var2x & 1666687032;
                            var6x ^= -916442198;
                            this.e(var67, var77, var55x, var6x);
                            switch (var2x) {
                                case -1155880818:
                                default:
                                    var2x ^= 1720610187;
                                    break;
                                case 783880772:
                                    var2x ^= -1956096994;
                                    var2x ^= 1084024064;
                                    break;
                                case 796597327:
                                    var2x ^= -756922408;
                            }
                        }

                        var3x = var2x + 1;
                        var3x = var2x * var3x;
                        int var68 = var2x + 2;
                        var3x *= var68;
                        int var69 = var2x + 3;
                        var3x *= var69;
                        var3x &= 7;
                        if (var3x == 0) {
                            return;
                        }
                        break label78;
                    }
                }

                RuntimeException var51x = new RuntimeException();
                throw var51x;
            }

            UnsupportedOperationException var46x = new UnsupportedOperationException();
            throw var46x;
        };
        this.iI(Hm.class, var56);
        wD<GN> var57 = (GN var1x) -> {
            label69: {
                int var2x = yY;
                var2x ^= 44238064;
                int var3x = System.identityHashCode(this);
                JL var4x = this.vr;
                long var5x = var3x;
                long var7x = var5x + 1L;
                var7x = var5x * var7x;
                long var9x = var5x + 2L;
                var7x *= var9x;
                var5x += 3L;
                var7x *= var5x;
                var5x = var7x & 7L;
                long var89;
                int var67 = (var89 = var5x - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                if (var67 != 0) {
                    var2x &= 11505386;
                    var2x ^= 911597748;
                } else {
                    var2x >>= 17;
                    var2x -= -890805716;
                    var2x -= 2064184954;
                    var2x ^= 1195072908;
                    Integer var68 = var2x;
                    if (var68 == null) {
                        break label69;
                    }

                    boolean var56x = var4x.vb();
                    if (!var56x) {
                        var2x ^= -2084692704;
                        var2x ^= -108654700;
                        return;
                    }

                    var2x -= 8231201;
                    var2x ^= -497117167;
                    int var57x = var2x + 1;
                    int var58x = var2x * var57x;
                    int var59x = var58x & 1;
                    if (var59x != 0) {
                        break label69;
                    }

                    Entity var60x = var1x.entity();
                    Entity var69 = i_2.QI();
                    int var6x = var3x + 1;
                    var6x = var3x * var6x;
                    var6x &= 1;
                    if (var6x == 0) {
                        var2x -= 1145420135;
                        var2x -= 125504899;
                        var2x |= -1482138480;
                        var2x ^= -1345668185;
                        var6x = var2x + 1;
                        var6x = var2x * var6x;
                        var6x &= 1;
                        if (var6x != 0) {
                            break label69;
                        }

                        if (var60x != var69) {
                            var2x <<= 31;
                            var2x ^= -1579625773;
                            var2x ^= 651489902;
                            return;
                        }

                        var2x >>= 6;
                        var2x ^= -508379886;
                        Integer var61 = var2x;
                        if (var61 == null) {
                            break label69;
                        }

                        Entity var62 = var1x.entity();
                        var5x = var3x;
                        var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        var9x = var5x + 2L;
                        var7x *= var9x;
                        var5x += 3L;
                        var7x *= var5x;
                        var5x = var7x & 7L;
                        long var90;
                        var3x = (var90 = var5x - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                        if (var3x == 0) {
                            var2x -= -644548759;
                            var2x -= 365845188;
                            var2x ^= -1824729178;
                            Integer var47x = var2x;
                            if (var47x != null) {
                                YJ var48x = YJ.BODY;
                                int var73 = var2x >>> 1;
                                int var74 = var73 & -2122630546;
                                int var75 = var74 ^ -363318396;
                                this.e(var62, false, var48x, var75);
                                switch (var2x) {
                                    case -1417593707:
                                        var2x ^= -1302401291;
                                        return;
                                    case 777861173:
                                    default:
                                        var2x ^= -1181753700;
                                        return;
                                    case 1649606783:
                                        var2x *= 291943303;
                                        var2x ^= 502581612;
                                        var2x *= -738679425;
                                        var2x >>>= 1;
                                        var2x ^= -616929592;
                                        return;
                                }
                            }
                            break label69;
                        }

                        var2x *= -227973589;
                        var2x ^= -117465090;
                    } else {
                        switch (var2x) {
                            case 58725142:
                            default:
                                var2x ^= 1583246409;
                                break;
                            case 518521081:
                                var2x *= 2107968563;
                                var2x += 339797497;
                                var2x *= -776221351;
                                var2x += -2014917483;
                                var2x ^= 326018037;
                                break;
                            case 918361655:
                                var2x ^= 1804306733;
                        }
                    }
                }

                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var63 = var2x + 2;
                var3x *= var63;
                int var64 = var2x + 3;
                var3x *= var64;
                var3x &= 7;
                if (var3x == 0) {
                    RuntimeException var54x = new RuntimeException();
                    throw var54x;
                }
            }

            UnsupportedOperationException var55x = new UnsupportedOperationException();
            throw var55x;
        };
        this.iI(GN.class, var57);
        wD<T> var58 = (T var1x) -> {
            label104: {
                int var50x;
                label112: {
                    var50x = yY;
                    var50x ^= -669036045;
                    int var3x = System.identityHashCode(this);
                    RenderPhase var4x = var1x.phase();
                    RenderPhase var5x = RenderPhase.WORLD;
                    Integer var6x = var3x;
                    if (var6x == null) {
                        switch (var50x) {
                            case -106742643:
                            default:
                                var50x ^= 650192111;
                                break;
                            case 412182551:
                                var50x ^= 757838001;
                                break;
                            case 1256872031:
                                var50x *= -3426879;
                                var50x |= 61217712;
                                var50x ^= 1531479545;
                        }
                    } else {
                        var50x &= 1278864090;
                        var50x -= 1725822259;
                        var50x -= 1780400023;
                        var50x ^= 885706887;
                        if (var4x != var5x) {
                            var50x ^= 1403721945;
                            var50x >>= 31;
                            var50x |= -168488691;
                            var50x ^= 252100982;
                            long var93 = var50x;
                            long var122 = var93 + 1L;
                            long var123 = var93 * var122;
                            long var94 = var123 & 1L;
                            long var137;
                            int var95 = (var137 = var94 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var95 == 0) {
                                return;
                            }
                            break label104;
                        }

                        var50x *= 1223076777;
                        var50x ^= 1042665544;
                        var50x <<= 6;
                        var50x |= -1517982860;
                        var50x ^= -370700424;
                        int var86 = var50x + 1;
                        int var87 = var50x * var86;
                        int var88 = var87 & 1;
                        if (var88 != 0) {
                            break label104;
                        }

                        Entity var89 = i_2.QI();
                        Integer var98 = var3x;
                        if (var98 != null) {
                            var50x >>>= 11;
                            var50x |= -1648065594;
                            var50x ^= -491254758;
                            var50x ^= 341987136;
                            if (var89 == null) {
                                var50x *= -1946101279;
                                var50x += -1996880592;
                                var50x ^= -1280433;
                                break label112;
                            }

                            var50x += -2010780137;
                            var50x &= -1008810246;
                            var50x &= -1092441986;
                            var50x &= -1539761152;
                            var50x ^= -290093129;
                            int var99 = var50x + 1;
                            int var100 = var50x * var99;
                            int var101 = var100 & 1;
                            if (var101 != 0) {
                                break label104;
                            }

                            var5x = (RenderPhase)this.aq;
                            long var111 = var3x;
                            long var8x = var111 + 1L;
                            var8x = var111 * var8x;
                            long var112 = var8x & 1L;
                            long var134;
                            int var113 = (var134 = var112 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                            if (var113 != 0) {
                                var50x |= -1913027816;
                                var50x ^= 1800133113;
                            } else {
                                label111: {
                                    var50x -= 1517230446;
                                    var50x &= -1088014364;
                                    var50x &= -1849091210;
                                    var50x >>>= 27;
                                    var50x ^= 1647429346;
                                    Integer var114 = var50x;
                                    if (var114 == null) {
                                        break label104;
                                    }

                                    if (var5x != null) {
                                        var50x += -1903533580;
                                        var50x ^= -979993756;
                                        Integer var103 = var50x;
                                        if (var103 == null) {
                                            break label104;
                                        }

                                        var5x = (RenderPhase)this.aq;
                                        int var115 = var3x + 1;
                                        var115 = var3x * var115;
                                        var115 &= 1;
                                        if (var115 != 0) {
                                            var50x ^= -1957645779;
                                            var50x ^= 986496987;
                                            break label111;
                                        }

                                        var50x -= -860172013;
                                        var50x -= -39844480;
                                        var50x ^= 1104172050;
                                        var50x ^= -663312494;
                                        World var90 = var89.getEntityWorld();
                                        if ((Object)var5x != var90) {
                                            switch (var50x) {
                                                case -211186019:
                                                    var50x &= -1863894563;
                                                    var50x ^= -514098794;
                                                    break label112;
                                                case 552418886:
                                                default:
                                                    var50x ^= 1179573853;
                                                    break label112;
                                                case 595450625:
                                                    var50x ^= 709093156;
                                                    break label112;
                                            }
                                        }

                                        var50x <<= 16;
                                        var50x *= -1023027113;
                                        var50x ^= -123542363;
                                        var50x ^= 1034431996;
                                    } else {
                                        var50x &= 829996404;
                                        var50x ^= 2118136718;
                                        var50x <<= 15;
                                        var50x ^= 1906755929;
                                    }

                                    mN var91 = this.Ip;
                                    r_2 var105 = this.S;
                                    Enum var106 = var105.A();
                                    ka var107 = (ka)var106;
                                    JL var118 = this.l;
                                    long var7x = var3x;
                                    long var9x = var7x + 1L;
                                    var9x = var7x * var9x;
                                    long var11x = var7x + 2L;
                                    var9x *= var11x;
                                    var7x += 3L;
                                    var9x *= var7x;
                                    var7x = var9x & 7L;
                                    long var135;
                                    var3x = (var135 = var7x - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                                    if (var3x == 0) {
                                        var50x *= -791287429;
                                        var50x &= 1193338135;
                                        var50x |= -49129964;
                                        var50x >>= 11;
                                        var50x ^= 468457168;
                                        var3x = var50x + 1;
                                        var3x = var50x * var3x;
                                        var3x &= 1;
                                        if (var3x == 0) {
                                            boolean var81 = var118.vb();
                                            var91.Vs(var107, 0.0F, var81);
                                            mN var82 = this.Ip;
                                            Canvas var92 = var1x.canvas();
                                            Ud var108 = Ud.Z();
                                            AuraPipeline var109 = var108.Ul();
                                            WorldDraw var110 = var109.world();
                                            FrameContext var119 = var1x.frame();
                                            float var120 = var119.dt();
                                            float var121 = Math.min(var120, 0.1F);
                                            FrameContext var126 = var1x.frame();
                                            double var127 = var126.time();
                                            zS var132 = this.O;
                                            Uq var10x = this.a;
                                            float var133 = var10x.WM();
                                            var82.h(var92, var110, var121, var127, var132, var133);
                                            return;
                                        }
                                        break label104;
                                    }

                                    var50x ^= 1392783721;
                                    var50x &= 912863207;
                                    var50x ^= -1258850714;
                                }
                            }
                        } else {
                            var50x *= -1951439917;
                            var50x -= 1049339578;
                            var50x ^= -6368532;
                        }
                    }

                    long var72 = var50x;
                    long var96 = var72 + 1L;
                    long var97 = var72 * var96;
                    long var73 = var97 & 1L;
                    long var136;
                    var50x = (var136 = var73 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                    if (var50x == 0) {
                        IllegalStateException var76 = new IllegalStateException();
                        throw var76;
                    }
                    break label104;
                }

                int var83 = var50x + 1;
                var83 = var50x * var83;
                var83 &= 1;
                if (var83 == 0) {
                    this.J();
                    return;
                }
            }

            UnsupportedOperationException var75 = new UnsupportedOperationException();
            throw var75;
        };
        this.iI(T.class, var58);
    }

    public int O() {
        int var1 = yY;
        var1 ^= -1659439900;
        int var2 = System.identityHashCode(this);
        mN var3 = this.Ip;
        Integer var24 = var2;
        if (var24 != null) {
            var1 &= -736457481;
            var1 *= 2135202933;
            var1 ^= -46472139;
            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var35;
            int var25 = (var35 = var4 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var25 == 0) {
                return var3.qi();
            }
        } else {
            var1 ^= 1233405995;
            var1 <<= 4;
            var1 &= 793519141;
            var1 ^= 299555008;
            long var18 = var1;
            long var26 = var18 + 1L;
            long var27 = var18 * var26;
            long var5 = var18 + 2L;
            long var28 = var27 * var5;
            long var19 = var18 + 3L;
            long var29 = var28 * var19;
            long var20 = var29 & 7L;
            long var36;
            var1 = (var36 = var20 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            }
        }

        UnsupportedOperationException var22 = new UnsupportedOperationException();
        throw var22;
    }

    @Override
    protected void J() {
        int var1 = yY;
        var1 ^= -493252494;
        int var2 = System.identityHashCode(this);
        mN var3 = this.Ip;
        var3.wW();
        int var25 = var2 + 1;
        int var26 = var2 * var25;
        int var4 = var2 + 2;
        int var27 = var26 * var4;
        var2 += 3;
        int var28 = var27 * var2;
        var2 = var28 & 7;
        int var29 = of_2.i;
        var1 ^= var29;
        var1 ^= 563708667;
        int var30 = of_2.Yu;
        var1 ^= var30;
        var1 ^= -5981716;
        if (var2 != 0) {
            var1 *= -948065381;
            var1 ^= 630703372;
            IllegalArgumentException var24 = new IllegalArgumentException();
            throw var24;
        } else {
            var1 -= -787811952;
            var1 |= 1509726394;
            var1 ^= 1682261572;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var31 = var1 + 2;
            var2 *= var31;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            } else {
                this.aq = null;
            }
        }
    }

    private void e(Entity var1, boolean var2, YJ var3, int var4) {
        float var405 = 0.0F;
        float var414 = 0.0F;
        boolean var458 = false;
        label484: {
            int var56;
            int var6 = System.identityHashCode(this);
            Integer var7 = var6;
            label483:
            if (var7 != null) {
                var56 = var4 & 392478354;
                var56 += 848150989;
                var56 &= -1857416291;
                var56 |= -706503560;
                var56 ^= -1961149162;
                var7 = (Integer)this.aq;
                if (var7 != null) {
                    var56 <<= 28;
                    var56 ^= -1782900787;
                    long var325 = var56;
                    long var9 = var325 + 1L;
                    var9 = var325 * var9;
                    long var11 = var325 + 2L;
                    var9 *= var11;
                    long var326 = var325 + 3L;
                    var9 *= var326;
                    long var327 = var9 & 7L;
                    long var677;
                    int var328 = (var677 = var327 - 0L) == 0L ? 0 : (var677 < 0L ? -1 : 1);
                    if (var328 != 0) {
                        break label484;
                    }

                    Object var329 = this.aq;
                    World var8 = var1.getEntityWorld();
                    int var362 = var6 + 1;
                    int var363 = var6 * var362;
                    int var10 = var6 + 2;
                    int var364 = var363 * var10;
                    var10 = var6 + 3;
                    int var365 = var364 * var10;
                    int var366 = var365 & 7;
                    if (var366 != 0) {
                        switch (var56) {
                            case -1124809076:
                                var56 ^= 1968761407;
                                break label483;
                            case 633018317:
                                var56 |= -345529808;
                                var56 += -1360517884;
                                var56 >>>= 12;
                                var56 &= 1375541250;
                                var56 ^= -1186353641;
                                break label483;
                            case 1028014611:
                            default:
                                var56 ^= -1520487164;
                                break label483;
                        }
                    }

                    var56 >>= 9;
                    var56 ^= -641039221;
                    if (var329 != var8) {
                        var56 += 1783960435;
                        var56 &= 704006754;
                        var56 ^= 1062689864;
                        long var330 = var56;
                        var9 = var330 + 1L;
                        var9 = var330 * var9;
                        long var331 = var9 & 1L;
                        long var678;
                        var328 = (var678 = var331 - 0L) == 0L ? 0 : (var678 < 0L ? -1 : 1);
                        if (var328 != 0) {
                            break label484;
                        }

                        this.J();
                        var56 *= 155653553;
                        var56 &= -2056399455;
                        var56 -= 864626410;
                        var56 += -705849879;
                        var56 ^= 1212469098;
                    } else {
                        switch (var56) {
                            case -1041074486:
                            default:
                                var56 ^= 513135886;
                                break;
                            case -640132864:
                                var56 &= 1385019710;
                                var56 |= 777403877;
                                var56 |= 1657932974;
                                var56 ^= 2103198967;
                                var56 ^= -378136179;
                                break;
                            case 714344417:
                                var56 ^= 581011011;
                        }
                    }
                } else {
                    switch (var56) {
                        case -496208245:
                        default:
                            var56 ^= 1289971471;
                            break;
                        case 926550774:
                            var56 ^= 1728900605;
                            break;
                        case 1592828267:
                            var56 += -1540222673;
                            var56 &= 1628755401;
                            var56 |= -1240707139;
                            var56 ^= 1576582952;
                    }
                }

                var7 = var56;
                if (var7 == null) {
                    break label484;
                }

                World var334 = var1.getEntityWorld();
                this.aq = var334;
                Ud var335 = Ud.Z();
                int var343 = var6 + 1;
                var343 = var6 * var343;
                var343 &= 1;
                label475:
                if (var343 == 0) {
                    var56 |= -1975026058;
                    var56 ^= 1219458139;
                    long var346 = var56;
                    long var376 = var346 + 1L;
                    var376 = var346 * var376;
                    long var12 = var346 + 2L;
                    var376 *= var12;
                    long var347 = var346 + 3L;
                    var376 *= var347;
                    long var348 = var376 & 7L;
                    long var679;
                    var343 = (var679 = var348 - 0L) == 0L ? 0 : (var679 < 0L ? -1 : 1);
                    if (var343 != 0) {
                        break label484;
                    }

                    AuraPipeline var336 = var335.Ul();
                    FrameContext var337 = var336.frame();
                    float var338 = var337.partialTick();
                    double[] var350 = this.M;
                    ht.xN(var1, var338, var350);
                    ThreadLocalRandom var339 = ThreadLocalRandom.current();
                    ThreadLocalRandom var340 = var339;
                    Uq var351 = this.t;
                    var343 = var351.B();
                    int var371;
                    if (var2) {
                        var56 >>= 1;
                        var56 &= -1365734826;
                        var56 ^= 1604422577;
                        Uq var369 = this.j;
                        var371 = var369.B();
                        int var380 = var6 + 1;
                        int var381 = var6 * var380;
                        int var382 = var381 & 1;
                        if (var382 != 0) {
                            var56 *= -1372656387;
                            var56 >>>= 25;
                            var56 -= 1570301028;
                            var56 ^= 455589325;
                            break label475;
                        }

                        var56 += -1343830308;
                        var56 ^= -792649300;
                        var371 = var371;
                        var56 *= -685894091;
                        var56 ^= 756610433;
                    } else {
                        var56 += 463707321;
                        var56 -= 935636020;
                        var56 ^= 681204360;
                        var371 = 0;
                        switch (var56) {
                            case -1750088154:
                            default:
                                var56 ^= -1838075114;
                                break;
                            case -1364418119:
                                var56 ^= 424534924;
                                var56 -= -1150355569;
                                var56 ^= -1432301348;
                                break;
                            case -69184931:
                                var56 ^= -425850461;
                        }
                    }

                    int var383 = var56 + 1;
                    int var384 = var56 * var383;
                    int var393 = var56 + 2;
                    int var385 = var384 * var393;
                    var393 = var56 + 3;
                    int var386 = var385 * var393;
                    int var387 = var386 & 7;
                    if (var387 != 0) {
                        break label484;
                    }

                    var343 += var371;
                    var343 = var343;
                    Uq var372 = this.mp;
                    float var373 = var372.WM();
                    float var374 = var373;
                    r_2 var388 = this.y;
                    Enum var389 = var388.A();
                    bA_2 var390 = (bA_2)var389;
                    bA_2 var391 = var390;
                    float var395 = var1.getWidth();
                    double var396 = var395;
                    double var397 = var396 * 0.5;
                    double var398 = var397;
                    Integer var13 = var6;
                    if (var13 != null) {
                        var56 >>= 29;
                        var56 ^= -1946453736;
                        var56 &= 2013928744;
                        var56 ^= 1964234232;
                        var13 = var56;
                        if (var13 == null) {
                            break label484;
                        }

                        float var400 = var1.getHeight();
                        double var401 = var400;
                        double var402 = var401;
                        int var15 = 0;
                        var15 = var15;
                        var56 += -1511172004;
                        var56 *= 2024432107;
                        var56 ^= -1222278418;

                        label465:
                        while (true) {
                            if (var15 >= var343) {
                                long var320 = switch (var56) {
                                    case -166950358 -> {
                                        var56 &= -1179721094;
                                        var56 <<= 27;
                                        var56 += 366458301;
                                        yield var56 ^ 945413559;
                                    }
                                    case 105086973 -> var56 ^ -558745114;
                                    default -> var56 ^ -1445085875;
                                };
                                long var355 = var320 + 1L;
                                long var356 = var320 * var355;
                                var376 = var320 + 2L;
                                long var357 = var356 * var376;
                                long var321 = var320 + 3L;
                                long var358 = var357 * var321;
                                long var322 = var358 & 7L;
                                long var680;
                                var6 = (var680 = var322 - 0L) == 0L ? 0 : (var680 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    return;
                                }
                                break label484;
                            }

                            var56 |= -1568277163;
                            var56 ^= -642446565;
                            var56 *= -905903751;
                            var56 &= 136242882;
                            var56 ^= -93609273;
                            int[] var16 = N.V;
                            Integer var17 = var6;
                            if (var17 == null) {
                                var56 ^= -2036020584;
                                var56 ^= -117369000;
                                var56 -= -1687619693;
                                var56 ^= 1394804643;
                                break;
                            }

                            var56 += -1590943309;
                            var56 ^= -1626462420;
                            var17 = var56;
                            if (var17 == null) {
                                break label484;
                            }

                            float var18;
                            label492: {
                                int var413 = var391.ordinal();
                                int var404 = var16[var413];
                                label458:
                                switch (var404) {
                                    case 1:
                                        var56 = switch (var56) {
                                            default -> var56 ^ -1353117449;
                                            case 77283606 -> {
                                                var56 ^= 1715902039;
                                                var56 |= 1206496231;
                                                var56 *= 339314901;
                                                yield var56 ^ 2110437838;
                                            }
                                            case 1995359026 -> var56 ^ 1254428740;
                                        };
                                        Integer var440 = var56;
                                        if (var440 == null) {
                                            break label484;
                                        }

                                        double var441 = var340.nextGaussian();
                                        float var442 = (float)var441;
                                        float var443 = var442 * 2.0F;
                                        double var480 = var340.nextGaussian();
                                        float var481 = (float)var480;
                                        float var482 = var481 * 2.0F;
                                        double var532 = var340.nextGaussian();
                                        float var533 = (float)var532;
                                        float var534 = var533 * 2.0F;
                                        var405 = var443;
                                        var440 = var6;
                                        if (var440 == null) {
                                            var56 *= -726400249;
                                            var56 ^= 1189090812;
                                            break label465;
                                        }
                                        var56 = switch (var56) {
                                            default -> var56 ^ 1105120899;
                                            case -1024907226 -> var56 ^ -1066640977;
                                            case 24976125 -> {
                                                var56 += -1815348571;
                                                var56 >>= 20;
                                                var56 ^= -691051433;
                                                var56 <<= 22;
                                                yield var56 ^ 1147901703;
                                            }
                                        };
                                        var440 = var56;
                                        if (var440 == null) {
                                            break label484;
                                        }

                                        var414 = var482;
                                        var18 = var534;
                                        var56 |= -2009538764;
                                        var56 ^= -594169406;
                                        break label492;
                                    case 2:
                                        var56 *= -949588753;
                                        var56 &= -1929810755;
                                        var56 ^= 1241898604;
                                        double var437 = var340.nextGaussian();
                                        float var438 = (float)var437;
                                        long var471 = var6;
                                        long var570 = var471 + 1L;
                                        var570 = var471 * var570;
                                        var471 = var570 & 1L;
                                        long var682;
                                        int var473 = (var682 = var471 - 0L) == 0L ? 0 : (var682 < 0L ? -1 : 1);
                                        if (var473 != 0) {
                                            var56 &= -1983848827;
                                            var56 *= 2145573371;
                                            var56 ^= 1383108987;
                                            break label465;
                                        }

                                        var56 -= 717241560;
                                        var56 *= -1380910677;
                                        var56 ^= -455436228;
                                        Integer var474 = var56;
                                        if (var474 == null) {
                                            break label484;
                                        }

                                        float var439 = var438 * 1.6F;
                                        double var475 = var340.nextGaussian();
                                        double var476 = Math.abs(var475);
                                        double var477 = var476 * 1.4;
                                        float var479 = (float)(++var477);
                                        double var529 = var340.nextGaussian();
                                        float var530 = (float)var529;
                                        float var531 = var530 * 1.6F;
                                        var405 = var439;
                                        var414 = var479;
                                        var18 = var531;
                                        var56 &= -1227585516;
                                        var56 |= -1700526830;
                                        var56 |= 389175679;
                                        var56 ^= -271043702;
                                        break label492;
                                    case 3:
                                        var56 -= 592510430;
                                        var56 ^= -249941312;
                                        double var435 = var340.nextDouble(-3.0, 3.0);
                                        float var436 = (float)var435;
                                        double var469 = var340.nextDouble(5.5, 9.5);
                                        float var470 = (float)var469;
                                        double var527 = var340.nextDouble(-3.0, 3.0);
                                        int var588 = var6 + 1;
                                        var588 = var6 * var588;
                                        var588 &= 1;
                                        if (var588 != 0) {
                                            var56 ^= -1212468975;
                                            var56 ^= -1917833719;
                                            var56 |= 854184814;
                                            var56 ^= -2084873735;
                                            break label465;
                                        }

                                        var56 >>>= 7;
                                        var56 &= 658955097;
                                        var56 -= -652434733;
                                        var56 ^= 1419191660;
                                        Integer var591 = var56;
                                        if (var591 == null) {
                                            break label484;
                                        }

                                        float var528 = (float)var527;
                                        var405 = var436;
                                        var414 = var470;
                                        var18 = var528;
                                        var56 *= -1723067501;
                                        var56 += 1705939028;
                                        var56 *= -2100086961;
                                        var56 ^= -16838611;
                                        var56 ^= 1904251518;
                                        break label492;
                                    case 4:
                                        var56 += 1021409398;
                                        var56 += -1899146630;
                                        var56 += 1894964639;
                                        var56 ^= 1617187674;
                                        break;
                                    case 5:
                                        switch (var56) {
                                            case -1608886574:
                                                var56 ^= 1472922261;
                                                break label458;
                                            case -313300125:
                                            default:
                                                var56 ^= -1120531544;
                                                break label458;
                                            case 77283606:
                                                var56 *= 2143663733;
                                                var56 ^= 1517345265;
                                                break label458;
                                        }
                                    default:
                                        var56 *= -2067570215;
                                        var56 -= -338899291;
                                        var56 += 1624434354;
                                        var56 >>>= 11;
                                        var56 ^= 1332475373;
                                        Integer var19 = var56;
                                        if (var19 == null) {
                                            break label484;
                                        }

                                        double var431 = var340.nextDouble(-2.0, 2.0);
                                        float var432 = (float)var431;
                                        double var20 = var340.nextDouble(-0.8, 0.8);
                                        float var464 = (float)var20;
                                        double var21 = var340.nextDouble(-2.0, 2.0);
                                        float var526 = (float)var21;
                                        int var22 = var6 + 1;
                                        var22 = var6 * var22;
                                        int var23 = var6 + 2;
                                        var22 *= var23;
                                        var23 = var6 + 3;
                                        var22 *= var23;
                                        var22 &= 7;
                                        if (var22 != 0) {
                                            var56 &= 521999638;
                                            var56 ^= -1236749823;
                                            break label465;
                                        }

                                        var56 += 647814113;
                                        var56 |= -1165986661;
                                        var56 ^= -1857760709;
                                        long var566 = var56;
                                        long var24 = var566 + 1L;
                                        var24 = var566 * var24;
                                        long var567 = var24 & 1L;
                                        long var681;
                                        var22 = (var681 = var567 - 0L) == 0L ? 0 : (var681 < 0L ? -1 : 1);
                                        if (var22 != 0) {
                                            break label484;
                                        }

                                        var405 = var432;
                                        var414 = var464;
                                        var18 = var526;
                                        var56 *= -145103833;
                                        var56 += -1903111175;
                                        var56 -= 1131660199;
                                        var56 *= -79498673;
                                        var56 ^= -738431801;
                                        break label492;
                                }

                                double var406 = var340.nextDouble(-2.0, 2.0);
                                float var407 = (float)var406;
                                double var415 = var340.nextDouble(1.6, 4.0);
                                float var416 = (float)var415;
                                long var418 = var6;
                                long var465 = var418 + 1L;
                                var465 = var418 * var465;
                                long var569 = var418 + 2L;
                                var465 *= var569;
                                long var419 = var418 + 3L;
                                var465 *= var419;
                                long var420 = var465 & 7L;
                                long var683;
                                int var421 = (var683 = var420 - 0L) == 0L ? 0 : (var683 < 0L ? -1 : 1);
                                if (var421 != 0) {
                                    var56 &= 1016218966;
                                    var56 >>>= 12;
                                    var56 >>>= 13;
                                    var56 ^= -1186945529;
                                    break;
                                }

                                var56 &= 1784436284;
                                var56 ^= -944240910;
                                int var422 = var56 + 1;
                                int var423 = var56 * var422;
                                int var433 = var56 + 2;
                                int var424 = var423 * var433;
                                var433 = var56 + 3;
                                int var425 = var424 * var433;
                                int var426 = var425 & 7;
                                if (var426 != 0) {
                                    break label484;
                                }

                                double var427 = var340.nextDouble(-2.0, 2.0);
                                var18 = (float)var427;
                                var405 = var407;
                                var414 = var416;
                                var18 = var18;
                                var56 ^= 1673841535;
                                var56 += 1662781703;
                                var56 |= 806357595;
                                var56 ^= -1484880882;
                            }

                            Integer var446 = var56;
                            if (var446 == null) {
                                break label484;
                            }

                            bA_2 var447 = bA_2.BOUNCE;
                            long var483 = var6;
                            long var572 = var483 + 1L;
                            var572 = var483 * var572;
                            var483 = var572 & 1L;
                            long var684;
                            int var485 = (var684 = var483 - 0L) == 0L ? 0 : (var684 < 0L ? -1 : 1);
                            if (var485 != 0) {
                                var56 >>= 2;
                                var56 |= 1113253832;
                                var56 *= 565213409;
                                var56 &= 966499718;
                                var56 ^= -1731579117;
                                break;
                            }

                            var56 >>= 17;
                            var56 ^= 264300211;
                            var483 = var56;
                            var572 = var483 + 1L;
                            var572 = var483 * var572;
                            var483 = var572 & 1L;
                            long var685;
                            int var488 = (var685 = var483 - 0L) == 0L ? 0 : (var685 < 0L ? -1 : 1);
                            if (var488 != 0) {
                                break label484;
                            }

                            label498: {
                                if (var391 != var447) {
                                    var56 *= 1734405481;
                                    var56 ^= 1050039697;
                                    long var448 = var56;
                                    long var535 = var448 + 1L;
                                    var535 = var448 * var535;
                                    long var592 = var448 + 2L;
                                    var535 *= var592;
                                    long var449 = var448 + 3L;
                                    var535 *= var449;
                                    long var450 = var535 & 7L;
                                    long var686;
                                    int var451 = (var686 = var450 - 0L) == 0L ? 0 : (var686 < 0L ? -1 : 1);
                                    if (var451 != 0) {
                                        break label484;
                                    }

                                    bA_2 var452 = bA_2.GLIDE;
                                    int var489 = var6 + 1;
                                    int var490 = var6 * var489;
                                    int var539 = var6 + 2;
                                    int var491 = var490 * var539;
                                    int var540 = var6 + 3;
                                    int var492 = var491 * var540;
                                    int var493 = var492 & 7;
                                    if (var493 != 0) {
                                        switch (var56) {
                                            case 417196358:
                                            default:
                                                var56 ^= -1398155041;
                                                break label465;
                                            case 1010434508:
                                                var56 ^= -1271558845;
                                                break label465;
                                            case 1349828821:
                                                var56 ^= 329614245;
                                                var56 *= -750578677;
                                                var56 += -1912888128;
                                                var56 += -1777051356;
                                                var56 ^= -454949469;
                                                break label465;
                                        }
                                    }

                                    var56 -= -717341305;
                                    var56 += 163332283;
                                    var56 *= 1200156569;
                                    var56 += 1761855445;
                                    var56 ^= 1966264338;
                                    Integer var494 = var56;
                                    if (var494 == null) {
                                        break label484;
                                    }

                                    if (var391 != var452) {
                                        var56 &= 1365051293;
                                        var56 <<= 31;
                                        var56 += -681974289;
                                        var56 >>= 12;
                                        var56 ^= 361639329;
                                        Integer var453 = var56;
                                        if (var453 == null) {
                                            break label484;
                                        }

                                        bA_2 var454 = bA_2.HOP;
                                        Integer var495 = var6;
                                        if (var495 == null) {
                                            var56 *= 2084305965;
                                            var56 *= -650900475;
                                            var56 -= -1091322881;
                                            var56 ^= 1909222775;
                                            break;
                                        }
                                        var56 = switch (var56) {
                                            case -1689351118 -> var56 ^ -2128918612;
                                            case -361539521 -> {
                                                var56 *= 1157042625;
                                                var56 *= 1099149293;
                                                var56 ^= 1796663777;
                                                yield var56 ^ -479666763;
                                            }
                                            default -> var56 ^ -1257880812;
                                        };
                                        if (var391 != var454) {
                                            var56 -= 305542618;
                                            var56 ^= -1224801465;
                                            var56 &= 2136585690;
                                            var56 ^= 544459043;
                                            int var455 = var56 + 1;
                                            var455 = var56 * var455;
                                            var455 &= 1;
                                            if (var455 != 0) {
                                                break label484;
                                            }

                                            var458 = false;
                                            switch (var56) {
                                                case -1373145449:
                                                    var56 ^= -279668340;
                                                    break label498;
                                                case 1374351513:
                                                default:
                                                    var56 ^= -989026;
                                                    break label498;
                                                case 2105178281:
                                                    var56 -= 1570028089;
                                                    var56 += 269135577;
                                                    var56 |= 343539112;
                                                    var56 ^= 555362465;
                                                    break label498;
                                            }
                                        }

                                        var56 *= -1014065069;
                                        var56 |= 1680195589;
                                        var56 >>>= 25;
                                        var56 *= -681224083;
                                        var56 ^= -973511288;
                                    } else {
                                        var56 &= -293661324;
                                        var56 += -1765537410;
                                        var56 &= -1561931509;
                                        var56 &= -455738942;
                                        var56 ^= -1995477960;
                                    }
                                } else {
                                    var56 |= -1477556164;
                                    var56 ^= -1495161978;
                                }

                                int var496 = var56 + 1;
                                int var497 = var56 * var496;
                                int var541 = var56 + 2;
                                int var498 = var497 * var541;
                                var541 = var56 + 3;
                                int var499 = var498 * var541;
                                int var500 = var499 & 7;
                                if (var500 != 0) {
                                    break label484;
                                }

                                var458 = true;
                                var56 ^= 1469960484;
                                var56 ^= 1081174358;
                            }

                            int var501 = var56 + 1;
                            int var502 = var56 * var501;
                            int var503 = var502 & 1;
                            if (var503 != 0) {
                                break label484;
                            }

                            Integer var504 = var6;
                            if (var504 == null) {
                                var56 *= 807895807;
                                var56 ^= -864508753;
                                break;
                            }

                            var56 -= 176807175;
                            var56 -= 226860647;
                            var56 *= 203971111;
                            var56 += 354794646;
                            var56 ^= -966464463;
                            Integer var505 = var56;
                            if (var505 == null) {
                                break label484;
                            }

                            double var461;
                            if (var458) {
                                var56 = switch (var56) {
                                    case -817693443 -> {
                                        var56 *= -1772426689;
                                        var56 *= 776926475;
                                        yield var56 ^ 1076351846;
                                    }
                                    case 223021712 -> var56 ^ -1954549577;
                                    default -> var56 ^ 962713289;
                                };
                                var446 = var56;
                                if (var446 == null) {
                                    break label484;
                                }

                                double var460 = var340.nextDouble(0.17, 1.05);
                                long var543 = var6;
                                long var593 = var543 + 1L;
                                var593 = var543 * var593;
                                long var25 = var543 + 2L;
                                var593 *= var25;
                                var543 += 3L;
                                var593 *= var543;
                                var543 = var593 & 7L;
                                long var687;
                                int var546 = (var687 = var543 - 0L) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                                if (var546 != 0) {
                                    var56 &= -1519112107;
                                    var56 *= -1183580631;
                                    var56 &= 476225528;
                                    var56 *= -145011271;
                                    var56 ^= -734713697;
                                    break;
                                }
                                var56 = switch (var56) {
                                    default -> var56 ^ -1770500315;
                                    case 847425554 -> var56 ^ 2047154108;
                                    case 1179983495 -> {
                                        var56 *= 950494881;
                                        yield var56 ^ 1468864405;
                                    }
                                };
                                var543 = var56;
                                var593 = var543 + 1L;
                                var593 = var543 * var593;
                                var25 = var543 + 2L;
                                var593 *= var25;
                                var543 += 3L;
                                var593 *= var543;
                                var543 = var593 & 7L;
                                long var688;
                                int var550 = (var688 = var543 - 0L) == 0L ? 0 : (var688 < 0L ? -1 : 1);
                                if (var550 != 0) {
                                    break label484;
                                }

                                var461 = var460;
                                var56 &= 2043946109;
                                var56 -= 174659334;
                                var56 ^= -236892024;
                            } else {
                                var56 &= 1781064728;
                                var56 &= 1419403649;
                                var56 ^= 1855344367;
                                int var551 = var56 + 1;
                                var551 = var56 * var551;
                                var551 &= 1;
                                if (var551 != 0) {
                                    break label484;
                                }

                                double var554 = var340.nextDouble(1.6, 5.2);
                                long var601 = var6;
                                long var617 = var601 + 1L;
                                var617 = var601 * var617;
                                long var27 = var601 + 2L;
                                var617 *= var27;
                                var601 += 3L;
                                var617 *= var601;
                                var601 = var617 & 7L;
                                long var689;
                                int var604 = (var689 = var601 - 0L) == 0L ? 0 : (var689 < 0L ? -1 : 1);
                                if (var604 != 0) {
                                    var56 += 1186335075;
                                    var56 ^= -871588283;
                                    break;
                                }

                                var56 ^= 1351642465;
                                var56 ^= -1021934683;
                                var56 ^= -854914419;
                                int var605 = var56 + 1;
                                int var606 = var56 * var605;
                                int var607 = var606 & 1;
                                if (var607 != 0) {
                                    break label484;
                                }

                                var461 = var554;
                                var56 &= -2073652322;
                                var56 ^= 438246041;
                                var56 ^= -567819779;
                            }

                            float var462 = (float)var461;
                            int var506 = var6 + 1;
                            int var507 = var6 * var506;
                            int var555 = var6 + 2;
                            int var508 = var507 * var555;
                            var555 = var6 + 3;
                            int var509 = var508 * var555;
                            int var510 = var509 & 7;
                            if (var510 != 0) {
                                switch (var56) {
                                    case -1002808862:
                                        var56 *= -1514614549;
                                        var56 |= 1496624541;
                                        var56 |= 345254111;
                                        var56 ^= 1727793640;
                                        break label465;
                                    case 421961095:
                                        var56 ^= -1488294513;
                                        break label465;
                                    case 1445372729:
                                    default:
                                        var56 ^= -1730676780;
                                        break label465;
                                }
                            }

                            var56 += -939448332;
                            var56 += 1922732064;
                            var56 += 1914710759;
                            var56 ^= 290756487;
                            var56 ^= 1793345989;
                            var483 = var56;
                            var572 = var483 + 1L;
                            var572 = var483 * var572;
                            long var609 = var483 + 2L;
                            var572 *= var609;
                            var483 += 3L;
                            var572 *= var483;
                            var483 = var572 & 7L;
                            long var690;
                            int var514 = (var690 = var483 - 0L) == 0L ? 0 : (var690 < 0L ? -1 : 1);
                            if (var514 != 0) {
                                break label484;
                            }

                            boolean var515 = var340.nextBoolean();
                            byte var519;
                            if (var515) {
                                var56 = switch (var56) {
                                    case -1734716820 -> var56 ^ 1264030618;
                                    case 189194911 -> {
                                        var56 += -755031279;
                                        var56 *= -1124388537;
                                        var56 *= 1014803467;
                                        var56 <<= 11;
                                        yield var56 ^ -773432232;
                                    }
                                    default -> var56 ^ 2077367431;
                                };
                                var483 = var56;
                                var572 = var483 + 1L;
                                var572 = var483 * var572;
                                var483 = var572 & 1L;
                                long var691;
                                int var518 = (var691 = var483 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                                if (var518 != 0) {
                                    break label484;
                                }

                                var519 = 1;
                                switch (var56) {
                                    case 346676312:
                                        var56 >>>= 20;
                                        var56 |= -608362150;
                                        var56 &= -377071647;
                                        var56 ^= -1600037368;
                                        break;
                                    case 846612521:
                                    default:
                                        var56 ^= 2074568758;
                                        break;
                                    case 1663912035:
                                        var56 ^= 444162682;
                                }
                            } else {
                                var56 <<= 30;
                                var56 |= 2105697640;
                                var56 ^= 967502279;
                                var56 += 948755287;
                                var56 ^= 245940239;
                                Integer var557 = var56;
                                if (var557 == null) {
                                    break label484;
                                }

                                var519 = -1;
                                var56 -= -1235442998;
                                var56 *= 1777390793;
                                var56 &= 1411806943;
                                var56 ^= 1828789535;
                            }

                            float var520 = var519;
                            Integer var558 = var6;
                            if (var558 == null) {
                                var56 += 211914102;
                                var56 >>= 21;
                                var56 -= -1123188344;
                                var56 ^= -72211407;
                                break;
                            }

                            var56 ^= 1090728268;
                            var56 >>= 13;
                            var56 &= -616508707;
                            var56 ^= 66905546;
                            int var559 = var56 + 1;
                            var559 = var56 * var559;
                            var559 &= 1;
                            if (var559 != 0) {
                                break label484;
                            }

                            float var463 = var462 * var520;
                            YJ var521 = YJ.BODY;
                            double var525;
                            double var586;
                            double var615;
                            float var622;
                            float var624;
                            if (var3 == var521) {
                                var56 &= 2053293070;
                                var56 += -1579130828;
                                var56 -= -1393599641;
                                var56 -= -1522069005;
                                var56 ^= 1495230281;
                                Integer var522 = var56;
                                if (var522 == null) {
                                    break label484;
                                }

                                double var523 = var1.getX();
                                double var582 = -var398;
                                double var583 = var340.nextDouble(var582, var398);
                                double var524 = var523 + var583;
                                double var584 = var1.getY();
                                double var610 = Math.max(0.2, var402);
                                double var611 = var340.nextDouble(0.1, var610);
                                double var585 = var584 + var611;
                                Integer var612 = var6;
                                if (var612 == null) {
                                    switch (var56) {
                                        case -1711074565:
                                            var56 ^= -1255959765;
                                            break label465;
                                        case 185930157:
                                            var56 ^= -1504055023;
                                            var56 &= -1155040222;
                                            var56 ^= 272942647;
                                            break label465;
                                        case 582682481:
                                        default:
                                            var56 ^= -480969695;
                                            break label465;
                                    }
                                }
                                var56 = switch (var56) {
                                    case 185930157 -> {
                                        var56 *= 157715943;
                                        var56 ^= 713503225;
                                        var56 *= 729685447;
                                        yield var56 ^ -728270310;
                                    }
                                    default -> var56 ^ -1852094659;
                                    case 1587584644 -> var56 ^ 890024454;
                                };
                                double var613 = var1.getZ();
                                double var26 = -var398;
                                double var621 = var340.nextDouble(var26, var398);
                                double var614 = var613 + var621;
                                var622 = var405;
                                var624 = var18;
                                var525 = var524;
                                var586 = var585;
                                var615 = var614;
                                switch (var56) {
                                    case 205821885:
                                        var56 ^= 941464168;
                                        break;
                                    case 245189299:
                                    default:
                                        var56 ^= 2029682818;
                                        break;
                                    case 1273503412:
                                        var56 -= -466977064;
                                        var56 <<= 14;
                                        var56 >>>= 17;
                                        var56 += 1140444493;
                                        var56 ^= 1947620033;
                                }
                            } else {
                                var56 &= -557698873;
                                var56 ^= -1470681136;
                                long var28 = var56;
                                long var30 = var28 + 1L;
                                var30 = var28 * var30;
                                long var32 = var28 + 2L;
                                var30 *= var32;
                                var28 += 3L;
                                var30 *= var28;
                                var28 = var30 & 7L;
                                long var692;
                                int var630 = (var692 = var28 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                                if (var630 != 0) {
                                    break label484;
                                }

                                double[] var631 = this.M;
                                double var632 = var631[3];
                                float var633 = (float)var632;
                                float var634 = var633 * 0.6F;
                                float var408 = var405 + var634;
                                var28 = var6;
                                var30 = var28 + 1L;
                                var30 = var28 * var30;
                                var28 = var30 & 1L;
                                long var693;
                                int var637 = (var693 = var28 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                                if (var637 != 0) {
                                    var56 ^= -1682629923;
                                    var56 -= 1802282751;
                                    var56 ^= -659587265;
                                    var56 ^= -1537558553;
                                    break;
                                }

                                var56 &= 1837923846;
                                var56 ^= 2045609263;
                                var56 ^= 388113128;
                                double[] var638 = this.M;
                                double var639 = var638[5];
                                float var640 = (float)var639;
                                float var641 = var640 * 0.6F;
                                var18 += var641;
                                double[] var642 = this.M;
                                double var643 = var642[0];
                                double var661 = var340.nextGaussian();
                                double var662 = var661 * 0.04;
                                double var644 = var643 + var662;
                                double[] var663 = this.M;
                                double var664 = var663[1];
                                double var671 = var340.nextGaussian();
                                double var672 = var671 * 0.04;
                                double var665 = var664 + var672;
                                double[] var673 = this.M;
                                double var674 = var673[2];
                                double var34 = var340.nextGaussian();
                                var34 *= 0.04;
                                double var675 = var674 + var34;
                                var622 = var408;
                                var624 = var18;
                                var525 = var644;
                                var586 = var665;
                                var615 = var675;
                                switch (var56) {
                                    case -2097847900:
                                    default:
                                        var56 ^= 474830703;
                                        break;
                                    case -1218341:
                                        var56 ^= 337348002;
                                        break;
                                    case 1179363781:
                                        var56 += 368722355;
                                        var56 -= -1494752950;
                                        var56 ^= -2102240857;
                                }
                            }

                            long var645 = var56;
                            long var666 = var645 + 1L;
                            var666 = var645 * var666;
                            var645 = var666 & 1L;
                            long var694;
                            int var409 = (var694 = var645 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                            if (var409 != 0) {
                                break label484;
                            }

                            mN var410 = this.Ip;
                            var18 = var622 * var374;
                            float var417 = var414 * var374;
                            var622 = var624 * var374;
                            Uq var625 = this.rC;
                            var624 = var625.WM();
                            double var647 = var340.nextDouble(1.0, 1.45);
                            float var648 = (float)var647;
                            var624 *= var648;
                            Uq var649 = this.ro;
                            float var650 = var649.WM();
                            float var651 = 0.065F * var650;
                            double var29 = var340.nextDouble(0.75, 1.25);
                            Integer var31 = var6;
                            if (var31 == null) {
                                switch (var56) {
                                    case -1942746856:
                                    default:
                                        var56 ^= 729000858;
                                        break label465;
                                    case 741860258:
                                        var56 ^= 2122746418;
                                        break label465;
                                    case 938234761:
                                        var56 >>>= 14;
                                        var56 -= 743372778;
                                        var56 ^= 1794195920;
                                        break label465;
                                }
                            }

                            var56 >>>= 1;
                            var56 |= 2107959893;
                            var56 ^= 235311779;
                            float var653 = (float)var29;
                            float var652 = var651 * var653;
                            var29 = var340.nextDouble((float) (Math.PI * 2));
                            float var655 = (float)var29;
                            RZ var668 = this.zk;
                            SpriteShape var669 = var668.xZ(var340);
                            float var670 = var340.nextFloat();
                            var410.q(var525, var586, var615, var18, var417, var622, var624, var652, var655, var463, var669, var391, var670);
                            int var411 = var15 + 1;
                            var15 = var411;
                            var56 -= 1628214670;
                            var56 <<= 1;
                            var56 &= 558851226;
                            var56 -= -990002962;
                            var56 ^= -1438316152;
                        }
                    } else {
                        var56 -= 1337754673;
                        var56 |= -1257833705;
                        var56 ^= 240539976;
                    }
                } else {
                    switch (var56) {
                        case -596013882:
                        default:
                            var56 ^= -1148091106;
                            break;
                        case -353083243:
                            var56 &= 1031242717;
                            var56 *= 852945639;
                            var56 *= -269077417;
                            var56 ^= 1298574594;
                            break;
                        case 564184030:
                            var56 ^= 2093148396;
                    }
                }
            } else {
                switch (var4) {
                    case -508084583:
                        var56 = var4 ^ -1763953376;
                        break;
                    case -344902742:
                        var56 = var4 & -2108750463;
                        var56 &= -2072910440;
                        var56 &= -388224875;
                        var56 *= -2120897013;
                        var56 ^= 1960289175;
                        break;
                    case -209650458:
                    default:
                        var56 = var4 ^ -1894852786;
                }
            }

            long var315 = var56;
            long var341 = var315 + 1L;
            long var342 = var315 * var341;
            long var316 = var342 & 1L;
            long var695;
            var56 = (var695 = var316 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
            if (var56 == 0) {
                AssertionError var319 = new AssertionError();
                throw var319;
            }
        }

        IllegalStateException var318 = new IllegalStateException();
        throw var318;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -301332394;
        int var2 = Yn.C;
        int var4 = of_2.kj(var3, var1, var2);
        yY = var4;
    }
}
