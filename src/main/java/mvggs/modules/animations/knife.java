package mvggs.modules.animations;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.KnifeRenderer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;

public final class knife extends Module {
    private final ModeSetting c;
    private final ModeSetting ie;
    private final NumberSetting A;
    private final NumberSetting s;
    private final KeybindSetting MX;
    private final NumberSetting BY;
    private final BooleanSetting k;
    private final BooleanSetting bT;
    private final BooleanSetting Q;
    private final ColorSetting j;
    private final Wx Nv;
    private final KnifeRenderer iY;
    private int Ha;
    private int G;
    private boolean NT;
    private boolean zn;
    private Da bu;
    private float Y;
    private CompletableFuture b;
    private long mb;
    private long O;
    private static boolean DG;
    private static boolean V;
    public static final int l;

    public knife() {
        super("knife", "Knife", ModuleCategory.ANIMATIONS);
        ModuleCategory var1 = ModuleCategory.ANIMATIONS;

        Da var2 = Da.KARAMBIT;
        ModeSetting var4 = new ModeSetting("model", "Knife", var2);
        Setting var5 = var4.q("Which knife replaces your sword.");
        ModeSetting var6 = (ModeSetting)var5;
        Setting var7 = this.addSetting(var6);
        ModeSetting var8 = (ModeSetting)var7;
        this.c = var8;
        bT var57 = dev.aurap.hub.bT.FADE;
        ModeSetting var9 = new ModeSetting("finish", "Finish", var57);
        El var58 = (var0, var1x) -> {
            int var2x = l;
            var2x ^= -1425885800;
            int var4x = System.identityHashCode(var0);
            long var22x = var4x;
            long var6x = var22x + 1L;
            var6x = var22x * var6x;
            long var23x = var6x & 1L;
            long var30x;
            var4x = (var30x = var23x - 0L) == 0L ? 0 : (var30x < 0L ? -1 : 1);
            if (var4x == 0) {
                var2x ^= 1804292742;
                var2x >>= 11;
                var2x ^= 1632174485;
                var4x = var1x + 1;
                var4x = var1x * var4x;
                int var5x = var1x + 2;
                var4x *= var5x;
                int var3x = var1x + 3;
                var4x *= var3x;
                var3x = var4x & 7;
                if (var3x == 0) {
                      return ((bT)var0).swatch(var1x);
                } else {
                    RuntimeException var21x = new RuntimeException();
                    throw var21x;
                }
            } else {
                switch (var2x) {
                    case -1186517871:
                        var2x ^= -2082451078;
                        break;
                    case -1093623515:
                    default:
                        var2x ^= -32287151;
                        break;
                    case 1149454808:
                        var2x |= -1048023338;
                        var2x -= -296889880;
                        var2x |= 2137363136;
                        var2x -= 1410724626;
                        var2x ^= 1542652943;
                }

                UnsupportedOperationException var16x = new UnsupportedOperationException();
                throw var16x;
            }
        };
        ModeSetting var10 = var9.w(var58);
        Setting var11 = var10.q("Blade finish, generated in the game.");
        ModeSetting var12 = (ModeSetting)var11;
        Setting var13 = this.addSetting(var12);
        ModeSetting var14 = (ModeSetting)var13;
        this.ie = var14;
        NumberSetting var15 = new NumberSetting("pattern", "Pattern", 1.0F, 1.0F, 999.0F);
        NumberSetting var16 = var15.W(1.0F);
        Setting var17 = var16.q("Seed of the pattern: every number gives the finish its own look.");
        NumberSetting var18 = (NumberSetting)var17;
        Setting var19 = this.addSetting(var18);
        NumberSetting var20 = (NumberSetting)var19;
        this.A = var20;
        NumberSetting var21 = new NumberSetting("size", "Size", 1.0F, 0.7F, 1.3F);
        NumberSetting var22 = var21.W(0.05F);
        NumberSetting var23 = var22.L("x");
        Setting var24 = this.addSetting(var23);
        NumberSetting var25 = (NumberSetting)var24;
        this.s = var25;
        KeybindSetting var26 = new KeybindSetting("inspect_key", "Inspect Key", 71);
        Setting var27 = var26.q("Plays the inspect animation.");
        KeybindSetting var28 = (KeybindSetting)var27;
        Setting var29 = this.addSetting(var28);
        KeybindSetting var30 = (KeybindSetting)var29;
        this.MX = var30;
        NumberSetting var31 = new NumberSetting("swing_speed", "Swing Speed", 1.0F, 0.6F, 1.8F);
        NumberSetting var32 = var31.W(0.05F);
        NumberSetting var33 = var32.L("x");
        Setting var34 = this.addSetting(var33);
        NumberSetting var35 = (NumberSetting)var34;
        this.BY = var35;
        BooleanSetting var36 = new BooleanSetting("draw", "Draw Animation", true);
        Setting var37 = var36.q("Animate the knife coming out when you switch to it.");
        BooleanSetting var38 = (BooleanSetting)var37;
        Setting var39 = this.addSetting(var38);
        BooleanSetting var40 = (BooleanSetting)var39;
        this.k = var40;
        BooleanSetting var41 = new BooleanSetting("shine", "Metal Shine", true);
        Setting var42 = var41.q("Highlights on the blade that move as it turns.");
        BooleanSetting var43 = (BooleanSetting)var42;
        Setting var44 = this.addSetting(var43);
        BooleanSetting var45 = (BooleanSetting)var44;
        this.bT = var45;
        BooleanSetting var46 = new BooleanSetting("trail", "Swing Trail", true);
        Setting var47 = this.addSetting(var46);
        BooleanSetting var48 = (BooleanSetting)var47;
        this.Q = var48;
        ColorSetting var49 = new ColorSetting("trail_color", "Trail Color", -1643265, false);
        BooleanSetting var59 = this.Q;
        Object var3 = Objects.requireNonNull(var59);
        BooleanSupplier var60 = var59::vb;
        Setting var50 = var49.Pt(var60);
        ColorSetting var51 = (ColorSetting)var50;
        Setting var52 = this.addSetting(var51);
        ColorSetting var53 = (ColorSetting)var52;
        this.j = var53;
        Wx var54 = new Wx();
        this.Nv = var54;
        KnifeRenderer var55 = new KnifeRenderer();
        this.iY = var55;
        this.G = -1;
        this.mb = -1L;
        this.O = -1L;
        this.dy("A shooter-style knife instead of your sword: draw, inspect, combo swings and finishes.");
        EventListener<p_2> var56 = (p_2 var1x) -> {
            int var2x = l;
            var2x ^= 1999428785;
            int var3x = System.identityHashCode(this);
            Integer var18x = var3x;
            if (var18x == null) {
                long var19x = switch (var2x) {
                    case -1733484303 -> {
                        var2x &= -1544943167;
                        var2x -= 1935687898;
                        var2x >>>= 2;
                        yield var2x ^ -57923343;
                    }
                    default -> var2x ^ 84163892;
                    case -315180194 -> var2x ^ 576131744;
                };
                long var5x = var19x + 1L;
                var5x = var19x * var5x;
                long var20x = var5x & 1L;
                long var31x;
                int var21x = (var31x = var20x - 0L) == 0L ? 0 : (var31x < 0L ? -1 : 1);
                if (var21x == 0) {
                    UnsupportedOperationException var22x = new UnsupportedOperationException();
                    throw var22x;
                }
            } else {
                var2x += 1548419296;
                var2x -= -1428280583;
                var2x ^= -1598868874;
                int var23x = var2x + 1;
                var23x = var2x * var23x;
                var23x &= 1;
                if (var23x == 0) {
                    FrameContext var27x = var1x.frame();
                    float var28x = var27x.dt();
                    FrameContext var4x = var1x.frame();
                    double var29x = var4x.time();
                    var2x &= -1789034008;
                    var2x ^= -546120594;
                    var2x ^= -872509900;
                    this.eQ(var28x, var29x, var2x);
                    return;
                }
            }

            AssertionError var26x = new AssertionError();
            throw var26x;
        };
        this.onEvent(p_2.class, var56);
    }

