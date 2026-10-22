package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public final class damagenumbers extends Yn {
    private static final int HV = 48;
    private static final LH s;
    private static final LH yZ;
    private final Uq x;
    private final Uq rC;
    private final r_2 Jo;
    private final r_2 A;
    private final JL e;
    private final JL vC;
    private final Fk c;
    private final Fk W;
    private final Fk rT;
    private final ArrayDeque SO;
    private final float[] uI;
    private int q;
    private long VL;
    private int D;
    private long h;
    private int H;
    private long JA;
    private int T;
    public static final int l;

    public damagenumbers() {
        super("damage_numbers", "Damage Numbers", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        Uq var3 = new Uq("duration", "Duration", 0.9F, 0.4F, 3.0F);
        Uq var4 = var3.W(0.1F);
        Uq var5 = var4.L("s");
        xB var6 = this.vn(var5);
        Uq var7 = (Uq)var6;
        this.x = var7;
        Uq var8 = new Uq("scale", "Scale", 1.0F, 0.5F, 2.5F);
        Uq var9 = var8.W(0.05F);
        Uq var10 = var9.L("x");
        xB var11 = this.vn(var10);
        Uq var12 = (Uq)var11;
        this.rC = var12;
        fA var2 = fA.HEALTH;
        r_2 var13 = new r_2("unit", "Unit", var2);
        xB var14 = this.vn(var13);
        r_2 var15 = (r_2)var14;
        this.Jo = var15;
        Hl var39 = Hl.RISE;
        r_2 var16 = new r_2("motion", "Motion", var39);
        xB var17 = this.vn(var16);
        r_2 var18 = (r_2)var17;
        this.A = var18;
        JL var19 = new JL("heals", "Show Heals", true);
        xB var20 = this.vn(var19);
        JL var21 = (JL)var20;
        this.e = var21;
        JL var22 = new JL("only_mine", "Only My Hits", true);
        xB var23 = this.vn(var22);
        JL var24 = (JL)var23;
        this.vC = var24;
        Fk var25 = new Fk("damage_color", "Damage Color", -1);
        xB var26 = this.vn(var25);
        Fk var27 = (Fk)var26;
        this.c = var27;
        Fk var28 = new Fk("crit_color", "Crit Color", -1850997);
        xB var29 = this.vn(var28);
        Fk var30 = (Fk)var29;
        this.W = var30;
        Fk var31 = new Fk("heal_color", "Heal Color", -6889784);
        xB var32 = this.vn(var31);
        Fk var33 = (Fk)var32;
        this.rT = var33;
        ArrayDeque var34 = new ArrayDeque();
        this.SO = var34;
        float[] var35 = new float[2];
        this.uI = var35;
        this.q = -1;
        this.D = -1;
        this.H = -1;
        this.dy("Floating numbers for damage dealt and health regained.");
        this.fJ(true);
        wD<Hm> var36 = (Hm var1x) -> {
            label42: {
                int var2x = l;
                var2x ^= 337358091;
                int var3x = System.identityHashCode(this);
                Entity var4x = var1x.target();
                int var37x = var4x.getId();
                long var5x = var3x;
                long var7x = var5x + 1L;
                var7x = var5x * var7x;
                long var9x = var5x + 2L;
                var7x *= var9x;
                var5x += 3L;
                var7x *= var5x;
                var5x = var7x & 7L;
                long var58;
                int var47 = (var58 = var5x - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                if (var47 == 0) {
                    var2x >>= 21;
                    var2x -= 934776909;
                    var2x *= -818963201;
                    var2x >>= 23;
                    var2x ^= -1034633273;
                    int var48 = var2x + 1;
                    int var49 = var2x * var48;
                    int var50 = var49 & 1;
                    if (var50 != 0) {
                        break label42;
                    }

                    this.D = var37x;
                    long var38x = System.currentTimeMillis();
                    this.h = var38x;
                    boolean var39x = var1x.crit();
                    if (!var39x) {
                        var2x ^= -1724359370;
                        var2x |= -202278574;
                        var2x += -1074044982;
                        var2x ^= 492644997;
                        return;
                    }

                    var2x ^= -1774250829;
                    var2x ^= -1204550102;
                    long var40 = var2x;
                    long var6x = var40 + 1L;
                    var6x = var40 * var6x;
                    long var41 = var6x & 1L;
                    long var59;
                    int var42 = (var59 = var41 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                    if (var42 != 0) {
                        break label42;
                    }

                    int var43 = this.D;
                    this.q = var43;
                    long var44 = this.h;
                    Integer var35x = var3x;
                    if (var35x != null) {
                        var2x &= 200257209;
                        var2x ^= 1529497618;
                        var2x += -1579804468;
                        var2x ^= -264537773;
                        var6x = var2x;
                        long var8x = var6x + 1L;
                        var8x = var6x * var8x;
                        var6x = var8x & 1L;
                        long var60;
                        int var36x = (var60 = var6x - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                        if (var36x != 0) {
                            break label42;
                        }

                        this.VL = var44;
                        var2x >>>= 18;
                        var2x ^= -1499172732;
                        return;
                    }

                    var2x *= -136524621;
                    var2x ^= -98693455;
                } else {
                    var2x |= 1670524832;
                    var2x ^= 1472386887;
                }

                Integer var32x = var2x;
                if (var32x != null) {
                    RuntimeException var34x = new RuntimeException();
                    throw var34x;
                }
            }

            IllegalStateException var33x = new IllegalStateException();
            throw var33x;
        };
        this.iI(Hm.class, var36);
        wD<tZ> var37 = this::O;
        this.iI(tZ.class, var37);
        wD<T> var38 = this::G;
        this.iI(T.class, var38);
    }

    @Override
    protected void J() {
        int var1 = l;
        var1 ^= 388611924;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var26;
        var2 = (var26 = var22 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            switch (var1) {
                case -776326777:
                    var1 ^= 1058313908;
                    break;
                case 1365267249:
                    var1 >>>= 27;
                    var1 &= 1654412214;
                    var1 -= 1875843499;
                    var1 ^= 482210803;
                    break;
                case 1677364956:
                default:
                    var1 ^= -1680138726;
            }

            ArrayDeque var24 = this.SO;
            var24.clear();
        } else {
            var1 &= 549024304;
            var1 -= -183960178;
            var1 *= 2102292189;
            var1 ^= -1109410686;
            var1 ^= 1512909530;
            Integer var12 = var1;
            if (var12 != null) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            } else {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            }
        }
    }

    private void O(tZ var1) {
        boolean var432 = false;
        boolean var448 = false;
        long var518 = 0L;
        label553: {
            int var2 = l;
            var2 ^= 1263875565;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var699;
            int var343 = (var699 = var4 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
            if (var343 == 0) {
                var2 = switch (var2) {
                    case 84647444 -> var2 ^ 2101538441;
                    case 219994504 -> {
                        var2 &= -1757561626;
                        var2 ^= 1847508614;
                        yield var2 ^ -1205723593;
                    }
                    default -> var2 ^ 878940980;
                };
                int var344 = var2 + 1;
                int var345 = var2 * var344;
                int var5 = var2 + 2;
                int var346 = var345 * var5;
                var5 = var2 + 3;
                int var347 = var346 * var5;
                int var348 = var347 & 7;
                if (var348 != 0) {
                    break label553;
                }

                float var349 = var1.delta();
                float var355 = Math.abs(var349);
                float var700;
                var5 = (var700 = var355 - 0.05F) == 0.0F ? 0 : (var700 < 0.0F ? -1 : 1);
                if (var5 < 0) {
                    var2 *= -1437395781;
                    var2 -= -132311354;
                    var2 ^= -1318758017;
                    Integer var381 = var2;
                    if (var381 != null) {
                        return;
                    }
                    break label553;
                }

                var2 += 1586036398;
                var2 ^= 1818829078;
                long var357 = var2;
                long var7 = var357 + 1L;
                var7 = var357 * var7;
                long var9 = var357 + 2L;
                var7 *= var9;
                long var358 = var357 + 3L;
                var7 *= var358;
                long var359 = var7 & 7L;
                long var701;
                var5 = (var701 = var359 - 0L) == 0L ? 0 : (var701 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label553;
                }

                float var702;
                var5 = (var702 = var349 - 0.0F) == 0.0F ? 0 : (var702 < 0.0F ? -1 : 1);
                Integer var385 = var3;
                label547:
                if (var385 != null) {
                    var2 -= -1812665835;
                    var2 *= -241662247;
                    var2 -= 1799567354;
                    var2 ^= 599370858;
                    Integer var386 = var2;
                    if (var386 == null) {
                        break label553;
                    }

                    if (var5 > 0) {
                        var2 += 398713821;
                        var2 ^= -1822978733;
                        long var362 = var2;
                        var7 = var362 + 1L;
                        var7 = var362 * var7;
                        long var363 = var7 & 1L;
                        long var703;
                        var5 = (var703 = var363 - 0L) == 0L ? 0 : (var703 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label553;
                        }

                        JL var365 = this.e;
                        boolean var366 = var365.vb();
                        Integer var387 = var3;
                        if (var387 == null) {
                            var2 |= -738059300;
                            var2 <<= 14;
                            var2 += 326651453;
                            var2 ^= 958318855;
                            break label547;
                        }

                        var2 += -1601964131;
                        var2 ^= -990997529;
                        var2 |= 605930453;
                        var2 ^= 2056528698;
                        var2 ^= -1088683791;
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var704;
                        int var391 = (var704 = var6 - 0L) == 0L ? 0 : (var704 < 0L ? -1 : 1);
                        if (var391 != 0) {
                            break label553;
                        }

                        if (!var366) {
                            var2 |= -1926384754;
                            var2 ^= -847825915;
                            var2 &= -175006930;
                            var2 ^= 1043752007;
                            return;
                        }

                        var2 -= -1469623187;
                        var2 *= -1815453309;
                        var2 -= -207367658;
                        var2 ^= -225365292;
                    } else {
                        var2 >>= 29;
                        var2 ^= -757851973;
                        var2 &= 323652500;
                        var2 ^= 114556853;
                    }

                    var5 = var2 + 1;
                    var5 = var2 * var5;
                    int var392 = var2 + 2;
                    var5 *= var392;
                    int var393 = var2 + 3;
                    var5 *= var393;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label553;
                    }

                    long var372 = System.currentTimeMillis();
                    Integer var420 = var3;
                    label538:
                    if (var420 != null) {
                        label558: {
                            var2 -= 1321194665;
                            var2 -= 955210295;
                            var2 += -570336480;
                            var2 &= -466684433;
                            var2 ^= -1469200145;
                            LivingEntity var421 = var1.entity();
                            int var422 = var421.getId();
                            int var460 = this.D;
                            if (var422 == var460) {
                                var2 >>>= 26;
                                var2 += 993059106;
                                var2 <<= 31;
                                var2 &= -1351669834;
                                var2 ^= -1375735560;
                                Integer var423 = var2;
                                if (var423 == null) {
                                    break label553;
                                }

                                var7 = this.h;
                                int var487 = var3 + 1;
                                int var488 = var3 * var487;
                                int var489 = var488 & 1;
                                if (var489 != 0) {
                                    var2 &= -141250943;
                                    var2 ^= -286939206;
                                    break label538;
                                }

                                var2 -= -1273507448;
                                var2 |= -847467831;
                                var2 ^= -596031277;
                                Integer var490 = var2;
                                if (var490 == null) {
                                    break label553;
                                }

                                var7 = var372 - var7;
                                long var705;
                                int var426 = (var705 = var7 - 600L) == 0L ? 0 : (var705 < 0L ? -1 : 1);
                                if (var426 < 0) {
                                    var2 += 1767499763;
                                    var2 ^= -1817138556;
                                    int var427 = var2 + 1;
                                    int var428 = var2 * var427;
                                    int var461 = var2 + 2;
                                    int var429 = var428 * var461;
                                    int var462 = var2 + 3;
                                    int var430 = var429 * var462;
                                    int var431 = var430 & 7;
                                    if (var431 != 0) {
                                        break label553;
                                    }

                                    var432 = true;
                                    var2 |= -1209834891;
                                    var2 += 429216530;
                                    var2 <<= 19;
                                    var2 ^= 634213524;
                                    var2 ^= -752197606;
                                    break label558;
                                }

                                var2 &= -472218662;
                                var2 &= 262503156;
                                var2 *= 1683584529;
                                var2 >>>= 23;
                                var2 ^= -1843363755;
                            } else {
                                switch (var2) {
                                    case -330864626:
                                        var2 *= -1922453155;
                                        var2 ^= -1500497731;
                                        var2 ^= -1408187802;
                                        break;
                                    case 703644807:
                                    default:
                                        var2 ^= -1375816336;
                                        break;
                                    case 1242921475:
                                        var2 ^= 1380216903;
                                }
                            }

                            int var463 = var2 + 1;
                            int var464 = var2 * var463;
                            int var465 = var464 & 1;
                            if (var465 != 0) {
                                break label553;
                            }

                            var432 = false;
                            switch (var2) {
                                case -1843363379:
                                    var2 *= 387881615;
                                    var2 &= -2144676982;
                                    var2 -= -233949920;
                                    var2 += -868794134;
                                    var2 ^= -189469758;
                                    break;
                                case -59050638:
                                default:
                                    var2 ^= 653596249;
                                    break;
                                case 1034662368:
                                    var2 ^= -245843126;
                            }
                        }

                        float var706;
                        int var466 = (var706 = var349 - 0.0F) == 0.0F ? 0 : (var706 < 0.0F ? -1 : 1);
                        var9 = var3;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var707;
                        int var494 = (var707 = var9 - 0L) == 0L ? 0 : (var707 < 0L ? -1 : 1);
                        label524:
                        if (var494 == 0) {
                            var2 = switch (var2) {
                                default -> var2 ^ 1809967199;
                                case -1365298034 -> {
                                    var2 *= 685160131;
                                    var2 += 1967592441;
                                    var2 ^= -361591862;
                                    var2 -= -1300454046;
                                    yield var2 ^ 1633186541;
                                }
                                case 1800971630 -> var2 ^ 1919165652;
                            };
                            var9 = var2;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var708;
                            int var498 = (var708 = var9 - 0L) == 0L ? 0 : (var708 < 0L ? -1 : 1);
                            if (var498 != 0) {
                                break label553;
                            }

                            if (var466 < 0) {
                                var2 |= 115054062;
                                var2 <<= 29;
                                var2 -= -413547;
                                var2 ^= -720632187;
                                int var467 = var2 + 1;
                                int var468 = var2 * var467;
                                int var469 = var468 & 1;
                                if (var469 != 0) {
                                    break label553;
                                }

                                JL var470 = this.vC;
                                boolean var471 = var470.vb();
                                Integer var499 = var3;
                                if (var499 == null) {
                                    var2 += 87409517;
                                    var2 ^= -785315231;
                                    break label524;
                                }

                                var2 *= 954709521;
                                var2 -= 905559606;
                                var2 ^= 1888146834;
                                var2 ^= 1629474326;
                                Integer var500 = var2;
                                if (var500 == null) {
                                    break label553;
                                }

                                if (var471) {
                                    var2 ^= 1432749131;
                                    var2 ^= 787716801;
                                    if (!var432) {
                                        var2 &= 1993255887;
                                        var2 ^= 1591747826;
                                        var2 -= 1013821398;
                                        var2 ^= -1308180503;
                                        return;
                                    }

                                    var2 += 2078367347;
                                    var2 >>>= 14;
                                    var2 += 1692513073;
                                    var2 += -1425434016;
                                    var2 ^= -1981016915;
                                } else {
                                    var2 ^= 1070544771;
                                    var2 *= 1935138299;
                                    var2 += 1426570720;
                                    var2 ^= 1370069849;
                                }
                            } else {
                                var2 -= -1014245166;
                                var2 >>= 20;
                                var2 += 1421151391;
                                var2 ^= -759895164;
                            }

                            var7 = var2;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var709;
                            int var435 = (var709 = var7 - 0L) == 0L ? 0 : (var709 < 0L ? -1 : 1);
                            if (var435 != 0) {
                                break label553;
                            }

                            float var710;
                            int var436 = (var710 = var349 - 0.0F) == 0.0F ? 0 : (var710 < 0.0F ? -1 : 1);
                            int var472 = var3 + 1;
                            int var473 = var3 * var472;
                            int var474 = var473 & 1;
                            if (var474 != 0) {
                                switch (var2) {
                                    case -2046690916:
                                        var2 -= 1745483815;
                                        var2 -= 881334961;
                                        var2 ^= 2088330768;
                                        var2 *= 2032425563;
                                        var2 ^= -244624282;
                                        break;
                                    case 25116889:
                                    default:
                                        var2 ^= -1765023266;
                                        break;
                                    case 376233525:
                                        var2 ^= -213202172;
                                }
                            } else {
                                label610: {
                                    var2 = switch (var2) {
                                        case -2046690916 -> {
                                            var2 *= -135699205;
                                            yield var2 ^ -899600431;
                                        }
                                        case 739471619 -> var2 ^ 1619700821;
                                        default -> var2 ^ 2123036467;
                                    };
                                    Integer var475 = var2;
                                    if (var475 == null) {
                                        break label553;
                                    }

                                    label511: {
                                        if (var436 < 0) {
                                            var2 |= -1793218080;
                                            var2 ^= -2035001589;
                                            LivingEntity var437 = var1.entity();
                                            int var438 = var437.getId();
                                            Integer var476 = var3;
                                            if (var476 == null) {
                                                switch (var2) {
                                                    case 296352494:
                                                        var2 += 1855840350;
                                                        var2 ^= 1261886582;
                                                        break label610;
                                                    case 1210728742:
                                                        var2 ^= 1159779217;
                                                        break label610;
                                                    case 1685675149:
                                                    default:
                                                        var2 ^= -1673002425;
                                                        break label610;
                                                }
                                            }

                                            var2 ^= -310290990;
                                            var2 += -1753516364;
                                            var2 ^= 2089876483;
                                            int var477 = this.q;
                                            if (var438 == var477) {
                                                var2 += 1892508461;
                                                var2 <<= 24;
                                                var2 |= 1549492176;
                                                var2 += 404312226;
                                                var2 ^= -592547398;
                                                int var439 = var2 + 1;
                                                int var440 = var2 * var439;
                                                int var441 = var440 & 1;
                                                if (var441 != 0) {
                                                    break label553;
                                                }

                                                var7 = this.VL;
                                                Integer var503 = var3;
                                                if (var503 == null) {
                                                    var2 += 2080272142;
                                                    var2 &= 996657298;
                                                    var2 *= -367299143;
                                                    var2 ^= -1395448648;
                                                    break label610;
                                                }
                                                var2 = switch (var2) {
                                                    case -1653986208 -> var2 ^ 1627783249;
                                                    default -> var2 ^ -1574306838;
                                                    case 1222296008 -> {
                                                        var2 |= -655850036;
                                                        var2 >>>= 13;
                                                        var2 -= 745121511;
                                                        yield var2 ^ 213262794;
                                                    }
                                                };
                                                var9 = var2;
                                                var11 = var9 + 1L;
                                                var11 = var9 * var11;
                                                var13 = var9 + 2L;
                                                var11 *= var13;
                                                var9 += 3L;
                                                var11 *= var9;
                                                var9 = var11 & 7L;
                                                long var711;
                                                int var507 = (var711 = var9 - 0L) == 0L ? 0 : (var711 < 0L ? -1 : 1);
                                                if (var507 != 0) {
                                                    break label553;
                                                }

                                                var7 = var372 - var7;
                                                long var712;
                                                int var444 = (var712 = var7 - 600L) == 0L ? 0 : (var712 < 0L ? -1 : 1);
                                                if (var444 < 0) {
                                                    var2 *= 1203527181;
                                                    var2 ^= -1881302647;
                                                    int var445 = var2 + 1;
                                                    int var446 = var2 * var445;
                                                    int var447 = var446 & 1;
                                                    if (var447 != 0) {
                                                        break label553;
                                                    }

                                                    var448 = true;
                                                    var2 ^= -1536412642;
                                                    var2 <<= 6;
                                                    var2 ^= -1949061149;
                                                    break label511;
                                                }

                                                var2 -= -1290971019;
                                                var2 <<= 9;
                                                var2 *= -2009580483;
                                                var2 *= -1057176267;
                                                var2 ^= 605860200;
                                            } else {
                                                switch (var2) {
                                                    case -1862731374:
                                                    default:
                                                        var2 ^= 132605352;
                                                        break;
                                                    case -281749005:
                                                        var2 *= -1610905787;
                                                        var2 &= 1656646371;
                                                        var2 |= -980650736;
                                                        var2 ^= 1903588098;
                                                        var2 ^= 2085213465;
                                                        break;
                                                    case -203775403:
                                                        var2 ^= -565483847;
                                                }
                                            }
                                        } else {
                                            var2 &= 1875399883;
                                            var2 -= -1786612394;
                                            var2 ^= 802723905;
                                            var2 |= -1194069693;
                                            var2 ^= 357443203;
                                        }

                                        var448 = false;
                                        var2 >>>= 6;
                                        var2 -= 351796038;
                                        var2 ^= -123487844;
                                    }

                                    var8 = var2;
                                    long var529 = var8 + 1L;
                                    var529 = var8 * var529;
                                    var8 = var529 & 1L;
                                    long var713;
                                    int var480 = (var713 = var8 - 0L) == 0L ? 0 : (var713 < 0L ? -1 : 1);
                                    if (var480 != 0) {
                                        break label553;
                                    }

                                    LivingEntity var481 = var1.entity();
                                    int var508 = var481.getId();
                                    int var531 = this.H;
                                    int var554 = var3 + 1;
                                    int var555 = var3 * var554;
                                    int var12 = var3 + 2;
                                    int var556 = var555 * var12;
                                    var12 = var3 + 3;
                                    int var557 = var556 * var12;
                                    int var558 = var557 & 7;
                                    label496:
                                    if (var558 == 0) {
                                        var2 ^= -389757479;
                                        var2 *= 1148529243;
                                        var2 *= 1351950471;
                                        var2 ^= 2074995168;
                                        int var559 = var2 + 1;
                                        int var560 = var2 * var559;
                                        int var561 = var560 & 1;
                                        if (var561 != 0) {
                                            break label553;
                                        }

                                        label492: {
                                            if (var508 == var531) {
                                                var2 = switch (var2) {
                                                    case -2050979544 -> var2 ^ 1821027253;
                                                    case 28409138 -> {
                                                        var2 -= 870646372;
                                                        var2 -= -1114481689;
                                                        var2 &= -673422866;
                                                        var2 *= -1166992733;
                                                        yield var2 ^ -1625019853;
                                                    }
                                                    default -> var2 ^ 267473375;
                                                };
                                                var9 = this.JA;
                                                var9 = var372 - var9;
                                                long var714;
                                                int var511 = (var714 = var9 - 600L) == 0L ? 0 : (var714 < 0L ? -1 : 1);
                                                Integer var532 = var3;
                                                if (var532 == null) {
                                                    switch (var2) {
                                                        case -2105529796:
                                                        default:
                                                            var2 ^= 1998848685;
                                                            break label496;
                                                        case -1346255807:
                                                            var2 += -46003842;
                                                            var2 ^= 1718798981;
                                                            break label496;
                                                        case 561971320:
                                                            var2 ^= 1212147045;
                                                            break label496;
                                                    }
                                                }

                                                var2 ^= 1453514241;
                                                var2 >>= 1;
                                                var2 |= -288920887;
                                                var2 ^= -1430573580;
                                                var2 ^= 2036842493;
                                                Integer var533 = var2;
                                                if (var533 == null) {
                                                    break label553;
                                                }

                                                if (var511 < 0) {
                                                    var2 += 1977459575;
                                                    var2 ^= 499266417;
                                                    int var512 = var2 + 1;
                                                    int var513 = var2 * var512;
                                                    int var514 = var513 & 1;
                                                    if (var514 != 0) {
                                                        break label553;
                                                    }

                                                    int var515 = this.T;
                                                    var515++;
                                                    var529 = var3;
                                                    long var571 = var529 + 1L;
                                                    long var572 = var529 * var571;
                                                    var529 = var572 & 1L;
                                                    long var715;
                                                    int var536 = (var715 = var529 - 0L) == 0L ? 0 : (var715 < 0L ? -1 : 1);
                                                    if (var536 != 0) {
                                                        var2 &= -766066492;
                                                        var2 ^= 1034937027;
                                                        var2 -= 80538638;
                                                        var2 ^= 1615982979;
                                                        break label496;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -1093987802 -> {
                                                            var2 -= -800508198;
                                                            var2 |= 2064168981;
                                                            yield var2 ^ -419432234;
                                                        }
                                                        case -26615278 -> var2 ^ 1590705024;
                                                        default -> var2 ^ 205613091;
                                                    };
                                                    int var517 = Math.min(var515, 4);
                                                    var518 = var517;
                                                    var2 &= 425827524;
                                                    var2 ^= 1532864803;
                                                    break label492;
                                                }

                                                var2 += 1272740717;
                                                var2 *= -934381187;
                                                var2 ^= 24718536;
                                                var2 |= -753556177;
                                                var2 ^= -993300878;
                                            } else {
                                                var2 >>>= 10;
                                                var2 *= 1470214879;
                                                var2 ^= -2082361908;
                                            }

                                            var518 = 0;
                                            var2 |= -391599532;
                                            var2 |= -1670034200;
                                            var2 ^= -684519714;
                                            var2 += -1034859896;
                                            var2 ^= -1457286648;
                                        }

                                        var529 = var2;
                                        long var573 = var529 + 1L;
                                        long var574 = var529 * var573;
                                        var529 = var574 & 1L;
                                        long var716;
                                        int var539 = (var716 = var529 - 0L) == 0L ? 0 : (var716 < 0L ? -1 : 1);
                                        if (var539 != 0) {
                                            break label553;
                                        }

                                        this.T = (int)var518;
                                        int var519 = var481.getId();
                                        this.H = var519;
                                        this.JA = var372;
                                        ThreadLocalRandom var373 = ThreadLocalRandom.current();
                                        double var520 = var481.getX();
                                        double var562 = var373.nextDouble();
                                        double var563 = var562 - 0.5;
                                        float var394 = var481.getWidth();
                                        double var577 = var394;
                                        double var564 = var563 * var577;
                                        double var521 = var520 + var564;
                                        double var565 = var481.getY();
                                        float var395 = var481.getHeight();
                                        double var578 = var395;
                                        double var566 = var565 + var578;
                                        double var567 = var566 + 0.12;
                                        int var396 = this.T;
                                        double var579 = var396;
                                        double var580 = var579 * 0.18;
                                        double var568 = var567 + var580;
                                        double var581 = var373.nextDouble();
                                        double var582 = var581 * 0.12;
                                        double var569 = var568 + var582;
                                        double var583 = var481.getZ();
                                        double var15 = var373.nextDouble();
                                        var15 -= 0.5;
                                        float var397 = var481.getWidth();
                                        double var17 = var397;
                                        var15 *= var17;
                                        double var584 = var583 + var15;
                                        float var398 = Math.abs(var349);
                                        r_2 var587 = this.Jo;
                                        Integer var16 = var3;
                                        if (var16 == null) {
                                            var2 *= 619532547;
                                            var2 |= 1113915781;
                                            var2 ^= 1570207481;
                                            var2 *= -343698579;
                                            var2 ^= -730886466;
                                        } else {
                                            var2 |= -634363574;
                                            var2 ^= 1276835510;
                                            fA var636 = fA.HEARTS;
                                            boolean var588 = var587.TJ(var636);
                                            float var594;
                                            if (var588) {
                                                var2 >>= 17;
                                                var2 *= 1260060577;
                                                var2 ^= 28886720;
                                                int var589 = var2 + 1;
                                                int var590 = var2 * var589;
                                                int var637 = var2 + 2;
                                                int var591 = var590 * var637;
                                                var637 = var2 + 3;
                                                int var592 = var591 * var637;
                                                int var593 = var592 & 7;
                                                if (var593 != 0) {
                                                    break label553;
                                                }

                                                var594 = 2.0F;
                                                switch (var2) {
                                                    case -39033549:
                                                        var2 ^= 1153588068;
                                                        var2 &= -2136153218;
                                                        var2 += 1513129911;
                                                        var2 *= 76375835;
                                                        var2 ^= -1505642042;
                                                        break;
                                                    case 1540053327:
                                                        var2 ^= 527531295;
                                                        break;
                                                    case 1829787146:
                                                    default:
                                                        var2 ^= 1541967629;
                                                }
                                            } else {
                                                var2 += -1377715361;
                                                var2 |= 523385803;
                                                var2 += -1701915298;
                                                var2 += -823524983;
                                                var2 ^= -450231473;
                                                long var639 = var2;
                                                long var18 = var639 + 1L;
                                                var18 = var639 * var18;
                                                long var20 = var639 + 2L;
                                                var18 *= var20;
                                                long var640 = var639 + 3L;
                                                var18 *= var640;
                                                long var641 = var18 & 7L;
                                                long var717;
                                                int var642 = (var717 = var641 - 0L) == 0L ? 0 : (var717 < 0L ? -1 : 1);
                                                if (var642 != 0) {
                                                    break label553;
                                                }

                                                var594 = 1.0F;
                                                var2 >>= 3;
                                                var2 ^= -1901549140;
                                            }

                                            int var643 = var2 + 1;
                                            var643 = var2 * var643;
                                            int var673 = var2 + 2;
                                            var643 *= var673;
                                            int var674 = var2 + 3;
                                            var643 *= var674;
                                            var643 &= 7;
                                            if (var643 != 0) {
                                                break label553;
                                            }

                                            float var399 = var398 / var594;
                                            long var595 = var3;
                                            long var675 = var595 + 1L;
                                            long var676 = var595 * var675;
                                            long var596 = var676 & 1L;
                                            long var718;
                                            int var597 = (var718 = var596 - 0L) == 0L ? 0 : (var718 < 0L ? -1 : 1);
                                            if (var597 != 0) {
                                                var2 >>>= 5;
                                                var2 |= 636541239;
                                                var2 ^= -292955515;
                                            } else {
                                                var2 += -140998974;
                                                var2 ^= -310907147;
                                                var2 *= -298759061;
                                                var2 |= 879979809;
                                                var2 ^= 1225206369;
                                                float var719;
                                                int var598 = (var719 = var349 - 0.0F) == 0.0F ? 0 : (var719 < 0.0F ? -1 : 1);
                                                String var604;
                                                if (var598 > 0) {
                                                    var2 = switch (var2) {
                                                        case 905758682 -> {
                                                            var2 >>>= 24;
                                                            var2 |= -409592145;
                                                            var2 += 966268323;
                                                            var2 ^= -1968257091;
                                                            yield var2 ^ 1498974732;
                                                        }
                                                        case 1030660272 -> var2 ^ -322468447;
                                                        default -> var2 ^ -407560192;
                                                    };
                                                    int var599 = var2 + 1;
                                                    int var600 = var2 * var599;
                                                    var643 = var2 + 2;
                                                    int var601 = var600 * var643;
                                                    var643 = var2 + 3;
                                                    int var602 = var601 * var643;
                                                    int var603 = var602 & 7;
                                                    if (var603 != 0) {
                                                        break label553;
                                                    }

                                                    var604 = "+";
                                                    var2 <<= 6;
                                                    var2 ^= -1506785801;
                                                } else {
                                                    var2 |= -1819298236;
                                                    var2 &= -1400522996;
                                                    var2 += -1601584251;
                                                    var2 ^= -126315497;
                                                    var604 = "";
                                                    switch (var2) {
                                                        case -1116213626:
                                                            var2 += -1401654386;
                                                            var2 -= -1687646391;
                                                            var2 ^= -559029252;
                                                            break;
                                                        case 1315111139:
                                                            var2 ^= -67999958;
                                                            break;
                                                        case 1462060078:
                                                        default:
                                                            var2 ^= -1015663442;
                                                    }
                                                }

                                                var643 = var2 * -2079414211;
                                                var643 |= 1579076571;
                                                var643 ^= 1325516477;
                                                String var400 = Fn(var399, var643);
                                                String var401 = var604 + var400;
                                                float var720;
                                                int var350 = (var720 = var349 - 0.0F) == 0.0F ? 0 : (var720 < 0.0F ? -1 : 1);
                                                int var605 = var3 + 1;
                                                int var606 = var3 * var605;
                                                var643 = var3 + 2;
                                                int var607 = var606 * var643;
                                                var643 = var3 + 3;
                                                int var608 = var607 * var643;
                                                int var609 = var608 & 7;
                                                if (var609 != 0) {
                                                    switch (var2) {
                                                        case -1070839604:
                                                            var2 ^= -219504094;
                                                            break;
                                                        case 271462711:
                                                            var2 += -282424905;
                                                            var2 ^= 875150804;
                                                            break;
                                                        case 918524267:
                                                        default:
                                                            var2 ^= 1128811545;
                                                    }
                                                } else {
                                                    label571: {
                                                        var2 >>>= 18;
                                                        var2 &= 748692240;
                                                        var2 *= -1764718497;
                                                        var2 ^= -202650494;
                                                        long var610 = var2;
                                                        long var677 = var610 + 1L;
                                                        long var678 = var610 * var677;
                                                        long var611 = var678 & 1L;
                                                        long var721;
                                                        int var612 = (var721 = var611 - 0L) == 0L ? 0 : (var721 < 0L ? -1 : 1);
                                                        if (var612 != 0) {
                                                            break label553;
                                                        }

                                                        int var353;
                                                        if (var350 > 0) {
                                                            var2 *= -309816445;
                                                            var2 ^= -444009865;
                                                            Fk var351 = this.rT;
                                                            Integer var613 = var3;
                                                            if (var613 == null) {
                                                                var2 |= 934735661;
                                                                var2 *= -295891839;
                                                                var2 ^= 1466883399;
                                                                break label571;
                                                            }

                                                            var2 *= 1801977657;
                                                            var2 ^= 1684268935;
                                                            Integer var614 = var2;
                                                            if (var614 == null) {
                                                                break label553;
                                                            }

                                                            int var352 = var351.zz();
                                                            var353 = var352;
                                                            var2 ^= -2022133719;
                                                            var2 ^= 2107806309;
                                                        } else {
                                                            var2 += 1211588857;
                                                            var2 |= 2008207999;
                                                            var2 -= -1032008497;
                                                            var2 ^= 993147670;
                                                            if (var448) {
                                                                var2 = switch (var2) {
                                                                    case -2046490202 -> {
                                                                        var2 &= -614884564;
                                                                        yield var2 ^ -82702397;
                                                                    }
                                                                    case -1863166708 -> var2 ^ -881553216;
                                                                    default -> var2 ^ -1093785777;
                                                                };
                                                                Fk var615 = this.W;
                                                                int var616 = var615.zz();
                                                                long var655 = var3;
                                                                long var692 = var655 + 1L;
                                                                var692 = var655 * var692;
                                                                long var698 = var655 + 2L;
                                                                var692 *= var698;
                                                                long var656 = var655 + 3L;
                                                                var692 *= var656;
                                                                long var657 = var692 & 7L;
                                                                long var722;
                                                                var643 = (var722 = var657 - 0L) == 0L ? 0 : (var722 < 0L ? -1 : 1);
                                                                if (var643 != 0) {
                                                                    var2 ^= -1640663585;
                                                                    var2 -= -1685192366;
                                                                    var2 &= -1975289438;
                                                                    var2 |= -1976867533;
                                                                    var2 ^= 1096446601;
                                                                    break label571;
                                                                }

                                                                var2 += 321956427;
                                                                var2 ^= -1219540457;
                                                                var2 ^= -720765719;
                                                                var643 = var2 + 1;
                                                                var643 = var2 * var643;
                                                                int var679 = var2 + 2;
                                                                var643 *= var679;
                                                                int var680 = var2 + 3;
                                                                var643 *= var680;
                                                                var643 &= 7;
                                                                if (var643 != 0) {
                                                                    break label553;
                                                                }

                                                                var353 = var616;
                                                                switch (var2) {
                                                                    case -301660212:
                                                                        var2 -= -299487825;
                                                                        var2 ^= -258699905;
                                                                        break;
                                                                    case 1153441496:
                                                                    default:
                                                                        var2 ^= 1271228965;
                                                                        break;
                                                                    case 1437023373:
                                                                        var2 ^= 1192399283;
                                                                }
                                                            } else {
                                                                var2 += 178503832;
                                                                var2 -= -1148993827;
                                                                var2 &= 1670978084;
                                                                var2 ^= -1340944855;
                                                                Integer var617 = var2;
                                                                if (var617 == null) {
                                                                    break label553;
                                                                }

                                                                Fk var618 = this.c;
                                                                Integer var664 = var3;
                                                                if (var664 == null) {
                                                                    var2 ^= 1128145686;
                                                                    var2 ^= 2036129829;
                                                                    break label571;
                                                                }

                                                                var2 ^= 252829946;
                                                                var2 |= -529165731;
                                                                var2 *= -1635289231;
                                                                var2 ^= -391729902;
                                                                int var619 = var618.zz();
                                                                var353 = var619;
                                                                var2 &= 900883723;
                                                                var2 >>= 18;
                                                                var2 ^= 18514882;
                                                                var2 ^= 240179392;
                                                            }
                                                        }

                                                        Integer var620 = var2;
                                                        if (var620 == null) {
                                                            break label553;
                                                        }

                                                        long var621 = var3;
                                                        long var681 = var621 + 1L;
                                                        long var682 = var621 * var681;
                                                        long var622 = var682 & 1L;
                                                        long var723;
                                                        int var623 = (var723 = var622 - 0L) == 0L ? 0 : (var723 < 0L ? -1 : 1);
                                                        label458:
                                                        if (var623 == 0) {
                                                            var2 |= 851457116;
                                                            var2 ^= -1007929864;
                                                            var2 ^= -268099181;
                                                            long var624 = var2;
                                                            long var683 = var624 + 1L;
                                                            long var684 = var624 * var683;
                                                            long var19 = var624 + 2L;
                                                            long var685 = var684 * var19;
                                                            long var625 = var624 + 3L;
                                                            long var686 = var685 * var625;
                                                            long var626 = var686 & 7L;
                                                            long var724;
                                                            int var627 = (var724 = var626 - 0L) == 0L ? 0 : (var724 < 0L ? -1 : 1);
                                                            if (var627 != 0) {
                                                                break label553;
                                                            }

                                                            ArrayDeque var628 = this.SO;
                                                            int var629 = var628.size();
                                                            if (var629 >= 48) {
                                                                var2 = switch (var2) {
                                                                    default -> var2 ^ 1627984734;
                                                                    case 203645717 -> {
                                                                        var2 >>>= 11;
                                                                        var2 += 676939057;
                                                                        yield var2 ^ -548070676;
                                                                    }
                                                                    case 2078144071 -> var2 ^ 94909880;
                                                                };
                                                                int var630 = var2 + 1;
                                                                int var631 = var2 * var630;
                                                                int var632 = var631 & 1;
                                                                if (var632 != 0) {
                                                                    break label553;
                                                                }

                                                                ArrayDeque var633 = this.SO;
                                                                long var665 = var3;
                                                                long var696 = var665 + 1L;
                                                                var696 = var665 * var696;
                                                                long var666 = var696 & 1L;
                                                                long var725;
                                                                var643 = (var725 = var666 - 0L) == 0L ? 0 : (var725 < 0L ? -1 : 1);
                                                                if (var643 != 0) {
                                                                    var2 *= -1578176119;
                                                                    var2 *= -2140660277;
                                                                    var2 |= 1111429848;
                                                                    var2 ^= -1395721791;
                                                                    break label458;
                                                                }

                                                                var2 ^= -214639456;
                                                                var2 -= -967376189;
                                                                var2 |= 1918391583;
                                                                var2 ^= 1885066478;
                                                                var643 = var2 + 1;
                                                                var643 = var2 * var643;
                                                                int var687 = var2 + 2;
                                                                var643 *= var687;
                                                                int var688 = var2 + 3;
                                                                var643 *= var688;
                                                                var643 &= 7;
                                                                if (var643 != 0) {
                                                                    break label553;
                                                                }

                                                                Object var634 = var633.pollFirst();
                                                                var2 &= 517305714;
                                                                var2 |= 2004149583;
                                                                var2 |= -1529315272;
                                                                var2 ^= -1703049197;
                                                            } else {
                                                                var2 |= 1618204824;
                                                                var2 *= -1985783353;
                                                                var2 -= -432347647;
                                                                var2 &= 313730503;
                                                                var2 ^= 1972529518;
                                                            }

                                                            s_2 var635 = new s_2(var521, var569, var584, var401, var353, var448);
                                                            r_2 var402 = this.A;
                                                            Hl var449 = Hl.PHYSICS;
                                                            int var522 = var3 + 1;
                                                            int var523 = var3 * var522;
                                                            int var540 = var3 + 2;
                                                            int var524 = var523 * var540;
                                                            int var541 = var3 + 3;
                                                            int var525 = var524 * var541;
                                                            int var526 = var525 & 7;
                                                            if (var526 != 0) {
                                                                var2 |= 1448789061;
                                                                var2 += -659284078;
                                                                var2 >>>= 5;
                                                                var2 ^= -906657955;
                                                            } else {
                                                                label605: {
                                                                    var2 = switch (var2) {
                                                                        case 847309371 -> var2 ^ 98495191;
                                                                        default -> var2 ^ 1026286391;
                                                                        case 1702915436 -> {
                                                                            var2 |= -189663711;
                                                                            var2 |= 732372010;
                                                                            yield var2 ^ -649169130;
                                                                        }
                                                                    };
                                                                    Integer var527 = var2;
                                                                    if (var527 == null) {
                                                                        break label553;
                                                                    }

                                                                    boolean var403 = var402.TJ(var449);
                                                                    if (var403) {
                                                                        var2 *= 821567681;
                                                                        var2 >>>= 4;
                                                                        var2 *= -876891999;
                                                                        var2 += -1640418191;
                                                                        var2 ^= -804822481;
                                                                        Integer var404 = var2;
                                                                        if (var404 == null) {
                                                                            break label553;
                                                                        }

                                                                        double var405 = var481.getY();
                                                                        float var482 = var481.getHeight();
                                                                        double var483 = var482;
                                                                        double var542 = var373.nextDouble(0.4, 0.9);
                                                                        double var484 = var483 * var542;
                                                                        double var406 = var405 + var484;
                                                                        var635.dT = var406;
                                                                        double var407 = var373.nextDouble(-1.6, 1.6);
                                                                        float var408 = (float)var407;
                                                                        var635.JH = var408;
                                                                        double var409 = var373.nextDouble(2.2, 4.2);
                                                                        float var410 = (float)var409;
                                                                        Integer var450 = var3;
                                                                        if (var450 == null) {
                                                                            var2 -= -164474465;
                                                                            var2 *= 247312477;
                                                                            var2 *= -254187493;
                                                                            var2 *= 566415277;
                                                                            var2 ^= -656850274;
                                                                            break label605;
                                                                        }

                                                                        var2 &= -2112560057;
                                                                        var2 |= -1244358143;
                                                                        var2 ^= -2057921795;
                                                                        var2 ^= 491525757;
                                                                        Integer var451 = var2;
                                                                        if (var451 == null) {
                                                                            break label553;
                                                                        }

                                                                        var635.L = var410;
                                                                        double var374 = var373.nextDouble(-1.6, 1.6);
                                                                        float var375 = (float)var374;
                                                                        var635.J = var375;
                                                                        var635.fu = true;
                                                                        var2 &= -1458519005;
                                                                        var2 >>>= 20;
                                                                        var2 ^= 1430121443;
                                                                        var2 ^= 857332376;
                                                                    } else {
                                                                        var2 &= 1009009577;
                                                                        var2 -= -307162367;
                                                                        var2 ^= 1347083971;
                                                                    }

                                                                    long var376 = var2;
                                                                    var7 = var376 + 1L;
                                                                    var7 = var376 * var7;
                                                                    var9 = var376 + 2L;
                                                                    var7 *= var9;
                                                                    long var377 = var376 + 3L;
                                                                    var7 *= var377;
                                                                    long var378 = var7 & 7L;
                                                                    long var726;
                                                                    var5 = (var726 = var378 - 0L) == 0L ? 0 : (var726 < 0L ? -1 : 1);
                                                                    if (var5 != 0) {
                                                                        break label553;
                                                                    }

                                                                    ArrayDeque var380 = this.SO;
                                                                    int var411 = var3 + 1;
                                                                    int var412 = var3 * var411;
                                                                    var3 = var412 & 1;
                                                                    if (var3 == 0) {
                                                                        var2 -= 1058156462;
                                                                        var2 ^= 2111252825;
                                                                        var6 = var2;
                                                                        var8 = var6 + 1L;
                                                                        var8 = var6 * var8;
                                                                        var6 = var8 & 1L;
                                                                        long var727;
                                                                        var3 = (var727 = var6 - 0L) == 0L ? 0 : (var727 < 0L ? -1 : 1);
                                                                        if (var3 == 0) {
                                                                            var380.addLast(var635);
                                                                            return;
                                                                        }
                                                                        break label553;
                                                                    }

                                                                    var2 &= 524741838;
                                                                    var2 ^= -847960080;
                                                                }
                                                            }
                                                        } else {
                                                            switch (var2) {
                                                                case -368080495:
                                                                default:
                                                                    var2 ^= 575209122;
                                                                    break;
                                                                case 256530274:
                                                                    var2 -= -13998759;
                                                                    var2 ^= -613485261;
                                                                    break;
                                                                case 611510847:
                                                                    var2 ^= -2129360862;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var2 &= 1534996751;
                                        var2 += -1026009632;
                                        var2 ^= 530154201;
                                    }
                                }
                            }
                        } else {
                            var2 <<= 31;
                            var2 += 1927138282;
                            var2 ^= -1179857712;
                        }
                    } else {
                        var2 *= -971908243;
                        var2 ^= 1484227943;
                    }
                } else {
                    var2 |= 845753841;
                    var2 ^= -1265092413;
                }
            } else {
                var2 -= -734739249;
                var2 ^= -208071805;
            }

            Integer var336 = var2;
            if (var336 != null) {
                IllegalStateException var338 = new IllegalStateException();
                throw var338;
            }
        }

        IllegalArgumentException var337 = new IllegalArgumentException();
        throw var337;
    }

    private static void e(s_2 var0, float var1, int var2) {
        label312: {
            int var156;
            label330: {
                int var4 = System.identityHashCode(var0);
                float var5 = var0.L;
                float var6 = 14.0F * var1;
                var5 -= var6;
                var0.L = var5;
                double var178 = var0.dT;
                float var7 = var0.L;
                var7 *= var1;
                double var209 = var7;
                double var179 = var178 + var209;
                double var210 = var0.jV;
                double var211 = Math.floor(var210);
                int var212 = (int)var211;
                double var8 = var0.Fh;
                var8 = Math.floor(var8);
                int var226 = (int)var8;
                float var9 = var0.L;
                float var347;
                int var242 = (var347 = var9 - 0.0F) == 0.0F ? 0 : (var347 < 0.0F ? -1 : 1);
                long var10 = var4;
                long var12 = var10 + 1L;
                var12 = var10 * var12;
                var10 = var12 & 1L;
                long var348;
                int var273 = (var348 = var10 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                label309:
                if (var273 == 0) {
                    var156 = switch (var2) {
                        case -611164377 -> {
                            var156 = var2 ^ -1518509829;
                            var156 -= -954653991;
                            var156 -= -1060093173;
                            var156 >>>= 23;
                            yield var156 ^ -867731108;
                        }
                        case 2076686106 -> var2 ^ 1601070558;
                        default -> var2 ^ 1001329254;
                    };
                    Integer var274 = var156;
                    if (var274 == null) {
                        break label312;
                    }

                    double var262;
                    if (var242 < 0) {
                        var156 = switch (var156) {
                            default -> var156 ^ -1682430592;
                            case -867731278 -> {
                                var156 <<= 30;
                                var156 <<= 13;
                                var156 &= -1861230520;
                                var156 |= -1398366926;
                                yield var156 ^ -375671553;
                            }
                            case 1629861171 -> var156 ^ -1047505857;
                        };
                        int var243 = var156 + 1;
                        int var244 = var156 * var243;
                        int var275 = var156 + 2;
                        int var245 = var244 * var275;
                        int var276 = var156 + 3;
                        int var246 = var245 * var276;
                        int var247 = var246 & 7;
                        if (var247 != 0) {
                            break label312;
                        }

                        double var248 = var179 - 0.05;
                        double var249 = Math.floor(var248);
                        int var250 = (int)var249;
                        double var277 = var0.dT;
                        double var278 = var277 - 0.05;
                        Integer var316 = var4;
                        if (var316 == null) {
                            var156 *= -1231565097;
                            var156 ^= 1236929977;
                            var156 ^= 633966484;
                            break label309;
                        }

                        var156 -= -658546891;
                        var156 += -555383156;
                        var156 += -1188903741;
                        var156 |= -1340301547;
                        var156 ^= -1097773777;
                        Integer var317 = var156;
                        if (var317 == null) {
                            break label312;
                        }

                        double var279 = Math.floor(var278);
                        int var280 = (int)var279;
                        if (var250 != var280) {
                            var156 &= 1590447932;
                            var156 += -1183344142;
                            var156 ^= -621837416;
                            var156 ^= 725936022;
                            int var251 = var156 + 1;
                            int var252 = var156 * var251;
                            int var253 = var252 & 1;
                            if (var253 != 0) {
                                break label312;
                            }

                            double var254 = var179 - 0.05;
                            Integer var11 = var4;
                            if (var11 == null) {
                                var156 <<= 14;
                                var156 ^= 1276842959;
                                var156 ^= -846888759;
                                break label309;
                            }

                            var156 ^= 1078758582;
                            var156 <<= 3;
                            var156 ^= -1926921174;
                            double var255 = Math.floor(var254);
                            int var256 = (int)var255;
                            boolean var257 = i_2.rZ(var212, var256, var226);
                            if (var257) {
                                var156 += 1327756325;
                                var156 |= -1290501369;
                                var156 *= 1891172073;
                                var156 ^= -552266147;
                                Integer var258 = var156;
                                if (var258 == null) {
                                    break label312;
                                }

                                double var259 = var179 - 0.05;
                                double var260 = Math.floor(var259);
                                var260++;
                                float var289 = var0.L;
                                int var318 = var4 + 1;
                                int var319 = var4 * var318;
                                int var320 = var319 & 1;
                                if (var320 != 0) {
                                    var156 += -1623484492;
                                    var156 ^= 920360536;
                                    break label309;
                                }

                                var156 ^= -1588246592;
                                var156 &= 407214161;
                                var156 ^= -1302934093;
                                float var290 = Math.abs(var289);
                                float var349;
                                int var291 = (var349 = var290 - 1.2F) == 0.0F ? 0 : (var349 < 0.0F ? -1 : 1);
                                float var293;
                                if (var291 < 0) {
                                    var156 = switch (var156) {
                                        default -> var156 ^ -1192740089;
                                        case -1441544717 -> {
                                            var156 -= -1023298528;
                                            yield var156 ^ 209015527;
                                        }
                                        case 2026080458 -> var156 ^ -1660999469;
                                    };
                                    Integer var292 = var156;
                                    if (var292 == null) {
                                        break label312;
                                    }

                                    var293 = 0.0F;
                                    var156 *= 1962241401;
                                    var156 ^= 852047879;
                                } else {
                                    var156 = switch (var156) {
                                        case -1441544717 -> {
                                            var156 -= 1555287133;
                                            yield var156 ^ 2111635678;
                                        }
                                        default -> var156 ^ -1076574005;
                                        case 672452520 -> var156 ^ -637210250;
                                    };
                                    float var321 = var0.L;
                                    float var322 = -var321;
                                    float var323 = var322 * 0.45F;
                                    long var13 = var4;
                                    long var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    var13 = var15 & 1L;
                                    long var350;
                                    int var328 = (var350 = var13 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                                    if (var328 != 0) {
                                        switch (var156) {
                                            case -1276273224:
                                            default:
                                                var156 ^= -1380550970;
                                                break label309;
                                            case 813889864:
                                                var156 -= 1981613160;
                                                var156 *= 26024243;
                                                var156 |= -222010668;
                                                var156 ^= 1497528818;
                                                break label309;
                                            case 2062724266:
                                                var156 ^= 1891881990;
                                                break label309;
                                        }
                                    }

                                    var156 &= -936058854;
                                    var156 |= -2132657589;
                                    var156 &= -1836057124;
                                    var156 ^= 2098969635;
                                    var13 = var156;
                                    var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    var13 = var15 & 1L;
                                    long var351;
                                    int var331 = (var351 = var13 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                    if (var331 != 0) {
                                        break label312;
                                    }

                                    var293 = var323;
                                    var156 *= 435585397;
                                    var156 <<= 2;
                                    var156 ^= 2139512847;
                                }

                                Integer var324 = var156;
                                if (var324 == null) {
                                    break label312;
                                }

                                var0.L = var293;
                                float var294 = var0.JH;
                                float var295 = var294 * 0.7F;
                                Integer var325 = var4;
                                if (var325 == null) {
                                    var156 -= -347609072;
                                    var156 *= -824097009;
                                    var156 ^= -1366866261;
                                    break label309;
                                }

                                var156 -= -497649859;
                                var156 ^= -853964228;
                                var156 >>>= 4;
                                var156 <<= 8;
                                var156 ^= 788038120;
                                var0.JH = var295;
                                float var296 = var0.J;
                                float var297 = var296 * 0.7F;
                                var0.J = var297;
                                var262 = var260;
                                var156 += 592016019;
                                var156 ^= -2053527102;
                                var156 ^= -207112945;
                            } else {
                                var156 = switch (var156) {
                                    case -1605047758 -> var156 ^ -232956012;
                                    default -> var156 ^ -1172954105;
                                    case 503587258 -> {
                                        var156 <<= 25;
                                        var156 >>= 13;
                                        var156 *= 1102221053;
                                        var156 |= -776235424;
                                        yield var156 ^ -464770330;
                                    }
                                };
                                var11 = var156;
                                if (var11 == null) {
                                    break label312;
                                }

                                var262 = var179;
                                var156 -= -1182611322;
                                var156 |= 577020341;
                                var156 ^= 1442509571;
                            }
                        } else {
                            var156 <<= 21;
                            var156 >>= 19;
                            var156 ^= 1544956499;
                            long var299 = var156;
                            long var332 = var299 + 1L;
                            var332 = var299 * var332;
                            long var345 = var299 + 2L;
                            var332 *= var345;
                            var299 += 3L;
                            var332 *= var299;
                            var299 = var332 & 7L;
                            long var352;
                            int var302 = (var352 = var299 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                            if (var302 != 0) {
                                break label312;
                            }

                            var262 = var179;
                            var156 <<= 9;
                            var156 ^= 63725750;
                        }
                    } else {
                        var156 = switch (var156) {
                            case -867731278 -> {
                                var156 -= 1540552358;
                                yield var156 ^ 1021867528;
                            }
                            default -> var156 ^ -1913827170;
                            case 1046550493 -> var156 ^ 1912886617;
                        };
                        long var303 = var156;
                        long var336 = var303 + 1L;
                        var336 = var303 * var336;
                        long var346 = var303 + 2L;
                        var336 *= var346;
                        var303 += 3L;
                        var336 *= var303;
                        var303 = var336 & 7L;
                        long var353;
                        int var306 = (var353 = var303 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                        if (var306 != 0) {
                            break label312;
                        }

                        var262 = var179;
                        var156 *= 416520857;
                        var156 *= 753108403;
                        var156 |= 1118692039;
                        var156 += 1380432850;
                        var156 ^= 511420791;
                    }

                    var0.dT = var262;
                    double var180 = var0.dT;
                    double var181 = Math.floor(var180);
                    int var182 = (int)var181;
                    double var263 = var0.jV;
                    var6 = var0.JH;
                    var6 *= var1;
                    Integer var307 = var4;
                    if (var307 == null) {
                        switch (var156) {
                            case -1021867556:
                            default:
                                var156 ^= 2002476364;
                                break;
                            case 797836982:
                                var156 += -1814337910;
                                var156 ^= 1828126278;
                                break;
                            case 1690775819:
                                var156 ^= -1088684406;
                        }
                    } else {
                        label359: {
                            var156 &= 1745432566;
                            var156 *= -974829223;
                            var156 += 878961366;
                            var156 ^= -390868759;
                            var307 = var156;
                            if (var307 == null) {
                                break label312;
                            }

                            label302: {
                                double var309 = var6;
                                double var264 = var263 + var309;
                                double var310 = Math.floor(var264);
                                int var188 = (int)var310;
                                if (var188 != var212) {
                                    var156 &= 696301886;
                                    var156 -= 407375701;
                                    var156 *= 1581973325;
                                    var156 ^= 654536102;
                                    int var189 = var156 + 1;
                                    int var190 = var156 * var189;
                                    int var213 = var156 + 2;
                                    int var191 = var190 * var213;
                                    int var214 = var156 + 3;
                                    int var192 = var191 * var214;
                                    int var193 = var192 & 7;
                                    if (var193 != 0) {
                                        break label312;
                                    }

                                    double var194 = Math.floor(var264);
                                    int var195 = (int)var194;
                                    boolean var196 = i_2.rZ(var195, var182, var226);
                                    Integer var215 = var4;
                                    if (var215 == null) {
                                        var156 -= 2116565302;
                                        var156 |= 1778271166;
                                        var156 ^= -798930695;
                                        break label359;
                                    }

                                    var156 -= -242475282;
                                    var156 &= -900602582;
                                    var156 -= 610026618;
                                    var156 ^= -356430175;
                                    int var216 = var156 + 1;
                                    int var217 = var156 * var216;
                                    int var311 = var156 + 2;
                                    int var218 = var217 * var311;
                                    var311 = var156 + 3;
                                    int var219 = var218 * var311;
                                    int var220 = var219 & 7;
                                    if (var220 != 0) {
                                        break label312;
                                    }

                                    if (var196) {
                                        var156 -= 257998166;
                                        var156 <<= 7;
                                        var156 ^= 651639496;
                                        var156 |= 1505179783;
                                        var156 ^= 602516822;
                                        Integer var197 = var156;
                                        if (var197 == null) {
                                            break label312;
                                        }

                                        var6 = var0.JH;
                                        long var313 = var4;
                                        long var340 = var313 + 1L;
                                        var340 = var313 * var340;
                                        long var314 = var340 & 1L;
                                        long var354;
                                        int var221 = (var354 = var314 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                                        if (var221 != 0) {
                                            switch (var156) {
                                                case -1325451320:
                                                default:
                                                    var156 ^= 1941423283;
                                                    break label359;
                                                case -32090471:
                                                    var156 -= -1824739403;
                                                    var156 ^= -985254430;
                                                    break label359;
                                                case 1922390756:
                                                    var156 ^= 572828011;
                                                    break label359;
                                            }
                                        }
                                        var156 = switch (var156) {
                                            case -32090471 -> {
                                                var156 -= 1346343841;
                                                var156 *= 1539536953;
                                                yield var156 ^ 2038724592;
                                            }
                                            case 848270606 -> var156 ^ 1039228971;
                                            default -> var156 ^ 1795908008;
                                        };
                                        Integer var222 = var156;
                                        if (var222 == null) {
                                            break label312;
                                        }

                                        var6 = -var6;
                                        var6 *= 0.5F;
                                        var0.JH = var6;
                                        var156 *= 1411239611;
                                        var156 ^= 1164795782;
                                        break label302;
                                    }

                                    var156 &= 1980263615;
                                    var156 += -1378688682;
                                    var156 ^= -1446176466;
                                } else {
                                    var156 |= -726667440;
                                    var156 += -1279275266;
                                    var156 += 927296952;
                                    var156 ^= -1860497158;
                                }

                                var0.jV = var264;
                                var156 ^= 1027913782;
                                var156 |= -1772764837;
                                var156 <<= 10;
                                var156 ^= 32750360;
                                var156 ^= 1608103046;
                            }

                            int var201 = var156 + 1;
                            int var202 = var156 * var201;
                            int var223 = var156 + 2;
                            int var203 = var202 * var223;
                            int var224 = var156 + 3;
                            int var204 = var203 * var224;
                            int var205 = var204 & 7;
                            if (var205 != 0) {
                                break label312;
                            }

                            double var206 = var0.Fh;
                            var9 = var0.J;
                            var9 *= var1;
                            Integer var281 = var4;
                            if (var281 != null) {
                                var156 >>= 4;
                                var156 ^= -725700566;
                                Integer var282 = var156;
                                if (var282 == null) {
                                    break label312;
                                }

                                double var267 = var9;
                                double var207 = var206 + var267;
                                double var268 = Math.floor(var207);
                                int var269 = (int)var268;
                                if (var269 != var226) {
                                    var156 >>= 22;
                                    var156 &= -1630120030;
                                    var156 -= 2088202473;
                                    var156 += -211001775;
                                    var156 ^= 1837356658;
                                    Integer var227 = var156;
                                    if (var227 == null) {
                                        break label312;
                                    }

                                    var8 = var0.jV;
                                    var8 = Math.floor(var8);
                                    int var230 = (int)var8;
                                    double var270 = Math.floor(var207);
                                    int var271 = (int)var270;
                                    boolean var183 = i_2.rZ(var230, var182, var271);
                                    long var231 = var4;
                                    var10 = var231 + 1L;
                                    var10 = var231 * var10;
                                    var12 = var231 + 2L;
                                    var10 *= var12;
                                    long var232 = var231 + 3L;
                                    var10 *= var232;
                                    long var233 = var10 & 7L;
                                    long var355;
                                    int var234 = (var355 = var233 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                                    if (var234 != 0) {
                                        var156 -= 795137371;
                                        var156 ^= -411291717;
                                        break label359;
                                    }
                                    var156 = switch (var156) {
                                        default -> var156 ^ 827772897;
                                        case 1844935556 -> var156 ^ -273177841;
                                        case 2018021912 -> {
                                            var156 >>>= 29;
                                            var156 &= -1327342232;
                                            var156 &= -1589424600;
                                            yield var156 ^ -408461830;
                                        }
                                    };
                                    int var235 = var156 + 1;
                                    int var236 = var156 * var235;
                                    int var237 = var236 & 1;
                                    if (var237 != 0) {
                                        break label312;
                                    }

                                    if (var183) {
                                        var156 <<= 11;
                                        var156 ^= 829897789;
                                        long var238 = var156;
                                        var10 = var238 + 1L;
                                        var10 = var238 * var10;
                                        long var239 = var10 & 1L;
                                        long var356;
                                        int var184 = (var356 = var239 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                                        if (var184 != 0) {
                                            break label312;
                                        }

                                        var5 = var0.J;
                                        Integer var169 = var4;
                                        if (var169 != null) {
                                            var156 = switch (var156) {
                                                default -> var156 ^ 1939073236;
                                                case 194571325 -> {
                                                    var156 *= -629383145;
                                                    yield var156 ^ 248171242;
                                                }
                                                case 1096119228 -> var156 ^ -1153490757;
                                            };
                                            var169 = var156;
                                            if (var169 == null) {
                                                break label312;
                                            }

                                            float var171 = -var5;
                                            float var172 = var171 * 0.5F;
                                            var0.J = var172;
                                            switch (var156) {
                                                case -869608559:
                                                    var156 += -2059256147;
                                                    var156 ^= -298052732;
                                                    break label330;
                                                case 10737219:
                                                    var156 ^= 1248564886;
                                                    break label330;
                                                case 1744763012:
                                                default:
                                                    var156 ^= 1654346806;
                                                    break label330;
                                            }
                                        }

                                        var156 += -926182211;
                                        var156 &= -288118388;
                                        var156 += 1187072270;
                                        var156 &= 2086676990;
                                        var156 ^= -1482712432;
                                        break label359;
                                    }

                                    switch (var156) {
                                        case -845032349:
                                            var156 ^= 1782994292;
                                            break;
                                        case -408461830:
                                            var156 >>>= 7;
                                            var156 += 1784681614;
                                            var156 >>= 9;
                                            var156 >>>= 26;
                                            var156 ^= -261930390;
                                            break;
                                        case 846082527:
                                        default:
                                            var156 ^= 1691109705;
                                    }
                                } else {
                                    var156 += 246770893;
                                    var156 ^= -1838965994;
                                    var156 ^= -2023595364;
                                }

                                long var173 = var156;
                                long var240 = var173 + 1L;
                                long var241 = var173 * var240;
                                long var174 = var241 & 1L;
                                long var357;
                                var4 = (var357 = var174 - 0L) == 0L ? 0 : (var357 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label312;
                                }

                                var0.Fh = var207;
                                var156 ^= -266491509;
                                var156 ^= -2093151892;
                                var156 -= -372003664;
                                var156 += 17583216;
                                var156 ^= 623739895;
                                break label330;
                            } else {
                                switch (var156) {
                                    case -163202173:
                                        var156 ^= 227126484;
                                        break;
                                    case 557839262:
                                        var156 += 1442890486;
                                        var156 ^= -656464494;
                                        break;
                                    case 969690594:
                                    default:
                                        var156 ^= -462733450;
                                }
                            }
                        }
                    }
                } else {
                    var156 = var2 + 831817112;
                    var156 <<= 11;
                    var156 ^= -2067673672;
                    var156 ^= 477865662;
                }

                Integer var166 = var156;
                if (var166 != null) {
                    UnsupportedOperationException var167 = new UnsupportedOperationException();
                    throw var167;
                }
                break label312;
            }

            Integer var176 = var156;
            if (var176 != null) {
                return;
            }
        }

        RuntimeException var168 = new RuntimeException();
        throw var168;
    }

    private static String Fn(float var0, int var1) {
        String var68 = null;
        label83: {
            int var3 = (int)var0;
            float var101;
            int var4 = (var101 = var0 - 10.0F) == 0.0F ? 0 : (var101 < 0.0F ? -1 : 1);
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            int var31;
            if (var5 != 0) {
                var31 = var1 | 795205473;
                var31 *= 2005309287;
                var31 ^= 879161106;
            } else {
                label82: {
                    var31 = var1 >>> 1;
                    var31 ^= 1741479942;
                    Integer var71 = var31;
                    if (var71 == null) {
                        break label83;
                    }

                    label79: {
                        if (var4 < 0) {
                            var31 ^= -176777903;
                            var31 *= -1008516099;
                            var31 ^= 1483819760;
                            var31 ^= -1449099396;
                            var4 = Math.round(var0);
                            float var62 = var4;
                            float var63 = var0 - var62;
                            float var64 = Math.abs(var63);
                            var71 = var3;
                            if (var71 == null) {
                                var31 |= 2109764006;
                                var31 ^= -2088684131;
                                break label82;
                            }

                            var31 ^= 64189025;
                            var31 &= 981314374;
                            var31 -= -671876829;
                            var31 |= -1958233251;
                            var31 ^= -1547650126;
                            float var102;
                            var4 = (var102 = var64 - 0.05F) == 0.0F ? 0 : (var102 < 0.0F ? -1 : 1);
                            if (var4 >= 0) {
                                var31 ^= -898111175;
                                var31 ^= -1766624346;
                                Locale var66 = Locale.ROOT;
                                Object[] var73 = new Object[1];
                                Float var6 = var0;
                                var73[0] = var6;
                                String var67 = String.format(var66, "%.1f", var73);
                                long var74 = var3;
                                long var7 = var74 + 1L;
                                var7 = var74 * var7;
                                long var9 = var74 + 2L;
                                var7 *= var9;
                                long var75 = var74 + 3L;
                                var7 *= var75;
                                long var76 = var7 & 7L;
                                long var103;
                                int var77 = (var103 = var76 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                                if (var77 != 0) {
                                    switch (var31) {
                                        case -178822028:
                                        default:
                                            var31 ^= 213929442;
                                            break label82;
                                        case 610507504:
                                            var31 += -501891185;
                                            var31 ^= -130214372;
                                            break label82;
                                        case 1612284643:
                                            var31 ^= -237667519;
                                            break label82;
                                    }
                                }
                                var31 = switch (var31) {
                                    default -> var31 ^ -1041893164;
                                    case 610507504 -> {
                                        var31 *= -1260742525;
                                        var31 += 812546428;
                                        yield var31 ^ -562602641;
                                    }
                                    case 1678139693 -> var31 ^ -68620078;
                                };
                                var68 = var67;
                                var31 |= 176077208;
                                var31 ^= -2129430895;
                                break label79;
                            }

                            var31 &= -42351112;
                            var31 ^= 1892181729;
                        } else {
                            var31 += -471556263;
                            var31 |= 1725100402;
                            var31 |= 1730027287;
                            var31 *= -347863667;
                            var31 ^= 191190394;
                        }

                        long var78 = var31;
                        long var93 = var78 + 1L;
                        var93 = var78 * var93;
                        long var100 = var78 + 2L;
                        var93 *= var100;
                        long var79 = var78 + 3L;
                        var93 *= var79;
                        long var80 = var93 & 7L;
                        long var104;
                        int var81 = (var104 = var80 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var81 != 0) {
                            break label83;
                        }

                        var81 = Math.round(var0);
                        long var85 = var3;
                        long var8 = var85 + 1L;
                        var8 = var85 * var8;
                        long var10 = var85 + 2L;
                        var8 *= var10;
                        var85 += 3L;
                        var8 *= var85;
                        var85 = var8 & 7L;
                        long var105;
                        var3 = (var105 = var85 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                        if (var3 != 0) {
                            var31 *= -802828661;
                            var31 ^= 927835648;
                            break label82;
                        }

                        var31 |= 1365922914;
                        var31 |= 1319867463;
                        var31 ^= -2031702331;
                        var3 = var31 + 1;
                        var3 = var31 * var3;
                        int var88 = var31 + 2;
                        var3 *= var88;
                        int var89 = var31 + 3;
                        var3 *= var89;
                        var3 &= 7;
                        if (var3 != 0) {
                            break label83;
                        }

                        String var58 = Integer.toString(var81);
                        var68 = var58;
                        var31 ^= 29233437;
                        var31 >>>= 11;
                        var31 ^= 402063475;
                        var31 ^= 200443127;
                        var31 ^= -487367737;
                    }

                    long var45 = var31;
                    long var83 = var45 + 1L;
                    long var84 = var45 * var83;
                    long var46 = var84 & 1L;
                    long var106;
                    var31 = (var106 = var46 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var31 == 0) {
                        return var68;
                    }
                    break label83;
                }
            }

            Integer var59 = var31;
            if (var59 != null) {
                AssertionError var60 = new AssertionError();
                throw var60;
            }
        }

        UnsupportedOperationException var51 = new UnsupportedOperationException();
        throw var51;
    }

    private void G(T var1) {
        label396: {
            int var2 = l;
            var2 ^= 410850646;
            int var3 = System.identityHashCode(this);
            RenderPhase var4 = var1.phase();
            RenderPhase var5 = RenderPhase.UNDERLAY;
            Integer var6 = var3;
            if (var6 == null) {
                switch (var2) {
                    case -2047623198:
                        var2 ^= 731332661;
                        break;
                    case -419447692:
                    default:
                        var2 ^= 899500959;
                        break;
                    case 1580529971:
                        var2 += 240197117;
                        var2 -= 1234276351;
                        var2 |= 309831293;
                        var2 >>>= 30;
                        var2 ^= -474068800;
                }
            } else {
                label395: {
                    var2 |= 112830155;
                    var2 ^= -3898599;
                    var2 >>>= 24;
                    var2 ^= -1682518539;
                    if (var4 == var5) {
                        var2 *= 1098832575;
                        var2 &= 1528400219;
                        var2 += -858644067;
                        var2 *= 976979657;
                        var2 ^= -1142195127;
                        long var244 = var2;
                        long var265 = var244 + 1L;
                        long var266 = var244 * var265;
                        long var245 = var266 & 1L;
                        long var515;
                        int var246 = (var515 = var245 - 0L) == 0L ? 0 : (var515 < 0L ? -1 : 1);
                        if (var246 != 0) {
                            break label396;
                        }

                        ArrayDeque var247 = this.SO;
                        int var257 = var3 + 1;
                        int var258 = var3 * var257;
                        int var259 = var258 & 1;
                        if (var259 != 0) {
                            var2 ^= 406046411;
                            var2 *= -193642665;
                            var2 -= 1115494134;
                            var2 &= -11770757;
                            var2 ^= -1514795805;
                            break label395;
                        }

                        var2 ^= -1232101165;
                        var2 += 225701449;
                        var2 ^= -496852806;
                        Integer var260 = var2;
                        if (var260 == null) {
                            break label396;
                        }

                        boolean var248 = var247.isEmpty();
                        if (!var248) {
                            var2 &= -1046775960;
                            var2 += 1440997175;
                            var2 ^= -693938163;
                            Ud var249 = Ud.Z();
                            AuraPipeline var250 = var249.Ul();
                            Projection var251 = var250.projection();
                            Projection var252 = var251;
                            Canvas var261 = var1.canvas();
                            Canvas var262 = var261;
                            Uq var267 = this.x;
                            long var7 = var3;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var516;
                            int var273 = (var516 = var7 - 0L) == 0L ? 0 : (var516 < 0L ? -1 : 1);
                            if (var273 != 0) {
                                var2 += -1824025335;
                                var2 ^= 848514740;
                                var2 ^= -691018797;
                                var2 ^= -1812915492;
                                break label395;
                            } else {
                                var2 -= -1609422900;
                                var2 ^= -403189929;
                                var2 |= -1748093775;
                                var2 ^= 256441986;
                                Integer var274 = var2;
                                if (var274 == null) {
                                    break label396;
                                }

                                float var268 = var267.WM();
                                float var269 = var268;
                                FrameContext var275 = var1.frame();
                                float var276 = var275.dt();
                                float var277 = var276;
                                ArrayDeque var8 = this.SO;
                                Iterator var278 = var8.iterator();
                                Iterator var279 = var278;
                                var2 *= -1206323755;
                                var2 |= 453671154;
                                var2 ^= -656538600;

                                while (true) {
                                    Integer var283 = var2;
                                    if (var283 == null) {
                                        break label396;
                                    }

                                    boolean var284 = var279.hasNext();
                                    long var10 = var3;
                                    long var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    long var14 = var10 + 2L;
                                    var12 *= var14;
                                    var10 += 3L;
                                    var12 *= var10;
                                    var10 = var12 & 7L;
                                    long var517;
                                    int var295 = (var517 = var10 - 0L) == 0L ? 0 : (var517 < 0L ? -1 : 1);
                                    if (var295 != 0) {
                                        var2 *= -136703405;
                                        var2 >>= 21;
                                        var2 -= 436439499;
                                        var2 <<= 19;
                                        var2 ^= 1552304320;
                                        break label395;
                                    }
                                    var2 = switch (var2) {
                                        case -2026604057 -> {
                                            var2 >>>= 7;
                                            var2 ^= 838992529;
                                            var2 += -1080351941;
                                            yield var2 ^ 1292604402;
                                        }
                                        default -> var2 ^ -1812003334;
                                        case 1794176806 -> var2 ^ 1671963568;
                                    };
                                    var10 = var2;
                                    var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    var10 = var12 & 1L;
                                    long var518;
                                    int var298 = (var518 = var10 - 0L) == 0L ? 0 : (var518 < 0L ? -1 : 1);
                                    if (var298 != 0) {
                                        break label396;
                                    }

                                    if (!var284) {
                                        long var239 = switch (var2) {
                                            case -1832352767 -> var2 ^ 2134461017;
                                            default -> var2 ^ 1971994543;
                                            case -1079239057 -> {
                                                var2 -= 271511975;
                                                var2 ^= -807388465;
                                                yield var2 ^ -1081385683;
                                            }
                                        };
                                        long var263 = var239 + 1L;
                                        long var264 = var239 * var263;
                                        long var240 = var264 & 1L;
                                        long var519;
                                        var3 = (var519 = var240 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                                        if (var3 == 0) {
                                            return;
                                        }
                                        break label396;
                                    }

                                    var2 &= 556351887;
                                    var2 -= -827083181;
                                    var2 *= 23124849;
                                    var2 ^= -1921853702;
                                    var9 = var2;
                                    var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    long var13 = var9 + 2L;
                                    var11 *= var13;
                                    var9 += 3L;
                                    var11 *= var9;
                                    var9 = var11 & 7L;
                                    long var520;
                                    int var288 = (var520 = var9 - 0L) == 0L ? 0 : (var520 < 0L ? -1 : 1);
                                    if (var288 != 0) {
                                        break label396;
                                    }

                                    Object var289 = var279.next();
                                    s_2 var290 = (s_2)var289;
                                    float var299 = var290.N;
                                    float var300 = var299 + var277;
                                    var290.N = var300;
                                    int var301 = var3 + 1;
                                    int var302 = var3 * var301;
                                    int var317 = var3 + 2;
                                    int var303 = var302 * var317;
                                    int var318 = var3 + 3;
                                    int var304 = var303 * var318;
                                    int var305 = var304 & 7;
                                    if (var305 != 0) {
                                        var2 &= 1343029259;
                                        var2 ^= -1763434419;
                                        var2 ^= 894593167;
                                        break label395;
                                    }

                                    var2 &= -225035363;
                                    var2 *= -320396339;
                                    var2 ^= 526424098;
                                    var2 ^= 1258714619;
                                    Integer var306 = var2;
                                    if (var306 == null) {
                                        break label396;
                                    }

                                    float var307 = var290.N;
                                    float var308 = var307 / var269;
                                    float var521;
                                    int var319 = (var521 = var308 - 1.0F) == 0.0F ? 0 : (var521 < 0.0F ? -1 : 1);
                                    if (var319 >= 0) {
                                        var2 = switch (var2) {
                                            case -861001235 -> {
                                                var2 *= -161085201;
                                                var2 -= 1259071790;
                                                yield var2 ^ -1924008310;
                                            }
                                            case -692737167 -> var2 ^ -428181030;
                                            default -> var2 ^ 1064904221;
                                        };
                                        int var320 = var2 + 1;
                                        int var321 = var2 * var320;
                                        int var322 = var321 & 1;
                                        if (var322 != 0) {
                                            break label396;
                                        }

                                        var279.remove();
                                        var2 >>= 26;
                                        var2 ^= 1681526304;
                                        var2 ^= 1355142242;
                                        var2 ^= -1278499923;
                                    } else {
                                        var2 *= 874144719;
                                        var2 &= -281716765;
                                        var2 ^= 1798708592;
                                        var2 ^= -2049734368;
                                        boolean var323 = var290.fu;
                                        var12 = var3;
                                        var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        long var16 = var12 + 2L;
                                        var14 *= var16;
                                        var12 += 3L;
                                        var14 *= var12;
                                        var12 = var14 & 7L;
                                        long var522;
                                        int var362 = (var522 = var12 - 0L) == 0L ? 0 : (var522 < 0L ? -1 : 1);
                                        if (var362 != 0) {
                                            switch (var2) {
                                                case -1343122957:
                                                    var2 >>= 4;
                                                    var2 <<= 26;
                                                    var2 ^= -1614919488;
                                                    break label395;
                                                case -1223829201:
                                                    var2 ^= 1039548180;
                                                    break label395;
                                                case -633419628:
                                                default:
                                                    var2 ^= -305875048;
                                                    break label395;
                                            }
                                        }
                                        var2 = switch (var2) {
                                            case -1343122957 -> {
                                                var2 &= -2068499766;
                                                var2 |= 1477399627;
                                                yield var2 ^ 374788880;
                                            }
                                            case -555775812 -> var2 ^ -773006128;
                                            default -> var2 ^ 186333850;
                                        };
                                        Integer var363 = var2;
                                        if (var363 == null) {
                                            break label396;
                                        }

                                        if (var323) {
                                            var2 &= 2120721289;
                                            var2 ^= 842906526;
                                            float var324 = Math.min(var277, 0.1F);
                                            int var364 = var3 + 1;
                                            int var365 = var3 * var364;
                                            int var366 = var365 & 1;
                                            if (var366 != 0) {
                                                var2 -= 1176160824;
                                                var2 *= 207560133;
                                                var2 ^= -1405974693;
                                                break label395;
                                            }
                                            var2 = switch (var2) {
                                                case -326794135 -> var2 ^ 1859379413;
                                                default -> var2 ^ -1743880702;
                                                case 2019309591 -> {
                                                    var2 >>= 2;
                                                    var2 += -379972456;
                                                    yield var2 ^ -311198677;
                                                }
                                            };
                                            Integer var367 = var2;
                                            if (var367 == null) {
                                                break label396;
                                            }

                                            int var368 = var2 | -1038320060;
                                            int var369 = var368 * 1435116311;
                                            int var370 = var369 & 863526383;
                                            int var371 = var370 ^ -912107731;
                                            e(var290, var324, var371);
                                            var2 ^= 397783740;
                                            var2 ^= -428191747;
                                        } else {
                                            switch (var2) {
                                                case -1169897687:
                                                default:
                                                    var2 ^= 2056565935;
                                                    break;
                                                case -890664997:
                                                    var2 += -100891913;
                                                    var2 -= 1108446418;
                                                    var2 <<= 10;
                                                    var2 ^= 1245029367;
                                                    break;
                                                case -406022038:
                                                    var2 ^= 447393825;
                                            }
                                        }

                                        int var325 = var2 + 1;
                                        int var326 = var2 * var325;
                                        int var327 = var326 & 1;
                                        if (var327 != 0) {
                                            break label396;
                                        }

                                        FrameContext var328 = var1.frame();
                                        int var372 = var3 + 1;
                                        int var373 = var3 * var372;
                                        int var407 = var3 + 2;
                                        int var374 = var373 * var407;
                                        int var408 = var3 + 3;
                                        int var375 = var374 * var408;
                                        int var376 = var375 & 7;
                                        if (var376 != 0) {
                                            var2 |= -1367598517;
                                            var2 ^= 1547957055;
                                            break label395;
                                        }
                                        var2 = switch (var2) {
                                            case 229975176 -> var2 ^ 1416841317;
                                            default -> var2 ^ -323753218;
                                            case 466461687 -> {
                                                var2 ^= -88469798;
                                                var2 += -904060434;
                                                var2 |= -48058935;
                                                yield var2 ^ -1314716306;
                                            }
                                        };
                                        Integer var377 = var2;
                                        if (var377 == null) {
                                            break label396;
                                        }

                                        boolean var329 = var328.hideGui();
                                        if (var329) {
                                            var2 *= -1377706891;
                                            var2 *= -307470205;
                                            var2 |= -1917874451;
                                            var2 ^= 498699490;
                                            var11 = var2;
                                            var13 = var11 + 1L;
                                            var13 = var11 * var13;
                                            long var15 = var11 + 2L;
                                            var13 *= var15;
                                            var11 += 3L;
                                            var13 *= var11;
                                            var11 = var13 & 7L;
                                            long var523;
                                            int var333 = (var523 = var11 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                                            if (var333 != 0) {
                                                break label396;
                                            }

                                            var2 -= -655517889;
                                            var2 -= 1044839896;
                                            var2 ^= -300550895;
                                        } else {
                                            var2 = switch (var2) {
                                                case -1572112059 -> var2 ^ -1430391629;
                                                default -> var2 ^ 2106834284;
                                                case 1310059189 -> {
                                                    var2 -= 260663581;
                                                    yield var2 ^ 2093640168;
                                                }
                                            };
                                            int var334 = var2 + 1;
                                            int var335 = var2 * var334;
                                            int var378 = var2 + 2;
                                            int var336 = var335 * var378;
                                            int var379 = var2 + 3;
                                            int var337 = var336 * var379;
                                            int var338 = var337 & 7;
                                            if (var338 != 0) {
                                                break label396;
                                            }

                                            boolean var339 = var290.fu;
                                            int var380 = var3 + 1;
                                            int var381 = var3 * var380;
                                            int var413 = var3 + 2;
                                            int var382 = var381 * var413;
                                            int var414 = var3 + 3;
                                            int var383 = var382 * var414;
                                            int var384 = var383 & 7;
                                            if (var384 != 0) {
                                                var2 ^= -2122886013;
                                                var2 ^= 546305075;
                                                break label395;
                                            }

                                            var2 ^= -1146800972;
                                            var2 += 1453418876;
                                            var2 ^= -796029786;
                                            var2 ^= -2549078;
                                            Integer var385 = var2;
                                            if (var385 == null) {
                                                break label396;
                                            }

                                            double var340;
                                            if (var339) {
                                                var2 = switch (var2) {
                                                    case 972056696 -> var2 ^ -1164930448;
                                                    default -> var2 ^ 553841338;
                                                    case 2144456780 -> {
                                                        var2 |= -1796190597;
                                                        var2 &= 49286573;
                                                        var2 -= -1823218579;
                                                        yield var2 ^ -1342676393;
                                                    }
                                                };
                                                var340 = 0.0;
                                                switch (var2) {
                                                    case -1067170409:
                                                        var2 += 29318420;
                                                        var2 += -709761695;
                                                        var2 ^= -775750058;
                                                        var2 &= -1803779739;
                                                        var2 ^= -466857902;
                                                        break;
                                                    case 298590847:
                                                    default:
                                                        var2 ^= -663630848;
                                                        break;
                                                    case 2090867654:
                                                        var2 ^= 1487041377;
                                                }
                                            } else {
                                                var2 >>= 9;
                                                var2 ^= -2073533494;
                                                var13 = var2;
                                                long var475 = var13 + 1L;
                                                var475 = var13 * var475;
                                                long var17 = var13 + 2L;
                                                var475 *= var17;
                                                var13 += 3L;
                                                var475 *= var13;
                                                var13 = var475 & 7L;
                                                long var524;
                                                int var418 = (var524 = var13 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                                                if (var418 != 0) {
                                                    break label396;
                                                }

                                                Lv var419 = sT_2.aO;
                                                float var420 = var419.l(var308);
                                                double var421 = var420;
                                                Integer var479 = var3;
                                                if (var479 == null) {
                                                    var2 += -1544074213;
                                                    var2 &= 335079842;
                                                    var2 ^= -470382112;
                                                    break label395;
                                                }

                                                var2 += -116124410;
                                                var2 += 1056373809;
                                                var2 *= 1449344125;
                                                var2 ^= -2016747671;
                                                var2 ^= -1775212327;
                                                double var422 = 0.32 * var421;
                                                var340 = var422;
                                                var2 ^= 338220160;
                                                var2 += 1748105393;
                                                var2 ^= 959322340;
                                            }

                                            double var423 = var290.jV;
                                            double var480 = var290.dT;
                                            long var497 = var3;
                                            long var19 = var497 + 1L;
                                            var19 = var497 * var19;
                                            long var21 = var497 + 2L;
                                            var19 *= var21;
                                            var497 += 3L;
                                            var19 *= var497;
                                            var497 = var19 & 7L;
                                            long var525;
                                            int var500 = (var525 = var497 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                                            if (var500 != 0) {
                                                var2 |= -1964172347;
                                                var2 &= 717584601;
                                                var2 &= 778831345;
                                                var2 >>>= 28;
                                                var2 ^= -474068798;
                                                break label395;
                                            }

                                            var2 += -1517055334;
                                            var2 <<= 20;
                                            var2 ^= -1766344420;
                                            Integer var501 = var2;
                                            if (var501 == null) {
                                                break label396;
                                            }

                                            double var341 = var480 + var340;
                                            var480 = var290.Fh;
                                            float var502 = var262.width();
                                            float var18 = var262.height();
                                            float[] var513 = this.uI;
                                            boolean var342 = var252.toScreen(var423, var341, var480, var502, var18, var513);
                                            if (!var342) {
                                                var2 ^= -173065617;
                                                var2 ^= 1180744234;
                                                var11 = var2;
                                                var13 = var11 + 1L;
                                                var13 = var11 * var13;
                                                var11 = var13 & 1L;
                                                long var526;
                                                int var345 = (var526 = var11 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                                if (var345 != 0) {
                                                    break label396;
                                                }

                                                var2 -= -112691634;
                                                var2 -= 289589355;
                                                var2 &= 1022466058;
                                                var2 -= -2138070314;
                                                var2 ^= 77892813;
                                            } else {
                                                var2 |= 311940420;
                                                var2 -= -1193770401;
                                                var2 -= 1050150099;
                                                var2 ^= -1343721904;
                                                Integer var346 = var2;
                                                if (var346 == null) {
                                                    break label396;
                                                }

                                                LH var347 = s;
                                                float var386 = var290.N;
                                                float var348 = var347.u(var386);
                                                Uq var387 = this.rC;
                                                float var388 = var387.WM();
                                                float var349 = var348 * var388;
                                                Integer var389 = var3;
                                                if (var389 == null) {
                                                    var2 >>>= 24;
                                                    var2 += 909136493;
                                                    var2 ^= -712107499;
                                                    break label395;
                                                }
                                                var2 = switch (var2) {
                                                    case -1567290720 -> var2 ^ 342633827;
                                                    default -> var2 ^ -1507183663;
                                                    case 1752111226 -> {
                                                        var2 >>= 22;
                                                        var2 |= -1628012684;
                                                        var2 >>>= 19;
                                                        yield var2 ^ -432604574;
                                                    }
                                                };
                                                int var390 = var2 + 1;
                                                int var391 = var2 * var390;
                                                int var426 = var2 + 2;
                                                int var392 = var391 * var426;
                                                int var427 = var2 + 3;
                                                int var393 = var392 * var427;
                                                int var394 = var393 & 7;
                                                if (var394 != 0) {
                                                    break label396;
                                                }

                                                boolean var395 = var290.A;
                                                float var396;
                                                if (var395) {
                                                    var2 = switch (var2) {
                                                        case -432608836 -> {
                                                            var2 *= 338710651;
                                                            var2 >>>= 9;
                                                            var2 -= -2062487108;
                                                            yield var2 ^ -1704385473;
                                                        }
                                                        case 1142544974 -> var2 ^ 1353666261;
                                                        default -> var2 ^ 478428533;
                                                    };
                                                    var396 = 1.12F;
                                                    var2 &= -625703332;
                                                    var2 >>>= 6;
                                                    var2 ^= -2094230288;
                                                } else {
                                                    var2 &= -416391372;
                                                    var2 ^= 641178286;
                                                    var2 += 2039018275;
                                                    var2 ^= -1782833038;
                                                    var2 ^= -506478189;
                                                    int var428 = var2 + 1;
                                                    int var429 = var2 * var428;
                                                    int var430 = var429 & 1;
                                                    if (var430 != 0) {
                                                        break label396;
                                                    }

                                                    var396 = 1.0F;
                                                    var2 ^= 1099977742;
                                                    var2 ^= 1092163284;
                                                    var2 &= 206929486;
                                                    var2 ^= -1939066633;
                                                }

                                                float var350 = var349 * var396;
                                                LH var397 = yZ;
                                                float var309 = var397.u(var308);
                                                float var310 = TP.S(var309);
                                                float var398 = 8.5F * var350;
                                                int var431 = var290.E;
                                                int var432 = DP.nq(var431, var310);
                                                Integer var456 = var3;
                                                if (var456 == null) {
                                                    var2 += 1311163556;
                                                    var2 >>>= 5;
                                                    var2 ^= -439562228;
                                                    break label395;
                                                }

                                                var2 |= -1656744007;
                                                var2 >>= 19;
                                                var2 -= -1067344759;
                                                var2 += -1582566239;
                                                var2 ^= 49236726;
                                                TextStyle var399 = TextStyle.of(var398, var432);
                                                TextStyle var400 = var399.bold();
                                                boolean var433 = var290.A;
                                                float var434;
                                                if (var433) {
                                                    var2 -= 974965925;
                                                    var2 |= -579251152;
                                                    var2 |= 1404116210;
                                                    var2 ^= -499827841;
                                                    var434 = 0.05F;
                                                    var2 >>= 1;
                                                    var2 *= 1353417659;
                                                    var2 >>>= 26;
                                                    var2 ^= 1788733587;
                                                    var2 ^= -2029939254;
                                                } else {
                                                    var2 += -2009155657;
                                                    var2 *= 916912847;
                                                    var2 ^= 1590215282;
                                                    var2 &= -253099638;
                                                    var2 ^= 572795532;
                                                    int var457 = var2 + 1;
                                                    int var458 = var2 * var457;
                                                    int var482 = var2 + 2;
                                                    int var459 = var458 * var482;
                                                    int var483 = var2 + 3;
                                                    int var460 = var459 * var483;
                                                    int var461 = var460 & 7;
                                                    if (var461 != 0) {
                                                        break label396;
                                                    }

                                                    var434 = 0.0F;
                                                    switch (var2) {
                                                        case -1836176500:
                                                            var2 -= -798079625;
                                                            var2 -= 641926703;
                                                            var2 &= 1409978037;
                                                            var2 ^= -40569892;
                                                            break;
                                                        case 1136932302:
                                                            var2 ^= -345016486;
                                                            break;
                                                        case 1331572037:
                                                        default:
                                                            var2 ^= -1364741458;
                                                    }
                                                }

                                                var14 = var2;
                                                var16 = var14 + 1L;
                                                var16 = var14 * var16;
                                                long var509 = var14 + 2L;
                                                var16 *= var509;
                                                var14 += 3L;
                                                var16 *= var14;
                                                var14 = var16 & 7L;
                                                long var527;
                                                int var465 = (var527 = var14 - 0L) == 0L ? 0 : (var527 < 0L ? -1 : 1);
                                                if (var465 != 0) {
                                                    break label396;
                                                }

                                                TextStyle var401 = var400.weight(var434);
                                                int var435 = DP.nq(-805306368, var310);
                                                TextStyle var402 = var401.outline(var435, 0.05F);
                                                int var436 = var290.E;
                                                boolean var466 = var290.A;
                                                long var484 = var3;
                                                var497 = var484 + 1L;
                                                var497 = var484 * var497;
                                                long var485 = var497 & 1L;
                                                long var528;
                                                int var486 = (var528 = var485 - 0L) == 0L ? 0 : (var528 < 0L ? -1 : 1);
                                                if (var486 != 0) {
                                                    var2 |= -2061890840;
                                                    var2 ^= 236992312;
                                                    break label395;
                                                }
                                                var2 = switch (var2) {
                                                    case -1713390662 -> var2 ^ 467018396;
                                                    case -308511368 -> {
                                                        var2 >>= 30;
                                                        yield var2 ^ 1858540104;
                                                    }
                                                    default -> var2 ^ 589394023;
                                                };
                                                float var470;
                                                if (var466) {
                                                    var2 -= 847695931;
                                                    var2 *= -1284109231;
                                                    var2 -= -32032108;
                                                    var2 >>= 6;
                                                    var2 ^= -616619250;
                                                    var14 = var2;
                                                    var16 = var14 + 1L;
                                                    var16 = var14 * var16;
                                                    var14 = var16 & 1L;
                                                    long var529;
                                                    int var469 = (var529 = var14 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
                                                    if (var469 != 0) {
                                                        break label396;
                                                    }

                                                    var470 = 0.75F;
                                                    var2 &= -1520879730;
                                                    var2 -= -2071869619;
                                                    var2 ^= 1132270264;
                                                } else {
                                                    var2 &= -144424991;
                                                    var2 *= 878115675;
                                                    var2 ^= -2023439749;
                                                    long var487 = var2;
                                                    var497 = var487 + 1L;
                                                    var497 = var487 * var497;
                                                    var19 = var487 + 2L;
                                                    var497 *= var19;
                                                    long var488 = var487 + 3L;
                                                    var497 *= var488;
                                                    long var489 = var497 & 7L;
                                                    long var530;
                                                    int var490 = (var530 = var489 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                                                    if (var490 != 0) {
                                                        break label396;
                                                    }

                                                    var470 = 0.45F;
                                                    switch (var2) {
                                                        case -1406676672:
                                                            var2 -= -533428158;
                                                            var2 *= 1200560237;
                                                            var2 ^= -688217770;
                                                            var2 += 1574883845;
                                                            var2 ^= -1976612618;
                                                            break;
                                                        case -653616149:
                                                            var2 ^= -1933418963;
                                                            break;
                                                        case -403359367:
                                                        default:
                                                            var2 ^= -958210141;
                                                    }
                                                }

                                                int var437 = DP.Y(var436, var470);
                                                int var311 = DP.nq(var437, var310);
                                                TextStyle var312 = var402.shadow(var311, 0.0F, 0.3F);
                                                String var403 = var290.b;
                                                int var438 = var3 + 1;
                                                int var439 = var3 * var438;
                                                int var471 = var3 + 2;
                                                int var440 = var439 * var471;
                                                int var472 = var3 + 3;
                                                int var441 = var440 * var472;
                                                int var442 = var441 & 7;
                                                if (var442 != 0) {
                                                    var2 ^= 1452202604;
                                                    var2 -= 537743249;
                                                    var2 -= 732672241;
                                                    var2 -= -802733252;
                                                    var2 ^= 2062224113;
                                                    break label395;
                                                }
                                                var2 = switch (var2) {
                                                    case -474259581 -> {
                                                        var2 *= 1974950327;
                                                        yield var2 ^ 294022310;
                                                    }
                                                    case 884143655 -> var2 ^ -1412188656;
                                                    default -> var2 ^ -613401425;
                                                };
                                                int var443 = var2 + 1;
                                                int var444 = var2 * var443;
                                                int var473 = var2 + 2;
                                                int var445 = var444 * var473;
                                                int var474 = var2 + 3;
                                                int var446 = var445 * var474;
                                                int var447 = var446 & 7;
                                                if (var447 != 0) {
                                                    break label396;
                                                }

                                                float var404 = var262.measure(var403, var312);
                                                String var291 = var290.b;
                                                float[] var448 = this.uI;
                                                float var449 = var448[0];
                                                float var405 = var404 * 0.5F;
                                                float var406 = var449 - var405;
                                                float[] var450 = this.uI;
                                                float var451 = var450[1];
                                                float var351 = 8.0F * var350;
                                                float var352 = var351 * 0.5F;
                                                float var353 = var451 - var352;
                                                float var292 = var262.text(var291, var406, var353, var312);
                                                var2 &= 261749072;
                                                var2 ^= -2109947673;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        switch (var2) {
                            case -1932799014:
                                var2 |= 216337585;
                                var2 ^= -1095052249;
                                break;
                            case -1913015299:
                                var2 ^= 1296401376;
                                break;
                            case -849191014:
                            default:
                                var2 ^= -1163407243;
                        }
                    } else {
                        var2 &= 1521087445;
                        var2 ^= 687196808;
                    }

                    long var230 = var2;
                    long var253 = var230 + 1L;
                    long var254 = var230 * var253;
                    long var270 = var230 + 2L;
                    long var255 = var254 * var270;
                    long var231 = var230 + 3L;
                    long var256 = var255 * var231;
                    long var232 = var256 & 7L;
                    long var531;
                    var2 = (var531 = var232 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return;
                    }
                    break label396;
                }
            }

            Integer var242 = var2;
            if (var242 != null) {
                RuntimeException var243 = new RuntimeException();
                throw var243;
            }
        }

        UnsupportedOperationException var238 = new UnsupportedOperationException();
        throw var238;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1722664257;
        int var2 = Yn.C;
        int var4 = of_2.xF(var3, var1, var2);
        l = var4;
        GQ var5 = LH.ve();
        GQ var6 = var5.E(0.0F, 0.8F);
        Lv var15 = sT_2.aO;
        GQ var7 = var6.cr(0.1F, 1.08F, var15);
        Lv var16 = sT_2.Jj;
        GQ var8 = var7.cr(0.22F, 1.0F, var16);
        LH var9 = var8.z();
        s = var9;
        GQ var10 = LH.ve();
        GQ var11 = var10.E(0.0F, 1.0F);
        GQ var12 = var11.E(0.65F, 1.0F);
        Lv var17 = sT_2.H;
        GQ var13 = var12.cr(1.0F, 0.0F, var17);
        LH var14 = var13.z();
        yZ = var14;
    }
}
