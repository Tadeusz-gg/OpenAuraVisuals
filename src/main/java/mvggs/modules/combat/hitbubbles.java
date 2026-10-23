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
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public final class hitbubbles extends Module {
    private static final int C = 32;
    private final ModeSetting mS;
    private final NumberSetting aK;
    private final NumberSetting Gd;
    private final NumberSetting l;
    private final NumberSetting XD;
    private final NumberSetting h;
    private final NumberSetting Pl;
    private final zS SQ;
    private final BooleanSetting H;
    private final double[] Q;
    private final double[] r;
    private final double[] ModuleManager;
    private final float[] W;
    private final float[] I;
    private final float[] Tn;
    private final float[] m;
    private final float[] dN;
    private final float[] GB;
    private final float[] xH;
    private final float[] e;
    private final float[] N;
    private final float[] yP;
    private final boolean[] M;
    private final double[] Tp;
    private int X;
    private Object P;
    public static final int uf;

    public hitbubbles() {
        super("hit_bubbles", "Hit Bubbles", ModuleCategory.COMBAT);
        ModuleCategory var1 = ModuleCategory.COMBAT;

        IH var2 = IH.PORTAL;
        ModeSetting var3 = new ModeSetting("style", "Style", var2);
        Setting var4 = this.addSetting(var3);
        ModeSetting var5 = (ModeSetting)var4;
        this.mS = var5;
        NumberSetting var6 = new NumberSetting("size", "Radius", 0.5F, 0.2F, 1.2F);
        NumberSetting var7 = var6.W(0.05F);
        NumberSetting var8 = var7.L("m");
        Setting var9 = this.addSetting(var8);
        NumberSetting var10 = (NumberSetting)var9;
        this.aK = var10;
        NumberSetting var11 = new NumberSetting("spin", "Spin", 2.0F, 0.0F, 5.0F);
        NumberSetting var12 = var11.W(0.1F);
        Setting var13 = this.addSetting(var12);
        NumberSetting var14 = (NumberSetting)var13;
        this.Gd = var14;
        NumberSetting var15 = new NumberSetting("appear", "Appear", 0.3F, 0.05F, 1.5F);
        NumberSetting var16 = var15.W(0.05F);
        NumberSetting var17 = var16.L("s");
        Setting var18 = this.addSetting(var17);
        NumberSetting var19 = (NumberSetting)var18;
        this.l = var19;
        NumberSetting var20 = new NumberSetting("hold", "Hold", 0.5F, 0.0F, 2.0F);
        NumberSetting var21 = var20.W(0.05F);
        NumberSetting var22 = var21.L("s");
        Setting var23 = this.addSetting(var22);
        NumberSetting var24 = (NumberSetting)var23;
        this.XD = var24;
        NumberSetting var25 = new NumberSetting("fade", "Fade", 0.5F, 0.1F, 2.0F);
        NumberSetting var26 = var25.W(0.05F);
        NumberSetting var27 = var26.L("s");
        Setting var28 = this.addSetting(var27);
        NumberSetting var29 = (NumberSetting)var28;
        this.h = var29;
        NumberSetting var30 = new NumberSetting("glow", "Glow", 0.7F, 0.0F, 1.0F);
        NumberSetting var31 = var30.W(0.05F);
        Setting var32 = this.addSetting(var31);
        NumberSetting var33 = (NumberSetting)var32;
        this.Pl = var33;
        zS var34 = new zS();
        nM var35 = this.bU(var34);
        zS var36 = (zS)var35;
        this.SQ = var36;
        BooleanSetting var37 = new BooleanSetting("crit_only", "Crits Only", false);
        Setting var38 = this.addSetting(var37);
        BooleanSetting var39 = (BooleanSetting)var38;
        this.H = var39;
        double[] var40 = new double[32];
        this.Q = var40;
        double[] var41 = new double[32];
        this.r = var41;
        double[] var42 = new double[32];
        this.ModuleManager = var42;
        float[] var43 = new float[32];
        this.W = var43;
        float[] var44 = new float[32];
        this.I = var44;
        float[] var45 = new float[32];
        this.Tn = var45;
        float[] var46 = new float[32];
        this.m = var46;
        float[] var47 = new float[32];
        this.dN = var47;
        float[] var48 = new float[32];
        this.GB = var48;
        float[] var49 = new float[32];
        this.xH = var49;
        float[] var50 = new float[32];
        this.e = var50;
        float[] var51 = new float[32];
        this.N = var51;
        float[] var52 = new float[32];
        this.yP = var52;
        boolean[] var53 = new boolean[32];
        this.M = var53;
        double[] var54 = new double[6];
        this.Tp = var54;
        this.dy("A spinning disc of light that pops open where your hit lands.");
        this.fJ(true);
        EventListener<HitEvent> var55 = (HitEvent var1x) -> {
            label80: {
                int var2x = uf;
                var2x ^= 957887425;
                int var3x = System.identityHashCode(this);
                BooleanSetting var4x = this.H;
                long var5x = var3x;
                long var7x = var5x + 1L;
                var7x = var5x * var7x;
                long var9x = var5x + 2L;
                var7x *= var9x;
                var5x += 3L;
                var7x *= var5x;
                var5x = var7x & 7L;
                long var91;
                int var73 = (var91 = var5x - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                if (var73 != 0) {
                    var2x -= -134294880;
                    var2x ^= -456950579;
                    var2x <<= 15;
                    var2x *= 1557428041;
                    var2x ^= -1867979864;
                } else {
                    label89: {
                        var2x -= 1136632822;
                        var2x *= 648674859;
                        var2x ^= 1052786075;
                        int var74 = var2x + 1;
                        int var75 = var2x * var74;
                        int var76 = var75 & 1;
                        if (var76 != 0) {
                            break label80;
                        }

                        label87: {
                            boolean var63 = var4x.vb();
                            if (var63) {
                                var2x += -369155788;
                                var2x += -2110949304;
                                var2x *= -1301467859;
                                var2x *= 1467000765;
                                var2x ^= 1044593380;
                                int var64 = var2x + 1;
                                int var65 = var2x * var64;
                                int var77 = var2x + 2;
                                int var66 = var65 * var77;
                                int var78 = var2x + 3;
                                int var67 = var66 * var78;
                                int var68 = var67 & 7;
                                if (var68 != 0) {
                                    break label80;
                                }

                                boolean var69 = var1x.crit();
                                int var79 = var3x + 1;
                                int var80 = var3x * var79;
                                int var6x = var3x + 2;
                                int var81 = var80 * var6x;
                                var6x = var3x + 3;
                                int var82 = var81 * var6x;
                                int var83 = var82 & 7;
                                if (var83 != 0) {
                                    var2x -= 1668209886;
                                    var2x >>= 17;
                                    var2x *= -1908702557;
                                    var2x ^= 1595075862;
                                    break label89;
                                }

                                var2x |= 644329812;
                                var2x += 236838507;
                                var2x *= -313827459;
                                var2x ^= -1484101339;
                                Integer var84 = var2x;
                                if (var84 == null) {
                                    break label80;
                                }

                                if (!var69) {
                                    switch (var2x) {
                                        case -1385784759:
                                        default:
                                            var2x ^= 877183142;
                                            break label87;
                                        case 1924035054:
                                            var2x ^= 1590457221;
                                            var2x += 455665413;
                                            var2x *= -364347615;
                                            var2x -= 217386541;
                                            var2x ^= 1796423442;
                                            break label87;
                                        case 1963477601:
                                            var2x ^= -488010846;
                                            break label87;
                                    }
                                }

                                var2x += 504621082;
                                var2x &= 1798994974;
                                var2x >>= 7;
                                var2x ^= 694667742;
                            } else {
                                switch (var2x) {
                                    case -1378503504:
                                    default:
                                        var2x ^= -68282742;
                                        break;
                                    case -705967074:
                                        var2x ^= 1820899045;
                                        break;
                                    case 1945953904:
                                        var2x >>= 8;
                                        var2x *= 142387731;
                                        var2x ^= -1802285956;
                                }
                            }

                            Entity var70 = var1x.target();
                            int var85 = var3x + 1;
                            int var86 = var3x * var85;
                            var3x = var86 & 1;
                            if (var3x != 0) {
                                var2x |= 1085926913;
                                var2x ^= -746451769;
                                break label89;
                            }
                            var2x = switch (var2x) {
                                default -> var2x ^ -340778801;
                                case 694668654 -> {
                                    var2x -= 490507051;
                                    var2x ^= 1535765927;
                                    var2x &= 1277946275;
                                    yield var2x ^ -1159114676;
                                }
                                case 737317422 -> var2x ^ -1351455351;
                            };
                            Integer var54x = var2x;
                            if (var54x == null) {
                                break label80;
                            }

                            int var55x = var2x & 1973845224;
                            var55x >>>= 7;
                            var55x ^= -1232011801;
                            var55x += -723338095;
                            var55x ^= 844906719;
                            this.dC(var70, var55x);
                            switch (var2x) {
                                case -1684098077:
                                    var2x ^= 386571444;
                                    break;
                                case -1086040839:
                                default:
                                    var2x ^= 679439795;
                                    break;
                                case -20186644:
                                    var2x &= -1917109073;
                                    var2x ^= -86401283;
                            }
                        }

                        var3x = var2x + 1;
                        var3x = var2x * var3x;
                        var2x = var3x & 1;
                        if (var2x == 0) {
                            return;
                        }
                        break label80;
                    }
                }

                AssertionError var62 = new AssertionError();
                throw var62;
            }

            IllegalArgumentException var52x = new IllegalArgumentException();
            throw var52x;
        };
        this.onEvent(HitEvent.class, var55);
        EventListener<RenderEvent> var56 = this::L;
        this.onEvent(RenderEvent.class, var56);
    }

    @Override
    protected void J() {
        int var1 = uf;
        var1 ^= 748042464;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var23 = var4 & 1L;
        long var35;
        var2 = (var35 = var23 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        int var3 = of_2.dS;
        var1 ^= var3;
        var1 ^= -1699540653;
        of_2.dS = -1699540653;
        var3 = of_2.xt;
        var1 ^= var3;
        var1 ^= -269044417;
        of_2.xt = -269044417;
        if (var2 != 0) {
            long var25 = switch (var1) {
                case -526576106 -> {
                    var1 += -419426122;
                    var1 &= 1659295571;
                    var1 >>= 26;
                    yield var1 ^ -2102142564;
                }
                default -> var1 ^ 1085273690;
                case 1586361646 -> var1 ^ -1358506045;
            };
            var4 = var25 + 1L;
            var4 = var25 * var4;
            long var26 = var4 & 1L;
            long var36;
            var2 = (var36 = var26 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var28 = new IllegalStateException();
                throw var28;
            }
        } else {
            var1 *= 984394887;
            var1 ^= 1410432696;
            long var17 = var1;
            long var30 = var17 + 1L;
            long var31 = var17 * var30;
            long var18 = var31 & 1L;
            long var37;
            var1 = (var37 = var18 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                boolean[] var21 = this.M;
                Arrays.fill(var21, false);
                this.P = null;
                return;
            }
        }

        RuntimeException var20 = new RuntimeException();
        throw var20;
    }

    private void dC(Entity var1, int var2) {
        label121: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            int var6 = var4 + 2;
            var5 *= var6;
            var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                int var3 = var2 & 360910916;
                var3 += 399196303;
                var3 -= -2037175152;
                var3 -= -340634356;
                var3 ^= -1159938365;
            } else {
                label134: {
                    int var30 = switch (var2) {
                        case -1191119496 -> {
                            int var31 = var2 & 173617844;
                            var31 *= -1078548143;
                            var31 >>= 12;
                            var31 -= 763609239;
                            yield var31 ^ 1921349212;
                        }
                        default -> var2 ^ 1509090749;
                        case 1976967280 -> var2 ^ 657889757;
                    };
                    Integer var122 = var30;
                    if (var122 == null) {
                        break label121;
                    }

                    var122 = (Integer)this.P;
                    if (var122 != null) {
                        var30 |= 1098844054;
                        var30 += 500096551;
                        var30 <<= 11;
                        var30 |= 703903794;
                        var30 ^= 1225269000;
                        var122 = var30;
                        if (var122 == null) {
                            break label121;
                        }

                        var122 = (Integer)this.P;
                        Integer var137 = var4;
                        if (var137 == null) {
                            var30 -= 1109651199;
                            var30 -= 917216787;
                            var30 |= 124627476;
                            var30 ^= -1268003888;
                            var30 ^= 123535388;
                            break label134;
                        }

                        var30 &= 1008953155;
                        var30 ^= 51392342;
                        var137 = var30;
                        if (var137 == null) {
                            break label121;
                        }

                        World var139 = var1.getEntityWorld();
                        if ((Object)var122 != var139) {
                            var30 |= 1618370035;
                            var30 >>>= 28;
                            var30 |= 862047080;
                            var30 *= -1974176221;
                            var30 ^= 369286964;
                            var122 = var30;
                            if (var122 == null) {
                                break label121;
                            }

                            this.J();
                            var30 &= 848367161;
                            var30 *= 1218173609;
                            var30 += -1784213225;
                            var30 ^= 298201069;
                        } else {
                            var30 ^= -1079409279;
                            var30 &= -1014471015;
                            var30 ^= 1100270774;
                            var30 &= 1892839339;
                            var30 ^= -324704170;
                        }
                    } else {
                        var30 |= 134464728;
                        var30 -= -795763346;
                        var30 >>= 24;
                        var30 ^= 1397415853;
                    }

                    int var127 = var30 + 1;
                    var127 = var30 * var127;
                    var127 &= 1;
                    if (var127 != 0) {
                        break label121;
                    }

                    World var130 = var1.getEntityWorld();
                    this.P = var130;
                    ClientRuntime var131 = ClientRuntime.Z();
                    AuraPipeline var132 = var131.Ul();
                    FrameContext var133 = var132.frame();
                    float var134 = var133.partialTick();
                    double[] var140 = this.Tp;
                    ht.xN(var1, var134, var140);
                    var127 = this.X;
                    var6 = this.X;
                    var6 = ++var6 % 32;
                    this.X = var6;
                    double[] var144 = this.Tp;
                    double var145 = var144[3];
                    double[] var8 = this.Tp;
                    double var159 = var8[4];
                    double[] var10 = this.Tp;
                    double var163 = var10[5];
                    double[] var12 = this.Q;
                    double[] var13 = this.Tp;
                    long var14 = var4;
                    long var16 = var14 + 1L;
                    var16 = var14 * var16;
                    long var18 = var14 + 2L;
                    var16 *= var18;
                    var14 += 3L;
                    var16 *= var14;
                    var14 = var16 & 7L;
                    long var219;
                    int var199 = (var219 = var14 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                    if (var199 != 0) {
                        var30 &= -1233566592;
                        var30 &= 254846706;
                        var30 <<= 13;
                        var30 ^= -668966263;
                        var30 ^= -730262663;
                    } else {
                        label125: {
                            var30 |= -206784576;
                            var30 -= -566616182;
                            var30 |= 2111205169;
                            var30 -= -840559929;
                            var30 ^= -1143753900;
                            Integer var200 = var30;
                            if (var200 == null) {
                                break label121;
                            }

                            double var185 = var13[0];
                            double var15 = var145 * 0.08;
                            double var186 = var185 - var15;
                            var12[var127] = var186;
                            var12 = this.r;
                            var13 = this.Tp;
                            double var188 = var13[1];
                            var15 = var159 * 0.08;
                            double var189 = var188 - var15;
                            var12[var127] = var189;
                            var12 = this.ModuleManager;
                            var13 = this.Tp;
                            double var191 = var13[2];
                            var15 = var163 * 0.08;
                            double var192 = var191 - var15;
                            var12[var127] = var192;
                            double var167 = -var163;
                            double var206 = var167 * var167;
                            double var209 = var145 * var145;
                            double var207 = var206 + var209;
                            double var208 = Math.sqrt(var207);
                            double var220;
                            int var210 = (var220 = var208 - 1.0E-4) == 0.0 ? 0 : (var220 < 0.0 ? -1 : 1);
                            double var212;
                            double var213;
                            double var217;
                            if (var210 < 0) {
                                var30 = switch (var30) {
                                    case -633605860 -> var30 ^ -1878066415;
                                    default -> var30 ^ -129945860;
                                    case 337797088 -> {
                                        var30 |= 581123912;
                                        yield var30 ^ -95677587;
                                    }
                                };
                                double var211 = 1.0;
                                var213 = 0.0;
                                long var22 = var4;
                                long var24 = var22 + 1L;
                                var24 = var22 * var24;
                                long var214 = var24 & 1L;
                                long var221;
                                int var215 = (var221 = var214 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                                if (var215 != 0) {
                                    var30 |= -1633970493;
                                    var30 ^= -760836297;
                                    break label125;
                                }
                                var30 = switch (var30) {
                                    case -1367163588 -> var30 ^ -1414586504;
                                    default -> var30 ^ 1375702841;
                                    case -856724347 -> {
                                        var30 ^= -2031852657;
                                        var30 >>>= 26;
                                        var30 ^= -701146205;
                                        var30 |= -1878238425;
                                        yield var30 ^ 217030491;
                                    }
                                };
                                var217 = 1.0;
                                var212 = var211;
                                var213 = var213;
                                var217 = var217;
                                switch (var30) {
                                    case -1561053794:
                                        var30 ^= -36683895;
                                        break;
                                    case -623721236:
                                        var30 += -539457056;
                                        var30 -= 1012927686;
                                        var30 -= -1008267655;
                                        var30 *= -1976643119;
                                        var30 ^= 944956564;
                                        break;
                                    case 400467493:
                                    default:
                                        var30 ^= -1073986587;
                                }
                            } else {
                                var30 &= -852298318;
                                var30 |= 1679540579;
                                var30 ^= 839098723;
                                var212 = var167;
                                Integer var168 = var4;
                                if (var168 == null) {
                                    var30 |= -1591430379;
                                    var30 -= -1119212723;
                                    var30 *= -178368435;
                                    var30 *= -1023086333;
                                    var30 ^= -1001288440;
                                    break label125;
                                }

                                var30 += -1596183541;
                                var30 ^= 1545415782;
                                var30 ^= 1057231247;
                                Integer var169 = var30;
                                if (var169 == null) {
                                    break label121;
                                }

                                var213 = var145;
                                var217 = var208;
                                switch (var30) {
                                    case -1811047070:
                                        var30 <<= 31;
                                        var30 -= -1022432485;
                                        var30 += -240253538;
                                        var30 ^= 704105738;
                                        break;
                                    case -1530676965:
                                    default:
                                        var30 ^= 735724689;
                                        break;
                                    case -1284551695:
                                        var30 ^= -1900791349;
                                }
                            }

                            float[] var170 = this.W;
                            double var193 = var212 / var217;
                            float var194 = (float)var193;
                            var170[var127] = var194;
                            float[] var171 = this.I;
                            int var195 = var4 + 1;
                            int var196 = var4 * var195;
                            var4 = var196 & 1;
                            if (var4 == 0) {
                                var30 |= -1005392944;
                                var30 |= -574219884;
                                var30 ^= 927424667;
                                var171[var127] = 0.0F;
                                float[] var111 = this.Tn;
                                double var172 = var213 / var217;
                                float var173 = (float)var172;
                                var111[var127] = var173;
                                float[] var112 = this.m;
                                float[] var174 = this.Tn;
                                float var175 = var174[var127];
                                double var176 = var175;
                                double var177 = var159 * var176;
                                float var178 = (float)var177;
                                var112[var127] = var178;
                                float[] var113 = this.dN;
                                float[] var179 = this.W;
                                float var180 = var179[var127];
                                double var181 = var180;
                                double var164 = var163 * var181;
                                float[] var182 = this.Tn;
                                float var183 = var182[var127];
                                double var184 = var183;
                                double var146 = var145 * var184;
                                double var147 = var164 - var146;
                                float var148 = (float)var147;
                                var113[var127] = var148;
                                float[] var114 = this.GB;
                                double var149 = -var159;
                                float[] var160 = this.W;
                                float var161 = var160[var127];
                                double var162 = var161;
                                double var150 = var149 * var162;
                                float var151 = (float)var150;
                                var114[var127] = var151;
                                ThreadLocalRandom var115 = ThreadLocalRandom.current();
                                float[] var152 = this.xH;
                                var152[var127] = 0.0F;
                                float[] var153 = this.e;
                                double var7 = var115.nextDouble((float) (Math.PI * 2));
                                float var156 = (float)var7;
                                var153[var127] = var156;
                                float[] var154 = this.N;
                                var7 = var115.nextDouble(1.0, 3.0);
                                float var158 = (float)var7;
                                var154[var127] = var158;
                                float[] var155 = this.yP;
                                float var116 = var115.nextFloat();
                                var155[var127] = var116;
                                boolean[] var117 = this.M;
                                var117[var127] = true;
                                return;
                            }

                            switch (var30) {
                                case 124311433:
                                    var30 ^= 29611334;
                                    var30 ^= 183661375;
                                    break;
                                case 1053243586:
                                    var30 ^= 405612602;
                                    break;
                                case 1179055070:
                                default:
                                    var30 ^= 969091276;
                            }
                        }
                    }
                }
            }

            RuntimeException var108 = new RuntimeException();
            throw var108;
        }

        AssertionError var109 = new AssertionError();
        throw var109;
    }

    private void L(RenderEvent var1) {
        int var2 = uf;
        var2 ^= 279865144;
        int var3 = System.identityHashCode(this);
        RenderPhase var4 = var1.phase();
        Object var5 = RenderPhase.WORLD;
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var473;
        int var279 = (var473 = var6 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
        if (var279 != 0) {
            switch (var2) {
                case -1127188652:
                    var2 ^= -1458473634;
                    break;
                case -593147442:
                    var2 -= 1531951999;
                    var2 *= 1068267825;
                    var2 ^= -531805096;
                    break;
                case 1029087204:
                default:
                    var2 ^= 2075080103;
            }
        } else {
            label402: {
                label376: {
                    var2 |= -1847525130;
                    var2 &= 820834833;
                    var2 &= -1676514723;
                    var2 *= -1667642849;
                    var2 ^= -1066135665;
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var474;
                    int var283 = (var474 = var6 - 0L) == 0L ? 0 : (var474 < 0L ? -1 : 1);
                    if (var283 == 0) {
                        if (var4 != var5) {
                            var2 *= 1324864991;
                            var2 ^= 1529737451;
                            var2 &= -2092718928;
                            var2 += -821834086;
                            var2 ^= -842471649;
                            long var262 = var2;
                            var6 = var262 + 1L;
                            var6 = var262 * var6;
                            var8 = var262 + 2L;
                            var6 *= var8;
                            long var263 = var262 + 3L;
                            var6 *= var263;
                            long var264 = var6 & 7L;
                            long var475;
                            int var265 = (var475 = var264 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                            if (var265 == 0) {
                                return;
                            }
                        } else {
                            var2 >>>= 14;
                            var2 ^= -1768565679;
                            Entity var251 = i_2.QI();
                            Integer var266 = var3;
                            if (var266 == null) {
                                var2 &= -1096003342;
                                var2 ^= 402276702;
                                var2 ^= 1585764617;
                                break label402;
                            }

                            var2 ^= 45721668;
                            var2 -= -1756693492;
                            var2 ^= 626531100;
                            if (var251 == null) {
                                switch (var2) {
                                    case -641938860:
                                        var2 ^= -1064707127;
                                        var2 &= 1753314206;
                                        var2 |= 1187330909;
                                        var2 |= 1412965346;
                                        var2 ^= 643622605;
                                        break label376;
                                    case -563451072:
                                    default:
                                        var2 ^= 331757515;
                                        break label376;
                                    case -361531917:
                                        var2 ^= 1969673493;
                                        break label376;
                                }
                            }

                            var2 |= 1899684592;
                            var2 ^= 1962369718;
                            var5 = (RenderPhase)this.P;
                            var6 = var3;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var476;
                            int var287 = (var476 = var6 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                            if (var287 != 0) {
                                var2 -= 1734086776;
                                var2 |= -136295925;
                                var2 -= -1084408989;
                                var2 >>= 24;
                                var2 ^= -537208705;
                                break label402;
                            }
                            var2 = switch (var2) {
                                case -1924560830 -> {
                                    var2 -= -1026666888;
                                    var2 += 1431594610;
                                    var2 |= -1442556707;
                                    yield var2 ^ -903623856;
                                }
                                case -1501674313 -> var2 ^ 303228998;
                                default -> var2 ^ 1081064314;
                            };
                            int var288 = var2 + 1;
                            int var289 = var2 * var288;
                            int var290 = var289 & 1;
                            label328:
                            if (var290 == 0) {
                                if (var5 != null) {
                                    var2 = switch (var2) {
                                        default -> var2 ^ -1822377117;
                                        case 751965141 -> var2 ^ 856969705;
                                        case 1978417069 -> {
                                            var2 |= 86398302;
                                            yield var2 ^ -779167292;
                                        }
                                    };
                                    int var268 = var2 + 1;
                                    int var269 = var2 * var268;
                                    int var270 = var269 & 1;
                                    if (var270 != 0) {
                                        break label328;
                                    }

                                    var5 = (RenderPhase)this.P;
                                    World var252 = var251.getEntityWorld();
                                    int var291 = var3 + 1;
                                    int var292 = var3 * var291;
                                    int var293 = var292 & 1;
                                    if (var293 != 0) {
                                        switch (var2) {
                                            case -1537169861:
                                                var2 += 558546465;
                                                var2 += 1816984347;
                                                var2 ^= -301824208;
                                                break label402;
                                            case -1105112592:
                                            default:
                                                var2 ^= 1216734043;
                                                break label402;
                                            case 1223542994:
                                                var2 ^= 895220934;
                                                break label402;
                                        }
                                    }

                                    var2 <<= 16;
                                    var2 ^= 992607873;
                                    var6 = var2;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var6 = var8 & 1L;
                                    long var477;
                                    int var296 = (var477 = var6 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                                    if (var296 != 0) {
                                        break label328;
                                    }

                                    if (var5 != var252) {
                                        switch (var2) {
                                            case -1659699583:
                                                var2 <<= 8;
                                                var2 &= -933201283;
                                                var2 ^= 912739171;
                                                var2 ^= 1319540305;
                                                break label376;
                                            case -1554643495:
                                                var2 ^= -1921668183;
                                                break label376;
                                            case 762574348:
                                            default:
                                                var2 ^= -194417488;
                                                break label376;
                                        }
                                    }

                                    var2 |= 1525869413;
                                    var2 ^= 1166295701;
                                    var2 ^= -1741018725;
                                } else {
                                    switch (var2) {
                                        case -1653837336:
                                            var2 ^= -616146521;
                                            break;
                                        case 557557701:
                                        default:
                                            var2 ^= -820789631;
                                            break;
                                        case 1978417069:
                                            var2 |= 310461089;
                                            var2 &= -1419225298;
                                            var2 |= 596344060;
                                            var2 ^= 564652823;
                                    }
                                }

                                int var253 = var2 + 1;
                                int var254 = var2 * var253;
                                int var272 = var2 + 2;
                                int var255 = var254 * var272;
                                int var273 = var2 + 3;
                                int var256 = var255 * var273;
                                int var257 = var256 & 7;
                                if (var257 == 0) {
                                    FrameContext var258 = var1.frame();
                                    float var259 = var258.dt();
                                    float var260 = Math.min(var259, 0.1F);
                                    float var261 = var260;
                                    NumberSetting var274 = this.l;
                                    float var275 = var274.WM();
                                    float var276 = var275;
                                    NumberSetting var297 = this.XD;
                                    float var298 = var297.WM();
                                    float var299 = var298;
                                    NumberSetting var7 = this.h;
                                    float var304 = var7.WM();
                                    float var305 = var304;
                                    FrameContext var319 = var1.frame();
                                    double var320 = var319.time();
                                    var10 = var3;
                                    long var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    long var14 = var10 + 2L;
                                    var12 *= var14;
                                    var10 += 3L;
                                    var12 *= var10;
                                    var10 = var12 & 7L;
                                    long var478;
                                    int var328 = (var478 = var10 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                    if (var328 != 0) {
                                        var2 -= 138012782;
                                        var2 &= -88123146;
                                        var2 += 561228861;
                                        var2 ^= -998281994;
                                        break label402;
                                    }

                                    var2 |= 1290744856;
                                    var2 &= -740769701;
                                    var2 |= 884135974;
                                    var2 ^= 540976863;
                                    Integer var329 = var2;
                                    if (var329 != null) {
                                        double var321 = var320;
                                        Canvas var330 = var1.canvas();
                                        Canvas var331 = var330;
                                        ClientRuntime var11 = ClientRuntime.Z();
                                        AuraPipeline var332 = var11.Ul();
                                        WorldDraw var333 = var332.world();
                                        WorldDraw var334 = var333;
                                        var330.save();
                                        NumberSetting var338 = this.Pl;
                                        float var339 = var338.WM();
                                        var330.additive(var339);
                                        byte var340 = 0;
                                        int var341 = var340;
                                        var2 += 1821365101;
                                        var2 >>>= 30;
                                        var2 ^= 1263468740;

                                        while (true) {
                                            if (var341 >= 32) {
                                                switch (var2) {
                                                    case -2063275614:
                                                        var2 ^= -1224030615;
                                                        break;
                                                    case 1263468743:
                                                        var2 <<= 11;
                                                        var2 ^= -1477825502;
                                                        break;
                                                    case 1301177972:
                                                    default:
                                                        var2 ^= -1441991909;
                                                }

                                                var331.restore();
                                                return;
                                            }

                                            var2 &= 1511993961;
                                            var2 ^= 1913807660;
                                            Integer var13 = var2;
                                            if (var13 == null) {
                                                break;
                                            }

                                            boolean[] var342 = this.M;
                                            boolean var343 = var342[var341];
                                            int var353 = var3 + 1;
                                            int var354 = var3 * var353;
                                            int var15 = var3 + 2;
                                            int var355 = var354 * var15;
                                            var15 = var3 + 3;
                                            int var356 = var355 * var15;
                                            int var357 = var356 & 7;
                                            if (var357 != 0) {
                                                switch (var2) {
                                                    case -1864609570:
                                                        var2 ^= -1810059456;
                                                        break label402;
                                                    case 941450093:
                                                        var2 *= 2042936591;
                                                        var2 ^= 2137953316;
                                                        break label402;
                                                    case 1200948903:
                                                    default:
                                                        var2 ^= -905000393;
                                                        break label402;
                                                }
                                            }

                                            var2 >>= 18;
                                            var2 ^= 1263527740;
                                            Integer var358 = var2;
                                            if (var358 == null) {
                                                break;
                                            }

                                            if (!var343) {
                                                var2 *= 2134696557;
                                                var2 ^= 1256467743;
                                                var2 |= -67647627;
                                                var2 ^= 112942416;
                                            } else {
                                                label396: {
                                                    var2 += 822758065;
                                                    var2 >>= 8;
                                                    var2 ^= -445764135;
                                                    float[] var344 = this.xH;
                                                    float var359 = var344[var341];
                                                    float var360 = var359 + var261;
                                                    var344[var341] = var360;
                                                    float[] var345 = this.xH;
                                                    float var346 = var345[var341];
                                                    float var361 = 1.0F;
                                                    var15 = var3 + 1;
                                                    var15 = var3 * var15;
                                                    int var16 = var3 + 2;
                                                    var15 *= var16;
                                                    var16 = var3 + 3;
                                                    var15 *= var16;
                                                    var15 &= 7;
                                                    if (var15 != 0) {
                                                        var2 &= -1693990789;
                                                        var2 <<= 1;
                                                        var2 ^= -570533741;
                                                        break label402;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -451774486 -> {
                                                            var2 -= -1367866350;
                                                            var2 *= 1024991063;
                                                            var2 &= -287363697;
                                                            var2 *= -1701506713;
                                                            yield var2 ^ 1021166078;
                                                        }
                                                        case 147174435 -> var2 ^ -555665291;
                                                        default -> var2 ^ 511218396;
                                                    };
                                                    float var479;
                                                    var15 = (var479 = var346 - var276) == 0.0F ? 0 : (var479 < 0.0F ? -1 : 1);
                                                    float var398;
                                                    float var419;
                                                    if (var15 < 0) {
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ -485196477;
                                                            case -31488927 -> var2 ^ 485283713;
                                                            case 1494738630 -> {
                                                                var2 |= -505797486;
                                                                var2 += 651899262;
                                                                yield var2 ^ 1003956658;
                                                            }
                                                        };
                                                        Lv var396 = sT_2.qQ;
                                                        Integer var413 = var3;
                                                        if (var413 == null) {
                                                            switch (var2) {
                                                                case -2146999817:
                                                                    var2 ^= 725635232;
                                                                    break label402;
                                                                case 460075494:
                                                                    var2 >>= 1;
                                                                    var2 ^= -766721868;
                                                                    break label402;
                                                                case 1469931125:
                                                                default:
                                                                    var2 ^= -761240265;
                                                                    break label402;
                                                            }
                                                        }

                                                        var2 *= 1621832605;
                                                        var2 &= 1637973155;
                                                        var2 ^= -1021316297;
                                                        long var414 = var2;
                                                        long var18 = var414 + 1L;
                                                        var18 = var414 * var18;
                                                        long var20 = var414 + 2L;
                                                        var18 *= var20;
                                                        long var415 = var414 + 3L;
                                                        var18 *= var415;
                                                        long var416 = var18 & 7L;
                                                        long var480;
                                                        int var417 = (var480 = var416 - 0L) == 0L ? 0 : (var480 < 0L ? -1 : 1);
                                                        if (var417 != 0) {
                                                            break;
                                                        }

                                                        float var418 = var346 / var276;
                                                        float var397 = var396.l(var418);
                                                        var419 = var361;
                                                        var398 = var397;
                                                        var2 += 1939798784;
                                                        var2 ^= 1084046702;
                                                        var2 ^= 1196555294;
                                                    } else {
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ 575333496;
                                                            case 1494738630 -> {
                                                                var2 |= -818926742;
                                                                var2 *= -980516301;
                                                                yield var2 ^ -1859845443;
                                                            }
                                                            case 1844671386 -> var2 ^ 946628839;
                                                        };
                                                        int var17 = var2 + 1;
                                                        var17 = var2 * var17;
                                                        var17 &= 1;
                                                        if (var17 != 0) {
                                                            break;
                                                        }

                                                        float var429 = var276 + var299;
                                                        float var481;
                                                        var17 = (var481 = var346 - var429) == 0.0F ? 0 : (var481 < 0.0F ? -1 : 1);
                                                        Integer var454 = var3;
                                                        if (var454 == null) {
                                                            var2 >>= 18;
                                                            var2 -= -409140906;
                                                            var2 &= -1741712454;
                                                            var2 ^= -942122649;
                                                            break label402;
                                                        }

                                                        var2 >>>= 25;
                                                        var2 >>>= 2;
                                                        var2 -= -100371794;
                                                        var2 ^= -513215563;
                                                        if (var17 < 0) {
                                                            var2 *= -1846219049;
                                                            var2 += -2100932332;
                                                            var2 ^= -436998914;
                                                            var17 = var2 + 1;
                                                            var17 = var2 * var17;
                                                            var17 &= 1;
                                                            if (var17 != 0) {
                                                                break;
                                                            }

                                                            float var434 = 1.0F;
                                                            var419 = var361;
                                                            long var455 = var3;
                                                            long var469 = var455 + 1L;
                                                            var469 = var455 * var469;
                                                            long var22 = var455 + 2L;
                                                            var469 *= var22;
                                                            long var456 = var455 + 3L;
                                                            var469 *= var456;
                                                            long var457 = var469 & 7L;
                                                            long var482;
                                                            int var362 = (var482 = var457 - 0L) == 0L ? 0 : (var482 < 0L ? -1 : 1);
                                                            if (var362 != 0) {
                                                                switch (var2) {
                                                                    case -1808903880:
                                                                        var2 ^= 63123377;
                                                                        break label402;
                                                                    case 1243970821:
                                                                    default:
                                                                        var2 ^= -1017801764;
                                                                        break label402;
                                                                    case 1367025200:
                                                                        var2 *= 1829802555;
                                                                        var2 &= 2139094359;
                                                                        var2 <<= 17;
                                                                        var2 *= 1215308581;
                                                                        var2 ^= -1185228729;
                                                                        break label402;
                                                                }
                                                            }

                                                            var2 ^= -938711723;
                                                            var2 ^= -608760591;
                                                            int var363 = var2 + 1;
                                                            int var364 = var2 * var363;
                                                            int var365 = var364 & 1;
                                                            if (var365 != 0) {
                                                                break;
                                                            }

                                                            var398 = var434;
                                                            var2 += 598792906;
                                                            var2 |= -1749198149;
                                                            var2 *= 1547813965;
                                                            var2 ^= -1715904010;
                                                        } else {
                                                            var2 *= 436170309;
                                                            var2 ^= -1818181781;
                                                            float var366 = var276 + var299;
                                                            float var367 = var366 + var305;
                                                            var17 = var3 + 1;
                                                            var17 = var3 * var17;
                                                            var17 &= 1;
                                                            if (var17 != 0) {
                                                                switch (var2) {
                                                                    case -1429496635:
                                                                        var2 >>= 27;
                                                                        var2 ^= 537208754;
                                                                        break label402;
                                                                    case -293072279:
                                                                    default:
                                                                        var2 ^= 528111084;
                                                                        break label402;
                                                                    case -195113116:
                                                                        var2 ^= 816907033;
                                                                        break label402;
                                                                }
                                                            }

                                                            var2 += 1670777119;
                                                            var2 >>>= 22;
                                                            var2 ^= -27607636;
                                                            float var483;
                                                            int var368 = (var483 = var346 - var367) == 0.0F ? 0 : (var483 < 0.0F ? -1 : 1);
                                                            if (var368 >= 0) {
                                                                var2 |= 1841425832;
                                                                var2 &= 42327709;
                                                                var2 |= 648302334;
                                                                var2 &= -1877654110;
                                                                var2 ^= -733862866;
                                                                boolean[] var351 = this.M;
                                                                int var379 = var3 + 1;
                                                                int var380 = var3 * var379;
                                                                var15 = var3 + 2;
                                                                int var381 = var380 * var15;
                                                                var15 = var3 + 3;
                                                                int var382 = var381 * var15;
                                                                int var383 = var382 & 7;
                                                                if (var383 != 0) {
                                                                    var2 *= 309726125;
                                                                    var2 &= -634418834;
                                                                    var2 ^= 131127371;
                                                                    break label402;
                                                                }

                                                                var2 ^= -1081459001;
                                                                var2 |= 1527267130;
                                                                var2 |= -1281806297;
                                                                var2 -= 515285872;
                                                                var2 ^= -33634557;
                                                                Integer var384 = var2;
                                                                if (var384 == null) {
                                                                    break;
                                                                }

                                                                var351[var341] = false;
                                                                var2 &= 1848664037;
                                                                var2 ^= -581138143;
                                                                break label396;
                                                            }
                                                            var2 = switch (var2) {
                                                                case -27607659 -> {
                                                                    var2 <<= 21;
                                                                    var2 |= -1724280360;
                                                                    var2 ^= 264233946;
                                                                    var2 += 1724097318;
                                                                    yield var2 ^ -491249430;
                                                                }
                                                                case 375154168 -> var2 ^ -1877285616;
                                                                default -> var2 ^ -1675616554;
                                                            };
                                                            Integer var369 = var2;
                                                            if (var369 == null) {
                                                                break;
                                                            }

                                                            float var347 = var346 - var276;
                                                            float var348 = var347 - var299;
                                                            float var349 = var348 / var305;
                                                            Integer var370 = var3;
                                                            if (var370 == null) {
                                                                var2 &= -87260108;
                                                                var2 *= -1311183805;
                                                                var2 ^= -2087988153;
                                                                break label402;
                                                            }
                                                            var2 = switch (var2) {
                                                                default -> var2 ^ 1553986760;
                                                                case -126732862 -> {
                                                                    var2 >>>= 17;
                                                                    yield var2 ^ 606130845;
                                                                }
                                                                case 35021496 -> var2 ^ 952091944;
                                                            };
                                                            long var438 = var2;
                                                            long var19 = var438 + 1L;
                                                            var19 = var438 * var19;
                                                            long var21 = var438 + 2L;
                                                            var19 *= var21;
                                                            long var439 = var438 + 3L;
                                                            var19 *= var439;
                                                            long var440 = var19 & 7L;
                                                            long var484;
                                                            int var371 = (var484 = var440 - 0L) == 0L ? 0 : (var484 < 0L ? -1 : 1);
                                                            if (var371 != 0) {
                                                                break;
                                                            }

                                                            Lv var372 = sT_2.Jj;
                                                            float var373 = var372.l(var349);
                                                            float var374 = 1.0F - var373;
                                                            float var441 = 1.0F - var349;
                                                            var419 = var441;
                                                            var398 = var374;
                                                            var2 >>>= 8;
                                                            var2 ^= 297106411;
                                                        }
                                                    }

                                                    float[] var375 = this.e;
                                                    float var442 = var375[var341];
                                                    float[] var458 = this.N;
                                                    float var459 = var458[var341];
                                                    NumberSetting var464 = this.Gd;
                                                    float var465 = var464.WM();
                                                    float var460 = var459 * var465;
                                                    float var420 = var460 * var419;
                                                    float var421 = var420 * var261;
                                                    float var422 = var442 - var421;
                                                    Integer var443 = var3;
                                                    if (var443 == null) {
                                                        var2 >>= 8;
                                                        var2 |= 427374929;
                                                        var2 ^= -1757998300;
                                                        var2 |= 696372480;
                                                        var2 ^= 1882535736;
                                                        break label402;
                                                    }

                                                    var2 >>>= 31;
                                                    var2 ^= 213372549;
                                                    var2 -= -1750888960;
                                                    var2 -= 2042889535;
                                                    var2 ^= -1407112533;
                                                    long var444 = var2;
                                                    long var466 = var444 + 1L;
                                                    long var467 = var444 * var466;
                                                    long var445 = var467 & 1L;
                                                    long var485;
                                                    int var446 = (var485 = var445 - 0L) == 0L ? 0 : (var485 < 0L ? -1 : 1);
                                                    if (var446 != 0) {
                                                        break;
                                                    }

                                                    var375[var341] = var422;
                                                    float var376 = TP.S(var398);
                                                    float var377 = Math.max(0.0F, var398);
                                                    float var486;
                                                    var15 = (var486 = var376 - 0.01F) == 0.0F ? 0 : (var486 < 0.0F ? -1 : 1);
                                                    if (var15 >= 0) {
                                                        var2 >>>= 20;
                                                        var2 |= 107380955;
                                                        var2 &= -1747107688;
                                                        var2 ^= 978397837;
                                                        float var487;
                                                        var15 = (var487 = var377 - 0.01F) == 0.0F ? 0 : (var487 < 0.0F ? -1 : 1);
                                                        Integer var423 = var3;
                                                        if (var423 == null) {
                                                            var2 |= -1440590452;
                                                            var2 -= 1109135411;
                                                            var2 ^= -1545488595;
                                                            break label402;
                                                        }

                                                        var2 ^= -853644936;
                                                        var2 -= 2019227832;
                                                        var2 <<= 31;
                                                        var2 >>>= 17;
                                                        var2 ^= -711139697;
                                                        if (var15 < 0) {
                                                            var2 += -609511162;
                                                            var2 >>= 12;
                                                            var2 ^= -483700179;
                                                            var2 ^= 1343391894;
                                                            var2 >>= 22;
                                                            var2 ^= -45313258;
                                                        } else {
                                                            var2 *= 1176853827;
                                                            var2 ^= 1183382936;
                                                            long var401 = var2;
                                                            long var447 = var401 + 1L;
                                                            long var448 = var401 * var447;
                                                            long var468 = var401 + 2L;
                                                            long var449 = var448 * var468;
                                                            long var402 = var401 + 3L;
                                                            long var450 = var449 * var402;
                                                            long var403 = var450 & 7L;
                                                            long var488;
                                                            var15 = (var488 = var403 - 0L) == 0L ? 0 : (var488 < 0L ? -1 : 1);
                                                            if (var15 != 0) {
                                                                break;
                                                            }

                                                            NumberSetting var405 = this.aK;
                                                            int var424 = var3 + 1;
                                                            var424 = var3 * var424;
                                                            var424 &= 1;
                                                            if (var424 != 0) {
                                                                var2 += -1582655124;
                                                                var2 ^= -190729781;
                                                                var2 += -1654182941;
                                                                var2 ^= -1077863222;
                                                                break label402;
                                                            }

                                                            var2 *= 656441719;
                                                            var2 *= -1758180389;
                                                            var2 += -354921683;
                                                            var2 *= -1496791269;
                                                            var2 ^= -136478451;
                                                            float var406 = var405.WM();
                                                            float var378 = var406 * var377;
                                                            var15 = var2 >> 15;
                                                            var15 *= -1335975903;
                                                            var15 ^= -1617647917;
                                                            this.Yu(var331, var334, var341, var378, var376, var321, var15);
                                                            var2 += 1067119485;
                                                            var2 >>= 16;
                                                            var2 ^= -45293088;
                                                        }
                                                    } else {
                                                        var2 ^= 1835452864;
                                                        var2 -= -1207144595;
                                                        var2 <<= 2;
                                                        var2 ^= -178179803;
                                                    }
                                                }
                                            }

                                            int var352 = var341 + 1;
                                            Integer var385 = var3;
                                            if (var385 == null) {
                                                var2 &= 522059460;
                                                var2 >>= 25;
                                                var2 ^= -537208759;
                                                break label402;
                                            }
                                            var2 = switch (var2) {
                                                case -1466219168 -> var2 ^ 1640245130;
                                                case -45313499 -> {
                                                    var2 += 1713847813;
                                                    var2 *= -1384506067;
                                                    var2 <<= 18;
                                                    yield var2 ^ -1074237033;
                                                }
                                                default -> var2 ^ 991330806;
                                            };
                                            int var386 = var2 + 1;
                                            int var387 = var2 * var386;
                                            int var388 = var387 & 1;
                                            if (var388 != 0) {
                                                break;
                                            }

                                            var341 = var352;
                                            switch (var2) {
                                                case -630165097:
                                                    var2 *= -394014801;
                                                    var2 ^= 2108997630;
                                                    break;
                                                case -392878416:
                                                default:
                                                    var2 ^= -35808485;
                                                    break;
                                                case 934468542:
                                                    var2 ^= 834319535;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    RuntimeException var250 = new RuntimeException();
                    throw var250;
                }

                this.J();
                return;
            }
        }

        UnsupportedOperationException var249 = new UnsupportedOperationException();
        throw var249;
    }

    private void Yu(Canvas var1, WorldDraw var2, int var3, float var4, float var5, double var6, int var8) {
        label139: {
            int var11 = System.identityHashCode(this);
            float var12 = var4 * 1.45F;
            float[] var13 = this.e;
            float var138 = var13[var3];
            double var139 = var138;
            double var140 = Math.cos(var139);
            float var141 = (float)var140;
            float var142 = var141 * var12;
            float[] var14 = this.e;
            float var152 = var14[var3];
            double var153 = var152;
            double var154 = Math.sin(var153);
            float var155 = (float)var154;
            var12 = var155 * var12;
            var1.save();
            double[] var156 = this.Q;
            double var157 = var156[var3];
            double[] var16 = this.r;
            double var185 = var16[var3];
            double[] var18 = this.ModuleManager;
            double var247 = var18[var3];
            float[] var20 = this.W;
            float var276 = var20[var3];
            float var277 = var276 * var142;
            float[] var21 = this.m;
            float var282 = var21[var3];
            float var283 = var282 * var12;
            float var278 = var277 + var283;
            double var279 = var278;
            float[] var22 = this.I;
            float var286 = var22[var3];
            float var287 = var286 * var142;
            float[] var23 = this.dN;
            float var290 = var23[var3];
            float var291 = var290 * var12;
            float var288 = var287 + var291;
            double var289 = var288;
            float[] var24 = this.Tn;
            float var292 = var24[var3];
            float var293 = var292 * var142;
            float[] var25 = this.GB;
            float var296 = var25[var3];
            float var297 = var296 * var12;
            float var294 = var293 + var297;
            double var295 = var294;
            float[] var26 = this.m;
            float var298 = var26[var3];
            float var299 = var298 * var142;
            float[] var27 = this.W;
            float var302 = var27[var3];
            float var303 = var302 * var12;
            float var300 = var299 - var303;
            double var301 = var300;
            float[] var28 = this.dN;
            float var304 = var28[var3];
            float var305 = var304 * var142;
            float[] var29 = this.I;
            float var308 = var29[var3];
            float var309 = var308 * var12;
            float var306 = var305 - var309;
            double var307 = var306;
            float[] var30 = this.GB;
            float var310 = var30[var3];
            float var143 = var310 * var142;
            var30 = this.Tn;
            float var312 = var30[var3];
            var12 = var312 * var12;
            var12 = var143 - var12;
            double var133 = var12;
            boolean var134 = var2.plane(var1, var157, var185, var247, var279, var289, var295, var301, var307, var133);
            long var144 = var11;
            long var15 = var144 + 1L;
            var15 = var144 * var15;
            long var145 = var15 & 1L;
            long var313;
            int var146 = (var313 = var145 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
            if (var146 != 0) {
                int var123 = var8 | 859981673;
                var123 ^= -337201667;
            } else {
                label138: {
                    int var9 = var8 | 1774470167;
                    var9 <<= 10;
                    var9 ^= 1529056820;
                    var9 &= 1554830697;
                    var9 ^= -868121954;
                    if (var134) {
                        var9 |= -1974445103;
                        var9 ^= 776033201;
                        zS var135 = this.SQ;
                        var13 = this.yP;
                        float var148 = var13[var3];
                        int var136 = var135.x(var148, var6);
                        float var149 = var5 * 0.85F;
                        int var137 = DP.Y(var136, var149);
                        int var150 = var137 | 16777215;
                        int var151 = DP.Z(var137, var150, 0.2F);
                        float var158 = 0.6896551F;
                        ModeSetting var160 = this.mS;
                        Enum var161 = var160.A();
                        long var186 = var11;
                        long var248 = var186 + 1L;
                        long var249 = var186 * var248;
                        long var280 = var186 + 2L;
                        long var250 = var249 * var280;
                        long var187 = var186 + 3L;
                        long var251 = var250 * var187;
                        long var188 = var251 & 7L;
                        long var314;
                        int var189 = (var314 = var188 - 0L) == 0L ? 0 : (var314 < 0L ? -1 : 1);
                        if (var189 != 0) {
                            var9 >>= 6;
                            var9 ^= -1433796429;
                            break label138;
                        }

                        var9 *= 1242397511;
                        var9 >>>= 30;
                        var9 *= -1605281387;
                        var9 ^= 548903950;
                        long var190 = var3;
                        long var252 = var190 + 1L;
                        long var253 = var190 * var252;
                        long var281 = var190 + 2L;
                        long var254 = var253 * var281;
                        long var191 = var190 + 3L;
                        long var255 = var254 * var191;
                        long var192 = var255 & 7L;
                        long var315;
                        int var193 = (var315 = var192 - 0L) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                        if (var193 != 0) {
                            break label139;
                        }

                        IH var162 = (IH)var161;
                        int var163 = var162.ordinal();
                        label121:
                        switch (var163) {
                            case 0:
                                var9 |= 871491213;
                                var9 |= -759849289;
                                var9 |= 1269363534;
                                var9 &= -2026345875;
                                var9 ^= -546595367;
                                int var181 = var3 + 1;
                                int var182 = var3 * var181;
                                int var183 = var182 & 1;
                                if (var183 != 0) {
                                    break label139;
                                }

                                SpriteShape var184 = SpriteShape.PORTAL;
                                float var218 = 1.0F - var158;
                                double var245 = var6 * 2.2;
                                float[] var272 = this.yP;
                                float var273 = var272[var3];
                                float var274 = var273 * 40.0F;
                                Integer var126 = var11;
                                if (var126 == null) {
                                    switch (var9) {
                                        case 612457376:
                                        default:
                                            var9 ^= 1798687987;
                                            break label138;
                                        case 1549006772:
                                            var9 ^= -1621146496;
                                            var9 &= 605518896;
                                            var9 |= -1277866048;
                                            var9 += -494777492;
                                            var9 ^= -1033958962;
                                            break label138;
                                        case 1891158336:
                                            var9 ^= -1877584392;
                                            break label138;
                                    }
                                }

                                var9 <<= 5;
                                var9 ^= 207037900;
                                var9 ^= 1656642633;
                                double var275 = var274;
                                var245 += var275;
                                float var127 = (float)var245;
                                var1.sprite(var184, 0.0F, 0.0F, var158, var218, var151, var137, var127);
                                switch (var9) {
                                    case -459829499:
                                        var9 &= 1457224402;
                                        var9 += 200585274;
                                        var9 ^= 978805834;
                                        break label121;
                                    case 765430145:
                                        var9 ^= 517486606;
                                        break label121;
                                    case 2007871596:
                                    default:
                                        var9 ^= 1630893267;
                                        break label121;
                                }
                            case 1:
                                var9 &= 1503392584;
                                var9 *= 508326489;
                                var9 |= 657301373;
                                var9 ^= -176272507;
                                var9 ^= -1432177429;
                                int var175 = var3 + 1;
                                int var176 = var3 * var175;
                                int var209 = var3 + 2;
                                int var177 = var176 * var209;
                                int var210 = var3 + 3;
                                int var178 = var177 * var210;
                                int var179 = var178 & 7;
                                if (var179 != 0) {
                                    break label139;
                                }

                                SpriteShape var180 = SpriteShape.RING;
                                int var211 = var11 + 1;
                                int var212 = var11 * var211;
                                int var243 = var11 + 2;
                                int var213 = var212 * var243;
                                var243 = var11 + 3;
                                int var214 = var213 * var243;
                                int var215 = var214 & 7;
                                if (var215 != 0) {
                                    var9 |= 1310419988;
                                    var9 ^= -1162629499;
                                    break label138;
                                }

                                var9 += 1800820132;
                                var9 ^= 2014312669;
                                float var216 = 1.0F - var158;
                                float var217 = var216 * 0.55F;
                                var1.sprite(var180, 0.0F, 0.0F, var158, var217, var151, var137, 0.0F);
                                var9 >>>= 27;
                                var9 ^= 1792073333;
                                break;
                            case 2:
                                var9 |= 830427856;
                                var9 -= 2080495756;
                                var9 ^= -2130229414;
                                var9 ^= 1653032701;
                                int var170 = var3 + 1;
                                int var171 = var3 * var170;
                                int var172 = var171 & 1;
                                if (var172 != 0) {
                                    break label139;
                                }

                                SpriteShape var173 = SpriteShape.RING;
                                float var206 = 1.0F - var158;
                                float var207 = var206 * 0.55F;
                                long var234 = var11;
                                long var263 = var234 + 1L;
                                var263 = var234 * var263;
                                long var284 = var234 + 2L;
                                var263 *= var284;
                                var234 += 3L;
                                var263 *= var234;
                                var234 = var263 & 7L;
                                long var316;
                                int var237 = (var316 = var234 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                                if (var237 != 0) {
                                    var9 += 1416534524;
                                    var9 >>= 29;
                                    var9 ^= -1409860243;
                                    break label138;
                                }

                                var9 ^= -282309444;
                                var9 -= -1989142957;
                                var9 &= 779285994;
                                var9 ^= 70601309;
                                var234 = var3;
                                var263 = var234 + 1L;
                                var263 = var234 * var263;
                                long var285 = var234 + 2L;
                                var263 *= var285;
                                var234 += 3L;
                                var263 *= var234;
                                var234 = var263 & 7L;
                                long var317;
                                int var241 = (var317 = var234 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                                if (var241 != 0) {
                                    break label139;
                                }

                                var1.sprite(var173, 0.0F, 0.0F, var158, var207, var151, var137, 0.0F);
                                SpriteShape var174 = SpriteShape.RING;
                                float var208 = var158 * 0.62F;
                                float var242 = var158 * 0.18F;
                                int var262 = DP.nq(var151, 0.6F);
                                int var271 = DP.nq(var137, 0.6F);
                                var1.sprite(var174, 0.0F, 0.0F, var208, var242, var262, var271, 0.0F);
                                var9 &= 423738422;
                                var9 ^= 1787917894;
                                break;
                            case 3:
                                var9 >>= 22;
                                var9 += -1358741759;
                                var9 >>>= 3;
                                var9 -= -285745079;
                                var9 ^= 385806407;
                                SpriteShape var169 = SpriteShape.HEXAGON;
                                float var204 = 1.0F - var158;
                                int var224 = var11 + 1;
                                var224 = var11 * var224;
                                int var258 = var11 + 2;
                                var224 *= var258;
                                int var259 = var11 + 3;
                                var224 *= var259;
                                var224 &= 7;
                                if (var224 != 0) {
                                    var9 >>= 16;
                                    var9 &= -2119438129;
                                    var9 += 245214098;
                                    var9 ^= 1519720714;
                                    break label138;
                                }

                                var9 += 314966473;
                                var9 ^= 123328370;
                                var224 = var3 + 1;
                                var224 = var3 * var224;
                                int var260 = var3 + 2;
                                var224 *= var260;
                                int var261 = var3 + 3;
                                var224 *= var261;
                                var224 &= 7;
                                if (var224 != 0) {
                                    break label139;
                                }

                                float var205 = var204 * 0.6F;
                                var1.sprite(var169, 0.0F, 0.0F, var158, var205, var151, var137, 0.0F);
                                var9 ^= 1254090588;
                                var9 ^= 1709872807;
                                break;
                            case 4:
                                var9 -= -1034402477;
                                var9 ^= -16988358;
                                var15 = var3;
                                long var17 = var15 + 1L;
                                var17 = var15 * var17;
                                long var19 = var15 + 2L;
                                var17 *= var19;
                                var15 += 3L;
                                var17 *= var15;
                                var15 = var17 & 7L;
                                long var318;
                                int var167 = (var318 = var15 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
                                if (var167 != 0) {
                                    break label139;
                                }

                                SpriteShape var168 = SpriteShape.BOLD_RING;
                                long var194 = var11;
                                long var256 = var194 + 1L;
                                long var257 = var194 * var256;
                                long var195 = var257 & 1L;
                                long var319;
                                int var196 = (var319 = var195 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                                if (var196 != 0) {
                                    switch (var9) {
                                        case 51874916:
                                            var9 -= 367803178;
                                            var9 ^= -1188850776;
                                            break label138;
                                        case 926852677:
                                            var9 ^= -2030683046;
                                            break label138;
                                        case 1786497285:
                                        default:
                                            var9 ^= 174733061;
                                            break label138;
                                    }
                                }

                                var9 -= -1928690851;
                                var9 &= 601933013;
                                var9 ^= -1354367660;
                                int var197 = var3 + 1;
                                int var198 = var3 * var197;
                                int var222 = var3 + 2;
                                int var199 = var198 * var222;
                                int var223 = var3 + 3;
                                int var200 = var199 * var223;
                                int var201 = var200 & 7;
                                if (var201 != 0) {
                                    break label139;
                                }

                                float var202 = 1.0F - var158;
                                float var203 = var202 * 0.7F;
                                var1.sprite(var168, 0.0F, 0.0F, var158, var203, var151, var137, 0.0F);
                                var9 &= -1055638629;
                                var9 ^= -338368671;
                                break;
                            default:
                                switch (var9) {
                                    case -1612334028:
                                        var9 ^= -294446144;
                                        break;
                                    case -1069313871:
                                        var9 ^= -1301019969;
                                        var9 -= -1475923842;
                                        var9 += -2141221976;
                                        var9 ^= 543109960;
                                        break;
                                    case 1124716254:
                                    default:
                                        var9 ^= -296072306;
                                }
                        }
                    } else {
                        switch (var9) {
                            case -2065575234:
                                var9 >>>= 22;
                                var9 >>= 17;
                                var9 ^= 1792073328;
                                break;
                            case -2051348163:
                            default:
                                var9 ^= -926261145;
                                break;
                            case 84878195:
                                var9 ^= -566673218;
                        }
                    }

                    Integer var122 = var3;
                    if (var122 != null) {
                        var1.restore();
                        return;
                    }
                    break label139;
                }
            }

            Integer var128 = var3;
            if (var128 != null) {
                AssertionError var129 = new AssertionError();
                throw var129;
            }
        }

        UnsupportedOperationException var125 = new UnsupportedOperationException();
        throw var125;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 420243483;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        uf = var4;
    }
}