    @Override
    protected void J() {
        int var1 = l;
        var1 ^= -2106679719;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            var1 |= 976642798;
            var1 += -1486108389;
            var1 ^= -1345828119;
            var1 ^= -1216368639;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var6 = var18 + 2L;
            var4 *= var6;
            long var19 = var18 + 3L;
            var4 *= var19;
            long var20 = var4 & 7L;
            long var28;
            int var21 = (var28 = var20 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var21 == 0) {
                Wx var23 = this.Nv;
                var23.e();
                KnifeRenderer var24 = this.iY;
                var24.resetTrail();
                this.NT = false;
                this.G = -1;
            } else {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            var1 += 1981184437;
            var1 += 1955695583;
            var1 ^= -1823137947;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    private void eQ(float var1, double var2, int var4) {
        boolean var305 = false;
        label458: {
            int var6 = System.identityHashCode(this);
            double var7 = var2 % 10000.0;
            float var269 = (float)var7;
            this.Y = var269;
            int var270 = var4 - 1414091413;
            int var271 = var270 - 1798413200;
            int var272 = var271 & 1088436583;
            int var273 = var272 ^ 2042096608;
            this.E(var273);
            Entity var274 = i_2.QI();
            Integer var8 = var6;
            int var31;
            if (var8 != null) {
                var31 = var4 | -97263033;
                var31 += 1840503786;
                var31 ^= 2114087536;
                var8 = var31;
                if (var8 == null) {
                    break label458;
                }

                boolean var307 = var274 instanceof PlayerEntity;
                if (!var307) {
                    var31 ^= -719623789;
                    var31 |= -2134137123;
                    var31 += -1195434001;
                    var31 *= 277019169;
                    var31 ^= 329418569;
                    long var263 = var31;
                    long var326 = var263 + 1L;
                    long var327 = var263 * var326;
                    long var438 = var263 + 2L;
                    long var328 = var327 * var438;
                    long var264 = var263 + 3L;
                    long var329 = var328 * var264;
                    long var265 = var329 & 7L;
                    long var531;
                    var6 = (var531 = var265 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        this.NT = false;
                        return;
                    }
                    break label458;
                }

                var31 -= -173587357;
                var31 ^= 1535157055;
                PlayerEntity var275 = (PlayerEntity)var274;
                long var308 = var6;
                long var10 = var308 + 1L;
                var10 = var308 * var10;
                long var309 = var10 & 1L;
                long var532;
                int var310 = (var532 = var309 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                if (var310 == 0) {
                    var31 = switch (var31) {
                        case -325589930 -> var31 ^ -1020537846;
                        default -> var31 ^ -1994697183;
                        case 1195557649 -> {
                            var31 |= -1595619997;
                            var31 *= 1849895539;
                            var31 += -1064639064;
                            var31 |= -336741102;
                            yield var31 ^ -839674145;
                        }
                    } ^ 2028736880;
                    var31 ^= 99399705;
                    long var311 = var31;
                    var10 = var311 + 1L;
                    var10 = var311 * var10;
                    long var312 = var10 & 1L;
                    long var533;
                    var310 = (var533 = var312 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                    if (var310 != 0) {
                        break label458;
                    }

                    ModeSetting var314 = this.c;
                    Enum var315 = var314.A();
                    Da var316 = (Da)var315;
                    Integer var9 = var6;
                    if (var9 == null) {
                        var31 *= -714276831;
                        var31 >>>= 16;
                        var31 |= 238700569;
                        var31 ^= 541262932;
                    } else {
                        label462: {
                            var31 ^= 1302246745;
                            var31 ^= -1984511389;
                            Da var330 = this.bu;
                            if (var316 != var330) {
                                var31 *= -2089715549;
                                var31 ^= -795428592;
                                var9 = var31;
                                if (var9 == null) {
                                    break label458;
                                }

                                this.bu = var316;
                                var9 = var6;
                                if (var9 == null) {
                                    var31 *= -815025105;
                                    var31 ^= 1367054766;
                                    break label462;
                                }
                                var31 = switch (var31) {
                                    case 219409901 -> {
                                        var31 |= -1471913985;
                                        var31 |= -319039152;
                                        var31 &= 1639142120;
                                        yield var31 ^ -241853088;
                                    }
                                    default -> var31 ^ -1388264578;
                                    case 1418152456 -> var31 ^ -26095159;
                                };
                                long var333 = var31;
                                long var11 = var333 + 1L;
                                var11 = var333 * var11;
                                long var334 = var11 & 1L;
                                long var534;
                                int var335 = (var534 = var334 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                if (var335 != 0) {
                                    break label458;
                                }

                                Wx var336 = this.Nv;
                                var336.e();
                                KnifeRenderer var337 = this.iY;
                                var337.resetTrail();
                                this.Ha = 0;
                                var31 &= 485300115;
                                var31 ^= -671931324;
                                var31 |= 2086602465;
                                var31 ^= 426498208;
                            } else {
                                var31 += -1822773247;
                                var31 -= -1426761222;
                                var31 <<= 4;
                                var31 ^= -546029275;
                            }

                            long var338 = var31;
                            long var440 = var338 + 1L;
                            var440 = var338 * var440;
                            long var13 = var338 + 2L;
                            var440 *= var13;
                            long var339 = var338 + 3L;
                            var440 *= var339;
                            long var340 = var440 & 7L;
                            long var535;
                            int var341 = (var535 = var340 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                            if (var341 != 0) {
                                break label458;
                            }

                            ItemStack var276 = var275.getMainHandStack();
                            var341 = var31 >>> 2;
                            var341 ^= -1948857092;
                            boolean var277 = n(var276, var341);
                            var341 = i_2.oN();
                            var10 = var6;
                            long var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var10 = var12 & 1L;
                            long var536;
                            int var399 = (var536 = var10 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                            label445:
                            if (var399 == 0) {
                                var31 -= 1228669684;
                                var31 ^= 245799088;
                                Integer var400 = var31;
                                if (var400 == null) {
                                    break label458;
                                }

                                label439:
                                if (var277) {
                                    var31 |= -1568623117;
                                    var31 |= 300471159;
                                    var31 *= 2051201891;
                                    var31 |= -20319637;
                                    var31 ^= -982890728;
                                    var10 = var31;
                                    var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    var10 = var12 & 1L;
                                    long var537;
                                    int var403 = (var537 = var10 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                                    if (var403 != 0) {
                                        break label458;
                                    }

                                    boolean var404 = this.NT;
                                    var440 = var6;
                                    var13 = var440 + 1L;
                                    var13 = var440 * var13;
                                    long var15 = var440 + 2L;
                                    var13 *= var15;
                                    var440 += 3L;
                                    var13 *= var440;
                                    var440 = var13 & 7L;
                                    long var538;
                                    int var447 = (var538 = var440 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                                    if (var447 != 0) {
                                        var31 ^= 246086912;
                                        var31 ^= -824647992;
                                        var31 ^= -729261038;
                                        break label445;
                                    }
                                    var31 = switch (var31) {
                                        case -1954891565 -> var31 ^ -1586741855;
                                        default -> var31 ^ 554214961;
                                        case 981710071 -> {
                                            var31 ^= -1032950022;
                                            var31 += -783164831;
                                            var31 ^= -312903508;
                                            yield var31 ^ -1701665142;
                                        }
                                    };
                                    if (var404) {
                                        var31 = switch (var31) {
                                            case -1108055480 -> {
                                                var31 ^= 1997261353;
                                                var31 *= 1373481157;
                                                yield var31 ^ 528936925;
                                            }
                                            default -> var31 ^ -702712232;
                                            case -808647631 -> var31 ^ -315760977;
                                        };
                                        int var405 = var31 + 1;
                                        int var406 = var31 * var405;
                                        int var407 = var406 & 1;
                                        if (var407 != 0) {
                                            break label458;
                                        }

                                        int var408 = this.G;
                                        var440 = var6;
                                        var13 = var440 + 1L;
                                        var13 = var440 * var13;
                                        var440 = var13 & 1L;
                                        long var539;
                                        int var450 = (var539 = var440 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
                                        if (var450 != 0) {
                                            switch (var31) {
                                                case -535974838:
                                                    var31 ^= -330378707;
                                                    break label445;
                                                case 53869944:
                                                    var31 |= 2131710641;
                                                    var31 -= 1373488338;
                                                    var31 |= -287272044;
                                                    var31 *= 1491871915;
                                                    var31 ^= -1342033904;
                                                    break label445;
                                                case 1455691137:
                                                default:
                                                    var31 ^= 2091011899;
                                                    break label445;
                                            }
                                        }

                                        var31 &= -307224769;
                                        var31 += 41298134;
                                        var31 &= 2080988127;
                                        var31 ^= -1950836258;
                                        int var451 = var31 + 1;
                                        int var452 = var31 * var451;
                                        int var502 = var31 + 2;
                                        int var453 = var452 * var502;
                                        int var503 = var31 + 3;
                                        int var454 = var453 * var503;
                                        int var455 = var454 & 7;
                                        if (var455 != 0) {
                                            break label458;
                                        }

                                        if (var341 == var408) {
                                            var31 ^= 1929158293;
                                            var31 *= -1160246645;
                                            var31 &= 444989263;
                                            var31 ^= -1052817839;
                                            break label439;
                                        }

                                        var31 <<= 14;
                                        var31 ^= 1375176235;
                                    } else {
                                        var31 |= -691236182;
                                        var31 ^= -1728086847;
                                    }

                                    BooleanSetting var409 = this.k;
                                    boolean var410 = var409.vb();
                                    Integer var456 = var6;
                                    if (var456 == null) {
                                        switch (var31) {
                                            case 852435492:
                                                var31 ^= 1120363279;
                                                break label445;
                                            case 1728284203:
                                                var31 &= 1099859231;
                                                var31 += -385965907;
                                                var31 &= -794537830;
                                                var31 &= -1286593459;
                                                var31 ^= 779733797;
                                                break label445;
                                            case 1837605191:
                                            default:
                                                var31 ^= -805975833;
                                                break label445;
                                        }
                                    }

                                    var31 &= 1484706128;
                                    var31 += -1112170078;
                                    var31 += 636710244;
                                    var31 -= 1558677239;
                                    var31 ^= 1918435022;
                                    if (var410) {
                                        var31 += 1133042533;
                                        var31 ^= 1478687573;
                                        Integer var411 = var31;
                                        if (var411 == null) {
                                            break label458;
                                        }

                                        Wx var412 = this.Nv;
                                        nU var457 = nU.G(var316);
                                        g_2 var458 = var457.s();
                                        var12 = var6;
                                        long var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        var12 = var14 & 1L;
                                        long var540;
                                        int var506 = (var540 = var12 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                                        if (var506 != 0) {
                                            var31 -= 1843658868;
                                            var31 -= 1077097765;
                                            var31 *= -582714123;
                                            var31 |= -847237262;
                                            var31 ^= -741329697;
                                            break label445;
                                        }

                                        var31 *= 1528343193;
                                        var31 += 20873682;
                                        var31 >>= 10;
                                        var31 ^= -254831837;
                                        int var507 = var31 + 1;
                                        int var508 = var31 * var507;
                                        int var509 = var508 & 1;
                                        if (var509 != 0) {
                                            break label458;
                                        }

                                        var412.lm(var458, 1.0F);
                                        var31 *= -459525361;
                                        var31 ^= -1051794376;
                                    } else {
                                        var31 &= -234758557;
                                        var31 ^= -1584300369;
                                        Integer var413 = var31;
                                        if (var413 == null) {
                                            break label458;
                                        }

                                        Wx var414 = this.Nv;
                                        int var459 = var6 + 1;
                                        int var460 = var6 * var459;
                                        int var461 = var460 & 1;
                                        if (var461 != 0) {
                                            var31 |= 1743982105;
                                            var31 *= -362869303;
                                            var31 -= 976496457;
                                            var31 ^= 1960704707;
                                            break label445;
                                        }

                                        var31 += 412250274;
                                        var31 ^= 300812393;
                                        var440 = var31;
                                        var13 = var440 + 1L;
                                        var13 = var440 * var13;
                                        var440 = var13 & 1L;
                                        long var541;
                                        int var464 = (var541 = var440 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                                        if (var464 != 0) {
                                            break label458;
                                        }

                                        var414.e();
                                        var31 |= 422648393;
                                        var31 ^= -2104703145;
                                    }

                                    Integer var415 = var31;
                                    if (var415 == null) {
                                        break label458;
                                    }

                                    this.Ha = 0;
                                    KnifeRenderer var416 = this.iY;
                                    Integer var465 = var6;
                                    if (var465 == null) {
                                        var31 -= -1922086300;
                                        var31 ^= 40982887;
                                        break label445;
                                    }

                                    var31 >>>= 1;
                                    var31 ^= -1360256807;
                                    var31 ^= -157341119;
                                    int var466 = var31 + 1;
                                    int var467 = var31 * var466;
                                    int var468 = var467 & 1;
                                    if (var468 != 0) {
                                        break label458;
                                    }

                                    var416.resetTrail();
                                    var31 *= 1638909259;
                                    var31 ^= 173026477;
                                    var31 &= 753695066;
                                    var31 += 1242182874;
                                    var31 ^= -2054314508;
                                } else {
                                    var31 &= -579784568;
                                    var31 ^= -1676505737;
                                    var31 *= 1419342973;
                                    var31 *= -972900309;
                                    var31 ^= -2005489377;
                                }

                                Integer var417 = var31;
                                if (var417 == null) {
                                    break label458;
                                }

                                this.NT = var277;
                                this.G = var341;
                                long var345 = var6;
                                var440 = var345 + 1L;
                                var440 = var345 * var440;
                                var13 = var345 + 2L;
                                var440 *= var13;
                                long var346 = var345 + 3L;
                                var440 *= var346;
                                long var347 = var440 & 7L;
                                long var542;
                                int var278 = (var542 = var347 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
                                label408:
                                if (var278 == 0) {
                                    var31 = switch (var31) {
                                        case -742717418 -> {
                                            var31 <<= 4;
                                            var31 |= 1654654486;
                                            yield var31 ^ -264454051;
                                        }
                                        default -> var31 ^ -1763416335;
                                        case 2128953574 -> var31 ^ 46723835;
                                    };
                                    int var279 = var31 + 1;
                                    int var280 = var31 * var279;
                                    int var281 = var280 & 1;
                                    if (var281 != 0) {
                                        break label458;
                                    }

                                    boolean var282 = V;
                                    if (var282) {
                                        var31 = switch (var31) {
                                            case -1953741013 -> {
                                                var31 |= 805821506;
                                                yield var31 ^ -1824830828;
                                            }
                                            default -> var31 ^ 613148705;
                                            case -1261464235 -> var31 ^ 1770160854;
                                        };
                                        Integer var283 = var31;
                                        if (var283 == null) {
                                            break label458;
                                        }

                                        boolean var284 = this.NT;
                                        Integer var348 = var6;
                                        if (var348 == null) {
                                            var31 *= 606426925;
                                            var31 -= 1889408588;
                                            var31 ^= -1316144214;
                                            break label408;
                                        }
                                        var31 = switch (var31) {
                                            case -227588665 -> var31 ^ -1304152009;
                                            default -> var31 ^ -22368690;
                                            case 682923519 -> {
                                                var31 -= 235819190;
                                                yield var31 ^ -787469516;
                                            }
                                        };
                                        if (var284) {
                                            var31 |= 898238325;
                                            var31 += -1673865208;
                                            var31 -= -785833790;
                                            var31 &= -992974738;
                                            var31 ^= -744658351;
                                            Integer var285 = var31;
                                            if (var285 == null) {
                                                break label458;
                                            }

                                            Wx var286 = this.Nv;
                                            nU var349 = nU.G(var316);
                                            int var418 = this.Ha;
                                            int var473 = var418 + 1;
                                            this.Ha = var473;
                                            g_2 var350 = var349.cJ(var418);
                                            NumberSetting var419 = this.BY;
                                            var440 = var6;
                                            var13 = var440 + 1L;
                                            var13 = var440 * var13;
                                            long var530 = var440 + 2L;
                                            var13 *= var530;
                                            var440 += 3L;
                                            var13 *= var440;
                                            var440 = var13 & 7L;
                                            long var543;
                                            int var477 = (var543 = var440 - 0L) == 0L ? 0 : (var543 < 0L ? -1 : 1);
                                            if (var477 != 0) {
                                                var31 += 1297978193;
                                                var31 ^= 1322456649;
                                                break label408;
                                            }

                                            var31 -= 1950374850;
                                            var31 *= 1020824155;
                                            var31 &= 136049831;
                                            var31 &= 1731371468;
                                            var31 ^= -1387987789;
                                            int var478 = var31 + 1;
                                            int var479 = var31 * var478;
                                            int var510 = var31 + 2;
                                            int var480 = var479 * var510;
                                            int var511 = var31 + 3;
                                            int var481 = var480 * var511;
                                            int var482 = var481 & 7;
                                            if (var482 != 0) {
                                                break label458;
                                            }

                                            float var420 = var419.WM();
                                            var286.lm(var350, var420);
                                            var31 -= -1817699554;
                                            var31 ^= -994085211;
                                        } else {
                                            var31 |= -544354372;
                                            var31 |= -134943795;
                                            var31 |= 1413517617;
                                            var31 ^= 584861773;
                                        }
                                    } else {
                                        var31 -= -1076081813;
                                        var31 >>>= 23;
                                        var31 += -1321889607;
                                        var31 += -765833357;
                                        var31 ^= 1588352627;
                                    }

                                    long var351 = var31;
                                    var440 = var351 + 1L;
                                    var440 = var351 * var440;
                                    long var352 = var440 & 1L;
                                    long var544;
                                    int var287 = (var544 = var352 - 0L) == 0L ? 0 : (var544 < 0L ? -1 : 1);
                                    if (var287 != 0) {
                                        break label458;
                                    }

                                    V = false;
                                    KeybindSetting var288 = this.MX;
                                    boolean var289 = var288.r();
                                    Integer var353 = var6;
                                    if (var353 == null) {
                                        var31 |= -18748809;
                                        var31 -= 2138228515;
                                        var31 ^= -1375144967;
                                    } else {
                                        label516: {
                                            var31 ^= 391267252;
                                            var31 -= -965213359;
                                            var31 ^= -948750921;
                                            var353 = var31;
                                            if (var353 == null) {
                                                break label458;
                                            }

                                            label475: {
                                                if (var289) {
                                                    var31 *= -1087001135;
                                                    var31 ^= -1437607795;
                                                    int var290 = var31 + 1;
                                                    int var291 = var31 * var290;
                                                    int var355 = var31 + 2;
                                                    int var292 = var291 * var355;
                                                    var355 = var31 + 3;
                                                    int var293 = var292 * var355;
                                                    int var294 = var293 & 7;
                                                    if (var294 != 0) {
                                                        break label458;
                                                    }

                                                    boolean var295 = i_2.Wt();
                                                    long var357 = var6;
                                                    var440 = var357 + 1L;
                                                    var440 = var357 * var440;
                                                    long var358 = var440 & 1L;
                                                    long var545;
                                                    var355 = (var545 = var358 - 0L) == 0L ? 0 : (var545 < 0L ? -1 : 1);
                                                    if (var355 != 0) {
                                                        var31 += -2053619315;
                                                        var31 *= 1771530341;
                                                        var31 ^= 341374147;
                                                        break label516;
                                                    }
                                                    var31 = switch (var31) {
                                                        case -1475521335 -> {
                                                            var31 |= -1784319358;
                                                            yield var31 ^ 1074160309;
                                                        }
                                                        case -920459471 -> var31 ^ 145977258;
                                                        default -> var31 ^ 71868339;
                                                    };
                                                    if (!var295) {
                                                        var31 = switch (var31) {
                                                            case -39119746 -> {
                                                                var31 ^= -325190907;
                                                                yield var31 ^ -313238992;
                                                            }
                                                            default -> var31 ^ 1738578175;
                                                            case 883903094 -> var31 ^ 390053745;
                                                        };
                                                        int var296 = var31 + 1;
                                                        int var297 = var31 * var296;
                                                        var355 = var31 + 2;
                                                        int var298 = var297 * var355;
                                                        var355 = var31 + 3;
                                                        int var299 = var298 * var355;
                                                        int var300 = var299 & 7;
                                                        if (var300 != 0) {
                                                            break label458;
                                                        }

                                                        KeybindSetting var301 = this.MX;
                                                        int var302 = var301.JQ();
                                                        boolean var303 = i_2.R(var302);
                                                        Integer var362 = var6;
                                                        if (var362 == null) {
                                                            var31 -= 2108057127;
                                                            var31 -= 994660786;
                                                            var31 ^= -72022870;
                                                            var31 ^= -1765920011;
                                                            break label516;
                                                        }

                                                        var31 -= -294822630;
                                                        var31 ^= -442999190;
                                                        var362 = var31;
                                                        if (var362 == null) {
                                                            break label458;
                                                        }

                                                        if (var303) {
                                                            var31 >>= 6;
                                                            var31 ^= -195128294;
                                                            long var364 = var31;
                                                            var440 = var364 + 1L;
                                                            var440 = var364 * var440;
                                                            long var365 = var440 & 1L;
                                                            long var546;
                                                            int var304 = (var546 = var365 - 0L) == 0L ? 0 : (var546 < 0L ? -1 : 1);
                                                            if (var304 != 0) {
                                                                break label458;
                                                            }

                                                            var305 = true;
                                                            var31 ^= 350780016;
                                                            var31 |= 381521771;
                                                            var31 -= -230483919;
                                                            var31 &= -1913309332;
                                                            var31 ^= 275381177;
                                                            break label475;
                                                        }

                                                        switch (var31) {
                                                            case -1963477031:
                                                                var31 ^= 493219776;
                                                                break;
                                                            case -955354592:
                                                            default:
                                                                var31 ^= 431845978;
                                                                break;
                                                            case -395508133:
                                                                var31 |= -459462734;
                                                                var31 += 1533181337;
                                                                var31 ^= 1119961543;
                                                                var31 ^= -429324916;
                                                        }
                                                    } else {
                                                        var31 >>>= 22;
                                                        var31 &= -2102926970;
                                                        var31 &= -122835410;
                                                        var31 ^= -638230562;
                                                        var31 ^= 889372167;
                                                    }
                                                } else {
                                                    var31 *= -426337025;
                                                    var31 &= -1099631120;
                                                    var31 >>= 23;
                                                    var31 ^= -319299101;
                                                }

                                                long var366 = var31;
                                                var440 = var366 + 1L;
                                                var440 = var366 * var440;
                                                var13 = var366 + 2L;
                                                var440 *= var13;
                                                long var367 = var366 + 3L;
                                                var440 *= var367;
                                                long var368 = var440 & 7L;
                                                long var547;
                                                int var369 = (var547 = var368 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                                                if (var369 != 0) {
                                                    break label458;
                                                }

                                                var305 = false;
                                                var31 ^= -799280998;
                                                var31 -= -1033453740;
                                                var31 -= 1469441670;
                                                var31 *= -2101291821;
                                                var31 ^= -589833792;
                                            }

                                            int var370 = var31 + 1;
                                            var370 = var31 * var370;
                                            var370 &= 1;
                                            if (var370 != 0) {
                                                break label458;
                                            }

                                            long var373 = var6;
                                            var440 = var373 + 1L;
                                            var440 = var373 * var440;
                                            var13 = var373 + 2L;
                                            var440 *= var13;
                                            long var374 = var373 + 3L;
                                            var440 *= var374;
                                            long var375 = var440 & 7L;
                                            long var548;
                                            var370 = (var548 = var375 - 0L) == 0L ? 0 : (var548 < 0L ? -1 : 1);
                                            if (var370 != 0) {
                                                switch (var31) {
                                                    case -1436177960:
                                                        var31 ^= 292409107;
                                                        break;
                                                    case 488504561:
                                                        var31 |= 1046065213;
                                                        var31 ^= 1841532317;
                                                        var31 ^= 2095561293;
                                                        break;
                                                    case 715043572:
                                                    default:
                                                        var31 ^= 1787426400;
                                                }
                                            } else {
                                                label478: {
                                                    var31 >>>= 9;
                                                    var31 += -1400252941;
                                                    var31 ^= 816005272;
                                                    var31 -= -1817083066;
                                                    var31 ^= -481159761;
                                                    var370 = var31 + 1;
                                                    var370 = var31 * var370;
                                                    var370 &= 1;
                                                    if (var370 != 0) {
                                                        break label458;
                                                    }

                                                    int var380 = (this.NT ? 1 : 0);
                                                    if (var380 != 0) {
                                                        var31 >>= 30;
                                                        var31 ^= -287440067;
                                                        var380 = var31 + 1;
                                                        var380 = var31 * var380;
                                                        int var421 = var31 + 2;
                                                        var380 *= var421;
                                                        int var422 = var31 + 3;
                                                        var380 *= var422;
                                                        var380 &= 7;
                                                        if (var380 != 0) {
                                                            break label458;
                                                        }

                                                        if (var305) {
                                                            var31 += 1630962880;
                                                            var31 ^= -1678268726;
                                                            var31 *= 1529970707;
                                                            var31 *= 180007359;
                                                            var31 ^= -2113602138;
                                                            var380 = var31 + 1;
                                                            var380 = var31 * var380;
                                                            int var423 = var31 + 2;
                                                            var380 *= var423;
                                                            int var424 = var31 + 3;
                                                            var380 *= var424;
                                                            var380 &= 7;
                                                            if (var380 != 0) {
                                                                break label458;
                                                            }

                                                            boolean var391 = this.zn;
                                                            int var425 = var6 + 1;
                                                            int var426 = var6 * var425;
                                                            int var497 = var6 + 2;
                                                            int var427 = var426 * var497;
                                                            int var498 = var6 + 3;
                                                            int var428 = var427 * var498;
                                                            int var429 = var428 & 7;
                                                            if (var429 != 0) {
                                                                switch (var31) {
                                                                    case 461263374:
                                                                        var31 |= -2037211988;
                                                                        var31 += 652576834;
                                                                        var31 -= -1330030641;
                                                                        var31 ^= 944948236;
                                                                        break label478;
                                                                    case 1557503179:
                                                                    default:
                                                                        var31 ^= -1195850852;
                                                                        break label478;
                                                                    case 1756423605:
                                                                        var31 ^= 487921030;
                                                                        break label478;
                                                                }
                                                            }
                                                            var31 = switch (var31) {
                                                                default -> var31 ^ -296026262;
                                                                case 461263374 -> {
                                                                    var31 += 1802450693;
                                                                    var31 += 1420418482;
                                                                    yield var31 ^ -1703338651;
                                                                }
                                                                case 1152034576 -> var31 ^ -162751510;
                                                            };
                                                            var10 = var31;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            var10 = var12 & 1L;
                                                            long var549;
                                                            int var432 = (var549 = var10 - 0L) == 0L ? 0 : (var549 < 0L ? -1 : 1);
                                                            if (var432 != 0) {
                                                                break label458;
                                                            }

                                                            if (!var391) {
                                                                var31 *= 356735383;
                                                                var31 += -1451425030;
                                                                var31 ^= -1950980937;
                                                                var31 -= 748791127;
                                                                var31 ^= -1229193019;
                                                                Integer var392 = var31;
                                                                if (var392 == null) {
                                                                    break label458;
                                                                }

                                                                Wx var393 = this.Nv;
                                                                nU var317 = nU.G(var316);
                                                                int var433 = var6 + 1;
                                                                int var434 = var6 * var433;
                                                                int var435 = var434 & 1;
                                                                if (var435 != 0) {
                                                                    var31 *= -629620265;
                                                                    var31 ^= 552659315;
                                                                    var31 <<= 4;
                                                                    var31 -= -1491309597;
                                                                    var31 ^= 1035733840;
                                                                    break label478;
                                                                }

                                                                var31 -= -1548347810;
                                                                var31 ^= 130104367;
                                                                Integer var436 = var31;
                                                                if (var436 == null) {
                                                                    break label458;
                                                                }

                                                                g_2 var318 = var317.a();
                                                                var393.lm(var318, 1.0F);
                                                                switch (var31) {
                                                                    case 474532438:
                                                                    default:
                                                                        var31 ^= -856292207;
                                                                        break;
                                                                    case 1396183770:
                                                                        var31 ^= 2044513194;
                                                                        var31 -= -1395902937;
                                                                        var31 -= -800280005;
                                                                        var31 ^= 316092702;
                                                                        break;
                                                                    case 1903019905:
                                                                        var31 ^= -632829308;
                                                                }
                                                            } else {
                                                                var31 ^= -1489340389;
                                                                var31 &= 483847562;
                                                                var31 ^= -2056249547;
                                                                var31 ^= 1052303023;
                                                            }
                                                        } else {
                                                            var31 &= -1460788839;
                                                            var31 ^= -1086529392;
                                                        }
                                                    } else {
                                                        var31 &= 2013142392;
                                                        var31 += -87405436;
                                                        var31 *= 1848013755;
                                                        var31 *= -2070987151;
                                                        var31 ^= 1007460372;
                                                    }

                                                    var310 = var31 + 1;
                                                    var310 = var31 * var310;
                                                    var310 &= 1;
                                                    if (var310 != 0) {
                                                        break label458;
                                                    }

                                                    this.zn = var305;
                                                    Integer var257 = var6;
                                                    if (var257 != null) {
                                                        var31 >>>= 27;
                                                        var31 *= -1660897889;
                                                        var31 >>= 2;
                                                        var31 ^= -1558360441;
                                                        long var258 = var31;
                                                        long var322 = var258 + 1L;
                                                        long var323 = var258 * var322;
                                                        var10 = var258 + 2L;
                                                        long var324 = var323 * var10;
                                                        long var259 = var258 + 3L;
                                                        long var325 = var324 * var259;
                                                        long var260 = var325 & 7L;
                                                        long var550;
                                                        int var261 = (var550 = var260 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                                                        if (var261 == 0) {
                                                            Wx var262 = this.Nv;
                                                            var262.LK(var1);
                                                            return;
                                                        }
                                                        break label458;
                                                    }

                                                    var31 |= 1212987787;
                                                    var31 -= -1437924130;
                                                    var31 ^= 2070429584;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var31 <<= 29;
                                    var31 >>>= 29;
                                    var31 *= 790388823;
                                    var31 -= -969012667;
                                    var31 ^= 2048261352;
                                }
                            } else {
                                var31 >>= 28;
                                var31 &= 1448670968;
                                var31 += -300810625;
                                var31 &= 1758396426;
                                var31 ^= 1848888111;
                            }
                        }
                    }
                } else {
                    var31 *= 547410691;
                    var31 ^= -917076194;
                }
            } else {
                var31 = var4 - -882519671;
                var31 ^= -1639993195;
                var31 ^= 2035907281;
            }

            var6 = var31 + 1;
            var6 = var31 * var6;
            var31 = var6 & 1;
            if (var31 == 0) {
                RuntimeException var256 = new RuntimeException();
                throw var256;
            }
        }

        IllegalArgumentException var255 = new IllegalArgumentException();
        throw var255;
    }

    private void E(int var1) {
        label139: {
            int var3 = System.identityHashCode(this);
            ModeSetting var4 = this.c;
            int var120 = var4.Bz();
            long var121 = var120;
            long var122 = var121 * 64L;
            ModeSetting var6 = this.ie;
            int var130 = var6.Bz();
            long var131 = var130;
            long var123 = var122 + var131;
            long var132 = var3;
            long var8 = var132 + 1L;
            var8 = var132 * var8;
            long var133 = var8 & 1L;
            long var208;
            int var134 = (var208 = var133 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
            if (var134 != 0) {
                int var2 = var1 | 1371019911;
                var2 &= -1781756460;
                var2 ^= -2046822247;
                var2 ^= 1323177075;
            } else {
                label141: {
                    int var16 = var1 & -1631683509;
                    var16 ^= 557162338;
                    var16 |= 552577001;
                    var16 ^= 450178617;
                    int var135 = var16 + 1;
                    int var136 = var16 * var135;
                    int var7 = var16 + 2;
                    int var137 = var136 * var7;
                    var7 = var16 + 3;
                    int var138 = var137 * var7;
                    int var139 = var138 & 7;
                    if (var139 != 0) {
                        break label139;
                    }

                    long var124 = var123 * 1000L;
                    NumberSetting var140 = this.A;
                    int var141 = var140.B();
                    long var142 = var141;
                    long var125 = var124 + var142;
                    CompletableFuture var143 = this.b;
                    if (var143 != null) {
                        var16 = switch (var16) {
                            case -2102963295 -> var16 ^ -525487237;
                            case 591059410 -> {
                                var16 ^= 1362860522;
                                var16 |= 957082240;
                                var16 ^= -819306516;
                                yield var16 ^ -1842422819;
                            }
                            default -> var16 ^ 425456907;
                        };
                        Integer var144 = var16;
                        if (var144 == null) {
                            break label139;
                        }

                        CompletableFuture var145 = this.b;
                        boolean var146 = var145.isDone();
                        long var166 = var3;
                        long var9 = var166 + 1L;
                        var9 = var166 * var9;
                        long var167 = var9 & 1L;
                        long var209;
                        var7 = (var209 = var167 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            switch (var16) {
                                case -1246172897:
                                default:
                                    var16 ^= 1267308509;
                                    break label141;
                                case -984975781:
                                    var16 ^= 1243599717;
                                    break label141;
                                case 638545545:
                                    var16 &= 180042619;
                                    var16 ^= -660189337;
                                    break label141;
                            }
                        }
                        var16 = switch (var16) {
                            default -> var16 ^ -1544878389;
                            case 93694135 -> var16 ^ 432337047;
                            case 638545545 -> {
                                var16 |= 2012264070;
                                var16 >>>= 30;
                                yield var16 ^ -721624717;
                            }
                        };
                        if (var146) {
                            var16 |= 1952606481;
                            var16 ^= -1332587569;
                            int var147 = var16 + 1;
                            int var148 = var16 * var147;
                            int var149 = var148 & 1;
                            if (var149 != 0) {
                                break label139;
                            }

                            CompletableFuture var150 = this.b;
                            var7 = var3 + 1;
                            var7 = var3 * var7;
                            var7 &= 1;
                            if (var7 != 0) {
                                var16 ^= 2007188860;
                                var16 >>= 26;
                                var16 ^= -626170526;
                                break label141;
                            }

                            var16 *= -29109183;
                            var16 &= -1344614120;
                            var16 ^= -1018881843;
                            Object var151 = var150.getNow(null);
                            var151 = (int[])var151;
                            if (var151 != null) {
                                var16 -= -1226259121;
                                var16 >>>= 16;
                                var16 ^= -891911954;
                                long var172 = var16;
                                var9 = var172 + 1L;
                                var9 = var172 * var9;
                                long var173 = var9 & 1L;
                                long var210;
                                var7 = (var210 = var173 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label139;
                                }

                                KH.q(512, (int[])var151);
                                long var153 = this.mb;
                                Integer var191 = var3;
                                if (var191 == null) {
                                    var16 <<= 7;
                                    var16 ^= -1314355858;
                                    break label141;
                                }

                                var16 &= -1081619413;
                                var16 -= -16751086;
                                var16 ^= 1604440952;
                                int var192 = var16 + 1;
                                int var193 = var16 * var192;
                                int var202 = var16 + 2;
                                int var194 = var193 * var202;
                                int var203 = var16 + 3;
                                int var195 = var194 * var203;
                                int var196 = var195 & 7;
                                if (var196 != 0) {
                                    break label139;
                                }

                                this.O = var153;
                                var16 |= 959422565;
                                var16 |= 1624280377;
                                var16 ^= 1278255916;
                                var16 ^= 2027534323;
                            } else {
                                var16 &= 1653872693;
                                var16 -= -614597782;
                                var16 *= -613134375;
                                var16 |= 1994255390;
                                var16 ^= -1075116321;
                            }

                            this.b = null;
                            var16 ^= 514481559;
                            var16 ^= -218106458;
                        } else {
                            var16 += -1418814739;
                            var16 >>= 15;
                            var16 *= 1049122739;
                            var16 ^= -888861517;
                        }
                    } else {
                        var16 ^= 1268324863;
                        var16 ^= 2006342282;
                        var16 >>>= 6;
                        var16 ^= 624924027;
                    }

                    CompletableFuture var154 = this.b;
                    Integer var175 = var3;
                    if (var175 == null) {
                        var16 &= -199109378;
                        var16 += -1236191448;
                        var16 += -2109017894;
                        var16 &= -243793219;
                        var16 ^= -1967823490;
                    } else {
                        label145: {
                            var16 += -1805982719;
                            var16 *= -1162019947;
                            var16 ^= -647725896;
                            var175 = var16;
                            if (var175 == null) {
                                break label139;
                            }

                            if (var154 == null) {
                                var16 = switch (var16) {
                                    default -> var16 ^ 2115376449;
                                    case 133636034 -> {
                                        var16 &= 1934295905;
                                        var16 += -1424627420;
                                        yield var16 ^ -54686281;
                                    }
                                    case 1621036410 -> var16 ^ -1612236711;
                                };
                                long var155 = this.O;
                                long var211;
                                int var156 = (var211 = var125 - var155) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                                var175 = var3;
                                if (var175 == null) {
                                    var16 &= 1669509686;
                                    var16 <<= 5;
                                    var16 ^= -1968609490;
                                    break label145;
                                }

                                var16 *= -2073030793;
                                var16 ^= -745642630;
                                int var178 = var16 + 1;
                                var178 = var16 * var178;
                                int var197 = var16 + 2;
                                var178 *= var197;
                                int var198 = var16 + 3;
                                var178 *= var198;
                                var178 &= 7;
                                if (var178 != 0) {
                                    break label139;
                                }

                                if (var156 != 0) {
                                    var16 |= 1808488106;
                                    var16 ^= -776265513;
                                    var16 ^= -1917383415;
                                    var16 -= -453236353;
                                    var16 ^= 74415546;
                                    int var157 = var16 + 1;
                                    int var158 = var16 * var157;
                                    int var159 = var158 & 1;
                                    if (var159 != 0) {
                                        break label139;
                                    }

                                    var6 = this.c;
                                    Enum var161 = var6.A();
                                    Da var162 = (Da)var161;
                                    Da var163 = var162;
                                    long var183 = var3;
                                    long var204 = var183 + 1L;
                                    var204 = var183 * var204;
                                    long var11 = var183 + 2L;
                                    var204 *= var11;
                                    long var184 = var183 + 3L;
                                    var204 *= var184;
                                    long var185 = var204 & 7L;
                                    long var212;
                                    var3 = (var212 = var185 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                                    if (var3 != 0) {
                                        var16 |= -105748822;
                                        var16 ^= -1684563991;
                                        var16 ^= -1098900179;
                                        break label145;
                                    }

                                    var16 *= 1306386351;
                                    var16 &= 1719344537;
                                    var16 <<= 19;
                                    var16 |= -321731813;
                                    var16 ^= 1197042693;
                                    var3 = var16 + 1;
                                    var3 = var16 * var3;
                                    var178 = var16 + 2;
                                    var3 *= var178;
                                    var178 = var16 + 3;
                                    var3 *= var178;
                                    var3 &= 7;
                                    if (var3 != 0) {
                                        break label139;
                                    }

                                    ModeSetting var114 = this.ie;
                                    Enum var115 = var114.A();
                                    bT var116 = (bT)var115;
                                    NumberSetting var188 = this.A;
                                    var178 = var188.B();
                                    this.mb = var125;
                                    final int callbackSeed = var178;
                                    Supplier var117 = () -> {
                                        int var3x = l;
                                        var3x ^= 190822083;
                                        int var5 = System.identityHashCode(var163);
                                        Integer var22x = var5;
                                        if (var22x != null) {
                                            switch (var3x) {
                                                case -2052606656:
                                                    var3x ^= 663888793;
                                                    break;
                                                case -564923254:
                                                default:
                                                    var3x ^= 185131363;
                                                    break;
                                                case -455193981:
                                                    var3x >>= 18;
                                                    var3x += -1114814597;
                                                    var3x ^= 1229836943;
                                            }

                                            int var23x = callbackSeed + 1;
                                            var23x = callbackSeed * var23x;
                                            var23x &= 1;
                                            if (var23x == 0) {
                                                return jM.on(var163, var116, callbackSeed);
                                            }
                                        } else {
                                            switch (var3x) {
                                                case -2114563161:
                                                    var3x ^= 1358159539;
                                                    break;
                                                case -1435913724:
                                                default:
                                                    var3x ^= 364253993;
                                                    break;
                                                case -455193981:
                                                    var3x *= -680021481;
                                                    var3x |= -1693411159;
                                                    var3x *= -1285974117;
                                                    var3x += 1460292380;
                                                    var3x ^= -1879230563;
                                            }

                                            Integer var19x = callbackSeed;
                                            if (var19x != null) {
                                                IllegalStateException var21x = new IllegalStateException();
                                                throw var21x;
                                            }
                                        }

                                        IllegalStateException var20x = new IllegalStateException();
                                        throw var20x;
                                    };
                                    CompletableFuture var118 = CompletableFuture.supplyAsync(var117);
                                    this.b = var118;
                                    var16 -= 1493876703;
                                    var16 >>>= 27;
                                    var16 *= -1380636389;
                                    var16 += 802820645;
                                    var16 ^= -1184500815;
                                } else {
                                    var16 -= -1466588803;
                                    var16 ^= 1995754079;
                                    var16 ^= -1360231121;
                                }
                            } else {
                                var16 += 1871044522;
                                var16 |= -1259480715;
                                var16 -= -1433865599;
                                var16 >>>= 30;
                                var16 ^= 1099456131;
                            }

                            long var103 = var16;
                            long var126 = var103 + 1L;
                            long var127 = var103 * var126;
                            long var164 = var103 + 2L;
                            long var128 = var127 * var164;
                            long var104 = var103 + 3L;
                            long var129 = var128 * var104;
                            long var105 = var129 & 7L;
                            long var213;
                            var16 = (var213 = var105 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                            if (var16 == 0) {
                                return;
                            }
                            break label139;
                        }
                    }
                }
            }

            IllegalArgumentException var119 = new IllegalArgumentException();
            throw var119;
        }

        UnsupportedOperationException var107 = new UnsupportedOperationException();
        throw var107;
    }

    private static boolean n(ItemStack var0, int var1) {
        boolean var53 = false;
        label60: {
            int var3 = System.identityHashCode(var0);
            int var4 = (var0.isEmpty()) ? 1 : 0;
            Integer var5 = var3;
            if (var5 == null) {
                switch (var1) {
                    case -1300499667:
                        int var10 = var1 * 1150728839;
                        var10 += -632354559;
                        var10 |= -485591855;
                        var10 ^= -809062305;
                        var10 ^= 176918717;
                        break;
                    case -173688179:
                        int var9 = var1 ^ -1003057110;
                        break;
                    case 957614836:
                    default:
                        int var2 = var1 ^ 67100486;
                }
            } else {
                label66: {
                    int var15 = var1 | -700934529;
                    var15 ^= 1811179352;
                    long var59 = var15;
                    long var7 = var59 + 1L;
                    var7 = var59 * var7;
                    long var60 = var7 & 1L;
                    long var65;
                    int var61 = (var65 = var60 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                    if (var61 != 0) {
                        break label60;
                    }

                    label63: {
                        if (var4 == 0) {
                            var15 <<= 6;
                            var15 -= -1294769047;
                            var15 += 599371447;
                            var15 >>>= 14;
                            var15 ^= -1434029794;
                            TagKey var54 = ItemTags.SWORDS;
                            Integer var47 = var3;
                            if (var47 == null) {
                                var15 &= -696093123;
                                var15 *= -1931336201;
                                var15 |= -1699063300;
                                var15 ^= -1592972064;
                                break label66;
                            }

                            var15 *= -1794241271;
                            var15 <<= 1;
                            var15 ^= -1470495054;
                            var47 = var15;
                            if (var47 == null) {
                                break label60;
                            }

                            boolean var49 = var0.isIn(var54);
                            if (var49) {
                                var15 -= -1192676536;
                                var15 ^= -705408841;
                                long var50 = var15;
                                long var62 = var50 + 1L;
                                long var63 = var50 * var62;
                                long var51 = var63 & 1L;
                                long var66;
                                int var52 = (var66 = var51 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                                if (var52 != 0) {
                                    break label60;
                                }

                                var53 = true;
                                var15 += -1077147;
                                var15 &= -1324759312;
                                var15 &= -1416059053;
                                var15 |= 367865639;
                                var15 ^= -1113498686;
                                break label63;
                            }

                            var15 ^= -1929926479;
                            var15 -= 1468997023;
                            var15 ^= 1204732872;
                            var15 ^= 932003167;
                        } else {
                            var15 &= -1685163079;
                            var15 -= -1140677170;
                            var15 ^= -1490181382;
                        }

                        Integer var56 = var15;
                        if (var56 == null) {
                            break label60;
                        }

                        var53 = false;
                        var15 |= 873143707;
                        var15 *= -1188421801;
                        var15 *= -914192753;
                        var15 ^= -677512842;
                    }

                    var4 = var15 + 1;
                    var4 = var15 * var4;
                    var15 = var4 & 1;
                    if (var15 == 0) {
                        return var53;
                    }
                    break label60;
                }
            }

            IllegalStateException var55 = new IllegalStateException();
            throw var55;
        }

        IllegalArgumentException var46 = new IllegalArgumentException();
        throw var46;
    }

    private static knife W(int var0) {
        boolean var2 = ClientRuntime.y();
        int var1 = var0 | 2079415721;
        var1 &= -950456183;
        var1 >>>= 24;
        var1 ^= 1744447515;
        Integer var3 = var1;
        if (var3 != null) {
            if (!var2) {
                var1 <<= 21;
                var1 ^= 348182532;
                return null;
            }

            var1 += -1862203369;
            var1 ^= 968939945;
            var1 += 428673656;
            var1 ^= 756296769;
            Integer var31 = var1;
            if (var31 != null) {
                ClientRuntime var32 = ClientRuntime.Z();
                ModuleManager var33 = var32.sP();
                Module var34 = var33.tG(knife.class);
                knife var35 = (knife)var34;
                var1 -= 1813887056;
                var1 ^= 1208682917;
                var3 = var1;
                label37:
                if (var3 != null) {
                    boolean var38 = var35.IU();
                    knife var36;
                    if (var38) {
                        var1 ^= -2120777373;
                        var1 -= -1800771466;
                        var1 ^= -1070266822;
                        var3 = var1;
                        if (var3 == null) {
                            break label37;
                        }

                        var36 = var35;
                        var1 -= -510513385;
                        var1 ^= 909625999;
                        var1 ^= -240334018;
                        var1 &= 322872371;
                        var1 ^= 126455354;
                    } else {
                        var1 &= 695744601;
                        var1 ^= 1343363060;
                        var36 = null;
                        switch (var1) {
                            case -1340297250:
                            default:
                                var1 ^= 1343535333;
                                break;
                            case 1361199100:
                                var1 *= -665934665;
                                var1 -= -475483253;
                                var1 ^= 741471136;
                                break;
                            case 1759681007:
                                var1 ^= 254589708;
                        }
                    }

                    return var36;
                }
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    public static boolean iD(Hand var0, ItemStack var1) {
        label126: {
            int var55;
            int var89;
            label133: {
                var55 = l;
                var55 ^= 1598867147;
                var89 = System.identityHashCode(var0);
                int var4 = var55 * -103587499;
                var4 -= -913817595;
                var4 *= 249611217;
                var4 += -1542868591;
                var4 ^= 165679491;
                knife var94 = W(var4);
                int var5 = var89 + 1;
                var5 = var89 * var5;
                var5 &= 1;
                label123:
                if (var5 == 0) {
                    var55 <<= 7;
                    var55 ^= 344663151;
                    if (var94 != null) {
                        var55 = switch (var55) {
                            case 497734602 -> var55 ^ -1472585769;
                            default -> var55 ^ -1933095922;
                            case 1914069487 -> {
                                var55 &= -1317142821;
                                var55 -= 1875263790;
                                yield var55 ^ -1028416744;
                            }
                        };
                        Integer var131 = var55;
                        if (var131 == null) {
                            break label126;
                        }

                          int var95 = var94.NT ? 1 : 0;
                        long var132 = var89;
                        long var7 = var132 + 1L;
                        var7 = var132 * var7;
                        long var133 = var7 & 1L;
                        long var173;
                        int var134 = (var173 = var133 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                        if (var134 != 0) {
                            var55 *= 882820585;
                            var55 |= 810374831;
                            var55 ^= 1296573202;
                            break label123;
                        }

                        var55 -= 1813947932;
                        var55 ^= -1599101724;
                        var55 ^= 229650939;
                        long var135 = var55;
                        var7 = var135 + 1L;
                        var7 = var135 * var7;
                        long var9 = var135 + 2L;
                        var7 *= var9;
                        long var136 = var135 + 3L;
                        var7 *= var136;
                        long var137 = var7 & 7L;
                        long var174;
                        var134 = (var174 = var137 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                        if (var134 != 0) {
                            break label126;
                        }

                        if (var95 != 0) {
                            var55 *= 1415787845;
                            var55 *= -3070981;
                            var55 &= -1348287961;
                            var55 ^= 730986098;
                            var55 ^= -1760384521;
                            long var96 = var55;
                            long var6 = var96 + 1L;
                            var6 = var96 * var6;
                            long var8 = var96 + 2L;
                            var6 *= var8;
                            long var97 = var96 + 3L;
                            var6 *= var97;
                            long var98 = var6 & 7L;
                            long var175;
                            var95 = (var175 = var98 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                            if (var95 != 0) {
                                break label126;
                            }

                            Hand var100 = Hand.MAIN_HAND;
                            Integer var139 = var89;
                            if (var139 == null) {
                                var55 &= 1777304557;
                                var55 &= 1785296695;
                                var55 &= -1011211961;
                                var55 ^= -259664712;
                                break label123;
                            }
                            var55 = switch (var55) {
                                case 169021047 -> var55 ^ 783607234;
                                case 1048796583 -> {
                                    var55 |= -813552710;
                                    var55 ^= -1926302227;
                                    var55 *= 305122329;
                                    var55 |= 1976358089;
                                    yield var55 ^ 1651535016;
                                }
                                default -> var55 ^ -1767173868;
                            };
                            long var140 = var55;
                            var7 = var140 + 1L;
                            var7 = var140 * var7;
                            var9 = var140 + 2L;
                            var7 *= var9;
                            long var141 = var140 + 3L;
                            var7 *= var141;
                            long var142 = var7 & 7L;
                            long var176;
                            int var143 = (var176 = var142 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                            if (var143 != 0) {
                                break label126;
                            }

                            if (var0 == var100) {
                                var55 >>>= 27;
                                var55 += 196015817;
                                var55 ^= -1859670016;
                                long var101 = var55;
                                var6 = var101 + 1L;
                                var6 = var101 * var6;
                                long var102 = var6 & 1L;
                                long var177;
                                var95 = (var177 = var102 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                                if (var95 != 0) {
                                    break label126;
                                }

                                var95 = var55 * -288648729;
                                var95 *= -1627101977;
                                var95 |= 1148423991;
                                var95 ^= 1719667858;
                                  int var108 = n(var1, var95) ? 1 : 0;
                                Integer var144 = var89;
                                if (var144 == null) {
                                    var55 += -447660372;
                                    var55 ^= -1889578950;
                                    break label123;
                                }

                                var55 *= 78447165;
                                var55 ^= -2122662896;
                                var55 -= 317540729;
                                var55 *= 1316075657;
                                var55 ^= -919275746;
                                if (var108 != 0) {
                                    var55 >>>= 7;
                                    var55 ^= 1511965904;
                                    long var109 = var55;
                                    var6 = var109 + 1L;
                                    var6 = var109 * var6;
                                    var8 = var109 + 2L;
                                    var6 *= var8;
                                    long var110 = var109 + 3L;
                                    var6 *= var110;
                                    long var111 = var6 & 7L;
                                    long var178;
                                    var108 = (var178 = var111 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                    if (var108 != 0) {
                                        break label126;
                                    }

                                      int var113 = KH.A() ? 1 : 0;
                                    Integer var83 = var89;
                                    if (var83 == null) {
                                        var55 += 2003074380;
                                        var55 >>= 17;
                                        var55 >>= 7;
                                        var55 ^= 259664492;
                                        break label123;
                                    }

                                    var55 ^= -1823350611;
                                    var55 ^= 399013170;
                                    if (var113 != 0) {
                                        var55 -= -1691473256;
                                        var55 += -170128787;
                                        var55 *= 1821120075;
                                        var55 ^= 1878835101;
                                        var55 ^= 249716424;
                                        int var84 = var55 + 1;
                                        var84 = var55 * var84;
                                        var113 = var55 + 2;
                                        var84 *= var113;
                                        var113 = var55 + 3;
                                        var84 *= var113;
                                        var84 &= 7;
                                        if (var84 != 0) {
                                            break label126;
                                        }

                                        var89 = 1;
                                        var55 += 515620020;
                                        var55 += -443152678;
                                        var55 -= -1493894168;
                                        var55 ^= 337593707;
                                        break label133;
                                    }

                                    var55 |= 761175120;
                                    var55 ^= 1401474032;
                                    var55 ^= 239852772;
                                } else {
                                    switch (var55) {
                                        case -89179228:
                                        default:
                                            var55 ^= -1191429000;
                                            break;
                                        case 948409576:
                                            var55 *= 1592030337;
                                            var55 |= 2017093251;
                                            var55 += 1303957235;
                                            var55 ^= -368446276;
                                            break;
                                        case 1325360754:
                                            var55 ^= -1458753030;
                                    }
                                }
                            } else {
                                var55 -= 1383232241;
                                var55 ^= -283998595;
                                var55 ^= 139552682;
                                var55 ^= 107288519;
                            }
                        } else {
                            var55 -= 559288495;
                            var55 >>>= 13;
                            var55 ^= -1573053893;
                        }
                    } else {
                        var55 >>= 12;
                        var55 ^= -1573197820;
                    }

                    var4 = var55 + 1;
                    var4 = var55 * var4;
                    var5 = var55 + 2;
                    var4 *= var5;
                    var5 = var55 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 != 0) {
                        break label126;
                    }

                    var89 = 0;
                    var55 -= 287177944;
                    var55 |= -1074586374;
                    var55 >>>= 22;
                    var55 ^= -14863274;
                    break label133;
                } else {
                    switch (var55) {
                        case -2008279533:
                            var55 ^= 1737352331;
                            break;
                        case -1421387779:
                        default:
                            var55 ^= -489689233;
                            break;
                        case -1328727413:
                            var55 -= 370633175;
                            var55 ^= 1781531913;
                    }
                }

                long var73 = var55;
                long var116 = var73 + 1L;
                long var117 = var73 * var116;
                long var156 = var73 + 2L;
                long var118 = var117 * var156;
                long var74 = var73 + 3L;
                long var119 = var118 * var74;
                long var75 = var119 & 7L;
                long var179;
                var55 = (var179 = var75 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                if (var55 == 0) {
                    IllegalStateException var77 = new IllegalStateException();
                    throw var77;
                }
                break label126;
            }

            long var125 = var55;
            long var157 = var125 + 1L;
            var157 = var125 * var157;
            long var171 = var125 + 2L;
            var157 *= var171;
            var125 += 3L;
            var157 *= var125;
            var125 = var157 & 7L;
            long var180;
            int var128 = (var180 = var125 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
            if (var128 == 0) {
                return (var89 != 0);
            }
        }

        AssertionError var82 = new AssertionError();
        throw var82;
    }

    public static void EM(Hand var0) {
        int var1 = l;
        var1 ^= 1281938794;
        int var2 = System.identityHashCode(var0);
        long var36 = var2;
        long var4 = var36 + 1L;
        var4 = var36 * var4;
        long var6 = var36 + 2L;
        var4 *= var6;
        long var37 = var36 + 3L;
        var4 *= var37;
        long var38 = var4 & 7L;
        long var57;
        var2 = (var57 = var38 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1545000662:
                    var1 <<= 1;
                    var1 -= 195826363;
                    var1 |= -1586622891;
                    var1 &= 1864756066;
                    var1 ^= 2015972404;
                    break;
                case -1120336419:
                default:
                    var1 ^= 1895419983;
                    break;
                case 1173208036:
                    var1 ^= 430577988;
            }

            RuntimeException var45 = new RuntimeException();
            throw var45;
        } else {
            var1 -= -855167644;
            var1 &= -1597349179;
            var1 += 1243223720;
            var1 |= -163641472;
            var1 ^= -981536844;
            long var40 = var1;
            var4 = var40 + 1L;
            var4 = var40 * var4;
            var6 = var40 + 2L;
            var4 *= var6;
            long var41 = var40 + 3L;
            var4 *= var41;
            long var42 = var4 & 7L;
            long var58;
            var2 = (var58 = var42 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
            if (var2 == 0) {
                Hand var44 = Hand.MAIN_HAND;
                if (var0 == var44) {
                    var1 ^= -1763885485;
                    var1 += 957036229;
                    var1 *= 972983927;
                    var1 ^= 925310248;
                    V = true;
                    var1 &= 686846780;
                    var1 ^= 846776777;
                    var1 *= 990530313;
                    var1 *= -1427424131;
                    var1 ^= -2043761475;
                } else {
                    switch (var1) {
                        case 258718521:
                            var1 ^= -1493421194;
                            break;
                        case 998346840:
                            var1 >>>= 22;
                            var1 ^= 858285350;
                            break;
                        case 1023185910:
                        default:
                            var1 ^= -1368052336;
                    }
                }

                long var24 = var1;
                long var3 = var24 + 1L;
                var3 = var24 * var3;
                long var5 = var24 + 2L;
                var3 *= var5;
                long var25 = var24 + 3L;
                var3 *= var25;
                long var26 = var3 & 7L;
                long var59;
                var1 = (var59 = var26 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return;
                }
            }

            IllegalArgumentException var28 = new IllegalArgumentException();
            throw var28;
        }
    }


      public static void Hb(boolean var0) {
          int var0i = var0 ? 1 : 0;
          int var1 = l;
          var1 ^= -648317416;
          int var3 = var0i + 1;
          var3 = var0i * var3;
          int var2 = var3 & 1;
          if (var2 == 0) {
              var1 *= 2019523367;
              var1 *= 1528437041;
              var1 -= 935352488;
              var1 ^= 72588600;
            Integer var23 = var1;
            if (var23 != null) {
                  DG = var0i != 0;
                return;
            }
        } else {
            var1 -= -669446930;
            var1 >>>= 27;
            var1 |= 2046594325;
            var1 -= 2093457084;
            var1 ^= 1193553881;
            long var17 = var1;
            long var25 = var17 + 1L;
            long var26 = var17 * var25;
            long var5 = var17 + 2L;
            long var27 = var26 * var5;
            long var18 = var17 + 3L;
            long var28 = var27 * var18;
            long var19 = var28 & 7L;
            long var29;
            var1 = (var29 = var19 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        }

        RuntimeException var21 = new RuntimeException();
        throw var21;
    }

    public static boolean Nt() {
        return DG;
    }

    public static void Te(MatrixStack var0, Object var1, int var2) {
        boolean var138 = false;
        int var3 = l;
        var3 ^= 99868253;
        int var5 = System.identityHashCode(var0);
        long var6 = var5;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var246;
        int var115 = (var246 = var6 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
        if (var115 != 0) {
            var3 |= 1646802069;
            var3 ^= -1212301029;
            var3 ^= -842447427;
        } else {
            label142: {
                var3 <<= 13;
                var3 *= -1522631961;
                var3 >>>= 1;
                var3 -= -879319107;
                var3 ^= 1669075881;
                var6 = var2;
                var8 = var6 + 1L;
                var8 = var6 * var8;
                var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var247;
                int var119 = (var247 = var6 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                if (var119 == 0) {
                    int var120 = var3 ^ 706203066;
                    int var121 = var120 ^ 1328920960;
                    knife var122 = W(var121);
                    if (var122 == null) {
                        switch (var3) {
                            case -1175911997:
                                var3 ^= -1780601903;
                                break;
                            case 493886442:
                                var3 |= 1568115821;
                                var3 -= 1802773386;
                                var3 -= -2002874378;
                                var3 ^= 954467148;
                                break;
                            case 1098709004:
                            default:
                                var3 ^= -1004090773;
                        }

                        int var7 = var2 + 1;
                        var7 = var2 * var7;
                        var7 &= 1;
                        if (var7 == 0) {
                            return;
                        }
                    } else {
                        var3 &= 1885733200;
                        var3 &= 1984497536;
                        var3 += 891182305;
                        var3 += -213656614;
                        var3 ^= 1434943841;
                        int var126 = var2 + 1;
                        var126 = var2 * var126;
                        int var146 = var2 + 2;
                        var126 *= var146;
                        int var147 = var2 + 3;
                        var126 *= var147;
                        var126 &= 7;
                        if (var126 == 0) {
                            Entity var131 = i_2.QI();
                            PlayerEntity var132 = (PlayerEntity)var131;
                            var8 = var5;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            long var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var248;
                            int var151 = (var248 = var8 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                            if (var151 != 0) {
                                switch (var3) {
                                    case -997422459:
                                        var3 ^= 902396651;
                                        break label142;
                                    case 1616491221:
                                    default:
                                        var3 ^= -73496178;
                                        break label142;
                                    case 1831188698:
                                        var3 <<= 19;
                                        var3 <<= 14;
                                        var3 += 1143754520;
                                        var3 -= -2106342441;
                                        var3 ^= 1370896762;
                                        break label142;
                                }
                            }

                            var3 *= -306109871;
                            var3 *= -416879307;
                            var3 >>= 7;
                            var3 ^= -677401715;
                            int var152 = var2 + 1;
                            int var153 = var2 * var152;
                            int var154 = var153 & 1;
                            label129:
                            if (var154 == 0) {
                                label138: {
                                    if (var132 != null) {
                                        var3 ^= 1572527979;
                                        var3 ^= 1914803289;
                                        int var155 = var2 + 1;
                                        int var156 = var2 * var155;
                                        int var9 = var2 + 2;
                                        int var157 = var156 * var9;
                                        var9 = var2 + 3;
                                        int var158 = var157 * var9;
                                        int var159 = var158 & 7;
                                        if (var159 != 0) {
                                            break label129;
                                        }

                                        Arm var133 = var132.getMainArm();
                                        Arm var160 = Arm.LEFT;
                                        Integer var171 = var5;
                                        if (var171 == null) {
                                            var3 *= 1555667575;
                                            var3 |= -205327070;
                                            var3 ^= -1198661964;
                                            var3 ^= -547843615;
                                            break label142;
                                        }

                                        var3 ^= -1410851774;
                                        var3 &= -353976246;
                                        var3 |= -1655566555;
                                        var3 <<= 16;
                                        var3 ^= 2061871309;
                                        long var172 = var2;
                                        long var11 = var172 + 1L;
                                        var11 = var172 * var11;
                                        long var13 = var172 + 2L;
                                        var11 *= var13;
                                        long var173 = var172 + 3L;
                                        var11 *= var173;
                                        long var174 = var11 & 7L;
                                        long var249;
                                        int var175 = (var249 = var174 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                                        if (var175 != 0) {
                                            break label129;
                                        }

                                        if (var133 == var160) {
                                            var3 -= -1422234076;
                                            var3 += 1069222054;
                                            var3 ^= -801191447;
                                            long var134 = var2;
                                            long var176 = var134 + 1L;
                                            long var177 = var134 * var176;
                                            var11 = var134 + 2L;
                                            long var178 = var177 * var11;
                                            long var135 = var134 + 3L;
                                            long var179 = var178 * var135;
                                            long var136 = var179 & 7L;
                                            long var250;
                                            var126 = (var250 = var136 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                                            if (var126 != 0) {
                                                break label129;
                                            }

                                            var138 = true;
                                            var3 ^= 481891695;
                                            var3 ^= -111094983;
                                            break label138;
                                        }

                                        var3 >>= 25;
                                        var3 ^= -423347808;
                                        var3 |= -1616953438;
                                        var3 += -2092339309;
                                        var3 ^= -1756235605;
                                    } else {
                                        switch (var3) {
                                            case -685139418:
                                                var3 ^= -987547655;
                                                var3 &= 1725660924;
                                                var3 ^= -1236091910;
                                                break;
                                            case -19817668:
                                                var3 ^= 882288111;
                                                break;
                                            case 1110547193:
                                            default:
                                                var3 ^= 2050495213;
                                        }
                                    }

                                    var8 = var2;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var251;
                                    int var164 = (var251 = var8 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                                    if (var164 != 0) {
                                        break label129;
                                    }

                                    var138 = false;
                                    var3 *= 554424269;
                                    var3 |= -1972540299;
                                    var3 ^= -1056197745;
                                }

                                var8 = var2;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var252;
                                int var168 = (var252 = var8 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                                if (var168 == 0) {
                                    KnifeRenderer var169 = var122.iY;
                                    ModeSetting var180 = var122.c;
                                    Enum var181 = var180.A();
                                    Da var182 = (Da)var181;
                                    Wx var196 = var122.Nv;
                                    float[] var197 = var196.sl();
                                    int var202 = var5 + 1;
                                    var202 = var5 * var202;
                                    int var215 = var5 + 2;
                                    var202 *= var215;
                                    int var216 = var5 + 3;
                                    var202 *= var216;
                                    var202 &= 7;
                                    if (var202 != 0) {
                                        var3 += -1530772270;
                                        var3 += -1679147452;
                                        var3 ^= 1630496646;
                                        var3 += -1482144745;
                                        var3 ^= -647411284;
                                        break label142;
                                    }

                                    var3 >>= 17;
                                    var3 |= 582826900;
                                    var3 ^= 2013780883;
                                    long var207 = var2;
                                    long var219 = var207 + 1L;
                                    var219 = var207 * var219;
                                    long var15 = var207 + 2L;
                                    var219 *= var15;
                                    long var208 = var207 + 3L;
                                    var219 *= var208;
                                    long var209 = var219 & 7L;
                                    long var253;
                                    var202 = (var253 = var209 - 0L) == 0L ? 0 : (var253 < 0L ? -1 : 1);
                                    label109:
                                    if (var202 == 0) {
                                        NumberSetting var211 = var122.s;
                                        float var212 = var211.WM();
                                        BooleanSetting var217 = var122.bT;
                                        boolean var218 = var217.vb();
                                        BooleanSetting var223 = var122.Q;
                                        boolean var224 = var223.vb();
                                        int var228;
                                        if (var224) {
                                            var3 |= 1499118163;
                                            var3 ^= -438876100;
                                            var3 ^= -1362748195;
                                            ColorSetting var225 = var122.j;
                                            int var14 = var5 + 1;
                                            var14 = var5 * var14;
                                            int var241 = var5 + 2;
                                            var14 *= var241;
                                            int var242 = var5 + 3;
                                            var14 *= var242;
                                            var14 &= 7;
                                            if (var14 != 0) {
                                                var3 *= 733769599;
                                                var3 ^= -1677322159;
                                                break label142;
                                            }

                                            var3 ^= -651272790;
                                            var3 |= -1191307074;
                                            var3 ^= 2041516841;
                                            long var233 = var2;
                                            long var16 = var233 + 1L;
                                            var16 = var233 * var16;
                                            long var234 = var16 & 1L;
                                            long var254;
                                            var14 = (var254 = var234 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                                            if (var14 != 0) {
                                                break label109;
                                            }

                                            int var226 = var225.zz();
                                            int var227 = var226 | 0xFF000000;
                                            var228 = var227;
                                            var3 ^= 1941294690;
                                            var3 -= 1270047192;
                                            var3 -= 2136915102;
                                            var3 ^= -936085812;
                                        } else {
                                            var3 &= 979849301;
                                            var3 -= -1466864171;
                                            var3 >>= 16;
                                            var3 ^= 387959239;
                                            long var236 = var2;
                                            long var244 = var236 + 1L;
                                            var244 = var236 * var244;
                                            var236 = var244 & 1L;
                                            long var255;
                                            int var238 = (var255 = var236 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                                            if (var238 != 0) {
                                                break label109;
                                            }

                                            var228 = 0;
                                            var3 >>>= 29;
                                            var3 &= -1626873885;
                                            var3 ^= -521702733;
                                        }

                                        float var123 = var122.Y;
                                        int var239 = var5 + 1;
                                        var239 = var5 * var239;
                                        var5 = var239 & 1;
                                        if (var5 != 0) {
                                            var3 <<= 30;
                                            var3 *= 1083887507;
                                            var3 |= 1588360609;
                                            var3 ^= -828192870;
                                            break label142;
                                        }

                                        var3 ^= -689538363;
                                        var3 >>= 20;
                                        var3 |= 149915766;
                                        var3 ^= 257854091;
                                        var5 = var2 + 1;
                                        var5 = var2 * var5;
                                        int var4 = var5 & 1;
                                        if (var4 == 0) {
                                            var169.render(var0, var1, var2, var182, var197, var212, var138, var218, var228, var123);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                RuntimeException var109 = new RuntimeException();
                throw var109;
            }
        }

        AssertionError var108 = new AssertionError();
        throw var108;
    }

    public void AD() {
        int var1 = l;
        var1 ^= 937651168;
        int var2 = System.identityHashCode(this);
        boolean var3 = this.NT;
        Integer var4 = var2;
        if (var4 == null) {
            var1 ^= -1424920933;
            var1 ^= 1771093884;
        } else {
            var1 += -1791156423;
            var1 ^= -2021201264;
            if (!var3) {
                var1 -= 906003140;
                var1 += 2093783405;
                var1 ^= -2091657265;
                return;
            }

            var1 += -1455874289;
            var1 |= 1984482526;
            var1 <<= 22;
            var1 ^= 967903455;
            Wx var32 = this.Nv;
            ModeSetting var33 = this.c;
            Enum var34 = var33.A();
            Da var35 = (Da)var34;
            Integer var26 = var2;
            if (var26 != null) {
                var1 = switch (var1) {
                    case -1794189461 -> var1 ^ 617135000;
                    case -835647265 -> {
                        var1 -= 618391546;
                        yield var1 ^ 1980999936;
                    }
                    default -> var1 ^ -1620742546;
                };
                nU var30 = nU.G(var35);
                g_2 var31 = var30.a();
                var32.lm(var31, 1.0F);
                var1 |= -923919103;
                var1 -= 2103336827;
                var1 *= -379138889;
                var1 ^= 2010375203;
                var1 ^= 2070959320;
                return;
            }

            var1 += 1003851789;
            var1 += 1065241065;
            var1 ^= 1399301266;
        }

        Integer var27 = var1;
        if (var27 == null) {
            IllegalStateException var29 = new IllegalStateException();
            throw var29;
        } else {
            IllegalStateException var28 = new IllegalStateException();
            throw var28;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1000634642;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        l = var4;
    }
}
