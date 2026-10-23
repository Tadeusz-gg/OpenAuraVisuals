package dev.aurap.hub;

import mvggs.modules.hud.hudstyle;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.AuraRenderer$State;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.text.FontFamily;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.item.ItemStack;

public final class BP {
    public static final float Ko = 3.0F;
    private final ClientRuntime SY;
    private final List V;
    private final lH_3 xT;
    private final nP h;
    private final float[] ND;
    private boolean ID;
    private boolean xJ;
    private boolean co;
    private long Hp;
    private float b;
    private Canvas c;
    private hudstyle B;
    private Oo PL;
    private final hr Vc;
    private final hr s;
    private final hr k;
    private int T;
    private final hr S;
    private float y;
    private float o;
    private float H;
    private float C;
    private final hr WS;
    private HudModule[] nF;
    private Object z;
    private HudModule l;
    private final Sn I;
    public static final int aL;

    public BP(ClientRuntime var1) {
        ArrayList var2 = new ArrayList();
        this.V = var2;
        lH_3 var5 = new lH_3();
        this.xT = var5;
        float[] var6 = new float[2];
        this.ND = var6;
        hr var7 = (var1x, var2x, var3x, var4x, var5x) -> {
            int var6x = aL;
            var6x ^= 1375250462;
            int var7x = System.identityHashCode(this);
            Canvas var8x = this.c;
            int var9x = var7x + 1;
            var9x = var7x * var9x;
            var7x = var9x & 1;
            if (var7x != 0) {
                var6x *= -1933023175;
                var6x ^= -1374337050;
                long var25x = var6x;
                long var11x = var25x + 1L;
                var11x = var25x * var11x;
                long var26x = var11x & 1L;
                long var28;
                var7x = (var28 = var26x - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
                if (var7x == 0) {
                    IllegalArgumentException var23x = new IllegalArgumentException();
                    throw var23x;
                }
            } else {
                var6x -= 1223901187;
                var6x ^= 1332189240;
                Integer var18x = var6x;
                if (var18x != null) {
                    Oo var20x = this.PL;
                    kN.BT(var8x, var20x, var1x, var2x, var3x, var4x, var5x);
                    return;
                }
            }

            IllegalArgumentException var19x = new IllegalArgumentException();
            throw var19x;
        };
        this.Vc = var7;
        hr var8 = (var1x, var2x, var3x, var4x, var5x) -> {
            int var6x = aL;
            var6x ^= 747493524;
            int var7x = System.identityHashCode(this);
            Integer var25x = var7x;
            if (var25x == null) {
                var6x >>= 27;
                var6x ^= -25765427;
                var6x ^= 1042565651;
                int var26x = var6x + 1;
                var26x = var6x * var26x;
                var26x &= 1;
                if (var26x == 0) {
                    IllegalStateException var29 = new IllegalStateException();
                    throw var29;
                }
            } else {
                long var19x = switch (var6x) {
                    default -> var6x ^ 1402994646;
                    case -1134224464 -> {
                        var6x *= 50846729;
                        var6x -= -117602186;
                        yield var6x ^ 1029247983;
                    }
                    case 1065355515 -> var6x ^ 761991096;
                };
                long var8x = var19x + 1L;
                var8x = var19x * var8x;
                long var10x = var19x + 2L;
                var8x *= var10x;
                long var20x = var19x + 3L;
                var8x *= var20x;
                long var21x = var8x & 7L;
                long var35;
                var6x = (var35 = var21x - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
                if (var6x == 0) {
                    Canvas var24x = this.c;
                    hudstyle var30 = this.B;
                    Oo var34 = this.PL;
                    kN.i(var24x, var30, var34, var1x, var2x, var3x, var4x, var5x);
                    return;
                }
            }

            AssertionError var23x = new AssertionError();
            throw var23x;
        };
        this.s = var8;
        hr var9 = (var1x, var2x, var3x, var4x, var5x) -> {
            int var6x = aL;
            var6x ^= -558149269;
            int var7x = System.identityHashCode(this);
            long var22x = var7x;
            long var9x = var22x + 1L;
            var9x = var22x * var9x;
            long var23x = var9x & 1L;
            long var29;
            var7x = (var29 = var23x - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var7x == 0) {
                Integer var25x = switch (var6x) {
                    case -968510514 -> var6x ^ -944624988;
                    default -> var6x ^ 97336281;
                    case 1314099791 -> {
                        var6x *= -1043936809;
                        var6x += 1249251822;
                        var6x *= -2144726277;
                        yield var6x ^ -1761763072;
                    }
                };
                if (var25x != null) {
                    Canvas var27 = this.c;
                    Oo var8x = this.PL;
                    kN.R(var27, var8x, var1x, var2x, var3x, var4x, var5x);
                } else {
                    IllegalStateException var26x = new IllegalStateException();
                    throw var26x;
                }
            } else {
                switch (var6x) {
                    case -614802859:
                        var6x ^= -1270214792;
                        break;
                    case 1241545626:
                    default:
                        var6x ^= 363678031;
                        break;
                    case 1314099791:
                        var6x *= 431227361;
                        var6x -= 25951824;
                        var6x ^= -1527502706;
                }

                AssertionError var17x = new AssertionError();
                throw var17x;
            }
        };
        this.k = var9;
        hr var10 = (var1x, var2x, var3x, var4x, var5x) -> {
            int var6x = aL;
            var6x ^= -618037549;
            int var7x = System.identityHashCode(this);
            Canvas var8x = this.c;
            int var9x = this.T;
            Integer var21x = var7x;
            if (var21x != null) {
                var6x *= -2017449681;
                var6x &= 1081531544;
                var6x *= -1895814251;
                var6x ^= 1601338231;
                var6x ^= 1113773801;
                var8x.shadow(var1x, var2x, var3x, var4x, var5x, 16.0F, var9x);
            } else {
                var6x ^= 422583935;
                var6x *= 1767784153;
                var6x ^= -315221748;
                var6x ^= -539506280;
                IllegalArgumentException var15x = new IllegalArgumentException();
                throw var15x;
            }
        };
        this.S = var10;
        hr var11 = (var1x, var2x, var3x, var4x, var5x) -> {
            int var6x = aL;
            var6x ^= 1014142785;
            int var7x = System.identityHashCode(this);
            float var8x = this.y;
            var8x = Math.min(var8x, var1x);
            this.y = var8x;
            var8x = this.o;
            var8x = Math.min(var8x, var2x);
            this.o = var8x;
            var8x = this.H;
            float var9x = var1x + var3x;
            int var10x = var7x + 1;
            var10x = var7x * var10x;
            int var11x = var7x + 2;
            var10x *= var11x;
            var7x += 3;
            var10x *= var7x;
            var7x = var10x & 7;
            if (var7x != 0) {
                var6x += -515373181;
                var6x |= 1538484012;
                var6x ^= -242894600;
                IllegalArgumentException var29 = new IllegalArgumentException();
                throw var29;
            } else {
                switch (var6x) {
                    case -1399171995:
                        var6x += 718812626;
                        var6x ^= -2110412333;
                        var6x <<= 15;
                        var6x &= 842977662;
                        var6x ^= 498069508;
                        break;
                    case -1096737611:
                        var6x ^= -1570303939;
                        break;
                    case 423679000:
                    default:
                        var6x ^= 1666386902;
                }

                float var20x = Math.max(var8x, var9x);
                this.H = var20x;
                float var21x = this.C;
                float var28 = var2x + var4x;
                float var22x = Math.max(var21x, var28);
                this.C = var22x;
            }
        };
        this.WS = var11;
        HudModule[] var12 = new HudModule[8];
        this.nF = var12;
        Sn var13 = this::r;
        this.I = var13;
        this.SY = var1;
        ModuleManager var14 = var1.sP();
        List var15 = var14.dG();
        Iterator var16 = var15.iterator();
        Iterator var17 = var16;

        while (true) {
            boolean var3 = var17.hasNext();
            if (!var3) {
                nP var18 = new nP(this);
                this.h = var18;
                EventBus var19 = var1.ZM();
                EventListener<RenderEvent> var25 = this::x;
                EventSubscription var20 = var19.DP(RenderEvent.class, 100, var25);
                return;
            }

            Object var21 = var17.next();
            Module var22 = (Module)var21;
            boolean var4 = var22 instanceof HudModule;
            if (var4) {
                HudModule var23 = (HudModule)var22;
                List var26 = this.V;
                var3 = var26.add(var23);
            }
        }
    }

    public nP Z() {
        int var1 = aL;
        var1 ^= 1510110036;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= -1525171006;
            var1 |= -1799881050;
            var1 &= 84973160;
            var1 &= -2080074605;
            var1 ^= 1496509350;
            Integer var20 = var1;
            if (var20 != null) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            var1 -= 932720687;
            var1 -= -1506494465;
            var1 >>= 20;
            var1 >>= 4;
            var1 ^= 507740901;
            Integer var16 = var1;
            if (var16 != null) {
                return this.h;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public Oo C() {
        int var1 = aL;
        var1 ^= -535555361;
        int var2 = System.identityHashCode(this);
        Integer var9 = var2;
        if (var9 != null) {
            var1 -= -384759890;
            var1 ^= 260550981;
            lH_3 var10 = this.xT;
            return var10.Y;
        } else {
            var1 *= -240877159;
            var1 ^= 725425552;
            RuntimeException var6 = new RuntimeException();
            throw var6;
        }
    }

    public List TR() {
        int var1 = aL;
        var1 ^= -224545177;
        int var2 = System.identityHashCode(this);
        Integer var26 = var2;
        int var3 = of_2.qA;
        var1 ^= var3;
        var1 ^= -477106862;
        of_2.qA = -477106862;
        var3 = of_2.o;
        var1 ^= var3;
        var1 ^= -1033351442;
        of_2.o = -1033351442;
        if (var26 == null) {
            var1 &= -1691722044;
            var1 ^= 844246773;
            var1 >>>= 8;
            var1 ^= 1407166073;
            var1 ^= -963617036;
            var26 = var1;
            if (var26 != null) {
                RuntimeException var28 = new RuntimeException();
                throw var28;
            }
        } else {
            var1 |= 1378279774;
            var1 -= -779428664;
            var1 ^= -575094195;
            long var20 = var1;
            long var30 = var20 + 1L;
            long var31 = var20 * var30;
            long var5 = var20 + 2L;
            long var32 = var31 * var5;
            long var21 = var20 + 3L;
            long var33 = var32 * var21;
            long var22 = var33 & 7L;
            long var34;
            var1 = (var34 = var22 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                List var25 = this.V;
                return Collections.unmodifiableList(var25);
            }
        }

        IllegalArgumentException var24 = new IllegalArgumentException();
        throw var24;
    }

    public lH_3 G() {
        int var1 = aL;
        var1 ^= -1723455585;
        int var2 = System.identityHashCode(this);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var6 = var23 + 2L;
        var4 *= var6;
        long var24 = var23 + 3L;
        var4 *= var24;
        long var25 = var4 & 7L;
        long var45;
        var2 = (var45 = var25 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
        int var3 = of_2.qA;
        var1 ^= var3;
        var1 ^= -477106862;
        var3 = of_2.o;
        var1 ^= var3;
        var1 ^= -1033351442;
        if (var2 != 0) {
            long var27 = switch (var1) {
                default -> var1 ^ -795293410;
                case 162456763 -> {
                    var1 |= 912412094;
                    var1 *= 1577373205;
                    yield var1 ^ -2109843583;
                }
                case 1553700416 -> var1 ^ 233906892;
            };
            var4 = var27 + 1L;
            var4 = var27 * var4;
            var6 = var27 + 2L;
            var4 *= var6;
            long var28 = var27 + 3L;
            var4 *= var28;
            long var29 = var4 & 7L;
            long var46;
            var2 = (var46 = var29 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var31 = new RuntimeException();
                throw var31;
            }
        } else {
            var1 &= 1699904436;
            var1 ^= -1367959197;
            long var18 = var1;
            long var33 = var18 + 1L;
            long var34 = var18 * var33;
            long var5 = var18 + 2L;
            long var35 = var34 * var5;
            long var19 = var18 + 3L;
            long var36 = var35 * var19;
            long var20 = var36 & 7L;
            long var47;
            var1 = (var47 = var20 - 0L) == 0L ? 0 : (var47 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.xT;
            }
        }

        RuntimeException var22 = new RuntimeException();
        throw var22;
    }

    public float rb() {
        int var1 = aL;
        var1 ^= 961132362;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var24;
        var2 = (var24 = var21 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -1079706444;
            var1 += 816623401;
            var1 &= -1523191931;
            var1 += 1897434369;
            var1 ^= -2071821898;
            return this.b;
        } else {
            switch (var1) {
                case -1449036690:
                    var1 *= 1461677257;
                    var1 *= 1600946863;
                    var1 |= 1591708828;
                    var1 >>= 10;
                    var1 ^= 472177979;
                    break;
                case -976967554:
                    var1 ^= 579819865;
                    break;
                case 2022505864:
                default:
                    var1 ^= 523324299;
            }

            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        }
    }

    public void bH() {
        boolean var282 = false;
        label356: {
            int var1 = aL;
            var1 ^= -2040928399;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var471;
            int var217 = (var471 = var3 - 0L) == 0L ? 0 : (var471 < 0L ? -1 : 1);
            if (var217 != 0) {
                var1 -= 1031526203;
                var1 |= -485187337;
                var1 *= 108111715;
                var1 += 1700288310;
                var1 ^= -1456722217;
            } else {
                var1 -= -870000391;
                var1 += -1189568314;
                var1 += -803265283;
                var1 ^= 306558235;
                Integer var218 = var1;
                if (var218 == null) {
                    break label356;
                }

                boolean var219 = this.ID;
                if (var219) {
                    Integer var246 = switch (var1) {
                        case -1048468476 -> {
                            var1 <<= 20;
                            var1 ^= 685237674;
                            var1 ^= -1740034071;
                            yield var1 ^ 1812883131;
                        }
                        case 1692847636 -> var1 ^ -6047747;
                        default -> var1 ^ -193661686;
                    };
                    if (var246 != null) {
                        return;
                    }
                    break label356;
                }

                var1 -= 1236241800;
                var1 *= -1838880285;
                var1 ^= 669566429;
                this.ID = true;
                boolean var220 = this.xJ;
                this.co = var220;
                this.xJ = false;
                var3 = System.nanoTime();
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var472;
                int var292 = (var472 = var5 - 0L) == 0L ? 0 : (var472 < 0L ? -1 : 1);
                label353:
                if (var292 == 0) {
                    var1 += -438383422;
                    var1 += 549356085;
                    var1 ^= 401837101;
                    var5 = var1;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    long var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var473;
                    int var296 = (var473 = var5 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
                    if (var296 != 0) {
                        break label356;
                    }

                    lH_3 var297 = this.xT;
                    long var6 = this.Hp;
                    long var474;
                    int var348 = (var474 = var6 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
                    float var353;
                    if (var348 == 0) {
                        var1 &= -920069266;
                        var1 -= 1741096558;
                        var1 &= 1864053071;
                        var1 ^= -1924440374;
                        var6 = var1;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var475;
                        int var352 = (var475 = var6 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                        if (var352 != 0) {
                            break label356;
                        }

                        var353 = 0.0F;
                        switch (var1) {
                            case -330146108:
                                var1 |= 1645658674;
                                var1 ^= -1442651373;
                                var1 |= 575218665;
                                var1 += -2065107804;
                                var1 ^= 1700431460;
                                break;
                            case 113282002:
                                var1 ^= -1651288576;
                                break;
                            case 408220352:
                            default:
                                var1 ^= -620039792;
                        }
                    } else {
                        var1 ^= 1264382951;
                        var1 ^= 1220530622;
                        int var406 = var1 + 1;
                        int var407 = var1 * var406;
                        int var441 = var1 + 2;
                        int var408 = var407 * var441;
                        var441 = var1 + 3;
                        int var409 = var408 * var441;
                        int var410 = var409 & 7;
                        if (var410 != 0) {
                            break label356;
                        }

                        var7 = this.Hp;
                        var7 = var3 - var7;
                        float var413 = (float)var7;
                        float var414 = var413 / 1.0E9F;
                        float var415 = TP.t(var414, 0.0F, 0.1F);
                        Integer var443 = var2;
                        if (var443 == null) {
                            switch (var1) {
                                case -865733804:
                                    var1 &= -689876613;
                                    var1 -= -125124573;
                                    var1 ^= -1543961047;
                                    break label353;
                                case -259129095:
                                default:
                                    var1 ^= 728187852;
                                    break label353;
                                case 1435411816:
                                    var1 ^= -1865239655;
                                    break label353;
                            }
                        }
                        var1 = switch (var1) {
                            case -1291634795 -> var1 ^ -1115282412;
                            case -865733804 -> {
                                var1 &= -1271893105;
                                yield var1 ^ -506438469;
                            }
                            default -> var1 ^ -2086616514;
                        };
                        var443 = var1;
                        if (var443 == null) {
                            break label356;
                        }

                        var353 = var415;
                        var1 &= -1043822973;
                        var1 >>>= 30;
                        var1 ^= -1910721804;
                    }

                    var7 = var1;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var476;
                    int var419 = (var476 = var7 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                    if (var419 != 0) {
                        break label356;
                    }

                    var297.Ik = var353;
                    this.Hp = var3;
                    ClientRuntime var222 = this.SY;
                    AuraPipeline var223 = var222.Ul();
                    FrameContext var224 = var223.frame();
                    lH_3 var4 = this.xT;
                    int var298 = var2 + 1;
                    int var299 = var2 * var298;
                    int var300 = var299 & 1;
                    label344:
                    if (var300 == 0) {
                        var1 += -1472145818;
                        var1 |= -1534438332;
                        var1 *= 1960876401;
                        var1 ^= -1332070767;
                        double var301 = var224.time();
                        var4.mV = var301;
                        var4 = this.xT;
                        float var302 = i_2.u();
                        var4.m = var302;
                        var4 = this.xT;
                        float var303 = var224.guiWidth();
                        var4.d = var303;
                        var4 = this.xT;
                        float var225 = var224.guiHeight();
                        var4.S = var225;
                        lH_3 var226 = this.xT;
                        ClientRuntime var250 = this.SY;
                        AuraRenderer var251 = var250.ZP();
                        FontFamily var252 = var251.fonts();
                        var226.ActionSetting = var252;
                        lH_3 var227 = this.xT;
                        ClientRuntime var253 = this.SY;
                        ModuleManager var254 = var253.sP();
                        Module var255 = var254.tG(hudstyle.class);
                        hudstyle var256 = (hudstyle)var255;
                        var227.eB = var256;
                        lH_3 var228 = this.xT;
                        hudstyle var229 = var228.eB;
                        Oo var230 = var229.eo();
                        Oo var231 = var230;
                        var4 = this.xT;
                        Oo var258 = var4.Y;
                        if (var230 != var258) {
                            var1 = switch (var1) {
                                case -645872483 -> var1 ^ -562996483;
                                default -> var1 ^ -404835772;
                                case -207336578 -> {
                                    var1 >>>= 28;
                                    var1 ^= 896710268;
                                    var1 -= -1552236356;
                                    var1 &= 1310223186;
                                    yield var1 ^ -1823717951;
                                }
                            };
                            long var259 = var1;
                            var6 = var259 + 1L;
                            var6 = var259 * var6;
                            long var445 = var259 + 2L;
                            var6 *= var445;
                            long var260 = var259 + 3L;
                            var6 *= var260;
                            long var261 = var6 & 7L;
                            long var477;
                            int var262 = (var477 = var261 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                            if (var262 != 0) {
                                break label356;
                            }

                            var4 = this.xT;
                            var4.Y = var230;
                            int var264 = var2 + 1;
                            int var265 = var2 * var264;
                            int var266 = var265 & 1;
                            if (var266 != 0) {
                                var1 += -1260247193;
                                var1 -= -242794890;
                                var1 ^= 1050188480;
                                break label344;
                            }
                            var1 = switch (var1) {
                                case -1822677805 -> {
                                    var1 -= -93686883;
                                    yield var1 ^ 1505619426;
                                }
                                case -1766403163 -> var1 ^ -1899603961;
                                default -> var1 ^ -593731617;
                            };
                            List var267 = this.V;
                            Iterator var268 = var267.iterator();
                            Iterator var269 = var268;
                            var1 <<= 8;
                            var1 |= -1307373224;
                            var1 -= -548414442;
                            var1 |= 1349996814;
                            var1 ^= -1168420424;

                            while (true) {
                                var5 = var1;
                                var7 = var5 + 1L;
                                var7 = var5 * var7;
                                var5 = var7 & 1L;
                                long var478;
                                int var306 = (var478 = var5 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                if (var306 != 0) {
                                    break label356;
                                }

                                boolean var307 = var269.hasNext();
                                var6 = var2;
                                var445 = var6 + 1L;
                                var445 = var6 * var445;
                                var6 = var445 & 1L;
                                long var479;
                                int var360 = (var479 = var6 - 0L) == 0L ? 0 : (var479 < 0L ? -1 : 1);
                                if (var360 != 0) {
                                    var1 ^= -760444206;
                                    var1 += -1557567172;
                                    var1 ^= -1298260892;
                                    break label344;
                                }

                                var1 &= -1506983199;
                                var1 -= -217197304;
                                var1 += -950263439;
                                var1 &= -1095340066;
                                var1 ^= 353867285;
                                Integer var361 = var1;
                                if (var361 == null) {
                                    break label356;
                                }

                                if (!var307) {
                                    var1 += -474108703;
                                    var1 |= -592433877;
                                    var1 ^= 1172199919;
                                    Integer var270 = var1;
                                    if (var270 == null) {
                                        break label356;
                                    }

                                    nP var271 = this.h;
                                    Integer var311 = var2;
                                    if (var311 == null) {
                                        switch (var1) {
                                            case -1725041456:
                                                var1 -= 307684430;
                                                var1 -= -1492475976;
                                                var1 *= -740999503;
                                                var1 ^= -40669010;
                                                break label344;
                                            case 829615741:
                                                var1 ^= -1993872112;
                                                break label344;
                                            case 1183008779:
                                            default:
                                                var1 ^= 649256764;
                                                break label344;
                                        }
                                    }

                                    var1 |= -1242685749;
                                    var1 ^= 2034300793;
                                    var1 <<= 28;
                                    var1 |= 1688447371;
                                    var1 ^= -599539396;
                                    int var312 = var1 + 1;
                                    int var313 = var1 * var312;
                                    int var365 = var1 + 2;
                                    int var314 = var313 * var365;
                                    int var366 = var1 + 3;
                                    int var315 = var314 * var366;
                                    int var316 = var315 & 7;
                                    if (var316 != 0) {
                                        break label356;
                                    }

                                    var271.EF(var231);
                                    var1 >>= 31;
                                    var1 >>>= 22;
                                    var1 += 1380481034;
                                    var1 += -1506020720;
                                    var1 ^= 1051266253;
                                    break;
                                }

                                var1 += -2098484162;
                                var1 += -317702160;
                                var1 ^= -1919082825;
                                Integer var308 = var1;
                                if (var308 == null) {
                                    break label356;
                                }

                                Object var309 = var269.next();
                                var6 = var2;
                                var445 = var6 + 1L;
                                var445 = var6 * var445;
                                var6 = var445 & 1L;
                                long var480;
                                int var364 = (var480 = var6 - 0L) == 0L ? 0 : (var480 < 0L ? -1 : 1);
                                if (var364 != 0) {
                                    var1 += -174950800;
                                    var1 |= 965002078;
                                    var1 *= -2086181119;
                                    var1 ^= -316762374;
                                    break label344;
                                }

                                var1 += 1588234213;
                                var1 <<= 19;
                                var1 -= -1201802478;
                                var1 ^= 1638188893;
                                var1 ^= 2043409104;
                                HudModule var310 = (HudModule)var309;
                                var310.r(var231);
                                var1 ^= 1745159265;
                                var1 ^= -974875148;
                            }
                        } else {
                            var1 ^= -863998066;
                            var1 ^= -116832604;
                        }

                        Integer var232 = var1;
                        if (var232 == null) {
                            break label356;
                        }

                        lH_3 var233 = this.xT;
                        boolean var272 = i_2.TH();
                        int var317 = var2 + 1;
                        int var318 = var2 * var317;
                        int var319 = var318 & 1;
                        if (var319 != 0) {
                            var1 >>>= 19;
                            var1 &= -2112342623;
                            var1 += 1619445087;
                            var1 &= 807572584;
                            var1 ^= 1210909540;
                        } else {
                            label394: {
                                var1 -= -783851320;
                                var1 += 102889313;
                                var1 *= -709294221;
                                var1 ^= -1491666826;
                                var1 ^= -142790052;
                                Integer var320 = var1;
                                if (var320 == null) {
                                    break label356;
                                }

                                label313: {
                                    if (var272) {
                                        var1 *= 616731325;
                                        var1 >>>= 12;
                                        var1 ^= 669147141;
                                        var4 = this.xT;
                                        hudstyle var274 = var4.eB;
                                        Integer var321 = var2;
                                        if (var321 == null) {
                                            var1 -= -1695489121;
                                            var1 <<= 27;
                                            var1 |= 643129925;
                                            var1 &= 748859893;
                                            var1 ^= 1143977793;
                                            break label394;
                                        }
                                        var1 = switch (var1) {
                                            case -890882044 -> var1 ^ 1474230867;
                                            case 669884538 -> {
                                                var1 |= -1576507116;
                                                var1 ^= -1589647430;
                                                yield var1 ^ 460191704;
                                            }
                                            default -> var1 ^ 1928408610;
                                        };
                                        boolean var275 = var274.T();
                                        if (var275) {
                                            var1 ^= 1956416991;
                                            var1 ^= -1132044377;
                                            Integer var276 = var1;
                                            if (var276 == null) {
                                                break label356;
                                            }

                                            boolean var277 = i_2.BD();
                                            var5 = var2;
                                            var7 = var5 + 1L;
                                            var7 = var5 * var7;
                                            var9 = var5 + 2L;
                                            var7 *= var9;
                                            var5 += 3L;
                                            var7 *= var5;
                                            var5 = var7 & 7L;
                                            long var481;
                                            int var325 = (var481 = var5 - 0L) == 0L ? 0 : (var481 < 0L ? -1 : 1);
                                            if (var325 != 0) {
                                                var1 *= -1707060001;
                                                var1 -= -1220814161;
                                                var1 >>>= 17;
                                                var1 ^= 1747967092;
                                                break label394;
                                            }

                                            var1 >>= 20;
                                            var1 &= 2074537129;
                                            var1 &= -925567628;
                                            var1 += 1875361833;
                                            var1 ^= -1050569780;
                                            var5 = var1;
                                            var7 = var5 + 1L;
                                            var7 = var5 * var7;
                                            var5 = var7 & 1L;
                                            long var482;
                                            int var328 = (var482 = var5 - 0L) == 0L ? 0 : (var482 < 0L ? -1 : 1);
                                            if (var328 != 0) {
                                                break label356;
                                            }

                                            if (var277) {
                                                var1 -= -1267204882;
                                                var1 ^= 1640215940;
                                                long var278 = var1;
                                                var6 = var278 + 1L;
                                                var6 = var278 * var6;
                                                long var450 = var278 + 2L;
                                                var6 *= var450;
                                                long var279 = var278 + 3L;
                                                var6 *= var279;
                                                long var280 = var6 & 7L;
                                                long var483;
                                                int var281 = (var483 = var280 - 0L) == 0L ? 0 : (var483 < 0L ? -1 : 1);
                                                if (var281 != 0) {
                                                    break label356;
                                                }

                                                var282 = true;
                                                var1 &= 1120563464;
                                                var1 ^= -2012729287;
                                                var1 ^= -838356354;
                                                break label313;
                                            }

                                            var1 *= -1561197461;
                                            var1 ^= 399102631;
                                            var1 |= -902844614;
                                            var1 ^= 1234742967;
                                        } else {
                                            switch (var1) {
                                                case 499120412:
                                                    var1 &= -2031404522;
                                                    var1 >>>= 27;
                                                    var1 &= 1198629308;
                                                    var1 ^= -2023292531;
                                                    break;
                                                case 664075887:
                                                default:
                                                    var1 ^= 1429192655;
                                                    break;
                                                case 781501938:
                                                    var1 ^= -171827067;
                                            }
                                        }
                                    } else {
                                        switch (var1) {
                                            case -2034164008:
                                                var1 ^= -198171449;
                                                break;
                                            case -807671669:
                                            default:
                                                var1 ^= -1029935611;
                                                break;
                                            case 1086555997:
                                                var1 |= 1376913368;
                                                var1 &= 722922798;
                                                var1 ^= -2055895935;
                                        }
                                    }

                                    var282 = false;
                                    var1 ^= -1311991731;
                                    var1 ^= -974601880;
                                    var1 ^= -1257317393;
                                }

                                Integer var329 = var1;
                                if (var329 == null) {
                                    break label356;
                                }

                                var233.J = var282;
                                var3 = var2;
                                var5 = var3 + 1L;
                                var5 = var3 * var5;
                                var7 = var3 + 2L;
                                var5 *= var7;
                                var3 += 3L;
                                var5 *= var3;
                                var3 = var5 & 7L;
                                long var484;
                                int var237 = (var484 = var3 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                                if (var237 == 0) {
                                    var1 |= -409876280;
                                    var1 += -258026082;
                                    var1 ^= -494611749;
                                    var3 = var1;
                                    var5 = var3 + 1L;
                                    var5 = var3 * var5;
                                    var7 = var3 + 2L;
                                    var5 *= var7;
                                    var3 += 3L;
                                    var5 *= var3;
                                    var3 = var5 & 7L;
                                    long var485;
                                    int var241 = (var485 = var3 - 0L) == 0L ? 0 : (var485 < 0L ? -1 : 1);
                                    if (var241 != 0) {
                                        break label356;
                                    }

                                    nP var242 = this.h;
                                    var4 = this.xT;
                                    var242.H(var4);
                                    float var243 = 0.0F;
                                    List var284 = this.V;
                                    Iterator var285 = var284.iterator();
                                    Iterator var286 = var285;
                                    float var244 = var243;
                                    var1 *= 1153873129;
                                    var1 &= 1324959443;
                                    var1 *= -403691529;
                                    var1 ^= -1874044374;

                                    while (true) {
                                        int var338 = var1 + 1;
                                        int var339 = var1 * var338;
                                        int var340 = var339 & 1;
                                        if (var340 != 0) {
                                            break label356;
                                        }

                                        boolean var341 = var286.hasNext();
                                        int var371 = var2 + 1;
                                        int var372 = var2 * var371;
                                        int var373 = var372 & 1;
                                        if (var373 != 0) {
                                            var1 &= -2118516868;
                                            var1 += -796671646;
                                            var1 += 1096899467;
                                            var1 >>= 2;
                                            var1 ^= 1825442952;
                                            break;
                                        }
                                        var1 = switch (var1) {
                                            case -830256407 -> var1 ^ -148309519;
                                            default -> var1 ^ 224008549;
                                            case 1139102020 -> {
                                                var1 &= 1843388125;
                                                var1 += -755284461;
                                                var1 >>>= 18;
                                                yield var1 ^ -507650428;
                                            }
                                        };
                                        var6 = var1;
                                        long var451 = var6 + 1L;
                                        var451 = var6 * var451;
                                        long var468 = var6 + 2L;
                                        var451 *= var468;
                                        var6 += 3L;
                                        var451 *= var6;
                                        var6 = var451 & 7L;
                                        long var486;
                                        int var377 = (var486 = var6 - 0L) == 0L ? 0 : (var486 < 0L ? -1 : 1);
                                        if (var377 != 0) {
                                            break label356;
                                        }

                                        if (!var341) {
                                            var1 >>= 29;
                                            var1 &= 801251572;
                                            var1 ^= 1497786551;
                                            Integer var210 = var1;
                                            if (var210 != null) {
                                                this.b = var244;
                                                return;
                                            }
                                            break label356;
                                        }

                                        var1 ^= -597870859;
                                        var1 += 1503578939;
                                        var1 &= -2053051604;
                                        var1 ^= -1953180653;
                                        Object var342 = var286.next();
                                        HudModule var343 = (HudModule)var342;
                                        int var378 = var2 + 1;
                                        int var379 = var2 * var378;
                                        int var430 = var2 + 2;
                                        int var380 = var379 * var430;
                                        int var431 = var2 + 3;
                                        int var381 = var380 * var431;
                                        int var382 = var381 & 7;
                                        if (var382 != 0) {
                                            var1 -= -1395076113;
                                            var1 ^= -1760086769;
                                            var1 += -323695527;
                                            var1 ^= -1951465796;
                                            break;
                                        }
                                        var1 = switch (var1) {
                                            case 246709311 -> {
                                                var1 >>>= 11;
                                                var1 ^= 862875117;
                                                var1 ^= 411875649;
                                                yield var1 ^ 1219962318;
                                            }
                                            default -> var1 ^ -1516375472;
                                            case 971449132 -> var1 ^ 7331637;
                                        };
                                        int var383 = var1 ^ -222992784;
                                        int var384 = var383 ^ 1034427919;
                                        this.y(var343, var384);
                                        boolean var385 = var343.JK;
                                        float var347;
                                        if (var385) {
                                            var1 ^= -612303137;
                                            var1 *= 1346774257;
                                            var1 &= 810786629;
                                            var1 ^= 426303284;
                                            var6 = var1;
                                            var451 = var6 + 1L;
                                            var451 = var6 * var451;
                                            var468 = var6 + 2L;
                                            var451 *= var468;
                                            var6 += 3L;
                                            var451 *= var6;
                                            var6 = var451 & 7L;
                                            long var487;
                                            int var389 = (var487 = var6 - 0L) == 0L ? 0 : (var487 < 0L ? -1 : 1);
                                            if (var389 != 0) {
                                                break label356;
                                            }

                                            lH_3 var390 = this.xT;
                                            float var391 = var343.e(var390);
                                            float var344 = var343.J;
                                            var7 = var2;
                                            var9 = var7 + 1L;
                                            var9 = var7 * var9;
                                            var11 = var7 + 2L;
                                            var9 *= var11;
                                            var7 += 3L;
                                            var9 *= var7;
                                            var7 = var9 & 7L;
                                            long var488;
                                            int var435 = (var488 = var7 - 0L) == 0L ? 0 : (var488 < 0L ? -1 : 1);
                                            if (var435 != 0) {
                                                var1 *= -91474969;
                                                var1 &= 1306064254;
                                                var1 &= -1159190818;
                                                var1 *= -78042855;
                                                var1 ^= 1408214120;
                                                break;
                                            }

                                            var1 ^= -85848202;
                                            var1 <<= 27;
                                            var1 ^= -1902989316;
                                            float var345 = var391 * var344;
                                            float var346 = Math.max(var244, var345);
                                            var347 = var346;
                                            switch (var1) {
                                                case -1634553860:
                                                    var1 += -1357713518;
                                                    var1 -= 2064424180;
                                                    var1 ^= 1450473479;
                                                    break;
                                                case -989074498:
                                                    var1 ^= -902301108;
                                                    break;
                                                case -72405762:
                                                default:
                                                    var1 ^= -1076369498;
                                            }
                                        } else {
                                            var1 -= -818705185;
                                            var1 *= -446790853;
                                            var1 >>= 31;
                                            var1 ^= -43812952;
                                            int var392 = var1 + 1;
                                            int var393 = var1 * var392;
                                            int var436 = var1 + 2;
                                            int var394 = var393 * var436;
                                            int var437 = var1 + 3;
                                            int var395 = var394 * var437;
                                            int var396 = var395 & 7;
                                            if (var396 != 0) {
                                                break label356;
                                            }

                                            var347 = var244;
                                            switch (var1) {
                                                case -1193786532:
                                                default:
                                                    var1 ^= 1361229485;
                                                    break;
                                                case -557726191:
                                                    var1 ^= -192307375;
                                                    break;
                                                case -43812952:
                                                    var1 &= -488365896;
                                                    var1 |= 1548670465;
                                                    var1 -= -868693790;
                                                    var1 ^= -1260693670;
                                            }
                                        }

                                        int var397 = var1 + 1;
                                        int var398 = var1 * var397;
                                        int var399 = var398 & 1;
                                        if (var399 != 0) {
                                            break label356;
                                        }

                                        var244 = var347;
                                        switch (var1) {
                                            case -2064811363:
                                                var1 += -1045147700;
                                                var1 ^= 88382253;
                                                break;
                                            case -675044638:
                                                var1 ^= 1990652926;
                                                break;
                                            case -629104198:
                                            default:
                                                var1 ^= 1652969381;
                                        }
                                    }
                                } else {
                                    var1 &= 721381659;
                                    var1 >>>= 31;
                                    var1 >>>= 10;
                                    var1 *= -363531921;
                                    var1 ^= 1747949316;
                                }
                            }
                        }
                    } else {
                        switch (var1) {
                            case -1910721803:
                                var1 -= 2091591629;
                                var1 ^= 2036210732;
                                break;
                            case -1581080052:
                                var1 ^= -1966490486;
                                break;
                            case 983315230:
                            default:
                                var1 ^= -1714452218;
                        }
                    }
                } else {
                    var1 -= 2098144952;
                    var1 ^= 1021800565;
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            int var245 = var1 + 2;
            var2 *= var245;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                RuntimeException var204 = new RuntimeException();
                throw var204;
            }
        }

        IllegalArgumentException var209 = new IllegalArgumentException();
        throw var209;
    }

    public void YX() {
        int var1 = aL;
        var1 ^= 190316664;
        int var2 = System.identityHashCode(this);
        Integer var21 = var2;
        if (var21 != null) {
            var1 |= 318179659;
            var1 ^= 145379090;
            var1 |= 1492430516;
            var1 -= 1605609932;
            var1 ^= 1723021417;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            int var3 = var1 + 2;
            var22 *= var3;
            var3 = var1 + 3;
            var22 *= var3;
            var22 &= 7;
            if (var22 == 0) {
                this.xJ = true;
                return;
            }
        } else {
            var1 -= -394252065;
            var1 &= -1653737946;
            var1 -= 1917312220;
            var1 >>= 1;
            var1 ^= 1242548019;
            long var16 = var1;
            long var28 = var16 + 1L;
            var28 = var16 * var28;
            long var17 = var28 & 1L;
            long var30;
            var1 = (var30 = var17 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        }

        IllegalArgumentException var19 = new IllegalArgumentException();
        throw var19;
    }

    public void O() {
        int var1 = aL;
        var1 ^= 1692843002;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var6 = var15 + 2L;
        var4 *= var6;
        long var16 = var15 + 3L;
        var4 *= var16;
        long var17 = var4 & 7L;
        long var30;
        var2 = (var30 = var17 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1264751985;
            var1 ^= 1354573486;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            } else {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1273555807:
                default:
                    var1 ^= -1198195108;
                    break;
                case -1243201441:
                    var1 ^= -112286887;
                    break;
                case -200378146:
                    var1 *= 584642215;
                    var1 ^= 1117768472;
            }

            this.ID = false;
        }
    }

    private void y(HudModule var1, int var2) {
        boolean var733 = false;
        float var749 = 0.0F;
        float var842 = 0.0F;
        label661: {
            int var55;
            int var4 = System.identityHashCode(this);
            int var5 = (var1.IU()) ? 1 : 0;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var929;
            int var480 = (var929 = var6 - 0L) == 0L ? 0 : (var929 < 0L ? -1 : 1);
            label660:
            if (var480 == 0) {
                var55 = var2 & 804806362;
                var55 &= 336471568;
                var55 >>>= 11;
                var55 ^= -1962142744;
                var6 = var55;
                var8 = var6 + 1L;
                var8 = var6 * var8;
                var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var930;
                int var484 = (var930 = var6 - 0L) == 0L ? 0 : (var930 < 0L ? -1 : 1);
                if (var484 != 0) {
                    break label661;
                }

                label664: {
                    if (var5 != 0) {
                        var55 = switch (var55) {
                            case -1962110232 -> {
                                var55 += -846750648;
                                yield var55 ^ -1417671582;
                            }
                            case -746619016 -> var55 ^ -1431128842;
                            default -> var55 ^ 878153265;
                        };
                        var5 = var55 + 1;
                        var5 = var55 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label661;
                        }

                        int var437 = (i_2.BD()) ? 1 : 0;
                        var6 = var4;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var931;
                        int var487 = (var931 = var6 - 0L) == 0L ? 0 : (var931 < 0L ? -1 : 1);
                        if (var487 != 0) {
                            switch (var55) {
                                case -1758605151:
                                default:
                                    var55 ^= 898212303;
                                    break label660;
                                case -216784046:
                                    var55 *= -2048134777;
                                    var55 ^= -626947338;
                                    break label660;
                                case 1327813666:
                                    var55 ^= 493506000;
                                    break label660;
                            }
                        }

                        var55 |= 1168037992;
                        var55 ^= 1547913463;
                        var6 = var55;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var932;
                        int var491 = (var932 = var6 - 0L) == 0L ? 0 : (var932 < 0L ? -1 : 1);
                        if (var491 != 0) {
                            break label661;
                        }

                        if (var437 != 0) {
                            var55 -= -1435844647;
                            var55 >>>= 29;
                            var55 *= 1397127193;
                            var55 ^= -1868787016;
                            var437 = var55 + 1;
                            var437 = var55 * var437;
                            var437 &= 1;
                            if (var437 != 0) {
                                break label661;
                            }

                            int var441 = (this.co ? 1 : 0);
                            int var492 = var4 + 1;
                            int var493 = var4 * var492;
                            int var7 = var4 + 2;
                            int var494 = var493 * var7;
                            var7 = var4 + 3;
                            int var495 = var494 * var7;
                            int var496 = var495 & 7;
                            if (var496 != 0) {
                                var55 ^= 597501854;
                                var55 ^= 1116007918;
                                break label660;
                            }
                            var55 = switch (var55) {
                                case -1868787016 -> {
                                    var55 |= 1417767209;
                                    var55 *= -1023735143;
                                    var55 |= 2144920913;
                                    yield var55 ^ 1102970512;
                                }
                                case 160077413 -> var55 ^ -770384717;
                                default -> var55 ^ 790495611;
                            };
                            int var497 = var55 + 1;
                            int var498 = var55 * var497;
                            var7 = var55 + 2;
                            int var499 = var498 * var7;
                            var7 = var55 + 3;
                            int var500 = var499 * var7;
                            int var501 = var500 & 7;
                            if (var501 != 0) {
                                break label661;
                            }

                            if (var441 == 0) {
                                var55 &= 754938008;
                                var55 += -211095139;
                                var55 ^= 420596589;
                                lH_3 var442 = this.xT;
                                var6 = var4;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var933;
                                int var505 = (var933 = var6 - 0L) == 0L ? 0 : (var933 < 0L ? -1 : 1);
                                if (var505 != 0) {
                                    var55 ^= 1221057599;
                                    var55 *= -1597635775;
                                    var55 ^= -804360377;
                                    break label660;
                                }

                                var55 ^= 740158295;
                                var55 *= 410262941;
                                var55 |= 193391210;
                                var55 ^= -2054292400;
                                var6 = var55;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var934;
                                int var509 = (var934 = var6 - 0L) == 0L ? 0 : (var934 < 0L ? -1 : 1);
                                if (var509 != 0) {
                                    break label661;
                                }

                                var441 = var1.BM(var442) ? 1 : 0;
                                if (var441 != 0) {
                                    var55 |= 1811016102;
                                    var55 ^= 64033827;
                                    long var444 = var55;
                                    long var552 = var444 + 1L;
                                    long var553 = var444 * var552;
                                    long var445 = var553 & 1L;
                                    long var935;
                                    var441 = (var935 = var445 - 0L) == 0L ? 0 : (var935 < 0L ? -1 : 1);
                                    if (var441 != 0) {
                                        break label661;
                                    }

                                    var5 = 1;
                                    var55 &= -1458951326;
                                    var55 |= -2002369393;
                                    var55 *= -199921571;
                                    var55 ^= 534082026;
                                    break label664;
                                }

                                switch (var55) {
                                    case -970309536:
                                    default:
                                        var55 ^= 1727025791;
                                        break;
                                    case 242356795:
                                        var55 *= -148798339;
                                        var55 *= 902614333;
                                        var55 &= -1762146424;
                                        var55 ^= -1992347757;
                                        break;
                                    case 1602066468:
                                        var55 ^= -1793826088;
                                }
                            } else {
                                var55 *= -2042488939;
                                var55 ^= -158104260;
                                var55 |= 596409650;
                                var55 *= -1896111487;
                                var55 ^= -1676527384;
                            }
                        } else {
                            switch (var55) {
                                case -1822963888:
                                default:
                                    var55 ^= -330282012;
                                    break;
                                case -1411533939:
                                    var55 += -377084009;
                                    var55 += 353092938;
                                    var55 ^= 828623357;
                                    break;
                                case 1470583376:
                                    var55 ^= 121903594;
                            }
                        }
                    } else {
                        var55 ^= -641839302;
                        var55 |= 1655608131;
                        var55 += 1370341314;
                        var55 -= -81357622;
                        var55 ^= 1380606808;
                    }

                    var6 = var55;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var936;
                    int var512 = (var936 = var6 - 0L) == 0L ? 0 : (var936 < 0L ? -1 : 1);
                    if (var512 != 0) {
                        break label661;
                    }

                    var5 = 0;
                    var55 += 1538252626;
                    var55 += 325823944;
                    var55 >>= 7;
                    var55 ^= -1748948748;
                }

                var1.jA(var5 != 0);
                XF var513 = var1.v;
                lH_3 var554 = this.xT;
                float var555 = var554.Ik;
                float var514 = var513.N(var555);
                long var556 = var4;
                long var9 = var556 + 1L;
                var9 = var556 * var9;
                long var11 = var556 + 2L;
                var9 *= var11;
                long var557 = var556 + 3L;
                var9 *= var557;
                long var558 = var9 & 7L;
                long var937;
                int var559 = (var937 = var558 - 0L) == 0L ? 0 : (var937 < 0L ? -1 : 1);
                if (var559 != 0) {
                    var55 *= -385012619;
                    var55 ^= -33541467;
                } else {
                    label668: {
                        var55 <<= 7;
                        var55 *= 661331525;
                        var55 += 1274344213;
                        var55 -= 553154319;
                        var55 ^= -129501307;
                        Integer var560 = var55;
                        if (var560 == null) {
                            break label661;
                        }

                        if (var5 == 0) {
                            var55 -= -1303817863;
                            var55 += 2095891486;
                            var55 -= 430558107;
                            var55 ^= 854743021;
                            long var561 = var55;
                            var9 = var561 + 1L;
                            var9 = var561 * var9;
                            long var562 = var9 & 1L;
                            long var938;
                            var5 = (var938 = var562 - 0L) == 0L ? 0 : (var938 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label661;
                            }

                            float var939;
                            var5 = (var939 = var514 - 0.003F) == 0.0F ? 0 : (var939 < 0.0F ? -1 : 1);
                            long var563 = var4;
                            var9 = var563 + 1L;
                            var9 = var563 * var9;
                            long var564 = var9 & 1L;
                            long var940;
                            int var565 = (var940 = var564 - 0L) == 0L ? 0 : (var940 < 0L ? -1 : 1);
                            if (var565 != 0) {
                                switch (var55) {
                                    case -1343489972:
                                        var55 ^= 721051898;
                                        break label668;
                                    case -1294322187:
                                    default:
                                        var55 ^= 1530592255;
                                        break label668;
                                    case -924122144:
                                        var55 >>>= 14;
                                        var55 -= 1520827369;
                                        var55 |= -2101449742;
                                        var55 ^= 1450850107;
                                        break label668;
                                }
                            }

                            var55 |= -1081249671;
                            var55 *= -1450417533;
                            var55 ^= 566444926;
                            int var566 = var55 + 1;
                            int var567 = var55 * var566;
                            int var568 = var567 & 1;
                            if (var568 != 0) {
                                break label661;
                            }

                            if (var5 <= 0) {
                                var55 *= 1725929537;
                                var55 &= 1359433337;
                                var55 |= -1803776388;
                                var55 >>>= 14;
                                var55 ^= 829562114;
                                var5 = var55 + 1;
                                var5 = var55 * var5;
                                int var569 = var55 + 2;
                                var5 *= var569;
                                int var570 = var55 + 3;
                                var5 *= var570;
                                var5 &= 7;
                                if (var5 != 0) {
                                    break label661;
                                }

                                var1.JK = false;
                                var1.HQ = true;
                                XF var455 = var1.PN;
                                int var571 = var4 + 1;
                                int var572 = var4 * var571;
                                int var573 = var572 & 1;
                                if (var573 == 0) {
                                    var55 += -49651362;
                                    var55 ^= 846055676;
                                    int var574 = var55 + 1;
                                    int var575 = var55 * var574;
                                    int var638 = var55 + 2;
                                    int var576 = var575 * var638;
                                    int var639 = var55 + 3;
                                    int var577 = var576 * var639;
                                    int var578 = var577 & 7;
                                    if (var578 == 0) {
                                        var455.j(0.0F);
                                        return;
                                    }
                                    break label661;
                                }

                                var55 &= 666573355;
                                var55 += -1270270680;
                                var55 ^= 620717440;
                                break label668;
                            }

                            var55 -= -671429642;
                            var55 |= -882704000;
                            var55 ^= -502259167;
                        } else {
                            var55 ^= -1960835953;
                            var55 ^= -540240334;
                        }

                        var5 = var55 + 1;
                        var5 = var55 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label661;
                        }

                        int var459 = var1.JK ? 1 : 0;
                        Integer var579 = var4;
                        label620:
                        if (var579 != null) {
                            var55 ^= 662259010;
                            var55 ^= -1365278793;
                            long var580 = var55;
                            var9 = var580 + 1L;
                            var9 = var580 * var9;
                            var11 = var580 + 2L;
                            var9 *= var11;
                            long var581 = var580 + 3L;
                            var9 *= var581;
                            long var582 = var9 & 7L;
                            long var941;
                            int var583 = (var941 = var582 - 0L) == 0L ? 0 : (var941 < 0L ? -1 : 1);
                            if (var583 != 0) {
                                break label661;
                            }

                            if (var459 == 0) {
                                var55 |= -169391530;
                                var55 &= 646566532;
                                var55 |= 1265901366;
                                var55 ^= 1194745924;
                                long var584 = var55;
                                var9 = var584 + 1L;
                                var9 = var584 * var9;
                                var11 = var584 + 2L;
                                var9 *= var11;
                                long var585 = var584 + 3L;
                                var9 *= var585;
                                long var586 = var9 & 7L;
                                long var942;
                                var459 = (var942 = var586 - 0L) == 0L ? 0 : (var942 < 0L ? -1 : 1);
                                if (var459 != 0) {
                                    break label661;
                                }

                                var1.JK = true;
                                var459 = var4 + 1;
                                var459 = var4 * var459;
                                int var587 = var4 + 2;
                                var459 *= var587;
                                int var588 = var4 + 3;
                                var459 *= var588;
                                var459 &= 7;
                                if (var459 != 0) {
                                    var55 ^= -1096707774;
                                    var55 <<= 8;
                                    var55 ^= -1825871672;
                                    break label620;
                                }

                                var55 -= -1426637585;
                                var55 += -10720269;
                                var55 *= 1447995313;
                                var55 >>>= 5;
                                var55 ^= -534533912;
                                Integer var466 = var55;
                                if (var466 == null) {
                                    break label661;
                                }

                                var1.Mf();
                                var55 &= 486151621;
                                var55 &= 1890574170;
                                var55 *= -1464275749;
                                var55 += -53493352;
                                var55 ^= 1082104699;
                            } else {
                                switch (var55) {
                                    case -1810561717:
                                        var55 ^= 1370709404;
                                        var55 ^= -570896893;
                                        var55 ^= 1933290763;
                                        var55 ^= -771239620;
                                        break;
                                    case -1336867701:
                                    default:
                                        var55 ^= -1481958087;
                                        break;
                                    case 970612872:
                                        var55 ^= 1483052557;
                                }
                            }

                            Integer var467 = var55;
                            if (var467 == null) {
                                break label661;
                            }

                            float var468 = var1.ur();
                            var554 = this.xT;
                            float var590 = var1.K(var554);
                            float var469 = var468 * var590;
                            float var591 = var1.tQ();
                            float var592 = var591 * var469;
                            float var640 = var1.Yo();
                            float var641 = var640 * var469;
                            float var679 = var1.dj();
                            var10 = var4;
                            long var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var10 = var12 & 1L;
                            long var943;
                            int var725 = (var943 = var10 - 0L) == 0L ? 0 : (var943 < 0L ? -1 : 1);
                            if (var725 != 0) {
                                var55 += -971698948;
                                var55 &= 1199637838;
                                var55 -= -470222426;
                                var55 |= 863689015;
                                var55 ^= -2097183881;
                            } else {
                                label721: {
                                    label674: {
                                        var55 ^= 1270150334;
                                        var55 |= 2045624989;
                                        var55 ^= -1100758739;
                                        lH_3 var726 = this.xT;
                                        boolean var727 = var726.J;
                                        if (!var727) {
                                            var55 >>= 13;
                                            var55 -= -1273641507;
                                            var55 -= 1362576797;
                                            var55 ^= -20190462;
                                            var55 ^= 1936457835;
                                            int var728 = var55 + 1;
                                            int var729 = var55 * var728;
                                            int var730 = var729 & 1;
                                            if (var730 != 0) {
                                                break label661;
                                            }

                                            lH_3 var731 = this.xT;
                                            float[] var760 = this.ND;
                                            int var788 = var4 + 1;
                                            int var789 = var4 * var788;
                                            int var13 = var4 + 2;
                                            int var790 = var789 * var13;
                                            var13 = var4 + 3;
                                            int var791 = var790 * var13;
                                            int var792 = var791 & 7;
                                            if (var792 != 0) {
                                                var55 >>= 10;
                                                var55 ^= -241656710;
                                                break label721;
                                            }

                                            var55 >>>= 21;
                                            var55 >>>= 31;
                                            var55 += 1649800220;
                                            var55 |= 1235022153;
                                            var55 ^= -1753235442;
                                            var12 = var55;
                                            long var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            long var16 = var12 + 2L;
                                            var14 *= var16;
                                            var12 += 3L;
                                            var14 *= var12;
                                            var12 = var14 & 7L;
                                            long var944;
                                            int var796 = (var944 = var12 - 0L) == 0L ? 0 : (var944 < 0L ? -1 : 1);
                                            if (var796 != 0) {
                                                break label661;
                                            }

                                            boolean var732 = var1.cd(var731, var592, var641, var760);
                                            if (var732) {
                                                var55 &= -2033974268;
                                                var55 |= 1065144967;
                                                var55 ^= 792781845;
                                                var733 = true;
                                                switch (var55) {
                                                    case -1866714478:
                                                        var55 ^= 1300253314;
                                                        var55 *= -583018269;
                                                        var55 ^= 1029212689;
                                                        break label674;
                                                    case 356839404:
                                                    default:
                                                        var55 ^= -1329386197;
                                                        break label674;
                                                    case 1431783768:
                                                        var55 ^= -976259176;
                                                        break label674;
                                                }
                                            }

                                            var55 >>= 14;
                                            var55 *= -617397177;
                                            var55 |= 736825851;
                                            var55 += 1464516002;
                                            var55 ^= 1675138835;
                                        } else {
                                            switch (var55) {
                                                case -1032308935:
                                                    var55 ^= 759353677;
                                                    break;
                                                case 1167859696:
                                                    var55 &= 320477545;
                                                    var55 *= -1815399559;
                                                    var55 ^= -193152786;
                                                    break;
                                                case 1180873761:
                                                default:
                                                    var55 ^= 2129800824;
                                            }
                                        }

                                        Integer var761 = var55;
                                        if (var761 == null) {
                                            break label661;
                                        }

                                        var733 = false;
                                        var55 *= -781475691;
                                        var55 &= -974607183;
                                        var55 &= -938970742;
                                        var55 ^= -259302239;
                                    }

                                    Integer var762 = var55;
                                    if (var762 == null) {
                                        break label661;
                                    }

                                    var11 = var4;
                                    long var805 = var11 + 1L;
                                    var805 = var11 * var805;
                                    long var15 = var11 + 2L;
                                    var805 *= var15;
                                    var11 += 3L;
                                    var805 *= var11;
                                    var11 = var805 & 7L;
                                    long var945;
                                    int var766 = (var945 = var11 - 0L) == 0L ? 0 : (var945 < 0L ? -1 : 1);
                                    if (var766 != 0) {
                                        var55 -= -561725735;
                                        var55 *= -2134620417;
                                        var55 ^= 1311072880;
                                    } else {
                                        label676: {
                                            var55 >>= 24;
                                            var55 |= 1972726078;
                                            var55 ^= -726463767;
                                            Integer var767 = var55;
                                            if (var767 == null) {
                                                break label661;
                                            }

                                            nP var768 = this.h;
                                            boolean var769 = var768.K(var1);
                                            float var773;
                                            float var799;
                                            if (var769) {
                                                var55 = switch (var55) {
                                                    case -732163867 -> var55 ^ -565567380;
                                                    default -> var55 ^ 491891408;
                                                    case 726463831 -> {
                                                        var55 <<= 6;
                                                        var55 -= -332402997;
                                                        var55 += -785969374;
                                                        yield var55 ^ -26081182;
                                                    }
                                                };
                                                Integer var770 = var55;
                                                if (var770 == null) {
                                                    break label661;
                                                }

                                                nP var771 = this.h;
                                                float var772 = var771.h();
                                                nP var797 = this.h;
                                                var805 = var4;
                                                var15 = var805 + 1L;
                                                var15 = var805 * var15;
                                                var805 = var15 & 1L;
                                                long var946;
                                                int var811 = (var946 = var805 - 0L) == 0L ? 0 : (var946 < 0L ? -1 : 1);
                                                if (var811 != 0) {
                                                    switch (var55) {
                                                        case -1564423922:
                                                        default:
                                                            var55 ^= -667753296;
                                                            break label676;
                                                        case 1179025013:
                                                            var55 -= 2106838503;
                                                            var55 -= -1517565156;
                                                            var55 ^= -761020998;
                                                            break label676;
                                                        case 1474736434:
                                                            var55 ^= 77385075;
                                                            break label676;
                                                    }
                                                }

                                                var55 ^= 631881936;
                                                var55 += 942668464;
                                                var55 *= 2123872853;
                                                var55 >>= 19;
                                                var55 ^= -1506322311;
                                                Integer var812 = var55;
                                                if (var812 == null) {
                                                    break label661;
                                                }

                                                float var798 = var797.Mo();
                                                var773 = var772;
                                                var799 = var798;
                                                var55 -= 1513659168;
                                                var55 >>>= 13;
                                                var55 ^= 1140557333;
                                            } else {
                                                var55 <<= 21;
                                                var55 += -1030868823;
                                                var55 &= 1124391577;
                                                var55 |= -2086791774;
                                                var55 ^= 1944757847;
                                                Integer var813 = var55;
                                                if (var813 == null) {
                                                    break label661;
                                                }

                                                if (var733) {
                                                    var55 <<= 4;
                                                    var55 ^= -751246427;
                                                    var55 -= -332250862;
                                                    var55 ^= 1870499517;
                                                    float[] var814 = this.ND;
                                                    float var815 = var814[0];
                                                    float[] var850 = this.ND;
                                                    float var851 = var850[1];
                                                    Integer var872 = var4;
                                                    if (var872 == null) {
                                                        var55 >>>= 24;
                                                        var55 >>= 3;
                                                        var55 ^= 948464183;
                                                        var55 *= -983089755;
                                                        var55 ^= 1483599595;
                                                        break label676;
                                                    }
                                                    var55 = switch (var55) {
                                                        case -2026105362 -> {
                                                            var55 &= -496265435;
                                                            var55 >>= 31;
                                                            var55 &= -1489768454;
                                                            yield var55 ^ -786196939;
                                                        }
                                                        default -> var55 ^ -951808231;
                                                        case -504019752 -> var55 ^ 304326820;
                                                    };
                                                    var15 = var55;
                                                    long var17 = var15 + 1L;
                                                    var17 = var15 * var17;
                                                    var15 = var17 & 1L;
                                                    long var947;
                                                    int var875 = (var947 = var15 - 0L) == 0L ? 0 : (var947 < 0L ? -1 : 1);
                                                    if (var875 != 0) {
                                                        break label661;
                                                    }

                                                    var773 = var815;
                                                    var799 = var851;
                                                    var55 >>>= 28;
                                                    var55 &= 680886419;
                                                    var55 |= -91570382;
                                                    var55 ^= -1183619373;
                                                } else {
                                                    var55 |= -1420250281;
                                                    var55 ^= 238097143;
                                                    lH_3 var816 = this.xT;
                                                    float var817 = var816.d;
                                                    float var818 = var1.uW(var817, var592);
                                                    lH_3 var852 = this.xT;
                                                    float var853 = var852.d;
                                                    int var876 = var55 - -759892145;
                                                    int var877 = var876 * 1450351167;
                                                    int var878 = var877 ^ -147201506;
                                                    float var819 = lV(var818, var592, var853, var679, var878);
                                                    var852 = this.xT;
                                                    float var855 = var852.S;
                                                    float var856 = var1.BG(var855, var641);
                                                    lH_3 var879 = this.xT;
                                                    float var880 = var879.S;
                                                    int var908 = var55 + 833477422;
                                                    var908 -= 454509551;
                                                    var908 >>= 12;
                                                    var908 ^= 1556632282;
                                                    float var680 = lV(var856, var641, var880, var679, var908);
                                                    var773 = var819;
                                                    Integer var820 = var4;
                                                    if (var820 == null) {
                                                        var55 ^= 2103505375;
                                                        var55 &= 1873881180;
                                                        var55 ^= -1180411748;
                                                        break label676;
                                                    }

                                                    var55 >>>= 5;
                                                    var55 >>= 29;
                                                    var55 += 1819169678;
                                                    var55 ^= 1655433280;
                                                    var799 = var680;
                                                    var55 *= 300565701;
                                                    var55 ^= 2141316198;
                                                }
                                            }

                                            Integer var681 = var55;
                                            if (var681 == null) {
                                                break label661;
                                            }

                                            boolean var682 = var1.HQ;
                                            Integer var821 = var4;
                                            label581:
                                            if (var821 != null) {
                                                var55 ^= 1037157012;
                                                var55 ^= -829277117;
                                                var805 = var55;
                                                var15 = var805 + 1L;
                                                var15 = var805 * var15;
                                                long var917 = var805 + 2L;
                                                var15 *= var917;
                                                var805 += 3L;
                                                var15 *= var805;
                                                var805 = var15 & 7L;
                                                long var948;
                                                int var825 = (var948 = var805 - 0L) == 0L ? 0 : (var948 < 0L ? -1 : 1);
                                                if (var825 != 0) {
                                                    break label661;
                                                }

                                                label712: {
                                                    label681: {
                                                        if (!var682) {
                                                            var55 += -275546620;
                                                            var55 ^= 1517054304;
                                                            int var683 = var55 + 1;
                                                            int var684 = var55 * var683;
                                                            int var826 = var55 + 2;
                                                            int var685 = var684 * var826;
                                                            int var827 = var55 + 3;
                                                            int var686 = var685 * var827;
                                                            int var687 = var686 & 7;
                                                            if (var687 != 0) {
                                                                break label661;
                                                            }

                                                            if (!var733) {
                                                                var55 = switch (var55) {
                                                                    default -> var55 ^ -86922791;
                                                                    case -98448293 -> {
                                                                        var55 -= -1640227902;
                                                                        yield var55 ^ 229536319;
                                                                    }
                                                                    case 703621194 -> var55 ^ -1534516345;
                                                                };
                                                                boolean var688 = var1.nX();
                                                                var805 = var4;
                                                                var15 = var805 + 1L;
                                                                var15 = var805 * var15;
                                                                var917 = var805 + 2L;
                                                                var15 *= var917;
                                                                var805 += 3L;
                                                                var15 *= var805;
                                                                var805 = var15 & 7L;
                                                                long var949;
                                                                int var734 = (var949 = var805 - 0L) == 0L ? 0 : (var949 < 0L ? -1 : 1);
                                                                if (var734 != 0) {
                                                                    var55 ^= -862974255;
                                                                    var55 &= -2119979578;
                                                                    var55 *= -1656833021;
                                                                    var55 ^= -234400742;
                                                                    break label581;
                                                                }

                                                                var55 -= -1455598358;
                                                                var55 ^= 1757458565;
                                                                var55 ^= 678787306;
                                                                if (!var688) {
                                                                    var55 ^= -1244175158;
                                                                    var55 -= 793262977;
                                                                    var55 &= 1426796506;
                                                                    var55 ^= 546338362;
                                                                    break label681;
                                                                }

                                                                var55 *= 1791960119;
                                                                var55 ^= -616301409;
                                                                var55 += -1882462581;
                                                                var55 |= 2073552546;
                                                                var55 ^= 1821322419;
                                                                nP var689 = this.h;
                                                                var805 = var4;
                                                                var15 = var805 + 1L;
                                                                var15 = var805 * var15;
                                                                var917 = var805 + 2L;
                                                                var15 *= var917;
                                                                var805 += 3L;
                                                                var15 *= var805;
                                                                var805 = var15 & 7L;
                                                                long var950;
                                                                int var735 = (var950 = var805 - 0L) == 0L ? 0 : (var950 < 0L ? -1 : 1);
                                                                if (var735 != 0) {
                                                                    var55 += 29988081;
                                                                    var55 += -627121516;
                                                                    var55 ^= -2109994495;
                                                                    break label581;
                                                                }

                                                                var55 &= -1955585110;
                                                                var55 -= 394060170;
                                                                var55 -= -1646039809;
                                                                var55 <<= 26;
                                                                var55 ^= -404436210;
                                                                boolean var690 = var689.K(var1);
                                                                if (var690) {
                                                                    switch (var55) {
                                                                        case -1050739787:
                                                                        default:
                                                                            var55 ^= 562525643;
                                                                            break label681;
                                                                        case 483282260:
                                                                            var55 ^= 1200266608;
                                                                            break label681;
                                                                        case 1004849934:
                                                                            var55 ^= 835841195;
                                                                            var55 ^= -1399537176;
                                                                            var55 *= -1298540065;
                                                                            var55 ^= -1328311887;
                                                                            break label681;
                                                                    }
                                                                }

                                                                switch (var55) {
                                                                    case -1986631641:
                                                                        var55 ^= -1956722898;
                                                                        break;
                                                                    case -1796482593:
                                                                    default:
                                                                        var55 ^= 1817292953;
                                                                        break;
                                                                    case 1004849934:
                                                                        var55 += -609301976;
                                                                        var55 <<= 28;
                                                                        var55 *= 1292423917;
                                                                        var55 ^= -818137422;
                                                                }
                                                            } else {
                                                                var55 += -1146862053;
                                                                var55 += 1002646523;
                                                                var55 -= -1597409657;
                                                                var55 ^= 2139353432;
                                                            }
                                                        } else {
                                                            var55 -= -1610442048;
                                                            var55 += -1116810881;
                                                            var55 |= 941784221;
                                                            var55 += -529971250;
                                                            var55 ^= -239864961;
                                                        }

                                                        Integer var859 = var55;
                                                        if (var859 == null) {
                                                            break label661;
                                                        }

                                                        Re var860 = var1.Y;
                                                        var15 = var4;
                                                        var917 = var15 + 1L;
                                                        var917 = var15 * var917;
                                                        long var19 = var15 + 2L;
                                                        var917 *= var19;
                                                        var15 += 3L;
                                                        var917 *= var15;
                                                        var15 = var917 & 7L;
                                                        long var951;
                                                        int var898 = (var951 = var15 - 0L) == 0L ? 0 : (var951 < 0L ? -1 : 1);
                                                        if (var898 != 0) {
                                                            var55 *= -1260668481;
                                                            var55 ^= -149174191;
                                                            var55 <<= 6;
                                                            var55 ^= -651460856;
                                                            break label581;
                                                        }

                                                        var55 ^= 32572583;
                                                        var55 |= 1355646606;
                                                        var55 += -1651867716;
                                                        var55 ^= -1518329961;
                                                        var860.v(var773);
                                                        Re var861 = var1.wb;
                                                        var861.v(var799);
                                                        var1.HQ = false;
                                                        var749 = var773;
                                                        var842 = var799;
                                                        var55 -= 20953741;
                                                        var55 |= -1176713274;
                                                        var55 -= 1456029621;
                                                        var55 ^= -1331453071;
                                                        break label712;
                                                    }

                                                    int var691 = var55 + 1;
                                                    int var692 = var55 * var691;
                                                    int var736 = var55 + 2;
                                                    int var693 = var692 * var736;
                                                    int var737 = var55 + 3;
                                                    int var694 = var693 * var737;
                                                    int var695 = var694 & 7;
                                                    if (var695 != 0) {
                                                        break label661;
                                                    }

                                                    nP var696 = this.h;
                                                    boolean var697 = var696.K(var1);
                                                    var805 = var4;
                                                    var15 = var805 + 1L;
                                                    var15 = var805 * var15;
                                                    var805 = var15 & 1L;
                                                    long var952;
                                                    int var738 = (var952 = var805 - 0L) == 0L ? 0 : (var952 < 0L ? -1 : 1);
                                                    if (var738 != 0) {
                                                        var55 &= 943179713;
                                                        var55 ^= -778757304;
                                                        break label581;
                                                    }

                                                    var55 *= 1724291387;
                                                    var55 &= 1230609984;
                                                    var55 ^= 2120992452;
                                                    float var699;
                                                    if (var697) {
                                                        var55 >>>= 20;
                                                        var55 &= 1152389472;
                                                        var55 <<= 18;
                                                        var55 += -180866383;
                                                        var55 ^= -22642532;
                                                        Integer var698 = var55;
                                                        if (var698 == null) {
                                                            break label661;
                                                        }

                                                        var699 = 0.035F;
                                                        var55 >>>= 11;
                                                        var55 *= 1250389285;
                                                        var55 &= -1227852860;
                                                        var55 ^= 1373634122;
                                                    } else {
                                                        var55 += 1580525591;
                                                        var55 ^= 1522175249;
                                                        var699 = 0.09F;
                                                        switch (var55) {
                                                            case -1911927926:
                                                                var55 *= -1319494805;
                                                                var55 |= 248827229;
                                                                var55 ^= 1022780287;
                                                                var55 += -1126939600;
                                                                var55 ^= -853536962;
                                                                break;
                                                            case -1385214096:
                                                            default:
                                                                var55 ^= -727981792;
                                                                break;
                                                            case 536701001:
                                                                var55 ^= -533637327;
                                                        }
                                                    }

                                                    Re var739 = var1.Y;
                                                    var739.Q(var699);
                                                    Re var740 = var1.wb;
                                                    var740.Q(var699);
                                                    int var741 = var4 + 1;
                                                    int var742 = var4 * var741;
                                                    int var836 = var4 + 2;
                                                    int var743 = var742 * var836;
                                                    int var837 = var4 + 3;
                                                    int var744 = var743 * var837;
                                                    int var745 = var744 & 7;
                                                    if (var745 != 0) {
                                                        var55 >>= 2;
                                                        var55 += 1183960038;
                                                        var55 ^= -220833041;
                                                        var55 ^= 886751598;
                                                        break label581;
                                                    }
                                                    var55 = switch (var55) {
                                                        default -> var55 ^ -2034512373;
                                                        case -1008738930 -> {
                                                            var55 |= -1230208733;
                                                            var55 -= -104389029;
                                                            var55 |= 1108465919;
                                                            var55 <<= 19;
                                                            yield var55 ^ -826108643;
                                                        }
                                                        case 871434401 -> var55 ^ -504783923;
                                                    };
                                                    Integer var746 = var55;
                                                    if (var746 == null) {
                                                        break label661;
                                                    }

                                                    Re var747 = var1.Y;
                                                    lH_3 var838 = this.xT;
                                                    float var839 = var838.Ik;
                                                    float var748 = var747.Gc(var773, var839);
                                                    Re var840 = var1.wb;
                                                    lH_3 var857 = this.xT;
                                                    float var858 = var857.Ik;
                                                    float var841 = var840.Gc(var799, var858);
                                                    var749 = var748;
                                                    var842 = var841;
                                                    switch (var55) {
                                                        case -1412298351:
                                                            var55 ^= 8877416;
                                                            break;
                                                        case 825922845:
                                                            var55 *= 1732267669;
                                                            var55 *= 1972250475;
                                                            var55 <<= 16;
                                                            var55 *= -1169838813;
                                                            var55 ^= 758190907;
                                                            break;
                                                        case 1021724617:
                                                        default:
                                                            var55 ^= -307427608;
                                                    }
                                                }

                                                Integer var774 = var55;
                                                if (var774 == null) {
                                                    break label661;
                                                }

                                                var1.PC = var749;
                                                var1.G = var842;
                                                var1.Q = var469;
                                                int var775 = var4 + 1;
                                                int var776 = var4 * var775;
                                                int var777 = var776 & 1;
                                                label551:
                                                if (var777 == 0) {
                                                    var55 *= 356907027;
                                                    var55 &= -1704969293;
                                                    var55 &= 225671586;
                                                    var55 |= 1747599930;
                                                    var55 ^= -1262248086;
                                                    float var778 = TP.t(var514, 0.0F, 1.1F);
                                                    float var515 = TP.S(var514);
                                                    XF var779 = var1.PN;
                                                    lH_3 var800 = this.xT;
                                                    float var801 = var800.Ik;
                                                    float var780 = var779.N(var801);
                                                    boolean var802 = var1.nX();
                                                    float var863;
                                                    if (var802) {
                                                        var55 *= 1222606249;
                                                        var55 |= 1772403393;
                                                        var55 *= 111888829;
                                                        var55 ^= 178978281;
                                                        Integer var862 = var55;
                                                        if (var862 == null) {
                                                            break label661;
                                                        }

                                                        var863 = var469;
                                                        var55 |= 731187247;
                                                        var55 += -1284029473;
                                                        var55 ^= -1196986241;
                                                        var55 -= 1438848093;
                                                        var55 ^= -1166664222;
                                                    } else {
                                                        var55 &= -1390786553;
                                                        var55 >>= 28;
                                                        var55 *= -127533703;
                                                        var55 &= -1166504874;
                                                        var55 ^= 580706660;
                                                        Integer var899 = var55;
                                                        if (var899 == null) {
                                                            break label661;
                                                        }

                                                        float var701 = 0.1F * var778;
                                                        int var900 = var4 + 1;
                                                        int var901 = var4 * var900;
                                                        int var902 = var901 & 1;
                                                        if (var902 != 0) {
                                                            var55 &= 1807896452;
                                                            var55 ^= -79356468;
                                                            break label551;
                                                        }

                                                        var55 -= 1440243787;
                                                        var55 ^= 502839667;
                                                        var15 = var55;
                                                        var917 = var15 + 1L;
                                                        var917 = var15 * var917;
                                                        long var928 = var15 + 2L;
                                                        var917 *= var928;
                                                        var15 += 3L;
                                                        var917 *= var15;
                                                        var15 = var917 & 7L;
                                                        long var953;
                                                        int var906 = (var953 = var15 - 0L) == 0L ? 0 : (var953 < 0L ? -1 : 1);
                                                        if (var906 != 0) {
                                                            break label661;
                                                        }

                                                        float var702 = 0.9F + var701;
                                                        float var470 = var469 * var702;
                                                        float var703 = 0.025F * var780;
                                                        float var471 = var470 * ++var703;
                                                        var863 = var471;
                                                        var55 ^= 2118448825;
                                                        var55 ^= -998254299;
                                                        var55 |= -331511000;
                                                        var55 &= 1132845218;
                                                        var55 ^= 2025094612;
                                                    }

                                                    int var472 = var55 + 1;
                                                    var472 = var55 * var472;
                                                    var472 &= 1;
                                                    if (var472 != 0) {
                                                        break label661;
                                                    }

                                                    Integer var705 = var4;
                                                    if (var705 == null) {
                                                        var55 -= -1428912669;
                                                        var55 += -393425429;
                                                        var55 += 92771240;
                                                        var55 ^= -1888183826;
                                                    } else {
                                                        label685: {
                                                            var55 &= -1088178531;
                                                            var55 ^= -1089043836;
                                                            float var707;
                                                            if (var802) {
                                                                var55 *= 770937191;
                                                                var55 ^= -437342282;
                                                                long var864 = var55;
                                                                long var912 = var864 + 1L;
                                                                var912 = var864 * var912;
                                                                long var865 = var912 & 1L;
                                                                long var954;
                                                                int var706 = (var954 = var865 - 0L) == 0L ? 0 : (var954 < 0L ? -1 : 1);
                                                                if (var706 != 0) {
                                                                    break label661;
                                                                }

                                                                var707 = 0.0F;
                                                                var55 >>>= 30;
                                                                var55 ^= -2102393289;
                                                                var55 += 1948244941;
                                                                var55 ^= -1840385031;
                                                            } else {
                                                                var55 -= 1764649330;
                                                                var55 ^= -241922594;
                                                                int var781 = var55 + 1;
                                                                int var782 = var55 * var781;
                                                                int var783 = var782 & 1;
                                                                if (var783 != 0) {
                                                                    break label661;
                                                                }

                                                                float var784 = 1.0F - var515;
                                                                Integer var866 = var4;
                                                                if (var866 == null) {
                                                                    switch (var55) {
                                                                        case -570001734:
                                                                            var55 ^= -1267064216;
                                                                            break label685;
                                                                        case -358862656:
                                                                            var55 *= -1768307273;
                                                                            var55 ^= 2020589960;
                                                                            break label685;
                                                                        case 1309650870:
                                                                        default:
                                                                            var55 ^= 1433924452;
                                                                            break label685;
                                                                    }
                                                                }
                                                                var55 = switch (var55) {
                                                                    case -1024445592 -> var55 ^ -1619159330;
                                                                    case -358862656 -> {
                                                                        var55 &= -266236867;
                                                                        var55 += -192571280;
                                                                        var55 ^= 847550115;
                                                                        yield var55 ^ 141591603;
                                                                    }
                                                                    default -> var55 ^ 1538727256;
                                                                };
                                                                long var867 = var55;
                                                                long var914 = var867 + 1L;
                                                                var914 = var867 * var914;
                                                                long var868 = var914 & 1L;
                                                                long var955;
                                                                int var869 = (var955 = var868 - 0L) == 0L ? 0 : (var955 < 0L ? -1 : 1);
                                                                if (var869 != 0) {
                                                                    break label661;
                                                                }

                                                                float var785 = var784 * 6.0F;
                                                                var707 = var785;
                                                                var55 &= -728334679;
                                                                var55 *= 510020581;
                                                                var55 -= -1706998049;
                                                                var55 ^= 718186721;
                                                                var55 ^= 951690075;
                                                            }

                                                            Integer var786 = var55;
                                                            if (var786 == null) {
                                                                break label661;
                                                            }

                                                            var1.o = var863;
                                                            float var593 = var592 * 0.5F;
                                                            float var594 = var749 + var593;
                                                            float var750 = var1.tQ();
                                                            float var751 = var863 * var750;
                                                            float var752 = var751 * 0.5F;
                                                            float var595 = var594 - var752;
                                                            var1.I = var595;
                                                            float var596 = var641 * 0.5F;
                                                            float var597 = var842 + var596;
                                                            float var598 = var597 + var707;
                                                            float var642 = var1.Yo();
                                                            float var643 = var863 * var642;
                                                            var9 = var4;
                                                            var805 = var9 + 1L;
                                                            var805 = var9 * var805;
                                                            var15 = var9 + 2L;
                                                            var805 *= var15;
                                                            var9 += 3L;
                                                            var805 *= var9;
                                                            var9 = var805 & 7L;
                                                            long var956;
                                                            int var711 = (var956 = var9 - 0L) == 0L ? 0 : (var956 < 0L ? -1 : 1);
                                                            if (var711 == 0) {
                                                                var55 = switch (var55) {
                                                                    case 290253815 -> var55 ^ -86192417;
                                                                    case 1686245883 -> {
                                                                        var55 |= -1572831007;
                                                                        var55 >>>= 6;
                                                                        var55 <<= 13;
                                                                        yield var55 ^ -88412255;
                                                                    }
                                                                    default -> var55 ^ -1998533353;
                                                                };
                                                                int var712 = var55 + 1;
                                                                int var713 = var55 * var712;
                                                                int var714 = var713 & 1;
                                                                if (var714 != 0) {
                                                                    break label661;
                                                                }

                                                                float var644 = var643 * 0.5F;
                                                                float var599 = var598 - var644;
                                                                var1.zF = var599;
                                                                float var600;
                                                                if (var802) {
                                                                    var55 &= 1179365274;
                                                                    var55 |= 1081839327;
                                                                    var55 ^= -1391310683;
                                                                    var600 = 0.35F;
                                                                    var55 >>= 5;
                                                                    var55 += 977537889;
                                                                    var55 += 1898037920;
                                                                    var55 >>>= 9;
                                                                    var55 ^= -1449294363;
                                                                } else {
                                                                    var55 ^= 217461637;
                                                                    var55 += 478722480;
                                                                    var55 -= 1754055158;
                                                                    var55 ^= -453853534;
                                                                    var600 = 0.75F;
                                                                    var55 &= -911989485;
                                                                    var55 ^= -1197088008;
                                                                    var55 <<= 26;
                                                                    var55 -= 277814336;
                                                                    var55 ^= 649598635;
                                                                }

                                                                Integer var645 = var55;
                                                                if (var645 == null) {
                                                                    break label661;
                                                                }

                                                                float var601 = TP.N(0.0F, var600, var515);
                                                                var1.J = var601;
                                                                Integer var602 = var4;
                                                                label533:
                                                                if (var602 != null) {
                                                                    var55 &= -2135723234;
                                                                    var55 ^= -898738596;
                                                                    float var604;
                                                                    if (var802) {
                                                                        var55 &= 931568509;
                                                                        var55 += -544621895;
                                                                        var55 *= 1266827679;
                                                                        var55 += 1202119541;
                                                                        var55 ^= 724234526;
                                                                        Integer var603 = var55;
                                                                        if (var603 == null) {
                                                                            break label661;
                                                                        }

                                                                        var604 = 0.0F;
                                                                        var55 &= -1193238358;
                                                                        var55 ^= -1725525431;
                                                                    } else {
                                                                        var55 += -1669534042;
                                                                        var55 >>= 19;
                                                                        var55 >>>= 4;
                                                                        var55 ^= 853147928;
                                                                        Integer var646 = var55;
                                                                        if (var646 == null) {
                                                                            break label661;
                                                                        }

                                                                        float var516 = 1.0F - var515;
                                                                        int var647 = var4 + 1;
                                                                        int var648 = var4 * var647;
                                                                        int var715 = var4 + 2;
                                                                        int var649 = var648 * var715;
                                                                        int var716 = var4 + 3;
                                                                        int var650 = var649 * var716;
                                                                        int var651 = var650 & 7;
                                                                        if (var651 != 0) {
                                                                            var55 += -1650490349;
                                                                            var55 |= -836950485;
                                                                            var55 >>= 1;
                                                                            var55 += 1049250559;
                                                                            var55 ^= -595835204;
                                                                            break label533;
                                                                        }

                                                                        var55 *= -16262685;
                                                                        var55 *= 618162505;
                                                                        var55 *= -1927008527;
                                                                        var55 -= 2103032022;
                                                                        var55 ^= 1464894952;
                                                                        int var652 = var55 + 1;
                                                                        int var653 = var55 * var652;
                                                                        int var717 = var55 + 2;
                                                                        int var654 = var653 * var717;
                                                                        int var718 = var55 + 3;
                                                                        int var655 = var654 * var718;
                                                                        int var656 = var655 & 7;
                                                                        if (var656 != 0) {
                                                                            break label661;
                                                                        }

                                                                        float var517 = var516 * 2.6F;
                                                                        var604 = var517;
                                                                        var55 &= 1929518191;
                                                                        var55 ^= -1018950929;
                                                                    }

                                                                    var8 = var55;
                                                                    var10 = var8 + 1L;
                                                                    var10 = var8 * var10;
                                                                    var12 = var8 + 2L;
                                                                    var10 *= var12;
                                                                    var8 += 3L;
                                                                    var10 *= var8;
                                                                    var8 = var10 & 7L;
                                                                    long var957;
                                                                    int var518 = (var957 = var8 - 0L) == 0L ? 0 : (var957 < 0L ? -1 : 1);
                                                                    if (var518 != 0) {
                                                                        break label661;
                                                                    }

                                                                    var1.O = var604;
                                                                    this.o = Float.MAX_VALUE;
                                                                    this.y = Float.MAX_VALUE;
                                                                    this.C = -Float.MAX_VALUE;
                                                                    this.H = -Float.MAX_VALUE;
                                                                    hr var519 = this.WS;
                                                                    var554 = this.xT;
                                                                    var1.BO(var519, var554);
                                                                    Integer var520 = var4;
                                                                    if (var520 == null) {
                                                                        var55 &= 960589490;
                                                                        var55 >>>= 6;
                                                                        var55 ^= -247441214;
                                                                    } else {
                                                                        label690: {
                                                                            var55 += -2064889172;
                                                                            var55 ^= -739370798;
                                                                            int var521 = var55 + 1;
                                                                            int var522 = var55 * var521;
                                                                            int var606 = var55 + 2;
                                                                            int var523 = var522 * var606;
                                                                            int var607 = var55 + 3;
                                                                            int var524 = var523 * var607;
                                                                            int var525 = var524 & 7;
                                                                            if (var525 != 0) {
                                                                                break label661;
                                                                            }

                                                                            float var526 = this.y;
                                                                            float var608 = this.H;
                                                                            float var958;
                                                                            int var527 = (var958 = var526 - var608) == 0.0F ? 0 : (var958 < 0.0F ? -1 : 1);
                                                                            if (var527 > 0) {
                                                                                var55 -= -1957669971;
                                                                                var55 ^= 681883208;
                                                                                int var528 = var55 + 1;
                                                                                int var529 = var55 * var528;
                                                                                int var609 = var55 + 2;
                                                                                int var530 = var529 * var609;
                                                                                int var610 = var55 + 3;
                                                                                int var531 = var530 * var610;
                                                                                int var532 = var531 & 7;
                                                                                if (var532 != 0) {
                                                                                    break label661;
                                                                                }

                                                                                this.o = 0.0F;
                                                                                var6 = var4;
                                                                                var8 = var6 + 1L;
                                                                                var8 = var6 * var8;
                                                                                var10 = var6 + 2L;
                                                                                var8 *= var10;
                                                                                var6 += 3L;
                                                                                var8 *= var6;
                                                                                var6 = var8 & 7L;
                                                                                long var959;
                                                                                int var536 = (var959 = var6 - 0L) == 0L ? 0 : (var959 < 0L ? -1 : 1);
                                                                                if (var536 != 0) {
                                                                                    var55 *= 934407725;
                                                                                    var55 ^= -1776262856;
                                                                                    break label690;
                                                                                }

                                                                                var55 >>= 31;
                                                                                var55 ^= 510214304;
                                                                                Integer var537 = var55;
                                                                                if (var537 == null) {
                                                                                    break label661;
                                                                                }

                                                                                this.y = 0.0F;
                                                                                float var538 = var1.tQ();
                                                                                this.H = var538;
                                                                                float var539 = var1.Yo();
                                                                                this.C = var539;
                                                                                var55 += -431526949;
                                                                                var55 |= 326639814;
                                                                                var55 -= -162057;
                                                                                var55 ^= -808160955;
                                                                            } else {
                                                                                var55 *= -19756837;
                                                                                var55 ^= 1152155847;
                                                                                var55 &= -1297449380;
                                                                                var55 |= -1643513531;
                                                                                var55 ^= 1711712776;
                                                                            }

                                                                            float var540 = var1.I;
                                                                            float var611 = this.y;
                                                                            float var612 = var863 * var611;
                                                                            float var541 = var540 + var612;
                                                                            var1.Au = var541;
                                                                            float var542 = var1.zF;
                                                                            float var613 = this.o;
                                                                            float var614 = var863 * var613;
                                                                            float var543 = var542 + var614;
                                                                            var1.eU = var543;
                                                                            int var544 = var4 + 1;
                                                                            int var545 = var4 * var544;
                                                                            var4 = var545 & 1;
                                                                            if (var4 == 0) {
                                                                                var55 <<= 2;
                                                                                var55 <<= 11;
                                                                                var55 ^= -1212456551;
                                                                                var4 = var55 + 1;
                                                                                var4 = var55 * var4;
                                                                                var4 &= 1;
                                                                                if (var4 == 0) {
                                                                                    float var426 = var1.I;
                                                                                    float var546 = this.H;
                                                                                    float var547 = var863 * var546;
                                                                                    float var427 = var426 + var547;
                                                                                    var1.gd = var427;
                                                                                    float var428 = var1.zF;
                                                                                    float var548 = this.C;
                                                                                    float var476 = var863 * var548;
                                                                                    float var429 = var428 + var476;
                                                                                    var1.CW = var429;
                                                                                    return;
                                                                                }
                                                                                break label661;
                                                                            }

                                                                            var55 ^= 744639997;
                                                                            var55 >>= 1;
                                                                            var55 -= -25233687;
                                                                            var55 &= -687721772;
                                                                            var55 ^= 579291788;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var55 *= -110548741;
                                                                    var55 |= -143319614;
                                                                    var55 |= -595911963;
                                                                    var55 ^= -362324088;
                                                                    var55 ^= -459450193;
                                                                }
                                                            } else {
                                                                var55 += 898019225;
                                                                var55 |= 1056188784;
                                                                var55 ^= 1333375292;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    var55 *= -896295957;
                                                    var55 -= -1597546704;
                                                    var55 ^= 400906289;
                                                }
                                            } else {
                                                var55 ^= -666233227;
                                                var55 ^= -1023068714;
                                                var55 ^= -1456233845;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            var55 *= 1046308989;
                            var55 ^= 161940571;
                            var55 *= 1322430599;
                            var55 ^= -1191012605;
                        }
                    }
                }
            } else {
                var55 = var2 ^ 1795537509;
                var55 += -322024042;
                var55 *= 730780993;
                var55 ^= 1434926853;
            }

            var4 = var55 + 1;
            var4 = var55 * var4;
            var5 = var55 + 2;
            var4 *= var5;
            var55 += 3;
            var4 *= var55;
            var55 = var4 & 7;
            if (var55 == 0) {
                RuntimeException var421 = new RuntimeException();
                throw var421;
            }
        }

        UnsupportedOperationException var420 = new UnsupportedOperationException();
        throw var420;
    }

    private static float lV(float var0, float var1, float var2, float var3, int var4) {
        int var6 = (int)var0;
        long var25 = var6;
        long var8 = var25 + 1L;
        var8 = var25 * var8;
        long var26 = var8 & 1L;
        long var41;
        var6 = (var41 = var26 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var6 != 0) {
            long var28 = switch (var4) {
                case -1556812647 -> {
                    int var12 = var4 >> 1;
                    yield var12 ^ -1670797151;
                }
                case -107434898 -> var4 ^ -1809471090;
                default -> var4 ^ 1329704413;
            };
            var8 = var28 + 1L;
            var8 = var28 * var8;
            long var10 = var28 + 2L;
            var8 *= var10;
            long var29 = var28 + 3L;
            var8 *= var29;
            long var30 = var8 & 7L;
            long var42;
            var6 = (var42 = var30 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var6 == 0) {
                UnsupportedOperationException var32 = new UnsupportedOperationException();
                throw var32;
            }
        } else {
            long var17 = switch (var4) {
                case -1556812647 -> {
                    int var14 = var4 | -1865725746;
                    var14 |= 1900197298;
                    var14 >>= 22;
                    yield var14 ^ 377141563;
                }
                case -258993340 -> var4 ^ 318075834;
                default -> var4 ^ 139009798;
            };
            long var7 = var17 + 1L;
            var7 = var17 * var7;
            long var9 = var17 + 2L;
            var7 *= var9;
            var17 += 3L;
            var7 *= var17;
            var17 = var7 & 7L;
            long var43;
            int var20 = (var43 = var17 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var20 == 0) {
                float var22 = var2 - var1;
                float var23 = var22 - var3;
                float var24 = Math.max(var3, var23);
                return TP.t(var0, var3, var24);
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    private void x(RenderEvent var1) {
        label186: {
            int var2 = aL;
            var2 ^= -10227952;
            int var3 = System.identityHashCode(this);
            RenderPhase var4 = var1.phase();
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                switch (var2) {
                    case -1990960786:
                    default:
                        var2 ^= 447253878;
                        break;
                    case 812566920:
                        var2 ^= -2011109997;
                        break;
                    case 1871391796:
                        var2 |= 1259046242;
                        var2 >>= 26;
                        var2 |= 1272150641;
                        var2 &= 1891289785;
                        var2 ^= -668500485;
                }
            } else {
                label185: {
                    var2 *= 331475663;
                    var2 *= 948867525;
                    var2 ^= -1954834646;
                    var2 *= 1732420339;
                    var2 ^= 2061835831;
                    RenderPhase var150 = RenderPhase.UNDERLAY;
                    if (var4 == var150) {
                        var2 = switch (var2) {
                            case -1631178027 -> {
                                var2 >>>= 11;
                                var2 -= -1363540644;
                                yield var2 ^ 1748430095;
                            }
                            default -> var2 ^ -622423835;
                            case -686337866 -> var2 ^ 1869140059;
                        };
                        long var121 = var2;
                        long var186 = var121 + 1L;
                        long var187 = var121 * var186;
                        long var122 = var187 & 1L;
                        long var217;
                        int var123 = (var217 = var122 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                        if (var123 != 0) {
                            break label186;
                        }

                        this.bH();
                        FrameContext var124 = var1.frame();
                        Integer var151 = var3;
                        if (var151 == null) {
                            var2 <<= 22;
                            var2 -= 1519194720;
                            var2 ^= -1509434782;
                            break label185;
                        }

                        var2 ^= -2071149758;
                        var2 += 1428481571;
                        var2 ^= -349965293;
                        int var152 = var2 + 1;
                        var152 = var2 * var152;
                        var6 = var2 + 2;
                        var152 *= var6;
                        var6 = var2 + 3;
                        var152 *= var6;
                        var152 &= 7;
                        if (var152 != 0) {
                            break label186;
                        }

                        boolean var125 = var124.hideGui();
                        if (!var125) {
                            var2 = switch (var2) {
                                case -1462207888 -> var2 ^ -1234467325;
                                default -> var2 ^ -321004356;
                                case -131393703 -> {
                                    var2 >>>= 18;
                                    var2 ^= 1115249139;
                                    var2 *= 418471295;
                                    yield var2 ^ -626721968;
                                }
                            };
                            long var126 = var2;
                            long var190 = var126 + 1L;
                            long var191 = var126 * var190;
                            long var127 = var191 & 1L;
                            long var218;
                            int var128 = (var218 = var127 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                            if (var128 != 0) {
                                break label186;
                            }

                            Canvas var129 = var1.canvas();
                            long var157 = var3;
                            long var7 = var157 + 1L;
                            var7 = var157 * var7;
                            long var9 = var157 + 2L;
                            var7 *= var9;
                            long var158 = var157 + 3L;
                            var7 *= var158;
                            long var159 = var7 & 7L;
                            long var219;
                            var152 = (var219 = var159 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                            if (var152 != 0) {
                                var2 *= -905437891;
                                var2 *= -1070158767;
                                var2 ^= 1679645033;
                                break label185;
                            }
                            var2 = switch (var2) {
                                case -1798442281 -> {
                                    var2 >>>= 25;
                                    var2 += 1716981108;
                                    var2 ^= 1591393051;
                                    yield var2 ^ -1999376103;
                                }
                                case -1370902233 -> var2 ^ -1252645356;
                                default -> var2 ^ -536117328;
                            };
                            Integer var161 = var2;
                            if (var161 == null) {
                                break label186;
                            }

                            int var162 = var2 ^ -2076489730;
                            var162 *= -641975719;
                            var162 += -1241744289;
                            var162 ^= -673024430;
                            var162 ^= -642563376;
                            this.B(var129, false, var162);
                            switch (var2) {
                                case -1335998532:
                                    var2 *= -272679479;
                                    var2 ^= -656868919;
                                    break;
                                case -551324733:
                                    var2 ^= -1957350979;
                                    break;
                                case -469111613:
                                default:
                                    var2 ^= 609127095;
                            }
                        } else {
                            switch (var2) {
                                case -131393703:
                                    var2 |= 695176482;
                                    var2 &= -745639170;
                                    var2 ^= -206244561;
                                    break;
                                case 482621555:
                                    var2 ^= -1542967583;
                                    break;
                                case 1585124802:
                                default:
                                    var2 ^= 257314687;
                            }
                        }
                    } else {
                        var2 &= 405036763;
                        var2 += -1158458521;
                        var2 -= 1637400664;
                        var2 ^= -1757832771;
                        var4 = var1.phase();
                        RenderPhase var167 = RenderPhase.OVERLAY;
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var209 = var3 + 2;
                        var6 *= var209;
                        var209 = var3 + 3;
                        var6 *= var209;
                        var6 &= 7;
                        if (var6 != 0) {
                            switch (var2) {
                                case -2143452126:
                                default:
                                    var2 ^= -477852068;
                                    break label185;
                                case -1919598139:
                                    var2 ^= -1713924926;
                                    break label185;
                                case -429441955:
                                    var2 += -1032402746;
                                    var2 *= 1998077369;
                                    var2 ^= 927349385;
                                    break label185;
                            }
                        }

                        var2 ^= -927819834;
                        var2 ^= -450288772;
                        var6 = var2 + 1;
                        var6 = var2 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            break label186;
                        }

                        if (var4 == var167) {
                            var2 += -1993851700;
                            var2 ^= 1324844226;
                            var2 += 1135736526;
                            var2 ^= 837002697;
                            var2 ^= 116601647;
                            FrameContext var131 = var1.frame();
                            boolean var132 = var131.hideGui();
                            Integer var168 = var3;
                            if (var168 == null) {
                                var2 += 1063603959;
                                var2 |= -2032424330;
                                var2 += -152441424;
                                var2 *= 170468123;
                                var2 ^= 635893056;
                                break label185;
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ -94218677;
                                case 1687059283 -> var2 ^ -1460593827;
                                case 1754640089 -> {
                                    var2 += 1770631317;
                                    var2 *= 1529272227;
                                    var2 &= -1411790824;
                                    yield var2 ^ 1576089994;
                                }
                            };
                            long var169 = var2;
                            long var211 = var169 + 1L;
                            long var212 = var169 * var211;
                            long var216 = var169 + 2L;
                            long var213 = var212 * var216;
                            long var170 = var169 + 3L;
                            long var214 = var213 * var170;
                            long var171 = var214 & 7L;
                            long var220;
                            int var172 = (var220 = var171 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                            if (var172 != 0) {
                                break label186;
                            }

                            if (!var132) {
                                var2 <<= 12;
                                var2 &= 1262880051;
                                var2 ^= 916013249;
                                var2 >>= 22;
                                var2 ^= -842571553;
                                Integer var133 = var2;
                                if (var133 == null) {
                                    break label186;
                                }

                                nP var134 = this.h;
                                Canvas var173 = var1.canvas();
                                lH_3 var200 = this.xT;
                                Integer var215 = var3;
                                if (var215 == null) {
                                    var2 *= 794291609;
                                    var2 |= -1584892376;
                                    var2 *= 2019558535;
                                    var2 += -984539691;
                                    var2 ^= 247258358;
                                    break label185;
                                }

                                var2 *= 33038255;
                                var2 |= -1954313425;
                                var2 ^= -1039161574;
                                var134.O(var173, var200);
                                boolean var135 = this.ID;
                                if (var135) {
                                    var2 = switch (var2) {
                                        case 519067825 -> var2 ^ -857420124;
                                        case 699144245 -> {
                                            var2 += 1796105571;
                                            var2 *= 609776757;
                                            var2 *= 1408208925;
                                            var2 *= 10424121;
                                            yield var2 ^ -636159320;
                                        }
                                        default -> var2 ^ 245516664;
                                    };
                                    long var136 = var2;
                                    long var201 = var136 + 1L;
                                    long var202 = var136 * var201;
                                    long var137 = var202 & 1L;
                                    long var221;
                                    int var138 = (var221 = var137 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                                    if (var138 != 0) {
                                        break label186;
                                    }

                                    Canvas var139 = var1.canvas();
                                    var172 = var3 + 1;
                                    var172 = var3 * var172;
                                    var6 = var3 + 2;
                                    var172 *= var6;
                                    var6 = var3 + 3;
                                    var172 *= var6;
                                    var172 &= 7;
                                    if (var172 != 0) {
                                        switch (var2) {
                                            case -1665167710:
                                            default:
                                                var2 ^= 144834647;
                                                break label185;
                                            case -364603792:
                                                var2 *= 1344811657;
                                                var2 <<= 23;
                                                var2 ^= 1622489026;
                                                break label185;
                                            case 512166966:
                                                var2 ^= -747283268;
                                                break label185;
                                        }
                                    }

                                    var2 &= -1973475488;
                                    var2 <<= 20;
                                    var2 -= -1583301162;
                                    var2 -= 1699384103;
                                    var2 ^= 1275185147;
                                    var172 = var2 - -1594353336;
                                    var172 -= 1414491862;
                                    var172 ^= -499361015;
                                    this.B(var139, true, var172);
                                    var2 *= -810385369;
                                    var2 ^= -994096260;
                                } else {
                                    var2 += -2078615802;
                                    var2 *= 384851249;
                                    var2 ^= -1866250241;
                                }

                                int var140 = var2 + 1;
                                int var141 = var2 * var140;
                                var172 = var2 + 2;
                                int var142 = var141 * var172;
                                var172 = var2 + 3;
                                int var143 = var142 * var172;
                                int var144 = var143 & 7;
                                if (var144 != 0) {
                                    break label186;
                                }

                                nP var145 = this.h;
                                Canvas var184 = var1.canvas();
                                lH_3 var205 = this.xT;
                                Integer var118 = var3;
                                if (var118 == null) {
                                    var2 += 616923908;
                                    var2 ^= 249575034;
                                    break label185;
                                }

                                var2 &= -1452067900;
                                var2 += -1746441662;
                                var2 ^= -1834225217;
                                var118 = var2;
                                if (var118 == null) {
                                    break label186;
                                }

                                var145.S(var184, var205);
                                var2 -= -359645395;
                                var2 &= 1636628595;
                                var2 |= -987545731;
                                var2 ^= -954607576;
                            } else {
                                var2 *= -1042524303;
                                var2 ^= -414812361;
                            }
                        } else {
                            var2 |= 1061922775;
                            var2 *= -1943338693;
                            var2 ^= -2136972360;
                        }
                    }

                    Integer var104 = var2;
                    if (var104 != null) {
                        return;
                    }
                    break label186;
                }
            }

            AssertionError var120 = new AssertionError();
            throw var120;
        }

        RuntimeException var105 = new RuntimeException();
        throw var105;
    }

    private void B(Canvas var1, boolean var2, int var3) {
        int var437 = 0;
        List var477 = null;
        java.util.Iterator var478 = null;
        java.util.Iterator var479 = null;
        Object var512 = null;
        HudModule var513 = null;
        HudModule var514 = null;
        boolean var534 = false;
        lH_3 var541 = null;
        boolean var542 = false;
        int var543 = 0;
        HudModule[] var551 = null;
        HudModule[] var559 = null;
        HudModule[] var563 = null;
        HudModule[] var588 = null;
        HudModule var589 = null;
        boolean var590 = false;
        int var600 = 0;
        int var601 = 0;
        int var602 = 0;
        Throwable var5 = null;
        this.c = var1;
        lH_3 var6 = this.xT;

        int var4 = switch (var3) {
            default -> var3 ^ -1536198952;
            case -937005 -> {
                int var49 = var3 | -1077316038;
                yield var49 ^ 2060525106;
            }
            case 2142666158 -> var3 ^ -1929185249;
        };
        int var7 = var4 + 1;
        var7 = var4 * var7;
        int var8 = var4 + 2;
        var7 *= var8;
        var8 = var4 + 3;
        var7 *= var8;
        var7 &= 7;
        if (var7 == 0) {
            hudstyle var430 = var6.eB;
            this.B = var430;
            var6 = this.xT;
            Oo var432 = var6.Y;
            this.PL = var432;
            var4 &= -1677684177;
            var4 += -487788144;
            var4 ^= 341149000;
            long var433 = var4;
            long var487 = var433 + 1L;
            long var488 = var433 * var487;
            long var434 = var488 & 1L;
            long var690;
            int var435 = (var690 = var434 - 0L) == 0L ? 0 : (var690 < 0L ? -1 : 1);
            label570:
            if (var435 == 0) {
                label568: {
                    label623: {
                        try {
                            var437 = 0;
                            var4 |= -1900761226;
                            var4 |= -229142887;
                            var4 -= 1934813507;
                            var4 ^= -686607435;
                            var477 = this.V;
                            var4 >>= 10;
                            var4 |= -390006340;
                            var4 += -1172666489;
                            var4 -= -1763996641;
                            var4 ^= -1396615918;
                        } catch (Throwable var48) {
                            int var53 = aL;
                            int var54 = var53 ^ -572076244;
                            var5 = var48;
                            int var55 = var54 >> 30;
                            int var56 = var55 | -1665546854;
                            int var57 = var56 | 36045952;
                            var4 = var57 ^ 1243758131;
                            Integer var436 = var4;
                            if (var436 == null) {
                                break label570;
                            }
                            break label623;
                        }

                        long var489 = var4;
                        long var10 = var489 + 1L;
                        var10 = var489 * var10;
                        long var490 = var10 & 1L;
                        long var691;
                        var8 = (var691 = var490 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label570;
                        }

                        try {
                            var478 = var477.iterator();
                            var4 *= -708815397;
                            var4 &= -1013397044;
                            var4 <<= 2;
                            var4 >>>= 9;
                            var4 ^= 1085766894;
                        } catch (Throwable var47) {
                            int var68 = aL;
                            int var69 = var68 ^ -572076244;
                            var5 = var47;
                            int var70 = var69 >> 30;
                            int var71 = var70 | -1665546854;
                            int var72 = var71 | 36045952;
                            var4 = var72 ^ 1243758131;
                            Integer var438 = var4;
                            if (var438 == null) {
                                break label570;
                            }
                            break label623;
                        }

                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        int var9 = var4 + 2;
                        var8 *= var9;
                        var9 = var4 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label570;
                        }

                        try {
                            var479 = var478;
                            var4 >>= 26;
                            var4 ^= 1577193792;
                        } catch (Throwable var46) {
                            int var78 = aL;
                            int var79 = var78 ^ -572076244;
                            var5 = var46;
                            int var80 = var79 >> 30;
                            int var81 = var80 | -1665546854;
                            int var82 = var81 | 36045952;
                            var4 = var82 ^ 1243758131;
                            Integer var439 = var4;
                            if (var439 == null) {
                                break label570;
                            }
                            break label623;
                        }

                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        var9 = var4 + 2;
                        var8 *= var9;
                        var9 = var4 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label570;
                        }

                        int var440 = var437;
                        var4 |= 618659914;
                        var4 += 347906296;
                        var4 ^= -876713250;

                        while (true) {
                            var4 *= 919778181;
                            var4 ^= -736153320;
                            long var502 = var4;
                            var10 = var502 + 1L;
                            var10 = var502 * var10;
                            long var503 = var10 & 1L;
                            long var692;
                            var8 = (var692 = var503 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label570;
                            }

                            try {
                                boolean var505 = var479.hasNext();
                                var4 *= -1873584831;
                                var4 ^= -635889833;
                                if (!var505) {
                                    break;
                                }
                            } catch (Throwable var40) {
                                int var90 = aL;
                                int var91 = var90 ^ -572076244;
                                var5 = var40;
                                int var92 = var91 >> 30;
                                int var93 = var92 | -1665546854;
                                int var94 = var93 | 36045952;
                                var4 = var94 ^ 1243758131;
                                Integer var441 = var4;
                                if (var441 == null) {
                                    break label570;
                                }
                                break label623;
                            }

                            var4 *= -393990963;
                            var4 += 694051522;
                            var4 *= 270725207;
                            var4 ^= 968051269;
                            var8 = var4 + 1;
                            var8 = var4 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                break label570;
                            }

                            var4 &= -347557460;
                            var4 &= -678663109;
                            var4 ^= 221943539;
                            var8 = var4 + 1;
                            var8 = var4 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                break label570;
                            }

                            try {
                                var512 = var479.next();
                            } catch (Throwable var39) {
                                int var104 = aL;
                                int var105 = var104 ^ -572076244;
                                var5 = var39;
                                int var106 = var105 >> 30;
                                int var107 = var106 | -1665546854;
                                int var108 = var107 | 36045952;
                                var4 = var108 ^ 1243758131;
                                Integer var442 = var4;
                                if (var442 == null) {
                                    break label570;
                                }
                                break label623;
                            }
                            var4 = switch (var4) {
                                case -868575525 -> {
                                    var4 >>= 25;
                                    var4 -= 564209122;
                                    yield var4 ^ 2042208982;
                                }
                                default -> var4 ^ -490371151;
                                case 1931528208 -> var4 ^ 1266936784;
                            };
                            Integer var520 = var4;
                            if (var520 == null) {
                                break label570;
                            }

                            try {
                                var513 = (HudModule)var512;
                                var4 |= 81184768;
                                var4 *= 502883579;
                                var4 ^= 906881386;
                            } catch (Throwable var38) {
                                int var112 = aL;
                                int var113 = var112 ^ -572076244;
                                var5 = var38;
                                int var114 = var113 >> 30;
                                int var115 = var114 | -1665546854;
                                int var116 = var115 | 36045952;
                                var4 = var116 ^ 1243758131;
                                Integer var443 = var4;
                                if (var443 == null) {
                                    break label570;
                                }
                                break label623;
                            }

                            int var521 = var4 + 1;
                            var521 = var4 * var521;
                            int var572 = var4 + 2;
                            var521 *= var572;
                            int var573 = var4 + 3;
                            var521 *= var573;
                            var521 &= 7;
                            if (var521 != 0) {
                                break label570;
                            }

                            try {
                                var514 = var513;
                            } catch (Throwable var37) {
                                int var120 = aL;
                                int var121 = var120 ^ -572076244;
                                var5 = var37;
                                int var122 = var121 >> 30;
                                int var123 = var122 | -1665546854;
                                int var124 = var123 | 36045952;
                                var4 = var124 ^ 1243758131;
                                Integer var444 = var4;
                                if (var444 == null) {
                                    break label570;
                                }
                                break label623;
                            }
                            var4 = switch (var4) {
                                default -> var4 ^ -545660873;
                                case 1668583775 -> var4 ^ 124118317;
                                case 1838748812 -> {
                                    var4 |= 1006846304;
                                    var4 += -1970507234;
                                    var4 *= 187478691;
                                    var4 <<= 18;
                                    yield var4 ^ -304014520;
                                }
                            };
                            var521 = var4 + 1;
                            var521 = var4 * var521;
                            var521 &= 1;
                            if (var521 != 0) {
                                break label570;
                            }

                            try {
                                var521 = var4 * 1325223077;
                                var521 ^= 1112951225;
                                var521 |= -153019127;
                                var521 += -107014554;
                                var521 ^= 1537576041;
                                var534 = P(var514, var521);
                                var4 |= -155310277;
                                var4 ^= 1942927448;
                                var4 *= 309323247;
                                var4 += -2133892269;
                                var4 ^= 394610332;
                            } catch (Throwable var36) {
                                int var130 = aL;
                                int var131 = var130 ^ -572076244;
                                var5 = var36;
                                int var132 = var131 >> 30;
                                int var133 = var132 | -1665546854;
                                int var134 = var133 | 36045952;
                                var4 = var134 ^ 1243758131;
                                Integer var445 = var4;
                                if (var445 == null) {
                                    break label570;
                                }
                                break label623;
                            }

                            int var574 = var4 + 1;
                            int var575 = var4 * var574;
                            int var11 = var4 + 2;
                            int var576 = var575 * var11;
                            var11 = var4 + 3;
                            int var577 = var576 * var11;
                            int var578 = var577 & 7;
                            if (var578 != 0) {
                                break label570;
                            }

                            label625: {
                                try {
                                    if (!var534) {
                                        break label625;
                                    }
                                } catch (Throwable var45) {
                                    int var140 = aL;
                                    int var141 = var140 ^ -572076244;
                                    var5 = var45;
                                    int var142 = var141 >> 30;
                                    int var143 = var142 | -1665546854;
                                    int var144 = var143 | 36045952;
                                    var4 = var144 ^ 1243758131;
                                    Integer var446 = var4;
                                    if (var446 == null) {
                                        break label570;
                                    }
                                    break label623;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ 1914300306;
                                    case -1503749476 -> {
                                        var4 -= 548596243;
                                        var4 &= -1418054320;
                                        yield var4 ^ -449349015;
                                    }
                                    case -974481216 -> var4 ^ 2117105041;
                                };
                                var521 = var4 + 1;
                                var521 = var4 * var521;
                                int var579 = var4 + 2;
                                var521 *= var579;
                                int var580 = var4 + 3;
                                var521 *= var580;
                                var521 &= 7;
                                if (var521 != 0) {
                                    break label570;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ -1226610262;
                                    case 1679641193 -> {
                                        var4 -= -87248035;
                                        yield var4 ^ 192777504;
                                    }
                                    case 1928743776 -> var4 ^ -1827048338;
                                };
                                Integer var540 = var4;
                                if (var540 == null) {
                                    break label570;
                                }

                                try {
                                    var541 = this.xT;
                                    var4 += -1979391440;
                                    var4 *= 1680906651;
                                    var4 ^= 380991938;
                                } catch (Throwable var35) {
                                    int var150 = aL;
                                    int var151 = var150 ^ -572076244;
                                    var5 = var35;
                                    int var152 = var151 >> 30;
                                    int var153 = var152 | -1665546854;
                                    int var154 = var153 | 36045952;
                                    var4 = var154 ^ 1243758131;
                                    Integer var447 = var4;
                                    if (var447 == null) {
                                        break label570;
                                    }
                                    break label623;
                                }

                                Integer var581 = var4;
                                if (var581 == null) {
                                    break label570;
                                }

                                try {
                                    var542 = var514.HI(var541);
                                } catch (Throwable var34) {
                                    int var158 = aL;
                                    int var159 = var158 ^ -572076244;
                                    var5 = var34;
                                    int var160 = var159 >> 30;
                                    int var161 = var160 | -1665546854;
                                    int var162 = var161 | 36045952;
                                    var4 = var162 ^ 1243758131;
                                    Integer var448 = var4;
                                    if (var448 == null) {
                                        break label570;
                                    }
                                    break label623;
                                }
                                var4 = switch (var4) {
                                    case -2045763217 -> var4 ^ 1291129678;
                                    case 904117878 -> {
                                        var4 *= -1494331285;
                                        yield var4 ^ 569037523;
                                    }
                                    default -> var4 ^ -111214598;
                                };

                                label626: {
                                    try {
                                        if (var542 != var2) {
                                            break label626;
                                        }
                                    } catch (Throwable var44) {
                                        int var165 = aL;
                                        int var166 = var165 ^ -572076244;
                                        var5 = var44;
                                        int var167 = var166 >> 30;
                                        int var168 = var167 | -1665546854;
                                        int var169 = var168 | 36045952;
                                        var4 = var169 ^ 1243758131;
                                        Integer var449 = var4;
                                        if (var449 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }
                                    var4 = switch (var4) {
                                        default -> var4 ^ 2016026170;
                                        case 1719904641 -> {
                                            var4 <<= 7;
                                            var4 |= -602609719;
                                            var4 ^= -2146698397;
                                            yield var4 ^ 836732696;
                                        }
                                        case 2085206417 -> var4 ^ -416859403;
                                    };

                                    try {
                                        var543 = 0;
                                    } catch (Throwable var30) {
                                        int var174 = aL;
                                        int var175 = var174 ^ -572076244;
                                        var5 = var30;
                                        int var176 = var175 >> 30;
                                        int var177 = var176 | -1665546854;
                                        int var178 = var177 | 36045952;
                                        var4 = var178 ^ 1243758131;
                                        Integer var450 = var4;
                                        if (var450 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }
                                    var4 = switch (var4) {
                                        case -1894354645 -> var4 ^ 1420924479;
                                        default -> var4 ^ -472844753;
                                        case 1811979186 -> {
                                            var4 += -578904587;
                                            var4 ^= 906330907;
                                            yield var4 ^ 687308497;
                                        }
                                    };
                                    var10 = var4;
                                    long var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    var10 = var12 & 1L;
                                    long var693;
                                    int var584 = (var693 = var10 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                                    if (var584 != 0) {
                                        break label570;
                                    }

                                    int var544 = var543;
                                    var4 += 1437354220;
                                    var4 *= -2024733403;
                                    var4 ^= -1565536124;
                                    var4 ^= -1072287016;
                                    var4 ^= 753807652;

                                    label537: {
                                        while (true) {
                                            try {
                                                if (var544 >= var440) {
                                                    break;
                                                }
                                            } catch (Throwable var43) {
                                                int var187 = aL;
                                                int var188 = var187 ^ -572076244;
                                                var5 = var43;
                                                int var189 = var188 >> 30;
                                                int var190 = var189 | -1665546854;
                                                int var191 = var190 | 36045952;
                                                var4 = var191 ^ 1243758131;
                                                Integer var451 = var4;
                                                if (var451 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }
                                            var4 = switch (var4) {
                                                default -> var4 ^ 1621461413;
                                                case 496531877 -> {
                                                    var4 |= 60711358;
                                                    var4 += 1487269700;
                                                    yield var4 ^ -1172708522;
                                                }
                                                case 1481693525 -> var4 ^ 1076088343;
                                            };
                                            int var585 = var4 + 1;
                                            int var586 = var4 * var585;
                                            int var587 = var586 & 1;
                                            if (var587 != 0) {
                                                break label570;
                                            }
                                            var4 = switch (var4) {
                                                case -1034057131 -> {
                                                    var4 &= 1324983657;
                                                    yield var4 ^ 820645031;
                                                }
                                                case -485183304 -> var4 ^ 991096250;
                                                default -> var4 ^ -1492397868;
                                            };

                                            try {
                                                var588 = this.nF;
                                            } catch (Throwable var33) {
                                                int var197 = aL;
                                                int var198 = var197 ^ -572076244;
                                                var5 = var33;
                                                int var199 = var198 >> 30;
                                                int var200 = var199 | -1665546854;
                                                int var201 = var200 | 36045952;
                                                var4 = var201 ^ 1243758131;
                                                Integer var452 = var4;
                                                if (var452 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }
                                            var4 = switch (var4) {
                                                case -501885502 -> var4 ^ -1142809160;
                                                default -> var4 ^ 1551214081;
                                                case 1924369638 -> {
                                                    var4 *= -665813517;
                                                    yield var4 ^ -1980106732;
                                                }
                                            };
                                            var11 = var4 + 1;
                                            var11 = var4 * var11;
                                            int var651 = var4 + 2;
                                            var11 *= var651;
                                            int var652 = var4 + 3;
                                            var11 *= var652;
                                            var11 &= 7;
                                            if (var11 != 0) {
                                                break label570;
                                            }

                                            try {
                                                var589 = var588[var544];
                                            } catch (Throwable var32) {
                                                int var204 = aL;
                                                int var205 = var204 ^ -572076244;
                                                var5 = var32;
                                                int var206 = var205 >> 30;
                                                int var207 = var206 | -1665546854;
                                                int var208 = var207 | 36045952;
                                                var4 = var208 ^ 1243758131;
                                                Integer var453 = var4;
                                                if (var453 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }
                                            var4 = switch (var4) {
                                                case -1182351818 -> var4 ^ -764040347;
                                                case 769848390 -> {
                                                    var4 += -528182759;
                                                    var4 *= 936691541;
                                                    var4 ^= 240400732;
                                                    var4 |= 816650736;
                                                    yield var4 ^ 404888222;
                                                }
                                                default -> var4 ^ 1114245939;
                                            };

                                            try {
                                                var11 = var4 >> 21;
                                                var11 |= -1752623108;
                                                var11 *= -504168447;
                                                var11 &= -236160580;
                                                var11 ^= -1461631067;
                                                var590 = F(var589, var514, var11);
                                                var4 &= -1628236655;
                                                var4 ^= 1031982565;
                                            } catch (Throwable var31) {
                                                int var214 = aL;
                                                int var215 = var214 ^ -572076244;
                                                var5 = var31;
                                                int var216 = var215 >> 30;
                                                int var217 = var216 | -1665546854;
                                                int var218 = var217 | 36045952;
                                                var4 = var218 ^ 1243758131;
                                                Integer var454 = var4;
                                                if (var454 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }

                                            Integer var616 = var4;
                                            if (var616 == null) {
                                                break label570;
                                            }

                                            label581: {
                                                try {
                                                    if (!var590) {
                                                        break label581;
                                                    }
                                                } catch (Throwable var42) {
                                                    int var221 = aL;
                                                    int var222 = var221 ^ -572076244;
                                                    var5 = var42;
                                                    int var223 = var222 >> 30;
                                                    int var224 = var223 | -1665546854;
                                                    int var225 = var224 | 36045952;
                                                    var4 = var225 ^ 1243758131;
                                                    Integer var455 = var4;
                                                    if (var455 == null) {
                                                        break label570;
                                                    }
                                                    break label623;
                                                }

                                                var4 *= -958383907;
                                                var4 ^= -837177372;
                                                var4 ^= 1695070218;
                                                var4 *= 2053333933;
                                                var4 ^= -1853170024;
                                                int var591 = var4 + 1;
                                                int var592 = var4 * var591;
                                                int var593 = var592 & 1;
                                                if (var593 != 0) {
                                                    break label570;
                                                }

                                                try {
                                                    var4 &= -1783754037;
                                                    var4 |= -1966613441;
                                                    var4 *= 243983377;
                                                    var4 |= 1140936685;
                                                    var4 ^= 1699892571;
                                                } catch (Throwable var29) {
                                                    int var231 = aL;
                                                    int var232 = var231 ^ -572076244;
                                                    var5 = var29;
                                                    int var233 = var232 >> 30;
                                                    int var234 = var233 | -1665546854;
                                                    int var235 = var234 | 36045952;
                                                    var4 = var235 ^ 1243758131;
                                                    Integer var456 = var4;
                                                    if (var456 == null) {
                                                        break label570;
                                                    }
                                                    break label623;
                                                }

                                                var10 = var4;
                                                var12 = var10 + 1L;
                                                var12 = var10 * var12;
                                                var10 = var12 & 1L;
                                                long var694;
                                                int var596 = (var694 = var10 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                                                if (var596 != 0) {
                                                    break label570;
                                                }

                                                try {
                                                    int var597 = var4 + 1630428146;
                                                    int var598 = var597 ^ 1049994970;
                                                    this.f(var1, var440, var598);
                                                    var4 &= 92300759;
                                                    var4 >>= 27;
                                                    var4 ^= -2063916087;
                                                } catch (Throwable var28) {
                                                    int var241 = aL;
                                                    int var242 = var241 ^ -572076244;
                                                    var5 = var28;
                                                    int var243 = var242 >> 30;
                                                    int var244 = var243 | -1665546854;
                                                    int var245 = var244 | 36045952;
                                                    var4 = var245 ^ 1243758131;
                                                    Integer var457 = var4;
                                                    if (var457 == null) {
                                                        break label570;
                                                    }
                                                    break label623;
                                                }

                                                Integer var599 = var4;
                                                if (var599 == null) {
                                                    break label570;
                                                }

                                                try {
                                                    var600 = 0;
                                                    var4 |= -1884591190;
                                                    var4 |= 1497585823;
                                                    var4 -= 1746975193;
                                                    var4 ^= 1203441100;
                                                } catch (Throwable var27) {
                                                    int var249 = aL;
                                                    int var250 = var249 ^ -572076244;
                                                    var5 = var27;
                                                    int var251 = var250 >> 30;
                                                    int var252 = var251 | -1665546854;
                                                    int var253 = var252 | 36045952;
                                                    var4 = var253 ^ 1243758131;
                                                    Integer var458 = var4;
                                                    if (var458 == null) {
                                                        break label570;
                                                    }
                                                    break label623;
                                                }

                                                long var617 = var4;
                                                long var13 = var617 + 1L;
                                                var13 = var617 * var13;
                                                long var618 = var13 & 1L;
                                                long var695;
                                                int var619 = (var695 = var618 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
                                                if (var619 != 0) {
                                                    break label570;
                                                }

                                                var601 = var600;
                                                switch (var4) {
                                                    case -1785710378:
                                                    default:
                                                        var4 ^= 67269886;
                                                        break label537;
                                                    case 811716586:
                                                        var4 *= 1865942817;
                                                        var4 ^= -872900787;
                                                        break label537;
                                                    case 1441246841:
                                                        var4 ^= -1745087261;
                                                        break label537;
                                                }
                                            }

                                            var4 |= -1717497070;
                                            var4 &= -2011622715;
                                            var4 &= -141072035;
                                            var4 |= -1758250607;
                                            var4 ^= 124538384;
                                            long var620 = var4;
                                            long var669 = var620 + 1L;
                                            var669 = var620 * var669;
                                            long var15 = var620 + 2L;
                                            var669 *= var15;
                                            long var621 = var620 + 3L;
                                            var669 *= var621;
                                            long var622 = var669 & 7L;
                                            long var696;
                                            int var623 = (var696 = var622 - 0L) == 0L ? 0 : (var696 < 0L ? -1 : 1);
                                            if (var623 != 0) {
                                                break label570;
                                            }

                                            var623 = var544 + 1;
                                            var4 += 877457122;
                                            var4 *= 380837489;
                                            var4 ^= -1020906165;
                                            var12 = var4;
                                            long var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            var12 = var14 & 1L;
                                            long var697;
                                            int var657 = (var697 = var12 - 0L) == 0L ? 0 : (var697 < 0L ? -1 : 1);
                                            if (var657 != 0) {
                                                break label570;
                                            }

                                            var544 = var623;
                                            var4 |= 2045341148;
                                            var4 += 433984589;
                                            var4 -= 981984514;
                                            var4 ^= -1025878814;
                                        }

                                        var4 >>= 29;
                                        var4 -= -646308957;
                                        var4 &= -205904100;
                                        var4 ^= 716733746;
                                        var601 = var440;
                                        var4 += 502049453;
                                        var4 *= 308047507;
                                        var4 -= -1789656381;
                                        var4 ^= 332065177;
                                    }

                                    var544 = var4 + 1;
                                    var544 = var4 * var544;
                                    var11 = var4 + 2;
                                    var544 *= var11;
                                    var11 = var4 + 3;
                                    var544 *= var11;
                                    var544 &= 7;
                                    if (var544 != 0) {
                                        break label570;
                                    }
                                    var4 = switch (var4) {
                                        default -> var4 ^ 351117973;
                                        case 293839975 -> {
                                            var4 |= -437919418;
                                            yield var4 ^ 1414255708;
                                        }
                                        case 1853051579 -> var4 ^ -39734449;
                                    };
                                    long var627 = var4;
                                    long var673 = var627 + 1L;
                                    var673 = var627 * var673;
                                    long var628 = var673 & 1L;
                                    long var698;
                                    var544 = (var698 = var628 - 0L) == 0L ? 0 : (var698 < 0L ? -1 : 1);
                                    if (var544 != 0) {
                                        break label570;
                                    }

                                    try {
                                        var551 = this.nF;
                                        var4 *= -354157039;
                                        var4 ^= 928327500;
                                    } catch (Throwable var26) {
                                        int var280 = aL;
                                        int var281 = var280 ^ -572076244;
                                        var5 = var26;
                                        int var282 = var281 >> 30;
                                        int var283 = var282 | -1665546854;
                                        int var284 = var283 | 36045952;
                                        var4 = var284 ^ 1243758131;
                                        Integer var459 = var4;
                                        if (var459 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }

                                    var11 = var4 + 1;
                                    var11 = var4 * var11;
                                    int var658 = var4 + 2;
                                    var11 *= var658;
                                    int var659 = var4 + 3;
                                    var11 *= var659;
                                    var11 &= 7;
                                    if (var11 != 0) {
                                        break label570;
                                    }

                                    try {
                                        var544 = var551.length;
                                    } catch (Throwable var25) {
                                        int var287 = aL;
                                        int var288 = var287 ^ -572076244;
                                        var5 = var25;
                                        int var289 = var288 >> 30;
                                        int var290 = var289 | -1665546854;
                                        int var291 = var290 | 36045952;
                                        var4 = var291 ^ 1243758131;
                                        Integer var460 = var4;
                                        if (var460 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }
                                    var4 = switch (var4) {
                                        case 210507571 -> var4 ^ 1428639325;
                                        case 500033959 -> {
                                            var4 |= -897914406;
                                            var4 &= -1046988042;
                                            var4 += 1491450868;
                                            var4 *= -355326411;
                                            yield var4 ^ 1273354397;
                                        }
                                        default -> var4 ^ 627071209;
                                    };
                                    long var634 = var4;
                                    var673 = var634 + 1L;
                                    var673 = var634 * var673;
                                    long var635 = var673 & 1L;
                                    long var699;
                                    var11 = (var699 = var635 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
                                    if (var11 != 0) {
                                        break label570;
                                    }

                                    label521: {
                                        label628: {
                                            try {
                                                if (var601 != var544) {
                                                    break label628;
                                                }
                                            } catch (Throwable var41) {
                                                int var297 = aL;
                                                int var298 = var297 ^ -572076244;
                                                var5 = var41;
                                                int var299 = var298 >> 30;
                                                int var300 = var299 | -1665546854;
                                                int var301 = var300 | 36045952;
                                                var4 = var301 ^ 1243758131;
                                                Integer var461 = var4;
                                                if (var461 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }

                                            var4 *= -1143540287;
                                            var4 += 1769012312;
                                            var4 ^= -1918152996;
                                            var544 = var4 + 1;
                                            var544 = var4 * var544;
                                            var11 = var4 + 2;
                                            var544 *= var11;
                                            var11 = var4 + 3;
                                            var544 *= var11;
                                            var544 &= 7;
                                            if (var544 != 0) {
                                                break label570;
                                            }

                                            try {
                                                var4 &= 613744356;
                                                var4 ^= -302411200;
                                            } catch (Throwable var24) {
                                                int var305 = aL;
                                                int var306 = var305 ^ -572076244;
                                                var5 = var24;
                                                int var307 = var306 >> 30;
                                                int var308 = var307 | -1665546854;
                                                int var309 = var308 | 36045952;
                                                var4 = var309 ^ 1243758131;
                                                Integer var462 = var4;
                                                if (var462 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }

                                            Integer var558 = var4;
                                            if (var558 == null) {
                                                break label570;
                                            }

                                            try {
                                                var559 = this.nF;
                                                var4 *= 1855705593;
                                                var4 &= 1633502733;
                                                var4 ^= 841003830;
                                                var11 = var601 * 2;
                                                var4 |= -643607540;
                                                var4 >>= 23;
                                                var4 |= -1719095242;
                                                var4 ^= -1059914347;
                                            } catch (Throwable var23) {
                                                int var312 = aL;
                                                int var313 = var312 ^ -572076244;
                                                var5 = var23;
                                                int var314 = var313 >> 30;
                                                int var315 = var314 | -1665546854;
                                                int var316 = var315 | 36045952;
                                                var4 = var316 ^ 1243758131;
                                                Integer var463 = var4;
                                                if (var463 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }

                                            int var660 = var4 + 1;
                                            int var661 = var4 * var660;
                                            int var677 = var4 + 2;
                                            int var662 = var661 * var677;
                                            int var678 = var4 + 3;
                                            int var663 = var662 * var678;
                                            int var664 = var663 & 7;
                                            if (var664 != 0) {
                                                break label570;
                                            }

                                            HudModule[] var558_arr = null;
                                            try {
                                                var558_arr = Arrays.copyOf(var559, var11);
                                            } catch (Throwable var22) {
                                                int var324 = aL;
                                                int var325 = var324 ^ -572076244;
                                                var5 = var22;
                                                int var326 = var325 >> 30;
                                                int var327 = var326 | -1665546854;
                                                int var328 = var327 | 36045952;
                                                var4 = var328 ^ 1243758131;
                                                Integer var464 = var4;
                                                if (var464 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }
                                            var4 = switch (var4) {
                                                default -> var4 ^ 1409175447;
                                                case 319526780 -> var4 ^ 1270487434;
                                                case 1059914274 -> {
                                                    var4 -= 254897814;
                                                    var4 ^= -264452350;
                                                    var4 *= 533173033;
                                                    yield var4 ^ 607660691;
                                                }
                                            };
                                            Integer var640 = var4;
                                            if (var640 == null) {
                                                break label570;
                                            }

                                            try {
                                                HudModule[] var561 = var558_arr;
                                                var4 ^= -1885839775;
                                                var4 ^= -1447556762;
                                                var4 ^= -445956161;
                                                var4 ^= -1641992388;
                                                this.nF = var561;
                                                var4 *= 1214241995;
                                                var4 += 372163970;
                                                var4 ^= -606998576;
                                                var4 <<= 5;
                                                var4 ^= 393982012;
                                                break label521;
                                            } catch (Throwable var21) {
                                                int var333 = aL;
                                                int var334 = var333 ^ -572076244;
                                                var5 = var21;
                                                int var335 = var334 >> 30;
                                                int var336 = var335 | -1665546854;
                                                int var337 = var336 | 36045952;
                                                var4 = var337 ^ 1243758131;
                                                Integer var465 = var4;
                                                if (var465 == null) {
                                                    break label570;
                                                }
                                                break label623;
                                            }
                                        }

                                        switch (var4) {
                                            case -1675953937:
                                                var4 >>= 3;
                                                var4 &= -145102025;
                                                var4 -= 685459599;
                                                var4 |= 1414448355;
                                                var4 ^= -1098392453;
                                                break;
                                            case 454465326:
                                            default:
                                                var4 ^= -1942405407;
                                                break;
                                            case 1329126447:
                                                var4 ^= 1894466405;
                                        }
                                    }

                                    long var641 = var4;
                                    var673 = var641 + 1L;
                                    var673 = var641 * var673;
                                    long var688 = var641 + 2L;
                                    var673 *= var688;
                                    long var642 = var641 + 3L;
                                    var673 *= var642;
                                    long var643 = var673 & 7L;
                                    long var700;
                                    var544 = (var700 = var643 - 0L) == 0L ? 0 : (var700 < 0L ? -1 : 1);
                                    if (var544 != 0) {
                                        break label570;
                                    }
                                    var4 = switch (var4) {
                                        case -1737174048 -> var4 ^ -1250706439;
                                        case 1625889436 -> {
                                            var4 |= 2035749612;
                                            var4 *= 9724099;
                                            var4 &= 1347148824;
                                            var4 ^= 1409512827;
                                            yield var4 ^ 2115581044;
                                        }
                                        default -> var4 ^ 1878762824;
                                    };

                                    try {
                                        var563 = this.nF;
                                        var4 *= -1974344101;
                                        var4 ^= 551609281;
                                    } catch (Throwable var20) {
                                        int var356 = aL;
                                        int var357 = var356 ^ -572076244;
                                        var5 = var20;
                                        int var358 = var357 >> 30;
                                        int var359 = var358 | -1665546854;
                                        int var360 = var359 | 36045952;
                                        var4 = var360 ^ 1243758131;
                                        Integer var466 = var4;
                                        if (var466 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }

                                    long var644 = var4;
                                    var673 = var644 + 1L;
                                    var673 = var644 * var673;
                                    var688 = var644 + 2L;
                                    var673 *= var688;
                                    long var645 = var644 + 3L;
                                    var673 *= var645;
                                    long var646 = var673 & 7L;
                                    long var701;
                                    var11 = (var701 = var646 - 0L) == 0L ? 0 : (var701 < 0L ? -1 : 1);
                                    if (var11 != 0) {
                                        break label570;
                                    }

                                    try {
                                        var11 = var601 + 1;
                                        var602 = var601;
                                        var11 = var11;
                                        var4 *= -93210829;
                                        var4 ^= 680540191;
                                    } catch (Throwable var19) {
                                        int var363 = aL;
                                        int var364 = var363 ^ -572076244;
                                        var5 = var19;
                                        int var365 = var364 >> 30;
                                        int var366 = var365 | -1665546854;
                                        int var367 = var366 | 36045952;
                                        var4 = var367 ^ 1243758131;
                                        Integer var467 = var4;
                                        if (var467 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }

                                    int var665 = var4 + 1;
                                    int var666 = var4 * var665;
                                    int var667 = var666 & 1;
                                    if (var667 != 0) {
                                        break label570;
                                    }

                                    try {
                                        var563[var602] = var514;
                                        var4 -= -1349195454;
                                        var4 *= -1426729155;
                                        var4 |= -1037090268;
                                        var4 &= -1179421701;
                                        var4 ^= 1138946097;
                                    } catch (Throwable var18) {
                                        int var370 = aL;
                                        int var371 = var370 ^ -572076244;
                                        var5 = var18;
                                        int var372 = var371 >> 30;
                                        int var373 = var372 | -1665546854;
                                        int var374 = var373 | 36045952;
                                        var4 = var374 ^ 1243758131;
                                        Integer var468 = var4;
                                        if (var468 == null) {
                                            break label570;
                                        }
                                        break label623;
                                    }

                                    Integer var515 = var4;
                                    if (var515 == null) {
                                        break label570;
                                    }

                                    var440 = var11;
                                    switch (var4) {
                                        case -1930461796:
                                        default:
                                            var4 ^= 488178278;
                                            continue;
                                        case -473853224:
                                            var4 += 366870815;
                                            var4 ^= -1581298821;
                                            continue;
                                        case 1246107277:
                                            var4 ^= 348865404;
                                            continue;
                                    }
                                }

                                var4 |= -1899681882;
                                var4 ^= 2121525959;
                                var4 += -1322996335;
                                var4 ^= 2115330193;
                                int var564 = var4 + 1;
                                var564 = var4 * var564;
                                int var603 = var4 + 2;
                                var564 *= var603;
                                int var604 = var4 + 3;
                                var564 *= var604;
                                var564 &= 7;
                                if (var564 != 0) {
                                    break label570;
                                }

                                var440 = var440;
                                var4 &= -927616022;
                                var4 *= -2096481079;
                                var4 >>>= 9;
                                var4 += -1252871258;
                                var4 ^= -308350384;
                                continue;
                            }

                            var4 *= -1307428075;
                            var4 ^= 955052995;
                            var4 ^= 1916100419;
                            Integer var516 = var4;
                            if (var516 == null) {
                                break label570;
                            }

                            var440 = var440;
                            switch (var4) {
                                case -2138763700:
                                    var4 >>= 9;
                                    var4 -= -1792150837;
                                    var4 ^= 850564912;
                                    break;
                                case -1558597710:
                                default:
                                    var4 ^= 665112208;
                                    break;
                                case 828185045:
                                    var4 ^= -286057544;
                            }
                        }
                        var4 = switch (var4) {
                            case -185448973 -> {
                                var4 *= 1036860397;
                                yield var4 ^ 1210024002;
                            }
                            case 487462890 -> var4 ^ 709560098;
                            default -> var4 ^ 1465165174;
                        };

                        var4 = switch (var4) {
                            case -853589323 -> {
                                var4 ^= -354038606;
                                var4 += 346145821;
                                yield var4 ^ 375569364;
                            }
                            case -31835747 -> var4 ^ -1063139725;
                            default -> var4 ^ 1861701053;
                        };

                        try {
                            var7 = var4 - 1436468296;
                            var7 <<= 16;
                            var7 &= -1255508953;
                            var7 ^= 118449724;
                            var7 ^= 352788032;
                            this.f(var1, var440, var7);
                            break label568;
                        } catch (Throwable var17) {
                            int var399 = aL;
                            int var400 = var399 ^ -572076244;
                            var5 = var17;
                            int var401 = var400 >> 30;
                            int var402 = var401 | -1665546854;
                            int var403 = var402 | 36045952;
                            var4 = var403 ^ 1243758131;
                            Integer var469 = var4;
                            if (var469 == null) {
                                break label570;
                            }
                        }
                    }

                    this.c = null;
                    HudModule[] var470 = this.nF;
                    var4 ^= 1563300142;
                    var4 |= -1234275159;
                    var4 &= 666959361;
                    var4 ^= 154367429;
                    Integer var480 = var4;
                    if (var480 != null) {
                        Arrays.fill(var470, null);
                        throw UncheckedExceptions.rethrow(var5);
                    }
                    break label570;
                }
                var4 = switch (var4) {
                    case -1633591071 -> var4 ^ -1983260;
                    case 721349104 -> {
                        var4 ^= 886854368;
                        var4 &= 2045705328;
                        var4 += -556806638;
                        var4 -= 481177828;
                        yield var4 ^ -1384645001;
                    }
                    default -> var4 ^ -1453952396;
                };
                int var421 = var4 + 1;
                int var422 = var4 * var421;
                int var471 = var4 + 2;
                int var423 = var422 * var471;
                int var472 = var4 + 3;
                int var424 = var423 * var472;
                int var425 = var424 & 7;
                if (var425 == 0) {
                    this.c = null;
                    var4 *= 2140539929;
                    var4 >>= 19;
                    var4 ^= -1475389371;
                    int var426 = var4 + 1;
                    int var427 = var4 * var426;
                    int var428 = var427 & 1;
                    if (var428 == 0) {
                        Arrays.fill(this.nF, null);

                        var4 *= -1769832121;
                        var4 -= 1640274869;
                        var4 ^= -114918830;
                        return;
                    }
                }
            }
        }

        IllegalArgumentException var419 = new IllegalArgumentException();
        throw var419;
    }

    private void f(Canvas var1, int var2, int var3) {
        label191: {
            int var5 = var2;
            int var6 = System.identityHashCode(this);
            int var7 = 0;
            Integer var8 = var6;
            if (var8 == null) {
                int var4 = var3 << 24;
                var4 ^= 904604886;
                var4 ^= -900835104;
                var4 ^= -938703553;
            } else {
                int var19 = var3 ^ 383702523;
                var19 *= -15461091;
                var19 += -332457512;
                var19 += -1255025386;
                var19 ^= -181112580;
                var7 = var7;
                var19 -= 1663790564;
                var19 ^= 1762624717;

                label188:
                while (true) {
                    long var172 = var5;
                    long var10 = var172 + 1L;
                    var10 = var172 * var10;
                    long var173 = var10 & 1L;
                    long var297;
                    int var174 = (var297 = var173 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                    if (var174 != 0) {
                        break label191;
                    }

                    if (var7 >= var2) {
                        var19 ^= -1277434077;
                        var19 += -1337234776;
                        var19 |= 658744953;
                        var19 &= -596888488;
                        var19 ^= 968598743;
                        int var165 = 0;
                        long var196 = var6;
                        long var270 = var196 + 1L;
                        var270 = var196 * var270;
                        var196 = var270 & 1L;
                        long var298;
                        int var198 = (var298 = var196 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                        if (var198 == 0) {
                            var19 >>>= 2;
                            var19 ^= -1582258175;
                            var165 = var165;
                            var19 *= -1526476733;
                            var19 |= -522753779;
                            var19 ^= 829343789;

                            while (var165 < var2) {
                                var19 -= 655531639;
                                var19 ^= 457782256;
                                Integer var199 = var5;
                                if (var199 == null) {
                                    break label191;
                                }

                                HudModule[] var200 = this.nF;
                                HudModule var201 = var200[var165];
                                int var249 = var19 ^ -99688371;
                                int var250 = var249 - -524492857;
                                int var251 = var250 ^ -745386829;
                                c(var1, var201, var251);
                                HudModule[] var202 = this.nF;
                                var10 = var6;
                                long var284 = var10 + 1L;
                                var284 = var10 * var284;
                                long var14 = var10 + 2L;
                                var284 *= var14;
                                var10 += 3L;
                                var284 *= var10;
                                var10 = var284 & 7L;
                                long var299;
                                int var255 = (var299 = var10 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                if (var255 != 0) {
                                    var19 &= 605355103;
                                    var19 *= 22263201;
                                    var19 *= -1026158787;
                                    var19 -= 348409419;
                                    var19 ^= 621387917;
                                    break label188;
                                }

                                var19 *= -1948189377;
                                var19 ^= 1907885918;
                                var10 = var5;
                                var284 = var10 + 1L;
                                var284 = var10 * var284;
                                var10 = var284 & 1L;
                                long var300;
                                int var258 = (var300 = var10 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                                if (var258 != 0) {
                                    break label191;
                                }

                                HudModule var203 = var202[var165];
                                hr var259 = this.s;
                                lH_3 var272 = this.xT;
                                var203.BO(var259, var272);
                                var1.restore();
                                int var204 = var165 + 1;
                                var165 = var204;
                                var19 |= -2122088165;
                                var19 ^= 1400564377;
                            }

                            var19 |= 110325533;
                            var19 &= -196291640;
                            var19 += -1416147193;
                            var19 >>>= 7;
                            var19 ^= -154218804;
                            var165 = var5 + 1;
                            var165 = var5 * var165;
                            var165 &= 1;
                            if (var165 != 0) {
                                break label191;
                            }

                            int var170 = 0;
                            var196 = var6;
                            var270 = var196 + 1L;
                            var270 = var196 * var270;
                            long var295 = var196 + 2L;
                            var270 *= var295;
                            var196 += 3L;
                            var270 *= var196;
                            var196 = var270 & 7L;
                            long var301;
                            int var208 = (var301 = var196 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                            if (var208 == 0) {
                                var19 *= 1756626295;
                                var19 *= -1810083709;
                                var19 ^= -2056834631;
                                var19 ^= -1295742757;
                                var196 = var5;
                                var270 = var196 + 1L;
                                var270 = var196 * var270;
                                var196 = var270 & 1L;
                                long var302;
                                int var211 = (var302 = var196 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                                if (var211 != 0) {
                                    break label191;
                                }

                                var170 = var170;

                                var19 = switch (var19) {
                                    case -657722172 -> var19 ^ -652774823;
                                    default -> var19 ^ 1992993146;
                                    case 1025095951 -> {
                                        var19 -= 1307640557;
                                        var19 ^= -723099965;
                                        yield var19 ^ 1088378357;
                                    }
                                };

                                while (true) {
                                    var196 = var5;
                                    var270 = var196 + 1L;
                                    var270 = var196 * var270;
                                    var196 = var270 & 1L;
                                    long var303;
                                    int var214 = (var303 = var196 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                                    if (var214 != 0) {
                                        break label191;
                                    }

                                    if (var170 >= var2) {
                                        var19 ^= -532855596;
                                        var19 ^= -1071200102;
                                        return;
                                    }

                                    var19 <<= 7;
                                    var19 ^= 607610314;
                                    HudModule[] var215 = this.nF;
                                    HudModule var216 = var215[var170];
                                    int var217 = var19 * -567052013;
                                    int var218 = var217 * 989081871;
                                    int var219 = var218 * -698683477;
                                    int var220 = var219 >> 29;
                                    int var221 = var220 ^ 1550435939;
                                    c(var1, var216, var221);
                                    hr var222 = this.k;
                                    lH_3 var260 = this.xT;
                                    var216.BO(var222, var260);
                                    lH_3 var223 = this.xT;
                                    var10 = var6;
                                    long var290 = var10 + 1L;
                                    var290 = var10 * var290;
                                    long var296 = var10 + 2L;
                                    var290 *= var296;
                                    var10 += 3L;
                                    var290 *= var10;
                                    var10 = var290 & 7L;
                                    long var304;
                                    int var264 = (var304 = var10 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                                    if (var264 != 0) {
                                        var19 -= -591178925;
                                        var19 &= 1410999573;
                                        var19 ^= 464254236;
                                        break label188;
                                    }

                                    var19 >>= 11;
                                    var19 <<= 27;
                                    var19 ^= 842330971;
                                    Integer var265 = var5;
                                    if (var265 == null) {
                                        break label191;
                                    }

                                    var216.G(var1, var223);
                                    var1.restore();
                                    var174 = var170 + 1;
                                    var170 = var174;
                                    switch (var19) {
                                        case -899455230:
                                            var19 ^= 1135567194;
                                            break;
                                        case -634064037:
                                            var19 >>= 20;
                                            var19 |= 369482835;
                                            var19 += -670326190;
                                            var19 |= -1052373187;
                                            var19 ^= -1570893207;
                                            break;
                                        case 2086740908:
                                        default:
                                            var19 ^= -1545485540;
                                    }
                                }
                            } else {
                                switch (var19) {
                                    case -164498967:
                                        var19 >>= 3;
                                        var19 |= 1463476771;
                                        var19 ^= -1269362890;
                                        break label188;
                                    case -11996145:
                                        var19 ^= -487458443;
                                        break label188;
                                    case 663779642:
                                    default:
                                        var19 ^= -1413769500;
                                }
                            }
                        } else {
                            var19 >>>= 7;
                            var19 ^= 1788200822;
                            var19 *= 1771055387;
                            var19 &= 595208326;
                            var19 ^= 1756100877;
                        }
                        break;
                    }

                    var19 &= 1591877150;
                    var19 += 20738008;
                    var19 |= 1351149287;
                    var19 ^= -655788436;
                    long var175 = var5;
                    var10 = var175 + 1L;
                    var10 = var175 * var10;
                    long var176 = var10 & 1L;
                    long var305;
                    var174 = (var305 = var176 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                    if (var174 != 0) {
                        break label191;
                    }

                    HudModule[] var178 = this.nF;
                    HudModule var179 = var178[var7];
                    int var9 = var19 << 16;
                    var9 |= -1670757041;
                    var9 -= 1008958016;
                    var9 ^= -1034816877;
                    c(var1, var179, var9);
                    XF var186 = var179.PN;
                    float var187 = var186.bs();
                    lH_3 var227 = this.xT;
                    Integer var11 = var6;
                    if (var11 == null) {
                        switch (var19) {
                            case -1890221685:
                                var19 &= -1741818559;
                                var19 *= 1538160033;
                                var19 *= 601037843;
                                var19 ^= -1732560646;
                                break label188;
                            case -1079746372:
                                var19 ^= 769835330;
                                break label188;
                            case 970588474:
                            default:
                                var19 ^= 771298868;
                                break label188;
                        }
                    }

                    var19 += 967101527;
                    var19 ^= 1525620504;
                    var19 ^= -585748344;
                    boolean var228 = var227.J;
                    if (var228) {
                        var19 ^= 1646847194;
                        var19 += -1031304439;
                        var19 -= 1205635294;
                        var19 ^= -2102647105;
                        int var229 = var5 + 1;
                        int var230 = var5 * var229;
                        int var231 = var230 & 1;
                        if (var231 != 0) {
                            break label191;
                        }

                        float var306;
                        int var232 = (var306 = var187 - 0.01F) == 0.0F ? 0 : (var306 < 0.0F ? -1 : 1);
                        var11 = var6;
                        if (var11 == null) {
                            var19 *= -483645299;
                            var19 ^= -976551819;
                            break;
                        }

                        var19 -= -1493541009;
                        var19 >>>= 11;
                        var19 += 2026770674;
                        var19 *= -672612583;
                        var19 ^= -1667703334;
                        if (var232 > 0) {
                            var19 ^= 1767269257;
                            var19 -= 326367744;
                            var19 ^= 1601636492;
                            var19 *= -258357511;
                            var19 ^= -450542908;
                            boolean var233 = var179.jV();
                            long var267 = var6;
                            long var13 = var267 + 1L;
                            var13 = var267 * var13;
                            long var268 = var13 & 1L;
                            long var307;
                            int var269 = (var307 = var268 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
                            if (var269 != 0) {
                                var19 *= 1202628491;
                                var19 *= 1463384537;
                                var19 *= 42501275;
                                var19 &= -1184232963;
                                var19 ^= 2062152113;
                                break;
                            }

                            var19 <<= 3;
                            var19 *= 1018587347;
                            var19 ^= -573214528;
                            var19 ^= -1698430700;
                            if (var233) {
                                var19 += -446174033;
                                var19 -= 78691678;
                                var19 |= 1252873938;
                                var19 ^= 1538993904;
                                Integer var234 = var5;
                                if (var234 == null) {
                                    break label191;
                                }

                                lH_3 var235 = this.xT;
                                Oo var236 = var235.Y;
                                int var237 = var236.E();
                                float var188 = 0.38F * var187;
                                var9 = DP.Y(var237, var188);
                                this.T = var9;
                                hr var190 = this.S;
                                int var238 = var6 + 1;
                                int var239 = var6 * var238;
                                int var240 = var239 & 1;
                                if (var240 != 0) {
                                    switch (var19) {
                                        case -2142842617:
                                            var19 >>= 8;
                                            var19 >>= 4;
                                            var19 *= -1105896749;
                                            var19 ^= 641926878;
                                            break label188;
                                        case -252047374:
                                        default:
                                            var19 ^= -1756160651;
                                            break label188;
                                        case 10297105:
                                            var19 ^= 379995310;
                                            break label188;
                                    }
                                }

                                var19 *= -908936605;
                                var19 <<= 3;
                                var19 ^= -518843372;
                                var19 ^= 806264833;
                                lH_3 var241 = this.xT;
                                var179.BO(var190, var241);
                                var19 >>= 20;
                                var19 ^= 59059038;
                            } else {
                                var19 += -220395832;
                                var19 += 554369647;
                                var19 ^= 829702523;
                            }
                        } else {
                            var19 |= -929619237;
                            var19 *= -1691658455;
                            var19 -= -977939328;
                            var19 ^= 1940142371;
                        }
                    } else {
                        var19 ^= -179558176;
                        var19 *= -1575714867;
                        var19 *= -962826619;
                        var19 ^= -503681758;
                    }

                    var9 = var5 + 1;
                    var9 = var5 * var9;
                    var9 &= 1;
                    if (var9 != 0) {
                        break label191;
                    }

                    hr var194 = this.Vc;
                    var10 = var6;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var308;
                    int var244 = (var308 = var10 - 0L) == 0L ? 0 : (var308 < 0L ? -1 : 1);
                    if (var244 != 0) {
                        var19 |= -1345720882;
                        var19 |= 444423916;
                        var19 ^= -1269428489;
                        break;
                    }

                    var19 -= -2015289306;
                    var19 -= -1140148935;
                    var19 ^= 292890972;
                    var19 ^= -1690129982;
                    var19 ^= 1493380013;
                    var10 = var5;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var309;
                    int var247 = (var309 = var10 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                    if (var247 != 0) {
                        break label191;
                    }

                    lH_3 var248 = this.xT;
                    var179.BO(var194, var248);
                    var1.restore();
                    var9 = var7 + 1;
                    var7 = var9;
                    var19 -= -1867657667;
                    var19 >>= 21;
                    var19 ^= -1174726924;
                }
            }

            long var154 = var5;
            long var160 = var154 + 1L;
            long var161 = var154 * var160;
            long var182 = var154 + 2L;
            long var162 = var161 * var182;
            var154 += 3L;
            long var163 = var162 * var154;
            var154 = var163 & 7L;
            long var310;
            int var157 = (var310 = var154 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
            if (var157 == 0) {
                IllegalStateException var158 = new IllegalStateException();
                throw var158;
            }
        }

        IllegalArgumentException var159 = new IllegalArgumentException();
        throw var159;
    }

    private static boolean F(HudModule var0, HudModule var1, int var2) {
        label115: {
            int var4 = System.identityHashCode(var0);
            float var5 = var0.Au;
            float var6 = var1.gd;
            Integer var7 = var4;
            if (var7 == null) {
                int var70 = var2 | 250750608;
                var70 ^= 876364973;
            } else {
                label114: {
                    int var3 = var2 ^ 329938836;
                    var3 &= 1489087231;
                    var3 ^= 1292098097;
                    int var119 = var3 + 1;
                    var119 = var3 * var119;
                    int var8 = var3 + 2;
                    var119 *= var8;
                    var8 = var3 + 3;
                    var119 *= var8;
                    var119 &= 7;
                    if (var119 != 0) {
                        break label115;
                    }

                    float var143;
                    int var81 = (var143 = var5 - var6) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
                    if (var81 < 0) {
                        var3 -= 283546316;
                        var3 -= -24411217;
                        var3 -= -115473915;
                        var3 &= 1729138549;
                        var3 ^= -1747434401;
                        int var82 = var3 + 1;
                        int var83 = var3 * var82;
                        int var84 = var83 & 1;
                        if (var84 != 0) {
                            break label115;
                        }

                        var5 = var1.Au;
                        long var102 = var4;
                        long var133 = var102 + 1L;
                        long var134 = var102 * var133;
                        long var10 = var102 + 2L;
                        long var135 = var134 * var10;
                        long var103 = var102 + 3L;
                        long var136 = var135 * var103;
                        long var104 = var136 & 7L;
                        long var144;
                        int var105 = (var144 = var104 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                        if (var105 != 0) {
                            var3 += 2055411703;
                            var3 |= -226257735;
                            var3 ^= 335842511;
                            break label114;
                        }

                        var3 |= 1838801324;
                        var3 ^= 1561805261;
                        int var106 = var3 + 1;
                        int var107 = var3 * var106;
                        int var108 = var107 & 1;
                        if (var108 != 0) {
                            break label115;
                        }

                        var6 = var0.gd;
                        float var145;
                        int var86 = (var145 = var5 - var6) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                        if (var86 < 0) {
                            var3 -= -1617714373;
                            var3 -= 626983749;
                            var3 |= -286314210;
                            var3 ^= 1988543796;
                            long var87 = var3;
                            long var124 = var87 + 1L;
                            long var125 = var87 * var124;
                            long var88 = var125 & 1L;
                            long var146;
                            int var89 = (var146 = var88 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                            if (var89 != 0) {
                                break label115;
                            }

                            var5 = var0.eU;
                            int var110 = var4 + 1;
                            int var111 = var4 * var110;
                            int var112 = var111 & 1;
                            if (var112 != 0) {
                                switch (var3) {
                                    case -1988496758:
                                        var3 *= -1799725373;
                                        var3 *= 32305437;
                                        var3 ^= 1801853522;
                                        break label114;
                                    case 1933954465:
                                    default:
                                        var3 ^= -1653621998;
                                        break label114;
                                    case 2077744533:
                                        var3 ^= 2075397758;
                                        break label114;
                                }
                            }

                            var3 -= -1377310896;
                            var3 &= 1586426915;
                            var3 ^= -322248173;
                            long var113 = var3;
                            long var137 = var113 + 1L;
                            long var138 = var113 * var137;
                            var10 = var113 + 2L;
                            long var139 = var138 * var10;
                            long var114 = var113 + 3L;
                            long var140 = var139 * var114;
                            long var115 = var140 & 7L;
                            long var147;
                            int var116 = (var147 = var115 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                break label115;
                            }

                            var6 = var1.CW;
                            float var148;
                            int var91 = (var148 = var5 - var6) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
                            if (var91 < 0) {
                                var3 *= 1114148057;
                                var3 ^= 1985306494;
                                int var92 = var3 + 1;
                                int var93 = var3 * var92;
                                int var94 = var93 & 1;
                                if (var94 != 0) {
                                    break label115;
                                }

                                var5 = var1.eU;
                                var6 = var0.CW;
                                var119 = var4 + 1;
                                var119 = var4 * var119;
                                var4 = var119 & 1;
                                if (var4 != 0) {
                                    var3 >>>= 28;
                                    var3 >>>= 21;
                                    var3 ^= -355501516;
                                    break label114;
                                }

                                var3 |= 2112085391;
                                var3 <<= 22;
                                var3 |= -143894411;
                                var3 ^= -1543761790;
                                long var128 = var3;
                                long var9 = var128 + 1L;
                                var9 = var128 * var9;
                                long var129 = var9 & 1L;
                                long var149;
                                var4 = (var149 = var129 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label115;
                                }

                                float var150;
                                var4 = (var150 = var5 - var6) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
                                if (var4 < 0) {
                                    var3 *= 521060767;
                                    var3 -= -1940517346;
                                    var3 -= -616984363;
                                    var3 ^= 1513685870;
                                    var4 = var3 + 1;
                                    var4 = var3 * var4;
                                    int var96 = var3 + 2;
                                    var4 *= var96;
                                    int var97 = var3 + 3;
                                    var4 *= var97;
                                    var4 &= 7;
                                    if (var4 != 0) {
                                        break label115;
                                    }

                                    boolean var80 = true;
                                    var3 -= 82888917;
                                    var3 &= 1993964374;
                                    var3 ^= 978020114;
                                    return var80;
                                }

                                var3 |= -1303910914;
                                var3 ^= -455221585;
                            } else {
                                switch (var3) {
                                    case -1236737487:
                                        var3 ^= -1683145490;
                                        var3 += -1100040288;
                                        var3 ^= -563680390;
                                        var3 ^= 683167317;
                                        break;
                                    case 1301851307:
                                        var3 ^= -1264880213;
                                        break;
                                    case 1564435015:
                                    default:
                                        var3 ^= 92194067;
                                }
                            }
                        } else {
                            var3 &= 152124193;
                            var3 *= 1062452671;
                            var3 >>= 25;
                            var3 ^= -445264765;
                        }
                    } else {
                        var3 *= 1797035155;
                        var3 -= 1432639958;
                        var3 ^= -197922884;
                        var3 &= 760590058;
                        var3 ^= 516855282;
                    }

                    long var98 = var3;
                    long var130 = var98 + 1L;
                    long var131 = var98 * var130;
                    long var99 = var131 & 1L;
                    long var151;
                    int var100 = (var151 = var99 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label115;
                    }

                    boolean var152 = false;
                    switch (var3) {
                        case -213459506:
                        default:
                            var3 ^= 1102589064;
                            return var152;
                        case 26927114:
                            var3 ^= 648117936;
                            return var152;
                        case 445264720:
                            var3 |= 347609280;
                            var3 ^= -1363885274;
                            var3 ^= -1436696922;
                            return var152;
                    }
                }
            }

            AssertionError var101 = new AssertionError();
            throw var101;
        }

        RuntimeException var69 = new RuntimeException();
        throw var69;
    }

    private static boolean P(HudModule var0, int var1) {
        label74: {
            int var30;
            int var46;
            label78: {
                var46 = System.identityHashCode(var0);
                long var4 = var46;
                long var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var76;
                int var48 = (var76 = var4 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                label71:
                if (var48 == 0) {
                    var30 = switch (var1) {
                        case -1422043050 -> {
                            var30 = var1 | 1819862383;
                            yield var30 ^ -894665533;
                        }
                        case 1228636928 -> var1 ^ -930540668;
                        default -> var1 ^ -2117288701;
                    };
                    int var49 = var30 + 1;
                    int var50 = var30 * var49;
                    int var5 = var30 + 2;
                    int var51 = var50 * var5;
                    var5 = var30 + 3;
                    int var52 = var51 * var5;
                    int var53 = var52 & 7;
                    if (var53 != 0) {
                        break label74;
                    }

                    boolean var54 = var0.JK;
                    if (var54) {
                        var30 = switch (var30) {
                            case -1766794680 -> var30 ^ 1509048360;
                            case 634487228 -> {
                                var30 *= 1411888885;
                                var30 <<= 14;
                                yield var30 ^ -1341846915;
                            }
                            default -> var30 ^ -799184933;
                        };
                        float var55 = var0.J;
                        long var65 = var46;
                        long var7 = var65 + 1L;
                        var7 = var65 * var7;
                        long var9 = var65 + 2L;
                        var7 *= var9;
                        long var66 = var65 + 3L;
                        var7 *= var66;
                        long var67 = var7 & 7L;
                        long var77;
                        var46 = (var77 = var67 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                        if (var46 != 0) {
                            switch (var30) {
                                case -2076308867:
                                    var30 *= 243236435;
                                    var30 -= 662655869;
                                    var30 -= 1360371868;
                                    var30 ^= -1359663190;
                                    break label71;
                                case -1960282928:
                                default:
                                    var30 ^= 1402163329;
                                    break label71;
                                case -655411375:
                                    var30 ^= 292985842;
                                    break label71;
                            }
                        }
                        var30 = switch (var30) {
                            case -2076308867 -> {
                                var30 >>>= 25;
                                var30 *= -748986929;
                                var30 += -613458532;
                                yield var30 ^ -8386527;
                            }
                            case -152686375 -> var30 ^ -93992902;
                            default -> var30 ^ -1018612895;
                        };
                        float var78;
                        var46 = (var78 = var55 - 0.002F) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
                        if (var46 > 0) {
                            var30 *= -27409993;
                            var30 ^= 1956488048;
                            long var43 = var30;
                            long var68 = var43 + 1L;
                            long var69 = var43 * var68;
                            long var44 = var69 & 1L;
                            long var79;
                            var46 = (var79 = var44 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                            if (var46 != 0) {
                                break label74;
                            }

                            var46 = 1;
                            var30 >>>= 19;
                            var30 ^= -46534524;
                            var30 ^= 1906006084;
                            break label78;
                        }

                        var30 >>= 18;
                        var30 >>= 26;
                        var30 &= 652766774;
                        var30 ^= -1060049770;
                    } else {
                        var30 &= 166256172;
                        var30 ^= -403176820;
                    }

                    var4 = var30;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var80;
                    int var60 = (var80 = var4 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                    if (var60 != 0) {
                        break label74;
                    }

                    var46 = 0;
                    var30 -= -427103587;
                    var30 ^= 1930371966;
                    break label78;
                } else {
                    var30 = var1 - -1507153363;
                    var30 &= -937068389;
                    var30 ^= 1413611469;
                }

                long var34 = var30;
                var4 = var34 + 1L;
                var4 = var34 * var4;
                long var35 = var4 & 1L;
                long var81;
                var30 = (var81 = var35 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                if (var30 == 0) {
                    UnsupportedOperationException var37 = new UnsupportedOperationException();
                    throw var37;
                }
                break label74;
            }

            int var61 = var30 + 1;
            var61 = var30 * var61;
            var61 &= 1;
            if (var61 == 0) {
                return (var46 != 0);
            }
        }

        IllegalStateException var40 = new IllegalStateException();
        throw var40;
    }

    private static void c(Canvas var0, HudModule var1, int var2) {
        int var4 = System.identityHashCode(var0);
        var0.save();
        float var5 = var1.I;
        float var6 = var1.zF;
        var0.translate(var5, var6);
        var5 = var1.o;
        var0.scale(var5);
        var5 = var1.J;
        var0.alpha(var5);
        long var44 = var4;
        long var7 = var44 + 1L;
        var7 = var44 * var7;
        long var9 = var44 + 2L;
        var7 *= var9;
        long var45 = var44 + 3L;
        var7 *= var45;
        long var46 = var7 & 7L;
        long var58;
        int var47 = (var58 = var46 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
        if (var47 != 0) {
            int var32 = var2 & -1179975340;
            var32 -= 2081549910;
            var32 += 1123632966;
            var32 ^= 1366029007;
        } else {
            label53: {
                int var3 = var2 << 5;
                var3 += -1210993727;
                var3 -= 836517358;
                var3 ^= 1053343630;
                var3 ^= 1801305070;
                Integer var48 = var3;
                label42:
                if (var48 != null) {
                    var5 = var1.O;
                    float var59;
                    int var50 = (var59 = var5 - 0.02F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
                    if (var50 > 0) {
                        var3 += -300042908;
                        var3 ^= 369929231;
                        int var51 = var3 + 1;
                        int var52 = var3 * var51;
                        int var53 = var52 & 1;
                        if (var53 != 0) {
                            break label42;
                        }

                        var5 = var1.O;
                        Integer var37 = var4;
                        if (var37 == null) {
                            switch (var3) {
                                case -1924411752:
                                    var3 &= 753709269;
                                    var3 <<= 24;
                                    var3 ^= -1459443509;
                                    break label53;
                                case -1183533608:
                                    var3 ^= 1469908957;
                                    break label53;
                                case 2108141919:
                                default:
                                    var3 ^= 1178921184;
                                    break label53;
                            }
                        }

                        var3 &= 1202920630;
                        var3 += 2090183946;
                        var3 ^= -1847848182;
                        int var38 = var3 + 1;
                        var38 = var3 * var38;
                        var38 &= 1;
                        if (var38 != 0) {
                            break label42;
                        }

                        var0.blur(var5);
                        var3 |= 1773213682;
                        var3 ^= 1915988588;
                    } else {
                        var3 *= -2093828051;
                        var3 -= -423303009;
                        var3 -= 1383868806;
                        var3 *= 2131790167;
                        var3 ^= 977477568;
                    }

                    return;
                }

                UnsupportedOperationException var41 = new UnsupportedOperationException();
                throw var41;
            }
        }

        RuntimeException var36 = new RuntimeException();
        throw var36;
    }

    private void r(ItemStack var1, float var2, float var3, float var4) {
        label226: {
            int var5 = aL;
            var5 ^= 1119553124;
            int var6 = System.identityHashCode(this);
            HudModule var7 = this.l;
            HudModule var149 = var7;
            float var8 = var7.I;
            float var9 = var7.o;
            var9 *= var2;
            var8 += var9;
            var8 = var8;
            var9 = var7.zF;
            long var10 = var6;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            long var14 = var10 + 2L;
            var12 *= var14;
            var10 += 3L;
            var12 *= var10;
            var10 = var12 & 7L;
            long var279;
            int var164 = (var279 = var10 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
            if (var164 != 0) {
                switch (var5) {
                    case -766261952:
                        var5 &= 228016615;
                        var5 *= 1246396447;
                        var5 &= -2079444262;
                        var5 &= -1918688746;
                        var5 ^= 870400780;
                        break;
                    case -751769622:
                        var5 ^= -904827419;
                        break;
                    case 250409325:
                    default:
                        var5 ^= 1923464418;
                }
            } else {
                var5 |= -1611047492;
                var5 += 497673650;
                var5 *= -890942493;
                var5 |= -123211665;
                var5 ^= 2015308406;
                float var165 = var7.o;
                float var166 = var165 * var3;
                var9 += var166;
                var9 = var9;
                float var167 = var7.o;
                float var168 = var167 * var4;
                float var169 = var168;
                boolean var11 = false;
                List var174 = this.V;
                Iterator var175 = var174.iterator();
                Iterator var176 = var175;
                var11 = var11;
                var5 -= 64331349;
                var5 += 1610831962;
                var5 += -597970069;
                var5 ^= 300420523;

                label223:
                while (true) {
                    int var13 = var5 + 1;
                    var13 = var5 * var13;
                    int var190 = var5 + 2;
                    var13 *= var190;
                    int var191 = var5 + 3;
                    var13 *= var191;
                    var13 &= 7;
                    if (var13 != 0) {
                        break label226;
                    }

                    int var181 = (var176.hasNext()) ? 1 : 0;
                    int var192 = var6 + 1;
                    int var193 = var6 * var192;
                    int var194 = var193 & 1;
                    if (var194 != 0) {
                        var5 ^= -1835759330;
                        var5 ^= -1913675472;
                        break;
                    }
                    var5 = switch (var5) {
                        case -1466283742 -> {
                            var5 |= 599436785;
                            var5 *= 2057250665;
                            var5 ^= -1323026205;
                            var5 &= -1516610454;
                            yield var5 ^ 363415277;
                        }
                        case -1169011131 -> var5 ^ 17221458;
                        default -> var5 ^ 2143254394;
                    };
                    if (var181 == 0) {
                        var5 = switch (var5) {
                            default -> var5 ^ 966189680;
                            case 892420773 -> {
                                var5 |= 1446861235;
                                yield var5 ^ -1846082692;
                            }
                            case 1688516147 -> var5 ^ 1804530101;
                        };
                        int var150 = var5 + 1;
                        int var151 = var5 * var150;
                        int var152 = var151 & 1;
                        if (var152 != 0) {
                            break label226;
                        }

                        Object var153 = this.z;
                        Integer var147 = var6;
                        if (var147 != null) {
                            switch (var5) {
                                case -1788128280:
                                    var5 ^= -429952366;
                                    break;
                                case -422946613:
                                    var5 *= 1452509129;
                                    var5 >>>= 10;
                                    var5 ^= -2010253534;
                                    var5 ^= -1763732173;
                                    break;
                                case 81708712:
                                default:
                                    var5 ^= 1330355869;
                            }

                            float var148 = var169 / 16.0F;
                            i_2.cX(var153, var1, var8, var9, var148);
                            return;
                        }

                        switch (var5) {
                            case -422946613:
                                var5 >>>= 12;
                                var5 >>>= 2;
                                var5 &= 603303365;
                                var5 *= -2139419439;
                                var5 ^= -792296227;
                                break label223;
                            case 50318957:
                                var5 ^= 1206950097;
                                break label223;
                            case 327753330:
                            default:
                                var5 ^= -1775216677;
                                break label223;
                        }
                    }
                    var5 = switch (var5) {
                        default -> var5 ^ 211891359;
                        case -765075572 -> var5 ^ -528598080;
                        case 892420773 -> {
                            var5 *= 1640964599;
                            var5 ^= 1949326946;
                            var5 += -285374457;
                            var5 >>>= 17;
                            yield var5 ^ -740242361;
                        }
                    };
                    Integer var182 = var5;
                    if (var182 == null) {
                        break label226;
                    }

                    HudModule var184 = (HudModule)var176.next();

                    int var195 = var6 + 1;
                    int var196 = var6 * var195;
                    int var15 = var6 + 2;
                    int var197 = var196 * var15;
                    var15 = var6 + 3;
                    int var198 = var197 * var15;
                    int var199 = var198 & 7;
                    if (var199 != 0) {
                        var5 >>>= 24;
                        var5 ^= -1209966113;
                        break;
                    }

                    var5 ^= -1736908148;
                    var5 += 860024579;
                    var5 |= 1992042011;
                    var5 ^= 1997950446;
                    if (var184 == var149) {
                        var5 ^= -396222976;
                        var5 ^= 751251902;
                        int var200 = var5 + 1;
                        int var201 = var5 * var200;
                        int var202 = var201 & 1;
                        if (var202 != 0) {
                            break label226;
                        }

                        boolean var203 = true;
                        var15 = var6 + 1;
                        var15 = var6 * var15;
                        var15 &= 1;
                        if (var15 != 0) {
                            var5 *= 1973957405;
                            var5 += -1564622537;
                            var5 -= -1501044911;
                            var5 ^= 1002104425;
                            break;
                        }

                        var5 -= 895659906;
                        var5 ^= 1327001294;
                        Integer var240 = var5;
                        if (var240 == null) {
                            break label226;
                        }

                        var11 = var203;
                        var5 *= 695287905;
                        var5 <<= 24;
                        var5 ^= 261769506;
                    } else {
                        var5 >>>= 24;
                        var5 *= 1060886641;
                        var5 += -1172809094;
                        var5 ^= -1908188888;
                        var14 = var5;
                        long var16 = var14 + 1L;
                        var16 = var14 * var16;
                        long var18 = var14 + 2L;
                        var16 *= var18;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var280;
                        int var207 = (var280 = var14 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                        if (var207 != 0) {
                            break label226;
                        }

                        if (var11) {
                            var5 -= -1326375988;
                            var5 ^= 1537757727;
                            int var208 = var5 << 27;
                            int var209 = var208 - 2035189092;
                            int var210 = var209 << 15;
                            int var211 = var210 ^ -548284204;
                            int var212 = var211 ^ -920485758;
                            boolean var213 = P(var184, var212);
                            Integer var241 = var6;
                            if (var241 == null) {
                                switch (var5) {
                                    case -1758936688:
                                        var5 += 1738128813;
                                        var5 &= 1384937218;
                                        var5 -= -1035388661;
                                        var5 ^= 668359929;
                                        break label223;
                                    case 1603777909:
                                        var5 ^= 1696054752;
                                        break label223;
                                    case 1869285647:
                                    default:
                                        var5 ^= -2057403529;
                                        break label223;
                                }
                            }

                            var5 ^= -246296356;
                            var5 ^= 1662683286;
                            var241 = var5;
                            if (var241 == null) {
                                break label226;
                            }

                            if (var213) {
                                var5 -= -478696843;
                                var5 *= 1099062191;
                                var5 ^= 1496179303;
                                Integer var214 = var5;
                                if (var214 == null) {
                                    break label226;
                                }

                                float var215 = var184.gd;
                                long var243 = var6;
                                long var17 = var243 + 1L;
                                var17 = var243 * var17;
                                long var244 = var17 & 1L;
                                long var281;
                                int var245 = (var281 = var244 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                                if (var245 != 0) {
                                    var5 += 1397354697;
                                    var5 ^= -953089735;
                                    break;
                                }
                                var5 = switch (var5) {
                                    case -209177061 -> var5 ^ -1252851969;
                                    default -> var5 ^ -258641309;
                                    case 495349612 -> {
                                        var5 >>>= 8;
                                        var5 *= -2023899387;
                                        var5 >>>= 29;
                                        yield var5 ^ 321205068;
                                    }
                                };
                                Integer var246 = var5;
                                if (var246 == null) {
                                    break label226;
                                }

                                float var282;
                                int var216 = (var282 = var8 - var215) == 0.0F ? 0 : (var282 < 0.0F ? -1 : 1);
                                if (var216 < 0) {
                                    var5 -= 1442128762;
                                    var5 -= -2090286749;
                                    var5 ^= -448858894;
                                    Integer var217 = var5;
                                    if (var217 == null) {
                                        break label226;
                                    }

                                    float var218 = var184.Au;
                                    float var247 = var8 + var169;
                                    var16 = var6;
                                    var18 = var16 + 1L;
                                    var18 = var16 * var18;
                                    long var20 = var16 + 2L;
                                    var18 *= var20;
                                    var16 += 3L;
                                    var18 *= var16;
                                    var16 = var18 & 7L;
                                    long var283;
                                    int var261 = (var283 = var16 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                                    if (var261 != 0) {
                                        var5 -= 1194701959;
                                        var5 *= -1380262903;
                                        var5 ^= -485404467;
                                        break;
                                    }

                                    var5 += -1490595606;
                                    var5 ^= -109012556;
                                    Integer var262 = var5;
                                    if (var262 == null) {
                                        break label226;
                                    }

                                    float var284;
                                    int var219 = (var284 = var218 - var247) == 0.0F ? 0 : (var284 < 0.0F ? -1 : 1);
                                    if (var219 < 0) {
                                        var5 *= -1568752063;
                                        var5 += 987609930;
                                        var5 += 2028345168;
                                        var5 <<= 22;
                                        var5 ^= -1498601482;
                                        var14 = var5;
                                        var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        var14 = var16 & 1L;
                                        long var285;
                                        int var222 = (var285 = var14 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                                        if (var222 != 0) {
                                            break label226;
                                        }

                                        float var223 = var184.CW;
                                        float var286;
                                        int var224 = (var286 = var9 - var223) == 0.0F ? 0 : (var286 < 0.0F ? -1 : 1);
                                        var246 = var6;
                                        if (var246 == null) {
                                            var5 *= 1341519351;
                                            var5 >>= 14;
                                            var5 -= -1527522156;
                                            var5 ^= -319963281;
                                            break;
                                        }

                                        var5 -= -65699891;
                                        var5 ^= 1554900651;
                                        long var249 = var5;
                                        var17 = var249 + 1L;
                                        var17 = var249 * var17;
                                        long var19 = var249 + 2L;
                                        var17 *= var19;
                                        long var250 = var249 + 3L;
                                        var17 *= var250;
                                        long var251 = var17 & 7L;
                                        long var287;
                                        int var252 = (var287 = var251 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                                        if (var252 != 0) {
                                            break label226;
                                        }

                                        if (var224 < 0) {
                                            var5 = switch (var5) {
                                                case -1069920638 -> {
                                                    var5 >>>= 12;
                                                    var5 |= -1999728071;
                                                    var5 -= -1675835610;
                                                    var5 >>= 14;
                                                    yield var5 ^ 1148831951;
                                                }
                                                default -> var5 ^ -1058029571;
                                                case 1968390985 -> var5 ^ 1602103422;
                                            };
                                            Integer var225 = var5;
                                            if (var225 == null) {
                                                break label226;
                                            }

                                            float var185 = var184.eU;
                                            float var226 = var9 + var169;
                                            float var288;
                                            var181 = (var288 = var185 - var226) == 0.0F ? 0 : (var288 < 0.0F ? -1 : 1);
                                            var14 = var6;
                                            var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            var18 = var14 + 2L;
                                            var16 *= var18;
                                            var14 += 3L;
                                            var16 *= var14;
                                            var14 = var16 & 7L;
                                            long var289;
                                            int var230 = (var289 = var14 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                                            if (var230 != 0) {
                                                var5 |= -773954532;
                                                var5 *= -84321839;
                                                var5 += 1791685433;
                                                var5 ^= -782056167;
                                                break;
                                            }

                                            var5 |= 1488614579;
                                            var5 ^= 1527393178;
                                            var5 ^= -1831975808;
                                            int var231 = var5 + 1;
                                            int var232 = var5 * var231;
                                            var252 = var5 + 2;
                                            int var233 = var232 * var252;
                                            var252 = var5 + 3;
                                            int var234 = var233 * var252;
                                            int var235 = var234 & 7;
                                            if (var235 != 0) {
                                                break label226;
                                            }

                                            if (var181 < 0) {
                                                var5 &= -1732980209;
                                                var5 -= 2080730456;
                                                var5 -= -7101916;
                                                var5 ^= 960542299;
                                                return;
                                            }

                                            var5 &= -2113727204;
                                            var5 ^= 738801197;
                                            var5 &= -1463239256;
                                            var5 += 1685481995;
                                            var5 ^= 363962135;
                                        } else {
                                            var5 -= 969411191;
                                            var5 |= -551665951;
                                            var5 ^= 1186033359;
                                        }
                                    } else {
                                        var5 &= -671016047;
                                        var5 *= 1863462661;
                                        var5 ^= 826465524;
                                    }
                                } else {
                                    var5 ^= 178445679;
                                    var5 *= -505824063;
                                    var5 ^= -1833626108;
                                }
                            } else {
                                var5 += 196967948;
                                var5 ^= -1997666366;
                            }
                        } else {
                            var5 -= -1511385800;
                            var5 >>= 10;
                            var5 += -139224273;
                            var5 ^= 1852206385;
                        }

                        int var187 = var5 + 1;
                        var187 = var5 * var187;
                        var187 &= 1;
                        if (var187 != 0) {
                            break label226;
                        }

                        var11 = var11;
                        var5 ^= 850904512;
                        var5 >>= 20;
                        var5 ^= 1466282901;
                    }
                }
            }

            long var142 = var5;
            long var154 = var142 + 1L;
            long var155 = var142 * var154;
            long var143 = var155 & 1L;
            long var290;
            var5 = (var290 = var143 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalArgumentException var145 = new IllegalArgumentException();
                throw var145;
            }
        }

        RuntimeException var146 = new RuntimeException();
        throw var146;
    }

    public void px(Object var1) {
        List var206 = null;
        Iterator var208 = null;
        Throwable var219 = null;
        HudModule var230 = null;
        HudModule var231 = null;
        float var264 = 0.0F;
        Sn var274 = null;
        lH_3 var286 = null;
        int var2 = aL;
        var2 ^= 273989114;
        Throwable var3 = null;
        ClientRuntime var4 = this.SY;
        var2 |= -908356546;
        var2 ^= -2071412809;
        int var5 = var2 + 1;
        var5 = var2 * var5;
        int var6 = var2 + 2;
        var5 *= var6;
        var6 = var2 + 3;
        var5 *= var6;
        var5 &= 7;
        if (var5 == 0) {
            AuraRenderer var194 = var4.ZP();
            AuraRenderer$State var195 = var194.state();
            AuraRenderer$State var213 = AuraRenderer$State.DISABLED;
            if (var195 == var213) {
                var2 |= -2064330041;
                var2 ^= 1135309303;
                var2 |= -1198866064;
                var2 -= 892342944;
                var2 ^= -224784535;
                return;
            }

            var2 &= 200530898;
            var2 &= 1132317333;
            var2 &= -523563324;
            var2 -= -1294859019;
            var2 ^= 1821549957;
            long var196 = var2;
            long var239 = var196 + 1L;
            long var240 = var196 * var239;
            long var197 = var240 & 1L;
            long var294;
            int var198 = (var294 = var197 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
            if (var198 == 0) {
                boolean var199 = i_2.b();
                var2 <<= 1;
                var2 &= -222079293;
                var2 >>= 21;
                var2 ^= 40452773;
                var5 = var2 + 1;
                var5 = var2 * var5;
                var6 = var2 + 2;
                var5 *= var6;
                var6 = var2 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    if (var199) {
                        var2 += -214140548;
                        var2 ^= -1903073890;
                        return;
                    }

                    var2 += 1775577549;
                    var2 >>= 22;
                    var2 += 1631213369;
                    var2 -= -542277582;
                    var2 ^= -440729050;
                    long var200 = var2;
                    long var243 = var200 + 1L;
                    long var244 = var200 * var243;
                    long var201 = var244 & 1L;
                    long var295;
                    int var202 = (var295 = var201 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                    if (var202 == 0) {
                        boolean var203 = i_2.BD();

                        var2 = switch (var2) {
                            default -> var2 ^ 1588635485;
                            case 825021698 -> var2 ^ 729837736;
                            case 1681382033 -> {
                                var2 *= 1554799219;
                                var2 &= 294561622;
                                var2 |= 855935128;
                                yield var2 ^ 1377015383;
                            }
                        };
                        if (!var203) {
                            switch (var2) {
                                case -1527907810:
                                default:
                                    var2 ^= -462063285;
                                    return;
                                case -1162013896:
                                    var2 ^= -1640514961;
                                    return;
                                case 1629306829:
                                    var2 <<= 3;
                                    var2 &= -96187455;
                                    var2 >>= 2;
                                    var2 ^= -417748498;
                                    var2 ^= -1640143665;
                                    return;
                            }
                        }

                        var2 &= 1362310553;
                        var2 ^= -1441003704;
                        Integer var204 = var2;
                        if (var204 != null) {
                            this.bH();
                            var2 *= -649475563;
                            var2 += 640740405;
                            var2 -= 414087451;
                            var2 += -855140505;
                            var2 ^= 1310030223;
                            Integer var205 = var2;
                            label316:
                            if (var205 != null) {
                                this.z = var1;
                                var2 >>= 2;
                                var2 ^= 1331762663;
                                var2 ^= -793784241;

                                label313: {
                                    label312: {
                                        label311: {
                                            label310: {
                                                label353: {
                                                    try {
                                                        var2 *= 1035959897;
                                                        var2 ^= -651102185;
                                                        var206 = this.V;
                                                        var2 >>>= 17;
                                                        var2 ^= -1618392781;
                                                        var2 ^= -1468735954;
                                                    } catch (Throwable var25) {
                                                        var2 = aL;
                                                        var2 ^= -1228853905;
                                                        var219 = var25;
                                                        switch (var2) {
                                                            case -365422366:
                                                                break label353;
                                                            case -89066960:
                                                            default:
                                                                break label311;
                                                            case 640282187:
                                                                break label310;
                                                        }
                                                    }

                                                    Integer var220 = var2;
                                                    if (var220 == null) {
                                                        break label316;
                                                    }

                                                    try {
                                                        Iterator var207 = var206.iterator();
                                                        var2 -= 1790980195;
                                                        var2 += 2587957;
                                                        var2 ^= 1816934721;
                                                        var208 = var207;
                                                    } catch (Throwable var24) {
                                                        var2 = aL;
                                                        var2 ^= -1228853905;
                                                        var219 = var24;
                                                        switch (var2) {
                                                            case -365422366:
                                                                break label353;
                                                            case -89066960:
                                                            default:
                                                                break label311;
                                                            case 640282187:
                                                                break label310;
                                                        }
                                                    }
                                                    var2 = switch (var2) {
                                                        case -1591148092 -> {
                                                            var2 |= -175395919;
                                                            yield var2 ^ 171535104;
                                                        }
                                                        case -626185492 -> var2 ^ -1102804961;
                                                        default -> var2 ^ -1180959288;
                                                    };

                                                    label301:
                                                    while (true) {
                                                        try {
                                                            var2 *= -1682536855;
                                                            var2 ^= -1457856303;
                                                        } catch (Throwable var21) {
                                                            var2 = aL;
                                                            var2 ^= -1228853905;
                                                            var219 = var21;
                                                            switch (var2) {
                                                                case -365422366:
                                                                    break label301;
                                                                case -89066960:
                                                                default:
                                                                    break label311;
                                                                case 640282187:
                                                                    break label310;
                                                            }
                                                        }

                                                        int var221 = var2 + 1;
                                                        var221 = var2 * var221;
                                                        var221 &= 1;
                                                        if (var221 != 0) {
                                                            break label316;
                                                        }

                                                        try {
                                                            boolean var224 = var208.hasNext();
                                                            var2 >>= 26;
                                                            var2 ^= -1073365718;
                                                            var2 &= -621527310;
                                                            var2 &= 2064831021;
                                                            var2 ^= -1493576857;
                                                            if (!var224) {
                                                                break label313;
                                                            }
                                                        } catch (Throwable var20) {
                                                            var2 = aL;
                                                            var2 ^= -1228853905;
                                                            var219 = var20;
                                                            switch (var2) {
                                                                case -365422366:
                                                                    break label301;
                                                                case -89066960:
                                                                default:
                                                                    break label311;
                                                                case 640282187:
                                                                    break label310;
                                                            }
                                                        }

                                                        var2 *= -2071918531;
                                                        var2 |= 1914901114;
                                                        var2 &= -559611986;
                                                        var2 ^= -1699132776;
                                                        Integer var225 = var2;
                                                        if (var225 == null) {
                                                            break label316;
                                                        }

                                                        try {
                                                            var2 ^= 469371737;
                                                            var2 ^= -1943550020;
                                                            var2 += 1467044089;
                                                            var2 -= 1678810062;
                                                            var2 ^= 1026884794;
                                                        } catch (Throwable var19) {
                                                            var2 = aL;
                                                            var2 ^= -1228853905;
                                                            var219 = var19;
                                                            switch (var2) {
                                                                case -365422366:
                                                                    break label301;
                                                                case -89066960:
                                                                default:
                                                                    break label311;
                                                                case 640282187:
                                                                    break label310;
                                                            }
                                                        }

                                                        long var226 = var2;
                                                        long var7 = var226 + 1L;
                                                        var7 = var226 * var7;
                                                        long var227 = var7 & 1L;
                                                        long var296;
                                                        int var228 = (var296 = var227 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                                        if (var228 != 0) {
                                                            break label316;
                                                        }

                                                        try {
                                                            Object var229 = var208.next();
                                                            var2 += -1446348465;
                                                            var2 *= -1853181639;
                                                            var2 &= -1376043698;
                                                            var2 |= -330236012;
                                                            var2 ^= -1186225679;
                                                            var230 = (HudModule)var229;
                                                        } catch (Throwable var18) {
                                                            var2 = aL;
                                                            var2 ^= -1228853905;
                                                            var219 = var18;
                                                            switch (var2) {
                                                                case -365422366:
                                                                    break label301;
                                                                case -89066960:
                                                                default:
                                                                    break label311;
                                                                case 640282187:
                                                                    break label310;
                                                            }
                                                        }
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ 1665813296;
                                                            case 301266648 -> var2 ^ 1790327995;
                                                            case 1429888623 -> {
                                                                var2 -= 1125958643;
                                                                var2 |= 1365008772;
                                                                yield var2 ^ 351560809;
                                                            }
                                                        };
                                                        var6 = var2 + 1;
                                                        var6 = var2 * var6;
                                                        int var280 = var2 + 2;
                                                        var6 *= var280;
                                                        int var281 = var2 + 3;
                                                        var6 *= var281;
                                                        var6 &= 7;
                                                        if (var6 != 0) {
                                                            break label316;
                                                        }

                                                        try {
                                                            var231 = var230;
                                                        } catch (Throwable var17) {
                                                            var2 = aL;
                                                            var2 ^= -1228853905;
                                                            var219 = var17;
                                                            switch (var2) {
                                                                case -365422366:
                                                                    break label301;
                                                                case -89066960:
                                                                default:
                                                                    break label311;
                                                                case 640282187:
                                                                    break label310;
                                                            }
                                                        }
                                                        var2 = switch (var2) {
                                                            case 1202298773 -> {
                                                                var2 <<= 11;
                                                                var2 *= -1970409029;
                                                                var2 &= -1625330356;
                                                                var2 *= 1536530247;
                                                                yield var2 ^ -1516424401;
                                                            }
                                                            default -> var2 ^ -9724854;
                                                            case 1477266415 -> var2 ^ -626362025;
                                                        };
                                                        var6 = var2 + 1;
                                                        var6 = var2 * var6;
                                                        int var282 = var2 + 2;
                                                        var6 *= var282;
                                                        int var283 = var2 + 3;
                                                        var6 *= var283;
                                                        var6 &= 7;
                                                        if (var6 != 0) {
                                                            break label316;
                                                        }

                                                        label355: {
                                                            try {
                                                                boolean var255 = var231.JK;
                                                                var2 += -1925750390;
                                                                var2 |= 1757095256;
                                                                var2 ^= -789918500;
                                                                var2 |= 1531316170;
                                                                var2 ^= 1935113433;
                                                                if (!var255) {
                                                                    break label355;
                                                                }
                                                            } catch (Throwable var23) {
                                                                var2 = aL;
                                                                var2 ^= -1228853905;
                                                                var219 = var23;
                                                                switch (var2) {
                                                                    case -365422366:
                                                                        break label301;
                                                                    case -89066960:
                                                                    default:
                                                                        break label311;
                                                                    case 640282187:
                                                                        break label310;
                                                                }
                                                            }
                                                            var2 = switch (var2) {
                                                                case -2013258954 -> {
                                                                    var2 *= 1453617715;
                                                                    yield var2 ^ -1652242732;
                                                                }
                                                                default -> var2 ^ -98887599;
                                                                case -1164968275 -> var2 ^ 450687191;
                                                            };
                                                            var6 = var2 + 1;
                                                            var6 = var2 * var6;
                                                            int var284 = var2 + 2;
                                                            var6 *= var284;
                                                            int var285 = var2 + 3;
                                                            var6 *= var285;
                                                            var6 &= 7;
                                                            if (var6 != 0) {
                                                                break label316;
                                                            }

                                                            try {
                                                                var2 ^= -613801961;
                                                                var2 -= 1127101140;
                                                                var2 &= 892225142;
                                                                var2 &= -329975260;
                                                                var2 ^= -2015921081;
                                                            } catch (Throwable var16) {
                                                                var2 = aL;
                                                                var2 ^= -1228853905;
                                                                var219 = var16;
                                                                switch (var2) {
                                                                    case -365422366:
                                                                        break label301;
                                                                    case -89066960:
                                                                    default:
                                                                        break label311;
                                                                    case 640282187:
                                                                        break label310;
                                                                }
                                                            }

                                                            var6 = var2 + 1;
                                                            var6 = var2 * var6;
                                                            var6 &= 1;
                                                            if (var6 != 0) {
                                                                break label316;
                                                            }

                                                            try {
                                                                var264 = var231.J;
                                                            } catch (Throwable var15) {
                                                                var2 = aL;
                                                                var2 ^= -1228853905;
                                                                var219 = var15;
                                                                switch (var2) {
                                                                    case -365422366:
                                                                        break label301;
                                                                    case -89066960:
                                                                    default:
                                                                        break label311;
                                                                    case 640282187:
                                                                        break label310;
                                                                }
                                                            }
                                                            var2 = switch (var2) {
                                                                case -1844902028 -> var2 ^ 618650410;
                                                                case -1546437021 -> {
                                                                    var2 <<= 1;
                                                                    var2 |= -1849520615;
                                                                    yield var2 ^ -1889135593;
                                                                }
                                                                default -> var2 ^ 2065352369;
                                                            };

                                                            label356: {
                                                                try {
                                                                    float var297;
                                                                    var6 = (var297 = var264 - 0.6F) == 0.0F ? 0 : (var297 < 0.0F ? -1 : 1);
                                                                    if (var6 < 0) {
                                                                        break label356;
                                                                    }
                                                                } catch (Throwable var22) {
                                                                    var2 = aL;
                                                                    var2 ^= -1228853905;
                                                                    var219 = var22;
                                                                    switch (var2) {
                                                                        case -365422366:
                                                                            break label301;
                                                                        case -89066960:
                                                                        default:
                                                                            break label311;
                                                                        case 640282187:
                                                                            break label310;
                                                                    }
                                                                }

                                                                var2 *= 1846879515;
                                                                var2 -= 440873951;
                                                                var2 ^= -1120438397;
                                                                long var266 = var2;
                                                                long var8 = var266 + 1L;
                                                                var8 = var266 * var8;
                                                                long var10 = var266 + 2L;
                                                                var8 *= var10;
                                                                long var267 = var266 + 3L;
                                                                var8 *= var267;
                                                                long var268 = var8 & 7L;
                                                                long var298;
                                                                var6 = (var298 = var268 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                                                                if (var6 != 0) {
                                                                    break label316;
                                                                }
                                                                var2 = switch (var2) {
                                                                    case -1298202438 -> {
                                                                        var2 &= 1487078865;
                                                                        yield var2 ^ -1506112693;
                                                                    }
                                                                    default -> var2 ^ 1593529057;
                                                                    case 1678015069 -> var2 ^ 37440782;
                                                                };
                                                                var6 = var2 + 1;
                                                                var6 = var2 * var6;
                                                                var6 &= 1;
                                                                if (var6 != 0) {
                                                                    break label316;
                                                                }

                                                                try {
                                                                    this.l = var231;
                                                                    var2 *= 125536493;
                                                                    var2 *= 1619435079;
                                                                    var2 ^= -1226635768;
                                                                } catch (Throwable var14) {
                                                                    var2 = aL;
                                                                    var2 ^= -1228853905;
                                                                    var219 = var14;
                                                                    switch (var2) {
                                                                        case -365422366:
                                                                            break label301;
                                                                        case -89066960:
                                                                        default:
                                                                            break label311;
                                                                        case 640282187:
                                                                            break label310;
                                                                    }
                                                                }

                                                                Integer var273 = var2;
                                                                if (var273 == null) {
                                                                    break label316;
                                                                }

                                                                try {
                                                                    var274 = this.I;
                                                                    var2 >>= 30;
                                                                    var2 |= 343565786;
                                                                    var2 -= 630162657;
                                                                    var2 -= 1889448580;
                                                                    var2 ^= -40955473;
                                                                    var286 = this.xT;
                                                                    var2 *= -1844543825;
                                                                    var2 ^= 820510396;
                                                                } catch (Throwable var13) {
                                                                    var2 = aL;
                                                                    var2 ^= -1228853905;
                                                                    var219 = var13;
                                                                    switch (var2) {
                                                                        case -365422366:
                                                                            break label301;
                                                                        case -89066960:
                                                                        default:
                                                                            break label311;
                                                                        case 640282187:
                                                                            break label310;
                                                                    }
                                                                }

                                                                int var291 = var2 + 1;
                                                                int var292 = var2 * var291;
                                                                int var293 = var292 & 1;
                                                                if (var293 != 0) {
                                                                    break label316;
                                                                }

                                                                try {
                                                                    var231.IA(var274, var286);
                                                                    var2 >>>= 31;
                                                                    var2 -= 489512897;
                                                                    var2 ^= -1362653685;
                                                                    var2 &= -1194695029;
                                                                    var2 ^= -141367563;
                                                                    continue;
                                                                } catch (Throwable var12) {
                                                                    var2 = aL;
                                                                    var2 ^= -1228853905;
                                                                    var219 = var12;
                                                                    switch (var2) {
                                                                        case -365422366:
                                                                            break label301;
                                                                        case -89066960:
                                                                        default:
                                                                            break label311;
                                                                        case 640282187:
                                                                            break label310;
                                                                    }
                                                                }
                                                            }

                                                            var2 ^= -1545128142;
                                                            var2 &= 1082394126;
                                                            var2 -= -157987255;
                                                            var2 -= 394196968;
                                                            var2 ^= 840750660;
                                                            Integer var278 = var2;
                                                            if (var278 == null) {
                                                                break label316;
                                                            }

                                                            var2 ^= -604229763;
                                                            var2 ^= 664634389;
                                                            continue;
                                                        }

                                                        var2 ^= 1442585943;
                                                        var2 |= 1593531244;
                                                        var2 >>>= 5;
                                                        var2 >>>= 14;
                                                        var2 ^= -7152886;
                                                    }
                                                }

                                                var2 ^= 1529023;
                                                break label312;
                                            }

                                            var2 >>>= 12;
                                            var2 ^= -554461177;
                                            break label312;
                                        }

                                        var2 ^= 1244510189;
                                    }

                                    this.z = null;
                                    var2 ^= 944982484;
                                    var2 &= 1992159722;
                                    var2 <<= 21;
                                    var2 ^= 1208315121;
                                    var6 = var2 + 1;
                                    var6 = var2 * var6;
                                    var6 &= 1;
                                    if (var6 == 0) {
                                        this.l = null;
                                        throw UncheckedExceptions.rethrow(var219);
                                    }
                                    break label316;
                                }

                                var2 -= 647506026;
                                var2 -= 1604435833;
                                var2 -= -952255028;
                                var2 += 831487053;
                                var2 ^= -1080235117;
                                long var186 = var2;
                                long var232 = var186 + 1L;
                                long var233 = var186 * var232;
                                long var287 = var186 + 2L;
                                long var234 = var233 * var287;
                                long var187 = var186 + 3L;
                                long var235 = var234 * var187;
                                long var188 = var235 & 7L;
                                long var299;
                                int var189 = (var299 = var188 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                if (var189 == 0) {
                                    this.z = null;
                                    var2 &= 1671792867;
                                    var2 &= 1506984933;
                                    var2 ^= -36437266;
                                    long var190 = var2;
                                    long var236 = var190 + 1L;
                                    long var237 = var190 * var236;
                                    long var191 = var237 & 1L;
                                    long var300;
                                    int var192 = (var300 = var191 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                                    if (var192 == 0) {
                                        this.l = null;
                                        var2 *= -557802985;
                                        var2 *= -107521319;
                                        var2 ^= -559283204;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        var3 = new RuntimeException();
        throw UncheckedExceptions.rethrow(var3);
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1095938235;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        aL = var4;
    }
}
