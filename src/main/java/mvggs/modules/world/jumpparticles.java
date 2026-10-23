package mvggs.modules.world;

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
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public final class jumpparticles extends Module {
    private static final float HD = 0.06F;
    private final RZ kA;
    private final ModeSetting CD;
    private final NumberSetting Gy;
    private final NumberSetting f;
    private final NumberSetting Ve;
    private final NumberSetting eS;
    private final ModeSetting I;
    private final NumberSetting V;
    private final zS b;
    private final mN Jl;
    private boolean mp;
    private double u;
    private Object d;
    public static final int e;

    public jumpparticles() {
        super("jump_particles", "Jump Particles", ModuleCategory.WORLD);
        ModuleCategory var1 = ModuleCategory.WORLD;

        Ru var2 = Ru.STARS;
        RZ var3 = new RZ(var2);
        nM var4 = this.bU(var3);
        RZ var5 = (RZ)var4;
        this.kA = var5;
        gm_3 var41 = gm_3.HOP;
        ModeSetting var6 = new ModeSetting("motion", "Motion", var41);
        Setting var7 = this.addSetting(var6);
        ModeSetting var8 = (ModeSetting)var7;
        this.CD = var8;
        NumberSetting var9 = new NumberSetting("amount", "Amount", 5.0F, 1.0F, 20.0F);
        NumberSetting var10 = var9.W(1.0F);
        Setting var11 = this.addSetting(var10);
        NumberSetting var12 = (NumberSetting)var11;
        this.Gy = var12;
        NumberSetting var13 = new NumberSetting("speed", "Speed", 1.0F, 0.2F, 3.0F);
        NumberSetting var14 = var13.W(0.05F);
        NumberSetting var15 = var14.L("x");
        Setting var16 = this.addSetting(var15);
        NumberSetting var17 = (NumberSetting)var16;
        this.f = var17;
        NumberSetting var18 = new NumberSetting("lifetime", "Lifetime", 2.0F, 1.0F, 10.0F);
        NumberSetting var19 = var18.W(0.1F);
        NumberSetting var20 = var19.L("s");
        Setting var21 = this.addSetting(var20);
        NumberSetting var22 = (NumberSetting)var21;
        this.Ve = var22;
        NumberSetting var23 = new NumberSetting("size", "Size", 1.0F, 0.4F, 3.0F);
        NumberSetting var24 = var23.W(0.05F);
        NumberSetting var25 = var24.L("x");
        Setting var26 = this.addSetting(var25);
        NumberSetting var27 = (NumberSetting)var26;
        this.eS = var27;
        ka var42 = ka.ALPHA;
        ModeSetting var28 = new ModeSetting("fade", "Fade", var42);
        Setting var29 = this.addSetting(var28);
        ModeSetting var30 = (ModeSetting)var29;
        this.I = var30;
        NumberSetting var31 = new NumberSetting("glow", "Glow", 0.7F, 0.0F, 1.0F);
        NumberSetting var32 = var31.W(0.05F);
        Setting var33 = this.addSetting(var32);
        NumberSetting var34 = (NumberSetting)var33;
        this.V = var34;
        Ry var43 = Ry.RAINBOW;
        zS var35 = new zS(var43, -11559425, -5870593);
        nM var36 = this.bU(var35);
        zS var37 = (zS)var36;
        this.b = var37;
        mN var38 = new mN(256);
        this.Jl = var38;
        this.mp = true;
        this.dy("Light particles kicked out from under your feet when you jump.");
        EventListener<TickEvent> var39 = (TickEvent var1x) -> {
            int var2x = e;
            var2x ^= -871760753;
            int var3x = System.identityHashCode(this);
            Integer var18x = var3x;
            if (var18x != null) {
                var2x += -1746698873;
                var2x ^= 760168214;
                var2x ^= -301161148;
                long var19x = var2x;
                long var5x = var19x + 1L;
                var5x = var19x * var5x;
                long var20x = var5x & 1L;
                long var27x;
                int var21x = (var27x = var20x - 0L) == 0L ? 0 : (var27x < 0L ? -1 : 1);
                if (var21x == 0) {
                    var21x = var2x + 1472515037;
                    var21x *= -473740601;
                    var21x -= -698157826;
                    var21x ^= 2109039801;
                    this.XW(var21x);
                    return;
                }
            } else {
                var2x <<= 20;
                var2x &= -1467924129;
                var2x &= -809767823;
                var2x ^= 111753238;
                Integer var15x = var2x;
                if (var15x != null) {
                    AssertionError var17x = new AssertionError();
                    throw var17x;
                }
            }

            AssertionError var16x = new AssertionError();
            throw var16x;
        };
        this.onEvent(TickEvent.class, var39);
        EventListener<RenderEvent> var40 = (RenderEvent var1x) -> {
            label114: {
                int var49;
                label121: {
                    var49 = e;
                    var49 ^= -682686786;
                    int var3x = System.identityHashCode(this);
                    long var4x = var3x;
                    long var6x = var4x + 1L;
                    var6x = var4x * var6x;
                    var4x = var6x & 1L;
                    long var169;
                    int var83 = (var169 = var4x - 0L) == 0L ? 0 : (var169 < 0L ? -1 : 1);
                    if (var83 == 0) {
                        var49 = switch (var49) {
                            case -228232894 -> var49 ^ 1523690535;
                            default -> var49 ^ 1421980169;
                            case 1580503450 -> {
                                var49 -= -251590647;
                                var49 ^= -408500655;
                                var49 >>= 13;
                                yield var49 ^ -1261216764;
                            }
                        };
                        RenderPhase var84 = var1x.phase();
        Object var5x = RenderPhase.WORLD;
                        if (var84 != var5x) {
                            var49 <<= 21;
                            var49 *= 2078036793;
                            var49 *= -2063910421;
                            var49 -= 610391610;
                            var49 ^= 1696642641;
                            var4x = var49;
                            var6x = var4x + 1L;
                            var6x = var4x * var6x;
                            long var165 = var4x + 2L;
                            var6x *= var165;
                            var4x += 3L;
                            var6x *= var4x;
                            var4x = var6x & 7L;
                            long var175;
                            int var104 = (var175 = var4x - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                            if (var104 == 0) {
                                return;
                            }
                            break label114;
                        }

                        var49 += -1408294863;
                        var49 &= -1024940971;
                        var49 |= 627848621;
                        var49 ^= 1875867831;
                        int var85 = var49 + 1;
                        int var86 = var49 * var85;
                        int var105 = var49 + 2;
                        int var87 = var86 * var105;
                        int var106 = var49 + 3;
                        int var88 = var87 * var106;
                        int var89 = var88 & 7;
                        if (var89 != 0) {
                            break label114;
                        }

                        Entity var90 = i_2.QI();
                        long var107 = var3x;
                        long var7x = var107 + 1L;
                        var7x = var107 * var7x;
                        long var9x = var107 + 2L;
                        var7x *= var9x;
                        long var108 = var107 + 3L;
                        var7x *= var108;
                        long var109 = var7x & 7L;
                        long var170;
                        int var110 = (var170 = var109 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                        if (var110 == 0) {
                            var49 += -2005440829;
                            var49 &= 944018353;
                            var49 >>= 8;
                            var49 ^= -131938203;
                            var49 ^= -1146908938;
                            if (var90 == null) {
                                switch (var49) {
                                    case -1520753318:
                                    default:
                                        var49 ^= 1702080197;
                                        break label121;
                                    case 1133594115:
                                        var49 ^= 932587806;
                                        var49 *= -1868970477;
                                        var49 -= -1395457425;
                                        var49 ^= 2046022246;
                                        break label121;
                                    case 1509216287:
                                        var49 ^= -1248764879;
                                        break label121;
                                }
                            }

                            var49 ^= 1669621970;
                            var49 *= 1786220581;
                            var49 ^= 1268969049;
                            int var111 = var49 + 1;
                            int var112 = var49 * var111;
                            int var128 = var49 + 2;
                            int var113 = var112 * var128;
                            int var129 = var49 + 3;
                            int var114 = var113 * var129;
                            int var115 = var114 & 7;
                            if (var115 != 0) {
                                break label114;
                            }

                            var5x = (RenderPhase)this.d;
                            var6x = var3x;
                            long var8x = var6x + 1L;
                            var8x = var6x * var8x;
                            long var10x = var6x + 2L;
                            var8x *= var10x;
                            var6x += 3L;
                            var8x *= var6x;
                            var6x = var8x & 7L;
                            long var171;
                            int var133 = (var171 = var6x - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                            if (var133 != 0) {
                                switch (var49) {
                                    case -1859208596:
                                        var49 -= -251538075;
                                        var49 -= 1918266785;
                                        var49 *= 1319941519;
                                        var49 ^= 715532107;
                                        break;
                                    case -1248399492:
                                        var49 ^= 1244467090;
                                        break;
                                    case 1396521112:
                                    default:
                                        var49 ^= 1884114629;
                                }
                            } else {
                                label120: {
                                    var49 ^= -185310484;
                                    var49 -= -559972979;
                                    var49 ^= 2070922182;
                                    if (var5x != null) {
                                        var49 >>>= 9;
                                        var49 += -1319743716;
                                        var49 ^= -1967415804;
                                        int var117 = var49 + 1;
                                        int var118 = var49 * var117;
                                        int var134 = var49 + 2;
                                        int var119 = var118 * var134;
                                        int var135 = var49 + 3;
                                        int var120 = var119 * var135;
                                        int var121 = var120 & 7;
                                        if (var121 != 0) {
                                            break label114;
                                        }

                                        var5x = (RenderPhase)this.d;
                                        World var91 = var90.getEntityWorld();
                                        var6x = var3x;
                                        var8x = var6x + 1L;
                                        var8x = var6x * var8x;
                                        var6x = var8x & 1L;
                                        long var172;
                                        int var138 = (var172 = var6x - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                                        if (var138 != 0) {
                                            var49 += 2074994379;
                                            var49 ^= 335816326;
                                            break label120;
                                        }

                                        var49 += 967277992;
                                        var49 ^= -845776367;
                                        var49 ^= -1943019236;
                                        var6x = var49;
                                        var8x = var6x + 1L;
                                        var8x = var6x * var8x;
                                        var6x = var8x & 1L;
                                        long var173;
                                        int var141 = (var173 = var6x - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                                        if (var141 != 0) {
                                            break label114;
                                        }

                                        if (var5x != var91) {
                                            var49 >>>= 14;
                                            var49 ^= -658304949;
                                            var49 ^= -959464914;
                                            break label121;
                                        }

                                        var49 ^= -1158640829;
                                        var49 ^= -1814754021;
                                        var49 >>= 12;
                                        var49 += 1183760174;
                                        var49 ^= -2060859843;
                                    } else {
                                        var49 += 1433620711;
                                        var49 -= -1827319283;
                                        var49 >>= 25;
                                        var49 ^= 805803631;
                                        var49 ^= 205600872;
                                    }

                                    int var92 = var49 + 1;
                                    int var93 = var49 * var92;
                                    int var94 = var93 & 1;
                                    if (var94 != 0) {
                                        break label114;
                                    }

                                    mN var95 = this.Jl;
                                    ModeSetting var123 = this.I;
                                    Enum var124 = var123.A();
                                    ka var125 = (ka)var124;
                                    var95.Vs(var125, 0.8F, true);
                                    mN var96 = this.Jl;
                                    Canvas var126 = var1x.canvas();
                                    ClientRuntime var142 = ClientRuntime.Z();
                                    int var154 = var3x + 1;
                                    int var155 = var3x * var154;
                                    var3x = var155 & 1;
                                    if (var3x == 0) {
                                        var49 -= -164648385;
                                        var49 ^= 1963781670;
                                        var49 &= 1464590173;
                                        var49 ^= -1270152852;
                                        AuraPipeline var79 = var142.Ul();
                                        WorldDraw var80 = var79.world();
                                        FrameContext var143 = var1x.frame();
                                        float var144 = var143.dt();
                                        float var145 = Math.min(var144, 0.1F);
                                        FrameContext var156 = var1x.frame();
                                        double var157 = var156.time();
                                        zS var166 = this.b;
                                        NumberSetting var167 = this.V;
                                        float var168 = var167.WM();
                                        var96.h(var126, var80, var145, var157, var166, var168);
                                        return;
                                    }

                                    var49 -= -473504218;
                                    var49 |= -598165169;
                                    var49 ^= 2095256398;
                                }
                            }
                        } else {
                            var49 &= -945624055;
                            var49 ^= 599499961;
                        }
                    } else {
                        switch (var49) {
                            case -1734454344:
                                var49 ^= 1614417057;
                                break;
                            case 1370032567:
                            default:
                                var49 ^= 1879691734;
                                break;
                            case 1580503450:
                                var49 += -869527908;
                                var49 *= -1580722897;
                                var49 ^= 1980251995;
                        }
                    }

                    long var64 = var49;
                    var4x = var64 + 1L;
                    var4x = var64 * var4x;
                    var6x = var64 + 2L;
                    var4x *= var6x;
                    long var65 = var64 + 3L;
                    var4x *= var65;
                    long var66 = var4x & 7L;
                    long var174;
                    var49 = (var174 = var66 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                    if (var49 == 0) {
                        IllegalStateException var68 = new IllegalStateException();
                        throw var68;
                    }
                    break label114;
                }

                Integer var81 = var49;
                if (var81 != null) {
                    this.J();
                    return;
                }
            }

            UnsupportedOperationException var77 = new UnsupportedOperationException();
            throw var77;
        };
        this.onEvent(RenderEvent.class, var40);
    }

    public void a() {
        int var1 = e;
        var1 ^= -1546920196;
        int var2 = System.identityHashCode(this);
        Entity var3 = i_2.QI();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var71;
        int var51 = (var71 = var4 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
        if (var51 != 0) {
            var1 *= -1718778257;
            var1 -= 912870526;
            var1 -= 1562726737;
            var1 += 2093675535;
            var1 ^= -1136226541;
        } else {
            label56: {
                var1 -= -155308091;
                var1 -= -1906318240;
                var1 &= 2045249185;
                var1 ^= 326295355;
                int var52 = var1 + 1;
                int var53 = var1 * var52;
                int var5 = var1 + 2;
                int var54 = var53 * var5;
                var5 = var1 + 3;
                int var55 = var54 * var5;
                int var56 = var55 & 7;
                label45:
                if (var56 == 0) {
                    if (var3 != null) {
                        var1 = switch (var1) {
                            case -1720375221 -> var1 ^ -1315072106;
                            default -> var1 ^ 1208765451;
                            case 854776730 -> {
                                var1 *= -76084333;
                                yield var1 ^ 607546009;
                            }
                        };
                        int var57 = var1 + 1;
                        int var58 = var1 * var57;
                        int var59 = var58 & 1;
                        if (var59 != 0) {
                            break label45;
                        }

                        double var60 = var3.getY();
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var72;
                        var2 = (var72 = var6 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            var1 -= 1863403431;
                            var1 ^= -1305250901;
                            break label56;
                        }

                        var1 |= -322478542;
                        var1 -= -541193279;
                        var1 ^= -1749669791;
                        var2 = var1 + 1;
                        var2 = var1 * var2;
                        int var67 = var1 + 2;
                        var2 *= var67;
                        int var68 = var1 + 3;
                        var2 *= var68;
                        var2 &= 7;
                        if (var2 != 0) {
                            break label45;
                        }

                        var2 = var1 & -245627404;
                        var2 ^= -1350362679;
                        this.jC(var3, var60, var2);
                        var1 &= 241155916;
                        var1 ^= 528842949;
                        var1 ^= -1733772785;
                    } else {
                        var1 += 833252006;
                        var1 >>= 8;
                        var1 ^= -2125587512;
                    }

                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    int var47 = var1 + 2;
                    var2 *= var47;
                    int var48 = var1 + 3;
                    var2 *= var48;
                    var2 &= 7;
                    if (var2 == 0) {
                        return;
                    }
                }

                UnsupportedOperationException var46 = new UnsupportedOperationException();
                throw var46;
            }
        }

        RuntimeException var32 = new RuntimeException();
        throw var32;
    }

    public int z() {
        int var1 = e;
        var1 ^= 650848815;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 |= 1548171500;
            var1 ^= 1136449091;
            mN var16 = this.Jl;
            return var16.qi();
        } else {
            var1 ^= -137354129;
            var1 += 140022890;
            var1 *= 1960135855;
            var1 ^= -767616876;
            int var14 = var1 + 1;
            var14 = var1 * var14;
            var1 = var14 & 1;
            if (var1 == 0) {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            } else {
                RuntimeException var9 = new RuntimeException();
                throw var9;
            }
        }
    }

    @Override
    protected void J() {
        int var1 = e;
        var1 ^= -248264935;
        int var2 = System.identityHashCode(this);
        mN var3 = this.Jl;
        var3.wW();
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var41;
        var2 = (var41 = var22 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        int var33 = of_2.qA;
        var1 ^= var33;
        var1 ^= -477106862;
        of_2.qA = -477106862;
        int var34 = of_2.jH;
        var1 ^= var34;
        var1 ^= 177107044;
        of_2.jH = 177107044;
        if (var2 != 0) {
            var1 *= -314779397;
            var1 ^= -1824748021;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var6 = var24 + 2L;
            var4 *= var6;
            long var25 = var24 + 3L;
            var4 *= var25;
            long var26 = var4 & 7L;
            long var42;
            var2 = (var42 = var26 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var28 = new IllegalStateException();
                throw var28;
            }
        } else {
            var1 &= 936143123;
            var1 <<= 17;
            var1 ^= 473089259;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var35 = var1 + 2;
            var2 *= var35;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                this.d = null;
                return;
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    private void XW(int var1) {
        label136: {
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var154;
            int var115 = (var154 = var4 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
            if (var115 != 0) {
                switch (var1) {
                    case 343716308:
                        int var15 = var1 * -1868581255;
                        var15 &= 465292150;
                        var15 -= -1158553153;
                        var15 ^= -1162170839;
                        break;
                    case 1451442537:
                        int var14 = var1 ^ 2081892812;
                        break;
                    case 1679955517:
                    default:
                        int var2 = var1 ^ 468315461;
                }
            } else {
                int var19 = var1 & 1886166677;
                var19 |= -1331463806;
                var19 ^= 1309295114;
                Integer var116 = var19;
                if (var116 == null) {
                    break label136;
                }

                Entity var117 = i_2.QI();
                if (var117 == null) {
                    Integer var120 = switch (var19) {
                        case -2092982222 -> var19 ^ -246887322;
                        case -18498660 -> {
                            var19 += -445609473;
                            yield var19 ^ 1444003462;
                        }
                        default -> var19 ^ 502616671;
                    };
                    if (var120 != null) {
                        return;
                    }
                    break label136;
                }
                var19 = switch (var19) {
                    case -2043031580 -> var19 ^ 734693150;
                    case -18498660 -> {
                        var19 |= 913876698;
                        var19 *= -89157673;
                        var19 &= -946679206;
                        yield var19 ^ -1725907000;
                    }
                    default -> var19 ^ -2006323987;
                };
                boolean var5 = var117.isOnGround();
                int var122 = var3 + 1;
                int var123 = var3 * var122;
                int var124 = var123 & 1;
                if (var124 != 0) {
                    switch (var19) {
                        case -1530423947:
                        default:
                            var19 ^= -1349531755;
                            break;
                        case -1140824595:
                            var19 ^= -1883159492;
                            break;
                        case 1529003930:
                            var19 *= -900649237;
                            var19 <<= 16;
                            var19 ^= 2045931868;
                    }
                } else {
                    label129: {
                        var19 += -1596345219;
                        var19 |= -261850302;
                        var19 &= 1246714294;
                        var19 ^= -1937133909;
                        if (var5) {
                            var19 = switch (var19) {
                                case -1355649194 -> var19 ^ -1072962842;
                                case -960104515 -> {
                                    var19 &= 1909771416;
                                    var19 &= -423093142;
                                    var19 &= 1722333027;
                                    var19 &= -2130834869;
                                    yield var19 ^ -1846755980;
                                }
                                default -> var19 ^ 120632224;
                            };
                            int var125 = var19 + 1;
                            int var126 = var19 * var125;
                            int var127 = var126 & 1;
                            if (var127 != 0) {
                                break label136;
                            }

                            double var128 = var117.getY();
                            long var8 = var3;
                            long var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var155;
                            int var136 = (var155 = var8 - 0L) == 0L ? 0 : (var155 < 0L ? -1 : 1);
                            if (var136 != 0) {
                                switch (var19) {
                                    case -1855144588:
                                        var19 -= -684408952;
                                        var19 -= 182800758;
                                        var19 -= -840715817;
                                        var19 ^= -1580811461;
                                        var19 ^= -1224462088;
                                        break label129;
                                    case 1012661154:
                                    default:
                                        var19 ^= -651139535;
                                        break label129;
                                    case 1052998643:
                                        var19 ^= -1101456686;
                                        break label129;
                                }
                            }
                            var19 = switch (var19) {
                                case -1855144588 -> {
                                    var19 |= -855855517;
                                    var19 >>>= 15;
                                    var19 ^= -1422820179;
                                    var19 -= 452819895;
                                    yield var19 ^ 669429399;
                                }
                                default -> var19 ^ -1562178229;
                                case 1678872408 -> var19 ^ -109232602;
                            };
                            this.u = var128;
                            var19 &= 1617023168;
                            var19 ^= -569786391;
                        } else {
                            var19 <<= 20;
                            var19 ^= 1454020304;
                            Integer var129 = var19;
                            if (var129 == null) {
                                break label136;
                            }

                            boolean var130 = this.mp;
                            Integer var7 = var3;
                            if (var7 == null) {
                                switch (var19) {
                                    case -52033450:
                                    default:
                                        var19 ^= 1983446398;
                                        break label129;
                                    case 763008720:
                                        var19 *= -2010684491;
                                        var19 -= -704507611;
                                        var19 |= 1491407190;
                                        var19 += 1830222505;
                                        var19 ^= 514362356;
                                        break label129;
                                    case 1772463261:
                                        var19 ^= -1118076795;
                                        break label129;
                                }
                            }
                            var19 = switch (var19) {
                                case 608583214 -> var19 ^ -243665889;
                                case 763008720 -> {
                                    var19 ^= -2016153768;
                                    var19 ^= -1796486673;
                                    yield var19 ^ 1013801205;
                                }
                                default -> var19 ^ -488365232;
                            };
                            if (var130) {
                                var19 &= -402726252;
                                var19 -= 1962817751;
                                var19 ^= -1208087655;
                                Vec3d var131 = var117.getVelocity();
                                double var132 = var131.y;
                                long var137 = var3;
                                long var145 = var137 + 1L;
                                var145 = var137 * var145;
                                long var12 = var137 + 2L;
                                var145 *= var12;
                                var137 += 3L;
                                var145 *= var137;
                                var137 = var145 & 7L;
                                long var156;
                                int var140 = (var156 = var137 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                                if (var140 != 0) {
                                    var19 -= 800984387;
                                    var19 &= 1988470673;
                                    var19 ^= -173254707;
                                    break label129;
                                }

                                var19 *= -728332591;
                                var19 ^= -1630461565;
                                var19 >>>= 14;
                                var19 *= 482462981;
                                var19 ^= -629651494;
                                double var157;
                                int var133 = (var157 = var132 - 0.2) == 0.0 ? 0 : (var157 < 0.0 ? -1 : 1);
                                if (var133 > 0) {
                                    var19 &= -1240327529;
                                    var19 *= 410555909;
                                    var19 += -292642295;
                                    var19 *= 1631070295;
                                    var19 ^= -1807503479;
                                    double var134 = this.u;
                                    Integer var102 = var3;
                                    if (var102 == null) {
                                        var19 += 1864224844;
                                        var19 ^= -1902883846;
                                        var19 ^= -61419636;
                                        var19 ^= -1813689902;
                                        break label129;
                                    }
                                    var19 = switch (var19) {
                                        case -1527629442 -> var19 ^ 615707862;
                                        case -1485968212 -> {
                                            var19 *= 637040825;
                                            var19 ^= 2031177407;
                                            var19 *= 2030243619;
                                            yield var19 ^ -2090239987;
                                        }
                                        default -> var19 ^ -986393945;
                                    };
                                    var137 = var19;
                                    var145 = var137 + 1L;
                                    var145 = var137 * var145;
                                    var12 = var137 + 2L;
                                    var145 *= var12;
                                    var137 += 3L;
                                    var145 *= var137;
                                    var137 = var145 & 7L;
                                    long var158;
                                    int var103 = (var158 = var137 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                                    if (var103 != 0) {
                                        break label136;
                                    }

                                    var103 = var19 + -263496919;
                                    var103 -= 873079858;
                                    var103 ^= 215008508;
                                    var103 &= 352340365;
                                    var103 ^= 780604440;
                                    this.jC(var117, var134, var103);
                                    var19 &= -738377359;
                                    var19 ^= 1827700697;
                                } else {
                                    var19 <<= 27;
                                    var19 <<= 31;
                                    var19 *= -2112217317;
                                    var19 ^= -28803095;
                                }
                            } else {
                                var19 += -1726434507;
                                var19 -= 1360119400;
                                var19 *= -1995412049;
                                var19 |= 349945700;
                                var19 ^= 1219985436;
                            }
                        }

                        var3 = var19 + 1;
                        var3 = var19 * var3;
                        int var118 = var19 + 2;
                        var3 *= var118;
                        int var119 = var19 + 3;
                        var3 *= var119;
                        var3 &= 7;
                        if (var3 == 0) {
                            this.mp = var5;
                            return;
                        }
                        break label136;
                    }
                }
            }

            IllegalStateException var98 = new IllegalStateException();
            throw var98;
        }

        IllegalStateException var101 = new IllegalStateException();
        throw var101;
    }

    private void jC(Entity var1, double var2, int var4) {
        label232: {
            int var6 = System.identityHashCode(this);
        Object var7 = (ThreadLocalRandom)this.d;
            Integer var8 = var6;
            if (var8 == null) {
                int var145 = var4 >> 22;
                var145 &= 140638471;
                var145 *= 1489348925;
                var145 <<= 27;
                var145 ^= -1924850699;
            } else {
                label230: {
                    int var5 = var4 & 1126277070;
                    var5 += 48922956;
                    var5 |= -1554297468;
                    var5 ^= -2014821160;
                    int var162 = var5 + 1;
                    var162 = var5 * var162;
                    var162 &= 1;
                    if (var162 != 0) {
                        break label232;
                    }

                    if (var7 != null) {
                        var5 <<= 4;
                        var5 ^= -603860363;
                        var7 = var5;
                        if (var7 == null) {
                            break label232;
                        }

                        var7 = this.d;
                        long var165 = var6;
                        long var10 = var165 + 1L;
                        var10 = var165 * var10;
                        long var12 = var165 + 2L;
                        var10 *= var12;
                        long var166 = var165 + 3L;
                        var10 *= var166;
                        long var167 = var10 & 7L;
                        long var301;
                        var162 = (var301 = var167 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                        if (var162 != 0) {
                            switch (var5) {
                                case -1683769564:
                                    var5 ^= 72969393;
                                    break label230;
                                case -1044213529:
                                default:
                                    var5 ^= 809107254;
                                    break label230;
                                case -583507403:
                                    var5 += -1480063107;
                                    var5 >>>= 23;
                                    var5 += -268244531;
                                    var5 |= -499277142;
                                    var5 ^= -1350897398;
                                    break label230;
                            }
                        }

                        var5 |= 464654202;
                        var5 |= -1700163268;
                        var5 ^= -943963185;
                        var162 = var5 + 1;
                        var162 = var5 * var162;
                        int var9 = var5 + 2;
                        var162 *= var9;
                        var9 = var5 + 3;
                        var162 *= var9;
                        var162 &= 7;
                        if (var162 != 0) {
                            break label232;
                        }

                        World var174 = var1.getEntityWorld();
                        if ((Object)var7 != var174) {
                            var5 = switch (var5) {
                                default -> var5 ^ -786381526;
                                case -838993235 -> var5 ^ 61976019;
                                case 403160240 -> {
                                    var5 &= 701545332;
                                    var5 *= 237505049;
                                    var5 ^= 1999814556;
                                    yield var5 ^ 1640313468;
                                }
                            };
                            int var153 = var5 + 1;
                            int var154 = var5 * var153;
                            var162 = var5 + 2;
                            int var155 = var154 * var162;
                            var162 = var5 + 3;
                            int var156 = var155 * var162;
                            int var157 = var156 & 7;
                            if (var157 != 0) {
                                break label232;
                            }

                            this.J();
                            var5 -= 924946208;
                            var5 |= 612960001;
                            var5 ^= -1253583501;
                            var5 ^= -1206429483;
                            var5 ^= -1572662216;
                        } else {
                            var5 >>= 10;
                            var5 &= 470684139;
                            var5 += -1248558419;
                            var5 ^= -149759433;
                        }
                    } else {
                        var5 &= 1981870616;
                        var5 <<= 20;
                        var5 &= -1312094715;
                        var5 += 1413963471;
                        var5 ^= 919535712;
                    }

                    var7 = var5;
                    if (var7 == null) {
                        break label232;
                    }

                    var7 = var1.getEntityWorld();
                    this.d = var7;
                    var7 = ThreadLocalRandom.current();
                    var7 = (ThreadLocalRandom)var7;
                    NumberSetting var177 = this.f;
                    float var178 = var177.WM();
                    float var179 = 2.0F * var178;
                    float var180 = var179;
                    NumberSetting var182 = this.eS;
                    float var183 = var182.WM();
                    float var184 = 0.06F * var183;
                    float var185 = var184;
                    ModeSetting var189 = this.CD;
                    int var11 = var6 + 1;
                    var11 = var6 * var11;
                    int var213 = var6 + 2;
                    var11 *= var213;
                    var213 = var6 + 3;
                    var11 *= var213;
                    var11 &= 7;
                    if (var11 != 0) {
                        var5 ^= -2145086311;
                        var5 >>= 13;
                        var5 |= 896277860;
                        var5 ^= -1564801389;
                    } else {
                        label231: {
                            var5 &= -1140513399;
                            var5 ^= -366795730;
                            Integer var202 = var5;
                            if (var202 == null) {
                                break label232;
                            }

                            gm_3 var203 = gm_3.HOP;
                            boolean var190 = var189.TJ(var203);
                            bA_2 var196;
                            if (var190) {
                                var5 = switch (var5) {
                                    case -366796633 -> {
                                        var5 &= 1012290732;
                                        var5 += -904586054;
                                        yield var5 ^ -1578946265;
                                    }
                                    default -> var5 ^ -315345621;
                                    case 2098277896 -> var5 ^ 1731332768;
                                };
                                long var191 = var5;
                                long var215 = var191 + 1L;
                                long var216 = var191 * var215;
                                long var14 = var191 + 2L;
                                long var217 = var216 * var14;
                                long var192 = var191 + 3L;
                                long var218 = var217 * var192;
                                long var193 = var218 & 7L;
                                long var302;
                                int var194 = (var302 = var193 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                                if (var194 != 0) {
                                    break label232;
                                }

                                bA_2 var195 = bA_2.HOP;
                                var202 = var6;
                                if (var202 == null) {
                                    var5 &= 1101710835;
                                    var5 >>= 13;
                                    var5 ^= 1564940021;
                                    break label231;
                                }

                                var5 &= 1253119100;
                                var5 *= 375788709;
                                var5 >>>= 17;
                                var5 |= 1731812025;
                                var5 ^= 624076599;
                                long var205 = var5;
                                long var13 = var205 + 1L;
                                var13 = var205 * var13;
                                long var15 = var205 + 2L;
                                var13 *= var15;
                                long var206 = var205 + 3L;
                                var13 *= var206;
                                long var207 = var13 & 7L;
                                long var303;
                                int var208 = (var303 = var207 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                                if (var208 != 0) {
                                    break label232;
                                }

                                var196 = var195;
                                var5 >>>= 26;
                                var5 ^= -1274986722;
                            } else {
                                var5 >>= 23;
                                var5 *= 377191651;
                                var5 &= -941047512;
                                var5 *= 1049149807;
                                var5 ^= 1592422670;
                                bA_2 var209 = bA_2.GLIDE;
                                Integer var219 = var6;
                                if (var219 == null) {
                                    var5 |= -1172737201;
                                    var5 &= -1613640538;
                                    var5 |= 1464115140;
                                    var5 &= 1832808880;
                                    var5 ^= 273762933;
                                    break label231;
                                }

                                var5 ^= -1937490717;
                                var5 ^= -1120253623;
                                long var220 = var5;
                                long var246 = var220 + 1L;
                                var246 = var220 * var246;
                                long var16 = var220 + 2L;
                                var246 *= var16;
                                long var221 = var220 + 3L;
                                var246 *= var221;
                                long var222 = var246 & 7L;
                                long var304;
                                int var223 = (var304 = var222 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                                if (var223 != 0) {
                                    break label232;
                                }

                                var196 = var209;
                                var5 += 1893231367;
                                var5 *= 564144379;
                                var5 ^= -584084737;
                            }

                            var202 = var5;
                            if (var202 == null) {
                                break label232;
                            }

                            bA_2 var197 = var196;
                            byte var211 = 0;
                            NumberSetting var224 = this.Gy;
                            int var230 = var6 + 1;
                            var230 = var6 * var230;
                            int var250 = var6 + 2;
                            var230 *= var250;
                            var250 = var6 + 3;
                            var230 *= var250;
                            var230 &= 7;
                            if (var230 == 0) {
                                var5 = switch (var5) {
                                    case -1274986738 -> {
                                        var5 += 1050329550;
                                        yield var5 ^ 1463215724;
                                    }
                                    default -> var5 ^ 1669632765;
                                    case 2107169963 -> var5 ^ 141377209;
                                };
                                Integer var235 = var5;
                                if (var235 == null) {
                                    break label232;
                                }

                                var213 = var224.B();
                                var213 = var213;
                                int var212 = var211;
                                var5 += -803330675;
                                var5 ^= -213076713;

                                label196:
                                while (true) {
                                    int var236 = var5 + 1;
                                    var236 = var5 * var236;
                                    var250 = var5 + 2;
                                    var236 *= var250;
                                    var250 = var5 + 3;
                                    var236 *= var250;
                                    var236 &= 7;
                                    if (var236 != 0) {
                                        break label232;
                                    }

                                    if (var212 >= var213) {
                                        switch (var5) {
                                            case -2038056662:
                                                var5 += 583544719;
                                                var5 ^= 2012668944;
                                                break;
                                            case -1165232858:
                                            default:
                                                var5 ^= 2062808459;
                                                break;
                                            case 1300334160:
                                                var5 ^= 802417761;
                                        }

                                        return;
                                    }
                                    var5 = switch (var5) {
                                        case -2038056662 -> {
                                            var5 += -1759631939;
                                            var5 += -1695450868;
                                            var5 -= 376121473;
                                            yield var5 ^ -585482572;
                                        }
                                        default -> var5 ^ -502231931;
                                        case -420905309 -> var5 ^ -1212356430;
                                    };
                                    Integer var241 = var5;
                                    if (var241 == null) {
                                        break label232;
                                    }

                    double var242 = ((ThreadLocalRandom)var7).nextDouble(0.8, 1.2);
                                    float var243 = (float)var242;
                                    float var244 = var185 * var243;
                                    mN var254 = this.Jl;
                                    double var259 = var1.getX();
                                    double var17 = var244;
                                    var17 = var2 + var17;
                                    var17 += 0.01;
                                    double var19 = var1.getZ();
                                    long var21 = var6;
                                    long var23 = var21 + 1L;
                                    var23 = var21 * var23;
                                    long var25 = var21 + 2L;
                                    var23 *= var25;
                                    var21 += 3L;
                                    var23 *= var21;
                                    var21 = var23 & 7L;
                                    long var305;
                                    int var264 = (var305 = var21 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                                    if (var264 != 0) {
                                        var5 *= 746856397;
                                        var5 |= 1030875606;
                                        var5 ^= -1598495189;
                                        break;
                                    }

                                    var5 ^= 293449802;
                                    var5 &= 298313445;
                                    var5 |= 44749877;
                                    var5 *= -93045479;
                                    var5 ^= 1420669476;
                                    var21 = var5;
                                    var23 = var21 + 1L;
                                    var23 = var21 * var23;
                                    var25 = var21 + 2L;
                                    var23 *= var25;
                                    var21 += 3L;
                                    var23 *= var21;
                                    var21 = var23 & 7L;
                                    long var306;
                                    int var268 = (var306 = var21 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                                    if (var268 != 0) {
                                        break label232;
                                    }

                                    float var269 = -var180;
                                    double var270 = var269;
                                    double var283 = var180;
                    double var271 = ((ThreadLocalRandom)var7).nextDouble(var270, var283);
                                    float var272 = (float)var271;
                                    float var22 = -var180;
                                    double var273 = var22;
                                    double var24 = var180;
                    double var274 = ((ThreadLocalRandom)var7).nextDouble(var273, var24);
                                    var22 = (float)var274;
                                    NumberSetting var284 = this.Ve;
                                    float var285 = var284.WM();
                    var24 = ((ThreadLocalRandom)var7).nextDouble((float) (Math.PI * 2));
                                    float var287 = (float)var24;
                    double var289 = ((ThreadLocalRandom)var7).nextDouble(0.17, 1.05);
                    int var27 = ((ThreadLocalRandom)var7).nextBoolean() ? 1 : 0;
                                    if (var27 != 0) {
                                        var5 *= -1821468921;
                                        var5 ^= -2027004390;
                                        var5 |= -1521556358;
                                        var5 |= -1102968523;
                                        var5 ^= 2081511790;
                                        var27 = var5 + 1;
                                        var27 = var5 * var27;
                                        var27 &= 1;
                                        if (var27 != 0) {
                                            break label232;
                                        }

                                        var27 = (byte)1;
                                        switch (var5) {
                                            case -2090879855:
                                                var5 ^= -2118377517;
                                                var5 ^= -1653792649;
                                                break;
                                            case -864803979:
                                                var5 ^= 255657478;
                                                break;
                                            case 1746910103:
                                            default:
                                                var5 ^= 30630370;
                                        }
                                    } else {
                                        var5 = switch (var5) {
                                            default -> var5 ^ 2083719761;
                                            case 1315943561 -> {
                                                var5 *= 954009295;
                                                var5 >>= 8;
                                                var5 ^= 1485752306;
                                                yield var5 ^ -1086207715;
                                            }
                                            case 1973299264 -> var5 ^ 682309065;
                                        };
                                        int var28 = var5 + 1;
                                        var28 = var5 * var28;
                                        var28 &= 1;
                                        if (var28 != 0) {
                                            break label232;
                                        }

                                        var27 = (byte)-1;
                                        switch (var5) {
                                            case -271185891:
                                                var5 ^= -2047947848;
                                                break;
                                            case 403955167:
                                                var5 |= -415690868;
                                                var5 ^= 1622496490;
                                                break;
                                            case 1531230316:
                                            default:
                                                var5 ^= 1331416175;
                                        }
                                    }

                                    double var297 = var27;
                                    double var290 = var289 * var297;
                                    float var291 = (float)var290;
                                    RZ var26 = this.kA;
                    SpriteShape var292 = var26.xZ((java.util.random.RandomGenerator)var7);
                    float var298 = ((ThreadLocalRandom)var7).nextFloat();
                                    var254.q(var259, var17, var19, var272, 0.0F, var22, var285, var244, var287, var291, var292, var197, var298);
                                    int var245 = var212 + 1;
                                    var250 = var6 + 1;
                                    var250 = var6 * var250;
                                    var250 &= 1;
                                    if (var250 != 0) {
                                        switch (var5) {
                                            case -1618048203:
                                                var5 ^= 1316738880;
                                                var5 *= -435220313;
                                                var5 |= 64887765;
                                                var5 ^= -1967480798;
                                                break label196;
                                            case -1541429797:
                                            default:
                                                var5 ^= 1353414355;
                                                break label196;
                                            case 1207968730:
                                                var5 ^= -539213590;
                                                break label196;
                                        }
                                    }
                                    var5 = switch (var5) {
                                        case -1751956618 -> var5 ^ -1143962301;
                                        case -1618048203 -> {
                                            var5 *= -1513833423;
                                            var5 >>>= 25;
                                            var5 *= 545332901;
                                            var5 *= -1340716681;
                                            yield var5 ^ 605961931;
                                        }
                                        default -> var5 ^ 1268384509;
                                    };
                                    Integer var258 = var5;
                                    if (var258 == null) {
                                        break label232;
                                    }

                                    var212 = var245;
                                    var5 |= 1688004750;
                                    var5 ^= 2054901988;
                                }
                            } else {
                                switch (var5) {
                                    case -1274986738:
                                        var5 -= -1784571659;
                                        var5 &= 901573307;
                                        var5 *= 1744801171;
                                        var5 += -479260146;
                                        var5 ^= -431230820;
                                        break;
                                    case -893095120:
                                        var5 ^= -465646598;
                                        break;
                                    case -753655159:
                                    default:
                                        var5 ^= 2085852422;
                                }
                            }
                        }
                    }
                }
            }

            UnsupportedOperationException var150 = new UnsupportedOperationException();
            throw var150;
        }

        UnsupportedOperationException var144 = new UnsupportedOperationException();
        throw var144;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1378644192;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        e = var4;
    }
}
