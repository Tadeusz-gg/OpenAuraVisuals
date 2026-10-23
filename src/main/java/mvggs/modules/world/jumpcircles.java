package mvggs.modules.world;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public final class jumpcircles extends Module {
    private static final int s = 16;
    private static final String W = "AURA VISUALS  •  AURA VISUALS  •  ";
    private static final String[] CH;
    private final ModeSetting Sf;
    private final NumberSetting U;
    private final NumberSetting o;
    private final NumberSetting m;
    private final NumberSetting n;
    private final zS N;
    private final double[] Zk;
    private final double[] B;
    private final double[] D;
    private final float[] Q;
    private final float[] Oo;
    private final float[] tl;
    private final boolean[] K;
    private int l;
    private boolean DB;
    private double C;
    private Object KG;
    public static final int Wo;

    public jumpcircles() {
        super("jump_circles", "Jump Circles", ModuleCategory.WORLD);
        ModuleCategory var1 = ModuleCategory.WORLD;

        Ll var2 = Ll.BADGE;
        ModeSetting var3 = new ModeSetting("style", "Style", var2);
        Setting var4 = this.addSetting(var3);
        ModeSetting var5 = (ModeSetting)var4;
        this.Sf = var5;
        NumberSetting var6 = new NumberSetting("radius", "Radius", 0.9F, 0.4F, 2.0F);
        NumberSetting var7 = var6.W(0.05F);
        NumberSetting var8 = var7.L("m");
        Setting var9 = this.addSetting(var8);
        NumberSetting var10 = (NumberSetting)var9;
        this.U = var10;
        NumberSetting var11 = new NumberSetting("spin", "Spin", 1.2F, 0.0F, 4.0F);
        NumberSetting var12 = var11.W(0.1F);
        Setting var13 = this.addSetting(var12);
        NumberSetting var14 = (NumberSetting)var13;
        this.o = var14;
        NumberSetting var15 = new NumberSetting("duration", "Duration", 1.6F, 0.6F, 4.0F);
        NumberSetting var16 = var15.W(0.1F);
        NumberSetting var17 = var16.L("s");
        Setting var18 = this.addSetting(var17);
        NumberSetting var19 = (NumberSetting)var18;
        this.m = var19;
        NumberSetting var20 = new NumberSetting("glow", "Glow", 0.7F, 0.0F, 1.0F);
        NumberSetting var21 = var20.W(0.05F);
        Setting var22 = this.addSetting(var21);
        NumberSetting var23 = (NumberSetting)var22;
        this.n = var23;
        zS var24 = new zS();
        nM var25 = this.bU(var24);
        zS var26 = (zS)var25;
        this.N = var26;
        double[] var27 = new double[16];
        this.Zk = var27;
        double[] var28 = new double[16];
        this.B = var28;
        double[] var29 = new double[16];
        this.D = var29;
        float[] var30 = new float[16];
        this.Q = var30;
        float[] var31 = new float[16];
        this.Oo = var31;
        float[] var32 = new float[16];
        this.tl = var32;
        boolean[] var33 = new boolean[16];
        this.K = var33;
        this.DB = true;
        this.dy("A ring of light spreading over the ground where you jump.");
        this.fJ(true);
        EventListener<TickEvent> var34 = (TickEvent var1x) -> {
            int var2x = Wo;
            var2x ^= -816462828;
            int var3x = System.identityHashCode(this);
            Integer var19x = var3x;
            if (var19x != null) {
                var2x *= -829994023;
                var2x ^= 1089561771;
                var2x ^= -2116775999;
                long var20x = var2x;
                long var5x = var20x + 1L;
                var5x = var20x * var5x;
                long var21x = var5x & 1L;
                long var27x;
                int var22x = (var27x = var21x - 0L) == 0L ? 0 : (var27x < 0L ? -1 : 1);
                if (var22x == 0) {
                    var22x = var2x | -1551321889;
                    var22x ^= 924207238;
                    this.K(var22x);
                    return;
                }
            } else {
                var2x ^= 277763422;
                var2x &= 967308099;
                var2x ^= 1489514572;
                long var14x = var2x;
                long var4x = var14x + 1L;
                var4x = var14x * var4x;
                long var15x = var4x & 1L;
                long var28x;
                var2x = (var28x = var15x - 0L) == 0L ? 0 : (var28x < 0L ? -1 : 1);
                if (var2x == 0) {
                    AssertionError var18x = new AssertionError();
                    throw var18x;
                }
            }

            IllegalStateException var17x = new IllegalStateException();
            throw var17x;
        };
        this.onEvent(TickEvent.class, var34);
        EventListener<RenderEvent> var35 = this::mq;
        this.onEvent(RenderEvent.class, var35);
    }

    public void N() {
        label52: {
            int var1 = Wo;
            var1 ^= 1167149550;
            int var2 = System.identityHashCode(this);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 != 0) {
                var1 >>= 27;
                var1 ^= -1826630391;
            } else {
                label57: {
                    var1 = switch (var1) {
                        case -1629534105 -> var1 ^ 1892151183;
                        default -> var1 ^ -497629188;
                        case 1050563466 -> {
                            var1 += -463155496;
                            var1 |= -1191673821;
                            var1 &= 1465468244;
                            var1 -= -232981461;
                            yield var1 ^ 584069100;
                        }
                    };
                    var3 = var1 + 1;
                    var3 = var1 * var3;
                    int var4 = var1 + 2;
                    var3 *= var4;
                    var4 = var1 + 3;
                    var3 *= var4;
                    var3 &= 7;
                    if (var3 != 0) {
                        break label52;
                    }

                    Entity var58 = i_2.QI();
                    if (var58 != null) {
                        var1 *= 965365603;
                        var1 |= -1066781731;
                        var1 |= 1253635228;
                        var1 *= 1159076239;
                        var1 ^= -1569005034;
                        double var62 = var58.getX();
                        double var6 = var58.getY();
                        long var8 = var2;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        long var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var69;
                        var2 = (var69 = var8 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            switch (var1) {
                                case -1204126029:
                                default:
                                    var1 ^= 1931367799;
                                    break label57;
                                case 674806180:
                                    var1 ^= -1813632941;
                                    break label57;
                                case 773936775:
                                    var1 -= -428061694;
                                    var1 *= 992014465;
                                    var1 ^= 1488529419;
                                    break label57;
                            }
                        }

                        var1 |= 40718584;
                        var1 ^= 1139134933;
                        var1 &= -1768433568;
                        var1 -= -1364883295;
                        var1 ^= -505978369;
                        double var65 = var58.getZ();
                        World var47 = var58.getEntityWorld();
                        var3 = var1 - 8820357;
                        var3 ^= 2090797575;
                        this.nG(var62, var6, var65, var47, var3);
                        switch (var1) {
                            case -1274177920:
                                var1 >>= 16;
                                var1 *= 521416837;
                                var1 &= 2068332477;
                                var1 &= 658388713;
                                var1 ^= -789081617;
                                break;
                            case 889182030:
                            default:
                                var1 ^= -898212751;
                                break;
                            case 1725205695:
                                var1 ^= 1518309956;
                        }
                    } else {
                        switch (var1) {
                            case -1927286676:
                                var1 ^= 1709842875;
                                break;
                            case -170476725:
                            default:
                                var1 ^= -1577078717;
                                break;
                            case 65809401:
                                var1 |= 156080029;
                                var1 >>>= 3;
                                var1 ^= -796781423;
                        }
                    }

                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    var1 = var2 & 1;
                    if (var1 == 0) {
                        return;
                    }
                    break label52;
                }
            }

            UnsupportedOperationException var48 = new UnsupportedOperationException();
            throw var48;
        }

        IllegalArgumentException var45 = new IllegalArgumentException();
        throw var45;
    }

    @Override
    protected void J() {
        int var1 = Wo;
        var1 ^= 1817952541;
        int var2 = System.identityHashCode(this);
        boolean[] var3 = this.K;
        Arrays.fill(var3, false);
        int var35 = var2 + 1;
        int var36 = var2 * var35;
        int var4 = var2 + 2;
        int var37 = var36 * var4;
        var2 += 3;
        int var38 = var37 * var2;
        var2 = var38 & 7;
        int var39 = of_2.dS;
        var1 ^= var39;
        var1 ^= -1699540653;
        of_2.dS = -1699540653;
        int var40 = of_2.r;
        var1 ^= var40;
        var1 ^= 1874708218;
        of_2.r = 1874708218;
        if (var2 != 0) {
            var1 *= 1522540067;
            var1 -= 1708060280;
            var1 &= 1111714957;
            var1 -= 1906371776;
            var1 ^= 159891630;
            long var30 = var1;
            long var45 = var30 + 1L;
            long var46 = var30 * var45;
            long var6 = var30 + 2L;
            long var47 = var46 * var6;
            long var31 = var30 + 3L;
            long var48 = var47 * var31;
            long var32 = var48 & 7L;
            long var49;
            var2 = (var49 = var32 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var34 = new RuntimeException();
                throw var34;
            }
        } else {
            var1 ^= -1097324749;
            var1 ^= 1301182454;
            var1 -= -338393629;
            var1 *= -366491185;
            var1 ^= -1626966688;
            long var23 = var1;
            long var41 = var23 + 1L;
            long var42 = var23 * var41;
            long var5 = var23 + 2L;
            long var43 = var42 * var5;
            long var24 = var23 + 3L;
            long var44 = var43 * var24;
            long var25 = var44 & 7L;
            long var50;
            var1 = (var50 = var25 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
            if (var1 == 0) {
                this.KG = null;
                return;
            }
        }

        AssertionError var27 = new AssertionError();
        throw var27;
    }

    private void K(int var1) {
        label124: {
            int var3 = System.identityHashCode(this);
            Entity var4 = i_2.QI();
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var179;
            int var110 = (var179 = var5 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
            if (var110 != 0) {
                switch (var1) {
                    case -1728381095:
                        int var14 = var1 + 1919420092;
                        var14 ^= -1013282904;
                        break;
                    case -252815590:
                    default:
                        int var13 = var1 ^ -1342794417;
                        break;
                    case 162193427:
                        int var2 = var1 ^ -356073079;
                }
            } else {
                int var16 = var1 | -1353305487;
                var16 -= -416230627;
                var16 *= -237384329;
                var16 ^= 499647470;
                var5 = var16;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var180;
                int var114 = (var180 = var5 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                if (var114 != 0) {
                    break label124;
                }

                if (var4 == null) {
                    var16 *= 516574835;
                    var16 ^= -430266790;
                    var5 = var16;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var181;
                    int var122 = (var181 = var5 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                    if (var122 == 0) {
                        return;
                    }
                    break label124;
                }

                var16 <<= 12;
                var16 += -839960666;
                var16 >>= 30;
                var16 *= 1116564713;
                var16 ^= 968954246;
                var5 = var16;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var182;
                int var118 = (var182 = var5 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                if (var118 != 0) {
                    break label124;
                }

                boolean var119 = var4.isOnGround();
                Integer var6 = var3;
                if (var6 == null) {
                    switch (var16) {
                        case -2068610415:
                            var16 |= -1677988933;
                            var16 -= -1001153244;
                            var16 += -875753442;
                            var16 &= 1778774889;
                            var16 ^= -352529508;
                            break;
                        case -810307894:
                        default:
                            var16 ^= 891687496;
                            break;
                        case 2064902027:
                            var16 ^= -955945996;
                    }
                } else {
                    label134: {
                        var16 = switch (var16) {
                            case -2068610415 -> {
                                var16 |= 1032798462;
                                var16 |= -9017747;
                                var16 ^= -1372736823;
                                yield var16 ^ 403903490;
                            }
                            default -> var16 ^ 2119761153;
                            case -91293590 -> var16 ^ -957300814;
                        };
                        int var123 = var16 + 1;
                        var123 = var16 * var123;
                        int var152 = var16 + 2;
                        var123 *= var152;
                        int var153 = var16 + 3;
                        var123 *= var153;
                        var123 &= 7;
                        if (var123 != 0) {
                            break label124;
                        }

                        if (var119) {
                            var16 -= 1698097395;
                            var16 *= -2027738989;
                            var16 -= -824975059;
                            var16 ^= -2118101686;
                            double var128 = var4.getY();
                            Integer var8 = var3;
                            if (var8 == null) {
                                var16 -= 1285606868;
                                var16 ^= -1162221787;
                                break label134;
                            }

                            var16 |= 1563305164;
                            var16 += 2050289276;
                            var16 ^= 390539773;
                            var16 <<= 13;
                            var16 ^= 104329478;
                            var8 = var16;
                            if (var8 == null) {
                                break label124;
                            }

                            this.C = var128;
                            var16 <<= 18;
                            var16 ^= -1028868005;
                            var16 &= 1283110250;
                            var16 ^= -1287106668;
                        } else {
                            var16 += 228711112;
                            var16 >>= 27;
                            var16 *= 1972417225;
                            var16 ^= -1064202656;
                            var123 = var16 + 1;
                            var123 = var16 * var123;
                            var123 &= 1;
                            if (var123 != 0) {
                                break label124;
                            }

                            int var132 = (this.DB ? 1 : 0);
                            Integer var154 = var3;
                            if (var154 == null) {
                                var16 ^= -1851980102;
                                var16 ^= 1755626277;
                                var16 ^= 1727482264;
                                break label134;
                            }

                            var16 ^= -514743979;
                            var16 ^= 131066706;
                            var16 ^= -116171690;
                            var7 = var16;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var183;
                            int var158 = (var183 = var7 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                            if (var158 != 0) {
                                break label124;
                            }

                            if (var132 != 0) {
                                var16 &= 2040221228;
                                var16 |= -1565794420;
                                var16 ^= -1759201907;
                                Vec3d var133 = var4.getVelocity();
                                double var134 = var133.y;
                                double var184;
                                var132 = (var184 = var134 - 0.2) == 0.0 ? 0 : (var184 < 0.0 ? -1 : 1);
                                Integer var159 = var3;
                                if (var159 == null) {
                                    switch (var16) {
                                        case -170612174:
                                            var16 ^= 1480878551;
                                            break label134;
                                        case -71691864:
                                        default:
                                            var16 ^= 48854954;
                                            break label134;
                                        case 2107599393:
                                            var16 ^= 1449375603;
                                            var16 -= 42585390;
                                            var16 -= 123368650;
                                            var16 ^= -354346265;
                                            break label134;
                                    }
                                }

                                var16 += 957330013;
                                var16 |= 166994039;
                                var16 *= -1069430095;
                                var16 ^= -226019634;
                                int var160 = var16 + 1;
                                int var161 = var16 * var160;
                                int var168 = var16 + 2;
                                int var162 = var161 * var168;
                                var168 = var16 + 3;
                                int var163 = var162 * var168;
                                int var164 = var163 & 7;
                                if (var164 != 0) {
                                    break label124;
                                }

                                if (var132 > 0) {
                                    var16 &= -1607525763;
                                    var16 ^= 26850343;
                                    var16 ^= -680524070;
                                    double var136 = var4.getX();
                                    double var170 = this.C;
                                    double var10 = var4.getZ();
                                    int var12 = var3 + 1;
                                    var12 = var3 * var12;
                                    var3 = var12 & 1;
                                    if (var3 != 0) {
                                        var16 ^= 1748048652;
                                        var16 <<= 12;
                                        var16 ^= 1942389181;
                                        break label134;
                                    }
                                    var16 = switch (var16) {
                                        case -988526996 -> var16 ^ -326266854;
                                        case -154490628 -> {
                                            var16 += -1463791407;
                                            var16 ^= -1138393432;
                                            var16 += -285605524;
                                            yield var16 ^ 573694116;
                                        }
                                        default -> var16 ^ 1112225375;
                                    };
                                    World var103 = var4.getEntityWorld();
                                    int var105 = var16 | -577042919;
                                    int var106 = var105 - 1402768387;
                                    int var107 = var106 ^ 1726420870;
                                    this.nG(var136, var170, var10, var103, var107);
                                    var16 &= 1785819256;
                                    var16 >>>= 2;
                                    var16 |= 1030081654;
                                    var16 *= -1615265261;
                                    var16 ^= 1143907972;
                                } else {
                                    var16 &= -466411148;
                                    var16 *= -1106502523;
                                    var16 += 601870815;
                                    var16 ^= -1250752255;
                                }
                            } else {
                                var16 -= -1107000611;
                                var16 += 591549295;
                                var16 |= -1299464060;
                                var16 += -1002422169;
                                var16 ^= 860146362;
                            }
                        }

                        long var92 = var16;
                        long var137 = var92 + 1L;
                        long var138 = var92 * var137;
                        long var171 = var92 + 2L;
                        long var139 = var138 * var171;
                        long var93 = var92 + 3L;
                        long var140 = var139 * var93;
                        long var94 = var140 & 7L;
                        long var185;
                        var16 = (var185 = var94 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                        if (var16 == 0) {
                            this.DB = var119;
                            return;
                        }
                        break label124;
                    }
                }
            }

            UnsupportedOperationException var104 = new UnsupportedOperationException();
            throw var104;
        }

        IllegalStateException var101 = new IllegalStateException();
        throw var101;
    }

    private void nG(double var1, double var3, double var5, Object var7, int var8) {
        label61: {
            int var10 = System.identityHashCode(this);
            Integer var11 = var10;
            if (var11 == null) {
                int var9 = var8 * 133370961;
                var9 |= -1457213486;
                var9 >>>= 29;
                var9 ^= 1696891398;
            } else {
                label63: {
                    int var20 = var8 | 749023007;
                    var20 >>>= 3;
                    var20 ^= -115800281;
                    long var62 = var20;
                    long var13 = var62 + 1L;
                    var13 = var62 * var13;
                    long var15 = var62 + 2L;
                    var13 *= var15;
                    long var63 = var62 + 3L;
                    var13 *= var63;
                    long var64 = var13 & 7L;
                    long var107;
                    int var65 = (var107 = var64 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                    if (var65 != 0) {
                        break label61;
                    }

                    Object var66 = this.KG;
                    if (var66 != null) {
                        var20 >>= 3;
                        var20 |= 510076978;
                        var20 *= 1798384251;
                        var20 ^= 641654794;
                        long var67 = var20;
                        var13 = var67 + 1L;
                        var13 = var67 * var13;
                        var15 = var67 + 2L;
                        var13 *= var15;
                        long var68 = var67 + 3L;
                        var13 *= var68;
                        long var69 = var13 & 7L;
                        long var108;
                        var65 = (var108 = var69 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                        if (var65 != 0) {
                            break label61;
                        }

                        Object var71 = this.KG;
                        int var12 = var10 + 1;
                        var12 = var10 * var12;
                        var12 &= 1;
                        if (var12 != 0) {
                            var20 *= -259035099;
                            var20 &= 248511398;
                            var20 ^= 1630150823;
                            break label63;
                        }

                        var20 -= 1700079320;
                        var20 -= -746885432;
                        var20 *= 1640650771;
                        var20 ^= 414494344;
                        long var78 = var20;
                        long var14 = var78 + 1L;
                        var14 = var78 * var14;
                        long var79 = var14 & 1L;
                        long var109;
                        var12 = (var109 = var79 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                        if (var12 != 0) {
                            break label61;
                        }

                        if (var71 != var7) {
                            var20 &= -1940610361;
                            var20 &= -1444275517;
                            var20 ^= 806732757;
                            var65 = var20 + 1;
                            var65 = var20 * var65;
                            var65 &= 1;
                            if (var65 != 0) {
                                break label61;
                            }

                            this.J();
                            var20 += 331701896;
                            var20 |= 1001242168;
                            var20 ^= 354965782;
                            var20 ^= -983795246;
                        } else {
                            var20 += 291600611;
                            var20 >>= 23;
                            var20 <<= 6;
                            var20 ^= -730562760;
                        }
                    } else {
                        switch (var20) {
                            case -856353640:
                            default:
                                var20 ^= 667180148;
                                break;
                            case -454117160:
                                var20 += 1476529753;
                                var20 += 613184199;
                                var20 *= -607649669;
                                var20 <<= 26;
                                var20 ^= -1953783944;
                                break;
                            case -278442435:
                                var20 ^= -111119241;
                        }
                    }

                    this.KG = var7;
                    var65 = this.l;
                    int var81 = this.l;
                    var81 = ++var81 % 16;
                    this.l = var81;
                    double[] var84 = this.Zk;
                    var84[var65] = var1;
                    double[] var85 = this.B;
                    double var102 = var3 + 0.02;
                    var85[var65] = var102;
                    double[] var86 = this.D;
                    var86[var65] = var5;
                    float[] var87 = this.Q;
                    var87[var65] = 0.0F;
                    long var88 = var10;
                    long var104 = var88 + 1L;
                    var104 = var88 * var104;
                    long var89 = var104 & 1L;
                    long var110;
                    var10 = (var110 = var89 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                    if (var10 == 0) {
                        var20 += 1229420425;
                        var20 >>>= 24;
                        var20 += 1785492499;
                        var20 &= 1914480363;
                        var20 ^= 1447936435;
                        Integer var58 = var20;
                        if (var58 != null) {
                            float[] var59 = this.Oo;
                            ThreadLocalRandom var90 = ThreadLocalRandom.current();
                            double var91 = var90.nextDouble((float) (Math.PI * 2));
                            float var92 = (float)var91;
                            var59[var65] = var92;
                            float[] var60 = this.tl;
                            ThreadLocalRandom var93 = ThreadLocalRandom.current();
                            float var94 = var93.nextFloat();
                            var60[var65] = var94;
                            boolean[] var61 = this.K;
                            var61[var65] = true;
                            return;
                        }
                        break label61;
                    }

                    var20 ^= 196110279;
                    var20 ^= 1159690942;
                }
            }

            IllegalStateException var50 = new IllegalStateException();
            throw var50;
        }

        RuntimeException var56 = new RuntimeException();
        throw var56;
    }

    private void mq(RenderEvent var1) {
        label307: {
            int var2 = Wo;
            var2 ^= -1493609068;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var471;
            int var234 = (var471 = var4 - 0L) == 0L ? 0 : (var471 < 0L ? -1 : 1);
            if (var234 != 0) {
                var2 &= 207559784;
                var2 *= 1785773091;
                var2 <<= 20;
                var2 ^= -1251072924;
            } else {
                var2 &= 85674596;
                var2 ^= -2042474558;
                Integer var235 = var2;
                if (var235 == null) {
                    break label307;
                }

                RenderPhase var236 = var1.phase();
                Object var5 = RenderPhase.WORLD;
                if (var236 != var5) {
                    var2 -= -1518988602;
                    var2 ^= 356157025;
                    var4 = var2;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var472;
                    int var247 = (var472 = var4 - 0L) == 0L ? 0 : (var472 < 0L ? -1 : 1);
                    if (var247 == 0) {
                        return;
                    }
                    break label307;
                }

                var2 &= 1334660689;
                var2 ^= 895758962;
                Integer var237 = var2;
                if (var237 == null) {
                    break label307;
                }

                Entity var238 = i_2.QI();
                int var248 = var3 + 1;
                int var249 = var3 * var248;
                int var270 = var3 + 2;
                int var250 = var249 * var270;
                int var271 = var3 + 3;
                int var251 = var250 * var271;
                int var252 = var251 & 7;
                label285:
                if (var252 == 0) {
                    var2 += -898942534;
                    var2 &= -24494585;
                    var2 += 759163818;
                    var2 ^= 1744480222;
                    Integer var253 = var2;
                    if (var253 == null) {
                        break label307;
                    }

                    label281:
                    if (var238 != null) {
                        var2 &= 1984102099;
                        var2 <<= 23;
                        var2 ^= 1802342924;
                        long var254 = var2;
                        long var7 = var254 + 1L;
                        var7 = var254 * var7;
                        long var9 = var254 + 2L;
                        var7 *= var9;
                        long var255 = var254 + 3L;
                        var7 *= var255;
                        long var256 = var7 & 7L;
                        long var473;
                        int var257 = (var473 = var256 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
                        if (var257 != 0) {
                            break label307;
                        }

                        var5 = this.KG;
                        Integer var272 = var3;
                        if (var272 == null) {
                            var2 |= -2091294037;
                            var2 *= 873320173;
                            var2 += 2017498796;
                            var2 ^= 191377611;
                            break label285;
                        }

                        var2 -= -1709843155;
                        var2 *= 218386923;
                        var2 ^= -189455216;
                        Integer var273 = var2;
                        if (var273 == null) {
                            break label307;
                        }

                        if (var5 != null) {
                            var2 -= 984497799;
                            var2 ^= -1679957019;
                            var5 = this.KG;
                            World var239 = var238.getEntityWorld();
                            var6 = var3;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var474;
                            int var276 = (var474 = var6 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
                            if (var276 != 0) {
                                var2 += 1458473992;
                                var2 |= 2015587442;
                                var2 ^= -644002921;
                                break label285;
                            }

                            var2 += 1950199757;
                            var2 |= 1976635725;
                            var2 >>= 21;
                            var2 ^= -1024652899;
                            if (var5 != var239) {
                                var2 >>= 11;
                                var2 += 582467742;
                                var2 ^= 1292615084;
                                var2 ^= 1844332067;
                                break label281;
                            }

                            var2 += -1861407755;
                            var2 -= 1129207742;
                            var2 >>= 3;
                            var2 *= 1508960547;
                            var2 ^= -1309585613;
                        } else {
                            var2 *= -978510803;
                            var2 ^= -772731475;
                        }

                        Integer var240 = var2;
                        if (var240 == null) {
                            break label307;
                        }

                        FrameContext var241 = var1.frame();
                        float var242 = var241.dt();
                        float var243 = Math.min(var242, 0.1F);
                        float var244 = var243;
                        NumberSetting var260 = this.m;
                        float var261 = var260.WM();
                        float var262 = var261;
                        float var277 = var261 * 0.28F;
                        float var278 = var277;
                        float var284 = var261 * 0.45F;
                        float var285 = var284;
                        FrameContext var289 = var1.frame();
                        double var290 = var289.time();
                        double var291 = var290;
                        Canvas var10 = var1.canvas();
                        Canvas var292 = var10;
                        ClientRuntime var11 = ClientRuntime.Z();
                        AuraPipeline var293 = var11.Ul();
                        WorldDraw var294 = var293.world();
                        WorldDraw var295 = var294;
                        var10.save();
                        NumberSetting var12 = this.n;
                        float var296 = var12.WM();
                        var10.additive(var296);
                        long var297 = var3;
                        long var14 = var297 + 1L;
                        var14 = var297 * var14;
                        long var298 = var14 & 1L;
                        long var475;
                        int var299 = (var475 = var298 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                        if (var299 != 0) {
                            switch (var2) {
                                case -619446607:
                                default:
                                    var2 ^= 584976855;
                                    break label285;
                                case 643348553:
                                    var2 ^= 232299239;
                                    break label285;
                                case 1252361260:
                                    var2 -= 821453564;
                                    var2 ^= -1094646444;
                                    break label285;
                            }
                        } else {
                            var2 = switch (var2) {
                                case -1598014273 -> var2 ^ -1375519294;
                                default -> var2 ^ 1309415210;
                                case 1252361260 -> {
                                    var2 -= 792580725;
                                    yield var2 ^ 271039091;
                                }
                            };
                            byte var300 = 0;
                            int var301 = var300;
                            var2 += -429351221;
                            var2 >>>= 9;
                            var2 ^= -115836901;

                            while (true) {
                                int var13 = var2 + 1;
                                var13 = var2 * var13;
                                var13 &= 1;
                                if (var13 != 0) {
                                    break label307;
                                }

                                if (var301 >= 16) {
                                    long var228 = switch (var2) {
                                        case -2058852965 -> var2 ^ -11694118;
                                        case -111104946 -> {
                                            var2 *= 526417101;
                                            var2 &= 180044578;
                                            yield var2 ^ -1578713898;
                                        }
                                        default -> var2 ^ -300110170;
                                    };
                                    long var263 = var228 + 1L;
                                    long var264 = var228 * var263;
                                    var7 = var228 + 2L;
                                    long var265 = var264 * var7;
                                    long var229 = var228 + 3L;
                                    long var266 = var265 * var229;
                                    long var230 = var266 & 7L;
                                    long var476;
                                    var3 = (var476 = var230 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                                    if (var3 == 0) {
                                        var292.restore();
                                        return;
                                    }
                                    break label307;
                                }

                                var2 >>>= 25;
                                var2 ^= -368316165;
                                var13 = var2 + 1;
                                var13 = var2 * var13;
                                int var336 = var2 + 2;
                                var13 *= var336;
                                int var337 = var2 + 3;
                                var13 *= var337;
                                var13 &= 7;
                                if (var13 != 0) {
                                    break label307;
                                }

                                boolean[] var309 = this.K;
                                int var310 = var309[var301] ? 1 : 0;
                                var14 = var3;
                                long var16 = var14 + 1L;
                                var16 = var14 * var16;
                                long var18 = var14 + 2L;
                                var16 *= var18;
                                var14 += 3L;
                                var16 *= var14;
                                var14 = var16 & 7L;
                                long var477;
                                int var341 = (var477 = var14 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                                if (var341 != 0) {
                                    switch (var2) {
                                        case -368316281:
                                            var2 <<= 5;
                                            var2 *= -167203367;
                                            var2 >>>= 17;
                                            var2 ^= -1485956539;
                                            break label285;
                                        case 541388250:
                                        default:
                                            var2 ^= 870978079;
                                            break label285;
                                        case 1076941503:
                                            var2 ^= 1614529759;
                                            break label285;
                                    }
                                }

                                var2 >>>= 15;
                                var2 *= -1407612947;
                                var2 |= -1958180536;
                                var2 ^= 733625855;
                                var14 = var2;
                                var16 = var14 + 1L;
                                var16 = var14 * var16;
                                var14 = var16 & 1L;
                                long var478;
                                int var344 = (var478 = var14 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                if (var344 != 0) {
                                    break label307;
                                }

                                if (var310 == 0) {
                                    var2 ^= -2011816772;
                                    var2 *= -1707407311;
                                    var2 |= -894868421;
                                    var2 ^= 1943816782;
                                    var310 = var2 + 1;
                                    var310 = var2 * var310;
                                    int var345 = var2 + 2;
                                    var310 *= var345;
                                    int var346 = var2 + 3;
                                    var310 *= var346;
                                    var310 &= 7;
                                    if (var310 != 0) {
                                        break label307;
                                    }

                                    var2 |= -927960274;
                                    var2 *= -1236566215;
                                    var2 |= 974849026;
                                    var2 <<= 28;
                                    var2 ^= -417209742;
                                } else {
                                    var2 &= 1053752874;
                                    var2 &= 351582242;
                                    var2 += -1540392228;
                                    var2 ^= 1315214152;
                                    float[] var316 = this.Q;
                                    float var347 = var316[var301];
                                    float var348 = var347 + var244;
                                    var316[var301] = var348;
                                    long var317 = var3;
                                    long var15 = var317 + 1L;
                                    var15 = var317 * var15;
                                    long var318 = var15 & 1L;
                                    long var479;
                                    var310 = (var479 = var318 - 0L) == 0L ? 0 : (var479 < 0L ? -1 : 1);
                                    if (var310 != 0) {
                                        var2 ^= 1884668047;
                                        var2 ^= 1026592095;
                                        break label285;
                                    }

                                    var2 >>= 31;
                                    var2 ^= 1200224381;
                                    float[] var320 = this.Q;
                                    float var321 = var320[var301];
                                    float var480;
                                    int var349 = (var480 = var321 - var262) == 0.0F ? 0 : (var480 < 0.0F ? -1 : 1);
                                    if (var349 >= 0) {
                                        var2 -= -1640544787;
                                        var2 += -484412300;
                                        var2 ^= -284714517;
                                        Integer var350 = var2;
                                        if (var350 == null) {
                                            break label307;
                                        }

                                        boolean[] var351 = this.K;
                                        int var374 = var3 + 1;
                                        int var375 = var3 * var374;
                                        int var414 = var3 + 2;
                                        int var376 = var375 * var414;
                                        int var415 = var3 + 3;
                                        int var377 = var376 * var415;
                                        int var378 = var377 & 7;
                                        if (var378 != 0) {
                                            var2 >>>= 9;
                                            var2 ^= -1486419917;
                                            break label285;
                                        }

                                        var2 *= -920078659;
                                        var2 >>>= 14;
                                        var2 >>>= 23;
                                        var2 ^= 354632419;
                                        int var379 = var2 + 1;
                                        int var380 = var2 * var379;
                                        int var416 = var2 + 2;
                                        int var381 = var380 * var416;
                                        int var417 = var2 + 3;
                                        int var382 = var381 * var417;
                                        int var383 = var382 & 7;
                                        if (var383 != 0) {
                                            break label307;
                                        }

                                        var351[var301] = false;
                                        var2 -= -227604848;
                                        var2 -= -301259114;
                                        var2 ^= -1551304753;
                                    } else {
                                        var2 = switch (var2) {
                                            case -1200224382 -> {
                                                var2 += 685143541;
                                                var2 -= 45595309;
                                                yield var2 ^ -2103529397;
                                            }
                                            case 178222088 -> var2 ^ -560479130;
                                            default -> var2 ^ 1813942440;
                                        };
                                        Lv var352 = sT_2.qQ;
                                        float var384 = var321 / var278;
                                        var16 = var3;
                                        var18 = var16 + 1L;
                                        var18 = var16 * var18;
                                        var16 = var18 & 1L;
                                        long var481;
                                        int var420 = (var481 = var16 - 0L) == 0L ? 0 : (var481 < 0L ? -1 : 1);
                                        if (var420 != 0) {
                                            var2 -= 2023277072;
                                            var2 += 1550374742;
                                            var2 ^= -1732992093;
                                            break label285;
                                        }
                                        var2 = switch (var2) {
                                            default -> var2 ^ 120613778;
                                            case 1544188545 -> {
                                                var2 >>= 17;
                                                yield var2 ^ -865467174;
                                            }
                                            case 1912329005 -> var2 ^ -1865482461;
                                        };
                                        float var385 = TP.S(var384);
                                        float var353 = var352.l(var385);
                                        float var386 = var262 - var285;
                                        float var482;
                                        int var387 = (var482 = var321 - var386) == 0.0F ? 0 : (var482 < 0.0F ? -1 : 1);
                                        float var394;
                                        if (var387 < 0) {
                                            var2 <<= 23;
                                            var2 ^= -752703847;
                                            int var388 = var2 + 1;
                                            int var389 = var2 * var388;
                                            int var390 = var389 & 1;
                                            if (var390 != 0) {
                                                break label307;
                                            }

                                            float var391 = var278 * 0.5F;
                                            float var392 = var321 / var391;
                                            Integer var421 = var3;
                                            if (var421 == null) {
                                                var2 *= -862544005;
                                                var2 <<= 31;
                                                var2 ^= 661529700;
                                                break label285;
                                            }

                                            var2 ^= -1462444402;
                                            var2 ^= -1642276444;
                                            var2 *= 721780463;
                                            var2 ^= -1054574448;
                                            float var393 = TP.S(var392);
                                            var394 = var393;
                                            var2 *= -2147348111;
                                            var2 -= 1224511359;
                                            var2 |= -1568826867;
                                            var2 &= -671463140;
                                            var2 ^= 1875845722;
                                        } else {
                                            var2 ^= 97836422;
                                            var2 += 1032000045;
                                            var2 -= -2042437592;
                                            var2 ^= -1781271377;
                                            var16 = var2;
                                            var18 = var16 + 1L;
                                            var18 = var16 * var18;
                                            var16 = var18 & 1L;
                                            long var483;
                                            int var424 = (var483 = var16 - 0L) == 0L ? 0 : (var483 < 0L ? -1 : 1);
                                            if (var424 != 0) {
                                                break label307;
                                            }

                                            Lv var425 = sT_2.Jj;
                                            float var17 = var262 - var285;
                                            float var322 = var321 - var17;
                                            float var323 = var322 / var285;
                                            float var324 = var425.l(var323);
                                            float var325 = 1.0F - var324;
                                            int var426 = var3 + 1;
                                            int var427 = var3 * var426;
                                            int var446 = var3 + 2;
                                            int var428 = var427 * var446;
                                            int var447 = var3 + 3;
                                            int var429 = var428 * var447;
                                            int var430 = var429 & 7;
                                            if (var430 != 0) {
                                                switch (var2) {
                                                    case -1390587154:
                                                        var2 ^= -1567069246;
                                                        break label285;
                                                    case 355261937:
                                                        var2 -= -902926077;
                                                        var2 += 655886737;
                                                        var2 ^= -713534949;
                                                        break label285;
                                                    case 355632203:
                                                    default:
                                                        var2 ^= -948052241;
                                                        break label285;
                                                }
                                            }

                                            var2 |= 111436459;
                                            var2 |= 836993376;
                                            var2 |= -464689464;
                                            var2 ^= 1007956396;
                                            int var431 = var2 + 1;
                                            int var432 = var2 * var431;
                                            int var433 = var432 & 1;
                                            if (var433 != 0) {
                                                break label307;
                                            }

                                            var394 = var325;
                                            var2 -= 1449458015;
                                            var2 <<= 19;
                                            var2 ^= 259353414;
                                        }

                                        var16 = var2;
                                        var18 = var16 + 1L;
                                        var18 = var16 * var18;
                                        long var20 = var16 + 2L;
                                        var18 *= var20;
                                        var16 += 3L;
                                        var18 *= var16;
                                        var16 = var18 & 7L;
                                        long var484;
                                        var310 = (var484 = var16 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                                        if (var310 != 0) {
                                            break label307;
                                        }

                                        float[] var395 = this.Oo;
                                        float var437 = var395[var301];
                                        NumberSetting var448 = this.o;
                                        float var449 = var448.WM();
                                        float var450 = var449 * var244;
                                        float var460 = 0.6F * var394;
                                        float var461 = 0.4F + var460;
                                        float var451 = var450 * var461;
                                        float var438 = var437 + var451;
                                        var395[var301] = var438;
                                        Integer var396 = var3;
                                        if (var396 == null) {
                                            switch (var2) {
                                                case -1464505530:
                                                    var2 |= -1594296528;
                                                    var2 ^= 1829678170;
                                                    var2 |= -1087102949;
                                                    var2 ^= 1486444379;
                                                    break label285;
                                                case -1135655448:
                                                default:
                                                    var2 ^= -1933031812;
                                                    break label285;
                                                case -141582054:
                                                    var2 ^= 298481597;
                                                    break label285;
                                            }
                                        }

                                        var2 -= 145412341;
                                        var2 <<= 10;
                                        var2 &= 1040161024;
                                        var2 |= -469440819;
                                        var2 ^= 889549748;
                                        Integer var397 = var2;
                                        if (var397 == null) {
                                            break label307;
                                        }

                                        float var485;
                                        int var398 = (var485 = var394 - 0.002F) == 0.0F ? 0 : (var485 < 0.0F ? -1 : 1);
                                        if (var398 <= 0) {
                                            var2 -= -925134089;
                                            var2 -= -91318647;
                                            var2 &= -1706964971;
                                            var2 ^= -23138538;
                                            var2 |= 1218073603;
                                            var2 |= -1385174805;
                                            var2 &= -2018945363;
                                            var2 ^= 277394655;
                                        } else {
                                            var2 -= -1919639040;
                                            var2 -= -1021328811;
                                            var2 |= -1663082731;
                                            var2 ^= 1891231419;
                                            var2 ^= -610230794;
                                            NumberSetting var399 = this.U;
                                            float var400 = var399.WM();
                                            float var354 = Math.max(0.05F, var353);
                                            float var355 = var400 * var354;
                                            float var356 = var355 * 1.3F;
                                            float[] var401 = this.Oo;
                                            float var402 = var401[var301];
                                            double var403 = var402;
                                            double var404 = Math.cos(var403);
                                            float var405 = (float)var404;
                                            float var406 = var405 * var356;
                                            float[] var439 = this.Oo;
                                            float var440 = var439[var301];
                                            double var441 = var440;
                                            double var442 = Math.sin(var441);
                                            float var443 = (float)var442;
                                            float var357 = var443 * var356;
                                            var292.save();
                                            double[] var444 = this.Zk;
                                            double var445 = var444[var301];
                                            double[] var462 = this.B;
                                            double var463 = var462[var301];
                                            double[] var464 = this.D;
                                            double var465 = var464[var301];
                                            double var22 = var406;
                                            double var24 = var357;
                                            float var358 = -var357;
                                            double var26 = var358;
                                            Integer var359 = var3;
                                            if (var359 == null) {
                                                var2 += 701176320;
                                                var2 += 1371463457;
                                                var2 ^= -1066821137;
                                                var2 ^= -731365358;
                                                break label285;
                                            }

                                            var2 >>= 2;
                                            var2 ^= 2143829246;
                                            long var28 = var2;
                                            long var30 = var28 + 1L;
                                            var30 = var28 * var30;
                                            long var32 = var28 + 2L;
                                            var30 *= var32;
                                            var28 += 3L;
                                            var30 *= var28;
                                            var28 = var30 & 7L;
                                            long var486;
                                            int var360 = (var486 = var28 - 0L) == 0L ? 0 : (var486 < 0L ? -1 : 1);
                                            if (var360 != 0) {
                                                break label307;
                                            }

                                            double var361 = var406;
                                            boolean var362 = var295.plane(var292, var445, var463, var465, var22, 0.0, var24, var26, 0.0, var361);
                                            if (var362) {
                                                var2 &= -764830644;
                                                var2 |= 624897659;
                                                var2 *= -1354125;
                                                var2 -= 2144806843;
                                                var2 ^= -7203098;
                                                int var363 = var2 + 1;
                                                int var364 = var2 * var363;
                                                int var365 = var364 & 1;
                                                if (var365 != 0) {
                                                    break label307;
                                                }

                                                int var366 = var2 << 7;
                                                int var367 = var366 | -712876922;
                                                int var368 = var367 + 1476795031;
                                                int var369 = var368 ^ 38708929;
                                                this.ft(var292, var301, var394, var291, var369);
                                                var2 &= -268538264;
                                                var2 ^= -370061460;
                                                var2 += 903095761;
                                                var2 ^= 1932178875;
                                            } else {
                                                var2 ^= 2072136230;
                                                var2 ^= 1432973971;
                                                var2 *= -1315983729;
                                                var2 &= -2081451413;
                                                var2 ^= -257540851;
                                            }

                                            long var328 = var2;
                                            var15 = var328 + 1L;
                                            var15 = var328 * var15;
                                            long var329 = var15 & 1L;
                                            long var487;
                                            var310 = (var487 = var329 - 0L) == 0L ? 0 : (var487 < 0L ? -1 : 1);
                                            if (var310 != 0) {
                                                break label307;
                                            }

                                            var292.restore();
                                            var2 |= -1702079383;
                                            var2 |= -383823818;
                                            var2 ^= 1824431885;
                                        }
                                    }
                                }

                                var310 = var2 + 1;
                                var310 = var2 * var310;
                                var310 &= 1;
                                if (var310 != 0) {
                                    break label307;
                                }

                                var310 = var301 + 1;
                                int var370 = var3 + 1;
                                int var371 = var3 * var370;
                                int var372 = var371 & 1;
                                if (var372 != 0) {
                                    var2 |= -643771700;
                                    var2 ^= 450880346;
                                    var2 >>= 7;
                                    var2 ^= 1491392583;
                                    break label285;
                                }

                                var2 |= 144037659;
                                var2 &= -395018311;
                                var2 ^= -1059738267;
                                var301 = var310;
                                var2 += -1218178716;
                                var2 |= -125723138;
                                var2 *= -267097575;
                                var2 ^= -1639086208;
                            }
                        }
                    } else {
                        var2 += -2048708165;
                        var2 ^= -767161445;
                    }

                    this.J();
                    return;
                } else {
                    var2 &= -1239804974;
                    var2 -= 1401747577;
                    var2 ^= 1159544253;
                }
            }

            UnsupportedOperationException var227 = new UnsupportedOperationException();
            throw var227;
        }

        IllegalArgumentException var222 = new IllegalArgumentException();
        throw var222;
    }

    private void ft(Canvas var1, int var2, float var3, double var4, int var6) {
        int var9 = System.identityHashCode(this);
        zS var10 = this.N;
        float[] var11 = this.tl;
        float var134 = var11[var2];
        int var130 = var10.x(var134, var4);
        int var131 = DP.Y(var130, var3);
        int var135 = var131 | 16777215;
        long var12 = var9;
        long var14 = var12 + 1L;
        var14 = var12 * var14;
        long var16 = var12 + 2L;
        var14 *= var16;
        var12 += 3L;
        var14 *= var12;
        var12 = var14 & 7L;
        long var244;
        int var140 = (var244 = var12 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
        if (var140 != 0) {
            int var117 = var6 | -1946405363;
            var117 -= -753136148;
            var117 ^= -945577250;
        } else {
            label161: {
                int var7 = var6 + 560942378;
                var7 -= -1204355324;
                var7 &= 1335213699;
                var7 ^= -1512732574;
                int var141 = var2 + 1;
                int var142 = var2 * var141;
                int var143 = var142 & 1;
                label145:
                if (var143 == 0) {
                    int var136 = DP.Z(var131, var135, 0.2F);
                    float var144 = 0.7692308F;
                    ModeSetting var13 = this.Sf;
                    Enum var146 = var13.A();
                    Ll var147 = (Ll)var146;
                    int var148 = var147.ordinal();
                    switch (var148) {
                        case 0:
                            var7 -= 891196841;
                            var7 ^= 1244966579;
                            var7 ^= 959454818;
                            var7 ^= 330177027;
                            long var168 = var2;
                            long var208 = var168 + 1L;
                            var208 = var168 * var208;
                            long var169 = var208 & 1L;
                            long var250;
                            int var170 = (var250 = var169 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                            if (var170 != 0) {
                                break label145;
                            }

                            SpriteShape var171 = SpriteShape.RING;
                            float var191 = 1.0F - var144;
                            var1.sprite(var171, 0.0F, 0.0F, var144, var191, var136, var131, 0.0F);
                            SpriteShape var137 = SpriteShape.GLOW;
                            long var172 = var9;
                            var208 = var172 + 1L;
                            var208 = var172 * var208;
                            long var228 = var172 + 2L;
                            var208 *= var228;
                            long var173 = var172 + 3L;
                            var208 *= var173;
                            long var174 = var208 & 7L;
                            long var251;
                            var9 = (var251 = var174 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                switch (var7) {
                                    case -1578879342:
                                        var7 ^= 688473155;
                                        break label161;
                                    case -1064239666:
                                    default:
                                        var7 ^= -1265203779;
                                        break label161;
                                    case 412637285:
                                        var7 &= -352998434;
                                        var7 += 486509956;
                                        var7 *= 1121594349;
                                        var7 &= 896857703;
                                        var7 ^= 455362831;
                                        break label161;
                                }
                            }

                            var7 |= 438635556;
                            var7 += 50261449;
                            var7 -= 516822469;
                            var7 ^= 1630848299;
                            Integer var124 = var2;
                            if (var124 == null) {
                                break label145;
                            }

                            float var125 = var144 * 0.95F;
                            int var145 = DP.nq(var131, 0.12F);
                            int var132 = DP.nq(var131, 0.0F);
                            var1.sprite(var137, 0.0F, 0.0F, 0.0F, var125, var145, var132, 0.0F);
                            var7 &= -339331815;
                            var7 &= 1124521738;
                            var7 ^= 609226701;
                            break;
                        case 1:
                            var7 = switch (var7) {
                                case -1387165600 -> {
                                    var7 *= 772965183;
                                    var7 += 1770974423;
                                    var7 &= 1424747428;
                                    var7 += -609887548;
                                    yield var7 ^ 83277671;
                                }
                                default -> var7 ^ 1001670173;
                                case 1021960680 -> var7 ^ 713511608;
                            };
                            Integer var166 = var2;
                            if (var166 == null) {
                                break label145;
                            }

                            SpriteShape var167 = SpriteShape.PORTAL;
                            float var190 = var144 * 0.9F;
                            float var206 = var144 * 0.9F;
                            var206 = 1.0F - var206;
                            double var219 = var4 * 1.6;
                            float[] var230 = this.tl;
                            float var231 = var230[var2];
                            float var232 = var231 * 30.0F;
                            double var233 = var232;
                            double var220 = var219 + var233;
                            int var234 = var9 + 1;
                            int var235 = var9 * var234;
                            int var236 = var235 & 1;
                            if (var236 != 0) {
                                switch (var7) {
                                    case -1641857881:
                                    default:
                                        var7 ^= 893797217;
                                        break label161;
                                    case -549923441:
                                        var7 >>= 27;
                                        var7 ^= -457181996;
                                        break label161;
                                    case 1079283961:
                                        var7 ^= 1986993344;
                                        break label161;
                                }
                            }

                            var7 ^= -1720734553;
                            var7 ^= 1253186888;
                            long var237 = var2;
                            long var20 = var237 + 1L;
                            var20 = var237 * var20;
                            long var22 = var237 + 2L;
                            var20 *= var22;
                            long var238 = var237 + 3L;
                            var20 *= var238;
                            long var239 = var20 & 7L;
                            long var249;
                            int var240 = (var249 = var239 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                            if (var240 != 0) {
                                break label145;
                            }

                            float var221 = (float)var220;
                            var1.sprite(var167, 0.0F, 0.0F, var190, var206, var136, var131, var221);
                            var7 ^= -1991965777;
                            var7 *= -941490377;
                            var7 ^= -2053218124;
                            break;
                        case 2:
                            var7 -= -1931352326;
                            var7 |= 1539089749;
                            var7 -= -405836297;
                            var7 ^= -1901550545;
                            SpriteShape var157 = SpriteShape.RING;
                            float var182 = 1.0F - var144;
                            float var183 = var182 * 0.8F;
                            var1.sprite(var157, 0.0F, 0.0F, var144, var183, var136, var131, 0.0F);
                            SpriteShape var158 = SpriteShape.RING;
                            float var184 = var144 * 0.62F;
                            float var204 = 1.0F - var144;
                            var204 *= 0.45F;
                            int var218 = DP.nq(var136, 0.65F);
                            int var227 = DP.nq(var131, 0.65F);
                            var1.sprite(var158, 0.0F, 0.0F, var184, var204, var218, var227, 0.0F);
                            Integer var159 = var9;
                            if (var159 == null) {
                                switch (var7) {
                                    case -1430676699:
                                    default:
                                        var7 ^= 421668724;
                                        break label161;
                                    case 4140404:
                                        var7 ^= -2129101081;
                                        break label161;
                                    case 446206895:
                                        var7 ^= -1426539393;
                                        var7 >>>= 28;
                                        var7 *= -250026929;
                                        var7 ^= 1196541002;
                                        break label161;
                                }
                            }
                            var7 = switch (var7) {
                                case 446206895 -> {
                                    var7 -= 486371742;
                                    var7 >>>= 17;
                                    var7 ^= -1053466791;
                                    yield var7 ^ 1004655559;
                                }
                                default -> var7 ^ -461588807;
                                case 1065304854 -> var7 ^ 727509401;
                            };
                            int var160 = var2 + 1;
                            int var161 = var2 * var160;
                            int var185 = var2 + 2;
                            int var162 = var161 * var185;
                            int var186 = var2 + 3;
                            int var163 = var162 * var186;
                            int var164 = var163 & 7;
                            if (var164 != 0) {
                                break label145;
                            }

                            float var165 = var144 * 0.81F;
                            int var187 = var7 ^ -1272210786;
                            int var188 = var187 << 14;
                            int var189 = var188 ^ -1286096323;
                            Pw(var1, var165, var136, var189);
                            var7 -= -146464616;
                            var7 |= -1683447188;
                            var7 ^= -1124209358;
                            break;
                        case 3:
                            var7 &= -899054632;
                            var7 ^= 1394149673;
                            long var152 = var2;
                            long var201 = var152 + 1L;
                            var201 = var152 * var201;
                            long var153 = var201 & 1L;
                            long var246;
                            int var154 = (var246 = var153 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                            if (var154 != 0) {
                                break label145;
                            }

                            SpriteShape var155 = SpriteShape.HEXAGON;
                            float var180 = 1.0F - var144;
                            var1.sprite(var155, 0.0F, 0.0F, var144, var180, var136, var131, 0.0F);
                            SpriteShape var156 = SpriteShape.GLOW;
                            float var181 = var144 * 0.9F;
                            int var203 = DP.nq(var131, 0.1F);
                            var16 = var9;
                            long var18 = var16 + 1L;
                            var18 = var16 * var18;
                            var16 = var18 & 1L;
                            long var247;
                            int var216 = (var247 = var16 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                            if (var216 != 0) {
                                switch (var7) {
                                    case -722400388:
                                        var7 ^= 545391507;
                                        break label161;
                                    case -614954647:
                                        var7 >>>= 5;
                                        var7 ^= 496684900;
                                        break label161;
                                    case 778272274:
                                    default:
                                        var7 ^= -478915898;
                                        break label161;
                                }
                            }
                            var7 = switch (var7) {
                                case -1253322756 -> var7 ^ -1872550867;
                                case -614954647 -> {
                                    var7 += 1861168439;
                                    var7 -= -1504441777;
                                    yield var7 ^ 671551132;
                                }
                                default -> var7 ^ 184677300;
                            };
                            int var217 = DP.nq(var131, 0.0F);
                            var1.sprite(var156, 0.0F, 0.0F, 0.0F, var181, var203, var217, 0.0F);
                            var7 *= 1326786055;
                            var7 &= 1407715259;
                            var7 ^= 1727668054;
                            break;
                        case 4:
                            var7 = switch (var7) {
                                case -1387165600 -> {
                                    var7 -= 189939742;
                                    var7 &= -2084093637;
                                    yield var7 ^ 1576275781;
                                }
                                default -> var7 ^ -1748923745;
                                case 1683937247 -> var7 ^ 635926769;
                            };
                            Integer var150 = var2;
                            if (var150 == null) {
                                break label145;
                            }

                            SpriteShape var151 = SpriteShape.BOLD_RING;
                            float var179 = 1.0F - var144;
                            long var197 = var9;
                            long var223 = var197 + 1L;
                            var223 = var197 * var223;
                            long var19 = var197 + 2L;
                            var223 *= var19;
                            var197 += 3L;
                            var223 *= var197;
                            var197 = var223 & 7L;
                            long var245;
                            int var200 = (var245 = var197 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                            if (var200 != 0) {
                                var7 ^= -1907353867;
                                var7 -= -929401245;
                                var7 ^= -1007762921;
                                var7 ^= 1365650039;
                                break label161;
                            }

                            var7 *= -287628573;
                            var7 >>= 22;
                            var7 |= 2048859458;
                            var7 |= -887630405;
                            var7 ^= -1214699252;
                            var1.sprite(var151, 0.0F, 0.0F, var144, var179, var136, var131, 0.0F);
                            var7 >>>= 16;
                            var7 ^= 659707563;
                            break;
                        case 5:
                            var7 -= -1427400326;
                            var7 += -1732817985;
                            var7 ^= 703531723;
                            SpriteShape var149 = SpriteShape.SCIFI;
                            float var178 = var144 * 1.05F;
                            Integer var15 = var9;
                            if (var15 == null) {
                                var7 *= 1429216367;
                                var7 |= 580392545;
                                var7 |= 69490849;
                                var7 ^= -1229918876;
                                var7 ^= 51362232;
                                break label161;
                            }
                            var7 = switch (var7) {
                                case -1292750738 -> {
                                    var7 &= -1007551804;
                                    yield var7 ^ 11486658;
                                }
                                case -230605012 -> var7 ^ -269136199;
                                default -> var7 ^ 1494903086;
                            };
                            long var192 = var2;
                            long var17 = var192 + 1L;
                            var17 = var192 * var17;
                            long var193 = var17 & 1L;
                            long var248;
                            int var194 = (var248 = var193 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label145;
                            }

                            float var195 = var144 * 1.05F;
                            float var196 = 1.0F - var195;
                            var1.sprite(var149, 0.0F, 0.0F, var178, var196, var136, var131, 0.0F);
                            var7 -= -791769930;
                            var7 *= 1189279017;
                            var7 ^= -1577695331;
                            break;
                        default:
                            var7 -= 1422696004;
                            var7 ^= 2144793809;
                    }

                    var9 = var2 + 1;
                    var9 = var2 * var9;
                    int var133 = var2 + 2;
                    var9 *= var133;
                    int var8 = var2 + 3;
                    var9 *= var8;
                    var8 = var9 & 7;
                    if (var8 == 0) {
                        return;
                    }
                }

                RuntimeException var122 = new RuntimeException();
                throw var122;
            }
        }

        AssertionError var120 = new AssertionError();
        throw var120;
    }

    private static void Pw(Canvas var0, float var1, int var2, int var3) {
        int var5 = var2;
        int var6 = System.identityHashCode(var0);
        TextStyle var7 = TextStyle.of(1.0F, var2);
        Integer var8 = var6;
        if (var8 == null) {
            int var43 = var3 | 992646694;
            var43 += -1182543535;
            var43 ^= -712081182;
        } else {
            label72: {
                int var4 = var3 + -1995101658;
                var4 -= -625243322;
                var4 ^= -1300012083;
                int var55 = var2 + 1;
                var55 = var2 * var55;
                int var9 = var2 + 2;
                var55 *= var9;
                var9 = var2 + 3;
                var55 *= var9;
                var55 &= 7;
                if (var55 == 0) {
                    var7 = var7.bold();
                    var7 = var7.spacing(0.08F);
                    float var60 = (float) (Math.PI * 2) * var1;
                    float var51 = var0.measure("AURA VISUALS  •  AURA VISUALS  •  ", var7);
                    float var52 = Math.max(var51, 0.001F);
                    float var53 = var60 / var52;
                    float var54 = var53;
                    TextStyle var61 = TextStyle.of(var53, var2);
                    TextStyle var62 = var61.bold();
                    float var66 = var53 * 0.08F;
                    TextStyle var63 = var62.spacing(var66);
                    TextStyle var64 = var63;
                    float var67 = 0.0F;
                    String[] var10 = CH;
                    String[] var69 = var10;
                    int var11 = var10.length;
                    var11 = var11;
                    int var12 = 0;
                    float var68 = var67;
                    var12 = var12;
                    var4 |= -1832312013;
                    var4 += 1429582114;
                    var4 ^= -1468868439;

                    while (true) {
                        int var13 = var5 + 1;
                        var13 = var5 * var13;
                        var13 &= 1;
                        if (var13 != 0) {
                            break;
                        }

                        if (var12 >= var11) {
                            switch (var4) {
                                case -2118387982:
                                    var4 ^= -1814255170;
                                    break;
                                case -1522436676:
                                    var4 += 616850770;
                                    var4 |= 1383120793;
                                    var4 -= -857520336;
                                    var4 ^= -1667823399;
                                    break;
                                case 205317435:
                                default:
                                    var4 ^= 2147374447;
                            }

                            Integer var47 = var5;
                            if (var47 != null) {
                                return;
                            }
                            break;
                        }
                        var4 = switch (var4) {
                            case -1522436676 -> {
                                var4 >>>= 8;
                                var4 ^= -201515888;
                                var4 |= -2035473185;
                                var4 *= -1604953921;
                                yield var4 ^ -1392647821;
                            }
                            case 951326342 -> var4 ^ 24582172;
                            default -> var4 ^ -1530885597;
                        };
                        var13 = var5 + 1;
                        var13 = var5 * var13;
                        var13 &= 1;
                        if (var13 != 0) {
                            break;
                        }

                        String var77 = var69[var12];
                        float var14 = var0.measure(var77, var64);
                        float var15 = var64.letterSpacing();
                        var14 += var15;
                        var14 /= var1;
                        var0.save();
                        var15 = var14 * 0.5F;
                        var15 = var68 + var15;
                        var0.rotate(var15);
                        var15 = -var1;
                        int var16 = var6 + 1;
                        var16 = var6 * var16;
                        int var17 = var6 + 2;
                        var16 *= var17;
                        var17 = var6 + 3;
                        var16 *= var17;
                        var16 &= 7;
                        if (var16 != 0) {
                            switch (var4) {
                                case -205733628:
                                default:
                                    var4 ^= -1244929895;
                                    break label72;
                                case 128897235:
                                    var4 ^= 1860065122;
                                    break label72;
                                case 1910982706:
                                    var4 *= -1266860081;
                                    var4 ^= -1941053156;
                                    break label72;
                            }
                        }

                        var4 &= -255177071;
                        var4 ^= -631580928;
                        long var92 = var5;
                        long var18 = var92 + 1L;
                        var18 = var92 * var18;
                        long var93 = var18 & 1L;
                        long var97;
                        var16 = (var97 = var93 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                        if (var16 != 0) {
                            break;
                        }

                        var0.translate(0.0F, var15);
                        var15 = -var54;
                        var15 *= 0.5F;
                        float var78 = var0.textCentered(var77, 0.0F, var15, var64);
                        var0.restore();
                        float var79 = var68 + var14;
                        int var82 = var12 + 1;
                        var68 = var79;
                        var12 = var82;
                        var4 &= -1873137300;
                        var4 ^= 626615484;
                    }
                }

                UnsupportedOperationException var48 = new UnsupportedOperationException();
                throw var48;
            }
        }

        UnsupportedOperationException var46 = new UnsupportedOperationException();
        throw var46;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2078520400;
        int var2 = Module.C;
        int var4 = of_2.kj(var3, var1, var2);
        Wo = var4;
        String[] var5 = "AURA VISUALS  •  AURA VISUALS  •  ".split("");
        CH = var5;
    }
}
