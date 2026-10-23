package mvggs.modules.combat;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public final class totempop extends Module {
    private static final int Z = 30;
    private static final int yf = 8;
    private static final float S = 0.06F;
    private final RZ XZ;
    private final ModeSetting Ch;
    private final NumberSetting Yp;
    private final NumberSetting cN;
    private final NumberSetting Ye;
    private final NumberSetting ke;
    private final NumberSetting c;
    private final ModeSetting Gu;
    private final NumberSetting e;
    private final BooleanSetting y;
    private final zS WW;
    private final BooleanSetting V;
    private final BooleanSetting GT;
    private final NumberSetting jN;
    private final mN k;
    private final Pc_2 Q;
    private final Predicate a;
    private Object g;
    public static int F;
    public static final int t;

    public totempop() {
        super("totem_pop", "Totem Pop", ModuleCategory.COMBAT);
        ModuleCategory var1 = ModuleCategory.COMBAT;

        Ru var2 = Ru.STARS;
        RZ var3 = new RZ(var2);
        nM var4 = this.bU(var3);
        RZ var5 = (RZ)var4;
        this.XZ = var5;
        bA_2 var62 = bA_2.GLIDE;
        ModeSetting var6 = new ModeSetting("motion", "Motion", var62);
        Setting var7 = this.addSetting(var6);
        ModeSetting var8 = (ModeSetting)var7;
        this.Ch = var8;
        NumberSetting var9 = new NumberSetting("burst", "Burst", 10.0F, 0.0F, 40.0F);
        NumberSetting var10 = var9.W(1.0F);
        Setting var11 = this.addSetting(var10);
        NumberSetting var12 = (NumberSetting)var11;
        this.Yp = var12;
        NumberSetting var13 = new NumberSetting("rate", "Per Tick", 2.0F, 0.0F, 8.0F);
        NumberSetting var14 = var13.W(1.0F);
        Setting var15 = this.addSetting(var14);
        NumberSetting var16 = (NumberSetting)var15;
        this.cN = var16;
        NumberSetting var17 = new NumberSetting("speed", "Speed", 1.0F, 0.2F, 3.0F);
        NumberSetting var18 = var17.W(0.05F);
        NumberSetting var19 = var18.L("x");
        Setting var20 = this.addSetting(var19);
        NumberSetting var21 = (NumberSetting)var20;
        this.Ye = var21;
        NumberSetting var22 = new NumberSetting("lifetime", "Lifetime", 2.0F, 0.5F, 10.0F);
        NumberSetting var23 = var22.W(0.1F);
        NumberSetting var24 = var23.L("s");
        Setting var25 = this.addSetting(var24);
        NumberSetting var26 = (NumberSetting)var25;
        this.ke = var26;
        NumberSetting var27 = new NumberSetting("size", "Size", 1.0F, 0.4F, 3.0F);
        NumberSetting var28 = var27.W(0.05F);
        NumberSetting var29 = var28.L("x");
        Setting var30 = this.addSetting(var29);
        NumberSetting var31 = (NumberSetting)var30;
        this.c = var31;
        ka var63 = ka.ALPHA;
        ModeSetting var32 = new ModeSetting("fade", "Fade", var63);
        Setting var33 = this.addSetting(var32);
        ModeSetting var34 = (ModeSetting)var33;
        this.Gu = var34;
        NumberSetting var35 = new NumberSetting("glow", "Glow", 0.7F, 0.0F, 1.0F);
        NumberSetting var36 = var35.W(0.05F);
        Setting var37 = this.addSetting(var36);
        NumberSetting var38 = (NumberSetting)var37;
        this.e = var38;
        BooleanSetting var39 = new BooleanSetting("totem_colors", "Totem Colors", true);
        Setting var40 = this.addSetting(var39);
        BooleanSetting var41 = (BooleanSetting)var40;
        this.y = var41;
        zS var42 = new zS();
        nM var43 = this.bU(var42);
        zS var44 = (zS)var43;
        this.WW = var44;
        BooleanSetting var45 = new BooleanSetting("replace_vanilla", "Hide Vanilla Particles", true);
        Setting var46 = this.addSetting(var45);
        BooleanSetting var47 = (BooleanSetting)var46;
        this.V = var47;
        BooleanSetting var48 = new BooleanSetting("tint_item", "Tint Totem", false);
        Setting var49 = this.addSetting(var48);
        BooleanSetting var50 = (BooleanSetting)var49;
        this.GT = var50;
        NumberSetting var51 = new NumberSetting("item_scale", "Totem Size", 1.0F, 0.1F, 1.0F);
        NumberSetting var52 = var51.W(0.05F);
        NumberSetting var53 = var52.L("x");
        Setting var54 = this.addSetting(var53);
        NumberSetting var55 = (NumberSetting)var54;
        this.jN = var55;
        mN var56 = new mN(768);
        this.k = var56;
        Pc_2 var57 = new Pc_2(8);
        this.Q = var57;
          Predicate var58 = var0x -> this.Re((Entity)var0x);
        this.a = var58;
        this.dy("Totem pops pour light particles out of the player, in totem colors or yours.");
        this.fJ(true);
        EventListener<TotemPopEvent> var59 = (TotemPopEvent var1x) -> {
            int var2x = t;
            var2x ^= 1347035599;
            int var3x = System.identityHashCode(this);
            long var16x = var3x;
            long var5x = var16x + 1L;
            var5x = var16x * var5x;
            long var17x = var5x & 1L;
            long var28x;
            var3x = (var28x = var17x - 0L) == 0L ? 0 : (var28x < 0L ? -1 : 1);
            if (var3x == 0) {
                var2x *= -151347171;
                var2x ^= 1307857402;
                Integer var19x = var2x;
                if (var19x != null) {
                    Entity var20x = var1x.entity();
                    int var4x = var2x - 209211827;
                    var4x ^= -630233983;
                    this.K(var20x, var4x);
                    return;
                }
            } else {
                var2x &= -1211443103;
                var2x ^= 28203919;
                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var26x = var2x + 2;
                var3x *= var26x;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    AssertionError var15x = new AssertionError();
                    throw var15x;
                }
            }

            IllegalStateException var14x = new IllegalStateException();
            throw var14x;
        };
        this.onEvent(TotemPopEvent.class, var59);
        EventListener<TickEvent> var60 = (TickEvent var1x) -> {
            int var2x = t;
            var2x ^= -503918643;
            int var3x = System.identityHashCode(this);
            Integer var16x = var3x;
            if (var16x != null) {
                var2x &= 1783495049;
                var2x *= -877156129;
                var2x >>>= 12;
                var2x += 713975092;
                var2x ^= -1613324914;
                int var19x = var2x * -1517746421;
                var19x &= 1341516828;
                var19x &= 1405820284;
                var19x &= 454037719;
                var19x ^= 71423538;
                this.X(var19x);
            } else {
                var2x *= -408458443;
                var2x |= -119295851;
                var2x ^= -1582647087;
                int var17x = var2x + 1;
                var17x = var2x * var17x;
                var2x = var17x & 1;
                if (var2x != 0) {
                    AssertionError var10x = new AssertionError();
                    throw var10x;
                } else {
                    UnsupportedOperationException var9x = new UnsupportedOperationException();
                    throw var9x;
                }
            }
        };
        this.onEvent(TickEvent.class, var60);
        EventListener<RenderEvent> var61 = (RenderEvent var1x) -> {
            label110: {
                int var52x;
                label116: {
                    var52x = t;
                    var52x ^= 1826174424;
                    int var3x = System.identityHashCode(this);
                    RenderPhase var4x = var1x.phase();
                    Object var5x = RenderPhase.WORLD;
                    int var6x = var3x + 1;
                    var6x = var3x * var6x;
                    var6x &= 1;
                    if (var6x == 0) {
                        var52x *= 1820023903;
                        var52x ^= -1964796563;
                        Integer var105 = var52x;
                        if (var105 == null) {
                            break label110;
                        }

                        if (var4x != var5x) {
                            var52x += 758304452;
                            var52x ^= -472041918;
                            return;
                        }

                        var52x |= 848282628;
                        var52x += -1675993076;
                        var52x *= 771722309;
                        var52x |= 161574475;
                        var52x ^= 580476866;
                        Integer var79 = var52x;
                        if (var79 == null) {
                            break label110;
                        }

                        Entity var80 = i_2.QI();
                        long var87 = var3x;
                        long var7x = var87 + 1L;
                        var7x = var87 * var7x;
                        long var9x = var87 + 2L;
                        var7x *= var9x;
                        long var88 = var87 + 3L;
                        var7x *= var88;
                        long var89 = var7x & 7L;
                        long var140;
                        int var90 = (var140 = var89 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var90 == 0) {
                            var52x += 470202858;
                            var52x *= 1214355161;
                            var52x ^= -1888669827;
                            if (var80 == null) {
                                var52x ^= -1577153419;
                                var52x ^= -675962724;
                                break label116;
                            }
                            var52x = switch (var52x) {
                                default -> var52x ^ -399716903;
                                case 1339578274 -> {
                                    var52x -= -233739952;
                                    var52x >>>= 8;
                                    yield var52x ^ 231208057;
                                }
                                case 2088676092 -> var52x ^ 1087861483;
                            };
                            long var91 = var52x;
                            var7x = var91 + 1L;
                            var7x = var91 * var7x;
                            var9x = var91 + 2L;
                            var7x *= var9x;
                            long var92 = var91 + 3L;
                            var7x *= var92;
                            long var93 = var7x & 7L;
                            long var141;
                            int var94 = (var141 = var93 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                            if (var94 != 0) {
                                break label110;
                            }

                            var5x = (RenderPhase)this.g;
                            int var106 = var3x + 1;
                            var106 = var3x * var106;
                            var106 &= 1;
                            label99:
                            if (var106 == 0) {
                                var52x *= -2051001643;
                                var52x <<= 29;
                                var52x ^= 1746587661;
                                long var109 = var52x;
                                long var8x = var109 + 1L;
                                var8x = var109 * var8x;
                                long var110 = var8x & 1L;
                                long var142;
                                var106 = (var142 = var110 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                                if (var106 != 0) {
                                    break label110;
                                }

                                if (var5x != null) {
                                    var52x |= 696377896;
                                    var52x &= 860595136;
                                    var52x *= -1573398459;
                                    var52x += 1636782195;
                                    var52x ^= 1364603732;
                                    var5x = (RenderPhase)this.g;
                                    World var81 = var80.getEntityWorld();
                                    Integer var112 = var3x;
                                    if (var112 == null) {
                                        var52x <<= 13;
                                        var52x -= -1523866036;
                                        var52x ^= -1473123445;
                                        break label99;
                                    }
                                    var52x = switch (var52x) {
                                        case -1187526361 -> {
                                            var52x += -1791935143;
                                            var52x += -718664230;
                                            var52x *= -1299194223;
                                            yield var52x ^ -1373074329;
                                        }
                                        default -> var52x ^ -1243633986;
                                        case 598904965 -> var52x ^ -557221981;
                                    };
                                    long var113 = var52x;
                                    var8x = var113 + 1L;
                                    var8x = var113 * var8x;
                                    long var10x = var113 + 2L;
                                    var8x *= var10x;
                                    long var114 = var113 + 3L;
                                    var8x *= var114;
                                    long var115 = var8x & 7L;
                                    long var143;
                                    int var116 = (var143 = var115 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                                    if (var116 != 0) {
                                        break label110;
                                    }

                                    if (var5x != var81) {
                                        var52x &= -1393231462;
                                        var52x &= -431163849;
                                        var52x ^= 965962587;
                                        break label116;
                                    }

                                    var52x >>>= 19;
                                    var52x += 293448273;
                                    var52x ^= -2085058327;
                                } else {
                                    var52x &= -1771080749;
                                    var52x ^= -1831898245;
                                }

                                Integer var82 = var52x;
                                if (var82 == null) {
                                    break label110;
                                }

                                mN var83 = this.k;
                                ModeSetting var97 = this.Gu;
                                Enum var98 = var97.A();
                                ka var99 = (ka)var98;
                                var83.Vs(var99, 0.0F, true);
                                mN var84 = this.k;
                                Canvas var100 = var1x.canvas();
                                var106 = var3x + 1;
                                var106 = var3x * var106;
                                var3x = var106 & 1;
                                if (var3x == 0) {
                                    var52x -= 1360413384;
                                    var52x -= -1145591920;
                                    var52x |= 1398729518;
                                    var52x ^= 663641564;
                                    ClientRuntime var73 = ClientRuntime.Z();
                                    AuraPipeline var74 = var73.Ul();
                                    WorldDraw var75 = var74.world();
                                    FrameContext var119 = var1x.frame();
                                    float var120 = var119.dt();
                                    float var121 = Math.min(var120, 0.1F);
                                    FrameContext var129 = var1x.frame();
                                    double var130 = var129.time();
                                    zS var137 = this.WW;
                                    NumberSetting var138 = this.e;
                                    float var139 = var138.WM();
                                    var84.h(var100, var75, var121, var130, var137, var139);
                                    return;
                                }

                                switch (var52x) {
                                    case -1832574086:
                                        var52x &= 496036960;
                                        var52x ^= -582066827;
                                        var52x ^= 669571802;
                                        var52x -= -238710373;
                                        var52x ^= 61457419;
                                        break;
                                    case 790134403:
                                    default:
                                        var52x ^= -413272154;
                                        break;
                                    case 1742011744:
                                        var52x ^= 306349065;
                                }
                            } else {
                                var52x *= -888989675;
                                var52x ^= 484547676;
                            }
                        } else {
                            var52x += -1873155979;
                            var52x |= -28676965;
                            var52x |= 909420762;
                            var52x &= -706034173;
                            var52x ^= 773985852;
                        }
                    } else {
                        var52x -= 171235276;
                        var52x -= -1983154960;
                        var52x -= -134173424;
                        var52x ^= 130176489;
                    }

                    long var60x = var52x;
                    long var85 = var60x + 1L;
                    long var86 = var60x * var85;
                    long var61x = var86 & 1L;
                    long var144;
                    var52x = (var144 = var61x - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                    if (var52x == 0) {
                        RuntimeException var63x = new RuntimeException();
                        throw var63x;
                    }
                    break label110;
                }

                long var76 = var52x;
                long var101 = var76 + 1L;
                var101 = var76 * var101;
                var76 = var101 & 1L;
                long var145;
                int var78 = (var145 = var76 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                if (var78 == 0) {
                    this.J();
                    return;
                }
            }

            IllegalStateException var71 = new IllegalStateException();
            throw var71;
        };
        this.onEvent(RenderEvent.class, var61);
    }

    public static boolean HP() {
        boolean var71 = false;
        int var0 = t;
        var0 ^= -281255966;
        int var1 = (ClientRuntime.y()) ? 1 : 0;
        var0 >>>= 21;
        var0 *= -479859379;
        var0 ^= -625491425;
        if (var1 == 0) {
            var0 = switch (var0) {
                case -1201353332 -> {
                    var0 += -153150450;
                    var0 ^= 758034631;
                    yield var0 ^ -1618616020;
                }
                case -209176824 -> var0 ^ -2060641721;
                default -> var0 ^ 1370883696;
            };
            var1 = var0 + 1;
            var1 = var0 * var1;
            int var2 = var0 + 2;
            var1 *= var2;
            var2 = var0 + 3;
            var1 *= var2;
            var1 &= 7;
            if (var1 == 0) {
                return false;
            }
        } else {
            var0 += -207315610;
            var0 += -756254192;
            var0 += 718945904;
            var0 ^= -680818343;
            Integer var59 = var0;
            if (var59 != null) {
                ClientRuntime var60 = ClientRuntime.Z();
                ModuleManager var61 = var60.sP();
                Module var62 = var61.tG(totempop.class);
                var0 -= -571322620;
                var0 ^= -971916526;
                var0 ^= -1348579018;
                int var73 = var0 + 1;
                var73 = var0 * var73;
                int var3 = var0 + 2;
                var73 *= var3;
                var3 = var0 + 3;
                var73 *= var3;
                var73 &= 7;
                label68:
                if (var73 == 0) {
                    label72: {
                        totempop var63 = (totempop)var62;
                        int var78 = (var63.IU()) ? 1 : 0;
                        if (var78 != 0) {
                            var0 >>>= 26;
                            var0 += 788650030;
                            var0 += 766236482;
                            var0 ^= 1693080329;
                            var78 = var0 + 1;
                            var78 = var0 * var78;
                            var3 = var0 + 2;
                            var78 *= var3;
                            var3 = var0 + 3;
                            var78 *= var3;
                            var78 &= 7;
                            if (var78 != 0) {
                                break label68;
                            }

                            BooleanSetting var64 = var63.V;
                            boolean var65 = var64.vb();

                            var0 = switch (var0) {
                                case 944239787 -> {
                                    var0 -= -1260182048;
                                    var0 >>>= 25;
                                    var0 += 1139107089;
                                    yield var0 ^ -278466366;
                                }
                                case 978849734 -> var0 ^ -1909577809;
                                default -> var0 ^ 111861427;
                            };
                            long var84 = var0;
                            long var4 = var84 + 1L;
                            var4 = var84 * var4;
                            long var85 = var4 & 1L;
                            long var99;
                            var78 = (var99 = var85 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                            if (var78 != 0) {
                                break label68;
                            }

                            if (var65) {
                                var0 >>>= 3;
                                var0 -= 1384940123;
                                var0 *= -831762359;
                                var0 &= 1205757211;
                                var0 ^= 1991615143;
                                int var66 = var0 + 1;
                                var66 = var0 * var66;
                                var78 = var0 + 2;
                                var66 *= var78;
                                var78 = var0 + 3;
                                var66 *= var78;
                                var66 &= 7;
                                if (var66 != 0) {
                                    break label68;
                                }

                                var71 = true;
                                var0 *= 1650682225;
                                var0 *= -1243891449;
                                var0 ^= -1378894093;
                                var0 -= -800904562;
                                var0 ^= -10654908;
                                break label72;
                            }

                            var0 <<= 15;
                            var0 -= -489465606;
                            var0 *= -1293272063;
                            var0 |= 1200050016;
                            var0 ^= -514121508;
                        } else {
                            var0 *= -1180208571;
                            var0 -= 603311369;
                            var0 -= 330081412;
                            var0 *= -1345277059;
                            var0 ^= 442636160;
                        }

                        Integer var89 = var0;
                        if (var89 == null) {
                            break label68;
                        }

                        var71 = false;
                        var0 -= -1129549766;
                        var0 |= -865197301;
                        var0 ^= 1695244279;
                        var0 *= -1665261495;
                        var0 ^= -392143647;
                    }

                    var73 = var0 + 1;
                    var73 = var0 * var73;
                    var3 = var0 + 2;
                    var73 *= var3;
                    var0 += 3;
                    var73 *= var0;
                    var0 = var73 & 7;
                    if (var0 == 0) {
                        return var71;
                    }
                }
            }
        }

        IllegalStateException var53 = new IllegalStateException();
        throw var53;
    }

    public static float O() {
        int var0 = t;
        var0 ^= -1119745522;
        int var1 = (ClientRuntime.y()) ? 1 : 0;
        var0 >>= 15;
        var0 |= 172925377;
        var0 ^= 216545274;
        if (var1 == 0) {
            var0 -= 1713040685;
            var0 >>= 19;
            var0 -= -467037100;
            var0 ^= 919660679;
            Integer var40 = var0;
            if (var40 != null) {
                return 1.0F;
            }
        } else {
            var0 <<= 25;
            var0 >>= 19;
            var0 += -747533498;
            var0 ^= 2032106732;
            var0 ^= -2143317588;
            var1 = var0 + 1;
            var1 = var0 * var1;
            var1 &= 1;
            if (var1 == 0) {
                ClientRuntime var44 = ClientRuntime.Z();
                ModuleManager var45 = var44.sP();
                Module var46 = var45.tG(totempop.class);
                totempop var47 = (totempop)var46;

                var0 = switch (var0) {
                    default -> var0 ^ 666099228;
                    case -1182506665 -> var0 ^ 1715966419;
                    case 709984070 -> {
                        var0 ^= 394235266;
                        var0 ^= 298951956;
                        var0 &= 1332287168;
                        var0 -= -1991401490;
                        yield var0 ^ 1128615293;
                    }
                };
                Integer var2 = var0;
                label56:
                if (var2 != null) {
                    boolean var51 = var47.IU();
                    float var50;
                    if (var51) {
                        var0 ^= 1597504435;
                        var0 ^= 228096783;
                        var2 = var0;
                        if (var2 == null) {
                            break label56;
                        }

                        NumberSetting var48 = var47.jN;
                        float var49 = var48.WM();

                        var0 = switch (var0) {
                            case -1829651693 -> {
                                var0 &= -1934124162;
                                var0 &= -1923999195;
                                var0 ^= 59728865;
                                yield var0 ^ -79181554;
                            }
                            case 611492869 -> var0 ^ 1188103957;
                            default -> var0 ^ -1898822947;
                        };
                        int var53 = var0 + 1;
                        var53 = var0 * var53;
                        int var3 = var0 + 2;
                        var53 *= var3;
                        var3 = var0 + 3;
                        var53 *= var3;
                        var53 &= 7;
                        if (var53 != 0) {
                            break label56;
                        }

                        var50 = var49;
                        var0 -= 73787984;
                        var0 += 2058711558;
                        var0 ^= 473051723;
                        var0 ^= 2139606164;
                    } else {
                        var0 += 825266993;
                        var0 <<= 27;
                        var0 |= -605247118;
                        var0 ^= -1284960920;
                        int var58 = var0 + 1;
                        var58 = var0 * var58;
                        int var64 = var0 + 2;
                        var58 *= var64;
                        var64 = var0 + 3;
                        var58 *= var64;
                        var58 &= 7;
                        if (var58 != 0) {
                            break label56;
                        }

                        var50 = 1.0F;
                        var0 ^= -83243001;
                        var0 |= -1392165957;
                        var0 ^= 856734149;
                    }

                    Integer var38 = var0;
                    if (var38 != null) {
                        return var50;
                    }
                }
            }
        }

        RuntimeException var39 = new RuntimeException();
        throw var39;
    }

    public static int BM() {
        int var0 = t;
        var0 ^= 2091773038;
        int var1 = (ClientRuntime.y()) ? 1 : 0;
        var0 >>>= 8;
        var0 &= -102037721;
        var0 ^= 79171471;
        var0 ^= 1820336832;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        if (var2 == 0) {
            if (var1 == 0) {
                var0 <<= 20;
                var0 ^= -427485929;
                long var42 = var0;
                long var3 = var42 + 1L;
                var3 = var42 * var3;
                long var43 = var3 & 1L;
                long var83;
                var1 = (var83 = var43 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return 0;
                }
            } else {
                var0 -= -640175129;
                var0 *= -536427179;
                var0 += 2011649207;
                var0 ^= 1488769678;
                Integer var45 = var0;
                label53:
                if (var45 != null) {
                    ClientRuntime var46 = ClientRuntime.Z();
                    var0 -= 16971765;
                    var0 ^= -1405685033;
                    ModuleManager var47 = var46.sP();
                    Module var48 = var47.tG(totempop.class);
                    totempop var49 = (totempop)var48;
                    int var59 = (var49.IU()) ? 1 : 0;
                    if (var59 != 0) {
                        var0 ^= 506114664;
                        var0 ^= 1993359709;
                        var0 ^= -1046899427;
                        Integer var60 = var0;
                        if (var60 == null) {
                            break label53;
                        }

                        BooleanSetting var61 = var49.GT;
          var59 = var61.vb() ? 1 : 0;
                        var0 |= -1458720586;
                        var0 ^= 607424819;
                        int var72 = var0 + 1;
                        var72 = var0 * var72;
                        var72 &= 1;
                        if (var72 != 0) {
                            break label53;
                        }

                        if (var59 != 0) {
                            var0 &= 1207397074;
                            var0 += -1021526858;
                            var0 += -927671312;
                            var0 ^= -1332352591;
                            long var63 = var0;
                            long var4 = var63 + 1L;
                            var4 = var63 * var4;
                            long var64 = var4 & 1L;
                            long var84;
                            var59 = (var84 = var64 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                            if (var59 == 0) {
                                zS var50 = var49.WW;
                                ClientRuntime var66 = ClientRuntime.Z();
                                var0 += -2027692762;
                                var0 *= -1894472935;
                                var0 ^= 1736112795;
                                long var75 = var0;
                                long var5 = var75 + 1L;
                                var5 = var75 * var5;
                                long var7 = var75 + 2L;
                                var5 *= var7;
                                long var76 = var75 + 3L;
                                var5 *= var76;
                                long var77 = var5 & 7L;
                                long var85;
                                var72 = (var85 = var77 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                                if (var72 == 0) {
                                    AuraPipeline var67 = var66.Ul();
                                    FrameContext var68 = var67.frame();
                                    double var69 = var68.time();
                                    int var51 = var50.x(0.0F, var69);
                                    var51 = DP.Z(-1, var51, 0.7F);
                                    return var51 | 0xFF000000;
                                }
                            }
                            break label53;
                        }

                        var0 ^= 1706380108;
                        var0 |= -1720172305;
                        var0 >>>= 27;
                        var0 ^= 1132853778;
                    } else {
                        var0 -= 920562213;
                        var0 ^= -797888189;
                    }

                    int var53 = var0 + 1;
                    var53 = var0 * var53;
                    var59 = var0 + 2;
                    var53 *= var59;
                    var0 += 3;
                    var53 *= var0;
                    var0 = var53 & 7;
                    if (var0 == 0) {
                        return 0;
                    }
                }
            }
        }

        AssertionError var41 = new AssertionError();
        throw var41;
    }

    public static int[] C(int[] var0) {
        label167: {
            int var1 = t;
            var1 ^= 1805666608;
            int var2 = System.identityHashCode(var0);
            int var3 = F;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 != 0) {
                var1 += -1909520106;
                var1 |= -202295527;
                var1 <<= 1;
                var1 >>= 1;
                var1 ^= -1084989797;
            } else {
                label166: {
                    var1 *= 25184219;
                    var1 ^= -1956216818;
                    var3 = var3;
                    if (var3 == 0) {
                        var1 &= -751899368;
                        var1 &= -1244419566;
                        var1 &= -73759413;
                        var1 ^= -1656559882;
                        Integer var116 = var1;
                        if (var116 != null) {
                            return var0;
                        }
                        break label167;
                    }

                    var1 += -793430176;
                    var1 *= -1595437321;
                    var1 |= -194312185;
                    var1 ^= -537404352;
                    var1 ^= -74997154;
                    if (var0 != null) {
                        var1 |= 1043352422;
                        var1 += 1191116614;
                        var1 ^= 1889877278;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label167;
                        }

                        var4 = var0.length;
                        long var5 = var2;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var171;
                        int var118 = (var171 = var5 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                        if (var118 != 0) {
                            switch (var1) {
                                case -1400105576:
                                default:
                                    var1 ^= -2110616134;
                                    break label166;
                                case 725185745:
                                    var1 ^= -369838249;
                                    break label166;
                                case 908023771:
                                    var1 *= 1437110435;
                                    var1 >>= 28;
                                    var1 += 1841349926;
                                    var1 -= -1623687366;
                                    var1 ^= -1909511151;
                                    break label166;
                            }
                        }

                        var1 >>= 5;
                        var1 &= -601610462;
                        var1 ^= -70509424;
                        if (var4 != 0) {
                            var1 -= 2010862755;
                            var1 ^= 1610697229;
                            long var106 = var1;
                            long var6 = var106 + 1L;
                            var6 = var106 * var6;
                            long var107 = var6 & 1L;
                            long var172;
                            var4 = (var172 = var107 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                            if (var4 != 0) {
                                break label167;
                            }

                            Object var109 = var0.clone();
                            int[] var110 = (int[])var109;
                            int[] var111 = var110;
                            byte var119 = 0;
                            Integer var131 = var2;
                            if (var131 == null) {
                                switch (var1) {
                                    case -468606974:
                                        var1 >>= 20;
                                        var1 ^= -748577680;
                                        var1 ^= 1815677907;
                                        break label166;
                                    case 1125872270:
                                    default:
                                        var1 ^= -1903079544;
                                        break label166;
                                    case 1256545924:
                                        var1 ^= 1205606030;
                                        break label166;
                                }
                            }

                            var1 |= -1965642264;
                            var1 *= -425058479;
                            var1 ^= 1222995286;
                            int var120 = var119;

                            var1 = switch (var1) {
                                case -1626611041 -> var1 ^ 897668519;
                                default -> var1 ^ -461741185;
                                case 559165532 -> {
                                    var1 ^= 1525946754;
                                    var1 *= 1304767043;
                                    var1 += -1138183284;
                                    yield var1 ^ -233657490;
                                }
                            };

                            while (true) {
                                Integer var132 = var1;
                                if (var132 == null) {
                                    break label167;
                                }

                                int var133 = var111.length;
                                var7 = var2;
                                long var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var173;
                                int var151 = (var173 = var7 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                                if (var151 != 0) {
                                    var1 |= 943683099;
                                    var1 |= -1824807152;
                                    var1 ^= -2101195334;
                                    var1 ^= 2040191875;
                                    break label166;
                                }
                                var1 = switch (var1) {
                                    case -1445281848 -> {
                                        var1 &= -639780609;
                                        var1 -= -1655778197;
                                        yield var1 ^ 1175629588;
                                    }
                                    case 926063889 -> var1 ^ -60688384;
                                    default -> var1 ^ 1877703167;
                                };
                                var7 = var1;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                long var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var174;
                                int var155 = (var174 = var7 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                                if (var155 != 0) {
                                    break label167;
                                }

                                if (var120 >= var133) {
                                    Integer var121 = switch (var1) {
                                        case -1432663223 -> {
                                            var1 -= -377606217;
                                            var1 += 36753890;
                                            var1 >>= 6;
                                            yield var1 ^ -1100681455;
                                        }
                                        case -18704521 -> var1 ^ 553479613;
                                        default -> var1 ^ 1865100856;
                                    };
                                    if (var121 != null) {
                                        return var111;
                                    }
                                    break label167;
                                }
                                var1 = switch (var1) {
                                    default -> var1 ^ 370075555;
                                    case -1432663223 -> {
                                        var1 <<= 20;
                                        var1 *= -2122724225;
                                        var1 += 1216019351;
                                        var1 -= -1069701806;
                                        yield var1 ^ 929048072;
                                    }
                                    case -619472469 -> var1 ^ 1507134771;
                                };
                                int var134 = var1 + 1;
                                int var135 = var1 * var134;
                                int var156 = var1 + 2;
                                int var136 = var135 * var156;
                                int var157 = var1 + 3;
                                int var137 = var136 * var157;
                                int var138 = var137 & 7;
                                if (var138 != 0) {
                                    break label167;
                                }

                                int var139 = var111[var120];
                                int var158 = var1 - 356792680;
                                int var159 = var158 - 640386870;
                                int var160 = var159 ^ 1452623993;
                                int var140 = V(var139, var3, var160);
                                var111[var120] = var140;
                                int var141 = var2 + 1;
                                int var142 = var2 * var141;
                                int var161 = var2 + 2;
                                int var143 = var142 * var161;
                                int var162 = var2 + 3;
                                int var144 = var143 * var162;
                                int var145 = var144 & 7;
                                if (var145 != 0) {
                                    var1 ^= -566134108;
                                    var1 >>= 4;
                                    var1 >>>= 24;
                                    var1 += -1104020927;
                                    var1 ^= -23686234;
                                    break label166;
                                }
                                var1 = switch (var1) {
                                    case -322080691 -> {
                                        var1 -= -1464720115;
                                        var1 *= -1012057007;
                                        var1 *= -1986884355;
                                        yield var1 ^ -688759321;
                                    }
                                    default -> var1 ^ -429996314;
                                    case 330847935 -> var1 ^ 1241562881;
                                };
                                Integer var146 = var1;
                                if (var146 == null) {
                                    break label167;
                                }

                                int var147 = var120 + 1;
                                var120 = var147;
                                var1 &= -1179264446;
                                var1 <<= 18;
                                var1 += 356248708;
                                var1 ^= -1801890996;
                            }
                        }

                        switch (var1) {
                            case -68403534:
                                var1 &= 950166538;
                                var1 >>>= 4;
                                var1 >>= 7;
                                var1 ^= 454931719;
                                break;
                            case 79993519:
                                var1 ^= 1488586561;
                                break;
                            case 1057411317:
                            default:
                                var1 ^= 26003061;
                        }
                    } else {
                        var1 -= -1233019904;
                        var1 ^= 1040409722;
                    }

                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        break label167;
                    }

                    int[] var115 = new int[1];
                    long var122 = var2;
                    long var163 = var122 + 1L;
                    var163 = var122 * var163;
                    var122 = var163 & 1L;
                    long var175;
                    var2 = (var175 = var122 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        long var79 = switch (var1) {
                            default -> var1 ^ -566854378;
                            case 454729987 -> {
                                var1 -= -1540601996;
                                yield var1 ^ -1073240596;
                            }
                            case 1894143779 -> var1 ^ 1127911931;
                        };
                        var122 = var79 + 1L;
                        var122 = var79 * var122;
                        var163 = var79 + 2L;
                        var122 *= var163;
                        long var80 = var79 + 3L;
                        var122 *= var80;
                        long var81 = var122 & 7L;
                        long var176;
                        var1 = (var176 = var81 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var1 == 0) {
                            var115[0] = var3;
                            return var115;
                        }
                        break label167;
                    }

                    var1 >>>= 13;
                    var1 += 153186392;
                    var1 *= -1636779813;
                    var1 ^= 2117834909;
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            int var128 = var1 + 2;
            var2 *= var128;
            var128 = var1 + 3;
            var2 *= var128;
            var2 &= 7;
            if (var2 == 0) {
                IllegalStateException var98 = new IllegalStateException();
                throw var98;
            }
        }

        IllegalArgumentException var91 = new IllegalArgumentException();
        throw var91;
    }

    private static int V(int var0, int var1, int var2) {
        Integer var5 = var0;
        if (var5 == null) {
            int var13 = var2 * -177407717;
            var13 >>= 30;
            var13 *= 270929639;
            var13 ^= -591441500;
            int var26 = var0 + 1;
            var26 = var0 * var26;
            int var19 = var26 & 1;
            if (var19 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            } else {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        } else {
            switch (var2) {
                case -406263850:
                    int var9 = var2 * 1312774757;
                    var9 += 144747481;
                    var9 ^= -1826470421;
                    break;
                case 677031283:
                default:
                    int var8 = var2 ^ -1241388701;
                    break;
                case 1289907036:
                    int var3 = var2 ^ -32040790;
            }

            int var12 = DP.R(var0);
            int var4 = DP.QN(var0);
            int var22 = DP.QN(var1);
            var4 *= var22;
            var4 /= 255;
            var22 = DP.W(var0);
            int var6 = DP.W(var1);
            var22 *= var6;
            var22 /= 255;
            var6 = DP.Of(var0);
            int var7 = DP.Of(var1);
            var6 *= var7;
            var6 /= 255;
            return DP.Q(var12, var4, var22, var6);
        }
    }

    public int A() {
        int var1 = t;
        var1 ^= -1960364660;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 |= 919174054;
            var1 &= -242167867;
            var1 ^= -1855399491;
            long var17 = var1;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var24;
            var2 = (var24 = var18 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var2 != 0) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            } else {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            var1 >>= 7;
            var1 |= 2003490048;
            var1 -= 641006198;
            var1 >>>= 1;
            var1 ^= 814785357;
            mN var12 = this.k;
            return var12.qi();
        }
    }

    @Override
    protected void J() {
        int var1 = t;
        var1 ^= 936769110;
        int var2 = System.identityHashCode(this);
        mN var3 = this.k;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var29;
        var2 = (var29 = var4 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        int var26 = of_2.i;
        var1 ^= var26;
        var1 ^= 563708667;
        of_2.i = 563708667;
        int var27 = of_2.Yu;
        var1 ^= var27;
        var1 ^= -5981716;
        of_2.Yu = -5981716;
        if (var2 == 0) {
            var1 &= -247586881;
            var1 <<= 18;
            var1 ^= 487250641;
            Integer var22 = var1;
            if (var22 == null) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            } else {
                var3.wW();
                Pc_2 var23 = this.Q;
                var23.E();
                this.g = null;
            }
        } else {
            var1 ^= 1233084496;
            var1 -= 1371791660;
            var1 += -1246695255;
            var1 ^= 1981577527;
            UnsupportedOperationException var17 = new UnsupportedOperationException();
            throw var17;
        }
    }

    private void K(Entity var1, int var2) {
        label110: {
            int var33;
            int var4 = System.identityHashCode(this);
            Object var5 = (Pc_2)this.g;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            label109:
            if (var6 == 0) {
                var33 = var2 - 940779374;
                var33 *= 960794089;
                var33 ^= 1889370150;
                if (var5 != null) {
                    var33 *= 172433735;
                    var33 += -1360878410;
                    var33 ^= 553835418;
                    long var76 = var33;
                    long var7 = var76 + 1L;
                    var7 = var76 * var7;
                    long var77 = var7 & 1L;
                    long var147;
                    int var78 = (var147 = var77 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                    if (var78 != 0) {
                        break label110;
                    }

                    var5 = this.g;
                    long var95 = var4;
                    long var8 = var95 + 1L;
                    var8 = var95 * var8;
                    long var10 = var95 + 2L;
                    var8 *= var10;
                    long var96 = var95 + 3L;
                    var8 *= var96;
                    long var97 = var8 & 7L;
                    long var148;
                    var6 = (var148 = var97 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        switch (var33) {
                            case -623315277:
                            default:
                                var33 ^= 649845927;
                                break label109;
                            case -349557325:
                                var33 ^= -1209065363;
                                var33 ^= 1523255873;
                                break label109;
                            case 515815052:
                                var33 ^= 222521793;
                                break label109;
                        }
                    }

                    var33 *= -1489886197;
                    var33 += -1216392803;
                    var33 ^= 2131554676;
                    World var99 = var1.getEntityWorld();
                    if ((Object)var5 != var99) {
                        var33 -= 2036626592;
                        var33 *= 24269303;
                        var33 &= 1623235523;
                        var33 ^= 12088641;
                        var33 ^= -1762188903;
                        this.J();
                        var33 >>>= 3;
                        var33 += -1714973683;
                        var33 += 1675776083;
                        var33 ^= -2014110254;
                    } else {
                        switch (var33) {
                            case 230589754:
                                var33 |= -581470602;
                                var33 &= -304280844;
                                var33 |= -1862777232;
                                var33 |= -1846029135;
                                var33 ^= 1317999884;
                                break;
                            case 1414589081:
                            default:
                                var33 ^= -1753518688;
                                break;
                            case 1563247085:
                                var33 ^= 908498498;
                        }
                    }
                } else {
                    switch (var33) {
                        case -1100265944:
                            var33 ^= -1389949579;
                            break;
                        case -961792670:
                        default:
                            var33 ^= -1996587825;
                            break;
                        case 961086581:
                            var33 ^= 280955280;
                            var33 ^= -1165570532;
                    }
                }

                long var80 = var33;
                long var113 = var80 + 1L;
                var113 = var80 * var113;
                long var9 = var80 + 2L;
                var113 *= var9;
                long var81 = var80 + 3L;
                var113 *= var81;
                long var82 = var113 & 7L;
                long var149;
                int var83 = (var149 = var82 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                if (var83 != 0) {
                    break label110;
                }

                var5 = var1.getEntityWorld();
                this.g = var5;
                byte var85 = 0;
                NumberSetting var100 = this.Yp;
                var6 = var100.B();
                var6 = var6;
                Integer var117 = var4;
                if (var117 != null) {
                    var33 = switch (var33) {
                        case -1821326343 -> {
                            var33 &= -1787799024;
                            var33 += 623169391;
                            var33 |= 598949592;
                            yield var33 ^ -757310849;
                        }
                        default -> var33 ^ 1627897418;
                        case 120572837 -> var33 ^ 2074627388;
                    };
                    int var86 = var85;
                    var33 -= 741049934;
                    var33 &= -783364944;
                    var33 ^= 635478489;

                    label99:
                    while (true) {
                        var113 = var33;
                        var9 = var113 + 1L;
                        var9 = var113 * var9;
                        var113 = var9 & 1L;
                        long var150;
                        int var120 = (var150 = var113 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var120 != 0) {
                            break label110;
                        }

                        if (var86 >= var6) {
                            var33 |= 133689900;
                            var33 ^= -1606730508;
                            var33 += 1801573237;
                            var33 ^= 1207415756;
                            int var87 = var33 + 1;
                            int var88 = var33 * var87;
                            var6 = var33 + 2;
                            int var89 = var88 * var6;
                            var6 = var33 + 3;
                            int var90 = var89 * var6;
                            int var91 = var90 & 7;
                            if (var91 != 0) {
                                break label110;
                            }

                            var5 = this.Q;
                            var6 = var4 + 1;
                            var6 = var4 * var6;
                            int var126 = var4 + 2;
                            var6 *= var126;
                            var4 += 3;
                            var6 *= var4;
                            var4 = var6 & 7;
                            if (var4 == 0) {
                                var33 *= 1954654547;
                                var33 -= 393414251;
                                var33 -= -770622483;
                                var33 ^= 1013625868;
                                var33 ^= -1475277780;
                                long var109 = var33;
                                long var138 = var109 + 1L;
                                var138 = var109 * var138;
                                long var146 = var109 + 2L;
                                var138 *= var146;
                                long var110 = var109 + 3L;
                                var138 *= var110;
                                long var111 = var138 & 7L;
                                long var151;
                                var4 = (var151 = var111 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                                if (var4 == 0) {
                ((Pc_2)var5).aw(var1, 30);
                                    return;
                                }
                                break label110;
                            }

                            switch (var33) {
                                case -420284044:
                                    var33 ^= 1004679000;
                                    break label99;
                                case 1154557250:
                                    var33 &= -1620522909;
                                    var33 -= 210862880;
                                    var33 ^= -241141059;
                                    break label99;
                                case 1270626805:
                                default:
                                    var33 ^= -1731896433;
                                    break label99;
                            }
                        }

                        var33 ^= -899331656;
                        var33 &= -135855156;
                        var33 += -537983766;
                        var33 ^= 1402412450;
                        int var121 = var33 - 1083071231;
                        int var122 = var121 + -1451061163;
                        int var123 = var122 >>> 12;
                        int var124 = var123 ^ 99424907;
                        this.fQ(var1, var124);
                        int var125 = var86 + 1;
                        int var130 = var4 + 1;
                        var130 = var4 * var130;
                        int var144 = var4 + 2;
                        var130 *= var144;
                        int var145 = var4 + 3;
                        var130 *= var145;
                        var130 &= 7;
                        if (var130 != 0) {
                            var33 -= 1927575290;
                            var33 ^= 353281553;
                            break;
                        }

                        var33 -= 1628341121;
                        var33 <<= 19;
                        var33 ^= -141848356;
                        var130 = var33 + 1;
                        var130 = var33 * var130;
                        var130 &= 1;
                        if (var130 != 0) {
                            break label110;
                        }

                        var86 = var125;
                        var33 *= -1353337455;
                        var33 &= -979149226;
                        var33 ^= 1154819348;
                        var33 ^= -182759191;
                    }
                } else {
                    var33 ^= 378546002;
                    var33 ^= -2081496268;
                }
            } else {
                switch (var2) {
                    case -1144894054:
                    default:
                        var33 = var2 ^ 438992875;
                        break;
                    case -28921112:
                        var33 = var2 ^ 1634024484;
                        break;
                    case 1803589193:
                        var33 = var2 + 843240832;
                        var33 ^= 978845121;
                        var33 += -1481521726;
                        var33 *= 813030207;
                        var33 ^= -2144967895;
                }
            }

            Integer var70 = var33;
            if (var70 != null) {
                AssertionError var72 = new AssertionError();
                throw var72;
            }
        }

        IllegalStateException var71 = new IllegalStateException();
        throw var71;
    }

    private void X(int var1) {
        int var3 = System.identityHashCode(this);
        Pc_2 var4 = this.Q;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 == 0) {
            int var2 = var1 * 258085501;
            var2 *= 1329588007;
            var2 &= -1949744546;
            var2 |= -34636650;
            var2 ^= -2009337751;
            long var29 = var2;
            long var7 = var29 + 1L;
            var7 = var29 * var7;
            long var30 = var7 & 1L;
            long var32;
            var3 = (var32 = var30 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var3 == 0) {
                Predicate var23 = this.a;
                var4.Ps(var23);
                return;
            }
        } else {
            int var13 = var1 >>> 11;
            var13 ^= -1737086671;
            long var15 = var13;
            long var24 = var15 + 1L;
            long var25 = var15 * var24;
            long var6 = var15 + 2L;
            long var26 = var25 * var6;
            long var16 = var15 + 3L;
            long var27 = var26 * var16;
            long var17 = var27 & 7L;
            long var33;
            var13 = (var33 = var17 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var13 == 0) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    private boolean Re(Entity var1) {
        label76: {
            int var2 = t;
            var2 ^= 1281113404;
            int var3 = System.identityHashCode(this);
            int var4 = (var1.isRemoved()) ? 1 : 0;
            Integer var5 = var3;
            if (var5 == null) {
                var2 *= 1028948233;
                var2 ^= 518828063;
                var2 |= 1898982085;
                var2 ^= 2077233581;
            } else {
                var2 >>>= 19;
                var2 ^= 490431907;
                long var69 = var2;
                long var7 = var69 + 1L;
                var7 = var69 * var7;
                long var70 = var7 & 1L;
                long var100;
                int var71 = (var100 = var70 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                if (var71 != 0) {
                    break label76;
                }

                if (var4 != 0) {
                    var2 += -931010908;
                    var2 *= -1853744051;
                    var2 ^= 255484037;
                    return false;
                }

                var2 *= -1953603117;
                var2 += 946460785;
                var2 >>>= 12;
                var2 += 273758273;
                var2 ^= 151724675;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label76;
                }

                int var67 = 0;
                NumberSetting var72 = this.cN;
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var101;
                int var76 = (var101 = var6 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                if (var76 == 0) {
                    var2 &= -246746336;
                    var2 += 1060773632;
                    var2 ^= 439848774;
                    int var77 = var2 + 1;
                    int var78 = var2 * var77;
                    int var79 = var78 & 1;
                    if (var79 != 0) {
                        break label76;
                    }

                    var71 = var72.B();
                    var71 = var71;
                    var67 = var67;
                    var2 <<= 4;
                    var2 >>>= 17;
                    var2 >>>= 25;
                    var2 ^= -1501123759;

                    label70:
                    while (true) {
                        if (var67 >= var71) {
                            var2 = switch (var2) {
                                case -1501123759 -> {
                                    var2 -= -621148619;
                                    var2 &= -333457956;
                                    var2 |= 181183790;
                                    yield var2 ^ -2088587272;
                                }
                                case -50330241 -> var2 ^ -1691994068;
                                default -> var2 ^ -1849904209;
                            };
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var3 &= 1;
                            if (var3 == 0) {
                                return true;
                            }
                            break label76;
                        }

                        var2 |= 1642959004;
                        var2 ^= -1764744447;
                        var2 -= -1724508263;
                        var2 -= -536291293;
                        var2 ^= 1560305916;
                        int var80 = var2 * -1824232703;
                        int var81 = var80 - 6668521;
                        int var82 = var81 ^ -292942868;
                        this.fQ(var1, var82);
                        int var83 = var67 + 1;
                        int var85 = var3 + 1;
                        int var86 = var3 * var85;
                        int var95 = var3 + 2;
                        int var87 = var86 * var95;
                        int var96 = var3 + 3;
                        int var88 = var87 * var96;
                        int var89 = var88 & 7;
                        if (var89 != 0) {
                            switch (var2) {
                                case -1526674980:
                                    var2 ^= -705795792;
                                    var2 &= -1017371150;
                                    var2 ^= 84727967;
                                    var2 &= 344373588;
                                    var2 ^= 137036308;
                                    break label70;
                                case -746763428:
                                    var2 ^= -1692518232;
                                    break label70;
                                case -595915898:
                                default:
                                    var2 ^= 1718694172;
                                    break label70;
                            }
                        }
                        var2 = switch (var2) {
                            case -1526674980 -> {
                                var2 += 263331709;
                                yield var2 ^ 117397917;
                            }
                            default -> var2 ^ 1884237977;
                            case 897045619 -> var2 ^ 340758705;
                        };
                        var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var102;
                        int var93 = (var102 = var7 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                        if (var93 != 0) {
                            break label76;
                        }

                        var67 = var83;
                        var2 += -2034737687;
                        var2 >>= 26;
                        var2 *= 1972734687;
                        var2 ^= -928304285;
                    }
                } else {
                    var2 += -114832972;
                    var2 += 1281035290;
                    var2 ^= 1388799678;
                }
            }

            IllegalArgumentException var56 = new IllegalArgumentException();
            throw var56;
        }

        UnsupportedOperationException var60 = new UnsupportedOperationException();
        throw var60;
    }

    private void fQ(Entity var1, int var2) {
        bA_2 var202 = null;
        int var4 = System.identityHashCode(this);
        ThreadLocalRandom var5 = ThreadLocalRandom.current();
        NumberSetting var6 = this.Ye;
        float var195 = var6.WM();
        float var196 = 1.6F * var195;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        var7 &= 1;
        label242:
        if (var7 == 0) {
            label246: {
                int var51;
                float var208;
                label247: {
                    var51 = switch (var2) {
                        case -852265004 -> var2 ^ -1702603388;
                        case 98826015 -> {
                            int var32 = var2 & 983004891;
                            var32 >>= 1;
                            var32 <<= 11;
                            var32 &= -769734495;
                            yield var32 ^ -943869439;
                        }
                        default -> var2 ^ 9802761;
                    };
                    ModeSetting var200 = this.Ch;
                    Enum var201 = var200.A();
                    var202 = (bA_2)var201;
                    bA_2 var8 = bA_2.BOUNCE;
                    if (var202 != var8) {
                        var51 |= 998497750;
                        var51 ^= 1631343278;
                        bA_2 var203 = bA_2.HOP;
                        long var9 = var4;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var410;
                        int var210 = (var410 = var9 - 0L) == 0L ? 0 : (var410 < 0L ? -1 : 1);
                        if (var210 != 0) {
                            var51 |= 884872187;
                            var51 ^= 913900538;
                            var51 += 60847302;
                            var51 ^= -970412059;
                            break label242;
                        }

                        var51 *= -1762718341;
                        var51 ^= 397047446;
                        var51 += 1510938321;
                        var51 ^= 1537913165;
                        int var211 = var51 + 1;
                        int var212 = var51 * var211;
                        int var10 = var51 + 2;
                        int var213 = var212 * var10;
                        var10 = var51 + 3;
                        int var214 = var213 * var10;
                        int var215 = var214 & 7;
                        if (var215 != 0) {
                            break label246;
                        }

                        if (var202 != var203) {
                            var51 += 32820729;
                            var51 ^= 1443618702;
                            var208 = -var196;
                            double var205 = var208;
                            double var237 = var196;
                            double var206 = var5.nextDouble(var205, var237);
                            var208 = (float)var206;
                            var9 = var4;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var411;
                            int var219 = (var411 = var9 - 0L) == 0L ? 0 : (var411 < 0L ? -1 : 1);
                            if (var219 != 0) {
                                var51 >>>= 13;
                                var51 += -1961060510;
                                var51 <<= 3;
                                var51 |= 75221663;
                                var51 ^= 380920029;
                                break label242;
                            }

                            var51 >>= 4;
                            var51 ^= -680322458;
                            var9 = var51;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var412;
                            int var222 = (var412 = var9 - 0L) == 0L ? 0 : (var412 < 0L ? -1 : 1);
                            if (var222 != 0) {
                                break label246;
                            }

                            var208 = var208;
                            switch (var51) {
                                case -734166958:
                                    var51 ^= 1984592057;
                                    var51 ^= 2076461988;
                                    break label247;
                                case 196799307:
                                    var51 ^= 559195930;
                                    break label247;
                                case 1853446766:
                                default:
                                    var51 ^= 68148471;
                                    break label247;
                            }
                        }

                        switch (var51) {
                            case -1768367053:
                                var51 ^= -1436202223;
                                break;
                            case -703429101:
                            default:
                                var51 ^= 772856146;
                                break;
                            case 1626189515:
                                var51 *= -658172265;
                                var51 ^= -563207046;
                                var51 -= -1266423310;
                                var51 <<= 22;
                                var51 ^= -1445269838;
                        }
                    } else {
                        var51 &= -998972176;
                        var51 -= 1410636654;
                        var51 -= -1288112938;
                        var51 ^= 1615700238;
                    }

                    Integer var223 = var51;
                    if (var223 == null) {
                        break label246;
                    }

                    double var224 = var5.nextDouble(1.6, 4.0);
                    float var225 = (float)var224;
                    NumberSetting var238 = this.Ye;
                    float var239 = var238.WM();
                    float var226 = var225 * var239;
                    long var240 = var4;
                    long var12 = var240 + 1L;
                    var12 = var240 * var12;
                    long var241 = var12 & 1L;
                    long var413;
                    int var242 = (var413 = var241 - 0L) == 0L ? 0 : (var413 < 0L ? -1 : 1);
                    if (var242 != 0) {
                        var51 *= -1431264803;
                        var51 *= 1380081417;
                        var51 ^= -588268584;
                        break label242;
                    }

                    var51 <<= 15;
                    var51 -= -1834263186;
                    var51 ^= -169735411;
                    var51 |= -102571087;
                    var51 ^= -1995996870;
                    long var243 = var51;
                    var12 = var243 + 1L;
                    var12 = var243 * var12;
                    long var244 = var12 & 1L;
                    long var414;
                    int var245 = (var414 = var244 - 0L) == 0L ? 0 : (var414 < 0L ? -1 : 1);
                    if (var245 != 0) {
                        break label246;
                    }

                    var208 = var226;
                    var51 |= -179631566;
                    var51 ^= 744020472;
                }

                long var227 = var51;
                long var257 = var227 + 1L;
                var257 = var227 * var257;
                var227 = var257 & 1L;
                long var415;
                int var229 = (var415 = var227 - 0L) == 0L ? 0 : (var415 < 0L ? -1 : 1);
                if (var229 == 0) {
                    double var230 = var1.getX();
                    double var259 = var1.getY();
                    float var280 = var1.getHeight();
                    double var281 = var280;
                    double var282 = var281 * 0.5;
                    double var260 = var259 + var282;
                    double var283 = var1.getZ();
                    float var15 = 1.0F;
                    int var16 = var4 + 1;
                    var16 = var4 * var16;
                    int var17 = var4 + 2;
                    var16 *= var17;
                    var17 = var4 + 3;
                    var16 *= var17;
                    var16 &= 7;
                    if (var16 != 0) {
                        var51 |= 410048548;
                        var51 >>= 15;
                        var51 <<= 26;
                        var51 ^= -699424990;
                        break label242;
                    }

                    var51 -= -666264092;
                    var51 *= 212673721;
                    var51 |= -1729167121;
                    var51 >>= 6;
                    var51 ^= -1327830712;
                    Integer var303 = var51;
                    label218:
                    if (var303 != null) {
                        Entity var304 = i_2.QI();
                        double var318;
                        double var333;
                        double var345;
                        float var355;
                        if (var1 == var304) {
                            var51 = switch (var51) {
                                default -> var51 ^ 763074571;
                                case -438632160 -> var51 ^ -878033322;
                                case 1328355155 -> {
                                    var51 -= 680166617;
                                    var51 |= 1957851528;
                                    var51 <<= 19;
                                    yield var51 ^ 501415411;
                                }
                            };
                            long var305 = var51;
                            long var18 = var305 + 1L;
                            long var323 = var305 * var18;
                            long var20 = var305 + 2L;
                            long var324 = var323 * var20;
                            long var306 = var305 + 3L;
                            long var325 = var324 * var306;
                            long var307 = var325 & 7L;
                            long var416;
                            int var308 = (var416 = var307 - 0L) == 0L ? 0 : (var416 < 0L ? -1 : 1);
                            if (var308 != 0) {
                                break label218;
                            }

                            int var309 = (i_2.ax()) ? 1 : 0;
                            var17 = var4 + 1;
                            var17 = var4 * var17;
                            var17 &= 1;
                            if (var17 != 0) {
                                var51 *= 1129725033;
                                var51 |= -1384980327;
                                var51 |= -617489829;
                                var51 ^= 30121867;
                                var51 ^= -1258815918;
                                break label242;
                            }
                            var51 = switch (var51) {
                                case -2110587405 -> {
                                    var51 += -1239682286;
                                    var51 *= -1636778481;
                                    var51 *= -762626421;
                                    var51 <<= 29;
                                    yield var51 ^ 104375310;
                                }
                                case -899055076 -> var51 ^ -676242296;
                                default -> var51 ^ 2084273527;
                            };
                            if (var309 != 0) {
                                var51 = switch (var51) {
                                    case -735717102 -> var51 ^ -1817699972;
                                    case 641246222 -> {
                                        var51 ^= 1973337021;
                                        var51 *= 713891457;
                                        var51 -= -140744179;
                                        yield var51 ^ 1157023504;
                                    }
                                    default -> var51 ^ 1796335574;
                                };
                                long var310 = var51;
                                long var326 = var310 + 1L;
                                long var327 = var310 * var326;
                                long var334 = var310 + 2L;
                                long var328 = var327 * var334;
                                long var311 = var310 + 3L;
                                long var329 = var328 * var311;
                                long var312 = var329 & 7L;
                                long var417;
                                var309 = (var417 = var312 - 0L) == 0L ? 0 : (var417 < 0L ? -1 : 1);
                                if (var309 != 0) {
                                    break label218;
                                }

                                double var314 = var5.nextDouble((float) (Math.PI * 2));
                                var333 = Math.cos(var314);
                                var333 *= 0.9;
                                var333 = var230 + var333;
                                double var315 = Math.sin(var314);
                                long var335 = var4;
                                long var22 = var335 + 1L;
                                long var346 = var335 * var22;
                                long var24 = var335 + 2L;
                                long var347 = var346 * var24;
                                long var336 = var335 + 3L;
                                long var348 = var347 * var336;
                                long var337 = var348 & 7L;
                                long var418;
                                int var338 = (var418 = var337 - 0L) == 0L ? 0 : (var418 < 0L ? -1 : 1);
                                if (var338 != 0) {
                                    switch (var51) {
                                        case 135440740:
                                            var51 ^= 2026161290;
                                            break label242;
                                        case 1049710134:
                                            var51 >>= 7;
                                            var51 ^= -1198866672;
                                            var51 <<= 29;
                                            var51 += -257317363;
                                            var51 ^= 988166447;
                                            break label242;
                                        case 1357533769:
                                        default:
                                            var51 ^= 1035036773;
                                            break label242;
                                    }
                                }

                                var51 += -1906256350;
                                var51 += 149299;
                                var51 &= 971448437;
                                var51 *= -2144389665;
                                var51 ^= -981985298;
                                long var339 = var51;
                                long var349 = var339 + 1L;
                                long var350 = var339 * var349;
                                var24 = var339 + 2L;
                                long var351 = var350 * var24;
                                long var340 = var339 + 3L;
                                long var352 = var351 * var340;
                                long var341 = var352 & 7L;
                                long var419;
                                int var342 = (var419 = var341 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                                if (var342 != 0) {
                                    break label218;
                                }

                                double var316 = var315 * 0.9;
                                double var317 = var283 + var316;
                                var345 = var1.getY();
                                double var353 = var5.nextDouble(0.1, 0.9);
                                var345 += var353;
                                var355 = 0.6F;
                                var333 = var333;
                                var345 = var345;
                                var318 = var317;
                                var355 = var355;
                                var51 >>>= 20;
                                var51 &= -1350152602;
                                var51 ^= 535819886;
                            } else {
                                var51 -= 1558554760;
                                var51 += 1441766699;
                                var51 ^= 1080117085;
                                Integer var23 = var51;
                                if (var23 == null) {
                                    break label218;
                                }

                                var333 = var230;
                                var345 = var260;
                                var23 = var4;
                                if (var23 == null) {
                                    var51 *= 1661828843;
                                    var51 ^= -345036154;
                                    break label242;
                                }

                                var51 += 333457473;
                                var51 &= 676229236;
                                var51 ^= 320300323;
                                int var362 = var51 + 1;
                                var362 = var51 * var362;
                                int var389 = var51 + 2;
                                var362 *= var389;
                                var389 = var51 + 3;
                                var362 *= var389;
                                var362 &= 7;
                                if (var362 != 0) {
                                    break label218;
                                }

                                var318 = var283;
                                var355 = var15;
                                var51 ^= 572676586;
                                var51 ^= 961466295;
                                var51 ^= -1092409411;
                                var51 ^= -1988941105;
                            }
                        } else {
                            var51 += -704056966;
                            var51 |= 1382671698;
                            var51 ^= 182767644;
                            long var367 = var51;
                            long var25 = var367 + 1L;
                            var25 = var367 * var25;
                            long var27 = var367 + 2L;
                            var25 *= var27;
                            var367 += 3L;
                            var25 *= var367;
                            var367 = var25 & 7L;
                            long var420;
                            int var370 = (var420 = var367 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                            if (var370 != 0) {
                                break label218;
                            }

                            var333 = var230;
                            var345 = var260;
                            Integer var231 = var4;
                            if (var231 == null) {
                                switch (var51) {
                                    case 38452325:
                                    default:
                                        var51 ^= -433999971;
                                        break label242;
                                    case 510984954:
                                        var51 ^= -1972044239;
                                        break label242;
                                    case 2107325891:
                                        var51 >>>= 14;
                                        var51 |= 1176170068;
                                        var51 ^= 206856542;
                                        break label242;
                                }
                            }

                            var51 -= -740645458;
                            var51 -= 1098826523;
                            var51 >>= 9;
                            var51 &= 1643012893;
                            var51 ^= 377465021;
                            var318 = var283;
                            var355 = var15;
                            var51 *= -2014024505;
                            var51 -= -849840188;
                            var51 ^= -284109113;
                        }

                        int var232 = var51 + 1;
                        int var233 = var51 * var232;
                        int var234 = var233 & 1;
                        label193:
                        if (var234 == 0) {
                            mN var235 = this.k;
                            float var246 = -var196;
                            double var247 = var246;
                            double var270 = var196;
                            double var248 = var5.nextDouble(var247, var270);
                            var246 = (float)var248;
                            float var261 = -var196;
                            double var262 = var261;
                            double var284 = var196;
                            double var263 = var5.nextDouble(var262, var284);
                            float var197 = (float)var263;
                            NumberSetting var264 = this.ke;
                            long var271 = var4;
                            long var14 = var271 + 1L;
                            var14 = var271 * var14;
                            long var371 = var271 + 2L;
                            var14 *= var371;
                            long var272 = var271 + 3L;
                            var14 *= var272;
                            long var273 = var14 & 7L;
                            long var421;
                            int var274 = (var421 = var273 - 0L) == 0L ? 0 : (var421 < 0L ? -1 : 1);
                            if (var274 != 0) {
                                var51 *= 150903015;
                                var51 ^= -160855750;
                                break label242;
                            }

                            var51 += 1095937288;
                            var51 &= 26208366;
                            var51 ^= 1646092447;
                            float var265 = var264.WM();
                            var270 = var5.nextDouble(0.85, 1.15);
                            float var276 = (float)var270;
                            float var266 = var265 * var276;
                            float var277 = 0.06F * var355;
                            NumberSetting var285 = this.c;
                            var280 = var285.WM();
                            float var278 = var277 * var280;
                            double var287 = var5.nextDouble(0.8, 1.2);
                            var280 = (float)var287;
                            float var279 = var278 * var280;
                            double var289 = var5.nextDouble((float) (Math.PI * 2));
                            var280 = (float)var289;
                            double var294 = var5.nextDouble(0.17, 1.05);
                            boolean var356 = var5.nextBoolean();
                            byte var358;
                            if (var356) {
                                var51 += 141797976;
                                var51 ^= -1158227488;
                                Integer var357 = var51;
                                if (var357 == null) {
                                    break label193;
                                }

                                var358 = 1;
                                var51 += -1503455848;
                                var51 ^= 618542947;
                            } else {
                                var51 >>>= 7;
                                var51 ^= -205762981;
                                var51 ^= -513864768;
                                var51 -= 873270604;
                                var51 ^= 725864739;
                                var371 = var51;
                                long var397 = var371 + 1L;
                                var397 = var371 * var397;
                                long var408 = var371 + 2L;
                                var397 *= var408;
                                var371 += 3L;
                                var397 *= var371;
                                var371 = var397 & 7L;
                                long var422;
                                int var375 = (var422 = var371 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                                if (var375 != 0) {
                                    break label193;
                                }

                                var358 = -1;
                                switch (var51) {
                                    case -1863276914:
                                    default:
                                        var51 ^= 979113608;
                                        break;
                                    case -178537059:
                                        var51 -= -99283413;
                                        var51 <<= 3;
                                        var51 *= 1155767355;
                                        var51 ^= -514208292;
                                        break;
                                    case 364989188:
                                        var51 ^= -444708217;
                                }
                            }

                            double var359 = var358;
                            long var391 = var4;
                            long var26 = var391 + 1L;
                            var26 = var391 * var26;
                            var391 = var26 & 1L;
                            long var423;
                            int var393 = (var423 = var391 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
                            if (var393 != 0) {
                                var51 <<= 22;
                                var51 ^= -1320181982;
                                break label242;
                            }

                            var51 >>= 24;
                            var51 *= 704492785;
                            var51 *= -155239739;
                            var51 *= -415380075;
                            var51 ^= 1570110868;
                            double var295 = var294 * var359;
                            float var296 = (float)var295;
                            RZ var297 = this.XZ;
                            SpriteShape var298 = var297.xZ(var5);
                            var355 = var5.nextFloat();
                            BooleanSetting var376 = this.y;
                            boolean var377 = var376.vb();
                            if (var377) {
                                var51 = switch (var51) {
                                    case -968896044 -> var51 ^ -171267336;
                                    default -> var51 ^ 2120228718;
                                    case -534368881 -> {
                                        var51 += -1370389968;
                                        var51 -= -1607563538;
                                        var51 |= 857056897;
                                        var51 |= -1742815877;
                                        yield var51 ^ 1673432581;
                                    }
                                };
                                int var378 = var51 * 1664477703;
                                int var379 = var378 | 1771693037;
                                int var380 = var379 ^ 1308163029;
                                int var192 = HC(var5, var380);
                                int var381 = var4 + 1;
                                int var382 = var4 * var381;
                                var4 = var382 & 1;
                                if (var4 != 0) {
                                    var51 |= 1863151085;
                                    var51 ^= -1247616291;
                                    break label242;
                                }

                                var51 *= 1972750077;
                                var51 <<= 31;
                                var51 += -1500141409;
                                var51 ^= -182304347;
                                var4 = var192;
                                var51 >>>= 14;
                                var51 <<= 24;
                                var51 >>>= 6;
                                var51 ^= 475627876;
                            } else {
                                var51 |= -754647524;
                                var51 &= -65052835;
                                var51 ^= 155130383;
                                var51 |= -2092221291;
                                var51 ^= -377682248;
                                var371 = var51;
                                long var401 = var371 + 1L;
                                var401 = var371 * var401;
                                long var409 = var371 + 2L;
                                var401 *= var409;
                                var371 += 3L;
                                var401 *= var371;
                                var371 = var401 & 7L;
                                long var424;
                                int var193 = (var424 = var371 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                                if (var193 != 0) {
                                    break label193;
                                }

                                var4 = 0;
                                var51 -= -606748304;
                                var51 -= 1067840069;
                                var51 ^= -374389218;
                            }

                            var371 = var51;
                            long var405 = var371 + 1L;
                            var405 = var371 * var405;
                            var371 = var405 & 1L;
                            long var425;
                            int var194 = (var425 = var371 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                            if (var194 == 0) {
                                var235.B(var333, var345, var318, var246, var208, var197, var266, var279, var280, var296, var298, var202, var355, var4);
                                return;
                            }
                        }
                    }
                }
            }

            RuntimeException var191 = new RuntimeException();
            throw var191;
        } else {
            int var3 = var2 | 159185244;
            var3 += 106650072;
            var3 ^= 1578419733;
        }

        IllegalStateException var188 = new IllegalStateException();
        throw var188;
    }

    private static int HC(ThreadLocalRandom var0, int var1) {
        label67: {
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
                var12 = var1 | -1067304512;
                var12 -= -1702177490;
                var12 &= -2135564294;
                var12 ^= -1413459246;
            } else {
                var12 = var1 - -132944945;
                var12 ^= -652082812;
                var4 = var12 + 1;
                var4 = var12 * var4;
                var5 = var12 + 2;
                var4 *= var5;
                var5 = var12 + 3;
                var4 *= var5;
                var4 &= 7;
                if (var4 != 0) {
                    break label67;
                }

                var4 = var0.nextInt(4);
                if (var4 == 0) {
                    var12 = switch (var12) {
                        default -> var12 ^ 1499197545;
                        case 1317419064 -> var12 ^ 611294578;
                        case 1859102175 -> {
                            var12 *= -1642486037;
                            var12 -= -1651315342;
                            yield var12 ^ -335463884;
                        }
                    };
                    Integer var52 = var12;
                    if (var52 == null) {
                        break label67;
                    }

                    float var53 = var0.nextFloat();
                    float var54 = var53 * 0.2F;
                    float var55 = 0.6F + var54;
                    float var67 = var0.nextFloat();
                    float var68 = var67 * 0.3F;
                    float var69 = 0.6F + var68;
                    float var6 = var0.nextFloat();
                    var6 *= 0.2F;
                    Integer var7 = var3;
                    if (var7 != null) {
                        var12 -= 388643639;
                        var12 *= 271269221;
                        var12 ^= 2046175073;
                        var12 ^= 1595826066;
                        return DP.J(1.0F, var55, var69, var6);
                    }

                    switch (var12) {
                        case -1941601789:
                            var12 ^= -943134722;
                            break;
                        case 999914012:
                        default:
                            var12 ^= -816413438;
                            break;
                        case 2036255351:
                            var12 *= 1310151389;
                            var12 ^= 1024454865;
                    }
                } else {
                    var12 >>= 5;
                    var12 += 824203569;
                    var12 ^= -139465563;
                    var4 = var12 + 1;
                    var4 = var12 * var4;
                    var5 = var12 + 2;
                    var4 *= var5;
                    var5 = var12 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 != 0) {
                        break label67;
                    }

                    float var61 = var0.nextFloat();
                    float var62 = var61 * 0.2F;
                    float var63 = 0.1F + var62;
                    float var72 = var0.nextFloat();
                    float var73 = var72 * 0.3F;
                    int var75 = var3 + 1;
                    var75 = var3 * var75;
                    var3 = var75 & 1;
                    if (var3 == 0) {
                        long var32 = switch (var12) {
                            case -1225142013 -> var12 ^ 946218190;
                            case -1019659526 -> {
                                var12 |= 421641027;
                                var12 += 1189753355;
                                var12 >>= 2;
                                yield var12 ^ -432176529;
                            }
                            default -> var12 ^ 1750904821;
                        };
                        long var79 = var32 + 1L;
                        long var80 = var32 * var79;
                        long var33 = var80 & 1L;
                        long var82;
                        var12 = (var82 = var33 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                        if (var12 == 0) {
                            float var35 = 0.4F + var73;
                            float var40 = var0.nextFloat();
                            float var41 = var40 * 0.2F;
                            return DP.J(1.0F, var63, var35, var41);
                        }
                        break label67;
                    }

                    switch (var12) {
                        case -1960437889:
                        default:
                            var12 ^= -666034578;
                            break;
                        case -1019659526:
                            var12 <<= 24;
                            var12 *= 955444697;
                            var12 ^= 1095767658;
                            break;
                        case 531836414:
                            var12 ^= 492617789;
                    }
                }
            }

            long var77 = var12;
            long var8 = var77 + 1L;
            var8 = var77 * var8;
            var77 = var8 & 1L;
            long var83;
            var3 = (var83 = var77 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
            if (var3 == 0) {
                UnsupportedOperationException var39 = new UnsupportedOperationException();
                throw var39;
            }
        }

        UnsupportedOperationException var36 = new UnsupportedOperationException();
        throw var36;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1762987602;
        int var2 = Module.C;
        int var4 = of_2.xF(var3, var1, var2);
        t = var4;
    }
}
