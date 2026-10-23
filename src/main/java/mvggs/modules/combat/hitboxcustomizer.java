package mvggs.modules.combat;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;

public final class hitboxcustomizer extends Module {
    private static final int[] Ob;
    private final ModeSetting t;
    private final ModeSetting jV;
    private final NumberSetting O;
    private final NumberSetting v;
    private final NumberSetting Qi;
    private final NumberSetting Fq;
    private final NumberSetting av;
    private final zS p;
    private final BooleanSetting L;
    private final ColorSetting T;
    private final BooleanSetting yy;
    private final BooleanSetting l;
    private final NumberSetting h;
    private final double[] Lu;
    private final double[] Re;
    private final double[] G;
    private int K;
    public static final int HZ;

    public hitboxcustomizer() {
        super("hitbox_customizer", "Hitbox Customizer", ModuleCategory.COMBAT);
        ModuleCategory var1 = ModuleCategory.COMBAT;

        h_2 var2 = h_2.CORNERS;
        ModeSetting var4 = new ModeSetting("style", "Style", var2);
        Setting var5 = this.addSetting(var4);
        ModeSetting var6 = (ModeSetting)var5;
        this.t = var6;
        f_2 var63 = f_2.PLAYERS;
        ModeSetting var7 = new ModeSetting("targets", "Targets", var63);
        Setting var8 = this.addSetting(var7);
        ModeSetting var9 = (ModeSetting)var8;
        this.jV = var9;
        NumberSetting var10 = new NumberSetting("line_width", "Line Width", 1.0F, 0.5F, 3.0F);
        NumberSetting var11 = var10.W(0.1F);
        Setting var12 = this.addSetting(var11);
        NumberSetting var13 = (NumberSetting)var12;
        this.O = var13;
        NumberSetting var14 = new NumberSetting("opacity", "Opacity", 85.0F, 10.0F, 100.0F);
        NumberSetting var15 = var14.W(1.0F);
        NumberSetting var16 = var15.L("%");
        Setting var17 = this.addSetting(var16);
        NumberSetting var18 = (NumberSetting)var17;
        this.v = var18;
        NumberSetting var19 = new NumberSetting("fill", "Fill Opacity", 12.0F, 0.0F, 40.0F);
        NumberSetting var20 = var19.W(1.0F);
        NumberSetting var21 = var20.L("%");
        BooleanSupplier var64 = () -> {
            label64: {
                int var32x;
                int var47x;
                label68: {
                    var32x = HZ;
                    var32x ^= 1986599829;
                    var47x = System.identityHashCode(this);
                    ModeSetting var3x = this.t;
                    h_2 var4x = h_2.GLASS;
                    int var5x = var47x + 1;
                    var5x = var47x * var5x;
                    var5x &= 1;
                    label61:
                    if (var5x == 0) {
                        var32x ^= -1413927492;
                        var32x ^= 1008079051;
                        Integer var73 = var32x;
                        if (var73 == null) {
                            break label64;
                        }

                        boolean var48x = var3x.TJ(var4x);
                        if (!var48x) {
                            var32x = switch (var32x) {
                                default -> var32x ^ 1463230277;
                                case -1076203586 -> {
                                    var32x += 402106002;
                                    var32x &= 109916205;
                                    yield var32x ^ -507089330;
                                }
                                case 1730394922 -> var32x ^ 458976379;
                            };
                            long var49x = var32x;
                            long var74 = var49x + 1L;
                            long var75 = var49x * var74;
                            long var7x = var49x + 2L;
                            long var76 = var75 * var7x;
                            long var50x = var49x + 3L;
                            long var77 = var76 * var50x;
                            long var51x = var77 & 7L;
                            long var92;
                            int var52x = (var92 = var51x - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                            if (var52x != 0) {
                                break label64;
                            }

                            var3x = this.t;
                            var4x = h_2.SCAN;
                            boolean var54x = var3x.TJ(var4x);
                            int var64x = var47x + 1;
                            int var65x = var47x * var64x;
                            int var78 = var47x + 2;
                            int var66x = var65x * var78;
                            var47x += 3;
                            int var67x = var66x * var47x;
                            var47x = var67x & 7;
                            if (var47x != 0) {
                                var32x *= -1894796101;
                                var32x &= -813577618;
                                var32x ^= -942627975;
                                break label61;
                            }

                            var32x -= -1188070606;
                            var32x ^= -509716159;
                            long var68 = var32x;
                            long var6x = var68 + 1L;
                            var6x = var68 * var6x;
                            long var8x = var68 + 2L;
                            var6x *= var8x;
                            long var69 = var68 + 3L;
                            var6x *= var69;
                            long var70 = var6x & 7L;
                            long var93;
                            var47x = (var93 = var70 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                            if (var47x != 0) {
                                break label64;
                            }

                            if (!var54x) {
                                var32x ^= -562176628;
                                var32x *= 2029635497;
                                var32x |= -991578458;
                                var32x ^= 2109691834;
                                var47x = 0;
                                var32x += 1937177360;
                                var32x |= 1346061549;
                                var32x -= -601648656;
                                var32x |= 1256709927;
                                var32x ^= -2504985;
                                break label68;
                            }

                            var32x += -1595536939;
                            var32x *= -1056981769;
                            var32x <<= 29;
                            var32x ^= -2119722080;
                        } else {
                            var32x |= -2130443116;
                            var32x >>= 9;
                            var32x ^= -1099402089;
                        }

                        long var55x = var32x;
                        long var79 = var55x + 1L;
                        long var80 = var55x * var79;
                        long var90 = var55x + 2L;
                        long var81 = var80 * var90;
                        long var56x = var55x + 3L;
                        long var82 = var81 * var56x;
                        long var57x = var82 & 7L;
                        long var94;
                        int var58x = (var94 = var57x - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                        if (var58x != 0) {
                            break label64;
                        }

                        var47x = 1;
                        var32x &= 941974946;
                        var32x |= 387887366;
                        var32x += 2095600946;
                        var32x |= 1335883018;
                        var32x ^= -895881710;
                        break label68;
                    } else {
                        var32x >>= 29;
                        var32x ^= -1907250926;
                    }

                    Integer var35x = var32x;
                    if (var35x != null) {
                        UnsupportedOperationException var36x = new UnsupportedOperationException();
                        throw var36x;
                    }
                    break label64;
                }

                long var59x = var32x;
                long var83 = var59x + 1L;
                var83 = var59x * var83;
                long var91 = var59x + 2L;
                var83 *= var91;
                var59x += 3L;
                var83 *= var59x;
                var59x = var83 & 7L;
                long var95;
                int var62x = (var95 = var59x - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                if (var62x == 0) {
                    return (var47x != 0);
                }
            }

            IllegalStateException var43x = new IllegalStateException();
            throw var43x;
        };
        Setting var22 = var21.Pt(var64);
        NumberSetting var23 = (NumberSetting)var22;
        Setting var24 = this.addSetting(var23);
        NumberSetting var25 = (NumberSetting)var24;
        this.Qi = var25;
        NumberSetting var26 = new NumberSetting("corners", "Corner Length", 25.0F, 10.0F, 45.0F);
        NumberSetting var27 = var26.W(1.0F);
        NumberSetting var28 = var27.L("%");
        BooleanSupplier var65 = () -> {
            int var1x = HZ;
            var1x ^= 1850879683;
            int var2x = System.identityHashCode(this);
            ModeSetting var3x = this.t;
            h_2 var4x = h_2.CORNERS;
            long var5x = var2x;
            long var7x = var5x + 1L;
            var7x = var5x * var7x;
            long var9x = var5x + 2L;
            var7x *= var9x;
            var5x += 3L;
            var7x *= var5x;
            var5x = var7x & 7L;
            long var38x;
            var2x = (var38x = var5x - 0L) == 0L ? 0 : (var38x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x ^= 340884963;
                var1x -= 2061540847;
                var1x |= 479136966;
                var1x ^= 1899020631;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    return var3x.TJ(var4x);
                }
            } else {
                var1x >>= 4;
                var1x ^= 1771063456;
                long var18x = var1x;
                long var28x = var18x + 1L;
                long var29x = var18x * var28x;
                var5x = var18x + 2L;
                long var30x = var29x * var5x;
                long var19x = var18x + 3L;
                long var31x = var30x * var19x;
                long var20x = var31x & 7L;
                long var39x;
                var1x = (var39x = var20x - 0L) == 0L ? 0 : (var39x < 0L ? -1 : 1);
                if (var1x == 0) {
                    RuntimeException var23x = new RuntimeException();
                    throw var23x;
                }
            }

            UnsupportedOperationException var22x = new UnsupportedOperationException();
            throw var22x;
        };
        Setting var29 = var28.Pt(var65);
        NumberSetting var30 = (NumberSetting)var29;
        Setting var31 = this.addSetting(var30);
        NumberSetting var32 = (NumberSetting)var31;
        this.Fq = var32;
        NumberSetting var33 = new NumberSetting("glow", "Glow", 0.35F, 0.0F, 1.0F);
        NumberSetting var34 = var33.W(0.05F);
        Setting var35 = this.addSetting(var34);
        NumberSetting var36 = (NumberSetting)var35;
        this.av = var36;
        zS var37 = new zS();
        nM var38 = this.bU(var37);
        zS var39 = (zS)var38;
        this.p = var39;
        BooleanSetting var40 = new BooleanSetting("hurt_flash", "Hurt Flash", true);
        Setting var41 = this.addSetting(var40);
        BooleanSetting var42 = (BooleanSetting)var41;
        this.L = var42;
        ColorSetting var43 = new ColorSetting("hurt_color", "Hurt Color", -32357, false);
        BooleanSetting var66 = this.L;
        Object var3 = Objects.requireNonNull(var66);
        BooleanSupplier var67 = var66::vb;
        Setting var44 = var43.Pt(var67);
        ColorSetting var45 = (ColorSetting)var44;
        Setting var46 = this.addSetting(var45);
        ColorSetting var47 = (ColorSetting)var46;
        this.T = var47;
        BooleanSetting var48 = new BooleanSetting("eye_line", "Eye Line", false);
        Setting var49 = this.addSetting(var48);
        BooleanSetting var50 = (BooleanSetting)var49;
        this.yy = var50;
        BooleanSetting var51 = new BooleanSetting("self", "Self in Third Person", false);
        Setting var52 = this.addSetting(var51);
        BooleanSetting var53 = (BooleanSetting)var52;
        this.l = var53;
        NumberSetting var54 = new NumberSetting("range", "Range", 32.0F, 4.0F, 96.0F);
        NumberSetting var55 = var54.W(1.0F);
        NumberSetting var56 = var55.L("m");
        Setting var57 = this.addSetting(var56);
        NumberSetting var58 = (NumberSetting)var57;
        this.h = var58;
        double[] var59 = new double[8];
        this.Lu = var59;
        double[] var60 = new double[8];
        this.Re = var60;
        double[] var61 = new double[8];
        this.G = var61;
        this.dy("Precise outlines, glowing corners, glass or scanning boxes. Theme, gradient and rainbow colors.");
        EventListener<RenderEvent> var62 = this::z;
        this.onEvent(RenderEvent.class, var62);
    }

    public int h() {
        int var1 = HZ;
        var1 ^= -1238902913;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 == null) {
            var1 *= 616876173;
            var1 *= 753081273;
            var1 *= 1746333737;
            var1 ^= 614088737;
            UnsupportedOperationException var14 = new UnsupportedOperationException();
            throw var14;
        } else {
            var1 -= 1827217140;
            var1 ^= 722489433;
            var1 <<= 20;
            var1 >>= 24;
            var1 ^= 1001250112;
            return this.K;
        }
    }

    private void z(RenderEvent var1) {
        label433: {
            int var204;
            label432: {
                label453: {
                    var204 = HZ;
                    var204 ^= 2095819873;
                    int var3 = System.identityHashCode(this);
                    RenderPhase var4 = var1.phase();
                    RenderPhase var5 = RenderPhase.WORLD;
                    Integer var6 = var3;
                    if (var6 == null) {
                        var204 ^= -304552658;
                        var204 |= 1349913957;
                        var204 ^= -1334692082;
                    } else {
                        var204 *= -2130132013;
                        var204 &= 1443929357;
                        var204 ^= 1274376012;
                        if (var4 != var5) {
                            var204 *= -1147056001;
                            var204 ^= -658990299;
                            long var261 = var204;
                            long var297 = var261 + 1L;
                            long var298 = var261 * var297;
                            long var262 = var298 & 1L;
                            long var477;
                            int var263 = (var477 = var262 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                            if (var263 == 0) {
                                return;
                            }
                            break label433;
                        }
                        var204 = switch (var204) {
                            default -> var204 ^ 1306049248;
                            case -40913489 -> var204 ^ 446947431;
                            case 1340434249 -> {
                                var204 &= -646879609;
                                var204 += 372761903;
                                yield var204 ^ 256434276;
                            }
                        };
                        Integer var254 = var204;
                        if (var254 == null) {
                            break label433;
                        }

                        this.K = 0;
                        long var255 = var3;
                        long var283 = var255 + 1L;
                        long var284 = var255 * var283;
                        long var8 = var255 + 2L;
                        long var285 = var284 * var8;
                        long var256 = var255 + 3L;
                        long var286 = var285 * var256;
                        long var257 = var286 & 7L;
                        long var463;
                        int var258 = (var463 = var257 - 0L) == 0L ? 0 : (var463 < 0L ? -1 : 1);
                        if (var258 != 0) {
                            var204 &= -568489917;
                            var204 &= 113421392;
                            var204 ^= 1863168569;
                        } else {
                            var204 = switch (var204) {
                                case -860746676 -> var204 ^ 1186691863;
                                default -> var204 ^ -23861308;
                                case 1355918164 -> {
                                    var204 ^= -31157787;
                                    var204 <<= 20;
                                    yield var204 ^ 204983593;
                                }
                            };
                            Entity var259 = i_2.QI();
                            Entity var260 = var259;
                            if (var259 == null) {
                                var204 += 379981443;
                                var204 -= -971665685;
                                var204 >>>= 26;
                                var204 ^= 1174894336;
                                break label453;
                            }

                            var204 += -1630747532;
                            var204 -= 45043619;
                            var204 ^= -1039023597;
                            long var268 = var204;
                            long var7 = var268 + 1L;
                            var7 = var268 * var7;
                            long var9 = var268 + 2L;
                            var7 *= var9;
                            long var269 = var268 + 3L;
                            var7 *= var269;
                            long var270 = var7 & 7L;
                            long var464;
                            int var271 = (var464 = var270 - 0L) == 0L ? 0 : (var464 < 0L ? -1 : 1);
                            if (var271 != 0) {
                                break label433;
                            }

                            FrameContext var272 = var1.frame();
                            int var287 = var3 + 1;
                            var287 = var3 * var287;
                            int var303 = var3 + 2;
                            var287 *= var303;
                            int var304 = var3 + 3;
                            var287 *= var304;
                            var287 &= 7;
                            if (var287 != 0) {
                                var204 *= -967591907;
                                var204 += 940587761;
                                var204 ^= -118448593;
                            } else {
                                var204 >>= 19;
                                var204 *= 1843891321;
                                var204 ^= -1861990623;
                                long var292 = var204;
                                var8 = var292 + 1L;
                                var8 = var292 * var8;
                                long var293 = var8 & 1L;
                                long var465;
                                var287 = (var465 = var293 - 0L) == 0L ? 0 : (var465 < 0L ? -1 : 1);
                                if (var287 != 0) {
                                    break label433;
                                }

                                boolean var273 = var272.hideGui();
                                if (var273) {
                                    switch (var204) {
                                        case -2003059091:
                                        default:
                                            var204 ^= -750458689;
                                            break label453;
                                        case 506543355:
                                            var204 |= -1756073875;
                                            var204 |= -1479001295;
                                            var204 ^= -1634561720;
                                            var204 ^= -523554208;
                                            var204 ^= -2019316758;
                                            break label453;
                                        case 848918103:
                                            var204 ^= 1757279549;
                                            break label453;
                                    }
                                }

                                var204 |= 1232767828;
                                var204 ^= -868327084;
                                long var274 = var204;
                                var7 = var274 + 1L;
                                var7 = var274 * var7;
                                long var275 = var7 & 1L;
                                long var466;
                                int var276 = (var466 = var275 - 0L) == 0L ? 0 : (var466 < 0L ? -1 : 1);
                                if (var276 != 0) {
                                    break label433;
                                }

                                ClientRuntime var277 = ClientRuntime.Z();
                                AuraPipeline var278 = var277.Ul();
                                WorldDraw var279 = var278.world();
                                WorldDraw var280 = var279;
                                Canvas var295 = var1.canvas();
                                Canvas var296 = var295;
                                NumberSetting var307 = this.h;
                                float var308 = var307.WM();
                                NumberSetting var314 = this.h;
                                float var315 = var314.WM();
                                float var309 = var308 * var315;
                                double var310 = var309;
                                double var311 = var310;
                                ClientRuntime var316 = ClientRuntime.Z();
                                V var317 = var316.bA();
                                Entity var318 = var317.i();
                                int var10 = var3 + 1;
                                var10 = var3 * var10;
                                var10 &= 1;
                                if (var10 != 0) {
                                    switch (var204) {
                                        case -2062657044:
                                            var204 ^= -365364020;
                                            break;
                                        case -1824137557:
                                            var204 >>>= 8;
                                            var204 ^= 1872658343;
                                            break;
                                        case 1316176712:
                                        default:
                                            var204 ^= -1941102895;
                                    }
                                } else {
                                    var204 &= 1226419855;
                                    var204 >>>= 15;
                                    var204 ^= -1592294166;
                                    Integer var322 = var204;
                                    if (var322 == null) {
                                        break label433;
                                    }

                                    Entity var319 = var318;
                                    Iterable var323 = i_2.S();
                                    Iterator var324 = var323.iterator();
                                    Iterator var325 = var324;
                                    var204 &= -1378647236;
                                    var204 -= 1976668833;
                                    var204 ^= 715002326;

                                    label429:
                                    while (true) {
                                        int var11 = (var325.hasNext()) ? 1 : 0;
                                        Integer var12 = var3;
                                        if (var12 == null) {
                                            var204 -= 776378505;
                                            var204 -= 2061612601;
                                            var204 ^= -1119002902;
                                            var204 += -1822903768;
                                            var204 ^= 375298548;
                                            break;
                                        }

                                        var204 -= 341583047;
                                        var204 ^= 384325963;
                                        var204 *= 1279220789;
                                        var204 *= 177952781;
                                        var204 ^= -1068185028;
                                        int var345 = var204 + 1;
                                        var345 = var204 * var345;
                                        var345 &= 1;
                                        if (var345 != 0) {
                                            break label433;
                                        }

                                        if (var11 == 0) {
                                            switch (var204) {
                                                case -1065790902:
                                                    var204 ^= 1591942265;
                                                    break label432;
                                                case -563597998:
                                                default:
                                                    var204 ^= -1701291766;
                                                    break label432;
                                                case 2018877773:
                                                    var204 <<= 31;
                                                    var204 ^= -16855415;
                                                    break label432;
                                            }
                                        }

                                        var204 >>>= 23;
                                        var204 |= 376807172;
                                        var204 *= 264714777;
                                        var204 ^= 1270702447;
                                        Object var326 = var325.next();
                                        Entity var327 = (Entity)var326;
                                        var345 = var3 + 1;
                                        var345 = var3 * var345;
                                        var345 &= 1;
                                        if (var345 != 0) {
                                            var204 &= -1550072941;
                                            var204 *= -475512381;
                                            var204 ^= 1828827520;
                                            break;
                                        }

                                        var204 -= -491687395;
                                        var204 += -1434623713;
                                        var204 ^= 1521593220;
                                        int var351 = (var327 instanceof LivingEntity) ? 1 : 0;
                                        if (var351 != 0) {
                                            var204 *= -1404565301;
                                            var204 ^= -1945008870;
                                            var351 = var204 + 1;
                                            var351 = var204 * var351;
                                            int var13 = var204 + 2;
                                            var351 *= var13;
                                            var13 = var204 + 3;
                                            var351 *= var13;
                                            var351 &= 7;
                                            if (var351 != 0) {
                                                break label433;
                                            }

                                            LivingEntity var357 = (LivingEntity)var327;
                                            Integer var359 = var3;
                                            if (var359 == null) {
                                                var204 -= 1631179636;
                                                var204 |= -1539775050;
                                                var204 ^= -1020082226;
                                                break;
                                            }
                                            var204 = switch (var204) {
                                                default -> var204 ^ -34035803;
                                                case 156873001 -> {
                                                    var204 &= -1140281281;
                                                    var204 <<= 22;
                                                    yield var204 ^ -236845716;
                                                }
                                                case 520347610 -> var204 ^ -1474827546;
                                            };
                                            boolean var360 = var327.isAlive();
                                            if (var360) {
                                                var204 >>>= 23;
                                                var204 &= 987143032;
                                                var204 ^= 523500962;
                                                var204 *= 1268934741;
                                                var204 ^= -1890211112;
                                                boolean var361 = var327.isInvisible();
                                                Integer var14 = var3;
                                                if (var14 == null) {
                                                    switch (var204) {
                                                        case -422208900:
                                                            var204 ^= -648306983;
                                                            break label429;
                                                        case 405402439:
                                                        default:
                                                            var204 ^= -1246348187;
                                                            break label429;
                                                        case 1921641314:
                                                            var204 ^= 763494849;
                                                            var204 += 1608128617;
                                                            var204 ^= -773113483;
                                                            break label429;
                                                    }
                                                }
                                                var204 = switch (var204) {
                                                    case -978014690 -> var204 ^ 422863175;
                                                    default -> var204 ^ -331707116;
                                                    case 1921641314 -> {
                                                        var204 -= -328709759;
                                                        var204 |= 15159217;
                                                        var204 -= -1493894229;
                                                        var204 += -1571351286;
                                                        yield var204 ^ -607000537;
                                                    }
                                                };
                                                var14 = var204;
                                                if (var14 == null) {
                                                    break label433;
                                                }

                                                if (!var361) {
                                                    var204 ^= 420940734;
                                                    var204 ^= 1395433876;
                                                    long var362 = var204;
                                                    long var15 = var362 + 1L;
                                                    var15 = var362 * var15;
                                                    long var17 = var362 + 2L;
                                                    var15 *= var17;
                                                    long var363 = var362 + 3L;
                                                    var15 *= var363;
                                                    long var364 = var15 & 7L;
                                                    long var467;
                                                    int var365 = (var467 = var364 - 0L) == 0L ? 0 : (var467 < 0L ? -1 : 1);
                                                    if (var365 != 0) {
                                                        break label433;
                                                    }

                                                    int var366 = (var327.isSpectator()) ? 1 : 0;
                                                    int var402 = var3 + 1;
                                                    var402 = var3 * var402;
                                                    int var439 = var3 + 2;
                                                    var402 *= var439;
                                                    int var440 = var3 + 3;
                                                    var402 *= var440;
                                                    var402 &= 7;
                                                    if (var402 != 0) {
                                                        var204 -= -591720170;
                                                        var204 ^= 1508376638;
                                                        break;
                                                    }

                                                    var204 += -1318686220;
                                                    var204 += 557648325;
                                                    var204 ^= -703139525;
                                                    Integer var407 = var204;
                                                    if (var407 == null) {
                                                        break label433;
                                                    }

                                                    if (var366 != 0) {
                                                        var204 *= 1716698915;
                                                        var204 ^= -645113697;
                                                        var204 ^= -1345866034;
                                                        var366 = var204 + 1;
                                                        var366 = var204 * var366;
                                                        var366 &= 1;
                                                        if (var366 != 0) {
                                                            break label433;
                                                        }

                                                        var204 += 423172204;
                                                        var204 &= -53598719;
                                                        var204 *= 2075197473;
                                                        var204 ^= 76765777;
                                                    } else {
                                                        var204 *= -1538709581;
                                                        var204 ^= 1024390599;
                                                        Integer var367 = var204;
                                                        if (var367 == null) {
                                                            break label433;
                                                        }

                                                        if (var327 == var260) {
                                                            var204 += -1108506725;
                                                            var204 -= 1557401141;
                                                            var204 ^= 120636271;
                                                            int var368 = var204 + 1;
                                                            var368 = var204 * var368;
                                                            int var408 = var204 + 2;
                                                            var368 *= var408;
                                                            var408 = var204 + 3;
                                                            var368 *= var408;
                                                            var368 &= 7;
                                                            if (var368 != 0) {
                                                                break label433;
                                                            }

                                                            BooleanSetting var373 = this.l;
                                                            var408 = var3 + 1;
                                                            var408 = var3 * var408;
                                                            var408 &= 1;
                                                            if (var408 != 0) {
                                                                var204 >>= 15;
                                                                var204 ^= -1994978772;
                                                                var204 -= -735247627;
                                                                var204 ^= -843702728;
                                                                break;
                                                            }
                                                            var204 = switch (var204) {
                                                                case -1928150321 -> var204 ^ -2045820048;
                                                                case -1769144199 -> {
                                                                    var204 |= -1060629295;
                                                                    var204 <<= 9;
                                                                    var204 *= 1368348833;
                                                                    var204 &= -909746615;
                                                                    yield var204 ^ -859240352;
                                                                }
                                                                default -> var204 ^ -2074504333;
                                                            };
                                                            boolean var374 = var373.vb();
                                                            if (!var374) {
                                                                var204 ^= 697205536;
                                                                var204 &= 1231797837;
                                                                var204 *= -930190889;
                                                                var204 |= -885881744;
                                                                var204 ^= -563584095;
                                                                continue;
                                                            }
                                                            var204 = switch (var204) {
                                                                default -> var204 ^ 1636687849;
                                                                case 1162418784 -> {
                                                                    var204 -= -807187090;
                                                                    var204 <<= 2;
                                                                    yield var204 ^ -1452485824;
                                                                }
                                                                case 1972566669 -> var204 ^ -1189673895;
                                                            };
                                                            var374 = i_2.ax();
                                                            long var413 = var3;
                                                            long var16 = var413 + 1L;
                                                            var16 = var413 * var16;
                                                            long var18 = var413 + 2L;
                                                            var16 *= var18;
                                                            long var414 = var413 + 3L;
                                                            var16 *= var414;
                                                            long var415 = var16 & 7L;
                                                            long var468;
                                                            var408 = (var468 = var415 - 0L) == 0L ? 0 : (var468 < 0L ? -1 : 1);
                                                            if (var408 != 0) {
                                                                var204 *= -1438069667;
                                                                var204 ^= -73282799;
                                                                break;
                                                            }

                                                            var204 *= -796647411;
                                                            var204 ^= -508426802;
                                                            Integer var417 = var204;
                                                            if (var417 == null) {
                                                                break label433;
                                                            }

                                                            if (var374) {
                                                                var204 >>>= 31;
                                                                var204 ^= 815453353;
                                                                Integer var376 = var204;
                                                                if (var376 == null) {
                                                                    break label433;
                                                                }

                                                                var204 >>= 4;
                                                                var204 ^= 47600411;
                                                                continue;
                                                            }

                                                            var204 *= 1056811247;
                                                            var204 >>= 11;
                                                            var204 ^= 1352005830;
                                                            var204 ^= -524387335;
                                                        } else {
                                                            var204 &= 1227226897;
                                                            var204 &= -1052676110;
                                                            var204 &= -838290888;
                                                            var204 ^= 1339418495;
                                                        }

                                                        ModeSetting var377 = this.jV;
                                                        long var418 = var3;
                                                        long var449 = var418 + 1L;
                                                        var449 = var418 * var449;
                                                        long var461 = var418 + 2L;
                                                        var449 *= var461;
                                                        long var419 = var418 + 3L;
                                                        var449 *= var419;
                                                        long var420 = var449 & 7L;
                                                        long var469;
                                                        int var421 = (var469 = var420 - 0L) == 0L ? 0 : (var469 < 0L ? -1 : 1);
                                                        if (var421 == 0) {
                                                            var204 |= -152444958;
                                                            var204 += 32446333;
                                                            var204 ^= 653003470;
                                                            var204 ^= 1249380931;
                                                            var204 ^= 1108621710;
                                                            var421 = var204 + 1;
                                                            var421 = var204 * var421;
                                                            var421 &= 1;
                                                            if (var421 != 0) {
                                                                break label433;
                                                            }

                                                            f_2 var425 = f_2.PLAYERS;
                                                            boolean var378 = var377.TJ(var425);
                                                            if (var378) {
                                                                var204 -= -1517827526;
                                                                var204 += -900197451;
                                                                var204 -= 841911560;
                                                                var204 <<= 13;
                                                                var204 ^= 481907890;
                                                                var367 = var204;
                                                                if (var367 == null) {
                                                                    break label433;
                                                                }

                                                                boolean var380 = var327 instanceof PlayerEntity;
                                                                long var426 = var3;
                                                                var449 = var426 + 1L;
                                                                var449 = var426 * var449;
                                                                long var427 = var449 & 1L;
                                                                long var470;
                                                                var421 = (var470 = var427 - 0L) == 0L ? 0 : (var470 < 0L ? -1 : 1);
                                                                if (var421 != 0) {
                                                                    var204 ^= 150328756;
                                                                    var204 += 441172064;
                                                                    var204 ^= -1940800737;
                                                                    break;
                                                                }

                                                                var204 ^= -202210954;
                                                                var204 <<= 28;
                                                                var204 ^= 1401195985;
                                                                var204 += 559296709;
                                                                var204 ^= 17979360;
                                                                long var429 = var204;
                                                                var449 = var429 + 1L;
                                                                var449 = var429 * var449;
                                                                var461 = var429 + 2L;
                                                                var449 *= var461;
                                                                long var430 = var429 + 3L;
                                                                var449 *= var430;
                                                                long var431 = var449 & 7L;
                                                                long var471;
                                                                var421 = (var471 = var431 - 0L) == 0L ? 0 : (var471 < 0L ? -1 : 1);
                                                                if (var421 != 0) {
                                                                    break label433;
                                                                }

                                                                if (!var380) {
                                                                    var204 ^= -1925985952;
                                                                    var204 -= 214787969;
                                                                    var204 ^= -776300769;
                                                                    var204 <<= 24;
                                                                    var204 ^= 1476896907;
                                                                    var367 = var204;
                                                                    if (var367 == null) {
                                                                        break label433;
                                                                    }

                                                                    var204 += 348289176;
                                                                    var204 &= 907133894;
                                                                    var204 -= 116878869;
                                                                    var204 -= -486394930;
                                                                    var204 ^= 1037672782;
                                                                    continue;
                                                                }

                                                                switch (var204) {
                                                                    case -611028094:
                                                                        var204 ^= 1666560557;
                                                                        break;
                                                                    case 902359414:
                                                                        var204 |= -1285085537;
                                                                        var204 -= 1527083932;
                                                                        var204 ^= -1562283904;
                                                                        break;
                                                                    case 1577335913:
                                                                    default:
                                                                        var204 ^= 1734868452;
                                                                }
                                                            } else {
                                                                switch (var204) {
                                                                    case 172137493:
                                                                        var204 ^= -473516232;
                                                                        break;
                                                                    case 795684463:
                                                                        var204 >>= 15;
                                                                        var204 -= 957113293;
                                                                        var204 ^= 955840494;
                                                                        break;
                                                                    case 1863932164:
                                                                    default:
                                                                        var204 ^= -351574214;
                                                                }
                                                            }

                                                            var367 = var204;
                                                            if (var367 == null) {
                                                                break label433;
                                                            }

                                                            ModeSetting var383 = this.jV;
                                                            Integer var433 = var3;
                                                            if (var433 != null) {
                                                                var204 *= 1112583803;
                                                                var204 &= -171846206;
                                                                var204 ^= 2111558684;
                                                                var433 = var204;
                                                                if (var433 == null) {
                                                                    break label433;
                                                                }

                                                                f_2 var435 = f_2.COMBAT_TARGET;
                                                                boolean var384 = var383.TJ(var435);
                                                                if (var384) {
                                                                    var204 = switch (var204) {
                                                                        default -> var204 ^ -1212575398;
                                                                        case 1690826905 -> var204 ^ 1995277162;
                                                                        case 1759151388 -> {
                                                                            var204 ^= -1246699988;
                                                                            var204 >>>= 19;
                                                                            var204 >>>= 1;
                                                                            yield var204 ^ 475582512;
                                                                        }
                                                                    };
                                                                    var367 = var204;
                                                                    if (var367 == null) {
                                                                        break label433;
                                                                    }

                                                                    if (var327 != var319) {
                                                                        var204 ^= 773994980;
                                                                        var204 -= -1254460147;
                                                                        var204 += 1976035795;
                                                                        var204 ^= -1340912507;
                                                                        var204 <<= 15;
                                                                        var204 ^= -1946583471;
                                                                        continue;
                                                                    }

                                                                    switch (var204) {
                                                                        case -1916552981:
                                                                        default:
                                                                            var204 ^= 1550872793;
                                                                            break;
                                                                        case 475586022:
                                                                            var204 |= 334782166;
                                                                            var204 <<= 17;
                                                                            var204 ^= 1343865014;
                                                                            break;
                                                                        case 1777373024:
                                                                            var204 ^= 1301162836;
                                                                    }
                                                                } else {
                                                                    switch (var204) {
                                                                        case 576111876:
                                                                        default:
                                                                            var204 ^= 243128546;
                                                                            break;
                                                                        case 687751098:
                                                                            var204 ^= 744038998;
                                                                            break;
                                                                        case 1759151388:
                                                                            var204 <<= 6;
                                                                            var204 ^= -1080186274;
                                                                            var204 ^= 2018770053;
                                                                            var204 ^= 513462637;
                                                                    }
                                                                }

                                                                var367 = var204;
                                                                if (var367 == null) {
                                                                    break label433;
                                                                }

                                                                double var387 = var327.squaredDistanceTo(var260);
                                                                double var472;
                                                                var11 = (var472 = var387 - var311) == 0.0 ? 0 : (var472 < 0.0 ? -1 : 1);
                                                                Integer var441 = var3;
                                                                if (var441 == null) {
                                                                    var204 -= -145675138;
                                                                    var204 &= -1161770818;
                                                                    var204 &= 1068068717;
                                                                    var204 ^= 1468873297;
                                                                    break;
                                                                }

                                                                var204 ^= -1091086083;
                                                                var204 ^= 1276711764;
                                                                var15 = var204;
                                                                var17 = var15 + 1L;
                                                                var17 = var15 * var17;
                                                                var15 = var17 & 1L;
                                                                long var473;
                                                                int var444 = (var473 = var15 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
                                                                if (var444 != 0) {
                                                                    break label433;
                                                                }

                                                                if (var11 > 0) {
                                                                    var204 ^= -1106864295;
                                                                    var204 &= -165597227;
                                                                    var204 |= -769880219;
                                                                    var204 &= 342885374;
                                                                    var204 ^= -849647023;
                                                                    Integer var329 = var204;
                                                                    if (var329 == null) {
                                                                        break label433;
                                                                    }

                                                                    var204 |= 1431700579;
                                                                    var204 -= 1682652074;
                                                                    var204 += -848170792;
                                                                    var204 -= 2064733254;
                                                                    var204 ^= -894750706;
                                                                } else {
                                                                    var204 >>= 13;
                                                                    var204 ^= 1869526166;
                                                                    Integer var330 = var204;
                                                                    if (var330 == null) {
                                                                        break label433;
                                                                    }

                                                                    NumberSetting var331 = this.h;
                                                                    float var332 = var331.WM();
                                                                    double var445 = var332;
                                                                    var330 = var3;
                                                                    if (var330 == null) {
                                                                        var204 ^= 1397482090;
                                                                        var204 ^= 1395164249;
                                                                        break;
                                                                    }

                                                                    var204 *= 1360812019;
                                                                    var204 ^= 504388658;
                                                                    var330 = var204;
                                                                    if (var330 == null) {
                                                                        break label433;
                                                                    }

                                                                    double var388 = Math.sqrt(var387);
                                                                    double var389 = var445 - var388;
                                                                    double var390 = var389 / 3.0;
                                                                    float var335 = (float)var390;
                                                                    float var336 = TP.S(var335);
                                                                    int var391 = var204 + 2016938257;
                                                                    var391 |= 1568013016;
                                                                    var391 |= -328036764;
                                                                    var391 >>= 28;
                                                                    var391 ^= 209989003;
                                                                    this.D(var1, var296, var280, var357, var336, var391);
                                                                    int var337 = this.K;
                                                                    this.K = ++var337;
                                                                    if (var337 >= 64) {
                                                                        var204 *= -765802453;
                                                                        var204 *= -208439183;
                                                                        var204 ^= -583209730;
                                                                        long var342 = var204;
                                                                        long var396 = var342 + 1L;
                                                                        long var397 = var342 * var396;
                                                                        long var343 = var397 & 1L;
                                                                        long var474;
                                                                        var337 = (var474 = var343 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
                                                                        if (var337 != 0) {
                                                                            break label433;
                                                                        }

                                                                        var204 |= 1107911034;
                                                                        var204 ^= 619132403;
                                                                        break label432;
                                                                    }
                                                                    var204 = switch (var204) {
                                                                        case -685335540 -> {
                                                                            var204 *= -1094119141;
                                                                            var204 += 259241690;
                                                                            var204 |= 1201669968;
                                                                            yield var204 ^ -1177860981;
                                                                        }
                                                                        case 1072968780 -> var204 ^ -678031086;
                                                                        default -> var204 ^ -1248518918;
                                                                    };
                                                                    var337 = var204 + 1;
                                                                    var337 = var204 * var337;
                                                                    var337 &= 1;
                                                                    if (var337 != 0) {
                                                                        break label433;
                                                                    }

                                                                    switch (var204) {
                                                                        case -214107180:
                                                                        default:
                                                                            var204 ^= 1739394672;
                                                                            continue;
                                                                        case 202746063:
                                                                            var204 ^= 379564958;
                                                                            continue;
                                                                        case 1176878037:
                                                                            var204 <<= 12;
                                                                            var204 |= 815810019;
                                                                            var204 += -1176926447;
                                                                            var204 -= 1589847863;
                                                                            var204 ^= -687059988;
                                                                    }
                                                                }
                                                                continue;
                                                            }

                                                            var204 += -1914498599;
                                                            var204 |= 980509073;
                                                            var204 += 970568542;
                                                            var204 -= -884970827;
                                                            var204 ^= 1167454751;
                                                            break;
                                                        }

                                                        switch (var204) {
                                                            case -1632972627:
                                                                var204 ^= -1749103228;
                                                                break label429;
                                                            case 287802932:
                                                            default:
                                                                var204 ^= 407272146;
                                                                break label429;
                                                            case 1339418479:
                                                                var204 += -1767788480;
                                                                var204 |= 69533665;
                                                                var204 |= -402316337;
                                                                var204 &= 647181188;
                                                                var204 ^= 1226705405;
                                                                break label429;
                                                        }
                                                    }
                                                } else {
                                                    var204 ^= -1773460069;
                                                    var204 |= -599412435;
                                                    var204 &= -501192709;
                                                    var204 ^= -169612411;
                                                    var204 ^= 909930557;
                                                }
                                            } else {
                                                var204 *= 779829785;
                                                var204 *= -599066067;
                                                var204 ^= -1508082227;
                                            }
                                        } else {
                                            var204 *= 1398682611;
                                            var204 -= -425974688;
                                            var204 ^= -1889418913;
                                            var204 |= 1142987291;
                                            var204 ^= 1991967918;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    long var244 = var204;
                    long var264 = var244 + 1L;
                    long var265 = var244 * var264;
                    long var299 = var244 + 2L;
                    long var266 = var265 * var299;
                    long var245 = var244 + 3L;
                    long var267 = var266 * var245;
                    long var246 = var267 & 7L;
                    long var475;
                    var204 = (var475 = var246 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                    if (var204 == 0) {
                        AssertionError var249 = new AssertionError();
                        throw var249;
                    }
                    break label433;
                }

                long var251 = var204;
                long var281 = var251 + 1L;
                var281 = var251 * var281;
                var251 = var281 & 1L;
                long var476;
                int var253 = (var476 = var251 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                if (var253 == 0) {
                    return;
                }
                break label433;
            }

            Integer var250 = var204;
            if (var250 != null) {
                return;
            }
        }

        UnsupportedOperationException var248 = new UnsupportedOperationException();
        throw var248;
    }

    private void D(RenderEvent var1, Canvas var2, WorldDraw var3, LivingEntity var4, float var5, int var6) {
        float var500 = 0.0F;
        h_2 var518 = null;
        label529: {
            int var8 = System.identityHashCode(this);
            FrameContext var9 = var1.frame();
            float var390 = var9.partialTick();
            Box var10 = var4.getBoundingBox();
            var10 = var10;
            double var11 = var4.lastX;
            double var13 = var4.getX();
            double var15 = var390;
            var11 = TP.y(var11, var13, var15);
            var13 = var4.getX();
            var11 -= var13;
            var11 = var11;
            var13 = var4.lastY;
            var15 = var4.getY();
            double var17 = var390;
            var13 = TP.y(var13, var15, var17);
            var15 = var4.getY();
            var13 -= var15;
            var13 = var13;
            var15 = var4.lastZ;
            var17 = var4.getZ();
            double var19 = var390;
            var15 = TP.y(var15, var17, var19);
            var17 = var4.getZ();
            int var630 = var8 + 1;
            int var631 = var8 * var630;
            int var20 = var8 + 2;
            int var632 = var631 * var20;
            var20 = var8 + 3;
            int var633 = var632 * var20;
            int var634 = var633 & 7;
            if (var634 != 0) {
                int var7 = var6 + -1927005216;
                var7 ^= -1084227842;
            } else {
                int var40 = var6 >> 17;
                var40 -= -1263143908;
                var40 &= 233573117;
                var40 &= -2010469778;
                var40 ^= 2141185513;
                int var635 = var40 + 1;
                int var636 = var40 * var635;
                var20 = var40 + 2;
                int var637 = var636 * var20;
                var20 = var40 + 3;
                int var638 = var637 * var20;
                int var639 = var638 & 7;
                if (var639 != 0) {
                    break label529;
                }

                var15 -= var17;
                var15 = var15;
                byte var552 = 0;
                int var553 = var552;

                var40 = switch (var40) {
                    default -> var40 ^ 1675876687;
                    case 1713798863 -> var40 ^ -695726906;
                    case 2006443465 -> {
                        var40 &= -1168109769;
                        var40 >>>= 5;
                        var40 |= -135514154;
                        var40 ^= -2035787470;
                        yield var40 ^ 860814977;
                    }
                };

                label526:
                while (true) {
                    if (var553 >= 8) {
                        var40 >>= 25;
                        var40 ^= 330371610;
                        int var406 = var40 + 1;
                        int var407 = var40 * var406;
                        int var408 = var407 & 1;
                        if (var408 != 0) {
                            break label529;
                        }

                        BooleanSetting var409 = this.L;
                        Integer var428 = var8;
                        if (var428 != null) {
                            var40 -= 1991511641;
                            var40 &= 639885281;
                            var40 ^= -552401024;
                            var40 ^= 701559251;
                            int var429 = var40 + 1;
                            int var430 = var40 * var429;
                            int var431 = var430 & 1;
                            if (var431 != 0) {
                                break label529;
                            }

                            boolean var410 = var409.vb();
                            float var420;
                            if (var410) {
                                var40 >>>= 23;
                                var40 ^= 151699127;
                                long var411 = var40;
                                long var12 = var411 + 1L;
                                var12 = var411 * var12;
                                long var14 = var411 + 2L;
                                var12 *= var14;
                                long var412 = var411 + 3L;
                                var12 *= var412;
                                long var413 = var12 & 7L;
                                long var882;
                                int var414 = (var882 = var413 - 0L) == 0L ? 0 : (var882 < 0L ? -1 : 1);
                                if (var414 != 0) {
                                    break label529;
                                }

                                int var415 = var4.hurtTime;
                                float var416 = var415;
                                float var417 = var416 - var390;
                                float var418 = var417 / 10.0F;
                                Integer var432 = var8;
                                if (var432 == null) {
                                    var40 <<= 10;
                                    var40 ^= 352499882;
                                    break;
                                }
                                var40 = switch (var40) {
                                    default -> var40 ^ -1955036262;
                                    case 151699282 -> {
                                        var40 += -1149147960;
                                        var40 ^= -809696327;
                                        var40 |= 1881341015;
                                        yield var40 ^ 697217974;
                                    }
                                    case 1262864068 -> var40 ^ 930501394;
                                };
                                long var433 = var40;
                                long var456 = var433 + 1L;
                                long var457 = var433 * var456;
                                long var508 = var433 + 2L;
                                long var458 = var457 * var508;
                                long var434 = var433 + 3L;
                                long var459 = var458 * var434;
                                long var435 = var459 & 7L;
                                long var883;
                                int var436 = (var883 = var435 - 0L) == 0L ? 0 : (var883 < 0L ? -1 : 1);
                                if (var436 != 0) {
                                    break label529;
                                }

                                float var419 = TP.S(var418);
                                var420 = var419;
                                var40 += -1627002972;
                                var40 ^= -2044177089;
                            } else {
                                var40 >>= 13;
                                var40 |= -471413176;
                                var40 |= 862936126;
                                var40 >>>= 31;
                                var40 ^= 782746606;
                                Integer var437 = var40;
                                if (var437 == null) {
                                    break label529;
                                }

                                var420 = 0.0F;
                                var40 >>>= 24;
                                var40 |= -694926960;
                                var40 ^= -1585502364;
                            }

                            FrameContext var438 = var1.frame();
                            var11 = var438.time();
                            zS var460 = this.p;
                            int var461 = var460.x(0.0F, var11);
                            ColorSetting var492 = this.T;
                            int var493 = var492.zz();
                            int var462 = DP.Z(var461, var493, var420);
                            int var463 = var462;
                            zS var494 = this.p;
                            int var495 = var494.x(0.6F, var11);
                            ColorSetting var509 = this.T;
                            int var510 = var509.zz();
                            int var421 = DP.Z(var495, var510, var420);
                            int var422 = var421;
                            NumberSetting var496 = this.v;
                            float var497 = var496.WM();
                            float var498 = var497 / 100.0F;
                            long var511 = var8;
                            long var554 = var511 + 1L;
                            long var555 = var511 * var554;
                            long var512 = var555 & 1L;
                            long var884;
                            int var513 = (var884 = var512 - 0L) == 0L ? 0 : (var884 < 0L ? -1 : 1);
                            if (var513 == 0) {
                                var40 >>>= 19;
                                var40 ^= -61554174;
                                Integer var514 = var40;
                                if (var514 == null) {
                                    break label529;
                                }

                                label536: {
                                    float var499 = var498 * var5;
                                    var500 = var499;
                                    ModeSetting var515 = this.t;
                                    Enum var516 = var515.A();
                                    h_2 var517 = (h_2)var516;
                                    var518 = var517;
                                    var2.save();
                                    h_2 var16 = h_2.GLASS;
                                    if (var517 != var16) {
                                        var40 ^= -840411540;
                                        var40 -= -184941554;
                                        var40 += -1475517593;
                                        var40 += 1026490452;
                                        var40 ^= 278085067;
                                        var16 = h_2.SCAN;
                                        int var556 = var8 + 1;
                                        int var557 = var8 * var556;
                                        int var606 = var8 + 2;
                                        int var558 = var557 * var606;
                                        var606 = var8 + 3;
                                        int var559 = var558 * var606;
                                        int var560 = var559 & 7;
                                        if (var560 != 0) {
                                            var40 &= -1069212077;
                                            var40 ^= 1734334727;
                                            var40 ^= 1491414958;
                                            break;
                                        }
                                        var40 = switch (var40) {
                                            default -> var40 ^ 1722109414;
                                            case 829278091 -> {
                                                var40 |= -1951386682;
                                                var40 ^= -509882319;
                                                var40 |= -198616504;
                                                var40 &= 1981704;
                                                yield var40 ^ 945642141;
                                            }
                                            case 1814773799 -> var40 ^ 1314928456;
                                        };
                                        long var561 = var40;
                                        long var658 = var561 + 1L;
                                        long var659 = var561 * var658;
                                        long var791 = var561 + 2L;
                                        long var660 = var659 * var791;
                                        long var562 = var561 + 3L;
                                        long var661 = var660 * var562;
                                        long var563 = var661 & 7L;
                                        long var885;
                                        int var564 = (var885 = var563 - 0L) == 0L ? 0 : (var885 < 0L ? -1 : 1);
                                        if (var564 != 0) {
                                            break label529;
                                        }

                                        if (var517 != var16) {
                                            var40 ^= -277701139;
                                            var40 *= -1181046965;
                                            var40 &= -1744222097;
                                            var40 &= -1587384914;
                                            var40 ^= 541192998;
                                            break label536;
                                        }

                                        switch (var40) {
                                            case -365636569:
                                                var40 ^= -1922563424;
                                                break;
                                            case 944990101:
                                                var40 -= 1091981447;
                                                var40 ^= -367399606;
                                                break;
                                            case 1166853303:
                                            default:
                                                var40 ^= -924156382;
                                        }
                                    } else {
                                        switch (var40) {
                                            case -1315357490:
                                                var40 ^= -1571796016;
                                                break;
                                            case -160880252:
                                            default:
                                                var40 ^= 2045967362;
                                                break;
                                            case -61551361:
                                                var40 += 1948408352;
                                                var40 *= 46765641;
                                                var40 *= -1027116341;
                                                var40 ^= 1310087481;
                                        }
                                    }

                                    Integer var542 = var40;
                                    if (var542 == null) {
                                        break label529;
                                    }

                                    NumberSetting var543 = this.Qi;
                                    int var565 = var8 + 1;
                                    int var566 = var8 * var565;
                                    int var567 = var566 & 1;
                                    if (var567 != 0) {
                                        var40 += 404341964;
                                        var40 ^= 180441018;
                                        break;
                                    }

                                    var40 ^= 1220953946;
                                    var40 ^= 14482457;
                                    float var544 = var543.WM();
                                    float var545 = var544 / 100.0F;
                                    float var546 = var545 * var5;
                                    float var568 = var546 * 0.3F;
                                    int var569 = DP.Y(var421, var568);
                                    int var547 = DP.Y(var462, var546);
                                    int var608 = var40 - 558669583;
                                    var608 -= 634442260;
                                    var608 ^= -1758661228;
                                    this.L(var2, var3, 4, 5, 0, 1, var569, var547, var608);
                                    var608 = var40 >>> 7;
                                    var608 += -1670692014;
                                    var608 |= -587953678;
                                    var608 ^= 1157203334;
                                    this.L(var2, var3, 5, 7, 1, 3, var569, var547, var608);
                                    var608 = var40 | 12585890;
                                    var608 -= 2026913887;
                                    var608 *= 712078535;
                                    var608 ^= 262364808;
                                    this.L(var2, var3, 7, 6, 3, 2, var569, var547, var608);
                                    var608 = var40 - 157824040;
                                    var608 >>>= 11;
                                    var608 &= 1513761158;
                                    var608 <<= 2;
                                    var608 ^= -1725130640;
                                    this.L(var2, var3, 6, 4, 2, 0, var569, var547, var608);
                                    switch (var40) {
                                        case -473934714:
                                        default:
                                            var40 ^= 1369345415;
                                            break;
                                        case 1430143239:
                                            var40 += 2093631810;
                                            var40 ^= -1945250464;
                                            var40 <<= 11;
                                            var40 ^= -1967607026;
                                            break;
                                        case 1574942731:
                                            var40 ^= 1620131898;
                                    }
                                }

                                NumberSetting var624 = this.av;
                                float var625 = var624.WM();
                                var2.additive(var625);
                                byte var626 = 0;
                                int var662 = var8 + 1;
                                int var663 = var8 * var662;
                                var20 = var8 + 2;
                                int var664 = var663 * var20;
                                var20 = var8 + 3;
                                int var665 = var664 * var20;
                                int var666 = var665 & 7;
                                if (var666 == 0) {
                                    var40 |= 1585385607;
                                    var40 >>>= 23;
                                    var40 ^= 738830140;
                                    int var667 = var40 + 1;
                                    int var668 = var40 * var667;
                                    int var669 = var668 & 1;
                                    if (var669 != 0) {
                                        break label529;
                                    }

                                    int var627 = var626;

                                    var40 = switch (var40) {
                                        case -588942929 -> var40 ^ -1091838780;
                                        default -> var40 ^ 1736412387;
                                        case 738830016 -> {
                                            var40 <<= 20;
                                            var40 >>= 30;
                                            var40 &= -1077126669;
                                            yield var40 ^ 60849064;
                                        }
                                    };

                                    while (true) {
                                        int var670 = var40 + 1;
                                        int var671 = var40 * var670;
                                        var20 = var40 + 2;
                                        int var672 = var671 * var20;
                                        var20 = var40 + 3;
                                        int var673 = var672 * var20;
                                        int var674 = var673 & 7;
                                        if (var674 != 0) {
                                            break label529;
                                        }

                                        int[] var675 = Ob;
                                        long var723 = var8;
                                        long var822 = var723 + 1L;
                                        var822 = var723 * var822;
                                        long var724 = var822 & 1L;
                                        long var886;
                                        var20 = (var886 = var724 - 0L) == 0L ? 0 : (var886 < 0L ? -1 : 1);
                                        if (var20 != 0) {
                                            var40 &= -1040988857;
                                            var40 += -732095260;
                                            var40 ^= -368923313;
                                            break label526;
                                        }

                                        var40 |= -720023735;
                                        var40 *= -1380997463;
                                        var40 ^= 1234652674;
                                        var40 ^= -936675159;
                                        int var676 = var675.length;
                                        if (var627 >= var676) {
                                            var40 = switch (var40) {
                                                default -> var40 ^ 1458877607;
                                                case -337801455 -> var40 ^ -316968143;
                                                case 2092281978 -> {
                                                    var40 &= 449412025;
                                                    var40 += 1011298227;
                                                    yield var40 ^ -1171859963;
                                                }
                                            };
                                            long var573 = var40;
                                            long var690 = var573 + 1L;
                                            long var691 = var573 * var690;
                                            long var574 = var691 & 1L;
                                            long var887;
                                            int var464 = (var887 = var574 - 0L) == 0L ? 0 : (var887 < 0L ? -1 : 1);
                                            if (var464 != 0) {
                                                break label529;
                                            }

                                            h_2 var465 = h_2.SCAN;
                                            Integer var575 = var8;
                                            if (var575 != null) {
                                                var40 *= -2001863029;
                                                var40 ^= -650231486;
                                                int var576 = var40 + 1;
                                                int var577 = var40 * var576;
                                                int var628 = var40 + 2;
                                                int var578 = var577 * var628;
                                                int var629 = var40 + 3;
                                                int var579 = var578 * var629;
                                                int var580 = var579 & 7;
                                                if (var580 != 0) {
                                                    break label529;
                                                }

                                                if (var518 == var465) {
                                                    var40 -= -2110050697;
                                                    var40 ^= -793000313;
                                                    int var466 = var40 + 1;
                                                    int var467 = var40 * var466;
                                                    int var519 = var40 + 2;
                                                    int var468 = var467 * var519;
                                                    int var520 = var40 + 3;
                                                    int var469 = var468 * var520;
                                                    int var470 = var469 & 7;
                                                    if (var470 != 0) {
                                                        break label529;
                                                    }

                                                    var11 *= 2.3;
                                                    var11 = Math.sin(var11);
                                                    var11 = 0.5 * var11;
                                                    var11 = 0.5 + var11;
                                                    double[] var471 = this.Re;
                                                    var17 = var471[4];
                                                    double[] var472 = this.Re;
                                                    var19 = var472[0];
                                                    var17 -= var19;
                                                    var11 *= var17;
                                                    int var473 = var8 + 1;
                                                    int var474 = var8 * var473;
                                                    int var475 = var474 & 1;
                                                    if (var475 != 0) {
                                                        var40 *= -1422383109;
                                                        var40 ^= 70151368;
                                                        break label526;
                                                    }

                                                    var40 ^= -2027778912;
                                                    var40 &= 1889459076;
                                                    var40 -= -1112366820;
                                                    var40 <<= 20;
                                                    var40 ^= -110321500;
                                                    int var476 = var40 + 1;
                                                    int var477 = var40 * var476;
                                                    int var521 = var40 + 2;
                                                    int var478 = var477 * var521;
                                                    int var522 = var40 + 3;
                                                    int var479 = var478 * var522;
                                                    int var480 = var479 & 7;
                                                    if (var480 != 0) {
                                                        break label529;
                                                    }

                                                    double[] var481 = this.Re;
                                                    var17 = var481[0];
                                                    var11 += var17;
                                                    var11 = var11;
                                                    int var482 = DP.Y(var422, var500);
                                                    int var549 = var482;
                                                    byte var483 = 0;
                                                    int var484 = var483;
                                                    var40 -= 655424233;
                                                    var40 ^= 1915993416;

                                                    while (var484 < 4) {
                                                        var40 ^= 487048907;
                                                        var40 >>>= 15;
                                                        var40 ^= 16198661;
                                                        int var523 = var40 & -839423953;
                                                        int var524 = var523 & 2076814360;
                                                        int var525 = var524 * 174804369;
                                                        int var526 = var525 ^ 2098206566;
                                                        int var527 = var526 ^ -1890640617;
                                                        int var528 = j(var484, var527);
                                                        double[] var584 = this.Lu;
                                                        var17 = var584[var484];
                                                        double[] var693 = this.G;
                                                        var19 = var693[var484];
                                                        double[] var809 = this.Lu;
                                                        Integer var826 = var8;
                                                        if (var826 == null) {
                                                            var40 -= -449927781;
                                                            var40 &= -2055770674;
                                                            var40 ^= 1052310692;
                                                            break label526;
                                                        }

                                                        var40 -= -1032972173;
                                                        var40 -= 1722680738;
                                                        var40 *= -1186109549;
                                                        var40 ^= -2098652379;
                                                        var822 = var40;
                                                        long var24 = var822 + 1L;
                                                        var24 = var822 * var24;
                                                        var822 = var24 & 1L;
                                                        long var888;
                                                        int var829 = (var888 = var822 - 0L) == 0L ? 0 : (var888 < 0L ? -1 : 1);
                                                        if (var829 != 0) {
                                                            break label529;
                                                        }

                                                        double var810 = var809[var528];
                                                        double[] var855 = this.G;
                                                        double var856 = var855[var528];
                                                        double[] var873 = this.Lu;
                                                        double var874 = var873[var484];
                                                        double var878 = var11 - 0.12;
                                                        double[] var29 = this.G;
                                                        double var879 = var29[var484];
                                                        double[] var31 = this.Lu;
                                                        double var880 = var31[var528];
                                                        double var33 = var11 - 0.12;
                                                        double[] var35 = this.G;
                                                        double var881 = var35[var528];
                                                        int var37 = DP.nq(var549, 0.45F);
                                                        int var38 = DP.Y(var549, 0.0F);
                                                        boolean var586 = var3.band(
                                                            var2,
                                                            var17,
                                                            var11,
                                                            var19,
                                                            var810,
                                                            var11,
                                                            var856,
                                                            var874,
                                                            var878,
                                                            var879,
                                                            var880,
                                                            var33,
                                                            var881,
                                                            var37,
                                                            var38,
                                                            false
                                                        );
                                                        double[] var587 = this.Lu;
                                                        var17 = var587[var484];
                                                        double[] var695 = this.G;
                                                        var19 = var695[var484];
                                                        var809 = this.Lu;
                                                        double var812 = var809[var528];
                                                        var855 = this.G;
                                                        double var858 = var855[var528];
                                                        NumberSetting var529 = this.O;
                                                        float var530 = var529.WM();
                                                        Paint var875 = Paint.solid(var549);
                                                        boolean var531 = var3.line(var2, var17, var11, var19, var812, var11, var858, var530, var875);
                                                        int var532 = var484 + 1;
                                                        var484 = var532;
                                                        var40 += 1964431647;
                                                        var40 ^= 520333738;
                                                    }

                                                    var40 *= 1030905399;
                                                    var40 ^= 2111356639;
                                                } else {
                                                    var40 *= -1496622479;
                                                    var40 <<= 6;
                                                    var40 |= -1153152682;
                                                    var40 ^= 1308841916;
                                                }

                                                BooleanSetting var485 = this.yy;
                                                long var533 = var8;
                                                long var589 = var533 + 1L;
                                                long var590 = var533 * var589;
                                                long var534 = var590 & 1L;
                                                long var889;
                                                int var535 = (var889 = var534 - 0L) == 0L ? 0 : (var889 < 0L ? -1 : 1);
                                                if (var535 == 0) {
                                                    var40 &= 1928040723;
                                                    var40 *= 2101191527;
                                                    var40 ^= 1847155443;
                                                    boolean var486 = var485.vb();
                                                    if (var486) {
                                                        var40 += -1507154201;
                                                        var40 |= -1830986015;
                                                        var40 -= -1950392879;
                                                        var40 ^= -1549437828;
                                                        var15 = var4.lastY;
                                                        var17 = var4.getY();
                                                        var19 = var390;
                                                        var15 = TP.y(var15, var17, var19);
                                                        float var391 = var4.getStandingEyeHeight();
                                                        var17 = var391;
                                                        var15 += var17;
                                                        double[] var392 = this.Lu;
                                                        double var539 = var392[0];
                                                        double[] var393 = this.G;
                                                        var17 = var393[0];
                                                        double[] var394 = this.Lu;
                                                        var19 = var394[1];
                                                        double[] var395 = this.G;
                                                        double var813 = var395[1];
                                                        NumberSetting var396 = this.O;
                                                        float var397 = var396.WM();
                                                        float var487 = var500 * 0.8F;
                                                        int var488 = DP.Y(var422, var487);
                                                        Paint var489 = Paint.solid(var488);
                                                        boolean var398 = var3.line(var2, var539, var15, var17, var19, var15, var813, var397, var489);
                                                        double[] var399 = this.Lu;
                                                        var15 = var399[2];
                                                        double[] var400 = this.G;
                                                        var17 = var400[2];
                                                        double[] var401 = this.Lu;
                                                        var19 = var401[3];
                                                        double[] var402 = this.G;
                                                        Integer var381 = var8;
                                                        if (var381 == null) {
                                                            switch (var40) {
                                                                case -1169059742:
                                                                default:
                                                                    var40 ^= 2065816487;
                                                                    break label526;
                                                                case -459540888:
                                                                    var40 *= -1423342327;
                                                                    var40 ^= -37966225;
                                                                    var40 *= 128992559;
                                                                    var40 ^= -1078994118;
                                                                    var40 ^= 327897881;
                                                                    break label526;
                                                                case -384272965:
                                                                    var40 ^= -84780768;
                                                                    break label526;
                                                            }
                                                        }

                                                        var40 >>= 10;
                                                        var40 |= 2012157907;
                                                        var40 ^= 1607552790;
                                                        long var814 = var40;
                                                        long var859 = var814 + 1L;
                                                        var859 = var814 * var859;
                                                        long var876 = var814 + 2L;
                                                        var859 *= var876;
                                                        long var815 = var814 + 3L;
                                                        var859 *= var815;
                                                        long var816 = var859 & 7L;
                                                        long var890;
                                                        int var382 = (var890 = var816 - 0L) == 0L ? 0 : (var890 < 0L ? -1 : 1);
                                                        if (var382 != 0) {
                                                            break label529;
                                                        }

                                                        double var383 = var402[3];
                                                        NumberSetting var490 = this.O;
                                                        float var491 = var490.WM();
                                                        float var501 = var500 * 0.8F;
                                                        int var423 = DP.Y(var422, var501);
                                                        Paint var424 = Paint.solid(var423);
                                                        boolean var384 = var3.line(var2, var15, var15, var17, var19, var15, var383, var491, var424);
                                                        switch (var40) {
                                                            case -1607567127:
                                                                var40 |= -503243745;
                                                                var40 ^= 1814863013;
                                                                break;
                                                            case 1682447282:
                                                                var40 ^= 1134483753;
                                                                break;
                                                            case 2095056378:
                                                            default:
                                                                var40 ^= -1914735281;
                                                        }
                                                    } else {
                                                        var40 *= 2025689017;
                                                        var40 += 746538099;
                                                        var40 &= -1698870250;
                                                        var40 &= 1690862399;
                                                        var40 ^= -1912348582;
                                                    }

                                                    var8 = var40 + 1;
                                                    var8 = var40 * var8;
                                                    int var403 = var40 + 2;
                                                    var8 *= var403;
                                                    int var404 = var40 + 3;
                                                    var8 *= var404;
                                                    var8 &= 7;
                                                    if (var8 == 0) {
                                                        var2.restore();
                                                        return;
                                                    }
                                                    break label529;
                                                } else {
                                                    var40 -= -53582536;
                                                    var40 ^= -1964362984;
                                                    break label526;
                                                }
                                            } else {
                                                var40 ^= -1419494234;
                                                var40 *= -459863441;
                                                var40 ^= -1605461358;
                                                break label526;
                                            }
                                        }

                                        var40 ^= 1143444432;
                                        var40 += -619650581;
                                        var40 ^= 361425883;
                                        int var677 = var40 + 1;
                                        int var678 = var40 * var677;
                                        int var679 = var678 & 1;
                                        if (var679 != 0) {
                                            break label529;
                                        }

                                        int[] var680 = Ob;
                                        int var681 = var680[var627];
                                        int[] var682 = Ob;
                                        var20 = var627 + 1;
                                        Integer var792 = var8;
                                        if (var792 == null) {
                                            var40 |= 722910417;
                                            var40 <<= 31;
                                            var40 ^= -1073745750;
                                            break label526;
                                        }

                                        var40 *= -1089149905;
                                        var40 ^= -413682150;
                                        int var683 = var682[var20];
                                        int var684 = var681 & 4;
                                        int var685;
                                        if (var684 == 0) {
                                            var40 = switch (var40) {
                                                case -1386246584 -> {
                                                    var40 *= 1063028591;
                                                    var40 |= 819830822;
                                                    var40 &= 1930049108;
                                                    var40 &= 2108718215;
                                                    yield var40 ^ -216200595;
                                                }
                                                case 624988740 -> var40 ^ 2079285629;
                                                default -> var40 ^ -1054732043;
                                            };
                                            var685 = var463;
                                            var40 ^= -1482763961;
                                            var40 *= 632186517;
                                            var40 *= 1201048611;
                                            var40 ^= 1481474291;
                                        } else {
                                            var40 = switch (var40) {
                                                case -1863027582 -> var40 ^ 623973980;
                                                case -1386246584 -> {
                                                    var40 *= 102375825;
                                                    yield var40 ^ 2138136782;
                                                }
                                                default -> var40 ^ -753473598;
                                            };
                                            var20 = var40 + 1;
                                            var20 = var40 * var20;
                                            var20 &= 1;
                                            if (var20 != 0) {
                                                break label529;
                                            }

                                            var685 = var422;
                                            switch (var40) {
                                                case -1209564871:
                                                    var40 ^= -274438129;
                                                    break;
                                                case -659046906:
                                                    var40 ^= 1672948224;
                                                    var40 &= -565703428;
                                                    var40 <<= 12;
                                                    var40 &= -791943142;
                                                    var40 ^= 819221217;
                                                    break;
                                                case 1881913049:
                                                default:
                                                    var40 ^= -1373097956;
                                            }
                                        }

                                        var20 = var40 + 1;
                                        var20 = var40 * var20;
                                        var20 &= 1;
                                        if (var20 != 0) {
                                            break label529;
                                        }

                                        int var686 = DP.Y(var685, var500);
                                        Integer var733 = var8;
                                        if (var733 == null) {
                                            switch (var40) {
                                                case -1630376477:
                                                default:
                                                    var40 ^= 594568355;
                                                    break label526;
                                                case -280806561:
                                                    var40 ^= 1748196755;
                                                    break label526;
                                                case 815010529:
                                                    var40 >>>= 29;
                                                    var40 >>>= 20;
                                                    var40 ^= 1073737898;
                                                    break label526;
                                            }
                                        }

                                        var40 &= 110890348;
                                        var40 += 1288038123;
                                        var40 ^= -1458472325;
                                        int var734 = var40 + 1;
                                        var734 = var40 * var734;
                                        int var793 = var40 + 2;
                                        var734 *= var793;
                                        var793 = var40 + 3;
                                        var734 *= var793;
                                        var734 &= 7;
                                        if (var734 != 0) {
                                            break label529;
                                        }

                                        h_2 var739 = h_2.CORNERS;
                                        if (var518 == var739) {
                                            var40 = switch (var40) {
                                                case -1511445270 -> var40 ^ -1103852817;
                                                default -> var40 ^ -273243232;
                                                case -465003216 -> {
                                                    var40 += 994290758;
                                                    var40 -= -816747091;
                                                    var40 -= -1895915366;
                                                    yield var40 ^ 1108156028;
                                                }
                                            };
                                            NumberSetting var740 = this.Fq;
                                            float var741 = var740.WM();
                                            var793 = var8 + 1;
                                            var793 = var8 * var793;
                                            int var824 = var8 + 2;
                                            var793 *= var824;
                                            int var825 = var8 + 3;
                                            var793 *= var825;
                                            var793 &= 7;
                                            if (var793 != 0) {
                                                var40 >>= 21;
                                                var40 |= -1489429573;
                                                var40 ^= -1073737967;
                                                break label526;
                                            }

                                            var40 += 2076802116;
                                            var40 ^= -1427609073;
                                            float var742 = var741 / 100.0F;
                                            var793 = var40 | 434129657;
                                            var793 ^= 226543028;
                                            this.VL(var2, var3, var681, var683, 0.0F, var742, var686, var793);
                                            float var743 = 1.0F - var742;
                                            var793 = var40 | -1996698552;
                                            var793 += 2144527137;
                                            var793 ^= 212057268;
                                            this.VL(var2, var3, var681, var683, var743, 1.0F, var686, var793);
                                            var40 >>= 13;
                                            var40 ^= 95042731;
                                            var40 >>= 19;
                                            var40 ^= 35031072;
                                        } else {
                                            var40 ^= 1932991451;
                                            var40 ^= 2114522591;
                                            var40 *= 157064493;
                                            var40 |= -1892275416;
                                            var40 ^= -614243595;
                                            var734 = var40 + 1;
                                            var734 = var40 * var734;
                                            var793 = var40 + 2;
                                            var734 *= var793;
                                            var793 = var40 + 3;
                                            var734 *= var793;
                                            var734 &= 7;
                                            if (var734 != 0) {
                                                break label529;
                                            }

                                            var734 = var40 ^ 95358675;
                                            var734 |= 1145402557;
                                            var734 ^= 353204722;
                                            this.VL(var2, var3, var681, var683, 0.0F, 1.0F, var686, var734);
                                            var40 -= -1887801569;
                                            var40 |= -1346824930;
                                            var40 &= -963193228;
                                            var40 ^= -1879718800;
                                            var40 ^= 192142033;
                                        }

                                        long var687 = var40;
                                        long var807 = var687 + 1L;
                                        long var808 = var687 * var807;
                                        long var688 = var808 & 1L;
                                        long var891;
                                        int var571 = (var891 = var688 - 0L) == 0L ? 0 : (var891 < 0L ? -1 : 1);
                                        if (var571 != 0) {
                                            break label529;
                                        }

                                        int var572 = var627 + 2;
                                        Integer var689 = var8;
                                        if (var689 == null) {
                                            var40 &= 129853373;
                                            var40 ^= 1038872639;
                                            break label526;
                                        }

                                        var40 *= 1444214103;
                                        var40 *= 1975561277;
                                        var40 += -1971189068;
                                        var40 += 1926110005;
                                        var40 ^= 1750104180;
                                        var627 = var572;
                                        var40 |= 115085626;
                                        var40 |= 887582868;
                                        var40 += 716163249;
                                        var40 &= 1268796558;
                                        var40 ^= 16790439;
                                    }
                                } else {
                                    switch (var40) {
                                        case -1606288626:
                                            var40 |= 1800865761;
                                            var40 += 873000268;
                                            var40 -= 1461823547;
                                            var40 ^= -138365526;
                                            break label526;
                                        case -1383697681:
                                        default:
                                            var40 ^= -1381148779;
                                            break label526;
                                        case 380180107:
                                            var40 ^= -966429230;
                                    }
                                }
                            } else {
                                var40 >>= 17;
                                var40 |= -473056200;
                                var40 ^= -600682665;
                            }
                        } else {
                            var40 &= 958842553;
                            var40 ^= -1061300240;
                            var40 ^= -295557789;
                        }
                        break;
                    }

                    var40 &= 1261013300;
                    var40 <<= 31;
                    var40 ^= 236297990;
                    var40 *= 1039800725;
                    var40 ^= -792484277;
                    double[] var18 = this.Lu;
                    int var640 = var553 & 1;
                    long var703 = var8;
                    long var22 = var703 + 1L;
                    var22 = var703 * var22;
                    long var704 = var22 & 1L;
                    long var892;
                    var20 = (var892 = var704 - 0L) == 0L ? 0 : (var892 < 0L ? -1 : 1);
                    if (var20 != 0) {
                        var40 *= -881085915;
                        var40 += 1447505094;
                        var40 |= 777448695;
                        var40 ^= -1073738667;
                        break;
                    }
                    var40 = switch (var40) {
                        case -667254219 -> {
                            var40 <<= 2;
                            yield var40 ^ 721577799;
                        }
                        default -> var40 ^ -503968125;
                        case 901419783 -> var40 ^ -2010601388;
                    };
                    var20 = var40 + 1;
                    var20 = var40 * var20;
                    var20 &= 1;
                    if (var20 != 0) {
                        break label529;
                    }

                    if (var640 == 0) {
                        var40 >>= 26;
                        var40 |= -1027941801;
                        var40 |= 1149241450;
                        var40 ^= -1560109599;
                        var40 ^= 149040177;
                        Integer var641 = var40;
                        if (var641 == null) {
                            break label529;
                        }

                        var19 = var10.minX;
                        long var21 = var8;
                        long var23 = var21 + 1L;
                        var23 = var21 * var23;
                        var21 = var23 & 1L;
                        long var893;
                        int var753 = (var893 = var21 - 0L) == 0L ? 0 : (var893 < 0L ? -1 : 1);
                        if (var753 != 0) {
                            switch (var40) {
                                case -2060591371:
                                default:
                                    var40 ^= -1771855543;
                                    break label526;
                                case -904083031:
                                    var40 ^= 573872229;
                                    break label526;
                                case 1834642351:
                                    var40 ^= 30584308;
                                    var40 &= -712630330;
                                    var40 += 1121240986;
                                    var40 += 1245472443;
                                    var40 ^= -294730691;
                                    break label526;
                            }
                        }

                        var40 &= 873183817;
                        var40 += 674733869;
                        var40 ^= 1849097510;
                        var40 ^= -1931385960;
                        int var754 = var40 + 1;
                        int var755 = var40 * var754;
                        int var756 = var755 & 1;
                        if (var756 != 0) {
                            break label529;
                        }

                        var19 -= 0.005;
                        var19 = var19;
                        var40 *= 1762405361;
                        var40 -= 407799563;
                        var40 ^= 92351365;
                    } else {
                        var40 >>= 10;
                        var40 >>= 3;
                        var40 ^= 1315036514;
                        int var757 = var40 + 1;
                        var757 = var40 * var757;
                        var757 &= 1;
                        if (var757 != 0) {
                            break label529;
                        }

                        double var760 = var10.maxX;
                        double var761 = var760 + 0.005;
                        int var831 = var8 + 1;
                        var831 = var8 * var831;
                        var831 &= 1;
                        if (var831 != 0) {
                            switch (var40) {
                                case -1924796022:
                                    var40 ^= -55646964;
                                    break label526;
                                case 1315144225:
                                    var40 &= -2044908739;
                                    var40 ^= 973009547;
                                    break label526;
                                case 1908281779:
                                default:
                                    var40 ^= -1410801464;
                                    break label526;
                            }
                        }

                        var40 += 1565530488;
                        var40 += 1525081426;
                        var40 ^= 1539004828;
                        long var834 = var40;
                        long var25 = var834 + 1L;
                        var25 = var834 * var25;
                        long var27 = var834 + 2L;
                        var25 *= var27;
                        long var835 = var834 + 3L;
                        var25 *= var835;
                        long var836 = var25 & 7L;
                        long var894;
                        var831 = (var894 = var836 - 0L) == 0L ? 0 : (var894 < 0L ? -1 : 1);
                        if (var831 != 0) {
                            break label529;
                        }

                        var19 = var761;
                        var40 <<= 11;
                        var40 ^= 1829184632;
                    }

                    var19 += var11;
                    var18[var553] = var19;
                    var18 = this.Re;
                    int var646 = var553 & 4;
                    var20 = var8 + 1;
                    var20 = var8 * var20;
                    int var762 = var8 + 2;
                    var20 *= var762;
                    var762 = var8 + 3;
                    var20 *= var762;
                    var20 &= 7;
                    if (var20 != 0) {
                        switch (var40) {
                            case -983588343:
                                var40 ^= -718594458;
                                break label526;
                            case 626714395:
                            default:
                                var40 ^= -861863797;
                                break label526;
                            case 1674353784:
                                var40 &= 2115449601;
                                var40 += 1785538616;
                                var40 ^= -208746350;
                                break label526;
                        }
                    }

                    var40 -= -158559787;
                    var40 <<= 25;
                    var40 ^= -74830289;
                    if (var646 == 0) {
                        var40 = switch (var40) {
                            default -> var40 ^ 1916188874;
                            case -1115017681 -> {
                                var40 ^= 973823462;
                                var40 |= -1067013371;
                                var40 -= 375875266;
                                yield var40 ^ 1342586346;
                            }
                            case -8822717 -> var40 ^ -1491414934;
                        };
                        var19 = var10.minY;
                        long var764 = var8;
                        long var838 = var764 + 1L;
                        var838 = var764 * var838;
                        long var867 = var764 + 2L;
                        var838 *= var867;
                        long var765 = var764 + 3L;
                        var838 *= var765;
                        long var766 = var838 & 7L;
                        long var895;
                        var762 = (var895 = var766 - 0L) == 0L ? 0 : (var895 < 0L ? -1 : 1);
                        if (var762 != 0) {
                            var40 |= 74269612;
                            var40 -= 226026262;
                            var40 ^= -410453891;
                            break;
                        }

                        var40 ^= 1551986230;
                        var40 ^= -412110106;
                        long var768 = var40;
                        var838 = var768 + 1L;
                        var838 = var768 * var838;
                        var867 = var768 + 2L;
                        var838 *= var867;
                        long var769 = var768 + 3L;
                        var838 *= var769;
                        long var770 = var838 & 7L;
                        long var896;
                        var762 = (var896 = var770 - 0L) == 0L ? 0 : (var896 < 0L ? -1 : 1);
                        if (var762 != 0) {
                            break label529;
                        }

                        var19 = var19;
                        var40 >>= 30;
                        var40 -= -29501988;
                        var40 ^= -1248022402;
                    } else {
                        var40 ^= 1794929049;
                        var40 ^= 1034949755;
                        var762 = var40 + 1;
                        var762 = var40 * var762;
                        var762 &= 1;
                        if (var762 != 0) {
                            break label529;
                        }

                        double var775 = var10.maxY;
                        double var776 = var775 + 0.005;
                        int var846 = var8 + 1;
                        var846 = var8 * var846;
                        var846 &= 1;
                        if (var846 != 0) {
                            var40 += -1792743363;
                            var40 *= 1174114617;
                            var40 ^= 1415164048;
                            break;
                        }

                        var40 -= -1148602375;
                        var40 |= 1714614724;
                        var40 *= 566695899;
                        var40 -= 1916078495;
                        var40 ^= -1230528833;
                        var19 = var776;
                        var40 >>>= 31;
                        var40 <<= 8;
                        var40 *= 1589382391;
                        var40 ^= 139619675;
                    }

                    var762 = var40 + 1;
                    var762 = var40 * var762;
                    var762 &= 1;
                    if (var762 != 0) {
                        break label529;
                    }

                    var19 += var13;
                    var18[var553] = var19;
                    var18 = this.G;
                    int var650 = var553 & 2;
                    long var714 = var8;
                    var22 = var714 + 1L;
                    var22 = var714 * var22;
                    long var715 = var22 & 1L;
                    long var897;
                    var20 = (var897 = var715 - 0L) == 0L ? 0 : (var897 < 0L ? -1 : 1);
                    if (var20 != 0) {
                        var40 &= -1399307230;
                        var40 -= -253328415;
                        var40 ^= -958374326;
                        var40 ^= 1244582593;
                        break;
                    }

                    var40 += 1805335515;
                    var40 &= -88593430;
                    var40 &= -426827293;
                    var40 ^= -562276259;
                    if (var650 == 0) {
                        var40 &= -1597688307;
                        var40 |= 1734221877;
                        var40 ^= 468087426;
                        var40 ^= 2142936836;
                        Integer var651 = var40;
                        if (var651 == null) {
                            break label529;
                        }

                        var19 = var10.minZ;
                        var19 -= 0.005;
                        var762 = var8 + 1;
                        var762 = var8 * var762;
                        int var820 = var8 + 2;
                        var762 *= var820;
                        int var821 = var8 + 3;
                        var762 *= var821;
                        var762 &= 7;
                        if (var762 != 0) {
                            switch (var40) {
                                case -2088575557:
                                    var40 &= -575940782;
                                    var40 &= 1876470109;
                                    var40 ^= 1048539578;
                                    break label526;
                                case -1708675475:
                                default:
                                    var40 ^= -916476935;
                                    break label526;
                                case 221176056:
                                    var40 ^= -35119145;
                                    break label526;
                            }
                        }

                        var40 <<= 30;
                        var40 ^= -1362289605;
                        var40 -= 218768525;
                        var40 <<= 30;
                        var40 ^= 230428657;
                        long var785 = var40;
                        long var849 = var785 + 1L;
                        var849 = var785 * var849;
                        long var786 = var849 & 1L;
                        long var898;
                        var762 = (var898 = var786 - 0L) == 0L ? 0 : (var898 < 0L ? -1 : 1);
                        if (var762 != 0) {
                            break label529;
                        }

                        var19 = var19;
                        var40 >>>= 22;
                        var40 += 1720720503;
                        var40 <<= 21;
                        var40 ^= 2026857022;
                    } else {
                        var40 &= -400667571;
                        var40 *= 337418743;
                        var40 |= -381225085;
                        var40 ^= 432505406;
                        Integer var788 = var40;
                        if (var788 == null) {
                            break label529;
                        }

                        double var789 = var10.maxZ;
                        long var851 = var8;
                        long var869 = var851 + 1L;
                        var869 = var851 * var869;
                        long var877 = var851 + 2L;
                        var869 *= var877;
                        var851 += 3L;
                        var869 *= var851;
                        var851 = var869 & 7L;
                        long var899;
                        int var854 = (var899 = var851 - 0L) == 0L ? 0 : (var899 < 0L ? -1 : 1);
                        if (var854 != 0) {
                            var40 += -649828568;
                            var40 |= 1755815087;
                            var40 ^= -1073205995;
                            break;
                        }
                        var40 = switch (var40) {
                            case -1530345976 -> var40 ^ -273196314;
                            case -424643083 -> {
                                var40 <<= 6;
                                yield var40 ^ -1189291211;
                            }
                            default -> var40 ^ 1944223844;
                        };
                        double var790 = var789 + 0.005;
                        var19 = var790;
                        var40 ^= 1663919425;
                        var40 ^= 1467674401;
                        var40 ^= -1942401493;
                    }

                    var19 += var15;
                    var18[var553] = var19;
                    long var597 = var8;
                    long var717 = var597 + 1L;
                    long var718 = var597 * var717;
                    long var598 = var718 & 1L;
                    long var900;
                    int var599 = (var900 = var598 - 0L) == 0L ? 0 : (var900 < 0L ? -1 : 1);
                    if (var599 != 0) {
                        var40 -= 1897097146;
                        var40 |= -119395024;
                        var40 ^= -1821801848;
                        var40 <<= 27;
                        var40 ^= -536874838;
                        break;
                    }

                    var40 &= 1102963698;
                    var40 += 763746945;
                    var40 |= 1487348468;
                    var40 ^= 586114471;
                    var40 ^= 1376041502;
                    int var600 = var40 + 1;
                    int var601 = var40 * var600;
                    int var656 = var40 + 2;
                    int var602 = var601 * var656;
                    int var657 = var40 + 3;
                    int var603 = var602 * var657;
                    int var604 = var603 & 7;
                    if (var604 != 0) {
                        break label529;
                    }

                    int var605 = var553 + 1;
                    var553 = var605;
                    var40 >>= 11;
                    var40 -= 1342120217;
                    var40 |= -899752529;
                    var40 ^= -1203474462;
                }
            }

            RuntimeException var379 = new RuntimeException();
            throw var379;
        }

        IllegalArgumentException var380 = new IllegalArgumentException();
        throw var380;
    }

    private static int j(int var0, int var1) {
        label50: {
            int var9;
            switch (var0) {
                case 0:
                    var9 = var1 << 9;
                    var9 &= 1397118387;
                    var9 ^= 1132798818;
                    byte var55 = 1;
                    switch (var9) {
                        case 1082225506:
                            var9 >>= 23;
                            var9 ^= 1300642591;
                            return var55;
                        case 1263135494:
                            var9 ^= -1998344843;
                            return var55;
                        case 1882953917:
                        default:
                            var9 ^= -1527179173;
                            return var55;
                    }
                case 1:
                    var9 = var1 & -173168386;
                    var9 |= -1897122083;
                    var9 ^= -1974563372;
                    var9 ^= -1864939704;
                    long var45 = var0;
                    long var7 = var45 + 1L;
                    var7 = var45 * var7;
                    var45 = var7 & 1L;
                    long var52;
                    int var47 = (var52 = var45 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var47 != 0) {
                        break label50;
                    }

                    byte var54 = 3;
                    var9 *= -1264507045;
                    var9 >>= 13;
                    var9 -= 1754750890;
                    var9 ^= -622610261;
                    return var54;
                case 2:
                    var9 = var1 & -1505631766;
                    var9 |= 1526229079;
                    var9 |= 1335035482;
                    var9 *= -702161101;
                    var9 ^= 1208806301;
                    break;
                case 3:
                    var9 = var1 - -1517833119;
                    var9 ^= -1269269527;
                    long var4 = var0;
                    long var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var51;
                    int var40 = (var51 = var4 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
                    if (var40 != 0) {
                        break label50;
                    }

                    byte var41 = 2;
                    var9 ^= -1875605457;
                    var9 ^= 534846144;
                    return var41;
                default:
                    var9 = var1 - 2038368195;
                    var9 ^= -1557976730;
            }

            int var5 = var0 + 1;
            var5 = var0 * var5;
            int var49 = var0 + 2;
            var5 *= var49;
            int var3 = var0 + 3;
            var5 *= var3;
            var3 = var5 & 7;
            if (var3 == 0) {
                byte var53 = 0;
                var9 += -100677867;
                var9 *= 1332806741;
                var9 >>>= 27;
                var9 ^= 1300642707;
                return var53;
            }
        }

        RuntimeException var30 = new RuntimeException();
        throw var30;
    }

    private void L(Canvas var1, WorldDraw var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var12 = System.identityHashCode(this);
        double[] var13 = this.Lu;
        double var58 = var13[var3];
        double[] var15 = this.Re;
        double var59 = var15[var3];
        double[] var17 = this.G;
        double var60 = var17[var3];
        Integer var49 = var12;
        if (var49 == null) {
            int var43 = var9 & 252447653;
            var43 ^= 106804114;
            long var11 = var3;
            long var61 = var11 + 1L;
            var61 = var11 * var61;
            var11 = var61 & 1L;
            long var63;
            int var46 = (var63 = var11 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
            if (var46 != 0) {
                IllegalStateException var48 = new IllegalStateException();
                throw var48;
            } else {
                UnsupportedOperationException var47 = new UnsupportedOperationException();
                throw var47;
            }
        } else {
            switch (var9) {
                case -1727251856:
                    int var36 = var9 << 15;
                    var36 ^= 754056443;
                    var36 >>= 12;
                    var36 ^= -2110153259;
                    break;
                case 1353294651:
                    int var35 = var9 ^ -1902592801;
                    break;
                case 1403940904:
                default:
                    int var10 = var9 ^ 1844942250;
            }

            double[] var40 = this.Lu;
            double var41 = var40[var4];
            double[] var50 = this.Re;
            double var19 = var50[var4];
            double[] var51 = this.G;
            double var21 = var51[var4];
            double[] var52 = this.Lu;
            double var23 = var52[var5];
            double[] var53 = this.Re;
            double var25 = var53[var5];
            double[] var54 = this.G;
            double var27 = var54[var5];
            double[] var55 = this.Lu;
            double var29 = var55[var6];
            double[] var56 = this.Re;
            double var31 = var56[var6];
            double[] var57 = this.G;
            double var33 = var57[var6];
            boolean var42 = var2.band(var1, var58, var59, var60, var41, var19, var21, var23, var25, var27, var29, var31, var33, var7, var8, false);
        }
    }

    private void VL(Canvas var1, WorldDraw var2, int var3, int var4, float var5, float var6, int var7, int var8) {
        label63: {
            int var11 = System.identityHashCode(this);
            double[] var12 = this.Lu;
            double var70 = var12[var3];
            double[] var14 = this.Lu;
            double var72 = var14[var4];
            double[] var16 = this.Lu;
            double var78 = var16[var3];
            double var73 = var72 - var78;
            double var79 = var5;
            double var74 = var73 * var79;
            double var71 = var70 + var74;
            var14 = this.Re;
            double var76 = var14[var3];
            var16 = this.Re;
            double var81 = var16[var4];
            double[] var18 = this.Re;
            double var96 = var18[var3];
            double var82 = var81 - var96;
            double var97 = var5;
            double var83 = var82 * var97;
            double var77 = var76 + var83;
            int var84 = var11 + 1;
            int var85 = var11 * var84;
            int var17 = var11 + 2;
            int var86 = var85 * var17;
            var17 = var11 + 3;
            int var87 = var86 * var17;
            int var88 = var87 & 7;
            if (var88 != 0) {
                int var9 = var8 & -1670723527;
                var9 *= 1525028455;
                var9 -= 1348126227;
                var9 |= 724725927;
                var9 ^= 739679988;
            } else {
                label65: {
                    int var37 = var8 >>> 28;
                    var37 ^= -170742728;
                    long var89 = var3;
                    long var98 = var89 + 1L;
                    long var99 = var89 * var98;
                    long var90 = var99 & 1L;
                    long var172;
                    int var91 = (var172 = var90 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                    if (var91 != 0) {
                        break label63;
                    }

                    var16 = this.G;
                    double var93 = var16[var3];
                    var18 = this.G;
                    double var101 = var18[var4];
                    double[] var20 = this.G;
                    double var107 = var20[var3];
                    double var102 = var101 - var107;
                    double var108 = var5;
                    double var103 = var102 * var108;
                    double var94 = var93 + var103;
                    var18 = this.Lu;
                    double var105 = var18[var3];
                    var20 = this.Lu;
                    double var110 = var20[var4];
                    double[] var22 = this.Lu;
                    double var116 = var22[var3];
                    double var111 = var110 - var116;
                    double var117 = var6;
                    double var112 = var111 * var117;
                    double var106 = var105 + var112;
                    var20 = this.Re;
                    double var114 = var20[var3];
                    var22 = this.Re;
                    double var119 = var22[var4];
                    double[] var24 = this.Re;
                    double var125 = var24[var3];
                    double var120 = var119 - var125;
                    double var126 = var6;
                    double var121 = var120 * var126;
                    double var115 = var114 + var121;
                    var22 = this.G;
                    double var123 = var22[var3];
                    var24 = this.G;
                    double var128 = var24[var4];
                    double[] var26 = this.G;
                    double var148 = var26[var3];
                    double var129 = var128 - var148;
                    double var149 = var6;
                    double var130 = var129 * var149;
                    double var124 = var123 + var130;
                    NumberSetting var131 = this.O;
                    float var132 = var131.WM();
                    NumberSetting var25 = this.av;
                    float var133 = var25.WM();
                    float var173;
                    int var134 = (var173 = var133 - 0.0F) == 0.0F ? 0 : (var173 < 0.0F ? -1 : 1);
                    if (var134 > 0) {
                        var37 += 717894255;
                        var37 |= -944588939;
                        var37 ^= 1837896844;
                        int var135 = var3 + 1;
                        int var136 = var3 * var135;
                        int var150 = var3 + 2;
                        int var137 = var136 * var150;
                        int var151 = var3 + 3;
                        int var138 = var137 * var151;
                        int var139 = var138 & 7;
                        if (var139 != 0) {
                            break label63;
                        }

                        float var140 = var132 * 3.5F;
                        int var152 = DP.nq(var7, 0.2F);
                        Paint var153 = Paint.solid(var152);
                        long var27 = var11;
                        long var29 = var27 + 1L;
                        var29 = var27 * var29;
                        long var31 = var27 + 2L;
                        var29 *= var31;
                        var27 += 3L;
                        var29 *= var27;
                        var27 = var29 & 7L;
                        long var174;
                        int var164 = (var174 = var27 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                        if (var164 != 0) {
                            switch (var37) {
                                case -1976374415:
                                    var37 -= -954338055;
                                    var37 ^= -788720861;
                                    break label65;
                                case 598652760:
                                default:
                                    var37 ^= -1509611234;
                                    break label65;
                                case 1971302170:
                                    var37 ^= -1475627034;
                                    break label65;
                            }
                        }

                        var37 *= -951005163;
                        var37 >>>= 9;
                        var37 ^= -64925639;
                        Integer var165 = var3;
                        if (var165 == null) {
                            break label63;
                        }

                        Paint var154 = var153.soft(var132);
                        boolean var141 = var2.line(var1, var71, var77, var94, var106, var115, var124, var140, var154);
                        var37 &= 1705945059;
                        var37 -= -255852613;
                        var37 ^= -1624505049;
                    } else {
                        var37 ^= 1388866564;
                        var37 ^= 1689032388;
                        var37 |= 782669622;
                        var37 -= -1254110311;
                        var37 ^= -701125209;
                    }

                    int var142 = var3 + 1;
                    int var143 = var3 * var142;
                    int var155 = var3 + 2;
                    int var144 = var143 * var155;
                    int var156 = var3 + 3;
                    int var145 = var144 * var156;
                    int var146 = var145 & 7;
                    if (var146 != 0) {
                        break label63;
                    }

                    Paint var147 = Paint.solid(var7);
                    long var157 = var11;
                    long var28 = var157 + 1L;
                    var28 = var157 * var28;
                    long var30 = var157 + 2L;
                    var28 *= var30;
                    long var158 = var157 + 3L;
                    var28 *= var158;
                    long var159 = var28 & 7L;
                    long var175;
                    var11 = (var175 = var159 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var11 == 0) {
                        var37 -= 289734056;
                        var37 ^= 1788377470;
                        long var62 = var3;
                        long var160 = var62 + 1L;
                        long var161 = var62 * var160;
                        long var63 = var161 & 1L;
                        long var176;
                        var37 = (var176 = var63 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var37 == 0) {
                            boolean var65 = var2.line(var1, var71, var77, var94, var106, var115, var124, var132, var147);
                            return;
                        }
                        break label63;
                    }

                    switch (var37) {
                        case -331177535:
                            var37 -= 2063046989;
                            var37 ^= 1654844719;
                            break;
                        case 1023705083:
                            var37 ^= 1947655149;
                            break;
                        case 1168120395:
                        default:
                            var37 ^= -1785656290;
                    }
                }
            }

            Integer var68 = var3;
            if (var68 != null) {
                IllegalStateException var69 = new IllegalStateException();
                throw var69;
            }
        }

        IllegalArgumentException var66 = new IllegalArgumentException();
        throw var66;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -662041884;
        int var2 = Module.C;
        int var4 = of_2.xF(var3, var1, var2);
        HZ = var4;
        int[] var5 = new int[]{0, 1, 1, 3, 3, 2, 2, 0, 4, 5, 5, 7, 7, 6, 6, 4, 0, 4, 1, 5, 2, 6, 3, 7};
        Ob = var5;
    }
}
