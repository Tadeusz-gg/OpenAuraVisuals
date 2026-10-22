package mvggs.modules.world;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.client.render.SceneStage;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.RenderTarget;
import dev.skidware.visuals.render.fx.VelocityBlur;
import dev.skidware.visuals.render.fx.VelocityBlur$Mode;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;
import org.joml.Matrix4f;

public final class motionblur extends Yn {
    private static final double l = 12.0;
    private static final long bx = 1000000000L;
    private final r_2 r;
    private final Uq lU;
    private final r_2 wP;
    private final JL L;
    private final ia w;
    private final Matrix4f q;
    private final Matrix4f k;
    private final Matrix4f M;
    private final Matrix4f px;
    private final Matrix4f u;
    private final Matrix4f ve;
    private final float[] Y;
    private double XL;
    private double zR;
    private double tA;
    private boolean K;
    private long Di;
    private Object Z;
    private boolean E;
    private boolean JQ;
    private boolean oh;
    private long Zm;
    private float Qr;
    private float d;
    private int Mx;
    private long x;
    private final Dx kl;
    private final VelocityBlur t;
    private final yF j;
    private final float[] JH;
    private final float[] g;
    private final long e;
    private int c;
    private int i;
    private long B;
    private qS n;
    private boolean H;
    private boolean Sp;
    public static final int U;

