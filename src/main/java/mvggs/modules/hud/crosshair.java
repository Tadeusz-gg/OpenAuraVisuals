package mvggs.modules.hud;

import mvggs.modules.combat.deatheffect;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public final class crosshair extends Module {
    private static final kP_2[] se;
    private final ModeSetting oL;
    private final ActionSetting a;
    private final ColorSetting bC;
    private final ColorSetting B;
    private final NumberSetting T;
    private final NumberSetting Cj;
    private final NumberSetting t;
    private final NumberSetting dJ;
    private final BooleanSetting XD;
    public final NumberSetting pixel;
    private final NumberSetting Z;
    private final BooleanSetting C;
    private final ColorSetting o;
    private final NumberSetting Ob;
    private final NumberSetting ED;
    private final BooleanSetting R;
    private final ModeSetting u;
    private final NumberSetting vP;
    private final BooleanSetting P;
    private final ColorSetting pW;
    private final ModeSetting Ek;
    private final P jo;
    private final P Y;
    private final P eB;
    private final NumberSetting i;
    private final ModeSetting y;
    private final NumberSetting Co;
    private final vw_2 SJ;
    private final VA SS;
    private final XF oW;
    private final XF kr;
    private final XF K;
    private float E;
    private int lJ;
    private P FS;
    private float r;
    private static final TextStyle wz;
    private final VA fg;
    public static final int cm;

    public crosshair() {
        super("crosshair", "Crosshair", ModuleCategory.HUD);
        ModuleCategory var1 = ModuleCategory.HUD;

        kP_2 var2 = kP_2.CLASSIC;
        ModeSetting var5 = new ModeSetting("style", "Style", var2);
        kP_2[] var129 = kP_2.A();
        ModeSetting var6 = var5.FP(var129);
        Setting var7 = this.addSetting(var6);
        ModeSetting var8 = (ModeSetting)var7;
        this.oL = var8;
        String[] var130 = new String[]{"....#....", "....#....", ".........", "##..+..##", ".........", "....#....", "....#...."};
        du var131 = du.z(var130);
        ActionSetting var9 = new ActionSetting("drawing", "Drawing", var131);
        Setting var10 = this.addSetting(var9);
        ActionSetting var11 = (ActionSetting)var10;
        this.a = var11;
        ColorSetting var12 = new ColorSetting("color", "Color", -1);
        Setting var13 = this.addSetting(var12);
        ColorSetting var14 = (ColorSetting)var13;
        this.bC = var14;
        ColorSetting var15 = new ColorSetting("accent", "Accent", -11559425);
        Setting var16 = this.addSetting(var15);
        ColorSetting var17 = (ColorSetting)var16;
        this.B = var17;
        NumberSetting var18 = new NumberSetting("scale", "Scale", 1.0F, 0.5F, 3.0F);
        NumberSetting var19 = var18.W(0.05F);
        Setting var20 = this.addSetting(var19);
        NumberSetting var21 = (NumberSetting)var20;
        this.T = var21;
        NumberSetting var22 = new NumberSetting("length", "Length", 4.0F, 0.5F, 12.0F);
        NumberSetting var23 = var22.W(0.5F);
        Setting var24 = this.addSetting(var23);
        NumberSetting var25 = (NumberSetting)var24;
        this.Cj = var25;
        NumberSetting var26 = new NumberSetting("gap", "Gap", 2.0F, 0.0F, 10.0F);
        NumberSetting var27 = var26.W(0.5F);
        Setting var28 = this.addSetting(var27);
        NumberSetting var29 = (NumberSetting)var28;
        this.t = var29;
        NumberSetting var30 = new NumberSetting("thickness", "Thickness", 1.0F, 0.5F, 4.0F);
        NumberSetting var31 = var30.W(0.25F);
        Setting var32 = this.addSetting(var31);
        NumberSetting var33 = (NumberSetting)var32;
        this.dJ = var33;
        BooleanSetting var34 = new BooleanSetting("dot", "Center Dot", false);
        Setting var35 = this.addSetting(var34);
        BooleanSetting var36 = (BooleanSetting)var35;
        this.XD = var36;
        NumberSetting var37 = new NumberSetting("pixel_size", "Pixel Size", 1.0F, 0.25F, 3.0F);
        NumberSetting var38 = var37.W(0.25F);
        Setting var39 = this.addSetting(var38);
        NumberSetting var40 = (NumberSetting)var39;
        this.pixel = var40;
        NumberSetting var41 = new NumberSetting("speed", "Animation Speed", 1.0F, 0.25F, 3.0F);
        NumberSetting var42 = var41.W(0.05F);
        Setting var43 = this.addSetting(var42);
        NumberSetting var44 = (NumberSetting)var43;
        this.Z = var44;
        BooleanSetting var45 = new BooleanSetting("outline", "Outline", true);
        Setting var46 = this.addSetting(var45);
        BooleanSetting var47 = (BooleanSetting)var46;
        this.C = var47;
        ColorSetting var48 = new ColorSetting("outline_color", "Outline Color", -1342177280);
        Setting var49 = this.addSetting(var48);
        ColorSetting var50 = (ColorSetting)var49;
        this.o = var50;
        NumberSetting var51 = new NumberSetting("outline_width", "Outline Width", 0.5F, 0.25F, 2.0F);
        NumberSetting var52 = var51.W(0.25F);
        Setting var53 = this.addSetting(var52);
        NumberSetting var54 = (NumberSetting)var53;
        this.Ob = var54;
        NumberSetting var55 = new NumberSetting("glow", "Glow", 0.0F, 0.0F, 1.0F);
        NumberSetting var56 = var55.W(0.05F);
        Setting var57 = this.addSetting(var56);
        NumberSetting var58 = (NumberSetting)var57;
        this.ED = var58;
        BooleanSetting var59 = new BooleanSetting("rounded", "Rounded", false);
        Setting var60 = this.addSetting(var59);
        BooleanSetting var61 = (BooleanSetting)var60;
        this.R = var61;
        Ek var132 = dev.aurap.hub.Ek.OFF;
        ModeSetting var62 = new ModeSetting("spread", "Dynamic Gap", var132);
        Setting var63 = this.addSetting(var62);
        ModeSetting var64 = (ModeSetting)var63;
        this.u = var64;
        NumberSetting var65 = new NumberSetting("spread_amount", "Gap Amount", 3.0F, 0.5F, 8.0F);
        NumberSetting var66 = var65.W(0.5F);
        Setting var67 = this.addSetting(var66);
        NumberSetting var68 = (NumberSetting)var67;
        this.vP = var68;
        BooleanSetting var69 = new BooleanSetting("enemy", "Enemy Color", false);
        Setting var70 = this.addSetting(var69);
        BooleanSetting var71 = (BooleanSetting)var70;
        this.P = var71;
        ColorSetting var72 = new ColorSetting("enemy_color", "Enemy", -42406);
        Setting var73 = this.addSetting(var72);
        ColorSetting var74 = (ColorSetting)var73;
        this.pW = var74;
        v_2 var133 = v_2.BAR;
        ModeSetting var75 = new ModeSetting("indicator", "Cooldown", var133);
        Setting var76 = this.addSetting(var75);
        ModeSetting var77 = (ModeSetting)var76;
        this.Ek = var77;
        var2 = kP_2.DIAGONAL;
        String[] var3 = new String[]{"##.....##", "###...###", ".##...##.", ".........", "....+....", ".........", ".##...##.", "###...###", "##.....##"};
        du var163 = du.z(var3);
        P var78 = new P(this, "hit", "Hit", 1, var2, -41892, var163);
        this.jo = var78;
        var2 = kP_2.BURST;
        var3 = new String[]{
            ".....+.....",
            ".....#.....",
            "..+..#..+..",
            "...#...#...",
            "...........",
            "+##..+..##+",
            "...........",
            "...#...#...",
            "..+..#..+..",
            ".....#.....",
            ".....+....."
        };
        du var165 = du.z(var3);
        P var79 = new P(this, "crit", "Crit", 2, var2, -14003, var165);
        this.Y = var79;
        var2 = kP_2.KILL_X;
        var3 = new String[]{
            "..#######..",
            ".#########.",
            "###########",
            "##..###..##",
            "##..###..##",
            "###########",
            ".####.####.",
            "..#######..",
            "..#.#.#.#..",
            "..#######.."
        };
        du var167 = du.z(var3);
        P var80 = new P(this, "kill", "Kill", 3, var2, -50354, var167);
        this.eB = var80;
        NumberSetting var81 = new NumberSetting("swap_time", "Swap Time", 300.0F, 80.0F, 1000.0F);
        NumberSetting var82 = var81.W(10.0F);
        NumberSetting var83 = var82.L(" ms");
        Setting var84 = this.addSetting(var83);
        NumberSetting var85 = (NumberSetting)var84;
        this.i = var85;
        u_2 var137 = u_2.POP;
        ModeSetting var86 = new ModeSetting("transition", "Transition", var137);
        Setting var87 = this.addSetting(var86);
        ModeSetting var88 = (ModeSetting)var87;
        this.y = var88;
        NumberSetting var89 = new NumberSetting("kick", "Hit Kick", 1.5F, 0.0F, 6.0F);
        NumberSetting var90 = var89.W(0.25F);
        Setting var91 = this.addSetting(var90);
        NumberSetting var92 = (NumberSetting)var91;
        this.Co = var92;
        vw_2 var93 = new vw_2();
        this.SJ = var93;
        VA var94 = new VA();
        this.SS = var94;
        kE_2 var138 = kE_2.SMOOTH;
        XF var95 = new XF(0.0F, var138);
        this.oW = var95;
        kE_2 var139 = kE_2.SMOOTH;
        XF var96 = new XF(0.0F, var139);
        this.kr = var96;
        kE_2 var140 = kE_2.SMOOTH;
        XF var97 = new XF(0.0F, var140);
        this.K = var97;
        this.r = Float.MAX_VALUE;
        VA var98 = new VA();
        this.fg = var98;
        this.dy("Your own crosshair: presets, animated presets or one you draw, and a different one for a moment after hits and crits.");
        ActionSetting var99 = this.a;
        BooleanSupplier var141 = () -> {
            int var1x = cm;
            var1x ^= -952706480;
            int var2x = System.identityHashCode(this);
            ModeSetting var3x = this.oL;
            kP_2 var4x = kP_2.DRAWN;
            long var5x = var2x;
            long var7x = var5x + 1L;
            var7x = var5x * var7x;
            long var9x = var5x + 2L;
            var7x *= var9x;
            var5x += 3L;
            var7x *= var5x;
            var5x = var7x & 7L;
            long var34x;
            var2x = (var34x = var5x - 0L) == 0L ? 0 : (var34x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x += -1048501411;
                var1x |= 1414014800;
                var1x ^= 36186722;
                var1x ^= -78851515;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    return var3x.TJ(var4x);
                }
            } else {
                var1x &= 246373761;
                var1x ^= -2038946636;
                long var18x = var1x;
                long var27x = var18x + 1L;
                long var28x = var18x * var27x;
                long var19x = var28x & 1L;
                long var35x;
                var1x = (var35x = var19x - 0L) == 0L ? 0 : (var35x < 0L ? -1 : 1);
                if (var1x == 0) {
                    UnsupportedOperationException var22x = new UnsupportedOperationException();
                    throw var22x;
                }
            }

            IllegalArgumentException var21x = new IllegalArgumentException();
            throw var21x;
        };
        Setting var100 = var99.Pt(var141);
        Setting var101 = var100.q("Left click paints, right click erases.");
        ActionSetting var102 = this.a;
        Consumer var142 = var1x -> {
            int var2x = cm;
            var2x ^= -458216688;
            int var3x = System.identityHashCode(this);
            NumberSetting var4x = this.pixel;
            int var5x = var3x + 1;
            var5x = var3x * var5x;
            var3x = var5x & 1;
            if (var3x != 0) {
                var2x = switch (var2x) {
                    case -1884685987 -> var2x ^ -1402977116;
                    default -> var2x ^ 860650962;
                    case 328033169 -> {
                        var2x += 1694133325;
                        var2x <<= 23;
                        yield var2x ^ -42266676;
                    }
                };
                var3x = var2x + 1;
                var3x = var2x * var3x;
                var5x = var2x + 2;
                var3x *= var5x;
                var5x = var2x + 3;
                var3x *= var5x;
                var3x &= 7;
                if (var3x == 0) {
                    RuntimeException var26x = new RuntimeException();
                    throw var26x;
                }
            } else {
                var2x -= 280025105;
                var2x ^= -2135773713;
                long var32x = var2x;
                long var7x = var32x + 1L;
                var7x = var32x * var7x;
                long var33x = var7x & 1L;
                long var35x;
                var3x = (var35x = var33x - 0L) == 0L ? 0 : (var35x < 0L ? -1 : 1);
                if (var3x == 0) {
                    float var28x = var4x.WM();
                    var2x >>= 2;
                    var2x -= -1205830592;
                    var2x ^= 1105120908;
                    var2x ^= -1092141427;
                    this.stampNext((du)var1x, var28x, var2x);
                    return;
                }
            }

            AssertionError var15x = new AssertionError();
            throw var15x;
        };
        ActionSetting var103 = var102.tZ(var142);
        ColorSetting var143 = this.bC;
        // removed dead duplicate capture (var3 unused later): var3 = Objects.requireNonNull(var143);
        IntSupplier var144 = var143::zz;
        ColorSetting var169 = this.B;
        Object var4 = Objects.requireNonNull(var169);
        IntSupplier var170 = var169::zz;
        ActionSetting var104 = var103.Z(var144, var170);
        BooleanSupplier var105 = () -> {
            int var1x = cm;
            var1x ^= -1141196767;
            int var2x = System.identityHashCode(this);
            ModeSetting var3x = this.oL;
            kP_2 var4x = kP_2.DRAWN;
            boolean var33x = var3x.TJ(var4x);
            Integer var28x = var2x;
            label49:
            if (var28x != null) {
                var1x = switch (var1x) {
                    case -157933943 -> var1x ^ 781354875;
                    default -> var1x ^ 1499267614;
                    case 1288171680 -> {
                        var1x >>= 12;
                        yield var1x ^ 191732654;
                    }
                };
                int var32x = 0;
                  if (!var33x) {
                    var1x += 1137758594;
                    var1x |= 773408558;
                    var1x ^= 1583594099;
                    int var29x = var1x + 1;
                    var29x = var1x * var29x;
                    var29x &= 1;
                    if (var29x != 0) {
                        break label49;
                    }

                    var32x = 1;
                    switch (var1x) {
                        case -1260951031:
                            var1x ^= -716511798;
                            break;
                        case -566058037:
                        default:
                            var1x ^= -1814197835;
                            break;
                        case 827905292:
                            var1x -= -1872896698;
                            var1x += 356966886;
                            var1x |= -1208914651;
                            var1x &= -1685837421;
                            var1x ^= -1375930528;
                    }
                } else {
                    var1x = switch (var1x) {
                        default -> var1x ^ 1271962018;
                        case 191453137 -> {
                            var1x += -1689004080;
                            yield var1x ^ -2114641130;
                        }
                        case 397295602 -> var1x ^ 248951152;
                    };
                    Integer var34x = var1x;
                    if (var34x == null) {
                        break label49;
                    }

                    var32x = 0;
                    var1x >>= 9;
                    var1x |= -786198684;
                    var1x &= -2144295839;
                    var1x += 1067485096;
                    var1x ^= -2119306519;
                }

                Integer var35x = var1x;
                if (var35x != null) {
                      return var32x != 0;
                }
            } else {
                var1x |= -1870227984;
                var1x &= 1001327;
                var1x ^= 1966033757;
                Integer var25x = var1x;
                if (var25x != null) {
                    RuntimeException var27x = new RuntimeException();
                    throw var27x;
                }
            }

            RuntimeException var26x = new RuntimeException();
            throw var26x;
        };
        NumberSetting var145 = this.Cj;
        Setting var146 = var145.Pt(var105);
        NumberSetting var147 = this.t;
        Setting var148 = var147.Pt(var105);
        NumberSetting var149 = this.dJ;
        Setting var106 = var149.Pt(var105);
        BooleanSetting var107 = this.XD;
        BooleanSupplier var150 = () -> {
            boolean var54x;
            int var1x = cm;
            var1x ^= 1635402816;
            int var2x = System.identityHashCode(this);
            int[] var3x = z_2.x;
            ModeSetting var4x = this.oL;
            Enum var59x = var4x.A();
            kP_2 var60x = (kP_2)var59x;
            int var5x = var2x + 1;
            var5x = var2x * var5x;
            var2x = var5x & 1;
            if (var2x != 0) {
                var1x &= 197312701;
                var1x ^= -1127623898;
                var1x >>= 20;
                var1x >>= 7;
                var1x ^= 228297275;
                long var63x = var1x;
                long var7x = var63x + 1L;
                var7x = var63x * var7x;
                long var64x = var7x & 1L;
                long var68x;
                var2x = (var68x = var64x - 0L) == 0L ? 0 : (var68x < 0L ? -1 : 1);
                if (var2x == 0) {
                    UnsupportedOperationException var46x = new UnsupportedOperationException();
                    throw var46x;
                }
            } else {
                var1x = switch (var1x) {
                    case -1773728575 -> {
                        var1x -= 1499367471;
                        var1x ^= 1543457159;
                        var1x += 1109450447;
                        var1x -= 574110432;
                        yield var1x ^ -1008722262;
                    }
                    default -> var1x ^ -94819225;
                    case 1198394328 -> var1x ^ -991847094;
                };
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var5x = var1x + 2;
                var2x *= var5x;
                var5x = var1x + 3;
                var2x *= var5x;
                var2x &= 7;
                if (var2x == 0) {
                    label65: {
                        var2x = var60x.ordinal();
                        var2x = var3x[var2x];
                        label64:
                        switch (var2x) {
                            case 1:
                                switch (var1x) {
                                    case -1646976769:
                                        var1x ^= 2027249464;
                                        break label64;
                                    case -387671156:
                                    default:
                                        var1x ^= 235000222;
                                        break label64;
                                    case 1155559342:
                                        var1x >>>= 30;
                                        var1x ^= 1798178266;
                                        break label64;
                                }
                            case 2:
                                var1x &= 261828821;
                                var1x ^= 1873683807;
                                break;
                            case 3:
                                switch (var1x) {
                                    case 539875137:
                                        var1x ^= 988352060;
                                        break label64;
                                    case 874252251:
                                    default:
                                        var1x ^= -1513811283;
                                        break label64;
                                    case 1155559342:
                                        var1x *= 911632607;
                                        var1x ^= 243137865;
                                        break label64;
                                }
                            case 4:
                                switch (var1x) {
                                    case -1414089416:
                                        var1x ^= -1624665264;
                                        break label64;
                                    case -263855624:
                                    default:
                                        var1x ^= 1755900361;
                                        break label64;
                                    case 1155559342:
                                        var1x ^= 580661023;
                                        var1x ^= 223495530;
                                        break label64;
                                }
                            case 5:
                                switch (var1x) {
                                    case -523187413:
                                        var1x ^= -1076085805;
                                        break label64;
                                    case 1155559342:
                                        var1x &= 656374373;
                                        var1x += 1936413227;
                                        var1x ^= 474331540;
                                        break label64;
                                    case 1897617713:
                                    default:
                                        var1x ^= 608668535;
                                        break label64;
                                }
                            case 6:
                                switch (var1x) {
                                    case -527294885:
                                        var1x ^= -1387053968;
                                        break label64;
                                    case 1009369488:
                                    default:
                                        var1x ^= 988319778;
                                        break label64;
                                    case 1155559342:
                                        var1x |= -2046280242;
                                        var1x ^= -1379501515;
                                        break label64;
                                }
                            case 7:
                                switch (var1x) {
                                    case 454365267:
                                    default:
                                        var1x ^= -660624158;
                                        break label64;
                                    case 1004642722:
                                        var1x ^= -1983173141;
                                        break label64;
                                    case 1155559342:
                                        var1x &= -493046340;
                                        var1x -= 1324234099;
                                        var1x <<= 31;
                                        var1x ^= -220089665;
                                        var1x ^= 433043300;
                                        break label64;
                                }
                            default:
                                var1x = switch (var1x) {
                                    case -1981752079 -> var1x ^ -728133040;
                                    default -> var1x ^ 1273062078;
                                    case 1155559342 -> {
                                        var1x *= -222813853;
                                        var1x *= -1107868709;
                                        yield var1x ^ -616457453;
                                    }
                                };
                                var54x = false;
                                var1x ^= -590989264;
                                var1x ^= -43797076;
                                break label65;
                        }

                        var54x = true;
                        var1x ^= 452136896;
                        var1x -= -762699078;
                        var1x &= -1029355653;
                        var1x ^= -154701976;
                        var1x ^= 741997000;
                    }

                    int var55x = var1x + 1;
                    int var56x = var1x * var55x;
                    int var61x = var1x + 2;
                    int var57x = var56x * var61x;
                    var1x += 3;
                    int var58x = var57x * var1x;
                    var1x = var58x & 7;
                    if (var1x == 0) {
                        return var54x;
                    }
                }
            }

            UnsupportedOperationException var43x = new UnsupportedOperationException();
            throw var43x;
        };
        Setting var108 = var107.Pt(var150);
        NumberSetting var109 = this.pixel;
        BooleanSupplier var151 = () -> {
            label108: {
            boolean var78x = false;
                int var1x = cm;
                var1x ^= 1778265040;
                int var2x = System.identityHashCode(this);
                ModeSetting var3x = this.oL;
                kP_2 var4x = kP_2.DRAWN;
                long var5x = var2x;
                long var7x = var5x + 1L;
                var7x = var5x * var7x;
                var5x = var7x & 1L;
                long var137x;
                int var115x = (var137x = var5x - 0L) == 0L ? 0 : (var137x < 0L ? -1 : 1);
                if (var115x != 0) {
                    var1x += -2021107079;
                    var1x += -1099235285;
                    var1x *= -1384353939;
                    var1x &= 2048299290;
                    var1x ^= -1593158949;
                } else {
                    label120: {
                        var1x &= 947137595;
                        var1x >>= 23;
                        var1x >>= 15;
                        var1x ^= -1823071745;
                        var5x = var1x;
                        var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        long var9x = var5x + 2L;
                        var7x *= var9x;
                        var5x += 3L;
                        var7x *= var5x;
                        var5x = var7x & 7L;
                        long var138x;
                        int var119x = (var138x = var5x - 0L) == 0L ? 0 : (var138x < 0L ? -1 : 1);
                        if (var119x != 0) {
                            break label108;
                        }

                        label101: {
                            boolean var79x = var3x.TJ(var4x);
                            if (!var79x) {
                                var1x ^= -1188014501;
                                var1x ^= 1634822202;
                                var1x >>>= 16;
                                var1x |= -754324748;
                                var1x ^= 916722851;
                                P var80x = this.jo;
                                Integer var98x = var2x;
                                if (var98x == null) {
                                    var1x >>= 30;
                                    var1x += -1787472765;
                                    var1x ^= -1443482283;
                                    var1x ^= -1249303780;
                                    break label120;
                                }

                                var1x |= -1080708249;
                                var1x ^= -1423257934;
                                var1x &= -1871695430;
                                var1x ^= 1728739342;
                                long var99x = var1x;
                                long var6x = var99x + 1L;
                                var6x = var99x * var6x;
                                long var100x = var6x & 1L;
                                long var139x;
                                int var101x = (var139x = var100x - 0L) == 0L ? 0 : (var139x < 0L ? -1 : 1);
                                if (var101x != 0) {
                                    break label108;
                                }

                                boolean var81x = var80x.d();
                                if (!var81x) {
                                    var1x >>>= 14;
                                    var1x *= 1889181937;
                                    var1x += -1142210854;
                                    var1x ^= -1477949652;
                                    long var82x = var1x;
                                    var5x = var82x + 1L;
                                    var5x = var82x * var5x;
                                    var7x = var82x + 2L;
                                    var5x *= var7x;
                                    long var83x = var82x + 3L;
                                    var5x *= var83x;
                                    long var84x = var5x & 7L;
                                    long var140x;
                                    int var85x = (var140x = var84x - 0L) == 0L ? 0 : (var140x < 0L ? -1 : 1);
                                    if (var85x != 0) {
                                        break label108;
                                    }

                                    P var86x = this.Y;
                                    int var102x = var2x + 1;
                                    int var103x = var2x * var102x;
                                    int var104x = var103x & 1;
                                    if (var104x != 0) {
                                        var1x ^= -1069853812;
                                        var1x += -919088523;
                                        var1x ^= 1534482755;
                                        break label120;
                                    }

                                    var1x -= -1425690145;
                                    var1x ^= 559070483;
                                    long var105x = var1x;
                                    var6x = var105x + 1L;
                                    var6x = var105x * var6x;
                                    long var106x = var6x & 1L;
                                    long var141x;
                                    int var107x = (var141x = var106x - 0L) == 0L ? 0 : (var141x < 0L ? -1 : 1);
                                    if (var107x != 0) {
                                        break label108;
                                    }

                                    boolean var87x = var86x.d();
                                    if (!var87x) {
                                        var1x = switch (var1x) {
                                            default -> var1x ^ -1759592856;
                                            case -1379793460 -> var1x ^ -1912942852;
                                            case 1059837395 -> {
                                                var1x &= 1496044459;
                                                yield var1x ^ -970540827;
                                            }
                                        };
                                        int var88x = var1x + 1;
                                        int var89x = var1x * var88x;
                                        int var90x = var89x & 1;
                                        if (var90x != 0) {
                                            break label108;
                                        }

                                        P var91x = this.eB;
                                        int var92x = (var91x.d()) ? 1 : 0;
                                        long var108x = var2x;
                                        var6x = var108x + 1L;
                                        var6x = var108x * var6x;
                                        long var8x = var108x + 2L;
                                        var6x *= var8x;
                                        long var109x = var108x + 3L;
                                        var6x *= var109x;
                                        long var110x = var6x & 7L;
                                        long var142x;
                                        var2x = (var142x = var110x - 0L) == 0L ? 0 : (var142x < 0L ? -1 : 1);
                                        if (var2x != 0) {
                                            var1x ^= 803419778;
                                            var1x ^= 2044992815;
                                            break label120;
                                        }

                                        var1x *= 1370681995;
                                        var1x += 1166432793;
                                        var1x ^= -160779845;
                                        var2x = var1x + 1;
                                        var2x = var1x * var2x;
                                        int var111x = var1x + 2;
                                        var2x *= var111x;
                                        int var112x = var1x + 3;
                                        var2x *= var112x;
                                        var2x &= 7;
                                        if (var2x != 0) {
                                            break label108;
                                        }

                                        if (var92x == 0) {
                                            var1x |= 1528044802;
                                            var1x += -655412233;
                                            var1x ^= 1080853949;
                                            var78x = false;
                                            var1x <<= 16;
                                            var1x &= 1623955303;
                                            var1x ^= 1740990433;
                                            break label101;
                                        }

                                        switch (var1x) {
                                            case -2142910699:
                                                var1x ^= 947591186;
                                                break;
                                            case 368680925:
                                            default:
                                                var1x ^= 1171386873;
                                                break;
                                            case 1748480448:
                                                var1x += -906576272;
                                                var1x ^= -1430552868;
                                                var1x ^= 1128939845;
                                        }
                                    } else {
                                        switch (var1x) {
                                            case -313490510:
                                                var1x ^= 937008164;
                                                break;
                                            case -103096037:
                                            default:
                                                var1x ^= 448739516;
                                                break;
                                            case 1059837395:
                                                var1x *= -1460885417;
                                                var1x += -391286610;
                                                var1x ^= 1622596810;
                                        }
                                    }
                                } else {
                                    var1x *= -876334425;
                                    var1x += -822377183;
                                    var1x >>>= 13;
                                    var1x ^= -606388720;
                                }
                            } else {
                                switch (var1x) {
                                    case -1823071745:
                                        var1x *= -1528104235;
                                        var1x += 1632924852;
                                        var1x >>= 7;
                                        var1x ^= 618119214;
                                        break;
                                    case -1004687102:
                                    default:
                                        var1x ^= 1812120777;
                                        break;
                                    case 956160769:
                                        var1x ^= -1049899595;
                                }
                            }

                            var78x = true;
                            var1x &= 2134214847;
                            var1x *= 1606723309;
                            var1x ^= 1237319060;
                        }

                        int var94x = var1x + 1;
                        int var95x = var1x * var94x;
                        int var113x = var1x + 2;
                        int var96x = var95x * var113x;
                        var1x += 3;
                        int var97x = var96x * var1x;
                        var1x = var97x & 7;
                        if (var1x == 0) {
                            return var78x;
                        }
                        break label108;
                    }
                }

                UnsupportedOperationException var93x = new UnsupportedOperationException();
                throw var93x;
            }

            IllegalArgumentException var71x = new IllegalArgumentException();
            throw var71x;
        };
        Setting var110 = var109.Pt(var151);
        NumberSetting var111 = this.Z;
        BooleanSupplier var152 = () -> {
            label117: {
                int var50x;
                int var76x;
                label123: {
                    var50x = cm;
                    var50x ^= 1751375026;
                    var76x = System.identityHashCode(this);
                    ModeSetting var3x = this.oL;
                    int var4x = var76x + 1;
                    var4x = var76x * var4x;
                    int var5x = var76x + 2;
                    var4x *= var5x;
                    var5x = var76x + 3;
                    var4x *= var5x;
                    var4x &= 7;
                    label114:
                    if (var4x == 0) {
                        var50x >>= 5;
                        var50x -= -715754614;
                        var50x |= 1362400657;
                        var50x ^= -128927361;
                        var4x = var50x + 1;
                        var4x = var50x * var4x;
                        var4x &= 1;
                        if (var4x != 0) {
                            break label117;
                        }

                        Enum var77x = var3x.A();
                        kP_2 var78x = (kP_2)var77x;
                        boolean var79x = var78x.animated();
                        if (!var79x) {
                            var50x = switch (var50x) {
                                case -1880871704 -> {
                                    var50x -= 2027642518;
                                    var50x <<= 19;
                                    var50x += 871643847;
                                    yield var50x ^ -170861021;
                                }
                                case 1255390652 -> var50x ^ -446799737;
                                default -> var50x ^ 1675922363;
                            };
                            P var80x = this.jo;
                            var3x = var80x.jN;
                            Enum var82x = var3x.A();
                            long var114x = var76x;
                            long var6x = var114x + 1L;
                            var6x = var114x * var6x;
                            long var115x = var6x & 1L;
                            long var133x;
                            var4x = (var133x = var115x - 0L) == 0L ? 0 : (var133x < 0L ? -1 : 1);
                            if (var4x != 0) {
                                var50x >>>= 4;
                                var50x |= 931545583;
                                var50x ^= 596277334;
                                break label114;
                            }

                            var50x ^= -2103636428;
                            var50x ^= -1638773759;
                            var50x ^= -1938955614;
                            kP_2 var83x = (kP_2)var82x;
                            int var84x = (var83x.animated()) ? 1 : 0;
                            if (var84x == 0) {
                                var50x &= 612244497;
                                var50x *= 1325696013;
                                var50x ^= -1420578743;
                                Integer var85x = var50x;
                                if (var85x == null) {
                                    break label117;
                                }

                                P var86x = this.Y;
                                var3x = var86x.jN;
                                Enum var88x = var3x.A();
                                kP_2 var89x = (kP_2)var88x;
                                var4x = var76x + 1;
                                var4x = var76x * var4x;
                                var4x &= 1;
                                if (var4x != 0) {
                                    var50x |= -2058342062;
                                    var50x &= -1030438522;
                                    var50x += 895099864;
                                    var50x *= 1443165671;
                                    var50x ^= -1153344917;
                                    break label114;
                                }

                                var50x &= -1696400164;
                                var50x ^= -1477287485;
                                var50x *= -1232763653;
                                var50x |= -705337783;
                                var50x ^= 414991114;
                                var4x = var50x + 1;
                                var4x = var50x * var4x;
                                var4x &= 1;
                                if (var4x != 0) {
                                    break label117;
                                }

                                int var90x = (var89x.animated()) ? 1 : 0;
                                if (var90x == 0) {
                                    var50x = switch (var50x) {
                                        case -951376569 -> {
                                            var50x <<= 20;
                                            var50x >>= 23;
                                            var50x <<= 3;
                                            var50x ^= 1266284746;
                                            yield var50x ^ -1814376792;
                                        }
                                        case -237465672 -> var50x ^ 670880833;
                                        default -> var50x ^ -795166434;
                                    };
                                    long var91x = var50x;
                                    long var126x = var91x + 1L;
                                    long var127x = var91x * var126x;
                                    long var92x = var127x & 1L;
                                    long var134x;
                                    int var93x = (var134x = var92x - 0L) == 0L ? 0 : (var134x < 0L ? -1 : 1);
                                    if (var93x != 0) {
                                        break label117;
                                    }

                                    P var94x = this.eB;
                                    var3x = var94x.jN;
                                    Enum var96x = var3x.A();
                                    kP_2 var97x = (kP_2)var96x;
                                    Integer var73x = var76x;
                                    if (var73x == null) {
                                        switch (var50x) {
                                            case -1321257762:
                                                var50x ^= 1528330908;
                                                break label114;
                                            case -1228722916:
                                            default:
                                                var50x ^= 1560697384;
                                                break label114;
                                            case -660393182:
                                                var50x *= 660627915;
                                                var50x *= 397197521;
                                                var50x &= 1700018018;
                                                var50x *= 1020981253;
                                                var50x ^= 93113843;
                                                break label114;
                                        }
                                    }
                                    var50x = switch (var50x) {
                                        case -660393182 -> {
                                            var50x ^= -851979249;
                                            yield var50x ^ -406783983;
                                        }
                                        case -3641475 -> var50x ^ -990041193;
                                        default -> var50x ^ 443129221;
                                    };
                                    var73x = var50x;
                                    if (var73x == null) {
                                        break label117;
                                    }

                                    boolean var75x = var97x.animated();
                                    if (!var75x) {
                                        var50x |= -435986484;
                                        var50x += 164111474;
                                        var50x ^= 1569751749;
                                        var76x = 0;
                                        switch (var50x) {
                                            case -1563189302:
                                            default:
                                                var50x ^= 1125904441;
                                                break label123;
                                            case 1074025328:
                                                var50x ^= 1699632998;
                                                break label123;
                                            case 1569654443:
                                                var50x += 617229439;
                                                var50x &= 405112022;
                                                var50x ^= 1174352815;
                                                var50x -= -745142430;
                                                var50x ^= -689468790;
                                                break label123;
                                        }
                                    }

                                    var50x -= 756922835;
                                    var50x |= -10859540;
                                    var50x ^= 860322617;
                                } else {
                                    switch (var50x) {
                                        case -1540909641:
                                        default:
                                            var50x ^= 1519733880;
                                            break;
                                        case -951376569:
                                            var50x *= 1418307729;
                                            var50x &= 322387595;
                                            var50x -= -2043031011;
                                            var50x ^= 1190294834;
                                            break;
                                        case 1857894105:
                                            var50x ^= 225357135;
                                    }
                                }
                            } else {
                                var50x <<= 17;
                                var50x &= 41432924;
                                var50x ^= -866577196;
                            }
                        } else {
                            var50x += -705340695;
                            var50x &= -1808203869;
                            var50x &= 928078615;
                            var50x ^= -936831019;
                        }

                        long var98x = var50x;
                        long var128x = var98x + 1L;
                        long var129x = var98x * var128x;
                        long var7x = var98x + 2L;
                        long var130x = var129x * var7x;
                        long var99x = var98x + 3L;
                        long var131x = var130x * var99x;
                        long var100x = var131x & 7L;
                        long var135x;
                        int var101x = (var135x = var100x - 0L) == 0L ? 0 : (var135x < 0L ? -1 : 1);
                        if (var101x != 0) {
                            break label117;
                        }

                        var76x = 1;
                        var50x >>>= 15;
                        var50x ^= -1534181709;
                        break label123;
                    } else {
                        var50x &= 944810834;
                        var50x ^= 1501022468;
                        var50x |= -1253891390;
                        var50x ^= -514171793;
                    }

                    Integer var66x = var50x;
                    if (var66x != null) {
                        AssertionError var67x = new AssertionError();
                        throw var67x;
                    }
                    break label117;
                }

                int var102x = var50x + 1;
                var102x = var50x * var102x;
                int var123x = var50x + 2;
                var102x *= var123x;
                var123x = var50x + 3;
                var102x *= var123x;
                var102x &= 7;
                if (var102x == 0) {
                    return (var76x != 0);
                }
            }

            IllegalArgumentException var72x = new IllegalArgumentException();
            throw var72x;
        };
        Setting var112 = var111.Pt(var152);
        ColorSetting var113 = this.o;
        BooleanSetting var153 = this.C;
        // removed dead duplicate capture (var3 unused later): var3 = Objects.requireNonNull(var153);
        BooleanSupplier var154 = var153::vb;
        Setting var114 = var113.Pt(var154);
        NumberSetting var115 = this.Ob;
        BooleanSetting var155 = this.P;
        // removed dead duplicate capture (var3 unused later): var3 = Objects.requireNonNull(var155);
        BooleanSupplier var156 = var155::vb;
        Setting var116 = var115.Pt(var156);
        NumberSetting var117 = this.vP;
        BooleanSupplier var157 = () -> {
            int var1x = cm;
            var1x ^= 883223809;
            int var2x = System.identityHashCode(this);
            ModeSetting var3x = this.u;
            Ek var4x = dev.aurap.hub.Ek.OFF;
            boolean var34x = var3x.TJ(var4x);
            Integer var29x = var2x;
            if (var29x == null) {
                var1x *= -936780953;
                var1x >>>= 31;
                var1x ^= -1782820752;
                long var37x = var1x;
                long var6x = var37x + 1L;
                var6x = var37x * var6x;
                long var38x = var6x & 1L;
                long var41x;
                int var30x = (var41x = var38x - 0L) == 0L ? 0 : (var41x < 0L ? -1 : 1);
                if (var30x == 0) {
                    IllegalArgumentException var31x = new IllegalArgumentException();
                    throw var31x;
                }
            } else {
                label34: {
                    var1x |= 302531049;
                    var1x *= 1308526117;
                    var1x -= 1691434197;
                    var1x *= 1154009653;
                    var1x ^= -1723296132;
                    int var33x = 0;
                    if (!var34x) {
                        var1x &= -1343635207;
                        var1x &= -1975220876;
                        var1x |= -31617624;
                        var1x ^= 528082270;
                        var29x = var1x;
                        if (var29x == null) {
                            break label34;
                        }

                        var33x = 1;
                        switch (var1x) {
                            case -651475634:
                            default:
                                var1x ^= -497901899;
                                break;
                            case -513513290:
                                var1x *= -1780903677;
                                var1x &= -200028874;
                                var1x ^= -663598981;
                                break;
                            case 1335364259:
                                var1x ^= 2017742053;
                        }
                    } else {
                        var1x -= 1872159255;
                        var1x ^= 623062754;
                        var33x = 0;
                        var1x += 838160994;
                        var1x ^= 1695289320;
                    }

                    long var35x = var1x;
                    long var5x = var35x + 1L;
                    var5x = var35x * var5x;
                    long var36x = var5x & 1L;
                    long var42x;
                    var1x = (var42x = var36x - 0L) == 0L ? 0 : (var42x < 0L ? -1 : 1);
                    if (var1x == 0) {
                          return var33x != 0;
                    }
                }
            }

            RuntimeException var28x = new RuntimeException();
            throw var28x;
        };
        Setting var118 = var117.Pt(var157);
        ColorSetting var119 = this.pW;
        BooleanSetting var158 = this.P;
        // removed dead duplicate capture (var3 unused later): var3 = Objects.requireNonNull(var158);
        BooleanSupplier var159 = var158::vb;
        Setting var120 = var119.Pt(var159);
        NumberSetting var121 = this.i;
        BooleanSupplier var160 = this::OD;
        Setting var122 = var121.Pt(var160);
        ModeSetting var123 = this.y;
        BooleanSupplier var161 = this::OD;
        Setting var124 = var123.Pt(var161);
        ModeSetting var125 = this.oL;
        nv var162 = (var1x, var2x, var3x, var4x, var5x, var6x, var7x) -> {
            int var8x = cm;
            var8x ^= 532443294;
            int var9x = System.identityHashCode(this);
            kP_2 var10x = (kP_2)var2x;
            Integer var25x = var9x;
            if (var25x != null) {
                var8x = switch (var8x) {
                    case -394184673 -> {
                        var8x *= -794564193;
                        var8x |= 1503004419;
                        var8x ^= 1793062556;
                        yield var8x ^ 870774058;
                    }
                    case -343071241 -> var8x ^ 1810199295;
                    default -> var8x ^ 1884966355;
                };
                int var26x = var8x + 1;
                var26x = var8x * var26x;
                var26x &= 1;
                if (var26x == 0) {
                    ActionSetting var30x = this.a;
                    du var31x = var30x.lP();
                    ColorSetting var11x = this.bC;
                    int var32x = var11x.zz();
                    ColorSetting var12x = this.B;
                    int var33x = var12x.zz();
                    int var13x = var8x & -1855995668;
                    var13x ^= 864703753;
                    this.preview(var1x, var10x, var31x, var32x, var33x, var3x, var4x, var5x, var6x, var7x, var13x);
                } else {
                    RuntimeException var29x = new RuntimeException();
                    throw var29x;
                }
            } else {
                var8x *= 419494005;
                var8x -= -79185040;
                var8x |= 815246284;
                var8x >>= 9;
                var8x ^= -410818329;
                IllegalStateException var20x = new IllegalStateException();
                throw var20x;
            }
        };
        UN.tN(var125, var162);
        EventListener<HitEvent> var126 = (HitEvent var1x) -> {
            P var79x = null;
            label92: {
                int var2x = cm;
                var2x ^= 300255907;
                int var3x = System.identityHashCode(this);
                Integer var4x = var3x;
                if (var4x == null) {
                    var2x -= -537044890;
                    var2x ^= 2113151539;
                } else {
                    label97: {
                        var2x ^= 1523367476;
                        var2x ^= -866133810;
                        var2x += -168935005;
                        var2x ^= 981476191;
                        var4x = var2x;
                        if (var4x == null) {
                            break label92;
                        }

                        label88: {
                            boolean var74x = var1x.crit();
                            if (var74x) {
                                var2x >>>= 14;
                                var2x <<= 18;
                                var2x &= -1011132135;
                                var2x *= 1383737015;
                                var2x ^= 607949980;
                                P var75x = this.Y;
                                BooleanSetting var76x = var75x.NR;
                                boolean var77x = var76x.vb();
                                long var5x = var3x;
                                long var7x = var5x + 1L;
                                var7x = var5x * var7x;
                                var5x = var7x & 1L;
                                long var109x;
                                int var81x = (var109x = var5x - 0L) == 0L ? 0 : (var109x < 0L ? -1 : 1);
                                if (var81x != 0) {
                                    var2x &= 1191390198;
                                    var2x ^= 1043286811;
                                    break label97;
                                }
                                var2x = switch (var2x) {
                                    default -> var2x ^ 448075627;
                                    case 1167365276 -> {
                                        var2x |= -1427337716;
                                        var2x |= -1615997648;
                                        var2x ^= -2138428583;
                                        var2x |= -579265369;
                                        yield var2x ^ -956531468;
                                    }
                                    case 1330434838 -> var2x ^ 1404286011;
                                };
                                var5x = var2x;
                                var7x = var5x + 1L;
                                var7x = var5x * var7x;
                                long var9x = var5x + 2L;
                                var7x *= var9x;
                                var5x += 3L;
                                var7x *= var5x;
                                var5x = var7x & 7L;
                                long var110x;
                                int var85x = (var110x = var5x - 0L) == 0L ? 0 : (var110x < 0L ? -1 : 1);
                                if (var85x != 0) {
                                    break label92;
                                }

                                if (var77x) {
                                    var2x += 194840724;
                                    var2x ^= 625002941;
                                    var2x ^= 143214298;
                                    P var78x = this.Y;
                                    var5x = var3x;
                                    var7x = var5x + 1L;
                                    var7x = var5x * var7x;
                                    var5x = var7x & 1L;
                                    long var111x;
                                    int var88x = (var111x = var5x - 0L) == 0L ? 0 : (var111x < 0L ? -1 : 1);
                                    if (var88x != 0) {
                                        var2x <<= 31;
                                        var2x &= 1401829849;
                                        var2x -= 1075246532;
                                        var2x &= 233800119;
                                        var2x ^= 1992707003;
                                        break label97;
                                    }

                                    var2x |= -1375552009;
                                    var2x ^= -6318868;
                                    var2x ^= -177628582;
                                    int var89x = var2x + 1;
                                    int var90x = var2x * var89x;
                                    int var6x = var2x + 2;
                                    int var91x = var90x * var6x;
                                    var6x = var2x + 3;
                                    int var92x = var91x * var6x;
                                    int var93x = var92x & 7;
                                    if (var93x != 0) {
                                        break label92;
                                    }

                                    var79x = var78x;
                                    var2x &= -676574681;
                                    var2x >>= 3;
                                    var2x |= -1046184861;
                                    var2x ^= -1701768635;
                                    break label88;
                                }

                                var2x &= -246026621;
                                var2x |= -163610012;
                                var2x ^= -1678137434;
                            } else {
                                var2x ^= -97679331;
                                var2x -= 709584624;
                                var2x *= -1327292149;
                                var2x |= -540269191;
                                var2x ^= -1291171142;
                            }

                            P var94x = this.jo;
                            long var96x = var3x;
                            long var8x = var96x + 1L;
                            var8x = var96x * var8x;
                            long var10x = var96x + 2L;
                            var8x *= var10x;
                            var96x += 3L;
                            var8x *= var96x;
                            var96x = var8x & 7L;
                            long var112x;
                            var3x = (var112x = var96x - 0L) == 0L ? 0 : (var112x < 0L ? -1 : 1);
                            if (var3x != 0) {
                                switch (var2x) {
                                    case -2012083012:
                                    default:
                                        var2x ^= -289304250;
                                        break label97;
                                    case -66756005:
                                        var2x ^= 1524448874;
                                        break label97;
                                    case 1824925121:
                                        var2x *= -1732146241;
                                        var2x ^= -1208369552;
                                        break label97;
                                }
                            }

                            var2x >>= 28;
                            var2x &= 172182804;
                            var2x ^= -937522052;
                            Integer var68x = var2x;
                            if (var68x == null) {
                                break label92;
                            }

                            var79x = var94x;
                            switch (var2x) {
                                case -937522056:
                                    var2x *= 319775895;
                                    var2x ^= 2027902190;
                                    break;
                                case 323123371:
                                    var2x ^= -1644982104;
                                    break;
                                case 1119465285:
                                default:
                                    var2x ^= -771840012;
                            }
                        }

                        var3x = var2x + 1;
                        var3x = var2x * var3x;
                        var3x &= 1;
                        if (var3x == 0) {
                            var2x += -407286213;
                            var2x |= -1827162700;
                            var2x >>= 8;
                            var2x *= 1591623825;
                            var2x ^= 90357632;
                            this.tb(var79x, var2x);
                            return;
                        }
                        break label92;
                    }
                }

                IllegalArgumentException var72x = new IllegalArgumentException();
                throw var72x;
            }

            UnsupportedOperationException var64x = new UnsupportedOperationException();
            throw var64x;
        };
        this.onEvent(HitEvent.class, var126);
        EventListener<KillEvent> var127 = (KillEvent var1x) -> {
            int var2x = cm;
            var2x ^= 1703580504;
            int var3x = System.identityHashCode(this);
            P var4x = this.eB;
            Integer var16x = var3x;
            if (var16x == null) {
                var2x ^= 1097447991;
                var2x >>>= 18;
                var2x -= 1402911750;
                var2x ^= -1414191673;
                int var17x = var2x + 1;
                var17x = var2x * var17x;
                var17x &= 1;
                if (var17x == 0) {
                    UnsupportedOperationException var21x = new UnsupportedOperationException();
                    throw var21x;
                } else {
                    IllegalArgumentException var20x = new IllegalArgumentException();
                    throw var20x;
                }
            } else {
                var2x *= -24988697;
                var2x -= 723261031;
                var2x ^= 17897244;
                var2x &= -1593773294;
                var2x *= 1309159039;
                var2x ^= -1043042179;
                this.tb(var4x, var2x);
            }
        };
        this.onEvent(KillEvent.class, var127);
        EventListener<RenderEvent> var128 = this::C;
        this.onEvent(RenderEvent.class, var128);
    }

    public static boolean NS() {
        int var0 = cm;
        var0 ^= 161336067;
        int var1 = (ClientRuntime.y()) ? 1 : 0;
        var0 <<= 25;
        var0 ^= -563728387;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        if (var2 == 0) {
            if (var1 == 0) {
                var0 ^= -604409720;
                var0 -= -1147124349;
                var0 <<= 4;
                var0 |= 1657538696;
                var0 ^= 348325365;
                return false;
            }
            var0 = switch (var0) {
                case -1072680863 -> var0 ^ -960114053;
                case -630837251 -> {
                    var0 >>= 19;
                    var0 &= 1233292926;
                    var0 *= -1730721303;
                    yield var0 ^ -2140004802;
                }
                default -> var0 ^ -511718303;
            };
            long var46 = var0;
            long var66 = var46 + 1L;
            long var67 = var46 * var66;
            long var47 = var67 & 1L;
            long var72;
            var1 = (var72 = var47 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
            label44:
            if (var1 == 0) {
                ClientRuntime var49 = ClientRuntime.Z();
                ModuleManager var50 = var49.sP();
                Module var51 = var50.tG(crosshair.class);
                crosshair var52 = (crosshair)var51;
                int var53 = (var52.IU()) ? 1 : 0;
                var0 <<= 13;
                var0 |= -667770532;
                var0 ^= -1251381653;
                var0 *= -1789959729;
                var0 ^= 1655031282;
                if (var53 != 0) {
                    var0 -= -1171446454;
                    var0 &= -252585386;
                    var0 ^= -352344489;
                    var0 -= 1696667459;
                    var0 ^= 1294759342;
                    long var54 = var0;
                    long var68 = var54 + 1L;
                    long var69 = var54 * var68;
                    long var5 = var54 + 2L;
                    long var70 = var69 * var5;
                    long var55 = var54 + 3L;
                    long var71 = var70 * var55;
                    long var56 = var71 & 7L;
                    long var73;
                    var53 = (var73 = var56 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var53 != 0) {
                        break label44;
                    }

                    boolean var58 = i_2.q();
                    var0 |= -1434601521;
                    var0 >>>= 9;
                    var0 ^= -925280854;
                    Integer var64 = var0;
                    if (var64 == null) {
                        break label44;
                    }

                    if (var58) {
                        var0 = switch (var0) {
                            default -> var0 ^ 1737539123;
                            case -928240815 -> {
                                var0 += -877308930;
                                yield var0 ^ 1197770887;
                            }
                            case 1367586695 -> var0 ^ 83529500;
                        };
                        var58 = true;
                        var0 -= 298139319;
                        var0 += 1556924828;
                        var0 ^= -2108659657;
                        return var58;
                    }

                    var0 += 986088454;
                    var0 += -2019194546;
                    var0 ^= -112927976;
                } else {
                    var0 &= -1813711675;
                    var0 >>= 15;
                    var0 ^= -1918646403;
                }

                boolean var74 = false;
                var0 += 1399185875;
                var0 += 1673198509;
                var0 ^= -1256182873;
                return var74;
            }
        }

        RuntimeException var35 = new RuntimeException();
        throw var35;
    }

    private boolean OD() {
        boolean var64 = false;
        label102: {
            int var1 = cm;
            var1 ^= 1441624450;
            int var2 = System.identityHashCode(this);
            P var3 = this.jo;
            BooleanSetting var65 = var3.NR;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var99;
            int var81 = (var99 = var4 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
            if (var81 != 0) {
                switch (var1) {
                    case -1563412221:
                        var1 += -1973300291;
                        var1 >>= 18;
                        var1 ^= -699533442;
                        break;
                    case -574358873:
                    default:
                        var1 ^= -857593377;
                        break;
                    case 960070767:
                        var1 ^= 303335041;
                }
            } else {
                label109: {
                    var1 |= -43464100;
                    var1 ^= 1869413867;
                    var4 = var1;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var100;
                    int var84 = (var100 = var4 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    if (var84 != 0) {
                        break label102;
                    }

                    label105: {
                        boolean var66 = var65.vb();
                        if (!var66) {
                            var1 += 1116876205;
                            var1 ^= -480789453;
                            Integer var67 = var1;
                            if (var67 == null) {
                                break label102;
                            }

                            var3 = this.Y;
                            BooleanSetting var69 = var3.NR;
                            boolean var70 = var69.vb();
                            var4 = var2;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            long var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var101;
                            int var88 = (var101 = var4 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                            if (var88 != 0) {
                                var1 *= -2142022985;
                                var1 *= 1690538923;
                                var1 += -1171315754;
                                var1 ^= 2014979410;
                                break label109;
                            }

                            var1 *= 168670747;
                            var1 >>= 17;
                            var1 *= 821772325;
                            var1 ^= -818426366;
                            if (!var70) {
                                var1 *= -226517823;
                                var1 ^= 1616992876;
                                long var71 = var1;
                                long var5 = var71 + 1L;
                                var5 = var71 * var5;
                                long var7 = var71 + 2L;
                                var5 *= var7;
                                long var72 = var71 + 3L;
                                var5 *= var72;
                                long var73 = var5 & 7L;
                                long var102;
                                int var74 = (var102 = var73 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                                if (var74 != 0) {
                                    break label102;
                                }

                                var3 = this.eB;
                                BooleanSetting var76 = var3.NR;
                                boolean var77 = var76.vb();
                                Integer var61 = var2;
                                if (var61 == null) {
                                    var1 ^= -189903872;
                                    var1 -= -535754004;
                                    var1 ^= -1205833135;
                                    var1 |= -979181939;
                                    var1 ^= 196281007;
                                    break label109;
                                }

                                var1 *= -796732541;
                                var1 &= 1965718904;
                                var1 &= -720184237;
                                var1 |= 795115080;
                                var1 ^= -2110353241;
                                var61 = var1;
                                if (var61 == null) {
                                    break label102;
                                }

                                if (!var77) {
                                    var1 += 274362667;
                                    var1 *= 362265957;
                                    var1 |= -576872499;
                                    var1 &= -602315583;
                                    var1 ^= -398253793;
                                    var61 = var1;
                                    if (var61 == null) {
                                        break label102;
                                    }

                                    var64 = false;
                                    switch (var1) {
                                        case -52483416:
                                            var1 ^= -133327083;
                                            break label105;
                                        case 244213225:
                                        default:
                                            var1 ^= -1505629774;
                                            break label105;
                                        case 878331358:
                                            var1 *= 1893415401;
                                            var1 ^= -1104597723;
                                            break label105;
                                    }
                                }

                                switch (var1) {
                                    case -1387204865:
                                        var1 &= 1868112247;
                                        var1 ^= 6201810;
                                        break;
                                    case 1358211742:
                                        var1 ^= 640928964;
                                        break;
                                    case 2033456305:
                                    default:
                                        var1 ^= 1107366235;
                                }
                            } else {
                                switch (var1) {
                                    case -2009272881:
                                        var1 ^= -1477197848;
                                        break;
                                    case 200629852:
                                        var1 &= -1768761606;
                                        var1 -= -1154251191;
                                        var1 += -1518980043;
                                        var1 <<= 7;
                                        var1 ^= 1150067621;
                                        break;
                                    case 326105489:
                                    default:
                                        var1 ^= -1006300959;
                                }
                            }
                        } else {
                            switch (var1) {
                                case -1869347148:
                                    var1 -= -1480220262;
                                    var1 *= -1577825109;
                                    var1 ^= -1040457696;
                                    var1 ^= -1839455781;
                                    break;
                                case 1240770659:
                                default:
                                    var1 ^= 288868488;
                                    break;
                                case 1559460241:
                                    var1 ^= 1955985926;
                            }
                        }

                        Integer var79 = var1;
                        if (var79 == null) {
                            break label102;
                        }

                        var64 = true;
                        switch (var1) {
                            case 755925413:
                                var1 += -270551249;
                                var1 -= 94950905;
                                var1 |= 558176000;
                                var1 ^= 768499696;
                                break;
                            case 1243482092:
                            default:
                                var1 ^= 1831290474;
                                break;
                            case 1418846441:
                                var1 ^= -1511702374;
                        }
                    }

                    Integer var59 = var1;
                    if (var59 != null) {
                        return var64;
                    }
                    break label102;
                }
            }

            IllegalArgumentException var78 = new IllegalArgumentException();
            throw var78;
        }

        IllegalArgumentException var60 = new IllegalArgumentException();
        throw var60;
    }

    private void tb(P var1, int var2) {
        label115: {
            int var4 = System.identityHashCode(this);
            BooleanSetting var5 = var1.NR;
            boolean var86 = var5.vb();
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 != 0) {
                int var3 = var2 >>> 29;
                var3 >>= 29;
                var3 &= 951069670;
                var3 ^= -2001495545;
            } else {
                int var16 = var2 * -1322717005;
                var16 >>>= 4;
                var16 *= -188530395;
                var16 &= 744179081;
                var16 ^= -787729459;
                Integer var109 = var16;
                if (var109 == null) {
                    break label115;
                }

                if (!var86) {
                    switch (var16) {
                        case -1571705401:
                            var16 ^= 1550117083;
                            break;
                        case -829683430:
                        default:
                            var16 ^= 1271066813;
                            break;
                        case -581159356:
                            var16 >>= 3;
                            var16 >>>= 4;
                            var16 *= 223643759;
                            var16 <<= 3;
                            var16 ^= -2129500435;
                    }

                    return;
                }

                var16 ^= -1880385994;
                var16 >>>= 1;
                var16 *= 898987891;
                var16 ^= 635271465;
                P var87 = this.FS;
                int var110 = var4 + 1;
                var110 = var4 * var110;
                var110 &= 1;
                label112:
                if (var110 == 0) {
                    var16 = switch (var16) {
                        case -582179276 -> var16 ^ 2001006785;
                        default -> var16 ^ -1136179601;
                        case 1709928882 -> {
                            var16 *= 1172378495;
                            var16 |= -1044764678;
                            yield var16 ^ -1748431106;
                        }
                    };
                    Integer var113 = var16;
                    if (var113 == null) {
                        break label115;
                    }

                    if (var87 != null) {
                        var16 -= 1423709667;
                        var16 ^= 1901159354;
                        long var88 = var16;
                        long var7 = var88 + 1L;
                        var7 = var88 * var7;
                        long var89 = var7 & 1L;
                        long var158;
                        int var90 = (var158 = var89 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            break label115;
                        }

                        float var91 = this.r;
                        int var114 = var16 * -1970749361;
                        var114 &= -1723824845;
                        var114 ^= 1652666617;
                        var114 <<= 23;
                        var114 ^= 774755135;
                        float var119 = this.d(var114);
                        int var130 = var4 + 1;
                        int var131 = var4 * var130;
                        int var8 = var4 + 2;
                        int var132 = var131 * var8;
                        var8 = var4 + 3;
                        int var133 = var132 * var8;
                        int var134 = var133 & 7;
                        if (var134 != 0) {
                            var16 |= 370364465;
                            var16 ^= -26713424;
                            break label112;
                        }

                        var16 *= -17057521;
                        var16 ^= -1678744883;
                        float var159;
                        int var92 = (var159 = var91 - var119) == 0.0F ? 0 : (var159 < 0.0F ? -1 : 1);
                        if (var92 < 0) {
                            var16 &= 4115168;
                            var16 -= -193572897;
                            var16 += -512637146;
                            var16 >>>= 14;
                            var16 ^= -158748181;
                            int var93 = var16 + 1;
                            int var94 = var16 * var93;
                            var114 = var16 + 2;
                            int var95 = var94 * var114;
                            var114 = var16 + 3;
                            int var96 = var95 * var114;
                            int var97 = var96 & 7;
                            if (var97 != 0) {
                                break label115;
                            }

                            P var98 = this.FS;
                            int var99 = var98.Sc;
                            var114 = var1.Sc;
                            var7 = var4;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var160;
                            int var138 = (var160 = var7 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                            if (var138 != 0) {
                                var16 += 349782839;
                                var16 -= -1193125453;
                                var16 *= 1311563835;
                                var16 ^= 159153161;
                                break label112;
                            }

                            var16 |= 1883374372;
                            var16 ^= -425227411;
                            int var139 = var16 + 1;
                            int var140 = var16 * var139;
                            var8 = var16 + 2;
                            int var141 = var140 * var8;
                            var8 = var16 + 3;
                            int var142 = var141 * var8;
                            int var143 = var142 & 7;
                            if (var143 != 0) {
                                break label115;
                            }

                            if (var99 > var114) {
                                long var100 = switch (var16) {
                                    case 275614859 -> {
                                        var16 &= 1159266983;
                                        var16 += 1233783302;
                                        var16 &= 1841684102;
                                        var16 += -1954084215;
                                        yield var16 ^ 1879706018;
                                    }
                                    default -> var16 ^ -442400328;
                                    case 1842371476 -> var16 ^ 98409627;
                                };
                                var7 = var100 + 1L;
                                var7 = var100 * var7;
                                var9 = var100 + 2L;
                                var7 *= var9;
                                long var101 = var100 + 3L;
                                var7 *= var101;
                                long var102 = var7 & 7L;
                                long var161;
                                int var103 = (var161 = var102 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                                if (var103 == 0) {
                                    return;
                                }
                                break label115;
                            }

                            var16 *= 1336318467;
                            var16 >>>= 7;
                            var16 ^= 850252378;
                        } else {
                            switch (var16) {
                                case -1454986320:
                                default:
                                    var16 ^= 930872803;
                                    break;
                                case -380057614:
                                    var16 ^= 170683973;
                                    break;
                                case 194060804:
                                    var16 *= 1227822619;
                                    var16 *= 1248830587;
                                    var16 &= 1664469420;
                                    var16 ^= 1403369337;
                            }
                        }
                    } else {
                        var16 |= 1014192281;
                        var16 *= -798197191;
                        var16 -= -1825389174;
                        var16 += -493679682;
                        var16 ^= 1929772440;
                    }

                    long var104 = var16;
                    long var148 = var104 + 1L;
                    var148 = var104 * var148;
                    long var105 = var148 & 1L;
                    long var162;
                    int var106 = (var162 = var105 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                    if (var106 != 0) {
                        break label115;
                    }

                    this.FS = var1;
                    long var79 = var4;
                    long var123 = var79 + 1L;
                    long var124 = var79 * var123;
                    long var153 = var79 + 2L;
                    long var125 = var124 * var153;
                    long var80 = var79 + 3L;
                    long var126 = var125 * var80;
                    long var81 = var126 & 7L;
                    long var163;
                    var4 = (var163 = var81 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        var16 += 829512967;
                        var16 &= -976049243;
                        var16 ^= 476573330;
                        var16 ^= 83623344;
                        long var83 = var16;
                        long var127 = var83 + 1L;
                        long var128 = var83 * var127;
                        long var84 = var128 & 1L;
                        long var164;
                        var4 = (var164 = var84 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            this.r = 0.0F;
                            return;
                        }
                        break label115;
                    }

                    var16 >>= 4;
                    var16 ^= -1952802326;
                } else {
                    switch (var16) {
                        case -1126558827:
                        default:
                            var16 ^= 852374320;
                            break;
                        case -556239709:
                            var16 ^= -741053792;
                            break;
                        case 1709928882:
                            var16 *= -167326079;
                            var16 ^= 268311733;
                    }
                }
            }

            UnsupportedOperationException var70 = new UnsupportedOperationException();
            throw var70;
        }

        AssertionError var78 = new AssertionError();
        throw var78;
    }

    private float d(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            int var2 = var1 & 1948364314;
            var2 += -1163871117;
            var2 ^= -806120228;
            var2 ^= -534470495;
            var2 ^= -1878293856;
            Integer var26 = var2;
            if (var26 != null) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            long var17 = switch (var1) {
                case -1198120462 -> var1 ^ 1521173539;
                case -768748737 -> {
                    int var13 = var1 + 879274532;
                    var13 *= 101682217;
                    var13 &= 625934524;
                    var13 |= 366334029;
                    yield var13 ^ 1573848833;
                }
                default -> var1 ^ 1043451412;
            };
            long var31 = var17 + 1L;
            long var32 = var17 * var31;
            long var6 = var17 + 2L;
            long var33 = var32 * var6;
            var17 += 3L;
            long var34 = var33 * var17;
            var17 = var34 & 7L;
            long var35;
            int var20 = (var35 = var17 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var20 == 0) {
                NumberSetting var22 = this.i;
                float var23 = var22.WM();
                return var23 / 1000.0F;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    private void C(RenderEvent var1) {
        float var543 = 0.0F;
        XF var550 = null;
        float var562 = 0.0F;
        float var642 = 0.0F;
        float var653 = 0.0F;
        float var695 = 0.0F;
        boolean var707 = false;
        int var829 = 0;
        label767: {
            int var2 = cm;
            var2 ^= 809669201;
            int var3 = System.identityHashCode(this);
            RenderPhase var4 = var1.phase();
            Integer var5 = var3;
            if (var5 == null) {
                var2 -= -1628780508;
                var2 |= -1662322906;
                var2 ^= -496843096;
                var2 ^= 121789881;
            } else {
                label766: {
                    var2 >>= 11;
                    var2 *= -256967659;
                    var2 |= -387136627;
                    var2 &= -1994090396;
                    var2 ^= 940939212;
                    var5 = var2;
                    if (var5 == null) {
                        break label767;
                    }

                    RenderPhase var465 = RenderPhase.UNDERLAY;
                    if (var4 == var465) {
                        var2 |= -1690559532;
                        var2 &= -216399418;
                        var2 *= -1119625703;
                        var2 ^= -2116051450;
                        Integer var442 = var2;
                        if (var442 == null) {
                            break label767;
                        }

                        FrameContext var443 = var1.frame();
                        long var466 = var3;
                        long var7 = var466 + 1L;
                        var7 = var466 * var7;
                        long var9 = var466 + 2L;
                        var7 *= var9;
                        long var467 = var466 + 3L;
                        var7 *= var467;
                        long var468 = var7 & 7L;
                        long var1010;
                        int var469 = (var1010 = var468 - 0L) == 0L ? 0 : (var1010 < 0L ? -1 : 1);
                        if (var469 != 0) {
                            var2 ^= 108193583;
                            var2 >>= 23;
                            var2 |= 788790666;
                            var2 >>>= 20;
                            var2 ^= 1507812160;
                            break label766;
                        }
                        var2 = switch (var2) {
                            case -118244830 -> {
                                var2 >>= 6;
                                yield var2 ^ 106322854;
                            }
                            default -> var2 ^ -740599134;
                            case 1173127344 -> var2 ^ -2057958222;
                        };
                        boolean var444 = var443.hideGui();
                        if (!var444) {
                            var2 = switch (var2) {
                                case -105540274 -> {
                                    var2 >>= 12;
                                    yield var2 ^ -1300659191;
                                }
                                default -> var2 ^ 728819945;
                                case 1866629108 -> var2 ^ -1505115772;
                            };
                            long var445 = var2;
                            long var6 = var445 + 1L;
                            var6 = var445 * var6;
                            long var8 = var445 + 2L;
                            var6 *= var8;
                            long var446 = var445 + 3L;
                            var6 *= var446;
                            long var447 = var6 & 7L;
                            long var1011;
                            int var448 = (var1011 = var447 - 0L) == 0L ? 0 : (var1011 < 0L ? -1 : 1);
                            if (var448 != 0) {
                                break label767;
                            }

                            FrameContext var449 = var1.frame();
                            var469 = var3 + 1;
                            var469 = var3 * var469;
                            int var507 = var3 + 2;
                            var469 *= var507;
                            int var508 = var3 + 3;
                            var469 *= var508;
                            var469 &= 7;
                            if (var469 != 0) {
                                var2 |= 1301161472;
                                var2 ^= 340874223;
                                break label766;
                            }

                            var2 += -1186317528;
                            var2 += -858001958;
                            var2 += 1542569654;
                            var2 += 37717192;
                            var2 ^= 913156012;
                            var469 = var2 + 1;
                            var469 = var2 * var469;
                            int var509 = var2 + 2;
                            var469 *= var509;
                            int var510 = var2 + 3;
                            var469 *= var510;
                            var469 &= 7;
                            if (var469 != 0) {
                                break label767;
                            }

                            boolean var450 = var449.inWorld();
                            if (var450) {
                                var2 = switch (var2) {
                                    case -1452011190 -> var2 ^ 683566102;
                                    default -> var2 ^ -1542276826;
                                    case 128986236 -> {
                                        var2 += 1158286761;
                                        var2 += 743585126;
                                        yield var2 ^ 1035471116;
                                    }
                                };
                                int var451 = var2 + 1;
                                int var452 = var2 * var451;
                                var469 = var2 + 2;
                                int var453 = var452 * var469;
                                var469 = var2 + 3;
                                int var454 = var453 * var469;
                                int var455 = var454 & 7;
                                if (var455 != 0) {
                                    break label767;
                                }

                                FrameContext var456 = var1.frame();
                                float var457 = var456.dt();
                                float var482 = this.E;
                                NumberSetting var511 = this.Z;
                                float var512 = var511.WM();
                                float var513 = var457 * var512;
                                float var483 = var482 + var513;
                                float var484 = var483 % 3600.0F;
                                this.E = var484;
                                float var485 = this.r;
                                float var486 = var485 + var457;
                                float var487 = Math.min(var486, 1000.0F);
                                int var514 = var3 + 1;
                                int var515 = var3 * var514;
                                int var516 = var515 & 1;
                                if (var516 != 0) {
                                    switch (var2) {
                                        case -888532304:
                                            var2 ^= -1376697688;
                                            break label766;
                                        case 1152673415:
                                            var2 ^= 364700080;
                                            var2 -= -418021725;
                                            var2 ^= 808215595;
                                            break label766;
                                        case 1455560321:
                                        default:
                                            var2 ^= -276292496;
                                            break label766;
                                    }
                                }

                                var2 -= -1442517053;
                                var2 ^= 1910773395;
                                var2 ^= 1913931107;
                                var6 = var2;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                long var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var1012;
                                int var520 = (var1012 = var6 - 0L) == 0L ? 0 : (var1012 < 0L ? -1 : 1);
                                if (var520 != 0) {
                                    break label767;
                                }

                                this.r = var487;
                                  int var488 = i_2.q() ? 1 : 0;
                                if (var488 != 0) {
                                    var2 *= -173703713;
                                    var2 += -961049938;
                                    var2 ^= -1008659287;
                                      var488 = deatheffect.VC() ? 1 : 0;
                                    var6 = var3;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var1013;
                                    int var524 = (var1013 = var6 - 0L) == 0L ? 0 : (var1013 < 0L ? -1 : 1);
                                    if (var524 != 0) {
                                        switch (var2) {
                                            case -2006211558:
                                                var2 ^= 754577051;
                                                break label766;
                                            case 428960549:
                                            default:
                                                var2 ^= -449714822;
                                                break label766;
                                            case 1470513747:
                                                var2 >>>= 29;
                                                var2 *= -1791831095;
                                                var2 |= 820506758;
                                                var2 ^= 1664654121;
                                                break label766;
                                        }
                                    }

                                    var2 ^= -530780193;
                                    var2 ^= -1632117209;
                                    var6 = var2;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var6 = var8 & 1L;
                                    long var1014;
                                    int var527 = (var1014 = var6 - 0L) == 0L ? 0 : (var1014 < 0L ? -1 : 1);
                                    if (var527 != 0) {
                                        break label767;
                                    }

                                    if (var488 == 0) {
                                        var2 = switch (var2) {
                                            default -> var2 ^ 1881222585;
                                            case -1849804419 -> var2 ^ -425603189;
                                            case 692941739 -> {
                                                var2 -= 1910977022;
                                                var2 -= -1941543100;
                                                var2 >>>= 22;
                                                var2 -= 2064188400;
                                                yield var2 ^ 1656399495;
                                            }
                                        };
                                        FrameContext var490 = var1.frame();
                                        float var491 = var490.partialTick();
                                        int var528 = var2 - -1385570512;
                                        int var529 = var528 ^ -826390914;
                                        float var492 = this.U(var491, var529);
                                        XF var530 = this.oW;
                                        var530.H(var492);
                                        XF var493 = this.oW;
                                        float var494 = var493.N(var457);
                                        NumberSetting var531 = this.vP;
                                        float var532 = var531.WM();
                                        float var495 = var494 * var532;
                                        int var533 = var3 + 1;
                                        int var534 = var3 * var533;
                                        int var535 = var534 & 1;
                                        if (var535 == 0) {
                                            var2 ^= 469881863;
                                            var2 *= -1410339577;
                                            var2 *= -1621149021;
                                            var2 ^= -1484904549;
                                            var6 = var2;
                                            var8 = var6 + 1L;
                                            var8 = var6 * var8;
                                            var6 = var8 & 1L;
                                            long var1015;
                                            int var538 = (var1015 = var6 - 0L) == 0L ? 0 : (var1015 < 0L ? -1 : 1);
                                            if (var538 != 0) {
                                                break label767;
                                            }

                                            label697: {
                                                Entity var539 = i_2.aM();
                                                var550 = this.kr;
                                                BooleanSetting var581 = this.P;
                                                boolean var582 = var581.vb();
                                                if (var582) {
                                                    var2 -= -286749264;
                                                    var2 |= -1055397285;
                                                    var2 |= -2008467596;
                                                    var2 ^= 411901410;
                                                    boolean var583 = var539 instanceof LivingEntity;
                                                    Integer var606 = var3;
                                                    if (var606 == null) {
                                                        var2 &= -266281325;
                                                        var2 ^= -1174426066;
                                                        break label766;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -1844785698 -> var2 ^ -614506742;
                                                        case -479010147 -> {
                                                            var2 |= 2019524775;
                                                            var2 ^= -1520494695;
                                                            var2 += -500561683;
                                                            var2 >>>= 13;
                                                            yield var2 ^ 1568358776;
                                                        }
                                                        default -> var2 ^ 424078651;
                                                    };
                                                    int var607 = var2 + 1;
                                                    int var608 = var2 * var607;
                                                    int var609 = var608 & 1;
                                                    if (var609 != 0) {
                                                        break label767;
                                                    }

                                                    if (var583) {
                                                        var2 ^= 10394156;
                                                        var2 ^= 935569545;
                                                        var2 &= 620095805;
                                                        var2 *= 785305529;
                                                        var2 ^= -940366319;
                                                        int var584 = var2 + 1;
                                                        int var585 = var2 * var584;
                                                        int var610 = var2 + 2;
                                                        int var586 = var585 * var610;
                                                        int var611 = var2 + 3;
                                                        int var587 = var586 * var611;
                                                        int var588 = var587 & 7;
                                                        if (var588 != 0) {
                                                            break label767;
                                                        }

                                                        LivingEntity var540 = (LivingEntity)var539;
                                                        int var589 = var3 + 1;
                                                        int var590 = var3 * var589;
                                                        int var612 = var3 + 2;
                                                        int var591 = var590 * var612;
                                                        int var613 = var3 + 3;
                                                        int var592 = var591 * var613;
                                                        int var593 = var592 & 7;
                                                        if (var593 != 0) {
                                                            switch (var2) {
                                                                case -945873081:
                                                                    var2 ^= 1970402013;
                                                                    break label766;
                                                                case -318741864:
                                                                default:
                                                                    var2 ^= 1965020059;
                                                                    break label766;
                                                                case -287526695:
                                                                    var2 -= 94582592;
                                                                    var2 &= 268636136;
                                                                    var2 >>>= 15;
                                                                    var2 ^= 1507814589;
                                                                    break label766;
                                                            }
                                                        }

                                                        var2 >>= 20;
                                                        var2 |= -1455257329;
                                                        var2 &= -1545828770;
                                                        var2 ^= -221915696;
                                                        int var594 = var2 + 1;
                                                        int var595 = var2 * var594;
                                                        int var614 = var2 + 2;
                                                        int var596 = var595 * var614;
                                                        int var615 = var2 + 3;
                                                        int var597 = var596 * var615;
                                                        int var598 = var597 & 7;
                                                        if (var598 != 0) {
                                                            break label767;
                                                        }

                                                        boolean var541 = var540.isAlive();
                                                        if (var541) {
                                                            var2 += -1078441576;
                                                            var2 &= 1594672470;
                                                            var2 &= -295007872;
                                                            var2 >>>= 7;
                                                            var2 ^= 794552617;
                                                            Integer var542 = var2;
                                                            if (var542 == null) {
                                                                break label767;
                                                            }

                                                            var543 = 1.0F;
                                                            var2 <<= 31;
                                                            var2 ^= 487992415;
                                                            var2 ^= -2088161880;
                                                            break label697;
                                                        }

                                                        var2 ^= 1231662055;
                                                        var2 ^= -1396366080;
                                                    } else {
                                                        var2 |= 877318555;
                                                        var2 += -1667232954;
                                                        var2 <<= 25;
                                                        var2 ^= -1095377543;
                                                    }
                                                } else {
                                                    switch (var2) {
                                                        case -924602773:
                                                            var2 ^= -284905184;
                                                            break;
                                                        case -188877219:
                                                        default:
                                                            var2 ^= 1102319667;
                                                            break;
                                                        case 1788877559:
                                                            var2 |= 399168163;
                                                            var2 ^= -882964594;
                                                    }
                                                }

                                                var543 = 0.0F;
                                                switch (var2) {
                                                    case -1263149703:
                                                        var2 ^= 963031804;
                                                        var2 ^= -2097346932;
                                                        var2 *= 1767735383;
                                                        var2 ^= 672150520;
                                                        break;
                                                    case 519050649:
                                                    default:
                                                        var2 ^= 518025985;
                                                        break;
                                                    case 1129021961:
                                                        var2 ^= 2025196125;
                                                }
                                            }

                                            var550.H(var543);
                                            ColorSetting var544 = this.bC;
                                            int var545 = var544.zz();
                                            ColorSetting var551 = this.pW;
                                            int var552 = var551.zz();
                                            XF var599 = this.kr;
                                            float var600 = var599.N(var457);
                                            int var546 = DP.Z(var545, var552, var600);
                                            int var553 = var2 & -147015955;
                                            int var554 = var553 ^ -1003367462;
                                            float var555 = this.d(var554);
                                            float var601 = 0.0F;
                                            float var616 = 0.0F;
                                            int var620 = var3 + 1;
                                            int var621 = var3 * var620;
                                            int var622 = var621 & 1;
                                            if (var622 != 0) {
                                                var2 |= -42570675;
                                                var2 -= 1965597607;
                                                var2 ^= -754342169;
                                                break label766;
                                            }

                                            var2 &= -1418756159;
                                            var2 ^= -974434259;
                                            var2 &= 1054752036;
                                            var2 += 165593068;
                                            var2 ^= 1809878466;
                                            int var623 = var2 + 1;
                                            int var624 = var2 * var623;
                                            int var11 = var2 + 2;
                                            int var625 = var624 * var11;
                                            var11 = var2 + 3;
                                            int var626 = var625 * var11;
                                            int var627 = var626 & 7;
                                            if (var627 != 0) {
                                                break label767;
                                            }

                                            label801: {
                                                P var628 = this.FS;
                                                if (var628 != null) {
                                                    var2 *= -120046703;
                                                    var2 += 1108592012;
                                                    var2 <<= 16;
                                                    var2 ^= 997759287;
                                                    Integer var629 = var2;
                                                    if (var629 == null) {
                                                        break label767;
                                                    }

                                                    float var630 = this.r;
                                                    var11 = var3 + 1;
                                                    var11 = var3 * var11;
                                                    var11 &= 1;
                                                    if (var11 != 0) {
                                                        var2 >>>= 24;
                                                        var2 *= -1808969393;
                                                        var2 >>>= 25;
                                                        var2 ^= 1507814594;
                                                        break label766;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -2146495259 -> var2 ^ -765734578;
                                                        case -2063165129 -> {
                                                            var2 >>>= 29;
                                                            var2 *= -2078391753;
                                                            var2 |= -474578607;
                                                            var2 ^= 2115076981;
                                                            yield var2 ^ 184445759;
                                                        }
                                                        default -> var2 ^ -1900786677;
                                                    };
                                                    float var1016;
                                                    int var631 = (var1016 = var630 - var555) == 0.0F ? 0 : (var1016 < 0.0F ? -1 : 1);
                                                    if (var631 < 0) {
                                                        var2 *= -1192186257;
                                                        var2 |= 851382273;
                                                        var2 -= -8241281;
                                                        var2 += -233160493;
                                                        var2 ^= 39348794;
                                                        int var632 = var2 + 1;
                                                        int var633 = var2 * var632;
                                                        var11 = var2 + 2;
                                                        int var634 = var633 * var11;
                                                        var11 = var2 + 3;
                                                        int var635 = var634 * var11;
                                                        int var636 = var635 & 7;
                                                        if (var636 != 0) {
                                                            break label767;
                                                        }

                                                        ModeSetting var637 = this.y;
                                                        Integer var664 = var3;
                                                        if (var664 == null) {
                                                            var2 ^= -110296926;
                                                            var2 ^= -1005863594;
                                                            var2 ^= -864663364;
                                                            break label766;
                                                        }

                                                        var2 |= -2145726081;
                                                        var2 ^= -119543652;
                                                        int var665 = var2 + 1;
                                                        var665 = var2 * var665;
                                                        var665 &= 1;
                                                        if (var665 != 0) {
                                                            break label767;
                                                        }

                                                        label803: {
                                                            Enum var638 = var637.A();
                                                            u_2 var639 = (u_2)var638;
                                                            int var640 = var639.ordinal();
                                                            switch (var640) {
                                                                case 0:
                                                                    var2 |= -643501662;
                                                                    var2 += 1601643266;
                                                                    var2 *= 1256249981;
                                                                    var2 &= -1342294952;
                                                                    var2 ^= 815622190;
                                                                    break;
                                                                case 1:
                                                                    var2 <<= 7;
                                                                    var2 ^= -805169586;
                                                                    var2 -= -960972860;
                                                                    var2 <<= 14;
                                                                    var2 ^= 1249893502;
                                                                    break;
                                                                case 2:
                                                                    var2 *= -1945686869;
                                                                    var2 &= -650969427;
                                                                    var2 ^= 428307371;
                                                                    Integer var641 = var2;
                                                                    if (var641 == null) {
                                                                        break label767;
                                                                    }

                                                                    var642 = 1.0F;
                                                                    var2 += -864701654;
                                                                    var2 |= -1882823920;
                                                                    var2 ^= 2034986026;
                                                                    break label803;
                                                                default:
                                                                    var2 -= 1078741322;
                                                                    var2 ^= 1916600037;
                                                                    long var12 = var2;
                                                                    long var14 = var12 + 1L;
                                                                    var14 = var12 * var14;
                                                                    var12 = var14 & 1L;
                                                                    long var1041;
                                                                    int var716 = (var1041 = var12 - 0L) == 0L ? 0 : (var1041 < 0L ? -1 : 1);
                                                                    if (var716 == 0) {
                                                                        MatchException var717 = new MatchException(null, null);
                                                                        throw var717;
                                                                    }
                                                                    break label767;
                                                            }

                                                            float var668 = this.r;
                                                            float var669 = var668 / 0.04F;
                                                            float var670 = TP.S(var669);
                                                            float var718 = this.r;
                                                            float var556 = var555 - var718;
                                                            int var719 = var3 + 1;
                                                            int var720 = var3 * var719;
                                                            int var13 = var3 + 2;
                                                            int var721 = var720 * var13;
                                                            var13 = var3 + 3;
                                                            int var722 = var721 * var13;
                                                            int var723 = var722 & 7;
                                                            if (var723 != 0) {
                                                                switch (var2) {
                                                                    case 914185342:
                                                                        var2 *= 386025471;
                                                                        var2 += -817689235;
                                                                        var2 ^= -1139127216;
                                                                        break label766;
                                                                    case 1866927087:
                                                                    default:
                                                                        var2 ^= -1528035575;
                                                                        break label766;
                                                                    case 2132501887:
                                                                        var2 ^= -1081125775;
                                                                        break label766;
                                                                }
                                                            }
                                                            var2 = switch (var2) {
                                                                case -36011897 -> var2 ^ -1061794453;
                                                                case 914185342 -> {
                                                                    var2 *= -573503197;
                                                                    var2 *= 282152517;
                                                                    yield var2 ^ -140051077;
                                                                }
                                                                default -> var2 ^ 1836384329;
                                                            };
                                                            int var724 = var2 + 1;
                                                            int var725 = var2 * var724;
                                                            var13 = var2 + 2;
                                                            int var726 = var725 * var13;
                                                            var13 = var2 + 3;
                                                            int var727 = var726 * var13;
                                                            int var728 = var727 & 7;
                                                            if (var728 != 0) {
                                                                break label767;
                                                            }

                                                            float var557 = var556 / 0.12F;
                                                            float var558 = TP.S(var557);
                                                            float var559 = Math.min(var670, var558);
                                                            var642 = var559;
                                                            var2 ^= 166431260;
                                                            var2 ^= 583902811;
                                                        }

                                                        long var671 = var2;
                                                        long var756 = var671 + 1L;
                                                        var756 = var671 * var756;
                                                        long var672 = var756 & 1L;
                                                        long var1017;
                                                        int var560 = (var1017 = var672 - 0L) == 0L ? 0 : (var1017 < 0L ? -1 : 1);
                                                        if (var560 != 0) {
                                                            break label767;
                                                        }

                                                        ModeSetting var643 = this.y;
                                                        var665 = var3 + 1;
                                                        var665 = var3 * var665;
                                                        int var729 = var3 + 2;
                                                        var665 *= var729;
                                                        var729 = var3 + 3;
                                                        var665 *= var729;
                                                        var665 &= 7;
                                                        if (var665 != 0) {
                                                            var2 ^= 1816833319;
                                                            var2 ^= -753808890;
                                                            break label766;
                                                        }

                                                        var2 *= 1712766495;
                                                        var2 &= -2103518196;
                                                        var2 ^= -378475872;
                                                        u_2 var678 = u_2.POP;
                                                        boolean var644 = var643.TJ(var678);
                                                        float var652;
                                                        if (var644) {
                                                            var2 ^= -944465592;
                                                            var2 |= -1334507261;
                                                            var2 <<= 23;
                                                            var2 += -671516443;
                                                            var2 ^= 131475318;
                                                            float var645 = this.r;
                                                            float var646 = -var645;
                                                            float var647 = var646 * 14.0F;
                                                            double var648 = var647;
                                                            double var649 = Math.exp(var648);
                                                            float var650 = (float)var649;
                                                            float var651 = 0.35F * var650;
                                                            long var679 = var3;
                                                            var756 = var679 + 1L;
                                                            var756 = var679 * var756;
                                                            long var15 = var679 + 2L;
                                                            var756 *= var15;
                                                            long var680 = var679 + 3L;
                                                            var756 *= var680;
                                                            long var681 = var756 & 7L;
                                                            long var1018;
                                                            var665 = (var1018 = var681 - 0L) == 0L ? 0 : (var1018 < 0L ? -1 : 1);
                                                            if (var665 != 0) {
                                                                switch (var2) {
                                                                    case -1624549879:
                                                                    default:
                                                                        var2 ^= -218286670;
                                                                        break label766;
                                                                    case -894476397:
                                                                        var2 &= 1192143228;
                                                                        var2 *= 1013764401;
                                                                        var2 -= -1454280703;
                                                                        var2 >>= 21;
                                                                        var2 ^= 1507814563;
                                                                        break label766;
                                                                    case 2028265311:
                                                                        var2 ^= -440100386;
                                                                        break label766;
                                                                }
                                                            }

                                                            var2 &= 1347924242;
                                                            var2 ^= -1001852291;
                                                            var652 = var651;
                                                            var2 |= -1157619599;
                                                            var2 ^= 1575141438;
                                                            var2 ^= -568414682;
                                                        } else {
                                                            var2 = switch (var2) {
                                                                default -> var2 ^ 1898813368;
                                                                case 266235226 -> var2 ^ -1003597137;
                                                                case 1801479840 -> {
                                                                    var2 += -243835394;
                                                                    var2 >>= 11;
                                                                    yield var2 ^ 1108684824;
                                                                }
                                                            };
                                                            long var683 = var2;
                                                            var756 = var683 + 1L;
                                                            var756 = var683 * var756;
                                                            long var684 = var756 & 1L;
                                                            long var1019;
                                                            var665 = (var1019 = var684 - 0L) == 0L ? 0 : (var1019 < 0L ? -1 : 1);
                                                            if (var665 != 0) {
                                                                break label767;
                                                            }

                                                            var652 = var616;
                                                            switch (var2) {
                                                                case 268177721:
                                                                    var2 ^= -563192934;
                                                                    break;
                                                                case 1109306080:
                                                                    var2 -= -3548806;
                                                                    var2 ^= 1586402141;
                                                                    var2 |= 1196942944;
                                                                    var2 <<= 19;
                                                                    var2 ^= 258706791;
                                                                    break;
                                                                case 1140507470:
                                                                default:
                                                                    var2 ^= -1905603372;
                                                            }
                                                        }

                                                        var665 = var2 + 1;
                                                        var665 = var2 * var665;
                                                        var729 = var2 + 2;
                                                        var665 *= var729;
                                                        var729 = var2 + 3;
                                                        var665 *= var729;
                                                        var665 &= 7;
                                                        if (var665 != 0) {
                                                            break label767;
                                                        }

                                                        NumberSetting var691 = this.Co;
                                                        float var692 = var691.WM();
                                                        float var733 = this.r;
                                                        float var734 = -var733;
                                                        float var735 = var734 * 10.0F;
                                                        double var736 = var735;
                                                        long var773 = var3;
                                                        long var16 = var773 + 1L;
                                                        var16 = var773 * var16;
                                                        long var18 = var773 + 2L;
                                                        var16 *= var18;
                                                        var773 += 3L;
                                                        var16 *= var773;
                                                        var773 = var16 & 7L;
                                                        long var1020;
                                                        int var776 = (var1020 = var773 - 0L) == 0L ? 0 : (var1020 < 0L ? -1 : 1);
                                                        if (var776 != 0) {
                                                            switch (var2) {
                                                                case -537300450:
                                                                default:
                                                                    var2 ^= -843867065;
                                                                    break label766;
                                                                case 1018400103:
                                                                    var2 *= 2061804685;
                                                                    var2 &= 621560259;
                                                                    var2 &= -1118160670;
                                                                    var2 += 952914174;
                                                                    var2 ^= 1260863;
                                                                    break label766;
                                                                case 1870225915:
                                                                    var2 ^= 346983282;
                                                                    break label766;
                                                            }
                                                        }

                                                        var2 -= -1647810676;
                                                        var2 ^= 1946223647;
                                                        var2 ^= 765161569;
                                                        double var737 = Math.exp(var736);
                                                        float var738 = (float)var737;
                                                        float var693 = var692 * var738;
                                                        float var694 = var495 + var693;
                                                        var695 = var694;
                                                        var562 = var642;
                                                        var653 = var652;
                                                        var2 |= 24715880;
                                                        var2 *= 1340936981;
                                                        var2 ^= 1160372840;
                                                        break label801;
                                                    }

                                                    switch (var2) {
                                                        case -2028969577:
                                                            var2 -= 249906960;
                                                            var2 ^= -1298106979;
                                                            var2 >>= 14;
                                                            var2 ^= 1644922511;
                                                            break;
                                                        case -1784732219:
                                                        default:
                                                            var2 ^= 935824642;
                                                            break;
                                                        case -739528128:
                                                            var2 ^= 1245257703;
                                                    }
                                                } else {
                                                    var2 -= -1121931821;
                                                    var2 ^= 735380061;
                                                }

                                                int var739 = var2 + 1;
                                                var739 = var2 * var739;
                                                var739 &= 1;
                                                if (var739 != 0) {
                                                    break label767;
                                                }

                                                this.FS = null;
                                                var695 = var495;
                                                long var742 = var3;
                                                long var777 = var742 + 1L;
                                                var777 = var742 * var777;
                                                long var883 = var742 + 2L;
                                                var777 *= var883;
                                                long var743 = var742 + 3L;
                                                var777 *= var743;
                                                long var744 = var777 & 7L;
                                                long var1021;
                                                var488 = (var1021 = var744 - 0L) == 0L ? 0 : (var1021 < 0L ? -1 : 1);
                                                if (var488 != 0) {
                                                    var2 *= -1907221455;
                                                    var2 ^= 2135273405;
                                                    break label766;
                                                }
                                                var2 = switch (var2) {
                                                    case -1644909406 -> {
                                                        var2 |= -1915652258;
                                                        yield var2 ^ -581606523;
                                                    }
                                                    default -> var2 ^ 617760862;
                                                    case 1560131833 -> var2 ^ 544944960;
                                                };
                                                long var745 = var2;
                                                var777 = var745 + 1L;
                                                var777 = var745 * var777;
                                                long var746 = var777 & 1L;
                                                long var1022;
                                                var488 = (var1022 = var746 - 0L) == 0L ? 0 : (var1022 < 0L ? -1 : 1);
                                                if (var488 != 0) {
                                                    break label767;
                                                }

                                                var562 = var601;
                                                var653 = var616;
                                                var2 ^= -408396373;
                                                var2 *= -16394491;
                                                var2 |= -2076506957;
                                                var2 ^= 132679338;
                                            }

                                            var488 = var2 + 1;
                                            var488 = var2 * var488;
                                            int var602 = var2 + 2;
                                            var488 *= var602;
                                            int var603 = var2 + 3;
                                            var488 *= var603;
                                            var488 &= 7;
                                            if (var488 != 0) {
                                                break label767;
                                            }

                                            Canvas var503 = var1.canvas();
                                            float var604 = var503.width();
                                            float var605 = var604 * 0.5F;
                                            float var617 = var503.height();
                                            Integer var747 = var3;
                                            if (var747 != null) {
                                                var2 = switch (var2) {
                                                    case -1865155815 -> {
                                                        var2 ^= -1020514880;
                                                        var2 ^= 1014930216;
                                                        var2 += 376448304;
                                                        var2 |= -909626671;
                                                        yield var2 ^ -1749366535;
                                                    }
                                                    default -> var2 ^ 1927523405;
                                                    case 1587822352 -> var2 ^ 1286574728;
                                                };
                                                long var748 = var2;
                                                long var783 = var748 + 1L;
                                                var783 = var748 * var783;
                                                long var749 = var783 & 1L;
                                                long var1023;
                                                int var750 = (var1023 = var749 - 0L) == 0L ? 0 : (var1023 < 0L ? -1 : 1);
                                                if (var750 != 0) {
                                                    break label767;
                                                }

                                                float var618 = var617 * 0.5F;
                                                NumberSetting var751 = this.T;
                                                float var752 = var751.WM();
                                                BooleanSetting var764 = this.C;
                                                boolean var765 = var764.vb();
                                                int var769;
                                                if (var765) {
                                                    var2 |= 1544114462;
                                                    var2 <<= 29;
                                                    var2 &= 1577993528;
                                                    var2 ^= -725476218;
                                                    Integer var766 = var2;
                                                    if (var766 == null) {
                                                        break label767;
                                                    }

                                                    ColorSetting var767 = this.o;
                                                    int var768 = var767.zz();
                                                    var783 = var3;
                                                    long var884 = var783 + 1L;
                                                    var884 = var783 * var884;
                                                    var783 = var884 & 1L;
                                                    long var1024;
                                                    int var787 = (var1024 = var783 - 0L) == 0L ? 0 : (var1024 < 0L ? -1 : 1);
                                                    if (var787 != 0) {
                                                        switch (var2) {
                                                            case -1799218042:
                                                                var2 *= 717753923;
                                                                var2 ^= 36465424;
                                                                var2 &= 1085409904;
                                                                var2 -= 1981137035;
                                                                var2 ^= -1814735926;
                                                                break label766;
                                                            case -1671994158:
                                                            default:
                                                                var2 ^= 1941595346;
                                                                break label766;
                                                            case 110960719:
                                                                var2 ^= 1357394917;
                                                                break label766;
                                                        }
                                                    }
                                                    var2 = switch (var2) {
                                                        case -1799218042 -> {
                                                            var2 &= 1552854684;
                                                            yield var2 ^ -1980933486;
                                                        }
                                                        case -1423886870 -> var2 ^ 1198936238;
                                                        default -> var2 ^ -1738086678;
                                                    };
                                                    var783 = var2;
                                                    var884 = var783 + 1L;
                                                    var884 = var783 * var884;
                                                    long var964 = var783 + 2L;
                                                    var884 *= var964;
                                                    var783 += 3L;
                                                    var884 *= var783;
                                                    var783 = var884 & 7L;
                                                    long var1025;
                                                    int var791 = (var1025 = var783 - 0L) == 0L ? 0 : (var1025 < 0L ? -1 : 1);
                                                    if (var791 != 0) {
                                                        break label767;
                                                    }

                                                    var769 = var768;
                                                    var2 ^= -1674031896;
                                                    var2 |= 1109993293;
                                                    var2 -= -1829148872;
                                                    var2 += -1065182450;
                                                    var2 ^= 203193075;
                                                } else {
                                                    var2 ^= -841185762;
                                                    var2 += -593436481;
                                                    var2 += 11518862;
                                                    var2 |= -201041418;
                                                    var2 ^= -2024321026;
                                                    var783 = var2;
                                                    long var890 = var783 + 1L;
                                                    var890 = var783 * var890;
                                                    long var965 = var783 + 2L;
                                                    var890 *= var965;
                                                    var783 += 3L;
                                                    var890 *= var783;
                                                    var783 = var890 & 7L;
                                                    long var1026;
                                                    int var795 = (var1026 = var783 - 0L) == 0L ? 0 : (var1026 < 0L ? -1 : 1);
                                                    if (var795 != 0) {
                                                        break label767;
                                                    }

                                                    var769 = 0;
                                                    switch (var2) {
                                                        case -1478305677:
                                                            var2 ^= -1289084401;
                                                            break;
                                                        case 629243125:
                                                        default:
                                                            var2 ^= -441009599;
                                                            break;
                                                        case 1941485065:
                                                            var2 += 239515155;
                                                            var2 ^= -51681990;
                                                    }
                                                }

                                                var783 = var2;
                                                long var894 = var783 + 1L;
                                                var894 = var783 * var894;
                                                long var966 = var783 + 2L;
                                                var894 *= var966;
                                                var783 += 3L;
                                                var894 *= var783;
                                                var783 = var894 & 7L;
                                                long var1027;
                                                int var799 = (var1027 = var783 - 0L) == 0L ? 0 : (var1027 < 0L ? -1 : 1);
                                                if (var799 != 0) {
                                                    break label767;
                                                }

                                                vw_2 var800 = this.SJ;
                                                BooleanSetting var841 = this.C;
                                                var894 = var3;
                                                var966 = var894 + 1L;
                                                var966 = var894 * var966;
                                                var894 = var966 & 1L;
                                                long var1028;
                                                int var900 = (var1028 = var894 - 0L) == 0L ? 0 : (var1028 < 0L ? -1 : 1);
                                                if (var900 == 0) {
                                                    var2 = switch (var2) {
                                                        case -1428102667 -> var2 ^ -1703276920;
                                                        default -> var2 ^ 1194687173;
                                                        case 2098465062 -> {
                                                            var2 += 1962238730;
                                                            var2 *= -1968931927;
                                                            var2 |= -44506380;
                                                            var2 *= -2131553617;
                                                            yield var2 ^ 861509110;
                                                        }
                                                    };
                                                    int var901 = var2 + 1;
                                                    int var902 = var2 * var901;
                                                    int var17 = var2 + 2;
                                                    int var903 = var902 * var17;
                                                    var17 = var2 + 3;
                                                    int var904 = var903 * var17;
                                                    int var905 = var904 & 7;
                                                    if (var905 != 0) {
                                                        break label767;
                                                    }

                                                    boolean var842 = var841.vb();
                                                    float var845;
                                                    if (var842) {
                                                        var2 += 574630706;
                                                        var2 ^= -2066603405;
                                                        var2 ^= -1442121448;
                                                        NumberSetting var843 = this.Ob;
                                                        Integer var906 = var3;
                                                        if (var906 == null) {
                                                            switch (var2) {
                                                                case -128783491:
                                                                    var2 ^= -1253191608;
                                                                    break label766;
                                                                case 334577969:
                                                                default:
                                                                    var2 ^= -734661377;
                                                                    break label766;
                                                                case 1104607751:
                                                                    var2 -= 520893939;
                                                                    var2 ^= 2065017003;
                                                                    break label766;
                                                            }
                                                        }

                                                        var2 -= -656730436;
                                                        var2 += 1011015105;
                                                        var2 ^= -346165246;
                                                        int var907 = var2 + 1;
                                                        int var908 = var2 * var907;
                                                        int var909 = var908 & 1;
                                                        if (var909 != 0) {
                                                            break label767;
                                                        }

                                                        float var844 = var843.WM();
                                                        var845 = var844;
                                                        var2 &= -809831104;
                                                        var2 ^= 112922644;
                                                    } else {
                                                        var2 <<= 30;
                                                        var2 >>>= 22;
                                                        var2 ^= 215198062;
                                                        var2 ^= 1184826628;
                                                        var845 = 0.0F;
                                                        var2 -= 1432489540;
                                                        var2 &= 838438323;
                                                        var2 ^= 2020712758;
                                                    }

                                                    var894 = var2;
                                                    var966 = var894 + 1L;
                                                    var966 = var894 * var966;
                                                    long var20 = var894 + 2L;
                                                    var966 *= var20;
                                                    var894 += 3L;
                                                    var966 *= var894;
                                                    var894 = var966 & 7L;
                                                    long var1029;
                                                    int var913 = (var1029 = var894 - 0L) == 0L ? 0 : (var1029 < 0L ? -1 : 1);
                                                    if (var913 != 0) {
                                                        break label767;
                                                    }

                                                    NumberSetting var914 = this.ED;
                                                    float var915 = var914.WM();
                                                    BooleanSetting var949 = this.R;
                                                    int var950 = (var949.vb()) ? 1 : 0;
                                                    vw_2 var801 = var800.c(var845, var915, (var950 != 0), true);
                                                    VA var802 = this.SS;
                                                    NumberSetting var846 = this.Cj;
                                                    float var847 = var846.WM();
                                                    NumberSetting var916 = this.t;
                                                    float var917 = var916.WM();
                                                    float var696 = var917 + var695;
                                                    NumberSetting var918 = this.dJ;
                                                    float var919 = var918.WM();
                                                    BooleanSetting var951 = this.XD;
                                                      var950 = var951.vb() ? 1 : 0;
                                                    float var973 = this.E;
                                                      VA var697 = var802.E(var847, var696, var919, (var950 != 0), var973);
                                                    var783 = var3;
                                                    var894 = var783 + 1L;
                                                    var894 = var783 * var894;
                                                    var783 = var894 & 1L;
                                                    long var1030;
                                                    var11 = (var1030 = var783 - 0L) == 0L ? 0 : (var1030 < 0L ? -1 : 1);
                                                    if (var11 != 0) {
                                                        switch (var2) {
                                                            case -980144126:
                                                                var2 ^= -751827473;
                                                                break label766;
                                                            case 1013690141:
                                                            default:
                                                                var2 ^= 1350095877;
                                                                break label766;
                                                            case 1217995028:
                                                                var2 += -429002472;
                                                                var2 *= -218349361;
                                                                var2 |= -1510471720;
                                                                var2 ^= -1104815261;
                                                        }
                                                    } else {
                                                        label618: {
                                                            var2 = switch (var2) {
                                                                default -> var2 ^ -1674871603;
                                                                case -1284958990 -> var2 ^ -1252846622;
                                                                case 1217995028 -> {
                                                                    var2 ^= -1302883165;
                                                                    var2 &= -1829321313;
                                                                    yield var2 ^ -1144525712;
                                                                }
                                                            };
                                                            P var699 = this.FS;
                                                            if (var699 != null) {
                                                                var2 += -221753156;
                                                                var2 -= 1929402882;
                                                                var2 |= 1749296414;
                                                                var2 >>>= 11;
                                                                var2 ^= -245926554;
                                                                var11 = var2 + 1;
                                                                var11 = var2 * var11;
                                                                var11 &= 1;
                                                                if (var11 != 0) {
                                                                    break label767;
                                                                }

                                                                P var703 = this.FS;
                                                                ModeSetting var704 = var703.jN;
                                                                int var805 = var3 + 1;
                                                                int var806 = var3 * var805;
                                                                int var807 = var806 & 1;
                                                                if (var807 != 0) {
                                                                    switch (var2) {
                                                                        case -2060377962:
                                                                        default:
                                                                            var2 ^= -1522354470;
                                                                            break label766;
                                                                        case -650920667:
                                                                            var2 ^= 1389644102;
                                                                            break label766;
                                                                        case -246780726:
                                                                            var2 &= 965752029;
                                                                            var2 *= -811218961;
                                                                            var2 += -588194834;
                                                                            var2 ^= -1425288713;
                                                                            var2 ^= -683272210;
                                                                            break label766;
                                                                    }
                                                                }

                                                                var2 >>>= 20;
                                                                var2 |= -1829124061;
                                                                var2 ^= 1012581301;
                                                                var2 ^= 962324327;
                                                                kP_2 var808 = kP_2.SAME;
                                                                boolean var705 = var704.TJ(var808);
                                                                if (!var705) {
                                                                    var2 = switch (var2) {
                                                                        case -1745294363 -> {
                                                                            var2 ^= -1032029616;
                                                                            var2 += -1289209391;
                                                                            var2 ^= 531647061;
                                                                            var2 |= 959236862;
                                                                            yield var2 ^ -1461157911;
                                                                        }
                                                                        case 1819318068 -> var2 ^ 1818593999;
                                                                        default -> var2 ^ -339446629;
                                                                    };
                                                                    Integer var706 = var2;
                                                                    if (var706 == null) {
                                                                        break label767;
                                                                    }

                                                                    var707 = false;
                                                                    var2 *= 295244177;
                                                                    var2 -= 1070693029;
                                                                    var2 ^= 1053943255;
                                                                    break label618;
                                                                }

                                                                switch (var2) {
                                                                    case -1745294363:
                                                                        var2 += 26988727;
                                                                        var2 >>= 27;
                                                                        var2 ^= 312529075;
                                                                        break;
                                                                    case -918838571:
                                                                    default:
                                                                        var2 ^= 507042623;
                                                                        break;
                                                                    case 1845065611:
                                                                        var2 ^= -1331859479;
                                                                }
                                                            } else {
                                                                var2 += 656658025;
                                                                var2 &= -199063920;
                                                                var2 &= 1201516614;
                                                                var2 >>= 24;
                                                                var2 ^= -312529152;
                                                            }

                                                            var707 = true;
                                                            var2 >>>= 5;
                                                            var2 |= 1657938730;
                                                            var2 *= 785629231;
                                                            var2 ^= 1294972256;
                                                        }

                                                        int var809 = var2 + 1;
                                                        int var810 = var2 * var809;
                                                        int var848 = var2 + 2;
                                                        int var811 = var810 * var848;
                                                        int var849 = var2 + 3;
                                                        int var812 = var811 * var849;
                                                        int var813 = var812 & 7;
                                                        if (var813 != 0) {
                                                            break label767;
                                                        }

                                                        int var814 = var3 + 1;
                                                        int var815 = var3 * var814;
                                                        int var850 = var3 + 2;
                                                        int var816 = var815 * var850;
                                                        int var851 = var3 + 3;
                                                        int var817 = var816 * var851;
                                                        int var818 = var817 & 7;
                                                        if (var818 == 0) {
                                                            label606: {
                                                                var2 >>>= 25;
                                                                var2 -= -1102895618;
                                                                var2 *= 1453700371;
                                                                var2 ^= 421223296;
                                                                P var819 = this.FS;
                                                                if (var819 != null) {
                                                                    var2 ^= 1165384158;
                                                                    var2 ^= 766665899;
                                                                    if (var707) {
                                                                        var2 >>>= 18;
                                                                        var2 |= -235896326;
                                                                        var2 |= -571880145;
                                                                        var2 += 415538252;
                                                                        var2 ^= -994547092;
                                                                        int var820 = var2 + 1;
                                                                        int var821 = var2 * var820;
                                                                        int var852 = var2 + 2;
                                                                        int var822 = var821 * var852;
                                                                        int var853 = var2 + 3;
                                                                        int var823 = var822 * var853;
                                                                        int var824 = var823 & 7;
                                                                        if (var824 != 0) {
                                                                            break label767;
                                                                        }

                                                                        P var825 = this.FS;
                                                                        ColorSetting var826 = var825.Aj;
                                                                        int var827 = var826.zz();
                                                                        long var854 = var3;
                                                                        long var953 = var854 + 1L;
                                                                        long var954 = var854 * var953;
                                                                        long var19 = var854 + 2L;
                                                                        long var955 = var954 * var19;
                                                                        long var855 = var854 + 3L;
                                                                        long var956 = var955 * var855;
                                                                        long var856 = var956 & 7L;
                                                                        long var1031;
                                                                        int var857 = (var1031 = var856 - 0L) == 0L ? 0 : (var1031 < 0L ? -1 : 1);
                                                                        if (var857 != 0) {
                                                                            var2 -= -82263032;
                                                                            var2 |= 457667010;
                                                                            var2 ^= -2043666592;
                                                                            break label766;
                                                                        }

                                                                        var2 ^= -983778893;
                                                                        var2 &= 444016985;
                                                                        var2 >>= 11;
                                                                        var2 ^= 731669693;
                                                                        long var858 = var2;
                                                                        long var957 = var858 + 1L;
                                                                        long var958 = var858 * var957;
                                                                        long var859 = var958 & 1L;
                                                                        long var1032;
                                                                        int var860 = (var1032 = var859 - 0L) == 0L ? 0 : (var1032 < 0L ? -1 : 1);
                                                                        if (var860 != 0) {
                                                                            break label767;
                                                                        }

                                                                        int var828 = DP.Z(var546, var827, var562);
                                                                        var829 = var828;
                                                                        var2 >>= 27;
                                                                        var2 &= 401060511;
                                                                        var2 ^= -1058584709;
                                                                        break label606;
                                                                    }

                                                                    var2 -= 1225958042;
                                                                    var2 ^= -1871733203;
                                                                } else {
                                                                    var2 |= 267001392;
                                                                    var2 ^= 562450391;
                                                                    var2 += -1955930324;
                                                                    var2 ^= -262097038;
                                                                    var2 ^= 1544260227;
                                                                }

                                                                var829 = var546;
                                                                var2 ^= 50045393;
                                                                var2 -= -1692184638;
                                                                var2 |= 1637606188;
                                                                var2 ^= 758954001;
                                                            }

                                                            int var861 = var2 + 1;
                                                            int var862 = var2 * var861;
                                                            int var863 = var862 & 1;
                                                            if (var863 != 0) {
                                                                break label767;
                                                            }

                                                            int var864 = var3 + 1;
                                                            int var865 = var3 * var864;
                                                            int var922 = var3 + 2;
                                                            int var866 = var865 * var922;
                                                            int var923 = var3 + 3;
                                                            int var867 = var866 * var923;
                                                            int var868 = var867 & 7;
                                                            if (var868 != 0) {
                                                                var2 += 315650303;
                                                                var2 ^= -889024222;
                                                                var2 += 2083694057;
                                                                var2 <<= 26;
                                                                var2 ^= 2044685503;
                                                            } else {
                                                                var2 += 1679805447;
                                                                var2 &= 1698874728;
                                                                var2 ^= 129311262;
                                                                var2 <<= 24;
                                                                var2 ^= -1592141244;
                                                                int var869 = var2 + 1;
                                                                int var870 = var2 * var869;
                                                                int var924 = var2 + 2;
                                                                int var871 = var870 * var924;
                                                                int var925 = var2 + 3;
                                                                int var872 = var871 * var925;
                                                                int var873 = var872 & 7;
                                                                if (var873 != 0) {
                                                                    break label767;
                                                                }

                                                                float var876;
                                                                if (var707) {
                                                                    var2 |= -306386892;
                                                                    var2 >>>= 6;
                                                                    var2 ^= -441122521;
                                                                    var2 ^= -526744540;
                                                                    float var874 = 1.0F + var653;
                                                                    var894 = var3;
                                                                    var966 = var894 + 1L;
                                                                    var966 = var894 * var966;
                                                                    var20 = var894 + 2L;
                                                                    var966 *= var20;
                                                                    var894 += 3L;
                                                                    var966 *= var894;
                                                                    var894 = var966 & 7L;
                                                                    long var1033;
                                                                    int var929 = (var1033 = var894 - 0L) == 0L ? 0 : (var1033 < 0L ? -1 : 1);
                                                                    if (var929 != 0) {
                                                                        var2 &= -118627503;
                                                                        var2 <<= 14;
                                                                        var2 ^= 21982399;
                                                                        break label766;
                                                                    }

                                                                    var2 += 2129650487;
                                                                    var2 ^= 1279433521;
                                                                    int var930 = var2 + 1;
                                                                    int var931 = var2 * var930;
                                                                    int var932 = var931 & 1;
                                                                    if (var932 != 0) {
                                                                        break label767;
                                                                    }

                                                                    float var875 = var752 * var874;
                                                                    var876 = var875;
                                                                    switch (var2) {
                                                                        case -1221200580:
                                                                        default:
                                                                            var2 ^= 1302529173;
                                                                            break;
                                                                        case -914109168:
                                                                            var2 &= 121313610;
                                                                            var2 -= 969114423;
                                                                            var2 ^= -415414246;
                                                                            break;
                                                                        case 1320851125:
                                                                            var2 ^= -270437599;
                                                                    }
                                                                } else {
                                                                    var2 ^= 1321699840;
                                                                    var2 ^= 1678673724;
                                                                    var2 |= -1133183864;
                                                                    var2 ^= -215036215;
                                                                    var876 = var752;
                                                                    switch (var2) {
                                                                        case 1322922289:
                                                                            var2 >>>= 25;
                                                                            var2 ^= 537054708;
                                                                            break;
                                                                        case 1413557182:
                                                                            var2 ^= -896794710;
                                                                            break;
                                                                        case 1550924123:
                                                                        default:
                                                                            var2 ^= 1219276377;
                                                                    }
                                                                }

                                                                var894 = var2;
                                                                var966 = var894 + 1L;
                                                                var966 = var894 * var966;
                                                                var20 = var894 + 2L;
                                                                var966 *= var20;
                                                                var894 += 3L;
                                                                var966 *= var894;
                                                                var894 = var966 & 7L;
                                                                long var1034;
                                                                int var936 = (var1034 = var894 - 0L) == 0L ? 0 : (var1034 < 0L ? -1 : 1);
                                                                if (var936 != 0) {
                                                                    break label767;
                                                                }

                                                                ModeSetting var937 = this.oL;
                                                                Enum var938 = var937.A();
                                                                kP_2 var939 = (kP_2)var938;
                                                                ActionSetting var959 = this.a;
                                                                ColorSetting var982 = this.B;
                                                                int var985 = var3 + 1;
                                                                var985 = var3 * var985;
                                                                var985 &= 1;
                                                                if (var985 == 0) {
                                                                    var2 >>>= 13;
                                                                    var2 &= 1172990654;
                                                                    var2 |= 1168345005;
                                                                    var2 <<= 6;
                                                                    var2 ^= -1553399829;
                                                                    var985 = var2 + 1;
                                                                    var985 = var2 * var985;
                                                                    var985 &= 1;
                                                                    if (var985 != 0) {
                                                                        break label767;
                                                                    }

                                                                    int var983 = var982.zz();
                                                                    float var994;
                                                                    if (var707) {
                                                                        var2 -= 806742457;
                                                                        var2 ^= 1105745509;
                                                                        var985 = var2 + 1;
                                                                        var985 = var2 * var985;
                                                                        var985 &= 1;
                                                                        if (var985 != 0) {
                                                                            break label767;
                                                                        }

                                                                        var994 = 1.0F;
                                                                        var2 |= 1358054595;
                                                                        var2 ^= 1453125019;
                                                                    } else {
                                                                        var2 -= -1641043873;
                                                                        var2 ^= -593352853;
                                                                        float var997 = 1.0F - var562;
                                                                        long var21 = var3;
                                                                        long var23 = var21 + 1L;
                                                                        var23 = var21 * var23;
                                                                        var21 = var23 & 1L;
                                                                        long var1035;
                                                                        int var1003 = (var1035 = var21 - 0L) == 0L ? 0 : (var1035 < 0L ? -1 : 1);
                                                                        if (var1003 != 0) {
                                                                            var2 *= -76073043;
                                                                            var2 ^= 361751222;
                                                                            var2 ^= 2039762;
                                                                            break label766;
                                                                        }

                                                                        var2 -= 924834611;
                                                                        var2 ^= 2065404426;
                                                                        var21 = var2;
                                                                        var23 = var21 + 1L;
                                                                        var23 = var21 * var23;
                                                                        var21 = var23 & 1L;
                                                                        long var1036;
                                                                        int var1006 = (var1036 = var21 - 0L) == 0L ? 0 : (var1036 < 0L ? -1 : 1);
                                                                        if (var1006 != 0) {
                                                                            break label767;
                                                                        }

                                                                        var994 = var997;
                                                                        var2 += 1730551409;
                                                                        var2 *= 971339867;
                                                                        var2 >>>= 6;
                                                                        var2 -= 1562035437;
                                                                        var2 ^= 701072174;
                                                                    }

                                                                    int var998 = var2 - 1688180435;
                                                                    int var999 = var998 | -1332868725;
                                                                    int var1000 = var999 | 1801049946;
                                                                    int var1001 = var1000 ^ 1453429921;
                                                                    this.Fr(
                                                                        var503, var939, var959, var605, var618, var876, var829, var983, var769, var994, var1001
                                                                    );
                                                                    var783 = var3;
                                                                    var894 = var783 + 1L;
                                                                    var894 = var783 * var894;
                                                                    var966 = var783 + 2L;
                                                                    var894 *= var966;
                                                                    var783 += 3L;
                                                                    var894 *= var783;
                                                                    var783 = var894 & 7L;
                                                                    long var1037;
                                                                    int var833 = (var1037 = var783 - 0L) == 0L ? 0 : (var1037 < 0L ? -1 : 1);
                                                                    if (var833 != 0) {
                                                                        var2 |= 1810635589;
                                                                        var2 >>= 20;
                                                                        var2 ^= 1325216896;
                                                                        var2 += -380808915;
                                                                        var2 ^= -1014008044;
                                                                    } else {
                                                                        var2 >>>= 14;
                                                                        var2 *= -1676362687;
                                                                        var2 ^= 686678897;
                                                                        Integer var834 = var2;
                                                                        if (var834 == null) {
                                                                            break label767;
                                                                        }

                                                                        if (!var707) {
                                                                            var2 -= -213540475;
                                                                            var2 ^= -1442463315;
                                                                            var11 = var2 + 1;
                                                                            var11 = var2 * var11;
                                                                            var11 &= 1;
                                                                            if (var11 != 0) {
                                                                                break label767;
                                                                            }

                                                                            P var711 = this.FS;
                                                                            ModeSetting var712 = var711.jN;
                                                                            Integer var835 = var3;
                                                                            if (var835 == null) {
                                                                                var2 += -2103817146;
                                                                                var2 >>= 30;
                                                                                var2 ^= -1507814592;
                                                                                break label766;
                                                                            }

                                                                            var2 &= -1431587080;
                                                                            var2 += -1483540428;
                                                                            var2 += -2030256701;
                                                                            var2 ^= 591660679;
                                                                            var783 = var2;
                                                                            var894 = var783 + 1L;
                                                                            var894 = var783 * var894;
                                                                            var783 = var894 & 1L;
                                                                            long var1038;
                                                                            int var838 = (var1038 = var783 - 0L) == 0L ? 0 : (var1038 < 0L ? -1 : 1);
                                                                            if (var838 != 0) {
                                                                                break label767;
                                                                            }

                                                                            Enum var713 = var712.A();
                                                                            kP_2 var714 = (kP_2)var713;
                                                                            P var839 = this.FS;
                                                                            ActionSetting var840 = var839.Oq;
                                                                            float var655 = var752 * ++var653;
                                                                            P var877 = this.FS;
                                                                            ColorSetting var878 = var877.Aj;
                                                                            int var879 = var878.zz();
                                                                            P var946 = this.FS;
                                                                              int var947 = var946.B();
                                                                            var950 = var2 ^ 1618533056;
                                                                            var950 += 148796370;
                                                                            var950 ^= 1401060130;
                                                                            var950 ^= -1936896454;
                                                                            this.Fr(
                                                                                var503,
                                                                                var714,
                                                                                var840,
                                                                                var605,
                                                                                var618,
                                                                                var655,
                                                                                var879,
                                                                                var947,
                                                                                var769,
                                                                                var562,
                                                                                var950
                                                                            );
                                                                            switch (var2) {
                                                                                case 233558192:
                                                                                    var2 *= 372470881;
                                                                                    var2 += 1034142368;
                                                                                    var2 |= -1156951944;
                                                                                    var2 ^= 83978353;
                                                                                    break;
                                                                                case 1758407803:
                                                                                    var2 ^= 1473964418;
                                                                                    break;
                                                                                case 1834059561:
                                                                                default:
                                                                                    var2 ^= -1962796771;
                                                                            }
                                                                        } else {
                                                                            var2 -= 1978939743;
                                                                            var2 >>>= 22;
                                                                            var2 -= -2033606379;
                                                                            var2 ^= -945234493;
                                                                        }

                                                                        Integer var563 = var2;
                                                                        if (var563 == null) {
                                                                            break label767;
                                                                        }

                                                                        FrameContext var564 = var1.frame();
                                                                        var10 = var3;
                                                                        long var770 = var10 + 1L;
                                                                        long var771 = var10 * var770;
                                                                        var10 = var771 & 1L;
                                                                        long var1039;
                                                                        var3 = (var1039 = var10 - 0L) == 0L ? 0 : (var1039 < 0L ? -1 : 1);
                                                                        if (var3 == 0) {
                                                                            var2 ^= 379618281;
                                                                            var2 += -1905769717;
                                                                            var2 += 590370820;
                                                                            var2 ^= -1513997361;
                                                                            float var430 = var564.partialTick();
                                                                            int var565 = var2 - 1739988275;
                                                                            int var566 = var565 >>> 14;
                                                                            int var567 = var566 - -739899899;
                                                                            int var568 = var567 ^ 404327920;
                                                                            this.e(var503, var430, var457, var605, var618, var752, var546, var568);
                                                                            return;
                                                                        }

                                                                        var2 += -610174117;
                                                                        var2 ^= -1012968229;
                                                                    }
                                                                } else {
                                                                    var2 &= 1916486853;
                                                                    var2 |= -1445887484;
                                                                    var2 >>= 22;
                                                                    var2 ^= -1507814888;
                                                                }
                                                            }
                                                        } else {
                                                            var2 -= 2007157470;
                                                            var2 ^= 162545559;
                                                        }
                                                    }
                                                } else {
                                                    var2 -= -2113411979;
                                                    var2 *= 267668955;
                                                    var2 *= 1105353453;
                                                    var2 ^= -1546695248;
                                                }
                                            } else {
                                                switch (var2) {
                                                    case -1865155815:
                                                        var2 ^= 1406769674;
                                                        var2 |= 1454271560;
                                                        var2 ^= -1905196572;
                                                        break label766;
                                                    case -1526897884:
                                                        var2 ^= -1348956113;
                                                        break label766;
                                                    case -792133338:
                                                    default:
                                                        var2 ^= -986249892;
                                                }
                                            }
                                            break label766;
                                        }

                                        var2 |= 577375464;
                                        var2 += -1305052099;
                                        var2 <<= 2;
                                        var2 ^= 994836575;
                                        break label766;
                                    }

                                    switch (var2) {
                                        case 544918156:
                                        default:
                                            var2 ^= -668219069;
                                            break;
                                        case 692941739:
                                            var2 >>>= 13;
                                            var2 &= 1970391488;
                                            var2 ^= -1214748995;
                                            break;
                                        case 1038320042:
                                            var2 ^= 2117907082;
                                    }
                                } else {
                                    switch (var2) {
                                        case -1721817804:
                                            var2 &= 709034338;
                                            var2 += 1627746266;
                                            var2 &= 578826880;
                                            var2 *= -1321761221;
                                            var2 ^= -747175043;
                                            break;
                                        case -1421839066:
                                            var2 ^= -1475639683;
                                            break;
                                        case -876605836:
                                        default:
                                            var2 ^= 1621926443;
                                    }
                                }

                                var3 = var2 + 1;
                                var3 = var2 * var3;
                                int var458 = var2 + 2;
                                var3 *= var458;
                                int var459 = var2 + 3;
                                var3 *= var459;
                                var3 &= 7;
                                if (var3 == 0) {
                                    return;
                                }
                                break label767;
                            }

                            var2 -= -1333041058;
                            var2 *= -835707223;
                            var2 &= -1492377325;
                            var2 ^= -254720993;
                        } else {
                            var2 += -1014044409;
                            var2 ^= -359326904;
                        }
                    } else {
                        var2 *= -1445916781;
                        var2 ^= -1287486711;
                        var2 -= 1008639059;
                        var2 -= 1678975754;
                        var2 ^= 2059368553;
                    }

                    long var422 = var2;
                    long var460 = var422 + 1L;
                    long var461 = var422 * var460;
                    long var423 = var461 & 1L;
                    long var1040;
                    var2 = (var1040 = var423 - 0L) == 0L ? 0 : (var1040 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return;
                    }
                    break label767;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var462 = var2 + 2;
            var3 *= var462;
            int var463 = var2 + 3;
            var3 *= var463;
            var3 &= 7;
            if (var3 == 0) {
                RuntimeException var441 = new RuntimeException();
                throw var441;
            }
        }

        RuntimeException var428 = new RuntimeException();
        throw var428;
    }

    private void Fr(Canvas var1, kP_2 var2, ActionSetting var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, int var11) {
        label168: {
            label177: {
                int var14 = System.identityHashCode(this);
                float var257;
                int var15 = (var257 = var10 - 0.004F) == 0.0F ? 0 : (var257 < 0.0F ? -1 : 1);
                long var16 = var14;
                long var18 = var16 + 1L;
                var18 = var16 * var18;
                long var20 = var16 + 2L;
                var18 *= var20;
                var16 += 3L;
                var18 *= var16;
                var16 = var18 & 7L;
                long var258;
                int var163 = (var258 = var16 - 0L) == 0L ? 0 : (var258 < 0L ? -1 : 1);
                if (var163 == 0) {
                    int var26 = var11 - 1868375008;
                    var26 ^= 320043768;
                    var16 = var7;
                    var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var259;
                    int var166 = (var259 = var16 - 0L) == 0L ? 0 : (var259 < 0L ? -1 : 1);
                    if (var166 != 0) {
                        break label168;
                    }

                    if (var15 <= 0) {
                        switch (var26) {
                            case -170832400:
                            default:
                                var26 ^= 429391619;
                                break;
                            case 691166594:
                                var26 += -1889270238;
                                var26 -= 1041688145;
                                var26 += -230951510;
                                var26 ^= -1585530052;
                                break;
                            case 1286694897:
                                var26 ^= -2052569275;
                        }

                        return;
                    }

                    var26 >>>= 13;
                    var26 ^= -25208919;
                    var26 += 1849659194;
                    var26 ^= 1398703783;
                    kP_2 var144 = kP_2.DRAWN;
                    var16 = var14;
                    var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var260;
                    int var169 = (var260 = var16 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                    if (var169 == 0) {
                        var26 |= -1455764737;
                        var26 ^= 754023084;
                        Integer var170 = var7;
                        if (var170 == null) {
                            break label168;
                        }

                        int var149;
                        if (var2 == var144) {
                            var26 -= 815156178;
                            var26 ^= -629060649;
                            long var145 = var7;
                            long var17 = var145 + 1L;
                            var17 = var145 * var17;
                            long var19 = var145 + 2L;
                            var17 *= var19;
                            long var146 = var145 + 3L;
                            var17 *= var146;
                            long var147 = var17 & 7L;
                            long var261;
                            var149 = (var261 = var147 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                            if (var149 != 0) {
                                break label168;
                            }

                            var149 = 1;
                            var26 -= 810592092;
                            var26 ^= 768223745;
                            var26 ^= -510784173;
                        } else {
                            var26 *= -2027025415;
                            var26 -= 1807202501;
                            var26 |= -290953745;
                            var26 ^= -1014673169;
                            var26 ^= 594600304;
                            var149 = 0;
                            var26 &= -118181607;
                            var26 ^= 1285865896;
                        }

                        var16 = var7;
                        var18 = var16 + 1L;
                        var18 = var16 * var18;
                        var20 = var16 + 2L;
                        var18 *= var20;
                        var16 += 3L;
                        var18 *= var16;
                        var16 = var18 & 7L;
                        long var262;
                        int var174 = (var262 = var16 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                        if (var174 != 0) {
                            break label168;
                        }

                        vw_2 var175 = this.SJ;
                        Integer var193 = var14;
                        label159:
                        if (var193 != null) {
                            var26 ^= -168863562;
                            var26 ^= 1839667919;
                            var26 *= 1378638159;
                            var26 ^= -540899108;
                            float var196;
                            if (var149 != 0) {
                                var26 >>>= 18;
                                var26 *= 1264221155;
                                var26 ^= 944456804;
                                NumberSetting var194 = this.pixel;
                                var18 = var14;
                                var20 = var18 + 1L;
                                var20 = var18 * var20;
                                var18 = var20 & 1L;
                                long var263;
                                int var220 = (var263 = var18 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                                if (var220 != 0) {
                                    var26 *= 673998301;
                                    var26 ^= 622891530;
                                    var26 |= -865098313;
                                    var26 ^= 1976945841;
                                    break label159;
                                }

                                var26 <<= 7;
                                var26 ^= -1676713;
                                int var221 = var7 + 1;
                                int var222 = var7 * var221;
                                int var239 = var7 + 2;
                                int var223 = var222 * var239;
                                var239 = var7 + 3;
                                int var224 = var223 * var239;
                                int var225 = var224 & 7;
                                if (var225 != 0) {
                                    break label168;
                                }

                                float var195 = var194.WM();
                                var196 = var195;
                                switch (var26) {
                                    case -1394040247:
                                        var26 ^= -532927955;
                                        break;
                                    case -1139922601:
                                        var26 >>= 22;
                                        var26 *= -389739633;
                                        var26 ^= -1603728006;
                                        break;
                                    case -476310241:
                                    default:
                                        var26 ^= -145151393;
                                }
                            } else {
                                var26 *= 888681649;
                                var26 ^= 1396263965;
                                var26 ^= -1948527827;
                                var26 *= -1524564909;
                                var26 ^= -1011366120;
                                NumberSetting var226 = this.dJ;
                                long var241 = var14;
                                long var21 = var241 + 1L;
                                var21 = var241 * var21;
                                var241 = var21 & 1L;
                                long var264;
                                int var243 = (var264 = var241 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                                if (var243 != 0) {
                                    switch (var26) {
                                        case 358230625:
                                            var26 *= 613534491;
                                            var26 |= -48105796;
                                            var26 ^= 1175833785;
                                            break label159;
                                        case 776909825:
                                        default:
                                            var26 ^= 838257901;
                                            break label159;
                                        case 822922895:
                                            var26 ^= -1770541385;
                                            break label159;
                                    }
                                }
                                var26 = switch (var26) {
                                    case -1959840445 -> var26 ^ -1168278008;
                                    default -> var26 ^ -895521649;
                                    case 358230625 -> {
                                        var26 += 1567393604;
                                        var26 -= -1916607027;
                                        yield var26 ^ -1086434839;
                                    }
                                };
                                float var227 = var226.WM();
                                var196 = var227;
                                var26 += 464656151;
                                var26 >>= 18;
                                var26 >>>= 25;
                                var26 ^= 248165738;
                            }

                            vw_2 var176 = var175.D(var1, var4, var5, var6, var196);
                            long var197 = var14;
                            long var244 = var197 + 1L;
                            var244 = var197 * var244;
                            long var198 = var244 & 1L;
                            long var265;
                            int var199 = (var265 = var198 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                            if (var199 != 0) {
                                var26 >>= 11;
                                var26 <<= 9;
                                var26 += 1373610836;
                                var26 ^= -290950062;
                            } else {
                                var26 ^= 535989115;
                                var26 -= 1266272565;
                                var26 *= -323784873;
                                var26 ^= -856110984;
                                vw_2 var177 = var176.gs(var7, var8, var9);
                                if (var149 != 0) {
                                    var26 = switch (var26) {
                                        case -2101226820 -> {
                                            var26 <<= 1;
                                            var26 |= -866837958;
                                            var26 -= -202909468;
                                            yield var26 ^ 884866594;
                                        }
                                        case -454996939 -> var26 ^ 1065416957;
                                        default -> var26 ^ 698459040;
                                    };
                                    long var150 = var7;
                                    long var200 = var150 + 1L;
                                    long var201 = var150 * var200;
                                    var244 = var150 + 2L;
                                    long var202 = var201 * var244;
                                    long var151 = var150 + 3L;
                                    long var203 = var202 * var151;
                                    long var152 = var203 & 7L;
                                    long var266;
                                    var149 = (var266 = var152 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                                    if (var149 != 0) {
                                        break label168;
                                    }

                                    vw_2 var154 = this.SJ;
                                    du var178 = var3.lP();
                                    NumberSetting var204 = this.pixel;
                                    float var205 = var204.WM();
                                    int var228 = var14 + 1;
                                    int var229 = var14 * var228;
                                    int var247 = var14 + 2;
                                    int var230 = var229 * var247;
                                    int var248 = var14 + 3;
                                    int var231 = var230 * var248;
                                    int var232 = var231 & 7;
                                    if (var232 == 0) {
                                        var26 &= -308067137;
                                        var26 ^= -461359178;
                                        var26 += -1348254096;
                                        var26 *= 976813097;
                                        var26 ^= 124976819;
                                        var18 = var7;
                                        var20 = var18 + 1L;
                                        var20 = var18 * var20;
                                        long var22 = var18 + 2L;
                                        var20 *= var22;
                                        var18 += 3L;
                                        var20 *= var18;
                                        var18 = var20 & 7L;
                                        long var267;
                                        int var236 = (var267 = var18 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                                        if (var236 != 0) {
                                            break label168;
                                        }

                                        var154.Y(var178, var205, var10);
                                        switch (var26) {
                                            case -1755144291:
                                            default:
                                                var26 ^= -1489081552;
                                                break label177;
                                            case -736120335:
                                                var26 -= 414270659;
                                                var26 ^= -96902096;
                                                break label177;
                                            case 539825335:
                                                var26 ^= -471043783;
                                                break label177;
                                        }
                                    }

                                    var26 |= -1438564561;
                                    var26 -= 966200276;
                                    var26 += -39083878;
                                    var26 ^= 1666411447;
                                    var26 ^= 1796113460;
                                } else {
                                    var26 += 669501588;
                                    var26 ^= -720016380;
                                    var149 = var7 + 1;
                                    var149 = var7 * var149;
                                    int var179 = var7 + 2;
                                    var149 *= var179;
                                    int var180 = var7 + 3;
                                    var149 *= var180;
                                    var149 &= 7;
                                    if (var149 != 0) {
                                        break label168;
                                    }

                                    vw_2 var160 = this.SJ;
                                    int var181 = var14 + 1;
                                    int var182 = var14 * var181;
                                    var199 = var14 + 2;
                                    int var183 = var182 * var199;
                                    var14 += 3;
                                    int var184 = var183 * var14;
                                    var14 = var184 & 7;
                                    if (var14 == 0) {
                                        var26 = switch (var26) {
                                            default -> var26 ^ 2092155496;
                                            case 593877290 -> var26 ^ 18403127;
                                            case 2143090516 -> {
                                                var26 ^= 165729913;
                                                yield var26 ^ -389196952;
                                            }
                                        };
                                        var16 = var7;
                                        var18 = var16 + 1L;
                                        var18 = var16 * var18;
                                        var16 = var18 & 1L;
                                        long var268;
                                        var14 = (var268 = var16 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                                        if (var14 != 0) {
                                            break label168;
                                        }

                                        VA var136 = this.SS;
                                        var160.BA(var2, var136, var10);
                                        var26 *= -1501428467;
                                        var26 >>>= 6;
                                        var26 >>>= 7;
                                        var26 &= -1882231140;
                                        var26 ^= 1095910686;
                                        break label177;
                                    }

                                    var26 ^= 43228275;
                                    var26 ^= -971681759;
                                }
                            }
                        } else {
                            switch (var26) {
                                case -1889702676:
                                    var26 ^= -310724461;
                                    break;
                                case -951507620:
                                default:
                                    var26 ^= 2114970154;
                                    break;
                                case 1155547560:
                                    var26 ^= 1798433788;
                                    var26 -= 434310675;
                                    var26 ^= -1361795257;
                            }
                        }
                    } else {
                        var26 ^= -1829613107;
                        var26 ^= 371933465;
                    }
                } else {
                    int var12 = var11 * -7794297;
                    var12 += 211311553;
                    var12 ^= 1902586161;
                }

                long var121 = var7;
                long var140 = var121 + 1L;
                long var141 = var121 * var140;
                var16 = var121 + 2L;
                long var142 = var141 * var16;
                var121 += 3L;
                long var143 = var142 * var121;
                var121 = var143 & 7L;
                long var269;
                int var124 = (var269 = var121 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                if (var124 == 0) {
                    AssertionError var125 = new AssertionError();
                    throw var125;
                }
                break label168;
            }

            long var137 = var7;
            long var187 = var137 + 1L;
            var187 = var137 * var187;
            var137 = var187 & 1L;
            long var270;
            int var139 = (var270 = var137 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
            if (var139 == 0) {
                return;
            }
        }

        IllegalStateException var132 = new IllegalStateException();
        throw var132;
    }

    private float U(float var1, int var2) {
                                            float var135 = 0.0F;
        label191: {
            int var34;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var242;
            int var133 = (var242 = var5 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
            label190:
            if (var133 == 0) {
                float var6;
                label194: {
                    var34 = switch (var2) {
                        case -1983275042 -> var2 ^ -641026062;
                        default -> var2 ^ 189864415;
                        case -161727115 -> {
                            var34 = var2 | 1568639233;
                            yield var34 ^ 585520215;
                        }
                    };
                    float var134 = 0.0F;
                    var6 = 0.0F;
                    ModeSetting var144 = this.u;
                    Ek var8 = dev.aurap.hub.Ek.MOVEMENT;
                    boolean var145 = var144.TJ(var8);
                    if (!var145) {
                        var34 <<= 7;
                        var34 ^= -1969407420;
                        var7 = var34;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var243;
                        int var149 = (var243 = var7 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                        if (var149 != 0) {
                            break label191;
                        }

                        ModeSetting var150 = this.u;
                        long var171 = var4;
                        long var10 = var171 + 1L;
                        var10 = var171 * var10;
                        long var12 = var171 + 2L;
                        var10 *= var12;
                        long var172 = var171 + 3L;
                        var10 *= var172;
                        long var173 = var10 & 7L;
                        long var244;
                        int var174 = (var244 = var173 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
                        if (var174 != 0) {
                            var34 *= -1405670645;
                            var34 *= 1251170875;
                            var34 ^= -151467026;
                            break label190;
                        }

                        var34 += -730418915;
                        var34 *= 2142414427;
                        var34 ^= 161633177;
                        var8 = dev.aurap.hub.Ek.BOTH;
                        boolean var151 = var150.TJ(var8);
                        if (!var151) {
                            var34 |= 1938203577;
                            var34 *= 271460893;
                            var34 += -763140234;
                            var34 ^= 1104584409;
                            var135 = var134;
                            switch (var34) {
                                case -1209770052:
                                    var34 ^= 12932720;
                                    break label194;
                                case -697542084:
                                    var34 *= 169386293;
                                    var34 ^= -1446177444;
                                    break label194;
                                case 587270036:
                                default:
                                    var34 ^= 1492506230;
                                    break label194;
                            }
                        }

                        var34 -= 2068302699;
                        var34 *= -743866945;
                        var34 ^= 501506426;
                        var34 -= 1581710652;
                        var34 ^= -756960285;
                    } else {
                        var34 *= -457686247;
                        var34 |= -1612710289;
                        var34 ^= -1937277717;
                    }

                    float var152 = i_2.az();
                    float var153 = var152 / 0.28F;
                    float var154 = Math.min(1.0F, var153);
                    float var155 = var154 * 0.7F;
                    boolean var176 = i_2.L();
                    Integer var205 = var4;
                    if (var205 == null) {
                        switch (var34) {
                            case -943661671:
                                var34 ^= 888278810;
                                break label190;
                            case 87016734:
                            default:
                                var34 ^= -565366227;
                                break label190;
                            case 1400406676:
                                var34 -= 1736729408;
                                var34 &= 234041887;
                                var34 <<= 11;
                                var34 ^= -914268022;
                                break label190;
                        }
                    }

                    var34 *= 321763881;
                    var34 -= -191799359;
                    var34 -= 1862112497;
                    var34 ^= 960506267;
                    var205 = var34;
                    if (var205 == null) {
                        break label191;
                    }

                    float var180;
                    if (var176) {
                        var34 = switch (var34) {
                            case 1075721556 -> var34 ^ 757903653;
                            case 1088509081 -> {
                                var34 *= -528803283;
                                var34 |= -957328083;
                                var34 -= -950447636;
                                var34 -= 998531986;
                                yield var34 ^ 117413501;
                            }
                            default -> var34 ^ 922365496;
                        };
                        long var177 = var34;
                        long var225 = var177 + 1L;
                        var225 = var177 * var225;
                        long var178 = var225 & 1L;
                        long var245;
                        int var179 = (var245 = var178 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                        if (var179 != 0) {
                            break label191;
                        }

                        var180 = 0.5F;
                        switch (var34) {
                            case -874029550:
                                var34 &= -1623029599;
                                var34 ^= -1562494421;
                                var34 &= 2082633308;
                                var34 |= -670958993;
                                var34 ^= -1550092879;
                                break;
                            case 1469509229:
                                var34 ^= 613017166;
                                break;
                            case 1939945851:
                            default:
                                var34 ^= -1222162791;
                        }
                    } else {
                        var34 |= -1975947158;
                        var34 <<= 15;
                        var34 ^= -428044864;
                        var180 = 0.0F;
                        switch (var34) {
                            case -1023344976:
                            default:
                                var34 ^= -690230795;
                                break;
                            case 316092250:
                                var34 ^= -1646259867;
                                break;
                            case 1543572928:
                                var34 += -2025286833;
                                var34 |= 869935949;
                                var34 >>>= 10;
                                var34 |= 2110325265;
                                var34 ^= 644315429;
                        }
                    }

                    var205 = var34;
                    if (var205 == null) {
                        break label191;
                    }

                    float var156 = var155 + var180;
                    int var181 = var4 + 1;
                    int var182 = var4 * var181;
                    int var208 = var4 + 2;
                    int var183 = var182 * var208;
                    var208 = var4 + 3;
                    int var184 = var183 * var208;
                    int var185 = var184 & 7;
                    if (var185 != 0) {
                        var34 -= 288140494;
                        var34 ^= 58467226;
                        break label190;
                    }

                    var34 += 1638280941;
                    var34 <<= 22;
                    var34 *= -679702689;
                    var34 ^= 1608218712;
                    Integer var186 = var34;
                    if (var186 == null) {
                        break label191;
                    }

                    var135 = var156;
                    var34 |= 803643293;
                    var34 &= -1479825154;
                    var34 ^= -1223604792;
                    var34 ^= -270953948;
                }

                ModeSetting var157 = this.u;
                Ek var187 = dev.aurap.hub.Ek.COOLDOWN;
                boolean var158 = var157.TJ(var187);
                long var188 = var4;
                long var227 = var188 + 1L;
                var227 = var188 * var227;
                long var241 = var188 + 2L;
                var227 *= var241;
                long var189 = var188 + 3L;
                var227 *= var189;
                long var190 = var227 & 7L;
                long var246;
                int var191 = (var246 = var190 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                label173:
                if (var191 == 0) {
                    var34 <<= 13;
                    var34 ^= 1779956897;
                    long var192 = var34;
                    var227 = var192 + 1L;
                    var227 = var192 * var227;
                    long var193 = var227 & 1L;
                    long var247;
                    int var194 = (var247 = var193 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                    if (var194 != 0) {
                        break label191;
                    }

                    label199: {
                        if (!var158) {
                            var34 &= 1469568234;
                            var34 &= -709666691;
                            var34 ^= -460750627;
                            var7 = var34;
                            long var210 = var7 + 1L;
                            var210 = var7 * var210;
                            long var235 = var7 + 2L;
                            var210 *= var235;
                            var7 += 3L;
                            var210 *= var7;
                            var7 = var210 & 7L;
                            long var248;
                            int var162 = (var248 = var7 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                break label191;
                            }

                            ModeSetting var163 = this.u;
                            var187 = dev.aurap.hub.Ek.BOTH;
                            var210 = var4;
                            var235 = var210 + 1L;
                            var235 = var210 * var235;
                            long var13 = var210 + 2L;
                            var235 *= var13;
                            var210 += 3L;
                            var235 *= var210;
                            var210 = var235 & 7L;
                            long var249;
                            int var217 = (var249 = var210 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                            if (var217 != 0) {
                                var34 += -1925727164;
                                var34 *= -239579039;
                                var34 &= -572252212;
                                var34 ^= -647579308;
                                var34 ^= 1535070;
                                break label173;
                            }
                            var34 = switch (var34) {
                                default -> var34 ^ 1317436188;
                                case -579309630 -> var34 ^ -1955577054;
                                case -518467331 -> {
                                    var34 ^= 10609140;
                                    var34 ^= 1194392739;
                                    var34 ^= -1383834590;
                                    yield var34 ^ -795440528;
                                }
                            };
                            boolean var164 = var163.TJ(var187);
                            if (!var164) {
                                var34 |= -1511645493;
                                var34 ^= -1777856811;
                                var34 *= 762492179;
                                var34 &= 1630249561;
                                var34 ^= -1339320208;
                                var7 = var34;
                                var210 = var7 + 1L;
                                var210 = var7 * var210;
                                var235 = var7 + 2L;
                                var210 *= var235;
                                var7 += 3L;
                                var210 *= var7;
                                var7 = var210 & 7L;
                                long var250;
                                int var168 = (var250 = var7 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                                if (var168 != 0) {
                                    break label191;
                                }

                                var6 = var6;
                                switch (var34) {
                                    case -1999959371:
                                    default:
                                        var34 ^= 1932302060;
                                        break label199;
                                    case -442290344:
                                        var34 ^= 1541142738;
                                        break label199;
                                    case -267904968:
                                        var34 >>>= 14;
                                        var34 *= -723748277;
                                        var34 &= 1642734544;
                                        var34 &= -807825127;
                                        var34 ^= 1400395586;
                                        break label199;
                                }
                            }

                            switch (var34) {
                                case -628110154:
                                default:
                                    var34 ^= -566693572;
                                    break;
                                case -610591752:
                                    var34 &= -1650301154;
                                    var34 &= 1888074854;
                                    var34 ^= -380401241;
                                    break;
                                case 1804405183:
                                    var34 ^= 745135857;
                            }
                        } else {
                            var34 ^= -384671299;
                            var34 ^= 355472571;
                        }

                        float var169 = i_2.bl(var1);
                        Integer var196 = var4;
                        if (var196 == null) {
                            var34 -= -23987767;
                            var34 <<= 12;
                            var34 ^= 1374429322;
                            break label173;
                        }

                        var34 -= 2129258127;
                        var34 += 2010056800;
                        var34 |= -1823698489;
                        var34 *= 1825887307;
                        var34 ^= -1421507024;
                        long var197 = var34;
                        var227 = var197 + 1L;
                        var227 = var197 * var227;
                        long var198 = var227 & 1L;
                        long var251;
                        int var199 = (var251 = var198 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                        if (var199 != 0) {
                            break label191;
                        }

                        float var170 = 1.0F - var169;
                        var6 = var170;
                        var34 -= 315275192;
                        var34 &= 6274889;
                        var34 += -1198976933;
                        var34 ^= -1416476698;
                    }

                    float var136 = Math.max(var135, var6);
                    long var139 = var4;
                    long var200 = var139 + 1L;
                    long var201 = var139 * var200;
                    long var140 = var201 & 1L;
                    long var252;
                    var4 = (var252 = var140 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        var34 ^= -1171441701;
                        var34 &= 280000997;
                        var34 ^= -1215382348;
                        var4 = var34 + 1;
                        var4 = var34 * var4;
                        int var141 = var34 + 2;
                        var4 *= var141;
                        int var142 = var34 + 3;
                        var4 *= var142;
                        var4 &= 7;
                        if (var4 == 0) {
                            return TP.S(var136);
                        }
                        break label191;
                    }

                    switch (var34) {
                        case 326129218:
                            var34 -= -812349797;
                            var34 &= 779564949;
                            var34 -= 1688213536;
                            var34 ^= -1372176284;
                            var34 ^= 2056613771;
                            break;
                        case 412877289:
                            var34 ^= 424115421;
                            break;
                        case 1766382510:
                        default:
                            var34 ^= 411344495;
                    }
                } else {
                    var34 |= 1608299750;
                    var34 += 968043166;
                    var34 ^= 1887627806;
                }
            } else {
                switch (var2) {
                    case -426752109:
                        var34 = var2 ^ -511839289;
                        break;
                    case -161727115:
                        var34 = var2 + -901279452;
                        var34 <<= 30;
                        var34 &= -2122753467;
                        var34 ^= 1225900170;
                        break;
                    case 1656876450:
                    default:
                        var34 = var2 ^ -1535544690;
                }
            }

            var4 = var34 + 1;
            var4 = var34 * var4;
            int var137 = var34 + 2;
            var4 *= var137;
            var34 += 3;
            var4 *= var34;
            var34 = var4 & 7;
            if (var34 == 0) {
                AssertionError var121 = new AssertionError();
                throw var121;
            }
        }

        AssertionError var120 = new AssertionError();
        throw var120;
    }

    private void e(Canvas var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
                                            float var164 = 0.0F;
        label219: {
            label232: {
                int var11 = System.identityHashCode(this);
                Integer var12 = var11;
                if (var12 == null) {
                    switch (var8) {
                        case -1471602052:
                        default:
                            int var153 = var8 ^ -820710869;
                            break;
                        case 872793734:
                            int var149 = var8 * -1760691993;
                            var149 += 1631682209;
                            var149 -= 1777152436;
                            var149 ^= -1314147256;
                            break;
                        case 1524535699:
                            int var148 = var8 ^ 1712219876;
                    }
                } else {
                    label251: {
                        XF var13;
                        int var39;
                        float var175;
                        label214: {
                            var39 = var8 * -615892319;
                            var39 |= -1060416110;
                            var39 <<= 28;
                            var39 -= -1256145703;
                            var39 ^= 211084648;
                            var164 = i_2.bl(var2);
                            var13 = this.K;
                            ModeSetting var14 = this.Ek;
                            v_2 var15 = v_2.OFF;
                            boolean var170 = var14.TJ(var15);
                            if (!var170) {
                                var39 += 54681721;
                                var39 += -1108676989;
                                var39 ^= -41149999;
                                int var171 = var7 + 1;
                                int var172 = var7 * var171;
                                int var173 = var172 & 1;
                                if (var173 != 0) {
                                    break label219;
                                }

                                float var287;
                                int var174 = (var287 = var164 - 0.999F) == 0.0F ? 0 : (var287 < 0.0F ? -1 : 1);
                                int var199 = var11 + 1;
                                int var200 = var11 * var199;
                                int var16 = var11 + 2;
                                int var201 = var200 * var16;
                                var16 = var11 + 3;
                                int var202 = var201 * var16;
                                int var203 = var202 & 7;
                                if (var203 != 0) {
                                    var39 |= 1906401568;
                                    var39 ^= -705403355;
                                    break label251;
                                }

                                var39 ^= -562508168;
                                var39 >>= 21;
                                var39 += 1671990312;
                                var39 <<= 25;
                                var39 ^= -49187773;
                                int var204 = var7 + 1;
                                int var205 = var7 * var204;
                                int var206 = var205 & 1;
                                if (var206 != 0) {
                                    break label219;
                                }

                                if (var174 < 0) {
                                    var39 *= -337220579;
                                    var39 ^= -907984364;
                                    var175 = 1.0F;
                                    var39 ^= 141335344;
                                    var39 *= 2090231429;
                                    var39 ^= 1586241572;
                                    break label214;
                                }

                                var39 >>= 31;
                                var39 ^= 783060834;
                            } else {
                                var39 &= -435523050;
                                var39 *= -1029298909;
                                var39 *= 2063752513;
                                var39 >>= 25;
                                var39 ^= 783060861;
                            }

                            var175 = 0.0F;
                            var39 &= 1871723482;
                            var39 &= -1852136486;
                            var39 ^= -1004986471;
                        }

                        int var207 = var7 + 1;
                        var207 = var7 * var207;
                        int var238 = var7 + 2;
                        var207 *= var238;
                        var238 = var7 + 3;
                        var207 *= var238;
                        var207 &= 7;
                        if (var207 != 0) {
                            break label219;
                        }

                        var13.H(var175);
                        var13 = this.K;
                        long var176 = var11;
                        long var240 = var176 + 1L;
                        long var241 = var176 * var240;
                        long var18 = var176 + 2L;
                        long var242 = var241 * var18;
                        long var177 = var176 + 3L;
                        long var243 = var242 * var177;
                        long var178 = var243 & 7L;
                        long var288;
                        int var179 = (var288 = var178 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                        if (var179 != 0) {
                            switch (var39) {
                                case -1447804046:
                                default:
                                    var39 ^= 1549234178;
                                    break label251;
                                case -996598565:
                                    var39 &= -45105608;
                                    var39 ^= -368535673;
                                    break label251;
                                case -539988900:
                                    var39 ^= -1175977338;
                            }
                        } else {
                            var39 = switch (var39) {
                                case -996598565 -> {
                                    var39 *= -355189427;
                                    var39 >>>= 8;
                                    var39 *= -1643450167;
                                    yield var39 ^ -128849996;
                                }
                                case -832066400 -> var39 ^ 36095451;
                                default -> var39 ^ -1297448781;
                            };
                            Integer var180 = var7;
                            if (var180 == null) {
                                break label219;
                            }

                            float var168 = var13.N(var3);
                            float var289;
                            int var181 = (var289 = var168 - 0.01F) == 0.0F ? 0 : (var289 < 0.0F ? -1 : 1);
                            if (var181 < 0) {
                                switch (var39) {
                                    case -1992268825:
                                    default:
                                        var39 ^= -909879563;
                                        break;
                                    case -1822893560:
                                        var39 >>>= 4;
                                        var39 &= -2039741822;
                                        var39 ^= -1416334830;
                                        break;
                                    case -330651724:
                                        var39 ^= -1958841031;
                                }

                                int var196 = var7 + 1;
                                int var197 = var7 * var196;
                                int var198 = var197 & 1;
                                if (var198 == 0) {
                                    return;
                                }
                                break label219;
                            }

                            var39 ^= -1268589821;
                            var39 -= -799996581;
                            var39 += 251947331;
                            var39 *= 1028244501;
                            var39 ^= -1218298205;
                            Integer var182 = var7;
                            if (var182 == null) {
                                break label219;
                            }

                            ModeSetting var183 = this.oL;
                            long var212 = var11;
                            long var17 = var212 + 1L;
                            var17 = var212 * var17;
                            long var213 = var17 & 1L;
                            long var290;
                            var207 = (var290 = var213 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                            if (var207 != 0) {
                                switch (var39) {
                                    case -53250486:
                                    default:
                                        var39 ^= -1857022514;
                                        break label251;
                                    case 132540910:
                                        var39 ^= -118141101;
                                        break label251;
                                    case 2037149004:
                                        var39 *= 326125841;
                                        var39 >>= 19;
                                        var39 ^= 771851660;
                                }
                            } else {
                                var39 ^= 257593549;
                                var39 <<= 7;
                                var39 -= -1948813470;
                                var39 ^= -1234234542;
                                long var215 = var7;
                                var17 = var215 + 1L;
                                var17 = var215 * var17;
                                long var19 = var215 + 2L;
                                var17 *= var19;
                                long var216 = var215 + 3L;
                                var17 *= var216;
                                long var217 = var17 & 7L;
                                long var291;
                                var207 = (var291 = var217 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                                if (var207 != 0) {
                                    break label219;
                                }

                                kP_2 var219 = kP_2.DRAWN;
                                boolean var184 = var183.TJ(var219);
                                if (var184) {
                                    var39 = switch (var39) {
                                        case -322520215 -> var39 ^ -1101704755;
                                        case 969431628 -> {
                                            var39 -= 1424932683;
                                            var39 -= 167163311;
                                            var39 <<= 20;
                                            yield var39 ^ -434765514;
                                        }
                                        default -> var39 ^ -1694264950;
                                    };
                                    ActionSetting var185 = this.a;
                                    du var186 = var185.lP();
                                    var207 = var39 << 27;
                                    var207 ^= -1403563120;
                                    int var187 = s(var186, var207);
                                    var175 = var187;
                                    var207 = var11 + 1;
                                    var207 = var11 * var207;
                                    var207 &= 1;
                                    if (var207 != 0) {
                                        var39 >>>= 2;
                                        var39 ^= -1244020706;
                                        var39 ^= -1223308340;
                                        break label251;
                                    }

                                    var39 ^= 1418505831;
                                    var39 &= 1717361289;
                                    var39 ^= -602871758;
                                    var175 += 0.5F;
                                    NumberSetting var225 = this.pixel;
                                    float var226 = var225.WM();
                                    var175 *= var226;
                                    var175 = var175;
                                    switch (var39) {
                                        case -1173855693:
                                            var39 &= 280121118;
                                            var39 ^= -379369596;
                                            break;
                                        case -673860580:
                                            var39 ^= -1713037471;
                                            break;
                                        case 784702512:
                                        default:
                                            var39 ^= -1288648477;
                                    }
                                } else {
                                    var39 &= -1462862153;
                                    var39 -= -1737603865;
                                    var39 |= 650454128;
                                    var39 *= -1179393813;
                                    var39 ^= 2132770533;
                                    var207 = var7 + 1;
                                    var207 = var7 * var207;
                                    var238 = var7 + 2;
                                    var207 *= var238;
                                    var238 = var7 + 3;
                                    var207 *= var238;
                                    var207 &= 7;
                                    if (var207 != 0) {
                                        break label219;
                                    }

                                    NumberSetting var232 = this.t;
                                    float var233 = var232.WM();
                                    NumberSetting var246 = this.Cj;
                                    float var247 = var246.WM();
                                    int var260 = var11 + 1;
                                    int var261 = var11 * var260;
                                    int var262 = var261 & 1;
                                    if (var262 != 0) {
                                        var39 *= -363683799;
                                        var39 -= -1620168772;
                                        var39 -= 1264981579;
                                        var39 ^= -943353177;
                                        var39 ^= 916602459;
                                        break label251;
                                    }
                                    var39 = switch (var39) {
                                        case -1778055334 -> {
                                            var39 &= -1521799076;
                                            var39 &= 776256269;
                                            var39 += -1470467223;
                                            yield var39 ^ -13412992;
                                        }
                                        case -1387748447 -> var39 ^ -708399135;
                                        default -> var39 ^ -950460453;
                                    };
                                    int var263 = var7 + 1;
                                    int var264 = var7 * var263;
                                    int var265 = var264 & 1;
                                    if (var265 != 0) {
                                        break label219;
                                    }

                                    float var234 = var233 + var247;
                                    var175 = var234;
                                    var39 ^= -1335361837;
                                    var39 *= 1237178903;
                                    var39 |= -257985168;
                                    var39 ^= 77363944;
                                }

                                Integer var235 = var7;
                                if (var235 == null) {
                                    break label219;
                                }

                                var175 *= var6;
                                var175 += 3.0F;
                                int var236 = DP.nq(1610612736, var168);
                                int var169 = DP.nq(var7, var168);
                                ModeSetting var248 = this.Ek;
                                var17 = var11;
                                var19 = var17 + 1L;
                                var19 = var17 * var19;
                                var17 = var19 & 1L;
                                long var292;
                                int var268 = (var292 = var17 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                                if (var268 != 0) {
                                    var39 -= 962357415;
                                    var39 += -1579078530;
                                    var39 |= -510851377;
                                    var39 -= 1396790193;
                                    var39 ^= -1599080543;
                                } else {
                                    var39 = switch (var39) {
                                        default -> var39 ^ 821043563;
                                        case -110951018 -> {
                                            var39 += 300432081;
                                            var39 -= -387836191;
                                            var39 >>>= 15;
                                            var39 |= -217291606;
                                            yield var39 ^ -981897353;
                                        }
                                        case 1211568910 -> var39 ^ -929114789;
                                    };
                                    var17 = var7;
                                    var19 = var17 + 1L;
                                    var19 = var17 * var19;
                                    var17 = var19 & 1L;
                                    long var293;
                                    int var271 = (var293 = var17 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                                    if (var271 != 0) {
                                        break label219;
                                    }

                                    v_2 var272 = v_2.RING;
                                    boolean var249 = var248.TJ(var272);
                                    if (var249) {
                                        var39 &= 1833080317;
                                        var39 -= 107403588;
                                        var39 += -1141737468;
                                        var39 += -1930940687;
                                        var39 ^= 1190297756;
                                        Paint var250 = Paint.solid(var236);
                                        var1.arc(var4, var5, var175, 1.0F, 0.0F, (float) (Math.PI * 2), var250);
                                        float var251 = TP.S(var164);
                                        float var252 = (float) (Math.PI * 2) * var251;
                                        int var273 = var11 + 1;
                                        int var274 = var11 * var273;
                                        int var275 = var274 & 1;
                                        if (var275 == 0) {
                                            var39 -= 795395900;
                                            var39 *= 939629523;
                                            var39 ^= -289208707;
                                            Paint var276 = Paint.solid(var169);
                                            var1.arc(var4, var5, var175, 1.0F, (float) (-Math.PI / 2), var252, var276);
                                            switch (var39) {
                                                case -1682495377:
                                                    var39 ^= -1062832901;
                                                    var39 &= 1880809775;
                                                    var39 <<= 6;
                                                    var39 ^= 2007970215;
                                                    var39 ^= -1420000218;
                                                    break label232;
                                                case -574335739:
                                                default:
                                                    var39 ^= 1042384788;
                                                    break label232;
                                                case 2146301342:
                                                    var39 ^= -2111391285;
                                                    break label232;
                                            }
                                        }

                                        var39 -= 970981403;
                                        var39 += -1602652708;
                                        var39 ^= -1462022404;
                                    } else {
                                        var39 <<= 23;
                                        var39 >>= 2;
                                        var39 &= -482001663;
                                        var39 ^= -463644614;
                                        Integer var253 = var7;
                                        if (var253 == null) {
                                            break label219;
                                        }

                                        float var254 = 16.0F;
                                        float var277 = 2.0F;
                                        var175 = var5 + var175;
                                        var175++;
                                        float var278 = var254 / 2.0F;
                                        int var284 = var11 + 1;
                                        int var285 = var11 * var284;
                                        var11 = var285 & 1;
                                        if (var11 == 0) {
                                            var39 = switch (var39) {
                                                default -> var39 ^ 1888449872;
                                                case 90003514 -> {
                                                    var39 ^= 527719875;
                                                    var39 += 591489531;
                                                    var39 >>= 13;
                                                    yield var39 ^ -1454112074;
                                                }
                                                case 507383135 -> var39 ^ -620435822;
                                            };
                                            Integer var158 = var7;
                                            if (var158 == null) {
                                                break label219;
                                            }

                                            float var159 = var4 - var278;
                                            float var160 = var159 - 0.5F;
                                            float var279 = var175 - 0.5F;
                                            float var286 = var254 + 1.0F;
                                            float var20 = var277 + 1.0F;
                                            var1.roundRect(var160, var279, var286, var20, 1.5F, var236);
                                            float var161 = var254 / 2.0F;
                                            float var162 = var4 - var161;
                                            float var165 = TP.S(var164);
                                            float var166 = var254 * var165;
                                            var1.roundRect(var162, var175, var166, var277, 1.0F, var169);
                                            var39 += 1699737035;
                                            var39 |= 424681754;
                                            var39 ^= -954842309;
                                            break label232;
                                        }

                                        switch (var39) {
                                            case -1470782966:
                                                var39 ^= -741942107;
                                                break;
                                            case 90003514:
                                                var39 -= 1081115732;
                                                var39 <<= 22;
                                                var39 ^= -679375969;
                                                break;
                                            case 110932896:
                                            default:
                                                var39 ^= 1381093579;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Integer var154 = var7;
                if (var154 != null) {
                    RuntimeException var156 = new RuntimeException();
                    throw var156;
                }
                break label219;
            }

            Integer var163 = var7;
            if (var163 != null) {
                return;
            }
        }

        UnsupportedOperationException var155 = new UnsupportedOperationException();
        throw var155;
    }

    private static int s(du var0, int var1) {
        label147: {
            int var3 = System.identityHashCode(var0);
            int var4 = 0;
            int var5 = 0;
            var4 = var4;
            Integer var6 = var3;
            int var18;
            if (var6 == null) {
                var18 = var1 * 858471203;
                var18 *= -1226576121;
                var18 ^= -95604059;
                var18 ^= -1145334719;
                var18 ^= 1046682050;
            } else {
                var18 = switch (var1) {
                    default -> var1 ^ 124157877;
                    case -1127070530 -> var1 ^ -1527693428;
                    case 475485072 -> {
                        var18 = var1 * -1582895931;
                        var18 += -943684562;
                        yield var18 ^ -228167162;
                    }
                };
                var6 = var18;
                if (var6 == null) {
                    break label147;
                }

                var5 = var5;
                var18 >>>= 5;
                var18 -= -1091970396;
                var18 &= 2041452741;
                var18 &= 928804964;
                var18 ^= -270787862;

                label144:
                while (true) {
                    long var98 = var18;
                    long var8 = var98 + 1L;
                    var8 = var98 * var8;
                    long var99 = var8 & 1L;
                    long var170;
                    int var100 = (var170 = var99 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label147;
                    }

                    if (var5 >= 17) {
                        var18 &= 1023573256;
                        var18 ^= -2014427376;
                        Integer var88 = var18;
                        if (var88 != null) {
                            return var4;
                        }
                        break label147;
                    }

                    var18 *= 1957359701;
                    var18 >>>= 13;
                    var18 >>= 9;
                    var18 ^= 221666531;
                    long var101 = var18;
                    var8 = var101 + 1L;
                    var8 = var101 * var8;
                    long var102 = var8 & 1L;
                    long var171;
                    var100 = (var171 = var102 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label147;
                    }

                    int var104 = 0;
                    Integer var7 = var3;
                    if (var7 == null) {
                        var18 <<= 22;
                        var18 <<= 21;
                        var18 &= -1701102795;
                        var18 ^= 1302276086;
                        break;
                    }

                    var18 -= 1713764552;
                    var18 += -879257319;
                    var18 &= 720834595;
                    var18 ^= -2080607222;
                    var7 = var18;
                    if (var7 == null) {
                        break label147;
                    }

                    int var109 = var4;
                    var104 = var104;
                    var18 |= -1991239272;
                    var18 ^= 2094026810;

                    while (true) {
                        var8 = var18;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var172;
                        int var127 = (var172 = var8 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                        if (var127 != 0) {
                            break label147;
                        }

                        if (var104 >= 17) {
                            var18 *= 460456271;
                            var18 *= -73211475;
                            var18 <<= 23;
                            var18 ^= -950035077;
                            Integer var106 = var18;
                            if (var106 == null) {
                                break label147;
                            }

                            int var107 = var5 + 1;
                            var4 = var109;
                            long var110 = var3;
                            long var155 = var110 + 1L;
                            var155 = var110 * var155;
                            long var111 = var155 & 1L;
                            long var175;
                            var109 = (var175 = var111 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                            if (var109 != 0) {
                                switch (var18) {
                                    case -729197953:
                                        var18 ^= 1127559708;
                                        break label144;
                                    case -421552773:
                                        var18 &= -30089364;
                                        var18 ^= 1953905571;
                                        var18 -= -1583970813;
                                        var18 ^= -1118632130;
                                        break label144;
                                    case 1769079397:
                                    default:
                                        var18 ^= -1559522872;
                                        break label144;
                                }
                            }

                            var18 *= 7866467;
                            var18 += 966931617;
                            var18 ^= 1104370241;
                            var109 = var18 + 1;
                            var109 = var18 * var109;
                            int var137 = var18 + 2;
                            var109 *= var137;
                            int var138 = var18 + 3;
                            var109 *= var138;
                            var109 &= 7;
                            if (var109 != 0) {
                                break label147;
                            }

                            var5 = var107;
                            var18 |= -590980661;
                            var18 |= 2120613399;
                            var18 *= -216497531;
                            var18 -= 1756026167;
                            var18 ^= 1273799406;
                            break;
                        }
                        var18 = switch (var18) {
                            case -712233567 -> {
                                var18 ^= 285997021;
                                var18 >>= 28;
                                yield var18 ^ -1361351094;
                            }
                            default -> var18 ^ 1107180021;
                            case 1355704499 -> var18 ^ 1222106824;
                        };
                        int var128 = var18 + 1;
                        int var129 = var18 * var128;
                        int var130 = var129 & 1;
                        if (var130 != 0) {
                            break label147;
                        }

                        byte var131 = var0.q(var104, var5);
                        Integer var9 = var3;
                        if (var9 == null) {
                            var18 &= 1239494514;
                            var18 ^= 476415209;
                            var18 -= -816318329;
                            var18 *= 1363268319;
                            var18 ^= -1146215462;
                            break label144;
                        }

                        var18 *= 1351121955;
                        var18 *= -888241253;
                        var18 &= 1910032018;
                        var18 ^= -1496442847;
                        long var139 = var18;
                        long var11 = var139 + 1L;
                        var11 = var139 * var11;
                        long var140 = var11 & 1L;
                        long var173;
                        int var141 = (var173 = var140 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                        if (var141 != 0) {
                            break label147;
                        }

                        int var136;
                        if (var131 != 0) {
                            var18 ^= 573309014;
                            var18 *= 991200149;
                            var18 ^= -1143499903;
                            int var132 = var104 - 8;
                            int var133 = Math.abs(var132);
                            var141 = var5 - 8;
                            var141 = Math.abs(var141);
                            int var134 = Math.max(var133, var141);
                            int var135 = Math.max(var109, var134);
                            long var144 = var3;
                            var11 = var144 + 1L;
                            var11 = var144 * var11;
                            long var13 = var144 + 2L;
                            var11 *= var13;
                            long var145 = var144 + 3L;
                            var11 *= var145;
                            long var146 = var11 & 7L;
                            long var174;
                            var141 = (var174 = var146 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                            if (var141 != 0) {
                                var18 += 1325286457;
                                var18 &= 1504080333;
                                var18 ^= 85678071;
                                break label144;
                            }

                            var18 |= -484696496;
                            var18 ^= 1078901107;
                            var141 = var18 + 1;
                            var141 = var18 * var141;
                            int var159 = var18 + 2;
                            var141 *= var159;
                            int var160 = var18 + 3;
                            var141 *= var160;
                            var141 &= 7;
                            if (var141 != 0) {
                                break label147;
                            }

                            var136 = var135;
                            switch (var18) {
                                case -1143961941:
                                    var18 >>= 12;
                                    var18 += -657419282;
                                    var18 -= -88970503;
                                    var18 ^= -1856986865;
                                    var18 ^= 42815761;
                                    break;
                                case 342069697:
                                    var18 ^= -2042808751;
                                    break;
                                case 2129341770:
                                default:
                                    var18 ^= 896546720;
                            }
                        } else {
                            var18 >>>= 4;
                            var18 |= -380077666;
                            var18 &= 1591018725;
                            var18 ^= -981641453;
                            var136 = var109;
                            var18 *= 211167457;
                            var18 ^= 1903733461;
                        }

                        Integer var153 = var18;
                        if (var153 == null) {
                            break label147;
                        }

                        int var154 = var104 + 1;
                        Integer var161 = var3;
                        if (var161 == null) {
                            var18 ^= -959028363;
                            var18 ^= -963817120;
                            break label144;
                        }

                        var18 >>= 21;
                        var18 ^= -1465135774;
                        int var162 = var18 + 1;
                        int var163 = var18 * var162;
                        int var164 = var163 & 1;
                        if (var164 != 0) {
                            break label147;
                        }

                        var109 = var136;
                        var104 = var154;
                        var18 &= 360648667;
                        var18 ^= -710466903;
                    }
                }
            }

            long var94 = var18;
            long var118 = var94 + 1L;
            var118 = var94 * var118;
            long var157 = var94 + 2L;
            var118 *= var157;
            long var95 = var94 + 3L;
            var118 *= var95;
            long var96 = var118 & 7L;
            long var176;
            var3 = (var176 = var96 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
            if (var3 == 0) {
                AssertionError var91 = new AssertionError();
                throw var91;
            }
        }

        IllegalArgumentException var89 = new IllegalArgumentException();
        throw var89;
    }

    public void stampNext(du var1, float var2, int var3) {
        int var5 = System.identityHashCode(this);
        kP_2[] var6 = se;
        int var7 = this.lJ;
        int var8 = var7 + 1;
        this.lJ = var8;
        kP_2[] var27 = se;
        var8 = var27.length;
        var7 %= var8;
        kP_2 var21 = var6[var7];
        var7 = var5 + 1;
        var7 = var5 * var7;
        var5 = var7 & 1;
        if (var5 == 0) {
            int var14 = var3 | -624300044;
            var14 &= -1625620133;
            var14 &= -583489711;
            var14 ^= -1761790861;
            VA var19 = new VA();
            NumberSetting var25 = this.Cj;
            float var26 = var25.WM();
            NumberSetting var29 = this.t;
            float var30 = var29.WM();
            NumberSetting var9 = this.dJ;
            float var31 = var9.WM();
            VA var20 = var19.E(var26, var30, var31, true, 0.0F);
            pr.QD(var1, var21, var20, var2);
        } else {
            int var4 = var3 ^ -1696258117;
            var4 >>>= 18;
            var4 += 892978119;
            var4 ^= -1931972547;
            UnsupportedOperationException var13 = new UnsupportedOperationException();
            throw var13;
        }
    }

    public void preview(Canvas var1, kP_2 var2, du var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, int var11) {
        label125: {
            label124: {
                int var14 = System.identityHashCode(this);
                kP_2 var15 = kP_2.SAME;
                int var16 = var14 + 1;
                var16 = var14 * var16;
                var16 &= 1;
                if (var16 != 0) {
                    switch (var11) {
                        case -1283172883:
                            int var24 = var11 * -1467782993;
                            var24 += 265009697;
                            var24 &= -152926177;
                            var24 ^= -1664331716;
                            break;
                        case 691047599:
                        default:
                            int var23 = var11 ^ -581370091;
                            break;
                        case 1761757341:
                            int var12 = var11 ^ -460665799;
                    }
                } else {
                    int var28 = var11 - 443586792;
                    var28 ^= 1530925613;
                    Integer var135 = var4;
                    if (var135 == null) {
                        break label125;
                    }

                    if (var2 == var15) {
                        var28 >>= 12;
                        var28 += 1942222488;
                        var28 |= 1616882959;
                        var28 ^= 1513222820;
                        Integer var104 = var4;
                        if (var104 == null) {
                            break label125;
                        }

                        float var187;
                        int var105 = (var187 = var8 - 16.0F) == 0.0F ? 0 : (var187 < 0.0F ? -1 : 1);
                        long var136 = var14;
                        long var18 = var136 + 1L;
                        var18 = var136 * var18;
                        long var137 = var18 & 1L;
                        long var188;
                        int var138 = (var188 = var137 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                        if (var138 == 0) {
                            var28 &= -1275504985;
                            var28 ^= -1266923438;
                            var28 >>= 31;
                            var28 ^= -2023388805;
                            var138 = var4 + 1;
                            var138 = var4 * var138;
                            int var17 = var4 + 2;
                            var138 *= var17;
                            var17 = var4 + 3;
                            var138 *= var17;
                            var138 &= 7;
                            if (var138 != 0) {
                                break label125;
                            }

                            if (var105 < 0) {
                                var28 &= -1616613058;
                                var28 ^= -309804178;
                                break label124;
                            }
                            var28 = switch (var28) {
                                default -> var28 ^ -1977885775;
                                case 1709590154 -> var28 ^ -828542551;
                                case 2023388804 -> {
                                    var28 >>= 10;
                                    yield var28 ^ 240045916;
                                }
                            };
                            float var106 = var7 - 3.5F;
                            TextStyle var144 = wz;
                            var17 = var14 + 1;
                            var17 = var14 * var17;
                            var17 &= 1;
                            if (var17 == 0) {
                                var28 *= -1636428387;
                                var28 |= 1457808300;
                                var28 -= 90705276;
                                var28 >>= 19;
                                var28 ^= 194998569;
                                var17 = DP.nq(-4075035, var10);
                                TextStyle var145 = var144.color(var17);
                                float var107 = var1.textCentered("Same", var6, var106, var145);
                                var28 *= 1427122415;
                                var28 += -1857661758;
                                var28 ^= 534432662;
                                break label124;
                            }

                            switch (var28) {
                                case -1644941098:
                                default:
                                    var28 ^= -444839815;
                                    break;
                                case 240183745:
                                    var28 ^= -918951447;
                                    var28 |= 2092293469;
                                    var28 *= -1050964635;
                                    var28 ^= 1413079913;
                                    break;
                                case 1009051360:
                                    var28 ^= -362427454;
                            }
                        } else {
                            var28 *= 1518684417;
                            var28 |= -246679231;
                            var28 ^= 1665343811;
                        }
                    } else {
                        var28 ^= -1821964149;
                        var28 ^= 1302719569;
                        Integer var109 = var4;
                        if (var109 == null) {
                            break label125;
                        }

                        vw_2 var110 = this.SJ;
                        long var146 = var14;
                        long var175 = var146 + 1L;
                        var175 = var146 * var175;
                        long var20 = var146 + 2L;
                        var175 *= var20;
                        long var147 = var146 + 3L;
                        var175 *= var147;
                        long var148 = var175 & 7L;
                        long var189;
                        int var149 = (var189 = var148 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                        if (var149 == 0) {
                            var28 -= -337114023;
                            var28 |= 1127253779;
                            var28 ^= -1115719418;
                            var28 -= -1846060587;
                            var28 ^= -815827883;
                            vw_2 var111 = var110.c(0.5F, 0.0F, false, true);
                            var15 = kP_2.DRAWN;
                            if (var2 == var15) {
                                var28 &= 964846719;
                                var28 &= -245164268;
                                var28 &= 579273812;
                                var28 += -1896927867;
                                var28 ^= -294430807;
                                int var113 = var4 + 1;
                                int var114 = var4 * var113;
                                int var115 = var114 & 1;
                                if (var115 != 0) {
                                    break label125;
                                }

                                int var116 = var28 | 181032693;
                                int var117 = var116 & -11235727;
                                int var118 = var117 | -529141201;
                                int var119 = var118 >> 22;
                                int var120 = var119 ^ -475485127;
                                int var121 = s(var3, var120);
                                int var122 = Math.max(2, var121);
                                float var150 = var8 * 0.42F;
                                float var123 = var122;
                                float var124 = var123 + 0.5F;
                                Integer var168 = var14;
                                if (var168 != null) {
                                    switch (var28) {
                                        case -1129682778:
                                        default:
                                            var28 ^= 1296863749;
                                            break;
                                        case 1010223367:
                                            var28 ^= -1941918779;
                                            break;
                                        case 1083996720:
                                            var28 += 567681210;
                                            var28 ^= 602569015;
                                    }

                                    long var169 = var4;
                                    long var19 = var169 + 1L;
                                    var19 = var169 * var19;
                                    long var21 = var169 + 2L;
                                    var19 *= var21;
                                    long var170 = var169 + 3L;
                                    var19 *= var170;
                                    long var171 = var19 & 7L;
                                    long var190;
                                    int var172 = (var190 = var171 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                                    if (var172 == 0) {
                                        float var125 = var150 / var124;
                                        vw_2 var151 = this.SJ;
                                        vw_2 var152 = var151.D(var1, var6, var7, 1.0F, var125);
                                        vw_2 var153 = var152.gs(var4, var5, -1879048192);
                                        var153.Y(var3, var125, var10);
                                        return;
                                    }
                                    break label125;
                                }

                                var28 -= -1843833281;
                                var28 |= 1978309318;
                                var28 ^= 1632068559;
                            } else {
                                var28 = switch (var28) {
                                    case -208660323 -> {
                                        var28 &= -1681097124;
                                        var28 >>>= 4;
                                        yield var28 ^ 360630703;
                                    }
                                    case 742659246 -> var28 ^ -2018883995;
                                    default -> var28 ^ 1338699259;
                                };
                                Integer var126 = var4;
                                if (var126 == null) {
                                    break label125;
                                }

                                VA var127 = this.fg;
                                BooleanSetting var154 = this.XD;
                                int var155 = (var154.vb()) ? 1 : 0;
                                VA var128 = var127.E(4.0F, 2.0F, 1.0F, (var155 != 0), var9);
                                float var129 = var8 * 0.4F;
                                float var130 = var129 / 7.0F;
                                var155 = var14 + 1;
                                var155 = var14 * var155;
                                int var173 = var14 + 2;
                                var155 *= var173;
                                var14 += 3;
                                var155 *= var14;
                                var14 = var155 & 7;
                                if (var14 == 0) {
                                    var28 &= 1792165881;
                                    var28 += 814445575;
                                    var28 ^= -607631302;
                                    long var160 = var4;
                                    var175 = var160 + 1L;
                                    var175 = var160 * var175;
                                    var20 = var160 + 2L;
                                    var175 *= var20;
                                    long var161 = var160 + 3L;
                                    var175 *= var161;
                                    long var162 = var175 & 7L;
                                    long var191;
                                    var14 = (var191 = var162 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                                    if (var14 == 0) {
                                        vw_2 var131 = this.SJ;
                                        vw_2 var102 = var131.D(var1, var6, var7, var130, 1.0F);
                                        vw_2 var103 = var102.gs(var4, var5, -1879048192);
                                        VA var132 = this.fg;
                                        var103.BA(var2, var132, var10);
                                        return;
                                    }
                                    break label125;
                                }

                                switch (var28) {
                                    case -715087523:
                                    default:
                                        var28 ^= -268107371;
                                        break;
                                    case 474400814:
                                        var28 &= -930701880;
                                        var28 += 295340086;
                                        var28 |= 1532057145;
                                        var28 ^= -983724537;
                                        break;
                                    case 1785062898:
                                        var28 ^= -600477922;
                                }
                            }
                        } else {
                            var28 &= -1318934865;
                            var28 &= 63869598;
                            var28 ^= -1632838982;
                        }
                    }
                }

                int var93 = var4 + 1;
                var93 = var4 * var93;
                var93 &= 1;
                if (var93 == 0) {
                    IllegalArgumentException var96 = new IllegalArgumentException();
                    throw var96;
                }
                break label125;
            }

            Integer var108 = var4;
            if (var108 != null) {
                return;
            }
        }

        RuntimeException var97 = new RuntimeException();
        throw var97;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 485195171;
        int var2 = Module.C;
        int var4 = of_2.kj(var3, var1, var2);
        cm = var4;
        kP_2[] var5 = new kP_2[11];
        kP_2 var8 = kP_2.CLASSIC;
        var5[0] = var8;
        kP_2 var9 = kP_2.DIAGONAL;
        var5[1] = var9;
        kP_2 var10 = kP_2.CIRCLE_DOT;
        var5[2] = var10;
        kP_2 var11 = kP_2.T_SHAPE;
        var5[3] = var11;
        kP_2 var12 = kP_2.BRACKETS;
        var5[4] = var12;
        kP_2 var13 = kP_2.CHEVRON;
        var5[5] = var13;
        kP_2 var14 = kP_2.TRIAD;
        var5[6] = var14;
        kP_2 var15 = kP_2.BURST;
        var5[7] = var15;
        kP_2 var16 = kP_2.KILL_X;
        var5[8] = var16;
        kP_2 var17 = kP_2.PLUS;
        var5[9] = var17;
        kP_2 var18 = kP_2.SNIPER;
        var5[10] = var18;
        se = var5;
        TextStyle var6 = TextStyle.of(6.5F, -4075035);
        TextStyle var7 = var6.medium();
        wz = var7;
    }
}
