package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public final class targetesp extends Yn {
    private static final double BD;
    private static final int fu = 64;
    private static final int G = 72;
    private static final double i;
    private final r_2 IL;
    private final Uq s;
    private final Uq z;
    private final Uq Bl;
    private final Uq D;
    private final Uq Tc;
    private final Uq t;
    private final zS aY;
    private final JL Q;
    private final JL Bm;
    private final Uq OI;
    private LivingEntity I;
    private float FM;
    private Object f;
    public static final int Fd;

    public targetesp() {
        super("target_esp", "Target ESP", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        BZ var2 = BZ.GHOSTS;
        r_2 var3 = new r_2("mode", "Mode", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.IL = var5;
        Uq var6 = new Uq("speed", "Speed", 1.0F, 0.2F, 3.0F);
        Uq var7 = var6.W(0.05F);
        Uq var8 = var7.L("x");
        xB var9 = this.vn(var8);
        Uq var10 = (Uq)var9;
        this.s = var10;
        Uq var11 = new Uq("ghosts", "Ghosts", 3.0F, 1.0F, 6.0F);
        Uq var12 = var11.W(1.0F);
        BooleanSupplier var56 = () -> {
            int var1x = Fd;
            var1x ^= 631889151;
            int var2x = System.identityHashCode(this);
            long var17x = var2x;
            long var4x = var17x + 1L;
            var4x = var17x * var4x;
            long var18x = var4x & 1L;
            long var22x;
            var2x = (var22x = var18x - 0L) == 0L ? 0 : (var22x < 0L ? -1 : 1);
            if (var2x == 0) {
                switch (var1x) {
                    case -1299002357:
                        var1x |= -1416266965;
                        var1x -= -745795613;
                        var1x ^= 1857909927;
                        var1x *= 707985107;
                        var1x ^= -1384590334;
                        break;
                    case -783568525:
                    default:
                        var1x ^= -943239288;
                        break;
                    case 504995185:
                        var1x ^= 504164244;
                }

                r_2 var20x = this.IL;
                BZ var3x = BZ.GHOSTS;
                return var20x.TJ(var3x);
            } else {
                var1x *= 2067225831;
                var1x ^= -1303476834;
                UnsupportedOperationException var9x = new UnsupportedOperationException();
                throw var9x;
            }
        };
        xB var13 = var12.Pt(var56);
        Uq var14 = (Uq)var13;
        xB var15 = this.vn(var14);
        Uq var16 = (Uq)var15;
        this.z = var16;
        Uq var17 = new Uq("length", "Trail Length", 1.3F, 0.5F, 2.0F);
        Uq var18 = var17.W(0.05F);
        BooleanSupplier var57 = () -> {
            int var1x = Fd;
            var1x ^= 23592975;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.IL;
            BZ var4x = BZ.GHOSTS;
            Integer var18x = var2x;
            if (var18x == null) {
                var1x <<= 1;
                var1x ^= 1480142373;
                var1x += -598560209;
                var1x += -1617444813;
                var1x ^= 1758546605;
                AssertionError var23x = new AssertionError();
                throw var23x;
            } else {
                var1x *= 1322760131;
                var1x |= -889274755;
                var1x ^= 1043156791;
                int var19x = var1x + 1;
                var19x = var1x * var19x;
                int var5x = var1x + 2;
                var19x *= var5x;
                var1x += 3;
                var19x *= var1x;
                var1x = var19x & 7;
                if (var1x != 0) {
                    AssertionError var12x = new AssertionError();
                    throw var12x;
                } else {
                    return var3x.TJ(var4x);
                }
            }
        };
        xB var19 = var18.Pt(var57);
        Uq var20 = (Uq)var19;
        xB var21 = this.vn(var20);
        Uq var22 = (Uq)var21;
        this.Bl = var22;
        Uq var23 = new Uq("ghost_size", "Ghost Size", 0.5F, 0.2F, 1.2F);
        Uq var24 = var23.W(0.05F);
        Uq var25 = var24.L("m");
        BooleanSupplier var58 = () -> {
            int var1x = Fd;
            var1x ^= 842637425;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.IL;
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            var2x = var4x & 1;
            if (var2x != 0) {
                var1x <<= 5;
                var1x *= 1814925809;
                var1x ^= 1211950851;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    IllegalArgumentException var21x = new IllegalArgumentException();
                    throw var21x;
                }
            } else {
                Integer var14x = switch (var1x) {
                    case -2019132288 -> var1x ^ -751872501;
                    case -1526550395 -> {
                        var1x |= 1861231234;
                        var1x -= -1038872673;
                        var1x += -604459358;
                        var1x |= -604277850;
                        yield var1x ^ -2145691190;
                    }
                    default -> var1x ^ -70652843;
                };
                if (var14x != null) {
                    BZ var16x = BZ.GHOSTS;
                    return var3x.TJ(var16x);
                }
            }

            AssertionError var15x = new AssertionError();
            throw var15x;
        };
        xB var26 = var25.Pt(var58);
        Uq var27 = (Uq)var26;
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.D = var29;
        Uq var30 = new Uq("marker_size", "Marker Size", 1.0F, 0.5F, 2.0F);
        Uq var31 = var30.W(0.05F);
        Uq var32 = var31.L("x");
        BooleanSupplier var59 = () -> {
            label73: {
                int var13x;
                var13x = Fd;
                var13x ^= -690874699;
                int var2x = System.identityHashCode(this);
                r_2 var3x = this.IL;
                BZ var4x = BZ.MARKER;
                boolean var58x = var3x.TJ(var4x);
                int var69 = var2x + 1;
                int var70 = var2x * var69;
                int var5x = var2x + 2;
                int var71 = var70 * var5x;
                var5x = var2x + 3;
                int var72 = var71 * var5x;
                int var73 = var72 & 7;
                label66:
                if (var73 == 0) {
                    var13x >>= 29;
                    var13x ^= 161236743;
                    var13x *= -1226484561;
                    var13x >>>= 26;
                    var13x ^= 190027751;
                    long var74 = var13x;
                    long var6x = var74 + 1L;
                    var6x = var74 * var6x;
                    long var75 = var6x & 1L;
                    long var88;
                    int var76 = (var88 = var75 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var76 != 0) {
                        break label73;
                    }

                    if (!var58x) {
                        var13x = switch (var13x) {
                            case -1036738324 -> var13x ^ -365155798;
                            case 190027740 -> {
                                var13x |= -2126339535;
                                var13x ^= 225296422;
                                yield var13x ^ 1863228738;
                            }
                            default -> var13x ^ -110627947;
                        };
                        long var59x = var13x;
                        long var82 = var59x + 1L;
                        long var83 = var59x * var82;
                        long var7x = var59x + 2L;
                        long var84 = var83 * var7x;
                        long var60x = var59x + 3L;
                        long var85 = var84 * var60x;
                        long var61 = var85 & 7L;
                        long var89;
                        int var62 = (var89 = var61 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var62 != 0) {
                            break label73;
                        }

                        var3x = this.IL;
                        Enum var64 = var3x.A();
                        BZ var65 = (BZ)var64;
                        Integer var46x = var2x;
                        if (var46x == null) {
                            var13x *= -1633862237;
                            var13x ^= 652848739;
                            break label66;
                        }

                        var13x -= -806012321;
                        var13x *= 1505529795;
                        var13x |= 570856743;
                        var13x ^= 1918998986;
                        var46x = var13x;
                        if (var46x == null) {
                            break label73;
                        }

                        int var48x = var13x * -81230487;
                        var48x ^= -1908211842;
                        var48x -= -560293373;
                        var48x ^= -819438111;
                        int var52x = FJ(var65, var48x) ? 1 : 0;
                        if (var52x == 0) {
                            var13x |= 1428208779;
                            var13x *= 1339980495;
                            var13x -= -2032520641;
                            var13x -= -1700263054;
                            var13x ^= -403760214;
                            long var53x = var13x;
                            long var77 = var53x + 1L;
                            long var78 = var53x * var77;
                            var6x = var53x + 2L;
                            long var79 = var78 * var6x;
                            long var54x = var53x + 3L;
                            long var80 = var79 * var54x;
                            long var55x = var80 & 7L;
                            long var90;
                            var52x = (var90 = var55x - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                            if (var52x != 0) {
                                break label73;
                            }

                            boolean var57x = false;
                            var13x += 2040029756;
                            var13x *= -1084236347;
                            var13x |= 1707093456;
                            var13x ^= -1855962709;
                            return var57x;
                        }

                        switch (var13x) {
                            case -703584499:
                            default:
                                var13x ^= -1965653972;
                                break;
                            case 174226484:
                                var13x ^= 1586825406;
                                break;
                            case 1411264229:
                                var13x -= 35167168;
                                var13x ^= 866656498;
                        }
                    } else {
                        var13x &= 1727821789;
                        var13x -= -1021601368;
                        var13x &= 1132276548;
                        var13x ^= 1654233555;
                    }

                    int var66 = var13x + 1;
                    int var67 = var13x * var66;
                    int var68 = var67 & 1;
                    if (var68 != 0) {
                        break label73;
                    }

                    boolean var91 = true;
                    var13x |= -779318239;
                    var13x ^= 85918082;
                    return var91;
                } else {
                    var13x >>= 20;
                    var13x |= -791583731;
                    var13x >>>= 8;
                    var13x ^= 1239001964;
                }

                Integer var38x = var13x;
                if (var38x != null) {
                    AssertionError var39x = new AssertionError();
                    throw var39x;
                }
            }

            RuntimeException var45x = new RuntimeException();
            throw var45x;
        };
        xB var33 = var32.Pt(var59);
        Uq var34 = (Uq)var33;
        xB var35 = this.vn(var34);
        Uq var36 = (Uq)var35;
        this.Tc = var36;
        Uq var37 = new Uq("glow", "Glow", 0.7F, 0.0F, 1.0F);
        Uq var38 = var37.W(0.05F);
        xB var39 = this.vn(var38);
        Uq var40 = (Uq)var39;
        this.t = var40;
        Ry var60 = Ry.GRADIENT;
        zS var41 = new zS(var60, -11559425, -5870593);
        nM var42 = this.bU(var41);
        zS var43 = (zS)var42;
        this.aY = var43;
        JL var44 = new JL("hurt_flash", "Hurt Flash", true);
        xB var45 = this.vn(var44);
        JL var46 = (JL)var45;
        this.Q = var46;
        JL var47 = new JL("on_look", "Show On Look", true);
        xB var48 = this.vn(var47);
        JL var49 = (JL)var48;
        this.Bm = var49;
        Uq var50 = new Uq("range", "Range", 32.0F, 6.0F, 96.0F);
        Uq var51 = var50.W(1.0F);
        Uq var52 = var51.L("m");
        xB var53 = this.vn(var52);
        Uq var54 = (Uq)var53;
        this.OI = var54;
        this.dy("Ghost comets, a gliding ring or a reticle around the entity you fight.");
        this.fJ(true);
        wD<T> var55 = this::aS;
        this.iI(T.class, var55);
    }

    @Override
    protected void J() {
        int var1 = Fd;
        var1 ^= 772502511;
        int var2 = System.identityHashCode(this);
        this.I = null;
        this.FM = 0.0F;
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            Integer var17 = switch (var1) {
                case -1188011237 -> {
                    var1 += -94709927;
                    var1 |= 162770650;
                    var1 -= -1765747509;
                    yield var1 ^ -1999798043;
                }
                default -> var1 ^ -571667192;
                case 1862622362 -> var1 ^ -551562601;
            };
            if (var17 != null) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            var1 = switch (var1) {
                case -1188011237 -> {
                    var1 -= 2061368001;
                    var1 &= -1835510224;
                    var1 &= -60227180;
                    var1 += -192185364;
                    yield var1 ^ 1112560530;
                }
                default -> var1 ^ 1722947219;
                case -213635212 -> var1 ^ -1392417036;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                this.f = null;
                return;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    private LivingEntity vN(Entity var1, int var2) {
        label164: {
            int var86;
            label174: {
                int var4 = System.identityHashCode(this);
                Ud var5 = Ud.Z();
                V var109 = var5.bA();
                Entity var110 = var109.i();
                long var6 = var4;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var176;
                int var121 = (var176 = var6 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                if (var121 != 0) {
                    var86 = var2 ^ -673117958;
                    var86 ^= -1567331041;
                } else {
                    label173: {
                        var86 = var2 * 143566525;
                        var86 += 1655164095;
                        var86 ^= 1096864294;
                        Integer var122 = var86;
                        if (var122 == null) {
                            break label164;
                        }

                        Entity var127;
                        if (var110 == null) {
                            var86 *= 2002804743;
                            var86 |= -1683666157;
                            var86 += 1389953950;
                            var86 ^= 1940335205;
                            Integer var123 = var86;
                            if (var123 == null) {
                                break label164;
                            }

                            JL var124 = this.Bm;
                            Integer var7 = var4;
                            if (var7 == null) {
                                var86 -= 1720573736;
                                var86 |= 958888023;
                                var86 >>= 26;
                                var86 ^= 1218049105;
                                break label173;
                            }

                            var86 |= 1237281600;
                            var86 *= 1484826205;
                            var86 ^= -802883627;
                            int var129 = var86 + 1;
                            var129 = var86 * var129;
                            int var164 = var86 + 2;
                            var129 *= var164;
                            int var165 = var86 + 3;
                            var129 *= var165;
                            var129 &= 7;
                            if (var129 != 0) {
                                break label164;
                            }

                            boolean var125 = var124.vb();
                            if (var125) {
                                var86 >>>= 18;
                                var86 >>= 5;
                                var86 ^= -1053595795;
                                Entity var126 = i_2.aM();
                                long var134 = var4;
                                long var9 = var134 + 1L;
                                var9 = var134 * var9;
                                long var135 = var9 & 1L;
                                long var177;
                                var129 = (var177 = var135 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                                if (var129 != 0) {
                                    var86 >>>= 31;
                                    var86 >>= 16;
                                    var86 |= 1781462233;
                                    var86 ^= -582418569;
                                    break label173;
                                }

                                var86 ^= 1180295881;
                                var86 ^= 180743583;
                                var86 &= -1348177520;
                                var86 &= 135477261;
                                var86 ^= -1567846311;
                                Integer var137 = var86;
                                if (var137 == null) {
                                    break label164;
                                }

                                var127 = var126;
                                var86 >>= 19;
                                var86 ^= 1250734161;
                            } else {
                                var86 ^= -948609173;
                                var86 |= 1172080692;
                                var86 ^= 1704738124;
                                var129 = var86 + 1;
                                var129 = var86 * var129;
                                int var166 = var86 + 2;
                                var129 *= var166;
                                int var167 = var86 + 3;
                                var129 *= var167;
                                var129 &= 7;
                                if (var129 != 0) {
                                    break label164;
                                }

                                var127 = var110;
                                var86 ^= 589829999;
                                var86 ^= -675899067;
                                var86 ^= -1045607792;
                            }
                        } else {
                            var86 ^= 1679753831;
                            var86 ^= -934063465;
                            var127 = var110;
                            var86 -= -681603423;
                            var86 &= -821037692;
                            var86 ^= -93219580;
                        }

                        Integer var111 = var86;
                        if (var111 == null) {
                            break label164;
                        }

                        boolean var112 = var127 instanceof LivingEntity;
                        long var143 = var4;
                        long var173 = var143 + 1L;
                        var173 = var143 * var173;
                        var143 = var173 & 1L;
                        long var178;
                        int var145 = (var178 = var143 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                        if (var145 == 0) {
                            var86 = switch (var86) {
                                default -> var86 ^ 1849908906;
                                case -1250736896 -> {
                                    var86 |= 625284070;
                                    var86 ^= -980879028;
                                    var86 <<= 8;
                                    var86 &= -12699240;
                                    yield var86 ^ -1755034464;
                                }
                                case 1109241989 -> var86 ^ -407995857;
                            };
                            if (!var112) {
                                var86 >>= 14;
                                var86 ^= -433934548;
                                var86 &= 1004580981;
                                var86 ^= -1052775010;
                                break label174;
                            }

                            var86 ^= -1398018695;
                            var86 *= -1230852585;
                            var86 ^= -392383440;
                            var86 >>= 21;
                            var86 ^= -1051691447;
                            Integer var113 = var86;
                            if (var113 == null) {
                                break label164;
                            }

                            LivingEntity var114 = (LivingEntity)var127;
                            int var146 = var4 + 1;
                            int var147 = var4 * var146;
                            int var168 = var4 + 2;
                            int var148 = var147 * var168;
                            int var169 = var4 + 3;
                            int var149 = var148 * var169;
                            int var150 = var149 & 7;
                            if (var150 != 0) {
                                var86 *= -1033575971;
                                var86 |= -1291066290;
                                var86 &= -589316767;
                                var86 |= -864409794;
                                var86 ^= 1805499601;
                            } else {
                                var86 = switch (var86) {
                                    case -1866827359 -> var86 ^ 86083952;
                                    default -> var86 ^ 834433323;
                                    case 1051691751 -> {
                                        var86 *= 1658865411;
                                        var86 *= 1608806607;
                                        var86 >>= 3;
                                        var86 ^= 109738023;
                                        yield var86 ^ 747761963;
                                    }
                                };
                                Integer var151 = var86;
                                if (var151 == null) {
                                    break label164;
                                }

                                boolean var152 = var114.isAlive();
                                if (!var152) {
                                    var86 &= 1437951778;
                                    var86 <<= 27;
                                    var86 -= 1281789210;
                                    var86 ^= 545693565;
                                    break label174;
                                }

                                var86 ^= -788105188;
                                var86 <<= 2;
                                var86 ^= -415730799;
                                if (var127 == var1) {
                                    var86 >>>= 10;
                                    var86 ^= -484532310;
                                    break label174;
                                }

                                var86 *= 879700885;
                                var86 += 1935323116;
                                var86 ^= -1059221309;
                                int var153 = var86 + 1;
                                int var154 = var86 * var153;
                                int var170 = var86 + 2;
                                int var155 = var154 * var170;
                                int var171 = var86 + 3;
                                int var156 = var155 * var171;
                                int var157 = var156 & 7;
                                if (var157 != 0) {
                                    break label164;
                                }

                                Uq var158 = this.OI;
                                float var159 = var158.WM();
                                double var160 = var159;
                                double var175 = var127.squaredDistanceTo(var1);
                                Integer var98 = var4;
                                if (var98 != null) {
                                    var86 = switch (var86) {
                                        case -1388946834 -> {
                                            var86 |= 680794856;
                                            var86 *= 404051159;
                                            yield var86 ^ 2113083993;
                                        }
                                        default -> var86 ^ 204905184;
                                        case 1306092413 -> var86 ^ 596374334;
                                    };
                                    double var128 = var160 * var160;
                                    double var179;
                                    int var99 = (var179 = var175 - var128) == 0.0 ? 0 : (var179 < 0.0 ? -1 : 1);
                                    LivingEntity var101;
                                    if (var99 <= 0) {
                                        var86 = switch (var86) {
                                            case -453272315 -> var86 ^ 1520378158;
                                            case 40988603 -> {
                                                var86 ^= 1628820509;
                                                yield var86 ^ 1365020444;
                                            }
                                            default -> var86 ^ 2132925030;
                                        };
                                        Integer var100 = var86;
                                        if (var100 == null) {
                                            break label164;
                                        }

                                        var101 = var114;
                                        var86 &= 691069036;
                                        var86 ^= -1089053086;
                                    } else {
                                        var86 *= -568952117;
                                        var86 -= -1064342899;
                                        var86 ^= -784042598;
                                        var101 = null;
                                        var86 |= -1220042152;
                                        var86 ^= 1758577972;
                                    }

                                    long var115 = var86;
                                    var143 = var115 + 1L;
                                    var143 = var115 * var143;
                                    long var116 = var143 & 1L;
                                    long var180;
                                    int var117 = (var180 = var116 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                                    if (var117 == 0) {
                                        return var101;
                                    }
                                    break label164;
                                }

                                switch (var86) {
                                    case -1506442602:
                                    default:
                                        var86 ^= 1430982651;
                                        break;
                                    case -1388946834:
                                        var86 &= 1791892709;
                                        var86 &= 777228208;
                                        var86 -= -257759793;
                                        var86 ^= -2143737345;
                                        break;
                                    case 1915717727:
                                        var86 ^= -59595545;
                                }
                            }
                        } else {
                            switch (var86) {
                                case -1250736896:
                                    var86 -= -1503980680;
                                    var86 ^= -1199687130;
                                    break;
                                case 245219570:
                                    var86 ^= -1197873207;
                                    break;
                                case 972922228:
                                default:
                                    var86 ^= 1404101060;
                            }
                        }
                    }
                }

                var4 = var86 + 1;
                var4 = var86 * var4;
                var86 = var4 & 1;
                if (var86 == 0) {
                    AssertionError var97 = new AssertionError();
                    throw var97;
                }
                break label164;
            }

            int var102 = var86 + 1;
            var102 = var86 * var102;
            int var118 = var86 + 2;
            var102 *= var118;
            var118 = var86 + 3;
            var102 *= var118;
            var102 &= 7;
            if (var102 == 0) {
                return null;
            }
        }

        AssertionError var96 = new AssertionError();
        throw var96;
    }

    private void aS(T var1) {
        label368: {
            label367: {
                label366: {
                    int var2 = Fd;
                    var2 ^= -1151209844;
                    int var3 = System.identityHashCode(this);
                    RenderPhase var4 = var1.phase();
                    int var5 = var3 + 1;
                    var5 = var3 * var5;
                    var5 &= 1;
                    if (var5 != 0) {
                        var2 &= 38416651;
                        var2 |= -482358052;
                        var2 ^= 878765657;
                    } else {
                        var2 -= -102689710;
                        var2 += 1443694741;
                        var2 ^= 299266825;
                        RenderPhase var286 = RenderPhase.WORLD;
                        if (var4 != var286) {
                            var2 *= 759718921;
                            var2 *= -1425063799;
                            var2 |= 1039601484;
                            var2 <<= 14;
                            var2 ^= -1557404192;
                            Integer var283 = var2;
                            if (var283 != null) {
                                return;
                            }
                            break label368;
                        }

                        var2 &= 2029568680;
                        var2 ^= -1324833362;
                        var2 ^= -422574080;
                        long var265 = var2;
                        long var6 = var265 + 1L;
                        var6 = var265 * var6;
                        long var266 = var6 & 1L;
                        long var474;
                        int var267 = (var474 = var266 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
                        if (var267 != 0) {
                            break label368;
                        }

                        Entity var268 = i_2.QI();
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        var5 &= 1;
                        if (var5 == 0) {
                            var2 &= 1087164434;
                            var2 |= -1091765258;
                            var2 += -1453124976;
                            var2 *= 1843586651;
                            var2 ^= -1821823213;
                            var5 = var2 + 1;
                            var5 = var2 * var5;
                            var5 &= 1;
                            if (var5 != 0) {
                                break label368;
                            }

                            if (var268 == null) {
                                switch (var2) {
                                    case -240064776:
                                        var2 ^= -2009189082;
                                        break label367;
                                    case 849650353:
                                        var2 *= 98702229;
                                        var2 |= -253795549;
                                        var2 ^= 1986771192;
                                        break label367;
                                    case 1244577448:
                                    default:
                                        var2 ^= 446436492;
                                        break label367;
                                }
                            }

                            var2 >>= 8;
                            var2 >>= 20;
                            var2 *= 671632645;
                            var2 &= -1390433454;
                            var2 ^= 1073561158;
                            Object var293 = this.f;
                            var6 = var3;
                            long var8 = var6 + 1L;
                            var8 = var6 * var8;
                            long var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var475;
                            int var335 = (var475 = var6 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                            if (var335 != 0) {
                                switch (var2) {
                                    case -263354083:
                                    default:
                                        var2 ^= 581580301;
                                        break;
                                    case 400923972:
                                        var2 ^= -853991510;
                                        var2 &= -817041628;
                                        var2 <<= 14;
                                        var2 |= -1506475738;
                                        var2 ^= 1906449315;
                                        break;
                                    case 906834930:
                                        var2 ^= 1951950466;
                                }
                            } else {
                                label372: {
                                    var2 ^= 70089303;
                                    var2 <<= 19;
                                    var2 ^= -513621447;
                                    int var336 = var2 + 1;
                                    int var337 = var2 * var336;
                                    int var338 = var337 & 1;
                                    if (var338 != 0) {
                                        break label368;
                                    }

                                    if (var293 != null) {
                                        var2 = switch (var2) {
                                            case -637877703 -> {
                                                var2 -= 522656330;
                                                var2 *= 1761803131;
                                                yield var2 ^ 361941478;
                                            }
                                            default -> var2 ^ -1645694420;
                                            case -129103993 -> var2 ^ 1475164781;
                                        };
                                        Object var294 = var2;
                                        if (var294 == null) {
                                            break label368;
                                        }

                                        var294 = this.f;
                                        World var339 = var268.getEntityWorld();
                                        Integer var7 = var3;
                                        if (var7 == null) {
                                            switch (var2) {
                                                case -1514565631:
                                                    var2 ^= 993578652;
                                                    break label372;
                                                case -1247425229:
                                                    var2 >>>= 6;
                                                    var2 |= -1572462374;
                                                    var2 ^= -1329632309;
                                                    var2 >>= 28;
                                                    var2 ^= -685827452;
                                                    break label372;
                                                case 1911784445:
                                                default:
                                                    var2 ^= 1696792268;
                                                    break label372;
                                            }
                                        }

                                        var2 >>>= 12;
                                        var2 &= 1097861013;
                                        var2 *= -1455117715;
                                        var2 -= 546961247;
                                        var2 ^= -1103652745;
                                        var7 = var2;
                                        if (var7 == null) {
                                            break label368;
                                        }

                                        if (var294 != var339) {
                                            var2 += 1404420094;
                                            var2 *= 1315497671;
                                            var2 ^= -1814821649;
                                            break label367;
                                        }

                                        switch (var2) {
                                            case -906250608:
                                                var2 ^= 48744261;
                                                break;
                                            case 472886098:
                                                var2 &= -1366612579;
                                                var2 ^= -1652960996;
                                                break;
                                            case 1099401990:
                                            default:
                                                var2 ^= 24050593;
                                        }
                                    } else {
                                        var2 &= -41806266;
                                        var2 -= -938001797;
                                        var2 ^= -2145896567;
                                    }

                                    long var296 = var2;
                                    long var371 = var296 + 1L;
                                    var371 = var296 * var371;
                                    long var297 = var371 & 1L;
                                    long var476;
                                    var5 = (var476 = var297 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        break label368;
                                    }

                                    World var299 = var268.getEntityWorld();
                                    this.f = var299;
                                    var5 = var2 >> 16;
                                    var5 ^= -1022831454;
                                    var5 ^= -18601061;
                                    LivingEntity var269 = this.vN(var268, var5);
                                    FrameContext var303 = var1.frame();
                                    var6 = var3;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var477;
                                    int var343 = (var477 = var6 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                                    if (var343 == 0) {
                                        var2 *= 1829358961;
                                        var2 *= -1972926391;
                                        var2 <<= 14;
                                        var2 ^= -1963071595;
                                        int var344 = var2 + 1;
                                        int var345 = var2 * var344;
                                        int var373 = var2 + 2;
                                        int var346 = var345 * var373;
                                        int var374 = var2 + 3;
                                        int var347 = var346 * var374;
                                        int var348 = var347 & 7;
                                        if (var348 != 0) {
                                            break label368;
                                        }

                                        float var304 = var303.dt();
                                        float var305 = Math.min(var304, 0.1F);
                                        float var349 = this.FM;
                                        float var378;
                                        if (var269 != null) {
                                            var2 = switch (var2) {
                                                default -> var2 ^ -1713758204;
                                                case 961996693 -> {
                                                    var2 &= 526876039;
                                                    var2 += -537713553;
                                                    yield var2 ^ 604685404;
                                                }
                                                case 1241802503 -> var2 ^ -745740142;
                                            };
                                            int var375 = var2 + 1;
                                            int var376 = var2 * var375;
                                            int var377 = var376 & 1;
                                            if (var377 != 0) {
                                                break label368;
                                            }

                                            var378 = 1.0F;
                                            var2 += 1291784717;
                                            var2 += 78833388;
                                            var2 ^= -1767767350;
                                        } else {
                                            var2 &= 1083488745;
                                            var2 >>= 22;
                                            var2 ^= 936914635;
                                            var8 = var2;
                                            var10 = var8 + 1L;
                                            var10 = var8 * var10;
                                            long var12 = var8 + 2L;
                                            var10 *= var12;
                                            var8 += 3L;
                                            var10 *= var8;
                                            var8 = var10 & 7L;
                                            long var478;
                                            int var397 = (var478 = var8 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                            if (var397 != 0) {
                                                break label368;
                                            }

                                            var378 = 0.0F;
                                            switch (var2) {
                                                case -1939604821:
                                                default:
                                                    var2 ^= 1116830166;
                                                    break;
                                                case 936914635:
                                                    var2 ^= -17237933;
                                                    var2 &= 1572766873;
                                                    var2 <<= 29;
                                                    var2 ^= -1203288981;
                                                    break;
                                                case 986917082:
                                                    var2 ^= -237369317;
                                            }
                                        }

                                        float var306 = var305 / 0.2F;
                                        float var307 = TP.h(var349, var378, var306);
                                        this.FM = var307;
                                        long var308 = var3;
                                        var371 = var308 + 1L;
                                        var371 = var308 * var371;
                                        long var9 = var308 + 2L;
                                        var371 *= var9;
                                        long var309 = var308 + 3L;
                                        var371 *= var309;
                                        long var310 = var371 & 7L;
                                        long var479;
                                        var5 = (var479 = var310 - 0L) == 0L ? 0 : (var479 < 0L ? -1 : 1);
                                        if (var5 != 0) {
                                            var2 -= -1414286897;
                                            var2 ^= -611547111;
                                        } else {
                                            label376: {
                                                var2 &= -1762325536;
                                                var2 ^= -1072653455;
                                                var5 = var2 + 1;
                                                var5 = var2 * var5;
                                                var5 &= 1;
                                                if (var5 != 0) {
                                                    break label368;
                                                }

                                                if (var269 != null) {
                                                    var2 ^= 1020750862;
                                                    var2 &= 246794430;
                                                    var2 ^= -454475445;
                                                    Integer var315 = var2;
                                                    if (var315 == null) {
                                                        break label368;
                                                    }

                                                    LivingEntity var316 = this.I;
                                                    int var350 = var3 + 1;
                                                    int var351 = var3 * var350;
                                                    int var352 = var351 & 1;
                                                    if (var352 != 0) {
                                                        var2 *= 289970801;
                                                        var2 ^= -1000857088;
                                                        break label376;
                                                    }
                                                    var2 = switch (var2) {
                                                        default -> var2 ^ -889730448;
                                                        case -395738795 -> {
                                                            var2 ^= 1248948695;
                                                            var2 ^= 1019320882;
                                                            var2 += 486295937;
                                                            var2 ^= -7823133;
                                                            yield var2 ^ 745429176;
                                                        }
                                                        case -170978706 -> var2 ^ 2064606612;
                                                    };
                                                    int var353 = var2 + 1;
                                                    int var354 = var2 * var353;
                                                    int var383 = var2 + 2;
                                                    int var355 = var354 * var383;
                                                    int var384 = var2 + 3;
                                                    int var356 = var355 * var384;
                                                    int var357 = var356 & 7;
                                                    if (var357 != 0) {
                                                        break label368;
                                                    }

                                                    if (var269 != var316) {
                                                        var2 >>= 31;
                                                        var2 ^= 829272474;
                                                        float var317 = this.FM;
                                                        float var480;
                                                        int var318 = (var480 = var317 - 0.5F) == 0.0F ? 0 : (var480 < 0.0F ? -1 : 1);
                                                        Integer var358 = var3;
                                                        if (var358 == null) {
                                                            var2 ^= -552037266;
                                                            var2 ^= 963264369;
                                                            break label376;
                                                        }

                                                        var2 ^= -2029139057;
                                                        var2 ^= 1212284117;
                                                        int var359 = var2 + 1;
                                                        int var360 = var2 * var359;
                                                        int var361 = var360 & 1;
                                                        if (var361 != 0) {
                                                            break label368;
                                                        }

                                                        if (var318 > 0) {
                                                            var2 *= 1360260055;
                                                            var2 &= 1847878085;
                                                            var2 += -1809170975;
                                                            var2 ^= 1413094652;
                                                            Integer var319 = var2;
                                                            if (var319 == null) {
                                                                break label368;
                                                            }

                                                            this.FM = 0.5F;
                                                            var2 *= 1171227595;
                                                            var2 += -1933324027;
                                                            var2 *= -1698368343;
                                                            var2 ^= -41263903;
                                                        } else {
                                                            var2 ^= -1762845195;
                                                            var2 |= 341493335;
                                                            var2 ^= 2074457970;
                                                        }
                                                    } else {
                                                        var2 &= 1497681917;
                                                        var2 ^= 1333470317;
                                                    }
                                                } else {
                                                    switch (var2) {
                                                        case 1347787537:
                                                            var2 -= 1188686217;
                                                            var2 ^= 234936717;
                                                            break;
                                                        case 1602088008:
                                                        default:
                                                            var2 ^= -1622921090;
                                                            break;
                                                        case 1816382279:
                                                            var2 ^= 1102718056;
                                                    }
                                                }

                                                if (var269 != null) {
                                                    var2 += 1818630482;
                                                    var2 &= 1127599302;
                                                    var2 *= -706784129;
                                                    var2 *= 838697259;
                                                    var2 ^= -1366626806;
                                                    Integer var320 = var2;
                                                    if (var320 == null) {
                                                        break label368;
                                                    }

                                                    this.I = var269;
                                                    var2 |= -628087352;
                                                    var2 *= -1662014329;
                                                    var2 &= -985783488;
                                                    var2 |= 983878620;
                                                    var2 ^= -1366574197;
                                                } else {
                                                    var2 |= -1285336210;
                                                    var2 ^= -1155462820;
                                                    var2 >>>= 26;
                                                    var2 &= 972393655;
                                                    var2 ^= -1792585644;
                                                }

                                                long var270 = var2;
                                                var6 = var270 + 1L;
                                                var6 = var270 * var6;
                                                var8 = var270 + 2L;
                                                var6 *= var8;
                                                long var271 = var270 + 3L;
                                                var6 *= var271;
                                                long var272 = var6 & 7L;
                                                long var481;
                                                int var273 = (var481 = var272 - 0L) == 0L ? 0 : (var481 < 0L ? -1 : 1);
                                                if (var273 != 0) {
                                                    break label368;
                                                }

                                                LivingEntity var274 = this.I;
                                                Integer var321 = var3;
                                                if (var321 != null) {
                                                    var2 |= 102879286;
                                                    var2 >>>= 11;
                                                    var2 &= -1350381987;
                                                    var2 ^= 1065345512;
                                                    var2 ^= 969602694;
                                                    if (var274 == null) {
                                                        var2 ^= -1503399261;
                                                        var2 ^= 1865003817;
                                                        break label366;
                                                    }

                                                    var2 >>>= 5;
                                                    var2 <<= 26;
                                                    var2 |= 2127639418;
                                                    var2 ^= 1117487311;
                                                    float var275 = this.FM;
                                                    float var482;
                                                    int var276 = (var482 = var275 - 0.0F) == 0.0F ? 0 : (var482 < 0.0F ? -1 : 1);
                                                    long var322 = var3;
                                                    var371 = var322 + 1L;
                                                    var371 = var322 * var371;
                                                    long var323 = var371 & 1L;
                                                    long var483;
                                                    int var324 = (var483 = var323 - 0L) == 0L ? 0 : (var483 < 0L ? -1 : 1);
                                                    if (var324 == 0) {
                                                        var2 &= -1626438694;
                                                        var2 ^= 2132874301;
                                                        var324 = var2 + 1;
                                                        var324 = var2 * var324;
                                                        int var366 = var2 + 2;
                                                        var324 *= var366;
                                                        int var367 = var2 + 3;
                                                        var324 *= var367;
                                                        var324 &= 7;
                                                        if (var324 != 0) {
                                                            break label368;
                                                        }

                                                        if (var276 <= 0) {
                                                            switch (var2) {
                                                                case -707736614:
                                                                    var2 ^= 709516971;
                                                                    break label366;
                                                                case 934619489:
                                                                default:
                                                                    var2 ^= 274256240;
                                                                    break label366;
                                                                case 1663801261:
                                                                    var2 *= -1081014849;
                                                                    var2 ^= 478419375;
                                                                    break label366;
                                                            }
                                                        }
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ -147987850;
                                                            case 1663801261 -> {
                                                                var2 ^= -990560102;
                                                                var2 |= 32342125;
                                                                var2 |= 1354420002;
                                                                yield var2 ^ 1255670010;
                                                            }
                                                            case 2001980862 -> var2 ^ 1795989826;
                                                        };
                                                        FrameContext var277 = var1.frame();
                                                        float var278 = var277.partialTick();
                                                        LivingEntity var330 = this.I;
                                                        double var368 = var330.lastX;
                                                        double var399 = var330.getX();
                                                        double var407 = var278;
                                                        double var369 = TP.y(var368, var399, var407);
                                                        double var400 = var330.lastY;
                                                        double var408 = var330.getY();
                                                        Integer var411 = var3;
                                                        label328:
                                                        if (var411 != null) {
                                                            var2 -= -1546453;
                                                            var2 &= 777484504;
                                                            var2 ^= 1494571745;
                                                            long var412 = var2;
                                                            long var14 = var412 + 1L;
                                                            var14 = var412 * var14;
                                                            long var413 = var14 & 1L;
                                                            long var484;
                                                            int var414 = (var484 = var413 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                                                            if (var414 != 0) {
                                                                break label368;
                                                            }

                                                            double var415 = var278;
                                                            double var401 = TP.y(var400, var408, var415);
                                                            double var409 = var330.lastZ;
                                                            double var416 = var330.getZ();
                                                            double var444 = var278;
                                                            double var410 = TP.y(var409, var416, var444);
                                                            float var417 = this.FM;
                                                            float var13 = this.FM;
                                                            float var418 = var417 * var13;
                                                            var13 = this.FM;
                                                            var13 = 2.0F * var13;
                                                            var13 = 3.0F - var13;
                                                            float var419 = var418 * var13;
                                                            JL var423 = this.Q;
                                                            boolean var424 = var423.vb();
                                                            float var282;
                                                            if (var424) {
                                                                var2 += -1753128685;
                                                                var2 *= -3739185;
                                                                var2 ^= 1749597066;
                                                                var2 *= 1792644851;
                                                                var2 ^= -1426157196;
                                                                Integer var425 = var2;
                                                                if (var425 == null) {
                                                                    break label368;
                                                                }

                                                                int var426 = var330.hurtTime;
                                                                var13 = var426;
                                                                float var279 = var13 - var278;
                                                                int var428 = var3 + 1;
                                                                int var429 = var3 * var428;
                                                                int var430 = var429 & 1;
                                                                if (var430 != 0) {
                                                                    switch (var2) {
                                                                        case 78695662:
                                                                            var2 <<= 24;
                                                                            var2 -= 1720857185;
                                                                            var2 *= -285274451;
                                                                            var2 ^= -20136714;
                                                                            break label328;
                                                                        case 1196551242:
                                                                            var2 ^= -1433090102;
                                                                            break label328;
                                                                        case 1692032859:
                                                                        default:
                                                                            var2 ^= -1586824954;
                                                                            break label328;
                                                                    }
                                                                }
                                                                var2 = switch (var2) {
                                                                    case -1192658822 -> var2 ^ -2059254459;
                                                                    default -> var2 ^ -1682001197;
                                                                    case 78695662 -> {
                                                                        var2 &= 1713466336;
                                                                        yield var2 ^ -1550419430;
                                                                    }
                                                                };
                                                                Integer var431 = var2;
                                                                if (var431 == null) {
                                                                    break label368;
                                                                }

                                                                float var280 = var279 / 10.0F;
                                                                float var281 = TP.S(var280);
                                                                var282 = var281;
                                                                switch (var2) {
                                                                    case -1481231622:
                                                                        var2 &= -1732717691;
                                                                        var2 |= -182627251;
                                                                        var2 ^= -667604093;
                                                                        break;
                                                                    case -1072372910:
                                                                    default:
                                                                        var2 ^= 1131210111;
                                                                        break;
                                                                    case 1267013048:
                                                                        var2 ^= 289274975;
                                                                }
                                                            } else {
                                                                var2 ^= 1727318873;
                                                                var2 ^= 1475161474;
                                                                var2 -= -1204513131;
                                                                var2 ^= -375304757;
                                                                int var432 = var2 + 1;
                                                                int var433 = var2 * var432;
                                                                int var445 = var2 + 2;
                                                                int var434 = var433 * var445;
                                                                int var446 = var2 + 3;
                                                                int var435 = var434 * var446;
                                                                int var436 = var435 & 7;
                                                                if (var436 != 0) {
                                                                    break label368;
                                                                }

                                                                var282 = 0.0F;
                                                                var2 ^= 503305153;
                                                                var2 ^= 1378995849;
                                                            }

                                                            long var437 = var2;
                                                            long var15 = var437 + 1L;
                                                            var15 = var437 * var15;
                                                            long var17 = var437 + 2L;
                                                            var15 *= var17;
                                                            long var438 = var437 + 3L;
                                                            var15 *= var438;
                                                            long var439 = var15 & 7L;
                                                            long var485;
                                                            int var440 = (var485 = var439 - 0L) == 0L ? 0 : (var485 < 0L ? -1 : 1);
                                                            if (var440 != 0) {
                                                                break label368;
                                                            }

                                                            FrameContext var441 = var1.frame();
                                                            double var442 = var441.time();
                                                            Canvas var450 = var1.canvas();
                                                            Ud var16 = Ud.Z();
                                                            AuraPipeline var451 = var16.Ul();
                                                            WorldDraw var452 = var451.world();
                                                            var450.save();
                                                            Uq var453 = this.t;
                                                            float var454 = var453.WM();
                                                            var450.additive(var454);
                                                            r_2 var455 = this.IL;
                                                            Enum var456 = var455.A();
                                                            BZ var457 = (BZ)var456;
                                                            int var18 = var3 + 1;
                                                            var18 = var3 * var18;
                                                            int var19 = var3 + 2;
                                                            var18 *= var19;
                                                            var3 += 3;
                                                            var18 *= var3;
                                                            var3 = var18 & 7;
                                                            if (var3 == 0) {
                                                                var2 = switch (var2) {
                                                                    case -1337944261 -> var2 ^ -432096044;
                                                                    case 763919694 -> {
                                                                        var2 |= -1401511440;
                                                                        var2 += -625296242;
                                                                        yield var2 ^ 2105070537;
                                                                    }
                                                                    default -> var2 ^ 192087739;
                                                                };
                                                                var3 = var457.ordinal();
                                                                label269:
                                                                switch (var3) {
                                                                    case 0:
                                                                        var2 -= 2047004757;
                                                                        var2 += 497951520;
                                                                        var2 &= -1173174349;
                                                                        var2 += 876136101;
                                                                        var2 ^= 1037328088;
                                                                        Integer var257 = var2;
                                                                        if (var257 == null) {
                                                                            break label368;
                                                                        }

                                                                        int var258 = var2 + 563516136;
                                                                        var258 ^= 471525878;
                                                                        var258 += -678533486;
                                                                        var258 -= 1593562522;
                                                                        var258 ^= -212558663;
                                                                        this.q(var450, var452, var330, var369, var401, var410, var419, var282, var442, var258);
                                                                        var2 ^= 399015091;
                                                                        var2 |= -2087981763;
                                                                        var2 ^= -84531918;
                                                                        break;
                                                                    case 1:
                                                                        var2 >>= 28;
                                                                        var2 ^= -1025626805;
                                                                        var2 &= 2064555816;
                                                                        var2 <<= 3;
                                                                        var2 ^= -945854878;
                                                                        var3 = var2 + 1;
                                                                        var3 = var2 * var3;
                                                                        int var463 = var2 + 2;
                                                                        var3 *= var463;
                                                                        int var464 = var2 + 3;
                                                                        var3 *= var464;
                                                                        var3 &= 7;
                                                                        if (var3 != 0) {
                                                                            break label368;
                                                                        }

                                                                        var3 = var2 ^ -480407637;
                                                                        var3 ^= -578263227;
                                                                        this.dB(var450, var452, var330, var369, var401, var410, var419, var282, var442, var3);
                                                                        switch (var2) {
                                                                            case -1124937481:
                                                                            default:
                                                                                var2 ^= -676955102;
                                                                                break label269;
                                                                            case 261879650:
                                                                                var2 &= -1474209409;
                                                                                var2 &= -1957700954;
                                                                                var2 ^= 358127855;
                                                                                break label269;
                                                                            case 1018493772:
                                                                                var2 ^= 1614777537;
                                                                                break label269;
                                                                        }
                                                                    case 2:
                                                                        var2 ^= -418959037;
                                                                        var2 >>= 26;
                                                                        var2 *= 1548766911;
                                                                        var2 ^= -832807023;
                                                                        var17 = var2;
                                                                        long var472 = var17 + 1L;
                                                                        long var473 = var17 * var472;
                                                                        var17 = var473 & 1L;
                                                                        long var487;
                                                                        var3 = (var487 = var17 - 0L) == 0L ? 0 : (var487 < 0L ? -1 : 1);
                                                                        if (var3 != 0) {
                                                                            break label368;
                                                                        }

                                                                        var3 = var2 * -1147963057;
                                                                        var3 >>= 26;
                                                                        var3 &= -1119228192;
                                                                        var3 += 908894642;
                                                                        var3 ^= 1129671988;
                                                                        this.Ps(var450, var452, var330, var369, var401, var410, var419, var282, var442, var3);
                                                                        var2 |= 986039679;
                                                                        var2 ^= -1568395854;
                                                                        break;
                                                                    case 3:
                                                                        var2 |= -978971398;
                                                                        var2 -= 1727821589;
                                                                        var2 ^= 2007822671;
                                                                        var17 = var2;
                                                                        long var468 = var17 + 1L;
                                                                        long var469 = var17 * var468;
                                                                        long var21 = var17 + 2L;
                                                                        long var470 = var469 * var21;
                                                                        var17 += 3L;
                                                                        long var471 = var470 * var17;
                                                                        var17 = var471 & 7L;
                                                                        long var486;
                                                                        var3 = (var486 = var17 - 0L) == 0L ? 0 : (var486 < 0L ? -1 : 1);
                                                                        if (var3 != 0) {
                                                                            break label368;
                                                                        }

                                                                        var3 = var2 * -756646165;
                                                                        var3 ^= 2023994694;
                                                                        this.O(var450, var452, var330, var369, var401, var410, var419, var282, var442, var3);
                                                                        var2 ^= -433440216;
                                                                        var2 ^= 36963648;
                                                                        break;
                                                                    default:
                                                                        var2 &= 483303086;
                                                                        var2 ^= -750090458;
                                                                        Integer var236 = var2;
                                                                        if (var236 == null) {
                                                                            break label368;
                                                                        }

                                                                        int var237 = var2 ^ 1377296409;
                                                                        var237 *= 219738723;
                                                                        var237 &= 1943946800;
                                                                        var237 ^= 1736338158;
                                                                        this.Wn(var450, var452, var330, var369, var401, var410, var419, var282, var442, var237);
                                                                        var2 ^= -1756621541;
                                                                        var2 >>>= 11;
                                                                        var2 ^= 492032030;
                                                                }

                                                                var450.restore();
                                                                return;
                                                            }

                                                            var2 &= -1224574084;
                                                            var2 &= 1217986916;
                                                            var2 += 388796602;
                                                            var2 ^= -1070363781;
                                                        } else {
                                                            var2 *= 1242577841;
                                                            var2 *= 2059337633;
                                                            var2 ^= 200475202;
                                                            var2 &= -794047756;
                                                            var2 ^= -678077743;
                                                        }
                                                    } else {
                                                        var2 &= -848221182;
                                                        var2 |= 661839317;
                                                        var2 *= -873964799;
                                                        var2 ^= 682274384;
                                                    }
                                                } else {
                                                    switch (var2) {
                                                        case -1792585641:
                                                            var2 ^= 683642207;
                                                            var2 ^= 1787283341;
                                                            break;
                                                        case -1770568651:
                                                            var2 ^= 1471621160;
                                                            break;
                                                        case 1348889157:
                                                        default:
                                                            var2 ^= -1879676359;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var2 *= 1908035897;
                                        var2 ^= -1571019735;
                                    }
                                }
                            }
                        } else {
                            var2 += 219007152;
                            var2 ^= -1953829061;
                        }
                    }

                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var2 = var3 & 1;
                    if (var2 == 0) {
                        IllegalArgumentException var226 = new IllegalArgumentException();
                        throw var226;
                    }
                    break label368;
                }

                this.I = null;
                return;
            }

            this.J();
            return;
        }

        RuntimeException var232 = new RuntimeException();
        throw var232;
    }

    private static boolean FJ(BZ var0, int var1) {
        label138: {
            int var48;
            int var78;
            label144: {
                var78 = System.identityHashCode(var0);
                long var4 = var78;
                long var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var133;
                int var80 = (var133 = var4 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                label135:
                if (var80 == 0) {
                    var48 = switch (var1) {
                        case -1799069775 -> var1 ^ 201402685;
                        default -> var1 ^ -2124770123;
                        case 1711434865 -> {
                            var48 = var1 >>> 27;
                            var48 ^= -1473238788;
                            var48 -= 1490458468;
                            var48 -= 64560576;
                            yield var48 ^ 1006426187;
                        }
                    };
                    BZ var81 = BZ.CORNERS;
                    if (var0 != var81) {
                        var48 = switch (var48) {
                            default -> var48 ^ 1065456854;
                            case 1678160844 -> var48 ^ 1317332571;
                            case 1887218567 -> {
                                var48 ^= -116391041;
                                var48 -= -1184593757;
                                var48 -= -163842616;
                                yield var48 ^ -933503366;
                            }
                        };
                        Integer var82 = var48;
                        if (var82 == null) {
                            break label138;
                        }

                        BZ var83 = BZ.CHEVRONS;
                        long var5 = var78;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var134;
                        int var102 = (var134 = var5 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                        if (var102 != 0) {
                            switch (var48) {
                                case 295171319:
                                    var48 *= 1409270877;
                                    var48 += 623211687;
                                    var48 += -680544464;
                                    var48 ^= 768011423;
                                    break label135;
                                case 1059347249:
                                    var48 ^= 1581986083;
                                    break label135;
                                case 1566214804:
                                default:
                                    var48 ^= -1910688892;
                                    break label135;
                            }
                        }

                        var48 |= -1286674022;
                        var48 ^= 1805400118;
                        var48 |= 725501959;
                        var48 ^= -149950919;
                        Integer var103 = var48;
                        if (var103 == null) {
                            break label138;
                        }

                        if (var0 != var83) {
                            var48 = switch (var48) {
                                case -1533908764 -> var48 ^ 2015756675;
                                default -> var48 ^ 1080520297;
                                case 208675830 -> {
                                    var48 ^= -409616174;
                                    var48 &= -736620867;
                                    var48 |= 1150818958;
                                    var48 ^= -243180824;
                                    yield var48 ^ 1871264942;
                                }
                            };
                            int var84 = var48 + 1;
                            int var85 = var48 * var84;
                            int var86 = var85 & 1;
                            if (var86 != 0) {
                                break label138;
                            }

                            BZ var87 = BZ.SPINNER;
                            var5 = var78;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var135;
                            int var107 = (var135 = var5 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                            if (var107 != 0) {
                                var48 |= 1321811011;
                                var48 += -854190618;
                                var48 ^= -914998308;
                                break label135;
                            }

                            var48 ^= -292678442;
                            var48 ^= 1117730322;
                            Integer var108 = var48;
                            if (var108 == null) {
                                break label138;
                            }

                            if (var0 != var87) {
                                var48 = switch (var48) {
                                    case -159293908 -> {
                                        var48 ^= 760530145;
                                        var48 |= -1045213160;
                                        yield var48 ^ 942189853;
                                    }
                                    case 188241501 -> var48 ^ -844563944;
                                    default -> var48 ^ 935274169;
                                };
                                var4 = var48;
                                var6 = var4 + 1L;
                                var6 = var4 * var6;
                                var4 = var6 & 1L;
                                long var136;
                                int var90 = (var136 = var4 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                                if (var90 != 0) {
                                    break label138;
                                }

                                BZ var91 = BZ.SCIFI;
                                Integer var73 = var78;
                                if (var73 == null) {
                                    switch (var48) {
                                        case -471894080:
                                            var48 += 745352379;
                                            var48 *= 859857597;
                                            var48 ^= 500510146;
                                            break label135;
                                        case 351224069:
                                            var48 ^= -1621250949;
                                            break label135;
                                        case 1916754549:
                                        default:
                                            var48 ^= 371594024;
                                            break label135;
                                    }
                                }

                                var48 |= -402390941;
                                var48 -= 1525532154;
                                var48 *= 1505199331;
                                var48 ^= 1775138141;
                                var5 = var48;
                                var7 = var5 + 1L;
                                var7 = var5 * var7;
                                var9 = var5 + 2L;
                                var7 *= var9;
                                var5 += 3L;
                                var7 *= var5;
                                var5 = var7 & 7L;
                                long var137;
                                int var74 = (var137 = var5 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                                if (var74 != 0) {
                                    break label138;
                                }

                                if (var0 != var91) {
                                    var48 *= 970578079;
                                    var48 ^= 804103741;
                                    long var75 = var48;
                                    var5 = var75 + 1L;
                                    var5 = var75 * var5;
                                    long var76 = var5 & 1L;
                                    long var138;
                                    var74 = (var138 = var76 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                                    if (var74 != 0) {
                                        break label138;
                                    }

                                    var78 = 0;
                                    var48 &= -1570260641;
                                    var48 *= -1470012487;
                                    var48 -= 531109756;
                                    var48 |= -1077169708;
                                    var48 ^= -251130141;
                                    break label144;
                                }

                                var48 += 1595411228;
                                var48 <<= 26;
                                var48 ^= -976814825;
                            } else {
                                var48 -= 165820130;
                                var48 += -1541116267;
                                var48 |= -1090215656;
                                var48 |= 221050306;
                                var48 ^= -232191800;
                            }
                        } else {
                            switch (var48) {
                                case -1184326445:
                                default:
                                    var48 ^= 1110627079;
                                    break;
                                case -106514111:
                                    var48 ^= 1373811964;
                                    break;
                                case 208675830:
                                    var48 ^= -1523451618;
                                    var48 &= -1989000445;
                                    var48 ^= -997802217;
                            }
                        }
                    } else {
                        switch (var48) {
                            case 236751508:
                            default:
                                var48 ^= -2065038449;
                                break;
                            case 995792494:
                                var48 ^= -419876402;
                                break;
                            case 1887218567:
                                var48 &= -31809623;
                                var48 ^= 1037989526;
                        }
                    }

                    var4 = var48;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var139;
                    int var98 = (var139 = var4 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                    if (var98 != 0) {
                        break label138;
                    }

                    var78 = 1;
                    switch (var48) {
                        case -926097744:
                        default:
                            var48 ^= -253157149;
                            break label144;
                        case 1304886551:
                            var48 ^= -624215505;
                            var48 |= 1752352466;
                            var48 -= -1282949096;
                            var48 ^= -491753112;
                            var48 ^= -1482718786;
                            break label144;
                        case 1991718225:
                            var48 ^= 1142706173;
                            break label144;
                    }
                } else {
                    var48 = var1 & 1365938284;
                    var48 ^= -1566856851;
                }

                long var62 = var48;
                var4 = var62 + 1L;
                var4 = var62 * var4;
                var6 = var62 + 2L;
                var4 *= var6;
                long var63 = var62 + 3L;
                var4 *= var63;
                long var64 = var4 & 7L;
                long var140;
                var48 = (var140 = var64 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                if (var48 == 0) {
                    RuntimeException var66 = new RuntimeException();
                    throw var66;
                }
                break label138;
            }

            Integer var99 = var48;
            if (var99 != null) {
                return (var78 != 0);
            }
        }

        IllegalArgumentException var72 = new IllegalArgumentException();
        throw var72;
    }

    private void O(Canvas var1, WorldDraw var2, LivingEntity var3, double var4, double var6, double var8, float var10, float var11, double var12, int var14) {
        label103: {
            int var16 = System.identityHashCode(this);
            float var17 = var3.getWidth();
            double var112 = var17;
            double var113 = var112 * 1.25;
            double var114 = Math.max(0.45, var113);
            double var19 = var10;
            var19 = 0.3 * var19;
            var19 = 0.7 + var19;
            double var115 = var114 * var19;
            double var116 = var115;
            float var123 = var3.getHeight();
            var19 = var123;
            var19 = var6 + var19;
            var19 -= 0.1;
            var19 = var19;
            double var21 = 0.1;
            double var23 = var12 * 1000.0;
            var23 /= 6.0;
            Uq var25 = this.s;
            float var132 = var25.WM();
            double var133 = var132;
            long var27 = var16;
            long var29 = var27 + 1L;
            var29 = var27 * var29;
            long var31 = var27 + 2L;
            var29 *= var31;
            var27 += 3L;
            var29 *= var27;
            var27 = var29 & 7L;
            long var225;
            int var146 = (var225 = var27 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
            int var74;
            if (var146 != 0) {
                var74 = var14 | -1176727402;
                var74 -= 1677675642;
                var74 += 232969908;
                var74 ^= -847501278;
            } else {
                var74 = var14 * -312967257;
                var74 ^= -239115297;
                var27 = var74;
                var29 = var27 + 1L;
                var29 = var27 * var29;
                var27 = var29 & 1L;
                long var226;
                int var149 = (var226 = var27 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                if (var149 != 0) {
                    break label103;
                }

                var23 *= var133;
                var23 %= 360.0;
                var23 = var23;
                byte var134 = 0;
                int var135 = var134;
                var74 += 1022490182;
                var74 *= -1794481085;
                var74 ^= -423931323;

                label92:
                while (true) {
                    long var26 = var74;
                    long var28 = var26 + 1L;
                    var28 = var26 * var28;
                    var26 = var28 & 1L;
                    long var227;
                    int var137 = (var227 = var26 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                    if (var137 != 0) {
                        break label103;
                    }

                    if (var135 >= 3) {
                        var74 <<= 27;
                        var74 &= 482721779;
                        var74 *= 1176487445;
                        var74 ^= 2062246929;
                        long var104 = var74;
                        long var18 = var104 + 1L;
                        var18 = var104 * var18;
                        long var20 = var104 + 2L;
                        var18 *= var20;
                        long var105 = var104 + 3L;
                        var18 *= var105;
                        long var106 = var18 & 7L;
                        long var229;
                        var16 = (var229 = var106 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                        if (var16 == 0) {
                            return;
                        }
                        break label103;
                    }

                    var74 >>= 13;
                    var74 >>>= 16;
                    var74 ^= 1455577916;
                    Integer var138 = var74;
                    if (var138 == null) {
                        break label103;
                    }

                    double var139 = var135;
                    double var140 = var139 * 120.0;
                    double var141 = Math.toRadians(var140);
                    int var155 = var16 + 1;
                    int var156 = var16 * var155;
                    int var168 = var16 + 2;
                    int var157 = var156 * var168;
                    int var169 = var16 + 3;
                    int var158 = var157 * var169;
                    int var159 = var158 & 7;
                    if (var159 != 0) {
                        var74 |= -405861306;
                        var74 ^= -1720631636;
                        break;
                    }

                    var74 <<= 17;
                    var74 ^= -1000189314;
                    Integer var160 = var74;
                    if (var160 == null) {
                        break label103;
                    }

                    double var142 = var141;
                    byte var161 = 0;
                    int var162 = var161;
                    var74 *= 1392516251;
                    var74 >>= 10;
                    var74 ^= -1315170728;

                    while (true) {
                        int var170 = var74 + 1;
                        int var171 = var74 * var170;
                        int var30 = var74 + 2;
                        int var172 = var171 * var30;
                        var30 = var74 + 3;
                        int var173 = var172 * var30;
                        int var174 = var173 & 7;
                        if (var174 != 0) {
                            break label103;
                        }

                        if (var162 >= 72) {
                            var74 &= 1967198162;
                            var74 *= -1682307967;
                            var74 *= 2032294395;
                            var74 |= 864602418;
                            var74 ^= -1882163451;
                            int var143 = var135 + 1;
                            Integer var150 = var16;
                            if (var150 == null) {
                                var74 ^= 1361339013;
                                var74 <<= 30;
                                var74 ^= -926374264;
                                var74 &= 241817255;
                                var74 ^= 1727457107;
                                break label92;
                            }
                            var74 = switch (var74) {
                                case 482558285 -> var74 ^ -1348681564;
                                default -> var74 ^ 917859614;
                                case 2087368755 -> {
                                    var74 ^= -352233692;
                                    var74 ^= 1251152808;
                                    var74 ^= -1367187582;
                                    var74 -= -1028915670;
                                    yield var74 ^ -1492495711;
                                }
                            };
                            int var151 = var74 + 1;
                            int var152 = var74 * var151;
                            int var153 = var152 & 1;
                            if (var153 != 0) {
                                break label103;
                            }

                            var135 = var143;
                            var74 >>= 28;
                            var74 -= 56103652;
                            var74 <<= 31;
                            var74 ^= -1411878769;
                            break;
                        }

                        var74 += -1115022555;
                        var74 ^= -1987001249;
                        var74 ^= -178288577;
                        var74 ^= 653321412;
                        Integer var175 = var74;
                        if (var175 == null) {
                            break label103;
                        }

                        double var176 = var162;
                        double var177 = var176 * 5.0;
                        double var193 = var177 + 5.0;
                        int var33 = var74 << 19;
                        var33 ^= -475481513;
                        float var202 = p(var177, var23, var33);
                        int var34 = var74 - 1540821813;
                        var34 ^= -97250531;
                        float var205 = p(var193, var23, var34);
                        double var35 = Math.toRadians(var177);
                        var35 += var142;
                        double var37 = Math.toRadians(var193);
                        var37 += var142;
                        double var39 = var177 * 0.004;
                        var39 = var19 - var39;
                        long var41 = var16;
                        long var43 = var41 + 1L;
                        var43 = var41 * var43;
                        var41 = var43 & 1L;
                        long var228;
                        int var216 = (var228 = var41 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                        if (var216 != 0) {
                            var74 <<= 7;
                            var74 |= -1157334095;
                            var74 |= 1163995987;
                            var74 *= -1834697011;
                            var74 ^= 1082502724;
                            break label92;
                        }

                        var74 &= 846671977;
                        var74 &= 1074060485;
                        var74 += 923590541;
                        var74 ^= 1397967535;
                        var74 ^= -215363047;
                        double var217 = var193 * 0.004;
                        double var218 = var19 - var217;
                        double var220 = Math.cos(var35);
                        double var221 = var220 * var116;
                        double var222 = var4 + var221;
                        var35 = Math.sin(var35);
                        var35 *= var116;
                        var35 = var8 + var35;
                        double var45 = Math.cos(var37);
                        var45 *= var116;
                        var45 = var4 + var45;
                        var37 = Math.sin(var37);
                        var37 *= var116;
                        var37 = var8 + var37;
                        double var178 = var177 / 360.0;
                        float var179 = (float)var178;
                        float var186 = var135;
                        float var187 = var186 / 3.0F;
                        float var180 = var179 + var187;
                        double var188 = var193 / 360.0;
                        float var189 = (float)var188;
                        float var194 = var135;
                        float var195 = var194 / 3.0F;
                        float var190 = var189 + var195;
                        zS var196 = this.aY;
                        int var181 = var196.Na(var180, var12, var11);
                        float var197 = var202 * var10;
                        int var182 = DP.Y(var181, var197);
                        zS var198 = this.aY;
                        var30 = var198.Na(var190, var12, var11);
                        float var199 = var205 * var10;
                        var30 = DP.Y(var30, var199);
                        double var200 = var39 + var21;
                        double var203 = var218 + var21;
                        boolean var183 = var2.band(
                            var1, var222, var39, var35, var222, var200, var35, var45, var218, var37, var45, var203, var37, var182, var30, true
                        );
                        int var184 = var162 + 1;
                        var162 = var184;
                        var74 += 1862579360;
                        var74 <<= 7;
                        var74 ^= 1945105846;
                    }
                }
            }

            var16 = var74 + 1;
            var16 = var74 * var16;
            int var117 = var74 + 2;
            var16 *= var117;
            var74 += 3;
            var16 *= var74;
            var74 = var16 & 7;
            if (var74 == 0) {
                IllegalArgumentException var103 = new IllegalArgumentException();
                throw var103;
            }
        }

        IllegalStateException var102 = new IllegalStateException();
        throw var102;
    }

    private static float p(double var0, double var2, int var4) {
        label54: {
            int var6 = (int)var0;
            double var7 = var0 + var2;
            int var9 = var6 + 1;
            var9 = var6 * var9;
            int var10 = var6 + 2;
            var9 *= var10;
            var10 = var6 + 3;
            var9 *= var10;
            var9 &= 7;
            if (var9 != 0) {
                int var5 = var4 - -1716361374;
                var5 |= 1998780434;
                var5 ^= 1148946786;
            } else {
                label62: {
                    int var17 = var4 + -1007080036;
                    var17 ^= -581208807;
                    var9 = var17 + 1;
                    var9 = var17 * var9;
                    var9 &= 1;
                    if (var9 != 0) {
                        break label54;
                    }

                    var7 %= 360.0;
                    double var71;
                    var9 = (var71 = var7 - 100.0) == 0.0 ? 0 : (var71 < 0.0 ? -1 : 1);
                    float var46;
                    if (var9 < 0) {
                        var17 -= 945976406;
                        var17 ^= -2102904410;
                        var17 ^= -60786352;
                        var17 &= -1493041962;
                        var17 ^= 1418108539;
                        var7 /= 100.0;
                        var7 = 1.0 - var7;
                        var7 = 0.88 * var7;
                        var7 = 0.12 + var7;
                        long var64 = var6;
                        long var11 = var64 + 1L;
                        var11 = var64 * var11;
                        long var13 = var64 + 2L;
                        var11 *= var13;
                        long var65 = var64 + 3L;
                        var11 *= var65;
                        long var66 = var11 & 7L;
                        long var72;
                        var6 = (var72 = var66 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var17 += -2048859286;
                            var17 += -384277377;
                            var17 ^= 1917155767;
                            break label62;
                        }
                        var17 = switch (var17) {
                            case -973262965 -> var17 ^ -1593119754;
                            case -762920391 -> {
                                var17 -= 2120414811;
                                var17 <<= 23;
                                yield var17 ^ 197453688;
                            }
                            default -> var17 ^ 760714470;
                        };
                        Integer var44 = var17;
                        if (var44 == null) {
                            break label54;
                        }

                        float var45 = (float)var7;
                        var46 = var45;
                        switch (var17) {
                            case -1262076192:
                            default:
                                var17 ^= 980130311;
                                break;
                            case -456857736:
                                var17 >>= 17;
                                var17 <<= 1;
                                var17 &= 1655202248;
                                var17 ^= 664755675;
                                break;
                            case -311839963:
                                var17 ^= 60900527;
                        }
                    } else {
                        var17 >>= 8;
                        var17 >>= 27;
                        var17 ^= -2077282712;
                        var17 ^= -924131416;
                        int var53 = var17 + 1;
                        int var54 = var17 * var53;
                        int var55 = var54 & 1;
                        if (var55 != 0) {
                            break label54;
                        }

                        var46 = 0.12F;
                        var17 *= 430439411;
                        var17 &= -1526095868;
                        var17 += -640465747;
                        var17 ^= -1125393994;
                    }

                    Integer var41 = var17;
                    if (var41 != null) {
                        return var46;
                    }
                    break label54;
                }
            }

            AssertionError var47 = new AssertionError();
            throw var47;
        }

        AssertionError var42 = new AssertionError();
        throw var42;
    }

    private void Wn(Canvas var1, WorldDraw var2, LivingEntity var3, double var4, double var6, double var8, float var10, float var11, double var12, int var14) {
        label224: {
            int var68;
            label223: {
                int var16 = System.identityHashCode(this);
                int var17 = var16 + 1;
                var17 = var16 * var17;
                int var18 = var16 + 2;
                var17 *= var18;
                var18 = var16 + 3;
                var17 *= var18;
                var17 &= 7;
                if (var17 == 0) {
                    var68 = var14 * 1180653871;
                    var68 += 634292605;
                    var68 |= 1055784579;
                    var68 ^= -373717157;
                    var17 = var68 + 1;
                    var17 = var68 * var17;
                    var17 &= 1;
                    if (var17 != 0) {
                        break label224;
                    }

                    float var165 = var3.getHeight();
                    double var166 = var165;
                    double var167 = var166 * 0.5;
                    double var168 = var6 + var167;
                    int var19 = (var2.at(var1, var4, var168, var8)) ? 1 : 0;
                    if (var19 == 0) {
                        var68 &= 891829788;
                        var68 >>>= 2;
                        var68 ^= 1477082527;
                        var68 += -1686328214;
                        var68 ^= -2002169383;
                        return;
                    }

                    var68 += -1268022898;
                    var68 *= 183479123;
                    var68 ^= -13324029;
                    var68 ^= 740977283;
                    long var199 = var68;
                    long var21 = var199 + 1L;
                    var21 = var199 * var21;
                    long var23 = var199 + 2L;
                    var21 *= var23;
                    long var200 = var199 + 3L;
                    var21 *= var200;
                    long var201 = var21 & 7L;
                    long var380;
                    var19 = (var380 = var201 - 0L) == 0L ? 0 : (var380 < 0L ? -1 : 1);
                    if (var19 != 0) {
                        break label224;
                    }

                    float var203 = var2.x();
                    float var20 = var2.y();
                    float var235 = var2.unitsPerBlock();
                    Projection var22 = var2.projection();
                    double var243 = var22.cameraX();
                    double var244 = var243 - var4;
                    Projection var24 = var2.projection();
                    double var271 = var24.cameraZ();
                    double var272 = var271 - var8;
                    double var26 = Math.hypot(var244, var272);
                    var26 = Math.max(0.001, var26);
                    long var28 = var16;
                    long var30 = var28 + 1L;
                    var30 = var28 * var30;
                    long var32 = var28 + 2L;
                    var30 *= var32;
                    var28 += 3L;
                    var30 *= var28;
                    var28 = var30 & 7L;
                    long var381;
                    int var332 = (var381 = var28 - 0L) == 0L ? 0 : (var381 < 0L ? -1 : 1);
                    if (var332 != 0) {
                        var68 >>>= 4;
                        var68 -= 520415453;
                        var68 >>= 25;
                        var68 ^= 1394856559;
                    } else {
                        var68 = switch (var68) {
                            case -981731709 -> var68 ^ 1592128528;
                            case -482567658 -> {
                                var68 |= -458974878;
                                yield var68 ^ -1268942719;
                            }
                            default -> var68 ^ -1438430206;
                        };
                        int var333 = var68 + 1;
                        int var334 = var68 * var333;
                        int var29 = var68 + 2;
                        int var335 = var334 * var29;
                        var29 = var68 + 3;
                        int var336 = var335 * var29;
                        int var337 = var336 & 7;
                        if (var337 != 0) {
                            break label224;
                        }

                        float var338 = var3.getWidth();
                        double var339 = var338;
                        double var340 = var339 * 0.75;
                        double var245 = var244 / var26;
                        double var246 = var245 * var340;
                        double var247 = var4 + var246;
                        double var273 = var272 / var26;
                        double var274 = var273 * var340;
                        double var275 = var8 + var274;
                        int var169 = (var2.at(var1, var247, var168, var275)) ? 1 : 0;
                        if (var169 == 0) {
                            var68 ^= -1491362160;
                            var68 -= 890461677;
                            var68 ^= -1790527584;
                            var169 = var68 + 1;
                            var169 = var68 * var169;
                            var18 = var68 + 2;
                            var169 *= var18;
                            var18 = var68 + 3;
                            var169 *= var18;
                            var169 &= 7;
                            if (var169 == 0) {
                                return;
                            }
                            break label224;
                        }
                        var68 = switch (var68) {
                            default -> var68 ^ -846140937;
                            case 844207569 -> var68 ^ 1782177405;
                            case 1407312887 -> {
                                var68 -= 1074175577;
                                yield var68 ^ 2013104525;
                            }
                        };
                        var169 = var68 + 1;
                        var169 = var68 * var169;
                        var18 = var68 + 2;
                        var169 *= var18;
                        var18 = var68 + 3;
                        var169 *= var18;
                        var169 &= 7;
                        if (var169 != 0) {
                            break label224;
                        }

                        float var175 = var2.depth();
                        Uq var189 = this.Tc;
                        float var190 = var189.WM();
                        float var191 = 0.6F * var190;
                        float var192 = var191 * var235;
                        float var236 = 0.4F * var10;
                        float var237 = 1.4F - var236;
                        float var193 = var192 * var237;
                        float var194 = var193;
                        double var238 = i;
                        double var239 = var12 * var238;
                        Uq var250 = this.s;
                        float var251 = var250.WM();
                        double var252 = var251;
                        double var240 = var239 * var252;
                        float var241 = (float)var240;
                        float var242 = var241;
                        float var248 = 0.8F * var10;
                        float var249 = var248;
                        var1.save();
                        var1.depth(var175);
                        var1.translate(var203, var20);
                        var1.rotate(var241);
                        long var204 = var16;
                        var23 = var204 + 1L;
                        var23 = var204 * var23;
                        long var25 = var204 + 2L;
                        var23 *= var25;
                        long var205 = var204 + 3L;
                        var23 *= var205;
                        long var206 = var23 & 7L;
                        long var382;
                        var169 = (var382 = var206 - 0L) == 0L ? 0 : (var382 < 0L ? -1 : 1);
                        if (var169 != 0) {
                            switch (var68) {
                                case -1525407140:
                                default:
                                    var68 ^= -1720477890;
                                    break;
                                case -602847786:
                                    var68 ^= -1585711930;
                                    break;
                                case 1680264211:
                                    var68 |= -1421013355;
                                    var68 &= -13092846;
                                    var68 ^= 1140073866;
                            }
                        } else {
                            var68 &= 1641630651;
                            var68 ^= -127115628;
                            r_2 var177 = this.IL;
                            Enum var178 = var177.A();
                            BZ var179 = (BZ)var178;
                            BZ var180 = var179;
                            BZ var207 = BZ.SCIFI;
                            if (var179 == var207) {
                                var68 *= 318833639;
                                var68 <<= 12;
                                var68 += -318388312;
                                var68 ^= 986269595;
                                var19 = var68 + 1;
                                var19 = var68 * var19;
                                var19 &= 1;
                                if (var19 != 0) {
                                    break label224;
                                }

                                zS var211 = this.aY;
                                var19 = var211.Na(0.0F, var12, var11);
                                var19 = DP.Y(var19, var248);
                                SpriteShape var219 = SpriteShape.SCIFI;
                                float var257 = var193 * 0.35F;
                                int var276 = var19 | 16777215;
                                int var298 = var16 + 1;
                                int var299 = var16 * var298;
                                int var300 = var299 & 1;
                                if (var300 == 0) {
                                    var68 |= 1509822890;
                                    var68 += 184222348;
                                    var68 *= 145065343;
                                    var68 &= -1082260197;
                                    var68 ^= -1740483021;
                                    int var301 = var68 + 1;
                                    int var302 = var68 * var301;
                                    int var303 = var302 & 1;
                                    if (var303 != 0) {
                                        break label224;
                                    }

                                    int var277 = DP.Z(var19, var276, 0.2F);
                                    var1.sprite(var219, 0.0F, 0.0F, var193, var257, var277, var19, 0.0F);
                                    var68 += -650640029;
                                    var68 ^= 412695620;
                                    var68 ^= -587646274;
                                    break label223;
                                }

                                var68 ^= 200159917;
                                var68 &= -1277531671;
                                var68 *= -936137023;
                                var68 |= 1454493759;
                                var68 ^= 1394727719;
                            } else {
                                var68 &= -1481452002;
                                var68 ^= -589274047;
                                var68 -= 1878146869;
                                var68 ^= -1129615322;
                                long var214 = var68;
                                var23 = var214 + 1L;
                                var23 = var214 * var23;
                                long var215 = var23 & 1L;
                                long var383;
                                var19 = (var383 = var215 - 0L) == 0L ? 0 : (var383 < 0L ? -1 : 1);
                                if (var19 != 0) {
                                    break label224;
                                }

                                int var217 = 0;
                                int var220 = var16 + 1;
                                int var221 = var16 * var220;
                                int var222 = var221 & 1;
                                if (var222 == 0) {
                                    var68 |= 1018434650;
                                    var68 &= 1705536451;
                                    var68 ^= 1893003457;
                                    var217 = var217;
                                    var68 ^= -2061718346;
                                    var68 |= 1672115447;
                                    var68 += -1664805156;
                                    var68 ^= 3544666;

                                    label213:
                                    while (true) {
                                        int var223 = var68 + 1;
                                        int var224 = var68 * var223;
                                        int var225 = var224 & 1;
                                        if (var225 != 0) {
                                            break label224;
                                        }

                                        if (var217 >= 4) {
                                            switch (var68) {
                                                case -1868988279:
                                                    var68 &= 1819098315;
                                                    var68 *= -1673907627;
                                                    var68 += -315818091;
                                                    var68 ^= -1950436763;
                                                    break label223;
                                                case 1548120541:
                                                    var68 ^= -927940793;
                                                    break label223;
                                                case 2041345643:
                                                default:
                                                    var68 ^= -30057278;
                                                    break label223;
                                            }
                                        }

                                        var68 += 713147524;
                                        var68 <<= 26;
                                        var68 *= 1894509993;
                                        var68 <<= 8;
                                        var68 ^= 1122737196;
                                        Integer var226 = var68;
                                        if (var226 == null) {
                                            break label224;
                                        }

                                        zS var227 = this.aY;
                                        float var260 = var217;
                                        float var261 = var260 / 4.0F;
                                        float var278 = var242 * 0.08F;
                                        float var262 = var261 + var278;
                                        int var228 = var227.Na(var262, var12, var11);
                                        int var229 = DP.Y(var228, var249);
                                        int var263 = var229 | 16777215;
                                        int var264 = DP.Z(var229, var263, 0.2F);
                                        var1.save();
                                        float var279 = var217;
                                        float var280 = var279 * (float) Math.PI;
                                        float var281 = var280 / 2.0F;
                                        var1.rotate(var281);
                                        Integer var282 = var16;
                                        if (var282 == null) {
                                            var68 -= 1743462335;
                                            var68 -= -868438670;
                                            var68 ^= -624393128;
                                            var68 ^= 401293035;
                                            var68 ^= 1866226128;
                                            break;
                                        }

                                        var68 |= -1218729962;
                                        var68 *= 1901473359;
                                        var68 += 1490233709;
                                        var68 >>>= 12;
                                        var68 ^= 1384536650;
                                        long var283 = var68;
                                        long var315 = var283 + 1L;
                                        long var316 = var283 * var315;
                                        long var284 = var316 & 1L;
                                        long var384;
                                        int var285 = (var384 = var284 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                                        if (var285 != 0) {
                                            break label224;
                                        }

                                        int var286 = var180.ordinal();
                                        label204:
                                        switch (var286) {
                                            case 4:
                                                var68 = switch (var68) {
                                                    case -1757377613 -> var68 ^ -60245889;
                                                    default -> var68 ^ 1668785104;
                                                    case 1384986844 -> {
                                                        var68 += -643565945;
                                                        yield var68 ^ -1361612980;
                                                    }
                                                };
                                                long var293 = var68;
                                                long var323 = var293 + 1L;
                                                long var324 = var293 * var323;
                                                var28 = var293 + 2L;
                                                long var325 = var324 * var28;
                                                long var294 = var293 + 3L;
                                                long var326 = var325 * var294;
                                                long var295 = var326 & 7L;
                                                long var388;
                                                int var296 = (var388 = var295 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                                                if (var296 != 0) {
                                                    break label224;
                                                }

                                                float var297 = var194 * 0.42F;
                                                float var308 = 0.55F * var297;
                                                float var309 = var194 - var308;
                                                SpriteShape var327 = SpriteShape.CORNER;
                                                float var329 = -var309;
                                                var28 = var16;
                                                var30 = var28 + 1L;
                                                var30 = var28 * var30;
                                                var32 = var28 + 2L;
                                                var30 *= var32;
                                                var28 += 3L;
                                                var30 *= var28;
                                                var28 = var30 & 7L;
                                                long var389;
                                                int var355 = (var389 = var28 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                                                if (var355 != 0) {
                                                    var68 >>>= 19;
                                                    var68 |= 1907473304;
                                                    var68 -= 1348868241;
                                                    var68 ^= -1919447341;
                                                    break label213;
                                                }

                                                var68 *= 344956605;
                                                var68 ^= -1414590307;
                                                int var356 = var68 + 1;
                                                int var357 = var68 * var356;
                                                var29 = var68 + 2;
                                                int var358 = var357 * var29;
                                                var29 = var68 + 3;
                                                int var359 = var358 * var29;
                                                int var360 = var359 & 7;
                                                if (var360 != 0) {
                                                    break label224;
                                                }

                                                float var361 = var297 * 0.45F;
                                                var1.sprite(var327, var309, var329, var297, var361, var264, var229, 0.0F);
                                                switch (var68) {
                                                    case -1113775835:
                                                        var68 ^= 1930845997;
                                                        break label204;
                                                    case -294357970:
                                                        var68 *= 2105828007;
                                                        var68 *= 1545201253;
                                                        var68 ^= -1965443624;
                                                        break label204;
                                                    case 1508980116:
                                                    default:
                                                        var68 ^= -1467381914;
                                                        break label204;
                                                }
                                            case 5:
                                                var68 += 114947865;
                                                var68 |= -1680240598;
                                                var68 ^= 646508550;
                                                long var288 = var68;
                                                long var318 = var288 + 1L;
                                                long var319 = var288 * var318;
                                                var28 = var288 + 2L;
                                                long var320 = var319 * var28;
                                                long var289 = var288 + 3L;
                                                long var321 = var320 * var289;
                                                long var290 = var321 & 7L;
                                                long var387;
                                                int var291 = (var387 = var290 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                                                if (var291 != 0) {
                                                    break label224;
                                                }

                                                SpriteShape var292 = SpriteShape.CHEVRON;
                                                float var306 = -var194;
                                                float var307 = var306 * 0.68F;
                                                float var322 = var194 * 0.38F;
                                                float var328 = var194 * 0.18F;
                                                Integer var349 = var16;
                                                if (var349 == null) {
                                                    switch (var68) {
                                                        case -42512391:
                                                            var68 *= -345851837;
                                                            var68 >>= 18;
                                                            var68 &= 2127730018;
                                                            var68 *= -2065891557;
                                                            var68 ^= 1663933848;
                                                            break label213;
                                                        case 436954867:
                                                        default:
                                                            var68 ^= 1536872353;
                                                            break label213;
                                                        case 1327721498:
                                                            var68 ^= 1043730755;
                                                            break label213;
                                                    }
                                                }

                                                var68 += -1668243488;
                                                var68 += 2118274117;
                                                var68 ^= -1750569731;
                                                Integer var350 = var68;
                                                if (var350 == null) {
                                                    break label224;
                                                }

                                                var1.sprite(var292, 0.0F, var307, var322, var328, var264, var229, 0.0F);
                                                var68 *= -2099411613;
                                                var68 |= -1830299541;
                                                var68 -= 443825338;
                                                var68 >>= 22;
                                                var68 ^= 84623859;
                                                break;
                                            default:
                                                var68 *= 197181189;
                                                var68 ^= -1165608625;
                                                SpriteShape var287 = SpriteShape.BLADE;
                                                float var304 = -var194;
                                                float var305 = var304 * 0.5F;
                                                float var317 = var194 * 0.48F;
                                                float var27 = var194 * 0.2F;
                                                var28 = var16;
                                                var30 = var28 + 1L;
                                                var30 = var28 * var30;
                                                var28 = var30 & 1L;
                                                long var385;
                                                int var343 = (var385 = var28 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                                                if (var343 != 0) {
                                                    var68 |= 302726530;
                                                    var68 &= 236554672;
                                                    var68 ^= -1495981032;
                                                    break label213;
                                                }

                                                var68 ^= 732504396;
                                                var68 >>= 12;
                                                var68 ^= -1110185008;
                                                var68 &= -330297433;
                                                var68 ^= -1224497776;
                                                var28 = var68;
                                                var30 = var28 + 1L;
                                                var30 = var28 * var30;
                                                var32 = var28 + 2L;
                                                var30 *= var32;
                                                var28 += 3L;
                                                var30 *= var28;
                                                var28 = var30 & 7L;
                                                long var386;
                                                int var347 = (var386 = var28 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                                                if (var347 != 0) {
                                                    break label224;
                                                }

                                                var1.sprite(var287, 0.0F, var305, var317, var27, var264, var229, 0.0F);
                                                var68 -= -1532034964;
                                                var68 ^= -1465904453;
                                        }

                                        Integer var230 = var68;
                                        if (var230 == null) {
                                            break label224;
                                        }

                                        var1.restore();
                                        int var231 = var217 + 1;
                                        var23 = var16;
                                        var25 = var23 + 1L;
                                        var25 = var23 * var25;
                                        var23 = var25 & 1L;
                                        long var390;
                                        int var267 = (var390 = var23 - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                                        if (var267 != 0) {
                                            var68 ^= -1108634665;
                                            var68 ^= -339541667;
                                            break;
                                        }
                                        var68 = switch (var68) {
                                            case -84623598 -> {
                                                var68 -= 1394588596;
                                                var68 ^= 373104430;
                                                yield var68 ^ 939505029;
                                            }
                                            case 679597301 -> var68 ^ 1722389158;
                                            default -> var68 ^ 715345335;
                                        };
                                        var23 = var68;
                                        var25 = var23 + 1L;
                                        var25 = var23 * var25;
                                        var23 = var25 & 1L;
                                        long var391;
                                        int var270 = (var391 = var23 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                                        if (var270 != 0) {
                                            break label224;
                                        }

                                        var217 = var231;
                                        var68 |= 1833449016;
                                        var68 ^= 1511135012;
                                        var68 <<= 23;
                                        var68 ^= -65437559;
                                    }
                                } else {
                                    var68 -= -1720659636;
                                    var68 >>>= 5;
                                    var68 &= 1368388150;
                                    var68 ^= -1386508386;
                                }
                            }
                        }
                    }
                } else {
                    switch (var14) {
                        case 453658718:
                            var68 = var14 ^ 1698205969;
                            break;
                        case 1842889113:
                        default:
                            var68 = var14 ^ -75232198;
                            break;
                        case 1961896702:
                            var68 = var14 - -550346233;
                            var68 -= 89678977;
                            var68 &= -1843407165;
                            var68 ^= 1020881370;
                    }
                }

                Integer var152 = var68;
                if (var152 != null) {
                    IllegalArgumentException var154 = new IllegalArgumentException();
                    throw var154;
                }
                break label224;
            }

            long var155 = var68;
            long var195 = var155 + 1L;
            var195 = var155 * var195;
            var155 = var195 & 1L;
            long var392;
            int var157 = (var392 = var155 - 0L) == 0L ? 0 : (var392 < 0L ? -1 : 1);
            if (var157 == 0) {
                var1.restore();
                return;
            }
        }

        RuntimeException var153 = new RuntimeException();
        throw var153;
    }

    private void q(Canvas var1, WorldDraw var2, LivingEntity var3, double var4, double var6, double var8, float var10, float var11, double var12, int var14) {
        label176: {
            int var16 = System.identityHashCode(this);
            Uq var17 = this.z;
            int var148 = var17.B();
            int var149 = var148;
            Uq var18 = this.Bl;
            float var150 = var18.WM();
            float var151 = 10.0F * var150;
            int var152 = Math.round(var151);
            int var153 = var152;
            int var19 = var152 * 3;
            var19 = var19;
            float var20 = var3.getWidth();
            double var155 = var20;
            double var156 = var155 * 1.12;
            double var157 = Math.max(0.45, var156);
            double var22 = var10;
            var22 = 0.3 * var22;
            var22 = 0.7 + var22;
            double var158 = var157 * var22;
            double var159 = var158;
            float var162 = var3.getHeight();
            var22 = var162;
            var22 *= 0.5;
            var22 = var6 + var22;
            var22 += 0.1;
            var22 = var22;
            double var24 = var12 * 3.0;
            Uq var26 = this.s;
            float var170 = var26.WM();
            double var171 = var170;
            var24 *= var171;
            var24 = var24;
            var26 = this.D;
            int var27 = var16 + 1;
            var27 = var16 * var27;
            var27 &= 1;
            int var57;
            if (var27 != 0) {
                var57 = var14 | 589765922;
                var57 *= -1810275591;
                var57 &= -228760240;
                var57 <<= 10;
                var57 ^= -380299654;
            } else {
                var57 = var14 ^ -913327907;
                var57 |= -287810207;
                var57 |= 621333447;
                var57 -= 623256825;
                var57 ^= -1086574003;
                long var178 = var57;
                long var29 = var178 + 1L;
                var29 = var178 * var29;
                long var31 = var178 + 2L;
                var29 *= var31;
                long var179 = var178 + 3L;
                var29 *= var179;
                long var180 = var29 & 7L;
                long var345;
                var27 = (var345 = var180 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
                if (var27 != 0) {
                    break label176;
                }

                float var173 = var26.WM();
                float var174 = var173 * var10;
                float var175 = var174;
                float var182 = 0.1F * var10;
                float var183 = var182;
                int var28 = var148 + 2;
                var28 /= 3;
                var28 = var28;
                byte var189 = 0;
                int var190 = var189;
                var57 += -1351122478;
                var57 ^= -1939453405;
                var57 &= 1375521799;
                var57 *= -2015974919;
                var57 ^= -1148258458;

                label173:
                while (true) {
                    if (var190 >= var149) {
                        var57 += -2021998708;
                        var57 -= 332616653;
                        var57 ^= 1065224060;
                        var16 = var57 + 1;
                        var16 = var57 * var16;
                        var57 = var16 & 1;
                        if (var57 == 0) {
                            return;
                        }
                        break label176;
                    }

                    var57 += -1211200171;
                    var57 *= -2037571505;
                    var57 |= -1943199756;
                    var57 |= -1833235741;
                    var57 ^= 2122980809;
                    int var30 = var57 + 1;
                    var30 = var57 * var30;
                    int var202 = var57 + 2;
                    var30 *= var202;
                    int var203 = var57 + 3;
                    var30 *= var203;
                    var30 &= 7;
                    if (var30 != 0) {
                        break label176;
                    }

                    var30 = var190 % 3;
                    float var204 = var30;
                    float var205 = var204 * (float) (Math.PI * 2);
                    double var206 = var205;
                    double var207 = var206 / 3.0;
                    double var33 = Math.cos(var207);
                    var33 = var33;
                    double var35 = Math.sin(var207);
                    var35 = var35;
                    double var37 = Math.sin(var207);
                    var37 = -var37;
                    double var39 = BD;
                    var39 = Math.sin(var39);
                    var37 *= var39;
                    var37 = var37;
                    var39 = BD;
                    var39 = Math.cos(var39);
                    var39 = var39;
                    double var208 = Math.cos(var207);
                    double var41 = BD;
                    var41 = Math.sin(var41);
                    double var209 = var208 * var41;
                    double var210 = var209;
                    int var231 = var190 / 3;
                    float var232 = var231;
                    float var233 = var232 * (float) (Math.PI * 2);
                    float var42 = var28;
                    float var234 = var233 / var42;
                    var41 = var234;
                    double var43 = var30;
                    var43 *= 0.9;
                    var41 += var43;
                    var41 = var41;
                    int var196 = 0;
                    long var239 = var16;
                    long var45 = var239 + 1L;
                    var45 = var239 * var45;
                    long var240 = var45 & 1L;
                    long var346;
                    int var241 = (var346 = var240 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                    if (var241 != 0) {
                        switch (var57) {
                            case -1070259658:
                                var57 <<= 29;
                                var57 ^= 692409978;
                                break label173;
                            case 1129647158:
                                var57 ^= -744083526;
                                break label173;
                            case 1509125558:
                            default:
                                var57 ^= -644449016;
                                break label173;
                        }
                    }

                    var57 <<= 18;
                    var57 ^= 1363997381;
                    int var242 = var57 + 1;
                    int var243 = var57 * var242;
                    int var44 = var57 + 2;
                    int var244 = var243 * var44;
                    var44 = var57 + 3;
                    int var245 = var244 * var44;
                    int var246 = var245 & 7;
                    if (var246 != 0) {
                        break label176;
                    }

                    var196 = var196;
                    var57 -= -1299461923;
                    var57 &= 969220769;
                    var57 ^= 1407925911;

                    while (true) {
                        long var247 = var57;
                        var45 = var247 + 1L;
                        var45 = var247 * var45;
                        long var47 = var247 + 2L;
                        var45 *= var47;
                        long var248 = var247 + 3L;
                        var45 *= var248;
                        long var249 = var45 & 7L;
                        long var347;
                        int var250 = (var347 = var249 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                        if (var250 != 0) {
                            break label176;
                        }

                        if (var196 >= var19) {
                            var57 >>>= 26;
                            var57 >>>= 4;
                            var57 |= 2008133784;
                            var57 ^= 1490236899;
                            long var198 = var57;
                            long var32 = var198 + 1L;
                            var32 = var198 * var32;
                            long var199 = var32 & 1L;
                            long var352;
                            var196 = (var352 = var199 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                            if (var196 != 0) {
                                break label176;
                            }

                            var196 = var190 + 1;
                            int var211 = var16 + 1;
                            int var212 = var16 * var211;
                            int var213 = var212 & 1;
                            if (var213 != 0) {
                                switch (var57) {
                                    case 449617788:
                                        var57 ^= 1697669505;
                                        break label173;
                                    case 794985850:
                                        var57 ^= 114621088;
                                        var57 &= 786531445;
                                        var57 *= -1788206221;
                                        var57 ^= -1864529526;
                                        break label173;
                                    case 1800942059:
                                    default:
                                        var57 ^= -390084281;
                                        break label173;
                                }
                            }
                            var57 = switch (var57) {
                                case -2002736572 -> var57 ^ 436314680;
                                default -> var57 ^ -572285347;
                                case 794985850 -> {
                                    var57 |= -1642601893;
                                    var57 |= -1186841400;
                                    yield var57 ^ -1984676082;
                                }
                            };
                            var190 = var196;
                            var57 ^= -1591815109;
                            var57 |= -1811448206;
                            var57 -= 1902068206;
                            var57 ^= 621359520;
                            break;
                        }
                        var57 = switch (var57) {
                            case -1667692054 -> var57 ^ 1383626128;
                            default -> var57 ^ -920368969;
                            case 1927945783 -> {
                                var57 -= 630470396;
                                yield var57 ^ -930934681;
                            }
                        };
                        float var251 = var196;
                        float var262 = var19;
                        float var252 = var251 / var262;
                        double var263 = var24 + var41;
                        double var46 = var252;
                        var46 = 1.0 - var46;
                        double var48 = var153;
                        var46 *= var48;
                        var46 *= 0.15;
                        double var264 = var263 - var46;
                        var46 = Math.cos(var264);
                        var46 *= var159;
                        double var265 = Math.sin(var264);
                        double var266 = var265 * var159;
                        var48 = var33 * var46;
                        var48 = var4 + var48;
                        double var50 = var37 * var266;
                        var48 += var50;
                        Integer var338 = var16;
                        if (var338 == null) {
                            switch (var57) {
                                case -2049509540:
                                    var57 >>= 16;
                                    var57 >>>= 9;
                                    var57 *= -446407263;
                                    var57 &= -1229371878;
                                    var57 ^= -344714120;
                                    break label173;
                                case -979087394:
                                default:
                                    var57 ^= -637262692;
                                    break label173;
                                case -219517220:
                                    var57 ^= 964157014;
                                    break label173;
                            }
                        }

                        var57 &= -467740476;
                        var57 ^= -720512795;
                        long var339 = var57;
                        long var52 = var339 + 1L;
                        var52 = var339 * var52;
                        long var340 = var52 & 1L;
                        long var348;
                        int var341 = (var348 = var340 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                        if (var341 != 0) {
                            break label176;
                        }

                        var50 = var39 * var266;
                        var50 = var22 + var50;
                        var46 = var35 * var46;
                        var46 = var8 + var46;
                        double var267 = var210 * var266;
                        double var268 = var46 + var267;
                        int var269 = (var2.at(var1, var48, var50, var268)) ? 1 : 0;
                        if (var269 == 0) {
                            var57 += 1060177688;
                            var57 ^= 1733659101;
                            Integer var270 = var57;
                            if (var270 == null) {
                                break label176;
                            }

                            var57 &= -1616880444;
                            var57 &= -1593800938;
                            var57 *= 1366379585;
                            var57 |= -899146770;
                            var57 ^= 1491739032;
                        } else {
                            var57 = switch (var57) {
                                case -954758522 -> var57 ^ -1932655949;
                                default -> var57 ^ 1553015373;
                                case 1360726177 -> {
                                    var57 += -1637822658;
                                    var57 -= -78523571;
                                    yield var57 ^ 1667149414;
                                }
                            };
                            Integer var271 = var57;
                            if (var271 == null) {
                                break label176;
                            }

                            float var272 = TP.GO(var183, var175, var252);
                            var45 = var16;
                            var47 = var45 + 1L;
                            var47 = var45 * var47;
                            var45 = var47 & 1L;
                            long var349;
                            int var288 = (var349 = var45 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                            if (var288 != 0) {
                                var57 ^= 1494744298;
                                var57 ^= 656801892;
                                break label173;
                            }

                            var57 -= 1496464444;
                            var57 ^= 247981201;
                            int var289 = var57 + 1;
                            int var290 = var57 * var289;
                            int var314 = var57 + 2;
                            int var291 = var290 * var314;
                            int var315 = var57 + 3;
                            int var292 = var291 * var315;
                            int var293 = var292 & 7;
                            if (var293 != 0) {
                                break label176;
                            }

                            float var273 = var272 * 0.5F;
                            float var294 = var2.unitsPerBlock();
                            float var274 = var273 * var294;
                            float var350;
                            int var295 = (var350 = var274 - 0.15F) == 0.0F ? 0 : (var350 < 0.0F ? -1 : 1);
                            if (var295 < 0) {
                                var57 ^= 1239008344;
                                var57 |= -231972258;
                                var57 ^= -217607475;
                                var57 *= -166114045;
                                var57 ^= 703532212;
                                Integer var296 = var57;
                                if (var296 == null) {
                                    break label176;
                                }

                                var57 -= 200463863;
                                var57 *= -713156567;
                                var57 ^= -1201645803;
                            } else {
                                var57 ^= 308838894;
                                var57 -= -1208891441;
                                var57 &= 1632212910;
                                var57 &= -1822785601;
                                var57 ^= 830382637;
                                zS var297 = this.aY;
                                float var316 = var190;
                                float var322 = var149;
                                float var317 = var316 / var322;
                                Integer var323 = var16;
                                if (var323 == null) {
                                    switch (var57) {
                                        case 825663877:
                                            var57 -= 1601115097;
                                            var57 &= -1878961807;
                                            var57 ^= 2034521946;
                                            break label173;
                                        case 947261074:
                                        default:
                                            var57 ^= 696491705;
                                            break label173;
                                        case 1519055416:
                                            var57 ^= 1864178142;
                                            break label173;
                                    }
                                }

                                var57 |= 1355822662;
                                var57 &= -1297081407;
                                var57 += 196555298;
                                var57 ^= 326062288;
                                int var324 = var57 + 1;
                                int var325 = var57 * var324;
                                int var335 = var57 + 2;
                                int var326 = var325 * var335;
                                int var336 = var57 + 3;
                                int var327 = var326 * var336;
                                int var328 = var327 & 7;
                                if (var328 != 0) {
                                    break label176;
                                }

                                float var329 = var252 * 0.5F;
                                float var318 = var317 + var329;
                                int var298 = var297.Na(var318, var12, var11);
                                float var253 = var252 * var10;
                                float var254 = var253 * 0.3F;
                                int var255 = DP.Y(var298, var254);
                                var1.save();
                                float var299 = var2.depth();
                                var1.depth(var299);
                                SpriteShape var300 = SpriteShape.GLOW;
                                float var319 = var2.x();
                                float var330 = var2.y();
                                float var337 = var274 * 0.16F;
                                float var275 = var274 * 0.84F;
                                var1.sprite(var300, var319, var330, var337, var275, var255, var255, 0.0F);
                                var1.restore();
                                switch (var57) {
                                    case -1280195716:
                                        var57 ^= 1579765607;
                                        break;
                                    case 709062950:
                                    default:
                                        var57 ^= -263721680;
                                        break;
                                    case 789058867:
                                        var57 ^= -2093829145;
                                        var57 ^= 1060026530;
                                }
                            }
                        }

                        long var256 = var57;
                        var45 = var256 + 1L;
                        var45 = var256 * var45;
                        var47 = var256 + 2L;
                        var45 *= var47;
                        long var257 = var256 + 3L;
                        var45 *= var257;
                        long var258 = var45 & 7L;
                        long var351;
                        int var259 = (var351 = var258 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                        if (var259 != 0) {
                            break label176;
                        }

                        int var260 = var196 + 1;
                        var269 = var16 + 1;
                        var269 = var16 * var269;
                        int var305 = var16 + 2;
                        var269 *= var305;
                        int var306 = var16 + 3;
                        var269 *= var306;
                        var269 &= 7;
                        if (var269 != 0) {
                            var57 ^= 878044266;
                            var57 *= -1498893009;
                            var57 ^= 1276633438;
                            break label173;
                        }

                        var57 ^= 1316999894;
                        var57 &= -1591818558;
                        var57 *= -303863629;
                        var57 ^= -402503402;
                        var196 = var260;
                        var57 *= 1876535367;
                        var57 >>= 23;
                        var57 |= -1602653824;
                        var57 ^= -1927945816;
                    }
                }
            }

            long var214 = var57;
            long var220 = var214 + 1L;
            var220 = var214 * var220;
            var214 = var220 & 1L;
            long var353;
            int var216 = (var353 = var214 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
            if (var216 == 0) {
                UnsupportedOperationException var217 = new UnsupportedOperationException();
                throw var217;
            }
        }

        RuntimeException var145 = new RuntimeException();
        throw var145;
    }

    private void dB(Canvas var1, WorldDraw var2, LivingEntity var3, double var4, double var6, double var8, float var10, float var11, double var12, int var14) {
        label39: {
            int var16 = System.identityHashCode(this);
            float var17 = var3.getWidth();
            double var60 = var17;
            double var61 = var60 * 0.9;
            double var62 = var61 + 0.08;
            double var19 = var10;
            var19 = 0.4 * var19;
            var19 = 0.6 + var19;
            double var63 = var62 * var19;
            double var64 = var63;
            float var67 = var3.getHeight();
            double var20 = var12 * 3.0;
            Integer var22 = var16;
            if (var22 == null) {
                int var15 = var14 * -1050696579;
                var15 ^= 494840936;
            } else {
                int var37 = var14 | 940351134;
                var37 <<= 14;
                var37 += 599508799;
                var37 ^= -183903042;
                var22 = var37;
                if (var22 == null) {
                    break label39;
                }

                Uq var77 = this.s;
                float var78 = var77.WM();
                double var79 = var78;
                var20 *= var79;
                double var80 = Math.sin(var20);
                double var82 = ++var80 * 0.5;
                double var24 = var67;
                double var83 = var82 * var24;
                double var84 = var6 + var83;
                double var85 = var84;
                var20 -= 0.45;
                var20 = Math.sin(var20);
                var20 = ++var20 * 0.5;
                var24 = var67;
                var19 = var20 * var24;
                var19 = var6 + var19;
                var19 = var19;
                float var21 = 0.75F;
                byte var87 = 0;
                int var88 = var87;
                var37 -= 589916641;
                var37 -= 102226315;
                var37 ^= -64444847;

                while (true) {
                    if (var88 >= 64) {
                        var37 += 2007390377;
                        var37 ^= -1846143065;
                        return;
                    }

                    var37 >>>= 28;
                    var37 ^= -1620509804;
                    long var25 = var37;
                    long var27 = var25 + 1L;
                    var27 = var25 * var27;
                    var25 = var27 & 1L;
                    long var134;
                    int var90 = (var134 = var25 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                    if (var90 != 0) {
                        break label39;
                    }

                    float var91 = var88;
                    float var92 = var91 * (float) (Math.PI * 2);
                    float var93 = var92 / 64.0F;
                    double var94 = var93;
                    int var101 = var88 + 1;
                    float var102 = var101;
                    float var103 = var102 * (float) (Math.PI * 2);
                    float var104 = var103 / 64.0F;
                    int var28 = var16 + 1;
                    var28 = var16 * var28;
                    int var29 = var16 + 2;
                    var28 *= var29;
                    var29 = var16 + 3;
                    var28 *= var29;
                    var28 &= 7;
                    if (var28 != 0) {
                        var37 &= -710938436;
                        var37 >>= 8;
                        var37 &= -163574397;
                        var37 ^= -1959677004;
                        break;
                    }

                    var37 *= 684585831;
                    var37 *= 875027051;
                    var37 |= -2134607237;
                    var37 >>>= 27;
                    var37 ^= 1591337435;
                    double var105 = var104;
                    double var115 = Math.cos(var94);
                    double var116 = var115 * var64;
                    double var117 = var4 + var116;
                    double var95 = Math.sin(var94);
                    double var96 = var95 * var64;
                    double var97 = var8 + var96;
                    double var31 = Math.cos(var105);
                    var31 *= var64;
                    var31 = var4 + var31;
                    double var106 = Math.sin(var105);
                    double var107 = var106 * var64;
                    double var108 = var8 + var107;
                    zS var33 = this.aY;
                    float var34 = var88;
                    var34 /= 64.0F;
                    int var120 = var33.Na(var34, var12, var11);
                    var34 = 0.4F * var10;
                    int var126 = DP.Y(var120, var34);
                    int var35 = DP.Y(var120, 0.0F);
                    boolean var127 = var2.band(
                        var1, var117, var85, var97, var31, var85, var108, var117, var19, var97, var31, var19, var108, var126, var35, false
                    );
                    var34 = var21 * 3.2F;
                    float var130 = 0.35F * var10;
                    var35 = DP.Y(var120, var130);
                    Paint var132 = Paint.solid(var35);
                    Paint var133 = var132.soft(1.2F);
                    boolean var129 = var2.line(var1, var117, var85, var97, var31, var85, var108, var34, var133);
                    int var121 = DP.Z(var120, -1, 0.3F);
                    int var122 = DP.Y(var121, var10);
                    Paint var123 = Paint.solid(var122);
                    boolean var98 = var2.line(var1, var117, var85, var97, var31, var85, var108, var21, var123);
                    int var99 = var88 + 1;
                    var88 = var99;
                    var37 -= -281302196;
                    var37 -= -149730798;
                    var37 ^= -1848962519;
                }
            }

            IllegalArgumentException var113 = new IllegalArgumentException();
            throw var113;
        }

        AssertionError var59 = new AssertionError();
        throw var59;
    }

    private void Ps(Canvas var1, WorldDraw var2, LivingEntity var3, double var4, double var6, double var8, float var10, float var11, double var12, int var14) {
        label159: {
            int var16 = System.identityHashCode(this);
            int var17 = var16 + 1;
            var17 = var16 * var17;
            var17 &= 1;
            int var39;
            if (var17 == 0) {
                var39 = var14 | 1521503664;
                var39 &= -242334076;
                var39 >>= 11;
                var39 &= -1820400102;
                var39 ^= -740310990;
                Integer var109 = var39;
                if (var109 == null) {
                    break label159;
                }

                float var110 = var3.getHeight();
                double var111 = var110;
                double var112 = var111 * 0.55;
                double var113 = var6 + var112;
                int var19 = (var2.at(var1, var4, var113, var8)) ? 1 : 0;
                if (var19 == 0) {
                    var39 *= 1929807777;
                    var39 ^= 918677962;
                    var19 = var39 + 1;
                    var19 = var39 * var19;
                    int var174 = var39 + 2;
                    var19 *= var174;
                    var174 = var39 + 3;
                    var19 *= var174;
                    var19 &= 7;
                    if (var19 == 0) {
                        return;
                    }
                    break label159;
                }

                var39 >>>= 5;
                var39 |= -947399523;
                var39 *= -795455465;
                var39 ^= 617696269;
                float var140 = var2.x();
                float var20 = var2.y();
                float var21 = var2.unitsPerBlock();
                Projection var22 = var2.projection();
                double var207 = var22.cameraX();
                double var208 = var207 - var4;
                Projection var24 = var2.projection();
                double var245 = var24.cameraZ();
                double var246 = var245 - var8;
                int var26 = var16 + 1;
                var26 = var16 * var26;
                int var27 = var16 + 2;
                var26 *= var27;
                var27 = var16 + 3;
                var26 *= var27;
                var26 &= 7;
                if (var26 != 0) {
                    var39 -= -1718387446;
                    var39 ^= -1538719145;
                } else {
                    var39 &= 1445167809;
                    var39 ^= -1663429612;
                    double var269 = Math.hypot(var208, var246);
                    double var270 = Math.max(0.001, var269);
                    float var28 = var3.getWidth();
                    double var274 = var28;
                    double var275 = var274 * 0.75;
                    double var209 = var208 / var270;
                    double var210 = var209 * var275;
                    double var211 = var4 + var210;
                    double var247 = var246 / var270;
                    double var248 = var247 * var275;
                    double var249 = var8 + var248;
                    boolean var114 = var2.at(var1, var211, var113, var249);
                    if (!var114) {
                        var39 |= -278617189;
                        var39 -= 948180861;
                        var39 |= 1246364557;
                        var39 <<= 31;
                        var39 ^= 976676318;
                        int var127 = var39 + 1;
                        var127 = var39 * var127;
                        int var138 = var39 + 2;
                        var127 *= var138;
                        var138 = var39 + 3;
                        var127 *= var138;
                        var127 &= 7;
                        if (var127 == 0) {
                            return;
                        }
                        break label159;
                    }

                    var39 ^= -1550226473;
                    var39 ^= 954041658;
                    var109 = var39;
                    if (var109 == null) {
                        break label159;
                    }

                    float var116 = var2.depth();
                    Uq var18 = this.Tc;
                    float var132 = var18.WM();
                    float var133 = 0.55F * var132;
                    float var134 = var133 * var21;
                    Integer var176 = var16;
                    if (var176 != null) {
                        var39 -= 362715971;
                        var39 >>= 7;
                        var39 ^= 1569642188;
                        Integer var177 = var39;
                        if (var177 == null) {
                            break label159;
                        }

                        var21 = 0.6F * var10;
                        var21 = 1.6F - var21;
                        float var135 = var134 * var21;
                        float var136 = var135;
                        double var180 = var12 * 1.7;
                        Uq var23 = this.s;
                        float var236 = var23.WM();
                        double var237 = var236;
                        double var181 = var180 * var237;
                        double var238 = var12 * 2.3;
                        double var239 = Math.sin(var238);
                        double var240 = var239 * 0.35;
                        double var182 = var181 + var240;
                        var21 = (float)var182;
                        var1.save();
                        var1.depth(var116);
                        var1.translate(var140, var20);
                        var1.rotate(var21);
                        byte var117 = 0;
                        int var118 = var117;
                        var39 |= 834169827;
                        var39 ^= 768822260;

                        label150:
                        while (true) {
                            long var141 = var39;
                            long var212 = var141 + 1L;
                            long var213 = var141 * var212;
                            long var250 = var141 + 2L;
                            long var214 = var213 * var250;
                            long var142 = var141 + 3L;
                            long var215 = var214 * var142;
                            long var143 = var215 & 7L;
                            long var276;
                            var19 = (var276 = var143 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                            if (var19 != 0) {
                                break label159;
                            }

                            if (var118 >= 4) {
                                var39 = switch (var39) {
                                    case -1320439668 -> var39 ^ 145042242;
                                    default -> var39 ^ -396574967;
                                    case 1345172487 -> {
                                        var39 *= -981272183;
                                        var39 |= 302680296;
                                        var39 += -624225118;
                                        yield var39 ^ 408007399;
                                    }
                                };
                                long var223 = var39;
                                long var257 = var223 + 1L;
                                long var258 = var223 * var257;
                                long var224 = var258 & 1L;
                                long var277;
                                var118 = (var277 = var224 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                                if (var118 != 0) {
                                    break label159;
                                }

                                float var120 = -var21;
                                float var121 = var120 * 2.0F;
                                var1.rotate(var121);
                                int var122 = 0;
                                Integer var184 = var16;
                                if (var184 == null) {
                                    var39 &= 1918825333;
                                    var39 -= -214033197;
                                    var39 -= -244893665;
                                    var39 -= -295187918;
                                    var39 ^= 633573243;
                                    break;
                                } else {
                                    var39 += 1242494325;
                                    var39 ^= 856871654;
                                    Integer var185 = var39;
                                    if (var185 == null) {
                                        break label159;
                                    }

                                    var122 = var122;
                                    var39 -= 477169722;
                                    var39 ^= -1731672846;

                                    while (true) {
                                        Integer var186 = var39;
                                        if (var186 == null) {
                                            break label159;
                                        }

                                        if (var122 >= 4) {
                                            var39 += 97864215;
                                            var39 ^= -84221750;
                                            long var155 = var39;
                                            long var205 = var155 + 1L;
                                            long var206 = var155 * var205;
                                            long var156 = var206 & 1L;
                                            long var278;
                                            var122 = (var278 = var156 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                                            if (var122 != 0) {
                                                break label159;
                                            }

                                            zS var125 = this.aY;
                                            var19 = var16 + 1;
                                            var19 = var16 * var19;
                                            int var171 = var16 + 2;
                                            var19 *= var171;
                                            var16 += 3;
                                            var19 *= var16;
                                            var16 = var19 & 7;
                                            if (var16 == 0) {
                                                var39 ^= 2027089115;
                                                var39 += -2008522634;
                                                var39 ^= 1492146327;
                                                var16 = var125.Na(0.0F, var12, var11);
                                                var16 = DP.Y(var16, var10);
                                                SpriteShape var126 = SpriteShape.GLOW;
                                                float var161 = var136 * 0.03F;
                                                float var137 = var136 * 0.16F;
                                                int var172 = var16 | 16777215;
                                                int var173 = DP.Z(var16, var172, 0.5F);
                                                var1.sprite(var126, 0.0F, 0.0F, var161, var137, var173, var16, 0.0F);
                                                var1.restore();
                                                return;
                                            }

                                            var39 |= -422277608;
                                            var39 ^= 181321551;
                                            var39 &= -89906188;
                                            var39 ^= -387384273;
                                            break label150;
                                        }
                                        var39 = switch (var39) {
                                            case -794007343 -> {
                                                var39 |= -1454036979;
                                                var39 += -274839729;
                                                var39 -= -1624586082;
                                                var39 <<= 17;
                                                yield var39 ^ 1072561848;
                                            }
                                            case 500858160 -> var39 ^ 1338916344;
                                            default -> var39 ^ 624196117;
                                        };
                                        int var187 = var39 + 1;
                                        int var188 = var39 * var187;
                                        int var225 = var39 + 2;
                                        int var189 = var188 * var225;
                                        int var226 = var39 + 3;
                                        int var190 = var189 * var226;
                                        int var191 = var190 & 7;
                                        if (var191 != 0) {
                                            break label159;
                                        }

                                        var21 = var122;
                                        var21 *= (float) Math.PI;
                                        var21 /= 2.0F;
                                        var21 += (float) (Math.PI / 4);
                                        zS var196 = this.aY;
                                        float var227 = var122;
                                        float var228 = var227 / 4.0F;
                                        float var229 = var228 + 0.5F;
                                        int var197 = var196.Na(var229, var12, var11);
                                        int var198 = DP.Y(var197, var10);
                                        double var199 = var21;
                                        double var200 = Math.cos(var199);
                                        float var201 = (float)var200;
                                        float var202 = var201 * var136;
                                        float var203 = var202 * 0.66F;
                                        double var230 = var21;
                                        double var231 = Math.sin(var230);
                                        float var232 = (float)var231;
                                        float var233 = var232 * var136;
                                        float var234 = var233 * 0.66F;
                                        var1.save();
                                        var1.translate(var203, var234);
                                        var1.rotate(++var21);
                                        SpriteShape var153 = SpriteShape.DIAMOND;
                                        var21 = var136 * 0.12F;
                                        float var235 = var136 * 0.1F;
                                        int var243 = var198 | 16777215;
                                        long var259 = var16;
                                        long var271 = var259 + 1L;
                                        long var272 = var259 * var271;
                                        long var260 = var272 & 1L;
                                        long var279;
                                        int var261 = (var279 = var260 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                                        if (var261 != 0) {
                                            var39 |= 1524268851;
                                            var39 &= 471004672;
                                            var39 ^= 282733403;
                                            break label150;
                                        }

                                        var39 <<= 9;
                                        var39 ^= -330377478;
                                        Integer var262 = var39;
                                        if (var262 == null) {
                                            break label159;
                                        }

                                        int var244 = DP.Z(var198, var243, 0.14F);
                                        var1.sprite(var153, 0.0F, 0.0F, var21, var235, var244, var198, 0.0F);
                                        var1.restore();
                                        var19 = var122 + 1;
                                        var122 = var19;
                                        switch (var39) {
                                            case 263431930:
                                                var39 |= 7206498;
                                                var39 ^= -548168149;
                                                break;
                                            case 1243967844:
                                                var39 ^= -700353933;
                                                break;
                                            case 1618250049:
                                            default:
                                                var39 ^= -441856027;
                                        }
                                    }
                                }
                            }

                            var39 -= 932634284;
                            var39 &= -1938809301;
                            var39 ^= -2015605453;
                            long var145 = var39;
                            long var216 = var145 + 1L;
                            long var217 = var145 * var216;
                            long var146 = var217 & 1L;
                            long var280;
                            var19 = (var280 = var146 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                            if (var19 != 0) {
                                break label159;
                            }

                            float var148 = var118;
                            float var149 = var148 * (float) Math.PI;
                            float var150 = var149 / 2.0F;
                            zS var167 = this.aY;
                            float var218 = var118;
                            float var219 = var218 / 4.0F;
                            int var168 = var167.Na(var219, var12, var11);
                            int var169 = DP.Y(var168, var10);
                            float var220 = var136 * 0.2F;
                            float var241 = var150 - 0.5F;
                            int var251 = DP.nq(var169, 0.28F);
                            Paint var252 = Paint.solid(var251);
                            Integer var25 = var16;
                            if (var25 == null) {
                                var39 -= 713875700;
                                var39 ^= 1844946207;
                                break;
                            }

                            var39 &= -642558888;
                            var39 += 169001866;
                            var39 ^= 1140021418;
                            var39 ^= -715846693;
                            var25 = var39;
                            if (var25 == null) {
                                break label159;
                            }

                            float var264 = var136 * 0.14F;
                            Paint var253 = var252.soft(var264);
                            var1.arc(0.0F, 0.0F, var136, var220, var241, 1.0F, var253);
                            float var221 = var136 * 0.055F;
                            float var242 = var150 - 0.45F;
                            int var254 = var169 | 16777215;
                            int var255 = DP.Z(var169, var254, 0.15F);
                            Paint var256 = Paint.solid(var255);
                            var1.arc(0.0F, 0.0F, var136, var221, var242, 0.9F, var256);
                            int var222 = var118 + 1;
                            var118 = var222;
                            switch (var39) {
                                case -1980240633:
                                    var39 ^= 347924873;
                                    break;
                                case -292181143:
                                default:
                                    var39 ^= -1525603004;
                                    break;
                                case 87376083:
                                    var39 >>= 23;
                                    var39 += 872068331;
                                    var39 *= -1168457213;
                                    var39 ^= 1763605720;
                            }
                        }
                    } else {
                        var39 *= -1638119161;
                        var39 ^= 1101267092;
                    }
                }
            } else {
                var39 = var14 - 1841940685;
                var39 -= -343301524;
                var39 ^= 1578651446;
            }

            Integer var100 = var39;
            if (var100 != null) {
                RuntimeException var102 = new RuntimeException();
                throw var102;
            }
        }

        UnsupportedOperationException var101 = new UnsupportedOperationException();
        throw var101;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -853735925;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        Fd = var4;
        double var5 = Math.toRadians(58.0);
        BD = var5;
        double var6 = Math.toRadians(63.0);
        i = var6;
    }
}