    public motionblur() {
        super("motion_blur", "Motion Blur", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        qS var2 = qS.VELOCITY;
        r_2 var3 = new r_2("method", "Method", var2);
        xB var4 = var3.q(
            "Velocity Based follows every pixel's motion with no added input lag; Frame Blending averages recent frames; Hybrid does both; Accumulation leaves trails."
        );
        r_2 var5 = (r_2)var4;
        xB var6 = this.vn(var5);
        r_2 var7 = (r_2)var6;
        this.r = var7;
        Uq var8 = new Uq("strength", "Strength", 1.0F, 0.0F, 2.0F);
        Uq var9 = var8.W(0.01F);
        xB var10 = var9.q("1.00 blurs exactly the motion between two shown images.");
        Uq var11 = (Uq)var10;
        xB var12 = this.vn(var11);
        Uq var13 = (Uq)var12;
        this.lU = var13;
        CX var45 = CX.UNIFORM;
        r_2 var14 = new r_2("profile", "Blur Profile", var45);
        xB var15 = var14.q("Uniform: classic box blur. Weighted: smoother transitions, slightly softer.");
        BooleanSupplier var46 = () -> {
            int var1x = U;
            var1x ^= 973635055;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.r;
            Enum var18x = var3x.A();
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            int var5x = var2x + 2;
            var4x *= var5x;
            var2x += 3;
            var4x *= var2x;
            var2x = var4x & 7;
            if (var2x == 0) {
                var1x += 1374293518;
                var1x -= 1034290405;
                var1x ^= -1646127891;
                qS var17x = (qS)var18x;
                return var17x.velocity();
            } else {
                var1x ^= 1461485907;
                var1x ^= 1149484862;
                Integer var9x = var1x;
                if (var9x != null) {
                    UnsupportedOperationException var11x = new UnsupportedOperationException();
                    throw var11x;
                } else {
                    AssertionError var10x = new AssertionError();
                    throw var10x;
                }
            }
        };
        xB var16 = var15.Pt(var46);
        r_2 var17 = (r_2)var16;
        xB var18 = this.vn(var17);
        r_2 var19 = (r_2)var18;
        this.wP = var19;
        JL var20 = new JL("refresh_scaling", "Refresh Rate Scaling", true);
        xB var21 = var20.q("Above your monitor's refresh rate the blur covers one refresh: 600 FPS on 60 Hz blurs 10x.");
        BooleanSupplier var47 = () -> {
            int var1x = U;
            var1x ^= 1721512208;
            int var2x = System.identityHashCode(this);
            long var16x = var2x;
            long var4x = var16x + 1L;
            var4x = var16x * var4x;
            long var17x = var4x & 1L;
            long var21x;
            var2x = (var21x = var17x - 0L) == 0L ? 0 : (var21x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x += 1252226833;
                var1x *= -645521077;
                var1x ^= 1847677393;
                r_2 var19x = this.r;
                qS var3x = qS.VELOCITY;
                return var19x.TJ(var3x);
            } else {
                var1x ^= 1942623384;
                var1x += 701494668;
                var1x |= 956113850;
                var1x += -786304900;
                var1x ^= 333086389;
                IllegalStateException var12x = new IllegalStateException();
                throw var12x;
            }
        };
        xB var22 = var21.Pt(var47);
        JL var23 = (JL)var22;
        xB var24 = this.vn(var23);
        JL var25 = (JL)var24;
        this.L = var25;
        ia var26 = new ia("toggle_key", "Toggle Key", -1);
        xB var27 = var26.q("Turns motion blur on and off in game.");
        ia var28 = (ia)var27;
        xB var29 = this.vn(var28);
        ia var30 = (ia)var29;
        this.w = var30;
        Matrix4f var31 = new Matrix4f();
        this.q = var31;
        Matrix4f var32 = new Matrix4f();
        this.k = var32;
        Matrix4f var33 = new Matrix4f();
        this.M = var33;
        Matrix4f var34 = new Matrix4f();
        this.px = var34;
        Matrix4f var35 = new Matrix4f();
        this.u = var35;
        Matrix4f var36 = new Matrix4f();
        this.ve = var36;
        float[] var37 = new float[16];
        this.Y = var37;
        this.JQ = true;
        this.oh = true;
        this.Mx = 60;
        Dx var38 = new Dx();
        this.kl = var38;
        VelocityBlur var39 = new VelocityBlur();
        this.t = var39;
        yF var40 = new yF();
        this.j = var40;
        float[] var41 = new float[12];
        this.JH = var41;
        float[] var42 = new float[12];
        this.g = var42;
        long var43 = System.nanoTime();
        this.e = var43;
        this.B = Long.MIN_VALUE;
        this.dy("Natural motion blur: per-pixel velocity, frame blending or accumulation trails.");
        this.fJ(true);
        wD<pT> var44 = this::yU;
        this.iI(pT.class, var44);
    }

    public int X() {
        int var1 = U;
        var1 ^= -800692816;
        int var2 = System.identityHashCode(this);
        ia var3 = this.w;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            var1 *= 738265835;
            var1 ^= 763601364;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var4 = var1 + 2;
            var2 *= var4;
            var4 = var1 + 3;
            var2 *= var4;
            var2 &= 7;
            if (var2 != 0) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            } else {
                return var3.JQ();
            }
        } else {
            var1 *= -490813663;
            var1 <<= 31;
            var1 ^= -408937433;
            RuntimeException var9 = new RuntimeException();
            throw var9;
        }
    }

    public void hJ(float var1) {
        int var2 = U;
        var2 ^= -203844972;
        int var3 = System.identityHashCode(this);
        Uq var4 = this.lU;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            var2 <<= 16;
            var2 -= 1716887085;
            var2 >>>= 5;
            var2 &= -1774912839;
            var2 ^= -739844197;
            AssertionError var21 = new AssertionError();
            throw var21;
        } else {
            switch (var2) {
                case -1062115099:
                default:
                    var2 ^= 1861785193;
                    break;
                case 1053195499:
                    var2 *= 45624207;
                    var2 ^= -1277008640;
                    var2 &= 151776111;
                    var2 ^= 278104900;
                    break;
                case 2025334979:
                    var2 ^= 741843641;
            }

            var4.Bi(var1);
        }
    }

    public float p() {
        int var1 = U;
        var1 ^= 1416860825;
        int var2 = System.identityHashCode(this);
        Uq var3 = this.lU;
        Integer var16 = var2;
        if (var16 == null) {
            var1 <<= 24;
            var1 += -1431978117;
            var1 ^= -1046502231;
            var1 ^= 708486253;
            IllegalArgumentException var19 = new IllegalArgumentException();
            throw var19;
        } else {
            var1 ^= -1224708119;
            var1 -= -1135958308;
            var1 ^= 122591590;
            var1 >>= 14;
            var1 ^= 2046964665;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            var1 = var17 & 1;
            if (var1 == 0) {
                return var3.WM();
            } else {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }
    }

    private void yU(pT var1) {
        label310: {
            int var20;
            label309: {
                var20 = U;
                var20 ^= -806168661;
                int var3 = System.identityHashCode(this);
                int[] var4 = wZ.X;
                int var5 = var3 + 1;
                var5 = var3 * var5;
                int var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    var20 &= -564939239;
                    var20 ^= -1409591293;
                    var20 |= 73847974;
                    var20 &= 1445074047;
                    var20 ^= -735676141;
                    var5 = var20 + 1;
                    var5 = var20 * var5;
                    var6 = var20 + 2;
                    var5 *= var6;
                    var6 = var20 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label310;
                    }

                    SceneStage var286 = var1.stage();
                    var5 = var286.ordinal();
                    int var208 = var4[var5];
                    label306:
                    switch (var208) {
                        case 1:
                            var20 *= 896440311;
                            var20 >>>= 10;
                            var20 <<= 4;
                            var20 >>>= 10;
                            var20 ^= -596151988;
                            long var272 = var20;
                            long var373 = var272 + 1L;
                            long var374 = var272 * var373;
                            long var389 = var272 + 2L;
                            long var375 = var374 * var389;
                            long var273 = var272 + 3L;
                            long var376 = var375 * var273;
                            long var274 = var376 & 7L;
                            long var398;
                            int var275 = (var398 = var274 - 0L) == 0L ? 0 : (var398 < 0L ? -1 : 1);
                            if (var275 != 0) {
                                break label310;
                            }

                            FrameContext var276 = var1.frame();
                            var5 = var3 + 1;
                            var5 = var3 * var5;
                            var3 = var5 & 1;
                            if (var3 == 0) {
                                var20 *= 1060711477;
                                var20 ^= 796116556;
                                var20 ^= 1538711355;
                                Integer var202 = var20;
                                if (var202 == null) {
                                    break label310;
                                }

                                int var203 = var20 * 1494557755;
                                var203 += 703404526;
                                var203 -= -2059664475;
                                var203 ^= 1514653078;
                                this.VR(var276, var203);
                                var20 ^= -1387734082;
                                var20 += 1654560404;
                                var20 ^= -311716703;
                                var20 &= -886917520;
                                var20 ^= 2028723868;
                                break label309;
                            }

                            var20 &= -664874658;
                            var20 |= 158412474;
                            var20 += 1256617480;
                            var20 ^= 1779449187;
                            break;
                        case 2:
                            var20 *= 1031056327;
                            var20 ^= -358825471;
                            long var241 = var20;
                            long var355 = var241 + 1L;
                            long var356 = var241 * var355;
                            long var242 = var356 & 1L;
                            long var393;
                            int var243 = (var393 = var242 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                            if (var243 != 0) {
                                break label310;
                            }

                            int var244 = var20 - 1564716287;
                            int var245 = var244 - 808371937;
                            int var246 = var245 & -265099226;
                            int var247 = var246 ^ -440435054;
                            int var248 = var247 ^ 1743747358;
                            boolean var249 = this.hH(var248);
                            long var307 = var3;
                            long var380 = var307 + 1L;
                            var380 = var307 * var380;
                            long var9 = var307 + 2L;
                            var380 *= var9;
                            long var308 = var307 + 3L;
                            var380 *= var308;
                            long var309 = var380 & 7L;
                            long var394;
                            var5 = (var394 = var309 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
                            if (var5 == 0) {
                                var20 += 1288726633;
                                var20 &= -690446384;
                                var20 ^= -1937740686;
                                if (!var249) {
                                    var20 |= -698536104;
                                    var20 *= -984929617;
                                    var20 |= 1381036244;
                                    var20 *= -579134037;
                                    var20 ^= 345153593;
                                    return;
                                }

                                var20 |= -818675407;
                                var20 |= 569984586;
                                var20 |= 2144221202;
                                var20 ^= 355669043;
                                long var250 = var20;
                                long var357 = var250 + 1L;
                                long var358 = var250 * var357;
                                long var251 = var358 & 1L;
                                long var395;
                                int var252 = (var395 = var251 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                                if (var252 != 0) {
                                    break label310;
                                }

                                r_2 var253 = this.r;
                                Enum var254 = var253.A();
                                qS var255 = (qS)var254;
                                boolean var256 = var255.velocity();
                                long var311 = var3;
                                var380 = var311 + 1L;
                                var380 = var311 * var380;
                                long var312 = var380 & 1L;
                                long var396;
                                var5 = (var396 = var312 - 0L) == 0L ? 0 : (var396 < 0L ? -1 : 1);
                                if (var5 == 0) {
                                    var20 |= -848783048;
                                    var20 += -522341807;
                                    var20 ^= -1946745423;
                                    Integer var314 = var20;
                                    if (var314 == null) {
                                        break label310;
                                    }

                                    if (!var256) {
                                        switch (var20) {
                                            case -2144133225:
                                            default:
                                                var20 ^= 2108395058;
                                                return;
                                            case -1757212930:
                                                var20 ^= -2147371682;
                                                return;
                                            case 1530767480:
                                                var20 >>= 14;
                                                var20 ^= 1764091549;
                                                return;
                                        }
                                    }

                                    var20 *= -507536539;
                                    var20 ^= 739647116;
                                    var20 ^= 1186869142;
                                    int var257 = var20 + 1;
                                    int var258 = var20 * var257;
                                    int var315 = var20 + 2;
                                    int var259 = var258 * var315;
                                    var315 = var20 + 3;
                                    int var260 = var259 * var315;
                                    int var261 = var260 & 7;
                                    if (var261 != 0) {
                                        break label310;
                                    }

                                    boolean var262 = this.E;
                                    Integer var317 = var3;
                                    if (var317 != null) {
                                        var20 = switch (var20) {
                                            case 393489986 -> {
                                                var20 |= -1270413732;
                                                var20 += -1568283618;
                                                var20 *= 1599400251;
                                                var20 |= -103955289;
                                                yield var20 ^ -7267710;
                                            }
                                            case 925700834 -> var20 ^ -1704595994;
                                            default -> var20 ^ 1394564637;
                                        };
                                        var317 = var20;
                                        if (var317 == null) {
                                            break label310;
                                        }

                                        if (var262) {
                                            var20 = switch (var20) {
                                                default -> var20 ^ 2106094228;
                                                case 5162037 -> {
                                                    var20 |= -1452584670;
                                                    var20 -= 1315413224;
                                                    yield var20 ^ -2037665670;
                                                }
                                                case 461600876 -> var20 ^ 1793322207;
                                            };
                                            boolean var263 = this.JQ;
                                            int var319 = var3 + 1;
                                            var319 = var3 * var319;
                                            var6 = var3 + 2;
                                            var319 *= var6;
                                            var6 = var3 + 3;
                                            var319 *= var6;
                                            var319 &= 7;
                                            if (var319 == 0) {
                                                var20 *= 584616719;
                                                var20 ^= -1719419939;
                                                var319 = var20 + 1;
                                                var319 = var20 * var319;
                                                var6 = var20 + 2;
                                                var319 *= var6;
                                                var6 = var20 + 3;
                                                var319 *= var6;
                                                var319 &= 7;
                                                if (var319 != 0) {
                                                    break label310;
                                                }

                                                if (var263) {
                                                    var20 *= -109697279;
                                                    var20 ^= 1163579226;
                                                    break label309;
                                                }

                                                var20 -= -1522905502;
                                                var20 &= -1228833436;
                                                var20 ^= -1868717889;
                                                int var264 = var20 + 1;
                                                int var265 = var20 * var264;
                                                var319 = var20 + 2;
                                                int var266 = var265 * var319;
                                                var319 = var20 + 3;
                                                int var267 = var266 * var319;
                                                int var268 = var267 & 7;
                                                if (var268 != 0) {
                                                    break label310;
                                                }

                                                RenderTarget var269 = var1.target();
                                                var319 = var3 + 1;
                                                var319 = var3 * var319;
                                                var319 &= 1;
                                                if (var319 == 0) {
                                                    var20 ^= 1749576746;
                                                    var20 *= 1845959499;
                                                    var20 ^= 2086872094;
                                                    Integer var334 = var20;
                                                    if (var334 == null) {
                                                        break label310;
                                                    }

                                                    VelocityBlur$Mode var335 = VelocityBlur$Mode.FULL;
                                                    var6 = var20 << 24;
                                                    var6 ^= -1530975382;
                                                    this.XN(var269, var335, var6);
                                                    var20 += 243590082;
                                                    var20 *= 1426529393;
                                                    var20 ^= -1864179765;
                                                    break label309;
                                                }

                                                switch (var20) {
                                                    case -1340241445:
                                                        var20 ^= 607856832;
                                                        var20 -= 622493786;
                                                        var20 ^= 558001056;
                                                        break label306;
                                                    case -1051358425:
                                                    default:
                                                        var20 ^= 805990884;
                                                        break label306;
                                                    case 437796753:
                                                        var20 ^= 1894579351;
                                                }
                                            } else {
                                                var20 *= 983349705;
                                                var20 <<= 2;
                                                var20 ^= 287702828;
                                                var20 ^= -1351922119;
                                            }
                                        } else {
                                            var20 *= 2097677675;
                                            var20 >>= 31;
                                            var20 += -1523196698;
                                            var20 &= -4172488;
                                            var20 ^= -766910332;
                                            boolean var270 = this.oh;
                                            int var336 = var3 + 1;
                                            var336 = var3 * var336;
                                            var336 &= 1;
                                            if (var336 != 0) {
                                                var20 -= -775976244;
                                                var20 |= 1597891185;
                                                var20 *= -420367431;
                                                var20 += 501518654;
                                                var20 ^= -1297057714;
                                            } else {
                                                var20 *= 513050783;
                                                var20 >>= 20;
                                                var20 ^= 369184428;
                                                if (var270) {
                                                    var20 |= 1661266437;
                                                    var20 >>= 3;
                                                    var20 ^= 1698731687;
                                                    var20 *= -141318763;
                                                    var20 ^= -1734875535;
                                                    break label309;
                                                }

                                                var20 <<= 25;
                                                var20 &= 2137615901;
                                                var20 ^= -1324778625;
                                                RenderTarget var271 = var1.target();
                                                VelocityBlur$Mode var339 = VelocityBlur$Mode.PARALLAX;
                                                long var365 = var3;
                                                long var387 = var365 + 1L;
                                                var387 = var365 * var387;
                                                long var366 = var387 & 1L;
                                                long var397;
                                                var6 = (var397 = var366 - 0L) == 0L ? 0 : (var397 < 0L ? -1 : 1);
                                                if (var6 == 0) {
                                                    var20 &= 407048379;
                                                    var20 ^= 1659115784;
                                                    var20 |= -576865237;
                                                    var20 ^= 1750870250;
                                                    Integer var368 = var20;
                                                    if (var368 == null) {
                                                        break label310;
                                                    }

                                                    int var369 = var20 - 1331499442;
                                                    var369 |= -1326650435;
                                                    var369 ^= 1689437458;
                                                    var369 ^= -1109327417;
                                                    this.XN(var271, var339, var369);
                                                    var20 ^= -2093319889;
                                                    var20 ^= -1401782174;
                                                    break label309;
                                                }

                                                switch (var20) {
                                                    case -691767627:
                                                    default:
                                                        var20 ^= -1141248654;
                                                        break label306;
                                                    case -653689985:
                                                        var20 *= 2124753699;
                                                        var20 ^= 14865582;
                                                        var20 ^= 273262738;
                                                        break label306;
                                                    case 1345099994:
                                                        var20 ^= 1115085502;
                                                }
                                            }
                                        }
                                    } else {
                                        var20 |= 389111090;
                                        var20 ^= -449030433;
                                        var20 *= -128268489;
                                        var20 &= -968999126;
                                        var20 ^= 1281385547;
                                    }
                                } else {
                                    var20 += 1638448313;
                                    var20 |= 2016949112;
                                    var20 ^= 842264600;
                                }
                            } else {
                                switch (var20) {
                                    case -1480103974:
                                        var20 ^= 1906673943;
                                        break label306;
                                    case -1229391921:
                                    default:
                                        var20 ^= -1614913508;
                                        break label306;
                                    case 1513824509:
                                        var20 |= -707704579;
                                        var20 ^= -1850399844;
                                }
                            }
                            break;
                        case 3:
                            var20 += -499799467;
                            var20 ^= -48583411;
                            int var211 = var20 + 1;
                            int var212 = var20 * var211;
                            int var213 = var212 & 1;
                            if (var213 != 0) {
                                break label310;
                            }

                            int var214 = var20 ^ -863174833;
                            int var215 = var214 ^ -138502783;
                            int var216 = var215 | 959702770;
                            int var217 = var216 | -437862373;
                            int var218 = var217 ^ -1079553677;
                            boolean var219 = this.hH(var218);
                            Integer var295 = var3;
                            if (var295 != null) {
                                var20 *= 335138175;
                                var20 *= -868054443;
                                var20 += -1577189235;
                                var20 ^= -1450589669;
                                var20 ^= 1176104555;
                                if (!var219) {
                                    var20 -= -71460543;
                                    var20 |= -1977674012;
                                    var20 &= -511447200;
                                    var20 += 536109230;
                                    var20 ^= 1193149586;
                                    break label309;
                                }

                                var20 >>>= 9;
                                var20 += 1312716478;
                                var20 &= 2131983117;
                                var20 ^= -1722751057;
                                int var220 = var20 + 1;
                                int var221 = var20 * var220;
                                int var296 = var20 + 2;
                                int var222 = var221 * var296;
                                var296 = var20 + 3;
                                int var223 = var222 * var296;
                                int var224 = var223 & 7;
                                if (var224 != 0) {
                                    break label310;
                                }

                                r_2 var225 = this.r;
                                Enum var226 = var225.A();
                                qS var227 = (qS)var226;
                                boolean var228 = var227.velocity();
                                Integer var298 = var3;
                                if (var298 == null) {
                                    switch (var20) {
                                        case -683501650:
                                            var20 &= -2124202852;
                                            var20 -= -424140713;
                                            var20 |= -567025952;
                                            var20 ^= -1862945388;
                                            break label306;
                                        case 194856233:
                                            var20 ^= -487545747;
                                            break label306;
                                        case 1693276913:
                                        default:
                                            var20 ^= -1858762366;
                                    }
                                } else {
                                    var20 += 703236470;
                                    var20 ^= 1712859900;
                                    var20 ^= -1064352050;
                                    var20 ^= 933580962;
                                    if (!var228) {
                                        switch (var20) {
                                            case -1877008972:
                                                var20 ^= 1507609998;
                                                var20 &= -1821050215;
                                                var20 += -1137144458;
                                                var20 ^= -2054049518;
                                                break label309;
                                            case 589777663:
                                            default:
                                                var20 ^= -730086496;
                                                break label309;
                                            case 1402879429:
                                                var20 ^= 1515357045;
                                                break label309;
                                        }
                                    }
                                    var20 = switch (var20) {
                                        case -1877008972 -> {
                                            var20 &= 340912720;
                                            yield var20 ^ 807891460;
                                        }
                                        default -> var20 ^ -939789824;
                                        case 777941624 -> var20 ^ 1438457008;
                                    };
                                    int var229 = var20 + 1;
                                    int var230 = var20 * var229;
                                    int var231 = var230 & 1;
                                    if (var231 != 0) {
                                        break label310;
                                    }

                                    boolean var232 = this.E;
                                    long var299 = var3;
                                    long var378 = var299 + 1L;
                                    var378 = var299 * var378;
                                    long var300 = var378 & 1L;
                                    long var391;
                                    int var301 = (var391 = var300 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                                    if (var301 != 0) {
                                        switch (var20) {
                                            case 540441108:
                                                var20 >>= 31;
                                                var20 *= 279193617;
                                                var20 &= 505297871;
                                                var20 ^= 1313753953;
                                                break label306;
                                            case 1251053100:
                                                var20 ^= -332444102;
                                                break label306;
                                            case 1641461160:
                                            default:
                                                var20 ^= -1148018862;
                                        }
                                    } else {
                                        var20 = switch (var20) {
                                            case 540441108 -> {
                                                var20 ^= -1589339400;
                                                var20 |= -1830557686;
                                                yield var20 ^ 1745822422;
                                            }
                                            default -> var20 ^ -1317451912;
                                            case 2050194717 -> var20 ^ -463275632;
                                        };
                                        if (var232) {
                                            var20 |= -1348804323;
                                            var20 |= 26648512;
                                            var20 >>= 31;
                                            var20 += -188168606;
                                            var20 ^= 1277274877;
                                            break label309;
                                        }

                                        var20 -= -1063625434;
                                        var20 &= -304887091;
                                        var20 |= 364074533;
                                        var20 ^= 543079308;
                                        Integer var233 = var20;
                                        if (var233 == null) {
                                            break label310;
                                        }

                                        boolean var234 = this.JQ;
                                        Integer var302 = var3;
                                        if (var302 == null) {
                                            var20 |= -1439970917;
                                            var20 -= 1869218884;
                                            var20 += -129327346;
                                            var20 *= -391080999;
                                            var20 ^= -1441375012;
                                        } else {
                                            var20 += 130817139;
                                            var20 -= -527207784;
                                            var20 += 850533923;
                                            var20 ^= -1919202701;
                                            var302 = var20;
                                            if (var302 == null) {
                                                break label310;
                                            }

                                            if (var234) {
                                                var20 += 176105649;
                                                var20 *= -1737644241;
                                                var20 ^= -325146633;
                                                break label309;
                                            }

                                            var20 &= 806943990;
                                            var20 += -1684639766;
                                            var20 += -185295724;
                                            var20 ^= -1778488481;
                                            int var235 = var20 + 1;
                                            int var236 = var20 * var235;
                                            int var304 = var20 + 2;
                                            int var237 = var236 * var304;
                                            var304 = var20 + 3;
                                            int var238 = var237 * var304;
                                            int var239 = var238 & 7;
                                            if (var239 != 0) {
                                                break label310;
                                            }

                                            RenderTarget var240 = var1.target();
                                            VelocityBlur$Mode var306 = VelocityBlur$Mode.TURN;
                                            long var348 = var3;
                                            long var8 = var348 + 1L;
                                            var8 = var348 * var8;
                                            long var349 = var8 & 1L;
                                            long var392;
                                            var6 = (var392 = var349 - 0L) == 0L ? 0 : (var392 < 0L ? -1 : 1);
                                            if (var6 == 0) {
                                                var20 += -2034427324;
                                                var20 &= 968892196;
                                                var20 ^= -669935938;
                                                var20 ^= -445793109;
                                                var6 = var20 << 5;
                                                var6 |= -588695314;
                                                var6 ^= 271472138;
                                                var6 ^= -830568562;
                                                this.XN(var240, var306, var6);
                                                var20 ^= 1815927247;
                                                var20 ^= -240547002;
                                                break label309;
                                            }

                                            switch (var20) {
                                                case -1677651493:
                                                    var20 ^= -1493482722;
                                                    break label306;
                                                case 795558556:
                                                default:
                                                    var20 ^= -943516352;
                                                    break label306;
                                                case 1433770509:
                                                    var20 -= -654310707;
                                                    var20 += 615648955;
                                                    var20 <<= 15;
                                                    var20 ^= -1665938591;
                                            }
                                        }
                                    }
                                }
                            } else {
                                var20 -= -1325707286;
                                var20 &= -846639949;
                                var20 |= -2027396462;
                                var20 ^= -1050205709;
                            }
                            break;
                        case 4:
                            var20 |= 77671392;
                            var20 -= -1198824784;
                            var20 ^= -778758576;
                            Integer var209 = var20;
                            if (var209 == null) {
                                break label310;
                            }

                            RenderTarget var210 = var1.target();
                            long var288 = var3;
                            long var7 = var288 + 1L;
                            var7 = var288 * var7;
                            long var289 = var7 & 1L;
                            long var390;
                            var5 = (var390 = var289 - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                            if (var5 == 0) {
                                var20 &= -301318518;
                                var20 |= -825452151;
                                var20 ^= -1241632014;
                                var20 ^= -805352323;
                                var5 = var20 + 1;
                                var5 = var20 * var5;
                                var5 &= 1;
                                if (var5 != 0) {
                                    break label310;
                                }

                                FrameContext var294 = var1.frame();
                                var6 = var20 + -838874261;
                                var6 <<= 16;
                                var6 ^= -1449803561;
                                this.kH(var210, var294, var6);
                                switch (var20) {
                                    case -1261443834:
                                        var20 ^= 887061956;
                                        var20 += 1103477279;
                                        var20 ^= 2034187901;
                                        break label309;
                                    case 196283633:
                                    default:
                                        var20 ^= -1751318357;
                                        break label309;
                                    case 409060810:
                                        var20 ^= 1211968883;
                                        break label309;
                                }
                            }

                            switch (var20) {
                                case -846259356:
                                    var20 >>>= 15;
                                    var20 -= -900541776;
                                    var20 |= 667360131;
                                    var20 >>= 7;
                                    var20 ^= 1310823638;
                                    break label306;
                                case -559874608:
                                default:
                                    var20 ^= -792470002;
                                    break label306;
                                case 1132914825:
                                    var20 ^= 427368358;
                                    break label306;
                            }
                        default:
                            switch (var20) {
                                case -1282567703:
                                    var20 ^= 1882696804;
                                    break label309;
                                case -883789755:
                                default:
                                    var20 ^= 1163148993;
                                    break label309;
                                case -805016284:
                                    var20 += 336007570;
                                    var20 &= -216306535;
                                    var20 <<= 9;
                                    var20 ^= -1372566372;
                                    break label309;
                            }
                    }
                } else {
                    var20 |= -441058536;
                    var20 ^= -1447841603;
                }

                Integer var198 = var20;
                if (var198 != null) {
                    IllegalArgumentException var200 = new IllegalArgumentException();
                    throw var200;
                }
                break label310;
            }

            Integer var207 = var20;
            if (var207 != null) {
                return;
            }
        }

        IllegalStateException var199 = new IllegalStateException();
        throw var199;
    }

    private boolean hH(int var1) {
        int var3 = System.identityHashCode(this);
        Uq var4 = this.lU;
        float var37 = var4.WM();
        Integer var29 = var3;
        if (var29 == null) {
            int var2 = var1 - 1246518546;
            var2 ^= -1501145284;
            int var30 = var2 + 1;
            var30 = var2 * var30;
            var30 &= 1;
            if (var30 == 0) {
                UnsupportedOperationException var33 = new UnsupportedOperationException();
                throw var33;
            }
        } else {
            int var10 = var1 | -1989102375;
            var10 -= -1869045230;
            var10 ^= 2108580462;
            long var5 = var10;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var40;
            int var34 = (var40 = var5 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var34 == 0) {
                float var41;
                var34 = (var41 = var37 - 0.0F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
                boolean var36;
                if (var34 != 0) {
                    var10 -= -1496903207;
                    var10 ^= 305705350;
                    var10 &= 1790520585;
                    var10 ^= -1291609224;
                    var36 = true;
                    var10 >>>= 25;
                    var10 += -1319196139;
                    var10 ^= 1393257264;
                } else {
                    var10 -= 582617269;
                    var10 >>= 30;
                    var10 >>>= 25;
                    var10 ^= 2082640360;
                    var36 = false;
                    var10 &= 2044596165;
                    var10 *= 639107143;
                    var10 >>>= 13;
                    var10 ^= -497920738;
                }

                return var36;
            }
        }

        RuntimeException var13 = new RuntimeException();
        throw var13;
    }

    private void VR(FrameContext var1, int var2) {
        Object var306 = null;
        boolean var397 = false;
        boolean var403 = false;
        boolean var439 = false;
        boolean var472 = false;
        boolean var536 = false;
        label483: {
            int var4 = System.identityHashCode(this);
            long var5 = System.nanoTime();
            long var7 = this.Zm;
            long var609;
            int var316 = (var609 = var7 - 0L) == 0L ? 0 : (var609 < 0L ? -1 : 1);
            long var8 = var4;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            var8 = var10 & 1L;
            long var610;
            int var337 = (var610 = var8 - 0L) == 0L ? 0 : (var610 < 0L ? -1 : 1);
            int var3;
            if (var337 != 0) {
                switch (var2) {
                    case -1682698263:
                        var3 = var2 ^ 1042389788;
                        break;
                    case -1215262503:
                        var3 = var2 * -812715381;
                        var3 |= -1690840571;
                        var3 >>= 24;
                        var3 *= 254913695;
                        var3 ^= -1997428288;
                        break;
                    case 1122792253:
                    default:
                        var3 = var2 ^ 1106931644;
                }
            } else {
                label485: {
                    var3 = var2 + -52831378;
                    var3 &= 914754354;
                    var3 -= -1077718988;
                    var3 &= 936966518;
                    var3 ^= 1759335945;
                    var8 = var3;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var611;
                    int var341 = (var611 = var8 - 0L) == 0L ? 0 : (var611 < 0L ? -1 : 1);
                    if (var341 != 0) {
                        break label483;
                    }

                    float var317;
                    if (var316 == 0) {
                        var3 >>= 3;
                        var3 += 846349445;
                        var3 &= -139463817;
                        var3 ^= -1575299666;
                        var317 = 0.0F;
                        switch (var3) {
                            case -1810770744:
                                var3 >>>= 23;
                                var3 >>= 13;
                                var3 &= -1378981022;
                                var3 <<= 16;
                                var3 ^= -1563519391;
                                break;
                            case -495384200:
                            default:
                                var3 ^= -1346110315;
                                break;
                            case 1790772775:
                                var3 ^= 951767351;
                        }
                    } else {
                        var3 &= 1546546210;
                        var3 += -1147308158;
                        var3 >>= 25;
                        var3 ^= 1849132183;
                        var8 = var3;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var612;
                        int var345 = (var612 = var8 - 0L) == 0L ? 0 : (var612 < 0L ? -1 : 1);
                        if (var345 != 0) {
                            break label483;
                        }

                        var8 = this.Zm;
                        var10 = var4;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var613;
                        int var376 = (var613 = var10 - 0L) == 0L ? 0 : (var613 < 0L ? -1 : 1);
                        if (var376 != 0) {
                            var3 -= -1791526880;
                            var3 <<= 7;
                            var3 ^= -278139163;
                            break label485;
                        }
                        var3 = switch (var3) {
                            default -> var3 ^ -477758878;
                            case 1626974543 -> var3 ^ 423695938;
                            case 1849132188 -> {
                                var3 ^= 1078431316;
                                var3 &= 1685129157;
                                var3 *= -1002999973;
                                var3 >>= 17;
                                yield var3 ^ -1091158365;
                            }
                        };
                        var8 = var5 - var8;
                        float var348 = cr.i(var8);
                        var317 = var348;
                        var3 >>= 17;
                        var3 -= 1911075759;
                        var3 ^= 752467373;
                    }

                    int var349 = var3 + 1;
                    int var350 = var3 * var349;
                    int var9 = var3 + 2;
                    int var351 = var350 * var9;
                    var9 = var3 + 3;
                    int var352 = var351 * var9;
                    int var353 = var352 & 7;
                    if (var353 != 0) {
                        break label483;
                    }

                    this.Qr = var317;
                    this.Zm = var5;
                    var7 = var4;
                    long var356 = var7 + 1L;
                    long var357 = var7 * var356;
                    var7 = var357 & 1L;
                    long var614;
                    int var320 = (var614 = var7 - 0L) == 0L ? 0 : (var614 < 0L ? -1 : 1);
                    label473:
                    if (var320 == 0) {
                        var3 &= 157865348;
                        var3 <<= 23;
                        var3 -= -1653032758;
                        var3 >>= 17;
                        var3 ^= -1748243447;
                        Integer var321 = var3;
                        if (var321 == null) {
                            break label483;
                        }

                        label489: {
                            var7 = this.x;
                            long var615;
                            int var323 = (var615 = var7 - 0L) == 0L ? 0 : (var615 < 0L ? -1 : 1);
                            if (var323 != 0) {
                                var3 &= -1086617982;
                                var3 &= -301432036;
                                var3 += -676148574;
                                var3 ^= -508626845;
                                Integer var324 = var3;
                                if (var324 == null) {
                                    break label483;
                                }

                                var7 = this.x;
                                var9 = var4 + 1;
                                var9 = var4 * var9;
                                int var377 = var4 + 2;
                                var9 *= var377;
                                int var378 = var4 + 3;
                                var9 *= var378;
                                var9 &= 7;
                                if (var9 != 0) {
                                    var3 >>= 3;
                                    var3 |= -2102888187;
                                    var3 += -566554196;
                                    var3 ^= -1165245972;
                                    break label473;
                                }

                                var3 >>= 28;
                                var3 ^= 240195792;
                                var3 &= 638869115;
                                var3 &= -297933253;
                                var3 ^= -1337617186;
                                Integer var363 = var3;
                                if (var363 == null) {
                                    break label483;
                                }

                                var7 = var5 - var7;
                                long var616;
                                int var327 = (var616 = var7 - 1000000000L) == 0L ? 0 : (var616 < 0L ? -1 : 1);
                                if (var327 < 0) {
                                    switch (var3) {
                                        case -1874734347:
                                            var3 *= -1711840781;
                                            var3 ^= -402205028;
                                            var3 ^= 1087013747;
                                            break label489;
                                        case -1591026292:
                                            var3 ^= -908553191;
                                            break label489;
                                        case 1459423137:
                                        default:
                                            var3 ^= -1974463663;
                                            break label489;
                                    }
                                }

                                var3 *= 1657718149;
                                var3 >>= 12;
                                var3 *= 48813771;
                                var3 ^= -2059073158;
                            } else {
                                var3 >>>= 12;
                                var3 ^= 1049349153;
                            }

                            int var328 = i_2.H();
                            this.Mx = var328;
                            Integer var329 = var4;
                            if (var329 == null) {
                                var3 -= 310399380;
                                var3 += 288691320;
                                var3 |= 1840152052;
                                var3 ^= 315797265;
                                break label473;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ 2141418903;
                                case 1027837572 -> var3 ^ -1240208083;
                                case 1048752284 -> {
                                    var3 -= 2017374696;
                                    var3 |= -634452974;
                                    var3 &= 1703477999;
                                    var3 *= -60354129;
                                    yield var3 ^ 1171133705;
                                }
                            };
                            this.x = var5;
                            var3 += 767151775;
                            var3 ^= -2121610894;
                        }

                        var5 = var3;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var364 = var5 + 2L;
                        var7 *= var364;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var617;
                        int var297 = (var617 = var5 - 0L) == 0L ? 0 : (var617 < 0L ? -1 : 1);
                        if (var297 != 0) {
                            break label483;
                        }

                        boolean var298 = i_2.c();
                        this.E = var298;
                        Ud var299 = Ud.Z();
                        AuraPipeline var300 = var299.Ul();
                        Projection var301 = var300.projection();
                        float[] var6 = this.Y;
                        var301.viewMatrix(var6);
                        Matrix4f var309 = this.q;
                        float[] var334 = this.Y;
                        Matrix4f var310 = var309.set(var334);
                        var6 = this.Y;
                        var301.projectionMatrix(var6);
                        Matrix4f var312 = this.k;
                        float[] var335 = this.Y;
                        Matrix4f var313 = var312.set(var335);
                        double var314 = var301.cameraX();
                        double var354 = var301.cameraY();
                        double var379 = var301.cameraZ();
                        double var383 = this.XL;
                        double var384 = var314 - var383;
                        double var14 = this.zR;
                        var14 = var354 - var14;
                        double var16 = this.tA;
                        var16 = var379 - var16;
                        long var18 = var4;
                        long var20 = var18 + 1L;
                        var20 = var18 * var20;
                        long var22 = var18 + 2L;
                        var20 *= var22;
                        var18 += 3L;
                        var20 *= var18;
                        var18 = var20 & 7L;
                        long var618;
                        int var302 = (var618 = var18 - 0L) == 0L ? 0 : (var618 < 0L ? -1 : 1);
                        if (var302 != 0) {
                            switch (var3) {
                                case 295041229:
                                    var3 ^= 504914925;
                                    break;
                                case 720415431:
                                default:
                                    var3 ^= -1467518273;
                                    break;
                                case 2114012768:
                                    var3 -= -311775556;
                                    var3 ^= -309439;
                            }
                        } else {
                            label535: {
                                var3 >>>= 17;
                                var3 ^= 2001989947;
                                int var303 = var3 + 1;
                                int var304 = var3 * var303;
                                int var305 = var304 & 1;
                                if (var305 != 0) {
                                    break label483;
                                }

                                label449: {
                                    var306 = i_2.U();
                                    boolean var523 = this.K;
                                    if (var523) {
                                        var3 &= 2141935885;
                                        var3 -= 355629231;
                                        var3 |= 1717755705;
                                        var3 ^= -941915604;
                                        var18 = var1.frame();
                                        var20 = this.Di;
                                        int var591 = var4 + 1;
                                        int var592 = var4 * var591;
                                        int var593 = var592 & 1;
                                        if (var593 != 0) {
                                            switch (var3) {
                                                case -1607901865:
                                                    var3 += 134753607;
                                                    var3 *= -974187475;
                                                    var3 &= 1347822044;
                                                    var3 *= 1042621289;
                                                    var3 ^= -1950583423;
                                                    break label535;
                                                case -937724770:
                                                default:
                                                    var3 ^= 217519334;
                                                    break label535;
                                                case -467151777:
                                                    var3 ^= 53889894;
                                                    break label535;
                                            }
                                        }
                                        var3 = switch (var3) {
                                            case -1607901865 -> {
                                                var3 >>>= 25;
                                                yield var3 ^ -844504332;
                                            }
                                            default -> var3 ^ -909236247;
                                            case 2109642134 -> var3 ^ 339934530;
                                        };
                                        long var619;
                                        int var525 = (var619 = var18 - ++var20) == 0L ? 0 : (var619 < 0L ? -1 : 1);
                                        if (var525 == 0) {
                                            var3 >>= 12;
                                            var3 &= 820967252;
                                            var3 -= 1868261887;
                                            var3 ^= -504956735;
                                            Integer var526 = var3;
                                            if (var526 == null) {
                                                break label483;
                                            }

                                            Object var527 = this.Z;
                                            long var19 = var4;
                                            long var21 = var19 + 1L;
                                            var21 = var19 * var21;
                                            var19 = var21 & 1L;
                                            long var620;
                                            int var550 = (var620 = var19 - 0L) == 0L ? 0 : (var620 < 0L ? -1 : 1);
                                            if (var550 != 0) {
                                                var3 *= -1566582789;
                                                var3 <<= 21;
                                                var3 &= 1720087510;
                                                var3 ^= 233689317;
                                                break label535;
                                            }
                                            var3 = switch (var3) {
                                                case -1069654715 -> var3 ^ -1712858876;
                                                case 544706772 -> {
                                                    var3 |= 268920892;
                                                    var3 &= -998038395;
                                                    yield var3 ^ 681645960;
                                                }
                                                default -> var3 ^ 949244867;
                                            };
                                            var19 = var3;
                                            var21 = var19 + 1L;
                                            var21 = var19 * var21;
                                            long var23 = var19 + 2L;
                                            var21 *= var23;
                                            var19 += 3L;
                                            var21 *= var19;
                                            var19 = var21 & 7L;
                                            long var621;
                                            int var554 = (var621 = var19 - 0L) == 0L ? 0 : (var621 < 0L ? -1 : 1);
                                            if (var554 != 0) {
                                                break label483;
                                            }

                                            if (var306 == var527) {
                                                var3 -= 1848346355;
                                                var3 ^= -205370348;
                                                var3 *= -219486943;
                                                var3 ^= 1177606553;
                                                var18 = var3;
                                                var20 = var18 + 1L;
                                                var20 = var18 * var20;
                                                var22 = var18 + 2L;
                                                var20 *= var22;
                                                var18 += 3L;
                                                var20 *= var18;
                                                var18 = var20 & 7L;
                                                long var622;
                                                int var531 = (var622 = var18 - 0L) == 0L ? 0 : (var622 < 0L ? -1 : 1);
                                                if (var531 != 0) {
                                                    break label483;
                                                }

                                                double var532 = var384 * var384;
                                                double var574 = var14 * var14;
                                                Integer var595 = var4;
                                                if (var595 == null) {
                                                    var3 ^= -1216779960;
                                                    var3 ^= -1920303463;
                                                    break label535;
                                                }
                                                var3 = switch (var3) {
                                                    case 1436469044 -> {
                                                        var3 ^= 833560895;
                                                        var3 <<= 28;
                                                        yield var3 ^ 1163259363;
                                                    }
                                                    case 1567225844 -> var3 ^ 779175262;
                                                    default -> var3 ^ 1933951377;
                                                };
                                                int var596 = var3 + 1;
                                                int var597 = var3 * var596;
                                                int var603 = var3 + 2;
                                                int var598 = var597 * var603;
                                                int var604 = var3 + 3;
                                                int var599 = var598 * var604;
                                                int var600 = var599 & 7;
                                                if (var600 != 0) {
                                                    break label483;
                                                }

                                                double var533 = var532 + var574;
                                                double var575 = var16 * var16;
                                                double var534 = var533 + var575;
                                                double var623;
                                                int var535 = (var623 = var534 - 144.0) == 0.0 ? 0 : (var623 < 0.0 ? -1 : 1);
                                                if (var535 < 0) {
                                                    var3 ^= -1078254857;
                                                    var3 ^= -775498596;
                                                    var3 ^= 1420697309;
                                                    var3 &= 327559178;
                                                    var3 ^= 1674839827;
                                                    var536 = true;
                                                    var3 *= -358466767;
                                                    var3 ^= 1165300743;
                                                    break label449;
                                                }

                                                var3 -= -953446925;
                                                var3 >>>= 15;
                                                var3 ^= -585130864;
                                            } else {
                                                var3 *= 1673845995;
                                                var3 >>= 2;
                                                var3 ^= -1035569467;
                                            }
                                        } else {
                                            switch (var3) {
                                                case -930990905:
                                                default:
                                                    var3 ^= -818288221;
                                                    break;
                                                case -844504412:
                                                    var3 ^= 2006067559;
                                                    var3 ^= 586183053;
                                                    var3 -= 974555080;
                                                    var3 ^= -2085948862;
                                                    break;
                                                case 1041366100:
                                                    var3 ^= -1863079565;
                                            }
                                        }
                                    } else {
                                        var3 *= -96599711;
                                        var3 *= -495758989;
                                        var3 &= -1406140395;
                                        var3 -= -180124556;
                                        var3 ^= -671892663;
                                    }

                                    var536 = false;
                                    var3 |= -634113594;
                                    var3 ^= -1257218462;
                                }

                                Integer var555 = var3;
                                if (var555 == null) {
                                    break label483;
                                }

                                long var556 = var4;
                                long var585 = var556 + 1L;
                                var585 = var556 * var585;
                                long var557 = var585 & 1L;
                                long var624;
                                int var558 = (var624 = var557 - 0L) == 0L ? 0 : (var624 < 0L ? -1 : 1);
                                if (var558 != 0) {
                                    var3 |= -1268853219;
                                    var3 -= 109575344;
                                    var3 &= -1282893479;
                                    var3 <<= 23;
                                    var3 ^= -336736027;
                                } else {
                                    label496: {
                                        var3 >>>= 10;
                                        var3 ^= 947366213;
                                        var3 ^= -327491009;
                                        long var559 = var3;
                                        var585 = var559 + 1L;
                                        var585 = var559 * var585;
                                        long var605 = var559 + 2L;
                                        var585 *= var605;
                                        long var560 = var559 + 3L;
                                        var585 *= var560;
                                        long var561 = var585 & 7L;
                                        long var625;
                                        var558 = (var625 = var561 - 0L) == 0L ? 0 : (var625 < 0L ? -1 : 1);
                                        if (var558 != 0) {
                                            break label483;
                                        }

                                        double var548;
                                        double var579;
                                        double var602;
                                        if (!var536) {
                                            var3 |= 672738449;
                                            var3 <<= 14;
                                            var3 ^= 1512035571;
                                            Matrix4f var537 = this.M;
                                            Matrix4f var563 = this.q;
                                            Matrix4f var538 = var537.set(var563);
                                            int var539 = var4 + 1;
                                            int var540 = var4 * var539;
                                            int var541 = var540 & 1;
                                            if (var541 != 0) {
                                                var3 += -237408777;
                                                var3 *= -1486339741;
                                                var3 *= -732174767;
                                                var3 ^= -1408379589;
                                                break label496;
                                            }

                                            var3 *= -1066505987;
                                            var3 += -1465743175;
                                            var3 >>= 12;
                                            var3 ^= -1545287886;
                                            var18 = var3;
                                            var20 = var18 + 1L;
                                            var20 = var18 * var20;
                                            var18 = var20 & 1L;
                                            long var626;
                                            int var544 = (var626 = var18 - 0L) == 0L ? 0 : (var626 < 0L ? -1 : 1);
                                            if (var544 != 0) {
                                                break label483;
                                            }

                                            Matrix4f var545 = this.px;
                                            Matrix4f var564 = this.k;
                                            Matrix4f var546 = var545.set(var564);
                                            double var547 = 0.0;
                                            double var578 = 0.0;
                                            double var601 = 0.0;
                                            var602 = var601;
                                            var579 = var578;
                                            var548 = var547;
                                            var3 *= -32885187;
                                            var3 -= 1856577591;
                                            var3 -= 1294746936;
                                            var3 ^= -1593305937;
                                            var3 ^= -1245231082;
                                        } else {
                                            var3 = switch (var3) {
                                                default -> var3 ^ -1705225179;
                                                case -1845533059 -> var3 ^ -1599577554;
                                                case -736640879 -> {
                                                    var3 += -1607738400;
                                                    var3 |= -1617287060;
                                                    yield var3 ^ 910280571;
                                                }
                                            };
                                            var602 = var384;
                                            int var385 = var4 + 1;
                                            int var386 = var4 * var385;
                                            int var387 = var386 & 1;
                                            if (var387 != 0) {
                                                switch (var3) {
                                                    case -1473792451:
                                                        var3 ^= 1651878750;
                                                        break label496;
                                                    case -912622842:
                                                        var3 *= -1642600651;
                                                        var3 ^= -1925871781;
                                                        var3 ^= 31438208;
                                                        break label496;
                                                    case 850194310:
                                                    default:
                                                        var3 ^= 533116927;
                                                        break label496;
                                                }
                                            }

                                            var3 += 1255584294;
                                            var3 ^= -1020684014;
                                            var579 = var14;
                                            var548 = var16;
                                            var3 *= -2019418989;
                                            var3 &= -819431692;
                                            var3 += 469593179;
                                            var3 -= 539004122;
                                            var3 ^= -1173374006;
                                        }

                                        double var627;
                                        int var388 = (var627 = var602 - 0.0) == 0.0 ? 0 : (var627 < 0.0 ? -1 : 1);
                                        int var13 = var4 + 1;
                                        var13 = var4 * var13;
                                        var13 &= 1;
                                        label416:
                                        if (var13 == 0) {
                                            var3 <<= 19;
                                            var3 ^= -308045387;
                                            long var421 = var3;
                                            long var15 = var421 + 1L;
                                            var15 = var421 * var15;
                                            long var422 = var15 & 1L;
                                            long var628;
                                            var13 = (var628 = var422 - 0L) == 0L ? 0 : (var628 < 0L ? -1 : 1);
                                            if (var13 != 0) {
                                                break label483;
                                            }

                                            label412: {
                                                if (var388 == 0) {
                                                    var3 *= 213071681;
                                                    var3 <<= 11;
                                                    var3 -= -877787792;
                                                    var3 |= -578651921;
                                                    var3 ^= 328592003;
                                                    var12 = var3;
                                                    long var454 = var12 + 1L;
                                                    long var455 = var12 * var454;
                                                    var12 = var455 & 1L;
                                                    long var629;
                                                    int var391 = (var629 = var12 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
                                                    if (var391 != 0) {
                                                        break label483;
                                                    }

                                                    double var630;
                                                    int var392 = (var630 = var579 - 0.0) == 0.0 ? 0 : (var630 < 0.0 ? -1 : 1);
                                                    var13 = var4 + 1;
                                                    var13 = var4 * var13;
                                                    int var456 = var4 + 2;
                                                    var13 *= var456;
                                                    int var457 = var4 + 3;
                                                    var13 *= var457;
                                                    var13 &= 7;
                                                    if (var13 != 0) {
                                                        switch (var3) {
                                                            case -1058337553:
                                                            default:
                                                                var3 ^= 535635857;
                                                                break label416;
                                                            case -332001156:
                                                                var3 += 529147512;
                                                                var3 ^= 1711646242;
                                                                var3 ^= 44580915;
                                                                break label416;
                                                            case 1765773526:
                                                                var3 ^= 1159345306;
                                                                break label416;
                                                        }
                                                    }

                                                    var3 ^= 2021492801;
                                                    var3 &= -1856708458;
                                                    var3 ^= 1999293742;
                                                    Integer var429 = var3;
                                                    if (var429 == null) {
                                                        break label483;
                                                    }

                                                    if (var392 == 0) {
                                                        var3 = switch (var3) {
                                                            case -412463814 -> {
                                                                var3 >>>= 27;
                                                                var3 += 1733415116;
                                                                var3 |= -1444171035;
                                                                yield var3 ^ -1490781052;
                                                            }
                                                            case 750428456 -> var3 ^ -1616547817;
                                                            default -> var3 ^ 1433339715;
                                                        };
                                                        double var631;
                                                        int var393 = (var631 = var548 - 0.0) == 0.0 ? 0 : (var631 < 0.0 ? -1 : 1);
                                                        long var430 = var4;
                                                        var15 = var430 + 1L;
                                                        var15 = var430 * var15;
                                                        long var431 = var15 & 1L;
                                                        long var632;
                                                        int var432 = (var632 = var431 - 0L) == 0L ? 0 : (var632 < 0L ? -1 : 1);
                                                        if (var432 != 0) {
                                                            switch (var3) {
                                                                case -340265725:
                                                                    var3 ^= 788695061;
                                                                    break label416;
                                                                case 1222610537:
                                                                    var3 += 472112196;
                                                                    var3 <<= 31;
                                                                    var3 <<= 12;
                                                                    var3 ^= 1869467877;
                                                                    break label416;
                                                                case 1792161665:
                                                                default:
                                                                    var3 ^= 302395478;
                                                                    break label416;
                                                            }
                                                        }

                                                        var3 >>>= 7;
                                                        var3 |= 1558176262;
                                                        var3 >>>= 17;
                                                        var3 ^= 625199294;
                                                        var3 ^= 704645426;
                                                        if (var393 == 0) {
                                                            var3 >>>= 26;
                                                            var3 &= -1475085294;
                                                            var3 ^= 338352943;
                                                            var12 = var3;
                                                            long var458 = var12 + 1L;
                                                            long var459 = var12 * var458;
                                                            var12 = var459 & 1L;
                                                            long var633;
                                                            int var396 = (var633 = var12 - 0L) == 0L ? 0 : (var633 < 0L ? -1 : 1);
                                                            if (var396 != 0) {
                                                                break label483;
                                                            }

                                                            var397 = false;
                                                            switch (var3) {
                                                                case -745618819:
                                                                    var3 ^= -34306065;
                                                                    break label412;
                                                                case 338352941:
                                                                    var3 >>>= 14;
                                                                    var3 ^= 214331251;
                                                                    var3 >>= 13;
                                                                    var3 ^= 2075318793;
                                                                    var3 ^= -2104797510;
                                                                    break label412;
                                                                case 1349732540:
                                                                default:
                                                                    var3 ^= -1309191641;
                                                                    break label412;
                                                            }
                                                        }

                                                        var3 |= 1588253174;
                                                        var3 *= 717498555;
                                                        var3 *= -895445027;
                                                        var3 |= -1217711909;
                                                        var3 ^= -2102378122;
                                                    } else {
                                                        switch (var3) {
                                                            case -412463814:
                                                                var3 *= -145306139;
                                                                var3 &= -1552223881;
                                                                var3 ^= -1847012916;
                                                                var3 &= -1791001862;
                                                                var3 ^= -1378228473;
                                                                break;
                                                            case 1424150223:
                                                            default:
                                                                var3 ^= 1069469757;
                                                                break;
                                                            case 1635199524:
                                                                var3 ^= -219879807;
                                                        }
                                                    }
                                                } else {
                                                    var3 += -889560051;
                                                    var3 ^= -206681489;
                                                }

                                                var397 = true;
                                                var3 &= -1372164399;
                                                var3 -= -1386801911;
                                                var3 &= 235041061;
                                                var3 &= 1386317652;
                                                var3 ^= -80090238;
                                            }

                                            long var433 = var3;
                                            var15 = var433 + 1L;
                                            var15 = var433 * var15;
                                            long var24 = var433 + 2L;
                                            var15 *= var24;
                                            long var434 = var433 + 3L;
                                            var15 *= var434;
                                            long var435 = var15 & 7L;
                                            long var634;
                                            var13 = (var634 = var435 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
                                            if (var13 != 0) {
                                                break label483;
                                            }

                                            Integer var437 = var4;
                                            label396:
                                            if (var437 != null) {
                                                label504: {
                                                    var3 >>= 21;
                                                    var3 |= 1529290205;
                                                    var3 ^= 1769089337;
                                                    Matrix4f var438 = this.k;
                                                    Matrix4f var460 = this.px;
                                                    var439 = var438.equals(var460);
                                                    if (!var397) {
                                                        var3 >>= 9;
                                                        var3 ^= 1240908227;
                                                        var3 |= 1535143719;
                                                        var3 ^= -614334288;
                                                        var3 ^= -1993372694;
                                                        long var461 = var3;
                                                        long var514 = var461 + 1L;
                                                        long var515 = var461 * var514;
                                                        long var462 = var515 & 1L;
                                                        long var635;
                                                        int var463 = (var635 = var462 - 0L) == 0L ? 0 : (var635 < 0L ? -1 : 1);
                                                        if (var463 != 0) {
                                                            break label483;
                                                        }

                                                        if (var439) {
                                                            var3 |= -1631993948;
                                                            var3 ^= -1319657606;
                                                            int var464 = var3 + 1;
                                                            int var465 = var3 * var464;
                                                            int var493 = var3 + 2;
                                                            int var466 = var465 * var493;
                                                            int var494 = var3 + 3;
                                                            int var467 = var466 * var494;
                                                            int var468 = var467 & 7;
                                                            if (var468 != 0) {
                                                                break label483;
                                                            }

                                                            Matrix4f var469 = this.q;
                                                            Integer var495 = var4;
                                                            if (var495 == null) {
                                                                switch (var3) {
                                                                    case 246309007:
                                                                        var3 *= 1083940961;
                                                                        var3 ^= -1402132790;
                                                                        break label396;
                                                                    case 1066553759:
                                                                        var3 ^= -1146088502;
                                                                        break label396;
                                                                    case 1723978669:
                                                                    default:
                                                                        var3 ^= 1720888307;
                                                                        break label396;
                                                                }
                                                            }

                                                            var3 += -2109564729;
                                                            var3 ^= 1843730110;
                                                            var15 = var3;
                                                            var24 = var15 + 1L;
                                                            var24 = var15 * var24;
                                                            var15 = var24 & 1L;
                                                            long var636;
                                                            int var498 = (var636 = var15 - 0L) == 0L ? 0 : (var636 < 0L ? -1 : 1);
                                                            if (var498 != 0) {
                                                                break label483;
                                                            }

                                                            Matrix4f var499 = this.M;
                                                            boolean var470 = var469.equals(var499);
                                                            if (var470) {
                                                                var3 += 299785413;
                                                                var3 |= -918580628;
                                                                var3 ^= -2109481876;
                                                                Integer var471 = var3;
                                                                if (var471 == null) {
                                                                    break label483;
                                                                }

                                                                var472 = true;
                                                                switch (var3) {
                                                                    case -1081474863:
                                                                    default:
                                                                        var3 ^= 799132102;
                                                                        break label504;
                                                                    case 1304167041:
                                                                        var3 -= 1846891478;
                                                                        var3 += -1776438554;
                                                                        var3 <<= 30;
                                                                        var3 >>>= 8;
                                                                        var3 ^= -671392059;
                                                                        break label504;
                                                                    case 1697041274:
                                                                        var3 ^= -1021350165;
                                                                        break label504;
                                                                }
                                                            }

                                                            switch (var3) {
                                                                case -628197485:
                                                                    var3 ^= -1021506634;
                                                                    break;
                                                                case -48893976:
                                                                    var3 &= -662179113;
                                                                    var3 >>= 6;
                                                                    var3 ^= 1801690161;
                                                                    var3 ^= -510056340;
                                                                    break;
                                                                case -20004229:
                                                                default:
                                                                    var3 ^= -985430259;
                                                            }
                                                        } else {
                                                            var3 &= -104460113;
                                                            var3 ^= -598039565;
                                                        }
                                                    } else {
                                                        var3 += 2117361067;
                                                        var3 += 228292662;
                                                        var3 += 796669162;
                                                        var3 += 421057260;
                                                        var3 ^= 526915405;
                                                    }

                                                    int var500 = var3 + 1;
                                                    int var501 = var3 * var500;
                                                    int var516 = var3 + 2;
                                                    int var502 = var501 * var516;
                                                    int var517 = var3 + 3;
                                                    int var503 = var502 * var517;
                                                    int var504 = var503 & 7;
                                                    if (var504 != 0) {
                                                        break label483;
                                                    }

                                                    var472 = false;
                                                    var3 += -1251498700;
                                                    var3 ^= -54978609;
                                                }

                                                int var505 = var3 + 1;
                                                int var506 = var3 * var505;
                                                int var507 = var506 & 1;
                                                if (var507 != 0) {
                                                    break label483;
                                                }

                                                this.JQ = var472;
                                                Integer var473 = var4;
                                                if (var473 == null) {
                                                    var3 ^= -435323835;
                                                    var3 &= 1030608649;
                                                    var3 += -134720790;
                                                    var3 ^= 1181844495;
                                                } else {
                                                    var3 -= -849735714;
                                                    var3 ^= 661027375;
                                                    int var474 = var3 + 1;
                                                    int var475 = var3 * var474;
                                                    int var476 = var475 & 1;
                                                    if (var476 != 0) {
                                                        break label483;
                                                    }

                                                    label507: {
                                                        if (!var397) {
                                                            var3 -= 977777575;
                                                            var3 *= -455336825;
                                                            var3 ^= 1852619704;
                                                            long var477 = var3;
                                                            long var518 = var477 + 1L;
                                                            long var519 = var477 * var518;
                                                            long var478 = var519 & 1L;
                                                            long var637;
                                                            int var398 = (var637 = var478 - 0L) == 0L ? 0 : (var637 < 0L ? -1 : 1);
                                                            if (var398 != 0) {
                                                                break label483;
                                                            }

                                                            if (var439) {
                                                                var3 = switch (var3) {
                                                                    default -> var3 ^ -797309118;
                                                                    case 1031018225 -> var3 ^ 199816315;
                                                                    case 1058279391 -> {
                                                                        var3 -= 1126147799;
                                                                        var3 ^= 611380556;
                                                                        var3 |= 101941684;
                                                                        yield var3 ^ 1906154460;
                                                                    }
                                                                };
                                                                var12 = var3;
                                                                long var479 = var12 + 1L;
                                                                long var480 = var12 * var479;
                                                                long var520 = var12 + 2L;
                                                                long var481 = var480 * var520;
                                                                var12 += 3L;
                                                                long var482 = var481 * var12;
                                                                var12 = var482 & 7L;
                                                                long var638;
                                                                int var402 = (var638 = var12 - 0L) == 0L ? 0 : (var638 < 0L ? -1 : 1);
                                                                if (var402 != 0) {
                                                                    break label483;
                                                                }

                                                                var403 = true;
                                                                var3 >>= 18;
                                                                var3 &= 354228285;
                                                                var3 ^= -448886970;
                                                                break label507;
                                                            }

                                                            switch (var3) {
                                                                case -1369755067:
                                                                    var3 ^= 1242217512;
                                                                    break;
                                                                case 41103603:
                                                                default:
                                                                    var3 ^= 646634161;
                                                                    break;
                                                                case 1058279391:
                                                                    var3 -= 1983241790;
                                                                    var3 ^= -1133153709;
                                                            }
                                                        } else {
                                                            var3 *= -700767731;
                                                            var3 -= 140538912;
                                                            var3 -= 684700679;
                                                            var3 *= -233446229;
                                                            var3 ^= -2071997095;
                                                        }

                                                        var437 = var3;
                                                        if (var437 == null) {
                                                            break label483;
                                                        }

                                                        var403 = false;
                                                        switch (var3) {
                                                            case 547382208:
                                                                var3 ^= -795981577;
                                                                break;
                                                            case 1572520474:
                                                            default:
                                                                var3 ^= 1878713255;
                                                                break;
                                                            case 1957381106:
                                                                var3 -= 809014090;
                                                                var3 += 1737998963;
                                                                var3 += 883753179;
                                                                var3 ^= 278199472;
                                                        }
                                                    }

                                                    long var441 = var3;
                                                    var15 = var441 + 1L;
                                                    var15 = var441 * var15;
                                                    var24 = var441 + 2L;
                                                    var15 *= var24;
                                                    long var442 = var441 + 3L;
                                                    var15 *= var442;
                                                    long var443 = var15 & 7L;
                                                    long var639;
                                                    int var444 = (var639 = var443 - 0L) == 0L ? 0 : (var639 < 0L ? -1 : 1);
                                                    if (var444 != 0) {
                                                        break label483;
                                                    }

                                                    this.oh = var403;
                                                    Matrix4f var404 = this.k;
                                                    Matrix4f var445 = this.q;
                                                    Matrix4f var483 = this.u;
                                                    Matrix4f var405 = var404.mul(var445, var483);
                                                    Matrix4f var406 = var405.invert();
                                                    Matrix4f var407 = this.px;
                                                    Matrix4f var446 = this.M;
                                                    Matrix4f var484 = this.ve;
                                                    Matrix4f var408 = var407.mul(var446, var484);
                                                    float var447 = (float)var602;
                                                    float var485 = (float)var579;
                                                    float var512 = (float)var548;
                                                    Matrix4f var409 = var408.translate(var447, var485, var512);
                                                    Matrix4f var448 = this.u;
                                                    Matrix4f var410 = var409.mul(var448);
                                                    Matrix4f var411 = this.ve;
                                                    float[] var449 = this.Y;
                                                    float[] var412 = var411.get(var449);
                                                    VelocityBlur var413 = this.t;
                                                    float[] var450 = this.Y;
                                                    VelocityBlur var414 = var413.reprojection(var450);
                                                    Matrix4f var415 = this.M;
                                                    Matrix4f var451 = this.q;
                                                    Matrix4f var416 = var415.set(var451);
                                                    Matrix4f var417 = this.px;
                                                    Matrix4f var452 = this.k;
                                                    Matrix4f var418 = var417.set(var452);
                                                    this.XL = var314;
                                                    this.zR = var354;
                                                    this.tA = var379;
                                                    this.K = true;
                                                    Integer var293 = var4;
                                                    if (var293 != null) {
                                                        var3 -= 97336911;
                                                        var3 ^= 1175520244;
                                                        long var315 = var1.frame();
                                                        this.Di = var315;
                                                        this.Z = var306;
                                                        return;
                                                    }

                                                    var3 *= -796551503;
                                                    var3 -= 537277490;
                                                    var3 <<= 3;
                                                    var3 ^= 7022917;
                                                }
                                            } else {
                                                var3 ^= 2077895564;
                                                var3 &= -933359070;
                                                var3 ^= -282079001;
                                            }
                                        } else {
                                            var3 &= -736784441;
                                            var3 ^= 1642826421;
                                            var3 >>= 27;
                                            var3 ^= -1869467877;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var3 -= -1548568412;
                        var3 *= -972568613;
                        var3 ^= 1261587274;
                    }
                }
            }

            long var288 = var3;
            var5 = var288 + 1L;
            var5 = var288 * var5;
            long var289 = var5 & 1L;
            long var640;
            var3 = (var640 = var289 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var291 = new RuntimeException();
                throw var291;
            }
        }

        IllegalArgumentException var292 = new IllegalArgumentException();
        throw var292;
    }

    private void XN(RenderTarget var1, VelocityBlur$Mode var2, int var3) {
        label79: {
            int var5 = System.identityHashCode(this);
            Integer var6 = var5;
            if (var6 == null) {
                int var4 = var3 | -1403859015;
                var4 += 359708212;
                var4 |= -405084762;
                var4 ^= 1149646354;
            } else {
                int var20 = var3 | -923309362;
                var20 ^= 858419047;
                if (var1 == null) {
                    var20 += 310460400;
                    var20 -= 1210166247;
                    var20 -= -760030784;
                    var20 -= 1467442849;
                    var20 ^= -1925395344;
                    long var96 = var20;
                    long var119 = var96 + 1L;
                    var119 = var96 * var119;
                    long var135 = var96 + 2L;
                    var119 *= var135;
                    long var97 = var96 + 3L;
                    var119 *= var97;
                    long var98 = var119 & 7L;
                    long var160;
                    int var99 = (var160 = var98 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
                    if (var99 == 0) {
                        return;
                    }
                    break label79;
                }

                var20 &= -2035130139;
                var20 *= -1600444275;
                var20 ^= 1639457462;
                long var85 = var20;
                long var8 = var85 + 1L;
                var8 = var85 * var8;
                long var86 = var8 & 1L;
                long var161;
                int var87 = (var161 = var86 - 0L) == 0L ? 0 : (var161 < 0L ? -1 : 1);
                if (var87 != 0) {
                    break label79;
                }

                Uq var88 = this.lU;
                float var89 = var88.WM();
                r_2 var7 = this.r;
                qS var112 = qS.HYBRID;
                long var9 = var5;
                long var11 = var9 + 1L;
                var11 = var9 * var11;
                var9 = var11 & 1L;
                long var162;
                int var124 = (var162 = var9 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                if (var124 != 0) {
                    var20 += 1921906243;
                    var20 &= -690342755;
                    var20 |= -1458399250;
                    var20 -= 1670245098;
                    var20 ^= -424117079;
                } else {
                    label84: {
                        var20 -= -14220334;
                        var20 *= -1112721379;
                        var20 &= -1884827645;
                        var20 |= 1062744348;
                        var20 ^= -738227180;
                        boolean var100 = var7.TJ(var112);
                        if (var100) {
                            var20 += 1768399163;
                            var20 ^= 549199495;
                            float var101 = this.Qr;
                            int var113 = this.Mx;
                            float var125 = this.d;
                            yF var10 = this.j;
                            int var132 = var10.aZ();
                            var11 = var5;
                            long var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var163;
                            int var140 = (var163 = var11 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                            if (var140 != 0) {
                                var20 += -84266833;
                                var20 *= 1200841165;
                                var20 += 1187253630;
                                var20 >>= 10;
                                var20 ^= 1552372456;
                                break label84;
                            }

                            var20 -= 2015714178;
                            var20 ^= 1729641597;
                            Integer var141 = var20;
                            if (var141 == null) {
                                break label79;
                            }

                            float var102 = cr.c(var89, var101, var113, var125, var132, 12);
                            Dx var114 = this.kl;
                            int var126 = cr.gM(var102);
                            var114.xJ(var102, var126);
                            var20 >>>= 22;
                            var20 ^= 630196140;
                            var20 += -535037365;
                            var20 *= -953188811;
                            var20 ^= -210972227;
                        } else {
                            var20 &= -952986435;
                            var20 -= 1351282701;
                            var20 |= 1235739257;
                            var20 -= -1656728564;
                            var20 ^= 1993298937;
                            Dx var103 = this.kl;
                            float var115 = this.Qr;
                            int var127 = this.Mx;
                            JL var133 = this.L;
                            var11 = var5;
                            long var153 = var11 + 1L;
                            var153 = var11 * var153;
                            var11 = var153 & 1L;
                            long var164;
                            int var144 = (var164 = var11 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                            if (var144 != 0) {
                                switch (var20) {
                                    case -1464280056:
                                        var20 += 1149181451;
                                        var20 |= -1660764755;
                                        var20 ^= 1581985282;
                                        break label84;
                                    case 141982827:
                                    default:
                                        var20 ^= 473153800;
                                        break label84;
                                    case 2018081046:
                                        var20 ^= 1171717365;
                                        break label84;
                                }
                            }

                            var20 >>= 13;
                            var20 <<= 6;
                            var20 *= 413434271;
                            var20 ^= 1500865905;
                            var11 = var20;
                            var153 = var11 + 1L;
                            var153 = var11 * var153;
                            long var159 = var11 + 2L;
                            var153 *= var159;
                            var11 += 3L;
                            var153 *= var11;
                            var11 = var153 & 7L;
                            long var165;
                            int var148 = (var165 = var11 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
                            if (var148 != 0) {
                                break label79;
                            }

                            boolean var134 = var133.vb();
                            cr.gI(var103, var89, var115, var127, var134);
                            var20 *= 224760445;
                            var20 += 331986902;
                            var20 |= 1907975822;
                            var20 >>>= 2;
                            var20 ^= 1827073797;
                        }

                        VelocityBlur var90 = this.t;
                        VelocityBlur var91 = var90.mode(var2);
                        Dx var104 = this.kl;
                        float var105 = var104.Zc();
                        Dx var116 = this.kl;
                        int var117 = var116.rX();
                        VelocityBlur var92 = var91.budget(var105, var117);
                        var7 = this.wP;
                        CX var118 = CX.WEIGHTED;
                        boolean var107 = var7.TJ(var118);
                        VelocityBlur var93 = var92.weighted(var107);
                        Ud var94 = Ud.Z();
                        long var108 = var5;
                        var9 = var108 + 1L;
                        var9 = var108 * var9;
                        var11 = var108 + 2L;
                        var9 *= var11;
                        long var109 = var108 + 3L;
                        var9 *= var109;
                        long var110 = var9 & 7L;
                        long var166;
                        var5 = (var166 = var110 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var20 += -1295576899;
                            var20 |= 2101495892;
                            var20 ^= -284927297;
                            Integer var83 = var20;
                            if (var83 != null) {
                                AuraRenderer var84 = var94.ZP();
                                VelocityBlur var95 = this.t;
                                var84.velocityBlur(var1, var95);
                                return;
                            }
                            break label79;
                        }

                        switch (var20) {
                            case -1047130045:
                            default:
                                var20 ^= -878041281;
                                break;
                            case 1929950374:
                                var20 += 1535749521;
                                var20 <<= 7;
                                var20 ^= -364000707;
                                break;
                            case 2031346671:
                                var20 ^= 1389045526;
                        }
                    }
                }
            }

            UnsupportedOperationException var75 = new UnsupportedOperationException();
            throw var75;
        }

        AssertionError var81 = new AssertionError();
        throw var81;
    }

    private void kH(RenderTarget var1, FrameContext var2, int var3) {
        boolean var268 = false;
        boolean var311 = false;
        int var5 = System.identityHashCode(this);
        r_2 var6 = this.r;
        Enum var249 = var6.A();
        qS var250 = (qS)var249;
        Ud var7 = Ud.Z();
        AuraRenderer var255 = var7.ZP();
        Integer var8 = var5;
        if (var8 == null) {
            switch (var3) {
                case -1416231807:
                default:
                    int var243 = var3 ^ 1757659332;
                    break;
                case -1068393001:
                    int var242 = var3 ^ -1789488987;
                    break;
                case 434421975:
                    int var238 = var3 | 406195381;
                    var238 ^= 730023858;
                    var238 <<= 21;
                    var238 ^= 1691822643;
            }
        } else {
            label432: {
                int var4 = var3 & 1514499791;
                var4 *= -798579633;
                var4 ^= 1188156175;
                var4 ^= -1293285283;
                int var256 = var4 + 1;
                var256 = var4 * var256;
                var256 &= 1;
                label363:
                if (var256 == 0) {
                    label410: {
                        int var259 = (var250.blendsFrames()) ? 1 : 0;
                        if (var259 != 0) {
                            var4 &= 1404940110;
                            var4 ^= 232343080;
                            Integer var260 = var4;
                            if (var260 == null) {
                                break label363;
                            }

                            var259 = var4 >>> 22;
                            int var262 = var259 ^ -1440075594;
                            var262 ^= -394617329;
                            int var264 = (this.hH(var262)) ? 1 : 0;
                            Integer var9 = var5;
                            if (var9 == null) {
                                var4 *= 1702465883;
                                var4 -= -659947370;
                                var4 <<= 20;
                                var4 >>>= 3;
                                var4 ^= 527903283;
                                break label432;
                            }

                            var4 ^= -745281791;
                            var4 ^= 1178583539;
                            if (var264 != 0) {
                                var4 -= -720471670;
                                var4 |= 107182730;
                                var4 ^= -1257126630;
                                if (var1 != null) {
                                    var4 = switch (var4) {
                                        case -1275674924 -> {
                                            var4 -= -762947742;
                                            var4 |= 399477909;
                                            var4 ^= -1100337215;
                                            yield var4 ^ 1415973560;
                                        }
                                        case -218151530 -> var4 ^ 1982053101;
                                        default -> var4 ^ 585884999;
                                    };
                                    long var265 = var4;
                                    long var10 = var265 + 1L;
                                    var10 = var265 * var10;
                                    long var266 = var10 & 1L;
                                    long var455;
                                    var264 = (var455 = var266 - 0L) == 0L ? 0 : (var455 < 0L ? -1 : 1);
                                    if (var264 != 0) {
                                        break label363;
                                    }

                                    var268 = true;
                                    var4 >>= 14;
                                    var4 ^= 369723803;
                                    break label410;
                                }

                                switch (var4) {
                                    case -1275674924:
                                        var4 -= 875359409;
                                        var4 *= 1527582657;
                                        var4 += 1483507185;
                                        var4 &= 1676125246;
                                        var4 ^= -217111101;
                                        break;
                                    case -461111165:
                                        var4 ^= 1304611539;
                                        break;
                                    case -65014534:
                                    default:
                                        var4 ^= 1933165091;
                                }
                            } else {
                                var4 -= -105585791;
                                var4 -= 274712914;
                                var4 ^= 1064080426;
                            }
                        } else {
                            var4 += 2145252547;
                            var4 &= -1818746679;
                            var4 *= 261361845;
                            var4 ^= 1266715839;
                        }

                        int var274 = var4 + 1;
                        var274 = var4 * var274;
                        var274 &= 1;
                        if (var274 != 0) {
                            break label363;
                        }

                        var268 = false;
                        var4 ^= 2040238246;
                        var4 ^= -1623199963;
                    }

                    int var277 = var4 + 1;
                    var277 = var4 * var277;
                    int var313 = var4 + 2;
                    var277 *= var313;
                    var313 = var4 + 3;
                    var277 *= var313;
                    var277 &= 7;
                    label355:
                    if (var277 == 0) {
                        int var282 = (var250.accumulates()) ? 1 : 0;
                        long var315 = var5;
                        long var12 = var315 + 1L;
                        var12 = var315 * var12;
                        long var14 = var315 + 2L;
                        var12 *= var14;
                        long var316 = var315 + 3L;
                        var12 *= var316;
                        long var317 = var12 & 7L;
                        long var456;
                        var313 = (var456 = var317 - 0L) == 0L ? 0 : (var456 < 0L ? -1 : 1);
                        if (var313 == 0) {
                            label414: {
                                var4 = switch (var4) {
                                    case -1649020325 -> var4 ^ -1267232000;
                                    case 369753684 -> {
                                        var4 += 1532652461;
                                        yield var4 ^ -199531574;
                                    }
                                    default -> var4 ^ 752465892;
                                };
                                if (var282 != 0) {
                                    var4 -= 1848441647;
                                    var4 -= -1209978805;
                                    var4 <<= 29;
                                    var4 ^= 890331134;
                                    long var283 = var4;
                                    long var11 = var283 + 1L;
                                    var11 = var283 * var11;
                                    long var284 = var11 & 1L;
                                    long var457;
                                    var282 = (var457 = var284 - 0L) == 0L ? 0 : (var457 < 0L ? -1 : 1);
                                    if (var282 != 0) {
                                        break label355;
                                    }

                                    var282 = var4 | 568150501;
                                    var282 ^= 1689994410;
                                    var282 *= 1011684401;
                                    var282 ^= -244420403;
                                    int var290 = (this.hH(var282)) ? 1 : 0;
                                    var313 = var5 + 1;
                                    var313 = var5 * var313;
                                    int var373 = var5 + 2;
                                    var313 *= var373;
                                    int var374 = var5 + 3;
                                    var313 *= var374;
                                    var313 &= 7;
                                    if (var313 != 0) {
                                        var4 >>= 16;
                                        var4 ^= 209141538;
                                        break label432;
                                    }

                                    var4 += 1644541211;
                                    var4 &= 769715153;
                                    var4 -= 957345239;
                                    var4 *= -815492873;
                                    var4 ^= 953387243;
                                    Integer var324 = var4;
                                    if (var324 == null) {
                                        break label355;
                                    }

                                    if (var290 != 0) {
                                        var4 += 376578353;
                                        var4 <<= 16;
                                        var4 ^= 1756764125;
                                        var290 = var4 + 1;
                                        var290 = var4 * var290;
                                        var290 &= 1;
                                        if (var290 != 0) {
                                            break label355;
                                        }

                                        if (var1 != null) {
                                            var4 <<= 21;
                                            var4 &= 1590203673;
                                            var4 *= 2042689169;
                                            var4 ^= 417286372;
                                            var282 = 1;
                                            var4 *= -1415606573;
                                            var4 &= -1514396916;
                                            var4 >>= 8;
                                            var4 ^= -1700751641;
                                            break label414;
                                        }

                                        var4 -= -927084010;
                                        var4 ^= -1855262714;
                                    } else {
                                        var4 >>>= 10;
                                        var4 ^= 1951959016;
                                    }
                                } else {
                                    switch (var4) {
                                        case -2055271989:
                                            var4 ^= -305019227;
                                            var4 += 1739589305;
                                            var4 ^= -1542560794;
                                            break;
                                        case -514691480:
                                            var4 ^= -950281148;
                                            break;
                                        case 35850576:
                                        default:
                                            var4 ^= 774820039;
                                    }
                                }

                                var313 = var4 + 1;
                                var313 = var4 * var313;
                                int var375 = var4 + 2;
                                var313 *= var375;
                                var375 = var4 + 3;
                                var313 *= var375;
                                var313 &= 7;
                                if (var313 != 0) {
                                    break label355;
                                }

                                var282 = 0;
                                switch (var4) {
                                    case -269831079:
                                        var4 ^= -557495904;
                                        break;
                                    case 1541453229:
                                    default:
                                        var4 ^= -482069632;
                                        break;
                                    case 1951446465:
                                        var4 |= 1625615838;
                                        var4 *= -1043455585;
                                        var4 >>= 11;
                                        var4 *= 556437267;
                                        var4 ^= -715666637;
                                }
                            }

                            Integer var330 = var5;
                            if (var330 != null) {
                                var4 = switch (var4) {
                                    default -> var4 ^ -1187245411;
                                    case -578480404 -> var4 ^ 290988766;
                                    case 1694500580 -> {
                                        var4 += -942896641;
                                        var4 *= -85510591;
                                        yield var4 ^ 551218040;
                                    }
                                };
                                if (!var268) {
                                    var4 *= 263997979;
                                    var4 *= 1008162747;
                                    var4 *= 1599116797;
                                    var4 ^= -761684188;
                                    boolean var331 = this.H;
                                    int var377 = var5 + 1;
                                    var377 = var5 * var377;
                                    var377 &= 1;
                                    if (var377 != 0) {
                                        var4 <<= 12;
                                        var4 >>>= 4;
                                        var4 ^= 43071795;
                                        break label432;
                                    }
                                    var4 = switch (var4) {
                                        case -664869357 -> {
                                            var4 *= -271788213;
                                            yield var4 ^ -1853200638;
                                        }
                                        case 746815633 -> var4 ^ 1433731961;
                                        default -> var4 ^ 1070785209;
                                    };
                                    var377 = var4 + 1;
                                    var377 = var4 * var377;
                                    int var410 = var4 + 2;
                                    var377 *= var410;
                                    int var411 = var4 + 3;
                                    var377 *= var411;
                                    var377 &= 7;
                                    if (var377 != 0) {
                                        break label355;
                                    }

                                    if (var331) {
                                        var4 |= 1669034950;
                                        var4 >>>= 20;
                                        var4 ^= 1272044407;
                                        long var332 = var4;
                                        var12 = var332 + 1L;
                                        var12 = var332 * var12;
                                        var14 = var332 + 2L;
                                        var12 *= var14;
                                        long var333 = var332 + 3L;
                                        var12 *= var333;
                                        long var334 = var12 & 7L;
                                        long var458;
                                        int var335 = (var458 = var334 - 0L) == 0L ? 0 : (var458 < 0L ? -1 : 1);
                                        if (var335 != 0) {
                                            break label355;
                                        }

                                        var255.releaseMotionBuffers(true, false);
                                        this.H = false;
                                        yF var336 = this.j;
                                        Integer var385 = var5;
                                        if (var385 == null) {
                                            var4 &= 1571434480;
                                            var4 *= 911640237;
                                            var4 ^= -905404429;
                                            break label432;
                                        }

                                        var4 ^= 1534519954;
                                        var4 |= -1360396347;
                                        var4 ^= 236801111;
                                        var336.S();
                                        var4 |= -114936799;
                                        var4 |= -2110245750;
                                        var4 ^= 1711987677;
                                    } else {
                                        switch (var4) {
                                            case -1880567956:
                                                var4 ^= -878896399;
                                                break;
                                            case -1556122176:
                                            default:
                                                var4 ^= -1809352731;
                                                break;
                                            case -1163838573:
                                                var4 *= -773321567;
                                                var4 -= -578304768;
                                                var4 &= 961633798;
                                                var4 &= -1504620097;
                                                var4 ^= -1649050508;
                                        }
                                    }
                                } else {
                                    var4 >>>= 27;
                                    var4 &= 1704765010;
                                    var4 >>= 4;
                                    var4 ^= -1644925833;
                                }

                                long var337 = var4;
                                var12 = var337 + 1L;
                                var12 = var337 * var12;
                                var14 = var337 + 2L;
                                var12 *= var14;
                                long var338 = var337 + 3L;
                                var12 *= var338;
                                long var339 = var12 & 7L;
                                long var459;
                                int var340 = (var459 = var339 - 0L) == 0L ? 0 : (var459 < 0L ? -1 : 1);
                                if (var340 != 0) {
                                    break label355;
                                }

                                if (var282 == 0) {
                                    var4 &= -837870361;
                                    var4 *= 156823091;
                                    var4 ^= 1553432484;
                                    var340 = var4 + 1;
                                    var340 = var4 * var340;
                                    int var386 = var4 + 2;
                                    var340 *= var386;
                                    var386 = var4 + 3;
                                    var340 *= var386;
                                    var340 &= 7;
                                    if (var340 != 0) {
                                        break label355;
                                    }

                                    int var346 = (this.Sp ? 1 : 0);
                                    var386 = var5 + 1;
                                    var386 = var5 * var386;
                                    int var420 = var5 + 2;
                                    var386 *= var420;
                                    int var421 = var5 + 3;
                                    var386 *= var421;
                                    var386 &= 7;
                                    if (var386 != 0) {
                                        switch (var4) {
                                            case -1254560283:
                                                var4 ^= 499107999;
                                                break label432;
                                            case -571329546:
                                                var4 += -1827559877;
                                                var4 -= 914660728;
                                                var4 |= 749220354;
                                                var4 ^= 847778952;
                                                break label432;
                                            case 443943977:
                                            default:
                                                var4 ^= 1066408421;
                                                break label432;
                                        }
                                    }

                                    var4 >>>= 15;
                                    var4 >>>= 20;
                                    var4 *= 571356225;
                                    var4 ^= -2028969812;
                                    long var393 = var4;
                                    long var13 = var393 + 1L;
                                    var13 = var393 * var13;
                                    long var15 = var393 + 2L;
                                    var13 *= var15;
                                    long var394 = var393 + 3L;
                                    var13 *= var394;
                                    long var395 = var13 & 7L;
                                    long var460;
                                    var386 = (var460 = var395 - 0L) == 0L ? 0 : (var460 < 0L ? -1 : 1);
                                    if (var386 != 0) {
                                        break label355;
                                    }

                                    if (var346 != 0) {
                                        var4 = switch (var4) {
                                            case -2028969812 -> {
                                                var4 -= 1543777882;
                                                var4 |= -56822662;
                                                yield var4 ^ -1873008801;
                                            }
                                            default -> var4 ^ -1078484735;
                                            case 1953898055 -> var4 ^ 2320660;
                                        };
                                        Integer var347 = var4;
                                        if (var347 == null) {
                                            break label355;
                                        }

                                        var255.releaseMotionBuffers(false, true);
                                        var347 = var5;
                                        if (var347 == null) {
                                            var4 ^= -282879251;
                                            var4 <<= 30;
                                            var4 ^= 209136179;
                                            break label432;
                                        }
                                        var4 = switch (var4) {
                                            default -> var4 ^ -1389540951;
                                            case 1874907429 -> {
                                                var4 ^= 1827907166;
                                                var4 += 2019910733;
                                                var4 += -1388327474;
                                                var4 >>= 18;
                                                yield var4 ^ -1471631987;
                                            }
                                            case 1912207835 -> var4 ^ 847978922;
                                        };
                                        long var349 = var4;
                                        var12 = var349 + 1L;
                                        var12 = var349 * var12;
                                        var14 = var349 + 2L;
                                        var12 *= var14;
                                        long var350 = var349 + 3L;
                                        var12 *= var350;
                                        long var351 = var12 & 7L;
                                        long var461;
                                        var346 = (var461 = var351 - 0L) == 0L ? 0 : (var461 < 0L ? -1 : 1);
                                        if (var346 != 0) {
                                            break label355;
                                        }

                                        this.Sp = false;
                                        var4 |= 743872063;
                                        var4 ^= -1352849934;
                                    } else {
                                        var4 -= -1649464037;
                                        var4 += 452716470;
                                        var4 &= 1304978893;
                                        var4 |= -618032857;
                                        var4 ^= -597032150;
                                    }
                                } else {
                                    var4 *= -1411311257;
                                    var4 *= -1734290503;
                                    var4 ^= -1094118041;
                                }

                                if (!var268) {
                                    var4 = switch (var4) {
                                        case 50565709 -> {
                                            var4 -= 1716284373;
                                            var4 -= 1292972253;
                                            yield var4 ^ -201923127;
                                        }
                                        case 91429523 -> var4 ^ 1266799109;
                                        default -> var4 ^ 183666055;
                                    };
                                    if (var282 == 0) {
                                        var4 >>= 24;
                                        var4 ^= -1867967168;
                                        long var295 = var4;
                                        long var397 = var295 + 1L;
                                        var397 = var295 * var397;
                                        long var435 = var295 + 2L;
                                        var397 *= var435;
                                        long var296 = var295 + 3L;
                                        var397 *= var296;
                                        long var297 = var397 & 7L;
                                        long var462;
                                        var282 = (var462 = var297 - 0L) == 0L ? 0 : (var462 < 0L ? -1 : 1);
                                        if (var282 == 0) {
                                            this.B = Long.MIN_VALUE;
                                            return;
                                        }
                                        break label355;
                                    }

                                    switch (var4) {
                                        case -1135407022:
                                            var4 |= 1032934986;
                                            var4 >>= 4;
                                            var4 -= 565418284;
                                            var4 ^= 1366988058;
                                            break;
                                        case -880958766:
                                        default:
                                            var4 ^= 1618860023;
                                            break;
                                        case -587645257:
                                            var4 ^= 927676236;
                                    }
                                } else {
                                    var4 += 1757636816;
                                    var4 &= -120724427;
                                    var4 -= -40456630;
                                    var4 <<= 23;
                                    var4 ^= 1859324195;
                                }

                                long var299 = var4;
                                long var401 = var299 + 1L;
                                var401 = var299 * var401;
                                long var300 = var401 & 1L;
                                long var463;
                                var282 = (var463 = var300 - 0L) == 0L ? 0 : (var463 < 0L ? -1 : 1);
                                if (var282 != 0) {
                                    break label355;
                                }

                                long var302 = this.B;
                                var401 = var2.frame();
                                var401--;
                                long var436 = var5;
                                long var451 = var436 + 1L;
                                var451 = var436 * var451;
                                long var17 = var436 + 2L;
                                var451 *= var17;
                                var436 += 3L;
                                var451 *= var436;
                                var436 = var451 & 7L;
                                long var464;
                                int var439 = (var464 = var436 - 0L) == 0L ? 0 : (var464 < 0L ? -1 : 1);
                                if (var439 != 0) {
                                    var4 += 4654565;
                                    var4 -= 340574868;
                                    var4 >>= 10;
                                    var4 &= 2084464351;
                                    var4 ^= 208365664;
                                    break label432;
                                }
                                var4 = switch (var4) {
                                    case -1957492445 -> {
                                        var4 |= 1968359287;
                                        var4 -= -1888114938;
                                        yield var4 ^ -1878714696;
                                    }
                                    case -762351427 -> var4 ^ -2070792165;
                                    default -> var4 ^ -956541186;
                                };
                                int var440 = var4 + 1;
                                int var441 = var4 * var440;
                                int var448 = var4 + 2;
                                int var442 = var441 * var448;
                                int var449 = var4 + 3;
                                int var443 = var442 * var449;
                                int var444 = var443 & 7;
                                if (var444 != 0) {
                                    break label355;
                                }

                                label423: {
                                    long var465;
                                    var282 = (var465 = var302 - var401) == 0L ? 0 : (var465 < 0L ? -1 : 1);
                                    if (var282 == 0) {
                                        var4 *= 1303949233;
                                        var4 |= 174570781;
                                        var4 ^= -1104856906;
                                        Integer var304 = var4;
                                        if (var304 == null) {
                                            break label355;
                                        }

                                        qS var305 = this.n;
                                        Integer var353 = var5;
                                        if (var353 == null) {
                                            var4 += 961454101;
                                            var4 += -62197862;
                                            var4 *= 647126995;
                                            var4 ^= -1882629059;
                                            break label432;
                                        }
                                        var4 = switch (var4) {
                                            case -898398581 -> var4 ^ -780807769;
                                            default -> var4 ^ -1615744243;
                                            case -438646965 -> {
                                                var4 &= 1831937536;
                                                var4 *= -1063019773;
                                                var4 ^= 1674792511;
                                                var4 |= -820625805;
                                                yield var4 ^ -1156490200;
                                            }
                                        };
                                        long var354 = var4;
                                        var12 = var354 + 1L;
                                        var12 = var354 * var12;
                                        var14 = var354 + 2L;
                                        var12 *= var14;
                                        long var355 = var354 + 3L;
                                        var12 *= var355;
                                        long var356 = var12 & 7L;
                                        long var466;
                                        int var357 = (var466 = var356 - 0L) == 0L ? 0 : (var466 < 0L ? -1 : 1);
                                        if (var357 != 0) {
                                            break label355;
                                        }

                                        if (var305 == var250) {
                                            var4 = switch (var4) {
                                                default -> var4 ^ -1880891019;
                                                case 676246758 -> var4 ^ -2061762439;
                                                case 1678123607 -> {
                                                    var4 &= -1584576068;
                                                    yield var4 ^ -1647713977;
                                                }
                                            };
                                            int var306 = var4 + 1;
                                            var306 = var4 * var306;
                                            var357 = var4 + 2;
                                            var306 *= var357;
                                            var357 = var4 + 3;
                                            var306 *= var357;
                                            var306 &= 7;
                                            if (var306 != 0) {
                                                break label355;
                                            }

                                            var311 = true;
                                            var4 >>>= 14;
                                            var4 <<= 7;
                                            var4 ^= 2088559579;
                                            break label423;
                                        }

                                        var4 *= 863870355;
                                        var4 ^= 1726259804;
                                    } else {
                                        var4 -= -1348229158;
                                        var4 ^= -1901028551;
                                        var4 ^= -193741441;
                                    }

                                    Integer var360 = var4;
                                    if (var360 == null) {
                                        break label355;
                                    }

                                    var311 = false;
                                    switch (var4) {
                                        case 720679081:
                                            var4 &= 821673554;
                                            var4 += -2120914205;
                                            var4 &= -2038417047;
                                            var4 ^= -7905222;
                                            break;
                                        case 1629312846:
                                        default:
                                            var4 ^= -140400911;
                                            break;
                                        case 1865444637:
                                            var4 ^= -1368451718;
                                    }
                                }

                                var340 = var4 + 1;
                                var340 = var4 * var340;
                                int var405 = var4 + 2;
                                var340 *= var405;
                                int var406 = var4 + 3;
                                var340 *= var406;
                                var340 &= 7;
                                if (var340 == 0) {
                                    long var366 = var2.frame();
                                    this.B = var366;
                                    Integer var367 = var5;
                                    if (var367 == null) {
                                        var4 += 1696264021;
                                        var4 -= 1859679263;
                                        var4 ^= 2134825378;
                                        break label432;
                                    }

                                    var4 -= 961480602;
                                    var4 -= 239725705;
                                    var4 ^= -1123934152;
                                    this.n = var250;
                                    if (var268) {
                                        var4 <<= 26;
                                        var4 ^= -381018931;
                                        Integer var269 = var4;
                                        if (var269 == null) {
                                            break label355;
                                        }

                                        int var270 = var4 - 800935808;
                                        var270 += -37838214;
                                        var270 ^= 182893126;
                                        this.S(var255, var1, var311, var270);
                                        var4 &= -1899419524;
                                        var4 <<= 7;
                                        var4 &= -1375872247;
                                        var4 ^= 717301897;
                                        var4 ^= -1170205441;
                                    } else {
                                        var4 ^= -1187433754;
                                        var4 += 1881012509;
                                        var4 ^= -171950341;
                                        qS var273 = qS.ACCUMULATION_MAX;
                                        int var368 = var5 + 1;
                                        var368 = var5 * var368;
                                        var5 = var368 & 1;
                                        if (var5 != 0) {
                                            switch (var4) {
                                                case -1782598978:
                                                default:
                                                    var4 ^= -660303476;
                                                    break label432;
                                                case -164331893:
                                                    var4 ^= -1854048730;
                                                    break label432;
                                                case 1421061880:
                                                    var4 &= 1509550222;
                                                    var4 |= 1262037821;
                                                    var4 ^= 1473151374;
                                                    break label432;
                                            }
                                        }

                                        var4 += -1206024719;
                                        var4 ^= -1526074225;
                                        boolean var246;
                                        if (var250 == var273) {
                                            var4 = switch (var4) {
                                                case -1445412762 -> {
                                                    var4 -= -810344492;
                                                    var4 ^= 937937944;
                                                    yield var4 ^ -562626348;
                                                }
                                                case -1379916697 -> var4 ^ -986789437;
                                                default -> var4 ^ -126893025;
                                            };
                                            var246 = true;
                                            switch (var4) {
                                                case -1145664147:
                                                default:
                                                    var4 ^= 1283077266;
                                                    break;
                                                case -232841180:
                                                    var4 ^= 1667763374;
                                                    break;
                                                case 867527774:
                                                    var4 *= 1723145219;
                                                    var4 &= -749295071;
                                                    var4 ^= 1761527605;
                                                    var4 ^= 250090691;
                                            }
                                        } else {
                                            var4 >>= 17;
                                            var4 &= -1671878016;
                                            var4 <<= 24;
                                            var4 >>= 30;
                                            var4 ^= -1306662082;
                                            long var370 = var4;
                                            var12 = var370 + 1L;
                                            var12 = var370 * var12;
                                            long var371 = var12 & 1L;
                                            long var467;
                                            int var251 = (var467 = var371 - 0L) == 0L ? 0 : (var467 < 0L ? -1 : 1);
                                            if (var251 != 0) {
                                                break label355;
                                            }

                                            var246 = false;
                                            var4 -= 1303423598;
                                            var4 ^= -411618908;
                                        }

                                        int var252 = var4 + 81843575;
                                        int var253 = var252 - -1184176222;
                                        int var254 = var253 ^ -238025039;
                                        this.r(var255, var1, var311, var246, var254);
                                        var4 += -256683714;
                                        var4 -= 1080959612;
                                        var4 ^= 588166350;
                                    }

                                    Integer var247 = var4;
                                    if (var247 != null) {
                                        return;
                                    }
                                }
                                break label355;
                            }

                            var4 ^= 1668430872;
                            var4 &= -208603122;
                            var4 ^= 241635903;
                            break label432;
                        }

                        var4 *= 1073019209;
                        var4 <<= 2;
                        var4 *= 220739477;
                        var4 ^= -2015582861;
                        var4 ^= -815590576;
                        break label432;
                    }
                }

                IllegalArgumentException var248 = new IllegalArgumentException();
                throw var248;
            }
        }

        AssertionError var244 = new AssertionError();
        throw var244;
    }

    private void S(AuraRenderer var1, RenderTarget var2, boolean var3, int var4) {
        label357: {
            int var6 = System.identityHashCode(this);
            float var7 = this.d;
            float var8 = this.Qr;
            var7 = cr.sS(var7, var8);
            this.d = var7;
            Uq var197 = this.lU;
            Integer var201 = var6;
            int var24;
            if (var201 != null) {
                var24 = switch (var4) {
                    case -1112681087 -> {
                        var24 = var4 & -1474796937;
                        var24 += 1515597136;
                        var24 *= 25195387;
                        yield var24 ^ -790172467;
                    }
                    case -161728933 -> var4 ^ 1357764484;
                    default -> var4 ^ 780228358;
                };
                int var202 = var24 + 1;
                int var203 = var24 * var202;
                int var9 = var24 + 2;
                int var204 = var203 * var9;
                var9 = var24 + 3;
                int var205 = var204 * var9;
                int var206 = var205 & 7;
                if (var206 != 0) {
                    break label357;
                }

                var7 = var197.WM();
                int var207 = this.Mx;
                if (var207 <= 0) {
                    var24 = switch (var24) {
                        case -1893922205 -> var24 ^ -1956334656;
                        default -> var24 ^ 306850164;
                        case 1461650470 -> {
                            var24 &= -1636446023;
                            yield var24 ^ -303100698;
                        }
                    };
                    Integer var208 = var24;
                    if (var208 == null) {
                        break label357;
                    }

                    yF var209 = this.j;
                    long var248 = var6;
                    long var11 = var248 + 1L;
                    var11 = var248 * var11;
                    long var13 = var248 + 2L;
                    var11 *= var13;
                    long var249 = var248 + 3L;
                    var11 *= var249;
                    long var250 = var11 & 7L;
                    long var439;
                    var9 = (var439 = var250 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                    if (var9 == 0) {
                        var24 &= -1545623579;
                        var24 &= -1142093819;
                        var24 ^= -1341964988;
                        var9 = var24 + 1;
                        var9 = var24 * var9;
                        var9 &= 1;
                        if (var9 == 0) {
                            var209.S();
                            return;
                        }
                        break label357;
                    }

                    var24 -= 2034392503;
                    var24 ^= 1653058847;
                    var24 ^= 149706983;
                } else {
                    label397: {
                        var24 ^= 609559271;
                        var24 ^= 1990525843;
                        long var210 = var24;
                        long var10 = var210 + 1L;
                        var10 = var210 * var10;
                        long var12 = var210 + 2L;
                        var10 *= var12;
                        long var211 = var210 + 3L;
                        var10 *= var211;
                        long var212 = var10 & 7L;
                        long var440;
                        int var213 = (var440 = var212 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                        if (var213 != 0) {
                            break label357;
                        }

                        label363: {
                            if (var3) {
                                var24 &= -1787444750;
                                var24 += 1459127341;
                                var24 ^= 624936966;
                                long var214 = var24;
                                var10 = var214 + 1L;
                                var10 = var214 * var10;
                                long var215 = var10 & 1L;
                                long var441;
                                int var216 = (var441 = var215 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                                if (var216 != 0) {
                                    break label357;
                                }

                                int var217 = var2.width();
                                var9 = this.c;
                                Integer var323 = var6;
                                if (var323 == null) {
                                    var24 |= -925926607;
                                    var24 &= -457976758;
                                    var24 ^= -317323801;
                                    var24 -= 1197421067;
                                    var24 ^= 780813651;
                                    break label397;
                                }

                                var24 |= -39409672;
                                var24 *= -1842927783;
                                var24 ^= 1010255290;
                                var10 = var24;
                                var12 = var10 + 1L;
                                var12 = var10 * var12;
                                long var14 = var10 + 2L;
                                var12 *= var14;
                                var10 += 3L;
                                var12 *= var10;
                                var10 = var12 & 7L;
                                long var442;
                                int var327 = (var442 = var10 - 0L) == 0L ? 0 : (var442 < 0L ? -1 : 1);
                                if (var327 != 0) {
                                    break label357;
                                }

                                if (var217 == var9) {
                                    var24 &= -944619697;
                                    var24 &= 131925596;
                                    var24 ^= 883000664;
                                    int var218 = var2.height();
                                    long var256 = var6;
                                    long var371 = var256 + 1L;
                                    var371 = var256 * var371;
                                    long var257 = var371 & 1L;
                                    long var443;
                                    var9 = (var443 = var257 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                                    if (var9 != 0) {
                                        var24 >>= 7;
                                        var24 += 497708879;
                                        var24 ^= -154236754;
                                        break label397;
                                    }
                                    var24 = switch (var24) {
                                        default -> var24 ^ -1189591867;
                                        case -1218908488 -> var24 ^ -41446803;
                                        case 875660624 -> {
                                            var24 &= -738372701;
                                            yield var24 ^ 606093098;
                                        }
                                    };
                                    var9 = var24 + 1;
                                    var9 = var24 * var9;
                                    int var328 = var24 + 2;
                                    var9 *= var328;
                                    int var329 = var24 + 3;
                                    var9 *= var329;
                                    var9 &= 7;
                                    if (var9 != 0) {
                                        break label357;
                                    }

                                    var9 = this.i;
                                    if (var218 == var9) {
                                        switch (var24) {
                                            case -1259625945:
                                            default:
                                                var24 ^= 951027887;
                                                break label363;
                                            case 873545258:
                                                var24 += 1691024738;
                                                var24 ^= 280834166;
                                                var24 ^= -1602148670;
                                                break label363;
                                            case 1817327449:
                                                var24 ^= -1414935346;
                                                break label363;
                                        }
                                    }

                                    var24 += 1629624100;
                                    var24 ^= 1007535256;
                                } else {
                                    var24 &= -358803848;
                                    var24 += 1233633569;
                                    var24 |= 265705614;
                                    var24 ^= -689354727;
                                }
                            } else {
                                switch (var24) {
                                    case -1061126485:
                                        var24 ^= 100193977;
                                        break;
                                    case -849567169:
                                    default:
                                        var24 ^= -1019068985;
                                        break;
                                    case 99558738:
                                        var24 += 1031134578;
                                        var24 <<= 8;
                                        var24 ^= -868461098;
                                }
                            }

                            yF var219 = this.j;
                            var219.S();
                            int var220 = var2.width();
                            var9 = var6 + 1;
                            var9 = var6 * var9;
                            int var330 = var6 + 2;
                            var9 *= var330;
                            int var331 = var6 + 3;
                            var9 *= var331;
                            var9 &= 7;
                            if (var9 != 0) {
                                var24 *= -989362055;
                                var24 &= -1788960619;
                                var24 *= 840414677;
                                var24 += -724938021;
                                var24 ^= -326242088;
                                break label397;
                            }

                            var24 -= 1065602648;
                            var24 ^= -1722326608;
                            Integer var270 = var24;
                            if (var270 == null) {
                                break label357;
                            }

                            this.c = var220;
                            int var221 = var2.height();
                            this.i = var221;
                            var24 += -1314960957;
                            var24 ^= -1972584023;
                        }

                        long var222 = var24;
                        var10 = var222 + 1L;
                        var10 = var222 * var10;
                        long var223 = var10 & 1L;
                        long var444;
                        int var224 = (var444 = var223 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                        if (var224 != 0) {
                            break label357;
                        }

                        yF var225 = this.j;
                        Integer var271 = var6;
                        label330:
                        if (var271 != null) {
                            var24 = switch (var24) {
                                default -> var24 ^ -17467575;
                                case 685780280 -> {
                                    var24 ^= -1361782348;
                                    var24 += 1314827194;
                                    var24 *= -1746188815;
                                    yield var24 ^ 1545743802;
                                }
                                case 1857516857 -> var24 ^ -1766823132;
                            };
                            var271 = var24;
                            if (var271 == null) {
                                break label357;
                            }

                            float var273 = this.d;
                            int var334 = this.Mx;
                            int var274 = yF.zl(var7, var273, var334);
                            boolean var226 = var225.Eb(var274);
                            int var227 = var2.width();
                            var274 = var2.height();
                            yF var335 = this.j;
                            int var336 = var335.t();
                            boolean var228 = var1.ensureFrameHistory(var227, var274, var336);
                            if (var228) {
                                var24 = switch (var24) {
                                    case 256676444 -> {
                                        var24 += 1665472693;
                                        var24 |= -1714832458;
                                        var24 >>= 22;
                                        var24 >>= 17;
                                        yield var24 ^ -347714385;
                                    }
                                    default -> var24 ^ 1132705212;
                                    case 1087198523 -> var24 ^ -358880906;
                                };
                                Integer var229 = var24;
                                if (var229 == null) {
                                    break label357;
                                }

                                yF var230 = this.j;
                                long var276 = var6;
                                long var373 = var276 + 1L;
                                var373 = var276 * var373;
                                long var277 = var373 & 1L;
                                long var445;
                                var274 = (var445 = var277 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                if (var274 != 0) {
                                    switch (var24) {
                                        case -1498456580:
                                            var24 ^= 1692441874;
                                            break label330;
                                        case -978827891:
                                        default:
                                            var24 ^= 44714967;
                                            break label330;
                                        case 347714384:
                                            var24 -= -1795758179;
                                            var24 &= -2097007506;
                                            var24 -= -117202776;
                                            var24 ^= -517864051;
                                            break label330;
                                    }
                                }
                                var24 = switch (var24) {
                                    default -> var24 ^ -86479514;
                                    case 347714384 -> {
                                        var24 *= -1651819611;
                                        yield var24 ^ -1068229281;
                                    }
                                    case 795080020 -> var24 ^ 1442389407;
                                };
                                long var279 = var24;
                                var373 = var279 + 1L;
                                var373 = var279 * var373;
                                long var422 = var279 + 2L;
                                var373 *= var422;
                                long var280 = var279 + 3L;
                                var373 *= var280;
                                long var281 = var373 & 7L;
                                long var446;
                                var274 = (var446 = var281 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                if (var274 != 0) {
                                    break label357;
                                }

                                var230.S();
                                switch (var24) {
                                    case 730134865:
                                        var24 ^= -1497846050;
                                        break;
                                    case 1210683945:
                                    default:
                                        var24 ^= -867297996;
                                        break;
                                    case 1411391439:
                                        var24 *= -328444521;
                                        var24 ^= -989729634;
                                }
                            } else {
                                var24 -= -280333630;
                                var24 *= 1246721581;
                                var24 ^= 1376074846;
                                var24 &= 188241362;
                                var24 ^= 1156024007;
                            }

                            int var231 = var24 + 1;
                            int var232 = var24 * var231;
                            int var233 = var232 & 1;
                            if (var233 != 0) {
                                break label357;
                            }

                            this.H = true;
                            long var234 = System.nanoTime();
                            var10 = this.e;
                            long var235 = var234 - var10;
                            double var236 = var235;
                            Integer var338 = var6;
                            if (var338 != null) {
                                var24 &= -1397758119;
                                var24 &= -1817921343;
                                var24 ^= -1845860888;
                                var24 *= 1175803941;
                                var24 ^= -1292139260;
                                double var237 = var236 * 1.0E-9;
                                var237++;
                                yF var339 = this.j;
                                int var340 = var339.yA(var237);
                                var1.storeFrame(var2, var340);
                                yF var341 = this.j;
                                int var379 = this.Mx;
                                float var409 = this.d;
                                int var199 = var341.q(var237, var379, var409, 12, var7);
                                int var200 = var199;
                                if (var199 <= 1) {
                                    switch (var24) {
                                        case -1970808919:
                                            var24 *= -1706399103;
                                            var24 ^= -1374763837;
                                            var24 |= 924971034;
                                            var24 ^= -1671830230;
                                            break;
                                        case 1503490101:
                                            var24 ^= -55263871;
                                            break;
                                        case 1939925894:
                                        default:
                                            var24 ^= 738092502;
                                    }

                                    return;
                                }

                                var24 &= 1567293054;
                                var24 ^= -1418688864;
                                int var239 = var24 + 1;
                                int var240 = var24 * var239;
                                var274 = var24 + 2;
                                int var241 = var240 * var274;
                                var274 = var24 + 3;
                                int var242 = var241 * var274;
                                int var243 = var242 & 7;
                                if (var243 != 0) {
                                    break label357;
                                }

                                byte var244 = 0;
                                long var285 = var6;
                                long var380 = var285 + 1L;
                                long var381 = var285 * var380;
                                long var286 = var381 & 1L;
                                long var447;
                                var274 = (var447 = var286 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                if (var274 == 0) {
                                    var24 -= -2091695041;
                                    var24 |= 980690328;
                                    var24 ^= -568919975;
                                    var24 += -1579075804;
                                    var24 ^= -1446482532;
                                    Integer var288 = var24;
                                    if (var288 == null) {
                                        break label357;
                                    }

                                    int var245 = var244;
                                    var24 &= -582075450;
                                    var24 ^= 809735366;

                                    label317:
                                    while (true) {
                                        var288 = var24;
                                        if (var288 == null) {
                                            break label357;
                                        }

                                        float[] var290 = this.JH;
                                        var10 = var6;
                                        var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        long var435 = var10 + 2L;
                                        var12 *= var435;
                                        var10 += 3L;
                                        var12 *= var10;
                                        var10 = var12 & 7L;
                                        long var448;
                                        int var345 = (var448 = var10 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                        if (var345 != 0) {
                                            var24 >>>= 21;
                                            var24 -= 450162773;
                                            var24 *= -684237361;
                                            var24 |= 851866509;
                                            var24 ^= 388178184;
                                            break;
                                        }

                                        var24 += -1718429099;
                                        var24 *= -421041421;
                                        var24 >>= 7;
                                        var24 ^= 1272545310;
                                        var10 = var24;
                                        var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        var435 = var10 + 2L;
                                        var12 *= var435;
                                        var10 += 3L;
                                        var12 *= var10;
                                        var10 = var12 & 7L;
                                        long var449;
                                        int var349 = (var449 = var10 - 0L) == 0L ? 0 : (var449 < 0L ? -1 : 1);
                                        if (var349 != 0) {
                                            break label357;
                                        }

                                        int var291 = var290.length;
                                        if (var245 >= var291) {
                                            var24 >>= 20;
                                            var24 ^= 699419448;
                                            var24 ^= -1152214573;
                                            float[] var246 = this.JH;
                                            var291 = var6 + 1;
                                            var291 = var6 * var291;
                                            var6 = var291 & 1;
                                            if (var6 == 0) {
                                                Integer var194 = switch (var24) {
                                                    case -1830627759 -> {
                                                        var24 <<= 25;
                                                        var24 &= 502575766;
                                                        yield var24 ^ -89977643;
                                                    }
                                                    default -> var24 ^ 1801720398;
                                                    case 411003879 -> var24 ^ -1692324209;
                                                };
                                                if (var194 != null) {
                                                    float[] var195 = this.g;
                                                    yF var316 = this.j;
                                                    float var317 = var316.z();
                                                    var1.blendFrames(var2, var246, var195, var200, var317);
                                                    return;
                                                }
                                                break label357;
                                            }

                                            switch (var24) {
                                                case -1830627759:
                                                    var24 &= 589113615;
                                                    var24 ^= -354657546;
                                                    break label317;
                                                case 3662314:
                                                default:
                                                    var24 ^= -1822206649;
                                                    break label317;
                                                case 444832317:
                                                    var24 ^= 1620676533;
                                                    break label317;
                                            }
                                        }

                                        var24 ^= -818200284;
                                        var24 += 1543581068;
                                        var24 ^= -980450715;
                                        var291 = var24 + 1;
                                        var291 = var24 * var291;
                                        int var350 = var24 + 2;
                                        var291 *= var350;
                                        int var351 = var24 + 3;
                                        var291 *= var351;
                                        var291 &= 7;
                                        if (var291 != 0) {
                                            break label357;
                                        }

                                        float[] var297 = this.JH;
                                        int var352 = var6 + 1;
                                        int var353 = var6 * var352;
                                        int var354 = var353 & 1;
                                        if (var354 != 0) {
                                            var24 ^= -657703678;
                                            var24 *= -46540143;
                                            var24 ^= 1723478673;
                                            break;
                                        }
                                        var24 = switch (var24) {
                                            default -> var24 ^ 518063773;
                                            case 622658564 -> {
                                                var24 *= -1756129865;
                                                var24 += 1951733734;
                                                yield var24 ^ -1893973646;
                                            }
                                            case 1441565502 -> var24 ^ 1411207815;
                                        };
                                        float var362;
                                        if (var245 < var200) {
                                            var24 |= 852441154;
                                            var24 ^= -1170574720;
                                            var24 ^= 1395833792;
                                            var10 = var24;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var435 = var10 + 2L;
                                            var12 *= var435;
                                            var10 += 3L;
                                            var12 *= var10;
                                            var10 = var12 & 7L;
                                            long var450;
                                            int var358 = (var450 = var10 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                                            if (var358 != 0) {
                                                break label357;
                                            }

                                            yF var359 = this.j;
                                            Integer var382 = var6;
                                            if (var382 == null) {
                                                var24 += -104750684;
                                                var24 |= 80476414;
                                                var24 >>>= 18;
                                                var24 ^= -388207155;
                                                break;
                                            }

                                            var24 >>= 7;
                                            var24 ^= -1726171821;
                                            int var360 = var359.Rc(var245);
                                            float var361 = var360;
                                            var362 = var361;
                                            var24 -= -1941302394;
                                            var24 ^= -324836714;
                                        } else {
                                            var24 <<= 7;
                                            var24 += -2019375821;
                                            var24 ^= -1740586183;
                                            var24 ^= -968847727;
                                            long var383 = var24;
                                            long var423 = var383 + 1L;
                                            var423 = var383 * var423;
                                            long var15 = var383 + 2L;
                                            var423 *= var15;
                                            long var384 = var383 + 3L;
                                            var423 *= var384;
                                            long var385 = var423 & 7L;
                                            long var451;
                                            var379 = (var451 = var385 - 0L) == 0L ? 0 : (var451 < 0L ? -1 : 1);
                                            if (var379 != 0) {
                                                break label357;
                                            }

                                            var362 = 0.0F;
                                            switch (var24) {
                                                case -1536545632:
                                                    var24 ^= -1673691183;
                                                    break;
                                                case -1467629414:
                                                default:
                                                    var24 ^= 969163272;
                                                    break;
                                                case 36229275:
                                                    var24 *= 2113160721;
                                                    var24 ^= 2102567931;
                                                    var24 ^= -1680172522;
                                            }
                                        }

                                        long var387 = var24;
                                        long var427 = var387 + 1L;
                                        var427 = var387 * var427;
                                        long var388 = var427 & 1L;
                                        long var452;
                                        var379 = (var452 = var388 - 0L) == 0L ? 0 : (var452 < 0L ? -1 : 1);
                                        if (var379 != 0) {
                                            break label357;
                                        }

                                        var297[var245] = var362;
                                        Integer var298 = var6;
                                        if (var298 == null) {
                                            switch (var24) {
                                                case -423436415:
                                                    var24 ^= -2034057317;
                                                    break label317;
                                                case 921961894:
                                                    var24 += -1235786149;
                                                    var24 -= 1585464692;
                                                    var24 ^= 1712815226;
                                                    break label317;
                                                case 1864641577:
                                                default:
                                                    var24 ^= 1432496602;
                                                    break label317;
                                            }
                                        }

                                        var24 += -1116387665;
                                        var24 <<= 31;
                                        var24 >>= 25;
                                        var24 *= -385304557;
                                        var24 ^= 919724641;
                                        long var299 = var24;
                                        long var390 = var299 + 1L;
                                        long var391 = var299 * var390;
                                        var427 = var299 + 2L;
                                        long var392 = var391 * var427;
                                        long var300 = var299 + 3L;
                                        long var393 = var392 * var300;
                                        long var301 = var393 & 7L;
                                        long var453;
                                        int var302 = (var453 = var301 - 0L) == 0L ? 0 : (var453 < 0L ? -1 : 1);
                                        if (var302 != 0) {
                                            break label357;
                                        }

                                        float[] var303 = this.g;
                                        float var365;
                                        if (var245 < var200) {
                                            var24 |= 544292380;
                                            var24 += 798272021;
                                            var24 += -563423354;
                                            var24 <<= 7;
                                            var24 ^= -130868181;
                                            yF var363 = this.j;
                                            long var394 = var6;
                                            var427 = var394 + 1L;
                                            var427 = var394 * var427;
                                            long var438 = var394 + 2L;
                                            var427 *= var438;
                                            long var395 = var394 + 3L;
                                            var427 *= var395;
                                            long var396 = var427 & 7L;
                                            long var454;
                                            var379 = (var454 = var396 - 0L) == 0L ? 0 : (var454 < 0L ? -1 : 1);
                                            if (var379 != 0) {
                                                switch (var24) {
                                                    case -1472842579:
                                                    default:
                                                        var24 ^= 1019291814;
                                                        break label317;
                                                    case -157556459:
                                                        var24 ^= 1420536812;
                                                        break label317;
                                                    case 1079210027:
                                                        var24 ^= 306586201;
                                                        var24 += 700044963;
                                                        var24 &= 306240703;
                                                        var24 >>>= 23;
                                                        var24 ^= -388212013;
                                                        break label317;
                                                }
                                            }

                                            var24 += -893064787;
                                            var24 -= -864614153;
                                            var24 += -960164171;
                                            var24 ^= 568758472;
                                            float var364 = var363.Q(var245);
                                            var365 = var364;
                                            var24 |= -635786323;
                                            var24 ^= -854356872;
                                        } else {
                                            var24 += 1885353013;
                                            var24 &= 284023541;
                                            var24 ^= 1718002699;
                                            var365 = 0.0F;
                                            var24 >>>= 10;
                                            var24 -= -118170023;
                                            var24 *= 947610447;
                                            var24 ^= -280612167;
                                        }

                                        var379 = var24 + 1;
                                        var379 = var24 * var379;
                                        var379 &= 1;
                                        if (var379 != 0) {
                                            break label357;
                                        }

                                        var303[var245] = var365;
                                        var302 = var6 + 1;
                                        var302 = var6 * var302;
                                        int var366 = var6 + 2;
                                        var302 *= var366;
                                        int var367 = var6 + 3;
                                        var302 *= var367;
                                        var302 &= 7;
                                        if (var302 != 0) {
                                            switch (var24) {
                                                case -1164547790:
                                                default:
                                                    var24 ^= -1324931004;
                                                    break label317;
                                                case -536709783:
                                                    var24 ^= 1062686204;
                                                    break label317;
                                                case 864641927:
                                                    var24 |= 1962269446;
                                                    var24 += -844522145;
                                                    var24 -= 549830253;
                                                    var24 ^= -868384626;
                                                    break label317;
                                            }
                                        }

                                        var24 &= -1845363920;
                                        var24 += 1319070875;
                                        var24 &= 1712849780;
                                        var24 ^= -900862266;
                                        long var309 = var24;
                                        long var401 = var309 + 1L;
                                        long var402 = var309 * var401;
                                        var427 = var309 + 2L;
                                        long var403 = var402 * var427;
                                        long var310 = var309 + 3L;
                                        long var404 = var403 * var310;
                                        long var311 = var404 & 7L;
                                        long var455;
                                        var302 = (var455 = var311 - 0L) == 0L ? 0 : (var455 < 0L ? -1 : 1);
                                        if (var302 != 0) {
                                            break label357;
                                        }

                                        var302 = var245 + 1;
                                        var245 = var302;
                                        var24 += -736961983;
                                        var24 -= 507743104;
                                        var24 |= 2122197235;
                                        var24 >>>= 9;
                                        var24 ^= 1031703128;
                                    }
                                } else {
                                    var24 *= 1040013471;
                                    var24 ^= -1991800167;
                                    var24 ^= -1349708778;
                                }
                            } else {
                                var24 <<= 2;
                                var24 ^= -545124117;
                            }
                        } else {
                            var24 *= -1539557615;
                            var24 >>>= 6;
                            var24 += 719695549;
                            var24 ^= -997143512;
                        }
                    }
                }
            } else {
                var24 = var4 | 1785610471;
                var24 &= -304547651;
                var24 ^= 85232210;
            }

            Integer var190 = var24;
            if (var190 != null) {
                IllegalStateException var192 = new IllegalStateException();
                throw var192;
            }
        }

        UnsupportedOperationException var191 = new UnsupportedOperationException();
        throw var191;
    }

    private void r(AuraRenderer var1, RenderTarget var2, boolean var3, boolean var4, int var5) {
        label46: {
            int var7 = System.identityHashCode(this);
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var55;
            int var47 = (var55 = var8 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
            int var27;
            if (var47 == 0) {
                var27 = switch (var5) {
                    case -1231560120 -> var5 ^ 761659670;
                    case -1016311942 -> {
                        var27 = var5 | 1606725798;
                        var27 |= 1084359859;
                        yield var27 ^ -1309084337;
                    }
                    default -> var5 ^ -1064869589;
                };
                Integer var48 = var27;
                if (var48 == null) {
                    break label46;
                }

                if (!var3) {
                    var27 ^= -711169405;
                    var27 ^= 1587299479;
                    var1.restartAccumulation();
                    var27 ^= -1740720804;
                    var27 *= 229381131;
                    var27 += 1798433007;
                    var27 -= -1896303720;
                    var27 ^= 1671882887;
                } else {
                    switch (var27) {
                        case -1449659806:
                        default:
                            var27 ^= 458485513;
                            break;
                        case 685241163:
                            var27 ^= -938328750;
                            break;
                        case 1846938288:
                            var27 ^= -622897561;
                            var27 >>= 6;
                            var27 ^= -1886710005;
                    }
                }

                Integer var49 = var27;
                if (var49 == null) {
                    break label46;
                }

                this.Sp = true;
                Uq var50 = this.lU;
                Integer var38 = var7;
                if (var38 != null) {
                    var27 |= 2050348097;
                    var27 &= 2078483949;
                    var27 ^= -1084638529;
                    float var39 = var50.WM();
                    float var40 = cr.l(var39, var4);
                    var1.accumulate(var2, var40, var4);
                    return;
                }

                var27 ^= -1780138792;
                var27 <<= 4;
                var27 ^= -399993877;
            } else {
                var27 = var5 + -244497734;
                var27 |= -1303914075;
                var27 |= -1389763902;
                var27 ^= 470254108;
            }

            var7 = var27 + 1;
            var7 = var27 * var7;
            int var51 = var27 + 2;
            var7 *= var51;
            var27 += 3;
            var7 *= var27;
            var27 = var7 & 7;
            if (var27 == 0) {
                IllegalStateException var37 = new IllegalStateException();
                throw var37;
            }
        }

        AssertionError var36 = new AssertionError();
        throw var36;
    }

    @Override
    protected void J() {
        int var1 = U;
        var1 ^= 2012333957;
        int var2 = System.identityHashCode(this);
        Ud var3 = Ud.Z();
        AuraRenderer var26 = var3.ZP();
        Integer var21 = var2;
        if (var21 != null) {
            var1 = switch (var1) {
                case -1158796806 -> {
                    var1 += -1992581349;
                    var1 ^= -1542990033;
                    var1 += 777285790;
                    yield var1 ^ 1254437170;
                }
                default -> var1 ^ -1463953425;
                case 382044525 -> var1 ^ -472694224;
            };
            int var22 = var1 + 1;
            var22 = var1 * var22;
            var22 &= 1;
            if (var22 == 0) {
                var26.releaseMotionBuffers(true, true);
                this.Sp = false;
                this.H = false;
                this.K = false;
                this.oh = true;
                this.JQ = true;
                this.Zm = 0L;
                this.d = 0.0F;
                yF var25 = this.j;
                var25.S();
                this.B = Long.MIN_VALUE;
                this.n = null;
                return;
            }
        } else {
            long var15 = switch (var1) {
                case -1158796806 -> {
                    var1 >>= 1;
                    var1 -= 1785473476;
                    yield var1 ^ 1569053713;
                }
                default -> var1 ^ -830086336;
                case -23540019 -> var1 ^ -258125830;
            };
            long var27 = var15 + 1L;
            long var28 = var15 * var27;
            long var5 = var15 + 2L;
            long var29 = var28 * var5;
            long var16 = var15 + 3L;
            long var30 = var29 * var16;
            long var17 = var30 & 7L;
            long var31;
            var1 = (var31 = var17 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -546780845;
        int var2 = Yn.C;
        int var4 = of_2.kj(var3, var1, var2);
        U = var4;
    }
}
